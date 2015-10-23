package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokgtrn {
		public static NString fGetBanner8GlobalName(NString param) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKGTRN.F_GET_BANNER8_GLOBAL_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM", param);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetBanner9GlobalName(NString param) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKGTRN.F_GET_BANNER9_GLOBAL_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM", param);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCntxNameByGlobal8(NString param) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKGTRN.F_GET_CNTX_NAME_BY_GLOBAL8", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM", param);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCntxNameByGlobal9(NString param) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKGTRN.F_GET_CNTX_NAME_BY_GLOBAL9", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM", param);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
