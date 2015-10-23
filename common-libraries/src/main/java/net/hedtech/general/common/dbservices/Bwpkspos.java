package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkspos {
		public static void csv(NString buttonselected,NString pExtract,NString pScenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
				
			cmd.execute();


		}
		
		public static NNumber fCalcChgamtMass(NNumber baseAmt,NNumber chgAmt,NNumber chgPct,NNumber rndFactor,NString prorateMethod,NNumber prorateFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.F_CALC_CHGAMT_MASS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BASE_AMT", baseAmt);
			cmd.addParameter("@CHG_AMT", chgAmt);
			cmd.addParameter("@CHG_PCT", chgPct);
			cmd.addParameter("@RND_FACTOR", rndFactor);
			cmd.addParameter("@PRORATE_METHOD", prorateMethod);
			cmd.addParameter("@PRORATE_FACTOR", prorateFactor);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcChgpctMass(NNumber baseAmt,NNumber chgAmt,NNumber chgPct,NNumber rndFactor,NString prorateMethod,NNumber prorateFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.F_CALC_CHGPCT_MASS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BASE_AMT", baseAmt);
			cmd.addParameter("@CHG_AMT", chgAmt);
			cmd.addParameter("@CHG_PCT", chgPct);
			cmd.addParameter("@RND_FACTOR", rndFactor);
			cmd.addParameter("@PRORATE_METHOD", prorateMethod);
			cmd.addParameter("@PRORATE_FACTOR", prorateFactor);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcProposedamtMass(NNumber baseAmt,NNumber chgAmt,NNumber chgPct,NNumber rndFactor,NString prorateMethod,NNumber prorateFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.F_CALC_PROPOSEDAMT_MASS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BASE_AMT", baseAmt);
			cmd.addParameter("@CHG_AMT", chgAmt);
			cmd.addParameter("@CHG_PCT", chgPct);
			cmd.addParameter("@RND_FACTOR", rndFactor);
			cmd.addParameter("@PRORATE_METHOD", prorateMethod);
			cmd.addParameter("@PRORATE_FACTOR", prorateFactor);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcSingleChgamt(NNumber baseAmt,NNumber chgAmt,NNumber chgPct,NNumber rndFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.F_CALC_SINGLE_CHGAMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BASE_AMT", baseAmt);
			cmd.addParameter("@CHG_AMT", chgAmt);
			cmd.addParameter("@CHG_PCT", chgPct);
			cmd.addParameter("@RND_FACTOR", rndFactor);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcSingleChgpct(NNumber baseAmt,NNumber chgAmt,NNumber chgPct,NNumber rndFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.F_CALC_SINGLE_CHGPCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BASE_AMT", baseAmt);
			cmd.addParameter("@CHG_AMT", chgAmt);
			cmd.addParameter("@CHG_PCT", chgPct);
			cmd.addParameter("@RND_FACTOR", rndFactor);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcSingleProposedamt(NNumber baseAmt,NNumber chgAmt,NNumber chgPct,NNumber rndFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.F_CALC_SINGLE_PROPOSEDAMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BASE_AMT", baseAmt);
			cmd.addParameter("@CHG_AMT", chgAmt);
			cmd.addParameter("@CHG_PCT", chgPct);
			cmd.addParameter("@RND_FACTOR", rndFactor);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCheckOrgnSplit(NNumber pPidm,NString pExtract,NString pScenario,NNumber pNxtpageRecNo,NString pOrgn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.F_CHECK_ORGN_SPLIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_NXTPAGE_REC_NO", pNxtpageRecNo);
			cmd.addParameter("@P_ORGN", pOrgn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSetEndRecsCount(NNumber pStartRecs,NNumber pHowMany,NNumber pTotalRecs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.F_SET_END_RECS_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_START_RECS", pStartRecs);
			cmd.addParameter("@P_HOW_MANY", pHowMany);
			cmd.addParameter("@P_TOTAL_RECS", pTotalRecs);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSetStartRecsCount(NNumber pStartRecs,NNumber pHowMany) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.F_SET_START_RECS_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_START_RECS", pStartRecs);
			cmd.addParameter("@P_HOW_MANY", pHowMany);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pDisplockedorgns(NString pExtract,NString pScenario,NString pFilterType,NString pCoas,NString pAsofDt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.P_DISPLOCKEDORGNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_FILTER_TYPE", pFilterType);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_ASOF_DT", pAsofDt);
				
			cmd.execute();


		}
		
		public static void pDisporgnswoutdata(NString pExtract,NString pScenario,NString pFilterType,NString pCoas,NString pAsofDt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.P_DISPORGNSWOUTDATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_FILTER_TYPE", pFilterType);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_ASOF_DT", pAsofDt);
				
			cmd.execute();


		}
		
		public static void pDispposncomments(NString extractId,NString scenario,NString posfSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.P_DISPPOSNCOMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT_ID", extractId);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@POSF_SEQNO", posfSeqno);
				
			cmd.execute();


		}
		
		public static void pListbyposition(NString spexCode,NString scenarioNm,NString startNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.P_LISTBYPOSITION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SPEX_CODE", spexCode);
			cmd.addParameter("@SCENARIO_NM", scenarioNm);
			cmd.addParameter("@START_NO", startNo);
				
			cmd.execute();


		}
		
		public static void pMassapplyposnlist(NString extractId,NString scenario,NNumber massChgamt,NNumber massChgpct,NNumber roundFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.P_MASSAPPLYPOSNLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT_ID", extractId);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@MASS_CHGAMT", massChgamt);
			cmd.addParameter("@MASS_CHGPCT", massChgpct);
			cmd.addParameter("@ROUND_FACTOR", roundFactor);
				
			cmd.execute();


		}
		
		public static void pModifyposndetl(NString extract,NString scenario,NString seqno,NString maxseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.P_MODIFYPOSNDETL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@MAXSEQNO", maxseqno);
				
			cmd.execute();


		}
		
		public static void pPrintorgnswoutdatalink(NNumber pPidm,NString pExtract,NString pScenario,NString pCoasCode,NString pAsofDate,NString pFilterType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.P_PRINTORGNSWOUTDATALINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
			cmd.addParameter("@P_FILTER_TYPE", pFilterType);
				
			cmd.execute();


		}
		
		public static void pUpdateposncomments(NString extractId,NString scenario,NString posfSeqno,NString comments,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.P_UPDATEPOSNCOMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT_ID", extractId);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@POSF_SEQNO", posfSeqno);
			cmd.addParameter("@COMMENTS", comments);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pUpdateposndetl(NString extract,NString scenario,NString buttonselected,NString detlChgamt,NString detlChgpct,NString roundFactor,NString fyPropbudg,NString fyBasebudg,NString posnNewfte,NString posnBasefte,NString posnBaseappt,NString posnExclind,NString posnHideind,NString seqno,NString maxseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.P_UPDATEPOSNDETL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@DETL_CHGAMT", detlChgamt);
			cmd.addParameter("@DETL_CHGPCT", detlChgpct);
			cmd.addParameter("@ROUND_FACTOR", roundFactor);
			cmd.addParameter("@FY_PROPBUDG", fyPropbudg);
			cmd.addParameter("@FY_BASEBUDG", fyBasebudg);
			cmd.addParameter("@POSN_NEWFTE", posnNewfte);
			cmd.addParameter("@POSN_BASEFTE", posnBasefte);
			cmd.addParameter("@POSN_BASEAPPT", posnBaseappt);
			cmd.addParameter("@POSN_EXCLIND", posnExclind);
			cmd.addParameter("@POSN_HIDEIND", posnHideind);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@MAXSEQNO", maxseqno);
				
			cmd.execute();


		}
		
//		public static void pUpdateposnlist(NString extractId,NString scenario,NString buttonselected,NString massChgamt,NString massChgpct,NString roundFactor,List<Twbklibs.Varchar2TabtypeRow> borgn,List<Twbklibs.Varchar2TabtypeRow> posn,List<Twbklibs.Varchar2TabtypeRow> loadedVal,List<Twbklibs.Varchar2TabtypeRow> chgpct,List<Twbklibs.Varchar2TabtypeRow> chgamt,List<Twbklibs.Varchar2TabtypeRow> newamt,List<Twbklibs.Varchar2TabtypeRow> newfte,List<Twbklibs.Varchar2TabtypeRow> exclind,List<Twbklibs.Varchar2TabtypeRow> hideind,NString curchkboxStr,NString startNo,NString endNo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSPOS.P_UPDATEPOSNLIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@EXTRACT_ID", extractId);
//			cmd.addParameter("@SCENARIO", scenario);
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//			cmd.addParameter("@MASS_CHGAMT", massChgamt);
//			cmd.addParameter("@MASS_CHGPCT", massChgpct);
//			cmd.addParameter("@ROUND_FACTOR", roundFactor);
//			// cmd.addParameter(DbTypes.getTableType("BORGN", "", borgn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("POSN", "", posn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LOADED_VAL", "", loadedVal, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CHGPCT", "", chgpct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CHGAMT", "", chgamt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("NEWAMT", "", newamt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("NEWFTE", "", newfte, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EXCLIND", "", exclind, object.class));
//			// cmd.addParameter(DbTypes.getTableType("HIDEIND", "", hideind, object.class));
//			cmd.addParameter("@CURCHKBOX_STR", curchkboxStr);
//			cmd.addParameter("@START_NO", startNo);
//			cmd.addParameter("@END_NO", endNo);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
