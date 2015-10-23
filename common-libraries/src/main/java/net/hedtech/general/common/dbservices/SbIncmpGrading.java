package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbIncmpGrading {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPrimaryKey,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(IncmpGradingRecRow recOne,IncmpGradingRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, IncmpGradingRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, IncmpGradingRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPrimaryKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPrimaryKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPrimaryKey,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCodeEff,NString pIncmpGradingInd,NString pIncmpGrdeOverInd,NString pIncmpDateOverType,NString pDispWebInd,NString pSystemReqInd,NString pUserId,NString pLevlCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_INCMP_GRADING_IND", pIncmpGradingInd);
			cmd.addParameter("@P_INCMP_GRDE_OVER_IND", pIncmpGrdeOverInd);
			cmd.addParameter("@P_INCMP_DATE_OVER_TYPE", pIncmpDateOverType);
			cmd.addParameter("@P_DISP_WEB_IND", pDispWebInd);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPrimaryKey,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPrimaryKey,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPrimaryKey,NString pTermCodeEff,NString pIncmpGradingInd,NString pIncmpGrdeOverInd,NString pIncmpDateOverType,NString pDispWebInd,NString pSystemReqInd,NString pUserId,NString pLevlCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_INCMP_GRADING.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_INCMP_GRADING_IND", pIncmpGradingInd);
			cmd.addParameter("@P_INCMP_GRDE_OVER_IND", pIncmpGrdeOverInd);
			cmd.addParameter("@P_INCMP_DATE_OVER_TYPE", pIncmpDateOverType);
			cmd.addParameter("@P_DISP_WEB_IND", pDispWebInd);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="IncmpGradingRecRow", dataSourceName="INCMP_GRADING_REC")
	public static class IncmpGradingRecRow
	{
		@DbRecordField(dataSourceName="R_PRIMARY_KEY")
		public NNumber RPrimaryKey;
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF")
		public NString RTermCodeEff;
		@DbRecordField(dataSourceName="R_INCMP_GRADING_IND")
		public NString RIncmpGradingInd;
		@DbRecordField(dataSourceName="R_INCMP_GRDE_OVER_IND")
		public NString RIncmpGrdeOverInd;
		@DbRecordField(dataSourceName="R_INCMP_DATE_OVER_TYPE")
		public NString RIncmpDateOverType;
		@DbRecordField(dataSourceName="R_DISP_WEB_IND")
		public NString RDispWebInd;
		@DbRecordField(dataSourceName="R_SYSTEM_REQ_IND")
		public NString RSystemReqInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
