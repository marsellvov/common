package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokpval {
		public static NNumber fSelRobinstAidEndYear(NString aidyCodeIn,Ref<NNumber> aidEndYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.F_SEL_ROBINST_AID_END_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AIDY_CODE_IN", aidyCodeIn);
			cmd.addParameter("@AID_END_YEAR", NNumber.class);
				
			cmd.execute();
			aidEndYear.val = cmd.getParameterValue("@AID_END_YEAR", NNumber.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSelRobinstAidyEndYear(NString aidyCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.F_SEL_ROBINST_AIDY_END_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AIDY_CODE_IN", aidyCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fSelRobinstExists(NString aidyCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.F_SEL_ROBINST_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@AIDY_CODE_IN", aidyCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSelRobinstExistsStatus(NString aidyCodeIn,NString aidyStatIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.F_SEL_ROBINST_EXISTS_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@AIDY_CODE_IN", aidyCodeIn);
			cmd.addParameter("@AIDY_STAT_IN", aidyStatIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSelRobusdfColumns(NString columnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.F_SEL_ROBUSDF_COLUMNS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@COLUMN_IN", columnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSelectGjbprun1(NString ivar1,NNumber parmOneUpNo,Ref<NString> ovar1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.F_SELECT_GJBPRUN_1", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@IVAR_1", ivar1);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@OVAR_1", NString.class);
				
			cmd.execute();
			ovar1.val = cmd.getParameterValue("@OVAR_1", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTermxPrecedesTermy(NString termx,NString termy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.F_TERMX_PRECEDES_TERMY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERMX", termx);
			cmd.addParameter("@TERMY", termy);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pChkActiveFundCode(NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg,NString pdefFromAidyParmNo,NString pdefToAidyParmNo,NString pdefFundParmNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_CHK_ACTIVE_FUND_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
			cmd.addParameter("@PDEF_FROM_AIDY_PARM_NO", pdefFromAidyParmNo);
			cmd.addParameter("@PDEF_TO_AIDY_PARM_NO", pdefToAidyParmNo);
			cmd.addParameter("@PDEF_FUND_PARM_NO", pdefFundParmNo);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pChkDlSchoolCode(NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg,NString pdefAidyParmNo,NString pdefSchCdeParmNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_CHK_DL_SCHOOL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
			cmd.addParameter("@PDEF_AIDY_PARM_NO", pdefAidyParmNo);
			cmd.addParameter("@PDEF_SCH_CDE_PARM_NO", pdefSchCdeParmNo);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pChkFdrlFundSource(NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg,NString pdefFundSourceParmNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_CHK_FDRL_FUND_SOURCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
			cmd.addParameter("@PDEF_FUND_SOURCE_PARM_NO", pdefFundSourceParmNo);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pChkInvalidFundCode(NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg,NString pdefAidyParmNo,NString pdefFundParmNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_CHK_INVALID_FUND_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
			cmd.addParameter("@PDEF_AIDY_PARM_NO", pdefAidyParmNo);
			cmd.addParameter("@PDEF_FUND_PARM_NO", pdefFundParmNo);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pChkOpeidAndBranch(NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg,NString pdefAidyParmNo,NString pdefOpeidParmNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_CHK_OPEID_AND_BRANCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
			cmd.addParameter("@PDEF_AIDY_PARM_NO", pdefAidyParmNo);
			cmd.addParameter("@PDEF_OPEID_PARM_NO", pdefOpeidParmNo);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaChkCentury(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_CHK_CENTURY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaGlbapplEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_GLBAPPL_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaGtvcmscEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_GTVCMSC_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaGtvemalEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_GTVEMAL_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaGtvletrEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_GTVLETR_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaGtvntypEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_GTVNTYP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRcrapp1Equal(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RCRAPP1_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRebdrctEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_REBDRCT_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRercoddEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RERCODD_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRfrbaseEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RFRBASE_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRfrbaseEqual2(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RFRBASE_EQUAL_2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRfrbaseEqualNNotPell(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RFRBASE_EQUAL_N_NOT_PELL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRfrffidEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RFRFFID_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRjbplbdEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RJBPLBD_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRjrpaylEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RJRPAYL_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRjrplrlEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RJRPLRL_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRobinstEqualAidy(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_ROBINST_EQUAL_AIDY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRobinstEqualAidyActive(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_ROBINST_EQUAL_AIDY_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRobinstPrior0405Aidy(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_ROBINST_PRIOR_0405_AIDY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRpblndrEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RPBLNDR_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRpblprdEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RPBLPRD_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRpbstabEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RPBSTAB_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRprsahpEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RPRSAHP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvaprdEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVAPRD_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvaustEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVAUST_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvawstEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVAWST_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvawstEqualCancel(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVAWST_EQUAL_CANCEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvbgrpEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVBGRP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvbtypEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVBTYP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvccomEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVCCOM_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvfaspEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVFASP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvfaspEqualActive(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVFASP_EQUAL_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvfsrcEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVFSRC_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvftypEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVFTYP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvholdEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVHOLD_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvinfcEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVINFC_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvlnstEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVLNST_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvpgrpEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVPGRP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvtgrpEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVTGRP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvtreqEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVTREQ_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvtreqEqualActive(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVTREQ_EQUAL_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaRtvtrstEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_RTVTRST_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaSpridenEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_SPRIDEN_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaSpridenEqual2(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_SPRIDEN_EQUAL_2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaStvasrcEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_STVASRC_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaStvatypEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_STVATYP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaStvatypHierarchyEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_STVATYP_HIERARCHY_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaStvcampEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_STVCAMP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaStvlevlEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_STVLEVL_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaStvsbgiEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_STVSBGI_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaStvstypEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_STVSTYP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaStvteleEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_STVTELE_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaStvtermEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_STVTERM_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPaTbbdetcEqual(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PA_TBBDETC_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPop4thParm(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_POP_4TH_PARM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPopRbrabud(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_POP_RBRABUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRapagrlValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RAPAGRL_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRaratadValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RARATAD_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRcpdtmpValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RCPDTMP_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRcpimfmValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RCPIMFM_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRcrtpxxValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RCRTPXX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", valErrorInd, true);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRebcdxxValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_REBCDXX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRercalxValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RERCALX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pPrRercdxxValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RERCDXX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRerexxxValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_REREXXX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pPrRergrntValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RERGRNT_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRerimexValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RERIMEX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRerisxxValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RERISXX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRerorxxValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RERORXX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRfpfbrlValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RFPFBRL_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRfrabalAidyTerm(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RFRABAL_AIDY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRhrcommValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RHRCOMM_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRhrpcomValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RHRPCOM_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRjrauthValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RJRAUTH_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pPrRlrletrValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RLRLETR_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pPrRneinxxValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RNEINXX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRnrtmacValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RNRTMAC_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRnrtmneValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RNRTMNE_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRnrtmniValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RNRTMNI_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRnrvrfyValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RNRVRFY_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRobxrecValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_ROBXREC_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRoesaprValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_ROESAPR_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", valErrorInd, true);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRoptermValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_ROPTERM_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRorcalcValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RORCALC_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRorgrdeValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RORGRDE_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pPrRorgrpsValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RORGRPS_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRorhsdpValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RORHSDP_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRorregsValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RORREGS_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pPrRpblmidValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPBLMID_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRpblmieValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPBLMIE_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRpbvldtAidyTerm(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPBVLDT_AIDY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRpbvldtValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPBVLDT_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", valErrorInd, true);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRpedisbAidyTermPopSel(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPEDISB_AIDY_TERM_POP_SEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", valErrorInd, true);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRpepckgValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPEPCKG_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRppinfoValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPPINFO_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRpppinfValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPPPINF_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRpradsbAidyTerm(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRADSB_AIDY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprarolValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRAROL_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprawrdAidyTermPopSel(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRAWRD_AIDY_TERM_POP_SEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", valErrorInd, true);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprcnclValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRCNCL_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprddupValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRDDUP_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprdlpmValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRDLPM_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprdsptValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRDSPT_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pPrRprdu09Validation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRDU09_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprelapValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRELAP_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprelaxValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRELAX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprelctValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRELCT_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprhdrlValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRHDRL_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprlnexValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRLNEX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprlorcValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRLORC_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprlsumValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRLSUM_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprpnptValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRPNPT_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprsbprAidyTerm(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRSBPR_AIDY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprsmrtValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRSMRT_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprvabnValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRVABN_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprvawdValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRVAWD_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRprvdisValidation(NString valLabel,NNumber parmOneUpNo,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RPRVDIS_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRrrareqValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RRRAREQ_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRrrexitValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RRREXIT_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRsrdscpValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RSRDSCP_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRsrenrlValidation(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RSRENRL_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", valErrorInd, true);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pPrRtvinfcLoadOption(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_PR_RTVINFC_LOAD_OPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
		public static void pRcrtpxxValidation(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RCRTPXX_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", valErrInd, true);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRfrabalAidyTerm(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RFRABAL_AIDY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRobxrecAidyTerm(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_ROBXREC_AIDY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRpbvldtAidyTerm(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RPBVLDT_AIDY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRpbvldtValidation(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RPBVLDT_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", valErrInd, true);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRpedisbAidyTermPopSel(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RPEDISB_AIDY_TERM_POP_SEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", valErrInd, true);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRpradsbAidyTerm(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RPRADSB_AIDY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRprawrdAidyTermPopSel(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RPRAWRD_AIDY_TERM_POP_SEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", valErrInd, true);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRprcnclOptionAwst(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RPRCNCL_OPTION_AWST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRprsbprAidyTerm(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RPRSBPR_AIDY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRsrenrlAidyTermPopSel(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RSRENRL_AIDY_TERM_POP_SEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", valErrInd, true);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pRtvinfcLoadOption(NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_RTVINFC_LOAD_OPTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pSetError(NString valLabel,NString valValue,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_SET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidAidEndYear(NString pNo1,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_VALID_AID_END_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NO1", pNo1);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidAidyTerm(NString pNo1,NString pNo2,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_VALID_AIDY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NO1", pNo1);
			cmd.addParameter("@P_NO2", pNo2);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidPnoteInd(NString pNo1,NString pNo2,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_VALID_PNOTE_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NO1", pNo1);
			cmd.addParameter("@P_NO2", pNo2);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidPopSel3(NString pNo1,NString pNo2,NString pNo3,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_VALID_POP_SEL_3", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NO1", pNo1);
			cmd.addParameter("@P_NO2", pNo2);
			cmd.addParameter("@P_NO3", pNo3);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidPopSel4(NString pNo1,NString pNo2,NString pNo3,NString pNo4,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_VALID_POP_SEL_4", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NO1", pNo1);
			cmd.addParameter("@P_NO2", pNo2);
			cmd.addParameter("@P_NO3", pNo3);
			cmd.addParameter("@P_NO4", pNo4);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidPopulationSelection(NString pNo1,NString pNo2,NString pNo3,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_VALID_POPULATION_SELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NO1", pNo1);
			cmd.addParameter("@P_NO2", pNo2);
			cmd.addParameter("@P_NO3", pNo3);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidSchoolBranchCode(NString pNo1,NString pNo2,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_VALID_SCHOOL_BRANCH_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NO1", pNo1);
			cmd.addParameter("@P_NO2", pNo2);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidVersionNo(NString pNo1,NString pNo2,NNumber parmOneUpNo,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_VALID_VERSION_NO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NO1", pNo1);
			cmd.addParameter("@P_NO2", pNo2);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidate(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrInd,Ref<NString> validationErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERR_IND", validationErrInd, true);
			cmd.addParameter("@VALIDATION_ERR_MSG", validationErrMsg, true);
				
			cmd.execute();
			validationErrInd.val = cmd.getParameterValue("@VALIDATION_ERR_IND", NString.class);
			validationErrMsg.val = cmd.getParameterValue("@VALIDATION_ERR_MSG", NString.class);


		}
		
		public static void pYrInCollRbrabud(NString valLabel,NNumber parmOneUpNo,NString valValue,Ref<NString> valErrorInd,Ref<NString> valErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPVAL.P_YR_IN_COLL_RBRABUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VAL_VALUE", valValue);
			cmd.addParameter("@VAL_ERROR_IND", NString.class);
			cmd.addParameter("@VAL_ERROR_MSG", NString.class);
				
			cmd.execute();
			valErrorInd.val = cmd.getParameterValue("@VAL_ERROR_IND", NString.class);
			valErrorMsg.val = cmd.getParameterValue("@VAL_ERROR_MSG", NString.class);


		}
		
	
	
	
}
