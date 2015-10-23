package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utreceq {
		public static void add(NString pkgNameIn,NString recordIn,NString recOwnerIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRECEQ.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PKG_NAME_IN", pkgNameIn);
			cmd.addParameter("@RECORD_IN", recordIn);
			cmd.addParameter("@REC_OWNER_IN", recOwnerIn);
				
			cmd.execute();


		}
		
		public static void compile(NString pkgNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRECEQ.COMPILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PKG_NAME_IN", pkgNameIn);
				
			cmd.execute();


		}
		
		public static void rem(NString nameIn,NString recOwnerIn,NBool forPackageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRECEQ.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@REC_OWNER_IN", recOwnerIn);
			cmd.addParameter("@FOR_PACKAGE_IN", forPackageIn);
				
			cmd.execute();


		}
		
	
	
	
}
