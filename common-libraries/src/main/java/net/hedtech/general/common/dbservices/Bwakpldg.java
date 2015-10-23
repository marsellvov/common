package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakpldg {
		public static void pAddAPledge(NString campaignDesgAmt1,NString campaignDesg1,NString spsSplitInd,NString pdurCode,NString freqCode,NString billDate,NString commentText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKPLDG.P_ADD_A_PLEDGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAMPAIGN_DESG_AMT1", campaignDesgAmt1);
			cmd.addParameter("@CAMPAIGN_DESG1", campaignDesg1);
			cmd.addParameter("@SPS_SPLIT_IND", spsSplitInd);
			cmd.addParameter("@PDUR_CODE", pdurCode);
			cmd.addParameter("@FREQ_CODE", freqCode);
			cmd.addParameter("@BILL_DATE", billDate);
			cmd.addParameter("@COMMENT_TEXT", commentText);
				
			cmd.execute();


		}
		
		public static void pInsertAPledge(NString campaignDesgAmt1,NString campaignDesg1,NString spsSplitInd,NString pdurCode,NString freqCode,NString billDate,NString commentText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKPLDG.P_INSERT_A_PLEDGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAMPAIGN_DESG_AMT1", campaignDesgAmt1);
			cmd.addParameter("@CAMPAIGN_DESG1", campaignDesg1);
			cmd.addParameter("@SPS_SPLIT_IND", spsSplitInd);
			cmd.addParameter("@PDUR_CODE", pdurCode);
			cmd.addParameter("@FREQ_CODE", freqCode);
			cmd.addParameter("@BILL_DATE", billDate);
			cmd.addParameter("@COMMENT_TEXT", commentText);
				
			cmd.execute();


		}
		
	
	
	
}
