package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GvEmailServer {
	
	public static NInteger fApiVersion() {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_SERVER.F_API_VERSION", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NInteger.class);
			
		cmd.execute();

		return cmd.getReturnValue(NInteger.class);

	}
	
	public static NString fExists(NString pHostCode,NString pRowid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_SERVER.F_EXISTS", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(NString.class);
		cmd.addParameter("@P_HOST_CODE", pHostCode);
		cmd.addParameter("@P_ROWID", pRowid);
			
		cmd.execute();

		return cmd.getReturnValue(NString.class);

	}

	public static Cursor fQueryAll(NString pHostCode) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_SERVER.F_QUERY_ALL", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_HOST_CODE", pHostCode);
			
		cmd.execute();

		return cmd.getReturnValue(Cursor.class);

	}

	public static DataCursor fQueryByRowid(NString pRowid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_SERVER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_ROWID", pRowid);
			
		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	
	public static DataCursor fQueryOne(NNumber pPidm,NString pEmalCode,NString pEmailAddress) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_SERVER.F_QUERY_ONE", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_HOST_CODE", pEmalCode);
			
		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);

	}

	
	public static DataCursor fQueryOneLock(NString pHostCode,NString pRowid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_SERVER.F_EXISTS", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DataCursor.class);
		cmd.addParameter("@P_HOST_CODE", pHostCode);
		cmd.addParameter("@P_ROWID", pRowid);
			
		cmd.execute();

		return cmd.getReturnValue(DataCursor.class);
	
	}

	
	public static void pCreate(NString pHostCode,NNumber pPort,NString pDomain,NString pUserId,NString pDataOrigin,Ref<byte[]> pRowidOut) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_SERVER.P_CREATE", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@P_HOST_CODE", pHostCode);
		cmd.addParameter("@P_PORT", pPort);
		cmd.addParameter("@P_DOMAIN", pDomain);
		cmd.addParameter("@P_USER_ID", pUserId);
		cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
		cmd.addParameter("@P_ROWID_OUT", NString.class);
			
		cmd.execute();
		pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


	}

	
	public static void pDelete(NString pHostCode,java.sql.RowId pRowid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_SERVER.P_DELETE", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@P_HOST_CODE", pHostCode);
		cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
			
		cmd.execute();

	}

	
	public static void pLock(NString pHostCode,Ref<NString> pRowidInout) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_SERVER.P_LOCK", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@P_HOST_CODE", pHostCode);
		cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
			
		cmd.execute();
		pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


	}

	
	public static void pUpdate(NString pHostCode,NNumber pPort,NString pDomain,NString pUserId,NString pDataOrigin,java.sql.RowId pRowid) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_SERVER.P_UPDATE", DbManager.getDataBaseFactory());
		
		cmd.addParameter("@P_HOST_CODE", pHostCode);
		cmd.addParameter("@P_PORT", pPort);
		cmd.addParameter("@P_DOMAIN", pDomain);
		cmd.addParameter("@P_USER_ID", pUserId);
		cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
		cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
			
		cmd.execute();


	}
	
}
