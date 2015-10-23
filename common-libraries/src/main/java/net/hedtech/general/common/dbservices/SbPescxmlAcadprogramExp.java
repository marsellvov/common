package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAcadprogramExp {
		public static DataCursor fSelectAwardPrograms(NNumber pPidmIn,NString pLevlCodeIn,NNumber pDgmrSeqNoIn,NNumber pMajorNbrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_EXP.F_SELECT_AWARD_PROGRAMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_DGMR_SEQ_NO_IN", pDgmrSeqNoIn);
			cmd.addParameter("@P_MAJOR_NBR_IN", pMajorNbrIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectAwardProgramsCc(NNumber pPidmIn,NString pLevlCodeIn,NNumber pDgmrSeqNoIn,NNumber pLcurSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_EXP.F_SELECT_AWARD_PROGRAMS_CC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_DGMR_SEQ_NO_IN", pDgmrSeqNoIn);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fSelectCcPd(NNumber pPidmIn,NNumber pDegreeNoIn,NString pLevelIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_EXP.F_SELECT_CC_PD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_DEGREE_NO_IN", pDegreeNoIn);
			cmd.addParameter("@P_LEVEL_IN", pLevelIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fSelectCcSc(NNumber pPidmIn,NString pLevelIn,NString pTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_EXP.F_SELECT_CC_SC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVEL_IN", pLevelIn);
			cmd.addParameter("@P_TERM_IN", pTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectCcSd(NNumber pPidmIn,NNumber pDegreeNoIn,NString pLevelIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_EXP.F_SELECT_CC_SD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_DEGREE_NO_IN", pDegreeNoIn);
			cmd.addParameter("@P_LEVEL_IN", pLevelIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectStudentPrograms(NNumber pPidmIn,NString pLevlCodeIn,NString pTermCodeIn,NNumber pMajorNbrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_EXP.F_SELECT_STUDENT_PROGRAMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_TERM_CODE_IN", pTermCodeIn);
			cmd.addParameter("@P_MAJOR_NBR_IN", pMajorNbrIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelectStudentProgramsCc(NNumber pPidmIn,NString pLevlCodeIn,NString pTermCodeIn,NNumber pLcurSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_EXP.F_SELECT_STUDENT_PROGRAMS_CC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
			cmd.addParameter("@P_TERM_CODE_IN", pTermCodeIn);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fStvmajrCipcCode(NString pMajrCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_EXP.F_STVMAJR_CIPC_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MAJR_CODE_IN", pMajrCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAcrecAcademicPgmElement(NNumber pRequestPidmIn,NNumber pRequestSeqNoIn,NString pRequestUserIn,NString pRequestTermIn,NString pRequestLevlIn,NString pRequestSbgiCodeIn,NString pRequesttableIn,Ref<NString> pProgramCodeTypeOut,Ref<NString> pProgramCodeValueOut,Ref<NString> pAcademicprogramtypeOut,Ref<NString> pAcademicprogramnameOut,Ref<NString> pAcadPgmNotemessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADPROGRAM_EXP.P_ACREC_ACADEMIC_PGM_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_PIDM_IN", pRequestPidmIn);
			cmd.addParameter("@P_REQUEST_SEQ_NO_IN", pRequestSeqNoIn);
			cmd.addParameter("@P_REQUEST_USER_IN", pRequestUserIn);
			cmd.addParameter("@P_REQUEST_TERM_IN", pRequestTermIn);
			cmd.addParameter("@P_REQUEST_LEVL_IN", pRequestLevlIn);
			cmd.addParameter("@P_REQUEST_SBGI_CODE_IN", pRequestSbgiCodeIn);
			cmd.addParameter("@P_REQUESTTABLE_IN", pRequesttableIn);
			cmd.addParameter("@P_PROGRAM_CODE_TYPE_OUT", NString.class);
			cmd.addParameter("@P_PROGRAM_CODE_VALUE_OUT", NString.class);
			cmd.addParameter("@P_ACADEMICPROGRAMTYPE_OUT", NString.class);
			cmd.addParameter("@P_ACADEMICPROGRAMNAME_OUT", NString.class);
			cmd.addParameter("@P_ACAD_PGM_NOTEMESSAGE_OUT", NString.class);
				
			cmd.execute();
			pProgramCodeTypeOut.val = cmd.getParameterValue("@P_PROGRAM_CODE_TYPE_OUT", NString.class);
			pProgramCodeValueOut.val = cmd.getParameterValue("@P_PROGRAM_CODE_VALUE_OUT", NString.class);
			pAcademicprogramtypeOut.val = cmd.getParameterValue("@P_ACADEMICPROGRAMTYPE_OUT", NString.class);
			pAcademicprogramnameOut.val = cmd.getParameterValue("@P_ACADEMICPROGRAMNAME_OUT", NString.class);
			pAcadPgmNotemessageOut.val = cmd.getParameterValue("@P_ACAD_PGM_NOTEMESSAGE_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="AcademicProgramRow", dataSourceName="ACADEMIC_PROGRAM")
	public static class AcademicProgramRow
	{
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="PROGRAM_CODE")
		public NString ProgramCode;
		@DbRecordField(dataSourceName="PROGRAM_TYPE")
		public NString ProgramType;
		@DbRecordField(dataSourceName="PROGRAM_NAME")
		public NString ProgramName;
		@DbRecordField(dataSourceName="PROGRAM_CIPC_CODE")
		public NString ProgramCipcCode;
		@DbRecordField(dataSourceName="PROGRAM_NOTE_MESSAGE")
		public NString ProgramNoteMessage;
		@DbRecordField(dataSourceName="PRIORITY")
		public NNumber Priority;
	}

	
	@DbRecordType(id="AcademicProgramCcRow", dataSourceName="ACADEMIC_PROGRAM_CC")
	public static class AcademicProgramCcRow
	{
		@DbRecordField(dataSourceName="PIDM")
		public NNumber Pidm;
		@DbRecordField(dataSourceName="PROGRAM_CODE")
		public NString ProgramCode;
		@DbRecordField(dataSourceName="PROGRAM_TYPE")
		public NString ProgramType;
		@DbRecordField(dataSourceName="PROGRAM_NAME")
		public NString ProgramName;
		@DbRecordField(dataSourceName="PROGRAM_CIPC_CODE")
		public NString ProgramCipcCode;
		@DbRecordField(dataSourceName="PROGRAM_NOTE_MESSAGE")
		public NString ProgramNoteMessage;
		@DbRecordField(dataSourceName="PROGRAM_PRIORITY")
		public NNumber ProgramPriority;
		@DbRecordField(dataSourceName="PRIORITY")
		public NNumber Priority;
	}

	
	@DbRecordType(id="AcademicSovlcurSeqnoRow", dataSourceName="ACADEMIC_SOVLCUR_SEQNO")
	public static class AcademicSovlcurSeqnoRow
	{
		@DbRecordField(dataSourceName="P_SOVLCUR_KEY_SEQNO")
		public NNumber PSovlcurKeySeqno;
		@DbRecordField(dataSourceName="P_SOVLCUR_SEQNO")
		public NNumber PSovlcurSeqno;
		@DbRecordField(dataSourceName="P_SOVLCUR_LEVL")
		public NString PSovlcurLevl;
	}

	
	
}
