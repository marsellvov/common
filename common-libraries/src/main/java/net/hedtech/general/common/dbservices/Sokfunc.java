package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokfunc {
		public static NString fGetIdprefix(NString functionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKFUNC.F_GET_IDPREFIX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FUNCTION_IN", functionIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetPrimaryCurrData(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKFUNC.F_GET_PRIMARY_CURR_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	@DbRecordType(id="PrimaryCurrRecRow", dataSourceName="PRIMARY_CURR_REC")
	public static class PrimaryCurrRecRow
	{
		@DbRecordField(dataSourceName="R_FULL_PART_IND")
		public NString RFullPartInd;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_PRIMARY_MAJOR_CODE")
		public NString RPrimaryMajorCode;
		@DbRecordField(dataSourceName="R_SECONDARY_MAJOR_CODE")
		public NString RSecondaryMajorCode;
		@DbRecordField(dataSourceName="R_MINOR_CODE")
		public NString RMinorCode;
	}

	
	
}
