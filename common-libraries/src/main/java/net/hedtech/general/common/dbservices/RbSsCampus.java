package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbSsCampus {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NString pCampCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(SsCampusRecRow recOne,SsCampusRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, SsCampusRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, SsCampusRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NString pCampCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NString pCampCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NString pCampCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NString pCampCode,NString pName,NString pShortName,NString pAddressLine1,NString pAddressLine2,NString pAddressLine3,NString pCity,NString pStatCode,NString pZip,NString pPhone,NString pEmail,NString pWebLogoUrl,NString pBatchLogoFile,NString pCustomInfo,NNumber pGradRate6yr,NNumber pDefaultRate,NNumber pDefaultRateComp,NNumber pFedMedianLoanAmt,NNumber pFedMedianLoanYr,NNumber pFedLoanPmtAmt,NString pUserId,NString pDataOrigin,NString pInstitutionGroup,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SHORT_NAME", pShortName);
			cmd.addParameter("@P_ADDRESS_LINE_1", pAddressLine1);
			cmd.addParameter("@P_ADDRESS_LINE_2", pAddressLine2);
			cmd.addParameter("@P_ADDRESS_LINE_3", pAddressLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_PHONE", pPhone);
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_WEB_LOGO_URL", pWebLogoUrl);
			cmd.addParameter("@P_BATCH_LOGO_FILE", pBatchLogoFile);
			cmd.addParameter("@P_CUSTOM_INFO", pCustomInfo);
			cmd.addParameter("@P_GRAD_RATE_6YR", pGradRate6yr);
			cmd.addParameter("@P_DEFAULT_RATE", pDefaultRate);
			cmd.addParameter("@P_DEFAULT_RATE_COMP", pDefaultRateComp);
			cmd.addParameter("@P_FED_MEDIAN_LOAN_AMT", pFedMedianLoanAmt);
			cmd.addParameter("@P_FED_MEDIAN_LOAN_YR", pFedMedianLoanYr);
			cmd.addParameter("@P_FED_LOAN_PMT_AMT", pFedLoanPmtAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INSTITUTION_GROUP", pInstitutionGroup);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NString pCampCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NString pCampCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NString pCampCode,NString pName,NString pShortName,NString pAddressLine1,NString pAddressLine2,NString pAddressLine3,NString pCity,NString pStatCode,NString pZip,NString pPhone,NString pEmail,NString pWebLogoUrl,NString pBatchLogoFile,NString pCustomInfo,NNumber pGradRate6yr,NNumber pDefaultRate,NNumber pDefaultRateComp,NNumber pFedMedianLoanAmt,NNumber pFedMedianLoanYr,NNumber pFedLoanPmtAmt,NString pUserId,NString pDataOrigin,NString pInstitutionGroup,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_SS_CAMPUS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_SHORT_NAME", pShortName);
			cmd.addParameter("@P_ADDRESS_LINE_1", pAddressLine1);
			cmd.addParameter("@P_ADDRESS_LINE_2", pAddressLine2);
			cmd.addParameter("@P_ADDRESS_LINE_3", pAddressLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_PHONE", pPhone);
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_WEB_LOGO_URL", pWebLogoUrl);
			cmd.addParameter("@P_BATCH_LOGO_FILE", pBatchLogoFile);
			cmd.addParameter("@P_CUSTOM_INFO", pCustomInfo);
			cmd.addParameter("@P_GRAD_RATE_6YR", pGradRate6yr);
			cmd.addParameter("@P_DEFAULT_RATE", pDefaultRate);
			cmd.addParameter("@P_DEFAULT_RATE_COMP", pDefaultRateComp);
			cmd.addParameter("@P_FED_MEDIAN_LOAN_AMT", pFedMedianLoanAmt);
			cmd.addParameter("@P_FED_MEDIAN_LOAN_YR", pFedMedianLoanYr);
			cmd.addParameter("@P_FED_LOAN_PMT_AMT", pFedLoanPmtAmt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INSTITUTION_GROUP", pInstitutionGroup);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="SsCampusRecRow", dataSourceName="SS_CAMPUS_REC")
	public static class SsCampusRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_NAME")
		public NString RName;
		@DbRecordField(dataSourceName="R_SHORT_NAME")
		public NString RShortName;
		@DbRecordField(dataSourceName="R_ADDRESS_LINE_1")
		public NString RAddressLine1;
		@DbRecordField(dataSourceName="R_ADDRESS_LINE_2")
		public NString RAddressLine2;
		@DbRecordField(dataSourceName="R_ADDRESS_LINE_3")
		public NString RAddressLine3;
		@DbRecordField(dataSourceName="R_CITY")
		public NString RCity;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_ZIP")
		public NString RZip;
		@DbRecordField(dataSourceName="R_PHONE")
		public NString RPhone;
		@DbRecordField(dataSourceName="R_EMAIL")
		public NString REmail;
		@DbRecordField(dataSourceName="R_WEB_LOGO_URL")
		public NString RWebLogoUrl;
		@DbRecordField(dataSourceName="R_BATCH_LOGO_FILE")
		public NString RBatchLogoFile;
		@DbRecordField(dataSourceName="R_CUSTOM_INFO")
		public NString RCustomInfo;
		@DbRecordField(dataSourceName="R_GRAD_RATE_6YR")
		public NNumber RGradRate6yr;
		@DbRecordField(dataSourceName="R_DEFAULT_RATE")
		public NNumber RDefaultRate;
		@DbRecordField(dataSourceName="R_DEFAULT_RATE_COMP")
		public NNumber RDefaultRateComp;
		@DbRecordField(dataSourceName="R_FED_MEDIAN_LOAN_AMT")
		public NNumber RFedMedianLoanAmt;
		@DbRecordField(dataSourceName="R_FED_MEDIAN_LOAN_YR")
		public NNumber RFedMedianLoanYr;
		@DbRecordField(dataSourceName="R_FED_LOAN_PMT_AMT")
		public NNumber RFedLoanPmtAmt;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INSTITUTION_GROUP")
		public NString RInstitutionGroup;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
