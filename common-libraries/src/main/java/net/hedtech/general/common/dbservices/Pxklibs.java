package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pxklibs {
		public static NString fAppendSpaces(NString pLabel,NNumber pSpaceCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.F_APPEND_SPACES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LABEL", pLabel);
			cmd.addParameter("@P_SPACE_COUNT", pSpaceCount);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormatItem(NNumber pValue,NString pFormatMask) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.F_FORMAT_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_FORMAT_MASK", pFormatMask);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetEmplAddr(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.F_GET_EMPL_ADDR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetEmplAddress(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.F_GET_EMPL_ADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetEmplData(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.F_GET_EMPL_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetEmprData(NString pEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.F_GET_EMPR_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fGetEmprId(NString pEmprId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.F_GET_EMPR_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMPR_ID", pEmprId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetfilingstatusdesc(NString txcdCode,NString fstaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.F_GETFILINGSTATUSDESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TXCD_CODE", txcdCode);
			cmd.addParameter("@FSTA_CODE", fstaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pPrinttext(NString text,NString classIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.P_PRINTTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEXT", text);
			cmd.addParameter("@CLASS_IN", classIn);
				
			cmd.execute();


		}
		
		public static void pSendreqW4(NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate,NString pEmprCode,Ref<NString> pPipeName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.P_SENDREQ_W4", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIPE_NAME", NString.class);
				
			cmd.execute();
			pPipeName.val = cmd.getParameterValue("@P_PIPE_NAME", NString.class);


		}
		
		public static void pShowreqW4(NString pPipeName,NString pSessId,NString pUserName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.P_SHOWREQ_W4", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIPE_NAME", pPipeName);
			cmd.addParameter("@P_SESS_ID", pSessId);
			cmd.addParameter("@P_USER_NAME", pUserName);
				
			cmd.execute();


		}
		
		public static void pW2PrinterCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.P_W2_PRINTER_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2ScreenCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.P_W2_SCREEN_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2cPrinterCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.P_W2C_PRINTER_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2cScreenCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKLIBS.P_W2C_SCREEN_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
