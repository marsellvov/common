package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ffkbadg {
		public static NBool fESE3600(NString fsyrCode,NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKBADG.F_E$_S_E_3600", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fPreQueryFbbblin(NString coasCode,NString budgActvDate,Ref<NString> fsyrCode,Ref<NString> currYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKBADG.F_PRE_QUERY_FBBBLIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@BUDG_ACTV_DATE", budgActvDate);
			cmd.addParameter("@FSYR_CODE", fsyrCode, true);
			cmd.addParameter("@CURR_YEAR", currYear, true);
				
			cmd.execute();
			fsyrCode.val = cmd.getParameterValue("@FSYR_CODE", NString.class);
			currYear.val = cmd.getParameterValue("@CURR_YEAR", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSelectDual11(NString encdNum,NNumber encdItemNum,NNumber encdSeqNum,NString fsyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKBADG.F_SELECT_DUAL_11", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ENCD_NUM", encdNum);
			cmd.addParameter("@ENCD_ITEM_NUM", encdItemNum);
			cmd.addParameter("@ENCD_SEQ_NUM", encdSeqNum);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSelectFgbencp8(NString encdNum,NNumber encdItemNum,NNumber encdSeqNum,NString fsyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKBADG.F_SELECT_FGBENCP_8", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ENCD_NUM", encdNum);
			cmd.addParameter("@ENCD_ITEM_NUM", encdItemNum);
			cmd.addParameter("@ENCD_SEQ_NUM", encdSeqNum);
			cmd.addParameter("@FSYR_CODE", fsyrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
