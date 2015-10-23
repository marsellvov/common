package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gukcnva {
		public static NString fConvChars(NNumber seqIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GUKCNVA.F_CONV_CHARS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SEQ_IN", seqIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConvert(NString textIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GUKCNVA.F_CONVERT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TEXT_IN", textIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMissing(NString textIn,NString remDup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GUKCNVA.F_MISSING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TEXT_IN", textIn);
			cmd.addParameter("@REM_DUP", remDup);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
