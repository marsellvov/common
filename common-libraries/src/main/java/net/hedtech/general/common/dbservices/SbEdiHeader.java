package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiHeader {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pDcmtSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EdiHeaderRecRow recOne,EdiHeaderRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EdiHeaderRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EdiHeaderRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pDcmtSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pDcmtSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pDcmtSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pDcmtSeqno,NNumber pIdDateKey,NNumber pIdDocKey,NString pIdEdiKey,NString pIdTporg,NNumber pPidm,NString pXsetCode,NString pAckkeyT,NString pSendDate,NString pSendTime,NString pStimCode,NString pXprpCode,NString pXrsnCode,NString pSidSsnum,NString pSidAgencyNum,NString pSidAgencyDesc,NString pDobQual,NString pDobDateCode,NString pGender,NString pMarital,NString pEthnic,NString pCitizen,NString pHomeCntry,NString pDcmtImage,NString pXmlTranscript,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pDcmtSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pDcmtSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pDcmtSeqno,NNumber pIdDateKey,NNumber pIdDocKey,NString pIdEdiKey,NString pIdTporg,NNumber pPidm,NString pXsetCode,NString pAckkeyT,NString pSendDate,NString pSendTime,NString pStimCode,NString pXprpCode,NString pXrsnCode,NString pSidSsnum,NString pSidAgencyNum,NString pSidAgencyDesc,NString pDobQual,NString pDobDateCode,NString pGender,NString pMarital,NString pEthnic,NString pCitizen,NString pHomeCntry,NString pDcmtImage,NString pXmlTranscript,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_HEADER.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EdiHeaderRecRow", dataSourceName="EDI_HEADER_REC")
	public static class EdiHeaderRecRow
	{
		@DbRecordField(dataSourceName="R_DCMT_SEQNO")
		public NNumber RDcmtSeqno;
		@DbRecordField(dataSourceName="R_ID_DATE_KEY")
		public NNumber RIdDateKey;
		@DbRecordField(dataSourceName="R_ID_DOC_KEY")
		public NNumber RIdDocKey;
		@DbRecordField(dataSourceName="R_ID_EDI_KEY")
		public NString RIdEdiKey;
		@DbRecordField(dataSourceName="R_ID_TPORG")
		public NString RIdTporg;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_XSET_CODE")
		public NString RXsetCode;
		@DbRecordField(dataSourceName="R_ACKKEY_T")
		public NString RAckkeyT;
		@DbRecordField(dataSourceName="R_SEND_DATE")
		public NString RSendDate;
		@DbRecordField(dataSourceName="R_SEND_TIME")
		public NString RSendTime;
		@DbRecordField(dataSourceName="R_STIM_CODE")
		public NString RStimCode;
		@DbRecordField(dataSourceName="R_XPRP_CODE")
		public NString RXprpCode;
		@DbRecordField(dataSourceName="R_XRSN_CODE")
		public NString RXrsnCode;
		@DbRecordField(dataSourceName="R_SID_SSNUM")
		public NString RSidSsnum;
		@DbRecordField(dataSourceName="R_SID_AGENCY_NUM")
		public NString RSidAgencyNum;
		@DbRecordField(dataSourceName="R_SID_AGENCY_DESC")
		public NString RSidAgencyDesc;
		@DbRecordField(dataSourceName="R_DOB_QUAL")
		public NString RDobQual;
		@DbRecordField(dataSourceName="R_DOB_DATE_CODE")
		public NString RDobDateCode;
		@DbRecordField(dataSourceName="R_GENDER")
		public NString RGender;
		@DbRecordField(dataSourceName="R_MARITAL")
		public NString RMarital;
		@DbRecordField(dataSourceName="R_ETHNIC")
		public NString REthnic;
		@DbRecordField(dataSourceName="R_CITIZEN")
		public NString RCitizen;
		@DbRecordField(dataSourceName="R_HOME_CNTRY")
		public NString RHomeCntry;
		@DbRecordField(dataSourceName="R_DCMT_IMAGE")
		public NString RDcmtImage;
		@DbRecordField(dataSourceName="R_XML_TRANSCRIPT")
		public NString RXmlTranscript;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
