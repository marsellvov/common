package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkglib {
		public static NBool fIsdate(NString str,NString fmtStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKGLIB.F_ISDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@STR", str);
			cmd.addParameter("@FMT_STR", fmtStr);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fIsnumber(NString str,NString fmtStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKGLIB.F_ISNUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@STR", str);
			cmd.addParameter("@FMT_STR", fmtStr);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fPinlength() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKGLIB.F_PINLENGTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fPinlengthValidate(NString pPin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKGLIB.F_PINLENGTH_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PIN", pPin);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NDate fPinnextexpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKGLIB.F_PINNEXTEXPDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NBool fPinreused(NNumber pidm,NString npin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKGLIB.F_PINREUSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@NPIN", npin);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fPinrulesValidate(NNumber pPidm,NString pPin,NString pPinReusechkInd,Ref<NString> errorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKGLIB.F_PINRULES_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_PIN_REUSECHK_IND", pPinReusechkInd);
			cmd.addParameter("@ERROR_MESSAGE", NString.class);
				
			cmd.execute();
			errorMessage.val = cmd.getParameterValue("@ERROR_MESSAGE", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fStralldigits(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKGLIB.F_STRALLDIGITS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@STR", str);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
