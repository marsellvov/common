package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAgrpgbe {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRPGBE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidmIn,NString userIdIn,NString dataOrigIn,NDate actDateIn,NNumber pgbePidmIn,NString xrefCodeIn,NString pledNoIn,NString giftNoIn,NString surnameIn,NString lastnameIn,NString firstnameIn,NString minameIn,NString sexIn,NDate birthDtIn,NString decIndIn,NDate decDtIn,NString pgbeCommentIn,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRPGBE.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USER_ID_IN", userIdIn);
			cmd.addParameter("@DATA_ORIG_IN", dataOrigIn);
			cmd.addParameter("@ACT_DATE_IN", actDateIn);
			cmd.addParameter("@PGBE_PIDM_IN", pgbePidmIn);
			cmd.addParameter("@XREF_CODE_IN", xrefCodeIn);
			cmd.addParameter("@PLED_NO_IN", pledNoIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@SURNAME_IN", surnameIn);
			cmd.addParameter("@LASTNAME_IN", lastnameIn);
			cmd.addParameter("@FIRSTNAME_IN", firstnameIn);
			cmd.addParameter("@MINAME_IN", minameIn);
			cmd.addParameter("@SEX_IN", sexIn);
			cmd.addParameter("@BIRTH_DT_IN", birthDtIn);
			cmd.addParameter("@DEC_IND_IN", decIndIn);
			cmd.addParameter("@DEC_DT_IN", decDtIn);
			cmd.addParameter("@PGBE_COMMENT_IN", pgbeCommentIn);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRPGBE.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
