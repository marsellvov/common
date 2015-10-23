package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icgokcom {
		public static NString fCalcLimitedMode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_CALC_LIMITED_MODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcRecstatus(NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_CALC_RECSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcTableVpd(NString tableNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_CALC_TABLE_VPD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME_IN", tableNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcValidLdiTerm(NString termCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_CALC_VALID_LDI_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCalcValidVpdInst(NString instCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_CALC_VALID_VPD_INST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INST_CODE_IN", instCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckevent(NString targetSystem,NString eventCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_CHECKEVENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TARGET_SYSTEM", targetSystem);
			cmd.addParameter("@EVENT_CODE", eventCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<LdiNvNtRow> fCopyNvPairs(List<LdiSnvNtRow> snvIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_COPY_NV_PAIRS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LdiNvNtRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("SNV_IN", "", snvIn, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LdiNvNtRow>.class);
//
//		}
		
//		public static List<GtContextTabTypeRow> fGetContextTab(NString contextIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_GET_CONTEXT_TAB", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<GtContextTabTypeRow>.class);
//			cmd.addParameter("@CONTEXT_IN", contextIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<GtContextTabTypeRow>.class);
//
//		}
		
		public static NString fGetEventVpdConfig(NString eventNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_GET_EVENT_VPD_CONFIG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EVENT_NAME_IN", eventNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGorintgIntpCode(NString integrationCdeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_GET_GORINTG_INTP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INTEGRATION_CDE_IN", integrationCdeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGorrsqlSqruCode(NString roleCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_GET_GORRSQL_SQRU_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ROLE_CODE_IN", roleCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGtvsdaxExtcode(NString internalCodeIn,NString internalCodeGroupIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_GET_GTVSDAX_EXTCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INTERNAL_CODE_IN", internalCodeIn);
			cmd.addParameter("@INTERNAL_CODE_GROUP_IN", internalCodeGroupIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGtvsdaxTranscode(NString internalCodeIn,NString internalCodeGroupIn,NString externalCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_GET_GTVSDAX_TRANSCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INTERNAL_CODE_IN", internalCodeIn);
			cmd.addParameter("@INTERNAL_CODE_GROUP_IN", internalCodeGroupIn);
			cmd.addParameter("@EXTERNAL_CODE_IN", externalCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetIntegrationSource() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_GET_INTEGRATION_SOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetXmlEncoding() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_GET_XML_ENCODING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<LdiSnvNtRow> fGroupLdiNvs(List<LdiSnvNtRow> ldiSnvNtIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_GROUP_LDI_NVS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LdiSnvNtRow>.class);
//			// cmd.addParameter(DbTypes.getCollectionType("LDI_SNV_NT_IN", "", ldiSnvNtIn, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LdiSnvNtRow>.class);
//
//		}
		
		public static NBool fValuesChanged(NString oldValueIn,NString newValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_VALUES_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@OLD_VALUE_IN", oldValueIn);
			cmd.addParameter("@NEW_VALUE_IN", newValueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValuesChanged(NDate oldValueIn,NDate newValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_VALUES_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@OLD_VALUE_IN", oldValueIn);
			cmd.addParameter("@NEW_VALUE_IN", newValueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValuesChanged(NNumber oldValueIn,NNumber newValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_VALUES_CHANGED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@OLD_VALUE_IN", oldValueIn);
			cmd.addParameter("@NEW_VALUE_IN", newValueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fXmlFilter(NString inputVariable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.F_XML_FILTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INPUT_VARIABLE", inputVariable);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCalcSourcedId(NNumber pidmIn,NString autoGenerate,Ref<NString> sourcedId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICGOKCOM.P_CALC_SOURCED_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AUTO_GENERATE", autoGenerate);
			cmd.addParameter("@SOURCED_ID", NString.class);
				
			cmd.execute();
			sourcedId.val = cmd.getParameterValue("@SOURCED_ID", NString.class);


		}
		
	
	
	@DbRecordType(id="GtCodeRecTypeRow", dataSourceName="GT_CODE_REC_TYPE")
	public static class GtCodeRecTypeRow
	{
		@DbRecordField(dataSourceName="CODE")
		public NString Code;
		@DbRecordField(dataSourceName="DESCRIPTION")
		public NString Description;
	}

	
	
}
