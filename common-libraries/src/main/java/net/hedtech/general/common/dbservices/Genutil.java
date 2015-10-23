package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Genutil {
		public static void addDefaults(NString userIn,NString osIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.ADD_DEFAULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@OS_IN", osIn);
				
			cmd.execute();


		}
		
		public static void createAddlRecord(NString pUserId,NString pString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.CREATE_ADDL_RECORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_STRING", pString);
				
			cmd.execute();


		}
		
		public static NString FgetDbOptimizerMode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.GET_DB_OPTIMIZER_MODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDbVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.GET_DB_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FhStrtok(NString stringIn,NString delimiter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.H_STRTOK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
			cmd.addParameter("@DELIMITER", delimiter);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber Fincr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.INCR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NInteger Fincrb() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.INCRB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString Flrelease(NString inval) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.LRELEASE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INVAL", inval);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FltrimDelimiter(NString stringIn,NString delimiter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.LTRIM_DELIMITER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
			cmd.addParameter("@DELIMITER", delimiter);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FproductInstalled(NString sysiCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.PRODUCT_INSTALLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SYSI_CODE_IN", sysiCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void smaxRelease(NString inval,Ref<NString> maxrel,Ref<NDate> reldate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.SMAX_RELEASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INVAL", inval);
			cmd.addParameter("@MAXREL", NString.class);
			cmd.addParameter("@RELDATE", NDate.class);
				
			cmd.execute();
			maxrel.val = cmd.getParameterValue("@MAXREL", NString.class);
			reldate.val = cmd.getParameterValue("@RELDATE", NDate.class);


		}
		
		public static NString Fsrelease(NString inval) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.SRELEASE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INVAL", inval);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fstrtok(NString stringIn,NString delimiter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GENUTIL.STRTOK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
			cmd.addParameter("@DELIMITER", delimiter);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
