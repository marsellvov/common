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

public class CopyFromPropTo extends AbstractSupportCodeObject {
	

	public CopyFromPropTo(ISupportCodeContainer container) {
		super(container);
	}

	public FragrntTask  getTask() {
		return (FragrntTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Fragrnt.model.FragrntModel getFormModel() {
		return getTask().getModel();
	}
	
	//Original PL/SQL code for Package Prog Unit (SPEC) COPY_FROM_PROP_TO
	/*
	PACKAGE COPY_FROM_PROP_TO IS
  PROCEDURE COPY_FROM_PROP_FRBGBIL;
  PROCEDURE COPY_FROM_PROP_FRRGLOC;
  PROCEDURE COPY_FROM_PROP_FRRGRPI;
  PROCEDURE COPY_FROM_PROP_FRRGUSN;
  PROCEDURE COPY_FROM_TO_FOATEXT;
  PROCEDURE COPY_FROM_PROP_FRRAGPT;
END;
	*/
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) COPY_FROM_PROP_TO
		/*
		PACKAGE BODY COPY_FROM_PROP_TO IS
  PROCEDURE COPY_FROM_PROP_FRBGBIL IS
BEGIN
null;
END;
--
PROCEDURE COPY_FROM_PROP_FRRGLOC IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frrploc
     where frrploc_prop_code = :display_prop_code;
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
  INSERT INTO FRRgloc( FRRgloc_grnt_CODE,FRRgloc_LOCN_CODE,
                       FRRgloc_LOCN_RESEARCH_IND,FRRgloc_ACTIVITY_DATE,FRRgloc_USER_ID) 
  ( SELECT :frbgrnt_CODE, FRRploc_LOCN_CODE, FRRploc_LOCN_RESEARCH_IND,                                    
            :frbgrnt_ACTIVITY_DATE,:frbgrnt_USER_ID
   FROM FRRploc
   WHERE FRRploc_prop_CODE = :display_prop_code);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
--
PROCEDURE COPY_FROM_PROP_FRRGRPI IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frrprpi
     where frrprpi_prop_code = :display_prop_code;
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
  INSERT INTO FRRgrpi (FRRgrpi_grnt_CODE,FRRgrpi_ID_IND,
                       FRRgrpi_ID_PIDM,FRRgrpi_ORGN_CODE,FRRgrpi_SALUTATION,
                       FRRgrpi_TITLE,FRRgrpi_FTE,FRRgrpi_EMPLOYEE_IND,
                       FRRgrpi_ACTIVITY_DATE, FRRgrpi_USER_ID)
  ( SELECT :frbgrnt_CODE, FRRprpi_ID_IND, FRRprpi_ID_PIDM, FRRprpi_ORGN_CODE, 
            FRRprpi_SALUTATION, FRRprpi_TITLE, FRRprpi_FTE, FRRprpi_EMPLOYEE_IND,
            :frbgrnt_ACTIVITY_DATE,:frbgrnt_USER_ID
   FROM FRRprpi
   WHERE FRRprpi_prop_CODE = :display_prop_code);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;


--
PROCEDURE COPY_FROM_PROP_FRRGUSN IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frrPusn
     where frrPusn_PROP_code = :DISPLAY_PROP_CODE;
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
  INSERT INTO FRRgusn (FRRgusn_grnt_CODE,FRRgusn_SDAT_CODE_ATTR,
                       FRRgusn_SDAT_CODE_OPT_1,FRRgusn_ACTIVITY_DATE, FRRgusn_USER_ID)
  ( SELECT :FRBGRNT_CODE, FRRpusn_SDAT_CODE_ATTR, FRRpusn_SDAT_CODE_OPT_1,                                  
           :FRBGRNT_ACTIVITY_DATE,:FRBGRNT_USER_ID
   FROM FRRpusn
   WHERE FRRpusn_prop_CODE = :display_prop_code);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
--
PROCEDURE COPY_FROM_TO_FOATEXT IS
   pti_temp   varchar2(1);

   CURSOR PTI_CURSOR IS
   SELECT 'X'
   FROM FOBTEXT
   WHERE FOBTEXT_CODE = :DISPLAY_PROP_CODE 
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
  INSERT INTO FOBTEXT(FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM,
                      FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM,
                      FOBTEXT_ACTIVITY_DATE, FOBTEXT_USER_ID,FOBTEXT_CLA_NUM,
                      FOBTEXT_PRT_IND, FOBTEXT_TEXT)
  ( SELECT  51,		
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
   WHERE FOBTEXT_CODE = :DISPLAY_PROP_CODE
     AND FOBTEXT_DTYP_SEQ_NUM = 29
     AND FOBTEXT_CHG_SEQ_NUM IS NULL
     AND FOBTEXT_ITEM IS NULL);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
--
PROCEDURE COPY_FROM_PROP_FRRAGPT IS
			pti_temp   varchar2(1);
   		cursor check_data is
    	select 'X'
    	from FRRPRPT
    	where frrprpt_prop_code = :display_prop_code;
BEGIN
			open check_data;
   		fetch check_data into pti_temp;
     	if check_data%NOTFOUND then
      	  close check_data;
        	RETURN;
     	else
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
 							FRRPRPT_AGCY_PIDM,
 							sysdate,
 							:global.user_id,
 							FRRPRPT_FEDERAL_FUND_PERCENT,
 							FRRPRPT_SPONSOR_ID
 				FROM FRRPRPT
 				WHERE frrprpt_prop_code = :display_prop_code);
 				IF SQL%NOTFOUND THEN 
       			RAISE FORM_TRIGGER_FAILURE;
    		END IF;
END;

END COPY_FROM_PROP_TO;
		*/
		/* <p>
/* </p>
		*/
		public void copyFromPropFrbgbil()
		{
		}
/* <p>
		* 
/* </p>
		*/
		public void copyFromPropFrrgloc(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frrploc " +
	" WHERE frrploc_prop_code = :DISPLAY_PROP_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
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
			String sql1 = "INSERT INTO FRRGLOC " +
					" (FRRGLOC_GRNT_CODE,FRRGLOC_LOCN_CODE,FRRGLOC_LOCN_RESEARCH_IND,FRRGLOC_ACTIVITY_DATE,FRRGLOC_USER_ID) " + 
		            " (SELECT :FRBGRNT_CODE, FRRPLOC_LOCN_CODE, FRRPLOC_LOCN_RESEARCH_IND, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID " +
		            " FROM FRRPLOC " +
		            " WHERE FRRPLOC_PROP_CODE = :DISPLAY_PROP_CODE) ";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command1.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command1.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command1.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
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
		public void copyFromPropFrrgrpi()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frrprpi " +
	" WHERE frrprpi_prop_code = :DISPLAY_PROP_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
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
			
			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)getFormModel().getFrbgrnt().getRowAdapter(true);			
			
			String sql2 = "INSERT INTO FRRGRPI " +
					" (FRRGRPI_GRNT_CODE,FRRGRPI_ID_IND,FRRGRPI_ID_PIDM,FRRGRPI_ORGN_CODE,FRRGRPI_SALUTATION,FRRGRPI_TITLE,FRRGRPI_FTE,FRRGRPI_EMPLOYEE_IND,FRRGRPI_ACTIVITY_DATE, FRRGRPI_USER_ID) " +
					" (SELECT :FRBGRNT_CODE, FRRPRPI_ID_IND, FRRPRPI_ID_PIDM, FRRPRPI_ORGN_CODE, FRRPRPI_SALUTATION, FRRPRPI_TITLE, FRRPRPI_FTE, FRRPRPI_EMPLOYEE_IND, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID " +
					" FROM FRRPRPI " +
					" WHERE FRRPRPI_PROP_CODE = :DISPLAY_PROP_CODE) ";
			DataCommand command2 = new DataCommand(sql2);
			//Setting query parameters
			command2.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command2.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command2.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command2.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
			rowCount = command2.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}
/* <p>
		* 
/* </p>
		*/
		public void copyFromPropFrrgusn()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frrPusn " +
	" WHERE frrPusn_PROP_code = :DISPLAY_PROP_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
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
			
			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)getFormModel().getFrbgrnt().getRowAdapter(true);					
					    
			String sql3 = "INSERT INTO FRRGUSN (FRRGUSN_GRNT_CODE,FRRGUSN_SDAT_CODE_ATTR,FRRGUSN_SDAT_CODE_OPT_1,FRRGUSN_ACTIVITY_DATE, FRRGUSN_USER_ID) " +
					" (SELECT :FRBGRNT_CODE, FRRPUSN_SDAT_CODE_ATTR, FRRPUSN_SDAT_CODE_OPT_1, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID " +
					" FROM FRRPUSN " +
					" WHERE FRRPUSN_PROP_CODE = :DISPLAY_PROP_CODE) ";
			DataCommand command3 = new DataCommand(sql3);
			//Setting query parameters
			command3.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command3.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command3.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command3.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
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
		public void copyFromToFoatext()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM FOBTEXT " +
	" WHERE FOBTEXT_CODE = :DISPLAY_PROP_CODE AND FOBTEXT_DTYP_SEQ_NUM = 29 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
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
			
			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)getFormModel().getFrbgrnt().getRowAdapter(true);
			
			String sql4 = " INSERT INTO FOBTEXT " +
	" (FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE, FOBTEXT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT)" +
	" (SELECT SELECT 51, :FRBGRNT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT " +
	" FROM FOBTEXT " +
	" WHERE FOBTEXT_CODE = :DISPLAY_PROP_CODE AND FOBTEXT_DTYP_SEQ_NUM = 29 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL ) ";
			DataCommand command4 = new DataCommand(sql4);
			//Setting query parameters
			command4.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command4.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command4.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command4.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
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
		public void copyFromPropFrragpt()
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM FRRPRPT " +
	" WHERE frrprpt_prop_code = :DISPLAY_PROP_CODE ";
			DataCursor checkData = new DataCursor(sqlcheckData);
			try {
				//Setting query parameters
				checkData.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
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
		    
			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)getFormModel().getFrbgrnt().getRowAdapter(true);
			
			// RPE# 1-19V7ZZD : Include the new sponsor Id column also in the insert list
			String sql5 = "INSERT INTO FRRAGPT (FRRAGPT_GRNT_CODE, FRRAGPT_AGCY_PIDM, FRRAGPT_ACTIVITY_DATE, FRRAGPT_USER_ID, FRRAGPT_FEDERAL_FUND_PERCENT, FRRAGPT_SPONSOR_ID)" +
					"(SELECT :FRBGRNT_CODE, FRRPRPT_AGCY_PIDM, sysdate, :GLOBAL_USER_ID, FRRPRPT_FEDERAL_FUND_PERCENT, FRRPRPT_SPONSOR_ID" +
					"FROM FRRPRPT" +
					"WHERE FRRPRPT_PROP_CODE = :DISPLAY_PROP_CODE)";
			DataCommand command5 = new DataCommand(sql5);
			//Setting query parameters
			command5.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command5.addParameter("GLOBAL_USER_ID", getGlobal("USER_ID"));
			command5.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
			rowCount = command5.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}
		
	
	
}
