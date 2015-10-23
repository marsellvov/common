package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdocm {
		public static NNumber fCostfactor(NNumber pays,NString freq1,NString freq2,NString freq3,NString freq4,NString freq5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.F_COSTFACTOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PAYS", pays);
			cmd.addParameter("@FREQ1", freq1);
			cmd.addParameter("@FREQ2", freq2);
			cmd.addParameter("@FREQ3", freq3);
			cmd.addParameter("@FREQ4", freq4);
			cmd.addParameter("@FREQ5", freq5);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fDedncostempr(NString calcRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.F_DEDNCOSTEMPR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CALC_RULE", calcRule);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDodollarcost(NString calcRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.F_DODOLLARCOST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CALC_RULE", calcRule);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDopercentcost(NString calcRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.F_DOPERCENTCOST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CALC_RULE", calcRule);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NDate fGetmaxdhiscapturenonoe(NNumber pidm,NString bdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.F_GETMAXDHISCAPTURENONOE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetmaxdhiscaptureoe(NNumber pidm,NString bdcaCode,NDate oeEfdt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.F_GETMAXDHISCAPTUREOE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
			cmd.addParameter("@OE_EFDT", oeEfdt);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetmaxdhiseffectivenonoe(NNumber pidm,NString bdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.F_GETMAXDHISEFFECTIVENONOE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetmaxenddatenonoe(NNumber pidm,NString bdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.F_GETMAXENDDATENONOE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@BDCA_CODE", bdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void pCopydedntodhis() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.P_COPYDEDNTODHIS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCopydhistodedn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.P_COPYDHISTODEDN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetprimjobsdata() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.P_GETPRIMJOBSDATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pMoveupdatestodedn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.P_MOVEUPDATESTODEDN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentcost(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOCM.P_OPENENROLLMENTCOST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
	
	
	
}
