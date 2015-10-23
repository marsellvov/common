package net.hedtech.general.common.dbservices;


import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;


public class PbEffcertPeriod {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCoasCode,NString pEcpdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EffcertPeriodRecRow recOne,EffcertPeriodRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EffcertPeriodRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EffcertPeriodRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NString pCoasCode,NString pEcpdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryById(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.F_QUERY_BY_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCoasCode,NString pEcpdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCoasCode,NString pEcpdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCoasCode,NString pEcpdCode,NDate pCertBeginDate,NDate pCertEndDate,NString pWebAccessInd,NDate pWebAccessEndDate,NString pUserId,NDate pReviewBeginDate,NDate pPostReviewEndDate,NString pDataOrigin,Ref<NNumber> pIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_CERT_BEGIN_DATE", pCertBeginDate);
			cmd.addParameter("@P_CERT_END_DATE", pCertEndDate);
			cmd.addParameter("@P_WEB_ACCESS_IND", pWebAccessInd);
			cmd.addParameter("@P_WEB_ACCESS_END_DATE", pWebAccessEndDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REVIEW_BEGIN_DATE", pReviewBeginDate);
			cmd.addParameter("@P_POST_REVIEW_END_DATE", pPostReviewEndDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCoasCode,NString pEcpdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCoasCode,NString pEcpdCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCoasCode,NString pEcpdCode,NDate pCertBeginDate,NDate pCertEndDate,NString pWebAccessInd,NDate pWebAccessEndDate,NString pUserId,NDate pReviewBeginDate,NDate pPostReviewEndDate,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EFFCERT_PERIOD.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_CERT_BEGIN_DATE", pCertBeginDate);
			cmd.addParameter("@P_CERT_END_DATE", pCertEndDate);
			cmd.addParameter("@P_WEB_ACCESS_IND", pWebAccessInd);
			cmd.addParameter("@P_WEB_ACCESS_END_DATE", pWebAccessEndDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REVIEW_BEGIN_DATE", pReviewBeginDate);
			cmd.addParameter("@P_POST_REVIEW_END_DATE", pPostReviewEndDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EffcertPeriodRecRow", dataSourceName="EFFCERT_PERIOD_REC")
	public static class EffcertPeriodRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_ECPD_CODE")
		public NString REcpdCode;
		@DbRecordField(dataSourceName="R_CERT_BEGIN_DATE")
		public NDate RCertBeginDate;
		@DbRecordField(dataSourceName="R_CERT_END_DATE")
		public NDate RCertEndDate;
		@DbRecordField(dataSourceName="R_WEB_ACCESS_IND")
		public NString RWebAccessInd;
		@DbRecordField(dataSourceName="R_WEB_ACCESS_END_DATE")
		public NDate RWebAccessEndDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_REVIEW_BEGIN_DATE")
		public NDate RReviewBeginDate;
		@DbRecordField(dataSourceName="R_POST_REVIEW_END_DATE")
		public NDate RPostReviewEndDate;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		public EffcertPeriodRecRow() {
			super();
			// TODO Auto-generated constructor stub
		}
		public EffcertPeriodRecRow(Row effCurResults) {
			super();
			RId = toNumber(effCurResults.getObject(1));
			RCoasCode = toStr(effCurResults.getObject(2));
			REcpdCode = toStr(effCurResults.getObject(3));
			RCertBeginDate = toDate(effCurResults.getObject(4));
			RCertEndDate = toDate(effCurResults.getObject(5));
			RWebAccessInd = toStr(effCurResults.getObject(6));
			RWebAccessEndDate = toDate(effCurResults.getObject(7));
			RUserId = toStr(effCurResults.getObject(8));
			RReviewBeginDate = toDate(effCurResults.getObject(9));
			RPostReviewEndDate = toDate(effCurResults.getObject(10));
			RDataOrigin = toStr(effCurResults.getObject(11));
			RInternalRecordId = toStr(effCurResults.getObject(12));
		}
		
		
	}

	
	
}
