package net.hedtech.general.common.dbservices;

import static morphis.foundations.core.types.Types.toNumber;
import static morphis.foundations.core.types.Types.toStr;
import static morphis.foundations.core.types.Types.toDate;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbW2State {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(W2StateRecRow recOne,W2StateRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, W2StateRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, W2StateRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		//MORPHIS TODO: (JP 21-JAN-2015) Changed DataCursor to Cursor
		public static Cursor fQueryOne(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatCode,NString pUserId,NString pDataOrigin,NString pTaxEntityCode,NNumber pQtrUiTotalWages,NNumber pQtrUiTaxableWages,NDate pDateFirstEmployed,NDate pDateOfSeparation,NNumber pStateTaxableWages,NNumber pStateIncomeTax,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TAX_ENTITY_CODE", pTaxEntityCode);
			cmd.addParameter("@P_QTR_UI_TOTAL_WAGES", pQtrUiTotalWages);
			cmd.addParameter("@P_QTR_UI_TAXABLE_WAGES", pQtrUiTaxableWages);
			cmd.addParameter("@P_DATE_FIRST_EMPLOYED", pDateFirstEmployed);
			cmd.addParameter("@P_DATE_OF_SEPARATION", pDateOfSeparation);
			cmd.addParameter("@P_STATE_TAXABLE_WAGES", pStateTaxableWages);
			cmd.addParameter("@P_STATE_INCOME_TAX", pStateIncomeTax);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatCode,NString pUserId,NString pDataOrigin,NString pTaxEntityCode,NNumber pQtrUiTotalWages,NNumber pQtrUiTaxableWages,NDate pDateFirstEmployed,NDate pDateOfSeparation,NNumber pStateTaxableWages,NNumber pStateIncomeTax,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_STATE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TAX_ENTITY_CODE", pTaxEntityCode);
			cmd.addParameter("@P_QTR_UI_TOTAL_WAGES", pQtrUiTotalWages);
			cmd.addParameter("@P_QTR_UI_TAXABLE_WAGES", pQtrUiTaxableWages);
			cmd.addParameter("@P_DATE_FIRST_EMPLOYED", pDateFirstEmployed);
			cmd.addParameter("@P_DATE_OF_SEPARATION", pDateOfSeparation);
			cmd.addParameter("@P_STATE_TAXABLE_WAGES", pStateTaxableWages);
			cmd.addParameter("@P_STATE_INCOME_TAX", pStateIncomeTax);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="W2StateRecRow", dataSourceName="W2_STATE_REC")
	public static class W2StateRecRow
	{
		@DbRecordField(dataSourceName="R_YEAR")
		public NNumber RYear;
		@DbRecordField(dataSourceName="R_QUARTER")
		public NNumber RQuarter;
		@DbRecordField(dataSourceName="R_EMPR_CODE")
		public NString REmprCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_TAX_ENTITY_CODE")
		public NString RTaxEntityCode;
		@DbRecordField(dataSourceName="R_QTR_UI_TOTAL_WAGES")
		public NNumber RQtrUiTotalWages;
		@DbRecordField(dataSourceName="R_QTR_UI_TAXABLE_WAGES")
		public NNumber RQtrUiTaxableWages;
		@DbRecordField(dataSourceName="R_DATE_FIRST_EMPLOYED")
		public NDate RDateFirstEmployed;
		@DbRecordField(dataSourceName="R_DATE_OF_SEPARATION")
		public NDate RDateOfSeparation;
		@DbRecordField(dataSourceName="R_STATE_TAXABLE_WAGES")
		public NNumber RStateTaxableWages;
		@DbRecordField(dataSourceName="R_STATE_INCOME_TAX")
		public NNumber RStateIncomeTax;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public W2StateRecRow() {
			super();
		}
		
		public W2StateRecRow( Row w2StateRefResults ) {
			super();
			RYear = toNumber(w2StateRefResults.getObject(1));
			RQuarter = toNumber(w2StateRefResults.getObject(2));
			REmprCode = toStr(w2StateRefResults.getObject(3));
			RPidm = toNumber(w2StateRefResults.getObject(4));
			RSeqNo = toNumber(w2StateRefResults.getObject(5));
			RStatCode = toStr(w2StateRefResults.getObject(6));
			RUserId = toStr(w2StateRefResults.getObject(7));
			RDataOrigin = toStr(w2StateRefResults.getObject(8));
			RTaxEntityCode = toStr(w2StateRefResults.getObject(9));
			RQtrUiTotalWages = toNumber(w2StateRefResults.getObject(10));
			RQtrUiTaxableWages = toNumber(w2StateRefResults.getObject(11));
			RDateFirstEmployed = toDate(w2StateRefResults.getObject(12));
			RDateOfSeparation = toDate(w2StateRefResults.getObject(13));
			RStateTaxableWages = toNumber(w2StateRefResults.getObject(14));
			RStateIncomeTax = toNumber(w2StateRefResults.getObject(15));
			RInternalRecordId = toStr(w2StateRefResults.getObject(16));

			
		}
	}

	
	
}
