package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdkpsrc {
		public static void pAlternateNames(NNumber consPidm,NString backUrl,NNumber backStartRecords) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPSRC.P_ALTERNATE_NAMES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@BACK_URL", backUrl);
			cmd.addParameter("@BACK_START_RECORDS", backStartRecords);
				
			cmd.execute();


		}
		
		public static void pDisplayPopSelIds(NString moreBtn,NNumber backStartRecords,NString application,NString selection,NString creatorId,NString popSelUser,NString persOrgInd,NNumber howMany) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPSRC.P_DISPLAY_POP_SEL_IDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MORE_BTN", moreBtn);
			cmd.addParameter("@BACK_START_RECORDS", backStartRecords);
			cmd.addParameter("@APPLICATION", application);
			cmd.addParameter("@SELECTION", selection);
			cmd.addParameter("@CREATOR_ID", creatorId);
			cmd.addParameter("@POP_SEL_USER", popSelUser);
			cmd.addParameter("@PERS_ORG_IND", persOrgInd);
			cmd.addParameter("@HOW_MANY", howMany);
				
			cmd.execute();


		}
		
		public static void pPopSelIds(NString application,NString selection,NString creatorId,NString popSelUser,NString persOrgInd,NNumber howMany,NString moreBtn,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPSRC.P_POP_SEL_IDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPLICATION", application);
			cmd.addParameter("@SELECTION", selection);
			cmd.addParameter("@CREATOR_ID", creatorId);
			cmd.addParameter("@POP_SEL_USER", popSelUser);
			cmd.addParameter("@PERS_ORG_IND", persOrgInd);
			cmd.addParameter("@HOW_MANY", howMany);
			cmd.addParameter("@MORE_BTN", moreBtn);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pPopSelSelect(NString application,NString selection,NString creatorId,NString popSelUser,NString persOrgInd,NNumber howMany) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPSRC.P_POP_SEL_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPLICATION", application);
			cmd.addParameter("@SELECTION", selection);
			cmd.addParameter("@CREATOR_ID", creatorId);
			cmd.addParameter("@POP_SEL_USER", popSelUser);
			cmd.addParameter("@PERS_ORG_IND", persOrgInd);
			cmd.addParameter("@HOW_MANY", howMany);
				
			cmd.execute();


		}
		
		public static void pSearchResults(NNumber pidm,NString backUrl,NNumber backStartRecords) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPSRC.P_SEARCH_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@BACK_URL", backUrl);
			cmd.addParameter("@BACK_START_RECORDS", backStartRecords);
				
			cmd.execute();


		}
		
	
	
	
}
