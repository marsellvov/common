package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokrrts {
		public static NString fGetEnaRtvtrstSyncInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.F_GET_ENA_RTVTRST_SYNC_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRfrbaseAir(NString newFundCode,NString newFundActiveInd,NString newFundVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_RFRBASE_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_FUND_CODE", newFundCode);
			cmd.addParameter("@NEW_FUND_ACTIVE_IND", newFundActiveInd);
			cmd.addParameter("@NEW_FUND_VPDI_CODE", newFundVpdiCode);
				
			cmd.execute();


		}
		
		public static void pRfrbaseAur(NString newFundCode,NString oldFundCode,NString newFundActiveInd,NString oldFundActiveInd,NString newFundVpdiCode,NString oldFundVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_RFRBASE_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_FUND_CODE", newFundCode);
			cmd.addParameter("@OLD_FUND_CODE", oldFundCode);
			cmd.addParameter("@NEW_FUND_ACTIVE_IND", newFundActiveInd);
			cmd.addParameter("@OLD_FUND_ACTIVE_IND", oldFundActiveInd);
			cmd.addParameter("@NEW_FUND_VPDI_CODE", newFundVpdiCode);
			cmd.addParameter("@OLD_FUND_VPDI_CODE", oldFundVpdiCode);
				
			cmd.execute();


		}
		
		public static void pRobinstAir(NString newAidyCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_ROBINST_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_AIDY_CODE", newAidyCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pRobinstAur(NString newAidyCode,NString oldAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_ROBINST_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_AIDY_CODE", newAidyCode);
			cmd.addParameter("@OLD_AIDY_CODE", oldAidyCode);
				
			cmd.execute();


		}
		
		public static void pRobprdsAir(NString newPeriod,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_ROBPRDS_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PERIOD", newPeriod);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pRobprdsAur(NString newPeriod,NString oldPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_ROBPRDS_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PERIOD", newPeriod);
			cmd.addParameter("@OLD_PERIOD", oldPeriod);
				
			cmd.execute();


		}
		
		public static void pRrrareqAdr(NString oldId,NString oldAidyCode,NString oldTreqCode,NString oldFundCode,NString oldSbgiCode,NString oldPeriod,NString oldVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_RRRAREQ_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@OLD_AIDY_CODE", oldAidyCode);
			cmd.addParameter("@OLD_TREQ_CODE", oldTreqCode);
			cmd.addParameter("@OLD_FUND_CODE", oldFundCode);
			cmd.addParameter("@OLD_SBGI_CODE", oldSbgiCode);
			cmd.addParameter("@OLD_PERIOD", oldPeriod);
			cmd.addParameter("@OLD_VPDI_CODE", oldVpdiCode);
				
			cmd.execute();


		}
		
		public static void pRrrareqAir(NString newId,NString newAidyCode,NString newTreqCode,NString newFundCode,NString newSbgiCode,NString newPeriod,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_RRRAREQ_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@NEW_AIDY_CODE", newAidyCode);
			cmd.addParameter("@NEW_TREQ_CODE", newTreqCode);
			cmd.addParameter("@NEW_FUND_CODE", newFundCode);
			cmd.addParameter("@NEW_SBGI_CODE", newSbgiCode);
			cmd.addParameter("@NEW_PERIOD", newPeriod);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pRrrareqAur(NString newId,NString oldId,NString newAidyCode,NString oldAidyCode,NString newTreqCode,NString oldTreqCode,NString newFundCode,NString oldFundCode,NString newSbgiCode,NString oldSbgiCode,NString newPeriod,NString oldPeriod,NString newVpdiCode,NString oldVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_RRRAREQ_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_AIDY_CODE", newAidyCode);
			cmd.addParameter("@OLD_AIDY_CODE", oldAidyCode);
			cmd.addParameter("@NEW_TREQ_CODE", newTreqCode);
			cmd.addParameter("@OLD_TREQ_CODE", oldTreqCode);
			cmd.addParameter("@NEW_FUND_CODE", newFundCode);
			cmd.addParameter("@OLD_FUND_CODE", oldFundCode);
			cmd.addParameter("@NEW_SBGI_CODE", newSbgiCode);
			cmd.addParameter("@OLD_SBGI_CODE", oldSbgiCode);
			cmd.addParameter("@NEW_PERIOD", newPeriod);
			cmd.addParameter("@OLD_PERIOD", oldPeriod);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
			cmd.addParameter("@OLD_VPDI_CODE", oldVpdiCode);
				
			cmd.execute();


		}
		
		public static void pRtvtreqAir(NString newTreqCode,NString newTreqActiveInd,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_RTVTREQ_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TREQ_CODE", newTreqCode);
			cmd.addParameter("@NEW_TREQ_ACTIVE_IND", newTreqActiveInd);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pRtvtreqAur(NString newTreqCode,NString oldTreqCode,NString newTreqActiveInd,NString oldTreqActiveInd,NString newVpdiCode,NString oldVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_RTVTREQ_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TREQ_CODE", newTreqCode);
			cmd.addParameter("@OLD_TREQ_CODE", oldTreqCode);
			cmd.addParameter("@NEW_TREQ_ACTIVE_IND", newTreqActiveInd);
			cmd.addParameter("@OLD_TREQ_ACTIVE_IND", oldTreqActiveInd);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
			cmd.addParameter("@OLD_VPDI_CODE", oldVpdiCode);
				
			cmd.execute();


		}
		
		public static void pRtvtrstAir(NString newTrstCode,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_RTVTRST_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TRST_CODE", newTrstCode);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pRtvtrstAur(NString newTrstCode,NString oldTrstCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_RTVTRST_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TRST_CODE", newTrstCode);
			cmd.addParameter("@OLD_TRST_CODE", oldTrstCode);
				
			cmd.execute();


		}
		
		public static void pSpridenAir(NNumber newPidm,NString newId,NString chgInd,NString newFirstname,NString newLastname,NString newSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_SPRIDEN_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@CHG_IND", chgInd);
			cmd.addParameter("@NEW_FIRSTNAME", newFirstname);
			cmd.addParameter("@NEW_LASTNAME", newLastname);
			cmd.addParameter("@NEW_SURNAME_PREFIX", newSurnamePrefix);
				
			cmd.execute();


		}
		
		public static void pSpridenAur(NNumber newPidm,NNumber oldPidm,NString newId,NString oldId,NString chgInd,NString newFirstname,NString oldFirstname,NString newLastname,NString oldLastname,NString newSurnamePrefix,NString oldSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRRTS.P_SPRIDEN_AUR", DbManager.getDataBaseFactory());
			
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
