package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbScpRuletimestat {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTmstCode,NString pScpsCodeEff,NString pCampCode,NString pLevlCode,NString pCollCode,NString pMajrCode,NString pStypCode,NString pDegcCode,NNumber pMinCredits,NNumber pMaxCredits,NString pTaxInd,NNumber pNumbCredits,NNumber pNumbCourses,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_SCPS_CODE_EFF", pScpsCodeEff);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_MIN_CREDITS", pMinCredits);
			cmd.addParameter("@P_MAX_CREDITS", pMaxCredits);
			cmd.addParameter("@P_TAX_IND", pTaxInd);
			cmd.addParameter("@P_NUMB_CREDITS", pNumbCredits);
			cmd.addParameter("@P_NUMB_COURSES", pNumbCourses);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ScpRuletimestatRecRow recOne,ScpRuletimestatRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ScpRuletimestatRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ScpRuletimestatRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTmstCode,NString pScpsCodeEff,NString pCampCode,NString pLevlCode,NString pCollCode,NString pMajrCode,NString pStypCode,NString pDegcCode,NNumber pMinCredits,NNumber pMaxCredits,NString pTaxInd,NNumber pNumbCredits,NNumber pNumbCourses) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_SCPS_CODE_EFF", pScpsCodeEff);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_MIN_CREDITS", pMinCredits);
			cmd.addParameter("@P_MAX_CREDITS", pMaxCredits);
			cmd.addParameter("@P_TAX_IND", pTaxInd);
			cmd.addParameter("@P_NUMB_CREDITS", pNumbCredits);
			cmd.addParameter("@P_NUMB_COURSES", pNumbCourses);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTmstCode,NString pScpsCodeEff,NString pCampCode,NString pLevlCode,NString pCollCode,NString pMajrCode,NString pStypCode,NString pDegcCode,NNumber pMinCredits,NNumber pMaxCredits,NString pTaxInd,NNumber pNumbCredits,NNumber pNumbCourses) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_SCPS_CODE_EFF", pScpsCodeEff);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_MIN_CREDITS", pMinCredits);
			cmd.addParameter("@P_MAX_CREDITS", pMaxCredits);
			cmd.addParameter("@P_TAX_IND", pTaxInd);
			cmd.addParameter("@P_NUMB_CREDITS", pNumbCredits);
			cmd.addParameter("@P_NUMB_COURSES", pNumbCourses);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTmstCode,NString pScpsCodeEff,NString pCampCode,NString pLevlCode,NString pCollCode,NString pMajrCode,NString pStypCode,NString pDegcCode,NNumber pMinCredits,NNumber pMaxCredits,NString pTaxInd,NNumber pNumbCredits,NNumber pNumbCourses,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_SCPS_CODE_EFF", pScpsCodeEff);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_MIN_CREDITS", pMinCredits);
			cmd.addParameter("@P_MAX_CREDITS", pMaxCredits);
			cmd.addParameter("@P_TAX_IND", pTaxInd);
			cmd.addParameter("@P_NUMB_CREDITS", pNumbCredits);
			cmd.addParameter("@P_NUMB_COURSES", pNumbCourses);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTmstCode,NString pScpsCodeEff,NString pCampCode,NString pLevlCode,NString pCollCode,NString pMajrCode,NString pStypCode,NString pDegcCode,NNumber pMinCredits,NNumber pMaxCredits,NNumber pRuleNumb,NString pTaxInd,NNumber pNumbCredits,NNumber pNumbCourses,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_SCPS_CODE_EFF", pScpsCodeEff);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_MIN_CREDITS", pMinCredits);
			cmd.addParameter("@P_MAX_CREDITS", pMaxCredits);
			cmd.addParameter("@P_RULE_NUMB", pRuleNumb);
			cmd.addParameter("@P_TAX_IND", pTaxInd);
			cmd.addParameter("@P_NUMB_CREDITS", pNumbCredits);
			cmd.addParameter("@P_NUMB_COURSES", pNumbCourses);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTmstCode,NString pScpsCodeEff,NString pCampCode,NString pLevlCode,NString pCollCode,NString pMajrCode,NString pStypCode,NString pDegcCode,NNumber pMinCredits,NNumber pMaxCredits,NString pTaxInd,NNumber pNumbCredits,NNumber pNumbCourses,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_SCPS_CODE_EFF", pScpsCodeEff);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_MIN_CREDITS", pMinCredits);
			cmd.addParameter("@P_MAX_CREDITS", pMaxCredits);
			cmd.addParameter("@P_TAX_IND", pTaxInd);
			cmd.addParameter("@P_NUMB_CREDITS", pNumbCredits);
			cmd.addParameter("@P_NUMB_COURSES", pNumbCourses);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTmstCode,NString pScpsCodeEff,NString pCampCode,NString pLevlCode,NString pCollCode,NString pMajrCode,NString pStypCode,NString pDegcCode,NNumber pMinCredits,NNumber pMaxCredits,NString pTaxInd,NNumber pNumbCredits,NNumber pNumbCourses,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_SCPS_CODE_EFF", pScpsCodeEff);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_MIN_CREDITS", pMinCredits);
			cmd.addParameter("@P_MAX_CREDITS", pMaxCredits);
			cmd.addParameter("@P_TAX_IND", pTaxInd);
			cmd.addParameter("@P_NUMB_CREDITS", pNumbCredits);
			cmd.addParameter("@P_NUMB_COURSES", pNumbCourses);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTmstCode,NString pScpsCodeEff,NString pCampCode,NString pLevlCode,NString pCollCode,NString pMajrCode,NString pStypCode,NString pDegcCode,NNumber pMinCredits,NNumber pMaxCredits,NNumber pRuleNumb,NString pTaxInd,NNumber pNumbCredits,NNumber pNumbCourses,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_SCPS_CODE_EFF", pScpsCodeEff);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_MIN_CREDITS", pMinCredits);
			cmd.addParameter("@P_MAX_CREDITS", pMaxCredits);
			cmd.addParameter("@P_RULE_NUMB", pRuleNumb);
			cmd.addParameter("@P_TAX_IND", pTaxInd);
			cmd.addParameter("@P_NUMB_CREDITS", pNumbCredits);
			cmd.addParameter("@P_NUMB_COURSES", pNumbCourses);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ScpRuletimestatRecRow", dataSourceName="SCP_RULETIMESTAT_REC")
	public static class ScpRuletimestatRecRow
	{
		@DbRecordField(dataSourceName="R_TMST_CODE")
		public NString RTmstCode;
		@DbRecordField(dataSourceName="R_SCPS_CODE_EFF")
		public NString RScpsCodeEff;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE")
		public NString RMajrCode;
		@DbRecordField(dataSourceName="R_STYP_CODE")
		public NString RStypCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_MIN_CREDITS")
		public NNumber RMinCredits;
		@DbRecordField(dataSourceName="R_MAX_CREDITS")
		public NNumber RMaxCredits;
		@DbRecordField(dataSourceName="R_RULE_NUMB")
		public NNumber RRuleNumb;
		@DbRecordField(dataSourceName="R_TAX_IND")
		public NString RTaxInd;
		@DbRecordField(dataSourceName="R_NUMB_CREDITS")
		public NNumber RNumbCredits;
		@DbRecordField(dataSourceName="R_NUMB_COURSES")
		public NNumber RNumbCourses;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
