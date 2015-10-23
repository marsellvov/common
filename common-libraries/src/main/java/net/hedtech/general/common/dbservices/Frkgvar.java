package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Frkgvar {
		public static NString fGetAcctCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_ACCT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetActvCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_ACTV_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAtypCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_ATYP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetAtypLevel12Ind() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_ATYP_LEVEL_1_2_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetCoasCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_COAS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetExpEndPostAuthInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_EXP_END_POST_AUTH_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFundCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_FUND_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrntBegPrd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_GRNT_BEG_PRD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrntBegYr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_GRNT_BEG_YR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrntCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_GRNT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrntEndPrd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_GRNT_END_PRD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrntEndYr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_GRNT_END_YR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGroupByColumnNameInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_GROUP_BY_COLUMN_NAME_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetInclRevenueAcct() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_INCL_REVENUE_ACCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLocnCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_LOCN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOrgnCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_ORGN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetProgCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_PROG_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTrailInPrdInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_GET_TRAIL_IN_PRD_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMaxGrntYr(NString coasCode,NString grntCode,NString fundCode,NString orgnCode,NString acctCode,NString progCode,NString actvCode,NString locnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FRKGVAR.F_MAX_GRNT_YR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@GRNT_CODE", grntCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@ACTV_CODE", actvCode);
			cmd.addParameter("@LOCN_CODE", locnCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
