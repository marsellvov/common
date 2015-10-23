package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkasgn {
		public static NString fGetGtvinsmDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKASGN.F_GET_GTVINSM_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStvcampDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKASGN.F_GET_STVCAMP_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fOfficeHoursExist(NString param1,NString param2,NNumber param3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKASGN.F_OFFICE_HOURS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSyllabusExistForCrn(NString param1,NString param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKASGN.F_SYLLABUS_EXIST_FOR_CRN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fWaitlistedCrseExist(NString param1,NString param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKASGN.F_WAITLISTED_CRSE_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pFacactassign() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKASGN.P_FACACTASSIGN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pFacassignhist() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKASGN.P_FACASSIGNHIST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
