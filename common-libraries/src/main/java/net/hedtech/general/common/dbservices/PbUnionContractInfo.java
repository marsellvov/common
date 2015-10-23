package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbUnionContractInfo {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pBargCode,NString pUnloCode,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BARG_CODE", pBargCode);
			cmd.addParameter("@P_UNLO_CODE", pUnloCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(UnionContractInfoRecRow recOne,UnionContractInfoRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, UnionContractInfoRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, UnionContractInfoRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pBargCode,NString pUnloCode,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BARG_CODE", pBargCode);
			cmd.addParameter("@P_UNLO_CODE", pUnloCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pBargCode,NString pUnloCode,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BARG_CODE", pBargCode);
			cmd.addParameter("@P_UNLO_CODE", pUnloCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pBargCode,NString pUnloCode,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BARG_CODE", pBargCode);
			cmd.addParameter("@P_UNLO_CODE", pUnloCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pBargCode,NString pUnloCode,NString pContractTitle,NString pContractMultiInd,NDate pBeginDate,NString pContractStatus,NString pUserId,NDate pEndDate,NString pLcdeCode,NString pCatyCode,NString pContractUrl,NString pComment,NString pText,NString pDataOrigin,Ref<byte[]> pRowidOut,Ref<NNumber> pSeqnoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BARG_CODE", pBargCode);
			cmd.addParameter("@P_UNLO_CODE", pUnloCode);
			cmd.addParameter("@P_CONTRACT_TITLE", pContractTitle);
			cmd.addParameter("@P_CONTRACT_MULTI_IND", pContractMultiInd);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_CONTRACT_STATUS", pContractStatus);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_LCDE_CODE", pLcdeCode);
			cmd.addParameter("@P_CATY_CODE", pCatyCode);
			cmd.addParameter("@P_CONTRACT_URL", pContractUrl);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
			cmd.addParameter("@P_SEQNO_OUT", NNumber.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();
			pSeqnoOut.val = cmd.getParameterValue("@P_SEQNO_OUT", NNumber.class);


		}
		
		public static void pDelete(NString pBargCode,NString pUnloCode,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BARG_CODE", pBargCode);
			cmd.addParameter("@P_UNLO_CODE", pUnloCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pBargCode,NString pUnloCode,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BARG_CODE", pBargCode);
			cmd.addParameter("@P_UNLO_CODE", pUnloCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pBargCode,NString pUnloCode,NNumber pSeqno,NString pContractTitle,NString pContractMultiInd,NDate pBeginDate,NString pContractStatus,NString pUserId,NDate pEndDate,NString pLcdeCode,NString pCatyCode,NString pContractUrl,NString pComment,NString pText,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_UNION_CONTRACT_INFO.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BARG_CODE", pBargCode);
			cmd.addParameter("@P_UNLO_CODE", pUnloCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_CONTRACT_TITLE", pContractTitle);
			cmd.addParameter("@P_CONTRACT_MULTI_IND", pContractMultiInd);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_CONTRACT_STATUS", pContractStatus);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_LCDE_CODE", pLcdeCode);
			cmd.addParameter("@P_CATY_CODE", pCatyCode);
			cmd.addParameter("@P_CONTRACT_URL", pContractUrl);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="UnionContractInfoRecRow", dataSourceName="UNION_CONTRACT_INFO_REC")
	public static class UnionContractInfoRecRow
	{
		@DbRecordField(dataSourceName="R_BARG_CODE")
		public NString RBargCode;
		@DbRecordField(dataSourceName="R_UNLO_CODE")
		public NString RUnloCode;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_CONTRACT_TITLE")
		public NString RContractTitle;
		@DbRecordField(dataSourceName="R_CONTRACT_MULTI_IND")
		public NString RContractMultiInd;
		@DbRecordField(dataSourceName="R_BEGIN_DATE")
		public NDate RBeginDate;
		@DbRecordField(dataSourceName="R_CONTRACT_STATUS")
		public NString RContractStatus;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_LCDE_CODE")
		public NString RLcdeCode;
		@DbRecordField(dataSourceName="R_CATY_CODE")
		public NString RCatyCode;
		@DbRecordField(dataSourceName="R_CONTRACT_URL")
		public NString RContractUrl;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_TEXT")
		public NString RText;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
