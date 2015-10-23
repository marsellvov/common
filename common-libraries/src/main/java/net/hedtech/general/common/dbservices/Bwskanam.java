package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskanam {
		public static void pDispappname(NNumber appno,NString wsct,NString pfx,NString fname,NString pname,NString mname,NString lpname,NString lname,NString sfx,NString plname,NString prevclas,NString prevappl,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKANAM.P_DISPAPPNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@PFX", pfx);
			cmd.addParameter("@FNAME", fname);
			cmd.addParameter("@PNAME", pname);
			cmd.addParameter("@MNAME", mname);
			cmd.addParameter("@LPNAME", lpname);
			cmd.addParameter("@LNAME", lname);
			cmd.addParameter("@SFX", sfx);
			cmd.addParameter("@PLNAME", plname);
			cmd.addParameter("@PREVCLAS", prevclas);
			cmd.addParameter("@PREVAPPL", prevappl);
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
		
		public static void pProcappname(NNumber appno,NString wsct,NString pfxReq,NString pfx,NString fnameReq,NString fname,NString pnameReq,NString pname,NString mnameReq,NString mname,NString lpnameReq,NString lpname,NString lnameReq,NString lname,NString sfxReq,NString sfx,NString plnameReq,NString plname,NString prevclasReq,NString prevclas,NString prevapplReq,NString prevappl,NString ud1,NString ud2,NString ud3,NString ud4,NString ud5,NString ud6,NString ud7,NString ud8,NString ud9,NString ud10,NString ud1Seqno,NString ud2Seqno,NString ud3Seqno,NString ud4Seqno,NString ud5Seqno,NString ud6Seqno,NString ud7Seqno,NString ud8Seqno,NString ud9Seqno,NString ud10Seqno,NString ud1Req,NString ud2Req,NString ud3Req,NString ud4Req,NString ud5Req,NString ud6Req,NString ud7Req,NString ud8Req,NString ud9Req,NString ud10Req,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKANAM.P_PROCAPPNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@PFX_REQ", pfxReq);
			cmd.addParameter("@PFX", pfx);
			cmd.addParameter("@FNAME_REQ", fnameReq);
			cmd.addParameter("@FNAME", fname);
			cmd.addParameter("@PNAME_REQ", pnameReq);
			cmd.addParameter("@PNAME", pname);
			cmd.addParameter("@MNAME_REQ", mnameReq);
			cmd.addParameter("@MNAME", mname);
			cmd.addParameter("@LPNAME_REQ", lpnameReq);
			cmd.addParameter("@LPNAME", lpname);
			cmd.addParameter("@LNAME_REQ", lnameReq);
			cmd.addParameter("@LNAME", lname);
			cmd.addParameter("@SFX_REQ", sfxReq);
			cmd.addParameter("@SFX", sfx);
			cmd.addParameter("@PLNAME_REQ", plnameReq);
			cmd.addParameter("@PLNAME", plname);
			cmd.addParameter("@PREVCLAS_REQ", prevclasReq);
			cmd.addParameter("@PREVCLAS", prevclas);
			cmd.addParameter("@PREVAPPL_REQ", prevapplReq);
			cmd.addParameter("@PREVAPPL", prevappl);
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
				
			cmd.execute();


		}
		
	
	
	
}
