package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NString;

@DbRecordType(id="GkrxrotRecRow", dataSourceName="GKRXROT_REC")//, needsInitialization=true)
public class GkrxrotRecRow
{
	@DbRecordField(dataSourceName="R_XPRO_CODE")
	public NString RXproCode;
	@DbRecordField(dataSourceName="R_TABLE_NAME")
	public NString RTableName;
	@DbRecordField(dataSourceName="R_TABLE_DESC")
	public NString RTableDesc;
	@DbRecordField(dataSourceName="R_ROOT_NODE")
	public NString RRootNode;
	@DbRecordField(dataSourceName="R_USER_ID")
	public NString RUserId;
	@DbRecordField(dataSourceName="R_ROOT_NODE_NS")
	public NString RRootNodeNs;
	@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
	public NString RInternalRecordId;
}