package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Apkwind {
		public static NString fGetAddressChangesInd(NNumber pidmIn,NString user,NDate startDate,NDate endDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKWIND.F_GET_ADDRESS_CHANGES_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@START_DATE", startDate);
			cmd.addParameter("@END_DATE", endDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetChildChangesInd(NNumber pidmIn,NString user,NDate startDate,NDate endDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKWIND.F_GET_CHILD_CHANGES_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@START_DATE", startDate);
			cmd.addParameter("@END_DATE", endDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCommentChangesInd(NNumber pidmIn,NString user,NDate startDate,NDate endDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKWIND.F_GET_COMMENT_CHANGES_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@START_DATE", startDate);
			cmd.addParameter("@END_DATE", endDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDegreeChangesInd(NNumber pidmIn,NString user,NDate startDate,NDate endDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKWIND.F_GET_DEGREE_CHANGES_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@START_DATE", startDate);
			cmd.addParameter("@END_DATE", endDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEmploymentChangesInd(NNumber pidmIn,NString user,NDate startDate,NDate endDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("APKWIND.F_GET_EMPLOYMENT_CHANGES_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@START_DATE", startDate);
			cmd.addParameter("@END_DATE", endDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
