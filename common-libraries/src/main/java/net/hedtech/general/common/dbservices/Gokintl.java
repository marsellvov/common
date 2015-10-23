package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokintl {
		public static NString fCheckGobintlExists(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.F_CHECK_GOBINTL_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckNonresidentStatus(NNumber pidm,NDate inputDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.F_CHECK_NONRESIDENT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@INPUT_DATE", inputDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  fGetGobintlRowid(NNumber pidm) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.F_GET_GOBINTL_ROWID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@PIDM", pidm);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  fGetGorvisaRowid(NNumber pidm) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.F_GET_GORVISA_ROWID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@PIDM", pidm);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void fGobintlSelect() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.F_GOBINTL_SELECT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGobintlValue(NNumber pPidm,NString pReturnValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.F_GOBINTL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RETURN_VALUE", pReturnValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGordocmSelect() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.F_GORDOCM_SELECT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGorvisaValue(NNumber pPidm,NString pReturnValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.F_GORVISA_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RETURN_VALUE", pReturnValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGobintlDeleteRow(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.P_GOBINTL_DELETE_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pGobintlInsert(NNumber pidm,NString spouseInd,NString signatureInd,NString userId,NDate activityDate,NString passportId,NString natnCodeIssue,NDate passportExpDate,NString i94Status,NDate i94Date,NString regNumber,NString duration,NString celgCode,NString certNumber,NDate certDateIssue,NDate certDateReceipt,NString admrCode,NString natnCodeBirth,NString natnCodeLegal,NString langCode,NString sponCode,NString emptCode,NString foreignSsn,NNumber childNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.P_GOBINTL_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SPOUSE_IND", spouseInd);
			cmd.addParameter("@SIGNATURE_IND", signatureInd);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@PASSPORT_ID", passportId);
			cmd.addParameter("@NATN_CODE_ISSUE", natnCodeIssue);
			cmd.addParameter("@PASSPORT_EXP_DATE", passportExpDate);
			cmd.addParameter("@I94_STATUS", i94Status);
			cmd.addParameter("@I94_DATE", i94Date);
			cmd.addParameter("@REG_NUMBER", regNumber);
			cmd.addParameter("@DURATION", duration);
			cmd.addParameter("@CELG_CODE", celgCode);
			cmd.addParameter("@CERT_NUMBER", certNumber);
			cmd.addParameter("@CERT_DATE_ISSUE", certDateIssue);
			cmd.addParameter("@CERT_DATE_RECEIPT", certDateReceipt);
			cmd.addParameter("@ADMR_CODE", admrCode);
			cmd.addParameter("@NATN_CODE_BIRTH", natnCodeBirth);
			cmd.addParameter("@NATN_CODE_LEGAL", natnCodeLegal);
			cmd.addParameter("@LANG_CODE", langCode);
			cmd.addParameter("@SPON_CODE", sponCode);
			cmd.addParameter("@EMPT_CODE", emptCode);
			cmd.addParameter("@FOREIGN_SSN", foreignSsn);
			cmd.addParameter("@CHILD_NUMBER", childNumber);
				
			cmd.execute();


		}
		
		public static void pGobintlUpdateRow(NNumber pidm,NString spouseInd,NString signatureInd,NString userId,NDate activityDate,NString passportId,NString natnCodeIssue,NDate passportExpDate,NString i94Status,NDate i94Date,NString regNumber,NString duration,NString celgCode,NString certNumber,NDate certDateIssue,NDate certDateReceipt,NString admrCode,NString natnCodeBirth,NString natnCodeLegal,NString langCode,NString sponCode,NString emptCode,NString foreignSsn,NNumber childNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.P_GOBINTL_UPDATE_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SPOUSE_IND", spouseInd);
			cmd.addParameter("@SIGNATURE_IND", signatureInd);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@PASSPORT_ID", passportId);
			cmd.addParameter("@NATN_CODE_ISSUE", natnCodeIssue);
			cmd.addParameter("@PASSPORT_EXP_DATE", passportExpDate);
			cmd.addParameter("@I94_STATUS", i94Status);
			cmd.addParameter("@I94_DATE", i94Date);
			cmd.addParameter("@REG_NUMBER", regNumber);
			cmd.addParameter("@DURATION", duration);
			cmd.addParameter("@CELG_CODE", celgCode);
			cmd.addParameter("@CERT_NUMBER", certNumber);
			cmd.addParameter("@CERT_DATE_ISSUE", certDateIssue);
			cmd.addParameter("@CERT_DATE_RECEIPT", certDateReceipt);
			cmd.addParameter("@ADMR_CODE", admrCode);
			cmd.addParameter("@NATN_CODE_BIRTH", natnCodeBirth);
			cmd.addParameter("@NATN_CODE_LEGAL", natnCodeLegal);
			cmd.addParameter("@LANG_CODE", langCode);
			cmd.addParameter("@SPON_CODE", sponCode);
			cmd.addParameter("@EMPT_CODE", emptCode);
			cmd.addParameter("@FOREIGN_SSN", foreignSsn);
			cmd.addParameter("@CHILD_NUMBER", childNumber);
				
			cmd.execute();


		}
		
		public static void pGordocmDeleteRow(NNumber pidm,NNumber seqNo,NString vtypCode,NString visaNumber,NString docmCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.P_GORDOCM_DELETE_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@VTYP_CODE", vtypCode);
			cmd.addParameter("@VISA_NUMBER", visaNumber);
			cmd.addParameter("@DOCM_CODE", docmCode);
				
			cmd.execute();


		}
		
		public static void pGordocmInsert(NNumber pidm,NNumber seqNo,NString vtypCode,NString visaNumber,NString docmCode,NString disposition,NString userId,NDate activityDate,NString srceCode,NDate requestDate,NDate receivedDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.P_GORDOCM_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@VTYP_CODE", vtypCode);
			cmd.addParameter("@VISA_NUMBER", visaNumber);
			cmd.addParameter("@DOCM_CODE", docmCode);
			cmd.addParameter("@DISPOSITION", disposition);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@SRCE_CODE", srceCode);
			cmd.addParameter("@REQUEST_DATE", requestDate);
			cmd.addParameter("@RECEIVED_DATE", receivedDate);
				
			cmd.execute();


		}
		
		public static void pGordocmUpdateRow(NNumber pidm,NNumber seqNo,NString vtypCode,NString visaNumber,NString docmCode,NString disposition,NString userId,NDate activityDate,NString srceCode,NDate requestDate,NDate receivedDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKINTL.P_GORDOCM_UPDATE_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@VTYP_CODE", vtypCode);
			cmd.addParameter("@VISA_NUMBER", visaNumber);
			cmd.addParameter("@DOCM_CODE", docmCode);
			cmd.addParameter("@DISPOSITION", disposition);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@SRCE_CODE", srceCode);
			cmd.addParameter("@REQUEST_DATE", requestDate);
			cmd.addParameter("@RECEIVED_DATE", receivedDate);
				
			cmd.execute();


		}
		
	
	
	
}
