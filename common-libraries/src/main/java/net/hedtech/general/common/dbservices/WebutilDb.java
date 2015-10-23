package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WebutilDb {
		public static NBool Fcloseblob(NInteger checksum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WEBUTIL_DB.CLOSEBLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CHECKSUM", checksum);
//			cmd.addParameter("@CHECKSUM", checksum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NInteger Fgetlasterror() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WEBUTIL_DB.GETLASTERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fgetsourcechunks() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WEBUTIL_DB.GETSOURCECHUNKS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger Fgetsourcelength() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WEBUTIL_DB.GETSOURCELENGTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NBool Fopenblob(NString blobtable,NString blobcolumn,NString blobwhere,NString openmode,NInteger chunksize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WEBUTIL_DB.OPENBLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@BLOBTABLE", blobtable);
//			cmd.addParameter("@BLOBTABLE", blobtable);
			cmd.addParameter("@BLOBCOLUMN", blobcolumn);
//			cmd.addParameter("@BLOBCOLUMN", blobcolumn);
			cmd.addParameter("@BLOBWHERE", blobwhere);
//			cmd.addParameter("@BLOBWHERE", blobwhere);
			cmd.addParameter("@OPENMODE", openmode);
//			cmd.addParameter("@OPENMODE", openmode);
			cmd.addParameter("@CHUNKSIZE", chunksize);
//			cmd.addParameter("@CHUNKSIZE", chunksize);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString Freaddata() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WEBUTIL_DB.READDATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void writedata(NString data) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WEBUTIL_DB.WRITEDATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DATA", data);
//			cmd.addParameter("@DATA", data);
				
			cmd.execute();


		}
		
	
	
	
}
