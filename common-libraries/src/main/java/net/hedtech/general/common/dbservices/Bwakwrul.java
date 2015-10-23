package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakwrul {
		public static void pModifypgwebrules(NString returnCode,NString returnMsg,NString jobPostReviewInd,NString solcCodeDflt,NString giftSolcCodeDflt,NString ctypAssignStart,NString ctypAssignEnd,NString pgveCodeDflt,NString pstaCodeDflt,NString xrefCodeDflt,NString idenCodeConf,NString subjCodeConf,NString actpCodeAdvs,NString pldgPayInd,NString giftSplitInd,NString emplMatchInd,NString compPldgInd,NString rcptInd,NString pgveCodeDfltGift,NString gclsCodeDflt,NString ghAllowGifts,NString ghAllowPledges,NString ghAllowGiftPledge,NString ghAllowFisc,NString ghAllowCampFisc,NString ghAllowDesgFisc,NString ghAllowCombined,NString ghAllowOverall,NString pldgPrmdCode,NString pinsPrmdCode,NString movesDeleteInd,NString expMgInd,NString giftNotifyUserId,NString faxTeleCode,NString contactDispInd,NString homeInstTitle,NString inclSpsGiving,NString dispDeadInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKWRUL.P_MODIFYPGWEBRULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@JOB_POST_REVIEW_IND", jobPostReviewInd);
			cmd.addParameter("@SOLC_CODE_DFLT", solcCodeDflt);
			cmd.addParameter("@GIFT_SOLC_CODE_DFLT", giftSolcCodeDflt);
			cmd.addParameter("@CTYP_ASSIGN_START", ctypAssignStart);
			cmd.addParameter("@CTYP_ASSIGN_END", ctypAssignEnd);
			cmd.addParameter("@PGVE_CODE_DFLT", pgveCodeDflt);
			cmd.addParameter("@PSTA_CODE_DFLT", pstaCodeDflt);
			cmd.addParameter("@XREF_CODE_DFLT", xrefCodeDflt);
			cmd.addParameter("@IDEN_CODE_CONF", idenCodeConf);
			cmd.addParameter("@SUBJ_CODE_CONF", subjCodeConf);
			cmd.addParameter("@ACTP_CODE_ADVS", actpCodeAdvs);
			cmd.addParameter("@PLDG_PAY_IND", pldgPayInd);
			cmd.addParameter("@GIFT_SPLIT_IND", giftSplitInd);
			cmd.addParameter("@EMPL_MATCH_IND", emplMatchInd);
			cmd.addParameter("@COMP_PLDG_IND", compPldgInd);
			cmd.addParameter("@RCPT_IND", rcptInd);
			cmd.addParameter("@PGVE_CODE_DFLT_GIFT", pgveCodeDfltGift);
			cmd.addParameter("@GCLS_CODE_DFLT", gclsCodeDflt);
			cmd.addParameter("@GH_ALLOW_GIFTS", ghAllowGifts);
			cmd.addParameter("@GH_ALLOW_PLEDGES", ghAllowPledges);
			cmd.addParameter("@GH_ALLOW_GIFT_PLEDGE", ghAllowGiftPledge);
			cmd.addParameter("@GH_ALLOW_FISC", ghAllowFisc);
			cmd.addParameter("@GH_ALLOW_CAMP_FISC", ghAllowCampFisc);
			cmd.addParameter("@GH_ALLOW_DESG_FISC", ghAllowDesgFisc);
			cmd.addParameter("@GH_ALLOW_COMBINED", ghAllowCombined);
			cmd.addParameter("@GH_ALLOW_OVERALL", ghAllowOverall);
			cmd.addParameter("@PLDG_PRMD_CODE", pldgPrmdCode);
			cmd.addParameter("@PINS_PRMD_CODE", pinsPrmdCode);
			cmd.addParameter("@MOVES_DELETE_IND", movesDeleteInd);
			cmd.addParameter("@EXP_MG_IND", expMgInd);
			cmd.addParameter("@GIFT_NOTIFY_USER_ID", giftNotifyUserId);
			cmd.addParameter("@FAX_TELE_CODE", faxTeleCode);
			cmd.addParameter("@CONTACT_DISP_IND", contactDispInd);
			cmd.addParameter("@HOME_INST_TITLE", homeInstTitle);
			cmd.addParameter("@INCL_SPS_GIVING", inclSpsGiving);
			cmd.addParameter("@DISP_DEAD_IND", dispDeadInd);
				
			cmd.execute();


		}
		
		public static void pSavewebrules(NString transType,NString jobPostReviewInd,NString solcCodeDflt,NString giftSolcCodeDflt,NString ctypAssignStart,NString ctypAssignEnd,NString pgveCodeDflt,NString pstaCodeDflt,NString xrefCodeDflt,NString idenCodeConf,NString subjCodeConf,NString actpCodeAdvs,NString pldgPayInd,NString giftSplitInd,NString emplMatchInd,NString compPldgInd,NString rcptInd,NString pgveCodeDfltGift,NString gclsCodeDflt,NString ghAllowGifts,NString ghAllowPledges,NString ghAllowGiftPledge,NString ghAllowFisc,NString ghAllowCampFisc,NString ghAllowDesgFisc,NString ghAllowCombined,NString ghAllowOverall,NString pldgPrmdCode,NString pinsPrmdCode,NString movesDeleteInd,NString expMgInd,NString giftNotifyUserId,NString faxTeleCode,NString contactDispInd,NString homeInstTitle,NString inclSpsGiving,NString dispDeadInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKWRUL.P_SAVEWEBRULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@JOB_POST_REVIEW_IND", jobPostReviewInd);
			cmd.addParameter("@SOLC_CODE_DFLT", solcCodeDflt);
			cmd.addParameter("@GIFT_SOLC_CODE_DFLT", giftSolcCodeDflt);
			cmd.addParameter("@CTYP_ASSIGN_START", ctypAssignStart);
			cmd.addParameter("@CTYP_ASSIGN_END", ctypAssignEnd);
			cmd.addParameter("@PGVE_CODE_DFLT", pgveCodeDflt);
			cmd.addParameter("@PSTA_CODE_DFLT", pstaCodeDflt);
			cmd.addParameter("@XREF_CODE_DFLT", xrefCodeDflt);
			cmd.addParameter("@IDEN_CODE_CONF", idenCodeConf);
			cmd.addParameter("@SUBJ_CODE_CONF", subjCodeConf);
			cmd.addParameter("@ACTP_CODE_ADVS", actpCodeAdvs);
			cmd.addParameter("@PLDG_PAY_IND", pldgPayInd);
			cmd.addParameter("@GIFT_SPLIT_IND", giftSplitInd);
			cmd.addParameter("@EMPL_MATCH_IND", emplMatchInd);
			cmd.addParameter("@COMP_PLDG_IND", compPldgInd);
			cmd.addParameter("@RCPT_IND", rcptInd);
			cmd.addParameter("@PGVE_CODE_DFLT_GIFT", pgveCodeDfltGift);
			cmd.addParameter("@GCLS_CODE_DFLT", gclsCodeDflt);
			cmd.addParameter("@GH_ALLOW_GIFTS", ghAllowGifts);
			cmd.addParameter("@GH_ALLOW_PLEDGES", ghAllowPledges);
			cmd.addParameter("@GH_ALLOW_GIFT_PLEDGE", ghAllowGiftPledge);
			cmd.addParameter("@GH_ALLOW_FISC", ghAllowFisc);
			cmd.addParameter("@GH_ALLOW_CAMP_FISC", ghAllowCampFisc);
			cmd.addParameter("@GH_ALLOW_DESG_FISC", ghAllowDesgFisc);
			cmd.addParameter("@GH_ALLOW_COMBINED", ghAllowCombined);
			cmd.addParameter("@GH_ALLOW_OVERALL", ghAllowOverall);
			cmd.addParameter("@PLDG_PRMD_CODE", pldgPrmdCode);
			cmd.addParameter("@PINS_PRMD_CODE", pinsPrmdCode);
			cmd.addParameter("@MOVES_DELETE_IND", movesDeleteInd);
			cmd.addParameter("@EXP_MG_IND", expMgInd);
			cmd.addParameter("@GIFT_NOTIFY_USER_ID", giftNotifyUserId);
			cmd.addParameter("@FAX_TELE_CODE", faxTeleCode);
			cmd.addParameter("@CONTACT_DISP_IND", contactDispInd);
			cmd.addParameter("@HOME_INST_TITLE", homeInstTitle);
			cmd.addParameter("@INCL_SPS_GIVING", inclSpsGiving);
			cmd.addParameter("@DISP_DEAD_IND", dispDeadInd);
				
			cmd.execute();


		}
		
	
	
	
}
