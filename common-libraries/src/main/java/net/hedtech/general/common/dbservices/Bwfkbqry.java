package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkbqry {
		public static void pAudtHistory(NString coas,NString budgetid,NString budgetphase,NString fund,NString orgn,NString prog,NString acct,NString actv,NString locn,NString durationcode,NString adoptedbudget,NString permbudget,NString tempadopt,NString tempadjust,NString basebudget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBQRY.P_AUDT_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@BUDGETID", budgetid);
			cmd.addParameter("@BUDGETPHASE", budgetphase);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@DURATIONCODE", durationcode);
			cmd.addParameter("@ADOPTEDBUDGET", adoptedbudget);
			cmd.addParameter("@PERMBUDGET", permbudget);
			cmd.addParameter("@TEMPADOPT", tempadopt);
			cmd.addParameter("@TEMPADJUST", tempadjust);
			cmd.addParameter("@BASEBUDGET", basebudget);
				
			cmd.execute();


		}
		
		public static void pBudDevQuery(NString complete2,NString parmproto,NString shared,NString coas,NString fund,NString ftyp,NString program,NString org,NString activity,NString account,NString atyp,NString skiprows,NString locn,NString viewby,NString adoptedbudget,NString permbudget,NString tempadopt,NString tempadjust,NString basebudget,NString lockstatus,NString proto,NString atyphier,NString budgetid,NString budgetphase,NString budgetid2,NString budgetphase2,NString finMgrInd,NString includerev,NString includelabor,NString includeexp,NString includetran,NString includedel,NString durationcode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBQRY.P_BUD_DEV_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMPLETE2", complete2);
			cmd.addParameter("@PARMPROTO", parmproto);
			cmd.addParameter("@SHARED", shared);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@FTYP", ftyp);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@ORG", org);
			cmd.addParameter("@ACTIVITY", activity);
			cmd.addParameter("@ACCOUNT", account);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@SKIPROWS", skiprows);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@VIEWBY", viewby);
			cmd.addParameter("@ADOPTEDBUDGET", adoptedbudget);
			cmd.addParameter("@PERMBUDGET", permbudget);
			cmd.addParameter("@TEMPADOPT", tempadopt);
			cmd.addParameter("@TEMPADJUST", tempadjust);
			cmd.addParameter("@BASEBUDGET", basebudget);
			cmd.addParameter("@LOCKSTATUS", lockstatus);
			cmd.addParameter("@PROTO", proto);
			cmd.addParameter("@ATYPHIER", atyphier);
			cmd.addParameter("@BUDGETID", budgetid);
			cmd.addParameter("@BUDGETPHASE", budgetphase);
			cmd.addParameter("@BUDGETID2", budgetid2);
			cmd.addParameter("@BUDGETPHASE2", budgetphase2);
			cmd.addParameter("@FIN_MGR_IND", finMgrInd);
			cmd.addParameter("@INCLUDEREV", includerev);
			cmd.addParameter("@INCLUDELABOR", includelabor);
			cmd.addParameter("@INCLUDEEXP", includeexp);
			cmd.addParameter("@INCLUDETRAN", includetran);
			cmd.addParameter("@INCLUDEDEL", includedel);
			cmd.addParameter("@DURATIONCODE", durationcode);
				
			cmd.execute();


		}
		
	
	
	
}
