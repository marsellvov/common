package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkstot {
		public static void pCalctotalorgninfo(NNumber pidmIn,NString extractIn,NString scenarioIn,NString coasCodeIn,NDate jobsEffDateIn,NString orgnIn,NString predOrgnIn,NString addSuborgs,Ref<NNumber> sumBaseBudget,Ref<NNumber> sumPropBudget,Ref<NNumber> sumPosnFte,Ref<NNumber> sumBaseSalary,Ref<NNumber> sumPropSalary,Ref<NNumber> sumJobFte,Ref<NNumber> sumSalChgamt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSTOT.P_CALCTOTALORGNINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@EXTRACT_IN", extractIn);
			cmd.addParameter("@SCENARIO_IN", scenarioIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@JOBS_EFF_DATE_IN", jobsEffDateIn);
			cmd.addParameter("@ORGN_IN", orgnIn);
			cmd.addParameter("@PRED_ORGN_IN", predOrgnIn);
			cmd.addParameter("@ADD_SUBORGS", addSuborgs);
			cmd.addParameter("@SUM_BASE_BUDGET", sumBaseBudget, true);
			cmd.addParameter("@SUM_PROP_BUDGET", sumPropBudget, true);
			cmd.addParameter("@SUM_POSN_FTE", sumPosnFte, true);
			cmd.addParameter("@SUM_BASE_SALARY", sumBaseSalary, true);
			cmd.addParameter("@SUM_PROP_SALARY", sumPropSalary, true);
			cmd.addParameter("@SUM_JOB_FTE", sumJobFte, true);
			cmd.addParameter("@SUM_SAL_CHGAMT", sumSalChgamt, true);
				
			cmd.execute();
			sumBaseBudget.val = cmd.getParameterValue("@SUM_BASE_BUDGET", NNumber.class);
			sumPropBudget.val = cmd.getParameterValue("@SUM_PROP_BUDGET", NNumber.class);
			sumPosnFte.val = cmd.getParameterValue("@SUM_POSN_FTE", NNumber.class);
			sumBaseSalary.val = cmd.getParameterValue("@SUM_BASE_SALARY", NNumber.class);
			sumPropSalary.val = cmd.getParameterValue("@SUM_PROP_SALARY", NNumber.class);
			sumJobFte.val = cmd.getParameterValue("@SUM_JOB_FTE", NNumber.class);
			sumSalChgamt.val = cmd.getParameterValue("@SUM_SAL_CHGAMT", NNumber.class);


		}
		
		public static void pDispsumtotals(NString extract,NString scenario,NString orgnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSTOT.P_DISPSUMTOTALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@ORGN_CODE", orgnCode);
				
			cmd.execute();


		}
		
	
	
	
}
