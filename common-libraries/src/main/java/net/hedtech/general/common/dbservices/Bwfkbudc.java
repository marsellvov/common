package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkbudc {
		public static NString fReplaceTitle(NString pTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBUDC.F_REPLACE_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TITLE", pTitle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pStartupMask(NString pFormName,NString pBlockName,NString pItemName,NString pUser,NString pData,NString pItemLabel,NNumber pItemLength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBUDC.P_STARTUP_MASK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_ITEM_NAME", pItemName);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_ITEM_LABEL", pItemLabel);
			cmd.addParameter("@P_ITEM_LENGTH", pItemLength);
				
			cmd.execute();


		}
		
	
	
	
}
