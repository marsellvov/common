package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdkmpro {
		public static void pBuildMangMyPros(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPRO.P_BUILD_MANG_MY_PROS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pDisplayMypros(NNumber pidmIn,NString prosViewInd,NString sortOption,NString backUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPRO.P_DISPLAY_MYPROS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PROS_VIEW_IND", prosViewInd);
			cmd.addParameter("@SORT_OPTION", sortOption);
			cmd.addParameter("@BACK_URL", backUrl);
				
			cmd.execute();


		}
		
		public static void pUpdatePreferences(NNumber pidmIn,NString prosViewInd,NString sortOption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPRO.P_UPDATE_PREFERENCES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PROS_VIEW_IND", prosViewInd);
			cmd.addParameter("@SORT_OPTION", sortOption);
				
			cmd.execute();


		}
		
		public static void pUpdateProsstat(NNumber pidmIn,NString statusCode,NString fromDate,NString idenCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPRO.P_UPDATE_PROSSTAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@STATUS_CODE", statusCode);
			cmd.addParameter("@FROM_DATE", fromDate);
			cmd.addParameter("@IDEN_CODE", idenCode);
				
			cmd.execute();


		}
		
		public static void pViewMypros(NNumber pidmIn,NString prosViewInd,NString sortOption,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPRO.P_VIEW_MYPROS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PROS_VIEW_IND", prosViewInd);
			cmd.addParameter("@SORT_OPTION", sortOption);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pViewProsstat(NNumber prosPidm,NString statusCode,NString fromDate,NString idenCode,NString fromDateInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKMPRO.P_VIEW_PROSSTAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@STATUS_CODE", statusCode);
			cmd.addParameter("@FROM_DATE", fromDate);
			cmd.addParameter("@IDEN_CODE", idenCode);
			cmd.addParameter("@FROM_DATE_IND", fromDateInd);
				
			cmd.execute();


		}
		
	
	
	
}
