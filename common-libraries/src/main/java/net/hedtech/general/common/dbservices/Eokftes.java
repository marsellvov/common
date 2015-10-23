package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokftes {
		public static void pAxsctindexupdatePost(NNumber vAppid,NNumber vDocid,NString vUsername,NNumber vFlags,NString vIndex,NString vFmrindex,NString vLocale,NString vSessionid,Ref<NString> vInfomsg,Ref<NNumber> vInfomsgstyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKFTES.P_AXSCTINDEXUPDATE_POST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_FLAGS", vFlags);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_FMRINDEX", vFmrindex);
			cmd.addParameter("@V_LOCALE", vLocale);
			cmd.addParameter("@V_SESSIONID", vSessionid);
			cmd.addParameter("@V_INFOMSG", vInfomsg, true);
			cmd.addParameter("@V_INFOMSGSTYLE", vInfomsgstyle, true);
				
			cmd.execute();
			vInfomsg.val = cmd.getParameterValue("@V_INFOMSG", NString.class);
			vInfomsgstyle.val = cmd.getParameterValue("@V_INFOMSGSTYLE", NNumber.class);


		}
		
	
	
	
}
