package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbRuleEditsRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pRuclCode,NNumber pEditSeqNum,NDate pEffDate,NString pField,NString pEditCode,NString pContinueOnError,NString pErrorSeverity,NString pOperand1Entity,NString pOperand1Element,NString pOperator,NString pOperand2Entity,NString pOperand2Element,NString pLiteral1,NString pLiteral2,NString pErrorMessage,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_EDIT_SEQ_NUM", pEditSeqNum);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_EDIT_CODE", pEditCode);
			cmd.addParameter("@P_CONTINUE_ON_ERROR", pContinueOnError);
			cmd.addParameter("@P_ERROR_SEVERITY", pErrorSeverity);
			cmd.addParameter("@P_OPERAND_1_ENTITY", pOperand1Entity);
			cmd.addParameter("@P_OPERAND_1_ELEMENT", pOperand1Element);
			cmd.addParameter("@P_OPERATOR", pOperator);
			cmd.addParameter("@P_OPERAND_2_ENTITY", pOperand2Entity);
			cmd.addParameter("@P_OPERAND_2_ELEMENT", pOperand2Element);
			cmd.addParameter("@P_LITERAL_1", pLiteral1);
			cmd.addParameter("@P_LITERAL_2", pLiteral2);
			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pRuclCode,NNumber pEditSeqNum,NDate pEffDate,NString pField,NString pEditCode,NString pContinueOnError,NString pErrorSeverity,NString pOperand1Entity,NString pOperand1Element,NString pOperator,NString pOperand2Entity,NString pOperand2Element,NString pLiteral1,NString pLiteral2,NString pErrorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_EDIT_SEQ_NUM", pEditSeqNum);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_EDIT_CODE", pEditCode);
			cmd.addParameter("@P_CONTINUE_ON_ERROR", pContinueOnError);
			cmd.addParameter("@P_ERROR_SEVERITY", pErrorSeverity);
			cmd.addParameter("@P_OPERAND_1_ENTITY", pOperand1Entity);
			cmd.addParameter("@P_OPERAND_1_ELEMENT", pOperand1Element);
			cmd.addParameter("@P_OPERATOR", pOperator);
			cmd.addParameter("@P_OPERAND_2_ENTITY", pOperand2Entity);
			cmd.addParameter("@P_OPERAND_2_ELEMENT", pOperand2Element);
			cmd.addParameter("@P_LITERAL_1", pLiteral1);
			cmd.addParameter("@P_LITERAL_2", pLiteral2);
			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
				
			cmd.execute();


		}
		
	
	
	
}
