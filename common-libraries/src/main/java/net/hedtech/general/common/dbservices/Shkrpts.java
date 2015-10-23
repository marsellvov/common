package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkrpts {
		public static void pCountRepeatUnits(NString subj,NString crse,NString grade,NNumber credits,NString updateFlg,NString schd,NString levlCode,NString titleCheck,NNumber pidmIn,NString termIn,Ref<NNumber> stuCredits,Ref<NNumber> stuCount,Ref<NNumber> repeatLimit,Ref<NNumber> repeatCredits,Ref<NString> repeatInd,Ref<NString> messageOut,NString printTran,NString levelInd,NString titleInd,NString schdInd,NString tranInd,NNumber repeatGradeNum,NNumber multiGradeNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKRPTS.P_COUNT_REPEAT_UNITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUBJ", subj);
			cmd.addParameter("@CRSE", crse);
			cmd.addParameter("@GRADE", grade);
			cmd.addParameter("@CREDITS", credits);
			cmd.addParameter("@UPDATE_FLG", updateFlg);
			cmd.addParameter("@SCHD", schd);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@TITLE_CHECK", titleCheck);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@STU_CREDITS", NNumber.class);
			cmd.addParameter("@STU_COUNT", NNumber.class);
			cmd.addParameter("@REPEAT_LIMIT", NNumber.class);
			cmd.addParameter("@REPEAT_CREDITS", NNumber.class);
			cmd.addParameter("@REPEAT_IND", NString.class);
			cmd.addParameter("@MESSAGE_OUT", NString.class);
			cmd.addParameter("@PRINT_TRAN", printTran);
			cmd.addParameter("@LEVEL_IND", levelInd);
			cmd.addParameter("@TITLE_IND", titleInd);
			cmd.addParameter("@SCHD_IND", schdInd);
			cmd.addParameter("@TRAN_IND", tranInd);
			cmd.addParameter("@REPEAT_GRADE_NUM", repeatGradeNum);
			cmd.addParameter("@MULTI_GRADE_NUM", multiGradeNum);
				
			cmd.execute();
			stuCredits.val = cmd.getParameterValue("@STU_CREDITS", NNumber.class);
			stuCount.val = cmd.getParameterValue("@STU_COUNT", NNumber.class);
			repeatLimit.val = cmd.getParameterValue("@REPEAT_LIMIT", NNumber.class);
			repeatCredits.val = cmd.getParameterValue("@REPEAT_CREDITS", NNumber.class);
			repeatInd.val = cmd.getParameterValue("@REPEAT_IND", NString.class);
			messageOut.val = cmd.getParameterValue("@MESSAGE_OUT", NString.class);


		}
		
	
	
	
}
