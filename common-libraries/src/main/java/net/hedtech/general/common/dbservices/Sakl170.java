package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakl170 {
		public static NBool fSarchklExists(NNumber pidm,NString term,NNumber applNo,NString admrCode,Ref<NDate> receiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKL170.F_SARCHKL_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@APPL_NO", applNo);
			cmd.addParameter("@ADMR_CODE", admrCode);
			cmd.addParameter("@RECEIVE_DATE", receiveDate, true);
				
			cmd.execute();
			receiveDate.val = cmd.getParameterValue("@RECEIVE_DATE", NDate.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pLoadSarquan(NNumber aidm,NNumber applSeqno,NNumber seqno,NString wappCode,NNumber pidm,NString term,Ref<NString> errorInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKL170.P_LOAD_SARQUAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@ERROR_IND", errorInd, true);
				
			cmd.execute();
			errorInd.val = cmd.getParameterValue("@ERROR_IND", NString.class);


		}
		
	
	
	
}
