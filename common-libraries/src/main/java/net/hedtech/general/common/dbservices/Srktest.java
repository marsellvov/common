package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Srktest {
		public static NString fGetAdmr(NString tescCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_GET_ADMR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TESC_CODE_IN", tescCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAdmrTestDate(NNumber pidmIn,NString admrCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_GET_ADMR_TEST_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADMR_CODE_IN", admrCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetExistingScore(NNumber pidmIn,NString equivTescCodeIn,NDate testDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_GET_EXISTING_SCORE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@EQUIV_TESC_CODE_IN", equivTescCodeIn);
			cmd.addParameter("@TEST_DATE_IN", testDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetMaxScore(NNumber pidmIn,NString tsrcCodeIn,NString tescCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_GET_MAX_SCORE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TSRC_CODE_IN", tsrcCodeIn);
			cmd.addParameter("@TESC_CODE_IN", tescCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetScoreType(NString tescCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_GET_SCORE_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TESC_CODE_IN", tescCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fGetTestEquiv(NString termIn,NString tsrcCodeIn,NString tescCodeIn,NString testScoreIn,Ref<NString> equivTescCodeIo,Ref<NString> equivTermCodeIo,Ref<NString> equivTestScoreIo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_GET_TEST_EQUIV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@TSRC_CODE_IN", tsrcCodeIn);
			cmd.addParameter("@TESC_CODE_IN", tescCodeIn);
			cmd.addParameter("@TEST_SCORE_IN", testScoreIn);
			cmd.addParameter("@EQUIV_TESC_CODE_IO", equivTescCodeIo, true);
			cmd.addParameter("@EQUIV_TERM_CODE_IO", equivTermCodeIo, true);
			cmd.addParameter("@EQUIV_TEST_SCORE_IO", equivTestScoreIo, true);
				
			cmd.execute();
			equivTescCodeIo.val = cmd.getParameterValue("@EQUIV_TESC_CODE_IO", NString.class);
			equivTermCodeIo.val = cmd.getParameterValue("@EQUIV_TERM_CODE_IO", NString.class);
			equivTestScoreIo.val = cmd.getParameterValue("@EQUIV_TEST_SCORE_IO", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fOneUpMakesDup(NNumber pidmIn,NString tescCodeIn,NDate testDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_ONE_UP_MAKES_DUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TESC_CODE_IN", tescCodeIn);
			cmd.addParameter("@TEST_DATE_IN", testDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSameTescMmyyyyNewScore(NNumber pidmIn,NString tescCodeIn,NDate testDateIn,NString scoreIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_SAME_TESC_MMYYYY_NEW_SCORE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TESC_CODE_IN", tescCodeIn);
			cmd.addParameter("@TEST_DATE_IN", testDateIn);
			cmd.addParameter("@SCORE_IN", scoreIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fScoreExists(NNumber pidmIn,NString tescCodeIn,NDate testDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_SCORE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TESC_CODE_IN", tescCodeIn);
			cmd.addParameter("@TEST_DATE_IN", testDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fScoreWithinRange(NString tescCodeIn,NString scoreIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_SCORE_WITHIN_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TESC_CODE_IN", tescCodeIn);
			cmd.addParameter("@SCORE_IN", scoreIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidAlphaScore(NString scoreIn,NNumber lengthIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_VALID_ALPHA_SCORE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SCORE_IN", scoreIn);
			cmd.addParameter("@LENGTH_IN", lengthIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidNumericScore(NString scoreIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_VALID_NUMERIC_SCORE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SCORE_IN", scoreIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidScoreLength(NString tescCodeIn,NNumber lengthIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.F_VALID_SCORE_LENGTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TESC_CODE_IN", tescCodeIn);
			cmd.addParameter("@LENGTH_IN", lengthIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pInsertSortest(NNumber pidmIn,NString tescCodeIn,Ref<NDate> testDateIn,NString testScoreIn,NString tsrcCodeIn,NString tadmCodeIn,NDate actDateIn,NString admrCodeIn,NString teinCodeIn,NString teftCodeIn,NString teacCodeIn,NString teprCodeIn,NString rcrvIndIn,NString satOrigIn,NString termIn,NNumber applNoIn,NString instrIdIn,NString releaseIndIn,NString equivIndIn,NString satEssayId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.P_INSERT_SORTEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TESC_CODE_IN", tescCodeIn);
			cmd.addParameter("@TEST_DATE_IN", testDateIn, true);
			cmd.addParameter("@TEST_SCORE_IN", testScoreIn);
			cmd.addParameter("@TSRC_CODE_IN", tsrcCodeIn);
			cmd.addParameter("@TADM_CODE_IN", tadmCodeIn);
			cmd.addParameter("@ACT_DATE_IN", actDateIn);
			cmd.addParameter("@ADMR_CODE_IN", admrCodeIn);
			cmd.addParameter("@TEIN_CODE_IN", teinCodeIn);
			cmd.addParameter("@TEFT_CODE_IN", teftCodeIn);
			cmd.addParameter("@TEAC_CODE_IN", teacCodeIn);
			cmd.addParameter("@TEPR_CODE_IN", teprCodeIn);
			cmd.addParameter("@RCRV_IND_IN", rcrvIndIn);
			cmd.addParameter("@SAT_ORIG_IN", satOrigIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@INSTR_ID_IN", instrIdIn);
			cmd.addParameter("@RELEASE_IND_IN", releaseIndIn);
			cmd.addParameter("@EQUIV_IND_IN", equivIndIn);
			cmd.addParameter("@SAT_ESSAY_ID", satEssayId);
				
			cmd.execute();
			testDateIn.val = cmd.getParameterValue("@TEST_DATE_IN", NDate.class);


		}
		
		public static void pUpdateSarchkl(NNumber pidmIn,NString admrCodeIn,NString dateStrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKTEST.P_UPDATE_SARCHKL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADMR_CODE_IN", admrCodeIn);
			cmd.addParameter("@DATE_STR_IN", dateStrIn);
				
			cmd.execute();


		}
		
	
	
	
}
