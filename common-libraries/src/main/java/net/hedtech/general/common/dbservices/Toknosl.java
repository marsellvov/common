package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Toknosl {
		public static NBool fFoundOnAllObjects(NString pOwner,NString pObjectName,NString pObjectType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKNOSL.F_FOUND_ON_ALL_OBJECTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_OBJECT_NAME", pObjectName);
			cmd.addParameter("@P_OBJECT_TYPE", pObjectType);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pTbrcmisNosleepAir(NString pProcess,NString pPrinterParmNo,NString pNosleepUserId,NString pJprmCode,NString pNewTbrcmisPrinter,NNumber pNewTbrcmisReceiptNumber,NString pNewTbrcmisDuplicateInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKNOSL.P_TBRCMIS_NOSLEEP_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PRINTER_PARM_NO", pPrinterParmNo);
			cmd.addParameter("@P_NOSLEEP_USER_ID", pNosleepUserId);
			cmd.addParameter("@P_JPRM_CODE", pJprmCode);
			cmd.addParameter("@P_NEW_TBRCMIS_PRINTER", pNewTbrcmisPrinter);
			cmd.addParameter("@P_NEW_TBRCMIS_RECEIPT_NUMBER", pNewTbrcmisReceiptNumber);
			cmd.addParameter("@P_NEW_TBRCMIS_DUPLICATE_IND", pNewTbrcmisDuplicateInd);
				
			cmd.execute();


		}
		
		public static void pTbrcrcpNosleepAir(NString pProcess,NString pPrinterParmNo,NString pNosleepUserId,NString pJprmCode,NString pNewTbrcrcpPrinter,NNumber pNewTbrcrcpReceiptNumber,NString pNewTbrcrcpDuplicateInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKNOSL.P_TBRCRCP_NOSLEEP_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PRINTER_PARM_NO", pPrinterParmNo);
			cmd.addParameter("@P_NOSLEEP_USER_ID", pNosleepUserId);
			cmd.addParameter("@P_JPRM_CODE", pJprmCode);
			cmd.addParameter("@P_NEW_TBRCRCP_PRINTER", pNewTbrcrcpPrinter);
			cmd.addParameter("@P_NEW_TBRCRCP_RECEIPT_NUMBER", pNewTbrcrcpReceiptNumber);
			cmd.addParameter("@P_NEW_TBRCRCP_DUPLICATE_IND", pNewTbrcrcpDuplicateInd);
				
			cmd.execute();


		}
		
		public static void pTbrcsumNosleepAir(NString pProcess,NString pPrinterParmNo,NString pNosleepUserId,NString pJprmCode,NString pNewTbrcsumPrinter,NNumber pNewTbrcsumPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKNOSL.P_TBRCSUM_NOSLEEP_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_PRINTER_PARM_NO", pPrinterParmNo);
			cmd.addParameter("@P_NOSLEEP_USER_ID", pNosleepUserId);
			cmd.addParameter("@P_JPRM_CODE", pJprmCode);
			cmd.addParameter("@P_NEW_TBRCSUM_PRINTER", pNewTbrcsumPrinter);
			cmd.addParameter("@P_NEW_TBRCSUM_PIDM", pNewTbrcsumPidm);
				
			cmd.execute();


		}
		
	
	
	
}
