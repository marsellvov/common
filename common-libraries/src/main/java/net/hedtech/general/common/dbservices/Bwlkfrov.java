package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkfrov {
		public static void pDispcurovr(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFROV.P_DISPCUROVR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();


		}
		
		public static void pDispintable(NNumber pidm,NString term,NNumber holdStupidm,NString msgLabel,Ref<NBool> returnStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFROV.P_DISPINTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@HOLD_STUPIDM", holdStupidm);
			cmd.addParameter("@MSG_LABEL", msgLabel);
			cmd.addParameter("@RETURN_STATUS", NBool.class);
				
			cmd.execute();
			returnStatus.val = cmd.getParameterValue("@RETURN_STATUS", NBool.class);


		}
		
		public static void pFaccommitregchgs(NString term,NNumber stupidm,NString codeIn1,NString codeIn2,NString codeIn3,NString crnIn1,NString crnIn2,NString crnIn3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFROV.P_FACCOMMITREGCHGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@STUPIDM", stupidm);
			cmd.addParameter("@CODE_IN1", codeIn1);
			cmd.addParameter("@CODE_IN2", codeIn2);
			cmd.addParameter("@CODE_IN3", codeIn3);
			cmd.addParameter("@CRN_IN1", crnIn1);
			cmd.addParameter("@CRN_IN2", crnIn2);
			cmd.addParameter("@CRN_IN3", crnIn3);
				
			cmd.execute();


		}
		
		public static void pFacregovr(NString term,NString xyz,NString msgLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFROV.P_FACREGOVR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@MSG_LABEL", msgLabel);
				
			cmd.execute();


		}
		
		public static void pFacverifyregchgs(NString term,NNumber stupidm,NString codeIn1,NString codeIn2,NString codeIn3,NString crnIn1,NString crnIn2,NString crnIn3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFROV.P_FACVERIFYREGCHGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@STUPIDM", stupidm);
			cmd.addParameter("@CODE_IN1", codeIn1);
			cmd.addParameter("@CODE_IN2", codeIn2);
			cmd.addParameter("@CODE_IN3", codeIn3);
			cmd.addParameter("@CRN_IN1", crnIn1);
			cmd.addParameter("@CRN_IN2", crnIn2);
			cmd.addParameter("@CRN_IN3", crnIn3);
				
			cmd.execute();


		}
		
	
	
	
}
