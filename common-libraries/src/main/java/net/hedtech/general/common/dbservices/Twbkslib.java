package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkslib {
		public static NString fCascadefetchrole(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_CASCADEFETCHROLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCenturypivot() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_CENTURYPIVOT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckrole(NString roleIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_CHECKROLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ROLE_IN", roleIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDateinputfmt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_DATEINPUTFMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fFetchpidm(NString idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_FETCHPIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fFetchpinformatind() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_FETCHPINFORMATIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormatname(NNumber pidm,NString nameFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_FORMATNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@NAME_FORMAT", nameFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fProceedafterlogin(NNumber pidm,NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_PROCEEDAFTERLOGIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSctUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_SCT_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fUserisdead(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_USERISDEAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidrole(NString _name,NString type,NString chkDisabled) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.F_VALIDROLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@TYPE", type);
			cmd.addParameter("@CHK_DISABLED", chkDisabled);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCreateGobtpac(NNumber pPidm,NString pPinDisabledInd,NString pUsageAcceptInd,NString pUser,NString pPin,NDate pPinExpDate,NString pQuestion,NString pResponse,NString pInsertSource,NString pLdapUser,NString pDataOrigin,NString pExternalUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.P_CREATE_GOBTPAC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PIN_DISABLED_IND", pPinDisabledInd);
			cmd.addParameter("@P_USAGE_ACCEPT_IND", pUsageAcceptInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_PIN_EXP_DATE", pPinExpDate);
			cmd.addParameter("@P_QUESTION", pQuestion);
			cmd.addParameter("@P_RESPONSE", pResponse);
			cmd.addParameter("@P_INSERT_SOURCE", pInsertSource);
			cmd.addParameter("@P_LDAP_USER", pLdapUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EXTERNAL_USER", pExternalUser);
				
			cmd.execute();


		}
		
		public static void pFetchroles(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.P_FETCHROLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pRollback() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.P_ROLLBACK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateGobtpac(NNumber pPidm,NString pPinDisabledInd,NString pUsageAcceptInd,NString pUser,NString pPin,NDate pPinExpDate,NString pExternalUser,NString pQuestion,NString pResponse,NString pInsertSource,NString pLdapUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKSLIB.P_UPDATE_GOBTPAC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PIN_DISABLED_IND", pPinDisabledInd);
			cmd.addParameter("@P_USAGE_ACCEPT_IND", pUsageAcceptInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_PIN_EXP_DATE", pPinExpDate);
			cmd.addParameter("@P_EXTERNAL_USER", pExternalUser);
			cmd.addParameter("@P_QUESTION", pQuestion);
			cmd.addParameter("@P_RESPONSE", pResponse);
			cmd.addParameter("@P_INSERT_SOURCE", pInsertSource);
			cmd.addParameter("@P_LDAP_USER", pLdapUser);
				
			cmd.execute();


		}
		
	
	
	
}
