package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkhreg {
		public static void pFacRegHist(NString xyz) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKHREG.P_FAC_REG_HIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XYZ", xyz);
				
			cmd.execute();


		}
		
	
	
	
}
