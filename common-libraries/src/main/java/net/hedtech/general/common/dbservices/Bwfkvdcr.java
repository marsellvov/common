package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkvdcr {
		public static void pDisplayCshdInfo(NString docnumber,NString userCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVDCR.P_DISPLAY_CSHD_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCNUMBER", docnumber);
			cmd.addParameter("@USER_CODE", userCode);
				
			cmd.execute();


		}
		
		public static void pViewdcsr(NString docnumber,NNumber subNum,NNumber chngnum,NString displayActg,NString displayText,NString usercode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVDCR.P_VIEWDCSR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCNUMBER", docnumber);
			cmd.addParameter("@SUB_NUM", subNum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@DISPLAY_ACTG", displayActg);
			cmd.addParameter("@DISPLAY_TEXT", displayText);
			cmd.addParameter("@USERCODE", usercode);
				
			cmd.execute();


		}
		
	
	
	
}
