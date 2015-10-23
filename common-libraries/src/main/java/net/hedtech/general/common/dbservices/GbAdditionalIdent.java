package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;


public class GbAdditionalIdent {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pAdditionalId,NString pAdidCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AdditionalIdentRecRow recOne,AdditionalIdentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AdditionalIdentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AdditionalIdentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		//JM (1/6/2015) Change return type to Cursor
		public static Cursor fQueryAll(NNumber pPidm,NString pAdditionalId,NString pAdidCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pAdditionalId,NString pAdidCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pAdditionalId,NString pAdidCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pAdditionalId,NString pAdidCode,NString pUserId,NString pDataOrigin,Ref<byte[]> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


		}
		
		public static void pDelete(NNumber pPidm,NString pAdditionalId,NString pAdidCode,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pAdditionalId,NString pAdidCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pAdditionalId,NString pAdidCode,NString pUserId,NString pDataOrigin,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDITIONAL_IDENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AdditionalIdentRecRow", dataSourceName="ADDITIONAL_IDENT_REC")
	public static class AdditionalIdentRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_ADDITIONAL_ID")
		public NString RAdditionalId;
		@DbRecordField(dataSourceName="R_ADID_CODE")
		public NString RAdidCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public AdditionalIdentRecRow(){
			super();
		}
		
		public AdditionalIdentRecRow(Row lvAddidRefResults)
		{
			super();
			RPidm = toNumber(lvAddidRefResults.getObject(1));
			RAdditionalId = toStr(lvAddidRefResults.getObject(2));
			RAdidCode = toStr(lvAddidRefResults.getObject(3));
			RUserId = toStr(lvAddidRefResults.getObject(4));
			RDataOrigin = toStr(lvAddidRefResults.getObject(5));
			RInternalRecordId = toStr(lvAddidRefResults.getObject(6));
			
		}
	}

	
	
}
