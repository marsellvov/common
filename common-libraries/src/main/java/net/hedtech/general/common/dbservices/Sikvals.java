package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sikvals {
		public static void pCheckSiaasgn(Ref<NString> parErrMsg,Ref<NNumber> parCounter,NDate parStartTerm,NDate parEndTerm,NNumber parPidm,NString parPosn,NString parSuff,NString parEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKVALS.P_CHECK_SIAASGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ERR_MSG", parErrMsg, true);
			cmd.addParameter("@PAR_COUNTER", parCounter, true);
			cmd.addParameter("@PAR_START_TERM", parStartTerm);
			cmd.addParameter("@PAR_END_TERM", parEndTerm);
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_END_DATE", parEndDate);
				
			cmd.execute();
			parErrMsg.val = cmd.getParameterValue("@PAR_ERR_MSG", NString.class);
			parCounter.val = cmd.getParameterValue("@PAR_COUNTER", NNumber.class);


		}
		
		public static void pCheckSialvas(Ref<NString> parErrMsg,Ref<NNumber> parCounter,NDate parStartTerm,NDate parEndTerm,NNumber parPidm,NString parPosn,NString parSuff,NString parEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKVALS.P_CHECK_SIALVAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ERR_MSG", parErrMsg, true);
			cmd.addParameter("@PAR_COUNTER", parCounter, true);
			cmd.addParameter("@PAR_START_TERM", parStartTerm);
			cmd.addParameter("@PAR_END_TERM", parEndTerm);
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_END_DATE", parEndDate);
				
			cmd.execute();
			parErrMsg.val = cmd.getParameterValue("@PAR_ERR_MSG", NString.class);
			parCounter.val = cmd.getParameterValue("@PAR_COUNTER", NNumber.class);


		}
		
	
	
	
}
