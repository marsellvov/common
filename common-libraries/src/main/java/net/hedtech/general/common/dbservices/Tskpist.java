package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tskpist {
		public static NString fAutoCalcOn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKPIST.F_AUTO_CALC_ON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fInstlmntAuthorizedPayments(NString termIn,NNumber pidmIn,NString planIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKPIST.F_INSTLMNT_AUTHORIZED_PAYMENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLAN_IN", planIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fIplanAmountDue(NNumber pidmIn,NString chkAutoAssign,NString overrideAutoCalc,NString cbilAutoCalc,NDate asOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKPIST.F_IPLAN_AMOUNT_DUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CHK_AUTO_ASSIGN", chkAutoAssign);
			cmd.addParameter("@OVERRIDE_AUTO_CALC", overrideAutoCalc);
			cmd.addParameter("@CBIL_AUTO_CALC", cbilAutoCalc);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fPlanPrincipal(NString termIn,NNumber pidmIn,NString planIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKPIST.F_PLAN_PRINCIPAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLAN_IN", planIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pEligPlanPrincipal(NString termIn,NNumber pidmIn,NString planIn,Ref<NNumber> eligAmount,Ref<NNumber> authAid,Ref<NNumber> finAidMemos,Ref<NNumber> otherMemos) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKPIST.P_ELIG_PLAN_PRINCIPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLAN_IN", planIn);
			cmd.addParameter("@ELIG_AMOUNT", NNumber.class);
			cmd.addParameter("@AUTH_AID", NNumber.class);
			cmd.addParameter("@FIN_AID_MEMOS", NNumber.class);
			cmd.addParameter("@OTHER_MEMOS", NNumber.class);
				
			cmd.execute();
			eligAmount.val = cmd.getParameterValue("@ELIG_AMOUNT", NNumber.class);
			authAid.val = cmd.getParameterValue("@AUTH_AID", NNumber.class);
			finAidMemos.val = cmd.getParameterValue("@FIN_AID_MEMOS", NNumber.class);
			otherMemos.val = cmd.getParameterValue("@OTHER_MEMOS", NNumber.class);


		}
		
		public static void pExistingPlanAmounts(NString termIn,NNumber pidmIn,NString planIn,Ref<NNumber> planPrincipal,Ref<NNumber> planCharges) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKPIST.P_EXISTING_PLAN_AMOUNTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLAN_IN", planIn);
			cmd.addParameter("@PLAN_PRINCIPAL", NNumber.class);
			cmd.addParameter("@PLAN_CHARGES", NNumber.class);
				
			cmd.execute();
			planPrincipal.val = cmd.getParameterValue("@PLAN_PRINCIPAL", NNumber.class);
			planCharges.val = cmd.getParameterValue("@PLAN_CHARGES", NNumber.class);


		}
		
		public static void pIplanFinaidMemos(NString termIn,NNumber pidmIn,NString planIn,NDate asOfDate,Ref<NNumber> authAid,Ref<NNumber> finAidMemos,Ref<NNumber> otherMemos) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKPIST.P_IPLAN_FINAID_MEMOS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLAN_IN", planIn);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
			cmd.addParameter("@AUTH_AID", NNumber.class);
			cmd.addParameter("@FIN_AID_MEMOS", NNumber.class);
			cmd.addParameter("@OTHER_MEMOS", NNumber.class);
				
			cmd.execute();
			authAid.val = cmd.getParameterValue("@AUTH_AID", NNumber.class);
			finAidMemos.val = cmd.getParameterValue("@FIN_AID_MEMOS", NNumber.class);
			otherMemos.val = cmd.getParameterValue("@OTHER_MEMOS", NNumber.class);


		}
		
		public static void pPlanPayments(NString termIn,NNumber pidmIn,NString planIn,Ref<NNumber> eligBaseAmount,Ref<NNumber> writePlanAmount,Ref<NNumber> amountPaid,NString cbilAutoCalc,NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKPIST.P_PLAN_PAYMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLAN_IN", planIn);
			cmd.addParameter("@ELIG_BASE_AMOUNT", NNumber.class);
			cmd.addParameter("@WRITE_PLAN_AMOUNT", NNumber.class);
			cmd.addParameter("@AMOUNT_PAID", NNumber.class);
			cmd.addParameter("@CBIL_AUTO_CALC", cbilAutoCalc);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();
			eligBaseAmount.val = cmd.getParameterValue("@ELIG_BASE_AMOUNT", NNumber.class);
			writePlanAmount.val = cmd.getParameterValue("@WRITE_PLAN_AMOUNT", NNumber.class);
			amountPaid.val = cmd.getParameterValue("@AMOUNT_PAID", NNumber.class);


		}
		
		public static void pPopulateTbvinsp(NString termIn,NNumber pidmIn,NString chkAutoAssign,NString overrideAutoCalc,NString cbilAutoCalc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKPIST.P_POPULATE_TBVINSP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CHK_AUTO_ASSIGN", chkAutoAssign);
			cmd.addParameter("@OVERRIDE_AUTO_CALC", overrideAutoCalc);
			cmd.addParameter("@CBIL_AUTO_CALC", cbilAutoCalc);
				
			cmd.execute();


		}
		
	
	
	
}
