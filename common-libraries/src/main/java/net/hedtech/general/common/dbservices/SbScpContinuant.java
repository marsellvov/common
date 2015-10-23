package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbScpContinuant {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCode,NString pStypCode,NString pScpsCodeCont,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_SCPS_CODE_CONT", pScpsCodeCont);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ScpContinuantRecRow recOne,ScpContinuantRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ScpContinuantRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ScpContinuantRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NString pStypCode,NString pScpsCodeCont) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_SCPS_CODE_CONT", pScpsCodeCont);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NString pStypCode,NString pScpsCodeCont) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_SCPS_CODE_CONT", pScpsCodeCont);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NString pStypCode,NString pScpsCodeCont,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_SCPS_CODE_CONT", pScpsCodeCont);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NString pStypCode,NString pScpsCodeCont,NString pUser,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_SCPS_CODE_CONT", pScpsCodeCont);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NString pStypCode,NString pScpsCodeCont,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_SCPS_CODE_CONT", pScpsCodeCont);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NString pStypCode,NString pScpsCodeCont,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_SCPS_CODE_CONT", pScpsCodeCont);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NString pStypCode,NString pScpsCodeCont,NString pUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_CONTINUANT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_SCPS_CODE_CONT", pScpsCodeCont);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ScpContinuantRecRow", dataSourceName="SCP_CONTINUANT_REC")
	public static class ScpContinuantRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_STYP_CODE")
		public NString RStypCode;
		@DbRecordField(dataSourceName="R_SCPS_CODE_CONT")
		public NString RScpsCodeCont;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
