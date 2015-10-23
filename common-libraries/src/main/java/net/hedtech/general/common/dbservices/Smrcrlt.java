package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smrcrlt {
		public static void decodeSetSubset(NString prevSet,NNumber prevSub,NString curSet,NNumber curSub,Ref<NBool> openParen,Ref<NBool> firstReq,Ref<NString> setSub) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCRLT.DECODE_SET_SUBSET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREV_SET", prevSet);
			cmd.addParameter("@PREV_SUB", prevSub);
			cmd.addParameter("@CUR_SET", curSet);
			cmd.addParameter("@CUR_SUB", curSub);
			cmd.addParameter("@OPEN_PAREN", openParen, true);
			cmd.addParameter("@FIRST_REQ", firstReq, true);
			cmd.addParameter("@SET_SUB", NString.class);
				
			cmd.execute();
			openParen.val = cmd.getParameterValue("@OPEN_PAREN", NBool.class);
			firstReq.val = cmd.getParameterValue("@FIRST_REQ", NBool.class);
			setSub.val = cmd.getParameterValue("@SET_SUB", NString.class);


		}
		
		public static void pGetLabels(Ref<NString> pXmlClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCRLT.P_GET_LABELS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_XML_CLOB", pXmlClob, true);
				
			cmd.execute();
			pXmlClob.val = cmd.getParameterValue("@P_XML_CLOB", NString.class);


		}
		
		public static void pGetSmrcrlt(NNumber pidmIn,NNumber requestNoIn,NString stvcprtIn,Ref<NString> smrcrltClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCRLT.P_GET_SMRCRLT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQUEST_NO_IN", requestNoIn);
			cmd.addParameter("@STVCPRT_IN", stvcprtIn);
			cmd.addParameter("@SMRCRLT_CLOB", smrcrltClob, true);
				
			cmd.execute();
			smrcrltClob.val = cmd.getParameterValue("@SMRCRLT_CLOB", NString.class);


		}
		
		public static void pProcessSmrcrlt(NNumber pPidm,NNumber pRequestNo,NString pStvcprt,NString pSessionid,NString pUserId,NString pDataOrigin,NString pProcSessionid,NString pSaveXml,Ref<NString> pErrorOut,Ref<NString> smrcrltClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCRLT.P_PROCESS_SMRCRLT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
			cmd.addParameter("@P_STVCPRT", pStvcprt);
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PROC_SESSIONID", pProcSessionid);
			cmd.addParameter("@P_SAVE_XML", pSaveXml);
			cmd.addParameter("@P_ERROR_OUT", pErrorOut, true);
			cmd.addParameter("@SMRCRLT_CLOB", smrcrltClob, true);
				
			cmd.execute();
			pErrorOut.val = cmd.getParameterValue("@P_ERROR_OUT", NString.class);
			smrcrltClob.val = cmd.getParameterValue("@SMRCRLT_CLOB", NString.class);


		}
		
		public static void pShowxml(NNumber pPidm,NNumber pRequestNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCRLT.P_SHOWXML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
				
			cmd.execute();


		}
		
	
	
	
}
