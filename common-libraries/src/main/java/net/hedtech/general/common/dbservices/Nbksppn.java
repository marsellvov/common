package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbksppn {
		public static NNumber fEpldTotal(NString pSpexCode,NString pScenario,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKSPPN.F_EPLD_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SPEX_CODE", pSpexCode);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fFobsyscWbudInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKSPPN.F_FOBSYSC_WBUD_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pNbrehdrInfo(NString pSpexCode,NString pScenario,NString pCoasCode,Ref<NString> pObudCode,Ref<NString> pObphCode,Ref<NString> pPostToBudPoolInd,Ref<NDate> pFiscBeginDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKSPPN.P_NBREHDR_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SPEX_CODE", pSpexCode);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_OBUD_CODE", pObudCode, true);
			cmd.addParameter("@P_OBPH_CODE", pObphCode, true);
			cmd.addParameter("@P_POST_TO_BUD_POOL_IND", pPostToBudPoolInd, true);
			cmd.addParameter("@P_FISC_BEGIN_DATE", pFiscBeginDate, true);
				
			cmd.execute();
			pObudCode.val = cmd.getParameterValue("@P_OBUD_CODE", NString.class);
			pObphCode.val = cmd.getParameterValue("@P_OBPH_CODE", NString.class);
			pPostToBudPoolInd.val = cmd.getParameterValue("@P_POST_TO_BUD_POOL_IND", NString.class);
			pFiscBeginDate.val = cmd.getParameterValue("@P_FISC_BEGIN_DATE", NDate.class);


		}
		
		public static void pUpdSalPlnrPosnChgAmt(NString pExtract,NString pScenario,NNumber pPidm,NString pPosn,NString pSuff,NNumber pChangePercent,NNumber pChangeAmt,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKSPPN.P_UPD_SAL_PLNR_POSN_CHG_AMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_CHANGE_PERCENT", pChangePercent);
			cmd.addParameter("@P_CHANGE_AMT", pChangeAmt);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdSalPlnrPosnFte(NString pExtract,NString pScenario,NString pPosn,NNumber pFteProposed,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKSPPN.P_UPD_SAL_PLNR_POSN_FTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_FTE_PROPOSED", pFteProposed);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	
}
