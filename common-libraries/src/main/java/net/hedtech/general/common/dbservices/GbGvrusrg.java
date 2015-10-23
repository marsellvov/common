package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvrusrg {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSrn,NString pUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GvrusrgRecRow recOne,GvrusrgRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GvrusrgRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GvrusrgRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pSrn,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pSrn,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pSrn,NString pUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pSrn,NString pUser,NString pResultsInd,NString pModifyInd,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_RESULTS_IND", pResultsInd);
			cmd.addParameter("@P_MODIFY_IND", pModifyInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pSrn,NString pUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pSrn,NString pUser,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pSrn,NString pUser,NString pResultsInd,NString pModifyInd,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRUSRG.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_RESULTS_IND", pResultsInd);
			cmd.addParameter("@P_MODIFY_IND", pModifyInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="GvrusrgRecRow", dataSourceName="GVRUSRG_REC", needsInitialization=true)
	public static class GvrusrgRecRow
	{
		@DbRecordField(dataSourceName="R_SRN")
		public NNumber RSrn;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_RESULTS_IND")
		public NString RResultsInd;
		@DbRecordField(dataSourceName="R_MODIFY_IND")
		public NString RModifyInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
