package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpkload {
//		public static void pCalculateLoad(NString pAidyCode,NNumber pPidm,NString pPeriod,NString pFundCode,NString pFedFundId,NString pAtypInd,NString pAttendingHrInd,NString pEnrrCode,NString pActionInd,Ref<NString> pLoadOpt,Ref<NNumber> pStdnCrhr,Ref<NNumber> pAttendStdnCrhr,Ref<NString> pLoad,Ref<NString> pAttendLoad,Ref<List<TermloadrectabRow>> pTermloadrectab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLOAD.P_CALCULATE_LOAD", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_PERIOD", pPeriod);
//			cmd.addParameter("@P_FUND_CODE", pFundCode);
//			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
//			cmd.addParameter("@P_ATYP_IND", pAtypInd);
//			cmd.addParameter("@P_ATTENDING_HR_IND", pAttendingHrInd);
//			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
//			cmd.addParameter("@P_ACTION_IND", pActionInd);
//			cmd.addParameter("@P_LOAD_OPT", NString.class);
//			cmd.addParameter("@P_STDN_CRHR", NNumber.class);
//			cmd.addParameter("@P_ATTEND_STDN_CRHR", NNumber.class);
//			cmd.addParameter("@P_LOAD", NString.class);
//			cmd.addParameter("@P_ATTEND_LOAD", NString.class);
//			// cmd.addParameter(DbTypes.getCollectionType("P_TERMLOADRECTAB", "", object.class));
//				
//			cmd.execute();
//			pLoadOpt.val = cmd.getParameterValue("@P_LOAD_OPT", NString.class);
//			pStdnCrhr.val = cmd.getParameterValue("@P_STDN_CRHR", NNumber.class);
//			pAttendStdnCrhr.val = cmd.getParameterValue("@P_ATTEND_STDN_CRHR", NNumber.class);
//			pLoad.val = cmd.getParameterValue("@P_LOAD", NString.class);
//			pAttendLoad.val = cmd.getParameterValue("@P_ATTEND_LOAD", NString.class);
//			// pTermloadrectab.val = cmd.getTableParameterValue("@P_TERMLOADRECTAB", object.class);
//
//
//		}
		
	
	
	@DbRecordType(id="TermloadrectypeRow", dataSourceName="TERMLOADRECTYPE")
	public static class TermloadrectypeRow
	{
		@DbRecordField(dataSourceName="PERIOD")
		public NString Period;
		@DbRecordField(dataSourceName="LOAD")
		public NString Load;
		@DbRecordField(dataSourceName="ATTEND_LOAD")
		public NString AttendLoad;
		@DbRecordField(dataSourceName="LOAD_OPT")
		public NString LoadOpt;
		@DbRecordField(dataSourceName="PELL_ISIR_TERM")
		public NString PellIsirTerm;
		@DbRecordField(dataSourceName="STDN_CRHR")
		public NNumber StdnCrhr;
		@DbRecordField(dataSourceName="ATTEND_STDN_CRHR")
		public NNumber AttendStdnCrhr;
	}

	
	
}
