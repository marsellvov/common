package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskaudf {
		public static void pDispappuserdef(NNumber appno,NString wsct,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud11,NString ud12,NString ud13,NString ud14,NString ud15,NString ud16,NString ud17,NString ud18,NString ud19,NString ud20) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAUDF.P_DISPAPPUSERDEF", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@UD11", ud11);
			cmd.addParameter("@UD12", ud12);
			cmd.addParameter("@UD13", ud13);
			cmd.addParameter("@UD14", ud14);
			cmd.addParameter("@UD15", ud15);
			cmd.addParameter("@UD16", ud16);
			cmd.addParameter("@UD17", ud17);
			cmd.addParameter("@UD18", ud18);
			cmd.addParameter("@UD19", ud19);
			cmd.addParameter("@UD20", ud20);
				
			cmd.execute();


		}
		
		public static void pProcappuserdef(NNumber appno,NString wsct,NString submitBtn,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud11,NString ud12,NString ud13,NString ud14,NString ud15,NString ud16,NString ud17,NString ud18,NString ud19,NString ud20,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud11Seqno,NString ud12Seqno,NString ud13Seqno,NString ud14Seqno,NString ud15Seqno,NString ud16Seqno,NString ud17Seqno,NString ud18Seqno,NString ud19Seqno,NString ud20Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req,NString ud11Req,NString ud12Req,NString ud13Req,NString ud14Req,NString ud15Req,NString ud16Req,NString ud17Req,NString ud18Req,NString ud19Req,NString ud20Req) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAUDF.P_PROCAPPUSERDEF", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@UD11", ud11);
			cmd.addParameter("@UD12", ud12);
			cmd.addParameter("@UD13", ud13);
			cmd.addParameter("@UD14", ud14);
			cmd.addParameter("@UD15", ud15);
			cmd.addParameter("@UD16", ud16);
			cmd.addParameter("@UD17", ud17);
			cmd.addParameter("@UD18", ud18);
			cmd.addParameter("@UD19", ud19);
			cmd.addParameter("@UD20", ud20);
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
			cmd.addParameter("@UD11_SEQNO", ud11Seqno);
			cmd.addParameter("@UD12_SEQNO", ud12Seqno);
			cmd.addParameter("@UD13_SEQNO", ud13Seqno);
			cmd.addParameter("@UD14_SEQNO", ud14Seqno);
			cmd.addParameter("@UD15_SEQNO", ud15Seqno);
			cmd.addParameter("@UD16_SEQNO", ud16Seqno);
			cmd.addParameter("@UD17_SEQNO", ud17Seqno);
			cmd.addParameter("@UD18_SEQNO", ud18Seqno);
			cmd.addParameter("@UD19_SEQNO", ud19Seqno);
			cmd.addParameter("@UD20_SEQNO", ud20Seqno);
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
			cmd.addParameter("@UD11_REQ", ud11Req);
			cmd.addParameter("@UD12_REQ", ud12Req);
			cmd.addParameter("@UD13_REQ", ud13Req);
			cmd.addParameter("@UD14_REQ", ud14Req);
			cmd.addParameter("@UD15_REQ", ud15Req);
			cmd.addParameter("@UD16_REQ", ud16Req);
			cmd.addParameter("@UD17_REQ", ud17Req);
			cmd.addParameter("@UD18_REQ", ud18Req);
			cmd.addParameter("@UD19_REQ", ud19Req);
			cmd.addParameter("@UD20_REQ", ud20Req);
				
			cmd.execute();


		}
		
	
	
	
}
