package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvCrgTrain {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pEmplNumb,NString pEmptCode,NString pPclsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_NUMB", pEmplNumb);
			cmd.addParameter("@P_EMPT_CODE", pEmptCode);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CrgTrainRecRow recOne,CrgTrainRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CrgTrainRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CrgTrainRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pEmplNumb,NString pEmptCode,NString pPclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_NUMB", pEmplNumb);
			cmd.addParameter("@P_EMPT_CODE", pEmptCode);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pEmplNumb,NString pEmptCode,NString pPclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_NUMB", pEmplNumb);
			cmd.addParameter("@P_EMPT_CODE", pEmptCode);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pEmplNumb,NString pEmptCode,NString pPclsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_NUMB", pEmplNumb);
			cmd.addParameter("@P_EMPT_CODE", pEmptCode);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pEmplNumb,NString pEmptCode,NString pPclsCode,NString pDeptCode,NString pWkshCode,NString pActiveInd,NString pUserId,NDate pHireDate,NDate pLeaveDate,NString pPayType,NNumber pPlaceNum,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_NUMB", pEmplNumb);
			cmd.addParameter("@P_EMPT_CODE", pEmptCode);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_WKSH_CODE", pWkshCode);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_HIRE_DATE", pHireDate);
			cmd.addParameter("@P_LEAVE_DATE", pLeaveDate);
			cmd.addParameter("@P_PAY_TYPE", pPayType);
			cmd.addParameter("@P_PLACE_NUM", pPlaceNum);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pEmplNumb,NString pEmptCode,NString pPclsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_NUMB", pEmplNumb);
			cmd.addParameter("@P_EMPT_CODE", pEmptCode);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pEmplNumb,NString pEmptCode,NString pPclsCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_NUMB", pEmplNumb);
			cmd.addParameter("@P_EMPT_CODE", pEmptCode);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pEmplNumb,NString pEmptCode,NString pPclsCode,NString pDeptCode,NString pWkshCode,NString pActiveInd,NString pUserId,NDate pHireDate,NDate pLeaveDate,NString pPayType,NNumber pPlaceNum,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CRG_TRAIN.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_NUMB", pEmplNumb);
			cmd.addParameter("@P_EMPT_CODE", pEmptCode);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_WKSH_CODE", pWkshCode);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_HIRE_DATE", pHireDate);
			cmd.addParameter("@P_LEAVE_DATE", pLeaveDate);
			cmd.addParameter("@P_PAY_TYPE", pPayType);
			cmd.addParameter("@P_PLACE_NUM", pPlaceNum);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="CrgTrainRecRow", dataSourceName="CRG_TRAIN_REC", needsInitialization=true)
	public static class CrgTrainRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_EMPL_NUMB")
		public NString REmplNumb;
		@DbRecordField(dataSourceName="R_EMPT_CODE")
		public NString REmptCode;
		@DbRecordField(dataSourceName="R_PCLS_CODE")
		public NString RPclsCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_WKSH_CODE")
		public NString RWkshCode;
		@DbRecordField(dataSourceName="R_ACTIVE_IND")
		public NString RActiveInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_HIRE_DATE")
		public NDate RHireDate;
		@DbRecordField(dataSourceName="R_LEAVE_DATE")
		public NDate RLeaveDate;
		@DbRecordField(dataSourceName="R_PAY_TYPE")
		public NString RPayType;
		@DbRecordField(dataSourceName="R_PLACE_NUM")
		public NNumber RPlaceNum;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
