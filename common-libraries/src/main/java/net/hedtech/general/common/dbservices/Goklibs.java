package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Goklibs {
		public static NString fGenrandchar(NString vId,NNumber lengthOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKLIBS.F_GENRANDCHAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_ID", vId);
			cmd.addParameter("@LENGTH_OUT", lengthOut);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fIsdate(NString str,NString fmtStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKLIBS.F_ISDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@STR", str);
			cmd.addParameter("@FMT_STR", fmtStr);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fIsexactdate(NString stringIn,NString formatStringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKLIBS.F_ISEXACTDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@STRING_IN", stringIn);
			cmd.addParameter("@FORMAT_STRING_IN", formatStringIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fIsnumber(NString stringIn,NString formatStringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKLIBS.F_ISNUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@STRING_IN", stringIn);
			cmd.addParameter("@FORMAT_STRING_IN", formatStringIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fMatchingrole(NNumber pidm,NString directoryType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKLIBS.F_MATCHINGROLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRECTORY_TYPE", directoryType);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fPinlength() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKLIBS.F_PINLENGTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fPinreused(NNumber pidm,NString npin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKLIBS.F_PINREUSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@NPIN", npin);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fStralldigits(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKLIBS.F_STRALLDIGITS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@STR", str);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
