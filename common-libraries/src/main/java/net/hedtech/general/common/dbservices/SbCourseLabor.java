package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCourseLabor {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CourseLaborRecRow recOne,CourseLaborRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CourseLaborRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CourseLaborRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByTerm(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.F_QUERY_BY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff,NNumber pSeqNo,NNumber pPercent,NString pUserId,NString pDataOrigin,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pCtypCode,NString pAcctExternalCde,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ACCT_EXTERNAL_CDE", pAcctExternalCde);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSubjCode,NString pCrseNumb,NString pTermCodeEff,NNumber pSeqNo,NNumber pPercent,NString pUserId,NString pDataOrigin,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pCtypCode,NString pAcctExternalCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE_LABOR.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ACCT_EXTERNAL_CDE", pAcctExternalCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CourseLaborRecRow", dataSourceName="COURSE_LABOR_REC")
	public static class CourseLaborRecRow
	{
		@DbRecordField(dataSourceName="R_SUBJ_CODE")
		public NString RSubjCode;
		@DbRecordField(dataSourceName="R_CRSE_NUMB")
		public NString RCrseNumb;
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF")
		public NString RTermCodeEff;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_PERCENT")
		public NNumber RPercent;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_ACCI_CODE")
		public NString RAcciCode;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_ORGN_CODE")
		public NString ROrgnCode;
		@DbRecordField(dataSourceName="R_ACCT_CODE")
		public NString RAcctCode;
		@DbRecordField(dataSourceName="R_PROG_CODE")
		public NString RProgCode;
		@DbRecordField(dataSourceName="R_ACTV_CODE")
		public NString RActvCode;
		@DbRecordField(dataSourceName="R_LOCN_CODE")
		public NString RLocnCode;
		@DbRecordField(dataSourceName="R_PROJ_CODE")
		public NString RProjCode;
		@DbRecordField(dataSourceName="R_CTYP_CODE")
		public NString RCtypCode;
		@DbRecordField(dataSourceName="R_ACCT_EXTERNAL_CDE")
		public NString RAcctExternalCde;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
