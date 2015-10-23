package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAddlstuachvExp {
		public static void pAcrecAddlstuacheivElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,Ref<DataCursor> pRequirementRefcsrOut,Ref<DataCursor> pAttributeRefcsrOut,Ref<DataCursor> pProficiencyRefcsrOut,Ref<DataCursor> pLangProficiencyRefcsrOut,Ref<DataCursor> pLicensureRefcsrOut,Ref<NString> pAddlstuachvNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ADDLSTUACHV_EXP.P_ACREC_ADDLSTUACHEIV_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_REQUIREMENT_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_ATTRIBUTE_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_PROFICIENCY_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_LANG_PROFICIENCY_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_LICENSURE_REFCSR_OUT", DataCursor.class);
			cmd.addParameter("@P_ADDLSTUACHV_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pRequirementRefcsrOut.val = cmd.getParameterValue("@P_REQUIREMENT_REFCSR_OUT", DataCursor.class);
			pAttributeRefcsrOut.val = cmd.getParameterValue("@P_ATTRIBUTE_REFCSR_OUT", DataCursor.class);
			pProficiencyRefcsrOut.val = cmd.getParameterValue("@P_PROFICIENCY_REFCSR_OUT", DataCursor.class);
			pLangProficiencyRefcsrOut.val = cmd.getParameterValue("@P_LANG_PROFICIENCY_REFCSR_OUT", DataCursor.class);
			pLicensureRefcsrOut.val = cmd.getParameterValue("@P_LICENSURE_REFCSR_OUT", DataCursor.class);
			pAddlstuachvNotemessageOut.val = cmd.getParameterValue("@P_ADDLSTUACHV_NOTEMESSAGE_OUT", NString.class);


		}
		
	
	
	
}
