package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakp110 {
		public static void pP110Proc(NNumber aidm,NNumber applSeqno,NNumber seqno,NString wappCode,NString procLabel,Ref<NString> errorInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKP110.P_P110_PROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PROC_LABEL", procLabel);
			cmd.addParameter("@ERROR_IND", errorInd, true);
				
			cmd.execute();
			errorInd.val = cmd.getParameterValue("@ERROR_IND", NString.class);


		}
		
	
	
	
}
