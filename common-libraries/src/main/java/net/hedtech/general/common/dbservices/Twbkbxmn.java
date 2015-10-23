package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkbxmn {
		public static NBool fBxsDocEnabled(NString vPageName,NString vDocName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKBXMN.F_BXS_DOC_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_PAGE_NAME", vPageName);
			cmd.addParameter("@V_DOC_NAME", vDocName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fBxsInstalled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKBXMN.F_BXS_INSTALLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetBxsParm(NString vName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKBXMN.F_GET_BXS_PARM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_NAME", vName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetBxsUrl(Ref<NNumber> vPidm,NString vPageName,NString vDocName,Ref<NString> vUploadUrl,Ref<NString> vDownloadUrl,Ref<NString> vViewUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKBXMN.P_GET_BXS_URL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_PIDM", vPidm, true);
			cmd.addParameter("@V_PAGE_NAME", vPageName);
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
		
		public static void pSetBxsParm(NString vName,NString vValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKBXMN.P_SET_BXS_PARM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_NAME", vName);
			cmd.addParameter("@V_VALUE", vValue);
				
			cmd.execute();


		}
		
	
	
	
}
