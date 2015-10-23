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

public class PbEffcertPayroll {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPtrecpdId,NString pPictCode,NNumber pStartYear,NNumber pStartPayno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_START_YEAR", pStartYear);
			cmd.addParameter("@P_START_PAYNO", pStartPayno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EffcertPayrollRecRow recOne,EffcertPayrollRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EffcertPayrollRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EffcertPayrollRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NNumber pPtrecpdId) {

			return fQueryAll(pPtrecpdId,NString.getNull());

		}
		
		public static Cursor fQueryAll(NNumber pPtrecpdId,NString pPictCode) {

			return fQueryAll(pPtrecpdId,pPictCode, NNumber.getNull());

		}
		
		public static Cursor fQueryAll(NNumber pPtrecpdId,NString pPictCode,NNumber pStartYear) {

			return fQueryAll(pPtrecpdId,pPictCode,pStartYear, NNumber.getNull());

		}
		
		public static Cursor fQueryAll(NNumber pPtrecpdId,NString pPictCode,NNumber pStartYear,NNumber pStartPayno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_START_YEAR", pStartYear);
			cmd.addParameter("@P_START_PAYNO", pStartPayno);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryById(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.F_QUERY_BY_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPtrecpdId,NString pPictCode,NNumber pStartYear,NNumber pStartPayno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_START_YEAR", pStartYear);
			cmd.addParameter("@P_START_PAYNO", pStartPayno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPtrecpdId,NString pPictCode,NNumber pStartYear,NNumber pStartPayno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_START_YEAR", pStartYear);
			cmd.addParameter("@P_START_PAYNO", pStartPayno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPtrecpdId,NString pPictCode,NNumber pStartYear,NNumber pStartPayno,NNumber pEndYear,NNumber pEndPayno,NString pUserId,NString pDataOrigin,Ref<NNumber> pIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_START_YEAR", pStartYear);
			cmd.addParameter("@P_START_PAYNO", pStartPayno);
			cmd.addParameter("@P_END_YEAR", pEndYear);
			cmd.addParameter("@P_END_PAYNO", pEndPayno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPtrecpdId,NString pPictCode,NNumber pStartYear,NNumber pStartPayno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_START_YEAR", pStartYear);
			cmd.addParameter("@P_START_PAYNO", pStartPayno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPtrecpdId,NString pPictCode,NNumber pStartYear,NNumber pStartPayno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_START_YEAR", pStartYear);
			cmd.addParameter("@P_START_PAYNO", pStartPayno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPtrecpdId,NString pPictCode,NNumber pStartYear,NNumber pStartPayno,NNumber pEndYear,NNumber pEndPayno,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PAYROLL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PTRECPD_ID", pPtrecpdId);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_START_YEAR", pStartYear);
			cmd.addParameter("@P_START_PAYNO", pStartPayno);
			cmd.addParameter("@P_END_YEAR", pEndYear);
			cmd.addParameter("@P_END_PAYNO", pEndPayno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EffcertPayrollRecRow", dataSourceName="EFFCERT_PAYROLL_REC")
	public static class EffcertPayrollRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_PTRECPD_ID")
		public NNumber RPtrecpdId;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_START_YEAR")
		public NNumber RStartYear;
		@DbRecordField(dataSourceName="R_START_PAYNO")
		public NNumber RStartPayno;
		@DbRecordField(dataSourceName="R_END_YEAR")
		public NNumber REndYear;
		@DbRecordField(dataSourceName="R_END_PAYNO")
		public NNumber REndPayno;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		public EffcertPayrollRecRow() {
			super();
			// TODO Auto-generated constructor stub
		}
		public EffcertPayrollRecRow(Row payCurResults) {
			super();
			RId = toNumber(payCurResults.getObject(1));
			RPtrecpdId = toNumber(payCurResults.getObject(2));
			RPictCode = toStr(payCurResults.getObject(3));
			RStartYear = toNumber(payCurResults.getObject(4));
			RStartPayno = toNumber(payCurResults.getObject(5));
			REndYear = toNumber(payCurResults.getObject(6));
			REndPayno = toNumber(payCurResults.getObject(7));
			RUserId = toStr(payCurResults.getObject(8));
			RDataOrigin = toStr(payCurResults.getObject(9));
			RInternalRecordId = toStr(payCurResults.getObject(10));
		}
		
		
	}

	
	
}
