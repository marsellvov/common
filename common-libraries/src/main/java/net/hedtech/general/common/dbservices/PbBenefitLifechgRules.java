package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbBenefitLifechgRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_LIFECHG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pBreaCode,NString pBdpgCode,NString pBdcaCode,NString pEnrlBeginDateMethod,NString pWebEmprInd,NString pWebCvgSelInd,NString pWebCvgInsInd,NString pWebCvgUpdInd,NString pWebBalcSelInd,NString pWebBalcInsInd,NString pWebBalcUpdInd,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_LIFECHG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDPG_CODE", pBdpgCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ENRL_BEGIN_DATE_METHOD", pEnrlBeginDateMethod);
			cmd.addParameter("@P_WEB_EMPR_IND", pWebEmprInd);
			cmd.addParameter("@P_WEB_CVG_SEL_IND", pWebCvgSelInd);
			cmd.addParameter("@P_WEB_CVG_INS_IND", pWebCvgInsInd);
			cmd.addParameter("@P_WEB_CVG_UPD_IND", pWebCvgUpdInd);
			cmd.addParameter("@P_WEB_BALC_SEL_IND", pWebBalcSelInd);
			cmd.addParameter("@P_WEB_BALC_INS_IND", pWebBalcInsInd);
			cmd.addParameter("@P_WEB_BALC_UPD_IND", pWebBalcUpdInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pOperationType,NString pBreaCode,NString pBdpgCode,NString pBdcaCode,NString pEnrlBeginDateMethod,NString pWebEmprInd,NString pWebCvgSelInd,NString pWebCvgInsInd,NString pWebCvgUpdInd,NString pWebBalcSelInd,NString pWebBalcInsInd,NString pWebBalcUpdInd,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_BENEFIT_LIFECHG_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_BDPG_CODE", pBdpgCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ENRL_BEGIN_DATE_METHOD", pEnrlBeginDateMethod);
			cmd.addParameter("@P_WEB_EMPR_IND", pWebEmprInd);
			cmd.addParameter("@P_WEB_CVG_SEL_IND", pWebCvgSelInd);
			cmd.addParameter("@P_WEB_CVG_INS_IND", pWebCvgInsInd);
			cmd.addParameter("@P_WEB_CVG_UPD_IND", pWebCvgUpdInd);
			cmd.addParameter("@P_WEB_BALC_SEL_IND", pWebBalcSelInd);
			cmd.addParameter("@P_WEB_BALC_INS_IND", pWebBalcInsInd);
			cmd.addParameter("@P_WEB_BALC_UPD_IND", pWebBalcUpdInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
