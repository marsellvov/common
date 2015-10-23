package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eoksrts {
		public static void pSarchklAdr(NString oldId,NString oldTermCodeEntry,NNumber oldApplNo,NString oldAdmrCode,NString oldCodeValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SARCHKL_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@OLD_TERM_CODE_ENTRY", oldTermCodeEntry);
			cmd.addParameter("@OLD_APPL_NO", oldApplNo);
			cmd.addParameter("@OLD_ADMR_CODE", oldAdmrCode);
			cmd.addParameter("@OLD_CODE_VALUE", oldCodeValue);
				
			cmd.execute();


		}
		
		public static void pSarchklAir(NString newId,NString newTermCodeEntry,NNumber newApplNo,NString newAdmrCode,NString newCodeValue,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SARCHKL_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@NEW_TERM_CODE_ENTRY", newTermCodeEntry);
			cmd.addParameter("@NEW_APPL_NO", newApplNo);
			cmd.addParameter("@NEW_ADMR_CODE", newAdmrCode);
			cmd.addParameter("@NEW_CODE_VALUE", newCodeValue);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pSarchklAur(NString newId,NString oldId,NString newTermCodeEntry,NString oldTermCodeEntry,NNumber newApplNo,NNumber oldApplNo,NString newAdmrCode,NString oldAdmrCode,NString newCodeValue,NString oldCodeValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SARCHKL_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_TERM_CODE_ENTRY", newTermCodeEntry);
			cmd.addParameter("@OLD_TERM_CODE_ENTRY", oldTermCodeEntry);
			cmd.addParameter("@NEW_APPL_NO", newApplNo);
			cmd.addParameter("@OLD_APPL_NO", oldApplNo);
			cmd.addParameter("@NEW_ADMR_CODE", newAdmrCode);
			cmd.addParameter("@OLD_ADMR_CODE", oldAdmrCode);
			cmd.addParameter("@NEW_CODE_VALUE", newCodeValue);
			cmd.addParameter("@OLD_CODE_VALUE", oldCodeValue);
				
			cmd.execute();


		}
		
		public static void pSfrstcrAdr(NString oldId,NString oldTermCode,NString oldCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SFRSTCR_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
			cmd.addParameter("@OLD_CRN", oldCrn);
				
			cmd.execute();


		}
		
		public static void pSfrstcrAir(NString newId,NString newTermCode,NString newCrn,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SFRSTCR_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@NEW_CRN", newCrn);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pSfrstcrAur(NString newId,NString oldId,NString newTermCode,NString oldTermCode,NString newCrn,NString oldCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SFRSTCR_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
			cmd.addParameter("@NEW_CRN", newCrn);
			cmd.addParameter("@OLD_CRN", oldCrn);
				
			cmd.execute();


		}
		
		public static void pShrdgmrAdr(NString oldId,NString oldDegcCode,NNumber oldSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SHRDGMR_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@OLD_DEGC_CODE", oldDegcCode);
			cmd.addParameter("@OLD_SEQ_NO", oldSeqNo);
				
			cmd.execute();


		}
		
		public static void pShrdgmrAir(NString newId,NString newDegcCode,NNumber newSeqNo,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SHRDGMR_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@NEW_DEGC_CODE", newDegcCode);
			cmd.addParameter("@NEW_SEQ_NO", newSeqNo);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pShrdgmrAur(NString newId,NString oldId,NString newDegcCode,NString oldDegcCode,NNumber newSeqNo,NNumber oldSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SHRDGMR_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_DEGC_CODE", newDegcCode);
			cmd.addParameter("@OLD_DEGC_CODE", oldDegcCode);
			cmd.addParameter("@NEW_SEQ_NO", newSeqNo);
			cmd.addParameter("@OLD_SEQ_NO", oldSeqNo);
				
			cmd.execute();


		}
		
		public static void pShrtcknAur(NString newId,NString oldId,NString newTermCode,NString oldTermCode,NString newCrn,NString oldCrn,NString newSubjCode,NString oldSubjCode,NString newCrseNumb,NString oldCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SHRTCKN_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
			cmd.addParameter("@NEW_CRN", newCrn);
			cmd.addParameter("@OLD_CRN", oldCrn);
			cmd.addParameter("@NEW_SUBJ_CODE", newSubjCode);
			cmd.addParameter("@OLD_SUBJ_CODE", oldSubjCode);
			cmd.addParameter("@NEW_CRSE_NUMB", newCrseNumb);
			cmd.addParameter("@OLD_CRSE_NUMB", oldCrseNumb);
				
			cmd.execute();


		}
		
		public static void pSpridenAir(NNumber newPidm,NString newId,NString chgInd,NString newFirstname,NString newLastname,NString newSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SPRIDEN_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@CHG_IND", chgInd);
			cmd.addParameter("@NEW_FIRSTNAME", newFirstname);
			cmd.addParameter("@NEW_LASTNAME", newLastname);
			cmd.addParameter("@NEW_SURNAME_PREFIX", newSurnamePrefix);
				
			cmd.execute();


		}
		
		public static void pSpridenAur(NNumber newPidm,NNumber oldPidm,NString newId,NString oldId,NString chgInd,NString newFirstname,NString oldFirstname,NString newLastname,NString oldLastname,NString newSurnamePrefix,NString oldSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SPRIDEN_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@OLD_PIDM", oldPidm);
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@CHG_IND", chgInd);
			cmd.addParameter("@NEW_FIRSTNAME", newFirstname);
			cmd.addParameter("@OLD_FIRSTNAME", oldFirstname);
			cmd.addParameter("@NEW_LASTNAME", newLastname);
			cmd.addParameter("@OLD_LASTNAME", oldLastname);
			cmd.addParameter("@NEW_SURNAME_PREFIX", newSurnamePrefix);
			cmd.addParameter("@OLD_SURNAME_PREFIX", oldSurnamePrefix);
				
			cmd.execute();


		}
		
		public static void pSsbsectAur(NString newTermCode,NString oldTermCode,NString newCrn,NString oldCrn,NString newSubjCode,NString oldSubjCode,NString newCrseNumb,NString oldCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_SSBSECT_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
			cmd.addParameter("@NEW_CRN", newCrn);
			cmd.addParameter("@OLD_CRN", oldCrn);
			cmd.addParameter("@NEW_SUBJ_CODE", newSubjCode);
			cmd.addParameter("@OLD_SUBJ_CODE", oldSubjCode);
			cmd.addParameter("@NEW_CRSE_NUMB", newCrseNumb);
			cmd.addParameter("@OLD_CRSE_NUMB", oldCrseNumb);
				
			cmd.execute();


		}
		
		public static void pStvadmrAir(NString newAdmrCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_STVADMR_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ADMR_CODE", newAdmrCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pStvadmrAur(NString newAdmrCode,NString oldAdmrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_STVADMR_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ADMR_CODE", newAdmrCode);
			cmd.addParameter("@OLD_ADMR_CODE", oldAdmrCode);
				
			cmd.execute();


		}
		
		public static void pStvtermAir(NString newTermCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_STVTERM_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pStvtermAur(NString newTermCode,NString oldTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSRTS.P_STVTERM_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TERM_CODE", newTermCode);
			cmd.addParameter("@OLD_TERM_CODE", oldTermCode);
				
			cmd.execute();


		}
		
	
	
	
}
