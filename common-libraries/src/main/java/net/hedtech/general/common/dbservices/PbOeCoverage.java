package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbOeCoverage {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(OeCoverageRecRow recOne,OeCoverageRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, OeCoverageRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, OeCoverageRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NDate pBeginDate,NString pOtherCovInd,NString pPreExistingInd,NString pOpenEnrollInd,NString pUserId,NString pDataOrigin,NDate pEndDate,NString pDreaCode,NDate pRequestedDate,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_OTHER_COV_IND", pOtherCovInd);
			cmd.addParameter("@P_PRE_EXISTING_IND", pPreExistingInd);
			cmd.addParameter("@P_OPEN_ENROLL_IND", pOpenEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DREA_CODE", pDreaCode);
			cmd.addParameter("@P_REQUESTED_DATE", pRequestedDate);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NDate pBeginDate,NString pOtherCovInd,NString pPreExistingInd,NString pOpenEnrollInd,NString pUserId,NString pDataOrigin,NDate pEndDate,NString pDreaCode,NDate pRequestedDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_COVERAGE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_OTHER_COV_IND", pOtherCovInd);
			cmd.addParameter("@P_PRE_EXISTING_IND", pPreExistingInd);
			cmd.addParameter("@P_OPEN_ENROLL_IND", pOpenEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DREA_CODE", pDreaCode);
			cmd.addParameter("@P_REQUESTED_DATE", pRequestedDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="OeCoverageRecRow", dataSourceName="OE_COVERAGE_REC")
	public static class OeCoverageRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_BENE_SEQ_NO")
		public NNumber RBeneSeqNo;
		@DbRecordField(dataSourceName="R_BEGIN_DATE")
		public NDate RBeginDate;
		@DbRecordField(dataSourceName="R_OTHER_COV_IND")
		public NString ROtherCovInd;
		@DbRecordField(dataSourceName="R_PRE_EXISTING_IND")
		public NString RPreExistingInd;
		@DbRecordField(dataSourceName="R_OPEN_ENROLL_IND")
		public NString ROpenEnrollInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_DREA_CODE")
		public NString RDreaCode;
		@DbRecordField(dataSourceName="R_REQUESTED_DATE")
		public NDate RRequestedDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
