package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Srkprel {
		public static NString fEqualEAddress(NString pEmailAddress1,NString pEmailAddress2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_EQUAL_E_ADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMAIL_ADDRESS_1", pEmailAddress1);
			cmd.addParameter("@P_EMAIL_ADDRESS_2", pEmailAddress2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fErulValues(NString erulFunc,NString prelCode,NString useDfltEgrp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_ERUL_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ERUL_FUNC", erulFunc);
			cmd.addParameter("@PREL_CODE", prelCode);
			cmd.addParameter("@USE_DFLT_EGRP", useDfltEgrp);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetProspectSobseqn(NString prefixTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_GET_PROSPECT_SOBSEQN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PREFIX_TYPE_IN", prefixTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSrvprel(NNumber pRidm,NString pType,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_GET_SRVPREL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RIDM", pRidm);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetTeleSeqno(NString teleCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_GET_TELE_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TELE_CODE", teleCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsHschCrss(NString crssCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_IS_HSCH_CRSS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CRSS_CODE", crssCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsHschGpat(NString gpatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_IS_HSCH_GPAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GPAT_CODE", gpatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ShortBioRecRow pTempRow,GbBio.BioRecRow pPermRow) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("P_TEMP_ROW", pTempRow, ShortBioRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("P_PERM_ROW", pPermRow, GbBio.BioRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fPopulateSrrtpts() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_POPULATE_SRRTPTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fPopulateSrttpfd(NString pTapeCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_POPULATE_SRTTPFD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TAPE_CODE", pTapeCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fSabsuplExists(NString termIn,NNumber pidmIn,NNumber applIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_SABSUPL_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APPL_IN", applIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fSameSorcrssExists(NNumber applNoIn,NString termIn,NNumber pidmIn,NString crssIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_SAME_SORCRSS_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CRSS_IN", crssIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSameSorgpatExists(NNumber applNoIn,NString termIn,NNumber pidmIn,NString gpatIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_SAME_SORGPAT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GPAT_IN", gpatIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fSobcnvtConv(NString pInfcCode,NString pTname,NString pTapeCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_SOBCNVT_CONV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_TNAME", pTname);
			cmd.addParameter("@P_TAPE_CODE", pTapeCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSorcrssExists(NString termIn,NNumber pidmIn,NNumber applIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_SORCRSS_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APPL_IN", applIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSorgpatExists(NString termIn,NNumber pidmIn,NNumber applIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_SORGPAT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APPL_IN", applIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateFwav(NString fwavCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_VALIDATE_FWAV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FWAV_CODE", fwavCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateNtyp(NString ntypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_VALIDATE_NTYP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NTYP_CODE", ntypCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateResd(NString resdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.F_VALIDATE_RESD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RESD_CODE", resdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreatePersonData(NString prelCode,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_CREATE_PERSON_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREL_CODE", prelCode);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();


		}
		
		public static void pDeleteSrrtpts() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_DELETE_SRRTPTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeleteSrttpfd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_DELETE_SRTTPFD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pEvaluateSprtele() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_EVALUATE_SPRTELE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertCommplan(NString term,NNumber seqno,NString camp,NString levl,NString coll,NString degc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_COMMPLAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@CAMP", camp);
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@COLL", coll);
			cmd.addParameter("@DEGC", degc);
				
			cmd.execute();


		}
		
		public static void pInsertGoremal() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_GOREMAL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertGorprac() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_GORPRAC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertGurmail(NString term,NNumber seqno,NString module) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_GURMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@MODULE", module);
				
			cmd.execute();


		}
		
		public static void pInsertIntl(NString prelCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_INTL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREL_CODE", prelCode);
				
			cmd.execute();


		}
		
		public static void pInsertRecruitSrrrsrc(NString sbgi,NString term,NString levl,NString campus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_RECRUIT_SRRRSRC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SBGI", sbgi);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@CAMPUS", campus);
				
			cmd.execute();


		}
		
		public static void pInsertSabsupl(NNumber applNo,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SABSUPL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPL_NO", applNo);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pInsertSarrsrc(NString sbgi,NString term,NString levl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SARRSRC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SBGI", sbgi);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@LEVL", levl);
				
			cmd.execute();


		}
		
		public static void pInsertSorcont(NString ctyp,NDate adddate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SORCONT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CTYP", ctyp);
			cmd.addParameter("@ADDDATE", adddate);
				
			cmd.execute();


		}
		
		public static void pInsertSorcrss(NNumber applNo,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SORCRSS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPL_NO", applNo);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pInsertSorgpat(NNumber applNo,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SORGPAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPL_NO", applNo);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pInsertSorhsch() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SORHSCH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSorhschSelfreport() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SORHSCH_SELFREPORT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSorints() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SORINTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSorpcol() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SORPCOL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSortspc(NString tescCode,NDate holdDate,NDate testDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SORTSPC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TESC_CODE", tescCode);
			cmd.addParameter("@HOLD_DATE", holdDate);
			cmd.addParameter("@TEST_DATE", testDate);
				
			cmd.execute();


		}
		
		public static void pInsertSpbpers() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SPBPERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSpraddr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SPRADDR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSpriden() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SPRIDEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSprtele() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SPRTELE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSrbrecr(NString prelCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SRBRECR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREL_CODE", prelCode);
				
			cmd.execute();


		}
		
		public static void pInsertSrrlend(NString term,NNumber seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SRRLEND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@SEQNO", seqno);
				
			cmd.execute();


		}
		
		public static void pInsertSrrrsrc(NString sbgi,NString term,NNumber seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_INSERT_SRRRSRC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SBGI", sbgi);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@SEQNO", seqno);
				
			cmd.execute();


		}
		
		public static void pMajor2interest(NString major) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_MAJOR2INTEREST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAJOR", major);
				
			cmd.execute();


		}
		
		public static void pMigrateProspect(NNumber inridm,NString prelCode,Ref<NNumber> recrSeqnoOut,Ref<NString> termOut,Ref<NNumber> applnoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_MIGRATE_PROSPECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INRIDM", inridm);
			cmd.addParameter("@PREL_CODE", prelCode);
			cmd.addParameter("@RECR_SEQNO_OUT", NNumber.class);
			cmd.addParameter("@TERM_OUT", NString.class);
			cmd.addParameter("@APPLNO_OUT", NNumber.class);
				
			cmd.execute();
			recrSeqnoOut.val = cmd.getParameterValue("@RECR_SEQNO_OUT", NNumber.class);
			termOut.val = cmd.getParameterValue("@TERM_OUT", NString.class);
			applnoOut.val = cmd.getParameterValue("@APPLNO_OUT", NNumber.class);


		}
		
		public static void pProcessSrttest(NString term,NString prelCode,NNumber applCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_PROCESS_SRTTEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@PREL_CODE", prelCode);
			cmd.addParameter("@APPL_CODE", applCode);
				
			cmd.execute();


		}
		
		public static void pSrrtptsDateOrigin(NNumber pCount,Ref<NString> pTescCode,Ref<NString> pTescMmyy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_SRRTPTS_DATE_ORIGIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COUNT", pCount);
			cmd.addParameter("@P_TESC_CODE", pTescCode, true);
			cmd.addParameter("@P_TESC_MMYY", pTescMmyy, true);
				
			cmd.execute();
			pTescCode.val = cmd.getParameterValue("@P_TESC_CODE", NString.class);
			pTescMmyy.val = cmd.getParameterValue("@P_TESC_MMYY", NString.class);


		}
		
		public static void pSrttpfdDetails(NString pTpfdCode,NNumber pOcc,NNumber pRecNum,Ref<NNumber> pStartPos,Ref<NNumber> pEndPos) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_SRTTPFD_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TPFD_CODE", pTpfdCode);
			cmd.addParameter("@P_OCC", pOcc);
			cmd.addParameter("@P_REC_NUM", pRecNum);
			cmd.addParameter("@P_START_POS", pStartPos, true);
			cmd.addParameter("@P_END_POS", pEndPos, true);
				
			cmd.execute();
			pStartPos.val = cmd.getParameterValue("@P_START_POS", NNumber.class);
			pEndPos.val = cmd.getParameterValue("@P_END_POS", NNumber.class);


		}
		
		public static void pUpdateSabsupl(NNumber applNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_UPDATE_SABSUPL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPL_NO", applNo);
				
			cmd.execute();


		}
		
		public static void pUpdateSorcrss(NNumber applNo,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_UPDATE_SORCRSS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPL_NO", applNo);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSorgpat(NNumber applNo,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_UPDATE_SORGPAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPL_NO", applNo);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSpraddr(NString atyp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_UPDATE_SPRADDR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP", atyp);
				
			cmd.execute();


		}
		
		public static void pUpdateSpriden() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_UPDATE_SPRIDEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateSprtele(NString tele) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKPREL.P_UPDATE_SPRTELE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TELE", tele);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ShortBioRecRow", dataSourceName="SHORT_BIO_REC")
	public static class ShortBioRecRow
	{
		@DbRecordField(dataSourceName="R_SSN")
		public NString RSsn;
		@DbRecordField(dataSourceName="R_BIRTH_DATE")
		public NDate RBirthDate;
		@DbRecordField(dataSourceName="R_LGCY_CODE")
		public NString RLgcyCode;
		@DbRecordField(dataSourceName="R_ETHN_CODE")
		public NString REthnCode;
		@DbRecordField(dataSourceName="R_MRTL_CODE")
		public NString RMrtlCode;
		@DbRecordField(dataSourceName="R_RELG_CODE")
		public NString RRelgCode;
		@DbRecordField(dataSourceName="R_SEX")
		public NString RSex;
		@DbRecordField(dataSourceName="R_CONFID_IND")
		public NString RConfidInd;
		@DbRecordField(dataSourceName="R_DEAD_IND")
		public NString RDeadInd;
		@DbRecordField(dataSourceName="R_VETC_FILE_NUMBER")
		public NString RVetcFileNumber;
		@DbRecordField(dataSourceName="R_LEGAL_NAME")
		public NString RLegalName;
		@DbRecordField(dataSourceName="R_PREF_FIRST_NAME")
		public NString RPrefFirstName;
		@DbRecordField(dataSourceName="R_NAME_PREFIX")
		public NString RNamePrefix;
		@DbRecordField(dataSourceName="R_NAME_SUFFIX")
		public NString RNameSuffix;
		@DbRecordField(dataSourceName="R_CITZ_CODE")
		public NString RCitzCode;
		@DbRecordField(dataSourceName="R_ETHN_CDE")
		public NString REthnCde;
		@DbRecordField(dataSourceName="R_CONFIRMED_RE_CDE")
		public NString RConfirmedReCde;
		@DbRecordField(dataSourceName="R_CONFIRMED_RE_DATE")
		public NDate RConfirmedReDate;
	}

	
	
}
