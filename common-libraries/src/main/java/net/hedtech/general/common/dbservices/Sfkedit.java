package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkedit {
		public static void pConnectedGroupEdits(NNumber pidmIn,NString termIn,NString corqSeverityIn,NString linkSeverityIn,NString preqSeverityIn,NString sessionidIn,NString systemIn,Ref<NString> errorFlagOut,Ref<NString> cappTechErrorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKEDIT.P_CONNECTED_GROUP_EDITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CORQ_SEVERITY_IN", corqSeverityIn);
			cmd.addParameter("@LINK_SEVERITY_IN", linkSeverityIn);
			cmd.addParameter("@PREQ_SEVERITY_IN", preqSeverityIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@SYSTEM_IN", systemIn);
			cmd.addParameter("@ERROR_FLAG_OUT", NString.class);
			cmd.addParameter("@CAPP_TECH_ERROR_OUT", NString.class);
				
			cmd.execute();
			errorFlagOut.val = cmd.getParameterValue("@ERROR_FLAG_OUT", NString.class);
			cappTechErrorOut.val = cmd.getParameterValue("@CAPP_TECH_ERROR_OUT", NString.class);


		}
		
//		public static void pConnectedGroupEdits(NNumber pidmIn,NString termIn,NString corqSeverityIn,NString linkSeverityIn,NString preqSeverityIn,NString sessionidIn,NString systemIn,Ref<NString> errorFlagOut,Ref<NString> cappTechErrorOut,List<OwaUtil.IdentArrRow> termListIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKEDIT.P_CONNECTED_GROUP_EDITS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@CORQ_SEVERITY_IN", corqSeverityIn);
//			cmd.addParameter("@LINK_SEVERITY_IN", linkSeverityIn);
//			cmd.addParameter("@PREQ_SEVERITY_IN", preqSeverityIn);
//			cmd.addParameter("@SESSIONID_IN", sessionidIn);
//			cmd.addParameter("@SYSTEM_IN", systemIn);
//			cmd.addParameter("@ERROR_FLAG_OUT", NString.class);
//			cmd.addParameter("@CAPP_TECH_ERROR_OUT", NString.class);
//			// cmd.addParameter(DbTypes.getTableType("TERM_LIST_IN", "", termListIn, object.class));
//				
//			cmd.execute();
//			errorFlagOut.val = cmd.getParameterValue("@ERROR_FLAG_OUT", NString.class);
//			cappTechErrorOut.val = cmd.getParameterValue("@CAPP_TECH_ERROR_OUT", NString.class);
//
//
//		}
		
		public static void pGroupEdits(NNumber pidmIn,NString termIn,NString duplSeverityIn,NString timeSeverityIn,NString corqSeverityIn,NString linkSeverityIn,NString preqSeverityIn,NString maxhSeverityIn,NString minhSeverityIn,NString mexcSeverityIn,NNumber mhrsOverIn,NNumber minHrsIn,NString sessionidIn,NString systemIn,Ref<NString> errorFlagOut,Ref<NString> cappTechErrorOut,Ref<NString> minhErrorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKEDIT.P_GROUP_EDITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DUPL_SEVERITY_IN", duplSeverityIn);
			cmd.addParameter("@TIME_SEVERITY_IN", timeSeverityIn);
			cmd.addParameter("@CORQ_SEVERITY_IN", corqSeverityIn);
			cmd.addParameter("@LINK_SEVERITY_IN", linkSeverityIn);
			cmd.addParameter("@PREQ_SEVERITY_IN", preqSeverityIn);
			cmd.addParameter("@MAXH_SEVERITY_IN", maxhSeverityIn);
			cmd.addParameter("@MINH_SEVERITY_IN", minhSeverityIn);
			cmd.addParameter("@MEXC_SEVERITY_IN", mexcSeverityIn);
			cmd.addParameter("@MHRS_OVER_IN", mhrsOverIn);
			cmd.addParameter("@MIN_HRS_IN", minHrsIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@SYSTEM_IN", systemIn);
			cmd.addParameter("@ERROR_FLAG_OUT", NString.class);
			cmd.addParameter("@CAPP_TECH_ERROR_OUT", NString.class);
			cmd.addParameter("@MINH_ERROR_OUT", NString.class);
				
			cmd.execute();
			errorFlagOut.val = cmd.getParameterValue("@ERROR_FLAG_OUT", NString.class);
			cappTechErrorOut.val = cmd.getParameterValue("@CAPP_TECH_ERROR_OUT", NString.class);
			minhErrorOut.val = cmd.getParameterValue("@MINH_ERROR_OUT", NString.class);


		}
		
//		public static void pGroupEdits(NNumber pidmIn,NString termIn,NString duplSeverityIn,NString timeSeverityIn,NString corqSeverityIn,NString linkSeverityIn,NString preqSeverityIn,NString maxhSeverityIn,NString minhSeverityIn,NString mexcSeverityIn,NNumber mhrsOverIn,NNumber minHrsIn,NString sessionidIn,NString systemIn,Ref<NString> errorFlagOut,Ref<NString> cappTechErrorOut,Ref<NString> minhErrorOut,NString adminProcessingIn,List<OwaUtil.IdentArrRow> termListIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKEDIT.P_GROUP_EDITS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@DUPL_SEVERITY_IN", duplSeverityIn);
//			cmd.addParameter("@TIME_SEVERITY_IN", timeSeverityIn);
//			cmd.addParameter("@CORQ_SEVERITY_IN", corqSeverityIn);
//			cmd.addParameter("@LINK_SEVERITY_IN", linkSeverityIn);
//			cmd.addParameter("@PREQ_SEVERITY_IN", preqSeverityIn);
//			cmd.addParameter("@MAXH_SEVERITY_IN", maxhSeverityIn);
//			cmd.addParameter("@MINH_SEVERITY_IN", minhSeverityIn);
//			cmd.addParameter("@MEXC_SEVERITY_IN", mexcSeverityIn);
//			cmd.addParameter("@MHRS_OVER_IN", mhrsOverIn);
//			cmd.addParameter("@MIN_HRS_IN", minHrsIn);
//			cmd.addParameter("@SESSIONID_IN", sessionidIn);
//			cmd.addParameter("@SYSTEM_IN", systemIn);
//			cmd.addParameter("@ERROR_FLAG_OUT", NString.class);
//			cmd.addParameter("@CAPP_TECH_ERROR_OUT", NString.class);
//			cmd.addParameter("@MINH_ERROR_OUT", NString.class);
//			cmd.addParameter("@ADMIN_PROCESSING_IN", adminProcessingIn);
//			// cmd.addParameter(DbTypes.getTableType("TERM_LIST_IN", "", termListIn, object.class));
//				
//			cmd.execute();
//			errorFlagOut.val = cmd.getParameterValue("@ERROR_FLAG_OUT", NString.class);
//			cappTechErrorOut.val = cmd.getParameterValue("@CAPP_TECH_ERROR_OUT", NString.class);
//			minhErrorOut.val = cmd.getParameterValue("@MINH_ERROR_OUT", NString.class);
//
//
//		}
		
		public static void pPreEdit() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKEDIT.P_PRE_EDIT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateRegs(NNumber pidmIn,NString termIn,NDate regDateIn,NString clasCodeIn,NString stypCodeIn,NString capcSeverityIn,NString tmstCalcIndIn,NString tmstMaintIndIn,NString tmstCodeIn,NBool dropLastClassIn,NString systemIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKEDIT.P_UPDATE_REGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@REG_DATE_IN", regDateIn);
			cmd.addParameter("@CLAS_CODE_IN", clasCodeIn);
			cmd.addParameter("@STYP_CODE_IN", stypCodeIn);
			cmd.addParameter("@CAPC_SEVERITY_IN", capcSeverityIn);
			cmd.addParameter("@TMST_CALC_IND_IN", tmstCalcIndIn);
			cmd.addParameter("@TMST_MAINT_IND_IN", tmstMaintIndIn);
			cmd.addParameter("@TMST_CODE_IN", tmstCodeIn);
			cmd.addParameter("@DROP_LAST_CLASS_IN", dropLastClassIn);
			cmd.addParameter("@SYSTEM_IN", systemIn);
				
			cmd.execute();


		}
		
//		public static void pWebGroupEdits(NNumber pidmIn,NString termIn,NString callTypeIn,NString duplSeverityIn,NString timeSeverityIn,NString corqSeverityIn,NString linkSeverityIn,NString preqSeverityIn,NString maxhSeverityIn,NString minhSeverityIn,NString mexcSeverityIn,NNumber mhrsOverIn,NNumber minHrsIn,NString sessionidIn,NString systemIn,Ref<NString> webEditErrorOut,Ref<NString> cappTechErrorOut,Ref<NString> minhErrorOut,List<OwaUtil.IdentArrRow> termListIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKEDIT.P_WEB_GROUP_EDITS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@CALL_TYPE_IN", callTypeIn);
//			cmd.addParameter("@DUPL_SEVERITY_IN", duplSeverityIn);
//			cmd.addParameter("@TIME_SEVERITY_IN", timeSeverityIn);
//			cmd.addParameter("@CORQ_SEVERITY_IN", corqSeverityIn);
//			cmd.addParameter("@LINK_SEVERITY_IN", linkSeverityIn);
//			cmd.addParameter("@PREQ_SEVERITY_IN", preqSeverityIn);
//			cmd.addParameter("@MAXH_SEVERITY_IN", maxhSeverityIn);
//			cmd.addParameter("@MINH_SEVERITY_IN", minhSeverityIn);
//			cmd.addParameter("@MEXC_SEVERITY_IN", mexcSeverityIn);
//			cmd.addParameter("@MHRS_OVER_IN", mhrsOverIn);
//			cmd.addParameter("@MIN_HRS_IN", minHrsIn);
//			cmd.addParameter("@SESSIONID_IN", sessionidIn);
//			cmd.addParameter("@SYSTEM_IN", systemIn);
//			cmd.addParameter("@WEB_EDIT_ERROR_OUT", NString.class);
//			cmd.addParameter("@CAPP_TECH_ERROR_OUT", NString.class);
//			cmd.addParameter("@MINH_ERROR_OUT", NString.class);
//			// cmd.addParameter(DbTypes.getTableType("TERM_LIST_IN", "", termListIn, object.class));
//				
//			cmd.execute();
//			webEditErrorOut.val = cmd.getParameterValue("@WEB_EDIT_ERROR_OUT", NString.class);
//			cappTechErrorOut.val = cmd.getParameterValue("@CAPP_TECH_ERROR_OUT", NString.class);
//			minhErrorOut.val = cmd.getParameterValue("@MINH_ERROR_OUT", NString.class);
//
//
//		}
		
	
	
	
}
