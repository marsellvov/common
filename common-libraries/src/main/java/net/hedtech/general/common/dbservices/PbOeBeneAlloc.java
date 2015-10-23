package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbOeBeneAlloc {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(OeBeneAllocRecRow recOne,OeBeneAllocRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, OeBeneAllocRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, OeBeneAllocRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pPrimaryInd,NString pOpenEnrollInd,NString pUserId,NString pDataOrigin,NNumber pPrimaryAllocPct,NNumber pContingentAllocPct,NNumber pPrimaryAllocAmt,NNumber pContingentAllocAmt,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_OPEN_ENROLL_IND", pOpenEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRIMARY_ALLOC_PCT", pPrimaryAllocPct);
			cmd.addParameter("@P_CONTINGENT_ALLOC_PCT", pContingentAllocPct);
			cmd.addParameter("@P_PRIMARY_ALLOC_AMT", pPrimaryAllocAmt);
			cmd.addParameter("@P_CONTINGENT_ALLOC_AMT", pContingentAllocAmt);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pPrimaryInd,NString pOpenEnrollInd,NString pUserId,NString pDataOrigin,NNumber pPrimaryAllocPct,NNumber pContingentAllocPct,NNumber pPrimaryAllocAmt,NNumber pContingentAllocAmt,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_BENE_ALLOC.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_OPEN_ENROLL_IND", pOpenEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRIMARY_ALLOC_PCT", pPrimaryAllocPct);
			cmd.addParameter("@P_CONTINGENT_ALLOC_PCT", pContingentAllocPct);
			cmd.addParameter("@P_PRIMARY_ALLOC_AMT", pPrimaryAllocAmt);
			cmd.addParameter("@P_CONTINGENT_ALLOC_AMT", pContingentAllocAmt);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="OeBeneAllocRecRow", dataSourceName="OE_BENE_ALLOC_REC")
	public static class OeBeneAllocRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_BENE_SEQ_NO")
		public NNumber RBeneSeqNo;
		@DbRecordField(dataSourceName="R_PRIMARY_IND")
		public NString RPrimaryInd;
		@DbRecordField(dataSourceName="R_OPEN_ENROLL_IND")
		public NString ROpenEnrollInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PRIMARY_ALLOC_PCT")
		public NNumber RPrimaryAllocPct;
		@DbRecordField(dataSourceName="R_CONTINGENT_ALLOC_PCT")
		public NNumber RContingentAllocPct;
		@DbRecordField(dataSourceName="R_PRIMARY_ALLOC_AMT")
		public NNumber RPrimaryAllocAmt;
		@DbRecordField(dataSourceName="R_CONTINGENT_ALLOC_AMT")
		public NNumber RContingentAllocAmt;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
