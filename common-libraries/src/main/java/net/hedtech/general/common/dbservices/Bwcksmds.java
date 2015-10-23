package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwcksmds {
		public static NBool fConcAttachBase(NNumber param1,NString param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.F_CONC_ATTACH_BASE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fConcAttachMajr(NNumber param1,NNumber param2,NString param3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.F_CONC_ATTACH_MAJR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
			cmd.addParameter("@PARAM3", param3);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fDisplayNextStep(NNumber pageNoIn,NNumber stepIn,NString holdTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.F_DISPLAY_NEXT_STEP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PAGE_NO_IN", pageNoIn);
			cmd.addParameter("@STEP_IN", stepIn);
			cmd.addParameter("@HOLD_TERM_IN", holdTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetMajrCodeConc(NNumber param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.F_GET_MAJR_CODE_CONC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMajrCodeMinr(NNumber param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.F_GET_MAJR_CODE_MINR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fMinrAttachBase(NNumber param1,NString param2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.F_MINR_ATTACH_BASE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM1", param1);
			cmd.addParameter("@PARAM2", param2);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fSmbdfltIpCrseInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.F_SMBDFLT_IP_CRSE_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fTwgrinfoProgramText() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.F_TWGRINFO_PROGRAM_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FgetCampDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.GET_CAMP_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetCollDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.GET_COLL_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDegcDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.GET_DEGC_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetDeptDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.GET_DEPT_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetLevlDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.GET_LEVL_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetMajrDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.GET_MAJR_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetProgramDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.GET_PROGRAM_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetTermDesc(NString param1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.GET_TERM_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM1", param1);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDisplayStepEight(NString termIn,NString catlgTermIn,NString programIn,NString levlIn,NString degcIn,NString collIn,NString campIn,NNumber sobcurrRuleIn,NNumber sorcmjrRule11In,NNumber sorcmjrRule12In,NNumber sorcconRule11In,NNumber sorcconRule12In,NNumber sorcconRule13In,NNumber sorcconRule121In,NNumber sorcconRule122In,NNumber sorcconRule123In,NNumber sorcmnrRule11In,NNumber sorcmnrRule12In,NString majrCode11In,NString deptCode11In,NString majrCodeConc11In,NString majrCodeConc12In,NString majrCodeConc13In,NString majrCode12In,NString deptCode12In,NString majrCodeConc121In,NString majrCodeConc122In,NString majrCodeConc123In,NString majrCodeMinr11In,NString majrCodeMinr12In,NString buttonTextIn,NNumber stepIn,NNumber pageNoIn,NNumber pgCounterIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_DISPLAY_STEP_EIGHT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn);
			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In);
			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In);
			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In);
			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In);
			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In);
			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In);
			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In);
			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In);
			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In);
			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In);
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In);
			cmd.addParameter("@BUTTON_TEXT_IN", buttonTextIn);
			cmd.addParameter("@STEP_IN", stepIn);
			cmd.addParameter("@PAGE_NO_IN", pageNoIn);
			cmd.addParameter("@PG_COUNTER_IN", pgCounterIn);
				
			cmd.execute();


		}
		
		public static void pDisplayStepFive(NString termIn,NString catlgTermIn,NString programIn,NString levlIn,NString degcIn,NString collIn,NString campIn,NNumber sobcurrRuleIn,NNumber sorcmjrRule11In,NNumber sorcmjrRule12In,NNumber sorcconRule11In,NNumber sorcconRule12In,NNumber sorcconRule13In,NNumber sorcconRule121In,NNumber sorcconRule122In,NNumber sorcconRule123In,NNumber sorcmnrRule11In,NNumber sorcmnrRule12In,NString majrCode11In,NString deptCode11In,NString majrCodeConc11In,NString majrCodeConc12In,NString majrCodeConc13In,NString majrCode12In,NString deptCode12In,NString majrCodeConc121In,NString majrCodeConc122In,NString majrCodeConc123In,NString majrCodeMinr11In,NString majrCodeMinr12In,NString buttonTextIn,NNumber stepIn,NNumber pageNoIn,NNumber pgCounterIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_DISPLAY_STEP_FIVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn);
			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In);
			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In);
			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In);
			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In);
			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In);
			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In);
			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In);
			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In);
			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In);
			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In);
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In);
			cmd.addParameter("@BUTTON_TEXT_IN", buttonTextIn);
			cmd.addParameter("@STEP_IN", stepIn);
			cmd.addParameter("@PAGE_NO_IN", pageNoIn);
			cmd.addParameter("@PG_COUNTER_IN", pgCounterIn);
				
			cmd.execute();


		}
		
		public static void pDisplayStepFour(NString termIn,NString catlgTermIn,NString programIn,NString levlIn,NString degcIn,NString collIn,NString campIn,NNumber sobcurrRuleIn,NNumber sorcmjrRule11In,NNumber sorcmjrRule12In,NNumber sorcconRule11In,NNumber sorcconRule12In,NNumber sorcconRule13In,NNumber sorcconRule121In,NNumber sorcconRule122In,NNumber sorcconRule123In,NNumber sorcmnrRule11In,NNumber sorcmnrRule12In,NString majrCode11In,NString deptCode11In,NString majrCodeConc11In,NString majrCodeConc12In,NString majrCodeConc13In,NString majrCode12In,NString deptCode12In,NString majrCodeConc121In,NString majrCodeConc122In,NString majrCodeConc123In,NString majrCodeMinr11In,NString majrCodeMinr12In,NString buttonTextIn,NNumber stepIn,NNumber pageNoIn,NNumber pgCounterIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_DISPLAY_STEP_FOUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn);
			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In);
			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In);
			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In);
			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In);
			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In);
			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In);
			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In);
			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In);
			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In);
			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In);
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In);
			cmd.addParameter("@BUTTON_TEXT_IN", buttonTextIn);
			cmd.addParameter("@STEP_IN", stepIn);
			cmd.addParameter("@PAGE_NO_IN", pageNoIn);
			cmd.addParameter("@PG_COUNTER_IN", pgCounterIn);
				
			cmd.execute();


		}
		
		public static void pDisplayStepNine(NString termIn,NString catlgTermIn,NString programIn,NString levlIn,NString degcIn,NString collIn,NString campIn,NNumber sobcurrRuleIn,NNumber sorcmjrRule11In,NNumber sorcmjrRule12In,NNumber sorcconRule11In,NNumber sorcconRule12In,NNumber sorcconRule13In,NNumber sorcconRule121In,NNumber sorcconRule122In,NNumber sorcconRule123In,NNumber sorcmnrRule11In,NNumber sorcmnrRule12In,NString majrCode11In,NString deptCode11In,NString majrCodeConc11In,NString majrCodeConc12In,NString majrCodeConc13In,NString majrCode12In,NString deptCode12In,NString majrCodeConc121In,NString majrCodeConc122In,NString majrCodeConc123In,NString majrCodeMinr11In,NString majrCodeMinr12In,NString buttonTextIn,NNumber stepIn,NNumber pageNoIn,NNumber pgCounterIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_DISPLAY_STEP_NINE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn);
			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In);
			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In);
			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In);
			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In);
			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In);
			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In);
			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In);
			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In);
			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In);
			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In);
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In);
			cmd.addParameter("@BUTTON_TEXT_IN", buttonTextIn);
			cmd.addParameter("@STEP_IN", stepIn);
			cmd.addParameter("@PAGE_NO_IN", pageNoIn);
			cmd.addParameter("@PG_COUNTER_IN", pgCounterIn);
				
			cmd.execute();


		}
		
		public static void pDisplayStepSeven(NString termIn,NString catlgTermIn,NString programIn,NString levlIn,NString degcIn,NString collIn,NString campIn,NNumber sobcurrRuleIn,NNumber sorcmjrRule11In,NNumber sorcmjrRule12In,NNumber sorcconRule11In,NNumber sorcconRule12In,NNumber sorcconRule13In,NNumber sorcconRule121In,NNumber sorcconRule122In,NNumber sorcconRule123In,NNumber sorcmnrRule11In,NNumber sorcmnrRule12In,NString majrCode11In,NString deptCode11In,NString majrCodeConc11In,NString majrCodeConc12In,NString majrCodeConc13In,NString majrCode12In,NString deptCode12In,NString majrCodeConc121In,NString majrCodeConc122In,NString majrCodeConc123In,NString majrCodeMinr11In,NString majrCodeMinr12In,NString buttonTextIn,NNumber stepIn,NNumber pageNoIn,NNumber pgCounterIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_DISPLAY_STEP_SEVEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn);
			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In);
			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In);
			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In);
			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In);
			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In);
			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In);
			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In);
			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In);
			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In);
			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In);
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In);
			cmd.addParameter("@BUTTON_TEXT_IN", buttonTextIn);
			cmd.addParameter("@STEP_IN", stepIn);
			cmd.addParameter("@PAGE_NO_IN", pageNoIn);
			cmd.addParameter("@PG_COUNTER_IN", pgCounterIn);
				
			cmd.execute();


		}
		
		public static void pDisplayStepSix(NString termIn,NString catlgTermIn,NString programIn,NString levlIn,NString degcIn,NString collIn,NString campIn,NNumber sobcurrRuleIn,NNumber sorcmjrRule11In,NNumber sorcmjrRule12In,NNumber sorcconRule11In,NNumber sorcconRule12In,NNumber sorcconRule13In,NNumber sorcconRule121In,NNumber sorcconRule122In,NNumber sorcconRule123In,NNumber sorcmnrRule11In,NNumber sorcmnrRule12In,NString majrCode11In,NString deptCode11In,NString majrCodeConc11In,NString majrCodeConc12In,NString majrCodeConc13In,NString majrCode12In,NString deptCode12In,NString majrCodeConc121In,NString majrCodeConc122In,NString majrCodeConc123In,NString majrCodeMinr11In,NString majrCodeMinr12In,NString buttonTextIn,NNumber stepIn,NNumber pageNoIn,NNumber pgCounterIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_DISPLAY_STEP_SIX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn);
			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In);
			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In);
			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In);
			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In);
			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In);
			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In);
			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In);
			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In);
			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In);
			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In);
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In);
			cmd.addParameter("@BUTTON_TEXT_IN", buttonTextIn);
			cmd.addParameter("@STEP_IN", stepIn);
			cmd.addParameter("@PAGE_NO_IN", pageNoIn);
			cmd.addParameter("@PG_COUNTER_IN", pgCounterIn);
				
			cmd.execute();


		}
		
		public static void pDisplayStepThree(NString termIn,NString catlgTermIn,NString programIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_DISPLAY_STEP_THREE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
				
			cmd.execute();


		}
		
		public static void pDisplayStepTwo(NString termIn,NString catlgTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_DISPLAY_STEP_TWO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
				
			cmd.execute();


		}
		
		public static void pFormatAddtnlCurr(NString majrCode11In,NString deptCode11In,NString majrCodeConc11In,NString majrCodeConc12In,NString majrCodeConc13In,NString majrCode12In,NString deptCode12In,NString majrCodeConc121In,NString majrCodeConc122In,NString majrCodeConc123In,NString majrCodeMinr11In,NString majrCodeMinr12In) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_FORMAT_ADDTNL_CURR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In);
				
			cmd.execute();


		}
		
		public static void pFormatBaseCurr(NString catlgTermIn,NString programIn,NString degcIn,NString collIn,NString campIn,NString levlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_FORMAT_BASE_CURR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@LEVL_IN", levlIn);
				
			cmd.execute();


		}
		
		public static void pFormatIpCrseInd(NString callPathIn,NString holdTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_FORMAT_IP_CRSE_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CALL_PATH_IN", callPathIn);
			cmd.addParameter("@HOLD_TERM_IN", holdTermIn);
				
			cmd.execute();


		}
		
		public static void pFormatProgramDesc(NString progIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_FORMAT_PROGRAM_DESC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROG_IN", progIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pGetCatlgTerm(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_GET_CATLG_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pWhatifFinalStep(NString termIn,NString catlgTermIn,NString programIn,NString levlIn,NString degcIn,NString collIn,NString campIn,NNumber sobcurrRuleIn,NNumber sorcmjrRule11In,NNumber sorcmjrRule12In,NNumber sorcconRule11In,NNumber sorcconRule12In,NNumber sorcconRule13In,NNumber sorcconRule121In,NNumber sorcconRule122In,NNumber sorcconRule123In,NNumber sorcmnrRule11In,NNumber sorcmnrRule12In,NString majrCode11In,NString deptCode11In,NString majrCodeConc11In,NString majrCodeConc12In,NString majrCodeConc13In,NString majrCode12In,NString deptCode12In,NString majrCodeConc121In,NString majrCodeConc122In,NString majrCodeConc123In,NString majrCodeMinr11In,NString majrCodeMinr12In,NNumber stepIn,NNumber pageNoIn,NNumber pgCounterIn,NNumber sfStatusIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_WHATIF_FINAL_STEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn);
			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In);
			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In);
			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In);
			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In);
			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In);
			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In);
			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In);
			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In);
			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In);
			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In);
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In);
			cmd.addParameter("@STEP_IN", stepIn);
			cmd.addParameter("@PAGE_NO_IN", pageNoIn);
			cmd.addParameter("@PG_COUNTER_IN", pgCounterIn);
			cmd.addParameter("@SF_STATUS_IN", sfStatusIn);
				
			cmd.execute();


		}
		
		public static void pWhatifNextStep(NString termIn,NString catlgTermIn,NString programIn,NString levlIn,NString degcIn,NString collIn,NString campIn,NNumber sobcurrRuleIn,NNumber sorcmjrRule11In,NNumber sorcmjrRule12In,NNumber sorcconRule11In,NNumber sorcconRule12In,NNumber sorcconRule13In,NNumber sorcconRule121In,NNumber sorcconRule122In,NNumber sorcconRule123In,NNumber sorcmnrRule11In,NNumber sorcmnrRule12In,NString majrCode11In,NString deptCode11In,NString majrCodeConc11In,NString majrCodeConc12In,NString majrCodeConc13In,NString majrCode12In,NString deptCode12In,NString majrCodeConc121In,NString majrCodeConc122In,NString majrCodeConc123In,NString majrCodeMinr11In,NString majrCodeMinr12In,NString buttonTextIn,NNumber stepIn,NNumber pageNoIn,NNumber pgCounterIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_WHATIF_NEXT_STEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@DEGC_IN", degcIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn);
			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In);
			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In);
			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In);
			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In);
			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In);
			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In);
			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In);
			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In);
			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In);
			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In);
			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In);
			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In);
			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In);
			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In);
			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In);
			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In);
			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In);
			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In);
			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In);
			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In);
			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In);
			cmd.addParameter("@BUTTON_TEXT_IN", buttonTextIn);
			cmd.addParameter("@STEP_IN", stepIn);
			cmd.addParameter("@PAGE_NO_IN", pageNoIn);
			cmd.addParameter("@PG_COUNTER_IN", pgCounterIn);
				
			cmd.execute();


		}
		
		public static void pWhatifStepOne(NString termIn,NString pinNumb,NString msg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_WHATIF_STEP_ONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIN_NUMB", pinNumb);
			cmd.addParameter("@MSG", msg);
				
			cmd.execute();


		}
		
		public static void pWhatifStepThree(NString termIn,NString catlgTermIn,NString programIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_WHATIF_STEP_THREE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
				
			cmd.execute();


		}
		
		public static void pWhatifStepTwo(NString termIn,NString catlgTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_WHATIF_STEP_TWO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
				
			cmd.execute();


		}
		
//		public static void pWhatifSubmit(NString termIn,NString catlgTermIn,NString programIn,NString levlIn,NString degcIn,NString collIn,NString campIn,NNumber sobcurrRuleIn,NNumber sorcmjrRule11In,NNumber sorcmjrRule12In,NNumber sorcconRule11In,NNumber sorcconRule12In,NNumber sorcconRule13In,NNumber sorcconRule121In,NNumber sorcconRule122In,NNumber sorcconRule123In,NNumber sorcmnrRule11In,NNumber sorcmnrRule12In,NString majrCode11In,NString deptCode11In,NString majrCodeConc11In,NString majrCodeConc12In,NString majrCodeConc13In,NString majrCode12In,NString deptCode12In,NString majrCodeConc121In,NString majrCodeConc122In,NString majrCodeConc123In,NString majrCodeMinr11In,NString majrCodeMinr12In,NString evalTermIn,List<SmbdfltIndTabRow> dfltIpIn,NNumber stepIn,NNumber pageNoIn,NNumber pgCounterIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSMDS.P_WHATIF_SUBMIT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@CATLG_TERM_IN", catlgTermIn);
//			cmd.addParameter("@PROGRAM_IN", programIn);
//			cmd.addParameter("@LEVL_IN", levlIn);
//			cmd.addParameter("@DEGC_IN", degcIn);
//			cmd.addParameter("@COLL_IN", collIn);
//			cmd.addParameter("@CAMP_IN", campIn);
//			cmd.addParameter("@SOBCURR_RULE_IN", sobcurrRuleIn);
//			cmd.addParameter("@SORCMJR_RULE_1_1_IN", sorcmjrRule11In);
//			cmd.addParameter("@SORCMJR_RULE_1_2_IN", sorcmjrRule12In);
//			cmd.addParameter("@SORCCON_RULE_1_1_IN", sorcconRule11In);
//			cmd.addParameter("@SORCCON_RULE_1_2_IN", sorcconRule12In);
//			cmd.addParameter("@SORCCON_RULE_1_3_IN", sorcconRule13In);
//			cmd.addParameter("@SORCCON_RULE_121_IN", sorcconRule121In);
//			cmd.addParameter("@SORCCON_RULE_122_IN", sorcconRule122In);
//			cmd.addParameter("@SORCCON_RULE_123_IN", sorcconRule123In);
//			cmd.addParameter("@SORCMNR_RULE_1_1_IN", sorcmnrRule11In);
//			cmd.addParameter("@SORCMNR_RULE_1_2_IN", sorcmnrRule12In);
//			cmd.addParameter("@MAJR_CODE_1_1_IN", majrCode11In);
//			cmd.addParameter("@DEPT_CODE_1_1_IN", deptCode11In);
//			cmd.addParameter("@MAJR_CODE_CONC_1_1_IN", majrCodeConc11In);
//			cmd.addParameter("@MAJR_CODE_CONC_1_2_IN", majrCodeConc12In);
//			cmd.addParameter("@MAJR_CODE_CONC_1_3_IN", majrCodeConc13In);
//			cmd.addParameter("@MAJR_CODE_1_2_IN", majrCode12In);
//			cmd.addParameter("@DEPT_CODE_1_2_IN", deptCode12In);
//			cmd.addParameter("@MAJR_CODE_CONC_121_IN", majrCodeConc121In);
//			cmd.addParameter("@MAJR_CODE_CONC_122_IN", majrCodeConc122In);
//			cmd.addParameter("@MAJR_CODE_CONC_123_IN", majrCodeConc123In);
//			cmd.addParameter("@MAJR_CODE_MINR_1_1_IN", majrCodeMinr11In);
//			cmd.addParameter("@MAJR_CODE_MINR_1_2_IN", majrCodeMinr12In);
//			cmd.addParameter("@EVAL_TERM_IN", evalTermIn);
//			// cmd.addParameter(DbTypes.getTableType("DFLT_IP_IN", "", dfltIpIn, object.class));
//			cmd.addParameter("@STEP_IN", stepIn);
//			cmd.addParameter("@PAGE_NO_IN", pageNoIn);
//			cmd.addParameter("@PG_COUNTER_IN", pgCounterIn);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
