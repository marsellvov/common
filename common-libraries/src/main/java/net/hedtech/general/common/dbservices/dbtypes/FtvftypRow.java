package net.hedtech.general.common.dbservices.dbtypes;

import morphis.foundations.core.appdatalayer.data.TableRow;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;

@DbRecordType(id="FtvftypRow",dataSourceName="FTVFTYP", rowType=true)
public class FtvftypRow
{
	@DbRecordField(dataSourceName="FTVFTYP_COAS_CODE")
	public NString FtvftypCoasCode;
	@DbRecordField(dataSourceName="FTVFTYP_FTYP_CODE")
	public NString FtvftypFtypCode;
	@DbRecordField(dataSourceName="FTVFTYP_EFF_DATE")
	public NDate FtvftypEffDate;
	@DbRecordField(dataSourceName="FTVFTYP_ACTIVITY_DATE")
	public NDate FtvftypActivityDate;
	@DbRecordField(dataSourceName="FTVFTYP_USER_ID")
	public NString FtvftypUserId;
	@DbRecordField(dataSourceName="FTVFTYP_NCHG_DATE")
	public NDate FtvftypNchgDate;
	@DbRecordField(dataSourceName="FTVFTYP_TITLE")
	public NString FtvftypTitle;
	@DbRecordField(dataSourceName="FTVFTYP_STATUS_IND")
	public NString FtvftypStatusInd;
	@DbRecordField(dataSourceName="FTVFTYP_INTERNAL_FTYP_CODE")
	public NString FtvftypInternalFtypCode;
	@DbRecordField(dataSourceName="FTVFTYP_TERM_DATE")
	public NDate FtvftypTermDate;
	@DbRecordField(dataSourceName="FTVFTYP_FTYP_CODE_PRED")
	public NString FtvftypFtypCodePred;
	@DbRecordField(dataSourceName="FTVFTYP_FUND_CODE_CAP")
	public NString FtvftypFundCodeCap;
	@DbRecordField(dataSourceName="FTVFTYP_ACCT_CODE_CAP")
	public NString FtvftypAcctCodeCap;
	@DbRecordField(dataSourceName="FTVFTYP_BAVL_KEY_FUND")
	public NString FtvftypBavlKeyFund;
	@DbRecordField(dataSourceName="FTVFTYP_BAVL_KEY_ORG")
	public NString FtvftypBavlKeyOrg;
	@DbRecordField(dataSourceName="FTVFTYP_BAVL_KEY_ACCT")
	public NString FtvftypBavlKeyAcct;
	@DbRecordField(dataSourceName="FTVFTYP_BAVL_KEY_PROG")
	public NString FtvftypBavlKeyProg;
	@DbRecordField(dataSourceName="FTVFTYP_BAVL_PERIOD")
	public NString FtvftypBavlPeriod;
	@DbRecordField(dataSourceName="FTVFTYP_BAVL_SEVERITY")
	public NString FtvftypBavlSeverity;
	@DbRecordField(dataSourceName="FTVFTYP_DEF_OVERRIDE_IND")
	public NString FtvftypDefOverrideInd;
	@DbRecordField(dataSourceName="FTVFTYP_RUCL_CODE_ROLL_ENC")
	public NString FtvftypRuclCodeRollEnc;
	@DbRecordField(dataSourceName="FTVFTYP_COMMIT_TYPE")
	public NString FtvftypCommitType;
	@DbRecordField(dataSourceName="FTVFTYP_BUDGET_ROLL")
	public NString FtvftypBudgetRoll;
	@DbRecordField(dataSourceName="FTVFTYP_BUDGET_DISPOSITION")
	public NString FtvftypBudgetDisposition;
	@DbRecordField(dataSourceName="FTVFTYP_BUDGET_ROLL_PERCENT")
	public NNumber FtvftypBudgetRollPercent;
	@DbRecordField(dataSourceName="FTVFTYP_RUCL_CODE_BUDG_CF")
	public NString FtvftypRuclCodeBudgCf;
	@DbRecordField(dataSourceName="FTVFTYP_CF_TYPE")
	public NString FtvftypCfType;
	@DbRecordField(dataSourceName="FTVFTYP_BUDG_CLASSIFICATION")
	public NString FtvftypBudgClassification;
	@DbRecordField(dataSourceName="FTVFTYP_BUDG_CF_PERCENT")
	public NNumber FtvftypBudgCfPercent;
	@DbRecordField(dataSourceName="FTVFTYP_ACCT_CODE_GAIN")
	public NString FtvftypAcctCodeGain;
	@DbRecordField(dataSourceName="FTVFTYP_ACCT_CODE_LOSS")
	public NString FtvftypAcctCodeLoss;
	@DbRecordField(dataSourceName="FTVFTYP_DEPR_POST_CODE")
	public NString FtvftypDeprPostCode;
	@DbRecordField(dataSourceName="FTVFTYP_ORGN_CODE_CAP_DEF")
	public NString FtvftypOrgnCodeCapDef;
	@DbRecordField(dataSourceName="FTVFTYP_PROG_CODE_CAP_DEF")
	public NString FtvftypProgCodeCapDef;
	@DbRecordField(dataSourceName="FTVFTYP_ACTV_CODE_CAP_DEF")
	public NString FtvftypActvCodeCapDef;
	@DbRecordField(dataSourceName="FTVFTYP_LOCN_CODE_CAP_DEF")
	public NString FtvftypLocnCodeCapDef;
	@DbRecordField(dataSourceName="FTVFTYP_DEPR_EXP_EQ_DEF_IND")
	public NString FtvftypDeprExpEqDefInd;
	@DbRecordField(dataSourceName="FTVFTYP_ENC_MULT_YR_IND")
	public NString FtvftypEncMultYrInd;
	@DbRecordField(dataSourceName="FTVFTYP_SURROGATE_ID")
	public NNumber FtvftypSurrogateId;
	@DbRecordField(dataSourceName="FTVFTYP_VERSION")
	public NNumber FtvftypVersion;
	@DbRecordField(dataSourceName="FTVFTYP_DATA_ORIGIN")
	public NString FtvftypDataOrigin;
	@DbRecordField(dataSourceName="FTVFTYP_VPDI_CODE")
	public NString FtvftypVpdiCode;

	public FtvftypRow(){}

	public FtvftypRow(TableRow row){

		this.FtvftypCoasCode=row.getStr("FTVFTYP_COAS_CODE");
		this.FtvftypFtypCode=row.getStr("FTVFTYP_FTYP_CODE");
		this.FtvftypEffDate=row.getDate("FTVFTYP_EFF_DATE");
		this.FtvftypActivityDate=row.getDate("FTVFTYP_ACTIVITY_DATE");
		this.FtvftypUserId=row.getStr("FTVFTYP_USER_ID");
		this.FtvftypNchgDate=row.getDate("FTVFTYP_NCHG_DATE");
		this.FtvftypTitle=row.getStr("FTVFTYP_TITLE");
		this.FtvftypStatusInd=row.getStr("FTVFTYP_STATUS_IND");
		this.FtvftypInternalFtypCode=row.getStr("FTVFTYP_INTERNAL_FTYP_CODE");
		this.FtvftypTermDate=row.getDate("FTVFTYP_TERM_DATE");
		this.FtvftypFtypCodePred=row.getStr("FTVFTYP_FTYP_CODE_PRED");
		this.FtvftypFundCodeCap=row.getStr("FTVFTYP_FUND_CODE_CAP");
		this.FtvftypAcctCodeCap=row.getStr("FTVFTYP_ACCT_CODE_CAP");
		this.FtvftypBavlKeyFund=row.getStr("FTVFTYP_BAVL_KEY_FUND");
		this.FtvftypBavlKeyOrg=row.getStr("FTVFTYP_BAVL_KEY_ORG");
		this.FtvftypBavlKeyAcct=row.getStr("FTVFTYP_BAVL_KEY_ACCT");
		this.FtvftypBavlKeyProg=row.getStr("FTVFTYP_BAVL_KEY_PROG");
		this.FtvftypBavlPeriod=row.getStr("FTVFTYP_BAVL_PERIOD");
		this.FtvftypBavlSeverity=row.getStr("FTVFTYP_BAVL_SEVERITY");
		this.FtvftypDefOverrideInd=row.getStr("FTVFTYP_DEF_OVERRIDE_IND");
		this.FtvftypRuclCodeRollEnc=row.getStr("FTVFTYP_RUCL_CODE_ROLL_ENC");
		this.FtvftypCommitType=row.getStr("FTVFTYP_COMMIT_TYPE");
		this.FtvftypBudgetRoll=row.getStr("FTVFTYP_BUDGET_ROLL");
		this.FtvftypBudgetDisposition=row.getStr("FTVFTYP_BUDGET_DISPOSITION");
		this.FtvftypBudgetRollPercent=row.getNumber("FTVFTYP_BUDGET_ROLL_PERCENT");
		this.FtvftypRuclCodeBudgCf=row.getStr("FTVFTYP_RUCL_CODE_BUDG_CF");
		this.FtvftypCfType=row.getStr("FTVFTYP_CF_TYPE");
		this.FtvftypBudgClassification=row.getStr("FTVFTYP_BUDG_CLASSIFICATION");
		this.FtvftypBudgCfPercent=row.getNumber("FTVFTYP_BUDG_CF_PERCENT");
		this.FtvftypAcctCodeGain=row.getStr("FTVFTYP_ACCT_CODE_GAIN");
		this.FtvftypAcctCodeLoss=row.getStr("FTVFTYP_ACCT_CODE_LOSS");
		this.FtvftypDeprPostCode=row.getStr("FTVFTYP_DEPR_POST_CODE");
		this.FtvftypOrgnCodeCapDef=row.getStr("FTVFTYP_ORGN_CODE_CAP_DEF");
		this.FtvftypProgCodeCapDef=row.getStr("FTVFTYP_PROG_CODE_CAP_DEF");
		this.FtvftypActvCodeCapDef=row.getStr("FTVFTYP_ACTV_CODE_CAP_DEF");
		this.FtvftypLocnCodeCapDef=row.getStr("FTVFTYP_LOCN_CODE_CAP_DEF");
		this.FtvftypDeprExpEqDefInd=row.getStr("FTVFTYP_DEPR_EXP_EQ_DEF_IND");
		this.FtvftypEncMultYrInd=row.getStr("FTVFTYP_ENC_MULT_YR_IND");
		this.FtvftypSurrogateId=row.getNumber("FTVFTYP_SURROGATE_ID");
		this.FtvftypVersion=row.getNumber("FTVFTYP_VERSION");
		this.FtvftypDataOrigin=row.getStr("FTVFTYP_DATA_ORIGIN");
		this.FtvftypVpdiCode=row.getStr("FTVFTYP_VPDI_CODE");
	}
}

