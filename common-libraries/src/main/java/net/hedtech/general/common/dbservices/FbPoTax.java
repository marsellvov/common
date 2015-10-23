package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbPoTax {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NNumber pPriorityNum,NString pTratCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PoTaxRecRow recOne,PoTaxRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PoTaxRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PoTaxRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NNumber pPriorityNum,NString pTratCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NNumber pPriorityNum,NString pTratCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NNumber pPriorityNum,NString pTratCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCalcAndCreate(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NString pTgrpCode,NDate pEffDate,NNumber pVendorPidm,NNumber pQuantity,NNumber pUnitPrice,NNumber pDiscAmt,NNumber pAddlAmt,NString pUserId,NString pDataOrigin,Ref<NNumber> pTaxAmtOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.P_CALC_AND_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_VENDOR_PIDM", pVendorPidm);
			cmd.addParameter("@P_QUANTITY", pQuantity);
			cmd.addParameter("@P_UNIT_PRICE", pUnitPrice);
			cmd.addParameter("@P_DISC_AMT", pDiscAmt);
			cmd.addParameter("@P_ADDL_AMT", pAddlAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TAX_AMT_OUT", NNumber.class);
				
			cmd.execute();
			pTaxAmtOut.val = cmd.getParameterValue("@P_TAX_AMT_OUT", NNumber.class);


		}
		
		public static void pCreate(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NNumber pPriorityNum,NString pTratCode,NNumber pTaxAmt,NNumber pTaxableAmt,NString pPayTaxTo,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_TAXABLE_AMT", pTaxableAmt);
			cmd.addParameter("@P_PAY_TAX_TO", pPayTaxTo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NNumber pPriorityNum,NString pTratCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteByItem(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.P_DELETE_BY_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();


		}
		
		public static void pLock(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NNumber pPriorityNum,NString pTratCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NNumber pPriorityNum,NString pTratCode,NNumber pTaxAmt,NNumber pTaxableAmt,NString pPayTaxTo,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POHD_CODE", pPohdCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_TRAT_CODE", pTratCode);
			cmd.addParameter("@P_TAX_AMT", pTaxAmt);
			cmd.addParameter("@P_TAXABLE_AMT", pTaxableAmt);
			cmd.addParameter("@P_PAY_TAX_TO", pPayTaxTo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PoTaxRecRow", dataSourceName="PO_TAX_REC")
	public static class PoTaxRecRow
	{
		@DbRecordField(dataSourceName="R_POHD_CODE")
		public NString RPohdCode;
		@DbRecordField(dataSourceName="R_ITEM")
		public NNumber RItem;
		@DbRecordField(dataSourceName="R_CHANGE_SEQ_NUM")
		public NNumber RChangeSeqNum;
		@DbRecordField(dataSourceName="R_PRIORITY_NUM")
		public NNumber RPriorityNum;
		@DbRecordField(dataSourceName="R_TRAT_CODE")
		public NString RTratCode;
		@DbRecordField(dataSourceName="R_TAX_AMT")
		public NNumber RTaxAmt;
		@DbRecordField(dataSourceName="R_TAXABLE_AMT")
		public NNumber RTaxableAmt;
		@DbRecordField(dataSourceName="R_PAY_TAX_TO")
		public NString RPayTaxTo;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
