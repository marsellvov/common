package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbScholarshipDemo {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pFundCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ScholarshipDemoRecRow recOne,ScholarshipDemoRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ScholarshipDemoRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ScholarshipDemoRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pFundCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFundCode,NString pMultipleDonorInd,NString pRestrictedInd,NString pTuitionWaiverInd,NNumber pMaximumTerms,NString pSsrcCode,NString pMinEnrollment,NString pUserId,NString pDataOrigin,NString pDeptCode,NString pPrimaryUserName,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_MULTIPLE_DONOR_IND", pMultipleDonorInd);
			cmd.addParameter("@P_RESTRICTED_IND", pRestrictedInd);
			cmd.addParameter("@P_TUITION_WAIVER_IND", pTuitionWaiverInd);
			cmd.addParameter("@P_MAXIMUM_TERMS", pMaximumTerms);
			cmd.addParameter("@P_SSRC_CODE", pSsrcCode);
			cmd.addParameter("@P_MIN_ENROLLMENT", pMinEnrollment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_PRIMARY_USER_NAME", pPrimaryUserName);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pFundCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pFundCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pFundCode,NString pMultipleDonorInd,NString pRestrictedInd,NString pTuitionWaiverInd,NNumber pMaximumTerms,NString pSsrcCode,NString pMinEnrollment,NString pUserId,NString pDataOrigin,NString pDeptCode,NString pPrimaryUserName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SCHOLARSHIP_DEMO.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_MULTIPLE_DONOR_IND", pMultipleDonorInd);
			cmd.addParameter("@P_RESTRICTED_IND", pRestrictedInd);
			cmd.addParameter("@P_TUITION_WAIVER_IND", pTuitionWaiverInd);
			cmd.addParameter("@P_MAXIMUM_TERMS", pMaximumTerms);
			cmd.addParameter("@P_SSRC_CODE", pSsrcCode);
			cmd.addParameter("@P_MIN_ENROLLMENT", pMinEnrollment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_PRIMARY_USER_NAME", pPrimaryUserName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ScholarshipDemoRecRow", dataSourceName="SCHOLARSHIP_DEMO_REC")
	public static class ScholarshipDemoRecRow
	{
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_MULTIPLE_DONOR_IND")
		public NString RMultipleDonorInd;
		@DbRecordField(dataSourceName="R_RESTRICTED_IND")
		public NString RRestrictedInd;
		@DbRecordField(dataSourceName="R_TUITION_WAIVER_IND")
		public NString RTuitionWaiverInd;
		@DbRecordField(dataSourceName="R_MAXIMUM_TERMS")
		public NNumber RMaximumTerms;
		@DbRecordField(dataSourceName="R_SSRC_CODE")
		public NString RSsrcCode;
		@DbRecordField(dataSourceName="R_MIN_ENROLLMENT")
		public NString RMinEnrollment;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_PRIMARY_USER_NAME")
		public NString RPrimaryUserName;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
