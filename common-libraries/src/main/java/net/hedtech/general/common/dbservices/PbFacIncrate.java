package net.hedtech.general.common.dbservices;

import static morphis.foundations.core.types.Types.toNumber;
import static morphis.foundations.core.types.Types.toStr;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbFacIncrate {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCodeEff,NString pFlicCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FacIncrateRecRow recOne,FacIncrateRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FacIncrateRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FacIncrateRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NString pTermCodeEff,NString pFlicCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByTerm(NString pTermCodeEff,NString pFlicCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.F_QUERY_BY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCodeEff,NString pFlicCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCodeEff,NString pFlicCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCodeEff,NString pFlicCode,NString pCalcMethod,NString pUserId,NString pDataOrigin,NNumber pRate,NNumber pCrseCalcPercent,Ref<byte[]> pRowidOut) {
			//*MORFIS TODO
			//*Francisco Carvalho
			//*Mudan�a para que o rowid funcione 
			
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CRSE_CALC_PERCENT", pCrseCalcPercent);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			//pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


		}
		
		public static void pDelete(NString pTermCodeEff,NString pFlicCode,Ref<byte[]> pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCodeEff,NString pFlicCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCodeEff,NString pFlicCode,NString pCalcMethod,NString pUserId,NString pDataOrigin,NNumber pRate,NNumber pCrseCalcPercent,Ref<byte[]> pRowid/*NString pRowid*/) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRATE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CRSE_CALC_PERCENT", pCrseCalcPercent);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FacIncrateRecRow", dataSourceName="FAC_INCRATE_REC")
	public static class FacIncrateRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF")
		public NString RTermCodeEff;
		@DbRecordField(dataSourceName="R_FLIC_CODE")
		public NString RFlicCode;
		@DbRecordField(dataSourceName="R_CALC_METHOD")
		public NString RCalcMethod;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_RATE")
		public NNumber RRate;
		@DbRecordField(dataSourceName="R_CRSE_CALC_PERCENT")
		public NNumber RCrseCalcPercent;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public FacIncrateRecRow() {}

		public FacIncrateRecRow(Row row) {

			RTermCodeEff = toStr(row.getObject(1));
			RFlicCode = toStr(row.getObject(2));
			RCalcMethod = toStr(row.getObject(3));
			RUserId = toStr(row.getObject(4));
			RDataOrigin = toStr(row.getObject(5));
			RRate = toNumber(row.getObject(6));
			RCrseCalcPercent = toNumber(row.getObject(7));
			RInternalRecordId = toStr(row.getObject(8));
			
		}
	}

	
	
}
