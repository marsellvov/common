package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskadec {
		public static void pApplicationwdinfo(NNumber appno,NString wsct,NNumber recno,NString pCollegeCode,NString pWdReason,NString btnSubmit,NString pDispHeader) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKADEC.P_APPLICATIONWDINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO", appno);
			cmd.addParameter("@WSCT", wsct);
			cmd.addParameter("@RECNO", recno);
			cmd.addParameter("@P_COLLEGE_CODE", pCollegeCode);
			cmd.addParameter("@P_WD_REASON", pWdReason);
			cmd.addParameter("@BTN_SUBMIT", btnSubmit);
			cmd.addParameter("@P_DISP_HEADER", pDispHeader);
				
			cmd.execute();


		}
		
	
	
	
}
