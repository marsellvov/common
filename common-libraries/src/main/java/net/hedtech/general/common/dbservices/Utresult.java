package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utresult {
		public static NBool failure(NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.FAILURE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void firstresult(NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.FIRSTRESULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();


		}
		
		public static void ignoreSuccesses() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.IGNORE_SUCCESSES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void includeSuccesses() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.INCLUDE_SUCCESSES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void init(NBool fromSuiteIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.INIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FROM_SUITE_IN", fromSuiteIn);
				
			cmd.execute();


		}
		
		public static ResultRtRow Fnextresult(NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.NEXTRESULT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(ResultRtRow.class));
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(ResultRtRow.class);

		}
		
		public static void nextresult(Ref<NString> nameOut,Ref<NString> msgOut,Ref<NInteger> caseIndxOut,NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.NEXTRESULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_OUT", NString.class);
			cmd.addParameter("@MSG_OUT", NString.class);
			cmd.addParameter("@CASE_INDX_OUT", NInteger.class);
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();
			nameOut.val = cmd.getParameterValue("@NAME_OUT", NString.class);
			msgOut.val = cmd.getParameterValue("@MSG_OUT", NString.class);
			caseIndxOut.val = cmd.getParameterValue("@CASE_INDX_OUT", NInteger.class);


		}
		
		public static ResultRtRow Fnthresult(NInteger indxIn,NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.NTHRESULT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(ResultRtRow.class));
			cmd.addParameter("@INDX_IN", indxIn);
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(ResultRtRow.class);

		}
		
		public static void nthresult(NInteger indxIn,Ref<NString> nameOut,Ref<NString> msgOut,Ref<NInteger> caseIndxOut,NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.NTHRESULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDX_IN", indxIn);
			cmd.addParameter("@NAME_OUT", NString.class);
			cmd.addParameter("@MSG_OUT", NString.class);
			cmd.addParameter("@CASE_INDX_OUT", NInteger.class);
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();
			nameOut.val = cmd.getParameterValue("@NAME_OUT", NString.class);
			msgOut.val = cmd.getParameterValue("@MSG_OUT", NString.class);
			caseIndxOut.val = cmd.getParameterValue("@CASE_INDX_OUT", NInteger.class);


		}
		
		public static void report(NString msgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG_IN", msgIn);
				
			cmd.execute();


		}
		
		public static NInteger Fresultcount(NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.RESULTCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void show(NNumber runIdIn,NBool resetIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.SHOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@RESET_IN", resetIn);
				
			cmd.execute();


		}
		
		public static void showlast(NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.SHOWLAST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();


		}
		
		public static void showone(NNumber runIdIn,NInteger indxIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.SHOWONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RUN_ID_IN", runIdIn);
			cmd.addParameter("@INDX_IN", indxIn);
				
			cmd.execute();


		}
		
		public static NBool Fsuccess(NNumber runIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTRESULT.SUCCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@RUN_ID_IN", runIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	@DbRecordType(id="ResultRtRow", dataSourceName="RESULT_RT")
	public static class ResultRtRow
	{
		@DbRecordField(dataSourceName="NAME")
		public NString _Name;
		@DbRecordField(dataSourceName="MSG")
		public NString Msg;
		@DbRecordField(dataSourceName="INDX")
		public NInteger Indx;
		@DbRecordField(dataSourceName="STATUS")
		public NBool Status;
	}

	
	
}
