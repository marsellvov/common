package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbGradappRules {
		public static NNumber fSeqno(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_RULES.F_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pSeqno,NDate pRequestDate,NString pGastCode,NDate pGastDate,NString pUserId,NString pGadrCode,NString pDgmrUpdGrstCode,NDate pGradDate,NString pGradTermCode,NString pGradAcyrCode,NString pGradAttendCde,NString pLastName,NString pFirstName,NString pMi,NString pNameSuffix,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pHouseNumber,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pTermCodeDetc,NString pWpyoCode,NString pDetcDetailCode,NString pDetcDesc,NNumber pChrg,NDate pFeeDate,NNumber pTranNumber,NNumber pWpyoReceiptNumber,NString pDataOrigin,NString pSurnamePrefix,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NNumber pSeqno,NDate pRequestDate,NString pGastCode,NDate pGastDate,NString pUserId,NString pGadrCode,NString pDgmrUpdGrstCode,NDate pGradDate,NString pGradTermCode,NString pGradAcyrCode,NString pGradAttendCde,NString pLastName,NString pFirstName,NString pMi,NString pNameSuffix,NString pStreet1,NString pStreet2,NString pStreet3,NString pStreet4,NString pHouseNumber,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pTermCodeDetc,NString pWpyoCode,NString pDetcDetailCode,NString pDetcDesc,NNumber pChrg,NDate pFeeDate,NNumber pTranNumber,NNumber pWpyoReceiptNumber,NString pDataOrigin,NString pSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
