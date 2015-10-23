package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAcadawardImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADAWARD_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pAcrecAcawardElement(NNumber pDcmtSeqnoIn,NNumber pAsesSeqnoIn,NString pAcademicawardlevelIn,NString pAcademicawarddateIn,NString pAcademicawardtitleIn,NString pAcademichonorsRefCsrIn,NString pHonorstitleIn,NString pHonorslevelIn,NString pAcadHonorsNotemessageIn,NString pAcademiccompletionindIn,NString pAcademiccompletiondateIn,NString pAcademicDgrqRefCsrIn,NString pThesisdissertationtitleIn,NString pThesisdissertationadvIn,NString pAwrdDgrqNotemessageIn,NString pAwrdNotemessageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADAWARD_IMP.P_ACREC_ACAWARD_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_ASES_SEQNO_IN", pAsesSeqnoIn);
			cmd.addParameter("@P_ACADEMICAWARDLEVEL_IN", pAcademicawardlevelIn);
			cmd.addParameter("@P_ACADEMICAWARDDATE_IN", pAcademicawarddateIn);
			cmd.addParameter("@P_ACADEMICAWARDTITLE_IN", pAcademicawardtitleIn);
			cmd.addParameter("@P_ACADEMICHONORS_REF_CSR_IN", pAcademichonorsRefCsrIn);
			cmd.addParameter("@P_HONORSTITLE_IN", pHonorstitleIn);
			cmd.addParameter("@P_HONORSLEVEL_IN", pHonorslevelIn);
			cmd.addParameter("@P_ACAD_HONORS_NOTEMESSAGE_IN", pAcadHonorsNotemessageIn);
			cmd.addParameter("@P_ACADEMICCOMPLETIONIND_IN", pAcademiccompletionindIn);
			cmd.addParameter("@P_ACADEMICCOMPLETIONDATE_IN", pAcademiccompletiondateIn);
			cmd.addParameter("@P_ACADEMIC_DGRQ_REF_CSR_IN", pAcademicDgrqRefCsrIn);
			cmd.addParameter("@P_THESISDISSERTATIONTITLE_IN", pThesisdissertationtitleIn);
			cmd.addParameter("@P_THESISDISSERTATIONADV_IN", pThesisdissertationadvIn);
			cmd.addParameter("@P_AWRD_DGRQ_NOTEMESSAGE_IN", pAwrdDgrqNotemessageIn);
			cmd.addParameter("@P_AWRD_NOTEMESSAGE_IN", pAwrdNotemessageIn);
				
			cmd.execute();


		}
		
	
	
	
}
