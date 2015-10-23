package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbkYearBudget {
		public static void pAddDefaultTypes(NString pAidyCode,NNumber pPidm,NString pBgrpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_ADD_DEFAULT_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
				
			cmd.execute();


		}
		
		public static void pAddMixed(NString pAidyCode,NNumber pPidm,NString pAprdCode,NString pBtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_ADD_MIXED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
				
			cmd.execute();


		}
		
		public static void pAddMixedFullYear(NString pAidyCode,NNumber pPidm,NString pAprdCode,NString pBtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_ADD_MIXED_FULL_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
				
			cmd.execute();


		}
		
		public static void pAddNotMixed(NString pAidyCode,NNumber pPidm,NString pAprdCode,NString pBgrpCode,NString pBtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_ADD_NOT_MIXED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
				
			cmd.execute();


		}
		
		public static void pAddNotMixedFullYear(NString pAidyCode,NNumber pPidm,NString pAprdCode,NString pBgrpCode,NString pBtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_ADD_NOT_MIXED_FULL_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
				
			cmd.execute();


		}
		
		public static void pAddPell(NString pAidyCode,NNumber pPidm,NString pAprdCode,NString pBgrpCode,NString pBtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_ADD_PELL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
				
			cmd.execute();


		}
		
		public static void pDeleteAllComponents(NString pAidyCode,NNumber pPidm,NString pBtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_DELETE_ALL_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
				
			cmd.execute();


		}
		
		public static void pDeleteAllTypes(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_DELETE_ALL_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDeleteSelTypes(NString pAidyCode,NNumber pPidm,NString pBgrpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_DELETE_SEL_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
				
			cmd.execute();


		}
		
		public static void pDeleteSystemComponents(NString pAidyCode,NNumber pPidm,NString pBtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_DELETE_SYSTEM_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
				
			cmd.execute();


		}
		
		public static void pMaintainComponents(NString pAidyCode,NNumber pPidm,NString pAprdCode,NString pBgrpCode,NString pBtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_MAINTAIN_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
				
			cmd.execute();


		}
		
		public static void pMaintainTypes(NString pAidyCode,NNumber pPidm,NString pAprdCode,NString pBgrpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_YEAR_BUDGET.P_MAINTAIN_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
				
			cmd.execute();


		}
		
	
	
	
}
