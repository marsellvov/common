package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvrsrel {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GvrsrelRecRow recOne,GvrsrelRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GvrsrelRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GvrsrelRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NString pQcodCode,NString pAcodCode,NString pGsrcCodeRef,NDate pActivityDate,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_QCOD_CODE", pQcodCode);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NString pQcodCode,NString pAcodCode,NString pGsrcCodeRef,NDate pActivityDate,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSREL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_QCOD_CODE", pQcodCode);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="GvrsrelRecRow", dataSourceName="GVRSREL_REC", needsInitialization=true)
	public static class GvrsrelRecRow
	{
		@DbRecordField(dataSourceName="R_GSRC_CODE")
		public NString RGsrcCode;
		@DbRecordField(dataSourceName="R_SDEF_SEQ_NUM")
		public NNumber RSdefSeqNum;
		@DbRecordField(dataSourceName="R_PVAC_SEQ_NUM")
		public NNumber RPvacSeqNum;
		@DbRecordField(dataSourceName="R_QCOD_CODE")
		public NString RQcodCode;
		@DbRecordField(dataSourceName="R_ACOD_CODE")
		public NString RAcodCode;
		@DbRecordField(dataSourceName="R_GSRC_CODE_REF")
		public NString RGsrcCodeRef;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
