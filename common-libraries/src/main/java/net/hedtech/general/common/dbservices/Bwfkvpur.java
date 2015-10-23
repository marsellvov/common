package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkvpur {
		public static NNumber fGetPoTotal(NString ponumber,NNumber changeseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVPUR.F_GET_PO_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PONUMBER", ponumber);
			cmd.addParameter("@CHANGESEQNO", changeseqno);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pDisplayPodaInfo(NString ponumber,NNumber changeseqno,NNumber podtItemIn,NString acctgType,NString userCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVPUR.P_DISPLAY_PODA_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PONUMBER", ponumber);
			cmd.addParameter("@CHANGESEQNO", changeseqno);
			cmd.addParameter("@PODT_ITEM_IN", podtItemIn);
			cmd.addParameter("@ACCTG_TYPE", acctgType);
			cmd.addParameter("@USER_CODE", userCode);
				
			cmd.execute();


		}
		
		public static void pDisplayPodtLabel(NNumber inCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVPUR.P_DISPLAY_PODT_LABEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_COUNT", inCount);
				
			cmd.execute();


		}
		
		public static void pViewpur(NString ponumber,NNumber subNumber,NNumber changeseqno,NString displayActg,NString displayText,NString commText,NString usercode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVPUR.P_VIEWPUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PONUMBER", ponumber);
			cmd.addParameter("@SUB_NUMBER", subNumber);
			cmd.addParameter("@CHANGESEQNO", changeseqno);
			cmd.addParameter("@DISPLAY_ACTG", displayActg);
			cmd.addParameter("@DISPLAY_TEXT", displayText);
			cmd.addParameter("@COMM_TEXT", commText);
			cmd.addParameter("@USERCODE", usercode);
				
			cmd.execute();


		}
		
	
	
	
}
