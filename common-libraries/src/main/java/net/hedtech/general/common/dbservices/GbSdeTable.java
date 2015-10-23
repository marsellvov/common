package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DataCursor;
import static morphis.foundations.core.types.Types.*;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appdatalayer.data.types.DbTypes;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.Cursor;
import morphis.foundations.core.types.NInteger;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Row;
import morphis.foundations.core.util.Ref;

public class GbSdeTable {
	public static NInteger fApiVersion() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GB_SDE_TABLE.F_API_VERSION", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NInteger.class);

		cmd.execute();

		return cmd.getReturnValue(NInteger.class);

	}

	public static NString fExists(NString pTableName) {
		return fExists(pTableName, NString.getNull());
	}

	public static NString fExists(NString pTableName, NString pRowid) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GB_SDE_TABLE.F_EXISTS", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_ROWID", pRowid);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fIsequal(SdeTableRecRow recOne,
			SdeTableRecRow recTwo) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GB_SDE_TABLE.F_ISEQUAL", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne,
				SdeTableRecRow.class));
		cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo,
				SdeTableRecRow.class));

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static DataCursor fQueryAll(NString pTableName) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GB_SDE_TABLE.F_QUERY_ALL", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_TABLE_NAME", pTableName);

		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	public static DataCursor fQueryByRowid(NString pRowid) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("GB_SDE_TABLE.F_QUERY_BY_ROWID",
						DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_ROWID", pRowid);

		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	public static Cursor fQueryOne(NString pTableName) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GB_SDE_TABLE.F_QUERY_ONE", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_TABLE_NAME", pTableName);

		cmd.execute();

		return cmd.getReturnValue(Cursor.class);

	}

	public static DataCursor fQueryOneLock(NString pTableName,
			NString pRowid) {

		IDataCommand cmd = DbManager.getDataAccessFactory()
				.createDataCommand("GB_SDE_TABLE.F_QUERY_ONE_LOCK",
						DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_ROWID", pRowid);

		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	public static void pCreate(NString pTableName, NString pOwner,
			NString pUserId, NString pPkDynsql, NString pDataOrigin,
			Ref<NString> pRowidOut) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GB_SDE_TABLE.P_CREATE", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_OWNER", pOwner);
		cmd.addParameter("@P_USER_ID", pUserId);
		cmd.addParameter("@P_PK_DYNSQL", pPkDynsql);
		cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
		cmd.addParameter("@P_ROWID_OUT", NString.class);

		cmd.execute();
		pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT",
				NString.class);

	}

	public static void pDelete(NString pTableName, NString pRowid) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GB_SDE_TABLE.P_DELETE", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_ROWID", pRowid);

		cmd.execute();

	}

	public static void pLock(NString pTableName,
			Ref<NString> pRowidInout) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GB_SDE_TABLE.P_LOCK", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);

		cmd.execute();
		pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT",
				NString.class);

	}

	public static void pUpdate(NString pTableName, NString pOwner,
			NString pUserId, NString pPkDynsql, NString pDataOrigin,
			NString pRowid) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GB_SDE_TABLE.P_UPDATE", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_TABLE_NAME", pTableName);
		cmd.addParameter("@P_OWNER", pOwner);
		cmd.addParameter("@P_USER_ID", pUserId);
		cmd.addParameter("@P_PK_DYNSQL", pPkDynsql);
		cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
		cmd.addParameter("@P_ROWID", pRowid);

		cmd.execute();

	}

	@DbRecordType(id = "SdeTableRecRow", dataSourceName = "SDE_TABLE_REC")
	public static class SdeTableRecRow {
		@DbRecordField(dataSourceName = "R_TABLE_NAME")
		public NString RTableName;
		@DbRecordField(dataSourceName = "R_OWNER")
		public NString ROwner;
		@DbRecordField(dataSourceName = "R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName = "R_PK_DYNSQL")
		public NString RPkDynsql;
		@DbRecordField(dataSourceName = "R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName = "R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public SdeTableRecRow() {
			super();
		}
		
		public SdeTableRecRow(Row row) {
			super();
			RTableName = toStr(row.getObject(1));
			ROwner = toStr(row.getObject(2));
			RUserId = toStr(row.getObject(3));
			RPkDynsql = toStr(row.getObject(4));
			RDataOrigin = toStr(row.getObject(5));
			RInternalRecordId = toStr(row.getObject(6));
		}
	}
}