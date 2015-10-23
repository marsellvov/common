package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Phkecrt {
		public static NString fGetMepCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_GET_MEP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetPopselIds(NString pPopselId,NString pPopselAppId,NString pPopselCreator,NString pPopselUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_GET_POPSEL_IDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_POPSEL_ID", pPopselId);
			cmd.addParameter("@P_POPSEL_APP_ID", pPopselAppId);
			cmd.addParameter("@P_POPSEL_CREATOR", pPopselCreator);
			cmd.addParameter("@P_POPSEL_USERID", pPopselUserid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fPayeventExists(NString pCoasCode,NString pEcpdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_PAYEVENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryReportIdByPeriod(NString pCoasCode,NString pEcpdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_QUERY_REPORT_ID_BY_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fRecreateEffortReportsEcls(NString pCoasCode,NString pEcpdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_RECREATE_EFFORT_REPORTS_ECLS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fRecreateEffortReportsPcls(NString pCoasCode,NString pEcpdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_RECREATE_EFFORT_REPORTS_PCLS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fReportExists(NString pCoasCode,NString pEcpdCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_REPORT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fSelNewEffortReportsEcls(NString pCoasCode,NString pEcpdCode,NString pProcessById,NNumber pOneupNumber,NString pUsePopsel,NString pPopselId,NString pPopselAppId,NString pPopselCreator,NString pPopselUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_SEL_NEW_EFFORT_REPORTS_ECLS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_PROCESS_BY_ID", pProcessById);
			cmd.addParameter("@P_ONEUP_NUMBER", pOneupNumber);
			cmd.addParameter("@P_USE_POPSEL", pUsePopsel);
			cmd.addParameter("@P_POPSEL_ID", pPopselId);
			cmd.addParameter("@P_POPSEL_APP_ID", pPopselAppId);
			cmd.addParameter("@P_POPSEL_CREATOR", pPopselCreator);
			cmd.addParameter("@P_POPSEL_USERID", pPopselUserid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelNewEffortReportsPcls(NString pCoasCode,NString pEcpdCode,NString pProcessById,NNumber pOneupNumber,NString pUsePopsel,NString pPopselId,NString pPopselAppId,NString pPopselCreator,NString pPopselUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_SEL_NEW_EFFORT_REPORTS_PCLS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_PROCESS_BY_ID", pProcessById);
			cmd.addParameter("@P_ONEUP_NUMBER", pOneupNumber);
			cmd.addParameter("@P_USE_POPSEL", pUsePopsel);
			cmd.addParameter("@P_POPSEL_ID", pPopselId);
			cmd.addParameter("@P_POPSEL_APP_ID", pPopselAppId);
			cmd.addParameter("@P_POPSEL_CREATOR", pPopselCreator);
			cmd.addParameter("@P_POPSEL_USERID", pPopselUserid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fSelUpdateEffortReports(NString pCoasCode,NString pEcpdCode,NString pProcessById,NNumber pOneupNumber,NString pUsePopsel,NString pPopselId,NString pPopselAppId,NString pPopselCreator,NString pPopselUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_SEL_UPDATE_EFFORT_REPORTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECPD_CODE", pEcpdCode);
			cmd.addParameter("@P_PROCESS_BY_ID", pProcessById);
			cmd.addParameter("@P_ONEUP_NUMBER", pOneupNumber);
			cmd.addParameter("@P_USE_POPSEL", pUsePopsel);
			cmd.addParameter("@P_POPSEL_ID", pPopselId);
			cmd.addParameter("@P_POPSEL_APP_ID", pPopselAppId);
			cmd.addParameter("@P_POPSEL_CREATOR", pPopselCreator);
			cmd.addParameter("@P_POPSEL_USERID", pPopselUserid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fString(NString pStringName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.F_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING_NAME", pStringName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteReport(NNumber pReportId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.P_DELETE_REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_ID", pReportId);
				
			cmd.execute();


		}
		
		public static void pGetEfcWebserviceUrl(Ref<NString> pWebserviceUrl,Ref<NString> pWebservicePswd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.P_GET_EFC_WEBSERVICE_URL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WEBSERVICE_URL", NString.class);
			cmd.addParameter("@P_WEBSERVICE_PSWD", NString.class);
				
			cmd.execute();
			pWebserviceUrl.val = cmd.getParameterValue("@P_WEBSERVICE_URL", NString.class);
			pWebservicePswd.val = cmd.getParameterValue("@P_WEBSERVICE_PSWD", NString.class);


		}
		
		public static void pRefreshEffortReports(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,Ref<NNumber> pUpdateCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKECRT.P_REFRESH_EFFORT_REPORTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_UPDATE_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pUpdateCountOut.val = cmd.getParameterValue("@P_UPDATE_COUNT_OUT", NNumber.class);


		}
		
	
	
	
}
