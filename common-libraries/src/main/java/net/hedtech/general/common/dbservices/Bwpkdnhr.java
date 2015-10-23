package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdnhr {
		public static NString fString(NString pStringName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.F_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING_NAME", pStringName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBenefitGroupDriver(NString pEnrollmentType,NNumber pPidm,NString pGroup,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_BENEFIT_GROUP_DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();


		}
		
		public static void pEnrollmentDetlBody(NString pEnrollmentType,NString pBreaCode,NDate pEventDate,NNumber pPidm,NString pDgrp,NString pBdca,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_ENROLLMENT_DETL_BODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DGRP", pDgrp);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
				
			cmd.execute();


		}
		
		public static void pEnrollmentGroupBody(NString pEnrollmentType,NNumber pPidm,NString pDgrp,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_ENROLLMENT_GROUP_BODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DGRP", pDgrp);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();


		}
		
		public static void pEnrollmentGroupShow(NString pEnrollmentType,NNumber pPidm,NString pBenefitGroup,NString pBdca,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_ENROLLMENT_GROUP_SHOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BENEFIT_GROUP", pBenefitGroup);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();


		}
		
		public static void pEnrollmentMenuBody(NNumber pPidm,NString pUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_ENROLLMENT_MENU_BODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USERID", pUserid);
				
			cmd.execute();


		}
		
		public static void pEnrollmentUpdateBody(NString pEnrollmentType,NString pBreaCode,NDate pEventDate,NNumber pPidm,NString pDgrp,NString pBdca,NDate pBenefitEffDate,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_ENROLLMENT_UPDATE_BODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DGRP", pDgrp);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_BENEFIT_EFF_DATE", pBenefitEffDate);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
		public static void pInitBenefitGroups(NString pEnrollmentType,NNumber pPidm,NString pBreaCode,NDate pEventDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_INIT_BENEFIT_GROUPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
				
			cmd.execute();


		}
		
		public static void pInitEnrlDates(NString pEnrollmentType,NNumber pPidm,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_INIT_ENRL_DATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();


		}
		
		public static void pInitEnrlVariables() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_INIT_ENRL_VARIABLES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInitNewhireOeDates(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_INIT_NEWHIRE_OE_DATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pMoveupdatestodtoe(NNumber pPidm,NString pBdca,NString pBreaCode,Ref<NString> pEnrlErrMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_MOVEUPDATESTODTOE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_ENRL_ERR_MSG_OUT", pEnrlErrMsgOut, true);
				
			cmd.execute();
			pEnrlErrMsgOut.val = cmd.getParameterValue("@P_ENRL_ERR_MSG_OUT", NString.class);


		}
		
		public static void pNewhireOeMain(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_NEWHIRE_OE_MAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentedits(NNumber pPidm,NString activatingOe) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_OPENENROLLMENTEDITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@ACTIVATING_OE", activatingOe);
				
			cmd.execute();


		}
		
		public static void pPrintBenefitGroups(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_PRINT_BENEFIT_GROUPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pPrintOneGroup(NString pEnrollmentType,NNumber pPidm,NString pConfirmed,NString pGroupCode,NString pGroupName,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_PRINT_ONE_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENROLLMENT_TYPE", pEnrollmentType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CONFIRMED", pConfirmed);
			cmd.addParameter("@P_GROUP_CODE", pGroupCode);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();


		}
		
		public static void pVerifyChoiceMade(NNumber pPidm,NString pBdca,NDate pEffDate,Ref<NString> pMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDNHR.P_VERIFY_CHOICE_MADE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_MESSAGE_OUT", pMessageOut, true);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);


		}
		
	
	
	
}
