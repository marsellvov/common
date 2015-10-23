package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.Eokwtow.TParampairRow;
import net.hedtech.general.common.dbservices.GbTelephone.TelephoneRecRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokepaf {
		public static NString fApprActionAllowedInd(NString pUserRole,NString pSuperuserInd,NNumber pTransNo,NString pTransStatusInd,NString pActionInd,NString pQueueStatusInd,NString pApprActionInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_APPR_ACTION_ALLOWED_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER_ROLE", pUserRole);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_TRANS_STATUS_IND", pTransStatusInd);
			cmd.addParameter("@P_ACTION_IND", pActionInd);
			cmd.addParameter("@P_QUEUE_STATUS_IND", pQueueStatusInd);
			cmd.addParameter("@P_APPR_ACTION_IND", pApprActionInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCompareIdenRec(NNumber pPidm,NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_COMPARE_IDEN_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaEditApprover(NString pUser,NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_EA_EDIT_APPROVER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaEditApprover(NString pUserId,NString pProxyForId,NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_EA_EDIT_APPROVER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_FOR_ID", pProxyForId);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaEditOriginator(NString pUser,NNumber pTransNo) {
			
			return fEaEditOriginator(pUser,pTransNo,NString.getNull());
		}
		
		public static NString fEaEditOriginator(NString pUser,NNumber pTransNo,NString pSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_EA_EDIT_ORIGINATOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_SOURCE", pSource);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaEditSuperuser(NString pUser) {

			return fEaEditSuperuser(pUser,NNumber.getNull());

		}

		public static NString fEaEditSuperuser(NString pUser,NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_EA_EDIT_SUPERUSER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaEditSuperuser(NString pUserId,NString pProxyForId,NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_EA_EDIT_SUPERUSER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_FOR_ID", pProxyForId);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaMaxLevelWithManyRec(NNumber parTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_EA_MAX_LEVEL_WITH_MANY_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaQueueStatPending(NNumber parLevelNo,NNumber parTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_EA_QUEUE_STAT_PENDING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAR_LEVEL_NO", parLevelNo);
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEaQueueStatus(NNumber parTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_EA_QUEUE_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormExistInAcat(NString pAcatCode,NString pFormName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_FORM_EXIST_IN_ACAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_FORM_NAME", pFormName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAptyCode(NString pAcatCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_APTY_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGorpracRace(NNumber pPidm,NString pAptyCode,Ref<RaceArrayTypeRow> pRaceArray) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_GORPRAC_RACE", DbManager.getDataBaseFactory());
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
			cmd.addParameter(DbTypes.getCollectionType("P_RACE_ARRAY", pRaceArray.val, RaceArrayTypeRow.class, false)); 
			// cmd.addParameter(DbTypes.getTableType("P_RACE_ARRAY", "", pRaceArray.val, object.class , true));
				
			cmd.execute();
			// pRaceArray.val = cmd.getTableParameterValue("@P_RACE_ARRAY", object.class);
			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetNobtranSeqNo() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_NOBTRAN_SEQ_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetNorcmntForJhis(NNumber pTransactionNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_NORCMNT_FOR_JHIS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANSACTION_NO", pTransactionNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetNortranValue(NNumber pTransNo,NString pAufd,NString pApty) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_NORTRAN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_AUFD", pAufd);
			cmd.addParameter("@P_APTY", pApty);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetNtralvlLevelNo(NString pAlvlCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_NTRALVL_LEVEL_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ALVL_CODE", pAlvlCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetPracFieldName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_PRAC_FIELD_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSpridenId(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_SPRIDEN_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static TelephoneRecRow fGetSprteleRec(NNumber pPidm,NString pTeleCode,NNumber pSeqno,NString pAtypCode,NNumber pAddrSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_SPRTELE_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(TelephoneRecRow.class));
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ADDR_SEQNO", pAddrSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(TelephoneRecRow.class);

		}
		
		public static NString fGetSprteleRowid(NNumber pPidm,NString pTeleCode,NNumber pTeleSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_SPRTELE_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_TELE_SEQNO", pTeleSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetTransEffDate(NNumber pTransactionNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_GET_TRANS_EFF_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_TRANSACTION_NO", pTransactionNo);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NBool fIsRaceField(NString pFieldName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_IS_RACE_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_FIELD_NAME", pFieldName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fNameSearch(NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_NAME_SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fOpenAufdRaceFieldRc(NString pAptyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_OPEN_AUFD_RACE_FIELD_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fOrigActionAllowedInd(NString pUserId,NString pProxyForId,NString pSuperuserInd,NNumber pTransNo,NString pTransStatusInd,NString pOrigActionInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_ORIG_ACTION_ALLOWED_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_FOR_ID", pProxyForId);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_TRANS_STATUS_IND", pTransStatusInd);
			cmd.addParameter("@P_ORIG_ACTION_IND", pOrigActionInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NInteger fRaceFieldSeqNo(NString pFieldName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_RACE_FIELD_SEQ_NO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@P_FIELD_NAME", pFieldName);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fRoutingActionInd(NString pUserId,NString pProxyForId,NString pUserRole,NString pSuperuserInd,NNumber pTransNo,NString pTransStatusInd,NString pQueueStatusDelimString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_ROUTING_ACTION_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_FOR_ID", pProxyForId);
			cmd.addParameter("@P_USER_ROLE", pUserRole);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_TRANS_STATUS_IND", pTransStatusInd);
			cmd.addParameter("@P_QUEUE_STATUS_DELIM_STRING", pQueueStatusDelimString);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static RoutingRectypeRow fRoutingRec(NString pUserId,NString pProxyForId,NString pUserRole,NString pSuperuserInd,NNumber pTransNo,NString pTransStatusInd,NString pQueueStatusDelimString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_ROUTING_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(RoutingRectypeRow.class));
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_FOR_ID", pProxyForId);
			cmd.addParameter("@P_USER_ROLE", pUserRole);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_TRANS_STATUS_IND", pTransStatusInd);
			cmd.addParameter("@P_QUEUE_STATUS_DELIM_STRING", pQueueStatusDelimString);
				
			cmd.execute();

			return cmd.getReturnValue(RoutingRectypeRow.class);

		}
		
		public static NString fSpridenIdInMinSeqno(NString pAcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.F_SPRIDEN_ID_IN_MIN_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAutoApprovalNorrout(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_AUTO_APPROVAL_NORROUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pAutoInsertNorrout(NNumber pTransNo,NString pAcatCode,Ref<NString> pErrorType,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_AUTO_INSERT_NORROUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_ERROR_TYPE", pErrorType, true);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg, true);
				
			cmd.execute();
			pErrorType.val = cmd.getParameterValue("@P_ERROR_TYPE", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pAutoStatusNobtran(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_AUTO_STATUS_NOBTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pCheckNtrinst(Ref<NString> pMsgType,Ref<NString> pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_CHECK_NTRINST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MSG_TYPE", NString.class);
			cmd.addParameter("@P_MSG", NString.class);
				
			cmd.execute();
			pMsgType.val = cmd.getParameterValue("@P_MSG_TYPE", NString.class);
			pMsg.val = cmd.getParameterValue("@P_MSG", NString.class);


		}
		
		public static void pChkCmName(NString pSource,NNumber pTransNo,NString pApty,Ref<NString> pMsg,Ref<NString> pMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_CHK_CM_NAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_MSG", NString.class);
			cmd.addParameter("@P_MSG_TYPE", NString.class);
				
			cmd.execute();
			pMsg.val = cmd.getParameterValue("@P_MSG", NString.class);
			pMsgType.val = cmd.getParameterValue("@P_MSG_TYPE", NString.class);


		}
		
		public static void pDeleteTransaction(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_DELETE_TRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pEaApprovalAction(NString parUserId,NNumber parTransNo,NString parApproverAction,NNumber parLevelNo,NString parQueueStatus,Ref<NString> parTransStatus,Ref<NString> errorMsg,NString parActionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_EA_APPROVAL_ACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_USER_ID", parUserId);
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
			cmd.addParameter("@PAR_APPROVER_ACTION", parApproverAction);
			cmd.addParameter("@PAR_LEVEL_NO", parLevelNo);
			cmd.addParameter("@PAR_QUEUE_STATUS", parQueueStatus);
			cmd.addParameter("@PAR_TRANS_STATUS", parTransStatus, true);
			cmd.addParameter("@ERROR_MSG", NString.class);
			cmd.addParameter("@PAR_ACTION_ID", parActionId);
				
			cmd.execute();
			parTransStatus.val = cmd.getParameterValue("@PAR_TRANS_STATUS", NString.class);
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pEaSendMessage(NString parQueueStatusInd,NNumber parTransNo,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_EA_SEND_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_QUEUE_STATUS_IND", parQueueStatusInd);
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
			cmd.addParameter("@ERROR_MSG", NString.class);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pEaSendMessageOriginator(NNumber parTransNo,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_EA_SEND_MESSAGE_ORIGINATOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
			cmd.addParameter("@ERROR_MSG", NString.class);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pEditEaApproverAction(NString parActionInd,NNumber parTransNo,NString holdQueueStat,NString holdParQueue,NString parTransStat,NString parQueueStat,Ref<NString> parApprAction,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_EDIT_EA_APPROVER_ACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ACTION_IND", parActionInd);
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
			cmd.addParameter("@HOLD_QUEUE_STAT", holdQueueStat);
			cmd.addParameter("@HOLD_PAR_QUEUE", holdParQueue);
			cmd.addParameter("@PAR_TRANS_STAT", parTransStat);
			cmd.addParameter("@PAR_QUEUE_STAT", parQueueStat);
			cmd.addParameter("@PAR_APPR_ACTION", parApprAction, true);
			cmd.addParameter("@ERROR_MSG", NString.class);
				
			cmd.execute();
			parApprAction.val = cmd.getParameterValue("@PAR_APPR_ACTION", NString.class);
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pEditUser(NString pUserId,NString pAlvlCode,Ref<NString> pMsgType,Ref<NString> pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_EDIT_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ALVL_CODE", pAlvlCode);
			cmd.addParameter("@P_MSG_TYPE", NString.class);
			cmd.addParameter("@P_MSG", NString.class);
				
			cmd.execute();
			pMsgType.val = cmd.getParameterValue("@P_MSG_TYPE", NString.class);
			pMsg.val = cmd.getParameterValue("@P_MSG", NString.class);


		}
		
		public static void pFinishEpaf(NNumber pTransNo,NNumber pPidm,NDate pEffDate,NString pAcat,Ref<NString> pErrorType,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_FINISH_EPAF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_ERROR_TYPE", pErrorType, true);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg, true);
				
			cmd.execute();
			pErrorType.val = cmd.getParameterValue("@P_ERROR_TYPE", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pGetAddrPriority(NNumber pTransNo,Ref<NString> pApty,Ref<NString> pAtyp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_GET_ADDR_PRIORITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY", NString.class);
			cmd.addParameter("@P_ATYP", NString.class);
				
			cmd.execute();
			pApty.val = cmd.getParameterValue("@P_APTY", NString.class);
			pAtyp.val = cmd.getParameterValue("@P_ATYP", NString.class);


		}
		
		public static void pGetCityStateNation(NString pZip,Ref<NString> pCityOut,Ref<NString> pStateOut,Ref<NString> pCntyOut,Ref<NString> pNatnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_GET_CITY_STATE_NATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_CITY_OUT", pCityOut, true);
			cmd.addParameter("@P_STATE_OUT", pStateOut, true);
			cmd.addParameter("@P_CNTY_OUT", pCntyOut, true);
			cmd.addParameter("@P_NATN_OUT", pNatnOut, true);
				
			cmd.execute();
			pCityOut.val = cmd.getParameterValue("@P_CITY_OUT", NString.class);
			pStateOut.val = cmd.getParameterValue("@P_STATE_OUT", NString.class);
			pCntyOut.val = cmd.getParameterValue("@P_CNTY_OUT", NString.class);
			pNatnOut.val = cmd.getParameterValue("@P_NATN_OUT", NString.class);


		}
		
		public static void pGetNewPersonInfo(NNumber pTrans,Ref<NString> pApty,Ref<NString> pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_GET_NEW_PERSON_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS", pTrans);
			cmd.addParameter("@P_APTY", pApty, true);
			cmd.addParameter("@P_ID", pId, true);
				
			cmd.execute();
			pApty.val = cmd.getParameterValue("@P_APTY", NString.class);
			pId.val = cmd.getParameterValue("@P_ID", NString.class);


		}
		
		public static void pGetNtradfvDefaultInfo(NString pField,NString pAcat,NString pApty,NDate pQueryDate,Ref<NString> pDefaultValueOut,Ref<NString> pOverrideIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_GET_NTRADFV_DEFAULT_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FIELD", pField);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
			cmd.addParameter("@P_DEFAULT_VALUE_OUT", NString.class);
			cmd.addParameter("@P_OVERRIDE_IND_OUT", NString.class);
				
			cmd.execute();
			pDefaultValueOut.val = cmd.getParameterValue("@P_DEFAULT_VALUE_OUT", NString.class);
			pOverrideIndOut.val = cmd.getParameterValue("@P_OVERRIDE_IND_OUT", NString.class);


		}
		
		public static void pGetTelePriority(NNumber pTransNo,Ref<NString> pApty,Ref<NString> pTtyp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_GET_TELE_PRIORITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY", NString.class);
			cmd.addParameter("@P_TTYP", NString.class);
				
			cmd.execute();
			pApty.val = cmd.getParameterValue("@P_APTY", NString.class);
			pTtyp.val = cmd.getParameterValue("@P_TTYP", NString.class);


		}
		
		public static void pInitialEditGorprac(NString pAptyCode,Ref<NString> pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_INITIAL_EDIT_GORPRAC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
			cmd.addParameter("@P_MSG", pMsg, true);
				
			cmd.execute();
			pMsg.val = cmd.getParameterValue("@P_MSG", NString.class);


		}
		
		public static void pInitialEditSpbpers(Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_INITIAL_EDIT_SPBPERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pInitialEditSpraddr(Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_INITIAL_EDIT_SPRADDR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pInitialEditSpriden(Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_INITIAL_EDIT_SPRIDEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pInitialEditSprtele(NString parRowid,Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_INITIAL_EDIT_SPRTELE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ROWID", parRowid);
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pInsertNobtran(NNumber pTransNo,NNumber pPidm,NDate pEffectiveDate,NString pAcatCode,NString pTranStatus,NString pUser,NString pComments,Ref<NString> pErrorType,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_INSERT_NOBTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_TRAN_STATUS", pTranStatus);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_ERROR_TYPE", pErrorType, true);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg, true);
				
			cmd.execute();
			pErrorType.val = cmd.getParameterValue("@P_ERROR_TYPE", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pInsertNorrout(NNumber pTransNo,NString pUser,NString pAlvlCode,NNumber pLevelNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_INSERT_NORROUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ALVL_CODE", pAlvlCode);
			cmd.addParameter("@P_LEVEL_NO", pLevelNo);
				
			cmd.execute();


		}
		
		public static void pInsertNortern(NString pPosn,NString pSuff,NNumber pTransNo,NString pAptyCode,NDate pEffectiveDate,NString pEarnCode,NNumber pHrs,NNumber pSpecialRate,NString pShift,NDate pCancelDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_INSERT_NORTERN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_HRS", pHrs);
			cmd.addParameter("@P_SPECIAL_RATE", pSpecialRate);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
				
			cmd.execute();


		}
		
		public static void pInsertNortlbd(NString pPosn,NString pSuff,NNumber pTransNo,NString pAptyCode,NDate pEffectiveDate,NNumber pPercent,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pCtypCode,NString pAcctCodeExternal,NDate pEncOverrideEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_INSERT_NORTLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ACCT_CODE_EXTERNAL", pAcctCodeExternal);
			cmd.addParameter("@P_ENC_OVERRIDE_END_DATE", pEncOverrideEndDate);
				
			cmd.execute();


		}
		
		public static void pInsertNortran(NNumber pTransNo,NString pAptyCode,NString pPosn,NString pSuff,NString pAufmCode,NString pAubkCode,NString pAufdCode,NString pValue,NNumber pDisplaySeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_INSERT_NORTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_APTY_CODE", pAptyCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_AUFM_CODE", pAufmCode);
			cmd.addParameter("@P_AUBK_CODE", pAubkCode);
			cmd.addParameter("@P_AUFD_CODE", pAufdCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_DISPLAY_SEQ_NO", pDisplaySeqNo);
				
			cmd.execute();


		}
		
		public static void pLoadGotcmme(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_LOAD_GOTCMME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pNewPersonCm(NString pSource,NNumber pTransNo,Ref<NNumber> pPidm,Ref<NString> pId,Ref<NString> pMatchInd,Ref<NString> pMsg,Ref<NString> pMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_NEW_PERSON_CM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_PIDM", pPidm, true);
			cmd.addParameter("@P_ID", pId, true);
			cmd.addParameter("@P_MATCH_IND", NString.class);
			cmd.addParameter("@P_MSG", NString.class);
			cmd.addParameter("@P_MSG_TYPE", NString.class);
				
			cmd.execute();
			pPidm.val = cmd.getParameterValue("@P_PIDM", NNumber.class);
			pId.val = cmd.getParameterValue("@P_ID", NString.class);
			pMatchInd.val = cmd.getParameterValue("@P_MATCH_IND", NString.class);
			pMsg.val = cmd.getParameterValue("@P_MSG", NString.class);
			pMsgType.val = cmd.getParameterValue("@P_MSG_TYPE", NString.class);


		}
		
		public static void pOpenApprovalRc(Ref<DataCursor> pApprovalRcInout,NString pUserId,NString pProxyForId,NString pSuperuserInd,NString pTransStatusDelimString,NString pQueueStatusDelimString,NString pSortType,NDate pSubmitFromDate,NDate pSubmitToDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_OPEN_APPROVAL_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPROVAL_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_FOR_ID", pProxyForId);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_TRANS_STATUS_DELIM_STRING", pTransStatusDelimString);
			cmd.addParameter("@P_QUEUE_STATUS_DELIM_STRING", pQueueStatusDelimString);
			cmd.addParameter("@P_SORT_TYPE", pSortType);
			cmd.addParameter("@P_SUBMIT_FROM_DATE", pSubmitFromDate);
			cmd.addParameter("@P_SUBMIT_TO_DATE", pSubmitToDate);
				
			cmd.execute();
			pApprovalRcInout.val = cmd.getParameterValue("@P_APPROVAL_RC_INOUT", DataCursor.class);


		}
		
		public static void pOpenOriginatorRc(Ref<DataCursor> pOriginatorRcInout,NString pUserId,NString pProxyForId,NString pSuperuserInd,NString pTransStatusDelimString,NString pSortType,NDate pSubmitFromDate,NDate pSubmitToDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_OPEN_ORIGINATOR_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ORIGINATOR_RC_INOUT", DataCursor.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_FOR_ID", pProxyForId);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_TRANS_STATUS_DELIM_STRING", pTransStatusDelimString);
			cmd.addParameter("@P_SORT_TYPE", pSortType);
			cmd.addParameter("@P_SUBMIT_FROM_DATE", pSubmitFromDate);
			cmd.addParameter("@P_SUBMIT_TO_DATE", pSubmitToDate);
				
			cmd.execute();
			pOriginatorRcInout.val = cmd.getParameterValue("@P_ORIGINATOR_RC_INOUT", DataCursor.class);


		}
		
		public static void pSendApprovalMsg(NString userId,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_SEND_APPROVAL_MSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ERROR_MSG", NString.class);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pStartEpaf(NNumber pTransNo,NNumber pPidm,NDate pEffDate,NString pAcat,NString pComments,Ref<NString> pErrorType,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_START_EPAF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_ERROR_TYPE", pErrorType, true);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg, true);
				
			cmd.execute();
			pErrorType.val = cmd.getParameterValue("@P_ERROR_TYPE", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pUpdateEaRecords(NNumber pTransNo,NNumber pPidm,NString pAcatCode,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_UPDATE_EA_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACAT_CODE", pAcatCode);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
		public static void pUpdateEaTbls(NNumber pTransNo,NNumber pPidm,NString pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_UPDATE_EA_TBLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();


		}
		
		public static void pUpdateNobtranStatus(NNumber pTransNo,NString stat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_UPDATE_NOBTRAN_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@STAT", stat);
				
			cmd.execute();


		}
		
		public static void pValidateApprActionInd(NString pUserRole,NString pSuperuserInd,NNumber pTransNo,NString pTransStatusInd,NString pActionInd,NString pQueueStatusInd,NString pApprActionInd,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_VALIDATE_APPR_ACTION_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ROLE", pUserRole);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_TRANS_STATUS_IND", pTransStatusInd);
			cmd.addParameter("@P_ACTION_IND", pActionInd);
			cmd.addParameter("@P_QUEUE_STATUS_IND", pQueueStatusInd);
			cmd.addParameter("@P_APPR_ACTION_IND", pApprActionInd);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateOrigActionInd(NString pUserId,NString pProxyForId,NString pSuperuserInd,NNumber pTransNo,NString pTransStatusInd,NString pOrigActionInd,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_VALIDATE_ORIG_ACTION_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_FOR_ID", pProxyForId);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@P_TRANS_STATUS_IND", pTransStatusInd);
			cmd.addParameter("@P_ORIG_ACTION_IND", pOrigActionInd);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateUserRole(NString pUserRole,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_VALIDATE_USER_ROLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ROLE", pUserRole);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pVoidEpaf(NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEPAF.P_VOID_EPAF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FieldRectypeRow", dataSourceName="NOKEPAF.FIELD_RECTYPE")
	public static class FieldRectypeRow
	{
		@DbRecordField(dataSourceName="R_NAME")
		public NString RName;
		@DbRecordField(dataSourceName="R_VALUE")
		public NString RValue;
	}

	
	@DbRecordType(id="RoutingRectypeRow", dataSourceName="ROUTING_RECTYPE")
	public static class RoutingRectypeRow
	{
		@DbRecordField(dataSourceName="R_ACTION_IND")
		public NString RActionInd;
		@DbRecordField(dataSourceName="R_QUEUE_STATUS_IND")
		public NString RQueueStatusInd;
		@DbRecordField(dataSourceName="R_LEVEL_NO")
		public NNumber RLevelNo;
		@DbRecordField(dataSourceName="R_RECIPIENT_USER_ID")
		public NString RRecipientUserId;
		@DbRecordField(dataSourceName="R_ACTION_USER_ID")
		public NString RActionUserId;
	}

	
	@DbTableType(id="RaceArrayTypeRow", dataSourceName="NOKEPAF.RACE_ARRAY_TYPE", indexed=true)
	public static class RaceArrayTypeRow extends Table<FieldRectypeRow> {
		@Override
		protected FieldRectypeRow newValue(){
			return new FieldRectypeRow();
		}
	}
	
}
