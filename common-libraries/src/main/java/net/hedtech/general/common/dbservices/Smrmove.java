package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smrmove {
		public static NString fGetNextCappStvterm(NString pStvtermCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.F_GET_NEXT_CAPP_STVTERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STVTERM_CODE_IN", pStvtermCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pInsertSmrpaap(NString pProgramIn,NString pAreaIn,NString pTermCodeIn,NString pCrseReuseIn,NString pAttrReuseIn,NNumber pPriorityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.P_INSERT_SMRPAAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROGRAM_IN", pProgramIn);
			cmd.addParameter("@P_AREA_IN", pAreaIn);
			cmd.addParameter("@P_TERM_CODE_IN", pTermCodeIn);
			cmd.addParameter("@P_CRSE_REUSE_IN", pCrseReuseIn);
			cmd.addParameter("@P_ATTR_REUSE_IN", pAttrReuseIn);
			cmd.addParameter("@P_PRIORITY_IN", pPriorityIn);
				
			cmd.execute();


		}
		
		public static void pMassCreateDgmr(NNumber pFromPidmIn,NNumber pToPidmIn,NString pDegsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.P_MASS_CREATE_DGMR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FROM_PIDM_IN", pFromPidmIn);
			cmd.addParameter("@P_TO_PIDM_IN", pToPidmIn);
			cmd.addParameter("@P_DEGS_CODE_IN", pDegsCodeIn);
				
			cmd.execute();


		}
		
		public static void pMassCreateSmbagen(NString areaNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.P_MASS_CREATE_SMBAGEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA_NAME_IN", areaNameIn);
				
			cmd.execute();


		}
		
		public static void pMassCreateSmbggen(NString groupNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.P_MASS_CREATE_SMBGGEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME_IN", groupNameIn);
				
			cmd.execute();


		}
		
		public static void pMassCreateSmbpgen(NString programNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.P_MASS_CREATE_SMBPGEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROGRAM_NAME_IN", programNameIn);
				
			cmd.execute();


		}
		
		public static void pMassCreateSmralib(NString areaNameIn,NString areaDescIn,NNumber areaCountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.P_MASS_CREATE_SMRALIB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA_NAME_IN", areaNameIn);
			cmd.addParameter("@AREA_DESC_IN", areaDescIn);
			cmd.addParameter("@AREA_COUNT_IN", areaCountIn);
				
			cmd.execute();


		}
		
		public static void pMassCreateSmrglib(NString groupNameIn,NString groupDescIn,NNumber groupCountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.P_MASS_CREATE_SMRGLIB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GROUP_NAME_IN", groupNameIn);
			cmd.addParameter("@GROUP_DESC_IN", groupDescIn);
			cmd.addParameter("@GROUP_COUNT_IN", groupCountIn);
				
			cmd.execute();


		}
		
		public static void pMassCreateSmrpaap(NString pProgramNameIn,NString pStartTermIn,NNumber pIncrementIn,NNumber pCountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.P_MASS_CREATE_SMRPAAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROGRAM_NAME_IN", pProgramNameIn);
			cmd.addParameter("@P_START_TERM_IN", pStartTermIn);
			cmd.addParameter("@P_INCREMENT_IN", pIncrementIn);
			cmd.addParameter("@P_COUNT_IN", pCountIn);
				
			cmd.execute();


		}
		
		public static void pMassCreateSmrprle(NString programNameIn,NString programDescIn,NString programCampIn,NString programCollIn,NString programDegcIn,NNumber programCountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.P_MASS_CREATE_SMRPRLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROGRAM_NAME_IN", programNameIn);
			cmd.addParameter("@PROGRAM_DESC_IN", programDescIn);
			cmd.addParameter("@PROGRAM_CAMP_IN", programCampIn);
			cmd.addParameter("@PROGRAM_COLL_IN", programCollIn);
			cmd.addParameter("@PROGRAM_DEGC_IN", programDegcIn);
			cmd.addParameter("@PROGRAM_COUNT_IN", programCountIn);
				
			cmd.execute();


		}
		
		public static void pMassCreateStvterm(NString termCodeIn,NString termDescIn,NNumber termIncrementIn,NNumber termCountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRMOVE.P_MASS_CREATE_STVTERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@TERM_DESC_IN", termDescIn);
			cmd.addParameter("@TERM_INCREMENT_IN", termIncrementIn);
			cmd.addParameter("@TERM_COUNT_IN", termCountIn);
				
			cmd.execute();


		}
		
	
	
	
}
