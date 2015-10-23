package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ffk2000 {
		public static void pChkActg(NString pohdCode,NNumber _item,NNumber seqNum,Ref<NString> maxPoFsyrCode,Ref<NString> maxReqFsyrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFK2000.P_CHK_ACTG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POHD_CODE", pohdCode);
			cmd.addParameter("@ITEM", _item);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@MAX_PO_FSYR_CODE", maxPoFsyrCode, true);
			cmd.addParameter("@MAX_REQ_FSYR_CODE", maxReqFsyrCode, true);
				
			cmd.execute();
			maxPoFsyrCode.val = cmd.getParameterValue("@MAX_PO_FSYR_CODE", NString.class);
			maxReqFsyrCode.val = cmd.getParameterValue("@MAX_REQ_FSYR_CODE", NString.class);


		}
		
	
	
	
}
