package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpksfdt {
		public static DataCursor fGetOrgnCodes(NString coasCode,NString orgnCode,NString orgnTitle,NString asofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSFDT.F_GET_ORGN_CODES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@ORGN_TITLE", orgnTitle);
			cmd.addParameter("@ASOF_DATE", asofDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pDefaultfromindex(NString extract,NString scenario,NString posfSeqno,NString empfSeqNo,NString seqNo,NString effectiveDate,NString percent,NString amount,NString coasCode,NString acciCode,NString fundCode,NString orgnCode,NString acctCode,NString progCode,NString actvCode,NString locnCode,NString projCode,NString ctypCode,NString acctCodeExternal,NString rowidIn,NString encOverrideEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSFDT.P_DEFAULTFROMINDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@POSF_SEQNO", posfSeqno);
			cmd.addParameter("@EMPF_SEQ_NO", empfSeqNo);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EFFECTIVE_DATE", effectiveDate);
			cmd.addParameter("@PERCENT", percent);
			cmd.addParameter("@AMOUNT", amount);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ACCI_CODE", acciCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@ACTV_CODE", actvCode);
			cmd.addParameter("@LOCN_CODE", locnCode);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@CTYP_CODE", ctypCode);
			cmd.addParameter("@ACCT_CODE_EXTERNAL", acctCodeExternal);
			cmd.addParameter("@ROWID_IN", rowidIn);
			cmd.addParameter("@ENC_OVERRIDE_END_DATE", encOverrideEndDate);
				
			cmd.execute();


		}
		
		public static void pListofvaluesld(NString extract,NString scenario,NString posfSeqno,NString empfSeqNo,NString seqNo,NString effectiveDate,NString percent,NString amount,NString coasCode,NString acciCode,NString fundCode,NString orgnCode,NString acctCode,NString progCode,NString actvCode,NString locnCode,NString projCode,NString ctypCode,NString rowidIn,NString buttonselected,NString type,NString code,NString title,NString maxrows,NString encOverrideEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSFDT.P_LISTOFVALUESLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@POSF_SEQNO", posfSeqno);
			cmd.addParameter("@EMPF_SEQ_NO", empfSeqNo);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@EFFECTIVE_DATE", effectiveDate);
			cmd.addParameter("@PERCENT", percent);
			cmd.addParameter("@AMOUNT", amount);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ACCI_CODE", acciCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@ACTV_CODE", actvCode);
			cmd.addParameter("@LOCN_CODE", locnCode);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@CTYP_CODE", ctypCode);
			cmd.addParameter("@ROWID_IN", rowidIn);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@TYPE", type);
			cmd.addParameter("@CODE", code);
			cmd.addParameter("@TITLE", title);
			cmd.addParameter("@MAXROWS", maxrows);
			cmd.addParameter("@ENC_OVERRIDE_END_DATE", encOverrideEndDate);
				
			cmd.execute();


		}
		
		public static void pValidatefoapal(NString coasCode,NString acciCode,Ref<NString> fundCode,Ref<NString> orgnCode,Ref<NString> acctCode,Ref<NString> progCode,Ref<NString> actvCode,Ref<NString> locnCode,NString projCode,NString ctypCode,Ref<NString> varUserMsg,NString effectiveDate,NString defaultIfNull) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSFDT.P_VALIDATEFOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ACCI_CODE", acciCode);
			cmd.addParameter("@FUND_CODE", fundCode, true);
			cmd.addParameter("@ORGN_CODE", orgnCode, true);
			cmd.addParameter("@ACCT_CODE", acctCode, true);
			cmd.addParameter("@PROG_CODE", progCode, true);
			cmd.addParameter("@ACTV_CODE", actvCode, true);
			cmd.addParameter("@LOCN_CODE", locnCode, true);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@CTYP_CODE", ctypCode);
			cmd.addParameter("@VAR_USER_MSG", NString.class);
			cmd.addParameter("@EFFECTIVE_DATE", effectiveDate);
			cmd.addParameter("@DEFAULT_IF_NULL", defaultIfNull);
				
			cmd.execute();
			fundCode.val = cmd.getParameterValue("@FUND_CODE", NString.class);
			orgnCode.val = cmd.getParameterValue("@ORGN_CODE", NString.class);
			acctCode.val = cmd.getParameterValue("@ACCT_CODE", NString.class);
			progCode.val = cmd.getParameterValue("@PROG_CODE", NString.class);
			actvCode.val = cmd.getParameterValue("@ACTV_CODE", NString.class);
			locnCode.val = cmd.getParameterValue("@LOCN_CODE", NString.class);
			varUserMsg.val = cmd.getParameterValue("@VAR_USER_MSG", NString.class);


		}
		
	
	
	
}
