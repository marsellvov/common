package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpksala {
		public static NString fConvertIncludeInd(NString includeVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_CONVERT_INCLUDE_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INCLUDE_VAL", includeVal);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispEmplFilterLink(NString extract,NString scenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_DISP_EMPL_FILTER_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispEmpldetlLink(NString extract,NString scenario,NString empfSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_DISP_EMPLDETL_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQNO", empfSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispFilterLink(NString extract,NString scenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_DISP_FILTER_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispJobdetlLink(NString extract,NString scenario,NString empfSeqno,NString jobfSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_DISP_JOBDETL_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQNO", empfSeqno);
			cmd.addParameter("@JOBF_SEQNO", jobfSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispLbeLink(NString extract,NString scenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_DISP_LBE_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispLbpLink(NString extract,NString scenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_DISP_LBP_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispPosndetlLink(NString extract,NString scenario,NString posfSeqno,NString maxPosfSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_DISP_POSNDETL_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@POSF_SEQNO", posfSeqno);
			cmd.addParameter("@MAX_POSF_SEQNO", maxPosfSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispSumtotalsLink(NString extract,NString scenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_DISP_SUMTOTALS_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetPct(NNumber amt1,NNumber amt2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_GET_PCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fInCriteria(NNumber pidm,NString extract,NString scenario,NString lbl,NString val) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_IN_CRITERIA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@LBL", lbl);
			cmd.addParameter("@VAL", val);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRtnCriteriaVal(NNumber pidm,NString extract,NString scenario,NString lbl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_RTN_CRITERIA_VAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@LBL", lbl);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidmasterbudgmgr(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.F_VALIDMASTERBUDGMGR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pChoosecopyscenario(NString extractvalue,NString scenariovalue,NString extract,NString scenario,List<Twbklibs.Varchar2TabtypeRow> orgnselected,NString emptyvalue,NString inclSuborg,NString scenarioTo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_CHOOSECOPYSCENARIO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EXTRACTVALUE", extractvalue);
//			cmd.addParameter("@SCENARIOVALUE", scenariovalue);
//			cmd.addParameter("@EXTRACT", extract);
//			cmd.addParameter("@SCENARIO", scenario);
//			// cmd.addParameter(DbTypes.getTableType("ORGNSELECTED", "", orgnselected, object.class));
//			cmd.addParameter("@EMPTYVALUE", emptyvalue);
//			cmd.addParameter("@INCL_SUBORG", inclSuborg);
//			cmd.addParameter("@SCENARIO_TO", scenarioTo);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pChoosecreatescenario(NString extractId,NString scenario,NString autoUpdPosnInd,NString autoUpdBudDevInd,NString replaceUpdBudDevInd,NString postToBudPoolInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_CHOOSECREATESCENARIO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT_ID", extractId);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@AUTO_UPD_POSN_IND", autoUpdPosnInd);
			cmd.addParameter("@AUTO_UPD_BUD_DEV_IND", autoUpdBudDevInd);
			cmd.addParameter("@REPLACE_UPD_BUD_DEV_IND", replaceUpdBudDevInd);
			cmd.addParameter("@POST_TO_BUD_POOL_IND", postToBudPoolInd);
				
			cmd.execute();


		}
		
		public static void pChooseeditscenario(NString extractvalue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_CHOOSEEDITSCENARIO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACTVALUE", extractvalue);
				
			cmd.execute();


		}
		
//		public static void pCopyscenario(NString extractvalue,NString scenariovalue,NString extract,NString scenario,List<Twbklibs.Varchar2TabtypeRow> orgnselected,NString emptyvalue,NString inclSuborg,NString scenarioTo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_COPYSCENARIO", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EXTRACTVALUE", extractvalue);
//			cmd.addParameter("@SCENARIOVALUE", scenariovalue);
//			cmd.addParameter("@EXTRACT", extract);
//			cmd.addParameter("@SCENARIO", scenario);
//			// cmd.addParameter(DbTypes.getTableType("ORGNSELECTED", "", orgnselected, object.class));
//			cmd.addParameter("@EMPTYVALUE", emptyvalue);
//			cmd.addParameter("@INCL_SUBORG", inclSuborg);
//			cmd.addParameter("@SCENARIO_TO", scenarioTo);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pCopytoscenario(NString extractidselected,NString scenarioselected,NString scenariotoselected,NString orgnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_COPYTOSCENARIO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACTIDSELECTED", extractidselected);
			cmd.addParameter("@SCENARIOSELECTED", scenarioselected);
			cmd.addParameter("@SCENARIOTOSELECTED", scenariotoselected);
			cmd.addParameter("@ORGNSELECTED", orgnselected);
				
			cmd.execute();


		}
		
		public static void pCreatescenario(NString extractId,NString scenario,NString autoUpdPosnInd,NString autoUpdBudDevInd,NString replaceUpdBudDevInd,NString postToBudPoolInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_CREATESCENARIO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT_ID", extractId);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@AUTO_UPD_POSN_IND", autoUpdPosnInd);
			cmd.addParameter("@AUTO_UPD_BUD_DEV_IND", autoUpdBudDevInd);
			cmd.addParameter("@REPLACE_UPD_BUD_DEV_IND", replaceUpdBudDevInd);
			cmd.addParameter("@POST_TO_BUD_POOL_IND", postToBudPoolInd);
				
			cmd.execute();


		}
		
		public static void pDispemployeefilter(NString extract,NString scenario,NString lastName,NString firstName,NString emplId,NString autoUpdPosnInd,NString autoUpdBudDevInd,NString replaceUpdBudDevInd,NString postToBudPoolInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_DISPEMPLOYEEFILTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@AUTO_UPD_POSN_IND", autoUpdPosnInd);
			cmd.addParameter("@AUTO_UPD_BUD_DEV_IND", autoUpdBudDevInd);
			cmd.addParameter("@REPLACE_UPD_BUD_DEV_IND", replaceUpdBudDevInd);
			cmd.addParameter("@POST_TO_BUD_POOL_IND", postToBudPoolInd);
				
			cmd.execute();


		}
		
		public static void pDispfiltersdriver(NString extract,NString scenario,NString filter,NString scriptDis,NString autoUpdPosnInd,NString autoUpdBudDevInd,NString replaceUpdBudDevInd,NString postToBudPoolInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_DISPFILTERSDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@FILTER", filter);
			cmd.addParameter("@SCRIPT_DIS", scriptDis);
			cmd.addParameter("@AUTO_UPD_POSN_IND", autoUpdPosnInd);
			cmd.addParameter("@AUTO_UPD_BUD_DEV_IND", autoUpdBudDevInd);
			cmd.addParameter("@REPLACE_UPD_BUD_DEV_IND", replaceUpdBudDevInd);
			cmd.addParameter("@POST_TO_BUD_POOL_IND", postToBudPoolInd);
				
			cmd.execute();


		}
		
		public static void pDispfinancebuddevlmnu() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_DISPFINANCEBUDDEVLMNU", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispposnfilters(NString extract,NString scenario,NString autoUpdPosnInd,NString autoUpdBudDevInd,NString replaceUpdBudDevInd,NString postToBudPoolInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_DISPPOSNFILTERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@AUTO_UPD_POSN_IND", autoUpdPosnInd);
			cmd.addParameter("@AUTO_UPD_BUD_DEV_IND", autoUpdBudDevInd);
			cmd.addParameter("@REPLACE_UPD_BUD_DEV_IND", replaceUpdBudDevInd);
			cmd.addParameter("@POST_TO_BUD_POOL_IND", postToBudPoolInd);
				
			cmd.execute();


		}
		
		public static void pDispscenariofilter(NNumber pidm,NString extract,NString scenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_DISPSCENARIOFILTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
				
			cmd.execute();


		}
		
		public static void pDispsearchresults(NString extract,NString scenario,NString lastName,NString firstName,NString emplId,NString recNo,NString startNo,NString buttonselected,NString autoUpdPosnInd,NString autoUpdBudDevInd,NString replaceUpdBudDevInd,NString postToBudPoolInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_DISPSEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@START_NO", startNo);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@AUTO_UPD_POSN_IND", autoUpdPosnInd);
			cmd.addParameter("@AUTO_UPD_BUD_DEV_IND", autoUpdBudDevInd);
			cmd.addParameter("@REPLACE_UPD_BUD_DEV_IND", replaceUpdBudDevInd);
			cmd.addParameter("@POST_TO_BUD_POOL_IND", postToBudPoolInd);
				
			cmd.execute();


		}
		
		public static void pGetExtractList(NString userSpAccess,NString mstrInd,NString exeSource,Ref<NNumber> recsCount,Ref<NString> selectedExtract,NString extractvalue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_GET_EXTRACT_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_SP_ACCESS", userSpAccess);
			cmd.addParameter("@MSTR_IND", mstrInd);
			cmd.addParameter("@EXE_SOURCE", exeSource);
			cmd.addParameter("@RECS_COUNT", recsCount, true);
			cmd.addParameter("@SELECTED_EXTRACT", selectedExtract, true);
			cmd.addParameter("@EXTRACTVALUE", extractvalue);
				
			cmd.execute();
			recsCount.val = cmd.getParameterValue("@RECS_COUNT", NNumber.class);
			selectedExtract.val = cmd.getParameterValue("@SELECTED_EXTRACT", NString.class);


		}
		
		public static void pGetScenarioList(NString userSpAccess,NString mstrInd,NString exeSource,NString selectedExtract,Ref<NString> selectedScenario,NString scenariovalue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_GET_SCENARIO_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_SP_ACCESS", userSpAccess);
			cmd.addParameter("@MSTR_IND", mstrInd);
			cmd.addParameter("@EXE_SOURCE", exeSource);
			cmd.addParameter("@SELECTED_EXTRACT", selectedExtract);
			cmd.addParameter("@SELECTED_SCENARIO", selectedScenario, true);
			cmd.addParameter("@SCENARIOVALUE", scenariovalue);
				
			cmd.execute();
			selectedScenario.val = cmd.getParameterValue("@SELECTED_SCENARIO", NString.class);


		}
		
		public static void pGetemployeebyname(NString extract,NString scenario,NString lastName,NString firstName,NString emplId,NString recNo,NString autoUpdPosnInd,NString autoUpdBudDevInd,NString replaceUpdBudDevInd,NString postToBudPoolInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_GETEMPLOYEEBYNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@EMPL_ID", emplId);
			cmd.addParameter("@REC_NO", recNo);
			cmd.addParameter("@AUTO_UPD_POSN_IND", autoUpdPosnInd);
			cmd.addParameter("@AUTO_UPD_BUD_DEV_IND", autoUpdBudDevInd);
			cmd.addParameter("@REPLACE_UPD_BUD_DEV_IND", replaceUpdBudDevInd);
			cmd.addParameter("@POST_TO_BUD_POOL_IND", postToBudPoolInd);
				
			cmd.execute();


		}
		
		public static void pInsEmpfJobfDriver(NNumber pidm,NString userId,NString extract,NString scenario,NString exeSource,NString orgn,NString empSrchStr,NString lname,NString fname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_INS_EMPF_JOBF_DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EXE_SOURCE", exeSource);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@EMP_SRCH_STR", empSrchStr);
			cmd.addParameter("@LNAME", lname);
			cmd.addParameter("@FNAME", fname);
				
			cmd.execute();


		}
		
//		public static void pInsNbtorsf(NNumber pidm,NString userId,NString extract,NString scenario,NString inclSuborg,List<Twbklibs.Varchar2TabtypeRow> orgs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_INS_NBTORSF", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM", pidm);
//			cmd.addParameter("@USER_ID", userId);
//			cmd.addParameter("@EXTRACT", extract);
//			cmd.addParameter("@SCENARIO", scenario);
//			cmd.addParameter("@INCL_SUBORG", inclSuborg);
//			// cmd.addParameter(DbTypes.getTableType("ORGS", "", orgs, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pInsOrsfDriver(NNumber pidm,NString userId,NString extract,NString scenario,NString chkSecr,NString accessType,NString exeSource,NString orgn,NString empSrchStr,NString lname,NString fname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_INS_ORSF_DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@CHK_SECR", chkSecr);
			cmd.addParameter("@ACCESS_TYPE", accessType);
			cmd.addParameter("@EXE_SOURCE", exeSource);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@EMP_SRCH_STR", empSrchStr);
			cmd.addParameter("@LNAME", lname);
			cmd.addParameter("@FNAME", fname);
				
			cmd.execute();


		}
		
		public static void pInsPosfDriver(NNumber pidm,NString userId,NString extract,NString scenario,NString exeSource,NString orgn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_INS_POSF_DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EXE_SOURCE", exeSource);
			cmd.addParameter("@ORGN", orgn);
				
			cmd.execute();


		}
		
		public static void pInsertNbtfprm(NNumber pidm,NString userId,NString extract,NString scenario,NString lbl,NString val) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_INSERT_NBTFPRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@LBL", lbl);
			cmd.addParameter("@VAL", val);
				
			cmd.execute();


		}
		
//		public static void pInsertnbtfprmfromtable(NNumber pidm,NString userId,NString extract,NString scenario,NString lbl,List<Twbklibs.Varchar2TabtypeRow> pTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_INSERTNBTFPRMFROMTABLE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM", pidm);
//			cmd.addParameter("@USER_ID", userId);
//			cmd.addParameter("@EXTRACT", extract);
//			cmd.addParameter("@SCENARIO", scenario);
//			cmd.addParameter("@LBL", lbl);
//			// cmd.addParameter(DbTypes.getTableType("P_TABLE", "", pTable, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pPrintCommonDetailBtns(NNumber pStartRecs,NNumber pEndRecs,NNumber pTotalRecs,NString showSaveBtns) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_PRINT_COMMON_DETAIL_BTNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_START_RECS", pStartRecs);
			cmd.addParameter("@P_END_RECS", pEndRecs);
			cmd.addParameter("@P_TOTAL_RECS", pTotalRecs);
			cmd.addParameter("@SHOW_SAVE_BTNS", showSaveBtns);
				
			cmd.execute();


		}
		
		public static void pPrintPrevNxtBtns(NNumber pStartRecs,NNumber pEndRecs,NNumber pHowMany,NNumber pTotalRecs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_PRINT_PREV_NXT_BTNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_START_RECS", pStartRecs);
			cmd.addParameter("@P_END_RECS", pEndRecs);
			cmd.addParameter("@P_HOW_MANY", pHowMany);
			cmd.addParameter("@P_TOTAL_RECS", pTotalRecs);
				
			cmd.execute();


		}
		
		public static void pPrintcommenttable(Ref<NString> lastUser,NDate lastActDate,NString commentsIn,NString updAccess,NString posnDesc,NString emplPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_PRINTCOMMENTTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LAST_USER", lastUser, true);
			cmd.addParameter("@LAST_ACT_DATE", lastActDate);
			cmd.addParameter("@COMMENTS_IN", commentsIn);
			cmd.addParameter("@UPD_ACCESS", updAccess);
			cmd.addParameter("@POSN_DESC", posnDesc);
			cmd.addParameter("@EMPL_PIDM", emplPidm);
				
			cmd.execute();
			lastUser.val = cmd.getParameterValue("@LAST_USER", NString.class);


		}
		
		public static void pPrintfilter(NString pExtract,NString pScenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_PRINTFILTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
				
			cmd.execute();


		}
		
		public static void pPrintroundingoptions(NString lblTxtCls,NNumber dftRndOpt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_PRINTROUNDINGOPTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LBL_TXT_CLS", lblTxtCls);
			cmd.addParameter("@DFT_RND_OPT", dftRndOpt);
				
			cmd.execute();


		}
		
		public static void pPrinttargetbudgetdevl(NString pExtract,NString pScenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_PRINTTARGETBUDGETDEVL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
				
			cmd.execute();


		}
		
		public static void pUpdateemplfilters(NString extract,NString scenario,NString empfSeq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_UPDATEEMPLFILTERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQ", empfSeq);
				
			cmd.execute();


		}
		
//		public static void pUpdateposnfilters(NString extract,NString scenario,List<Twbklibs.Varchar2TabtypeRow> orgs,NString inclSuborg,List<Twbklibs.Varchar2TabtypeRow> emplClass,List<Twbklibs.Varchar2TabtypeRow> bargUnit,List<Twbklibs.Varchar2TabtypeRow> facRank,NString inclPoolpos,NString inclVacpos,NString recNo,NString buttonselected,NString autoUpdPosnInd,NString autoUpdBudDevInd,NString replaceUpdBudDevInd,NString postToBudPoolInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSALA.P_UPDATEPOSNFILTERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EXTRACT", extract);
//			cmd.addParameter("@SCENARIO", scenario);
//			// cmd.addParameter(DbTypes.getTableType("ORGS", "", orgs, object.class));
//			cmd.addParameter("@INCL_SUBORG", inclSuborg);
//			// cmd.addParameter(DbTypes.getTableType("EMPL_CLASS", "", emplClass, object.class));
//			// cmd.addParameter(DbTypes.getTableType("BARG_UNIT", "", bargUnit, object.class));
//			// cmd.addParameter(DbTypes.getTableType("FAC_RANK", "", facRank, object.class));
//			cmd.addParameter("@INCL_POOLPOS", inclPoolpos);
//			cmd.addParameter("@INCL_VACPOS", inclVacpos);
//			cmd.addParameter("@REC_NO", recNo);
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//			cmd.addParameter("@AUTO_UPD_POSN_IND", autoUpdPosnInd);
//			cmd.addParameter("@AUTO_UPD_BUD_DEV_IND", autoUpdBudDevInd);
//			cmd.addParameter("@REPLACE_UPD_BUD_DEV_IND", replaceUpdBudDevInd);
//			cmd.addParameter("@POST_TO_BUD_POOL_IND", postToBudPoolInd);
//				
//			cmd.execute();
//
//
//		}
//		
	
	
	
}
