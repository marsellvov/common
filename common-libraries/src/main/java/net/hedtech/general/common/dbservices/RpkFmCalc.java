package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpkFmCalc {
		public static NString fGetJobsubInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_FM_CALC.F_GET_JOBSUB_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetToken() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_FM_CALC.F_GET_TOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetValue(NString pGroupName,NString pParameter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_FM_CALC.F_GET_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidToken(NString pToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_FM_CALC.F_VALID_TOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TOKEN", pToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteToken(NString pToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_FM_CALC.P_DELETE_TOKEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TOKEN", pToken);
				
			cmd.execute();


		}
		
		public static void pGetParameters(NString pAidy,NNumber pPidm,Ref<NString> pToken,Ref<NString> pParameters) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_FM_CALC.P_GET_PARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY", pAidy);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TOKEN", NString.class);
			cmd.addParameter("@P_PARAMETERS", NString.class);
				
			cmd.execute();
			pToken.val = cmd.getParameterValue("@P_TOKEN", NString.class);
			pParameters.val = cmd.getParameterValue("@P_PARAMETERS", NString.class);


		}
		
		public static void pGetUrl(Ref<NString> pUrl,Ref<NString> pErrInd,Ref<NString> pErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_FM_CALC.P_GET_URL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_URL", NString.class);
			cmd.addParameter("@P_ERR_IND", NString.class);
			cmd.addParameter("@P_ERR_MSG", NString.class);
				
			cmd.execute();
			pUrl.val = cmd.getParameterValue("@P_URL", NString.class);
			pErrInd.val = cmd.getParameterValue("@P_ERR_IND", NString.class);
			pErrMsg.val = cmd.getParameterValue("@P_ERR_MSG", NString.class);


		}
		
	
	
	
}
