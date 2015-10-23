package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvT4atTaxtypeRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pReptCode,NString pBoxCode,NString pTaxtCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
			cmd.addParameter("@P_TAXT_CODE", pTaxtCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(T4atTaxtypeRulesRecRow recOne,T4atTaxtypeRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, T4atTaxtypeRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, T4atTaxtypeRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pReptCode,NString pBoxCode,NString pTaxtCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
			cmd.addParameter("@P_TAXT_CODE", pTaxtCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pReptCode,NString pBoxCode,NString pTaxtCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
			cmd.addParameter("@P_TAXT_CODE", pTaxtCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pReptCode,NString pBoxCode,NString pTaxtCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
			cmd.addParameter("@P_TAXT_CODE", pTaxtCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pReptCode,NString pBoxCode,NString pTaxtCode,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
			cmd.addParameter("@P_TAXT_CODE", pTaxtCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pReptCode,NString pBoxCode,NString pTaxtCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
			cmd.addParameter("@P_TAXT_CODE", pTaxtCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pReptCode,NString pBoxCode,NString pTaxtCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
			cmd.addParameter("@P_TAXT_CODE", pTaxtCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pReptCode,NString pBoxCode,NString pTaxtCode,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_T4AT_TAXTYPE_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
			cmd.addParameter("@P_TAXT_CODE", pTaxtCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="T4atTaxtypeRulesRecRow", dataSourceName="T4AT_TAXTYPE_RULES_REC", needsInitialization=true)
	public static class T4atTaxtypeRulesRecRow
	{
		@DbRecordField(dataSourceName="R_REPT_CODE")
		public NString RReptCode;
		@DbRecordField(dataSourceName="R_BOX_CODE")
		public NString RBoxCode;
		@DbRecordField(dataSourceName="R_TAXT_CODE")
		public NString RTaxtCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
