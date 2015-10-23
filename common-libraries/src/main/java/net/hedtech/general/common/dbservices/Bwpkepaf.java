package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkepaf {
		public static void pChoosejob(NString pPosn,NString pSuff,NString pNextApty,NString pNextAptySeqno,NString pInclTerminated) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_CHOOSEJOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_NEXT_APTY", pNextApty);
			cmd.addParameter("@P_NEXT_APTY_SEQNO", pNextAptySeqno);
			cmd.addParameter("@P_INCL_TERMINATED", pInclTerminated);
				
			cmd.execute();


		}
		
//		public static void pChoosejobdriver(NString pgPosn,NString pgPosntitle,NString pgSuff,NString pgNextApty,NString pgNextAptySeqno,List<Twbklibs.Varchar2TabtypeRow> jobselected,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_CHOOSEJOBDRIVER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_POSN", pgPosn);
//			cmd.addParameter("@PG_POSNTITLE", pgPosntitle);
//			cmd.addParameter("@PG_SUFF", pgSuff);
//			cmd.addParameter("@PG_NEXT_APTY", pgNextApty);
//			cmd.addParameter("@PG_NEXT_APTY_SEQNO", pgNextAptySeqno);
//			// cmd.addParameter(DbTypes.getTableType("JOBSELECTED", "", jobselected, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
		public static void pChooseperson(NString pEpafid,NString pQuerydt,NString pAcat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_CHOOSEPERSON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPAFID", pEpafid);
			cmd.addParameter("@P_QUERYDT", pQuerydt);
			cmd.addParameter("@P_ACAT", pAcat);
				
			cmd.execute();


		}
		
		public static void pChoosepersondriver(NString pgPersid,NString pgPersname,NString pgQuerydt,NString pgAcat,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_CHOOSEPERSONDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_PERSID", pgPersid);
			cmd.addParameter("@PG_PERSNAME", pgPersname);
			cmd.addParameter("@PG_QUERYDT", pgQuerydt);
			cmd.addParameter("@PG_ACAT", pgAcat);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
		public static void pChooseposition() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_CHOOSEPOSITION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pChoosepositiondriver(NString btnselected,NString pgPosnsrch,List<Twbklibs.Varchar2TabtypeRow> pgEcls,List<Twbklibs.Varchar2TabtypeRow> pgCoa,List<Twbklibs.Varchar2TabtypeRow> pgOrgn,NString pSort) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_CHOOSEPOSITIONDRIVER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@BTNSELECTED", btnselected);
//			cmd.addParameter("@PG_POSNSRCH", pgPosnsrch);
//			// cmd.addParameter(DbTypes.getTableType("PG_ECLS", "", pgEcls, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_COA", "", pgCoa, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_ORGN", "", pgOrgn, object.class));
//			cmd.addParameter("@P_SORT", pSort);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDispapproverfilters() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPAPPROVERFILTERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispapproversummary(NString pViewType,NString pSortType,NNumber pPointer,NString pSelectAllInd,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPAPPROVERSUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_TYPE", pViewType);
			cmd.addParameter("@P_SORT_TYPE", pSortType);
			cmd.addParameter("@P_POINTER", pPointer);
			cmd.addParameter("@P_SELECT_ALL_IND", pSelectAllInd);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
		public static void pDispcomments(NString pTrans,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPCOMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS", pTrans);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
		public static void pDispdefaultrouting(NString pAcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPDEFAULTROUTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
				
			cmd.execute();


		}
		
		public static void pDispduplicatecheck(NString pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPDUPLICATECHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pDispepafdetl(NString pTransNo,NString pFinishSubmit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPEPAFDETL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_FINISH_SUBMIT", pFinishSubmit);
				
			cmd.execute();


		}
		
		public static void pDispepafmenu() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPEPAFMENU", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispepafpreview(NNumber pTransNo,NString pUserRole,NNumber prevtransno,NNumber nexttransno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPEPAFPREVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_USER_ROLE", pUserRole);
			cmd.addParameter("@PREVTRANSNO", prevtransno);
			cmd.addParameter("@NEXTTRANSNO", nexttransno);
				
			cmd.execute();


		}
		
		public static void pDisporiginatorfilters() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPORIGINATORFILTERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisporiginatorsummary(NString pViewType,NString pSortType,NNumber pPointer,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPORIGINATORSUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_TYPE", pViewType);
			cmd.addParameter("@P_SORT_TYPE", pSortType);
			cmd.addParameter("@P_POINTER", pPointer);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
		public static void pDisppersearchresults(NString employee,NString lastName,NString firstName,NString emplId,NString ssnSinTin,NNumber recNo,NNumber startNo,NNumber totalRecs,NString buttonselected,NString sortOrder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPPERSEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMPLOYEE", employee);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@SSN_SIN_TIN", ssnSinTin);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@START_NO", startNo);
			cmd.addParameter("@TOTAL_RECS", totalRecs);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@SORT_ORDER", sortOrder);
				
			cmd.execute();


		}
		
		public static void pDisppersonaddresses(NString pCurView) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPPERSONADDRESSES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUR_VIEW", pCurView);
				
			cmd.execute();


		}
		
		public static void pDisppersonaddressesphones(NString pCurView) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPPERSONADDRESSESPHONES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUR_VIEW", pCurView);
				
			cmd.execute();


		}
		
		public static void pDisppersonphones(NString pCurView) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPPERSONPHONES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUR_VIEW", pCurView);
				
			cmd.execute();


		}
		
		public static void pDispproxysetup(NString btnselected,NString apprLevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPPROXYSETUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BTNSELECTED", btnselected);
			cmd.addParameter("@APPR_LEVEL", apprLevel);
				
			cmd.execute();


		}
		
		public static void pDisptranssearchresults(NString lastName,NString firstName,NString emplId,NString transNo,NNumber recNo,NNumber startNo,NNumber totalRecs,NString buttonselected,NString sortOrder,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPTRANSSEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@START_NO", startNo);
			cmd.addParameter("@TOTAL_RECS", totalRecs);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@SORT_ORDER", sortOrder);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
		public static void pDispvalidvalues(NString fieldcodenm,NString fielddescnm,NNumber fieldindex,NString criteria1,NString criteria2,NString srchval,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DISPVALIDVALUES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIELDCODENM", fieldcodenm);
			cmd.addParameter("@FIELDDESCNM", fielddescnm);
			cmd.addParameter("@FIELDINDEX", fieldindex);
			cmd.addParameter("@CRITERIA1", criteria1);
			cmd.addParameter("@CRITERIA2", criteria2);
			cmd.addParameter("@SRCHVAL", srchval);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
		public static void pDuplicatecheckdriver(NString btnselected,NString selectedId,NString pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_DUPLICATECHECKDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BTNSELECTED", btnselected);
			cmd.addParameter("@SELECTED_ID", selectedId);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pGetperson(NString employee,NString lastName,NString firstName,NString emplId,NString ssnSinTin,NString recNo,NNumber startNo,NString buttonselected,NString sortOrder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_GETPERSON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMPLOYEE", employee);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@SSN_SIN_TIN", ssnSinTin);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@START_NO", startNo);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@SORT_ORDER", sortOrder);
				
			cmd.execute();


		}
		
		public static void pGettransaction(NString lastName,NString firstName,NString emplId,NString transNo,NString recNo,NNumber startNo,NString buttonselected,NString sortOrder,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_GETTRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@START_NO", startNo);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@SORT_ORDER", sortOrder);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
		public static void pNewpersepafdetl(NString pgPosn,NString pgSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_NEWPERSEPAFDETL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_POSN", pgPosn);
			cmd.addParameter("@PG_SUFF", pgSuff);
				
			cmd.execute();


		}
		
		public static void pSearchperson(NString employee,NString lastName,NString firstName,NString emplId,NString ssnSinTin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_SEARCHPERSON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMPLOYEE", employee);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@SSN_SIN_TIN", ssnSinTin);
				
			cmd.execute();


		}
		
		public static void pSearchtransaction(NString lastName,NString firstName,NString emplId,NString transNo,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_SEARCHTRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
		public static void pSelectapproverfilters(NString pgProxyForId,NString pgSuperuserInd,NString pgSubmitFromDate,NString pgSubmitToDate,NString pgTransPerPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_SELECTAPPROVERFILTERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_PROXY_FOR_ID", pgProxyForId);
			cmd.addParameter("@PG_SUPERUSER_IND", pgSuperuserInd);
			cmd.addParameter("@PG_SUBMIT_FROM_DATE", pgSubmitFromDate);
			cmd.addParameter("@PG_SUBMIT_TO_DATE", pgSubmitToDate);
			cmd.addParameter("@PG_TRANS_PER_PAGE", pgTransPerPage);
				
			cmd.execute();


		}
		
//		public static void pSelectapproversummary(List<Twbklibs.Varchar2TabtypeRow> qstatselected,List<Twbklibs.Varchar2TabtypeRow> transselected,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_SELECTAPPROVERSUMMARY", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("QSTATSELECTED", "", qstatselected, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TRANSSELECTED", "", transselected, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSelectoriginatorfilters(NString pgSuperuserInd,NString pgSubmitFromDate,NString pgSubmitToDate,NString pgTransPerPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_SELECTORIGINATORFILTERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_SUPERUSER_IND", pgSuperuserInd);
			cmd.addParameter("@PG_SUBMIT_FROM_DATE", pgSubmitFromDate);
			cmd.addParameter("@PG_SUBMIT_TO_DATE", pgSubmitToDate);
			cmd.addParameter("@PG_TRANS_PER_PAGE", pgTransPerPage);
				
			cmd.execute();


		}
		
//		public static void pSelectoriginatorsummary(List<Twbklibs.Varchar2TabtypeRow> tstatselected,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_SELECTORIGINATORSUMMARY", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TSTATSELECTED", "", tstatselected, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pSelectpersonaddress(NString pgCurView,NString pgNextApty,NString pgNextAptySeq,NString aptyselected,List<Twbklibs.Varchar2TabtypeRow> addrselected,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_SELECTPERSONADDRESS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_CUR_VIEW", pgCurView);
//			cmd.addParameter("@PG_NEXT_APTY", pgNextApty);
//			cmd.addParameter("@PG_NEXT_APTY_SEQ", pgNextAptySeq);
//			cmd.addParameter("@APTYSELECTED", aptyselected);
//			// cmd.addParameter(DbTypes.getTableType("ADDRSELECTED", "", addrselected, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pSelectpersonaddressphone(NString pgCurView,NString pgNextApty,NString pgNextAptySeq,NString aptyselected,List<Twbklibs.Varchar2TabtypeRow> addrteleselected,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_SELECTPERSONADDRESSPHONE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_CUR_VIEW", pgCurView);
//			cmd.addParameter("@PG_NEXT_APTY", pgNextApty);
//			cmd.addParameter("@PG_NEXT_APTY_SEQ", pgNextAptySeq);
//			cmd.addParameter("@APTYSELECTED", aptyselected);
//			// cmd.addParameter(DbTypes.getTableType("ADDRTELESELECTED", "", addrteleselected, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pSelectpersonphone(NString pgCurView,NString pgNextApty,NString pgNextAptySeq,NString aptyselected,List<Twbklibs.Varchar2TabtypeRow> phoneselected,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_SELECTPERSONPHONE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_CUR_VIEW", pgCurView);
//			cmd.addParameter("@PG_NEXT_APTY", pgNextApty);
//			cmd.addParameter("@PG_NEXT_APTY_SEQ", pgNextAptySeq);
//			cmd.addParameter("@APTYSELECTED", aptyselected);
//			// cmd.addParameter(DbTypes.getTableType("PHONESELECTED", "", phoneselected, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdatecomments(NString pTrans,NString pComments,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_UPDATECOMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS", pTrans);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
//		public static void pUpdatedefaultrouting(NString pAcatCode,List<Twbklibs.Varchar2TabtypeRow> ralvl,List<Twbklibs.Varchar2TabtypeRow> ruser,List<Twbklibs.Varchar2TabtypeRow> rusername,List<Twbklibs.Varchar2TabtypeRow> raction,List<Twbklibs.Varchar2TabtypeRow> rremove,List<Twbklibs.Varchar2TabtypeRow> rrowid,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_UPDATEDEFAULTROUTING", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
//			// cmd.addParameter(DbTypes.getTableType("RALVL", "", ralvl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RUSER", "", ruser, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RUSERNAME", "", rusername, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RACTION", "", raction, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RREMOVE", "", rremove, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RROWID", "", rrowid, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateepafdetl(NString pCallFrom,NString pTransNo,NString pEffDt,NString pPosn,NString pSuff,NString pFinishSubmit,List<Twbklibs.Varchar2TabtypeRow> epapty,List<Twbklibs.Varchar2TabtypeRow> epform,List<Twbklibs.Varchar2TabtypeRow> epblck,List<Twbklibs.Varchar2TabtypeRow> epfield,List<Twbklibs.Varchar2TabtypeRow> epnval,List<Twbklibs.Varchar2TabtypeRow> epformat,List<Twbklibs.Varchar2TabtypeRow> epovride,List<Twbklibs.Varchar2TabtypeRow> epent,List<Twbklibs.Varchar2TabtypeRow> eprowid,NString earnApty,List<Twbklibs.Varchar2TabtypeRow> eeffdt,List<Twbklibs.Varchar2TabtypeRow> ecode,List<Twbklibs.Varchar2TabtypeRow> ehrs,List<Twbklibs.Varchar2TabtypeRow> edhrs,List<Twbklibs.Varchar2TabtypeRow> erate,List<Twbklibs.Varchar2TabtypeRow> eshift,List<Twbklibs.Varchar2TabtypeRow> eenddt,List<Twbklibs.Varchar2TabtypeRow> erowid,List<Twbklibs.Varchar2TabtypeRow> eremove,NString jlbdApty,List<Twbklibs.Varchar2TabtypeRow> deffdt,List<Twbklibs.Varchar2TabtypeRow> dcoas,List<Twbklibs.Varchar2TabtypeRow> dacci,List<Twbklibs.Varchar2TabtypeRow> dfund,List<Twbklibs.Varchar2TabtypeRow> dorgn,List<Twbklibs.Varchar2TabtypeRow> dacct,List<Twbklibs.Varchar2TabtypeRow> dprog,List<Twbklibs.Varchar2TabtypeRow> dactv,List<Twbklibs.Varchar2TabtypeRow> dlocn,List<Twbklibs.Varchar2TabtypeRow> dproj,List<Twbklibs.Varchar2TabtypeRow> dctyp,List<Twbklibs.Varchar2TabtypeRow> dacctext,List<Twbklibs.Varchar2TabtypeRow> dpct,List<Twbklibs.Varchar2TabtypeRow> dencdt,List<Twbklibs.Varchar2TabtypeRow> dremove,List<Twbklibs.Varchar2TabtypeRow> drowid,List<Twbklibs.Varchar2TabtypeRow> dapty,List<Twbklibs.Varchar2TabtypeRow> deffapty,List<Twbklibs.Varchar2TabtypeRow> rmandtry,List<Twbklibs.Varchar2TabtypeRow> ralvl,List<Twbklibs.Varchar2TabtypeRow> ruser,List<Twbklibs.Varchar2TabtypeRow> rusername,List<Twbklibs.Varchar2TabtypeRow> raction,List<Twbklibs.Varchar2TabtypeRow> rqstat,List<Twbklibs.Varchar2TabtypeRow> rremove,List<Twbklibs.Varchar2TabtypeRow> rrowid,NString cmnt,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_UPDATEEPAFDETL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_CALL_FROM", pCallFrom);
//			cmd.addParameter("@P_TRANS_NO", pTransNo);
//			cmd.addParameter("@P_EFF_DT", pEffDt);
//			cmd.addParameter("@P_POSN", pPosn);
//			cmd.addParameter("@P_SUFF", pSuff);
//			cmd.addParameter("@P_FINISH_SUBMIT", pFinishSubmit);
//			// cmd.addParameter(DbTypes.getTableType("EPAPTY", "", epapty, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPFORM", "", epform, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPBLCK", "", epblck, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPFIELD", "", epfield, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPNVAL", "", epnval, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPFORMAT", "", epformat, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPOVRIDE", "", epovride, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPENT", "", epent, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPROWID", "", eprowid, object.class));
//			cmd.addParameter("@EARN_APTY", earnApty);
//			// cmd.addParameter(DbTypes.getTableType("EEFFDT", "", eeffdt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ECODE", "", ecode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EHRS", "", ehrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EDHRS", "", edhrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERATE", "", erate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ESHIFT", "", eshift, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EENDDT", "", eenddt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EROWID", "", erowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EREMOVE", "", eremove, object.class));
//			cmd.addParameter("@JLBD_APTY", jlbdApty);
//			// cmd.addParameter(DbTypes.getTableType("DEFFDT", "", deffdt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DCOAS", "", dcoas, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCI", "", dacci, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DFUND", "", dfund, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DORGN", "", dorgn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCT", "", dacct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPROG", "", dprog, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACTV", "", dactv, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DLOCN", "", dlocn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPROJ", "", dproj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DCTYP", "", dctyp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCTEXT", "", dacctext, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPCT", "", dpct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DENCDT", "", dencdt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DREMOVE", "", dremove, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROWID", "", drowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DAPTY", "", dapty, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DEFFAPTY", "", deffapty, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RMANDTRY", "", rmandtry, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RALVL", "", ralvl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RUSER", "", ruser, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RUSERNAME", "", rusername, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RACTION", "", raction, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RQSTAT", "", rqstat, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RREMOVE", "", rremove, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RROWID", "", rrowid, object.class));
//			cmd.addParameter("@CMNT", cmnt);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdateepafpreview(NString pTransNo,NString userrole,NString prevtransno,NString nexttransno,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_UPDATEEPAFPREVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@USERROLE", userrole);
			cmd.addParameter("@PREVTRANSNO", prevtransno);
			cmd.addParameter("@NEXTTRANSNO", nexttransno);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
//		public static void pUpdateproxies(List<Twbklibs.Varchar2TabtypeRow> currProxyUsername,NString newProxyUsername,NString newProxyValue) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_UPDATEPROXIES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("CURR_PROXY_USERNAME", "", currProxyUsername, object.class));
//			cmd.addParameter("@NEW_PROXY_USERNAME", newProxyUsername);
//			cmd.addParameter("@NEW_PROXY_VALUE", newProxyValue);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pVerification(NString pSource,NNumber attemptno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_VERIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@ATTEMPTNO", attemptno);
				
			cmd.execute();


		}
		
		public static void pVerificationdriver(NString usrid,NString pinno,NNumber attemptno,NString pSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPAF.P_VERIFICATIONDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USRID", usrid);
			cmd.addParameter("@PINNO", pinno);
			cmd.addParameter("@ATTEMPTNO", attemptno);
			cmd.addParameter("@P_SOURCE", pSource);
				
			cmd.execute();


		}
		
	
	
	
}
