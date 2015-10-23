package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokfrts {
		public static void pChkFundOrgSecur(NString fidocnumIn,NString dtypcodeIn,NString usernameIn,Ref<NNumber> fosResult) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_CHK_FUND_ORG_SECUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIDOCNUM_IN", fidocnumIn);
			cmd.addParameter("@DTYPCODE_IN", dtypcodeIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@FOS_RESULT", NNumber.class);
				
			cmd.execute();
			fosResult.val = cmd.getParameterValue("@FOS_RESULT", NNumber.class);


		}
		
		public static void pFabchksAdr(NString oldCheckNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FABCHKS_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_CHECK_NUM", oldCheckNum);
				
			cmd.execute();


		}
		
		public static void pFabchksAir(NString newCheckNum,NDate newCheckDate,NString newBankCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FABCHKS_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_CHECK_NUM", newCheckNum);
			cmd.addParameter("@NEW_CHECK_DATE", newCheckDate);
			cmd.addParameter("@NEW_BANK_CODE", newBankCode);
				
			cmd.execute();


		}
		
		public static void pFabchksAur(NString newCheckNum,NString oldCheckNum,NDate newCheckDate,NDate oldCheckDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FABCHKS_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_CHECK_NUM", newCheckNum);
			cmd.addParameter("@OLD_CHECK_NUM", oldCheckNum);
			cmd.addParameter("@NEW_CHECK_DATE", newCheckDate);
			cmd.addParameter("@OLD_CHECK_DATE", oldCheckDate);
				
			cmd.execute();


		}
		
		public static void pFabinckAir(NString newInvhCode,NString newCheckNum,NString newBankCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FABINCK_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_INVH_CODE", newInvhCode);
			cmd.addParameter("@NEW_CHECK_NUM", newCheckNum);
			cmd.addParameter("@NEW_BANK_CODE", newBankCode);
				
			cmd.execute();


		}
		
		public static void pFabinckAur(NString newInvhCode,NString oldInvhCode,NString newCheckNum,NString oldCheckNum,NString newBankCode,NString oldBankCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FABINCK_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_INVH_CODE", newInvhCode);
			cmd.addParameter("@OLD_INVH_CODE", oldInvhCode);
			cmd.addParameter("@NEW_CHECK_NUM", newCheckNum);
			cmd.addParameter("@OLD_CHECK_NUM", oldCheckNum);
			cmd.addParameter("@NEW_BANK_CODE", newBankCode);
			cmd.addParameter("@OLD_BANK_CODE", oldBankCode);
				
			cmd.execute();


		}
		
		public static void pFabinvhAdr(NString oldCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FABINVH_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_CODE", oldCode);
				
			cmd.execute();


		}
		
		public static void pFabinvhAir(NString newCode,NDate newTransDate,NNumber newVendPidm,NString newOneTimeVendName,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FABINVH_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_CODE", newCode);
			cmd.addParameter("@NEW_TRANS_DATE", newTransDate);
			cmd.addParameter("@NEW_VEND_PIDM", newVendPidm);
			cmd.addParameter("@NEW_ONE_TIME_VEND_NAME", newOneTimeVendName);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pFabinvhAur(NString newCode,NString oldCode,NNumber newVendPidm,NNumber oldVendPidm,NDate newTransDate,NDate oldTransDate,NNumber newVendCheckPidm,NNumber oldVendCheckPidm,NString newOneTimeVendName,NString oldOneTimeVendName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FABINVH_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_CODE", newCode);
			cmd.addParameter("@OLD_CODE", oldCode);
			cmd.addParameter("@NEW_VEND_PIDM", newVendPidm);
			cmd.addParameter("@OLD_VEND_PIDM", oldVendPidm);
			cmd.addParameter("@NEW_TRANS_DATE", newTransDate);
			cmd.addParameter("@OLD_TRANS_DATE", oldTransDate);
			cmd.addParameter("@NEW_VEND_CHECK_PIDM", newVendCheckPidm);
			cmd.addParameter("@OLD_VEND_CHECK_PIDM", oldVendCheckPidm);
			cmd.addParameter("@NEW_ONE_TIME_VEND_NAME", newOneTimeVendName);
			cmd.addParameter("@OLD_ONE_TIME_VEND_NAME", oldOneTimeVendName);
				
			cmd.execute();


		}
		
		public static void pFgbjvchAdr(NString oldDocNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FGBJVCH_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_DOC_NUM", oldDocNum);
				
			cmd.execute();


		}
		
		public static void pFgbjvchAir(NString newDocNum,NDate newTransDate,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FGBJVCH_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_DOC_NUM", newDocNum);
			cmd.addParameter("@NEW_TRANS_DATE", newTransDate);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pFgbjvchAur(NString newDocNum,NString oldDocNum,NDate newTransDate,NDate oldTransDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FGBJVCH_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_DOC_NUM", newDocNum);
			cmd.addParameter("@OLD_DOC_NUM", oldDocNum);
			cmd.addParameter("@NEW_TRANS_DATE", newTransDate);
			cmd.addParameter("@OLD_TRANS_DATE", oldTransDate);
				
			cmd.execute();


		}
		
		public static void pFpbpohdAdr(NString oldCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FPBPOHD_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_CODE", oldCode);
				
			cmd.execute();


		}
		
		public static void pFpbpohdAir(NString newCode,NDate newTransDate,NNumber newVendPidm,NString newName,NNumber newChangeSeqNum,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FPBPOHD_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_CODE", newCode);
			cmd.addParameter("@NEW_TRANS_DATE", newTransDate);
			cmd.addParameter("@NEW_VEND_PIDM", newVendPidm);
			cmd.addParameter("@NEW_NAME", newName);
			cmd.addParameter("@NEW_CHANGE_SEQ_NUM", newChangeSeqNum);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pFpbpohdAur(NString newCode,NString oldCode,NDate newTransDate,NDate oldTransDate,NNumber newVendPidm,NNumber oldVendPidm,NString newName,NString oldName,NNumber newChangeSeqNum,NNumber oldChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FPBPOHD_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_CODE", newCode);
			cmd.addParameter("@OLD_CODE", oldCode);
			cmd.addParameter("@NEW_TRANS_DATE", newTransDate);
			cmd.addParameter("@OLD_TRANS_DATE", oldTransDate);
			cmd.addParameter("@NEW_VEND_PIDM", newVendPidm);
			cmd.addParameter("@OLD_VEND_PIDM", oldVendPidm);
			cmd.addParameter("@NEW_NAME", newName);
			cmd.addParameter("@OLD_NAME", oldName);
			cmd.addParameter("@NEW_CHANGE_SEQ_NUM", newChangeSeqNum);
			cmd.addParameter("@OLD_CHANGE_SEQ_NUM", oldChangeSeqNum);
				
			cmd.execute();


		}
		
		public static void pFpbreqhAdr(NString oldCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FPBREQH_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_CODE", oldCode);
				
			cmd.execute();


		}
		
		public static void pFpbreqhAir(NString newCode,NDate newTransDate,NNumber newVendPidm,NString newRecommVendName,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FPBREQH_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_CODE", newCode);
			cmd.addParameter("@NEW_TRANS_DATE", newTransDate);
			cmd.addParameter("@NEW_VEND_PIDM", newVendPidm);
			cmd.addParameter("@NEW_RECOMM_VEND_NAME", newRecommVendName);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pFpbreqhAur(NString newCode,NString oldCode,NDate newTransDate,NDate oldTransDate,NNumber newVendPidm,NNumber oldVendPidm,NString newRecommVendName,NString oldRecommVendName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FPBREQH_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_CODE", newCode);
			cmd.addParameter("@OLD_CODE", oldCode);
			cmd.addParameter("@NEW_TRANS_DATE", newTransDate);
			cmd.addParameter("@OLD_TRANS_DATE", oldTransDate);
			cmd.addParameter("@NEW_VEND_PIDM", newVendPidm);
			cmd.addParameter("@OLD_VEND_PIDM", oldVendPidm);
			cmd.addParameter("@NEW_RECOMM_VEND_NAME", newRecommVendName);
			cmd.addParameter("@OLD_RECOMM_VEND_NAME", oldRecommVendName);
				
			cmd.execute();


		}
		
		public static void pFrbgrntAdr(NString oldGrantCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FRBGRNT_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_GRANT_CODE", oldGrantCode);
				
			cmd.execute();


		}
		
		public static void pFrbgrntAir(NString newGrantCode,NString newGrantTitle,NString newCoasCode,NString newGrantResponCode,NString newPropCode,NNumber newAgencyPidm,NNumber newPiPidm,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FRBGRNT_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_GRANT_CODE", newGrantCode);
			cmd.addParameter("@NEW_GRANT_TITLE", newGrantTitle);
			cmd.addParameter("@NEW_COAS_CODE", newCoasCode);
			cmd.addParameter("@NEW_GRANT_RESPON_CODE", newGrantResponCode);
			cmd.addParameter("@NEW_PROP_CODE", newPropCode);
			cmd.addParameter("@NEW_AGENCY_PIDM", newAgencyPidm);
			cmd.addParameter("@NEW_PI_PIDM", newPiPidm);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pFrbgrntAur(NString newGrantCode,NString oldGrantCode,NString newGrantTitle,NString oldGrantTitle,NString newCoasCode,NString oldCoasCode,NString newGrantResponCode,NString oldGrantResponCode,NString newPropCode,NString oldPropCode,NNumber newAgencyPidm,NNumber oldAgencyPidm,NNumber newPiPidm,NNumber oldPiPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FRBGRNT_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_GRANT_CODE", newGrantCode);
			cmd.addParameter("@OLD_GRANT_CODE", oldGrantCode);
			cmd.addParameter("@NEW_GRANT_TITLE", newGrantTitle);
			cmd.addParameter("@OLD_GRANT_TITLE", oldGrantTitle);
			cmd.addParameter("@NEW_COAS_CODE", newCoasCode);
			cmd.addParameter("@OLD_COAS_CODE", oldCoasCode);
			cmd.addParameter("@NEW_GRANT_RESPON_CODE", newGrantResponCode);
			cmd.addParameter("@OLD_GRANT_RESPON_CODE", oldGrantResponCode);
			cmd.addParameter("@NEW_PROP_CODE", newPropCode);
			cmd.addParameter("@OLD_PROP_CODE", oldPropCode);
			cmd.addParameter("@NEW_AGENCY_PIDM", newAgencyPidm);
			cmd.addParameter("@OLD_AGENCY_PIDM", oldAgencyPidm);
			cmd.addParameter("@NEW_PI_PIDM", newPiPidm);
			cmd.addParameter("@OLD_PI_PIDM", oldPiPidm);
				
			cmd.execute();


		}
		
		public static void pFrbpropAdr(NString oldPropCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FRBPROP_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_PROP_CODE", oldPropCode);
				
			cmd.execute();


		}
		
		public static void pFrbpropAir(NString newPropCode,NString newPropTitle,NString newCoasCode,NString newPropResponCode,NString newGrantCode,NNumber newAgencyPidm,NNumber newPiPidm,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FRBPROP_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PROP_CODE", newPropCode);
			cmd.addParameter("@NEW_PROP_TITLE", newPropTitle);
			cmd.addParameter("@NEW_COAS_CODE", newCoasCode);
			cmd.addParameter("@NEW_PROP_RESPON_CODE", newPropResponCode);
			cmd.addParameter("@NEW_GRANT_CODE", newGrantCode);
			cmd.addParameter("@NEW_AGENCY_PIDM", newAgencyPidm);
			cmd.addParameter("@NEW_PI_PIDM", newPiPidm);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pFrbpropAur(NString newPropCode,NString oldPropCode,NString newPropTitle,NString oldPropTitle,NString newCoasCode,NString oldCoasCode,NString newPropResponCode,NString oldPropResponCode,NString newGrantCode,NString oldGrantCode,NNumber newAgencyPidm,NNumber oldAgencyPidm,NNumber newPiPidm,NNumber oldPiPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FRBPROP_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PROP_CODE", newPropCode);
			cmd.addParameter("@OLD_PROP_CODE", oldPropCode);
			cmd.addParameter("@NEW_PROP_TITLE", newPropTitle);
			cmd.addParameter("@OLD_PROP_TITLE", oldPropTitle);
			cmd.addParameter("@NEW_COAS_CODE", newCoasCode);
			cmd.addParameter("@OLD_COAS_CODE", oldCoasCode);
			cmd.addParameter("@NEW_PROP_RESPON_CODE", newPropResponCode);
			cmd.addParameter("@OLD_PROP_RESPON_CODE", oldPropResponCode);
			cmd.addParameter("@NEW_GRANT_CODE", newGrantCode);
			cmd.addParameter("@OLD_GRANT_CODE", oldGrantCode);
			cmd.addParameter("@NEW_AGENCY_PIDM", newAgencyPidm);
			cmd.addParameter("@OLD_AGENCY_PIDM", oldAgencyPidm);
			cmd.addParameter("@NEW_PI_PIDM", newPiPidm);
			cmd.addParameter("@OLD_PI_PIDM", oldPiPidm);
				
			cmd.execute();


		}
		
		public static void pFtvcoasAir(NString newCoasCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FTVCOAS_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_COAS_CODE", newCoasCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pFtvcoasAur(NString newCoasCode,NString oldCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FTVCOAS_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_COAS_CODE", newCoasCode);
			cmd.addParameter("@OLD_COAS_CODE", oldCoasCode);
				
			cmd.execute();


		}
		
		public static void pFtvfsyrAir(NString newFsyrCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FTVFSYR_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_FSYR_CODE", newFsyrCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pFtvfsyrAur(NString newFsyrCode,NString oldFsyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_FTVFSYR_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_FSYR_CODE", newFsyrCode);
			cmd.addParameter("@OLD_FSYR_CODE", oldFsyrCode);
				
			cmd.execute();


		}
		
		public static void pMultiindexFosTest(NNumber appidIn,NNumber docidIn,NString usernameIn,Ref<NNumber> quantIdxsCheckedOut,Ref<NNumber> quantIdxsFosFailedOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_MULTIINDEX_FOS_TEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPID_IN", appidIn);
			cmd.addParameter("@DOCID_IN", docidIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@QUANT_IDXS_CHECKED_OUT", NNumber.class);
			cmd.addParameter("@QUANT_IDXS_FOS_FAILED_OUT", NNumber.class);
				
			cmd.execute();
			quantIdxsCheckedOut.val = cmd.getParameterValue("@QUANT_IDXS_CHECKED_OUT", NNumber.class);
			quantIdxsFosFailedOut.val = cmd.getParameterValue("@QUANT_IDXS_FOS_FAILED_OUT", NNumber.class);


		}
		
		public static void pSpridenAir(NNumber newPidm,NString newId,NString chgInd,NString newFirstname,NString newLastname,NString newSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_SPRIDEN_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@CHG_IND", chgInd);
			cmd.addParameter("@NEW_FIRSTNAME", newFirstname);
			cmd.addParameter("@NEW_LASTNAME", newLastname);
			cmd.addParameter("@NEW_SURNAME_PREFIX", newSurnamePrefix);
				
			cmd.execute();


		}
		
		public static void pSpridenAur(NNumber newPidm,NNumber oldPidm,NString newId,NString oldId,NString chgInd,NString newFirstname,NString oldFirstname,NString newLastname,NString oldLastname,NString newSurnamePrefix,NString oldSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFRTS.P_SPRIDEN_AUR", DbManager.getDataBaseFactory());
			
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
		
	
	
	
}
