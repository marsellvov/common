package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbStudypath {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fDegreeExists(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_DEGREE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEndTerm(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_END_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(StudypathRecRow recOne,StudypathRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, StudypathRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, StudypathRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fQueryCurrent(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_QUERY_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fQueryCurrentActive(NNumber pPidm,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_QUERY_CURRENT_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fRegEligible(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.F_REG_ELIGIBLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTermCodeEff,Ref<NNumber> pKeySeqno,NString pStspCode,NString pDataOrigin,NString pUserId,NString pFullPartInd,NString pSessCode,NString pResdCode,NString pOrsnCode,NString pPracCode,NString pCaplCode,NString pEdlvCode,NString pIncmCode,NString pEmexCode,NString pAprnCode,NString pTrcnCode,NString pGainCode,NString pVoedCode,NString pBlckCode,NString pEgolCode,NString pBsklCode,NString pAstdCode,NString pPrevCode,NString pCastCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno, true);
			cmd.addParameter("@P_STSP_CODE", pStspCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_ORSN_CODE", pOrsnCode);
			cmd.addParameter("@P_PRAC_CODE", pPracCode);
			cmd.addParameter("@P_CAPL_CODE", pCaplCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_INCM_CODE", pIncmCode);
			cmd.addParameter("@P_EMEX_CODE", pEmexCode);
			cmd.addParameter("@P_APRN_CODE", pAprnCode);
			cmd.addParameter("@P_TRCN_CODE", pTrcnCode);
			cmd.addParameter("@P_GAIN_CODE", pGainCode);
			cmd.addParameter("@P_VOED_CODE", pVoedCode);
			cmd.addParameter("@P_BLCK_CODE", pBlckCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_BSKL_CODE", pBsklCode);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_PREV_CODE", pPrevCode);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pKeySeqno.val = cmd.getParameterValue("@P_KEY_SEQNO", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTermCodeEff,NNumber pKeySeqno,NString pStspCode,NString pDataOrigin,NString pUserId,NString pFullPartInd,NString pSessCode,NString pResdCode,NString pOrsnCode,NString pPracCode,NString pCaplCode,NString pEdlvCode,NString pIncmCode,NString pEmexCode,NString pAprnCode,NString pTrcnCode,NString pGainCode,NString pVoedCode,NString pBlckCode,NString pEgolCode,NString pBsklCode,NString pAstdCode,NString pPrevCode,NString pCastCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_STUDYPATH.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_STSP_CODE", pStspCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_ORSN_CODE", pOrsnCode);
			cmd.addParameter("@P_PRAC_CODE", pPracCode);
			cmd.addParameter("@P_CAPL_CODE", pCaplCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_INCM_CODE", pIncmCode);
			cmd.addParameter("@P_EMEX_CODE", pEmexCode);
			cmd.addParameter("@P_APRN_CODE", pAprnCode);
			cmd.addParameter("@P_TRCN_CODE", pTrcnCode);
			cmd.addParameter("@P_GAIN_CODE", pGainCode);
			cmd.addParameter("@P_VOED_CODE", pVoedCode);
			cmd.addParameter("@P_BLCK_CODE", pBlckCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_BSKL_CODE", pBsklCode);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_PREV_CODE", pPrevCode);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="StudypathRecRow", dataSourceName="STUDYPATH_REC")
	public static class StudypathRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF")
		public NString RTermCodeEff;
		@DbRecordField(dataSourceName="R_KEY_SEQNO")
		public NNumber RKeySeqno;
		@DbRecordField(dataSourceName="R_STSP_CODE")
		public NString RStspCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_FULL_PART_IND")
		public NString RFullPartInd;
		@DbRecordField(dataSourceName="R_SESS_CODE")
		public NString RSessCode;
		@DbRecordField(dataSourceName="R_RESD_CODE")
		public NString RResdCode;
		@DbRecordField(dataSourceName="R_ORSN_CODE")
		public NString ROrsnCode;
		@DbRecordField(dataSourceName="R_PRAC_CODE")
		public NString RPracCode;
		@DbRecordField(dataSourceName="R_CAPL_CODE")
		public NString RCaplCode;
		@DbRecordField(dataSourceName="R_EDLV_CODE")
		public NString REdlvCode;
		@DbRecordField(dataSourceName="R_INCM_CODE")
		public NString RIncmCode;
		@DbRecordField(dataSourceName="R_EMEX_CODE")
		public NString REmexCode;
		@DbRecordField(dataSourceName="R_APRN_CODE")
		public NString RAprnCode;
		@DbRecordField(dataSourceName="R_TRCN_CODE")
		public NString RTrcnCode;
		@DbRecordField(dataSourceName="R_GAIN_CODE")
		public NString RGainCode;
		@DbRecordField(dataSourceName="R_VOED_CODE")
		public NString RVoedCode;
		@DbRecordField(dataSourceName="R_BLCK_CODE")
		public NString RBlckCode;
		@DbRecordField(dataSourceName="R_EGOL_CODE")
		public NString REgolCode;
		@DbRecordField(dataSourceName="R_BSKL_CODE")
		public NString RBsklCode;
		@DbRecordField(dataSourceName="R_ASTD_CODE")
		public NString RAstdCode;
		@DbRecordField(dataSourceName="R_PREV_CODE")
		public NString RPrevCode;
		@DbRecordField(dataSourceName="R_CAST_CODE")
		public NString RCastCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
