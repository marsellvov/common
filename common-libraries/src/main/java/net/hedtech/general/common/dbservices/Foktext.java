package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Foktext {
		public static NString fExists(NNumber docType,NString docCode,NNumber chgSeq,NNumber itemNum,NNumber pidm,NNumber seqNum,NString claNum,NString prtInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKTEXT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@CHG_SEQ", chgSeq);
			cmd.addParameter("@ITEM_NUM", itemNum);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@CLA_NUM", claNum);
			cmd.addParameter("@PRT_IND", prtInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetLastSeq(NNumber docType,NString docCode,NNumber chgSeq,NNumber itemNum,NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKTEXT.F_GET_LAST_SEQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@CHG_SEQ", chgSeq);
			cmd.addParameter("@ITEM_NUM", itemNum);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCreate(NNumber docType,NString docCode,NNumber seqNum,NString inText,NNumber chgSeq,NNumber itemNum,NNumber pidm,NString userId,NString claNum,NString prtInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKTEXT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@IN_TEXT", inText);
			cmd.addParameter("@CHG_SEQ", chgSeq);
			cmd.addParameter("@ITEM_NUM", itemNum);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@CLA_NUM", claNum);
			cmd.addParameter("@PRT_IND", prtInd);
				
			cmd.execute();


		}
		
		public static void pCreate(NNumber docType,NString docCode,NString textstring,NString appendOrReplace,NNumber chgSeq,NNumber itemNum,NNumber pidm,NString userId,NString claNum,NString printable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKTEXT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@TEXTSTRING", textstring);
			cmd.addParameter("@APPEND_OR_REPLACE", appendOrReplace);
			cmd.addParameter("@CHG_SEQ", chgSeq);
			cmd.addParameter("@ITEM_NUM", itemNum);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@CLA_NUM", claNum);
			cmd.addParameter("@PRINTABLE", printable);
				
			cmd.execute();


		}
		
		public static void pDelete(NNumber docType,NString docCode,NNumber chgSeq,NNumber itemNum,NNumber pidm,NNumber seqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKTEXT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@CHG_SEQ", chgSeq);
			cmd.addParameter("@ITEM_NUM", itemNum);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NUM", seqNum);
				
			cmd.execute();


		}
		
	
	
	
}
