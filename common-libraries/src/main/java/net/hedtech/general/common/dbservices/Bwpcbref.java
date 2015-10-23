package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpcbref {
		public static NString fGetEpafQueueStatus(NString pQueueStatusDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBREF.F_GET_EPAF_QUEUE_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_QUEUE_STATUS_DESC", pQueueStatusDesc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetNtvacatDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBREF.F_GET_NTVACAT_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetNullRevwPosn(NNumber parPidm,NDate parAsOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBREF.F_GET_NULL_REVW_POSN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_AS_OF_DATE", parAsOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetusername(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBREF.F_GETUSERNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  fRoutRowid(NString pUsername,NNumber pTransNo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBREF.F_ROUT_ROWID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_USERNAME", pUsername);
//			cmd.addParameter("@P_TRANS_NO", pTransNo);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void pGetEpaf(NString pUsername,NString pNtvacatCode,NString pNorroutQue,Ref<DataCursor> pEmpEpafRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBREF.P_GET_EPAF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_NTVACAT_CODE", pNtvacatCode);
			cmd.addParameter("@P_NORROUT_QUE", pNorroutQue);
			cmd.addParameter("@P_EMP_EPAF_REF", DataCursor.class);
				
			cmd.execute();
			pEmpEpafRef.val = cmd.getParameterValue("@P_EMP_EPAF_REF", DataCursor.class);


		}
		
		public static void pGetNtvacat(Ref<DataCursor> pNtvacat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBREF.P_GET_NTVACAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NTVACAT", DataCursor.class);
				
			cmd.execute();
			pNtvacat.val = cmd.getParameterValue("@P_NTVACAT", DataCursor.class);


		}
		
		public static void pGetTimeApproval(NString pUsername,NNumber pPidm,NString pAction,NString pStatus,Ref<DataCursor> pTimeApproveRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBREF.P_GET_TIME_APPROVAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERNAME", pUsername);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACTION", pAction);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_TIME_APPROVE_REF", DataCursor.class);
				
			cmd.execute();
			pTimeApproveRef.val = cmd.getParameterValue("@P_TIME_APPROVE_REF", DataCursor.class);


		}
		
	
	
	
}
