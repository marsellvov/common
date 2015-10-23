package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokwevn {
		public static void pNobtranpafchange(NNumber transNo,NString transStatus,NNumber pidm,NDate effDate,NString acatCode,NString originatorUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKWEVN.P_NOBTRANPAFCHANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@TRANS_STATUS", transStatus);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@EFF_DATE", effDate);
			cmd.addParameter("@ACAT_CODE", acatCode);
			cmd.addParameter("@ORIGINATOR_USERID", originatorUserid);
				
			cmd.execute();


		}
		
	
	
	
}
