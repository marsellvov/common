package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkfshd {
		public static void pCrseschddetl(NString termIn,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFSHD.P_CRSESCHDDETL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();


		}
		
		public static void pFacstucrseschd(NString xyz,NString term,NString startDateIn,NString errorMsgIn,NString errorDateIn,NString msg,NString pinrule,NString pinNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFSHD.P_FACSTUCRSESCHD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@ERROR_MSG_IN", errorMsgIn);
			cmd.addParameter("@ERROR_DATE_IN", errorDateIn);
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@PINRULE", pinrule);
			cmd.addParameter("@PIN_NUMB", pinNumb);
				
			cmd.execute();


		}
		
		public static void pProcCrseSchd(NString gotoDateIn,NString startDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFSHD.P_PROC_CRSE_SCHD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GOTO_DATE_IN", gotoDateIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
				
			cmd.execute();


		}
		
	
	
	
}
