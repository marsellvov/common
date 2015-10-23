package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkrpeu {
		public static void pReportd(NString complete2,NString skeleton,NString coas,NString fund,NString ftyp,NString program,NString orgn,NString actv,NString acct,NString atyp,NString grnt,NString asofmonth,NString asofyear,NString etype,NString skiprows,NString locn,NString acci,NString proto,NString parmproto,NString shared,NString cmttype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPEU.P_REPORTD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMPLETE2", complete2);
			cmd.addParameter("@SKELETON", skeleton);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@FTYP", ftyp);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@ASOFMONTH", asofmonth);
			cmd.addParameter("@ASOFYEAR", asofyear);
			cmd.addParameter("@ETYPE", etype);
			cmd.addParameter("@SKIPROWS", skiprows);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@ACCI", acci);
			cmd.addParameter("@PROTO", proto);
			cmd.addParameter("@PARMPROTO", parmproto);
			cmd.addParameter("@SHARED", shared);
			cmd.addParameter("@CMTTYPE", cmttype);
				
			cmd.execute();


		}
		
		public static void pReportx2(NString coas,NString fund,NString ftyp,NString program,NString orgn,NString actv,NString acct,NString atyp,NString grnt,NString asof,NString refnumber,NString skiprows,NString locn,NString cmttype,NString fspd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPEU.P_REPORTX2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@FTYP", ftyp);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@ASOF", asof);
			cmd.addParameter("@REFNUMBER", refnumber);
			cmd.addParameter("@SKIPROWS", skiprows);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@CMTTYPE", cmttype);
			cmd.addParameter("@FSPD", fspd);
				
			cmd.execute();


		}
		
	
	
	
}
