package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakjpst {
		public static NString fCleanLocalCheck(NString pText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.F_CLEAN_LOCAL_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TEXT", pText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddAPosting() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.P_ADD_A_POSTING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeletePosting(NString jpstRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.P_DELETE_POSTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JPST_ROWID", jpstRowid);
				
			cmd.execute();


		}
		
		public static void pFindAJob() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.P_FIND_A_JOB", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetPosting(NString jpstRowid,NString functionType,NNumber emprPidm,NString jpstTitle,NString jpstAcptApplUntil,NString jpstContactName,NString jpstDesc,NString jpstLocation,NString jpstContactEmail,NString jpstEmprUrl,NString jpstHouseNumber,NString jpstStreetLine1,NString jpstStreetLine2,NString jpstStreetLine3,NString jpstStreetLine4,NString jpstCity,NString jpstStatCode,NString jpstZip,NString jpstNatnCode,NString jpstCtryCodePhone,NString jpstPhoneArea,NString jpstPhoneNumber,NString jpstPhoneExt,NString jpstCtryCodeFax,NString jpstFaxArea,NString jpstFaxNumber,NString jpstJobcCode1,NString jpstJobcCode2,NString jpstJobcCode3,NString jpstReqmnt,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.P_GET_POSTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JPST_ROWID", jpstRowid);
			cmd.addParameter("@FUNCTION_TYPE", functionType);
			cmd.addParameter("@EMPR_PIDM", emprPidm);
			cmd.addParameter("@JPST_TITLE", jpstTitle);
			cmd.addParameter("@JPST_ACPT_APPL_UNTIL", jpstAcptApplUntil);
			cmd.addParameter("@JPST_CONTACT_NAME", jpstContactName);
			cmd.addParameter("@JPST_DESC", jpstDesc);
			cmd.addParameter("@JPST_LOCATION", jpstLocation);
			cmd.addParameter("@JPST_CONTACT_EMAIL", jpstContactEmail);
			cmd.addParameter("@JPST_EMPR_URL", jpstEmprUrl);
			cmd.addParameter("@JPST_HOUSE_NUMBER", jpstHouseNumber);
			cmd.addParameter("@JPST_STREET_LINE1", jpstStreetLine1);
			cmd.addParameter("@JPST_STREET_LINE2", jpstStreetLine2);
			cmd.addParameter("@JPST_STREET_LINE3", jpstStreetLine3);
			cmd.addParameter("@JPST_STREET_LINE4", jpstStreetLine4);
			cmd.addParameter("@JPST_CITY", jpstCity);
			cmd.addParameter("@JPST_STAT_CODE", jpstStatCode);
			cmd.addParameter("@JPST_ZIP", jpstZip);
			cmd.addParameter("@JPST_NATN_CODE", jpstNatnCode);
			cmd.addParameter("@JPST_CTRY_CODE_PHONE", jpstCtryCodePhone);
			cmd.addParameter("@JPST_PHONE_AREA", jpstPhoneArea);
			cmd.addParameter("@JPST_PHONE_NUMBER", jpstPhoneNumber);
			cmd.addParameter("@JPST_PHONE_EXT", jpstPhoneExt);
			cmd.addParameter("@JPST_CTRY_CODE_FAX", jpstCtryCodeFax);
			cmd.addParameter("@JPST_FAX_AREA", jpstFaxArea);
			cmd.addParameter("@JPST_FAX_NUMBER", jpstFaxNumber);
			cmd.addParameter("@JPST_JOBC_CODE_1", jpstJobcCode1);
			cmd.addParameter("@JPST_JOBC_CODE_2", jpstJobcCode2);
			cmd.addParameter("@JPST_JOBC_CODE_3", jpstJobcCode3);
			cmd.addParameter("@JPST_REQMNT", jpstReqmnt);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pInsertPosting(NString jpstRowid,NString functionType,NNumber emprPidm,NString jpstTitle,NString jpstAcptApplUntil,NString jpstContactName,NString jpstDesc,NString jpstLocation,NString jpstContactEmail,NString jpstEmprUrl,NString jpstHouseNumber,NString jpstStreetLine1,NString jpstStreetLine2,NString jpstStreetLine3,NString jpstStreetLine4,NString jpstCity,NString jpstStatCode,NString jpstZip,NString jpstNatnCode,NString jpstCtryCodePhone,NString jpstPhoneArea,NString jpstPhoneNumber,NString jpstPhoneExt,NString jpstCtryCodeFax,NString jpstFaxArea,NString jpstFaxNumber,NString jpstJobcCode1,NString jpstJobcCode2,NString jpstJobcCode3,NString jpstReqmnt,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.P_INSERT_POSTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JPST_ROWID", jpstRowid);
			cmd.addParameter("@FUNCTION_TYPE", functionType);
			cmd.addParameter("@EMPR_PIDM", emprPidm);
			cmd.addParameter("@JPST_TITLE", jpstTitle);
			cmd.addParameter("@JPST_ACPT_APPL_UNTIL", jpstAcptApplUntil);
			cmd.addParameter("@JPST_CONTACT_NAME", jpstContactName);
			cmd.addParameter("@JPST_DESC", jpstDesc);
			cmd.addParameter("@JPST_LOCATION", jpstLocation);
			cmd.addParameter("@JPST_CONTACT_EMAIL", jpstContactEmail);
			cmd.addParameter("@JPST_EMPR_URL", jpstEmprUrl);
			cmd.addParameter("@JPST_HOUSE_NUMBER", jpstHouseNumber);
			cmd.addParameter("@JPST_STREET_LINE1", jpstStreetLine1);
			cmd.addParameter("@JPST_STREET_LINE2", jpstStreetLine2);
			cmd.addParameter("@JPST_STREET_LINE3", jpstStreetLine3);
			cmd.addParameter("@JPST_STREET_LINE4", jpstStreetLine4);
			cmd.addParameter("@JPST_CITY", jpstCity);
			cmd.addParameter("@JPST_STAT_CODE", jpstStatCode);
			cmd.addParameter("@JPST_ZIP", jpstZip);
			cmd.addParameter("@JPST_NATN_CODE", jpstNatnCode);
			cmd.addParameter("@JPST_CTRY_CODE_PHONE", jpstCtryCodePhone);
			cmd.addParameter("@JPST_PHONE_AREA", jpstPhoneArea);
			cmd.addParameter("@JPST_PHONE_NUMBER", jpstPhoneNumber);
			cmd.addParameter("@JPST_PHONE_EXT", jpstPhoneExt);
			cmd.addParameter("@JPST_CTRY_CODE_FAX", jpstCtryCodeFax);
			cmd.addParameter("@JPST_FAX_AREA", jpstFaxArea);
			cmd.addParameter("@JPST_FAX_NUMBER", jpstFaxNumber);
			cmd.addParameter("@JPST_JOBC_CODE_1", jpstJobcCode1);
			cmd.addParameter("@JPST_JOBC_CODE_2", jpstJobcCode2);
			cmd.addParameter("@JPST_JOBC_CODE_3", jpstJobcCode3);
			cmd.addParameter("@JPST_REQMNT", jpstReqmnt);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pNextsearchresults(NString jpstRowid,NNumber srchCompanyPidm,NString srchSiccCode,NString srchCity,NString srchStatCode,NString srchJobcCode,NNumber howMany) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.P_NEXTSEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JPST_ROWID", jpstRowid);
			cmd.addParameter("@SRCH_COMPANY_PIDM", srchCompanyPidm);
			cmd.addParameter("@SRCH_SICC_CODE", srchSiccCode);
			cmd.addParameter("@SRCH_CITY", srchCity);
			cmd.addParameter("@SRCH_STAT_CODE", srchStatCode);
			cmd.addParameter("@SRCH_JOBC_CODE", srchJobcCode);
			cmd.addParameter("@HOW_MANY", howMany);
				
			cmd.execute();


		}
		
		public static void pProcessSubmit(NString jpstRowid,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.P_PROCESS_SUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JPST_ROWID", jpstRowid);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pSearchresults(NString jpstRowid,NNumber srchCompanyPidm,NString srchSiccCode,NString srchCity,NString srchStatCode,NString srchJobcCode,NNumber howMany) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.P_SEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JPST_ROWID", jpstRowid);
			cmd.addParameter("@SRCH_COMPANY_PIDM", srchCompanyPidm);
			cmd.addParameter("@SRCH_SICC_CODE", srchSiccCode);
			cmd.addParameter("@SRCH_CITY", srchCity);
			cmd.addParameter("@SRCH_STAT_CODE", srchStatCode);
			cmd.addParameter("@SRCH_JOBC_CODE", srchJobcCode);
			cmd.addParameter("@HOW_MANY", howMany);
				
			cmd.execute();


		}
		
		public static void pShowPostingDetail(NString jpstRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.P_SHOW_POSTING_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JPST_ROWID", jpstRowid);
				
			cmd.execute();


		}
		
		public static void pShowPostings() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKJPST.P_SHOW_POSTINGS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
