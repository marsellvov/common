package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkdsec {
		public static NString fSecurityDcsr(NString userCode,NString docCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKDSEC.F_SECURITY_DCSR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_CODE", userCode);
			cmd.addParameter("@DOC_CODE", docCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSecurityEncb(NString userCode,NString docCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKDSEC.F_SECURITY_ENCB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_CODE", userCode);
			cmd.addParameter("@DOC_CODE", docCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSecurityForDoc(NString userCode,NString docCode,NString docType,NNumber numb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKDSEC.F_SECURITY_FOR_DOC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_CODE", userCode);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@NUMB", numb);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSecurityInv(NString userCode,NString docCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKDSEC.F_SECURITY_INV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_CODE", userCode);
			cmd.addParameter("@DOC_CODE", docCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSecurityJv(NString userCode,NString docCode,NNumber subNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKDSEC.F_SECURITY_JV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_CODE", userCode);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@SUB_NUM", subNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSecurityPo(NString userCode,NString docCode,NNumber chngNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKDSEC.F_SECURITY_PO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_CODE", userCode);
			cmd.addParameter("@DOC_CODE", docCode);
			cmd.addParameter("@CHNG_NUM", chngNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSecurityReq(NString userCode,NString docCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKDSEC.F_SECURITY_REQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_CODE", userCode);
			cmd.addParameter("@DOC_CODE", docCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCodeLookup(NString lookupCode,NString action,NString returnUrl,NString userId,NString doQuery,NString actvmonth,NString actvyear,NString transmonth,NString transyear,NString vendId,NString reqhName,NString buyerCode,NString pohdCode,NString chngNum,NString subNum,NString apprInd,NString compInd,NString statInd,NString docrefCode,NString inProgress,NNumber doclink) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKDSEC.P_CODE_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOOKUP_CODE", lookupCode);
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@RETURN_URL", returnUrl);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@DO_QUERY", doQuery);
			cmd.addParameter("@ACTVMONTH", actvmonth);
			cmd.addParameter("@ACTVYEAR", actvyear);
			cmd.addParameter("@TRANSMONTH", transmonth);
			cmd.addParameter("@TRANSYEAR", transyear);
			cmd.addParameter("@VEND_ID", vendId);
			cmd.addParameter("@REQH_NAME", reqhName);
			cmd.addParameter("@BUYER_CODE", buyerCode);
			cmd.addParameter("@POHD_CODE", pohdCode);
			cmd.addParameter("@CHNG_NUM", chngNum);
			cmd.addParameter("@SUB_NUM", subNum);
			cmd.addParameter("@APPR_IND", apprInd);
			cmd.addParameter("@COMP_IND", compInd);
			cmd.addParameter("@STAT_IND", statInd);
			cmd.addParameter("@DOCREF_CODE", docrefCode);
			cmd.addParameter("@IN_PROGRESS", inProgress);
			cmd.addParameter("@DOCLINK", doclink);
				
			cmd.execute();


		}
		
	
	
	
}
