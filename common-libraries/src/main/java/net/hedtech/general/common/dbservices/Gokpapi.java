package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokpapi {
		public static NString fBuildFullName(NString pNamePrefix,NString pFirstName,NString pMi,NString pLastName,NString pNameSuffix,NString pSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_BUILD_FULL_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  fBuildNameOot(GbIdentification.IdentificationRecRow pIdentificationRec,GbBio.BioRecRow pBioRec) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_BUILD_NAME_OOT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter(DbTypes.createStructType("P_IDENTIFICATION_REC", pIdentificationRec, GbIdentification.IdentificationRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("P_BIO_REC", pBioRec, GbBio.BioRecRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  fGetAddressOot(NNumber pPidm,NString pAddressHierarchy,NString pBannerId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_GET_ADDRESS_OOT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_ADDRESS_HIERARCHY", pAddressHierarchy);
//			cmd.addParameter("@P_BANNER_ID", pBannerId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  fGetAddressOot(GbAddress.AddressRecRow pAddressRec,NString pBannerId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_GET_ADDRESS_OOT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter(DbTypes.createStructType("P_ADDRESS_REC", pAddressRec, GbAddress.AddressRecRow.class ));
//			cmd.addParameter("@P_BANNER_ID", pBannerId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static List<HoldTabTypeRow> fGetHoldTab(NNumber pPidm,NString pAllHolds,NString pRegHold,NString pTransHold,NString pGradHold,NString pGradeHold,NString pArHold,NString pEnvHold,NString pAppHold,NString pComplHold,NDate pDate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_GET_HOLD_TAB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<HoldTabTypeRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_ALL_HOLDS", pAllHolds);
//			cmd.addParameter("@P_REG_HOLD", pRegHold);
//			cmd.addParameter("@P_TRANS_HOLD", pTransHold);
//			cmd.addParameter("@P_GRAD_HOLD", pGradHold);
//			cmd.addParameter("@P_GRADE_HOLD", pGradeHold);
//			cmd.addParameter("@P_AR_HOLD", pArHold);
//			cmd.addParameter("@P_ENV_HOLD", pEnvHold);
//			cmd.addParameter("@P_APP_HOLD", pAppHold);
//			cmd.addParameter("@P_COMPL_HOLD", pComplHold);
//			cmd.addParameter("@P_DATE", pDate);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<HoldTabTypeRow>.class);
//
//		}
		
		public static NString fGetIntSource() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_GET_INT_SOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  fGetLocationOot(NNumber pPidm,NString pAddressHierarchy,NString pTelephoneHierarchy,NString pBannerId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_GET_LOCATION_OOT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_ADDRESS_HIERARCHY", pAddressHierarchy);
//			cmd.addParameter("@P_TELEPHONE_HIERARCHY", pTelephoneHierarchy);
//			cmd.addParameter("@P_BANNER_ID", pBannerId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static NNumber fGetPidm( pEntityId,NString pUsersource) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_GET_PIDM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@P_ENTITY_ID", pEntityId);
//			cmd.addParameter("@P_USERSOURCE", pUsersource);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static List<RcoRoleNtRow> fGetRoleNt(NNumber pPidm,NString pProcessCd,List<Gokisql.ParamTabtypeRow> pParamTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_GET_ROLE_NT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<RcoRoleNtRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_PROCESS_CD", pProcessCd);
//			// cmd.addParameter(DbTypes.getCollectionType("P_PARAM_TAB", "", pParamTab, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<RcoRoleNtRow>.class);
//
//		}
		
//		public static  fGetTelephoneOot(NNumber pPidm,NString pAddressHierarchy,NString pTelephoneHierarchy) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_GET_TELEPHONE_OOT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_ADDRESS_HIERARCHY", pAddressHierarchy);
//			cmd.addParameter("@P_TELEPHONE_HIERARCHY", pTelephoneHierarchy);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  fGetTelephoneOot(GbTelephone.TelephoneRecRow pTelephoneRec) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.F_GET_TELEPHONE_OOT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter(DbTypes.createStructType("P_TELEPHONE_REC", pTelephoneRec, GbTelephone.TelephoneRecRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static void pPopulateHoldNt(List<HoldTabTypeRow> pHoldTab,Ref<List<RstApplicantHoldNtRow>> pHoldNtInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.P_POPULATE_HOLD_NT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_HOLD_TAB", "", pHoldTab, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_HOLD_NT_IN_OUT", "", pHoldNtInOut.val, object.class , true));
//				
//			cmd.execute();
//			// pHoldNtInOut.val = cmd.getTableParameterValue("@P_HOLD_NT_IN_OUT", object.class);
//
//
//		}
		
//		public static void pPopulatePidmIdentifiers(Ref<NNumber> pPidmInOut, pEntityId,NString pUsersource,NString pIntSource,Ref<> pIdentifiersOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPAPI.P_POPULATE_PIDM_IDENTIFIERS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM_IN_OUT", pPidmInOut, true);
//			cmd.addParameter("@P_ENTITY_ID", pEntityId);
//			cmd.addParameter("@P_USERSOURCE", pUsersource);
//			cmd.addParameter("@P_INT_SOURCE", pIntSource);
//			cmd.addParameter("@P_IDENTIFIERS_OUT", .class);
//				
//			cmd.execute();
//			pPidmInOut.val = cmd.getParameterValue("@P_PIDM_IN_OUT", NNumber.class);
//			pIdentifiersOut.val = cmd.getParameterValue("@P_IDENTIFIERS_OUT", .class);
//
//
//		}
		
	
	
	@DbRecordType(id="HoldRecRow", dataSourceName="HOLD_REC")
	public static class HoldRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_HLDD_CODE")
		public NString RHlddCode;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_FROM_DATE")
		public NDate RFromDate;
		@DbRecordField(dataSourceName="R_TO_DATE")
		public NDate RToDate;
		@DbRecordField(dataSourceName="R_RELEASE_IND")
		public NString RReleaseInd;
		@DbRecordField(dataSourceName="R_REASON")
		public NString RReason;
		@DbRecordField(dataSourceName="R_AMOUNT_OWED")
		public NNumber RAmountOwed;
		@DbRecordField(dataSourceName="R_ORIG_CODE")
		public NString ROrigCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_REG_HOLD_IND")
		public NString RRegHoldInd;
		@DbRecordField(dataSourceName="R_TRANS_HOLD_IND")
		public NString RTransHoldInd;
		@DbRecordField(dataSourceName="R_GRAD_HOLD_IND")
		public NString RGradHoldInd;
		@DbRecordField(dataSourceName="R_GRADE_HOLD_IND")
		public NString RGradeHoldInd;
		@DbRecordField(dataSourceName="R_AR_HOLD_IND")
		public NString RArHoldInd;
		@DbRecordField(dataSourceName="R_ENV_HOLD_IND")
		public NString REnvHoldInd;
		@DbRecordField(dataSourceName="R_APPLICATION_HOLD_IND")
		public NString RApplicationHoldInd;
		@DbRecordField(dataSourceName="R_COMPLIANCE_HOLD_IND")
		public NString RComplianceHoldInd;
	}

	
	
}
