package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.dbtypes.WtRecRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkwinp {
		public static NBool fExportService(NString pServiceCode,NString pReleaseYear,NString pDirectory,Ref<NString> pMessageOut,NString pOperationName,NString pDataOrigin,NString pServiceCodeNew,NString pAddFeatures) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINP.F_EXPORT_SERVICE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SERVICE_CODE", pServiceCode);
			cmd.addParameter("@P_RELEASE_YEAR", pReleaseYear);
			cmd.addParameter("@P_DIRECTORY", pDirectory);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
			cmd.addParameter("@P_OPERATION_NAME", pOperationName);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SERVICE_CODE_NEW", pServiceCodeNew);
			cmd.addParameter("@P_ADD_FEATURES", pAddFeatures);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NInteger fGetPortCount(Gkkwwsp.WsdlDocRow pWsdlHandle,NInteger pServiceIndex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINP.F_GET_PORT_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter(DbTypes.createStructType("P_WSDL_HANDLE", pWsdlHandle, Gkkwwsp.WsdlDocRow.class ));
			cmd.addParameter("@P_SERVICE_INDEX", pServiceIndex);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static GkbwsdeTabType fGetPortLocnUris(Gkkwwsp.WsdlDocRow pWsdlHandle,NInteger pServiceIndex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINP.F_GET_PORT_LOCN_URIS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(GkbwsdeTabType.class);
			cmd.addParameter(DbTypes.createStructType("P_WSDL_HANDLE", pWsdlHandle, Gkkwwsp.WsdlDocRow.class ));
			cmd.addParameter("@P_SERVICE_INDEX", pServiceIndex);
				
			cmd.execute();

			return cmd.getReturnValue(GkbwsdeTabType.class);

		}
		
		public static GkbwsdeTabType fGetPortNames(Gkkwwsp.WsdlDocRow pWsdlHandle,NInteger pServiceIndex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINP.F_GET_PORT_NAMES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(GkbwsdeTabType.class);
			cmd.addParameter(DbTypes.createStructType("P_WSDL_HANDLE", pWsdlHandle, Gkkwwsp.WsdlDocRow.class ));
			cmd.addParameter("@P_SERVICE_INDEX", pServiceIndex);
				
			cmd.execute();

			return cmd.getReturnValue(GkbwsdeTabType.class);

		}
		
		public static NInteger fGetServiceCount(Gkkwwsp.WsdlDocRow pWsdlHandle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINP.F_GET_SERVICE_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter(DbTypes.createStructType("P_WSDL_HANDLE", pWsdlHandle, Gkkwwsp.WsdlDocRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static GkbwsdeTabType fGetServiceNames(Gkkwwsp.WsdlDocRow pWsdlHandle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINP.F_GET_SERVICE_NAMES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(GkbwsdeTabType.class);
			cmd.addParameter(DbTypes.createStructType("P_WSDL_HANDLE", pWsdlHandle, Gkkwwsp.WsdlDocRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(GkbwsdeTabType.class);

		}
		
		public static Gkkwwsp.WsdlDocRow fGetWsdlHandle(NString pDirName,NString pWsdlFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINP.F_GET_WSDL_HANDLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(Gkkwwsp.WsdlDocRow.class));
			cmd.addParameter("@P_DIR_NAME", pDirName);
			cmd.addParameter("@P_WSDL_FILE_NAME", pWsdlFileName);
				
			cmd.execute();

			return cmd.getReturnValue(Gkkwwsp.WsdlDocRow.class);

		}
		public static NNumber fSaveService(NString pServiceCode,Gkkwwsp.WsdlDocRow pWsdlHandle,NInteger pServiceIndex,NInteger pPortIndex) {
			return fSaveService(pServiceCode, pWsdlHandle, pServiceIndex, pPortIndex, NString.getNull(), NString.getNull());
		} 
		
		public static NNumber fSaveService(NString pServiceCode,Gkkwwsp.WsdlDocRow pWsdlHandle,NInteger pServiceIndex,NInteger pPortIndex,NString pWalletPath,NString pWalletPwd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINP.F_SAVE_SERVICE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_SERVICE_CODE", pServiceCode);
			cmd.addParameter(DbTypes.createStructType("P_WSDL_HANDLE", pWsdlHandle, Gkkwwsp.WsdlDocRow.class ));
			cmd.addParameter("@P_SERVICE_INDEX", pServiceIndex);
			cmd.addParameter("@P_PORT_INDEX", pPortIndex);
			cmd.addParameter("@P_WALLET_PATH", pWalletPath);
			cmd.addParameter("@P_WALLET_PWD", pWalletPwd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fTransferProcesses(NNumber pOldWsdeId,NNumber pNewWsdeId,Ref<NString> pMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINP.F_TRANSFER_PROCESSES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_OLD_WSDE_ID", pOldWsdeId);
			cmd.addParameter("@P_NEW_WSDE_ID", pNewWsdeId);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pUpdateService(NNumber pWsdeId,NString pWsdeName,NString pActiveInd,NString pWsdePortName,NString pWsdePortLocnUri,NString pWalletPath,NString pWalletPwd,NString pProxy,NString pNoProxyDomains,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINP.P_UPDATE_SERVICE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WSDE_ID", pWsdeId);
			cmd.addParameter("@P_WSDE_NAME", pWsdeName);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_WSDE_PORT_NAME", pWsdePortName);
			cmd.addParameter("@P_WSDE_PORT_LOCN_URI", pWsdePortLocnUri);
			cmd.addParameter("@P_WALLET_PATH", pWalletPath);
			cmd.addParameter("@P_WALLET_PWD", pWalletPwd);
			cmd.addParameter("@P_PROXY", pProxy);
			cmd.addParameter("@P_NO_PROXY_DOMAINS", pNoProxyDomains);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
		@DbTableType(id = "Gkkwinp.GkbwsdeTabType", dataSourceName = "gkkwinp.GKBWSDE_NAME_TABTYPE", indexed = true)
		public static class GkbwsdeTabType extends Table<NString> {

			// test
			public GkbwsdeTabType() {
				super();
			}

			@Override
			protected NString newValue() {
				return new NString();
			}
		}

	
}
