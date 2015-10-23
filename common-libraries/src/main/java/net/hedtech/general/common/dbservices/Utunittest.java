package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utunittest {
		public static void add(NNumber utpIdIn,NString programNameIn,NNumber seqIn,NString descriptionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUNITTEST.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UTP_ID_IN", utpIdIn);
			cmd.addParameter("@PROGRAM_NAME_IN", programNameIn);
			cmd.addParameter("@SEQ_IN", seqIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
				
			cmd.execute();


		}
		
		public static NString fullName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUNITTEST.FULL_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber Fid(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUNITTEST.ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString F_name() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUNITTEST.NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString F_name(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUNITTEST.NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void onerow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUNITTEST.ONEROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString FprogramName(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUNITTEST.PROGRAM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void rem(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUNITTEST.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
		public static void rem(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUNITTEST.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();


		}
		
	
	
	
}
