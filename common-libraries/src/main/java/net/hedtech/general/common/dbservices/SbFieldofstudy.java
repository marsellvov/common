package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFieldofstudy {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFindCurrentAllInd(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,NString pLfstCode,NNumber pPriorityNo,NString pCurrentCde,NString pOverrideCurrentInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_FIND_CURRENT_ALL_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_CURRENT_CDE", pCurrentCde);
			cmd.addParameter("@P_OVERRIDE_CURRENT_IND", pOverrideCurrentInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FieldofstudyRecRow recOne,FieldofstudyRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FieldofstudyRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FieldofstudyRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fLfosOrder(NNumber pPidm,NNumber pLcurSeqno,NString pLfstCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_LFOS_ORDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryCurrent(NNumber pPidm,NNumber pLcurSeqno,NString pLfstCode,NNumber pLfosSeqno,NString pActiveInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_QUERY_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_LFOS_SEQNO", pLfosSeqno);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fQueryMaxSeq(NNumber pPidm,NNumber pLcurSeqno,NString pLfstCode,NNumber pPriorityNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_QUERY_MAX_SEQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,NString pLfstCode,NString pTermCode,NNumber pPriorityNo,NString pCstsCode,NString pCactCode,NString pDataOrigin,NString pUserId,NString pMajrCode,NString pTermCodeCtlg,NString pTermCodeEnd,NString pDeptCode,NNumber pLfosRule,NNumber pConcAttachRule,NDate pStartDate,NDate pEndDate,NString pTmstCode,NString pMajrCodeAttach,NNumber pRolledSeqno,NString pOverrideSeverity,Ref<NString> pRowidOut,Ref<NNumber> pCurrErrorOut,Ref<NString> pSeverityOut,Ref<NNumber> pLfosSeqnoOut,NString pUserIdUpdate,NString pCurrentCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_CSTS_CODE", pCstsCode);
			cmd.addParameter("@P_CACT_CODE", pCactCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_TERM_CODE_CTLG", pTermCodeCtlg);
			cmd.addParameter("@P_TERM_CODE_END", pTermCodeEnd);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_LFOS_RULE", pLfosRule);
			cmd.addParameter("@P_CONC_ATTACH_RULE", pConcAttachRule);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_MAJR_CODE_ATTACH", pMajrCodeAttach);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_OVERRIDE_SEVERITY", pOverrideSeverity);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
			cmd.addParameter("@P_CURR_ERROR_OUT", NNumber.class);
			cmd.addParameter("@P_SEVERITY_OUT", NString.class);
			cmd.addParameter("@P_LFOS_SEQNO_OUT", NNumber.class);
			cmd.addParameter("@P_USER_ID_UPDATE", pUserIdUpdate);
			cmd.addParameter("@P_CURRENT_CDE", pCurrentCde);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
			pCurrErrorOut.val = cmd.getParameterValue("@P_CURR_ERROR_OUT", NNumber.class);
			pSeverityOut.val = cmd.getParameterValue("@P_SEVERITY_OUT", NString.class);
			pLfosSeqnoOut.val = cmd.getParameterValue("@P_LFOS_SEQNO_OUT", NNumber.class);


		}
		
		public static void pDelete(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
	
	
	@DbRecordType(id="FieldofstudyRecRow", dataSourceName="FIELDOFSTUDY_REC")
	public static class FieldofstudyRecRow
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
		@DbRecordField(dataSourceName="R_CSTS_CODE")
		public NString RCstsCode;
		@DbRecordField(dataSourceName="R_CACT_CODE")
		public NString RCactCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
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
		@DbRecordField(dataSourceName="R_USER_ID_UPDATE")
		public NString RUserIdUpdate;
		@DbRecordField(dataSourceName="R_CURRENT_CDE")
		public NString RCurrentCde;
	}

	
	
}
