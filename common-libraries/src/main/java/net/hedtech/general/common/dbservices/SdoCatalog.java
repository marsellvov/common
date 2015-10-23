package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoCatalog {
		public static void deleteCatalog(NString fSchemaName,NString fTableName,NString fGeometryColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CATALOG.DELETE_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@F_SCHEMA_NAME", fSchemaName);
			cmd.addParameter("@F_TABLE_NAME", fTableName);
			cmd.addParameter("@F_GEOMETRY_COLUMN", fGeometryColumn);
				
			cmd.execute();


		}
		
		public static void insertCatalog(NString fTableSchema,NString fTableName,NString fGeometryColumn,NString gTableSchema,NString gTableName,NNumber storageType,NNumber geometryType,NNumber coordDimension,NNumber maxPpr,NNumber srid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CATALOG.INSERT_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@F_TABLE_SCHEMA", fTableSchema);
			cmd.addParameter("@F_TABLE_NAME", fTableName);
			cmd.addParameter("@F_GEOMETRY_COLUMN", fGeometryColumn);
			cmd.addParameter("@G_TABLE_SCHEMA", gTableSchema);
			cmd.addParameter("@G_TABLE_NAME", gTableName);
			cmd.addParameter("@STORAGE_TYPE", storageType);
			cmd.addParameter("@GEOMETRY_TYPE", geometryType);
			cmd.addParameter("@COORD_DIMENSION", coordDimension);
			cmd.addParameter("@MAX_PPR", maxPpr);
			cmd.addParameter("@SRID", srid);
				
			cmd.execute();


		}
		
		public static void updateCatalog(NString fSchemaName,NString fTableName,NString gSchemaName,NString gTableName,NString col,NString oldValue,NString newValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_CATALOG.UPDATE_CATALOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@F_SCHEMA_NAME", fSchemaName);
			cmd.addParameter("@F_TABLE_NAME", fTableName);
			cmd.addParameter("@G_SCHEMA_NAME", gSchemaName);
			cmd.addParameter("@G_TABLE_NAME", gTableName);
			cmd.addParameter("@COL", col);
			cmd.addParameter("@OLD_VALUE", oldValue);
			cmd.addParameter("@NEW_VALUE", newValue);
				
			cmd.execute();


		}
		
	
	
	
}
