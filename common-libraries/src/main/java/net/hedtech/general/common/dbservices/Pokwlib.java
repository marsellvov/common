package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pokwlib {
		public static void pGetCitizenCode(NString parId,Ref<NString> parCitzCode,Ref<NString> parGotCitzCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKWLIB.P_GET_CITIZEN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ID", parId);
			cmd.addParameter("@PAR_CITZ_CODE", NString.class);
			cmd.addParameter("@PAR_GOT_CITZ_CODE", NString.class);
				
			cmd.execute();
			parCitzCode.val = cmd.getParameterValue("@PAR_CITZ_CODE", NString.class);
			parGotCitzCode.val = cmd.getParameterValue("@PAR_GOT_CITZ_CODE", NString.class);


		}
		
		public static void pGetEmplInfo(NString parId,Ref<NString> parFirstName,Ref<NString> parLastName,Ref<NString> parMi,Ref<NString> parHomeCoas,Ref<NString> parHomeOrgn,Ref<NString> parOrgnDesc,Ref<NString> parEclsCode,Ref<NString> parEclsDesc,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKWLIB.P_GET_EMPL_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ID", parId);
			cmd.addParameter("@PAR_FIRST_NAME", NString.class);
			cmd.addParameter("@PAR_LAST_NAME", NString.class);
			cmd.addParameter("@PAR_MI", NString.class);
			cmd.addParameter("@PAR_HOME_COAS", NString.class);
			cmd.addParameter("@PAR_HOME_ORGN", NString.class);
			cmd.addParameter("@PAR_ORGN_DESC", NString.class);
			cmd.addParameter("@PAR_ECLS_CODE", NString.class);
			cmd.addParameter("@PAR_ECLS_DESC", NString.class);
			cmd.addParameter("@MSG", NString.class);
			cmd.addParameter("@MSG_TYPE", NString.class);
				
			cmd.execute();
			parFirstName.val = cmd.getParameterValue("@PAR_FIRST_NAME", NString.class);
			parLastName.val = cmd.getParameterValue("@PAR_LAST_NAME", NString.class);
			parMi.val = cmd.getParameterValue("@PAR_MI", NString.class);
			parHomeCoas.val = cmd.getParameterValue("@PAR_HOME_COAS", NString.class);
			parHomeOrgn.val = cmd.getParameterValue("@PAR_HOME_ORGN", NString.class);
			parOrgnDesc.val = cmd.getParameterValue("@PAR_ORGN_DESC", NString.class);
			parEclsCode.val = cmd.getParameterValue("@PAR_ECLS_CODE", NString.class);
			parEclsDesc.val = cmd.getParameterValue("@PAR_ECLS_DESC", NString.class);
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static void pGetJobsInfo(NString parId,NString parPosn,Ref<NString> parSuff,Ref<NString> parDesc,Ref<NNumber> parAnnSalary,Ref<NString> parCoasCodeTs,Ref<NString> parOrgnCodeTs,Ref<NString> parOrgnDesc,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKWLIB.P_GET_JOBS_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ID", parId);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", NString.class);
			cmd.addParameter("@PAR_DESC", NString.class);
			cmd.addParameter("@PAR_ANN_SALARY", NNumber.class);
			cmd.addParameter("@PAR_COAS_CODE_TS", NString.class);
			cmd.addParameter("@PAR_ORGN_CODE_TS", NString.class);
			cmd.addParameter("@PAR_ORGN_DESC", NString.class);
			cmd.addParameter("@MSG", NString.class);
			cmd.addParameter("@MSG_TYPE", NString.class);
				
			cmd.execute();
			parSuff.val = cmd.getParameterValue("@PAR_SUFF", NString.class);
			parDesc.val = cmd.getParameterValue("@PAR_DESC", NString.class);
			parAnnSalary.val = cmd.getParameterValue("@PAR_ANN_SALARY", NNumber.class);
			parCoasCodeTs.val = cmd.getParameterValue("@PAR_COAS_CODE_TS", NString.class);
			parOrgnCodeTs.val = cmd.getParameterValue("@PAR_ORGN_CODE_TS", NString.class);
			parOrgnDesc.val = cmd.getParameterValue("@PAR_ORGN_DESC", NString.class);
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static void pGetPafPosnInfo(NNumber parTransNum,Ref<NString> parPosn,Ref<NString> parPosnDesc,Ref<NString> parOriginatorUserid,Ref<NString> parOriginatorFirstName,Ref<NString> parOriginatorLastName,Ref<NString> msg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKWLIB.P_GET_PAF_POSN_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_TRANS_NUM", parTransNum);
			cmd.addParameter("@PAR_POSN", NString.class);
			cmd.addParameter("@PAR_POSN_DESC", NString.class);
			cmd.addParameter("@PAR_ORIGINATOR_USERID", NString.class);
			cmd.addParameter("@PAR_ORIGINATOR_FIRST_NAME", NString.class);
			cmd.addParameter("@PAR_ORIGINATOR_LAST_NAME", NString.class);
			cmd.addParameter("@MSG", NString.class);
				
			cmd.execute();
			parPosn.val = cmd.getParameterValue("@PAR_POSN", NString.class);
			parPosnDesc.val = cmd.getParameterValue("@PAR_POSN_DESC", NString.class);
			parOriginatorUserid.val = cmd.getParameterValue("@PAR_ORIGINATOR_USERID", NString.class);
			parOriginatorFirstName.val = cmd.getParameterValue("@PAR_ORIGINATOR_FIRST_NAME", NString.class);
			parOriginatorLastName.val = cmd.getParameterValue("@PAR_ORIGINATOR_LAST_NAME", NString.class);
			msg.val = cmd.getParameterValue("@MSG", NString.class);


		}
		
		public static void pGetVisaCode(NString parId,NString parAsOfDateInfo,Ref<NString> parVisaCode,Ref<NString> parGotVisaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKWLIB.P_GET_VISA_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ID", parId);
			cmd.addParameter("@PAR_AS_OF_DATE_INFO", parAsOfDateInfo);
			cmd.addParameter("@PAR_VISA_CODE", NString.class);
			cmd.addParameter("@PAR_GOT_VISA_CODE", NString.class);
				
			cmd.execute();
			parVisaCode.val = cmd.getParameterValue("@PAR_VISA_CODE", NString.class);
			parGotVisaCode.val = cmd.getParameterValue("@PAR_GOT_VISA_CODE", NString.class);


		}
		
	
	
	
}
