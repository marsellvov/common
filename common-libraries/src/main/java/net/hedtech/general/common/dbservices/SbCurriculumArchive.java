package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCurriculumArchive {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CurriculumArchiveRecRow recOne,CurriculumArchiveRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CurriculumArchiveRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CurriculumArchiveRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pArchiveCurriculum(NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.P_ARCHIVE_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();


		}
		
		public static void pCreate(NNumber pPidm,NNumber pSeqno,NString pLmodCde,NString pTermCde,NNumber pKeySeqno,NNumber pPriorityNo,NString pRollInd,NString pCactCde,NString pUserId,NString pDataOrigin,NString pLevlCde,NString pCollCde,NString pDegcCde,NString pTermCdeCtlg,NString pTermCdeEnd,NString pTermCdeMatric,NString pTermCdeAdmit,NString pAdmtCde,NString pCampCde,NString pProgram,NDate pStartDate,NDate pEndDate,NNumber pCurrRule,NNumber pRolledSeqno,NString pStypCde,NString pRateCde,NString pLeavCde,NDate pLeavFromDate,NDate pLeavToDate,NDate pExpGradDate,NString pTermCdeGrad,NString pAcyrCde,NString pSiteCde,NNumber pApplSeqno,NNumber pApplKeySeqno,NNumber pKeySeqnoRolled,NNumber pGappSeqno,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CDE", pLmodCde);
			cmd.addParameter("@P_TERM_CDE", pTermCde);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_CACT_CDE", pCactCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_LEVL_CDE", pLevlCde);
			cmd.addParameter("@P_COLL_CDE", pCollCde);
			cmd.addParameter("@P_DEGC_CDE", pDegcCde);
			cmd.addParameter("@P_TERM_CDE_CTLG", pTermCdeCtlg);
			cmd.addParameter("@P_TERM_CDE_END", pTermCdeEnd);
			cmd.addParameter("@P_TERM_CDE_MATRIC", pTermCdeMatric);
			cmd.addParameter("@P_TERM_CDE_ADMIT", pTermCdeAdmit);
			cmd.addParameter("@P_ADMT_CDE", pAdmtCde);
			cmd.addParameter("@P_CAMP_CDE", pCampCde);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_RULE", pCurrRule);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_STYP_CDE", pStypCde);
			cmd.addParameter("@P_RATE_CDE", pRateCde);
			cmd.addParameter("@P_LEAV_CDE", pLeavCde);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_TERM_CDE_GRAD", pTermCdeGrad);
			cmd.addParameter("@P_ACYR_CDE", pAcyrCde);
			cmd.addParameter("@P_SITE_CDE", pSiteCde);
			cmd.addParameter("@P_APPL_SEQNO", pApplSeqno);
			cmd.addParameter("@P_APPL_KEY_SEQNO", pApplKeySeqno);
			cmd.addParameter("@P_KEY_SEQNO_ROLLED", pKeySeqnoRolled);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pSeqno,NString pLmodCde,NString pTermCde,NNumber pKeySeqno,NNumber pPriorityNo,NString pRollInd,NString pCactCde,NString pUserId,NString pDataOrigin,NString pLevlCde,NString pCollCde,NString pDegcCde,NString pTermCdeCtlg,NString pTermCdeEnd,NString pTermCdeMatric,NString pTermCdeAdmit,NString pAdmtCde,NString pCampCde,NString pProgram,NDate pStartDate,NDate pEndDate,NNumber pCurrRule,NNumber pRolledSeqno,NString pStypCde,NString pRateCde,NString pLeavCde,NDate pLeavFromDate,NDate pLeavToDate,NDate pExpGradDate,NString pTermCdeGrad,NString pAcyrCde,NString pSiteCde,NNumber pApplSeqno,NNumber pApplKeySeqno,NNumber pKeySeqnoRolled,NNumber pGappSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_ARCHIVE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CDE", pLmodCde);
			cmd.addParameter("@P_TERM_CDE", pTermCde);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_CACT_CDE", pCactCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_LEVL_CDE", pLevlCde);
			cmd.addParameter("@P_COLL_CDE", pCollCde);
			cmd.addParameter("@P_DEGC_CDE", pDegcCde);
			cmd.addParameter("@P_TERM_CDE_CTLG", pTermCdeCtlg);
			cmd.addParameter("@P_TERM_CDE_END", pTermCdeEnd);
			cmd.addParameter("@P_TERM_CDE_MATRIC", pTermCdeMatric);
			cmd.addParameter("@P_TERM_CDE_ADMIT", pTermCdeAdmit);
			cmd.addParameter("@P_ADMT_CDE", pAdmtCde);
			cmd.addParameter("@P_CAMP_CDE", pCampCde);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_RULE", pCurrRule);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_STYP_CDE", pStypCde);
			cmd.addParameter("@P_RATE_CDE", pRateCde);
			cmd.addParameter("@P_LEAV_CDE", pLeavCde);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_TERM_CDE_GRAD", pTermCdeGrad);
			cmd.addParameter("@P_ACYR_CDE", pAcyrCde);
			cmd.addParameter("@P_SITE_CDE", pSiteCde);
			cmd.addParameter("@P_APPL_SEQNO", pApplSeqno);
			cmd.addParameter("@P_APPL_KEY_SEQNO", pApplKeySeqno);
			cmd.addParameter("@P_KEY_SEQNO_ROLLED", pKeySeqnoRolled);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CurriculumArchiveRecRow", dataSourceName="CURRICULUM_ARCHIVE_REC")
	public static class CurriculumArchiveRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_LMOD_CDE")
		public NString RLmodCde;
		@DbRecordField(dataSourceName="R_TERM_CDE")
		public NString RTermCde;
		@DbRecordField(dataSourceName="R_KEY_SEQNO")
		public NNumber RKeySeqno;
		@DbRecordField(dataSourceName="R_PRIORITY_NO")
		public NNumber RPriorityNo;
		@DbRecordField(dataSourceName="R_ROLL_IND")
		public NString RRollInd;
		@DbRecordField(dataSourceName="R_CACT_CDE")
		public NString RCactCde;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_LEVL_CDE")
		public NString RLevlCde;
		@DbRecordField(dataSourceName="R_COLL_CDE")
		public NString RCollCde;
		@DbRecordField(dataSourceName="R_DEGC_CDE")
		public NString RDegcCde;
		@DbRecordField(dataSourceName="R_TERM_CDE_CTLG")
		public NString RTermCdeCtlg;
		@DbRecordField(dataSourceName="R_TERM_CDE_END")
		public NString RTermCdeEnd;
		@DbRecordField(dataSourceName="R_TERM_CDE_MATRIC")
		public NString RTermCdeMatric;
		@DbRecordField(dataSourceName="R_TERM_CDE_ADMIT")
		public NString RTermCdeAdmit;
		@DbRecordField(dataSourceName="R_ADMT_CDE")
		public NString RAdmtCde;
		@DbRecordField(dataSourceName="R_CAMP_CDE")
		public NString RCampCde;
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
		@DbRecordField(dataSourceName="R_STYP_CDE")
		public NString RStypCde;
		@DbRecordField(dataSourceName="R_RATE_CDE")
		public NString RRateCde;
		@DbRecordField(dataSourceName="R_LEAV_CDE")
		public NString RLeavCde;
		@DbRecordField(dataSourceName="R_LEAV_FROM_DATE")
		public NDate RLeavFromDate;
		@DbRecordField(dataSourceName="R_LEAV_TO_DATE")
		public NDate RLeavToDate;
		@DbRecordField(dataSourceName="R_EXP_GRAD_DATE")
		public NDate RExpGradDate;
		@DbRecordField(dataSourceName="R_TERM_CDE_GRAD")
		public NString RTermCdeGrad;
		@DbRecordField(dataSourceName="R_ACYR_CDE")
		public NString RAcyrCde;
		@DbRecordField(dataSourceName="R_SITE_CDE")
		public NString RSiteCde;
		@DbRecordField(dataSourceName="R_APPL_SEQNO")
		public NNumber RApplSeqno;
		@DbRecordField(dataSourceName="R_APPL_KEY_SEQNO")
		public NNumber RApplKeySeqno;
		@DbRecordField(dataSourceName="R_KEY_SEQNO_ROLLED")
		public NNumber RKeySeqnoRolled;
		@DbRecordField(dataSourceName="R_GAPP_SEQNO")
		public NNumber RGappSeqno;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
