package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpksusp {
		public static NBool fCheckPoAcctgPct(NString pohdCode,NNumber seqNum,NNumber _item) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSUSP.F_CHECK_PO_ACCTG_PCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@POHD_CODE", pohdCode);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@ITEM", _item);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckReqAcctgPct(NString reqhCode,NNumber _item) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSUSP.F_CHECK_REQ_ACCTG_PCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@REQH_CODE", reqhCode);
			cmd.addParameter("@ITEM", _item);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckedivendor(NNumber vendPidm,NString vendAtypCode,NNumber vendAddrSeqno,NString trtpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSUSP.F_CHECKEDIVENDOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VEND_PIDM", vendPidm);
			cmd.addParameter("@VEND_ATYP_CODE", vendAtypCode);
			cmd.addParameter("@VEND_ADDR_SEQNO", vendAddrSeqno);
			cmd.addParameter("@TRTP_CODE", trtpCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckposuspense(NString poNum,NNumber changeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSUSP.F_CHECKPOSUSPENSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PO_NUM", poNum);
			cmd.addParameter("@CHANGE_SEQ_NUM", changeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckreqsuspense(NString reqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSUSP.F_CHECKREQSUSPENSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@REQ_NUM", reqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fPoPassNsfIfApprAreOn(NString pohdCode,NNumber seqNum,NString apprInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSUSP.F_PO_PASS_NSF_IF_APPR_ARE_ON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@POHD_CODE", pohdCode);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@APPR_IND", apprInd);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fReqPassNsfIfApprAreOn(NString reqhCode,NString apprInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSUSP.F_REQ_PASS_NSF_IF_APPR_ARE_ON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@REQH_CODE", reqhCode);
			cmd.addParameter("@APPR_IND", apprInd);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
