package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Peksnbl {
		public static NString fAccrueSeniorityInd(NString posnIn,NString earnCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKSNBL.F_ACCRUE_SENIORITY_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@POSN_IN", posnIn);
			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fOrderByPcls(NString posnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKSNBL.F_ORDER_BY_PCLS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@POSN_IN", posnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fOrderBySeqNo(NString jobpCodeIn,NString pclsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKSNBL.F_ORDER_BY_SEQ_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@JOBP_CODE_IN", jobpCodeIn);
			cmd.addParameter("@PCLS_CODE_IN", pclsCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pAccrueSeniorityHours(NString yearIn,NString pictCodeIn,NNumber paynoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKSNBL.P_ACCRUE_SENIORITY_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
			cmd.addParameter("@PAYNO_IN", paynoIn);
				
			cmd.execute();


		}
		
	
	
	
}
