package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NBlob;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NClob;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NInteger;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;



public class DbmsSql {
	/* 	public static void bindArray(NNumber c,NString _name,List<NNumber> nTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("N_TAB", "DBMS_SQL.NUMBER_TABLE", nTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> blTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("BL_TAB", "DBMS_SQL.BLOB_TABLE", blTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> clTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("CL_TAB", "DBMS_SQL.CLOB_TABLE", clTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> bfTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("BF_TAB", "DBMS_SQL.BFILE_TABLE", bfTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> urTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("UR_TAB", "DBMS_SQL.UROWID_TABLE", urTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> urTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("UR_TAB", "DBMS_SQL.UROWID_TABLE", urTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> tmTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("TM_TAB", "DBMS_SQL.TIME_TABLE", tmTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> tmTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("TM_TAB", "DBMS_SQL.TIME_TABLE", tmTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> tmsTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("TMS_TAB", "DBMS_SQL.TIMESTAMP_TABLE", tmsTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> tmsTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("TMS_TAB", "DBMS_SQL.TIMESTAMP_TABLE", tmsTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> ttzTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("TTZ_TAB", "DBMS_SQL.TIME_WITH_TIME_ZONE_TABLE", ttzTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> cTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("C_TAB", "DBMS_SQL.VARCHAR2_TABLE", cTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> ttzTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("TTZ_TAB", "DBMS_SQL.TIME_WITH_TIME_ZONE_TABLE", ttzTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> tstzTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("TSTZ_TAB", "DBMS_SQL.TIMESTAMP_WITH_TIME_ZONE_TABLE", tstzTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> tstzTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("TSTZ_TAB", "DBMS_SQL.TIMESTAMP_WITH_TIME_ZONE_TABLE", tstzTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> tstzTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("TSTZ_TAB", "DBMS_SQL.TIMESTAMP_WITH_LTZ_TABLE", tstzTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> tstzTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("TSTZ_TAB", "DBMS_SQL.TIMESTAMP_WITH_LTZ_TABLE", tstzTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> iymTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("IYM_TAB", "DBMS_SQL.INTERVAL_YEAR_TO_MONTH_TABLE", iymTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> iymTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("IYM_TAB", "DBMS_SQL.INTERVAL_YEAR_TO_MONTH_TABLE", iymTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> idsTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("IDS_TAB", "DBMS_SQL.INTERVAL_DAY_TO_SECOND_TABLE", idsTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> idsTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("IDS_TAB", "DBMS_SQL.INTERVAL_DAY_TO_SECOND_TABLE", idsTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> bfltTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("BFLT_TAB", "DBMS_SQL.BINARY_FLOAT_TABLE", bfltTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> dTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("D_TAB", "DBMS_SQL.DATE_TABLE", dTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> bfltTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("BFLT_TAB", "DBMS_SQL.BINARY_FLOAT_TABLE", bfltTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> bdblTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("BDBL_TAB", "DBMS_SQL.BINARY_DOUBLE_TABLE", bdblTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> bdblTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("BDBL_TAB", "DBMS_SQL.BINARY_DOUBLE_TABLE", bdblTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> blTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("BL_TAB", "DBMS_SQL.BLOB_TABLE", blTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> clTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("CL_TAB", "DBMS_SQL.CLOB_TABLE", clTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> bfTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("BF_TAB", "DBMS_SQL.BFILE_TABLE", bfTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> nTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("N_TAB", "DBMS_SQL.NUMBER_TABLE", nTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> cTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("C_TAB", "DBMS_SQL.VARCHAR2_TABLE", cTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		public static void bindArray(NNumber c,NString _name,List<NNumber> dTab,NNumber index1,NNumber index2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("D_TAB", "DBMS_SQL.DATE_TABLE", dTab, NNumber.class));
			cmd.addParameter("@INDEX1", index1);
			cmd.addParameter("@INDEX2", index2);
				
			cmd.execute();


		}
		
		*/
		public static void bindVariable(NNumber c,NString _name,NNumber value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
				
			cmd.execute();


		}
		
		public static void bindVariable(NNumber c,NString _name, NBlob value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
				
			cmd.execute();


		}
		
		public static void bindVariable(NNumber c,NString _name, NClob value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
				
			cmd.execute();


		}
		
	
		
		public static void bindVariable(NNumber c,NString _name, NInteger value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
				
			cmd.execute();


		}
		
		public static void bindVariable(NNumber c,NString _name, NString value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
				
			cmd.execute();


		}
		
		
		
		public static void bindVariable(NNumber c,NString _name,NString value,NNumber outValueSize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
			cmd.addParameter("@OUT_VALUE_SIZE", outValueSize);
				
			cmd.execute();


		}
		
		public static void bindVariable(NNumber c,NString _name, NDate value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
				
			cmd.execute();


		}
		
		
			
		
		public static void bindVariableChar(NNumber c,NString _name,NString value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE_CHAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
				
			cmd.execute();


		}
		
		public static void bindVariableChar(NNumber c,NString _name,NString value,NNumber outValueSize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE_CHAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
			cmd.addParameter("@OUT_VALUE_SIZE", outValueSize);
				
			cmd.execute();


		}
		
		public static void bindVariableRaw(NNumber c,NString _name,byte[] value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE_RAW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
				
			cmd.execute();


		}
		
		public static void bindVariableRaw(NNumber c,NString _name,byte[] value,NNumber outValueSize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.BIND_VARIABLE_RAW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", value);
			cmd.addParameter("@OUT_VALUE_SIZE", outValueSize);
				
			cmd.execute();


		}
		
		public static void closeCursor(NNumber c) {
			closeCursor(new Ref<NNumber>(c));
		}
		
		public static void closeCursor(Ref<NNumber> c) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.CLOSE_CURSOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c, true);
				
			cmd.execute();
			c.val = cmd.getParameterValue("@C", NNumber.class);


		}
		/*
		public static void columnValue(NNumber c,NNumber position,Ref<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NNumber.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NNumber.class);


		}
		
		public static void columnValue(NNumber c,NNumber position,List<NNumber> nTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("N_TAB", "DBMS_SQL.NUMBER_TABLE", nTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void columnValue(NNumber c,NNumber position,List<NNumber> cTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("C_TAB", "DBMS_SQL.VARCHAR2_TABLE", cTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void columnValue(NNumber c,NNumber position,List<NNumber> dTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("D_TAB", "DBMS_SQL.DATE_TABLE", dTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void columnValue(NNumber c,NNumber position,List<NNumber> blTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("BL_TAB", "DBMS_SQL.BLOB_TABLE", blTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void columnValue(NNumber c,NNumber position,List<NNumber> clTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("CL_TAB", "DBMS_SQL.CLOB_TABLE", clTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void columnValue(NNumber c,NNumber position,List<NNumber> bfTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("BF_TAB", "DBMS_SQL.BFILE_TABLE", bfTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void columnValue(NNumber c,NNumber position,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void columnValue(NNumber c,NNumber position,List<NNumber> urTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("UR_TAB", "DBMS_SQL.UROWID_TABLE", urTab, NNumber.class));
				
			cmd.execute();


		}
		
		
		public static void columnValue(NNumber c,NNumber position,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		*/
		
	/*	public static void columnValue(NNumber c,NNumber position,List<NNumber> tmTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("TM_TAB", "DBMS_SQL.TIME_TABLE", tmTab, NNumber.class));
				
			cmd.execute();


		}*/
		
		public static void columnValue(NNumber c,NNumber position,Ref<NString> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NString.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE",NString.class);


		}
        public static NString getColumnValue(NNumber c,NNumber position) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NString.class);
				
			cmd.execute();
			return cmd.getParameterValue("@VALUE",NString.class);


		}
        public static void columnValueNumber(NNumber c,NNumber position,Ref<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NNumber.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE",NNumber.class);


		}
      public static NNumber getColumnValueNumber(NNumber c,NNumber position) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NNumber.class);
				
			cmd.execute();
			
			return cmd.getParameterValue("@VALUE",NNumber.class);


		}
        public static void columnValueDate(NNumber c,NNumber position,Ref<NDate> value) {
			
   			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
   			
   			cmd.addParameter("@C", c);
   			cmd.addParameter("@POSITION", position);
   			cmd.addParameter("@VALUE", NDate.class);
   				
   			cmd.execute();
   			value.val = cmd.getParameterValue("@VALUE",NDate.class);


   		}
         public static NDate getColumnValueDate(NNumber c,NNumber position) {
			
   			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
   			
   			cmd.addParameter("@C", c);
   			cmd.addParameter("@POSITION", position);
   			cmd.addParameter("@VALUE", NDate.class);
   				
   			cmd.execute();
   			return cmd.getParameterValue("@VALUE",NDate.class);


   		}
      
		/*public static void columnValue(NNumber c,NNumber position,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}*/
		
/*		public static void columnValue(NNumber c,NNumber position,List<NNumber> tmsTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("TMS_TAB", "DBMS_SQL.TIMESTAMP_TABLE", tmsTab, NNumber.class));
				
			cmd.execute();


		}*/
		
	/*	public static void columnValue(NNumber c,NNumber position,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void columnValue(NNumber c,NNumber position,List<NNumber> ttzTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("TTZ_TAB", "DBMS_SQL.TIME_WITH_TIME_ZONE_TABLE", ttzTab, NNumber.class));
				
			cmd.execute();


		}*/
		
	
		
	/*	public static void columnValue(NNumber c,NNumber position,List<NNumber> tstzTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("TSTZ_TAB", "DBMS_SQL.TIMESTAMP_WITH_TIME_ZONE_TABLE", tstzTab, NNumber.class));
				
			cmd.execute();


		}
		
				
		public static void columnValue(NNumber c,NNumber position,List<NNumber> tstzTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("TSTZ_TAB", "DBMS_SQL.TIMESTAMP_WITH_LTZ_TABLE", tstzTab, NNumber.class));
				
			cmd.execute();


		}
		*/
	
		
		/*public static void columnValue(NNumber c,NNumber position,List<NNumber> iymTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("IYM_TAB", "DBMS_SQL.INTERVAL_YEAR_TO_MONTH_TABLE", iymTab, NNumber.class));
				
			cmd.execute();


		}*/
		
	/*	public static void columnValue(NNumber c,NNumber position,Ref<NDate> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NDate.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NDate.class);


		}*/
		
		/*public static void columnValue(NNumber c,NNumber position,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}*/
		
/*		public static void columnValue(NNumber c,NNumber position,List<NNumber> idsTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("IDS_TAB", "DBMS_SQL.INTERVAL_DAY_TO_SECOND_TABLE", idsTab, NNumber.class));
				
			cmd.execute();


		}*/
		
/*		public static void columnValue(NNumber c,NNumber position,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void columnValue(NNumber c,NNumber position,List<NNumber> bfltTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("BFLT_TAB", "DBMS_SQL.BINARY_FLOAT_TABLE", bfltTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void columnValue(NNumber c,NNumber position,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void columnValue(NNumber c,NNumber position,List<NNumber> bdblTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("BDBL_TAB", "DBMS_SQL.BINARY_DOUBLE_TABLE", bdblTab, NNumber.class));
				
			cmd.execute();


		}
		
		public static void columnValue(NNumber c,NNumber position,Ref<BLOB> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", BLOB.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", BLOB.class);


		}
		
		public static void columnValue(NNumber c,NNumber position,Ref<NString> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NString.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NString.class);


		}
		*/
	
		
	/*	public static void columnValue(NNumber c,NNumber position,Ref<NNumber> value,Ref<NNumber> columnError,Ref<NNumber> actualLength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NNumber.class);
			cmd.addParameter("@COLUMN_ERROR", NNumber.class);
			cmd.addParameter("@ACTUAL_LENGTH", NNumber.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NNumber.class);
			columnError.val = cmd.getParameterValue("@COLUMN_ERROR", NNumber.class);
			actualLength.val = cmd.getParameterValue("@ACTUAL_LENGTH", NNumber.class);


		}
		
		public static void columnValue(NNumber c,NNumber position,Ref<NString> value,Ref<NNumber> columnError,Ref<NNumber> actualLength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NString.class);
			cmd.addParameter("@COLUMN_ERROR", NNumber.class);
			cmd.addParameter("@ACTUAL_LENGTH", NNumber.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NString.class);
			columnError.val = cmd.getParameterValue("@COLUMN_ERROR", NNumber.class);
			actualLength.val = cmd.getParameterValue("@ACTUAL_LENGTH", NNumber.class);


		}
		
		public static void columnValue(NNumber c,NNumber position,Ref<NDate> value,Ref<NNumber> columnError,Ref<NNumber> actualLength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NDate.class);
			cmd.addParameter("@COLUMN_ERROR", NNumber.class);
			cmd.addParameter("@ACTUAL_LENGTH", NNumber.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NDate.class);
			columnError.val = cmd.getParameterValue("@COLUMN_ERROR", NNumber.class);
			actualLength.val = cmd.getParameterValue("@ACTUAL_LENGTH", NNumber.class);


		}*/
		
		public static void columnValueChar(NNumber c,NNumber position,Ref value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE_CHAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", value.getValueClass());
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", value.getValueClass());


		}
		
		public static void columnValueChar(NNumber c,NNumber position,Ref<NString> value,Ref<NNumber> columnError,Ref<NNumber> actualLength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE_CHAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", NString.class);
			cmd.addParameter("@COLUMN_ERROR", NNumber.class);
			cmd.addParameter("@ACTUAL_LENGTH", NNumber.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NString.class);
			columnError.val = cmd.getParameterValue("@COLUMN_ERROR", NNumber.class);
			actualLength.val = cmd.getParameterValue("@ACTUAL_LENGTH", NNumber.class);


		}
		
		public static void columnValueLong(NNumber c,NNumber position,NNumber length,NNumber offset,Ref<NString> value,Ref<NNumber> valueLength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE_LONG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@LENGTH", length);
			cmd.addParameter("@OFFSET", offset);
			cmd.addParameter("@VALUE", NString.class);
			cmd.addParameter("@VALUE_LENGTH", NNumber.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NString.class);
			valueLength.val = cmd.getParameterValue("@VALUE_LENGTH", NNumber.class);


		}
		
		public static void columnValueRaw(NNumber c,NNumber position,Ref<byte[]> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE_RAW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", byte[].class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", byte[].class);


		}
		
		public static void columnValueRaw(NNumber c,NNumber position,Ref<byte[]> value,Ref<NNumber> columnError,Ref<NNumber> actualLength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE_RAW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", byte[].class);
			cmd.addParameter("@COLUMN_ERROR", NNumber.class);
			cmd.addParameter("@ACTUAL_LENGTH", NNumber.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", byte[].class);
			columnError.val = cmd.getParameterValue("@COLUMN_ERROR", NNumber.class);
			actualLength.val = cmd.getParameterValue("@ACTUAL_LENGTH", NNumber.class);


		}
		
/*		public static void columnValueRowid(NNumber c,NNumber position,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void columnValueRowid(NNumber c,NNumber position,Ref<> value,Ref<NNumber> columnError,Ref<NNumber> actualLength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.COLUMN_VALUE_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@VALUE", .class);
			cmd.addParameter("@COLUMN_ERROR", NNumber.class);
			cmd.addParameter("@ACTUAL_LENGTH", NNumber.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);
			columnError.val = cmd.getParameterValue("@COLUMN_ERROR", NNumber.class);
			actualLength.val = cmd.getParameterValue("@ACTUAL_LENGTH", NNumber.class);


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> nTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("N_TAB", "DBMS_SQL.NUMBER_TABLE", nTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> ttzTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("TTZ_TAB", "DBMS_SQL.TIME_WITH_TIME_ZONE_TABLE", ttzTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> tstzTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("TSTZ_TAB", "DBMS_SQL.TIMESTAMP_WITH_TIME_ZONE_TABLE", tstzTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> tstzTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("TSTZ_TAB", "DBMS_SQL.TIMESTAMP_WITH_LTZ_TABLE", tstzTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> iymTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("IYM_TAB", "DBMS_SQL.INTERVAL_YEAR_TO_MONTH_TABLE", iymTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> idsTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("IDS_TAB", "DBMS_SQL.INTERVAL_DAY_TO_SECOND_TABLE", idsTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> bfltTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("BFLT_TAB", "DBMS_SQL.BINARY_FLOAT_TABLE", bfltTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> bdblTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("BDBL_TAB", "DBMS_SQL.BINARY_DOUBLE_TABLE", bdblTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> cTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("C_TAB", "DBMS_SQL.VARCHAR2_TABLE", cTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> dTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("D_TAB", "DBMS_SQL.DATE_TABLE", dTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> blTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("BL_TAB", "DBMS_SQL.BLOB_TABLE", blTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> clTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("CL_TAB", "DBMS_SQL.CLOB_TABLE", clTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> bfTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("BF_TAB", "DBMS_SQL.BFILE_TABLE", bfTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> urTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("UR_TAB", "DBMS_SQL.UROWID_TABLE", urTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> tmTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("TM_TAB", "DBMS_SQL.TIME_TABLE", tmTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}
		
		public static void defineArray(NNumber c,NNumber position,List<NNumber> tmsTab,NNumber cnt,NNumber lowerBound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter(DbTypes.getTableType("TMS_TAB", "DBMS_SQL.TIMESTAMP_TABLE", tmsTab, NNumber.class));
			cmd.addParameter("@CNT", cnt);
			cmd.addParameter("@LOWER_BOUND", lowerBound);
				
			cmd.execute();


		}*/
		
		public static void defineColumn(NNumber c,NNumber position,NNumber column) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@COLUMN", column);
				
			cmd.execute();


		}
		
		
		
		public static void defineColumn(NNumber c,NNumber position,NString column,NNumber columnSize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@COLUMN", column);
			cmd.addParameter("@COLUMN_SIZE", columnSize);
				
			cmd.execute();


		}
		
//		MORPHIS TODO - Código literalmente duplicado
//		
//		public static void defineColumn(NNumber c,NNumber position,NString column,NNumber columnSize) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_COLUMN", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@C", c);
//			cmd.addParameter("@POSITION", position);
//			cmd.addParameter("@COLUMN", column);
//			cmd.addParameter("@COLUMN_SIZE", columnSize);
//				
//			cmd.execute();
//		
//		
//		}

		public static void defineColumn(NNumber c,NNumber position,NDate column) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@COLUMN", column);
				
			cmd.execute();


		}
		
	
		
		public static void defineColumn(NNumber c,NNumber position,NString column) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@COLUMN", column);
			cmd.addParameter("@COLUMN_SIZE", NNumber.toNumber(250));
				
			cmd.execute();


		}
		
	
		
		public static void defineColumnChar(NNumber c,NNumber position,NString column,NNumber columnSize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_COLUMN_CHAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@COLUMN", column);
			cmd.addParameter("@COLUMN_SIZE", columnSize);
				
			cmd.execute();


		}
		
		public static void defineColumnLong(NNumber c,NNumber position) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_COLUMN_LONG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
				
			cmd.execute();


		}
		
		public static void defineColumnRaw(NNumber c,NNumber position,byte[] column,NNumber columnSize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DEFINE_COLUMN_RAW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@POSITION", position);
			cmd.addParameter("@COLUMN", column);
			cmd.addParameter("@COLUMN_SIZE", columnSize);
				
			cmd.execute();


		}
		
	
		
	/*	public static void describeColumns(NNumber c,Ref<NNumber> colCnt,Ref<List<NNumber>> descT) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DESCRIBE_COLUMNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@COL_CNT", NNumber.class);
			cmd.addParameter(DbTypes.getTableType("DESC_T", "DBMS_SQL.DESC_TAB", NumberRow.class));
				
			cmd.execute();
			colCnt.val = cmd.getParameterValue("@COL_CNT", NNumber.class);
			descT.val = cmd.getTableParameterValue("@DESC_T", NumberRow.class);


		}
		
		public static void describeColumns2(NNumber c,Ref<NNumber> colCnt,Ref<List<NNumber>> descT) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.DESCRIBE_COLUMNS2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@COL_CNT", NNumber.class);
			cmd.addParameter(DbTypes.getTableType("DESC_T", "DBMS_SQL.DESC_TAB2", NumberRow.class));
				
			cmd.execute();
			colCnt.val = cmd.getParameterValue("@COL_CNT", NNumber.class);
			descT.val = cmd.getTableParameterValue("@DESC_T", NumberRow.class);


		}*/
		
		public static NNumber execute(NNumber c) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.EXECUTE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@C", c);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber executeAndFetch(NNumber c,NBool exact) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.EXECUTE_AND_FETCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@C", c);
			cmd.addParameter("@EXACT", exact);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fetchRows(NNumber c) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.FETCH_ROWS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@C", c);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool isOpen(NNumber c) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.IS_OPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@C", c);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber lastErrorPosition() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.LAST_ERROR_POSITION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber lastRowCount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.LAST_ROW_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	/*	public static  FlastRowId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.LAST_ROW_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(.class);
				
			cmd.execute();

			return cmd.getReturnValue(.class);

		}*/
		
		public static NNumber lastSqlFunctionCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.LAST_SQL_FUNCTION_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber openCursor() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.OPEN_CURSOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void parse(NNumber c,NString statement,NNumber languageFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.PARSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@STATEMENT", statement);
			cmd.addParameter("@LANGUAGE_FLAG", languageFlag);
				
			cmd.execute();


		}
	/*	
		public static void parse(NNumber c,List<NNumber> statement,NNumber lb,NNumber ub,NBool lfflg,NNumber languageFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.PARSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter(DbTypes.getTableType("STATEMENT", "DBMS_SQL.VARCHAR2A", statement, NNumber.class));
			cmd.addParameter("@LB", lb);
			cmd.addParameter("@UB", ub);
			cmd.addParameter("@LFFLG", lfflg);
			cmd.addParameter("@LANGUAGE_FLAG", languageFlag);
				
			cmd.execute();


		}
		
		public static void parse(NNumber c,List<NNumber> statement,NNumber lb,NNumber ub,NBool lfflg,NNumber languageFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.PARSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter(DbTypes.getTableType("STATEMENT", "DBMS_SQL.VARCHAR2S", statement, NNumber.class));
			cmd.addParameter("@LB", lb);
			cmd.addParameter("@UB", ub);
			cmd.addParameter("@LFFLG", lfflg);
			cmd.addParameter("@LANGUAGE_FLAG", languageFlag);
				
			cmd.execute();


		}*/
		
	public static void variableValueString(NNumber c,NString _name,Ref<NString> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", NString.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NString.class);


		}
	public static void variableValueNumber(NNumber c,NString _name,Ref<NNumber> value) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@C", c);
		cmd.addParameter("@NAME", _name);
		cmd.addParameter("@VALUE", NNumber.class);
			
		cmd.execute();
		value.val = cmd.getParameterValue("@VALUE", NNumber.class);


	}
    public static void variableValueDate(NDate c,NString _name,Ref<NDate> value) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@C", c);
		cmd.addParameter("@NAME", _name);
		cmd.addParameter("@VALUE", NDate.class);
			
		cmd.execute();
		value.val = cmd.getParameterValue("@VALUE", NDate.class);


	}
	/*		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.BLOB_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.CLOB_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.BFILE_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.UROWID_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.TIME_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.TIMESTAMP_TABLE", value, NNumber.class));
				
			cmd.execute();


		}*/
		
	/*	public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<NString> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", NString.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NString.class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.TIME_WITH_TIME_ZONE_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.TIMESTAMP_WITH_TIME_ZONE_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.TIMESTAMP_WITH_LTZ_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.INTERVAL_YEAR_TO_MONTH_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.INTERVAL_DAY_TO_SECOND_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<NDate> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", NDate.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NDate.class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.BINARY_FLOAT_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.BINARY_DOUBLE_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<BLOB> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", BLOB.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", BLOB.class);


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<NString> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", NString.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NString.class);


		}
		
		public static void variableValue(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.NUMBER_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.VARCHAR2_TABLE", value, NNumber.class));
				
			cmd.execute();


		}
		
		public static void variableValue(NNumber c,NString _name,List<NNumber> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter(DbTypes.getTableType("VALUE", "DBMS_SQL.DATE_TABLE", value, NNumber.class));
				
			cmd.execute();


		}*/
    
		public static void variableValueRowId(NNumber c,NString _name,Ref<NString> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", NString.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NString.class);
	
	
		}
		
		public static void variableValueChar(NNumber c,NString _name,Ref<NString> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE_CHAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", NString.class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", NString.class);


		}
		
		public static void variableValueRaw(NNumber c,NString _name,Ref<byte[]> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE_RAW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", byte[].class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", byte[].class);


		}
	/*	
		public static void variableValueRowid(NNumber c,NString _name,Ref<> value) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_SQL.VARIABLE_VALUE_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@C", c);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VALUE", .class);
				
			cmd.execute();
			value.val = cmd.getParameterValue("@VALUE", .class);


		}
		*/
	
	
	@DbRecordType(id="DescRecRow", dataSourceName="DESC_REC")
	public static class DescRecRow
	{
		@DbRecordField(dataSourceName="COL_TYPE")
		public NInteger ColType;
		@DbRecordField(dataSourceName="COL_MAX_LEN")
		public NInteger ColMaxLen;
		@DbRecordField(dataSourceName="COL_NAME")
		public NString ColName;
		@DbRecordField(dataSourceName="COL_NAME_LEN")
		public NInteger ColNameLen;
		@DbRecordField(dataSourceName="COL_SCHEMA_NAME")
		public NString ColSchemaName;
		@DbRecordField(dataSourceName="COL_SCHEMA_NAME_LEN")
		public NInteger ColSchemaNameLen;
		@DbRecordField(dataSourceName="COL_PRECISION")
		public NInteger ColPrecision;
		@DbRecordField(dataSourceName="COL_SCALE")
		public NInteger ColScale;
		@DbRecordField(dataSourceName="COL_CHARSETID")
		public NInteger ColCharsetid;
		@DbRecordField(dataSourceName="COL_CHARSETFORM")
		public NInteger ColCharsetform;
		@DbRecordField(dataSourceName="COL_NULL_OK")
		public NBool ColNullOk;
	}

	
	@DbRecordType(id="DescRec2Row", dataSourceName="DESC_REC2")
	public static class DescRec2Row
	{
		@DbRecordField(dataSourceName="COL_TYPE")
		public NInteger ColType;
		@DbRecordField(dataSourceName="COL_MAX_LEN")
		public NInteger ColMaxLen;
		@DbRecordField(dataSourceName="COL_NAME")
		public NString ColName;
		@DbRecordField(dataSourceName="COL_NAME_LEN")
		public NInteger ColNameLen;
		@DbRecordField(dataSourceName="COL_SCHEMA_NAME")
		public NString ColSchemaName;
		@DbRecordField(dataSourceName="COL_SCHEMA_NAME_LEN")
		public NInteger ColSchemaNameLen;
		@DbRecordField(dataSourceName="COL_PRECISION")
		public NInteger ColPrecision;
		@DbRecordField(dataSourceName="COL_SCALE")
		public NInteger ColScale;
		@DbRecordField(dataSourceName="COL_CHARSETID")
		public NInteger ColCharsetid;
		@DbRecordField(dataSourceName="COL_CHARSETFORM")
		public NInteger ColCharsetform;
		@DbRecordField(dataSourceName="COL_NULL_OK")
		public NBool ColNullOk;
	}


	

	
	
}
