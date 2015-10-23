package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rekci04 {
		public static NString fGetXmlAttribute(NString xpath,NString filename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI04.F_GET_XML_ATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@XPATH", xpath);
			cmd.addParameter("@FILENAME", filename);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetXmlDocument(NString filename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI04.F_GET_XML_DOCUMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FILENAME", filename);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetXmlText(NString xpath,NString filename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI04.F_GET_XML_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@XPATH", xpath);
			cmd.addParameter("@FILENAME", filename);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pImportxml(NString docid,NString awardtype,NString aidycode,NString xpath,NString filename,NNumber occ) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("REKCI04.P_IMPORTXML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCID", docid);
			cmd.addParameter("@AWARDTYPE", awardtype);
			cmd.addParameter("@AIDYCODE", aidycode);
			cmd.addParameter("@XPATH", xpath);
			cmd.addParameter("@FILENAME", filename);
			cmd.addParameter("@OCC", occ);
				
			cmd.execute();


		}
		
	
	
	
}
