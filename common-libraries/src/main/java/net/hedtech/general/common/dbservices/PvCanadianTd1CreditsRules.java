package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvCanadianTd1CreditsRules {
		public static NString fParentExists(NString pTgrpCode,NString pTxcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTgrpCode,NString pTxcdCode,NString pTcrdCode,NString pLineNo,NNumber pLineNoNumeric,NNumber pRangeLow,NNumber pRangeHigh,NString pDednInd,NString pDednType,NString pWebEntryInd,NString pExplanation,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_LINE_NO", pLineNo);
			cmd.addParameter("@P_LINE_NO_NUMERIC", pLineNoNumeric);
			cmd.addParameter("@P_RANGE_LOW", pRangeLow);
			cmd.addParameter("@P_RANGE_HIGH", pRangeHigh);
			cmd.addParameter("@P_DEDN_IND", pDednInd);
			cmd.addParameter("@P_DEDN_TYPE", pDednType);
			cmd.addParameter("@P_WEB_ENTRY_IND", pWebEntryInd);
			cmd.addParameter("@P_EXPLANATION", pExplanation);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTgrpCode,NString pTxcdCode,NString pTcrdCode,NString pLineNo,NNumber pLineNoNumeric,NNumber pRangeLow,NNumber pRangeHigh,NString pDednInd,NString pDednType,NString pWebEntryInd,NString pExplanation,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_CREDITS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_LINE_NO", pLineNo);
			cmd.addParameter("@P_LINE_NO_NUMERIC", pLineNoNumeric);
			cmd.addParameter("@P_RANGE_LOW", pRangeLow);
			cmd.addParameter("@P_RANGE_HIGH", pRangeHigh);
			cmd.addParameter("@P_DEDN_IND", pDednInd);
			cmd.addParameter("@P_DEDN_TYPE", pDednType);
			cmd.addParameter("@P_WEB_ENTRY_IND", pWebEntryInd);
			cmd.addParameter("@P_EXPLANATION", pExplanation);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
