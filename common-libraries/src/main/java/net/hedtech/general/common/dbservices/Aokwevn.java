package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Aokwevn {
		public static NString fAfFund(NNumber pidm,NString giftNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKWEVN.F_AF_FUND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGiftexists(NNumber pidm,NString giftNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKWEVN.F_GIFTEXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPlannedGift(NNumber pidm,NString giftNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKWEVN.F_PLANNED_GIFT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAgbgiftnewgift(NNumber pidm,NString giftNo,NDate giftDate,NNumber giftAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKWEVN.P_AGBGIFTNEWGIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@GIFT_DATE", giftDate);
			cmd.addParameter("@GIFT_AMT", giftAmt);
				
			cmd.execute();


		}
		
		public static void pGetGiftInfo(NNumber pidmin,NString giftnoin,Ref<NNumber> balout,Ref<NString> giftkind,Ref<NString> solccode,Ref<NString> newdonor,Ref<NString> username,Ref<NString> donemail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKWEVN.P_GET_GIFT_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDMIN", pidmin);
			cmd.addParameter("@GIFTNOIN", giftnoin);
			cmd.addParameter("@BALOUT", balout, true);
			cmd.addParameter("@GIFTKIND", giftkind, true);
			cmd.addParameter("@SOLCCODE", solccode, true);
			cmd.addParameter("@NEWDONOR", newdonor, true);
			cmd.addParameter("@USERNAME", username, true);
			cmd.addParameter("@DONEMAIL", donemail, true);
				
			cmd.execute();
			balout.val = cmd.getParameterValue("@BALOUT", NNumber.class);
			giftkind.val = cmd.getParameterValue("@GIFTKIND", NString.class);
			solccode.val = cmd.getParameterValue("@SOLCCODE", NString.class);
			newdonor.val = cmd.getParameterValue("@NEWDONOR", NString.class);
			username.val = cmd.getParameterValue("@USERNAME", NString.class);
			donemail.val = cmd.getParameterValue("@DONEMAIL", NString.class);


		}
		
	
	
	
}
