package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskaadr {
		public static void pDispappaddr(NString procname,NNumber appno,NString wsct,NString houseNum,NString addr1,NString addr2,NString addr3,NString addr4,NString city,NString stat,NString zip,NString cnty,NString natn,NString phCtry,NString area,NString pnum,NString ext,NString accs,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAADR.P_DISPAPPADDR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROCNAME", procname);
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@HOUSE_NUM", houseNum);
			cmd.addParameter("@ADDR1", addr1);
			cmd.addParameter("@ADDR2", addr2);
			cmd.addParameter("@ADDR3", addr3);
			cmd.addParameter("@ADDR4", addr4);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@CNTY", cnty);
			cmd.addParameter("@NATN", natn);
			cmd.addParameter("@PH_CTRY", phCtry);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@PNUM", pnum);
			cmd.addParameter("@EXT", ext);
			cmd.addParameter("@ACCS", accs);
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
		
		public static void pDispappaddr1(NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAADR.P_DISPAPPADDR1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();


		}
		
		public static void pDispappaddr2(NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAADR.P_DISPAPPADDR2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();


		}
		
		public static void pProcappaddr1(NNumber appno,NString wsct,NString houseNum,NString addr1,NString addr2,NString addr3,NString addr4,NString city,NString stat,NString zip,NString cnty,NString natn,NString area,NString phCtry,NString pnum,NString ext,NString accs,NString submitBtn,NString houseNumReq,NString addr1Req,NString addr2Req,NString addr3Req,NString addr4Req,NString cityReq,NString statReq,NString zipReq,NString cntyReq,NString natnReq,NString areaReq,NString phCtryReq,NString pnumReq,NString extReq,NString accsReq,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req,NString statDesc,NString zipDesc,NString natnDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAADR.P_PROCAPPADDR1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@HOUSE_NUM", houseNum);
			cmd.addParameter("@ADDR1", addr1);
			cmd.addParameter("@ADDR2", addr2);
			cmd.addParameter("@ADDR3", addr3);
			cmd.addParameter("@ADDR4", addr4);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@CNTY", cnty);
			cmd.addParameter("@NATN", natn);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@PH_CTRY", phCtry);
			cmd.addParameter("@PNUM", pnum);
			cmd.addParameter("@EXT", ext);
			cmd.addParameter("@ACCS", accs);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
			cmd.addParameter("@HOUSE_NUM_REQ", houseNumReq);
			cmd.addParameter("@ADDR1_REQ", addr1Req);
			cmd.addParameter("@ADDR2_REQ", addr2Req);
			cmd.addParameter("@ADDR3_REQ", addr3Req);
			cmd.addParameter("@ADDR4_REQ", addr4Req);
			cmd.addParameter("@CITY_REQ", cityReq);
			cmd.addParameter("@STAT_REQ", statReq);
			cmd.addParameter("@ZIP_REQ", zipReq);
			cmd.addParameter("@CNTY_REQ", cntyReq);
			cmd.addParameter("@NATN_REQ", natnReq);
			cmd.addParameter("@AREA_REQ", areaReq);
			cmd.addParameter("@PH_CTRY_REQ", phCtryReq);
			cmd.addParameter("@PNUM_REQ", pnumReq);
			cmd.addParameter("@EXT_REQ", extReq);
			cmd.addParameter("@ACCS_REQ", accsReq);
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
			cmd.addParameter("@STAT_DESC", statDesc);
			cmd.addParameter("@ZIP_DESC", zipDesc);
			cmd.addParameter("@NATN_DESC", natnDesc);
				
			cmd.execute();


		}
		
		public static void pProcappaddr2(NNumber appno,NString wsct,NString houseNum,NString addr1,NString addr2,NString addr4,NString addr3,NString city,NString stat,NString zip,NString cnty,NString natn,NString area,NString phCtry,NString pnum,NString ext,NString accs,NString submitBtn,NString houseNumReq,NString addr1Req,NString addr2Req,NString addr3Req,NString addr4Req,NString cityReq,NString statReq,NString zipReq,NString cntyReq,NString natnReq,NString areaReq,NString phCtryReq,NString pnumReq,NString extReq,NString accsReq,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req,NString statDesc,NString zipDesc,NString natnDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAADR.P_PROCAPPADDR2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@HOUSE_NUM", houseNum);
			cmd.addParameter("@ADDR1", addr1);
			cmd.addParameter("@ADDR2", addr2);
			cmd.addParameter("@ADDR4", addr4);
			cmd.addParameter("@ADDR3", addr3);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@CNTY", cnty);
			cmd.addParameter("@NATN", natn);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@PH_CTRY", phCtry);
			cmd.addParameter("@PNUM", pnum);
			cmd.addParameter("@EXT", ext);
			cmd.addParameter("@ACCS", accs);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
			cmd.addParameter("@HOUSE_NUM_REQ", houseNumReq);
			cmd.addParameter("@ADDR1_REQ", addr1Req);
			cmd.addParameter("@ADDR2_REQ", addr2Req);
			cmd.addParameter("@ADDR3_REQ", addr3Req);
			cmd.addParameter("@ADDR4_REQ", addr4Req);
			cmd.addParameter("@CITY_REQ", cityReq);
			cmd.addParameter("@STAT_REQ", statReq);
			cmd.addParameter("@ZIP_REQ", zipReq);
			cmd.addParameter("@CNTY_REQ", cntyReq);
			cmd.addParameter("@NATN_REQ", natnReq);
			cmd.addParameter("@AREA_REQ", areaReq);
			cmd.addParameter("@PH_CTRY_REQ", phCtryReq);
			cmd.addParameter("@PNUM_REQ", pnumReq);
			cmd.addParameter("@EXT_REQ", extReq);
			cmd.addParameter("@ACCS_REQ", accsReq);
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
			cmd.addParameter("@STAT_DESC", statDesc);
			cmd.addParameter("@ZIP_DESC", zipDesc);
			cmd.addParameter("@NATN_DESC", natnDesc);
				
			cmd.execute();


		}
		
	
	
	
}
