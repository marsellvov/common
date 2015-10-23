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

public class PbEffcertEcls {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPtrecpdId,NString pEclsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EffcertEclsRecRow recOne,EffcertEclsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EffcertEclsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EffcertEclsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NNumber pPtrecpdId) {

			return fQueryAll(pPtrecpdId,NString.getNull());

		}
		
		public static Cursor fQueryAll(NNumber pPtrecpdId,NString pEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryById(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.F_QUERY_BY_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPtrecpdId,NString pEclsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPtrecpdId,NString pEclsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPtrecpdId,NString pEclsCode,NString pUserId,NString pDataOrigin,Ref<NNumber> pIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPtrecpdId,NString pEclsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPtrecpdId,NString pEclsCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_ECLS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
	
	
	@DbRecordType(id="EffcertEclsRecRow", dataSourceName="EFFCERT_ECLS_REC")
	public static class EffcertEclsRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_PTRECPD_ID")
		public NNumber RPtrecpdId;
		@DbRecordField(dataSourceName="R_ECLS_CODE")
		public NString REclsCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		public EffcertEclsRecRow() {
			super();
			// TODO Auto-generated constructor stub
		}
		public EffcertEclsRecRow(Row eclsCurResults) {
			super();
			RId = toNumber(eclsCurResults.getObject(1));
			RPtrecpdId = toNumber(eclsCurResults.getObject(2));
			REclsCode = toStr(eclsCurResults.getObject(3));
			RUserId = toStr(eclsCurResults.getObject(4));
			RDataOrigin = toStr(eclsCurResults.getObject(5));
			RInternalRecordId = toStr(eclsCurResults.getObject(6));
		}
		
		
	}

	
	
}
