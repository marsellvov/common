package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkrpqu {
		public static void pEncumbStart(NString complete,NString proto,NString parmproto,NString shared,NString lookupCode,NString lookupValue,NString lookupAcciFund,NString lookupAcciOrgn,NString lookupAcciAcct,NString lookupAcciProg,NString lookupAcciActv,NString lookupAcciLocn,NString asofyear,NString asofmonth,NString coas,NString acci,NString fund,NString activity,NString org,NString locn,NString grnt,NString ftyp,NString atyp,NString account,NString program,NString etype,NString atyphier,NString cmttype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKRPQU.P_ENCUMB_START", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMPLETE", complete);
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
			cmd.addParameter("@ETYPE", etype);
			cmd.addParameter("@ATYPHIER", atyphier);
			cmd.addParameter("@CMTTYPE", cmttype);
				
			cmd.execute();


		}
		
	
	
	
}
