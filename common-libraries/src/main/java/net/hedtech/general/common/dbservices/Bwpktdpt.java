package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpktdpt {
		public static void pDispApproverDeptAction(NNumber pPidm,NString pGobeaccUsername,NString pSelectedAction,NString pSelectedValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTDPT.P_DISP_APPROVER_DEPT_ACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_GOBEACC_USERNAME", pGobeaccUsername);
			cmd.addParameter("@P_SELECTED_ACTION", pSelectedAction);
			cmd.addParameter("@P_SELECTED_VALUE", pSelectedValue);
				
			cmd.execute();


		}
		
		public static void pDispApproverDptActionNjs(NNumber pPidm,NString pGobeaccUsername,NString pSelectedAction,NString pSelectedValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTDPT.P_DISP_APPROVER_DPT_ACTION_NJS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_GOBEACC_USERNAME", pGobeaccUsername);
			cmd.addParameter("@P_SELECTED_ACTION", pSelectedAction);
			cmd.addParameter("@P_SELECTED_VALUE", pSelectedValue);
				
			cmd.execute();


		}
		
	
	
	
}
