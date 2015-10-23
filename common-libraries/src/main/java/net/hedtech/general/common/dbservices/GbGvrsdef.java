package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvrsdef {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSeqNum,NString pGsrcCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GvrsdefRecRow recOne,GvrsdefRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GvrsdefRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GvrsdefRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pSeqNum,NString pGsrcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pSeqNum,NString pGsrcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pSeqNum,NString pGsrcCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pSeqNum,NString pGsrcCode,NNumber pSortNum,NString pQcodCode,NNumber pWeight,NNumber pTotalScore,NString pGsqaCode,NString pGsrcCodeRefInd,NString pOrientationInd,NString pMandatoryInd,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SORT_NUM", pSortNum);
			cmd.addParameter("@P_QCOD_CODE", pQcodCode);
			cmd.addParameter("@P_WEIGHT", pWeight);
			cmd.addParameter("@P_TOTAL_SCORE", pTotalScore);
			cmd.addParameter("@P_GSQA_CODE", pGsqaCode);
			cmd.addParameter("@P_GSRC_CODE_REF_IND", pGsrcCodeRefInd);
			cmd.addParameter("@P_ORIENTATION_IND", pOrientationInd);
			cmd.addParameter("@P_MANDATORY_IND", pMandatoryInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pSeqNum,NString pGsrcCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pSeqNum,NString pGsrcCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pSeqNum,NString pGsrcCode,NNumber pSortNum,NString pQcodCode,NNumber pWeight,NNumber pTotalScore,NString pGsqaCode,NString pGsrcCodeRefInd,NString pOrientationInd,NString pMandatoryInd,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSDEF.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SORT_NUM", pSortNum);
			cmd.addParameter("@P_QCOD_CODE", pQcodCode);
			cmd.addParameter("@P_WEIGHT", pWeight);
			cmd.addParameter("@P_TOTAL_SCORE", pTotalScore);
			cmd.addParameter("@P_GSQA_CODE", pGsqaCode);
			cmd.addParameter("@P_GSRC_CODE_REF_IND", pGsrcCodeRefInd);
			cmd.addParameter("@P_ORIENTATION_IND", pOrientationInd);
			cmd.addParameter("@P_MANDATORY_IND", pMandatoryInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="GvrsdefRecRow", dataSourceName="GVRSDEF_REC", needsInitialization=true)
	public static class GvrsdefRecRow
	{
		@DbRecordField(dataSourceName="R_SEQ_NUM")
		public NNumber RSeqNum;
		@DbRecordField(dataSourceName="R_GSRC_CODE")
		public NString RGsrcCode;
		@DbRecordField(dataSourceName="R_SORT_NUM")
		public NNumber RSortNum;
		@DbRecordField(dataSourceName="R_QCOD_CODE")
		public NString RQcodCode;
		@DbRecordField(dataSourceName="R_WEIGHT")
		public NNumber RWeight;
		@DbRecordField(dataSourceName="R_TOTAL_SCORE")
		public NNumber RTotalScore;
		@DbRecordField(dataSourceName="R_GSQA_CODE")
		public NString RGsqaCode;
		@DbRecordField(dataSourceName="R_GSRC_CODE_REF_IND")
		public NString RGsrcCodeRefInd;
		@DbRecordField(dataSourceName="R_ORIENTATION_IND")
		public NString ROrientationInd;
		@DbRecordField(dataSourceName="R_MANDATORY_IND")
		public NString RMandatoryInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
