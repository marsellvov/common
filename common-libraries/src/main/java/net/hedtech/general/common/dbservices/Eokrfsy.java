package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokrfsy {
		public static NNumber fGetLastnameLength() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRFSY.F_GET_LASTNAME_LENGTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetSpridenId(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRFSY.F_GET_SPRIDEN_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pSpbpersAir(NNumber newPidm,NString newSsn,NDate newBirthdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRFSY.P_SPBPERS_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@NEW_SSN", newSsn);
			cmd.addParameter("@NEW_BIRTHDATE", newBirthdate);
				
			cmd.execute();


		}
		
		public static void pSpbpersAur(NNumber newPidm,NNumber oldPidm,NString newSsn,NString oldSsn,NDate newBirthdate,NDate oldBirthdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRFSY.P_SPBPERS_AUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@OLD_PIDM", oldPidm);
			cmd.addParameter("@NEW_SSN", newSsn);
			cmd.addParameter("@OLD_SSN", oldSsn);
			cmd.addParameter("@NEW_BIRTHDATE", newBirthdate);
			cmd.addParameter("@OLD_BIRTHDATE", oldBirthdate);
				
			cmd.execute();


		}
		
		public static void pSpridenAir(NNumber newPidm,NString newId,NString chgInd,NString newFirstname,NString newLastname,NString newSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRFSY.P_SPRIDEN_AIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_PIDM", newPidm);
			cmd.addParameter("@NEW_ID", newId);
			cmd.addParameter("@CHG_IND", chgInd);
			cmd.addParameter("@NEW_FIRSTNAME", newFirstname);
			cmd.addParameter("@NEW_LASTNAME", newLastname);
			cmd.addParameter("@NEW_SURNAME_PREFIX", newSurnamePrefix);
				
			cmd.execute();


		}
		
		public static void pSpridenAur(NNumber newPidm,NNumber oldPidm,NString newId,NString oldId,NString chgInd,NString newFirstname,NString oldFirstname,NString newLastname,NString oldLastname,NString newSurnamePrefix,NString oldSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRFSY.P_SPRIDEN_AUR", DbManager.getDataBaseFactory());
			
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
