package net.hedtech.general.common.dbservices.dbtypes;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;

	
	@DbRecordType(id="FileTypeRow", dataSourceName="FILE_TYPE", rowType=true)
	public class FileTypeRow
	{
		@DbRecordField(dataSourceName="FT_ID")
		public NNumber FtId;
		@DbRecordField(dataSourceName="LINK")
		public NString Link;
		@DbRecordField(dataSourceName="NAME")
		public NString _Name;
	}
