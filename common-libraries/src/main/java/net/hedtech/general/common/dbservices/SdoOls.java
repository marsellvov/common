package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoOls {
		public static NString FdetermineClassification(NString openls,NString classificationCriterion,NString openlsVersion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.DETERMINE_CLASSIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OPENLS", openls);
			cmd.addParameter("@CLASSIFICATION_CRITERION", classificationCriterion);
			cmd.addParameter("@OPENLS_VERSION", openlsVersion);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static  Fextract( xml,NString xpath,NString ns) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.EXTRACT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@XML", xml);
//			cmd.addParameter("@XPATH", xpath);
//			cmd.addParameter("@NS", ns);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static NString Fextractvalue( xml,NString xpath,NString ns) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.EXTRACTVALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@XML", xml);
//			cmd.addParameter("@XPATH", xpath);
//			cmd.addParameter("@NS", ns);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static NString FgenerateError(NString openlsVersion,NString message,NString requestid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.GENERATE_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OPENLS_VERSION", openlsVersion);
			cmd.addParameter("@MESSAGE", message);
			cmd.addParameter("@REQUESTID", requestid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgenerateError(NString openlsVersion,NString requestid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.GENERATE_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OPENLS_VERSION", openlsVersion);
			cmd.addParameter("@REQUESTID", requestid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetbasisxml(NString nodeName,NString openlsVersion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.GETBASISXML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NODE_NAME", nodeName);
			cmd.addParameter("@OPENLS_VERSION", openlsVersion);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetns(NString nsshortcut,NString openlsversion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.GETNS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NSSHORTCUT", nsshortcut);
			cmd.addParameter("@OPENLSVERSION", openlsversion);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fgetns(NString openlsversion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.GETNS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OPENLSVERSION", openlsversion);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void handleOpenlsError(NString specificErrorMessage,NNumber specificErrorCode,NString defaultErrorMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.HANDLE_OPENLS_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SPECIFIC_ERROR_MESSAGE", specificErrorMessage);
			cmd.addParameter("@SPECIFIC_ERROR_CODE", specificErrorCode);
			cmd.addParameter("@DEFAULT_ERROR_MESSAGE", defaultErrorMessage);
				
			cmd.execute();


		}
		
		public static NString Fmakeopenls10request(NString request) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.MAKEOPENLS10REQUEST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@REQUEST", request);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fmakeopenlsclobrequest(NString request) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.MAKEOPENLSCLOBREQUEST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@REQUEST", request);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString  Fmakeopenlsrequest(NString request) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.MAKEOPENLSREQUEST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@REQUEST", request);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fmakeopenlssoaprequest(NString request) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.MAKEOPENLSSOAPREQUEST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@REQUEST", request);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void parseCoordPair(NString coords,Ref<NNumber> x,Ref<NNumber> y) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.PARSE_COORD_PAIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COORDS", coords);
			cmd.addParameter("@X", NNumber.class);
			cmd.addParameter("@Y", NNumber.class);
				
			cmd.execute();
			x.val = cmd.getParameterValue("@X", NNumber.class);
			y.val = cmd.getParameterValue("@Y", NNumber.class);


		}
		
		public static NString Fpostclob(NString url,NString payload) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.POSTCLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@URL", url);
			cmd.addParameter("@PAYLOAD", payload);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fpostxml(NString url,NString payload) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_OLS.POSTXML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@URL", url);
			cmd.addParameter("@PAYLOAD", payload);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
