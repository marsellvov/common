package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsskldi {
//		public static List<LdiNvNtRow> fGetCrosslistGroup(NString sourcedIdIn,NString recstatusIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKLDI.F_GET_CROSSLIST_GROUP", DbManager.getDataBaseFactory());
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
		
//		public static List<LdiNvNtRow> fGetCrosslistMembership(NString sourcedIdIn,NString memberSourcedIdIn,NString recstatusIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKLDI.F_GET_CROSSLIST_MEMBERSHIP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LdiNvNtRow>.class);
//			cmd.addParameter("@SOURCED_ID_IN", sourcedIdIn);
//			cmd.addParameter("@MEMBER_SOURCED_ID_IN", memberSourcedIdIn);
//			cmd.addParameter("@RECSTATUS_IN", recstatusIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LdiNvNtRow>.class);
//
//		}
		
//		public static List<LdiNvNtRow> fGetSection(NString sourcedIdIn,NString recstatusIn,NString actionIn,NString oldIntgCdeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKLDI.F_GET_SECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LdiNvNtRow>.class);
//			cmd.addParameter("@SOURCED_ID_IN", sourcedIdIn);
//			cmd.addParameter("@RECSTATUS_IN", recstatusIn);
//			cmd.addParameter("@ACTION_IN", actionIn);
//			cmd.addParameter("@OLD_INTG_CDE_IN", oldIntgCdeIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LdiNvNtRow>.class);
//
//		}
		
		public static void pSaveCrosslistGroup(NString termCodeIn,NString xlstGroupIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKLDI.P_SAVE_CROSSLIST_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();


		}
		
		public static void pSaveCrosslistMembership(NString termCodeIn,NString xlstGroupIn,NString crnIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKLDI.P_SAVE_CROSSLIST_MEMBERSHIP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();


		}
		
		public static void pSaveSection(NString termCodeIn,NString crnIn,NString newIntgCdeIn,NString oldIntgCdeIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKLDI.P_SAVE_SECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@NEW_INTG_CDE_IN", newIntgCdeIn);
			cmd.addParameter("@OLD_INTG_CDE_IN", oldIntgCdeIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();


		}
		
		public static void pSendCrosslistGroup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKLDI.P_SEND_CROSSLIST_GROUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSendCrosslistMembership() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKLDI.P_SEND_CROSSLIST_MEMBERSHIP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSendSection() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKLDI.P_SEND_SECTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
