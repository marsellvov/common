package net.hedtech.general.common.libraries.Poqrpls;



import morphis.foundations.core.appsupportlib.runtime.AbstractLibrary;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.configuration.LibraryConfiguration;
 



import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.DbTypes;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.addListElement;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.Pdklibs.ListArrayTypeRow;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;


public class PoqrplsServices extends AbstractLibrary{
		
	public PoqrplsServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
	
	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_STVSCHD_RG
	/*
	PROCEDURE POPULATE_STVSCHD_RG IS
   RG_LOGIC VARCHAR2(500) := 'select stvschd_code, stvschd_desc, to_char(STVSCHD_ACTIVITY_DATE,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from stvschd order by stvschd_code ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.STUSYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('POQRPLS-0043', 'LIB','*WARNING* BANNER Student is not installed.') );
      RETURN;
   END IF;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('STVSCHD_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0044', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateStvschdRg() {
			this.populateStvschdRg("act_date");
		}
		public void populateStvschdRg(String datealias)
		{
			NString rgLogic = toStr("select stvschd_code, stvschd_desc, to_char(STVSCHD_ACTIVITY_DATE,'").append(GDate.getNlsDateFormat()).append("') ").append(datealias).append(" from stvschd order by stvschd_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.STUSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("POQRPLS-0043"), toStr("LIB"), toStr("*WARNING* BANNER Student is not installed.")));
				return ;
			}
			errorNumber = populateGroupWithQuery("STVSCHD_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0044"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_STVNIST_RG
	/*
	PROCEDURE POPULATE_STVNIST_RG IS
   RG_LOGIC VARCHAR2(500) := 'select stvnist_code, stvnist_desc, to_char(stvnist_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') act_date from stvnist order by stvnist_code ';

   ERROR_NUMBER NUMBER;

 BEGIN
   IF NAME_IN('GLOBAL.STUSYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('POQRPLS-0041', 'LIB','*WARNING* BANNER Student is not installed.') );
      RETURN;
   END IF;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('STVNIST_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0042', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateStvnistRg()
		{
			populateStvnistRg("act_date");
		}
		
		public void populateStvnistRg(String datealias)
		{
			NString rgLogic = toStr("select stvnist_code, stvnist_desc, to_char(STVNIST_ACTIVITY_DATE,'").append(GDate.getNlsDateFormat()).append("') ").append(datealias).append(" from stvnist order by stvnist_code ");
			NNumber errorNumber= NNumber.getNull();
			if ( getNameIn("GLOBAL.STUSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("POQRPLS-0041"), toStr("LIB"), toStr("*WARNING* BANNER Student is not installed.")));
				return ;
			}
			errorNumber = populateGroupWithQuery("STVNIST_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0042"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PXRRBOX_RG
	/*
	PROCEDURE populate_pxrrbox_rg(field_name IN VARCHAR2) IS
  value_of_field VARCHAR2(100) := NAME_IN(field_name);
  rg_logic       VARCHAR2(500) := 'SELECT pxrrbox_code, pxrrbox_desc, to_char(pxrrbox_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') pxrrbox_activity_date from pxrrbox ';
  where_stmt     VARCHAR2(200) := 'WHERE pxrrbox_rept_code = ';
  order_by       VARCHAR2(200) := ' ORDER BY pxrrbox_code';
  error_number   NUMBER;
BEGIN
  rg_logic := rg_logic||where_stmt||''''||value_of_field||''''||order_by;
  error_number := POPULATE_GROUP_WITH_QUERY('PXRRBOX_RG',rg_logic);
  IF error_number <> 0 THEN
    MESSAGE(G$_NLS.Get('POQRPLS-0040','LIB','Oracle Error %01%',TO_CHAR(error_number)));
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePxrrboxRg(NString fieldName)
		{
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("SELECT pxrrbox_code, pxrrbox_desc, to_char(pxrrbox_activity_date,'").append(GDate.getNlsDateFormat()).append("') pxrrbox_activity_date from pxrrbox ");
			NString whereStmt = toStr("WHERE pxrrbox_rept_code = ");
			NString orderBy = toStr(" ORDER BY pxrrbox_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PXRRBOX_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0040"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PTRECRC_RG
	/*
	PROCEDURE POPULATE_PTRECRC_RG IS

   RG_LOGIC VARCHAR2(500) := 'SELECT DISTINCT PTRECRC_COAS_CODE,FTVCOAS_TITLE FROM FTVCOAS,PTRECRC WHERE PTRECRC_COAS_CODE = FTVCOAS_COAS_CODE ORDER BY PTRECRC_COAS_CODE';

   ERROR_NUMBER NUMBER;

 BEGIN
   -- Check if Finance is installed and if not, exit.
   IF NAME_IN('GLOBAL.FINSYS') <> 'Y' THEN
      MESSAGE( G$_NLS.Get('POQRPLS-0038', 'LIB','*WARNING* BANNER Finance is not installed.') );
      RETURN;
   END IF;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTRECRC_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0039', 'LIB','Oracle Error %01%', to_char(error_number)));
   END IF;
 
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePtrecrcRg()
		{
			NString rgLogic = toStr("SELECT DISTINCT PTRECRC_COAS_CODE,FTVCOAS_TITLE FROM FTVCOAS,PTRECRC WHERE PTRECRC_COAS_CODE = FTVCOAS_COAS_CODE ORDER BY PTRECRC_COAS_CODE");
			NNumber errorNumber= NNumber.getNull();
			//  Check if Finance is installed and if not, exit.
			if ( getNameIn("GLOBAL.FINSYS").notEquals("Y") )
			{
				warningMessage(GNls.Fget(toStr("POQRPLS-0038"), toStr("LIB"), toStr("*WARNING* BANNER Finance is not installed.")));
				return ;
			}
			errorNumber = populateGroupWithQuery("PTRECRC_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0039"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PTQLCAT_RG
	/*
	PROCEDURE POPULATE_PTQLCAT_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(3) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select ptrlvas_leav_code, ptrleav_long_desc,
       to_char(ptrlvas_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ptrlvas_activity_date 
       from ptrlvas, ptrleav ';
   WHERE_STMT VARCHAR2(200) := 'WHERE ptrlvas_leav_code = ptrleav_code 
       and ptrlvas_lcat_code =  ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY ptrlvas_leav_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQLCAT_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0037', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePtqlcatRg(NString fieldName)
		{
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select ptrlvas_leav_code, ptrleav_long_desc,\n       to_char(ptrlvas_activity_date,'").append(GDate.getNlsDateFormat()).append("') ptrlvas_activity_date \n       from ptrlvas, ptrleav ");
			NString whereStmt = toStr("WHERE ptrlvas_leav_code = ptrleav_code \n       and ptrlvas_lcat_code =  ");
			NString orderBy = toStr("ORDER BY ptrlvas_leav_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PTQLCAT_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0037"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PTQHSIP_RG
	/*
	PROCEDURE POPULATE_PTQHSIP_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(3) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select perhsip_seq_no, spriden_id, spriden_last_name, spriden_first_name, spriden_mi, perhsip_hspc_code, ptvhspc_desc from spriden, ptvhspc, perhsip ';
   WHERE_STMT VARCHAR2(200) := 'WHERE spriden_pidm = perhsip_pidm and spriden_change_ind = ''N'' and ptvhspc_code = perhsip_hspc_code and perhsip_hsin_no = ';
    ORDER_BY VARCHAR2(200) := 'ORDER BY perhsip_seq_no '; 

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQHSIP_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0036', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePtqhsipRg(NString fieldName)
		{
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select perhsip_seq_no, spriden_id, spriden_last_name, spriden_first_name, spriden_mi, perhsip_hspc_code, ptvhspc_desc from spriden, ptvhspc, perhsip ");
			NString whereStmt = toStr("WHERE spriden_pidm = perhsip_pidm and spriden_change_ind = 'N' and ptvhspc_code = perhsip_hspc_code and perhsip_hsin_no = ");
			NString orderBy = toStr("ORDER BY perhsip_seq_no ");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PTQHSIP_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0036"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PTQFBCT_RG
	/*
	PROCEDURE POPULATE_PTQFBCT_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(3) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select ptrbcdn_bdca_code, ptrbdca_long_desc, ptrbcdn_req_ind, ptrbcdn_setup_ind,
       to_char(ptrbcdn_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ptrbcdn_activity_date 
       from ptrbdca, ptrbcdn';
   WHERE_STMT VARCHAR2(200) := ' WHERE ptrbdca_code = ptrbcdn_bdca_code and ptrbcdn_bcat_code =  ';
   WHERE_STMT2 VARCHAR2(200) := ' and ptrbcdn_bdca_code in (select ptrfben_bdca_code from ptrfben)';
   ORDER_BY VARCHAR2(200) := ' ORDER BY ptrbcdn_bdca_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||WHERE_STMT2||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQFBCT_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0035', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePtqfbctRg(NString fieldName)
		{
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select ptrbcdn_bdca_code, ptrbdca_long_desc, ptrbcdn_req_ind, ptrbcdn_setup_ind,\n       to_char(ptrbcdn_activity_date,'").append(GDate.getNlsDateFormat()).append("') ptrbcdn_activity_date \n       from ptrbdca, ptrbcdn");
			NString whereStmt = toStr(" WHERE ptrbdca_code = ptrbcdn_bdca_code and ptrbcdn_bcat_code =  ");
			NString whereStmt2 = toStr(" and ptrbcdn_bdca_code in (select ptrfben_bdca_code from ptrfben)");
			NString orderBy = toStr(" ORDER BY ptrbcdn_bdca_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(whereStmt2).append(orderBy);
			errorNumber = populateGroupWithQuery("PTQFBCT_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0035"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}
		
		
		//MORPHIS TODO: ELLBHR-10885
		public void populatePtqfbctRg(NString fieldName,NString alias1)
		{
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select ptrbcdn_bdca_code, ptrbdca_long_desc, ptrbcdn_req_ind, ptrbcdn_setup_ind,\n       to_char(ptrbcdn_activity_date,'").append(GDate.getNlsDateFormat()).append("')").append(alias1).append(" \n  from ptrbdca, ptrbcdn");
			NString whereStmt = toStr(" WHERE ptrbdca_code = ptrbcdn_bdca_code and ptrbcdn_bcat_code =  ");
			NString whereStmt2 = toStr(" and ptrbcdn_bdca_code in (select ptrfben_bdca_code from ptrfben)");
			NString orderBy = toStr(" ORDER BY ptrbcdn_bdca_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(whereStmt2).append(orderBy);
			errorNumber = populateGroupWithQuery("PTQFBCT_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0035"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}
		

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PTQECLC_RG
	/*
	PROCEDURE POPULATE_PTQECLC_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(3) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select ptreclc_lcat_code, ptvlcat_desc,
       to_char(ptreclc_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ptreclc_activity_date  
       from ptreclc, ptvlcat ';
   WHERE_STMT VARCHAR2(200) := 'WHERE ptreclc_lcat_code = ptvlcat_code 
       and ptreclc_code =  ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY ptreclc_lcat_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQECLC_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0034', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePtqeclcRg(NString fieldName)
		{
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select ptreclc_lcat_code, ptvlcat_desc,\n       to_char(ptreclc_activity_date,'").append(GDate.getNlsDateFormat()).append("') ptreclc_activity_date  \n       from ptreclc, ptvlcat ");
			NString whereStmt = toStr("WHERE ptreclc_lcat_code = ptvlcat_code \n       and ptreclc_code =  ");
			NString orderBy = toStr("ORDER BY ptreclc_lcat_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PTQECLC_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0034"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PTQECBC_RG
	/*
	PROCEDURE POPULATE_PTQECBC_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(3) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select ptrecbc_bcat_code, ptrbcat_desc,
       to_char(ptrecbc_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') ptrecbc_activity_date
       from ptrecbc, ptrbcat ';
   WHERE_STMT VARCHAR2(200) := 'WHERE ptrecbc_bcat_code = ptrbcat_code 
       and ptrecbc_code =  ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY ptrecbc_bcat_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQECBC_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0033', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePtqecbcRg(NString fieldName){
			populatePtqecbcRg(fieldName, "ptrecbc_activity_date");
		}
		public void populatePtqecbcRg(NString fieldName, String dateAlias)
		{
	
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select ptrecbc_bcat_code, ptrbcat_desc,\n       to_char(ptrecbc_activity_date,'").append(GDate.getNlsDateFormat()).append("') ").append(dateAlias).append("\n       from ptrecbc, ptrbcat ");
			NString whereStmt = toStr("WHERE ptrecbc_bcat_code = ptrbcat_code \n       and ptrecbc_code =  ");
			NString orderBy = toStr("ORDER BY ptrecbc_bcat_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PTQECBC_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0033"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}

		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PTQBDCG_RG
	/*
	PROCEDURE POPULATE_PTQBDCG_RG (FIELD_NAME IN VARCHAR2) IS

VALUE_OF_FIELD VARCHAR2(2) := NAME_IN(FIELD_NAME); 
RG_LOGIC VARCHAR2(1000) := 'SELECT distinct ptrbcdn_bdca_code,ptrbdca_long_desc,
														to_char(ptrbdca_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''')
                           FROM ptrbcdn,ptrbdca,ptrbdcg ';
WHERE_STMT VARCHAR2(200) := 'WHERE ptrbcdn_bdca_code = ptrbdcg_bdca_code 
                             AND ptrbcdn_bdca_code = ptrbdca_code 
                             AND ptrbcdn_bcat_code = ';
ORDER_BY VARCHAR2(200) := 'ORDER BY ptrbcdn_bdca_code';

ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PTQBDCG_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0032', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePtqbdcgRg(NString fieldName)
		{
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("SELECT distinct ptrbcdn_bdca_code,ptrbdca_long_desc,\n														to_char(ptrbdca_activity_date,'").append(GDate.getNlsDateFormat()).append("') ptrbdca_activity_date\n                           FROM ptrbcdn,ptrbdca,ptrbdcg ");
			NString whereStmt = toStr("WHERE ptrbcdn_bdca_code = ptrbdcg_bdca_code \n                             AND ptrbcdn_bdca_code = ptrbdca_code \n                             AND ptrbcdn_bcat_code = ");
			NString orderBy = toStr("ORDER BY ptrbcdn_bdca_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PTQBDCG_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0032"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PEQLBAL_RG
	/*
	PROCEDURE POPULATE_PEQLBAL_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(8) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select perleav_leav_code, ptrleav_long_desc, ((perleav_begin_balance)+(perleav_accrued)-(perleav_taken)) cur_avail, perleav_accrued, perleav_hrs_banked, perleav_taken, perleav_begin_balance, to_char(perleav_activity_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') perleav_activity_date from perleav,ptrleav ';
   WHERE_STMT VARCHAR2(200) := 'WHERE ptrleav_code = perleav_leav_code and perleav_pidm = ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY perleav_leav_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PEQLBAL_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE( G$_NLS.Get('POQRPLS-0031', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePeqlbalRg(NString fieldName)
		{
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select perleav_leav_code, ptrleav_long_desc, ((perleav_begin_balance)+(perleav_accrued)-(perleav_taken)) cur_avail, perleav_accrued, perleav_hrs_banked, perleav_taken, perleav_begin_balance, to_char(perleav_activity_date,'").append(GDate.getNlsDateFormat()).append("') perleav_activity_date from perleav,ptrleav ");
			NString whereStmt = toStr("WHERE ptrleav_code = perleav_leav_code and perleav_pidm = ");
			NString orderBy = toStr("ORDER BY perleav_leav_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PEQLBAL_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0031"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PEQJLEV_RG
	/*
	PROCEDURE POPULATE_PEQJLEV_RG IS
   RG_LOGIC VARCHAR2(500) := 'select pevjlev_leav_code, ptrleav_long_desc, pevjlev_avail_balance, pevjlev_accrued, pevjlev_hrs_banked, pevjlev_taken, pevjlev_begin_balance from pevjlev,ptrleav ';
   WHERE_STMT VARCHAR2(200) := 'WHERE ptrleav_code = pevjlev_leav_code ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY pevjlev_leav_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PEQJLEV_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE( G$_NLS.Get('POQRPLS-0030', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePeqjlevRg()
		{
			NString rgLogic = toStr("select pevjlev_leav_code, ptrleav_long_desc, pevjlev_avail_balance, pevjlev_accrued, pevjlev_hrs_banked, pevjlev_taken, pevjlev_begin_balance from pevjlev,ptrleav ");
			NString whereStmt = toStr("WHERE ptrleav_code = pevjlev_leav_code ");
			NString orderBy = toStr("ORDER BY pevjlev_leav_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append(orderBy);
			errorNumber = populateGroupWithQuery("PEQJLEV_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0030"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PEQJFAC_RG
	/*
	PROCEDURE POPULATE_PEQJFAC_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD VARCHAR2(6) := NAME_IN(FIELD_NAME);
   RG_LOGIC VARCHAR2(500) := 'select to_char(pevjfac_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') pevjfac_date from pevjfac ';
   WHERE_STMT VARCHAR2(500) := 'WHERE pevjfac_posn = ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY to_date(pevjfac_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') desc';

   ERROR_NUMBER NUMBER;

BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PEQJFAC_RG',RG_LOGIC);
   IF ERROR_NUMBER = 1403 THEN
      MESSAGE( G$_NLS.Get('POQRPLS-0028', 'LIB','*WARNING* No records exist for this position.') );
   ELSE
      IF ERROR_NUMBER <> 0 THEN
         MESSAGE( G$_NLS.Get('POQRPLS-0029', 'LIB',
	'*ERROR* Unable to populate record group PEQJFAC_RG. Oracle Error %01%' 
	, to_char(error_number)));
      END IF;
   END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePeqjfacRg(NString fieldName)
		{
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select to_char(pevjfac_date,'").append(GDate.getNlsDateFormat()).append("') pevjfac_date from pevjfac ");
			NString whereStmt = toStr("WHERE pevjfac_posn = ");
			NString orderBy = toStr("ORDER BY to_date(pevjfac_date,'").append(GDate.getNlsDateFormat()).append("') desc");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PEQJFAC_RG", rgLogic);
			if ( errorNumber.equals(1403) )
			{
				warningMessage(GNls.Fget(toStr("POQRPLS-0028"), toStr("LIB"), toStr("*WARNING* No records exist for this position.")));
			}
			else {
				if ( errorNumber.notEquals(0) )
				{
					errorMessage(GNls.Fget(toStr("POQRPLS-0029"), toStr("LIB"), toStr("*ERROR* Unable to populate record group PEQJFAC_RG. Oracle Error %01%"), toChar(errorNumber)));
				}
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PEQELEV_RG
	/*
	PROCEDURE POPULATE_PEQELEV_RG IS
   RG_LOGIC VARCHAR2(500) := 'select pevelev_leav_code, ptrleav_long_desc, pevelev_avail_balance, pevelev_accrued, pevelev_hrs_banked, pevelev_taken, pevelev_begin_balance from pevelev,ptrleav ';
   WHERE_STMT VARCHAR2(200) := 'WHERE ptrleav_code = pevelev_leav_code ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY pevelev_leav_code';

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PEQELEV_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE( G$_NLS.Get('POQRPLS-0027', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populatePeqelevRg()
		{
			NString rgLogic = toStr("select pevelev_leav_code, ptrleav_long_desc, pevelev_avail_balance, pevelev_accrued, pevelev_hrs_banked, pevelev_taken, pevelev_begin_balance from pevelev,ptrleav ");
			NString whereStmt = toStr("WHERE ptrleav_code = pevelev_leav_code ");
			NString orderBy = toStr("ORDER BY pevelev_leav_code");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append(orderBy);
			errorNumber = populateGroupWithQuery("PEQELEV_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0027"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_PCQDEDN_RG
	/*
	PROCEDURE POPULATE_PCQDEDN_RG(FIELD_NAME IN VARCHAR2) IS
   VALUE_OF_FIELD varchar2(8) := NAME_IN(FIELD_NAME);
   RG_LOGIC varchar2(2000) := 'select pcrdedn_cben_code, ptrbdca_long_desc, pcrdedn_plan, ptrbdpl_desc, to_char(pcrdedn_begin_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') pcrdedn_begin_date , to_char(pcrdedn_end_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') pcrdedn_end_date , ptrcben_total_cost from ptrcben, ptrbdpl, ptrbdca, pcrdedn ';
    WHERE_STMT varchar2(1000) := 'WHERE ptrcben_code = pcrdedn_cben_code '||
          'and NVL(ptrcben_plan,'' *'') = NVL(pcrdedn_plan,'' *'') '||
          'and ptrbdca_code = pcrdedn_cben_code '||
          'and ptrbdpl_code = pcrdedn_plan '||
          'and ptrbdpl_bdca_code = pcrdedn_cben_code '||
          'and ptrbdpl_effective_date =(select max(a.ptrbdpl_effective_date) '||
                                        ' from ptrbdpl a '||
                                       ' where a.ptrbdpl_bdca_code = pcrdedn_cben_code '||
					  'and a.ptrbdpl_code = pcrdedn_plan '||
                                          'and a.ptrbdpl_effective_date <= pcrdedn_begin_date) '||
          'and pcrdedn_pidm = ';
   ORDER_BY varchar2(100) := 'ORDER BY pcrdedn_cben_code, pcrdedn_begin_date';
   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('PCQDEDN_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE( G$_NLS.Get('POQRPLS-0026', 'LIB','*ERROR* Error populating Deduction List of Values.') );
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		*/
		public void populatePcqdednRg(NString fieldName){
			populatePcqdednRg(fieldName, "b_date", "e_date");
		}
		
		public void populatePcqdednRg(NString fieldName, String param1, String param2)
		{
			NString valueOfField = getNameIn(fieldName);
			NString rgLogic = toStr("select pcrdedn_cben_code, ptrbdca_long_desc, pcrdedn_plan, ptrbdpl_desc, to_char(pcrdedn_begin_date,'").append(GDate.getNlsDateFormat()).append("') ").append(param1).append(" , to_char(pcrdedn_end_date,'").append(GDate.getNlsDateFormat()).append("') ").append(param2).append(" , ptrcben_total_cost from ptrcben, ptrbdpl, ptrbdca, pcrdedn ");
			NString whereStmt = toStr("WHERE ptrcben_code = pcrdedn_cben_code ").append("and NVL(ptrcben_plan,' *') = NVL(pcrdedn_plan,' *') ").append("and ptrbdca_code = pcrdedn_cben_code ").append("and ptrbdpl_code = pcrdedn_plan ").append("and ptrbdpl_bdca_code = pcrdedn_cben_code ").append("and ptrbdpl_effective_date =(select max(a.ptrbdpl_effective_date) ").append(" from ptrbdpl a ").append(" where a.ptrbdpl_bdca_code = pcrdedn_cben_code ").append("and a.ptrbdpl_code = pcrdedn_plan ").append("and a.ptrbdpl_effective_date <= pcrdedn_begin_date) ").append("and pcrdedn_pidm = ");
			NString orderBy = toStr("ORDER BY pcrdedn_cben_code, pcrdedn_begin_date");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("PCQDEDN_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0026"), toStr("LIB"), toStr("*ERROR* Error populating Deduction List of Values.")));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_JACT_EFF_DATES_RG
	/*
	PROCEDURE POPULATE_JACT_EFF_DATES_RG(FIELD_NAME IN VARCHAR2,
                                     FIELD_NAME2 IN VARCHAR2,
                                     FIELD_NAME3 IN VARCHAR2) IS
  VALUE_OF_FIELD  VARCHAR2(8) := NAME_IN(FIELD_NAME);
  VALUE_OF_FIELD2 VARCHAR2(6) := NAME_IN(FIELD_NAME2);
  VALUE_OF_FIELD3 VARCHAR2(2) := NAME_IN(FIELD_NAME3);
   RG_LOGIC VARCHAR2(500) := 'select to_char(perjact_effective_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') from perjact ';
   WHERE_STMT VARCHAR2(200) := 'WHERE perjact_pidm = ';
   WHERE_STMT_2 VARCHAR2(200) := ' AND perjact_posn = ';
   WHERE_STMT_3 VARCHAR2(200) := ' AND perjact_suff = ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY perjact_effective_date desc';

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||
                         WHERE_STMT_2||''''||VALUE_OF_FIELD2||''''||
                         WHERE_STMT_3||''''||VALUE_OF_FIELD3||''''||ORDER_BY;

   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('DEDN_EFF_DATES_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0025', 'LIB',
	'Oracle Error %01%' 
	, to_char(error_number)));
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		* @param fieldName2
		* @param fieldName3
		*/
		public void populateJactEffDatesRg(NString fieldName, NString fieldName2, NString fieldName3)
		{
			NString valueOfField = getNameIn(fieldName);
			NString valueOfField2 = getNameIn(fieldName2);
			NString valueOfField3 = getNameIn(fieldName3);
			NString rgLogic = toStr("select to_char(perjact_effective_date,'").append(GDate.getNlsDateFormat()).append("') from perjact ");
			NString whereStmt = toStr("WHERE perjact_pidm = ");
			NString whereStmt2 = toStr(" AND perjact_posn = ");
			NString whereStmt3 = toStr(" AND perjact_suff = ");
			NString orderBy = toStr("ORDER BY perjact_effective_date desc");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(whereStmt2).append("'").append(valueOfField2).append("'").append(whereStmt3).append("'").append(valueOfField3).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("DEDN_EFF_DATES_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0025"), toStr("LIB"), toStr("Oracle Error %01%"), toChar(errorNumber)));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.POPULATE_DEDN_EFF_DATES_RG
	/*
	PROCEDURE POPULATE_DEDN_EFF_DATES_RG(FIELD_NAME IN VARCHAR2, FIELD_NAME2 IN VARCHAR2) IS
  VALUE_OF_FIELD  VARCHAR2(8) := NAME_IN(FIELD_NAME);
  VALUE_OF_FIELD2 VARCHAR2(3) := NAME_IN(FIELD_NAME2);
   RG_LOGIC VARCHAR2(500) := 'select to_char(pdrdedn_effective_date,'''||G$_DATE.GET_NLS_DATE_FORMAT||''') from pdrdedn ';
   WHERE_STMT VARCHAR2(200) := 'WHERE pdrdedn_pidm = ';
   WHERE_STMT_2 VARCHAR2(200) := ' AND pdrdedn_bdca_code = ';
   ORDER_BY VARCHAR2(200) := 'ORDER BY pdrdedn_effective_date desc';

   ERROR_NUMBER NUMBER;

 BEGIN
   RG_LOGIC := RG_LOGIC||WHERE_STMT||''''||VALUE_OF_FIELD||''''||WHERE_STMT_2||''''||VALUE_OF_FIELD2||''''||ORDER_BY;
   ERROR_NUMBER := POPULATE_GROUP_WITH_QUERY('DEDN_EFF_DATES_RG',RG_LOGIC);
   IF ERROR_NUMBER <> 0 THEN
      MESSAGE ( G$_NLS.Get('POQRPLS-0024', 'LIB','*Error* Error populating Effective Dates.') );
      RAISE FORM_TRIGGER_FAILURE;
      RETURN;
   END IF;
 END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fieldName
		* @param fieldName2
		*/
		public void populateDednEffDatesRg(NString fieldName, NString fieldName2)
		{
			NString valueOfField = getNameIn(fieldName);
			NString valueOfField2 = getNameIn(fieldName2);
			NString rgLogic = toStr("select to_char(pdrdedn_effective_date,'").append(GDate.getNlsDateFormat()).append("') from pdrdedn ");
			NString whereStmt = toStr("WHERE pdrdedn_pidm = ");
			NString whereStmt2 = toStr(" AND pdrdedn_bdca_code = ");
			NString orderBy = toStr("ORDER BY pdrdedn_effective_date desc");
			NNumber errorNumber= NNumber.getNull();
			rgLogic = rgLogic.append(whereStmt).append("'").append(valueOfField).append("'").append(whereStmt2).append("'").append(valueOfField2).append("'").append(orderBy);
			errorNumber = populateGroupWithQuery("DEDN_EFF_DATES_RG", rgLogic);
			if ( errorNumber.notEquals(0) )
			{
				errorMessage(GNls.Fget(toStr("POQRPLS-0024"), toStr("LIB"), toStr("*ERROR* Error populating Effective Dates.")));
				throw new ApplicationException();
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.P$_VALID_EMPLOYEE_ID
	/*
	PROCEDURE p$_valid_employee_id(
  p_pidm                   spriden.spriden_pidm%TYPE,
  p_check_employee_ind     VARCHAR2 DEFAULT 'Y',
  p_check_bio_info_ind     VARCHAR2 DEFAULT 'Y',
  p_check_citz_code_ind    VARCHAR2 DEFAULT 'Y',
  p_check_addr_info_ind    VARCHAR2 DEFAULT 'Y') IS
  --
  lv_employee_ind          VARCHAR2(1) := 'N';
  lv_error_code            gb_common_strings.err_type;

  CURSOR sel_employee_c IS
    SELECT 'Y'
    FROM   pebempl
    WHERE  pebempl_pidm = p_pidm;

  PROCEDURE p_do_validate_bio_info IS
  BEGIN
  	-- Validate minimal employee bio and address info
	  -- Check ID has minimal bio info
		IF (p_check_bio_info_ind = 'Y' ) THEN
			IF (pb_employee_rules.f_minimal_bio_info_exists(p_pidm, lv_error_code) = 'N')
		  AND NOT (p_check_citz_code_ind = 'N' AND lv_error_code = 'MISSING_CITZ_CODE') THEN
		    MESSAGE(pb_employee_strings.f_get_string(lv_error_code));
		    RAISE FORM_TRIGGER_FAILURE;
			END IF;
	  ELSE
		  IF  (p_check_citz_code_ind = 'Y') 
		  AND (pb_employee_rules.f_minimal_bio_info_exists(p_pidm, lv_error_code) = 'N')
		  AND (lv_error_code = 'MISSING_CITZ_CODE') THEN
		    MESSAGE(pb_employee_strings.f_get_string(lv_error_code));
		    RAISE FORM_TRIGGER_FAILURE;
			END IF;
		END IF;
		
		-- Check ID has minimal address info
		IF p_check_addr_info_ind = 'Y' THEN
			IF pb_employee_rules.f_minimal_addr_info_exists(p_pidm) = 'N' THEN
			  MESSAGE(pb_employee_strings.f_get_string('NO_ADDRESS'));
			  RAISE FORM_TRIGGER_FAILURE;
			END IF;	
		END IF;
	END;
BEGIN
  OPEN sel_employee_c;
  FETCH sel_employee_c INTO lv_employee_ind;
	CLOSE sel_employee_c;
	
	IF p_check_employee_ind = 'Y' AND lv_employee_ind = 'N' THEN
		-- Check ID is an employee
  	MESSAGE(G$_NLS.Get('POQRPLS-0023', 'LIB', '*ERROR* Person is not defined as an employee on the PEAEMPL form.'));
  	RAISE FORM_TRIGGER_FAILURE;
	END IF;

  IF lv_employee_ind = 'Y' OR p_check_employee_ind = 'N' THEN
    p_do_validate_bio_info;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pPidm
		*/
		public void pValidEmployeeId(NNumber pPidm) {
			pValidEmployeeId(pPidm, toStr("Y"), toStr("Y"), toStr("Y"), toStr("Y"));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pPidm
		* @param pCheckEmployeeInd
		*/
		public void pValidEmployeeId(NNumber pPidm, NString pCheckEmployeeInd) {
			pValidEmployeeId(pPidm, pCheckEmployeeInd, toStr("Y"), toStr("Y"), toStr("Y"));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pPidm
		* @param pCheckEmployeeInd
		* @param pCheckBioInfoInd
		*/
		public void pValidEmployeeId(NNumber pPidm, NString pCheckEmployeeInd, NString pCheckBioInfoInd) {
			pValidEmployeeId(pPidm, pCheckEmployeeInd, pCheckBioInfoInd, toStr("Y"), toStr("Y"));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pPidm
		* @param pCheckEmployeeInd
		* @param pCheckBioInfoInd
		* @param pCheckCitzCodeInd
		*/
		public void pValidEmployeeId(NNumber pPidm, NString pCheckEmployeeInd, NString pCheckBioInfoInd, NString pCheckCitzCodeInd) {
			pValidEmployeeId(pPidm, pCheckEmployeeInd, pCheckBioInfoInd, pCheckCitzCodeInd, toStr("Y"));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pPidm
		* @param pCheckEmployeeInd
		* @param pCheckBioInfoInd
		* @param pCheckCitzCodeInd
		* @param pCheckAddrInfoInd
		*/
		public void pValidEmployeeId(NNumber pPidm, NString pCheckEmployeeInd, NString pCheckBioInfoInd, NString pCheckCitzCodeInd, NString pCheckAddrInfoInd)
		{
			PValidEmployeeId_Local instance = new PValidEmployeeId_Local(pPidm, pCheckEmployeeInd, pCheckBioInfoInd, pCheckCitzCodeInd, pCheckAddrInfoInd);
			try {
				//Setting query parameters
				instance.selEmployeeC.addParameter("P_P_PIDM", instance.pPidm);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable selEmployeeC.
				instance.selEmployeeC.open();
				instance.selEmployeeCResults = instance.selEmployeeC.fetchInto();
				if ( instance.selEmployeeCResults != null ) {
					instance.lvEmployeeInd = instance.selEmployeeCResults.getStr(0);
				}
				instance.selEmployeeC.close();
				if ( instance.pCheckEmployeeInd.equals("Y") && instance.lvEmployeeInd.equals("N") )
				{
					//  Check ID is an employee
					errorMessage(GNls.Fget(toStr("POQRPLS-0023"), toStr("LIB"), toStr("*ERROR* Person is not defined as an employee on the PEAEMPL form.")));
					throw new ApplicationException();
				}
				if ( instance.lvEmployeeInd.equals("Y") || instance.pCheckEmployeeInd.equals("N") )
				{
					instance.pDoValidateBioInfo();
				}
				}finally{
					instance.selEmployeeC.close();
				}


			
		}
		
		private class PValidEmployeeId_Local {
			int rowCount = 0;
			NString lvEmployeeInd = toStr("N");
			NString lvErrorCode= NString.getNull();
			String sqlselEmployeeC = "SELECT 'Y' " +
	" FROM pebempl " +
	" WHERE pebempl_pidm = :P_P_PIDM ";
			DataCursor selEmployeeC = new DataCursor(sqlselEmployeeC);
			ResultSet selEmployeeCResults;
			
			NNumber pPidm;
			NString pCheckEmployeeInd;
			NString pCheckBioInfoInd;
			NString pCheckCitzCodeInd;
			NString pCheckAddrInfoInd;
			
			public PValidEmployeeId_Local (NNumber pPidm, NString pCheckEmployeeInd, NString pCheckBioInfoInd, NString pCheckCitzCodeInd, NString pCheckAddrInfoInd){
				this.pPidm = pPidm;
				this.pCheckEmployeeInd = pCheckEmployeeInd;
				this.pCheckBioInfoInd = pCheckBioInfoInd;
				this.pCheckCitzCodeInd = pCheckCitzCodeInd;
				this.pCheckAddrInfoInd = pCheckAddrInfoInd;
			}
	/* <p>
			* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
	/* </p>
			*/
			public void pDoValidateBioInfo()
			{
	
				//  Validate minimal employee bio and address info
				//  Check ID has minimal bio info
				if ((pCheckBioInfoInd.equals("Y")))
				{
					Ref<NString> lvErrorCodeRef = new Ref<NString>(lvErrorCode);
					if ( (PbEmployeeRules.fMinimalBioInfoExists(pPidm, lvErrorCodeRef).equals("N")) && !(pCheckCitzCodeInd.equals("N") && lvErrorCode.equals("MISSING_CITZ_CODE")) )
					{
						lvErrorCode = lvErrorCodeRef.val;
						errorMessage(PbEmployeeStrings.fGetString(lvErrorCode));
						throw new ApplicationException();
					}
				}
				else {
					Ref<NString> lvErrorCodeRef = new Ref<NString>(lvErrorCode);
					if ( (pCheckCitzCodeInd.equals("Y")) && (PbEmployeeRules.fMinimalBioInfoExists(pPidm, lvErrorCodeRef  ).equals("N")) && (lvErrorCode.equals("MISSING_CITZ_CODE")) )
					{
						lvErrorCode = lvErrorCodeRef.val;
						errorMessage(PbEmployeeStrings.fGetString(lvErrorCode));
						throw new ApplicationException();
					}
				}
				//  Check ID has minimal address info
				if ( pCheckAddrInfoInd.equals("Y") )
				{
					if ( PbEmployeeRules.fMinimalAddrInfoExists(pPidm).equals("N") )
					{
						errorMessage(PbEmployeeStrings.fGetString(toStr("NO_ADDRESS")));
						throw new ApplicationException();
					}
				}
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.P$_DO_SECURITY
	/*
	PROCEDURE P$_DO_SECURITY (PAR_PIDM      IN NUMBER,
                          PAR_EMPR_CODE IN VARCHAR2) IS
<multilinecomment> Parameters:
   PIDM      - Unique ID to check for access to this employee's data.
   EMPR_CODE - Specific employer code to check when this procedure is
               invoked from the forms which this code in their key
               blocks.
   Process Description:
   P$_DO_SECURITY checks BANNER HR security on forms with ID in the
   key block. It checks the security globals to see if any security
   is turned on. If yes, it gets the employee class, home organization
   fields from the Employee Table pebempl. If ID is not an employee,
   no security check is done.
   If the person is an employee, then it retrieves the maximum salary
   found in the Jobs Table nbrjobs, for the employee. Then it carries
   out each of the security checks - Salary, employee class,
   organization and employer.  It will carry out the employer security
   check, only if the employee has a job.                           </multilinecomment>
   <multilinecomment> Control data from PEBEMPL, NBRJOBS </multilinecomment>
   SECURITY_SALARY        NUMBER(11,2) ;
   SECURITY_ECLS_CODE     VARCHAR2(2) ;
   SECURITY_COAS_CODE     VARCHAR2(1) ;
   SECURITY_ORGN_CODE     VARCHAR2(6) ;
   CURSOR empl_info IS
      SELECT pebempl_ecls_code,
             pebempl_orgn_code_home,
             pebempl_coas_code_home
      FROM   pebempl
      WHERE  pebempl_pidm = PAR_PIDM ;
   CURSOR salary_info IS
      SELECT max(nbrjobs_ann_salary)
      FROM   nbrjobs
      WHERE  nbrjobs_pidm = PAR_PIDM;
   BEGIN
      IF NAME_IN('global.sala_security_ind') = 'Y'
      OR NAME_IN('global.ecls_security_ind') = 'Y'
      OR NAME_IN('global.orgn_security_ind') = 'Y'
      OR NAME_IN('global.empr_security_ind') = 'Y'
      THEN goto get_empl_info;
      ELSE return;
      END IF;
   << get_empl_info >>
      OPEN  empl_info;
      FETCH empl_info INTO security_ecls_code,
                           security_orgn_code,
                           security_coas_code ;
      IF empl_info%NOTFOUND THEN
         RETURN ;
      END IF ;
      OPEN  salary_info ;
      FETCH salary_info INTO security_salary ;
      <multilinecomment> Salary security block checks if the maximum salary for
         the employee in the KEY BLOCK is less than or equal to
         the salary level that the user can see, namely, the
         salary level set for the user on the PTRUSER form.  </multilinecomment>
      IF NAME_IN('global.sala_security_ind') = 'Y' AND security_salary IS NOT NULL
      THEN
         DECLARE
            USER_SALARY_TEMP      VARCHAR2(1) ;
            CURSOR USER_SALARY IS
               SELECT 'X'
               FROM   ptruser
               WHERE  ptruser_code = USER
               AND    security_salary <= ptruser_sala_level ;
         BEGIN
            OPEN USER_SALARY ;
            FETCH USER_SALARY INTO USER_SALARY_TEMP ;
            G$_CHECK_VALUE (USER_SALARY%NOTFOUND,
   G$_NLS.Get('POQRPLS-0018', 'LIB','*ERROR* Salary; You do not have Permission to see this Salary Level.') ,TRUE);
         END ;
      END IF ;
      <multilinecomment> Employee Class security check first checks if the user
         has master employee class privilege, i.e can see all
         employee classes. This is determined by the master ecls
         indicator on the PTRUSER form.  If not, then it checks
         to see if the Employee Class set up on the Employee Form
         for the ID in the key block, is in the access list set up
         for the user on the PSAECLS form.                      </multilinecomment>
      IF NAME_IN('global.ecls_security_ind') = 'Y' THEN
         DECLARE
            ECLS_TEMP     VARCHAR2(1) ;
            CURSOR ECLS_MASTER IS
               SELECT 'X'
               FROM   ptruser
               WHERE  ptruser_code = USER
               AND    ptruser_master_ecls_ind = 'Y' ;
            CURSOR ECLS_REPEATING IS
               SELECT 'X'
               FROM   psrecls
               WHERE  psrecls_user_code = USER
               AND    psrecls_ecls_code = security_ecls_code ;
         BEGIN
            OPEN ECLS_MASTER ;
            FETCH ECLS_MASTER INTO ECLS_TEMP ;
            IF ECLS_MASTER%NOTFOUND THEN
               GOTO DO_ECLS_REPEATING ;
            ELSE
               GOTO ORGN_SECURITY ;
            END IF ;
         << DO_ECLS_REPEATING >>
            OPEN ECLS_REPEATING ;
            FETCH ECLS_REPEATING INTO ECLS_TEMP ;
    G$_CHECK_VALUE (ECLS_REPEATING%NOTFOUND,  G$_NLS.Get('POQRPLS-0019', 'LIB','*ERROR* Ecls Code; You do not have Permission to see this Employee Class.')  
            ,TRUE);
         END ;
      END IF ;
      << ORGN_SECURITY >>
      <multilinecomment> Organization security check first checks if the user has
         master organization privilege, i.e can see all organizations.
         This is determined by the master orgn indicator on the
         PTRUSER form.  If not, then it checks to see if the home
         organization  set up on the Employee Form PEAEMPL for the
         ID in the KEY BLOCK, falls between the lows and highs in
         the access list set up for the user on the PSAORGN form.  </multilinecomment>
      IF NAME_IN('global.orgn_security_ind') = 'Y' THEN
         DECLARE
            ORGN_TEMP     VARCHAR2(1) ;
            CURSOR ORGN_MASTER IS
               SELECT 'X'
               FROM   ptruser
               WHERE  ptruser_code = USER
               AND    ptruser_master_orgn_ind = 'Y' ;
            CURSOR ORGN_REPEATING IS
               SELECT 'X'
               FROM   psrorgn
               WHERE  psrorgn_user_code = USER
               AND    NVL(security_coas_code, '*') =
                      NVL(psrorgn_coas_code, '*')
               AND    psrorgn_orgn_low  <= security_orgn_code
               AND    psrorgn_orgn_high >= security_orgn_code ;
         BEGIN
            OPEN ORGN_MASTER ;
            FETCH ORGN_MASTER INTO ORGN_TEMP ;
            IF ORGN_MASTER%NOTFOUND THEN
               GOTO DO_ORGN_REPEATING ;
            ELSE
               GOTO EMPR_SECURITY ;
            END IF ;
         << DO_ORGN_REPEATING >>
            OPEN ORGN_REPEATING ;
            FETCH ORGN_REPEATING INTO ORGN_TEMP ;
     G$_CHECK_VALUE (ORGN_REPEATING%NOTFOUND,  G$_NLS.Get('POQRPLS-0020', 'LIB','*ERROR* Orgn Code; You do not have permission to see this Organization.')  
            , TRUE);
         END ;
      END IF ;
     << EMPR_SECURITY >>
     <multilinecomment> Employer security check first checks if the user has
         master employer privilege, i.e can see all employers.
         This is determined by the master employer indicator on
         the PTRUSER form.  If not, then it checks if the parameter
         to look at a specific employer is set.  If it is not, then
         it checks to see if ANY of the Employer Codes for the jobs
         that the ID in the KEY BLOCK has are in the access list set
         up for the user on the PSAEMPR form.  If the parameter IS
         set, then it checks to see if that employer ONLY is in the
         PSAEMPR access list.  This check is done only if the
         employee with the pidm has a job.                        </multilinecomment>
      IF NAME_IN('global.empr_security_ind') = 'Y' AND security_salary IS NOT NULL
      THEN
         DECLARE
            EMPR_TEMP     VARCHAR2(1) ;
            CURSOR EMPR_MASTER IS
               SELECT 'X'
               FROM   ptruser
               WHERE  ptruser_code = USER
               AND    ptruser_master_empr_ind = 'Y' ;
            CURSOR EMPR_REPEATING_ANY IS
               SELECT 'X'
               FROM   nbrjobs, psrempr
               WHERE  psrempr_empr_code = nbrjobs_empr_code
               AND    psrempr_user_code = USER
               AND    nbrjobs_pidm = PAR_PIDM ;
            CURSOR EMPR_REPEATING_ONLY IS
               SELECT 'X'
               FROM   psrempr
               WHERE  psrempr_user_code = USER
               AND    psrempr_empr_code = PAR_EMPR_CODE ;
         BEGIN
            OPEN EMPR_MASTER ;
            FETCH EMPR_MASTER INTO EMPR_TEMP ;
            IF EMPR_MASTER%NOTFOUND THEN
               GOTO DO_EMPR_REPEATING ;
            ELSE
               RETURN ;
            END IF ;
         << DO_EMPR_REPEATING >>
            IF PAR_EMPR_CODE IS NULL THEN
               OPEN EMPR_REPEATING_ANY ;
               FETCH EMPR_REPEATING_ANY INTO EMPR_TEMP ;
               G$_CHECK_VALUE (EMPR_REPEATING_ANY%NOTFOUND,
       G$_NLS.Get('POQRPLS-0021', 'LIB','*ERROR* You do not have permission to see this Employer.') , TRUE) ;
            ELSE
               OPEN EMPR_REPEATING_ONLY ;
               FETCH EMPR_REPEATING_ONLY INTO EMPR_TEMP ;
               G$_CHECK_VALUE (EMPR_REPEATING_ONLY%NOTFOUND,
       G$_NLS.Get('POQRPLS-0022', 'LIB','*ERROR* You do not have permission to see this Employer.') , TRUE) ;
           END IF ;
         END ;
      END IF ;
   END ;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param parPidm
		* @param parEmprCode
		*/
		public void pDoSecurity(NNumber parPidm, NString parEmprCode)
		{
			int rowCount = 0;


			//  Parameters:
			// PIDM      - Unique ID to check for access to this employee's data.
			// EMPR_CODE - Specific employer code to check when this procedure is
			// invoked from the forms which this code in their key
			// blocks.
			// Process Description:
			// P$_DO_SECURITY checks BANNER HR security on forms with ID in the
			// key block. It checks the security globals to see if any security
			// is turned on. If yes, it gets the employee class, home organization
			// fields from the Employee Table pebempl. If ID is not an employee,
			// no security check is done.
			// If the person is an employee, then it retrieves the maximum salary
			// found in the Jobs Table nbrjobs, for the employee. Then it carries
			// out each of the security checks - Salary, employee class,
			// organization and employer.  It will carry out the employer security
			// check, only if the employee has a job.                           
			//  Control data from PEBEMPL, NBRJOBS 
			NNumber securitySalary= NNumber.getNull();
			NString securityEclsCode= NString.getNull();
			NString securityCoasCode= NString.getNull();
			NString securityOrgnCode= NString.getNull();
			String sqlemplInfo = "SELECT pebempl_ecls_code, pebempl_orgn_code_home, pebempl_coas_code_home " +
	" FROM pebempl " +
	" WHERE pebempl_pidm = :P_PAR_PIDM ";
			DataCursor emplInfo = new DataCursor(sqlemplInfo);
			String sqlsalaryInfo = "SELECT max(nbrjobs_ann_salary) " +
	" FROM nbrjobs " +
	" WHERE nbrjobs_pidm = :P_PAR_PIDM ";
			DataCursor salaryInfo = new DataCursor(sqlsalaryInfo);
			try {
				if (!( getNameIn("global.sala_security_ind").equals("Y") || getNameIn("global.ecls_security_ind").equals("Y") || getNameIn("global.orgn_security_ind").equals("Y") || getNameIn("global.empr_security_ind").equals("Y") ))
				{
					return ;
				}
				 
				//Setting query parameters
				emplInfo.addParameter("P_PAR_PIDM", parPidm);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable emplInfo.
				emplInfo.open();
				ResultSet emplInfoResults = emplInfo.fetchInto();
				if ( emplInfoResults != null ) {
					securityEclsCode = emplInfoResults.getStr(0);
					securityOrgnCode = emplInfoResults.getStr(1);
					securityCoasCode = emplInfoResults.getStr(2);
				}
				if ( emplInfo.notFound() )
				{
					return ;
				}
				//Setting query parameters
				salaryInfo.addParameter("P_PAR_PIDM", parPidm);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable salaryInfo.
				salaryInfo.open();
				ResultSet salaryInfoResults = salaryInfo.fetchInto();
				if ( salaryInfoResults != null ) {
					securitySalary = salaryInfoResults.getNumber(0);
				}
				//  Salary security block checks if the maximum salary for
				// the employee in the KEY BLOCK is less than or equal to
				// the salary level that the user can see, namely, the
				// salary level set for the user on the PTRUSER form.  
				if ( getNameIn("global.sala_security_ind").equals("Y") && !securitySalary.isNull() )
				{
					{
						NString userSalaryTemp= NString.getNull();
						String sqluserSalary = "SELECT 'X' " +
	" FROM ptruser " +
	" WHERE ptruser_code = USER AND :P_SECURITY_SALARY <= ptruser_sala_level ";
						DataCursor userSalary = new DataCursor(sqluserSalary);
						try {
							//Setting query parameters
							userSalary.addParameter("P_SECURITY_SALARY", securitySalary);
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable userSalary.
							userSalary.open();
							ResultSet userSalaryResults = userSalary.fetchInto();
							if ( userSalaryResults != null ) {
								userSalaryTemp = userSalaryResults.getStr(0);
							}
							getGoqrpls().gCheckValue(toBool(userSalary.notFound()), GNls.Fget(toStr("POQRPLS-0018"), toStr("LIB"), toStr("*ERROR* Salary; You do not have Permission to see this Salary Level.")), toBool(NBool.True));
						}
						finally{
							userSalary.close();
						}
					}
				}
				//  Employee Class security check first checks if the user
				// has master employee class privilege, i.e can see all
				// employee classes. This is determined by the master ecls
				// indicator on the PTRUSER form.  If not, then it checks
				// to see if the Employee Class set up on the Employee Form
				// for the ID in the key block, is in the access list set up
				// for the user on the PSAECLS form.                      
				if ( getNameIn("global.ecls_security_ind").equals("Y") )
				{
					{
						NString eclsTemp= NString.getNull();
						String sqleclsMaster = "SELECT 'X' " +
	" FROM ptruser " +
	" WHERE ptruser_code = USER AND ptruser_master_ecls_ind = 'Y' ";
						DataCursor eclsMaster = new DataCursor(sqleclsMaster);
						String sqleclsRepeating = "SELECT 'X' " +
	" FROM psrecls " +
	" WHERE psrecls_user_code = USER AND psrecls_ecls_code = :P_SECURITY_ECLS_CODE ";
						DataCursor eclsRepeating = new DataCursor(sqleclsRepeating);
						try {
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable eclsMaster.
							eclsMaster.open();
							ResultSet eclsMasterResults = eclsMaster.fetchInto();
							if ( eclsMasterResults != null ) {
								eclsTemp = eclsMasterResults.getStr(0);
							}
							if ( eclsMaster.notFound() )
							{
							
								
								//Setting query parameters
								eclsRepeating.addParameter("P_SECURITY_ECLS_CODE", securityEclsCode);
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable eclsRepeating.
								eclsRepeating.open();
								ResultSet eclsRepeatingResults = eclsRepeating.fetchInto();
								if ( eclsRepeatingResults != null ) {
									eclsTemp = eclsRepeatingResults.getStr(0);
								}
								getGoqrpls().gCheckValue(toBool(eclsRepeating.notFound()), GNls.Fget(toStr("POQRPLS-0019"), toStr("LIB"), toStr("*ERROR* Ecls Code; You do not have Permission to see this Employee Class.")), toBool(NBool.True));
							}
						}
						finally{
							eclsMaster.close();
							eclsRepeating.close();
						}
					}
				}
				 
				//  Organization security check first checks if the user has
				// master organization privilege, i.e can see all organizations.
				// This is determined by the master orgn indicator on the
				// PTRUSER form.  If not, then it checks to see if the home
				// organization  set up on the Employee Form PEAEMPL for the
				// ID in the KEY BLOCK, falls between the lows and highs in
				// the access list set up for the user on the PSAORGN form.  
				if ( getNameIn("global.orgn_security_ind").equals("Y") )
				{
					{
						NString orgnTemp= NString.getNull();
						String sqlorgnMaster = "SELECT 'X' " +
	" FROM ptruser " +
	" WHERE ptruser_code = USER AND ptruser_master_orgn_ind = 'Y' ";
						DataCursor orgnMaster = new DataCursor(sqlorgnMaster);
						String sqlorgnRepeating = "SELECT 'X' " +
	" FROM psrorgn " +
	" WHERE psrorgn_user_code = USER AND NVL(:P_SECURITY_COAS_CODE, '*') = NVL(psrorgn_coas_code, '*') AND psrorgn_orgn_low <= :P_SECURITY_ORGN_CODE AND psrorgn_orgn_high >= :P_SECURITY_ORGN_CODE ";
						DataCursor orgnRepeating = new DataCursor(sqlorgnRepeating);
						try {
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable orgnMaster.
							orgnMaster.open();
							ResultSet orgnMasterResults = orgnMaster.fetchInto();
							if ( orgnMasterResults != null ) {
								orgnTemp = orgnMasterResults.getStr(0);
							}
							if ( orgnMaster.notFound() )
							{
							
								//Setting query parameters
								orgnRepeating.addParameter("P_SECURITY_COAS_CODE", securityCoasCode);
								orgnRepeating.addParameter("P_SECURITY_ORGN_CODE", securityOrgnCode);
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable orgnRepeating.
								orgnRepeating.open();
								ResultSet orgnRepeatingResults = orgnRepeating.fetchInto();
								if ( orgnRepeatingResults != null ) {
									orgnTemp = orgnRepeatingResults.getStr(0);
								}
								getGoqrpls().gCheckValue(toBool(orgnRepeating.notFound()), GNls.Fget(toStr("POQRPLS-0020"), toStr("LIB"), toStr("*ERROR* Orgn Code; You do not have permission to see this Organization.")), toBool(NBool.True));
							}
						}
						finally{
							orgnMaster.close();
							orgnRepeating.close();
						}
					}
				}
				//  Employer security check first checks if the user has
				// master employer privilege, i.e can see all employers.
				// This is determined by the master employer indicator on
				// the PTRUSER form.  If not, then it checks if the parameter
				// to look at a specific employer is set.  If it is not, then
				// it checks to see if ANY of the Employer Codes for the jobs
				// that the ID in the KEY BLOCK has are in the access list set
				// up for the user on the PSAEMPR form.  If the parameter IS
				// set, then it checks to see if that employer ONLY is in the
				// PSAEMPR access list.  This check is done only if the
				// employee with the pidm has a job.                        
				if ( getNameIn("global.empr_security_ind").equals("Y") && !securitySalary.isNull() )
				{
					{
						NString emprTemp= NString.getNull();
						String sqlemprMaster = "SELECT 'X' " +
	" FROM ptruser " +
	" WHERE ptruser_code = USER AND ptruser_master_empr_ind = 'Y' ";
						DataCursor emprMaster = new DataCursor(sqlemprMaster);
						String sqlemprRepeatingAny = "SELECT 'X' " +
	" FROM nbrjobs, psrempr " +
	" WHERE psrempr_empr_code = nbrjobs_empr_code AND psrempr_user_code = USER AND nbrjobs_pidm = :P_PAR_PIDM ";
						DataCursor emprRepeatingAny = new DataCursor(sqlemprRepeatingAny);
						String sqlemprRepeatingOnly = "SELECT 'X' " +
	" FROM psrempr " +
	" WHERE psrempr_user_code = USER AND psrempr_empr_code = :P_PAR_EMPR_CODE ";
						DataCursor emprRepeatingOnly = new DataCursor(sqlemprRepeatingOnly);
						try {
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable emprMaster.
							emprMaster.open();
							ResultSet emprMasterResults = emprMaster.fetchInto();
							if ( emprMasterResults != null ) {
								emprTemp = emprMasterResults.getStr(0);
							}
							if ( !emprMaster.notFound() )
							{	 
								return ;
							}
							 
							if ( parEmprCode.isNull() )
							{
								//Setting query parameters
								emprRepeatingAny.addParameter("P_PAR_PIDM", parPidm);
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable emprRepeatingAny.
								emprRepeatingAny.open();
								ResultSet emprRepeatingAnyResults = emprRepeatingAny.fetchInto();
								if ( emprRepeatingAnyResults != null ) {
									emprTemp = emprRepeatingAnyResults.getStr(0);
								}
								getGoqrpls().gCheckValue(toBool(emprRepeatingAny.notFound()), GNls.Fget(toStr("POQRPLS-0021"), toStr("LIB"), toStr("*ERROR* You do not have permission to see this Employer.")), toBool(NBool.True));
							}
							else {
								//Setting query parameters
								emprRepeatingOnly.addParameter("P_PAR_EMPR_CODE", parEmprCode);
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable emprRepeatingOnly.
								emprRepeatingOnly.open();
								ResultSet emprRepeatingOnlyResults = emprRepeatingOnly.fetchInto();
								if ( emprRepeatingOnlyResults != null ) {
									emprTemp = emprRepeatingOnlyResults.getStr(0);
								}
								getGoqrpls().gCheckValue(toBool(emprRepeatingOnly.notFound()), GNls.Fget(toStr("POQRPLS-0022"), toStr("LIB"), toStr("*ERROR* You do not have permission to see this Employer.")), toBool(NBool.True));
							}
						}
						finally{
							emprMaster.close();
							emprRepeatingAny.close();
							emprRepeatingOnly.close();
						}
					}
				}
				}finally{
					emplInfo.close();
					salaryInfo.close();
				}

			
			
		}

	//Original PL/SQL code for Prog Unit POQRPLS.P$_DISP_DESC
	/*
	PROCEDURE P$_DISP_DESC (HIST_DISP  IN VARCHAR2,
                        DISP_DESC  IN OUT VARCHAR2) IS   
BEGIN

      IF  HIST_DISP = '05' THEN
            DISP_DESC := 'Awaiting Re-Extract' ;
         ELSIF HIST_Disp = '10' THEN
            DISP_DESC := 'Awaiting Time Entry' ;
         ELSIF HIST_Disp = '15' THEN
            DISP_DESC := 'Awaiting Correction' ;
         ELSIF HIST_Disp = '20' THEN
            DISP_DESC := 'Awaiting Proof' ;
         ELSIF HIST_Disp = '25' THEN
            DISP_DESC := 'Awaiting Leave Process' ;
         ELSIF HIST_Disp = '27' THEN
            DISP_DESC :=  G$_NLS.Get('POQRPLS-0008', 'LIB','Pre-Balance Calc')  ;
         ELSIF HIST_Disp = '28' THEN
            DISP_DESC :=  G$_NLS.Get('POQRPLS-0009', 'LIB','Pre-Approve Calc')  ;
         ELSIF HIST_Disp = '30' THEN
            DISP_DESC := 'Awaiting Calc' ;
         ELSIF HIST_Disp = '37' THEN
            DISP_DESC :=  G$_NLS.Get('POQRPLS-0010', 'LIB','Pre-Balance Check')  ;
         ELSIF HIST_Disp = '38' THEN
            DISP_DESC :=  G$_NLS.Get('POQRPLS-0011', 'LIB','Pre-Approve Check')  ;
         ELSIF HIST_Disp = '40' THEN
            DISP_DESC := 'Awaiting Document' ;
         ELSIF HIST_Disp = '42' THEN
            DISP_DESC := 'Awaiting Check/DD Run' ;
         ELSIF HIST_Disp = '43' THEN
            DISP_DESC := 'Awaiting DD Run' ;
         ELSIF HIST_Disp = '47' THEN
            DISP_DESC :=  G$_NLS.Get('POQRPLS-0012', 'LIB','Pre-Balance Update')  ;
         ELSIF HIST_Disp = '48' THEN
            DISP_DESC :=  G$_NLS.Get('POQRPLS-0013', 'LIB','Pre-Approve Update')  ;
         ELSIF HIST_Disp = '50' THEN
            DISP_DESC := 'Awaiting Update' ;
         ELSIF HIST_Disp = '60' THEN
            DISP_DESC :=  G$_NLS.Get('POQRPLS-0014', 'LIB','Finance Extract')  ;
         ELSIF HIST_Disp = '62' THEN
            DISP_DESC :=  G$_NLS.Get('POQRPLS-0015', 'LIB','Finance Interface')  ;
         ELSIF HIST_Disp = '70' THEN
            DISP_DESC := 'Complete' ;
         ELSIF HIST_Disp = '44' THEN
            DISP_DESC := 'Awaiting Check Run' ;
         ELSIF HIST_Disp = '22' THEN
            DISP_DESC :=  G$_NLS.Get('POQRPLS-0016', 'LIB','Hours Correction')  ;
         ELSE
            DISP_DESC :=  G$_NLS.Get('POQRPLS-0017', 'LIB','Undefined')  ;
       END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param histDisp
		* @param dispDesc
		*/
		public void pDispDesc(NString histDisp, Ref<NString> dispDesc)
		{
			if ( histDisp.equals("05") )
			{
				dispDesc.val = toStr("Awaiting Re-Extract");
			}
			else if ( histDisp.equals("10") ) {
				dispDesc.val = toStr("Awaiting Time Entry");
			}
			else if ( histDisp.equals("15") ) {
				dispDesc.val = toStr("Awaiting Correction");
			}
			else if ( histDisp.equals("20") ) {
				dispDesc.val = toStr("Awaiting Proof");
			}
			else if ( histDisp.equals("25") ) {
				dispDesc.val = toStr("Awaiting Leave Process");
			}
			else if ( histDisp.equals("27") ) {
				dispDesc.val = GNls.Fget(toStr("POQRPLS-0008"), toStr("LIB"), toStr("Pre-Balance Calc"));
			}
			else if ( histDisp.equals("28") ) {
				dispDesc.val = GNls.Fget(toStr("POQRPLS-0009"), toStr("LIB"), toStr("Pre-Approve Calc"));
			}
			else if ( histDisp.equals("30") ) {
				dispDesc.val = toStr("Awaiting Calc");
			}
			else if ( histDisp.equals("37") ) {
				dispDesc.val = GNls.Fget(toStr("POQRPLS-0010"), toStr("LIB"), toStr("Pre-Balance Check"));
			}
			else if ( histDisp.equals("38") ) {
				dispDesc.val = GNls.Fget(toStr("POQRPLS-0011"), toStr("LIB"), toStr("Pre-Approve Check"));
			}
			else if ( histDisp.equals("40") ) {
				dispDesc.val = toStr("Awaiting Document");
			}
			else if ( histDisp.equals("42") ) {
				dispDesc.val = toStr("Awaiting Check/DD Run");
			}
			else if ( histDisp.equals("43") ) {
				dispDesc.val = toStr("Awaiting DD Run");
			}
			else if ( histDisp.equals("47") ) {
				dispDesc.val = GNls.Fget(toStr("POQRPLS-0012"), toStr("LIB"), toStr("Pre-Balance Update"));
			}
			else if ( histDisp.equals("48") ) {
				dispDesc.val = GNls.Fget(toStr("POQRPLS-0013"), toStr("LIB"), toStr("Pre-Approve Update"));
			}
			else if ( histDisp.equals("50") ) {
				dispDesc.val = toStr("Awaiting Update");
			}
			else if ( histDisp.equals("60") ) {
				dispDesc.val = GNls.Fget(toStr("POQRPLS-0014"), toStr("LIB"), toStr("Finance Extract"));
			}
			else if ( histDisp.equals("62") ) {
				dispDesc.val = GNls.Fget(toStr("POQRPLS-0015"), toStr("LIB"), toStr("Finance Interface"));
			}
			else if ( histDisp.equals("70") ) {
				dispDesc.val = toStr("Complete");
			}
			else if ( histDisp.equals("44") ) {
				dispDesc.val = toStr("Awaiting Check Run");
			}
			else if ( histDisp.equals("22") ) {
				dispDesc.val = GNls.Fget(toStr("POQRPLS-0016"), toStr("LIB"), toStr("Hours Correction"));
			}
			else {
				dispDesc.val = GNls.Fget(toStr("POQRPLS-0017"), toStr("LIB"), toStr("Undefined"));
			}
		}

	//Original PL/SQL code for Prog Unit POQRPLS.P$_CHECK_CANADIAN_SIN
	/*
	PROCEDURE P$_CHECK_CANADIAN_SIN (par_ssn in varchar2) IS
  
    --   This procedure validates Canadian Social Insurance
    --  number. 

  var_ssn      VARCHAR2(9);
  var_num      NUMBER(5);
  var_num2     NUMBER;
  save_num     VARCHAR2(5);
  VAR_SIN_IND  VARCHAR2(1);

  cursor c1 IS 
          SELECT PTRINST_SIN_IND 
            FROM PTRINST;
BEGIN

 OPEN C1;
 FETCH C1 INTO var_sin_ind;
 var_ssn := par_ssn;  
 if (substr(var_ssn,2,1) = 0  AND 
     substr(var_ssn,4,1) = 0  AND
     substr(var_ssn,6,1) = 0  AND 
     substr(var_ssn,8,1) = 0 )         THEN

     var_num2 := to_number(substr(var_ssn, 1, 1)) + 
                 to_number(substr(var_ssn, 3, 1)) + 
                 to_number(substr(var_ssn, 5, 1)) + 
                 to_number(substr(var_ssn, 7, 1));
 else
     var_num := to_number(rpad(to_char(
                to_number(substr(var_ssn,2,1) ||
                          substr(var_ssn,4,1) || 
                          substr(var_ssn,6,1) ||
                          substr(var_ssn,8,1)) * 2), 5, '0'));
     save_num  := to_char(var_num);
     var_num2 := to_number(substr(save_num, 1, 1)) + 
                 to_number(substr(save_num, 2, 1)) +  
                 to_number(substr(save_num, 3, 1)) + 
                 to_number(substr(save_num, 4, 1)) + 
                 to_number(substr(save_num, 5, 1)) + 
                 to_number(substr(var_ssn, 1, 1)) + 
                 to_number(substr(var_ssn, 3, 1)) + 
                 to_number(substr(var_ssn, 5, 1)) + 
                 to_number(substr(var_ssn, 7, 1));
 end if;
    if var_sin_ind = 'E' THEN
         G$_CHECK_VALUE((round(var_num2 + 4, -1) - var_num2) <>
                to_number(substr(var_ssn, 9, 1)), 
                G$_NLS.Get('POQRPLS-0000', 'LIB','*ERROR* Invalid SIN; Please correct on Identification Form before processing. ') ,TRUE);
         if  var_ssn  IS NULL THEN
              message( G$_NLS.Get('POQRPLS-0001', 'LIB','*ERROR* SIN must be entered.') ,NO_ACKNOWLEDGE);
              RAISE FORM_TRIGGER_FAILURE;
         else
              if NVL(LENGTH(var_ssn), 0) < 9 THEN
                 message( G$_NLS.Get('POQRPLS-0002', 'LIB','*ERROR* SIN must be entered completely.') ,NO_ACKNOWLEDGE);
                 RAISE FORM_TRIGGER_FAILURE;
              end if;
         end if;
    elsif  var_sin_ind = 'W' THEN
         G$_CHECK_VALUE((round(var_num2 + 4, -1) - var_num2) <>
                to_number(substr(var_ssn, 9, 1)), 
                G$_NLS.Get('POQRPLS-0003', 'LIB','*WARNING* Invalid Social Insurance Number.') ,FALSE);
          if  var_ssn  IS NULL THEN
              message( G$_NLS.Get('POQRPLS-0004', 'LIB','*WARNING* SIN must be entered.') );
          else
              if NVL(LENGTH(var_ssn), 0) < 9 THEN
                 message( G$_NLS.Get('POQRPLS-0005', 'LIB','*WARNING* SIN must be entered completely.') );
              end if;  
          end if;
    else
         RETURN;
    end if;

 EXCEPTION
         WHEN VALUE_ERROR THEN

           if var_sin_ind = 'E' THEN
              message( G$_NLS.Get('POQRPLS-0006', 'LIB','*ERROR* Only numeric data allowed for this field.') ,NO_ACKNOWLEDGE);
              RAISE FORM_TRIGGER_FAILURE; 
           elsif var_sin_ind = 'W' THEN
              message( G$_NLS.Get('POQRPLS-0007', 'LIB','*WARNING* Only numeric data allowed for this field.') );
           end if;

 END P$_CHECK_CANADIAN_SIN;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param parSsn
		*/
		public void pCheckCanadianSin(NString parSsn)
		{
			int rowCount = 0;
			//    This procedure validates Canadian Social Insurance
			//   number. 
			NString varSsn= NString.getNull();
			NNumber varNum= NNumber.getNull();
			NNumber varNum2= NNumber.getNull();
			NString saveNum= NString.getNull();
			NString varSinInd= NString.getNull();
			String sqlc1 = "SELECT PTRINST_SIN_IND " +
	" FROM PTRINST ";
			DataCursor c1 = new DataCursor(sqlc1);
			try {
				try
				{
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
					c1.open();
					ResultSet c1Results = c1.fetchInto();
					if ( c1Results != null ) {
						varSinInd = c1Results.getStr(0);
					}
					varSsn = parSsn;
					if ((substring(varSsn, toInt(2), toInt(1)).equals(0) && substring(varSsn, toInt(4), toInt(1)).equals(0) && substring(varSsn, toInt(6), toInt(1)).equals(0) && substring(varSsn, toInt(8), toInt(1)).equals(0)))
					{
						varNum2 = toNumber(substring(varSsn, toInt(1), toInt(1))).add(toNumber(substring(varSsn, toInt(3), toInt(1)))).add(toNumber(substring(varSsn, toInt(5), toInt(1)))).add(toNumber(substring(varSsn, toInt(7), toInt(1))));
					}
					else {
						varNum = toNumber(rpad(toChar(toNumber(substring(varSsn, toInt(2), toInt(1)).append(substring(varSsn, toInt(4), toInt(1))).append(substring(varSsn, toInt(6), toInt(1))).append(substring(varSsn, toInt(8), toInt(1)))).multiply(2)), 5, "0"));
						saveNum = toChar(varNum);
						varNum2 = toNumber(substring(saveNum, toInt(1), toInt(1))).add(toNumber(substring(saveNum, toInt(2), toInt(1)))).add(toNumber(substring(saveNum, toInt(3), toInt(1)))).add(toNumber(substring(saveNum, toInt(4), toInt(1)))).add(toNumber(substring(saveNum, toInt(5), toInt(1)))).add(toNumber(substring(varSsn, toInt(1), toInt(1)))).add(toNumber(substring(varSsn, toInt(3), toInt(1)))).add(toNumber(substring(varSsn, toInt(5), toInt(1)))).add(toNumber(substring(varSsn, toInt(7), toInt(1))));
					}
					if ( varSinInd.equals("E") )
					{
						getGoqrpls().gCheckValue(toBool((round(varNum2.add(4), - (1)).subtract(varNum2)).notEquals(toNumber(substring(varSsn, toInt(9), toInt(1))))), GNls.Fget(toStr("POQRPLS-0000"), toStr("LIB"), toStr("*ERROR* Invalid SIN; Please correct on Identification Form before processing. ")), toBool(NBool.True));
						if ( varSsn.isNull() )
						{
							errorMessage(GNls.Fget(toStr("POQRPLS-0001"), toStr("LIB"), toStr("*ERROR* SIN must be entered.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
						else {
							if ( isNull(length(varSsn), 0).lesser(9) )
							{
								errorMessage(GNls.Fget(toStr("POQRPLS-0002"), toStr("LIB"), toStr("*ERROR* SIN must be entered completely.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
								throw new ApplicationException();
							}
						}
					}
					else if ( varSinInd.equals("W") ) {
						getGoqrpls().gCheckValue(toBool((round(varNum2.add(4), - (1)).subtract(varNum2)).notEquals(toNumber(substring(varSsn, toInt(9), toInt(1))))), GNls.Fget(toStr("POQRPLS-0003"), toStr("LIB"), toStr(" Invalid Social Insurance Number.")), toBool(NBool.False), toBool(NBool.False), toBool(NBool.True));
						if ( varSsn.isNull() )
						{
							warningMessage(GNls.Fget(toStr("POQRPLS-0004"), toStr("LIB"), toStr("*WARNING* SIN must be entered.")));
						}
						else {
							if ( isNull(length(varSsn), 0).lesser(9) )
							{
								warningMessage(GNls.Fget(toStr("POQRPLS-0005"), toStr("LIB"), toStr("*WARNING* SIN must be entered completely.")));
							}
						}
					}
					else {
						return ;
					}
				}
//				catch(ValueErrorException e)
				
//				MORPHIS TODO <DO>: Catch <NumberFormatException> para o formato numerico do id canadiano ELLBHR-11284
				catch(NumberFormatException e)
				{
					if ( varSinInd.equals("E") )
					{
						errorMessage(GNls.Fget(toStr("POQRPLS-0006"), toStr("LIB"), toStr("*ERROR* Only numeric data allowed for this field.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
						throw new ApplicationException();
					}
					else if ( varSinInd.equals("W") ) {
						warningMessage(GNls.Fget(toStr("POQRPLS-0007"), toStr("LIB"), toStr("*WARNING* Only numeric data allowed for this field.")));
					}
				}
				}finally{
					c1.close();
				}
		}
		
		//Original PL/SQL code for Prog Unit POQRPLS.P$POPULATE_ACA_CDE_LIST
		/*
		PROCEDURE POPULATE_ACA_CDE_LIST(p_item_name varchar2, p_list_name varchar2) IS
			lv_num NUMBER;
		    lv_list pdklibs.list_tabtype;
		begin
		      lv_list := pdklibs.f_list(p_list_name);
		      lv_num := 0;
		      delete_list_element(p_item_name,1);
		      for i in 1 .. lv_list.COUNT loop
		      	lv_num := lv_num+1;
		      	add_list_element(p_item_name,lv_num,lv_list(i).r_desc,lv_list(i).r_code);
		      end loop;
		      
		end;
		*/
		/* <p>
			* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
	/* </p>
			* @param pItemName
			* * @param pListName
			*/
		public static void populateAcaCdeList(NString pItemName, NString pListName)
		{

			Pdklibs.ListArrayTypeRow list = null;
			list = (ListArrayTypeRow) Pdklibs.fList(pListName);
			deleteListElement(pListName, toInt(1));
			for ( int i = 1; i <= list.size(); i++ )//.Count
			{
				addListElement(toStr(pItemName), i, list.get(i).RDesc, list.get(i).RCode);
			}
			addListElement(toStr(pItemName), list.size() + 1, GNls.Fget(toStr("POQRPLS-0045"), toStr("LIB"), toStr("(None)")), toStr(""));
		}
			
			

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_NLS_DATE_SUPPORT
	/*
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
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_MSGKEY_UPDATE
	/*
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : POQRPLS
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Tue Feb 10 01:37:30 2015
-- MSGSIGN : #8bebd54f784b0f63
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}
		
//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_8_11_4
		/*
		PROCEDURE AUDIT_TRAIL_8_11_4 IS
	<multilinecomment> 
	AUDIT TRAIL: 8.11.4                          
	1. US ACA Data Collection for Year-end Reporting    SY 02/08/2014
	   Added program unit POPULATE_ACA_CDE_LIST.
	AUDIT TRAIL END
	</multilinecomment>
	BEGIN
	  NULL;
	END; 
		*/
		/* <p>
			* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
	/* </p>
			*/
			public void auditTrail8114()
			{
			}		

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_8_8
	/*
	PROCEDURE AUDIT_TRAIL_8_8 IS
<multilinecomment> 
AUDIT TRAIL: 8.8                          
1. Defect# 1-UJ753N 							                       LN 04/19/2012
   Added program unit POPULATE_PXRRBOX_RG.
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END; 
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail88()
		{
		}

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_8_6
	/*
	PROCEDURE AUDIT_TRAIL_8_6 IS
<multilinecomment>
AUDIT TRAIL: 8.6
1. Defect# 1-AVSZ07                                          BM   02/09/2011
   Problem: Payroll Forms PTRECPD.fmb, PTRECRT.fmb will not compile if Finance product not Installed.
   Functional Impact:  Forms will compile.
   Technical Fix:  Created a procedure POPULATE_PTRECRC_RG to populate the record group PTRECRC_RG dynamically.
         
AUDIT TRAIL END;
</multilinecomment>
BEGIN
  null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail86()
		{
		}

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_8_2_3_1
	/*
	PROCEDURE AUDIT_TRAIL_8_2_3_1 IS
<multilinecomment>
AUDIT TRAIL: 8.2.3.1
1. Defect# 1-6BD2K4                                          AHP   07/31/2009
   Problem: When Banner Finance is not installed, received this 
      WARNING message, *WARNING* BANNER Student is not installed, when 
      performing a List of Values (LOV) function for the Non-Instruction Type field on PTRNIST form
      or the Schedule Type field on PTRFLAC form.
   Functional Impact:  Warning message will not be displayed
   Technical Fix:  Modified these routines to use the GLOBAL.STUSYS variable instead of the 
      GLOBAL.FINSYS variable to check if Banner Student is installed.
         POPULATE_STVNIST_RG
		     POPULATE_STVSCHD_RG  
AUDIT TRAIL END;
</multilinecomment>
BEGIN
  null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8231()
		{
		}

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_8_0
	/*
	PROCEDURE audit_trail_8_0 IS
BEGIN
  null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_7_0_POQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_7_0_POQRPLS IS
<multilinecomment>
 AUDIT TRAIL: 7.0
1. TGKinderman 11/20/2003
   Converted to Forms9i
 AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Poqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_6_0
	/*
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
 AUDIT TRAIL: 6.0
 1. RPE# 1341   																								MS 02-SEP-2002
 Created two new procedures POPULATE_PEQJLEV_RG and POPULATE_PEQELEV_RG.
 This procedures will populate two new record groups PEQJLEV_RG and PEQELEV_RG
 based on leave accrue method either by job or employee. 
 AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
		}

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_5_3_1
	/*
	PROCEDURE AUDIT_TRAIL_5_3_1 IS
<multilinecomment>
 AUDIT TRAIL: 5.3.1
  1. UI33 / UI36 Benefit Mods.
     Created procedure POPULATE_PTQBDCG_RG.      	AP 06-MAR-2002 
 AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail531()
		{
		}

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL_5_0_POQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_5_0_POQRPLS IS
<multilinecomment>
 AUDIT TRAIL: 5.0
1. TGKinderman 06/14/2000
   Dev6.0 Upgrade.
 AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Poqrpls()
		{
		}

	//Original PL/SQL code for Prog Unit POQRPLS.AUDIT_TRAIL
	/*
	PROCEDURE AUDIT_TRAIL IS
<multilinecomment>
 AUDIT TRAIL: 2.1.5
  1. Converted pl/sql units from POQOLIB.  		SQ 04/11/96
 AUDIT TRAIL: 2.1.11
  1. Modified procedure POPULATE_PCQDEDN_RG added      	AS 01/15/97
     subquery in where conditions for select statement. 
 AUDIT TRAIL: 3.0
   1. Contact Number: 2150351                           AY 07/30/1997
      Changed the error message to:
       '*ERROR* Invalid SIN; Please correct on Identification Form before processing. '
 AUDIT TRAIL: 3.1
   1. Defect #8103					AA  10/17/97
	Problem - Displays incorrect description for DISPOSITION 40. 
	Functional Impact - None
	Technical Fix - Changed the description for DISP 40 from 	
      	'Awaiting Check/DD' to 'Awaiting Document'.
    2. Year 2000 compliance                                LR 11-JUN-1998
       '||G$_DATE.GET_NLS_DATE_FORMAT||' date format has been added to all select statments.
    3.Modified procedure POPULATE_PEQJFAC_RG changed       LR 15-JUL-1998
      VALUE_OF_FIELD from CHAR(5) to VARCHAR2(6).
 AUDIT TRAIL: 4.0
   1. Delivered with the 4.0 release to support the        JH 18-DEC-1998
       mass re-generation of all HR forms.
   2. Defect #11685 for System Test. 			   AHP 03-DEC-1999
      Modified POPULATE_PCQDEDN_RG to add this criteria,
      'and a.ptrbdpl_code = pcrdedn_plan ' to the subquery.
 AUDIT TRAIL: 4.1					   NL 15-SEP-1999
   1. Modified procedure POPULATE_PEQJFAC_RG to order effective
      date in descending order. Also changed message displayed when
      no data found in PERJFAC.
 AUDIT TRAIL END;
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail()
		{
		}

}
