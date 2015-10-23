package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkvinv {
		public static NString fGetCurrDesc(NString codeIn1,NString codeIn2,NDate invoiceDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVINV.F_GET_CURR_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CODE_IN_1", codeIn1);
			cmd.addParameter("@CODE_IN_2", codeIn2);
			cmd.addParameter("@INVOICE_DATE_IN", invoiceDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDiscDesc(NString discCodeIn,NDate invoiceDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVINV.F_GET_DISC_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DISC_CODE_IN", discCodeIn);
			cmd.addParameter("@INVOICE_DATE_IN", invoiceDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetInvhTotal(NString globalDoc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVINV.F_GET_INVH_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@GLOBAL_DOC", globalDoc);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetItypCode(NNumber itypSeqCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVINV.F_GET_ITYP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ITYP_SEQ_CODE_IN", itypSeqCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDisplayAcctg(NString globalDoc,NString itypCodeIn,NNumber invItemIn,NString acctgType,NString userCode,NNumber countNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVINV.P_DISPLAY_ACCTG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GLOBAL_DOC", globalDoc);
			cmd.addParameter("@ITYP_CODE_IN", itypCodeIn);
			cmd.addParameter("@INV_ITEM_IN", invItemIn);
			cmd.addParameter("@ACCTG_TYPE", acctgType);
			cmd.addParameter("@USER_CODE", userCode);
			cmd.addParameter("@COUNT_NUMBER", countNumber);
				
			cmd.execute();


		}
		
		public static void pViewinv(NString globalDoc,NNumber subNumber,NNumber chgSeqNum,NString displayActg,NString displayText,NString commText,NString usercode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVINV.P_VIEWINV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GLOBAL_DOC", globalDoc);
			cmd.addParameter("@SUB_NUMBER", subNumber);
			cmd.addParameter("@CHG_SEQ_NUM", chgSeqNum);
			cmd.addParameter("@DISPLAY_ACTG", displayActg);
			cmd.addParameter("@DISPLAY_TEXT", displayText);
			cmd.addParameter("@COMM_TEXT", commText);
			cmd.addParameter("@USERCODE", usercode);
				
			cmd.execute();


		}
		
	
	
	
}
