package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Olapdimview {
		public static void createdimtab(NString exownername,NString exdimname,NString eoutfile,NString eoutpath,NString mvspcname,NString indspcname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("OLAPDIMVIEW.CREATEDIMTAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXOWNERNAME", exownername);
			cmd.addParameter("@EXDIMNAME", exdimname);
			cmd.addParameter("@EOUTFILE", eoutfile);
			cmd.addParameter("@EOUTPATH", eoutpath);
			cmd.addParameter("@MVSPCNAME", mvspcname);
			cmd.addParameter("@INDSPCNAME", indspcname);
				
			cmd.execute();


		}
		
		public static void createdimtab(NNumber runid,NString exownername,NString exdimname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("OLAPDIMVIEW.CREATEDIMTAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUNID", runid);
			cmd.addParameter("@EXOWNERNAME", exownername);
			cmd.addParameter("@EXDIMNAME", exdimname);
				
			cmd.execute();


		}
		
	
	
	
}
