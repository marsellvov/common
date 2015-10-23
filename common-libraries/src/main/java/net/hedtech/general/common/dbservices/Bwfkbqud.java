package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkbqud {
		public static NString fCreatelinkattributes(NString mouseovertitle,NString focustitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBQUD.F_CREATELINKATTRIBUTES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@MOUSEOVERTITLE", mouseovertitle);
			cmd.addParameter("@FOCUSTITLE", focustitle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBudgetQueryParm(NString complete,NString savedquery,NString adoptedbudget,NString permbudget,NString tempadopt,NString tempadjust,NString basebudget,NString lockstatus,NString newquery,NString shared,NString coas,NString budgetid,NString budgetphase,NString budgetid2,NString budgetphase2,NString acci,NString fund,NString orgn,NString program,NString account,NString activity,NString location,NString durationcode,NString finmanager,NString includerev,NString includelabor,NString includeexp,NString includetran,NString includedel,NString viewby,NString lookupCode,NString lookupValue,NString lookupAcciFund,NString lookupAcciOrgn,NString lookupAcciAcct,NString lookupAcciProg,NString lookupAcciActv,NString lookupAcciLocn,NString lookupBudget,NString lookupPhase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBQUD.P_BUDGET_QUERY_PARM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMPLETE", complete);
			cmd.addParameter("@SAVEDQUERY", savedquery);
			cmd.addParameter("@ADOPTEDBUDGET", adoptedbudget);
			cmd.addParameter("@PERMBUDGET", permbudget);
			cmd.addParameter("@TEMPADOPT", tempadopt);
			cmd.addParameter("@TEMPADJUST", tempadjust);
			cmd.addParameter("@BASEBUDGET", basebudget);
			cmd.addParameter("@LOCKSTATUS", lockstatus);
			cmd.addParameter("@NEWQUERY", newquery);
			cmd.addParameter("@SHARED", shared);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@BUDGETID", budgetid);
			cmd.addParameter("@BUDGETPHASE", budgetphase);
			cmd.addParameter("@BUDGETID2", budgetid2);
			cmd.addParameter("@BUDGETPHASE2", budgetphase2);
			cmd.addParameter("@ACCI", acci);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@ACCOUNT", account);
			cmd.addParameter("@ACTIVITY", activity);
			cmd.addParameter("@LOCATION", location);
			cmd.addParameter("@DURATIONCODE", durationcode);
			cmd.addParameter("@FINMANAGER", finmanager);
			cmd.addParameter("@INCLUDEREV", includerev);
			cmd.addParameter("@INCLUDELABOR", includelabor);
			cmd.addParameter("@INCLUDEEXP", includeexp);
			cmd.addParameter("@INCLUDETRAN", includetran);
			cmd.addParameter("@INCLUDEDEL", includedel);
			cmd.addParameter("@VIEWBY", viewby);
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@LOOKUP_VALUE", lookupValue);
			cmd.addParameter("@LOOKUP_ACCI_FUND", lookupAcciFund);
			cmd.addParameter("@LOOKUP_ACCI_ORGN", lookupAcciOrgn);
			cmd.addParameter("@LOOKUP_ACCI_ACCT", lookupAcciAcct);
			cmd.addParameter("@LOOKUP_ACCI_PROG", lookupAcciProg);
			cmd.addParameter("@LOOKUP_ACCI_ACTV", lookupAcciActv);
			cmd.addParameter("@LOOKUP_ACCI_LOCN", lookupAcciLocn);
			cmd.addParameter("@LOOKUP_BUDGET", lookupBudget);
			cmd.addParameter("@LOOKUP_PHASE", lookupPhase);
				
			cmd.execute();


		}
		
		public static void pDispsalplanmnu() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBQUD.P_DISPSALPLANMNU", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pWorksheetParm(NString complete,NString savedquery,NString adoptedbudget,NString permbudget,NString tempadopt,NString tempadjust,NString newquery,NString shared,NString coas,NString budgetid,NString budgetphase,NString acci,NString fund,NString orgn,NString program,NString account,NString activity,NString location,NString durationcode,NString finmanager,NString includerev,NString includelabor,NString includeexp,NString includetran,NString includedel,NString lookupCode,NString lookupValue,NString lookupAcciFund,NString lookupAcciOrgn,NString lookupAcciAcct,NString lookupAcciProg,NString lookupAcciActv,NString lookupAcciLocn,NString lookupBudget,NString lookupPhase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBQUD.P_WORKSHEET_PARM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMPLETE", complete);
			cmd.addParameter("@SAVEDQUERY", savedquery);
			cmd.addParameter("@ADOPTEDBUDGET", adoptedbudget);
			cmd.addParameter("@PERMBUDGET", permbudget);
			cmd.addParameter("@TEMPADOPT", tempadopt);
			cmd.addParameter("@TEMPADJUST", tempadjust);
			cmd.addParameter("@NEWQUERY", newquery);
			cmd.addParameter("@SHARED", shared);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@BUDGETID", budgetid);
			cmd.addParameter("@BUDGETPHASE", budgetphase);
			cmd.addParameter("@ACCI", acci);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@ACCOUNT", account);
			cmd.addParameter("@ACTIVITY", activity);
			cmd.addParameter("@LOCATION", location);
			cmd.addParameter("@DURATIONCODE", durationcode);
			cmd.addParameter("@FINMANAGER", finmanager);
			cmd.addParameter("@INCLUDEREV", includerev);
			cmd.addParameter("@INCLUDELABOR", includelabor);
			cmd.addParameter("@INCLUDEEXP", includeexp);
			cmd.addParameter("@INCLUDETRAN", includetran);
			cmd.addParameter("@INCLUDEDEL", includedel);
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@LOOKUP_VALUE", lookupValue);
			cmd.addParameter("@LOOKUP_ACCI_FUND", lookupAcciFund);
			cmd.addParameter("@LOOKUP_ACCI_ORGN", lookupAcciOrgn);
			cmd.addParameter("@LOOKUP_ACCI_ACCT", lookupAcciAcct);
			cmd.addParameter("@LOOKUP_ACCI_PROG", lookupAcciProg);
			cmd.addParameter("@LOOKUP_ACCI_ACTV", lookupAcciActv);
			cmd.addParameter("@LOOKUP_ACCI_LOCN", lookupAcciLocn);
			cmd.addParameter("@LOOKUP_BUDGET", lookupBudget);
			cmd.addParameter("@LOOKUP_PHASE", lookupPhase);
				
			cmd.execute();


		}
		
	
	
	
}
