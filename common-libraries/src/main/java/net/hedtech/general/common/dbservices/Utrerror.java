package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utrerror {
		public static void passert(NBool conditionIn,NString messageIn,NBool raiseexc,NNumber raiseerr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRERROR.ASSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONDITION_IN", conditionIn);
			cmd.addParameter("@MESSAGE_IN", messageIn);
			cmd.addParameter("@RAISEEXC", raiseexc);
			cmd.addParameter("@RAISEERR", raiseerr);
				
			cmd.execute();


		}
		
		public static void ocReport(NNumber runIn,NNumber outcomeIn,NNumber errcodeIn,NString errtextIn,NString descriptionIn,NBool raiseexc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRERROR.OC_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_IN", runIn);
			cmd.addParameter("@OUTCOME_IN", outcomeIn);
			cmd.addParameter("@ERRCODE_IN", errcodeIn);
			cmd.addParameter("@ERRTEXT_IN", errtextIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@RAISEEXC", raiseexc);
				
			cmd.execute();


		}
		
		public static void report(NNumber errcodeIn,NString errtextIn,NString descriptionIn,NString errlevelIn,NBool recorderr,NBool raiseexc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRERROR.REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ERRCODE_IN", errcodeIn);
			cmd.addParameter("@ERRTEXT_IN", errtextIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@ERRLEVEL_IN", errlevelIn);
			cmd.addParameter("@RECORDERR", recorderr);
			cmd.addParameter("@RAISEEXC", raiseexc);
				
			cmd.execute();


		}
		
		public static void reportDefineError(NString defineIn,NString messageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRERROR.REPORT_DEFINE_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEFINE_IN", defineIn);
			cmd.addParameter("@MESSAGE_IN", messageIn);
				
			cmd.execute();


		}
		
		public static void suiteReport(NNumber runIn,NNumber suiteIn,NNumber errcodeIn,NString errtextIn,NString descriptionIn,NBool raiseexc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRERROR.SUITE_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_IN", runIn);
			cmd.addParameter("@SUITE_IN", suiteIn);
			cmd.addParameter("@ERRCODE_IN", errcodeIn);
			cmd.addParameter("@ERRTEXT_IN", errtextIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@RAISEEXC", raiseexc);
				
			cmd.execute();


		}
		
		public static void tcReport(NNumber runIn,NNumber testcaseIn,NNumber errcodeIn,NString errtextIn,NString descriptionIn,NBool raiseexc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRERROR.TC_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_IN", runIn);
			cmd.addParameter("@TESTCASE_IN", testcaseIn);
			cmd.addParameter("@ERRCODE_IN", errcodeIn);
			cmd.addParameter("@ERRTEXT_IN", errtextIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@RAISEEXC", raiseexc);
				
			cmd.execute();


		}
		
		public static void utReport(NNumber runIn,NNumber unittestIn,NNumber errcodeIn,NString errtextIn,NString descriptionIn,NBool raiseexc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRERROR.UT_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_IN", runIn);
			cmd.addParameter("@UNITTEST_IN", unittestIn);
			cmd.addParameter("@ERRCODE_IN", errcodeIn);
			cmd.addParameter("@ERRTEXT_IN", errtextIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@RAISEEXC", raiseexc);
				
			cmd.execute();


		}
		
		public static NNumber Futerrcode(NString errmsgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRERROR.UTERRCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@ERRMSG_IN", errmsgIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void utpReport(NNumber runIn,NNumber utpIn,NNumber errcodeIn,NString errtextIn,NString descriptionIn,NBool raiseexc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRERROR.UTP_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_IN", runIn);
			cmd.addParameter("@UTP_IN", utpIn);
			cmd.addParameter("@ERRCODE_IN", errcodeIn);
			cmd.addParameter("@ERRTEXT_IN", errtextIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@RAISEEXC", raiseexc);
				
			cmd.execute();


		}
		
	
	
	
}
