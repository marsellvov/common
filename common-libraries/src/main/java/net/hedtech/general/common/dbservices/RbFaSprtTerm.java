package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbFaSprtTerm {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pPeriod,NString pFaspCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FaSprtTermRecRow recOne,FaSprtTermRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FaSprtTermRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FaSprtTermRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pPeriod,NString pFaspCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pPeriod,NString pFaspCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pPeriod,NString pFaspCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPeriod,NString pFaspCode,NString pAatpCode,NNumber pPotentialAidAmt,NNumber pAthlAidTermAmt,NNumber pTermPct,NNumber pTermCount,NNumber pSummerTermCount,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_AATP_CODE", pAatpCode);
			cmd.addParameter("@P_POTENTIAL_AID_AMT", pPotentialAidAmt);
			cmd.addParameter("@P_ATHL_AID_TERM_AMT", pAthlAidTermAmt);
			cmd.addParameter("@P_TERM_PCT", pTermPct);
			cmd.addParameter("@P_TERM_COUNT", pTermCount);
			cmd.addParameter("@P_SUMMER_TERM_COUNT", pSummerTermCount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pPeriod,NString pFaspCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pPeriod,NString pFaspCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pPeriod,NString pFaspCode,NString pAatpCode,NNumber pPotentialAidAmt,NNumber pAthlAidTermAmt,NNumber pTermPct,NNumber pTermCount,NNumber pSummerTermCount,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_AATP_CODE", pAatpCode);
			cmd.addParameter("@P_POTENTIAL_AID_AMT", pPotentialAidAmt);
			cmd.addParameter("@P_ATHL_AID_TERM_AMT", pAthlAidTermAmt);
			cmd.addParameter("@P_TERM_PCT", pTermPct);
			cmd.addParameter("@P_TERM_COUNT", pTermCount);
			cmd.addParameter("@P_SUMMER_TERM_COUNT", pSummerTermCount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FaSprtTermRecRow", dataSourceName="FA_SPRT_TERM_REC")
	public static class FaSprtTermRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_FASP_CODE")
		public NString RFaspCode;
		@DbRecordField(dataSourceName="R_AATP_CODE")
		public NString RAatpCode;
		@DbRecordField(dataSourceName="R_POTENTIAL_AID_AMT")
		public NNumber RPotentialAidAmt;
		@DbRecordField(dataSourceName="R_ATHL_AID_TERM_AMT")
		public NNumber RAthlAidTermAmt;
		@DbRecordField(dataSourceName="R_TERM_PCT")
		public NNumber RTermPct;
		@DbRecordField(dataSourceName="R_TERM_COUNT")
		public NNumber RTermCount;
		@DbRecordField(dataSourceName="R_SUMMER_TERM_COUNT")
		public NNumber RSummerTermCount;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
