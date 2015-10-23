package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskaper {
		public static void pDispapppersonal(NNumber appno,NString wsct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPER.P_DISPAPPPERSONAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
				
			cmd.execute();


		}
		
		public static void pFormselectnewethn(NString cname,NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPER.P_FORMSELECTNEWETHN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
//		public static void pProcapppersonal(NNumber appno,NString wsct,NString mediReq,List<Bwskalog.Varchar2TabtypeRow> medi,NString confReq,NString conf,NString citzReq,NString citz,NString resdReq,NString resd,NString genderReq,NString gender,NString bdayReq,NString bdayMm,NString bdayDd,NString bdayYyyy,NString ssnReq,NString ssn,NString mrtlReq,NString mrtl,NString rlgnReq,NString rlgn,NString ethnReq,NString ethn,NString ethnCatReq,NString ethnCat,NString ethnHispanic,NString ethnNothispanic,NString raceReq,List<Bwskalog.Varchar2TabtypeRow> race,NString emailReq,NString email,NString dupEmailReq,NString dupEmail,NString falmReq,NString falm,NString vetcNoReq,NString vetcNo,NString veraIndReq,NString veraInd,NString area,NString areaReq,NString phCtry,NString phCtryReq,NString pnum,NString pnumReq,NString ext,NString extReq,NString accs,NString accsReq,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req,NString submitBtn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPER.P_PROCAPPPERSONAL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@APPNO", appno);
//			cmd.addParameter("@WSCT", wsct);
//			cmd.addParameter("@MEDI_REQ", mediReq);
//			// cmd.addParameter(DbTypes.getTableType("MEDI", "", medi, object.class));
//			cmd.addParameter("@CONF_REQ", confReq);
//			cmd.addParameter("@CONF", conf);
//			cmd.addParameter("@CITZ_REQ", citzReq);
//			cmd.addParameter("@CITZ", citz);
//			cmd.addParameter("@RESD_REQ", resdReq);
//			cmd.addParameter("@RESD", resd);
//			cmd.addParameter("@GENDER_REQ", genderReq);
//			cmd.addParameter("@GENDER", gender);
//			cmd.addParameter("@BDAY_REQ", bdayReq);
//			cmd.addParameter("@BDAY_MM", bdayMm);
//			cmd.addParameter("@BDAY_DD", bdayDd);
//			cmd.addParameter("@BDAY_YYYY", bdayYyyy);
//			cmd.addParameter("@SSN_REQ", ssnReq);
//			cmd.addParameter("@SSN", ssn);
//			cmd.addParameter("@MRTL_REQ", mrtlReq);
//			cmd.addParameter("@MRTL", mrtl);
//			cmd.addParameter("@RLGN_REQ", rlgnReq);
//			cmd.addParameter("@RLGN", rlgn);
//			cmd.addParameter("@ETHN_REQ", ethnReq);
//			cmd.addParameter("@ETHN", ethn);
//			cmd.addParameter("@ETHN_CAT_REQ", ethnCatReq);
//			cmd.addParameter("@ETHN_CAT", ethnCat);
//			cmd.addParameter("@ETHN_HISPANIC", ethnHispanic);
//			cmd.addParameter("@ETHN_NOTHISPANIC", ethnNothispanic);
//			cmd.addParameter("@RACE_REQ", raceReq);
//			// cmd.addParameter(DbTypes.getTableType("RACE", "", race, object.class));
//			cmd.addParameter("@EMAIL_REQ", emailReq);
//			cmd.addParameter("@EMAIL", email);
//			cmd.addParameter("@DUP_EMAIL_REQ", dupEmailReq);
//			cmd.addParameter("@DUP_EMAIL", dupEmail);
//			cmd.addParameter("@FALM_REQ", falmReq);
//			cmd.addParameter("@FALM", falm);
//			cmd.addParameter("@VETC_NO_REQ", vetcNoReq);
//			cmd.addParameter("@VETC_NO", vetcNo);
//			cmd.addParameter("@VERA_IND_REQ", veraIndReq);
//			cmd.addParameter("@VERA_IND", veraInd);
//			cmd.addParameter("@AREA", area);
//			cmd.addParameter("@AREA_REQ", areaReq);
//			cmd.addParameter("@PH_CTRY", phCtry);
//			cmd.addParameter("@PH_CTRY_REQ", phCtryReq);
//			cmd.addParameter("@PNUM", pnum);
//			cmd.addParameter("@PNUM_REQ", pnumReq);
//			cmd.addParameter("@EXT", ext);
//			cmd.addParameter("@EXT_REQ", extReq);
//			cmd.addParameter("@ACCS", accs);
//			cmd.addParameter("@ACCS_REQ", accsReq);
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
//			cmd.addParameter("@SUBMIT_BTN", submitBtn);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
