package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwaknhis {
		public static void pViewGifts() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNHIS.P_VIEW_GIFTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewgiftDetail(NString giftNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNHIS.P_VIEWGIFT_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GIFT_NO", giftNo);
				
			cmd.execute();


		}
		
	
	
	
}
