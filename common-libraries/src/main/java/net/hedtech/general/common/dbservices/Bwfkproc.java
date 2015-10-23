package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkproc {
		public static NString fCheckFinUserWbldAccess(NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKPROC.F_CHECK_FIN_USER_WBLD_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckRuclSecurity(NString userCode,NString ruclCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKPROC.F_CHECK_RUCL_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_CODE", userCode);
			cmd.addParameter("@RUCL_CODE", ruclCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fInhierarchy(NString coasCode,NString orgnCode,NString matchOrgnCode,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKPROC.F_INHIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@MATCH_ORGN_CODE", matchOrgnCode);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSecurityForPosting(NString coasCode,NString fundCode,NString orgCode,NString userCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKPROC.F_SECURITY_FOR_POSTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORG_CODE", orgCode);
			cmd.addParameter("@USER_CODE", userCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSecurityForWebFnc(NString coasCode,NString fundCode,NString orgCode,NString userCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKPROC.F_SECURITY_FOR_WEB_FNC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORG_CODE", orgCode);
			cmd.addParameter("@USER_CODE", userCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCodeLookup(NString lookupCode,NString returnUrl,NString coas,NString doQuery,NString pattern,NString pattern2,NString pattern3,NString pattern4,NNumber maxrows,NString budgetid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKPROC.P_CODE_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@RETURN_URL", returnUrl);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@DO_QUERY", doQuery);
			cmd.addParameter("@PATTERN", pattern);
			cmd.addParameter("@PATTERN2", pattern2);
			cmd.addParameter("@PATTERN3", pattern3);
			cmd.addParameter("@PATTERN4", pattern4);
			cmd.addParameter("@MAXROWS", maxrows);
			cmd.addParameter("@BUDGETID", budgetid);
				
			cmd.execute();


		}
		
		public static void pLookup(NNumber pidm,NString lookupCode,NString coas,NString pattern,NString pattern2,NNumber maxrows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKPROC.P_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@PATTERN", pattern);
			cmd.addParameter("@PATTERN2", pattern2);
			cmd.addParameter("@MAXROWS", maxrows);
				
			cmd.execute();


		}
		
		public static void pLookupCriteria(NString lookupCode,NString inCoas,NString pattern,NString pattern2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKPROC.P_LOOKUP_CRITERIA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@PATTERN", pattern);
			cmd.addParameter("@PATTERN2", pattern2);
				
			cmd.execute();


		}
		
	
	
	
}
