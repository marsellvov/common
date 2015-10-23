package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Edbhempl {
		public static NNumber fCalcBasedOnTermDate(NDate pTermDate,NNumber pYears,Ref<NDate> pDispDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBHEMPL.F_CALC_BASED_ON_TERM_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_YEARS", pYears);
			cmd.addParameter("@P_DISP_DATE", NDate.class);
				
			cmd.execute();
			pDispDate.val = cmd.getParameterValue("@P_DISP_DATE", NDate.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fEmployed(NString pPidm,NDate pTerminationDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBHEMPL.F_EMPLOYED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERMINATION_DATE", pTerminationDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fTerminated(NString pPidm,NDate pTerminationDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBHEMPL.F_TERMINATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERMINATION_DATE", pTerminationDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pGetEmpAttributes(NString pPidm,Ref<NString> pEmpStatus,Ref<NDate> pTerminationDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EDBHEMPL.P_GET_EMP_ATTRIBUTES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMP_STATUS", NString.class);
			cmd.addParameter("@P_TERMINATION_DATE", NDate.class);
				
			cmd.execute();
			pEmpStatus.val = cmd.getParameterValue("@P_EMP_STATUS", NString.class);
			pTerminationDate.val = cmd.getParameterValue("@P_TERMINATION_DATE", NDate.class);


		}
		
	
	
	
}
