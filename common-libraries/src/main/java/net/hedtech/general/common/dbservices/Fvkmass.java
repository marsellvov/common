package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fvkmass {
		public static void pReplicateValue(NString pTable,NString pColumn,NString pValChar,NNumber pValNum,NDate pValDate,NString pOtagCode,NString pAction,NString pSession,NNumber pKey1,NString pKey2,NString pKey3,Ref<NString> pMessage,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKMASS.P_REPLICATE_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN", pColumn);
			cmd.addParameter("@P_VAL_CHAR", pValChar);
			cmd.addParameter("@P_VAL_NUM", pValNum);
			cmd.addParameter("@P_VAL_DATE", pValDate);
			cmd.addParameter("@P_OTAG_CODE", pOtagCode);
			cmd.addParameter("@P_ACTION", pAction);
			cmd.addParameter("@P_SESSION", pSession);
			cmd.addParameter("@P_KEY1", pKey1);
			cmd.addParameter("@P_KEY2", pKey2);
			cmd.addParameter("@P_KEY3", pKey3);
			cmd.addParameter("@P_MESSAGE", pMessage, true);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg, true);
				
			cmd.execute();
			pMessage.val = cmd.getParameterValue("@P_MESSAGE", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
	
	
	
}
