package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskatst {
		public static void pDispapptests(NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKATST.P_DISPAPPTESTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();


		}
		
//		public static void pProcapptests(NNumber appno,NString wsct,List<Bwskalog.Varchar2TabtypeRow> seqnos,List<Bwskalog.Varchar2TabtypeRow> tests,List<Bwskalog.Varchar2TabtypeRow> scores,NString testReq,NString scoreReq,NString mmReq,NString yyyyReq,List<Bwskalog.Varchar2TabtypeRow> datesMm,List<Bwskalog.Varchar2TabtypeRow> datesDd,List<Bwskalog.Varchar2TabtypeRow> datesYyyy,NString label,NString submitBtn,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req,NString viewBlk) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKATST.P_PROCAPPTESTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@APPNO", appno);
//			cmd.addParameter("@WSCT", wsct);
//			// cmd.addParameter(DbTypes.getTableType("SEQNOS", "", seqnos, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TESTS", "", tests, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SCORES", "", scores, object.class));
//			cmd.addParameter("@TEST_REQ", testReq);
//			cmd.addParameter("@SCORE_REQ", scoreReq);
//			cmd.addParameter("@MM_REQ", mmReq);
//			cmd.addParameter("@YYYY_REQ", yyyyReq);
//			// cmd.addParameter(DbTypes.getTableType("DATES_MM", "", datesMm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DATES_DD", "", datesDd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DATES_YYYY", "", datesYyyy, object.class));
//			cmd.addParameter("@LABEL", label);
//			cmd.addParameter("@SUBMIT_BTN", submitBtn);
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
//			cmd.addParameter("@UD1_SEQNO", ud1Seqno);
//			cmd.addParameter("@UD2_SEQNO", ud2Seqno);
//			cmd.addParameter("@UD3_SEQNO", ud3Seqno);
//			cmd.addParameter("@UD4_SEQNO", ud4Seqno);
//			cmd.addParameter("@UD5_SEQNO", ud5Seqno);
//			cmd.addParameter("@UD6_SEQNO", ud6Seqno);
//			cmd.addParameter("@UD7_SEQNO", ud7Seqno);
//			cmd.addParameter("@UD8_SEQNO", ud8Seqno);
//			cmd.addParameter("@UD9_SEQNO", ud9Seqno);
//			cmd.addParameter("@UD10_SEQNO", ud10Seqno);
//			cmd.addParameter("@UD1_REQ", ud1Req);
//			cmd.addParameter("@UD2_REQ", ud2Req);
//			cmd.addParameter("@UD3_REQ", ud3Req);
//			cmd.addParameter("@UD4_REQ", ud4Req);
//			cmd.addParameter("@UD5_REQ", ud5Req);
//			cmd.addParameter("@UD6_REQ", ud6Req);
//			cmd.addParameter("@UD7_REQ", ud7Req);
//			cmd.addParameter("@UD8_REQ", ud8Req);
//			cmd.addParameter("@UD9_REQ", ud9Req);
//			cmd.addParameter("@UD10_REQ", ud10Req);
//			cmd.addParameter("@VIEW_BLK", viewBlk);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
