package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpklaks {
		/*public static void appenderror(Ref<NString> origerror,NString newerror) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.APPENDERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ORIGERROR", origerror, true);
			cmd.addParameter("@NEWERROR", newerror);
				
			cmd.execute();
			origerror.val = cmd.getParameterValue("@ORIGERROR", NString.class);


		}
		
		public static void appenderror(Ref<List<ErrorMesgTabtypeRow>> origerror,NString newerror) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.APPENDERROR", DbManager.getDataBaseFactory());
			
			// cmd.addParameter(DbTypes.getTableType("ORIGERROR", "", origerror.val, object.class , true));
			cmd.addParameter("@NEWERROR", newerror);
				
			cmd.execute();
			// origerror.val = cmd.getTableParameterValue("@ORIGERROR", object.class);


		}
		
		public static void appenderror(Ref<List<ErrorMesgTabtypeRow>> origerror,List<ErrorMesgTabtypeRow> newerror) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.APPENDERROR", DbManager.getDataBaseFactory());
			
			// cmd.addParameter(DbTypes.getTableType("ORIGERROR", "", origerror.val, object.class , true));
			// cmd.addParameter(DbTypes.getTableType("NEWERROR", "", newerror, object.class));
				
			cmd.execute();
			// origerror.val = cmd.getTableParameterValue("@ORIGERROR", object.class);


		}*/
		
		public static NBool fFgbenchExists(NString encumbNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.F_FGBENCH_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ENCUMB_NUM", encumbNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetAutobuyrCode(NString chartCode,NString orgnCode,NDate transDate,NString commCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.F_GET_AUTOBUYR_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CHART_CODE", chartCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@TRANS_DATE", transDate);
			cmd.addParameter("@COMM_CODE", commCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSuccessMessage(NString docname,NString docCode,NString forwardProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.F_GET_SUCCESS_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOCNAME", docname);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@FORWARD_PROCESS", forwardProcess);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetTaxAmount(NString tgrp,NDate asofdate,NNumber apprAmt,NNumber discAmt,NNumber addlAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.F_GET_TAX_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TGRP", tgrp);
			cmd.addParameter("@ASOFDATE", asofdate);
			cmd.addParameter("@APPR_AMT", apprAmt);
			cmd.addParameter("@DISC_AMT", discAmt);
			cmd.addParameter("@ADDL_AMT", addlAmt);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		/*public static List<TaxDetailTablRow> fGetTaxDetails(NString tgrp,NDate asofdate,NNumber vendorPidm,NString vendorId,NNumber apprAmt,NNumber discAmt,NNumber addlAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.F_GET_TAX_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(List<TaxDetailTablRow>.class);
			cmd.addParameter("@TGRP", tgrp);
			cmd.addParameter("@ASOFDATE", asofdate);
			cmd.addParameter("@VENDOR_PIDM", vendorPidm);
			cmd.addParameter("@VENDOR_ID", vendorId);
			cmd.addParameter("@APPR_AMT", apprAmt);
			cmd.addParameter("@DISC_AMT", discAmt);
			cmd.addParameter("@ADDL_AMT", addlAmt);
				
			cmd.execute();

			return cmd.getReturnValue(List<TaxDetailTablRow>.class);

		}*/
		
		public static NString fIsVendorEdi(NNumber vendPidm,NString vendAtyp,NNumber vendAtypSeq,NString docType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.F_IS_VENDOR_EDI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@VEND_PIDM", vendPidm);
			cmd.addParameter("@VEND_ATYP", vendAtyp);
			cmd.addParameter("@VEND_ATYP_SEQ", vendAtypSeq);
			cmd.addParameter("@DOC_TYPE", docType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCalcEncumbAdjustment(NString pPoCode,NNumber pChangeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.P_CALC_ENCUMB_ADJUSTMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PO_CODE", pPoCode);
			cmd.addParameter("@P_CHANGE_SEQ_NUM", pChangeSeqNum);
				
			cmd.execute();


		}
		
		public static void pCheckDocDates(NDate transDate,NDate orderDate,NDate delivDate,Ref<NString> errorMesg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.P_CHECK_DOC_DATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_DATE", transDate);
			cmd.addParameter("@ORDER_DATE", orderDate);
			cmd.addParameter("@DELIV_DATE", delivDate);
			cmd.addParameter("@ERROR_MESG", errorMesg, true);
				
			cmd.execute();
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);


		}
		
		public static void pForwardDocument(NNumber docType,NString docDesc,NString docCode,NString userId,NString completeInd,NString approvalInd,Ref<NString> errorMesg,Ref<NString> successMesg,NNumber docTotal,NNumber chgSeq,NString bankCode,NString subNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.P_FORWARD_DOCUMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@DOC_DESC", docDesc);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@COMPLETE_IND", completeInd);
			cmd.addParameter("@APPROVAL_IND", approvalInd);
			cmd.addParameter("@ERROR_MESG", errorMesg, true);
			cmd.addParameter("@SUCCESS_MESG", successMesg, true);
			cmd.addParameter("@DOC_TOTAL", docTotal);
			cmd.addParameter("@CHG_SEQ", chgSeq);
			cmd.addParameter("@BANK_CODE", bankCode);
			cmd.addParameter("@SUB_NUM", subNum);
				
			cmd.execute();
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);
			successMesg.val = cmd.getParameterValue("@SUCCESS_MESG", NString.class);


		}
		/*
		public static void pIsDocacctgPostable(List<AbalEntryTabtypeRow> allDocFoaps,Ref<List<ErrorMesgTabtypeRow>> errorMesgTable,Ref<NString> validInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.P_IS_DOCACCTG_POSTABLE", DbManager.getDataBaseFactory());
			
			// cmd.addParameter(DbTypes.getCollectionType("ALL_DOC_FOAPS", "", allDocFoaps, object.class));
			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG_TABLE", "", errorMesgTable.val, object.class , true));
			cmd.addParameter("@VALID_IND", validInd, true);
				
			cmd.execute();
			// errorMesgTable.val = cmd.getTableParameterValue("@ERROR_MESG_TABLE", object.class);
			validInd.val = cmd.getParameterValue("@VALID_IND", NString.class);


		}
		
		public static void pIsDocacctgPostable(List<AbalQueryTabtypeRow> allDocFoaps,Ref<List<ErrorMesgTabtypeRow>> errorMesgTable,Ref<NString> validInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.P_IS_DOCACCTG_POSTABLE", DbManager.getDataBaseFactory());
			
			// cmd.addParameter(DbTypes.getCollectionType("ALL_DOC_FOAPS", "", allDocFoaps, object.class));
			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG_TABLE", "", errorMesgTable.val, object.class , true));
			cmd.addParameter("@VALID_IND", validInd, true);
				
			cmd.execute();
			// errorMesgTable.val = cmd.getTableParameterValue("@ERROR_MESG_TABLE", object.class);
			validInd.val = cmd.getParameterValue("@VALID_IND", NString.class);


		}
		
		public static void pIsFoapPostable(AbalEntryRectypeRow oneFoap,Ref<List<ErrorMesgTabtypeRow>> errorMesg,Ref<NString> validInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.P_IS_FOAP_POSTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("ONE_FOAP", oneFoap, AbalEntryRectypeRow.class ));
			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
			cmd.addParameter("@VALID_IND", validInd, true);
				
			cmd.execute();
			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
			validInd.val = cmd.getParameterValue("@VALID_IND", NString.class);


		}
		
		public static void pIsFoapPostable(AbalQueryRectypeRow oneFoap,Ref<List<ErrorMesgTabtypeRow>> errorMesg,Ref<NString> validInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.P_IS_FOAP_POSTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("ONE_FOAP", oneFoap, AbalQueryRectypeRow.class ));
			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
			cmd.addParameter("@VALID_IND", validInd, true);
				
			cmd.execute();
			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);
			validInd.val = cmd.getParameterValue("@VALID_IND", NString.class);


		}
		
		public static void pScrubchar(NString incode,NNumber maxlength,NString defvalue,Ref<NString> outcode,Ref<List<ErrorMesgTabtypeRow>> errorMesg,NString codename,NString towhichcase,NString errorout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.P_SCRUBCHAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INCODE", incode);
			cmd.addParameter("@MAXLENGTH", maxlength);
			cmd.addParameter("@DEFVALUE", defvalue);
			cmd.addParameter("@OUTCODE", outcode, true);
			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
			cmd.addParameter("@CODENAME", codename);
			cmd.addParameter("@TOWHICHCASE", towhichcase);
			cmd.addParameter("@ERROROUT", errorout);
				
			cmd.execute();
			outcode.val = cmd.getParameterValue("@OUTCODE", NString.class);
			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);


		}
		
		public static void pScrubdate(NString indate,NString dateformat,Ref<NDate> outdate,Ref<List<ErrorMesgTabtypeRow>> errorMesg,NString datename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.P_SCRUBDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDATE", indate);
			cmd.addParameter("@DATEFORMAT", dateformat);
			cmd.addParameter("@OUTDATE", outdate, true);
			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
			cmd.addParameter("@DATENAME", datename);
				
			cmd.execute();
			outdate.val = cmd.getParameterValue("@OUTDATE", NDate.class);
			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);


		}
		
		public static void pScrubnumb(NString incode,NNumber maxlength,Ref<NNumber> outcode,Ref<List<ErrorMesgTabtypeRow>> errorMesg,NString codename,NNumber maxscale) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.P_SCRUBNUMB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INCODE", incode);
			cmd.addParameter("@MAXLENGTH", maxlength);
			cmd.addParameter("@OUTCODE", outcode, true);
			// cmd.addParameter(DbTypes.getTableType("ERROR_MESG", "", errorMesg.val, object.class , true));
			cmd.addParameter("@CODENAME", codename);
			cmd.addParameter("@MAXSCALE", maxscale);
				
			cmd.execute();
			outcode.val = cmd.getParameterValue("@OUTCODE", NNumber.class);
			// errorMesg.val = cmd.getTableParameterValue("@ERROR_MESG", object.class);


		}
		
		public static NString FtableToString(List<ErrorMesgTabtypeRow> errorTab) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKLAKS.TABLE_TO_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			// cmd.addParameter(DbTypes.getTableType("ERROR_TAB", "", errorTab, object.class));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		*/
	
	
	@DbRecordType(id="AbalEntryRectypeRow", dataSourceName="ABAL_ENTRY_RECTYPE")
	public static class AbalEntryRectypeRow
	{
		@DbRecordField(dataSourceName="DOCTYPE")
		public NString Doctype;
		@DbRecordField(dataSourceName="DOCCODE")
		public NString Doccode;
		@DbRecordField(dataSourceName="USERID")
		public NString Userid;
		@DbRecordField(dataSourceName="TRANS_DATE")
		public NString TransDate;
		@DbRecordField(dataSourceName="SEQITEM")
		public NString Seqitem;
		@DbRecordField(dataSourceName="SEQNUM")
		public NString Seqnum;
		@DbRecordField(dataSourceName="COAS")
		public NString Coas;
		@DbRecordField(dataSourceName="ACCI")
		public NString Acci;
		@DbRecordField(dataSourceName="FUND")
		public NString Fund;
		@DbRecordField(dataSourceName="ORGN")
		public NString Orgn;
		@DbRecordField(dataSourceName="ACCT")
		public NString Acct;
		@DbRecordField(dataSourceName="PROG")
		public NString Prog;
		@DbRecordField(dataSourceName="ACTV")
		public NString Actv;
		@DbRecordField(dataSourceName="LOCN")
		public NString Locn;
		@DbRecordField(dataSourceName="PERCENT_DIST")
		public NString PercentDist;
		@DbRecordField(dataSourceName="ACCTG_AMT")
		public NString AcctgAmt;
	}

	
	@DbRecordType(id="AbalQueryRectypeRow", dataSourceName="ABAL_QUERY_RECTYPE")
	public static class AbalQueryRectypeRow
	{
		@DbRecordField(dataSourceName="DOC_TYPE")
		public NNumber DocType;
		@DbRecordField(dataSourceName="DOC_CODE")
		public NString DocCode;
		@DbRecordField(dataSourceName="USERID")
		public NString Userid;
		@DbRecordField(dataSourceName="TRANSDATE")
		public NDate Transdate;
		@DbRecordField(dataSourceName="ITEM_NUM")
		public NNumber ItemNum;
		@DbRecordField(dataSourceName="SEQ_NUM")
		public NNumber SeqNum;
		@DbRecordField(dataSourceName="COAS")
		public NString Coas;
		@DbRecordField(dataSourceName="ACCI")
		public NString Acci;
		@DbRecordField(dataSourceName="FUND")
		public NString Fund;
		@DbRecordField(dataSourceName="ORGN")
		public NString Orgn;
		@DbRecordField(dataSourceName="ACCT")
		public NString Acct;
		@DbRecordField(dataSourceName="PROG")
		public NString Prog;
		@DbRecordField(dataSourceName="ACTV")
		public NString Actv;
		@DbRecordField(dataSourceName="LOCN")
		public NString Locn;
		@DbRecordField(dataSourceName="TRANS_AMT")
		public NNumber TransAmt;
		@DbRecordField(dataSourceName="NSF_OVERRIDE_IND")
		public NString NsfOverrideInd;
	}

	
	@DbRecordType(id="TaxDetailRecRow", dataSourceName="TAX_DETAIL_REC")
	public static class TaxDetailRecRow
	{
		@DbRecordField(dataSourceName="TRAT_CODE")
		public NString TratCode;
		@DbRecordField(dataSourceName="TRAT_DESC")
		public NString TratDesc;
		@DbRecordField(dataSourceName="TRAT_RATE")
		public NNumber TratRate;
		@DbRecordField(dataSourceName="TRAT_PAY_TAX_TO")
		public NString TratPayTaxTo;
		@DbRecordField(dataSourceName="TRAT_PRIORITY")
		public NNumber TratPriority;
		@DbRecordField(dataSourceName="TRAT_EXEMPT_PCT")
		public NNumber TratExemptPct;
		@DbRecordField(dataSourceName="TAXABLE_AMT")
		public NNumber TaxableAmt;
		@DbRecordField(dataSourceName="TAX_AMT")
		public NNumber TaxAmt;
		@DbRecordField(dataSourceName="REBATE_AMT")
		public NNumber RebateAmt;
	}

	
	
}
