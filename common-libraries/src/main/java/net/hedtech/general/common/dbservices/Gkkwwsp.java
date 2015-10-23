package net.hedtech.general.common.dbservices;

import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;

public class Gkkwwsp {
	
	@DbRecordType(id = "WsdlDocRow", dataSourceName = "GKKWWSP.WSDL_DOC")
	public static class WsdlDocRow {
	
		// test
		public WsdlDocRow() {
			super();
		}
	
		@DbRecordField(dataSourceName = "ID")
		public Object Id;
	}

}
