package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokarts {
		public static void pAgbgiftAdr(NString oldId,NString oldGiftNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_AGBGIFT_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@OLD_GIFT_NO", oldGiftNo);
				
			cmd.execute();


		}
		
		public static void pAgbgiftAir(NString newId,NString newGiftNo,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_AGBGIFT_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@NEW_GIFT_NO", newGiftNo);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pAgbgiftAur(NString newId,NString oldId,NString newGiftNo,NString oldGiftNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_AGBGIFT_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_GIFT_NO", newGiftNo);
			cmd.addParameter("@OLD_GIFT_NO", oldGiftNo);
				
			cmd.execute();


		}
		
		public static void pAgbpldgAdr(NString oldId,NString oldPledgeNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_AGBPLDG_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@OLD_PLEDGE_NO", oldPledgeNo);
				
			cmd.execute();


		}
		
		public static void pAgbpldgAir(NString newId,NString newPledgeNo,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_AGBPLDG_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@NEW_PLEDGE_NO", newPledgeNo);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pAgbpldgAur(NString newId,NString oldId,NString newPledgeNo,NString oldPledgeNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_AGBPLDG_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_PLEDGE_NO", newPledgeNo);
			cmd.addParameter("@OLD_PLEDGE_NO", oldPledgeNo);
				
			cmd.execute();


		}
		
		public static void pAgrgpayAdr(NString oldId,NString oldPledgeNo,NString oldGiftNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_AGRGPAY_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@OLD_PLEDGE_NO", oldPledgeNo);
			cmd.addParameter("@OLD_GIFT_NO", oldGiftNo);
				
			cmd.execute();


		}
		
		public static void pAgrgpayAir(NString newId,NString newPledgeNo,NString newGiftNo,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_AGRGPAY_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@NEW_PLEDGE_NO", newPledgeNo);
			cmd.addParameter("@NEW_GIFT_NO", newGiftNo);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pAgrgpayAur(NString newId,NString oldId,NString newPledgeNo,NString oldPledgeNo,NString newGiftNo,NString oldGiftNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_AGRGPAY_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_PLEDGE_NO", newPledgeNo);
			cmd.addParameter("@OLD_PLEDGE_NO", oldPledgeNo);
			cmd.addParameter("@NEW_GIFT_NO", newGiftNo);
			cmd.addParameter("@OLD_GIFT_NO", oldGiftNo);
				
			cmd.execute();


		}
		
		public static void pSpridenAir(NNumber newPidm,NString newId,NString chgInd,NString newFirstname,NString newLastname,NString newSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_SPRIDEN_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@CHG_IND", chgInd);
			cmd.addParameter("@NEW_FIRSTNAME", newFirstname);
			cmd.addParameter("@NEW_LASTNAME", newLastname);
			cmd.addParameter("@NEW_SURNAME_PREFIX", newSurnamePrefix);
				
			cmd.execute();


		}
		
		public static void pSpridenAur(NNumber newPidm,NNumber oldPidm,NString newId,NString oldId,NString chgInd,NString newFirstname,NString oldFirstname,NString newLastname,NString oldLastname,NString newSurnamePrefix,NString oldSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKARTS.P_SPRIDEN_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@OLD_PIDM", oldPidm);
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@CHG_IND", chgInd);
			cmd.addParameter("@NEW_FIRSTNAME", newFirstname);
			cmd.addParameter("@OLD_FIRSTNAME", oldFirstname);
			cmd.addParameter("@NEW_LASTNAME", newLastname);
			cmd.addParameter("@OLD_LASTNAME", oldLastname);
			cmd.addParameter("@NEW_SURNAME_PREFIX", newSurnamePrefix);
			cmd.addParameter("@OLD_SURNAME_PREFIX", oldSurnamePrefix);
				
			cmd.execute();


		}
		
	
	
	
}
