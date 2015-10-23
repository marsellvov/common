package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.toStr;
import static morphis.foundations.core.types.Types.toNumber;

public class PbFacNisrate {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCodeEff,NString pFcntCode,NString pNistCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FacNisrateRecRow recOne,FacNisrateRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FacNisrateRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FacNisrateRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NString pTermCodeEff,NString pFcntCode,NString pNistCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByTerm(NString pTermCodeEff,NString pFcntCode,NString pNistCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.F_QUERY_BY_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCodeEff,NString pFcntCode,NString pNistCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCodeEff,NString pFcntCode,NString pNistCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCodeEff,NString pFcntCode,NString pNistCode,NNumber pRate,NString pCalcMethod,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCodeEff,NString pFcntCode,NString pNistCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCodeEff,NString pFcntCode,NString pNistCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCodeEff,NString pFcntCode,NString pNistCode,NNumber pRate,NString pCalcMethod,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NISRATE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
			

	@DbRecordType(id="FacNisrateRecRow", dataSourceName="PB_FAC_NISRATE.FAC_NISRATE_REC")
	public static class FacNisrateRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF")
		public NString RTermCodeEff;
		@DbRecordField(dataSourceName="R_FCNT_CODE")
		public NString RFcntCode;
		@DbRecordField(dataSourceName="R_NIST_CODE")
		public NString RNistCode;
		@DbRecordField(dataSourceName="R_RATE")
		public NNumber RRate;
		@DbRecordField(dataSourceName="R_CALC_METHOD")
		public NString RCalcMethod;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		public FacNisrateRecRow() {
			super();
			
		}
		public FacNisrateRecRow(ResultSet facCurResults) {
			super();
			RTermCodeEff = facCurResults.getStr(0);
			RFcntCode = facCurResults.getStr(1);
			RNistCode = facCurResults.getStr(2);
			RRate = facCurResults.getNumber(3);
			RCalcMethod = facCurResults.getStr(4);
			RUserId = facCurResults.getStr(5);
			RDataOrigin = facCurResults.getStr(6);
			RInternalRecordId = facCurResults.getStr(7);
		}
		
		public FacNisrateRecRow(Row facCurResults) {
			super();
			RTermCodeEff = toStr(facCurResults.getObject(1));
			RFcntCode = toStr(facCurResults.getObject(2));
			RNistCode = toStr(facCurResults.getObject(3));
			RRate = toNumber(facCurResults.getObject(4));
			RCalcMethod = toStr(facCurResults.getObject(5));
			RUserId = toStr(facCurResults.getObject(6));
			RDataOrigin = toStr(facCurResults.getObject(7));
			RInternalRecordId = toStr(facCurResults.getObject(8));
		}
		
	}	
	
	
	public static class fac_nisrate_ref extends Ref<Cursor>{}
}
