package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvHrLocalizationInst {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(HrLocalizationInstRecRow recOne,HrLocalizationInstRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, HrLocalizationInstRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, HrLocalizationInstRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEclsSecurityInd,NString pTaxExemptDednInd,NString pEmalnIndicator,NString pUserId,NString pDataOrigin,NString pTaxreportControl,NString pPrintSlipInd,NString pCode,NString pRevokeTfrmConstInd,NString pRevokeTfrmLeaveInd,NString pYearWebT4,NString pYearWebT4a,NString pYearWebT4anr,NString pYearWebRl1,NString pYearWebRl2,NString pYearWebNr4,NDate pViewingDateT4,NDate pViewingDateT4a,NDate pViewingDateT4anr,NDate pViewingDateNr4,NDate pViewingDateRl1,NDate pViewingDateRl2,NString pSortOrgnInd, Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_SECURITY_IND", pEclsSecurityInd);
			cmd.addParameter("@P_TAX_EXEMPT_DEDN_IND", pTaxExemptDednInd);
			cmd.addParameter("@P_EMALN_INDICATOR", pEmalnIndicator);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TAXREPORT_CONTROL", pTaxreportControl);
			cmd.addParameter("@P_PRINT_SLIP_IND", pPrintSlipInd);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_REVOKE_TFRM_CONST_IND", pRevokeTfrmConstInd);
			cmd.addParameter("@P_REVOKE_TFRM_LEAVE_IND", pRevokeTfrmLeaveInd);
			cmd.addParameter("@P_YEAR_WEB_T4", pYearWebT4);
			cmd.addParameter("@P_YEAR_WEB_T4A", pYearWebT4a);
			cmd.addParameter("@P_YEAR_WEB_T4ANR", pYearWebT4anr);
			cmd.addParameter("@P_YEAR_WEB_RL1", pYearWebRl1);
			cmd.addParameter("@P_YEAR_WEB_RL2", pYearWebRl2);
			cmd.addParameter("@P_YEAR_WEB_NR4", pYearWebNr4);
			cmd.addParameter("@P_VIEWING_DATE_T4", pViewingDateT4);
			cmd.addParameter("@P_VIEWING_DATE_T4A", pViewingDateT4a);
			cmd.addParameter("@P_VIEWING_DATE_T4ANR", pViewingDateT4anr);
			cmd.addParameter("@P_VIEWING_DATE_NR4", pViewingDateNr4);
			cmd.addParameter("@P_VIEWING_DATE_RL1", pViewingDateRl1);
			cmd.addParameter("@P_VIEWING_DATE_RL2", pViewingDateRl2);
			cmd.addParameter("@P_SORT_ORGN_IND", pSortOrgnInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEclsSecurityInd,NString pTaxExemptDednInd,NString pEmalnIndicator,NString pUserId,NString pDataOrigin,NString pTaxreportControl,NString pPrintSlipInd,NString pCode,NString pRevokeTfrmConstInd,NString pRevokeTfrmLeaveInd,NString pYearWebT4,NString pYearWebT4a,NString pYearWebT4anr,NString pYearWebRl1,NString pYearWebRl2,NString pYearWebNr4,NDate pViewingDateT4,NDate pViewingDateT4a,NDate pViewingDateT4anr,NDate pViewingDateNr4,NDate pViewingDateRl1,NDate pViewingDateRl2,NString pSortOrgnInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_HR_LOCALIZATION_INST.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_SECURITY_IND", pEclsSecurityInd);
			cmd.addParameter("@P_TAX_EXEMPT_DEDN_IND", pTaxExemptDednInd);
			cmd.addParameter("@P_EMALN_INDICATOR", pEmalnIndicator);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TAXREPORT_CONTROL", pTaxreportControl);
			cmd.addParameter("@P_PRINT_SLIP_IND", pPrintSlipInd);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_REVOKE_TFRM_CONST_IND", pRevokeTfrmConstInd);
			cmd.addParameter("@P_REVOKE_TFRM_LEAVE_IND", pRevokeTfrmLeaveInd);
			cmd.addParameter("@P_YEAR_WEB_T4", pYearWebT4);
			cmd.addParameter("@P_YEAR_WEB_T4A", pYearWebT4a);
			cmd.addParameter("@P_YEAR_WEB_T4ANR", pYearWebT4anr);
			cmd.addParameter("@P_YEAR_WEB_RL1", pYearWebRl1);
			cmd.addParameter("@P_YEAR_WEB_RL2", pYearWebRl2);
			cmd.addParameter("@P_YEAR_WEB_NR4", pYearWebNr4);
			cmd.addParameter("@P_VIEWING_DATE_T4", pViewingDateT4);
			cmd.addParameter("@P_VIEWING_DATE_T4A", pViewingDateT4a);
			cmd.addParameter("@P_VIEWING_DATE_T4ANR", pViewingDateT4anr);
			cmd.addParameter("@P_VIEWING_DATE_NR4", pViewingDateNr4);
			cmd.addParameter("@P_VIEWING_DATE_RL1", pViewingDateRl1);
			cmd.addParameter("@P_VIEWING_DATE_RL2", pViewingDateRl2);
			cmd.addParameter("@P_SORT_ORGN_IND", pSortOrgnInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="HrLocalizationInstRecRow", dataSourceName="HR_LOCALIZATION_INST_REC", rowType=true)
	public static class HrLocalizationInstRecRow
	{
	}

	
	
}
