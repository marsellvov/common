package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkvreq {
		public static NNumber fGetReqTotal(NString reqnumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVREQ.F_GET_REQ_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@REQNUMBER", reqnumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pDisplayReqaInfo(NString reqnumber,NNumber reqdItem,NString acctgType,NString userCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVREQ.P_DISPLAY_REQA_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQNUMBER", reqnumber);
			cmd.addParameter("@REQD_ITEM", reqdItem);
			cmd.addParameter("@ACCTG_TYPE", acctgType);
			cmd.addParameter("@USER_CODE", userCode);
				
			cmd.execute();


		}
		
		public static void pDisplayReqdLabel() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVREQ.P_DISPLAY_REQD_LABEL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewreq(NString reqnumber,NNumber subnum,NNumber chngnum,NString displayActg,NString displayText,NString commText,NString usercode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVREQ.P_VIEWREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQNUMBER", reqnumber);
			cmd.addParameter("@SUBNUM", subnum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@DISPLAY_ACTG", displayActg);
			cmd.addParameter("@DISPLAY_TEXT", displayText);
			cmd.addParameter("@COMM_TEXT", commText);
			cmd.addParameter("@USERCODE", usercode);
				
			cmd.execute();


		}
		
	
	
	
}
