package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbSectAttsRestriction {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPrimaryKey,NString pTermCode,NString pCrn,NString pRecType,NString pAttsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(SectAttsRestrictionRecRow recOne,SectAttsRestrictionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, SectAttsRestrictionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, SectAttsRestrictionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NString pCrn,NString pRecType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_REC_TYPE", pRecType);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPrimaryKey,NString pTermCode,NString pCrn,NString pRecType,NString pAttsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPrimaryKey,NString pTermCode,NString pCrn,NString pRecType,NString pAttsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCopyRestrictions(NString pFromTerm,NString pFromCrn,NString pToTerm,NString pToCrn,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.P_COPY_RESTRICTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FROM_TERM", pFromTerm);
			cmd.addParameter("@P_FROM_CRN", pFromCrn);
			cmd.addParameter("@P_TO_TERM", pToTerm);
			cmd.addParameter("@P_TO_CRN", pToCrn);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pCreate(NString pTermCode,NString pCrn,NString pRecType,NString pUserId,NString pAttsIeCde,NString pAttsCode,NString pDataOrigin,Ref<NNumber> pPrimaryKeyOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ATTS_IE_CDE", pAttsIeCde);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRIMARY_KEY_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pPrimaryKeyOut.val = cmd.getParameterValue("@P_PRIMARY_KEY_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPrimaryKey,NString pTermCode,NString pCrn,NString pRecType,NString pAttsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPrimaryKey,NString pTermCode,NString pCrn,NString pRecType,NString pAttsCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPrimaryKey,NString pTermCode,NString pCrn,NString pRecType,NString pUserId,NString pAttsIeCde,NString pAttsCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SECT_ATTS_RESTRICTION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ATTS_IE_CDE", pAttsIeCde);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="SectAttsRestrictionRecRow", dataSourceName="SECT_ATTS_RESTRICTION_REC")
	public static class SectAttsRestrictionRecRow
	{
		@DbRecordField(dataSourceName="R_PRIMARY_KEY")
		public NNumber RPrimaryKey;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_REC_TYPE")
		public NString RRecType;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ATTS_IE_CDE")
		public NString RAttsIeCde;
		@DbRecordField(dataSourceName="R_ATTS_CODE")
		public NString RAttsCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
