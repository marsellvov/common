package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbRecruit {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetsrbrecrseqno(NNumber pPidm,NString pTermCode,NString pCurrOrNext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.F_GETSRBRECRSEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CURR_OR_NEXT", pCurrOrNext);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsequal(RecruitRecRow recOne,RecruitRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RecruitRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RecruitRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTermCode,Ref<NNumber> pAdminSeqnoInout,NString pRecrCode,NString pRstaCode,NString pSelectInd,NDate pAddDate,NString pAdmtCode,NString pEdlvCode,NString pEgolCode,NString pFullPartInd,NString pSbgiCode,NString pWrsnCode,NString pRtypCode,NString pResdCode,NString pSessCode,NString pSiteCode,NString pStypCode,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO_INOUT", pAdminSeqnoInout, true);
			cmd.addParameter("@P_RECR_CODE", pRecrCode);
			cmd.addParameter("@P_RSTA_CODE", pRstaCode);
			cmd.addParameter("@P_SELECT_IND", pSelectInd);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_WRSN_CODE", pWrsnCode);
			cmd.addParameter("@P_RTYP_CODE", pRtypCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pAdminSeqnoInout.val = cmd.getParameterValue("@P_ADMIN_SEQNO_INOUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTermCode,NNumber pAdminSeqno,NString pRecrCode,NString pRstaCode,NString pSelectInd,NDate pAddDate,NString pAdmtCode,NString pEdlvCode,NString pEgolCode,NString pFullPartInd,NString pSbgiCode,NString pWrsnCode,NString pRtypCode,NString pResdCode,NString pSessCode,NString pSiteCode,NString pStypCode,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_RECRUIT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ADMIN_SEQNO", pAdminSeqno);
			cmd.addParameter("@P_RECR_CODE", pRecrCode);
			cmd.addParameter("@P_RSTA_CODE", pRstaCode);
			cmd.addParameter("@P_SELECT_IND", pSelectInd);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_WRSN_CODE", pWrsnCode);
			cmd.addParameter("@P_RTYP_CODE", pRtypCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RecruitRecRow", dataSourceName="RECRUIT_REC")
	public static class RecruitRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_ADMIN_SEQNO")
		public NNumber RAdminSeqno;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE")
		public NString RMajrCode;
		@DbRecordField(dataSourceName="R_RECR_CODE")
		public NString RRecrCode;
		@DbRecordField(dataSourceName="R_RSTA_CODE")
		public NString RRstaCode;
		@DbRecordField(dataSourceName="R_SELECT_IND")
		public NString RSelectInd;
		@DbRecordField(dataSourceName="R_ADD_DATE")
		public NDate RAddDate;
		@DbRecordField(dataSourceName="R_ADMT_CODE")
		public NString RAdmtCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE2")
		public NString RMajrCode2;
		@DbRecordField(dataSourceName="R_EDLV_CODE")
		public NString REdlvCode;
		@DbRecordField(dataSourceName="R_EGOL_CODE")
		public NString REgolCode;
		@DbRecordField(dataSourceName="R_FULL_PART_IND")
		public NString RFullPartInd;
		@DbRecordField(dataSourceName="R_SBGI_CODE")
		public NString RSbgiCode;
		@DbRecordField(dataSourceName="R_WRSN_CODE")
		public NString RWrsnCode;
		@DbRecordField(dataSourceName="R_RTYP_CODE")
		public NString RRtypCode;
		@DbRecordField(dataSourceName="R_RESD_CODE")
		public NString RResdCode;
		@DbRecordField(dataSourceName="R_SESS_CODE")
		public NString RSessCode;
		@DbRecordField(dataSourceName="R_SITE_CODE")
		public NString RSiteCode;
		@DbRecordField(dataSourceName="R_STYP_CODE")
		public NString RStypCode;
		@DbRecordField(dataSourceName="R_PROGRAM_1")
		public NString RProgram1;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG_1")
		public NString RTermCodeCtlg1;
		@DbRecordField(dataSourceName="R_DEPT_CODE_2")
		public NString RDeptCode2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_111")
		public NString RMajrCodeConc111;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_112")
		public NString RMajrCodeConc112;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_113")
		public NString RMajrCodeConc113;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_121")
		public NString RMajrCodeConc121;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_122")
		public NString RMajrCodeConc122;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_123")
		public NString RMajrCodeConc123;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_1")
		public NString RMajrCodeMinr1;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_1_2")
		public NString RMajrCodeMinr12;
		@DbRecordField(dataSourceName="R_CURR_RULE_1")
		public NNumber RCurrRule1;
		@DbRecordField(dataSourceName="R_CMJR_RULE_1_1")
		public NNumber RCmjrRule11;
		@DbRecordField(dataSourceName="R_CCON_RULE_11_1")
		public NNumber RCconRule111;
		@DbRecordField(dataSourceName="R_CCON_RULE_11_2")
		public NNumber RCconRule112;
		@DbRecordField(dataSourceName="R_CCON_RULE_11_3")
		public NNumber RCconRule113;
		@DbRecordField(dataSourceName="R_CMJR_RULE_1_2")
		public NNumber RCmjrRule12;
		@DbRecordField(dataSourceName="R_CCON_RULE_12_1")
		public NNumber RCconRule121;
		@DbRecordField(dataSourceName="R_CCON_RULE_12_2")
		public NNumber RCconRule122;
		@DbRecordField(dataSourceName="R_CCON_RULE_12_3")
		public NNumber RCconRule123;
		@DbRecordField(dataSourceName="R_CMNR_RULE_1_1")
		public NNumber RCmnrRule11;
		@DbRecordField(dataSourceName="R_CMNR_RULE_1_2")
		public NNumber RCmnrRule12;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
