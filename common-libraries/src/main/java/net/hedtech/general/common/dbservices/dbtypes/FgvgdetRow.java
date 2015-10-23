package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id = "FgvgdetRow", dataSourceName = "FGVGDET", rowType = true)
public class FgvgdetRow {
	@DbRecordField(dataSourceName = "FGVGDET_REPORT_TYPE")
	public NString FgvgdetReportType;
	@DbRecordField(dataSourceName = "FGVGDET_COAS_CODE")
	public NString FgvgdetCoasCode;
	@DbRecordField(dataSourceName = "FGVGDET_FSYR_CODE")
	public NString FgvgdetFsyrCode;
	@DbRecordField(dataSourceName = "FGVGDET_FSPD_CODE")
	public NString FgvgdetFspdCode;
	@DbRecordField(dataSourceName = "FGVGDET_FUND_CODE")
	public NString FgvgdetFundCode;
	@DbRecordField(dataSourceName = "FGVGDET_FUND_TITLE")
	public NString FgvgdetFundTitle;
	@DbRecordField(dataSourceName = "FGVGDET_FUND_HIER_CODE")
	public NString FgvgdetFundHierCode;
	@DbRecordField(dataSourceName = "FGVGDET_FUND_HIER_TITLE")
	public NString FgvgdetFundHierTitle;
	@DbRecordField(dataSourceName = "FGVGDET_FTYP_CODE")
	public NString FgvgdetFtypCode;
	@DbRecordField(dataSourceName = "FGVGDET_FTYP_TITLE")
	public NString FgvgdetFtypTitle;
	@DbRecordField(dataSourceName = "FGVGDET_FUND_ATTT_CODE")
	public NString FgvgdetFundAtttCode;
	@DbRecordField(dataSourceName = "FGVGDET_FUND_ATTV_CODE")
	public NString FgvgdetFundAttvCode;
	@DbRecordField(dataSourceName = "FGVGDET_ACCT_CODE")
	public NString FgvgdetAcctCode;
	@DbRecordField(dataSourceName = "FGVGDET_ACCT_TITLE")
	public NString FgvgdetAcctTitle;
	@DbRecordField(dataSourceName = "FGVGDET_ACCT_HIER_CODE")
	public NString FgvgdetAcctHierCode;
	@DbRecordField(dataSourceName = "FGVGDET_ACCT_HIER_TITLE")
	public NString FgvgdetAcctHierTitle;
	@DbRecordField(dataSourceName = "FGVGDET_ATYP_CODE")
	public NString FgvgdetAtypCode;
	@DbRecordField(dataSourceName = "FGVGDET_ATYP_TITLE")
	public NString FgvgdetAtypTitle;
	@DbRecordField(dataSourceName = "FGVGDET_INT_ATYP_CODE")
	public NString FgvgdetIntAtypCode;
	@DbRecordField(dataSourceName = "FGVGDET_ACCT_ATTT_CODE")
	public NString FgvgdetAcctAtttCode;
	@DbRecordField(dataSourceName = "FGVGDET_ACCT_ATTV_CODE")
	public NString FgvgdetAcctAttvCode;
	@DbRecordField(dataSourceName = "FGVGDET_PROG_CODE")
	public NString FgvgdetProgCode;
	@DbRecordField(dataSourceName = "FGVGDET_PROG_TITLE")
	public NString FgvgdetProgTitle;
	@DbRecordField(dataSourceName = "FGVGDET_PROG_HIER_CODE")
	public NString FgvgdetProgHierCode;
	@DbRecordField(dataSourceName = "FGVGDET_PROG_HIER_TITLE")
	public NString FgvgdetProgHierTitle;
	@DbRecordField(dataSourceName = "FGVGDET_PROG_ATTT_CODE")
	public NString FgvgdetProgAtttCode;
	@DbRecordField(dataSourceName = "FGVGDET_PROG_ATTV_CODE")
	public NString FgvgdetProgAttvCode;
	@DbRecordField(dataSourceName = "FGVGDET_LEDG_AMT")
	public NNumber FgvgdetLedgAmt;
	@DbRecordField(dataSourceName = "FGVGDET_GASB_AMT")
	public NNumber FgvgdetGasbAmt;
	@DbRecordField(dataSourceName = "FGVGDET_NET_ASSET_ACCT_CODE")
	public NString FgvgdetNetAssetAcctCode;
	@DbRecordField(dataSourceName = "FGVGDET_NET_ASSET_ATTT_CODE")
	public NString FgvgdetNetAssetAtttCode;
	@DbRecordField(dataSourceName = "FGVGDET_NET_ASSET_ATTV_CODE")
	public NString FgvgdetNetAssetAttvCode;
	@DbRecordField(dataSourceName = "FGVGDET_NET_ASSET_LEDG_AMT")
	public NNumber FgvgdetNetAssetLedgAmt;
	@DbRecordField(dataSourceName = "FGVGDET_NET_ASSET_GASB_AMT")
	public NNumber FgvgdetNetAssetGasbAmt;
	@DbRecordField(dataSourceName = "FGVGDET_LEDGER_OR_RECLASS")
	public NString FgvgdetLedgerOrReclass;

	public FgvgdetRow() {
	}

	public FgvgdetRow(TableRow row) {

		this.FgvgdetReportType = row.getStr("FGVGDET_REPORT_TYPE");
		this.FgvgdetCoasCode = row.getStr("FGVGDET_COAS_CODE");
		this.FgvgdetFsyrCode = row.getStr("FGVGDET_FSYR_CODE");
		this.FgvgdetFspdCode = row.getStr("FGVGDET_FSPD_CODE");
		this.FgvgdetFundCode = row.getStr("FGVGDET_FUND_CODE");
		this.FgvgdetFundTitle = row.getStr("FGVGDET_FUND_TITLE");
		this.FgvgdetFundHierCode = row.getStr("FGVGDET_FUND_HIER_CODE");
		this.FgvgdetFundHierTitle = row.getStr("FGVGDET_FUND_HIER_TITLE");
		this.FgvgdetFtypCode = row.getStr("FGVGDET_FTYP_CODE");
		this.FgvgdetFtypTitle = row.getStr("FGVGDET_FTYP_TITLE");
		this.FgvgdetFundAtttCode = row.getStr("FGVGDET_FUND_ATTT_CODE");
		this.FgvgdetFundAttvCode = row.getStr("FGVGDET_FUND_ATTV_CODE");
		this.FgvgdetAcctCode = row.getStr("FGVGDET_ACCT_CODE");
		this.FgvgdetAcctTitle = row.getStr("FGVGDET_ACCT_TITLE");
		this.FgvgdetAcctHierCode = row.getStr("FGVGDET_ACCT_HIER_CODE");
		this.FgvgdetAcctHierTitle = row.getStr("FGVGDET_ACCT_HIER_TITLE");
		this.FgvgdetAtypCode = row.getStr("FGVGDET_ATYP_CODE");
		this.FgvgdetAtypTitle = row.getStr("FGVGDET_ATYP_TITLE");
		this.FgvgdetIntAtypCode = row.getStr("FGVGDET_INT_ATYP_CODE");
		this.FgvgdetAcctAtttCode = row.getStr("FGVGDET_ACCT_ATTT_CODE");
		this.FgvgdetAcctAttvCode = row.getStr("FGVGDET_ACCT_ATTV_CODE");
		this.FgvgdetProgCode = row.getStr("FGVGDET_PROG_CODE");
		this.FgvgdetProgTitle = row.getStr("FGVGDET_PROG_TITLE");
		this.FgvgdetProgHierCode = row.getStr("FGVGDET_PROG_HIER_CODE");
		this.FgvgdetProgHierTitle = row.getStr("FGVGDET_PROG_HIER_TITLE");
		this.FgvgdetProgAtttCode = row.getStr("FGVGDET_PROG_ATTT_CODE");
		this.FgvgdetProgAttvCode = row.getStr("FGVGDET_PROG_ATTV_CODE");
		this.FgvgdetLedgAmt = row.getNumber("FGVGDET_LEDG_AMT");
		this.FgvgdetGasbAmt = row.getNumber("FGVGDET_GASB_AMT");
		this.FgvgdetNetAssetAcctCode = row.getStr("FGVGDET_NET_ASSET_ACCT_CODE");
		this.FgvgdetNetAssetAtttCode = row.getStr("FGVGDET_NET_ASSET_ATTT_CODE");
		this.FgvgdetNetAssetAttvCode = row.getStr("FGVGDET_NET_ASSET_ATTV_CODE");
		this.FgvgdetNetAssetLedgAmt = row.getNumber("FGVGDET_NET_ASSET_LEDG_AMT");
		this.FgvgdetNetAssetGasbAmt = row.getNumber("FGVGDET_NET_ASSET_GASB_AMT");
		this.FgvgdetLedgerOrReclass = row.getStr("FGVGDET_LEDGER_OR_RECLASS");
	}
}
