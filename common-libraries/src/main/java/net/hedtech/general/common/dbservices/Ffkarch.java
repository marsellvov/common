package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ffkarch {
		public static NBool fPostQueryFgbencd(NString encumbranceNumber,NNumber _item,NNumber seqNum,Ref<NNumber> origEncbAmt,Ref<NNumber> totLiquidations,Ref<NString> fsyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKARCH.F_POST_QUERY_FGBENCD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ENCUMBRANCE_NUMBER", encumbranceNumber);
			cmd.addParameter("@ITEM", _item);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@ORIG_ENCB_AMT", origEncbAmt, true);
			cmd.addParameter("@TOT_LIQUIDATIONS", totLiquidations, true);
			cmd.addParameter("@FSYR_CODE", fsyrCode, true);
				
			cmd.execute();
			origEncbAmt.val = cmd.getParameterValue("@ORIG_ENCB_AMT", NNumber.class);
			totLiquidations.val = cmd.getParameterValue("@TOT_LIQUIDATIONS", NNumber.class);
			fsyrCode.val = cmd.getParameterValue("@FSYR_CODE", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fPostQueryFgbench(NString encumbranceNumber,Ref<NNumber> remainingBalance) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKARCH.F_POST_QUERY_FGBENCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ENCUMBRANCE_NUMBER", encumbranceNumber);
			cmd.addParameter("@REMAINING_BALANCE", remainingBalance, true);
				
			cmd.execute();
			remainingBalance.val = cmd.getParameterValue("@REMAINING_BALANCE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
