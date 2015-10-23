package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbBenefitGrpLifechg {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pBreaCode,NString pBdpgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDPG_CODE", pBdpgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(BenefitGrpLifechgRecRow recOne,BenefitGrpLifechgRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, BenefitGrpLifechgRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, BenefitGrpLifechgRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pBreaCode,NString pBdpgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDPG_CODE", pBdpgCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pBreaCode,NString pBdpgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDPG_CODE", pBdpgCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pBreaCode,NString pBdpgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDPG_CODE", pBdpgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pBreaCode,NString pBdpgCode,NString pWebEmprInd,NString pWebCvgSelInd,NString pWebCvgInsInd,NString pWebCvgUpdInd,NString pUserId,NString pDataOrigin,NNumber pPriority,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDPG_CODE", pBdpgCode);
			cmd.addParameter("@P_WEB_EMPR_IND", pWebEmprInd);
			cmd.addParameter("@P_WEB_CVG_SEL_IND", pWebCvgSelInd);
			cmd.addParameter("@P_WEB_CVG_INS_IND", pWebCvgInsInd);
			cmd.addParameter("@P_WEB_CVG_UPD_IND", pWebCvgUpdInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pBreaCode,NString pBdpgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDPG_CODE", pBdpgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pBreaCode,NString pBdpgCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDPG_CODE", pBdpgCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pBreaCode,NString pBdpgCode,NString pWebEmprInd,NString pWebCvgSelInd,NString pWebCvgInsInd,NString pWebCvgUpdInd,NString pUserId,NString pDataOrigin,NNumber pPriority,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_GRP_LIFECHG.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDPG_CODE", pBdpgCode);
			cmd.addParameter("@P_WEB_EMPR_IND", pWebEmprInd);
			cmd.addParameter("@P_WEB_CVG_SEL_IND", pWebCvgSelInd);
			cmd.addParameter("@P_WEB_CVG_INS_IND", pWebCvgInsInd);
			cmd.addParameter("@P_WEB_CVG_UPD_IND", pWebCvgUpdInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="BenefitGrpLifechgRecRow", dataSourceName="BENEFIT_GRP_LIFECHG_REC")
	public static class BenefitGrpLifechgRecRow
	{
		@DbRecordField(dataSourceName="R_BREA_CODE")
		public NString RBreaCode;
		@DbRecordField(dataSourceName="R_BDPG_CODE")
		public NString RBdpgCode;
		@DbRecordField(dataSourceName="R_WEB_EMPR_IND")
		public NString RWebEmprInd;
		@DbRecordField(dataSourceName="R_WEB_CVG_SEL_IND")
		public NString RWebCvgSelInd;
		@DbRecordField(dataSourceName="R_WEB_CVG_INS_IND")
		public NString RWebCvgInsInd;
		@DbRecordField(dataSourceName="R_WEB_CVG_UPD_IND")
		public NString RWebCvgUpdInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PRIORITY")
		public NNumber RPriority;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
