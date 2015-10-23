package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlImmuImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_IMMU_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pImmuElement(NNumber pDcmtSeqnoIn,NString pImmunizationdateIn,NString pImmunizationcodeIn,NString pImmunizationImstcodeIn,NString pImmunizationRptIn,NString pImmunizationNoteIn,NString pHealthNoteIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_IMMU_IMP.P_IMMU_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_IMMUNIZATIONDATE_IN", pImmunizationdateIn);
			cmd.addParameter("@P_IMMUNIZATIONCODE_IN", pImmunizationcodeIn);
			cmd.addParameter("@P_IMMUNIZATION_IMSTCODE_IN", pImmunizationImstcodeIn);
			cmd.addParameter("@P_IMMUNIZATION_RPT_IN", pImmunizationRptIn);
			cmd.addParameter("@P_IMMUNIZATION_NOTE_IN", pImmunizationNoteIn);
			cmd.addParameter("@P_HEALTH_NOTE_IN", pHealthNoteIn);
				
			cmd.execute();


		}
		
		public static void pLoadImmunizationsToBanner(NNumber pPidm,NNumber pDcmtSeqno,Ref<NString> pErrMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_IMMU_IMP.P_LOAD_IMMUNIZATIONS_TO_BANNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ERR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrMsgOut.val = cmd.getParameterValue("@P_ERR_MSG_OUT", NString.class);


		}
		
	
	
	
}
