package net.hedtech.banner.general.common.Guqwutl.controller;
 
import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;


import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
//import net.hedtech.general.common.libraries.Webutil.*;

import net.hedtech.banner.general.common.Guqwutl.model.*;
import net.hedtech.banner.general.common.Guqwutl.*;
import net.hedtech.banner.general.common.Guqwutl.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GuqwutlController extends DefaultBlockController {


	
	public GuqwutlController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuqwutlTask getTask() {
		return (GuqwutlTask)super.getTask();
	}

	public GuqwutlModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER EXTRACT_BTN.WHEN-BUTTON-PRESSED
		 DECLARE
	lv_al_button     NUMBER;
	lv_out_filename  VARCHAR2(500);
	lv_temp_filename VARCHAR2(500);
BEGIN
  IF :GLOBAL.WUTL_FORM_NAME = 'GJIREVO' THEN  	
    lv_temp_filename := substr(:GLOBAL.WUTL_FILE_NAME,1, INSTR(:GLOBAL.WUTL_FILE_NAME,'::') - 1)||
                        substr(:GLOBAL.WUTL_FILE_NAME, INSTR(:GLOBAL.WUTL_FILE_NAME,'::') + 2);
  ELSE
    lv_temp_filename := :GLOBAL.WUTL_FILE_NAME;
  END IF;
  IF :GLOBAL.WUTL_FORM_NAME = 'GJIREVO' THEN
    PULL_FOR_DATA_EXTRACT_STRIP(TO_NUMBER(:GLOBAL.WUTL_ONE_UP_NO),
                               TO_NUMBER(:GLOBAL.WUTL_FILE_NUMBER),
                               :GLOBAL.WUTL_FORM_NAME,
                               :GLOBAL.WUTL_BLOCK_NAME,
                               lv_temp_filename,
                               lv_out_filename);
    G$_CHECK_FAILURE;
  ELSIF :GLOBAL.WUTL_FORM_NAME = 'FGAGASB' THEN  	
    PULL_FOR_DATA_EXTRACT(TO_NUMBER(:GLOBAL.WUTL_ONE_UP_NO),
                          TO_NUMBER(:GLOBAL.WUTL_FILE_NUMBER),
                          :GLOBAL.WUTL_FORM_NAME,
                          :GLOBAL.WUTL_BLOCK_NAME,
                          lv_temp_filename,
                          lv_out_filename);
    G$_CHECK_FAILURE;
  ELSE
    PULL_FOR_DATA_EXTRACT_OUTD(TO_NUMBER(:GLOBAL.WUTL_ONE_UP_NO),
                               TO_NUMBER(:GLOBAL.WUTL_FILE_NUMBER),
                               :GLOBAL.WUTL_FORM_NAME,
                               :GLOBAL.WUTL_BLOCK_NAME,
                               lv_temp_filename,
                               lv_out_filename);
    G$_CHECK_FAILURE;
  END IF;
-- --
  SET_ALERT_PROPERTY('G$_INFO_ALERT',ALERT_MESSAGE_TEXT,
    G$_NLS.Get('GUQWUTL-0006','FORM','Output saved as file %01%.  Select OK to complete Save.',lv_out_filename));	
  lv_al_button := SHOW_ALERT('G$_INFO_ALERT');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXTRACT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="EXTRACT_BTN")
		public void extractBtn_buttonClick()
		{
			
				{
					NNumber lvAlButton= NNumber.getNull();
					NString lvOutFilename= NString.getNull();
					NString lvTempFilename= NString.getNull();
					if ( getGlobal("WUTL_FORM_NAME").equals("GJIREVO") )
					{
						lvTempFilename = substring(getGlobal("WUTL_FILE_NAME"), toInt(1), inStr(getGlobal("WUTL_FILE_NAME"), toStr("::")).subtract(1)).append(substring(getGlobal("WUTL_FILE_NAME"), inStr(getGlobal("WUTL_FILE_NAME"), toStr("::")).add(2)));
					}
					else {
						lvTempFilename = getGlobal("WUTL_FILE_NAME");
					}
					if ( getGlobal("WUTL_FORM_NAME").equals("GJIREVO") )
					{
						Ref<NString> pOutFilename_ref = new Ref<NString>(lvOutFilename);
						this.getTask().getServices().pullForDataExtractStrip(toNumber(getGlobal("WUTL_ONE_UP_NO")), toNumber(getGlobal("WUTL_FILE_NUMBER")), getGlobal("WUTL_FORM_NAME"), getGlobal("WUTL_BLOCK_NAME"), lvTempFilename, pOutFilename_ref);
						lvOutFilename = pOutFilename_ref.val;
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( getGlobal("WUTL_FORM_NAME").equals("FGAGASB") ) {
						Ref<NString> pOutFilename_ref = new Ref<NString>(lvOutFilename);
						this.getTask().getServices().pullForDataExtract(toNumber(getGlobal("WUTL_ONE_UP_NO")), toNumber(getGlobal("WUTL_FILE_NUMBER")), getGlobal("WUTL_FORM_NAME"), getGlobal("WUTL_BLOCK_NAME"), lvTempFilename, pOutFilename_ref);
						lvOutFilename = pOutFilename_ref.val;
						getTask().getGoqrpls().gCheckFailure();
					}
					else {
						Ref<NString> pOutFilename_ref = new Ref<NString>(lvOutFilename);
						this.getTask().getServices().pullForDataExtractOutd(toNumber(getGlobal("WUTL_ONE_UP_NO")), toNumber(getGlobal("WUTL_FILE_NUMBER")), getGlobal("WUTL_FORM_NAME"), getGlobal("WUTL_BLOCK_NAME"), lvTempFilename, pOutFilename_ref);
						lvOutFilename = pOutFilename_ref.val;
						getTask().getGoqrpls().gCheckFailure();
					}
					//  --
					setAlertMessageText("G$_INFO_ALERT", GNls.Fget(toStr("GUQWUTL-0006"), toStr("FORM"), toStr("Output saved as file %01%.  Select OK to complete Save."), lvOutFilename));
					lvAlButton = toNumber(showAlert("G$_INFO_ALERT"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER EXIT_BTN.WHEN-BUTTON-PRESSED
		 BEGIN
	DO_KEY('EXIT_FORM');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXIT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="EXIT_BTN")
		public void exitBtn_buttonClick()
		{
			
				executeAction("EXIT");
			}

		
	
	
}

