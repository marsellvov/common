package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokprec {
		public static void pOpenPtrdfprRc(Ref<DataCursor> pRcInout,NString pDfprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKPREC.P_OPEN_PTRDFPR_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_DFPR_CODE", pDfprCode);
				
			cmd.execute();
			pRcInout.val = cmd.getParameterValue("@P_RC_INOUT", DataCursor.class);


		}
		
		public static void pOpenPtreclcRc(Ref<DataCursor> pRcInout,NString pEclsCode,NString pLcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKPREC.P_OPEN_PTRECLC_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
				
			cmd.execute();
			pRcInout.val = cmd.getParameterValue("@P_RC_INOUT", DataCursor.class);


		}
		
		public static void pOpenPtrlocnRc(Ref<DataCursor> pRcInout,NString pLocnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKPREC.P_OPEN_PTRLOCN_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
				
			cmd.execute();
			pRcInout.val = cmd.getParameterValue("@P_RC_INOUT", DataCursor.class);


		}
		
		public static void pOpenPtrlreaRc(Ref<DataCursor> pRcInout,NString pLreaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKPREC.P_OPEN_PTRLREA_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_LREA_CODE", pLreaCode);
				
			cmd.execute();
			pRcInout.val = cmd.getParameterValue("@P_RC_INOUT", DataCursor.class);


		}
		
		public static void pOpenPtrschlRc(Ref<DataCursor> pRcInout,NString pSchlCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKPREC.P_OPEN_PTRSCHL_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_SCHL_CODE", pSchlCode);
				
			cmd.execute();
			pRcInout.val = cmd.getParameterValue("@P_RC_INOUT", DataCursor.class);


		}
		
	
	
	
}
