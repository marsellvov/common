package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFieldofstudyAllowed {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pLmodCode,NString pLfstCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetCount(NString pLmodCode,NString pLfstCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.F_GET_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsequal(FieldofstudyAllowedRecRow recOne,FieldofstudyAllowedRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FieldofstudyAllowedRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FieldofstudyAllowedRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pLmodCode,NString pLfstCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pLmodCode,NString pLfstCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pLmodCode,NString pLfstCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pLmodCode,NString pLfstCode,NString pTranWebInd,NString pSysReqInd,NNumber pMaxNumber,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_TRAN_WEB_IND", pTranWebInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_MAX_NUMBER", pMaxNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pLmodCode,NString pLfstCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pLmodCode,NString pLfstCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pLmodCode,NString pLfstCode,NString pTranWebInd,NString pSysReqInd,NNumber pMaxNumber,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_TRAN_WEB_IND", pTranWebInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_MAX_NUMBER", pMaxNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FieldofstudyAllowedRecRow", dataSourceName="FIELDOFSTUDY_ALLOWED_REC")
	public static class FieldofstudyAllowedRecRow
	{
		@DbRecordField(dataSourceName="R_LMOD_CODE")
		public NString RLmodCode;
		@DbRecordField(dataSourceName="R_LFST_CODE")
		public NString RLfstCode;
		@DbRecordField(dataSourceName="R_TRAN_WEB_IND")
		public NString RTranWebInd;
		@DbRecordField(dataSourceName="R_SYS_REQ_IND")
		public NString RSysReqInd;
		@DbRecordField(dataSourceName="R_MAX_NUMBER")
		public NNumber RMaxNumber;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
