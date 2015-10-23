package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakqadm {
		public static NBool fCheckApplHold(NNumber pidmIn,NDate dateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.F_CHECK_APPL_HOLD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DATE_IN", dateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckPlanDcsn(NNumber aidm,NNumber applno,NString term,NNumber adapApplnoIn,NNumber pidm,Ref<NString> letrCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.F_CHECK_PLAN_DCSN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPLNO", applno);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@ADAP_APPLNO_IN", adapApplnoIn);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LETR_CODE_OUT", NString.class);
				
			cmd.execute();
			letrCodeOut.val = cmd.getParameterValue("@LETR_CODE_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckSecuredSide(NNumber aidmIn,Ref<NNumber> matchPidmOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.F_CHECK_SECURED_SIDE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@MATCH_PIDM_OUT", NNumber.class);
				
			cmd.execute();
			matchPidmOut.val = cmd.getParameterValue("@MATCH_PIDM_OUT", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckVerify(NNumber aidmIn,NNumber applnoIn,NString wappIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.F_CHECK_VERIFY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@WAPP_IN", wappIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fQueryExistingSgbstdn(NString termIn,NString levlCodeIn,NString collCodeIn,NString degcCodeIn,NString pgmCodeIn,NString majrCodeIn,Ref<NString> sarwaltLetrCodeOut,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.F_QUERY_EXISTING_SGBSTDN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
			cmd.addParameter("@COLL_CODE_IN", collCodeIn);
			cmd.addParameter("@DEGC_CODE_IN", degcCodeIn);
			cmd.addParameter("@PGM_CODE_IN", pgmCodeIn);
			cmd.addParameter("@MAJR_CODE_IN", majrCodeIn);
			cmd.addParameter("@SARWALT_LETR_CODE_OUT", NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();
			sarwaltLetrCodeOut.val = cmd.getParameterValue("@SARWALT_LETR_CODE_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidSbgi(NString sbgiCodeIn,NString sbgiTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.F_VALID_SBGI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SBGI_CODE_IN", sbgiCodeIn);
			cmd.addParameter("@SBGI_TYPE_IN", sbgiTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCreateRecruitRows(NNumber aidmIn,NNumber applnoIn,NString commplanInd,NString sourceInd,NString sbgiSrceCode,NString cstsCodeIn,NString cactCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_CREATE_RECRUIT_ROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@COMMPLAN_IND", commplanInd);
			cmd.addParameter("@SOURCE_IND", sourceInd);
			cmd.addParameter("@SBGI_SRCE_CODE", sbgiSrceCode);
			cmd.addParameter("@CSTS_CODE_IN", cstsCodeIn);
			cmd.addParameter("@CACT_CODE_IN", cactCodeIn);
				
			cmd.execute();


		}
		
		public static void pDecisionProcessing(NString matchCodeIn,NString autoApplIndIn,NString termIn,NNumber aidmIn,NNumber applnoIn,NString wappIn,NNumber pidmIn,NString apdcCodeIn,NString oneRecApplIndIn,Ref<NString> autoTranInOut,Ref<NString> sarwaltLetrCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_DECISION_PROCESSING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MATCH_CODE_IN", matchCodeIn);
			cmd.addParameter("@AUTO_APPL_IND_IN", autoApplIndIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@WAPP_IN", wappIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APDC_CODE_IN", apdcCodeIn);
			cmd.addParameter("@ONE_REC_APPL_IND_IN", oneRecApplIndIn);
			cmd.addParameter("@AUTO_TRAN_IN_OUT", autoTranInOut, true);
			cmd.addParameter("@SARWALT_LETR_CODE_OUT", NString.class);
				
			cmd.execute();
			autoTranInOut.val = cmd.getParameterValue("@AUTO_TRAN_IN_OUT", NString.class);
			sarwaltLetrCodeOut.val = cmd.getParameterValue("@SARWALT_LETR_CODE_OUT", NString.class);


		}
		
		public static void pDeleteApplications(NNumber aidmIn,NNumber applnoIn,NString oneApplInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_DELETE_APPLICATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@ONE_APPL_IND", oneApplInd);
				
			cmd.execute();


		}
		
		public static void pDeleteFromSaradap(NNumber pidmIn,NString termIn,NNumber adapApplnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_DELETE_FROM_SARADAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ADAP_APPLNO_IN", adapApplnoIn);
				
			cmd.execute();


		}
		
		public static void pGetSaradap(NNumber pidmIn,NNumber applnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_GET_SARADAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
				
			cmd.execute();


		}
		
		public static void pGetWadfParams(NString wappIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_GET_WADF_PARAMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WAPP_IN", wappIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pGetid(NNumber aidm,Ref<NString> idNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_GETID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@ID_NUMBER", NString.class);
				
			cmd.execute();
			idNumber.val = cmd.getParameterValue("@ID_NUMBER", NString.class);


		}
		
		public static void pQuickAdmit(NNumber aidmIn,NNumber applnoIn,NString wappIn,NString termIn,Ref<NString> sarwaltLetrCodeOut,Ref<NString> autoTranOut,Ref<NString> matchCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_QUICK_ADMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@WAPP_IN", wappIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SARWALT_LETR_CODE_OUT", NString.class);
			cmd.addParameter("@AUTO_TRAN_OUT", NString.class);
			cmd.addParameter("@MATCH_CODE_OUT", NString.class);
				
			cmd.execute();
			sarwaltLetrCodeOut.val = cmd.getParameterValue("@SARWALT_LETR_CODE_OUT", NString.class);
			autoTranOut.val = cmd.getParameterValue("@AUTO_TRAN_OUT", NString.class);
			matchCodeOut.val = cmd.getParameterValue("@MATCH_CODE_OUT", NString.class);


		}
		
		public static void pSelectSarhsch(NNumber aidmIn,NNumber applnoIn,Ref<NString> sbgiCodeOut,Ref<NString> sbgiNameOut,Ref<NString> sbgiCityOut,Ref<NString> sbgiStateOut,Ref<NString> sbgiZipOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_SELECT_SARHSCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@SBGI_CODE_OUT", NString.class);
			cmd.addParameter("@SBGI_NAME_OUT", NString.class);
			cmd.addParameter("@SBGI_CITY_OUT", NString.class);
			cmd.addParameter("@SBGI_STATE_OUT", NString.class);
			cmd.addParameter("@SBGI_ZIP_OUT", NString.class);
				
			cmd.execute();
			sbgiCodeOut.val = cmd.getParameterValue("@SBGI_CODE_OUT", NString.class);
			sbgiNameOut.val = cmd.getParameterValue("@SBGI_NAME_OUT", NString.class);
			sbgiCityOut.val = cmd.getParameterValue("@SBGI_CITY_OUT", NString.class);
			sbgiStateOut.val = cmd.getParameterValue("@SBGI_STATE_OUT", NString.class);
			sbgiZipOut.val = cmd.getParameterValue("@SBGI_ZIP_OUT", NString.class);


		}
		
		public static void pSelectSarpers(NNumber aidmIn,NNumber applnoIn,Ref<NString> genderOut,Ref<NString> birthDaOut,Ref<NString> birthMoOut,Ref<NString> birthYrOut,Ref<NString> ssnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_SELECT_SARPERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@GENDER_OUT", NString.class);
			cmd.addParameter("@BIRTH_DA_OUT", NString.class);
			cmd.addParameter("@BIRTH_MO_OUT", NString.class);
			cmd.addParameter("@BIRTH_YR_OUT", NString.class);
			cmd.addParameter("@SSN_OUT", NString.class);
				
			cmd.execute();
			genderOut.val = cmd.getParameterValue("@GENDER_OUT", NString.class);
			birthDaOut.val = cmd.getParameterValue("@BIRTH_DA_OUT", NString.class);
			birthMoOut.val = cmd.getParameterValue("@BIRTH_MO_OUT", NString.class);
			birthYrOut.val = cmd.getParameterValue("@BIRTH_YR_OUT", NString.class);
			ssnOut.val = cmd.getParameterValue("@SSN_OUT", NString.class);


		}
		
		public static void pSelectSarwalt(NString wappIn,NString termIn,NString ltypCodeIn,Ref<NString> letrCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_SELECT_SARWALT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WAPP_IN", wappIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@LTYP_CODE_IN", ltypCodeIn);
			cmd.addParameter("@LETR_CODE_OUT", NString.class);
				
			cmd.execute();
			letrCodeOut.val = cmd.getParameterValue("@LETR_CODE_OUT", NString.class);


		}
		
		public static void pSelectSaveaps(NNumber aidmIn,NNumber applnoIn,Ref<NString> lastName,Ref<NString> firstName,Ref<NString> mi,Ref<NString> streetOut,Ref<NString> cityOut,Ref<NString> stateOut,Ref<NString> zipOut,Ref<NString> areaCodeOut,Ref<NString> phoneOut,Ref<NString> nationOut,Ref<NString> emailOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKQADM.P_SELECT_SAVEAPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPLNO_IN", applnoIn);
			cmd.addParameter("@LAST_NAME", NString.class);
			cmd.addParameter("@FIRST_NAME", NString.class);
			cmd.addParameter("@MI", NString.class);
			cmd.addParameter("@STREET_OUT", NString.class);
			cmd.addParameter("@CITY_OUT", NString.class);
			cmd.addParameter("@STATE_OUT", NString.class);
			cmd.addParameter("@ZIP_OUT", NString.class);
			cmd.addParameter("@AREA_CODE_OUT", NString.class);
			cmd.addParameter("@PHONE_OUT", NString.class);
			cmd.addParameter("@NATION_OUT", NString.class);
			cmd.addParameter("@EMAIL_OUT", NString.class);
				
			cmd.execute();
			lastName.val = cmd.getParameterValue("@LAST_NAME", NString.class);
			firstName.val = cmd.getParameterValue("@FIRST_NAME", NString.class);
			mi.val = cmd.getParameterValue("@MI", NString.class);
			streetOut.val = cmd.getParameterValue("@STREET_OUT", NString.class);
			cityOut.val = cmd.getParameterValue("@CITY_OUT", NString.class);
			stateOut.val = cmd.getParameterValue("@STATE_OUT", NString.class);
			zipOut.val = cmd.getParameterValue("@ZIP_OUT", NString.class);
			areaCodeOut.val = cmd.getParameterValue("@AREA_CODE_OUT", NString.class);
			phoneOut.val = cmd.getParameterValue("@PHONE_OUT", NString.class);
			nationOut.val = cmd.getParameterValue("@NATION_OUT", NString.class);
			emailOut.val = cmd.getParameterValue("@EMAIL_OUT", NString.class);


		}
		
	
	
	
}
