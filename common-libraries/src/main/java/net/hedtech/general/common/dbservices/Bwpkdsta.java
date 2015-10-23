package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdsta {
		public static void pAdddependentsforlifechg(NString pgReason,NString pgEventDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_ADDDEPENDENTSFORLIFECHG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_REASON", pgReason);
			cmd.addParameter("@PG_EVENT_DATE", pgEventDate);
				
			cmd.execute();


		}
		
		public static void pAdddependentsfornhire() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_ADDDEPENDENTSFORNHIRE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispempsearchresults(NString pLastName,NString pFirstName,NString pId,NString pRecNo,NString pStartNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPEMPSEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_REC_NO", pRecNo);
			cmd.addParameter("@P_START_NO", pStartNo);
				
			cmd.execute();


		}
		
		public static void pDisplayempdetailapplied(NString pEmpSeqNo,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYEMPDETAILAPPLIED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();


		}
		
		public static void pDisplayempdetailconfirm(NString pEmpSeqNo,NString pSelect,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYEMPDETAILCONFIRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_SELECT", pSelect);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();


		}
		
//		public static void pDisplayempdetaildriver(NString pEmpSeqNo,List<Twbklibs.Varchar2TabtypeRow> pRecNo,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pBdcaCode,List<Twbklibs.Varchar2TabtypeRow> pEffectiveDate,List<Twbklibs.Varchar2TabtypeRow> pApply,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYEMPDETAILDRIVER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
//			// cmd.addParameter(DbTypes.getTableType("P_REC_NO", "", pRecNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BDCA_CODE", "", pBdcaCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EFFECTIVE_DATE", "", pEffectiveDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_APPLY", "", pApply, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
		public static void pDisplayempdetailpending(NString pEmpSeqNo,NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYEMPDETAILPENDING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();


		}
		
		public static void pDisplayemperrors(NString pEmpSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYEMPERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
				
			cmd.execute();


		}
		
		public static void pDisplayempsummaryapplied(NNumber pRecordNo,NString pEmpSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYEMPSUMMARYAPPLIED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
				
			cmd.execute();


		}
		
		public static void pDisplayempsummaryconfirm(NString pSelect,NNumber pRecordNo,NString pEmpSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYEMPSUMMARYCONFIRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SELECT", pSelect);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
				
			cmd.execute();


		}
		
//		public static void pDisplayempsummarydriver(List<Twbklibs.Varchar2TabtypeRow> pRecNo,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pBdcaCode,List<Twbklibs.Varchar2TabtypeRow> pEffectiveDate,NString pRecordNo,NString pEmpSeqNo,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYEMPSUMMARYDRIVER", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_REC_NO", "", pRecNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BDCA_CODE", "", pBdcaCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EFFECTIVE_DATE", "", pEffectiveDate, object.class));
//			cmd.addParameter("@P_RECORD_NO", pRecordNo);
//			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDisplayempsummarypending(NNumber pRecordNo,NString pEmpSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYEMPSUMMARYPENDING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
				
			cmd.execute();


		}
		
//		public static void pDisplayfiltermain(List<Twbklibs.Varchar2TabtypeRow> pOrgnCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYFILTERMAIN", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_ORGN_CODE", "", pOrgnCode, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDisplayfilternameid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYFILTERNAMEID", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisplayorgnsummaryapplied(NNumber pRecordNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYORGNSUMMARYAPPLIED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
				
			cmd.execute();


		}
		
		public static void pDisplayorgnsummaryconfirm(NString pSelect,NNumber pRecordNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYORGNSUMMARYCONFIRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SELECT", pSelect);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
				
			cmd.execute();


		}
		
//		public static void pDisplayorgnsummarydriver(List<Twbklibs.Varchar2TabtypeRow> pRecNo,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pBdcaCode,List<Twbklibs.Varchar2TabtypeRow> pEffectiveDate,NString pRecordNo,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYORGNSUMMARYDRIVER", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_REC_NO", "", pRecNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BDCA_CODE", "", pBdcaCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EFFECTIVE_DATE", "", pEffectiveDate, object.class));
//			cmd.addParameter("@P_RECORD_NO", pRecordNo);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDisplayorgnsummarypending(NNumber pRecordNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_DISPLAYORGNSUMMARYPENDING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
				
			cmd.execute();


		}
		
		public static void pEnrollmentfinish() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_ENROLLMENTFINISH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pEnrollmentfunctions(NString btnselected,NString pBreaCode,NString pEventDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_ENROLLMENTFUNCTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BTNSELECTED", btnselected);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
				
			cmd.execute();


		}
		
		public static void pEnrollmentupdate(NString dgrp,NString bdca,NString effDate,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_ENROLLMENTUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DGRP", dgrp);
			cmd.addParameter("@BDCA", bdca);
			cmd.addParameter("@EFF_DATE", effDate);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
		public static void pEnrollmentupdategroup(NString pGroup,NString pBreaCode,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_ENROLLMENTUPDATEGROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
//		public static void pFilterdriver(List<Twbklibs.Varchar2TabtypeRow> pOrgnCode,List<Twbklibs.Varchar2TabtypeRow> pBcatCode,List<Twbklibs.Varchar2TabtypeRow> pBdcaCode,NString pRecNo,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_FILTERDRIVER", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_ORGN_CODE", "", pOrgnCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BCAT_CODE", "", pBcatCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BDCA_CODE", "", pBdcaCode, object.class));
//			cmd.addParameter("@P_REC_NO", pRecNo);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pLifechgenrollment() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_LIFECHGENROLLMENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pLifeeventchange(NString pSelectedReason,NString pEventDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_LIFEEVENTCHANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SELECTED_REASON", pSelectedReason);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
				
			cmd.execute();


		}
		
		public static void pModifyempdeduction(NString pEmpSeqNo,NString pBdcaCode,NString pEffectiveDate,NString pNewEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_MODIFYEMPDEDUCTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NEW_EFFECTIVE_DATE", pNewEffectiveDate);
				
			cmd.execute();


		}
		
		public static void pShowenrollmentdetl(NString dgrp,NString bdca,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_SHOWENROLLMENTDETL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DGRP", dgrp);
			cmd.addParameter("@BDCA", bdca);
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
		
		public static void pShowenrollmentgroup(NString pDgrp,NString pBreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_SHOWENROLLMENTGROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DGRP", pDgrp);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
				
			cmd.execute();


		}
		
		public static void pShowenrollmentmenu() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_SHOWENROLLMENTMENU", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pShownewhireenrollment() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_SHOWNEWHIREENROLLMENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateempdeduction(NString pEmpSeqNo,NString pBdcaCode,NString pEffectiveDate,NString pNewEffectiveDate,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDSTA.P_UPDATEEMPDEDUCTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_SEQ_NO", pEmpSeqNo);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NEW_EFFECTIVE_DATE", pNewEffectiveDate);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
	
	
	
}
