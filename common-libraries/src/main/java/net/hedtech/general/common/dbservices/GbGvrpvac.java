package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvrpvac {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSeqNum,NString pAcodCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GvrpvacRecRow recOne,GvrpvacRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GvrpvacRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GvrpvacRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pSeqNum,NString pAcodCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pSeqNum,NString pAcodCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pSeqNum,NString pAcodCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pSeqNum,NString pAcodCode,NString pDesc,NNumber pQpoints,NString pOptOpenAnswInd,NNumber pSortNum,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_QPOINTS", pQpoints);
			cmd.addParameter("@P_OPT_OPEN_ANSW_IND", pOptOpenAnswInd);
			cmd.addParameter("@P_SORT_NUM", pSortNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pCreateToclob(NNumber pSeqNum,NString pAcodCode,NString pDesc,NNumber pQpoints,NString pOptOpenAnswInd,NNumber pSortNum,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.P_CREATE_TOCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_QPOINTS", pQpoints);
			cmd.addParameter("@P_OPT_OPEN_ANSW_IND", pOptOpenAnswInd);
			cmd.addParameter("@P_SORT_NUM", pSortNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pSeqNum,NString pAcodCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pSeqNum,NString pAcodCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pSeqNum,NString pAcodCode,NString pDesc,NNumber pQpoints,NString pOptOpenAnswInd,NNumber pSortNum,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_QPOINTS", pQpoints);
			cmd.addParameter("@P_OPT_OPEN_ANSW_IND", pOptOpenAnswInd);
			cmd.addParameter("@P_SORT_NUM", pSortNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateToclob(NNumber pSeqNum,NString pAcodCode,NString pDesc,NNumber pQpoints,NString pOptOpenAnswInd,NNumber pSortNum,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRPVAC.P_UPDATE_TOCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ACOD_CODE", pAcodCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_QPOINTS", pQpoints);
			cmd.addParameter("@P_OPT_OPEN_ANSW_IND", pOptOpenAnswInd);
			cmd.addParameter("@P_SORT_NUM", pSortNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="GvrpvacRecRow", dataSourceName="GVRPVAC_REC", needsInitialization=true)
	public static class GvrpvacRecRow
	{
		@DbRecordField(dataSourceName="R_SEQ_NUM")
		public NNumber RSeqNum;
		@DbRecordField(dataSourceName="R_ACOD_CODE")
		public NString RAcodCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_QPOINTS")
		public NNumber RQpoints;
		@DbRecordField(dataSourceName="R_OPT_OPEN_ANSW_IND")
		public NString ROptOpenAnswInd;
		@DbRecordField(dataSourceName="R_SORT_NUM")
		public NNumber RSortNum;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
