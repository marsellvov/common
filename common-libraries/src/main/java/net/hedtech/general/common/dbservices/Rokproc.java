package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokproc {
		public static void pCheckRorstatVerPay(NNumber pAidyEndYear,NString pVerPayInd,Ref<NString> pVerComplete,Ref<NString> pPellOrigInd,Ref<NString> pVerUserId,Ref<NDate> pVerDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPROC.P_CHECK_RORSTAT_VER_PAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_END_YEAR", pAidyEndYear);
			cmd.addParameter("@P_VER_PAY_IND", pVerPayInd);
			cmd.addParameter("@P_VER_COMPLETE", pVerComplete, true);
			cmd.addParameter("@P_PELL_ORIG_IND", NString.class);
			cmd.addParameter("@P_VER_USER_ID", pVerUserId, true);
			cmd.addParameter("@P_VER_DATE", pVerDate, true);
				
			cmd.execute();
			pVerComplete.val = cmd.getParameterValue("@P_VER_COMPLETE", NString.class);
			pPellOrigInd.val = cmd.getParameterValue("@P_PELL_ORIG_IND", NString.class);
			pVerUserId.val = cmd.getParameterValue("@P_VER_USER_ID", NString.class);
			pVerDate.val = cmd.getParameterValue("@P_VER_DATE", NDate.class);


		}
		
	
	
	
}
