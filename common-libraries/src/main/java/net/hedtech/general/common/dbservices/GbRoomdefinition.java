package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbRoomdefinition {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pBldgCode,NString pRoomNumber,NString pTermCodeEff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsForEffTerm(NString pBldgCode,NString pRoomNumber,NString pTermCodeEff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.F_EXISTS_FOR_EFF_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(RoomdefinitionRecRow recOne,RoomdefinitionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RoomdefinitionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RoomdefinitionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pBldgCode,NString pRoomNumber,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pBldgCode,NString pRoomNumber,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneByMaxTerm(NString pBldgCode,NString pRoomNumber,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.F_QUERY_ONE_BY_MAX_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pBldgCode,NString pRoomNumber,NString pTermCodeEff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pBldgCode,NString pRoomNumber,NString pDesc,NNumber pCapacity,NNumber pMaximumCapacity,NString pRmstCode,NString pRrcdCode,NString pPrcdCode,NNumber pUtilityRate,NString pUtilityRatePeriod,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExtension,NString pBcatCode,NString pSex,NString pRoomType,NString pPriority,NString pCollCode,NString pDeptCode,NString pKeyNumber,NNumber pWidth,NNumber pLength,NNumber pArea,NString pTermCodeEff,NString pParsCode,NString pCtryCodePhone,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_CAPACITY", pCapacity);
			cmd.addParameter("@P_MAXIMUM_CAPACITY", pMaximumCapacity);
			cmd.addParameter("@P_RMST_CODE", pRmstCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_UTILITY_RATE", pUtilityRate);
			cmd.addParameter("@P_UTILITY_RATE_PERIOD", pUtilityRatePeriod);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXTENSION", pPhoneExtension);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_ROOM_TYPE", pRoomType);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_KEY_NUMBER", pKeyNumber);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_LENGTH", pLength);
			cmd.addParameter("@P_AREA", pArea);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_PARS_CODE", pParsCode);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pBldgCode,NString pRoomNumber,NString pTermCodeEff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pBldgCode,NString pRoomNumber,NString pTermCodeEff,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pBldgCode,NString pRoomNumber,NString pDesc,NNumber pCapacity,NNumber pMaximumCapacity,NString pRmstCode,NString pRrcdCode,NString pPrcdCode,NNumber pUtilityRate,NString pUtilityRatePeriod,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExtension,NString pBcatCode,NString pSex,NString pRoomType,NString pPriority,NString pCollCode,NString pDeptCode,NString pKeyNumber,NNumber pWidth,NNumber pLength,NNumber pArea,NString pTermCodeEff,NString pParsCode,NString pCtryCodePhone,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMDEFINITION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_CAPACITY", pCapacity);
			cmd.addParameter("@P_MAXIMUM_CAPACITY", pMaximumCapacity);
			cmd.addParameter("@P_RMST_CODE", pRmstCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_UTILITY_RATE", pUtilityRate);
			cmd.addParameter("@P_UTILITY_RATE_PERIOD", pUtilityRatePeriod);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXTENSION", pPhoneExtension);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_ROOM_TYPE", pRoomType);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_KEY_NUMBER", pKeyNumber);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_LENGTH", pLength);
			cmd.addParameter("@P_AREA", pArea);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_PARS_CODE", pParsCode);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RoomdefinitionRecRow", dataSourceName="ROOMDEFINITION_REC")
	public static class RoomdefinitionRecRow
	{
		@DbRecordField(dataSourceName="R_BLDG_CODE")
		public NString RBldgCode;
		@DbRecordField(dataSourceName="R_ROOM_NUMBER")
		public NString RRoomNumber;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_CAPACITY")
		public NNumber RCapacity;
		@DbRecordField(dataSourceName="R_MAXIMUM_CAPACITY")
		public NNumber RMaximumCapacity;
		@DbRecordField(dataSourceName="R_RMST_CODE")
		public NString RRmstCode;
		@DbRecordField(dataSourceName="R_RRCD_CODE")
		public NString RRrcdCode;
		@DbRecordField(dataSourceName="R_PRCD_CODE")
		public NString RPrcdCode;
		@DbRecordField(dataSourceName="R_UTILITY_RATE")
		public NNumber RUtilityRate;
		@DbRecordField(dataSourceName="R_UTILITY_RATE_PERIOD")
		public NString RUtilityRatePeriod;
		@DbRecordField(dataSourceName="R_PHONE_AREA")
		public NString RPhoneArea;
		@DbRecordField(dataSourceName="R_PHONE_NUMBER")
		public NString RPhoneNumber;
		@DbRecordField(dataSourceName="R_PHONE_EXTENSION")
		public NString RPhoneExtension;
		@DbRecordField(dataSourceName="R_BCAT_CODE")
		public NString RBcatCode;
		@DbRecordField(dataSourceName="R_SEX")
		public NString RSex;
		@DbRecordField(dataSourceName="R_ROOM_TYPE")
		public NString RRoomType;
		@DbRecordField(dataSourceName="R_PRIORITY")
		public NString RPriority;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_KEY_NUMBER")
		public NString RKeyNumber;
		@DbRecordField(dataSourceName="R_WIDTH")
		public NNumber RWidth;
		@DbRecordField(dataSourceName="R_LENGTH")
		public NNumber RLength;
		@DbRecordField(dataSourceName="R_AREA")
		public NNumber RArea;
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF")
		public NString RTermCodeEff;
		@DbRecordField(dataSourceName="R_PARS_CODE")
		public NString RParsCode;
		@DbRecordField(dataSourceName="R_CTRY_CODE_PHONE")
		public NString RCtryCodePhone;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
