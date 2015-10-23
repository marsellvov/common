package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FpEncumbrance {
		public static NString fFgbencpExists(NString pNum,NNumber pItem,NNumber pSeqNum,NString pFsyr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_ENCUMBRANCE.F_FGBENCP_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_FSYR", pFsyr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetItemDescription(NString pDocNum,NNumber pItem,NString pType,NString pSourceInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_ENCUMBRANCE.F_GET_ITEM_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_SOURCE_IND", pSourceInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCancelChange(NString pNum,NString pDocChangeNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_ENCUMBRANCE.P_CANCEL_CHANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_DOC_CHANGE_NUM", pDocChangeNum);
				
			cmd.execute();


		}
		
		public static void pComplete(NString pNum,NString pCompleteRequested,NString pUserId,NString pRowid,Ref<NString> pSuccessMsgOut,Ref<NString> pWarnMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_ENCUMBRANCE.P_COMPLETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_COMPLETE_REQUESTED", pCompleteRequested);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_WARN_MSG_OUT", NString.class);
				
			cmd.execute();
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pWarnMsgOut.val = cmd.getParameterValue("@P_WARN_MSG_OUT", NString.class);


		}
		
		public static void pDeleteEncumbrance(NString pNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_ENCUMBRANCE.P_DELETE_ENCUMBRANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NString pNum,NString pEvent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_ENCUMBRANCE.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_EVENT", pEvent);
				
			cmd.execute();


		}
		
		public static void pValidateDetail(NString pNum,NString pUserId,NString pDistTotal,FbEncumbranceHeader.EncumbranceHeaderRecRow pHeaderRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_ENCUMBRANCE.P_VALIDATE_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DIST_TOTAL", pDistTotal);
			cmd.addParameter(DbTypes.createStructType("P_HEADER_REC", pHeaderRec, FbEncumbranceHeader.EncumbranceHeaderRecRow.class ));
				
			cmd.execute();


		}
		
	
	
	
}
