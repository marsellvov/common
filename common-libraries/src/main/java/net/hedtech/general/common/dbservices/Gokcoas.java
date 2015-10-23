package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokcoas {
		public static void pOrgnDesc(NString orgn,Ref<NString> orgnDesc,NString coas,NDate effDate,NString effTime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCOAS.P_ORGN_DESC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ORGN_DESC", orgnDesc, true);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@EFF_DATE", effDate);
			cmd.addParameter("@EFF_TIME", effTime);
				
			cmd.execute();
			orgnDesc.val = cmd.getParameterValue("@ORGN_DESC", NString.class);


		}
		
	
	
	
}
