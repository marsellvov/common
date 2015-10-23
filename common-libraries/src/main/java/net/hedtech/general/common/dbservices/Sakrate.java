package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakrate {
		public static NBool fGetFactorValue(NNumber applPidmIn,NString ruleTableNameIn,NString ruleSelectColumnIn,NString ruleWhereColumnIn,NString ruleValueIn,NString tsrcCodeIn,Ref<NNumber> factorValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKRATE.F_GET_FACTOR_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@APPL_PIDM_IN", applPidmIn);
			cmd.addParameter("@RULE_TABLE_NAME_IN", ruleTableNameIn);
			cmd.addParameter("@RULE_SELECT_COLUMN_IN", ruleSelectColumnIn);
			cmd.addParameter("@RULE_WHERE_COLUMN_IN", ruleWhereColumnIn);
			cmd.addParameter("@RULE_VALUE_IN", ruleValueIn);
			cmd.addParameter("@TSRC_CODE_IN", tsrcCodeIn);
			cmd.addParameter("@FACTOR_VALUE", factorValue, true);
				
			cmd.execute();
			factorValue.val = cmd.getParameterValue("@FACTOR_VALUE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fMathCalc(NString statementTxtIn,NInteger precisionNumIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKRATE.F_MATH_CALC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@STATEMENT_TXT_IN", statementTxtIn);
			cmd.addParameter("@PRECISION_NUM_IN", precisionNumIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pInsertSarrrat(NNumber applPidmIn,NString applTermIn,NNumber applNoIn,NString ratpCodeIn,NNumber arolPidmIn,NString radmCodeIn,NDate actDateIn,NString userIn,NNumber ratingIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKRATE.P_INSERT_SARRRAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPL_PIDM_IN", applPidmIn);
			cmd.addParameter("@APPL_TERM_IN", applTermIn);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@RATP_CODE_IN", ratpCodeIn);
			cmd.addParameter("@AROL_PIDM_IN", arolPidmIn);
			cmd.addParameter("@RADM_CODE_IN", radmCodeIn);
			cmd.addParameter("@ACT_DATE_IN", actDateIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@RATING_IN", ratingIn);
				
			cmd.execute();


		}
		
	
	
	
}
