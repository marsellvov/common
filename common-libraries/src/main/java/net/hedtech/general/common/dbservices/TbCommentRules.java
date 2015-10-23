package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbCommentRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pForm,NNumber pSeqNumber,NString pOrigCode,NString pText,NString pUser,NString pCommentCode,NString pTerm,NString pRestrictUpdateInd,NString pPurgeInd,NDate pEnddate,NString pComment,NString pCreatedBy,NDate pCreatedDate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FORM", pForm);
			cmd.addParameter("@P_SEQ_NUMBER", pSeqNumber);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_COMMENT_CODE", pCommentCode);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_RESTRICT_UPDATE_IND", pRestrictUpdateInd);
			cmd.addParameter("@P_PURGE_IND", pPurgeInd);
			cmd.addParameter("@P_ENDDATE", pEnddate);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_CREATED_BY", pCreatedBy);
			cmd.addParameter("@P_CREATED_DATE", pCreatedDate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pForm,NNumber pSeqNumber,NString pOrigCode,NString pText,NString pUser,NString pCommentCode,NString pTerm,NString pRestrictUpdateInd,NString pPurgeInd,NDate pEnddate,NString pComment,NString pCreatedBy,NDate pCreatedDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FORM", pForm);
			cmd.addParameter("@P_SEQ_NUMBER", pSeqNumber);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_COMMENT_CODE", pCommentCode);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_RESTRICT_UPDATE_IND", pRestrictUpdateInd);
			cmd.addParameter("@P_PURGE_IND", pPurgeInd);
			cmd.addParameter("@P_ENDDATE", pEnddate);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_CREATED_BY", pCreatedBy);
			cmd.addParameter("@P_CREATED_DATE", pCreatedDate);
				
			cmd.execute();


		}
		
	
	
	
}
