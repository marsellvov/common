package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbBenefitRounding {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsPtrbdca(NString pPtrbdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.F_EXISTS_PTRBDCA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PTRBDCA_CODE", pPtrbdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(BenefitRoundingRecRow recOne,BenefitRoundingRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, BenefitRoundingRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, BenefitRoundingRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pBdcaCode,NString pRound,NString pPrecision,NString pApplyEmployee,NString pApplyEmployer,NString pApplyBoth,NString pDifEmployee,NString pDifEmployer,NString pDifBoth,NString pUserId,NString pDataOrigin,NString pMonthInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROUND", pRound);
			cmd.addParameter("@P_PRECISION", pPrecision);
			cmd.addParameter("@P_APPLY_EMPLOYEE", pApplyEmployee);
			cmd.addParameter("@P_APPLY_EMPLOYER", pApplyEmployer);
			cmd.addParameter("@P_APPLY_BOTH", pApplyBoth);
			cmd.addParameter("@P_DIF_EMPLOYEE", pDifEmployee);
			cmd.addParameter("@P_DIF_EMPLOYER", pDifEmployer);
			cmd.addParameter("@P_DIF_BOTH", pDifBoth);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MONTH_IND", pMonthInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pBdcaCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pBdcaCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pBdcaCode,NString pRound,NString pPrecision,NString pApplyEmployee,NString pApplyEmployer,NString pApplyBoth,NString pDifEmployee,NString pDifEmployer,NString pDifBoth,NString pUserId,NString pDataOrigin,NString pMonthInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_ROUNDING.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ROUND", pRound);
			cmd.addParameter("@P_PRECISION", pPrecision);
			cmd.addParameter("@P_APPLY_EMPLOYEE", pApplyEmployee);
			cmd.addParameter("@P_APPLY_EMPLOYER", pApplyEmployer);
			cmd.addParameter("@P_APPLY_BOTH", pApplyBoth);
			cmd.addParameter("@P_DIF_EMPLOYEE", pDifEmployee);
			cmd.addParameter("@P_DIF_EMPLOYER", pDifEmployer);
			cmd.addParameter("@P_DIF_BOTH", pDifBoth);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MONTH_IND", pMonthInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="BenefitRoundingRecRow", dataSourceName="BENEFIT_ROUNDING_REC", needsInitialization=true)
	public static class BenefitRoundingRecRow
	{
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_ROUND")
		public NString RRound;
		@DbRecordField(dataSourceName="R_PRECISION")
		public NString RPrecision;
		@DbRecordField(dataSourceName="R_APPLY_EMPLOYEE")
		public NString RApplyEmployee;
		@DbRecordField(dataSourceName="R_APPLY_EMPLOYER")
		public NString RApplyEmployer;
		@DbRecordField(dataSourceName="R_APPLY_BOTH")
		public NString RApplyBoth;
		@DbRecordField(dataSourceName="R_DIF_EMPLOYEE")
		public NString RDifEmployee;
		@DbRecordField(dataSourceName="R_DIF_EMPLOYER")
		public NString RDifEmployer;
		@DbRecordField(dataSourceName="R_DIF_BOTH")
		public NString RDifBoth;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_MONTH_IND")
		public NString RMonthInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
