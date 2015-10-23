package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tskaist {
		public static NString fAssignPlanOn(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKAIST.F_ASSIGN_PLAN_ON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fAutoCalcPlanAssigned(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKAIST.F_AUTO_CALC_PLAN_ASSIGNED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckPlan(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKAIST.F_CHECK_PLAN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCountTbriaclRecords(NString termIn,NString planIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKAIST.F_COUNT_TBRIACL_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PLAN_IN", planIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCountTbriacmRecords(NString termIn,NString planIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKAIST.F_COUNT_TBRIACM_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PLAN_IN", planIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCountTbriadgRecords(NString termIn,NString planIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKAIST.F_COUNT_TBRIADG_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PLAN_IN", planIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCountTbrialvRecords(NString termIn,NString planIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKAIST.F_COUNT_TBRIALV_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PLAN_IN", planIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCountTbriamjRecords(NString termIn,NString planIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKAIST.F_COUNT_TBRIAMJ_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PLAN_IN", planIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCountTbriartRecords(NString termIn,NString planIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKAIST.F_COUNT_TBRIART_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PLAN_IN", planIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pAssignPlan(NString termIn,NNumber pidmIn,Ref<NString> planInOut,Ref<NString> messageOut,NString sfbetrmChecked) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKAIST.P_ASSIGN_PLAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLAN_IN_OUT", planInOut, true);
			cmd.addParameter("@MESSAGE_OUT", NString.class);
			cmd.addParameter("@SFBETRM_CHECKED", sfbetrmChecked);
				
			cmd.execute();
			planInOut.val = cmd.getParameterValue("@PLAN_IN_OUT", NString.class);
			messageOut.val = cmd.getParameterValue("@MESSAGE_OUT", NString.class);


		}
		
	
	
	
}
