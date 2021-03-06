package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpApplAidyBtyp {
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pBtypCode,NString pTfcInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_AIDY_BTYP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_TFC_IND", pTfcInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pBtypCode,NString pTfcInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_AIDY_BTYP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_TFC_IND", pTfcInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pBtypCode,NString pTfcInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_AIDY_BTYP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_TFC_IND", pTfcInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pTfcInd,NString pBtypCode,NString pUserId,NString pSysInd,NString pInfoAccessInd,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_AIDY_BTYP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TFC_IND", pTfcInd);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pBtypCode,NString pTfcInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_AIDY_BTYP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_TFC_IND", pTfcInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pTfcInd,NString pBtypCode,NString pUserId,NString pSysInd,NString pInfoAccessInd,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_APPL_AIDY_BTYP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TFC_IND", pTfcInd);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	
}
