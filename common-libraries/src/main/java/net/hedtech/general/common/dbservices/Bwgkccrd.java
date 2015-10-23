package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkccrd {
		public static void pAcknowledgementPage(NString descriptionIn,NString amountIn,NString authNumIn,NString tableTagIn,NDate insertDateIn,NNumber pidmIn,NString acctNameIn,NString acctNameTagIn,NString acctIdIn,NString acctIdTagIn,NString widthIn,NString entityIndIn,NString acctIdCodeIn,NString acctIdGroupIn,NString tranNumIn,NString tranTagIn,NString tranCodeIn,NString tranGroupIn,NString displayTimeIn,NString dateTimeLabelIn,NString opt1ValueIn,NString opt1TagIn,NString gtvsdax1CodeIn,NString gtvsdax1GroupIn,NString opt2ValueIn,NString opt2TagIn,NString gtvsdax2CodeIn,NString gtvsdax2GroupIn,NString opt3ValueIn,NString opt3TagIn,NString gtvsdax3CodeIn,NString gtvsdax3GroupIn,NString opt4ValueIn,NString opt4TagIn,NString gtvsdax4CodeIn,NString gtvsdax4GroupIn,NString opt5ValueIn,NString opt5TagIn,NString gtvsdax5CodeIn,NString gtvsdax5GroupIn,NString opt6ValueIn,NString opt6TagIn,NString gtvsdax6CodeIn,NString gtvsdax6GroupIn,NString opt7ValueIn,NString opt7TagIn,NString gtvsdax7CodeIn,NString gtvsdax7GroupIn,NString opt8ValueIn,NString opt8TagIn,NString gtvsdax8CodeIn,NString gtvsdax8GroupIn,NString opt9ValueIn,NString opt9TagIn,NString gtvsdax9CodeIn,NString gtvsdax9GroupIn,NString opt10ValueIn,NString opt10TagIn,NString gtvsdax10CodeIn,NString gtvsdax10GroupIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKCCRD.P_ACKNOWLEDGEMENT_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@AUTH_NUM_IN", authNumIn);
			cmd.addParameter("@TABLE_TAG_IN", tableTagIn);
			cmd.addParameter("@INSERT_DATE_IN", insertDateIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ACCT_NAME_IN", acctNameIn);
			cmd.addParameter("@ACCT_NAME_TAG_IN", acctNameTagIn);
			cmd.addParameter("@ACCT_ID_IN", acctIdIn);
			cmd.addParameter("@ACCT_ID_TAG_IN", acctIdTagIn);
			cmd.addParameter("@WIDTH_IN", widthIn);
			cmd.addParameter("@ENTITY_IND_IN", entityIndIn);
			cmd.addParameter("@ACCT_ID_CODE_IN", acctIdCodeIn);
			cmd.addParameter("@ACCT_ID_GROUP_IN", acctIdGroupIn);
			cmd.addParameter("@TRAN_NUM_IN", tranNumIn);
			cmd.addParameter("@TRAN_TAG_IN", tranTagIn);
			cmd.addParameter("@TRAN_CODE_IN", tranCodeIn);
			cmd.addParameter("@TRAN_GROUP_IN", tranGroupIn);
			cmd.addParameter("@DISPLAY_TIME_IN", displayTimeIn);
			cmd.addParameter("@DATE_TIME_LABEL_IN", dateTimeLabelIn);
			cmd.addParameter("@OPT_1_VALUE_IN", opt1ValueIn);
			cmd.addParameter("@OPT_1_TAG_IN", opt1TagIn);
			cmd.addParameter("@GTVSDAX_1_CODE_IN", gtvsdax1CodeIn);
			cmd.addParameter("@GTVSDAX_1_GROUP_IN", gtvsdax1GroupIn);
			cmd.addParameter("@OPT_2_VALUE_IN", opt2ValueIn);
			cmd.addParameter("@OPT_2_TAG_IN", opt2TagIn);
			cmd.addParameter("@GTVSDAX_2_CODE_IN", gtvsdax2CodeIn);
			cmd.addParameter("@GTVSDAX_2_GROUP_IN", gtvsdax2GroupIn);
			cmd.addParameter("@OPT_3_VALUE_IN", opt3ValueIn);
			cmd.addParameter("@OPT_3_TAG_IN", opt3TagIn);
			cmd.addParameter("@GTVSDAX_3_CODE_IN", gtvsdax3CodeIn);
			cmd.addParameter("@GTVSDAX_3_GROUP_IN", gtvsdax3GroupIn);
			cmd.addParameter("@OPT_4_VALUE_IN", opt4ValueIn);
			cmd.addParameter("@OPT_4_TAG_IN", opt4TagIn);
			cmd.addParameter("@GTVSDAX_4_CODE_IN", gtvsdax4CodeIn);
			cmd.addParameter("@GTVSDAX_4_GROUP_IN", gtvsdax4GroupIn);
			cmd.addParameter("@OPT_5_VALUE_IN", opt5ValueIn);
			cmd.addParameter("@OPT_5_TAG_IN", opt5TagIn);
			cmd.addParameter("@GTVSDAX_5_CODE_IN", gtvsdax5CodeIn);
			cmd.addParameter("@GTVSDAX_5_GROUP_IN", gtvsdax5GroupIn);
			cmd.addParameter("@OPT_6_VALUE_IN", opt6ValueIn);
			cmd.addParameter("@OPT_6_TAG_IN", opt6TagIn);
			cmd.addParameter("@GTVSDAX_6_CODE_IN", gtvsdax6CodeIn);
			cmd.addParameter("@GTVSDAX_6_GROUP_IN", gtvsdax6GroupIn);
			cmd.addParameter("@OPT_7_VALUE_IN", opt7ValueIn);
			cmd.addParameter("@OPT_7_TAG_IN", opt7TagIn);
			cmd.addParameter("@GTVSDAX_7_CODE_IN", gtvsdax7CodeIn);
			cmd.addParameter("@GTVSDAX_7_GROUP_IN", gtvsdax7GroupIn);
			cmd.addParameter("@OPT_8_VALUE_IN", opt8ValueIn);
			cmd.addParameter("@OPT_8_TAG_IN", opt8TagIn);
			cmd.addParameter("@GTVSDAX_8_CODE_IN", gtvsdax8CodeIn);
			cmd.addParameter("@GTVSDAX_8_GROUP_IN", gtvsdax8GroupIn);
			cmd.addParameter("@OPT_9_VALUE_IN", opt9ValueIn);
			cmd.addParameter("@OPT_9_TAG_IN", opt9TagIn);
			cmd.addParameter("@GTVSDAX_9_CODE_IN", gtvsdax9CodeIn);
			cmd.addParameter("@GTVSDAX_9_GROUP_IN", gtvsdax9GroupIn);
			cmd.addParameter("@OPT_10_VALUE_IN", opt10ValueIn);
			cmd.addParameter("@OPT_10_TAG_IN", opt10TagIn);
			cmd.addParameter("@GTVSDAX_10_CODE_IN", gtvsdax10CodeIn);
			cmd.addParameter("@GTVSDAX_10_GROUP_IN", gtvsdax10GroupIn);
				
			cmd.execute();


		}
		
	
	
	
}
