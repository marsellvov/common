package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAgrpaux {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRPAUX.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidmIn,NString pledgeNoIn,NString auxlCodeIn,NString auxlDescIn,NNumber auxlAmountIn,NDate activityDateIn,NString userIn,NDate issueDateIn,NString pldgAdjVoidIndIn,NString donrCodeIn,NString prefClasIn,NString commentIn,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRPAUX.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@AUXL_CODE_IN", auxlCodeIn);
			cmd.addParameter("@AUXL_DESC_IN", auxlDescIn);
			cmd.addParameter("@AUXL_AMOUNT_IN", auxlAmountIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@ISSUE_DATE_IN", issueDateIn);
			cmd.addParameter("@PLDG_ADJ_VOID_IND_IN", pldgAdjVoidIndIn);
			cmd.addParameter("@DONR_CODE_IN", donrCodeIn);
			cmd.addParameter("@PREF_CLAS_IN", prefClasIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRPAUX.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
