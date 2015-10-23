package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pekrecs {
//		public static PebemplRectypeRow fPebemplRec(NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKRECS.F_PEBEMPL_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PebemplRectypeRow.class));
//			cmd.addParameter("@PIDM_IN", pidmIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PebemplRectypeRow.class);
//
//		}
//		
//		public static PerearnRectypeRow fPerearnRec(NNumber jobsSeqnoIn,NString earnCodeIn,NString shiftIn,NNumber specialRateIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKRECS.F_PEREARN_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PerearnRectypeRow.class));
//			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
//			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
//			cmd.addParameter("@SHIFT_IN", shiftIn);
//			cmd.addParameter("@SPECIAL_RATE_IN", specialRateIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PerearnRectypeRow.class);
//
//		}
//		
//		public static PerhourRectypeRow fPerhourRec(NNumber jobsSeqnoIn,NString earnCodeIn,NString shiftIn,NNumber specialRateIn,NDate timeEntryDateIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKRECS.F_PERHOUR_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PerhourRectypeRow.class));
//			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
//			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
//			cmd.addParameter("@SHIFT_IN", shiftIn);
//			cmd.addParameter("@SPECIAL_RATE_IN", specialRateIn);
//			cmd.addParameter("@TIME_ENTRY_DATE_IN", timeEntryDateIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PerhourRectypeRow.class);
//
//		}
//		
//		public static PerjlevRectypeRow fPerjlevRec(NNumber pidmIn,NString posnIn,NString suffIn,NString leavCodeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKRECS.F_PERJLEV_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PerjlevRectypeRow.class));
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@POSN_IN", posnIn);
//			cmd.addParameter("@SUFF_IN", suffIn);
//			cmd.addParameter("@LEAV_CODE_IN", leavCodeIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PerjlevRectypeRow.class);
//
//		}
//		
//		public static PerjobsRectypeRow fPerjobsRec(NNumber jobsSeqnoIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKRECS.F_PERJOBS_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PerjobsRectypeRow.class));
//			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PerjobsRectypeRow.class);
//
//		}
//		
//		public static PerjobsRectypeRow fPerjobsRec(NString yearIn,NString pictCodeIn,NNumber paynoIn,NString actionIndIn,NNumber pidmIn,NString posnIn,NString suffIn,NString coasCodeTsIn,NString orgnCodeTsIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKRECS.F_PERJOBS_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PerjobsRectypeRow.class));
//			cmd.addParameter("@YEAR_IN", yearIn);
//			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
//			cmd.addParameter("@PAYNO_IN", paynoIn);
//			cmd.addParameter("@ACTION_IND_IN", actionIndIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@POSN_IN", posnIn);
//			cmd.addParameter("@SUFF_IN", suffIn);
//			cmd.addParameter("@COAS_CODE_TS_IN", coasCodeTsIn);
//			cmd.addParameter("@ORGN_CODE_TS_IN", orgnCodeTsIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PerjobsRectypeRow.class);
//
//		}
//		
//		public static PerleavRectypeRow fPerleavRec(NNumber pidmIn,NString leavCodeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKRECS.F_PERLEAV_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PerleavRectypeRow.class));
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@LEAV_CODE_IN", leavCodeIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PerleavRectypeRow.class);
//
//		}
		
		public static PersnblRectypeRow fPersnblRec(NNumber pidmIn,NString pclsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKRECS.F_PERSNBL_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(PersnblRectypeRow.class));
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PCLS_CODE_IN", pclsCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(PersnblRectypeRow.class);

		}
		
//		public static PertethRectypeRow fPertethRec(NNumber jobsSeqnoIn,NNumber seqnoIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKRECS.F_PERTETH_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PertethRectypeRow.class));
//			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
//			cmd.addParameter("@SEQNO_IN", seqnoIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PertethRectypeRow.class);
//
//		}
		
	
	
	@DbRecordType(id="AttributeRectypeRow", dataSourceName="PEKRECS.ATTRIBUTE_RECTYPE")
	public static class AttributeRectypeRow
	{
		@DbRecordField(dataSourceName="FOUND")
		public NBool Found;
		@DbRecordField(dataSourceName="NOTFOUND")
		public NBool Notfound;
	}
	
	@DbRecordType(id="PersnblRectypeRow", dataSourceName="PEKRECS.PERSNBL_RECTYPE")
	public static class PersnblRectypeRow
	{
		@DbRecordField(dataSourceName="TABL")
		public PersnblTableRow Tabl;
		@DbRecordField(dataSourceName="ATTR")
		public AttributeRectypeRow Attr;
	}
	
	@DbRecordType(id="PersnblTableRow", dataSourceName="PEKRECS.PERSNBL_RECTYPE.PERSNBL%ROWTYPE")
	public static class PersnblTableRow
	{
		@DbRecordField(dataSourceName="PERSNBL_PIDM")
		public NNumber PersnblPidm;
		@DbRecordField(dataSourceName="PERSNBL_PCLS_CODE")
		public NString PersnblPclsCode;
		@DbRecordField(dataSourceName="PERSNBL_SENIORITY_HRS")
		public NNumber PersnblSeniorityHrs;
		@DbRecordField(dataSourceName="PERSNBL_ACTIVITY_DATE")
		public NDate PersnblActivityDate;
		@DbRecordField(dataSourceName="PERSNBL_USER_ID")
		public NString PersnblUserId;
		@DbRecordField(dataSourceName="PERSNBL_EARNED_HRS")
		public NNumber PersnblEarnedHrs;
		@DbRecordField(dataSourceName="PERSNBL_DATE_IN_CLASS")
		public NDate PersnblDateInClass;
		@DbRecordField(dataSourceName="PERSNBL_SURROGATE_ID")
		public NNumber PersnblSurrogateId;
		@DbRecordField(dataSourceName="PERSNBL_VERSION")
		public NNumber PersnblVersion;
		@DbRecordField(dataSourceName="PERSNBL_DATA_ORIGIN")
		public NString PersnblDataOrigin;
		@DbRecordField(dataSourceName="PERSNBL_VPDI_CODE")
		public NString PersnblVpdiCode;
	}
	
	
}
