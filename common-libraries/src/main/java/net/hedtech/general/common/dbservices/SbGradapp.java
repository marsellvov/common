package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbGradapp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsactive(NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.F_ISACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GradappRecRow recOne,GradappRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GradappRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GradappRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pSeqno,NDate pRequestDate,NString pGastCode,NDate pGastDate,NString pGadrCode,NString pDgmrUpdGrstCode,NDate pGradDate,NString pGradTermCode,NString pGradAcyrCode,NString pGradAttendCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_REQUEST_DATE", pRequestDate);
			cmd.addParameter("@P_GAST_CODE", pGastCode);
			cmd.addParameter("@P_GAST_DATE", pGastDate);
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_DGMR_UPD_GRST_CODE", pDgmrUpdGrstCode);
			cmd.addParameter("@P_GRAD_DATE", pGradDate);
			cmd.addParameter("@P_GRAD_TERM_CODE", pGradTermCode);
			cmd.addParameter("@P_GRAD_ACYR_CODE", pGradAcyrCode);
			cmd.addParameter("@P_GRAD_ATTEND_CDE", pGradAttendCde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NNumber pSeqno,NDate pRequestDate,NString pGastCode,NDate pGastDate,NString pUserId,NString pGadrCode,NString pDgmrUpdGrstCode,NDate pGradDate,NString pGradTermCode,NString pGradAcyrCode,NString pGradAttendCde,NString pLastName,NString pFirstName,NString pMi,NString pNameSuffix,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pHouseNumber,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pTermCodeDetc,NString pWpyoCode,NString pDetcDetailCode,NString pDetcDesc,NNumber pChrg,NDate pFeeDate,NNumber pTranNumber,NNumber pWpyoReceiptNumber,NString pDataOrigin,NString pSurnamePrefix,Ref<NString> pRowidOut,Ref<NNumber> pSeqnoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_REQUEST_DATE", pRequestDate);
			cmd.addParameter("@P_GAST_CODE", pGastCode);
			cmd.addParameter("@P_GAST_DATE", pGastDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_DGMR_UPD_GRST_CODE", pDgmrUpdGrstCode);
			cmd.addParameter("@P_GRAD_DATE", pGradDate);
			cmd.addParameter("@P_GRAD_TERM_CODE", pGradTermCode);
			cmd.addParameter("@P_GRAD_ACYR_CODE", pGradAcyrCode);
			cmd.addParameter("@P_GRAD_ATTEND_CDE", pGradAttendCde);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_TERM_CODE_DETC", pTermCodeDetc);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_DETC_DETAIL_CODE", pDetcDetailCode);
			cmd.addParameter("@P_DETC_DESC", pDetcDesc);
			cmd.addParameter("@P_CHRG", pChrg);
			cmd.addParameter("@P_FEE_DATE", pFeeDate);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_WPYO_RECEIPT_NUMBER", pWpyoReceiptNumber);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
			cmd.addParameter("@P_SEQNO_OUT", NNumber.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
			pSeqnoOut.val = cmd.getParameterValue("@P_SEQNO_OUT", NNumber.class);


		}
		
		public static void pDelete(NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pSeqno,NDate pRequestDate,NString pGastCode,NDate pGastDate,NString pUserId,NString pGadrCode,NString pDgmrUpdGrstCode,NDate pGradDate,NString pGradTermCode,NString pGradAcyrCode,NString pGradAttendCde,NString pLastName,NString pFirstName,NString pMi,NString pNameSuffix,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pHouseNumber,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pTermCodeDetc,NString pWpyoCode,NString pDetcDetailCode,NString pDetcDesc,NNumber pChrg,NDate pFeeDate,NNumber pTranNumber,NNumber pWpyoReceiptNumber,NString pDataOrigin,NString pSurnamePrefix,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_REQUEST_DATE", pRequestDate);
			cmd.addParameter("@P_GAST_CODE", pGastCode);
			cmd.addParameter("@P_GAST_DATE", pGastDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_DGMR_UPD_GRST_CODE", pDgmrUpdGrstCode);
			cmd.addParameter("@P_GRAD_DATE", pGradDate);
			cmd.addParameter("@P_GRAD_TERM_CODE", pGradTermCode);
			cmd.addParameter("@P_GRAD_ACYR_CODE", pGradAcyrCode);
			cmd.addParameter("@P_GRAD_ATTEND_CDE", pGradAttendCde);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_STREET1", pStreet1);
			cmd.addParameter("@P_STREET2", pStreet2);
			cmd.addParameter("@P_STREET3", pStreet3);
			cmd.addParameter("@P_STREET4", pStreet4);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_TERM_CODE_DETC", pTermCodeDetc);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_DETC_DETAIL_CODE", pDetcDetailCode);
			cmd.addParameter("@P_DETC_DESC", pDetcDesc);
			cmd.addParameter("@P_CHRG", pChrg);
			cmd.addParameter("@P_FEE_DATE", pFeeDate);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_WPYO_RECEIPT_NUMBER", pWpyoReceiptNumber);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GradappRecRow", dataSourceName="GRADAPP_REC")
	public static class GradappRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_REQUEST_DATE")
		public NDate RRequestDate;
		@DbRecordField(dataSourceName="R_GAST_CODE")
		public NString RGastCode;
		@DbRecordField(dataSourceName="R_GAST_DATE")
		public NDate RGastDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_GADR_CODE")
		public NString RGadrCode;
		@DbRecordField(dataSourceName="R_DGMR_UPD_GRST_CODE")
		public NString RDgmrUpdGrstCode;
		@DbRecordField(dataSourceName="R_GRAD_DATE")
		public NDate RGradDate;
		@DbRecordField(dataSourceName="R_GRAD_TERM_CODE")
		public NString RGradTermCode;
		@DbRecordField(dataSourceName="R_GRAD_ACYR_CODE")
		public NString RGradAcyrCode;
		@DbRecordField(dataSourceName="R_GRAD_ATTEND_CDE")
		public NString RGradAttendCde;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_MI")
		public NString RMi;
		@DbRecordField(dataSourceName="R_NAME_SUFFIX")
		public NString RNameSuffix;
		@DbRecordField(dataSourceName="R_STREET1")
		public NString RStreet1;
		@DbRecordField(dataSourceName="R_STREET2")
		public NString RStreet2;
		@DbRecordField(dataSourceName="R_STREET3")
		public NString RStreet3;
		@DbRecordField(dataSourceName="R_STREET4")
		public NString RStreet4;
		@DbRecordField(dataSourceName="R_HOUSE_NUMBER")
		public NString RHouseNumber;
		@DbRecordField(dataSourceName="R_CITY")
		public NString RCity;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_ZIP")
		public NString RZip;
		@DbRecordField(dataSourceName="R_NATN_CODE")
		public NString RNatnCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_DETC")
		public NString RTermCodeDetc;
		@DbRecordField(dataSourceName="R_WPYO_CODE")
		public NString RWpyoCode;
		@DbRecordField(dataSourceName="R_DETC_DETAIL_CODE")
		public NString RDetcDetailCode;
		@DbRecordField(dataSourceName="R_DETC_DESC")
		public NString RDetcDesc;
		@DbRecordField(dataSourceName="R_CHRG")
		public NNumber RChrg;
		@DbRecordField(dataSourceName="R_FEE_DATE")
		public NDate RFeeDate;
		@DbRecordField(dataSourceName="R_TRAN_NUMBER")
		public NNumber RTranNumber;
		@DbRecordField(dataSourceName="R_WPYO_RECEIPT_NUMBER")
		public NNumber RWpyoReceiptNumber;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_SURNAME_PREFIX")
		public NString RSurnamePrefix;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
