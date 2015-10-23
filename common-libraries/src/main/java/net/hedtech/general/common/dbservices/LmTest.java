package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class LmTest {
		public static DataCursor fQueryOneAlt(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCdeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pAttrCde,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LM_TEST.F_QUERY_ONE_ALT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CDE_TRNS", pSubjCdeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_ATTR_CDE", pAttrCde);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneOrig(NString pSbgiCode,NString pProgram,NString pTlvlCode,NString pSubjCdeTrns,NString pCrseNumbTrns,NString pTermCodeEffTrns,NString pAttrCde,NString pGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LM_TEST.F_QUERY_ONE_ORIG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_TLVL_CODE", pTlvlCode);
			cmd.addParameter("@P_SUBJ_CDE_TRNS", pSubjCdeTrns);
			cmd.addParameter("@P_CRSE_NUMB_TRNS", pCrseNumbTrns);
			cmd.addParameter("@P_TERM_CODE_EFF_TRNS", pTermCodeEffTrns);
			cmd.addParameter("@P_ATTR_CDE", pAttrCde);
			cmd.addParameter("@P_GROUP", pGroup);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	@DbRecordType(id="TransferCrseAttrRecRow", dataSourceName="TRANSFER_CRSE_ATTR_REC")
	public static class TransferCrseAttrRecRow
	{
		@DbRecordField(dataSourceName="R_PRIMARY_KEY")
		public NNumber RPrimaryKey;
		@DbRecordField(dataSourceName="R_SBGI_CODE")
		public NString RSbgiCode;
		@DbRecordField(dataSourceName="R_PROGRAM")
		public NString RProgram;
		@DbRecordField(dataSourceName="R_TLVL_CODE")
		public NString RTlvlCode;
		@DbRecordField(dataSourceName="R_SUBJ_CDE_TRNS")
		public NString RSubjCdeTrns;
		@DbRecordField(dataSourceName="R_CRSE_NUMB_TRNS")
		public NString RCrseNumbTrns;
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF_TRNS")
		public NString RTermCodeEffTrns;
		@DbRecordField(dataSourceName="R_ATTR_CDE")
		public NString RAttrCde;
		@DbRecordField(dataSourceName="R_ATTR_DESC")
		public NString RAttrDesc;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_GROUP")
		public NString RGroup;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
