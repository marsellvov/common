package net.hedtech.general.common.dbservices;

import java.util.*;


import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pdkdedn {
		public static NString fCheckDecimalDigits(NString bdcaCode,NNumber dedAmount,NString amtInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.F_CHECK_DECIMAL_DIGITS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
			cmd.addParameter("@DED_AMOUNT", dedAmount);
			cmd.addParameter("@AMT_IND", amtInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		//public static void pApplyDeduction(List<PdkdednInputTabtype> inputTable,Ref<PdkdednErrorTabtype> errorTable,Ref<NString> insUpdIndOut) {
		public static void pApplyDeduction(PdkdednInputTabtype inputTable,Ref<PdkdednErrorTabtype> errorTable,Ref<NString> insUpdIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_APPLY_DEDUCTION", DbManager.getDataBaseFactory());
			
			// cmd.addParame ter(DbTypes.getTableType("INPUT_TABLE", "", inputTable, object.class));
			// cmd.addParameter(DbTypes.getTableType("ERROR_TABLE", "", errorTable.val, object.class , true));
			cmd.addParameter(DbTypes.getCollectionType("INPUT_TABLE", inputTable, PdkdednInputTabtype.class, true)); 
			cmd.addParameter(DbTypes.getCollectionType("ERROR_TABLE", errorTable.val, PdkdednErrorTabtype.class, true)); 
			cmd.addParameter("@INS_UPD_IND_OUT", NString.class);
				
			cmd.execute();
			// errorTable.val = cmd.getTableParameterValue("@ERROR_TABLE", object.class);
			errorTable.val = cmd.getParameterValue("ERROR_TABLE", PdkdednErrorTabtype.class);
			insUpdIndOut.val = cmd.getParameterValue("@INS_UPD_IND_OUT", NString.class);


		}
		
		public static void pCheckFlex(NNumber pidmIn,NString bdcaCodeIn,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_CHECK_FLEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@BDCA_CODE_IN", bdcaCodeIn);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pCheckPreclusion(NNumber pidmIn,NString bdcaCodeIn,NDate effDateIn,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_CHECK_PRECLUSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@BDCA_CODE_IN", bdcaCodeIn);
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pEditAddReplInd(NString addReplIndIn,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_EDIT_ADD_REPL_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADD_REPL_IND_IN", addReplIndIn);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pEditAddReplPictCode(NString addReplPictCodeIn,Ref<NString> descOut,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_EDIT_ADD_REPL_PICT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADD_REPL_PICT_CODE_IN", addReplPictCodeIn);
			cmd.addParameter("@DESC_OUT", NString.class);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			descOut.val = cmd.getParameterValue("@DESC_OUT", NString.class);
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pEditAmount(NNumber amountIn,NString amountNumberIn,NString amountIndIn,NString statusIn,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_EDIT_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@AMOUNT_NUMBER_IN", amountNumberIn);
			cmd.addParameter("@AMOUNT_IND_IN", amountIndIn);
			cmd.addParameter("@STATUS_IN", statusIn);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pEditArrearStatus(NString arrStatusIn,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_EDIT_ARREAR_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ARR_STATUS_IN", arrStatusIn);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pEditBdcaCode(NString bdcaCodeIn,NString bcatCodeIn,Ref<NString> fsaIndOut,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_EDIT_BDCA_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BDCA_CODE_IN", bdcaCodeIn);
			cmd.addParameter("@BCAT_CODE_IN", bcatCodeIn);
			cmd.addParameter("@FSA_IND_OUT", NString.class);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			fsaIndOut.val = cmd.getParameterValue("@FSA_IND_OUT", NString.class);
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pEditEmployeeId(NString idIn,Ref<NNumber> pidmOut,Ref<NString> bcatCodeOut,Ref<NString> eclsCodeOut,Ref<NString> coasCodeHomeOut,Ref<NString> orgnCodeHomeOut,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_EDIT_EMPLOYEE_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@PIDM_OUT", NNumber.class);
			cmd.addParameter("@BCAT_CODE_OUT", NString.class);
			cmd.addParameter("@ECLS_CODE_OUT", NString.class);
			cmd.addParameter("@COAS_CODE_HOME_OUT", NString.class);
			cmd.addParameter("@ORGN_CODE_HOME_OUT", NString.class);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			pidmOut.val = cmd.getParameterValue("@PIDM_OUT", NNumber.class);
			bcatCodeOut.val = cmd.getParameterValue("@BCAT_CODE_OUT", NString.class);
			eclsCodeOut.val = cmd.getParameterValue("@ECLS_CODE_OUT", NString.class);
			coasCodeHomeOut.val = cmd.getParameterValue("@COAS_CODE_HOME_OUT", NString.class);
			orgnCodeHomeOut.val = cmd.getParameterValue("@ORGN_CODE_HOME_OUT", NString.class);
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pEditEndDate(NDate endDateIn,NNumber pidmIn,NString bdcaCodeIn,NDate lastPaidDateIn,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_EDIT_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@END_DATE_IN", endDateIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@BDCA_CODE_IN", bdcaCodeIn);
			cmd.addParameter("@LAST_PAID_DATE_IN", lastPaidDateIn);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pEditNewEffectiveDate(NDate effDateIn,NString bdcaCodeIn,NString bcatCodeIn,NDate lastPaidDateIn,NString statusIn,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_EDIT_NEW_EFFECTIVE_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@BDCA_CODE_IN", bdcaCodeIn);
			cmd.addParameter("@BCAT_CODE_IN", bcatCodeIn);
			cmd.addParameter("@LAST_PAID_DATE_IN", lastPaidDateIn);
			cmd.addParameter("@STATUS_IN", statusIn);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pEditOptCode(NString optCodeIn,NString optNumberIn,NString optionIndIn,NString calcRuleIn,NString bdcaCodeIn,NString statusIn,NDate effDateIn,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_EDIT_OPT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OPT_CODE_IN", optCodeIn);
			cmd.addParameter("@OPT_NUMBER_IN", optNumberIn);
			cmd.addParameter("@OPTION_IND_IN", optionIndIn);
			cmd.addParameter("@CALC_RULE_IN", calcRuleIn);
			cmd.addParameter("@BDCA_CODE_IN", bdcaCodeIn);
			cmd.addParameter("@STATUS_IN", statusIn);
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pEditStatus(NString statusIn,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_EDIT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STATUS_IN", statusIn);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pInsertFlexBalance(NNumber pidmIn,NString bdcaCodeIn,NDate effDateIn,NString optCode1In,Ref<NString> returnCodeOut,Ref<NString> returnTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_INSERT_FLEX_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@BDCA_CODE_IN", bdcaCodeIn);
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@OPT_CODE1_IN", optCode1In);
			cmd.addParameter("@RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@RETURN_TEXT_OUT", NString.class);
				
			cmd.execute();
			returnCodeOut.val = cmd.getParameterValue("@RETURN_CODE_OUT", NString.class);
			returnTextOut.val = cmd.getParameterValue("@RETURN_TEXT_OUT", NString.class);


		}
		
		public static void pIssueRollback(NString savepointIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_ISSUE_ROLLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SAVEPOINT_IN", savepointIn);
				
			cmd.execute();


		}
		
		public static void pSetInputValue(NString keyIn,NString valueIn,Ref<PdkdednInputTabtype> inputTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKDEDN.P_SET_INPUT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@KEY_IN", keyIn);
			cmd.addParameter("@VALUE_IN", valueIn);
			//cmd.addParameter(DbTypes.getTableType("INPUT_TABLE", "", inputTable, PdkdednInputTabtype.class , true));
			cmd.addParameter(DbTypes.getCollectionType("INPUT_TABLE", inputTable.val, PdkdednInputTabtype.class, true)); 
				
			cmd.execute();
			inputTable.val=cmd.getParameterValue("INPUT_TABLE",PdkdednInputTabtype.class);
			 //inputTable.val = cmd.getTableParameterValue("@INPUT_TABLE", object.class);
			

		}
		
	
	
	@DbRecordType(id="ErrorRectypeRow", dataSourceName="PDKDEDN.ERROR_RECTYPE")
	public static class ErrorRectypeRow
	{
		@DbRecordField(dataSourceName="TYPE")
		public NString Type;
		@DbRecordField(dataSourceName="CODE")
		public NString Code;
		@DbRecordField(dataSourceName="TEXT")
		public NString Text;
	}

	
	@DbRecordType(id="KeyValueRectypeRow", dataSourceName="PDKDEDN.KEY_VALUE_RECTYPE")
	public static class KeyValueRectypeRow
	{
		@DbRecordField(dataSourceName="KEY")
		public NString Key;
		@DbRecordField(dataSourceName="VALUE")
		public NString Value;
	}

	
	@DbTableType(id="Pdkdedn.InputTabtype", dataSourceName="PDKDEDN.INPUT_TABTYPE", indexed=true)
	public static class PdkdednInputTabtype extends Table<KeyValueRectypeRow> {
	}	
	
	@DbTableType(id="Pdkdedn.ErrorTabtype", dataSourceName="PDKDEDN.ERROR_TABTYPE", indexed=true)
	public static class PdkdednErrorTabtype extends Table<ErrorRectypeRow> {
	}	
}
