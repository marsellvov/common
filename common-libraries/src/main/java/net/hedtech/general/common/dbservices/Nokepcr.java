package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokepcr {
		public static NString fAptyBlockDefined(NString pApty,NString pForm,NString pBlock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_APTY_BLOCK_DEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_FORM", pForm);
			cmd.addParameter("@P_BLOCK", pBlock);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fAptyDesc(NString pAptyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_APTY_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fAptyFieldsDefined(NString pApty,NString pForm,NString pBlock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_APTY_FIELDS_DEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_FORM", pForm);
			cmd.addParameter("@P_BLOCK", pBlock);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkAptyReqFields(NString pApty,NString pBlock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CHK_APTY_REQ_FIELDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_BLOCK", pBlock);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkBelowOriginator(NNumber pTransNo,NString pAcat,NNumber pOrigLevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CHK_BELOW_ORIGINATOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_ORIG_LEVEL", pOrigLevel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkDefaultsOverride(NString pAcat,NString pApty) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CHK_DEFAULTS_OVERRIDE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_APTY", pApty);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkNortranFields(NString pApty) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CHK_NORTRAN_FIELDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_APTY", pApty);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkNortranReqFields(NString pApty) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CHK_NORTRAN_REQ_FIELDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_APTY", pApty);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkPosnSuffFields(NString pApty) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CHK_POSN_SUFF_FIELDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_APTY", pApty);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkRoutForDups(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CHK_ROUT_FOR_DUPS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkRoutLevels(NNumber pTransNo,NString pAcat,NNumber pOrigLevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CHK_ROUT_LEVELS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_ORIG_LEVEL", pOrigLevel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkUnapplied(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CHK_UNAPPLIED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCitzCodeExists(NString pCitzCode,Ref<NString> pErrorCode,NString pGubinstHighedGovtInd,NString pNtrinstLocationInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CITZ_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CITZ_CODE", pCitzCode);
			cmd.addParameter("@P_ERROR_CODE", NString.class);
			cmd.addParameter("@P_GUBINST_HIGHED_GOVT_IND", pGubinstHighedGovtInd);
			cmd.addParameter("@P_NTRINST_LOCATION_IND", pNtrinstLocationInd);
				
			cmd.execute();
			pErrorCode.val = cmd.getParameterValue("@P_ERROR_CODE", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCitzCodeExists(GbBio.BioRecRow pBioRec,Ref<NString> pErrorCode,NString pGubinstHighedGovtInd,NString pNtrinstLocationInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_CITZ_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("P_BIO_REC", pBioRec, GbBio.BioRecRow.class ));
			cmd.addParameter("@P_ERROR_CODE", NString.class);
			cmd.addParameter("@P_GUBINST_HIGHED_GOVT_IND", pGubinstHighedGovtInd);
			cmd.addParameter("@P_NTRINST_LOCATION_IND", pNtrinstLocationInd);
				
			cmd.execute();
			pErrorCode.val = cmd.getParameterValue("@P_ERROR_CODE", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCommentsExist(NNumber pTrans) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_COMMENTS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS", pTrans);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCountPlbd(NString parmPosn,NString parmFy,NString parmStat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_COUNT_PLBD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARM_POSN", parmPosn);
			cmd.addParameter("@PARM_FY", parmFy);
			cmd.addParameter("@PARM_STAT", parmStat);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCountRoutApply(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_COUNT_ROUT_APPLY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fDecodeMsgType(NString pMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_DECODE_MSG_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MSG_TYPE", pMsgType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaFieldDesc(NString pFieldnm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_EA_FIELD_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FIELDNM", pFieldnm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fErrorsExist(NNumber pTrans) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_ERRORS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS", pTrans);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetEarnEndDate(NNumber pPidm,NDate pEffdt,NString pPosn,NString pSuff,NString pEarn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_EARN_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EFFDT", pEffdt);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EARN", pEarn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fGetError(NString pErrorname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFieldDesc(NString pAufdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_FIELD_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AUFD_CODE", pAufdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGorpracField(NNumber pPidm,NString pField,NString pAptyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_GORPRAC_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetHighestApplyLevelNo(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_HIGHEST_APPLY_LEVEL_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetJobDesc(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffDt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_JOB_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFF_DT", pEffDt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetMinAcatSeqNo(NString pAcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_MIN_ACAT_SEQ_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetNbrbjobField(NNumber pPidmKey,NString pPosnKey,NString pSuffKey,NString pField,NString pFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_NBRBJOB_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM_KEY", pPidmKey);
			cmd.addParameter("@P_POSN_KEY", pPosnKey);
			cmd.addParameter("@P_SUFF_KEY", pSuffKey);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_FORMAT", pFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetNbrjobsField(NNumber pPidmKey,NDate pEffdtKey,NString pPosnKey,NString pSuffKey,NString pField,NString pFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_NBRJOBS_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM_KEY", pPidmKey);
			cmd.addParameter("@P_EFFDT_KEY", pEffdtKey);
			cmd.addParameter("@P_POSN_KEY", pPosnKey);
			cmd.addParameter("@P_SUFF_KEY", pSuffKey);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_FORMAT", pFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetNextTransNo() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_NEXT_TRANS_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetOriginatorLevelNo(NNumber pTransNo,NString pOrigUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_ORIGINATOR_LEVEL_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ORIG_USER", pOrigUser);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetPebemplField(NNumber pPidmKey,NString pField,NString pFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_PEBEMPL_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM_KEY", pPidmKey);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_FORMAT", pFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetPendingLevelNo(NNumber pTransNo,NNumber pRoutLevelNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_PENDING_LEVEL_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ROUT_LEVEL_NO", pRoutLevelNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPersPidm(NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_PERS_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetPosnSuff(NNumber pTransNo,NString pAcatCode,NString pRtnField,NString pAptyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_POSN_SUFF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_RTN_FIELD", pRtnField);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSpbpersField(NNumber pPidmKey,NString pField,NString pFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_SPBPERS_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM_KEY", pPidmKey);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_FORMAT", pFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSpraddrField(NNumber pEmpPidm,NString pAddrAtyp,NNumber pAddrSeq,NString pField,NString pFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_SPRADDR_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_ADDR_ATYP", pAddrAtyp);
			cmd.addParameter("@P_ADDR_SEQ", pAddrSeq);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_FORMAT", pFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSpridenField(NNumber pPidmKey,NString pField,NString pFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_SPRIDEN_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM_KEY", pPidmKey);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_FORMAT", pFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSprteleField(NNumber pPidmKey,NString pTeleCodeKey,NNumber pTeleSeqnoKey,NString pPrimaryTele,NString pAddrAtyp,NNumber pAddrSeq,NString pField,NString pFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_SPRTELE_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM_KEY", pPidmKey);
			cmd.addParameter("@P_TELE_CODE_KEY", pTeleCodeKey);
			cmd.addParameter("@P_TELE_SEQNO_KEY", pTeleSeqnoKey);
			cmd.addParameter("@P_PRIMARY_TELE", pPrimaryTele);
			cmd.addParameter("@P_ADDR_ATYP", pAddrAtyp);
			cmd.addParameter("@P_ADDR_SEQ", pAddrSeq);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_FORMAT", pFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetString(NString pStringname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GET_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRINGNAME", pStringname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGordmskDisplayInd(NString pObjsCode,NString pBlockName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_GORDMSK_DISPLAY_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fHighestApprovedLevelNo(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_HIGHEST_APPROVED_LEVEL_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fJustWarningMsgExist(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_JUST_WARNING_MSG_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMinimalBioInfoExists(NString pSsn,NDate pBirthDate,NString pSex,NString pEthnCode,NString pEthnCde,Ref<NString> pErrorCode,NBool pRaceExists) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_MINIMAL_BIO_INFO_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_ETHN_CODE", pEthnCode);
			cmd.addParameter("@P_ETHN_CDE", pEthnCde);
			cmd.addParameter("@P_ERROR_CODE", NString.class);
			cmd.addParameter("@P_RACE_EXISTS", pRaceExists);
				
			cmd.execute();
			pErrorCode.val = cmd.getParameterValue("@P_ERROR_CODE", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMinimalBioInfoExists(GbBio.BioRecRow pBioRec,Ref<NString> pErrorCode,NBool pRaceExists) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_MINIMAL_BIO_INFO_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("P_BIO_REC", pBioRec, GbBio.BioRecRow.class ));
			cmd.addParameter("@P_ERROR_CODE", NString.class);
			cmd.addParameter("@P_RACE_EXISTS", pRaceExists);
				
			cmd.execute();
			pErrorCode.val = cmd.getParameterValue("@P_ERROR_CODE", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMissingRequiredField(NNumber pTransNo,NString pApty,NString pField,NString pTabnm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_MISSING_REQUIRED_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_TABNM", pTabnm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMultiJobs(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_MULTI_JOBS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNbrearnExists(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffdt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_NBREARN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFDT", pEffdt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNbrearnFieldDefined(NString pField,NString pApty) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_NBREARN_FIELD_DEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_APTY", pApty);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNbrjlbdFieldDefined(NString pField,NString pApty) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_NBRJLBD_FIELD_DEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_APTY", pApty);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNorternExists(NNumber pTransNo,NString pAptyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_NORTERN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNortlbdExists(NNumber pTransNo,NString pAptyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_NORTLBD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNortranValue(NNumber pTransactionNo,NString pFieldName,NString pAptyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_NORTRAN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANSACTION_NO", pTransactionNo);
			cmd.addParameter("@P_FIELD_NAME", pFieldName);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNtrlvidMisMatch(NString pRoutUser,NString pRoutAlvl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_NTRLVID_MIS_MATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROUT_USER", pRoutUser);
			cmd.addParameter("@P_ROUT_ALVL", pRoutAlvl);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fOpenAllowedAcats(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_OPEN_ALLOWED_ACATS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fOpenDefaultRoutRc(NString pAcat,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_OPEN_DEFAULT_ROUT_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fOpenGorraceRc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_OPEN_GORRACE_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fOpenNtrprox(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_OPEN_NTRPROX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fOpenNtrsgrpRc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_OPEN_NTRSGRP_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fOpenStvnatnRc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_OPEN_STVNATN_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fRaceEthnExists(NString pEthnCode,NString pEthnCde,Ref<NString> pErrorCode,NBool pRaceExists) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_RACE_ETHN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ETHN_CODE", pEthnCode);
			cmd.addParameter("@P_ETHN_CDE", pEthnCde);
			cmd.addParameter("@P_ERROR_CODE", NString.class);
			cmd.addParameter("@P_RACE_EXISTS", pRaceExists);
				
			cmd.execute();
			pErrorCode.val = cmd.getParameterValue("@P_ERROR_CODE", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRoutFromNtracat(NString pAcat,NString pRoutAlvl,NString pRoutAction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_ROUT_FROM_NTRACAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_ROUT_ALVL", pRoutAlvl);
			cmd.addParameter("@P_ROUT_ACTION", pRoutAction);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSubmitErrorsExist(NNumber pTrans,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.F_SUBMIT_ERRORS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS", pTrans);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCalcFiscdateJobs(NDate pEffdt,NString pDateName,Ref<NString> pFyOut,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CALC_FISCDATE_JOBS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDT", pEffdt);
			cmd.addParameter("@P_DATE_NAME", pDateName);
			cmd.addParameter("@P_FY_OUT", NString.class);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pFyOut.val = cmd.getParameterValue("@P_FY_OUT", NString.class);
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pCancelQueueQ(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CANCEL_QUEUE_Q", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pCancelTransaction(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CANCEL_TRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pCancelUnapplied(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CANCEL_UNAPPLIED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pCheckCurrPrevPosnSuff(NString pCurrPosn,NString pCurrSuff,NString pHoldPosn,NString pHoldSuff,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut,Ref<NString> pPrevPosn,Ref<NString> pPrevSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHECK_CURR_PREV_POSN_SUFF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_POSN", pCurrPosn);
			cmd.addParameter("@P_CURR_SUFF", pCurrSuff);
			cmd.addParameter("@P_HOLD_POSN", pHoldPosn);
			cmd.addParameter("@P_HOLD_SUFF", pHoldSuff);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
			cmd.addParameter("@P_PREV_POSN", pPrevPosn, true);
			cmd.addParameter("@P_PREV_SUFF", pPrevSuff, true);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);
			pPrevPosn.val = cmd.getParameterValue("@P_PREV_POSN", NString.class);
			pPrevSuff.val = cmd.getParameterValue("@P_PREV_SUFF", NString.class);


		}
		
		public static void pCheckDupTransaction(NString pId,NString pAcat,Ref<NString> pErrMsg,Ref<NString> pMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHECK_DUP_TRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_ERR_MSG", NString.class);
			cmd.addParameter("@P_MSG_TYPE", NString.class);
				
			cmd.execute();
			pErrMsg.val = cmd.getParameterValue("@P_ERR_MSG", NString.class);
			pMsgType.val = cmd.getParameterValue("@P_MSG_TYPE", NString.class);


		}
		
		public static void pCheckIfPosnSuffUsed(NString pAcatCode,NNumber pTransNo,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHECK_IF_POSN_SUFF_USED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pCheckSwapPosnSuff(NNumber pTransNo,NString pAcatCode,NNumber pNextSeqNo,NString pNextPosn,NString pNextSuff,Ref<NString> pPrevPosn,Ref<NString> pPrevSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHECK_SWAP_POSN_SUFF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_NEXT_SEQ_NO", pNextSeqNo);
			cmd.addParameter("@P_NEXT_POSN", pNextPosn);
			cmd.addParameter("@P_NEXT_SUFF", pNextSuff);
			cmd.addParameter("@P_PREV_POSN", NString.class);
			cmd.addParameter("@P_PREV_SUFF", NString.class);
				
			cmd.execute();
			pPrevPosn.val = cmd.getParameterValue("@P_PREV_POSN", NString.class);
			pPrevSuff.val = cmd.getParameterValue("@P_PREV_SUFF", NString.class);


		}
		
		public static void pCheckValidRoutuser(NString pApprLevel,NString pUserid,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHECK_VALID_ROUTUSER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPR_LEVEL", pApprLevel);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkCommentLength(NString pComment,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_COMMENT_LENGTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkFieldLength(NString pFieldValue,NString pFieldName,NString pFieldDesc,NString pFieldType,Ref<NNumber> pFieldLenOut,Ref<NString> pMsgTypeInout,Ref<NString> pMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_FIELD_LENGTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FIELD_VALUE", pFieldValue);
			cmd.addParameter("@P_FIELD_NAME", pFieldName);
			cmd.addParameter("@P_FIELD_DESC", pFieldDesc);
			cmd.addParameter("@P_FIELD_TYPE", pFieldType);
			cmd.addParameter("@P_FIELD_LEN_OUT", NNumber.class);
			cmd.addParameter("@P_MSG_TYPE_INOUT", pMsgTypeInout, true);
			cmd.addParameter("@P_MSG_INOUT", pMsgInout, true);
				
			cmd.execute();
			pFieldLenOut.val = cmd.getParameterValue("@P_FIELD_LEN_OUT", NNumber.class);
			pMsgTypeInout.val = cmd.getParameterValue("@P_MSG_TYPE_INOUT", NString.class);
			pMsgInout.val = cmd.getParameterValue("@P_MSG_INOUT", NString.class);


		}
		
		public static void pChkHighestApplyLevelNo(NNumber pTransNo,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_HIGHEST_APPLY_LEVEL_NO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkHighestLvlForApply(NNumber pTransNo,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_HIGHEST_LVL_FOR_APPLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkHighestLvlForApprove(NNumber pTransNo,NNumber pNorroutLevelNo,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_HIGHEST_LVL_FOR_APPROVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_NORROUT_LEVEL_NO", pNorroutLevelNo);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkIfAllowedToSubmit(NNumber pTransNo,NString pAcat,Ref<NString> pSubmitAllow,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_IF_ALLOWED_TO_SUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_SUBMIT_ALLOW", pSubmitAllow, true);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pSubmitAllow.val = cmd.getParameterValue("@P_SUBMIT_ALLOW", NString.class);
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkJobsEffdtNval(NNumber pTransNo,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_JOBS_EFFDT_NVAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkMandatoryLevels(NNumber pTransNo,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_MANDATORY_LEVELS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkMultiApply(NNumber pApplyCnt,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_MULTI_APPLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLY_CNT", pApplyCnt);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkOriginatorInRout(NNumber pTransNo,Ref<NString> pOrigInroutOut,Ref<NString> pOrigActionOut,Ref<NString> pOrigUserOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_ORIGINATOR_IN_ROUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ORIG_INROUT_OUT", NString.class);
			cmd.addParameter("@P_ORIG_ACTION_OUT", NString.class);
			cmd.addParameter("@P_ORIG_USER_OUT", NString.class);
				
			cmd.execute();
			pOrigInroutOut.val = cmd.getParameterValue("@P_ORIG_INROUT_OUT", NString.class);
			pOrigActionOut.val = cmd.getParameterValue("@P_ORIG_ACTION_OUT", NString.class);
			pOrigUserOut.val = cmd.getParameterValue("@P_ORIG_USER_OUT", NString.class);


		}
		
		public static void pChkRequiredFieldsNull(NNumber pTransNo,NString pAcat,Ref<NString> pSubmitAllowInout,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_REQUIRED_FIELDS_NULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_SUBMIT_ALLOW_INOUT", pSubmitAllowInout, true);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pSubmitAllowInout.val = cmd.getParameterValue("@P_SUBMIT_ALLOW_INOUT", NString.class);
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkRoutApplyLevel(NNumber pTransNo,NString pAcat,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_ROUT_APPLY_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkRoutUseridNull(NNumber pTransNo,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_ROUT_USERID_NULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pChkTransStatUpdate(NNumber pTransNo,Ref<NString> pMsgTypeInout,Ref<NString> pMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_CHK_TRANS_STAT_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_MSG_TYPE_INOUT", pMsgTypeInout, true);
			cmd.addParameter("@P_MSG_INOUT", pMsgInout, true);
				
			cmd.execute();
			pMsgTypeInout.val = cmd.getParameterValue("@P_MSG_TYPE_INOUT", NString.class);
			pMsgInout.val = cmd.getParameterValue("@P_MSG_INOUT", NString.class);


		}
		
		public static void pDelNobtran(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_DEL_NOBTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pDelNorcmnt(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_DEL_NORCMNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pDelNoreaer(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_DEL_NOREAER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pDelNorrout(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_DEL_NORROUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pDelNortern(NNumber pTransNo, NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_DEL_NORTERN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDelNortlbd(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_DEL_NORTLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pDelNortran(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_DEL_NORTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pDelNtrprox(NString pUser,NString pAlvlCode,NString pProxyUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_DEL_NTRPROX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ALVL_CODE", pAlvlCode);
			cmd.addParameter("@P_PROXY_USER", pProxyUser);
				
			cmd.execute();


		}
		
		public static void pDeleteNortlbd( NString pTlbdRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_DELETE_NORTLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TLBD_ROWID", pTlbdRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteTransaction(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_DELETE_TRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pEditItem(NString pField,NString pValue,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_EDIT_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pFindNbrjlbd(NNumber pPidm,NString pPosn,NString pSuff,NDate pQueryDt,Ref<NString> pJlbdFoundOut,Ref<NDate> pJlbdEffdtOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_FIND_NBRJLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_QUERY_DT", pQueryDt);
			cmd.addParameter("@P_JLBD_FOUND_OUT", NString.class);
			cmd.addParameter("@P_JLBD_EFFDT_OUT", NDate.class);
				
			cmd.execute();
			pJlbdFoundOut.val = cmd.getParameterValue("@P_JLBD_FOUND_OUT", NString.class);
			pJlbdEffdtOut.val = cmd.getParameterValue("@P_JLBD_EFFDT_OUT", NDate.class);


		}
		
		public static void pFindNortlbd(NNumber pTrans,NString pApty,NString pPosn,NString pSuff,NDate pQueryDt,Ref<NString> pTlbdFoundOut,Ref<NDate> pTlbdEffdtOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_FIND_NORTLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS", pTrans);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_QUERY_DT", pQueryDt);
			cmd.addParameter("@P_TLBD_FOUND_OUT", NString.class);
			cmd.addParameter("@P_TLBD_EFFDT_OUT", NDate.class);
				
			cmd.execute();
			pTlbdFoundOut.val = cmd.getParameterValue("@P_TLBD_FOUND_OUT", NString.class);
			pTlbdEffdtOut.val = cmd.getParameterValue("@P_TLBD_EFFDT_OUT", NDate.class);


		}
		
		public static void pFinishSubmit(NNumber pTransNo,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_FINISH_SUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
		public static void pGetPrevPosnSuff(NString pAcatCode,NNumber pTransNo,NNumber pNextSeqNo,Ref<NString> pPreviousPosn,Ref<NString> pPreviousSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_GET_PREV_POSN_SUFF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_NEXT_SEQ_NO", pNextSeqNo);
			cmd.addParameter("@P_PREVIOUS_POSN", pPreviousPosn, true);
			cmd.addParameter("@P_PREVIOUS_SUFF", pPreviousSuff, true);
				
			cmd.execute();
			pPreviousPosn.val = cmd.getParameterValue("@P_PREVIOUS_POSN", NString.class);
			pPreviousSuff.val = cmd.getParameterValue("@P_PREVIOUS_SUFF", NString.class);


		}
		
		public static void pGetTernTlbdBlockNm(NString pApty,Ref<NString> pBlockNmInout,Ref<NString> pMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_GET_TERN_TLBD_BLOCK_NM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_BLOCK_NM_INOUT", pBlockNmInout, true);
			cmd.addParameter("@P_MSG_INOUT", pMsgInout, true);
				
			cmd.execute();
			pBlockNmInout.val = cmd.getParameterValue("@P_BLOCK_NM_INOUT", NString.class);
			pMsgInout.val = cmd.getParameterValue("@P_MSG_INOUT", NString.class);


		}
		
		public static void pGetTransactionInfo(NNumber pTransNo,Ref<NNumber> pPidmInout,Ref<NString> pAcatInout,Ref<NDate> pEffDtInout,Ref<NString> pTransStatInout,Ref<NString> pPosnInout,Ref<NString> pSuffInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_GET_TRANSACTION_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_PIDM_INOUT", pPidmInout, true);
			cmd.addParameter("@P_ACAT_INOUT", pAcatInout, true);
			cmd.addParameter("@P_EFF_DT_INOUT", pEffDtInout, true);
			cmd.addParameter("@P_TRANS_STAT_INOUT", pTransStatInout, true);
			cmd.addParameter("@P_POSN_INOUT", pPosnInout, true);
			cmd.addParameter("@P_SUFF_INOUT", pSuffInout, true);
				
			cmd.execute();
			pPidmInout.val = cmd.getParameterValue("@P_PIDM_INOUT", NNumber.class);
			pAcatInout.val = cmd.getParameterValue("@P_ACAT_INOUT", NString.class);
			pEffDtInout.val = cmd.getParameterValue("@P_EFF_DT_INOUT", NDate.class);
			pTransStatInout.val = cmd.getParameterValue("@P_TRANS_STAT_INOUT", NString.class);
			pPosnInout.val = cmd.getParameterValue("@P_POSN_INOUT", NString.class);
			pSuffInout.val = cmd.getParameterValue("@P_SUFF_INOUT", NString.class);


		}
		
		public static void pInsNoreaer(NNumber pTransNo,NString pAptyCode,NNumber pSeqNo,NString pMsgType,NString pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INS_NOREAER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MSG_TYPE", pMsgType);
			cmd.addParameter("@P_MSG", pMsg);
				
			cmd.execute();


		}
		
		public static void pInsNtrprox(NString pUser,NString pAlvlCode,NString pProxyUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INS_NTRPROX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ALVL_CODE", pAlvlCode);
			cmd.addParameter("@P_PROXY_USER", pProxyUser);
				
			cmd.execute();


		}
		
		public static void pInsertNobtran(NNumber pTransactionNo,NNumber pPidm,NDate pEffectiveDate,NString pAcatCode,NString pTransStatusInd,NString pSubmittorUserId,NDate pCreatedDate,NString pOriginatorUser,NDate pSubmissionDate,NString pApplyInd,NDate pApplyDate,NString pApplyUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INSERT_NOBTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANSACTION_NO", pTransactionNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_TRANS_STATUS_IND", pTransStatusInd);
			cmd.addParameter("@P_SUBMITTOR_USER_ID", pSubmittorUserId);
			cmd.addParameter("@P_CREATED_DATE", pCreatedDate);
			cmd.addParameter("@P_ORIGINATOR_USER", pOriginatorUser);
			cmd.addParameter("@P_SUBMISSION_DATE", pSubmissionDate);
			cmd.addParameter("@P_APPLY_IND", pApplyInd);
			cmd.addParameter("@P_APPLY_DATE", pApplyDate);
			cmd.addParameter("@P_APPLY_USER_ID", pApplyUserId);
				
			cmd.execute();


		}
		
		public static void pInsertSuperuserComment(NNumber pTransNo,NString pTranStatus,NString pUserid,NString pAptyDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INSERT_SUPERUSER_COMMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_TRAN_STATUS", pTranStatus);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_APTY_DESC", pAptyDesc);
				
			cmd.execute();


		}
		
		public static void pInvalidApptPct(NString pValue,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INVALID_APPT_PCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pInvalidDaysCanada(NString pValue,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INVALID_DAYS_CANADA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pInvalidEarnEffDate(NDate pEarnEffdt,NDate pQueryDt,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INVALID_EARN_EFF_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_EFFDT", pEarnEffdt);
			cmd.addParameter("@P_QUERY_DT", pQueryDt);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pInvalidEarnEndDate(NDate pEarnEffdt,NDate pEnddt,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INVALID_EARN_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_EFFDT", pEarnEffdt);
			cmd.addParameter("@P_ENDDT", pEnddt);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pInvalidJlbdEffDate(NDate pJlbdEffdt,NDate pQueryDt,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INVALID_JLBD_EFF_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JLBD_EFFDT", pJlbdEffdt);
			cmd.addParameter("@P_QUERY_DT", pQueryDt);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pInvalidJlbdTotalPct(NNumber pJlbdTotalPct,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INVALID_JLBD_TOTAL_PCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JLBD_TOTAL_PCT", pJlbdTotalPct);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pInvalidNumber(NString pValue,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INVALID_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pInvalidStepIncrDay(NString pValue,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INVALID_STEP_INCR_DAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pInvalidStepIncrMon(NString pValue,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_INVALID_STEP_INCR_MON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pMismatchEarnEffDate(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffdt,NDate pTernEffdt,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_MISMATCH_EARN_EFF_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFDT", pEffdt);
			cmd.addParameter("@P_TERN_EFFDT", pTernEffdt);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pNorroutUpdtAllowed(NString pTransStat,NString pSuperuser,NString pOriginator,NString pQueueStat,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_NORROUT_UPDT_ALLOWED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_STAT", pTransStat);
			cmd.addParameter("@P_SUPERUSER", pSuperuser);
			cmd.addParameter("@P_ORIGINATOR", pOriginator);
			cmd.addParameter("@P_QUEUE_STAT", pQueueStat);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pNortranAddrteleKey(NNumber pTransNo,NString pApty,NString pBlock,Ref<NString> pCodeOut,Ref<NString> pSeqnoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_NORTRAN_ADDRTELE_KEY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_BLOCK", pBlock);
			cmd.addParameter("@P_CODE_OUT", NString.class);
			cmd.addParameter("@P_SEQNO_OUT", NString.class);
				
			cmd.execute();
			pCodeOut.val = cmd.getParameterValue("@P_CODE_OUT", NString.class);
			pSeqnoOut.val = cmd.getParameterValue("@P_SEQNO_OUT", NString.class);


		}
		
		public static void pOpenEclsRc(Ref<DataCursor> pEclsRc,NString pSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_OPEN_ECLS_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_RC", DataCursor.class);
			cmd.addParameter("@P_SRCH", pSrch);
				
			cmd.execute();
			pEclsRc.val = cmd.getParameterValue("@P_ECLS_RC", DataCursor.class);


		}
		
		public static void pOpenPosnSuffRc(NNumber pTransNo,NString pAptyCode,NString pTableName,Ref<DataCursor> pPosnSuffRc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_OPEN_POSN_SUFF_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_POSN_SUFF_RC", DataCursor.class);
				
			cmd.execute();
			pPosnSuffRc.val = cmd.getParameterValue("@P_POSN_SUFF_RC", DataCursor.class);


		}
		
		public static void pOpenPrimaryPhoneRc(Ref<DataCursor> pTeleRcInout,NNumber pPidm,NString pAddrAtyp,NNumber pAddrSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_OPEN_PRIMARY_PHONE_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TELE_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDR_ATYP", pAddrAtyp);
			cmd.addParameter("@P_ADDR_SEQ", pAddrSeq);
				
			cmd.execute();
			pTeleRcInout.val = cmd.getParameterValue("@P_TELE_RC_INOUT", DataCursor.class);


		}
		
		public static void pOpenSalaryGradeRc(NString pSalaryGroup,NString pSalaryTable,Ref<DataCursor> pSalaryGradeRc,NString pSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_OPEN_SALARY_GRADE_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SALARY_GROUP", pSalaryGroup);
			cmd.addParameter("@P_SALARY_TABLE", pSalaryTable);
			cmd.addParameter("@P_SALARY_GRADE_RC", DataCursor.class);
			cmd.addParameter("@P_SRCH", pSrch);
				
			cmd.execute();
			pSalaryGradeRc.val = cmd.getParameterValue("@P_SALARY_GRADE_RC", DataCursor.class);


		}
		
		public static void pOpenSalaryGroupRc(Ref<DataCursor> pSalaryGroupRc,NString pSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_OPEN_SALARY_GROUP_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SALARY_GROUP_RC", DataCursor.class);
			cmd.addParameter("@P_SRCH", pSrch);
				
			cmd.execute();
			pSalaryGroupRc.val = cmd.getParameterValue("@P_SALARY_GROUP_RC", DataCursor.class);


		}
		
		public static void pOpenSalaryStepRc(NString pSalaryGroup,NString pSalaryTable,NString pSalaryGrade,Ref<DataCursor> pSalaryStepRc,NString pSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_OPEN_SALARY_STEP_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SALARY_GROUP", pSalaryGroup);
			cmd.addParameter("@P_SALARY_TABLE", pSalaryTable);
			cmd.addParameter("@P_SALARY_GRADE", pSalaryGrade);
			cmd.addParameter("@P_SALARY_STEP_RC", DataCursor.class);
			cmd.addParameter("@P_SRCH", pSrch);
				
			cmd.execute();
			pSalaryStepRc.val = cmd.getParameterValue("@P_SALARY_STEP_RC", DataCursor.class);


		}
		
		public static void pOpenSalaryTableRc(NString pSalaryGroup,Ref<DataCursor> pSalaryTableRc,NString pSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_OPEN_SALARY_TABLE_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SALARY_GROUP", pSalaryGroup);
			cmd.addParameter("@P_SALARY_TABLE_RC", DataCursor.class);
			cmd.addParameter("@P_SRCH", pSrch);
				
			cmd.execute();
			pSalaryTableRc.val = cmd.getParameterValue("@P_SALARY_TABLE_RC", DataCursor.class);


		}
		
		public static void pOpenZipcodeRc(Ref<DataCursor> pZipRc,NString pSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_OPEN_ZIPCODE_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ZIP_RC", DataCursor.class);
			cmd.addParameter("@P_SRCH", pSrch);
				
			cmd.execute();
			pZipRc.val = cmd.getParameterValue("@P_ZIP_RC", DataCursor.class);


		}
		
		public static void pSetQsToInQueue(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_SET_QS_TO_IN_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pSubmitEpaf(NNumber pTransNo,NString pUser,Ref<NString> pWarningOnlyOut,Ref<NString> pSubmitErrorOut,Ref<NString> pFinishSubmtOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_SUBMIT_EPAF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_WARNING_ONLY_OUT", NString.class);
			cmd.addParameter("@P_SUBMIT_ERROR_OUT", NString.class);
			cmd.addParameter("@P_FINISH_SUBMT_OUT", NString.class);
				
			cmd.execute();
			pWarningOnlyOut.val = cmd.getParameterValue("@P_WARNING_ONLY_OUT", NString.class);
			pSubmitErrorOut.val = cmd.getParameterValue("@P_SUBMIT_ERROR_OUT", NString.class);
			pFinishSubmtOut.val = cmd.getParameterValue("@P_FINISH_SUBMT_OUT", NString.class);


		}
		
		public static void pSubmitEpafInitialEdit(NNumber pTransNo,NString pUser,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_SUBMIT_EPAF_INITIAL_EDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
		public static void pUpdateActionUserId(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_UPDATE_ACTION_USER_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pUpdateLowerLevelsToFyi(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_UPDATE_LOWER_LEVELS_TO_FYI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pUpdateNobtranSubmit(NNumber pTransNo,NString pGlobalUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_UPDATE_NOBTRAN_SUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_GLOBAL_USER", pGlobalUser);
				
			cmd.execute();


		}
		
		public static void pUpdateNortranValue(NString pNortranRowid,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_UPDATE_NORTRAN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NORTRAN_ROWID", pNortranRowid);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void pUpdateNxtlvlToInqueue(NNumber pTransNo,NString pAlvlCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_UPDATE_NXTLVL_TO_INQUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ALVL_CODE", pAlvlCode);
				
			cmd.execute();


		}
		
		public static void pUpdateRoutToPending(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_UPDATE_ROUT_TO_PENDING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pUpdateTsToPending(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPCR.P_UPDATE_TS_TO_PENDING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
	
	
	
}
