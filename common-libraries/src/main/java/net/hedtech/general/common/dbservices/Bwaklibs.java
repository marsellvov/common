package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwaklibs {
		public static NNumber f3rdPartyCredit(NString pldgNo,NString hardOrSoft) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_3RD_PARTY_CREDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PLDG_NO", pldgNo);
			cmd.addParameter("@HARD_OR_SOFT", hardOrSoft);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fAmrinfoExists(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_AMRINFO_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fApbwsesExists(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_APBWSES_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fCompressName(NString nameField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_COMPRESS_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_FIELD", nameField);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGethardgiftcredit(NNumber pidm,NString giftNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETHARDGIFTCREDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGethardgiftdesgcredit(NNumber pidm,NString giftNo,NString campaign,NString designation,NString pledgeNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETHARDGIFTDESGCREDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@CAMPAIGN", campaign);
			cmd.addParameter("@DESIGNATION", designation);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGethardpldgcredit(NNumber pidm,NString pldgNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETHARDPLDGCREDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PLDG_NO", pldgNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGethardpldgdesgcredit(NNumber pidm,NString pldgNo,NString campaign,NString designation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETHARDPLDGDESGCREDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PLDG_NO", pldgNo);
			cmd.addParameter("@CAMPAIGN", campaign);
			cmd.addParameter("@DESIGNATION", designation);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fGetlastaccess(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETLASTACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fGetparam(NString aidm,NString _name) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETPARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@NAME", _name);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetprimarygeoregiondesc(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETPRIMARYGEOREGIONDESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetsoftgiftcredit(NNumber pidm,NString giftNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETSOFTGIFTCREDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetsoftgiftdesgcredit(NNumber pidm,NString giftNo,NString campaign,NString designation,NString pledgeNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETSOFTGIFTDESGCREDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@CAMPAIGN", campaign);
			cmd.addParameter("@DESIGNATION", designation);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetsoftpldgcredit(NNumber pidm,NString pldgNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETSOFTPLDGCREDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PLDG_NO", pldgNo);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetsoftpldgdesgcredit(NNumber pidm,NString pldgNo,NString campaign,NString designation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_GETSOFTPLDGDESGCREDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PLDG_NO", pldgNo);
			cmd.addParameter("@CAMPAIGN", campaign);
			cmd.addParameter("@DESIGNATION", designation);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fXmgCampCalcEmpl(NNumber consPidm,NString fiscCode,NString campaign,NString type) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_XMG_CAMP_CALC_EMPL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@FISC_CODE", fiscCode);
			cmd.addParameter("@CAMPAIGN", campaign);
			cmd.addParameter("@TYPE", type);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fXmgCampCalcEmpr(NNumber consPidm,NString fiscCode,NString campaign,NString type) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_XMG_CAMP_CALC_EMPR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@FISC_CODE", fiscCode);
			cmd.addParameter("@CAMPAIGN", campaign);
			cmd.addParameter("@TYPE", type);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fXmgDesgCalcEmpl(NNumber consPidm,NString fiscCode,NString designation,NString type) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_XMG_DESG_CALC_EMPL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@FISC_CODE", fiscCode);
			cmd.addParameter("@DESIGNATION", designation);
			cmd.addParameter("@TYPE", type);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fXmgDesgCalcEmpr(NNumber consPidm,NString fiscCode,NString designation,NString type) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_XMG_DESG_CALC_EMPR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@FISC_CODE", fiscCode);
			cmd.addParameter("@DESIGNATION", designation);
			cmd.addParameter("@TYPE", type);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fXmgFiscCalcEmpl(NNumber consPidm,NString fiscCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_XMG_FISC_CALC_EMPL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@FISC_CODE", fiscCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fXmgFiscCalcEmpr(NNumber consPidm,NString fiscCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.F_XMG_FISC_CALC_EMPR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@FISC_CODE", fiscCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pBuildProspectOrId(NNumber pidm,NNumber prosPidm,NString prosId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.P_BUILD_PROSPECT_OR_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@PROS_ID", prosId);
				
			cmd.execute();


		}
		
		public static void pCheckIfPayable(NNumber pldgPidm,NString pldgNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.P_CHECK_IF_PAYABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PLDG_PIDM", pldgPidm);
			cmd.addParameter("@PLDG_NO", pldgNo);
				
			cmd.execute();


		}
		
		public static void pDelAgrwprmByAidmName(NString idIn,NString paramName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.P_DEL_AGRWPRM_BY_AIDM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@PARAM_NAME", paramName);
				
			cmd.execute();


		}
		
		public static void pGetAlumniRules() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.P_GET_ALUMNI_RULES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetAubinstRules() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.P_GET_AUBINST_RULES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSetparam(NString aidm,NString _name,NString val) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKLIBS.P_SETPARAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@VAL", val);
				
			cmd.execute();


		}
		
	
	
	
}
