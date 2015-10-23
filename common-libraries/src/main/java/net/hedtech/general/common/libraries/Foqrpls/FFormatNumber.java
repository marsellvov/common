package net.hedtech.general.common.libraries.Foqrpls;

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


public class FFormatNumber extends AbstractSupportCodeObject {
	

	public FFormatNumber(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public FoqrplsServices getContainer() {
		return (FoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) F$_FORMAT_NUMBER
	/*
	PACKAGE F$_FORMAT_NUMBER IS
   PROCEDURE OPEN_FORMAT_WINDOW;
   PROCEDURE CLOSE_FORMAT;
   PROCEDURE APPLY_FORMAT;
   PROCEDURE WHEN_RADIO_CHANGED_TRG;
   PROCEDURE POST_BLOCK_TRG;
   PROCEDURE FORMAT_ITEM (ITEM_NAME VARCHAR2);
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) F$_FORMAT_NUMBER
		/*
		PACKAGE BODY F$_FORMAT_NUMBER IS
  
   PROCEDURE OPEN_FORMAT_WINDOW IS
      BEGIN
         COPY(NAME_IN('GLOBAL.DECIMAL_DIGITS'), 'F$_DECIMAL_DIGITS');
         COPY(NAME_IN('GLOBAL.SIGNIFICANT_COMMAS'), 'F$_SIGNIFICANT_COMMAS');
         COPY(NAME_IN('SYSTEM.CURSOR_ITEM'),'F$_RETURN_BLOCK_NAME');
         SET_ITEM_PROPERTY('F$_APPLY_BTN', ENABLED, PROPERTY_OFF);
         SET_ITEM_PROPERTY('F$_OK_BTN',LABEL,G$_NLS.Get('FOQRPLS-0000', 'LIB', 'Close'));
         SET_ITEM_PROPERTY('F$_CANCEL_BTN', ENABLED, PROPERTY_OFF);
         GO_BLOCK('F$_FORMAT_NUMBERS');
      END;

   PROCEDURE APPLY_FORMAT IS
      BEGIN
         IF GET_ITEM_PROPERTY('F$_APPLY_BTN', ENABLED) = 'TRUE' THEN
            COPY(NAME_IN('F$_DECIMAL_DIGITS'),'GLOBAL.DECIMAL_DIGITS');
            COPY(NAME_IN('F$_SIGNIFICANT_COMMAS'),'GLOBAL.SIGNIFICANT_COMMAS');
            EXECUTE_TRIGGER('FORM_FORMAT_NUMBERS');
            GO_ITEM('F$_OK_BTN');
            SET_ITEM_PROPERTY('F$_APPLY_BTN', ENABLED, PROPERTY_OFF);
            SET_ITEM_PROPERTY('F$_OK_BTN',LABEL,G$_NLS.Get('FOQRPLS-0001', 'LIB', 'Close'));
            SET_ITEM_PROPERTY('F$_CANCEL_BTN', ENABLED, PROPERTY_OFF);
         END IF;
      END;

   PROCEDURE CLOSE_FORMAT IS
      BEGIN
         GO_ITEM(NAME_IN('F$_RETURN_BLOCK_NAME'));
         HIDE_WINDOW('F$_FORMAT_NUMBER_WINDOW');
      END;

   PROCEDURE WHEN_RADIO_CHANGED_TRG IS
      BEGIN
         IF GET_ITEM_PROPERTY('F$_APPLY_BTN',ENABLED) = 'FALSE' THEN
            SET_ITEM_PROPERTY('F$_APPLY_BTN',ENABLED,PROPERTY_ON);
            SET_ITEM_PROPERTY('F$_APPLY_BTN',NAVIGABLE,PROPERTY_ON);
            SET_ITEM_PROPERTY('F$_OK_BTN', LABEL,G$_NLS.Get('FOQRPLS-0002', 'LIB', 'OK'));
            SET_ITEM_PROPERTY('F$_CANCEL_BTN', ENABLED, PROPERTY_ON);
         END IF;
      END;

   PROCEDURE POST_BLOCK_TRG IS
      BEGIN
         NULL;
      END;

   PROCEDURE FORMAT_ITEM (ITEM_NAME VARCHAR2) IS
      IT_ID ITEM;
      MASK_STRING VARCHAR2(25);

      BEGIN
         IT_ID := FIND_ITEM(ITEM_NAME);

         IF GET_ITEM_PROPERTY(IT_ID,DATATYPE) = 'RMONEY' AND 
            NAME_IN('GLOBAL.SIGNIFICANT_COMMAS') = '0' AND 
            NAME_IN('GLOBAL.DECIMAL_DIGITS') = '0' THEN
            MASK_STRING := '999G999999999999990';
         ELSE
            IF NAME_IN('GLOBAL.SIGNIFICANT_COMMAS') = '4' THEN
               MASK_STRING := '999G999G999G999G990';
            ELSIF NAME_IN('GLOBAL.SIGNIFICANT_COMMAS') = '3' THEN
               MASK_STRING := '999999G999G999G990';
            ELSIF NAME_IN('GLOBAL.SIGNIFICANT_COMMAS') = '2' THEN
               MASK_STRING := '999999999G999G990';
            ELSIF NAME_IN('GLOBAL.SIGNIFICANT_COMMAS') = '1' THEN
               MASK_STRING := '999999999999G990';
            ELSE
               MASK_STRING := '999999999999990';
            END IF;

            IF NAME_IN('GLOBAL.DECIMAL_DIGITS') = '2' THEN
               MASK_STRING := MASK_STRING||'D00';
            ELSIF NAME_IN('GLOBAL.DECIMAL_DIGITS') = '1' THEN
               MASK_STRING := MASK_STRING||'D0';
            END IF;
         END IF;

         SET_ITEM_PROPERTY(IT_ID,FORMAT_MASK,MASK_STRING);
    
      END;
END;
		*/
		/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void openFormatWindow()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			copy(getNameIn("GLOBAL.DECIMAL_DIGITS"),"F$_DECIMAL_DIGITS");
//			copy(getNameIn("GLOBAL.SIGNIFICANT_COMMAS"),"F$_SIGNIFICANT_COMMAS");
//			copy(getCursorItem(),"F$_RETURN_BLOCK_NAME");
//			setItemEnabled("F$_APPLY_BTN", false);
//			setItemLabel("F$_OK_BTN", GNls.Fget(toStr("FOQRPLS-0000"), toStr("LIB"), toStr("Close")));
//			setItemEnabled("F$_CANCEL_BTN", false);
//			goBlock(toStr("F$_FORMAT_NUMBERS"));
//
			this.getLogger().trace(this, "F2J : openFormatWindow procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void applyFormat()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( getItemEnabled("F$_APPLY_BTN").equals("TRUE") )
//			{
//				copy(getNameIn("F$_DECIMAL_DIGITS"),"GLOBAL.DECIMAL_DIGITS");
//				copy(getNameIn("F$_SIGNIFICANT_COMMAS"),"GLOBAL.SIGNIFICANT_COMMAS");
//				executeAction("FORM_FORMAT_NUMBERS");
//				goItem(toStr("F$_OK_BTN"));
//				setItemEnabled("F$_APPLY_BTN", false);
//				setItemLabel("F$_OK_BTN", GNls.Fget(toStr("FOQRPLS-0001"), toStr("LIB"), toStr("Close")));
//				setItemEnabled("F$_CANCEL_BTN", false);
//			}
//
			this.getLogger().trace(this, "F2J : applyFormat procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void closeFormat()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			goItem(getNameIn("F$_RETURN_BLOCK_NAME"));
//			hideWindow("F$_FORMAT_NUMBER_WINDOW");
//
			this.getLogger().trace(this, "F2J : closeFormat procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
/* </p>
		*/
		public void whenRadioChangedTrg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( getItemEnabled("F$_APPLY_BTN").equals("FALSE") )
//			{
//				setItemEnabled("F$_APPLY_BTN", true);
//				setItemNavigable("F$_APPLY_BTN", true);
//				setItemLabel("F$_OK_BTN", GNls.Fget(toStr("FOQRPLS-0002"), toStr("LIB"), toStr("OK")));
//				setItemEnabled("F$_CANCEL_BTN", true);
//			}
//
			this.getLogger().trace(this, "F2J : whenRadioChangedTrg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void postBlockTrg()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : postBlockTrg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemName
		*/
		public void formatItem(NString itemName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			ItemDescriptor itId= null;
//			NString maskString= NString.getNull();
//			itId = findItem(itemName);
//			if ( getItemDataType(itId).equals("RMONEY") && getNameIn("GLOBAL.SIGNIFICANT_COMMAS").equals("0") && getNameIn("GLOBAL.DECIMAL_DIGITS").equals("0") )
//			{
//				maskString = toStr("999G999999999999990");
//			}
//			else {
//				if ( getNameIn("GLOBAL.SIGNIFICANT_COMMAS").equals("4") )
//				{
//					maskString = toStr("999G999G999G999G990");
//				}
//				else if ( getNameIn("GLOBAL.SIGNIFICANT_COMMAS").equals("3") ) {
//					maskString = toStr("999999G999G999G990");
//				}
//				else if ( getNameIn("GLOBAL.SIGNIFICANT_COMMAS").equals("2") ) {
//					maskString = toStr("999999999G999G990");
//				}
//				else if ( getNameIn("GLOBAL.SIGNIFICANT_COMMAS").equals("1") ) {
//					maskString = toStr("999999999999G990");
//				}
//				else {
//					maskString = toStr("999999999999990");
//				}
//				if ( getNameIn("GLOBAL.DECIMAL_DIGITS").equals("2") )
//				{
//					maskString = maskString.append("D00");
//				}
//				else if ( getNameIn("GLOBAL.DECIMAL_DIGITS").equals("1") ) {
//					maskString = maskString.append("D0");
//				}
//			}
//			setItemFormatMask(itId, maskString);
//
			this.getLogger().trace(this, "F2J : formatItem procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
