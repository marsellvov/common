package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsokcom {
		public static EventHeaderRecTypeRow fGetLditermEventHeader(NString termCodeIn,NString action) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSOKCOM.F_GET_LDITERM_EVENT_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EventHeaderRecTypeRow.class));
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@ACTION", action);
				
			cmd.execute();

			return cmd.getReturnValue(EventHeaderRecTypeRow.class);

		}
		
		public static TermRecTypeRow fGetTerm(NString termCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSOKCOM.F_GET_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(TermRecTypeRow.class));
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(TermRecTypeRow.class);

		}
		
	
	
	@DbRecordType(id="EventHeaderRecTypeRow", dataSourceName="EVENT_HEADER_REC_TYPE")
	public static class EventHeaderRecTypeRow
	{
		@DbRecordField(dataSourceName="INTEGRATION_SOURCE")
		public NString IntegrationSource;
		@DbRecordField(dataSourceName="SOURCEDID_ID")
		public NString SourcedidId;
		@DbRecordField(dataSourceName="ONLINETOPIC")
		public NString Onlinetopic;
		@DbRecordField(dataSourceName="RECSTATUS")
		public NString Recstatus;
	}

	
	@DbRecordType(id="TermRecTypeRow", dataSourceName="TERM_REC_TYPE")
	public static class TermRecTypeRow
	{
		@DbRecordField(dataSourceName="SOURCEDID_ID")
		public NString SourcedidId;
		@DbRecordField(dataSourceName="SHORT_DESC")
		public NString ShortDesc;
		@DbRecordField(dataSourceName="LONG_DESC")
		public NString LongDesc;
		@DbRecordField(dataSourceName="START_DATE")
		public NString StartDate;
		@DbRecordField(dataSourceName="START_DATE_RESTRICT")
		public NString StartDateRestrict;
		@DbRecordField(dataSourceName="END_DATE")
		public NString EndDate;
		@DbRecordField(dataSourceName="END_DATE_RESTRICT")
		public NString EndDateRestrict;
		@DbRecordField(dataSourceName="ENROLLACCEPT")
		public NString Enrollaccept;
		@DbRecordField(dataSourceName="SORT_CODE")
		public NString SortCode;
	}

	
	
}
