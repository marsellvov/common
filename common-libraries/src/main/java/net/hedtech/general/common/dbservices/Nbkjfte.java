package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkjfte {
		public static void calcJfteInfo(NNumber budgBasis,NNumber annBasis,NNumber baseUnits,NNumber jobApptPct,NNumber jobAssgnSalary,Ref<NNumber> annFte,Ref<NNumber> baseSalary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJFTE.CALC_JFTE_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUDG_BASIS", budgBasis);
			cmd.addParameter("@ANN_BASIS", annBasis);
			cmd.addParameter("@BASE_UNITS", baseUnits);
			cmd.addParameter("@JOB_APPT_PCT", jobApptPct);
			cmd.addParameter("@JOB_ASSGN_SALARY", jobAssgnSalary);
			cmd.addParameter("@ANN_FTE", annFte, true);
			cmd.addParameter("@BASE_SALARY", baseSalary, true);
				
			cmd.execute();
			annFte.val = cmd.getParameterValue("@ANN_FTE", NNumber.class);
			baseSalary.val = cmd.getParameterValue("@BASE_SALARY", NNumber.class);


		}
		
		public static void pDeleteJobFte(NNumber parPidm,NString parPosn,NString parSuff,NDate parEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJFTE.P_DELETE_JOB_FTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
				
			cmd.execute();


		}
		
		public static void pInsertJobFte(NNumber parPidm,NString parPosn,NString parSuff,NDate parEffectiveDate,NDate parFteEffectiveDate,NString parCoas,NNumber parApptPct,NNumber parAssgnSalary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJFTE.P_INSERT_JOB_FTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
			cmd.addParameter("@PAR_FTE_EFFECTIVE_DATE", parFteEffectiveDate);
			cmd.addParameter("@PAR_COAS", parCoas);
			cmd.addParameter("@PAR_APPT_PCT", parApptPct);
			cmd.addParameter("@PAR_ASSGN_SALARY", parAssgnSalary);
				
			cmd.execute();


		}
		
		public static void pUpdateJobFte(NNumber parPidm,NString parPosn,NString parSuff,NDate parEffectiveDate,NString parCoas,NDate parFteEffectiveDate,NNumber parApptPct,NNumber parAssgnSalary) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJFTE.P_UPDATE_JOB_FTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
			cmd.addParameter("@PAR_COAS", parCoas);
			cmd.addParameter("@PAR_FTE_EFFECTIVE_DATE", parFteEffectiveDate);
			cmd.addParameter("@PAR_APPT_PCT", parApptPct);
			cmd.addParameter("@PAR_ASSGN_SALARY", parAssgnSalary);
				
			cmd.execute();


		}
		
	
	
	
}
