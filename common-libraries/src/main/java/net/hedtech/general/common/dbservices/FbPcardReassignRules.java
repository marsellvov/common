package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbPcardReassignRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pFarrpctSurrogateId,NString pFarrpctDataOrigin,NNumber pFarrpctVersion,NString pFarrpctUserId,NNumber pFarrpctReassignPidm,NString pFarrpctFeedInd,NNumber pFarrpctFabinvtId,NString pFarrpctVpdiCode,NString pFarrpctDrCrInd,NNumber pFarrpctReassignAmount,NString pFarrpctFeedDocCode,NDate pFarrpctFeedSweepDate,NDate pFarrpctPmtDueDate,NString pFarrpctTravelAuthDoc,NString pFarrpctTravelRembDoc,NString pFarrpctStatusCde,NString pFarrpctReasonCde,NString pFarrpctEmailNotifyCde,NNumber pFarrpctResolveGroupNum,NString pFarrpctAddlInformation,NNumber pFarrpctReconcileDocSeq,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pFarrpctSurrogateId,NString pFarrpctDataOrigin,NNumber pFarrpctVersion,NString pFarrpctUserId,NNumber pFarrpctReassignPidm,NString pFarrpctFeedInd,NNumber pFarrpctFabinvtId,NString pFarrpctVpdiCode,NString pFarrpctDrCrInd,NNumber pFarrpctReassignAmount,NString pFarrpctFeedDocCode,NDate pFarrpctFeedSweepDate,NDate pFarrpctPmtDueDate,NString pFarrpctTravelAuthDoc,NString pFarrpctTravelRembDoc,NString pFarrpctStatusCde,NString pFarrpctReasonCde,NString pFarrpctEmailNotifyCde,NNumber pFarrpctResolveGroupNum,NString pFarrpctAddlInformation,NNumber pFarrpctReconcileDocSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_REASSIGN_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
