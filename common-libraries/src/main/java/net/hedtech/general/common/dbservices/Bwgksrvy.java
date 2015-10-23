package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgksrvy {
		public static NBool fResponsefound(NNumber pidm,NString srvyName,NNumber qustNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKSRVY.F_RESPONSEFOUND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SRVY_NAME", srvyName);
			cmd.addParameter("@QUST_NO", qustNo);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fResponseheadfound(NNumber pidm,NString srvyName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKSRVY.F_RESPONSEHEADFOUND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SRVY_NAME", srvyName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pSaveresponses(NString srvyName,NString srvyCmplt,NNumber qust1,NString rsp11,NString rsp12,NString rsp13,NString rsp14,NString rsp15,NString cmnt1,NString cmnt1Countdown,NNumber nextDisp,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKSRVY.P_SAVERESPONSES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRVY_NAME", srvyName);
			cmd.addParameter("@SRVY_CMPLT", srvyCmplt);
			cmd.addParameter("@QUST1", qust1);
			cmd.addParameter("@RSP11", rsp11);
			cmd.addParameter("@RSP12", rsp12);
			cmd.addParameter("@RSP13", rsp13);
			cmd.addParameter("@RSP14", rsp14);
			cmd.addParameter("@RSP15", rsp15);
			cmd.addParameter("@CMNT1", cmnt1);
			cmd.addParameter("@CMNT1_COUNTDOWN", cmnt1Countdown);
			cmd.addParameter("@NEXT_DISP", nextDisp);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pShowquestions(NString srvyName,NNumber nextDisp,NNumber qust1,NString rsp11,NString rsp12,NString rsp13,NString rsp14,NString rsp15,NString cmnt1,NString errText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKSRVY.P_SHOWQUESTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRVY_NAME", srvyName);
			cmd.addParameter("@NEXT_DISP", nextDisp);
			cmd.addParameter("@QUST1", qust1);
			cmd.addParameter("@RSP11", rsp11);
			cmd.addParameter("@RSP12", rsp12);
			cmd.addParameter("@RSP13", rsp13);
			cmd.addParameter("@RSP14", rsp14);
			cmd.addParameter("@RSP15", rsp15);
			cmd.addParameter("@CMNT1", cmnt1);
			cmd.addParameter("@ERR_TEXT", errText);
				
			cmd.execute();


		}
		
		public static void pShowsurveys() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKSRVY.P_SHOWSURVEYS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
