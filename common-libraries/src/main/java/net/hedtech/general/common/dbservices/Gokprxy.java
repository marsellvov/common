package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.dbtypes.GvrudfnRow;
import net.hedtech.general.common.dbservices.dbtypes.ParamInfoTypeRow;
import net.hedtech.general.common.dbservices.dbtypes.GvrudfnRow.TDisplayItems;
import net.hedtech.general.common.dbservices.dbtypes.WtRecRow;
import net.hedtech.general.common.dbservices.dbtypes.wtTable;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

public class Gokprxy {
	public static NString fGetDesc(NString pTable, NString pValue,
			NString pOverrideDescCol) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKPRXY.F_GET_DESC", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_TABLE", pTable);
		cmd.addParameter("@P_VALUE", pValue);
		cmd.addParameter("@P_OVERRIDE_DESC_COL", pOverrideDescCol);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static NString fWtParm(NString wtParm) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKPRXY.F_WT_PARM", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@WT_PARM", wtParm);

		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static void pWtQuery(Ref<Table<WtRecRow>> wtData, NString pRetpCode) {

		Table<WtRecRow> wtTable = wtData.getValue();

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"GOKPRXY.P_WT_QUERY", DbManager.getDataBaseFactory());
		cmd.addParameter(DbTypes.getTableType("WT_DATA", "GOKPRXY.WT_TAB",
				wtTable.class));
		cmd.addParameter("@P_RETP_CODE", pRetpCode);

		cmd.execute();
		// wtData.val = cmd.getTableParameterValue("@WT_DATA", object.class);
		wtData.val = cmd.getParameterValue("WT_DATA", wtTable.class);
		
	}

//	@DbRecordType(id = "WtRecRow", dataSourceName = "WT_REC")
//	public static class WtRecRow {
//
//		// test
//		public WtRecRow() {
//			super();
//		}
//
//		@DbRecordField(dataSourceName = "MENU_NAME")
//		public NString MenuName;
//		@DbRecordField(dataSourceName = "MENU_DESC")
//		public NString MenuDesc;
//		@DbRecordField(dataSourceName = "MENU_TEXT")
//		public NString MenuText;
//		@DbRecordField(dataSourceName = "MENU_URL")
//		public NString MenuUrl;
//		@DbRecordField(dataSourceName = "MENU_SEQ")
//		public NNumber MenuSeq;
//	}
//
//	@DbTableType(id = "WtRecRow.wtTable", dataSourceName = "gokprxy.wt_tab", indexed = true)
//	public static class wtTable extends Table<WtRecRow> {
//
//		// test
//		public wtTable() {
//			super();
//		}
//
//		@Override
//		protected WtRecRow newValue() {
//			return new WtRecRow();
//		}
//	}

}
