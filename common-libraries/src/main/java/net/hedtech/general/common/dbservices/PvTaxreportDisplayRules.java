package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvTaxreportDisplayRules {
		public static NString fParentExists(NString pTaxReptCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTaxReptCode,NString pBoxNum,NString pEffectiveYear,NString pColumnName,NString pFieldLabel,NString pSysReqInd,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
			cmd.addParameter("@P_BOX_NUM", pBoxNum);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_FIELD_LABEL", pFieldLabel);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTaxReptCode,NString pBoxNum,NString pEffectiveYear,NString pColumnName,NString pFieldLabel,NString pSysReqInd,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TAXREPORT_DISPLAY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAX_REPT_CODE", pTaxReptCode);
			cmd.addParameter("@P_BOX_NUM", pBoxNum);
			cmd.addParameter("@P_EFFECTIVE_YEAR", pEffectiveYear);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_FIELD_LABEL", pFieldLabel);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
