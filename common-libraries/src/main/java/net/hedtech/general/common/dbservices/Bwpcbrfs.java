package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpcbrfs {
		public static NString fGetContractType(NNumber pEmpPidm,NString pEmpTerm,NString pEmpPosn,NString pEmpSuff,NDate pEffDate,NString pContractType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBRFS.F_GET_CONTRACT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_EMP_TERM", pEmpTerm);
			cmd.addParameter("@P_EMP_POSN", pEmpPosn);
			cmd.addParameter("@P_EMP_SUFF", pEmpSuff);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_CONTRACT_TYPE", pContractType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getAdmnOrgns(NNumber pPidm,NString pTerm,NString pPtrm,NString pCollege,NString pCampus,Ref<DataCursor> facAdmnRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBRFS.GET_ADMN_ORGNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PTRM", pPtrm);
			cmd.addParameter("@P_COLLEGE", pCollege);
			cmd.addParameter("@P_CAMPUS", pCampus);
			cmd.addParameter("@FAC_ADMN_REC", DataCursor.class);
				
			cmd.execute();
			facAdmnRec.val = cmd.getParameterValue("@FAC_ADMN_REC", DataCursor.class);


		}
		
		public static void getCompensationDetails(NNumber pPidm,NString pTerm,NString pOrgnCode,NString pCoasCode,NString pPtrm,NString pCollege,NString pCampus,Ref<NNumber> pContractCount,Ref<NString> pAckStatus,Ref<NString> pLockInd,Ref<NString> pUnlockInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBRFS.GET_COMPENSATION_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PTRM", pPtrm);
			cmd.addParameter("@P_COLLEGE", pCollege);
			cmd.addParameter("@P_CAMPUS", pCampus);
			cmd.addParameter("@P_CONTRACT_COUNT", NNumber.class);
			cmd.addParameter("@P_ACK_STATUS", NString.class);
			cmd.addParameter("@P_LOCK_IND", NString.class);
			cmd.addParameter("@P_UNLOCK_IND", NString.class);
				
			cmd.execute();
			pContractCount.val = cmd.getParameterValue("@P_CONTRACT_COUNT", NNumber.class);
			pAckStatus.val = cmd.getParameterValue("@P_ACK_STATUS", NString.class);
			pLockInd.val = cmd.getParameterValue("@P_LOCK_IND", NString.class);
			pUnlockInd.val = cmd.getParameterValue("@P_UNLOCK_IND", NString.class);


		}
		
		public static void getFacJobs(NString pPidm,NString pTerm,Ref<DataCursor> facRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBRFS.GET_FAC_JOBS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@FAC_REC", DataCursor.class);
				
			cmd.execute();
			facRec.val = cmd.getParameterValue("@FAC_REC", DataCursor.class);


		}
		
		public static void pGetTermSelect(NNumber pPidm,NString pTerm,Ref<DataCursor> pTermSelectRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBRFS.P_GET_TERM_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TERM_SELECT_REF", DataCursor.class);
				
			cmd.execute();
			pTermSelectRef.val = cmd.getParameterValue("@P_TERM_SELECT_REF", DataCursor.class);


		}
		
		public static void pGetTermSelectCompsn(NString pTerm,Ref<DataCursor> pTermSelectRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPCBRFS.P_GET_TERM_SELECT_COMPSN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TERM_SELECT_REF", DataCursor.class);
				
			cmd.execute();
			pTermSelectRef.val = cmd.getParameterValue("@P_TERM_SELECT_REF", DataCursor.class);


		}
		
	
	
	
}
