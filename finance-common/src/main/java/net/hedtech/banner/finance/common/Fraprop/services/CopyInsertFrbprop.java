package net.hedtech.banner.finance.common.Fraprop.services;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
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
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import net.hedtech.banner.finance.common.Fragrnt.model.FrbgrntAdapter;
import net.hedtech.banner.finance.common.Fraprop.*;
//import com.ellucian.common.dbservices.*;
//import com.ellucian.common.dbservices.dbtypes.*;
//import net.hedtech.banner.finance.libraries.Goqwflw.*;
//import net.hedtech.banner.finance.libraries.Goqrpls.*;
//import net.hedtech.banner.finance.libraries.Foqrpls.*;
//import net.hedtech.banner.finance.libraries.Eoqrpls.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Fraprop.model.*;


public class CopyInsertFrbprop extends AbstractSupportCodeObject {
	

	public CopyInsertFrbprop(ISupportCodeContainer container) {
		super(container);
	}

	public FrapropTask  getTask() {
		return (FrapropTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Fraprop.model.FrapropModel getFormModel() {
		return getTask().getModel();
	}
	
	//Original PL/SQL code for Package Prog Unit (SPEC) COPY_INSERT_FRBPROP
	/*
	PACKAGE COPY_INSERT_FRBPROP IS
 PROCEDURE COPY_INSERT_FRRPRPI; 
 PROCEDURE COPY_INSERT_FOBTEXT;
 PROCEDURE COPY_INSERT_FRRPLOC; 
 PROCEDURE COPY_INSERT_FRRPUSN;
 PROCEDURE COPY_INSERT_FRRPRPT;
 END;
	*/
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) COPY_INSERT_FRBPROP
		/*
		PACKAGE BODY COPY_INSERT_FRBPROP IS
PROCEDURE COPY_INSERT_FOBTEXT IS
   pti_temp   varchar2(1);

   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM FOBTEXT
   WHERE FOBTEXT_CODE = :COPY_PROP_CODE 
     AND FOBTEXT_DTYP_SEQ_NUM = 29
     AND FOBTEXT_CHG_SEQ_NUM IS NULL
     AND FOBTEXT_ITEM IS NULL;
  BEGIN
   OPEN PTI_CURSOR;
   FETCH PTI_CURSOR INTO pti_temp;
     IF PTI_CURSOR%NOTFOUND THEN
        CLOSE PTI_CURSOR;
        RETURN;
     ELSE
        CLOSE PTI_CURSOR;
     END IF;
--   
  INSERT INTO FOBTEXT (FOBTEXT_DTYP_SEQ_NUM,FOBTEXT_CODE,FOBTEXT_CHG_SEQ_NUM,
                       FOBTEXT_ITEM,FOBTEXT_SEQ_NUM,FOBTEXT_PIDM,FOBTEXT_ACTIVITY_DATE,
                       FOBTEXT_USER_ID,FOBTEXT_CLA_NUM,FOBTEXT_PRT_IND,FOBTEXT_TEXT)
  ( SELECT  FOBTEXT_DTYP_SEQ_NUM,		
            :FRBPROP_CODE,			
            FOBTEXT_CHG_SEQ_NUM,		
            FOBTEXT_ITEM,			
            FOBTEXT_SEQ_NUM,		
            FOBTEXT_PIDM,			
            :FRBPROP_ACTIVITY_DATE,		
            :FRBPROP_USER_ID,		
            FOBTEXT_CLA_NUM,		
            FOBTEXT_PRT_IND,		
            FOBTEXT_TEXT			                       
   FROM FOBTEXT
   WHERE FOBTEXT_CODE = :COPY_PROP_CODE 
     AND FOBTEXT_DTYP_SEQ_NUM = 29
     AND FOBTEXT_CHG_SEQ_NUM IS NULL
     AND FOBTEXT_ITEM IS NULL);

    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;

PROCEDURE COPY_INSERT_FRRPLOC IS
   PTI_TEMP   VARCHAR2(1);
   CURSOR CHECK_DATA IS
    SELECT 'X'
      FROM FRRPLOC
     WHERE FRRPLOC_PROP_CODE = :COPY_PROP_CODE;
  BEGIN
   OPEN CHECK_DATA;
   FETCH CHECK_DATA INTO PTI_TEMP;
   IF CHECK_DATA%NOTFOUND THEN
      CLOSE CHECK_DATA;
      RETURN;
   ELSE
      CLOSE CHECK_DATA;
   END IF;
--   
  INSERT INTO FRRPLOC (FRRPLOC_PROP_CODE, FRRPLOC_LOCN_CODE,FRRPLOC_LOCN_RESEARCH_IND,
                       FRRPLOC_ACTIVITY_DATE, FRRPLOC_USER_ID) 
  ( SELECT :FRBPROP_CODE, FRRPLOC_LOCN_CODE, FRRPLOC_LOCN_RESEARCH_IND,
           :FRBPROP_ACTIVITY_DATE,:FRBPROP_USER_ID
   FROM FRRPLOC
   WHERE FRRPLOC_PROP_CODE = :COPY_PROP_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
--
PROCEDURE COPY_INSERT_FRRPRPI IS
   PTI_TEMP   VARCHAR2(1);
   CURSOR CHECK_DATA IS
    SELECT 'X'
      FROM FRRPRPI
     WHERE FRRPRPI_PROP_CODE = :COPY_PROP_CODE;
  BEGIN
   OPEN CHECK_DATA;
   FETCH CHECK_DATA INTO PTI_TEMP;
   IF CHECK_DATA%NOTFOUND THEN
      CLOSE CHECK_DATA;
      RETURN;
   ELSE
      CLOSE CHECK_DATA;
   END IF;
--   
  INSERT INTO FRRPRPI(FRRPRPI_PROP_CODE,FRRPRPI_ID_IND,
                       FRRPRPI_ID_PIDM,FRRPRPI_ORGN_CODE,FRRPRPI_SALUTATION,
                       FRRPRPI_TITLE,FRRPRPI_FTE,FRRPRPI_EMPLOYEE_IND,
                       FRRPRPI_ACTIVITY_DATE, FRRPRPI_USER_ID) 
  ( SELECT :FRBPROP_CODE, FRRPRPI_ID_IND, FRRPRPI_ID_PIDM, FRRPRPI_ORGN_CODE, 
            FRRPRPI_SALUTATION, FRRPRPI_TITLE, FRRPRPI_FTE, FRRPRPI_EMPLOYEE_IND,
            :FRBPROP_ACTIVITY_DATE,:FRBPROP_USER_ID
   FROM FRRPRPI
   WHERE FRRPRPI_PROP_CODE = :COPY_PROP_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
--
PROCEDURE COPY_INSERT_FRRPUSN IS
   PTI_TEMP   VARCHAR2(1);
   CURSOR CHECK_DATA IS 
    SELECT 'X'
      FROM FRRPUSN
     WHERE FRRPUSN_PROP_CODE = :COPY_PROP_CODE;
  BEGIN
   OPEN CHECK_DATA;
   FETCH CHECK_DATA INTO PTI_TEMP;
   IF CHECK_DATA%NOTFOUND THEN
      CLOSE CHECK_DATA;
      RETURN;
   ELSE
      CLOSE CHECK_DATA;
   END IF;
--   
  INSERT INTO FRRPUSN (FRRPUSN_PROP_CODE,FRRPUSN_SDAT_CODE_ATTR,
                       FRRPUSN_SDAT_CODE_OPT_1,FRRPUSN_ACTIVITY_DATE,FRRPUSN_USER_ID)
  ( SELECT :FRBPROP_CODE, FRRPUSN_SDAT_CODE_ATTR, FRRPUSN_SDAT_CODE_OPT_1,
           :FRBPROP_ACTIVITY_DATE,:FRBPROP_USER_ID
   FROM FRRPUSN
   WHERE FRRPUSN_PROP_CODE = :COPY_PROP_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;

PROCEDURE COPY_INSERT_FRRPRPT IS
		pti_temp   varchar2(1);
   	cursor check_data is
    select 'X'
    from frrprpt
    where frrprpt_prop_code = :copy_prop_code;
BEGIN
   	open check_data;
   	fetch check_data into pti_temp;
    if check_data%NOTFOUND then
    		:frbprop.display_pass_thru_ind := 'N';
        close check_data;
        RETURN;
    else
    		:frbprop.display_pass_thru_ind := 'Y';
        close check_data;
    end if;
  						
		INSERT INTO FRRPRPT (	FRRPRPT_PROP_CODE,
													FRRPRPT_AGCY_PIDM,
 													FRRPRPT_ACTIVITY_DATE,          
 													FRRPRPT_USER_ID,                
 													FRRPRPT_FEDERAL_FUND_PERCENT )  
  	( SELECT :FRBPROP_CODE,
  						FRRPRPT_AGCY_PIDM,
  						SYSDATE,
  						:GLOBAL.USER_ID,
  						FRRPRPT_FEDERAL_FUND_PERCENT
		  FROM FRRPRPT
   		WHERE frrprpt_prop_code = :copy_prop_code);
    	IF SQL%NOTFOUND THEN 
       		RAISE FORM_TRIGGER_FAILURE;
    	END IF;
END;

END COPY_INSERT_FRBPROP;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyInsertFobtext(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM FOBTEXT " +
	" WHERE FOBTEXT_CODE = :COPY_PROP_CODE AND FOBTEXT_DTYP_SEQ_NUM = 29 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiTemp = ptiCursorResults.getStr(0);
				}
				if ( ptiCursor.notFound() )
				{
					ptiCursor.close();
					return ;
				}
				else {
					ptiCursor.close();
				}
				//    
				String sql1 = "INSERT INTO FOBTEXT " +
	"(FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE, FOBTEXT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT)" +
	"(SELECT SELECT FOBTEXT_DTYP_SEQ_NUM, :FRBPROP_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, :FRBPROP_ACTIVITY_DATE, :FRBPROP_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT " +
	" FROM FOBTEXT " +
	" WHERE FOBTEXT_CODE = :COPY_PROP_CODE AND FOBTEXT_DTYP_SEQ_NUM = 29 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL )";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
				command1.addParameter("FRBPROP_ACTIVITY_DATE", frbpropElement.getFrbpropActivityDate());
				command1.addParameter("FRBPROP_USER_ID", frbpropElement.getFrbpropUserId());
				command1.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				rowCount = command1.execute();
				if ( rowCount == 0 )
				{
					throw new ApplicationException();
				}
				}finally{
					ptiCursor.close();
				}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyInsertFrrploc()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM FRRPLOC " +
	" WHERE FRRPLOC_PROP_CODE = :COPY_PROP_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkData.
				checkData.open();
				ResultSet checkDataResults = checkData.fetchInto();
				if ( checkDataResults != null ) {
					ptiTemp = checkDataResults.getStr(0);
				}
				if ( checkData.notFound() )
				{
					checkData.close();
					return ;
				}
				else {
					checkData.close();
				}
				//    
				String sql2 = "INSERT INTO FRRPLOC " +
	"(FRRPLOC_PROP_CODE, FRRPLOC_LOCN_CODE, FRRPLOC_LOCN_RESEARCH_IND, FRRPLOC_ACTIVITY_DATE, FRRPLOC_USER_ID)" +
	"(SELECT SELECT :FRBPROP_CODE, FRRPLOC_LOCN_CODE, FRRPLOC_LOCN_RESEARCH_IND, :FRBPROP_ACTIVITY_DATE, :FRBPROP_USER_ID " +
	" FROM FRRPLOC " +
	" WHERE FRRPLOC_PROP_CODE = :COPY_PROP_CODE )";
				DataCommand command2 = new DataCommand(sql2);
				
				FrbpropAdapter frbpropElement = (FrbpropAdapter) this.getFormModel().getFrbprop().getRowAdapter(true);

				//Setting query parameters
				command2.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
				command2.addParameter("FRBPROP_ACTIVITY_DATE", frbpropElement.getFrbpropActivityDate());
				command2.addParameter("FRBPROP_USER_ID", frbpropElement.getFrbpropUserId());
				command2.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				rowCount = command2.execute();
				if ( rowCount == 0 )
				{
					throw new ApplicationException();
				}
				}finally{
					checkData.close();
				}
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyInsertFrrprpi()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM FRRPRPI " +
	" WHERE FRRPRPI_PROP_CODE = :COPY_PROP_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkData.
				checkData.open();
				ResultSet checkDataResults = checkData.fetchInto();
				if ( checkDataResults != null ) {
					ptiTemp = checkDataResults.getStr(0);
				}
				if ( checkData.notFound() )
				{
					checkData.close();
					return ;
				}
				else {
					checkData.close();
				}
				//    
				String sql3 = "INSERT INTO FRRPRPI " +
	"(FRRPRPI_PROP_CODE, FRRPRPI_ID_IND, FRRPRPI_ID_PIDM, FRRPRPI_ORGN_CODE, FRRPRPI_SALUTATION, FRRPRPI_TITLE, FRRPRPI_FTE, FRRPRPI_EMPLOYEE_IND, FRRPRPI_ACTIVITY_DATE, FRRPRPI_USER_ID)" +
	"(SELECT SELECT :FRBPROP_CODE, FRRPRPI_ID_IND, FRRPRPI_ID_PIDM, FRRPRPI_ORGN_CODE, FRRPRPI_SALUTATION, FRRPRPI_TITLE, FRRPRPI_FTE, FRRPRPI_EMPLOYEE_IND, :FRBPROP_ACTIVITY_DATE, :FRBPROP_USER_ID " +
	" FROM FRRPRPI " +
	" WHERE FRRPRPI_PROP_CODE = :COPY_PROP_CODE )";
				DataCommand command3 = new DataCommand(sql3);
				
				FrbpropAdapter frbpropElement = (FrbpropAdapter) this.getFormModel().getFrbprop().getRowAdapter(true);
				
				//Setting query parameters
				command3.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
				command3.addParameter("FRBPROP_ACTIVITY_DATE", frbpropElement.getFrbpropActivityDate());
				command3.addParameter("FRBPROP_USER_ID", frbpropElement.getFrbpropUserId());
				command3.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				rowCount = command3.execute();
				if ( rowCount == 0 )
				{
					throw new ApplicationException();
				}
				}finally{
					checkData.close();
				}
		}
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyInsertFrrpusn()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM FRRPUSN " +
	" WHERE FRRPUSN_PROP_CODE = :COPY_PROP_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkData.
				checkData.open();
				ResultSet checkDataResults = checkData.fetchInto();
				if ( checkDataResults != null ) {
					ptiTemp = checkDataResults.getStr(0);
				}
				if ( checkData.notFound() )
				{
					checkData.close();
					return ;
				}
				else {
					checkData.close();
				}
				//    
				String sql4 = "INSERT INTO FRRPUSN " +
	"(FRRPUSN_PROP_CODE, FRRPUSN_SDAT_CODE_ATTR, FRRPUSN_SDAT_CODE_OPT_1, FRRPUSN_ACTIVITY_DATE, FRRPUSN_USER_ID)" +
	"(SELECT SELECT :FRBPROP_CODE, FRRPUSN_SDAT_CODE_ATTR, FRRPUSN_SDAT_CODE_OPT_1, :FRBPROP_ACTIVITY_DATE, :FRBPROP_USER_ID " +
	" FROM FRRPUSN " +
	" WHERE FRRPUSN_PROP_CODE = :COPY_PROP_CODE )";
				DataCommand command4 = new DataCommand(sql4);
				
				FrbpropAdapter frbpropElement = (FrbpropAdapter) this.getFormModel().getFrbprop().getRowAdapter(true);
				
				//Setting query parameters
				command4.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
				command4.addParameter("FRBPROP_ACTIVITY_DATE", frbpropElement.getFrbpropActivityDate());
				command4.addParameter("FRBPROP_USER_ID", frbpropElement.getFrbpropUserId());
				command4.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				rowCount = command4.execute();
				if ( rowCount == 0 )
				{
					throw new ApplicationException();
				}
				}finally{
					checkData.close();
				}
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyInsertFrrprpt(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frrprpt " +
	" WHERE frrprpt_prop_code = :COPY_PROP_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkData.
				checkData.open();
				ResultSet checkDataResults = checkData.fetchInto();
				if ( checkDataResults != null ) {
					ptiTemp = checkDataResults.getStr(0);
				}
				if ( checkData.notFound() )
				{
					frbpropElement.setDisplayPassThruInd(toStr("N"));
					checkData.close();
					return ;
				}
				else {
					frbpropElement.setDisplayPassThruInd(toStr("Y"));
					checkData.close();
				}
				String sql5 = "INSERT INTO FRRPRPT " +
	"(FRRPRPT_PROP_CODE, FRRPRPT_AGCY_PIDM, FRRPRPT_ACTIVITY_DATE, FRRPRPT_USER_ID, FRRPRPT_FEDERAL_FUND_PERCENT)" +
	"(SELECT SELECT :FRBPROP_CODE, FRRPRPT_AGCY_PIDM, SYSDATE, :GLOBAL_USER_ID, FRRPRPT_FEDERAL_FUND_PERCENT " +
	" FROM FRRPRPT " +
	" WHERE frrprpt_prop_code = :COPY_PROP_CODE )";
				DataCommand command5 = new DataCommand(sql5);
				//Setting query parameters
				command5.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
				command5.addParameter("GLOBAL_USER_ID", getGlobal("USER_ID"));
				command5.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				rowCount = command5.execute();
				if ( rowCount == 0 )
				{
					throw new ApplicationException();
				}
				}finally{
					checkData.close();
				}
		}
		
	
	
}
