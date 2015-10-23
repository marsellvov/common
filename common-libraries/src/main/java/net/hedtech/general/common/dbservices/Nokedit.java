package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokedit {
		public static NNumber fConvertSupId(NString parSupId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDIT.F_CONVERT_SUP_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PAR_SUP_ID", parSupId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fFindCellValue(NString fieldName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDIT.F_FIND_CELL_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FIELD_NAME", fieldName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pEditMsgIns(NString source,NNumber transNo,NString aptyType,Ref<NString> msgText,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDIT.P_EDIT_MSG_INS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SOURCE", source);
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@APTY_TYPE", aptyType);
			cmd.addParameter("@MSG_TEXT", msgText, true);
			cmd.addParameter("@MSG_TYPE", msgType, true);
				
			cmd.execute();
			msgText.val = cmd.getParameterValue("@MSG_TEXT", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static void pFieldDefault(NString fieldName,NString cellValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDIT.P_FIELD_DEFAULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIELD_NAME", fieldName);
			cmd.addParameter("@CELL_VALUE", cellValue);
				
			cmd.execute();


		}
		
		public static void pFieldDefault(NString fieldName,NNumber cellValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDIT.P_FIELD_DEFAULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIELD_NAME", fieldName);
			cmd.addParameter("@CELL_VALUE", cellValue);
				
			cmd.execute();


		}
		
		public static void pFieldDefault(NString fieldName,NDate cellValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDIT.P_FIELD_DEFAULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIELD_NAME", fieldName);
			cmd.addParameter("@CELL_VALUE", cellValue);
				
			cmd.execute();


		}
		
		public static void pMassEdit(NNumber parPidm,NNumber parTransNo,NString parQueryDate,NString parAcat,NString exeSource,NDate parApplyDate,Ref<NString> parEditStatus,Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDIT.P_MASS_EDIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_TRANS_NO", parTransNo);
			cmd.addParameter("@PAR_QUERY_DATE", parQueryDate);
			cmd.addParameter("@PAR_ACAT", parAcat);
			cmd.addParameter("@EXE_SOURCE", exeSource);
			cmd.addParameter("@PAR_APPLY_DATE", parApplyDate);
			cmd.addParameter("@PAR_EDIT_STATUS", parEditStatus, true);
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parEditStatus.val = cmd.getParameterValue("@PAR_EDIT_STATUS", NString.class);
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pThruArray(Ref<NNumber> parRowNum,NString fieldName,Ref<NString> parInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDIT.P_THRU_ARRAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ROW_NUM", parRowNum, true);
			cmd.addParameter("@FIELD_NAME", fieldName);
			cmd.addParameter("@PAR_IND", parInd, true);
				
			cmd.execute();
			parRowNum.val = cmd.getParameterValue("@PAR_ROW_NUM", NNumber.class);
			parInd.val = cmd.getParameterValue("@PAR_IND", NString.class);


		}
		
		public static void pXdisplay(NNumber startRowIn,NNumber endRowIn,NNumber startColIn,NNumber endColIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEDIT.P_XDISPLAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@START_ROW_IN", startRowIn);
			cmd.addParameter("@END_ROW_IN", endRowIn);
			cmd.addParameter("@START_COL_IN", startColIn);
			cmd.addParameter("@END_COL_IN", endColIn);
				
			cmd.execute();


		}
		
	
	
	
}
