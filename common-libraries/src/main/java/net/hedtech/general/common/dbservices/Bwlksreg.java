package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlksreg {
		public static void pFacActiveRegs(NString xyz) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKSREG.P_FAC_ACTIVE_REGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XYZ", xyz);
				
			cmd.execute();


		}
		
	
	
	
}
