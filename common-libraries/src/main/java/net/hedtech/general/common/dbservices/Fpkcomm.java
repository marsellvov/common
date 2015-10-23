package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpkcomm {
		public static void pEditCommCode(NString commCode,NString currDate,Ref<NString> valid,Ref<NString> code,Ref<NDate> effDate,Ref<NDate> activityDate,Ref<NString> userId,Ref<NString> commDesc,Ref<NString> uomsCode,Ref<NDate> termDate,Ref<NString> commCodePred,Ref<NString> amstInd,Ref<NString> tgrpCode,Ref<NString> taxOverrideInd,Ref<NString> stockInd,Ref<NNumber> onorderQty,Ref<NNumber> reservedQty,Ref<NNumber> notInvoicedQty,Ref<NNumber> totalValueAmt,Ref<NNumber> estLifeYears) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKCOMM.P_EDIT_COMM_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMM_CODE", commCode);
			cmd.addParameter("@CURR_DATE", currDate);
			cmd.addParameter("@VALID", valid, true);
			cmd.addParameter("@CODE", code, true);
			cmd.addParameter("@EFF_DATE", effDate, true);
			cmd.addParameter("@ACTIVITY_DATE", activityDate, true);
			cmd.addParameter("@USER_ID", userId, true);
			cmd.addParameter("@COMM_DESC", commDesc, true);
			cmd.addParameter("@UOMS_CODE", uomsCode, true);
			cmd.addParameter("@TERM_DATE", termDate, true);
			cmd.addParameter("@COMM_CODE_PRED", commCodePred, true);
			cmd.addParameter("@AMST_IND", amstInd, true);
			cmd.addParameter("@TGRP_CODE", tgrpCode, true);
			cmd.addParameter("@TAX_OVERRIDE_IND", taxOverrideInd, true);
			cmd.addParameter("@STOCK_IND", stockInd, true);
			cmd.addParameter("@ONORDER_QTY", onorderQty, true);
			cmd.addParameter("@RESERVED_QTY", reservedQty, true);
			cmd.addParameter("@NOT_INVOICED_QTY", notInvoicedQty, true);
			cmd.addParameter("@TOTAL_VALUE_AMT", totalValueAmt, true);
			cmd.addParameter("@EST_LIFE_YEARS", estLifeYears, true);
				
			cmd.execute();
			valid.val = cmd.getParameterValue("@VALID", NString.class);
			code.val = cmd.getParameterValue("@CODE", NString.class);
			effDate.val = cmd.getParameterValue("@EFF_DATE", NDate.class);
			activityDate.val = cmd.getParameterValue("@ACTIVITY_DATE", NDate.class);
			userId.val = cmd.getParameterValue("@USER_ID", NString.class);
			commDesc.val = cmd.getParameterValue("@COMM_DESC", NString.class);
			uomsCode.val = cmd.getParameterValue("@UOMS_CODE", NString.class);
			termDate.val = cmd.getParameterValue("@TERM_DATE", NDate.class);
			commCodePred.val = cmd.getParameterValue("@COMM_CODE_PRED", NString.class);
			amstInd.val = cmd.getParameterValue("@AMST_IND", NString.class);
			tgrpCode.val = cmd.getParameterValue("@TGRP_CODE", NString.class);
			taxOverrideInd.val = cmd.getParameterValue("@TAX_OVERRIDE_IND", NString.class);
			stockInd.val = cmd.getParameterValue("@STOCK_IND", NString.class);
			onorderQty.val = cmd.getParameterValue("@ONORDER_QTY", NNumber.class);
			reservedQty.val = cmd.getParameterValue("@RESERVED_QTY", NNumber.class);
			notInvoicedQty.val = cmd.getParameterValue("@NOT_INVOICED_QTY", NNumber.class);
			totalValueAmt.val = cmd.getParameterValue("@TOTAL_VALUE_AMT", NNumber.class);
			estLifeYears.val = cmd.getParameterValue("@EST_LIFE_YEARS", NNumber.class);


		}
		
	
	
	
}
