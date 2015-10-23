package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiHeaderRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pDcmtSeqno,NNumber pIdDateKey,NNumber pIdDocKey,NString pIdEdiKey,NString pIdTporg,NNumber pPidm,NString pXsetCode,NString pAckkeyT,NString pSendDate,NString pSendTime,NString pStimCode,NString pXprpCode,NString pXrsnCode,NString pSidSsnum,NString pSidAgencyNum,NString pSidAgencyDesc,NString pDobQual,NString pDobDateCode,NString pGender,NString pMarital,NString pEthnic,NString pCitizen,NString pHomeCntry,NString pDcmtImage,NString pXmlTranscript,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ID_DATE_KEY", pIdDateKey);
			cmd.addParameter("@P_ID_DOC_KEY", pIdDocKey);
			cmd.addParameter("@P_ID_EDI_KEY", pIdEdiKey);
			cmd.addParameter("@P_ID_TPORG", pIdTporg);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_XSET_CODE", pXsetCode);
			cmd.addParameter("@P_ACKKEY_T", pAckkeyT);
			cmd.addParameter("@P_SEND_DATE", pSendDate);
			cmd.addParameter("@P_SEND_TIME", pSendTime);
			cmd.addParameter("@P_STIM_CODE", pStimCode);
			cmd.addParameter("@P_XPRP_CODE", pXprpCode);
			cmd.addParameter("@P_XRSN_CODE", pXrsnCode);
			cmd.addParameter("@P_SID_SSNUM", pSidSsnum);
			cmd.addParameter("@P_SID_AGENCY_NUM", pSidAgencyNum);
			cmd.addParameter("@P_SID_AGENCY_DESC", pSidAgencyDesc);
			cmd.addParameter("@P_DOB_QUAL", pDobQual);
			cmd.addParameter("@P_DOB_DATE_CODE", pDobDateCode);
			cmd.addParameter("@P_GENDER", pGender);
			cmd.addParameter("@P_MARITAL", pMarital);
			cmd.addParameter("@P_ETHNIC", pEthnic);
			cmd.addParameter("@P_CITIZEN", pCitizen);
			cmd.addParameter("@P_HOME_CNTRY", pHomeCntry);
			cmd.addParameter("@P_DCMT_IMAGE", pDcmtImage);
			cmd.addParameter("@P_XML_TRANSCRIPT", pXmlTranscript);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pDcmtSeqno,NNumber pIdDateKey,NNumber pIdDocKey,NString pIdEdiKey,NString pIdTporg,NNumber pPidm,NString pXsetCode,NString pAckkeyT,NString pSendDate,NString pSendTime,NString pStimCode,NString pXprpCode,NString pXrsnCode,NString pSidSsnum,NString pSidAgencyNum,NString pSidAgencyDesc,NString pDobQual,NString pDobDateCode,NString pGender,NString pMarital,NString pEthnic,NString pCitizen,NString pHomeCntry,NString pDcmtImage,NString pXmlTranscript,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ID_DATE_KEY", pIdDateKey);
			cmd.addParameter("@P_ID_DOC_KEY", pIdDocKey);
			cmd.addParameter("@P_ID_EDI_KEY", pIdEdiKey);
			cmd.addParameter("@P_ID_TPORG", pIdTporg);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_XSET_CODE", pXsetCode);
			cmd.addParameter("@P_ACKKEY_T", pAckkeyT);
			cmd.addParameter("@P_SEND_DATE", pSendDate);
			cmd.addParameter("@P_SEND_TIME", pSendTime);
			cmd.addParameter("@P_STIM_CODE", pStimCode);
			cmd.addParameter("@P_XPRP_CODE", pXprpCode);
			cmd.addParameter("@P_XRSN_CODE", pXrsnCode);
			cmd.addParameter("@P_SID_SSNUM", pSidSsnum);
			cmd.addParameter("@P_SID_AGENCY_NUM", pSidAgencyNum);
			cmd.addParameter("@P_SID_AGENCY_DESC", pSidAgencyDesc);
			cmd.addParameter("@P_DOB_QUAL", pDobQual);
			cmd.addParameter("@P_DOB_DATE_CODE", pDobDateCode);
			cmd.addParameter("@P_GENDER", pGender);
			cmd.addParameter("@P_MARITAL", pMarital);
			cmd.addParameter("@P_ETHNIC", pEthnic);
			cmd.addParameter("@P_CITIZEN", pCitizen);
			cmd.addParameter("@P_HOME_CNTRY", pHomeCntry);
			cmd.addParameter("@P_DCMT_IMAGE", pDcmtImage);
			cmd.addParameter("@P_XML_TRANSCRIPT", pXmlTranscript);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
