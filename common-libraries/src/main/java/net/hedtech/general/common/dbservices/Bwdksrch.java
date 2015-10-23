package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdksrch {
		public static void pBuildCustomSearch(NString srchName,NString srchTitle,NString activeInd,NString prospectOnlyInd,NString inclType,NNumber recsPerPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKSRCH.P_BUILD_CUSTOM_SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_NAME", srchName);
			cmd.addParameter("@SRCH_TITLE", srchTitle);
			cmd.addParameter("@ACTIVE_IND", activeInd);
			cmd.addParameter("@PROSPECT_ONLY_IND", prospectOnlyInd);
			cmd.addParameter("@INCL_TYPE", inclType);
			cmd.addParameter("@RECS_PER_PAGE", recsPerPage);
				
			cmd.execute();


		}
		
		public static void pDeleteCustomSearch(NString srchName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKSRCH.P_DELETE_CUSTOM_SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_NAME", srchName);
				
			cmd.execute();


		}
		
		public static void pDisplayCustomSearches() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKSRCH.P_DISPLAY_CUSTOM_SEARCHES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisplaySearchResults(NString moreBtn,NNumber nextSetStart,NNumber prevSetStart,NNumber backStartRecords,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKSRCH.P_DISPLAY_SEARCH_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MORE_BTN", moreBtn);
			cmd.addParameter("@NEXT_SET_START", nextSetStart);
			cmd.addParameter("@PREV_SET_START", prevSetStart);
			cmd.addParameter("@BACK_START_RECORDS", backStartRecords);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
//		public static void pExecuteCustomSearch(NString prospectOnlyInd,NString srchName,NString consId,NString firstName,NString middleName,NString surnamePrefix,NString lastName,NString soundexInd,List<Bwdklibs.Varchar2TabtypeRow> statCode,NString zipCodeFrom,NString zipCodeTo,List<Bwdklibs.Varchar2TabtypeRow> natnCode,NString degreeYr1,NString degreeYr2,NString degreeYr3,NString degreeColl1,NString degreeColl2,NString degreeColl3,NString majorCode1,NString majorCode2,NString majorCode3,List<Bwdklibs.Varchar2TabtypeRow> sbgiCode,List<Bwdklibs.Varchar2TabtypeRow> classYr,List<Bwdklibs.Varchar2TabtypeRow> collCode,List<Bwdklibs.Varchar2TabtypeRow> donrCode,List<Bwdklibs.Varchar2TabtypeRow> jobcCode,List<Bwdklibs.Varchar2TabtypeRow> incmCode,NString actyTypeCode1,NString actyTypeCode2,NString actyTypeCode3,NString actyCatgCode1,NString actyCatgCode2,NString actyCatgCode3,List<Bwdklibs.Varchar2TabtypeRow> actcCode,NString prtpCode1,NString prtpCode2,NString prtpCode3,NString prcdCode1,NString prcdCode2,NString prcdCode3,List<Bwdklibs.Varchar2TabtypeRow> vipcCode,List<Bwdklibs.Varchar2TabtypeRow> georCode,List<Bwdklibs.Varchar2TabtypeRow> geodCode,List<Bwdklibs.Varchar2TabtypeRow> stafPidm,List<Bwdklibs.Varchar2TabtypeRow> stafIden,List<Bwdklibs.Varchar2TabtypeRow> prstCode,List<Bwdklibs.Varchar2TabtypeRow> rateCode,List<Bwdklibs.Varchar2TabtypeRow> projCode,List<Bwdklibs.Varchar2TabtypeRow> membCode,List<Bwdklibs.Varchar2TabtypeRow> membType,NString hardCrdFrom,NString hardCrdTo,NString memoCrdFrom,NString memoCrdTo,NString totCredFrom,NString totCredTo,NString persOrgInd,NNumber recsPerPage,NString passMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKSRCH.P_EXECUTE_CUSTOM_SEARCH", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PROSPECT_ONLY_IND", prospectOnlyInd);
//			cmd.addParameter("@SRCH_NAME", srchName);
//			cmd.addParameter("@CONS_ID", consId);
//			cmd.addParameter("@FIRST_NAME", firstName);
//			cmd.addParameter("@MIDDLE_NAME", middleName);
//			cmd.addParameter("@SURNAME_PREFIX", surnamePrefix);
//			cmd.addParameter("@LAST_NAME", lastName);
//			cmd.addParameter("@SOUNDEX_IND", soundexInd);
//			// cmd.addParameter(DbTypes.getTableType("STAT_CODE", "", statCode, object.class));
//			cmd.addParameter("@ZIP_CODE_FROM", zipCodeFrom);
//			cmd.addParameter("@ZIP_CODE_TO", zipCodeTo);
//			// cmd.addParameter(DbTypes.getTableType("NATN_CODE", "", natnCode, object.class));
//			cmd.addParameter("@DEGREE_YR1", degreeYr1);
//			cmd.addParameter("@DEGREE_YR2", degreeYr2);
//			cmd.addParameter("@DEGREE_YR3", degreeYr3);
//			cmd.addParameter("@DEGREE_COLL1", degreeColl1);
//			cmd.addParameter("@DEGREE_COLL2", degreeColl2);
//			cmd.addParameter("@DEGREE_COLL3", degreeColl3);
//			cmd.addParameter("@MAJOR_CODE1", majorCode1);
//			cmd.addParameter("@MAJOR_CODE2", majorCode2);
//			cmd.addParameter("@MAJOR_CODE3", majorCode3);
//			// cmd.addParameter(DbTypes.getTableType("SBGI_CODE", "", sbgiCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CLASS_YR", "", classYr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COLL_CODE", "", collCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DONR_CODE", "", donrCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("JOBC_CODE", "", jobcCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("INCM_CODE", "", incmCode, object.class));
//			cmd.addParameter("@ACTY_TYPE_CODE1", actyTypeCode1);
//			cmd.addParameter("@ACTY_TYPE_CODE2", actyTypeCode2);
//			cmd.addParameter("@ACTY_TYPE_CODE3", actyTypeCode3);
//			cmd.addParameter("@ACTY_CATG_CODE1", actyCatgCode1);
//			cmd.addParameter("@ACTY_CATG_CODE2", actyCatgCode2);
//			cmd.addParameter("@ACTY_CATG_CODE3", actyCatgCode3);
//			// cmd.addParameter(DbTypes.getTableType("ACTC_CODE", "", actcCode, object.class));
//			cmd.addParameter("@PRTP_CODE1", prtpCode1);
//			cmd.addParameter("@PRTP_CODE2", prtpCode2);
//			cmd.addParameter("@PRTP_CODE3", prtpCode3);
//			cmd.addParameter("@PRCD_CODE1", prcdCode1);
//			cmd.addParameter("@PRCD_CODE2", prcdCode2);
//			cmd.addParameter("@PRCD_CODE3", prcdCode3);
//			// cmd.addParameter(DbTypes.getTableType("VIPC_CODE", "", vipcCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GEOR_CODE", "", georCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GEOD_CODE", "", geodCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STAF_PIDM", "", stafPidm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STAF_IDEN", "", stafIden, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PRST_CODE", "", prstCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RATE_CODE", "", rateCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PROJ_CODE", "", projCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MEMB_CODE", "", membCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MEMB_TYPE", "", membType, object.class));
//			cmd.addParameter("@HARD_CRD_FROM", hardCrdFrom);
//			cmd.addParameter("@HARD_CRD_TO", hardCrdTo);
//			cmd.addParameter("@MEMO_CRD_FROM", memoCrdFrom);
//			cmd.addParameter("@MEMO_CRD_TO", memoCrdTo);
//			cmd.addParameter("@TOT_CRED_FROM", totCredFrom);
//			cmd.addParameter("@TOT_CRED_TO", totCredTo);
//			cmd.addParameter("@PERS_ORG_IND", persOrgInd);
//			cmd.addParameter("@RECS_PER_PAGE", recsPerPage);
//			cmd.addParameter("@PASS_MSG", passMsg);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pGetCustomSearch(NString srchName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKSRCH.P_GET_CUSTOM_SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_NAME", srchName);
				
			cmd.execute();


		}
		
		public static void pInputCustomSearch(NString srchName,NString srchTitle,NString activeInd,NString prospectOnlyInd,NString inclType,NString recsPerPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKSRCH.P_INPUT_CUSTOM_SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_NAME", srchName);
			cmd.addParameter("@SRCH_TITLE", srchTitle);
			cmd.addParameter("@ACTIVE_IND", activeInd);
			cmd.addParameter("@PROSPECT_ONLY_IND", prospectOnlyInd);
			cmd.addParameter("@INCL_TYPE", inclType);
			cmd.addParameter("@RECS_PER_PAGE", recsPerPage);
				
			cmd.execute();


		}
		
		public static void pSearchSelect(NString srchName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKSRCH.P_SEARCH_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_NAME", srchName);
				
			cmd.execute();


		}
		
		public static void pUpdateCustomSearch(NString srchName,NString srchTitle,NString activeInd,NString prospectOnlyInd,NString inclType,NString recsPerPage,NString dispInd1,NNumber seqNo1,NString dosrCode1,NString dispInd2,NNumber seqNo2,NString dosrCode2,NString dispInd3,NNumber seqNo3,NString dosrCode3,NString dispInd4,NNumber seqNo4,NString dosrCode4,NString dispInd5,NNumber seqNo5,NString dosrCode5,NString dispInd6,NNumber seqNo6,NString dosrCode6,NString dispInd7,NNumber seqNo7,NString dosrCode7,NString dispInd8,NNumber seqNo8,NString dosrCode8,NString dispInd9,NNumber seqNo9,NString dosrCode9,NString dispInd10,NNumber seqNo10,NString dosrCode10,NString dispInd11,NNumber seqNo11,NString dosrCode11,NString dispInd12,NNumber seqNo12,NString dosrCode12,NString dispInd13,NNumber seqNo13,NString dosrCode13,NString dispInd14,NNumber seqNo14,NString dosrCode14,NString dispInd15,NNumber seqNo15,NString dosrCode15,NString dispInd16,NNumber seqNo16,NString dosrCode16,NString dispInd17,NNumber seqNo17,NString dosrCode17,NString dispInd18,NNumber seqNo18,NString dosrCode18,NString dispInd19,NNumber seqNo19,NString dosrCode19,NString dispInd20,NNumber seqNo20,NString dosrCode20,NString dispInd21,NNumber seqNo21,NString dosrCode21,NString dispInd22,NNumber seqNo22,NString dosrCode22,NString dispInd23,NNumber seqNo23,NString dosrCode23,NString dispInd24,NNumber seqNo24,NString dosrCode24,NString dispInd25,NNumber seqNo25,NString dosrCode25,NString dispInd26,NNumber seqNo26,NString dosrCode26,NString dispInd27,NNumber seqNo27,NString dosrCode27,NString dispInd28,NNumber seqNo28,NString dosrCode28,NString dispInd29,NNumber seqNo29,NString dosrCode29,NString dispInd30,NNumber seqNo30,NString dosrCode30) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKSRCH.P_UPDATE_CUSTOM_SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_NAME", srchName);
			cmd.addParameter("@SRCH_TITLE", srchTitle);
			cmd.addParameter("@ACTIVE_IND", activeInd);
			cmd.addParameter("@PROSPECT_ONLY_IND", prospectOnlyInd);
			cmd.addParameter("@INCL_TYPE", inclType);
			cmd.addParameter("@RECS_PER_PAGE", recsPerPage);
			cmd.addParameter("@DISP_IND1", dispInd1);
			cmd.addParameter("@SEQ_NO1", seqNo1);
			cmd.addParameter("@DOSR_CODE1", dosrCode1);
			cmd.addParameter("@DISP_IND2", dispInd2);
			cmd.addParameter("@SEQ_NO2", seqNo2);
			cmd.addParameter("@DOSR_CODE2", dosrCode2);
			cmd.addParameter("@DISP_IND3", dispInd3);
			cmd.addParameter("@SEQ_NO3", seqNo3);
			cmd.addParameter("@DOSR_CODE3", dosrCode3);
			cmd.addParameter("@DISP_IND4", dispInd4);
			cmd.addParameter("@SEQ_NO4", seqNo4);
			cmd.addParameter("@DOSR_CODE4", dosrCode4);
			cmd.addParameter("@DISP_IND5", dispInd5);
			cmd.addParameter("@SEQ_NO5", seqNo5);
			cmd.addParameter("@DOSR_CODE5", dosrCode5);
			cmd.addParameter("@DISP_IND6", dispInd6);
			cmd.addParameter("@SEQ_NO6", seqNo6);
			cmd.addParameter("@DOSR_CODE6", dosrCode6);
			cmd.addParameter("@DISP_IND7", dispInd7);
			cmd.addParameter("@SEQ_NO7", seqNo7);
			cmd.addParameter("@DOSR_CODE7", dosrCode7);
			cmd.addParameter("@DISP_IND8", dispInd8);
			cmd.addParameter("@SEQ_NO8", seqNo8);
			cmd.addParameter("@DOSR_CODE8", dosrCode8);
			cmd.addParameter("@DISP_IND9", dispInd9);
			cmd.addParameter("@SEQ_NO9", seqNo9);
			cmd.addParameter("@DOSR_CODE9", dosrCode9);
			cmd.addParameter("@DISP_IND10", dispInd10);
			cmd.addParameter("@SEQ_NO10", seqNo10);
			cmd.addParameter("@DOSR_CODE10", dosrCode10);
			cmd.addParameter("@DISP_IND11", dispInd11);
			cmd.addParameter("@SEQ_NO11", seqNo11);
			cmd.addParameter("@DOSR_CODE11", dosrCode11);
			cmd.addParameter("@DISP_IND12", dispInd12);
			cmd.addParameter("@SEQ_NO12", seqNo12);
			cmd.addParameter("@DOSR_CODE12", dosrCode12);
			cmd.addParameter("@DISP_IND13", dispInd13);
			cmd.addParameter("@SEQ_NO13", seqNo13);
			cmd.addParameter("@DOSR_CODE13", dosrCode13);
			cmd.addParameter("@DISP_IND14", dispInd14);
			cmd.addParameter("@SEQ_NO14", seqNo14);
			cmd.addParameter("@DOSR_CODE14", dosrCode14);
			cmd.addParameter("@DISP_IND15", dispInd15);
			cmd.addParameter("@SEQ_NO15", seqNo15);
			cmd.addParameter("@DOSR_CODE15", dosrCode15);
			cmd.addParameter("@DISP_IND16", dispInd16);
			cmd.addParameter("@SEQ_NO16", seqNo16);
			cmd.addParameter("@DOSR_CODE16", dosrCode16);
			cmd.addParameter("@DISP_IND17", dispInd17);
			cmd.addParameter("@SEQ_NO17", seqNo17);
			cmd.addParameter("@DOSR_CODE17", dosrCode17);
			cmd.addParameter("@DISP_IND18", dispInd18);
			cmd.addParameter("@SEQ_NO18", seqNo18);
			cmd.addParameter("@DOSR_CODE18", dosrCode18);
			cmd.addParameter("@DISP_IND19", dispInd19);
			cmd.addParameter("@SEQ_NO19", seqNo19);
			cmd.addParameter("@DOSR_CODE19", dosrCode19);
			cmd.addParameter("@DISP_IND20", dispInd20);
			cmd.addParameter("@SEQ_NO20", seqNo20);
			cmd.addParameter("@DOSR_CODE20", dosrCode20);
			cmd.addParameter("@DISP_IND21", dispInd21);
			cmd.addParameter("@SEQ_NO21", seqNo21);
			cmd.addParameter("@DOSR_CODE21", dosrCode21);
			cmd.addParameter("@DISP_IND22", dispInd22);
			cmd.addParameter("@SEQ_NO22", seqNo22);
			cmd.addParameter("@DOSR_CODE22", dosrCode22);
			cmd.addParameter("@DISP_IND23", dispInd23);
			cmd.addParameter("@SEQ_NO23", seqNo23);
			cmd.addParameter("@DOSR_CODE23", dosrCode23);
			cmd.addParameter("@DISP_IND24", dispInd24);
			cmd.addParameter("@SEQ_NO24", seqNo24);
			cmd.addParameter("@DOSR_CODE24", dosrCode24);
			cmd.addParameter("@DISP_IND25", dispInd25);
			cmd.addParameter("@SEQ_NO25", seqNo25);
			cmd.addParameter("@DOSR_CODE25", dosrCode25);
			cmd.addParameter("@DISP_IND26", dispInd26);
			cmd.addParameter("@SEQ_NO26", seqNo26);
			cmd.addParameter("@DOSR_CODE26", dosrCode26);
			cmd.addParameter("@DISP_IND27", dispInd27);
			cmd.addParameter("@SEQ_NO27", seqNo27);
			cmd.addParameter("@DOSR_CODE27", dosrCode27);
			cmd.addParameter("@DISP_IND28", dispInd28);
			cmd.addParameter("@SEQ_NO28", seqNo28);
			cmd.addParameter("@DOSR_CODE28", dosrCode28);
			cmd.addParameter("@DISP_IND29", dispInd29);
			cmd.addParameter("@SEQ_NO29", seqNo29);
			cmd.addParameter("@DOSR_CODE29", dosrCode29);
			cmd.addParameter("@DISP_IND30", dispInd30);
			cmd.addParameter("@SEQ_NO30", seqNo30);
			cmd.addParameter("@DOSR_CODE30", dosrCode30);
				
			cmd.execute();


		}
		
	
	
	
}
