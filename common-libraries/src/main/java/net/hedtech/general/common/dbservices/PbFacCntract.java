package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.Ref;


public class PbFacCntract {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCodeEff,NString pFcntCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FacCntractRecRow recOne,FacCntractRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FacCntractRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FacCntractRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NString pTermCodeEff,NString pFcntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByTerm(NString pTermCodeEff,NString pFcntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.F_QUERY_BY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCodeEff,NString pFcntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCodeEff,NString pFcntCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCodeEff,NString pFcntCode,NString pCompViewInd,NString pCrnLaborDistInd,NDate pExtrJobsEffDate,NDate pJobEffectiveDate,NString pUserId,NString pDataOrigin,NString pComments,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_COMP_VIEW_IND", pCompViewInd);
			cmd.addParameter("@P_CRN_LABOR_DIST_IND", pCrnLaborDistInd);
			cmd.addParameter("@P_EXTR_JOBS_EFF_DATE", pExtrJobsEffDate);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCodeEff,NString pFcntCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCodeEff,NString pFcntCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCodeEff,NString pFcntCode,NString pCompViewInd,NString pCrnLaborDistInd,NDate pExtrJobsEffDate,NDate pJobEffectiveDate,NString pUserId,NString pDataOrigin,NString pComments,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CNTRACT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_COMP_VIEW_IND", pCompViewInd);
			cmd.addParameter("@P_CRN_LABOR_DIST_IND", pCrnLaborDistInd);
			cmd.addParameter("@P_EXTR_JOBS_EFF_DATE", pExtrJobsEffDate);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FacCntractRecRow", dataSourceName="FAC_CNTRACT_REC")
	public static class FacCntractRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF")
		public NString RTermCodeEff;
		@DbRecordField(dataSourceName="R_FCNT_CODE")
		public NString RFcntCode;
		@DbRecordField(dataSourceName="R_COMP_VIEW_IND")
		public NString RCompViewInd;
		@DbRecordField(dataSourceName="R_CRN_LABOR_DIST_IND")
		public NString RCrnLaborDistInd;
		@DbRecordField(dataSourceName="R_EXTR_JOBS_EFF_DATE")
		public NDate RExtrJobsEffDate;
		@DbRecordField(dataSourceName="R_JOB_EFFECTIVE_DATE")
		public NDate RJobEffectiveDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_COMMENTS")
		public NString RComments;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public FacCntractRecRow() {}

		public FacCntractRecRow(Row row) {

			RTermCodeEff = toStr(row.getObject(1));
			RFcntCode = toStr(row.getObject(2));
			RCompViewInd = toStr(row.getObject(3));
			RCrnLaborDistInd = toStr(row.getObject(4));
			RExtrJobsEffDate = toDate(row.getObject(5));
			RJobEffectiveDate = toDate(row.getObject(6));
			RUserId = toStr(row.getObject(7));
			RDataOrigin = toStr(row.getObject(8));
			RComments = toStr(row.getObject(9));
			RInternalRecordId = toStr(row.getObject(10));
			
		}
	}

	
	
}
