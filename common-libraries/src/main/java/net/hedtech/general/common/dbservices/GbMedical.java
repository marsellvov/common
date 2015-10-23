package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbMedical {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pMediCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(MedicalRecRow recOne,MedicalRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, MedicalRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, MedicalRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pMediCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pMediCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pMediCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pMediCode,NString pMdeqCode,NString pComment,NString pDisaCode,NString pSpsrCode,NNumber pOnsetAge,NString pDisbInd,NString pUserId,NDate pMediCodeDate,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_MDEQ_CODE", pMdeqCode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DISA_CODE", pDisaCode);
			cmd.addParameter("@P_SPSR_CODE", pSpsrCode);
			cmd.addParameter("@P_ONSET_AGE", pOnsetAge);
			cmd.addParameter("@P_DISB_IND", pDisbInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MEDI_CODE_DATE", pMediCodeDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pMediCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pMediCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pMediCode,NString pMdeqCode,NString pComment,NString pDisaCode,NString pSpsrCode,NNumber pOnsetAge,NString pDisbInd,NString pUserId,NDate pMediCodeDate,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_MEDICAL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MEDI_CODE", pMediCode);
			cmd.addParameter("@P_MDEQ_CODE", pMdeqCode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DISA_CODE", pDisaCode);
			cmd.addParameter("@P_SPSR_CODE", pSpsrCode);
			cmd.addParameter("@P_ONSET_AGE", pOnsetAge);
			cmd.addParameter("@P_DISB_IND", pDisbInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MEDI_CODE_DATE", pMediCodeDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="MedicalRecRow", dataSourceName="MEDICAL_REC")
	public static class MedicalRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_MEDI_CODE")
		public NString RMediCode;
		@DbRecordField(dataSourceName="R_MDEQ_CODE")
		public NString RMdeqCode;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_DISA_CODE")
		public NString RDisaCode;
		@DbRecordField(dataSourceName="R_SPSR_CODE")
		public NString RSpsrCode;
		@DbRecordField(dataSourceName="R_ONSET_AGE")
		public NNumber ROnsetAge;
		@DbRecordField(dataSourceName="R_DISB_IND")
		public NString RDisbInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_MEDI_CODE_DATE")
		public NDate RMediCodeDate;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
