package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoAdmin {
		public static void changeIndexParameters(NString layer,NNumber sdoLevel,NNumber sdoNumtiles) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.CHANGE_INDEX_PARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@SDO_LEVEL", sdoLevel);
			cmd.addParameter("@SDO_NUMTILES", sdoNumtiles);
				
			cmd.execute();


		}
		
		public static void populateIndex(NString layer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.POPULATE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
				
			cmd.execute();


		}
		
		public static void populateIndex(NString layer,NNumber maxtiles,NBool synchFlag,NBool sdoTileFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.POPULATE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@MAXTILES", maxtiles);
			cmd.addParameter("@SYNCH_FLAG", synchFlag);
			cmd.addParameter("@SDO_TILE_FLAG", sdoTileFlag);
				
			cmd.execute();


		}
		
		public static void populateIndexFixed(NString layer,NNumber tileSize,NBool synchFlag,NBool sdoTileFlag,NBool sdoMaxcodeFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.POPULATE_INDEX_FIXED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@TILE_SIZE", tileSize);
			cmd.addParameter("@SYNCH_FLAG", synchFlag);
			cmd.addParameter("@SDO_TILE_FLAG", sdoTileFlag);
			cmd.addParameter("@SDO_MAXCODE_FLAG", sdoMaxcodeFlag);
				
			cmd.execute();


		}
		
		public static void populateIndexFixedPoints(NString layer,NBool sdoTileFlag,NNumber commitCnt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.POPULATE_INDEX_FIXED_POINTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@SDO_TILE_FLAG", sdoTileFlag);
			cmd.addParameter("@COMMIT_CNT", commitCnt);
				
			cmd.execute();


		}
		
		public static NInteger FsdoCodeSize(NString layer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.SDO_CODE_SIZE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@LAYER", layer);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString FsdoVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.SDO_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void setCodeNull(NString layer,NNumber commitCnt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.SET_CODE_NULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@COMMIT_CNT", commitCnt);
				
			cmd.execute();


		}
		
		public static void updateIndex(NString layer,NNumber gid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.UPDATE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@GID", gid);
				
			cmd.execute();


		}
		
		public static void updateIndex(NString layer,NNumber gid,NNumber maxtiles,NBool replaceFlag,NBool sdoTileFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.UPDATE_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@GID", gid);
			cmd.addParameter("@MAXTILES", maxtiles);
			cmd.addParameter("@REPLACE_FLAG", replaceFlag);
			cmd.addParameter("@SDO_TILE_FLAG", sdoTileFlag);
				
			cmd.execute();


		}
		
		public static void updateIndexFixed(NString layer,NNumber gid,NNumber tileSize,NBool replaceFlag,NBool sdoTileFlag,NBool sdoMaxcodeFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_ADMIN.UPDATE_INDEX_FIXED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAYER", layer);
			cmd.addParameter("@GID", gid);
			cmd.addParameter("@TILE_SIZE", tileSize);
			cmd.addParameter("@REPLACE_FLAG", replaceFlag);
			cmd.addParameter("@SDO_TILE_FLAG", sdoTileFlag);
			cmd.addParameter("@SDO_MAXCODE_FLAG", sdoMaxcodeFlag);
				
			cmd.execute();


		}
		
	
	
	
}
