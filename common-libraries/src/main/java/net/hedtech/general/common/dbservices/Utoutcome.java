package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utoutcome {
		public static NNumber Fid(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTCOME.ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString F_name(NNumber outcomeIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTCOME.NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OUTCOME_ID_IN", outcomeIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void onerow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTCOME.ONEROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void onerow() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTCOME.ONEROW", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static NNumber Funittest(NNumber outcomeIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTCOME.UNITTEST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@OUTCOME_ID_IN", outcomeIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Futp(NNumber outcomeIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTCOME.UTP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@OUTCOME_ID_IN", outcomeIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
