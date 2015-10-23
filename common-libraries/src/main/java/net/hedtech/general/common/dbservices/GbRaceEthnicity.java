package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbRaceEthnicity {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRaceCde) {
			return fExists(pRaceCde,NString.getNull());
		}
		
		public static NString fExists(NString pRaceCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RACE_CDE", pRaceCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsByRrac(NString pRracCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_EXISTS_BY_RRAC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RRAC_CODE", pRracCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDescription(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_GET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(RaceEthnicityRecRow recOne,RaceEthnicityRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RaceEthnicityRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RaceEthnicityRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNewEthnicityValues() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_NEW_ETHNICITY_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pRaceCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RACE_CDE", pRaceCde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pRaceCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RACE_CDE", pRaceCde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRaceCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RACE_CDE", pRaceCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fValidateEdiEquiv(NString pEdiEquiv) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.F_VALIDATE_EDI_EQUIV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EDI_EQUIV", pEdiEquiv);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NString pRaceCde,NString pDesc,NString pUserId,NString pRracCode,NString pEdiEquiv,NString pLmsEquiv,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RACE_CDE", pRaceCde);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RRAC_CODE", pRracCode);
			cmd.addParameter("@P_EDI_EQUIV", pEdiEquiv);
			cmd.addParameter("@P_LMS_EQUIV", pLmsEquiv);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pRaceCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RACE_CDE", pRaceCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pRaceCde,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RACE_CDE", pRaceCde);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pRaceCde,NString pDesc,NString pUserId,NString pRracCode,NString pEdiEquiv,NString pLmsEquiv,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_RACE_ETHNICITY.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RACE_CDE", pRaceCde);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RRAC_CODE", pRracCode);
			cmd.addParameter("@P_EDI_EQUIV", pEdiEquiv);
			cmd.addParameter("@P_LMS_EQUIV", pLmsEquiv);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RaceEthnicityRecRow", dataSourceName="RACE_ETHNICITY_REC")
	public static class RaceEthnicityRecRow
	{
		@DbRecordField(dataSourceName="R_RACE_CDE")
		public NString RRaceCde;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_RRAC_CODE")
		public NString RRracCode;
		@DbRecordField(dataSourceName="R_EDI_EQUIV")
		public NString REdiEquiv;
		@DbRecordField(dataSourceName="R_LMS_EQUIV")
		public NString RLmsEquiv;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
