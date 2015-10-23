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

public class GbAddress {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pAtypCode,NNumber pSeqno,NString pStatusInd,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsActive(NNumber pPidm,NString pAtypCode,NDate pFromDate,NDate pToDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.F_EXISTS_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStatus(NNumber pPidm,NString pAddrType,NNumber pAddrSeqno,NString pCheckDate,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.F_GET_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADDR_TYPE", pAddrType);
			cmd.addParameter("@P_ADDR_SEQNO", pAddrSeqno);
			cmd.addParameter("@P_CHECK_DATE", pCheckDate);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetValidDescription(NNumber pPidm,NString pAtyp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.F_GET_VALID_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP", pAtyp);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AddressRecRow recOne,AddressRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AddressRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AddressRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static Cursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryLock(NNumber pPidm,NString pAtypCode,NNumber pSeqno,NString pStatusInd,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.F_QUERY_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		//JM(1/6/2015) changed return type to Cursor
		public static Cursor fQueryOne(NNumber pPidm,NString pAtypCode,NNumber pSeqno,NString pStatusInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static void pCreate(
				NNumber pPidm, 
				NString pAtypCode,
				NDate pFromDate, 
				NDate pToDate,
				NString pStreetLine1,
				NString pStreetLine2,
				NString pStreetLine3, 
				NString pCity,
				NString pStatCode, 
				NString pZip,
				NString pCntyCode, 
				NString pNatnCode,
				NString pStatusInd, 
				NString pUser, 
				NString pAsrcCode,
				NNumber pDeliveryPoint, 
				NNumber pCorrectionDigit,
				NString pCarrierRoute,
				NString pGstTaxId,
				NString pDataOrigin,
				NString pHouseNumber,
				NString pStreetLine4, 
				NString pFinanceRules,
				Ref<NNumber> pSeqnoInout,
				Ref<byte[]> pRowidOut) {
			GbAddress.pCreate(pPidm, pAtypCode, pFromDate, pToDate, pStreetLine1, pStreetLine2, pStreetLine3, 
					pCity, pStatCode, pZip, pCntyCode, pNatnCode, pStatusInd, pUser, pAsrcCode, pDeliveryPoint, 
					pCorrectionDigit, pCarrierRoute, pGstTaxId, NString.getNull(), NString.getNull(), pDataOrigin, 
					NString.getNull(), pHouseNumber, pStreetLine4, pFinanceRules, pSeqnoInout, pRowidOut);
			
		}
		
		public static void pCreate(NNumber pPidm,NString pAtypCode,NDate pFromDate,NDate pToDate,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pCity,NString pStatCode,NString pZip,NString pCntyCode,NString pNatnCode,NString pStatusInd,NString pUser,NString pAsrcCode,NNumber pDeliveryPoint,NNumber pCorrectionDigit,NString pCarrierRoute,NString pGstTaxId,NString pReviewedInd,NString pReviewedUser,NString pDataOrigin,NString pCtryCodePhone,NString pHouseNumber,NString pStreetLine4,NString pFinanceRules,Ref<NNumber> pSeqnoInout,Ref<byte[]> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ASRC_CODE", pAsrcCode);
			cmd.addParameter("@P_DELIVERY_POINT", pDeliveryPoint);
			cmd.addParameter("@P_CORRECTION_DIGIT", pCorrectionDigit);
			cmd.addParameter("@P_CARRIER_ROUTE", pCarrierRoute);
			cmd.addParameter("@P_GST_TAX_ID", pGstTaxId);
			cmd.addParameter("@P_REVIEWED_IND", pReviewedInd);
			cmd.addParameter("@P_REVIEWED_USER", pReviewedUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_FINANCE_RULES", pFinanceRules);
			cmd.addParameter("@P_SEQNO_INOUT", pSeqnoInout, true);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pSeqnoInout.val = cmd.getParameterValue("@P_SEQNO_INOUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


		}
		
		public static void pDelete(NNumber pPidm,NString pAtypCode,NNumber pSeqno,NString pStatusInd,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ROWID", DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pAtypCode,NNumber pSeqno,NString pStatusInd,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(
				NNumber pPidm, 
				NNumber pSeqno,
				NString pAtypCode, 
				NDate pFromDate,
				NDate pToDate, 
				NString pStreetLine1,
				NString pStreetLine2, 
				NString pStreetLine3,
				NString pCity, 
				NString pStatCode, 
				NString pZip,
				NString pCntyCode, 
				NString pNatnCode,
				NString pStatusInd, 
				NString pUser, 
				NString pAsrcCode,
				NNumber pDeliveryPoint, 
				NNumber pCorrectionDigit,
				NString pGstTaxId, 
				NString pCarrierRoute,
				NString pHouseNumber, 
				NString pStreetLine4,
				NString pFinanceRules, 
				NString pDataOrigin, 
				java.sql.RowId pRowid) {
			GbAddress.pUpdate(pPidm, pAtypCode, pSeqno, pFromDate, pToDate, pStreetLine1,
					pStreetLine2, pStreetLine3, pCity, pStatCode, pZip, pCntyCode, pNatnCode, 
					pStatusInd, pUser, pAsrcCode, pDeliveryPoint, pCorrectionDigit, pCarrierRoute,
					pGstTaxId, NString.getNull(), NString.getNull(), pDataOrigin, NString.getNull(), pHouseNumber,
					pStreetLine4, pFinanceRules, pRowid);
			
		}
		
		public static void pUpdate(NNumber pPidm,NString pAtypCode,NNumber pSeqno,NDate pFromDate,NDate pToDate,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pCity,NString pStatCode,NString pZip,NString pCntyCode,NString pNatnCode,NString pStatusInd,NString pUser,NString pAsrcCode,NNumber pDeliveryPoint,NNumber pCorrectionDigit,NString pCarrierRoute,NString pGstTaxId,NString pReviewedInd,NString pReviewedUser,NString pDataOrigin,NString pCtryCodePhone,NString pHouseNumber,NString pStreetLine4,NString pFinanceRules,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADDRESS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ASRC_CODE", pAsrcCode);
			cmd.addParameter("@P_DELIVERY_POINT", pDeliveryPoint);
			cmd.addParameter("@P_CORRECTION_DIGIT", pCorrectionDigit);
			cmd.addParameter("@P_CARRIER_ROUTE", pCarrierRoute);
			cmd.addParameter("@P_GST_TAX_ID", pGstTaxId);
			cmd.addParameter("@P_REVIEWED_IND", pReviewedInd);
			cmd.addParameter("@P_REVIEWED_USER", pReviewedUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_FINANCE_RULES", pFinanceRules);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AddressRecRow", dataSourceName="ADDRESS_REC")
	public static class AddressRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_FROM_DATE")
		public NDate RFromDate;
		@DbRecordField(dataSourceName="R_TO_DATE")
		public NDate RToDate;
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
		@DbRecordField(dataSourceName="R_NATN_CODE")
		public NString RNatnCode;
		@DbRecordField(dataSourceName="R_STATUS_IND")
		public NString RStatusInd;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_ASRC_CODE")
		public NString RAsrcCode;
		@DbRecordField(dataSourceName="R_DELIVERY_POINT")
		public NNumber RDeliveryPoint;
		@DbRecordField(dataSourceName="R_CORRECTION_DIGIT")
		public NNumber RCorrectionDigit;
		@DbRecordField(dataSourceName="R_CARRIER_ROUTE")
		public NString RCarrierRoute;
		@DbRecordField(dataSourceName="R_GST_TAX_ID")
		public NString RGstTaxId;
		@DbRecordField(dataSourceName="R_REVIEWED_IND")
		public NString RReviewedInd;
		@DbRecordField(dataSourceName="R_REVIEWED_USER")
		public NString RReviewedUser;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CTRY_CODE_PHONE")
		public NString RCtryCodePhone;
		@DbRecordField(dataSourceName="R_HOUSE_NUMBER")
		public NString RHouseNumber;
		@DbRecordField(dataSourceName="R_STREET_LINE4")
		public NString RStreetLine4;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public AddressRecRow() {
			super();
		}

		public AddressRecRow(Row  spraddrRefResults) {
			super();
			RPidm = toNumber(spraddrRefResults.getObject(1));
			RAtypCode = toStr(spraddrRefResults.getObject(2));
			RSeqno = toNumber(spraddrRefResults.getObject(3));
			RFromDate = toDate(spraddrRefResults.getObject(4));
			RToDate = toDate(spraddrRefResults.getObject(5));
			RStreetLine1 = toStr(spraddrRefResults.getObject(6));
			RStreetLine2 = toStr(spraddrRefResults.getObject(7));
			RStreetLine3 = toStr(spraddrRefResults.getObject(8));
			RCity = toStr(spraddrRefResults.getObject(9));
			RStatCode = toStr(spraddrRefResults.getObject(10));
			RZip = toStr(spraddrRefResults.getObject(11));
			RCntyCode = toStr(spraddrRefResults.getObject(12));
			RNatnCode = toStr(spraddrRefResults.getObject(13));
			RStatusInd = toStr(spraddrRefResults.getObject(14));
			RUser = toStr(spraddrRefResults.getObject(15));
			RAsrcCode = toStr(spraddrRefResults.getObject(16));
			RDeliveryPoint = toNumber(spraddrRefResults.getObject(17));
			RCorrectionDigit = toNumber(spraddrRefResults.getObject(18));
			RCarrierRoute = toStr(spraddrRefResults.getObject(19));
			RGstTaxId = toStr(spraddrRefResults.getObject(20));
			RReviewedInd = toStr(spraddrRefResults.getObject(21));
			RReviewedUser = toStr(spraddrRefResults.getObject(22));
			RDataOrigin = toStr(spraddrRefResults.getObject(23));
			RCtryCodePhone = toStr(spraddrRefResults.getObject(24));
			RHouseNumber = toStr(spraddrRefResults.getObject(25));
			RStreetLine4 = toStr(spraddrRefResults.getObject(26));
			RInternalRecordId = toStr(spraddrRefResults.getObject(27));
		}
		
	}







	

	
	
}
