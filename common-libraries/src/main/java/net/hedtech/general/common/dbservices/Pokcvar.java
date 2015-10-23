package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pokcvar {
		public static DataCursor fCodeCv(NString tableNameIn,NString columnListIn,NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKCVAR.F_CODE_CV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@TABLE_NAME_IN", tableNameIn);
			cmd.addParameter("@COLUMN_LIST_IN", columnListIn);
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fPtrcalnCv(NString columnListIn,NString yearIn,NString pictCodeIn,NNumber paynoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKCVAR.F_PTRCALN_CV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@COLUMN_LIST_IN", columnListIn);
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
			cmd.addParameter("@PAYNO_IN", paynoIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fPtreclcCv(NString columnListIn,NString eclsCodeIn,NString lcatCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKCVAR.F_PTRECLC_CV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@COLUMN_LIST_IN", columnListIn);
			cmd.addParameter("@ECLS_CODE_IN", eclsCodeIn);
			cmd.addParameter("@LCAT_CODE_IN", lcatCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fPtreernCv(NString columnListIn,NString eclsCodeIn,NString earnCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKCVAR.F_PTREERN_CV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@COLUMN_LIST_IN", columnListIn);
			cmd.addParameter("@ECLS_CODE_IN", eclsCodeIn);
			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	
}
