package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdlif {
		public static NBool fIsdednfuncallowedLec(NString inScope,NString inFunc,NString inCode,NString inBenefitGroup,NString inBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDLIF.F_ISDEDNFUNCALLOWED_LEC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_SCOPE", inScope);
			cmd.addParameter("@IN_FUNC", inFunc);
			cmd.addParameter("@IN_CODE", inCode);
			cmd.addParameter("@IN_BENEFIT_GROUP", inBenefitGroup);
			cmd.addParameter("@IN_BREA_CODE", inBreaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fString(NString pStringName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDLIF.F_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING_NAME", pStringName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pChooseLifechgReason(NString pSelectedReason,NString pEventDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDLIF.P_CHOOSE_LIFECHG_REASON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SELECTED_REASON", pSelectedReason);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
				
			cmd.execute();


		}
		
		public static void pClearLecChoices(NNumber pPidm,NString pBrea,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDLIF.P_CLEAR_LEC_CHOICES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BREA", pBrea);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();


		}
		
		public static void pCopybalctotbal(NNumber pPidm,NString pBdca) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDLIF.P_COPYBALCTOTBAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
				
			cmd.execute();


		}
		
		public static void pCopybcovtotcov(NNumber pPidm,NString pBdca) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDLIF.P_COPYBCOVTOTCOV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
				
			cmd.execute();


		}
		
		public static void pCopydedntodtoe(NNumber pPidm,NString pBdca,NDate pNewEffDate,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDLIF.P_COPYDEDNTODTOE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_NEW_EFF_DATE", pNewEffDate);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();


		}
		
		public static void pInitEnrollmentRecs(NNumber pPidm,NString pGroup,NString pBreaCode,NDate pEventDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDLIF.P_INIT_ENROLLMENT_RECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
				
			cmd.execute();


		}
		
		public static void pInitLifechgDates(NString pBreaCode,NDate pEventDate,Ref<NDate> pEnrlBeginDateOut,Ref<NDate> pEnrlEndDateOut,Ref<NDate> pBenefitEffdtOut,Ref<NDate> pEnrlBaseDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDLIF.P_INIT_LIFECHG_DATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
			cmd.addParameter("@P_ENRL_BEGIN_DATE_OUT", NDate.class);
			cmd.addParameter("@P_ENRL_END_DATE_OUT", NDate.class);
			cmd.addParameter("@P_BENEFIT_EFFDT_OUT", NDate.class);
			cmd.addParameter("@P_ENRL_BASE_DATE_OUT", NDate.class);
				
			cmd.execute();
			pEnrlBeginDateOut.val = cmd.getParameterValue("@P_ENRL_BEGIN_DATE_OUT", NDate.class);
			pEnrlEndDateOut.val = cmd.getParameterValue("@P_ENRL_END_DATE_OUT", NDate.class);
			pBenefitEffdtOut.val = cmd.getParameterValue("@P_BENEFIT_EFFDT_OUT", NDate.class);
			pEnrlBaseDateOut.val = cmd.getParameterValue("@P_ENRL_BASE_DATE_OUT", NDate.class);


		}
		
		public static void pLifechgEnrlMain(NNumber pPidm,NString pBreaCode,NDate pEventDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDLIF.P_LIFECHG_ENRL_MAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
				
			cmd.execute();


		}
		
	
	
	
}
