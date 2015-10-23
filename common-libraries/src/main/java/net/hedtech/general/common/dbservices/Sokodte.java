package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokodte {
		public static NBool fCheckSobodteChildren(NString termIn,NString insmIn,NString deptIn,NString campIn,NString collIn,NString schdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKODTE.F_CHECK_SOBODTE_CHILDREN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@INSM_IN", insmIn);
			cmd.addParameter("@DEPT_IN", deptIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@SCHD_IN", schdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
