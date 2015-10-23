package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsckldi {
//		public static List<LdiNvNtRow> fGetCollege(NString sourcedIdIn,NString recstatusIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKLDI.F_GET_COLLEGE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LdiNvNtRow>.class);
//			cmd.addParameter("@SOURCED_ID_IN", sourcedIdIn);
//			cmd.addParameter("@RECSTATUS_IN", recstatusIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LdiNvNtRow>.class);
//
//		}
		
//		public static List<LdiNvNtRow> fGetCourse(NString sourcedIdIn,NString recstatusIn,NString actionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKLDI.F_GET_COURSE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LdiNvNtRow>.class);
//			cmd.addParameter("@SOURCED_ID_IN", sourcedIdIn);
//			cmd.addParameter("@RECSTATUS_IN", recstatusIn);
//			cmd.addParameter("@ACTION_IN", actionIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LdiNvNtRow>.class);
//
//		}
		
//		public static List<LdiNvNtRow> fGetDepartment(NString sourcedIdIn,NString recstatusIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKLDI.F_GET_DEPARTMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LdiNvNtRow>.class);
//			cmd.addParameter("@SOURCED_ID_IN", sourcedIdIn);
//			cmd.addParameter("@RECSTATUS_IN", recstatusIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LdiNvNtRow>.class);
//
//		}
		
		public static void pSaveCollege(NString codeIn,NString descIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKLDI.P_SAVE_COLLEGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CODE_IN", codeIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();


		}
		
		public static void pSaveCourse(NString subjCodeIn,NString crseNumbIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKLDI.P_SAVE_COURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();


		}
		
		public static void pSaveDepartment(NString codeIn,NString descIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKLDI.P_SAVE_DEPARTMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CODE_IN", codeIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();


		}
		
		public static void pSendCollege() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKLDI.P_SEND_COLLEGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSendCourse() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKLDI.P_SEND_COURSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSendDepartment() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKLDI.P_SEND_DEPARTMENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
