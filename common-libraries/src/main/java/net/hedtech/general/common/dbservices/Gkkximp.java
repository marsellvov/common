package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkximp {
//		public static NBool fProcessXml(NString pProcess,Xmldom.DomdocumentRow pXmlDom,NNumber pProcessSeqno,Ref<NString> pErrmsgOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKXIMP.F_PROCESS_XML", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NBool.class);
//			cmd.addParameter("@P_PROCESS", pProcess);
//			cmd.addParameter(DbTypes.createStructType("P_XML_DOM", pXmlDom, Xmldom.DomdocumentRow.class ));
//			cmd.addParameter("@P_PROCESS_SEQNO", pProcessSeqno);
//			cmd.addParameter("@P_ERRMSG_OUT", NString.class);
//				
//			cmd.execute();
//			pErrmsgOut.val = cmd.getParameterValue("@P_ERRMSG_OUT", NString.class);
//
//			return cmd.getReturnValue(NBool.class);
//
//		}
		
		public static NBool fProcessXml(NString pProcess,NString pDirectory,NNumber pProcessSeqno,Ref<NString> pErrmsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKXIMP.F_PROCESS_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_DIRECTORY", pDirectory);
			cmd.addParameter("@P_PROCESS_SEQNO", pProcessSeqno);
			cmd.addParameter("@P_ERRMSG_OUT", NString.class);
				
			cmd.execute();
			pErrmsgOut.val = cmd.getParameterValue("@P_ERRMSG_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fXmlProcessExport(NString pProcess,NString pDirectory,Ref<NString> errCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKXIMP.F_XML_PROCESS_EXPORT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_DIRECTORY", pDirectory);
			cmd.addParameter("@ERR_CODE", NString.class);
				
			cmd.execute();
			errCode.val = cmd.getParameterValue("@ERR_CODE", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCompileProcess(NString pProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKXIMP.P_COMPILE_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS", pProcess);
				
			cmd.execute();


		}
		
	
	
	
}
