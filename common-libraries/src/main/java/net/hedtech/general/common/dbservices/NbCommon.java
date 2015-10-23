package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbCommon {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_COMMON.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fConcatErrorMessages(NString pDelimErrorMsg1,NString pDelimErrorMsg2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_COMMON.F_CONCAT_ERROR_MESSAGES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DELIM_ERROR_MSG_1", pDelimErrorMsg1);
			cmd.addParameter("@P_DELIM_ERROR_MSG_2", pDelimErrorMsg2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConcatWarningMessages(NString pDelimWarningMsg1,NString pDelimWarningMsg2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_COMMON.F_CONCAT_WARNING_MESSAGES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DELIM_WARNING_MSG_1", pDelimWarningMsg1);
			cmd.addParameter("@P_DELIM_WARNING_MSG_2", pDelimWarningMsg2);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fMaxDate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_COMMON.F_MAX_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fMinDate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_COMMON.F_MIN_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fPrefacedWarningMessage(NString pDelimWarningMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_COMMON.F_PREFACED_WARNING_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DELIM_WARNING_MSG", pDelimWarningMsg);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pOverlay(Ref<NString> pExistingValueInout,NString pEnteredValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_COMMON.P_OVERLAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXISTING_VALUE_INOUT", pExistingValueInout, true);
			cmd.addParameter("@P_ENTERED_VALUE", pEnteredValue);
				
			cmd.execute();
			pExistingValueInout.val = cmd.getParameterValue("@P_EXISTING_VALUE_INOUT", NString.class);


		}
		
		public static void pOverlay(Ref<NNumber> pExistingValueInout,NNumber pEnteredValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_COMMON.P_OVERLAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXISTING_VALUE_INOUT", pExistingValueInout, true);
			cmd.addParameter("@P_ENTERED_VALUE", pEnteredValue);
				
			cmd.execute();
			pExistingValueInout.val = cmd.getParameterValue("@P_EXISTING_VALUE_INOUT", NNumber.class);


		}
		
		public static void pOverlay(Ref<NDate> pExistingValueInout,NDate pEnteredValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_COMMON.P_OVERLAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXISTING_VALUE_INOUT", pExistingValueInout, true);
			cmd.addParameter("@P_ENTERED_VALUE", pEnteredValue);
				
			cmd.execute();
			pExistingValueInout.val = cmd.getParameterValue("@P_EXISTING_VALUE_INOUT", NDate.class);


		}
		
	
	
	
}
