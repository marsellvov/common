package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbGradappPaymentopts {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pGadrCode,NString pWpyoCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GradappPaymentoptsRecRow recOne,GradappPaymentoptsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GradappPaymentoptsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GradappPaymentoptsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pGadrCode,NString pWpyoCode,NString pDetcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_DETC_CODE", pDetcCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pGadrCode,NString pWpyoCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pGadrCode,NString pWpyoCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pGadrCode,NString pWpyoCode,NString pDetcCode,NNumber pChrg,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_DETC_CODE", pDetcCode);
			cmd.addParameter("@P_CHRG", pChrg);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pGadrCode,NString pWpyoCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pGadrCode,NString pWpyoCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pGadrCode,NString pWpyoCode,NString pDetcCode,NNumber pChrg,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_PAYMENTOPTS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GADR_CODE", pGadrCode);
			cmd.addParameter("@P_WPYO_CODE", pWpyoCode);
			cmd.addParameter("@P_DETC_CODE", pDetcCode);
			cmd.addParameter("@P_CHRG", pChrg);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GradappPaymentoptsRecRow", dataSourceName="GRADAPP_PAYMENTOPTS_REC")
	public static class GradappPaymentoptsRecRow
	{
		@DbRecordField(dataSourceName="R_GADR_CODE")
		public NString RGadrCode;
		@DbRecordField(dataSourceName="R_WPYO_CODE")
		public NString RWpyoCode;
		@DbRecordField(dataSourceName="R_DETC_CODE")
		public NString RDetcCode;
		@DbRecordField(dataSourceName="R_CHRG")
		public NNumber RChrg;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
