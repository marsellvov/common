package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkhpay {
		public static void csv() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.CSV", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pChooseearnbypositions(List<Twbklibs.Varchar2TabtypeRow> pYears) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_CHOOSEEARNBYPOSITIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_YEARS", "", pYears, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pChooseearnings(NString fMnth,NString fYear,NString tMnth,NString tYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_CHOOSEEARNINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
				
			cmd.execute();


		}
		
		public static void pChooseearningsbody(NNumber pidm,NString fMnth,NString fYear,NString tMnth,NString tYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_CHOOSEEARNINGSBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
				
			cmd.execute();


		}
		
		public static void pDispearnytddriver(NNumber pidm,NString earn,NString fMnth,NString fYear,NString tMnth,NString tYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_DISPEARNYTDDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@EARN", earn);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
				
			cmd.execute();


		}
		
		public static void pModifydirectdeposit(NString newbankroutnum,NString newacctnum,NString newaccttype,NString newamtpct,NString newallocation,NString remainingInd,NString newhrdeposit,NString newapdeposit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_MODIFYDIRECTDEPOSIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEWBANKROUTNUM", newbankroutnum);
			cmd.addParameter("@NEWACCTNUM", newacctnum);
			cmd.addParameter("@NEWACCTTYPE", newaccttype);
			cmd.addParameter("@NEWAMTPCT", newamtpct);
			cmd.addParameter("@NEWALLOCATION", newallocation);
			cmd.addParameter("@REMAINING_IND", remainingInd);
			cmd.addParameter("@NEWHRDEPOSIT", newhrdeposit);
			cmd.addParameter("@NEWAPDEPOSIT", newapdeposit);
				
			cmd.execute();


		}
		
		public static void pModifyindivdirectdeposit(NString routnum,NString acctnum,NString accttype,NString priority,NString docType,NString allocationvalue,NString allocationtype,NString remainingInd,NString recordpayrollind,NString recordapind,NString recordacctype,NString hrind,NString apind,NString addType,NNumber addSeqno,NString apamount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_MODIFYINDIVDIRECTDEPOSIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ROUTNUM", routnum);
			cmd.addParameter("@ACCTNUM", acctnum);
			cmd.addParameter("@ACCTTYPE", accttype);
			cmd.addParameter("@PRIORITY", priority);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@ALLOCATIONVALUE", allocationvalue);
			cmd.addParameter("@ALLOCATIONTYPE", allocationtype);
			cmd.addParameter("@REMAINING_IND", remainingInd);
			cmd.addParameter("@RECORDPAYROLLIND", recordpayrollind);
			cmd.addParameter("@RECORDAPIND", recordapind);
			cmd.addParameter("@RECORDACCTYPE", recordacctype);
			cmd.addParameter("@HRIND", hrind);
			cmd.addParameter("@APIND", apind);
			cmd.addParameter("@ADD_TYPE", addType);
			cmd.addParameter("@ADD_SEQNO", addSeqno);
			cmd.addParameter("@APAMOUNT", apamount);
				
			cmd.execute();


		}
		
//		public static void pUpdatedirectdeposit(List<Twbklibs.Varchar2TabtypeRow> doctype,List<Twbklibs.Varchar2TabtypeRow> priority,List<Twbklibs.Varchar2TabtypeRow> newpriority,List<Twbklibs.Varchar2TabtypeRow> hrind,List<Twbklibs.Varchar2TabtypeRow> bankacctnum,List<Twbklibs.Varchar2TabtypeRow> bankroutnum,List<Twbklibs.Varchar2TabtypeRow> accttype,List<Twbklibs.Varchar2TabtypeRow> apind,NString newbankroutnum,NString newacctnum,NString newaccttype,NString newamtpct,NString newallocation,NString markremaining,NString bankname,NString buttonselected,NString scriptDis,NString markpayrolldeposit,NString markapdeposit) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_UPDATEDIRECTDEPOSIT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("DOCTYPE", "", doctype, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PRIORITY", "", priority, object.class));
//			// cmd.addParameter(DbTypes.getTableType("NEWPRIORITY", "", newpriority, object.class));
//			// cmd.addParameter(DbTypes.getTableType("HRIND", "", hrind, object.class));
//			// cmd.addParameter(DbTypes.getTableType("BANKACCTNUM", "", bankacctnum, object.class));
//			// cmd.addParameter(DbTypes.getTableType("BANKROUTNUM", "", bankroutnum, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ACCTTYPE", "", accttype, object.class));
//			// cmd.addParameter(DbTypes.getTableType("APIND", "", apind, object.class));
//			cmd.addParameter("@NEWBANKROUTNUM", newbankroutnum);
//			cmd.addParameter("@NEWACCTNUM", newacctnum);
//			cmd.addParameter("@NEWACCTTYPE", newaccttype);
//			cmd.addParameter("@NEWAMTPCT", newamtpct);
//			cmd.addParameter("@NEWALLOCATION", newallocation);
//			cmd.addParameter("@MARKREMAINING", markremaining);
//			cmd.addParameter("@BANKNAME", bankname);
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//			cmd.addParameter("@SCRIPT_DIS", scriptDis);
//			cmd.addParameter("@MARKPAYROLLDEPOSIT", markpayrolldeposit);
//			cmd.addParameter("@MARKAPDEPOSIT", markapdeposit);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdindivdirectdeposit(NString curroutnum,NString curacctnum,NString curaccttype,NString priority,NString docType,NString newaccttype,NString newallocation,NString newamtpct,NString markinactive,NString markremaining,NString buttonselected,NString recordpayrollind,NString recordapind,NString recordacctype,NString markpayrolldeposit,NString markapdeposit,NString addType,NNumber addSeqno,NString apamount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_UPDINDIVDIRECTDEPOSIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CURROUTNUM", curroutnum);
			cmd.addParameter("@CURACCTNUM", curacctnum);
			cmd.addParameter("@CURACCTTYPE", curaccttype);
			cmd.addParameter("@PRIORITY", priority);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@NEWACCTTYPE", newaccttype);
			cmd.addParameter("@NEWALLOCATION", newallocation);
			cmd.addParameter("@NEWAMTPCT", newamtpct);
			cmd.addParameter("@MARKINACTIVE", markinactive);
			cmd.addParameter("@MARKREMAINING", markremaining);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@RECORDPAYROLLIND", recordpayrollind);
			cmd.addParameter("@RECORDAPIND", recordapind);
			cmd.addParameter("@RECORDACCTYPE", recordacctype);
			cmd.addParameter("@MARKPAYROLLDEPOSIT", markpayrolldeposit);
			cmd.addParameter("@MARKAPDEPOSIT", markapdeposit);
			cmd.addParameter("@ADD_TYPE", addType);
			cmd.addParameter("@ADD_SEQNO", addSeqno);
			cmd.addParameter("@APAMOUNT", apamount);
				
			cmd.execute();


		}
		
		public static void pViewdirectdeposit() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_VIEWDIRECTDEPOSIT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pViewearnbypositions(List<Twbklibs.Varchar2TabtypeRow> pPositions) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_VIEWEARNBYPOSITIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_POSITIONS", "", pPositions, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pViewearningsdetail(NString earn,NString fMnth,NString fYear,NString tMnth,NString tYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_VIEWEARNINGSDETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EARN", earn);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
				
			cmd.execute();


		}
		
		public static void pViewearnsummary(NString fMnth,NString fYear,NString tMnth,NString tYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_VIEWEARNSUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
				
			cmd.execute();


		}
		
		public static void pViewearnsummarybody(NNumber pidm,NString fMnth,NString fYear,NString tMnth,NString tYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPAY.P_VIEWEARNSUMMARYBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
				
			cmd.execute();


		}
		
	
	
	
}
