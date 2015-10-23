package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkbdls {
		public static NString fCheckUsercanlockOrgn(NString inUser,DataCursor ioOrgnlistC) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.F_CHECK_USERCANLOCK_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IO_ORGNLIST_C", DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckUsercanlockSpcfcorgn(NString inCoas,NString inOrgn,NString inUser,NDate inAsofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.F_CHECK_USERCANLOCK_SPCFCORGN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetlockhierstatus(NString inCoas,NString inBudgid,NString inPhase,NString inOrgn,NDate inAsofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.F_GETLOCKHIERSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_BUDGID", inBudgid);
			cmd.addParameter("@IN_PHASE", inPhase);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetlockstatus(NString inCoas,NString inBudgid,NString inPhase,NString inOrgn,NDate inAsofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.F_GETLOCKSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_BUDGID", inBudgid);
			cmd.addParameter("@IN_PHASE", inPhase);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHyperlinkOrgn(NString inCoas,NString inOrgn,NDate inAsofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.F_HYPERLINK_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsOrgnInFomusor(NString inCoas,NString inOrgn,NString inUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.F_IS_ORGN_IN_FOMUSOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_USER", inUser);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pBuildBdlc(NString inPidm,NString inUser,NString inCoas,NString inOrgn,NString inOrgnPred,NString inBudgid,NString inPhase1,NString inPhase2,NString inPhase3,NString inLockstatus,NDate inAsofdate,NString inWbudChecked,Ref<NNumber> rowsInsertedCount,Ref<List<ClosedorgntabRow>> closedOrgnInfo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_BUILD_BDLC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@IN_PIDM", inPidm);
//			cmd.addParameter("@IN_USER", inUser);
//			cmd.addParameter("@IN_COAS", inCoas);
//			cmd.addParameter("@IN_ORGN", inOrgn);
//			cmd.addParameter("@IN_ORGN_PRED", inOrgnPred);
//			cmd.addParameter("@IN_BUDGID", inBudgid);
//			cmd.addParameter("@IN_PHASE1", inPhase1);
//			cmd.addParameter("@IN_PHASE2", inPhase2);
//			cmd.addParameter("@IN_PHASE3", inPhase3);
//			cmd.addParameter("@IN_LOCKSTATUS", inLockstatus);
//			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
//			cmd.addParameter("@IN_WBUD_CHECKED", inWbudChecked);
//			cmd.addParameter("@ROWS_INSERTED_COUNT", NNumber.class);
//			// cmd.addParameter(DbTypes.getTableType("CLOSED_ORGN_INFO", "", object.class));
//				
//			cmd.execute();
//			rowsInsertedCount.val = cmd.getParameterValue("@ROWS_INSERTED_COUNT", NNumber.class);
//			// closedOrgnInfo.val = cmd.getTableParameterValue("@CLOSED_ORGN_INFO", object.class);
//
//
//		}
//		
		public static void pCanUserEditOrgnLock(NString inUser,NString inCoas,NString inOrgn,NString inBudgid,NString inPhase,NDate effDate,Ref<NString> retvalue,Ref<NString> lockedOrgn,Ref<NString> orgnTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_CAN_USER_EDIT_ORGN_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_BUDGID", inBudgid);
			cmd.addParameter("@IN_PHASE", inPhase);
			cmd.addParameter("@EFF_DATE", effDate);
			cmd.addParameter("@RETVALUE", NString.class);
			cmd.addParameter("@LOCKED_ORGN", NString.class);
			cmd.addParameter("@ORGN_TITLE", NString.class);
				
			cmd.execute();
			retvalue.val = cmd.getParameterValue("@RETVALUE", NString.class);
			lockedOrgn.val = cmd.getParameterValue("@LOCKED_ORGN", NString.class);
			orgnTitle.val = cmd.getParameterValue("@ORGN_TITLE", NString.class);


		}
		
		public static void pCascadeLock(NString inCoas,NString inBudgid,NString inPhase,NString inUser,NString inOrgn,NString inStatus,NDate inAsofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_CASCADE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_BUDGID", inBudgid);
			cmd.addParameter("@IN_PHASE", inPhase);
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_STATUS", inStatus);
			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
				
			cmd.execute();


		}
		
		public static void pDeleteFbrbdlc(NNumber inPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_DELETE_FBRBDLC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_PIDM", inPidm);
				
			cmd.execute();


		}
		
		public static void pDeleteFbrbdlcPredorgn(NNumber inPidm,NString inPredorgn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_DELETE_FBRBDLC_PREDORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_PREDORGN", inPredorgn);
				
			cmd.execute();


		}
		
		public static void pGetAllWbudeditorgnList(NString inUser,NString inCoas,NDate inAsofdate,Ref<DataCursor> ioOrgnlistC) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_GET_ALL_WBUDEDITORGN_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
			cmd.addParameter("@IO_ORGNLIST_C", DataCursor.class);
				
			cmd.execute();
			ioOrgnlistC.val = cmd.getParameterValue("@IO_ORGNLIST_C", DataCursor.class);


		}
		
		public static void pGetSpecfcWbudeditorgnList(NString inCoas,NDate inAsofdate,NString inOrgn,NString inOrgnPred,Ref<DataCursor> ioOrgnlistC) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_GET_SPECFC_WBUDEDITORGN_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_ORGN_PRED", inOrgnPred);
			cmd.addParameter("@IO_ORGNLIST_C", DataCursor.class);
				
			cmd.execute();
			ioOrgnlistC.val = cmd.getParameterValue("@IO_ORGNLIST_C", DataCursor.class);


		}
		
		public static void pInsertFbblock(NString inCoas,NString inBudgid,NString inPhase,NString inUser,NString inOrgn,NString inStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_INSERT_FBBLOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_BUDGID", inBudgid);
			cmd.addParameter("@IN_PHASE", inPhase);
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_STATUS", inStatus);
				
			cmd.execute();


		}
		
		public static void pInsertFbrbdlc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_INSERT_FBRBDLC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateFbblock(NString inCoas,NString inBudgid,NString inPhase,NString inUser,NString inOrgn,NString inStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_UPDATE_FBBLOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_BUDGID", inBudgid);
			cmd.addParameter("@IN_PHASE", inPhase);
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_STATUS", inStatus);
				
			cmd.execute();


		}
		
//		public static void pUpdateFbrbdlc(NNumber inPidm,List<Twbklibs.Varchar2TabtypeRow> inOrgnList1,List<Twbklibs.Varchar2TabtypeRow> inOrgnList2,List<Twbklibs.Varchar2TabtypeRow> inOrgnList3) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_UPDATE_FBRBDLC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@IN_PIDM", inPidm);
//			// cmd.addParameter(DbTypes.getTableType("IN_ORGN_LIST1", "", inOrgnList1, object.class));
//			// cmd.addParameter(DbTypes.getTableType("IN_ORGN_LIST2", "", inOrgnList2, object.class));
//			// cmd.addParameter(DbTypes.getTableType("IN_ORGN_LIST3", "", inOrgnList3, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdateStatus(NNumber inPidm,NString inCoas,NString inBudgid,NString inPhase,NString inUser,NString inOrgnPred,NDate inAsofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDLS.P_UPDATE_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_BUDGID", inBudgid);
			cmd.addParameter("@IN_PHASE", inPhase);
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_ORGN_PRED", inOrgnPred);
			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ClosedorgnrecordRow", dataSourceName="CLOSEDORGNRECORD")
	public static class ClosedorgnrecordRow
	{
		@DbRecordField(dataSourceName="PHASE_CODE")
		public NString PhaseCode;
		@DbRecordField(dataSourceName="ORGN_CODE")
		public NString OrgnCode;
		@DbRecordField(dataSourceName="PRED_ORGN_CODE")
		public NString PredOrgnCode;
		@DbRecordField(dataSourceName="PRED_ORGN_TITLE")
		public NString PredOrgnTitle;
	}

	
	@DbRecordType(id="OrganizationrecordRow", dataSourceName="ORGANIZATIONRECORD")
	public static class OrganizationrecordRow
	{
		@DbRecordField(dataSourceName="COAS_CODE")
		public NString CoasCode;
		@DbRecordField(dataSourceName="ORGN_CODE")
		public NString OrgnCode;
		@DbRecordField(dataSourceName="ORGN_CODE_PRED")
		public NString OrgnCodePred;
		@DbRecordField(dataSourceName="TITLE")
		public NString Title;
	}

	
	
}
