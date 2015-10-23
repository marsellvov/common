package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbPcardReassign {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pFarrpctSurrogateId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FARRPCT_SURROGATE_ID", pFarrpctSurrogateId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsByHeader(NNumber pFarrpctFabinvtId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.F_EXISTS_BY_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FARRPCT_FABINVT_ID", pFarrpctFabinvtId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PcardReassignRecRow recOne,PcardReassignRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PcardReassignRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PcardReassignRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pFarrpctSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FARRPCT_SURROGATE_ID", pFarrpctSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pFarrpctSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FARRPCT_SURROGATE_ID", pFarrpctSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pFarrpctSurrogateId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FARRPCT_SURROGATE_ID", pFarrpctSurrogateId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFarrpctDataOrigin,NNumber pFarrpctVersion,NString pFarrpctUserId,NNumber pFarrpctReassignPidm,NString pFarrpctFeedInd,NNumber pFarrpctFabinvtId,NString pFarrpctVpdiCode,NString pFarrpctDrCrInd,NNumber pFarrpctReassignAmount,NString pFarrpctFeedDocCode,NDate pFarrpctFeedSweepDate,NDate pFarrpctPmtDueDate,NString pFarrpctTravelAuthDoc,NString pFarrpctTravelRembDoc,NString pFarrpctStatusCde,NString pFarrpctReasonCde,NString pFarrpctEmailNotifyCde,NNumber pFarrpctResolveGroupNum,NString pFarrpctAddlInformation,NNumber pFarrpctReconcileDocSeq,Ref<NNumber> pFarrpctSurrogateIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FARRPCT_DATA_ORIGIN", pFarrpctDataOrigin);
			cmd.addParameter("@P_FARRPCT_VERSION", pFarrpctVersion);
			cmd.addParameter("@P_FARRPCT_USER_ID", pFarrpctUserId);
			cmd.addParameter("@P_FARRPCT_REASSIGN_PIDM", pFarrpctReassignPidm);
			cmd.addParameter("@P_FARRPCT_FEED_IND", pFarrpctFeedInd);
			cmd.addParameter("@P_FARRPCT_FABINVT_ID", pFarrpctFabinvtId);
			cmd.addParameter("@P_FARRPCT_VPDI_CODE", pFarrpctVpdiCode);
			cmd.addParameter("@P_FARRPCT_DR_CR_IND", pFarrpctDrCrInd);
			cmd.addParameter("@P_FARRPCT_REASSIGN_AMOUNT", pFarrpctReassignAmount);
			cmd.addParameter("@P_FARRPCT_FEED_DOC_CODE", pFarrpctFeedDocCode);
			cmd.addParameter("@P_FARRPCT_FEED_SWEEP_DATE", pFarrpctFeedSweepDate);
			cmd.addParameter("@P_FARRPCT_PMT_DUE_DATE", pFarrpctPmtDueDate);
			cmd.addParameter("@P_FARRPCT_TRAVEL_AUTH_DOC", pFarrpctTravelAuthDoc);
			cmd.addParameter("@P_FARRPCT_TRAVEL_REMB_DOC", pFarrpctTravelRembDoc);
			cmd.addParameter("@P_FARRPCT_STATUS_CDE", pFarrpctStatusCde);
			cmd.addParameter("@P_FARRPCT_REASON_CDE", pFarrpctReasonCde);
			cmd.addParameter("@P_FARRPCT_EMAIL_NOTIFY_CDE", pFarrpctEmailNotifyCde);
			cmd.addParameter("@P_FARRPCT_RESOLVE_GROUP_NUM", pFarrpctResolveGroupNum);
			cmd.addParameter("@P_FARRPCT_ADDL_INFORMATION", pFarrpctAddlInformation);
			cmd.addParameter("@P_FARRPCT_RECONCILE_DOC_SEQ", pFarrpctReconcileDocSeq);
			cmd.addParameter("@P_FARRPCT_SURROGATE_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pFarrpctSurrogateIdOut.val = cmd.getParameterValue("@P_FARRPCT_SURROGATE_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pFarrpctSurrogateId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FARRPCT_SURROGATE_ID", pFarrpctSurrogateId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pFarrpctSurrogateId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FARRPCT_SURROGATE_ID", pFarrpctSurrogateId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pFarrpctSurrogateId,NString pFarrpctDataOrigin,NNumber pFarrpctVersion,NString pFarrpctUserId,NNumber pFarrpctReassignPidm,NString pFarrpctFeedInd,NNumber pFarrpctFabinvtId,NString pFarrpctVpdiCode,NString pFarrpctDrCrInd,NNumber pFarrpctReassignAmount,NString pFarrpctFeedDocCode,NDate pFarrpctFeedSweepDate,NDate pFarrpctPmtDueDate,NString pFarrpctTravelAuthDoc,NString pFarrpctTravelRembDoc,NString pFarrpctStatusCde,NString pFarrpctReasonCde,NString pFarrpctEmailNotifyCde,NNumber pFarrpctResolveGroupNum,NString pFarrpctAddlInformation,NNumber pFarrpctReconcileDocSeq,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FARRPCT_SURROGATE_ID", pFarrpctSurrogateId);
			cmd.addParameter("@P_FARRPCT_DATA_ORIGIN", pFarrpctDataOrigin);
			cmd.addParameter("@P_FARRPCT_VERSION", pFarrpctVersion);
			cmd.addParameter("@P_FARRPCT_USER_ID", pFarrpctUserId);
			cmd.addParameter("@P_FARRPCT_REASSIGN_PIDM", pFarrpctReassignPidm);
			cmd.addParameter("@P_FARRPCT_FEED_IND", pFarrpctFeedInd);
			cmd.addParameter("@P_FARRPCT_FABINVT_ID", pFarrpctFabinvtId);
			cmd.addParameter("@P_FARRPCT_VPDI_CODE", pFarrpctVpdiCode);
			cmd.addParameter("@P_FARRPCT_DR_CR_IND", pFarrpctDrCrInd);
			cmd.addParameter("@P_FARRPCT_REASSIGN_AMOUNT", pFarrpctReassignAmount);
			cmd.addParameter("@P_FARRPCT_FEED_DOC_CODE", pFarrpctFeedDocCode);
			cmd.addParameter("@P_FARRPCT_FEED_SWEEP_DATE", pFarrpctFeedSweepDate);
			cmd.addParameter("@P_FARRPCT_PMT_DUE_DATE", pFarrpctPmtDueDate);
			cmd.addParameter("@P_FARRPCT_TRAVEL_AUTH_DOC", pFarrpctTravelAuthDoc);
			cmd.addParameter("@P_FARRPCT_TRAVEL_REMB_DOC", pFarrpctTravelRembDoc);
			cmd.addParameter("@P_FARRPCT_STATUS_CDE", pFarrpctStatusCde);
			cmd.addParameter("@P_FARRPCT_REASON_CDE", pFarrpctReasonCde);
			cmd.addParameter("@P_FARRPCT_EMAIL_NOTIFY_CDE", pFarrpctEmailNotifyCde);
			cmd.addParameter("@P_FARRPCT_RESOLVE_GROUP_NUM", pFarrpctResolveGroupNum);
			cmd.addParameter("@P_FARRPCT_ADDL_INFORMATION", pFarrpctAddlInformation);
			cmd.addParameter("@P_FARRPCT_RECONCILE_DOC_SEQ", pFarrpctReconcileDocSeq);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PcardReassignRecRow", dataSourceName="PCARD_REASSIGN_REC")
	public static class PcardReassignRecRow
	{
		@DbRecordField(dataSourceName="R_FARRPCT_SURROGATE_ID")
		public NNumber RFarrpctSurrogateId;
		@DbRecordField(dataSourceName="R_FARRPCT_DATA_ORIGIN")
		public NString RFarrpctDataOrigin;
		@DbRecordField(dataSourceName="R_FARRPCT_VERSION")
		public NNumber RFarrpctVersion;
		@DbRecordField(dataSourceName="R_FARRPCT_USER_ID")
		public NString RFarrpctUserId;
		@DbRecordField(dataSourceName="R_FARRPCT_REASSIGN_PIDM")
		public NNumber RFarrpctReassignPidm;
		@DbRecordField(dataSourceName="R_FARRPCT_FEED_IND")
		public NString RFarrpctFeedInd;
		@DbRecordField(dataSourceName="R_FARRPCT_FABINVT_ID")
		public NNumber RFarrpctFabinvtId;
		@DbRecordField(dataSourceName="R_FARRPCT_VPDI_CODE")
		public NString RFarrpctVpdiCode;
		@DbRecordField(dataSourceName="R_FARRPCT_DR_CR_IND")
		public NString RFarrpctDrCrInd;
		@DbRecordField(dataSourceName="R_FARRPCT_REASSIGN_AMOUNT")
		public NNumber RFarrpctReassignAmount;
		@DbRecordField(dataSourceName="R_FARRPCT_FEED_DOC_CODE")
		public NString RFarrpctFeedDocCode;
		@DbRecordField(dataSourceName="R_FARRPCT_FEED_SWEEP_DATE")
		public NDate RFarrpctFeedSweepDate;
		@DbRecordField(dataSourceName="R_FARRPCT_PMT_DUE_DATE")
		public NDate RFarrpctPmtDueDate;
		@DbRecordField(dataSourceName="R_FARRPCT_TRAVEL_AUTH_DOC")
		public NString RFarrpctTravelAuthDoc;
		@DbRecordField(dataSourceName="R_FARRPCT_TRAVEL_REMB_DOC")
		public NString RFarrpctTravelRembDoc;
		@DbRecordField(dataSourceName="R_FARRPCT_STATUS_CDE")
		public NString RFarrpctStatusCde;
		@DbRecordField(dataSourceName="R_FARRPCT_REASON_CDE")
		public NString RFarrpctReasonCde;
		@DbRecordField(dataSourceName="R_FARRPCT_EMAIL_NOTIFY_CDE")
		public NString RFarrpctEmailNotifyCde;
		@DbRecordField(dataSourceName="R_FARRPCT_RESOLVE_GROUP_NUM")
		public NNumber RFarrpctResolveGroupNum;
		@DbRecordField(dataSourceName="R_FARRPCT_ADDL_INFORMATION")
		public NString RFarrpctAddlInformation;
		@DbRecordField(dataSourceName="R_FARRPCT_RECONCILE_DOC_SEQ")
		public NNumber RFarrpctReconcileDocSeq;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
