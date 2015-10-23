package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdcmn {
		public static NBool fDisplayempramount(NString inBdca,NString inField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.F_DISPLAYEMPRAMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_BDCA", inBdca);
			cmd.addParameter("@IN_FIELD", inField);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fIsdednfuncallowed(NString inScope,NString inFunc,NString inCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.F_ISDEDNFUNCALLOWED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_SCOPE", inScope);
			cmd.addParameter("@IN_FUNC", inFunc);
			cmd.addParameter("@IN_CODE", inCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pDedndetailtabledata() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DEDNDETAILTABLEDATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDedndetailtableheaders(NString inTabtype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DEDNDETAILTABLEHEADERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TABTYPE", inTabtype);
				
			cmd.execute();


		}
		
		public static void pDedndriverbacklinkurl(NString inDgrp,NString inMode,Ref<NString> outLink,Ref<NString> outUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DEDNDRIVERBACKLINKURL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_DGRP", inDgrp);
			cmd.addParameter("@IN_MODE", inMode);
			cmd.addParameter("@OUT_LINK", outLink, true);
			cmd.addParameter("@OUT_URL", outUrl, true);
				
			cmd.execute();
			outLink.val = cmd.getParameterValue("@OUT_LINK", NString.class);
			outUrl.val = cmd.getParameterValue("@OUT_URL", NString.class);


		}
		
		public static void pDispdedncurflxs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNCURFLXS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispdedncurhlt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNCURHLT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispdedncurmisc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNCURMISC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispdedncurret() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNCURRET", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispdednflxsdetail(NString dcde,NString selYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNFLXSDETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@SEL_YEAR", selYear);
				
			cmd.execute();


		}
		
		public static void pDispdednhist(NString dcde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNHIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
				
			cmd.execute();


		}
		
		public static void pDispdednhistflex(NString dcde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNHISTFLEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
				
			cmd.execute();


		}
		
		public static void pDispdednhisthealth(NString dcde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNHISTHEALTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
				
			cmd.execute();


		}
		
		public static void pDispdednhistmisc(NString dcde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNHISTMISC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
				
			cmd.execute();


		}
		
		public static void pDispdednhistret(NString dcde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNHISTRET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
				
			cmd.execute();


		}
		
		public static void pDispdednhistw4(NString dcde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNHISTW4", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
				
			cmd.execute();


		}
		
		public static void pDispdednytd(NString dcde,NString fMnth,NString fYear,NString tMnth,NString tYear,NString inFunc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNYTD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
			cmd.addParameter("@IN_FUNC", inFunc);
				
			cmd.execute();


		}
		
		public static void pDispdednytdflex(NString dcde,NString fMnth,NString fYear,NString tMnth,NString tYear,NString inFunc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNYTDFLEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
			cmd.addParameter("@IN_FUNC", inFunc);
				
			cmd.execute();


		}
		
		public static void pDispdednytdhealth(NString dcde,NString fMnth,NString fYear,NString tMnth,NString tYear,NString inFunc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNYTDHEALTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
			cmd.addParameter("@IN_FUNC", inFunc);
				
			cmd.execute();


		}
		
		public static void pDispdednytdmisc(NString dcde,NString fMnth,NString fYear,NString tMnth,NString tYear,NString inFunc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNYTDMISC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
			cmd.addParameter("@IN_FUNC", inFunc);
				
			cmd.execute();


		}
		
		public static void pDispdednytdret(NString dcde,NString fMnth,NString fYear,NString tMnth,NString tYear,NString inFunc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNYTDRET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
			cmd.addParameter("@IN_FUNC", inFunc);
				
			cmd.execute();


		}
		
		public static void pDispdednytdw4(NString dcde,NString fMnth,NString fYear,NString tMnth,NString tYear,NString inFunc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_DISPDEDNYTDW4", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
			cmd.addParameter("@IN_FUNC", inFunc);
				
			cmd.execute();


		}
		
		public static void pOpenenrollment() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_OPENENROLLMENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentcost() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_OPENENROLLMENTCOST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentdetail(NString dcde,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_OPENENROLLMENTDETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncs(NString func) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_OPENENROLLMENTFUNCS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FUNC", func);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentgroup(NString dgrp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_OPENENROLLMENTGROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DGRP", dgrp);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentupdate(NString dcde,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_OPENENROLLMENTUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
				
			cmd.execute();


		}
		
		public static void pUpdatededn(NString dcde,NString efdt,NString delc,NString stat,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_UPDATEDEDN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@EFDT", efdt);
			cmd.addParameter("@DELC", delc);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
				
			cmd.execute();


		}
		
		public static void pUpdatedednflex(NString dcde,NString efdt,NString delc,NString stat,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_UPDATEDEDNFLEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@EFDT", efdt);
			cmd.addParameter("@DELC", delc);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
				
			cmd.execute();


		}
		
		public static void pUpdatedednhealth(NString dcde,NString efdt,NString delc,NString stat,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_UPDATEDEDNHEALTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@EFDT", efdt);
			cmd.addParameter("@DELC", delc);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
				
			cmd.execute();


		}
		
		public static void pUpdatedednmisc(NString dcde,NString efdt,NString delc,NString stat,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_UPDATEDEDNMISC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@EFDT", efdt);
			cmd.addParameter("@DELC", delc);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
				
			cmd.execute();


		}
		
		public static void pUpdatedednret(NString dcde,NString efdt,NString delc,NString stat,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_UPDATEDEDNRET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@EFDT", efdt);
			cmd.addParameter("@DELC", delc);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
				
			cmd.execute();


		}
		
		public static void pUpdatedednselnew(NString dedngrp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_UPDATEDEDNSELNEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEDNGRP", dedngrp);
				
			cmd.execute();


		}
		
		public static void pUpdatedednw4(NString dcde,NString efdt,NString delc,NString stat,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5,NString nameDiffInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDCMN.P_UPDATEDEDNW4", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@EFDT", efdt);
			cmd.addParameter("@DELC", delc);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
			cmd.addParameter("@NAME_DIFF_IND", nameDiffInd);
				
			cmd.execute();


		}
		
	
	
	
}
