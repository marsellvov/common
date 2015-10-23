package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbSpecialAvgEarn {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsPtrearn(NString pPtrearnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.F_EXISTS_PTREARN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PTREARN_CODE", pPtrearnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsPtrleav(NString pPtrleavCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.F_EXISTS_PTRLEAV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PTRLEAV_CODE", pPtrleavCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(SpecialAvgEarnRecRow recOne,SpecialAvgEarnRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, SpecialAvgEarnRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, SpecialAvgEarnRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NString pCalcBase,NNumber pNumSal,NString pCalcAlg,NString pLeavCode,NString pUserId,NString pDataOrigin,NNumber pMaxDaily,NNumber pMaxWeekly,NNumber pMaxPayPeriod,NNumber pMaxMonthlyHrs,NString pAssocEarnCode,NNumber pPriority,NString pProrate,NNumber pProrateMonths,NString pMinwCodeBase,NNumber pNumberMinw,NString pMinwCodeAlg,NString pNegativeUnitsInd,NString pCalendarYearInd,NString pProratePerSenInd,NNumber pGratPctEps,NNumber pGratPctOther,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_CALC_BASE", pCalcBase);
			cmd.addParameter("@P_NUM_SAL", pNumSal);
			cmd.addParameter("@P_CALC_ALG", pCalcAlg);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MAX_DAILY", pMaxDaily);
			cmd.addParameter("@P_MAX_WEEKLY", pMaxWeekly);
			cmd.addParameter("@P_MAX_PAY_PERIOD", pMaxPayPeriod);
			cmd.addParameter("@P_MAX_MONTHLY_HRS", pMaxMonthlyHrs);
			cmd.addParameter("@P_ASSOC_EARN_CODE", pAssocEarnCode);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_PRORATE", pProrate);
			cmd.addParameter("@P_PRORATE_MONTHS", pProrateMonths);
			cmd.addParameter("@P_MINW_CODE_BASE", pMinwCodeBase);
			cmd.addParameter("@P_NUMBER_MINW", pNumberMinw);
			cmd.addParameter("@P_MINW_CODE_ALG", pMinwCodeAlg);
			cmd.addParameter("@P_NEGATIVE_UNITS_IND", pNegativeUnitsInd);
			cmd.addParameter("@P_CALENDAR_YEAR_IND", pCalendarYearInd);
			cmd.addParameter("@P_PRORATE_PER_SEN_IND", pProratePerSenInd);
			cmd.addParameter("@P_GRAT_PCT_EPS", pGratPctEps);
			cmd.addParameter("@P_GRAT_PCT_OTHER", pGratPctOther);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NString pCalcBase,NNumber pNumSal,NString pCalcAlg,NString pLeavCode,NString pUserId,NString pDataOrigin,NNumber pMaxDaily,NNumber pMaxWeekly,NNumber pMaxPayPeriod,NNumber pMaxMonthlyHrs,NString pAssocEarnCode,NNumber pPriority,NString pProrate,NNumber pProrateMonths,NString pMinwCodeBase,NNumber pNumberMinw,NString pMinwCodeAlg,NString pNegativeUnitsInd,NString pCalendarYearInd,NString pProratePerSenInd,NNumber pGratPctEps,NNumber pGratPctOther,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SPECIAL_AVG_EARN.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_CALC_BASE", pCalcBase);
			cmd.addParameter("@P_NUM_SAL", pNumSal);
			cmd.addParameter("@P_CALC_ALG", pCalcAlg);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MAX_DAILY", pMaxDaily);
			cmd.addParameter("@P_MAX_WEEKLY", pMaxWeekly);
			cmd.addParameter("@P_MAX_PAY_PERIOD", pMaxPayPeriod);
			cmd.addParameter("@P_MAX_MONTHLY_HRS", pMaxMonthlyHrs);
			cmd.addParameter("@P_ASSOC_EARN_CODE", pAssocEarnCode);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_PRORATE", pProrate);
			cmd.addParameter("@P_PRORATE_MONTHS", pProrateMonths);
			cmd.addParameter("@P_MINW_CODE_BASE", pMinwCodeBase);
			cmd.addParameter("@P_NUMBER_MINW", pNumberMinw);
			cmd.addParameter("@P_MINW_CODE_ALG", pMinwCodeAlg);
			cmd.addParameter("@P_NEGATIVE_UNITS_IND", pNegativeUnitsInd);
			cmd.addParameter("@P_CALENDAR_YEAR_IND", pCalendarYearInd);
			cmd.addParameter("@P_PRORATE_PER_SEN_IND", pProratePerSenInd);
			cmd.addParameter("@P_GRAT_PCT_EPS", pGratPctEps);
			cmd.addParameter("@P_GRAT_PCT_OTHER", pGratPctOther);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="SpecialAvgEarnRecRow", dataSourceName="SPECIAL_AVG_EARN_REC", needsInitialization=true)
	public static class SpecialAvgEarnRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_CALC_BASE")
		public NString RCalcBase;
		@DbRecordField(dataSourceName="R_NUM_SAL")
		public NNumber RNumSal;
		@DbRecordField(dataSourceName="R_CALC_ALG")
		public NString RCalcAlg;
		@DbRecordField(dataSourceName="R_LEAV_CODE")
		public NString RLeavCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_MAX_DAILY")
		public NNumber RMaxDaily;
		@DbRecordField(dataSourceName="R_MAX_WEEKLY")
		public NNumber RMaxWeekly;
		@DbRecordField(dataSourceName="R_MAX_PAY_PERIOD")
		public NNumber RMaxPayPeriod;
		@DbRecordField(dataSourceName="R_MAX_MONTHLY_HRS")
		public NNumber RMaxMonthlyHrs;
		@DbRecordField(dataSourceName="R_ASSOC_EARN_CODE")
		public NString RAssocEarnCode;
		@DbRecordField(dataSourceName="R_PRIORITY")
		public NNumber RPriority;
		@DbRecordField(dataSourceName="R_PRORATE")
		public NString RProrate;
		@DbRecordField(dataSourceName="R_PRORATE_MONTHS")
		public NNumber RProrateMonths;
		@DbRecordField(dataSourceName="R_MINW_CODE_BASE")
		public NString RMinwCodeBase;
		@DbRecordField(dataSourceName="R_NUMBER_MINW")
		public NNumber RNumberMinw;
		@DbRecordField(dataSourceName="R_MINW_CODE_ALG")
		public NString RMinwCodeAlg;
		@DbRecordField(dataSourceName="R_NEGATIVE_UNITS_IND")
		public NString RNegativeUnitsInd;
		@DbRecordField(dataSourceName="R_CALENDAR_YEAR_IND")
		public NString RCalendarYearInd;
		@DbRecordField(dataSourceName="R_PRORATE_PER_SEN_IND")
		public NString RProratePerSenInd;
		@DbRecordField(dataSourceName="R_GRAT_PCT_EPS")
		public NNumber RGratPctEps;
		@DbRecordField(dataSourceName="R_GRAT_PCT_OTHER")
		public NNumber RGratPctOther;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
