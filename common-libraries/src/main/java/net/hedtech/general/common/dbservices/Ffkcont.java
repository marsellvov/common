package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ffkcont {
		public static NNumber fCountAcctRec(NString pHeader,NString pAcctTable,NString pDocCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKCONT.F_COUNT_ACCT_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_HEADER", pHeader);
			cmd.addParameter("@P_ACCT_TABLE", pAcctTable);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
