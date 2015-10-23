package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbJvHeaderRules {
		public static void pValidate(NString pDocNum,NNumber pSubmissionNumber,NString pUserId,NDate pTransDate,NString pDocDescription,NNumber pDocAmt,NString pAutoJrnlId,NString pReversalInd,NString pObudCode,NString pObphCode,NString pBudgDurCode,NString pEditDeferInd,NString pStatusInd,NString pApprovalInd,NNumber pDistribAmt,NString pNsfOnOffInd,NString pDataOrigin,NString pCreateSource,FbJvHeader.JvHeaderRecRow pExistingRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_DOC_DESCRIPTION", pDocDescription);
			cmd.addParameter("@P_DOC_AMT", pDocAmt);
			cmd.addParameter("@P_AUTO_JRNL_ID", pAutoJrnlId);
			cmd.addParameter("@P_REVERSAL_IND", pReversalInd);
			cmd.addParameter("@P_OBUD_CODE", pObudCode);
			cmd.addParameter("@P_OBPH_CODE", pObphCode);
			cmd.addParameter("@P_BUDG_DUR_CODE", pBudgDurCode);
			cmd.addParameter("@P_EDIT_DEFER_IND", pEditDeferInd);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_APPROVAL_IND", pApprovalInd);
			cmd.addParameter("@P_DISTRIB_AMT", pDistribAmt);
			cmd.addParameter("@P_NSF_ON_OFF_IND", pNsfOnOffInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CREATE_SOURCE", pCreateSource);
			cmd.addParameter(DbTypes.createStructType("P_EXISTING_REC", pExistingRec, FbJvHeader.JvHeaderRecRow.class ));
				
			cmd.execute();


		}
		
	
	
	
}
