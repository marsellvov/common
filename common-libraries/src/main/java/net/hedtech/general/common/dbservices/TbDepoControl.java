package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbDepoControl {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPO_CONTROL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pDetailCodeDeposit,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPO_CONTROL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsData(NString pDetailCodeDeposit,Ref<DepoControlRecRow> pTbbdepcRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPO_CONTROL.F_EXISTS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
			cmd.addParameter(DbTypes.createStructType("P_TBBDEPC_REC_OUT",pTbbdepcRecOut.val ,DepoControlRecRow.class));
				
			cmd.execute();
			pTbbdepcRecOut.val = cmd.getParameterValue("@P_TBBDEPC_REC_OUT", DepoControlRecRow.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pDetailCodeDeposit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPO_CONTROL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPO_CONTROL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pDetailCodeDeposit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPO_CONTROL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pDetailCodeDeposit,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEPO_CONTROL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DETAIL_CODE_DEPOSIT", pDetailCodeDeposit);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	@DbRecordType(id="DepoControlRecRow", dataSourceName="DEPO_CONTROL_REC")
	public static class DepoControlRecRow
	{
		@DbRecordField(dataSourceName="R_DETAIL_CODE_DEPOSIT")
		public NString RDetailCodeDeposit;
		@DbRecordField(dataSourceName="R_DETAIL_CODE_PAYMENT")
		public NString RDetailCodePayment;
		@DbRecordField(dataSourceName="R_AUTO_RELEASE_IND")
		public NString RAutoReleaseInd;
		@DbRecordField(dataSourceName="R_RELEASE_DATE")
		public NDate RReleaseDate;
		@DbRecordField(dataSourceName="R_MIN_AMOUNT")
		public NNumber RMinAmount;
		@DbRecordField(dataSourceName="R_EXPIRATION_DATE")
		public NDate RExpirationDate;
		@DbRecordField(dataSourceName="R_DTYP_CODE")
		public NString RDtypCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
