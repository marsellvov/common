package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAcadawardExp {
		public static DataCursor fSelectDegrees(NNumber pPidmIn,NString pLevlCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADAWARD_EXP.F_SELECT_DEGREES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectDgrqNote(NNumber pPidmIn,NString pQpnmSeqNoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADAWARD_EXP.F_SELECT_DGRQ_NOTE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_QPNM_SEQ_NO_IN", pQpnmSeqNoIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pAcrecAcawardElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,NNumber pDgmrSeqNoIn,Ref<NString> pAcademicawardlevelOut,Ref<NString> pAcademicawarddateOut,Ref<NString> pAcademicawardtitleOut,Ref<DataCursor> pAcademichonorsRefCsrOut,Ref<NString> pAcademiccompletionindOut,Ref<NString> pAcademiccompletiondateOut,Ref<DataCursor> pAcademicDgrqRefCsrOut,Ref<NString> pAwrdNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADAWARD_EXP.P_ACREC_ACAWARD_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_DGMR_SEQ_NO_IN", pDgmrSeqNoIn);
			cmd.addParameter("@P_ACADEMICAWARDLEVEL_OUT", NString.class);
			cmd.addParameter("@P_ACADEMICAWARDDATE_OUT", NString.class);
			cmd.addParameter("@P_ACADEMICAWARDTITLE_OUT", NString.class);
			cmd.addParameter("@P_ACADEMICHONORS_REF_CSR_OUT", DataCursor.class);
			cmd.addParameter("@P_ACADEMICCOMPLETIONIND_OUT", NString.class);
			cmd.addParameter("@P_ACADEMICCOMPLETIONDATE_OUT", NString.class);
			cmd.addParameter("@P_ACADEMIC_DGRQ_REF_CSR_OUT", DataCursor.class);
			cmd.addParameter("@P_AWRD_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pAcademicawardlevelOut.val = cmd.getParameterValue("@P_ACADEMICAWARDLEVEL_OUT", NString.class);
			pAcademicawarddateOut.val = cmd.getParameterValue("@P_ACADEMICAWARDDATE_OUT", NString.class);
			pAcademicawardtitleOut.val = cmd.getParameterValue("@P_ACADEMICAWARDTITLE_OUT", NString.class);
			pAcademichonorsRefCsrOut.val = cmd.getParameterValue("@P_ACADEMICHONORS_REF_CSR_OUT", DataCursor.class);
			pAcademiccompletionindOut.val = cmd.getParameterValue("@P_ACADEMICCOMPLETIONIND_OUT", NString.class);
			pAcademiccompletiondateOut.val = cmd.getParameterValue("@P_ACADEMICCOMPLETIONDATE_OUT", NString.class);
			pAcademicDgrqRefCsrOut.val = cmd.getParameterValue("@P_ACADEMIC_DGRQ_REF_CSR_OUT", DataCursor.class);
			pAwrdNotemessageOut.val = cmd.getParameterValue("@P_AWRD_NOTEMESSAGE_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="AcademicDgrqRow", dataSourceName="ACADEMIC_DGRQ")
	public static class AcademicDgrqRow
	{
		@DbRecordField(dataSourceName="ACADEMIC_DGRQ_TITLE")
		public NString AcademicDgrqTitle;
		@DbRecordField(dataSourceName="ACADEMIC_DGRQ_ADVISOR_NAME")
		public NString AcademicDgrqAdvisorName;
		@DbRecordField(dataSourceName="ACADEMIC_DGRQ_QPNM_SEQ_NO")
		public NString AcademicDgrqQpnmSeqNo;
	}

	
	@DbRecordType(id="AcademicDgrqNoteRow", dataSourceName="ACADEMIC_DGRQ_NOTE")
	public static class AcademicDgrqNoteRow
	{
		@DbRecordField(dataSourceName="DGRQ_NOTE")
		public NString DgrqNote;
	}

	
	@DbRecordType(id="DegreeRow", dataSourceName="DEGREE")
	public static class DegreeRow
	{
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="LEVL_CODE")
		public NString LevlCode;
		@DbRecordField(dataSourceName="DGMR_SEQ_NO")
		public NNumber DgmrSeqNo;
		@DbRecordField(dataSourceName="MAJR_CODE_1_1")
		public NString MajrCode11;
		@DbRecordField(dataSourceName="MAJR_CODE_1_2")
		public NString MajrCode12;
		@DbRecordField(dataSourceName="MAJR_CODE_2_1")
		public NString MajrCode21;
		@DbRecordField(dataSourceName="MAJR_CODE_2_2")
		public NString MajrCode22;
	}

	
	
}
