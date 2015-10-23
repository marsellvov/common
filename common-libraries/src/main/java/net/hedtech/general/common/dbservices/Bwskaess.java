package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskaess {
		public static void pDispappessay(NNumber appno,NString wsct,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAESS.P_DISPAPPESSAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@UD1", ud1);
			cmd.addParameter("@UD2", ud2);
			cmd.addParameter("@UD3", ud3);
			cmd.addParameter("@UD4", ud4);
			cmd.addParameter("@UD5", ud5);
			cmd.addParameter("@UD6", ud6);
			cmd.addParameter("@UD7", ud7);
			cmd.addParameter("@UD8", ud8);
			cmd.addParameter("@UD9", ud9);
			cmd.addParameter("@UD10", ud10);
				
			cmd.execute();


		}
		
		public static void pEssay(NNumber caidm,NNumber cappno,NString cquestion,NString cquestionType,Ref<NNumber> cquestionIndex,NString cessay,NString crequiredInd,NString cseqno,NString cmsgFlag,NString ccolspan) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAESS.P_ESSAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAIDM", caidm);
			cmd.addParameter("@CAPPNO", cappno);
			cmd.addParameter("@CQUESTION", cquestion);
			cmd.addParameter("@CQUESTION_TYPE", cquestionType);
			cmd.addParameter("@CQUESTION_INDEX", cquestionIndex, true);
			cmd.addParameter("@CESSAY", cessay);
			cmd.addParameter("@CREQUIRED_IND", crequiredInd);
			cmd.addParameter("@CSEQNO", cseqno);
			cmd.addParameter("@CMSG_FLAG", cmsgFlag);
			cmd.addParameter("@CCOLSPAN", ccolspan);
				
			cmd.execute();
			cquestionIndex.val = cmd.getParameterValue("@CQUESTION_INDEX", NNumber.class);


		}
		
//		public static void pInitessays(NNumber caidm,NNumber cappno,NString wsct,Ref<List<Bwskalog.Varchar2TabanswerRow>> udEssays,Ref<List<Bwskalog.Varchar2TabqstnRow>> udQuestions,Ref<List<Bwskalog.Varchar2TabqstnRow>> udQuestionTypes,Ref<List<Bwskalog.Varchar2TabtypeRow>> udSeqno,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAESS.P_INITESSAYS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@CAIDM", caidm);
//			cmd.addParameter("@CAPPNO", cappno);
//			cmd.addParameter("@WSCT", wsct);
//			// cmd.addParameter(DbTypes.getTableType("UD_ESSAYS", "", udEssays.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("UD_QUESTIONS", "", udQuestions.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("UD_QUESTION_TYPES", "", udQuestionTypes.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("UD_SEQNO", "", udSeqno.val, object.class , true));
//			cmd.addParameter("@UD1", ud1);
//			cmd.addParameter("@UD2", ud2);
//			cmd.addParameter("@UD3", ud3);
//			cmd.addParameter("@UD4", ud4);
//			cmd.addParameter("@UD5", ud5);
//			cmd.addParameter("@UD6", ud6);
//			cmd.addParameter("@UD7", ud7);
//			cmd.addParameter("@UD8", ud8);
//			cmd.addParameter("@UD9", ud9);
//			cmd.addParameter("@UD10", ud10);
//				
//			cmd.execute();
//			// udEssays.val = cmd.getTableParameterValue("@UD_ESSAYS", object.class);
//			// udQuestions.val = cmd.getTableParameterValue("@UD_QUESTIONS", object.class);
//			// udQuestionTypes.val = cmd.getTableParameterValue("@UD_QUESTION_TYPES", object.class);
//			// udSeqno.val = cmd.getTableParameterValue("@UD_SEQNO", object.class);
//
//
//		}
		
		public static void pProcappessay(NNumber appno,NString wsct,NString submitBtn,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAESS.P_PROCAPPESSAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
			cmd.addParameter("@UD1", ud1);
			cmd.addParameter("@UD2", ud2);
			cmd.addParameter("@UD3", ud3);
			cmd.addParameter("@UD4", ud4);
			cmd.addParameter("@UD5", ud5);
			cmd.addParameter("@UD6", ud6);
			cmd.addParameter("@UD7", ud7);
			cmd.addParameter("@UD8", ud8);
			cmd.addParameter("@UD9", ud9);
			cmd.addParameter("@UD10", ud10);
			cmd.addParameter("@UD1_SEQNO", ud1Seqno);
			cmd.addParameter("@UD2_SEQNO", ud2Seqno);
			cmd.addParameter("@UD3_SEQNO", ud3Seqno);
			cmd.addParameter("@UD4_SEQNO", ud4Seqno);
			cmd.addParameter("@UD5_SEQNO", ud5Seqno);
			cmd.addParameter("@UD6_SEQNO", ud6Seqno);
			cmd.addParameter("@UD7_SEQNO", ud7Seqno);
			cmd.addParameter("@UD8_SEQNO", ud8Seqno);
			cmd.addParameter("@UD9_SEQNO", ud9Seqno);
			cmd.addParameter("@UD10_SEQNO", ud10Seqno);
			cmd.addParameter("@UD1_REQ", ud1Req);
			cmd.addParameter("@UD2_REQ", ud2Req);
			cmd.addParameter("@UD3_REQ", ud3Req);
			cmd.addParameter("@UD4_REQ", ud4Req);
			cmd.addParameter("@UD5_REQ", ud5Req);
			cmd.addParameter("@UD6_REQ", ud6Req);
			cmd.addParameter("@UD7_REQ", ud7Req);
			cmd.addParameter("@UD8_REQ", ud8Req);
			cmd.addParameter("@UD9_REQ", ud9Req);
			cmd.addParameter("@UD10_REQ", ud10Req);
				
			cmd.execute();


		}
		
		public static void pUpdateessayanswer(NNumber aidm,NNumber appno,NString udEssay,NString udSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAESS.P_UPDATEESSAYANSWER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@UD_ESSAY", udEssay);
			cmd.addParameter("@UD_SEQNO", udSeqno);
				
			cmd.execute();


		}
		
	
	
	
}
