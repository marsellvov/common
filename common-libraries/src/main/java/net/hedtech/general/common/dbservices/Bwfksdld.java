package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfksdld {
		public static void csv(NString inclrev,NString coas,NString fund,NString ftyp,NString program,NString grnt,NString org,NString activity,NString asofmonth,NString asofyear,NString asofmonth2,NString asofyear2,NString account,NString atyp,NString atyphier,NString skiprows,NString locn,NString viewby,NString adoptedbudget,NString ytd,NString budgetadjt,NString encumb,NString adjustedbudget,NString reserve,NString tempbudget,NString commitments,NString balance,NString cmttype,NString acctdbudget,NString downld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKSDLD.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INCLREV", inclrev);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@FTYP", ftyp);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@ORG", org);
			cmd.addParameter("@ACTIVITY", activity);
			cmd.addParameter("@ASOFMONTH", asofmonth);
			cmd.addParameter("@ASOFYEAR", asofyear);
			cmd.addParameter("@ASOFMONTH2", asofmonth2);
			cmd.addParameter("@ASOFYEAR2", asofyear2);
			cmd.addParameter("@ACCOUNT", account);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@ATYPHIER", atyphier);
			cmd.addParameter("@SKIPROWS", skiprows);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@VIEWBY", viewby);
			cmd.addParameter("@ADOPTEDBUDGET", adoptedbudget);
			cmd.addParameter("@YTD", ytd);
			cmd.addParameter("@BUDGETADJT", budgetadjt);
			cmd.addParameter("@ENCUMB", encumb);
			cmd.addParameter("@ADJUSTEDBUDGET", adjustedbudget);
			cmd.addParameter("@RESERVE", reserve);
			cmd.addParameter("@TEMPBUDGET", tempbudget);
			cmd.addParameter("@COMMITMENTS", commitments);
			cmd.addParameter("@BALANCE", balance);
			cmd.addParameter("@CMTTYPE", cmttype);
			cmd.addParameter("@ACCTDBUDGET", acctdbudget);
			cmd.addParameter("@DOWNLD", downld);
				
			cmd.execute();


		}
		
	
	
	
}
