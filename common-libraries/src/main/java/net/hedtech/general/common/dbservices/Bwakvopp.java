package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakvopp {
		public static void pAddcontactResults(NString msgText,NNumber msgLevel,NNumber consPidm,NString campaign,NString solcCode,NString solOrg,NNumber ctypSeqNo,NNumber dcyrCode,NString scntCode,NString scrsCode,NString responseDate,NString askAmount,NString commentText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKVOPP.P_ADDCONTACT_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_TEXT", msgText);
			cmd.addParameter("@MSG_LEVEL", msgLevel);
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@CAMPAIGN", campaign);
			cmd.addParameter("@SOLC_CODE", solcCode);
			cmd.addParameter("@SOL_ORG", solOrg);
			cmd.addParameter("@CTYP_SEQ_NO", ctypSeqNo);
			cmd.addParameter("@DCYR_CODE", dcyrCode);
			cmd.addParameter("@SCNT_CODE", scntCode);
			cmd.addParameter("@SCRS_CODE", scrsCode);
			cmd.addParameter("@RESPONSE_DATE", responseDate);
			cmd.addParameter("@ASK_AMOUNT", askAmount);
			cmd.addParameter("@COMMENT_TEXT", commentText);
				
			cmd.execute();


		}
		
		public static void pInsertcontactResults(NNumber consPidm,NString campaign,NString solcCode,NString solOrg,NNumber ctypSeqNo,NNumber dcyrCode,NString scntCode,NString scrsCode,NString responseDate,NString askAmount,NString commentText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKVOPP.P_INSERTCONTACT_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@CAMPAIGN", campaign);
			cmd.addParameter("@SOLC_CODE", solcCode);
			cmd.addParameter("@SOL_ORG", solOrg);
			cmd.addParameter("@CTYP_SEQ_NO", ctypSeqNo);
			cmd.addParameter("@DCYR_CODE", dcyrCode);
			cmd.addParameter("@SCNT_CODE", scntCode);
			cmd.addParameter("@SCRS_CODE", scrsCode);
			cmd.addParameter("@RESPONSE_DATE", responseDate);
			cmd.addParameter("@ASK_AMOUNT", askAmount);
			cmd.addParameter("@COMMENT_TEXT", commentText);
				
			cmd.execute();


		}
		
		public static void pSelcontact() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKVOPP.P_SELCONTACT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewContactDetail(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKVOPP.P_VIEW_CONTACT_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pViewcontactResults(NNumber consPidm,NString campaign,NString solcCode,NString solOrg,NNumber ctypSeqNo,NNumber dcyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKVOPP.P_VIEWCONTACT_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@CAMPAIGN", campaign);
			cmd.addParameter("@SOLC_CODE", solcCode);
			cmd.addParameter("@SOL_ORG", solOrg);
			cmd.addParameter("@CTYP_SEQ_NO", ctypSeqNo);
			cmd.addParameter("@DCYR_CODE", dcyrCode);
				
			cmd.execute();


		}
		
		public static void pViewcontacts() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKVOPP.P_VIEWCONTACTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
