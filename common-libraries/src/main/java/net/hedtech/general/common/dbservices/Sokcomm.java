package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokcomm {
		public static NNumber fInsertSobcpln(NNumber pPidm,NString pCplnType,NString pTermCode,NNumber pSeqno,NString pInitialDateInd,Ref<NString> pNewCpln) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCOMM.F_INSERT_SOBCPLN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CPLN_TYPE", pCplnType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_INITIAL_DATE_IND", pInitialDateInd);
			cmd.addParameter("@P_NEW_CPLN", NString.class);
				
			cmd.execute();
			pNewCpln.val = cmd.getParameterValue("@P_NEW_CPLN", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fTestplan(NNumber pPidm,NString pCplnType,NString pTermCode,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCOMM.F_TESTPLAN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CPLN_TYPE", pCplnType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pInsertCurricmaterials(NNumber pPidm,NString pCplnType,NString pTermCode,NNumber pSeqno,NString pCplnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCOMM.P_INSERT_CURRICMATERIALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CPLN_TYPE", pCplnType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_CPLN_CODE", pCplnCode);
				
			cmd.execute();


		}
		
	
	
	
}
