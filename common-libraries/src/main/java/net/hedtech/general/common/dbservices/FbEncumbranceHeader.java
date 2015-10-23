package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbEncumbranceHeader {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fDocChangeExists(NString pDocChangeNum,NString pNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.F_DOC_CHANGE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_CHANGE_NUM", pDocChangeNum);
			cmd.addParameter("@P_NUM", pNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSourceInd(NString pNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.F_GET_SOURCE_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUM", pNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EncumbranceHeaderRecRow recOne,EncumbranceHeaderRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EncumbranceHeaderRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EncumbranceHeaderRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_NUM", pNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_NUM", pNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(Ref<NString> pNumInOut,NString pDocChangeNum,NString pUserId,NString pDesc,NString pChangeDesc,NDate pTransDate,NString pDocRefNum,NNumber pDocAmt,NString pType,NString pStatusInd,NString pStatus,NString pEditDeferral,NDate pEstabDate,NNumber pVendorPidm,NString pSourceInd,NString pApprInd,NString pNsfOnOffInd,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM_IN_OUT", pNumInOut, true);
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
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pNumInOut.val = cmd.getParameterValue("@P_NUM_IN_OUT", NString.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pNum,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pNum,NString pDocChangeNum,NString pUserId,NString pDesc,NString pChangeDesc,NDate pTransDate,NString pDocRefNum,NNumber pDocAmt,NString pType,NString pStatusInd,NString pStatus,NString pEditDeferral,NDate pEstabDate,NNumber pVendorPidm,NString pSourceInd,NString pApprInd,NString pNsfOnOffInd,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateInternal(NString pNum,NString pDocChangeNum,NString pChangeDesc,NString pStatusInd,NString pStatus,NString pApprInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_HEADER.P_UPDATE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_DOC_CHANGE_NUM", pDocChangeNum);
			cmd.addParameter("@P_CHANGE_DESC", pChangeDesc);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_APPR_IND", pApprInd);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EncumbranceHeaderRecRow", dataSourceName="ENCUMBRANCE_HEADER_REC")
	public static class EncumbranceHeaderRecRow
	{
		@DbRecordField(dataSourceName="R_NUM")
		public NString RNum;
		@DbRecordField(dataSourceName="R_DOC_CHANGE_NUM")
		public NString RDocChangeNum;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_CHANGE_DESC")
		public NString RChangeDesc;
		@DbRecordField(dataSourceName="R_TRANS_DATE")
		public NDate RTransDate;
		@DbRecordField(dataSourceName="R_DOC_REF_NUM")
		public NString RDocRefNum;
		@DbRecordField(dataSourceName="R_DOC_AMT")
		public NNumber RDocAmt;
		@DbRecordField(dataSourceName="R_TYPE")
		public NString RType;
		@DbRecordField(dataSourceName="R_STATUS_IND")
		public NString RStatusInd;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
		@DbRecordField(dataSourceName="R_PROCESSING_IND")
		public NString RProcessingInd;
		@DbRecordField(dataSourceName="R_EDIT_DEFERRAL")
		public NString REditDeferral;
		@DbRecordField(dataSourceName="R_ESTAB_DATE")
		public NDate REstabDate;
		@DbRecordField(dataSourceName="R_VENDOR_PIDM")
		public NNumber RVendorPidm;
		@DbRecordField(dataSourceName="R_SOURCE_IND")
		public NString RSourceInd;
		@DbRecordField(dataSourceName="R_APPR_IND")
		public NString RApprInd;
		@DbRecordField(dataSourceName="R_NSF_ON_OFF_IND")
		public NString RNsfOnOffInd;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_SOURCE")
		public NString RCreateSource;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
