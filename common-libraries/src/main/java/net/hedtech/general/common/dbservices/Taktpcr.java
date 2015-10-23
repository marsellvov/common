package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Taktpcr {
		public static NString fTpContractCourseReq(NNumber vPidm,NString vTermCode,NNumber vStuPidm,NNumber vContractNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TAKTPCR.F_TP_CONTRACT_COURSE_REQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_PIDM", vPidm);
			cmd.addParameter("@V_TERM_CODE", vTermCode);
			cmd.addParameter("@V_STU_PIDM", vStuPidm);
			cmd.addParameter("@V_CONTRACT_NUMBER", vContractNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTpExemptionCourseReq(NString vExemptionCode,NString vTermCode,NNumber vStuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TAKTPCR.F_TP_EXEMPTION_COURSE_REQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_EXEMPTION_CODE", vExemptionCode);
			cmd.addParameter("@V_TERM_CODE", vTermCode);
			cmd.addParameter("@V_STU_PIDM", vStuPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
