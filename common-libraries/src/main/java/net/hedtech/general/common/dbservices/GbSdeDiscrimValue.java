package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbSdeDiscrimValue {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pSddcCode,NString pDisc,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
			cmd.addParameter("@P_DISC", pDisc);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(SdeDiscrimValueRecRow recOne,SdeDiscrimValueRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, SdeDiscrimValueRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, SdeDiscrimValueRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSddcCode,NString pDisc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
			cmd.addParameter("@P_DISC", pDisc);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSddcCode,NString pDisc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
			cmd.addParameter("@P_DISC", pDisc);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSddcCode,NString pDisc,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
			cmd.addParameter("@P_DISC", pDisc);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSddcCode,NString pDisc,NString pDesc,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
			cmd.addParameter("@P_DISC", pDisc);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pSddcCode,NString pDisc,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
			cmd.addParameter("@P_DISC", pDisc);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pSddcCode,NString pDisc,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
			cmd.addParameter("@P_DISC", pDisc);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSddcCode,NString pDisc,NString pDesc,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_DISCRIM_VALUE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
			cmd.addParameter("@P_DISC", pDisc);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="SdeDiscrimValueRecRow", dataSourceName="SDE_DISCRIM_VALUE_REC")
	public static class SdeDiscrimValueRecRow
	{
		@DbRecordField(dataSourceName="R_SDDC_CODE")
		public NString RSddcCode;
		@DbRecordField(dataSourceName="R_DISC")
		public NString RDisc;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
