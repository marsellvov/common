package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbSubsLeaveByEmpl {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pSlreCode,NDate pBeginDate,NDate pEndDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(SubsLeaveByEmplRecRow recOne,SubsLeaveByEmplRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, SubsLeaveByEmplRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, SubsLeaveByEmplRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pSlreCode,NDate pBeginDate,NDate pEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pSlreCode,NDate pBeginDate,NDate pEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pSlreCode,NDate pBeginDate,NDate pEndDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pSlreCode,NDate pBeginDate,NDate pEndDate,NString pInstCode,NString pMediCode,NString pComment,NNumber pDaysToPay,NNumber pDaysPaid,NString pUserId,NString pDataOrigin,NString pMedpCode,NNumber pDaysNotSubsidized,NString pFolio,NString pExtension,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_INST_CODE", pInstCode);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DAYS_TO_PAY", pDaysToPay);
			cmd.addParameter("@P_DAYS_PAID", pDaysPaid);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MEDP_CODE", pMedpCode);
			cmd.addParameter("@P_DAYS_NOT_SUBSIDIZED", pDaysNotSubsidized);
			cmd.addParameter("@P_FOLIO", pFolio);
			cmd.addParameter("@P_EXTENSION", pExtension);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pCreateToclob(NNumber pPidm,NString pSlreCode,NDate pBeginDate,NDate pEndDate,NString pInstCode,NString pMediCode,NClob pComment,NNumber pDaysToPay,NNumber pDaysPaid,NString pUserId,NString pDataOrigin,NString pMedpCode,NNumber pDaysNotSubsidized,NString pFolio,NString pExtension,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.P_CREATE_TOCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_INST_CODE", pInstCode);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DAYS_TO_PAY", pDaysToPay);
			cmd.addParameter("@P_DAYS_PAID", pDaysPaid);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MEDP_CODE", pMedpCode);
			cmd.addParameter("@P_DAYS_NOT_SUBSIDIZED", pDaysNotSubsidized);
			cmd.addParameter("@P_FOLIO", pFolio);
			cmd.addParameter("@P_EXTENSION", pExtension);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pSlreCode,NDate pBeginDate,NDate pEndDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pSlreCode,NDate pBeginDate,NDate pEndDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pSlreCode,NDate pBeginDate,NDate pEndDate,NString pInstCode,NString pMediCode,NString pComment,NNumber pDaysToPay,NNumber pDaysPaid,NString pUserId,NString pDataOrigin,NString pMedpCode,NNumber pDaysNotSubsidized,NString pFolio,NString pExtension,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_INST_CODE", pInstCode);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DAYS_TO_PAY", pDaysToPay);
			cmd.addParameter("@P_DAYS_PAID", pDaysPaid);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MEDP_CODE", pMedpCode);
			cmd.addParameter("@P_DAYS_NOT_SUBSIDIZED", pDaysNotSubsidized);
			cmd.addParameter("@P_FOLIO", pFolio);
			cmd.addParameter("@P_EXTENSION", pExtension);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateToclob(NNumber pPidm,NString pSlreCode,NDate pBeginDate,NDate pEndDate,NString pInstCode,NString pMediCode,NClob pComment,NNumber pDaysToPay,NNumber pDaysPaid,NString pUserId,NString pDataOrigin,NString pMedpCode,NNumber pDaysNotSubsidized,NString pFolio,NString pExtension,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SUBS_LEAVE_BY_EMPL.P_UPDATE_TOCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_INST_CODE", pInstCode);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DAYS_TO_PAY", pDaysToPay);
			cmd.addParameter("@P_DAYS_PAID", pDaysPaid);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_MEDP_CODE", pMedpCode);
			cmd.addParameter("@P_DAYS_NOT_SUBSIDIZED", pDaysNotSubsidized);
			cmd.addParameter("@P_FOLIO", pFolio);
			cmd.addParameter("@P_EXTENSION", pExtension);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="SubsLeaveByEmplRecRow", dataSourceName="SUBS_LEAVE_BY_EMPL_REC", needsInitialization=true)
	public static class SubsLeaveByEmplRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SLRE_CODE")
		public NString RSlreCode;
		@DbRecordField(dataSourceName="R_BEGIN_DATE")
		public NDate RBeginDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_INST_CODE")
		public NString RInstCode;
		@DbRecordField(dataSourceName="R_MEDI_CODE")
		public NString RMediCode;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_DAYS_TO_PAY")
		public NNumber RDaysToPay;
		@DbRecordField(dataSourceName="R_DAYS_PAID")
		public NNumber RDaysPaid;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_MEDP_CODE")
		public NString RMedpCode;
		@DbRecordField(dataSourceName="R_DAYS_NOT_SUBSIDIZED")
		public NNumber RDaysNotSubsidized;
		@DbRecordField(dataSourceName="R_FOLIO")
		public NString RFolio;
		@DbRecordField(dataSourceName="R_EXTENSION")
		public NString RExtension;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
