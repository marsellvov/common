package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkfmgd {
		public static void pFacmidgrd(NString crn,NString term,NString msgLabel,NNumber targetRec,NNumber classSize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFMGD.P_FACMIDGRD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@MSG_LABEL", msgLabel);
			cmd.addParameter("@TARGET_REC", targetRec);
			cmd.addParameter("@CLASS_SIZE", classSize);
				
			cmd.execute();


		}
		
//		public static void pFacmidgrdpost(List<Varchar2TabtypeRow> mgrdeTab,List<Varchar2TabtypeRow> attendTab,List<Varchar2TabtypeRow> hrsTab,List<Varchar2TabtypeRow> rowidTab,NNumber studentCount,NString menuName,NNumber targetRec,NNumber classSize,NString updateInd,NString termIn,NString ptrmIn,NString crnIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFMGD.P_FACMIDGRDPOST", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("MGRDE_TAB", "", mgrdeTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ATTEND_TAB", "", attendTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("HRS_TAB", "", hrsTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ROWID_TAB", "", rowidTab, object.class));
//			cmd.addParameter("@STUDENT_COUNT", studentCount);
//			cmd.addParameter("@MENU_NAME", menuName);
//			cmd.addParameter("@TARGET_REC", targetRec);
//			cmd.addParameter("@CLASS_SIZE", classSize);
//			cmd.addParameter("@UPDATE_IND", updateInd);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@PTRM_IN", ptrmIn);
//			cmd.addParameter("@CRN_IN", crnIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pPrintlinks(NNumber pageSizeIn,NNumber classSizeIn,NString crnIn,NString termIn,NNumber targetIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFMGD.P_PRINTLINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAGE_SIZE_IN", pageSizeIn);
			cmd.addParameter("@CLASS_SIZE_IN", classSizeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@TARGET_IN", targetIn);
				
			cmd.execute();


		}
		
	
	
	
}
