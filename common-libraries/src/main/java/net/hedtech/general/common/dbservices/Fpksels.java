package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpksels {
		public static void pGetFtvbuyrRec(NString buyer,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSELS.P_GET_FTVBUYR_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUYER", buyer);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvcommRec(NString commCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSELS.P_GET_FTVCOMM_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMM_CODE", commCode);
				
			cmd.execute();


		}
		
		public static void pGetFtvdiscRec(NString discCode,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSELS.P_GET_FTVDISC_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DISC_CODE", discCode);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvshipRec(NString shipCode,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSELS.P_GET_FTVSHIP_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SHIP_CODE", shipCode);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvtgrpRec(NString tgrpCode,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSELS.P_GET_FTVTGRP_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TGRP_CODE", tgrpCode);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvtratRec(NString tratCode,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSELS.P_GET_FTVTRAT_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRAT_CODE", tratCode);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvuomsRec(NString uomsCode,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSELS.P_GET_FTVUOMS_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UOMS_CODE", uomsCode);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
		public static void pGetFtvvendRec(NNumber vendPidm,NString vendId,NDate asofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKSELS.P_GET_FTVVEND_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VEND_PIDM", vendPidm);
			cmd.addParameter("@VEND_ID", vendId);
			cmd.addParameter("@ASOFDATE", asofdate);
				
			cmd.execute();


		}
		
	
	
	
}
