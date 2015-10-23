package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbEncumbranceHeaderRules {
		public static void pValidate(NString pNum,NString pDocChangeNum,NString pUserId,NString pDesc,NString pChangeDesc,NDate pTransDate,NString pDocRefNum,NNumber pDocAmt,NString pType,NString pStatusInd,NString pStatus,NString pEditDeferral,NDate pEstabDate,NNumber pVendorPidm,NString pSourceInd,NString pApprInd,NString pNsfOnOffInd,NDate pCreateDate,NString pCreateUser,NString pDataOrigin,NString pCreateSource,NString pContext,FbEncumbranceHeader.EncumbranceHeaderRecRow pExistingRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_DOC_CHANGE_NUM", pDocChangeNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_CHANGE_DESC", pChangeDesc);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_DOC_REF_NUM", pDocRefNum);
			cmd.addParameter("@P_DOC_AMT", pDocAmt);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_EDIT_DEFERRAL", pEditDeferral);
			cmd.addParameter("@P_ESTAB_DATE", pEstabDate);
			cmd.addParameter("@P_VENDOR_PIDM", pVendorPidm);
			cmd.addParameter("@P_SOURCE_IND", pSourceInd);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_NSF_ON_OFF_IND", pNsfOnOffInd);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CREATE_SOURCE", pCreateSource);
			cmd.addParameter("@P_CONTEXT", pContext);
			cmd.addParameter(DbTypes.createStructType("P_EXISTING_REC", pExistingRec, FbEncumbranceHeader.EncumbranceHeaderRecRow.class ));
				
			cmd.execute();


		}
		
	
	
	
}
