package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Soklibs {
		public static NString fClassCalc(NNumber pidm,NString levlCode,NString termCode,NString inProgressInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_CLASS_CALC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@IN_PROGRESS_IND", inProgressInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCollDegree(NNumber pPidm,NString pSbgiCode,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_COLL_DEGREE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetBcatDesc(NString pBldgCode,NString pBcatCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_GET_BCAT_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<StvTableTypeRow> fGetCodes(NString pStmtStr) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_GET_CODES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StvTableTypeRow>.class);
//			cmd.addParameter("@P_STMT_STR", pStmtStr);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StvTableTypeRow>.class);
//
//		}
		
		public static DataCursor fGetPrimaryCurrData(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_GET_PRIMARY_CURR_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fGetRace(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_GET_RACE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSorpcolValues(NNumber pPidm,NString pSbgiCode,NString pColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_GET_SORPCOL_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_COLUMN", pColumn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSsrxlstGroup(NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_GET_SSRXLST_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetStvresdInStateInd(NString pResdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_GET_STVRESD_IN_STATE_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHighschoolValue(NNumber pPidm,NString pInd,NString pRetInd,NString pTerm,NNumber pApplno,NString pAttrInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_HIGHSCHOOL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_RET_IND", pRetInd);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_APPLNO", pApplno);
			cmd.addParameter("@P_ATTR_IND", pAttrInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSarchklValue(NNumber pPidm,NString pTermCode,NNumber pApplNo,NNumber pPosition,NString pRetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_SARCHKL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_RET_IND", pRetInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSorcontFirstLast(NString pInternalCode,NNumber pPidm,NString pPosition,NString pRetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_SORCONT_FIRST_LAST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_RET_IND", pRetInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSorcontOrder(NString pInternalCode,NNumber pPidm,NNumber pPosition,NString pRetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_SORCONT_ORDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_RET_IND", pRetInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSorfolkValue(NNumber pPidm,NString pInternalCode,NNumber pPosition,NString pRetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_SORFOLK_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_RET_IND", pRetInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSortestValue(NNumber pPidm,NString pInternalCode,NNumber pPosition,NString pRetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_SORTEST_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_RET_IND", pRetInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSprholdValue(NString pInternalCode,NNumber pPidm,NNumber pPosition,NString pRetInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_SPRHOLD_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTERNAL_CODE", pInternalCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_RET_IND", pRetInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSrrlendValue(NNumber pPidm,NString pTerm,NNumber pApplno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_SRRLEND_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_APPLNO", pApplno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fValidCpTermRange(NString fromTermIn,NString toTermIn,NString includeToTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_VALID_CP_TERM_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@FROM_TERM_IN", fromTermIn);
			cmd.addParameter("@TO_TERM_IN", toTermIn);
			cmd.addParameter("@INCLUDE_TO_TERM", includeToTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static NBool fValtrue(List<ChartabtypRow> bexprTab,NInteger rows) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.F_VALTRUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NBool.class);
//			// cmd.addParameter(DbTypes.getTableType("BEXPR_TAB", "", bexprTab, object.class));
//			cmd.addParameter("@ROWS", rows);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NBool.class);
//
//		}
		
		public static void pAddSorfadr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.P_ADD_SORFADR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pClassCalc(NNumber pidm,NString levlCode,NString termCode,NString inProgressInd,Ref<NString> clasCode,Ref<NString> clasDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.P_CLASS_CALC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@IN_PROGRESS_IND", inProgressInd);
			cmd.addParameter("@CLAS_CODE", clasCode, true);
			cmd.addParameter("@CLAS_DESC", clasDesc, true);
				
			cmd.execute();
			clasCode.val = cmd.getParameterValue("@CLAS_CODE", NString.class);
			clasDesc.val = cmd.getParameterValue("@CLAS_DESC", NString.class);


		}
		
		public static void pFinaidRecon(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLIBS.P_FINAID_RECON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PrimaryCurrRecRow", dataSourceName="PRIMARY_CURR_REC")
	public static class PrimaryCurrRecRow
	{
		@DbRecordField(dataSourceName="R_FULL_PART_IND")
		public NString RFullPartInd;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_PRIMARY_MAJOR_CODE")
		public NString RPrimaryMajorCode;
		@DbRecordField(dataSourceName="R_SECONDARY_MAJOR_CODE")
		public NString RSecondaryMajorCode;
		@DbRecordField(dataSourceName="R_MINOR_CODE")
		public NString RMinorCode;
	}

	
	@DbRecordType(id="StvRecRow", dataSourceName="STV_REC")
	public static class StvRecRow
	{
		@DbRecordField(dataSourceName="STV_CODE")
		public NString StvCode;
		@DbRecordField(dataSourceName="STV_DESC")
		public NString StvDesc;
	}

	
	
}
