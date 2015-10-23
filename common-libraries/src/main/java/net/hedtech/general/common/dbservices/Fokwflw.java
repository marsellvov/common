package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fokwflw {
		public static NString FcheckReqStatus(NString docNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKWFLW.CHECK_REQ_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOC_NUM", docNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void endWorkflow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKWFLW.END_WORKFLOW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void getNextApprover(NString docNum,NNumber docType,Ref<NString> nextApprover) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKWFLW.GET_NEXT_APPROVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_NUM", docNum);
			cmd.addParameter("@DOC_TYPE", docType);
			cmd.addParameter("@NEXT_APPROVER", nextApprover, true);
				
			cmd.execute();
			nextApprover.val = cmd.getParameterValue("@NEXT_APPROVER", NString.class);


		}
		
		public static void getRequestor(NString docNum,Ref<NString> requestor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKWFLW.GET_REQUESTOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOC_NUM", docNum);
			cmd.addParameter("@REQUESTOR", requestor, true);
				
			cmd.execute();
			requestor.val = cmd.getParameterValue("@REQUESTOR", NString.class);


		}
		
		public static NString FisFinalApprover(NString docNum,NNumber docType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKWFLW.IS_FINAL_APPROVER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOC_NUM", docNum);
			cmd.addParameter("@DOC_TYPE", docType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetReqInformation(NString inDocNum,Ref<NString> outDescMsg,Ref<NString> outVendname,Ref<NString> outLine01,Ref<NString> outDesc01,Ref<NString> outLine02,Ref<NString> outDesc02,Ref<NString> outLine03,Ref<NString> outDesc03,Ref<NString> outLine04,Ref<NString> outDesc04,Ref<NString> outLine05,Ref<NString> outDesc05,Ref<NString> outLine06,Ref<NString> outDesc06,Ref<NString> outLine07,Ref<NString> outDesc07,Ref<NString> outLine08,Ref<NString> outDesc08,Ref<NString> outLine09,Ref<NString> outDesc09,Ref<NString> outLine10,Ref<NString> outDesc10) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKWFLW.P_GET_REQ_INFORMATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_DOC_NUM", inDocNum);
			cmd.addParameter("@OUT_DESC_MSG", outDescMsg, true);
			cmd.addParameter("@OUT_VENDNAME", outVendname, true);
			cmd.addParameter("@OUT_LINE01", outLine01, true);
			cmd.addParameter("@OUT_DESC01", outDesc01, true);
			cmd.addParameter("@OUT_LINE02", outLine02, true);
			cmd.addParameter("@OUT_DESC02", outDesc02, true);
			cmd.addParameter("@OUT_LINE03", outLine03, true);
			cmd.addParameter("@OUT_DESC03", outDesc03, true);
			cmd.addParameter("@OUT_LINE04", outLine04, true);
			cmd.addParameter("@OUT_DESC04", outDesc04, true);
			cmd.addParameter("@OUT_LINE05", outLine05, true);
			cmd.addParameter("@OUT_DESC05", outDesc05, true);
			cmd.addParameter("@OUT_LINE06", outLine06, true);
			cmd.addParameter("@OUT_DESC06", outDesc06, true);
			cmd.addParameter("@OUT_LINE07", outLine07, true);
			cmd.addParameter("@OUT_DESC07", outDesc07, true);
			cmd.addParameter("@OUT_LINE08", outLine08, true);
			cmd.addParameter("@OUT_DESC08", outDesc08, true);
			cmd.addParameter("@OUT_LINE09", outLine09, true);
			cmd.addParameter("@OUT_DESC09", outDesc09, true);
			cmd.addParameter("@OUT_LINE10", outLine10, true);
			cmd.addParameter("@OUT_DESC10", outDesc10, true);
				
			cmd.execute();
			outDescMsg.val = cmd.getParameterValue("@OUT_DESC_MSG", NString.class);
			outVendname.val = cmd.getParameterValue("@OUT_VENDNAME", NString.class);
			outLine01.val = cmd.getParameterValue("@OUT_LINE01", NString.class);
			outDesc01.val = cmd.getParameterValue("@OUT_DESC01", NString.class);
			outLine02.val = cmd.getParameterValue("@OUT_LINE02", NString.class);
			outDesc02.val = cmd.getParameterValue("@OUT_DESC02", NString.class);
			outLine03.val = cmd.getParameterValue("@OUT_LINE03", NString.class);
			outDesc03.val = cmd.getParameterValue("@OUT_DESC03", NString.class);
			outLine04.val = cmd.getParameterValue("@OUT_LINE04", NString.class);
			outDesc04.val = cmd.getParameterValue("@OUT_DESC04", NString.class);
			outLine05.val = cmd.getParameterValue("@OUT_LINE05", NString.class);
			outDesc05.val = cmd.getParameterValue("@OUT_DESC05", NString.class);
			outLine06.val = cmd.getParameterValue("@OUT_LINE06", NString.class);
			outDesc06.val = cmd.getParameterValue("@OUT_DESC06", NString.class);
			outLine07.val = cmd.getParameterValue("@OUT_LINE07", NString.class);
			outDesc07.val = cmd.getParameterValue("@OUT_DESC07", NString.class);
			outLine08.val = cmd.getParameterValue("@OUT_LINE08", NString.class);
			outDesc08.val = cmd.getParameterValue("@OUT_DESC08", NString.class);
			outLine09.val = cmd.getParameterValue("@OUT_LINE09", NString.class);
			outDesc09.val = cmd.getParameterValue("@OUT_DESC09", NString.class);
			outLine10.val = cmd.getParameterValue("@OUT_LINE10", NString.class);
			outDesc10.val = cmd.getParameterValue("@OUT_DESC10", NString.class);


		}
		
	
	
	
}
