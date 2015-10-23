package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Olapfactview {
		public static void createfacttab(NString exownername,NString excubename,NString eoutfile,NString eoutpath,NBool partitioning,NString mvspcname,NString indspcname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("OLAPFACTVIEW.CREATEFACTTAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXOWNERNAME", exownername);
			cmd.addParameter("@EXCUBENAME", excubename);
			cmd.addParameter("@EOUTFILE", eoutfile);
			cmd.addParameter("@EOUTPATH", eoutpath);
			cmd.addParameter("@PARTITIONING", partitioning);
			cmd.addParameter("@MVSPCNAME", mvspcname);
			cmd.addParameter("@INDSPCNAME", indspcname);
				
			cmd.execute();


		}
		
		public static void createfacttab(NNumber runid,NString exownername,NString excubename,NBool partitioning) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("OLAPFACTVIEW.CREATEFACTTAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUNID", runid);
			cmd.addParameter("@EXOWNERNAME", exownername);
			cmd.addParameter("@EXCUBENAME", excubename);
			cmd.addParameter("@PARTITIONING", partitioning);
				
			cmd.execute();


		}
		
	
	
	
}
