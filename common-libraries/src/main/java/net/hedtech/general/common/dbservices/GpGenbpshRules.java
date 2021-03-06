package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGenbpshRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pGidm,NString pSystCode,NString pRetpCode,NString pDtypCode,NString pCreateInd,NNumber pPersonPidm,NString pAuxData,NString pLoadStatus,NDate pLoadDate,NString pUserId,NDate pCreateDate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_CREATE_IND", pCreateInd);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_AUX_DATA", pAuxData);
			cmd.addParameter("@P_LOAD_STATUS", pLoadStatus);
			cmd.addParameter("@P_LOAD_DATE", pLoadDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pGidm,NString pSystCode,NString pRetpCode,NString pDtypCode,NString pCreateInd,NNumber pPersonPidm,NString pAuxData,NString pLoadStatus,NDate pLoadDate,NString pUserId,NDate pCreateDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GENBPSH_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_RETP_CODE", pRetpCode);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_CREATE_IND", pCreateInd);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_AUX_DATA", pAuxData);
			cmd.addParameter("@P_LOAD_STATUS", pLoadStatus);
			cmd.addParameter("@P_LOAD_DATE", pLoadDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
				
			cmd.execute();


		}
		
	
	
	
}
