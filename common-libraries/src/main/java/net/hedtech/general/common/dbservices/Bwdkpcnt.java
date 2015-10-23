package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdkpcnt {
//		public static void pDeleteContact(NNumber prosPidm,NNumber refno,List<Bwdklibs.Varchar2TabtypeRow> attnIdenCode,NString backUrl) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPCNT.P_DELETE_CONTACT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PROS_PIDM", prosPidm);
//			cmd.addParameter("@REFNO", refno);
//			// cmd.addParameter(DbTypes.getTableType("ATTN_IDEN_CODE", "", attnIdenCode, object.class));
//			cmd.addParameter("@BACK_URL", backUrl);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pEditContact(NNumber prosPidm,NString prosId,NNumber refno,NString moveSeqno,NString backUrl,NString idenCode,List<Bwdklibs.Varchar2TabtypeRow> attnIdenCode,NString scntDate,NString propOrNot,NString propCode,NString projCode1,NString askAmt1,NString projCode2,NString askAmt2,NString projCode3,NString askAmt3,NString projCode4,NString askAmt4,NString scntCode,NString scntDesc,NString callReport,NString moveCode,NString assigneeCode,NString originatorCode,NString tickler,NString actnDate,NString confidInd,NString tickStat,NString createTickler,NString stgyPlan,NString projMissInd,NString projMissInd2,NString projMissInd3,NString projMissInd4,NString addContInd,NString addContInd2,NString addContInd3,NString addContInd4,NString moveOrNot,NString addProjInd,NString addProjInd2,NString addProjInd3,NString addProjInd4,NString nextPage,NString sortOption,NString moveStartDate,NString moveEndDate,NString moveDate,NString application,NString selection,NString creatorId,NString popSelUser,NString persOrgInd,NString prosViewInd,NNumber staffPidm,NNumber howMany,NString srchName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPCNT.P_EDIT_CONTACT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PROS_PIDM", prosPidm);
//			cmd.addParameter("@PROS_ID", prosId);
//			cmd.addParameter("@REFNO", refno);
//			cmd.addParameter("@MOVE_SEQNO", moveSeqno);
//			cmd.addParameter("@BACK_URL", backUrl);
//			cmd.addParameter("@IDEN_CODE", idenCode);
//			// cmd.addParameter(DbTypes.getTableType("ATTN_IDEN_CODE", "", attnIdenCode, object.class));
//			cmd.addParameter("@SCNT_DATE", scntDate);
//			cmd.addParameter("@PROP_OR_NOT", propOrNot);
//			cmd.addParameter("@PROP_CODE", propCode);
//			cmd.addParameter("@PROJ_CODE1", projCode1);
//			cmd.addParameter("@ASK_AMT1", askAmt1);
//			cmd.addParameter("@PROJ_CODE2", projCode2);
//			cmd.addParameter("@ASK_AMT2", askAmt2);
//			cmd.addParameter("@PROJ_CODE3", projCode3);
//			cmd.addParameter("@ASK_AMT3", askAmt3);
//			cmd.addParameter("@PROJ_CODE4", projCode4);
//			cmd.addParameter("@ASK_AMT4", askAmt4);
//			cmd.addParameter("@SCNT_CODE", scntCode);
//			cmd.addParameter("@SCNT_DESC", scntDesc);
//			cmd.addParameter("@CALL_REPORT", callReport);
//			cmd.addParameter("@MOVE_CODE", moveCode);
//			cmd.addParameter("@ASSIGNEE_CODE", assigneeCode);
//			cmd.addParameter("@ORIGINATOR_CODE", originatorCode);
//			cmd.addParameter("@TICKLER", tickler);
//			cmd.addParameter("@ACTN_DATE", actnDate);
//			cmd.addParameter("@CONFID_IND", confidInd);
//			cmd.addParameter("@TICK_STAT", tickStat);
//			cmd.addParameter("@CREATE_TICKLER", createTickler);
//			cmd.addParameter("@STGY_PLAN", stgyPlan);
//			cmd.addParameter("@PROJ_MISS_IND", projMissInd);
//			cmd.addParameter("@PROJ_MISS_IND2", projMissInd2);
//			cmd.addParameter("@PROJ_MISS_IND3", projMissInd3);
//			cmd.addParameter("@PROJ_MISS_IND4", projMissInd4);
//			cmd.addParameter("@ADD_CONT_IND", addContInd);
//			cmd.addParameter("@ADD_CONT_IND2", addContInd2);
//			cmd.addParameter("@ADD_CONT_IND3", addContInd3);
//			cmd.addParameter("@ADD_CONT_IND4", addContInd4);
//			cmd.addParameter("@MOVE_OR_NOT", moveOrNot);
//			cmd.addParameter("@ADD_PROJ_IND", addProjInd);
//			cmd.addParameter("@ADD_PROJ_IND2", addProjInd2);
//			cmd.addParameter("@ADD_PROJ_IND3", addProjInd3);
//			cmd.addParameter("@ADD_PROJ_IND4", addProjInd4);
//			cmd.addParameter("@NEXT_PAGE", nextPage);
//			cmd.addParameter("@SORT_OPTION", sortOption);
//			cmd.addParameter("@MOVE_START_DATE", moveStartDate);
//			cmd.addParameter("@MOVE_END_DATE", moveEndDate);
//			cmd.addParameter("@MOVE_DATE", moveDate);
//			cmd.addParameter("@APPLICATION", application);
//			cmd.addParameter("@SELECTION", selection);
//			cmd.addParameter("@CREATOR_ID", creatorId);
//			cmd.addParameter("@POP_SEL_USER", popSelUser);
//			cmd.addParameter("@PERS_ORG_IND", persOrgInd);
//			cmd.addParameter("@PROS_VIEW_IND", prosViewInd);
//			cmd.addParameter("@STAFF_PIDM", staffPidm);
//			cmd.addParameter("@HOW_MANY", howMany);
//			cmd.addParameter("@SRCH_NAME", srchName);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pEnterContact(NNumber prosPidm,NString prosId,NString moveSeqno,NString backUrl,NString idenCode,List<Bwdklibs.Varchar2TabtypeRow> attnIdenCode,NString scntDate,NString propOrNot,NString propCode,NString projCode1,NString askAmt1,NString addProjInd,NString projCode2,NString askAmt2,NString addProjInd2,NString projCode3,NString askAmt3,NString addProjInd3,NString projCode4,NString askAmt4,NString addProjInd4,NString scntCode,NString scntDesc,NString callReport,NString moveCode,NString assigneeCode,NString originatorCode,NString tickler,NString actnDate,NString confidInd,NString tickStat,NString createTickler,NString stgyPlan,NString projMissInd,NString projMissInd2,NString projMissInd3,NString projMissInd4,NString addContInd,NString addContInd2,NString addContInd3,NString addContInd4,NString moveOrNot,NString nextPage,NString sortOption,NString moveStartDate,NString moveEndDate,NString moveDate,NString application,NString selection,NString creatorId,NString popSelUser,NString persOrgInd,NString prosViewInd,NNumber staffPidm,NNumber howMany,NString srchName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPCNT.P_ENTER_CONTACT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PROS_PIDM", prosPidm);
//			cmd.addParameter("@PROS_ID", prosId);
//			cmd.addParameter("@MOVE_SEQNO", moveSeqno);
//			cmd.addParameter("@BACK_URL", backUrl);
//			cmd.addParameter("@IDEN_CODE", idenCode);
//			// cmd.addParameter(DbTypes.getTableType("ATTN_IDEN_CODE", "", attnIdenCode, object.class));
//			cmd.addParameter("@SCNT_DATE", scntDate);
//			cmd.addParameter("@PROP_OR_NOT", propOrNot);
//			cmd.addParameter("@PROP_CODE", propCode);
//			cmd.addParameter("@PROJ_CODE1", projCode1);
//			cmd.addParameter("@ASK_AMT1", askAmt1);
//			cmd.addParameter("@ADD_PROJ_IND", addProjInd);
//			cmd.addParameter("@PROJ_CODE2", projCode2);
//			cmd.addParameter("@ASK_AMT2", askAmt2);
//			cmd.addParameter("@ADD_PROJ_IND2", addProjInd2);
//			cmd.addParameter("@PROJ_CODE3", projCode3);
//			cmd.addParameter("@ASK_AMT3", askAmt3);
//			cmd.addParameter("@ADD_PROJ_IND3", addProjInd3);
//			cmd.addParameter("@PROJ_CODE4", projCode4);
//			cmd.addParameter("@ASK_AMT4", askAmt4);
//			cmd.addParameter("@ADD_PROJ_IND4", addProjInd4);
//			cmd.addParameter("@SCNT_CODE", scntCode);
//			cmd.addParameter("@SCNT_DESC", scntDesc);
//			cmd.addParameter("@CALL_REPORT", callReport);
//			cmd.addParameter("@MOVE_CODE", moveCode);
//			cmd.addParameter("@ASSIGNEE_CODE", assigneeCode);
//			cmd.addParameter("@ORIGINATOR_CODE", originatorCode);
//			cmd.addParameter("@TICKLER", tickler);
//			cmd.addParameter("@ACTN_DATE", actnDate);
//			cmd.addParameter("@CONFID_IND", confidInd);
//			cmd.addParameter("@TICK_STAT", tickStat);
//			cmd.addParameter("@CREATE_TICKLER", createTickler);
//			cmd.addParameter("@STGY_PLAN", stgyPlan);
//			cmd.addParameter("@PROJ_MISS_IND", projMissInd);
//			cmd.addParameter("@PROJ_MISS_IND2", projMissInd2);
//			cmd.addParameter("@PROJ_MISS_IND3", projMissInd3);
//			cmd.addParameter("@PROJ_MISS_IND4", projMissInd4);
//			cmd.addParameter("@ADD_CONT_IND", addContInd);
//			cmd.addParameter("@ADD_CONT_IND2", addContInd2);
//			cmd.addParameter("@ADD_CONT_IND3", addContInd3);
//			cmd.addParameter("@ADD_CONT_IND4", addContInd4);
//			cmd.addParameter("@MOVE_OR_NOT", moveOrNot);
//			cmd.addParameter("@NEXT_PAGE", nextPage);
//			cmd.addParameter("@SORT_OPTION", sortOption);
//			cmd.addParameter("@MOVE_START_DATE", moveStartDate);
//			cmd.addParameter("@MOVE_END_DATE", moveEndDate);
//			cmd.addParameter("@MOVE_DATE", moveDate);
//			cmd.addParameter("@APPLICATION", application);
//			cmd.addParameter("@SELECTION", selection);
//			cmd.addParameter("@CREATOR_ID", creatorId);
//			cmd.addParameter("@POP_SEL_USER", popSelUser);
//			cmd.addParameter("@PERS_ORG_IND", persOrgInd);
//			cmd.addParameter("@PROS_VIEW_IND", prosViewInd);
//			cmd.addParameter("@STAFF_PIDM", staffPidm);
//			cmd.addParameter("@HOW_MANY", howMany);
//			cmd.addParameter("@SRCH_NAME", srchName);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pInsertContact(NNumber prosPidm,NString prosId,NString moveSeqno,NString idenCode,List<Bwdklibs.Varchar2TabtypeRow> attnIdenCode,NString scntDate,NString propOrNot,NString propCode,NString projCode1,NString askAmt1,NString addProjInd,NString projCode2,NString askAmt2,NString addProjInd2,NString projCode3,NString askAmt3,NString addProjInd3,NString projCode4,NString askAmt4,NString addProjInd4,NString scntCode,NString scntDesc,NString callReport,NString moveCode,NString assigneeCode,NString tickler,NString actnDate,NString confidInd,NString genContInd,NString tickStat,NString createTickler,NString stgyPlan,NString projMissInd,NString projMissInd2,NString projMissInd3,NString projMissInd4,NString addContInd,NString addContInd2,NString addContInd3,NString addContInd4,NString moveOrNot,NString nextPage,NString sortOption,NString moveStartDate,NString moveEndDate,NString moveDate,NString application,NString selection,NString creatorId,NString popSelUser,NString persOrgInd,NString prosViewInd,NNumber staffPidm,NNumber howMany,NString srchName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPCNT.P_INSERT_CONTACT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PROS_PIDM", prosPidm);
//			cmd.addParameter("@PROS_ID", prosId);
//			cmd.addParameter("@MOVE_SEQNO", moveSeqno);
//			cmd.addParameter("@IDEN_CODE", idenCode);
//			// cmd.addParameter(DbTypes.getTableType("ATTN_IDEN_CODE", "", attnIdenCode, object.class));
//			cmd.addParameter("@SCNT_DATE", scntDate);
//			cmd.addParameter("@PROP_OR_NOT", propOrNot);
//			cmd.addParameter("@PROP_CODE", propCode);
//			cmd.addParameter("@PROJ_CODE1", projCode1);
//			cmd.addParameter("@ASK_AMT1", askAmt1);
//			cmd.addParameter("@ADD_PROJ_IND", addProjInd);
//			cmd.addParameter("@PROJ_CODE2", projCode2);
//			cmd.addParameter("@ASK_AMT2", askAmt2);
//			cmd.addParameter("@ADD_PROJ_IND2", addProjInd2);
//			cmd.addParameter("@PROJ_CODE3", projCode3);
//			cmd.addParameter("@ASK_AMT3", askAmt3);
//			cmd.addParameter("@ADD_PROJ_IND3", addProjInd3);
//			cmd.addParameter("@PROJ_CODE4", projCode4);
//			cmd.addParameter("@ASK_AMT4", askAmt4);
//			cmd.addParameter("@ADD_PROJ_IND4", addProjInd4);
//			cmd.addParameter("@SCNT_CODE", scntCode);
//			cmd.addParameter("@SCNT_DESC", scntDesc);
//			cmd.addParameter("@CALL_REPORT", callReport);
//			cmd.addParameter("@MOVE_CODE", moveCode);
//			cmd.addParameter("@ASSIGNEE_CODE", assigneeCode);
//			cmd.addParameter("@TICKLER", tickler);
//			cmd.addParameter("@ACTN_DATE", actnDate);
//			cmd.addParameter("@CONFID_IND", confidInd);
//			cmd.addParameter("@GEN_CONT_IND", genContInd);
//			cmd.addParameter("@TICK_STAT", tickStat);
//			cmd.addParameter("@CREATE_TICKLER", createTickler);
//			cmd.addParameter("@STGY_PLAN", stgyPlan);
//			cmd.addParameter("@PROJ_MISS_IND", projMissInd);
//			cmd.addParameter("@PROJ_MISS_IND2", projMissInd2);
//			cmd.addParameter("@PROJ_MISS_IND3", projMissInd3);
//			cmd.addParameter("@PROJ_MISS_IND4", projMissInd4);
//			cmd.addParameter("@ADD_CONT_IND", addContInd);
//			cmd.addParameter("@ADD_CONT_IND2", addContInd2);
//			cmd.addParameter("@ADD_CONT_IND3", addContInd3);
//			cmd.addParameter("@ADD_CONT_IND4", addContInd4);
//			cmd.addParameter("@MOVE_OR_NOT", moveOrNot);
//			cmd.addParameter("@NEXT_PAGE", nextPage);
//			cmd.addParameter("@SORT_OPTION", sortOption);
//			cmd.addParameter("@MOVE_START_DATE", moveStartDate);
//			cmd.addParameter("@MOVE_END_DATE", moveEndDate);
//			cmd.addParameter("@MOVE_DATE", moveDate);
//			cmd.addParameter("@APPLICATION", application);
//			cmd.addParameter("@SELECTION", selection);
//			cmd.addParameter("@CREATOR_ID", creatorId);
//			cmd.addParameter("@POP_SEL_USER", popSelUser);
//			cmd.addParameter("@PERS_ORG_IND", persOrgInd);
//			cmd.addParameter("@PROS_VIEW_IND", prosViewInd);
//			cmd.addParameter("@STAFF_PIDM", staffPidm);
//			cmd.addParameter("@HOW_MANY", howMany);
//			cmd.addParameter("@SRCH_NAME", srchName);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateContact(NNumber prosPidm,NString prosId,NNumber refno,NString moveSeqno,NString idenCode,List<Bwdklibs.Varchar2TabtypeRow> attnIdenCode,NString scntDate,NString propOrNot,NString propCode,NString projCode1,NString askAmt1,NString projCode2,NString askAmt2,NString projCode3,NString askAmt3,NString projCode4,NString askAmt4,NString scntCode,NString scntDesc,NString callReport,NString moveCode,NString assigneeCode,NString tickler,NString actnDate,NString confidInd,NString genContInd,NString tickStat,NString createTickler,NString stgyPlan,NString projMissInd,NString projMissInd2,NString projMissInd3,NString projMissInd4,NString addContInd,NString addContInd2,NString addContInd3,NString addContInd4,NString btnDelete,NString moveOrNot,NString addProjInd,NString addProjInd2,NString addProjInd3,NString addProjInd4,NString nextPage,NString sortOption,NString moveStartDate,NString moveEndDate,NString moveDate,NString application,NString selection,NString creatorId,NString popSelUser,NString persOrgInd,NString prosViewInd,NNumber staffPidm,NNumber howMany,NString srchName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPCNT.P_UPDATE_CONTACT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PROS_PIDM", prosPidm);
//			cmd.addParameter("@PROS_ID", prosId);
//			cmd.addParameter("@REFNO", refno);
//			cmd.addParameter("@MOVE_SEQNO", moveSeqno);
//			cmd.addParameter("@IDEN_CODE", idenCode);
//			// cmd.addParameter(DbTypes.getTableType("ATTN_IDEN_CODE", "", attnIdenCode, object.class));
//			cmd.addParameter("@SCNT_DATE", scntDate);
//			cmd.addParameter("@PROP_OR_NOT", propOrNot);
//			cmd.addParameter("@PROP_CODE", propCode);
//			cmd.addParameter("@PROJ_CODE1", projCode1);
//			cmd.addParameter("@ASK_AMT1", askAmt1);
//			cmd.addParameter("@PROJ_CODE2", projCode2);
//			cmd.addParameter("@ASK_AMT2", askAmt2);
//			cmd.addParameter("@PROJ_CODE3", projCode3);
//			cmd.addParameter("@ASK_AMT3", askAmt3);
//			cmd.addParameter("@PROJ_CODE4", projCode4);
//			cmd.addParameter("@ASK_AMT4", askAmt4);
//			cmd.addParameter("@SCNT_CODE", scntCode);
//			cmd.addParameter("@SCNT_DESC", scntDesc);
//			cmd.addParameter("@CALL_REPORT", callReport);
//			cmd.addParameter("@MOVE_CODE", moveCode);
//			cmd.addParameter("@ASSIGNEE_CODE", assigneeCode);
//			cmd.addParameter("@TICKLER", tickler);
//			cmd.addParameter("@ACTN_DATE", actnDate);
//			cmd.addParameter("@CONFID_IND", confidInd);
//			cmd.addParameter("@GEN_CONT_IND", genContInd);
//			cmd.addParameter("@TICK_STAT", tickStat);
//			cmd.addParameter("@CREATE_TICKLER", createTickler);
//			cmd.addParameter("@STGY_PLAN", stgyPlan);
//			cmd.addParameter("@PROJ_MISS_IND", projMissInd);
//			cmd.addParameter("@PROJ_MISS_IND2", projMissInd2);
//			cmd.addParameter("@PROJ_MISS_IND3", projMissInd3);
//			cmd.addParameter("@PROJ_MISS_IND4", projMissInd4);
//			cmd.addParameter("@ADD_CONT_IND", addContInd);
//			cmd.addParameter("@ADD_CONT_IND2", addContInd2);
//			cmd.addParameter("@ADD_CONT_IND3", addContInd3);
//			cmd.addParameter("@ADD_CONT_IND4", addContInd4);
//			cmd.addParameter("@BTN_DELETE", btnDelete);
//			cmd.addParameter("@MOVE_OR_NOT", moveOrNot);
//			cmd.addParameter("@ADD_PROJ_IND", addProjInd);
//			cmd.addParameter("@ADD_PROJ_IND2", addProjInd2);
//			cmd.addParameter("@ADD_PROJ_IND3", addProjInd3);
//			cmd.addParameter("@ADD_PROJ_IND4", addProjInd4);
//			cmd.addParameter("@NEXT_PAGE", nextPage);
//			cmd.addParameter("@SORT_OPTION", sortOption);
//			cmd.addParameter("@MOVE_START_DATE", moveStartDate);
//			cmd.addParameter("@MOVE_END_DATE", moveEndDate);
//			cmd.addParameter("@MOVE_DATE", moveDate);
//			cmd.addParameter("@APPLICATION", application);
//			cmd.addParameter("@SELECTION", selection);
//			cmd.addParameter("@CREATOR_ID", creatorId);
//			cmd.addParameter("@POP_SEL_USER", popSelUser);
//			cmd.addParameter("@PERS_ORG_IND", persOrgInd);
//			cmd.addParameter("@PROS_VIEW_IND", prosViewInd);
//			cmd.addParameter("@STAFF_PIDM", staffPidm);
//			cmd.addParameter("@HOW_MANY", howMany);
//			cmd.addParameter("@SRCH_NAME", srchName);
//				
//			cmd.execute();
//
//
//		}
//		
		public static void pViewContacts(NNumber prosPidm,NString prosId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPCNT.P_VIEW_CONTACTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@PROS_ID", prosId);
				
			cmd.execute();


		}
		
	
	
	
}
