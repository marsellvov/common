package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ffkatas {
		public static NString fAcctAttachAsset(NString pHeader,NString pAcctT,NString pDocCode,NNumber pItem,NDate pEffDT) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKATAS.F_ACCT_ATTACH_ASSET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HEADER", pHeader);
			cmd.addParameter("@P_ACCT_T", pAcctT);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_EFF_D_T", pEffDT);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCountAcctRec(NString pHeader,NString pAcctTable,NString pDocCode,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKATAS.F_COUNT_ACCT_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_HEADER", pHeader);
			cmd.addParameter("@P_ACCT_TABLE", pAcctTable);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fMixMatchAcct(NString pDocCode,NNumber pFarinvaItem,NDate pEffDT) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKATAS.F_MIX_MATCH_ACCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_FARINVA_ITEM", pFarinvaItem);
			cmd.addParameter("@P_EFF_D_T", pEffDT);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCheckAssetsDir(NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKATAS.P_CHECK_ASSETS_DIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();


		}
		
		public static void pCheckAssetsReg(NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKATAS.P_CHECK_ASSETS_REG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();


		}
		
		public static void pUpdateFfradja(NString dbmsSqlStmt,NString adjfFunction,NString updateable,Ref<NBool> returnValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKATAS.P_UPDATE_FFRADJA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DBMS_SQL_STMT", dbmsSqlStmt);
			cmd.addParameter("@ADJF_FUNCTION", adjfFunction);
			cmd.addParameter("@UPDATEABLE", updateable);
			cmd.addParameter("@RETURN_VALUE", returnValue, true);
				
			cmd.execute();
			returnValue.val = cmd.getParameterValue("@RETURN_VALUE", NBool.class);


		}
		
	
	
	
}
