package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Lcurtest {
//		public static List<CurriculumSavedtabRow> fCurriculum(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LCURTEST.F_CURRICULUM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<CurriculumSavedtabRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<CurriculumSavedtabRow>.class);
//
//		}
		
//		public static List<FieldofstudySavedtabRow> fFieldofstudy(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno,NNumber pLcurSeqno) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LCURTEST.F_FIELDOFSTUDY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<FieldofstudySavedtabRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
//			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<FieldofstudySavedtabRow>.class);
//
//		}
		
		public static NString fFieldofstudyValue(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno,NNumber pLcurSeqno,NString pLfstCode,NNumber pOrder,NString pField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LCURTEST.F_FIELDOFSTUDY_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_ORDER", pOrder);
			cmd.addParameter("@P_FIELD", pField);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fLearnerOrder(NNumber pPidm,NNumber pSeqno,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LCURTEST.F_LEARNER_ORDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fOrder(NNumber pPidm,NString pLmodCode,NNumber pSeqno,NString pTermCode,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LCURTEST.F_ORDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	@DbRecordType(id="CurriculumSavedrecRow", dataSourceName="CURRICULUM_SAVEDREC")
	public static class CurriculumSavedrecRow
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
		@DbRecordField(dataSourceName="R_ORDER")
		public NNumber ROrder;
		@DbRecordField(dataSourceName="R_CURRENT")
		public NString RCurrent;
	}

	
	@DbRecordType(id="FieldofstudySavedrecRow", dataSourceName="FIELDOFSTUDY_SAVEDREC")
	public static class FieldofstudySavedrecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_LCUR_SEQNO")
		public NNumber RLcurSeqno;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_LFST_CODE")
		public NString RLfstCode;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PRIORITY_NO")
		public NNumber RPriorityNo;
		@DbRecordField(dataSourceName="R_CACT_CODE")
		public NString RCactCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE")
		public NString RMajrCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG")
		public NString RTermCodeCtlg;
		@DbRecordField(dataSourceName="R_TERM_CODE_END")
		public NString RTermCodeEnd;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_LFOS_RULE")
		public NNumber RLfosRule;
		@DbRecordField(dataSourceName="R_CONC_ATTACH_RULE")
		public NNumber RConcAttachRule;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_TMST_CODE")
		public NString RTmstCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE_ATTACH")
		public NString RMajrCodeAttach;
		@DbRecordField(dataSourceName="R_ROLLED_SEQNO")
		public NNumber RRolledSeqno;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		@DbRecordField(dataSourceName="R_ORDER")
		public NNumber ROrder;
		@DbRecordField(dataSourceName="R_CURRENT")
		public NString RCurrent;
	}

	
	
}
