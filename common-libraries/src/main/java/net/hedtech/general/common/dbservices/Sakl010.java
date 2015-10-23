package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakl010 {
		public static void pLoadApplication(NNumber aidm,NNumber applSeqno,NString wappCode,NNumber pidm,NString applTerm,NString wadfAutoApplInd,Ref<NNumber> adapApplno,Ref<NString> errorInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKL010.P_LOAD_APPLICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_TERM", applTerm);
			cmd.addParameter("@WADF_AUTO_APPL_IND", wadfAutoApplInd);
			cmd.addParameter("@ADAP_APPLNO", NNumber.class);
			cmd.addParameter("@ERROR_IND", errorInd, true);
				
			cmd.execute();
			adapApplno.val = cmd.getParameterValue("@ADAP_APPLNO", NNumber.class);
			errorInd.val = cmd.getParameterValue("@ERROR_IND", NString.class);


		}
		
	
	
	
}
