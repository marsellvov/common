package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlHealthExp {
		public static void pHealthElement(NNumber pRequestPidmIn,Ref<DataCursor> pImmunizationRefcsrOut,Ref<NString> pHealthNoteOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_HEALTH_EXP.P_HEALTH_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_IMMUNIZATION_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_HEALTH_NOTE_OUT", NString.class);
				
			cmd.execute();
			pImmunizationRefcsrOut.val = cmd.getParameterValue("@P_IMMUNIZATION_REFCSR_OUT", DataCursor.class);
			pHealthNoteOut.val = cmd.getParameterValue("@P_HEALTH_NOTE_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="ImmunizationRow", dataSourceName="IMMUNIZATION")
	public static class ImmunizationRow
	{
		@DbRecordField(dataSourceName="IMMUNIZATIONDATE")
		public NString Immunizationdate;
		@DbRecordField(dataSourceName="IMMUNIZATIONCODE")
		public NString Immunizationcode;
		@DbRecordField(dataSourceName="NOTEMESSAGE")
		public NString Notemessage;
	}

	
	
}
