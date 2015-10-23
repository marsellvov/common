package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdupd {
		public static NDate fDeterminecoverageenddate(NNumber pidm,NString bdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUPD.F_DETERMINECOVERAGEENDDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void pDetermineamtfmtlen(NNumber inAmtNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUPD.P_DETERMINEAMTFMTLEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_AMT_NO", inAmtNo);
				
			cmd.execute();


		}
		
		public static void pDispupdatefieldnoplan(NString inDesc,NString inTitle,NString inInd,NString inValue,NString inField,NString inSize,NString inMaxsize,NString inAddlHelp,NBool inCheckPlan) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUPD.P_DISPUPDATEFIELDNOPLAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_DESC", inDesc);
			cmd.addParameter("@IN_TITLE", inTitle);
			cmd.addParameter("@IN_IND", inInd);
			cmd.addParameter("@IN_VALUE", inValue);
			cmd.addParameter("@IN_FIELD", inField);
			cmd.addParameter("@IN_SIZE", inSize);
			cmd.addParameter("@IN_MAXSIZE", inMaxsize);
			cmd.addParameter("@IN_ADDL_HELP", inAddlHelp);
			cmd.addParameter("@IN_CHECK_PLAN", inCheckPlan);
				
			cmd.execute();


		}
		
		public static void pUpdatededndriver(NNumber pidm,NString dcde,NString efdt,NString delc,NString stat,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5,NString nameDiffInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUPD.P_UPDATEDEDNDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@EFDT", efdt);
			cmd.addParameter("@DELC", delc);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
			cmd.addParameter("@NAME_DIFF_IND", nameDiffInd);
				
			cmd.execute();


		}
		
		public static void pUpdatededneditbyfield(NNumber pidm,NString dcde,NString inValue,NString inInd,NString inFormat,NNumber inRangeLo,NNumber inRangeHi,NString inTitle,NString inDesc,NBool inCheckNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUPD.P_UPDATEDEDNEDITBYFIELD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@IN_VALUE", inValue);
			cmd.addParameter("@IN_IND", inInd);
			cmd.addParameter("@IN_FORMAT", inFormat);
			cmd.addParameter("@IN_RANGE_LO", inRangeLo);
			cmd.addParameter("@IN_RANGE_HI", inRangeHi);
			cmd.addParameter("@IN_TITLE", inTitle);
			cmd.addParameter("@IN_DESC", inDesc);
			cmd.addParameter("@IN_CHECK_NUMBER", inCheckNumber);
				
			cmd.execute();


		}
		
		public static void pUpdatedednprocess(NString dcde,NString efdt,NString delc,NString stat,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5,NDate displayDate,NString nameDiffInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUPD.P_UPDATEDEDNPROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@EFDT", efdt);
			cmd.addParameter("@DELC", delc);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
			cmd.addParameter("@DISPLAY_DATE", displayDate);
			cmd.addParameter("@NAME_DIFF_IND", nameDiffInd);
				
			cmd.execute();


		}
		
		public static void pUpdatedednprocrecords(NNumber pidm,NString dcde,NString efdt,NString delc,NString stat,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5,NString nameDiffInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDUPD.P_UPDATEDEDNPROCRECORDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@EFDT", efdt);
			cmd.addParameter("@DELC", delc);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
			cmd.addParameter("@NAME_DIFF_IND", nameDiffInd);
				
			cmd.execute();


		}
		
	
	
	
}
