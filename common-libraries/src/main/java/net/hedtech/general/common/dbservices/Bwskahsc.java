package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskahsc {
		public static NDate fGetSarhsumDate(NNumber aidm,NNumber applSeqno,NNumber hschSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAHSC.F_GET_SARHSUM_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@HSCH_SEQNO", hschSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void pDispapphighsch(NNumber appno,NString wsct,NNumber recno,NString lSbgiCode,NString hsHomeschool,NString hsName,NString houNum,NString addr1,NString addr2,NString addr3,NString addr4,NString city,NString cnty,NString stat,NString zip,NString natn,NString gdateDd,NString gdateMm,NString gdateYyyy,NString gpa,NString rank,NString clSize,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAHSC.P_DISPAPPHIGHSCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@RECNO", recno);
			cmd.addParameter("@L_SBGI_CODE", lSbgiCode);
			cmd.addParameter("@HS_HOMESCHOOL", hsHomeschool);
			cmd.addParameter("@HS_NAME", hsName);
			cmd.addParameter("@HOU_NUM", houNum);
			cmd.addParameter("@ADDR1", addr1);
			cmd.addParameter("@ADDR2", addr2);
			cmd.addParameter("@ADDR3", addr3);
			cmd.addParameter("@ADDR4", addr4);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@CNTY", cnty);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@NATN", natn);
			cmd.addParameter("@GDATE_DD", gdateDd);
			cmd.addParameter("@GDATE_MM", gdateMm);
			cmd.addParameter("@GDATE_YYYY", gdateYyyy);
			cmd.addParameter("@GPA", gpa);
			cmd.addParameter("@RANK", rank);
			cmd.addParameter("@CL_SIZE", clSize);
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
		
		public static void pProcapphighsch(NNumber appno,NString wsct,NNumber recno,NString lSbgiCodeReq,NString hsFlagIn,NString lSbgiCodeIn,NString buttonTextIn,NString hsCodeDesc,NString hsHomeschoolReq,NString hsHomeschool,NString hsNameReq,NString hsName,NString houNumReq,NString houNum,NString addr1Req,NString addr1,NString addr2Req,NString addr2,NString addr3Req,NString addr3,NString addr4Req,NString addr4,NString cityReq,NString city,NString cntyReq,NString cnty,NString statReq,NString stat,NString zipReq,NString zip,NString natnReq,NString natn,NString gdateReq,NString gdateDd,NString gdateMm,NString gdateYyyy,NString gpaReq,NString gpa,NString rankReq,NString rank,NString clSizeReq,NString clSize,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req,NString lTypeIndIn,NString lCityIn,NString lStatCodeIn,NString lNatnCodeIn,NString submitBtn,NString hsHomeDesc,NString hsNameDesc,NString gdateDesc,NString gpaDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAHSC.P_PROCAPPHIGHSCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@RECNO", recno);
			cmd.addParameter("@L_SBGI_CODE_REQ", lSbgiCodeReq);
			cmd.addParameter("@HS_FLAG_IN", hsFlagIn);
			cmd.addParameter("@L_SBGI_CODE_IN", lSbgiCodeIn);
			cmd.addParameter("@BUTTON_TEXT_IN", buttonTextIn);
			cmd.addParameter("@HS_CODE_DESC", hsCodeDesc);
			cmd.addParameter("@HS_HOMESCHOOL_REQ", hsHomeschoolReq);
			cmd.addParameter("@HS_HOMESCHOOL", hsHomeschool);
			cmd.addParameter("@HS_NAME_REQ", hsNameReq);
			cmd.addParameter("@HS_NAME", hsName);
			cmd.addParameter("@HOU_NUM_REQ", houNumReq);
			cmd.addParameter("@HOU_NUM", houNum);
			cmd.addParameter("@ADDR1_REQ", addr1Req);
			cmd.addParameter("@ADDR1", addr1);
			cmd.addParameter("@ADDR2_REQ", addr2Req);
			cmd.addParameter("@ADDR2", addr2);
			cmd.addParameter("@ADDR3_REQ", addr3Req);
			cmd.addParameter("@ADDR3", addr3);
			cmd.addParameter("@ADDR4_REQ", addr4Req);
			cmd.addParameter("@ADDR4", addr4);
			cmd.addParameter("@CITY_REQ", cityReq);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@CNTY_REQ", cntyReq);
			cmd.addParameter("@CNTY", cnty);
			cmd.addParameter("@STAT_REQ", statReq);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@ZIP_REQ", zipReq);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@NATN_REQ", natnReq);
			cmd.addParameter("@NATN", natn);
			cmd.addParameter("@GDATE_REQ", gdateReq);
			cmd.addParameter("@GDATE_DD", gdateDd);
			cmd.addParameter("@GDATE_MM", gdateMm);
			cmd.addParameter("@GDATE_YYYY", gdateYyyy);
			cmd.addParameter("@GPA_REQ", gpaReq);
			cmd.addParameter("@GPA", gpa);
			cmd.addParameter("@RANK_REQ", rankReq);
			cmd.addParameter("@RANK", rank);
			cmd.addParameter("@CL_SIZE_REQ", clSizeReq);
			cmd.addParameter("@CL_SIZE", clSize);
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
			cmd.addParameter("@L_TYPE_IND_IN", lTypeIndIn);
			cmd.addParameter("@L_CITY_IN", lCityIn);
			cmd.addParameter("@L_STAT_CODE_IN", lStatCodeIn);
			cmd.addParameter("@L_NATN_CODE_IN", lNatnCodeIn);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
			cmd.addParameter("@HS_HOME_DESC", hsHomeDesc);
			cmd.addParameter("@HS_NAME_DESC", hsNameDesc);
			cmd.addParameter("@GDATE_DESC", gdateDesc);
			cmd.addParameter("@GPA_DESC", gpaDesc);
				
			cmd.execute();


		}
		
	
	
	
}
