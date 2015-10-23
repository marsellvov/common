package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokedvd {
		public static NString fCalculatenbbposn(NString posnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_CALCULATENBBPOSN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@POSN_CODE", posnCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalculatentralvl(NString alvlCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_CALCULATENTRALVL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ALVL_CODE", alvlCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalculatepebempl(NString passId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_CALCULATEPEBEMPL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASS_ID", passId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChecktransno(NNumber transNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_CHECKTRANSNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_NO", transNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetaddindescription(NString daddCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETADDINDESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DADD_CODE", daddCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetdbuser(NString uname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETDBUSER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@UNAME", uname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetdbuserspridenname(NString uname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETDBUSERSPRIDENNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@UNAME", uname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetdocumenttype(NNumber transNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETDOCUMENTTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_NO", transNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGeteventcode(NString passDoctype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETEVENTCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASS_DOCTYPE", passDoctype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetgroupdescription(NString segcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETGROUPDESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SEGC_CODE", segcCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetmoduledescription(NString vappCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETMODULEDESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@VAPP_CODE", vappCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetpersonname(NString vSpridenId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETPERSONNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_SPRIDEN_ID", vSpridenId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetspridenname(NString passId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETSPRIDENNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASS_ID", passId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetspridenpidm(NString vSpridenId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETSPRIDENPIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@V_SPRIDEN_ID", vSpridenId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGettermdescription(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETTERMDESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGettoday(NString vId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETTODAY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_ID", vId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetuser(NString passId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETUSER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASS_ID", passId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetuserspridenname(NString uname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETUSERSPRIDENNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@UNAME", uname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetwfdhstatus(NNumber transNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETWFDHSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_NO", transNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetwfeddescription(NNumber transNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETWFEDDESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_NO", transNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetwizarddescription(NString daddCode,NString dwizName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_GETWIZARDDESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DADD_CODE", daddCode);
			cmd.addParameter("@DWIZ_NAME", dwizName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fInitiateevent(NNumber transNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_INITIATEEVENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TRANS_NO", transNo);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fValidateaddincode(NString daddCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEADDINCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DADD_CODE", daddCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatecoascode(NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATECOASCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatedadd(NString passDadd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEDADD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASS_DADD", passDadd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateeclscode(NString eclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEECLSCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ECLS_CODE", eclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateemprcode(NString emprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEEMPRCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EMPR_CODE", emprCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatehighlow(NString passLow,NString passHigh) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEHIGHLOW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASS_LOW", passLow);
			cmd.addParameter("@PASS_HIGH", passHigh);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateid(NString vSpridenId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_SPRIDEN_ID", vSpridenId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateind(NString masterInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@MASTER_IND", masterInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatelength(NString passCell) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATELENGTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASS_CELL", passCell);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatenbbposn(NString posnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATENBBPOSN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@POSN_CODE", posnCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatentralvl(NString alvlCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATENTRALVL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ALVL_CODE", alvlCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateorgncode(NString coasCode,NString orgnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEORGNCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateprofile(NString admInd,NString mgrInd,NString grpInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEPROFILE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ADM_IND", admInd);
			cmd.addParameter("@MGR_IND", mgrInd);
			cmd.addParameter("@GRP_IND", grpInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateroles(NString passRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEROLES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASS_ROLE", passRole);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatespridenid(NString passId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATESPRIDENID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASS_ID", passId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatetermcode(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATETERMCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateuser(NString uname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEUSER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@UNAME", uname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatewfed(NString passWfed) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEWFED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PASS_WFED", passWfed);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatewizard(NString daddCode,NString dwizName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.F_VALIDATEWIZARD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DADD_CODE", daddCode);
			cmd.addParameter("@DWIZ_NAME", dwizName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pConstructwfedkeys(NString firstName,NString lastName,NString mi,NString vId,Ref<NString> docTypeGen,Ref<NString> passDesc,Ref<NString> passOracleuser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.P_CONSTRUCTWFEDKEYS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@MI", mi);
			cmd.addParameter("@V_ID", vId);
			cmd.addParameter("@DOC_TYPE_GEN", NString.class);
			cmd.addParameter("@PASS_DESC", NString.class);
			cmd.addParameter("@PASS_ORACLEUSER", NString.class);
				
			cmd.execute();
			docTypeGen.val = cmd.getParameterValue("@DOC_TYPE_GEN", NString.class);
			passDesc.val = cmd.getParameterValue("@PASS_DESC", NString.class);
			passOracleuser.val = cmd.getParameterValue("@PASS_ORACLEUSER", NString.class);


		}
		
		public static void pGetdataDocs(NNumber transNo,NString doctype,Ref<NString> vName,Ref<NString> vId,Ref<NString> oracleId,Ref<NString> department,Ref<NString> position,Ref<NString> title,Ref<NString> originator) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.P_GETDATA_DOCS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@DOCTYPE", doctype);
			cmd.addParameter("@V_NAME", NString.class);
			cmd.addParameter("@V_ID", NString.class);
			cmd.addParameter("@ORACLE_ID", NString.class);
			cmd.addParameter("@DEPARTMENT", NString.class);
			cmd.addParameter("@POSITION", NString.class);
			cmd.addParameter("@TITLE", NString.class);
			cmd.addParameter("@ORIGINATOR", NString.class);
				
			cmd.execute();
			vName.val = cmd.getParameterValue("@V_NAME", NString.class);
			vId.val = cmd.getParameterValue("@V_ID", NString.class);
			oracleId.val = cmd.getParameterValue("@ORACLE_ID", NString.class);
			department.val = cmd.getParameterValue("@DEPARTMENT", NString.class);
			position.val = cmd.getParameterValue("@POSITION", NString.class);
			title.val = cmd.getParameterValue("@TITLE", NString.class);
			originator.val = cmd.getParameterValue("@ORIGINATOR", NString.class);


		}
		
		public static void pGetdataGrantGen(NNumber transNo,NString doctype,Ref<NString> vName,Ref<NString> vId,Ref<NString> oracleId,Ref<NString> department,Ref<NString> position,Ref<NString> title,Ref<NString> securityRole1,Ref<NString> securityRole2,Ref<NString> securityRole3,Ref<NString> securityRole4,Ref<NString> securityRole5,Ref<NString> securityRole6,Ref<NString> securityClass1,Ref<NString> securityClass2,Ref<NString> securityClass3,Ref<NString> securityClass4,Ref<NString> securityClass5,Ref<NString> securityClass6,Ref<NString> originator) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.P_GETDATA_GRANT_GEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@DOCTYPE", doctype);
			cmd.addParameter("@V_NAME", NString.class);
			cmd.addParameter("@V_ID", NString.class);
			cmd.addParameter("@ORACLE_ID", NString.class);
			cmd.addParameter("@DEPARTMENT", NString.class);
			cmd.addParameter("@POSITION", NString.class);
			cmd.addParameter("@TITLE", NString.class);
			cmd.addParameter("@SECURITY_ROLE_1", NString.class);
			cmd.addParameter("@SECURITY_ROLE_2", NString.class);
			cmd.addParameter("@SECURITY_ROLE_3", NString.class);
			cmd.addParameter("@SECURITY_ROLE_4", NString.class);
			cmd.addParameter("@SECURITY_ROLE_5", NString.class);
			cmd.addParameter("@SECURITY_ROLE_6", NString.class);
			cmd.addParameter("@SECURITY_CLASS_1", NString.class);
			cmd.addParameter("@SECURITY_CLASS_2", NString.class);
			cmd.addParameter("@SECURITY_CLASS_3", NString.class);
			cmd.addParameter("@SECURITY_CLASS_4", NString.class);
			cmd.addParameter("@SECURITY_CLASS_5", NString.class);
			cmd.addParameter("@SECURITY_CLASS_6", NString.class);
			cmd.addParameter("@ORIGINATOR", NString.class);
				
			cmd.execute();
			vName.val = cmd.getParameterValue("@V_NAME", NString.class);
			vId.val = cmd.getParameterValue("@V_ID", NString.class);
			oracleId.val = cmd.getParameterValue("@ORACLE_ID", NString.class);
			department.val = cmd.getParameterValue("@DEPARTMENT", NString.class);
			position.val = cmd.getParameterValue("@POSITION", NString.class);
			title.val = cmd.getParameterValue("@TITLE", NString.class);
			securityRole1.val = cmd.getParameterValue("@SECURITY_ROLE_1", NString.class);
			securityRole2.val = cmd.getParameterValue("@SECURITY_ROLE_2", NString.class);
			securityRole3.val = cmd.getParameterValue("@SECURITY_ROLE_3", NString.class);
			securityRole4.val = cmd.getParameterValue("@SECURITY_ROLE_4", NString.class);
			securityRole5.val = cmd.getParameterValue("@SECURITY_ROLE_5", NString.class);
			securityRole6.val = cmd.getParameterValue("@SECURITY_ROLE_6", NString.class);
			securityClass1.val = cmd.getParameterValue("@SECURITY_CLASS_1", NString.class);
			securityClass2.val = cmd.getParameterValue("@SECURITY_CLASS_2", NString.class);
			securityClass3.val = cmd.getParameterValue("@SECURITY_CLASS_3", NString.class);
			securityClass4.val = cmd.getParameterValue("@SECURITY_CLASS_4", NString.class);
			securityClass5.val = cmd.getParameterValue("@SECURITY_CLASS_5", NString.class);
			securityClass6.val = cmd.getParameterValue("@SECURITY_CLASS_6", NString.class);
			originator.val = cmd.getParameterValue("@ORIGINATOR", NString.class);


		}
		
		public static void pGetwfedtransInfo(NNumber transNo,Ref<NString> status,Ref<NString> description,Ref<NString> docType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEDVD.P_GETWFEDTRANS_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@STATUS", NString.class);
			cmd.addParameter("@DESCRIPTION", NString.class);
			cmd.addParameter("@DOC_TYPE", NString.class);
				
			cmd.execute();
			status.val = cmd.getParameterValue("@STATUS", NString.class);
			description.val = cmd.getParameterValue("@DESCRIPTION", NString.class);
			docType.val = cmd.getParameterValue("@DOC_TYPE", NString.class);


		}
		
	
	
	
}
