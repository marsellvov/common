package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAdrconf {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_ADRCONF.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NString desgIn,NString userIdIn,NDate actDateIn,NString idenCodeIn,NNumber grpSeqIn,NDate entDateIn,NString confidIn,NString userIn,NString confCommentIn,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_ADRCONF.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@USER_ID_IN", userIdIn);
			cmd.addParameter("@ACT_DATE_IN", actDateIn);
			cmd.addParameter("@IDEN_CODE_IN", idenCodeIn);
			cmd.addParameter("@GRP_SEQ_IN", grpSeqIn);
			cmd.addParameter("@ENT_DATE_IN", entDateIn);
			cmd.addParameter("@CONFID_IN", confidIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@CONF_COMMENT_IN", confCommentIn);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_ADRCONF.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
