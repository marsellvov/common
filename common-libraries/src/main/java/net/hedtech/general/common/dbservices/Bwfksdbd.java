package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfksdbd {
		public static void csv(NString coas,NString budgetid,NString budgetphase,NString budgetid2,NString budgetphase2,NString finMgrInd,NString fund,NString org,NString account,NString program,NString activity,NString locn,NString ftyp,NString atyp,NString atyphier,NString viewby,NDate asofdate,NString adoptedbudget,NString permbudget,NString tempadopt,NString tempadjust,NString basebudget,NString lockstatus,NString includerev,NString includelabor,NString includeexp,NString includetran,NString includedel,NString durationcode,NString downld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKSDBD.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@BUDGETID", budgetid);
			cmd.addParameter("@BUDGETPHASE", budgetphase);
			cmd.addParameter("@BUDGETID2", budgetid2);
			cmd.addParameter("@BUDGETPHASE2", budgetphase2);
			cmd.addParameter("@FIN_MGR_IND", finMgrInd);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORG", org);
			cmd.addParameter("@ACCOUNT", account);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@ACTIVITY", activity);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@FTYP", ftyp);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@ATYPHIER", atyphier);
			cmd.addParameter("@VIEWBY", viewby);
			cmd.addParameter("@ASOFDATE", asofdate);
			cmd.addParameter("@ADOPTEDBUDGET", adoptedbudget);
			cmd.addParameter("@PERMBUDGET", permbudget);
			cmd.addParameter("@TEMPADOPT", tempadopt);
			cmd.addParameter("@TEMPADJUST", tempadjust);
			cmd.addParameter("@BASEBUDGET", basebudget);
			cmd.addParameter("@LOCKSTATUS", lockstatus);
			cmd.addParameter("@INCLUDEREV", includerev);
			cmd.addParameter("@INCLUDELABOR", includelabor);
			cmd.addParameter("@INCLUDEEXP", includeexp);
			cmd.addParameter("@INCLUDETRAN", includetran);
			cmd.addParameter("@INCLUDEDEL", includedel);
			cmd.addParameter("@DURATIONCODE", durationcode);
			cmd.addParameter("@DOWNLD", downld);
				
			cmd.execute();


		}
		
	
	
	
}
