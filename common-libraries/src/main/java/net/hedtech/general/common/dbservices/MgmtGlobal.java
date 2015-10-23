package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtGlobal {
		public static NDate FadjustTz(NDate dateIn,NString srcTzrgnIn,NString dstTzrgnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_GLOBAL.ADJUST_TZ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@DATE_IN", dateIn);
			cmd.addParameter("@SRC_TZRGN_IN", srcTzrgnIn);
			cmd.addParameter("@DST_TZRGN_IN", dstTzrgnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber FcheckOverlap(NDate dateIn,NString tzrgnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_GLOBAL.CHECK_OVERLAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DATE_IN", dateIn);
			cmd.addParameter("@TZRGN_IN", tzrgnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber FelapsedTimeMsec( startTimestampIn, endTimestampIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_GLOBAL.ELAPSED_TIME_MSEC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@START_TIMESTAMP_IN", startTimestampIn);
//			cmd.addParameter("@END_TIMESTAMP_IN", endTimestampIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NDate fromUtc(NDate utcDateIn,NString dstTzrgnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_GLOBAL.FROM_UTC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@UTC_DATE_IN", utcDateIn);
			cmd.addParameter("@DST_TZRGN_IN", dstTzrgnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
//		public static byte[] FgetCompositeKeyGuid(List<SmpEmdStringArrayRow> keyPartValuesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_GLOBAL.GET_COMPOSITE_KEY_GUID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(byte[].class);
//			// cmd.addParameter(DbTypes.getCollectionType("KEY_PART_VALUES_IN", "", keyPartValuesIn, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(byte[].class);
//
//		}
		
		public static NNumber FisEquivalentTz(NString pTimezone1,NString pTimezone2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_GLOBAL.IS_EQUIVALENT_TZ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TIMEZONE1", pTimezone1);
			cmd.addParameter("@P_TIMEZONE2", pTimezone2);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate FsysdateTzrgn(NString tzrgnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_GLOBAL.SYSDATE_TZRGN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@TZRGN_IN", tzrgnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate FsysdateUtc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_GLOBAL.SYSDATE_UTC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate FtoUtc(NDate dateIn,NString srcTzrgnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_GLOBAL.TO_UTC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@DATE_IN", dateIn);
			cmd.addParameter("@SRC_TZRGN_IN", srcTzrgnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
	
	
	
}
