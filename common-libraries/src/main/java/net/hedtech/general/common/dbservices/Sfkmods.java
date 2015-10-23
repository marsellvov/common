package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkmods {
		public static NBool fDeleteSfrefee(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.F_DELETE_SFREFEE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fInsertSfrbtch(NString clasIn,NString termIn,NString pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.F_INSERT_SFRBTCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CLAS_IN", clasIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAdminMsgs(NNumber pidmIn,NString termIn,NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_ADMIN_MSGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();


		}
		
		public static void pAssessMeal(NString sessionidIn,NString masgArIndIn,NDate feeAssessmentDateIn,NString termIn,NNumber pidmIn,NString origChgIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_ASSESS_MEAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@MASG_AR_IND_IN", masgArIndIn);
			cmd.addParameter("@FEE_ASSESSMENT_DATE_IN", feeAssessmentDateIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ORIG_CHG_IND_IN", origChgIndIn);
				
			cmd.execute();


		}
		
		public static void pAssessPhone(NString sessionidIn,NString pasgArIndIn,NDate feeAssessmentDateIn,NString termIn,NNumber pidmIn,NString origChgIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_ASSESS_PHONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@PASG_AR_IND_IN", pasgArIndIn);
			cmd.addParameter("@FEE_ASSESSMENT_DATE_IN", feeAssessmentDateIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ORIG_CHG_IND_IN", origChgIndIn);
				
			cmd.execute();


		}
		
		public static void pAssessRoom(NString sessionidIn,NString rasgArIndIn,NDate feeAssessmentDateIn,NString termIn,NNumber pidmIn,NString origChgIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_ASSESS_ROOM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@RASG_AR_IND_IN", rasgArIndIn);
			cmd.addParameter("@FEE_ASSESSMENT_DATE_IN", feeAssessmentDateIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ORIG_CHG_IND_IN", origChgIndIn);
				
			cmd.execute();


		}
		
		public static void pBatchBillSchd(NString printScheduleIn,NString printBillVrIn,NDate currDateIn,NString schdPrinterIn,NString cbilPrinterIn,NString processedIndIn,NString sessionidIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_BATCH_BILL_SCHD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINT_SCHEDULE_IN", printScheduleIn);
			cmd.addParameter("@PRINT_BILL_VR_IN", printBillVrIn);
			cmd.addParameter("@CURR_DATE_IN", currDateIn);
			cmd.addParameter("@SCHD_PRINTER_IN", schdPrinterIn);
			cmd.addParameter("@CBIL_PRINTER_IN", cbilPrinterIn);
			cmd.addParameter("@PROCESSED_IND_IN", processedIndIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pDeleteComplianceResults(NNumber requestNoIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_DELETE_COMPLIANCE_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pDeleteSfrareg(NNumber pidmIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_DELETE_SFRAREG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pDeleteSfrregd(NNumber pidmIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_DELETE_SFRREGD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pDeleteSftareaAll(NNumber requestNoIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_DELETE_SFTAREA_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pDeleteSftregs(NString termIn,NNumber pidmIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_DELETE_SFTREGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pDeleteSftregsByPidmTerm(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_DELETE_SFTREGS_BY_PIDM_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pDeleteSftregsRemoved(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_DELETE_SFTREGS_REMOVED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pDeleteSftrgam(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_DELETE_SFTRGAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pEndRegAccess(NNumber pidmIn,NString termIn,NString accessIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_END_REG_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ACCESS_ID_IN", accessIdIn);
				
			cmd.execute();


		}
		
		public static void pInsertSfbetrm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFBETRM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSfrareg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFRAREG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSfrbtch(NString pClasCode,NString pTermCode,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFRBTCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CLAS_CODE", pClasCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pInsertSfrcbrq() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFRCBRQ", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSfrracl(NNumber pidmIn,NString termIn,NString sourceIn,NString accessIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFRRACL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_IN", sourceIn);
			cmd.addParameter("@ACCESS_ID_IN", accessIdIn);
				
			cmd.execute();


		}
		
		public static void pInsertSfrregd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFRREGD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSfrstca() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFRSTCA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSfrstcr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFRSTCR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSfrstsh(NString tmstIn,NString scpsIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFRSTSH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TMST_IN", tmstIn);
			cmd.addParameter("@SCPS_IN", scpsIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pInsertSfrthst(NString tmstIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFRTHST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TMST_IN", tmstIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
//		public static void pInsertSftregs(Ref<List<Soktabs.SftregsTabTypeRow>> sftregsTable,NNumber numRecsIn,NString commitFlagIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFTREGS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("SFTREGS_TABLE", "", sftregsTable.val, object.class , true));
//			cmd.addParameter("@NUM_RECS_IN", numRecsIn);
//			cmd.addParameter("@COMMIT_FLAG_IN", commitFlagIn);
//				
//			cmd.execute();
//			// sftregsTable.val = cmd.getTableParameterValue("@SFTREGS_TABLE", object.class);
//
//
//		}
		
		public static void pInsertSftregsFromStcr(NNumber pidmIn,NString termIn,NDate regDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFTREGS_FROM_STCR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@REG_DATE_IN", regDateIn);
				
			cmd.execute();


		}
		
		public static void pInsertSftrgam(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFTRGAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pInsertSftrgamCapp(NNumber pidmIn,NString termIn,NString cappErrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFTRGAM_CAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CAPP_ERR_IN", cappErrIn);
				
			cmd.execute();


		}
		
		public static void pInsertSftrgamMinh(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_SFTRGAM_MINH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pInsertTbraccdCc(NNumber accdPidm,NNumber accdAmt,NString cardNumb,NString authCode,NDate expDate,Ref<NString> msg,Ref<NString> cardDesc,NString subCode,NString cardType,Ref<NNumber> tranNum,Ref<NDate> insertDate,NString sysiCode,NString procCode,NString termIn,NNumber rcptInOut,NNumber tranNumPaidIn,NString transIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_INSERT_TBRACCD_CC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACCD_PIDM", accdPidm);
			cmd.addParameter("@ACCD_AMT", accdAmt);
			cmd.addParameter("@CARD_NUMB", cardNumb);
			cmd.addParameter("@AUTH_CODE", authCode);
			cmd.addParameter("@EXP_DATE", expDate);
			cmd.addParameter("@MSG", msg, true);
			cmd.addParameter("@CARD_DESC", cardDesc, true);
			cmd.addParameter("@SUB_CODE", subCode);
			cmd.addParameter("@CARD_TYPE", cardType);
			cmd.addParameter("@TRAN_NUM", tranNum, true);
			cmd.addParameter("@INSERT_DATE", insertDate, true);
			cmd.addParameter("@SYSI_CODE", sysiCode);
			cmd.addParameter("@PROC_CODE", procCode);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@RCPT_IN_OUT", rcptInOut);
			cmd.addParameter("@TRAN_NUM_PAID_IN", tranNumPaidIn);
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
				
			cmd.execute();
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			cardDesc.val = cmd.getParameterValue("@CARD_DESC", NString.class);
			tranNum.val = cmd.getParameterValue("@TRAN_NUM", NNumber.class);
			insertDate.val = cmd.getParameterValue("@INSERT_DATE", NDate.class);


		}
		
		public static void pRegatrailInsert() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_REGATRAIL_INSERT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pResetSftregsFields(NNumber pidmIn,NString termIn,NString crnIn,NString typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_RESET_SFTREGS_FIELDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();


		}
		
		public static void pSetSftregsErrorLink(NNumber pidmIn,NString termIn,NString crnIn,NNumber linkIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_SET_SFTREGS_ERROR_LINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@LINK_IN", linkIn);
				
			cmd.execute();


		}
		
		public static void pSwapRstsCodes(NNumber pidmIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_SWAP_RSTS_CODES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pUpdateOverrides(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_UPDATE_OVERRIDES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSfbetrm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_UPDATE_SFBETRM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateSfbetrmTmstCode(NString tmstIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_UPDATE_SFBETRM_TMST_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TMST_IN", tmstIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSfrareg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_UPDATE_SFRAREG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateSfrracl(NNumber pidmIn,NString termIn,NString sourceIn,NString accessIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_UPDATE_SFRRACL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_IN", sourceIn);
			cmd.addParameter("@ACCESS_ID_IN", accessIdIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSfrraclLastActivity(NNumber pidmIn,NString termIn,NString accessIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_UPDATE_SFRRACL_LAST_ACTIVITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ACCESS_ID_IN", accessIdIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSfrstcr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_UPDATE_SFRSTCR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateSftregsRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_UPDATE_SFTREGS_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateShrcmrk(NString crnIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_UPDATE_SHRCMRK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pUpdateShrmrks(NString crnIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMODS.P_UPDATE_SHRMRKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
	
	
	
}
