package net.hedtech.general.common.dbservices;

import static morphis.foundations.core.types.Types.toNumber;
import static morphis.foundations.core.types.Types.toStr;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbBeneficiaryAlloc {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo, NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(BeneficiaryAllocRecRow recOne,BeneficiaryAllocRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, BeneficiaryAllocRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, BeneficiaryAllocRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pPrimaryInd,NString pUserId,NString pDataOrigin,NNumber pPrimaryAllocPct,NNumber pContingentAllocPct,NNumber pPrimaryAllocAmt,NNumber pContingentAllocAmt,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
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
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pBdcaCode,NNumber pBeneSeqNo,NString pPrimaryInd,NString pUserId,NString pDataOrigin,NNumber pPrimaryAllocPct,NNumber pContingentAllocPct,NNumber pPrimaryAllocAmt,NNumber pContingentAllocAmt,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFICIARY_ALLOC.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BENE_SEQ_NO", pBeneSeqNo);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRIMARY_ALLOC_PCT", pPrimaryAllocPct);
			cmd.addParameter("@P_CONTINGENT_ALLOC_PCT", pContingentAllocPct);
			cmd.addParameter("@P_PRIMARY_ALLOC_AMT", pPrimaryAllocAmt);
			cmd.addParameter("@P_CONTINGENT_ALLOC_AMT", pContingentAllocAmt);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="BeneficiaryAllocRecRow", dataSourceName="BENEFICIARY_ALLOC_REC")
	public static class BeneficiaryAllocRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_BENE_SEQ_NO")
		public NNumber RBeneSeqNo;
		@DbRecordField(dataSourceName="R_PRIMARY_IND")
		public NString RPrimaryInd;
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
		
		
		public BeneficiaryAllocRecRow() {
			super();
		}

		public BeneficiaryAllocRecRow(Row spridenRefResults) {
			super();
			RPidm = toNumber(spridenRefResults.getObject(1));
			RBdcaCode = toStr(spridenRefResults.getObject(2));
			RBeneSeqNo = toNumber(spridenRefResults.getObject(3));
			RPrimaryInd = toStr(spridenRefResults.getObject(4));
			RUserId = toStr(spridenRefResults.getObject(5));
			RDataOrigin = toStr(spridenRefResults.getObject(6));
			RPrimaryAllocPct = toNumber(spridenRefResults.getObject(7));
			RContingentAllocPct = toNumber(spridenRefResults.getObject(8));
			RPrimaryAllocAmt = toNumber(spridenRefResults.getObject(9));
			RContingentAllocAmt = toNumber(spridenRefResults.getObject(10));
			RInternalRecordId = toStr(spridenRefResults.getObject(11));
		}		
		
	}
	
}
