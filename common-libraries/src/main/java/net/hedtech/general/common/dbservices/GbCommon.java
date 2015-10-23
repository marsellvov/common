package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbCommon {
	
		public static NString internal_record_id_type;
	
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fCurrentIdExists(NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_CURRENT_ID_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fErrMsgAddDelim(NString pErrorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_ERR_MSG_ADD_DELIM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fErrMsgRemoveDelim(NString pErrorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_ERR_MSG_REMOVE_DELIM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<MsgtabRow> fErrMsgRemoveDelimTbl(NString pErrorMessage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_ERR_MSG_REMOVE_DELIM_TBL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MsgtabRow>.class);
//			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MsgtabRow>.class);
//
//		}
		
		public static NString fGenerateId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_GENERATE_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGeneratePidm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_GENERATE_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetApiName(NString pPackageschema,NString pTableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_GET_API_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PACKAGESCHEMA", pPackageschema);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetApiTable(NString pPackageschema,NString pApiPackage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_GET_API_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PACKAGESCHEMA", pPackageschema);
			cmd.addParameter("@P_API_PACKAGE", pApiPackage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetContext(NString pPackageName,NString pContextName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_GET_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_CONTEXT_NAME", pContextName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetId(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_GET_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetNextAddrSeqno(NNumber pPidm,NString pAtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_GET_NEXT_ADDR_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetNextTeleSeqno(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_GET_NEXT_TELE_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPidm(NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_GET_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIdExists(NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_ID_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPidmExists(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_PIDM_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSctUser() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_SCT_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fVbsErrorMsg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_VBS_ERROR_MSG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fVbsErrorNumber() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.F_VBS_ERROR_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCommit(){
			pCommit(NString.getNull());
		}
		
		public static void pCommit(NString pDoNotCommit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.P_COMMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DO_NOT_COMMIT", pDoNotCommit);
				
			cmd.execute();


		}
		public static void pRollback() {
			pRollback(NString.getEmpty());
		}
		
		public static void pRollback(NString pDoNotRollback) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.P_ROLLBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DO_NOT_ROLLBACK", pDoNotRollback);
				
			cmd.execute();


		}
		
		public static void pSetContext(NString pPackageName,NString pContextName,NString pContextValue,NString pStatelessInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_COMMON.P_SET_CONTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_CONTEXT_NAME", pContextName);
			cmd.addParameter("@P_CONTEXT_VALUE", pContextValue);
			cmd.addParameter("@P_STATELESS_IND", pStatelessInd);
				
			cmd.execute();


		}
		
	
	
}
