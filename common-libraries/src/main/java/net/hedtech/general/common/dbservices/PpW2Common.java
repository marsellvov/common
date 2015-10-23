package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PpW2Common {
		public static NString fBoxDesc(NString pRboxCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.F_BOX_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RBOX_CODE", pRboxCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCodedInfoInd(NNumber pYear,NString pBoxCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.F_CODED_INFO_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fQuarterEndMonth(NNumber pQuarter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.F_QUARTER_END_MONTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_QUARTER", pQuarter);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fQuarterStartMonth(NNumber pQuarter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.F_QUARTER_START_MONTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_QUARTER", pQuarter);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fString(NString pStringName,NString pValue01,NString pValue02,NString pValue03) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.F_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING_NAME", pStringName);
			cmd.addParameter("@P_VALUE_01", pValue01);
			cmd.addParameter("@P_VALUE_02", pValue02);
			cmd.addParameter("@P_VALUE_03", pValue03);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fW2CurrentTaxYear() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.F_W2_CURRENT_TAX_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fW2ReptCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.F_W2_REPT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fW2TypeCorrection() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.F_W2_TYPE_CORRECTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fW2TypeOriginal() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.F_W2_TYPE_ORIGINAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fW2TypeTotalsOnly() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.F_W2_TYPE_TOTALS_ONLY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCheckFailure(NString pErrorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.P_CHECK_FAILURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
				
			cmd.execute();


		}
		
		public static void pCreateW2(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NString pW2Type,NString pZeroOutNegInd,NString pReissueInd,Ref<NNumber> pSeqNoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.P_CREATE_W2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_W2_TYPE", pW2Type);
			cmd.addParameter("@P_ZERO_OUT_NEG_IND", pZeroOutNegInd);
			cmd.addParameter("@P_REISSUE_IND", pReissueInd);
			cmd.addParameter("@P_SEQ_NO_OUT", NNumber.class);
				
			cmd.execute();
			pSeqNoOut.val = cmd.getParameterValue("@P_SEQ_NO_OUT", NNumber.class);


		}
		
		public static void pDeleteW2(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.P_DELETE_W2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();


		}
		
		public static void pValidateTaxYear(NNumber pSpecifiedTaxYear,NNumber pExpectedTaxYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_COMMON.P_VALIDATE_TAX_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SPECIFIED_TAX_YEAR", pSpecifiedTaxYear);
			cmd.addParameter("@P_EXPECTED_TAX_YEAR", pExpectedTaxYear);
				
			cmd.execute();


		}
		
	
	
	
}
