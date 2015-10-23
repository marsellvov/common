package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbMemoRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pTranNumber,NString pTermCode,NString pDetailCode,NNumber pAmount,NString pUser,NDate pEntryDate,NString pBillingInd,NString pDesc,NDate pReleaseDate,NDate pExpirationDate,NDate pEffectiveDate,NString pSrceCode,NNumber pCrossrefPidm,NNumber pCrossrefNumber,NString pCrossrefDetailCode,NString pCrossrefSrceCode,NString pAtypCode,NNumber pAtypSeqno,NString pDataOrigin,NString pCreateUser,NString pCrossrefDcatCode,NString pAidyCode,NString pPeriod,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ENTRY_DATE", pEntryDate);
			cmd.addParameter("@P_BILLING_IND", pBillingInd);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_RELEASE_DATE", pReleaseDate);
			cmd.addParameter("@P_EXPIRATION_DATE", pExpirationDate);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCE_CODE", pSrceCode);
			cmd.addParameter("@P_CROSSREF_PIDM", pCrossrefPidm);
			cmd.addParameter("@P_CROSSREF_NUMBER", pCrossrefNumber);
			cmd.addParameter("@P_CROSSREF_DETAIL_CODE", pCrossrefDetailCode);
			cmd.addParameter("@P_CROSSREF_SRCE_CODE", pCrossrefSrceCode);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CROSSREF_DCAT_CODE", pCrossrefDcatCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidCreate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO_RULES.P_VALID_CREATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidUpdate(Ref<TbMemo.MemoRecRow> lvValidationRecInout,TbMemo.MemoRecRow lvExistingRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO_RULES.P_VALID_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("LV_VALIDATION_REC_INOUT", lvValidationRecInout.val, TbMemo.MemoRecRow.class, true));
			cmd.addParameter(DbTypes.createStructType("LV_EXISTING_REC", lvExistingRec, TbMemo.MemoRecRow.class ));
				
			cmd.execute();
			lvValidationRecInout.val = cmd.getParameterValue("@LV_VALIDATION_REC_INOUT", TbMemo.MemoRecRow.class);


		}
		
	
	
	
}
