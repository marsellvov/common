package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TpStudentReceivable {
		public static NString fAddStdnAcctTrans(NString pXt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_STUDENT_RECEIVABLE.F_ADD_STDN_ACCT_TRANS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_XT", pXt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fAddStdnAcctTrans(NString pRequestOot,NString pSetContext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_STUDENT_RECEIVABLE.F_ADD_STDN_ACCT_TRANS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REQUEST_OOT", pRequestOot);
			cmd.addParameter("@P_SET_CONTEXT", pSetContext);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fAddStdnAcctTransSource(NString pXt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_STUDENT_RECEIVABLE.F_ADD_STDN_ACCT_TRANS_SOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_XT", pXt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fAddStdnAcctTransSystem(NString pXt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TP_STUDENT_RECEIVABLE.F_ADD_STDN_ACCT_TRANS_SYSTEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_XT", pXt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
