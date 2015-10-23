package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAmrconf {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AMRCONF.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidmIn,NString idenCodeIn,NString userIdIn,NNumber grpSeqNoIn,NDate activityDateIn,NDate entryDateIn,NString confidIndIn,NString userIn,NString commentIn,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AMRCONF.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@IDEN_CODE_IN", idenCodeIn);
			cmd.addParameter("@USER_ID_IN", userIdIn);
			cmd.addParameter("@GRP_SEQ_NO_IN", grpSeqNoIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@ENTRY_DATE_IN", entryDateIn);
			cmd.addParameter("@CONFID_IND_IN", confidIndIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AMRCONF.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
