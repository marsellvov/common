package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfktran {
		public static void pBudgettransfer(NString asofday,NString asofmonth,NString asofyear,NString ruleclass,NString amt,NString coas,NString index1,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn,NString dcind,NString coas2,NString index2,NString fund2,NString orgn2,NString acct2,NString prog2,NString actv2,NString locn2,NString dcind2,NString descr,NString budperiod,NString skeleton,NString proto,NString systemwide,NString complete,NString complete2,NString pattern,NString pattern2,NString lookupCode,NString lookupCoas,NNumber maxrows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTRAN.P_BUDGETTRANSFER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ASOFDAY", asofday);
			cmd.addParameter("@ASOFMONTH", asofmonth);
			cmd.addParameter("@ASOFYEAR", asofyear);
			cmd.addParameter("@RULECLASS", ruleclass);
			cmd.addParameter("@AMT", amt);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@DCIND", dcind);
			cmd.addParameter("@COAS2", coas2);
			cmd.addParameter("@INDEX2", index2);
			cmd.addParameter("@FUND2", fund2);
			cmd.addParameter("@ORGN2", orgn2);
			cmd.addParameter("@ACCT2", acct2);
			cmd.addParameter("@PROG2", prog2);
			cmd.addParameter("@ACTV2", actv2);
			cmd.addParameter("@LOCN2", locn2);
			cmd.addParameter("@DCIND2", dcind2);
			cmd.addParameter("@DESCR", descr);
			cmd.addParameter("@BUDPERIOD", budperiod);
			cmd.addParameter("@SKELETON", skeleton);
			cmd.addParameter("@PROTO", proto);
			cmd.addParameter("@SYSTEMWIDE", systemwide);
			cmd.addParameter("@COMPLETE", complete);
			cmd.addParameter("@COMPLETE2", complete2);
			cmd.addParameter("@PATTERN", pattern);
			cmd.addParameter("@PATTERN2", pattern2);
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@LOOKUP_COAS", lookupCoas);
			cmd.addParameter("@MAXROWS", maxrows);
				
			cmd.execute();


		}
		
		public static void pMultilineTransfer(NString asofday,NString asofmonth,NString asofyear,NString ruleclass,NString amt,NString coas,NString index1,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn,NString dcind,NString amt1,NString coas2,NString index2,NString fund2,NString orgn2,NString acct2,NString prog2,NString actv2,NString locn2,NString dcind2,NString amt2,NString coas3,NString index3,NString fund3,NString orgn3,NString acct3,NString prog3,NString actv3,NString locn3,NString dcind3,NString amt3,NString coas4,NString index4,NString fund4,NString orgn4,NString acct4,NString prog4,NString actv4,NString locn4,NString dcind4,NString amt4,NString coas5,NString index5,NString fund5,NString orgn5,NString acct5,NString prog5,NString actv5,NString locn5,NString dcind5,NString amt5,NString descr,NString budperiod,NString skeleton,NString proto,NString systemwide,NString complete,NString complete2,NString pattern,NString pattern2,NString lookupCode,NString lookupCoas,NNumber maxrows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKTRAN.P_MULTILINE_TRANSFER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ASOFDAY", asofday);
			cmd.addParameter("@ASOFMONTH", asofmonth);
			cmd.addParameter("@ASOFYEAR", asofyear);
			cmd.addParameter("@RULECLASS", ruleclass);
			cmd.addParameter("@AMT", amt);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@DCIND", dcind);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@COAS2", coas2);
			cmd.addParameter("@INDEX2", index2);
			cmd.addParameter("@FUND2", fund2);
			cmd.addParameter("@ORGN2", orgn2);
			cmd.addParameter("@ACCT2", acct2);
			cmd.addParameter("@PROG2", prog2);
			cmd.addParameter("@ACTV2", actv2);
			cmd.addParameter("@LOCN2", locn2);
			cmd.addParameter("@DCIND2", dcind2);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@COAS3", coas3);
			cmd.addParameter("@INDEX3", index3);
			cmd.addParameter("@FUND3", fund3);
			cmd.addParameter("@ORGN3", orgn3);
			cmd.addParameter("@ACCT3", acct3);
			cmd.addParameter("@PROG3", prog3);
			cmd.addParameter("@ACTV3", actv3);
			cmd.addParameter("@LOCN3", locn3);
			cmd.addParameter("@DCIND3", dcind3);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@COAS4", coas4);
			cmd.addParameter("@INDEX4", index4);
			cmd.addParameter("@FUND4", fund4);
			cmd.addParameter("@ORGN4", orgn4);
			cmd.addParameter("@ACCT4", acct4);
			cmd.addParameter("@PROG4", prog4);
			cmd.addParameter("@ACTV4", actv4);
			cmd.addParameter("@LOCN4", locn4);
			cmd.addParameter("@DCIND4", dcind4);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@COAS5", coas5);
			cmd.addParameter("@INDEX5", index5);
			cmd.addParameter("@FUND5", fund5);
			cmd.addParameter("@ORGN5", orgn5);
			cmd.addParameter("@ACCT5", acct5);
			cmd.addParameter("@PROG5", prog5);
			cmd.addParameter("@ACTV5", actv5);
			cmd.addParameter("@LOCN5", locn5);
			cmd.addParameter("@DCIND5", dcind5);
			cmd.addParameter("@AMT5", amt5);
			cmd.addParameter("@DESCR", descr);
			cmd.addParameter("@BUDPERIOD", budperiod);
			cmd.addParameter("@SKELETON", skeleton);
			cmd.addParameter("@PROTO", proto);
			cmd.addParameter("@SYSTEMWIDE", systemwide);
			cmd.addParameter("@COMPLETE", complete);
			cmd.addParameter("@COMPLETE2", complete2);
			cmd.addParameter("@PATTERN", pattern);
			cmd.addParameter("@PATTERN2", pattern2);
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@LOOKUP_COAS", lookupCoas);
			cmd.addParameter("@MAXROWS", maxrows);
				
			cmd.execute();


		}
		
	
	
	
}
