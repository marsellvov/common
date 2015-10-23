package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.dbtypes.GvbrdefRecRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvbrdef {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRuleCode,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NNumber pLineNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_LINE_NUM", pLineNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GvbrdefRecRow recOne,GvbrdefRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GvbrdefRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GvbrdefRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pRuleCode,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NNumber pLineNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_LINE_NUM", pLineNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pRuleCode,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NNumber pLineNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_LINE_NUM", pLineNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRuleCode,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NNumber pLineNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_LINE_NUM", pLineNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pRuleCode,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NNumber pLineNum,NString pOperator,NString pValue,NString pOpenParen,NString pCloseParen,NString pSeparator,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_LINE_NUM", pLineNum);
			cmd.addParameter("@P_OPERATOR", pOperator);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_OPEN_PAREN", pOpenParen);
			cmd.addParameter("@P_CLOSE_PAREN", pCloseParen);
			cmd.addParameter("@P_SEPARATOR", pSeparator);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pRuleCode,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NNumber pLineNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_LINE_NUM", pLineNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pRuleCode,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NNumber pLineNum,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_LINE_NUM", pLineNum);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pRuleCode,NString pGsrcCode,NNumber pSdefSeqNum,NNumber pPvacSeqNum,NNumber pLineNum,NString pOperator,NString pValue,NString pOpenParen,NString pCloseParen,NString pSeparator,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVBRDEF.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_SDEF_SEQ_NUM", pSdefSeqNum);
			cmd.addParameter("@P_PVAC_SEQ_NUM", pPvacSeqNum);
			cmd.addParameter("@P_LINE_NUM", pLineNum);
			cmd.addParameter("@P_OPERATOR", pOperator);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_OPEN_PAREN", pOpenParen);
			cmd.addParameter("@P_CLOSE_PAREN", pCloseParen);
			cmd.addParameter("@P_SEPARATOR", pSeparator);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
//	@DbRecordType(id="GvbrdefRecRow", dataSourceName="GVBRDEF_REC", needsInitialization=true)
//	public static class GvbrdefRecRow
//	{
//		@DbRecordField(dataSourceName="R_RULE_CODE")
//		public NString RRuleCode;
//		@DbRecordField(dataSourceName="R_GSRC_CODE")
//		public NString RGsrcCode;
//		@DbRecordField(dataSourceName="R_SDEF_SEQ_NUM")
//		public NNumber RSdefSeqNum;
//		@DbRecordField(dataSourceName="R_PVAC_SEQ_NUM")
//		public NNumber RPvacSeqNum;
//		@DbRecordField(dataSourceName="R_LINE_NUM")
//		public NNumber RLineNum;
//		@DbRecordField(dataSourceName="R_OPERATOR")
//		public NString ROperator;
//		@DbRecordField(dataSourceName="R_VALUE")
//		public NString RValue;
//		@DbRecordField(dataSourceName="R_OPEN_PAREN")
//		public NString ROpenParen;
//		@DbRecordField(dataSourceName="R_CLOSE_PAREN")
//		public NString RCloseParen;
//		@DbRecordField(dataSourceName="R_SEPARATOR")
//		public NString RSeparator;
//		@DbRecordField(dataSourceName="R_USER_ID")
//		public NString RUserId;
//		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
//		public NString RDataOrigin;
//		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
//		public NString RInternalRecordId;
//	}

	
	
}
