package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkspgb {
		public static void deleteSsenpage(NString page_) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.DELETE_SSENPAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAGE", page_);
				
			cmd.execute();


		}
		
//		public static List<OtTextsRow> fExportApp(NString pTopSaotCode,NString pTopId,NString pSaotCode,NString pId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.F_EXPORT_APP", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<OtTextsRow>.class);
//			cmd.addParameter("@P_TOP_SAOT_CODE", pTopSaotCode);
//			cmd.addParameter("@P_TOP_ID", pTopId);
//			cmd.addParameter("@P_SAOT_CODE", pSaotCode);
//			cmd.addParameter("@P_ID", pId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<OtTextsRow>.class);
//
//		}
		
//		public static List<OtTextsRow> fExportPage(NString pPageId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.F_EXPORT_PAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<OtTextsRow>.class);
//			cmd.addParameter("@P_PAGE_ID", pPageId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<OtTextsRow>.class);
//
//		}
		
//		public static List<Varchar> fGetProperties(NString pPageid,NString pOtname,NString pOid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.F_GET_PROPERTIES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<Varchar>.class);
//			cmd.addParameter("@P_PAGEID", pPageid);
//			cmd.addParameter("@P_OTNAME", pOtname);
//			cmd.addParameter("@P_OID", pOid);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<Varchar>.class);
//
//		}
		
		public static void pAppendClob(Ref<NString> vClob,NString vBuf) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.P_APPEND_CLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_CLOB", vClob, true);
			cmd.addParameter("@V_BUF", vBuf);
				
			cmd.execute();
			vClob.val = cmd.getParameterValue("@V_CLOB", NString.class);


		}
		
//		public static void pAppendClob(Ref<NString> vClob,NString vBuf) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.P_APPEND_CLOB", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@V_CLOB", vClob, true);
//			cmd.addParameter("@V_BUF", vBuf);
//				
//			cmd.execute();
//			vClob.val = cmd.getParameterValue("@V_CLOB", NString.class);
//
//
//		}
		
		public static void pCompilePage(NString pPageid,NNumber pDebuglevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.P_COMPILE_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAGEID", pPageid);
			cmd.addParameter("@P_DEBUGLEVEL", pDebuglevel);
				
			cmd.execute();


		}
		
		public static void pDeleteAppObjInst(NString pTopObjectType,NString pTopObjectId,NString pObjectType,NString pObjectId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.P_DELETE_APP_OBJ_INST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TOP_OBJECT_TYPE", pTopObjectType);
			cmd.addParameter("@P_TOP_OBJECT_ID", pTopObjectId);
			cmd.addParameter("@P_OBJECT_TYPE", pObjectType);
			cmd.addParameter("@P_OBJECT_ID", pObjectId);
				
			cmd.execute();


		}
		
		public static void pInit(NString pAuditTrail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.P_INIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AUDIT_TRAIL", pAuditTrail);
				
			cmd.execute();


		}
		
		public static void pProcessAppObject() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.P_PROCESS_APP_OBJECT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setAppPropInst(NString pTopObjectType,NString pTopObjectId,NString pObjectType,NString pObjectId,NString pPropCode,NString pDatatype,NString pVal,NString pUser,Ref<NString> vRecrowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.SET_APP_PROP_INST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TOP_OBJECT_TYPE", pTopObjectType);
			cmd.addParameter("@P_TOP_OBJECT_ID", pTopObjectId);
			cmd.addParameter("@P_OBJECT_TYPE", pObjectType);
			cmd.addParameter("@P_OBJECT_ID", pObjectId);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_DATATYPE", pDatatype);
			cmd.addParameter("@P_VAL", pVal);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@V_RECROWID", vRecrowid, true);
				
			cmd.execute();
			vRecrowid.val = cmd.getParameterValue("@V_RECROWID", NString.class);


		}
		
		public static void setPropInst(NString pPageid,NString pOtname,NString pOid,NString pPtname,NString pDatatype,NString pVal,NString pUser,Ref<NString> vRecrowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.SET_PROP_INST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAGEID", pPageid);
			cmd.addParameter("@P_OTNAME", pOtname);
			cmd.addParameter("@P_OID", pOid);
			cmd.addParameter("@P_PTNAME", pPtname);
			cmd.addParameter("@P_DATATYPE", pDatatype);
			cmd.addParameter("@P_VAL", pVal);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@V_RECROWID", vRecrowid, true);
				
			cmd.execute();
			vRecrowid.val = cmd.getParameterValue("@V_RECROWID", NString.class);


		}
		
		public static NString Fversion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKSPGB.VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
