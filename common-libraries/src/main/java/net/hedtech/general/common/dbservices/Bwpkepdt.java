package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkepdt {
		public static void pChkSecurity(NString pUser,NNumber pEmpPidm,NString pPosn,NString pSuff,NDate pEffdt,Ref<NString> pSecurityOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPDT.P_CHK_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFDT", pEffdt);
			cmd.addParameter("@P_SECURITY_OUT", pSecurityOut, true);
				
			cmd.execute();
			pSecurityOut.val = cmd.getParameterValue("@P_SECURITY_OUT", NString.class);


		}
		
		public static void pDeleteEpaf(NString pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPDT.P_DELETE_EPAF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
//		public static void pPrintEpafDetl(NString pCallFrom,NNumber pGlobalPidm,NNumber pTransNo,NNumber pEmpPidm,NString pEmpId,NString pAcat,NDate pQueryDt,NString pPosn,NString pSuff,NString pFinishSubmit,List<Twbklibs.Varchar2TabtypeRow> epAptytopost,List<Twbklibs.Varchar2TabtypeRow> epFormtopost,List<Twbklibs.Varchar2TabtypeRow> epBlcktopost,List<Twbklibs.Varchar2TabtypeRow> epFieldtopost,List<Twbklibs.Varchar2TabtypeRow> epNvaltopost,List<Twbklibs.Varchar2TabtypeRow> epFormattopost,List<Twbklibs.Varchar2TabtypeRow> epOvridetopost,List<Twbklibs.Varchar2TabtypeRow> epEnttopost,List<Twbklibs.Varchar2TabtypeRow> epRowidtopost,List<Twbklibs.Varchar2TabtypeRow> eEffdttopost,List<Twbklibs.Varchar2TabtypeRow> eCodetopost,List<Twbklibs.Varchar2TabtypeRow> eHrstopost,List<Twbklibs.Varchar2TabtypeRow> eDhrstopost,List<Twbklibs.Varchar2TabtypeRow> eRatetopost,List<Twbklibs.Varchar2TabtypeRow> eShifttopost,List<Twbklibs.Varchar2TabtypeRow> eEnddttopost,List<Twbklibs.Varchar2TabtypeRow> eRowidtopost,List<Twbklibs.Varchar2TabtypeRow> dEffdttopost,List<Twbklibs.Varchar2TabtypeRow> dCoastopost,List<Twbklibs.Varchar2TabtypeRow> dAccitopost,List<Twbklibs.Varchar2TabtypeRow> dFundtopost,List<Twbklibs.Varchar2TabtypeRow> dOrgntopost,List<Twbklibs.Varchar2TabtypeRow> dAccttopost,List<Twbklibs.Varchar2TabtypeRow> dProgtopost,List<Twbklibs.Varchar2TabtypeRow> dActvtopost,List<Twbklibs.Varchar2TabtypeRow> dLocntopost,List<Twbklibs.Varchar2TabtypeRow> dProjtopost,List<Twbklibs.Varchar2TabtypeRow> dCtyptopost,List<Twbklibs.Varchar2TabtypeRow> dAcctexttopost,List<Twbklibs.Varchar2TabtypeRow> dPcttopost,List<Twbklibs.Varchar2TabtypeRow> dEncdttopost,List<Twbklibs.Varchar2TabtypeRow> dRowidtopost,List<Twbklibs.Varchar2TabtypeRow> rMandtrytopost,List<Twbklibs.Varchar2TabtypeRow> rAlvltopost,List<Twbklibs.Varchar2TabtypeRow> rUsertopost,List<Twbklibs.Varchar2TabtypeRow> rActiontopost,List<Twbklibs.Varchar2TabtypeRow> rRowidtopost,NString pComments,List<Twbklibs.Varchar2TabtypeRow> dAptytopost,List<Twbklibs.Varchar2TabtypeRow> dEffaptytopost) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPDT.P_PRINT_EPAF_DETL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_CALL_FROM", pCallFrom);
//			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
//			cmd.addParameter("@P_TRANS_NO", pTransNo);
//			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
//			cmd.addParameter("@P_EMP_ID", pEmpId);
//			cmd.addParameter("@P_ACAT", pAcat);
//			cmd.addParameter("@P_QUERY_DT", pQueryDt);
//			cmd.addParameter("@P_POSN", pPosn);
//			cmd.addParameter("@P_SUFF", pSuff);
//			cmd.addParameter("@P_FINISH_SUBMIT", pFinishSubmit);
//			// cmd.addParameter(DbTypes.getTableType("EP_APTYTOPOST", "", epAptytopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_FORMTOPOST", "", epFormtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_BLCKTOPOST", "", epBlcktopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_FIELDTOPOST", "", epFieldtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_NVALTOPOST", "", epNvaltopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_FORMATTOPOST", "", epFormattopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_OVRIDETOPOST", "", epOvridetopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_ENTTOPOST", "", epEnttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_ROWIDTOPOST", "", epRowidtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_EFFDTTOPOST", "", eEffdttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_CODETOPOST", "", eCodetopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_HRSTOPOST", "", eHrstopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_DHRSTOPOST", "", eDhrstopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_RATETOPOST", "", eRatetopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_SHIFTTOPOST", "", eShifttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_ENDDTTOPOST", "", eEnddttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_ROWIDTOPOST", "", eRowidtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_EFFDTTOPOST", "", dEffdttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_COASTOPOST", "", dCoastopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ACCITOPOST", "", dAccitopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_FUNDTOPOST", "", dFundtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ORGNTOPOST", "", dOrgntopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ACCTTOPOST", "", dAccttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_PROGTOPOST", "", dProgtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ACTVTOPOST", "", dActvtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_LOCNTOPOST", "", dLocntopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_PROJTOPOST", "", dProjtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_CTYPTOPOST", "", dCtyptopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ACCTEXTTOPOST", "", dAcctexttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_PCTTOPOST", "", dPcttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ENCDTTOPOST", "", dEncdttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ROWIDTOPOST", "", dRowidtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("R_MANDTRYTOPOST", "", rMandtrytopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("R_ALVLTOPOST", "", rAlvltopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("R_USERTOPOST", "", rUsertopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("R_ACTIONTOPOST", "", rActiontopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("R_ROWIDTOPOST", "", rRowidtopost, object.class));
//			cmd.addParameter("@P_COMMENTS", pComments);
//			// cmd.addParameter(DbTypes.getTableType("D_APTYTOPOST", "", dAptytopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_EFFAPTYTOPOST", "", dEffaptytopost, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pPrintEpafEntries(NString pUpdtAllow,NNumber pTransNo,NString pUser,NDate pQueryDate,List<Twbklibs.Varchar2TabtypeRow> epAptytopost,List<Twbklibs.Varchar2TabtypeRow> epFormtopost,List<Twbklibs.Varchar2TabtypeRow> epBlcktopost,List<Twbklibs.Varchar2TabtypeRow> epFieldtopost,List<Twbklibs.Varchar2TabtypeRow> epNvaltopost,List<Twbklibs.Varchar2TabtypeRow> epFormattopost,List<Twbklibs.Varchar2TabtypeRow> epOvridetopost,List<Twbklibs.Varchar2TabtypeRow> epEnttopost,List<Twbklibs.Varchar2TabtypeRow> epRowidtopost,List<Twbklibs.Varchar2TabtypeRow> eEffdttopost,List<Twbklibs.Varchar2TabtypeRow> eCodetopost,List<Twbklibs.Varchar2TabtypeRow> eHrstopost,List<Twbklibs.Varchar2TabtypeRow> eDhrstopost,List<Twbklibs.Varchar2TabtypeRow> eRatetopost,List<Twbklibs.Varchar2TabtypeRow> eShifttopost,List<Twbklibs.Varchar2TabtypeRow> eEnddttopost,List<Twbklibs.Varchar2TabtypeRow> eRowidtopost,List<Twbklibs.Varchar2TabtypeRow> dEffdttopost,List<Twbklibs.Varchar2TabtypeRow> dCoastopost,List<Twbklibs.Varchar2TabtypeRow> dAccitopost,List<Twbklibs.Varchar2TabtypeRow> dFundtopost,List<Twbklibs.Varchar2TabtypeRow> dOrgntopost,List<Twbklibs.Varchar2TabtypeRow> dAccttopost,List<Twbklibs.Varchar2TabtypeRow> dProgtopost,List<Twbklibs.Varchar2TabtypeRow> dActvtopost,List<Twbklibs.Varchar2TabtypeRow> dLocntopost,List<Twbklibs.Varchar2TabtypeRow> dProjtopost,List<Twbklibs.Varchar2TabtypeRow> dCtyptopost,List<Twbklibs.Varchar2TabtypeRow> dAcctexttopost,List<Twbklibs.Varchar2TabtypeRow> dPcttopost,List<Twbklibs.Varchar2TabtypeRow> dEncdttopost,List<Twbklibs.Varchar2TabtypeRow> dRowidtopost,List<Twbklibs.Varchar2TabtypeRow> dAptytopost,List<Twbklibs.Varchar2TabtypeRow> dEffaptytopost) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPDT.P_PRINT_EPAF_ENTRIES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_UPDT_ALLOW", pUpdtAllow);
//			cmd.addParameter("@P_TRANS_NO", pTransNo);
//			cmd.addParameter("@P_USER", pUser);
//			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
//			// cmd.addParameter(DbTypes.getTableType("EP_APTYTOPOST", "", epAptytopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_FORMTOPOST", "", epFormtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_BLCKTOPOST", "", epBlcktopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_FIELDTOPOST", "", epFieldtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_NVALTOPOST", "", epNvaltopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_FORMATTOPOST", "", epFormattopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_OVRIDETOPOST", "", epOvridetopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_ENTTOPOST", "", epEnttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EP_ROWIDTOPOST", "", epRowidtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_EFFDTTOPOST", "", eEffdttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_CODETOPOST", "", eCodetopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_HRSTOPOST", "", eHrstopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_DHRSTOPOST", "", eDhrstopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_RATETOPOST", "", eRatetopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_SHIFTTOPOST", "", eShifttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_ENDDTTOPOST", "", eEnddttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("E_ROWIDTOPOST", "", eRowidtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_EFFDTTOPOST", "", dEffdttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_COASTOPOST", "", dCoastopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ACCITOPOST", "", dAccitopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_FUNDTOPOST", "", dFundtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ORGNTOPOST", "", dOrgntopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ACCTTOPOST", "", dAccttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_PROGTOPOST", "", dProgtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ACTVTOPOST", "", dActvtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_LOCNTOPOST", "", dLocntopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_PROJTOPOST", "", dProjtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_CTYPTOPOST", "", dCtyptopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ACCTEXTTOPOST", "", dAcctexttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_PCTTOPOST", "", dPcttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ENCDTTOPOST", "", dEncdttopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_ROWIDTOPOST", "", dRowidtopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_APTYTOPOST", "", dAptytopost, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_EFFAPTYTOPOST", "", dEffaptytopost, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSubmitResults(NString pTransNo,NString pWarningOnly,NString pErrorExists,NString pFinishSubmit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPDT.P_SUBMIT_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_WARNING_ONLY", pWarningOnly);
			cmd.addParameter("@P_ERROR_EXISTS", pErrorExists);
			cmd.addParameter("@P_FINISH_SUBMIT", pFinishSubmit);
				
			cmd.execute();


		}
		
		public static void pSubmitTransaction(NString pTransNo,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPDT.P_SUBMIT_TRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
//		public static void pUpdateEpafBody(NString pUser,NString pCallFrom,NString pTransNo,NString pEffDt,NString pPosn,NString pSuff,NString pFinishSubmit,List<Twbklibs.Varchar2TabtypeRow> epapty,List<Twbklibs.Varchar2TabtypeRow> epform,List<Twbklibs.Varchar2TabtypeRow> epblck,List<Twbklibs.Varchar2TabtypeRow> epfield,List<Twbklibs.Varchar2TabtypeRow> epnval,List<Twbklibs.Varchar2TabtypeRow> epformat,List<Twbklibs.Varchar2TabtypeRow> epovride,List<Twbklibs.Varchar2TabtypeRow> epent,List<Twbklibs.Varchar2TabtypeRow> eprowid,NString earnApty,List<Twbklibs.Varchar2TabtypeRow> eeffdt,List<Twbklibs.Varchar2TabtypeRow> ecode,List<Twbklibs.Varchar2TabtypeRow> ehrs,List<Twbklibs.Varchar2TabtypeRow> edhrs,List<Twbklibs.Varchar2TabtypeRow> erate,List<Twbklibs.Varchar2TabtypeRow> eshift,List<Twbklibs.Varchar2TabtypeRow> eenddt,List<Twbklibs.Varchar2TabtypeRow> erowid,List<Twbklibs.Varchar2TabtypeRow> eremove,NString jlbdApty,List<Twbklibs.Varchar2TabtypeRow> deffdt,List<Twbklibs.Varchar2TabtypeRow> dcoas,List<Twbklibs.Varchar2TabtypeRow> dacci,List<Twbklibs.Varchar2TabtypeRow> dfund,List<Twbklibs.Varchar2TabtypeRow> dorgn,List<Twbklibs.Varchar2TabtypeRow> dacct,List<Twbklibs.Varchar2TabtypeRow> dprog,List<Twbklibs.Varchar2TabtypeRow> dactv,List<Twbklibs.Varchar2TabtypeRow> dlocn,List<Twbklibs.Varchar2TabtypeRow> dproj,List<Twbklibs.Varchar2TabtypeRow> dctyp,List<Twbklibs.Varchar2TabtypeRow> dacctext,List<Twbklibs.Varchar2TabtypeRow> dpct,List<Twbklibs.Varchar2TabtypeRow> dencdt,List<Twbklibs.Varchar2TabtypeRow> dremove,List<Twbklibs.Varchar2TabtypeRow> drowid,List<Twbklibs.Varchar2TabtypeRow> dapty,List<Twbklibs.Varchar2TabtypeRow> deffapty,List<Twbklibs.Varchar2TabtypeRow> rmandtry,List<Twbklibs.Varchar2TabtypeRow> ralvl,List<Twbklibs.Varchar2TabtypeRow> ruser,List<Twbklibs.Varchar2TabtypeRow> raction,List<Twbklibs.Varchar2TabtypeRow> rqstat,List<Twbklibs.Varchar2TabtypeRow> rremove,List<Twbklibs.Varchar2TabtypeRow> rrowid,NString cmnt,NString buttnOption) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPDT.P_UPDATE_EPAF_BODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_USER", pUser);
//			cmd.addParameter("@P_CALL_FROM", pCallFrom);
//			cmd.addParameter("@P_TRANS_NO", pTransNo);
//			cmd.addParameter("@P_EFF_DT", pEffDt);
//			cmd.addParameter("@P_POSN", pPosn);
//			cmd.addParameter("@P_SUFF", pSuff);
//			cmd.addParameter("@P_FINISH_SUBMIT", pFinishSubmit);
//			// cmd.addParameter(DbTypes.getTableType("EPAPTY", "", epapty, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPFORM", "", epform, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPBLCK", "", epblck, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPFIELD", "", epfield, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPNVAL", "", epnval, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPFORMAT", "", epformat, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPOVRIDE", "", epovride, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPENT", "", epent, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EPROWID", "", eprowid, object.class));
//			cmd.addParameter("@EARN_APTY", earnApty);
//			// cmd.addParameter(DbTypes.getTableType("EEFFDT", "", eeffdt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ECODE", "", ecode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EHRS", "", ehrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EDHRS", "", edhrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERATE", "", erate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ESHIFT", "", eshift, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EENDDT", "", eenddt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EROWID", "", erowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("EREMOVE", "", eremove, object.class));
//			cmd.addParameter("@JLBD_APTY", jlbdApty);
//			// cmd.addParameter(DbTypes.getTableType("DEFFDT", "", deffdt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DCOAS", "", dcoas, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCI", "", dacci, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DFUND", "", dfund, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DORGN", "", dorgn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCT", "", dacct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPROG", "", dprog, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACTV", "", dactv, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DLOCN", "", dlocn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPROJ", "", dproj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DCTYP", "", dctyp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCTEXT", "", dacctext, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPCT", "", dpct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DENCDT", "", dencdt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DREMOVE", "", dremove, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROWID", "", drowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DAPTY", "", dapty, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DEFFAPTY", "", deffapty, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RMANDTRY", "", rmandtry, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RALVL", "", ralvl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RUSER", "", ruser, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RACTION", "", raction, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RQSTAT", "", rqstat, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RREMOVE", "", rremove, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RROWID", "", rrowid, object.class));
//			cmd.addParameter("@CMNT", cmnt);
//			cmd.addParameter("@BUTTN_OPTION", buttnOption);
//				
//			cmd.execute();
//
//
//		}
//		
	
	
	
}
