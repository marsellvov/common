package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpkCommonValidationUs {
		public static NString fCipCodeValid(NString pCipCode,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_COMMON_VALIDATION_US.F_CIP_CODE_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CIP_CODE", pCipCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsCitizen(NNumber pPidm,NString pAidyCode,NString pFedFundId,NString pCitzInd,NString pSsaCitizenInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_COMMON_VALIDATION_US.F_IS_CITIZEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_CITZ_IND", pCitzInd);
			cmd.addParameter("@P_SSA_CITIZEN_IND", pSsaCitizenInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPellEfcIsDetermined(NString pFedFundId,NNumber pPellPgi) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_COMMON_VALIDATION_US.F_PELL_EFC_IS_DETERMINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_PELL_PGI", pPellPgi);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSahpCodeValid(NString pSahpCode,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_COMMON_VALIDATION_US.F_SAHP_CODE_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SAHP_CODE", pSahpCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValDegreeByJuly(NString pFedFundId,NString pDegreeByJuly,NString pPostBaPellOvrd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_COMMON_VALIDATION_US.F_VAL_DEGREE_BY_JULY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_DEGREE_BY_JULY", pDegreeByJuly);
			cmd.addParameter("@P_POST_BA_PELL_OVRD", pPostBaPellOvrd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
