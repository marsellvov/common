package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkwlat {
		public static NString fDisplayPosition(NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_DISPLAY_POSITION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmailValue(NNumber pPidm,NString pColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_EMAIL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_COLUMN", pColumn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFallsException(NString pTerm,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_FALLS_EXCEPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetRulePrioNum(NString pTerm,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_GET_RULE_PRIO_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetTotalNotified(NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_GET_TOTAL_NOTIFIED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetWlPos(NNumber pPidm,NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_GET_WL_POS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetWlPrioOriginValue(NString pWlOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_GET_WL_PRIO_ORIGIN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_WL_ORIGIN", pWlOrigin);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetWlRegStatusValue(NString pWlRegStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_GET_WL_REG_STATUS_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_WL_REG_STATUS", pWlRegStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIncludeWaitlistCrse(NString pTerm,NString pCrn,NString pColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_INCLUDE_WAITLIST_CRSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_COLUMN", pColumn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsSeatsAvailable(NString pTerm,NString pCrn,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_IS_SEATS_AVAILABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStudentIsNotified(NString pTerm,NString pCrn,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_STUDENT_IS_NOTIFIED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fWlApplyReordering(NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_WL_APPLY_REORDERING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fWlAutomationActive(NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_WL_AUTOMATION_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fWlNotificationValue(NString pTerm,NNumber pPidm,NString pCrn,NString pColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_WL_NOTIFICATION_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_COLUMN", pColumn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fWlRegistrationExists(NString pTerm,NString pCrn,NString pXlstGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.F_WL_REGISTRATION_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_XLST_GROUP", pXlstGroup);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pNotificationCrn(NString pTerm,NString pCrn,NNumber pAvailSeats) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_NOTIFICATION_CRN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_AVAIL_SEATS", pAvailSeats);
				
			cmd.execute();


		}
		
		public static void pNotificationExpires(NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_NOTIFICATION_EXPIRES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();


		}
		
		public static void pNotificationReserved(NString pTerm,NString pCrn,NString pXlstGroup,Ref<NString> pNotifyFlagInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_NOTIFICATION_RESERVED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_XLST_GROUP", pXlstGroup);
			cmd.addParameter("@P_NOTIFY_FLAG_INOUT", pNotifyFlagInout, true);
				
			cmd.execute();
			pNotifyFlagInout.val = cmd.getParameterValue("@P_NOTIFY_FLAG_INOUT", NString.class);


		}
		
		public static void pNotificationXlst(NString pTerm,NString pCrn,NNumber pCrnAvailSeats,NString pXlstGroup,NNumber pXlstAvailSeats) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_NOTIFICATION_XLST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CRN_AVAIL_SEATS", pCrnAvailSeats);
			cmd.addParameter("@P_XLST_GROUP", pXlstGroup);
			cmd.addParameter("@P_XLST_AVAIL_SEATS", pXlstAvailSeats);
				
			cmd.execute();


		}
		
		public static void pRemoveExpiredNotification(NString pTerm,NString pSessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_REMOVE_EXPIRED_NOTIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_SESSIONID", pSessionid);
				
			cmd.execute();


		}
		
		public static void pSendEmail(NString pTerm,NString pCrn,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_SEND_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pSetPrioritySeq(NString pTerm,NString pCrn,NString pManualOverride,Ref<NNumber> pPrioritySeqInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_SET_PRIORITY_SEQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_MANUAL_OVERRIDE", pManualOverride);
			cmd.addParameter("@P_PRIORITY_SEQ_IN_OUT", pPrioritySeqInOut, true);
				
			cmd.execute();
			pPrioritySeqInOut.val = cmd.getParameterValue("@P_PRIORITY_SEQ_IN_OUT", NNumber.class);


		}
		
		public static void pSetPrioritySeqXlst(NString pTerm,NString pXlstGroup,NString pManualOverride,Ref<NNumber> pPrioritySeqInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_SET_PRIORITY_SEQ_XLST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_XLST_GROUP", pXlstGroup);
			cmd.addParameter("@P_MANUAL_OVERRIDE", pManualOverride);
			cmd.addParameter("@P_PRIORITY_SEQ_IN_OUT", pPrioritySeqInOut, true);
				
			cmd.execute();
			pPrioritySeqInOut.val = cmd.getParameterValue("@P_PRIORITY_SEQ_IN_OUT", NNumber.class);


		}
		
		public static void pSetSeverityFlags(NString pTerm,NString pCrn,Ref<NString> apprSeverityInOut,Ref<NString> levlSeverityInOut,Ref<NString> collSeverityInOut,Ref<NString> degrSeverityInOut,Ref<NString> progSeverityInOut,Ref<NString> majrSeverityInOut,Ref<NString> campSeverityInOut,Ref<NString> clasSeverityInOut,Ref<NString> capcSeverityInOut,Ref<NString> deptSeverityInOut,Ref<NString> attsSeverityInOut,Ref<NString> chrtSeverityInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_SET_SEVERITY_FLAGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@APPR_SEVERITY_IN_OUT", apprSeverityInOut, true);
			cmd.addParameter("@LEVL_SEVERITY_IN_OUT", levlSeverityInOut, true);
			cmd.addParameter("@COLL_SEVERITY_IN_OUT", collSeverityInOut, true);
			cmd.addParameter("@DEGR_SEVERITY_IN_OUT", degrSeverityInOut, true);
			cmd.addParameter("@PROG_SEVERITY_IN_OUT", progSeverityInOut, true);
			cmd.addParameter("@MAJR_SEVERITY_IN_OUT", majrSeverityInOut, true);
			cmd.addParameter("@CAMP_SEVERITY_IN_OUT", campSeverityInOut, true);
			cmd.addParameter("@CLAS_SEVERITY_IN_OUT", clasSeverityInOut, true);
			cmd.addParameter("@CAPC_SEVERITY_IN_OUT", capcSeverityInOut, true);
			cmd.addParameter("@DEPT_SEVERITY_IN_OUT", deptSeverityInOut, true);
			cmd.addParameter("@ATTS_SEVERITY_IN_OUT", attsSeverityInOut, true);
			cmd.addParameter("@CHRT_SEVERITY_IN_OUT", chrtSeverityInOut, true);
				
			cmd.execute();
			apprSeverityInOut.val = cmd.getParameterValue("@APPR_SEVERITY_IN_OUT", NString.class);
			levlSeverityInOut.val = cmd.getParameterValue("@LEVL_SEVERITY_IN_OUT", NString.class);
			collSeverityInOut.val = cmd.getParameterValue("@COLL_SEVERITY_IN_OUT", NString.class);
			degrSeverityInOut.val = cmd.getParameterValue("@DEGR_SEVERITY_IN_OUT", NString.class);
			progSeverityInOut.val = cmd.getParameterValue("@PROG_SEVERITY_IN_OUT", NString.class);
			majrSeverityInOut.val = cmd.getParameterValue("@MAJR_SEVERITY_IN_OUT", NString.class);
			campSeverityInOut.val = cmd.getParameterValue("@CAMP_SEVERITY_IN_OUT", NString.class);
			clasSeverityInOut.val = cmd.getParameterValue("@CLAS_SEVERITY_IN_OUT", NString.class);
			capcSeverityInOut.val = cmd.getParameterValue("@CAPC_SEVERITY_IN_OUT", NString.class);
			deptSeverityInOut.val = cmd.getParameterValue("@DEPT_SEVERITY_IN_OUT", NString.class);
			attsSeverityInOut.val = cmd.getParameterValue("@ATTS_SEVERITY_IN_OUT", NString.class);
			chrtSeverityInOut.val = cmd.getParameterValue("@CHRT_SEVERITY_IN_OUT", NString.class);


		}
		
		public static void pValidateWlCollector(NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_VALIDATE_WL_COLLECTOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();


		}
		
		public static void pWaitlistAssignPrio(NString pTerm,NString pCrn,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_WAITLIST_ASSIGN_PRIO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pWaitlistAutoReorder(NString pTerm,NString pCrn,NString pXlstGroup,NString pManualOverride) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_WAITLIST_AUTO_REORDER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_XLST_GROUP", pXlstGroup);
			cmd.addParameter("@P_MANUAL_OVERRIDE", pManualOverride);
				
			cmd.execute();


		}
		
		public static void pWaitlistAutomation(NString pTerm,NString pCrn,NNumber pAvailSeats,NString pReservedInd,NString pXlstGroup,NNumber pXlstAvailSeats) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_WAITLIST_AUTOMATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_AVAIL_SEATS", pAvailSeats);
			cmd.addParameter("@P_RESERVED_IND", pReservedInd);
			cmd.addParameter("@P_XLST_GROUP", pXlstGroup);
			cmd.addParameter("@P_XLST_AVAIL_SEATS", pXlstAvailSeats);
				
			cmd.execute();


		}
		
		public static void pWaitlistNotification(NString pTerm,NString pCrn,NNumber pAvailSeats,NString pReservedInd,NString pXlstGroup,NNumber pXlstAvailSeats) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_WAITLIST_NOTIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_AVAIL_SEATS", pAvailSeats);
			cmd.addParameter("@P_RESERVED_IND", pReservedInd);
			cmd.addParameter("@P_XLST_GROUP", pXlstGroup);
			cmd.addParameter("@P_XLST_AVAIL_SEATS", pXlstAvailSeats);
				
			cmd.execute();


		}
		
		public static void pWlNotifyPidm(NString pTerm,NString pCrn,NNumber pPidm,NNumber pWlPrio) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWLAT.P_WL_NOTIFY_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_WL_PRIO", pWlPrio);
				
			cmd.execute();


		}
		
	
	
	
}
