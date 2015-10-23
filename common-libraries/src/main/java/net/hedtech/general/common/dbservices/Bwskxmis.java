package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskxmis {
		public static void pStudenttermdata(NString termIn,NString egolCodeIn,NString emexCodeIn,NString majrCode1In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKXMIS.P_STUDENTTERMDATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@EGOL_CODE_IN", egolCodeIn);
			cmd.addParameter("@EMEX_CODE_IN", emexCodeIn);
			cmd.addParameter("@MAJR_CODE_1_IN", majrCode1In);
				
			cmd.execute();


		}
		
		public static void pUpdstudenttermdata(NString term,NString levlCode,NString egolCode,NString emexCode,NString majrCode1,NString egolCodeIn,NString emexCodeIn,NString majrCode1In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKXMIS.P_UPDSTUDENTTERMDATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@EGOL_CODE", egolCode);
			cmd.addParameter("@EMEX_CODE", emexCode);
			cmd.addParameter("@MAJR_CODE_1", majrCode1);
			cmd.addParameter("@EGOL_CODE_IN", egolCodeIn);
			cmd.addParameter("@EMEX_CODE_IN", emexCodeIn);
			cmd.addParameter("@MAJR_CODE_1_IN", majrCode1In);
				
			cmd.execute();


		}
		
	
	
	
}
