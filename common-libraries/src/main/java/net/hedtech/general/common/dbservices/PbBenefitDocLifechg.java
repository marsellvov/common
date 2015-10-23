package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbBenefitDocLifechg {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_DOC_LIFECHG.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pBreaCode,NString pBdocCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_DOC_LIFECHG.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDOC_CODE", pBdocCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(BenefitDocLifechgRecRow recOne,BenefitDocLifechgRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_DOC_LIFECHG.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, BenefitDocLifechgRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, BenefitDocLifechgRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pBreaCode,NString pBdocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_DOC_LIFECHG.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDOC_CODE", pBdocCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_DOC_LIFECHG.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pBreaCode,NString pBdocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_DOC_LIFECHG.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDOC_CODE", pBdocCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pBreaCode,NString pBdocCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_DOC_LIFECHG.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDOC_CODE", pBdocCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pBreaCode,NString pBdocCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_DOC_LIFECHG.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDOC_CODE", pBdocCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pBreaCode,NString pBdocCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_DOC_LIFECHG.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDOC_CODE", pBdocCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pBreaCode,NString pBdocCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_DOC_LIFECHG.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDOC_CODE", pBdocCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
	
	
	@DbRecordType(id="BenefitDocLifechgRecRow", dataSourceName="BENEFIT_DOC_LIFECHG_REC")
	public static class BenefitDocLifechgRecRow
	{
		@DbRecordField(dataSourceName="R_BREA_CODE")
		public NString RBreaCode;
		@DbRecordField(dataSourceName="R_BDOC_CODE")
		public NString RBdocCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
