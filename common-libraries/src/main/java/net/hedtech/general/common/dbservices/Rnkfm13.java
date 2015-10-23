package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rnkfm13 {
		public static NString fAlienRegNoIsValid(NString pAlienRegNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKFM13.F_ALIEN_REG_NO_IS_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ALIEN_REG_NO", pAlienRegNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcOvrd(NString pAidyCode,NNumber pPidm,NString pDataCde,NString pColumnVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKFM13.F_CALC_OVRD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DATA_CDE", pDataCde);
			cmd.addParameter("@P_COLUMN_VAL", pColumnVal);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCheckvalues(NNumber pValue,NNumber pMinValue,NNumber pMaxValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKFM13.F_CHECKVALUES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_MIN_VALUE", pMinValue);
			cmd.addParameter("@P_MAX_VALUE", pMaxValue);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetDependencystatus(NString pBornBefore11Xx,NString pGradOrProf,NString pMarried,NString pHaveChildren,NString pHasLegalDepend,NString pWardOfCourt,NString pActiveDuty,NString pEmancipatedMinor,NString pLegalGuardian,NString pUnaccompYouthSchool,NString pUnaccompYouthHud,NString pAtRiskHomeless,NString pUsVet,NDate pBirthDate,NString pMrtlStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKFM13.F_GET_DEPENDENCYSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BORN_BEFORE_1_1_XX", pBornBefore11Xx);
			cmd.addParameter("@P_GRAD_OR_PROF", pGradOrProf);
			cmd.addParameter("@P_MARRIED", pMarried);
			cmd.addParameter("@P_HAVE_CHILDREN", pHaveChildren);
			cmd.addParameter("@P_HAS_LEGAL_DEPEND", pHasLegalDepend);
			cmd.addParameter("@P_WARD_OF_COURT", pWardOfCourt);
			cmd.addParameter("@P_ACTIVE_DUTY", pActiveDuty);
			cmd.addParameter("@P_EMANCIPATED_MINOR", pEmancipatedMinor);
			cmd.addParameter("@P_LEGAL_GUARDIAN", pLegalGuardian);
			cmd.addParameter("@P_UNACCOMP_YOUTH_SCHOOL", pUnaccompYouthSchool);
			cmd.addParameter("@P_UNACCOMP_YOUTH_HUD", pUnaccompYouthHud);
			cmd.addParameter("@P_AT_RISK_HOMELESS", pAtRiskHomeless);
			cmd.addParameter("@P_US_VET", pUsVet);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_MRTL_STATUS", pMrtlStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetEfc(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKFM13.F_GET_EFC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fGetFmorimvalues(NNumber pSeqNo,NNumber pFmValue,NNumber pImValue,NNumber pImDebt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKFM13.F_GET_FMORIMVALUES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_FM_VALUE", pFmValue);
			cmd.addParameter("@P_IM_VALUE", pImValue);
			cmd.addParameter("@P_IM_DEBT", pImDebt);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetParentcontributionstatus(NString pFmIndepPc,NString pCalcPcFm,NNumber pParUsInc,NNumber pFathIncFrWrk,NNumber pMothIncFrWrk,NNumber pParEducCredits,NNumber pParChildSuppPaid,NNumber pParNeedBasedEmploy,NNumber pParGrantScholarAid,NNumber pParCombatPay,NNumber pParCoOpEarnings,NNumber pParTaxDefPension,NNumber pParIraKeough,NNumber pParChildSupp,NNumber pParTeIntInc,NNumber pParIraDistributions,NNumber pParUntaxPensions,NNumber pParHouseFoodOth,NNumber pParOthUntaxInc,NNumber pParVetsNonEdBen,NString pMrtlStatus,NNumber pParFamMemb,NNumber pParNoInColl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKFM13.F_GET_PARENTCONTRIBUTIONSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FM_INDEP_PC", pFmIndepPc);
			cmd.addParameter("@P_CALC_PC_FM", pCalcPcFm);
			cmd.addParameter("@P_PAR_US_INC", pParUsInc);
			cmd.addParameter("@P_FATH_INC_FR_WRK", pFathIncFrWrk);
			cmd.addParameter("@P_MOTH_INC_FR_WRK", pMothIncFrWrk);
			cmd.addParameter("@P_PAR_EDUC_CREDITS", pParEducCredits);
			cmd.addParameter("@P_PAR_CHILD_SUPP_PAID", pParChildSuppPaid);
			cmd.addParameter("@P_PAR_NEED_BASED_EMPLOY", pParNeedBasedEmploy);
			cmd.addParameter("@P_PAR_GRANT_SCHOLAR_AID", pParGrantScholarAid);
			cmd.addParameter("@P_PAR_COMBAT_PAY", pParCombatPay);
			cmd.addParameter("@P_PAR_CO_OP_EARNINGS", pParCoOpEarnings);
			cmd.addParameter("@P_PAR_TAX_DEF_PENSION", pParTaxDefPension);
			cmd.addParameter("@P_PAR_IRA_KEOUGH", pParIraKeough);
			cmd.addParameter("@P_PAR_CHILD_SUPP", pParChildSupp);
			cmd.addParameter("@P_PAR_TE_INT_INC", pParTeIntInc);
			cmd.addParameter("@P_PAR_IRA_DISTRIBUTIONS", pParIraDistributions);
			cmd.addParameter("@P_PAR_UNTAX_PENSIONS", pParUntaxPensions);
			cmd.addParameter("@P_PAR_HOUSE_FOOD_OTH", pParHouseFoodOth);
			cmd.addParameter("@P_PAR_OTH_UNTAX_INC", pParOthUntaxInc);
			cmd.addParameter("@P_PAR_VETS_NON_ED_BEN", pParVetsNonEdBen);
			cmd.addParameter("@P_MRTL_STATUS", pMrtlStatus);
			cmd.addParameter("@P_PAR_FAM_MEMB", pParFamMemb);
			cmd.addParameter("@P_PAR_NO_IN_COLL", pParNoInColl);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetState(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKFM13.F_GET_STATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
