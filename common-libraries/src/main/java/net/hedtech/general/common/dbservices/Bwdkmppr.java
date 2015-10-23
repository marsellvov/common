package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdkmppr {
		public static void pDeleteAddtlStaff(NString propInsUpdInd,NNumber propPidm,NString propCode,NNumber propSeqNo,NString propPrstCode,NString propPrstDate,NString propDueDate,NString propCreateDate,NString propAskAmt,NString propStaff,NString propComment,NString projCode,NString projMissingInd,NString projDisplayInd,NString projAskAmt,NString projAskDate,NString projPrstCode,NString projPrstDate,NString projGivhCode,NString projEffFromDate,NString projEffToDate,NString projText,NString psolStaff,NString psolPrimaryInd,NString projInsUpdInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPPR.P_DELETE_ADDTL_STAFF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROP_INS_UPD_IND", propInsUpdInd);
			cmd.addParameter("@PROP_PIDM", propPidm);
			cmd.addParameter("@PROP_CODE", propCode);
			cmd.addParameter("@PROP_SEQ_NO", propSeqNo);
			cmd.addParameter("@PROP_PRST_CODE", propPrstCode);
			cmd.addParameter("@PROP_PRST_DATE", propPrstDate);
			cmd.addParameter("@PROP_DUE_DATE", propDueDate);
			cmd.addParameter("@PROP_CREATE_DATE", propCreateDate);
			cmd.addParameter("@PROP_ASK_AMT", propAskAmt);
			cmd.addParameter("@PROP_STAFF", propStaff);
			cmd.addParameter("@PROP_COMMENT", propComment);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@PROJ_MISSING_IND", projMissingInd);
			cmd.addParameter("@PROJ_DISPLAY_IND", projDisplayInd);
			cmd.addParameter("@PROJ_ASK_AMT", projAskAmt);
			cmd.addParameter("@PROJ_ASK_DATE", projAskDate);
			cmd.addParameter("@PROJ_PRST_CODE", projPrstCode);
			cmd.addParameter("@PROJ_PRST_DATE", projPrstDate);
			cmd.addParameter("@PROJ_GIVH_CODE", projGivhCode);
			cmd.addParameter("@PROJ_EFF_FROM_DATE", projEffFromDate);
			cmd.addParameter("@PROJ_EFF_TO_DATE", projEffToDate);
			cmd.addParameter("@PROJ_TEXT", projText);
			cmd.addParameter("@PSOL_STAFF", psolStaff);
			cmd.addParameter("@PSOL_PRIMARY_IND", psolPrimaryInd);
			cmd.addParameter("@PROJ_INS_UPD_IND", projInsUpdInd);
				
			cmd.execute();


		}
		
		public static void pEnterProposal(NString propInsUpdInd,NNumber propPidm,NString propCode,NNumber propSeqNo,NString propPrstCode,NString propPrstDate,NString propDueDate,NString propCreateDate,NString propAskAmt,NString propStaff,NString propComment,NString projCode,NString projMissingInd,NString projDisplayInd,NString projAskAmt,NString projAskDate,NString projPrstCode,NString projPrstDate,NString projGivhCode,NString projEffFromDate,NString projEffToDate,NString projText,NString psolStaff,NString psolPrimaryInd,NString projInsUpdInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPPR.P_ENTER_PROPOSAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROP_INS_UPD_IND", propInsUpdInd);
			cmd.addParameter("@PROP_PIDM", propPidm);
			cmd.addParameter("@PROP_CODE", propCode);
			cmd.addParameter("@PROP_SEQ_NO", propSeqNo);
			cmd.addParameter("@PROP_PRST_CODE", propPrstCode);
			cmd.addParameter("@PROP_PRST_DATE", propPrstDate);
			cmd.addParameter("@PROP_DUE_DATE", propDueDate);
			cmd.addParameter("@PROP_CREATE_DATE", propCreateDate);
			cmd.addParameter("@PROP_ASK_AMT", propAskAmt);
			cmd.addParameter("@PROP_STAFF", propStaff);
			cmd.addParameter("@PROP_COMMENT", propComment);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@PROJ_MISSING_IND", projMissingInd);
			cmd.addParameter("@PROJ_DISPLAY_IND", projDisplayInd);
			cmd.addParameter("@PROJ_ASK_AMT", projAskAmt);
			cmd.addParameter("@PROJ_ASK_DATE", projAskDate);
			cmd.addParameter("@PROJ_PRST_CODE", projPrstCode);
			cmd.addParameter("@PROJ_PRST_DATE", projPrstDate);
			cmd.addParameter("@PROJ_GIVH_CODE", projGivhCode);
			cmd.addParameter("@PROJ_EFF_FROM_DATE", projEffFromDate);
			cmd.addParameter("@PROJ_EFF_TO_DATE", projEffToDate);
			cmd.addParameter("@PROJ_TEXT", projText);
			cmd.addParameter("@PSOL_STAFF", psolStaff);
			cmd.addParameter("@PSOL_PRIMARY_IND", psolPrimaryInd);
			cmd.addParameter("@PROJ_INS_UPD_IND", projInsUpdInd);
				
			cmd.execute();


		}
		
		public static void pGetPermissions(NString propInsUpdInd,NNumber pidm,NNumber propPidm,NString propCode,NNumber propSeqNo,NString projCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPPR.P_GET_PERMISSIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROP_INS_UPD_IND", propInsUpdInd);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PROP_PIDM", propPidm);
			cmd.addParameter("@PROP_CODE", propCode);
			cmd.addParameter("@PROP_SEQ_NO", propSeqNo);
			cmd.addParameter("@PROJ_CODE", projCode);
				
			cmd.execute();


		}
		
		public static void pInsertProposal(NString propInsUpdInd,NNumber propPidm,NString propCode,NNumber propSeqNo,NString propPrstCode,NString propPrstDate,NString propDueDate,NString propCreateDate,NString propAskAmt,NString propStaff,NString propComment,NString projCode,NString projMissingInd,NString projDisplayInd,NString projAskAmt,NString projAskDate,NString projPrstCode,NString projPrstDate,NString projGivhCode,NString projEffFromDate,NString projEffToDate,NString projText,NString psolStaff,NString psolPrimaryInd,NString projInsUpdInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPPR.P_INSERT_PROPOSAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROP_INS_UPD_IND", propInsUpdInd);
			cmd.addParameter("@PROP_PIDM", propPidm);
			cmd.addParameter("@PROP_CODE", propCode);
			cmd.addParameter("@PROP_SEQ_NO", propSeqNo);
			cmd.addParameter("@PROP_PRST_CODE", propPrstCode);
			cmd.addParameter("@PROP_PRST_DATE", propPrstDate);
			cmd.addParameter("@PROP_DUE_DATE", propDueDate);
			cmd.addParameter("@PROP_CREATE_DATE", propCreateDate);
			cmd.addParameter("@PROP_ASK_AMT", propAskAmt);
			cmd.addParameter("@PROP_STAFF", propStaff);
			cmd.addParameter("@PROP_COMMENT", propComment);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@PROJ_MISSING_IND", projMissingInd);
			cmd.addParameter("@PROJ_DISPLAY_IND", projDisplayInd);
			cmd.addParameter("@PROJ_ASK_AMT", projAskAmt);
			cmd.addParameter("@PROJ_ASK_DATE", projAskDate);
			cmd.addParameter("@PROJ_PRST_CODE", projPrstCode);
			cmd.addParameter("@PROJ_PRST_DATE", projPrstDate);
			cmd.addParameter("@PROJ_GIVH_CODE", projGivhCode);
			cmd.addParameter("@PROJ_EFF_FROM_DATE", projEffFromDate);
			cmd.addParameter("@PROJ_EFF_TO_DATE", projEffToDate);
			cmd.addParameter("@PROJ_TEXT", projText);
			cmd.addParameter("@PSOL_STAFF", psolStaff);
			cmd.addParameter("@PSOL_PRIMARY_IND", psolPrimaryInd);
			cmd.addParameter("@PROJ_INS_UPD_IND", projInsUpdInd);
				
			cmd.execute();


		}
		
		public static void pMakePrimary(NString propInsUpdInd,NNumber propPidm,NString propCode,NNumber propSeqNo,NString propPrstCode,NString propPrstDate,NString propDueDate,NString propCreateDate,NString propAskAmt,NString propStaff,NString propComment,NString projCode,NString projMissingInd,NString projDisplayInd,NString projAskAmt,NString projAskDate,NString projPrstCode,NString projPrstDate,NString projGivhCode,NString projEffFromDate,NString projEffToDate,NString projText,NString psolStaff,NString psolPrimaryInd,NString projInsUpdInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPPR.P_MAKE_PRIMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROP_INS_UPD_IND", propInsUpdInd);
			cmd.addParameter("@PROP_PIDM", propPidm);
			cmd.addParameter("@PROP_CODE", propCode);
			cmd.addParameter("@PROP_SEQ_NO", propSeqNo);
			cmd.addParameter("@PROP_PRST_CODE", propPrstCode);
			cmd.addParameter("@PROP_PRST_DATE", propPrstDate);
			cmd.addParameter("@PROP_DUE_DATE", propDueDate);
			cmd.addParameter("@PROP_CREATE_DATE", propCreateDate);
			cmd.addParameter("@PROP_ASK_AMT", propAskAmt);
			cmd.addParameter("@PROP_STAFF", propStaff);
			cmd.addParameter("@PROP_COMMENT", propComment);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@PROJ_MISSING_IND", projMissingInd);
			cmd.addParameter("@PROJ_DISPLAY_IND", projDisplayInd);
			cmd.addParameter("@PROJ_ASK_AMT", projAskAmt);
			cmd.addParameter("@PROJ_ASK_DATE", projAskDate);
			cmd.addParameter("@PROJ_PRST_CODE", projPrstCode);
			cmd.addParameter("@PROJ_PRST_DATE", projPrstDate);
			cmd.addParameter("@PROJ_GIVH_CODE", projGivhCode);
			cmd.addParameter("@PROJ_EFF_FROM_DATE", projEffFromDate);
			cmd.addParameter("@PROJ_EFF_TO_DATE", projEffToDate);
			cmd.addParameter("@PROJ_TEXT", projText);
			cmd.addParameter("@PSOL_STAFF", psolStaff);
			cmd.addParameter("@PSOL_PRIMARY_IND", psolPrimaryInd);
			cmd.addParameter("@PROJ_INS_UPD_IND", projInsUpdInd);
				
			cmd.execute();


		}
		
		public static void pRemovePrimary(NString propInsUpdInd,NNumber propPidm,NString propCode,NNumber propSeqNo,NString propPrstCode,NString propPrstDate,NString propDueDate,NString propCreateDate,NString propAskAmt,NString propStaff,NString propComment,NString projCode,NString projMissingInd,NString projDisplayInd,NString projAskAmt,NString projAskDate,NString projPrstCode,NString projPrstDate,NString projGivhCode,NString projEffFromDate,NString projEffToDate,NString projText,NString psolStaff,NString psolPrimaryInd,NString projInsUpdInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPPR.P_REMOVE_PRIMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROP_INS_UPD_IND", propInsUpdInd);
			cmd.addParameter("@PROP_PIDM", propPidm);
			cmd.addParameter("@PROP_CODE", propCode);
			cmd.addParameter("@PROP_SEQ_NO", propSeqNo);
			cmd.addParameter("@PROP_PRST_CODE", propPrstCode);
			cmd.addParameter("@PROP_PRST_DATE", propPrstDate);
			cmd.addParameter("@PROP_DUE_DATE", propDueDate);
			cmd.addParameter("@PROP_CREATE_DATE", propCreateDate);
			cmd.addParameter("@PROP_ASK_AMT", propAskAmt);
			cmd.addParameter("@PROP_STAFF", propStaff);
			cmd.addParameter("@PROP_COMMENT", propComment);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@PROJ_MISSING_IND", projMissingInd);
			cmd.addParameter("@PROJ_DISPLAY_IND", projDisplayInd);
			cmd.addParameter("@PROJ_ASK_AMT", projAskAmt);
			cmd.addParameter("@PROJ_ASK_DATE", projAskDate);
			cmd.addParameter("@PROJ_PRST_CODE", projPrstCode);
			cmd.addParameter("@PROJ_PRST_DATE", projPrstDate);
			cmd.addParameter("@PROJ_GIVH_CODE", projGivhCode);
			cmd.addParameter("@PROJ_EFF_FROM_DATE", projEffFromDate);
			cmd.addParameter("@PROJ_EFF_TO_DATE", projEffToDate);
			cmd.addParameter("@PROJ_TEXT", projText);
			cmd.addParameter("@PSOL_STAFF", psolStaff);
			cmd.addParameter("@PSOL_PRIMARY_IND", psolPrimaryInd);
			cmd.addParameter("@PROJ_INS_UPD_IND", projInsUpdInd);
				
			cmd.execute();


		}
		
		public static void pUpdateProposal(NString propInsUpdInd,NNumber propPidm,NString propCode,NNumber propSeqNo,NString propPrstCode,NString propPrstDate,NString propDueDate,NString propCreateDate,NString propAskAmt,NString propStaff,NString propComment,NString projCode,NString projMissingInd,NString projDisplayInd,NString projAskAmt,NString projAskDate,NString projPrstCode,NString projPrstDate,NString projGivhCode,NString projEffFromDate,NString projEffToDate,NString projText,NString psolStaff,NString psolPrimaryInd,NString projInsUpdInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPPR.P_UPDATE_PROPOSAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROP_INS_UPD_IND", propInsUpdInd);
			cmd.addParameter("@PROP_PIDM", propPidm);
			cmd.addParameter("@PROP_CODE", propCode);
			cmd.addParameter("@PROP_SEQ_NO", propSeqNo);
			cmd.addParameter("@PROP_PRST_CODE", propPrstCode);
			cmd.addParameter("@PROP_PRST_DATE", propPrstDate);
			cmd.addParameter("@PROP_DUE_DATE", propDueDate);
			cmd.addParameter("@PROP_CREATE_DATE", propCreateDate);
			cmd.addParameter("@PROP_ASK_AMT", propAskAmt);
			cmd.addParameter("@PROP_STAFF", propStaff);
			cmd.addParameter("@PROP_COMMENT", propComment);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@PROJ_MISSING_IND", projMissingInd);
			cmd.addParameter("@PROJ_DISPLAY_IND", projDisplayInd);
			cmd.addParameter("@PROJ_ASK_AMT", projAskAmt);
			cmd.addParameter("@PROJ_ASK_DATE", projAskDate);
			cmd.addParameter("@PROJ_PRST_CODE", projPrstCode);
			cmd.addParameter("@PROJ_PRST_DATE", projPrstDate);
			cmd.addParameter("@PROJ_GIVH_CODE", projGivhCode);
			cmd.addParameter("@PROJ_EFF_FROM_DATE", projEffFromDate);
			cmd.addParameter("@PROJ_EFF_TO_DATE", projEffToDate);
			cmd.addParameter("@PROJ_TEXT", projText);
			cmd.addParameter("@PSOL_STAFF", psolStaff);
			cmd.addParameter("@PSOL_PRIMARY_IND", psolPrimaryInd);
			cmd.addParameter("@PROJ_INS_UPD_IND", projInsUpdInd);
				
			cmd.execute();


		}
		
	
	
	
}
