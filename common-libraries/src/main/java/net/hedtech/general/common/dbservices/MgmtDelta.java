package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtDelta {
//		public static void addNonNullDeltaValue(Ref<List<MgmtDeltaValuesRow>> vDeltavalues,NString vAttributeName,NString vRightValue,NString vLeftValue,NString vAttributeType,NString pSide) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.ADD_NON_NULL_DELTA_VALUE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("V_DELTAVALUES", "", vDeltavalues.val, object.class , true));
//			cmd.addParameter("@V_ATTRIBUTE_NAME", vAttributeName);
//			cmd.addParameter("@V_RIGHT_VALUE", vRightValue);
//			cmd.addParameter("@V_LEFT_VALUE", vLeftValue);
//			cmd.addParameter("@V_ATTRIBUTE_TYPE", vAttributeType);
//			cmd.addParameter("@P_SIDE", pSide);
//				
//			cmd.execute();
//			// vDeltavalues.val = cmd.getTableParameterValue("@V_DELTAVALUES", object.class);
//
//
//		}
		
//		public static void doDiffQueries(List<MgmtDeltaQueriesRow> pDeltaqueries,Ref<DataCursor> pDeref,Ref<DataCursor> pDsref,byte[] pSessionId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.DO_DIFF_QUERIES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_DELTAQUERIES", "", pDeltaqueries, object.class));
//			cmd.addParameter("@P_DEREF", DataCursor.class);
//			cmd.addParameter("@P_DSREF", DataCursor.class);
//			cmd.addParameter("@P_SESSION_ID", pSessionId);
//				
//			cmd.execute();
//			pDeref.val = cmd.getParameterValue("@P_DEREF", DataCursor.class);
//			pDsref.val = cmd.getParameterValue("@P_DSREF", DataCursor.class);
//
//
//		}
		
//		public static byte[] FdoDiffQueriesAndSave(List<MgmtDeltaQueriesRow> pDeltaqueries,NString pComparisontype,NString pComptargettype,List<ComparisonPropertiesRow> pComptargetproperties,byte[] pSessionId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.DO_DIFF_QUERIES_AND_SAVE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(byte[].class);
//			// cmd.addParameter(DbTypes.getCollectionType("P_DELTAQUERIES", "", pDeltaqueries, object.class));
//			cmd.addParameter("@P_COMPARISONTYPE", pComparisontype);
//			cmd.addParameter("@P_COMPTARGETTYPE", pComptargettype);
//			// cmd.addParameter(DbTypes.getCollectionType("P_COMPTARGETPROPERTIES", "", pComptargetproperties, object.class));
//			cmd.addParameter("@P_SESSION_ID", pSessionId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(byte[].class);
//
//		}
		
//		public static void doHistoryDiffs(List<MgmtDeltaQueriesRow> pDeltaqueries,NDate pSnaptime) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.DO_HISTORY_DIFFS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_DELTAQUERIES", "", pDeltaqueries, object.class));
//			cmd.addParameter("@P_SNAPTIME", pSnaptime);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void ecmHistoryPurge(Ref<> pcbParams) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.ECM_HISTORY_PURGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PCB_PARAMS", pcbParams, true);
//				
//			cmd.execute();
//			pcbParams.val = cmd.getParameterValue("@PCB_PARAMS", .class);
//
//
//		}
		
		public static byte[] FgetCurrentDeltaGuid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.GET_CURRENT_DELTA_GUID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static NString FgetDeltaKeyDisplayString(byte[] vKeyRowGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.GET_DELTA_KEY_DISPLAY_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_KEY_ROW_GUID", vKeyRowGuid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDeltaValueDisplayString(byte[] vDeltaEntryguid,NString vOperation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.GET_DELTA_VALUE_DISPLAY_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@V_DELTA_ENTRYGUID", vDeltaEntryguid);
			cmd.addParameter("@V_OPERATION", vOperation);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FpurgeHistory(NNumber pNumberofdays,NString pSnapshottype,NString pTargettype,NString pTargetname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.PURGE_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_NUMBEROFDAYS", pNumberofdays);
			cmd.addParameter("@P_SNAPSHOTTYPE", pSnapshottype);
			cmd.addParameter("@P_TARGETTYPE", pTargettype);
			cmd.addParameter("@P_TARGETNAME", pTargetname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static void recordDelete(NString vCollectionType,List<MgmtNameValuesRow> vObjkey,List<MgmtDeltaValuesRow> vOldColumnValues,NDate vTime) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.RECORD_DELETE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_COLLECTION_TYPE", vCollectionType);
//			// cmd.addParameter(DbTypes.getCollectionType("V_OBJKEY", "", vObjkey, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("V_OLD_COLUMN_VALUES", "", vOldColumnValues, object.class));
//			cmd.addParameter("@V_TIME", vTime);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void recordInsert(NString vCollectionType,List<MgmtNameValuesRow> vObjkey,List<MgmtDeltaValuesRow> vInsertedColumnValues,NDate vTime) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.RECORD_INSERT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_COLLECTION_TYPE", vCollectionType);
//			// cmd.addParameter(DbTypes.getCollectionType("V_OBJKEY", "", vObjkey, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("V_INSERTED_COLUMN_VALUES", "", vInsertedColumnValues, object.class));
//			cmd.addParameter("@V_TIME", vTime);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void recordOperation(NString vCollectionType,List<MgmtNameValuesRow> vObjkey,List<MgmtDeltaValuesRow> vColumnValues,NString vOperation,NDate vTime) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.RECORD_OPERATION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_COLLECTION_TYPE", vCollectionType);
//			// cmd.addParameter(DbTypes.getCollectionType("V_OBJKEY", "", vObjkey, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("V_COLUMN_VALUES", "", vColumnValues, object.class));
//			cmd.addParameter("@V_OPERATION", vOperation);
//			cmd.addParameter("@V_TIME", vTime);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void recordUpdate(NString vCollectionType,List<MgmtNameValuesRow> vObjkey,List<MgmtDeltaValuesRow> vUpdatedColumnValues,NDate vTime) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.RECORD_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_COLLECTION_TYPE", vCollectionType);
//			// cmd.addParameter(DbTypes.getCollectionType("V_OBJKEY", "", vObjkey, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("V_UPDATED_COLUMN_VALUES", "", vUpdatedColumnValues, object.class));
//			cmd.addParameter("@V_TIME", vTime);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void retrieveSavedComparison(byte[] pDiffguid,Ref<DataCursor> pDeref,Ref<DataCursor> pDsref,List<Varchar2TableRow> pCollectiontypes) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.RETRIEVE_SAVED_COMPARISON", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_DIFFGUID", pDiffguid);
//			cmd.addParameter("@P_DEREF", DataCursor.class);
//			cmd.addParameter("@P_DSREF", DataCursor.class);
//			// cmd.addParameter(DbTypes.getCollectionType("P_COLLECTIONTYPES", "", pCollectiontypes, object.class));
//				
//			cmd.execute();
//			pDeref.val = cmd.getParameterValue("@P_DEREF", DataCursor.class);
//			pDsref.val = cmd.getParameterValue("@P_DSREF", DataCursor.class);
//
//
//		}
		
		public static byte[] FstartDelta(byte[] vDeltaGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.START_DELTA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@V_DELTA_GUID", vDeltaGuid);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
		public static byte[] FstartDelta(byte[] lSnapguid,NDate lTimestamp,NString lTargetName,byte[] rSnapguid,NDate rTimestamp,NString rTargetName,NString targetType,NString snapshotType,NString deltaType,byte[] vDeltaGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.START_DELTA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(byte[].class);
			cmd.addParameter("@L_SNAPGUID", lSnapguid);
			cmd.addParameter("@L_TIMESTAMP", lTimestamp);
			cmd.addParameter("@L_TARGET_NAME", lTargetName);
			cmd.addParameter("@R_SNAPGUID", rSnapguid);
			cmd.addParameter("@R_TIMESTAMP", rTimestamp);
			cmd.addParameter("@R_TARGET_NAME", rTargetName);
			cmd.addParameter("@TARGET_TYPE", targetType);
			cmd.addParameter("@SNAPSHOT_TYPE", snapshotType);
			cmd.addParameter("@DELTA_TYPE", deltaType);
			cmd.addParameter("@V_DELTA_GUID", vDeltaGuid);
				
			cmd.execute();

			return cmd.getReturnValue(byte[].class);

		}
		
//		public static void testAndAddDelta(Ref<List<MgmtDeltaValuesRow>> vUpdatetable,NString vAttributeName,NString vRightValue,NString vLeftValue,NString vAttributeType) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.TEST_AND_ADD_DELTA", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("V_UPDATETABLE", "", vUpdatetable.val, object.class , true));
//			cmd.addParameter("@V_ATTRIBUTE_NAME", vAttributeName);
//			cmd.addParameter("@V_RIGHT_VALUE", vRightValue);
//			cmd.addParameter("@V_LEFT_VALUE", vLeftValue);
//			cmd.addParameter("@V_ATTRIBUTE_TYPE", vAttributeType);
//				
//			cmd.execute();
//			// vUpdatetable.val = cmd.getTableParameterValue("@V_UPDATETABLE", object.class);
//
//
//		}
		
		public static void updateDeltaXact(byte[] vDeltaGuid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_DELTA.UPDATE_DELTA_XACT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_DELTA_GUID", vDeltaGuid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ComparisonPropertyRow", dataSourceName="COMPARISON_PROPERTY")
	public static class ComparisonPropertyRow
	{
		@DbRecordField(dataSourceName="NAME")
		public NString _Name;
		@DbRecordField(dataSourceName="LEFT_VALUE")
		public NString LeftValue;
		@DbRecordField(dataSourceName="RIGHT_VALUE")
		public NString RightValue;
	}

	
	
}
