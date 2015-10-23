package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkrpvu {
		public static void pBudgetStart(NString complete,NString viewby,NString quickview,NString adoptedbudget,NString ytd,NString budgetadjt,NString encumb,NString adjustedbudget,NString reserve,NString tempbudget,NString commitments,NString balance,NString proto,NString parmproto,NString shared,NString lookupCode,NString lookupValue,NString lookupAcciFund,NString lookupAcciOrgn,NString lookupAcciAcct,NString lookupAcciProg,NString lookupAcciActv,NString lookupAcciLocn,NString asofyear,NString asofmonth,NString asofyear2,NString asofmonth2,NString coas,NString acci,NString fund,NString activity,NString org,NString locn,NString grnt,NString ftyp,NString atyp,NString account,NString program,NString inclrev,NString atyphier,NString complete2,NString skeleton,NString cmttype,NString acctdbudget,NString fsyr,NString fspd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPVU.P_BUDGET_START", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMPLETE", complete);
			cmd.addParameter("@VIEWBY", viewby);
			cmd.addParameter("@QUICKVIEW", quickview);
			cmd.addParameter("@ADOPTEDBUDGET", adoptedbudget);
			cmd.addParameter("@YTD", ytd);
			cmd.addParameter("@BUDGETADJT", budgetadjt);
			cmd.addParameter("@ENCUMB", encumb);
			cmd.addParameter("@ADJUSTEDBUDGET", adjustedbudget);
			cmd.addParameter("@RESERVE", reserve);
			cmd.addParameter("@TEMPBUDGET", tempbudget);
			cmd.addParameter("@COMMITMENTS", commitments);
			cmd.addParameter("@BALANCE", balance);
			cmd.addParameter("@PROTO", proto);
			cmd.addParameter("@PARMPROTO", parmproto);
			cmd.addParameter("@SHARED", shared);
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@LOOKUP_VALUE", lookupValue);
			cmd.addParameter("@LOOKUP_ACCI_FUND", lookupAcciFund);
			cmd.addParameter("@LOOKUP_ACCI_ORGN", lookupAcciOrgn);
			cmd.addParameter("@LOOKUP_ACCI_ACCT", lookupAcciAcct);
			cmd.addParameter("@LOOKUP_ACCI_PROG", lookupAcciProg);
			cmd.addParameter("@LOOKUP_ACCI_ACTV", lookupAcciActv);
			cmd.addParameter("@LOOKUP_ACCI_LOCN", lookupAcciLocn);
			cmd.addParameter("@ASOFYEAR", asofyear);
			cmd.addParameter("@ASOFMONTH", asofmonth);
			cmd.addParameter("@ASOFYEAR2", asofyear2);
			cmd.addParameter("@ASOFMONTH2", asofmonth2);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ACCI", acci);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ACTIVITY", activity);
			cmd.addParameter("@ORG", org);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@FTYP", ftyp);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@ACCOUNT", account);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@INCLREV", inclrev);
			cmd.addParameter("@ATYPHIER", atyphier);
			cmd.addParameter("@COMPLETE2", complete2);
			cmd.addParameter("@SKELETON", skeleton);
			cmd.addParameter("@CMTTYPE", cmttype);
			cmd.addParameter("@ACCTDBUDGET", acctdbudget);
			cmd.addParameter("@FSYR", fsyr);
			cmd.addParameter("@FSPD", fspd);
				
			cmd.execute();


		}
		
	
	
	
}
