package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkwinf {
		public static void pCopytolocal(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWINF.P_COPYTOLOCAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
		public static void pModifypginfotext(NString returnCode,NString returnMsg,NString transType,NString nameIn,NString imageIn,NString seqIn,NString labelIn,NString newLabelIn,NString textIn,NString commentIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWINF.P_MODIFYPGINFOTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@IMAGE_IN", imageIn);
			cmd.addParameter("@SEQ_IN", seqIn);
			cmd.addParameter("@LABEL_IN", labelIn);
			cmd.addParameter("@NEW_LABEL_IN", newLabelIn);
			cmd.addParameter("@TEXT_IN", textIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
				
			cmd.execute();


		}
		
		public static void pOptionpginfotext() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWINF.P_OPTIONPGINFOTEXT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pReorderinfotext(NString nameIn,NString numRecords,List<Twbklibs.Varchar2TabtypeRow> origSeqTab,List<Twbklibs.Varchar2TabtypeRow> newSeqTab,List<Twbklibs.Varchar2TabtypeRow> labelTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWINF.P_REORDERINFOTEXT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@NAME_IN", nameIn);
//			cmd.addParameter("@NUM_RECORDS", numRecords);
//			// cmd.addParameter(DbTypes.getTableType("ORIG_SEQ_TAB", "", origSeqTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("NEW_SEQ_TAB", "", newSeqTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LABEL_TAB", "", labelTab, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pReorderpginfotext(NString returnCode,NString returnMsg,NString nameIn,NString retStr,NString srchName,NString srchDesc,NString transType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWINF.P_REORDERPGINFOTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@RET_STR", retStr);
			cmd.addParameter("@SRCH_NAME", srchName);
			cmd.addParameter("@SRCH_DESC", srchDesc);
			cmd.addParameter("@TRANS_TYPE", transType);
				
			cmd.execute();


		}
		
		public static void pSaveinfotext(NString transType,NString nameIn,NString imageIn,NString seqIn,NString labelIn,NString newLabelIn,NString textIn,NString commentIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWINF.P_SAVEINFOTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@IMAGE_IN", imageIn);
			cmd.addParameter("@SEQ_IN", seqIn);
			cmd.addParameter("@LABEL_IN", labelIn);
			cmd.addParameter("@NEW_LABEL_IN", newLabelIn);
			cmd.addParameter("@TEXT_IN", textIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
				
			cmd.execute();


		}
		
	
	
	
}
