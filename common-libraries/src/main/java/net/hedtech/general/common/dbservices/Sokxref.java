package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokxref {
		public static void pCopyXref(NString xlblLabel,NString ediInd,NString xmlInd,NString webInd,NString qlfr,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKXREF.P_COPY_XREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XLBL_LABEL", xlblLabel);
			cmd.addParameter("@EDI_IND", ediInd);
			cmd.addParameter("@XML_IND", xmlInd);
			cmd.addParameter("@WEB_IND", webInd);
			cmd.addParameter("@QLFR", qlfr);
			cmd.addParameter("@VALIDATION_ERROR_IND", validationErrorInd, true);
			cmd.addParameter("@VALIDATION_ERROR_MSG", validationErrorMsg, true);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
	
	
	
}
