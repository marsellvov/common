package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkgcom {
		public static NBool fCheckGradeSubComponents(NString termIn,NString crnIn,NNumber gcomIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKGCOM.F_CHECK_GRADE_SUB_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@GCOM_ID_IN", gcomIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckgradecomponents(NString term,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKGCOM.F_CHECKGRADECOMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pShrcmrkcrnproc(NString term,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKGCOM.P_SHRCMRKCRNPROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();


		}
		
		public static void pShrgcomupdateproc(NString term,NString crn,NNumber gcomId,NString gcomInclInd,NString ssbsectUpdind,NString dbAction,NDate gcomDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKGCOM.P_SHRGCOMUPDATEPROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@GCOM_INCL_IND", gcomInclInd);
			cmd.addParameter("@SSBSECT_UPDIND", ssbsectUpdind);
			cmd.addParameter("@DB_ACTION", dbAction);
			cmd.addParameter("@GCOM_DATE", gcomDate);
				
			cmd.execute();


		}
		
		public static void pUpdateShrsmrkFromShrscom(NString term,NString crn,NNumber gcomId,NNumber scomId,NString ssbsectUpdind,NString shrgcomUpdind,NString dbAction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKGCOM.P_UPDATE_SHRSMRK_FROM_SHRSCOM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@GCOM_ID", gcomId);
			cmd.addParameter("@SCOM_ID", scomId);
			cmd.addParameter("@SSBSECT_UPDIND", ssbsectUpdind);
			cmd.addParameter("@SHRGCOM_UPDIND", shrgcomUpdind);
			cmd.addParameter("@DB_ACTION", dbAction);
				
			cmd.execute();


		}
		
	
	
	
}
