package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokalgo {
		public static NBool fValidateSqlRule(NString pProcess,NString pPtypCode,NString pSqlStatement) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKALGO.F_VALIDATE_SQL_RULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_SQL_STATEMENT", pSqlStatement);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pExecuteRule(NString pAidyCode,NString pProcess,NString pPtypCode,NString pAlgoCode,NNumber pPidm,NString pFundCode,NString pPeriod,Ref<NString> pReturnCharOut,Ref<NNumber> pReturnNumberOut,Ref<NDate> pReturnDateOut,Ref<NNumber> pSeqNoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKALGO.P_EXECUTE_RULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ALGO_CODE", pAlgoCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_RETURN_CHAR_OUT", NString.class);
			cmd.addParameter("@P_RETURN_NUMBER_OUT", NNumber.class);
			cmd.addParameter("@P_RETURN_DATE_OUT", NDate.class);
			cmd.addParameter("@P_SEQ_NO_OUT", NNumber.class);
				
			cmd.execute();
			pReturnCharOut.val = cmd.getParameterValue("@P_RETURN_CHAR_OUT", NString.class);
			pReturnNumberOut.val = cmd.getParameterValue("@P_RETURN_NUMBER_OUT", NNumber.class);
			pReturnDateOut.val = cmd.getParameterValue("@P_RETURN_DATE_OUT", NDate.class);
			pSeqNoOut.val = cmd.getParameterValue("@P_SEQ_NO_OUT", NNumber.class);


		}
		
	
	
	
}
