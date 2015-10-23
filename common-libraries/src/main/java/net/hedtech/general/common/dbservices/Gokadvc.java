package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokadvc {
		public static NString fInsAdvancement(NNumber pfPersonPidm,NNumber pfProxyPidm,NString pfFirstName,NString pfMi,NString pfLastName,NString pfPrefix,NString pfDonorCode,NString pfPrefClas,NString pfCollCodePref,NString pfAtypCodePref,NString pfAtypCodeGeor,NString pfRelationship,NString pfDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKADVC.F_INS_ADVANCEMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PF_PERSON_PIDM", pfPersonPidm);
			cmd.addParameter("@PF_PROXY_PIDM", pfProxyPidm);
			cmd.addParameter("@PF_FIRST_NAME", pfFirstName);
			cmd.addParameter("@PF_MI", pfMi);
			cmd.addParameter("@PF_LAST_NAME", pfLastName);
			cmd.addParameter("@PF_PREFIX", pfPrefix);
			cmd.addParameter("@PF_DONOR_CODE", pfDonorCode);
			cmd.addParameter("@PF_PREF_CLAS", pfPrefClas);
			cmd.addParameter("@PF_COLL_CODE_PREF", pfCollCodePref);
			cmd.addParameter("@PF_ATYP_CODE_PREF", pfAtypCodePref);
			cmd.addParameter("@PF_ATYP_CODE_GEOR", pfAtypCodeGeor);
			cmd.addParameter("@PF_RELATIONSHIP", pfRelationship);
			cmd.addParameter("@PF_DATA_ORIGIN", pfDataOrigin);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
