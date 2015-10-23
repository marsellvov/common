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

public class GLastTen extends AbstractSupportCodeObject {
	

	public GLastTen(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_LAST_TEN
	/*
	PACKAGE G$_LAST_TEN IS
  PROCEDURE LAST_10_UPDATE (FORM_NAME IN VARCHAR2);
  PROCEDURE SET_LAST_TEN;
  PROCEDURE LAST_10_EXECUTE (WHICH_NUMBER IN VARCHAR2);
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_LAST_TEN
		/*
		PACKAGE BODY G$_LAST_TEN IS
--
  PROCEDURE LAST_10_UPDATE (FORM_NAME IN VARCHAR2) IS
    DUP_NO NUMBER := -1;
  BEGIN
    IF NAME_IN('SYSTEM.CURRENT_FORM') = 'GUAINIT' THEN
      RETURN;
    END IF;
--
-- If the form has a Q in the third position (7 char name) or in the
-- fourth position (8 char name) OR if the called form is not one of 
-- the utility forms, do not add.
--
    IF SUBSTR(FORM_NAME, NVL(LENGTH(FORM_NAME), 0) - 4, 1) = 'Q' OR
       FORM_NAME IN ('GUIOBJS','GUAPARM','GUAQFLW','GUQINTF','GUACLGO','GUAERRM') THEN
      NULL;
    ELSE
--
-- Check if name is already in list.
--
      FOR I IN 1..10 LOOP
        DUP_NO := I;
        IF NAME_IN('GLOBAL.LAST10_' || TO_CHAR(I)) = FORM_NAME THEN
          EXIT;
        END IF;
      END LOOP;
--
-- If the only form on the list is the same one executed.
--
      IF DUP_NO = 1 THEN
        RETURN;
--
-- Shift them all upto the duplicated one if it is set.
--
      ELSE
        FOR I IN REVERSE 1..(DUP_NO - 1) LOOP
          COPY(NAME_IN('GLOBAL.LAST10_' || TO_CHAR(I)),'GLOBAL.LAST10_' || TO_CHAR(I + 1));
        END LOOP;
      END IF;
--
-- Move the current form to the first slot.
--
      COPY(FORM_NAME,'GLOBAL.LAST10_1');
    END IF;
--
    G$_LAST_TEN.SET_LAST_TEN;
  END;
---
-----------------
---
  PROCEDURE SET_LAST_TEN IS
    CUSTOM_OBJ_NAME  VARCHAR2(30);
    CUSTOM_DESC      VARCHAR2(80);
    CUSTOM_NO        NUMBER := 0;
--
    CURSOR OBJ_DESC IS
      SELECT GUBOBJS_DESC
        FROM GUBOBJS
       WHERE GUBOBJS_OBJT_CODE = 'FORM'
         AND GUBOBJS_NAME = CUSTOM_OBJ_NAME;
  BEGIN
--
--  Initially DISABLE the Last 10 Selections until there are 
--  entries to display.
--
    FOR I IN 1..10 LOOP
      SET_MENU_ITEM_PROPERTY('ACTION.LAST10_'||TO_CHAR(I),DISPLAYED,PROPERTY_FALSE);
    END LOOP;
--
--  Don't display any selection that does not contain a name.
--
    FOR I IN 1..10 LOOP
      IF NAME_IN('global.last10_'||to_char(I)) IS NOT NULL THEN
        CUSTOM_OBJ_NAME := NAME_IN(':GLOBAL.LAST10_'||to_char(I));
        CUSTOM_NO := I;
--
        OPEN OBJ_DESC;
        FETCH OBJ_DESC INTO CUSTOM_DESC;
        CLOSE OBJ_DESC;
--
        SET_MENU_ITEM_PROPERTY('ACTION.LAST10_'||TO_CHAR(I),DISPLAYED,PROPERTY_TRUE);
        SET_MENU_ITEM_PROPERTY('ACTION.LAST10_'||TO_CHAR(I),LABEL,TO_CHAR(I) || '. ' 
                              || NAME_IN(':GLOBAL.LAST10_'||TO_CHAR(I))||' '||CUSTOM_DESC); 
      END IF; 
    END LOOP;
--
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      SET_MENU_ITEM_PROPERTY('ACTION.LAST10_'||TO_CHAR(CUSTOM_NO),DISPLAYED,PROPERTY_FALSE);
    WHEN OTHERS THEN
      NULL;
  END;
---
-----------------
---
  PROCEDURE LAST_10_EXECUTE (WHICH_NUMBER IN VARCHAR2) IS
  BEGIN
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    IF NAME_IN('SYSTEM.CURRENT_FORM') <> 'GUAGMNU' THEN
      COPY('Y','GLOBAL.LAST_TEN_CALL');
    END IF;
    G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),
                         NAME_IN(':GLOBAL.LAST10_' || WHICH_NUMBER),'');
    COPY('N','GLOBAL.LAST_TEN_CALL');
  END;
--
END;
		*/
		/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param formName
		*/
		public void last10Update(NString formName)
		{
			NNumber dupNo = toNumber(-1);
			if ( getCurrentTaskName().equals("GUAINIT") )
			{
				return ;
			}
			// 
			//  If the form has a Q in the third position (7 char name) or in the
			//  fourth position (8 char name) OR if the called form is not one of 
			//  the utility forms, do not add.
			// 
			if ( substring(formName, isNull(length(formName), 0).subtract(4), toInt(1)).equals("Q") || in(formName, "GUIOBJS", "GUAPARM", "GUAQFLW", "GUQINTF", "GUACLGO", "GUAERRM").getValue() )
			{
			}
			else {
				// 
				//  Check if name is already in list.
				// 
				for ( int i = 1; i <= 10; i++ )
				{
					dupNo = toNumber(i);
					if ( getNameIn(toStr("GLOBAL.LAST10_").append(toChar(i))).equals(formName) )
					{
							break;
					}
				}
				// 
				//  If the only form on the list is the same one executed.
				// 
				if ( dupNo.equals(1) )
				{
					return ;
				}
				else {
					for ( int i = dupNo.subtract(1).toInt32(); i >= 1; i-- )
					{
						copy(getNameIn(toStr("GLOBAL.LAST10_").append(toChar(i))),toStr("GLOBAL.LAST10_").append(toChar(i + 1)));
					}
				}
				// 
				//  Move the current form to the first slot.
				// 
				copy(formName,"GLOBAL.LAST10_1");
			}
			// 
			setLastTen();
		}
/* <p>
		* -
		* ---------------
		* -
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setLastTen()
		{
			int rowCount = 0;
			NString customObjName= NString.getNull();
			NString customDesc= NString.getNull();
			NNumber customNo = toNumber(0);
			String sqlobjDesc = "SELECT GUBOBJS_DESC " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_OBJT_CODE = 'FORM' AND GUBOBJS_NAME = :P_CUSTOM_OBJ_NAME ";
			DataCursor objDesc = new DataCursor(sqlobjDesc);
			try {
				try
				{
					// 
					//   Initially DISABLE the Last 10 Selections until there are 
					//   entries to display.
					// 
					for ( int i = 1; i <= 10; i++ )
					{
						// F2J_NOT_SUPPORTED : The property "MENU_ITEM's DISPLAYED" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
						//						SupportClasses.FORMS40.SetMenuItemProperty(toStr("ACTION.LAST10_").append(toChar(i)), SupportClasses.Property.DISPLAYED, false);
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's DISPLAYED' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
						
						
					}
					// 
					//   Don't display any selection that does not contain a name.
					// 
					for ( int i = 1; i <= 10; i++ )
					{
						if ( !getNameIn(toStr("global.last10_").append(toChar(i))).isNull() )
						{
							customObjName = getNameIn(toStr(":GLOBAL.LAST10_").append(toChar(i)));
							customNo = toNumber(i);
							// 
							//Setting query parameters
							objDesc.addParameter("P_CUSTOM_OBJ_NAME", customObjName);
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable objDesc.
							objDesc.open();
							ResultSet objDescResults = objDesc.fetchInto();
							if ( objDescResults != null ) {
								customDesc = objDescResults.getStr(0);
							}
							objDesc.close();
							// 
							// F2J_NOT_SUPPORTED : The property "MENU_ITEM's DISPLAYED" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
							//							SupportClasses.FORMS40.SetMenuItemProperty(toStr("ACTION.LAST10_").append(toChar(i)), SupportClasses.Property.DISPLAYED, true);
							this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's DISPLAYED' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
							
							
							// F2J_NOT_SUPPORTED : The property "MENU_ITEM's LABEL" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
							//							SupportClasses.FORMS40.SetMenuItemProperty(toStr("ACTION.LAST10_").append(toChar(i)), SupportClasses.Property.LABEL, toChar(i).append(". ").append(getNameIn(toStr(":GLOBAL.LAST10_").append(toChar(i)))).append(" ").append(customDesc));
							this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's LABEL' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
							
							
						}
					}
				}
				catch(NoDataFoundException e)
				{
					// F2J_NOT_SUPPORTED : The property "MENU_ITEM's DISPLAYED" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.FORMS40.SetMenuItemProperty(toStr("ACTION.LAST10_").append(toChar(customNo)), SupportClasses.Property.DISPLAYED, false);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'MENU_ITEM's DISPLAYED' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
				catch(Exception  e)
				{
				}
				}finally{
					objDesc.close();
				}
		}
/* <p>
		* -
		* ---------------
		* -
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param whichNumber
		*/
		public void last10Execute(NString whichNumber)
		{
			executeAction("G$_REVOKE_ACCESS");
			getContainer().gCheckFailure();
			if ( getCurrentTaskName().notEquals("GUAGMNU") )
			{
				copy("Y","GLOBAL.LAST_TEN_CALL");
			}
			getContainer().gSecuredFormCall(getNameIn("GLOBAL.CURRENT_USER"), getNameIn(toStr(":GLOBAL.LAST10_").append(whichNumber)), toStr(""));
			copy("N","GLOBAL.LAST_TEN_CALL");
		}
		
	
	
}
