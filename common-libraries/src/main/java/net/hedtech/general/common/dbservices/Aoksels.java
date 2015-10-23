package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Aoksels {
		public static void pEditAcciCode(NString effDateIn,NString acciCodeIn,NString coasCodeIn,Ref<NString> holdFundCodeInOut,Ref<NString> holdOrgnCodeInOut,Ref<NString> holdAcctCodeInOut,Ref<NString> holdProgCodeInOut,Ref<NString> holdActvCodeInOut,Ref<NString> holdLocnCodeInOut,Ref<NString> fundOverrideInOut,Ref<NString> orgnOverrideInOut,Ref<NString> acctOverrideInOut,Ref<NString> progOverrideInOut,Ref<NString> actvOverrideInOut,Ref<NString> locnOverrideInOut,Ref<NString> messErrInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKSELS.P_EDIT_ACCI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@ACCI_CODE_IN", acciCodeIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@HOLD_FUND_CODE_IN_OUT", holdFundCodeInOut, true);
			cmd.addParameter("@HOLD_ORGN_CODE_IN_OUT", holdOrgnCodeInOut, true);
			cmd.addParameter("@HOLD_ACCT_CODE_IN_OUT", holdAcctCodeInOut, true);
			cmd.addParameter("@HOLD_PROG_CODE_IN_OUT", holdProgCodeInOut, true);
			cmd.addParameter("@HOLD_ACTV_CODE_IN_OUT", holdActvCodeInOut, true);
			cmd.addParameter("@HOLD_LOCN_CODE_IN_OUT", holdLocnCodeInOut, true);
			cmd.addParameter("@FUND_OVERRIDE_IN_OUT", fundOverrideInOut, true);
			cmd.addParameter("@ORGN_OVERRIDE_IN_OUT", orgnOverrideInOut, true);
			cmd.addParameter("@ACCT_OVERRIDE_IN_OUT", acctOverrideInOut, true);
			cmd.addParameter("@PROG_OVERRIDE_IN_OUT", progOverrideInOut, true);
			cmd.addParameter("@ACTV_OVERRIDE_IN_OUT", actvOverrideInOut, true);
			cmd.addParameter("@LOCN_OVERRIDE_IN_OUT", locnOverrideInOut, true);
			cmd.addParameter("@MESS_ERR_IN_OUT", messErrInOut, true);
				
			cmd.execute();
			holdFundCodeInOut.val = cmd.getParameterValue("@HOLD_FUND_CODE_IN_OUT", NString.class);
			holdOrgnCodeInOut.val = cmd.getParameterValue("@HOLD_ORGN_CODE_IN_OUT", NString.class);
			holdAcctCodeInOut.val = cmd.getParameterValue("@HOLD_ACCT_CODE_IN_OUT", NString.class);
			holdProgCodeInOut.val = cmd.getParameterValue("@HOLD_PROG_CODE_IN_OUT", NString.class);
			holdActvCodeInOut.val = cmd.getParameterValue("@HOLD_ACTV_CODE_IN_OUT", NString.class);
			holdLocnCodeInOut.val = cmd.getParameterValue("@HOLD_LOCN_CODE_IN_OUT", NString.class);
			fundOverrideInOut.val = cmd.getParameterValue("@FUND_OVERRIDE_IN_OUT", NString.class);
			orgnOverrideInOut.val = cmd.getParameterValue("@ORGN_OVERRIDE_IN_OUT", NString.class);
			acctOverrideInOut.val = cmd.getParameterValue("@ACCT_OVERRIDE_IN_OUT", NString.class);
			progOverrideInOut.val = cmd.getParameterValue("@PROG_OVERRIDE_IN_OUT", NString.class);
			actvOverrideInOut.val = cmd.getParameterValue("@ACTV_OVERRIDE_IN_OUT", NString.class);
			locnOverrideInOut.val = cmd.getParameterValue("@LOCN_OVERRIDE_IN_OUT", NString.class);
			messErrInOut.val = cmd.getParameterValue("@MESS_ERR_IN_OUT", NString.class);


		}
		
		public static void pEditAcctCode(NString effDateIn,NString coasCodeIn,NString acctCodeIn,Ref<NString> messErrInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKSELS.P_EDIT_ACCT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ACCT_CODE_IN", acctCodeIn);
			cmd.addParameter("@MESS_ERR_IN_OUT", messErrInOut, true);
				
			cmd.execute();
			messErrInOut.val = cmd.getParameterValue("@MESS_ERR_IN_OUT", NString.class);


		}
		
		public static void pEditActvCode(NString effDateIn,NString coasCodeIn,NString actvCodeIn,Ref<NString> messErrInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKSELS.P_EDIT_ACTV_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ACTV_CODE_IN", actvCodeIn);
			cmd.addParameter("@MESS_ERR_IN_OUT", messErrInOut, true);
				
			cmd.execute();
			messErrInOut.val = cmd.getParameterValue("@MESS_ERR_IN_OUT", NString.class);


		}
		
		public static void pEditCoasCode(NString effDateIn,NString coasCodeIn,Ref<NString> messErrInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKSELS.P_EDIT_COAS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@MESS_ERR_IN_OUT", messErrInOut, true);
				
			cmd.execute();
			messErrInOut.val = cmd.getParameterValue("@MESS_ERR_IN_OUT", NString.class);


		}
		
		public static void pEditFrbpropCode(NString frbpropCodeIn,Ref<NString> frbpropTitleOut,Ref<NString> messErrInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKSELS.P_EDIT_FRBPROP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FRBPROP_CODE_IN", frbpropCodeIn);
			cmd.addParameter("@FRBPROP_TITLE_OUT", NString.class);
			cmd.addParameter("@MESS_ERR_IN_OUT", messErrInOut, true);
				
			cmd.execute();
			frbpropTitleOut.val = cmd.getParameterValue("@FRBPROP_TITLE_OUT", NString.class);
			messErrInOut.val = cmd.getParameterValue("@MESS_ERR_IN_OUT", NString.class);


		}
		
		public static void pEditFundCode(NString effDateIn,NString coasCodeIn,NString workFundIn,NString glFundOrgnSecIn,NString currentUserIn,Ref<NString> workOrgnInOut,NString reeditOrgnIn,Ref<NString> messErrInOut,Ref<NString> ftypCodeInOut,Ref<NString> orgnCodeDefInOut,Ref<NString> progCodeDefInOut,Ref<NString> actvCodeDefInOut,Ref<NString> locnCodeDefInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKSELS.P_EDIT_FUND_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@WORK_FUND_IN", workFundIn);
			cmd.addParameter("@GL_FUND_ORGN_SEC_IN", glFundOrgnSecIn);
			cmd.addParameter("@CURRENT_USER_IN", currentUserIn);
			cmd.addParameter("@WORK_ORGN_IN_OUT", workOrgnInOut, true);
			cmd.addParameter("@REEDIT_ORGN_IN", reeditOrgnIn);
			cmd.addParameter("@MESS_ERR_IN_OUT", messErrInOut, true);
			cmd.addParameter("@FTYP_CODE_IN_OUT", ftypCodeInOut, true);
			cmd.addParameter("@ORGN_CODE_DEF_IN_OUT", orgnCodeDefInOut, true);
			cmd.addParameter("@PROG_CODE_DEF_IN_OUT", progCodeDefInOut, true);
			cmd.addParameter("@ACTV_CODE_DEF_IN_OUT", actvCodeDefInOut, true);
			cmd.addParameter("@LOCN_CODE_DEF_IN_OUT", locnCodeDefInOut, true);
				
			cmd.execute();
			workOrgnInOut.val = cmd.getParameterValue("@WORK_ORGN_IN_OUT", NString.class);
			messErrInOut.val = cmd.getParameterValue("@MESS_ERR_IN_OUT", NString.class);
			ftypCodeInOut.val = cmd.getParameterValue("@FTYP_CODE_IN_OUT", NString.class);
			orgnCodeDefInOut.val = cmd.getParameterValue("@ORGN_CODE_DEF_IN_OUT", NString.class);
			progCodeDefInOut.val = cmd.getParameterValue("@PROG_CODE_DEF_IN_OUT", NString.class);
			actvCodeDefInOut.val = cmd.getParameterValue("@ACTV_CODE_DEF_IN_OUT", NString.class);
			locnCodeDefInOut.val = cmd.getParameterValue("@LOCN_CODE_DEF_IN_OUT", NString.class);


		}
		
		public static void pEditLocnCode(NString effDateIn,NString coasCodeIn,NString locnCodeIn,Ref<NString> messErrInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKSELS.P_EDIT_LOCN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@LOCN_CODE_IN", locnCodeIn);
			cmd.addParameter("@MESS_ERR_IN_OUT", messErrInOut, true);
				
			cmd.execute();
			messErrInOut.val = cmd.getParameterValue("@MESS_ERR_IN_OUT", NString.class);


		}
		
		public static void pEditOrgnCode(NString effDateIn,NString coasCodeIn,NString workOrgnIn,NString glFundOrgnSecIn,NString currentUserIn,Ref<NString> workFundInOut,NString reeditIndIn,Ref<NString> messErrInOut,Ref<NString> fundCodeDefInOut,Ref<NString> progCodeDefInOut,Ref<NString> actvCodeDefInOut,Ref<NString> locnCodeDefInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKSELS.P_EDIT_ORGN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@WORK_ORGN_IN", workOrgnIn);
			cmd.addParameter("@GL_FUND_ORGN_SEC_IN", glFundOrgnSecIn);
			cmd.addParameter("@CURRENT_USER_IN", currentUserIn);
			cmd.addParameter("@WORK_FUND_IN_OUT", workFundInOut, true);
			cmd.addParameter("@REEDIT_IND_IN", reeditIndIn);
			cmd.addParameter("@MESS_ERR_IN_OUT", messErrInOut, true);
			cmd.addParameter("@FUND_CODE_DEF_IN_OUT", fundCodeDefInOut, true);
			cmd.addParameter("@PROG_CODE_DEF_IN_OUT", progCodeDefInOut, true);
			cmd.addParameter("@ACTV_CODE_DEF_IN_OUT", actvCodeDefInOut, true);
			cmd.addParameter("@LOCN_CODE_DEF_IN_OUT", locnCodeDefInOut, true);
				
			cmd.execute();
			workFundInOut.val = cmd.getParameterValue("@WORK_FUND_IN_OUT", NString.class);
			messErrInOut.val = cmd.getParameterValue("@MESS_ERR_IN_OUT", NString.class);
			fundCodeDefInOut.val = cmd.getParameterValue("@FUND_CODE_DEF_IN_OUT", NString.class);
			progCodeDefInOut.val = cmd.getParameterValue("@PROG_CODE_DEF_IN_OUT", NString.class);
			actvCodeDefInOut.val = cmd.getParameterValue("@ACTV_CODE_DEF_IN_OUT", NString.class);
			locnCodeDefInOut.val = cmd.getParameterValue("@LOCN_CODE_DEF_IN_OUT", NString.class);


		}
		
		public static void pEditProgCode(NString effDateIn,NString coasCodeIn,NString progCodeIn,Ref<NString> messErrInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKSELS.P_EDIT_PROG_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@PROG_CODE_IN", progCodeIn);
			cmd.addParameter("@MESS_ERR_IN_OUT", messErrInOut, true);
				
			cmd.execute();
			messErrInOut.val = cmd.getParameterValue("@MESS_ERR_IN_OUT", NString.class);


		}
		
	
	
	
}
