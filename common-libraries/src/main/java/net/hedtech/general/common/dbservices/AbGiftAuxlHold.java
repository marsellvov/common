package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbGiftAuxlHold {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GiftAuxlHoldRecRow recOne,GiftAuxlHoldRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GiftAuxlHoldRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GiftAuxlHoldRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pId,NString pGiftNo,NString pAuxlCode,NString pAuxlDesc,NNumber pDcprCost,NString pUserId,NString pDataOrigin,NDate pAuxlValueDate,NNumber pPidm,NString pDcprCode,NDate pIssueDate,NNumber pDcprValue,NString pDesc,NString pAccRejInd,NDate pAccRejDate,NString pDonrCode,NString pPrefClas,NString pDeductForTaxes,NString pComment) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_AUXL_CODE", pAuxlCode);
			cmd.addParameter("@P_AUXL_DESC", pAuxlDesc);
			cmd.addParameter("@P_DCPR_COST", pDcprCost);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_AUXL_VALUE_DATE", pAuxlValueDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DCPR_CODE", pDcprCode);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_DCPR_VALUE", pDcprValue);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_ACC_REJ_IND", pAccRejInd);
			cmd.addParameter("@P_ACC_REJ_DATE", pAccRejDate);
			cmd.addParameter("@P_DONR_CODE", pDonrCode);
			cmd.addParameter("@P_PREF_CLAS", pPrefClas);
			cmd.addParameter("@P_DEDUCT_FOR_TAXES", pDeductForTaxes);
			cmd.addParameter("@P_COMMENT", pComment);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pId,NString pGiftNo,NString pAuxlCode,NString pAuxlDesc,NNumber pDcprCost,NString pUserId,NString pDataOrigin,NDate pAuxlValueDate,NNumber pPidm,NString pDcprCode,NDate pIssueDate,NNumber pDcprValue,NString pDesc,NString pAccRejInd,NDate pAccRejDate,NString pDonrCode,NString pPrefClas,NString pDeductForTaxes,NString pComment) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_AUXL_CODE", pAuxlCode);
			cmd.addParameter("@P_AUXL_DESC", pAuxlDesc);
			cmd.addParameter("@P_DCPR_COST", pDcprCost);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_AUXL_VALUE_DATE", pAuxlValueDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DCPR_CODE", pDcprCode);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_DCPR_VALUE", pDcprValue);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_ACC_REJ_IND", pAccRejInd);
			cmd.addParameter("@P_ACC_REJ_DATE", pAccRejDate);
			cmd.addParameter("@P_DONR_CODE", pDonrCode);
			cmd.addParameter("@P_PREF_CLAS", pPrefClas);
			cmd.addParameter("@P_DEDUCT_FOR_TAXES", pDeductForTaxes);
			cmd.addParameter("@P_COMMENT", pComment);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pId,NString pGiftNo,NString pAuxlCode,NString pAuxlDesc,NNumber pDcprCost,NString pUserId,NString pDataOrigin,NDate pAuxlValueDate,NNumber pPidm,NString pDcprCode,NDate pIssueDate,NNumber pDcprValue,NString pDesc,NString pAccRejInd,NDate pAccRejDate,NString pDonrCode,NString pPrefClas,NString pDeductForTaxes,NString pComment,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_AUXL_CODE", pAuxlCode);
			cmd.addParameter("@P_AUXL_DESC", pAuxlDesc);
			cmd.addParameter("@P_DCPR_COST", pDcprCost);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_AUXL_VALUE_DATE", pAuxlValueDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DCPR_CODE", pDcprCode);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_DCPR_VALUE", pDcprValue);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_ACC_REJ_IND", pAccRejInd);
			cmd.addParameter("@P_ACC_REJ_DATE", pAccRejDate);
			cmd.addParameter("@P_DONR_CODE", pDonrCode);
			cmd.addParameter("@P_PREF_CLAS", pPrefClas);
			cmd.addParameter("@P_DEDUCT_FOR_TAXES", pDeductForTaxes);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pId,NString pGiftNo,NString pAuxlCode,NString pAuxlDesc,NNumber pDcprCost,NString pUserId,NString pDataOrigin,NDate pAuxlValueDate,NNumber pPidm,NString pDcprCode,NDate pIssueDate,NNumber pDcprValue,NString pDesc,NString pAccRejInd,NDate pAccRejDate,NString pDonrCode,NString pPrefClas,NString pDeductForTaxes,NString pComment,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_AUXL_CODE", pAuxlCode);
			cmd.addParameter("@P_AUXL_DESC", pAuxlDesc);
			cmd.addParameter("@P_DCPR_COST", pDcprCost);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_AUXL_VALUE_DATE", pAuxlValueDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DCPR_CODE", pDcprCode);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_DCPR_VALUE", pDcprValue);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_ACC_REJ_IND", pAccRejInd);
			cmd.addParameter("@P_ACC_REJ_DATE", pAccRejDate);
			cmd.addParameter("@P_DONR_CODE", pDonrCode);
			cmd.addParameter("@P_PREF_CLAS", pPrefClas);
			cmd.addParameter("@P_DEDUCT_FOR_TAXES", pDeductForTaxes);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pId,NString pGiftNo,NString pAuxlCode,NString pAuxlDesc,NNumber pDcprCost,NString pUserId,NString pDataOrigin,NDate pAuxlValueDate,NNumber pPidm,NString pDcprCode,NDate pIssueDate,NNumber pDcprValue,NString pDesc,NString pAccRejInd,NDate pAccRejDate,NString pDonrCode,NString pPrefClas,NString pDeductForTaxes,NString pComment,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_AUXL_CODE", pAuxlCode);
			cmd.addParameter("@P_AUXL_DESC", pAuxlDesc);
			cmd.addParameter("@P_DCPR_COST", pDcprCost);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_AUXL_VALUE_DATE", pAuxlValueDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DCPR_CODE", pDcprCode);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_DCPR_VALUE", pDcprValue);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_ACC_REJ_IND", pAccRejInd);
			cmd.addParameter("@P_ACC_REJ_DATE", pAccRejDate);
			cmd.addParameter("@P_DONR_CODE", pDonrCode);
			cmd.addParameter("@P_PREF_CLAS", pPrefClas);
			cmd.addParameter("@P_DEDUCT_FOR_TAXES", pDeductForTaxes);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pId,NString pGiftNo,NString pAuxlCode,NString pAuxlDesc,NNumber pDcprCost,NString pUserId,NString pDataOrigin,NDate pAuxlValueDate,NNumber pPidm,NString pDcprCode,NDate pIssueDate,NNumber pDcprValue,NString pDesc,NString pAccRejInd,NDate pAccRejDate,NString pDonrCode,NString pPrefClas,NString pDeductForTaxes,NString pComment,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_GIFT_AUXL_HOLD.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_GIFT_NO", pGiftNo);
			cmd.addParameter("@P_AUXL_CODE", pAuxlCode);
			cmd.addParameter("@P_AUXL_DESC", pAuxlDesc);
			cmd.addParameter("@P_DCPR_COST", pDcprCost);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_AUXL_VALUE_DATE", pAuxlValueDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DCPR_CODE", pDcprCode);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_DCPR_VALUE", pDcprValue);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_ACC_REJ_IND", pAccRejInd);
			cmd.addParameter("@P_ACC_REJ_DATE", pAccRejDate);
			cmd.addParameter("@P_DONR_CODE", pDonrCode);
			cmd.addParameter("@P_PREF_CLAS", pPrefClas);
			cmd.addParameter("@P_DEDUCT_FOR_TAXES", pDeductForTaxes);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GiftAuxlHoldRecRow", dataSourceName="GIFT_AUXL_HOLD_REC")
	public static class GiftAuxlHoldRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NString RId;
		@DbRecordField(dataSourceName="R_GIFT_NO")
		public NString RGiftNo;
		@DbRecordField(dataSourceName="R_AUXL_CODE")
		public NString RAuxlCode;
		@DbRecordField(dataSourceName="R_AUXL_DESC")
		public NString RAuxlDesc;
		@DbRecordField(dataSourceName="R_DCPR_COST")
		public NNumber RDcprCost;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_AUXL_VALUE_DATE")
		public NDate RAuxlValueDate;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_DCPR_CODE")
		public NString RDcprCode;
		@DbRecordField(dataSourceName="R_ISSUE_DATE")
		public NDate RIssueDate;
		@DbRecordField(dataSourceName="R_DCPR_VALUE")
		public NNumber RDcprValue;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_ACC_REJ_IND")
		public NString RAccRejInd;
		@DbRecordField(dataSourceName="R_ACC_REJ_DATE")
		public NDate RAccRejDate;
		@DbRecordField(dataSourceName="R_DONR_CODE")
		public NString RDonrCode;
		@DbRecordField(dataSourceName="R_PREF_CLAS")
		public NString RPrefClas;
		@DbRecordField(dataSourceName="R_DEDUCT_FOR_TAXES")
		public NString RDeductForTaxes;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
