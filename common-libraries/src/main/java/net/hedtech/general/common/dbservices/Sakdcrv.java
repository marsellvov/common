package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakdcrv {
		public static NString fCheckcurriculum(NString termIn,NNumber applNoIn,NNumber pidmIn,NString coll1In,NString degc1In,NString levl1In,NString camp1In,NString program1In,NString major1In,NString lfst1In,NString coll2In,NString degc2In,NString levl2In,NString camp2In,NString program2In,NString major2In,NString lfst2In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCRV.F_CHECKCURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@COLL1_IN", coll1In);
			cmd.addParameter("@DEGC1_IN", degc1In);
			cmd.addParameter("@LEVL1_IN", levl1In);
			cmd.addParameter("@CAMP1_IN", camp1In);
			cmd.addParameter("@PROGRAM1_IN", program1In);
			cmd.addParameter("@MAJOR1_IN", major1In);
			cmd.addParameter("@LFST1_IN", lfst1In);
			cmd.addParameter("@COLL2_IN", coll2In);
			cmd.addParameter("@DEGC2_IN", degc2In);
			cmd.addParameter("@LEVL2_IN", levl2In);
			cmd.addParameter("@CAMP2_IN", camp2In);
			cmd.addParameter("@PROGRAM2_IN", program2In);
			cmd.addParameter("@MAJOR2_IN", major2In);
			cmd.addParameter("@LFST2_IN", lfst2In);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkhighschool(NString dplmCodeHsIn,NString minGpaHsIn,NNumber minPercentileHsIn,NNumber maxPercentileHsIn,NString collPrepIndHsIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCRV.F_CHKHIGHSCHOOL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DPLM_CODE_HS_IN", dplmCodeHsIn);
			cmd.addParameter("@MIN_GPA_HS_IN", minGpaHsIn);
			cmd.addParameter("@MIN_PERCENTILE_HS_IN", minPercentileHsIn);
			cmd.addParameter("@MAX_PERCENTILE_HS_IN", maxPercentileHsIn);
			cmd.addParameter("@COLL_PREP_IND_HS_IN", collPrepIndHsIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkhighschoolsubject(NString termIn,NString apdcIn,NNumber seqNoIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCRV.F_CHKHIGHSCHOOLSUBJECT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@APDC_IN", apdcIn);
			cmd.addParameter("@SEQ_NO_IN", seqNoIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkpriorcollege(NString degcCodePcIn,NNumber minHoursTransPcIn,NNumber minGpaTransPcIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCRV.F_CHKPRIORCOLLEGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DEGC_CODE_PC_IN", degcCodePcIn);
			cmd.addParameter("@MIN_HOURS_TRANS_PC_IN", minHoursTransPcIn);
			cmd.addParameter("@MIN_GPA_TRANS_PC_IN", minGpaTransPcIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkrating(NString termIn,NString apdcIn,NNumber seqNoIn,NNumber applNoIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCRV.F_CHKRATING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@APDC_IN", apdcIn);
			cmd.addParameter("@SEQ_NO_IN", seqNoIn);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChktestscores(NString termIn,NString apdcIn,NNumber seqNoIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCRV.F_CHKTESTSCORES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@APDC_IN", apdcIn);
			cmd.addParameter("@SEQ_NO_IN", seqNoIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pReviewdecision(NString termIn,NNumber pidmIn,NNumber applNoIn,NString apdcCodeIn,NString dplmCodeHsIn,NString minGpaHsIn,NNumber minPercentileHsIn,NNumber maxPercentileHsIn,NString collPrepIndHsIn,NNumber seqNoIn,NString degcCodePcIn,NNumber minHoursTransPcIn,NNumber minGpaTransPcIn,Ref<NString> highschoolIndOut,Ref<NString> subjectIndOut,Ref<NString> priorCollIndOut,Ref<NString> testScoreIndOut,Ref<NString> ratingIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCRV.P_REVIEWDECISION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@APDC_CODE_IN", apdcCodeIn);
			cmd.addParameter("@DPLM_CODE_HS_IN", dplmCodeHsIn);
			cmd.addParameter("@MIN_GPA_HS_IN", minGpaHsIn);
			cmd.addParameter("@MIN_PERCENTILE_HS_IN", minPercentileHsIn);
			cmd.addParameter("@MAX_PERCENTILE_HS_IN", maxPercentileHsIn);
			cmd.addParameter("@COLL_PREP_IND_HS_IN", collPrepIndHsIn);
			cmd.addParameter("@SEQ_NO_IN", seqNoIn);
			cmd.addParameter("@DEGC_CODE_PC_IN", degcCodePcIn);
			cmd.addParameter("@MIN_HOURS_TRANS_PC_IN", minHoursTransPcIn);
			cmd.addParameter("@MIN_GPA_TRANS_PC_IN", minGpaTransPcIn);
			cmd.addParameter("@HIGHSCHOOL_IND_OUT", NString.class);
			cmd.addParameter("@SUBJECT_IND_OUT", NString.class);
			cmd.addParameter("@PRIOR_COLL_IND_OUT", NString.class);
			cmd.addParameter("@TEST_SCORE_IND_OUT", NString.class);
			cmd.addParameter("@RATING_IND_OUT", NString.class);
				
			cmd.execute();
			highschoolIndOut.val = cmd.getParameterValue("@HIGHSCHOOL_IND_OUT", NString.class);
			subjectIndOut.val = cmd.getParameterValue("@SUBJECT_IND_OUT", NString.class);
			priorCollIndOut.val = cmd.getParameterValue("@PRIOR_COLL_IND_OUT", NString.class);
			testScoreIndOut.val = cmd.getParameterValue("@TEST_SCORE_IND_OUT", NString.class);
			ratingIndOut.val = cmd.getParameterValue("@RATING_IND_OUT", NString.class);


		}
		
		public static void pReviewdecision(NString termIn,NNumber pidmIn,NNumber applNoIn,Ref<NString> apdcCodeOut,Ref<NString> saradapRowidOut,Ref<NString> sardcsnRowidOut,Ref<NString> highschoolIndOut,Ref<NString> subjectIndOut,Ref<NString> priorCollIndOut,Ref<NString> testScoreIndOut,Ref<NString> ratingIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKDCRV.P_REVIEWDECISION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@APDC_CODE_OUT", NString.class);
			cmd.addParameter("@SARADAP_ROWID_OUT", NString.class);
			cmd.addParameter("@SARDCSN_ROWID_OUT", NString.class);
			cmd.addParameter("@HIGHSCHOOL_IND_OUT", NString.class);
			cmd.addParameter("@SUBJECT_IND_OUT", NString.class);
			cmd.addParameter("@PRIOR_COLL_IND_OUT", NString.class);
			cmd.addParameter("@TEST_SCORE_IND_OUT", NString.class);
			cmd.addParameter("@RATING_IND_OUT", NString.class);
				
			cmd.execute();
			apdcCodeOut.val = cmd.getParameterValue("@APDC_CODE_OUT", NString.class);
			saradapRowidOut.val = cmd.getParameterValue("@SARADAP_ROWID_OUT", NString.class);
			sardcsnRowidOut.val = cmd.getParameterValue("@SARDCSN_ROWID_OUT", NString.class);
			highschoolIndOut.val = cmd.getParameterValue("@HIGHSCHOOL_IND_OUT", NString.class);
			subjectIndOut.val = cmd.getParameterValue("@SUBJECT_IND_OUT", NString.class);
			priorCollIndOut.val = cmd.getParameterValue("@PRIOR_COLL_IND_OUT", NString.class);
			testScoreIndOut.val = cmd.getParameterValue("@TEST_SCORE_IND_OUT", NString.class);
			ratingIndOut.val = cmd.getParameterValue("@RATING_IND_OUT", NString.class);


		}
		
	
	
	
}
