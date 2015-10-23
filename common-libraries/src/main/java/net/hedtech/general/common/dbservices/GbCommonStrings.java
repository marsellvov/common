package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbCommonStrings {
		public static NString fAppendError(NString pOriginalMessage,NString pErrorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON_STRINGS.F_APPEND_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ORIGINAL_MESSAGE", pOriginalMessage);
			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetError(NString pErrorname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON_STRINGS.F_GET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetErrorWithValue(NString pPackage,NString pErrorname,NString pValue01,NString pValue02,NString pValue03) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON_STRINGS.F_GET_ERROR_WITH_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PACKAGE", pPackage);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
			cmd.addParameter("@P_VALUE01", pValue01);
			cmd.addParameter("@P_VALUE02", pValue02);
			cmd.addParameter("@P_VALUE03", pValue03);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		 @DbRecordType(id="ErrTypeRow", dataSourceName="GB_COMMON_STRINGS.ERR_TYPE")
		    public static class ErrTypeRow
		    {
		        @DbRecordField(dataSourceName="ErrType")
		        public NString ErrType;

		    }
		
		 @DbTableType(id="GbCommonStrings.errmsg_tab_type", dataSourceName="GB_COMMON_STRINGS.ERRMSG_TAB_TYPE", indexed=true)
	        public static class GbCommonStringsErrmsgTabType extends Table<ErrTypeRow> {
	       
			 public NString ErrType;
			 
		 }

	
	
}
