package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smrcmjx {
		public static DataCursor fCollectJobs(NString pJobname,NString pSessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.F_COLLECT_JOBS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_SESSIONID", pSessionid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fCountOpenCursors() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.F_COUNT_OPEN_CURSORS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetBatchCprtCode(NNumber pOneUpNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.F_GET_BATCH_CPRT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSessionid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.F_GET_SESSIONID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSessionidBatch(NString pJobname,NNumber pOneUpNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.F_GET_SESSIONID_BATCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fProcessJobs(NString pJobname,NString pSessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.F_PROCESS_JOBS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_SESSIONID", pSessionid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fRetrieveParms(NString pJobname,NNumber pOneUpNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.F_RETRIEVE_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRunmode(NNumber pOneUpNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.F_RUNMODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidOneUp(NString pJobname,NNumber pOneUpNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.F_VALID_ONE_UP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDelParms(NString pJobname,NNumber pOneUpNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.P_DEL_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
				
			cmd.execute();


		}
		
		public static void pOutputPrint(NNumber pPidm,NNumber pRequestNo,Ref<DataCursor> pOutputPrintRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.P_OUTPUT_PRINT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
			cmd.addParameter("@P_OUTPUT_PRINT_REF", DataCursor.class);
				
			cmd.execute();
			pOutputPrintRef.val = cmd.getParameterValue("@P_OUTPUT_PRINT_REF", DataCursor.class);


		}
		
		public static void pOutputPrintBatch(NNumber pPidm,NNumber pRequestNo,NString pCprtCode,Ref<DataCursor> pOutputPrintRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.P_OUTPUT_PRINT_BATCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
			cmd.addParameter("@P_CPRT_CODE", pCprtCode);
			cmd.addParameter("@P_OUTPUT_PRINT_REF", DataCursor.class);
				
			cmd.execute();
			pOutputPrintRef.val = cmd.getParameterValue("@P_OUTPUT_PRINT_REF", DataCursor.class);


		}
		
		public static void pSetPrintDate(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.P_SET_PRINT_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pSetPrintDateBatch(NString pSessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.P_SET_PRINT_DATE_BATCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSIONID", pSessionid);
				
			cmd.execute();


		}
		
		public static void pSetPrintDateBatch(NNumber pPidm,NNumber pRequestNo,NString pCprtCode,NString pSessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.P_SET_PRINT_DATE_BATCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
			cmd.addParameter("@P_CPRT_CODE", pCprtCode);
			cmd.addParameter("@P_SESSIONID", pSessionid);
				
			cmd.execute();


		}
		
		public static void pUpdateSmrcolr(NString pJobname,NString pSessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.P_UPDATE_SMRCOLR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_SESSIONID", pSessionid);
				
			cmd.execute();


		}
		
		public static void pUpdateSmrcorq(NString pJobname,NString pSessionid,NNumber pPidm,NNumber pRequestNo,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMRCMJX.P_UPDATE_SMRCORQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBNAME", pJobname);
			cmd.addParameter("@P_SESSIONID", pSessionid);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CollectJobsRow", dataSourceName="COLLECT_JOBS")
	public static class CollectJobsRow
	{
		@DbRecordField(dataSourceName="SMRCOLR_SESSIONID")
		public NString SmrcolrSessionid;
		@DbRecordField(dataSourceName="SMRCOLR_JOB_ONE_UP_NO")
		public NNumber SmrcolrJobOneUpNo;
	}

	
	@DbRecordType(id="OutputPrintRow", dataSourceName="OUTPUT_PRINT")
	public static class OutputPrintRow
	{
		@DbRecordField(dataSourceName="SMRPRRQ_CPRT_CODE")
		public NString SmrprrqCprtCode;
		@DbRecordField(dataSourceName="SMRPRRQ_REQUEST_DATE")
		public NDate SmrprrqRequestDate;
		@DbRecordField(dataSourceName="SMRPRRQ_PRINT_IMMEDIATE_IND")
		public NString SmrprrqPrintImmediateInd;
		@DbRecordField(dataSourceName="SMRPRRQ_FEE_IND")
		public NString SmrprrqFeeInd;
		@DbRecordField(dataSourceName="SMRPRRQ_PRINT_DATE")
		public NDate SmrprrqPrintDate;
		@DbRecordField(dataSourceName="SMRPRRQ_SBGI_CODE")
		public NString SmrprrqSbgiCode;
		@DbRecordField(dataSourceName="SMRPRRQ_COLL_CODE")
		public NString SmrprrqCollCode;
		@DbRecordField(dataSourceName="SMRPRRQ_ADDR_NAME")
		public NString SmrprrqAddrName;
		@DbRecordField(dataSourceName="SMRPRRQ_STREET_LINE1")
		public NString SmrprrqStreetLine1;
		@DbRecordField(dataSourceName="SMRPRRQ_STREET_LINE2")
		public NString SmrprrqStreetLine2;
		@DbRecordField(dataSourceName="SMRPRRQ_STREET_LINE3")
		public NString SmrprrqStreetLine3;
		@DbRecordField(dataSourceName="SMRPRRQ_CITY")
		public NString SmrprrqCity;
		@DbRecordField(dataSourceName="SMRPRRQ_STAT_CODE")
		public NString SmrprrqStatCode;
		@DbRecordField(dataSourceName="SMRPRRQ_ZIP")
		public NString SmrprrqZip;
		@DbRecordField(dataSourceName="SMRPRRQ_NATN_CODE")
		public NString SmrprrqNatnCode;
		@DbRecordField(dataSourceName="SMRPRRQ_NO_COPIES")
		public NNumber SmrprrqNoCopies;
		@DbRecordField(dataSourceName="SMRPRRQ_FEE_DATE")
		public NDate SmrprrqFeeDate;
		@DbRecordField(dataSourceName="SMRPRRQ_AUTHORIZED")
		public NString SmrprrqAuthorized;
		@DbRecordField(dataSourceName="SMRPRRQ_PRINTER")
		public NString SmrprrqPrinter;
		@DbRecordField(dataSourceName="SMRPRRQ_SESSIONID")
		public NString SmrprrqSessionid;
		@DbRecordField(dataSourceName="ROWID")
		public NString Rowid;
	}

	
	@DbRecordType(id="ProcessJobsRow", dataSourceName="PROCESS_JOBS")
	public static class ProcessJobsRow
	{
		@DbRecordField(dataSourceName="SMRCORQ_PIDM")
		public NNumber SmrcorqPidm;
		@DbRecordField(dataSourceName="SMRCORQ_REQUEST_NO")
		public NNumber SmrcorqRequestNo;
		@DbRecordField(dataSourceName="SMRCORQ_SEQNO")
		public NNumber SmrcorqSeqno;
	}

	
	
}
