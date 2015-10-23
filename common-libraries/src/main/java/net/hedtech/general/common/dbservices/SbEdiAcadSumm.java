package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiAcadSumm {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pDcmtSeqno,NNumber pGpaSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_GPA_SEQNO", pGpaSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EdiAcadSummRecRow recOne,EdiAcadSummRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EdiAcadSummRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EdiAcadSummRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pDcmtSeqno,NNumber pGpaSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_GPA_SEQNO", pGpaSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pDcmtSeqno,NNumber pGpaSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_GPA_SEQNO", pGpaSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pDcmtSeqno,NNumber pGpaSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_GPA_SEQNO", pGpaSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pDcmtSeqno,NNumber pGpaSeqno,NString pCtypCode,NString pSlvlCode,NNumber pGpaHours,NNumber pHoursAttempted,NNumber pHoursEarned,NNumber pGpaLow,NNumber pGpaHigh,NNumber pGpa,NString pGpaExcessInd,NNumber pClassRank,NNumber pClassSize,NString pRdqlCode,NString pRankDate,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_GPA_SEQNO", pGpaSeqno);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_SLVL_CODE", pSlvlCode);
			cmd.addParameter("@P_GPA_HOURS", pGpaHours);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_GPA_LOW", pGpaLow);
			cmd.addParameter("@P_GPA_HIGH", pGpaHigh);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_GPA_EXCESS_IND", pGpaExcessInd);
			cmd.addParameter("@P_CLASS_RANK", pClassRank);
			cmd.addParameter("@P_CLASS_SIZE", pClassSize);
			cmd.addParameter("@P_RDQL_CODE", pRdqlCode);
			cmd.addParameter("@P_RANK_DATE", pRankDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pDcmtSeqno,NNumber pGpaSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_GPA_SEQNO", pGpaSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pDcmtSeqno,NNumber pGpaSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_GPA_SEQNO", pGpaSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pDcmtSeqno,NNumber pGpaSeqno,NString pCtypCode,NString pSlvlCode,NNumber pGpaHours,NNumber pHoursAttempted,NNumber pHoursEarned,NNumber pGpaLow,NNumber pGpaHigh,NNumber pGpa,NString pGpaExcessInd,NNumber pClassRank,NNumber pClassSize,NString pRdqlCode,NString pRankDate,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SUMM.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_GPA_SEQNO", pGpaSeqno);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_SLVL_CODE", pSlvlCode);
			cmd.addParameter("@P_GPA_HOURS", pGpaHours);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_GPA_LOW", pGpaLow);
			cmd.addParameter("@P_GPA_HIGH", pGpaHigh);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_GPA_EXCESS_IND", pGpaExcessInd);
			cmd.addParameter("@P_CLASS_RANK", pClassRank);
			cmd.addParameter("@P_CLASS_SIZE", pClassSize);
			cmd.addParameter("@P_RDQL_CODE", pRdqlCode);
			cmd.addParameter("@P_RANK_DATE", pRankDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EdiAcadSummRecRow", dataSourceName="EDI_ACAD_SUMM_REC")
	public static class EdiAcadSummRecRow
	{
		@DbRecordField(dataSourceName="R_DCMT_SEQNO")
		public NNumber RDcmtSeqno;
		@DbRecordField(dataSourceName="R_GPA_SEQNO")
		public NNumber RGpaSeqno;
		@DbRecordField(dataSourceName="R_CTYP_CODE")
		public NString RCtypCode;
		@DbRecordField(dataSourceName="R_SLVL_CODE")
		public NString RSlvlCode;
		@DbRecordField(dataSourceName="R_GPA_HOURS")
		public NNumber RGpaHours;
		@DbRecordField(dataSourceName="R_HOURS_ATTEMPTED")
		public NNumber RHoursAttempted;
		@DbRecordField(dataSourceName="R_HOURS_EARNED")
		public NNumber RHoursEarned;
		@DbRecordField(dataSourceName="R_GPA_LOW")
		public NNumber RGpaLow;
		@DbRecordField(dataSourceName="R_GPA_HIGH")
		public NNumber RGpaHigh;
		@DbRecordField(dataSourceName="R_GPA")
		public NNumber RGpa;
		@DbRecordField(dataSourceName="R_GPA_EXCESS_IND")
		public NString RGpaExcessInd;
		@DbRecordField(dataSourceName="R_CLASS_RANK")
		public NNumber RClassRank;
		@DbRecordField(dataSourceName="R_CLASS_SIZE")
		public NNumber RClassSize;
		@DbRecordField(dataSourceName="R_RDQL_CODE")
		public NString RRdqlCode;
		@DbRecordField(dataSourceName="R_RANK_DATE")
		public NString RRankDate;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
