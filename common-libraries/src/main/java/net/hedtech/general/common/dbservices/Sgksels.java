package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sgksels {
		public static NString fGetChrtCode(NNumber pPidm,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKSELS.F_GET_CHRT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSgbstdnMaxTermCode(NNumber pPidmKey,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKSELS.F_GET_SGBSTDN_MAX_TERM_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM_KEY", pPidmKey);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetSgbstdnRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKSELS.F_GET_SGBSTDN_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetSgbstdnValue(NNumber pPidm,NString pTerm,NString pInd,NString pStvtermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKSELS.F_GET_SGBSTDN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_STVTERM_CODE", pStvtermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrimaryAdvisor(NNumber pPidm,NString pTermCode,NString pCol) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKSELS.F_PRIMARY_ADVISOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_COL", pCol);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fQuerySgrchrt(NNumber pPidm,NString pTermCodeEff,NString pChrtCode,NString pMultipleInd,NString pActiveInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKSELS.F_QUERY_SGRCHRT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_MULTIPLE_IND", pMultipleInd);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fQuerySgrsatt(NNumber pPidm,NString pTermCodeEff,NString pAttsCode,NString pMultipleInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKSELS.F_QUERY_SGRSATT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_MULTIPLE_IND", pMultipleInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fQuerySgrsprt(NNumber pPidm,NString pTermCode,NString pActcCode,NString pMultipleInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKSELS.F_QUERY_SGRSPRT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_MULTIPLE_IND", pMultipleInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteGvTables(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SGKSELS.P_DELETE_GV_TABLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
	
	
	
}
