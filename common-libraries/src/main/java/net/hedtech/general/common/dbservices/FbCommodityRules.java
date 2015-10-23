package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbCommodityRules {
		public static void pPublishSync(NString pOperationType,NString pCode,NDate pEffDate,NString pDesc,NString pUomsCode,NDate pTermDate,NString pTgrpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY_RULES.P_PUBLISH_SYNC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_UOMS_CODE", pUomsCode);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCode,NDate pEffDate,NDate pActivityDate,NString pUserId,NString pDesc,NString pUomsCode,NDate pTermDate,NString pCommCodePred,NString pAmstInd,NString pTgrpCode,NString pTaxOverrideInd,NString pStockInd,NNumber pOnorderQty,NNumber pReservedQty,NNumber pInvoicedQty,NNumber pValueAmt,NNumber pEstLifeYears) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_UOMS_CODE", pUomsCode);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_COMM_CODE_PRED", pCommCodePred);
			cmd.addParameter("@P_AMST_IND", pAmstInd);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TAX_OVERRIDE_IND", pTaxOverrideInd);
			cmd.addParameter("@P_STOCK_IND", pStockInd);
			cmd.addParameter("@P_ONORDER_QTY", pOnorderQty);
			cmd.addParameter("@P_RESERVED_QTY", pReservedQty);
			cmd.addParameter("@P_INVOICED_QTY", pInvoicedQty);
			cmd.addParameter("@P_VALUE_AMT", pValueAmt);
			cmd.addParameter("@P_EST_LIFE_YEARS", pEstLifeYears);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCode,NString pDesc,NString pUomsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_UOMS_CODE", pUomsCode);
				
			cmd.execute();


		}
		
	
	
	
}
