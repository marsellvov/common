package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Goktabs {
	
	
	@DbRecordType(id="MerchIdRecTypeRow", dataSourceName="MERCH_ID_REC_TYPE")
	public static class MerchIdRecTypeRow
	{
		@DbRecordField(dataSourceName="CRITERION1")
		public NString Criterion1;
		@DbRecordField(dataSourceName="CRITERION2")
		public NString Criterion2;
		@DbRecordField(dataSourceName="CRITERION3")
		public NString Criterion3;
		@DbRecordField(dataSourceName="CRITERION4")
		public NString Criterion4;
		@DbRecordField(dataSourceName="CRITERION5")
		public NString Criterion5;
		@DbRecordField(dataSourceName="CRITERION6")
		public NString Criterion6;
		@DbRecordField(dataSourceName="CRITERION7")
		public NString Criterion7;
		@DbRecordField(dataSourceName="CRITERION8")
		public NString Criterion8;
		@DbRecordField(dataSourceName="CRITERION9")
		public NString Criterion9;
		@DbRecordField(dataSourceName="CRITERION10")
		public NString Criterion10;
		@DbRecordField(dataSourceName="PRIORITY")
		public NNumber Priority;
		@DbRecordField(dataSourceName="SUB_CODE")
		public NString SubCode;
	}

	
	
}
