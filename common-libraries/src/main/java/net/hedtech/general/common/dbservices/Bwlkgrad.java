package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkgrad {
		public static void pViewGradapp(NString term,NString xyz,NNumber pGappSeqno,NString pMsgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKGRAD.P_VIEW_GRADAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_MSG_CODE", pMsgCode);
				
			cmd.execute();


		}
		
	
	
	
}
