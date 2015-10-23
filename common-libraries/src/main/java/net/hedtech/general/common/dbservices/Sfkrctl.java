package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkrctl {
		public static NBool fCheckMgmtControl(NNumber pidmIn,NString termIn,NString webVrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKRCTL.F_CHECK_MGMT_CONTROL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@WEB_VR_IN", webVrIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckRegAppointment(NNumber pidm,NString term,NString useMgmtControl,NString restrictTimeTicket,NString webVrInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKRCTL.F_CHECK_REG_APPOINTMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@USE_MGMT_CONTROL", useMgmtControl);
			cmd.addParameter("@RESTRICT_TIME_TICKET", restrictTimeTicket);
			cmd.addParameter("@WEB_VR_IND", webVrInd);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckTimeTicket(NNumber pidmIn,NString termIn,NDate regDate,NString flagValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKRCTL.F_CHECK_TIME_TICKET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@REG_DATE", regDate);
			cmd.addParameter("@FLAG_VALUE", flagValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
