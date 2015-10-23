package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Foksecu {
		public static NString fCheckFundQuerySecurity(NString fundCode,NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSECU.F_CHECK_FUND_QUERY_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckFundSecurity(NString fundCode,NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSECU.F_CHECK_FUND_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckOrgnQuerySecurity(NString orgnCode,NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSECU.F_CHECK_ORGN_QUERY_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckOrgnSecurity(NString orgnCode,NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSECU.F_CHECK_ORGN_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pEditFundSecurity(NString fundCode,NString coasCode,NString globalFundOrgSec,NString currentUser,Ref<NString> mess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSECU.P_EDIT_FUND_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@GLOBAL_FUND_ORG_SEC", globalFundOrgSec);
			cmd.addParameter("@CURRENT_USER", currentUser);
			cmd.addParameter("@MESS", mess, true);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditOrgnSecurity(NString orgnCode,NString coasCode,NString globalFundOrgSec,NString currentUser,Ref<NString> mess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKSECU.P_EDIT_ORGN_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@GLOBAL_FUND_ORG_SEC", globalFundOrgSec);
			cmd.addParameter("@CURRENT_USER", currentUser);
			cmd.addParameter("@MESS", mess, true);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
	
	
	
}
