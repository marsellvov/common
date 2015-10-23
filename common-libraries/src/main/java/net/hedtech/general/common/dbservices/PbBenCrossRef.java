package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbBenCrossRef {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pBdcaCode,NString pBdcaCodeTo,NString pFieldTo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BDCA_CODE_TO", pBdcaCodeTo);
			cmd.addParameter("@P_FIELD_TO", pFieldTo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(BenCrossRefRecRow recOne,BenCrossRefRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, BenCrossRefRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, BenCrossRefRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pBdcaCode,NString pBdcaCodeTo,NString pFieldTo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BDCA_CODE_TO", pBdcaCodeTo);
			cmd.addParameter("@P_FIELD_TO", pFieldTo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pBdcaCode,NString pBdcaCodeTo,NString pFieldTo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BDCA_CODE_TO", pBdcaCodeTo);
			cmd.addParameter("@P_FIELD_TO", pFieldTo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pBdcaCode,NString pBdcaCodeTo,NString pFieldTo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BDCA_CODE_TO", pBdcaCodeTo);
			cmd.addParameter("@P_FIELD_TO", pFieldTo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pBdcaCode,NString pBdcaCodeTo,NString pFieldTo,NString pFromAction,NString pAvgPeriod,NNumber pPriority,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BDCA_CODE_TO", pBdcaCodeTo);
			cmd.addParameter("@P_FIELD_TO", pFieldTo);
			cmd.addParameter("@P_FROM_ACTION", pFromAction);
			cmd.addParameter("@P_AVG_PERIOD", pAvgPeriod);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pBdcaCode,NString pBdcaCodeTo,NString pFieldTo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BDCA_CODE_TO", pBdcaCodeTo);
			cmd.addParameter("@P_FIELD_TO", pFieldTo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pBdcaCode,NString pBdcaCodeTo,NString pFieldTo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BDCA_CODE_TO", pBdcaCodeTo);
			cmd.addParameter("@P_FIELD_TO", pFieldTo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pBdcaCode,NString pBdcaCodeTo,NString pFieldTo,NString pFromAction,NString pAvgPeriod,NNumber pPriority,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BEN_CROSS_REF.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_BDCA_CODE_TO", pBdcaCodeTo);
			cmd.addParameter("@P_FIELD_TO", pFieldTo);
			cmd.addParameter("@P_FROM_ACTION", pFromAction);
			cmd.addParameter("@P_AVG_PERIOD", pAvgPeriod);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="BenCrossRefRecRow", dataSourceName="BEN_CROSS_REF_REC", needsInitialization=true)
	public static class BenCrossRefRecRow
	{
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_BDCA_CODE_TO")
		public NString RBdcaCodeTo;
		@DbRecordField(dataSourceName="R_FIELD_TO")
		public NString RFieldTo;
		@DbRecordField(dataSourceName="R_FROM_ACTION")
		public NString RFromAction;
		@DbRecordField(dataSourceName="R_AVG_PERIOD")
		public NString RAvgPeriod;
		@DbRecordField(dataSourceName="R_PRIORITY")
		public NNumber RPriority;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
