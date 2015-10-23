package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAcadsessionImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void pAcrecAcadSessionElement(NNumber pDcmtSeqnoIn,NNumber pAsesSeqnoIn,NString pSessiondesignatorIn,NString pSessiondesignatorsuffixIn,NString pSessionnameIn,NString pSessiontypeIn,NString pSessionbegindateIn,NString pSessionenddateIn,NString pSessdetailNotemessageIn,NString pStudentlevelcodeIn,NString pStulevlNotemessageIn,NString pAcadsessionNotemessageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADSESSION_IMP.P_ACREC_ACAD_SESSION_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO_IN", pDcmtSeqnoIn);
			cmd.addParameter("@P_ASES_SEQNO_IN", pAsesSeqnoIn);
			cmd.addParameter("@P_SESSIONDESIGNATOR_IN", pSessiondesignatorIn);
			cmd.addParameter("@P_SESSIONDESIGNATORSUFFIX_IN", pSessiondesignatorsuffixIn);
			cmd.addParameter("@P_SESSIONNAME_IN", pSessionnameIn);
			cmd.addParameter("@P_SESSIONTYPE_IN", pSessiontypeIn);
			cmd.addParameter("@P_SESSIONBEGINDATE_IN", pSessionbegindateIn);
			cmd.addParameter("@P_SESSIONENDDATE_IN", pSessionenddateIn);
			cmd.addParameter("@P_SESSDETAIL_NOTEMESSAGE_IN", pSessdetailNotemessageIn);
			cmd.addParameter("@P_STUDENTLEVELCODE_IN", pStudentlevelcodeIn);
			cmd.addParameter("@P_STULEVL_NOTEMESSAGE_IN", pStulevlNotemessageIn);
			cmd.addParameter("@P_ACADSESSION_NOTEMESSAGE_IN", pAcadsessionNotemessageIn);
				
			cmd.execute();


		}
		
	
	
	
}
