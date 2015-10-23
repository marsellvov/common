package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Poklibs {
		public static NString fCheckReqdDedns(NString parId,NDate parAsOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKLIBS.F_CHECK_REQD_DEDNS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAR_ID", parId);
			cmd.addParameter("@PAR_AS_OF_DATE", parAsOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFiscalYearSplitInd(NString pCoasCode,NDate pBeginDate,NDate pEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKLIBS.F_FISCAL_YEAR_SPLIT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEclsCode(NString parId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKLIBS.F_GET_ECLS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAR_ID", parId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTimeFormat(NString pFormatIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKLIBS.F_GET_TIME_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FORMAT_IN", pFormatIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetUsernamePidm(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKLIBS.F_GET_USERNAME_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fLastpaiddate(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKLIBS.F_LASTPAIDDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fPastpendingmsg(NNumber pastCnt,NNumber pendCnt,NString viewFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKLIBS.F_PASTPENDINGMSG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAST_CNT", pastCnt);
			cmd.addParameter("@PEND_CNT", pendCnt);
			cmd.addParameter("@VIEW_FLAG", viewFlag);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fPostingDate(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NString pCoasCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKLIBS.F_POSTING_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
	
	
	
}
