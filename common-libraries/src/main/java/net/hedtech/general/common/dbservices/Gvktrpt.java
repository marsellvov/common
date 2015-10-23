package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gvktrpt {
		public static NString fGetDeceasedString() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKTRPT.F_GET_DECEASED_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEmpDeadInd(NNumber pPidm,NString pLastname,NString pFirstname,NString pNametype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKTRPT.F_GET_EMP_DEAD_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LASTNAME", pLastname);
			cmd.addParameter("@P_FIRSTNAME", pFirstname);
			cmd.addParameter("@P_NAMETYPE", pNametype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static java.sql.RowId fGetEmpLegalName(NNumber pPidm,NString pNameType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKTRPT.F_GET_EMP_LEGAL_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(java.sql.RowId.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_NAME_TYPE", pNameType);
				
			cmd.execute();

			return cmd.getReturnValue(java.sql.RowId.class);

		}
		
		public static NString fNpyreGetId(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKTRPT.F_NPYRE_GET_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pNpyreGetAddressData(NNumber pPidm,NString pTableName,NString pYear,NString pEmprCode,NString pTypeCode,NDate pEffectiveDate,Ref<NString> pSin,Ref<NString> pAddrLine1,Ref<NString> pAddrLine2,Ref<NString> pCity,Ref<NString> pProvince,Ref<NString> pZip,Ref<NString> pNation,Ref<NString> pSlipSerial,Ref<NString> pAmendSeral,Ref<NNumber> pErrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKTRPT.P_NPYRE_GET_ADDRESS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_TYPE_CODE", pTypeCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SIN", NString.class);
			cmd.addParameter("@P_ADDR_LINE1", NString.class);
			cmd.addParameter("@P_ADDR_LINE2", NString.class);
			cmd.addParameter("@P_CITY", NString.class);
			cmd.addParameter("@P_PROVINCE", NString.class);
			cmd.addParameter("@P_ZIP", NString.class);
			cmd.addParameter("@P_NATION", NString.class);
			cmd.addParameter("@P_SLIP_SERIAL", NString.class);
			cmd.addParameter("@P_AMEND_SERAL", NString.class);
			cmd.addParameter("@P_ERR_CODE", NNumber.class);
				
			cmd.execute();
			pSin.val = cmd.getParameterValue("@P_SIN", NString.class);
			pAddrLine1.val = cmd.getParameterValue("@P_ADDR_LINE1", NString.class);
			pAddrLine2.val = cmd.getParameterValue("@P_ADDR_LINE2", NString.class);
			pCity.val = cmd.getParameterValue("@P_CITY", NString.class);
			pProvince.val = cmd.getParameterValue("@P_PROVINCE", NString.class);
			pZip.val = cmd.getParameterValue("@P_ZIP", NString.class);
			pNation.val = cmd.getParameterValue("@P_NATION", NString.class);
			pSlipSerial.val = cmd.getParameterValue("@P_SLIP_SERIAL", NString.class);
			pAmendSeral.val = cmd.getParameterValue("@P_AMEND_SERAL", NString.class);
			pErrCode.val = cmd.getParameterValue("@P_ERR_CODE", NNumber.class);


		}
		
		public static void pNpyreGetBoxValue(NNumber pPidm,NString pTableName,NString pColumnName,NString pYear,NString pEmprCode,NString pTypeCode,NDate pEffectiveDate,Ref<NString> pRetVal,Ref<NNumber> pErrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKTRPT.P_NPYRE_GET_BOX_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_TYPE_CODE", pTypeCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_RET_VAL", NString.class);
			cmd.addParameter("@P_ERR_CODE", NNumber.class);
				
			cmd.execute();
			pRetVal.val = cmd.getParameterValue("@P_RET_VAL", NString.class);
			pErrCode.val = cmd.getParameterValue("@P_ERR_CODE", NNumber.class);


		}
		
	
	
	
}
