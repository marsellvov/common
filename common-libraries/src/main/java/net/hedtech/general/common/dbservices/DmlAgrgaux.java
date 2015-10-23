package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAgrgaux {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRGAUX.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidmIn,NString giftNoIn,NString auxlCodeIn,NString auxlDescIn,NNumber dcprCostIn,NDate activityDateIn,NString dcprCodeIn,NDate issueDateIn,NNumber dcprValueIn,NString descIn,NString accRejIndIn,NDate accRejDateIn,NString giftAdjVoidIndIn,NString donrCodeIn,NString prefClasIn,NString userIn,NString deductForTaxesIn,NString commentIn,NDate auxlValueDateIn,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRGAUX.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@AUXL_CODE_IN", auxlCodeIn);
			cmd.addParameter("@AUXL_DESC_IN", auxlDescIn);
			cmd.addParameter("@DCPR_COST_IN", dcprCostIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
			cmd.addParameter("@DCPR_CODE_IN", dcprCodeIn);
			cmd.addParameter("@ISSUE_DATE_IN", issueDateIn);
			cmd.addParameter("@DCPR_VALUE_IN", dcprValueIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@ACC_REJ_IND_IN", accRejIndIn);
			cmd.addParameter("@ACC_REJ_DATE_IN", accRejDateIn);
			cmd.addParameter("@GIFT_ADJ_VOID_IND_IN", giftAdjVoidIndIn);
			cmd.addParameter("@DONR_CODE_IN", donrCodeIn);
			cmd.addParameter("@PREF_CLAS_IN", prefClasIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@DEDUCT_FOR_TAXES_IN", deductForTaxesIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@AUXL_VALUE_DATE_IN", auxlValueDateIn);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AGRGAUX.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
