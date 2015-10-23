package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkeput {
		public static NNumber fApprLevelFieldLen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_APPR_LEVEL_FIELD_LEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fDecodeAddrteleStatus(NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_DECODE_ADDRTELE_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDecodeRoutAction(NString pRoutStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_DECODE_ROUT_ACTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROUT_STR", pRoutStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispAsummaryLink(NString pViewType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_DISP_ASUMMARY_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VIEW_TYPE", pViewType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispDefaultroutingLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_DISP_DEFAULTROUTING_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispEpafdetlLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_DISP_EPAFDETL_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispNewepafLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_DISP_NEWEPAF_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispOsummaryLink(NString pViewType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_DISP_OSUMMARY_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VIEW_TYPE", pViewType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispPersrchLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_DISP_PERSRCH_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispProxyLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_DISP_PROXY_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispTranssrchLink(NString pUrlname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_DISP_TRANSSRCH_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URLNAME", pUrlname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCodeDesc(NString pCodeName,NString pCodeValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_GET_CODE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE_NAME", pCodeName);
			cmd.addParameter("@P_CODE_VALUE", pCodeValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fJumpLink(NString pAnchorName,NString pUrlStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_JUMP_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ANCHOR_NAME", pAnchorName);
			cmd.addParameter("@P_URL_STR", pUrlStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLookupUrl(NString pPgfieldName,NString pPgfieldNo,NString pTabnm,NDate pEffdt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_LOOKUP_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PGFIELD_NAME", pPgfieldName);
			cmd.addParameter("@P_PGFIELD_NO", pPgfieldNo);
			cmd.addParameter("@P_TABNM", pTabnm);
			cmd.addParameter("@P_EFFDT", pEffdt);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNxtenableEarnfield(NString pPagefield) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_NXTENABLE_EARNFIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PAGEFIELD", pPagefield);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fParseRoutAlvl(NString pRoutStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.F_PARSE_ROUT_ALVL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROUT_STR", pRoutStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddRemoveOption(NString pVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.P_ADD_REMOVE_OPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VAL", pVal);
				
			cmd.execute();


		}
		
		public static void pDispAddrowsBtn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.P_DISP_ADDROWS_BTN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispComments(NNumber pTrans,NString pTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.P_DISP_COMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS", pTrans);
			cmd.addParameter("@P_TITLE", pTitle);
				
			cmd.execute();


		}
		
		public static void pEpafmenuLink() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.P_EPAFMENU_LINK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPopInactiveList(NString pSelectedVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.P_POP_INACTIVE_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SELECTED_VAL", pSelectedVal);
				
			cmd.execute();


		}
		
		public static void pPopYesnoList(NString pSelectedVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.P_POP_YESNO_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SELECTED_VAL", pSelectedVal);
				
			cmd.execute();


		}
		
		public static void pPrintEmpInfo(NNumber pPidm,NNumber pEmpPidm,NNumber pTransNo,NString pTransStat,NString pAcat,NString pPosn,NString pSuff,NDate pQueryDt,NString pFormatfont,NString pFormatlbl,NString pEmpId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.P_PRINT_EMP_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_TRANS_STAT", pTransStat);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_QUERY_DT", pQueryDt);
			cmd.addParameter("@P_FORMATFONT", pFormatfont);
			cmd.addParameter("@P_FORMATLBL", pFormatlbl);
			cmd.addParameter("@P_EMP_ID", pEmpId);
				
			cmd.execute();


		}
		
		public static void pPrintLinks(NNumber pTransNo,NString pAcat,NString pUpdtAllow,NNumber pEpafPageErrors) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.P_PRINT_LINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_UPDT_ALLOW", pUpdtAllow);
			cmd.addParameter("@P_EPAF_PAGE_ERRORS", pEpafPageErrors);
				
			cmd.execute();


		}
		
		public static void pPrintNoreaer(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.P_PRINT_NOREAER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pPrintTransHist(NNumber pTrans) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPUT.P_PRINT_TRANS_HIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS", pTrans);
				
			cmd.execute();


		}
		
	
	
	
}
