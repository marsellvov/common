package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.dbtypes.TbbdetcRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbDetailCode {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pDetailCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsData(NString pDetailCode, Ref<TbbdetcRow> lvTbbdetcRec_ref) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_EXISTS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter(DbTypes.createStructType("TBBDETC_REC", lvTbbdetcRec_ref.val, TbbdetcRow.class));
			cmd.execute();
			
			lvTbbdetcRec_ref.val = cmd.getParameterValue("TBBDETC_REC", TbbdetcRow.class);
			
			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDcat(NString pDetailCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_GET_DCAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDescription(NString pDetailCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_GET_DESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHasAccounting(NString pDetailCode,NDate pAsofDate,NString pTbdsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_HAS_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
			cmd.addParameter("@P_TBDS_CODE", pTbdsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(DetailCodeRecRow recOne,DetailCodeRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, DetailCodeRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, DetailCodeRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pDetailCode,NString pDcatCode,NString pDetcActiveInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_DCAT_CODE", pDcatCode);
			cmd.addParameter("@P_DETC_ACTIVE_IND", pDetcActiveInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pDetailCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pDetailCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fValidToDelete(NString pDetailCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DETAIL_CODE.F_VALID_TO_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	@DbRecordType(id="DetailCodeRecRow", dataSourceName="DETAIL_CODE_REC")
	public static class DetailCodeRecRow
	{
		@DbRecordField(dataSourceName="R_DETAIL_CODE")
		public NString RDetailCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_TYPE_IND")
		public NString RTypeInd;
		@DbRecordField(dataSourceName="R_PRIORITY")
		public NString RPriority;
		@DbRecordField(dataSourceName="R_LIKE_TERM_IND")
		public NString RLikeTermInd;
		@DbRecordField(dataSourceName="R_DCAT_CODE")
		public NString RDcatCode;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_REFUNDABLE_IND")
		public NString RRefundableInd;
		@DbRecordField(dataSourceName="R_RECEIPT_IND")
		public NString RReceiptInd;
		@DbRecordField(dataSourceName="R_REFUND_IND")
		public NString RRefundInd;
		@DbRecordField(dataSourceName="R_PAYT_CODE")
		public NString RPaytCode;
		@DbRecordField(dataSourceName="R_PREBILL_PRINT_IND")
		public NString RPrebillPrintInd;
		@DbRecordField(dataSourceName="R_GL_NOS_ENTERABLE")
		public NString RGlNosEnterable;
		@DbRecordField(dataSourceName="R_TAXT_CODE")
		public NString RTaxtCode;
		@DbRecordField(dataSourceName="R_TBDC_IND")
		public NString RTbdcInd;
		@DbRecordField(dataSourceName="R_DETAIL_CODE_IND")
		public NString RDetailCodeInd;
		@DbRecordField(dataSourceName="R_DETC_ACTIVE_IND")
		public NString RDetcActiveInd;
		@DbRecordField(dataSourceName="R_DIRD_IND")
		public NString RDirdInd;
		@DbRecordField(dataSourceName="R_TIV_IND")
		public NString RTivInd;
		@DbRecordField(dataSourceName="R_INST_CHG_IND")
		public NString RInstChgInd;
		@DbRecordField(dataSourceName="R_LIKE_AIDY_IND")
		public NString RLikeAidyInd;
		@DbRecordField(dataSourceName="R_PAYHIST_IND")
		public NString RPayhistInd;
		@DbRecordField(dataSourceName="R_ABDC_IND")
		public NString RAbdcInd;
		@DbRecordField(dataSourceName="R_LIKE_PERIOD_IND")
		public NString RLikePeriodInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
