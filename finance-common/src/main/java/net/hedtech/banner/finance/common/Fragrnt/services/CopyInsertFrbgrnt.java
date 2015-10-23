package net.hedtech.banner.finance.common.Fragrnt.services;

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
import net.hedtech.banner.finance.common.Fragrnt.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Fragrnt.model.*;

public class CopyInsertFrbgrnt extends AbstractSupportCodeObject {
	

	public CopyInsertFrbgrnt(ISupportCodeContainer container) {
		super(container);
	}

	public FragrntTask  getTask() {
		return (FragrntTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Fragrnt.model.FragrntModel getFormModel() {
		return getTask().getModel();
	}
	
	//Original PL/SQL code for Package Prog Unit (SPEC) COPY_INSERT_FRBGRNT
	/*
	 PACKAGE COPY_INSERT_frbgrnt IS
 PROCEDURE COPY_INSERT_FRRgrpi; 
 PROCEDURE COPY_INSERT_FOBTEXT;
 PROCEDURE COPY_INSERT_FRRgloc; 
 PROCEDURE COPY_INSERT_FRRgusn;
 PROCEDURE COPY_INSERT_FRBGBIL;
 PROCEDURE COPY_INSERT_FRRAGPT;
 END;
	*/
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) COPY_INSERT_FRBGRNT
		/*
		PACKAGE BODY COPY_INSERT_frbgrnt IS
PROCEDURE COPY_INSERT_FRRgrpi IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frrgrpi
     where frrgrpi_grnt_code = :copy_grnt_code;
  BEGIN
   open check_data;
   fetch check_data into pti_temp;
     if check_data%NOTFOUND then
        close check_data;
        RETURN;
     else
        close check_data;
     end if;
--   
  INSERT INTO FRRgrpi (FRRgrpi_grnt_CODE,
			FRRgrpi_ID_IND,
                        FRRgrpi_ID_PIDM,
			FRRgrpi_ORGN_CODE,
			FRRgrpi_SALUTATION,
                        FRRgrpi_TITLE,
			FRRgrpi_FTE,
			FRRgrpi_EMPLOYEE_IND,
                        FRRgrpi_ACTIVITY_DATE, 
			FRRgrpi_USER_ID,
			FRRGRPI_ADDR_TYPE,
			FRRGRPI_ADDR_SEQNO,
			FRRGRPI_PHONE_TYPE,
			FRRGRPI_TELE_SEQNO,
			FRRGRPI_BFRM_CODE,
			FRRGRPI_EMAIL)
  ( SELECT :frbgrnt_CODE, 
			FRRgrpi_ID_IND, 
			FRRgrpi_ID_PIDM, 
			FRRgrpi_ORGN_CODE, 
            		FRRgrpi_SALUTATION, 
			FRRgrpi_TITLE, 
			FRRgrpi_FTE, 
			FRRgrpi_EMPLOYEE_IND,
            		:frbgrnt_ACTIVITY_DATE,
			:frbgrnt_USER_ID,
			FRRGRPI_ADDR_TYPE,
			FRRGRPI_ADDR_SEQNO,
			FRRGRPI_PHONE_TYPE,
			FRRGRPI_TELE_SEQNO,
			FRRGRPI_BFRM_CODE,
			FRRGRPI_EMAIL
   FROM FRRgrpi
   WHERE FRRgrpi_grnt_CODE = :COPY_grnt_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;


--
PROCEDURE COPY_INSERT_FOBTEXT IS
   pti_temp   varchar2(1);

   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM FOBTEXT
   WHERE FOBTEXT_CODE = :COPY_grnt_CODE 
     AND FOBTEXT_DTYP_SEQ_NUM = 51
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
            :frbgrnt_CODE,			
            FOBTEXT_CHG_SEQ_NUM,		
            FOBTEXT_ITEM,			
            FOBTEXT_SEQ_NUM,		
            FOBTEXT_PIDM,			
            :frbgrnt_ACTIVITY_DATE,		
            :frbgrnt_USER_ID,		
            FOBTEXT_CLA_NUM,		
            FOBTEXT_PRT_IND,		
            FOBTEXT_TEXT			                       
   FROM FOBTEXT
   WHERE FOBTEXT_CODE = :COPY_grnt_CODE 
     AND FOBTEXT_DTYP_SEQ_NUM = 51
     AND FOBTEXT_CHG_SEQ_NUM IS NULL
     AND FOBTEXT_ITEM IS NULL);

    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;

PROCEDURE COPY_INSERT_FRRgloc IS
   PTI_TEMP   VARCHAR2(1);
   CURSOR CHECK_DATA IS
    SELECT 'X'
      FROM FRRgloc
     WHERE FRRgloc_grnt_CODE = :COPY_grnt_CODE;
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
  INSERT INTO FRRgloc (FRRgloc_grnt_CODE, FRRgloc_LOCN_CODE,FRRgloc_LOCN_RESEARCH_IND,
                       FRRgloc_ACTIVITY_DATE, FRRgloc_USER_ID) 
  ( SELECT :frbgrnt_CODE, FRRgloc_LOCN_CODE, FRRgloc_LOCN_RESEARCH_IND,
           :frbgrnt_ACTIVITY_DATE,:frbgrnt_USER_ID
   FROM FRRgloc
   WHERE FRRgloc_grnt_CODE = :COPY_grnt_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
--

PROCEDURE COPY_INSERT_FRRgusn IS
   PTI_TEMP   VARCHAR2(1);
   CURSOR CHECK_DATA IS 
    SELECT 'X'
      FROM FRRgusn
     WHERE FRRgusn_grnt_CODE = :COPY_grnt_CODE;
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
  INSERT INTO FRRgusn (FRRgusn_grnt_CODE,FRRgusn_SDAT_CODE_ATTR,
                       FRRgusn_SDAT_CODE_OPT_1,FRRgusn_ACTIVITY_DATE,FRRgusn_USER_ID)
  ( SELECT :frbgrnt_CODE, FRRgusn_SDAT_CODE_ATTR, FRRgusn_SDAT_CODE_OPT_1,
           :frbgrnt_ACTIVITY_DATE,:frbgrnt_USER_ID
   FROM FRRgusn
   WHERE FRRgusn_grnt_CODE = :COPY_grnt_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
--
PROCEDURE COPY_INSERT_FRBGBIL IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frbgbil
     where frbgbil_grnt_code = :copy_grnt_code;
  BEGIN
   open check_data;
   fetch check_data into pti_temp;
     if check_data%NOTFOUND then
        close check_data;
        RETURN;
     else
        close check_data;
     end if;
--   
  INSERT INTO FRBGBIL (FRBGBIL_grnt_CODE,
			FRBGBIL_COAS_CODE,
      FRBGBIL_ACTIVITY_DATE, 
			FRBGBIL_USER_ID,
			FRBGBIL_PMSC_CODE,
			FRBGBIL_BECL_CODE,
			FRBGBIL_BUDGET_LIMIT_IND,
			FRBGBIL_PAYMENT_FUND_CODE,
			FRBGBIL_PAYMENT_ACCT_CODE,
			FRBGBIL_CLEARING_ACCT_CODE,
			FRBGBIL_ADDR_TYPE,
			FRBGBIL_ADDR_SEQNO,
			FRBGBIL_BFRM_CODE_1034_EXT,
			FRBGBIL_BUD_LINE_EXCEED_IND,
			FRBGBIL_MIN_NOT_REACHED_IND,
			FRBGBIL_BUD_TOTAL_EXCEED_IND,
			FRBGBIL_BUD_CHECK_SOURCE_IND,
			FRBGBIL_BILLING_START_DATE,
			FRBGBIL_BILLING_END_DATE,
			FRBGBIL_BILLING_MIN_AMT,
			FRBGBIL_BILLING_MAX_AMT,
			FRBGBIL_DEFERRED_ACCT_CODE)
  ( SELECT :FRBGRNT_CODE,        
		FRBGBIL_COAS_CODE,                   
           	:FRBGRNT_ACTIVITY_DATE,
		:FRBGRNT_USER_ID,
		FRBGBIL_PMSC_CODE,
		FRBGBIL_BECL_CODE,
		FRBGBIL_BUDGET_LIMIT_IND,
		FRBGBIL_PAYMENT_FUND_CODE,
		FRBGBIL_PAYMENT_ACCT_CODE,
		FRBGBIL_CLEARING_ACCT_CODE,
		FRBGBIL_ADDR_TYPE,
		FRBGBIL_ADDR_SEQNO,
		FRBGBIL_BFRM_CODE_1034_EXT,
		FRBGBIL_BUD_LINE_EXCEED_IND,
		FRBGBIL_MIN_NOT_REACHED_IND,
		FRBGBIL_BUD_TOTAL_EXCEED_IND,
		FRBGBIL_BUD_CHECK_SOURCE_IND,
		FRBGBIL_BILLING_START_DATE,
		FRBGBIL_BILLING_END_DATE,
		FRBGBIL_BILLING_MIN_AMT,
		FRBGBIL_BILLING_MAX_AMT,
		FRBGBIL_DEFERRED_ACCT_CODE
   FROM FRBGBIL
   WHERE FRBGBIL_grnt_CODE = :COPY_GRNT_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END;
  
PROCEDURE COPY_INSERT_FRRAGPT IS
			pti_temp   varchar2(1);
   		cursor check_data is
    	select 'X'
    	from FRRAGPT
    	where frragpt_grnt_code = :copy_grnt_code;
BEGIN
			open check_data;
   		fetch check_data into pti_temp;
   		if check_data%NOTFOUND then
   				:frbgrnt.display_pass_thru_ind := 'N';
      	  close check_data;
        	RETURN;
   		else
   				:frbgrnt.display_pass_thru_ind := 'Y';
        	close check_data;
     	end if;
     	--RPE# 1-19V7ZZD : Include the new sponsor Id column also in the insert list
     	INSERT INTO FRRAGPT ( FRRAGPT_GRNT_CODE,             
 														FRRAGPT_AGCY_PIDM,
 														FRRAGPT_ACTIVITY_DATE,
 														FRRAGPT_USER_ID,
 														FRRAGPT_FEDERAL_FUND_PERCENT,
 														FRRAGPT_SPONSOR_ID)
 			(SELECT :FRBGRNT_CODE,             
 							FRRAGPT_AGCY_PIDM,
 							sysdate,
 							:global.user_id,
 							FRRAGPT_FEDERAL_FUND_PERCENT,
 							FRRAGPT_SPONSOR_ID
 				FROM FRRAGPT
 				WHERE frragpt_grnt_code = :copy_grnt_code);
 				IF SQL%NOTFOUND THEN 
       			RAISE FORM_TRIGGER_FAILURE;
    		END IF;
END;

END COPY_INSERT_frbgrnt;
		*/
		/* <p>
/* </p>
		*/
		public void copyInsertFrrgrpi(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frrgrpi " +
	" WHERE frrgrpi_grnt_code = :COPY_GRNT_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
				checkData.open();
				ResultSet checkDataResults = checkData.fetchInto();
				if ( checkDataResults != null ) {
					ptiTemp = checkDataResults.getStr(0);
				}
				if ( checkData.notFound() )
				{
					return ;
				}
				else {
				}
			} finally {
				checkData.close();
			}
			//    
			String sql1 = "INSERT INTO FRRgrpi "
				+ "(FRRgrpi_grnt_CODE, FRRgrpi_ID_IND, FRRgrpi_ID_PIDM, FRRgrpi_ORGN_CODE, FRRgrpi_SALUTATION, FRRgrpi_TITLE, FRRgrpi_FTE, FRRgrpi_EMPLOYEE_IND, FRRgrpi_ACTIVITY_DATE, FRRgrpi_USER_ID, FRRGRPI_ADDR_TYPE, FRRGRPI_ADDR_SEQNO, FRRGRPI_PHONE_TYPE, FRRGRPI_TELE_SEQNO, FRRGRPI_BFRM_CODE, FRRGRPI_EMAIL)"
				+ "(SELECT :FRBGRNT_CODE, FRRgrpi_ID_IND, FRRgrpi_ID_PIDM, FRRgrpi_ORGN_CODE, FRRgrpi_SALUTATION, FRRgrpi_TITLE, FRRgrpi_FTE, FRRgrpi_EMPLOYEE_IND, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID, FRRGRPI_ADDR_TYPE, FRRGRPI_ADDR_SEQNO, FRRGRPI_PHONE_TYPE, FRRGRPI_TELE_SEQNO, FRRGRPI_BFRM_CODE, FRRGRPI_EMAIL "
				+ " FROM FRRgrpi "
				+ " WHERE FRRgrpi_grnt_CODE = :COPY_GRNT_CODE )";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command1.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command1.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command1.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}
/* <p>
		* 
/* </p>
		*/
		public void copyInsertFobtext()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
									" FROM FOBTEXT " +
									" WHERE FOBTEXT_CODE = :COPY_GRNT_CODE AND FOBTEXT_DTYP_SEQ_NUM = 51 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiTemp = ptiCursorResults.getStr(0);
				}
				if ( ptiCursor.notFound() )
				{
					return ;
				}
				else {
				}
			} finally {
				ptiCursor.close();
			}
			//    
			String sql2 = "INSERT INTO FOBTEXT " +
							"(FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE, FOBTEXT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT)" +
							"(SELECT FOBTEXT_DTYP_SEQ_NUM, :FRBGRNT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT " +
							" FROM FOBTEXT " +
							" WHERE FOBTEXT_CODE = :COPY_GRNT_CODE AND FOBTEXT_DTYP_SEQ_NUM = 51 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL )";
			DataCommand command2 = new DataCommand(sql2);
			
			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter(true);
			//Setting query parameters
			command2.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command2.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command2.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command2.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
			rowCount = command2.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}
/* <p>
/* </p>
		*/
		public void copyInsertFrrgloc()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM FRRgloc " +
	" WHERE FRRgloc_grnt_CODE = :COPY_GRNT_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
				checkData.open();
				ResultSet checkDataResults = checkData.fetchInto();
				if ( checkDataResults != null ) {
					ptiTemp = checkDataResults.getStr(0);
				}
				if ( checkData.notFound() )
				{
					return ;
				}
				else {
				}
			} finally {
				checkData.close();
			}
			//    
			String sql3 = "INSERT INTO FRRgloc " +
	"(FRRgloc_grnt_CODE, FRRgloc_LOCN_CODE, FRRgloc_LOCN_RESEARCH_IND, FRRgloc_ACTIVITY_DATE, FRRgloc_USER_ID)" +
	"(SELECT :FRBGRNT_CODE, FRRgloc_LOCN_CODE, FRRgloc_LOCN_RESEARCH_IND, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID " +
	" FROM FRRgloc " +
	" WHERE FRRgloc_grnt_CODE = :COPY_GRNT_CODE )";
			DataCommand command3 = new DataCommand(sql3);
			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter(true);
			//Setting query parameters
			command3.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command3.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command3.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command3.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
			rowCount = command3.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}
/* <p>
		* 
/* </p>
		*/
		public void copyInsertFrrgusn()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM FRRgusn " +
	" WHERE FRRgusn_grnt_CODE = :COPY_GRNT_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
				checkData.open();
				ResultSet checkDataResults = checkData.fetchInto();
				if ( checkDataResults != null ) {
					ptiTemp = checkDataResults.getStr(0);
				}
				if ( checkData.notFound() )
				{
					return ;
				}
				else {
				}
			} finally {
				checkData.close();
			}
			//    
			String sql4 = "INSERT INTO FRRgusn " +
	"(FRRgusn_grnt_CODE, FRRgusn_SDAT_CODE_ATTR, FRRgusn_SDAT_CODE_OPT_1, FRRgusn_ACTIVITY_DATE, FRRgusn_USER_ID)" +
	"(SELECT :FRBGRNT_CODE, FRRgusn_SDAT_CODE_ATTR, FRRgusn_SDAT_CODE_OPT_1, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID " +
	" FROM FRRgusn " +
	" WHERE FRRgusn_grnt_CODE = :COPY_GRNT_CODE )";
			DataCommand command4 = new DataCommand(sql4);
			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter(true);
			//Setting query parameters
			command4.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command4.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command4.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command4.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
			rowCount = command4.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}
/* <p>
		* 
/* </p>
		*/
		public void copyInsertFrbgbil()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frbgbil " +
	" WHERE frbgbil_grnt_code = :COPY_GRNT_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
				checkData.open();
				ResultSet checkDataResults = checkData.fetchInto();
				if ( checkDataResults != null ) {
					ptiTemp = checkDataResults.getStr(0);
				}
				if ( checkData.notFound() )
				{
					return ;
				}
				else {
				}
			} finally {
				checkData.close();
			}
			//    
			String sql5 = "INSERT INTO FRBGBIL " +
	"(FRBGBIL_grnt_CODE, FRBGBIL_COAS_CODE, FRBGBIL_ACTIVITY_DATE, FRBGBIL_USER_ID, FRBGBIL_PMSC_CODE, FRBGBIL_BECL_CODE, FRBGBIL_BUDGET_LIMIT_IND, FRBGBIL_PAYMENT_FUND_CODE, FRBGBIL_PAYMENT_ACCT_CODE, FRBGBIL_CLEARING_ACCT_CODE, FRBGBIL_ADDR_TYPE, FRBGBIL_ADDR_SEQNO, FRBGBIL_BFRM_CODE_1034_EXT, FRBGBIL_BUD_LINE_EXCEED_IND, FRBGBIL_MIN_NOT_REACHED_IND, FRBGBIL_BUD_TOTAL_EXCEED_IND, FRBGBIL_BUD_CHECK_SOURCE_IND, FRBGBIL_BILLING_START_DATE, FRBGBIL_BILLING_END_DATE, FRBGBIL_BILLING_MIN_AMT, FRBGBIL_BILLING_MAX_AMT, FRBGBIL_DEFERRED_ACCT_CODE)" +
	"(SELECT :FRBGRNT_CODE, FRBGBIL_COAS_CODE, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID, FRBGBIL_PMSC_CODE, FRBGBIL_BECL_CODE, FRBGBIL_BUDGET_LIMIT_IND, FRBGBIL_PAYMENT_FUND_CODE, FRBGBIL_PAYMENT_ACCT_CODE, FRBGBIL_CLEARING_ACCT_CODE, FRBGBIL_ADDR_TYPE, FRBGBIL_ADDR_SEQNO, FRBGBIL_BFRM_CODE_1034_EXT, FRBGBIL_BUD_LINE_EXCEED_IND, FRBGBIL_MIN_NOT_REACHED_IND, FRBGBIL_BUD_TOTAL_EXCEED_IND, FRBGBIL_BUD_CHECK_SOURCE_IND, FRBGBIL_BILLING_START_DATE, FRBGBIL_BILLING_END_DATE, FRBGBIL_BILLING_MIN_AMT, FRBGBIL_BILLING_MAX_AMT, FRBGBIL_DEFERRED_ACCT_CODE " +
	" FROM FRBGBIL " +
	" WHERE FRBGBIL_grnt_CODE = :COPY_GRNT_CODE )";
			DataCommand command5 = new DataCommand(sql5);
			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter(true);
			//Setting query parameters
			command5.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command5.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command5.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command5.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
			rowCount = command5.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}
/* <p>
/* </p>
		*/
		public void copyInsertFrragpt()
		{
			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter(true);
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM FRRAGPT " +
	" WHERE frragpt_grnt_code = :COPY_GRNT_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
				checkData.open();
				ResultSet checkDataResults = checkData.fetchInto();
				if ( checkDataResults != null ) {
					ptiTemp = checkDataResults.getStr(0);
				}
				if ( checkData.notFound() )
				{
					frbgrntElement.setDisplayPassThruInd(toStr("N"));
					return ;
				}
				else {
					frbgrntElement.setDisplayPassThruInd(toStr("Y"));
				}
			} finally {
				checkData.close();
			}
			// RPE# 1-19V7ZZD : Include the new sponsor Id column also in the insert list
			String sql6 = "INSERT INTO FRRAGPT " +
	"(FRRAGPT_GRNT_CODE, FRRAGPT_AGCY_PIDM, FRRAGPT_ACTIVITY_DATE, FRRAGPT_USER_ID, FRRAGPT_FEDERAL_FUND_PERCENT, FRRAGPT_SPONSOR_ID)" +
	"(SELECT :FRBGRNT_CODE, FRRAGPT_AGCY_PIDM, sysdate, :GLOBAL_USER_ID, FRRAGPT_FEDERAL_FUND_PERCENT, FRRAGPT_SPONSOR_ID " +
	" FROM FRRAGPT " +
	" WHERE frragpt_grnt_code = :COPY_GRNT_CODE )";
			DataCommand command6 = new DataCommand(sql6);
			//Setting query parameters
			command6.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command6.addParameter("GLOBAL_USER_ID", getGlobal("USER_ID"));
			command6.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
			rowCount = command6.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}
		
	
	
}
