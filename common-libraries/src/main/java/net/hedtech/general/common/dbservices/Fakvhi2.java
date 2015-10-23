package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fakvhi2 {
		public static NNumber fGetCreditMemoAmt(NNumber pidmIn,NString fsyrIn,NString cancelInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FAKVHI2.F_GET_CREDIT_MEMO_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@FSYR_IN", fsyrIn);
			cmd.addParameter("@CANCEL_IND", cancelInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetCreditMemoCount(NNumber pidmIn,NString fsyrIn,NString cancelInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FAKVHI2.F_GET_CREDIT_MEMO_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@FSYR_IN", fsyrIn);
			cmd.addParameter("@CANCEL_IND", cancelInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetOpenAmt(NNumber pidmIn,NString fsyrIn,NString cancelInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FAKVHI2.F_GET_OPEN_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@FSYR_IN", fsyrIn);
			cmd.addParameter("@CANCEL_IND", cancelInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetOpenCount(NNumber pidmIn,NString fsyrIn,NString cancelInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FAKVHI2.F_GET_OPEN_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@FSYR_IN", fsyrIn);
			cmd.addParameter("@CANCEL_IND", cancelInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPaidAmt(NNumber pidmIn,NString fsyrIn,NString cancelInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FAKVHI2.F_GET_PAID_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@FSYR_IN", fsyrIn);
			cmd.addParameter("@CANCEL_IND", cancelInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPaidCount(NNumber pidmIn,NString fsyrIn,NString cancelInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FAKVHI2.F_GET_PAID_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@FSYR_IN", fsyrIn);
			cmd.addParameter("@CANCEL_IND", cancelInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
