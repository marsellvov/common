package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkrpau {
		public static void pSetprefForSite(NString coasTitle,NString acciTitle,NString fundTitle,NString orgnTitle,NString acctTitle,NString progTitle,NString actvTitle,NString locnTitle,NString grntTitle,NString adoptTitle,NString ytdTitle,NString budadjtTitle,NString encumbTitle,NString adjtbudTitle,NString reserveTitle,NString tempbudTitle,NString commitTitle,NString balTitle,NString msg,NString saveind,NString acctdbudgetTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPAU.P_SETPREF_FOR_SITE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_TITLE", coasTitle);
			cmd.addParameter("@ACCI_TITLE", acciTitle);
			cmd.addParameter("@FUND_TITLE", fundTitle);
			cmd.addParameter("@ORGN_TITLE", orgnTitle);
			cmd.addParameter("@ACCT_TITLE", acctTitle);
			cmd.addParameter("@PROG_TITLE", progTitle);
			cmd.addParameter("@ACTV_TITLE", actvTitle);
			cmd.addParameter("@LOCN_TITLE", locnTitle);
			cmd.addParameter("@GRNT_TITLE", grntTitle);
			cmd.addParameter("@ADOPT_TITLE", adoptTitle);
			cmd.addParameter("@YTD_TITLE", ytdTitle);
			cmd.addParameter("@BUDADJT_TITLE", budadjtTitle);
			cmd.addParameter("@ENCUMB_TITLE", encumbTitle);
			cmd.addParameter("@ADJTBUD_TITLE", adjtbudTitle);
			cmd.addParameter("@RESERVE_TITLE", reserveTitle);
			cmd.addParameter("@TEMPBUD_TITLE", tempbudTitle);
			cmd.addParameter("@COMMIT_TITLE", commitTitle);
			cmd.addParameter("@BAL_TITLE", balTitle);
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@SAVEIND", saveind);
			cmd.addParameter("@ACCTDBUDGET_TITLE", acctdbudgetTitle);
				
			cmd.execute();


		}
		
	
	
	
}
