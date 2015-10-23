package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvMisProgramTops {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCoasCode,NString pProgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(MisProgramTopsRecRow recOne,MisProgramTopsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, MisProgramTopsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, MisProgramTopsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCoasCode,NString pProgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCoasCode,NString pProgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCoasCode,NString pProgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCoasCode,NString pProgCode,NString pAsaCode,NString pTopsCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ASA_CODE", pAsaCode);
			cmd.addParameter("@P_TOPS_CODE", pTopsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCoasCode,NString pProgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCoasCode,NString pProgCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCoasCode,NString pProgCode,NString pAsaCode,NString pTopsCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_PROGRAM_TOPS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ASA_CODE", pAsaCode);
			cmd.addParameter("@P_TOPS_CODE", pTopsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="MisProgramTopsRecRow", dataSourceName="MIS_PROGRAM_TOPS_REC", needsInitialization=true)
	public static class MisProgramTopsRecRow
	{
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_PROG_CODE")
		public NString RProgCode;
		@DbRecordField(dataSourceName="R_ASA_CODE")
		public NString RAsaCode;
		@DbRecordField(dataSourceName="R_TOPS_CODE")
		public NString RTopsCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
