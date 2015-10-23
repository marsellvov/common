package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokprts {
		public static void pNbbposnAur(NString newTitle,NString oldTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_NBBPOSN_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_TITLE", newTitle);
			cmd.addParameter("@OLD_TITLE", oldTitle);
				
			cmd.execute();


		}
		
		public static void pNbrjobsAdr(NNumber oldPidm,NString oldId,NString oldDesc,NString oldPosn,NString oldSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_NBRJOBS_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_PIDM", oldPidm);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@OLD_DESC", oldDesc);
			cmd.addParameter("@OLD_POSN", oldPosn);
			cmd.addParameter("@OLD_SUFF", oldSuff);
				
			cmd.execute();


		}
		
		public static void pNbrjobsAir(NNumber newPidm,NString newId,NString newDesc,NString newPosn,NString newSuff,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_NBRJOBS_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@NEW_DESC", newDesc);
			cmd.addParameter("@NEW_POSN", newPosn);
			cmd.addParameter("@NEW_SUFF", newSuff);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pNbrjobsAur(NString newId,NString oldId,NString newDesc,NString oldDesc,NString newPosn,NString oldPosn,NString newSuff,NString oldSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_NBRJOBS_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_DESC", newDesc);
			cmd.addParameter("@OLD_DESC", oldDesc);
			cmd.addParameter("@NEW_POSN", newPosn);
			cmd.addParameter("@OLD_POSN", oldPosn);
			cmd.addParameter("@NEW_SUFF", newSuff);
			cmd.addParameter("@OLD_SUFF", oldSuff);
				
			cmd.execute();


		}
		
		public static void pPabapplAdr(NString oldId,NString oldPosn,NDate oldDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_PABAPPL_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@OLD_POSN", oldPosn);
			cmd.addParameter("@OLD_DATE", oldDate);
				
			cmd.execute();


		}
		
		public static void pPabapplAir(NString newId,NString newPosn,NDate newDate,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_PABAPPL_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@NEW_POSN", newPosn);
			cmd.addParameter("@NEW_DATE", newDate);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pPabapplAur(NString newId,NString oldId,NString newPosn,NString oldPosn,NDate newDate,NDate oldDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_PABAPPL_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_POSN", newPosn);
			cmd.addParameter("@OLD_POSN", oldPosn);
			cmd.addParameter("@NEW_DATE", newDate);
			cmd.addParameter("@OLD_DATE", oldDate);
				
			cmd.execute();


		}
		
		public static void pPebemplAdr(NString oldId,NDate oldCurrentHireDate,NDate oldTermDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_PEBEMPL_ADR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@OLD_CURRENT_HIRE_DATE", oldCurrentHireDate);
			cmd.addParameter("@OLD_TERM_DATE", oldTermDate);
				
			cmd.execute();


		}
		
		public static void pPebemplAir(NString newId,NDate newCurrentHireDate,NDate newTermDate,NString newVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_PEBEMPL_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@NEW_CURRENT_HIRE_DATE", newCurrentHireDate);
			cmd.addParameter("@NEW_TERM_DATE", newTermDate);
			cmd.addParameter("@NEW_VPDI_CODE", newVpdiCode);
				
			cmd.execute();


		}
		
		public static void pPebemplAur(NString newId,NString oldId,NDate newCurrentHireDate,NDate oldCurrentHireDate,NDate newTermDate,NDate oldTermDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_PEBEMPL_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@OLD_ID", oldId);
			cmd.addParameter("@NEW_CURRENT_HIRE_DATE", newCurrentHireDate);
			cmd.addParameter("@OLD_CURRENT_HIRE_DATE", oldCurrentHireDate);
			cmd.addParameter("@NEW_TERM_DATE", newTermDate);
			cmd.addParameter("@OLD_TERM_DATE", oldTermDate);
				
			cmd.execute();


		}
		
		public static void pSpridenAir(NNumber newPidm,NString newId,NString chgInd,NString newFirstname,NString newLastname,NString newSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_SPRIDEN_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@CHG_IND", chgInd);
			cmd.addParameter("@NEW_FIRSTNAME", newFirstname);
			cmd.addParameter("@NEW_LASTNAME", newLastname);
			cmd.addParameter("@NEW_SURNAME_PREFIX", newSurnamePrefix);
				
			cmd.execute();


		}
		
		public static void pSpridenAur(NNumber newPidm,NNumber oldPidm,NString newId,NString oldId,NString chgInd,NString newFirstname,NString oldFirstname,NString newLastname,NString oldLastname,NString newSurnamePrefix,NString oldSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRTS.P_SPRIDEN_AUR", DbManager.getDataBaseFactory());
			
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
