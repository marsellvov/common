package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbWlTermControl {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(WlTermControlRecRow recOne,WlTermControlRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, WlTermControlRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, WlTermControlRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NString pAutoNotifyInd,NString pOnlineNotifyInd,NString pWlPosWebcDispInd,NString pStuNotifyInd,NString pFacNotifyInd,NString pAdvNotifyInd,NString pRegNotifyInd,NString pCampSeverity,NString pDegreeSeverity,NString pProgramSeverity,NString pDepartmentSeverity,NString pAttsSeverity,NString pChrtSeverity,NString pDuplIncludeInd,NString pLinkIncludeInd,NString pPreqIncludeInd,NString pCorqIncludeInd,NString pTimeIncludeInd,NString pCapcSeverity,NString pLevlSeverity,NString pCollSeverity,NString pMajrSeverity,NString pClasSeverity,NString pApprSeverity,NString pUserId,NNumber pDeadlineNotify,NString pLetrCodeStuNotify,NString pLetrCodeFacNotify,NString pLetrCodeAdvNotify,NString pLetrCodeRegNotify,NNumber pPidm,NString pDataOrigin,NString pHostName,NNumber pMaxResendHrs,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_AUTO_NOTIFY_IND", pAutoNotifyInd);
			cmd.addParameter("@P_ONLINE_NOTIFY_IND", pOnlineNotifyInd);
			cmd.addParameter("@P_WL_POS_WEBC_DISP_IND", pWlPosWebcDispInd);
			cmd.addParameter("@P_STU_NOTIFY_IND", pStuNotifyInd);
			cmd.addParameter("@P_FAC_NOTIFY_IND", pFacNotifyInd);
			cmd.addParameter("@P_ADV_NOTIFY_IND", pAdvNotifyInd);
			cmd.addParameter("@P_REG_NOTIFY_IND", pRegNotifyInd);
			cmd.addParameter("@P_CAMP_SEVERITY", pCampSeverity);
			cmd.addParameter("@P_DEGREE_SEVERITY", pDegreeSeverity);
			cmd.addParameter("@P_PROGRAM_SEVERITY", pProgramSeverity);
			cmd.addParameter("@P_DEPARTMENT_SEVERITY", pDepartmentSeverity);
			cmd.addParameter("@P_ATTS_SEVERITY", pAttsSeverity);
			cmd.addParameter("@P_CHRT_SEVERITY", pChrtSeverity);
			cmd.addParameter("@P_DUPL_INCLUDE_IND", pDuplIncludeInd);
			cmd.addParameter("@P_LINK_INCLUDE_IND", pLinkIncludeInd);
			cmd.addParameter("@P_PREQ_INCLUDE_IND", pPreqIncludeInd);
			cmd.addParameter("@P_CORQ_INCLUDE_IND", pCorqIncludeInd);
			cmd.addParameter("@P_TIME_INCLUDE_IND", pTimeIncludeInd);
			cmd.addParameter("@P_CAPC_SEVERITY", pCapcSeverity);
			cmd.addParameter("@P_LEVL_SEVERITY", pLevlSeverity);
			cmd.addParameter("@P_COLL_SEVERITY", pCollSeverity);
			cmd.addParameter("@P_MAJR_SEVERITY", pMajrSeverity);
			cmd.addParameter("@P_CLAS_SEVERITY", pClasSeverity);
			cmd.addParameter("@P_APPR_SEVERITY", pApprSeverity);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DEADLINE_NOTIFY", pDeadlineNotify);
			cmd.addParameter("@P_LETR_CODE_STU_NOTIFY", pLetrCodeStuNotify);
			cmd.addParameter("@P_LETR_CODE_FAC_NOTIFY", pLetrCodeFacNotify);
			cmd.addParameter("@P_LETR_CODE_ADV_NOTIFY", pLetrCodeAdvNotify);
			cmd.addParameter("@P_LETR_CODE_REG_NOTIFY", pLetrCodeRegNotify);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HOST_NAME", pHostName);
			cmd.addParameter("@P_MAX_RESEND_HRS", pMaxResendHrs);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NString pAutoNotifyInd,NString pOnlineNotifyInd,NString pWlPosWebcDispInd,NString pStuNotifyInd,NString pFacNotifyInd,NString pAdvNotifyInd,NString pRegNotifyInd,NString pCampSeverity,NString pDegreeSeverity,NString pProgramSeverity,NString pDepartmentSeverity,NString pAttsSeverity,NString pChrtSeverity,NString pDuplIncludeInd,NString pLinkIncludeInd,NString pPreqIncludeInd,NString pCorqIncludeInd,NString pTimeIncludeInd,NString pCapcSeverity,NString pLevlSeverity,NString pCollSeverity,NString pMajrSeverity,NString pClasSeverity,NString pApprSeverity,NString pUserId,NNumber pDeadlineNotify,NString pLetrCodeStuNotify,NString pLetrCodeFacNotify,NString pLetrCodeAdvNotify,NString pLetrCodeRegNotify,NNumber pPidm,NString pDataOrigin,NString pHostName,NNumber pMaxResendHrs,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_TERM_CONTROL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_AUTO_NOTIFY_IND", pAutoNotifyInd);
			cmd.addParameter("@P_ONLINE_NOTIFY_IND", pOnlineNotifyInd);
			cmd.addParameter("@P_WL_POS_WEBC_DISP_IND", pWlPosWebcDispInd);
			cmd.addParameter("@P_STU_NOTIFY_IND", pStuNotifyInd);
			cmd.addParameter("@P_FAC_NOTIFY_IND", pFacNotifyInd);
			cmd.addParameter("@P_ADV_NOTIFY_IND", pAdvNotifyInd);
			cmd.addParameter("@P_REG_NOTIFY_IND", pRegNotifyInd);
			cmd.addParameter("@P_CAMP_SEVERITY", pCampSeverity);
			cmd.addParameter("@P_DEGREE_SEVERITY", pDegreeSeverity);
			cmd.addParameter("@P_PROGRAM_SEVERITY", pProgramSeverity);
			cmd.addParameter("@P_DEPARTMENT_SEVERITY", pDepartmentSeverity);
			cmd.addParameter("@P_ATTS_SEVERITY", pAttsSeverity);
			cmd.addParameter("@P_CHRT_SEVERITY", pChrtSeverity);
			cmd.addParameter("@P_DUPL_INCLUDE_IND", pDuplIncludeInd);
			cmd.addParameter("@P_LINK_INCLUDE_IND", pLinkIncludeInd);
			cmd.addParameter("@P_PREQ_INCLUDE_IND", pPreqIncludeInd);
			cmd.addParameter("@P_CORQ_INCLUDE_IND", pCorqIncludeInd);
			cmd.addParameter("@P_TIME_INCLUDE_IND", pTimeIncludeInd);
			cmd.addParameter("@P_CAPC_SEVERITY", pCapcSeverity);
			cmd.addParameter("@P_LEVL_SEVERITY", pLevlSeverity);
			cmd.addParameter("@P_COLL_SEVERITY", pCollSeverity);
			cmd.addParameter("@P_MAJR_SEVERITY", pMajrSeverity);
			cmd.addParameter("@P_CLAS_SEVERITY", pClasSeverity);
			cmd.addParameter("@P_APPR_SEVERITY", pApprSeverity);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DEADLINE_NOTIFY", pDeadlineNotify);
			cmd.addParameter("@P_LETR_CODE_STU_NOTIFY", pLetrCodeStuNotify);
			cmd.addParameter("@P_LETR_CODE_FAC_NOTIFY", pLetrCodeFacNotify);
			cmd.addParameter("@P_LETR_CODE_ADV_NOTIFY", pLetrCodeAdvNotify);
			cmd.addParameter("@P_LETR_CODE_REG_NOTIFY", pLetrCodeRegNotify);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HOST_NAME", pHostName);
			cmd.addParameter("@P_MAX_RESEND_HRS", pMaxResendHrs);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="WlTermControlRecRow", dataSourceName="WL_TERM_CONTROL_REC")
	public static class WlTermControlRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_AUTO_NOTIFY_IND")
		public NString RAutoNotifyInd;
		@DbRecordField(dataSourceName="R_ONLINE_NOTIFY_IND")
		public NString ROnlineNotifyInd;
		@DbRecordField(dataSourceName="R_WL_POS_WEBC_DISP_IND")
		public NString RWlPosWebcDispInd;
		@DbRecordField(dataSourceName="R_STU_NOTIFY_IND")
		public NString RStuNotifyInd;
		@DbRecordField(dataSourceName="R_FAC_NOTIFY_IND")
		public NString RFacNotifyInd;
		@DbRecordField(dataSourceName="R_ADV_NOTIFY_IND")
		public NString RAdvNotifyInd;
		@DbRecordField(dataSourceName="R_REG_NOTIFY_IND")
		public NString RRegNotifyInd;
		@DbRecordField(dataSourceName="R_CAMP_SEVERITY")
		public NString RCampSeverity;
		@DbRecordField(dataSourceName="R_DEGREE_SEVERITY")
		public NString RDegreeSeverity;
		@DbRecordField(dataSourceName="R_PROGRAM_SEVERITY")
		public NString RProgramSeverity;
		@DbRecordField(dataSourceName="R_DEPARTMENT_SEVERITY")
		public NString RDepartmentSeverity;
		@DbRecordField(dataSourceName="R_ATTS_SEVERITY")
		public NString RAttsSeverity;
		@DbRecordField(dataSourceName="R_CHRT_SEVERITY")
		public NString RChrtSeverity;
		@DbRecordField(dataSourceName="R_DUPL_INCLUDE_IND")
		public NString RDuplIncludeInd;
		@DbRecordField(dataSourceName="R_LINK_INCLUDE_IND")
		public NString RLinkIncludeInd;
		@DbRecordField(dataSourceName="R_PREQ_INCLUDE_IND")
		public NString RPreqIncludeInd;
		@DbRecordField(dataSourceName="R_CORQ_INCLUDE_IND")
		public NString RCorqIncludeInd;
		@DbRecordField(dataSourceName="R_TIME_INCLUDE_IND")
		public NString RTimeIncludeInd;
		@DbRecordField(dataSourceName="R_CAPC_SEVERITY")
		public NString RCapcSeverity;
		@DbRecordField(dataSourceName="R_LEVL_SEVERITY")
		public NString RLevlSeverity;
		@DbRecordField(dataSourceName="R_COLL_SEVERITY")
		public NString RCollSeverity;
		@DbRecordField(dataSourceName="R_MAJR_SEVERITY")
		public NString RMajrSeverity;
		@DbRecordField(dataSourceName="R_CLAS_SEVERITY")
		public NString RClasSeverity;
		@DbRecordField(dataSourceName="R_APPR_SEVERITY")
		public NString RApprSeverity;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DEADLINE_NOTIFY")
		public NNumber RDeadlineNotify;
		@DbRecordField(dataSourceName="R_LETR_CODE_STU_NOTIFY")
		public NString RLetrCodeStuNotify;
		@DbRecordField(dataSourceName="R_LETR_CODE_FAC_NOTIFY")
		public NString RLetrCodeFacNotify;
		@DbRecordField(dataSourceName="R_LETR_CODE_ADV_NOTIFY")
		public NString RLetrCodeAdvNotify;
		@DbRecordField(dataSourceName="R_LETR_CODE_REG_NOTIFY")
		public NString RLetrCodeRegNotify;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_HOST_NAME")
		public NString RHostName;
		@DbRecordField(dataSourceName="R_MAX_RESEND_HRS")
		public NNumber RMaxResendHrs;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
