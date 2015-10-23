package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbDisplaymask {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pObjsCode,NString pBlockName,NString pColumnName) {
			// DEFAULT NULL
			NNumber pSeqno = NNumber.getNull();
			// DEFAULT NULL
			NString pRowid = NString.getNull();
			
			return fExists(pObjsCode, pBlockName, pColumnName, pSeqno, pRowid);
		}
	
		public static NString fExists(NString pObjsCode,NString pBlockName,NString pColumnName,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(DisplaymaskRecRow recOne,DisplaymaskRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, DisplaymaskRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, DisplaymaskRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pObjsCode,NString pBlockName,NString pColumnName,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pObjsCode,NString pBlockName,NString pColumnName,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pObjsCode,NString pBlockName,NString pColumnName,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fSsbFormatName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.F_SSB_FORMAT_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NString pObjsCode,NString pBlockName,NString pColumnName,Ref<NNumber> pSeqnoOut,NString pDisplayInd,NString pConcealInd,NString pAllUserInd,NString pUserId,NString pDataMask,NString pFgacUserId,NString pFbprCode,NString pMaskDirection,NNumber pMaskLength,NString pObjsCompName,NString pBlockCompName,NString pColumnCompName,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SEQNO_OUT", pSeqnoOut, true);
			cmd.addParameter("@P_DISPLAY_IND", pDisplayInd);
			cmd.addParameter("@P_CONCEAL_IND", pConcealInd);
			cmd.addParameter("@P_ALL_USER_IND", pAllUserInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_MASK", pDataMask);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FBPR_CODE", pFbprCode);
			cmd.addParameter("@P_MASK_DIRECTION", pMaskDirection);
			cmd.addParameter("@P_MASK_LENGTH", pMaskLength);
			cmd.addParameter("@P_OBJS_COMP_NAME", pObjsCompName);
			cmd.addParameter("@P_BLOCK_COMP_NAME", pBlockCompName);
			cmd.addParameter("@P_COLUMN_COMP_NAME", pColumnCompName);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pSeqnoOut.val = cmd.getParameterValue("@P_SEQNO_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pObjsCode,NString pBlockName,NString pColumnName,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pObjsCode,NString pBlockName,NString pColumnName,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pObjsCode,NString pBlockName,NString pColumnName,NNumber pSeqno,NString pDisplayInd,NString pConcealInd,NString pAllUserInd,NString pUserId,NString pDataMask,NString pFgacUserId,NString pFbprCode,NString pMaskDirection,NNumber pMaskLength,NString pObjsCompName,NString pBlockCompName,NString pColumnCompName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYMASK.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DISPLAY_IND", pDisplayInd);
			cmd.addParameter("@P_CONCEAL_IND", pConcealInd);
			cmd.addParameter("@P_ALL_USER_IND", pAllUserInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_MASK", pDataMask);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FBPR_CODE", pFbprCode);
			cmd.addParameter("@P_MASK_DIRECTION", pMaskDirection);
			cmd.addParameter("@P_MASK_LENGTH", pMaskLength);
			cmd.addParameter("@P_OBJS_COMP_NAME", pObjsCompName);
			cmd.addParameter("@P_BLOCK_COMP_NAME", pBlockCompName);
			cmd.addParameter("@P_COLUMN_COMP_NAME", pColumnCompName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="DisplaymaskRecRow", dataSourceName="DISPLAYMASK_REC")
	public static class DisplaymaskRecRow
	{
		@DbRecordField(dataSourceName="R_OBJS_CODE")
		public NString RObjsCode;
		@DbRecordField(dataSourceName="R_BLOCK_NAME")
		public NString RBlockName;
		@DbRecordField(dataSourceName="R_COLUMN_NAME")
		public NString RColumnName;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_DISPLAY_IND")
		public NString RDisplayInd;
		@DbRecordField(dataSourceName="R_CONCEAL_IND")
		public NString RConcealInd;
		@DbRecordField(dataSourceName="R_ALL_USER_IND")
		public NString RAllUserInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_MASK")
		public NString RDataMask;
		@DbRecordField(dataSourceName="R_FGAC_USER_ID")
		public NString RFgacUserId;
		@DbRecordField(dataSourceName="R_FBPR_CODE")
		public NString RFbprCode;
		@DbRecordField(dataSourceName="R_MASK_DIRECTION")
		public NString RMaskDirection;
		@DbRecordField(dataSourceName="R_MASK_LENGTH")
		public NNumber RMaskLength;
		@DbRecordField(dataSourceName="R_OBJS_COMP_NAME")
		public NString RObjsCompName;
		@DbRecordField(dataSourceName="R_BLOCK_COMP_NAME")
		public NString RBlockCompName;
		@DbRecordField(dataSourceName="R_COLUMN_COMP_NAME")
		public NString RColumnCompName;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
