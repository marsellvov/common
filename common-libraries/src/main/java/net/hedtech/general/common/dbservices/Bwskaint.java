package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskaint {
		public static void pDispappinternational(NNumber appno,NString wsct,NString natnCitz,NString natnBirth,NString langNatv,NString visa,NString visano,NString idateDd,NString idateMm,NString idateYyyy,NString edateDd,NString edateMm,NString edateYyyy,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAINT.P_DISPAPPINTERNATIONAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@NATN_CITZ", natnCitz);
			cmd.addParameter("@NATN_BIRTH", natnBirth);
			cmd.addParameter("@LANG_NATV", langNatv);
			cmd.addParameter("@VISA", visa);
			cmd.addParameter("@VISANO", visano);
			cmd.addParameter("@IDATE_DD", idateDd);
			cmd.addParameter("@IDATE_MM", idateMm);
			cmd.addParameter("@IDATE_YYYY", idateYyyy);
			cmd.addParameter("@EDATE_DD", edateDd);
			cmd.addParameter("@EDATE_MM", edateMm);
			cmd.addParameter("@EDATE_YYYY", edateYyyy);
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
		
		public static void pProcappinternational(NNumber appno,NString wsct,NString submitBtn,NString natnCitzReq,NString natnCitz,NString natnBirthReq,NString natnBirth,NString langNatvReq,NString langNatv,NString visaReq,NString visa,NString visanoReq,NString visano,NString idateReq,NString idateDd,NString idateMm,NString idateYyyy,NString edateReq,NString edateDd,NString edateMm,NString edateYyyy,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req,NString visaDesc,NString visanoDesc,NString idateDesc,NString edateDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAINT.P_PROCAPPINTERNATIONAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
			cmd.addParameter("@NATN_CITZ_REQ", natnCitzReq);
			cmd.addParameter("@NATN_CITZ", natnCitz);
			cmd.addParameter("@NATN_BIRTH_REQ", natnBirthReq);
			cmd.addParameter("@NATN_BIRTH", natnBirth);
			cmd.addParameter("@LANG_NATV_REQ", langNatvReq);
			cmd.addParameter("@LANG_NATV", langNatv);
			cmd.addParameter("@VISA_REQ", visaReq);
			cmd.addParameter("@VISA", visa);
			cmd.addParameter("@VISANO_REQ", visanoReq);
			cmd.addParameter("@VISANO", visano);
			cmd.addParameter("@IDATE_REQ", idateReq);
			cmd.addParameter("@IDATE_DD", idateDd);
			cmd.addParameter("@IDATE_MM", idateMm);
			cmd.addParameter("@IDATE_YYYY", idateYyyy);
			cmd.addParameter("@EDATE_REQ", edateReq);
			cmd.addParameter("@EDATE_DD", edateDd);
			cmd.addParameter("@EDATE_MM", edateMm);
			cmd.addParameter("@EDATE_YYYY", edateYyyy);
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
			cmd.addParameter("@VISA_DESC", visaDesc);
			cmd.addParameter("@VISANO_DESC", visanoDesc);
			cmd.addParameter("@IDATE_DESC", idateDesc);
			cmd.addParameter("@EDATE_DESC", edateDesc);
				
			cmd.execute();


		}
		
	
	
	
}
