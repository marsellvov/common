package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakvapl {
		public static NBool fP032Required(NString wappCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKVAPL.F_P032_REQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@WAPP_CODE_IN", wappCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCheckLoad(NNumber aidm,NNumber applSeqno,NString wappCode,NString procLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKVAPL.P_CHECK_LOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PROC_LABEL", procLabel);
				
			cmd.execute();


		}
		
		public static void pLoadRecds(NNumber aidm,NNumber pidm,NNumber applSeqno,NString wappCode,NString termCodeEntry,NString wadfAutoApplInd,Ref<NNumber> adapApplno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKVAPL.P_LOAD_RECDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@TERM_CODE_ENTRY", termCodeEntry);
			cmd.addParameter("@WADF_AUTO_APPL_IND", wadfAutoApplInd);
			cmd.addParameter("@ADAP_APPLNO", NNumber.class);
				
			cmd.execute();
			adapApplno.val = cmd.getParameterValue("@ADAP_APPLNO", NNumber.class);


		}
		
		public static void pVerifyAppl(NNumber aidm,NNumber applSeqno,NString wappCode,NString aplsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKVAPL.P_VERIFY_APPL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@APLS_CODE", aplsCode);
				
			cmd.execute();


		}
		
	
	
	
}
