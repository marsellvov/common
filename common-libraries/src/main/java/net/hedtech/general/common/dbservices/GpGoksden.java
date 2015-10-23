package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGoksden {
		public static NNumber fCountQuery(NString pQuery) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GOKSDEN.F_COUNT_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_QUERY", pQuery);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetPkDef(NString pOwner,NString pTable,NString pUsercols,NString pPrefix,NString pTochar,NString pSep,NString pRefresh) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GOKSDEN.F_GET_PK_DEF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_USERCOLS", pUsercols);
			cmd.addParameter("@P_PREFIX", pPrefix);
			cmd.addParameter("@P_TOCHAR", pTochar);
			cmd.addParameter("@P_SEP", pSep);
			cmd.addParameter("@P_REFRESH", pRefresh);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<Object> fGetSdDataTypes() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GOKSDEN.F_GET_SD_DATA_TYPES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdDataTypeTabTypeRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdDataTypeTabTypeRow>.class);
//
//		}
		
		public static NString fGetTrigger(NString pTemplateName,NString pTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GOKSDEN.F_GET_TRIGGER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TEMPLATE_NAME", pTemplateName);
			cmd.addParameter("@P_TABLE", pTable);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetView(NString pTemplateName,NString pTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GOKSDEN.F_GET_VIEW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TEMPLATE_NAME", pTemplateName);
			cmd.addParameter("@P_TABLE", pTable);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fReplaceTags(NString pStr,NString pAttr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GOKSDEN.F_REPLACE_TAGS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
			cmd.addParameter("@P_ATTR", pAttr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pApplyScript(NString pScript) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GOKSDEN.P_APPLY_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCRIPT", pScript);
				
			cmd.execute();


		}
		
		public static void pCopyAttrMd(NString pFromTableName,NString pToOwner,NString pToTableName,Ref<NString> vMessageOut,Ref<NBool> vSuccessOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GOKSDEN.P_COPY_ATTR_MD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FROM_TABLE_NAME", pFromTableName);
			cmd.addParameter("@P_TO_OWNER", pToOwner);
			cmd.addParameter("@P_TO_TABLE_NAME", pToTableName);
			cmd.addParameter("@V_MESSAGE_OUT", NString.class);
			cmd.addParameter("@V_SUCCESS_OUT", NBool.class);
				
			cmd.execute();
			vMessageOut.val = cmd.getParameterValue("@V_MESSAGE_OUT", NString.class);
			vSuccessOut.val = cmd.getParameterValue("@V_SUCCESS_OUT", NBool.class);


		}
		
	
	
	@DbRecordType(id="SdDataTypeRecRow", dataSourceName="SD_DATA_TYPE_REC")
	public static class SdDataTypeRecRow
	{
		@DbRecordField(dataSourceName="TYPE_NAME")
		public NString TypeName;
		@DbRecordField(dataSourceName="TYPE_DESC")
		public NString TypeDesc;
	}

	
	
}
