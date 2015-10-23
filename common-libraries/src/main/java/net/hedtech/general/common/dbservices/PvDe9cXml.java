package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvDe9cXml {
		public static NString fGetpBatch(NString pYear,NNumber pQuarter,NString pWagePlancode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_XML.F_GETP_BATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_WAGE_PLANCODE", pWagePlancode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetsizeLob() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_XML.F_GETSIZE_LOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fReadLob(Ref<NNumber> pAmount,NNumber pOffset) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_XML.F_READ_LOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AMOUNT", pAmount, true);
			cmd.addParameter("@P_OFFSET", pOffset);
				
			cmd.execute();
			pAmount.val = cmd.getParameterValue("@P_AMOUNT", NNumber.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRetrieveXmlWithoutheader(NString pBatch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_XML.F_RETRIEVE_XML_WITHOUTHEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BATCH", pBatch);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreateLob() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_XML.P_CREATE_LOB", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCreateXml(NString pYear,NNumber pQuarter,NString pWagePlancode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_XML.P_CREATE_XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_WAGE_PLANCODE", pWagePlancode);
				
			cmd.execute();


		}
		
		public static void pFreeLob() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_XML.P_FREE_LOB", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pWriteLob(NString pLob) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_XML.P_WRITE_LOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOB", pLob);
				
			cmd.execute();


		}
		
	
	
	
}
