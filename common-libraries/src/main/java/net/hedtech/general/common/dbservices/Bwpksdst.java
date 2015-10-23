package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpksdst {
		public static void pDispacctdist(NString extract,NString scenario,NString posfSeqno,NString empfSeqNo,NString seqNo,NString effectiveDate,NString percent,NString amount,NString coasCode,NString acciCode,NString fundCode,NString orgnCode,NString acctCode,NString progCode,NString actvCode,NString locnCode,NString projCode,NString ctypCode,NString acctCodeExternal,NString rowidIn,NString encOverrideEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSDST.P_DISPACCTDIST", DbManager.getDataBaseFactory());
			
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
		
		public static void pJoblabordist(NString extract,NString scenario,NString empfSeqNo,NString seqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSDST.P_JOBLABORDIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQ_NO", empfSeqNo);
			cmd.addParameter("@SEQ_NO", seqNo);
				
			cmd.execute();


		}
		
		public static void pPosnlabordist(NString extract,NString scenario,NString posfSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSDST.P_POSNLABORDIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@POSF_SEQNO", posfSeqno);
				
			cmd.execute();


		}
		
		public static void pUpdateacctdist(NString extract,NString scenario,NString posfSeqno,NString empfSeqNo,NString seqNo,NString effectiveDate,NString percent,NString amount,NString coasCode,NString acciCode,NString fundCode,NString orgnCode,NString acctCode,NString progCode,NString actvCode,NString locnCode,NString projCode,NString ctypCode,NString acctCodeExternal,NString rowidIn,NString buttonselected,NString encOverrideEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSDST.P_UPDATEACCTDIST", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@ENC_OVERRIDE_END_DATE", encOverrideEndDate);
				
			cmd.execute();


		}
		
		public static void pUpdatejoblabordist(NString extract,NString scenario,NString empfSeqNo,NString seqNo,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSDST.P_UPDATEJOBLABORDIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@EMPF_SEQ_NO", empfSeqNo);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pUpdateposnlabordist(NString extract,NString scenario,NString posfSeqno,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKSDST.P_UPDATEPOSNLABORDIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@POSF_SEQNO", posfSeqno);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
	
	
	
}
