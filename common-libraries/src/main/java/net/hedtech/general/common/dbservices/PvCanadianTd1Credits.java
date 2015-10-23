package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvCanadianTd1Credits {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTgrpCode,NString pTxcdCode,NString pTcrdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CanadianTd1CreditsRecRow recOne,CanadianTd1CreditsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CanadianTd1CreditsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CanadianTd1CreditsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTgrpCode,NString pTxcdCode,NString pTcrdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTgrpCode,NString pTxcdCode,NString pTcrdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTgrpCode,NString pTxcdCode,NString pTcrdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTgrpCode,NString pTxcdCode,NString pTcrdCode,NString pLineNo,NNumber pLineNoNumeric,NNumber pRangeLow,NNumber pRangeHigh,NString pDednInd,NString pDednType,NString pWebEntryInd,NString pExplanation,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_LINE_NO", pLineNo);
			cmd.addParameter("@P_LINE_NO_NUMERIC", pLineNoNumeric);
			cmd.addParameter("@P_RANGE_LOW", pRangeLow);
			cmd.addParameter("@P_RANGE_HIGH", pRangeHigh);
			cmd.addParameter("@P_DEDN_IND", pDednInd);
			cmd.addParameter("@P_DEDN_TYPE", pDednType);
			cmd.addParameter("@P_WEB_ENTRY_IND", pWebEntryInd);
			cmd.addParameter("@P_EXPLANATION", pExplanation);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTgrpCode,NString pTxcdCode,NString pTcrdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTgrpCode,NString pTxcdCode,NString pTcrdCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTgrpCode,NString pTxcdCode,NString pTcrdCode,NString pLineNo,NNumber pLineNoNumeric,NNumber pRangeLow,NNumber pRangeHigh,NString pDednInd,NString pDednType,NString pWebEntryInd,NString pExplanation,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_LINE_NO", pLineNo);
			cmd.addParameter("@P_LINE_NO_NUMERIC", pLineNoNumeric);
			cmd.addParameter("@P_RANGE_LOW", pRangeLow);
			cmd.addParameter("@P_RANGE_HIGH", pRangeHigh);
			cmd.addParameter("@P_DEDN_IND", pDednInd);
			cmd.addParameter("@P_DEDN_TYPE", pDednType);
			cmd.addParameter("@P_WEB_ENTRY_IND", pWebEntryInd);
			cmd.addParameter("@P_EXPLANATION", pExplanation);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="CanadianTd1CreditsRecRow", dataSourceName="CANADIAN_TD1_CREDITS_REC", needsInitialization=true)
	public static class CanadianTd1CreditsRecRow
	{
		@DbRecordField(dataSourceName="R_TGRP_CODE")
		public NString RTgrpCode;
		@DbRecordField(dataSourceName="R_TXCD_CODE")
		public NString RTxcdCode;
		@DbRecordField(dataSourceName="R_TCRD_CODE")
		public NString RTcrdCode;
		@DbRecordField(dataSourceName="R_LINE_NO")
		public NString RLineNo;
		@DbRecordField(dataSourceName="R_LINE_NO_NUMERIC")
		public NNumber RLineNoNumeric;
		@DbRecordField(dataSourceName="R_RANGE_LOW")
		public NNumber RRangeLow;
		@DbRecordField(dataSourceName="R_RANGE_HIGH")
		public NNumber RRangeHigh;
		@DbRecordField(dataSourceName="R_DEDN_IND")
		public NString RDednInd;
		@DbRecordField(dataSourceName="R_DEDN_TYPE")
		public NString RDednType;
		@DbRecordField(dataSourceName="R_WEB_ENTRY_IND")
		public NString RWebEntryInd;
		@DbRecordField(dataSourceName="R_EXPLANATION")
		public NString RExplanation;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
