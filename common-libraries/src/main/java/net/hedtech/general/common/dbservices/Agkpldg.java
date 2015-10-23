package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Agkpldg {
		public static NString fUpdateSobseqn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKPLDG.F_UPDATE_SOBSEQN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreatepledge(NString extIdIn,NString pledgeNoIn,NNumber amountIn,NDate pldgDateIn,NDate activityDateIn,NString userIdIn,NString dataOriginIn,NString acceptedIndIn,NString extPledgeIdIn,NNumber pidmIn,NDate entryDateIn,NString pldgCodeIn,NString pstaCodeIn,NString packCodeIn,NString pgveCodeIn,NString pclsCode1In,NString pclsCode2In,NString pclsCode3In,NString pcatCodeIn,NString solcCodeIn,NString solOrgIn,NNumber dcyrCodeIn,NNumber solicitorPidmIn,NString spsSplitIndIn,NString pdurCodeIn,NString freqCodeIn,NDate billDateIn,NDate lastBillDateIn,NDate nextBillDateIn,NString commentIn,NString scntCodeIn,NString scrsCodeIn,NNumber askAmountIn,NDate askDateIn,NString letrCodeIn,NString pldgPrmdCodeIn,NString pinsPrmdCodeIn,List<CampDesgRecRow> campDesgTab,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKPLDG.P_CREATEPLEDGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXT_ID_IN", extIdIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@PLDG_DATE_IN", pldgDateIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@USER_ID_IN", userIdIn);
			cmd.addParameter("@DATA_ORIGIN_IN", dataOriginIn);
			cmd.addParameter("@ACCEPTED_IND_IN", acceptedIndIn);
			cmd.addParameter("@EXT_PLEDGE_ID_IN", extPledgeIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ENTRY_DATE_IN", entryDateIn);
			cmd.addParameter("@PLDG_CODE_IN", pldgCodeIn);
			cmd.addParameter("@PSTA_CODE_IN", pstaCodeIn);
			cmd.addParameter("@PACK_CODE_IN", packCodeIn);
			cmd.addParameter("@PGVE_CODE_IN", pgveCodeIn);
			cmd.addParameter("@PCLS_CODE_1_IN", pclsCode1In);
			cmd.addParameter("@PCLS_CODE_2_IN", pclsCode2In);
			cmd.addParameter("@PCLS_CODE_3_IN", pclsCode3In);
			cmd.addParameter("@PCAT_CODE_IN", pcatCodeIn);
			cmd.addParameter("@SOLC_CODE_IN", solcCodeIn);
			cmd.addParameter("@SOL_ORG_IN", solOrgIn);
			cmd.addParameter("@DCYR_CODE_IN", dcyrCodeIn);
			cmd.addParameter("@SOLICITOR_PIDM_IN", solicitorPidmIn);
			cmd.addParameter("@SPS_SPLIT_IND_IN", spsSplitIndIn);
			cmd.addParameter("@PDUR_CODE_IN", pdurCodeIn);
			cmd.addParameter("@FREQ_CODE_IN", freqCodeIn);
			cmd.addParameter("@BILL_DATE_IN", billDateIn);
			cmd.addParameter("@LAST_BILL_DATE_IN", lastBillDateIn);
			cmd.addParameter("@NEXT_BILL_DATE_IN", nextBillDateIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@SCNT_CODE_IN", scntCodeIn);
			cmd.addParameter("@SCRS_CODE_IN", scrsCodeIn);
			cmd.addParameter("@ASK_AMOUNT_IN", askAmountIn);
			cmd.addParameter("@ASK_DATE_IN", askDateIn);
			cmd.addParameter("@LETR_CODE_IN", letrCodeIn);
			cmd.addParameter("@PLDG_PRMD_CODE_IN", pldgPrmdCodeIn);
			cmd.addParameter("@PINS_PRMD_CODE_IN", pinsPrmdCodeIn);
			// cmd.addParameter(DbTypes.getTableType("CAMP_DESG_TAB", "", campDesgTab, object.class));
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
		public static void pValidatepledge(NString extIdIn,NString pledgeNoIn,NNumber amountIn,NDate pldgDateIn,NDate activityDateIn,NString userIdIn,NString dataOriginIn,NString acceptedIndIn,NString extPledgeIdIn,NNumber pidmIn,NDate entryDateIn,NString pldgCodeIn,NString pstaCodeIn,NString packCodeIn,NString pgveCodeIn,NString pclsCode1In,NString pclsCode2In,NString pclsCode3In,NString pcatCodeIn,NString solcCodeIn,NString solOrgIn,NNumber dcyrCodeIn,NNumber solicitorPidmIn,NString spsSplitIndIn,NString pdurCodeIn,NString freqCodeIn,NDate billDateIn,NDate lastBillDateIn,NDate nextBillDateIn,NString commentIn,NString scntCodeIn,NString scrsCodeIn,NNumber askAmountIn,NDate askDateIn,NString letrCodeIn,NString pldgPrmdCodeIn,NString pinsPrmdCodeIn,List<CampDesgRecRow> campDesgTab,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKPLDG.P_VALIDATEPLEDGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXT_ID_IN", extIdIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@PLDG_DATE_IN", pldgDateIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@USER_ID_IN", userIdIn);
			cmd.addParameter("@DATA_ORIGIN_IN", dataOriginIn);
			cmd.addParameter("@ACCEPTED_IND_IN", acceptedIndIn);
			cmd.addParameter("@EXT_PLEDGE_ID_IN", extPledgeIdIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ENTRY_DATE_IN", entryDateIn);
			cmd.addParameter("@PLDG_CODE_IN", pldgCodeIn);
			cmd.addParameter("@PSTA_CODE_IN", pstaCodeIn);
			cmd.addParameter("@PACK_CODE_IN", packCodeIn);
			cmd.addParameter("@PGVE_CODE_IN", pgveCodeIn);
			cmd.addParameter("@PCLS_CODE_1_IN", pclsCode1In);
			cmd.addParameter("@PCLS_CODE_2_IN", pclsCode2In);
			cmd.addParameter("@PCLS_CODE_3_IN", pclsCode3In);
			cmd.addParameter("@PCAT_CODE_IN", pcatCodeIn);
			cmd.addParameter("@SOLC_CODE_IN", solcCodeIn);
			cmd.addParameter("@SOL_ORG_IN", solOrgIn);
			cmd.addParameter("@DCYR_CODE_IN", dcyrCodeIn);
			cmd.addParameter("@SOLICITOR_PIDM_IN", solicitorPidmIn);
			cmd.addParameter("@SPS_SPLIT_IND_IN", spsSplitIndIn);
			cmd.addParameter("@PDUR_CODE_IN", pdurCodeIn);
			cmd.addParameter("@FREQ_CODE_IN", freqCodeIn);
			cmd.addParameter("@BILL_DATE_IN", billDateIn);
			cmd.addParameter("@LAST_BILL_DATE_IN", lastBillDateIn);
			cmd.addParameter("@NEXT_BILL_DATE_IN", nextBillDateIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@SCNT_CODE_IN", scntCodeIn);
			cmd.addParameter("@SCRS_CODE_IN", scrsCodeIn);
			cmd.addParameter("@ASK_AMOUNT_IN", askAmountIn);
			cmd.addParameter("@ASK_DATE_IN", askDateIn);
			cmd.addParameter("@LETR_CODE_IN", letrCodeIn);
			cmd.addParameter("@PLDG_PRMD_CODE_IN", pldgPrmdCodeIn);
			cmd.addParameter("@PINS_PRMD_CODE_IN", pinsPrmdCodeIn);
			// cmd.addParameter(DbTypes.getTableType("CAMP_DESG_TAB", "", campDesgTab, object.class));
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="CampDesgRecRow", dataSourceName="CAMP_DESG_REC")
	public static class CampDesgRecRow
	{
		@DbRecordField(dataSourceName="CAMPAIGN")
		public NString Campaign;
		@DbRecordField(dataSourceName="DESG")
		public NString Desg;
		@DbRecordField(dataSourceName="AMOUNT")
		public NNumber Amount;
		@DbRecordField(dataSourceName="PLEDGE_NO")
		public NString PledgeNo;
		@DbRecordField(dataSourceName="USER")
		public NString User;
	}

	
	
}
