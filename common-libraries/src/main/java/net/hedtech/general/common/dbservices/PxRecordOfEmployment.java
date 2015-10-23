package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PxRecordOfEmployment {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fEarnCodeExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_EARN_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmployeeDeceased(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_EMPLOYEE_DECEASED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmployeeExists(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_EMPLOYEE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmprCodeExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_EMPR_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEmprFedEinExists(NString pCode,NString pEmprFedEin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_EMPR_FED_EIN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EMPR_FED_EIN", pEmprFedEin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pSeqNo,NString pPictCode,NString pEmprCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetNonDefaultTotalEarn(NString pPictCode,NNumber pPp1Grs,NNumber pPp2Grs,NNumber pPp3Grs,NNumber pPp4Grs,NNumber pPp5Grs,NNumber pPp6Grs,NNumber pPp7Grs,NNumber pPp8Grs,NNumber pPp9Grs,NNumber pPp10Grs,NNumber pPp11Grs,NNumber pPp12Grs,NNumber pPp13Grs,NNumber pPp14Grs,NNumber pPp15Grs,NNumber pPp16Grs,NNumber pPp17Grs,NNumber pPp18Grs,NNumber pPp19Grs,NNumber pPp20Grs,NNumber pPp21Grs,NNumber pPp22Grs,NNumber pPp23Grs,NNumber pPp24Grs,NNumber pPp25Grs,NNumber pPp26Grs,NNumber pPp27Grs,NNumber pPp28Grs,NNumber pPp29Grs,NNumber pPp30Grs,NNumber pPp31Grs,NNumber pPp32Grs,NNumber pPp33Grs,NNumber pPp34Grs,NNumber pPp35Grs,NNumber pPp36Grs,NNumber pPp37Grs,NNumber pPp38Grs,NNumber pPp39Grs,NNumber pPp40Grs,NNumber pPp41Grs,NNumber pPp42Grs,NNumber pPp43Grs,NNumber pPp44Grs,NNumber pPp45Grs,NNumber pPp46Grs,NNumber pPp47Grs,NNumber pPp48Grs,NNumber pPp49Grs,NNumber pPp50Grs,NNumber pPp51Grs,NNumber pPp52Grs,NNumber pPp53Grs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_GET_NON_DEFAULT_TOTAL_EARN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PP1_GRS", pPp1Grs);
			cmd.addParameter("@P_PP2_GRS", pPp2Grs);
			cmd.addParameter("@P_PP3_GRS", pPp3Grs);
			cmd.addParameter("@P_PP4_GRS", pPp4Grs);
			cmd.addParameter("@P_PP5_GRS", pPp5Grs);
			cmd.addParameter("@P_PP6_GRS", pPp6Grs);
			cmd.addParameter("@P_PP7_GRS", pPp7Grs);
			cmd.addParameter("@P_PP8_GRS", pPp8Grs);
			cmd.addParameter("@P_PP9_GRS", pPp9Grs);
			cmd.addParameter("@P_PP10_GRS", pPp10Grs);
			cmd.addParameter("@P_PP11_GRS", pPp11Grs);
			cmd.addParameter("@P_PP12_GRS", pPp12Grs);
			cmd.addParameter("@P_PP13_GRS", pPp13Grs);
			cmd.addParameter("@P_PP14_GRS", pPp14Grs);
			cmd.addParameter("@P_PP15_GRS", pPp15Grs);
			cmd.addParameter("@P_PP16_GRS", pPp16Grs);
			cmd.addParameter("@P_PP17_GRS", pPp17Grs);
			cmd.addParameter("@P_PP18_GRS", pPp18Grs);
			cmd.addParameter("@P_PP19_GRS", pPp19Grs);
			cmd.addParameter("@P_PP20_GRS", pPp20Grs);
			cmd.addParameter("@P_PP21_GRS", pPp21Grs);
			cmd.addParameter("@P_PP22_GRS", pPp22Grs);
			cmd.addParameter("@P_PP23_GRS", pPp23Grs);
			cmd.addParameter("@P_PP24_GRS", pPp24Grs);
			cmd.addParameter("@P_PP25_GRS", pPp25Grs);
			cmd.addParameter("@P_PP26_GRS", pPp26Grs);
			cmd.addParameter("@P_PP27_GRS", pPp27Grs);
			cmd.addParameter("@P_PP28_GRS", pPp28Grs);
			cmd.addParameter("@P_PP29_GRS", pPp29Grs);
			cmd.addParameter("@P_PP30_GRS", pPp30Grs);
			cmd.addParameter("@P_PP31_GRS", pPp31Grs);
			cmd.addParameter("@P_PP32_GRS", pPp32Grs);
			cmd.addParameter("@P_PP33_GRS", pPp33Grs);
			cmd.addParameter("@P_PP34_GRS", pPp34Grs);
			cmd.addParameter("@P_PP35_GRS", pPp35Grs);
			cmd.addParameter("@P_PP36_GRS", pPp36Grs);
			cmd.addParameter("@P_PP37_GRS", pPp37Grs);
			cmd.addParameter("@P_PP38_GRS", pPp38Grs);
			cmd.addParameter("@P_PP39_GRS", pPp39Grs);
			cmd.addParameter("@P_PP40_GRS", pPp40Grs);
			cmd.addParameter("@P_PP41_GRS", pPp41Grs);
			cmd.addParameter("@P_PP42_GRS", pPp42Grs);
			cmd.addParameter("@P_PP43_GRS", pPp43Grs);
			cmd.addParameter("@P_PP44_GRS", pPp44Grs);
			cmd.addParameter("@P_PP45_GRS", pPp45Grs);
			cmd.addParameter("@P_PP46_GRS", pPp46Grs);
			cmd.addParameter("@P_PP47_GRS", pPp47Grs);
			cmd.addParameter("@P_PP48_GRS", pPp48Grs);
			cmd.addParameter("@P_PP49_GRS", pPp49Grs);
			cmd.addParameter("@P_PP50_GRS", pPp50Grs);
			cmd.addParameter("@P_PP51_GRS", pPp51Grs);
			cmd.addParameter("@P_PP52_GRS", pPp52Grs);
			cmd.addParameter("@P_PP53_GRS", pPp53Grs);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsequal(RecordOfEmploymentRecRow recOne,RecordOfEmploymentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RecordOfEmploymentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RecordOfEmploymentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fJobExists(NNumber pPidm,NString pPictCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_JOB_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPictCodeExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_PICT_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintedRoeExists(NNumber pPidm,NNumber pSeqNo,NString pPictCode,NString pEmprCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_PRINTED_ROE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pSeqNo,NString pPictCode,NString pEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pSeqNo,NString pPictCode,NString pEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pSeqNo,NString pPictCode,NString pEmprCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fRecordUpdated(NNumber pPidm,NNumber pSeqNo,NString pPictCode,NString pEmprCode,NString pEmprFedEin,NString pPrintInd,NString pReprintInd,NString pSerialNo,NString pAmendsSerialNo,NString pLanguageInd,NDate pIssueDate,NString pReferenceNumber,NString pSin,NString pJobTitle,NDate pFirstDayWorked,NDate pLastDayWorked,NDate pFinalPayDate,NString pRecallInd,NDate pRecallDate,NString pRoecCode,NNumber pTotalHrs,NNumber pTotalGrs,NNumber p1996Weeks,NNumber p1996Earnings,NNumber pContactPidm,NString pContactTeleAreaCode,NString pContactTeleNumber,NString pContactTeleExt,NNumber pIssuingPidm,NString pIssuingTeleAreaCode,NString pIssuingTeleNumber,NString pIssusingTeleExt,NString pEarnCodeVac,NNumber pVacGrs,NString pStatHolEarnCode1,NDate pStatHolDate1,NNumber pStatHolGrs1,NString pStatHolEarnCode2,NDate pStatHolDate2,NNumber pStatHolGrs2,NString pStatHolEarnCode3,NDate pStatHolDate3,NNumber pStatHolGrs3,NString pOtherEarnCode1,NNumber pOtherEarnCode1Grs,NString pOtherEarnCode2,NNumber pOtherEarnCode2Grs,NString pOtherEarnCode3,NNumber pOtherEarnCode3Grs,NString pBenefitInd,NNumber pBenefitGrs,NDate pBenefitStartDate,NString pBenefitDayWeekInd,NString pPp1Payno,NNumber pPp1Grs,NString pPp2Payno,NNumber pPp2Grs,NString pPp3Payno,NNumber pPp3Grs,NString pPp4Payno,NNumber pPp4Grs,NString pPp5Payno,NNumber pPp5Grs,NString pPp6Payno,NNumber pPp6Grs,NString pPp7Payno,NNumber pPp7Grs,NString pPp8Payno,NNumber pPp8Grs,NString pPp9Payno,NNumber pPp9Grs,NString pPp10Payno,NNumber pPp10Grs,NString pPp11Payno,NNumber pPp11Grs,NString pPp12Payno,NNumber pPp12Grs,NString pPp13Payno,NNumber pPp13Grs,NString pPp14Payno,NNumber pPp14Grs,NString pPp15Payno,NNumber pPp15Grs,NString pPp16Payno,NNumber pPp16Grs,NString pPp17Payno,NNumber pPp17Grs,NString pPp18Payno,NNumber pPp18Grs,NString pPp19Payno,NNumber pPp19Grs,NString pPp20Payno,NNumber pPp20Grs,NString pPp21Payno,NNumber pPp21Grs,NString pPp22Payno,NNumber pPp22Grs,NString pPp23Payno,NNumber pPp23Grs,NString pPp24Payno,NNumber pPp24Grs,NString pPp25Payno,NNumber pPp25Grs,NString pPp26Payno,NNumber pPp26Grs,NString pPp27Payno,NNumber pPp27Grs,NString pCommentLine1,NString pCommentLine2,NString pCommentLine3,NString pCommentLine4,NString pCommentLine5,NString pCommentLine6,NString pUserId,NString pMoneyType1,NString pMoneyType2,NString pMoneyType3,NNumber pPp28Payno,NNumber pPp28Grs,NNumber pPp29Payno,NNumber pPp29Grs,NNumber pPp30Payno,NNumber pPp30Grs,NNumber pPp31Payno,NNumber pPp31Grs,NNumber pPp32Payno,NNumber pPp32Grs,NNumber pPp33Payno,NNumber pPp33Grs,NNumber pPp34Payno,NNumber pPp34Grs,NNumber pPp35Payno,NNumber pPp35Grs,NNumber pPp36Payno,NNumber pPp36Grs,NNumber pPp37Payno,NNumber pPp37Grs,NNumber pPp38Payno,NNumber pPp38Grs,NNumber pPp39Payno,NNumber pPp39Grs,NNumber pPp40Payno,NNumber pPp40Grs,NNumber pPp41Payno,NNumber pPp41Grs,NNumber pPp42Payno,NNumber pPp42Grs,NNumber pPp43Payno,NNumber pPp43Grs,NNumber pPp44Payno,NNumber pPp44Grs,NNumber pPp45Payno,NNumber pPp45Grs,NNumber pPp46Payno,NNumber pPp46Grs,NNumber pPp47Payno,NNumber pPp47Grs,NNumber pPp48Payno,NNumber pPp48Grs,NNumber pPp49Payno,NNumber pPp49Grs,NNumber pPp50Payno,NNumber pPp50Grs,NNumber pPp51Payno,NNumber pPp51Grs,NNumber pPp52Payno,NNumber pPp52Grs,NNumber pPp53Payno,NNumber pPp53Grs,NString pDataOrigin,NNumber pPp1Hrs,NNumber pPp2Hrs,NNumber pPp3Hrs,NNumber pPp4Hrs,NNumber pPp5Hrs,NNumber pPp6Hrs,NNumber pPp7Hrs,NNumber pPp8Hrs,NNumber pPp9Hrs,NNumber pPp10Hrs,NNumber pPp11Hrs,NNumber pPp12Hrs,NNumber pPp13Hrs,NNumber pPp14Hrs,NNumber pPp15Hrs,NNumber pPp16Hrs,NNumber pPp17Hrs,NNumber pPp18Hrs,NNumber pPp19Hrs,NNumber pPp20Hrs,NNumber pPp21Hrs,NNumber pPp22Hrs,NNumber pPp23Hrs,NNumber pPp24Hrs,NNumber pPp25Hrs,NNumber pPp26Hrs,NNumber pPp27Hrs,NNumber pPp28Hrs,NNumber pPp29Hrs,NNumber pPp30Hrs,NNumber pPp31Hrs,NNumber pPp32Hrs,NNumber pPp33Hrs,NNumber pPp34Hrs,NNumber pPp35Hrs,NNumber pPp36Hrs,NNumber pPp37Hrs,NNumber pPp38Hrs,NNumber pPp39Hrs,NNumber pPp40Hrs,NNumber pPp41Hrs,NNumber pPp42Hrs,NNumber pPp43Hrs,NNumber pPp44Hrs,NNumber pPp45Hrs,NNumber pPp46Hrs,NNumber pPp47Hrs,NNumber pPp48Hrs,NNumber pPp49Hrs,NNumber pPp50Hrs,NNumber pPp51Hrs,NNumber pPp52Hrs,NNumber pPp53Hrs,NString pBulkFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_RECORD_UPDATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_EMPR_FED_EIN", pEmprFedEin);
			cmd.addParameter("@P_PRINT_IND", pPrintInd);
			cmd.addParameter("@P_REPRINT_IND", pReprintInd);
			cmd.addParameter("@P_SERIAL_NO", pSerialNo);
			cmd.addParameter("@P_AMENDS_SERIAL_NO", pAmendsSerialNo);
			cmd.addParameter("@P_LANGUAGE_IND", pLanguageInd);
			cmd.addParameter("@P_ISSUE_DATE", pIssueDate);
			cmd.addParameter("@P_REFERENCE_NUMBER", pReferenceNumber);
			cmd.addParameter("@P_SIN", pSin);
			cmd.addParameter("@P_JOB_TITLE", pJobTitle);
			cmd.addParameter("@P_FIRST_DAY_WORKED", pFirstDayWorked);
			cmd.addParameter("@P_LAST_DAY_WORKED", pLastDayWorked);
			cmd.addParameter("@P_FINAL_PAY_DATE", pFinalPayDate);
			cmd.addParameter("@P_RECALL_IND", pRecallInd);
			cmd.addParameter("@P_RECALL_DATE", pRecallDate);
			cmd.addParameter("@P_ROEC_CODE", pRoecCode);
			cmd.addParameter("@P_TOTAL_HRS", pTotalHrs);
			cmd.addParameter("@P_TOTAL_GRS", pTotalGrs);
			cmd.addParameter("@P_1996_WEEKS", p1996Weeks);
			cmd.addParameter("@P_1996_EARNINGS", p1996Earnings);
			cmd.addParameter("@P_CONTACT_PIDM", pContactPidm);
			cmd.addParameter("@P_CONTACT_TELE_AREA_CODE", pContactTeleAreaCode);
			cmd.addParameter("@P_CONTACT_TELE_NUMBER", pContactTeleNumber);
			cmd.addParameter("@P_CONTACT_TELE_EXT", pContactTeleExt);
			cmd.addParameter("@P_ISSUING_PIDM", pIssuingPidm);
			cmd.addParameter("@P_ISSUING_TELE_AREA_CODE", pIssuingTeleAreaCode);
			cmd.addParameter("@P_ISSUING_TELE_NUMBER", pIssuingTeleNumber);
			cmd.addParameter("@P_ISSUSING_TELE_EXT", pIssusingTeleExt);
			cmd.addParameter("@P_EARN_CODE_VAC", pEarnCodeVac);
			cmd.addParameter("@P_VAC_GRS", pVacGrs);
			cmd.addParameter("@P_STAT_HOL_EARN_CODE1", pStatHolEarnCode1);
			cmd.addParameter("@P_STAT_HOL_DATE1", pStatHolDate1);
			cmd.addParameter("@P_STAT_HOL_GRS1", pStatHolGrs1);
			cmd.addParameter("@P_STAT_HOL_EARN_CODE2", pStatHolEarnCode2);
			cmd.addParameter("@P_STAT_HOL_DATE2", pStatHolDate2);
			cmd.addParameter("@P_STAT_HOL_GRS2", pStatHolGrs2);
			cmd.addParameter("@P_STAT_HOL_EARN_CODE3", pStatHolEarnCode3);
			cmd.addParameter("@P_STAT_HOL_DATE3", pStatHolDate3);
			cmd.addParameter("@P_STAT_HOL_GRS3", pStatHolGrs3);
			cmd.addParameter("@P_OTHER_EARN_CODE1", pOtherEarnCode1);
			cmd.addParameter("@P_OTHER_EARN_CODE1_GRS", pOtherEarnCode1Grs);
			cmd.addParameter("@P_OTHER_EARN_CODE2", pOtherEarnCode2);
			cmd.addParameter("@P_OTHER_EARN_CODE2_GRS", pOtherEarnCode2Grs);
			cmd.addParameter("@P_OTHER_EARN_CODE3", pOtherEarnCode3);
			cmd.addParameter("@P_OTHER_EARN_CODE3_GRS", pOtherEarnCode3Grs);
			cmd.addParameter("@P_BENEFIT_IND", pBenefitInd);
			cmd.addParameter("@P_BENEFIT_GRS", pBenefitGrs);
			cmd.addParameter("@P_BENEFIT_START_DATE", pBenefitStartDate);
			cmd.addParameter("@P_BENEFIT_DAY_WEEK_IND", pBenefitDayWeekInd);
			cmd.addParameter("@P_PP1_PAYNO", pPp1Payno);
			cmd.addParameter("@P_PP1_GRS", pPp1Grs);
			cmd.addParameter("@P_PP2_PAYNO", pPp2Payno);
			cmd.addParameter("@P_PP2_GRS", pPp2Grs);
			cmd.addParameter("@P_PP3_PAYNO", pPp3Payno);
			cmd.addParameter("@P_PP3_GRS", pPp3Grs);
			cmd.addParameter("@P_PP4_PAYNO", pPp4Payno);
			cmd.addParameter("@P_PP4_GRS", pPp4Grs);
			cmd.addParameter("@P_PP5_PAYNO", pPp5Payno);
			cmd.addParameter("@P_PP5_GRS", pPp5Grs);
			cmd.addParameter("@P_PP6_PAYNO", pPp6Payno);
			cmd.addParameter("@P_PP6_GRS", pPp6Grs);
			cmd.addParameter("@P_PP7_PAYNO", pPp7Payno);
			cmd.addParameter("@P_PP7_GRS", pPp7Grs);
			cmd.addParameter("@P_PP8_PAYNO", pPp8Payno);
			cmd.addParameter("@P_PP8_GRS", pPp8Grs);
			cmd.addParameter("@P_PP9_PAYNO", pPp9Payno);
			cmd.addParameter("@P_PP9_GRS", pPp9Grs);
			cmd.addParameter("@P_PP10_PAYNO", pPp10Payno);
			cmd.addParameter("@P_PP10_GRS", pPp10Grs);
			cmd.addParameter("@P_PP11_PAYNO", pPp11Payno);
			cmd.addParameter("@P_PP11_GRS", pPp11Grs);
			cmd.addParameter("@P_PP12_PAYNO", pPp12Payno);
			cmd.addParameter("@P_PP12_GRS", pPp12Grs);
			cmd.addParameter("@P_PP13_PAYNO", pPp13Payno);
			cmd.addParameter("@P_PP13_GRS", pPp13Grs);
			cmd.addParameter("@P_PP14_PAYNO", pPp14Payno);
			cmd.addParameter("@P_PP14_GRS", pPp14Grs);
			cmd.addParameter("@P_PP15_PAYNO", pPp15Payno);
			cmd.addParameter("@P_PP15_GRS", pPp15Grs);
			cmd.addParameter("@P_PP16_PAYNO", pPp16Payno);
			cmd.addParameter("@P_PP16_GRS", pPp16Grs);
			cmd.addParameter("@P_PP17_PAYNO", pPp17Payno);
			cmd.addParameter("@P_PP17_GRS", pPp17Grs);
			cmd.addParameter("@P_PP18_PAYNO", pPp18Payno);
			cmd.addParameter("@P_PP18_GRS", pPp18Grs);
			cmd.addParameter("@P_PP19_PAYNO", pPp19Payno);
			cmd.addParameter("@P_PP19_GRS", pPp19Grs);
			cmd.addParameter("@P_PP20_PAYNO", pPp20Payno);
			cmd.addParameter("@P_PP20_GRS", pPp20Grs);
			cmd.addParameter("@P_PP21_PAYNO", pPp21Payno);
			cmd.addParameter("@P_PP21_GRS", pPp21Grs);
			cmd.addParameter("@P_PP22_PAYNO", pPp22Payno);
			cmd.addParameter("@P_PP22_GRS", pPp22Grs);
			cmd.addParameter("@P_PP23_PAYNO", pPp23Payno);
			cmd.addParameter("@P_PP23_GRS", pPp23Grs);
			cmd.addParameter("@P_PP24_PAYNO", pPp24Payno);
			cmd.addParameter("@P_PP24_GRS", pPp24Grs);
			cmd.addParameter("@P_PP25_PAYNO", pPp25Payno);
			cmd.addParameter("@P_PP25_GRS", pPp25Grs);
			cmd.addParameter("@P_PP26_PAYNO", pPp26Payno);
			cmd.addParameter("@P_PP26_GRS", pPp26Grs);
			cmd.addParameter("@P_PP27_PAYNO", pPp27Payno);
			cmd.addParameter("@P_PP27_GRS", pPp27Grs);
			cmd.addParameter("@P_COMMENT_LINE1", pCommentLine1);
			cmd.addParameter("@P_COMMENT_LINE2", pCommentLine2);
			cmd.addParameter("@P_COMMENT_LINE3", pCommentLine3);
			cmd.addParameter("@P_COMMENT_LINE4", pCommentLine4);
			cmd.addParameter("@P_COMMENT_LINE5", pCommentLine5);
			cmd.addParameter("@P_COMMENT_LINE6", pCommentLine6);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MONEY_TYPE1", pMoneyType1);
			cmd.addParameter("@P_MONEY_TYPE2", pMoneyType2);
			cmd.addParameter("@P_MONEY_TYPE3", pMoneyType3);
			cmd.addParameter("@P_PP28_PAYNO", pPp28Payno);
			cmd.addParameter("@P_PP28_GRS", pPp28Grs);
			cmd.addParameter("@P_PP29_PAYNO", pPp29Payno);
			cmd.addParameter("@P_PP29_GRS", pPp29Grs);
			cmd.addParameter("@P_PP30_PAYNO", pPp30Payno);
			cmd.addParameter("@P_PP30_GRS", pPp30Grs);
			cmd.addParameter("@P_PP31_PAYNO", pPp31Payno);
			cmd.addParameter("@P_PP31_GRS", pPp31Grs);
			cmd.addParameter("@P_PP32_PAYNO", pPp32Payno);
			cmd.addParameter("@P_PP32_GRS", pPp32Grs);
			cmd.addParameter("@P_PP33_PAYNO", pPp33Payno);
			cmd.addParameter("@P_PP33_GRS", pPp33Grs);
			cmd.addParameter("@P_PP34_PAYNO", pPp34Payno);
			cmd.addParameter("@P_PP34_GRS", pPp34Grs);
			cmd.addParameter("@P_PP35_PAYNO", pPp35Payno);
			cmd.addParameter("@P_PP35_GRS", pPp35Grs);
			cmd.addParameter("@P_PP36_PAYNO", pPp36Payno);
			cmd.addParameter("@P_PP36_GRS", pPp36Grs);
			cmd.addParameter("@P_PP37_PAYNO", pPp37Payno);
			cmd.addParameter("@P_PP37_GRS", pPp37Grs);
			cmd.addParameter("@P_PP38_PAYNO", pPp38Payno);
			cmd.addParameter("@P_PP38_GRS", pPp38Grs);
			cmd.addParameter("@P_PP39_PAYNO", pPp39Payno);
			cmd.addParameter("@P_PP39_GRS", pPp39Grs);
			cmd.addParameter("@P_PP40_PAYNO", pPp40Payno);
			cmd.addParameter("@P_PP40_GRS", pPp40Grs);
			cmd.addParameter("@P_PP41_PAYNO", pPp41Payno);
			cmd.addParameter("@P_PP41_GRS", pPp41Grs);
			cmd.addParameter("@P_PP42_PAYNO", pPp42Payno);
			cmd.addParameter("@P_PP42_GRS", pPp42Grs);
			cmd.addParameter("@P_PP43_PAYNO", pPp43Payno);
			cmd.addParameter("@P_PP43_GRS", pPp43Grs);
			cmd.addParameter("@P_PP44_PAYNO", pPp44Payno);
			cmd.addParameter("@P_PP44_GRS", pPp44Grs);
			cmd.addParameter("@P_PP45_PAYNO", pPp45Payno);
			cmd.addParameter("@P_PP45_GRS", pPp45Grs);
			cmd.addParameter("@P_PP46_PAYNO", pPp46Payno);
			cmd.addParameter("@P_PP46_GRS", pPp46Grs);
			cmd.addParameter("@P_PP47_PAYNO", pPp47Payno);
			cmd.addParameter("@P_PP47_GRS", pPp47Grs);
			cmd.addParameter("@P_PP48_PAYNO", pPp48Payno);
			cmd.addParameter("@P_PP48_GRS", pPp48Grs);
			cmd.addParameter("@P_PP49_PAYNO", pPp49Payno);
			cmd.addParameter("@P_PP49_GRS", pPp49Grs);
			cmd.addParameter("@P_PP50_PAYNO", pPp50Payno);
			cmd.addParameter("@P_PP50_GRS", pPp50Grs);
			cmd.addParameter("@P_PP51_PAYNO", pPp51Payno);
			cmd.addParameter("@P_PP51_GRS", pPp51Grs);
			cmd.addParameter("@P_PP52_PAYNO", pPp52Payno);
			cmd.addParameter("@P_PP52_GRS", pPp52Grs);
			cmd.addParameter("@P_PP53_PAYNO", pPp53Payno);
			cmd.addParameter("@P_PP53_GRS", pPp53Grs);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PP1_HRS", pPp1Hrs);
			cmd.addParameter("@P_PP2_HRS", pPp2Hrs);
			cmd.addParameter("@P_PP3_HRS", pPp3Hrs);
			cmd.addParameter("@P_PP4_HRS", pPp4Hrs);
			cmd.addParameter("@P_PP5_HRS", pPp5Hrs);
			cmd.addParameter("@P_PP6_HRS", pPp6Hrs);
			cmd.addParameter("@P_PP7_HRS", pPp7Hrs);
			cmd.addParameter("@P_PP8_HRS", pPp8Hrs);
			cmd.addParameter("@P_PP9_HRS", pPp9Hrs);
			cmd.addParameter("@P_PP10_HRS", pPp10Hrs);
			cmd.addParameter("@P_PP11_HRS", pPp11Hrs);
			cmd.addParameter("@P_PP12_HRS", pPp12Hrs);
			cmd.addParameter("@P_PP13_HRS", pPp13Hrs);
			cmd.addParameter("@P_PP14_HRS", pPp14Hrs);
			cmd.addParameter("@P_PP15_HRS", pPp15Hrs);
			cmd.addParameter("@P_PP16_HRS", pPp16Hrs);
			cmd.addParameter("@P_PP17_HRS", pPp17Hrs);
			cmd.addParameter("@P_PP18_HRS", pPp18Hrs);
			cmd.addParameter("@P_PP19_HRS", pPp19Hrs);
			cmd.addParameter("@P_PP20_HRS", pPp20Hrs);
			cmd.addParameter("@P_PP21_HRS", pPp21Hrs);
			cmd.addParameter("@P_PP22_HRS", pPp22Hrs);
			cmd.addParameter("@P_PP23_HRS", pPp23Hrs);
			cmd.addParameter("@P_PP24_HRS", pPp24Hrs);
			cmd.addParameter("@P_PP25_HRS", pPp25Hrs);
			cmd.addParameter("@P_PP26_HRS", pPp26Hrs);
			cmd.addParameter("@P_PP27_HRS", pPp27Hrs);
			cmd.addParameter("@P_PP28_HRS", pPp28Hrs);
			cmd.addParameter("@P_PP29_HRS", pPp29Hrs);
			cmd.addParameter("@P_PP30_HRS", pPp30Hrs);
			cmd.addParameter("@P_PP31_HRS", pPp31Hrs);
			cmd.addParameter("@P_PP32_HRS", pPp32Hrs);
			cmd.addParameter("@P_PP33_HRS", pPp33Hrs);
			cmd.addParameter("@P_PP34_HRS", pPp34Hrs);
			cmd.addParameter("@P_PP35_HRS", pPp35Hrs);
			cmd.addParameter("@P_PP36_HRS", pPp36Hrs);
			cmd.addParameter("@P_PP37_HRS", pPp37Hrs);
			cmd.addParameter("@P_PP38_HRS", pPp38Hrs);
			cmd.addParameter("@P_PP39_HRS", pPp39Hrs);
			cmd.addParameter("@P_PP40_HRS", pPp40Hrs);
			cmd.addParameter("@P_PP41_HRS", pPp41Hrs);
			cmd.addParameter("@P_PP42_HRS", pPp42Hrs);
			cmd.addParameter("@P_PP43_HRS", pPp43Hrs);
			cmd.addParameter("@P_PP44_HRS", pPp44Hrs);
			cmd.addParameter("@P_PP45_HRS", pPp45Hrs);
			cmd.addParameter("@P_PP46_HRS", pPp46Hrs);
			cmd.addParameter("@P_PP47_HRS", pPp47Hrs);
			cmd.addParameter("@P_PP48_HRS", pPp48Hrs);
			cmd.addParameter("@P_PP49_HRS", pPp49Hrs);
			cmd.addParameter("@P_PP50_HRS", pPp50Hrs);
			cmd.addParameter("@P_PP51_HRS", pPp51Hrs);
			cmd.addParameter("@P_PP52_HRS", pPp52Hrs);
			cmd.addParameter("@P_PP53_HRS", pPp53Hrs);
			cmd.addParameter("@P_BULK_FILE_NAME", pBulkFileName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRoecCodeExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ROEC_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSinExists(NNumber pPidm,NString pSin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_SIN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SIN", pSin);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidEmprCode(NNumber pPidm,NString pEmprCode,NString pPictCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_VALID_EMPR_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(final Map<String, Object> pPxrroecRecord) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM",                        (NNumber) pPxrroecRecord.get("pPidm"));                  
			cmd.addParameter("@P_SEQ_NO",                      (NNumber) pPxrroecRecord.get("pSeqNo"));                 
			cmd.addParameter("@P_PICT_CODE",                   (NString) pPxrroecRecord.get("pPictCode"));              
			cmd.addParameter("@P_EMPR_CODE",                   (NString) pPxrroecRecord.get("pEmprCode"));              
			cmd.addParameter("@P_EMPR_FED_EIN",                (NString) pPxrroecRecord.get("pEmprFedEin"));            
			cmd.addParameter("@P_PRINT_IND",                   (NString) pPxrroecRecord.get("pPrintInd"));              
			cmd.addParameter("@P_REPRINT_IND",                 (NString) pPxrroecRecord.get("pReprintInd"));            
			cmd.addParameter("@P_SERIAL_NO",                   (NString) pPxrroecRecord.get("pSerialNo"));              
			cmd.addParameter("@P_AMENDS_SERIAL_NO",            (NString) pPxrroecRecord.get("pAmendsSerialNo"));        
			cmd.addParameter("@P_LANGUAGE_IND",                (NString) pPxrroecRecord.get("pLanguageInd"));           
			cmd.addParameter("@P_ISSUE_DATE",                  (NDate)   pPxrroecRecord.get("pIssueDate"));             
			cmd.addParameter("@P_REFERENCE_NUMBER",            (NString) pPxrroecRecord.get("pReferenceNumber"));       
			cmd.addParameter("@P_SIN",                         (NString) pPxrroecRecord.get("pSin"));                   
			cmd.addParameter("@P_JOB_TITLE",                   (NString) pPxrroecRecord.get("pJobTitle"));              
			cmd.addParameter("@P_FIRST_DAY_WORKED",            (NDate)   pPxrroecRecord.get("pFirstDayWorked"));        
			cmd.addParameter("@P_LAST_DAY_WORKED",             (NDate)   pPxrroecRecord.get("pLastDayWorked"));         
			cmd.addParameter("@P_FINAL_PAY_DATE",              (NDate)   pPxrroecRecord.get("pFinalPayDate"));          
			cmd.addParameter("@P_RECALL_IND",                  (NString) pPxrroecRecord.get("pRecallInd"));             
			cmd.addParameter("@P_RECALL_DATE",                 (NDate)   pPxrroecRecord.get("pRecallDate"));            
			cmd.addParameter("@P_ROEC_CODE",                   (NString) pPxrroecRecord.get("pRoecCode"));              
			cmd.addParameter("@P_TOTAL_HRS",                   (NNumber) pPxrroecRecord.get("pTotalHrs"));              
			cmd.addParameter("@P_TOTAL_GRS",                   (NNumber) pPxrroecRecord.get("pTotalGrs"));              
			cmd.addParameter("@P_1996_WEEKS",                  (NNumber) pPxrroecRecord.get("p1996Weeks"));             
			cmd.addParameter("@P_1996_EARNINGS",               (NNumber) pPxrroecRecord.get("p1996Earnings"));          
			cmd.addParameter("@P_CONTACT_PIDM",                (NNumber) pPxrroecRecord.get("pContactPidm"));           
			cmd.addParameter("@P_CONTACT_TELE_AREA_CODE",      (NString) pPxrroecRecord.get("pContactTeleAreaCode"));   
			cmd.addParameter("@P_CONTACT_TELE_NUMBER",         (NString) pPxrroecRecord.get("pContactTeleNumber"));     
			cmd.addParameter("@P_CONTACT_TELE_EXT",            (NString) pPxrroecRecord.get("pContactTeleExt"));        
			cmd.addParameter("@P_ISSUING_PIDM",                (NNumber) pPxrroecRecord.get("pIssuingPidm"));           
			cmd.addParameter("@P_ISSUING_TELE_AREA_CODE",      (NString) pPxrroecRecord.get("pIssuingTeleAreaCode"));   
			cmd.addParameter("@P_ISSUING_TELE_NUMBER",         (NString) pPxrroecRecord.get("pIssuingTeleNumber"));     
			cmd.addParameter("@P_ISSUSING_TELE_EXT",           (NString) pPxrroecRecord.get("pIssusingTeleExt"));       
			cmd.addParameter("@P_EARN_CODE_VAC",               (NString) pPxrroecRecord.get("pEarnCodeVac"));           
			cmd.addParameter("@P_VAC_GRS",                     (NNumber) pPxrroecRecord.get("pVacGrs"));                
			cmd.addParameter("@P_STAT_HOL_EARN_CODE1",         (NString) pPxrroecRecord.get("pStatHolEarnCode1"));      
			cmd.addParameter("@P_STAT_HOL_DATE1",              (NDate)   pPxrroecRecord.get("pStatHolDate1"));          
			cmd.addParameter("@P_STAT_HOL_GRS1",               (NNumber) pPxrroecRecord.get("pStatHolGrs1"));           
			cmd.addParameter("@P_STAT_HOL_EARN_CODE2",         (NString) pPxrroecRecord.get("pStatHolEarnCode2"));      
			cmd.addParameter("@P_STAT_HOL_DATE2",              (NDate)   pPxrroecRecord.get("pStatHolDate2"));          
			cmd.addParameter("@P_STAT_HOL_GRS2",               (NNumber) pPxrroecRecord.get("pStatHolGrs2"));           
			cmd.addParameter("@P_STAT_HOL_EARN_CODE3",         (NString) pPxrroecRecord.get("pStatHolEarnCode3"));      
			cmd.addParameter("@P_STAT_HOL_DATE3",              (NDate)   pPxrroecRecord.get("pStatHolDate3"));          
			cmd.addParameter("@P_STAT_HOL_GRS3",               (NNumber) pPxrroecRecord.get("pStatHolGrs3"));           
			cmd.addParameter("@P_OTHER_EARN_CODE1",            (NString) pPxrroecRecord.get("pOtherEarnCode1"));        
			cmd.addParameter("@P_OTHER_EARN_CODE1_GRS",        (NNumber) pPxrroecRecord.get("pOtherEarnCode1Grs"));     
			cmd.addParameter("@P_OTHER_EARN_CODE2",            (NString) pPxrroecRecord.get("pOtherEarnCode2"));        
			cmd.addParameter("@P_OTHER_EARN_CODE2_GRS",        (NNumber) pPxrroecRecord.get("pOtherEarnCode2Grs"));     
			cmd.addParameter("@P_OTHER_EARN_CODE3",            (NString) pPxrroecRecord.get("pOtherEarnCode3"));        
			cmd.addParameter("@P_OTHER_EARN_CODE3_GRS",        (NNumber) pPxrroecRecord.get("pOtherEarnCode3Grs"));     
			cmd.addParameter("@P_BENEFIT_IND",                 (NString) pPxrroecRecord.get("pBenefitInd"));            
			cmd.addParameter("@P_BENEFIT_GRS",                 (NNumber) pPxrroecRecord.get("pBenefitGrs"));            
			cmd.addParameter("@P_BENEFIT_START_DATE",          (NDate)   pPxrroecRecord.get("pBenefitStartDate"));      
			cmd.addParameter("@P_BENEFIT_DAY_WEEK_IND",        (NString) pPxrroecRecord.get("pBenefitDayWeekInd"));     
			cmd.addParameter("@P_PP1_PAYNO",                   (NString) pPxrroecRecord.get("pPp1Payno"));              
			cmd.addParameter("@P_PP1_GRS",                     (NNumber) pPxrroecRecord.get("pPp1Grs"));                
			cmd.addParameter("@P_PP2_PAYNO",                   (NString) pPxrroecRecord.get("pPp2Payno"));              
			cmd.addParameter("@P_PP2_GRS",                     (NNumber) pPxrroecRecord.get("pPp2Grs"));                
			cmd.addParameter("@P_PP3_PAYNO",                   (NString) pPxrroecRecord.get("pPp3Payno"));              
			cmd.addParameter("@P_PP3_GRS",                     (NNumber) pPxrroecRecord.get("pPp3Grs"));                
			cmd.addParameter("@P_PP4_PAYNO",                   (NString) pPxrroecRecord.get("pPp4Payno"));              
			cmd.addParameter("@P_PP4_GRS",                     (NNumber) pPxrroecRecord.get("pPp4Grs"));                
			cmd.addParameter("@P_PP5_PAYNO",                   (NString) pPxrroecRecord.get("pPp5Payno"));              
			cmd.addParameter("@P_PP5_GRS",                     (NNumber) pPxrroecRecord.get("pPp5Grs"));                
			cmd.addParameter("@P_PP6_PAYNO",                   (NString) pPxrroecRecord.get("pPp6Payno"));              
			cmd.addParameter("@P_PP6_GRS",                     (NNumber) pPxrroecRecord.get("pPp6Grs"));                
			cmd.addParameter("@P_PP7_PAYNO",                   (NString) pPxrroecRecord.get("pPp7Payno"));              
			cmd.addParameter("@P_PP7_GRS",                     (NNumber) pPxrroecRecord.get("pPp7Grs"));                
			cmd.addParameter("@P_PP8_PAYNO",                   (NString) pPxrroecRecord.get("pPp8Payno"));              
			cmd.addParameter("@P_PP8_GRS",                     (NNumber) pPxrroecRecord.get("pPp8Grs"));                
			cmd.addParameter("@P_PP9_PAYNO",                   (NString) pPxrroecRecord.get("pPp9Payno"));              
			cmd.addParameter("@P_PP9_GRS",                     (NNumber) pPxrroecRecord.get("pPp9Grs"));                
			cmd.addParameter("@P_PP10_PAYNO",                  (NString) pPxrroecRecord.get("pPp10Payno"));             
			cmd.addParameter("@P_PP10_GRS",                    (NNumber) pPxrroecRecord.get("pPp10Grs"));               
			cmd.addParameter("@P_PP11_PAYNO",                  (NString) pPxrroecRecord.get("pPp11Payno"));             
			cmd.addParameter("@P_PP11_GRS",                    (NNumber) pPxrroecRecord.get("pPp11Grs"));               
			cmd.addParameter("@P_PP12_PAYNO",                  (NString) pPxrroecRecord.get("pPp12Payno"));             
			cmd.addParameter("@P_PP12_GRS",                    (NNumber) pPxrroecRecord.get("pPp12Grs"));               
			cmd.addParameter("@P_PP13_PAYNO",                  (NString) pPxrroecRecord.get("pPp13Payno"));             
			cmd.addParameter("@P_PP13_GRS",                    (NNumber) pPxrroecRecord.get("pPp13Grs"));               
			cmd.addParameter("@P_PP14_PAYNO",                  (NString) pPxrroecRecord.get("pPp14Payno"));             
			cmd.addParameter("@P_PP14_GRS",                    (NNumber) pPxrroecRecord.get("pPp14Grs"));               
			cmd.addParameter("@P_PP15_PAYNO",                  (NString) pPxrroecRecord.get("pPp15Payno"));             
			cmd.addParameter("@P_PP15_GRS",                    (NNumber) pPxrroecRecord.get("pPp15Grs"));               
			cmd.addParameter("@P_PP16_PAYNO",                  (NString) pPxrroecRecord.get("pPp16Payno"));             
			cmd.addParameter("@P_PP16_GRS",                    (NNumber) pPxrroecRecord.get("pPp16Grs"));               
			cmd.addParameter("@P_PP17_PAYNO",                  (NString) pPxrroecRecord.get("pPp17Payno"));             
			cmd.addParameter("@P_PP17_GRS",                    (NNumber) pPxrroecRecord.get("pPp17Grs"));               
			cmd.addParameter("@P_PP18_PAYNO",                  (NString) pPxrroecRecord.get("pPp18Payno"));             
			cmd.addParameter("@P_PP18_GRS",                    (NNumber) pPxrroecRecord.get("pPp18Grs"));               
			cmd.addParameter("@P_PP19_PAYNO",                  (NString) pPxrroecRecord.get("pPp19Payno"));             
			cmd.addParameter("@P_PP19_GRS",                    (NNumber) pPxrroecRecord.get("pPp19Grs"));               
			cmd.addParameter("@P_PP20_PAYNO",                  (NString) pPxrroecRecord.get("pPp20Payno"));             
			cmd.addParameter("@P_PP20_GRS",                    (NNumber) pPxrroecRecord.get("pPp20Grs"));               
			cmd.addParameter("@P_PP21_PAYNO",                  (NString) pPxrroecRecord.get("pPp21Payno"));             
			cmd.addParameter("@P_PP21_GRS",                    (NNumber) pPxrroecRecord.get("pPp21Grs"));               
			cmd.addParameter("@P_PP22_PAYNO",                  (NString) pPxrroecRecord.get("pPp22Payno"));             
			cmd.addParameter("@P_PP22_GRS",                    (NNumber) pPxrroecRecord.get("pPp22Grs"));               
			cmd.addParameter("@P_PP23_PAYNO",                  (NString) pPxrroecRecord.get("pPp23Payno"));             
			cmd.addParameter("@P_PP23_GRS",                    (NNumber) pPxrroecRecord.get("pPp23Grs"));               
			cmd.addParameter("@P_PP24_PAYNO",                  (NString) pPxrroecRecord.get("pPp24Payno"));             
			cmd.addParameter("@P_PP24_GRS",                    (NNumber) pPxrroecRecord.get("pPp24Grs"));               
			cmd.addParameter("@P_PP25_PAYNO",                  (NString) pPxrroecRecord.get("pPp25Payno"));             
			cmd.addParameter("@P_PP25_GRS",                    (NNumber) pPxrroecRecord.get("pPp25Grs"));               
			cmd.addParameter("@P_PP26_PAYNO",                  (NString) pPxrroecRecord.get("pPp26Payno"));             
			cmd.addParameter("@P_PP26_GRS",                    (NNumber) pPxrroecRecord.get("pPp26Grs"));               
			cmd.addParameter("@P_PP27_PAYNO",                  (NString) pPxrroecRecord.get("pPp27Payno"));             
			cmd.addParameter("@P_PP27_GRS",                    (NNumber) pPxrroecRecord.get("pPp27Grs"));               
			cmd.addParameter("@P_COMMENT_LINE1",               (NString) pPxrroecRecord.get("pCommentLine1"));          
			cmd.addParameter("@P_COMMENT_LINE2",               (NString) pPxrroecRecord.get("pCommentLine2"));          
			cmd.addParameter("@P_COMMENT_LINE3",               (NString) pPxrroecRecord.get("pCommentLine3"));          
			cmd.addParameter("@P_COMMENT_LINE4",               (NString) pPxrroecRecord.get("pCommentLine4"));          
			cmd.addParameter("@P_COMMENT_LINE5",               (NString) pPxrroecRecord.get("pCommentLine5"));          
			cmd.addParameter("@P_COMMENT_LINE6",               (NString) pPxrroecRecord.get("pCommentLine6"));          
			cmd.addParameter("@P_USER_ID",                     (NString) pPxrroecRecord.get("pUserId"));                
			cmd.addParameter("@P_MONEY_TYPE1",                 (NString) pPxrroecRecord.get("pMoneyType1"));            
			cmd.addParameter("@P_MONEY_TYPE2",                 (NString) pPxrroecRecord.get("pMoneyType2"));            
			cmd.addParameter("@P_MONEY_TYPE3",                 (NString) pPxrroecRecord.get("pMoneyType3"));            
			cmd.addParameter("@P_PP28_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp28Payno"));             
			cmd.addParameter("@P_PP28_GRS",                    (NNumber) pPxrroecRecord.get("pPp28Grs"));               
			cmd.addParameter("@P_PP29_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp29Payno"));             
			cmd.addParameter("@P_PP29_GRS",                    (NNumber) pPxrroecRecord.get("pPp29Grs"));               
			cmd.addParameter("@P_PP30_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp30Payno"));             
			cmd.addParameter("@P_PP30_GRS",                    (NNumber) pPxrroecRecord.get("pPp30Grs"));               
			cmd.addParameter("@P_PP31_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp31Payno"));             
			cmd.addParameter("@P_PP31_GRS",                    (NNumber) pPxrroecRecord.get("pPp31Grs"));               
			cmd.addParameter("@P_PP32_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp32Payno"));             
			cmd.addParameter("@P_PP32_GRS",                    (NNumber) pPxrroecRecord.get("pPp32Grs"));               
			cmd.addParameter("@P_PP33_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp33Payno"));             
			cmd.addParameter("@P_PP33_GRS",                    (NNumber) pPxrroecRecord.get("pPp33Grs"));               
			cmd.addParameter("@P_PP34_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp34Payno"));             
			cmd.addParameter("@P_PP34_GRS",                    (NNumber) pPxrroecRecord.get("pPp34Grs"));               
			cmd.addParameter("@P_PP35_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp35Payno"));             
			cmd.addParameter("@P_PP35_GRS",                    (NNumber) pPxrroecRecord.get("pPp35Grs"));               
			cmd.addParameter("@P_PP36_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp36Payno"));             
			cmd.addParameter("@P_PP36_GRS",                    (NNumber) pPxrroecRecord.get("pPp36Grs"));               
			cmd.addParameter("@P_PP37_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp37Payno"));             
			cmd.addParameter("@P_PP37_GRS",                    (NNumber) pPxrroecRecord.get("pPp37Grs"));               
			cmd.addParameter("@P_PP38_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp38Payno"));             
			cmd.addParameter("@P_PP38_GRS",                    (NNumber) pPxrroecRecord.get("pPp38Grs"));               
			cmd.addParameter("@P_PP39_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp39Payno"));             
			cmd.addParameter("@P_PP39_GRS",                    (NNumber) pPxrroecRecord.get("pPp39Grs"));               
			cmd.addParameter("@P_PP40_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp40Payno"));             
			cmd.addParameter("@P_PP40_GRS",                    (NNumber) pPxrroecRecord.get("pPp40Grs"));               
			cmd.addParameter("@P_PP41_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp41Payno"));             
			cmd.addParameter("@P_PP41_GRS",                    (NNumber) pPxrroecRecord.get("pPp41Grs"));               
			cmd.addParameter("@P_PP42_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp42Payno"));             
			cmd.addParameter("@P_PP42_GRS",                    (NNumber) pPxrroecRecord.get("pPp42Grs"));               
			cmd.addParameter("@P_PP43_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp43Payno"));             
			cmd.addParameter("@P_PP43_GRS",                    (NNumber) pPxrroecRecord.get("pPp43Grs"));               
			cmd.addParameter("@P_PP44_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp44Payno"));             
			cmd.addParameter("@P_PP44_GRS",                    (NNumber) pPxrroecRecord.get("pPp44Grs"));               
			cmd.addParameter("@P_PP45_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp45Payno"));             
			cmd.addParameter("@P_PP45_GRS",                    (NNumber) pPxrroecRecord.get("pPp45Grs"));               
			cmd.addParameter("@P_PP46_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp46Payno"));             
			cmd.addParameter("@P_PP46_GRS",                    (NNumber) pPxrroecRecord.get("pPp46Grs"));               
			cmd.addParameter("@P_PP47_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp47Payno"));             
			cmd.addParameter("@P_PP47_GRS",                    (NNumber) pPxrroecRecord.get("pPp47Grs"));               
			cmd.addParameter("@P_PP48_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp48Payno"));             
			cmd.addParameter("@P_PP48_GRS",                    (NNumber) pPxrroecRecord.get("pPp48Grs"));               
			cmd.addParameter("@P_PP49_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp49Payno"));             
			cmd.addParameter("@P_PP49_GRS",                    (NNumber) pPxrroecRecord.get("pPp49Grs"));               
			cmd.addParameter("@P_PP50_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp50Payno"));             
			cmd.addParameter("@P_PP50_GRS",                    (NNumber) pPxrroecRecord.get("pPp50Grs"));               
			cmd.addParameter("@P_PP51_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp51Payno"));             
			cmd.addParameter("@P_PP51_GRS",                    (NNumber) pPxrroecRecord.get("pPp51Grs"));               
			cmd.addParameter("@P_PP52_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp52Payno"));             
			cmd.addParameter("@P_PP52_GRS",                    (NNumber) pPxrroecRecord.get("pPp52Grs"));               
			cmd.addParameter("@P_PP53_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp53Payno"));             
			cmd.addParameter("@P_PP53_GRS",                    (NNumber) pPxrroecRecord.get("pPp53Grs"));               
			cmd.addParameter("@P_DATA_ORIGIN",                 (NString) pPxrroecRecord.get("pDataOrigin"));            
			cmd.addParameter("@P_PP1_HRS",                     (NNumber) pPxrroecRecord.get("pPp1Hrs"));                
			cmd.addParameter("@P_PP2_HRS",                     (NNumber) pPxrroecRecord.get("pPp2Hrs"));                
			cmd.addParameter("@P_PP3_HRS",                     (NNumber) pPxrroecRecord.get("pPp3Hrs"));                
			cmd.addParameter("@P_PP4_HRS",                     (NNumber) pPxrroecRecord.get("pPp4Hrs"));                
			cmd.addParameter("@P_PP5_HRS",                     (NNumber) pPxrroecRecord.get("pPp5Hrs"));                
			cmd.addParameter("@P_PP6_HRS",                     (NNumber) pPxrroecRecord.get("pPp6Hrs"));                
			cmd.addParameter("@P_PP7_HRS",                     (NNumber) pPxrroecRecord.get("pPp7Hrs"));                
			cmd.addParameter("@P_PP8_HRS",                     (NNumber) pPxrroecRecord.get("pPp8Hrs"));                
			cmd.addParameter("@P_PP9_HRS",                     (NNumber) pPxrroecRecord.get("pPp9Hrs"));                
			cmd.addParameter("@P_PP10_HRS",                    (NNumber) pPxrroecRecord.get("pPp10Hrs"));               
			cmd.addParameter("@P_PP11_HRS",                    (NNumber) pPxrroecRecord.get("pPp11Hrs"));               
			cmd.addParameter("@P_PP12_HRS",                    (NNumber) pPxrroecRecord.get("pPp12Hrs"));               
			cmd.addParameter("@P_PP13_HRS",                    (NNumber) pPxrroecRecord.get("pPp13Hrs"));               
			cmd.addParameter("@P_PP14_HRS",                    (NNumber) pPxrroecRecord.get("pPp14Hrs"));               
			cmd.addParameter("@P_PP15_HRS",                    (NNumber) pPxrroecRecord.get("pPp15Hrs"));               
			cmd.addParameter("@P_PP16_HRS",                    (NNumber) pPxrroecRecord.get("pPp16Hrs"));               
			cmd.addParameter("@P_PP17_HRS",                    (NNumber) pPxrroecRecord.get("pPp17Hrs"));               
			cmd.addParameter("@P_PP18_HRS",                    (NNumber) pPxrroecRecord.get("pPp18Hrs"));               
			cmd.addParameter("@P_PP19_HRS",                    (NNumber) pPxrroecRecord.get("pPp19Hrs"));               
			cmd.addParameter("@P_PP20_HRS",                    (NNumber) pPxrroecRecord.get("pPp20Hrs"));               
			cmd.addParameter("@P_PP21_HRS",                    (NNumber) pPxrroecRecord.get("pPp21Hrs"));               
			cmd.addParameter("@P_PP22_HRS",                    (NNumber) pPxrroecRecord.get("pPp22Hrs"));               
			cmd.addParameter("@P_PP23_HRS",                    (NNumber) pPxrroecRecord.get("pPp23Hrs"));               
			cmd.addParameter("@P_PP24_HRS",                    (NNumber) pPxrroecRecord.get("pPp24Hrs"));               
			cmd.addParameter("@P_PP25_HRS",                    (NNumber) pPxrroecRecord.get("pPp25Hrs"));               
			cmd.addParameter("@P_PP26_HRS",                    (NNumber) pPxrroecRecord.get("pPp26Hrs"));               
			cmd.addParameter("@P_PP27_HRS",                    (NNumber) pPxrroecRecord.get("pPp27Hrs"));               
			cmd.addParameter("@P_PP28_HRS",                    (NNumber) pPxrroecRecord.get("pPp28Hrs"));               
			cmd.addParameter("@P_PP29_HRS",                    (NNumber) pPxrroecRecord.get("pPp29Hrs"));               
			cmd.addParameter("@P_PP30_HRS",                    (NNumber) pPxrroecRecord.get("pPp30Hrs"));               
			cmd.addParameter("@P_PP31_HRS",                    (NNumber) pPxrroecRecord.get("pPp31Hrs"));               
			cmd.addParameter("@P_PP32_HRS",                    (NNumber) pPxrroecRecord.get("pPp32Hrs"));               
			cmd.addParameter("@P_PP33_HRS",                    (NNumber) pPxrroecRecord.get("pPp33Hrs"));               
			cmd.addParameter("@P_PP34_HRS",                    (NNumber) pPxrroecRecord.get("pPp34Hrs"));               
			cmd.addParameter("@P_PP35_HRS",                    (NNumber) pPxrroecRecord.get("pPp35Hrs"));               
			cmd.addParameter("@P_PP36_HRS",                    (NNumber) pPxrroecRecord.get("pPp36Hrs"));               
			cmd.addParameter("@P_PP37_HRS",                    (NNumber) pPxrroecRecord.get("pPp37Hrs"));               
			cmd.addParameter("@P_PP38_HRS",                    (NNumber) pPxrroecRecord.get("pPp38Hrs"));               
			cmd.addParameter("@P_PP39_HRS",                    (NNumber) pPxrroecRecord.get("pPp39Hrs"));               
			cmd.addParameter("@P_PP40_HRS",                    (NNumber) pPxrroecRecord.get("pPp40Hrs"));               
			cmd.addParameter("@P_PP41_HRS",                    (NNumber) pPxrroecRecord.get("pPp41Hrs"));               
			cmd.addParameter("@P_PP42_HRS",                    (NNumber) pPxrroecRecord.get("pPp42Hrs"));               
			cmd.addParameter("@P_PP43_HRS",                    (NNumber) pPxrroecRecord.get("pPp43Hrs"));               
			cmd.addParameter("@P_PP44_HRS",                    (NNumber) pPxrroecRecord.get("pPp44Hrs"));               
			cmd.addParameter("@P_PP45_HRS",                    (NNumber) pPxrroecRecord.get("pPp45Hrs"));               
			cmd.addParameter("@P_PP46_HRS",                    (NNumber) pPxrroecRecord.get("pPp46Hrs"));               
			cmd.addParameter("@P_PP47_HRS",                    (NNumber) pPxrroecRecord.get("pPp47Hrs"));               
			cmd.addParameter("@P_PP48_HRS",                    (NNumber) pPxrroecRecord.get("pPp48Hrs"));               
			cmd.addParameter("@P_PP49_HRS",                    (NNumber) pPxrroecRecord.get("pPp49Hrs"));               
			cmd.addParameter("@P_PP50_HRS",                    (NNumber) pPxrroecRecord.get("pPp50Hrs"));               
			cmd.addParameter("@P_PP51_HRS",                    (NNumber) pPxrroecRecord.get("pPp51Hrs"));               
			cmd.addParameter("@P_PP52_HRS",                    (NNumber) pPxrroecRecord.get("pPp52Hrs"));               
			cmd.addParameter("@P_PP53_HRS",                    (NNumber) pPxrroecRecord.get("pPp53Hrs"));               
			cmd.addParameter("@P_BULK_FILE_NAME",              (NString) pPxrroecRecord.get("pBulkFileName"));          
			cmd.addParameter("@P_VAC_ROEV_CODE",               (NString) pPxrroecRecord.get("pVacRoevCode"));           
			cmd.addParameter("@P_VAC_START_DATE",              (NDate)   pPxrroecRecord.get("pVacStartDate"));          
			cmd.addParameter("@P_VAC_END_DATE",                (NDate)   pPxrroecRecord.get("pVacEndDate"));            
			cmd.addParameter("@P_STAT_HOL_EARN_CODE4",         (NString) pPxrroecRecord.get("pStatHolEarnCode4"));      
			cmd.addParameter("@P_STAT_HOL_DATE4",              (NDate)   pPxrroecRecord.get("pStatHolDate4"));          
			cmd.addParameter("@P_STAT_HOL_GRS4",               (NNumber) pPxrroecRecord.get("pStatHolGrs4"));           
			cmd.addParameter("@P_STAT_HOL_EARN_CODE5",         (NString) pPxrroecRecord.get("pStatHolEarnCode5"));      
			cmd.addParameter("@P_STAT_HOL_DATE5",              (NDate)   pPxrroecRecord.get("pStatHolDate5"));          
			cmd.addParameter("@P_STAT_HOL_GRS5",               (NNumber) pPxrroecRecord.get("pStatHolGrs5"));           
			cmd.addParameter("@P_OTHER_START_DATE1",           (NDate)   pPxrroecRecord.get("pOtherStartDate1"));       
			cmd.addParameter("@P_OTHER_END_DATE1",             (NDate)   pPxrroecRecord.get("pOtherEndDate1"));         
			cmd.addParameter("@P_OTHER_START_DATE2",           (NDate)   pPxrroecRecord.get("pOtherStartDate2"));       
			cmd.addParameter("@P_OTHER_END_DATE2",             (NDate)   pPxrroecRecord.get("pOtherEndDate2"));         
			cmd.addParameter("@P_OTHER_START_DATE3",           (NDate)   pPxrroecRecord.get("pOtherStartDate3"));       
			cmd.addParameter("@P_OTHER_END_DATE3",             (NDate)   pPxrroecRecord.get("pOtherEndDate3"));         
			cmd.addParameter("@P_BENEFIT_ROES_CODE",           (NString) pPxrroecRecord.get("pBenefitRoesCode"));       
			cmd.addParameter("@P_BENEFIT_END_DATE",            (NDate)   pPxrroecRecord.get("pBenefitEndDate"));        
			cmd.addParameter("@P_BENEFIT_ROES_CODE2",          (NString) pPxrroecRecord.get("pBenefitRoesCode2"));      
			cmd.addParameter("@P_BENEFIT_GRS2",                (NNumber) pPxrroecRecord.get("pBenefitGrs2"));           
			cmd.addParameter("@P_BENEFIT_START_DATE2",         (NDate)   pPxrroecRecord.get("pBenefit_start_date2"));   
			cmd.addParameter("@P_BENEFIT_END_DATE2",           (NDate)   pPxrroecRecord.get("pBenefitEndDate2"));       
			cmd.addParameter("@P_BENEFIT_DAY_WEEK_IND2",       (NString) pPxrroecRecord.get("pBenefitDayWeek_ind2"));   
			cmd.addParameter("@P_BENEFIT_ROES_CODE3",          (NString) pPxrroecRecord.get("pBenefitRoesCode3"));      
			cmd.addParameter("@P_BENEFIT_GRS3",                (NNumber) pPxrroecRecord.get("pBenefitGrs3"));           
			cmd.addParameter("@P_BENEFIT_START_DATE3",         (NDate)   pPxrroecRecord.get("pBenefitStartDate3"));     
			cmd.addParameter("@P_BENEFIT_END_DATE3",           (NDate)   pPxrroecRecord.get("pBenefitEndDate3"));       
			cmd.addParameter("@P_BENEFIT_DAY_WEEK_IND3",       (NString) pPxrroecRecord.get("pBenefitDayWeekInd3"));    
			cmd.addParameter("@P_BENEFIT_ROES_CODE4",          (NString) pPxrroecRecord.get("pBenefitRoesCode4"));      
			cmd.addParameter("@P_BENEFIT_GRS4",                (NNumber) pPxrroecRecord.get("pBenefitGrs4"));           
			cmd.addParameter("@P_BENEFIT_START_DATE4",         (NDate)   pPxrroecRecord.get("pBenefitStartDate4"));     
			cmd.addParameter("@P_BENEFIT_END_DATE4",           (NDate)   pPxrroecRecord.get("pBenefitEndDate4"));       
			cmd.addParameter("@P_BENEFIT_DAY_WEEK_IND4",       (NString) pPxrroecRecord.get("pBenefitDayWeekInd4"));    
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			
			pPxrroecRecord.put("pRowid",    cmd.getParameterValue("@P_ROWID_OUT", NString.class));
		


		}
		
		public static void pDelete(NNumber pPidm,NNumber pSeqNo,NString pPictCode,NString pEmprCode,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pSeqNo,NString pPictCode,NString pEmprCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(final Map<String, Object> pPxrroecRecord) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM",                        (NNumber) pPxrroecRecord.get("pPidm"));                  
			cmd.addParameter("@P_SEQ_NO",                      (NNumber) pPxrroecRecord.get("pSeqNo"));                 
			cmd.addParameter("@P_PICT_CODE",                   (NString) pPxrroecRecord.get("pPictCode"));              
			cmd.addParameter("@P_EMPR_CODE",                   (NString) pPxrroecRecord.get("pEmprCode"));              
			cmd.addParameter("@P_EMPR_FED_EIN",                (NString) pPxrroecRecord.get("pEmprFedEin"));            
			cmd.addParameter("@P_PRINT_IND",                   (NString) pPxrroecRecord.get("pPrintInd"));              
			cmd.addParameter("@P_REPRINT_IND",                 (NString) pPxrroecRecord.get("pReprintInd"));            
			cmd.addParameter("@P_SERIAL_NO",                   (NString) pPxrroecRecord.get("pSerialNo"));              
			cmd.addParameter("@P_AMENDS_SERIAL_NO",            (NString) pPxrroecRecord.get("pAmendsSerialNo"));        
			cmd.addParameter("@P_LANGUAGE_IND",                (NString) pPxrroecRecord.get("pLanguageInd"));           
			cmd.addParameter("@P_ISSUE_DATE",                  (NDate)   pPxrroecRecord.get("pIssueDate"));             
			cmd.addParameter("@P_REFERENCE_NUMBER",            (NString) pPxrroecRecord.get("pReferenceNumber"));       
			cmd.addParameter("@P_SIN",                         (NString) pPxrroecRecord.get("pSin"));                   
			cmd.addParameter("@P_JOB_TITLE",                   (NString) pPxrroecRecord.get("pJobTitle"));              
			cmd.addParameter("@P_FIRST_DAY_WORKED",            (NDate)   pPxrroecRecord.get("pFirstDayWorked"));        
			cmd.addParameter("@P_LAST_DAY_WORKED",             (NDate)   pPxrroecRecord.get("pLastDayWorked"));         
			cmd.addParameter("@P_FINAL_PAY_DATE",              (NDate)   pPxrroecRecord.get("pFinalPayDate"));          
			cmd.addParameter("@P_RECALL_IND",                  (NString) pPxrroecRecord.get("pRecallInd"));             
			cmd.addParameter("@P_RECALL_DATE",                 (NDate)   pPxrroecRecord.get("pRecallDate"));            
			cmd.addParameter("@P_ROEC_CODE",                   (NString) pPxrroecRecord.get("pRoecCode"));              
			cmd.addParameter("@P_TOTAL_HRS",                   (NNumber) pPxrroecRecord.get("pTotalHrs"));              
			cmd.addParameter("@P_TOTAL_GRS",                   (NNumber) pPxrroecRecord.get("pTotalGrs"));              
			cmd.addParameter("@P_1996_WEEKS",                  (NNumber) pPxrroecRecord.get("p1996Weeks"));             
			cmd.addParameter("@P_1996_EARNINGS",               (NNumber) pPxrroecRecord.get("p1996Earnings"));          
			cmd.addParameter("@P_CONTACT_PIDM",                (NNumber) pPxrroecRecord.get("pContactPidm"));           
			cmd.addParameter("@P_CONTACT_TELE_AREA_CODE",      (NString) pPxrroecRecord.get("pContactTeleAreaCode"));   
			cmd.addParameter("@P_CONTACT_TELE_NUMBER",         (NString) pPxrroecRecord.get("pContactTeleNumber"));     
			cmd.addParameter("@P_CONTACT_TELE_EXT",            (NString) pPxrroecRecord.get("pContactTeleExt"));        
			cmd.addParameter("@P_ISSUING_PIDM",                (NNumber) pPxrroecRecord.get("pIssuingPidm"));           
			cmd.addParameter("@P_ISSUING_TELE_AREA_CODE",      (NString) pPxrroecRecord.get("pIssuingTeleAreaCode"));   
			cmd.addParameter("@P_ISSUING_TELE_NUMBER",         (NString) pPxrroecRecord.get("pIssuingTeleNumber"));     
			cmd.addParameter("@P_ISSUSING_TELE_EXT",           (NString) pPxrroecRecord.get("pIssusingTeleExt"));       
			cmd.addParameter("@P_EARN_CODE_VAC",               (NString) pPxrroecRecord.get("pEarnCodeVac"));           
			cmd.addParameter("@P_VAC_GRS",                     (NNumber) pPxrroecRecord.get("pVacGrs"));                
			cmd.addParameter("@P_STAT_HOL_EARN_CODE1",         (NString) pPxrroecRecord.get("pStatHolEarnCode1"));      
			cmd.addParameter("@P_STAT_HOL_DATE1",              (NDate)   pPxrroecRecord.get("pStatHolDate1"));          
			cmd.addParameter("@P_STAT_HOL_GRS1",               (NNumber) pPxrroecRecord.get("pStatHolGrs1"));           
			cmd.addParameter("@P_STAT_HOL_EARN_CODE2",         (NString) pPxrroecRecord.get("pStatHolEarnCode2"));      
			cmd.addParameter("@P_STAT_HOL_DATE2",              (NDate)   pPxrroecRecord.get("pStatHolDate2"));          
			cmd.addParameter("@P_STAT_HOL_GRS2",               (NNumber) pPxrroecRecord.get("pStatHolGrs2"));           
			cmd.addParameter("@P_STAT_HOL_EARN_CODE3",         (NString) pPxrroecRecord.get("pStatHolEarnCode3"));      
			cmd.addParameter("@P_STAT_HOL_DATE3",              (NDate)   pPxrroecRecord.get("pStatHolDate3"));          
			cmd.addParameter("@P_STAT_HOL_GRS3",               (NNumber) pPxrroecRecord.get("pStatHolGrs3"));           
			cmd.addParameter("@P_OTHER_EARN_CODE1",            (NString) pPxrroecRecord.get("pOtherEarnCode1"));        
			cmd.addParameter("@P_OTHER_EARN_CODE1_GRS",        (NNumber) pPxrroecRecord.get("pOtherEarnCode1Grs"));     
			cmd.addParameter("@P_OTHER_EARN_CODE2",            (NString) pPxrroecRecord.get("pOtherEarnCode2"));        
			cmd.addParameter("@P_OTHER_EARN_CODE2_GRS",        (NNumber) pPxrroecRecord.get("pOtherEarnCode2Grs"));     
			cmd.addParameter("@P_OTHER_EARN_CODE3",            (NString) pPxrroecRecord.get("pOtherEarnCode3"));        
			cmd.addParameter("@P_OTHER_EARN_CODE3_GRS",        (NNumber) pPxrroecRecord.get("pOtherEarnCode3Grs"));     
			cmd.addParameter("@P_BENEFIT_IND",                 (NString) pPxrroecRecord.get("pBenefitInd"));            
			cmd.addParameter("@P_BENEFIT_GRS",                 (NNumber) pPxrroecRecord.get("pBenefitGrs"));            
			cmd.addParameter("@P_BENEFIT_START_DATE",          (NDate)   pPxrroecRecord.get("pBenefitStartDate"));      
			cmd.addParameter("@P_BENEFIT_DAY_WEEK_IND",        (NString) pPxrroecRecord.get("pBenefitDayWeekInd"));     
			cmd.addParameter("@P_PP1_PAYNO",                   (NString) pPxrroecRecord.get("pPp1Payno"));              
			cmd.addParameter("@P_PP1_GRS",                     (NNumber) pPxrroecRecord.get("pPp1Grs"));                
			cmd.addParameter("@P_PP2_PAYNO",                   (NString) pPxrroecRecord.get("pPp2Payno"));              
			cmd.addParameter("@P_PP2_GRS",                     (NNumber) pPxrroecRecord.get("pPp2Grs"));                
			cmd.addParameter("@P_PP3_PAYNO",                   (NString) pPxrroecRecord.get("pPp3Payno"));              
			cmd.addParameter("@P_PP3_GRS",                     (NNumber) pPxrroecRecord.get("pPp3Grs"));                
			cmd.addParameter("@P_PP4_PAYNO",                   (NString) pPxrroecRecord.get("pPp4Payno"));              
			cmd.addParameter("@P_PP4_GRS",                     (NNumber) pPxrroecRecord.get("pPp4Grs"));                
			cmd.addParameter("@P_PP5_PAYNO",                   (NString) pPxrroecRecord.get("pPp5Payno"));              
			cmd.addParameter("@P_PP5_GRS",                     (NNumber) pPxrroecRecord.get("pPp5Grs"));                
			cmd.addParameter("@P_PP6_PAYNO",                   (NString) pPxrroecRecord.get("pPp6Payno"));              
			cmd.addParameter("@P_PP6_GRS",                     (NNumber) pPxrroecRecord.get("pPp6Grs"));                
			cmd.addParameter("@P_PP7_PAYNO",                   (NString) pPxrroecRecord.get("pPp7Payno"));              
			cmd.addParameter("@P_PP7_GRS",                     (NNumber) pPxrroecRecord.get("pPp7Grs"));                
			cmd.addParameter("@P_PP8_PAYNO",                   (NString) pPxrroecRecord.get("pPp8Payno"));              
			cmd.addParameter("@P_PP8_GRS",                     (NNumber) pPxrroecRecord.get("pPp8Grs"));                
			cmd.addParameter("@P_PP9_PAYNO",                   (NString) pPxrroecRecord.get("pPp9Payno"));              
			cmd.addParameter("@P_PP9_GRS",                     (NNumber) pPxrroecRecord.get("pPp9Grs"));                
			cmd.addParameter("@P_PP10_PAYNO",                  (NString) pPxrroecRecord.get("pPp10Payno"));             
			cmd.addParameter("@P_PP10_GRS",                    (NNumber) pPxrroecRecord.get("pPp10Grs"));               
			cmd.addParameter("@P_PP11_PAYNO",                  (NString) pPxrroecRecord.get("pPp11Payno"));             
			cmd.addParameter("@P_PP11_GRS",                    (NNumber) pPxrroecRecord.get("pPp11Grs"));               
			cmd.addParameter("@P_PP12_PAYNO",                  (NString) pPxrroecRecord.get("pPp12Payno"));             
			cmd.addParameter("@P_PP12_GRS",                    (NNumber) pPxrroecRecord.get("pPp12Grs"));               
			cmd.addParameter("@P_PP13_PAYNO",                  (NString) pPxrroecRecord.get("pPp13Payno"));             
			cmd.addParameter("@P_PP13_GRS",                    (NNumber) pPxrroecRecord.get("pPp13Grs"));               
			cmd.addParameter("@P_PP14_PAYNO",                  (NString) pPxrroecRecord.get("pPp14Payno"));             
			cmd.addParameter("@P_PP14_GRS",                    (NNumber) pPxrroecRecord.get("pPp14Grs"));               
			cmd.addParameter("@P_PP15_PAYNO",                  (NString) pPxrroecRecord.get("pPp15Payno"));             
			cmd.addParameter("@P_PP15_GRS",                    (NNumber) pPxrroecRecord.get("pPp15Grs"));               
			cmd.addParameter("@P_PP16_PAYNO",                  (NString) pPxrroecRecord.get("pPp16Payno"));             
			cmd.addParameter("@P_PP16_GRS",                    (NNumber) pPxrroecRecord.get("pPp16Grs"));               
			cmd.addParameter("@P_PP17_PAYNO",                  (NString) pPxrroecRecord.get("pPp17Payno"));             
			cmd.addParameter("@P_PP17_GRS",                    (NNumber) pPxrroecRecord.get("pPp17Grs"));               
			cmd.addParameter("@P_PP18_PAYNO",                  (NString) pPxrroecRecord.get("pPp18Payno"));             
			cmd.addParameter("@P_PP18_GRS",                    (NNumber) pPxrroecRecord.get("pPp18Grs"));               
			cmd.addParameter("@P_PP19_PAYNO",                  (NString) pPxrroecRecord.get("pPp19Payno"));             
			cmd.addParameter("@P_PP19_GRS",                    (NNumber) pPxrroecRecord.get("pPp19Grs"));               
			cmd.addParameter("@P_PP20_PAYNO",                  (NString) pPxrroecRecord.get("pPp20Payno"));             
			cmd.addParameter("@P_PP20_GRS",                    (NNumber) pPxrroecRecord.get("pPp20Grs"));               
			cmd.addParameter("@P_PP21_PAYNO",                  (NString) pPxrroecRecord.get("pPp21Payno"));             
			cmd.addParameter("@P_PP21_GRS",                    (NNumber) pPxrroecRecord.get("pPp21Grs"));               
			cmd.addParameter("@P_PP22_PAYNO",                  (NString) pPxrroecRecord.get("pPp22Payno"));             
			cmd.addParameter("@P_PP22_GRS",                    (NNumber) pPxrroecRecord.get("pPp22Grs"));               
			cmd.addParameter("@P_PP23_PAYNO",                  (NString) pPxrroecRecord.get("pPp23Payno"));             
			cmd.addParameter("@P_PP23_GRS",                    (NNumber) pPxrroecRecord.get("pPp23Grs"));               
			cmd.addParameter("@P_PP24_PAYNO",                  (NString) pPxrroecRecord.get("pPp24Payno"));             
			cmd.addParameter("@P_PP24_GRS",                    (NNumber) pPxrroecRecord.get("pPp24Grs"));               
			cmd.addParameter("@P_PP25_PAYNO",                  (NString) pPxrroecRecord.get("pPp25Payno"));             
			cmd.addParameter("@P_PP25_GRS",                    (NNumber) pPxrroecRecord.get("pPp25Grs"));               
			cmd.addParameter("@P_PP26_PAYNO",                  (NString) pPxrroecRecord.get("pPp26Payno"));             
			cmd.addParameter("@P_PP26_GRS",                    (NNumber) pPxrroecRecord.get("pPp26Grs"));               
			cmd.addParameter("@P_PP27_PAYNO",                  (NString) pPxrroecRecord.get("pPp27Payno"));             
			cmd.addParameter("@P_PP27_GRS",                    (NNumber) pPxrroecRecord.get("pPp27Grs"));               
			cmd.addParameter("@P_COMMENT_LINE1",               (NString) pPxrroecRecord.get("pCommentLine1"));          
			cmd.addParameter("@P_COMMENT_LINE2",               (NString) pPxrroecRecord.get("pCommentLine2"));          
			cmd.addParameter("@P_COMMENT_LINE3",               (NString) pPxrroecRecord.get("pCommentLine3"));          
			cmd.addParameter("@P_COMMENT_LINE4",               (NString) pPxrroecRecord.get("pCommentLine4"));          
			cmd.addParameter("@P_COMMENT_LINE5",               (NString) pPxrroecRecord.get("pCommentLine5"));          
			cmd.addParameter("@P_COMMENT_LINE6",               (NString) pPxrroecRecord.get("pCommentLine6"));          
			cmd.addParameter("@P_USER_ID",                     (NString) pPxrroecRecord.get("pUserId"));                
			cmd.addParameter("@P_MONEY_TYPE1",                 (NString) pPxrroecRecord.get("pMoneyType1"));            
			cmd.addParameter("@P_MONEY_TYPE2",                 (NString) pPxrroecRecord.get("pMoneyType2"));            
			cmd.addParameter("@P_MONEY_TYPE3",                 (NString) pPxrroecRecord.get("pMoneyType3"));            
			cmd.addParameter("@P_PP28_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp28Payno"));             
			cmd.addParameter("@P_PP28_GRS",                    (NNumber) pPxrroecRecord.get("pPp28Grs"));               
			cmd.addParameter("@P_PP29_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp29Payno"));             
			cmd.addParameter("@P_PP29_GRS",                    (NNumber) pPxrroecRecord.get("pPp29Grs"));               
			cmd.addParameter("@P_PP30_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp30Payno"));             
			cmd.addParameter("@P_PP30_GRS",                    (NNumber) pPxrroecRecord.get("pPp30Grs"));               
			cmd.addParameter("@P_PP31_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp31Payno"));             
			cmd.addParameter("@P_PP31_GRS",                    (NNumber) pPxrroecRecord.get("pPp31Grs"));               
			cmd.addParameter("@P_PP32_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp32Payno"));             
			cmd.addParameter("@P_PP32_GRS",                    (NNumber) pPxrroecRecord.get("pPp32Grs"));               
			cmd.addParameter("@P_PP33_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp33Payno"));             
			cmd.addParameter("@P_PP33_GRS",                    (NNumber) pPxrroecRecord.get("pPp33Grs"));               
			cmd.addParameter("@P_PP34_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp34Payno"));             
			cmd.addParameter("@P_PP34_GRS",                    (NNumber) pPxrroecRecord.get("pPp34Grs"));               
			cmd.addParameter("@P_PP35_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp35Payno"));             
			cmd.addParameter("@P_PP35_GRS",                    (NNumber) pPxrroecRecord.get("pPp35Grs"));               
			cmd.addParameter("@P_PP36_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp36Payno"));             
			cmd.addParameter("@P_PP36_GRS",                    (NNumber) pPxrroecRecord.get("pPp36Grs"));               
			cmd.addParameter("@P_PP37_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp37Payno"));             
			cmd.addParameter("@P_PP37_GRS",                    (NNumber) pPxrroecRecord.get("pPp37Grs"));               
			cmd.addParameter("@P_PP38_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp38Payno"));             
			cmd.addParameter("@P_PP38_GRS",                    (NNumber) pPxrroecRecord.get("pPp38Grs"));               
			cmd.addParameter("@P_PP39_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp39Payno"));             
			cmd.addParameter("@P_PP39_GRS",                    (NNumber) pPxrroecRecord.get("pPp39Grs"));               
			cmd.addParameter("@P_PP40_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp40Payno"));             
			cmd.addParameter("@P_PP40_GRS",                    (NNumber) pPxrroecRecord.get("pPp40Grs"));               
			cmd.addParameter("@P_PP41_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp41Payno"));             
			cmd.addParameter("@P_PP41_GRS",                    (NNumber) pPxrroecRecord.get("pPp41Grs"));               
			cmd.addParameter("@P_PP42_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp42Payno"));             
			cmd.addParameter("@P_PP42_GRS",                    (NNumber) pPxrroecRecord.get("pPp42Grs"));               
			cmd.addParameter("@P_PP43_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp43Payno"));             
			cmd.addParameter("@P_PP43_GRS",                    (NNumber) pPxrroecRecord.get("pPp43Grs"));               
			cmd.addParameter("@P_PP44_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp44Payno"));             
			cmd.addParameter("@P_PP44_GRS",                    (NNumber) pPxrroecRecord.get("pPp44Grs"));               
			cmd.addParameter("@P_PP45_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp45Payno"));             
			cmd.addParameter("@P_PP45_GRS",                    (NNumber) pPxrroecRecord.get("pPp45Grs"));               
			cmd.addParameter("@P_PP46_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp46Payno"));             
			cmd.addParameter("@P_PP46_GRS",                    (NNumber) pPxrroecRecord.get("pPp46Grs"));               
			cmd.addParameter("@P_PP47_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp47Payno"));             
			cmd.addParameter("@P_PP47_GRS",                    (NNumber) pPxrroecRecord.get("pPp47Grs"));               
			cmd.addParameter("@P_PP48_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp48Payno"));             
			cmd.addParameter("@P_PP48_GRS",                    (NNumber) pPxrroecRecord.get("pPp48Grs"));               
			cmd.addParameter("@P_PP49_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp49Payno"));             
			cmd.addParameter("@P_PP49_GRS",                    (NNumber) pPxrroecRecord.get("pPp49Grs"));               
			cmd.addParameter("@P_PP50_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp50Payno"));             
			cmd.addParameter("@P_PP50_GRS",                    (NNumber) pPxrroecRecord.get("pPp50Grs"));               
			cmd.addParameter("@P_PP51_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp51Payno"));             
			cmd.addParameter("@P_PP51_GRS",                    (NNumber) pPxrroecRecord.get("pPp51Grs"));               
			cmd.addParameter("@P_PP52_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp52Payno"));             
			cmd.addParameter("@P_PP52_GRS",                    (NNumber) pPxrroecRecord.get("pPp52Grs"));               
			cmd.addParameter("@P_PP53_PAYNO",                  (NNumber) pPxrroecRecord.get("pPp53Payno"));             
			cmd.addParameter("@P_PP53_GRS",                    (NNumber) pPxrroecRecord.get("pPp53Grs"));               
			cmd.addParameter("@P_DATA_ORIGIN",                 (NString) pPxrroecRecord.get("pDataOrigin"));            
			cmd.addParameter("@P_PP1_HRS",                     (NNumber) pPxrroecRecord.get("pPp1Hrs"));                
			cmd.addParameter("@P_PP2_HRS",                     (NNumber) pPxrroecRecord.get("pPp2Hrs"));                
			cmd.addParameter("@P_PP3_HRS",                     (NNumber) pPxrroecRecord.get("pPp3Hrs"));                
			cmd.addParameter("@P_PP4_HRS",                     (NNumber) pPxrroecRecord.get("pPp4Hrs"));                
			cmd.addParameter("@P_PP5_HRS",                     (NNumber) pPxrroecRecord.get("pPp5Hrs"));                
			cmd.addParameter("@P_PP6_HRS",                     (NNumber) pPxrroecRecord.get("pPp6Hrs"));                
			cmd.addParameter("@P_PP7_HRS",                     (NNumber) pPxrroecRecord.get("pPp7Hrs"));                
			cmd.addParameter("@P_PP8_HRS",                     (NNumber) pPxrroecRecord.get("pPp8Hrs"));                
			cmd.addParameter("@P_PP9_HRS",                     (NNumber) pPxrroecRecord.get("pPp9Hrs"));                
			cmd.addParameter("@P_PP10_HRS",                    (NNumber) pPxrroecRecord.get("pPp10Hrs"));               
			cmd.addParameter("@P_PP11_HRS",                    (NNumber) pPxrroecRecord.get("pPp11Hrs"));               
			cmd.addParameter("@P_PP12_HRS",                    (NNumber) pPxrroecRecord.get("pPp12Hrs"));               
			cmd.addParameter("@P_PP13_HRS",                    (NNumber) pPxrroecRecord.get("pPp13Hrs"));               
			cmd.addParameter("@P_PP14_HRS",                    (NNumber) pPxrroecRecord.get("pPp14Hrs"));               
			cmd.addParameter("@P_PP15_HRS",                    (NNumber) pPxrroecRecord.get("pPp15Hrs"));               
			cmd.addParameter("@P_PP16_HRS",                    (NNumber) pPxrroecRecord.get("pPp16Hrs"));               
			cmd.addParameter("@P_PP17_HRS",                    (NNumber) pPxrroecRecord.get("pPp17Hrs"));               
			cmd.addParameter("@P_PP18_HRS",                    (NNumber) pPxrroecRecord.get("pPp18Hrs"));               
			cmd.addParameter("@P_PP19_HRS",                    (NNumber) pPxrroecRecord.get("pPp19Hrs"));               
			cmd.addParameter("@P_PP20_HRS",                    (NNumber) pPxrroecRecord.get("pPp20Hrs"));               
			cmd.addParameter("@P_PP21_HRS",                    (NNumber) pPxrroecRecord.get("pPp21Hrs"));               
			cmd.addParameter("@P_PP22_HRS",                    (NNumber) pPxrroecRecord.get("pPp22Hrs"));               
			cmd.addParameter("@P_PP23_HRS",                    (NNumber) pPxrroecRecord.get("pPp23Hrs"));               
			cmd.addParameter("@P_PP24_HRS",                    (NNumber) pPxrroecRecord.get("pPp24Hrs"));               
			cmd.addParameter("@P_PP25_HRS",                    (NNumber) pPxrroecRecord.get("pPp25Hrs"));               
			cmd.addParameter("@P_PP26_HRS",                    (NNumber) pPxrroecRecord.get("pPp26Hrs"));               
			cmd.addParameter("@P_PP27_HRS",                    (NNumber) pPxrroecRecord.get("pPp27Hrs"));               
			cmd.addParameter("@P_PP28_HRS",                    (NNumber) pPxrroecRecord.get("pPp28Hrs"));               
			cmd.addParameter("@P_PP29_HRS",                    (NNumber) pPxrroecRecord.get("pPp29Hrs"));               
			cmd.addParameter("@P_PP30_HRS",                    (NNumber) pPxrroecRecord.get("pPp30Hrs"));               
			cmd.addParameter("@P_PP31_HRS",                    (NNumber) pPxrroecRecord.get("pPp31Hrs"));               
			cmd.addParameter("@P_PP32_HRS",                    (NNumber) pPxrroecRecord.get("pPp32Hrs"));               
			cmd.addParameter("@P_PP33_HRS",                    (NNumber) pPxrroecRecord.get("pPp33Hrs"));               
			cmd.addParameter("@P_PP34_HRS",                    (NNumber) pPxrroecRecord.get("pPp34Hrs"));               
			cmd.addParameter("@P_PP35_HRS",                    (NNumber) pPxrroecRecord.get("pPp35Hrs"));               
			cmd.addParameter("@P_PP36_HRS",                    (NNumber) pPxrroecRecord.get("pPp36Hrs"));               
			cmd.addParameter("@P_PP37_HRS",                    (NNumber) pPxrroecRecord.get("pPp37Hrs"));               
			cmd.addParameter("@P_PP38_HRS",                    (NNumber) pPxrroecRecord.get("pPp38Hrs"));               
			cmd.addParameter("@P_PP39_HRS",                    (NNumber) pPxrroecRecord.get("pPp39Hrs"));               
			cmd.addParameter("@P_PP40_HRS",                    (NNumber) pPxrroecRecord.get("pPp40Hrs"));               
			cmd.addParameter("@P_PP41_HRS",                    (NNumber) pPxrroecRecord.get("pPp41Hrs"));               
			cmd.addParameter("@P_PP42_HRS",                    (NNumber) pPxrroecRecord.get("pPp42Hrs"));               
			cmd.addParameter("@P_PP43_HRS",                    (NNumber) pPxrroecRecord.get("pPp43Hrs"));               
			cmd.addParameter("@P_PP44_HRS",                    (NNumber) pPxrroecRecord.get("pPp44Hrs"));               
			cmd.addParameter("@P_PP45_HRS",                    (NNumber) pPxrroecRecord.get("pPp45Hrs"));               
			cmd.addParameter("@P_PP46_HRS",                    (NNumber) pPxrroecRecord.get("pPp46Hrs"));               
			cmd.addParameter("@P_PP47_HRS",                    (NNumber) pPxrroecRecord.get("pPp47Hrs"));               
			cmd.addParameter("@P_PP48_HRS",                    (NNumber) pPxrroecRecord.get("pPp48Hrs"));               
			cmd.addParameter("@P_PP49_HRS",                    (NNumber) pPxrroecRecord.get("pPp49Hrs"));               
			cmd.addParameter("@P_PP50_HRS",                    (NNumber) pPxrroecRecord.get("pPp50Hrs"));               
			cmd.addParameter("@P_PP51_HRS",                    (NNumber) pPxrroecRecord.get("pPp51Hrs"));               
			cmd.addParameter("@P_PP52_HRS",                    (NNumber) pPxrroecRecord.get("pPp52Hrs"));               
			cmd.addParameter("@P_PP53_HRS",                    (NNumber) pPxrroecRecord.get("pPp53Hrs"));               
			cmd.addParameter("@P_BULK_FILE_NAME",              (NString) pPxrroecRecord.get("pBulkFileName"));          
			cmd.addParameter("@P_VAC_ROEV_CODE",               (NString) pPxrroecRecord.get("pVacRoevCode"));           
			cmd.addParameter("@P_VAC_START_DATE",              (NDate)   pPxrroecRecord.get("pVacStartDate"));          
			cmd.addParameter("@P_VAC_END_DATE",                (NDate)   pPxrroecRecord.get("pVacEndDate"));            
			cmd.addParameter("@P_STAT_HOL_EARN_CODE4",         (NString) pPxrroecRecord.get("pStatHolEarnCode4"));      
			cmd.addParameter("@P_STAT_HOL_DATE4",              (NDate)   pPxrroecRecord.get("pStatHolDate4"));          
			cmd.addParameter("@P_STAT_HOL_GRS4",               (NNumber) pPxrroecRecord.get("pStatHolGrs4"));           
			cmd.addParameter("@P_STAT_HOL_EARN_CODE5",         (NString) pPxrroecRecord.get("pStatHolEarnCode5"));      
			cmd.addParameter("@P_STAT_HOL_DATE5",              (NDate)   pPxrroecRecord.get("pStatHolDate5"));          
			cmd.addParameter("@P_STAT_HOL_GRS5",               (NNumber) pPxrroecRecord.get("pStatHolGrs5"));           
			cmd.addParameter("@P_OTHER_START_DATE1",           (NDate)   pPxrroecRecord.get("pOtherStartDate1"));       
			cmd.addParameter("@P_OTHER_END_DATE1",             (NDate)   pPxrroecRecord.get("pOtherEndDate1"));         
			cmd.addParameter("@P_OTHER_START_DATE2",           (NDate)   pPxrroecRecord.get("pOtherStartDate2"));       
			cmd.addParameter("@P_OTHER_END_DATE2",             (NDate)   pPxrroecRecord.get("pOtherEndDate2"));         
			cmd.addParameter("@P_OTHER_START_DATE3",           (NDate)   pPxrroecRecord.get("pOtherStartDate3"));       
			cmd.addParameter("@P_OTHER_END_DATE3",             (NDate)   pPxrroecRecord.get("pOtherEndDate3"));         
			cmd.addParameter("@P_BENEFIT_ROES_CODE",           (NString) pPxrroecRecord.get("pBenefitRoesCode"));       
			cmd.addParameter("@P_BENEFIT_END_DATE",            (NDate)   pPxrroecRecord.get("pBenefitEndDate"));        
			cmd.addParameter("@P_BENEFIT_ROES_CODE2",          (NString) pPxrroecRecord.get("pBenefitRoesCode2"));      
			cmd.addParameter("@P_BENEFIT_GRS2",                (NNumber) pPxrroecRecord.get("pBenefitGrs2"));           
			cmd.addParameter("@P_BENEFIT_START_DATE2",         (NDate)   pPxrroecRecord.get("pBenefit_start_date2"));   
			cmd.addParameter("@P_BENEFIT_END_DATE2",           (NDate)   pPxrroecRecord.get("pBenefitEndDate2"));       
			cmd.addParameter("@P_BENEFIT_DAY_WEEK_IND2",       (NString) pPxrroecRecord.get("pBenefitDayWeek_ind2"));   
			cmd.addParameter("@P_BENEFIT_ROES_CODE3",          (NString) pPxrroecRecord.get("pBenefitRoesCode3"));      
			cmd.addParameter("@P_BENEFIT_GRS3",                (NNumber) pPxrroecRecord.get("pBenefitGrs3"));           
			cmd.addParameter("@P_BENEFIT_START_DATE3",         (NDate)   pPxrroecRecord.get("pBenefitStartDate3"));     
			cmd.addParameter("@P_BENEFIT_END_DATE3",           (NDate)   pPxrroecRecord.get("pBenefitEndDate3"));       
			cmd.addParameter("@P_BENEFIT_DAY_WEEK_IND3",       (NString) pPxrroecRecord.get("pBenefitDayWeekInd3"));    
			cmd.addParameter("@P_BENEFIT_ROES_CODE4",          (NString) pPxrroecRecord.get("pBenefitRoesCode4"));      
			cmd.addParameter("@P_BENEFIT_GRS4",                (NNumber) pPxrroecRecord.get("pBenefitGrs4"));           
			cmd.addParameter("@P_BENEFIT_START_DATE4",         (NDate)   pPxrroecRecord.get("pBenefitStartDate4"));     
			cmd.addParameter("@P_BENEFIT_END_DATE4",           (NDate)   pPxrroecRecord.get("pBenefitEndDate4"));       
			cmd.addParameter("@P_BENEFIT_DAY_WEEK_IND4",       (NString) pPxrroecRecord.get("pBenefitDayWeekInd4"));    
			cmd.addParameter("@P_ROWID",                       (NString) pPxrroecRecord.get("pRowid")); 
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RecordOfEmploymentRecRow", dataSourceName="RECORD_OF_EMPLOYMENT_REC")
	public static class RecordOfEmploymentRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_EMPR_CODE")
		public NString REmprCode;
		@DbRecordField(dataSourceName="R_EMPR_FED_EIN")
		public NString REmprFedEin;
		@DbRecordField(dataSourceName="R_PRINT_IND")
		public NString RPrintInd;
		@DbRecordField(dataSourceName="R_REPRINT_IND")
		public NString RReprintInd;
		@DbRecordField(dataSourceName="R_SERIAL_NO")
		public NString RSerialNo;
		@DbRecordField(dataSourceName="R_AMENDS_SERIAL_NO")
		public NString RAmendsSerialNo;
		@DbRecordField(dataSourceName="R_LANGUAGE_IND")
		public NString RLanguageInd;
		@DbRecordField(dataSourceName="R_ISSUE_DATE")
		public NDate RIssueDate;
		@DbRecordField(dataSourceName="R_REFERENCE_NUMBER")
		public NString RReferenceNumber;
		@DbRecordField(dataSourceName="R_SIN")
		public NString RSin;
		@DbRecordField(dataSourceName="R_JOB_TITLE")
		public NString RJobTitle;
		@DbRecordField(dataSourceName="R_FIRST_DAY_WORKED")
		public NDate RFirstDayWorked;
		@DbRecordField(dataSourceName="R_LAST_DAY_WORKED")
		public NDate RLastDayWorked;
		@DbRecordField(dataSourceName="R_FINAL_PAY_DATE")
		public NDate RFinalPayDate;
		@DbRecordField(dataSourceName="R_RECALL_IND")
		public NString RRecallInd;
		@DbRecordField(dataSourceName="R_RECALL_DATE")
		public NDate RRecallDate;
		@DbRecordField(dataSourceName="R_ROEC_CODE")
		public NString RRoecCode;
		@DbRecordField(dataSourceName="R_TOTAL_HRS")
		public NNumber RTotalHrs;
		@DbRecordField(dataSourceName="R_TOTAL_GRS")
		public NNumber RTotalGrs;
		@DbRecordField(dataSourceName="R_1996_WEEKS")
		public NNumber R1996Weeks;
		@DbRecordField(dataSourceName="R_1996_EARNINGS")
		public NNumber R1996Earnings;
		@DbRecordField(dataSourceName="R_CONTACT_PIDM")
		public NNumber RContactPidm;
		@DbRecordField(dataSourceName="R_CONTACT_TELE_AREA_CODE")
		public NString RContactTeleAreaCode;
		@DbRecordField(dataSourceName="R_CONTACT_TELE_NUMBER")
		public NString RContactTeleNumber;
		@DbRecordField(dataSourceName="R_CONTACT_TELE_EXT")
		public NString RContactTeleExt;
		@DbRecordField(dataSourceName="R_ISSUING_PIDM")
		public NNumber RIssuingPidm;
		@DbRecordField(dataSourceName="R_ISSUING_TELE_AREA_CODE")
		public NString RIssuingTeleAreaCode;
		@DbRecordField(dataSourceName="R_ISSUING_TELE_NUMBER")
		public NString RIssuingTeleNumber;
		@DbRecordField(dataSourceName="R_ISSUSING_TELE_EXT")
		public NString RIssusingTeleExt;
		@DbRecordField(dataSourceName="R_EARN_CODE_VAC")
		public NString REarnCodeVac;
		@DbRecordField(dataSourceName="R_VAC_GRS")
		public NNumber RVacGrs;
		@DbRecordField(dataSourceName="R_STAT_HOL_EARN_CODE1")
		public NString RStatHolEarnCode1;
		@DbRecordField(dataSourceName="R_STAT_HOL_DATE1")
		public NDate RStatHolDate1;
		@DbRecordField(dataSourceName="R_STAT_HOL_GRS1")
		public NNumber RStatHolGrs1;
		@DbRecordField(dataSourceName="R_STAT_HOL_EARN_CODE2")
		public NString RStatHolEarnCode2;
		@DbRecordField(dataSourceName="R_STAT_HOL_DATE2")
		public NDate RStatHolDate2;
		@DbRecordField(dataSourceName="R_STAT_HOL_GRS2")
		public NNumber RStatHolGrs2;
		@DbRecordField(dataSourceName="R_STAT_HOL_EARN_CODE3")
		public NString RStatHolEarnCode3;
		@DbRecordField(dataSourceName="R_STAT_HOL_DATE3")
		public NDate RStatHolDate3;
		@DbRecordField(dataSourceName="R_STAT_HOL_GRS3")
		public NNumber RStatHolGrs3;
		@DbRecordField(dataSourceName="R_OTHER_EARN_CODE1")
		public NString ROtherEarnCode1;
		@DbRecordField(dataSourceName="R_OTHER_EARN_CODE1_GRS")
		public NNumber ROtherEarnCode1Grs;
		@DbRecordField(dataSourceName="R_OTHER_EARN_CODE2")
		public NString ROtherEarnCode2;
		@DbRecordField(dataSourceName="R_OTHER_EARN_CODE2_GRS")
		public NNumber ROtherEarnCode2Grs;
		@DbRecordField(dataSourceName="R_OTHER_EARN_CODE3")
		public NString ROtherEarnCode3;
		@DbRecordField(dataSourceName="R_OTHER_EARN_CODE3_GRS")
		public NNumber ROtherEarnCode3Grs;
		@DbRecordField(dataSourceName="R_BENEFIT_IND")
		public NString RBenefitInd;
		@DbRecordField(dataSourceName="R_BENEFIT_GRS")
		public NNumber RBenefitGrs;
		@DbRecordField(dataSourceName="R_BENEFIT_START_DATE")
		public NDate RBenefitStartDate;
		@DbRecordField(dataSourceName="R_BENEFIT_DAY_WEEK_IND")
		public NString RBenefitDayWeekInd;
		@DbRecordField(dataSourceName="R_PP1_PAYNO")
		public NString RPp1Payno;
		@DbRecordField(dataSourceName="R_PP1_GRS")
		public NNumber RPp1Grs;
		@DbRecordField(dataSourceName="R_PP2_PAYNO")
		public NString RPp2Payno;
		@DbRecordField(dataSourceName="R_PP2_GRS")
		public NNumber RPp2Grs;
		@DbRecordField(dataSourceName="R_PP3_PAYNO")
		public NString RPp3Payno;
		@DbRecordField(dataSourceName="R_PP3_GRS")
		public NNumber RPp3Grs;
		@DbRecordField(dataSourceName="R_PP4_PAYNO")
		public NString RPp4Payno;
		@DbRecordField(dataSourceName="R_PP4_GRS")
		public NNumber RPp4Grs;
		@DbRecordField(dataSourceName="R_PP5_PAYNO")
		public NString RPp5Payno;
		@DbRecordField(dataSourceName="R_PP5_GRS")
		public NNumber RPp5Grs;
		@DbRecordField(dataSourceName="R_PP6_PAYNO")
		public NString RPp6Payno;
		@DbRecordField(dataSourceName="R_PP6_GRS")
		public NNumber RPp6Grs;
		@DbRecordField(dataSourceName="R_PP7_PAYNO")
		public NString RPp7Payno;
		@DbRecordField(dataSourceName="R_PP7_GRS")
		public NNumber RPp7Grs;
		@DbRecordField(dataSourceName="R_PP8_PAYNO")
		public NString RPp8Payno;
		@DbRecordField(dataSourceName="R_PP8_GRS")
		public NNumber RPp8Grs;
		@DbRecordField(dataSourceName="R_PP9_PAYNO")
		public NString RPp9Payno;
		@DbRecordField(dataSourceName="R_PP9_GRS")
		public NNumber RPp9Grs;
		@DbRecordField(dataSourceName="R_PP10_PAYNO")
		public NString RPp10Payno;
		@DbRecordField(dataSourceName="R_PP10_GRS")
		public NNumber RPp10Grs;
		@DbRecordField(dataSourceName="R_PP11_PAYNO")
		public NString RPp11Payno;
		@DbRecordField(dataSourceName="R_PP11_GRS")
		public NNumber RPp11Grs;
		@DbRecordField(dataSourceName="R_PP12_PAYNO")
		public NString RPp12Payno;
		@DbRecordField(dataSourceName="R_PP12_GRS")
		public NNumber RPp12Grs;
		@DbRecordField(dataSourceName="R_PP13_PAYNO")
		public NString RPp13Payno;
		@DbRecordField(dataSourceName="R_PP13_GRS")
		public NNumber RPp13Grs;
		@DbRecordField(dataSourceName="R_PP14_PAYNO")
		public NString RPp14Payno;
		@DbRecordField(dataSourceName="R_PP14_GRS")
		public NNumber RPp14Grs;
		@DbRecordField(dataSourceName="R_PP15_PAYNO")
		public NString RPp15Payno;
		@DbRecordField(dataSourceName="R_PP15_GRS")
		public NNumber RPp15Grs;
		@DbRecordField(dataSourceName="R_PP16_PAYNO")
		public NString RPp16Payno;
		@DbRecordField(dataSourceName="R_PP16_GRS")
		public NNumber RPp16Grs;
		@DbRecordField(dataSourceName="R_PP17_PAYNO")
		public NString RPp17Payno;
		@DbRecordField(dataSourceName="R_PP17_GRS")
		public NNumber RPp17Grs;
		@DbRecordField(dataSourceName="R_PP18_PAYNO")
		public NString RPp18Payno;
		@DbRecordField(dataSourceName="R_PP18_GRS")
		public NNumber RPp18Grs;
		@DbRecordField(dataSourceName="R_PP19_PAYNO")
		public NString RPp19Payno;
		@DbRecordField(dataSourceName="R_PP19_GRS")
		public NNumber RPp19Grs;
		@DbRecordField(dataSourceName="R_PP20_PAYNO")
		public NString RPp20Payno;
		@DbRecordField(dataSourceName="R_PP20_GRS")
		public NNumber RPp20Grs;
		@DbRecordField(dataSourceName="R_PP21_PAYNO")
		public NString RPp21Payno;
		@DbRecordField(dataSourceName="R_PP21_GRS")
		public NNumber RPp21Grs;
		@DbRecordField(dataSourceName="R_PP22_PAYNO")
		public NString RPp22Payno;
		@DbRecordField(dataSourceName="R_PP22_GRS")
		public NNumber RPp22Grs;
		@DbRecordField(dataSourceName="R_PP23_PAYNO")
		public NString RPp23Payno;
		@DbRecordField(dataSourceName="R_PP23_GRS")
		public NNumber RPp23Grs;
		@DbRecordField(dataSourceName="R_PP24_PAYNO")
		public NString RPp24Payno;
		@DbRecordField(dataSourceName="R_PP24_GRS")
		public NNumber RPp24Grs;
		@DbRecordField(dataSourceName="R_PP25_PAYNO")
		public NString RPp25Payno;
		@DbRecordField(dataSourceName="R_PP25_GRS")
		public NNumber RPp25Grs;
		@DbRecordField(dataSourceName="R_PP26_PAYNO")
		public NString RPp26Payno;
		@DbRecordField(dataSourceName="R_PP26_GRS")
		public NNumber RPp26Grs;
		@DbRecordField(dataSourceName="R_PP27_PAYNO")
		public NString RPp27Payno;
		@DbRecordField(dataSourceName="R_PP27_GRS")
		public NNumber RPp27Grs;
		@DbRecordField(dataSourceName="R_COMMENT_LINE1")
		public NString RCommentLine1;
		@DbRecordField(dataSourceName="R_COMMENT_LINE2")
		public NString RCommentLine2;
		@DbRecordField(dataSourceName="R_COMMENT_LINE3")
		public NString RCommentLine3;
		@DbRecordField(dataSourceName="R_COMMENT_LINE4")
		public NString RCommentLine4;
		@DbRecordField(dataSourceName="R_COMMENT_LINE5")
		public NString RCommentLine5;
		@DbRecordField(dataSourceName="R_COMMENT_LINE6")
		public NString RCommentLine6;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_MONEY_TYPE1")
		public NString RMoneyType1;
		@DbRecordField(dataSourceName="R_MONEY_TYPE2")
		public NString RMoneyType2;
		@DbRecordField(dataSourceName="R_MONEY_TYPE3")
		public NString RMoneyType3;
		@DbRecordField(dataSourceName="R_PP28_PAYNO")
		public NNumber RPp28Payno;
		@DbRecordField(dataSourceName="R_PP28_GRS")
		public NNumber RPp28Grs;
		@DbRecordField(dataSourceName="R_PP29_PAYNO")
		public NNumber RPp29Payno;
		@DbRecordField(dataSourceName="R_PP29_GRS")
		public NNumber RPp29Grs;
		@DbRecordField(dataSourceName="R_PP30_PAYNO")
		public NNumber RPp30Payno;
		@DbRecordField(dataSourceName="R_PP30_GRS")
		public NNumber RPp30Grs;
		@DbRecordField(dataSourceName="R_PP31_PAYNO")
		public NNumber RPp31Payno;
		@DbRecordField(dataSourceName="R_PP31_GRS")
		public NNumber RPp31Grs;
		@DbRecordField(dataSourceName="R_PP32_PAYNO")
		public NNumber RPp32Payno;
		@DbRecordField(dataSourceName="R_PP32_GRS")
		public NNumber RPp32Grs;
		@DbRecordField(dataSourceName="R_PP33_PAYNO")
		public NNumber RPp33Payno;
		@DbRecordField(dataSourceName="R_PP33_GRS")
		public NNumber RPp33Grs;
		@DbRecordField(dataSourceName="R_PP34_PAYNO")
		public NNumber RPp34Payno;
		@DbRecordField(dataSourceName="R_PP34_GRS")
		public NNumber RPp34Grs;
		@DbRecordField(dataSourceName="R_PP35_PAYNO")
		public NNumber RPp35Payno;
		@DbRecordField(dataSourceName="R_PP35_GRS")
		public NNumber RPp35Grs;
		@DbRecordField(dataSourceName="R_PP36_PAYNO")
		public NNumber RPp36Payno;
		@DbRecordField(dataSourceName="R_PP36_GRS")
		public NNumber RPp36Grs;
		@DbRecordField(dataSourceName="R_PP37_PAYNO")
		public NNumber RPp37Payno;
		@DbRecordField(dataSourceName="R_PP37_GRS")
		public NNumber RPp37Grs;
		@DbRecordField(dataSourceName="R_PP38_PAYNO")
		public NNumber RPp38Payno;
		@DbRecordField(dataSourceName="R_PP38_GRS")
		public NNumber RPp38Grs;
		@DbRecordField(dataSourceName="R_PP39_PAYNO")
		public NNumber RPp39Payno;
		@DbRecordField(dataSourceName="R_PP39_GRS")
		public NNumber RPp39Grs;
		@DbRecordField(dataSourceName="R_PP40_PAYNO")
		public NNumber RPp40Payno;
		@DbRecordField(dataSourceName="R_PP40_GRS")
		public NNumber RPp40Grs;
		@DbRecordField(dataSourceName="R_PP41_PAYNO")
		public NNumber RPp41Payno;
		@DbRecordField(dataSourceName="R_PP41_GRS")
		public NNumber RPp41Grs;
		@DbRecordField(dataSourceName="R_PP42_PAYNO")
		public NNumber RPp42Payno;
		@DbRecordField(dataSourceName="R_PP42_GRS")
		public NNumber RPp42Grs;
		@DbRecordField(dataSourceName="R_PP43_PAYNO")
		public NNumber RPp43Payno;
		@DbRecordField(dataSourceName="R_PP43_GRS")
		public NNumber RPp43Grs;
		@DbRecordField(dataSourceName="R_PP44_PAYNO")
		public NNumber RPp44Payno;
		@DbRecordField(dataSourceName="R_PP44_GRS")
		public NNumber RPp44Grs;
		@DbRecordField(dataSourceName="R_PP45_PAYNO")
		public NNumber RPp45Payno;
		@DbRecordField(dataSourceName="R_PP45_GRS")
		public NNumber RPp45Grs;
		@DbRecordField(dataSourceName="R_PP46_PAYNO")
		public NNumber RPp46Payno;
		@DbRecordField(dataSourceName="R_PP46_GRS")
		public NNumber RPp46Grs;
		@DbRecordField(dataSourceName="R_PP47_PAYNO")
		public NNumber RPp47Payno;
		@DbRecordField(dataSourceName="R_PP47_GRS")
		public NNumber RPp47Grs;
		@DbRecordField(dataSourceName="R_PP48_PAYNO")
		public NNumber RPp48Payno;
		@DbRecordField(dataSourceName="R_PP48_GRS")
		public NNumber RPp48Grs;
		@DbRecordField(dataSourceName="R_PP49_PAYNO")
		public NNumber RPp49Payno;
		@DbRecordField(dataSourceName="R_PP49_GRS")
		public NNumber RPp49Grs;
		@DbRecordField(dataSourceName="R_PP50_PAYNO")
		public NNumber RPp50Payno;
		@DbRecordField(dataSourceName="R_PP50_GRS")
		public NNumber RPp50Grs;
		@DbRecordField(dataSourceName="R_PP51_PAYNO")
		public NNumber RPp51Payno;
		@DbRecordField(dataSourceName="R_PP51_GRS")
		public NNumber RPp51Grs;
		@DbRecordField(dataSourceName="R_PP52_PAYNO")
		public NNumber RPp52Payno;
		@DbRecordField(dataSourceName="R_PP52_GRS")
		public NNumber RPp52Grs;
		@DbRecordField(dataSourceName="R_PP53_PAYNO")
		public NNumber RPp53Payno;
		@DbRecordField(dataSourceName="R_PP53_GRS")
		public NNumber RPp53Grs;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PP1_HRS")
		public NNumber RPp1Hrs;
		@DbRecordField(dataSourceName="R_PP2_HRS")
		public NNumber RPp2Hrs;
		@DbRecordField(dataSourceName="R_PP3_HRS")
		public NNumber RPp3Hrs;
		@DbRecordField(dataSourceName="R_PP4_HRS")
		public NNumber RPp4Hrs;
		@DbRecordField(dataSourceName="R_PP5_HRS")
		public NNumber RPp5Hrs;
		@DbRecordField(dataSourceName="R_PP6_HRS")
		public NNumber RPp6Hrs;
		@DbRecordField(dataSourceName="R_PP7_HRS")
		public NNumber RPp7Hrs;
		@DbRecordField(dataSourceName="R_PP8_HRS")
		public NNumber RPp8Hrs;
		@DbRecordField(dataSourceName="R_PP9_HRS")
		public NNumber RPp9Hrs;
		@DbRecordField(dataSourceName="R_PP10_HRS")
		public NNumber RPp10Hrs;
		@DbRecordField(dataSourceName="R_PP11_HRS")
		public NNumber RPp11Hrs;
		@DbRecordField(dataSourceName="R_PP12_HRS")
		public NNumber RPp12Hrs;
		@DbRecordField(dataSourceName="R_PP13_HRS")
		public NNumber RPp13Hrs;
		@DbRecordField(dataSourceName="R_PP14_HRS")
		public NNumber RPp14Hrs;
		@DbRecordField(dataSourceName="R_PP15_HRS")
		public NNumber RPp15Hrs;
		@DbRecordField(dataSourceName="R_PP16_HRS")
		public NNumber RPp16Hrs;
		@DbRecordField(dataSourceName="R_PP17_HRS")
		public NNumber RPp17Hrs;
		@DbRecordField(dataSourceName="R_PP18_HRS")
		public NNumber RPp18Hrs;
		@DbRecordField(dataSourceName="R_PP19_HRS")
		public NNumber RPp19Hrs;
		@DbRecordField(dataSourceName="R_PP20_HRS")
		public NNumber RPp20Hrs;
		@DbRecordField(dataSourceName="R_PP21_HRS")
		public NNumber RPp21Hrs;
		@DbRecordField(dataSourceName="R_PP22_HRS")
		public NNumber RPp22Hrs;
		@DbRecordField(dataSourceName="R_PP23_HRS")
		public NNumber RPp23Hrs;
		@DbRecordField(dataSourceName="R_PP24_HRS")
		public NNumber RPp24Hrs;
		@DbRecordField(dataSourceName="R_PP25_HRS")
		public NNumber RPp25Hrs;
		@DbRecordField(dataSourceName="R_PP26_HRS")
		public NNumber RPp26Hrs;
		@DbRecordField(dataSourceName="R_PP27_HRS")
		public NNumber RPp27Hrs;
		@DbRecordField(dataSourceName="R_PP28_HRS")
		public NNumber RPp28Hrs;
		@DbRecordField(dataSourceName="R_PP29_HRS")
		public NNumber RPp29Hrs;
		@DbRecordField(dataSourceName="R_PP30_HRS")
		public NNumber RPp30Hrs;
		@DbRecordField(dataSourceName="R_PP31_HRS")
		public NNumber RPp31Hrs;
		@DbRecordField(dataSourceName="R_PP32_HRS")
		public NNumber RPp32Hrs;
		@DbRecordField(dataSourceName="R_PP33_HRS")
		public NNumber RPp33Hrs;
		@DbRecordField(dataSourceName="R_PP34_HRS")
		public NNumber RPp34Hrs;
		@DbRecordField(dataSourceName="R_PP35_HRS")
		public NNumber RPp35Hrs;
		@DbRecordField(dataSourceName="R_PP36_HRS")
		public NNumber RPp36Hrs;
		@DbRecordField(dataSourceName="R_PP37_HRS")
		public NNumber RPp37Hrs;
		@DbRecordField(dataSourceName="R_PP38_HRS")
		public NNumber RPp38Hrs;
		@DbRecordField(dataSourceName="R_PP39_HRS")
		public NNumber RPp39Hrs;
		@DbRecordField(dataSourceName="R_PP40_HRS")
		public NNumber RPp40Hrs;
		@DbRecordField(dataSourceName="R_PP41_HRS")
		public NNumber RPp41Hrs;
		@DbRecordField(dataSourceName="R_PP42_HRS")
		public NNumber RPp42Hrs;
		@DbRecordField(dataSourceName="R_PP43_HRS")
		public NNumber RPp43Hrs;
		@DbRecordField(dataSourceName="R_PP44_HRS")
		public NNumber RPp44Hrs;
		@DbRecordField(dataSourceName="R_PP45_HRS")
		public NNumber RPp45Hrs;
		@DbRecordField(dataSourceName="R_PP46_HRS")
		public NNumber RPp46Hrs;
		@DbRecordField(dataSourceName="R_PP47_HRS")
		public NNumber RPp47Hrs;
		@DbRecordField(dataSourceName="R_PP48_HRS")
		public NNumber RPp48Hrs;
		@DbRecordField(dataSourceName="R_PP49_HRS")
		public NNumber RPp49Hrs;
		@DbRecordField(dataSourceName="R_PP50_HRS")
		public NNumber RPp50Hrs;
		@DbRecordField(dataSourceName="R_PP51_HRS")
		public NNumber RPp51Hrs;
		@DbRecordField(dataSourceName="R_PP52_HRS")
		public NNumber RPp52Hrs;
		@DbRecordField(dataSourceName="R_PP53_HRS")
		public NNumber RPp53Hrs;
		@DbRecordField(dataSourceName="R_BULK_FILE_NAME")
		public NString RBulkFileName;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
	}



	public static NString fRoepCodeExists  (NString pCode, NString pType, NString pRowid) {
        
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ROEP_CODE_EXISTS", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_CODE", pCode);
		cmd.addParameter("@P_TYPE", pType);
		cmd.addParameter("@P_ROWID", pRowid);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
	
    public static NString fRoepAmntMandatory  (NString pCode, NString pType, NNumber pVacGrs) {
        
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ROEP_AMNT_MANDATORY", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_CODE", pCode);
		cmd.addParameter("@P_TYPE", pType);
		cmd.addParameter("@P_VAC_GRS", pVacGrs);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
	
    public static NString fRoepAmntNotMandatory  (NString pCode, NString pType, NNumber pVacGrs) {
        
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ROEP_AMNT_NOTMANDATORY", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_CODE", pCode);
		cmd.addParameter("@P_TYPE", pType);
		cmd.addParameter("@P_VAC_GRS", pVacGrs);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}

    public static NString fRoepEdateMandatory  (NString pCode, NString pType, NDate pDate) {
        
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ROEP_EDATE_MANDATORY", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_CODE", pCode);
		cmd.addParameter("@P_TYPE", pType);
		cmd.addParameter("@P_DATE", pDate);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
    
    public static NString fRoepEdateNotMandatory  (NString pCode, NString pType, NDate pDate) {
        
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ROEP_EDATE_NOTMANDATORY", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_CODE", pCode);
		cmd.addParameter("@P_TYPE", pType);
		cmd.addParameter("@P_DATE", pDate);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
    
    public static NString fRoepSdateMandatory (NString pCode, NString pType, NDate pDate) {
        
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ROEP_SDATE_MANDATORY", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_CODE", pCode);
		cmd.addParameter("@P_TYPE", pType);
		cmd.addParameter("@P_DATE", pDate);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
    
    public static NString fRoepSdateNotMandatory  (NString pCode, NString pType, NDate pDate) {
        
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ROEP_SDATE_NOTMANDATORY", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_CODE", pCode);
		cmd.addParameter("@P_TYPE", pType);
		cmd.addParameter("@P_DATE", pDate);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
    
    public static NString fRoepSperiodMandatory  (NString pCode, NString pPeriod) {
        
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ROEP_SPERIOD_MANDATORY", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_CODE", pCode);
		cmd.addParameter("@P_PERIOD", pPeriod);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
    
    public static NString fRoepSperiodNotMandatory  (NString pCode, NString pPeriod) {
        
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PX_RECORD_OF_EMPLOYMENT.F_ROEP_SPERIOD_NOTMANDATORY", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_CODE", pCode);
		cmd.addParameter("@P_PERIOD", pPeriod);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);
	}
}
