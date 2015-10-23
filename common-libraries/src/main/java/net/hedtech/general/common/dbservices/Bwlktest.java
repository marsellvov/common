package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlktest {
		public static void pFacdisptest(NString term,NString xyz,NString msg,NString pinrule,NString pinNumb,NString ldapUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKTEST.P_FACDISPTEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@PINRULE", pinrule);
			cmd.addParameter("@PIN_NUMB", pinNumb);
			cmd.addParameter("@LDAP_USERID", ldapUserid);
				
			cmd.execute();


		}
		
	
	
	
}
