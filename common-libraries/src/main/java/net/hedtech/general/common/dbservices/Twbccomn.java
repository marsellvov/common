package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbccomn {
		public static NString fDelPrefXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_DEL_PREF_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEncodexml(NString stringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_ENCODEXML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAbout(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GET_ABOUT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetChnlXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GET_CHNL_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<PrefTabRow> fGetChnltoken(NString pStringIn,Ref<NNumber> pNumTok) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GET_CHNLTOKEN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<PrefTabRow>.class);
//			cmd.addParameter("@P_STRING_IN", pStringIn);
//			cmd.addParameter("@P_NUM_TOK", NNumber.class);
//				
//			cmd.execute();
//			pNumTok.val = cmd.getParameterValue("@P_NUM_TOK", NNumber.class);
//
//			return cmd.getReturnValue(List<PrefTabRow>.class);
//
//		}
		
		public static NString fGetDate(NDate pDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GET_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATE", pDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetHelp(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GET_HELP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLinetoken(NString pTokenIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GET_LINETOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TOKEN_IN", pTokenIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetPref(NString pBannerid,NString pChannelName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GET_PREF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BANNERID", pBannerid);
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fGetPrefUser(NString pChannelName,NString pBannerid,NString pGroup,NString pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GET_PREF_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CHANNEL_NAME", pChannelName);
			cmd.addParameter("@P_BANNERID", pBannerid);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPrefXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GET_PREF_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTime(NString pTime) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GET_TIME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TIME", pTime);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetparam(NNumber pPidm,NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_GETPARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSetPrefXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBCCOMN.F_SET_PREF_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	@DbRecordType(id="PrefRecRow", dataSourceName="PREF_REC")
	public static class PrefRecRow
	{
		@DbRecordField(dataSourceName="R_GROUP")
		public NString RGroup;
		@DbRecordField(dataSourceName="R_KEY")
		public NString RKey;
		@DbRecordField(dataSourceName="R_STRING")
		public NString RString;
		@DbRecordField(dataSourceName="R_VALUE")
		public NString RValue;
		@DbRecordField(dataSourceName="R_EDIT")
		public NString REdit;
		@DbRecordField(dataSourceName="R_SORT_ORDER")
		public NNumber RSortOrder;
	}

	
	
}
