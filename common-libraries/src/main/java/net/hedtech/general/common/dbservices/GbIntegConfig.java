package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbIntegConfig {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pSqprCode,NString pIcsnCode,NString pValue,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(IntegConfigRecRow recOne,IntegConfigRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, IntegConfigRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, IntegConfigRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSqprCode,NString pIcsnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSqprCode,NString pIcsnCode,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSqprCode,NString pIcsnCode,NString pValue,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSqprCode,NString pIcsnCode,NString pValue,NString pUserId,NString pValueDesc,NNumber pSeqNo,NString pTranslationValue,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VALUE_DESC", pValueDesc);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_TRANSLATION_VALUE", pTranslationValue);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pSqprCode,NString pIcsnCode,NString pValue,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pSqprCode,NString pIcsnCode,NString pValue,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSqprCode,NString pIcsnCode,NString pValue,NString pUserId,NString pValueDesc,NNumber pSeqNo,NString pTranslationValue,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VALUE_DESC", pValueDesc);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_TRANSLATION_VALUE", pTranslationValue);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="IntegConfigRecRow", dataSourceName="INTEG_CONFIG_REC")
	public static class IntegConfigRecRow
	{
		@DbRecordField(dataSourceName="R_SQPR_CODE")
		public NString RSqprCode;
		@DbRecordField(dataSourceName="R_ICSN_CODE")
		public NString RIcsnCode;
		@DbRecordField(dataSourceName="R_VALUE")
		public NString RValue;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_VALUE_DESC")
		public NString RValueDesc;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_TRANSLATION_VALUE")
		public NString RTranslationValue;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
