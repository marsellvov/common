package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwacbref {
		public static DataCursor fGetCampaigns() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWACBREF.F_GET_CAMPAIGNS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fGetGuridenDesc(NString pIdenCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWACBREF.F_GET_GURIDEN_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_IDEN_CODE", pIdenCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetMoves(NString idIn,NDate dateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWACBREF.F_GET_MOVES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@DATE_IN", dateIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetPrefCampaign(NString campCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWACBREF.F_GET_PREF_CAMPAIGN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@CAMP_CODE_IN", campCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetPrefStatus(NString prstCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWACBREF.F_GET_PREF_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PRST_CODE_IN", prstCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetStatuses(NString prstCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWACBREF.F_GET_STATUSES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PRST_CODE_IN", prstCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pAdvProspectCount(NNumber pPidm,NString pSnamePrefix,NString pLname,NString pFname,NString pMi,NString pPrstPref,Ref<DataCursor> advProspectCountRefOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWACBREF.P_ADV_PROSPECT_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SNAME_PREFIX", pSnamePrefix);
			cmd.addParameter("@P_LNAME", pLname);
			cmd.addParameter("@P_FNAME", pFname);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_PRST_PREF", pPrstPref);
			cmd.addParameter("@ADV_PROSPECT_COUNT_REF_OUT", DataCursor.class);
				
			cmd.execute();
			advProspectCountRefOut.val = cmd.getParameterValue("@ADV_PROSPECT_COUNT_REF_OUT", DataCursor.class);


		}
		
		public static void pAdvProspectRownum(NNumber pPidm,NString pSortOrder,NNumber pStartRow,NNumber pEndRow,NNumber pRowsToDisplay,NString pSnamePrefix,NString pLname,NString pFname,NString pMi,NString pPrstPref,Ref<DataCursor> advProspectRownumRefOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWACBREF.P_ADV_PROSPECT_ROWNUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SORT_ORDER", pSortOrder);
			cmd.addParameter("@P_START_ROW", pStartRow);
			cmd.addParameter("@P_END_ROW", pEndRow);
			cmd.addParameter("@P_ROWS_TO_DISPLAY", pRowsToDisplay);
			cmd.addParameter("@P_SNAME_PREFIX", pSnamePrefix);
			cmd.addParameter("@P_LNAME", pLname);
			cmd.addParameter("@P_FNAME", pFname);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_PRST_PREF", pPrstPref);
			cmd.addParameter("@ADV_PROSPECT_ROWNUM_REF_OUT", DataCursor.class);
				
			cmd.execute();
			advProspectRownumRefOut.val = cmd.getParameterValue("@ADV_PROSPECT_ROWNUM_REF_OUT", DataCursor.class);


		}
		
		public static void pGetAdvProspect(NNumber pPidm,NString pSortOrder,NNumber pStartRow,NNumber pEndRow,NString pSurnamePrefix,NString pLastName,NString pFirstName,NString pMiName,NString pPrstPref,Ref<DataCursor> pAdvProspectRefOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWACBREF.P_GET_ADV_PROSPECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SORT_ORDER", pSortOrder);
			cmd.addParameter("@P_START_ROW", pStartRow);
			cmd.addParameter("@P_END_ROW", pEndRow);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI_NAME", pMiName);
			cmd.addParameter("@P_PRST_PREF", pPrstPref);
			cmd.addParameter("@P_ADV_PROSPECT_REF_OUT", DataCursor.class);
				
			cmd.execute();
			pAdvProspectRefOut.val = cmd.getParameterValue("@P_ADV_PROSPECT_REF_OUT", DataCursor.class);


		}
		
	
	
	@DbRecordType(id="AdvmoveRecRow", dataSourceName="ADVMOVE_REC")
	public static class AdvmoveRecRow
	{
		@DbRecordField(dataSourceName="R_AMRPLAN_PLAN_DATE_SHORT_DATE")
		public NDate RAmrplanPlanDateShortDate;
		@DbRecordField(dataSourceName="R_AMRPLAN_PLAN_DATE_FULL_DATE")
		public NDate RAmrplanPlanDateFullDate;
	}

	
	@DbRecordType(id="CampaignRecRow", dataSourceName="CAMPAIGN_REC")
	public static class CampaignRecRow
	{
		@DbRecordField(dataSourceName="R_AFBCAMP_NAME")
		public NString RAfbcampName;
		@DbRecordField(dataSourceName="R_AFBCAMP_CAMPAIGN")
		public NString RAfbcampCampaign;
	}

	
	@DbRecordType(id="StatusRecRow", dataSourceName="STATUS_REC")
	public static class StatusRecRow
	{
		@DbRecordField(dataSourceName="R_ATVPRST_CODE")
		public NString RAtvprstCode;
		@DbRecordField(dataSourceName="R_ATVPRST_DESC")
		public NString RAtvprstDesc;
	}

	
	
}
