package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwsksmrk {
		public static NBool FgradeScaleAllowedOnWeb() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKSMRK.GRADE_SCALE_ALLOWED_ON_WEB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pDispsubc(NString termIn,NString crnIn,NNumber gcomId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKSMRK.P_DISPSUBC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID", gcomId);
				
			cmd.execute();


		}
		
		public static void pWriteCrnSelection(NString termIn,NString anchorCallIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKSMRK.P_WRITE_CRN_SELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ANCHOR_CALL_IN", anchorCallIn);
				
			cmd.execute();


		}
		
		public static void pWriteGradeDetail(NString termIn,NString crnIn,NString callingProcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKSMRK.P_WRITE_GRADE_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@CALLING_PROC_IN", callingProcIn);
				
			cmd.execute();


		}
		
		public static void pWriteTermSelection(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKSMRK.P_WRITE_TERM_SELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
	
	
	
}
