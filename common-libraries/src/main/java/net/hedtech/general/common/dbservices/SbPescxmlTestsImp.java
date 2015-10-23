package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlTestsImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TESTS_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pLoadTestsToBanner(NNumber pPidm,NNumber pDcmtSeqno,Ref<NString> pErrMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TESTS_IMP.P_LOAD_TESTS_TO_BANNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ERR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrMsgOut.val = cmd.getParameterValue("@P_ERR_MSG_OUT", NString.class);


		}
		
		public static void pSubtestElement(NNumber pDcmtSeqnoIn,NNumber pTestSeqnoIn,NNumber pSubtestSeqnoIn,NString pTestcodeIn,NString pSubtestcodeIn,NString pSubtestnameIn,NString pSubtestNoteIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TESTS_IMP.P_SUBTEST_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_TEST_SEQNO_IN", pTestSeqnoIn);
			cmd.addParameter("@P_SUBTEST_SEQNO_IN", pSubtestSeqnoIn);
			cmd.addParameter("@P_TESTCODE_IN", pTestcodeIn);
			cmd.addParameter("@P_SUBTESTCODE_IN", pSubtestcodeIn);
			cmd.addParameter("@P_SUBTESTNAME_IN", pSubtestnameIn);
			cmd.addParameter("@P_SUBTEST_NOTE_IN", pSubtestNoteIn);
				
			cmd.execute();


		}
		
		public static void pSubtestScoreElement(NNumber pDcmtSeqnoIn,NNumber pTestSeqnoIn,NNumber pSubtestSeqnoIn,NNumber pSubtestScoreSeqnoIn,NString pScorevalueIn,NString pTestscoremethodIn,NString pScorereviseindIn,NString pScoreinvalidindIn,NString pSelfscorereportedindIn,NString pTestscoresNoteIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TESTS_IMP.P_SUBTEST_SCORE_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_TEST_SEQNO_IN", pTestSeqnoIn);
			cmd.addParameter("@P_SUBTEST_SEQNO_IN", pSubtestSeqnoIn);
			cmd.addParameter("@P_SUBTEST_SCORE_SEQNO_IN", pSubtestScoreSeqnoIn);
			cmd.addParameter("@P_SCOREVALUE_IN", pScorevalueIn);
			cmd.addParameter("@P_TESTSCOREMETHOD_IN", pTestscoremethodIn);
			cmd.addParameter("@P_SCOREREVISEIND_IN", pScorereviseindIn);
			cmd.addParameter("@P_SCOREINVALIDIND_IN", pScoreinvalidindIn);
			cmd.addParameter("@P_SELFSCOREREPORTEDIND_IN", pSelfscorereportedindIn);
			cmd.addParameter("@P_TESTSCORES_NOTE_IN", pTestscoresNoteIn);
				
			cmd.execute();


		}
		
		public static void pTestElement(NNumber pDcmtSeqnoIn,NNumber pTestSeqnoIn,NString pTestcodeIn,NString pTestnameIn,NString pTestdateTypeIn,NString pTestdateValueIn,NString pStudentlevelcodeIn,NString pStudentlevelNoteIn,NString pTestNoteIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_TESTS_IMP.P_TEST_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_TEST_SEQNO_IN", pTestSeqnoIn);
			cmd.addParameter("@P_TESTCODE_IN", pTestcodeIn);
			cmd.addParameter("@P_TESTNAME_IN", pTestnameIn);
			cmd.addParameter("@P_TESTDATE_TYPE_IN", pTestdateTypeIn);
			cmd.addParameter("@P_TESTDATE_VALUE_IN", pTestdateValueIn);
			cmd.addParameter("@P_STUDENTLEVELCODE_IN", pStudentlevelcodeIn);
			cmd.addParameter("@P_STUDENTLEVEL_NOTE_IN", pStudentlevelNoteIn);
			cmd.addParameter("@P_TEST_NOTE_IN", pTestNoteIn);
				
			cmd.execute();


		}
		
	
	
	
}
