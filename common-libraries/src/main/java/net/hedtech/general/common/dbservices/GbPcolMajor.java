package net.hedtech.general.common.dbservices;

import static morphis.foundations.core.types.Types.toDate;
import static morphis.foundations.core.types.Types.toNumber;
import static morphis.foundations.core.types.Types.toStr;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbPcolMajor {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pMajrCodeMajor,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_MAJR_CODE_MAJOR", pMajrCodeMajor);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PcolMajorRecRow recOne,PcolMajorRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PcolMajorRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PcolMajorRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pMajrCodeMajor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_MAJR_CODE_MAJOR", pMajrCodeMajor);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pMajrCodeMajor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_MAJR_CODE_MAJOR", pMajrCodeMajor);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pMajrCodeMajor,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_MAJR_CODE_MAJOR", pMajrCodeMajor);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCopyAll(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NString pDegcCodeNew,NNumber pDegrSeqNo,NNumber pDegrSeqNoNew) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.P_COPY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGC_CODE_NEW", pDegcCodeNew);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_DEGR_SEQ_NO_NEW", pDegrSeqNoNew);
				
			cmd.execute();


		}
		
		public static void pCreate(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pMajrCodeMajor,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_MAJR_CODE_MAJOR", pMajrCodeMajor);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pMajrCodeMajor,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_MAJR_CODE_MAJOR", pMajrCodeMajor);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pMajrCodeMajor,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_MAJR_CODE_MAJOR", pMajrCodeMajor);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pSbgiCode,NString pDegcCode,NNumber pDegrSeqNo,NString pMajrCodeMajor,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PCOL_MAJOR.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_MAJR_CODE_MAJOR", pMajrCodeMajor);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	//MORPHIS TODO: Return type from DataCursor to Cursor
	@DbRecordType(id="PcolMajorRecRow", dataSourceName="PCOL_MAJOR_REC")
	public static class PcolMajorRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SBGI_CODE")
		public NString RSbgiCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_DEGR_SEQ_NO")
		public NNumber RDegrSeqNo;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MAJOR")
		public NString RMajrCodeMajor;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public PcolMajorRecRow(Row row){
			
			RPidm = toNumber(row.getObject(1));
			RSbgiCode = toStr(row.getObject(2));
			RDegcCode = toStr(row.getObject(3));
			RDegrSeqNo = toNumber(row.getObject(4));
			RMajrCodeMajor = toStr(row.getObject(5));
			RDataOrigin = toStr(row.getObject(6));
			RUserId = toStr(row.getObject(7));
			RInternalRecordId = toStr(row.getObject(8));
			
		}
	}

	
	
}
