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

public class GGoqolibOptBlock extends AbstractSupportCodeObject {
	

	public GGoqolibOptBlock(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_GOQOLIB_OPT_BLOCK
	/*
	PACKAGE G$_GOQOLIB_OPT_BLOCK IS
  PROCEDURE WHEN_NEW_ITEM_INST;
  PROCEDURE WHEN_OPT_BLOCK_INST;
  PROCEDURE POST_TEXT_ITEM;
  PROCEDURE KEY_NXT_PRV_REC;
  PROCEDURE WHEN_BTN_PRESSED;
--
  PROCEDURE HYPERLINK_WHEN_MOUSE_CLICKED;
  PROCEDURE HYPERLINK_WHEN_BTN_PRESSED;
  PROCEDURE HYPERLINK_WHEN_NEW_ITEM_INST; 
  PROCEDURE HYPERLINK_CANCEL; 
-- -- --
  PROCEDURE ENABLE_OPT_BLOCK_ON_ENTRY;
  PROCEDURE DISABLE_OPT_BLOCK_ON_EXIT;
-- -- --
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_GOQOLIB_OPT_BLOCK
		/*
		PACKAGE BODY G$_GOQOLIB_OPT_BLOCK IS
--
  PROCEDURE WHEN_NEW_ITEM_INST IS
    TRIGGER_ITEM  VARCHAR2(80) := NAME_IN('SYSTEM.TRIGGER_ITEM');
  BEGIN
    IF NAME_IN('SYSTEM.TRIGGER_ITEM') <> 'G$_OPT_BLOCK.OPT_SEL' AND
       NAME_IN('G$_OPT_BLOCK.SELECT_ITEM') IS NOT NULL AND
       GET_ITEM_PROPERTY(NAME_IN('SYSTEM.TRIGGER_ITEM'),ITEM_CANVAS) IS NOT NULL THEN
--
     SET_WINDOW_PROPERTY('G$_OPT_WINDOW',VISIBLE,PROPERTY_OFF);
     GO_ITEM(NAME_IN('SELECT_ITEM'));    
-- -- --
     DISABLE_OPT_BLOCK_ON_EXIT;     
-- -- --
     SYNCHRONIZE;
-- --
     DO_KEY(NAME_IN(SUBSTR(TRIGGER_ITEM,INSTR(TRIGGER_ITEM,'.')+1,8)||'_KEY'));
--
    END IF;
  END;
-- 
  PROCEDURE WHEN_OPT_BLOCK_INST IS
  BEGIN
    SET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),VALIDATION,PROPERTY_ON);
  END;
--
  PROCEDURE POST_TEXT_ITEM IS
  BEGIN
    NULL; --Obsolete procedure, left for compatibility
  END;
--
  PROCEDURE KEY_NXT_PRV_REC IS
  BEGIN
    IF G$_DISPLAY_ALERT('',G$_NLS.Get('GOQRPLS-0047','LIB','Invalid function Key')) IS NOT NULL THEN
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END;
--
  PROCEDURE WHEN_BTN_PRESSED IS
  BEGIN
    SET_WINDOW_PROPERTY('G$_OPT_WINDOW',VISIBLE,PROPERTY_OFF);
    GO_ITEM(NAME_IN('SELECT_ITEM'));
-- -- --
    DISABLE_OPT_BLOCK_ON_EXIT;     
-- -- --
  END;
--
--
  PROCEDURE HYPERLINK_WHEN_BTN_PRESSED IS
    ITM          VARCHAR2(1);
  BEGIN
    FOR I IN 1..6 LOOP
      CASE I
        WHEN 1 THEN ITM := 'A';
        WHEN 2 THEN ITM := 'B';
        WHEN 3 THEN ITM := 'C';
        WHEN 4 THEN ITM := 'D';
        WHEN 5 THEN ITM := 'E';
        ELSE        ITM := 'F';
      END CASE;
--
      IF GET_ITEM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC', VISIBLE) = 'TRUE' THEN
      	SET_CUSTOM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC',1,'ACTVNO',' ');
      END IF;
    END LOOP;
--
    G$_GOQOLIB_OPT_BLOCK.WHEN_NEW_ITEM_INST;
--
  END HYPERLINK_WHEN_BTN_PRESSED;
--
-- 
  PROCEDURE HYPERLINK_WHEN_MOUSE_CLICKED IS 
    ITM          VARCHAR2(1);
  BEGIN
    FOR I IN 1..6 LOOP
      CASE I
        WHEN 1 THEN ITM := 'A';
        WHEN 2 THEN ITM := 'B';
        WHEN 3 THEN ITM := 'C';
        WHEN 4 THEN ITM := 'D';
        WHEN 5 THEN ITM := 'E';
        ELSE        ITM := 'F';
      END CASE;
--
      IF GET_ITEM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC', VISIBLE) = 'TRUE' THEN
        IF 'G$_OPT_BLOCK.SELECT_'||ITM||'_DESC' = NAME_IN('SYSTEM.CURSOR_ITEM') THEN
          SET_CUSTOM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC',1,'ACTV',' ');
     	  ELSE
          SET_CUSTOM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC',1,'ACTVNO',' ');
 	      END IF;
      END IF;
    END LOOP;
  END HYPERLINK_WHEN_MOUSE_CLICKED;
--
--
  PROCEDURE HYPERLINK_WHEN_NEW_ITEM_INST IS  
  	  ITM          VARCHAR2(1);
  BEGIN
    FOR I IN 1..6 LOOP  	
      CASE I
        WHEN 1 THEN ITM := 'A';
        WHEN 2 THEN ITM := 'B';
        WHEN 3 THEN ITM := 'C';
        WHEN 4 THEN ITM := 'D';
        WHEN 5 THEN ITM := 'E';
        ELSE        ITM := 'F';
      END CASE;
--
      IF GET_ITEM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC', VISIBLE) = 'TRUE' THEN
        IF 'G$_OPT_BLOCK.SELECT_'||ITM||'_DESC' = NAME_IN('SYSTEM.CURSOR_ITEM') THEN
          SET_CUSTOM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC',1,'ACTV',' ');
        ELSE
          SET_CUSTOM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC',1,'ACTVNO',' ');
        END IF;
      END IF;
    END LOOP; 
  END HYPERLINK_WHEN_NEW_ITEM_INST; 
--
--  
  PROCEDURE HYPERLINK_CANCEL IS  
  	  ITM          VARCHAR2(1);
  BEGIN 
    FOR I IN 1..6 LOOP  	
      CASE I
        WHEN 1 THEN ITM := 'A';
        WHEN 2 THEN ITM := 'B';
        WHEN 3 THEN ITM := 'C';
        WHEN 4 THEN ITM := 'D';
        WHEN 5 THEN ITM := 'E';
        ELSE        ITM := 'F';
      END CASE;
--
      IF GET_ITEM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC', VISIBLE) = 'TRUE' THEN
        SET_CUSTOM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC',1,'ACTVNO',' ');
      END IF;
    END LOOP;
--
    G$_GOQOLIB_OPT_BLOCK.WHEN_BTN_PRESSED;
  END HYPERLINK_CANCEL;
--
--  
  PROCEDURE ENABLE_OPT_BLOCK_ON_ENTRY IS  
  	  ITM          VARCHAR2(1);
  BEGIN 
      SET_ITEM_PROPERTY('G$_OPT_BLOCK.OPT_SEL', ENABLED, PROPERTY_TRUE);
      SET_ITEM_PROPERTY('G$_OPT_BLOCK.OPT_CANCEL_BTN', ENABLED, PROPERTY_TRUE);
      SET_ITEM_PROPERTY('G$_OPT_BLOCK.OPT_CANCEL_BTN', NAVIGABLE, PROPERTY_TRUE);
      SET_ITEM_PROPERTY('G$_OPT_BLOCK.OPT_CANCEL_BTN', MOUSE_NAVIGATE, PROPERTY_TRUE);
  END ENABLE_OPT_BLOCK_ON_ENTRY;
--
--  
  PROCEDURE DISABLE_OPT_BLOCK_ON_EXIT IS  
  	  ITM          VARCHAR2(1);
  BEGIN 
    FOR I IN 1..6 LOOP  	
      CASE I
        WHEN 1 THEN ITM := 'A';
        WHEN 2 THEN ITM := 'B';
        WHEN 3 THEN ITM := 'C';
        WHEN 4 THEN ITM := 'D';
        WHEN 5 THEN ITM := 'E';
        ELSE        ITM := 'F';
      END CASE;
--        
      IF GET_ITEM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC', VISIBLE) = 'TRUE' THEN
        SET_ITEM_PROPERTY('G$_OPT_BLOCK.SELECT_'||ITM||'_DESC', ENABLED, PROPERTY_FALSE);
      END IF;
--
    END LOOP;
-- --
      SET_ITEM_PROPERTY('G$_OPT_BLOCK.OPT_SEL', ENABLED, PROPERTY_FALSE);
      SET_ITEM_PROPERTY('G$_OPT_BLOCK.OPT_CANCEL_BTN', ENABLED, PROPERTY_FALSE);
-- --  
  END DISABLE_OPT_BLOCK_ON_EXIT;
--
END G$_GOQOLIB_OPT_BLOCK;
		*/
		/* <p>
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void whenNewItemInst()
		{
			NString triggerItem = getTriggerItem();
			if ( getTriggerItem().notEquals("G$_OPT_BLOCK.OPT_SEL") && !getNameIn("G$_OPT_BLOCK.SELECT_ITEM").isNull() && !getItemCanvas(getTriggerItem()).isNull() )
			{
				// 
				// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.VISIBLE, false);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
				goItem(getNameIn("SELECT_ITEM"));
				
				getCurrentTask().getNavigationModel().doNavigation();
				//  -- --
				disableOptBlockOnExit();
				//  -- --
				doFullNavigation();
				
				executeAction(getNameIn(substring(triggerItem, inStr(triggerItem, toStr(".")).add(1), toInt(8)).append("_KEY")));
				//System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13'.");
				
			}
		}
/* <p>
		*  
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void whenOptBlockInst()
		{			
			TaskServices.getCurrentTask().setValidationEnabled(true);
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void postTextItem()
		{
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void keyNxtPrvRec()
		{
			if ( !getContainer().gDisplayAlert(toStr(""), GNls.Fget(toStr("GOQRPLS-0047"), toStr("LIB"), toStr("Invalid function Key"))).isNull() )
			{
				throw new ApplicationException();
			}
		}
/* <p>
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void whenBtnPressed()
		{
			// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
			//			SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.VISIBLE, false);
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
			
			
			goItem(getNameIn("SELECT_ITEM"));
			//  -- --
			disableOptBlockOnExit();
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void hyperlinkWhenBtnPressed()
		{
			NString itm= NString.getNull();
			for ( int i = 1; i <= 6; i++ )
			{
				if (i == 1)
				{
					itm = toStr("A");
				}
				else if (i == 2)
				{
					itm = toStr("B");
				}
				else if (i == 3)
				{
					itm = toStr("C");
				}
				else if (i == 4)
				{
					itm = toStr("D");
				}
				else if (i == 5)
				{
					itm = toStr("E");
				}
				else {
					itm = toStr("F");
				}
				// 
				if ( getItemVisible(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC")).equals("TRUE") )
				{
					// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40".
					//					SupportClasses.FORMS40.SetCustomProperty(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC"), 1, "ACTVNO", " ");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40'.");
					
					
				}
			}
			// 
			whenNewItemInst();
		}
/* <p>
		* 
		*  
/* </p>
		*/
		public void hyperlinkWhenMouseClicked()
		{
			NString itm= NString.getNull();
			for ( int i = 1; i <= 6; i++ )
			{
				if (i == 1)
				{
					itm = toStr("A");
				}
				else if (i == 2)
				{
					itm = toStr("B");
				}
				else if (i == 3)
				{
					itm = toStr("C");
				}
				else if (i == 4)
				{
					itm = toStr("D");
				}
				else if (i == 5)
				{
					itm = toStr("E");
				}
				else {
					itm = toStr("F");
				}
				// 
				if ( getItemVisible(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC")).equals("TRUE") )
				{
					if ( toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC").equals(getCursorItem()) )
					{
						// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40".
						//						SupportClasses.FORMS40.SetCustomProperty(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC"), 1, "ACTV", " ");
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40'.");
						
						
					}
					else {
						// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40".
						//						SupportClasses.FORMS40.SetCustomProperty(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC"), 1, "ACTVNO", " ");
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40'.");
						
						
					}
				}
			}
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void hyperlinkWhenNewItemInst()
		{
			NString itm= NString.getNull();
			for ( int i = 1; i <= 6; i++ )
			{
				if (i == 1)
				{
					itm = toStr("A");
				}
				else if (i == 2)
				{
					itm = toStr("B");
				}
				else if (i == 3)
				{
					itm = toStr("C");
				}
				else if (i == 4)
				{
					itm = toStr("D");
				}
				else if (i == 5)
				{
					itm = toStr("E");
				}
				else {
					itm = toStr("F");
				}
				// 
				if ( getItemVisible(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC")).equals("TRUE") )
				{
					if ( toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC").equals(getCursorItem()) )
					{
						// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40".
						//						SupportClasses.FORMS40.SetCustomProperty(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC"), 1, "ACTV", " ");
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40'.");
						
						
					}
					else {
						// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40".
						//						SupportClasses.FORMS40.SetCustomProperty(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC"), 1, "ACTVNO", " ");
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40'.");
						
						
					}
				}
			}
		}
/* <p>
		* 
		*   
/* </p>
		*/
		public void hyperlinkCancel()
		{
			NString itm= NString.getNull();
			for ( int i = 1; i <= 6; i++ )
			{
				if (i == 1)
				{
					itm = toStr("A");
				}
				else if (i == 2)
				{
					itm = toStr("B");
				}
				else if (i == 3)
				{
					itm = toStr("C");
				}
				else if (i == 4)
				{
					itm = toStr("D");
				}
				else if (i == 5)
				{
					itm = toStr("E");
				}
				else {
					itm = toStr("F");
				}
				// 
				if ( getItemVisible(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC")).equals("TRUE") )
				{
					// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40".
					//					SupportClasses.FORMS40.SetCustomProperty(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC"), 1, "ACTVNO", " ");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin40'.");
					
					
				}
			}
			// 
			whenBtnPressed();
		}
/* <p>
		* 
		*   
/* </p>
		*/
		public void enableOptBlockOnEntry()
		{
			NString itm= NString.getNull();
			setItemEnabled("G$_OPT_BLOCK.OPT_SEL", true);
			setItemEnabled("G$_OPT_BLOCK.OPT_CANCEL_BTN", true);
			setItemNavigable("G$_OPT_BLOCK.OPT_CANCEL_BTN", true);
			setItemNavigable("G$_OPT_BLOCK.OPT_CANCEL_BTN", true);
		}
/* <p>
		* 
		*   
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void disableOptBlockOnExit()
		{
			NString itm= NString.getNull();
			for ( int i = 1; i <= 6; i++ )
			{
				if (i == 1)
				{
					itm = toStr("A");
				}
				else if (i == 2)
				{
					itm = toStr("B");
				}
				else if (i == 3)
				{
					itm = toStr("C");
				}
				else if (i == 4)
				{
					itm = toStr("D");
				}
				else if (i == 5)
				{
					itm = toStr("E");
				}
				else {
					itm = toStr("F");
				}
				//         
				if ( getItemVisible(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC")).equals("TRUE") )
				{
					setItemEnabled(toStr("G$_OPT_BLOCK.SELECT_").append(itm).append("_DESC"), false);
				}
			}
			//  --
			setItemEnabled("G$_OPT_BLOCK.OPT_SEL", false);
			setItemEnabled("G$_OPT_BLOCK.OPT_CANCEL_BTN", false);
		}
		
	
	
}
