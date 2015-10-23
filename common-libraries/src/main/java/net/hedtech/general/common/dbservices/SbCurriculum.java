package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;



public class SbCurriculum {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFindCurrentAllInd(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeyseqno,NNumber pPriorityNo,NNumber pSeqno,NString pEffTerm,NString pCurrentCde,NString pOverrideCurrentInd,NString pEndTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_FIND_CURRENT_ALL_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_CURRENT_CDE", pCurrentCde);
			cmd.addParameter("@P_OVERRIDE_CURRENT_IND", pOverrideCurrentInd);
			cmd.addParameter("@P_END_TERM", pEndTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CurriculumRecRow recOne,CurriculumRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CurriculumRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CurriculumRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fLcurOrder(NNumber pPidm,NString pLmod,NString pTermCode,NNumber pKeyseqno,NString pRowid,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_LCUR_ORDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fLmodExists(NNumber pPidm,NNumber pSeqno,NString pLmodCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_LMOD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pSeqno,NString pTermCode,NNumber pKeySeqno,NString pLmodCode,NString pCactCode,NNumber pGappSeqno,NNumber pRolledSeqno,NNumber pApplSeqno,NNumber pApplKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_CACT_CODE", pCactCode);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_APPL_SEQNO", pApplSeqno);
			cmd.addParameter("@P_APPL_KEY_SEQNO", pApplKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryCurrent(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeyseqno,NNumber pLcurSeqno,NString pActiveInd,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_QUERY_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fQueryMaxSeq(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeyseqno,NNumber pPriorityNo,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_QUERY_MAX_SEQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryModule(NNumber pPidm,NString pLmodCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_QUERY_MODULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static Cursor fQueryOne(NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NNumber pSeqno,NString pLmodCode,NString pTermCode,NNumber pKeySeqno,NNumber pPriorityNo,NString pRollInd,NString pCactCode,NString pUserId,NString pDataOrigin,NString pLevlCode,NString pCollCode,NString pDegcCode,NString pTermCodeCtlg,NString pTermCodeEnd,NString pTermCodeMatric,NString pTermCodeAdmit,NString pAdmtCode,NString pCampCode,NString pProgram,NDate pStartDate,NDate pEndDate,NNumber pCurrRule,NNumber pRolledSeqno,NString pOverrideSeverity,NString pStypCode,NDate pExpGradDate,NString pLeavCode,NDate pLeavFromDate,NDate pLeavToDate,NString pRateCode,NString pTermCodeGrad,NString pAcyrCode,NString pSiteCode,NNumber pApplSeqno,NNumber pApplKeySeqno,Ref<NString> pRowidOut,Ref<NNumber> pSeqnoOut,Ref<NNumber> pCurrErrorOut,Ref<NString> pSeverityOut,NString pUserIdUpdate,NNumber pGappSeqno,NString pCurrentCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_CACT_CODE", pCactCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_TERM_CODE_CTLG", pTermCodeCtlg);
			cmd.addParameter("@P_TERM_CODE_END", pTermCodeEnd);
			cmd.addParameter("@P_TERM_CODE_MATRIC", pTermCodeMatric);
			cmd.addParameter("@P_TERM_CODE_ADMIT", pTermCodeAdmit);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_RULE", pCurrRule);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_OVERRIDE_SEVERITY", pOverrideSeverity);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_RATE_CODE", pRateCode);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_APPL_SEQNO", pApplSeqno);
			cmd.addParameter("@P_APPL_KEY_SEQNO", pApplKeySeqno);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
			cmd.addParameter("@P_SEQNO_OUT", NNumber.class);
			cmd.addParameter("@P_CURR_ERROR_OUT", NNumber.class);
			cmd.addParameter("@P_SEVERITY_OUT", NString.class);
			cmd.addParameter("@P_USER_ID_UPDATE", pUserIdUpdate);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_CURRENT_CDE", pCurrentCde);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
			pSeqnoOut.val = cmd.getParameterValue("@P_SEQNO_OUT", NNumber.class);
			pCurrErrorOut.val = cmd.getParameterValue("@P_CURR_ERROR_OUT", NNumber.class);
			pSeverityOut.val = cmd.getParameterValue("@P_SEVERITY_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pModuleDelete(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM.P_MODULE_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CurriculumRecRow", dataSourceName="SB_CURRICULUM.CURRICULUM_REC")
	public static class CurriculumRecRow
	{
				
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_LMOD_CODE")
		public NString RLmodCode;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_KEY_SEQNO")
		public NNumber RKeySeqno;
		@DbRecordField(dataSourceName="R_PRIORITY_NO")
		public NNumber RPriorityNo;
		@DbRecordField(dataSourceName="R_ROLL_IND")
		public NString RRollInd;
		@DbRecordField(dataSourceName="R_CACT_CODE")
		public NString RCactCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG")
		public NString RTermCodeCtlg;
		@DbRecordField(dataSourceName="R_TERM_CODE_END")
		public NString RTermCodeEnd;
		@DbRecordField(dataSourceName="R_TERM_CODE_MATRIC")
		public NString RTermCodeMatric;
		@DbRecordField(dataSourceName="R_TERM_CODE_ADMIT")
		public NString RTermCodeAdmit;
		@DbRecordField(dataSourceName="R_ADMT_CODE")
		public NString RAdmtCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_PROGRAM")
		public NString RProgram;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_CURR_RULE")
		public NNumber RCurrRule;
		@DbRecordField(dataSourceName="R_ROLLED_SEQNO")
		public NNumber RRolledSeqno;
		@DbRecordField(dataSourceName="R_STYP_CODE")
		public NString RStypCode;
		@DbRecordField(dataSourceName="R_EXP_GRAD_DATE")
		public NDate RExpGradDate;
		@DbRecordField(dataSourceName="R_LEAV_CODE")
		public NString RLeavCode;
		@DbRecordField(dataSourceName="R_LEAV_FROM_DATE")
		public NDate RLeavFromDate;
		@DbRecordField(dataSourceName="R_LEAV_TO_DATE")
		public NDate RLeavToDate;
		@DbRecordField(dataSourceName="R_RATE_CODE")
		public NString RRateCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_GRAD")
		public NString RTermCodeGrad;
		@DbRecordField(dataSourceName="R_ACYR_CODE")
		public NString RAcyrCode;
		@DbRecordField(dataSourceName="R_SITE_CODE")
		public NString RSiteCode;
		@DbRecordField(dataSourceName="R_APPL_KEY_SEQNO")
		public NNumber RApplKeySeqno;
		@DbRecordField(dataSourceName="R_APPL_SEQNO")
		public NNumber RApplSeqno;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		@DbRecordField(dataSourceName="R_USER_ID_UPDATE")
		public NString RUserIdUpdate;
		@DbRecordField(dataSourceName="R_GAPP_SEQNO")
		public NNumber RGappSeqno;
		@DbRecordField(dataSourceName="R_CURRENT_CDE")
		public NString RCurrentCde;
		
			public CurriculumRecRow() {}
			public CurriculumRecRow( Row CurriculumRecRowResults ) {
			super();
			//MORPHIS TODO tirad os casts de NNumber e String e acrescentado toNumber e toStr
			RPidm = toNumber(CurriculumRecRowResults.getObject(1));
			RSeqno = toNumber(CurriculumRecRowResults.getObject(2));
			RLmodCode = toStr(CurriculumRecRowResults.getObject(3));
			RTermCode = toStr(CurriculumRecRowResults.getObject(4));
			RKeySeqno = toNumber(CurriculumRecRowResults.getObject(5));
			RPriorityNo =toNumber(CurriculumRecRowResults.getObject(6));
			RRollInd = toStr(CurriculumRecRowResults.getObject(7));
			RCactCode = toStr(CurriculumRecRowResults.getObject(8));
			RUserId = toStr(CurriculumRecRowResults.getObject(9));
			RDataOrigin = toStr(CurriculumRecRowResults.getObject(10));
			RLevlCode = toStr(CurriculumRecRowResults.getObject(11));
			RCollCode = toStr(CurriculumRecRowResults.getObject(12));
			RDegcCode = toStr(CurriculumRecRowResults.getObject(13));
			RTermCodeCtlg = toStr(CurriculumRecRowResults.getObject(14));
			RTermCodeEnd = toStr(CurriculumRecRowResults.getObject(15));
			RTermCodeMatric =toStr(CurriculumRecRowResults.getObject(16));
			RTermCodeAdmit =toStr(CurriculumRecRowResults.getObject(17));
			RAdmtCode = toStr(CurriculumRecRowResults.getObject(18));
			RCampCode = toStr(CurriculumRecRowResults.getObject(19));
			RProgram = toStr(CurriculumRecRowResults.getObject(20));
			RStartDate = (NDate)(CurriculumRecRowResults.getObject(21));
			REndDate = (NDate)(CurriculumRecRowResults.getObject(22));
			RCurrRule = toNumber(CurriculumRecRowResults.getObject(23));
			RRolledSeqno = toNumber(CurriculumRecRowResults.getObject(24));
			RStypCode = toStr(CurriculumRecRowResults.getObject(25));
			RExpGradDate = (NDate)(CurriculumRecRowResults.getObject(26));
			RLeavCode = toStr(CurriculumRecRowResults.getObject(27));
			RLeavFromDate = (NDate)(CurriculumRecRowResults.getObject(28));
			RLeavToDate = (NDate)(CurriculumRecRowResults.getObject(29));
			RRateCode = toStr(CurriculumRecRowResults.getObject(30));
			RTermCodeGrad = toStr(CurriculumRecRowResults.getObject(31));
			RAcyrCode = toStr(CurriculumRecRowResults.getObject(32));
			RSiteCode = toStr(CurriculumRecRowResults.getObject(33));
			RApplKeySeqno = toNumber(CurriculumRecRowResults.getObject(34));
			RApplSeqno = toNumber(CurriculumRecRowResults.getObject(35));
			RInternalRecordId =toStr(CurriculumRecRowResults.getObject(36));
			RUserIdUpdate = toStr(CurriculumRecRowResults.getObject(37));
			RGappSeqno = toNumber(CurriculumRecRowResults.getObject(38));
			RCurrentCde = toStr(CurriculumRecRowResults.getObject(39));
		}
	}
	
	
}
