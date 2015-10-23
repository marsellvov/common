package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowMail {
		public static void background(NNumber pId,NString pSmtpHostname,NString pSmtpPortno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_MAIL.BACKGROUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_SMTP_HOSTNAME", pSmtpHostname);
			cmd.addParameter("@P_SMTP_PORTNO", pSmtpPortno);
				
			cmd.execute();


		}
		
		public static void pushQueue(NString pSmtpHostname,NString pSmtpPortno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_MAIL.PUSH_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SMTP_HOSTNAME", pSmtpHostname);
			cmd.addParameter("@P_SMTP_PORTNO", pSmtpPortno);
				
			cmd.execute();


		}
		
		public static void pushQueueBackground() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_MAIL.PUSH_QUEUE_BACKGROUND", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void send(NString pTo,NString pFrom,NString pBody,NString pBodyHtml,NString pSubj,NString pCc,NString pBcc) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_MAIL.SEND", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TO", pTo);
//			cmd.addParameter("@P_FROM", pFrom);
//			cmd.addParameter("@P_BODY", pBody);
//			cmd.addParameter("@P_BODY_HTML", pBodyHtml);
//			cmd.addParameter("@P_SUBJ", pSubj);
//			cmd.addParameter("@P_CC", pCc);
//			cmd.addParameter("@P_BCC", pBcc);
//				
//			cmd.execute();
//
//
//		}
		
		public static void send(NString pTo,NString pFrom,NString pBody,NString pBodyHtml,NString pSubj,NString pCc,NString pBcc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_MAIL.SEND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TO", pTo);
			cmd.addParameter("@P_FROM", pFrom);
			cmd.addParameter("@P_BODY", pBody);
			cmd.addParameter("@P_BODY_HTML", pBodyHtml);
			cmd.addParameter("@P_SUBJ", pSubj);
			cmd.addParameter("@P_CC", pCc);
			cmd.addParameter("@P_BCC", pBcc);
				
			cmd.execute();


		}
		
//		public static void send(NString pTo,NString pFrom,NString pBody,NString pBodyHtml,NString pSubj,NString pCc,NString pBcc,NString pReplyto) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_MAIL.SEND", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TO", pTo);
//			cmd.addParameter("@P_FROM", pFrom);
//			cmd.addParameter("@P_BODY", pBody);
//			cmd.addParameter("@P_BODY_HTML", pBodyHtml);
//			cmd.addParameter("@P_SUBJ", pSubj);
//			cmd.addParameter("@P_CC", pCc);
//			cmd.addParameter("@P_BCC", pBcc);
//			cmd.addParameter("@P_REPLYTO", pReplyto);
//				
//			cmd.execute();
//
//
//		}
		
		public static void send(NString pTo,NString pFrom,NString pBody,NString pBodyHtml,NString pSubj,NString pCc,NString pBcc,NString pReplyto) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_MAIL.SEND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TO", pTo);
			cmd.addParameter("@P_FROM", pFrom);
			cmd.addParameter("@P_BODY", pBody);
			cmd.addParameter("@P_BODY_HTML", pBodyHtml);
			cmd.addParameter("@P_SUBJ", pSubj);
			cmd.addParameter("@P_CC", pCc);
			cmd.addParameter("@P_BCC", pBcc);
			cmd.addParameter("@P_REPLYTO", pReplyto);
				
			cmd.execute();


		}
		
	
	
	
}
