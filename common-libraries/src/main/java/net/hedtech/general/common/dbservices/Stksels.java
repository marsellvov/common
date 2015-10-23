package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Stksels {
		public static void fGetStvastdRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_GET_STVASTD_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetStvestsRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_GET_STVESTS_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetStvlevlRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_GET_STVLEVL_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetStvrstsRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_GET_STVRSTS_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetStvsaprRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_GET_STVSAPR_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetStvsstsRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_GET_STVSSTS_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetStvststRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_GET_STVSTST_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetStvsubjRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_GET_STVSUBJ_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NBool fStvestsCodeExists(NString estsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_STVESTS_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ESTS_IN", estsIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fStvmajrCodeValidExists(NString majrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_STVMAJR_CODE_VALID_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@MAJR_IN", majrIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStvresdValue(NString pCode,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.F_STVRESD_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetStvadmrRow(NString admrCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.P_GET_STVADMR_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADMR_CODE_IN", admrCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetStvapdcRow(NString apdcCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.P_GET_STVAPDC_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APDC_CODE_IN", apdcCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetStvapstRow(NString apstCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.P_GET_STVAPST_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APST_CODE_IN", apstCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetStvcollRow(NString collCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.P_GET_STVCOLL_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COLL_CODE_IN", collCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetStvdegcRow(NString degcCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.P_GET_STVDEGC_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEGC_CODE_IN", degcCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetStvdeptRow(NString deptCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.P_GET_STVDEPT_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DEPT_CODE_IN", deptCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetStvlevlRow(NString levlCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.P_GET_STVLEVL_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEVL_CODE_IN", levlCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetStvmajrRow(NString majrCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.P_GET_STVMAJR_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAJR_CODE_IN", majrCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetStvrstsRegData(Ref<NString> inclEnrlInOut,Ref<NString> inclAssessInOut,Ref<NString> autoGradeInOut,Ref<NString> holdMessageInOut,Ref<NString> waitIndInOut,NString needQueryIn,NDate rstsDateIn,NDate currDateIn,NString rstsIn,NString estsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSELS.P_GET_STVRSTS_REG_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INCL_ENRL_IN_OUT", inclEnrlInOut, true);
			cmd.addParameter("@INCL_ASSESS_IN_OUT", inclAssessInOut, true);
			cmd.addParameter("@AUTO_GRADE_IN_OUT", autoGradeInOut, true);
			cmd.addParameter("@HOLD_MESSAGE_IN_OUT", holdMessageInOut, true);
			cmd.addParameter("@WAIT_IND_IN_OUT", waitIndInOut, true);
			cmd.addParameter("@NEED_QUERY_IN", needQueryIn);
			cmd.addParameter("@RSTS_DATE_IN", rstsDateIn);
			cmd.addParameter("@CURR_DATE_IN", currDateIn);
			cmd.addParameter("@RSTS_IN", rstsIn);
			cmd.addParameter("@ESTS_IN", estsIn);
				
			cmd.execute();
			inclEnrlInOut.val = cmd.getParameterValue("@INCL_ENRL_IN_OUT", NString.class);
			inclAssessInOut.val = cmd.getParameterValue("@INCL_ASSESS_IN_OUT", NString.class);
			autoGradeInOut.val = cmd.getParameterValue("@AUTO_GRADE_IN_OUT", NString.class);
			holdMessageInOut.val = cmd.getParameterValue("@HOLD_MESSAGE_IN_OUT", NString.class);
			waitIndInOut.val = cmd.getParameterValue("@WAIT_IND_IN_OUT", NString.class);


		}
		
	
	
	
}
