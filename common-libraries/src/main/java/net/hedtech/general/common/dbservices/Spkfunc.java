package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Spkfunc {
//		public static void pCheckHolds(NNumber pidmIn,Ref<NNumber> numHoldsInOut,Ref<List<Soktabs.SprholdTabTypeRow>> sprholdTable,Ref<List<Soktabs.StvhlddTabTypeRow>> stvhlddTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SPKFUNC.P_CHECK_HOLDS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@NUM_HOLDS_IN_OUT", numHoldsInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("SPRHOLD_TABLE", "", sprholdTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVHLDD_TABLE", "", stvhlddTable.val, object.class , true));
//				
//			cmd.execute();
//			numHoldsInOut.val = cmd.getParameterValue("@NUM_HOLDS_IN_OUT", NNumber.class);
//			// sprholdTable.val = cmd.getTableParameterValue("@SPRHOLD_TABLE", object.class);
//			// stvhlddTable.val = cmd.getTableParameterValue("@STVHLDD_TABLE", object.class);
//
//
//		}
		
		public static void pValidateStudentId(Ref<NString> idInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SPKFUNC.P_VALIDATE_STUDENT_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ID_IN_OUT", idInOut, true);
				
			cmd.execute();
			idInOut.val = cmd.getParameterValue("@ID_IN_OUT", NString.class);


		}
		
	
	
	
}
