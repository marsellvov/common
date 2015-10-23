package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbAidYearDesigRules {
		public static NString fParentExists(NString pAbdsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_AID_YEAR_DESIG_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ABDS_CODE", pAbdsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_AID_YEAR_DESIG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAbdsCode,NString pAidyCode,NDate pEffDate,NString pOperator,NString pSecondaryOp,NString pTermSuffix,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_AID_YEAR_DESIG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ABDS_CODE", pAbdsCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_OPERATOR", pOperator);
			cmd.addParameter("@P_SECONDARY_OP", pSecondaryOp);
			cmd.addParameter("@P_TERM_SUFFIX", pTermSuffix);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAbdsCode,NString pAidyCode,NDate pEffDate,NString pOperator,NString pSecondaryOp,NString pTermSuffix,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_AID_YEAR_DESIG_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ABDS_CODE", pAbdsCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_OPERATOR", pOperator);
			cmd.addParameter("@P_SECONDARY_OP", pSecondaryOp);
			cmd.addParameter("@P_TERM_SUFFIX", pTermSuffix);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pValidateOperators(NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_AID_YEAR_DESIG_RULES.P_VALIDATE_OPERATORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();


		}
		
	
	
	
}
