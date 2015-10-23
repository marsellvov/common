package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkepid {
		public static void pDispQueueAction(NString pActionInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_DISP_QUEUE_ACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACTION_IND", pActionInd);
				
			cmd.execute();


		}
		
		public static void pDispQueueLevels(NString pCurAlvl,NNumber pRecnum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_DISP_QUEUE_LEVELS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUR_ALVL", pCurAlvl);
			cmd.addParameter("@P_RECNUM", pRecnum);
				
			cmd.execute();


		}
		
		public static void pDispQueueUser(NString pCurUserid,NNumber pRecnum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_DISP_QUEUE_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUR_USERID", pCurUserid);
			cmd.addParameter("@P_RECNUM", pRecnum);
				
			cmd.execute();


		}
		
		public static void pDispRoutuserLookup(NString pApprLevel,NString pCodefieldnm,NString pDescfieldnm,NNumber pFieldIndex,NString pSrchVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_DISP_ROUTUSER_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPR_LEVEL", pApprLevel);
			cmd.addParameter("@P_CODEFIELDNM", pCodefieldnm);
			cmd.addParameter("@P_DESCFIELDNM", pDescfieldnm);
			cmd.addParameter("@P_FIELD_INDEX", pFieldIndex);
			cmd.addParameter("@P_SRCH_VAL", pSrchVal);
				
			cmd.execute();


		}
		
		public static void pPrintApprLevl(NString pUsernameIn,NString pLevlCurrIn,Ref<NString> pLevlSelected,Ref<NNumber> pRecCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_PRINT_APPR_LEVL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USERNAME_IN", pUsernameIn);
			cmd.addParameter("@P_LEVL_CURR_IN", pLevlCurrIn);
			cmd.addParameter("@P_LEVL_SELECTED", pLevlSelected, true);
			cmd.addParameter("@P_REC_COUNT", pRecCount, true);
				
			cmd.execute();
			pLevlSelected.val = cmd.getParameterValue("@P_LEVL_SELECTED", NString.class);
			pRecCount.val = cmd.getParameterValue("@P_REC_COUNT", NNumber.class);


		}
		
		public static void pPrintComments(NNumber pTrans,NString pRole,NString pComments) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_PRINT_COMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS", pTrans);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_COMMENTS", pComments);
				
			cmd.execute();


		}
		
//		public static void pPrintDefaultRouting(NString pAcatCode,List<Twbklibs.Varchar2TabtypeRow> ralvl,List<Twbklibs.Varchar2TabtypeRow> ruser,List<Twbklibs.Varchar2TabtypeRow> raction,List<Twbklibs.Varchar2TabtypeRow> rrowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_PRINT_DEFAULT_ROUTING", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
//			// cmd.addParameter(DbTypes.getTableType("RALVL", "", ralvl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RUSER", "", ruser, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RACTION", "", raction, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RROWID", "", rrowid, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pPrintProxySetup(NNumber pPidmIn,NString pLevlSelectedIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_PRINT_PROXY_SETUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_SELECTED_IN", pLevlSelectedIn);
				
			cmd.execute();


		}
		
		public static void pPrintRoutHeader1() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_PRINT_ROUT_HEADER1", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintRoutHeader2(NNumber pTransNo,NString pAcatCode,Ref<NNumber> pRoutCntsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_PRINT_ROUT_HEADER2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_ROUT_CNTS_OUT", NNumber.class);
				
			cmd.execute();
			pRoutCntsOut.val = cmd.getParameterValue("@P_ROUT_CNTS_OUT", NNumber.class);


		}
		
//		public static void pSaveNtrrout(NString pAcatCode,List<Twbklibs.Varchar2TabtypeRow> ralvl,List<Twbklibs.Varchar2TabtypeRow> ruser,List<Twbklibs.Varchar2TabtypeRow> raction,List<Twbklibs.Varchar2TabtypeRow> rremove,List<Twbklibs.Varchar2TabtypeRow> rrowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_SAVE_NTRROUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
//			// cmd.addParameter(DbTypes.getTableType("RALVL", "", ralvl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RUSER", "", ruser, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RACTION", "", raction, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RREMOVE", "", rremove, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RROWID", "", rrowid, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdateComments(NNumber pTrans,NString pComments,NString pUser,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPID.P_UPDATE_COMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS", pTrans);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
	
	
	
}
