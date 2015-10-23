package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Srefcur {
		public static NString fGetAstdDesc(NString astdCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SREFCUR.F_GET_ASTD_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ASTD_CODE_IN", astdCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDateFmt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SREFCUR.F_GET_DATE_FMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetDeanslistRefcursor(NString termIn,Ref<DataCursor> dlRefcursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SREFCUR.P_GET_DEANSLIST_REFCURSOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DL_REFCURSOR", DataCursor.class);
				
			cmd.execute();
			dlRefcursor.val = cmd.getParameterValue("@DL_REFCURSOR", DataCursor.class);


		}
		
//		public static void pGetTermRefcursor(Ref<DataCursor> termRefcur) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SREFCUR.P_GET_TERM_REFCURSOR", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM_REFCUR", DataCursor.class);
//				
//			cmd.execute();
//			termRefcur.val = cmd.getParameterValue("@TERM_REFCUR", DataCursor.class);
//
//
//		}
//		
//		public static void pGetTermRefcursor(Ref<NString> sqlStmt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SREFCUR.P_GET_TERM_REFCURSOR", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@SQL_STMT", sqlStmt, true);
//				
//			cmd.execute();
//			sqlStmt.val = cmd.getParameterValue("@SQL_STMT", NString.class);


//		}
		
	
	
	
}
