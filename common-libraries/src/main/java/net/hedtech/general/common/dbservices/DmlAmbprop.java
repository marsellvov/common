package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAmbprop {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AMBPROP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidmIn,NString propCodeIn,NString userIn,NDate actDateIn,NString prstCodeIn,NDate prstDateIn,NString propCommentIn,NNumber stafPidmIn,NString stafIdenCodeIn,NDate dueDateIn,NString finCodeIn,NNumber askAmtIn,NNumber propSeqIn,NDate createDtIn,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AMBPROP.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PROP_CODE_IN", propCodeIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@ACT_DATE_IN", actDateIn);
			cmd.addParameter("@PRST_CODE_IN", prstCodeIn);
			cmd.addParameter("@PRST_DATE_IN", prstDateIn);
			cmd.addParameter("@PROP_COMMENT_IN", propCommentIn);
			cmd.addParameter("@STAF_PIDM_IN", stafPidmIn);
			cmd.addParameter("@STAF_IDEN_CODE_IN", stafIdenCodeIn);
			cmd.addParameter("@DUE_DATE_IN", dueDateIn);
			cmd.addParameter("@FIN_CODE_IN", finCodeIn);
			cmd.addParameter("@ASK_AMT_IN", askAmtIn);
			cmd.addParameter("@PROP_SEQ_IN", propSeqIn);
			cmd.addParameter("@CREATE_DT_IN", createDtIn);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AMBPROP.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
