package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokview {
		public static NDate fGetClassCompletionDate(NString pTermCode,NNumber pPidm,NString pCrn,NString pPtrmCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKVIEW.F_GET_CLASS_COMPLETION_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetClassStartDate(NString pTermCode,NNumber pPidm,NString pCrn,NString pPtrmCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKVIEW.F_GET_CLASS_START_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fGetExcludeLevelInd(NString pTermCode,NNumber pPidm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKVIEW.F_GET_EXCLUDE_LEVEL_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetExcludeSectionInd(NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKVIEW.F_GET_EXCLUDE_SECTION_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
