package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskapar {
		public static NString fGetphone(NString area,NString pnum,NString ext,NString accs,NString pctc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPAR.F_GETPHONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@PNUM", pnum);
			cmd.addParameter("@EXT", ext);
			cmd.addParameter("@ACCS", accs);
			cmd.addParameter("@PCTC", pctc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDispappparents(NNumber appno,NString wsct,NNumber rSeqno,NString pcode,NString pfx,NString fn,NString mn,NString lname,NString sfx,NString dcs,NString ad1,NString ad2,NString ad3,NString city,NString stat,NString zip,NString cnty,NString natn,NString area,NString pnum,NString ext,NString accs,NString emp,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString lsfx,NString hnum,NString ad4,NString pctc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPAR.P_DISPAPPPARENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@R_SEQNO", rSeqno);
			cmd.addParameter("@PCODE", pcode);
			cmd.addParameter("@PFX", pfx);
			cmd.addParameter("@FN", fn);
			cmd.addParameter("@MN", mn);
			cmd.addParameter("@LNAME", lname);
			cmd.addParameter("@SFX", sfx);
			cmd.addParameter("@DCS", dcs);
			cmd.addParameter("@AD1", ad1);
			cmd.addParameter("@AD2", ad2);
			cmd.addParameter("@AD3", ad3);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@CNTY", cnty);
			cmd.addParameter("@NATN", natn);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@PNUM", pnum);
			cmd.addParameter("@EXT", ext);
			cmd.addParameter("@ACCS", accs);
			cmd.addParameter("@EMP", emp);
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
			cmd.addParameter("@LSFX", lsfx);
			cmd.addParameter("@HNUM", hnum);
			cmd.addParameter("@AD4", ad4);
			cmd.addParameter("@PCTC", pctc);
				
			cmd.execute();


		}
		
		public static void pParsephone(NString phone,Ref<NString> area,Ref<NString> pnum,Ref<NString> ext,Ref<NString> accs,Ref<NString> pctc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPAR.P_PARSEPHONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHONE", phone);
			cmd.addParameter("@AREA", area, true);
			cmd.addParameter("@PNUM", pnum, true);
			cmd.addParameter("@EXT", ext, true);
			cmd.addParameter("@ACCS", accs, true);
			cmd.addParameter("@PCTC", pctc, true);
				
			cmd.execute();
			area.val = cmd.getParameterValue("@AREA", NString.class);
			pnum.val = cmd.getParameterValue("@PNUM", NString.class);
			ext.val = cmd.getParameterValue("@EXT", NString.class);
			accs.val = cmd.getParameterValue("@ACCS", NString.class);
			pctc.val = cmd.getParameterValue("@PCTC", NString.class);


		}
		
		public static void pProcappparents(NNumber appno,NString wsct,NNumber rSeqnoIn,NString pcodeReq,NString pcode,NString pfxReq,NString pfx,NString fnReq,NString fn,NString mnReq,NString mn,NString lnameReq,NString lname,NString sfxReq,NString sfx,NString dcsReq,NString dcs,NString ad1Req,NString ad1,NString ad2Req,NString ad2,NString ad3Req,NString ad3,NString cityReq,NString city,NString statReq,NString stat,NString cntyReq,NString cnty,NString zipReq,NString zip,NString natnReq,NString natn,NString areaReq,NString area,NString pnumReq,NString pnum,NString extReq,NString ext,NString accsReq,NString accs,NString empReq,NString emp,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req,NString submitBtn,NString pcodeDesc,NString statDesc,NString zipDesc,NString natnDesc,NString lsfxReq,NString lsfx,NString hnumReq,NString hnum,NString ad4Req,NString ad4,NString pctcReq,NString pctc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPAR.P_PROCAPPPARENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@R_SEQNO_IN", rSeqnoIn);
			cmd.addParameter("@PCODE_REQ", pcodeReq);
			cmd.addParameter("@PCODE", pcode);
			cmd.addParameter("@PFX_REQ", pfxReq);
			cmd.addParameter("@PFX", pfx);
			cmd.addParameter("@FN_REQ", fnReq);
			cmd.addParameter("@FN", fn);
			cmd.addParameter("@MN_REQ", mnReq);
			cmd.addParameter("@MN", mn);
			cmd.addParameter("@LNAME_REQ", lnameReq);
			cmd.addParameter("@LNAME", lname);
			cmd.addParameter("@SFX_REQ", sfxReq);
			cmd.addParameter("@SFX", sfx);
			cmd.addParameter("@DCS_REQ", dcsReq);
			cmd.addParameter("@DCS", dcs);
			cmd.addParameter("@AD1_REQ", ad1Req);
			cmd.addParameter("@AD1", ad1);
			cmd.addParameter("@AD2_REQ", ad2Req);
			cmd.addParameter("@AD2", ad2);
			cmd.addParameter("@AD3_REQ", ad3Req);
			cmd.addParameter("@AD3", ad3);
			cmd.addParameter("@CITY_REQ", cityReq);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT_REQ", statReq);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@CNTY_REQ", cntyReq);
			cmd.addParameter("@CNTY", cnty);
			cmd.addParameter("@ZIP_REQ", zipReq);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@NATN_REQ", natnReq);
			cmd.addParameter("@NATN", natn);
			cmd.addParameter("@AREA_REQ", areaReq);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@PNUM_REQ", pnumReq);
			cmd.addParameter("@PNUM", pnum);
			cmd.addParameter("@EXT_REQ", extReq);
			cmd.addParameter("@EXT", ext);
			cmd.addParameter("@ACCS_REQ", accsReq);
			cmd.addParameter("@ACCS", accs);
			cmd.addParameter("@EMP_REQ", empReq);
			cmd.addParameter("@EMP", emp);
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
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
			cmd.addParameter("@PCODE_DESC", pcodeDesc);
			cmd.addParameter("@STAT_DESC", statDesc);
			cmd.addParameter("@ZIP_DESC", zipDesc);
			cmd.addParameter("@NATN_DESC", natnDesc);
			cmd.addParameter("@LSFX_REQ", lsfxReq);
			cmd.addParameter("@LSFX", lsfx);
			cmd.addParameter("@HNUM_REQ", hnumReq);
			cmd.addParameter("@HNUM", hnum);
			cmd.addParameter("@AD4_REQ", ad4Req);
			cmd.addParameter("@AD4", ad4);
			cmd.addParameter("@PCTC_REQ", pctcReq);
			cmd.addParameter("@PCTC", pctc);
				
			cmd.execute();


		}
		
	
	
	
}
