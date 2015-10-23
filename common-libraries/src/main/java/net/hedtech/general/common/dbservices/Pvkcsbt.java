package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pvkcsbt {
		public static NNumber fGetTranId(NString pYear,NString pPictCode,NNumber pPayNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKCSBT.F_GET_TRAN_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAY_NO", pPayNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetTranId(NNumber pTranId,NString pTranType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKCSBT.F_GET_TRAN_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TRAN_ID", pTranId);
			cmd.addParameter("@P_TRAN_TYPE", pTranType);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
