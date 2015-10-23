package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Noklist {
		public static NString fCodeDesc(NString pListName,NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKLIST.F_CODE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LIST_NAME", pListName);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fCodeDesc(List<ListTabtypeRow> pList,NString pCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKLIST.F_CODE_DESC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("P_LIST", "", pList, object.class));
//			cmd.addParameter("@P_CODE", pCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString fCodeExistsInd(NString pListName,NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKLIST.F_CODE_EXISTS_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LIST_NAME", pListName);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fCodeExistsInd(List<ListTabtypeRow> pList,NString pCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKLIST.F_CODE_EXISTS_IND", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			// cmd.addParameter(DbTypes.getTableType("P_LIST", "", pList, object.class));
//			cmd.addParameter("@P_CODE", pCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static List<ListTabtypeRow> fList(NString pListName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKLIST.F_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<ListTabtypeRow>.class);
//			cmd.addParameter("@P_LIST_NAME", pListName);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<ListTabtypeRow>.class);
//
//		}
		
		public static ListRectypeRow fListRec(NString pListName,NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKLIST.F_LIST_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(ListRectypeRow.class));
			cmd.addParameter("@P_LIST_NAME", pListName);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(ListRectypeRow.class);

		}
		
//		public static ListRectypeRow fListRec(List<ListTabtypeRow> pList,NString pCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKLIST.F_LIST_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(ListRectypeRow.class));
//			// cmd.addParameter(DbTypes.getTableType("P_LIST", "", pList, object.class));
//			cmd.addParameter("@P_CODE", pCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(ListRectypeRow.class);
//
//		}
		
		public static void pOpenListRc(Ref<DataCursor> pListRcInout,NString pTableName,NString pOrderBy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKLIST.P_OPEN_LIST_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LIST_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ORDER_BY", pOrderBy);
				
			cmd.execute();
			pListRcInout.val = cmd.getParameterValue("@P_LIST_RC_INOUT", DataCursor.class);


		}
		
	
	
	@DbRecordType(id="ListRectypeRow", dataSourceName="LIST_RECTYPE")
	public static class ListRectypeRow
	{
		@DbRecordField(dataSourceName="R_LIST_NAME")
		public NString RListName;
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
	}

	
	
}
