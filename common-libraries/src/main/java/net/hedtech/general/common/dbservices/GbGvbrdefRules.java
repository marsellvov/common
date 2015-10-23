package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvbrdefRules {
		public static NString fParentExistsGvrsdef(NNumber pSdefSeqNum,NString pGsrcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF_RULES.F_PARENT_EXISTS_GVRSDEF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pRuleCode,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NNumber pLineNum,NString pOperator,NString pValue,NString pOpenParen,NString pCloseParen,NString pSeparator,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_LINE_NUM", pLineNum);
			cmd.addParameter("@P_OPERATOR", pOperator);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_OPEN_PAREN", pOpenParen);
			cmd.addParameter("@P_CLOSE_PAREN", pCloseParen);
			cmd.addParameter("@P_SEPARATOR", pSeparator);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pRuleCode,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NNumber pLineNum,NString pOperator,NString pValue,NString pOpenParen,NString pCloseParen,NString pSeparator,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_LINE_NUM", pLineNum);
			cmd.addParameter("@P_OPERATOR", pOperator);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_OPEN_PAREN", pOpenParen);
			cmd.addParameter("@P_CLOSE_PAREN", pCloseParen);
			cmd.addParameter("@P_SEPARATOR", pSeparator);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
