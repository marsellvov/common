package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokemal {
		public static void pSendEmail(NString pToAddr,NString pCcAddr,NString pBccAddr,NString pFromAddr,NString pSubject,NString pMessage,NString pMimeType,NString pAttachType,byte[] pRawAttach,NString pCharAttach,NString pAttDir,NString pAttFilename,NString pAttMimeType,NNumber pPriority,Ref<NString> pSuccessOut,Ref<NString> pReplyOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKEMAL.P_SEND_EMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TO_ADDR", pToAddr);
			cmd.addParameter("@P_CC_ADDR", pCcAddr);
			cmd.addParameter("@P_BCC_ADDR", pBccAddr);
			cmd.addParameter("@P_FROM_ADDR", pFromAddr);
			cmd.addParameter("@P_SUBJECT", pSubject);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_MIME_TYPE", pMimeType);
			cmd.addParameter("@P_ATTACH_TYPE", pAttachType);
			cmd.addParameter("@P_RAW_ATTACH", pRawAttach);
			cmd.addParameter("@P_CHAR_ATTACH", pCharAttach);
			cmd.addParameter("@P_ATT_DIR", pAttDir);
			cmd.addParameter("@P_ATT_FILENAME", pAttFilename);
			cmd.addParameter("@P_ATT_MIME_TYPE", pAttMimeType);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_SUCCESS_OUT", NString.class);
			cmd.addParameter("@P_REPLY_OUT", NString.class);
				
			cmd.execute();
			pSuccessOut.val = cmd.getParameterValue("@P_SUCCESS_OUT", NString.class);
			pReplyOut.val = cmd.getParameterValue("@P_REPLY_OUT", NString.class);


		}
		
	
	
	
}
