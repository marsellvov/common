package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbAlgoSupport {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NString pKey1,NString pKey2,NString pKey3,NString pKey4,NString pKey5,NString pKey6,NString pKey7,NString pKey8,NString pKey9,NString pKey10,NString pKey11,NString pKey12,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_KEY_3", pKey3);
			cmd.addParameter("@P_KEY_4", pKey4);
			cmd.addParameter("@P_KEY_5", pKey5);
			cmd.addParameter("@P_KEY_6", pKey6);
			cmd.addParameter("@P_KEY_7", pKey7);
			cmd.addParameter("@P_KEY_8", pKey8);
			cmd.addParameter("@P_KEY_9", pKey9);
			cmd.addParameter("@P_KEY_10", pKey10);
			cmd.addParameter("@P_KEY_11", pKey11);
			cmd.addParameter("@P_KEY_12", pKey12);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AlgoSupportRecRow recOne,AlgoSupportRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AlgoSupportRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AlgoSupportRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NString pKey1,NString pKey2,NString pKey3,NString pKey4,NString pKey5,NString pKey6,NString pKey7,NString pKey8,NString pKey9,NString pKey10,NString pKey11,NString pKey12) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_KEY_3", pKey3);
			cmd.addParameter("@P_KEY_4", pKey4);
			cmd.addParameter("@P_KEY_5", pKey5);
			cmd.addParameter("@P_KEY_6", pKey6);
			cmd.addParameter("@P_KEY_7", pKey7);
			cmd.addParameter("@P_KEY_8", pKey8);
			cmd.addParameter("@P_KEY_9", pKey9);
			cmd.addParameter("@P_KEY_10", pKey10);
			cmd.addParameter("@P_KEY_11", pKey11);
			cmd.addParameter("@P_KEY_12", pKey12);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NString pKey1,NString pKey2,NString pKey3,NString pKey4,NString pKey5,NString pKey6,NString pKey7,NString pKey8,NString pKey9,NString pKey10,NString pKey11,NString pKey12) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_KEY_3", pKey3);
			cmd.addParameter("@P_KEY_4", pKey4);
			cmd.addParameter("@P_KEY_5", pKey5);
			cmd.addParameter("@P_KEY_6", pKey6);
			cmd.addParameter("@P_KEY_7", pKey7);
			cmd.addParameter("@P_KEY_8", pKey8);
			cmd.addParameter("@P_KEY_9", pKey9);
			cmd.addParameter("@P_KEY_10", pKey10);
			cmd.addParameter("@P_KEY_11", pKey11);
			cmd.addParameter("@P_KEY_12", pKey12);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NString pKey1,NString pKey2,NString pKey3,NString pKey4,NString pKey5,NString pKey6,NString pKey7,NString pKey8,NString pKey9,NString pKey10,NString pKey11,NString pKey12,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_KEY_3", pKey3);
			cmd.addParameter("@P_KEY_4", pKey4);
			cmd.addParameter("@P_KEY_5", pKey5);
			cmd.addParameter("@P_KEY_6", pKey6);
			cmd.addParameter("@P_KEY_7", pKey7);
			cmd.addParameter("@P_KEY_8", pKey8);
			cmd.addParameter("@P_KEY_9", pKey9);
			cmd.addParameter("@P_KEY_10", pKey10);
			cmd.addParameter("@P_KEY_11", pKey11);
			cmd.addParameter("@P_KEY_12", pKey12);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pAmt,NString pKey1,NString pKey2,NString pKey3,NString pKey4,NString pKey5,NString pKey6,NString pKey7,NString pKey8,NString pKey9,NString pKey10,NString pKey11,NString pKey12,NString pComment1,NString pComment2,NString pComment3,NString pComment4,NString pComment5,NString pComment6,NString pComment7,NString pComment8,NString pComment9,NString pComment10,NString pComment11,NString pComment12,NString pComment,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_KEY_3", pKey3);
			cmd.addParameter("@P_KEY_4", pKey4);
			cmd.addParameter("@P_KEY_5", pKey5);
			cmd.addParameter("@P_KEY_6", pKey6);
			cmd.addParameter("@P_KEY_7", pKey7);
			cmd.addParameter("@P_KEY_8", pKey8);
			cmd.addParameter("@P_KEY_9", pKey9);
			cmd.addParameter("@P_KEY_10", pKey10);
			cmd.addParameter("@P_KEY_11", pKey11);
			cmd.addParameter("@P_KEY_12", pKey12);
			cmd.addParameter("@P_COMMENT_1", pComment1);
			cmd.addParameter("@P_COMMENT_2", pComment2);
			cmd.addParameter("@P_COMMENT_3", pComment3);
			cmd.addParameter("@P_COMMENT_4", pComment4);
			cmd.addParameter("@P_COMMENT_5", pComment5);
			cmd.addParameter("@P_COMMENT_6", pComment6);
			cmd.addParameter("@P_COMMENT_7", pComment7);
			cmd.addParameter("@P_COMMENT_8", pComment8);
			cmd.addParameter("@P_COMMENT_9", pComment9);
			cmd.addParameter("@P_COMMENT_10", pComment10);
			cmd.addParameter("@P_COMMENT_11", pComment11);
			cmd.addParameter("@P_COMMENT_12", pComment12);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NString pKey1,NString pKey2,NString pKey3,NString pKey4,NString pKey5,NString pKey6,NString pKey7,NString pKey8,NString pKey9,NString pKey10,NString pKey11,NString pKey12,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_KEY_3", pKey3);
			cmd.addParameter("@P_KEY_4", pKey4);
			cmd.addParameter("@P_KEY_5", pKey5);
			cmd.addParameter("@P_KEY_6", pKey6);
			cmd.addParameter("@P_KEY_7", pKey7);
			cmd.addParameter("@P_KEY_8", pKey8);
			cmd.addParameter("@P_KEY_9", pKey9);
			cmd.addParameter("@P_KEY_10", pKey10);
			cmd.addParameter("@P_KEY_11", pKey11);
			cmd.addParameter("@P_KEY_12", pKey12);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NString pKey1,NString pKey2,NString pKey3,NString pKey4,NString pKey5,NString pKey6,NString pKey7,NString pKey8,NString pKey9,NString pKey10,NString pKey11,NString pKey12,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_KEY_3", pKey3);
			cmd.addParameter("@P_KEY_4", pKey4);
			cmd.addParameter("@P_KEY_5", pKey5);
			cmd.addParameter("@P_KEY_6", pKey6);
			cmd.addParameter("@P_KEY_7", pKey7);
			cmd.addParameter("@P_KEY_8", pKey8);
			cmd.addParameter("@P_KEY_9", pKey9);
			cmd.addParameter("@P_KEY_10", pKey10);
			cmd.addParameter("@P_KEY_11", pKey11);
			cmd.addParameter("@P_KEY_12", pKey12);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pAmt,NString pKey1,NString pKey2,NString pKey3,NString pKey4,NString pKey5,NString pKey6,NString pKey7,NString pKey8,NString pKey9,NString pKey10,NString pKey11,NString pKey12,NString pComment1,NString pComment2,NString pComment3,NString pComment4,NString pComment5,NString pComment6,NString pComment7,NString pComment8,NString pComment9,NString pComment10,NString pComment11,NString pComment12,NString pComment,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ALGO_SUPPORT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_KEY_1", pKey1);
			cmd.addParameter("@P_KEY_2", pKey2);
			cmd.addParameter("@P_KEY_3", pKey3);
			cmd.addParameter("@P_KEY_4", pKey4);
			cmd.addParameter("@P_KEY_5", pKey5);
			cmd.addParameter("@P_KEY_6", pKey6);
			cmd.addParameter("@P_KEY_7", pKey7);
			cmd.addParameter("@P_KEY_8", pKey8);
			cmd.addParameter("@P_KEY_9", pKey9);
			cmd.addParameter("@P_KEY_10", pKey10);
			cmd.addParameter("@P_KEY_11", pKey11);
			cmd.addParameter("@P_KEY_12", pKey12);
			cmd.addParameter("@P_COMMENT_1", pComment1);
			cmd.addParameter("@P_COMMENT_2", pComment2);
			cmd.addParameter("@P_COMMENT_3", pComment3);
			cmd.addParameter("@P_COMMENT_4", pComment4);
			cmd.addParameter("@P_COMMENT_5", pComment5);
			cmd.addParameter("@P_COMMENT_6", pComment6);
			cmd.addParameter("@P_COMMENT_7", pComment7);
			cmd.addParameter("@P_COMMENT_8", pComment8);
			cmd.addParameter("@P_COMMENT_9", pComment9);
			cmd.addParameter("@P_COMMENT_10", pComment10);
			cmd.addParameter("@P_COMMENT_11", pComment11);
			cmd.addParameter("@P_COMMENT_12", pComment12);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AlgoSupportRecRow", dataSourceName="ALGO_SUPPORT_REC")
	public static class AlgoSupportRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_AMT")
		public NNumber RAmt;
		@DbRecordField(dataSourceName="R_KEY_1")
		public NString RKey1;
		@DbRecordField(dataSourceName="R_KEY_2")
		public NString RKey2;
		@DbRecordField(dataSourceName="R_KEY_3")
		public NString RKey3;
		@DbRecordField(dataSourceName="R_KEY_4")
		public NString RKey4;
		@DbRecordField(dataSourceName="R_KEY_5")
		public NString RKey5;
		@DbRecordField(dataSourceName="R_KEY_6")
		public NString RKey6;
		@DbRecordField(dataSourceName="R_KEY_7")
		public NString RKey7;
		@DbRecordField(dataSourceName="R_KEY_8")
		public NString RKey8;
		@DbRecordField(dataSourceName="R_KEY_9")
		public NString RKey9;
		@DbRecordField(dataSourceName="R_KEY_10")
		public NString RKey10;
		@DbRecordField(dataSourceName="R_KEY_11")
		public NString RKey11;
		@DbRecordField(dataSourceName="R_KEY_12")
		public NString RKey12;
		@DbRecordField(dataSourceName="R_COMMENT_1")
		public NString RComment1;
		@DbRecordField(dataSourceName="R_COMMENT_2")
		public NString RComment2;
		@DbRecordField(dataSourceName="R_COMMENT_3")
		public NString RComment3;
		@DbRecordField(dataSourceName="R_COMMENT_4")
		public NString RComment4;
		@DbRecordField(dataSourceName="R_COMMENT_5")
		public NString RComment5;
		@DbRecordField(dataSourceName="R_COMMENT_6")
		public NString RComment6;
		@DbRecordField(dataSourceName="R_COMMENT_7")
		public NString RComment7;
		@DbRecordField(dataSourceName="R_COMMENT_8")
		public NString RComment8;
		@DbRecordField(dataSourceName="R_COMMENT_9")
		public NString RComment9;
		@DbRecordField(dataSourceName="R_COMMENT_10")
		public NString RComment10;
		@DbRecordField(dataSourceName="R_COMMENT_11")
		public NString RComment11;
		@DbRecordField(dataSourceName="R_COMMENT_12")
		public NString RComment12;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
