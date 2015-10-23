package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class LmOratar {
		public static void pAppendxml(Ref<NString> pFinalInout,Ref<NString> pSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LM_ORATAR.P_APPENDXML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FINAL_INOUT", pFinalInout, true);
			cmd.addParameter("@P_SOURCE", pSource, true);
				
			cmd.execute();
			pFinalInout.val = cmd.getParameterValue("@P_FINAL_INOUT", NString.class);
			pSource.val = cmd.getParameterValue("@P_SOURCE", NString.class);


		}
		
		public static void pGetRef(NString pLvDummyOne,NString pLvDummyTwo,Ref<DataCursor> pDummyRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LM_ORATAR.P_GET_REF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LV_DUMMY_ONE", pLvDummyOne);
			cmd.addParameter("@P_LV_DUMMY_TWO", pLvDummyTwo);
			cmd.addParameter("@P_DUMMY_REF", DataCursor.class);
				
			cmd.execute();
			pDummyRef.val = cmd.getParameterValue("@P_DUMMY_REF", DataCursor.class);


		}
		
		public static void pGetXml(DataCursor pCursorRef,Ref<NString> pResultOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LM_ORATAR.P_GET_XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURSOR_REF", DataCursor.class);
			cmd.addParameter("@P_RESULT_OUT", NString.class);
				
			cmd.execute();
			pResultOut.val = cmd.getParameterValue("@P_RESULT_OUT", NString.class);


		}
		
		public static void pInitXml(Ref<NString> pResultOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LM_ORATAR.P_INIT_XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULT_OUT", NString.class);
				
			cmd.execute();
			pResultOut.val = cmd.getParameterValue("@P_RESULT_OUT", NString.class);


		}
		
		public static void pPrintclob(NString pResult) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LM_ORATAR.P_PRINTCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULT", pResult);
				
			cmd.execute();


		}
		
		public static void pThisFails() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LM_ORATAR.P_THIS_FAILS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pThisWorks() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LM_ORATAR.P_THIS_WORKS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
