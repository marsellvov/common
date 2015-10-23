package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvpYrendTaxform {
		public static NNumber fCheckPdfOnly(NString pFormCode,NNumber pYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_CHECK_PDF_ONLY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FORM_CODE", pFormCode);
			cmd.addParameter("@P_YEAR", pYear);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGenToken(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_GEN_TOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOrgnCode(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_GET_ORGN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetPidmfrmtoken(NString pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_GET_PIDMFRMTOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetStringWithSpace(NString inString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_GET_STRING_WITH_SPACE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_STRING", inString);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetToken(NString pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_GET_TOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetUrl(NString pString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_GET_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetXml(NString pFormCode,NNumber pYear,NString pEmprCode,NNumber pPidm,NString pTypeCode,NString pDataSource,NString pEffectiveDate,NString pEmprCopy,NString pSequencenumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_GET_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FORM_CODE", pFormCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TYPE_CODE", pTypeCode);
			cmd.addParameter("@P_DATA_SOURCE", pDataSource);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EMPR_COPY", pEmprCopy);
			cmd.addParameter("@P_SEQUENCENUMBER", pSequencenumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetXsl(NString pFormCode,NNumber pYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_GET_XSL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FORM_CODE", pFormCode);
			cmd.addParameter("@P_YEAR", pYear);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fTotalcountdisplay(NNumber pPidm,NString pYear,NString pReportcode,NString pDatasource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_TOTALCOUNTDISPLAY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_REPORTCODE", pReportcode);
			cmd.addParameter("@P_DATASOURCE", pDatasource);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fValidateTimestamp(NString pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_VALIDATE_TIMESTAMP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidatedisplaydate(NNumber pPidm,NString pYear,NString pReporttype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.F_VALIDATEDISPLAYDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_REPORTTYPE", pReporttype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteParam(NNumber gPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.P_DELETE_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@G_PIDM", gPidm);
				
			cmd.execute();


		}
		
		public static void pInsertParam(NString pFormCode,NNumber pYear,NString pEmprCode,NNumber pPidm,NString pTypeCode,NString pDataSource,NDate pEffectiveDate,NNumber gPidm,NString pSortsequence) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVP_YREND_TAXFORM.P_INSERT_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_CODE", pFormCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TYPE_CODE", pTypeCode);
			cmd.addParameter("@P_DATA_SOURCE", pDataSource);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@G_PIDM", gPidm);
			cmd.addParameter("@P_SORTSEQUENCE", pSortsequence);
				
			cmd.execute();


		}
		
	
	
	
}
