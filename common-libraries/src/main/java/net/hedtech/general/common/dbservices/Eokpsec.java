package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokpsec {
		public static NString fChkHrSecurity(NString idIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPSEC.F_CHK_HR_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkHrSecurity(NString idIn,NNumber pidmIn,NString posnIn,NString suffixIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPSEC.F_CHK_HR_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@POSN_IN", posnIn);
			cmd.addParameter("@SUFFIX_IN", suffixIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pMultiindexHrSecurTest(NNumber appidIn,NNumber docidIn,NString usernameIn,Ref<NNumber> quantIdxsExaminedOut,Ref<NString> denialMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPSEC.P_MULTIINDEX_HR_SECUR_TEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPID_IN", appidIn);
			cmd.addParameter("@DOCID_IN", docidIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@QUANT_IDXS_EXAMINED_OUT", NNumber.class);
			cmd.addParameter("@DENIAL_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			quantIdxsExaminedOut.val = cmd.getParameterValue("@QUANT_IDXS_EXAMINED_OUT", NNumber.class);
			denialMessageOut.val = cmd.getParameterValue("@DENIAL_MESSAGE_OUT", NString.class);


		}
		
	
	
	
}
