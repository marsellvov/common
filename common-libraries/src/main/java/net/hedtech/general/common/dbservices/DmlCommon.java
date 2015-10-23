package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appsupportlib.Lib;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlCommon {
		
	  	public static final NString UNSPECIFIED_STRING = fUnspecifiedString();
	  	public static final NDate UNSPECIFIED_DATE = fUnspecifiedDate();
	  	public static final NNumber UNSPECIFIED_NUMBER  = fUnspecifiedNumber();      
	     
	
		public static NString fGetSetClause() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_COMMON.F_GET_SET_CLAUSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUnspecifiedClob() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_COMMON.F_UNSPECIFIED_CLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fUnspecifiedDate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_COMMON.F_UNSPECIFIED_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fUnspecifiedNumber() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_COMMON.F_UNSPECIFIED_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fUnspecifiedString() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_COMMON.F_UNSPECIFIED_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddSetItem(NString pColumnName,NString pColumnValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_COMMON.P_ADD_SET_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_COLUMN_VALUE", pColumnValue);
				
			cmd.execute();


		}
		
		public static void pAddSetItem(NString pColumnName,NNumber pColumnValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_COMMON.P_ADD_SET_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_COLUMN_VALUE", pColumnValue);
				
			cmd.execute();


		}
		
		public static void pAddSetItem(NString pColumnName,NDate pColumnValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_COMMON.P_ADD_SET_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_COLUMN_VALUE", pColumnValue);
				
			cmd.execute();


		}
		
	
	
	
}
