package net.hedtech.general.common.dbservices;

import static morphis.foundations.core.types.Types.*;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbPcolDegree {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PcolDegreeRecRow recOne,PcolDegreeRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PcolDegreeRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PcolDegreeRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		//MORPHIS TODO: Return type from DataCursor to Cursor
		public static Cursor fQueryAll(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pSbgiCode,NString pDegcCode,Ref<NNumber> pDegrSeqNoInout,NDate pAttendFrom,NDate pAttendTo,NNumber pHoursTransferred,NNumber pGpaTransferred,NDate pDegcDate,NString pDegcYear,NString pCollCode,NString pHonrCode,NString pTermDegree,NString pEgolCode,NString pPrimaryInd,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO_INOUT", pDegrSeqNoInout, true);
			cmd.addParameter("@P_ATTEND_FROM", pAttendFrom);
			cmd.addParameter("@P_ATTEND_TO", pAttendTo);
			cmd.addParameter("@P_HOURS_TRANSFERRED", pHoursTransferred);
			cmd.addParameter("@P_GPA_TRANSFERRED", pGpaTransferred);
			cmd.addParameter("@P_DEGC_DATE", pDegcDate);
			cmd.addParameter("@P_DEGC_YEAR", pDegcYear);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_HONR_CODE", pHonrCode);
			cmd.addParameter("@P_TERM_DEGREE", pTermDegree);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pDegrSeqNoInout.val = cmd.getParameterValue("@P_DEGR_SEQ_NO_INOUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NDate pAttendFrom,NDate pAttendTo,NNumber pHoursTransferred,NNumber pGpaTransferred,NDate pDegcDate,NString pDegcYear,NString pCollCode,NString pHonrCode,NString pTermDegree,NString pEgolCode,NString pPrimaryInd,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_DEGREE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_ATTEND_FROM", pAttendFrom);
			cmd.addParameter("@P_ATTEND_TO", pAttendTo);
			cmd.addParameter("@P_HOURS_TRANSFERRED", pHoursTransferred);
			cmd.addParameter("@P_GPA_TRANSFERRED", pGpaTransferred);
			cmd.addParameter("@P_DEGC_DATE", pDegcDate);
			cmd.addParameter("@P_DEGC_YEAR", pDegcYear);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_HONR_CODE", pHonrCode);
			cmd.addParameter("@P_TERM_DEGREE", pTermDegree);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	//MORPHIS TODO: Return type from DataCursor to Cursor
	@DbRecordType(id="PcolDegreeRecRow", dataSourceName="PCOL_DEGREE_REC")
	public static class PcolDegreeRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SBGI_CODE")
		public NString RSbgiCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_DEGR_SEQ_NO")
		public NNumber RDegrSeqNo;
		@DbRecordField(dataSourceName="R_ATTEND_FROM")
		public NDate RAttendFrom;
		@DbRecordField(dataSourceName="R_ATTEND_TO")
		public NDate RAttendTo;
		@DbRecordField(dataSourceName="R_HOURS_TRANSFERRED")
		public NNumber RHoursTransferred;
		@DbRecordField(dataSourceName="R_GPA_TRANSFERRED")
		public NNumber RGpaTransferred;
		@DbRecordField(dataSourceName="R_DEGC_DATE")
		public NDate RDegcDate;
		@DbRecordField(dataSourceName="R_DEGC_YEAR")
		public NString RDegcYear;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_HONR_CODE")
		public NString RHonrCode;
		@DbRecordField(dataSourceName="R_TERM_DEGREE")
		public NString RTermDegree;
		@DbRecordField(dataSourceName="R_EGOL_CODE")
		public NString REgolCode;
		@DbRecordField(dataSourceName="R_PRIMARY_IND")
		public NString RPrimaryInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public PcolDegreeRecRow(Row row){
			RPidm = toNumber(row.getObject(1));
			RSbgiCode = toStr(row.getObject(2));
			RDegcCode = toStr(row.getObject(3));
			RDegrSeqNo = toNumber(row.getObject(4));
			RAttendFrom = toDate(row.getObject(5));
			RAttendTo = toDate(row.getObject(6));
			RHoursTransferred = toNumber(row.getObject(7));
			RGpaTransferred = toNumber(row.getObject(8));
			RDegcDate = toDate(row.getObject(9));
			RDegcYear = toStr(row.getObject(10));
			RCollCode = toStr(row.getObject(11));
			RHonrCode = toStr(row.getObject(12));
			RTermDegree = toStr(row.getObject(13));
			REgolCode = toStr(row.getObject(14));
			RPrimaryInd = toStr(row.getObject(15));
			RDataOrigin = toStr(row.getObject(16));
			RUserId = toStr(row.getObject(17));
			RInternalRecordId = toStr(row.getObject(18));
			
		}
	}

	
	
}
