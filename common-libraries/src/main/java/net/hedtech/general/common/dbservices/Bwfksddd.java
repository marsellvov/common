package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfksddd {
		public static void csv(NString inclrev,NString coas,NString fund,NString ftyp,NString program,NString orgn,NString actv,NString acct,NString atyp,NString grnt,NString asof,NString refnumber,NString fcode,NString locn,NString proto,NString shared,NString complete2,NString skeleton,NString cmttype,NString fspd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKSDDD.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INCLREV", inclrev);
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
			cmd.addParameter("@FCODE", fcode);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@PROTO", proto);
			cmd.addParameter("@SHARED", shared);
			cmd.addParameter("@COMPLETE2", complete2);
			cmd.addParameter("@SKELETON", skeleton);
			cmd.addParameter("@CMTTYPE", cmttype);
			cmd.addParameter("@FSPD", fspd);
				
			cmd.execute();


		}
		
	
	
	
}
