package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbAccountingElement {
		public static NString fCurrentVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.F_CURRENT_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fExists(NString pElementType,NString pChartCode,NString pElementCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_CHART_CODE", pChartCode);
			cmd.addParameter("@P_ELEMENT_CODE", pElementCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fPublishSync(NString pElementType,NString pSyncType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.F_PUBLISH_SYNC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_SYNC_TYPE", pSyncType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pElementType,NString pChartCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_CHART_CODE", pChartCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pElementType,NString pChartCode,NString pElementCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_CHART_CODE", pChartCode);
			cmd.addParameter("@P_ELEMENT_CODE", pElementCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pElementType,NString pChartCode,NString pElementCode,NDate pEffectiveDate,NDate pNchgDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_CHART_CODE", pChartCode);
			cmd.addParameter("@P_ELEMENT_CODE", pElementCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
				
			cmd.execute();


		}
		
		public static void pDelete(NString pElementType,NString pChartCode,NString pElementCode,NDate pEffectiveDate,NDate pNchgDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_CHART_CODE", pChartCode);
			cmd.addParameter("@P_ELEMENT_CODE", pElementCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
				
			cmd.execute();


		}
		
		public static void pPopulateGlobal(NString pElementType,NString pElementRowid,NString newOrOld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.P_POPULATE_GLOBAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_ELEMENT_ROWID", pElementRowid);
			cmd.addParameter("@NEW_OR_OLD", newOrOld);
				
			cmd.execute();


		}
		
		public static void pPublishSync(NString pElementType,NString pSyncType,IfoapalRecRow pCurrentValues,IfoapalRecRow pPreviousValues,Ref<NString> messagePublished) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.P_PUBLISH_SYNC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_SYNC_TYPE", pSyncType);
			cmd.addParameter(DbTypes.createStructType("P_CURRENT_VALUES", pCurrentValues, IfoapalRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("P_PREVIOUS_VALUES", pPreviousValues, IfoapalRecRow.class ));
			cmd.addParameter("@MESSAGE_PUBLISHED", messagePublished, true);
				
			cmd.execute();
			messagePublished.val = cmd.getParameterValue("@MESSAGE_PUBLISHED", NString.class);


		}
		
		public static void pPublishSync(NString pElementType,NString pSyncType,NString pCurrentRowid,NString pPreviousRowid,Ref<NString> messagePublished) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.P_PUBLISH_SYNC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_SYNC_TYPE", pSyncType);
			cmd.addParameter("@P_CURRENT_ROWID", pCurrentRowid);
			cmd.addParameter("@P_PREVIOUS_ROWID", pPreviousRowid);
			cmd.addParameter("@MESSAGE_PUBLISHED", messagePublished, true);
				
			cmd.execute();
			messagePublished.val = cmd.getParameterValue("@MESSAGE_PUBLISHED", NString.class);


		}
		
		public static void pUpdate(NString pElementType,NString pChartCode,NString pElementCode,NDate pEffectiveDate,NDate pNchgDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ACCOUNTING_ELEMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ELEMENT_TYPE", pElementType);
			cmd.addParameter("@P_CHART_CODE", pChartCode);
			cmd.addParameter("@P_ELEMENT_CODE", pElementCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="IfoapalRecRow", dataSourceName="IFOAPAL_REC")
	public static class IfoapalRecRow
	{
		@DbRecordField(dataSourceName="ELEMENT_TYPE")
		public NString ElementType;
		@DbRecordField(dataSourceName="CHART_CODE")
		public NString ChartCode;
		@DbRecordField(dataSourceName="CHART_TITLE")
		public NString ChartTitle;
		@DbRecordField(dataSourceName="ELEMENT_CODE")
		public NString ElementCode;
		@DbRecordField(dataSourceName="ELEMENT_TITLE")
		public NString ElementTitle;
		@DbRecordField(dataSourceName="EFFECTIVE_DATE")
		public NDate EffectiveDate;
		@DbRecordField(dataSourceName="TERMINATION_DATE")
		public NDate TerminationDate;
		@DbRecordField(dataSourceName="ELEMENT_STATUS")
		public NString ElementStatus;
		@DbRecordField(dataSourceName="DATA_ENTRY_IND")
		public NString DataEntryInd;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
	}

	
	
}
