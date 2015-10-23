package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkpsql {
		public static NNumber Factionaccess(NString pprocess,NString paction,NString puser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.ACTIONACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PPROCESS", pprocess);
			cmd.addParameter("@PACTION", paction);
			cmd.addParameter("@PUSER", puser);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Factionsdefined(NString pprofile,NString pprocess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.ACTIONSDEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PPROFILE", pprofile);
			cmd.addParameter("@PPROCESS", pprocess);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static ApiColumntypeRow FapiExecuterule(NString pprocess,NString prule,NString pparameters,NString pdelimiter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.API_EXECUTERULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(ApiColumntypeRow.class));
			cmd.addParameter("@PPROCESS", pprocess);
			cmd.addParameter("@PRULE", prule);
			cmd.addParameter("@PPARAMETERS", pparameters);
			cmd.addParameter("@PDELIMITER", pdelimiter);
				
			cmd.execute();

			return cmd.getReturnValue(ApiColumntypeRow.class);

		}
		
		public static void apiExecuteruleset(NString pprocess,NString pruleset,NString prulesetparameters,NString pdelimiter,NString pexecutionmode,NNumber pexceptionmode,NNumber pdiagnosticseverity,Ref<NNumber> prunsequencenum,Ref<NString> pmessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.API_EXECUTERULESET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PPROCESS", pprocess);
			cmd.addParameter("@PRULESET", pruleset);
			cmd.addParameter("@PRULESETPARAMETERS", prulesetparameters);
			cmd.addParameter("@PDELIMITER", pdelimiter);
			cmd.addParameter("@PEXECUTIONMODE", pexecutionmode);
			cmd.addParameter("@PEXCEPTIONMODE", pexceptionmode);
			cmd.addParameter("@PDIAGNOSTICSEVERITY", pdiagnosticseverity);
			cmd.addParameter("@PRUNSEQUENCENUM", NNumber.class);
			cmd.addParameter("@PMESSAGE", NString.class);
				
			cmd.execute();
			prunsequencenum.val = cmd.getParameterValue("@PRUNSEQUENCENUM", NNumber.class);
			pmessage.val = cmd.getParameterValue("@PMESSAGE", NString.class);


		}
		
		public static void apiRetrievecolumnvalue(NInteger pcolumnnumber,NString pcolumnname,NString pcolumnabbr,Ref<ApiColumntypeRow> papicolumn,Ref<NString> perrormessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.API_RETRIEVECOLUMNVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PCOLUMNNUMBER", pcolumnnumber);
			cmd.addParameter("@PCOLUMNNAME", pcolumnname);
			cmd.addParameter("@PCOLUMNABBR", pcolumnabbr);
			cmd.addParameter(DbTypes.createStructType("PAPICOLUMN", papicolumn.val, ApiColumntypeRow.class));
			cmd.addParameter("@PERRORMESSAGE", NString.class);
				
			cmd.execute();
			papicolumn.val = cmd.getParameterValue("@PAPICOLUMN", ApiColumntypeRow.class);
			perrormessage.val = cmd.getParameterValue("@PERRORMESSAGE", NString.class);


		}
		
		public static void apiRetrieveexecutionmode(Ref<NString> pexecutionmode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.API_RETRIEVEEXECUTIONMODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PEXECUTIONMODE", NString.class);
				
			cmd.execute();
			pexecutionmode.val = cmd.getParameterValue("@PEXECUTIONMODE", NString.class);


		}
		
		public static NString FapiRetrieveprocesscode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.API_RETRIEVEPROCESSCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FapiRetrieverulesetcode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.API_RETRIEVERULESETCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void apiRetrieverulesetparameter(NString pparametername,Ref<NString> pparametervalue,Ref<NString> perrormessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.API_RETRIEVERULESETPARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PPARAMETERNAME", pparametername);
			cmd.addParameter("@PPARAMETERVALUE", NString.class);
			cmd.addParameter("@PERRORMESSAGE", NString.class);
				
			cmd.execute();
			pparametervalue.val = cmd.getParameterValue("@PPARAMETERVALUE", NString.class);
			perrormessage.val = cmd.getParameterValue("@PERRORMESSAGE", NString.class);


		}
		
		public static NNumber FapiRetrieverunsequence() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.API_RETRIEVERUNSEQUENCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void autodelete() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.AUTODELETE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void autopopulate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.AUTOPOPULATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString Fcollatetext(NString psqlstatement,NString pdelimiter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.COLLATETEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PSQLSTATEMENT", psqlstatement);
			cmd.addParameter("@PDELIMITER", pdelimiter);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void executeruleset(NString pprocess,NString pruleset,NNumber prunsequencenum,NString pexecutionmode,NNumber pexceptionmode,NNumber pdiagnosticseverity,Ref<NString> pmessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.EXECUTERULESET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PPROCESS", pprocess);
			cmd.addParameter("@PRULESET", pruleset);
			cmd.addParameter("@PRUNSEQUENCENUM", prunsequencenum);
			cmd.addParameter("@PEXECUTIONMODE", pexecutionmode);
			cmd.addParameter("@PEXCEPTIONMODE", pexceptionmode);
			cmd.addParameter("@PDIAGNOSTICSEVERITY", pdiagnosticseverity);
			cmd.addParameter("@PMESSAGE", NString.class);
				
			cmd.execute();
			pmessage.val = cmd.getParameterValue("@PMESSAGE", NString.class);


		}
		
		public static NString Fmergevariables(NString pvariabletext,NString pdelimiter,NString pboilerplate,NString pplaceholdertemplate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.MERGEVARIABLES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PVARIABLETEXT", pvariabletext);
			cmd.addParameter("@PDELIMITER", pdelimiter);
			cmd.addParameter("@PBOILERPLATE", pboilerplate);
			cmd.addParameter("@PPLACEHOLDERTEMPLATE", pplaceholdertemplate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber Fprocessaccess(NString pprocess,NString puser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.PROCESSACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PPROCESS", pprocess);
			cmd.addParameter("@PUSER", puser);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fprofilesdefined() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.PROFILESDEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fruleaccess(NString pprocess,NString prule,NString puser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.RULEACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PPROCESS", pprocess);
			cmd.addParameter("@PRULE", prule);
			cmd.addParameter("@PUSER", puser);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Frulesdefined(NString pprofile,NString pprocess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.RULESDEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PPROFILE", pprofile);
			cmd.addParameter("@PPROCESS", pprocess);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Frulesetaccess(NString pprocess,NString pruleset,NString puser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.RULESETACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PPROCESS", pprocess);
			cmd.addParameter("@PRULESET", pruleset);
			cmd.addParameter("@PUSER", puser);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void sendmail() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.SENDMAIL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString Fversion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void writediagnostictodb(NNumber pdiagnosticseverity,NString pdiagnosticinfo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKPSQL.WRITEDIAGNOSTICTODB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PDIAGNOSTICSEVERITY", pdiagnosticseverity);
			cmd.addParameter("@PDIAGNOSTICINFO", pdiagnosticinfo);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ApiColumntypeRow", dataSourceName="API_COLUMNTYPE")
	public static class ApiColumntypeRow
	{
		@DbRecordField(dataSourceName="VARCHAR2VALUE")
		public NString Varchar2value;
		@DbRecordField(dataSourceName="NUMBERVALUE")
		public NNumber Numbervalue;
		@DbRecordField(dataSourceName="LONGVALUE")
		public NString Longvalue;
		@DbRecordField(dataSourceName="ROWIDVALUE")
		public UnknownTypes.Rowid Rowidvalue;
		@DbRecordField(dataSourceName="DATEVALUE")
		public NDate Datevalue;
		@DbRecordField(dataSourceName="CLOBVALUE")
		public NString Clobvalue;
		@DbRecordField(dataSourceName="BLOBVALUE")
		public UnknownTypes.Blob Blobvalue;
	}

	
	
}
