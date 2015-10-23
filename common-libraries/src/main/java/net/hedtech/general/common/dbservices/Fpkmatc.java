package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpkmatc {
		public static NString fGetfobprofind(NNumber docType,NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKMATC.F_GETFOBPROFIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetfobsyscinfo(NNumber docType,NDate transDateInput,Ref<NString> fobsyscInd,Ref<NNumber> fobsyscAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKMATC.P_GETFOBSYSCINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@TRANS_DATE_INPUT", transDateInput);
			cmd.addParameter("@FOBSYSC_IND", NString.class);
			cmd.addParameter("@FOBSYSC_AMT", NNumber.class);
				
			cmd.execute();
			fobsyscInd.val = cmd.getParameterValue("@FOBSYSC_IND", NString.class);
			fobsyscAmt.val = cmd.getParameterValue("@FOBSYSC_AMT", NNumber.class);


		}
		
	
	
	
}
