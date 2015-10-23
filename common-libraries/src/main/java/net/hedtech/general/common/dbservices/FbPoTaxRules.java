package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbPoTaxRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NNumber pPriorityNum,NString pTratCode,NNumber pTaxAmt,NNumber pTaxableAmt,NString pPayTaxTo,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pPohdCode,NNumber pItem,NNumber pChangeSeqNum,NNumber pPriorityNum,NString pTratCode,NNumber pTaxAmt,NNumber pTaxableAmt,NString pPayTaxTo,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PO_TAX_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
