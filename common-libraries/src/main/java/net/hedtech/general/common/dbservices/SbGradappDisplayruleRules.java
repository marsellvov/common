package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbGradappDisplayruleRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCode,NString pTprtCode,NString pGradDateDispInd,NString pGradTermDispInd,NString pGradYearDispInd,NString pGastCode,NString pDgmrUpdInd,NString pDispDiplNameWebInd,NString pDispNameCde,NString pDispMiddleCde,NString pDispSuffixInd,NString pDispDiplNameInd,NString pDispDiplUpdNameInd,NString pDispUpdFirstInd,NString pDispUpdMiddleInd,NString pDispUpdLastInd,NString pDispUpdSuffixInd,NString pDispDiplAddrWebInd,NString pDispDiplAddrInd,NString pDispDiplUpdAddrInd,NString pChargeInd,NString pUserId,NString pLetrCode,NString pDispNameNtypCode,NString pDgmrUpdGrstCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCode,NString pTprtCode,NString pGradDateDispInd,NString pGradTermDispInd,NString pGradYearDispInd,NString pGastCode,NString pDgmrUpdInd,NString pDispDiplNameWebInd,NString pDispNameCde,NString pDispMiddleCde,NString pDispSuffixInd,NString pDispDiplNameInd,NString pDispDiplUpdNameInd,NString pDispUpdFirstInd,NString pDispUpdMiddleInd,NString pDispUpdLastInd,NString pDispUpdSuffixInd,NString pDispDiplAddrWebInd,NString pDispDiplAddrInd,NString pDispDiplUpdAddrInd,NString pChargeInd,NString pUserId,NString pLetrCode,NString pDispNameNtypCode,NString pDgmrUpdGrstCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_DISPLAYRULE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
