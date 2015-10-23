package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkhpst {
		public static NString fBdcaExclFromFedTax(NNumber pPidm,NString pBdca,NString pYr,NString pPict,NNumber pPayno,NNumber pSeqno,NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.F_BDCA_EXCL_FROM_FED_TAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_YR", pYr);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBdcaInclInFedTax(NNumber pPidm,NString pBdca,NString pYr,NString pPict,NNumber pPayno,NNumber pSeqno,NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.F_BDCA_INCL_IN_FED_TAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_YR", pYr);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEarnExclFromFedTax(NNumber pPidm,NString pEarn,NString pYr,NString pPict,NNumber pPayno,NNumber pSeqno,NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.F_EARN_EXCL_FROM_FED_TAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EARN", pEarn);
			cmd.addParameter("@P_YR", pYr);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fFedTaxBenDednCurrAmt(NNumber pPidm,NString pBdca,NDate pDate,NNumber pSeqno,NNumber pPayno,NString pPict,NString pYr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.F_FED_TAX_BEN_DEDN_CURR_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_DATE", pDate);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_YR", pYr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fFedTaxBenEarnCurrAmt(NNumber pPidm,NString pEarn,NNumber pSeqno,NNumber pPayno,NString pPict,NString pYr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.F_FED_TAX_BEN_EARN_CURR_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EARN", pEarn);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_YR", pYr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fFedTaxInd(NNumber pPidm,NString pYr,NString pPict,NNumber pPayno,NNumber pSeqno,NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.F_FED_TAX_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YR", pYr);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetJobDesc(NNumber pPidm,NString pPosn,NString pSuff,NDate pEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.F_GET_JOB_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_END_DATE", pEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTaxInd(NString pBdca,NString pBdty,NNumber pPidm,NString pYr,NString pPict,NNumber pPayno,NNumber pSeqno,NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.F_GET_TAX_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_BDTY", pBdty);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YR", pYr);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fValidPayevent(NNumber empPidm,NString yr,NString pict,NNumber payno,NNumber seqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.F_VALID_PAYEVENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@EMP_PIDM", empPidm);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidPaystubParms(NString yr,NString pict,NString payno,NString seqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.F_VALID_PAYSTUB_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pChooseemployeradminbody(NNumber pPidm,NNumber pEmpPidm,NString yr,NString docDate,NString pict,NString payno,NString seqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_CHOOSEEMPLOYERADMINBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
				
			cmd.execute();


		}
		
		public static void pChooseemployerbody(NNumber pPidm,NString whichYr,NString yr,NDate docDate,NString pict,NNumber payno,NNumber seqNo,NString empr,NString exeSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_CHOOSEEMPLOYERBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@WHICH_YR", whichYr);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EMPR", empr);
			cmd.addParameter("@EXE_SOURCE", exeSource);
				
			cmd.execute();


		}
		
		public static void pChoosepaystubyearbody(NNumber pPidm,NString yr,NString exeSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_CHOOSEPAYSTUBYEARBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@EXE_SOURCE", exeSource);
				
			cmd.execute();


		}
		
		public static void pDispIdnameSearchCriteria(NNumber pLoginPidm,NString pEmpFirstName,NString pEmpLastName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_DISP_IDNAME_SEARCH_CRITERIA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_EMP_FIRST_NAME", pEmpFirstName);
			cmd.addParameter("@P_EMP_LAST_NAME", pEmpLastName);
				
			cmd.execute();


		}
		
		public static void pDisplayEmpResults(NString pUrlName,NString pNexturlText,NNumber pLoginPidm,NString pEmpId,NString pEmpFirstName,NString pEmpLastName,NString pPageNum,NString pSortBy,NString pNewSearch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_DISPLAY_EMP_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_URL_NAME", pUrlName);
			cmd.addParameter("@P_NEXTURL_TEXT", pNexturlText);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_EMP_ID", pEmpId);
			cmd.addParameter("@P_EMP_FIRST_NAME", pEmpFirstName);
			cmd.addParameter("@P_EMP_LAST_NAME", pEmpLastName);
			cmd.addParameter("@P_PAGE_NUM", pPageNum);
			cmd.addParameter("@P_SORT_BY", pSortBy);
			cmd.addParameter("@P_NEW_SEARCH", pNewSearch);
				
			cmd.execute();


		}
		
		public static void pDisppaystubdtlbody(NNumber pPidm,NString whichYr,NString yr,NDate docDate,NString pict,NNumber payno,NNumber seqNo,NString suppressHeader,NString exeSource,NString emprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_DISPPAYSTUBDTLBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@WHICH_YR", whichYr);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@SUPPRESS_HEADER", suppressHeader);
			cmd.addParameter("@EXE_SOURCE", exeSource);
			cmd.addParameter("@EMPR_CODE", emprCode);
				
			cmd.execute();


		}
		
		public static void pDisppaystubsumbody(NNumber pPidm,NString yr,NString exeSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_DISPPAYSTUBSUMBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@EXE_SOURCE", exeSource);
				
			cmd.execute();


		}
		
		public static void pPaystubPrinterCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_PAYSTUB_PRINTER_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPaystubScreenCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_PAYSTUB_SCREEN_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPaystubdtladminbody(NNumber pPidm,NNumber pEmpPidm,NString yr,NString docDate,NString pict,NString payno,NString seqNo,NString emprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_PAYSTUBDTLADMINBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EMPR_CODE", emprCode);
				
			cmd.execute();


		}
		
		public static void pPaystubempadminbody(NNumber pLoginPidm,NString pEmpId,NString pEmpFirstName,NString pEmpLastName,NString pRecsPerPage,NString pPageNum,NString pSortBy,NString pNewSearch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_PAYSTUBEMPADMINBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_EMP_ID", pEmpId);
			cmd.addParameter("@P_EMP_FIRST_NAME", pEmpFirstName);
			cmd.addParameter("@P_EMP_LAST_NAME", pEmpLastName);
			cmd.addParameter("@P_RECS_PER_PAGE", pRecsPerPage);
			cmd.addParameter("@P_PAGE_NUM", pPageNum);
			cmd.addParameter("@P_SORT_BY", pSortBy);
			cmd.addParameter("@P_NEW_SEARCH", pNewSearch);
				
			cmd.execute();


		}
		
		public static void pPaystubsumadminbody(NNumber pPidm,NNumber pEmpPidm,NString yr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_PAYSTUBSUMADMINBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@YR", yr);
				
			cmd.execute();


		}
		
		public static void pPaystubyearadminbody(NNumber pPidm,NNumber pEmpPidm,NString yr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_PAYSTUBYEARADMINBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@YR", yr);
				
			cmd.execute();


		}
		
		public static void pPrintEmpSearchPage(NString pUrlName,NString pNexturlText,NNumber pLoginPidm,NString pEmpId,NString pEmpFirstName,NString pEmpLastName,NString pPageNum,NString pSortBy,NString pNewSearch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_PRINT_EMP_SEARCH_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_URL_NAME", pUrlName);
			cmd.addParameter("@P_NEXTURL_TEXT", pNexturlText);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_EMP_ID", pEmpId);
			cmd.addParameter("@P_EMP_FIRST_NAME", pEmpFirstName);
			cmd.addParameter("@P_EMP_LAST_NAME", pEmpLastName);
			cmd.addParameter("@P_PAGE_NUM", pPageNum);
			cmd.addParameter("@P_SORT_BY", pSortBy);
			cmd.addParameter("@P_NEW_SEARCH", pNewSearch);
				
			cmd.execute();


		}
		
		public static void pPrintNewPaystubLink(NString parmYr,NString parmAdmin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_PRINT_NEW_PAYSTUB_LINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_YR", parmYr);
			cmd.addParameter("@PARM_ADMIN", parmAdmin);
				
			cmd.execute();


		}
		
		public static void pPrintReturnLink(NString yr,NDate docDate,NString pict,NNumber payno,NNumber seqNo,NString emprCode,NString exeSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_PRINT_RETURN_LINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@DOC_DATE", docDate);
			cmd.addParameter("@PICT", pict);
			cmd.addParameter("@PAYNO", payno);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EMPR_CODE", emprCode);
			cmd.addParameter("@EXE_SOURCE", exeSource);
				
			cmd.execute();


		}
		
		public static void pSearchEmps(Ref<DataCursor> pResults,NString pLname,NString pFname,NString pIdno,NString pSortBy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_SEARCH_EMPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULTS", DataCursor.class);
			cmd.addParameter("@P_LNAME", pLname);
			cmd.addParameter("@P_FNAME", pFname);
			cmd.addParameter("@P_IDNO", pIdno);
			cmd.addParameter("@P_SORT_BY", pSortBy);
				
			cmd.execute();
			pResults.val = cmd.getParameterValue("@P_RESULTS", DataCursor.class);


		}
		
		public static void pValidateId(NNumber pLoginPidm,NString pEmpId,Ref<NNumber> pEmpPidmOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHPST.P_VALIDATE_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@P_EMP_ID", pEmpId);
			cmd.addParameter("@P_EMP_PIDM_OUT", NNumber.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pEmpPidmOut.val = cmd.getParameterValue("@P_EMP_PIDM_OUT", NNumber.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
	
	
	
}
