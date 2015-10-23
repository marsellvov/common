package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkpxym {
		public static NString fCheckProxyRelationshipSql(NString pSystem,NString pRelationship,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.F_CHECK_PROXY_RELATIONSHIP_SQL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SYSTEM", pSystem);
			cmd.addParameter("@P_RELATIONSHIP", pRelationship);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGenerateidm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.F_GENERATEIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetmenucheckedind(NNumber pProxyidm,NNumber pPersonpidm,NString pMenu,NString pRelationship) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.F_GETMENUCHECKEDIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PERSONPIDM", pPersonpidm);
			cmd.addParameter("@P_MENU", pMenu);
			cmd.addParameter("@P_RELATIONSHIP", pRelationship);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetproxyidm(NString pEmail,NString pLast,NString pFirst,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.F_GETPROXYIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_LAST", pLast);
			cmd.addParameter("@P_FIRST", pFirst);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pMpAdd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_ADD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pMpAddpidm(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_ADDPIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pMpAddxref(NString pEmail,NString pLast,NString pFirst,NString pEmailVerify,NString pButton) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_ADDXREF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_LAST", pLast);
			cmd.addParameter("@P_FIRST", pFirst);
			cmd.addParameter("@P_EMAIL_VERIFY", pEmailVerify);
			cmd.addParameter("@P_BUTTON", pButton);
				
			cmd.execute();


		}
		
		public static void pMpCloneauth(NNumber pProxyidm1,NNumber pProxyidm2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_CLONEAUTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM1", pProxyidm1);
			cmd.addParameter("@P_PROXYIDM2", pProxyidm2);
				
			cmd.execute();


		}
		
		public static void pMpCloneselect(NNumber pProxyidm,NNumber pPersonpidm,NString pRetp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_CLONESELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PERSONPIDM", pPersonpidm);
			cmd.addParameter("@P_RETP", pRetp);
				
			cmd.execute();


		}
		
		public static void pMpDebugemail(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_DEBUGEMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pMpDeleteunused(NNumber pProxyidm,NNumber pPersonpidm,NString pContinue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_DELETEUNUSED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PERSONPIDM", pPersonpidm);
			cmd.addParameter("@P_CONTINUE", pContinue);
				
			cmd.execute();


		}
		
		public static void pMpEmailpassphrase(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_EMAILPASSPHRASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pMpExpand(NNumber pTab,NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_EXPAND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAB", pTab);
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pMpGrantone(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_GRANTONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pMpList() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_LIST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pMpProxyinfo(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_PROXYINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pMpResendemail(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_RESENDEMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pMpResetpin(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_RESETPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pMpSendauthemail(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_SENDAUTHEMAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pMpSetauthind(NNumber pProxyidm,NString pPage,NString pChecked) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_SETAUTHIND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PAGE", pPage);
			cmd.addParameter("@P_CHECKED", pChecked);
				
			cmd.execute();


		}
		
		public static void pMpShowauth(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_SHOWAUTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pMpShowcomm(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_SHOWCOMM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pMpShowhistory(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_SHOWHISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pMpShowprofile(NNumber pProxyidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_SHOWPROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
				
			cmd.execute();


		}
		
		public static void pMpUpdatepassphrase(NNumber pProxyidm,NString pPhrase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_UPDATEPASSPHRASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_PHRASE", pPhrase);
				
			cmd.execute();


		}
		
		public static void pMpUpdateproxydesc(NNumber pProxyidm,NString pDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_UPDATEPROXYDESC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_DESC", pDesc);
				
			cmd.execute();


		}
		
		public static void pMpUpdateretp(NNumber pProxyidm,NString pRetp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_UPDATERETP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_RETP", pRetp);
				
			cmd.execute();


		}
		
		public static void pMpUpdatestart(NNumber pProxyidm,NString pStart) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_UPDATESTART", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_START", pStart);
				
			cmd.execute();


		}
		
		public static void pMpUpdatestop(NNumber pProxyidm,NString pStop) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKPXYM.P_MP_UPDATESTOP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXYIDM", pProxyidm);
			cmd.addParameter("@P_STOP", pStop);
				
			cmd.execute();


		}
		
	
	
	
}
