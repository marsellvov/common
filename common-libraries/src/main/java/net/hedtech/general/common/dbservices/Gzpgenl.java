package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gzpgenl {
		public static NString fDefaultValue(NString whichValue,NString whichCode,NString whichGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GZPGENL.F_DEFAULT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WHICH_VALUE", whichValue);
			cmd.addParameter("@WHICH_CODE", whichCode);
			cmd.addParameter("@WHICH_GROUP", whichGroup);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGenerateTinNumb(NString fTinNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GZPGENL.F_GENERATE_TIN_NUMB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@F_TIN_NUMBER", fTinNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMailCode(NNumber wsPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GZPGENL.F_GET_MAIL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WS_PIDM", wsPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTinName(NNumber wsPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GZPGENL.F_GET_TIN_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WS_PIDM", wsPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
