package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Phklrrt {
		public static void pBuildLaborRedistRouting(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno,NNumber pTransBatchId,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRRT.P_BUILD_LABOR_REDIST_ROUTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_TRANS_BATCH_ID", pTransBatchId);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
	
	
	
}
