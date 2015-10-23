package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokp3lb {
		public static NDate fGetPosnLastPaidDate(NString parPhrjobsPosn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.F_GET_POSN_LAST_PAID_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PAR_PHRJOBS_POSN", parPhrjobsPosn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fPayPeriodStartDate(NString pictCodeIn,NDate effDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.F_PAY_PERIOD_START_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fPdesc(NString whichTable,NString code,NNumber howBig) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.F_PDESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WHICH_TABLE", whichTable);
			cmd.addParameter("@CODE", code);
			cmd.addParameter("@HOW_BIG", howBig);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fPersnblRecsExist(NString parPcls) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.F_PERSNBL_RECS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PAR_PCLS", parPcls);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCheckPerjobsExist(NNumber parPidm,NString parPosn,NString parSuff,NDate parEffectiveDate,NString parPictCode,NString parCoasCode,NString parOrgnCode,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.P_CHECK_PERJOBS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
			cmd.addParameter("@PAR_PICT_CODE", parPictCode);
			cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
			cmd.addParameter("@PAR_ORGN_CODE", parOrgnCode);
			cmd.addParameter("@MSG", msg, true);
			cmd.addParameter("@MSG_TYPE", msgType, true);
				
			cmd.execute();
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static void pEditLcatCode(NString parLcatCode,NString exeSource,Ref<NString> parDesc,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.P_EDIT_LCAT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_LCAT_CODE", parLcatCode);
			cmd.addParameter("@EXE_SOURCE", exeSource);
			cmd.addParameter("@PAR_DESC", parDesc, true);
			cmd.addParameter("@MSG", msg, true);
			cmd.addParameter("@MSG_TYPE", msgType, true);
				
			cmd.execute();
			parDesc.val = cmd.getParameterValue("@PAR_DESC", NString.class);
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static void pEditPtrinst(NString parPtrinstCode,Ref<NString> parEclsInd,Ref<NString> parOrgnInd,Ref<NString> parSalaInd,Ref<NString> parEmprInd,Ref<NString> parStrsPersDate,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.P_EDIT_PTRINST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PTRINST_CODE", parPtrinstCode);
			cmd.addParameter("@PAR_ECLS_IND", NString.class);
			cmd.addParameter("@PAR_ORGN_IND", NString.class);
			cmd.addParameter("@PAR_SALA_IND", NString.class);
			cmd.addParameter("@PAR_EMPR_IND", NString.class);
			cmd.addParameter("@PAR_STRS_PERS_DATE", NString.class);
			cmd.addParameter("@MSG", NString.class);
			cmd.addParameter("@MSG_TYPE", NString.class);
				
			cmd.execute();
			parEclsInd.val = cmd.getParameterValue("@PAR_ECLS_IND", NString.class);
			parOrgnInd.val = cmd.getParameterValue("@PAR_ORGN_IND", NString.class);
			parSalaInd.val = cmd.getParameterValue("@PAR_SALA_IND", NString.class);
			parEmprInd.val = cmd.getParameterValue("@PAR_EMPR_IND", NString.class);
			parStrsPersDate.val = cmd.getParameterValue("@PAR_STRS_PERS_DATE", NString.class);
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static void pGetEmplLoa(NNumber parPidm,Ref<NDate> parLoaBegDate,Ref<NDate> parLoaEndDate,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.P_GET_EMPL_LOA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_LOA_BEG_DATE", NDate.class);
			cmd.addParameter("@PAR_LOA_END_DATE", NDate.class);
			cmd.addParameter("@MSG", NString.class);
			cmd.addParameter("@MSG_TYPE", NString.class);
				
			cmd.execute();
			parLoaBegDate.val = cmd.getParameterValue("@PAR_LOA_BEG_DATE", NDate.class);
			parLoaEndDate.val = cmd.getParameterValue("@PAR_LOA_END_DATE", NDate.class);
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static void pIncludeAllBarg(NString spexCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.P_INCLUDE_ALL_BARG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SPEX_CODE", spexCode);
				
			cmd.execute();


		}
		
		public static void pIncludeAllEcls(NString spexCode,NString fiscCode,NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.P_INCLUDE_ALL_ECLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SPEX_CODE", spexCode);
			cmd.addParameter("@FISC_CODE", fiscCode);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();


		}
		
		public static void pPtrinseRecsExist(NString parPosn,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKP3LB.P_PTRINSE_RECS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@MSG", NString.class);
			cmd.addParameter("@MSG_TYPE", NString.class);
				
			cmd.execute();
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
	
	
	
}
