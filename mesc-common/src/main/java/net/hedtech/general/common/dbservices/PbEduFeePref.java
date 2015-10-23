package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbEduFeePref {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EduFeePrefRecRow recOne,EduFeePrefRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EduFeePrefRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EduFeePrefRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,NNumber pEnrollAge,NNumber pMaxAge,NNumber pAnnMaxFeeChild,NNumber pAnnMaxFeeFamily,NNumber pAnnMaxChild,NNumber pAnnPerPaid,NString pAnnQuCode,NNumber pAddMaxFeeChild,NNumber pAddMaxFeeFamily,NNumber pAddMaxChild,NNumber pAddPerPaid,NString pAddQuCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_ENROLL_AGE", pEnrollAge);
			cmd.addParameter("@P_MAX_AGE", pMaxAge);
			cmd.addParameter("@P_ANN_MAX_FEE_CHILD", pAnnMaxFeeChild);
			cmd.addParameter("@P_ANN_MAX_FEE_FAMILY", pAnnMaxFeeFamily);
			cmd.addParameter("@P_ANN_MAX_CHILD", pAnnMaxChild);
			cmd.addParameter("@P_ANN_PER_PAID", pAnnPerPaid);
			cmd.addParameter("@P_ANN_QU_CODE", pAnnQuCode);
			cmd.addParameter("@P_ADD_MAX_FEE_CHILD", pAddMaxFeeChild);
			cmd.addParameter("@P_ADD_MAX_FEE_FAMILY", pAddMaxFeeFamily);
			cmd.addParameter("@P_ADD_MAX_CHILD", pAddMaxChild);
			cmd.addParameter("@P_ADD_PER_PAID", pAddPerPaid);
			cmd.addParameter("@P_ADD_QU_CODE", pAddQuCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEclsCode,NString pTable,NString pGrade,NString pPosn,NString pInd,NNumber pEnrollAge,NNumber pMaxAge,NNumber pAnnMaxFeeChild,NNumber pAnnMaxFeeFamily,NNumber pAnnMaxChild,NNumber pAnnPerPaid,NString pAnnQuCode,NNumber pAddMaxFeeChild,NNumber pAddMaxFeeFamily,NNumber pAddMaxChild,NNumber pAddPerPaid,NString pAddQuCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EDU_FEE_PREF.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_IND", pInd);
			cmd.addParameter("@P_ENROLL_AGE", pEnrollAge);
			cmd.addParameter("@P_MAX_AGE", pMaxAge);
			cmd.addParameter("@P_ANN_MAX_FEE_CHILD", pAnnMaxFeeChild);
			cmd.addParameter("@P_ANN_MAX_FEE_FAMILY", pAnnMaxFeeFamily);
			cmd.addParameter("@P_ANN_MAX_CHILD", pAnnMaxChild);
			cmd.addParameter("@P_ANN_PER_PAID", pAnnPerPaid);
			cmd.addParameter("@P_ANN_QU_CODE", pAnnQuCode);
			cmd.addParameter("@P_ADD_MAX_FEE_CHILD", pAddMaxFeeChild);
			cmd.addParameter("@P_ADD_MAX_FEE_FAMILY", pAddMaxFeeFamily);
			cmd.addParameter("@P_ADD_MAX_CHILD", pAddMaxChild);
			cmd.addParameter("@P_ADD_PER_PAID", pAddPerPaid);
			cmd.addParameter("@P_ADD_QU_CODE", pAddQuCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="EduFeePrefRecRow", dataSourceName="EDU_FEE_PREF_REC")
	public static class EduFeePrefRecRow
	{
		@DbRecordField(dataSourceName="R_ECLS_CODE")
		public NString REclsCode;
		@DbRecordField(dataSourceName="R_TABLE")
		public NString RTable;
		@DbRecordField(dataSourceName="R_GRADE")
		public NString RGrade;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_IND")
		public NString RInd;
		@DbRecordField(dataSourceName="R_ENROLL_AGE")
		public NNumber REnrollAge;
		@DbRecordField(dataSourceName="R_MAX_AGE")
		public NNumber RMaxAge;
		@DbRecordField(dataSourceName="R_ANN_MAX_FEE_CHILD")
		public NNumber RAnnMaxFeeChild;
		@DbRecordField(dataSourceName="R_ANN_MAX_FEE_FAMILY")
		public NNumber RAnnMaxFeeFamily;
		@DbRecordField(dataSourceName="R_ANN_MAX_CHILD")
		public NNumber RAnnMaxChild;
		@DbRecordField(dataSourceName="R_ANN_PER_PAID")
		public NNumber RAnnPerPaid;
		@DbRecordField(dataSourceName="R_ANN_QU_CODE")
		public NString RAnnQuCode;
		@DbRecordField(dataSourceName="R_ADD_MAX_FEE_CHILD")
		public NNumber RAddMaxFeeChild;
		@DbRecordField(dataSourceName="R_ADD_MAX_FEE_FAMILY")
		public NNumber RAddMaxFeeFamily;
		@DbRecordField(dataSourceName="R_ADD_MAX_CHILD")
		public NNumber RAddMaxChild;
		@DbRecordField(dataSourceName="R_ADD_PER_PAID")
		public NNumber RAddPerPaid;
		@DbRecordField(dataSourceName="R_ADD_QU_CODE")
		public NString RAddQuCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
