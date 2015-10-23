package net.hedtech.general.common.dbservices.dbtypes;
import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NClob;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="GtvsdaxRow",dataSourceName="GTVSDAX", rowType=true)
public class GtvsdaxRow
{
	@DbRecordField(dataSourceName="GTVSDAX_EXTERNAL_CODE")
	public NString GtvsdaxExternalCode;
	@DbRecordField(dataSourceName="GTVSDAX_INTERNAL_CODE")
	public NString GtvsdaxInternalCode;
	@DbRecordField(dataSourceName="GTVSDAX_REPORTING_DATE")
	public NDate GtvsdaxReportingDate;
	@DbRecordField(dataSourceName="GTVSDAX_TRANSLATION_CODE")
	public NString GtvsdaxTranslationCode;
	@DbRecordField(dataSourceName="GTVSDAX_INTERNAL_CODE_SEQNO")
	public NNumber GtvsdaxInternalCodeSeqno;
	@DbRecordField(dataSourceName="GTVSDAX_INTERNAL_CODE_GROUP")
	public NString GtvsdaxInternalCodeGroup;
	@DbRecordField(dataSourceName="GTVSDAX_DESC")
	public NString GtvsdaxDesc;
	@DbRecordField(dataSourceName="GTVSDAX_SYSREQ_IND")
	public NString GtvsdaxSysreqInd;
	@DbRecordField(dataSourceName="GTVSDAX_ACTIVITY_DATE")
	public NDate GtvsdaxActivityDate;
	@DbRecordField(dataSourceName="GTVSDAX_SURROGATE_ID")
	public NNumber GtvsdaxSurrogateId;
	@DbRecordField(dataSourceName="GTVSDAX_VERSION")
	public NNumber GtvsdaxVersion;
	@DbRecordField(dataSourceName="GTVSDAX_USER_ID")
	public NString GtvsdaxUserId;
	@DbRecordField(dataSourceName="GTVSDAX_DATA_ORIGIN")
	public NString GtvsdaxDataOrigin;
	@DbRecordField(dataSourceName="GTVSDAX_VPDI_CODE")
	public NString GtvsdaxVpdiCode;
	@DbRecordField(dataSourceName="GTVSDAX_SYSI_CODE")
	public NString GtvsdaxSysiCode;
	@DbRecordField(dataSourceName="GTVSDAX_CONCEPT")
	public NString GtvsdaxConcept;
	@DbRecordField(dataSourceName="GTVSDAX_COMMENTS")
	public NString GtvsdaxComments;

	private TableRow gtvsdaxrow;

	public GtvsdaxRow() {}

	public GtvsdaxRow(TableRow row){

		this.gtvsdaxrow = row;
		this.GtvsdaxExternalCode=gtvsdaxrow.getStr("GTVSDAX_EXTERNAL_CODE");
		this.GtvsdaxInternalCode=gtvsdaxrow.getStr("GTVSDAX_INTERNAL_CODE");
		this.GtvsdaxReportingDate=gtvsdaxrow.getDate("GTVSDAX_REPORTING_DATE");
		this.GtvsdaxTranslationCode=gtvsdaxrow.getStr("GTVSDAX_TRANSLATION_CODE");
		this.GtvsdaxInternalCodeSeqno=gtvsdaxrow.getNumber("GTVSDAX_INTERNAL_CODE_SEQNO");
		this.GtvsdaxInternalCodeGroup=gtvsdaxrow.getStr("GTVSDAX_INTERNAL_CODE_GROUP");
		this.GtvsdaxDesc=gtvsdaxrow.getStr("GTVSDAX_DESC");
		this.GtvsdaxSysreqInd=gtvsdaxrow.getStr("GTVSDAX_SYSREQ_IND");
		this.GtvsdaxActivityDate=gtvsdaxrow.getDate("GTVSDAX_ACTIVITY_DATE");
		this.GtvsdaxSurrogateId=gtvsdaxrow.getNumber("GTVSDAX_SURROGATE_ID");
		this.GtvsdaxVersion=gtvsdaxrow.getNumber("GTVSDAX_VERSION");
		this.GtvsdaxUserId=gtvsdaxrow.getStr("GTVSDAX_USER_ID");
		this.GtvsdaxDataOrigin=gtvsdaxrow.getStr("GTVSDAX_DATA_ORIGIN");
		this.GtvsdaxVpdiCode=gtvsdaxrow.getStr("GTVSDAX_VPDI_CODE");
		this.GtvsdaxSysiCode=gtvsdaxrow.getStr("GTVSDAX_SYSI_CODE");
		this.GtvsdaxConcept=gtvsdaxrow.getStr("GTVSDAX_CONCEPT");
		this.GtvsdaxComments=gtvsdaxrow.getStr("GTVSDAX_COMMENTS");
	}
}
