package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fbkspbd {
		public static NString fAcctCodePool(NString pCoasCode,NString pAcctCode,NDate pFiscBeginDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKSPBD.F_ACCT_CODE_POOL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_FISC_BEGIN_DATE", pFiscBeginDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fAudtSeqNum(NString pCoasCode,NString pObudCode,NString pObphCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKSPBD.F_AUDT_SEQ_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_OBUD_CODE", pObudCode);
			cmd.addParameter("@P_OBPH_CODE", pObphCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fHumanreInstalled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKSPBD.F_HUMANRE_INSTALLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pDefaultBudgetDevl(NString pProcessMode,NString pTemplateName,NString pUserId,NString pPopSelInd,NString pApplication,NString pSelection,NString pCreatorId,Ref<List<TemplateTabtypeRow>> pTemplateTabOut,Ref<List<GbCommonStrings.ErrmsgTabTypeRow>> pUpdUserIdTabOut,Ref<List<GbCommonStrings.ErrmsgTabTypeRow>> pInsUserIdTabOut,Ref<List<GbCommonStrings.ErrmsgTabTypeRow>> pErrmsgTabOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKSPBD.P_DEFAULT_BUDGET_DEVL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PROCESS_MODE", pProcessMode);
//			cmd.addParameter("@P_TEMPLATE_NAME", pTemplateName);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_POP_SEL_IND", pPopSelInd);
//			cmd.addParameter("@P_APPLICATION", pApplication);
//			cmd.addParameter("@P_SELECTION", pSelection);
//			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
//			// cmd.addParameter(DbTypes.getTableType("P_TEMPLATE_TAB_OUT", "", pTemplateTabOut.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("P_UPD_USER_ID_TAB_OUT", "", pUpdUserIdTabOut.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("P_INS_USER_ID_TAB_OUT", "", pInsUserIdTabOut.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("P_ERRMSG_TAB_OUT", "", pErrmsgTabOut.val, object.class , true));
//				
//			cmd.execute();
//			// pTemplateTabOut.val = cmd.getTableParameterValue("@P_TEMPLATE_TAB_OUT", object.class);
//			// pUpdUserIdTabOut.val = cmd.getTableParameterValue("@P_UPD_USER_ID_TAB_OUT", object.class);
//			// pInsUserIdTabOut.val = cmd.getTableParameterValue("@P_INS_USER_ID_TAB_OUT", object.class);
//			// pErrmsgTabOut.val = cmd.getTableParameterValue("@P_ERRMSG_TAB_OUT", object.class);
//
//
//		}
		
		public static void pDoUpdBgtDev(NString pObudCode,NString pObphCode,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NNumber pBudgAmt,NString pSkipInsertInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKSPBD.P_DO_UPD_BGT_DEV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBUD_CODE", pObudCode);
			cmd.addParameter("@P_OBPH_CODE", pObphCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_BUDG_AMT", pBudgAmt);
			cmd.addParameter("@P_SKIP_INSERT_IND", pSkipInsertInd);
				
			cmd.execute();


		}
		
		public static void pInsertFbbblin(NString pObud,NString pCoas,NString pAcct,NString pFund,NString pObph,NNumber pBudgAmt,NString pOrgn,NString pProg,NString pActv,NString pLocn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKSPBD.P_INSERT_FBBBLIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBUD", pObud);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_ACCT", pAcct);
			cmd.addParameter("@P_FUND", pFund);
			cmd.addParameter("@P_OBPH", pObph);
			cmd.addParameter("@P_BUDG_AMT", pBudgAmt);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_PROG", pProg);
			cmd.addParameter("@P_ACTV", pActv);
			cmd.addParameter("@P_LOCN", pLocn);
				
			cmd.execute();


		}
		
		public static void pUpdBgtDev(NString pExtract,NString pScenario,NString pCoas,NString pFund,NString pOrgn,NString pAcct,NString pProg,NString pActv,NString pLocn,NNumber pBudgetProposed,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKSPBD.P_UPD_BGT_DEV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_FUND", pFund);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_ACCT", pAcct);
			cmd.addParameter("@P_PROG", pProg);
			cmd.addParameter("@P_ACTV", pActv);
			cmd.addParameter("@P_LOCN", pLocn);
			cmd.addParameter("@P_BUDGET_PROPOSED", pBudgetProposed);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdFbbblinBudgAmt(NString pObud,NString pCoas,NString pAcct,NString pFund,NString pObph,NNumber pBudgAmt,NString pOrgn,NString pProg,NString pActv,NString pLocn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKSPBD.P_UPD_FBBBLIN_BUDG_AMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBUD", pObud);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_ACCT", pAcct);
			cmd.addParameter("@P_FUND", pFund);
			cmd.addParameter("@P_OBPH", pObph);
			cmd.addParameter("@P_BUDG_AMT", pBudgAmt);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_PROG", pProg);
			cmd.addParameter("@P_ACTV", pActv);
			cmd.addParameter("@P_LOCN", pLocn);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TemplateRectypeRow", dataSourceName="TEMPLATE_RECTYPE")
	public static class TemplateRectypeRow
	{
		@DbRecordField(dataSourceName="R_NAME")
		public NString RName;
		@DbRecordField(dataSourceName="R_VALUE")
		public NString RValue;
	}

	
	
}
