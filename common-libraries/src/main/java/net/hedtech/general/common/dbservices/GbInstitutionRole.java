package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbInstitutionRole {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRoleGroup,NString pRole,NString pVpdiCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(InstitutionRoleRecRow recOne,InstitutionRoleRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, InstitutionRoleRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, InstitutionRoleRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pRoleGroup,NString pVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pRoleGroup,NString pRole,NString pVpdiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRoleGroup,NString pRole,NString pVpdiCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pRoleGroup,NString pRole,NString pUserId,NString pVpdiCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pRoleGroup,NString pRole,NString pVpdiCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pRoleGroup,NString pRole,NString pVpdiCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pMaintainRoles(NNumber pPidm,NString pRoleGroup,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.P_MAINTAIN_ROLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
		public static void pUpdate(NNumber pPidm,NString pRoleGroup,NString pRole,NString pUserId,NString pVpdiCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INSTITUTION_ROLE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE_GROUP", pRoleGroup);
			cmd.addParameter("@P_ROLE", pRole);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="InstitutionRoleRecRow", dataSourceName="INSTITUTION_ROLE_REC")
	public static class InstitutionRoleRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_ROLE_GROUP")
		public NString RRoleGroup;
		@DbRecordField(dataSourceName="R_ROLE")
		public NString RRole;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_VPDI_CODE")
		public NString RVpdiCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
