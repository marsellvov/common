package net.hedtech.general.common.dbservices;

import java.sql.RowId;
import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbACACovUpdtSelect {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEclsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AcaCovUpdtSelectRecRow recOne, AcaCovUpdtSelectRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AcaCovUpdtSelectRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AcaCovUpdtSelectRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEclsCode, NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		
		public static void pCreate(
				NString pEclsCode,
				NNumber pYear,
				NDate pOfferDate,
				NDate pRecordDate,
				NString pOfferToSpouseInd,
				NString pOfferToDependentInd,
				NString pUserId,
				NString pBdcaCode,
				NString pBdplCode,
				NString pAcaOfferCoverageCde,
				NString pAca4980HSafeHbrCde,
				NNumber pAcaMlyPremSelfAmt,
				NDate   pOfferAcceptanceDate,
				NDate   pOfferDeclineDate,
				NString pOfferDeclineReason,
				// NString pOfferComments,
				NClob pOfferComments,
				NString pProcessAction,
				NString pBdcaStatusSelection,
				NString pDataOrigin,
				Ref<NString> pWarningMsgOut,
				Ref<NString> pRowidOut) 
		{
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.P_CREATE", DbManager.getDataBaseFactory());
					
			cmd.addParameter("@P_ECLS_CODE",pEclsCode);
			cmd.addParameter("@P_YEAR",pYear)	;
			cmd.addParameter("@P_OFFER_DATE",pOfferDate);
			cmd.addParameter("@P_RECORD_DATE",pRecordDate);
			cmd.addParameter("@P_OFFER_TO_SPOUSE_IND",pOfferToSpouseInd);
			cmd.addParameter("@P_OFFER_TO_DEPENDENT_IND",pOfferToDependentInd);
			cmd.addParameter("@P_USER_ID",pUserId);
			cmd.addParameter("@P_BDCA_CODE",pBdcaCode);
			cmd.addParameter("@P_BDPL_CODE",pBdplCode);
			cmd.addParameter("@P_ACA_OFFER_COVERAGE_CDE",pAcaOfferCoverageCde);
			cmd.addParameter("@P_ACA_4980H_SAFE_HBR_CDE",pAca4980HSafeHbrCde);
			cmd.addParameter("@P_ACA_MLY_PREM_SELF_AMT",pAcaMlyPremSelfAmt);
			cmd.addParameter("@P_OFFER_ACCEPTANCE_DATE",pOfferAcceptanceDate);
			cmd.addParameter("@P_OFFER_DECLINE_DATE",pOfferDeclineDate);
			cmd.addParameter("@P_OFFER_DECLINE_REASON",pOfferDeclineReason);
			cmd.addParameter("@P_OFFER_COMMENTS",pOfferComments);
			cmd.addParameter("@P_PROCESS_ACTION",pProcessAction);
			cmd.addParameter("@P_BDCA_STATUS_SELECTION",pBdcaStatusSelection);
			cmd.addParameter("@P_DATA_ORIGIN",pDataOrigin);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);

		}
		
		public static void pDelete(NString pEclsCode, NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();
			
		}
		

		public static void pLock(NString pEclsCode, Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}

		public static void pUpdate(				
				NString pEclsCode,
				NNumber pYear,
				NDate pOfferDate,
				NDate pRecordDate,
				NString pOfferToSpouseInd,
				NString pOfferToDependentInd,
				NString pUserId,
				NString pBdcaCode,
				NString pBdplCode,
				NString pAcaOfferCoverageCde,
				NString pAca4980HSafeHbrCde,
				NNumber pAcaMlyPremSelfAmt,
				NDate pOfferAcceptanceDate,
				NDate pOfferDeclineDate,
				NString pOfferDeclineReason,
//				NString pOfferComments,
				NClob pOfferComments,
				NString pProcessAction,
				NString pBdcaStatusSelection,
				NString pDataOrigin,
				NString pRowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COV_UPDT_SELECT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE",pEclsCode);
			cmd.addParameter("@P_YEAR",pYear)	;
			cmd.addParameter("@P_OFFER_DATE",pOfferDate);
			cmd.addParameter("@P_RECORD_DATE",pRecordDate);
			cmd.addParameter("@P_OFFER_TO_SPOUSE_IND",pOfferToSpouseInd);
			cmd.addParameter("@P_OFFER_TO_DEPENDENT_IND",pOfferToDependentInd);
			cmd.addParameter("@P_USER_ID",pUserId);
			cmd.addParameter("@P_BDCA_CODE",pBdcaCode);
			cmd.addParameter("@P_BDPL_CODE",pBdplCode);
			cmd.addParameter("@P_ACA_OFFER_COVERAGE_CDE",pAcaOfferCoverageCde);
			cmd.addParameter("@P_ACA_4980H_SAFE_HBR_CDE",pAca4980HSafeHbrCde);
			cmd.addParameter("@P_ACA_MLY_PREM_SELF_AMT",pAcaMlyPremSelfAmt);
			cmd.addParameter("@P_OFFER_ACCEPTANCE_DATE",pOfferAcceptanceDate);
			cmd.addParameter("@P_OFFER_DECLINE_DATE",pOfferDeclineDate);
			cmd.addParameter("@P_OFFER_DECLINE_REASON",pOfferDeclineReason);
			cmd.addParameter("@P_OFFER_COMMENTS",pOfferComments);
			cmd.addParameter("@P_PROCESS_ACTION",pProcessAction);
			cmd.addParameter("@P_BDCA_STATUS_SELECTION",pBdcaStatusSelection);
			cmd.addParameter("@P_DATA_ORIGIN",pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowId);
							
			cmd.execute();

		}
	
	@DbRecordType(id="AcaCovUpdtSelectRecRow", dataSourceName="ACA_COV_UPDT_SELECT_REC") class AcaCovUpdtSelectRecRow
	{
		@DbRecordField(dataSourceName="R_ECLS_CODE")
		public NString REclsCode;
		@DbRecordField(dataSourceName="R_YEAR")
		public NNumber RYear;
		@DbRecordField(dataSourceName="R_OFFER_DATE")
		public NDate ROfferDate;
		@DbRecordField(dataSourceName="R_RECORD_DATE")
		public NDate RRecordDate;
		@DbRecordField(dataSourceName="R_OFFER_TO_SPOUSE_IND")
		public NString ROfferToSpouseInd;
		@DbRecordField(dataSourceName="R_OFFER_TO_DEPENDENT_IND")
		public NString ROfferToDependentInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_BDPL_CODE")
		public NString RBdplCode;
		@DbRecordField(dataSourceName="R_ACA_OFFER_COVERAGE_CDE")
		public NString RAcaOfferCoverageCde;
		@DbRecordField(dataSourceName="R_ACA_4980H_SAFE_HBR_CDE")
		public NString RAca4980hSafeHbrCde;
		@DbRecordField(dataSourceName="R_ACA_MLY_PREM_SELF_AMT")
		public NNumber RAcaMlyPremSelfAmt;
		@DbRecordField(dataSourceName="R_OFFER_ACCEPTANCE_DATE")
		public NDate ROfferAcceptanceDate;
		@DbRecordField(dataSourceName="R_OFFER_DECLINE_DATE")
		public NDate ROfferDeclineDate;
		@DbRecordField(dataSourceName="R_OFFER_DECLINE_REASON")
		public NString ROfferDeclineReason;
		@DbRecordField(dataSourceName="R_OFFER_COMMENT")
		public NString ROfferComment;	
		@DbRecordField(dataSourceName="R_PROCESS_ACTION")
		public NString RProcessAction;
		@DbRecordField(dataSourceName="R_BDCA_STATUS_SELECTION")
		public NString RBdcaStatusSelection;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;

	}

	
	
}
