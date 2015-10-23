package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbBldgdefinition {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pBldgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(BldgdefinitionRecRow recOne,BldgdefinitionRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, BldgdefinitionRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, BldgdefinitionRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pBldgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pBldgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pBldgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pBldgCode,NString pCampCode,NNumber pCapacity,NNumber pMaximumCapacity,NString pRrcdCode,NString pPrcdCode,NString pSiteCode,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pCity,NString pStatCode,NString pZip,NString pCntyCode,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExtension,NString pSex,NString pCollCode,NString pDeptCode,NString pKeyNumber,NString pParsCode,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,NString pHouseNumber,NString pStreetLine4,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_CAPACITY", pCapacity);
			cmd.addParameter("@P_MAXIMUM_CAPACITY", pMaximumCapacity);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXTENSION", pPhoneExtension);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_KEY_NUMBER", pKeyNumber);
			cmd.addParameter("@P_PARS_CODE", pParsCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pBldgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pBldgCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pBldgCode,NString pCampCode,NNumber pCapacity,NNumber pMaximumCapacity,NString pRrcdCode,NString pPrcdCode,NString pSiteCode,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pCity,NString pStatCode,NString pZip,NString pCntyCode,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExtension,NString pSex,NString pCollCode,NString pDeptCode,NString pKeyNumber,NString pParsCode,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,NString pHouseNumber,NString pStreetLine4,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BLDGDEFINITION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_CAPACITY", pCapacity);
			cmd.addParameter("@P_MAXIMUM_CAPACITY", pMaximumCapacity);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXTENSION", pPhoneExtension);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_KEY_NUMBER", pKeyNumber);
			cmd.addParameter("@P_PARS_CODE", pParsCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="BldgdefinitionRecRow", dataSourceName="BLDGDEFINITION_REC")
	public static class BldgdefinitionRecRow
	{
		@DbRecordField(dataSourceName="R_BLDG_CODE")
		public NString RBldgCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_CAPACITY")
		public NNumber RCapacity;
		@DbRecordField(dataSourceName="R_MAXIMUM_CAPACITY")
		public NNumber RMaximumCapacity;
		@DbRecordField(dataSourceName="R_RRCD_CODE")
		public NString RRrcdCode;
		@DbRecordField(dataSourceName="R_PRCD_CODE")
		public NString RPrcdCode;
		@DbRecordField(dataSourceName="R_SITE_CODE")
		public NString RSiteCode;
		@DbRecordField(dataSourceName="R_STREET_LINE1")
		public NString RStreetLine1;
		@DbRecordField(dataSourceName="R_STREET_LINE2")
		public NString RStreetLine2;
		@DbRecordField(dataSourceName="R_STREET_LINE3")
		public NString RStreetLine3;
		@DbRecordField(dataSourceName="R_CITY")
		public NString RCity;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_ZIP")
		public NString RZip;
		@DbRecordField(dataSourceName="R_CNTY_CODE")
		public NString RCntyCode;
		@DbRecordField(dataSourceName="R_PHONE_AREA")
		public NString RPhoneArea;
		@DbRecordField(dataSourceName="R_PHONE_NUMBER")
		public NString RPhoneNumber;
		@DbRecordField(dataSourceName="R_PHONE_EXTENSION")
		public NString RPhoneExtension;
		@DbRecordField(dataSourceName="R_SEX")
		public NString RSex;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_KEY_NUMBER")
		public NString RKeyNumber;
		@DbRecordField(dataSourceName="R_PARS_CODE")
		public NString RParsCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CTRY_CODE_PHONE")
		public NString RCtryCodePhone;
		@DbRecordField(dataSourceName="R_HOUSE_NUMBER")
		public NString RHouseNumber;
		@DbRecordField(dataSourceName="R_STREET_LINE4")
		public NString RStreetLine4;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
