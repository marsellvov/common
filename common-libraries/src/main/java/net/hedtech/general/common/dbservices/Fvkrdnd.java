package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fvkrdnd {
		public static void pAdjustFarintx(NString pInvoiceNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FARINTX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_NUM", pInvoiceNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFarintxItem(NString pInvoiceNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FARINTX_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_NUM", pInvoiceNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFarinva(NString pInvoiceNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FARINVA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_NUM", pInvoiceNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFarinvaItem(NString pInvoiceNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FARINVA_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_NUM", pInvoiceNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFarinvc(NString pInvoiceNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FARINVC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_NUM", pInvoiceNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFarinvcItem(NString pInvoiceNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FARINVC_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_NUM", pInvoiceNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFprpoda(NString pPurOrdNum,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FPRPODA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PUR_ORD_NUM", pPurOrdNum);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFprpodaItem(NString pPurOrdNum,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FPRPODA_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PUR_ORD_NUM", pPurOrdNum);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFprpodt(NString pPurOrdNum,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FPRPODT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PUR_ORD_NUM", pPurOrdNum);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFprpodtItem(NString pPurOrdNum,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FPRPODT_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PUR_ORD_NUM", pPurOrdNum);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFprreqa(NString pRequisitionNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FPRREQA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUISITION_NUM", pRequisitionNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFprreqaItem(NString pRequisitionNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FPRREQA_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUISITION_NUM", pRequisitionNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFprreqd(NString pRequisitionNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FPRREQD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUISITION_NUM", pRequisitionNum);
				
			cmd.execute();


		}
		
		public static void pAdjustFprreqdItem(NString pRequisitionNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ADJUST_FPRREQD_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUISITION_NUM", pRequisitionNum);
				
			cmd.execute();


		}
		
		public static void pOrderRoundAmount(NString pPurOrdNum,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ORDER_ROUND_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PUR_ORD_NUM", pPurOrdNum);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();


		}
		
		public static void pOrderRoundAmountItem(NString pPurOrdNum,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ORDER_ROUND_AMOUNT_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PUR_ORD_NUM", pPurOrdNum);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();


		}
		
		public static void pReqRoundAmount(NString pRequisitionNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_REQ_ROUND_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUISITION_NUM", pRequisitionNum);
				
			cmd.execute();


		}
		
		public static void pReqRoundAmountItem(NString pRequisitionNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_REQ_ROUND_AMOUNT_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUISITION_NUM", pRequisitionNum);
				
			cmd.execute();


		}
		
		public static void pRoundAmount(NString pInvoiceNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ROUND_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_NUM", pInvoiceNum);
				
			cmd.execute();


		}
		
		public static void pRoundAmountItem(NString pInvoiceNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKRDND.P_ROUND_AMOUNT_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INVOICE_NUM", pInvoiceNum);
				
			cmd.execute();


		}
		
	
	
	
}
