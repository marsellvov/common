package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkilib {
		public static NString fActivefacadvr(NNumber facPidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_ACTIVEFACADVR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fAddDrp(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_ADD_DRP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fCheckadvisorrelation(NNumber facPidm,NNumber stuPidm,NString term,NString procCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_CHECKADVISORRELATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@STU_PIDM", stuPidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@PROC_CODE", procCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCheckcrnaccess(NNumber facPidm,NString term,NString crn,NString calledFrom) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_CHECKCRNACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@CALLED_FROM", calledFrom);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckdeadind(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_CHECKDEADIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCheckfacultyrelation(NNumber facPidm,NNumber stuPidm,NString term,NString procCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_CHECKFACULTYRELATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@STU_PIDM", stuPidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@PROC_CODE", procCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCheckprocessdates(NString term,NString inclInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_CHECKPROCESSDATES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@INCL_IND", inclInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fClaslst(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_CLASLST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fClassListEnroll(NString termIn,NString crnIn,NString ptrmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_CLASS_LIST_ENROLL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PTRM_IN", ptrmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fFacschd(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_FACSCHD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFgrd(NString termIn,NString ptrmIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_FGRD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PTRM_IN", ptrmIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetusername(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_GETUSERNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fGradebookExists(NString idIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_GRADEBOOK_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fMgrd(NString termIn,NString ptrmIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_MGRD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PTRM_IN", ptrmIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fOverapp(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_OVERAPP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fPrimaryfac(NString term,NString crn,NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_PRIMARYFAC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidaccessrequest(NNumber facPidm,NNumber stuPidm,NString term,NString facadvrInd,NString stuPin,NString procCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_VALIDACCESSREQUEST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@FAC_PIDM", facPidm);
			cmd.addParameter("@STU_PIDM", stuPidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@FACADVR_IND", facadvrInd);
			cmd.addParameter("@STU_PIN", stuPin);
			cmd.addParameter("@PROC_CODE", procCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidfac(NString term,NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_VALIDFAC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidfacforcrn(NString term,NNumber pidm,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_VALIDFACFORCRN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fVerifyfacadvrproc(NString facadvrSrceInd,NString process,NString facadvrValue,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_VERIFYFACADVRPROC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@FACADVR_SRCE_IND", facadvrSrceInd);
			cmd.addParameter("@PROCESS", process);
			cmd.addParameter("@FACADVR_VALUE", facadvrValue);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fWaitListCount(NString termIn,NString crnIn,NString ptrmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_WAIT_LIST_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PTRM_IN", ptrmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fWaitlst(NString termIn,NString ptrmIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.F_WAITLST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PTRM_IN", ptrmIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pEmaillist(NString toValueIn,NString linkMsgIn,NString emailTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.P_EMAILLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TO_VALUE_IN", toValueIn);
			cmd.addParameter("@LINK_MSG_IN", linkMsgIn);
			cmd.addParameter("@EMAIL_TYPE_IN", emailTypeIn);
				
			cmd.execute();


		}
		
		public static void pFacstupin(NNumber stupidm,NString callingProc,NString pinNumb,NString msg,NString ldapUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.P_FACSTUPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STUPIDM", stupidm);
			cmd.addParameter("@CALLING_PROC", callingProc);
			cmd.addParameter("@PIN_NUMB", pinNumb);
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@LDAP_USERID", ldapUserid);
				
			cmd.execute();


		}
		
//		public static void pFacstupin(NNumber stupidm,NString callingProc,NString pinNumb,NString msg,List<OwaUtil.IdentArrRow> termIn,NString ldapUserid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.P_FACSTUPIN", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@STUPIDM", stupidm);
//			cmd.addParameter("@CALLING_PROC", callingProc);
//			cmd.addParameter("@PIN_NUMB", pinNumb);
//			cmd.addParameter("@MSG", msg);
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			cmd.addParameter("@LDAP_USERID", ldapUserid);
//				
//			cmd.execute();
//
//
//		}
//		
		public static void pFacstupindisp(NNumber stupidm,NString callingProc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.P_FACSTUPINDISP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STUPIDM", stupidm);
			cmd.addParameter("@CALLING_PROC", callingProc);
				
			cmd.execute();


		}
		
		public static void pFacstupinval(NNumber stupidm,NString pinNumb,Ref<NString> errmsg,NString callingProc,NString ldapUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.P_FACSTUPINVAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STUPIDM", stupidm);
			cmd.addParameter("@PIN_NUMB", pinNumb);
			cmd.addParameter("@ERRMSG", NString.class);
			cmd.addParameter("@CALLING_PROC", callingProc);
			cmd.addParameter("@LDAP_USERID", ldapUserid);
				
			cmd.execute();
			errmsg.val = cmd.getParameterValue("@ERRMSG", NString.class);


		}
		
		public static void pInsertshrgcol(NNumber stupidm,NString callingProc,NString term,NString rqstType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKILIB.P_INSERTSHRGCOL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STUPIDM", stupidm);
			cmd.addParameter("@CALLING_PROC", callingProc);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@RQST_TYPE", rqstType);
				
			cmd.execute();


		}
		
	
	
	
}
