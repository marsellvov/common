package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCourseLaborRules {
		public static NString fParentExists(NString pSubjCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pSubjCode,NString pCrseNumb,NString pTermCodeEff,NNumber pSeqNo,NNumber pPercent,NString pUserId,NString pDataOrigin,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pCtypCode,NString pAcctExternalCde,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ACCT_EXTERNAL_CDE", pAcctExternalCde);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff,NNumber pSeqNo,NNumber pPercent,NString pUserId,NString pDataOrigin,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pCtypCode,NString pAcctExternalCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ACCT_EXTERNAL_CDE", pAcctExternalCde);
				
			cmd.execute();


		}
		
	
	
	
}
