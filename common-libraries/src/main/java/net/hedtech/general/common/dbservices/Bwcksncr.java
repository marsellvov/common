package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwcksncr {
		public static NBool fIpCrseExists(NNumber param1,NNumber param2,NString param3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.F_IP_CRSE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fPlannedCrseExists(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.F_PLANNED_CRSE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fProgInclExclLvlExists(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.F_PROG_INCL_EXCL_LVL_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fProgRestrGrdeExists(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.F_PROG_RESTR_GRDE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fProgRestrSubjExists(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.F_PROG_RESTR_SUBJ_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fRejectCrseExists(NNumber param1,NNumber param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.F_REJECT_CRSE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fUnusedAttrExists(NNumber param1,NNumber param2,NString param3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.F_UNUSED_ATTR_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fUnusedCrseExists(NNumber param1,NNumber param2,NString param3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.F_UNUSED_CRSE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FgetActnDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.GET_ACTN_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetAttrDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.GET_ATTR_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetAttsDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.GET_ATTS_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetNcrqDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.GET_NCRQ_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetNcstDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.GET_NCST_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDecodeAndOr(NString param1,Ref<NString> con) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DECODE_AND_OR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@CON", NString.class);
				
			cmd.execute();
			con.val = cmd.getParameterValue("@CON", NString.class);


		}
		
		public static void pDispevaladditional(NNumber requestNo,NString printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPEVALADDITIONAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQUEST_NO", requestNo);
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly);
				
			cmd.execute();


		}
		
		public static void pDisplayAttrNotUsed(Ref<NString> printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPLAY_ATTR_NOT_USED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
				
			cmd.execute();
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pDisplayCoursesNotUsed(Ref<NString> printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPLAY_COURSES_NOT_USED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
				
			cmd.execute();
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pDisplayInclExclLvl(Ref<NString> printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPLAY_INCL_EXCL_LVL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
				
			cmd.execute();
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pDisplayIpCourse(Ref<NString> printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPLAY_IP_COURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
				
			cmd.execute();
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pDisplayNcr(Ref<NString> printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPLAY_NCR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
				
			cmd.execute();
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pDisplayPlanCrse(Ref<NString> printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPLAY_PLAN_CRSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
				
			cmd.execute();
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pDisplayProgAttr(Ref<NString> printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPLAY_PROG_ATTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
				
			cmd.execute();
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pDisplayRejected(Ref<NString> printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPLAY_REJECTED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
				
			cmd.execute();
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pDisplayRestrGrde(Ref<NString> printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPLAY_RESTR_GRDE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
				
			cmd.execute();
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pDisplayRestrSubjAttr(Ref<NString> printerFriendly) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_DISPLAY_RESTR_SUBJ_ATTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRINTER_FRIENDLY", printerFriendly, true);
				
			cmd.execute();
			printerFriendly.val = cmd.getParameterValue("@PRINTER_FRIENDLY", NString.class);


		}
		
		public static void pFormatNcrHeaders(NString param1,NString param2,Ref<NString> headText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSNCR.P_FORMAT_NCR_HEADERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@HEAD_TEXT", NString.class);
				
			cmd.execute();
			headText.val = cmd.getParameterValue("@HEAD_TEXT", NString.class);


		}
		
	
	
	
}
