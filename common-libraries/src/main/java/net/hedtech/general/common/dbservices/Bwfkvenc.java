package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkvenc {
		public static NNumber fGetEncpTotal(NString docnumber,NNumber seqnum,NNumber _item) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVENC.F_GET_ENCP_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DOCNUMBER", docnumber);
			cmd.addParameter("@SEQNUM", seqnum);
			cmd.addParameter("@ITEM", _item);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pViewencb(NString docnumber,NNumber subnum,NString chngnum,NString displayActg,NString displayText,NString usercode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVENC.P_VIEWENCB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCNUMBER", docnumber);
			cmd.addParameter("@SUBNUM", subnum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@DISPLAY_ACTG", displayActg);
			cmd.addParameter("@DISPLAY_TEXT", displayText);
			cmd.addParameter("@USERCODE", usercode);
				
			cmd.execute();


		}
		
	
	
	
}
