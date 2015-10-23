package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpksorg {
		public static void pBuildBdlc(NString inPidm,NString inUser,NString inExtract,NString inScenario,NString inOrgn,NString inOrgnPred,NString inLockstatus,NString inWbudChecked,Ref<NNumber> rowsInsertedCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSORG.P_BUILD_BDLC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_EXTRACT", inExtract);
			cmd.addParameter("@IN_SCENARIO", inScenario);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_ORGN_PRED", inOrgnPred);
			cmd.addParameter("@IN_LOCKSTATUS", inLockstatus);
			cmd.addParameter("@IN_WBUD_CHECKED", inWbudChecked);
			cmd.addParameter("@ROWS_INSERTED_COUNT", NNumber.class);
				
			cmd.execute();
			rowsInsertedCount.val = cmd.getParameterValue("@ROWS_INSERTED_COUNT", NNumber.class);


		}
		
		public static void pChooseorgnlock(NString extractvalue,NString scenariovalue,NString extract,NString scenario,NString lockstatus,NString orgnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSORG.P_CHOOSEORGNLOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACTVALUE", extractvalue);
			cmd.addParameter("@SCENARIOVALUE", scenariovalue);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@LOCKSTATUS", lockstatus);
			cmd.addParameter("@ORGNSELECTED", orgnselected);
				
			cmd.execute();


		}
		
		public static void pListofvaluesld(NString extract,NString scenario,NString lockstatus,NString orgnCode,NString type,NString code,NString title,NString maxrows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSORG.P_LISTOFVALUESLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@LOCKSTATUS", lockstatus);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@TYPE", type);
			cmd.addParameter("@CODE", code);
			cmd.addParameter("@TITLE", title);
			cmd.addParameter("@MAXROWS", maxrows);
				
			cmd.execute();


		}
		
//		public static void pLockorgn(NString inExtract,NString inScenario,NString inOrgn,NString inOrgnTitle,NString inPredOrgnCode,NString inLockstatus,List<Twbklibs.Varchar2TabtypeRow> checkBox,NString complete) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSORG.P_LOCKORGN", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@IN_EXTRACT", inExtract);
//			cmd.addParameter("@IN_SCENARIO", inScenario);
//			cmd.addParameter("@IN_ORGN", inOrgn);
//			cmd.addParameter("@IN_ORGN_TITLE", inOrgnTitle);
//			cmd.addParameter("@IN_PRED_ORGN_CODE", inPredOrgnCode);
//			cmd.addParameter("@IN_LOCKSTATUS", inLockstatus);
//			// cmd.addParameter(DbTypes.getTableType("CHECK_BOX", "", checkBox, object.class));
//			cmd.addParameter("@COMPLETE", complete);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSubmitorgnlock(NString extractidselected,NString scenarioselected,NString lockstatus,NString orgnselected,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSORG.P_SUBMITORGNLOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACTIDSELECTED", extractidselected);
			cmd.addParameter("@SCENARIOSELECTED", scenarioselected);
			cmd.addParameter("@LOCKSTATUS", lockstatus);
			cmd.addParameter("@ORGNSELECTED", orgnselected);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
	
	
	
}
