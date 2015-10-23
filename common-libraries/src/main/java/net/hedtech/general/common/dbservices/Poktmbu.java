package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Poktmbu {
		public static void pActivateBulk(NNumber pBulkId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKTMBU.P_ACTIVATE_BULK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BULK_ID", pBulkId);
				
			cmd.execute();


		}
		
		public static void pCreateBulkAttribute(NNumber pBulkDetailId,NString pAttributeName,NString pAttributeValue,Ref<NNumber> pIdOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKTMBU.P_CREATE_BULK_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BULK_DETAIL_ID", pBulkDetailId);
			cmd.addParameter("@P_ATTRIBUTE_NAME", pAttributeName);
			cmd.addParameter("@P_ATTRIBUTE_VALUE", pAttributeValue);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);


		}
		
		public static void pCreateBulkAttribute(NNumber pBulkDetailId,NString pAttributeName,NNumber pAttributeValue,Ref<NNumber> pIdOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKTMBU.P_CREATE_BULK_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BULK_DETAIL_ID", pBulkDetailId);
			cmd.addParameter("@P_ATTRIBUTE_NAME", pAttributeName);
			cmd.addParameter("@P_ATTRIBUTE_VALUE", pAttributeValue);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);


		}
		
		public static void pCreateBulkAttribute(NNumber pBulkDetailId,NString pAttributeName,NDate pAttributeValue,Ref<NNumber> pIdOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKTMBU.P_CREATE_BULK_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BULK_DETAIL_ID", pBulkDetailId);
			cmd.addParameter("@P_ATTRIBUTE_NAME", pAttributeName);
			cmd.addParameter("@P_ATTRIBUTE_VALUE", pAttributeValue);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);


		}
		
		public static void pCreateBulkDetail(NNumber pBulkId,NString pDescription,Ref<NNumber> pIdOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKTMBU.P_CREATE_BULK_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BULK_ID", pBulkId);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);


		}
		
		public static void pCreateBulkHeader(NString pDescription,NString pServiceEventName,Ref<NNumber> pIdOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKTMBU.P_CREATE_BULK_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_SERVICE_EVENT_NAME", pServiceEventName);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);


		}
		
	
	
	
}
