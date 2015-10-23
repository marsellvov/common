package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlCourseUdeExp {
		public static void pAcadrecCourseUdeElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,Ref<NString> pParentElementNameOut,Ref<NString> pCourseAcadrecUdeUriOut,Ref<NString> pParentValueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_COURSE_UDE_EXP.P_ACADREC_COURSE_UDE_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_PARENT_ELEMENT_NAME_OUT", NString.class);
			cmd.addParameter("@P_COURSE_ACADREC_UDE_URI_OUT", NString.class);
			cmd.addParameter("@P_PARENT_VALUE_OUT", NString.class);
				
			cmd.execute();
			pParentElementNameOut.val = cmd.getParameterValue("@P_PARENT_ELEMENT_NAME_OUT", NString.class);
			pCourseAcadrecUdeUriOut.val = cmd.getParameterValue("@P_COURSE_ACADREC_UDE_URI_OUT", NString.class);
			pParentValueOut.val = cmd.getParameterValue("@P_PARENT_VALUE_OUT", NString.class);


		}
		
		public static void pAcadsessCourseUdeElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,NString pAcadSessTermIn,Ref<NString> pParentElementNameOut,Ref<NString> pCourseAcadsessUdeUriOut,Ref<NString> pParentValueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_COURSE_UDE_EXP.P_ACADSESS_COURSE_UDE_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_ACAD_SESS_TERM_IN", pAcadSessTermIn);
			cmd.addParameter("@P_PARENT_ELEMENT_NAME_OUT", NString.class);
			cmd.addParameter("@P_COURSE_ACADSESS_UDE_URI_OUT", NString.class);
			cmd.addParameter("@P_PARENT_VALUE_OUT", NString.class);
				
			cmd.execute();
			pParentElementNameOut.val = cmd.getParameterValue("@P_PARENT_ELEMENT_NAME_OUT", NString.class);
			pCourseAcadsessUdeUriOut.val = cmd.getParameterValue("@P_COURSE_ACADSESS_UDE_URI_OUT", NString.class);
			pParentValueOut.val = cmd.getParameterValue("@P_PARENT_VALUE_OUT", NString.class);


		}
		
	
	
	
}
