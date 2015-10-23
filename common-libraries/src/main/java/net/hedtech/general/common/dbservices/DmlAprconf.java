package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAprconf {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APRCONF.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidmIn,NString idenCodeIn,NString userIdIn,NNumber grpSeqNoIn,NDate activityDateIn,NDate entryDateIn,NString confidIndIn,NString userIn,NString commentIn,NString okForNoteIn,NString dispNotesIndIn,NDate dispNotesDateIn,NString reviewedIndIn,NString reviewedUserIn,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APRCONF.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@IDEN_CODE_IN", idenCodeIn);
			cmd.addParameter("@USER_ID_IN", userIdIn);
			cmd.addParameter("@GRP_SEQ_NO_IN", grpSeqNoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@ENTRY_DATE_IN", entryDateIn);
			cmd.addParameter("@CONFID_IND_IN", confidIndIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@OK_FOR_NOTE_IN", okForNoteIn);
			cmd.addParameter("@DISP_NOTES_IND_IN", dispNotesIndIn);
			cmd.addParameter("@DISP_NOTES_DATE_IN", dispNotesDateIn);
			cmd.addParameter("@REVIEWED_IND_IN", reviewedIndIn);
			cmd.addParameter("@REVIEWED_USER_IN", reviewedUserIn);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_APRCONF.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
