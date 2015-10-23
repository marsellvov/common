package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbEmpPaystub {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EmpPaystubRecRow recOne,EmpPaystubRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EmpPaystubRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EmpPaystubRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCode,NString pDispIdInd,NString pDispSsnInd,NString pDispNameInd,NString pDispAddressInd,NString pDispPayIdNumInd,NString pDispPayDatesInd,NString pDispCheckDdInfoInd,NString pDispYtdAmtsInd,NString pDispPosnSuffInd,NString pDispJobTitleInd,NString pDispEmprAmtInd,NString pDispFedLocalWhInd,NString pDispPaysumEmprInd,NString pDispEmprNameInd,NString pDispEmprAddrInd,NString pDispEmprPhoneInd,NString pEmprInfoLocation,NString pUserId,NString pDataOrigin,NString pIdLabel,NString pSsnLabel,NString pDispPaystubInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DISP_ID_IND", pDispIdInd);
			cmd.addParameter("@P_DISP_SSN_IND", pDispSsnInd);
			cmd.addParameter("@P_DISP_NAME_IND", pDispNameInd);
			cmd.addParameter("@P_DISP_ADDRESS_IND", pDispAddressInd);
			cmd.addParameter("@P_DISP_PAY_ID_NUM_IND", pDispPayIdNumInd);
			cmd.addParameter("@P_DISP_PAY_DATES_IND", pDispPayDatesInd);
			cmd.addParameter("@P_DISP_CHECK_DD_INFO_IND", pDispCheckDdInfoInd);
			cmd.addParameter("@P_DISP_YTD_AMTS_IND", pDispYtdAmtsInd);
			cmd.addParameter("@P_DISP_POSN_SUFF_IND", pDispPosnSuffInd);
			cmd.addParameter("@P_DISP_JOB_TITLE_IND", pDispJobTitleInd);
			cmd.addParameter("@P_DISP_EMPR_AMT_IND", pDispEmprAmtInd);
			cmd.addParameter("@P_DISP_FED_LOCAL_WH_IND", pDispFedLocalWhInd);
			cmd.addParameter("@P_DISP_PAYSUM_EMPR_IND", pDispPaysumEmprInd);
			cmd.addParameter("@P_DISP_EMPR_NAME_IND", pDispEmprNameInd);
			cmd.addParameter("@P_DISP_EMPR_ADDR_IND", pDispEmprAddrInd);
			cmd.addParameter("@P_DISP_EMPR_PHONE_IND", pDispEmprPhoneInd);
			cmd.addParameter("@P_EMPR_INFO_LOCATION", pEmprInfoLocation);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_LABEL", pIdLabel);
			cmd.addParameter("@P_SSN_LABEL", pSsnLabel);
			cmd.addParameter("@P_DISP_PAYSTUB_IND",pDispPaystubInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCode,NString pDispIdInd,NString pDispSsnInd,NString pDispNameInd,NString pDispAddressInd,NString pDispPayIdNumInd,NString pDispPayDatesInd,NString pDispCheckDdInfoInd,NString pDispYtdAmtsInd,NString pDispPosnSuffInd,NString pDispJobTitleInd,NString pDispEmprAmtInd,NString pDispFedLocalWhInd,NString pDispPaysumEmprInd,NString pDispEmprNameInd,NString pDispEmprAddrInd,NString pDispEmprPhoneInd,NString pEmprInfoLocation,NString pUserId,NString pDataOrigin,NString pIdLabel,NString pSsnLabel,NString pDispPaystubInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EMP_PAYSTUB.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DISP_ID_IND", pDispIdInd);
			cmd.addParameter("@P_DISP_SSN_IND", pDispSsnInd);
			cmd.addParameter("@P_DISP_NAME_IND", pDispNameInd);
			cmd.addParameter("@P_DISP_ADDRESS_IND", pDispAddressInd);
			cmd.addParameter("@P_DISP_PAY_ID_NUM_IND", pDispPayIdNumInd);
			cmd.addParameter("@P_DISP_PAY_DATES_IND", pDispPayDatesInd);
			cmd.addParameter("@P_DISP_CHECK_DD_INFO_IND", pDispCheckDdInfoInd);
			cmd.addParameter("@P_DISP_YTD_AMTS_IND", pDispYtdAmtsInd);
			cmd.addParameter("@P_DISP_POSN_SUFF_IND", pDispPosnSuffInd);
			cmd.addParameter("@P_DISP_JOB_TITLE_IND", pDispJobTitleInd);
			cmd.addParameter("@P_DISP_EMPR_AMT_IND", pDispEmprAmtInd);
			cmd.addParameter("@P_DISP_FED_LOCAL_WH_IND", pDispFedLocalWhInd);
			cmd.addParameter("@P_DISP_PAYSUM_EMPR_IND", pDispPaysumEmprInd);
			cmd.addParameter("@P_DISP_EMPR_NAME_IND", pDispEmprNameInd);
			cmd.addParameter("@P_DISP_EMPR_ADDR_IND", pDispEmprAddrInd);
			cmd.addParameter("@P_DISP_EMPR_PHONE_IND", pDispEmprPhoneInd);
			cmd.addParameter("@P_EMPR_INFO_LOCATION", pEmprInfoLocation);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_LABEL", pIdLabel);
			cmd.addParameter("@P_SSN_LABEL", pSsnLabel);
			cmd.addParameter("@P_DISP_PAYSTUB_IND",pDispPaystubInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EmpPaystubRecRow", dataSourceName="EMP_PAYSTUB_REC")
	public static class EmpPaystubRecRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_DISP_ID_IND")
		public NString RDispIdInd;
		@DbRecordField(dataSourceName="R_DISP_SSN_IND")
		public NString RDispSsnInd;
		@DbRecordField(dataSourceName="R_DISP_NAME_IND")
		public NString RDispNameInd;
		@DbRecordField(dataSourceName="R_DISP_ADDRESS_IND")
		public NString RDispAddressInd;
		@DbRecordField(dataSourceName="R_DISP_PAY_ID_NUM_IND")
		public NString RDispPayIdNumInd;
		@DbRecordField(dataSourceName="R_DISP_PAY_DATES_IND")
		public NString RDispPayDatesInd;
		@DbRecordField(dataSourceName="R_DISP_CHECK_DD_INFO_IND")
		public NString RDispCheckDdInfoInd;
		@DbRecordField(dataSourceName="R_DISP_YTD_AMTS_IND")
		public NString RDispYtdAmtsInd;
		@DbRecordField(dataSourceName="R_DISP_POSN_SUFF_IND")
		public NString RDispPosnSuffInd;
		@DbRecordField(dataSourceName="R_DISP_JOB_TITLE_IND")
		public NString RDispJobTitleInd;
		@DbRecordField(dataSourceName="R_DISP_EMPR_AMT_IND")
		public NString RDispEmprAmtInd;
		@DbRecordField(dataSourceName="R_DISP_FED_LOCAL_WH_IND")
		public NString RDispFedLocalWhInd;
		@DbRecordField(dataSourceName="R_DISP_PAYSUM_EMPR_IND")
		public NString RDispPaysumEmprInd;
		@DbRecordField(dataSourceName="R_DISP_EMPR_NAME_IND")
		public NString RDispEmprNameInd;
		@DbRecordField(dataSourceName="R_DISP_EMPR_ADDR_IND")
		public NString RDispEmprAddrInd;
		@DbRecordField(dataSourceName="R_DISP_EMPR_PHONE_IND")
		public NString RDispEmprPhoneInd;
		@DbRecordField(dataSourceName="R_EMPR_INFO_LOCATION")
		public NString REmprInfoLocation;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_ID_LABEL")
		public NString RIdLabel;
		@DbRecordField(dataSourceName="R_SSN_LABEL")
		public NString RSsnLabel;
		@DbRecordField(dataSourceName="R_DISP_PAYSTUB_IND")
		public NString RDispPaystubInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
