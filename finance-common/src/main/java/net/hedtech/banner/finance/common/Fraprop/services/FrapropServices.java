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
import net.hedtech.banner.finance.common.Fraprop.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Fraprop.model.*;



public class FrapropServices extends AbstractSupportCodeObject{
	
	
	public FrapropServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public FrapropTask  getTask() {
		return (FrapropTask )super.getContainer();
	}

	
	public net.hedtech.banner.finance.common.Fraprop.model.FrapropModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit COPY_INSERT_FRRPUSN
	
	PROCEDURE COPY_INSERT_FRRPUSN IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frrpusn
     where frrpusn_prop_code = :copy_prop_code;
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
  INSERT INTO FRRPLOC (FRRPLOC_PROP_CODE,FRRPLOC_LOCN_CODE,
                       FRRPLOC_LOCN_RESEARCH_IND,FRRPLOC_ACTIVITY_DATE, FRRPLOC_USER_ID)
  ( SELECT :FRBPROP_CODE, FRRPUSN_SDAT_CODE_ATTR, FRRPUSN_SDAT_CODE_OPT_1,                                  
           :FRBPROP_ACTIVITY_DATE,:FRBPROP_USER_ID
   FROM FRRPUSN
   WHERE FRRPUSN_PROP_CODE = :COPY_PROP_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;


	*/
	//ID:2698
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyInsertFrrpusn(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frrpusn " +
	" WHERE frrpusn_prop_code = :COPY_PROP_CODE ";
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
				String sql1 = "INSERT INTO FRRPLOC " +
	"(FRRPLOC_PROP_CODE, FRRPLOC_LOCN_CODE, FRRPLOC_LOCN_RESEARCH_IND, FRRPLOC_ACTIVITY_DATE, FRRPLOC_USER_ID)" +
	"(SELECT SELECT :FRBPROP_CODE, FRRPUSN_SDAT_CODE_ATTR, FRRPUSN_SDAT_CODE_OPT_1, :FRBPROP_ACTIVITY_DATE, :FRBPROP_USER_ID " +
	" FROM FRRPUSN " +
	" WHERE FRRPUSN_PROP_CODE = :COPY_PROP_CODE )";
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
					checkData.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit CLEAR_FIELDS
	
	procedure clear_fields (block_name varchar2, item_cursor_in varchar2) is
item_name          varchar2(80);
item_first         varchar2(80);
item_last          varchar2(80);
tab_page_name      varchar2(80);
begin
  item_first := get_block_property(block_name, FIRST_ITEM);
  item_last := get_block_property(block_name, LAST_ITEM);
  item_name := item_first;
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
	//ID:2699
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blockName
		* @param itemCursorIn
		*/
		public void clearFields(NString blockName, NString itemCursorIn)
		{
			NString itemName= NString.getNull();
			NString itemFirst= NString.getNull();
			NString itemLast= NString.getNull();
			NString tabPageName= toStr("");
			itemFirst = getBlockFirstItem(blockName);
			itemLast = getBlockLastItem(blockName);
			itemName = itemFirst;
			// F2J_NOT_SUPPORTED : The property "ITEM's ITEM_TAB_PAGE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
			TabPageDescriptor tab = findItem(itemCursorIn).getPage();  	
			if(tab != null) {
				tabPageName = toStr(tab.getId()); // SupportClasses.FORMS40.GetItemProperty(itemCursorIn, SupportClasses.Property.ITEM_TAB_PAGE);
			}
			//System.err.println("// F2J_NOT_SUPPORTED : The property 'ITEM's ITEM_TAB_PAGE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
			
			while ((getItemNextItem(itemName).notEquals(itemFirst))) {
//				if ((SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.ITEM_TAB_PAGE).equals(tabPageName) && getItemType(itemName).equals("TEXT ITEM")))
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					copy("",itemName);
//				}
				//MORPHIS TODO is this the right way to check ITEM_TAB_PAGE
				if(findItem(itemName).getPage() != null){
					if (findItem(itemName).getPage().getId().equals(tabPageName.toString()) && getItemType(itemName).equals("TEXT ITEM"))
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						copy("",itemName);
					}
				}
				itemName = getItemNextItem(itemName);
			}
		}

	
	/* Original PL/SQL code for Prog Unit DELETE_FRRPRPI_1
	
	PROCEDURE DELETE_FRRPRPI_1 IS
 BEGIN
 DELETE FROM FRRPRPI
   WHERE FRRPRPI_PROP_CODE = :FRBPROP_CODE
     AND FRRPRPI_ID_IND = '001';
END;
	*/
	//ID:2700
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void deleteFrrprpi1(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			String sql1 = "DELETE FROM FRRPRPI " +
	" WHERE FRRPRPI_PROP_CODE = :FRBPROP_CODE AND FRRPRPI_ID_IND = '001'";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
			rowCount = command1.execute();
		}

	
	/* Original PL/SQL code for Prog Unit CHECK_PI_PIDM_EQUAL
	
	FUNCTION CHECK_PI_PIDM_EQUAL RETURN BOOLEAN
IS
 id_pidm      frrprpi.frrprpi_id_pidm%type;
--
 cursor check_001 is
  select frrprpi_id_pidm
   from frrprpi
    where frrprpi_prop_code = :frrprpi_prop_code
      and frrprpi_id_ind = '001';
BEGIN
 open check_001;
 fetch check_001 into id_pidm;
  if check_001%FOUND then
    --   if id_pidm <> :frrprpi_id_pidm then
         return TRUE;
    --   end if;
  end if;
RETURN NULL; END;



	*/
	//ID:2701
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool checkPiPidmEqual(FrrprpiAdapter frrprpiElement)
		{
			int rowCount = 0;
			NNumber idPidm= NNumber.getNull();
			String sqlcheck001 = "SELECT frrprpi_id_pidm " +
	" FROM frrprpi " +
	" WHERE frrprpi_prop_code = :FRRPRPI_PROP_CODE AND frrprpi_id_ind = '001' ";
			DataCursor check001 = new DataCursor(sqlcheck001);
			try {
				//Setting query parameters
				check001.addParameter("FRRPRPI_PROP_CODE", frrprpiElement.getFrrprpiPropCode());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable check001.
				check001.open();
				ResultSet check001Results = check001.fetchInto();
				if ( check001Results != null ) {
					idPidm = check001Results.getNumber(0);
				}
				if ( check001.found() )
				{
					//    if id_pidm <> :frrprpi_id_pidm then
					return  toBool(NBool.True);
				}
				return NBool.getNull();
				}finally{
					check001.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit UPDATE_FRBPROP_1
	
	   PROCEDURE UPDATE_FRBPROP_1
   IS
   BEGIN
      UPDATE FRBPROP
       SET FRBPROP_PI_PIDM =       :FRRPRPI_ID_PIDM,
           FRBPROP_USER_ID =       :FRRPRPI_USER_ID,
           FRBPROP_ACTIVITY_DATE = :FRRPRPI_ACTIVITY_DATE
       WHERE FRBPROP_CODE = :FRRPRPI_PROP_CODE;
    IF SQL%NOTFOUND THEN
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
   END ;

	*/
	//ID:2702
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void updateFrbprop1(FrrprpiAdapter frrprpiElement)
		{
			int rowCount = 0;
			String sql1 = "UPDATE FRBPROP " +
	"SET FRBPROP_PI_PIDM = :FRRPRPI_ID_PIDM, FRBPROP_USER_ID = :FRRPRPI_USER_ID, FRBPROP_ACTIVITY_DATE = :FRRPRPI_ACTIVITY_DATE " +
	" WHERE FRBPROP_CODE = :FRRPRPI_PROP_CODE";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRRPRPI_ID_PIDM", frrprpiElement.getFrrprpiIdPidm());
			command1.addParameter("FRRPRPI_USER_ID", frrprpiElement.getFrrprpiUserId());
			command1.addParameter("FRRPRPI_ACTIVITY_DATE", frrprpiElement.getFrrprpiActivityDate());
			command1.addParameter("FRRPRPI_PROP_CODE", frrprpiElement.getFrrprpiPropCode());
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
         WHERE  FOBPROF_USER_ID = :CURRENT_USER1
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
         SELECT FRBPROP_COAS_CODE, FRBPROP_ORGN_CODE_RESP_OFFICE
           FROM FRBPROP
         WHERE FRBPROP_CODE = code;
--
      hold_frbprop_coas_code    frbprop.frbprop_coas_code%type;
      hold_frbprop_orgn_code    frbprop.frbprop_orgn_code_resp_office%type;	
--
      RETRIEVED_ORGN_CODE  varchar2(6);
--
      CURSOR PTI_CURSOR_2 IS
         SELECT FTVORGN_ORGN_CODE
         FROM   FTVORGN
         WHERE  FTVORGN_ORGN_CODE IN  (
               SELECT FORUSOR_ORGN_CODE
               FROM   FORUSOR
               WHERE  FORUSOR_USER_ID_ENTERED = :CURRENT_USER1
                 AND  FORUSOR_COAS_CODE = hold_frbprop_coas_code )
         CONNECT BY FTVORGN_ORGN_CODE = PRIOR
            FTVORGN_ORGN_CODE_PRED
           AND  FTVORGN_COAS_CODE = PRIOR FTVORGN_COAS_CODE
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE
         START WITH FTVORGN_ORGN_CODE = hold_frbprop_orgn_code
           AND  FTVORGN_COAS_CODE = hold_frbprop_coas_code
           AND  FTVORGN_EFF_DATE <= SYSDATE
           AND  FTVORGN_NCHG_DATE > SYSDATE ;
--
      PTI_INTO_TEMP_1        VARCHAR2(255);
      CURSOR PTI_CURSOR_3 IS
         SELECT 'Y'
         FROM   FORUSOR
         WHERE  FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE
           AND  FORUSOR_COAS_CODE = hold_frbprop_coas_code
           AND  FORUSOR_ACCESS_IND IN ('B','P','Q')
           AND  FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 ;
   BEGIN
      OPEN PTI_CURSOR_1;
        FETCH PTI_CURSOR_1 INTO hold_frbprop_coas_code, hold_frbprop_orgn_code;
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
   MESSAGE(
         G$_NLS.Get('FRAPROP-0164', 'FORM','User is not authorized to query or post with the entered Organization.')  ) ;
   RAISE FORM_TRIGGER_FAILURE ;

--
   << TRIG_EXIT >>
   NULL ;
 END;
END;

	*/
	//ID:2705
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param code
		*/
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
	" WHERE FOBPROF_USER_ID = :CURRENT_USER1 AND (FOBPROF_MASTER_ORGN_IND) IN ('B', 'P', 'Q') ";
				DataCursor ptiCursor = new DataCursor(sqlptiCursor);
				try {
					//Setting query parameters
					ptiCursor.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
					ptiCursor.open();
					ResultSet ptiCursorResults = ptiCursor.fetchInto();
					if ( ptiCursorResults != null ) {
						ptiIntoTemp = ptiCursorResults.getStr(0);
					}
					if ( ptiCursor.notFound() )
					{
//						 goto CHK_ORGN_SEC;
					}
					else {
						return ;
					}
				}
				finally{
					ptiCursor.close();
				}
			}
			 CHK_ORGN_SEC:;
			{
				String sqlptiCursor1 = "SELECT FRBPROP_COAS_CODE, FRBPROP_ORGN_CODE_RESP_OFFICE " +
	" FROM FRBPROP " +
	" WHERE FRBPROP_CODE = :P_CODE ";
				DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
				// 
				NString holdFrbpropCoasCode= NString.getNull();
				NString holdFrbpropOrgnCode= NString.getNull();
				// 
				NString retrievedOrgnCode= NString.getNull();
				String sqlptiCursor2 = "SELECT FTVORGN_ORGN_CODE " +
	" FROM FTVORGN " +
	" WHERE (FTVORGN_ORGN_CODE) IN ((SELECT FORUSOR_ORGN_CODE " +
		" FROM FORUSOR " +
		" WHERE FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 AND FORUSOR_COAS_CODE = :P_HOLD_FRBPROP_COAS_CODE )) ";
				DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
				// 
				NString ptiIntoTemp1= NString.getNull();
				String sqlptiCursor3 = "SELECT 'Y' " +
	" FROM FORUSOR " +
	" WHERE FORUSOR_ORGN_CODE = :RETRIEVED_ORGN_CODE AND FORUSOR_COAS_CODE = :P_HOLD_FRBPROP_COAS_CODE AND (FORUSOR_ACCESS_IND) IN ('B', 'P', 'Q') AND FORUSOR_USER_ID_ENTERED = :CURRENT_USER1 ";
				DataCursor ptiCursor3 = new DataCursor(sqlptiCursor3);
				try {
					//Setting query parameters
					ptiCursor1.addParameter("P_CODE", code);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor1.
					ptiCursor1.open();
					ResultSet ptiCursor1Results = ptiCursor1.fetchInto();
					if ( ptiCursor1Results != null ) {
						holdFrbpropCoasCode = ptiCursor1Results.getStr(0);
						holdFrbpropOrgnCode = ptiCursor1Results.getStr(1);
					}
					if ( ptiCursor1.notFound() )
					{
//						 goto TRIG_EXIT;
						 return;
					}
					// 
					//Setting query parameters
					ptiCursor2.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
					ptiCursor2.addParameter("P_HOLD_FRBPROP_COAS_CODE", holdFrbpropCoasCode);
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor2.
					ptiCursor2.open();
					ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
					if ( ptiCursor2Results != null ) {
						getFormModel().getFormHeader().setRetrievedOrgnCode(ptiCursor2Results.getStr(0));
					}
					if ( ptiCursor2.notFound() )
					{
//						 goto ORGN_NOT_ALLOWED;
//						 ORGN_NOT_ALLOWED:;
							errorMessage(GNls.Fget(toStr("FRAPROP-0164"), toStr("FORM"), toStr("*ERROR* User is not authorized to query or post with the entered Organization.")));
							throw new ApplicationException();
					}
					 CHK_ORGN_ALLOWED:;
					//Setting query parameters
					ptiCursor3.addParameter("RETRIEVED_ORGN_CODE", getFormModel().getFormHeader().getRetrievedOrgnCode());
					ptiCursor3.addParameter("P_HOLD_FRBPROP_COAS_CODE", holdFrbpropCoasCode);
					ptiCursor3.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor3.
					ptiCursor3.open();
					ResultSet ptiCursor3Results = ptiCursor3.fetchInto();
					if ( ptiCursor3Results != null ) {
						ptiIntoTemp1 = ptiCursor3Results.getStr(0);
					}
					if ( ptiCursor3.notFound() )
					{
//						 goto ORGN_NOT_ALLOWED;
//						 ORGN_NOT_ALLOWED:;
							errorMessage(GNls.Fget(toStr("FRAPROP-0164"), toStr("FORM"), toStr("*ERROR* User is not authorized to query or post with the entered Organization.")));
							throw new ApplicationException();
					}
					else {
//						 goto TRIG_EXIT;
						 return;
					}
//					 ORGN_NOT_ALLOWED:;
//					message(GNls.Fget(toStr("FRAPROP-0164"), toStr("FORM"), toStr("User is not authorized to query or post with the entered Organization.")));
//					throw new ApplicationException();
//					 TRIG_EXIT:;
				}
				finally{
					ptiCursor1.close();
					ptiCursor2.close();
					ptiCursor3.close();
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit COPY_INSERT_FOBTEXT
	
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
  INSERT INTO FOBTEXT(FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM,
                      FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM,
                      FOBTEXT_ACTIVITY_DATE, FOBTEXT_USER_ID,FOBTEXT_CLA_NUM,
                      FOBTEXT_PRT_IND, FOBTEXT_TEXT)
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


	*/
	//ID:2706
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

	
	/* Original PL/SQL code for Prog Unit COPY_INSERT_FRRPRPI
	
	PROCEDURE COPY_INSERT_FRRPRPI IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frrprpi
     where frrprpi_prop_code = :copy_prop_code;
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
  INSERT INTO FRRPRPI (FRRPRPI_PROP_CODE,FRRPRPI_ID_IND,
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


	*/
	//ID:2707
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyInsertFrrprpi(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frrprpi " +
	" WHERE frrprpi_prop_code = :COPY_PROP_CODE ";
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
				String sql1 = "INSERT INTO FRRPRPI " +
	"(FRRPRPI_PROP_CODE, FRRPRPI_ID_IND, FRRPRPI_ID_PIDM, FRRPRPI_ORGN_CODE, FRRPRPI_SALUTATION, FRRPRPI_TITLE, FRRPRPI_FTE, FRRPRPI_EMPLOYEE_IND, FRRPRPI_ACTIVITY_DATE, FRRPRPI_USER_ID)" +
	"(SELECT SELECT :FRBPROP_CODE, FRRPRPI_ID_IND, FRRPRPI_ID_PIDM, FRRPRPI_ORGN_CODE, FRRPRPI_SALUTATION, FRRPRPI_TITLE, FRRPRPI_FTE, FRRPRPI_EMPLOYEE_IND, :FRBPROP_ACTIVITY_DATE, :FRBPROP_USER_ID " +
	" FROM FRRPRPI " +
	" WHERE FRRPRPI_PROP_CODE = :COPY_PROP_CODE )";
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
					checkData.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit COPY_INSERT_FRRPLOC
	
	PROCEDURE COPY_INSERT_FRRPLOC IS
   pti_temp   varchar2(1);
   cursor check_data is
    select 'X'
     from frrploc
     where frrploc_prop_code = :copy_prop_code;
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
  INSERT INTO FRRPLOC( FRRPLOC_PROP_CODE,FRRPLOC_LOCN_CODE,
                       FRRPLOC_LOCN_RESEARCH_IND,FRRPLOC_ACTIVITY_DATE,FRRPLOC_USER_ID) 
  ( SELECT :FRBPROP_CODE, FRRPLOC_LOCN_CODE, FRRPLOC_LOCN_RESEARCH_IND,                                    
            :FRBPROP_ACTIVITY_DATE,:FRBPROP_USER_ID
   FROM FRRPLOC
   WHERE FRRPLOC_PROP_CODE = :COPY_PROP_CODE);
    IF SQL%NOTFOUND THEN 
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
END;


	*/
	//ID:2708
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyInsertFrrploc(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			NString ptiTemp= NString.getNull();
			String sqlcheckData = "SELECT 'X' " +
	" FROM frrploc " +
	" WHERE frrploc_prop_code = :COPY_PROP_CODE ";
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
				String sql1 = "INSERT INTO FRRPLOC " +
	"(FRRPLOC_PROP_CODE, FRRPLOC_LOCN_CODE, FRRPLOC_LOCN_RESEARCH_IND, FRRPLOC_ACTIVITY_DATE, FRRPLOC_USER_ID)" +
	"(SELECT SELECT :FRBPROP_CODE, FRRPLOC_LOCN_CODE, FRRPLOC_LOCN_RESEARCH_IND, :FRBPROP_ACTIVITY_DATE, :FRBPROP_USER_ID " +
	" FROM FRRPLOC " +
	" WHERE FRRPLOC_PROP_CODE = :COPY_PROP_CODE )";
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
					checkData.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit UPDATE_FRRPRPI_1
	
	   PROCEDURE UPDATE_FRRPRPI_1
   IS
   BEGIN
      UPDATE FRRPRPI
       SET FRRPRPI_ID_PIDM =       :FRBPROP_PI_PIDM,
           FRRPRPI_USER_ID =       :FRBPROP_USER_ID,
           FRRPRPI_ACTIVITY_DATE = :FRBPROP_ACTIVITY_DATE
       WHERE FRRPRPI_PROP_CODE = :FRBPROP_CODE
         AND FRRPRPI_ID_IND = '001';
    IF SQL%NOTFOUND THEN
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
   END ;

	*/
	//ID:2709
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void updateFrrprpi1(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			String sql1 = "UPDATE FRRPRPI " +
	"SET FRRPRPI_ID_PIDM = :FRBPROP_PI_PIDM, FRRPRPI_USER_ID = :FRBPROP_USER_ID, FRRPRPI_ACTIVITY_DATE = :FRBPROP_ACTIVITY_DATE " +
	" WHERE FRRPRPI_PROP_CODE = :FRBPROP_CODE AND FRRPRPI_ID_IND = '001'";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBPROP_PI_PIDM", frbpropElement.getFrbpropPiPidm());
			command1.addParameter("FRBPROP_USER_ID", frbpropElement.getFrbpropUserId());
			command1.addParameter("FRBPROP_ACTIVITY_DATE", frbpropElement.getFrbpropActivityDate());
			command1.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit INSERT_FRRPRPI_1
	
	   PROCEDURE INSERT_FRRPRPI_1
   IS
   BEGIN
      INSERT INTO FRRPRPI
       ( FRRPRPI_PROP_CODE, FRRPRPI_ID_IND, FRRPRPI_ID_PIDM, FRRPRPI_ORGN_CODE,
          FRRPRPI_USER_ID, FRRPRPI_ACTIVITY_DATE )
      VALUES (:FRBPROP_CODE, '001', :FRBPROP_PI_PIDM, :FRBPROP_ORGN_CODE_RESP_OFFICE,
              :FRBPROP_USER_ID, :FRBPROP_ACTIVITY_DATE);
    IF SQL%NOTFOUND THEN
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
   END ;
	*/
	//ID:2710
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void insertFrrprpi1(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			String sql1 = "INSERT INTO FRRPRPI " +
	"(FRRPRPI_PROP_CODE, FRRPRPI_ID_IND, FRRPRPI_ID_PIDM, FRRPRPI_ORGN_CODE, FRRPRPI_USER_ID, FRRPRPI_ACTIVITY_DATE)" +
	"VALUES (:FRBPROP_CODE, '001', :FRBPROP_PI_PIDM, :FRBPROP_ORGN_CODE_RESP_OFFICE, :FRBPROP_USER_ID, :FRBPROP_ACTIVITY_DATE)";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
			command1.addParameter("FRBPROP_PI_PIDM", frbpropElement.getFrbpropPiPidm());
			command1.addParameter("FRBPROP_ORGN_CODE_RESP_OFFICE", frbpropElement.getFrbpropOrgnCodeRespOffice());
			command1.addParameter("FRBPROP_USER_ID", frbpropElement.getFrbpropUserId());
			command1.addParameter("FRBPROP_ACTIVITY_DATE", frbpropElement.getFrbpropActivityDate());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit INVALID_OPTION_SELECTED
	
	procedure invalid_option_selected is
begin
   message( G$_NLS.Get('FRAPROP-0165', 'FORM','The Option selected is not available at this time.') );
end;
	*/
	//ID:2711
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void invalidOptionSelected()
		{
			warningMessage(GNls.Fget(toStr("FRAPROP-0165"), toStr("FORM"), toStr("The Option selected is not available at this time.")));
		}

	
	/* Original PL/SQL code for Prog Unit INSERT_FRVPRST_1
	
	   PROCEDURE INSERT_FRVPRST_1
   IS
   BEGIN
      INSERT INTO FRVPRST
       ( FRVPRST_PROP_CODE, FRVPRST_STATUS_CODE, FRVPRST_COAS_CODE,
          FRVPRST_DATE_STATUS, FRVPRST_USER_ID,
          FRVPRST_ACTIVITY_DATE, FRVPRST_STATUS_DESC )
      VALUES ( :FRBPROP_CODE, :FRBPROP_STATUS_CODE,
         :FRBPROP_COAS_CODE, :FRBPROP_STATUS_DATE, :FRBPROP_USER_ID
         , :FRBPROP_ACTIVITY_DATE, :FRBPROP_ALTERNATE_STATUS_DESC ) ;
    IF SQL%NOTFOUND THEN
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
   END ;
	*/
	//ID:2712
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void insertFrvprst1(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			String sql1 = "INSERT INTO FRVPRST " +
	"(FRVPRST_PROP_CODE, FRVPRST_STATUS_CODE, FRVPRST_COAS_CODE, FRVPRST_DATE_STATUS, FRVPRST_USER_ID, FRVPRST_ACTIVITY_DATE, FRVPRST_STATUS_DESC)" +
	"VALUES (:FRBPROP_CODE, :FRBPROP_STATUS_CODE, :FRBPROP_COAS_CODE, :FRBPROP_STATUS_DATE, :FRBPROP_USER_ID, :FRBPROP_ACTIVITY_DATE, :FRBPROP_ALTERNATE_STATUS_DESC)";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
			command1.addParameter("FRBPROP_STATUS_CODE", frbpropElement.getFrbpropStatusCode());
			command1.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
			command1.addParameter("FRBPROP_STATUS_DATE", frbpropElement.getFrbpropStatusDate());
			command1.addParameter("FRBPROP_USER_ID", frbpropElement.getFrbpropUserId());
			command1.addParameter("FRBPROP_ACTIVITY_DATE", frbpropElement.getFrbpropActivityDate());
			command1.addParameter("FRBPROP_ALTERNATE_STATUS_DESC", frbpropElement.getFrbpropAlternateStatusDesc());
			rowCount = command1.execute();
			if ( rowCount == 0 )
			{
				throw new ApplicationException();
			}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_FRVPRST_2
	
	   FUNCTION SELECT_FRVPRST_2
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   FRVPRST
         WHERE  FRVPRST_PROP_CODE = :FRBPROP_CODE
           AND  FRVPRST_COAS_CODE = :FRBPROP_COAS_CODE
           AND  FRVPRST_STATUS_CODE = :FRBPROP_STATUS_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%NOTFOUND) ;
   END ;
	*/
	//ID:2713
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool selectFrvprst2(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM FRVPRST " +
	" WHERE FRVPRST_PROP_CODE = :FRBPROP_CODE AND FRVPRST_COAS_CODE = :FRBPROP_COAS_CODE AND FRVPRST_STATUS_CODE = :FRBPROP_STATUS_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
				ptiCursor.addParameter("FRBPROP_COAS_CODE", frbpropElement.getFrbpropCoasCode());
				ptiCursor.addParameter("FRBPROP_STATUS_CODE", frbpropElement.getFrbpropStatusCode());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.notFound()));
				}finally{
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
             set_item_property(item_name,REQUIRED, PROPERTY_ON);
         end if;
          item_name := get_item_property(item_name, NEXTITEM);
      END LOOP;
end; 


	*/
	//ID:2714
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
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
                 set_item_property(item_name,REQUIRED, PROPERTY_OFF);
                 set_item_property(item_name,LOCK_RECORD_ON_CHANGE, PROPERTY_ON);
            end if;
         item_name := get_item_property(item_name, NEXTITEM);
         END LOOP;
end;
<multilinecomment>   else
      while (get_item_property(item_name,NEXTITEM ) <> item_first) LOOP
      if (get_item_property(item_name,ITEM_TYPE)='TEXT ITEM' and          get_item_property(item_name,LOCK_RECORD_ON_CHANGE) = 'TRUE') THEN
             set_item_property(item_name,REQUIRED, PROPERTY_ON);
             --   set_item_property(item_name,MOUSE_NAVIGATE, PROPERTY_OFF);
         end if;
          item_name := get_item_property(item_name, NEXTITEM);
      END LOOP;
  end if;
end;</multilinecomment>

	*/
	//ID:2715
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
					// F2J_NOT_SUPPORTED *: The property "ITEM's LOCK_RECORD_ON_CHANGE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
					//					SupportClasses.FORMS40.SetItemProperty(itemName, SupportClasses.Property.LOCK_RECORD_ON_CHANGE, true);
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'ITEM's LOCK_RECORD_ON_CHANGE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
					
				}
				itemName = getItemNextItem(itemName);
			}
		}

	
	/* Original PL/SQL code for Prog Unit SELECT_FRBPROP_1
	
	  FUNCTION SELECT_FRBPROP_1(var varchar2)
   RETURN BOOLEAN IS
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM  FRBPROP
         WHERE FRBPROP_CODE = var
           AND var <> :FORM_HEADER.NEXT_DOC_NUM; 
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      RETURN (PTI_CURSOR%FOUND) ;
   END ;
	*/
	//ID:2716
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param var
		*/
		public NBool selectFrbprop1(NString var)
		{
			int rowCount = 0;
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
	" FROM FRBPROP " +
	" WHERE FRBPROP_CODE = :P_VAR AND :P_VAR <> :FORM_HEADER_NEXT_DOC_NUM ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_VAR", var);
				ptiCursor.addParameter("FORM_HEADER_NEXT_DOC_NUM", getFormModel().getFormHeader().getNextDocNum());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				return (toBool(ptiCursor.found()));
				}finally{
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
	//ID:2717
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:2718
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:2719
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1
	
	PROCEDURE AUDIT_TRAIL_3_1 IS
<multilinecomment>AUDIT TRAIL: 3.1
1.  Defect#....6431
    Signoff....Michael Hitrik   08/28/97
    Problem....Received Alert Box error "Truncation occurred; value too long for
               field HOLD_STATUS_CODE" when proposal was saved.
    Fix........Changed the length of hold_status_code = 2
2.  Defect#....NONE
    Signoff....Anna VAYNBLAT  09-09-97
    Problems...Changes for the user defined window for Grants Build.
    Fix........Change validations for the user defined window where entity=
               'FGRANTS' from ftvsdat to frvsdat.
               Also LOV now goes to FRVSDAT instead of FTVSDAT and FOQSDLV.
3. Defect#.....7868
   Signoff.....Scott Freeman   10-08-97
   Problem.....The description for the status code is selecting the most recent
               effective dated record to default the status title. But it should
               be using the record based on the effective date that is within
               the range of the status date entered in frbprop_status_date.
   Fix.........Add trigger post-change on the block 'FRBPROP' on the item
               'FRBPROP_STATUS_CODE' to get a correct status description from table
               FTVSDAT based on effective date entered in FRBPROP_STATUS_DATE.
4. Defect#.....NONE
   Signoff.....Anna Vaynblat   10-23-97
   Problem.....Changes for the Personnel Window.
   Fix.........Added buttons for each row called Events( takes you to FRIEVNP) and
               Text(takes you to FOAETXT).
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2720
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail31()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>AUDIT TRAIL: 4.0
1. Defect.......None
   Signoff.......Michael Hitrik       07/05/98
   Problem......Removed Billing Window Navigation

2. Defect.....None
   Signoff....Tom Mack			07/21/98
   Mod..........Removed obsolete columns (frbprop_billing_format
		frbprop_payment_method, frbprop_report_cycle)
		and references to those items.

3. Signoff.....Tom Mack			09/17/98
   Mod.........Made Grant field enterable and added button
		to go to FRIGRNT

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2721
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. Robert Rullo 9/30/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.

2. Robert Rullo 10/26/98
   Where Clause Methodology applied

3. Kayur Patel  1/26/99
   Phase II UI changes

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2722
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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

2.  Defect.....12314
    Signoff....Srilakshmi Baisetty  02-SEP-1999
    Problems...Once today's date defaults in FRBPROP_ORIG_PREP_DATE field (first field next 
               to the Dates-> Original boiler plate text), cannot update the field after it 
               has been saved. Correct functionality: Form should allow changes if today's 
               date is the default because person doing data entry may not know that date 
               should be different.
    Fix........UPDATE property is set to TRUE for block FRBPROP and 
               item FRBPROP_ORIG_PREP_DATE in property sheet.

3.  Defect.....None
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
	//ID:2723
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail41()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_2
	
	PROCEDURE AUDIT_TRAIL_4_2 IS

<multilinecomment>AUDIT TRAIL: 4.2

1.  Defect.....10962
    Signoff....Hanh Tran   03-10-2000
    Problems...FRM-40735: GET_AGCY_CODE_PRED_PIDM trigger raised unhandled exception
    Fix........Increase hold_agency_code_pred_name to 60
2.  Defect.....36198
    Signoff....Srivalli Pillutla 3/28/2000
    Progblem...Get_pi_id_code and Get_id_code triggers raised Value error.
    Fix........Increased the length of hold_pi_id_name from 40 to 100.

AUDIT TRAIL END
</multilinecomment>

BEGIN
  NULL;
END;
	*/
	//ID:2724
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:2725
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:2726
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Manual()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPY_INSERT_FRRPRPT
	
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

	*/
	//ID:2727
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
				String sql1 = "INSERT INTO FRRPRPT " +
	"(FRRPRPT_PROP_CODE, FRRPRPT_AGCY_PIDM, FRRPRPT_ACTIVITY_DATE, FRRPRPT_USER_ID, FRRPRPT_FEDERAL_FUND_PERCENT)" +
	"(SELECT SELECT :FRBPROP_CODE, FRRPRPT_AGCY_PIDM, SYSDATE, :GLOBAL_USER_ID, FRRPRPT_FEDERAL_FUND_PERCENT " +
	" FROM FRRPRPT " +
	" WHERE frrprpt_prop_code = :COPY_PROP_CODE )";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
				command1.addParameter("GLOBAL_USER_ID", getGlobal("USER_ID"));
				command1.addParameter("COPY_PROP_CODE", getFormModel().getCopyBlock().getCopyPropCode());
				rowCount = command1.execute();
				if ( rowCount == 0 )
				{
					throw new ApplicationException();
				}
				}finally{
					checkData.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment>AUDIT TRAIL: 5.4
1. 	MOD..................UI 2615-03 - Pass Through Indicator And Information
   	AUTHOR...............Anagha Gandhe
  	CHANGES(FORM)........Added new check box -Pass Through Indicator and a popup window.
  								       If a proposal is pass through, then popup window shows funding agency
  								       and federal percentage
  	CHANGES(DATABASE)....New Table FRRPRPT stores these details
2.  MOD..................UI 2615-07/08 - Overtype Description on Status and Events
		AUTHOR...............Anagha Gandhe
		CHANGES(FORM)........Modified Form to include new database field frbprop_alternate_status_desc
												 Status Desc now stores original desc||alternate desc
												 Desc is also stored in Status History. Modified program Unit INSERT_FRVPRST_1 for the same.
		CHANGES(DATABASE)....A new column FRBPROP_ALTERNATE_STATUS_DESC added to table FRBPROP
												 A new column FRVPRST_STATUS_DESC added to table FRVPRST 
AUDIT TRAIL END</multilinecomment>
BEGIN
  	NULL;
END;
	*/
	//ID:2728
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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

2.Defect   #43559            
  Signoff: Gladys Rocher 17-MAR-2003
  Problem: When i click on Copy Proposal information, Box that pops up has flashlight
           when you clicked on it , query of existing proposal does not occur.Goes right
           back to FRAPROP main screen.
      Fix:  Comment out the HIDE_WINDOW('COPY_PROP'); instruction in the following items:
            BLOCK: BUTTON_CONTROL_BLOCK
             ITEM: COPY_PROP_CODE_LBT
          TRIGGER: WHEN-BUTTON-PRESSED
            BLOCK: COPY_BLOCK
             ITEM: COPY_PROP_CODE
         TRIGGERS: KEY-LISTVAL AND
                   KEY-CQUERY.
           
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2729
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:2730
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. Wei Zhang 02-Apr-2004
  Application of enhanced UI methodology. Please refer to the SCT Banner 7.0 User Interface Technical Methodology for more details.
  Add tab canvas.

2. Defect 70-0125, LN 09-Aug-2004
   Problem:
     ID validation has local logic when should use g$/product$ routine(s).
   Functional Impact:
     Replaced local ID logic with g$ routines for Investigator ID and Agency in Header 
     tab page, ID in Personnel tab page, Agency and Predecessor in Proposal Agency tab 
     page, Agency Code in the Pass Through Agency Distribution Information window.
   Technical Fix:
     Modified triggers GET_ID_CODE, GET_AGENCY_CODE, GET_PI_ID_CODE, 
     GET_AGCY_CODE_PRED_PIDM, GET_PASS_THRU_DETAILS, FETCH_AGENCY_NAME, 
     FRBPROP.DISPLAY_PASS_THRU_IND.WHEN-CHECKBOX-CHANGED, FRRPRPT.POST-QUERY to call 
     g$_sel_spriden_id_name, FRBPROP.FRBPROP_AGENCY_CODE.WHEN-VALIDATE-ITEM, 
     FRBPROP.FRBPROP_PI_ID_CODE.WHEN-VALIDATE-ITEM, FRRPRPI.FRRPRPI_ID.WHEN-VALIDATE-ITEM 
     to call g$_sel_spriden_pidm_name.

AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2731
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_1_0_1
	
	PROCEDURE AUDIT_TRAIL_7_1_0_1 IS

<multilinecomment>AUDIT TRAIL: 7.1.0.1

1.  Defect.....103108
    Signoff....Wei Zhang   03-MAY-2005
    Problems...When creating a new proposal, fill in the agency id and PI id in the main 
               page, save it and immediately click the "Personal" tab, the PI information
               can not default in. If immediately click the "Proposal Agency" tab the 
               agency id can not default in. Both of them can be defaulted in if user uses
               the next block key for navigation.
    Fix........Modify form level trigger when-tab-page-changed.
2.  Defect.....87302
    Signoff....Wei Zhang   03-MAY-2005
    Problems...Cannot use flaslight in COPY FROM box when trying to copy proposal.
    Fix........Problem does not exist in Internet Native environment.
3.  Defect.....87303
    Signoff....Wei Zhang   03-MAY-2005
    Problems...In FOMPROF, user has Master Fund = Query + Post, Master Org = None. In FOMUSOR,
               user has Both (Query + Post) to the necessary Org for the proposal. 
               1.  FOMPROF - set up user with Master Fund, No authority for ORG.
               2.  FOMUSOR - set up user with Both post and query is specific org.
               3.  FRAPROP - Create new proposal using org set up in FOMUSOR.
               4.  Save
               5.  Exit FRAPROP and reenter - type in a new Prop code
               6.  Next Block
               7.  Click copy proposal from options.
               8.  Type in proposal just created by this user.
               9.  Error message 'User not authorized to query or post with entered organization.'
               When the user has rights to Master Org = Query + Post and then she could copy the proposal.
               Permissions for query and posting for an organization code should be sufficient for 
               a user to copy proposals with that organization.                
    Fix........Modify the block level trigger key-commit under copy_block.
               Modify the block level trigger KEY-CLRFRM.
               Modify the item level trigger post-text-item under frbprop_orgn_code_resp_office.
4.  Defect.....104447
    Signoff....Wei Zhang 08/02/2005
    Modify.....Modify form level triggers delete_FRRGUSN, delete_frvprst, 
               delete_frrgrpi, delete_locn, delete_text to replace the local call of the dynamic sql 
               to DBMS_SQL package with ordinary sql.  
               This is to remove all direct calls to this package as this is a recommendation from 
               Oracle and causes problems in some environments.
5.  Enhancement
    signoff....Wei Zhang 09/15/2005
    modigy.....Add logic to let user click "remove record" from menu twice to delete a record.
6.  Defect.....105881
    signoff....Wei Zhang 10/10/2005
    Problelm...On the Location Tab, there is no way to exit the form if the user chooses Enter Query
               and no FRRPLOC records exist for that proposal.  
               When Enter Query is chosen (using F7, the toolbar button or the menu option), the status
               message displayed is: "Enter a query; press F8 to execute, Ctrl+Q to Cancel." When the 
               user chooses to execute the query (using F8, the toolbar button, or the menu option), 
               the message displayed is: "FRM-40301: Query caused no records to be retrieved. Re-enter."
               Following normal procedure the user press the exit key to cancel the query the form still
               in query mode. There is no way to quite the query or exit the form.
    Modify.....Modify the form level trigger key-exit to use standard Banner key-exit logic to cancel
               query and exit form. 
                
AUDIT TRAIL END
</multilinecomment>

BEGIN
  NULL;
END;
	*/
	//ID:2732
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:2733
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
2. Defect.....1-5FMK4
   Signoff....Wei Zhang  26-APR-2006
   Problem....When clicking on the Calendar icon button for the Budget Start Date 
              and Expected Date the user got error: "*ERRORr* Date button is outside 
              the current block" and the calendar window did not show up.
   Fix........Rename button names from FRBPROP_BUDG_PRD_START_DATE_DB to 
              FRBPROP_BUDG_PRD_START_DAT_DBT, and from FRBPROP_EXPECTED_GRANT_DATE_DB
              to FRBPROP_EXPECTED_GRANT_DAT_DBT.
              In the FRBPROP block rename field names from FRBPROP_BUDG_PRD_START_DATE
              to FRBPROP_BUDG_PRD_START_DAT, and from FRBPROP_EXPECTED_GRANT_DATE to 
              FRBPROP_EXPECTED_GRANT_DAT.
              This change is to make sure the button names are not truncated due to 
              the 30 character name limitation. 
   
AUDIT TRAIL END  </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2734
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail72()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3
	
	PROCEDURE AUDIT_TRAIL_7_3 IS
<multilinecomment> AUDIT TRAIL: 7.3
1. Defect.....1-8KTK2
   Signoff....Saurabh Agrawal  26-JUL-2006
   Problem....The form returned the message "no records found", if the Responsible Organization code had been terminated.
              Agency cod ecan be updated to an inactive agency.
              Inconsistent behavior while validating organization, agency and CFDA code.
   Fix........Allow display of Proposal with terminated Organization (Defect # 1-8KTK2). 
              Agency code can be updated only to active agency
              Provide auto hint for terminated Organization, inactive Agency and CFDA code.
              Re-validate the Organization and the Agency when a commit is performed. 

2. Defect.....1-DL9B5
   Signoff....Saurabh Agrawal  01-AUG-2006
   Problem....The form is not populating the employee indicator on the personnel form for the first person added. 
              The workaround is to add it manually.  
              If mulitple personnel are added then after adding the second person do record back and the field will populate.
   Fix........Check whether the person is an employee and populate the field when the record is loaded.
              
AUDIT TRAIL END  </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2735
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail73()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_3_0_1
	
	PROCEDURE AUDIT_TRAIL_7_3_0_1 IS


 <multilinecomment> AUDIT TRAIL: 7.3.0.1
1. Defect.....CMS-DFCT100241 27-FEB-2007
   Signoff....Niraj Ramanathan
   Problem....FRAPROP has fields called CATEGORY,SUB-CATEGORY,STATUS and PROPOSAL TYPE which have item properties of 
              a max length 30.In the table FRBPROP, field lengths are defined as 1,4,2,2 respectively.  Causes an error 
              when trying to use any value more than the table value as defined in FTMSDAT.
   Fix........The max lenght of all the above mentioned fields were changed to match the max length in the table FRBPROP.
   		        There might be cases where the input value which is coming from FOQSDLV is greater than the specified lenght.
   		        To trap such cases, "ON-ERROR" trigger is added and a message is given to tell the user that the value
   		        chosen is greater than the specified max length.
   		         
2. Defect.....1-12RYE9 30-MAY-2007
   Signoff....Sivanath Peddakotla
   Problem....The issue is with the Copy feature not pulling the data into the proposal properly.  
              Steps to reproduce:When using the LOV on the Copy Proposal Information it does not 
              return the proposal selected in FPIPROP in the copy box, therefore it does not 
              populate the proposal form.  If you select copy proposal information again from options
              it will then have the proposal you selected and copy the information to the new proposal
              you are creating.  Banner 6 worked correctly.   		         
   Fix........The cursor is returning to Main window while the copy window is activated. 
              So The WHEN_WINDOW_ACTIVATED_TRG is modified to display the copy proposal window 
              when it is activated. Also the automatic skip property is set to 'No' for the 
              COPY_PROP_CODE field in the copy block
 </multilinecomment>
    
BEGIN
  NULL;
END;
	*/
	//ID:2736
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail7301()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE Audit_trail_8_0 IS
 <multilinecomment> AUDIT TRAIL: 8.0

    1. Defect......None
       Signoff..... Sivanath Peddakotla   26-Jun-2007
       Problem.....Migration of 7.3.0.1 defect to 8.0.
       
  AUDIT TRAIL END </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2737
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
2. Signoff......... Sivanath Peddakotla 02/11/2007
   Defect.......1-2YG8KX 
   Problem...... Agency window EDIT_SPRADDR trigger error
   Fix... The address fileds maximum length was increased to match the database length.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:2738
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_SDE
	
	PROCEDURE AUDIT_TRAIL_8_0_SDE IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 SDE 
1. Michael Hitrik  06/29/2007
   This form has been modified to change W-N-R-I Execution Hierarchy to AFTER 
   to support SDE requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:2739
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80Sde()
		{
		}

	
	/* Original PL/SQL code for Prog Unit F_FRRPRPI_EXISTS
	
	FUNCTION f_frrprpi_exists
RETURN BOOLEAN IS
  v_temp varchar2(1);
 	cursor check_exists is 
  select 'X'
 	 from frrprpi
   where frrprpi_prop_code = :frbprop_code;
begin
 	open check_exists;
 	fetch check_exists into v_temp;
 	if check_exists%found then 
 		return TRUE;
 	else
 		return FALSE;
  end if;
 end;
	*/
	//ID:2740
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool fFrrprpiExists(FrbpropAdapter frbpropElement)
		{
			int rowCount = 0;
			NString vTemp= NString.getNull();
			String sqlcheckExists = "SELECT 'X' " +
	" FROM frrprpi " +
	" WHERE frrprpi_prop_code = :FRBPROP_CODE ";
			DataCursor checkExists = new DataCursor(sqlcheckExists);
			try {
				//Setting query parameters
				checkExists.addParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkExists.
				checkExists.open();
				ResultSet checkExistsResults = checkExists.fetchInto();
				if ( checkExistsResults != null ) {
					vTemp = checkExistsResults.getStr(0);
				}
				if ( checkExists.found() )
				{
					return  toBool(NBool.True);
				}
				else {
					return  toBool(NBool.False);
				}
				}finally{
					checkExists.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_0_1
	
	PROCEDURE AUDIT_TRAIL_8_0_0_1 IS
<multilinecomment>
AUDIT TRAIL: 8.0.0.1
1. Defect....1-3Z3IN0 Migration of defect 1-3FACG6 
   Signoff...Handerso  10-SEP-2008
   Problem...Unable to get to Personnel tab on FRAPROP in query mode
   Fix.......Do not force commit and clear without validation in query mode. 
AUDIT TRAIL END
</multilinecomment>   
BEGIN
  NULL;
END;
	*/
	//ID:2741
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8001()
		{
		}

	
	/* Original PL/SQL code for Prog Unit F_FRBPROF_ORGN_SEC_IND
	
	FUNCTION f_frbprof_orgn_sec_ind RETURN VARCHAR2 IS
     lv_return  fobprof.FOBPROF_MASTER_ORGN_IND%type;
     CURSOR get_orgn_sec_ind IS
         SELECT FOBPROF_MASTER_ORGN_IND
         FROM   FOBPROF
         WHERE  FOBPROF_USER_ID = :CURRENT_USER1;          

   BEGIN
      OPEN get_orgn_sec_ind;
      FETCH get_orgn_sec_ind INTO lv_return;
      return lv_return;
   END ;
	*/
	//ID:2742
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fFrbprofOrgnSecInd()
		{
			int rowCount = 0;
			NString lvReturn= NString.getNull();
			String sqlgetOrgnSecInd = "SELECT FOBPROF_MASTER_ORGN_IND " +
	" FROM FOBPROF " +
	" WHERE FOBPROF_USER_ID = :CURRENT_USER1 ";
			DataCursor getOrgnSecInd = new DataCursor(sqlgetOrgnSecInd);
			try {
				//Setting query parameters
				getOrgnSecInd.addParameter("CURRENT_USER1", getFormModel().getFormHeader().getCurrentUser1());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable getOrgnSecInd.
				getOrgnSecInd.open();
				ResultSet getOrgnSecIndResults = getOrgnSecInd.fetchInto();
				if ( getOrgnSecIndResults != null ) {
					lvReturn = getOrgnSecIndResults.getStr(0);
				}
				return lvReturn;
				}finally{
					getOrgnSecInd.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment>
AUDIT TRAIL: 8.1
1. Change release number to 8.1   HTA 10/08/2008
 
AUDIT TRAIL END
</multilinecomment>   
BEGIN
  NULL;
END;
	*/
	//ID:2743
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>
AUDIT TRAIL: 8.2
1. For EPM, create new tab page Opportunity   HTA 10/22/2008 
AUDIT TRAIL END
</multilinecomment>   
BEGIN
  NULL;
END;
	*/
	//ID:2744
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3
	
	PROCEDURE AUDIT_TRAIL_8_3 IS
<multilinecomment>
AUDIT TRAIL: 8.3
1. Removed the  tab page Opportunity, previously created for EPM
   SIGNOFF...Gopinath Thulasidoss  03/20/2009 

2. Lan Nguyen 04/03/2009
   RPE# 1-4US9HN - Expose I8N Fields.
   Items frbprop.address_house_number, frbprop.address_line_4, 
   and frbprop.ctry_code_phone are added; triggers clr_addr and edit_spraddr 
   are modified. 
   
3. Defect.....1-3V2XSE
   Signoff....Ravikumar Beli  04/09/2009
   Problem....It was allowing to add invalid address type in proposal agency tab.
   Fix........Modified EDIT_SPRADDR trigger to fetch active addresses type and seqence number 
   						combination from SPRADDR table and modified POST-CHANGE triiger of 
   						FRBPROP_AGENCY_ADDR_CODE in FRBPROP block to fetch active address type.
   						
4. Defect.....1-3V2XSE
   Signoff....Ravikumar Beli  04/16/2009
   Problem....It was stopping at address type not allowing to navigate to sequence number to 
              select other possible sequence number with valid address type.
   Fix........Modified POST-CHANGE triiger of FRBPROP_AGENCY_ADDR_CODE in FRBPROP block, this will allow to 
              navigate from address type to sequence number to select other possible sequence number with 
              valid address type.  
               						
4. Signoff...Ravikumar Beli  13-MAY-2009
	 Defect....1-3A506F (ISC)
   Problem...Main tab, lots of lables out of alignment. The Alternate Description does not align 
						 correctly in translation, as we don't change any co-ordinates for translation, 
						 I assume the label uses spaces to be aligned correctly  in English. The Long Title 
						 lable also displays a little to the right compared to other labels in that same block.
   Fix.......Modified Promt Display Style, Justification,Attachment and Alignment in property palette 
   					 for all left labels for Main tab.  

   
AUDIT TRAIL END
</multilinecomment>   
BEGIN
  NULL;
END;
	*/
	//ID:2745
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail83()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : FRAPROP
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Wed Jul 31 08:08:49 2013
-- MSGSIGN : #4b07d1bad4004b06
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:2746
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment>
AUDIT TRAIL: 8.4
1. Defect#.....1-2HW7BA
   Signoff.....Gopinath Thulasidoss   19-Aug-2009
   Problem.....I created a new proposal yesterday with a valid org code.  After completing the proposal, 
               I terminated the org code (with term date = yesterday's date).  After terminating the org, 
               I was able to view the proposal and make changes (yesterday).  No invalid org message was 
               displayed. Today, I am able to view the org, but additional windows on the grant do not 
               display information.
   Fix:........Modified triggers EDIT_ORGN_CODE, EDIT_ORGN_CODE_FRRPRPI. Changed the cursor PTI_CURSOR, 
               instead of sysdate comparison in the where clause, included 
               NVL(:FRBPROP_PROJECT_START_DATE,SYSDATE).
2. Defect#.....1-1BCKEW
   Signoff.....Pradeep Kumar Mallapuram    19-Aug-2009
   Problem.....Alignment issues reported during test because unused (hidden)
               GUI text has not been removed.
   Fix.........Remove unwanted/hidden GUI text items which are available under FRAPROP_1_CANVAS.
3. Defect#.....1-1A1JGI
   Signoff.....Maneesh Mohan  24-Sep-2009
   Problem.....1 or 2 letter abbreviations not translatable and probably used in logic.
   Fix.........Added items FRBPROP_PROPOSAL_DESC, FRBPROP_CATEGORY_DESC, FRBPROP_SUB_CAT_DESC for displaying descriptions. Converted the items PHONE_EXISTS, 
               FRRPRPI_EMPLOYEE_IND to check box items. Modified triggers FRBPROP_PROPOSAL_TYPE.WHEN-VALIDATE-ITEM, 
               FRBPROP_CATEGORY.WHEN-VALIDATE-ITEM, FRBPROP_SUB_CATEGORY.WHEN-VALIDATE-ITEM and FRBPROP.POST-QUERY.
               Modified KEY-LISTVAL trigger of items FRBPROP_PROPOSAL_TYPE, FRBPROP_CATEGORY, FRBPROP_SUB_CATEGORY, 
               FRBPROP_ORGN_CODE_RESP_OFFICE, FRBPROP_STATUS_CODE & FRBPROP_CFDA_CODE for fixing navigation and selection problem.               
4. Defect#.....1-1BCKGS
   Signoff.....Maneesh Mohan 12-Oct-2009
   Problem.....Prompts should be aligned relative to the field, otherwise it dramatically increases costs at 
               translation/testing time for all languages, even more so in Arabic (right to left writing).  
   Fix.........Corrected the wrongly aligned prompt alignment properties for items under canvas FFRAPROP_1_TAB_CANVAS.             
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2747
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_0_1
	
	PROCEDURE AUDIT_TRAIL_8_4_0_1 IS
<multilinecomment>
AUDIT TRAIL: 8.4.0.1
1. Defect#.....1-AX6K02
   Signoff.....Maneesh Mohan  23-Feb-2010
   Problem.....Data not auto populating  and error in Personnel block of FRAPROP..
   Fix:........Modified the property "Check Box Mapping of Other Values" for item 
               FRRPRPI_EMPLOYEE_IND to "Unchecked" for handling NULL values.
            
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2748
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
                new proposal.
                Added new item NEXT_DOC_NUM in FORM_HEADER block to store the
                keyword returned by the DB function.
                Modified WHEN_NEW_BLOCK_INSTANCE_TRG and KEY-CLRFRM triggers
                to store keyword returned by DB function in NEXT_DOC_NUM and set the 
                hint text for Proposal Code item.
                Below listed  triggers are modified to replace the 
                hard coded value NEXT with NEXT_DOC_NUM item which stores 
                keyword to generate new Proposal Code:
                PRE-INSERT (FRBPROP block level)
                POST-CHANGE (FRBPROP.FRBPROP_ORGN_CODE_RESP_OFFICE item level)
               
                Modified WHERE clause property of FRBPROP block and where clause of 
                sql query in SELECT_FRBPROP_1 function to exclude duplication validation 
                if user enters keyword in the key block.
              
AUDIT TRAIL END
</multilinecomment>  
BEGIN
	NULL; 
END;
	*/
	//ID:2749
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
                1. Removed the subclassing on fields 'FRBPROP_ORGN_CODE_RESP_OFFICE' and 'FRRPRPI_ORGN_CODE'; 
                   modified the property 'Case Restriction' to 'Upper' for both fields.

                2. Added two new itemS 'ORG_VALIDATE_FLAG' and 'ORG_P_VALIDATE_FLAG' in FORM_HEADER block and 
                   modified the form level triggers 'RE_EDIT' and 'EDIT_ORGN_CODE' to skip validation errors with 
                   terminated or inactive organizations in query mode and in case of data entry with a terminated 
                   organization, to show a warning message with Yes/No buttons so that the user can bypass the 
                   validation error if required. Removed unwanted trigger calls to the organization vaidation trigger 
                   in 'WHEN-NEW-ITEM-INSTANCE' trigger of item FRBPROP_ORGN_CODE_RESP_OFFICE. 
                   Also, modified the trigger EDIT_ORGN_CODE_FRRGRPI that validates the personnel organization code same 
                   like the Responsible Organization code validation. 

                3. Created a new form level validation trigger 'EDIT_PERSON_ID' that should be called from the form level 
                   trigger 'RE_EDIT'. This validation forces the user to provide value for ID field in Personnel tab and there 
                   by avoids the unhandled Oracle exception while trying to save the  Personnel information with ID field NULL, 
                   which is a required field in database.                
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:2750
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
2. Defect.......1-LP0QEC
   Signoff......Maneesh Mohan  14-Oct-2011
   Problem......The Proposal Maintenance form FRAPROP will not allow removal of the CFDA number.
   Fix..........Modified the WHEN-VALIDATE-ITEM trigger for item FRBPROP.FRBPROP_CFDA_CODE to NULL the
                database item :frbprop_cfda_internal_id_no when the user removes the CFDA code.                
AUDIT TRAIL END
</multilinecomment>  
BEGIN
	NULL; 
END;

	*/
	//ID:2751
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
   Fix..........Modified the triggers EDIT_ORGN_CODE and EDIT_ORGN_CODE_FRRPRPI to fetch the title for Responsible 
                Organization and the Organization in personal tab respectively in case of terminated organizations.
AUDIT TRAIL END
</multilinecomment>  
BEGIN
	NULL; 
END;
	*/
	//ID:2752
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
	//ID:2753
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_9
	
	PROCEDURE AUDIT_TRAIL_8_9 IS
<multilinecomment> 
AUDIT TRAIL: 8.9

1. RPE#..........1-19V7ZZD
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
										FRRPRPT.FRRPRPT_SPONSOR_ID.KEY-NEXT-ITEM
										FRRPRPT.FRRPRPT_FEDERAL_FUND_PERCENT.KEY-NEXT-ITEM
									
								 Also, modified all the occurances of the word "Agent" in validation messages to "Agency" in the below triggers:
										GET_PASS_THRU_DETAILS 
										FRBPROP.DISPLAY_PASS_THRU_IND.WHEN-CHECKBOX-CHANGED
AUDIT TRAIL END
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:2754
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail89()
		{
		}

	
	

}
