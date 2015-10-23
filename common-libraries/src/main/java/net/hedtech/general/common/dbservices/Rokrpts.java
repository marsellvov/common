package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokrpts {
		public static NString fIsRepeatViolation(NNumber pPidm,NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKRPTS.F_IS_REPEAT_VIOLATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUseRepeatLogic(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKRPTS.F_USE_REPEAT_LOGIC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUseRepeatLogic(NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKRPTS.F_USE_REPEAT_LOGIC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRepeatCount(NNumber pPidm,NString pTermCode,NString pCrn,Ref<NInteger> pCountOut,Ref<NInteger> pCountNoWOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKRPTS.P_REPEAT_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_COUNT_OUT", NInteger.class);
			cmd.addParameter("@P_COUNT_NO_W_OUT", NInteger.class);
				
			cmd.execute();
			pCountOut.val = cmd.getParameterValue("@P_COUNT_OUT", NInteger.class);
			pCountNoWOut.val = cmd.getParameterValue("@P_COUNT_NO_W_OUT", NInteger.class);


		}
		
	
	
	
}
