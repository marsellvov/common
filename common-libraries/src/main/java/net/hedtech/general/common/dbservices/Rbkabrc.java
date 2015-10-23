package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rbkabrc {
		public static NBool fValidateSqlRule(NString pSqlStatement) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKABRC.F_VALIDATE_SQL_RULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SQL_STATEMENT", pSqlStatement);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCalcAlgorithmicAmount(NString pAidyCode,NString pAbrcCode,NNumber pPidm,NString pPbgpCode,NString pPbtpCode,NString pPbcpCode,NString pPeriod,Ref<NNumber> pAmtOut,Ref<NNumber> pSeqNoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKABRC.P_CALC_ALGORITHMIC_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ABRC_CODE", pAbrcCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_SEQ_NO_OUT", NNumber.class);
				
			cmd.execute();
			pAmtOut.val = cmd.getParameterValue("@P_AMT_OUT", NNumber.class);
			pSeqNoOut.val = cmd.getParameterValue("@P_SEQ_NO_OUT", NNumber.class);


		}
		
	
	
	
}
