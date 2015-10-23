package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ttksels {
		public static NBool fDetailAccessAllowed(NNumber taxYearIn,NString reptCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.F_DETAIL_ACCESS_ALLOWED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TAX_YEAR_IN", taxYearIn);
			cmd.addParameter("@REPT_CODE_IN", reptCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDetcInRule(NString detailCode,NNumber taxYear,NString reptBox) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.F_DETC_IN_RULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@DETAIL_CODE", detailCode);
			cmd.addParameter("@TAX_YEAR", taxYear);
			cmd.addParameter("@REPT_BOX", reptBox);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetNatnDesc(NString codeNatn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.F_GET_NATN_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CODE_NATN", codeNatn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStatDesc(NString codeStat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.F_GET_STAT_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CODE_STAT", codeStat);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fReportCode(NNumber taxYear,NString reptBox) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.F_REPORT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TAX_YEAR", taxYear);
			cmd.addParameter("@REPT_BOX", reptBox);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fTtvxsumExists(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.F_TTVXSUM_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidReptCode(NNumber taxYear,NString reptCode,Ref<NString> reptBox) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.F_VALID_REPT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TAX_YEAR", taxYear);
			cmd.addParameter("@REPT_CODE", reptCode);
			cmd.addParameter("@REPT_BOX", NString.class);
				
			cmd.execute();
			reptBox.val = cmd.getParameterValue("@REPT_BOX", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pGetLatestTaxn(NNumber pidmIn,NNumber taxYearIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.P_GET_LATEST_TAXN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TAX_YEAR_IN", taxYearIn);
				
			cmd.execute();


		}
		
		public static void pGetReportCode(NString reptCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.P_GET_REPORT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REPT_CODE_IN", reptCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetSpbpers(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.P_GET_SPBPERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pGetSpriden(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.P_GET_SPRIDEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pGetTtb1098() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.P_GET_TTB1098", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetTtvxsumTotal(NNumber pidmIn,Ref<NNumber> ttvxsumTotalOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKSELS.P_GET_TTVXSUM_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TTVXSUM_TOTAL_OUT", NNumber.class);
				
			cmd.execute();
			ttvxsumTotalOut.val = cmd.getParameterValue("@TTVXSUM_TOTAL_OUT", NNumber.class);


		}
		
	
	
	
}
