package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdkmove {
		public static void pAddAMove(NNumber prosPidm,NString prosId,NString stgyProj,NString idenCode,NString moveCode,NNumber waitDays,NString plannedDate,NString commentText,NString scheduleDatesInd,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_ADD_A_MOVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@PROS_ID", prosId);
			cmd.addParameter("@STGY_PROJ", stgyProj);
			cmd.addParameter("@IDEN_CODE", idenCode);
			cmd.addParameter("@MOVE_CODE", moveCode);
			cmd.addParameter("@WAIT_DAYS", waitDays);
			cmd.addParameter("@PLANNED_DATE", plannedDate);
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@SCHEDULE_DATES_IND", scheduleDatesInd);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pCurrentMoves(NNumber prosPidm,NString prosId,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_CURRENT_MOVES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@PROS_ID", prosId);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pDispnotify(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_DISPNOTIFY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pGetTheMove(NNumber prosPidm,NString prosId,NString stgyProj,NString idenCode,NString moveCode,NNumber waitDays,NString plannedDate,NString commentText,NString scheduleDatesInd,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_GET_THE_MOVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@PROS_ID", prosId);
			cmd.addParameter("@STGY_PROJ", stgyProj);
			cmd.addParameter("@IDEN_CODE", idenCode);
			cmd.addParameter("@MOVE_CODE", moveCode);
			cmd.addParameter("@WAIT_DAYS", waitDays);
			cmd.addParameter("@PLANNED_DATE", plannedDate);
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@SCHEDULE_DATES_IND", scheduleDatesInd);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pMoveContactDetails(NNumber prosPidm,NNumber moveSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_MOVE_CONTACT_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@MOVE_SEQNO", moveSeqno);
				
			cmd.execute();


		}
		
		public static void pMovesByConstituent(NNumber prosPidm,NString prosId,NString sortOption,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_MOVES_BY_CONSTITUENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@PROS_ID", prosId);
			cmd.addParameter("@SORT_OPTION", sortOption);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pMovesByDate(NString moveDate,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_MOVES_BY_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MOVE_DATE", moveDate);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pMovesSearch(NString moveStartDate,NString moveEndDate,NString sortOption,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_MOVES_SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MOVE_START_DATE", moveStartDate);
			cmd.addParameter("@MOVE_END_DATE", moveEndDate);
			cmd.addParameter("@SORT_OPTION", sortOption);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pMovesSearchResults(NString moveStartDate,NString moveEndDate,NString sortOption,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_MOVES_SEARCH_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MOVE_START_DATE", moveStartDate);
			cmd.addParameter("@MOVE_END_DATE", moveEndDate);
			cmd.addParameter("@SORT_OPTION", sortOption);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pPassedPlannedMoves(NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_PASSED_PLANNED_MOVES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pSaveTheChanges(NNumber prosPidm,NString prosId,NString stgyProj,NString idenCode,NString moveCode,NNumber waitDays,NString plannedDate,NString commentText,NString scheduleDatesInd,NString deleteMoveInd,NDate lastPlannedDate,NNumber moveSeqno,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_SAVE_THE_CHANGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@PROS_ID", prosId);
			cmd.addParameter("@STGY_PROJ", stgyProj);
			cmd.addParameter("@IDEN_CODE", idenCode);
			cmd.addParameter("@MOVE_CODE", moveCode);
			cmd.addParameter("@WAIT_DAYS", waitDays);
			cmd.addParameter("@PLANNED_DATE", plannedDate);
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@SCHEDULE_DATES_IND", scheduleDatesInd);
			cmd.addParameter("@DELETE_MOVE_IND", deleteMoveInd);
			cmd.addParameter("@LAST_PLANNED_DATE", lastPlannedDate);
			cmd.addParameter("@MOVE_SEQNO", moveSeqno);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pSaveTheMove(NNumber prosPidm,NString prosId,NString stgyProj,NString idenCode,NString moveCode,NNumber waitDays,NString plannedDate,NString commentText,NString scheduleDatesInd,NDate lastPlannedDate,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_SAVE_THE_MOVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@PROS_ID", prosId);
			cmd.addParameter("@STGY_PROJ", stgyProj);
			cmd.addParameter("@IDEN_CODE", idenCode);
			cmd.addParameter("@MOVE_CODE", moveCode);
			cmd.addParameter("@WAIT_DAYS", waitDays);
			cmd.addParameter("@PLANNED_DATE", plannedDate);
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@SCHEDULE_DATES_IND", scheduleDatesInd);
			cmd.addParameter("@LAST_PLANNED_DATE", lastPlannedDate);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pUpdateAMove(NNumber prosPidm,NString prosId,NString stgyProj,NString idenCode,NString moveCode,NNumber waitDays,NString plannedDate,NString commentText,NString scheduleDatesInd,NString deleteMoveInd,NNumber moveSeqno,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMOVE.P_UPDATE_A_MOVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@PROS_ID", prosId);
			cmd.addParameter("@STGY_PROJ", stgyProj);
			cmd.addParameter("@IDEN_CODE", idenCode);
			cmd.addParameter("@MOVE_CODE", moveCode);
			cmd.addParameter("@WAIT_DAYS", waitDays);
			cmd.addParameter("@PLANNED_DATE", plannedDate);
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@SCHEDULE_DATES_IND", scheduleDatesInd);
			cmd.addParameter("@DELETE_MOVE_IND", deleteMoveInd);
			cmd.addParameter("@MOVE_SEQNO", moveSeqno);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
	
	
	
}
