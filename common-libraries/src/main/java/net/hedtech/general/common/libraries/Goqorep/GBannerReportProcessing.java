package net.hedtech.general.common.libraries.Goqorep;

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


public class GBannerReportProcessing extends AbstractSupportCodeObject {
	

	public GBannerReportProcessing(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqorepServices getContainer() {
		return (GoqorepServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_BANNER_REPORT_PROCESSING
	/*
	PACKAGE G$_BANNER_REPORT_PROCESSING IS
-- Core routine is START_REPORT_WINDOW. If jobsub parameter 77 indicates YES (or is not found) the Window is presented
-- and the G$_BANNER_REPORT_BLOCK button's when-button-pressed will then accept input from the window and fire the
-- PROCESS_REPORT routine.  If the Window is not presented, defaults for the Report are loaded and the PROCESS_REPORT
-- is invoked.
--
  GLOBAL_go_item_id            ITEM  := FIND_ITEM('G$_BANNER_REPORT_BLOCK.OREP_DESFORMAT');
  GLOBAL_paramlist_established VARCHAR2(1);
--
--
  FUNCTION  GET_GUBOBJS_DESC(p_report_name VARCHAR2) RETURN VARCHAR2;
  PROCEDURE LOAD_DEFAULTS(p_report_name VARCHAR2);
  PROCEDURE DISABLE_REPORT_BLOCK_ITEMS;
  PROCEDURE ENABLE_REPORT_BLOCK_ITEMS;
  FUNCTION  GET_GJBPDFT_REPORT_VALUE(p_report_name          VARCHAR2,
                                     p_number               VARCHAR2,
                                     p_default_report_value VARCHAR2) RETURN VARCHAR2;
-- --
  FUNCTION PROCESS_REPORT(p_report_name            VARCHAR2,
                          p_report_server          VARCHAR2,
                          p_report_service         VARCHAR2,
                          p_report_desformat       VARCHAR2,
                          p_report_destype         VARCHAR2,
                          p_report_desname         VARCHAR2,
                          p_report_execution_mode  VARCHAR2,
                          p_report_comm_mode       VARCHAR2,
                          p_report_paramform_desig VARCHAR2,
                          p_report_param_name_list VARCHAR2) RETURN BOOLEAN;
-- --
  PROCEDURE START_REPORT_WINDOW(p_report_name VARCHAR2, p_paramlist_established VARCHAR2 DEFAULT NULL);    

END;
	*/
	
			//  Core routine is START_REPORT_WINDOW. If jobsub parameter 77 indicates YES (or is not found) the Window is presented
		//  and the G$_BANNER_REPORT_BLOCK button's when-button-pressed will then accept input from the window and fire the
		//  PROCESS_REPORT routine.  If the Window is not presented, defaults for the Report are loaded and the PROCESS_REPORT
		//  is invoked.
		// 
		public ItemDescriptor globalGoItemId = findItem(toStr("G$_BANNER_REPORT_BLOCK.OREP_DESFORMAT"));
		public NString globalParamlistEstablished= NString.getNull();

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_BANNER_REPORT_PROCESSING
		/*
		PACKAGE BODY G$_BANNER_REPORT_PROCESSING IS
-- --
-- --
  FUNCTION GET_GUBOBJS_DESC(p_report_name VARCHAR2) RETURN VARCHAR2 IS
    lv_temp_desc  GUBOBJS.GUBOBJS_DESC%TYPE;
    CURSOR GUBOBJS_DESC_CURSOR IS
    SELECT GUBOBJS_DESC
    FROM   GUBOBJS
    WHERE  GUBOBJS_NAME = p_report_name;
  BEGIN
    OPEN GUBOBJS_DESC_CURSOR;
    FETCH GUBOBJS_DESC_CURSOR INTO lv_temp_desc;
    IF GUBOBJS_DESC_CURSOR%notfound THEN 
      RETURN('Unknown Report Description');
    ELSE
    	RETURN(lv_temp_desc);
    END IF;
  END GET_GUBOBJS_DESC;
-- --
-- --
  PROCEDURE LOAD_DEFAULTS(p_report_name VARCHAR2) IS
-- -- Defaults are obtained from job submission parameters 71 through 76.
-- -- If they are not found, hard code values are provided in this routine.
  BEGIN
    COPY(NAME_IN('SYSTEM.CURSOR_ITEM'),'G$_BANNER_REPORT_HEADER.WORK_OREP_RETURN_ITEM');
    COPY(p_report_name,'G$_BANNER_REPORT_HEADER.OREP_NAME');    
    COPY(GET_GUBOBJS_DESC(p_report_name),'G$_BANNER_REPORT_HEADER.OREP_REPORT_DESCRIPTION');
-- --
    EXECUTE_TRIGGER('LOAD_SERVER_SERVICE_NAMES');
-- --
    COPY(GET_GJBPDFT_REPORT_VALUE(p_report_name,'71','PDF'),'G$_BANNER_REPORT_HEADER.DEFAULT_DESFORMAT');
    COPY(GET_GJBPDFT_REPORT_VALUE(p_report_name,'72','CACHE'),'G$_BANNER_REPORT_HEADER.DEFAULT_DESTYPE');
    COPY(GET_GJBPDFT_REPORT_VALUE(p_report_name,'73',''),'G$_BANNER_REPORT_HEADER.DEFAULT_DESNAME');
    COPY(GET_GJBPDFT_REPORT_VALUE(p_report_name,'74','RUNTIME'),'G$_BANNER_REPORT_HEADER.DEFAULT_EXECUTION_MODE');
    COPY(GET_GJBPDFT_REPORT_VALUE(p_report_name,'75','SYNC'),'G$_BANNER_REPORT_HEADER.DEFAULT_COMM_MODE');
    COPY(GET_GJBPDFT_REPORT_VALUE(p_report_name,'76','YES'),'G$_BANNER_REPORT_HEADER.DEFAULT_PARAMFORM_DESIG'); 
  END LOAD_DEFAULTS;
--
--  
  PROCEDURE DISABLE_REPORT_BLOCK_ITEMS IS
  BEGIN
    SET_ITEM_PROPERTY(GLOBAL_go_item_id,ENABLED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_DESTYPE',ENABLED,PROPERTY_FALSE);    
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_DESNAME',ENABLED,PROPERTY_FALSE);    
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_EXECUTION_MODE',ENABLED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_COMM_MODE',ENABLED,PROPERTY_FALSE);    
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_PARAMFORM_DESIGNATION',ENABLED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_SUBMIT_BTN',ENABLED,PROPERTY_FALSE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_CANCEL_BTN',ENABLED,PROPERTY_FALSE);
  END DISABLE_REPORT_BLOCK_ITEMS;
--
--
  PROCEDURE ENABLE_REPORT_BLOCK_ITEMS IS
  BEGIN
    SET_ITEM_PROPERTY(GLOBAL_go_item_id,ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY(GLOBAL_go_item_id,NAVIGABLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY(GLOBAL_go_item_id,MOUSE_NAVIGATE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_DESTYPE',ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_DESTYPE',NAVIGABLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_DESTYPE',MOUSE_NAVIGATE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_DESNAME',ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_DESNAME',NAVIGABLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_EXECUTION_MODE',ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_EXECUTION_MODE',NAVIGABLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_EXECUTION_MODE',MOUSE_NAVIGATE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_COMM_MODE',ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_COMM_MODE',NAVIGABLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_COMM_MODE',MOUSE_NAVIGATE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_PARAMFORM_DESIGNATION',ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_PARAMFORM_DESIGNATION',NAVIGABLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_PARAMFORM_DESIGNATION',MOUSE_NAVIGATE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_SUBMIT_BTN',ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_SUBMIT_BTN',NAVIGABLE,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_CANCEL_BTN',ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_BANNER_REPORT_BLOCK.OREP_CANCEL_BTN',NAVIGABLE,PROPERTY_TRUE);
  END ENABLE_REPORT_BLOCK_ITEMS;
--
--
  FUNCTION  GET_GJBPDFT_REPORT_VALUE(p_report_name          VARCHAR2,
                                     p_number               VARCHAR2,
                                     p_default_report_value VARCHAR2) RETURN VARCHAR2 IS
    lv_temp_value  VARCHAR2(30);
    lv_user_value  VARCHAR2(30);
    CURSOR GJBPDFT_CURSOR IS
    SELECT GJBPDFT_VALUE
    FROM   GJBPDFT
    WHERE  GJBPDFT_JOB              = p_report_name
    AND    GJBPDFT_NUMBER           = p_number
    AND    GJBPDFT_JPRM_CODE IS NULL
    AND    NVL(GJBPDFT_USER_ID,'*') = NVL(lv_user_value,'*');
  BEGIN
  	lv_user_value := NAME_IN('GLOBAL.CURRENT_USER');
    OPEN GJBPDFT_CURSOR;
    FETCH GJBPDFT_CURSOR INTO lv_temp_value;
    IF GJBPDFT_CURSOR%notfound THEN
      null;
    ELSIF lv_temp_value IS NULL THEN
    	null;
    ELSE
     	CLOSE GJBPDFT_CURSOR;
    	RETURN(UPPER(lv_temp_value));
    END IF;
    CLOSE GJBPDFT_CURSOR;
-- -- --
    lv_user_value := '';
    OPEN GJBPDFT_CURSOR;
    FETCH GJBPDFT_CURSOR INTO lv_temp_value;
    IF GJBPDFT_CURSOR%notfound THEN
      RETURN(p_default_report_value);
    ELSE
     	CLOSE GJBPDFT_CURSOR;
     	RETURN(UPPER(lv_temp_value));
    END IF;
    CLOSE GJBPDFT_CURSOR;
  END GET_GJBPDFT_REPORT_VALUE;
--
-- 
  FUNCTION PROCESS_REPORT(p_report_name            VARCHAR2,
                          p_report_server          VARCHAR2,
                          p_report_service         VARCHAR2,
                          p_report_desformat       VARCHAR2,
                          p_report_destype         VARCHAR2,
                          p_report_desname         VARCHAR2,
                          p_report_execution_mode  VARCHAR2,
                          p_report_comm_mode       VARCHAR2,
                          p_report_paramform_desig VARCHAR2,
                          p_report_param_name_list VARCHAR2) RETURN BOOLEAN IS
-- --
-- -- GLOBAL_paramlist_established is passed into oriaginal call of START_REPORT_WINDOW.
-- -- This is done so as to know if Parameter_LIST "input_parms" list has been externally created to pass in
-- -- parms 01, 02, 03 etc.  If Parameter_LIST "input_parms" has been created, append PARAMETERFORM "yes or no".
-- -- otherwise create "input_parms" here and add PARAMETERFORM "yes or no".
-- --
    lv_report_id      REPORT_OBJECT;
    lv_report_success BOOLEAN;
    lv_list_id        PARAMLIST;
  BEGIN
    lv_report_id := find_report_object('BANNER_REPORT');
    lv_list_id   := GET_PARAMETER_LIST('input_params'); 
    IF GLOBAL_paramlist_established IS NULL THEN
      IF NOT Id_Null(lv_list_id) THEN
        DESTROY_PARAMETER_LIST(lv_list_id);
      END IF; 
      lv_list_id := CREATE_PARAMETER_LIST('input_params');
    ELSE
      IF Id_Null(lv_list_id) THEN
        MESSAGE(G$_NLS.Get('GOQOREP-0009','LIB','*ERROR* Incorrect internal list name has been used.  Run Report Aborting.'));
        RAISE FORM_TRIGGER_FAILURE;
      END IF;         	
    END IF;      
-- -- --
    IF p_report_paramform_desig = 'YES' THEN
      ADD_PARAMETER(lv_list_id,'PARAMFORM',TEXT_PARAMETER,'YES');
    ELSE
      ADD_PARAMETER(lv_list_id,'PARAMFORM',TEXT_PARAMETER,'NO');
    END IF;
    G$_SCT_RUN_REPORTS.G$_SCT_RUN_REPORT(lv_report_id,
                                         p_report_name,
                                         p_report_server,
                                         p_report_service,
                                         p_report_desformat,
                                         p_report_destype,
                                         p_report_desname,
                                         p_report_execution_mode,
                                         p_report_comm_mode,
                                         lv_list_id,
                                         p_report_param_name_list,
                                         lv_report_success);
    RETURN(lv_report_success);
  END PROCESS_REPORT;
--
--  
  PROCEDURE START_REPORT_WINDOW(p_report_name VARCHAR2, p_paramlist_established VARCHAR2 DEFAULT NULL) IS
  lv_message VARCHAR2(2000) := '';
  BEGIN
  	GLOBAL_paramlist_established := p_paramlist_established;
    IF GET_GJBPDFT_REPORT_VALUE(p_report_name,'77','YES') = 'YES' THEN
  	  IF NOT ID_NULL(GLOBAL_go_item_id) THEN
        IF GET_ITEM_PROPERTY(GLOBAL_go_item_id,ENABLED) = 'FALSE' THEN
          ENABLE_REPORT_BLOCK_ITEMS;
          LOAD_DEFAULTS(p_report_name);
        END IF;
        GO_ITEM(GLOBAL_go_item_id);
  	  END IF;
  	ELSE
  	  LOAD_DEFAULTS(p_report_name);
  	  
  	 G$_BANNER_REPORT_EDITING.EDIT_OREP_ROW(NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_DESFORMAT'),
	                                          NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_DESTYPE'),
	                                          NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_DESNAME'),
	                                          NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_EXECUTION_MODE'),
	                                          NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_COMM_MODE'),
	                                          NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_PARAMFORM_DESIG'),
	                                          lv_message);
    IF lv_message IS NOT NULL THEN
      lv_message := G$_NLS.Get('GOQOREP-0010','LIB','*ERROR* Cannot process report %01%. Check the default Parameter(s). ',p_report_name) ||lv_message;
      MESSAGE(lv_message);
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
    
    
  	  IF NOT PROCESS_REPORT(NAME_IN('G$_BANNER_REPORT_HEADER.OREP_NAME'),
  	                        NAME_IN('G$_BANNER_REPORT_HEADER.OREP_SERVER_NAME'),
  	                        NAME_IN('G$_BANNER_REPORT_HEADER.OREP_SERVICE'),
  	                        NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_DESFORMAT'),
  	                        NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_DESTYPE'),
  	                        NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_DESNAME'),
  	                        NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_EXECUTION_MODE'),
  	                        NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_COMM_MODE'),
  	                        NAME_IN('G$_BANNER_REPORT_HEADER.DEFAULT_PARAMFORM_DESIG'),
  	                        NAME_IN('G$_BANNER_REPORT_HEADER.LIST_PARAM_NAMES')) THEN
        MESSAGE(G$_NLS.GET('GOQOREP-0011','LIB','*ERROR* Report Failed to Run'));
        RAISE FORM_TRIGGER_FAILURE;
      END IF;  	    	
    END IF;  	
  END START_REPORT_WINDOW;
--
--  
BEGIN
   null;
END;
		*/
		/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pReportName
		*/
		public NString getGubobjsDesc(NString pReportName)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.

			NString lvTempDesc= NString.getNull();
			String sqlgubobjsDescCursor = "SELECT GUBOBJS_DESC " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :P_P_REPORT_NAME ";
			DataCursor gubobjsDescCursor = new DataCursor(sqlgubobjsDescCursor);
			try {
				//Setting query parameters
				gubobjsDescCursor.addParameter("P_P_REPORT_NAME", pReportName);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable gubobjsDescCursor.
				gubobjsDescCursor.open();
				ResultSet gubobjsDescCursorResults = gubobjsDescCursor.fetchInto();
				if ( gubobjsDescCursorResults != null ) {
					lvTempDesc = gubobjsDescCursorResults.getStr(0);
				}
				if ( gubobjsDescCursor.notFound() )
				{
					return  toStr((("Unknown Report Description")));
				}
				else {
					return ((lvTempDesc));
				}
			}finally{
				gubobjsDescCursor.close();
			}

			//this.getLogger().trace(this, "F2J : getGubobjsDesc function is not completely migrated yet. Please read the Migration Guide.");
			
			
			//return NString.getNull();
		}
/* <p>
		*  --
		*  --
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pReportName
		*/
		public void loadDefaults(NString pReportName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			copy(getCursorItem(),"G$_BANNER_REPORT_HEADER.WORK_OREP_RETURN_ITEM");
			copy(pReportName,"G$_BANNER_REPORT_HEADER.OREP_NAME");
			copy(getGubobjsDesc(pReportName),"G$_BANNER_REPORT_HEADER.OREP_REPORT_DESCRIPTION");
			//  --
			executeAction("LOAD_SERVER_SERVICE_NAMES");
			//  --
			copy(getGjbpdftReportValue(pReportName, toStr("71"), toStr("PDF")),"G$_BANNER_REPORT_HEADER.DEFAULT_DESFORMAT");
			copy(getGjbpdftReportValue(pReportName, toStr("72"), toStr("CACHE")),"G$_BANNER_REPORT_HEADER.DEFAULT_DESTYPE");
			copy(getGjbpdftReportValue(pReportName, toStr("73"), toStr("")),"G$_BANNER_REPORT_HEADER.DEFAULT_DESNAME");
			copy(getGjbpdftReportValue(pReportName, toStr("74"), toStr("RUNTIME")),"G$_BANNER_REPORT_HEADER.DEFAULT_EXECUTION_MODE");
			copy(getGjbpdftReportValue(pReportName, toStr("75"), toStr("SYNC")),"G$_BANNER_REPORT_HEADER.DEFAULT_COMM_MODE");
			copy(getGjbpdftReportValue(pReportName, toStr("76"), toStr("YES")),"G$_BANNER_REPORT_HEADER.DEFAULT_PARAMFORM_DESIG");

			//this.getLogger().trace(this, "F2J : loadDefaults procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		*   
/* </p>
		*/
		public void disableReportBlockItems()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			setItemEnabled(globalGoItemId, false);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_DESTYPE", false);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_DESNAME", false);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_EXECUTION_MODE", false);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_COMM_MODE", false);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_PARAMFORM_DESIGNATION", false);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_SUBMIT_BTN", false);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_CANCEL_BTN", false);

			//this.getLogger().trace(this, "F2J : disableReportBlockItems procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void enableReportBlockItems()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			setItemEnabled(globalGoItemId, true);
			setItemNavigable(globalGoItemId, true);
			//setItemNavigable(globalGoItemId, true);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_DESTYPE", true);
			setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_DESTYPE", true);
			//setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_DESTYPE", true);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_DESNAME", true);
			setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_DESNAME", true);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_EXECUTION_MODE", true);
			setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_EXECUTION_MODE", true);
			//setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_EXECUTION_MODE", true);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_COMM_MODE", true);
			setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_COMM_MODE", true);
			//setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_COMM_MODE", true);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_PARAMFORM_DESIGNATION", true);
			setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_PARAMFORM_DESIGNATION", true);
			//setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_PARAMFORM_DESIGNATION", true);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_SUBMIT_BTN", true);
			setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_SUBMIT_BTN", true);
			setItemEnabled("G$_BANNER_REPORT_BLOCK.OREP_CANCEL_BTN", true);
			setItemNavigable("G$_BANNER_REPORT_BLOCK.OREP_CANCEL_BTN", true);

			//this.getLogger().trace(this, "F2J : enableReportBlockItems procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pReportName
		* @param pNumber
		* @param pDefaultReportValue
		*/
		public NString getGjbpdftReportValue(NString pReportName, NString pNumber, NString pDefaultReportValue)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.

			NString lvTempValue= NString.getNull();
			NString lvUserValue= NString.getNull();
			String sqlgjbpdftCursor = "SELECT GJBPDFT_VALUE " +
	" FROM GJBPDFT " +
	" WHERE GJBPDFT_JOB = :P_P_REPORT_NAME AND GJBPDFT_NUMBER = :P_P_NUMBER AND GJBPDFT_JPRM_CODE IS NULL AND NVL(GJBPDFT_USER_ID, '*') = NVL(:P_LV_USER_VALUE, '*') ";
			DataCursor gjbpdftCursor = new DataCursor(sqlgjbpdftCursor);
			try {
				lvUserValue = getNameIn("GLOBAL.CURRENT_USER");
				//Setting query parameters
				gjbpdftCursor.addParameter("P_P_REPORT_NAME", pReportName);
				gjbpdftCursor.addParameter("P_P_NUMBER", pNumber);
				gjbpdftCursor.addParameter("P_LV_USER_VALUE", lvUserValue);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable gjbpdftCursor.
				gjbpdftCursor.open();
				ResultSet gjbpdftCursorResults = gjbpdftCursor.fetchInto();
				if ( gjbpdftCursorResults != null ) {
					lvTempValue = gjbpdftCursorResults.getStr(0);
				}
				if ( gjbpdftCursor.notFound() )
				{
				}
				else if ( lvTempValue.isNull() ) {
				}
				else {
					gjbpdftCursor.close();
					return ((upper(lvTempValue)));
				}
				gjbpdftCursor.close();
				
				
				//  -- --
				
				
				lvUserValue = toStr("");
				//Setting query parameters
				gjbpdftCursor.addParameter("P_P_REPORT_NAME", pReportName);
				gjbpdftCursor.addParameter("P_P_NUMBER", pNumber);
				gjbpdftCursor.addParameter("P_LV_USER_VALUE", lvUserValue);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable gjbpdftCursor.
				gjbpdftCursor.open();
				//ResultSet gjbpdftCursorResults = gjbpdftCursor.fetchInto();
				gjbpdftCursorResults = gjbpdftCursor.fetchInto();
				if ( gjbpdftCursorResults != null ) {
					lvTempValue = gjbpdftCursorResults.getStr(0);
				}
				if ( gjbpdftCursor.notFound() )
				{
					return ((pDefaultReportValue));
				}
				else {
					//gjbpdftCursor.close();
					return ((upper(lvTempValue)));
				}
				//gjbpdftCursor.close();
				}finally{
					gjbpdftCursor.close();
				}

			//this.getLogger().trace(this, "F2J : getGjbpdftReportValue function is not completely migrated yet. Please read the Migration Guide.");
			
			
			//return NString.getNull();
		}
/* <p>
		* 
		*  
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pReportName
		* @param pReportServer
		* @param pReportService
		* @param pReportDesformat
		* @param pReportDestype
		* @param pReportDesname
		* @param pReportExecutionMode
		* @param pReportCommMode
		* @param pReportParamformDesig
		* @param pReportParamNameList
		*/
		public NBool processReport(NString pReportName, NString pReportServer, NString pReportService, NString pReportDesformat, NString pReportDestype, NString pReportDesname, NString pReportExecutionMode, NString pReportCommMode, NString pReportParamformDesig, NString pReportParamNameList)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.

			//  --
			//  -- GLOBAL_paramlist_established is passed into oriaginal call of START_REPORT_WINDOW.
			//  -- This is done so as to know if Parameter_LIST "input_parms" list has been externally created to pass in
			//  -- parms 01, 02, 03 etc.  If Parameter_LIST "input_parms" has been created, append PARAMETERFORM "yes or no".
			//  -- otherwise create "input_parms" here and add PARAMETERFORM "yes or no".
			//  --
			UnknownTypes.ReportObject lvReportId= null;
			NBool lvReportSuccess= NBool.getNull();
			Hashtable lvListId= null;
			// F2J_NOT_SUPPORTED : Call to built-in "FIND_REPORT_OBJECT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin27".
			//			lvReportId = SupportClasses.FORMS40.FindReportObject("BANNER_REPORT");
			////
			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_REPORT_OBJECT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin27'.");
			
			lvListId = getParameterList("input_params");
			if ( globalParamlistEstablished.isNull() )
			{
				if ( !(lvListId == null) )
				{
					deleteParameterList(lvListId);
				}
				lvListId = createParameterList("input_params");
			}
			else {
				if ( (lvListId == null) )
				{
					errorMessage(GNls.Fget(toStr("GOQOREP-0009"), toStr("LIB"), toStr("*ERROR* Incorrect internal list name has been used.  Run Report Aborting.")));
					throw new ApplicationException();
				}
			}
			//  -- --
			if ( pReportParamformDesig.equals("YES") )
			{
				addParameter(lvListId, "PARAMFORM", "YES");
			}
			else {
				addParameter(lvListId, "PARAMFORM", "NO");
			}
			Ref<NBool> pReportSuccess_ref = new Ref<NBool>(lvReportSuccess);
			getContainer().getGSctRunReports().gSctRunReport(lvReportId, pReportName, pReportServer, pReportService, pReportDesformat, pReportDestype, pReportDesname, pReportExecutionMode, pReportCommMode, lvListId, pReportParamNameList, pReportSuccess_ref);
			lvReportSuccess = pReportSuccess_ref.val;
			return ((lvReportSuccess));

			//this.getLogger().trace(this, "F2J : processReport function is not completely migrated yet. Please read the Migration Guide.");
			
			
			//return NBool.getNull();
		}
/* <p>
		* 
		*   
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pReportName
		*/
		public void startReportWindow(NString pReportName) {
			startReportWindow(pReportName, NString.getNull());
		}

/* <p>
		* 
		*   
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pReportName
		* @param pParamlistEstablished
		*/
		public void startReportWindow(NString pReportName, NString pParamlistEstablished)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString lvMessage = toStr("");
			globalParamlistEstablished = pParamlistEstablished;
			if ( getGjbpdftReportValue(pReportName, toStr("77"), toStr("YES")).equals("YES") )
			{
				if ( !(globalGoItemId == null) )
				{
					if ( getItemEnabled(globalGoItemId).equals("FALSE") )
					{
						enableReportBlockItems();
						loadDefaults(pReportName);
					}
					goItem(globalGoItemId);
				}
			}
			else {
				loadDefaults(pReportName);
				Ref<NString> pMessage_ref = new Ref<NString>(lvMessage);
				getContainer().getGBannerReportEditing().editOrepRow(getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_DESFORMAT"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_DESTYPE"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_DESNAME"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_EXECUTION_MODE"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_COMM_MODE"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_PARAMFORM_DESIG"), pMessage_ref);
				lvMessage = pMessage_ref.val;
				if ( !lvMessage.isNull() )
				{
					lvMessage = GNls.Fget(toStr("GOQOREP-0010"), toStr("LIB"), toStr("*ERROR* Cannot process report %01%. Check the default Parameter(s). "), pReportName).append(lvMessage);
					errorMessage(lvMessage);
					throw new ApplicationException();
				}
				if ( processReport(getNameIn("G$_BANNER_REPORT_HEADER.OREP_NAME"), getNameIn("G$_BANNER_REPORT_HEADER.OREP_SERVER_NAME"), getNameIn("G$_BANNER_REPORT_HEADER.OREP_SERVICE"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_DESFORMAT"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_DESTYPE"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_DESNAME"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_EXECUTION_MODE"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_COMM_MODE"), getNameIn("G$_BANNER_REPORT_HEADER.DEFAULT_PARAMFORM_DESIG"), getNameIn("G$_BANNER_REPORT_HEADER.LIST_PARAM_NAMES")).not() )
				{
					errorMessage(GNls.Fget(toStr("GOQOREP-0011"), toStr("LIB"), toStr("*ERROR* Report Failed to Run")));
					throw new ApplicationException();
				}
			}
//
			//this.getLogger().trace(this, "F2J : startReportWindow procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
	
	
}
