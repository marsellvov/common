package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwrktrkr {
//		public static List<ReqrectabRow> fGetRequirements(NString pAidyCode,NNumber pPidm,NString pSatInd,NString pDisbInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKTRKR.F_GET_REQUIREMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<ReqrectabRow>.class);
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_SAT_IND", pSatInd);
//			cmd.addParameter("@P_DISB_IND", pDisbInd);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<ReqrectabRow>.class);
//
//		}
		
		public static DataCursor fGetTrkreq(NNumber pPidm,NString pAidyCode,NString pSatInd,NString pDisbInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKTRKR.F_GET_TRKREQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SAT_IND", pSatInd);
			cmd.addParameter("@P_DISB_IND", pDisbInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pDisplayReqTable(List<ReqrectabRow> pReqtab,NString pAidyCode,NString pMprmKey,NString pSummary,NString pCaption) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKTRKR.P_DISPLAY_REQ_TABLE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("P_REQTAB", "", pReqtab, object.class));
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_MPRM_KEY", pMprmKey);
//			cmd.addParameter("@P_SUMMARY", pSummary);
//			cmd.addParameter("@P_CAPTION", pCaption);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDisptrkreq(NString aidyIn,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKTRKR.P_DISPTRKREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ReqrectypeRow", dataSourceName="REQRECTYPE")
	public static class ReqrectypeRow
	{
		@DbRecordField(dataSourceName="TREQ_CODE")
		public NString TreqCode;
		@DbRecordField(dataSourceName="TREQ_DESC")
		public NString TreqDesc;
		@DbRecordField(dataSourceName="STAT_DATE")
		public NDate StatDate;
		@DbRecordField(dataSourceName="TRST_DESC")
		public NString TrstDesc;
		@DbRecordField(dataSourceName="SAT_IND")
		public NString SatInd;
		@DbRecordField(dataSourceName="FUND_CODE")
		public NString FundCode;
		@DbRecordField(dataSourceName="FUND_TITLE")
		public NString FundTitle;
		@DbRecordField(dataSourceName="SBGI_TYPE_IND")
		public NString SbgiTypeInd;
		@DbRecordField(dataSourceName="SBGI_CODE")
		public NString SbgiCode;
		@DbRecordField(dataSourceName="SBGI_DESC")
		public NString SbgiDesc;
		@DbRecordField(dataSourceName="PERIOD")
		public NString Period;
		@DbRecordField(dataSourceName="PERIOD_DESC")
		public NString PeriodDesc;
		@DbRecordField(dataSourceName="URL")
		public NString Url;
		@DbRecordField(dataSourceName="INSTRUCTIONS")
		public NString Instructions;
	}

	
	
}
