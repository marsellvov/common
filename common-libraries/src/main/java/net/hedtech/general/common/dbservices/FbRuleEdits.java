package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbRuleEdits {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRuclCode,NNumber pEditSeqNum,NDate pEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_EDIT_SEQ_NUM", pEditSeqNum);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(RuleEditsRecRow recOne,RuleEditsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RuleEditsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RuleEditsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pRuclCode,NNumber pEditSeqNum,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_EDIT_SEQ_NUM", pEditSeqNum);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pRuclCode,NNumber pEditSeqNum,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_EDIT_SEQ_NUM", pEditSeqNum);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRuclCode,NNumber pEditSeqNum,NDate pEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_EDIT_SEQ_NUM", pEditSeqNum);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pRuclCode,NNumber pEditSeqNum,NDate pEffDate,NString pField,NString pEditCode,NString pContinueOnError,NString pErrorSeverity,NString pOperand1Entity,NString pOperand1Element,NString pOperator,NString pOperand2Entity,NString pOperand2Element,NString pLiteral1,NString pLiteral2,NString pErrorMessage,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pRuclCode,NNumber pEditSeqNum,NDate pEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_EDIT_SEQ_NUM", pEditSeqNum);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pRuclCode,NNumber pEditSeqNum,NDate pEffDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_EDIT_SEQ_NUM", pEditSeqNum);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pRuclCode,NNumber pEditSeqNum,NDate pEffDate,NString pField,NString pEditCode,NString pContinueOnError,NString pErrorSeverity,NString pOperand1Entity,NString pOperand1Element,NString pOperator,NString pOperand2Entity,NString pOperand2Element,NString pLiteral1,NString pLiteral2,NString pErrorMessage,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_RULE_EDITS.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RuleEditsRecRow", dataSourceName="RULE_EDITS_REC")
	public static class RuleEditsRecRow
	{
		@DbRecordField(dataSourceName="R_RUCL_CODE")
		public NString RRuclCode;
		@DbRecordField(dataSourceName="R_EDIT_SEQ_NUM")
		public NNumber REditSeqNum;
		@DbRecordField(dataSourceName="R_EFF_DATE")
		public NDate REffDate;
		@DbRecordField(dataSourceName="R_FIELD")
		public NString RField;
		@DbRecordField(dataSourceName="R_EDIT_CODE")
		public NString REditCode;
		@DbRecordField(dataSourceName="R_CONTINUE_ON_ERROR")
		public NString RContinueOnError;
		@DbRecordField(dataSourceName="R_ERROR_SEVERITY")
		public NString RErrorSeverity;
		@DbRecordField(dataSourceName="R_OPERAND_1_ENTITY")
		public NString ROperand1Entity;
		@DbRecordField(dataSourceName="R_OPERAND_1_ELEMENT")
		public NString ROperand1Element;
		@DbRecordField(dataSourceName="R_OPERATOR")
		public NString ROperator;
		@DbRecordField(dataSourceName="R_OPERAND_2_ENTITY")
		public NString ROperand2Entity;
		@DbRecordField(dataSourceName="R_OPERAND_2_ELEMENT")
		public NString ROperand2Element;
		@DbRecordField(dataSourceName="R_LITERAL_1")
		public NString RLiteral1;
		@DbRecordField(dataSourceName="R_LITERAL_2")
		public NString RLiteral2;
		@DbRecordField(dataSourceName="R_ERROR_MESSAGE")
		public NString RErrorMessage;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
