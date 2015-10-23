package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Axkexmg {
		public static NNumber fEmprMatch(NNumber pidm,NNumber gpAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AXKEXMG.F_EMPR_MATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GP_AMOUNT", gpAmount);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fExpMgInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AXKEXMG.F_EXP_MG_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMgFormRecInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AXKEXMG.F_MG_FORM_REC_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMgOnlineInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AXKEXMG.F_MG_ONLINE_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAxrmgrnUpdate(NNumber pidm,NNumber emprPidm,NString gpInd,NString gpNo,NString reasonText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AXKEXMG.P_AXRMGRN_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@EMPR_PIDM", emprPidm);
			cmd.addParameter("@GP_IND", gpInd);
			cmd.addParameter("@GP_NO", gpNo);
			cmd.addParameter("@REASON_TEXT", reasonText);
				
			cmd.execute();


		}
		
		public static void pEvaluateMgEligibility(NNumber pidm,NString gpNumber,NString giftPledge,Ref<NString> compStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AXKEXMG.P_EVALUATE_MG_ELIGIBILITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GP_NUMBER", gpNumber);
			cmd.addParameter("@GIFT_PLEDGE", giftPledge);
			cmd.addParameter("@COMP_STATUS", NString.class);
				
			cmd.execute();
			compStatus.val = cmd.getParameterValue("@COMP_STATUS", NString.class);


		}
		
	
	
	
}
