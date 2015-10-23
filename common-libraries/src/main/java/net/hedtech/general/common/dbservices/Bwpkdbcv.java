package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdbcv {
		public static void pCoverageallocsummary() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBCV.P_COVERAGEALLOCSUMMARY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pModifyallocation(NString pBdcaCode,NString pEffDate,NString pPlanCode,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pPrimaryInd,List<Twbklibs.Varchar2TabtypeRow> pPrimaryAllocPct,List<Twbklibs.Varchar2TabtypeRow> pPrimaryAllocAmt,List<Twbklibs.Varchar2TabtypeRow> pContingentAllocPct,List<Twbklibs.Varchar2TabtypeRow> pContingentAllocAmt,List<Twbklibs.Varchar2TabtypeRow> pOpenEnrollInd,List<Twbklibs.Varchar2TabtypeRow> pName,List<Twbklibs.Varchar2TabtypeRow> pChangeable,NString pMessageExist,List<Twbklibs.Varchar2TabtypeRow> pMessage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBCV.P_MODIFYALLOCATION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
//			cmd.addParameter("@P_EFF_DATE", pEffDate);
//			cmd.addParameter("@P_PLAN_CODE", pPlanCode);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_IND", "", pPrimaryInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_ALLOC_PCT", "", pPrimaryAllocPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_ALLOC_AMT", "", pPrimaryAllocAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTINGENT_ALLOC_PCT", "", pContingentAllocPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTINGENT_ALLOC_AMT", "", pContingentAllocAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OPEN_ENROLL_IND", "", pOpenEnrollInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NAME", "", pName, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CHANGEABLE", "", pChangeable, object.class));
//			cmd.addParameter("@P_MESSAGE_EXIST", pMessageExist);
//			// cmd.addParameter(DbTypes.getTableType("P_MESSAGE", "", pMessage, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pModifycoverage(NString pBdcaCode,NString pEffDate,NString pPlanCode,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pBeginDate,List<Twbklibs.Varchar2TabtypeRow> pEndDate,List<Twbklibs.Varchar2TabtypeRow> pDreaCode,List<Twbklibs.Varchar2TabtypeRow> pOtherCov,List<Twbklibs.Varchar2TabtypeRow> pOpenEnrollInd,List<Twbklibs.Varchar2TabtypeRow> pMark,List<Twbklibs.Varchar2TabtypeRow> pName,List<Twbklibs.Varchar2TabtypeRow> pChangeable,List<Twbklibs.Varchar2TabtypeRow> pCovered,NString pMessageExist,List<Twbklibs.Varchar2TabtypeRow> pMessage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBCV.P_MODIFYCOVERAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
//			cmd.addParameter("@P_EFF_DATE", pEffDate);
//			cmd.addParameter("@P_PLAN_CODE", pPlanCode);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BEGIN_DATE", "", pBeginDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_END_DATE", "", pEndDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DREA_CODE", "", pDreaCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OTHER_COV", "", pOtherCov, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OPEN_ENROLL_IND", "", pOpenEnrollInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_MARK", "", pMark, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NAME", "", pName, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CHANGEABLE", "", pChangeable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COVERED", "", pCovered, object.class));
//			cmd.addParameter("@P_MESSAGE_EXIST", pMessageExist);
//			// cmd.addParameter(DbTypes.getTableType("P_MESSAGE", "", pMessage, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
		public static void pModifynames(NString pSeqNo,NString pBenePidm,NString pLastName,NString pFirstName,NString pMi,NString pBrelCode,NString pSexInd,NString pBirthDate,NString pCollegeInd,NString pSsn,NString pSurnamePrefix,NString pAddedDate,NString pActiveInd,NString pMemberType,NString pSpouseInd,NString pMaritalCode,NString pBeginDate,NString pEndDate,NString pDisableInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBCV.P_MODIFYNAMES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_BENE_PIDM", pBenePidm);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
			cmd.addParameter("@P_SEX_IND", pSexInd);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_COLLEGE_IND", pCollegeInd);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ADDED_DATE", pAddedDate);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_MEMBER_TYPE", pMemberType);
			cmd.addParameter("@P_SPOUSE_IND", pSpouseInd);
			cmd.addParameter("@P_MARITAL_CODE", pMaritalCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DISABLE_IND", pDisableInd);
				
			cmd.execute();


		}
		
		public static void pNamesandbenefits(NString pReturnedLocation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBCV.P_NAMESANDBENEFITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RETURNED_LOCATION", pReturnedLocation);
				
			cmd.execute();


		}
		
//		public static void pUpdateallocation(NString pBdcaCode,NString pEffDate,NString pPlanCode,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pPrimaryInd,List<Twbklibs.Varchar2TabtypeRow> pPrimaryAllocPct,List<Twbklibs.Varchar2TabtypeRow> pPrimaryAllocAmt,List<Twbklibs.Varchar2TabtypeRow> pContingentAllocPct,List<Twbklibs.Varchar2TabtypeRow> pContingentAllocAmt,List<Twbklibs.Varchar2TabtypeRow> pOpenEnrollInd,List<Twbklibs.Varchar2TabtypeRow> pName,List<Twbklibs.Varchar2TabtypeRow> pChangeable,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBCV.P_UPDATEALLOCATION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
//			cmd.addParameter("@P_EFF_DATE", pEffDate);
//			cmd.addParameter("@P_PLAN_CODE", pPlanCode);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_IND", "", pPrimaryInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_ALLOC_PCT", "", pPrimaryAllocPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PRIMARY_ALLOC_AMT", "", pPrimaryAllocAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTINGENT_ALLOC_PCT", "", pContingentAllocPct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CONTINGENT_ALLOC_AMT", "", pContingentAllocAmt, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OPEN_ENROLL_IND", "", pOpenEnrollInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NAME", "", pName, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CHANGEABLE", "", pChangeable, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdatecoverage(NString pBdcaCode,NString pEffDate,NString pPlanCode,List<Twbklibs.Varchar2TabtypeRow> pSeqNo,List<Twbklibs.Varchar2TabtypeRow> pBeginDate,List<Twbklibs.Varchar2TabtypeRow> pEndDate,List<Twbklibs.Varchar2TabtypeRow> pDreaCode,List<Twbklibs.Varchar2TabtypeRow> pOtherCov,List<Twbklibs.Varchar2TabtypeRow> pOpenEnrollInd,List<Twbklibs.Varchar2TabtypeRow> pMark,List<Twbklibs.Varchar2TabtypeRow> pName,List<Twbklibs.Varchar2TabtypeRow> pChangeable,List<Twbklibs.Varchar2TabtypeRow> pCovered,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBCV.P_UPDATECOVERAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
//			cmd.addParameter("@P_EFF_DATE", pEffDate);
//			cmd.addParameter("@P_PLAN_CODE", pPlanCode);
//			// cmd.addParameter(DbTypes.getTableType("P_SEQ_NO", "", pSeqNo, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_BEGIN_DATE", "", pBeginDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_END_DATE", "", pEndDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DREA_CODE", "", pDreaCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OTHER_COV", "", pOtherCov, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_OPEN_ENROLL_IND", "", pOpenEnrollInd, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_MARK", "", pMark, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_NAME", "", pName, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CHANGEABLE", "", pChangeable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COVERED", "", pCovered, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pUpdatename(NString pSeqNo,NString pBenePidm,NString pLastName,NString pFirstName,NString pMi,NString pBrelCode,NString pSexInd,NString pBirthDate,NString pCollegeInd,NString pSsn,NString pRemove,NString pSurnamePrefix,NString pAddedDate,NString pActiveInd,NString pMemberType,NString pSpouseInd,NString pMaritalCode,NString pBeginDate,NString pEndDate,NString pDisableInd,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDBCV.P_UPDATENAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_BENE_PIDM", pBenePidm);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_BREL_CODE", pBrelCode);
			cmd.addParameter("@P_SEX_IND", pSexInd);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_COLLEGE_IND", pCollegeInd);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_REMOVE", pRemove);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_ADDED_DATE", pAddedDate);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_MEMBER_TYPE", pMemberType);
			cmd.addParameter("@P_SPOUSE_IND", pSpouseInd);
			cmd.addParameter("@P_MARITAL_CODE", pMaritalCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DISABLE_IND", pDisableInd);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
	
	
	
}
