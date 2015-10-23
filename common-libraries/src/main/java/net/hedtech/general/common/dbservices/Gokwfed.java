package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokwfed {
		public static NString fGetAccess(NNumber transNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.F_GET_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_NO", transNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCellValue(NNumber transNoV,NString codeV,NNumber pageV,NString xV,NNumber yV) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.F_GET_CELL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_NO_V", transNoV);
			cmd.addParameter("@CODE_V", codeV);
			cmd.addParameter("@PAGE_V", pageV);
			cmd.addParameter("@X_V", xV);
			cmd.addParameter("@Y_V", yV);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCellValueCollector(NNumber transNoV,NString codeV,NNumber pageV,NString xV,NNumber yV) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.F_GET_CELL_VALUE_COLLECTOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_NO_V", transNoV);
			cmd.addParameter("@CODE_V", codeV);
			cmd.addParameter("@PAGE_V", pageV);
			cmd.addParameter("@X_V", xV);
			cmd.addParameter("@Y_V", yV);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCodeDesc(NString code) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.F_GET_CODE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CODE", code);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDefaultValue(NString docCodeV,NNumber pageV,NString xV,NNumber yV) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.F_GET_DEFAULT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOC_CODE_V", docCodeV);
			cmd.addParameter("@PAGE_V", pageV);
			cmd.addParameter("@X_V", xV);
			cmd.addParameter("@Y_V", yV);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTransCode(NNumber transNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.F_GET_TRANS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANS_NO", transNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pApplyTransStatus(NNumber transNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.P_APPLY_TRANS_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO", transNo);
				
			cmd.execute();


		}
		
		public static void pGetDefaultValue(NNumber transNo,NString docCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.P_GET_DEFAULT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@DOC_CODE", docCode);
				
			cmd.execute();


		}
		
		public static void pUpdateCell(NNumber transNoV,NString codeV,NNumber pageV,NString xV,NNumber yV,NString valueV) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.P_UPDATE_CELL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO_V", transNoV);
			cmd.addParameter("@CODE_V", codeV);
			cmd.addParameter("@PAGE_V", pageV);
			cmd.addParameter("@X_V", xV);
			cmd.addParameter("@Y_V", yV);
			cmd.addParameter("@VALUE_V", valueV);
				
			cmd.execute();


		}
		
		public static void pUpdateCellCollector(NNumber transNoV,NString codeV,NNumber pageV,NString xV,NNumber yV,NString valueV) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.P_UPDATE_CELL_COLLECTOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO_V", transNoV);
			cmd.addParameter("@CODE_V", codeV);
			cmd.addParameter("@PAGE_V", pageV);
			cmd.addParameter("@X_V", xV);
			cmd.addParameter("@Y_V", yV);
			cmd.addParameter("@VALUE_V", valueV);
				
			cmd.execute();


		}
		
		public static void pUpdateTransStatus(NNumber transNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKWFED.P_UPDATE_TRANS_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO", transNo);
				
			cmd.execute();


		}
		
	
	
	
}
