package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;


import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GPopUpMenu extends AbstractSupportCodeObject {
	

	public GPopUpMenu(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_POP_UP_MENU
	/*
	PACKAGE G$_POP_UP_MENU IS
--
  PROCEDURE POPULATE_POPUP_MENU;
  PROCEDURE CLEAR_POPUP_MENU;
END G$_POP_UP_MENU;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_POP_UP_MENU
		/*
		PACKAGE BODY G$_POP_UP_MENU IS
--
  OPTM_STR CONSTANT VARCHAR2(17):= 'OPTIONS.SUB_MENU_';
  POPM_STR CONSTANT VARCHAR2(23):= 'G$_DEFAULT_PM.SUB_MENU_';
--
  PROCEDURE POPULATE_POPUP_MENU IS
    mi_id           MENUITEM;
    opt_item_name   VARCHAR2(100);
    pop_item_name   VARCHAR2(100);
--
  FUNCTION isEmptyLabel ( label varchar2 ) RETURN BOOLEAN IS
  BEGIN
  	IF label IN ('1','2','3','4','5','6','7','8','9','10','11','12','13','14','15',
  		           '16','17','18','19','20','21','22','23','24') THEN
      RETURN TRUE;
  	END IF;
--
		RETURN FALSE;
  END isEmptyLabel;
--
--
  BEGIN
	  FOR x IN 1..24 LOOP
      opt_item_name := OPTM_STR || LPAD(TO_CHAR( x ),2,'0');
      pop_item_name := POPM_STR || LPAD(TO_CHAR( x ),2,'0');
--
      IF NOT ID_NULL( FIND_MENU_ITEM ( opt_item_name ) ) THEN
        IF NOT ID_NULL( FIND_MENU_ITEM ( pop_item_name ) ) THEN      	
--
          IF GET_MENU_ITEM_PROPERTY( opt_item_name, LABEL ) IS NOT NULL THEN
            SET_MENU_ITEM_PROPERTY( pop_item_name, LABEL, GET_MENU_ITEM_PROPERTY( opt_item_name, LABEL ) );
          ELSE
            SET_MENU_ITEM_PROPERTY( pop_item_name, VISIBLE, PROPERTY_FALSE );
            SET_MENU_ITEM_PROPERTY( pop_item_name, ENABLED, PROPERTY_FALSE );        	
          END IF;
--
          IF GET_MENU_ITEM_PROPERTY( opt_item_name, VISIBLE ) = 'TRUE'  THEN
            SET_MENU_ITEM_PROPERTY( pop_item_name, VISIBLE, PROPERTY_TRUE );
          ELSE
            SET_MENU_ITEM_PROPERTY( pop_item_name, VISIBLE, PROPERTY_FALSE );
          END IF;
--
          IF GET_MENU_ITEM_PROPERTY( opt_item_name, ENABLED ) = 'TRUE' THEN
            SET_MENU_ITEM_PROPERTY( pop_item_name, ENABLED, PROPERTY_TRUE );
          ELSE
            SET_MENU_ITEM_PROPERTY( pop_item_name, ENABLED, PROPERTY_FALSE );
          END IF;
--
          IF isEmptyLabel( GET_MENU_ITEM_PROPERTY( opt_item_name, LABEL ) )THEN
           	SET_MENU_ITEM_PROPERTY( pop_item_name, VISIBLE, PROPERTY_FALSE );
          	SET_MENU_ITEM_PROPERTY( pop_item_name, ENABLED, PROPERTY_FALSE );
          END IF;        
        END IF;
      END IF;
--
    END LOOP;
  END POPULATE_POPUP_MENU;
--
--
  PROCEDURE CLEAR_POPUP_MENU IS
    mi_id           MENUITEM; 
    opt_item_name   VARCHAR2(100);
    pop_item_name   VARCHAR2(100);  
  BEGIN
    FOR x IN 1..24 LOOP
      opt_item_name := OPTM_STR || LPAD(TO_CHAR( x ),2,'0');
      pop_item_name := POPM_STR || LPAD(TO_CHAR( x ),2,'0');
--
      IF NOT ID_NULL( FIND_MENU_ITEM ( opt_item_name ) ) THEN
        IF NOT ID_NULL( FIND_MENU_ITEM ( pop_item_name ) ) THEN
--
          SET_MENU_ITEM_PROPERTY( pop_item_name, ENABLED, PROPERTY_FALSE );
          SET_MENU_ITEM_PROPERTY( pop_item_name, VISIBLE, PROPERTY_FALSE );
--
        END IF;
      END IF;
--
    END LOOP;
  END CLEAR_POPUP_MENU;
--
END G$_POP_UP_MENU;
		*/
				// 
		public final NString OPTM_STR = toStr("OPTIONS.SUB_MENU_");
		public final NString POPM_STR = toStr("G$_DEFAULT_PM.SUB_MENU_");
/* <p>
		* 
/* </p>
		*/
		public void populatePopupMenu()
		{
			//MORPHIS TODO Review - No Popup Menus in this application
//			MenuItemDescriptor miId= null;
//			NString optItemName= NString.getNull();
//			NString popItemName= NString.getNull();
//			for ( int x = 1; x <= 24; x++ )
//			{
//				optItemName = OPTM_STR.append(lpad(toChar(x), 2, "0"));
//				popItemName = POPM_STR.append(lpad(toChar(x), 2, "0"));
//				// 
//				if ( !(SupportClasses.FORMS40.FindMenuItem(optItemName) == null) )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					if ( !(SupportClasses.FORMS40.FindMenuItem(popItemName) == null) )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						// 
//						if ( !SupportClasses.FORMS40.GetMenuItemProperty(optItemName, SupportClasses.Property.LABEL).isNull() )
//						{
//							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//							// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin32".
//							//							SupportClasses.FORMS40.SetMenuItemProperty(popItemName, SupportClasses.Property.LABEL, SupportClasses.FORMS40.GetMenuItemProperty(optItemName, SupportClasses.Property.LABEL));
//							this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin32'.");
//							
//							
//						}
//						else {
//							setMenuItemVisible(popItemName, false);
//							setMenuItemEnabled(popItemName, false);
//						}
//						// 
//						if ( getMenuItemVisible(optItemName) )
//						{
//							setMenuItemVisible(popItemName, true);
//						}
//						else {
//							setMenuItemVisible(popItemName, false);
//						}
//						// 
//						if ( getMenuItemEnabled(optItemName) )
//						{
//							setMenuItemEnabled(popItemName, true);
//						}
//						else {
//							setMenuItemEnabled(popItemName, false);
//						}
//						// 
//						if ( PopulatePopupMenu_isemptylabel_Local(SupportClasses.FORMS40.GetMenuItemProperty(optItemName, SupportClasses.Property.LABEL)).getValue() )
//						{
//							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//							setMenuItemVisible(popItemName, false);
//							setMenuItemEnabled(popItemName, false);
//						}
//					}
//				}
//			}
		}
/* <p>
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param label
		*/
		public NBool PopulatePopupMenu_isemptylabel_Local(NString label)
		{
			if ( in(label, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24").getValue() )
			{
				return  toBool(NBool.True);
			}
			// 
			return  toBool(NBool.False);
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void clearPopupMenu()
		{
			//MORPHIS: Menu logic 
//			MenuItemDescriptor miId= null;
//			NString optItemName= NString.getNull();
//			NString popItemName= NString.getNull();
//			for ( int x = 1; x <= 24; x++ )
//			{
//				optItemName = OPTM_STR.append(lpad(toChar(x), 2, "0"));
//				popItemName = POPM_STR.append(lpad(toChar(x), 2, "0"));
//				// 
//				if ( !(SupportClasses.FORMS40.FindMenuItem(optItemName) == null) )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					if ( !(SupportClasses.FORMS40.FindMenuItem(popItemName) == null) )
//					{
//						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//						// 
//						setMenuItemEnabled(popItemName, false);
//						setMenuItemVisible(popItemName, false);
//					}
//				}
//			}
		}
		
	
	
}
