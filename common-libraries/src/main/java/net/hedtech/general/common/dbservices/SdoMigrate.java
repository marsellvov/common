package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoMigrate {
		public static void from815To81x(NString tabname,NNumber commitInt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_MIGRATE.FROM_815_TO_81X", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABNAME", tabname);
			cmd.addParameter("@COMMIT_INT", commitInt);
				
			cmd.execute();


		}
		
		public static void ogisMetadataFrom() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_MIGRATE.OGIS_METADATA_FROM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void ogisMetadataTo() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_MIGRATE.OGIS_METADATA_TO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void to81x(NString layer,NString newtabname,NString gidcolumn,NString geocolname,NString layerGtype,NString updateFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_MIGRATE.TO_81X", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@NEWTABNAME", newtabname);
			cmd.addParameter("@GIDCOLUMN", gidcolumn);
			cmd.addParameter("@GEOCOLNAME", geocolname);
			cmd.addParameter("@LAYER_GTYPE", layerGtype);
			cmd.addParameter("@UPDATE_FLAG", updateFlag);
				
			cmd.execute();


		}
		
		public static void toCurrent(NString layer,NString newtabname,NString gidcolumn,NString geocolname,NString layerGtype,NString updateFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_MIGRATE.TO_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@NEWTABNAME", newtabname);
			cmd.addParameter("@GIDCOLUMN", gidcolumn);
			cmd.addParameter("@GEOCOLNAME", geocolname);
			cmd.addParameter("@LAYER_GTYPE", layerGtype);
			cmd.addParameter("@UPDATE_FLAG", updateFlag);
				
			cmd.execute();


		}
		
		public static void toCurrent(NString tabname,NString columnName,NNumber commitInt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_MIGRATE.TO_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABNAME", tabname);
			cmd.addParameter("@COLUMN_NAME", columnName);
			cmd.addParameter("@COMMIT_INT", commitInt);
				
			cmd.execute();


		}
		
//		public static  FtoCurrent( geom,List<SdoDimArrayRow> dim) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_MIGRATE.TO_CURRENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GEOM", geom);
//			// cmd.addParameter(DbTypes.getCollectionType("DIM", "", dim, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
	
	
	
}
