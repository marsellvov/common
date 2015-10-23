package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGobapid {
		public static DataCursor fGetApidList() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GOBAPID.F_GET_APID_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetApidMap(NString pUdcid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GOBAPID.F_GET_APID_MAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_UDCID", pUdcid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	@DbRecordType(id="GobapidRecRow", dataSourceName="GOBAPID_REC")
	public static class GobapidRecRow
	{
		@DbRecordField(dataSourceName="R_UDCID")
		public NString RUdcid;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SOURCED_ID")
		public NString RSourcedId;
		@DbRecordField(dataSourceName="R_SPRIDEN_ID")
		public NString RSpridenId;
		@DbRecordField(dataSourceName="R_ORACLE_USER_ID")
		public NString ROracleUserId;
	}

	
	
}
