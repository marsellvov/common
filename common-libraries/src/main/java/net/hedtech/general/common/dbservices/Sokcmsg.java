package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokcmsg {
		public static NString fCurriculumerrormsg(NString errorLevel,NString errorType,NString currInd,NNumber errorNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCMSG.F_CURRICULUMERRORMSG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ERROR_LEVEL", errorLevel);
			cmd.addParameter("@ERROR_TYPE", errorType);
			cmd.addParameter("@CURR_IND", currInd);
			cmd.addParameter("@ERROR_NUMBER", errorNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSaradaperroritem(NString currInd,NString errorType,NNumber errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCMSG.F_SARADAPERRORITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_IND", currInd);
			cmd.addParameter("@ERROR_TYPE", errorType);
			cmd.addParameter("@ERR_NUMBER", errNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSgbstdnerroritem(NString currInd,NString errorType,NNumber errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCMSG.F_SGBSTDNERRORITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_IND", currInd);
			cmd.addParameter("@ERROR_TYPE", errorType);
			cmd.addParameter("@ERR_NUMBER", errNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShrdgmrerroritem(NString currInd,NString errorType,NNumber errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCMSG.F_SHRDGMRERRORITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_IND", currInd);
			cmd.addParameter("@ERROR_TYPE", errorType);
			cmd.addParameter("@ERR_NUMBER", errNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSmrrqcmerroritem(NString currInd,NString errorType,NNumber errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCMSG.F_SMRRQCMERRORITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_IND", currInd);
			cmd.addParameter("@ERROR_TYPE", errorType);
			cmd.addParameter("@ERR_NUMBER", errNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSorlcurerroritem(NString errorType,NNumber errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCMSG.F_SORLCURERRORITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ERROR_TYPE", errorType);
			cmd.addParameter("@ERR_NUMBER", errNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSorlcurerrormsg(NString errorLevel,NString errorType,NNumber errorNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCMSG.F_SORLCURERRORMSG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ERROR_LEVEL", errorLevel);
			cmd.addParameter("@ERROR_TYPE", errorType);
			cmd.addParameter("@ERROR_NUMBER", errorNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSrbrecrerroritem(NString currInd,NString errorType,NNumber errNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCMSG.F_SRBRECRERRORITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURR_IND", currInd);
			cmd.addParameter("@ERROR_TYPE", errorType);
			cmd.addParameter("@ERR_NUMBER", errNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
