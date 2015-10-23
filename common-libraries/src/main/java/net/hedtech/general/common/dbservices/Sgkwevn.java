package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sgkwevn {
		public static NString fGetstudentclass(NString term,NString idFld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKWEVN.F_GETSTUDENTCLASS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@ID_FLD", idFld);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetstudentlevel(NString term,NString idFld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKWEVN.F_GETSTUDENTLEVEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@ID_FLD", idFld);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetstudentmajor(NString term,NString idFld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKWEVN.F_GETSTUDENTMAJOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@ID_FLD", idFld);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fVeteranstudent(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKWEVN.F_VETERANSTUDENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
