package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskfreg {
		public static void pAdddropcrse(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKFREG.P_ADDDROPCRSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pAltpin(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKFREG.P_ALTPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
//		public static void pAltpin1(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> selCrn,List<OwaUtil.IdentArrRow> addBtn,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> rsts) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKFREG.P_ALTPIN1", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_CRN", "", selCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ADD_BTN", "", addBtn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pChangecrseopt(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKFREG.P_CHANGECRSEOPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pCheckaltpin(NString pin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKFREG.P_CHECKALTPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIN", pin);
				
			cmd.execute();


		}
		
//		public static void pCheckaltpin1(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> selCrn,List<OwaUtil.IdentArrRow> addBtn,List<OwaUtil.IdentArrRow> selTermArr,List<OwaUtil.IdentArrRow> pin) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKFREG.P_CHECKALTPIN1", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_CRN", "", selCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ADD_BTN", "", addBtn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_TERM_ARR", "", selTermArr, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PIN", "", pin, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
