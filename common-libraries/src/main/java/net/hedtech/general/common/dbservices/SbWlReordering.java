package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbWlReordering {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPrimaryKey,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(WlReorderingRecRow recOne,WlReorderingRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, WlReorderingRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, WlReorderingRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPrimaryKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPrimaryKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPrimaryKey,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NNumber pPriorityNum,NString pUserId,NString pLevlCode,NString pCampCode,NString pCollCode,NString pDegcCode,NString pProgram,NString pClasCode,NString pAttsCode,NString pAstdCode,NString pChrtCode,NString pLfstCode,NString pMajrCode,NNumber pMinGpa,NNumber pMaxGpa,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_CLAS_CODE", pClasCode);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_MIN_GPA", pMinGpa);
			cmd.addParameter("@P_MAX_GPA", pMaxGpa);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPrimaryKey,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPrimaryKey,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPrimaryKey,NString pTermCode,NNumber pPriorityNum,NString pUserId,NString pLevlCode,NString pCampCode,NString pCollCode,NString pDegcCode,NString pProgram,NString pClasCode,NString pAttsCode,NString pAstdCode,NString pChrtCode,NString pLfstCode,NString pMajrCode,NNumber pMinGpa,NNumber pMaxGpa,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_REORDERING.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRIORITY_NUM", pPriorityNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_CLAS_CODE", pClasCode);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_MIN_GPA", pMinGpa);
			cmd.addParameter("@P_MAX_GPA", pMaxGpa);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="WlReorderingRecRow", dataSourceName="WL_REORDERING_REC")
	public static class WlReorderingRecRow
	{
		@DbRecordField(dataSourceName="R_PRIMARY_KEY")
		public NNumber RPrimaryKey;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PRIORITY_NUM")
		public NNumber RPriorityNum;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_PROGRAM")
		public NString RProgram;
		@DbRecordField(dataSourceName="R_CLAS_CODE")
		public NString RClasCode;
		@DbRecordField(dataSourceName="R_ATTS_CODE")
		public NString RAttsCode;
		@DbRecordField(dataSourceName="R_ASTD_CODE")
		public NString RAstdCode;
		@DbRecordField(dataSourceName="R_CHRT_CODE")
		public NString RChrtCode;
		@DbRecordField(dataSourceName="R_LFST_CODE")
		public NString RLfstCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE")
		public NString RMajrCode;
		@DbRecordField(dataSourceName="R_MIN_GPA")
		public NNumber RMinGpa;
		@DbRecordField(dataSourceName="R_MAX_GPA")
		public NNumber RMaxGpa;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
