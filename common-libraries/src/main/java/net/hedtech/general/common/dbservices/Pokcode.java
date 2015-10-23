package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pokcode {
		public static DataCursor fCodeCv(NString tableNameIn,NString columnListIn,NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKCODE.F_CODE_CV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@TABLE_NAME_IN", tableNameIn);
			cmd.addParameter("@COLUMN_LIST_IN", columnListIn);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		
		public static NString fCodeDesc(NString tableNameIn,NString codeIn) {
			
			return fCodeDesc( tableNameIn,codeIn,NString.getNull());

		}
		
		public static NString fCodeDesc(NString tableNameIn,NString codeIn,NString altColumnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKCODE.F_CODE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME_IN", tableNameIn);
			cmd.addParameter("@CODE_IN", codeIn);
			cmd.addParameter("@ALT_COLUMN_IN", altColumnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCodeExistsInd(NString tableNameIn,NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKCODE.F_CODE_EXISTS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME_IN", tableNameIn);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
