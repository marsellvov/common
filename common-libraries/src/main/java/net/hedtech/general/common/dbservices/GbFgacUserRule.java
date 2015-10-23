package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbFgacUserRule {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno,NString pFgacUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FgacUserRuleRecRow recOne,FgacUserRuleRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FgacUserRuleRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FgacUserRuleRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno,NString pFgacUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno,NString pFgacUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno,NString pFgacUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno,NString pFgacUserId,NString pSelectInd,NString pInsertInd,NString pUpdateInd,NString pDeleteInd,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_SELECT_IND", pSelectInd);
			cmd.addParameter("@P_INSERT_IND", pInsertInd);
			cmd.addParameter("@P_UPDATE_IND", pUpdateInd);
			cmd.addParameter("@P_DELETE_IND", pDeleteInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno,NString pFgacUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno,NString pFgacUserId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pFgacCode,NString pFdmnCode,NNumber pFprdSeqno,NString pFgacUserId,NString pSelectInd,NString pInsertInd,NString pUpdateInd,NString pDeleteInd,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_FGAC_USER_RULE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_CODE", pFgacCode);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_FPRD_SEQNO", pFprdSeqno);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_SELECT_IND", pSelectInd);
			cmd.addParameter("@P_INSERT_IND", pInsertInd);
			cmd.addParameter("@P_UPDATE_IND", pUpdateInd);
			cmd.addParameter("@P_DELETE_IND", pDeleteInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FgacUserRuleRecRow", dataSourceName="FGAC_USER_RULE_REC")
	public static class FgacUserRuleRecRow
	{
		@DbRecordField(dataSourceName="R_FGAC_CODE")
		public NString RFgacCode;
		@DbRecordField(dataSourceName="R_FDMN_CODE")
		public NString RFdmnCode;
		@DbRecordField(dataSourceName="R_FPRD_SEQNO")
		public NNumber RFprdSeqno;
		@DbRecordField(dataSourceName="R_FGAC_USER_ID")
		public NString RFgacUserId;
		@DbRecordField(dataSourceName="R_SELECT_IND")
		public NString RSelectInd;
		@DbRecordField(dataSourceName="R_INSERT_IND")
		public NString RInsertInd;
		@DbRecordField(dataSourceName="R_UPDATE_IND")
		public NString RUpdateInd;
		@DbRecordField(dataSourceName="R_DELETE_IND")
		public NString RDeleteInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
