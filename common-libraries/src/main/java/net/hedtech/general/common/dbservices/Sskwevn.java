package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sskwevn {
		public static NString fGetcrncoursehours(NString term,NString crn,NString idFld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKWEVN.F_GETCRNCOURSEHOURS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@ID_FLD", idFld);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetcrncoursetitle(NString term,NString crn,NString idFld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKWEVN.F_GETCRNCOURSETITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@ID_FLD", idFld);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetcrnsubject(NString term,NString crn,NString idFld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKWEVN.F_GETCRNSUBJECT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@ID_FLD", idFld);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetcurrentgrade(NString term,NString crn,NString idFld) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKWEVN.F_GETCURRENTGRADE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@ID_FLD", idFld);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatecrn(NString uname,NString term,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKWEVN.F_VALIDATECRN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@UNAME", uname);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
