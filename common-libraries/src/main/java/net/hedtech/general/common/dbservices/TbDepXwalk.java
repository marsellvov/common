package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbDepXwalk {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pDtypCode,NString pBaseCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(DepXwalkRecRow recOne,DepXwalkRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, DepXwalkRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, DepXwalkRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pDtypCode,NString pBaseCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pDtypCode,NString pBaseCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pDtypCode,NString pBaseCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pDtypCode,NString pBaseCode,NString pDepositCode,NString pPaymentCode,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
			cmd.addParameter("@P_DEPOSIT_CODE", pDepositCode);
			cmd.addParameter("@P_PAYMENT_CODE", pPaymentCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pDtypCode,NString pBaseCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pGetCodes(NString pDtypCode,NString pBaseCode,Ref<NString> pDepositCodeOut,Ref<NString> pPaymentCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.P_GET_CODES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
			cmd.addParameter("@P_DEPOSIT_CODE_OUT", NString.class);
			cmd.addParameter("@P_PAYMENT_CODE_OUT", NString.class);
				
			cmd.execute();
			pDepositCodeOut.val = cmd.getParameterValue("@P_DEPOSIT_CODE_OUT", NString.class);
			pPaymentCodeOut.val = cmd.getParameterValue("@P_PAYMENT_CODE_OUT", NString.class);


		}
		
		public static void pLock(NString pDtypCode,NString pBaseCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pDtypCode,NString pBaseCode,NString pDepositCode,NString pPaymentCode,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
			cmd.addParameter("@P_DEPOSIT_CODE", pDepositCode);
			cmd.addParameter("@P_PAYMENT_CODE", pPaymentCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="DepXwalkRecRow", dataSourceName="DEP_XWALK_REC")
	public static class DepXwalkRecRow
	{
		@DbRecordField(dataSourceName="R_DTYP_CODE")
		public NString RDtypCode;
		@DbRecordField(dataSourceName="R_BASE_CODE")
		public NString RBaseCode;
		@DbRecordField(dataSourceName="R_DEPOSIT_CODE")
		public NString RDepositCode;
		@DbRecordField(dataSourceName="R_PAYMENT_CODE")
		public NString RPaymentCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_SURROGATE_ID")
		public NNumber RSurrogateId;
		@DbRecordField(dataSourceName="R_VERSION")
		public NNumber RVersion;
		@DbRecordField(dataSourceName="R_VPDI_CODE")
		public NString RVpdiCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
