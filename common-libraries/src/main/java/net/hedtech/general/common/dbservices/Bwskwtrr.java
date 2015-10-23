package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskwtrr {
		public static NString fGetName(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.F_GET_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fOneUpSeqno(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.F_ONE_UP_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pDeleteValues(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DELETE_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pDispConfirm(NString issueToIn,NString collDescIn,NString stateIn,NString phCtryCodeIn,NString phAreaIn,NString phExtnIn,NString phNumbIn,NString zipIn,NString intAccIn,NString cityIn,NString countryIn,NString houseNumberIn,NString street1In,NString street2In,NString street3In,NString street4In,NString shrttrmTermCodeIn,NString levlCodeIn,NNumber shrtrssChrgIn,NString officialIn,NString asapDegrGrdeIn,NString copiesIn,NString fullNameIn,NString shrtrssWssoIn,NString shrtrpoWpyoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DISP_CONFIRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ISSUE_TO_IN", issueToIn);
			cmd.addParameter("@COLL_DESC_IN", collDescIn);
			cmd.addParameter("@STATE_IN", stateIn);
			cmd.addParameter("@PH_CTRY_CODE_IN", phCtryCodeIn);
			cmd.addParameter("@PH_AREA_IN", phAreaIn);
			cmd.addParameter("@PH_EXTN_IN", phExtnIn);
			cmd.addParameter("@PH_NUMB_IN", phNumbIn);
			cmd.addParameter("@ZIP_IN", zipIn);
			cmd.addParameter("@INT_ACC_IN", intAccIn);
			cmd.addParameter("@CITY_IN", cityIn);
			cmd.addParameter("@COUNTRY_IN", countryIn);
			cmd.addParameter("@HOUSE_NUMBER_IN", houseNumberIn);
			cmd.addParameter("@STREET1_IN", street1In);
			cmd.addParameter("@STREET2_IN", street2In);
			cmd.addParameter("@STREET3_IN", street3In);
			cmd.addParameter("@STREET4_IN", street4In);
			cmd.addParameter("@SHRTTRM_TERM_CODE_IN", shrttrmTermCodeIn);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@SHRTRSS_CHRG_IN", shrtrssChrgIn);
			cmd.addParameter("@OFFICIAL_IN", officialIn);
			cmd.addParameter("@ASAP_DEGR_GRDE_IN", asapDegrGrdeIn);
			cmd.addParameter("@COPIES_IN", copiesIn);
			cmd.addParameter("@FULL_NAME_IN", fullNameIn);
			cmd.addParameter("@SHRTRSS_WSSO_IN", shrtrssWssoIn);
			cmd.addParameter("@SHRTRPO_WPYO_IN", shrtrpoWpyoIn);
				
			cmd.execute();


		}
		
		public static void pDispOrderRequests(NString pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DISP_ORDER_REQUESTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MSG", pMsg);
				
			cmd.execute();


		}
		
		public static void pDispPaymentType(NString addrAtypIn,NString collCodeIn,NString sbgiCodeIn,NString issueToIn,NString tprtCodeIn,NString collDescIn,NString stateIn,NString phCtryCodeIn,NString phAreaIn,NString phExtnIn,NString phNumbIn,NString zipIn,NString intAccIn,NString cityIn,NString countryIn,NString houseNumberIn,NString street1In,NString street2In,NString street3In,NString street4In,NString ediInd,NString shrttrmTermCodeIn,NString sfrstcrTermCodeIn,NString levlCodeIn,NString shrtrssWssoIn,NNumber shrtrssChrgIn,NString officialIn,NString asapDegrGrdeIn,NString copiesIn,NString fullNameIn,NString shrtrpoWpyoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DISP_PAYMENT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADDR_ATYP_IN", addrAtypIn);
			cmd.addParameter("@COLL_CODE_IN", collCodeIn);
			cmd.addParameter("@SBGI_CODE_IN", sbgiCodeIn);
			cmd.addParameter("@ISSUE_TO_IN", issueToIn);
			cmd.addParameter("@TPRT_CODE_IN", tprtCodeIn);
			cmd.addParameter("@COLL_DESC_IN", collDescIn);
			cmd.addParameter("@STATE_IN", stateIn);
			cmd.addParameter("@PH_CTRY_CODE_IN", phCtryCodeIn);
			cmd.addParameter("@PH_AREA_IN", phAreaIn);
			cmd.addParameter("@PH_EXTN_IN", phExtnIn);
			cmd.addParameter("@PH_NUMB_IN", phNumbIn);
			cmd.addParameter("@ZIP_IN", zipIn);
			cmd.addParameter("@INT_ACC_IN", intAccIn);
			cmd.addParameter("@CITY_IN", cityIn);
			cmd.addParameter("@COUNTRY_IN", countryIn);
			cmd.addParameter("@HOUSE_NUMBER_IN", houseNumberIn);
			cmd.addParameter("@STREET1_IN", street1In);
			cmd.addParameter("@STREET2_IN", street2In);
			cmd.addParameter("@STREET3_IN", street3In);
			cmd.addParameter("@STREET4_IN", street4In);
			cmd.addParameter("@EDI_IND", ediInd);
			cmd.addParameter("@SHRTTRM_TERM_CODE_IN", shrttrmTermCodeIn);
			cmd.addParameter("@SFRSTCR_TERM_CODE_IN", sfrstcrTermCodeIn);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@SHRTRSS_WSSO_IN", shrtrssWssoIn);
			cmd.addParameter("@SHRTRSS_CHRG_IN", shrtrssChrgIn);
			cmd.addParameter("@OFFICIAL_IN", officialIn);
			cmd.addParameter("@ASAP_DEGR_GRDE_IN", asapDegrGrdeIn);
			cmd.addParameter("@COPIES_IN", copiesIn);
			cmd.addParameter("@FULL_NAME_IN", fullNameIn);
			cmd.addParameter("@SHRTRPO_WPYO_IN", shrtrpoWpyoIn);
				
			cmd.execute();


		}
		
		public static void pDispStatusOfOrder(NNumber seqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DISP_STATUS_OF_ORDER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQNO_IN", seqnoIn);
				
			cmd.execute();


		}
		
		public static void pDispTransRequestCharges(NString msg,NString addrAtypIn,NString collCodeIn,NString sbgiCodeIn,NString issueToIn,NString tprtCodeIn,NString collDescIn,NString stateIn,NString phCtryCodeIn,NString phAreaIn,NString phExtnIn,NString phNumbIn,NString zipIn,NString intAccIn,NString cityIn,NString countryIn,NString houseNumberIn,NString street1In,NString street2In,NString street3In,NString street4In,NString ediInd,NString fullNameIn,NString levlCodeIn,NString shrttrmTermCodeIn,NString sfrstcrTermCodeIn,NString shrtrssWssoIn,NNumber shrtrssChrgIn,NString officialIn,NString asapDegrGrdeIn,NString copiesIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DISP_TRANS_REQUEST_CHARGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@ADDR_ATYP_IN", addrAtypIn);
			cmd.addParameter("@COLL_CODE_IN", collCodeIn);
			cmd.addParameter("@SBGI_CODE_IN", sbgiCodeIn);
			cmd.addParameter("@ISSUE_TO_IN", issueToIn);
			cmd.addParameter("@TPRT_CODE_IN", tprtCodeIn);
			cmd.addParameter("@COLL_DESC_IN", collDescIn);
			cmd.addParameter("@STATE_IN", stateIn);
			cmd.addParameter("@PH_CTRY_CODE_IN", phCtryCodeIn);
			cmd.addParameter("@PH_AREA_IN", phAreaIn);
			cmd.addParameter("@PH_EXTN_IN", phExtnIn);
			cmd.addParameter("@PH_NUMB_IN", phNumbIn);
			cmd.addParameter("@ZIP_IN", zipIn);
			cmd.addParameter("@INT_ACC_IN", intAccIn);
			cmd.addParameter("@CITY_IN", cityIn);
			cmd.addParameter("@COUNTRY_IN", countryIn);
			cmd.addParameter("@HOUSE_NUMBER_IN", houseNumberIn);
			cmd.addParameter("@STREET1_IN", street1In);
			cmd.addParameter("@STREET2_IN", street2In);
			cmd.addParameter("@STREET3_IN", street3In);
			cmd.addParameter("@STREET4_IN", street4In);
			cmd.addParameter("@EDI_IND", ediInd);
			cmd.addParameter("@FULL_NAME_IN", fullNameIn);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@SHRTTRM_TERM_CODE_IN", shrttrmTermCodeIn);
			cmd.addParameter("@SFRSTCR_TERM_CODE_IN", sfrstcrTermCodeIn);
			cmd.addParameter("@SHRTRSS_WSSO_IN", shrtrssWssoIn);
			cmd.addParameter("@SHRTRSS_CHRG_IN", shrtrssChrgIn);
			cmd.addParameter("@OFFICIAL_IN", officialIn);
			cmd.addParameter("@ASAP_DEGR_GRDE_IN", asapDegrGrdeIn);
			cmd.addParameter("@COPIES_IN", copiesIn);
				
			cmd.execute();


		}
		
		public static void pDispTranscriptAddress(NString msg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DISP_TRANSCRIPT_ADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
				
			cmd.execute();


		}
		
		public static void pDispTranscriptRequestData(NString msg,NString addrAtypIn,NString collCodeIn,NString sbgiCodeIn,NString issueToIn,NString tprtCodeIn,NString collDescIn,NString stateIn,NString phCtryCodeIn,NString phAreaIn,NString phExtnIn,NString phNumbIn,NString zipIn,NString intAccIn,NString cityIn,NString countryIn,NString houseNumberIn,NString street1In,NString street2In,NString street3In,NString street4In,NString ediIn,NString fullNameIn,NString levlCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DISP_TRANSCRIPT_REQUEST_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@ADDR_ATYP_IN", addrAtypIn);
			cmd.addParameter("@COLL_CODE_IN", collCodeIn);
			cmd.addParameter("@SBGI_CODE_IN", sbgiCodeIn);
			cmd.addParameter("@ISSUE_TO_IN", issueToIn);
			cmd.addParameter("@TPRT_CODE_IN", tprtCodeIn);
			cmd.addParameter("@COLL_DESC_IN", collDescIn);
			cmd.addParameter("@STATE_IN", stateIn);
			cmd.addParameter("@PH_CTRY_CODE_IN", phCtryCodeIn);
			cmd.addParameter("@PH_AREA_IN", phAreaIn);
			cmd.addParameter("@PH_EXTN_IN", phExtnIn);
			cmd.addParameter("@PH_NUMB_IN", phNumbIn);
			cmd.addParameter("@ZIP_IN", zipIn);
			cmd.addParameter("@INT_ACC_IN", intAccIn);
			cmd.addParameter("@CITY_IN", cityIn);
			cmd.addParameter("@COUNTRY_IN", countryIn);
			cmd.addParameter("@HOUSE_NUMBER_IN", houseNumberIn);
			cmd.addParameter("@STREET1_IN", street1In);
			cmd.addParameter("@STREET2_IN", street2In);
			cmd.addParameter("@STREET3_IN", street3In);
			cmd.addParameter("@STREET4_IN", street4In);
			cmd.addParameter("@EDI_IN", ediIn);
			cmd.addParameter("@FULL_NAME_IN", fullNameIn);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
				
			cmd.execute();


		}
		
		public static void pDispTranscriptRequestType(NString msg,NString addrAtypIn,NString collCodeIn,NString sbgiCodeIn,NString issueToIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DISP_TRANSCRIPT_REQUEST_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@ADDR_ATYP_IN", addrAtypIn);
			cmd.addParameter("@COLL_CODE_IN", collCodeIn);
			cmd.addParameter("@SBGI_CODE_IN", sbgiCodeIn);
			cmd.addParameter("@ISSUE_TO_IN", issueToIn);
				
			cmd.execute();


		}
		
		public static void pDispsigpage(NString wapp,NString term,NNumber seqnoIn,NString letrIn,NString okay) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DISPSIGPAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WAPP", wapp);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@LETR_IN", letrIn);
			cmd.addParameter("@OKAY", okay);
				
			cmd.execute();


		}
		
		public static void pDispsigpageCc(NString transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_DISPSIGPAGE_CC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();


		}
		
		public static void pFailurePage(NString transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_FAILURE_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();


		}
		
		public static void pProcInsertShttran(NNumber seqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWTRR.P_PROC_INSERT_SHTTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SEQNO_IN", seqnoIn);
				
			cmd.execute();


		}
		
	
	
	
}
