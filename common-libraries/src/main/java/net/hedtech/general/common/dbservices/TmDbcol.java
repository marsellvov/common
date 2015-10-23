package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TmDbcol {
		public static NNumber Fcountdata(NString powner,NString ptable,NString pcolumn,NString psearchlist) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBCOL.COUNTDATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@POWNER", powner);
			cmd.addParameter("@PTABLE", ptable);
			cmd.addParameter("@PCOLUMN", pcolumn);
			cmd.addParameter("@PSEARCHLIST", psearchlist);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fetchdata(NString pprojectCode,NString powner,NString ptable,NString pcolumn,NString plangCode,NString psearchlist) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBCOL.FETCHDATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PPROJECT_CODE", pprojectCode);
			cmd.addParameter("@POWNER", powner);
			cmd.addParameter("@PTABLE", ptable);
			cmd.addParameter("@PCOLUMN", pcolumn);
			cmd.addParameter("@PLANG_CODE", plangCode);
			cmd.addParameter("@PSEARCHLIST", psearchlist);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString Fgetnlscol(NString pOwner,NString pTable,NString pColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBCOL.GETNLSCOL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN", pColumn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetviewscript(NString pProject,NString pOwner,NString pTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBCOL.GETVIEWSCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROJECT", pProject);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_TABLE", pTable);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fkeycolsep() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBCOL.KEYCOLSEP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fmakewherecond(NString pcolumn,NString psearchlist) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBCOL.MAKEWHERECOND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PCOLUMN", pcolumn);
			cmd.addParameter("@PSEARCHLIST", psearchlist);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FprimaryKey(NString powner,NString ptable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBCOL.PRIMARY_KEY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@POWNER", powner);
			cmd.addParameter("@PTABLE", ptable);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber Fsetdbstring(NString pprojectCode,NString plangCode,NString powner,NString ptableName,NString pcolumnName,NString pprimaryKey,NNumber pstatus,NString pstring) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TM_DBCOL.SETDBSTRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PPROJECT_CODE", pprojectCode);
			cmd.addParameter("@PLANG_CODE", plangCode);
			cmd.addParameter("@POWNER", powner);
			cmd.addParameter("@PTABLE_NAME", ptableName);
			cmd.addParameter("@PCOLUMN_NAME", pcolumnName);
			cmd.addParameter("@PPRIMARY_KEY", pprimaryKey);
			cmd.addParameter("@PSTATUS", pstatus);
			cmd.addParameter("@PSTRING", pstring);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
