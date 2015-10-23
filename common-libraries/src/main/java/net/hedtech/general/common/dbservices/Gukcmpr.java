package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gukcmpr {
		public static NString fCompressName(NString nameField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GUKCMPR.F_COMPRESS_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_FIELD", nameField);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGoqrplsCompressName(NString nameField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GUKCMPR.F_GOQRPLS_COMPRESS_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_FIELD", nameField);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
