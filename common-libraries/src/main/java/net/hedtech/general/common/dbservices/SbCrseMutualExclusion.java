package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCrseMutualExclusion {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pSubjCodeMexc,NString pCrseNumbMexc,NString pLevlCode,NString pStartTerm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_SUBJ_CODE_MEXC", pSubjCodeMexc);
			cmd.addParameter("@P_CRSE_NUMB_MEXC", pCrseNumbMexc);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_START_TERM", pStartTerm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CrseMutualExclusionRecRow recOne,CrseMutualExclusionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CrseMutualExclusionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CrseMutualExclusionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pSubjCodeMexc,NString pCrseNumbMexc,NString pLevlCode,NString pStartTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_SUBJ_CODE_MEXC", pSubjCodeMexc);
			cmd.addParameter("@P_CRSE_NUMB_MEXC", pCrseNumbMexc);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_START_TERM", pStartTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pSubjCodeMexc,NString pCrseNumbMexc,NString pLevlCode,NString pStartTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_SUBJ_CODE_MEXC", pSubjCodeMexc);
			cmd.addParameter("@P_CRSE_NUMB_MEXC", pCrseNumbMexc);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_START_TERM", pStartTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pSubjCodeMexc,NString pCrseNumbMexc,NString pLevlCode,NString pStartTerm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_SUBJ_CODE_MEXC", pSubjCodeMexc);
			cmd.addParameter("@P_CRSE_NUMB_MEXC", pCrseNumbMexc);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_START_TERM", pStartTerm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pUserId,NString pSubjCodeMexc,NString pCrseNumbMexc,NString pLevlCode,NString pGrdeCode,NString pStartTerm,NString pEndTerm,NString pDataOrigin,Ref<NNumber> pPrimaryKeyOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SUBJ_CODE_MEXC", pSubjCodeMexc);
			cmd.addParameter("@P_CRSE_NUMB_MEXC", pCrseNumbMexc);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_START_TERM", pStartTerm);
			cmd.addParameter("@P_END_TERM", pEndTerm);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRIMARY_KEY_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pPrimaryKeyOut.val = cmd.getParameterValue("@P_PRIMARY_KEY_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pSubjCodeMexc,NString pCrseNumbMexc,NString pLevlCode,NString pStartTerm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_SUBJ_CODE_MEXC", pSubjCodeMexc);
			cmd.addParameter("@P_CRSE_NUMB_MEXC", pCrseNumbMexc);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_START_TERM", pStartTerm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pSubjCodeMexc,NString pCrseNumbMexc,NString pLevlCode,NString pStartTerm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_SUBJ_CODE_MEXC", pSubjCodeMexc);
			cmd.addParameter("@P_CRSE_NUMB_MEXC", pCrseNumbMexc);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_START_TERM", pStartTerm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pUserId,NString pSubjCodeMexc,NString pCrseNumbMexc,NString pLevlCode,NString pGrdeCode,NString pStartTerm,NString pEndTerm,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_MUTUAL_EXCLUSION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SUBJ_CODE_MEXC", pSubjCodeMexc);
			cmd.addParameter("@P_CRSE_NUMB_MEXC", pCrseNumbMexc);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_START_TERM", pStartTerm);
			cmd.addParameter("@P_END_TERM", pEndTerm);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CrseMutualExclusionRecRow", dataSourceName="CRSE_MUTUAL_EXCLUSION_REC")
	public static class CrseMutualExclusionRecRow
	{
		@DbRecordField(dataSourceName="R_PRIMARY_KEY")
		public NNumber RPrimaryKey;
		@DbRecordField(dataSourceName="R_SUBJ_CODE")
		public NString RSubjCode;
		@DbRecordField(dataSourceName="R_CRSE_NUMB")
		public NString RCrseNumb;
		@DbRecordField(dataSourceName="R_EFF_TERM")
		public NString REffTerm;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_SUBJ_CODE_MEXC")
		public NString RSubjCodeMexc;
		@DbRecordField(dataSourceName="R_CRSE_NUMB_MEXC")
		public NString RCrseNumbMexc;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_GRDE_CODE")
		public NString RGrdeCode;
		@DbRecordField(dataSourceName="R_START_TERM")
		public NString RStartTerm;
		@DbRecordField(dataSourceName="R_END_TERM")
		public NString REndTerm;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
