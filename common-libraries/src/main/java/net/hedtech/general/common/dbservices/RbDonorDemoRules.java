package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbDonorDemoRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DONOR_DEMO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pFundCode,NString pPrimaryDonorInd,NString pReceptInvitationInd,NString pDonorSelectionInd,NString pAnonymousInd,NString pGrades,NString pLetter,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DONOR_DEMO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PRIMARY_DONOR_IND", pPrimaryDonorInd);
			cmd.addParameter("@P_RECEPT_INVITATION_IND", pReceptInvitationInd);
			cmd.addParameter("@P_DONOR_SELECTION_IND", pDonorSelectionInd);
			cmd.addParameter("@P_ANONYMOUS_IND", pAnonymousInd);
			cmd.addParameter("@P_GRADES", pGrades);
			cmd.addParameter("@P_LETTER", pLetter);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pFundCode,NString pPrimaryDonorInd,NString pReceptInvitationInd,NString pDonorSelectionInd,NString pAnonymousInd,NString pGrades,NString pLetter,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_DONOR_DEMO_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PRIMARY_DONOR_IND", pPrimaryDonorInd);
			cmd.addParameter("@P_RECEPT_INVITATION_IND", pReceptInvitationInd);
			cmd.addParameter("@P_DONOR_SELECTION_IND", pDonorSelectionInd);
			cmd.addParameter("@P_ANONYMOUS_IND", pAnonymousInd);
			cmd.addParameter("@P_GRADES", pGrades);
			cmd.addParameter("@P_LETTER", pLetter);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
