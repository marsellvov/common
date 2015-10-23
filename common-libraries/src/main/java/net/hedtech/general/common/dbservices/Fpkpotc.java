package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpkpotc {
		public static NNumber fCalcChtot(NString poNum,NNumber changeSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPOTC.F_CALC_CHTOT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PO_NUM", poNum);
			cmd.addParameter("@CHANGE_SEQ_NUM", changeSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcCoCommTotal(NString poNum,NNumber changeSeqNum,NString caChangeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPOTC.F_CALC_CO_COMM_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PO_NUM", poNum);
			cmd.addParameter("@CHANGE_SEQ_NUM", changeSeqNum);
			cmd.addParameter("@CA_CHANGE_IND", caChangeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcPoAcctgTotal(NString poNum,NNumber changeSeqNum,NNumber itemNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPOTC.F_CALC_PO_ACCTG_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PO_NUM", poNum);
			cmd.addParameter("@CHANGE_SEQ_NUM", changeSeqNum);
			cmd.addParameter("@ITEM_NUM", itemNum);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcPoCommTotal(NString poNum,NNumber changeSeqNum,NNumber itemNum,NString caChangeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKPOTC.F_CALC_PO_COMM_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PO_NUM", poNum);
			cmd.addParameter("@CHANGE_SEQ_NUM", changeSeqNum);
			cmd.addParameter("@ITEM_NUM", itemNum);
			cmd.addParameter("@CA_CHANGE_IND", caChangeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
