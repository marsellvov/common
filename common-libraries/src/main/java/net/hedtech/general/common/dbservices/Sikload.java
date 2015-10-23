package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sikload {
		public static NString fActiveLimit(NNumber pPidm,NString pTermCode,NString pAstyCode,NString pNistCode,NString pNoninstructInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLOAD.F_ACTIVE_LIMIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ASTY_CODE", pAstyCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_NONINSTRUCT_IND", pNoninstructInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCalcWorkload(NNumber pWorkloadBase,NNumber pPercentResponse,NNumber pWorkloadIncrement) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLOAD.F_CALC_WORKLOAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_WORKLOAD_BASE", pWorkloadBase);
			cmd.addParameter("@P_PERCENT_RESPONSE", pPercentResponse);
			cmd.addParameter("@P_WORKLOAD_INCREMENT", pWorkloadIncrement);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcWorkloadBase(NString pTermCode,NString pCrn,NString pSubjCode,NString pCrseNumb,NString pCategory,NNumber pWorkloadAdjust) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLOAD.F_CALC_WORKLOAD_BASE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_WORKLOAD_ADJUST", pWorkloadAdjust);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fFteFactor(NString pTermCode,NString pCrn,NString pSubjCode,NString pFstpCode,NString pCollCode,NString pDivsCode,NString pDeptCode,NString pCategory,NString pNoninstructInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKLOAD.F_FTE_FACTOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_FSTP_CODE", pFstpCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DIVS_CODE", pDivsCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_NONINSTRUCT_IND", pNoninstructInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
