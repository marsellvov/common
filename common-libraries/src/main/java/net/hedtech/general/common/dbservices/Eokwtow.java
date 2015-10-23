package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokwtow {
		public static NString fEncodeurl(NString urlIn,NNumber encodeMode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKWTOW.F_ENCODEURL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@URL_IN", urlIn);
			cmd.addParameter("@ENCODE_MODE", encodeMode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetDocCountFromWx(NString wxUrlStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKWTOW.F_GET_DOC_COUNT_FROM_WX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@WX_URL_STR", wxUrlStr);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetbaseurl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKWTOW.F_GETBASEURL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetencryptedurl(NString username,NString password,NString encryptionKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKWTOW.F_GETENCRYPTEDURL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERNAME", username);
			cmd.addParameter("@PASSWORD", password);
			cmd.addParameter("@ENCRYPTION_KEY", encryptionKey);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetquerystr(Paramtab param) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKWTOW.F_GETQUERYSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.getCollectionType("PARAM", param, Paramtab.class, false)); 
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetwxurl(Paramtab paramlist) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKWTOW.F_GETWXURL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.getCollectionType("PARAMLIST", paramlist, Paramtab.class, false));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetuserinfo(Ref<NString> username,Ref<NString> password,Ref<NString> encryptionKey,Ref<NString> pipename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKWTOW.P_GETUSERINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME", NString.class);
			cmd.addParameter("@PASSWORD", NString.class);
			cmd.addParameter("@ENCRYPTION_KEY", NString.class);
			cmd.addParameter("@PIPENAME", NString.class);
				
			cmd.execute();
			username.val = cmd.getParameterValue("@USERNAME", NString.class);
			password.val = cmd.getParameterValue("@PASSWORD", NString.class);
			encryptionKey.val = cmd.getParameterValue("@ENCRYPTION_KEY", NString.class);
			pipename.val = cmd.getParameterValue("@PIPENAME", NString.class);


		}
		
		public static void pPurgebxspipe() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKWTOW.P_PURGEBXSPIPE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSendencryptedurl(NString pipename,NString url) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKWTOW.P_SENDENCRYPTEDURL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIPENAME", pipename);
			cmd.addParameter("@URL", url);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TParampairRow", dataSourceName="T_PARAMPAIR")
	public static class TParampairRow
	{
		@DbRecordField(dataSourceName="PARAMNAME")
		public NString Paramname;
		@DbRecordField(dataSourceName="PARAMVALUE")
		public NString Paramvalue;
	}

	@DbTableType(id="Eokwtow.Paramtab", dataSourceName="EOKWTOW.PARAMTAB", indexed=true)
	public static class Paramtab extends Table<TParampairRow> {
		
		@Override
		protected TParampairRow newValue(){
			return new TParampairRow();
		}
	}
	
	
	
}
