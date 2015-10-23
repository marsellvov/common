package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbcmxml {
		public static NString fDecodeNameToken(NString paramNameIn,NString tokenIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.F_DECODE_NAME_TOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM_NAME_IN", paramNameIn);
			cmd.addParameter("@TOKEN_IN", tokenIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fErrorMessage(NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.F_ERROR_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFooterXml() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.F_FOOTER_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTokenParmVal(NString paramNameIn,NString tokenIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.F_GET_TOKEN_PARM_VAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARAM_NAME_IN", paramNameIn);
			cmd.addParameter("@TOKEN_IN", tokenIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHeaderXml() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.F_HEADER_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMessageXml(NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.F_MESSAGE_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fParamInTokenString(NString paramValueIn,NString tokenIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.F_PARAM_IN_TOKEN_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARAM_VALUE_IN", paramValueIn);
			cmd.addParameter("@TOKEN_IN", tokenIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAltprintclob(NString resultClob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.P_ALTPRINTCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_CLOB", resultClob);
				
			cmd.execute();


		}
		
		public static void pAltprintstr(NString resultStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.P_ALTPRINTSTR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_STR", resultStr);
				
			cmd.execute();


		}
		
		public static void pAppendxml(Ref<NString> pFinalInout,Ref<NString> pSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.P_APPENDXML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FINAL_INOUT", pFinalInout, true);
			cmd.addParameter("@P_SOURCE", pSource, true);
				
			cmd.execute();
			pFinalInout.val = cmd.getParameterValue("@P_FINAL_INOUT", NString.class);
			pSource.val = cmd.getParameterValue("@P_SOURCE", NString.class);


		}
		
		public static void pConvertclob(NString pResult,Ref<NString> myXml) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.P_CONVERTCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULT", pResult);
			cmd.addParameter("@MY_XML", NString.class);
				
			cmd.execute();
			myXml.val = cmd.getParameterValue("@MY_XML", NString.class);


		}
		
		public static void pGetXml(DataCursor pCursorRef,Ref<NString> pResultOut,NString pSetlabel,NString pGrouplabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.P_GET_XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURSOR_REF", DataCursor.class);
			cmd.addParameter("@P_RESULT_OUT", NString.class);
			cmd.addParameter("@P_SETLABEL", pSetlabel);
			cmd.addParameter("@P_GROUPLABEL", pGrouplabel);
				
			cmd.execute();
			pResultOut.val = cmd.getParameterValue("@P_RESULT_OUT", NString.class);


		}
		
		public static void pGetXml(NString pQuery,Ref<NString> pResultOut,NString pSetlabel,NString pGrouplabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.P_GET_XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_RESULT_OUT", NString.class);
			cmd.addParameter("@P_SETLABEL", pSetlabel);
			cmd.addParameter("@P_GROUPLABEL", pGrouplabel);
				
			cmd.execute();
			pResultOut.val = cmd.getParameterValue("@P_RESULT_OUT", NString.class);


		}
		
		public static void pInitXml(Ref<NString> pResultOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.P_INIT_XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULT_OUT", NString.class);
				
			cmd.execute();
			pResultOut.val = cmd.getParameterValue("@P_RESULT_OUT", NString.class);


		}
		
		public static void pPrintclob(NString pResult) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.P_PRINTCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULT", pResult);
				
			cmd.execute();


		}
		
		public static void pPrintstring(NString resultString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCMXML.P_PRINTSTRING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESULT_STRING", resultString);
				
			cmd.execute();


		}
		
	
	
	
}
