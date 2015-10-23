package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAprcrvw {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APRCRVW.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidmIn,NString dsrcCodeIn,NDate loadDateIn,NString accptIndIn,NDate activityDateIn,NString userIn,NNumber seqNoIn,NDate srcDateIn,NString lastNameIn,NString firstNameIn,NString miIn,NString sexIn,NDate birthDtIn,NString ssnIn,NString atypCodeIn,NString xrefCodeIn,NNumber chldPidmIn,NString dispWebIndIn,NString deasIndIn,NDate deasDtIndIn,NString notesIndIn,NNumber othrPidmIn,NString othrXrefCodeIn,NString commentIn,NString surnamePrefIn,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APRCRVW.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DSRC_CODE_IN", dsrcCodeIn);
			cmd.addParameter("@LOAD_DATE_IN", loadDateIn);
			cmd.addParameter("@ACCPT_IND_IN", accptIndIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@SEQ_NO_IN", seqNoIn);
			cmd.addParameter("@SRC_DATE_IN", srcDateIn);
			cmd.addParameter("@LAST_NAME_IN", lastNameIn);
			cmd.addParameter("@FIRST_NAME_IN", firstNameIn);
			cmd.addParameter("@MI_IN", miIn);
			cmd.addParameter("@SEX_IN", sexIn);
			cmd.addParameter("@BIRTH_DT_IN", birthDtIn);
			cmd.addParameter("@SSN_IN", ssnIn);
			cmd.addParameter("@ATYP_CODE_IN", atypCodeIn);
			cmd.addParameter("@XREF_CODE_IN", xrefCodeIn);
			cmd.addParameter("@CHLD_PIDM_IN", chldPidmIn);
			cmd.addParameter("@DISP_WEB_IND_IN", dispWebIndIn);
			cmd.addParameter("@DEAS_IND_IN", deasIndIn);
			cmd.addParameter("@DEAS_DT_IND_IN", deasDtIndIn);
			cmd.addParameter("@NOTES_IND_IN", notesIndIn);
			cmd.addParameter("@OTHR_PIDM_IN", othrPidmIn);
			cmd.addParameter("@OTHR_XREF_CODE_IN", othrXrefCodeIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@SURNAME_PREF_IN", surnamePrefIn);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APRCRVW.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
