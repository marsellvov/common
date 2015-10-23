package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAgradtl {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRADTL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidmIn,NString userIdIn,NString dataOrigIn,NDate actDateIn,NString adtlCodeIn,NString adtlDetIn,NString pledNoIn,NString giftNoIn,NNumber adtlAmtIn,NString adtlCommentIn,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRADTL.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@USER_ID_IN", userIdIn);
			cmd.addParameter("@DATA_ORIG_IN", dataOrigIn);
			cmd.addParameter("@ACT_DATE_IN", actDateIn);
			cmd.addParameter("@ADTL_CODE_IN", adtlCodeIn);
			cmd.addParameter("@ADTL_DET_IN", adtlDetIn);
			cmd.addParameter("@PLED_NO_IN", pledNoIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@ADTL_AMT_IN", adtlAmtIn);
			cmd.addParameter("@ADTL_COMMENT_IN", adtlCommentIn);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRADTL.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
