package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbGradappDisplayrule {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GradappDisplayruleRecRow recOne,GradappDisplayruleRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GradappDisplayruleRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GradappDisplayruleRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCode,NString pTprtCode,NString pGradDateDispInd,NString pGradTermDispInd,NString pGradYearDispInd,NString pGastCode,NString pLetrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_GRAD_DATE_DISP_IND", pGradDateDispInd);
			cmd.addParameter("@P_GRAD_TERM_DISP_IND", pGradTermDispInd);
			cmd.addParameter("@P_GRAD_YEAR_DISP_IND", pGradYearDispInd);
			cmd.addParameter("@P_GAST_CODE", pGastCode);
			cmd.addParameter("@P_LETR_CODE", pLetrCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCode,NString pTprtCode,NString pGradDateDispInd,NString pGradTermDispInd,NString pGradYearDispInd,NString pGastCode,NString pDgmrUpdInd,NString pDispDiplNameWebInd,NString pDispNameCde,NString pDispMiddleCde,NString pDispSuffixInd,NString pDispDiplNameInd,NString pDispDiplUpdNameInd,NString pDispUpdFirstInd,NString pDispUpdMiddleInd,NString pDispUpdLastInd,NString pDispUpdSuffixInd,NString pDispDiplAddrWebInd,NString pDispDiplAddrInd,NString pDispDiplUpdAddrInd,NString pChargeInd,NString pUserId,NString pLetrCode,NString pDispNameNtypCode,NString pDgmrUpdGrstCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_GRAD_DATE_DISP_IND", pGradDateDispInd);
			cmd.addParameter("@P_GRAD_TERM_DISP_IND", pGradTermDispInd);
			cmd.addParameter("@P_GRAD_YEAR_DISP_IND", pGradYearDispInd);
			cmd.addParameter("@P_GAST_CODE", pGastCode);
			cmd.addParameter("@P_DGMR_UPD_IND", pDgmrUpdInd);
			cmd.addParameter("@P_DISP_DIPL_NAME_WEB_IND", pDispDiplNameWebInd);
			cmd.addParameter("@P_DISP_NAME_CDE", pDispNameCde);
			cmd.addParameter("@P_DISP_MIDDLE_CDE", pDispMiddleCde);
			cmd.addParameter("@P_DISP_SUFFIX_IND", pDispSuffixInd);
			cmd.addParameter("@P_DISP_DIPL_NAME_IND", pDispDiplNameInd);
			cmd.addParameter("@P_DISP_DIPL_UPD_NAME_IND", pDispDiplUpdNameInd);
			cmd.addParameter("@P_DISP_UPD_FIRST_IND", pDispUpdFirstInd);
			cmd.addParameter("@P_DISP_UPD_MIDDLE_IND", pDispUpdMiddleInd);
			cmd.addParameter("@P_DISP_UPD_LAST_IND", pDispUpdLastInd);
			cmd.addParameter("@P_DISP_UPD_SUFFIX_IND", pDispUpdSuffixInd);
			cmd.addParameter("@P_DISP_DIPL_ADDR_WEB_IND", pDispDiplAddrWebInd);
			cmd.addParameter("@P_DISP_DIPL_ADDR_IND", pDispDiplAddrInd);
			cmd.addParameter("@P_DISP_DIPL_UPD_ADDR_IND", pDispDiplUpdAddrInd);
			cmd.addParameter("@P_CHARGE_IND", pChargeInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LETR_CODE", pLetrCode);
			cmd.addParameter("@P_DISP_NAME_NTYP_CODE", pDispNameNtypCode);
			cmd.addParameter("@P_DGMR_UPD_GRST_CODE", pDgmrUpdGrstCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCode,NString pTprtCode,NString pGradDateDispInd,NString pGradTermDispInd,NString pGradYearDispInd,NString pGastCode,NString pDgmrUpdInd,NString pDispDiplNameWebInd,NString pDispNameCde,NString pDispMiddleCde,NString pDispSuffixInd,NString pDispDiplNameInd,NString pDispDiplUpdNameInd,NString pDispUpdFirstInd,NString pDispUpdMiddleInd,NString pDispUpdLastInd,NString pDispUpdSuffixInd,NString pDispDiplAddrWebInd,NString pDispDiplAddrInd,NString pDispDiplUpdAddrInd,NString pChargeInd,NString pUserId,NString pLetrCode,NString pDispNameNtypCode,NString pDgmrUpdGrstCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_GRAD_DATE_DISP_IND", pGradDateDispInd);
			cmd.addParameter("@P_GRAD_TERM_DISP_IND", pGradTermDispInd);
			cmd.addParameter("@P_GRAD_YEAR_DISP_IND", pGradYearDispInd);
			cmd.addParameter("@P_GAST_CODE", pGastCode);
			cmd.addParameter("@P_DGMR_UPD_IND", pDgmrUpdInd);
			cmd.addParameter("@P_DISP_DIPL_NAME_WEB_IND", pDispDiplNameWebInd);
			cmd.addParameter("@P_DISP_NAME_CDE", pDispNameCde);
			cmd.addParameter("@P_DISP_MIDDLE_CDE", pDispMiddleCde);
			cmd.addParameter("@P_DISP_SUFFIX_IND", pDispSuffixInd);
			cmd.addParameter("@P_DISP_DIPL_NAME_IND", pDispDiplNameInd);
			cmd.addParameter("@P_DISP_DIPL_UPD_NAME_IND", pDispDiplUpdNameInd);
			cmd.addParameter("@P_DISP_UPD_FIRST_IND", pDispUpdFirstInd);
			cmd.addParameter("@P_DISP_UPD_MIDDLE_IND", pDispUpdMiddleInd);
			cmd.addParameter("@P_DISP_UPD_LAST_IND", pDispUpdLastInd);
			cmd.addParameter("@P_DISP_UPD_SUFFIX_IND", pDispUpdSuffixInd);
			cmd.addParameter("@P_DISP_DIPL_ADDR_WEB_IND", pDispDiplAddrWebInd);
			cmd.addParameter("@P_DISP_DIPL_ADDR_IND", pDispDiplAddrInd);
			cmd.addParameter("@P_DISP_DIPL_UPD_ADDR_IND", pDispDiplUpdAddrInd);
			cmd.addParameter("@P_CHARGE_IND", pChargeInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LETR_CODE", pLetrCode);
			cmd.addParameter("@P_DISP_NAME_NTYP_CODE", pDispNameNtypCode);
			cmd.addParameter("@P_DGMR_UPD_GRST_CODE", pDgmrUpdGrstCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GradappDisplayruleRecRow", dataSourceName="GRADAPP_DISPLAYRULE_REC")
	public static class GradappDisplayruleRecRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_TPRT_CODE")
		public NString RTprtCode;
		@DbRecordField(dataSourceName="R_GRAD_DATE_DISP_IND")
		public NString RGradDateDispInd;
		@DbRecordField(dataSourceName="R_GRAD_TERM_DISP_IND")
		public NString RGradTermDispInd;
		@DbRecordField(dataSourceName="R_GRAD_YEAR_DISP_IND")
		public NString RGradYearDispInd;
		@DbRecordField(dataSourceName="R_GAST_CODE")
		public NString RGastCode;
		@DbRecordField(dataSourceName="R_DGMR_UPD_IND")
		public NString RDgmrUpdInd;
		@DbRecordField(dataSourceName="R_DISP_DIPL_NAME_WEB_IND")
		public NString RDispDiplNameWebInd;
		@DbRecordField(dataSourceName="R_DISP_NAME_CDE")
		public NString RDispNameCde;
		@DbRecordField(dataSourceName="R_DISP_MIDDLE_CDE")
		public NString RDispMiddleCde;
		@DbRecordField(dataSourceName="R_DISP_SUFFIX_IND")
		public NString RDispSuffixInd;
		@DbRecordField(dataSourceName="R_DISP_DIPL_NAME_IND")
		public NString RDispDiplNameInd;
		@DbRecordField(dataSourceName="R_DISP_DIPL_UPD_NAME_IND")
		public NString RDispDiplUpdNameInd;
		@DbRecordField(dataSourceName="R_DISP_UPD_FIRST_IND")
		public NString RDispUpdFirstInd;
		@DbRecordField(dataSourceName="R_DISP_UPD_MIDDLE_IND")
		public NString RDispUpdMiddleInd;
		@DbRecordField(dataSourceName="R_DISP_UPD_LAST_IND")
		public NString RDispUpdLastInd;
		@DbRecordField(dataSourceName="R_DISP_UPD_SUFFIX_IND")
		public NString RDispUpdSuffixInd;
		@DbRecordField(dataSourceName="R_DISP_DIPL_ADDR_WEB_IND")
		public NString RDispDiplAddrWebInd;
		@DbRecordField(dataSourceName="R_DISP_DIPL_ADDR_IND")
		public NString RDispDiplAddrInd;
		@DbRecordField(dataSourceName="R_DISP_DIPL_UPD_ADDR_IND")
		public NString RDispDiplUpdAddrInd;
		@DbRecordField(dataSourceName="R_CHARGE_IND")
		public NString RChargeInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_LETR_CODE")
		public NString RLetrCode;
		@DbRecordField(dataSourceName="R_DISP_NAME_NTYP_CODE")
		public NString RDispNameNtypCode;
		@DbRecordField(dataSourceName="R_DGMR_UPD_GRST_CODE")
		public NString RDgmrUpdGrstCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
