package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvTd1Roll {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTgrpCodeFrom,NString pTgrpCodeTo,NString pTxcdCode,NString pTcrdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TGRP_CODE_FROM", pTgrpCodeFrom);
			cmd.addParameter("@P_TGRP_CODE_TO", pTgrpCodeTo);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(Td1RollRecRow recOne,Td1RollRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, Td1RollRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, Td1RollRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTgrpCodeFrom,NString pTgrpCodeTo,NString pTxcdCode,NString pTcrdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TGRP_CODE_FROM", pTgrpCodeFrom);
			cmd.addParameter("@P_TGRP_CODE_TO", pTgrpCodeTo);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTgrpCodeFrom,NString pTgrpCodeTo,NString pTxcdCode,NString pTcrdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TGRP_CODE_FROM", pTgrpCodeFrom);
			cmd.addParameter("@P_TGRP_CODE_TO", pTgrpCodeTo);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTgrpCodeFrom,NString pTgrpCodeTo,NString pTxcdCode,NString pTcrdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TGRP_CODE_FROM", pTgrpCodeFrom);
			cmd.addParameter("@P_TGRP_CODE_TO", pTgrpCodeTo);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTgrpCodeFrom,NString pTgrpCodeTo,NString pTxcdCode,NString pTcrdCode,NString pIncDecInd,NNumber pAmount,NNumber pPercent,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE_FROM", pTgrpCodeFrom);
			cmd.addParameter("@P_TGRP_CODE_TO", pTgrpCodeTo);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_INC_DEC_IND", pIncDecInd);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTgrpCodeFrom,NString pTgrpCodeTo,NString pTxcdCode,NString pTcrdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE_FROM", pTgrpCodeFrom);
			cmd.addParameter("@P_TGRP_CODE_TO", pTgrpCodeTo);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTgrpCodeFrom,NString pTgrpCodeTo,NString pTxcdCode,NString pTcrdCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE_FROM", pTgrpCodeFrom);
			cmd.addParameter("@P_TGRP_CODE_TO", pTgrpCodeTo);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTgrpCodeFrom,NString pTgrpCodeTo,NString pTxcdCode,NString pTcrdCode,NString pIncDecInd,NNumber pAmount,NNumber pPercent,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_TD1_ROLL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TGRP_CODE_FROM", pTgrpCodeFrom);
			cmd.addParameter("@P_TGRP_CODE_TO", pTgrpCodeTo);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_TCRD_CODE", pTcrdCode);
			cmd.addParameter("@P_INC_DEC_IND", pIncDecInd);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="Td1RollRecRow", dataSourceName="TD1_ROLL_REC", needsInitialization=true)
	public static class Td1RollRecRow
	{
		@DbRecordField(dataSourceName="R_TGRP_CODE_FROM")
		public NString RTgrpCodeFrom;
		@DbRecordField(dataSourceName="R_TGRP_CODE_TO")
		public NString RTgrpCodeTo;
		@DbRecordField(dataSourceName="R_TXCD_CODE")
		public NString RTxcdCode;
		@DbRecordField(dataSourceName="R_TCRD_CODE")
		public NString RTcrdCode;
		@DbRecordField(dataSourceName="R_INC_DEC_IND")
		public NString RIncDecInd;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_PERCENT")
		public NNumber RPercent;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
