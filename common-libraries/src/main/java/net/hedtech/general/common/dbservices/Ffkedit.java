package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ffkedit {
		public static DataCursor fFgbencdRow(NString pEncbNum,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKEDIT.F_FGBENCD_ROW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ENCB_NUM", pEncbNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pEErr(Ref<FbCommon.FinanceRectypeRow> pRecInOut,Ref<List<FbCommon.ErrTabtypeRow>> pErrTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKEDIT.P_E_ERR", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("P_REC_IN_OUT", pRecInOut.val, FbCommon.FinanceRectypeRow.class, true));
//			// cmd.addParameter(DbTypes.getTableType("P_ERR_TAB", "", pErrTab.val, object.class , true));
//				
//			cmd.execute();
//			pRecInOut.val = cmd.getParameterValue("@P_REC_IN_OUT", FbCommon.FinanceRectypeRow.class);
//			// pErrTab.val = cmd.getTableParameterValue("@P_ERR_TAB", object.class);
//
//
//		}
		
	
	
	
}
