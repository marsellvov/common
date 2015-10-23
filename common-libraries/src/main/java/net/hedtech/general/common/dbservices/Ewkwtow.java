package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ewkwtow {
		public static NString fGetDatasource() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EWKWTOW.F_GET_DATASOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetKey() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EWKWTOW.F_GET_KEY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetServer() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EWKWTOW.F_GET_SERVER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fParas(NString vNames,NString vValue,NString eKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EWKWTOW.F_PARAS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_NAMES", vNames);
			cmd.addParameter("@V_VALUE", vValue);
			cmd.addParameter("@E_KEY", eKey);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pConstructUrl(Ref<NString> vStr1,Ref<NString> vUploadUrl,Ref<NString> vDownloadUrl,Ref<NString> vViewUrl,NString vApplName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EWKWTOW.P_CONSTRUCT_URL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_STR1", vStr1, true);
			cmd.addParameter("@V_UPLOAD_URL", vUploadUrl, true);
			cmd.addParameter("@V_DOWNLOAD_URL", vDownloadUrl, true);
			cmd.addParameter("@V_VIEW_URL", vViewUrl, true);
			cmd.addParameter("@V_APPL_NAME", vApplName);
				
			cmd.execute();
			vStr1.val = cmd.getParameterValue("@V_STR1", NString.class);
			vUploadUrl.val = cmd.getParameterValue("@V_UPLOAD_URL", NString.class);
			vDownloadUrl.val = cmd.getParameterValue("@V_DOWNLOAD_URL", NString.class);
			vViewUrl.val = cmd.getParameterValue("@V_VIEW_URL", NString.class);


		}
		
		public static void pGetUnamePass(Ref<NString> vUname,Ref<NString> vPasswrd,NString vApplName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EWKWTOW.P_GET_UNAME_PASS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_UNAME", vUname, true);
			cmd.addParameter("@V_PASSWRD", vPasswrd, true);
			cmd.addParameter("@V_APPL_NAME", vApplName);
				
			cmd.execute();
			vUname.val = cmd.getParameterValue("@V_UNAME", NString.class);
			vPasswrd.val = cmd.getParameterValue("@V_PASSWRD", NString.class);


		}
		
		public static void pGetUrl(Ref<NNumber> vPidm,NString vName,NString vDocName,Ref<NString> vUploadUrl,Ref<NString> vDownloadUrl,Ref<NString> vViewUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EWKWTOW.P_GET_URL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_PIDM", vPidm, true);
			cmd.addParameter("@V_NAME", vName);
			cmd.addParameter("@V_DOC_NAME", vDocName);
			cmd.addParameter("@V_UPLOAD_URL", NString.class);
			cmd.addParameter("@V_DOWNLOAD_URL", NString.class);
			cmd.addParameter("@V_VIEW_URL", NString.class);
				
			cmd.execute();
			vPidm.val = cmd.getParameterValue("@V_PIDM", NNumber.class);
			vUploadUrl.val = cmd.getParameterValue("@V_UPLOAD_URL", NString.class);
			vDownloadUrl.val = cmd.getParameterValue("@V_DOWNLOAD_URL", NString.class);
			vViewUrl.val = cmd.getParameterValue("@V_VIEW_URL", NString.class);


		}
		
	
	
	
}
