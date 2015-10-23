package net.hedtech.general.common.dbservices.dbtypes;


import org.jfree.util.Log;

import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import static morphis.foundations.core.types.Types.*;

@DbRecordType(id="ExbuprfRow",dataSourceName="EXBUPRF", rowType=true)
public class ExbuprfRow
{
		@DbRecordField(dataSourceName="EXBUPRF_USERNAME")
		public NString ExbuprfUsername;
		@DbRecordField(dataSourceName="EXBUPRF_USE_DEFAULT_PREF_IND")
		public NString ExbuprfUseDefaultPrefInd;
		@DbRecordField(dataSourceName="EXBUPRF_CSB_INVOKES")
		public NString ExbuprfCsbInvokes;
		@DbRecordField(dataSourceName="EXBUPRF_INB_INVOKES")
		public NString ExbuprfInbInvokes;
		@DbRecordField(dataSourceName="EXBUPRF_AX_DOC_SOURCE")
		public NNumber ExbuprfAxDocSource;
		@DbRecordField(dataSourceName="EXBUPRF_WX_DOC_SOURCE")
		public NNumber ExbuprfWxDocSource;
		@DbRecordField(dataSourceName="EXBUPRF_USER_ID")
		public NString ExbuprfUserId;
		@DbRecordField(dataSourceName="EXBUPRF_ACTIVITY_DATE")
		public NDate ExbuprfActivityDate;
		@DbRecordField(dataSourceName="EXBUPRF_SURROGATE_ID")
		public NNumber ExbuprfSurrogateId;
		@DbRecordField(dataSourceName="EXBUPRF_VERSION")
		public NNumber ExbuprfVersion;
		@DbRecordField(dataSourceName="EXBUPRF_DATA_ORIGIN")
		public NString ExbuprfDataOrigin;
		@DbRecordField(dataSourceName="EXBUPRF_VPDI_CODE")
		public NString ExbuprfVpdiCode;

	public ExbuprfRow(){}
	
	public ExbuprfRow(TableRow row){
	
			this.ExbuprfUsername = row.getStr("EXBUPRF_USERNAME");
			this.ExbuprfUseDefaultPrefInd=row.getStr("EXBUPRF_USE_DEFAULT_PREF_IND");
			this.ExbuprfCsbInvokes=row.getStr("EXBUPRF_CSB_INVOKES");
			this.ExbuprfInbInvokes=row.getStr("EXBUPRF_INB_INVOKES");
			this.ExbuprfAxDocSource=row.getNumber("EXBUPRF_AX_DOC_SOURCE");
			this.ExbuprfWxDocSource=row.getNumber("EXBUPRF_WX_DOC_SOURCE");
			this.ExbuprfUserId=row.getStr("EXBUPRF_USER_ID");
			this.ExbuprfActivityDate=row.getDate("EXBUPRF_ACTIVITY_DATE");
			this.ExbuprfSurrogateId=row.getNumber("EXBUPRF_SURROGATE_ID");
			this.ExbuprfVersion=row.getNumber("EXBUPRF_VERSION");
			this.ExbuprfDataOrigin=row.getStr("EXBUPRF_DATA_ORIGIN");
			this.ExbuprfVpdiCode=row.getStr("EXBUPRF_VPDI_CODE");
	}
	
	public ExbuprfRow(ResultSet rs) {
		
		try{
			
		
			this.ExbuprfUsername = rs.getStr("EXBUPRF_USERNAME");
			this.ExbuprfUseDefaultPrefInd = rs.getStr("EXBUPRF_USE_DEFAULT_PREF_IND");
			this.ExbuprfCsbInvokes = rs.getStr("EXBUPRF_CSB_INVOKES");
			this.ExbuprfInbInvokes = rs.getStr("EXBUPRF_INB_INVOKES");
			this.ExbuprfAxDocSource = rs.getNumber("EXBUPRF_AX_DOC_SOURCE");
			this.ExbuprfWxDocSource = rs.getNumber("EXBUPRF_WX_DOC_SOURCE");
			this.ExbuprfUserId = rs.getStr("EXBUPRF_USER_ID");
			this.ExbuprfActivityDate = rs.getDate("EXBUPRF_ACTIVITY_DATE");
			this.ExbuprfSurrogateId = rs.getNumber("EXBUPRF_SURROGATE_ID");
			this.ExbuprfVersion = rs.getNumber("EXBUPRF_VERSION");
			this.ExbuprfDataOrigin = rs.getStr("EXBUPRF_DATA_ORIGIN");
			this.ExbuprfVpdiCode = rs.getStr("EXBUPRF_VPDI_CODE");
		
		} catch (Exception e){
			Log.debug("LL: DbType Created due form Code Completion: ", e);
		}
	}
}
