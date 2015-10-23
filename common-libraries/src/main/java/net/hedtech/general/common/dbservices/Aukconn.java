package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Aukconn {
		public static NString fFormatDate(NDate dateField,NString inclTimeZone) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AUKCONN.F_FORMAT_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DATE_FIELD", dateField);
			cmd.addParameter("@INCL_TIME_ZONE", inclTimeZone);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBuildTransferOut(NNumber transIdIn,NString cdefCodeIn,NDate startDateIn,NDate endDateIn,NString filenameIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AUKCONN.P_BUILD_TRANSFER_OUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
			cmd.addParameter("@CDEF_CODE_IN", cdefCodeIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@END_DATE_IN", endDateIn);
			cmd.addParameter("@FILENAME_IN", filenameIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pPostAubtrin(NNumber transIdIn,NNumber pidmIn,NString dataOriginIn,NString addrSrceIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AUKCONN.P_POST_AUBTRIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DATA_ORIGIN_IN", dataOriginIn);
			cmd.addParameter("@ADDR_SRCE_IN", addrSrceIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
	
	
	
}
