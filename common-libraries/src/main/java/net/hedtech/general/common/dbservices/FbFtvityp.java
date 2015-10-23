package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbFtvityp {
		public static NString fCodeExists(NNumber pSeqCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FTVITYP.F_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEQ_CODE", pSeqCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDescription(NNumber pSeqCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_FTVITYP.F_GET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEQ_CODE", pSeqCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
