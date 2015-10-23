package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smkaqcc {
		public static NNumber fCheckCurr(NString qualArea,NString qualTerm,NString campCode,NString collCode,NString degcCode,NString majrCode1,NString deptCode1,NString majrCode2,NString deptCode2,NString minrCode1,NString minrCode2,NString concCode1,NString concCode2,NString concCode3,NString concCode4,NString concCode5,NString concCode6,NString campWcInd,NString collWcInd,NString degcWcInd,NString majrWcInd,NString deptWcInd,NString minrWcInd,NString concWcInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKAQCC.F_CHECK_CURR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@QUAL_AREA", qualArea);
			cmd.addParameter("@QUAL_TERM", qualTerm);
			cmd.addParameter("@CAMP_CODE", campCode);
			cmd.addParameter("@COLL_CODE", collCode);
			cmd.addParameter("@DEGC_CODE", degcCode);
			cmd.addParameter("@MAJR_CODE1", majrCode1);
			cmd.addParameter("@DEPT_CODE1", deptCode1);
			cmd.addParameter("@MAJR_CODE2", majrCode2);
			cmd.addParameter("@DEPT_CODE2", deptCode2);
			cmd.addParameter("@MINR_CODE1", minrCode1);
			cmd.addParameter("@MINR_CODE2", minrCode2);
			cmd.addParameter("@CONC_CODE1", concCode1);
			cmd.addParameter("@CONC_CODE2", concCode2);
			cmd.addParameter("@CONC_CODE3", concCode3);
			cmd.addParameter("@CONC_CODE4", concCode4);
			cmd.addParameter("@CONC_CODE5", concCode5);
			cmd.addParameter("@CONC_CODE6", concCode6);
			cmd.addParameter("@CAMP_WC_IND", campWcInd);
			cmd.addParameter("@COLL_WC_IND", collWcInd);
			cmd.addParameter("@DEGC_WC_IND", degcWcInd);
			cmd.addParameter("@MAJR_WC_IND", majrWcInd);
			cmd.addParameter("@DEPT_WC_IND", deptWcInd);
			cmd.addParameter("@MINR_WC_IND", minrWcInd);
			cmd.addParameter("@CONC_WC_IND", concWcInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
