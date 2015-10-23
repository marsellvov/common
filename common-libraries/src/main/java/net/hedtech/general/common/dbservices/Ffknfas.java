package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ffknfas {
		public static NString fNoAcctAssetF(NString pHeader,NString pAcctT,NString pDocCode,NNumber pItem,NDate pEffDT) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKNFAS.F_NO_ACCT_ASSET_F", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HEADER", pHeader);
			cmd.addParameter("@P_ACCT_T", pAcctT);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_EFF_D_T", pEffDT);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
