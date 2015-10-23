package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;



public class GbCmDispHier {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCmscCode,NString pHierType,NNumber pHierSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_HIER_TYPE", pHierType);
			cmd.addParameter("@P_HIER_SEQ_NO", pHierSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsByTypeSeqCode(NString pCmscCode,NString pHierType,NNumber pHierSeqNo,NString pHierCode) {
			NString pRowid = NString.getNull();
			return fExistsByTypeSeqCode( pCmscCode, pHierType, pHierSeqNo, pHierCode, pRowid);
		}
		
		public static NString fExistsByTypeSeqCode(NString pCmscCode,NString pHierType,NNumber pHierSeqNo,NString pHierCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.F_EXISTS_BY_TYPE_SEQ_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_HIER_TYPE", pHierType);
			cmd.addParameter("@P_HIER_SEQ_NO", pHierSeqNo);
			cmd.addParameter("@P_HIER_CODE", pHierCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CmDispHierRecRow recOne,CmDispHierRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CmDispHierRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CmDispHierRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		//JM (1/6/2015) changed return type to Cursor
		public static Cursor fQueryAll(NString pCmscCode,NString pHierType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_HIER_TYPE", pHierType);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCmscCode,NString pHierType,NNumber pHierSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_HIER_TYPE", pHierType);
			cmd.addParameter("@P_HIER_SEQ_NO", pHierSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCmscCode,NString pHierType,NNumber pHierSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_HIER_TYPE", pHierType);
			cmd.addParameter("@P_HIER_SEQ_NO", pHierSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCmscCode,NString pHierType,NNumber pHierSeqNo,NString pHierCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_HIER_TYPE", pHierType);
			cmd.addParameter("@P_HIER_SEQ_NO", pHierSeqNo);
			cmd.addParameter("@P_HIER_CODE", pHierCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCmscCode,NString pHierType,NNumber pHierSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_HIER_TYPE", pHierType);
			cmd.addParameter("@P_HIER_SEQ_NO", pHierSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCmscCode,NString pHierType,NNumber pHierSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_HIER_TYPE", pHierType);
			cmd.addParameter("@P_HIER_SEQ_NO", pHierSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCmscCode,NString pHierType,NNumber pHierSeqNo,NString pHierCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DISP_HIER.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_HIER_TYPE", pHierType);
			cmd.addParameter("@P_HIER_SEQ_NO", pHierSeqNo);
			cmd.addParameter("@P_HIER_CODE", pHierCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CmDispHierRecRow", dataSourceName="CM_DISP_HIER_REC")
	public static class CmDispHierRecRow
	{
		@DbRecordField(dataSourceName="R_CMSC_CODE")
		public NString RCmscCode;
		@DbRecordField(dataSourceName="R_HIER_TYPE")
		public NString RHierType;
		@DbRecordField(dataSourceName="R_HIER_SEQ_NO")
		public NNumber RHierSeqNo;
		@DbRecordField(dataSourceName="R_HIER_CODE")
		public NString RHierCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public CmDispHierRecRow(){
			super();
		}
		
		public CmDispHierRecRow(Row lvCmdhRefResults)
		{
			super();
			RCmscCode = toStr(lvCmdhRefResults.getObject(1));
			RHierType = toStr(lvCmdhRefResults.getObject(2));
			RHierSeqNo = toNumber(lvCmdhRefResults.getObject(3));
			RHierCode = toStr(lvCmdhRefResults.getObject(4));
			RUserId = toStr(lvCmdhRefResults.getObject(5));
			RDataOrigin = toStr(lvCmdhRefResults.getObject(6));
			RInternalRecordId = toStr(lvCmdhRefResults.getObject(7));
		}
	}

	
	
}
