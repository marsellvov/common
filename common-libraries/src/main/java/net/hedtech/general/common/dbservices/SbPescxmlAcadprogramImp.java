package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAcadprogramImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pAcrecAcademicPgmElement(NNumber pDcmtSeqnoIn,NNumber pAsesSeqnoIn,NString pProgramCodeTypeIn,NString pProgramCodeValueIn,NString pAcademicprogramtypeIn,NString pAcademicprogramnameIn,NString pAcadPgmNotemessageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_IMP.P_ACREC_ACADEMIC_PGM_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_ASES_SEQNO_IN", pAsesSeqnoIn);
			cmd.addParameter("@P_PROGRAM_CODE_TYPE_IN", pProgramCodeTypeIn);
			cmd.addParameter("@P_PROGRAM_CODE_VALUE_IN", pProgramCodeValueIn);
			cmd.addParameter("@P_ACADEMICPROGRAMTYPE_IN", pAcademicprogramtypeIn);
			cmd.addParameter("@P_ACADEMICPROGRAMNAME_IN", pAcademicprogramnameIn);
			cmd.addParameter("@P_ACAD_PGM_NOTEMESSAGE_IN", pAcadPgmNotemessageIn);
				
			cmd.execute();


		}
		
	
	
	
}
