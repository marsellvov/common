package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tokpapi {
//		public static List<DepositTabTypeRow> fGetDepositTab(NNumber pPidm,NString pTermCode,NString pInternalCode,NString pInternalCodeGroup) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPAPI.F_GET_DEPOSIT_TAB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<DepositTabTypeRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
//			cmd.addParameter("@P_INTERNAL_CODE_GROUP", pInternalCodeGroup);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<DepositTabTypeRow>.class);
//
//		}
//		
//		public static List<FeeTabTypeRow> fGetFeeTab(NNumber pPidm,NString pTermCode,NString pInternalCode,NString pInternalCodeGroup) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPAPI.F_GET_FEE_TAB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<FeeTabTypeRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
//			cmd.addParameter("@P_INTERNAL_CODE_GROUP", pInternalCodeGroup);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<FeeTabTypeRow>.class);
//
//		}
//		
//		public static void pPopulateDepositNt(List<DepositTabTypeRow> pDepositTab,Ref<List<RstDepositNtRow>> pDepositNtInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPAPI.P_POPULATE_DEPOSIT_NT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_DEPOSIT_TAB", "", pDepositTab, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_DEPOSIT_NT_IN_OUT", "", pDepositNtInOut.val, object.class , true));
//				
//			cmd.execute();
//			// pDepositNtInOut.val = cmd.getTableParameterValue("@P_DEPOSIT_NT_IN_OUT", object.class);
//
//
//		}
//		
//		public static void pPopulateFeeNt(List<FeeTabTypeRow> pFeeTab,Ref<List<RstFeeNtRow>> pFeeNtInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKPAPI.P_POPULATE_FEE_NT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_FEE_TAB", "", pFeeTab, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_FEE_NT_IN_OUT", "", pFeeNtInOut.val, object.class , true));
//				
//			cmd.execute();
//			// pFeeNtInOut.val = cmd.getTableParameterValue("@P_FEE_NT_IN_OUT", object.class);
//
//
//		}
		
	
	
	@DbRecordType(id="DepositRecRow", dataSourceName="DEPOSIT_REC")
	public static class DepositRecRow
	{
		@DbRecordField(dataSourceName="R_DEPOSIT_TYPE")
		public NString RDepositType;
		@DbRecordField(dataSourceName="R_DTYP_DESC")
		public NString RDtypDesc;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_TERM_DESC")
		public NString RTermDesc;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_BALANCE")
		public NNumber RBalance;
	}

	
	@DbRecordType(id="FeeRecRow", dataSourceName="FEE_REC")
	public static class FeeRecRow
	{
		@DbRecordField(dataSourceName="R_DETAIL_CODE")
		public NString RDetailCode;
		@DbRecordField(dataSourceName="R_DETC_DESC")
		public NString RDetcDesc;
		@DbRecordField(dataSourceName="R_DCAT_CODE")
		public NString RDcatCode;
		@DbRecordField(dataSourceName="R_DCAT_DESC")
		public NString RDcatDesc;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_TERM_DESC")
		public NString RTermDesc;
		@DbRecordField(dataSourceName="R_TYPE_IND")
		public NString RTypeInd;
		@DbRecordField(dataSourceName="R_NET_AMOUNT")
		public NNumber RNetAmount;
	}

	
	
}
