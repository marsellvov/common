package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkrpou {
		public static void csv(NString coasCode,NString fund,NString ftyp,NString orgn,NString account,NString atyp,NString program,NString activity,NString location,NString cmttype,NString balBako,NDate asofdate,NString asofmonth,NString asofyear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPOU.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@FTYP", ftyp);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCOUNT", account);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@ACTIVITY", activity);
			cmd.addParameter("@LOCATION", location);
			cmd.addParameter("@CMTTYPE", cmttype);
			cmd.addParameter("@BAL_BAKO", balBako);
			cmd.addParameter("@ASOFDATE", asofdate);
			cmd.addParameter("@ASOFMONTH", asofmonth);
			cmd.addParameter("@ASOFYEAR", asofyear);
				
			cmd.execute();


		}
		
		public static void pReporta(NString complete2,NString skeleton,NString parmproto,NString shared,NString inclrev,NString coas,NString fund,NString ftyp,NString program,NString grnt,NString org,NString activity,NString asofmonth,NString asofyear,NString asofmonth2,NString asofyear2,NString account,NString atyp,NString skiprows,NString locn,NString viewby,NString adoptedbudget,NString ytd,NString budgetadjt,NString encumb,NString adjustedbudget,NString reserve,NString tempbudget,NString commitments,NString balance,NString proto,NString compcol1,NString compcol2,NString compcol3,NString compcol4,NString comptitle,NString compadd,NString compop,NString atyphier,NString cmttype,NString acctdbudget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPOU.P_REPORTA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMPLETE2", complete2);
			cmd.addParameter("@SKELETON", skeleton);
			cmd.addParameter("@PARMPROTO", parmproto);
			cmd.addParameter("@SHARED", shared);
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
			cmd.addParameter("@PROTO", proto);
			cmd.addParameter("@COMPCOL1", compcol1);
			cmd.addParameter("@COMPCOL2", compcol2);
			cmd.addParameter("@COMPCOL3", compcol3);
			cmd.addParameter("@COMPCOL4", compcol4);
			cmd.addParameter("@COMPTITLE", comptitle);
			cmd.addParameter("@COMPADD", compadd);
			cmd.addParameter("@COMPOP", compop);
			cmd.addParameter("@ATYPHIER", atyphier);
			cmd.addParameter("@CMTTYPE", cmttype);
			cmd.addParameter("@ACCTDBUDGET", acctdbudget);
				
			cmd.execute();


		}
		
		public static void pReportw(NString coasCode,NString fund,NString ftyp,NString orgn,NString account,NString atyp,NString program,NString activity,NString location,NString cmttype,NString balBako,NString skiprows,NDate asofdate,NString asofmonth,NString asofyear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPOU.P_REPORTW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@FTYP", ftyp);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCOUNT", account);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@ACTIVITY", activity);
			cmd.addParameter("@LOCATION", location);
			cmd.addParameter("@CMTTYPE", cmttype);
			cmd.addParameter("@BAL_BAKO", balBako);
			cmd.addParameter("@SKIPROWS", skiprows);
			cmd.addParameter("@ASOFDATE", asofdate);
			cmd.addParameter("@ASOFMONTH", asofmonth);
			cmd.addParameter("@ASOFYEAR", asofyear);
				
			cmd.execute();


		}
		
	
	
	
}
