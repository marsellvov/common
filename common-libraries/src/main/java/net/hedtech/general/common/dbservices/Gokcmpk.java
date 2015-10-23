package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokcmpk {
		public static NString fResultPriority() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCMPK.F_RESULT_PRIORITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fRulesExists(NString pCmscCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCMPK.F_RULES_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTableRuleExists(NString pCmscCode,NNumber pPriorityNo,NString pTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCMPK.F_TABLE_RULE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_TABLE", pTable);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fTestName(NString pName,NString pAlias) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCMPK.F_TEST_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_ALIAS", pAlias);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTestNpName(NString pName,NString pAlias) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCMPK.F_TEST_NP_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_ALIAS", pAlias);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCommonMatching(NString pCmscCode,Ref<NString> pMatchStatusOut,Ref<NNumber> pMatchPidmOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCMPK.P_COMMON_MATCHING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_MATCH_STATUS_OUT", NString.class);
			cmd.addParameter("@P_MATCH_PIDM_OUT", NNumber.class);
				
			cmd.execute();
			pMatchStatusOut.val = cmd.getParameterValue("@P_MATCH_STATUS_OUT", NString.class);
			pMatchPidmOut.val = cmd.getParameterValue("@P_MATCH_PIDM_OUT", NNumber.class);


		}
		
		public static void pGetCmOptions(NString pCmUserId,Ref<NString> pCallUiOut,Ref<NString> pCmscOptionIndOut,Ref<NString> pCmscCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCMPK.P_GET_CM_OPTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
			cmd.addParameter("@P_CALL_UI_OUT", NString.class);
			cmd.addParameter("@P_CMSC_OPTION_IND_OUT", NString.class);
			cmd.addParameter("@P_CMSC_CODE_OUT", NString.class);
				
			cmd.execute();
			pCallUiOut.val = cmd.getParameterValue("@P_CALL_UI_OUT", NString.class);
			pCmscOptionIndOut.val = cmd.getParameterValue("@P_CMSC_OPTION_IND_OUT", NString.class);
			pCmscCodeOut.val = cmd.getParameterValue("@P_CMSC_CODE_OUT", NString.class);


		}
		
		public static void pInsertGotcmme(NString pLastName,NString pEntityCde,NString pFirstName,NString pMi,NString pId,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCntyCode,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pSsn,NString pBirthDay,NString pBirthMon,NString pBirthYear,NString pSex,NString pEmailAddress,NString pAtypCode,NString pTeleCode,NString pEmalCode,NString pAsrcCode,NString pAddidCode,NString pAddid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCMPK.P_INSERT_GOTCMME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_ENTITY_CDE", pEntityCde);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DAY", pBirthDay);
			cmd.addParameter("@P_BIRTH_MON", pBirthMon);
			cmd.addParameter("@P_BIRTH_YEAR", pBirthYear);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_ASRC_CODE", pAsrcCode);
			cmd.addParameter("@P_ADDID_CODE", pAddidCode);
			cmd.addParameter("@P_ADDID", pAddid);
				
			cmd.execute();


		}
		
		public static void pMatchData(DatarecordtypRow pDatarec,Ref<NNumber> pMatchCntOut,Ref<NNumber> pMissingCntOut,Ref<NNumber> pNoMatchCntOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCMPK.P_MATCH_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_DATAREC", pDatarec, DatarecordtypRow.class ));
			cmd.addParameter("@P_MATCH_CNT_OUT", NNumber.class);
			cmd.addParameter("@P_MISSING_CNT_OUT", NNumber.class);
			cmd.addParameter("@P_NO_MATCH_CNT_OUT", NNumber.class);
				
			cmd.execute();
			pMatchCntOut.val = cmd.getParameterValue("@P_MATCH_CNT_OUT", NNumber.class);
			pMissingCntOut.val = cmd.getParameterValue("@P_MISSING_CNT_OUT", NNumber.class);
			pNoMatchCntOut.val = cmd.getParameterValue("@P_NO_MATCH_CNT_OUT", NNumber.class);


		}
		
//		public static void pProcessResultTable(List<ResulttabtypRow> pResulttab,Ref<NString> pResultIndOut,Ref<NString> pRowidOut,Ref<NNumber> pMatchCountOut,Ref<NNumber> pMissingCountOut,Ref<NNumber> pUnmatchCountOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKCMPK.P_PROCESS_RESULT_TABLE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_RESULTTAB", "", pResulttab, object.class));
//			cmd.addParameter("@P_RESULT_IND_OUT", NString.class);
//			cmd.addParameter("@P_ROWID_OUT", NString.class);
//			cmd.addParameter("@P_MATCH_COUNT_OUT", NNumber.class);
//			cmd.addParameter("@P_MISSING_COUNT_OUT", NNumber.class);
//			cmd.addParameter("@P_UNMATCH_COUNT_OUT", NNumber.class);
//				
//			cmd.execute();
//			pResultIndOut.val = cmd.getParameterValue("@P_RESULT_IND_OUT", NString.class);
//			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
//			pMatchCountOut.val = cmd.getParameterValue("@P_MATCH_COUNT_OUT", NNumber.class);
//			pMissingCountOut.val = cmd.getParameterValue("@P_MISSING_COUNT_OUT", NNumber.class);
//			pUnmatchCountOut.val = cmd.getParameterValue("@P_UNMATCH_COUNT_OUT", NNumber.class);
//
//
//		}
		
	
	
	@DbRecordType(id="DatarecordtypRow", dataSourceName="DATARECORDTYP")
	public static class DatarecordtypRow
	{
		@DbRecordField(dataSourceName="DATA_CMME_VALUE")
		public NString DataCmmeValue;
		@DbRecordField(dataSourceName="DATA_DB_VALUE")
		public NString DataDbValue;
		@DbRecordField(dataSourceName="DATA_COLUMN")
		public NString DataColumn;
		@DbRecordField(dataSourceName="DATA_ELEMENT")
		public NString DataElement;
		@DbRecordField(dataSourceName="DATA_REQ_IND")
		public NString DataReqInd;
		@DbRecordField(dataSourceName="DATA_START")
		public NNumber DataStart;
		@DbRecordField(dataSourceName="DATA_LENGTH")
		public NNumber DataLength;
	}

	
	@DbRecordType(id="ResultrecordtypRow", dataSourceName="RESULTRECORDTYP")
	public static class ResultrecordtypRow
	{
		@DbRecordField(dataSourceName="RESULT_ROW_ID")
		public NString ResultRowId;
		@DbRecordField(dataSourceName="RESULT_ROW_MATCH_CNT")
		public NNumber ResultRowMatchCnt;
		@DbRecordField(dataSourceName="RESULT_ROW_MISSING_CNT")
		public NNumber ResultRowMissingCnt;
		@DbRecordField(dataSourceName="RESULT_ROW_NO_MATCH_CNT")
		public NNumber ResultRowNoMatchCnt;
		@DbRecordField(dataSourceName="RESULT_ROW_RESULT_IND")
		public NString ResultRowResultInd;
	}

	
	
}
