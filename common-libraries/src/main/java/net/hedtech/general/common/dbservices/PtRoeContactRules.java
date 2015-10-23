package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PtRoeContactRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fEmprCodeExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.F_EMPR_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pEmprCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(RoeContactRulesRecRow recOne,RoeContactRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RoeContactRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RoeContactRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEmprCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEmprCode,NString pContactLanguageInd,NNumber pContactPidm,NString pContactTeleAreaCode,NString pContactTeleNumber,NNumber pIssuingPidm,NString pIssuingTeleAreaCode,NString pIssuingTeleNumber,NString pUserId,NString pContactTeleExt,NString pIssusingTeleExt,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_CONTACT_LANGUAGE_IND", pContactLanguageInd);
			cmd.addParameter("@P_CONTACT_PIDM", pContactPidm);
			cmd.addParameter("@P_CONTACT_TELE_AREA_CODE", pContactTeleAreaCode);
			cmd.addParameter("@P_CONTACT_TELE_NUMBER", pContactTeleNumber);
			cmd.addParameter("@P_ISSUING_PIDM", pIssuingPidm);
			cmd.addParameter("@P_ISSUING_TELE_AREA_CODE", pIssuingTeleAreaCode);
			cmd.addParameter("@P_ISSUING_TELE_NUMBER", pIssuingTeleNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CONTACT_TELE_EXT", pContactTeleExt);
			cmd.addParameter("@P_ISSUSING_TELE_EXT", pIssusingTeleExt);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEmprCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEmprCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEmprCode,NString pContactLanguageInd,NNumber pContactPidm,NString pContactTeleAreaCode,NString pContactTeleNumber,NNumber pIssuingPidm,NString pIssuingTeleAreaCode,NString pIssuingTeleNumber,NString pUserId,NString pContactTeleExt,NString pIssusingTeleExt,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_CONTACT_LANGUAGE_IND", pContactLanguageInd);
			cmd.addParameter("@P_CONTACT_PIDM", pContactPidm);
			cmd.addParameter("@P_CONTACT_TELE_AREA_CODE", pContactTeleAreaCode);
			cmd.addParameter("@P_CONTACT_TELE_NUMBER", pContactTeleNumber);
			cmd.addParameter("@P_ISSUING_PIDM", pIssuingPidm);
			cmd.addParameter("@P_ISSUING_TELE_AREA_CODE", pIssuingTeleAreaCode);
			cmd.addParameter("@P_ISSUING_TELE_NUMBER", pIssuingTeleNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CONTACT_TELE_EXT", pContactTeleExt);
			cmd.addParameter("@P_ISSUSING_TELE_EXT", pIssusingTeleExt);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RoeContactRulesRecRow", dataSourceName="ROE_CONTACT_RULES_REC")
	public static class RoeContactRulesRecRow
	{
		@DbRecordField(dataSourceName="R_EMPR_CODE")
		public NString REmprCode;
		@DbRecordField(dataSourceName="R_CONTACT_LANGUAGE_IND")
		public NString RContactLanguageInd;
		@DbRecordField(dataSourceName="R_CONTACT_PIDM")
		public NNumber RContactPidm;
		@DbRecordField(dataSourceName="R_CONTACT_TELE_AREA_CODE")
		public NString RContactTeleAreaCode;
		@DbRecordField(dataSourceName="R_CONTACT_TELE_NUMBER")
		public NString RContactTeleNumber;
		@DbRecordField(dataSourceName="R_ISSUING_PIDM")
		public NNumber RIssuingPidm;
		@DbRecordField(dataSourceName="R_ISSUING_TELE_AREA_CODE")
		public NString RIssuingTeleAreaCode;
		@DbRecordField(dataSourceName="R_ISSUING_TELE_NUMBER")
		public NString RIssuingTeleNumber;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CONTACT_TELE_EXT")
		public NString RContactTeleExt;
		@DbRecordField(dataSourceName="R_ISSUSING_TELE_EXT")
		public NString RIssusingTeleExt;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
