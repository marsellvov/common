package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwscxchn {
		public static NString fGetAcadProfile(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCXCHN.F_GET_ACAD_PROFILE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAccountSummary(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCXCHN.F_GET_ACCOUNT_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetError(NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCXCHN.F_GET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStatement(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCXCHN.F_GET_STATEMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStudentGrades(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCXCHN.F_GET_STUDENT_GRADES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStudentGradesEdit(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCXCHN.F_GET_STUDENT_GRADES_EDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNoDataMessage(NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCXCHN.F_NO_DATA_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetXml(DataCursor pCursorRef,Ref<NString> pResultOut,NString pSetlabel,NString pGrouplabel,NNumber pRows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCXCHN.P_GET_XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURSOR_REF", DataCursor.class);
			cmd.addParameter("@P_RESULT_OUT", NString.class);
			cmd.addParameter("@P_SETLABEL", pSetlabel);
			cmd.addParameter("@P_GROUPLABEL", pGrouplabel);
			cmd.addParameter("@P_ROWS", pRows);
				
			cmd.execute();
			pResultOut.val = cmd.getParameterValue("@P_RESULT_OUT", NString.class);


		}
		
	
	
	
}
