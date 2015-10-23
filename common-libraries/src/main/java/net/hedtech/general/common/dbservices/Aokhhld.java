package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Aokhhld {
		public static NNumber fActiveAddresses(NNumber pidmIn,NString atypCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.F_ACTIVE_ADDRESSES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ATYP_CODE_IN", atypCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCurrentAddressInactive(NNumber pidmIn,NString atypCodeIn,NString addrSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.F_CURRENT_ADDRESS_INACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ATYP_CODE_IN", atypCodeIn);
			cmd.addParameter("@ADDR_SEQNO_IN", addrSeqnoIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCurrentAptaddrCount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.F_CURRENT_APTADDR_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetDefAsrcCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.F_GET_DEF_ASRC_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fHouseholdCount(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.F_HOUSEHOLD_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fHouseholdPidm(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.F_HOUSEHOLD_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fStaleAptaddrCount(NNumber staleIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.F_STALE_APTADDR_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@STALE_IN", staleIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pAptaddrCleanUp(NString typeIn,Ref<NString> errOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.P_APTADDR_CLEAN_UP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@ERR_OUT", errOut, true);
				
			cmd.execute();
			errOut.val = cmd.getParameterValue("@ERR_OUT", NString.class);


		}
		
		public static void pAptaddrInUse(NNumber pidmIn,NString atypCodeIn,Ref<NNumber> pidmOut,Ref<NString> userOut,Ref<NString> nameOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.P_APTADDR_IN_USE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ATYP_CODE_IN", atypCodeIn);
			cmd.addParameter("@PIDM_OUT", pidmOut, true);
			cmd.addParameter("@USER_OUT", userOut, true);
			cmd.addParameter("@NAME_OUT", nameOut, true);
				
			cmd.execute();
			pidmOut.val = cmd.getParameterValue("@PIDM_OUT", NNumber.class);
			userOut.val = cmd.getParameterValue("@USER_OUT", NString.class);
			nameOut.val = cmd.getParameterValue("@NAME_OUT", NString.class);


		}
		
		public static void pAptaddrInsert(NString pAptaddrSlctInd,NString pAptaddrUpdatableInd,NNumber pAptaddrPidm,NString pAptaddrHeadInd,NString pAptaddrAtypCode,NString pAptaddrHouseNumber,NString pAptaddrStreetLine1,NString pAptaddrStreetLine2,NString pAptaddrStreetLine3,NString pAptaddrStreetLine4,NString pAptaddrCity,NString pAptaddrStatCode,NString pAptaddrZip,NString pAptaddrCntyCode,NString pAptaddrNatnCode,NString pAptaddrSessionid,NString pAptaddrUser,NDate pAptaddrActivityDate,NString pAptaddrNameLf30,NString pAptaddrId,NString pAptaddrXrefCode,NNumber pAptaddrAge,NString pAptaddrAddressCompareInd,NString pAptaddrPhoneCompareInd,NString pAptaddrPhone,NDate pAptaddrFromDate,NDate pAptaddrToDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.P_APTADDR_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APTADDR_SLCT_IND", pAptaddrSlctInd);
			cmd.addParameter("@P_APTADDR_UPDATABLE_IND", pAptaddrUpdatableInd);
			cmd.addParameter("@P_APTADDR_PIDM", pAptaddrPidm);
			cmd.addParameter("@P_APTADDR_HEAD_IND", pAptaddrHeadInd);
			cmd.addParameter("@P_APTADDR_ATYP_CODE", pAptaddrAtypCode);
			cmd.addParameter("@P_APTADDR_HOUSE_NUMBER", pAptaddrHouseNumber);
			cmd.addParameter("@P_APTADDR_STREET_LINE1", pAptaddrStreetLine1);
			cmd.addParameter("@P_APTADDR_STREET_LINE2", pAptaddrStreetLine2);
			cmd.addParameter("@P_APTADDR_STREET_LINE3", pAptaddrStreetLine3);
			cmd.addParameter("@P_APTADDR_STREET_LINE4", pAptaddrStreetLine4);
			cmd.addParameter("@P_APTADDR_CITY", pAptaddrCity);
			cmd.addParameter("@P_APTADDR_STAT_CODE", pAptaddrStatCode);
			cmd.addParameter("@P_APTADDR_ZIP", pAptaddrZip);
			cmd.addParameter("@P_APTADDR_CNTY_CODE", pAptaddrCntyCode);
			cmd.addParameter("@P_APTADDR_NATN_CODE", pAptaddrNatnCode);
			cmd.addParameter("@P_APTADDR_SESSIONID", pAptaddrSessionid);
			cmd.addParameter("@P_APTADDR_USER", pAptaddrUser);
			cmd.addParameter("@P_APTADDR_ACTIVITY_DATE", pAptaddrActivityDate);
			cmd.addParameter("@P_APTADDR_NAME_LF30", pAptaddrNameLf30);
			cmd.addParameter("@P_APTADDR_ID", pAptaddrId);
			cmd.addParameter("@P_APTADDR_XREF_CODE", pAptaddrXrefCode);
			cmd.addParameter("@P_APTADDR_AGE", pAptaddrAge);
			cmd.addParameter("@P_APTADDR_ADDRESS_COMPARE_IND", pAptaddrAddressCompareInd);
			cmd.addParameter("@P_APTADDR_PHONE_COMPARE_IND", pAptaddrPhoneCompareInd);
			cmd.addParameter("@P_APTADDR_PHONE", pAptaddrPhone);
			cmd.addParameter("@P_APTADDR_FROM_DATE", pAptaddrFromDate);
			cmd.addParameter("@P_APTADDR_TO_DATE", pAptaddrToDate);
				
			cmd.execute();


		}
		
		public static void pInactivateHouseholdAddr(NString atypCodeIn,Ref<NString> msgOut,Ref<NString> errOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.P_INACTIVATE_HOUSEHOLD_ADDR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP_CODE_IN", atypCodeIn);
			cmd.addParameter("@MSG_OUT", msgOut, true);
			cmd.addParameter("@ERR_OUT", errOut, true);
				
			cmd.execute();
			msgOut.val = cmd.getParameterValue("@MSG_OUT", NString.class);
			errOut.val = cmd.getParameterValue("@ERR_OUT", NString.class);


		}
		
		public static void pProcessHouseholdAddrRecs(NNumber pidmIn,NNumber addrSeqnoIn,NString atypCodeIn,Ref<NString> msgOut,Ref<NString> errOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.P_PROCESS_HOUSEHOLD_ADDR_RECS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ADDR_SEQNO_IN", addrSeqnoIn);
			cmd.addParameter("@ATYP_CODE_IN", atypCodeIn);
			cmd.addParameter("@MSG_OUT", msgOut, true);
			cmd.addParameter("@ERR_OUT", errOut, true);
				
			cmd.execute();
			msgOut.val = cmd.getParameterValue("@MSG_OUT", NString.class);
			errOut.val = cmd.getParameterValue("@ERR_OUT", NString.class);


		}
		
		public static void pRemovePrimaryFromApttele(NString atypCodeIn,NString teleCodeIn,NString phoneAreaIn,NString phoneNumberIn,NString phoneExtIn,NString ctryCodePhoneIn,NString intlAccessIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.P_REMOVE_PRIMARY_FROM_APTTELE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ATYP_CODE_IN", atypCodeIn);
			cmd.addParameter("@TELE_CODE_IN", teleCodeIn);
			cmd.addParameter("@PHONE_AREA_IN", phoneAreaIn);
			cmd.addParameter("@PHONE_NUMBER_IN", phoneNumberIn);
			cmd.addParameter("@PHONE_EXT_IN", phoneExtIn);
			cmd.addParameter("@CTRY_CODE_PHONE_IN", ctryCodePhoneIn);
			cmd.addParameter("@INTL_ACCESS_IN", intlAccessIn);
				
			cmd.execute();


		}
		
		public static void pSaveToApttele(NNumber pidmIn,NString atypCodeIn,NNumber addrSeqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKHHLD.P_SAVE_TO_APTTELE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ATYP_CODE_IN", atypCodeIn);
			cmd.addParameter("@ADDR_SEQNO_IN", addrSeqnoIn);
				
			cmd.execute();


		}
		
	
	
	
}
