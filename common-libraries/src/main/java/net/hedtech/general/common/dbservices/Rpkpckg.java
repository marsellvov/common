package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpkpckg {
		public static NNumber fCalcFundCompAmt(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.F_CALC_FUND_COMP_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fFundInCategory(NString pAidyCode,NString pPgrpCode,NString pFcatCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.F_FUND_IN_CATEGORY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PGRP_CODE", pPgrpCode);
			cmd.addParameter("@P_FCAT_CODE", pFcatCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetFcatExistingAmt(NString pAidyCode,NNumber pPidm,NString pSimulateSw,NString pFcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.F_GET_FCAT_EXISTING_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SIMULATE_SW", pSimulateSw);
			cmd.addParameter("@P_FCAT_CODE", pFcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetFsrcExistingAmt(NString pAidyCode,NNumber pPidm,NString pSimulateSw,NString pFsrcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.F_GET_FSRC_EXISTING_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SIMULATE_SW", pSimulateSw);
			cmd.addParameter("@P_FSRC_CODE", pFsrcCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetFundCompExists(NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.F_GET_FUND_COMP_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreateFundTotalTable(NString pAidyCode,NString pSimulateSw) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.P_CREATE_FUND_TOTAL_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SIMULATE_SW", pSimulateSw);
				
			cmd.execute();


		}
		
		public static void pCreateTempFundTable(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.P_CREATE_TEMP_FUND_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();


		}
		
		public static void pInsertGubprun(NString pAidyCode,NString pId,Ref<NString> pOneUpNoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.P_INSERT_GUBPRUN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ONE_UP_NO_OUT", NString.class);
				
			cmd.execute();
			pOneUpNoOut.val = cmd.getParameterValue("@P_ONE_UP_NO_OUT", NString.class);


		}
		
		public static void pInsertTempAppStatusTable(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.P_INSERT_TEMP_APP_STATUS_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pOpenAwardsCv(NString pAidyCode,NNumber pPidm,NString pSimulateSw,Ref<DataCursor> pGetAwardsCvInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.P_OPEN_AWARDS_CV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SIMULATE_SW", pSimulateSw);
			cmd.addParameter("@P_GET_AWARDS_CV_INOUT", DataCursor.class);
				
			cmd.execute();
			pGetAwardsCvInout.val = cmd.getParameterValue("@P_GET_AWARDS_CV_INOUT", DataCursor.class);


		}
		
		public static void pUpdateRftaspc(NString pAidyCode,NString pFundCode,NNumber pInsufficientNo,NNumber pInsufficientAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKPCKG.P_UPDATE_RFTASPC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_INSUFFICIENT_NO", pInsufficientNo);
			cmd.addParameter("@P_INSUFFICIENT_AMT", pInsufficientAmt);
				
			cmd.execute();


		}
		
	
	
	
}
