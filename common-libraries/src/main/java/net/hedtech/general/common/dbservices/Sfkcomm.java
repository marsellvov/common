package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkcomm {
		public static void pSfkcmplSubmit(NNumber sfOneUpNo,NString sfRunmode,NNumber sfPidm,NNumber sfNewRequestNo,Ref<NNumber> sfStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKCOMM.P_SFKCMPL_SUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SF_ONE_UP_NO", sfOneUpNo);
			cmd.addParameter("@SF_RUNMODE", sfRunmode);
			cmd.addParameter("@SF_PIDM", sfPidm);
			cmd.addParameter("@SF_NEW_REQUEST_NO", sfNewRequestNo);
			cmd.addParameter("@SF_STATUS", NNumber.class);
				
			cmd.execute();
			sfStatus.val = cmd.getParameterValue("@SF_STATUS", NNumber.class);


		}
		
	
	
	
}
