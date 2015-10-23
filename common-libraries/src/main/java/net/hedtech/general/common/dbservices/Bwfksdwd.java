package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfksdwd {
		public static void csv(NString coasCode,NString coasTitle,NString budgetId,NString budgetTitle,NString budgetPhase,NString phaseTitle,NString ftypCode,NString ftypTitle,NString fundCode,NString fundTitle,NString orgnCode,NString orgnTitle,NString acctCode,NString acctTitle,NString progCode,NString progTitle,NString actvCode,NString actvTitle,NString locnCode,NString locnTitle,NString finMgrInd,NString fmgrPidm,NString fmgrTitle,NString fmgrFirstName,NString fmgrMiName,NString fmgrLastName,NDate asofdate,NString adoptedbudget,NString permbudget,NString tempadopt,NString tempadjust,NString includedel,NString inclRevenueAtyp,NString inclLaborAtyp,NString inclExpAtyp,NString inclTransfAtyp,NString durationcode,NString downld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKSDWD.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@COAS_TITLE", coasTitle);
			cmd.addParameter("@BUDGET_ID", budgetId);
			cmd.addParameter("@BUDGET_TITLE", budgetTitle);
			cmd.addParameter("@BUDGET_PHASE", budgetPhase);
			cmd.addParameter("@PHASE_TITLE", phaseTitle);
			cmd.addParameter("@FTYP_CODE", ftypCode);
			cmd.addParameter("@FTYP_TITLE", ftypTitle);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FUND_TITLE", fundTitle);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@ORGN_TITLE", orgnTitle);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@ACCT_TITLE", acctTitle);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@PROG_TITLE", progTitle);
			cmd.addParameter("@ACTV_CODE", actvCode);
			cmd.addParameter("@ACTV_TITLE", actvTitle);
			cmd.addParameter("@LOCN_CODE", locnCode);
			cmd.addParameter("@LOCN_TITLE", locnTitle);
			cmd.addParameter("@FIN_MGR_IND", finMgrInd);
			cmd.addParameter("@FMGR_PIDM", fmgrPidm);
			cmd.addParameter("@FMGR_TITLE", fmgrTitle);
			cmd.addParameter("@FMGR_FIRST_NAME", fmgrFirstName);
			cmd.addParameter("@FMGR_MI_NAME", fmgrMiName);
			cmd.addParameter("@FMGR_LAST_NAME", fmgrLastName);
			cmd.addParameter("@ASOFDATE", asofdate);
			cmd.addParameter("@ADOPTEDBUDGET", adoptedbudget);
			cmd.addParameter("@PERMBUDGET", permbudget);
			cmd.addParameter("@TEMPADOPT", tempadopt);
			cmd.addParameter("@TEMPADJUST", tempadjust);
			cmd.addParameter("@INCLUDEDEL", includedel);
			cmd.addParameter("@INCL_REVENUE_ATYP", inclRevenueAtyp);
			cmd.addParameter("@INCL_LABOR_ATYP", inclLaborAtyp);
			cmd.addParameter("@INCL_EXP_ATYP", inclExpAtyp);
			cmd.addParameter("@INCL_TRANSF_ATYP", inclTransfAtyp);
			cmd.addParameter("@DURATIONCODE", durationcode);
			cmd.addParameter("@DOWNLD", downld);
				
			cmd.execute();


		}
		
	
	
	
}
