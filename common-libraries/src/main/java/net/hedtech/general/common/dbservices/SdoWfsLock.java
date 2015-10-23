package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoWfsLock {
		public static void deletetokensessionmap(NString tid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.DELETETOKENSESSIONMAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TID", tid);
				
			cmd.execute();


		}
		
		public static NString Fgeneratetokenid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.GENERATETOKENID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NNumber Flockrowsbyid(NString username,NString tablename,NString tablealias,NNumber expirytime,Ref<List<RowpointerlistRow>> rowslocked,Ref<List<RowpointerlistRow>> rowsnotlocked,NString lockall,List<StringlistRow> pkeycols,NString autocommit,List<RowpointerlistRow> rowstobelocked,NString orderclause,NString indexclause,NNumber maxcnt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.LOCKROWSBYID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@USERNAME", username);
//			cmd.addParameter("@TABLENAME", tablename);
//			cmd.addParameter("@TABLEALIAS", tablealias);
//			cmd.addParameter("@EXPIRYTIME", expirytime);
//			// cmd.addParameter(DbTypes.getCollectionType("ROWSLOCKED", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("ROWSNOTLOCKED", "", object.class));
//			cmd.addParameter("@LOCKALL", lockall);
//			// cmd.addParameter(DbTypes.getCollectionType("PKEYCOLS", "", pkeycols, object.class));
//			cmd.addParameter("@AUTOCOMMIT", autocommit);
//			// cmd.addParameter(DbTypes.getCollectionType("ROWSTOBELOCKED", "", rowstobelocked, object.class));
//			cmd.addParameter("@ORDERCLAUSE", orderclause);
//			cmd.addParameter("@INDEXCLAUSE", indexclause);
//			cmd.addParameter("@MAXCNT", maxcnt);
//				
//			cmd.execute();
//			// rowslocked.val = cmd.getTableParameterValue("@ROWSLOCKED", object.class);
//			// rowsnotlocked.val = cmd.getTableParameterValue("@ROWSNOTLOCKED", object.class);
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static void lockrowsbyid(NString ptokenid,NString username,NString tablename,NString tablealias,NNumber expirytime,Ref<List<RowpointerlistRow>> rowslocked,Ref<List<RowpointerlistRow>> rowsnotlocked,NString lockall,List<StringlistRow> pkeycols,NString autocommit,List<RowpointerlistRow> rowstobelocked,NString orderclause,NString indexclause,NNumber maxcnt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.LOCKROWSBYID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PTOKENID", ptokenid);
//			cmd.addParameter("@USERNAME", username);
//			cmd.addParameter("@TABLENAME", tablename);
//			cmd.addParameter("@TABLEALIAS", tablealias);
//			cmd.addParameter("@EXPIRYTIME", expirytime);
//			// cmd.addParameter(DbTypes.getCollectionType("ROWSLOCKED", "", object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("ROWSNOTLOCKED", "", object.class));
//			cmd.addParameter("@LOCKALL", lockall);
//			// cmd.addParameter(DbTypes.getCollectionType("PKEYCOLS", "", pkeycols, object.class));
//			cmd.addParameter("@AUTOCOMMIT", autocommit);
//			// cmd.addParameter(DbTypes.getCollectionType("ROWSTOBELOCKED", "", rowstobelocked, object.class));
//			cmd.addParameter("@ORDERCLAUSE", orderclause);
//			cmd.addParameter("@INDEXCLAUSE", indexclause);
//			cmd.addParameter("@MAXCNT", maxcnt);
//				
//			cmd.execute();
//			// rowslocked.val = cmd.getTableParameterValue("@ROWSLOCKED", object.class);
//			// rowsnotlocked.val = cmd.getTableParameterValue("@ROWSNOTLOCKED", object.class);
//
//
//		}
		
		public static NString Fquerytokensessionmap(NString tid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.QUERYTOKENSESSIONMAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TID", tid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void registerfeaturetable(NString username,NString tablename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.REGISTERFEATURETABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME", username);
			cmd.addParameter("@TABLENAME", tablename);
				
			cmd.execute();


		}
		
		public static void resettokenexpiry(NString tid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.RESETTOKENEXPIRY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TID", tid);
				
			cmd.execute();


		}
		
		public static void transfertokenbyid(NString ptokenid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.TRANSFERTOKENBYID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PTOKENID", ptokenid);
				
			cmd.execute();


		}
		
//		public static void unlockrowsbyid(NString ptokenid,NString username,NString tablename,NString tablealias,List<StringlistRow> pkeycols,NString autocommit,List<RowpointerlistRow> rowstobeunlocked) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.UNLOCKROWSBYID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PTOKENID", ptokenid);
//			cmd.addParameter("@USERNAME", username);
//			cmd.addParameter("@TABLENAME", tablename);
//			cmd.addParameter("@TABLEALIAS", tablealias);
//			// cmd.addParameter(DbTypes.getCollectionType("PKEYCOLS", "", pkeycols, object.class));
//			cmd.addParameter("@AUTOCOMMIT", autocommit);
//			// cmd.addParameter(DbTypes.getCollectionType("ROWSTOBEUNLOCKED", "", rowstobeunlocked, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void unregisterfeaturetable(NString username,NString tablename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.UNREGISTERFEATURETABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME", username);
			cmd.addParameter("@TABLENAME", tablename);
				
			cmd.execute();


		}
		
		public static void updatetokensessionmap(NString tid,NString sid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_WFS_LOCK.UPDATETOKENSESSIONMAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TID", tid);
			cmd.addParameter("@SID", sid);
				
			cmd.execute();


		}
		
	
	
	
}
