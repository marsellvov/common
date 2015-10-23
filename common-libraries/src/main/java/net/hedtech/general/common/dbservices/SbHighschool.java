package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbHighschool {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pSbgiCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(HighschoolRecRow recOne,HighschoolRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, HighschoolRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, HighschoolRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pSbgiCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pSbgiCode,NDate pGraduationDate,NString pGpa,NNumber pClassRank,NNumber pClassSize,NNumber pPercentile,NString pDplmCode,NString pCollPrepInd,NDate pTransRecvDate,NString pAdmrCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_GRADUATION_DATE", pGraduationDate);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_CLASS_RANK", pClassRank);
			cmd.addParameter("@P_CLASS_SIZE", pClassSize);
			cmd.addParameter("@P_PERCENTILE", pPercentile);
			cmd.addParameter("@P_DPLM_CODE", pDplmCode);
			cmd.addParameter("@P_COLL_PREP_IND", pCollPrepInd);
			cmd.addParameter("@P_TRANS_RECV_DATE", pTransRecvDate);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pSbgiCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pSbgiCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pSbgiCode,NDate pGraduationDate,NString pGpa,NNumber pClassRank,NNumber pClassSize,NNumber pPercentile,NString pDplmCode,NString pCollPrepInd,NDate pTransRecvDate,NString pAdmrCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_HIGHSCHOOL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_GRADUATION_DATE", pGraduationDate);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_CLASS_RANK", pClassRank);
			cmd.addParameter("@P_CLASS_SIZE", pClassSize);
			cmd.addParameter("@P_PERCENTILE", pPercentile);
			cmd.addParameter("@P_DPLM_CODE", pDplmCode);
			cmd.addParameter("@P_COLL_PREP_IND", pCollPrepInd);
			cmd.addParameter("@P_TRANS_RECV_DATE", pTransRecvDate);
			cmd.addParameter("@P_ADMR_CODE", pAdmrCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="HighschoolRecRow", dataSourceName="HIGHSCHOOL_REC")
	public static class HighschoolRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SBGI_CODE")
		public NString RSbgiCode;
		@DbRecordField(dataSourceName="R_GRADUATION_DATE")
		public NDate RGraduationDate;
		@DbRecordField(dataSourceName="R_GPA")
		public NString RGpa;
		@DbRecordField(dataSourceName="R_CLASS_RANK")
		public NNumber RClassRank;
		@DbRecordField(dataSourceName="R_CLASS_SIZE")
		public NNumber RClassSize;
		@DbRecordField(dataSourceName="R_PERCENTILE")
		public NNumber RPercentile;
		@DbRecordField(dataSourceName="R_DPLM_CODE")
		public NString RDplmCode;
		@DbRecordField(dataSourceName="R_COLL_PREP_IND")
		public NString RCollPrepInd;
		@DbRecordField(dataSourceName="R_TRANS_RECV_DATE")
		public NDate RTransRecvDate;
		@DbRecordField(dataSourceName="R_ADMR_CODE")
		public NString RAdmrCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
