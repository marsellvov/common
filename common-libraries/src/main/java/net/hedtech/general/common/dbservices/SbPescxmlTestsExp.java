package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlTestsExp {
		public static NString fSelfReported(NString pTsrcCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TESTS_EXP.F_SELF_REPORTED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TSRC_CODE_IN", pTsrcCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fSubtestElement(NNumber pPidmIn,NString pTestCodeIn,NString pTestDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TESTS_EXP.F_SUBTEST_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_TEST_CODE_IN", pTestCodeIn);
			cmd.addParameter("@P_TEST_DATE_IN", pTestDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSubtestScoreElement(NNumber pPidmIn,NString pTestCodeIn,NString pTestDateIn,NString pSubtestCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TESTS_EXP.F_SUBTEST_SCORE_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_TEST_CODE_IN", pTestCodeIn);
			cmd.addParameter("@P_TEST_DATE_IN", pTestDateIn);
			cmd.addParameter("@P_SUBTEST_CODE_IN", pSubtestCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fTestsElement(NNumber pRequestPidmIn,NString pRequestLevlIn,NString pRequestTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TESTS_EXP.F_TESTS_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	@DbRecordType(id="SubtestRow", dataSourceName="SUBTEST")
	public static class SubtestRow
	{
		@DbRecordField(dataSourceName="BANNERSUBTESTCODE")
		public NString Bannersubtestcode;
		@DbRecordField(dataSourceName="SUBTESTCODE")
		public NString Subtestcode;
		@DbRecordField(dataSourceName="SUBTESTNAME")
		public NString Subtestname;
		@DbRecordField(dataSourceName="NOTEMESSAGE")
		public NString Notemessage;
	}

	
	@DbRecordType(id="SubtestScoreRow", dataSourceName="SUBTEST_SCORE")
	public static class SubtestScoreRow
	{
		@DbRecordField(dataSourceName="SCOREVALUE")
		public NString Scorevalue;
		@DbRecordField(dataSourceName="TESTSCOREMETHOD")
		public NString Testscoremethod;
		@DbRecordField(dataSourceName="SCOREREVISEDINDICATOR")
		public NString Scorerevisedindicator;
		@DbRecordField(dataSourceName="SCOREINVALIDATEDINDICATOR")
		public NString Scoreinvalidatedindicator;
		@DbRecordField(dataSourceName="SCORESELFREPORTEDINDICATOR")
		public NString Scoreselfreportedindicator;
		@DbRecordField(dataSourceName="NOTEMESSAGE")
		public NString Notemessage;
	}

	
	@DbRecordType(id="TestRow", dataSourceName="TEST")
	public static class TestRow
	{
		@DbRecordField(dataSourceName="TESTCODE")
		public NString Testcode;
		@DbRecordField(dataSourceName="TESTNAME")
		public NString Testname;
		@DbRecordField(dataSourceName="TESTDATETYPE")
		public NString Testdatetype;
		@DbRecordField(dataSourceName="TESTDATEVALUE")
		public NString Testdatevalue;
		@DbRecordField(dataSourceName="STUDENTLEVEL")
		public NString Studentlevel;
		@DbRecordField(dataSourceName="STULEVL_NOTEMESSAGE")
		public NString StulevlNotemessage;
		@DbRecordField(dataSourceName="NOTEMESSAGE")
		public NString Notemessage;
	}

	
	
}
