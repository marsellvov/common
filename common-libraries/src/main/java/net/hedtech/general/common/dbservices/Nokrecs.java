package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.IDataCommand;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appdatalayer.data.types.DbTypes;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.NBool;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.Table;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;

public class Nokrecs {
	
	public static PtrbdplTabtypeRow fGetBdplRecs(NString pBdca,NDate pEffDate) {
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKRECS.F_GET_BDPL_RECS", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DbTypes.getCollectionType(PtrbdplTabtypeRow.class));
		cmd.addParameter("@P_BDCA", pBdca);
		cmd.addParameter("@P_EFF_DATE", pEffDate);
			
		cmd.execute();

		return (PtrbdplTabtypeRow)cmd.getReturnValueObj();

	}
	
	public static PtrinstRectypeRow fPtrinstRec() {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKRECS.F_PTRINST_REC", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DbTypes.createStructType(PtrinstRectypeRow.class));
		cmd.execute();

		return cmd.getReturnValue(PtrinstRectypeRow.class);

	}
	
//	FUNCTION f_ptvlcat_rec
//    (lcat_code_in  IN  VARCHAR2)
//  RETURN ptvlcat_rectype;
	public static PtvlcatRectypeRow fPtvlcatRec(NString lcatCodeIn){
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKRECS.F_PTVLCAT_REC", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DbTypes.createStructType(PtvlcatRectypeRow.class));
		cmd.addParameter("@LCAT_CODE_IN", lcatCodeIn);
		cmd.execute();
		
		return cmd.getReturnValue(PtvlcatRectypeRow.class);
	}

	public static NtvjobpRectypeRow fNtvjobpRec(NString jobpCodeIn) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKRECS.F_NTVJOBP_REC", DbManager.getDataBaseFactory());

		cmd.addReturnParameter(DbTypes.createStructType(NtvjobpRectypeRow.class));
		cmd.addParameter("@JOBP_CODE_IN", jobpCodeIn);

		cmd.execute();

		return cmd.getReturnValue(NtvjobpRectypeRow.class);

	}

	public static void pDynamicSql(NString pSqlStmt,
			Ref<NString> pReturnValue1,
			Ref<NString> pReturnValue2,
			Ref<NString> pReturnValue3,
			Ref<NString> pReturnValue4,
			Ref<NString> pReturnValue5,
			Ref<NString> pReturnValue6,
			Ref<NString> pReturnValue7) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKRECS.P_DYNAMIC_SQL", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_SQL_STMT", pSqlStmt);
		cmd.addParameter("@P_RETURN_VALUE1", NString.class);
		cmd.addParameter("@P_RETURN_VALUE2", NString.class);
		cmd.addParameter("@P_RETURN_VALUE3", NString.class);
		cmd.addParameter("@P_RETURN_VALUE4", NString.class);
		cmd.addParameter("@P_RETURN_VALUE5", NString.class);
		cmd.addParameter("@P_RETURN_VALUE6", NString.class);
		cmd.addParameter("@P_RETURN_VALUE7", NString.class);

		cmd.execute();
		pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1",
				NString.class);
		pReturnValue2.val = cmd.getParameterValue("@P_RETURN_VALUE2",
				NString.class);
		pReturnValue3.val = cmd.getParameterValue("@P_RETURN_VALUE3",
				NString.class);
		pReturnValue4.val = cmd.getParameterValue("@P_RETURN_VALUE4",
				NString.class);
		pReturnValue5.val = cmd.getParameterValue("@P_RETURN_VALUE5",
				NString.class);
		pReturnValue6.val = cmd.getParameterValue("@P_RETURN_VALUE6",
				NString.class);
		pReturnValue7.val = cmd.getParameterValue("@P_RETURN_VALUE7",
				NString.class);

	}

	public static void pDynamicSql(NString pSqlStmt,
			Ref<NString> pReturnValue1,
			Ref<NString> pReturnValue2,
			Ref<NString> pReturnValue3,
			Ref<NString> pReturnValue4,
			Ref<NString> pReturnValue5,
			Ref<NString> pReturnValue6,
			Ref<NString> pReturnValue7,
			Ref<NString> pReturnValue8,
			Ref<NString> pReturnValue9) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKRECS.P_DYNAMIC_SQL", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_SQL_STMT", pSqlStmt);
		cmd.addParameter("@P_RETURN_VALUE1", NString.class);
		cmd.addParameter("@P_RETURN_VALUE2", NString.class);
		cmd.addParameter("@P_RETURN_VALUE3", NString.class);
		cmd.addParameter("@P_RETURN_VALUE4", NString.class);
		cmd.addParameter("@P_RETURN_VALUE5", NString.class);
		cmd.addParameter("@P_RETURN_VALUE6", NString.class);
		cmd.addParameter("@P_RETURN_VALUE7", NString.class);
		cmd.addParameter("@P_RETURN_VALUE8", NString.class);
		cmd.addParameter("@P_RETURN_VALUE9", NString.class);

		cmd.execute();
		pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1",
				NString.class);
		pReturnValue2.val = cmd.getParameterValue("@P_RETURN_VALUE2",
				NString.class);
		pReturnValue3.val = cmd.getParameterValue("@P_RETURN_VALUE3",
				NString.class);
		pReturnValue4.val = cmd.getParameterValue("@P_RETURN_VALUE4",
				NString.class);
		pReturnValue5.val = cmd.getParameterValue("@P_RETURN_VALUE5",
				NString.class);
		pReturnValue6.val = cmd.getParameterValue("@P_RETURN_VALUE6",
				NString.class);
		pReturnValue7.val = cmd.getParameterValue("@P_RETURN_VALUE7",
				NString.class);
		pReturnValue8.val = cmd.getParameterValue("@P_RETURN_VALUE8",
				NString.class);
		pReturnValue9.val = cmd.getParameterValue("@P_RETURN_VALUE9",
				NString.class);

	}

	public static void pDynamicSql(NString pSqlStmt,
			Ref<NString> pReturnValue1,
			Ref<NString> pReturnValue2,
			Ref<NString> pReturnValue3,
			Ref<NString> pReturnValue4,
			Ref<NString> pReturnValue5,
			Ref<NString> pReturnValue6,
			Ref<NString> pReturnValue7,
			Ref<NString> pReturnValue8,
			Ref<NString> pReturnValue9,
			Ref<NString> pReturnValue10,
			Ref<NString> pReturnValue11,
			Ref<NString> pReturnValue12,
			Ref<NString> pReturnValue13,
			Ref<NString> pReturnValue14) {

		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand(
				"NOKRECS.P_DYNAMIC_SQL", DbManager.getDataBaseFactory());

		cmd.addParameter("@P_SQL_STMT", pSqlStmt);
		cmd.addParameter("@P_RETURN_VALUE1", NString.class);
		cmd.addParameter("@P_RETURN_VALUE2", NString.class);
		cmd.addParameter("@P_RETURN_VALUE3", NString.class);
		cmd.addParameter("@P_RETURN_VALUE4", NString.class);
		cmd.addParameter("@P_RETURN_VALUE5", NString.class);
		cmd.addParameter("@P_RETURN_VALUE6", NString.class);
		cmd.addParameter("@P_RETURN_VALUE7", NString.class);
		cmd.addParameter("@P_RETURN_VALUE8", NString.class);
		cmd.addParameter("@P_RETURN_VALUE9", NString.class);
		cmd.addParameter("@P_RETURN_VALUE10", NString.class);
		cmd.addParameter("@P_RETURN_VALUE11", NString.class);
		cmd.addParameter("@P_RETURN_VALUE12", NString.class);
		cmd.addParameter("@P_RETURN_VALUE13", NString.class);
		cmd.addParameter("@P_RETURN_VALUE14", NString.class);

		cmd.execute();
		pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1",
				NString.class);
		pReturnValue2.val = cmd.getParameterValue("@P_RETURN_VALUE2",
				NString.class);
		pReturnValue3.val = cmd.getParameterValue("@P_RETURN_VALUE3",
				NString.class);
		pReturnValue4.val = cmd.getParameterValue("@P_RETURN_VALUE4",
				NString.class);
		pReturnValue5.val = cmd.getParameterValue("@P_RETURN_VALUE5",
				NString.class);
		pReturnValue6.val = cmd.getParameterValue("@P_RETURN_VALUE6",
				NString.class);
		pReturnValue7.val = cmd.getParameterValue("@P_RETURN_VALUE7",
				NString.class);
		pReturnValue8.val = cmd.getParameterValue("@P_RETURN_VALUE8",
				NString.class);
		pReturnValue9.val = cmd.getParameterValue("@P_RETURN_VALUE9",
				NString.class);
		pReturnValue10.val = cmd.getParameterValue("@P_RETURN_VALUE10",
				NString.class);
		pReturnValue11.val = cmd.getParameterValue("@P_RETURN_VALUE11",
				NString.class);
		pReturnValue12.val = cmd.getParameterValue("@P_RETURN_VALUE12",
				NString.class);
		pReturnValue13.val = cmd.getParameterValue("@P_RETURN_VALUE13",
				NString.class);
		pReturnValue14.val = cmd.getParameterValue("@P_RETURN_VALUE14",
				NString.class);

	}

	@DbRecordType(id = "AttributeRectypeRow", dataSourceName = "NOKRECS.ATTRIBUTE_RECTYPE")
	public static class AttributeRectypeRow {
		@DbRecordField(dataSourceName = "FOUND")
		public NBool Found;
		@DbRecordField(dataSourceName = "NOTFOUND")
		public NBool Notfound;
	}

	@DbRecordType(id = "PtrbdplRectypeRow", dataSourceName = "NOKRECS.PTRBDPL_RECTYPE")
	public static class PtrbdplRectypeRow {
		@DbRecordField(dataSourceName = "EFF_DATE")
		public NDate EffDate;
		@DbRecordField(dataSourceName = "BDPL_CODE")
		public NString BdplCode;
		@DbRecordField(dataSourceName = "BDPL_DESC")
		public NString BdplDesc;
		@DbRecordField(dataSourceName = "BDPL_AMT1")
		public NNumber BdplAmt1;
		@DbRecordField(dataSourceName = "BDPL_AMT2")
		public NNumber BdplAmt2;
		@DbRecordField(dataSourceName = "BDPL_AMT3")
		public NNumber BdplAmt3;
		@DbRecordField(dataSourceName = "BDPL_AMT4")
		public NNumber BdplAmt4;
	}

	@DbRecordType(id = "PtrcalnRowtypeRow", dataSourceName = "NOKRECS.PTRCALN_ROWTYPE")
	public static class PtrcalnRowtypeRow {
		@DbRecordField(dataSourceName = "PTRCALN_YEAR")
		public NString PtrcalnYear;
		@DbRecordField(dataSourceName = "PTRCALN_PICT_CODE")
		public NString PtrcalnPictCode;
		@DbRecordField(dataSourceName = "PTRCALN_PAYNO")
		public NNumber PtrcalnPayno;
		@DbRecordField(dataSourceName = "PTRCALN_START_DATE")
		public NDate PtrcalnStartDate;
		@DbRecordField(dataSourceName = "PTRCALN_END_DATE")
		public NDate PtrcalnEndDate;
		@DbRecordField(dataSourceName = "PTRCALN_ACTIVITY_DATE")
		public NDate PtrcalnActivityDate;
	}

	@DbRecordType(id = "PtrearnRowtypeRow", dataSourceName = "NOKRECS.PTREARN_ROWTYPE")
	public static class PtrearnRowtypeRow {
		@DbRecordField(dataSourceName = "PTREARN_CODE")
		public NString PtrearnCode;
		@DbRecordField(dataSourceName = "PTREARN_SHORT_DESC")
		public NString PtrearnShortDesc;
		@DbRecordField(dataSourceName = "PTREARN_LONG_DESC")
		public NString PtrearnLongDesc;
		@DbRecordField(dataSourceName = "PTREARN_ACTIVITY_DATE")
		public NDate PtrearnActivityDate;
	}

	@DbRecordType(id = "PtreclcRowtypeRow", dataSourceName = "NOKRECS.PTRECLC_ROWTYPE")
	public static class PtreclcRowtypeRow {
		@DbRecordField(dataSourceName = "PTRECLC_CODE")
		public NString PtreclcCode;
		@DbRecordField(dataSourceName = "PTRECLC_LCAT_CODE")
		public NString PtreclcLcatCode;
		@DbRecordField(dataSourceName = "PTRECLC_ACTIVITY_DATE")
		public NDate PtreclcActivityDate;
	}

	@DbRecordType(id = "PtreclsRowtypeRow", dataSourceName = "NOKRECS.PTRECLS_ROWTYPE")
	public static class PtreclsRowtypeRow {
		@DbRecordField(dataSourceName = "PTRECLS_CODE")
		public NString PtreclsCode;
		@DbRecordField(dataSourceName = "PTRECLS_SHORT_DESC")
		public NString PtreclsShortDesc;
		@DbRecordField(dataSourceName = "PTRECLS_LONG_DESC")
		public NString PtreclsLongDesc;
		@DbRecordField(dataSourceName = "PTRECLS_ACTIVITY_DATE")
		public NDate PtreclsActivityDate;
	}

	@DbRecordType(id = "NtvjobpRowtypeRow", dataSourceName = "NOKRECS.NTVJOBP_ROWTYPE")
	public static class NtvjobpRowtypeRow {
		@DbRecordField(dataSourceName = "NTVJOBP_ACTIVITY_DATE")
		public NDate NtvjobpActivityDate;
		@DbRecordField(dataSourceName = "NTVJOBP_CODE")
		public NString NtvjobpCode;
		@DbRecordField(dataSourceName = "NTVJOBP_DESC")
		public NString NtvjobpDesc;
		@DbRecordField(dataSourceName = "NTVJOBP_USER_ID")
		public NString NtvjobpUserId;
	}
	
	@DbRecordType(id = "NtvjobpRectypeRow", dataSourceName = "NOKRECS.NTVJOBP_RECTYPE")
	public static class NtvjobpRectypeRow {
		@DbRecordField(dataSourceName = "TABL")
		public NtvjobpRowtypeRow table;
		@DbRecordField(dataSourceName = "ATTR")
		public AttributeRectypeRow attr;
	}
	
	
	@DbRecordType(id = "PtvlcatRectypeRow", dataSourceName = "NOKRECS.PTVLCAT_ROWTYPE")
	public static class PtvlcatRectypeRow {
		@DbRecordField(dataSourceName = "PTVLCAT_CODE")
		public NString PtvlcatCode;
		@DbRecordField(dataSourceName = "PTVLCAT_DESC")
		public NString PtvlcatDesc;
		@DbRecordField(dataSourceName = "PTVLCAT_ACTIVITY_DATE")
		public NDate PtvlcatActivityDate;
	}
	
	  
	@DbRecordType(id = "PtreclcRectypeRow", dataSourceName = "NOKRECS.PTRECLC_ROWTYPE")
	public static class PtreclcRectypeRow {
		@DbRecordField(dataSourceName = "PTRECLC_CODE")
		public NString PtreclcCode;
		@DbRecordField(dataSourceName = "PTRECLC_DESC")
		public NString PtreclcDesc;
		@DbRecordField(dataSourceName = "PTRECLC_ACTIVITY_DATE")
		public NDate PtreclcActivityDate;
	}

	
	@DbRecordType(id = "PtrinstRectypeRow", dataSourceName = "NOKRECS.PTRINST_RECTYPE")
	public static class PtrinstRectypeRow {
		@DbRecordField(dataSourceName = "TABL")
		public PtrinstRowtypeRow table;
		@DbRecordField(dataSourceName = "ATTR")
		public AttributeRectypeRow attr;
	}
	
	@DbRecordType(id = "PtrinstRowtypeRow", dataSourceName = "NOKRECS.PTRINST_ROWTYPE")
	public static class PtrinstRowtypeRow {
		@DbRecordField(dataSourceName = "PTRINST_CODE")
		public NString PtrinstCode;
		@DbRecordField(dataSourceName = "PTRINST_FACULTY_IND")
		public NString PtrinstFacultyInd;
		@DbRecordField(dataSourceName = "PTRINST_ACCRUE_LEAVE_METHOD")
		public NString PtrinstAccrueLeaveMethod;
	
	}
	
	
	
	
	@DbRecordType(id = "PtvlcatRowType", dataSourceName = "NOKRECS.PTVLCAT_RECTYPE")
	public static class PtvlcatRowType {
		@DbRecordField(dataSourceName = "TABL")
		public PtvlcatRowType table;
		@DbRecordField(dataSourceName = "ATTR")
		public AttributeRectypeRow attr;
	}
	
	  
	@DbRecordType(id = "PtreclcRectype", dataSourceName = "NOKRECS.PTRECLC_RECTYPE")
	public static class PtreclcRectype {
		@DbRecordField(dataSourceName = "TABL")
		public PtreclcRowtypeRow table;
		@DbRecordField(dataSourceName = "ATTR")
		public AttributeRectypeRow attr;
	}

	
	@DbTableType(id="Nokrecs.PtrbdplTabtypeRow", dataSourceName="NOKRECS.PTRBDPL_TABTYPE", indexed=true)
	public static class PtrbdplTabtypeRow extends Table<PtrbdplRectypeRow> {
	}
	

	@DbRecordType(id = "PtrearnRectypeRow", dataSourceName = "NOKRECS.PTREARN_RECTYPE")
	public static class PtrearnRectypeRow {
		@DbRecordField(dataSourceName = "TABL")
		public PtrearnRowtypeRow table;
		@DbRecordField(dataSourceName = "ATTR")
		public AttributeRectypeRow attr;
	}
	

	public static PtrearnRectypeRow fPtrearnRec(NString earnCodeIn){
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKRECS.F_PTREARN_REC", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DbTypes.createStructType(PtrearnRectypeRow.class));
		cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
		cmd.execute();
		
		return cmd.getReturnValue(PtrearnRectypeRow.class);
	}
	
	@DbRecordType(id = "NtrpclsRowtypeRow", dataSourceName = "NOKRECS.NTRPCLS_ROWTYPE")
	public static class NtrpclsRowtypeRow {
		@DbRecordField(dataSourceName = "NTRPCLS_ACTIVITY_DATE")
		public NDate NtrpclsActivityDate;
		@DbRecordField(dataSourceName = "NTRPCLS_CODE")
		public NString NtrpclsCode;
		@DbRecordField(dataSourceName = "NTRPCLS_DESC")
		public NString NtrpclsDesc;
		@DbRecordField(dataSourceName = "NTRPCLS_USER_ID")
		public NString NtrpclsUserId;
	}
	
	@DbRecordType(id = "NtrpclsRectypeRow", dataSourceName = "NOKRECS.NTRPCLS_RECTYPE")
	public static class NtrpclsRectypeRow {
		@DbRecordField(dataSourceName = "TABL")
		public NtrpclsRowtypeRow table;
		@DbRecordField(dataSourceName = "ATTR")
		public AttributeRectypeRow attr;
	}

	public static NtrpclsRectypeRow fNtrpclsRec(NString pclsCodeIn){
		
		IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKRECS.F_NTRPCLS_REC", DbManager.getDataBaseFactory());
		
		cmd.addReturnParameter(DbTypes.createStructType(NtrpclsRectypeRow.class));
		cmd.addParameter("@PCLS_CODE_IN", pclsCodeIn);
		cmd.execute();
		
		return cmd.getReturnValue(NtrpclsRectypeRow.class);
	}
}