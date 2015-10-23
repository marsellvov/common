package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpksels {
	
	
	@DbRecordType(id="RprawrdRecTypeRow", dataSourceName="RPRAWRD_REC_TYPE")
	public static class RprawrdRecTypeRow
	{
		@DbRecordField(dataSourceName="RPRAWRD_OFR_AMT")
		public NNumber RprawrdOfrAmt;
		@DbRecordField(dataSourceName="RPRAWRD_ACCEPT_AMT")
		public NNumber RprawrdAcceptAmt;
		@DbRecordField(dataSourceName="RPRAWRD_CANC_AUTH_AMT")
		public NNumber RprawrdCancAuthAmt;
		@DbRecordField(dataSourceName="RPRAWRD_PAID_AMT")
		public NNumber RprawrdPaidAmt;
		@DbRecordField(dataSourceName="RPRAWRD_DECL_AMT")
		public NNumber RprawrdDeclAmt;
	}

	
	
}
