package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Goksvex {
		public static NNumber fCheckForNewBatch(NString schoolcode,NString programnumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.F_CHECK_FOR_NEW_BATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SCHOOLCODE", schoolcode);
			cmd.addParameter("@PROGRAMNUMBER", programnumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fCheckForValidBatch(NString batchid,NNumber numofsevistarejects,NNumber numofsevisrejects) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.F_CHECK_FOR_VALID_BATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@BATCHID", batchid);
			cmd.addParameter("@NUMOFSEVISTAREJECTS", numofsevistarejects);
			cmd.addParameter("@NUMOFSEVISREJECTS", numofsevisrejects);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckSvelCancel(NString requestedid,Ref<NNumber> pidm,Ref<NNumber> seqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.F_CHECK_SVEL_CANCEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@REQUESTEDID", requestedid);
			cmd.addParameter("@PIDM", NNumber.class);
			cmd.addParameter("@SEQNO", NNumber.class);
				
			cmd.execute();
			pidm.val = cmd.getParameterValue("@PIDM", NNumber.class);
			seqno.val = cmd.getParameterValue("@SEQNO", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pBackfillGobsevs(NNumber pidm,NNumber seqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.P_BACKFILL_GOBSEVS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
				
			cmd.execute();


		}
		
		public static void pGetBatchHeader(NString schoolcode,NString programnumber,Ref<DataCursor> batchidcursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.P_GET_BATCH_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SCHOOLCODE", schoolcode);
			cmd.addParameter("@PROGRAMNUMBER", programnumber);
			cmd.addParameter("@BATCHIDCURSOR", DataCursor.class);
				
			cmd.execute();
			batchidcursor.val = cmd.getParameterValue("@BATCHIDCURSOR", DataCursor.class);


		}
		
		public static void pGetSevisRecords(NString batchid,Ref<DataCursor> sevisreccursor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.P_GET_SEVIS_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BATCHID", batchid);
			cmd.addParameter("@SEVISRECCURSOR", DataCursor.class);
				
			cmd.execute();
			sevisreccursor.val = cmd.getParameterValue("@SEVISRECCURSOR", DataCursor.class);


		}
		
		public static void pGorsvbhInsert(NString batchidIn,NString batchTypeIndIn,NString processedIndIn,NDate createDateIn,NString sevisUseridIn,NNumber numberRecordsIn,NString sevisSchCdeIn,NString sevisPgmCdeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.P_GORSVBH_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BATCHID_IN", batchidIn);
			cmd.addParameter("@BATCH_TYPE_IND_IN", batchTypeIndIn);
			cmd.addParameter("@PROCESSED_IND_IN", processedIndIn);
			cmd.addParameter("@CREATE_DATE_IN", createDateIn);
			cmd.addParameter("@SEVIS_USERID_IN", sevisUseridIn);
			cmd.addParameter("@NUMBER_RECORDS_IN", numberRecordsIn);
			cmd.addParameter("@SEVIS_SCH_CDE_IN", sevisSchCdeIn);
			cmd.addParameter("@SEVIS_PGM_CDE_IN", sevisPgmCdeIn);
				
			cmd.execute();


		}
		
		public static void pGotsvbtInsert(NNumber pidmIn,NNumber seqnoIn,NString svtsCodeIn,NString transIndIn,NString requestidIn,NString batchidIn,NString returnCdeIn,NString returnMsgIn,NString dataIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.P_GOTSVBT_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@SEQNO_IN", seqnoIn);
			cmd.addParameter("@SVTS_CODE_IN", svtsCodeIn);
			cmd.addParameter("@TRANS_IND_IN", transIndIn);
			cmd.addParameter("@REQUESTID_IN", requestidIn);
			cmd.addParameter("@BATCHID_IN", batchidIn);
			cmd.addParameter("@RETURN_CDE_IN", returnCdeIn);
			cmd.addParameter("@RETURN_MSG_IN", returnMsgIn);
			cmd.addParameter("@DATA_IN", dataIn);
				
			cmd.execute();


		}
		
		public static void pProcessImportData(NString importData,Ref<NString> errorCode,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.P_PROCESS_IMPORT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IMPORT_DATA", importData);
			cmd.addParameter("@ERROR_CODE", NString.class);
			cmd.addParameter("@ERROR_MSG", NString.class);
				
			cmd.execute();
			errorCode.val = cmd.getParameterValue("@ERROR_CODE", NString.class);
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pUpdateGobsevs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.P_UPDATE_GOBSEVS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateHeaderRecord(NString batchid,NNumber numofsevistarejects,NNumber numofsevisrejects,NNumber numofsevisapproved,NString errorcode,NString errormessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.P_UPDATE_HEADER_RECORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BATCHID", batchid);
			cmd.addParameter("@NUMOFSEVISTAREJECTS", numofsevistarejects);
			cmd.addParameter("@NUMOFSEVISREJECTS", numofsevisrejects);
			cmd.addParameter("@NUMOFSEVISAPPROVED", numofsevisapproved);
			cmd.addParameter("@ERRORCODE", errorcode);
			cmd.addParameter("@ERRORMESSAGE", errormessage);
				
			cmd.execute();


		}
		
		public static void pUpdateSevisRecord(NString requestid,NString statuscode,NString errorcode,NString errormessage,NString importdata) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSVEX.P_UPDATE_SEVIS_RECORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQUESTID", requestid);
			cmd.addParameter("@STATUSCODE", statuscode);
			cmd.addParameter("@ERRORCODE", errorcode);
			cmd.addParameter("@ERRORMESSAGE", errormessage);
			cmd.addParameter("@IMPORTDATA", importdata);
				
			cmd.execute();


		}
		
	
	
	
}
