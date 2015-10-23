package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkrecs {
//		public static NbbposnRectypeRow fNbbposnRec(NString posnIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKRECS.F_NBBPOSN_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(NbbposnRectypeRow.class));
//			cmd.addParameter("@POSN_IN", posnIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NbbposnRectypeRow.class);
//
//		}
		
//		public static NbrbjobRectypeRow fNbrbjobRec(NNumber pidmIn,NString posnIn,NString suffIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKRECS.F_NBRBJOB_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(NbrbjobRectypeRow.class));
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@POSN_IN", posnIn);
//			cmd.addParameter("@SUFF_IN", suffIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NbrbjobRectypeRow.class);
//
//		}
		
//		public static NbrjobsRectypeRow fNbrjobsRec(NNumber pidmIn,NString posnIn,NString suffIn,NDate effDateIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKRECS.F_NBRJOBS_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(NbrjobsRectypeRow.class));
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@POSN_IN", posnIn);
//			cmd.addParameter("@SUFF_IN", suffIn);
//			cmd.addParameter("@EFF_DATE_IN", effDateIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NbrjobsRectypeRow.class);
//
//		}
		
	
	
	@DbRecordType(id="AttributeRectypeRow", dataSourceName="ATTRIBUTE_RECTYPE")
	public static class AttributeRectypeRow
	{
		@DbRecordField(dataSourceName="FOUND")
		public NBool Found;
		@DbRecordField(dataSourceName="NOTFOUND")
		public NBool Notfound;
	}

	
	
}
