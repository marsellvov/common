package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskapln {
		public static void pDispappplan(NNumber appno,NString wsct,NNumber pProgramSeqno,NString pProgramCode,NString pChangeProgram,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPLN.P_DISPAPPPLAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@P_PROGRAM_SEQNO", pProgramSeqno);
			cmd.addParameter("@P_PROGRAM_CODE", pProgramCode);
			cmd.addParameter("@P_CHANGE_PROGRAM", pChangeProgram);
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
		
//		public static void pProcappplan(NNumber appno,NString wsct,NString submitBtn,NNumber pProgramSeqno,NString pProgramPrepicked,NString pProgramCodeReq,NString pProgramCode,NString pOldPriority,NString pPriority,List<Bwskalog.Varchar2TabtypeRow> pMajorCode,NString pMajorCodeReq,List<Bwskalog.Varchar2TabtypeRow> pMinorCode,NString pMinorCodeReq,List<Bwskalog.Varchar2TabtypeRow> pConcCode,NString pConcCodeReq,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req,NString pProgramLabel,NString pFromChangeProgram) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPLN.P_PROCAPPPLAN", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@APPNO", appno);
//			cmd.addParameter("@WSCT", wsct);
//			cmd.addParameter("@SUBMIT_BTN", submitBtn);
//			cmd.addParameter("@P_PROGRAM_SEQNO", pProgramSeqno);
//			cmd.addParameter("@P_PROGRAM_PREPICKED", pProgramPrepicked);
//			cmd.addParameter("@P_PROGRAM_CODE_REQ", pProgramCodeReq);
//			cmd.addParameter("@P_PROGRAM_CODE", pProgramCode);
//			cmd.addParameter("@P_OLD_PRIORITY", pOldPriority);
//			cmd.addParameter("@P_PRIORITY", pPriority);
//			// cmd.addParameter(DbTypes.getTableType("P_MAJOR_CODE", "", pMajorCode, object.class));
//			cmd.addParameter("@P_MAJOR_CODE_REQ", pMajorCodeReq);
//			// cmd.addParameter(DbTypes.getTableType("P_MINOR_CODE", "", pMinorCode, object.class));
//			cmd.addParameter("@P_MINOR_CODE_REQ", pMinorCodeReq);
//			// cmd.addParameter(DbTypes.getTableType("P_CONC_CODE", "", pConcCode, object.class));
//			cmd.addParameter("@P_CONC_CODE_REQ", pConcCodeReq);
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
//			cmd.addParameter("@P_PROGRAM_LABEL", pProgramLabel);
//			cmd.addParameter("@P_FROM_CHANGE_PROGRAM", pFromChangeProgram);
//				
//			cmd.execute();
//
//
//		}
//		
	
	
	
}
