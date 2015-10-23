package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbCommodity {
		public static NString fCurrentVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY.F_CURRENT_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fExists(NString pCode,NDate pEffDate,NDate pTermDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fIsCommStock(NString pCommCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY.F_IS_COMM_STOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COMM_CODE", pCommCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCode,NDate pEffDate,NDate pActivityDate,NString pUserId,NString pDesc,NString pUomsCode,NDate pTermDate,NString pCommCodePred,NString pAmstInd,NString pTgrpCode,NString pTaxOverrideInd,NString pStockInd,NNumber pOnorderQty,NNumber pReservedQty,NNumber pInvoicedQty,NNumber pValueAmt,NNumber pEstLifeYears,Ref<NString> pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", NString.class);
				
			cmd.execute();
			pRowid.val = cmd.getParameterValue("@P_ROWID", NString.class);


		}
		
		public static void pDelete(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pExistsData(NString pCode,NDate pEffDate,NDate pTermDate,Ref<CommodityRecRow> pFtvcommRecOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY.P_EXISTS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter(DbTypes.createStructType("P_FTVCOMM_REC_OUT", pFtvcommRecOut.val, CommodityRecRow.class, true));
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pFtvcommRecOut.val = cmd.getParameterValue("@P_FTVCOMM_REC_OUT", CommodityRecRow.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pLock(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pCode,NDate pEffDate,NDate pActivityDate,NString pUserId,NString pDesc,NString pUomsCode,NDate pTermDate,NString pCommCodePred,NString pAmstInd,NString pTgrpCode,NString pTaxOverrideInd,NString pStockInd,NNumber pOnorderQty,NNumber pReservedQty,NNumber pInvoicedQty,NNumber pValueAmt,NNumber pEstLifeYears,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_COMMODITY.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CommodityRecRow", dataSourceName="COMMODITY_REC")
	public static class CommodityRecRow
	{
		@DbRecordField(dataSourceName="P_CODE")
		public NString PCode;
		@DbRecordField(dataSourceName="P_EFF_DATE")
		public NDate PEffDate;
		@DbRecordField(dataSourceName="P_ACTIVITY_DATE")
		public NDate PActivityDate;
		@DbRecordField(dataSourceName="P_USER_ID")
		public NString PUserId;
		@DbRecordField(dataSourceName="P_DESC")
		public NString PDesc;
		@DbRecordField(dataSourceName="P_UOMS_CODE")
		public NString PUomsCode;
		@DbRecordField(dataSourceName="P_TERM_DATE")
		public NDate PTermDate;
		@DbRecordField(dataSourceName="P_COMM_CODE_PRED")
		public NString PCommCodePred;
		@DbRecordField(dataSourceName="P_AMST_IND")
		public NString PAmstInd;
		@DbRecordField(dataSourceName="P_TGRP_CODE")
		public NString PTgrpCode;
		@DbRecordField(dataSourceName="P_TAX_OVERRIDE_IND")
		public NString PTaxOverrideInd;
		@DbRecordField(dataSourceName="P_STOCK_IND")
		public NString PStockInd;
		@DbRecordField(dataSourceName="P_ONORDER_QTY")
		public NNumber POnorderQty;
		@DbRecordField(dataSourceName="P_RESERVED_QTY")
		public NNumber PReservedQty;
		@DbRecordField(dataSourceName="P_INVOICED_QTY")
		public NNumber PInvoicedQty;
		@DbRecordField(dataSourceName="P_VALUE_AMT")
		public NNumber PValueAmt;
		@DbRecordField(dataSourceName="P_EST_LIFE_YEARS")
		public NNumber PEstLifeYears;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
	}

	
	
}
