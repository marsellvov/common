package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbAidyCompRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fComponentsExist(NString pAidyCode,NString pBgrpCode,NString pBtypCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.F_COMPONENTS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pAidyCode,NString pBgrpCode,NString pBtypCode,NString pAprdCode,NString pCompCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_COMP_CODE", pCompCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AidyCompRulesRecRow recOne,AidyCompRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AidyCompRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AidyCompRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NString pBgrpCode,NString pBtypCode,NString pAprdCode,NString pCompCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_COMP_CODE", pCompCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NString pBgrpCode,NString pBtypCode,NString pAprdCode,NString pCompCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_COMP_CODE", pCompCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NString pBgrpCode,NString pBtypCode,NString pAprdCode,NString pCompCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_COMP_CODE", pCompCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NString pAprdCode,NString pCompCode,NNumber pAmt,NString pBtypCode,NString pBgrpCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_COMP_CODE", pCompCode);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NString pBgrpCode,NString pBtypCode,NString pAprdCode,NString pCompCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_COMP_CODE", pCompCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NString pBgrpCode,NString pBtypCode,NString pAprdCode,NString pCompCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_COMP_CODE", pCompCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NString pAprdCode,NString pCompCode,NNumber pAmt,NString pBtypCode,NString pBgrpCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AIDY_COMP_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_COMP_CODE", pCompCode);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AidyCompRulesRecRow", dataSourceName="AIDY_COMP_RULES_REC")
	public static class AidyCompRulesRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_APRD_CODE")
		public NString RAprdCode;
		@DbRecordField(dataSourceName="R_COMP_CODE")
		public NString RCompCode;
		@DbRecordField(dataSourceName="R_AMT")
		public NNumber RAmt;
		@DbRecordField(dataSourceName="R_BTYP_CODE")
		public NString RBtypCode;
		@DbRecordField(dataSourceName="R_BGRP_CODE")
		public NString RBgrpCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
