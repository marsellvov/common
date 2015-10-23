package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkoemr {
		public static NBool fContactexists(NNumber pidmIn,NString priorityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOEMR.F_CONTACTEXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PRIORITY_IN", priorityIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCompresspriority(NNumber pidmIn,NString priorityIn,NNumber maxpriority) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOEMR.P_COMPRESSPRIORITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PRIORITY_IN", priorityIn);
			cmd.addParameter("@MAXPRIORITY", maxpriority);
				
			cmd.execute();


		}
		
		public static void pDispemrgformparm(NString priorityIn,NString reltCode,NString lastNamePfx,NString lastName,NString firstName,NString mi,NString atypCode,NString houseNumber,NString streetLine1,NString streetLine2,NString streetLine3,NString streetLine4,NString city,NString statCode,NString natnCode,NString zip,NString phoneCtry,NString phoneArea,NString phoneNumber,NString phoneExt,NDate lastActive) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOEMR.P_DISPEMRGFORMPARM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRIORITY_IN", priorityIn);
			cmd.addParameter("@RELT_CODE", reltCode);
			cmd.addParameter("@LAST_NAME_PFX", lastNamePfx);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@MI", mi);
			cmd.addParameter("@ATYP_CODE", atypCode);
			cmd.addParameter("@HOUSE_NUMBER", houseNumber);
			cmd.addParameter("@STREET_LINE1", streetLine1);
			cmd.addParameter("@STREET_LINE2", streetLine2);
			cmd.addParameter("@STREET_LINE3", streetLine3);
			cmd.addParameter("@STREET_LINE4", streetLine4);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT_CODE", statCode);
			cmd.addParameter("@NATN_CODE", natnCode);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@PHONE_CTRY", phoneCtry);
			cmd.addParameter("@PHONE_AREA", phoneArea);
			cmd.addParameter("@PHONE_NUMBER", phoneNumber);
			cmd.addParameter("@PHONE_EXT", phoneExt);
			cmd.addParameter("@LAST_ACTIVE", lastActive);
				
			cmd.execute();


		}
		
		public static void pDispemrgformpidm(NString priorityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOEMR.P_DISPEMRGFORMPIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRIORITY_IN", priorityIn);
				
			cmd.execute();


		}
		
		public static void pSelectemrgcontacts() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOEMR.P_SELECTEMRGCONTACTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pShowemrgcontacts(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOEMR.P_SHOWEMRGCONTACTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pShufflepriority(NNumber pidmIn,NString priorityIn,NString oldpri,NNumber maxpriority) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOEMR.P_SHUFFLEPRIORITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PRIORITY_IN", priorityIn);
			cmd.addParameter("@OLDPRI", oldpri);
			cmd.addParameter("@MAXPRIORITY", maxpriority);
				
			cmd.execute();


		}
		
		public static void pUpdateemrgcontacts(NString priorityIn,NString rship,NString lnamePfx,NString lname,NString fname,NString mi,NString atyp,NString houseno,NString addr1,NString addr2,NString addr3,NString addr4,NString city,NString stat,NString natn,NString zip,NString ctry,NString area,NString phone,NString ext,NString removeIt,NString oldpri,NString lastActive) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOEMR.P_UPDATEEMRGCONTACTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PRIORITY_IN", priorityIn);
			cmd.addParameter("@RSHIP", rship);
			cmd.addParameter("@LNAME_PFX", lnamePfx);
			cmd.addParameter("@LNAME", lname);
			cmd.addParameter("@FNAME", fname);
			cmd.addParameter("@MI", mi);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@HOUSENO", houseno);
			cmd.addParameter("@ADDR1", addr1);
			cmd.addParameter("@ADDR2", addr2);
			cmd.addParameter("@ADDR3", addr3);
			cmd.addParameter("@ADDR4", addr4);
			cmd.addParameter("@CITY", city);
			cmd.addParameter("@STAT", stat);
			cmd.addParameter("@NATN", natn);
			cmd.addParameter("@ZIP", zip);
			cmd.addParameter("@CTRY", ctry);
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@PHONE", phone);
			cmd.addParameter("@EXT", ext);
			cmd.addParameter("@REMOVE_IT", removeIt);
			cmd.addParameter("@OLDPRI", oldpri);
			cmd.addParameter("@LAST_ACTIVE", lastActive);
				
			cmd.execute();


		}
		
		public static void pViewemrgcontacts() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKOEMR.P_VIEWEMRGCONTACTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
