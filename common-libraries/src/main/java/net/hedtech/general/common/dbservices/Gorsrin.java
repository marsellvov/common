package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gorsrin {
		public static NString fGetoption(NString pOtyp,NString pRetp,NString pSyst) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GORSRIN.F_GETOPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OTYP", pOtyp);
			cmd.addParameter("@P_RETP", pRetp);
			cmd.addParameter("@P_SYST", pSyst);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fInsUpdPerson(NNumber psGidm,NNumber psPidm,NString psSystem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GORSRIN.F_INS_UPD_PERSON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PS_GIDM", psGidm);
			cmd.addParameter("@PS_PIDM", psPidm);
			cmd.addParameter("@PS_SYSTEM", psSystem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fProcessAdvancement(NNumber pGidm,NString pSyst,NString pRetp,NString pDtyp,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GORSRIN.F_PROCESS_ADVANCEMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST", pSyst);
			cmd.addParameter("@P_RETP", pRetp);
			cmd.addParameter("@P_DTYP", pDtyp);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fProcessPerson(NNumber pGidm,NString pSyst,NString pRetp,NString pDtyp,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GORSRIN.F_PROCESS_PERSON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST", pSyst);
			cmd.addParameter("@P_RETP", pRetp);
			cmd.addParameter("@P_DTYP", pDtyp);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fProcessProxy(NNumber pGidm,NString pSyst,NString pRetp,NString pDtyp,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GORSRIN.F_PROCESS_PROXY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GIDM", pGidm);
			cmd.addParameter("@P_SYST", pSyst);
			cmd.addParameter("@P_RETP", pRetp);
			cmd.addParameter("@P_DTYP", pDtyp);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGenProxyaccessComMatch(NNumber pOneUpNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GORSRIN.P_GEN_PROXYACCESS_COM_MATCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ONE_UP_NUMBER", pOneUpNumber);
				
			cmd.execute();


		}
		
		public static void pLogging(NString pText,NNumber pVerbosity) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GORSRIN.P_LOGGING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_VERBOSITY", pVerbosity);
				
			cmd.execute();


		}
		
	
	
	
}
