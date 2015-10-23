package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbTermControlAr {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TermControlArRecRow recOne,TermControlArRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TermControlArRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TermControlArRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NString pDetailWebDispInd,NDate pWebEffDate,NString pSumDetcInd,NString pAidAuthDispInd,NString pAidMemoDispInd,NString pOthMemoDispInd,NString pPayBtnInd,NString pAccdDueCde,NString pAuthDueCde,NString pMemoDueCde,NString pAidCalcInd,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_WEB_DISP_IND", pDetailWebDispInd);
			cmd.addParameter("@P_WEB_EFF_DATE", pWebEffDate);
			cmd.addParameter("@P_SUM_DETC_IND", pSumDetcInd);
			cmd.addParameter("@P_AID_AUTH_DISP_IND", pAidAuthDispInd);
			cmd.addParameter("@P_AID_MEMO_DISP_IND", pAidMemoDispInd);
			cmd.addParameter("@P_OTH_MEMO_DISP_IND", pOthMemoDispInd);
			cmd.addParameter("@P_PAY_BTN_IND", pPayBtnInd);
			cmd.addParameter("@P_ACCD_DUE_CDE", pAccdDueCde);
			cmd.addParameter("@P_AUTH_DUE_CDE", pAuthDueCde);
			cmd.addParameter("@P_MEMO_DUE_CDE", pMemoDueCde);
			cmd.addParameter("@P_AID_CALC_IND", pAidCalcInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NString pDetailWebDispInd,NDate pWebEffDate,NString pSumDetcInd,NString pAidAuthDispInd,NString pAidMemoDispInd,NString pOthMemoDispInd,NString pPayBtnInd,NString pAccdDueCde,NString pAuthDueCde,NString pMemoDueCde,NString pAidCalcInd,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_TERM_CONTROL_AR.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_WEB_DISP_IND", pDetailWebDispInd);
			cmd.addParameter("@P_WEB_EFF_DATE", pWebEffDate);
			cmd.addParameter("@P_SUM_DETC_IND", pSumDetcInd);
			cmd.addParameter("@P_AID_AUTH_DISP_IND", pAidAuthDispInd);
			cmd.addParameter("@P_AID_MEMO_DISP_IND", pAidMemoDispInd);
			cmd.addParameter("@P_OTH_MEMO_DISP_IND", pOthMemoDispInd);
			cmd.addParameter("@P_PAY_BTN_IND", pPayBtnInd);
			cmd.addParameter("@P_ACCD_DUE_CDE", pAccdDueCde);
			cmd.addParameter("@P_AUTH_DUE_CDE", pAuthDueCde);
			cmd.addParameter("@P_MEMO_DUE_CDE", pMemoDueCde);
			cmd.addParameter("@P_AID_CALC_IND", pAidCalcInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TermControlArRecRow", dataSourceName="TERM_CONTROL_AR_REC")
	public static class TermControlArRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_DETAIL_WEB_DISP_IND")
		public NString RDetailWebDispInd;
		@DbRecordField(dataSourceName="R_WEB_EFF_DATE")
		public NDate RWebEffDate;
		@DbRecordField(dataSourceName="R_SUM_DETC_IND")
		public NString RSumDetcInd;
		@DbRecordField(dataSourceName="R_AID_AUTH_DISP_IND")
		public NString RAidAuthDispInd;
		@DbRecordField(dataSourceName="R_AID_MEMO_DISP_IND")
		public NString RAidMemoDispInd;
		@DbRecordField(dataSourceName="R_OTH_MEMO_DISP_IND")
		public NString ROthMemoDispInd;
		@DbRecordField(dataSourceName="R_PAY_BTN_IND")
		public NString RPayBtnInd;
		@DbRecordField(dataSourceName="R_ACCD_DUE_CDE")
		public NString RAccdDueCde;
		@DbRecordField(dataSourceName="R_AUTH_DUE_CDE")
		public NString RAuthDueCde;
		@DbRecordField(dataSourceName="R_MEMO_DUE_CDE")
		public NString RMemoDueCde;
		@DbRecordField(dataSourceName="R_AID_CALC_IND")
		public NString RAidCalcInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
