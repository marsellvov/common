package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Agkgift {
		public static NString fCreategift(NNumber transIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.F_CREATEGIFT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNopidmUpdategift(NNumber transIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.F_NOPIDM_UPDATEGIFT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUpdateSobseqn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.F_UPDATE_SOBSEQN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUpdategiftVendorInfo(NNumber transIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.F_UPDATEGIFT_VENDOR_INFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCalcLrgRecGift(NNumber pidmIn,NString typeIn,Ref<NNumber> pidmOut,Ref<NNumber> recAmtOut,Ref<NDate> recDateOut,Ref<NString> recGnumOut,Ref<NNumber> recFiscCodeOut,Ref<NString> recGiftTypeOut,Ref<NNumber> recCredGamtOut,Ref<NNumber> lastRecPidmOut,Ref<NNumber> lastRecGiftAmtOut,Ref<NString> lastRecGiftNoOut,Ref<NDate> lastRecGiftDateOut,Ref<NNumber> lastRecGiftFiscCodeOut,Ref<NString> lastRecGiftTypeOut,Ref<NNumber> lastRecGiftCredGamtOut,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CALC_LRG_REC_GIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@PIDM_OUT", NNumber.class);
			cmd.addParameter("@REC_AMT_OUT", NNumber.class);
			cmd.addParameter("@REC_DATE_OUT", NDate.class);
			cmd.addParameter("@REC_GNUM_OUT", NString.class);
			cmd.addParameter("@REC_FISC_CODE_OUT", NNumber.class);
			cmd.addParameter("@REC_GIFT_TYPE_OUT", NString.class);
			cmd.addParameter("@REC_CRED_GAMT_OUT", NNumber.class);
			cmd.addParameter("@LAST_REC_PIDM_OUT", NNumber.class);
			cmd.addParameter("@LAST_REC_GIFT_AMT_OUT", NNumber.class);
			cmd.addParameter("@LAST_REC_GIFT_NO_OUT", NString.class);
			cmd.addParameter("@LAST_REC_GIFT_DATE_OUT", NDate.class);
			cmd.addParameter("@LAST_REC_GIFT_FISC_CODE_OUT", NNumber.class);
			cmd.addParameter("@LAST_REC_GIFT_TYPE_OUT", NString.class);
			cmd.addParameter("@LAST_REC_GIFT_CRED_GAMT_OUT", NNumber.class);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			pidmOut.val = cmd.getParameterValue("@PIDM_OUT", NNumber.class);
			recAmtOut.val = cmd.getParameterValue("@REC_AMT_OUT", NNumber.class);
			recDateOut.val = cmd.getParameterValue("@REC_DATE_OUT", NDate.class);
			recGnumOut.val = cmd.getParameterValue("@REC_GNUM_OUT", NString.class);
			recFiscCodeOut.val = cmd.getParameterValue("@REC_FISC_CODE_OUT", NNumber.class);
			recGiftTypeOut.val = cmd.getParameterValue("@REC_GIFT_TYPE_OUT", NString.class);
			recCredGamtOut.val = cmd.getParameterValue("@REC_CRED_GAMT_OUT", NNumber.class);
			lastRecPidmOut.val = cmd.getParameterValue("@LAST_REC_PIDM_OUT", NNumber.class);
			lastRecGiftAmtOut.val = cmd.getParameterValue("@LAST_REC_GIFT_AMT_OUT", NNumber.class);
			lastRecGiftNoOut.val = cmd.getParameterValue("@LAST_REC_GIFT_NO_OUT", NString.class);
			lastRecGiftDateOut.val = cmd.getParameterValue("@LAST_REC_GIFT_DATE_OUT", NDate.class);
			lastRecGiftFiscCodeOut.val = cmd.getParameterValue("@LAST_REC_GIFT_FISC_CODE_OUT", NNumber.class);
			lastRecGiftTypeOut.val = cmd.getParameterValue("@LAST_REC_GIFT_TYPE_OUT", NString.class);
			lastRecGiftCredGamtOut.val = cmd.getParameterValue("@LAST_REC_GIFT_CRED_GAMT_OUT", NNumber.class);
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCalcLrgRecPldg(NNumber pidmIn,NString typeIn,Ref<NNumber> pidmOut,Ref<NNumber> recAmtOut,Ref<NDate> recDateOut,Ref<NString> recPnumOut,Ref<NNumber> recFiscCodeOut,Ref<NString> recPldgTypeOut,Ref<NNumber> recCredPamtOut,Ref<NNumber> lastRecPidmOut,Ref<NNumber> lastRecPledgeAmtOut,Ref<NString> lastRecPledgeNoOut,Ref<NDate> lastRecPledgeDateOut,Ref<NNumber> lastRecPledgeFiscCodeOut,Ref<NString> lastRecPledgeTypeOut,Ref<NNumber> lastRecPledgeCredPamtOut,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CALC_LRG_REC_PLDG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@PIDM_OUT", NNumber.class);
			cmd.addParameter("@REC_AMT_OUT", NNumber.class);
			cmd.addParameter("@REC_DATE_OUT", NDate.class);
			cmd.addParameter("@REC_PNUM_OUT", NString.class);
			cmd.addParameter("@REC_FISC_CODE_OUT", NNumber.class);
			cmd.addParameter("@REC_PLDG_TYPE_OUT", NString.class);
			cmd.addParameter("@REC_CRED_PAMT_OUT", NNumber.class);
			cmd.addParameter("@LAST_REC_PIDM_OUT", NNumber.class);
			cmd.addParameter("@LAST_REC_PLEDGE_AMT_OUT", NNumber.class);
			cmd.addParameter("@LAST_REC_PLEDGE_NO_OUT", NString.class);
			cmd.addParameter("@LAST_REC_PLEDGE_DATE_OUT", NDate.class);
			cmd.addParameter("@LAST_REC_PLEDGE_FISC_CODE_OUT", NNumber.class);
			cmd.addParameter("@LAST_REC_PLEDGE_TYPE_OUT", NString.class);
			cmd.addParameter("@LAST_REC_PLEDGE_CRED_PAMT_OUT", NNumber.class);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			pidmOut.val = cmd.getParameterValue("@PIDM_OUT", NNumber.class);
			recAmtOut.val = cmd.getParameterValue("@REC_AMT_OUT", NNumber.class);
			recDateOut.val = cmd.getParameterValue("@REC_DATE_OUT", NDate.class);
			recPnumOut.val = cmd.getParameterValue("@REC_PNUM_OUT", NString.class);
			recFiscCodeOut.val = cmd.getParameterValue("@REC_FISC_CODE_OUT", NNumber.class);
			recPldgTypeOut.val = cmd.getParameterValue("@REC_PLDG_TYPE_OUT", NString.class);
			recCredPamtOut.val = cmd.getParameterValue("@REC_CRED_PAMT_OUT", NNumber.class);
			lastRecPidmOut.val = cmd.getParameterValue("@LAST_REC_PIDM_OUT", NNumber.class);
			lastRecPledgeAmtOut.val = cmd.getParameterValue("@LAST_REC_PLEDGE_AMT_OUT", NNumber.class);
			lastRecPledgeNoOut.val = cmd.getParameterValue("@LAST_REC_PLEDGE_NO_OUT", NString.class);
			lastRecPledgeDateOut.val = cmd.getParameterValue("@LAST_REC_PLEDGE_DATE_OUT", NDate.class);
			lastRecPledgeFiscCodeOut.val = cmd.getParameterValue("@LAST_REC_PLEDGE_FISC_CODE_OUT", NNumber.class);
			lastRecPledgeTypeOut.val = cmd.getParameterValue("@LAST_REC_PLEDGE_TYPE_OUT", NString.class);
			lastRecPledgeCredPamtOut.val = cmd.getParameterValue("@LAST_REC_PLEDGE_CRED_PAMT_OUT", NNumber.class);
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCallGiftSolc(NNumber pidm,NNumber pidm3ppIn,NString giftNo,NString pledgeNo,NString camp,NNumber campDesgAmt,NString tppPledgeNo,NString dataOriginIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CALL_GIFT_SOLC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PIDM_3PP_IN", pidm3ppIn);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
			cmd.addParameter("@CAMP", camp);
			cmd.addParameter("@CAMP_DESG_AMT", campDesgAmt);
			cmd.addParameter("@TPP_PLEDGE_NO", tppPledgeNo);
			cmd.addParameter("@DATA_ORIGIN_IN", dataOriginIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateAuxiliary(NNumber pidm,NString giftNo,NString auxlCode,NString auxlDesc,NNumber dcprCost,NDate activityDate,NString dcprCode,NDate issueDate,NNumber dcprValue,NString description,NString accRejInd,NDate accRejDate,NString giftAdjVoidInd,NString donrCode,NString prefClas,NString user,NString deductForTaxes,NString comment,NDate auxlValueDate,Ref<NString> status,Ref<NString> procName,Ref<NString> error) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_AUXILIARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@AUXL_CODE", auxlCode);
			cmd.addParameter("@AUXL_DESC", auxlDesc);
			cmd.addParameter("@DCPR_COST", dcprCost);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@DCPR_CODE", dcprCode);
			cmd.addParameter("@ISSUE_DATE", issueDate);
			cmd.addParameter("@DCPR_VALUE", dcprValue);
			cmd.addParameter("@DESCRIPTION", description);
			cmd.addParameter("@ACC_REJ_IND", accRejInd);
			cmd.addParameter("@ACC_REJ_DATE", accRejDate);
			cmd.addParameter("@GIFT_ADJ_VOID_IND", giftAdjVoidInd);
			cmd.addParameter("@DONR_CODE", donrCode);
			cmd.addParameter("@PREF_CLAS", prefClas);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@DEDUCT_FOR_TAXES", deductForTaxes);
			cmd.addParameter("@COMMENT", comment);
			cmd.addParameter("@AUXL_VALUE_DATE", auxlValueDate);
			cmd.addParameter("@STATUS", NString.class);
			cmd.addParameter("@PROC_NAME", NString.class);
			cmd.addParameter("@ERROR", NString.class);
				
			cmd.execute();
			status.val = cmd.getParameterValue("@STATUS", NString.class);
			procName.val = cmd.getParameterValue("@PROC_NAME", NString.class);
			error.val = cmd.getParameterValue("@ERROR", NString.class);


		}
		
		public static void pCreateBaseGift(NNumber pidm,NNumber amtTot,NString commentText,NString giftCode,Ref<NString> giftNo,NString pgveCode,NString gackCode,NString gclsCode1,NString gclsCode2,NString gclsCode3,NString matchReceived,NString matchProcessed,NDate giftDate,NDate entryDate,NString gackInd,NString receiptInd,NDate receiptDate,NString mgFormsentInd,NString donrCode,NString dataOrigin,NString extGiftId,NString authCode,NString refrNumber,NString giftDesc,NString cashierId,Ref<NString> status,Ref<NString> procName,Ref<NString> error) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_BASE_GIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@AMT_TOT", amtTot);
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@GIFT_CODE", giftCode);
			cmd.addParameter("@GIFT_NO", giftNo, true);
			cmd.addParameter("@PGVE_CODE", pgveCode);
			cmd.addParameter("@GACK_CODE", gackCode);
			cmd.addParameter("@GCLS_CODE1", gclsCode1);
			cmd.addParameter("@GCLS_CODE2", gclsCode2);
			cmd.addParameter("@GCLS_CODE3", gclsCode3);
			cmd.addParameter("@MATCH_RECEIVED", matchReceived);
			cmd.addParameter("@MATCH_PROCESSED", matchProcessed);
			cmd.addParameter("@GIFT_DATE", giftDate);
			cmd.addParameter("@ENTRY_DATE", entryDate);
			cmd.addParameter("@GACK_IND", gackInd);
			cmd.addParameter("@RECEIPT_IND", receiptInd);
			cmd.addParameter("@RECEIPT_DATE", receiptDate);
			cmd.addParameter("@MG_FORMSENT_IND", mgFormsentInd);
			cmd.addParameter("@DONR_CODE", donrCode);
			cmd.addParameter("@DATA_ORIGIN", dataOrigin);
			cmd.addParameter("@EXT_GIFT_ID", extGiftId);
			cmd.addParameter("@AUTH_CODE", authCode);
			cmd.addParameter("@REFR_NUMBER", refrNumber);
			cmd.addParameter("@GIFT_DESC", giftDesc);
			cmd.addParameter("@CASHIER_ID", cashierId);
			cmd.addParameter("@STATUS", NString.class);
			cmd.addParameter("@PROC_NAME", NString.class);
			cmd.addParameter("@ERROR", NString.class);
				
			cmd.execute();
			giftNo.val = cmd.getParameterValue("@GIFT_NO", NString.class);
			status.val = cmd.getParameterValue("@STATUS", NString.class);
			procName.val = cmd.getParameterValue("@PROC_NAME", NString.class);
			error.val = cmd.getParameterValue("@ERROR", NString.class);


		}
		
		public static void pCreateCampDesg(NNumber pidm,NString giftNo,NString pldgNo,NString camp,NString desg,NString campDesgAmt,NString splitInd,Ref<NString> status,Ref<NString> procName,Ref<NString> error) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_CAMP_DESG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@PLDG_NO", pldgNo);
			cmd.addParameter("@CAMP", camp);
			cmd.addParameter("@DESG", desg);
			cmd.addParameter("@CAMP_DESG_AMT", campDesgAmt);
			cmd.addParameter("@SPLIT_IND", splitInd);
			cmd.addParameter("@STATUS", NString.class);
			cmd.addParameter("@PROC_NAME", NString.class);
			cmd.addParameter("@ERROR", NString.class);
				
			cmd.execute();
			status.val = cmd.getParameterValue("@STATUS", NString.class);
			procName.val = cmd.getParameterValue("@PROC_NAME", NString.class);
			error.val = cmd.getParameterValue("@ERROR", NString.class);


		}
		
		public static void pCreateCampHistory(NNumber pidmIn,NString campaignIn,NString fiscCodeIn,NNumber amtPledgedIn,NNumber amtPledgedPaidIn,NNumber amtGiftIn,NNumber amtMemoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_CAMP_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CAMPAIGN_IN", campaignIn);
			cmd.addParameter("@FISC_CODE_IN", fiscCodeIn);
			cmd.addParameter("@AMT_PLEDGED_IN", amtPledgedIn);
			cmd.addParameter("@AMT_PLEDGED_PAID_IN", amtPledgedPaidIn);
			cmd.addParameter("@AMT_GIFT_IN", amtGiftIn);
			cmd.addParameter("@AMT_MEMO_IN", amtMemoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateDesgHistory(NNumber pidmIn,NString desgIn,NString fiscCodeIn,NNumber amtPledgedIn,NNumber amtPledgedPaidIn,NNumber amtGiftIn,NNumber amtMemoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_DESG_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@FISC_CODE_IN", fiscCodeIn);
			cmd.addParameter("@AMT_PLEDGED_IN", amtPledgedIn);
			cmd.addParameter("@AMT_PLEDGED_PAID_IN", amtPledgedPaidIn);
			cmd.addParameter("@AMT_GIFT_IN", amtGiftIn);
			cmd.addParameter("@AMT_MEMO_IN", amtMemoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateGiftAdjDetail(NNumber pidmIn,NString giftNoIn,NNumber seqNoIn,NString pledgeNoIn,NString campaignIn,NString desgIn,NNumber amtIn,NNumber agifSeqNoIn,NString fiscCodeIn,NDate giftDateIn,NString giftCodeIn,NString userIn,NString pledgeNoAdjIn,NString campaignAdjIn,NString desgAdjIn,NNumber amtAdjIn,NString fiscCodeAdjIn,NDate giftDateAdjIn,NString giftCodeAdjIn,NString userAdjIn,NDate entryDateAdjIn,NString needToFeedIndIn,NString userCashIn,NDate entryDateCashIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_GIFT_ADJ_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@SEQ_NO_IN", seqNoIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CAMPAIGN_IN", campaignIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@AMT_IN", amtIn);
			cmd.addParameter("@AGIF_SEQ_NO_IN", agifSeqNoIn);
			cmd.addParameter("@FISC_CODE_IN", fiscCodeIn);
			cmd.addParameter("@GIFT_DATE_IN", giftDateIn);
			cmd.addParameter("@GIFT_CODE_IN", giftCodeIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@PLEDGE_NO_ADJ_IN", pledgeNoAdjIn);
			cmd.addParameter("@CAMPAIGN_ADJ_IN", campaignAdjIn);
			cmd.addParameter("@DESG_ADJ_IN", desgAdjIn);
			cmd.addParameter("@AMT_ADJ_IN", amtAdjIn);
			cmd.addParameter("@FISC_CODE_ADJ_IN", fiscCodeAdjIn);
			cmd.addParameter("@GIFT_DATE_ADJ_IN", giftDateAdjIn);
			cmd.addParameter("@GIFT_CODE_ADJ_IN", giftCodeAdjIn);
			cmd.addParameter("@USER_ADJ_IN", userAdjIn);
			cmd.addParameter("@ENTRY_DATE_ADJ_IN", entryDateAdjIn);
			cmd.addParameter("@NEED_TO_FEED_IND_IN", needToFeedIndIn);
			cmd.addParameter("@USER_CASH_IN", userCashIn);
			cmd.addParameter("@ENTRY_DATE_CASH_IN", entryDateCashIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateGiftAdjHead(NNumber pidmIn,NString giftNoIn,NNumber seqNoIn,NNumber amtTotIn,NString finalIndIn,NDate giftDateIn,NString fiscCodeIn,NString gackCodeIn,NString gackIndIn,NString giftCodeIn,NString cardRefrNumberIn,NString cardAuthCodeIn,NString commentIn,NString gclsCodeIn,NDate entryDateIn,NString currentUserIn,NString feedIndIn,NString feedDateIn,NString feedDocCodeIn,NString userAdjIn,NDate entryDateAdjIn,NString userCashIn,NDate entryDateCashIn,NString sendToCashIndIn,NString finalIndAdjIn,NString commentAdjIn,NDate activityDateIn,NString giftDescIn,NString pgveCodeIn,NString gclsCode2In,NString gclsCode3In,NString cclsCodeIn,NString cclsCommentIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_GIFT_ADJ_HEAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@SEQ_NO_IN", seqNoIn);
			cmd.addParameter("@AMT_TOT_IN", amtTotIn);
			cmd.addParameter("@FINAL_IND_IN", finalIndIn);
			cmd.addParameter("@GIFT_DATE_IN", giftDateIn);
			cmd.addParameter("@FISC_CODE_IN", fiscCodeIn);
			cmd.addParameter("@GACK_CODE_IN", gackCodeIn);
			cmd.addParameter("@GACK_IND_IN", gackIndIn);
			cmd.addParameter("@GIFT_CODE_IN", giftCodeIn);
			cmd.addParameter("@CARD_REFR_NUMBER_IN", cardRefrNumberIn);
			cmd.addParameter("@CARD_AUTH_CODE_IN", cardAuthCodeIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@GCLS_CODE_IN", gclsCodeIn);
			cmd.addParameter("@ENTRY_DATE_IN", entryDateIn);
			cmd.addParameter("@CURRENT_USER_IN", currentUserIn);
			cmd.addParameter("@FEED_IND_IN", feedIndIn);
			cmd.addParameter("@FEED_DATE_IN", feedDateIn);
			cmd.addParameter("@FEED_DOC_CODE_IN", feedDocCodeIn);
			cmd.addParameter("@USER_ADJ_IN", userAdjIn);
			cmd.addParameter("@ENTRY_DATE_ADJ_IN", entryDateAdjIn);
			cmd.addParameter("@USER_CASH_IN", userCashIn);
			cmd.addParameter("@ENTRY_DATE_CASH_IN", entryDateCashIn);
			cmd.addParameter("@SEND_TO_CASH_IND_IN", sendToCashIndIn);
			cmd.addParameter("@FINAL_IND_ADJ_IN", finalIndAdjIn);
			cmd.addParameter("@COMMENT_ADJ_IN", commentAdjIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@GIFT_DESC_IN", giftDescIn);
			cmd.addParameter("@PGVE_CODE_IN", pgveCodeIn);
			cmd.addParameter("@GCLS_CODE_2_IN", gclsCode2In);
			cmd.addParameter("@GCLS_CODE_3_IN", gclsCode3In);
			cmd.addParameter("@CCLS_CODE_IN", cclsCodeIn);
			cmd.addParameter("@CCLS_COMMENT_IN", cclsCommentIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateGiftAssocIds(NNumber pidm,NString giftNo,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_GIFT_ASSOC_IDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateGiftCamp(NNumber pidm,NString giftNo,NString pledgeNo,NString camp,NNumber amount,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_GIFT_CAMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
			cmd.addParameter("@CAMP", camp);
			cmd.addParameter("@AMOUNT", amount);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateGiftDesg(NNumber pidm,NString giftNo,NString pledgeNo,NString camp,NString desg,NNumber amount,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_GIFT_DESG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
			cmd.addParameter("@CAMP", camp);
			cmd.addParameter("@DESG", desg);
			cmd.addParameter("@AMOUNT", amount);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateGiftDonorAux(NNumber pidmIn,NString giftNoIn,NNumber giftAmtIn,NString donrCodeIn,NString auxlCodeIn,NString auxlDescIn,NString prefClasIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_GIFT_DONOR_AUX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@GIFT_AMT_IN", giftAmtIn);
			cmd.addParameter("@DONR_CODE_IN", donrCodeIn);
			cmd.addParameter("@AUXL_CODE_IN", auxlCodeIn);
			cmd.addParameter("@AUXL_DESC_IN", auxlDescIn);
			cmd.addParameter("@PREF_CLAS_IN", prefClasIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateGiftHardCredit(NNumber pidmIn,NNumber xrefPidmIn,NString giftNoIn,NString pledgeNoIn,NString campaignIn,NString desgIn,NNumber creditIn,NNumber tppAmtIn,NString tppPledgeNoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_GIFT_HARD_CREDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@XREF_PIDM_IN", xrefPidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CAMPAIGN_IN", campaignIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@CREDIT_IN", creditIn);
			cmd.addParameter("@TPP_AMT_IN", tppAmtIn);
			cmd.addParameter("@TPP_PLEDGE_NO_IN", tppPledgeNoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateGiftHardCreditHead(NNumber pidmIn,NNumber xrefPidmIn,NString giftNoIn,NString pledgeNoIn,NNumber creditIn,NNumber tppAmtIn,NString tppPledgeNoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_GIFT_HARD_CREDIT_HEAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@XREF_PIDM_IN", xrefPidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CREDIT_IN", creditIn);
			cmd.addParameter("@TPP_AMT_IN", tppAmtIn);
			cmd.addParameter("@TPP_PLEDGE_NO_IN", tppPledgeNoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateGiftSoftCredit(NNumber pidmIn,NNumber xrefPidmIn,NString giftNoIn,NString pledgeNoIn,NString campaignIn,NString desgIn,NNumber creditIn,NNumber tppAmtIn,NString tppPledgeNoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_GIFT_SOFT_CREDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@XREF_PIDM_IN", xrefPidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CAMPAIGN_IN", campaignIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@CREDIT_IN", creditIn);
			cmd.addParameter("@TPP_AMT_IN", tppAmtIn);
			cmd.addParameter("@TPP_PLEDGE_NO_IN", tppPledgeNoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateGiftSoftCreditHead(NNumber pidmIn,NNumber xrefPidmIn,NString giftNoIn,NString pledgeNoIn,NNumber creditIn,NNumber tppAmtIn,NString tppPledgeNoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_GIFT_SOFT_CREDIT_HEAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@XREF_PIDM_IN", xrefPidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CREDIT_IN", creditIn);
			cmd.addParameter("@TPP_AMT_IN", tppAmtIn);
			cmd.addParameter("@TPP_PLEDGE_NO_IN", tppPledgeNoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreateUpdateGiftSolc(NNumber pidm,NString giftNo,NString pledgeNo,NString camp,NString solcCode,NString solOrg,NNumber solPidm,NNumber amount,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATE_UPDATE_GIFT_SOLC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
			cmd.addParameter("@CAMP", camp);
			cmd.addParameter("@SOLC_CODE", solcCode);
			cmd.addParameter("@SOL_ORG", solOrg);
			cmd.addParameter("@SOL_PIDM", solPidm);
			cmd.addParameter("@AMOUNT", amount);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pCreategift(NNumber pidm,NNumber oapfprice,NString splitInd,List<CampDesgRecRow> campDesgTab,NString commentText,NString giftCode,NString cashierId,Ref<NString> giftNo,Ref<NString> status,Ref<NString> procName,Ref<NString> error,NString pgveCode,NString gclsCode1,NString gclsCode2,NString gclsCode3,NDate giftDate,NString solcCode,NString solOrg,NNumber solPidm,NString dataOrigin,NString extGiftId,NString authCode,NString refrNumber,NString giftDesc,NString donrCode,NString matchReceived,NString matchProcessed) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_CREATEGIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@OAPFPRICE", oapfprice);
			cmd.addParameter("@SPLIT_IND", splitInd);
			// cmd.addParameter(DbTypes.getTableType("CAMP_DESG_TAB", "", campDesgTab, object.class));
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@GIFT_CODE", giftCode);
			cmd.addParameter("@CASHIER_ID", cashierId);
			cmd.addParameter("@GIFT_NO", giftNo, true);
			cmd.addParameter("@STATUS", NString.class);
			cmd.addParameter("@PROC_NAME", NString.class);
			cmd.addParameter("@ERROR", NString.class);
			cmd.addParameter("@PGVE_CODE", pgveCode);
			cmd.addParameter("@GCLS_CODE1", gclsCode1);
			cmd.addParameter("@GCLS_CODE2", gclsCode2);
			cmd.addParameter("@GCLS_CODE3", gclsCode3);
			cmd.addParameter("@GIFT_DATE", giftDate);
			cmd.addParameter("@SOLC_CODE", solcCode);
			cmd.addParameter("@SOL_ORG", solOrg);
			cmd.addParameter("@SOL_PIDM", solPidm);
			cmd.addParameter("@DATA_ORIGIN", dataOrigin);
			cmd.addParameter("@EXT_GIFT_ID", extGiftId);
			cmd.addParameter("@AUTH_CODE", authCode);
			cmd.addParameter("@REFR_NUMBER", refrNumber);
			cmd.addParameter("@GIFT_DESC", giftDesc);
			cmd.addParameter("@DONR_CODE", donrCode);
			cmd.addParameter("@MATCH_RECEIVED", matchReceived);
			cmd.addParameter("@MATCH_PROCESSED", matchProcessed);
				
			cmd.execute();
			giftNo.val = cmd.getParameterValue("@GIFT_NO", NString.class);
			status.val = cmd.getParameterValue("@STATUS", NString.class);
			procName.val = cmd.getParameterValue("@PROC_NAME", NString.class);
			error.val = cmd.getParameterValue("@ERROR", NString.class);


		}
		
		public static void pFinalizeGift(NNumber pidm,NString giftNo,NString solcCode,NString solOrg,NNumber solPidm,NString donrCode,NString splitInd,NString dataOrigin,Ref<NString> status,Ref<NString> procName,Ref<NString> error) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_FINALIZE_GIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@SOLC_CODE", solcCode);
			cmd.addParameter("@SOL_ORG", solOrg);
			cmd.addParameter("@SOL_PIDM", solPidm);
			cmd.addParameter("@DONR_CODE", donrCode);
			cmd.addParameter("@SPLIT_IND", splitInd);
			cmd.addParameter("@DATA_ORIGIN", dataOrigin);
			cmd.addParameter("@STATUS", NString.class);
			cmd.addParameter("@PROC_NAME", NString.class);
			cmd.addParameter("@ERROR", NString.class);
				
			cmd.execute();
			status.val = cmd.getParameterValue("@STATUS", NString.class);
			procName.val = cmd.getParameterValue("@PROC_NAME", NString.class);
			error.val = cmd.getParameterValue("@ERROR", NString.class);


		}
		
		public static void pFinalizeThirdPartyGift(NNumber pidmIn,NNumber pidm3ppIn,NString giftNoIn,NString pledgeNo3ppIn,NString donrCodeIn,NString splitIndIn,NString regCreditIndIn,NNumber creditAmtIn,NString dataOriginIn,Ref<NString> status,Ref<NString> procName,Ref<NString> error) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_FINALIZE_THIRD_PARTY_GIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PIDM_3PP_IN", pidm3ppIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@PLEDGE_NO_3PP_IN", pledgeNo3ppIn);
			cmd.addParameter("@DONR_CODE_IN", donrCodeIn);
			cmd.addParameter("@SPLIT_IND_IN", splitIndIn);
			cmd.addParameter("@REG_CREDIT_IND_IN", regCreditIndIn);
			cmd.addParameter("@CREDIT_AMT_IN", creditAmtIn);
			cmd.addParameter("@DATA_ORIGIN_IN", dataOriginIn);
			cmd.addParameter("@STATUS", NString.class);
			cmd.addParameter("@PROC_NAME", NString.class);
			cmd.addParameter("@ERROR", NString.class);
				
			cmd.execute();
			status.val = cmd.getParameterValue("@STATUS", NString.class);
			procName.val = cmd.getParameterValue("@PROC_NAME", NString.class);
			error.val = cmd.getParameterValue("@ERROR", NString.class);


		}
		
		public static void pFinalizeVoidGift(NNumber pidmIn,NString giftNoIn,NNumber giftFiscCodeIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_FINALIZE_VOID_GIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@GIFT_FISC_CODE_IN", giftFiscCodeIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pRemoveBaseGift(NNumber pidm,NString giftNo,Ref<NString> status,Ref<NString> procName,Ref<NString> error) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_REMOVE_BASE_GIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@STATUS", NString.class);
			cmd.addParameter("@PROC_NAME", NString.class);
			cmd.addParameter("@ERROR", NString.class);
				
			cmd.execute();
			status.val = cmd.getParameterValue("@STATUS", NString.class);
			procName.val = cmd.getParameterValue("@PROC_NAME", NString.class);
			error.val = cmd.getParameterValue("@ERROR", NString.class);


		}
		
		public static void pRemoveCampDesg(NNumber pidm,NString giftNo,Ref<NString> status,Ref<NString> procName,Ref<NString> error) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_REMOVE_CAMP_DESG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@STATUS", NString.class);
			cmd.addParameter("@PROC_NAME", NString.class);
			cmd.addParameter("@ERROR", NString.class);
				
			cmd.execute();
			status.val = cmd.getParameterValue("@STATUS", NString.class);
			procName.val = cmd.getParameterValue("@PROC_NAME", NString.class);
			error.val = cmd.getParameterValue("@ERROR", NString.class);


		}
		
		public static void pUpdateCampHistory(NNumber pidmIn,NString campaignIn,NString fiscCodeIn,NNumber amtPledgedIn,NNumber amtPledgedPaidIn,NNumber amtGiftIn,NNumber amtMemoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_CAMP_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CAMPAIGN_IN", campaignIn);
			cmd.addParameter("@FISC_CODE_IN", fiscCodeIn);
			cmd.addParameter("@AMT_PLEDGED_IN", amtPledgedIn);
			cmd.addParameter("@AMT_PLEDGED_PAID_IN", amtPledgedPaidIn);
			cmd.addParameter("@AMT_GIFT_IN", amtGiftIn);
			cmd.addParameter("@AMT_MEMO_IN", amtMemoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdateDesgHistory(NNumber pidmIn,NString desgIn,NString fiscCodeIn,NNumber amtPledgedIn,NNumber amtPledgedPaidIn,NNumber amtGiftIn,NNumber amtMemoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_DESG_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@FISC_CODE_IN", fiscCodeIn);
			cmd.addParameter("@AMT_PLEDGED_IN", amtPledgedIn);
			cmd.addParameter("@AMT_PLEDGED_PAID_IN", amtPledgedPaidIn);
			cmd.addParameter("@AMT_GIFT_IN", amtGiftIn);
			cmd.addParameter("@AMT_MEMO_IN", amtMemoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdateDesgSummary(NString desg,NString fiscCode,NNumber giftAmount,NNumber pldgAmount,NNumber pldgAmountPaid,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_DESG_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DESG", desg);
			cmd.addParameter("@FISC_CODE", fiscCode);
			cmd.addParameter("@GIFT_AMOUNT", giftAmount);
			cmd.addParameter("@PLDG_AMOUNT", pldgAmount);
			cmd.addParameter("@PLDG_AMOUNT_PAID", pldgAmountPaid);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdateGiftDesg(NNumber pidmIn,NString giftNoIn,NString pledgeNoIn,NString campaignIn,NString desgIn,NNumber amountIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_GIFT_DESG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CAMPAIGN_IN", campaignIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdateGiftHardCredit(NNumber pidmIn,NNumber xrefPidmIn,NString giftNoIn,NString pledgeNoIn,NString campaignIn,NString desgIn,NNumber creditIn,NNumber tppAmtIn,NString tppPledgeNoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_GIFT_HARD_CREDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@XREF_PIDM_IN", xrefPidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CAMPAIGN_IN", campaignIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@CREDIT_IN", creditIn);
			cmd.addParameter("@TPP_AMT_IN", tppAmtIn);
			cmd.addParameter("@TPP_PLEDGE_NO_IN", tppPledgeNoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdateGiftHardCreditHead(NNumber pidmIn,NNumber xrefPidmIn,NString giftNoIn,NString pledgeNoIn,NNumber creditIn,NNumber tppAmtIn,NString tppPledgeNoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_GIFT_HARD_CREDIT_HEAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@XREF_PIDM_IN", xrefPidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CREDIT_IN", creditIn);
			cmd.addParameter("@TPP_AMT_IN", tppAmtIn);
			cmd.addParameter("@TPP_PLEDGE_NO_IN", tppPledgeNoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdateGiftHistory(NNumber pidm,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_GIFT_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdateGiftPayment(NNumber pidm,NString giftNo,NString pledgeNo,NNumber amount,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_GIFT_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
			cmd.addParameter("@AMOUNT", amount);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdateGiftSoftCredit(NNumber pidmIn,NNumber xrefPidmIn,NString giftNoIn,NString pledgeNoIn,NString campaignIn,NString desgIn,NNumber creditIn,NNumber tppAmtIn,NString tppPledgeNoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_GIFT_SOFT_CREDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@XREF_PIDM_IN", xrefPidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CAMPAIGN_IN", campaignIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@CREDIT_IN", creditIn);
			cmd.addParameter("@TPP_AMT_IN", tppAmtIn);
			cmd.addParameter("@TPP_PLEDGE_NO_IN", tppPledgeNoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdateGiftSoftCreditHead(NNumber pidmIn,NNumber xrefPidmIn,NString giftNoIn,NString pledgeNoIn,NNumber creditIn,NNumber tppAmtIn,NString tppPledgeNoIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_GIFT_SOFT_CREDIT_HEAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@XREF_PIDM_IN", xrefPidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CREDIT_IN", creditIn);
			cmd.addParameter("@TPP_AMT_IN", tppAmtIn);
			cmd.addParameter("@TPP_PLEDGE_NO_IN", tppPledgeNoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdateGivingSummary(NString campaign,NString desg,NNumber giftAmount,NNumber pldgAmount,NString fiscCode,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_GIVING_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAMPAIGN", campaign);
			cmd.addParameter("@DESG", desg);
			cmd.addParameter("@GIFT_AMOUNT", giftAmount);
			cmd.addParameter("@PLDG_AMOUNT", pldgAmount);
			cmd.addParameter("@FISC_CODE", fiscCode);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdatePledgeCamp(NNumber pidmIn,NString pledgeNoIn,NString campaignIn,NNumber amtIn,NNumber amtPaidIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_PLEDGE_CAMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CAMPAIGN_IN", campaignIn);
			cmd.addParameter("@AMT_IN", amtIn);
			cmd.addParameter("@AMT_PAID_IN", amtPaidIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdatePledgeDesg(NNumber pidmIn,NString pledgeNoIn,NString campaignIn,NString desgIn,NNumber amtIn,NNumber amtPaidIn,NDate activityDateIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_PLEDGE_DESG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CAMPAIGN_IN", campaignIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@AMT_IN", amtIn);
			cmd.addParameter("@AMT_PAID_IN", amtPaidIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdatePledgeHardCredit(NNumber pidm,NNumber xrefPidm,NString pledgeNo,NNumber splitAmount,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_PLEDGE_HARD_CREDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@XREF_PIDM", xrefPidm);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
			cmd.addParameter("@SPLIT_AMOUNT", splitAmount);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pUpdatePledgeStatus(NString thirdPPledgeNo,Ref<NString> status,Ref<NString> procName,Ref<NString> error) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_UPDATE_PLEDGE_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@THIRD_P_PLEDGE_NO", thirdPPledgeNo);
			cmd.addParameter("@STATUS", NString.class);
			cmd.addParameter("@PROC_NAME", NString.class);
			cmd.addParameter("@ERROR", NString.class);
				
			cmd.execute();
			status.val = cmd.getParameterValue("@STATUS", NString.class);
			procName.val = cmd.getParameterValue("@PROC_NAME", NString.class);
			error.val = cmd.getParameterValue("@ERROR", NString.class);


		}
		
		public static void pValidateVoid(NNumber pidmIn,NString giftNoIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_VALIDATE_VOID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pVoidGift(NNumber pidmIn,NString giftNoIn,NString cclsCodeIn,NString cclsCommentIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKGIFT.P_VOID_GIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@CCLS_CODE_IN", cclsCodeIn);
			cmd.addParameter("@CCLS_COMMENT_IN", cclsCommentIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="CampDesgRecRow", dataSourceName="CAMP_DESG_REC")
	public static class CampDesgRecRow
	{
		@DbRecordField(dataSourceName="CAMPAIGN")
		public NString Campaign;
		@DbRecordField(dataSourceName="DESG")
		public NString Desg;
		@DbRecordField(dataSourceName="AMOUNT")
		public NNumber Amount;
		@DbRecordField(dataSourceName="PLEDGE_NO")
		public NString PledgeNo;
		@DbRecordField(dataSourceName="USER")
		public NString User;
	}

	
	
}
