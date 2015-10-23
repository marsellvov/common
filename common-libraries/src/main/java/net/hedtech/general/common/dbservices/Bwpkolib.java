package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkolib {
		public static NString fBuildLink(NString urlname,NString urltext,NString mouseovertext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_BUILD_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@URLNAME", urlname);
			cmd.addParameter("@URLTEXT", urltext);
			cmd.addParameter("@MOUSEOVERTEXT", mouseovertext);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChecked(NString pCheckedValue,NString pCurrentValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_CHECKED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CHECKED_VALUE", pCheckedValue);
			cmd.addParameter("@P_CURRENT_VALUE", pCurrentValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCompressName(NString nameStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_COMPRESS_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_STR", nameStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCreatelinkattributes(NString mouseovertitle,NString focustitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_CREATELINKATTRIBUTES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@MOUSEOVERTITLE", mouseovertitle);
			cmd.addParameter("@FOCUSTITLE", focustitle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDecodeyesno(NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_DECODEYESNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormatDecimalMsg(NString nDecimals,NString labelIn,NString formatIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_FORMAT_DECIMAL_MSG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@N_DECIMALS", nDecimals);
			cmd.addParameter("@LABEL_IN", labelIn);
			cmd.addParameter("@FORMAT_IN", formatIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormatNumber(NString pValue,NString pFormat,NString pDispFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_FORMAT_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_FORMAT", pFormat);
			cmd.addParameter("@P_DISP_FORMAT", pDispFormat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormatNumericMsg(NString labelIn,NString formatIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_FORMAT_NUMERIC_MSG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LABEL_IN", labelIn);
			cmd.addParameter("@FORMAT_IN", formatIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormatToolargeMsg(NString labelIn,NString maxvalIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_FORMAT_TOOLARGE_MSG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LABEL_IN", labelIn);
			cmd.addParameter("@MAXVAL_IN", maxvalIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCoaAbbr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_GET_COA_ABBR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCrnAbbr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_GET_CRN_ABBR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEpafAcronym() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_GET_EPAF_ACRONYM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFteAbbr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_GET_FTE_ABBR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetIdAbbr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_GET_ID_ABBR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetMultiParam(NNumber pPidm,NString pLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_GET_MULTI_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LABEL", pLabel);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fGetRandomPageIdentifier() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_GET_RANDOM_PAGE_IDENTIFIER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fProcedureenabled(NString procedureName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_PROCEDUREENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PROCEDURE_NAME", procedureName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fSelected(NString pOptionValue,NString pCurrentValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_SELECTED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OPTION_VALUE", pOptionValue);
			cmd.addParameter("@P_CURRENT_VALUE", pCurrentValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fSelected(NString pOptionValue,List<Twbklibs.Varchar2TabtypeRow> pCurrentValues) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_SELECTED", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_OPTION_VALUE", pOptionValue);
//			// cmd.addParameter(DbTypes.getTableType("P_CURRENT_VALUES", "", pCurrentValues, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString fTexttoanchor(NString inText,NString inWord,NString inAnchor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_TEXTTOANCHOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_TEXT", inText);
			cmd.addParameter("@IN_WORD", inWord);
			cmd.addParameter("@IN_ANCHOR", inAnchor);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateParameter(NString pParm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_VALIDATE_PARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PARM", pParm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fValidjobsseqno(NNumber inPidm,NString inJobsseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_VALIDJOBSSEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IN_PIDM", inPidm);
			cmd.addParameter("@IN_JOBSSEQNO", inJobsseqno);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fWrapText(NString strIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.F_WRAP_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STR_IN", strIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCenterclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_CENTERCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCenterlinks(NString inLink) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_CENTERLINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_LINK", inLink);
				
			cmd.execute();


		}
		
		public static void pCenteropen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_CENTEROPEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeleteMultiParam(NNumber pPidm,NString pLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_DELETE_MULTI_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LABEL", pLabel);
				
			cmd.execute();


		}
		
		public static void pDeleteParam(NNumber pPidm,NString pLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_DELETE_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LABEL", pLabel);
				
			cmd.execute();


		}
		
		public static void pDispBackAnchor() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_DISP_BACK_ANCHOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispCodeLookup(NString pObjnm,NNumber pObjno,NString pObjtab,NDate pEffdt,NString pSrch,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_DISP_CODE_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJNM", pObjnm);
			cmd.addParameter("@P_OBJNO", pObjno);
			cmd.addParameter("@P_OBJTAB", pObjtab);
			cmd.addParameter("@P_EFFDT", pEffdt);
			cmd.addParameter("@P_SRCH", pSrch);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();


		}
		
		public static void pDispGotobottomAnchor() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_DISP_GOTOBOTTOM_ANCHOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispGototopAnchor() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_DISP_GOTOTOP_ANCHOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispfuncnotallowed(NString inUrl,NString inLink) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_DISPFUNCNOTALLOWED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_URL", inUrl);
			cmd.addParameter("@IN_LINK", inLink);
				
			cmd.execute();


		}
		
		public static void pDisplayerrors() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_DISPLAYERRORS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispmessages(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_DISPMESSAGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pGenselectmonths(NString inVarName,NNumber inFromMonth,NNumber inThruMonth,NNumber inSelMonth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_GENSELECTMONTHS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_VAR_NAME", inVarName);
			cmd.addParameter("@IN_FROM_MONTH", inFromMonth);
			cmd.addParameter("@IN_THRU_MONTH", inThruMonth);
			cmd.addParameter("@IN_SEL_MONTH", inSelMonth);
				
			cmd.execute();


		}
		
		public static void pGenselectyears(NString inVarName,NNumber inFromYear,NNumber inThruYear,NNumber inSelYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_GENSELECTYEARS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_VAR_NAME", inVarName);
			cmd.addParameter("@IN_FROM_YEAR", inFromYear);
			cmd.addParameter("@IN_THRU_YEAR", inThruYear);
			cmd.addParameter("@IN_SEL_YEAR", inSelYear);
				
			cmd.execute();


		}
		
		public static void pInputFoapal(NString pPagefield,NString pLen,NString pMaxlen,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_INPUT_FOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAGEFIELD", pPagefield);
			cmd.addParameter("@P_LEN", pLen);
			cmd.addParameter("@P_MAXLEN", pMaxlen);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void pLaunchFlex() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_LAUNCH_FLEX", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pLookupSalaryGroup(NString pLovName,NString pSalGroup,NString pSalTable,NString pSalGrade,NString pSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_LOOKUP_SALARY_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOV_NAME", pLovName);
			cmd.addParameter("@P_SAL_GROUP", pSalGroup);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SRCH", pSrch);
				
			cmd.execute();


		}
		
		public static void pPrintApiErrors() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_PRINT_API_ERRORS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintExitWindowLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_PRINT_EXIT_WINDOW_LINK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintJobList(NNumber pEmpPidm,NDate pQueryDate,NString pInclTermInd,NString pLinkText,NString pLinkProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_PRINT_JOB_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
			cmd.addParameter("@P_INCL_TERM_IND", pInclTermInd);
			cmd.addParameter("@P_LINK_TEXT", pLinkText);
			cmd.addParameter("@P_LINK_PROC_NAME", pLinkProcName);
				
			cmd.execute();


		}
		
		public static void pPrintLookupImage(NString pImagename,NString pUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_PRINT_LOOKUP_IMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_IMAGENAME", pImagename);
			cmd.addParameter("@P_URL", pUrl);
				
			cmd.execute();


		}
		
		public static void pReadonlyFoapal(NString pPagefield,NNumber pRecno,NString pLen,NString pMaxlen,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_READONLY_FOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAGEFIELD", pPagefield);
			cmd.addParameter("@P_RECNO", pRecno);
			cmd.addParameter("@P_LEN", pLen);
			cmd.addParameter("@P_MAXLEN", pMaxlen);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void pStartupMask(NString pFormName,NString pBlockName,NString pItemName,NString pUser,NString pData,NString pItemLabel,NNumber pItemLength,NString pPrintFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_STARTUP_MASK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_ITEM_NAME", pItemName);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_ITEM_LENGTH", pItemLength);
			cmd.addParameter("@P_PRINT_FORMAT", pPrintFormat);
				
			cmd.execute();


		}
		
		public static void pValidateNumericValue(NString pValue,NString pFormat,NString pFieldDesc,NNumber pMaxValue,Ref<NString> pMsgTypeOut,Ref<NString> pMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOLIB.P_VALIDATE_NUMERIC_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_FORMAT", pFormat);
			cmd.addParameter("@P_FIELD_DESC", pFieldDesc);
			cmd.addParameter("@P_MAX_VALUE", pMaxValue);
			cmd.addParameter("@P_MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@P_MSG_OUT", NString.class);
				
			cmd.execute();
			pMsgTypeOut.val = cmd.getParameterValue("@P_MSG_TYPE_OUT", NString.class);
			pMsgOut.val = cmd.getParameterValue("@P_MSG_OUT", NString.class);


		}
		
	
	
	
}
