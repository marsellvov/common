package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAcadsummaryImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pAcrecAcsessAcsumElement(NNumber pDcmtSeqnoIn,NNumber pAsesSeqnoIn,NNumber pGpaSeqnoIn,NString pAcademicsummarytypeIn,NString pAcademicsummarylevelIn,NString pCredithoursattemptedIn,NString pCredithoursearnedIn,NString pCreditunitIn,NString pGradepointaverageIn,NString pTotalqualitypointsIn,NString pCredithoursforgpaIn,NString pGpaNotemessageIn,NString pHonorstitleIn,NString pHonorslevelIn,NString pAcadsumHnrsNotemessageIn,NString pClassrankIn,NString pClasssizeIn,NString pAcadsumNotemessageIn,NString pDelinquenciesIn,NString pExitdateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_IMP.P_ACREC_ACSESS_ACSUM_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_ASES_SEQNO_IN", pAsesSeqnoIn);
			cmd.addParameter("@P_GPA_SEQNO_IN", pGpaSeqnoIn);
			cmd.addParameter("@P_ACADEMICSUMMARYTYPE_IN", pAcademicsummarytypeIn);
			cmd.addParameter("@P_ACADEMICSUMMARYLEVEL_IN", pAcademicsummarylevelIn);
			cmd.addParameter("@P_CREDITHOURSATTEMPTED_IN", pCredithoursattemptedIn);
			cmd.addParameter("@P_CREDITHOURSEARNED_IN", pCredithoursearnedIn);
			cmd.addParameter("@P_CREDITUNIT_IN", pCreditunitIn);
			cmd.addParameter("@P_GRADEPOINTAVERAGE_IN", pGradepointaverageIn);
			cmd.addParameter("@P_TOTALQUALITYPOINTS_IN", pTotalqualitypointsIn);
			cmd.addParameter("@P_CREDITHOURSFORGPA_IN", pCredithoursforgpaIn);
			cmd.addParameter("@P_GPA_NOTEMESSAGE_IN", pGpaNotemessageIn);
			cmd.addParameter("@P_HONORSTITLE_IN", pHonorstitleIn);
			cmd.addParameter("@P_HONORSLEVEL_IN", pHonorslevelIn);
			cmd.addParameter("@P_ACADSUM_HNRS_NOTEMESSAGE_IN", pAcadsumHnrsNotemessageIn);
			cmd.addParameter("@P_CLASSRANK_IN", pClassrankIn);
			cmd.addParameter("@P_CLASSSIZE_IN", pClasssizeIn);
			cmd.addParameter("@P_ACADSUM_NOTEMESSAGE_IN", pAcadsumNotemessageIn);
			cmd.addParameter("@P_DELINQUENCIES_IN", pDelinquenciesIn);
			cmd.addParameter("@P_EXITDATE_IN", pExitdateIn);
				
			cmd.execute();


		}
		
		public static void pAcrecAcsummaryElement(NNumber pDcmtSeqnoIn,NNumber pGpaSeqnoIn,NString pAcademicsummarytypeIn,NString pAcademicsummarylevelIn,NString pCredithoursattemptedIn,NString pCredithoursearnedIn,NString pCreditunitIn,NString pGradepointaverageIn,NString pTotalqualitypointsIn,NString pCredithoursforgpaIn,NString pGpaNotemessageIn,NString pHonorstitleIn,NString pHonorslevelIn,NString pAcadsumHnrsNotemessageIn,NString pClassrankIn,NString pClasssizeIn,NString pAcadsumNotemessageIn,NString pDelinquenciesIn,NString pExitdateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSUMMARY_IMP.P_ACREC_ACSUMMARY_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_GPA_SEQNO_IN", pGpaSeqnoIn);
			cmd.addParameter("@P_ACADEMICSUMMARYTYPE_IN", pAcademicsummarytypeIn);
			cmd.addParameter("@P_ACADEMICSUMMARYLEVEL_IN", pAcademicsummarylevelIn);
			cmd.addParameter("@P_CREDITHOURSATTEMPTED_IN", pCredithoursattemptedIn);
			cmd.addParameter("@P_CREDITHOURSEARNED_IN", pCredithoursearnedIn);
			cmd.addParameter("@P_CREDITUNIT_IN", pCreditunitIn);
			cmd.addParameter("@P_GRADEPOINTAVERAGE_IN", pGradepointaverageIn);
			cmd.addParameter("@P_TOTALQUALITYPOINTS_IN", pTotalqualitypointsIn);
			cmd.addParameter("@P_CREDITHOURSFORGPA_IN", pCredithoursforgpaIn);
			cmd.addParameter("@P_GPA_NOTEMESSAGE_IN", pGpaNotemessageIn);
			cmd.addParameter("@P_HONORSTITLE_IN", pHonorstitleIn);
			cmd.addParameter("@P_HONORSLEVEL_IN", pHonorslevelIn);
			cmd.addParameter("@P_ACADSUM_HNRS_NOTEMESSAGE_IN", pAcadsumHnrsNotemessageIn);
			cmd.addParameter("@P_CLASSRANK_IN", pClassrankIn);
			cmd.addParameter("@P_CLASSSIZE_IN", pClasssizeIn);
			cmd.addParameter("@P_ACADSUM_NOTEMESSAGE_IN", pAcadsumNotemessageIn);
			cmd.addParameter("@P_DELINQUENCIES_IN", pDelinquenciesIn);
			cmd.addParameter("@P_EXITDATE_IN", pExitdateIn);
				
			cmd.execute();


		}
		
	
	
	
}
