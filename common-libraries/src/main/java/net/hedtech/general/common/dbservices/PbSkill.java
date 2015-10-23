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


public class PbSkill {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pSkilCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(SkillRecRow recOne,SkillRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, SkillRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, SkillRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pSkilCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static Cursor fQueryOne(NNumber pPidm,NString pSkilCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pSkilCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pSkilCode,NString pSklvCode,NString pComments,NDate pStartDate,NDate pEndDate,NDate pLastDate,NString pReadInd,NString pWriteInd,NString pSpeakInd,NString pTransInd,NString pTeachInd,NString pNativeInd,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
			cmd.addParameter("@P_SKLV_CODE", pSklvCode);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_LAST_DATE", pLastDate);
			cmd.addParameter("@P_READ_IND", pReadInd);
			cmd.addParameter("@P_WRITE_IND", pWriteInd);
			cmd.addParameter("@P_SPEAK_IND", pSpeakInd);
			cmd.addParameter("@P_TRANS_IND", pTransInd);
			cmd.addParameter("@P_TEACH_IND", pTeachInd);
			cmd.addParameter("@P_NATIVE_IND", pNativeInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pSkilCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pSkilCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pSkilCode,NString pSklvCode,NString pComments,NDate pStartDate,NDate pEndDate,NDate pLastDate,NString pReadInd,NString pWriteInd,NString pSpeakInd,NString pTransInd,NString pTeachInd,NString pNativeInd,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_SKILL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SKIL_CODE", pSkilCode);
			cmd.addParameter("@P_SKLV_CODE", pSklvCode);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_LAST_DATE", pLastDate);
			cmd.addParameter("@P_READ_IND", pReadInd);
			cmd.addParameter("@P_WRITE_IND", pWriteInd);
			cmd.addParameter("@P_SPEAK_IND", pSpeakInd);
			cmd.addParameter("@P_TRANS_IND", pTransInd);
			cmd.addParameter("@P_TEACH_IND", pTeachInd);
			cmd.addParameter("@P_NATIVE_IND", pNativeInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="SkillRecRow", dataSourceName="SKILL_REC")
	public static class SkillRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SKIL_CODE")
		public NString RSkilCode;
		@DbRecordField(dataSourceName="R_SKLV_CODE")
		public NString RSklvCode;
		@DbRecordField(dataSourceName="R_COMMENTS")
		public NString RComments;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_LAST_DATE")
		public NDate RLastDate;
		@DbRecordField(dataSourceName="R_READ_IND")
		public NString RReadInd;
		@DbRecordField(dataSourceName="R_WRITE_IND")
		public NString RWriteInd;
		@DbRecordField(dataSourceName="R_SPEAK_IND")
		public NString RSpeakInd;
		@DbRecordField(dataSourceName="R_TRANS_IND")
		public NString RTransInd;
		@DbRecordField(dataSourceName="R_TEACH_IND")
		public NString RTeachInd;
		@DbRecordField(dataSourceName="R_NATIVE_IND")
		public NString RNativeInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		public SkillRecRow() {
			super();
			// TODO Auto-generated constructor stub
		}
		public SkillRecRow(Row r) {
			super();
			RPidm = toNumber(r.getObject(1));
			RSkilCode = toStr(r.getObject(2));
			RSklvCode = toStr(r.getObject(3));
			RComments = toStr(r.getObject(4));
			RStartDate = toDate(r.getObject(5));
			REndDate = toDate(r.getObject(6));
			RLastDate = toDate(r.getObject(7));
			RReadInd = toStr(r.getObject(8));
			RWriteInd = toStr(r.getObject(9));
			RSpeakInd = toStr(r.getObject(10));
			RTransInd = toStr(r.getObject(11));
			RTeachInd = toStr(r.getObject(12));
			RNativeInd = toStr(r.getObject(13));
			RDataOrigin = toStr(r.getObject(14));
			RUserId = toStr(r.getObject(15));
			RInternalRecordId = toStr(r.getObject(16));
		}
		
		
	}

	
	
}
