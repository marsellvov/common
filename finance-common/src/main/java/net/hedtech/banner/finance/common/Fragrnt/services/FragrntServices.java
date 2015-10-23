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



public class FragrntServices extends AbstractSupportCodeObject{
	
	
	public FragrntServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public FragrntTask  getTask() {
		return (FragrntTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Fragrnt.model.FragrntModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit COPY_INSERT_FRRGUSN
	
	PROCEDURE COPY_INSERT_FRRgusn IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frrgusn
     where frrgusn_grnt_code = :copy_grnt_code;
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
  INSERT INTO FRRgloc (FRRgloc_grnt_CODE,FRRgloc_LOCN_CODE,
                       FRRgloc_LOCN_RESEARCH_IND,FRRgloc_ACTIVITY_DATE, FRRgloc_USER_ID)
  ( SELECT :FRBGRNT_CODE, FRRgusn_SDAT_CODE_ATTR, FRRgusn_SDAT_CODE_OPT_1,                                  
           :FRBGRNT_ACTIVITY_DATE,:FRBGRNT_USER_ID
   FROM FRRgusn
   WHERE FRRgusn_grnt_CODE = :COPY_GRNT_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;


	*/
	//ID:3493
	/* <p>
/* </p>
		*/
		public void copyInsertFrrgusn(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frrgusn " +
	" WHERE frrgusn_grnt_code = :COPY_GRNT_CODE ";
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
					checkData.close();
					return ;
				}
				else {
					checkData.close();
				}
			} finally {
				checkData.close();
			}
			//    
			String sql1 = "INSERT INTO FRRgloc " +
	"(FRRgloc_grnt_CODE, FRRgloc_LOCN_CODE, FRRgloc_LOCN_RESEARCH_IND, FRRgloc_ACTIVITY_DATE, FRRgloc_USER_ID)" +
	"(SELECT SELECT :FRBGRNT_CODE, FRRgusn_SDAT_CODE_ATTR, FRRgusn_SDAT_CODE_OPT_1, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID " +
	" FROM FRRgusn " +
	" WHERE FRRgusn_grnt_CODE = :COPY_GRNT_CODE )";
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

	
	/* Original PL/SQL code for Prog Unit CLEAR_FIELDS
	
	procedure clear_fields (block_name varchar2, item_cursor_in varchar2) is
item_name          varchar2(80);
item_first         varchar2(80);
item_last          varchar2(80);
tab_page_name      varchar2(80);
begin
  item_first    := get_block_property(block_name, FIRST_ITEM);
  item_last     := get_block_property(block_name, LAST_ITEM);
  item_name     := item_first;
  tab_page_name := get_item_property(item_cursor_in,ITEM_TAB_PAGE);
  
        while (get_item_property(item_name,NEXTITEM ) <> item_first) LOOP
           if (get_item_property(item_name,ITEM_TAB_PAGE) = tab_page_name
              and get_item_property(item_name,ITEM_TYPE) = 'TEXT ITEM') then
                copy('',item_name);
            end if;
         item_name := get_item_property(item_name, NEXTITEM);
         END LOOP;
end;
	*/
	//ID:3494
	/* <p>
/* </p>
		* @param blockName
		* @param itemCursorIn
		*/
		public void clearFields(NString blockName, NString itemCursorIn)
		{
			NString itemName= NString.getNull();
			NString itemFirst= NString.getNull();
			NString itemLast= NString.getNull();
			NString tabPageName= NString.getNull();
			itemFirst = getBlockFirstItem(blockName);
			itemLast = getBlockLastItem(blockName);
			itemName = itemFirst;
			
			tabPageName = getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS");
					
			while ((getItemNextItem(itemName).notEquals(itemFirst))) {
				if(findItem(itemName).getPage() != null){
					if (findItem(itemName).getPage().getId().equals(tabPageName.toString()) && getItemType(itemName).equals("TEXT ITEM"))
					{
						copy("",itemName);
					}
				}
				itemName = getItemNextItem(itemName);
			}
		}

	
	/* Original PL/SQL code for Prog Unit DELETE_FRRGRPI_1
	
	PROCEDURE DELETE_FRRgrpi_1 IS
 BEGIN
 DELETE FROM FRRgrpi
   WHERE FRRgrpi_grnt_CODE = :frbgrnt_CODE
     AND FRRgrpi_ID_IND = '001';
END;
	*/
	//ID:3495
	/* <p>
/* </p>
		*/
		public void deleteFrrgrpi1(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			String sql1 = "DELETE FROM FRRgrpi " +
	" WHERE FRRgrpi_grnt_CODE = :FRBGRNT_CODE AND FRRgrpi_ID_IND = '001'";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			rowCount = command1.execute();
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_PI_PIDM_EQUAL
	
	FUNCTION CHECK_PI_PIDM_EQUAL RETURN BOOLEAN
IS
 id_pidm      frrgrpi.frrgrpi_id_pidm%type;
--
 cursor check_001 is
  select frrgrpi_id_pidm
   from frrgrpi
    where frrgrpi_grnt_code = :frrgrpi_grnt_code
      and frrgrpi_id_ind = '001';
BEGIN
 open check_001;
 fetch check_001 into id_pidm;
  if check_001%FOUND then
          return TRUE;
   end if;
RETURN NULL; END;



	*/
	//ID:3496
	/* <p>
/* </p>
		*/
		public NBool checkPiPidmEqual(FrrgrpiAdapter frrgrpiElement)
		{
			int rowCount = 0;
			NNumber idPidm= NNumber.getNull();
			String sqlcheck001 = "SELECT frrgrpi_id_pidm " +
	" FROM frrgrpi " +
	" WHERE frrgrpi_grnt_code = :FRRGRPI_GRNT_CODE AND frrgrpi_id_ind = '001' ";
			DataCursor check001 = new DataCursor(sqlcheck001);
			try {
				//Setting query parameters
				check001.addParameter("FRRGRPI_GRNT_CODE", frrgrpiElement.getFrrgrpiGrntCode());
				check001.open();
				ResultSet check001Results = check001.fetchInto();
				if ( check001Results != null ) {
					idPidm = check001Results.getNumber(0);
				}
				if ( check001.found() )
				{
					return  toBool(NBool.True);
				}
			} finally {
				check001.close();
			}
			return NBool.getNull();
		}

	
	/* Original PL/SQL code for Prog Unit UPDATE_FRBGRNT_1
	
	   PROCEDURE UPDATE_FRBGRNT_1
   IS
   BEGIN
      UPDATE FRBGRNT
       SET FRBGRNT_PI_PIDM =       :FRRGRPI_ID_PIDM,
           FRBGRNT_USER_ID =       :FRRgrpi_USER_ID,
           FRBGRNT_ACTIVITY_DATE = :FRRgrpi_ACTIVITY_DATE
       WHERE FRBGRNT_CODE = :FRRgrpi_GRNT_CODE;
    IF SQL%NOTFOUND THEN
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
   END ;

	*/
	//ID:3497
	/* <p>
/* </p>
		*/
		public void updateFrbgrnt1(FrrgrpiAdapter frrgrpiElement)
		{
			int rowCount = 0;
			String sql1 = "UPDATE FRBGRNT " +
	"SET FRBGRNT_PI_PIDM = :FRRGRPI_ID_PIDM, FRBGRNT_USER_ID = :FRRGRPI_USER_ID, FRBGRNT_ACTIVITY_DATE = :FRRGRPI_ACTIVITY_DATE " +
	" WHERE FRBGRNT_CODE = :FRRGRPI_GRNT_CODE";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRRGRPI_ID_PIDM", frrgrpiElement.getFrrgrpiIdPidm());
			command1.addParameter("FRRGRPI_USER_ID", frrgrpiElement.getFrrgrpiUserId());
			command1.addParameter("FRRGRPI_ACTIVITY_DATE", frrgrpiElement.getFrrgrpiActivityDate());
			command1.addParameter("FRRGRPI_GRNT_CODE", frrgrpiElement.getFrrgrpiGrntCode());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit EDIT_ORGN_SEQURITY_AFTER_QUERY
	
	PROCEDURE EDIT_ORGN_SEQURITY_AFTER_QUERY(code VARCHAR2) IS
 BEGIN
 IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
     NULL;
 ELSIF :GLOBAL.FUND_ORG_SECURITY_IND = 'N' THEN
          RETURN;
 END IF;
--
   DECLARE
      PTI_INTO_TEMP        varchar2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'Y'
         FROM   FOBPROF
         WHERE  FOBPROF_USER_ID = :CURRENT_USER
           AND  FOBPROF_MASTER_ORGN_IND IN ('B', 'P', 'Q') ;

   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO CHK_ORGN_SEC ;
      ELSE
         RETURN;
      END IF ;
   END ;
--
   << CHK_ORGN_SEC >>
   
   DECLARE
     CURSOR PTI_CURSOR_1 IS 
         SELECT frbgrnt_COAS_CODE, frbgrnt_ORGN_CODE_RESP_OFFICE
           FROM frbgrnt
         WHERE frbgrnt_CODE = code;
--
      hold_frbgrnt_coas_code    frbgrnt.frbgrnt_coas_code%type;
      hold_frbgrnt_orgn_code    frbgrnt.frbgrnt_orgn_code_resp_office%type;	
--
      RETRIEVED_ORGN_CODE  varchar2(6);
--
      CURSOR PTI_CURSOR_2 IS
         SELECT FTVORGN_ORGN_CODE
         FROM   FTVORGN
         WHERE  FTVORGN_ORGN_CODE IN  (
               SELECT FORUSOR_ORGN_CODE
               FROM   FORUSOR
               WHERE  FORUSOR_USER_ID_ENTERED = :CURRENT_USER
                 AND  FORUSOR_COAS_CODE = hold_frbgrnt_coas_code )
         CONNECT BY FTVORGN_ORGN_CODE = PRIOR
            FTVORGN_ORGN_CODE_PRED
           AND  FTVORGN_COAS_CODE = PRIOR FTVORGN_COAS_CODE
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE
         START WITH FTVORGN_ORGN_CODE = hold_frbgrnt_orgn_code
           AND  FTVORGN_COAS_CODE = hold_frbgrnt_coas_code
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE ;
--
      PTI_INTO_TEMP_1        VARCHAR2(255);
      CURSOR PTI_CURSOR_3 IS
         SELECT 'Y'
         FROM   FORUSOR
         WHERE  FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE
           AND  FORUSOR_COAS_CODE = hold_frbgrnt_coas_code
           AND  FORUSOR_ACCESS_IND IN ('B', 'P','Q')
           AND  FORUSOR_USER_ID_ENTERED = :CURRENT_USER ;
   BEGIN
      OPEN PTI_CURSOR_1;
        FETCH PTI_CURSOR_1 INTO hold_frbgrnt_coas_code, hold_frbgrnt_orgn_code;
        IF PTI_CURSOR_1%NOTFOUND THEN 
           GOTO TRIG_EXIT;
        END IF;
--
      OPEN PTI_CURSOR_2 ;
      FETCH PTI_CURSOR_2 INTO :RETRIEVED_ORGN_CODE ;
      IF PTI_CURSOR_2%NOTFOUND THEN
         GOTO ORGN_NOT_ALLOWED ;
      END IF ;
--
   << CHK_ORGN_ALLOWED >>

      OPEN PTI_CURSOR_3 ;
      FETCH PTI_CURSOR_3 INTO PTI_INTO_TEMP_1 ;
      IF PTI_CURSOR_3%NOTFOUND THEN
         GOTO ORGN_NOT_ALLOWED ;
      ELSE
         GOTO TRIG_EXIT ;
      END IF ;
--
   << ORGN_NOT_ALLOWED >>
   MESSAGE(F_GET_ERROR('USER_NOT_AUTH')) ;
         
   RAISE FORM_TRIGGER_FAILURE ;

--
   << TRIG_EXIT >>
   NULL ;
 END;
END;

	*/
	//ID:3500
		
	public void editOrgnSequrityAfterQuery(NString code)
		{
			int rowCount = 0;
			if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
			{
			}
			else if ( getGlobal("FUND_ORG_SECURITY_IND").equals("N") ) {
				return ;
			}
			{
				NString ptiIntoTemp= NString.getNull();
				String sqlptiCursor = "SELECT 'Y' " +
	" FROM FOBPROF " +
	" WHERE FOBPROF_USER_ID = :CURRENT_USER AND (FOBPROF_MASTER_ORGN_IND) IN ('B', 'P', 'Q') ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					//Setting query parameters
					ptiCursor.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if ( ptiCursorResults != null ) {
						ptiIntoTemp = ptiCursorResults.getStr(0);
					}
					if ( ptiCursor.notFound() )
					{
						 this.goToChkOrgnSec(code);
						 return;
					}
					else {
						return ;
					}
				} finally {
					ptiCursor.close();
				}
			}
		}

	//CHK_ORGN_SEC
	private void goToChkOrgnSec(NString code) {
		{
			String sqlptiCursor1 = "SELECT frbgrnt_COAS_CODE, frbgrnt_ORGN_CODE_RESP_OFFICE " +
" FROM frbgrnt " +
" WHERE frbgrnt_CODE = :P_CODE ";
			DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
			// 
			NString holdFrbgrntCoasCode= NString.getNull();
			NString holdFrbgrntOrgnCode= NString.getNull();
			// 
			NString retrievedOrgnCode= NString.getNull();
			String sqlptiCursor2 = "SELECT FTVORGN_ORGN_CODE " +
" FROM FTVORGN " +
" WHERE (FTVORGN_ORGN_CODE) IN (SELECT FORUSOR_ORGN_CODE " +
" FROM FORUSOR " +
" WHERE FORUSOR_USER_ID_ENTERED = :CURRENT_USER AND FORUSOR_COAS_CODE = :P_HOLD_FRBGRNT_COAS_CODE ) ";
			DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
			// 
			NString ptiIntoTemp1= NString.getNull();
			String sqlptiCursor3 = "SELECT 'Y' " +
" FROM FORUSOR " +
" WHERE FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND FORUSOR_COAS_CODE = :P_HOLD_FRBGRNT_COAS_CODE AND (FORUSOR_ACCESS_IND) IN ('B', 'P', 'Q') AND FORUSOR_USER_ID_ENTERED = :CURRENT_USER ";
			DataCursor ptiCursor3 = new DataCursor(sqlptiCursor3);
			try {
				//Setting query parameters
				ptiCursor1.addParameter("P_CODE", code);
				ptiCursor1.open();
				ResultSet ptiCursor1Results = ptiCursor1.fetchInto();
				if ( ptiCursor1Results != null ) {
					holdFrbgrntCoasCode = ptiCursor1Results.getStr(0);
					holdFrbgrntOrgnCode = ptiCursor1Results.getStr(1);
				}
				if ( ptiCursor1.notFound() )
				{
					return;
				}
				// 
				//Setting query parameters
				ptiCursor2.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
				ptiCursor2.addParameter("P_HOLD_FRBGRNT_COAS_CODE", holdFrbgrntCoasCode);
				ptiCursor2.open();
				ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
				if ( ptiCursor2Results != null ) {
					getFormModel().getFormHeader().setRetrievedOrgnCode(ptiCursor2Results.getStr(0));
				}
				if ( ptiCursor2.notFound() )
				{
					 this.goToOrgnNotAllowed();
					 return;
				}
				 CHK_ORGN_ALLOWED:;
				//Setting query parameters
				ptiCursor3.addParameter("RETRIEVED_ORGN_CODE", getFormModel().getFormHeader().getRetrievedOrgnCode());
				ptiCursor3.addParameter("P_HOLD_FRBGRNT_COAS_CODE", holdFrbgrntCoasCode);
				ptiCursor3.addParameter("CURRENT_USER", getFormModel().getFormHeader().getCurrentUser());
				ptiCursor3.open();
				ResultSet ptiCursor3Results = ptiCursor3.fetchInto();
				if ( ptiCursor3Results != null ) {
					ptiIntoTemp1 = ptiCursor3Results.getStr(0);
				}
				if ( ptiCursor3.notFound() )
				{
					 this.goToOrgnNotAllowed();
					 return;
				}
				else {
					return;
				}
			} finally {
				ptiCursor1.close();
				ptiCursor2.close();
				ptiCursor3.close();
			}
		}
	}

	//ORGN_NOT_ALLOWED
	private void goToOrgnNotAllowed() {
		errorMessage(fGetError(toStr("USER_NOT_AUTH")));
		throw new ApplicationException();
	}
	
	/* Original PL/SQL code for Prog Unit COPY_INSERT_FOBTEXT
	
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
  INSERT INTO FOBTEXT(FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM,
                      FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM,
                      FOBTEXT_ACTIVITY_DATE, FOBTEXT_USER_ID,FOBTEXT_CLA_NUM,
                      FOBTEXT_PRT_IND, FOBTEXT_TEXT)
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


	*/
	//ID:3501
	/* <p>
/* </p>
		*/
		public void copyInsertFobtext(FrbgrntAdapter frbgrntElement)
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
			String sql1 = "INSERT INTO FOBTEXT " +
	"(FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE, FOBTEXT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT)" +
	"(SELECT SELECT FOBTEXT_DTYP_SEQ_NUM, :FRBGRNT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT " +
	" FROM FOBTEXT " +
	" WHERE FOBTEXT_CODE = :COPY_GRNT_CODE AND FOBTEXT_DTYP_SEQ_NUM = 51 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL )";
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

	
	/* Original PL/SQL code for Prog Unit COPY_INSERT_FRRGRPI
	
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


	*/
	//ID:3502
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
			String sql1 = "INSERT INTO FRRgrpi " +
	"(FRRgrpi_grnt_CODE, FRRgrpi_ID_IND, FRRgrpi_ID_PIDM, FRRgrpi_ORGN_CODE, FRRgrpi_SALUTATION, FRRgrpi_TITLE, FRRgrpi_FTE, FRRgrpi_EMPLOYEE_IND, FRRgrpi_ACTIVITY_DATE, FRRgrpi_USER_ID, FRRGRPI_ADDR_TYPE, FRRGRPI_ADDR_SEQNO, FRRGRPI_PHONE_TYPE, FRRGRPI_TELE_SEQNO, FRRGRPI_BFRM_CODE, FRRGRPI_EMAIL)" +
	"(SELECT SELECT :FRBGRNT_CODE, FRRgrpi_ID_IND, FRRgrpi_ID_PIDM, FRRgrpi_ORGN_CODE, FRRgrpi_SALUTATION, FRRgrpi_TITLE, FRRgrpi_FTE, FRRgrpi_EMPLOYEE_IND, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID, FRRGRPI_ADDR_TYPE, FRRGRPI_ADDR_SEQNO, FRRGRPI_PHONE_TYPE, FRRGRPI_TELE_SEQNO, FRRGRPI_BFRM_CODE, FRRGRPI_EMAIL " +
	" FROM FRRgrpi " +
	" WHERE FRRgrpi_grnt_CODE = :COPY_GRNT_CODE )";
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

	
	/* Original PL/SQL code for Prog Unit COPY_INSERT_FRRGLOC
	
	PROCEDURE COPY_INSERT_FRRgloc IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frrgloc
     where frrgloc_grnt_code = :copy_grnt_code;
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
  ( SELECT :frbgrnt_CODE, FRRgloc_LOCN_CODE, FRRgloc_LOCN_RESEARCH_IND,                                    
            :frbgrnt_ACTIVITY_DATE,:frbgrnt_USER_ID
   FROM FRRgloc
   WHERE FRRgloc_grnt_CODE = :COPY_grnt_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;


	*/
	//ID:3503
	/* <p>
/* </p>
		*/
		public void copyInsertFrrgloc(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frrgloc " +
	" WHERE frrgloc_grnt_code = :COPY_GRNT_CODE ";
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
			String sql1 = "INSERT INTO FRRgloc " +
	"(FRRgloc_grnt_CODE, FRRgloc_LOCN_CODE, FRRgloc_LOCN_RESEARCH_IND, FRRgloc_ACTIVITY_DATE, FRRgloc_USER_ID)" +
	"(SELECT SELECT :FRBGRNT_CODE, FRRgloc_LOCN_CODE, FRRgloc_LOCN_RESEARCH_IND, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID " +
	" FROM FRRgloc " +
	" WHERE FRRgloc_grnt_CODE = :COPY_GRNT_CODE )";
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

	
	/* Original PL/SQL code for Prog Unit UPDATE_FRRGRPI_1
	
	   PROCEDURE UPDATE_FRRgrpi_1
   IS
   BEGIN
      UPDATE FRRGRPI
       SET FRRGRPI_ID_PIDM =       :frbgrnt_PI_PIDM,
           FRRgrpi_USER_ID =       :frbgrnt_USER_ID,
           FRRgrpi_ACTIVITY_DATE = :frbgrnt_ACTIVITY_DATE
       WHERE FRRgrpi_grnt_CODE = :frbgrnt_CODE
         AND FRRgrpi_ID_IND = '001';
    IF SQL%NOTFOUND THEN
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
   END ;

	*/
	//ID:3504
	/* <p>
/* </p>
		*/
		public void updateFrrgrpi1(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			String sql1 = "UPDATE FRRGRPI " +
	"SET FRRGRPI_ID_PIDM = :FRBGRNT_PI_PIDM, FRRgrpi_USER_ID = :FRBGRNT_USER_ID, FRRgrpi_ACTIVITY_DATE = :FRBGRNT_ACTIVITY_DATE " +
	" WHERE FRRgrpi_grnt_CODE = :FRBGRNT_CODE AND FRRgrpi_ID_IND = '001'";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBGRNT_PI_PIDM", frbgrntElement.getFrbgrntPiPidm());
			command1.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command1.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command1.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit INSERT_FRRGRPI_1
	
	   PROCEDURE INSERT_FRRgrpi_1
   IS
   BEGIN
      INSERT INTO FRRgrpi
       ( FRRgrpi_grnt_CODE, FRRgrpi_ID_IND, FRRgrpi_ID_PIDM,FRRGRPI_ORGN_CODE,
          FRRgrpi_USER_ID, FRRgrpi_ACTIVITY_DATE )
      VALUES (:frbgrnt_CODE, '001', :frbgrnt_PI_PIDM, :frbgrnt_orgn_code_resp_office,
              :frbgrnt_USER_ID, :frbgrnt_ACTIVITY_DATE);
    IF SQL%NOTFOUND THEN
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
   END ;
	*/
	//ID:3505
	/* <p>
/* </p>
		*/
		public void insertFrrgrpi1(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			String sql1 = "INSERT INTO FRRgrpi " +
	"(FRRgrpi_grnt_CODE, FRRgrpi_ID_IND, FRRgrpi_ID_PIDM, FRRGRPI_ORGN_CODE, FRRgrpi_USER_ID, FRRgrpi_ACTIVITY_DATE)" +
	"VALUES (:FRBGRNT_CODE, '001', :FRBGRNT_PI_PIDM, :FRBGRNT_ORGN_CODE_RESP_OFFICE, :FRBGRNT_USER_ID, :FRBGRNT_ACTIVITY_DATE)";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command1.addParameter("FRBGRNT_PI_PIDM", frbgrntElement.getFrbgrntPiPidm());
			command1.addParameter("FRBGRNT_ORGN_CODE_RESP_OFFICE", frbgrntElement.getFrbgrntOrgnCodeRespOffice());
			command1.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command1.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit CURSOR_ALREADY_IN_THAT_WINDOW
	
	function cursor_already_in_that_window (inwindow in varchar2) return boolean is
begin
   if get_view_property(get_item_property(:system.cursor_item,item_canvas),window_name) = 
      inwindow then
      return true;
   else
      return false;
   end if;
RETURN NULL; end;
	*/
	//ID:3506
	/* <p>
/* </p>
		* @param inwindow
		*/
		public NBool cursorAlreadyInThatWindow(NString inwindow)
		{
			if ( getViewWindowName(getItemCanvas(getCursorItem())).equals(inwindow) )
			{
				return  toBool(NBool.True);
			}
			else {
				return  toBool(NBool.False);
			}
		}

	
	/* Original PL/SQL code for Prog Unit INVALID_OPTION_SELECTED
	
	procedure invalid_option_selected is
begin
   message( G$_NLS.Get('FRAGRNT-0248', 'FORM','The Option selected is not available at this time.') );
end;
	*/
	//ID:3507
	/* <p>
/* </p>
		*/
		public void invalidOptionSelected()
		{
//			message(GNls.Fget(toStr("FRAGRNT-0248"), toStr("FORM"), toStr("The Option selected is not available at this time.")));
			warningMessage(GNls.Fget(toStr("FRAGRNT-0248"), toStr("FORM"), toStr("The Option selected is not available at this time.")));
		}

	
	/* Original PL/SQL code for Prog Unit INSERT_FRVGRST_1
	
	   PROCEDURE INSERT_FRVGRST_1
   IS
   BEGIN
      INSERT INTO FRVGRST
       ( FRVGRST_grnt_CODE, FRVGRST_STATUS_CODE, FRVGRST_COAS_CODE,
          FRVGRST_DATE_STATUS, FRVGRST_USER_ID,
          FRVGRST_ACTIVITY_DATE, FRVGRST_STATUS_DESC )
      VALUES ( :frbgrnt_CODE, :frbgrnt_STATUS_CODE,
         :frbgrnt_COAS_CODE, :frbgrnt_STATUS_DATE, :frbgrnt_USER_ID
         , :frbgrnt_ACTIVITY_DATE, :frbgrnt_alternate_status_desc) ;
    IF SQL%NOTFOUND THEN
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
   END ;
	*/
	//ID:3508
	/* <p>
/* </p>
		*/
		public void insertFrvgrst1(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			String sql1 = "INSERT INTO FRVGRST " +
	"(FRVGRST_grnt_CODE, FRVGRST_STATUS_CODE, FRVGRST_COAS_CODE, FRVGRST_DATE_STATUS, FRVGRST_USER_ID, FRVGRST_ACTIVITY_DATE, FRVGRST_STATUS_DESC)" +
	"VALUES (:FRBGRNT_CODE, :FRBGRNT_STATUS_CODE, :FRBGRNT_COAS_CODE, :FRBGRNT_STATUS_DATE, :FRBGRNT_USER_ID, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_ALTERNATE_STATUS_DESC)";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command1.addParameter("FRBGRNT_STATUS_CODE", frbgrntElement.getFrbgrntStatusCode());
			command1.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
			command1.addParameter("FRBGRNT_STATUS_DATE", frbgrntElement.getFrbgrntStatusDate());
			command1.addParameter("FRBGRNT_USER_ID", frbgrntElement.getFrbgrntUserId());
			command1.addParameter("FRBGRNT_ACTIVITY_DATE", frbgrntElement.getFrbgrntActivityDate());
			command1.addParameter("FRBGRNT_ALTERNATE_STATUS_DESC", frbgrntElement.getFrbgrntAlternateStatusDesc());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_FRVGRST_2
	
	   FUNCTION SELECT_FRVGRST_2
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FRVGRST
         WHERE  FRVGRST_grnt_CODE = :frbgrnt_CODE
           AND  FRVGRST_COAS_CODE = :frbgrnt_COAS_CODE
           AND  FRVGRST_STATUS_CODE = :frbgrnt_STATUS_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:3509
	/* <p>
/* </p>
		*/
		public NBool selectFrvgrst2(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
									" FROM FRVGRST " +
									" WHERE FRVGRST_grnt_CODE = :FRBGRNT_CODE AND FRVGRST_COAS_CODE = :FRBGRNT_COAS_CODE AND FRVGRST_STATUS_CODE = :FRBGRNT_STATUS_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
				ptiCursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
				ptiCursor.addParameter("FRBGRNT_STATUS_CODE", frbgrntElement.getFrbgrntStatusCode());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.notFound()));
			} finally {
				ptiCursor.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_REQUIRED_FIELD_ON
	
	procedure check_required_field_on (block_name varchar2) is
item_name          varchar2(80);
item_first         varchar2(80);
item_last          varchar2(80);
begin
 item_first := get_block_property(block_name, FIRST_ITEM);
  item_last := get_block_property(block_name, LAST_ITEM);
  item_name := item_first; 
      while (get_item_property(item_name,NEXTITEM ) <> item_first) LOOP
      if (get_item_property(item_name,ITEM_TYPE)='TEXT ITEM' and                                            get_item_property(item_name,LOCK_RECORD_ON_CHANGE) = 'TRUE') THEN
             set_item_property(item_name,REQUIRED, property_ON);
         end if;
          item_name := get_item_property(item_name, NEXTITEM);
      END LOOP;
end; 


	*/
	//ID:3510
	/* <p>
/* </p>
		* @param blockName
		*/
		public void checkRequiredFieldOn(NString blockName)
		{
			NString itemName= NString.getNull();
			NString itemFirst= NString.getNull();
			NString itemLast= NString.getNull();
			itemFirst = getBlockFirstItem(blockName);
			itemLast = getBlockLastItem(blockName);
			itemName = itemFirst;
			while ((getItemNextItem(itemName).notEquals(itemFirst))) {
//				if ((getItemType(itemName).equals("TEXT ITEM") && SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.LOCK_RECORD_ON_CHANGE).equals("TRUE")))
				if ((getItemType(itemName).equals("TEXT ITEM")))
				{
					setItemRequired(itemName, true);
				}
				itemName = getItemNextItem(itemName);
			}
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_REQUIRED_FIELD_OFF
	
	procedure check_required_field_off (block_name varchar2) is
item_name          varchar2(80);
item_first         varchar2(80);
item_last          varchar2(80);
begin
  item_first := get_block_property(block_name, FIRST_ITEM);
  item_last := get_block_property(block_name, LAST_ITEM);
  item_name := item_first;
        while (get_item_property(item_name,NEXTITEM ) <> item_first) LOOP
           if (get_item_property(item_name, REQUIRED) = 'TRUE'
              and get_item_property(item_name,ITEM_TYPE) = 'TEXT ITEM') then
                 set_item_property(item_name,REQUIRED, property_OFF);
                 set_item_property(item_name,LOCK_RECORD_ON_CHANGE, property_ON);
            end if;
         item_name := get_item_property(item_name, NEXTITEM);
         END LOOP;
end;


	*/
	//ID:3511
	/* <p>
/* </p>
		* @param blockName
		*/
		public void checkRequiredFieldOff(NString blockName)
		{
			NString itemName= NString.getNull();
			NString itemFirst= NString.getNull();
			NString itemLast= NString.getNull();
			itemFirst = getBlockFirstItem(blockName);
			itemLast = getBlockLastItem(blockName);
			itemName = itemFirst;
			while ((getItemNextItem(itemName).notEquals(itemFirst))) {
				if ((getItemRequired(itemName).equals("TRUE") && getItemType(itemName).equals("TEXT ITEM")))
				{
					setItemRequired(itemName, false);		
					
				}
				itemName = getItemNextItem(itemName);
			}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_FRBGRNT_1
	
	  FUNCTION SELECT_frbgrnt_1(var varchar2)
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FRBGRNT
         WHERE  FRBGRNT_CODE = var
           AND  var <> :FORM_HEADER.NEXT_DOC_NUM;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%FOUND) ;
   END ;
	*/
	//ID:3512
	/* <p>
/* </p>
		* @param var
		*/
		public NBool selectFrbgrnt1(NString var)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
									" FROM FRBGRNT " +
									" WHERE FRBGRNT_CODE = :P_VAR AND :P_VAR <> :FORM_HEADER_NEXT_DOC_NUM ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_VAR", var);
				ptiCursor.addParameter("FORM_HEADER_NEXT_DOC_NUM", getFormModel().getFormHeader().getNextDocNum());
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.found()));
			} finally {
				ptiCursor.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment>AUDIT TRAIL: 2.1.11
1. New form for the Sponsored Research Module
   SIGNOFF...Michael Hitrik    12-19-95
2. Signoff...Kamakshi Mallikarjun 8-14-96
   Forms 45 Conversion
AUDIT TRAIL END</multilinecomment>
BEGIN
 null; 
END;
	*/
	//ID:3513
	/* <p>
/* </p>
		*/
		public void auditTrail21()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>AUDIT TRAIL: 3.0
1.  Defect#....6314
    Signoff....Josh Oberholtzer 4/1/97
    Problems...a. Window placement in character mode not centered
               b. No autohelp on organization and FTE
               c. VALUE-ERROR on TEST-TABLE-TERM trigger when selecting Payment method
    Fix........a. Removed (2.1.1) version information string from window titles
               b. Created autohelp, fixed two other spelling mistakes in hints, checked all
               c. Added TO_DATE function to convert WORKFLD in comparison expression
2.  Defect#....None
    Signoff....D Keener 5/1/97
    Problems...Pressing key-help from keyblock gave Invalid Function message.
    Fix........Added key-help to form level.
3.  Defect.....None
    Signoff....Galina Andronov  05/07/97
    Problem....Local Visual Attributes should not be named G$_NVA
    Fix........G$_NVA_BUTTON, G$_NVA_CHECK_BOX, G$_NVA_LIST removed and re-referenced.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3514
	/* <p>
/* </p>
		*/
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0_B2K
	
	PROCEDURE AUDIT_TRAIL_3_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.0                                        INIT   DATE
1. Enhancements for Banner2000 upgrade.  These include   SQ  01/01/97
   adding an object group which contains the objects for
   the toolbar, adding an object group which highlights
   the active record within a block, a mouse-doubleclick
   and when-timer-expired trigger at the form level and
   this audit trail.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3515
	/* <p>
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1
	
	PROCEDURE AUDIT_TRAIL_3_1 IS
<multilinecomment>AUDIT TRAIL: 3.1
1.  Defect#....NONE
    Signoff....Anna Vaynblat  10-23-97
    Problems...NONE
    Fix........Create a new master form for the Grants Module.
AUDIT TRAIL END
</multilinecomment>
BEGIN
 null; 
END;
	*/
	//ID:3516
	/* <p>
/* </p>
		*/
		public void auditTrail31()
		{
		}

	
	/* Original PL/SQL code for Prog Unit FRBPROP_IS_NOT_NULL
	
	PROCEDURE FRBPROP_IS_NOT_NULL (VAR_PROP VARCHAR2)
   IS
        CURSOR PROP_NOT_NULL IS
          SELECT FRBPROP_CODE,FRBPROP_ACTIVITY_DATE,
                 FRBPROP_USER_ID,FRBPROP_COAS_CODE,
                 FRBPROP_ORGN_CODE_RESP_OFFICE,FRBPROP_LONG_TITLE,
                 FRBPROP_TITLE,FRBPROP_AGENCY_PIDM,FRBPROP_PI_PIDM,
                 FRBPROP_STATUS_CODE,FRBPROP_STATUS_DATE,FRBPROP_PROJECT_START_DATE,
                 FRBPROP_PROJECT_END_DATE,FRBPROP_PROPOSAL_TYPE,FRBPROP_CATEGORY,
                 FRBPROP_SUB_CATEGORY,FRBPROP_CFDA_INTERNAL_ID_NO,FRBPROP_SPONSOR_ID,
                 FRBPROP_AGENCY_CONTACT,FRBPROP_AGENCY_ADDR_CODE,FRBPROP_AGENCY_ADDR_SEQ_NUM,
                 FRBPROP_AGENCY_PHONE_TYPE,FRBPROP_COAS_CODE_IC_CS,FRBPROP_BASI_CODE_IC,
                 FRBPROP_INDR_CODE_RATE,FRBPROP_INDA_CODE_CHARGE,FRBPROP_INDD_CODE_DISTR,
                 FRBPROP_BASI_CODE_CS,FRBPROP_CSTR_CODE_RATE,FRBPROP_CSTA_CODE_CHARGE,
                 FRBPROP_CSTD_CODE_DISTR
             FROM FRBPROP
               WHERE FRBPROP_CODE = VAR_PROP;
       BEGIN
            FOR C1rec in PROP_NOT_NULL LOOP
             
             :FRBGRNT_CODE:=VAR_PROP;
             :FRBGRNT_ACTIVITY_DATE:=TRUNC(SYSDATE);
             :FRBGRNT_USER_ID:=USER;
             :FRBGRNT_PROP_CODE:=C1rec.FRBPROP_CODE;
             :FRBGRNT_COAS_CODE:=C1rec.FRBPROP_COAS_CODE;
             :FRBGRNT_ORGN_CODE_RESP_OFFICE:=C1rec.FRBPROP_ORGN_CODE_RESP_OFFICE;
             :FRBGRNT_LONG_TITLE:=C1rec.FRBPROP_LONG_TITLE;
             :FRBGRNT_TITLE:= C1rec.FRBPROP_TITLE;
             :FRBGRNT_AGENCY_PIDM := C1rec.FRBPROP_AGENCY_PIDM;
             :FRBGRNT_PI_PIDM := C1rec.FRBPROP_PI_PIDM;
               :FRBGRNT_STATUS_CODE := '';
               :FRBGRNT_STATUS_DATE := '';
             :FRBGRNT_PROJECT_START_DATE:= C1rec. FRBPROP_PROJECT_START_DATE;
             :FRBGRNT_PROJECT_END_DATE:= C1rec.FRBPROP_PROJECT_END_DATE;
             :FRBGRNT_GRANT_TYPE:= '';
             :FRBGRNT_CATEGORY:= '';
             :FRBGRNT_SUB_CATEGORY:= '';
             :FRBGRNT_CFDA_INTERNAL_ID_NO:=C1rec.FRBPROP_CFDA_INTERNAL_ID_NO;
             :FRBGRNT_SPONSOR_ID:= C1rec.FRBPROP_SPONSOR_ID;
             :FRBGRNT_AGENCY_CONTACT:= C1rec.FRBPROP_AGENCY_CONTACT;
             :FRBGRNT_AGENCY_ADDR_CODE:=C1rec.FRBPROP_AGENCY_ADDR_CODE;
             :FRBGRNT_AGENCY_ADDR_SEQ_NUM:=C1rec.FRBPROP_AGENCY_ADDR_SEQ_NUM;
             :FRBGRNT_COAS_CODE_IC_CS:=C1rec.FRBPROP_COAS_CODE_IC_CS;
             :FRBGRNT_BASI_CODE_IC:= C1rec.FRBPROP_BASI_CODE_IC;
             :FRBGRNT_INDR_CODE_RATE:= C1rec.FRBPROP_INDR_CODE_RATE;
             :FRBGRNT_INDA_CODE_CHARGE:=C1rec.FRBPROP_INDA_CODE_CHARGE;
             :FRBGRNT_INDD_CODE_DISTR:=C1rec.FRBPROP_INDD_CODE_DISTR;
             :FRBGRNT_BASI_CODE_CS:= C1rec.FRBPROP_BASI_CODE_CS;
             :FRBGRNT_CSTR_CODE_RATE:=C1rec.FRBPROP_CSTR_CODE_RATE; 
             :FRBGRNT_CSTA_CODE_CHARGE:=C1rec.FRBPROP_CSTA_CODE_CHARGE;
             :FRBGRNT_CSTD_CODE_DISTR:=C1rec.FRBPROP_CSTD_CODE_DISTR;

        
            END LOOP;
    
     END;
	*/
	//ID:3517
	/* <p>
/* </p>
		* @param varProp
		*/
		public void frbpropIsNotNull(FrbgrntAdapter frbgrntElement, NString varProp)
		{
			int rowCount = 0;
			String sqlpropNotNull = "SELECT FRBPROP_CODE, FRBPROP_ACTIVITY_DATE, FRBPROP_USER_ID, FRBPROP_COAS_CODE, FRBPROP_ORGN_CODE_RESP_OFFICE, FRBPROP_LONG_TITLE, FRBPROP_TITLE, FRBPROP_AGENCY_PIDM, FRBPROP_PI_PIDM, FRBPROP_STATUS_CODE, FRBPROP_STATUS_DATE, FRBPROP_PROJECT_START_DATE, FRBPROP_PROJECT_END_DATE, FRBPROP_PROPOSAL_TYPE, FRBPROP_CATEGORY, FRBPROP_SUB_CATEGORY, FRBPROP_CFDA_INTERNAL_ID_NO, FRBPROP_SPONSOR_ID, FRBPROP_AGENCY_CONTACT, FRBPROP_AGENCY_ADDR_CODE, FRBPROP_AGENCY_ADDR_SEQ_NUM, FRBPROP_AGENCY_PHONE_TYPE, FRBPROP_COAS_CODE_IC_CS, FRBPROP_BASI_CODE_IC, FRBPROP_INDR_CODE_RATE, FRBPROP_INDA_CODE_CHARGE, FRBPROP_INDD_CODE_DISTR, FRBPROP_BASI_CODE_CS, FRBPROP_CSTR_CODE_RATE, FRBPROP_CSTA_CODE_CHARGE, FRBPROP_CSTD_CODE_DISTR " +
	" FROM FRBPROP " +
	" WHERE FRBPROP_CODE = :P_VAR_PROP ";
			DataCursor propNotNull = new DataCursor(sqlpropNotNull);
			try {
				//Setting query parameters
				propNotNull.addParameter("P_VAR_PROP", varProp);

				propNotNull.open();
				while (true) {
					TableRow c1rec = propNotNull.fetchRow();
					if ( propNotNull.notFound() ) break;
					frbgrntElement.setFrbgrntCode(varProp);
					frbgrntElement.setFrbgrntActivityDate(trunc(NDate.getNow()));
					frbgrntElement.setFrbgrntUserId(getUser());
					frbgrntElement.setFrbgrntPropCode(c1rec.getStr("FRBPROP_CODE"));
					frbgrntElement.setFrbgrntCoasCode(c1rec.getStr("FRBPROP_COAS_CODE"));
					frbgrntElement.setFrbgrntOrgnCodeRespOffice(c1rec.getStr("FRBPROP_ORGN_CODE_RESP_OFFICE"));
					frbgrntElement.setFrbgrntLongTitle(c1rec.getStr("FRBPROP_LONG_TITLE"));
					frbgrntElement.setFrbgrntTitle(c1rec.getStr("FRBPROP_TITLE"));
					frbgrntElement.setFrbgrntAgencyPidm(c1rec.getNumber("FRBPROP_AGENCY_PIDM"));
					frbgrntElement.setFrbgrntPiPidm(c1rec.getNumber("FRBPROP_PI_PIDM"));
					frbgrntElement.setFrbgrntStatusCode(toStr(""));
					frbgrntElement.setFrbgrntStatusDate(toDate(""));
					frbgrntElement.setFrbgrntProjectStartDate(c1rec.getDate("FRBPROP_PROJECT_START_DATE"));
					frbgrntElement.setFrbgrntProjectEndDate(c1rec.getDate("FRBPROP_PROJECT_END_DATE"));
					frbgrntElement.setFrbgrntGrantType(toStr(""));
					frbgrntElement.setFrbgrntCategory(toStr(""));
					frbgrntElement.setFrbgrntSubCategory(toStr(""));
					frbgrntElement.setFrbgrntCfdaInternalIdNo(c1rec.getNumber("FRBPROP_CFDA_INTERNAL_ID_NO"));
					frbgrntElement.setFrbgrntSponsorId(c1rec.getStr("FRBPROP_SPONSOR_ID"));
					frbgrntElement.setFrbgrntAgencyContact(c1rec.getStr("FRBPROP_AGENCY_CONTACT"));
					frbgrntElement.setFrbgrntAgencyAddrCode(c1rec.getStr("FRBPROP_AGENCY_ADDR_CODE"));
					frbgrntElement.setFrbgrntAgencyAddrSeqNum(c1rec.getNumber("FRBPROP_AGENCY_ADDR_SEQ_NUM"));
					frbgrntElement.setFrbgrntCoasCodeIcCs(c1rec.getStr("FRBPROP_COAS_CODE_IC_CS"));
					frbgrntElement.setFrbgrntBasiCodeIc(c1rec.getStr("FRBPROP_BASI_CODE_IC"));
					frbgrntElement.setFrbgrntIndrCodeRate(c1rec.getStr("FRBPROP_INDR_CODE_RATE"));
					frbgrntElement.setFrbgrntIndaCodeCharge(c1rec.getStr("FRBPROP_INDA_CODE_CHARGE"));
					frbgrntElement.setFrbgrntInddCodeDistr(c1rec.getStr("FRBPROP_INDD_CODE_DISTR"));
					frbgrntElement.setFrbgrntBasiCodeCs(c1rec.getStr("FRBPROP_BASI_CODE_CS"));
					frbgrntElement.setFrbgrntCstrCodeRate(c1rec.getStr("FRBPROP_CSTR_CODE_RATE"));
					frbgrntElement.setFrbgrntCstaCodeCharge(c1rec.getStr("FRBPROP_CSTA_CODE_CHARGE"));
					frbgrntElement.setFrbgrntCstdCodeDistr(c1rec.getStr("FRBPROP_CSTD_CODE_DISTR"));
				}
			}finally{
				propNotNull.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_FRAPROP_1
	
	 FUNCTION SELECT_FRAPROP_1 (var varchar2)
  RETURN BOOLEAN IS
      PTI_INTO_TEMP varchar2(1);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FRBPROP
         WHERE  FRBPROP_CODE = var;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%FOUND) ;
   END ;

	*/
	//ID:3518
	/* <p>
/* </p>
		* @param var
		*/
		public NBool selectFraprop1(NString var)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM FRBPROP " +
	" WHERE FRBPROP_CODE = :P_VAR ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_VAR", var);
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.found()));
			} finally {
				ptiCursor.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit SET_PIDM_FIELDS
	
	PROCEDURE SET_PIDM_FIELDS IS
BEGIN


  EXECUTE_TRIGGER('GET_AGENCY_CODE');
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('GET_PI_ID_CODE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('GET_AGCY_CODE_PRED_PIDM');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('GET_CFDA_CODE');
  G$_CHECK_FAILURE; 
  EXECUTE_TRIGGER('EDIT_STATUS_CODE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('EDIT_ORGN_CODE');
  G$_CHECK_FAILURE;
--
   :HOLD_STATUS_CODE := :frbgrnt_STATUS_CODE;
   :HOLD_PI_ID_CODE  := :frbgrnt_PI_ID_CODE;
   :HOLD_STATUS_DATE := :frbgrnt_status_date;
	 :form_header.hold_alt_status_desc := :frbgrnt.frbgrnt_alternate_status_desc;
END;
	*/
	//ID:3519
	/* <p>
/* </p>
		*/
		public void setPidmFields(FrbgrntAdapter frbgrntElement)
		{
			executeAction("GET_AGENCY_CODE");
			getTask().getGoqrpls().gCheckFailure();
			// 
			executeAction("GET_PI_ID_CODE");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("GET_AGCY_CODE_PRED_PIDM");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("GET_CFDA_CODE");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("EDIT_STATUS_CODE");
			getTask().getGoqrpls().gCheckFailure();
			executeAction("EDIT_ORGN_CODE");
			getTask().getGoqrpls().gCheckFailure();
			// 
			getFormModel().getFormHeader().setHoldStatusCode(frbgrntElement.getFrbgrntStatusCode());
			getFormModel().getFormHeader().setHoldPiIdCode(frbgrntElement.getFrbgrntPiIdCode());
			getFormModel().getFormHeader().setHoldStatusDate(frbgrntElement.getFrbgrntStatusDate());
			getFormModel().getFormHeader().setHoldAltStatusDesc(frbgrntElement.getFrbgrntAlternateStatusDesc());
		}

	
	/* Original PL/SQL code for Prog Unit COPY_FROM_PROP_FRRGLOC
	
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
	*/
	//ID:3520
	/* <p>
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
			String sql1 = "INSERT INTO FRRgloc " +
	"(FRRgloc_grnt_CODE, FRRgloc_LOCN_CODE, FRRgloc_LOCN_RESEARCH_IND, FRRgloc_ACTIVITY_DATE, FRRgloc_USER_ID)" +
	"(SELECT SELECT :FRBGRNT_CODE, FRRploc_LOCN_CODE, FRRploc_LOCN_RESEARCH_IND, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID " +
	" FROM FRRploc " +
	" WHERE FRRploc_prop_CODE = :DISPLAY_PROP_CODE )";
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

	
	/* Original PL/SQL code for Prog Unit COPY_FROM_PROP_FRRGRPI
	
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
  INSERT INTO FRRgrpi (FRRgrpi_grnt_CODE,
			FRRgrpi_ID_IND,
                        FRRgrpi_ID_PIDM,
			FRRgrpi_ORGN_CODE,
			FRRgrpi_SALUTATION,
                        FRRgrpi_TITLE,
			FRRgrpi_FTE,
			FRRgrpi_EMPLOYEE_IND,
                        FRRgrpi_ACTIVITY_DATE, 
			FRRgrpi_USER_ID)
  ( SELECT :frbgrnt_CODE, 
			FRRprpi_ID_IND, 
			FRRprpi_ID_PIDM, 
			FRRprpi_ORGN_CODE, 
            		FRRprpi_SALUTATION, 
			FRRprpi_TITLE, 
			FRRprpi_FTE, 
			FRRprpi_EMPLOYEE_IND,
            		:frbgrnt_ACTIVITY_DATE,
			:frbgrnt_USER_ID
   FROM FRRprpi
   WHERE FRRprpi_prop_CODE = :display_prop_code);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;


	*/
	//ID:3521
	/* <p>
/* </p>
		*/
		public void copyFromPropFrrgrpi(FrbgrntAdapter frbgrntElement)
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
			//    
			String sql1 = "INSERT INTO FRRgrpi " +
	"(FRRgrpi_grnt_CODE, FRRgrpi_ID_IND, FRRgrpi_ID_PIDM, FRRgrpi_ORGN_CODE, FRRgrpi_SALUTATION, FRRgrpi_TITLE, FRRgrpi_FTE, FRRgrpi_EMPLOYEE_IND, FRRgrpi_ACTIVITY_DATE, FRRgrpi_USER_ID)" +
	"(SELECT SELECT :FRBGRNT_CODE, FRRprpi_ID_IND, FRRprpi_ID_PIDM, FRRprpi_ORGN_CODE, FRRprpi_SALUTATION, FRRprpi_TITLE, FRRprpi_FTE, FRRprpi_EMPLOYEE_IND, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID " +
	" FROM FRRprpi " +
	" WHERE FRRprpi_prop_CODE = :DISPLAY_PROP_CODE )";
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

	
	/* Original PL/SQL code for Prog Unit COPY_FROM_PROP_FRRGUSN
	
	PROCEDURE COPY_FROM_PROP_FRRgusn IS
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

	*/
	//ID:3522
	/* <p>
/* </p>
		*/
		public void copyFromPropFrrgusn(FrbgrntAdapter frbgrntElement)
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
			//    
			String sql1 = "INSERT INTO FRRgusn " +
	"(FRRgusn_grnt_CODE, FRRgusn_SDAT_CODE_ATTR, FRRgusn_SDAT_CODE_OPT_1, FRRgusn_ACTIVITY_DATE, FRRgusn_USER_ID)" +
	"(SELECT SELECT :FRBGRNT_CODE, FRRpusn_SDAT_CODE_ATTR, FRRpusn_SDAT_CODE_OPT_1, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID " +
	" FROM FRRpusn " +
	" WHERE FRRpusn_prop_CODE = :DISPLAY_PROP_CODE )";
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

	
	/* Original PL/SQL code for Prog Unit COPY_FROM_PROP_FRBGBIL
	
	PROCEDURE COPY_FROM_PROP_FRBGBIL IS
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
			FRBGBIL_LAST_INV_SEQ_NO,
			FRBGBIL_BFRM_CODE_1034_EXT,
			FRBGBIL_BUD_LINE_EXCEED_IND,
			FRBGBIL_MIN_NOT_REACHED_IND,
			FRBGBIL_BUD_TOTAL_EXCEED_IND,
			FRBGBIL_BUD_CHECK_SOURCE_IND,
			FRBGBIL_BILLING_START_DATE,
			FRBGBIL_BILLING_END_DATE,
			FRBGBIL_BILLING_MIN_AMT,
			FRBGBIL_CUMULATIVE_BILLED_AMT,
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
		FRBGBIL_LAST_INV_SEQ_NO,
		FRBGBIL_BFRM_CODE_1034_EXT,
		FRBGBIL_BUD_LINE_EXCEED_IND,
		FRBGBIL_MIN_NOT_REACHED_IND,
		FRBGBIL_BUD_TOTAL_EXCEED_IND,
		FRBGBIL_BUD_CHECK_SOURCE_IND,
		FRBGBIL_BILLING_START_DATE,
		FRBGBIL_BILLING_END_DATE,
		FRBGBIL_BILLING_MIN_AMT,
		FRBGBIL_CUMULATIVE_BILLED_AMT,
		FRBGBIL_BILLING_MAX_AMT,
		FRBGBIL_DEFERRED_ACCT_CODE
   FROM FRBGBIL
   WHERE FRBGBIL_grnt_CODE = :COPY_GRNT_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;


	*/
	//ID:3523
	/* <p>
/* </p>
		*/
		public void copyFromPropFrbgbil(FrbgrntAdapter frbgrntElement)
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
			String sql1 = "INSERT INTO FRBGBIL " +
	"(FRBGBIL_grnt_CODE, FRBGBIL_COAS_CODE, FRBGBIL_ACTIVITY_DATE, FRBGBIL_USER_ID, FRBGBIL_PMSC_CODE, FRBGBIL_BECL_CODE, FRBGBIL_BUDGET_LIMIT_IND, FRBGBIL_PAYMENT_FUND_CODE, FRBGBIL_PAYMENT_ACCT_CODE, FRBGBIL_CLEARING_ACCT_CODE, FRBGBIL_ADDR_TYPE, FRBGBIL_ADDR_SEQNO, FRBGBIL_LAST_INV_SEQ_NO, FRBGBIL_BFRM_CODE_1034_EXT, FRBGBIL_BUD_LINE_EXCEED_IND, FRBGBIL_MIN_NOT_REACHED_IND, FRBGBIL_BUD_TOTAL_EXCEED_IND, FRBGBIL_BUD_CHECK_SOURCE_IND, FRBGBIL_BILLING_START_DATE, FRBGBIL_BILLING_END_DATE, FRBGBIL_BILLING_MIN_AMT, FRBGBIL_CUMULATIVE_BILLED_AMT, FRBGBIL_BILLING_MAX_AMT, FRBGBIL_DEFERRED_ACCT_CODE)" +
	"(SELECT SELECT :FRBGRNT_CODE, FRBGBIL_COAS_CODE, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID, FRBGBIL_PMSC_CODE, FRBGBIL_BECL_CODE, FRBGBIL_BUDGET_LIMIT_IND, FRBGBIL_PAYMENT_FUND_CODE, FRBGBIL_PAYMENT_ACCT_CODE, FRBGBIL_CLEARING_ACCT_CODE, FRBGBIL_ADDR_TYPE, FRBGBIL_ADDR_SEQNO, FRBGBIL_LAST_INV_SEQ_NO, FRBGBIL_BFRM_CODE_1034_EXT, FRBGBIL_BUD_LINE_EXCEED_IND, FRBGBIL_MIN_NOT_REACHED_IND, FRBGBIL_BUD_TOTAL_EXCEED_IND, FRBGBIL_BUD_CHECK_SOURCE_IND, FRBGBIL_BILLING_START_DATE, FRBGBIL_BILLING_END_DATE, FRBGBIL_BILLING_MIN_AMT, FRBGBIL_CUMULATIVE_BILLED_AMT, FRBGBIL_BILLING_MAX_AMT, FRBGBIL_DEFERRED_ACCT_CODE " +
	" FROM FRBGBIL " +
	" WHERE FRBGBIL_grnt_CODE = :COPY_GRNT_CODE )";
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

	
	/* Original PL/SQL code for Prog Unit COPY_INSERT_FRBGBIL
	
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
			FRBGBIL_LAST_INV_SEQ_NO,
			FRBGBIL_BFRM_CODE_1034_EXT,
			FRBGBIL_BUD_LINE_EXCEED_IND,
			FRBGBIL_MIN_NOT_REACHED_IND,
			FRBGBIL_BUD_TOTAL_EXCEED_IND,
			FRBGBIL_BUD_CHECK_SOURCE_IND,
			FRBGBIL_BILLING_START_DATE,
			FRBGBIL_BILLING_END_DATE,
			FRBGBIL_BILLING_MIN_AMT,
			FRBGBIL_CUMULATIVE_BILLED_AMT,
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
		FRBGBIL_LAST_INV_SEQ_NO,
		FRBGBIL_BFRM_CODE_1034_EXT,
		FRBGBIL_BUD_LINE_EXCEED_IND,
		FRBGBIL_MIN_NOT_REACHED_IND,
		FRBGBIL_BUD_TOTAL_EXCEED_IND,
		FRBGBIL_BUD_CHECK_SOURCE_IND,
		FRBGBIL_BILLING_START_DATE,
		FRBGBIL_BILLING_END_DATE,
		FRBGBIL_BILLING_MIN_AMT,
	  FRBGBIL_CUMULATIVE_BILLED_AMT,
		FRBGBIL_BILLING_MAX_AMT,
		FRBGBIL_DEFERRED_ACCT_CODE
   FROM FRBGBIL
   WHERE FRBGBIL_grnt_CODE = :COPY_GRNT_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;


	*/
	//ID:3524
	/* <p>
/* </p>
		*/
		public void copyInsertFrbgbil(FrbgrntAdapter frbgrntElement)
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
			String sql1 = "INSERT INTO FRBGBIL " +
	"(FRBGBIL_grnt_CODE, FRBGBIL_COAS_CODE, FRBGBIL_ACTIVITY_DATE, FRBGBIL_USER_ID, FRBGBIL_PMSC_CODE, FRBGBIL_BECL_CODE, FRBGBIL_BUDGET_LIMIT_IND, FRBGBIL_PAYMENT_FUND_CODE, FRBGBIL_PAYMENT_ACCT_CODE, FRBGBIL_CLEARING_ACCT_CODE, FRBGBIL_ADDR_TYPE, FRBGBIL_ADDR_SEQNO, FRBGBIL_LAST_INV_SEQ_NO, FRBGBIL_BFRM_CODE_1034_EXT, FRBGBIL_BUD_LINE_EXCEED_IND, FRBGBIL_MIN_NOT_REACHED_IND, FRBGBIL_BUD_TOTAL_EXCEED_IND, FRBGBIL_BUD_CHECK_SOURCE_IND, FRBGBIL_BILLING_START_DATE, FRBGBIL_BILLING_END_DATE, FRBGBIL_BILLING_MIN_AMT, FRBGBIL_CUMULATIVE_BILLED_AMT, FRBGBIL_BILLING_MAX_AMT, FRBGBIL_DEFERRED_ACCT_CODE)" +
	"(SELECT SELECT :FRBGRNT_CODE, FRBGBIL_COAS_CODE, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID, FRBGBIL_PMSC_CODE, FRBGBIL_BECL_CODE, FRBGBIL_BUDGET_LIMIT_IND, FRBGBIL_PAYMENT_FUND_CODE, FRBGBIL_PAYMENT_ACCT_CODE, FRBGBIL_CLEARING_ACCT_CODE, FRBGBIL_ADDR_TYPE, FRBGBIL_ADDR_SEQNO, FRBGBIL_LAST_INV_SEQ_NO, FRBGBIL_BFRM_CODE_1034_EXT, FRBGBIL_BUD_LINE_EXCEED_IND, FRBGBIL_MIN_NOT_REACHED_IND, FRBGBIL_BUD_TOTAL_EXCEED_IND, FRBGBIL_BUD_CHECK_SOURCE_IND, FRBGBIL_BILLING_START_DATE, FRBGBIL_BILLING_END_DATE, FRBGBIL_BILLING_MIN_AMT, FRBGBIL_CUMULATIVE_BILLED_AMT, FRBGBIL_BILLING_MAX_AMT, FRBGBIL_DEFERRED_ACCT_CODE " +
	" FROM FRBGBIL " +
	" WHERE FRBGBIL_grnt_CODE = :COPY_GRNT_CODE )";
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

	
	/* Original PL/SQL code for Prog Unit COPY_FROM_TO_FOATEXT
	
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


	*/
	//ID:3527
	/* <p>
/* </p>
		*/
		public void copyFromToFoatext(FrbgrntAdapter frbgrntElement)
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
			//    
			String sql1 = "INSERT INTO FOBTEXT " +
	"(FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE, FOBTEXT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT)" +
	"(SELECT SELECT 51, :FRBGRNT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, :FRBGRNT_ACTIVITY_DATE, :FRBGRNT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT " +
	" FROM FOBTEXT " +
	" WHERE FOBTEXT_CODE = :DISPLAY_PROP_CODE AND FOBTEXT_DTYP_SEQ_NUM = 29 AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_ITEM IS NULL )";
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

	
	/* Original PL/SQL code for Prog Unit SELECT_FRBPROP_1
	
	FUNCTION SELECT_FRBPROP_1(var varchar2)
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FRBPROP
         WHERE  FRBPROP_CODE = var;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:3528
	/* <p>
/* </p>
		* @param var
		*/
		public NBool selectFrbprop1(NString var)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
									" FROM FRBPROP " +
									" WHERE FRBPROP_CODE = :P_VAR ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_VAR", var);
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.notFound()));
			} finally {
				ptiCursor.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_FRBGRNT_PROP
	
	PROCEDURE SELECT_FRBGRNT_PROP(VAR VARCHAR2)  IS
  
   cursor c1 is 
  select frbgrnt_prop_code
   from frbgrnt
     where frbgrnt_code = var;
   BEGIN
      OPEN C1;
      FETCH C1 INTO :DISPLAY_PROP_CODE ;
   END ;

	*/
	//ID:3529
	/* <p>
/* </p>
		* @param var
		*/
		public void selectFrbgrntProp(NString var)
		{
			int rowCount = 0;
			String sqlc1 = "SELECT frbgrnt_prop_code " +
							" FROM frbgrnt " +
							" WHERE frbgrnt_code = :P_VAR ";
			DataCursor c1 = new DataCursor(sqlc1);
			try {
				//Setting query parameters
				c1.addParameter("P_VAR", var);
				c1.open();
				ResultSet c1Results = c1.fetchInto();
				if ( c1Results != null ) {
					getFormModel().getKeyBlock().setDisplayPropCode(c1Results.getStr(0));
				}
			} finally {
				c1.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit DETERMINE_END_DATE
	
	FUNCTION DETERMINE_END_DATE RETURN BOOLEAN
 IS
  var_date frbgrnt.frbgrnt_project_end_date%type;
  cursor CHECK_DATE is
   select frbgrnt_project_end_date
          from frbgrnt
          where frbgrnt_code = :frbgrnt_code;
BEGIN
  open CHECK_DATE;
  fetch check_date into var_date;
  IF :FRBGRNT_PROJECT_END_DATE IS NULL OR
     :frbgrnt_project_end_date < var_date then
      return TRUE;
  ELSE
      RETURN FALSE;
  end if;
RETURN NULL; END;
	*/
	//ID:3530
	/* <p>
/* </p>
		*/
		public NBool determineEndDate(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			NDate varDate= NDate.getNull();
			String sqlcheckDate = "SELECT frbgrnt_project_end_date " +
									" FROM frbgrnt " +
									" WHERE frbgrnt_code = :FRBGRNT_CODE ";
			DataCursor checkDate = new DataCursor(sqlcheckDate);
			try {
				//Setting query parameters
				checkDate.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
				checkDate.open();
				ResultSet checkDateResults = checkDate.fetchInto();
				if ( checkDateResults != null ) {
					varDate = checkDateResults.getDate(0);
				}
			} finally {
				checkDate.close();
			}
			if ( frbgrntElement.getFrbgrntProjectEndDate().isNull() || frbgrntElement.getFrbgrntProjectEndDate().lesser(varDate) )
			{
				return  toBool(NBool.True);
			}
			else {
				return  toBool(NBool.False);
			}
		}

	
	/* Original PL/SQL code for Prog Unit DETERMINE_IN_BUDGET_TABLE
	
	FUNCTION DETERMINE_IN_BUDGET_TABLE RETURN BOOLEAN
 IS
   var_one varchar2(1);
   cursor CHECK_BUDGET_TABLE is
     select 'X'
       from frrgrnl
         where frrgrnl_grnt_code = :display_frbgrnt_code;
BEGIN
  open check_budget_table;
  fetch check_budget_table into var_one;
  if check_budget_table%FOUND then
     return TRUE;
  else
     return FALSE;
  end if;
RETURN NULL; END;
	*/
	//ID:3531
	/* <p>
/* </p>
		*/
		public NBool determineInBudgetTable()
		{
			int rowCount = 0;
			NString varOne= NString.getNull();
			String sqlcheckBudgetTable = "SELECT 'X' " +
											" FROM frrgrnl " +
											" WHERE frrgrnl_grnt_code = :DISPLAY_FRBGRNT_CODE ";
			DataCursor checkBudgetTable = new DataCursor(sqlcheckBudgetTable);
			try {
				//Setting query parameters
				checkBudgetTable.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
				checkBudgetTable.open();
				ResultSet checkBudgetTableResults = checkBudgetTable.fetchInto();
				if ( checkBudgetTableResults != null ) {
					varOne = checkBudgetTableResults.getStr(0);
				}
				if ( checkBudgetTable.found() )
				{
					return  toBool(NBool.True);
				}
				else {
					return  toBool(NBool.False);
				}
			} finally {
				checkBudgetTable.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit DETERMINE_END_DATE_YES
	
	FUNCTION DETERMINE_END_DATE_YES RETURN BOOLEAN
 IS
  var_date frbgrnt.frbgrnt_project_end_date%type;
  cursor CHECK_DATE_TWO is
   select frbgrnt_project_end_date
          from frbgrnt
          where frbgrnt_code = :frbgrnt_code;
BEGIN
  open CHECK_DATE_TWO;
  fetch check_date_two into var_date;
  if check_date_two%NOTFOUND or
     var_date is null then
      return TRUE;
  ELSE
     return FALSE;
  end if;
RETURN NULL; END;
	*/
	//ID:3532
	/* <p>
/* </p>
		*/
		public NBool determineEndDateYes(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			NDate varDate= NDate.getNull();
			String sqlcheckDateTwo = "SELECT frbgrnt_project_end_date " +
										" FROM frbgrnt " +
										" WHERE frbgrnt_code = :FRBGRNT_CODE ";
			DataCursor checkDateTwo = new DataCursor(sqlcheckDateTwo);
			try {
				//Setting query parameters
				checkDateTwo.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
				checkDateTwo.open();
				ResultSet checkDateTwoResults = checkDateTwo.fetchInto();
				if ( checkDateTwoResults != null ) {
					varDate = checkDateTwoResults.getDate(0);
				}
				if ( checkDateTwo.notFound() || varDate.isNull() )
				{
					return  toBool(NBool.True);
				}
				else {
					return  toBool(NBool.False);
				}
			} finally {
				checkDateTwo.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit WHAT_IS_HOLD
	
	PROCEDURE WHAT_IS_HOLD IS


cursor what_is_hold is
       select frbgrnt_project_end_date
       from frbgrnt
       where frbgrnt_code = :frbgrnt_code;
begin
       open what_is_hold;
       fetch what_is_hold into :hold_end_date;
       close what_is_hold;
end;

 
	*/
	//ID:3533
	/* <p>
/* </p>
		*/
		public void whatIsHold(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			String sqlwhatIsHold = "SELECT frbgrnt_project_end_date " +
	" FROM frbgrnt " +
	" WHERE frbgrnt_code = :FRBGRNT_CODE ";
			DataCursor whatIsHold = new DataCursor(sqlwhatIsHold);
			try {
				//Setting query parameters
				whatIsHold.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
				whatIsHold.open();
				ResultSet whatIsHoldResults = whatIsHold.fetchInto();
				if ( whatIsHoldResults != null ) {
					frbgrntElement.setHoldEndDate(whatIsHoldResults.getDate(0));
				}
			} finally {
				whatIsHold.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit WHAT_IS_START
	
	PROCEDURE WHAT_IS_START IS

cursor what_is_start is
       select frbgrnt_project_start_date
       from frbgrnt
       where frbgrnt_code = :frbgrnt_code;
begin
       open what_is_start;
       fetch what_is_start into :hold_start_date;
       close what_is_start;
end;
	*/
	//ID:3534
	/* <p>
/* </p>
		*/
		public void whatIsStart(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			String sqlwhatIsStart = "SELECT frbgrnt_project_start_date " +
	" FROM frbgrnt " +
	" WHERE frbgrnt_code = :FRBGRNT_CODE ";
			DataCursor whatIsStart = new DataCursor(sqlwhatIsStart);
			try {
				//Setting query parameters
				whatIsStart.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
				whatIsStart.open();
				ResultSet whatIsStartResults = whatIsStart.fetchInto();
				if ( whatIsStartResults != null ) {
					frbgrntElement.setHoldStartDate(whatIsStartResults.getDate(0));
				}
			} finally {
				whatIsStart.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit COPY_FROM_TO_FRBPROP
	
	PROCEDURE COPY_FROM_TO_FRBPROP IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frbprop
     where frbprop_code = :display_prop_code;
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

   UPDATE FRBPROP
     SET FRBPROP_GRNT_CODE = :FRBGRNT_CODE
     WHERE FRBPROP_CODE = :DISPLAY_PROP_CODE;
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;
	*/
	//ID:3535
	/* <p>
/* </p>
		*/
		public void copyFromToFrbprop(FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frbprop " +
	" WHERE frbprop_code = :DISPLAY_PROP_CODE ";
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
			String sql1 = "UPDATE FRBPROP " +
	"SET FRBPROP_GRNT_CODE = :FRBGRNT_CODE " +
	" WHERE FRBPROP_CODE = :DISPLAY_PROP_CODE";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command1.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>AUDIT TRAIL: 4.0
1.  Defect.....NONE
    Signoff....Tom Mack 3/1/98
    Problems...NONE
    Fix........Grant Billing enhancements.

2.  Defect.....FIN310187
    Signoff....Tom Mack 4/2/98
    Problems...On, the Indirect Cost and Cost Share window,
		 When the C/S Distribution From Code is completely
                 filled in, the form takes you back to the
		 Grant Header window
    Fix........Turned Auto-Skip off on C/S Distribution From Code  

3.  Defect.....FIN9997
    Signoff....Robert Rullo 12/5/98
    Problems...When someone changed a cost share basis code in 
               FTMBASI you weren't able to navigate to C/S Window 
               because the RE_EDIT trigger was failing on the call
               to EDIT_BASI_CODE_IC.
    FIX........Removed G$_CHECK_FAILURE after the call to EDIT_BASI_CODE_IC

AUDIT TRAIL END
</multilinecomment>
BEGIN
 null; 
END;
	*/
	//ID:3536
	/* <p>
/* </p>
		*/
		public void auditTrail40()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. Robert Rullo 9/15/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.

2. Kayur Patel  1/26/99
   Phase II UI changes

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3537
	/* <p>
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_1
	
	PROCEDURE AUDIT_TRAIL_4_1 IS
<multilinecomment>AUDIT TRAIL: 4.1
1.  Defect.....10401
    Signoff....Srilakshmi Baisetty  18-AUG-1999
    Problems...Create a contact and a defect on fund org security on FRAPROP and 
               FRAGRNT. When you navigate to FRIGRNT and you can bring back  
               any grant eventhough if you don't have access to that org. Same problem   
               with FRIPROP and FRAPROP.  
    Fix........Modified EDIT_ORGN_SECURITY_AFTER_QUERY, EDIT_ORGN_SECURITY,FORCE_COMMIT,
               KEY_COMMIT and EDIT_ORGN_CODE triggers at form level.
               modified POST_CHANGE, WHEN-NEW-ITEM-INSTANCE triggers at an item level
               FRBGRNT_ORGN_CODE_RESP_OFFICE.
2.  Defect.....None
    Signoff....Raji Ramasubramoni  07-SEP-1999
    Mod........Modification related to workflow for using
               gobeacc_pidm instead of fobprof_pidm.Modified
               'call_form_event_trigger' to use gobeacc_pidm
                field instead of fobprof_pidm.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3538
	/* <p>
/* </p>
		*/
		public void auditTrail41()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_2
	
	PROCEDURE AUDIT_TRAIL_4_2 IS
<multilinecomment> AUDIT TRAIL: 4.2
1. Defect.....None
   Signoff....Galina Andronov  02/21/2000
   Problem....Record Group FRVPMSC_RG has invalid columns.
   Fix........Corrected FRVPMSC_RG to have valid columns.

2. Defect.....36198
   Signoff....Srivalli Pillutla 30/06/2000
   Problem....Value error on id_name.
   Fix........Modified triggers Get_pi_id_code and Get_id_code.
              Increased length of var hold_id_name to 120 from 40.
AUDIT TRAIL END  </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3539
	/* <p>
/* </p>
		*/
		public void auditTrail42()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
  <multilinecomment>
AUDIT TRAIL: 5.0
 1. Defect....None
    Signoff...Rizwan Alloo 06/12/2000
    Problem...During generate for 5.0, the form gives the following warning:
  							FRM-30407: Block must have at least one database item.Block: BLOCK3
								FRM-30113: Block must have non-query-only database item.Block: BLOCK3
    Fix.......Changed the Database Data Block property on BLOCK3 from Yes to No. 

AUDIT TRAIL END
</multilinecomment>
BEGIN
 NULL;
END;

	*/
	//ID:3540
	/* <p>
/* </p>
		*/
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_MANUAL
	
	PROCEDURE AUDIT_TRAIL_5_0_MANUAL IS
<multilinecomment>
AUDIT_TRAIL: 5.0
1.   Dev 6 Manual conversion       Rizwan Alloo   10/11/2000
Do not modify this program unit
</multilinecomment>
BEGIN
 NULL;
END;
	*/
	//ID:3541
	/* <p>
/* </p>
		*/
		public void auditTrail50Manual()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_3
	
	PROCEDURE AUDIT_TRAIL_5_3 IS
<multilinecomment>AUDIT TRAIL: 5.3
1. Defect.....#68995
   Signoff....Galina Andronov   10/05/2001
   Problem....When pulling a grant up on FRAGRNT and selecting the Personnel option from the menu or doing a next block
              to get to that page, Banner will bump you out of the form and take you back to the main menu. The grants 
              that we looked at did not have anything set up on the Personnel page. If we created a new grant, we could 
              enter the personnel information. If we did a rollback and reviewed the information we could see it, but if 
              we exited the form and went back in, we could not review it and would get bumped back to main menu.
   Fix........Modified MNU_OPT_PERSONNEL_INFO trigger on form level.
   
2. Defect.....#38370
   Signoff....Galina Andronov   10/08/2001
   Problem....Wrong address info displayed.  Select Personnel Information from Navigation Frame. Click on 'flashlight' 
              next to Address Type or Address Sequence. Taken to the grants associated Agency and the agency address types
              and/or address sequence numbers.
   Fix........Modified KEY-LISTVAL trigger on FRRGRPI_ADDR_TYPE.

3. Defect.....76304
   Signoff....Galina Andronov   03/19/2002
   Problem....FRAGRNT - Grant Billing Information Window. When you enter a billing code (already setup on FTMBECL) that 
              has a description greater than 30 characters, user receives error 'FRM-40831: Truncation occurred: value 
              too long for field BECL_NAME'. The user cannot use the billing exclusion code without shortening the 
              description on FTMBECL, which allows for a 35-character description.
   Fix........Increase Max length for item FRBGBIL.BECL_NAME
AUDIT TRAIL END  </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3542
	/* <p>
/* </p>
		*/
		public void auditTrail53()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPY_INSERT_FRRAGPT
	
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

	*/
	//ID:3543
	/* <p>
/* </p>
		*/
		public void copyInsertFrragpt(FrbgrntAdapter frbgrntElement)
		{
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
			String sql1 = "INSERT INTO FRRAGPT " +
	"(FRRAGPT_GRNT_CODE, FRRAGPT_AGCY_PIDM, FRRAGPT_ACTIVITY_DATE, FRRAGPT_USER_ID, FRRAGPT_FEDERAL_FUND_PERCENT, FRRAGPT_SPONSOR_ID)" +
	"(SELECT SELECT :FRBGRNT_CODE, FRRAGPT_AGCY_PIDM, sysdate, :GLOBAL_USER_ID, FRRAGPT_FEDERAL_FUND_PERCENT, FRRAGPT_SPONSOR_ID " +
	" FROM FRRAGPT " +
	" WHERE frragpt_grnt_code = :COPY_GRNT_CODE )";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command1.addParameter("GLOBAL_USER_ID", getGlobal("USER_ID"));
			command1.addParameter("COPY_GRNT_CODE", getFormModel().getCopyBlock().getCopyGrntCode());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit COPY_FROM_PROP_FRRAGPT
	
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
	*/
	//ID:3544
	/* <p>
/* </p>
		*/
		public void copyFromPropFrragpt(FrbgrntAdapter frbgrntElement)
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
			// RPE# 1-19V7ZZD : Include the new sponsor Id column also in the insert list
			String sql1 = "INSERT INTO FRRAGPT " +
	"(FRRAGPT_GRNT_CODE, FRRAGPT_AGCY_PIDM, FRRAGPT_ACTIVITY_DATE, FRRAGPT_USER_ID, FRRAGPT_FEDERAL_FUND_PERCENT, FRRAGPT_SPONSOR_ID)" +
	"(SELECT SELECT :FRBGRNT_CODE, FRRPRPT_AGCY_PIDM, sysdate, :GLOBAL_USER_ID, FRRPRPT_FEDERAL_FUND_PERCENT, FRRPRPT_SPONSOR_ID " +
	" FROM FRRPRPT " +
	" WHERE frrprpt_prop_code = :DISPLAY_PROP_CODE )";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode());
			command1.addParameter("GLOBAL_USER_ID", getGlobal("USER_ID"));
			command1.addParameter("DISPLAY_PROP_CODE", getFormModel().getKeyBlock().getDisplayPropCode());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment>AUDIT TRAIL: 5.4
1. 	MOD..................UI 2615-03 - Pass Through Indicator And Information
   	AUTHOR...............Anagha Gandhe
  	CHANGES(FORM)........Added new check box -Pass Through Indicator and a popup window.
  								       If a grant is pass through, then popup window shows funding agency
  								       and federal percentage
  	CHANGES(DATABASE)....New Table FRRAGPT stores these details
2.  MOD..................UI 2615-07/08 - Overtype Description on Status and Events
		AUTHOR...............Anagha Gandhe
		CHANGES(FORM)........Modified Form to include new database field frbgrnt_alternate_status_desc
												 Status Desc now stores original desc||alternate desc
												 Desc is also stored in Status History.Modified program Unit INSERT_FRVGRST_1 for the same.
		CHANGES(DATABASE)....A new column FRBGRNT_ALTERNATE_STATUS_DESC added to table FRBGRNT
												 A new column FRVGRST_STATUS_DESC added to table FRVGRST   	
AUDIT TRAIL END</multilinecomment>
BEGIN
  	NULL;
END;
	*/
	//ID:3545
	/* <p>
/* </p>
		*/
		public void auditTrail54()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1.   Apply changes from 5.4 System Test.      Christine Liu   10/02/2002

2. Defect.....#76318 
   Signoff....Gladys Rocher 05-FEB-2003
   Problem....Several fields pulling titles from FTVACCT are NOT pulling
              the title from the correct chart in a multi-chart environment.
   Fix........On FRBGBIL_PAYMENT_ACCT_ACOUNT, FRBGBIL_CLEARING_ACCT_CODE 
              and FRBGBIL_DEFERRED_ACCT_CODE items,POST-CHANGE triggers,
              Get_name cursror verify that the coas code corresponds to the
              coas code entered in the header information window, and the 
              effective date is grater or equal than the system date and 
              the NCHG_DATE is grater that sysdate.

3. Defect.... #82169
   Signoff....Gladys Rocher 05-FEB-2003
   Problem....When you copy a grant, it should NOT copy the cumulative 
              billed amount.
   Fix........On COPY_INSERT_FRBGRNT Package Body comment out the columns
              FRBGBIL_CUMULATIVE_BILLED_AMT from bouth select section and
              insert section.

4. Defect.....#56141
   Signoff....Gladys Rocher 05-FEB-2003
   Problem....we could remove the CFDA code and save the record on FRAGRNT.
              We can no longer remove the CFDA code.   
   Fix.......On the FRBGRNT_CFDA_INTERNAL_ID_NO properties,
             in the Database Section change the status of the Update Allowed 
             property to Yes and finally in the FRBGRNT block, FRBGRNT_CFDA_CODE
             item, WHEN-VALIDATE-ITEM trigger, first comment out the code where 
             the cfda is null they do retrun.  Then only open the c1 cursor if
             the cfda code is not null else assing null to frbgrnt_cfda_internal_id_no.
     

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3546
	/* <p>
/* </p>
		*/
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_FORMSCNV
	
	PROCEDURE AUDIT_TRAIL_7_0_FORMSCNV IS 
<multilinecomment> 
AUDIT TRAIL: 7.0 FORMSCNV 
1. Michael Hitrik  01/30/2004 
  Auto conversion of UI enhancements. Refer to the General UI documentation for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:3547
	/* <p>
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4_01
	
	PROCEDURE AUDIT_TRAIL_5_4_01 IS
<multilinecomment>AUDIT TRAIL: 5.4.0.1
1.  Defect.....82775
    Signoff....Wei Zhang  26-jun-2003
    Problems...1. total budget limit checking does not stop overdraft.  
               2. In billing information page "Budget check source" = 'budget table'
                  is an invalid choice. 
               3. user can change billing invoice number and the cumulative amount
                  on the FRBGBIL page freely. 
    Fix........1. Delete the 'budget table' value from the budget check source 
               (fgbgbil_bud_check_source_ind) pulldown list. 
               2. Add when-list-changed trigger under FRBGBIL_BUDGET_LIMIT_IND.
               3. Create trigger set_limit under block FRBGBIL. 
               4. Modify post-block trigger under key_block.
               5. Modify when-new-block-instance trigger under FRBGBIL block to disable
                  the last invoice number and the cumulative amount fields if this grant
                  has bill issued already.
               
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3548
	/* <p>
/* </p>
		*/
		public void auditTrail5401()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. Wei Zhang 02-MAR-2004
  Application of enhanced UI methodology. Please refer to the SCT Banner 7.0 User Interface Technical Methodology for more details.
  Add tab canvas.

2. Defect 70-0125, LN 04-Aug-2004
   Problem:
     ID validation has local logic when should use g$/product$ routine(s).
   Functional Impact:
     Replaced local ID logic with g$ routines for Agency items, Investigator ID, 
     Predecessor in the Grant Agency tab page and ID in the Personnel tab page.
   Technical Fix:
     Modified triggers GET_ID_CODE, GET_AGENCY_CODE, GET_PI_ID_CODE, 
     GET_AGCY_CODE_PRED_PIDM, GET_PASS_THRU_DETAILS, FETCH_AGENCY_NAME, 
     FRBGRNT.FRBGRNT_AGENCY_CODE.WHEN-VALIDATE-ITEM, 
     FRBGRNT.DISPLAY_PASS_THRU_IND.WHEN-CHECKBOX-CHANGED, FRRAGPT.POST-QUERY to call 
     g$_sel_spriden_id_name, FRBGRNT.FRBGRNT_PI_ID_CODE.WHEN-VALIDATE-ITEM and 
     FRRGRPI.FRRGRPI_ID.WHEN-VALIDATE-ITEM to call g$_sel_spriden_pidm_name.
     
3. Wei Zhang 07-SEP-2004
   Add error handling logic to the on-error trigger under frbgrnt block.
        
AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3549
	/* <p>
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_1_0_1
	
	PROCEDURE AUDIT_TRAIL_6_1_0_1 IS
<multilinecomment>AUDIT TRAIL: 6.1.0.1
1.  Signoff....Wei Zhang  06-Apr-2004
               Apply 5.4.0.1 changes to Banner 6.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3550
	/* <p>
/* </p>
		*/
		public void auditTrail6101()
		{
		}

	
	/* Original PL/SQL code for Prog Unit CURSOR_ALREADY_IN_THAT_TABPAGE
	
	
function cursor_already_in_that_tabpage (inpage in varchar2) return boolean is
begin
   if get_item_property(:system.cursor_item,item_tab_page) = inpage then
      return true;
   else
      return false;
   end if;
RETURN NULL; 
end;
	*/
	//ID:3551
	/* <p>
/* </p>
		* @param inpage
		*/
		public NBool cursorAlreadyInThatTabpage(NString inpage)
		{
			//if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals(inpage) )
			if ( getCursorItem().equals(inpage) )
			{
				return  toBool(NBool.True);
			}
			else {
				return  toBool(NBool.False);
			}
			//return NBool.getNull();
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_1_0_1
	
	PROCEDURE AUDIT_TRAIL_7_1_0_1 IS
<multilinecomment> AUDIT TRAIL: 7.1.0.1
1. Defect.....93222
   Signoff....Wei Zhang  05-MAY-2005
   Problem....When agencies are inactivated, they still appear on the list when accessing 
              FTIIDEN through the FRAGRNT screen.  If an inactive agency is assigned, 
              FRRBILL will also bill the inactive agency.
              Create an agency on FTMAGCY and then inactivate it
              Creat grant of FRAGRNT and when you click the button for agency the inactive 
              agency will display and it can be selected and the grant is created with the
              inactive agency. 
   Fix........Modify the when-validate-item trigger under FRBGRNT.FRBGRNT_AGENCY_CODE. If
              an inactive agency is selected the form gives error message and stop the 
              processing of this record.
2. Defect.....87631
   Signoff....Wei Zhang  05-MAY-2005
   Problem....It is possible to save an invalid phone type and sequence in the Personnel 
              window of FRAGRNT. 
              In the Personnel window of FRAGRNT, search for telephone type and sequence.
              When one is selected, the sequence number returned is n or 3, which did not
              make sense.
              Grant Agency window has the same problem.
              User should not add telephone type and seq freely. They must exist in 
              FOAIDEN(in sprtele table).
   Fix........Modify the post-change trigger under FRRGRPI_PHONE_TYPE to validate the phone 
              type against FOAIDEN form's telephone page.
              Modify the form level trigger EDIT_SPRADDR to retrieve telephone seqno.
              Create a when-validate-item trigger under FRRGRPI_TELE_SEQNO to validate the 
              phone sequence against FOAIDEN form's telephone page.
              Create a when-validate-item trigger under FRBGRNT_AGENCY_PHONE_TYPE to 
              validate the phone sequence against FOAIDEN form's telephone page.
              Create a when-validate-item trigger under FRRGRPI_TELE_SEQNO to validate  
              the phone sequence against FOAIDEN form's telephone page.
3.  Defect.....87303
    Signoff....Wei Zhang   03-MAY-2005
    Problems...In FOMPROF, user has Master Fund = Query + Post, Master Org = None. In FOMUSOR,
               user has Both (Query + Post) to the necessary Org for the proposal. 
               1.  FOMPROF - set up user with Master Fund, No authority for ORG.
               2.  FOMUSOR - set up user with Both post and query is specific org.
               3.  FRAFRNT - Create new grant using org set up in FOMUSOR.
               4.  Save
               5.  Exit FRAGRNT and reenter - type in a new grant code
               6.  Next Block
               7.  Click copy grant from options.
               8.  Type in the grant just created by this user.
               9.  Error message 'User not authorized to query or post with entered organization.'
               When the user has rights to Master Org = Query + Post and then she could copy the grant.
               Permissions for query and posting for an organization code should be sufficient for 
               a user to copy grants with that organization.                
    Fix........Modify the block level trigger key-commit under copy_block.
               Modify the block level trigger KEY-CLRFRM.
               Modify the item level trigger post-text-item under frbprop_orgn_code_resp_office.  
4.  Defect.....104447
    Signoff....Wei Zhang 08/02/2005
    Modify.....Modify form level triggers delete_FRRGUSN, delete_frbgbil, delete_frvprst, 
               delete_frrgrpi, delete_locn, delete_text to replace the local call of the dynamic sql 
               to DBMS_SQL package with ordinary sql.  
               This is to remove all direct calls to this package as this is a recommendation from 
               Oracle and causes problems in some environments.
               
5.  Defect.....104781
    Signoff....Wei Zhang 09/15/2005
    Problem....In version 6.1 (form:  FRAGRNT 6.0) if one created a grant via fragrnt, it could be 
               deleted.  In 7.1 (form:  FRAGRNT 7.0) this is not possible. 
    Modify.....Add logic to let user click "remove record" from menu twice to delete a record.
               Add logic to the key-delrec trigger under FRBGRNT block to check if this grant is
               attached to a valid fund. If it is, the deletion of this grant is prohibited.              
               
6.  Defect.....88424  handerso 09/23/05
    Problem....When you double click on the agency field displays error LOV not available.                
    Fix........Assign FTVAGCY_LOV for frragpt.frragpt_agcy_code field.

AUDIT TRAIL END  </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3552
	/* <p>
/* </p>
		*/
		public void auditTrail7101()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_NLS_DATE_SUPPORT
	
	PROCEDURE AUDIT_TRAIL_NLS_DATE_SUPPORT IS
-- AUDIT TRAIL: NLS_DATE_SUPPORT 
-- 1. TGKinderman   11/11/2005
--    This object was passed through a conversion process relative to preparing
--    the object to support internationalization needs.  Basically, hard coded
--    date format masks of DD-MON-YYYY are converted to a G$_DATE function that
--    returns nls_date_format.  The release number of this object was NOT
--    modified as part of this effort.  This object may or may not have had 
--    conversion process code modifications.  However, this audit trail entry
--    does indicate that the object has been passed through the conversion.
-- AUDIT TRAIL END
-- 
BEGIN
  NULL;
END AUDIT_TRAIL_NLS_DATE_SUPPORT;

	*/
	//ID:3553
	/* <p>
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_2
	
	PROCEDURE AUDIT_TRAIL_7_2 IS
<multilinecomment> AUDIT TRAIL: 7.2
1. Signoff....Wei Zhang  24-APR-2006 (for 1-GOTP7)
   Update the form's version to 7.2, but no other form changes are made.  
   
AUDIT TRAIL END  </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3554
	/* <p>
/* </p>
		*/
		public void auditTrail72()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS
<multilinecomment> AUDIT TRAIL: 7.3
1. Defect.....1-5FMSM
   Signoff....Saurabh Agrawal  12-JUL-2006
   Problem....Options - Pass Through Agencies window does not have a drop down  list (list of values) for agencies.
   Fix........Placed a button on the form to invoke the list of values. 
              Repositioned the items on the canvas to make place for the new button. 
              When closed without making changes,it does not ask if the change has to be saved. But the message pops up
              when any change has been made.
              
              
2. Defect.....1-8KTK2
   Signoff....Saurabh Agrawal  25-JUL-2006
   Problem....Inconsistent behavior while validating organization, agency and CFDA code.
   Fix........Provide auto hint warning for inactive Agency and CFDA code. 
              Re-validate the Agency when a commit is performed.

3. Defect.....1-DL9B5
   Signoff....Saurabh Agrawal  01-AUG-2006
   Problem....The form is not populating the employee indicator on the personnel form for the first person added. 
              The workaround is to add it manually.  
              If mulitple personnel are added then after adding the second person do record back and the field will populate.
   Fix........Check whether the person is an employee and populate the field when the record is loaded.
4. Defect ......103619 
   Signoff......SivapriyaT   Sep 7, 2006
   Problem......On the first page of FRAGRNT, the ALTERNATE DESC field can be updated to record information on the grant
                for a specific date. When FRIGRST is viewed via the Status History link in the options bar, the newly 
                entered data is displayed twice. 
   Fix..........In the PRE-UPDATE trigger there are three checks that are performed. The first checks whether the
                alternate description is changed from null to not null. The second checks whether the altrenate 
                description is changed from a not null value to another not null value. And finally the third checks 
                whether the status date has changed. Each of the three checks inserts record into FRVGRST table 
                independently. Now all the three checks are combined into a single if statement and the insert is 
                performed only once. This corrects the duplicate entries made into the table.

 
AUDIT TRAIL END  </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3555
	/* <p>
/* </p>
		*/
		public void auditTrail73()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0
1. Enhancement to Grants Management Multi-Year Encumbrance          Lakshmi Anantharamaiah  05/31/2007
   Mod....An edit is added to the form to check if, after an initial record is created and saved,
          a change has been made to either the Project Start Date or the Project End Date.
          If a change has occurred, then a warning message will be displayed to the user.
          An Option is added to the FRAGRNT form that will allow the user to go to the
          Research Accounting Fund Maintenance (FRMFUND) form from FRAGRNT. The user may then make
          changes to the budget dates, if desired. When exiting FRMFUND, the user will be taken
          back to the FRAGRNT form, and the cursor will reside in the same field they were
          on when they left the form.
					The existing option to the Grant Inception to Date (FRIGITD) form is enhanced to populate
					the KEYBLOC_GRNT_CODE and KEYBLOC_COA_CODE on FRIGITD form with the value from the FRAGRNT form.
					
2. Defect......1-2934R1
   Signoff.....Niraj Ramanathan   19-Oct-2007
   Problem.....Migration of 7.3.0.1 defect to 8.0.
       
3. TGKinderman  10/31/2007
   In support of General7.5 TabSecurity modifications.
   Modify triggers FRBGRNT.FRBGRNT_AGENCY_PHONE_TYPE.KEY-LISTVAL,
                   FRBGRNT.FRBGRNT_AGENCY_TELE_SEQNO.KEY-LISTVAL,
                   FRRGRPI.FRRGRPI_PHONE_TYPE.KEY-LISTVAL and
                   FRRGRPI.FRRGRPI_TELE_SEQNO.KEY-LISTVAL
   to throw an error if the TELEPHONE_TAB is not available to user on the FOAIDEN form.  (1-2LHZ1C)

AUDIT TRAIL END 
</multilinecomment> 
BEGIN
 NULL; 
END;
	*/
	//ID:3556
	/* <p>
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/29/2007
   This form has been modified to increase the bio-demographics and/or the currency fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
2. Signoff.....Sivanath Peddakotla 11/02/2007
   Problem.... Agency window EDIT_SPRADDR trigger error.
   Fix....... Manual changes to 8.0. The address fields length was set to database length.
   AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:3557
	/* <p>
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3_0_1
	
	PROCEDURE AUDIT_TRAIL_7_3_0_1 IS


 <multilinecomment> AUDIT TRAIL: 7.3.0.1
1. Defect.....CMS-DFCT100241 27-FEB-2007
   Signoff....Niraj Ramanathan
   Problem....FRAGRNT has fields called CATEGORY,SUB-CATEGORY,STATUS and GRANT TYPE which have item properties of 
              a max length 30.In the table FRBGRNT, field lengths are defined as 1,4,2,2 respectively.  Causes an error 
              when trying to use any value more than the table value as defined in FTMSDAT.
   Fix........The max lenght of all the above mentioned fields were changed to match the max length in the table FRBGRNT.
   		        There might be cases where the input value which is coming from FOQSDLV is greater than the specified length.
   		        To trap such cases, "ON-ERROR" trigger is added and a message is given to tell the user that the value
   		        chosen is greater than the specified max length.
   		         
 </multilinecomment>
    
BEGIN
  NULL;
END;
	*/
	//ID:3558
	/* <p>
/* </p>
		*/
		public void auditTrail7301()
		{
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_ACCT_VAL_DESC
	
	PROCEDURE SELECT_ACCT_VAL_DESC IS

  CURSOR C_ORGN IS 
	SELECT  FTVORGN_TITLE 
    FROM  FTVORGN 
   WHERE  FTVORGN_NCHG_DATE > SYSDATE
     AND  FTVORGN_EFF_DATE <= SYSDATE
     AND  (FTVORGN_TERM_DATE > SYSDATE       OR  FTVORGN_TERM_DATE IS NULL)
     AND  FTVORGN_ORGN_CODE = :FRRGREC_ACCT_ELEMENT_VALUE
     AND  FTVORGN_COAS_CODE = :FRRGREC_COAS_CODE
     AND  NOT EXISTS
          (SELECT G.FRRGREC_ACCT_ELEMENT_VALUE 
           FROM FRRGREC G
           WHERE G.FRRGREC_ACCT_ELEMENT = 'O'
           AND   G.FRRGREC_ACCT_ELEMENT_VALUE = FTVORGN_ORGN_CODE
           AND   G.FRRGREC_GRNT_CODE <>:DISPLAY_FRBGRNT_CODE);
     
        
           
  CURSOR  C_ACTV IS    
  SELECT  FTVACTV_TITLE
    FROM  FTVACTV
   WHERE  FTVACTV_EFF_DATE <= SYSDATE
     AND  FTVACTV_NCHG_DATE > SYSDATE
     AND  (FTVACTV_TERM_DATE > SYSDATE      OR   FTVACTV_TERM_DATE IS NULL)
     AND  FTVACTV_COAS_CODE = :FRBGRNT_COAS_CODE
     AND  FTVACTV_ACTV_CODE = :FRRGREC_ACCT_ELEMENT_VALUE
     AND  NOT EXISTS
          (SELECT G.FRRGREC_ACCT_ELEMENT_VALUE 
           FROM FRRGREC G
           WHERE G.FRRGREC_ACCT_ELEMENT = 'A'
           AND   G.FRRGREC_ACCT_ELEMENT_VALUE = FTVACTV_ACTV_CODE
           AND   G.FRRGREC_GRNT_CODE <>:DISPLAY_FRBGRNT_CODE);
     
  CURSOR  C_PROG IS    
  SELECT  FTVPROG_TITLE
    FROM  FTVPROG
   WHERE  FTVPROG_EFF_DATE <= SYSDATE
     AND  FTVPROG_NCHG_DATE > SYSDATE  
     AND  (FTVPROG_TERM_DATE > SYSDATE     OR   FTVPROG_TERM_DATE IS NULL) 
     AND  FTVPROG_COAS_CODE = :FRRGREC_COAS_CODE
     AND  FTVPROG_PROG_CODE = :FRRGREC_ACCT_ELEMENT_VALUE
     AND  NOT EXISTS
          (SELECT G.FRRGREC_ACCT_ELEMENT_VALUE 
           FROM FRRGREC G
           WHERE G.FRRGREC_ACCT_ELEMENT = 'P'
           AND   G.FRRGREC_ACCT_ELEMENT_VALUE = FTVPROG_PROG_CODE
           AND   G.FRRGREC_GRNT_CODE <>:DISPLAY_FRBGRNT_CODE);                
  
  CURSOR  C_LOCN IS      
	SELECT  FTVLOCN_TITLE
	 FROM   FTVLOCN
	 WHERE  FTVLOCN_EFF_DATE <= SYSDATE
	   AND  FTVLOCN_NCHG_DATE > SYSDATE
	   AND  (FTVLOCN_TERM_DATE > SYSDATE    OR   FTVLOCN_TERM_DATE IS NULL)            
	   AND  FTVLOCN_COAS_CODE = :FRRGREC_COAS_CODE
	   AND  FTVLOCN_LOCN_CODE = :FRRGREC_ACCT_ELEMENT_VALUE
	   AND  NOT EXISTS
          (SELECT G.FRRGREC_ACCT_ELEMENT_VALUE 
           FROM FRRGREC G
           WHERE G.FRRGREC_ACCT_ELEMENT = 'L'
           AND   G.FRRGREC_ACCT_ELEMENT_VALUE = FTVLOCN_LOCN_CODE
           AND   G.FRRGREC_GRNT_CODE <>:DISPLAY_FRBGRNT_CODE);           
	            
  CURSOR  C_FUND IS    
	SELECT  FTVFUND_TITLE,NVL(FTVFUND_EFF_CERT_ALLOC_IND,'N')
	   FROM FTVFUND
	  WHERE	FTVFUND_EFF_DATE <= SYSDATE
	    AND FTVFUND_NCHG_DATE > SYSDATE 
	   AND  (FTVFUND_TERM_DATE > SYSDATE    OR   FTVFUND_TERM_DATE IS NULL)                 
	    AND  FTVFUND_COAS_CODE = :FRRGREC_COAS_CODE
	    AND  FTVFUND_FUND_CODE = :FRRGREC_ACCT_ELEMENT_VALUE
	    AND NVL(FTVFUND_GRNT_CODE,'@') in (:DISPLAY_FRBGRNT_CODE,'@')
	    AND  NOT EXISTS
          (SELECT G.FRRGREC_ACCT_ELEMENT_VALUE 
           FROM FRRGREC G
           WHERE G.FRRGREC_ACCT_ELEMENT = 'F'
           AND   G.FRRGREC_ACCT_ELEMENT_VALUE = FTVFUND_FUND_CODE
           AND   G.FRRGREC_GRNT_CODE <>:DISPLAY_FRBGRNT_CODE);              
     
  LV_EFF_CERT_ALLOC_IND VARCHAR2(1);  
     
BEGIN
	 :FRRGREC_ACCT_ELEMENT_VALUE_DES := NULL;
--	 
	 IF :FRRGREC_ACCT_ELEMENT = 'O' THEN 
		 OPEN C_ORGN;
		 FETCH C_ORGN INTO :FRRGREC_ACCT_ELEMENT_VALUE_DES;
	   G$_CHECK_VALUE (C_ORGN%NOTFOUND,G$_NLS.Get('FRAGRNT-0249', 'FORM','*ERROR* Organization is not valid; press List for valid Organizations.') , TRUE);
	   CLOSE C_ORGN;
   END IF;
--
   IF :FRRGREC_ACCT_ELEMENT = 'F' THEN 
	   OPEN C_FUND;
		 FETCH C_FUND INTO :FRRGREC_ACCT_ELEMENT_VALUE_DES,LV_EFF_CERT_ALLOC_IND;
	   G$_CHECK_VALUE (C_FUND%NOTFOUND,G$_NLS.Get('FRAGRNT-0250', 'FORM','*ERROR* Fund is not valid; press List for valid Funds.') , TRUE);
	   CLOSE C_FUND;
	   SET_ALLOC_PROPERTIES('N','N');
	    IF :FRRGREC_ID IS NULL THEN
	       IF  LV_EFF_CERT_ALLOC_IND = 'Y' THEN	    
	    	 	  :FRRGREC_REPORT_SECTION := 'A';
	    	 	  :FRRGREC_ECCG_CODE  := NULL;
	    	 	  :FRRGREC_CHARGE_TYPE := NULL;	    	 	  
	    	 	   SET_ALLOC_PROPERTIES('A','Y');
	       ELSIF :FRRGREC_REPORT_SECTION = 'A' THEN
	       	  SET_ALLOC_PROPERTIES('A','N');
	       END IF;
	    ELSE
	       	IF  LV_EFF_CERT_ALLOC_IND = 'Y' THEN
	       		  SET_ALLOC_PROPERTIES('A','Y');
	       	ELSIF	:FRRGREC_REPORT_SECTION = 'A' THEN
	       		  SET_ALLOC_PROPERTIES('A','N');	       
	        END IF;		  
	    END IF;	 	   		 
   END IF;
--
   IF :FRRGREC_ACCT_ELEMENT = 'L' THEN  
	   OPEN C_LOCN;
		 FETCH C_LOCN INTO :FRRGREC_ACCT_ELEMENT_VALUE_DES;
	   G$_CHECK_VALUE (C_LOCN%NOTFOUND,G$_NLS.Get('FRAGRNT-0251', 'FORM','*ERROR* Location is not valid; press List for valid Locations.') , TRUE);
	   CLOSE C_LOCN;
   END IF;
--
   IF :FRRGREC_ACCT_ELEMENT = 'A' THEN 
	   OPEN C_ACTV;
		 FETCH C_ACTV INTO :FRRGREC_ACCT_ELEMENT_VALUE_DES;
	   G$_CHECK_VALUE (C_ACTV%NOTFOUND,G$_NLS.Get('FRAGRNT-0252', 'FORM','*ERROR* Activity is not valid; press List for valid Activities.') , TRUE);
	   CLOSE C_ACTV;
   END IF;
-- 
	 IF :FRRGREC_ACCT_ELEMENT = 'P' THEN 
		 OPEN C_PROG;
		 FETCH C_PROG INTO :FRRGREC_ACCT_ELEMENT_VALUE_DES;
	   G$_CHECK_VALUE (C_PROG%NOTFOUND,G$_NLS.Get('FRAGRNT-0253', 'FORM','*ERROR* Program is not valid; press List for valid Programs.') , TRUE);
	   CLOSE C_PROG;
	 END IF;   
--
   IF :FRRGREC_ACCT_ELEMENT <> 'F' THEN
	   IF :FRRGREC_REPORT_SECTION = 'A' THEN
		    SET_ALLOC_PROPERTIES('A','N');	   
		 ELSE
		    SET_ALLOC_PROPERTIES('N','N');
		 END IF;
	 END IF;
  	
END;

	*/
	//ID:3559
	/* <p>
/* </p>
		*/
		public void selectAcctValDesc(FrrgrecAdapter frrgrecElement, FrbgrntAdapter frbgrntElement)
		{
			int rowCount = 0;
			String sqlcOrgn = "SELECT FTVORGN_TITLE " +
								" FROM FTVORGN " +
								" WHERE FTVORGN_NCHG_DATE > SYSDATE AND FTVORGN_EFF_DATE <= SYSDATE AND (FTVORGN_TERM_DATE > SYSDATE OR FTVORGN_TERM_DATE IS NULL) AND FTVORGN_ORGN_CODE = :FRRGREC_ACCT_ELEMENT_VALUE AND FTVORGN_COAS_CODE = :FRRGREC_COAS_CODE AND  NOT EXISTS(SELECT G.FRRGREC_ACCT_ELEMENT_VALUE " +
								" FROM FRRGREC G " +
								" WHERE G.FRRGREC_ACCT_ELEMENT = 'O' AND G.FRRGREC_ACCT_ELEMENT_VALUE = FTVORGN_ORGN_CODE AND G.FRRGREC_GRNT_CODE <> :DISPLAY_FRBGRNT_CODE ) ";
			DataCursor cOrgn = new DataCursor(sqlcOrgn);
			String sqlcActv = "SELECT FTVACTV_TITLE " +
								" FROM FTVACTV " +
								" WHERE FTVACTV_EFF_DATE <= SYSDATE AND FTVACTV_NCHG_DATE > SYSDATE AND (FTVACTV_TERM_DATE > SYSDATE OR FTVACTV_TERM_DATE IS NULL) AND FTVACTV_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVACTV_ACTV_CODE = :FRRGREC_ACCT_ELEMENT_VALUE AND  NOT EXISTS(SELECT G.FRRGREC_ACCT_ELEMENT_VALUE " +
								" FROM FRRGREC G " +
								" WHERE G.FRRGREC_ACCT_ELEMENT = 'A' AND G.FRRGREC_ACCT_ELEMENT_VALUE = FTVACTV_ACTV_CODE AND G.FRRGREC_GRNT_CODE <> :DISPLAY_FRBGRNT_CODE ) ";
			DataCursor cActv = new DataCursor(sqlcActv);
			String sqlcProg = "SELECT FTVPROG_TITLE " +
								" FROM FTVPROG " +
								" WHERE FTVPROG_EFF_DATE <= SYSDATE AND FTVPROG_NCHG_DATE > SYSDATE AND (FTVPROG_TERM_DATE > SYSDATE OR FTVPROG_TERM_DATE IS NULL) AND FTVPROG_COAS_CODE = :FRRGREC_COAS_CODE AND FTVPROG_PROG_CODE = :FRRGREC_ACCT_ELEMENT_VALUE AND  NOT EXISTS(SELECT G.FRRGREC_ACCT_ELEMENT_VALUE " +
								" FROM FRRGREC G " +
								" WHERE G.FRRGREC_ACCT_ELEMENT = 'P' AND G.FRRGREC_ACCT_ELEMENT_VALUE = FTVPROG_PROG_CODE AND G.FRRGREC_GRNT_CODE <> :DISPLAY_FRBGRNT_CODE ) ";
			DataCursor cProg = new DataCursor(sqlcProg);
			String sqlcLocn = "SELECT FTVLOCN_TITLE " +
								" FROM FTVLOCN " +
								" WHERE FTVLOCN_EFF_DATE <= SYSDATE AND FTVLOCN_NCHG_DATE > SYSDATE AND (FTVLOCN_TERM_DATE > SYSDATE OR FTVLOCN_TERM_DATE IS NULL) AND FTVLOCN_COAS_CODE = :FRRGREC_COAS_CODE AND FTVLOCN_LOCN_CODE = :FRRGREC_ACCT_ELEMENT_VALUE AND  NOT EXISTS(SELECT G.FRRGREC_ACCT_ELEMENT_VALUE " +
								" FROM FRRGREC G " +
								" WHERE G.FRRGREC_ACCT_ELEMENT = 'L' AND G.FRRGREC_ACCT_ELEMENT_VALUE = FTVLOCN_LOCN_CODE AND G.FRRGREC_GRNT_CODE <> :DISPLAY_FRBGRNT_CODE ) ";
			DataCursor cLocn = new DataCursor(sqlcLocn);
			String sqlcFund = "SELECT FTVFUND_TITLE, NVL(FTVFUND_EFF_CERT_ALLOC_IND, 'N') " +
								" FROM FTVFUND " +
								" WHERE FTVFUND_EFF_DATE <= SYSDATE AND FTVFUND_NCHG_DATE > SYSDATE AND (FTVFUND_TERM_DATE > SYSDATE OR FTVFUND_TERM_DATE IS NULL) AND FTVFUND_COAS_CODE = :FRRGREC_COAS_CODE AND FTVFUND_FUND_CODE = :FRRGREC_ACCT_ELEMENT_VALUE AND (NVL(FTVFUND_GRNT_CODE, '@')) IN (:DISPLAY_FRBGRNT_CODE, '@') AND  NOT EXISTS(SELECT G.FRRGREC_ACCT_ELEMENT_VALUE " +
								" FROM FRRGREC G " +
								" WHERE G.FRRGREC_ACCT_ELEMENT = 'F' AND G.FRRGREC_ACCT_ELEMENT_VALUE = FTVFUND_FUND_CODE AND G.FRRGREC_GRNT_CODE <> :DISPLAY_FRBGRNT_CODE ) ";
			DataCursor cFund = new DataCursor(sqlcFund);
			try {
				NString lvEffCertAllocInd= NString.getNull();
				frrgrecElement.setFrrgrecAcctElementValueDes(toStr(null));
				// 	 
				if ( frrgrecElement.getFrrgrecAcctElement().equals("O") )
				{
					//Setting query parameters
					cOrgn.addParameter("FRRGREC_ACCT_ELEMENT_VALUE", frrgrecElement.getFrrgrecAcctElementValue());
					cOrgn.addParameter("FRRGREC_COAS_CODE", frrgrecElement.getFrrgrecCoasCode());
					cOrgn.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
					cOrgn.open();
					ResultSet cOrgnResults = cOrgn.fetchInto();
					if ( cOrgnResults != null ) {
						frrgrecElement.setFrrgrecAcctElementValueDes(cOrgnResults.getStr(0));
					}
					getTask().getGoqrpls().gCheckValue(toBool(cOrgn.notFound()), GNls.Fget(toStr("FRAGRNT-0249"), toStr("FORM"), toStr("*ERROR* Organization is not valid; press List for valid Organizations.")), toBool(NBool.True));
					
				}
				// 
				if ( frrgrecElement.getFrrgrecAcctElement().equals("F") )
				{
					//Setting query parameters
					cFund.addParameter("FRRGREC_COAS_CODE", frrgrecElement.getFrrgrecCoasCode());
					cFund.addParameter("FRRGREC_ACCT_ELEMENT_VALUE", frrgrecElement.getFrrgrecAcctElementValue());
					cFund.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
					cFund.open();
					ResultSet cFundResults = cFund.fetchInto();
					if ( cFundResults != null ) {
						frrgrecElement.setFrrgrecAcctElementValueDes(cFundResults.getStr(0));
						lvEffCertAllocInd = cFundResults.getStr(1);
					}
					getTask().getGoqrpls().gCheckValue(toBool(cFund.notFound()), GNls.Fget(toStr("FRAGRNT-0250"), toStr("FORM"), toStr("*ERROR* Fund is not valid; press List for valid Funds.")), toBool(NBool.True));
					
					setAllocProperties(toStr("N"), toStr("N"));
					if ( frrgrecElement.getFrrgrecId().isNull() )
					{
						if ( lvEffCertAllocInd.equals("Y") )
						{
							frrgrecElement.setFrrgrecReportSection(toStr("A"));
							frrgrecElement.setFrrgrecEccgCode(toStr(null));
							frrgrecElement.setFrrgrecChargeType(toStr(null));
							setAllocProperties(toStr("A"), toStr("Y"));
						}
						else if ( frrgrecElement.getFrrgrecReportSection().equals("A") ) {
							setAllocProperties(toStr("A"), toStr("N"));
						}
					}
					else {
						if ( lvEffCertAllocInd.equals("Y") )
						{
							setAllocProperties(toStr("A"), toStr("Y"));
						}
						else if ( frrgrecElement.getFrrgrecReportSection().equals("A") ) {
							setAllocProperties(toStr("A"), toStr("N"));
						}
					}
				}
				// 
				if ( frrgrecElement.getFrrgrecAcctElement().equals("L") )
				{
					//Setting query parameters
					cLocn.addParameter("FRRGREC_COAS_CODE", frrgrecElement.getFrrgrecCoasCode());
					cLocn.addParameter("FRRGREC_ACCT_ELEMENT_VALUE", frrgrecElement.getFrrgrecAcctElementValue());
					cLocn.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
					cLocn.open();
					ResultSet cLocnResults = cLocn.fetchInto();
					if ( cLocnResults != null ) {
						frrgrecElement.setFrrgrecAcctElementValueDes(cLocnResults.getStr(0));
					}
					getTask().getGoqrpls().gCheckValue(toBool(cLocn.notFound()), GNls.Fget(toStr("FRAGRNT-0251"), toStr("FORM"), toStr("*ERROR* Location is not valid; press List for valid Locations.")), toBool(NBool.True));
					
				}
				// 
				if ( frrgrecElement.getFrrgrecAcctElement().equals("A") )
				{
					//Setting query parameters
					cActv.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
					cActv.addParameter("FRRGREC_ACCT_ELEMENT_VALUE", frrgrecElement.getFrrgrecAcctElementValue());
					cActv.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
					cActv.open();
					ResultSet cActvResults = cActv.fetchInto();
					if ( cActvResults != null ) {
						frrgrecElement.setFrrgrecAcctElementValueDes(cActvResults.getStr(0));
					}
					getTask().getGoqrpls().gCheckValue(toBool(cActv.notFound()), GNls.Fget(toStr("FRAGRNT-0252"), toStr("FORM"), toStr("*ERROR* Activity is not valid; press List for valid Activities.")), toBool(NBool.True));
					
				}
				//  
				if ( frrgrecElement.getFrrgrecAcctElement().equals("P") )
				{
					//Setting query parameters
					cProg.addParameter("FRRGREC_COAS_CODE", frrgrecElement.getFrrgrecCoasCode());
					cProg.addParameter("FRRGREC_ACCT_ELEMENT_VALUE", frrgrecElement.getFrrgrecAcctElementValue());
					cProg.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
					cProg.open();
					ResultSet cProgResults = cProg.fetchInto();
					if ( cProgResults != null ) {
						frrgrecElement.setFrrgrecAcctElementValueDes(cProgResults.getStr(0));
					}
					getTask().getGoqrpls().gCheckValue(toBool(cProg.notFound()), GNls.Fget(toStr("FRAGRNT-0253"), toStr("FORM"), toStr("*ERROR* Program is not valid; press List for valid Programs.")), toBool(NBool.True));
					
				}
				// 
				if ( frrgrecElement.getFrrgrecAcctElement().notEquals("F") )
				{
					if ( frrgrecElement.getFrrgrecReportSection().equals("A") )
					{
						setAllocProperties(toStr("A"), toStr("N"));
					}
					else {
						setAllocProperties(toStr("N"), toStr("N"));
					}
				}
			} finally {
				cOrgn.close();
				cActv.close();
				cProg.close();
				cLocn.close();
				cFund.close();
			}
		}

	
	/* Original PL/SQL code for Prog Unit POPULATE_NTVECCG_RG
	
	PROCEDURE POPULATE_NTVECCG_RG IS
   RG_LOGIC VARCHAR2(1500) := 'SELECT NTVECCG_CODE,NTVECCG_DESC,  
                               to_char(NTVECCG_ACTIVITY_DATE,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ACTIVITY_DATE
                               FROM NTVECCG ORDER BY 1'; 
   ERROR_NUMBER NUMBER;
BEGIN
   IF NAME_IN('GLOBAL.HRESYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('FRAGRNT-0254', 'FORM','*WARNING* BANNER HR is not installed.') );
      RETURN;
   END IF;   
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('NTVECCG_RG',RG_LOGIC);	 	
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('FRAGRNT-0255', 'FORM','*WARNING* No records found.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
END;



	*/
	//ID:3560
	/* <p>
/* </p>
		*/
		public void populateNtveccgRg()
		{
			NString rgLogic = toStr("SELECT NTVECCG_CODE,NTVECCG_DESC,  \n                               to_char(NTVECCG_ACTIVITY_DATE,'").append(GDate.getNlsDateFormat()).append("') ACTIVITY_DATE\n                               FROM NTVECCG ORDER BY 1");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.HRESYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("FRAGRNT-0254"), toStr("FORM"), toStr("*WARNING* BANNER HR is not installed.")));
				return ;
			}
			errorNumber = populateGroupWithQuery("NTVECCG_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				warningMessage(GNls.Fget(toStr("FRAGRNT-0255"), toStr("FORM"), toStr("*WARNING* No records found.")));
				throw new ApplicationException();
				//return ;
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment>
AUDIT TRAIL: 8.1
1.Khanjan Shroff                         26-MAR-2008
  Grants Management Enhancement Effort Certification and Enhanced Labor Redistribution
   A new checkbox field "Requires Effort Certification" (FRBGRNT_EFF_CERT_REQUIRED_IND) 
   is added. It is located on the HEADER_INFORMATION (Main) tab page to indicate that 
   all funds associted with this grant require effort certification.
   A new tab page EFFORT_REPORTING is created.The tab will allow the user to determine 
   which Accounting element & its value to be used on each Grant.
   Five new lovs are created and assigned to value field (FRRGREC_ACCT_ELEMENT_VALUE).
   Based on user selected value from the account element source list field, the related 
   lov will be populated.
2. HAnderson 10/07/2008
   Defect....Migrate 8.0.0.1 defect #1-23R5O5
   Problem...Query only rights will kick you out of the form at the Personnel tab.
   Fix.......Modify when-window-closed, when-new-block-instance, when_new_block_instance_trg,
             and force_commit triggers to skip commit if the user has query only role. 
AUDIT TRAIL END
</multilinecomment>

BEGIN
  NULL;
END;

	*/
	//ID:3561
	/* <p>
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_ACCT_ELE_VAL
	
	FUNCTION CHECK_ACCT_ELE_VAL RETURN VARCHAR2 IS
BEGIN
     DECLARE
     CURSOR FRRGREC_DATA IS 
     SELECT FRRGREC_ID 
     FROM   FRRGREC
     WHERE  FRRGREC_GRNT_CODE = :DISPLAY_FRBGRNT_CODE;
     lv_id  NUMBER;
     lv_DATA VARCHAR2(1) := 'N';
   BEGIN
			 IF :FRRGREC_ACCT_ELEMENT_VALUE IS NULL THEN
			 	  OPEN FRRGREC_DATA;
			 	  FETCH FRRGREC_DATA INTO lv_id;
			 	  IF FRRGREC_DATA%FOUND THEN
			 	  	 lv_DATA := 'Y';
			 	  END IF;
			 	  CLOSE FRRGREC_DATA;
			 ELSE
			       lv_DATA := 'Y';	  	 
			 END IF;			 
	
			 RETURN lv_DATA;
   END;	 
END;
	*/
	//ID:3562
	/* <p>
/* </p>
		*/
		public NString checkAcctEleVal(FrrgrecAdapter frrgrecElement)
		{
			int rowCount = 0;
			{
				String sqlfrrgrecData = "SELECT FRRGREC_ID " +
	" FROM FRRGREC " +
	" WHERE FRRGREC_GRNT_CODE = :DISPLAY_FRBGRNT_CODE ";
				DataCursor frrgrecData = new DataCursor(sqlfrrgrecData);
				NNumber lvId= NNumber.getNull();
				NString lvData = toStr("N");
				try {
					if ( frrgrecElement.getFrrgrecAcctElementValue().isNull() )
					{
						//Setting query parameters
						frrgrecData.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
						frrgrecData.open();
						ResultSet frrgrecDataResults = frrgrecData.fetchInto();
						if ( frrgrecDataResults != null ) {
							lvId = frrgrecDataResults.getNumber(0);
						}
						if ( frrgrecData.found() )
						{
							lvData = toStr("Y");
						}

					}
					else {
						lvData = toStr("Y");
					}
				} finally {
					frrgrecData.close();
				}
				return lvData;
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1_1
	
	PROCEDURE AUDIT_TRAIL_8_1_1 IS
<multilinecomment> AUDIT TRAIL: 8.1.1
1. Migration of changes from 7.4.1 to 8.1.1
   Signoff....HAnderso 16-OCT-2008
   Mod........For Federal Finance Report(FFR) project, add a new field FRBGRNT_RECP_SHARE_TOTAL
              to the "Main" tab and a new field FRRGRPI_EMAIL to the "Personnel" tab.
              Modify the KEY-LISTVAL trigger under FRRGRPI_PHONE_TYPE for navigating to the new
              field FRRGRPI_EMAIL.
   		        
 AUDIT TRAIL ENDS  		         
 </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3563
	/* <p>
/* </p>
		*/
		public void auditTrail811()
		{
		}

	
	/* Original PL/SQL code for Prog Unit SET_ALLOC_PROPERTIES
	
	PROCEDURE SET_ALLOC_PROPERTIES(IsAllocable VARCHAR2,IsFundAllocable VARCHAR2) IS
BEGIN
   IF IsAllocable = 'A' THEN
   	  IF IsFundAllocable = 'Y' Then
	   	   SET_ITEM_INSTANCE_PROPERTY('FRRGREC_REPORT_SECTION',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_REPORT_SECTION',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_REPORT_SECTION',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
			END IF;	   	
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_ECCG_CODE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_ECCG_CODE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_ECCG_CODE',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
				 
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_CHARGE_TYPE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_FALSE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_CHARGE_TYPE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_FALSE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_CHARGE_TYPE',CURRENT_RECORD,NAVIGABLE,PROPERTY_FALSE);
				 
	   ELSE
	   	   SET_ITEM_INSTANCE_PROPERTY('FRRGREC_REPORT_SECTION',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_REPORT_SECTION',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_REPORT_SECTION',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
				   	
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_ECCG_CODE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_ECCG_CODE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_ECCG_CODE',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
				 
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_CHARGE_TYPE',CURRENT_RECORD,INSERT_ALLOWED,PROPERTY_TRUE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_CHARGE_TYPE',CURRENT_RECORD,UPDATE_ALLOWED,PROPERTY_TRUE);
				 SET_ITEM_INSTANCE_PROPERTY('FRRGREC_CHARGE_TYPE',CURRENT_RECORD,NAVIGABLE,PROPERTY_TRUE);
		 END IF;	
END;
	*/
	//ID:3564
	/* <p>
/* </p>
		* @param isallocable
		* @param isfundallocable
		*/
		public void setAllocProperties(NString isallocable, NString isfundallocable)
		{
			if ( isallocable.equals("A") )
			{
				if ( isfundallocable.equals("Y") )
				{
					setItemInsertAllowed("FRRGREC_REPORT_SECTION", ItemServices.CURRENT_RECORD, false);
					setItemUpdateAllowed("FRRGREC_REPORT_SECTION", ItemServices.CURRENT_RECORD, false);
					setItemEnabled("FRRGREC_REPORT_SECTION", ItemServices.CURRENT_RECORD, false);
				}
				setItemInsertAllowed("FRRGREC_ECCG_CODE", ItemServices.CURRENT_RECORD, false);
				setItemUpdateAllowed("FRRGREC_ECCG_CODE", ItemServices.CURRENT_RECORD, false);
				setItemEnabled("FRRGREC_ECCG_CODE", ItemServices.CURRENT_RECORD, false);
				setItemInsertAllowed("FRRGREC_CHARGE_TYPE", ItemServices.CURRENT_RECORD, false);
				setItemUpdateAllowed("FRRGREC_CHARGE_TYPE", ItemServices.CURRENT_RECORD, false);
				setItemEnabled("FRRGREC_CHARGE_TYPE", ItemServices.CURRENT_RECORD, false);
			}
			else {
				setItemInsertAllowed("FRRGREC_REPORT_SECTION", ItemServices.CURRENT_RECORD, true);
				setItemUpdateAllowed("FRRGREC_REPORT_SECTION", ItemServices.CURRENT_RECORD, true);
				setItemEnabled("FRRGREC_REPORT_SECTION", ItemServices.CURRENT_RECORD, true);
				setItemInsertAllowed("FRRGREC_ECCG_CODE", ItemServices.CURRENT_RECORD, true);
				setItemUpdateAllowed("FRRGREC_ECCG_CODE", ItemServices.CURRENT_RECORD, true);
				setItemEnabled("FRRGREC_ECCG_CODE", ItemServices.CURRENT_RECORD, true);
				setItemInsertAllowed("FRRGREC_CHARGE_TYPE", ItemServices.CURRENT_RECORD, true);
				setItemUpdateAllowed("FRRGREC_CHARGE_TYPE", ItemServices.CURRENT_RECORD, true);
				setItemEnabled("FRRGREC_CHARGE_TYPE", ItemServices.CURRENT_RECORD, true);
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3
	
	PROCEDURE AUDIT_TRAIL_8_3 IS
<multilinecomment>
AUDIT TRAIL: 8.3
1.Khanjans Shroff                                     27-JAN-2009
  Grants Management Enhancement Uncommitted Cost Share Enhancement
   A new value "Allocable" is added to the list item FRRGREC_REPORT_SECTION. 
   A new procedure SET_ALLOC_PROPERTIES is created which will enable/disable 
   items based on the parameter passed. 
   The SELECT_ACCT_VAL_DESC procedure has been changed and it will call the 
   SET_ALLOC_PROPERTIES procedure.
   The POST-RECORD of the frrgrec form is changed so that it will allow the 
   null value for the charge type field in case of report section has value 
   Allocable. 
   KEY-LISTVAL trigger of the FRRGREC_ECCG_CODE field is changed 
   so that the list will not be displayed in case of report section is 
   Allocable.  
   A new function F_GET_ERROR has been created to incorporate rekey changes.
   
 2. Defect......	
	Signoff....Ravikumarb Beli 03-APR-2009
	Problem....It is allowing to add an inactive address type and sequesnce number 
	           on the agency tab of fragrnt and save the record and also an invalid 
	           address type and sequence can be entered and saved on the Personnel tab.
	Fix...Personnel Tab: 
		      Modified the post-change trigger under both FRRGRPI_ADDR_TYPE and 
		      FRRGRPI_ADDR_SEQNO in FRRGRPI block, to validate address type and 
		      sequesnce number on personnel tab when editing or adding address type 
					and sequesnce number on the agency tab of FRAGRNT form. Changed error 
					message "Address does not currently exist on address table (SPRADDR)" 
					to "The Address Type and Sequence combination is Invalid or Inactive" 
		      in post-change under FRRGRPI.FRRGRPI_ADDR_TYPE and FRRGRPI.FRRGRPI_ADDR_SEQNO
	      Grant Agency Tab: 	
					Modified post-change trigger under FRBGRNT_AGENCY_ADDR_CODE to retrieve 
					active - 'A' agency address and sequence number on Grant agency tab. And 
					also modified EDIT_APRADDR trigger to retrive Active - 'A' address type 
					and sequence number from SPRADDR table and also modified the Error 
					Msg:"Address does not exist" changed to "The Address Type and Sequence 
					combination is Invalid or Inactive" in EDIT_SPRADDR trigger.  

3. Lan Nguyen 04/06/2009
   RPE# 1-4US9HN - Expose I8N Fields.
   Items frbgrnt.house_number, frbgrnt.address_line_4, 
   and frbgrnt.ctry_code_phone are added; triggers edit_spraddr, clr_addr,
   frbgrnt.post-query, frbgrnt.frbgrnt_agency_phone_type.key-listval are
   modified.
4. Defect......1-3V2XSE (reworked after testing)	
	 Signoff....Ravikumarb Beli 08-APR-2009   
	 Problem....stopping on Address type, without even considering the unique combination 
	 						of address type with  other sequence number on both personal tab and grant agency tab.
	 Fix........Modified POST-CHANGE trigger of FRRGRPI_ADDR_SEQNO and FRRGRPI_ADDR_TYPE in FRRGRPI block 
	 						to fetch all addresses other than SPRADDR_STATUS_IND is 'I'(inactive) and modified 
	 						POST-CHANGE trigger of FRBGRNT_AGENCY_ADDR_CODE in FRBGRNT block to fetch all addresses 
	 						other than SPRADDR_STATUS_IND is 'I' (inactive) and also modification done in EDIT_APRADDR 
	 						trigger is changed SPRADDR_STATUS_IND = 'A' to NVL(SPRADDR_STATUS_IND,'A') != 'I' to fetch 
	 						all addresses other than SPRADDR_STATUS_IND is 'I' (inactive)
5. Defect......1-49V9AF
	 Signoff....Khanjans Shroff 13-MAY-2009   
	 Problem....G$_NLS usage is missing.
	 Fix........WHEN-BUTTON-PRESSED trigger of the item FRRGREC_ACCT_ELEMENT_VALUE_LBT is changed to
	            use G$_NLS.
  
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:3565
	/* <p>
/* </p>
		*/
		public void auditTrail83()
		{
		}

	
	/* Original PL/SQL code for Prog Unit F_GET_ERROR
	
	FUNCTION F_GET_ERROR(p_errorname VARCHAR2) RETURN VARCHAR2 IS
TEMP VARCHAR2(4000);
BEGIN
  IF p_errorname = 'USER_NOT_AUTH' THEN
  	 TEMP := G$_NLS.Get('FRAGRNT-0256', 'FORM','User is not authorized to query or post with the entered Organization.');  	 
  END IF;
  RETURN TEMP;
END;


	*/
	//ID:3566
	/* <p>
/* </p>
		* @param pErrorname
		*/
		public NString fGetError(NString pErrorname)
		{
			NString temp= NString.getNull();
			if ( pErrorname.equals("USER_NOT_AUTH") )
			{
				temp = GNls.Fget(toStr("FRAGRNT-0256"), toStr("FORM"), toStr("User is not authorized to query or post with the entered Organization."));
			}
			return temp;
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : FRAGRNT
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Sep 05 09:39:18 2013
-- MSGSIGN : #8f3ada3308777a2e
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:3567
	/* <p>
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment> 
AUDIT TRAIL: 8.4

1. Defect......1-1A1JGI
	 Signoff.....Khanjan Shroff 07-JUL-2009   
	 Problem:....1 or 2 letter abbreviations are not translatable and probably used in logic.	             
   Fix:........The DISPLAY_TEXT_IND field in the key block is changed to check box instead 
   						 of text item. The value of the field is set to 'Y' if checked and 'N' if unchecked.
   						 Also, the prompt is changed from Text Exists to Grant Text. A call has been made to 
   						 the trigger CHECK_TEXT in the WHEN-VALIDATE-ITEM trigger of the field DISPLAY_FRBGRNT_CODE 
   						 which will either check or uncheck the DISPLAY_TEXT_IND checkbox. The FRRGRPI_EMPLOYEE_IND
   						 field in the FRRGRPI block is changed to list item instead of text item. 

2. Defect#.....1-3A1HJ3
   Signoff.....Pradeep Kumar Mallapuram   11-Aug-2009
   Problem.....When FRAGRNT is called from inquiry forms like FRIORGH, FRIPSTP, FRIPSTG 
               Messages  FRM-40200: Form running in query-only appear several times and 
               need to be click away each time before user can continue. 
   Fix:........In many triggers if the items values are not entered / available in DB defaulting is done.
               Since form in called in query mode only values from DB needs to be shown and no need to 
               default any values in data base items. 
               New item CALLED_FROM_INQUIRY has been added to in FORM_HEADER block and assigned with 
               value 1 if the form is called in query mode. Identified that this form is called in
               query-only mode from below listed forms:
               FRACOLL,FRIASTG,FRIASTP,FRIKGNT,
               FRIKPRO,FRIORGH,FRIPSTG,FRIPSTP,
               FTMBECL and FTMFUND
               Based on CALLED_FROM_INQUIRY value Database item defaulting code has been by-passed in the 
               below listed triggers and only the values  retrieved from DB has been shown 
               in the below listed triggers. 
               Now the error is not shown when form in called from inquiry screens.   
               Triggers Modified :
               POST-CHANGE on item FRBGRNT_LONG_TITLE   
               FRBGRNT_AGENCY_CODE on item  WHEN-VALIDATE-ITEM
               FRBGRNT_PI_ID_CODE on item  WHEN-VALIDATE-ITEM
               FRBGRNT_AGENCY_ADDR_CODE on item  POST-TEXT-ITEM
               FRBGRNT_AGENCY_ADDR_CODE on item POST-CHANGE
               FRBGRNT_AGENCY_ADDR_SEQ_NUM on item POST-TEXT-ITEM
               WHEN-NEW-BLOCK-INSTANCE on block FRBGBIL
               FRBGBIL_PMSC_CODE on item POST-CHANGE
               FRBGBIL_ADDR_TYPE on item POST-TEXT-ITEM
               FRRGRPI_ID on item WHEN-VALIDATE-ITEM                            

3. Defect#.....1-2HW7BA
   Signoff.....Gopinath Thulasidoss   19-Aug-2009
   Problem.....I created a new proposal yesterday with a valid org code.  After completing the proposal, 
               I terminated the org code (with term date = yesterday's date).  After terminating the org, 
               I was able to view the proposal and make changes (yesterday).  No invalid org message was 
               displayed. Today, I am able to view the org, but additional windows on the grant do not 
               display information.
   Fix:........Modified triggers EDIT_ORGN_CODE, EDIT_ORGN_CODE_FRRGRPI. Changed the cursor PTI_CURSOR, 
               instead of sysdate comparison in the where clause, included 
               NVL(:FRBGRNT_PROJECT_START_DATE,SYSDATE).
               
4. Defect#.....1-1BCKEW
   Signoff.....Pradeep Kumar Mallapuram    21-Aug-2009
   Problem.....Alignment issues reported during test because unused (hidden)
               GUI text has not been removed
   Fix.........Remove unwanted/hidden GUI text items which are available under FRAGRNT_1_CANVAS.

5. Defect#.....1-1BCKGS
   Signoff.....Pradeep Kumar Mallapuram    21-Aug-2009
   Problem.....Prompts should be aligned relative to the field, otherwise it dramatically increases costs at 
               translation/testing time for all languages, even more so in Arabic (right to left writing). 
               See xls sheet for details. 
   Fix.........Prompt format setting was wrong for FRBGRNT_CURRENT_FUNDING_AMT, FRBGRNT_RCPT_SHARE_TOTAL, 
               FRBGRNT_CUM_FUNDING_AMT, FRBGRNT_MAX_FUNDING_AMT, CITY, STATE, ZIP_CODE, FRRGRPI_EMAIL & 
               FRBGBIL_BUD_CHECK_SOURCE_IND, modified as like other items and aligned the prompt 
               according to other items i.e. : Prompt Attachment Edge: End & Prompt Alignment : Center.
6. Defect......1-1A1JGI
   Signoff.....Maneesh Mohan 29-Oct-2009   
   Problem:....1 or 2 letter abbreviations are not translatable and probably used in logic.	             
   Fix:........Added items FRBGRNT_GRANT_DESC, FRBGRNT_CATEGORY_DESC, FRBGRNT_SUB_CAT_DESC for displaying grant, category and sub category 
               description respectively. Changed the label of item "DISPLAY_TEXT_IND". Converted the text item "PHONE_EXISTS" to check box.
               Modified KEY-LISTVAL trigger for the below items for fixing the navigation and selection problem with these items:
               FRBGRNT_ORGN_CODE_RESP_OFFICE, FRBGRNT_STATUS_CODE, FRBGRNT_GRANT_TYPE, FRBGRNT_CATEGORY, FRBGRNT_SUB_CATEGORY, 
               FRBGRNT_CFDA_CODE, FRRGRPI_ID_IND, FRRGRPI_ORGN_CODE, FRRGRPI_BFRM_CODE, FRBGBIL_PMSC_CODE, FRBGBIL_BECL_CODE, 
               FRBGBIL_PAYMENT_FUND_CODE, FRBGBIL_PAYMENT_ACCT_CODE, FRBGBIL_CLEARING_ACCT_CODE, FRBGBIL_DEFERRED_ACCT_CODE.               
7. Defect#....1-3OW3C6
   Signoff....Gopinath Thulasidoss 28-Oct-2009
   Problems...The phone number is reverted back to the primary phone
              number for that address type and seqno, but the non-matching phone type 
              and seqno is what was selected and saved.
   Fix........The condition (above cursor PHONE_CURSOR) in the trigger POST-QUERY 
              of block FRBGRNT is modified to fetch the phone number. The null check of 
              phone number is removed.   
              Block: FRBGRNT, Item: FRBGRNT_AGENCY_TELE_SEQNO, Trigger: KEY-LISTVAL. 
              Included assignments to CTRY_CODE_PHONE, AREA_CODE, PHONE_NUMBER, EXTENSION from 
              GLOBAL.CTRY_CODE_PHONE,GLOBAL.PHONE_AREA, GLOBAL.PHONE_NUMBER, GLOBAL.PHONE_EXT 
              respectively. 
              Modified KEY-LISTVAL of FRBGRNT_AGENCY_ADDR_CODE.
              Removed the existing code, as it created the side effect of firing the post-change 
              of FRBGRNT_AGENCY_ADDR_CODE and FRBGRNT_AGENCY_ADDR_SEQ_NUM in a loop. 
              Which resulted in reassigning the modified phone type and phone sequence number. 
              Created KEY-LISTVAL, similar to the one for FRBGRNT_AGENCY_ADDR_SEQ_NUM.
              Included GO_ITEM('FRBGRNT_AGENCY_ADDR_SEQ_NUM') to fire the validation triggers of 
              FRBGRNT_AGENCY_ADDR_SEQ_NUM.
              Block: FRBGRNT, Item: FRBGRNT_AGENCY_ADDR_CODE, Trigger: POST-CHANGE
              Removed EXECUTE_TRIGGER('CLR_ADDR') as this has to fire in conjunction with 
              EXECUTE_TRIGGER( 'EDIT_SPRADDR' ). The assignment 
              :frbgrnt_AGENCY_ADDR_SEQ_NUM := :frbgrnt_AGENCY_ADDR_SEQ_NUM; 
              which fires the POST-CHANGE of frbgrnt_AGENCY_ADDR_SEQ_NUM handles the same.            
                             
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;

	*/
	//ID:3568
	/* <p>
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_0_1
	
	PROCEDURE AUDIT_TRAIL_8_4_0_1 IS
<multilinecomment> 
AUDIT TRAIL: 8.4.0.1

1. Defect......1-AZ74OC
	 Signoff.....Gopinath Thulasidoss 17-MAR-2010
	 Problem:....Forms FRAGRNT and FRAEVGA have alignment issues with prompt displays 
	             that cannot be seen with 10g or 11g Java 5.
   Fix:........The Prompt property attributes are not to standards
               FRAGRNT.FRBGRNT.FRBGRNT_LONG_TITLE: Modified following properties. 
                                                     From      To
                                                     ----      ----
                         Prompt Attachment Edge      Start     End
                         Prompt Alignment            Start     Center
                         Prompt Attachment Offset    81        -728
                         Prompt Alignment Offset     4         0


                             
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;

	*/
	//ID:3569
	/* <p>
/* </p>
		*/
		public void auditTrail8401()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5
	
	PROCEDURE AUDIT_TRAIL_8_5 IS
<multilinecomment> 
AUDIT TRAIL: 8.5

1. Defect.......1-3BZAMP
   Signoff......Pradeep Kumar Mallapuram        11-Jun-2010
   Problem......Value NEXT - entry required in English,
                value not translatable
   Fix..........Removed hard coded NEXT and replaced with centralized DB function
                (i.e. fokutil.f_next_display) which returns keyword to generate 
                new Grant.
                Added new item NEXT_DOC_NUM in FORM_HEADER block to store the
                keyword returned by the DB function.
                Modified WHEN_NEW_BLOCK_INSTANCE_TRG and KEY-CLRFRM trigger 
                to store keyword returned by DB function in NEXT_DOC_NUM and 
                set the hint text for Proposal Code item.
                Below listed  triggers are modified to replace the 
                hard coded value NEXT with NEXT_DOC_NUM item which stores 
                keyword to generate new Grant Code:
                MNU_OPT_COST_SHARE_INFO (Form level)
                MNU_OPT_PERSONNEL_INFO (Form level)
                MNU_OPT_USER_CODES_INFO (Form level)
                MNU_OPT_BILLING_INFO (Form level)
                PRE-INSERT (FRBGRNT block level)
                POST-CHANGE (FRBGRNT.FRBGRNT_ORGN_CODE_RESP_OFFICE item level)
               
                Modified WHERE clause property of FRBGRNT block and where clause of 
                sql query in SELECT_FRBGRNT_1 function to exclude duplication validation 
                if user enters keyword in the key block.
               
AUDIT TRAIL END
</multilinecomment>  
BEGIN
	NULL; 
END;
	*/
	//ID:3570
	/* <p>
/* </p>
		*/
		public void auditTrail85()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_0_4
	
	PROCEDURE AUDIT_TRAIL_8_4_0_4 IS
<multilinecomment> 
AUDIT TRAIL: 8.4.0.4

1. Defect.......1-BMV7IL
   Signoff......Maneesh Mohan   20-Sep-2010
   Problem......FRAGRNT does not allow entry of an Organization code if terminated.                
   Fix..........
                1. Removed the subclassing on fields 'FRBGRNT_ORGN_CODE_RESP_OFFICE' and 'FRRGRPI_ORGN_CODE'; 
                   modified the property 'Case Restriction' to 'Upper' for both fields.

                2. Added two new itemS 'ORG_VALIDATE_FLAG' and 'ORG_P_VALIDATE_FLAG' in FORM_HEADER block and 
                   modified the form level triggers 'RE_EDIT' and 'EDIT_ORGN_CODE' to skip validation errors with 
                   terminated or inactive organizations in query mode and in case of data entry with a terminated 
                   organization, to show a warning message with Yes/No buttons so that the user can bypass the 
                   validation error if required. Removed unwanted trigger calls to the organization vaidation trigger 
                   in 'POST-CHANGE' and 'WHEN-NEW-ITEM-INSTANCE' triggers of item FRBGRNT_ORGN_CODE_RESP_OFFICE. 
                   Modified the trigger EDIT_ORGN_CODE_FRRGRPI that validates the personnel organization code same 
                   like the Responsible Organization code validation and also the 'POST-CHANGE' trigger of item FRRGRPI_ORGN_CODE. 

                3. Modified the properties 'Enabled' and 'Query Allowed' to 'No' for item FRRGRPI_COAS in personnel tab. 

                4. Created a new form level validation trigger 'EDIT_PERSON_ID' that should be called from the form level 
                   trigger 'RE_EDIT'. This validation forces the user to provide value for ID field in Personnel tab and there 
                   by avoids the unhandled Oracle exception while trying to save the  Personnel information with ID field NULL, 
                   which is a required field in database.                
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:3571
	/* <p>
/* </p>
		*/
		public void auditTrail8404()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_0_6
	
	PROCEDURE AUDIT_TRAIL_8_6_0_6 IS
<multilinecomment> 
AUDIT TRAIL: 8.6.0.6

1. Defect.......1-HWCBIO
   Signoff......Ravikanth Ramanarayana        19-Sep-2011
   Problem......Responsible Org displayed after commit is the one 
                effective at the start date, not the current one.
   Fix..........Modified the triggers EDIT_ORGN_CODE to fetch the 
                Responsible Organization and the trigger 
                EDIT_ORGN_CODE_FRRGRPI to fetch the Organization 
                in personal tab based on the system date.
AUDIT TRAIL END
</multilinecomment>  
BEGIN
	NULL; 
END;

	*/
	//ID:3572
	/* <p>
/* </p>
		*/
		public void auditTrail8606()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_1_5
	
	PROCEDURE AUDIT_TRAIL_8_6_1_5 IS
<multilinecomment> 
AUDIT TRAIL: 8.6.1.5

1. Defect.......1-113DE2A
   Signoff......Maneesh Mohan 
   Problem......The title of the Responsible Organization code does not display if the organization is terminated. 
   Fix..........Modified the triggers EDIT_ORGN_CODE and EDIT_ORGN_CODE_FRRGRPI to fetch the titles for Responsible Organization 
                and the Organization in personal tab respectively in case of terminated organizations.
AUDIT TRAIL END
</multilinecomment>  
BEGIN
	NULL; 
END;
	*/
	//ID:3573
	/* <p>
/* </p>
		*/
		public void auditTrail8615()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT IS
<multilinecomment> 
Copyright 1995-2013 Ellucian Company L.P. and its affiliates.
</multilinecomment> 
BEGIN
  NULL;
END;

	*/
	//ID:3574
	/* <p>
/* </p>
		*/
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_9
	
	PROCEDURE AUDIT_TRAIL_8_9 IS
<multilinecomment> 
AUDIT TRAIL: 8.9

1. RPE# 1-G32Z5
   Signoff......Maneesh Mohan 02-Apr-2013
   Requirement...Encumbering F&A idc costs.
   Modification..Added a new check box FRBGRNT_IDC_ENC_IND in the Cost Code window so that
                 the user can identify whether a grant will be evaluated for IDC
                 encumbering.
2. RPE#..........1-19V7ZZD
   Signoff.......Maneesh Mohan 31-Jul-2013
   Requirement...Add SPONSOR_ID and funding type to Pass Thru Agency Distribution form and FRRAGPT table.
   Modification..Created a new tab page "PASSTHROUGH_AGENCY" in the tab canvas "FFRAPROP_1_TAB_CANVAS" 
                 and moved all the items in the "Pass Through Agency" window to the new tab page before 
                 deleting the canvas "FRAPROP_7_CANVAS" which is nolonger required. Also, added a new 
                 database column FRRPRPT_SPONSOR_ID to the new tab page for entering/viewing the 
                 sponsor ID relevant to the Pass Through Agency.

								Modified the below triggers:
									KEY-NXTBLK
									KEY-PRVBLK
									ENABLE_PAGES
									DISABLE_PAGES
									WHEN-TAB-PAGE-CHANGED
									FRRAGPT.FRRAGPT_SPONSOR_ID.KEY-NEXT-ITEM
									FRRAGPT.FRRAGPT_FEDERAL_FUND_PERCENT.KEY-NEXT-ITEM
									COPY_INSERT_FRBGRNT
									COPY_FROM_PROP_TO
									COPY_INSERT_FRRAGPT
									COPY_FROM_PROP_FRRAGPT
									COPY_FROM_FRRPRPT_TO_FRRAGPT
								
								Also, modified all the occurances of the word "Agent" in validation messages to "Agency" in the below triggers:
									GET_PASS_THRU_DETAILS 
									FRBGRNT.DISPLAY_PASS_THRU_IND.WHEN-CHECKBOX-CHANGED                 
AUDIT TRAIL END
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:3575
	/* <p>
/* </p>
		*/
		public void auditTrail89()
		{
		}

	
	

}
