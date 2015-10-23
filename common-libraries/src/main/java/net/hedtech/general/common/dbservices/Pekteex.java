package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pekteex {
		public static void pExtractTime(NString yearIn,NString pictCodeIn,NNumber paynoIn,NString actionIndIn,NNumber pidmIn,NString posnIn,NString suffIn,NString coasCodeTsIn,NString orgnCodeTsIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<NNumber> jobsSeqnoOut,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEEX.P_EXTRACT_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
			cmd.addParameter("@PAYNO_IN", paynoIn);
			cmd.addParameter("@ACTION_IND_IN", actionIndIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@POSN_IN", posnIn);
			cmd.addParameter("@SUFF_IN", suffIn);
			cmd.addParameter("@COAS_CODE_TS_IN", coasCodeTsIn);
			cmd.addParameter("@ORGN_CODE_TS_IN", orgnCodeTsIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter("@JOBS_SEQNO_OUT", NNumber.class);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class,true));
				
			cmd.execute();
			jobsSeqnoOut.val = cmd.getParameterValue("@JOBS_SEQNO_OUT", NNumber.class);
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pMassExtract(NString yearIn,NString pictCodeIn,NNumber paynoIn,NString actionIndIn,NString coasCodeTsIn,NString orgnCodeTsIn,NString teMethodIn,NNumber pidmIn,NString plastNameIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<NString> msgTypeOut,Ref<NString> msgTextOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEEX.P_MASS_EXTRACT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
			cmd.addParameter("@PAYNO_IN", paynoIn);
			cmd.addParameter("@ACTION_IND_IN", actionIndIn);
			cmd.addParameter("@COAS_CODE_TS_IN", coasCodeTsIn);
			cmd.addParameter("@ORGN_CODE_TS_IN", orgnCodeTsIn);
			cmd.addParameter("@TE_METHOD_IN", teMethodIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLAST_NAME_IN", plastNameIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter("@MSG_TYPE_OUT", NString.class);
			cmd.addParameter("@MSG_TEXT_OUT", NString.class);
				
			cmd.execute();
			msgTypeOut.val = cmd.getParameterValue("@MSG_TYPE_OUT", NString.class);
			msgTextOut.val = cmd.getParameterValue("@MSG_TEXT_OUT", NString.class);


		}
		
		public static void pRestartTime(NNumber jobsSeqnoIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEEX.P_RESTART_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class, true));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
	
	
	
}
