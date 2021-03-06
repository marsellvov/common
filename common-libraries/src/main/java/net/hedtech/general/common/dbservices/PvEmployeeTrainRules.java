package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvEmployeeTrainRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_TRAIN_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pEmplNumb,NString pEmptCode,NString pWkshCode,NString pDeptCode,NString pPclsCode,NString pActiveInd,NString pUserId,NDate pHireDate,NDate pLeaveDate,NString pPayType,NNumber pPlaceNumb,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_TRAIN_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_NUMB", pEmplNumb);
			cmd.addParameter("@P_EMPT_CODE", pEmptCode);
			cmd.addParameter("@P_WKSH_CODE", pWkshCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_HIRE_DATE", pHireDate);
			cmd.addParameter("@P_LEAVE_DATE", pLeaveDate);
			cmd.addParameter("@P_PAY_TYPE", pPayType);
			cmd.addParameter("@P_PLACE_NUMB", pPlaceNumb);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pEmplNumb,NString pEmptCode,NString pWkshCode,NString pDeptCode,NString pPclsCode,NString pActiveInd,NString pUserId,NDate pHireDate,NDate pLeaveDate,NString pPayType,NNumber pPlaceNumb,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_TRAIN_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_NUMB", pEmplNumb);
			cmd.addParameter("@P_EMPT_CODE", pEmptCode);
			cmd.addParameter("@P_WKSH_CODE", pWkshCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_PCLS_CODE", pPclsCode);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_HIRE_DATE", pHireDate);
			cmd.addParameter("@P_LEAVE_DATE", pLeaveDate);
			cmd.addParameter("@P_PAY_TYPE", pPayType);
			cmd.addParameter("@P_PLACE_NUMB", pPlaceNumb);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
