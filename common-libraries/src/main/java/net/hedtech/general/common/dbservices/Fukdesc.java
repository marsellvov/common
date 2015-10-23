package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fukdesc {
		public static NString fGetAcctDesc(NString acct,NString coas,NDate effDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_ACCT_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@EFF_DATE", effDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetActvDesc(NString actv,NString coas,NDate effDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_ACTV_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@EFF_DATE", effDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAtypDesc(NString atyp,NString coas,NDate effDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_ATYP_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@EFF_DATE", effDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetBphaseDesc(NString bphase,NString budget,NString coas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_BPHASE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@BPHASE", bphase);
			cmd.addParameter("@BUDGET", budget);
			cmd.addParameter("@COAS", coas);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetBudgetDesc(NString budget,NString coas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_BUDGET_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@BUDGET", budget);
			cmd.addParameter("@COAS", coas);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCoasDesc(NString coas,NDate effDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_COAS_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@EFF_DATE", effDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEclsDesc(NString ecls) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_ECLS_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ECLS", ecls);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFtypDesc(NString ftyp,NString coas,NDate effDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_FTYP_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FTYP", ftyp);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@EFF_DATE", effDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFundDesc(NString fund,NString coas,NDate effDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_FUND_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@EFF_DATE", effDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrantDesc(NString grnt,NString coas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_GRANT_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@GRNT", grnt);
			cmd.addParameter("@COAS", coas);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLocnDesc(NString locn,NString coas,NDate effDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_LOCN_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@EFF_DATE", effDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOrgnDesc(NString orgn,NString coas,NDate effDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_ORGN_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@EFF_DATE", effDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetProgDesc(NString prog,NString coas,NDate effDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FUKDESC.F_GET_PROG_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@EFF_DATE", effDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
