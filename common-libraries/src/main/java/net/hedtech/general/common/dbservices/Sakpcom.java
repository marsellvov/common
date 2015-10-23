package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakpcom {
		public static NNumber fAtchMajrCnt(NString applTerm,NString degrlevl,NString fstyidql,NString stvmajr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_ATCH_MAJR_CNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@APPL_TERM", applTerm);
			cmd.addParameter("@DEGRLEVL", degrlevl);
			cmd.addParameter("@FSTYIDQL", fstyidql);
			cmd.addParameter("@STVMAJR", stvmajr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fBaseCnt(NString degrlevl,NString fstyidql,NString stvmajr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_BASE_CNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DEGRLEVL", degrlevl);
			cmd.addParameter("@FSTYIDQL", fstyidql);
			cmd.addParameter("@STVMAJR", stvmajr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCampChk(NString dfltCamp,NString xcurCamp,NString dfltInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_CAMP_CHK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DFLT_CAMP", dfltCamp);
			cmd.addParameter("@XCUR_CAMP", xcurCamp);
			cmd.addParameter("@DFLT_IND", dfltInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fChartodate(NString dfmt,NString datein) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_CHARTODATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@DFMT", dfmt);
			cmd.addParameter("@DATEIN", datein);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fCheckOverride(NString wappCode,NString procLabel,NString prtnLabel,NString levlChk) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_CHECK_OVERRIDE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PROC_LABEL", procLabel);
			cmd.addParameter("@PRTN_LABEL", prtnLabel);
			cmd.addParameter("@LEVL_CHK", levlChk);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckResults(NNumber aidm,NNumber applSeqno,NString wappCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_CHECK_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckSarperr(NString wappCode,NNumber aidm,NNumber applSeqno,NString procLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_CHECK_SARPERR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@PROC_LABEL", procLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkLoad(NNumber aidm,NNumber pidm,NNumber applSeqno,NString wappCode,NString tname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_CHK_LOAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@TNAME", tname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkSarctrl(NNumber aidm,NNumber applSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_CHK_SARCTRL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkSarperr(NString wappCode,NNumber aidm,NNumber applSeqno,NString procLabel,NString prtnLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_CHK_SARPERR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@PROC_LABEL", procLabel);
			cmd.addParameter("@PRTN_LABEL", prtnLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChkSarrlst(NNumber aidm,NNumber applSeqno,NString wappCode,NString procLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_CHK_SARRLST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PROC_LABEL", procLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCollChk(NString dfltColl,NString xcurColl,NString dfltInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_COLL_CHK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DFLT_COLL", dfltColl);
			cmd.addParameter("@XCUR_COLL", xcurColl);
			cmd.addParameter("@DFLT_IND", dfltInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDegcChk(NString dfltDegc,NString xcurDegc,NString dfltInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_DEGC_CHK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DFLT_DEGC", dfltDegc);
			cmd.addParameter("@XCUR_DEGC", xcurDegc);
			cmd.addParameter("@DFLT_IND", dfltInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDupappl(NNumber aidm,NNumber pidm,NNumber applSeqno,NString actnInd,NString majrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_DUPAPPL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@ACTN_IND", actnInd);
			cmd.addParameter("@MAJR_CODE", majrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fFmtdate(NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_FMTDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@STR", str);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fGetBaseRule(NString degrlevl,NString fstyidql,NString stvmajr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_GET_BASE_RULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DEGRLEVL", degrlevl);
			cmd.addParameter("@FSTYIDQL", fstyidql);
			cmd.addParameter("@STVMAJR", stvmajr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPidm(NNumber aidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_GET_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AIDM", aidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetRelgcode(NNumber aidm,NNumber applSeqno,NNumber persSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_GET_RELGCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@PERS_SEQNO", persSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSarerul(NString functionLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_GET_SARERUL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FUNCTION_LABEL", functionLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLegacyChk(NNumber aidm,NNumber applSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_LEGACY_CHK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMajrChk(NString dfltMajr,NString xcurMajr,NString dfltInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_MAJR_CHK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DFLT_MAJR", dfltMajr);
			cmd.addParameter("@XCUR_MAJR", xcurMajr);
			cmd.addParameter("@DFLT_IND", dfltInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPhoneChk(NString phoneIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_PHONE_CHK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PHONE_IN", phoneIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPinChk(NString pinIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_PIN_CHK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIN_IN", pinIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrtnChk(NString wappCode,NNumber aidm,NNumber applSeqno,NString procLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_PRTN_CHK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@PROC_LABEL", procLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrtnChkor(NString wappCode,NNumber aidm,NNumber applSeqno,NString procLabel,NString prtnLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_PRTN_CHKOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@PROC_LABEL", procLabel);
			cmd.addParameter("@PRTN_LABEL", prtnLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrtnFndCmpl(NString wappCode,NNumber aidm,NNumber applSeqno,NString procLabel,NString prtnLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_PRTN_FND_CMPL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@PROC_LABEL", procLabel);
			cmd.addParameter("@PRTN_LABEL", prtnLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrtnRequired(NString wappCode,NString procLabel,NString prtnLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_PRTN_REQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PROC_LABEL", procLabel);
			cmd.addParameter("@PRTN_LABEL", prtnLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fRangedateconv(NString dfmtCde,NString proc,NString frtoInd,NString dateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_RANGEDATECONV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@DFMT_CDE", dfmtCde);
			cmd.addParameter("@PROC", proc);
			cmd.addParameter("@FRTO_IND", frtoInd);
			cmd.addParameter("@DATE_IN", dateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fSabidenChk(NNumber aidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_SABIDEN_CHK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AIDM", aidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fSarrlstCheck(NString wappCode,NNumber aidm,NNumber applSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_SARRLST_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSarrlstComplete(NNumber aidm,NNumber applSeqno,NString wappCode,NString procLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_SARRLST_COMPLETE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PROC_LABEL", procLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSorxrefChk(NString labelIn,NString ediQlfr,NString ediValue,NString banVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_SORXREF_CHK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LABEL_IN", labelIn);
			cmd.addParameter("@EDI_QLFR", ediQlfr);
			cmd.addParameter("@EDI_VALUE", ediValue);
			cmd.addParameter("@BAN_VAL", banVal);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSorxrefVal(NString labelIn,NString ediQlfr,NString ediValue,NString banVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.F_SORXREF_VAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@LABEL_IN", labelIn);
			cmd.addParameter("@EDI_QLFR", ediQlfr);
			cmd.addParameter("@EDI_VALUE", ediValue);
			cmd.addParameter("@BAN_VAL", banVal);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pResultsInsert(NNumber aidm,NNumber applSeqno,NString wappCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.P_RESULTS_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
				
			cmd.execute();


		}
		
		public static void pSarheadUpdProcessInd(NNumber aidm,NNumber applSeqno,NString procInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.P_SARHEAD_UPD_PROCESS_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@PROC_IND", procInd);
				
			cmd.execute();


		}
		
		public static void pSarperrUpdate(NNumber aidm,NNumber applSeqno,NString wappCode,NString procLabel,NString prtnLabel,NString compInd,NString msg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.P_SARPERR_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PROC_LABEL", procLabel);
			cmd.addParameter("@PRTN_LABEL", prtnLabel);
			cmd.addParameter("@COMP_IND", compInd);
			cmd.addParameter("@MSG", msg);
				
			cmd.execute();


		}
		
		public static void pSarrlstUpdate(NNumber aidm,NNumber applSeqno,NString wappCode,NString procLabel,NString completeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKPCOM.P_SARRLST_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
			cmd.addParameter("@APPL_SEQNO", applSeqno);
			cmd.addParameter("@WAPP_CODE", wappCode);
			cmd.addParameter("@PROC_LABEL", procLabel);
			cmd.addParameter("@COMPLETE_IND", completeInd);
				
			cmd.execute();


		}
		
	
	
	
}
