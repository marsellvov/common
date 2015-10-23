package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlcxchn {
		public static NString fGetAdvDashCommonXml(NNumber pSpridenPidm,NString pTermCode,NString pSpridenId,NString pIdType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_GET_ADV_DASH_COMMON_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SPRIDEN_PIDM", pSpridenPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SPRIDEN_ID", pSpridenId);
			cmd.addParameter("@P_ID_TYPE", pIdType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAdvDashPidmXml(NString pBannerId,NString pTermCode,NString pSearchType,NNumber pAdvrPidm,NString pAdvrTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_GET_ADV_DASH_PIDM_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BANNER_ID", pBannerId);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SEARCH_TYPE", pSearchType);
			cmd.addParameter("@P_ADVR_PIDM", pAdvrPidm);
			cmd.addParameter("@P_ADVR_TERM", pAdvrTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAdvDashResult(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_GET_ADV_DASH_RESULT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAdvDashSearch(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_GET_ADV_DASH_SEARCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDashboardXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_GET_DASHBOARD_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetError(NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_GET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFacschXml(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_GET_FACSCH_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrdeAssign(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_GET_GRDE_ASSIGN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrdeAssignEdit(NString pDataToken) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_GET_GRDE_ASSIGN_EDIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATA_TOKEN", pDataToken);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNoDataMessage(NString pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_NO_DATA_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MESSAGE", pMessage);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStudentIdType(NNumber pPidm,NString pSearchType,NNumber pAdvrPidm,NString pAdvrTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCXCHN.F_STUDENT_ID_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEARCH_TYPE", pSearchType);
			cmd.addParameter("@P_ADVR_PIDM", pAdvrPidm);
			cmd.addParameter("@P_ADVR_TERM", pAdvrTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
