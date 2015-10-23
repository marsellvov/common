package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFacsecAccess {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pProcCode,NString pRoleCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_ROLE_CDE", pRoleCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FacsecAccessRecRow recOne,FacsecAccessRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FacsecAccessRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FacsecAccessRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pProcCode,NString pRoleCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_ROLE_CDE", pRoleCde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pProcCode,NString pRoleCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_ROLE_CDE", pRoleCde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pProcCode,NString pRoleCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_ROLE_CDE", pRoleCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pProcCode,NString pRoleCde,NString pActiveInd,NString pAllAccessInd,NString pPinControlInd,NString pRelationshipInd,NString pPrimaryInd,NString pAttrTypeCheckInd,NString pUserId,NString pDataOrigin,NString pSysreqInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_ROLE_CDE", pRoleCde);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ALL_ACCESS_IND", pAllAccessInd);
			cmd.addParameter("@P_PIN_CONTROL_IND", pPinControlInd);
			cmd.addParameter("@P_RELATIONSHIP_IND", pRelationshipInd);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_ATTR_TYPE_CHECK_IND", pAttrTypeCheckInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SYSREQ_IND", pSysreqInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pProcCode,NString pRoleCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_ROLE_CDE", pRoleCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pProcCode,NString pRoleCde,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_ROLE_CDE", pRoleCde);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pProcCode,NString pRoleCde,NString pActiveInd,NString pAllAccessInd,NString pPinControlInd,NString pRelationshipInd,NString pPrimaryInd,NString pAttrTypeCheckInd,NString pUserId,NString pDataOrigin,NString pSysreqInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACSEC_ACCESS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROC_CODE", pProcCode);
			cmd.addParameter("@P_ROLE_CDE", pRoleCde);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_ALL_ACCESS_IND", pAllAccessInd);
			cmd.addParameter("@P_PIN_CONTROL_IND", pPinControlInd);
			cmd.addParameter("@P_RELATIONSHIP_IND", pRelationshipInd);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_ATTR_TYPE_CHECK_IND", pAttrTypeCheckInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SYSREQ_IND", pSysreqInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FacsecAccessRecRow", dataSourceName="FACSEC_ACCESS_REC")
	public static class FacsecAccessRecRow
	{
		@DbRecordField(dataSourceName="R_PROC_CODE")
		public NString RProcCode;
		@DbRecordField(dataSourceName="R_ROLE_CDE")
		public NString RRoleCde;
		@DbRecordField(dataSourceName="R_ACTIVE_IND")
		public NString RActiveInd;
		@DbRecordField(dataSourceName="R_ALL_ACCESS_IND")
		public NString RAllAccessInd;
		@DbRecordField(dataSourceName="R_PIN_CONTROL_IND")
		public NString RPinControlInd;
		@DbRecordField(dataSourceName="R_RELATIONSHIP_IND")
		public NString RRelationshipInd;
		@DbRecordField(dataSourceName="R_PRIMARY_IND")
		public NString RPrimaryInd;
		@DbRecordField(dataSourceName="R_ATTR_TYPE_CHECK_IND")
		public NString RAttrTypeCheckInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_SYSREQ_IND")
		public NString RSysreqInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
