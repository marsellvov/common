package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAmrcont {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AMRCONT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidmIn,NString idenCodeIn,NString projCode,NString scntCodeIn,NNumber itemRefnoIn,NDate actDtIn,NString idenCodeAsgnIn,NString contactIn,NDate contactDtIn,NString crTickIn,NString ticklerIn,NDate tickDtIn,NString tickStatIn,NString confidIndIn,NString moveCodeIn,NNumber askAmtIn,NString projCode2In,NString projCode3In,NString projCode4In,NNumber askAmt2In,NNumber askAmt3In,NNumber askAmt4In,NString propCodeIn,NString callReportIn,NString userIdIn,NString genConIndIn,NString stgyPlanIn,NNumber moveSeqIn,NNumber propSeqIn,NDate createDtIn,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AMRCONT.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@IDEN_CODE_IN", idenCodeIn);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@SCNT_CODE_IN", scntCodeIn);
			cmd.addParameter("@ITEM_REFNO_IN", itemRefnoIn);
			cmd.addParameter("@ACT_DT_IN", actDtIn);
			cmd.addParameter("@IDEN_CODE_ASGN_IN", idenCodeAsgnIn);
			cmd.addParameter("@CONTACT_IN", contactIn);
			cmd.addParameter("@CONTACT_DT_IN", contactDtIn);
			cmd.addParameter("@CR_TICK_IN", crTickIn);
			cmd.addParameter("@TICKLER_IN", ticklerIn);
			cmd.addParameter("@TICK_DT_IN", tickDtIn);
			cmd.addParameter("@TICK_STAT_IN", tickStatIn);
			cmd.addParameter("@CONFID_IND_IN", confidIndIn);
			cmd.addParameter("@MOVE_CODE_IN", moveCodeIn);
			cmd.addParameter("@ASK_AMT_IN", askAmtIn);
			cmd.addParameter("@PROJ_CODE2_IN", projCode2In);
			cmd.addParameter("@PROJ_CODE3_IN", projCode3In);
			cmd.addParameter("@PROJ_CODE4_IN", projCode4In);
			cmd.addParameter("@ASK_AMT2_IN", askAmt2In);
			cmd.addParameter("@ASK_AMT3_IN", askAmt3In);
			cmd.addParameter("@ASK_AMT4_IN", askAmt4In);
			cmd.addParameter("@PROP_CODE_IN", propCodeIn);
			cmd.addParameter("@CALL_REPORT_IN", callReportIn);
			cmd.addParameter("@USER_ID_IN", userIdIn);
			cmd.addParameter("@GEN_CON_IND_IN", genConIndIn);
			cmd.addParameter("@STGY_PLAN_IN", stgyPlanIn);
			cmd.addParameter("@MOVE_SEQ_IN", moveSeqIn);
			cmd.addParameter("@PROP_SEQ_IN", propSeqIn);
			cmd.addParameter("@CREATE_DT_IN", createDtIn);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AMRCONT.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
