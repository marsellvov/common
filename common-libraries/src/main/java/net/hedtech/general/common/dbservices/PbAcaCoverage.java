package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

public class PbAcaCoverage {
	
	public static NInteger fApiVersion() {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.F_API_VERSION", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NInteger.class);
			
		cmd.execute();

		return cmd.getReturnValue(NInteger.class);

	}
	
	public static NString fExists(NNumber pPidm,NNumber pYear,NDate pOfferDate,NString pRowid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.F_EXISTS", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@P_YEAR", pYear);
		cmd.addParameter("@P_OFFER_DATE", pOfferDate);
		cmd.addParameter("@P_ROWID", pRowid);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	public static NString fIsequal(AcaCoverageRecRow recOne,AcaCoverageRecRow recTwo) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.F_ISEQUAL", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AcaCoverageRecRow.class ));
		cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AcaCoverageRecRow.class ));
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}
	
	public static DataCursor fQueryAll(NNumber pPidm,NNumber pYear,NDate pOfferDate) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.F_QUERY_ALL", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@P_YEAR", pYear);
		cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			
		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}
	
	public static DataCursor fQueryOne(NNumber pPidm,NNumber pYear,NDate pOfferDate) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.F_QUERY_ONE", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@P_YEAR", pYear);
		cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			
		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}
	
	public static DataCursor fQueryByRowid(NString pRowid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_ROWID", pRowid);
			
		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}
	
	public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pYear,NDate pOfferDate,NString pRowid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@P_YEAR", pYear);
		cmd.addParameter("@P_OFFER_DATE", pOfferDate);
		cmd.addParameter("@P_ROWID", pRowid);
			
		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}
	
	public static void pCreate(NNumber            pPidm ,                
			                   NNumber            pYear ,                
			                   NDate              pOfferDate ,           
			                   NDate              pRecordDate ,         
			                   NString            pOfferToSpouseInd ,   
			                   NString            pOfferToDependentInd , 
			                   NString            pUserId ,             
			                   NString            pBdcaCode ,           
			                   NString            pBdplCode ,            
			                   NString            pAcaOfferCoverageCde ,
			                   NString            pAca4980hSafeHbrCde , 
			                   NNumber            pAcaMlyPremSelfAmt ,   
			                   NDate              pOfferAcceptanceDate , 
			                   NDate              pOfferDeclineDate ,   
			                   NString            pOfferDeclineReason ,  
			                   NClob              pOfferComments ,       
			                   NString            pDataOrigin ,        
			                   NString            pDefaultFlag ,         
			                   Ref<NString>       pWarningMsgOut,
			                   Ref<NString>       pRowidOut) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.P_CREATE", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@P_PIDM" ,                    pPidm               );
		cmd.addParameter("@P_YEAR" ,                    pYear               );
		cmd.addParameter("@P_OFFER_DATE" ,              pOfferDate          ); 
		cmd.addParameter("@P_RECORD_DATE" ,             pRecordDate         );
		cmd.addParameter("@P_OFFER_TO_SPOUSE_IND" ,     pOfferToSpouseInd   );
		cmd.addParameter("@P_OFFER_TO_DEPENDENT_IND" ,  pOfferToDependentInd);
		cmd.addParameter("@P_USER_ID" ,                 pUserId             );
		cmd.addParameter("@P_BDCA_CODE" ,               pBdcaCode           );
		cmd.addParameter("@P_BDPL_CODE" ,               pBdplCode           );
		cmd.addParameter("@P_ACA_OFFER_COVERAGE_CDE" ,  pAcaOfferCoverageCde);
		cmd.addParameter("@P_ACA_4980H_SAFE_HBR_CDE" ,  pAca4980hSafeHbrCde );
		cmd.addParameter("@P_ACA_MLY_PREM_SELF_AMT" ,   pAcaMlyPremSelfAmt  );
		cmd.addParameter("@P_OFFER_ACCEPTANCE_DATE" ,   pOfferAcceptanceDate);
		cmd.addParameter("@P_OFFER_DECLINE_DATE" ,      pOfferDeclineDate   );
		cmd.addParameter("@P_OFFER_DECLINE_REASON" ,    pOfferDeclineReason );
		cmd.addParameter("@P_OFFER_COMMENTS" ,          pOfferComments      );
		cmd.addParameter("@P_DATA_ORIGIN" ,             pDataOrigin         );
		cmd.addParameter("@P_DEFAULT_FLAG" ,            pDefaultFlag        ); 
		
		cmd.addParameter("@P_WARNING_MSG",              NString.class);
		cmd.addParameter("@P_ROWID_OUT",                NString.class);
			
		cmd.execute();
		
		pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG", NString.class);
		pRowidOut.val      = cmd.getParameterValue("@P_ROWID_OUT",   NString.class);


	}
	
	public static void pDelete(NNumber pPidm, NNumber pYear, NDate pOfferDate, NString pRowid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.P_DELETE", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@P_YEAR", pYear);
		cmd.addParameter("@P_OFFER_DATE", pOfferDate);
		cmd.addParameter("@P_ROWID", pRowid);
			
		cmd.execute();


	}
	
	public static void pLock(NNumber pPidm,NNumber pYear,NDate pOfferDate,Ref<NString> pRowidInout) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.P_LOCK", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@P_PIDM", pPidm);
		cmd.addParameter("@P_YEAR", pYear);
		cmd.addParameter("@P_OFFER_DATE", pOfferDate);
		cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
			
		cmd.execute();
		pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


	}
	
	public static void pUpdate(NNumber            pPidm ,                
                               NNumber            pYear ,                
                               NDate              pOfferDate ,           
                               NDate              pRecordDate ,         
                               NString            pOfferToSpouseInd ,   
                               NString            pOfferToDependentInd , 
                               NString            pUserId ,             
                               NString            pBdcaCode ,           
                               NString            pBdplCode ,            
                               NString            pAcaOfferCoverageCde ,
                               NString            pAca4980hSafeHbrCde , 
                               NNumber            pAcaMlyPremSelfAmt ,   
                               NDate              pOfferAcceptanceDate , 
                               NDate              pOfferDeclineDate ,   
                               NString            pOfferDeclineReason ,  
                               NClob              pOfferComments ,       
                               NString            pDataOrigin ,        
                               NString            pRowid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ACA_COVERAGE.P_UPDATE", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@P_PIDM" ,                    pPidm               );
		cmd.addParameter("@P_YEAR" ,                    pYear               );
		cmd.addParameter("@P_OFFER_DATE" ,              pOfferDate          ); 
		cmd.addParameter("@P_RECORD_DATE" ,             pRecordDate         );
		cmd.addParameter("@P_OFFER_TO_SPOUSE_IND" ,     pOfferToSpouseInd   );
		cmd.addParameter("@P_OFFER_TO_DEPENDENT_IND" ,  pOfferToDependentInd);
		cmd.addParameter("@P_USER_ID" ,                 pUserId             );
		cmd.addParameter("@P_BDCA_CODE" ,               pBdcaCode           );
		cmd.addParameter("@P_BDPL_CODE" ,               pBdplCode           );
		cmd.addParameter("@P_ACA_OFFER_COVERAGE_CDE" ,  pAcaOfferCoverageCde);
		cmd.addParameter("@P_ACA_4980H_SAFE_HBR_CDE" ,  pAca4980hSafeHbrCde );
		cmd.addParameter("@P_ACA_MLY_PREM_SELF_AMT" ,   pAcaMlyPremSelfAmt  );
		cmd.addParameter("@P_OFFER_ACCEPTANCE_DATE" ,   pOfferAcceptanceDate);
		cmd.addParameter("@P_OFFER_DECLINE_DATE" ,      pOfferDeclineDate   );
		cmd.addParameter("@P_OFFER_DECLINE_REASON" ,    pOfferDeclineReason );
		cmd.addParameter("@P_OFFER_COMMENTS" ,          pOfferComments      );
		cmd.addParameter("@P_DATA_ORIGIN" ,             pDataOrigin         );
		cmd.addParameter("@P_ROWID",                    pRowid);
			
		cmd.execute();


	}
	


@DbRecordType(id="AcaCoverageRecRow", dataSourceName="ACA_COVERAGE_REC")
public static class AcaCoverageRecRow
{
	@DbRecordField(dataSourceName="R_PIDM")
	public NNumber RPidm;
	@DbRecordField(dataSourceName="R_YEAR")
	public NNumber RYear;
	@DbRecordField(dataSourceName="R_OFFER_DATE")
	public NDate ROfferDate;
	@DbRecordField(dataSourceName="R_RECORD_DATE")
	public NDate RRecordDate;
	@DbRecordField(dataSourceName="R_OFFER_TO_SPOUSE_IND")
	public NString ROfferToSpouseInd;
	@DbRecordField(dataSourceName="R_OFFER_TO_DEPENDENT_IND")
	public NString ROfferToDependentInd;
	@DbRecordField(dataSourceName="R_USER_ID")
	public NString RUserId;
	@DbRecordField(dataSourceName="R_BDCA_CODE")
	public NString RBdcaCode;
	@DbRecordField(dataSourceName="R_BDPL_CODE")
	public NString RBdplCode;
	@DbRecordField(dataSourceName="R_ACA_OFFER_COVERAGE_CDE")
	public NString RAcaOfferCoverageCde;
	@DbRecordField(dataSourceName="R_ACA_4980H_SAFE_HBR_CDE")
	public NString RAca4980hSafeHbrCde;
	@DbRecordField(dataSourceName="R_ACA_MLY_PREM_SELF_AMT")
	public NNumber RAcaMlyPremSelfAmt;
	@DbRecordField(dataSourceName="R_OFFER_ACCEPTANCE_DATE")
	public NDate ROfferAcceptanceDate;
	@DbRecordField(dataSourceName="R_OFFER_DECLINE_DATE")
	public NDate ROfferDeclineDate;
	@DbRecordField(dataSourceName="R_OFFER_DECLINE_REASON")
	public NString ROfferDeclineReason;
	@DbRecordField(dataSourceName="R_OFFER_COMMENTS")
	public NClob ROfferComments;
	@DbRecordField(dataSourceName="R_DATA_ORIGIN")
	public NString RDataOrigin;
	@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
	public NString RInternalRecordId;
}



}
