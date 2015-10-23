package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkosad {
		public static NBool fRolepriv(NString atyp,NString actn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.F_ROLEPRIV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@ACTN", actn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pDispaddrview(NNumber pidm,NString atyp,NString edate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_DISPADDRVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@EDATE", edate);
				
			cmd.execute();


		}
		
		public static void pDispemailview(NNumber pidm,NString emal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_DISPEMAILVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@EMAL", emal);
				
			cmd.execute();


		}
		
		public static void pFacdispaddrview(NString atyp,NString edate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_FACDISPADDRVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@EDATE", edate);
				
			cmd.execute();


		}
		
		public static void pFacdispemailview(NString emal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_FACDISPEMAILVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMAL", emal);
				
			cmd.execute();


		}
		
		public static void pFacselectatypview(NString atyp,NString edate,NString xyz) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_FACSELECTATYPVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@EDATE", edate);
			cmd.addParameter("@XYZ", xyz);
				
			cmd.execute();


		}
		
		public static void pFacselectemalview(NString xyz,NString emal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_FACSELECTEMALVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@EMAL", emal);
				
			cmd.execute();


		}
		
		public static void pSelectatypview(NNumber stupidm,NString nextUrl,NString atyp,NString edate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_SELECTATYPVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STUPIDM", stupidm);
			cmd.addParameter("@NEXT_URL", nextUrl);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@EDATE", edate);
				
			cmd.execute();


		}
		
		public static void pSelectemalview(NNumber stupidm,NString nextUrl,NString emal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_SELECTEMALVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STUPIDM", stupidm);
			cmd.addParameter("@NEXT_URL", nextUrl);
			cmd.addParameter("@EMAL", emal);
				
			cmd.execute();


		}
		
		public static void pValidateatyp(NString atyp,NString actn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_VALIDATEATYP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@ACTN", actn);
				
			cmd.execute();


		}
		
		public static void pValidateedate(NString edate,NString actn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_VALIDATEEDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EDATE", edate);
			cmd.addParameter("@ACTN", actn);
				
			cmd.execute();


		}
		
		public static void pValidateemal(NString emal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSAD.P_VALIDATEEMAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EMAL", emal);
				
			cmd.execute();


		}
		
	
	
	
}
