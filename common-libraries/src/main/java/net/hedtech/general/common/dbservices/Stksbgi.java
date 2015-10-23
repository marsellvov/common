package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Stksbgi {
		public static DataCursor fQueryOne(NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSBGI.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NBool fStvsbgiExists(NString pSbgiCode,NString pType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("STKSBGI.F_STVSBGI_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_TYPE", pType);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	@DbRecordType(id="InstitutionRecRow", dataSourceName="INSTITUTION_REC")
	public static class InstitutionRecRow
	{
		@DbRecordField(dataSourceName="R_SBGI_CODE")
		public NString RSbgiCode;
		@DbRecordField(dataSourceName="R_TYPE_IND")
		public NString RTypeInd;
		@DbRecordField(dataSourceName="R_SRCE_IND")
		public NString RSrceInd;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_ADMR_CODE")
		public NString RAdmrCode;
		@DbRecordField(dataSourceName="R_EDI_CAPABLE")
		public NString REdiCapable;
		@DbRecordField(dataSourceName="R_FICE")
		public NString RFice;
		@DbRecordField(dataSourceName="R_VR_MSG_NO")
		public NNumber RVrMsgNo;
		@DbRecordField(dataSourceName="R_STREET_LINE1")
		public NString RStreetLine1;
		@DbRecordField(dataSourceName="R_STREET_LINE2")
		public NString RStreetLine2;
		@DbRecordField(dataSourceName="R_STREET_LINE3")
		public NString RStreetLine3;
		@DbRecordField(dataSourceName="R_CITY")
		public NString RCity;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_CNTY_CODE")
		public NString RCntyCode;
		@DbRecordField(dataSourceName="R_ZIP")
		public NString RZip;
		@DbRecordField(dataSourceName="R_NATN_CODE")
		public NString RNatnCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
