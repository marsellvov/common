package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkebst {
		public static void pDispbenefitstatement(NString selectedDate,NString overrideDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEBST.P_DISPBENEFITSTATEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELECTED_DATE", selectedDate);
			cmd.addParameter("@OVERRIDE_DATE", overrideDate);
				
			cmd.execute();


		}
		
		public static void pDispdateselect(NString adminInd,NString viewChoice,NString emplId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEBST.P_DISPDATESELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADMIN_IND", adminInd);
			cmd.addParameter("@VIEW_CHOICE", viewChoice);
			cmd.addParameter("@EMPL_ID", emplId);
				
			cmd.execute();


		}
		
		public static void pDispidselect(NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEBST.P_DISPIDSELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
	
	
	
}
