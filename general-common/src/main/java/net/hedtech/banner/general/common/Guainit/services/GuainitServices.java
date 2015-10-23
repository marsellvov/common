package net.hedtech.banner.general.common.Guainit.services;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;

import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;

import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;


import net.hedtech.banner.general.common.Guainit.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Guainit.model.*;



public class GuainitServices extends AbstractSupportCodeObject{
	
	
	public GuainitServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public GuainitTask  getTask() {
		return (GuainitTask )super.getContainer();
	}

	
	public net.hedtech.banner.general.common.Guainit.model.GuainitModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit AOQINIT
	
	PROCEDURE AOQINIT IS
BEGIN
   DEFAULT_VALUE('', 'GLOBAL.CAMPAIGN');
   DEFAULT_VALUE('', 'GLOBAL.DESG');
   DEFAULT_VALUE('', 'GLOBAL.ORGANIZATION');
   DEFAULT_VALUE('', 'GLOBAL.ADDRESS_TYPE');
   DEFAULT_VALUE('', 'GLOBAL.PLEDGE_NO');
   DEFAULT_VALUE('', 'GLOBAL.GIFT_NO');
   DEFAULT_VALUE('', 'GLOBAL.SOLICITATION_TYPE');
   DEFAULT_VALUE('', 'GLOBAL.ACTIVITY_TYPE');
   DEFAULT_VALUE('', 'GLOBAL.KEY_PIDM');
   DEFAULT_VALUE('', 'GLOBAL.KEY_SESSION_USER');
   DEFAULT_VALUE('', 'GLOBAL.KEY_SESSION_NUMBER');
   DEFAULT_VALUE('', 'GLOBAL.CLUB_YEAR');
   DEFAULT_VALUE('', 'GLOBAL.DONOR_CLUB');
   DEFAULT_VALUE('', 'GLOBAL.ALUM_CALLED_FORM');
   DEFAULT_VALUE('', 'GLOBAL.PROJ_CODE');
   DEFAULT_VALUE('', 'GLOBAL.STGY_PLAN');
   DEFAULT_VALUE('', 'GLOBAL.INTEREST');
   DEFAULT_VALUE('', 'GLOBAL.MEMBERSHIP');
   DEFAULT_VALUE('', 'GLOBAL.MEMB_NO');
   DEFAULT_VALUE('', 'GLOBAL.TRANS_NO');
   DEFAULT_VALUE('', 'GLOBAL.AMCT_CODE');
   DEFAULT_VALUE('', 'GLOBAL.IDEN_CODE');
   DEFAULT_VALUE('', 'GLOBAL.XREF_CODE');
   DEFAULT_VALUE('', 'GLOBAL.PHONE_AREA');
   DEFAULT_VALUE('', 'GLOBAL.PHONE_NUMBER');
   DEFAULT_VALUE('', 'GLOBAL.PHONE_EXT');
   DEFAULT_VALUE('', 'GLOBAL.GIFT_AMT') ;
   DEFAULT_VALUE('', 'GLOBAL.ORIGINAL_FORM');
--
   DEFAULT_VALUE('', 'GLOBAL.DEF_PCAT_CODE');
   DEFAULT_VALUE('', 'GLOBAL.DEF_UNCOND_PCAT_CODE');
   DEFAULT_VALUE('', 'GLOBAL.DEF_CTYP_CODE');
   DEFAULT_VALUE('', 'GLOBAL.AGRPCON_REQUIRED');
END;
	*/
	//ID:27
		public void aoqinit()
		{
			setDefaultValue("", "GLOBAL.CAMPAIGN");
			setDefaultValue("", "GLOBAL.DESG");
			setDefaultValue("", "GLOBAL.ORGANIZATION");
			setDefaultValue("", "GLOBAL.ADDRESS_TYPE");
			setDefaultValue("", "GLOBAL.PLEDGE_NO");
			setDefaultValue("", "GLOBAL.GIFT_NO");
			setDefaultValue("", "GLOBAL.SOLICITATION_TYPE");
			setDefaultValue("", "GLOBAL.ACTIVITY_TYPE");
			setDefaultValue("", "GLOBAL.KEY_PIDM");
			setDefaultValue("", "GLOBAL.KEY_SESSION_USER");
			setDefaultValue("", "GLOBAL.KEY_SESSION_NUMBER");
			setDefaultValue("", "GLOBAL.CLUB_YEAR");
			setDefaultValue("", "GLOBAL.DONOR_CLUB");
			setDefaultValue("", "GLOBAL.ALUM_CALLED_FORM");
			setDefaultValue("", "GLOBAL.PROJ_CODE");
			setDefaultValue("", "GLOBAL.STGY_PLAN");
			setDefaultValue("", "GLOBAL.INTEREST");
			setDefaultValue("", "GLOBAL.MEMBERSHIP");
			setDefaultValue("", "GLOBAL.MEMB_NO");
			setDefaultValue("", "GLOBAL.TRANS_NO");
			setDefaultValue("", "GLOBAL.AMCT_CODE");
			setDefaultValue("", "GLOBAL.IDEN_CODE");
			setDefaultValue("", "GLOBAL.XREF_CODE");
			setDefaultValue("", "GLOBAL.PHONE_AREA");
			setDefaultValue("", "GLOBAL.PHONE_NUMBER");
			setDefaultValue("", "GLOBAL.PHONE_EXT");
			setDefaultValue("", "GLOBAL.GIFT_AMT");
			setDefaultValue("", "GLOBAL.ORIGINAL_FORM");
			// 
			setDefaultValue("", "GLOBAL.DEF_PCAT_CODE");
			setDefaultValue("", "GLOBAL.DEF_UNCOND_PCAT_CODE");
			setDefaultValue("", "GLOBAL.DEF_CTYP_CODE");
			setDefaultValue("", "GLOBAL.AGRPCON_REQUIRED");
		}

	
	/* Original PL/SQL code for Prog Unit FOQINIT
	
	PROCEDURE FOQINIT IS
  USER_ID       VARCHAR2(30);
  MY_SQL        VARCHAR2(300);
  MY_SQL_VALUE  VARCHAR2(1);
  AUTH_CURSOR  	INTEGER;
  AUTH_RETURN   INTEGER;
BEGIN
  USER_ID := NAME_IN('GLOBAL.CURRENT_USER');
  DEFAULT_VALUE( USER_ID, 'GLOBAL.USER_ID');
  DEFAULT_VALUE('', 'GLOBAL.TOLERANCE');
  DEFAULT_VALUE('', 'GLOBAL.NSF');
  DEFAULT_VALUE('', 'GLOBAL.FSYR');
  DEFAULT_VALUE('', 'GLOBAL.FSYR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.VEND_CODE');
  DEFAULT_VALUE('', 'GLOBAL.VEND_INV');
  DEFAULT_VALUE('', 'GLOBAL.PROP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.CHECK_NUM');
  DEFAULT_VALUE('', 'GLOBAL.OBUD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.OBPH_CODE');
  DEFAULT_VALUE('', 'GLOBAL.EDIT_DEFER_IND');
  DEFAULT_VALUE('', 'GLOBAL.DEFAULT_TIMING_IND');
  DEFAULT_VALUE('', 'GLOBAL.RUCL_SECURITY_IND');
  DEFAULT_VALUE('', 'GLOBAL.FUND_ORG_SECURITY_IND');
  DEFAULT_VALUE('', 'GLOBAL.TAX_PROCESSING_IND');
  DEFAULT_VALUE('', 'GLOBAL.APPR_OVERRIDE_IND_JV');
  DEFAULT_VALUE('', 'GLOBAL.APPR_OVERRIDE_IND_CO');
  DEFAULT_VALUE('', 'GLOBAL.APPR_OVERRIDE_IND_REQ');
  DEFAULT_VALUE('', 'GLOBAL.APPR_OVERRIDE_IND_PO');
  DEFAULT_VALUE('', 'GLOBAL.APPR_OVERRIDE_IND_INV');
  DEFAULT_VALUE('', 'GLOBAL.APPR_OVERRIDE_IND_ENC');
  DEFAULT_VALUE('', 'GLOBAL.BASE_CURR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.EMPL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.VTYP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.POHD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BORD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.CHANGE_SEQ_NUM');
  DEFAULT_VALUE('', 'GLOBAL.DOC_SEQ_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BANK_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PREV_FORM_NAME');
  DEFAULT_VALUE('', 'GLOBAL.SEARCH_VALUE');
  DEFAULT_VALUE('', 'GLOBAL.DOC_SEQ');
  DEFAULT_VALUE('', 'GLOBAL.DOC_TYPE');
  DEFAULT_VALUE('', 'GLOBAL.DOC_NUM');
  DEFAULT_VALUE('', 'GLOBAL.BUYR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BIDS_CODE');
  DEFAULT_VALUE('', 'GLOBAL.COMM_CODE');
  DEFAULT_VALUE('', 'GLOBAL.RQST_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FUND_CODE');
  DEFAULT_VALUE('', 'GLOBAL.ORGN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.ACCT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PROG_CODE');
  DEFAULT_VALUE('', 'GLOBAL.ACTV_CODE');
  DEFAULT_VALUE('', 'GLOBAL.LOCN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.CUST_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PROJ_CODE');
  DEFAULT_VALUE('', 'GLOBAL.ACCI_CODE');
  DEFAULT_VALUE('', 'GLOBAL.AGRD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TRANS_DATE');
  DEFAULT_VALUE('', 'GLOBAL.VALUE');
  DEFAULT_VALUE( '1', 'GLOBAL.FTVSDAT_RETURN');
  DEFAULT_VALUE('', 'GLOBAL.PIDM');
  DEFAULT_VALUE('', 'GLOBAL.ATYP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BLANKET_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TEXT_IND');
  DEFAULT_VALUE('', 'GLOBAL.AMST_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FIELD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.OBUD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.OBPH_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BUDG_DUR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.ADJ_FIELD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.RSV_FIELD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TRND_CODE');
  DEFAULT_VALUE('', 'GLOBAL.AGCY_ID');
  DEFAULT_VALUE('', 'GLOBAL.AGCY_PIDM');
  DEFAULT_VALUE('', 'GLOBAL.AGCY_NAME');
  DEFAULT_VALUE('', 'GLOBAL.AGCY_PRED_NAME');
  DEFAULT_VALUE('', 'GLOBAL.AGCY_PRED_ID');
  DEFAULT_VALUE('', 'GLOBAL.AGCY_PRED_PIDM');
  DEFAULT_VALUE('', 'GLOBAL.JVCD_NUM');
  DEFAULT_VALUE('', 'GLOBAL.ENCB_NUM');
  DEFAULT_VALUE('', 'GLOBAL.DOC_ITEM');
  DEFAULT_VALUE('', 'GLOBAL.CMT_TYPE');
  DEFAULT_VALUE('', 'GLOBAL.PACK_SLIP');
  DEFAULT_VALUE('', 'GLOBAL.CUSIP_NUMBER');
  DEFAULT_VALUE('', 'GLOBAL.INDUSTRY_SYMBOL');
  DEFAULT_VALUE('', 'GLOBAL.FTVATYP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.RCHD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SHIP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SUB_LOCN');
  DEFAULT_VALUE('', 'GLOBAL.FORM_WAS_CALLED');
  DEFAULT_VALUE('', 'GLOBAL.CTYP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.GRNT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.GRNT_YR');
  DEFAULT_VALUE('', 'GLOBAL.JVCD_SUB_NUM');
--
  DEFAULT_VALUE('', 'GLOBAL.ISSUE_CODE');
  DEFAULT_VALUE('', 'GLOBAL.OBPH_CODE_1');
  DEFAULT_VALUE('', 'GLOBAL.OBPH_CODE_2');
  DEFAULT_VALUE('', 'GLOBAL.OBPH_CODE_3');
  DEFAULT_VALUE('', 'GLOBAL.FTYP_CODE');
--
-- 217-3
--
  DEFAULT_VALUE('', 'GLOBAL.INDR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.INDA_CODE');
  DEFAULT_VALUE('', 'GLOBAL.INDD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.CSTR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.CSTA_CODE');
  DEFAULT_VALUE('', 'GLOBAL.CSTD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BASI_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PROP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.EVNT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.EGRP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BUDGET_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BASIS_TYPE');
  DEFAULT_VALUE('', 'GLOBAL.ID_NO');
--
-- 219-1
--
  DEFAULT_VALUE('', 'GLOBAL.ADJF_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FA_NSF_ON_OFF_IND');
  DEFAULT_VALUE('', 'GLOBAL.APPR_OVERRIDE_IND_FA');
  DEFAULT_VALUE('', 'GLOBAL.PTAG_CODE');
  DEFAULT_VALUE('', 'GLOBAL.OTAG_CODE');
--
-- 2111-6
--
  DEFAULT_VALUE('', 'GLOBAL.DCSR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TRAT_CODE');
--
-- Dynamic sql to determine user's authority to expenditure or not.
--
  MY_SQL := 'SELECT ''X''' ||
           ' FROM FOBPROF' ||
           ' WHERE FOBPROF_USER_ID = USER' ||
           '   AND (FOBPROF_EXP_END_POST_AUTH_IND IS NULL' ||
           '    OR  FOBPROF_EXP_END_POST_AUTH_IND = ''Y'')';
--
  gokdbms.dynamic_sql(MY_SQL,MY_SQL_VALUE);
--
  IF MY_SQL_VALUE = 'X' THEN
   :GLOBAL.EXP_END_POST_AUTH_IND := 'Y';
  ELSE
   :GLOBAL.EXP_END_POST_AUTH_IND := 'N';     
  END IF;
END;
	*/
	//ID:28
		public void foqinit()
		{
			NString userId= NString.getNull();
			NString mySql= NString.getNull();
			NString mySqlValue= NString.getNull();
			NInteger authCursor= NInteger.getNull();
			NInteger authReturn= NInteger.getNull();
			userId = getNameIn("GLOBAL.CURRENT_USER");
			setDefaultValue(userId, "GLOBAL.USER_ID");
			setDefaultValue("", "GLOBAL.TOLERANCE");
			setDefaultValue("", "GLOBAL.NSF");
			setDefaultValue("", "GLOBAL.FSYR");
			setDefaultValue("", "GLOBAL.FSYR_CODE");
			setDefaultValue("", "GLOBAL.VEND_CODE");
			setDefaultValue("", "GLOBAL.VEND_INV");
			setDefaultValue("", "GLOBAL.PROP_CODE");
			setDefaultValue("", "GLOBAL.CHECK_NUM");
			setDefaultValue("", "GLOBAL.OBUD_CODE");
			setDefaultValue("", "GLOBAL.OBPH_CODE");
			setDefaultValue("", "GLOBAL.EDIT_DEFER_IND");
			setDefaultValue("", "GLOBAL.DEFAULT_TIMING_IND");
			setDefaultValue("", "GLOBAL.RUCL_SECURITY_IND");
			setDefaultValue("", "GLOBAL.FUND_ORG_SECURITY_IND");
			setDefaultValue("", "GLOBAL.TAX_PROCESSING_IND");
			setDefaultValue("", "GLOBAL.APPR_OVERRIDE_IND_JV");
			setDefaultValue("", "GLOBAL.APPR_OVERRIDE_IND_CO");
			setDefaultValue("", "GLOBAL.APPR_OVERRIDE_IND_REQ");
			setDefaultValue("", "GLOBAL.APPR_OVERRIDE_IND_PO");
			setDefaultValue("", "GLOBAL.APPR_OVERRIDE_IND_INV");
			setDefaultValue("", "GLOBAL.APPR_OVERRIDE_IND_ENC");
			setDefaultValue("", "GLOBAL.BASE_CURR_CODE");
			setDefaultValue("", "GLOBAL.EMPL_CODE");
			setDefaultValue("", "GLOBAL.VTYP_CODE");
			setDefaultValue("", "GLOBAL.POHD_CODE");
			setDefaultValue("", "GLOBAL.BORD_CODE");
			setDefaultValue("", "GLOBAL.CHANGE_SEQ_NUM");
			setDefaultValue("", "GLOBAL.DOC_SEQ_CODE");
			setDefaultValue("", "GLOBAL.BANK_CODE");
			setDefaultValue("", "GLOBAL.PREV_FORM_NAME");
			setDefaultValue("", "GLOBAL.SEARCH_VALUE");
			setDefaultValue("", "GLOBAL.DOC_SEQ");
			setDefaultValue("", "GLOBAL.DOC_TYPE");
			setDefaultValue("", "GLOBAL.DOC_NUM");
			setDefaultValue("", "GLOBAL.BUYR_CODE");
			setDefaultValue("", "GLOBAL.BIDS_CODE");
			setDefaultValue("", "GLOBAL.COMM_CODE");
			setDefaultValue("", "GLOBAL.RQST_CODE");
			setDefaultValue("", "GLOBAL.FUND_CODE");
			setDefaultValue("", "GLOBAL.ORGN_CODE");
			setDefaultValue("", "GLOBAL.ACCT_CODE");
			setDefaultValue("", "GLOBAL.PROG_CODE");
			setDefaultValue("", "GLOBAL.ACTV_CODE");
			setDefaultValue("", "GLOBAL.LOCN_CODE");
			setDefaultValue("", "GLOBAL.CUST_CODE");
			setDefaultValue("", "GLOBAL.PROJ_CODE");
			setDefaultValue("", "GLOBAL.ACCI_CODE");
			setDefaultValue("", "GLOBAL.AGRD_CODE");
			setDefaultValue("", "GLOBAL.TRANS_DATE");
			setDefaultValue("", "GLOBAL.VALUE");
			setDefaultValue("1", "GLOBAL.FTVSDAT_RETURN");
			setDefaultValue("", "GLOBAL.PIDM");
			setDefaultValue("", "GLOBAL.ATYP_CODE");
			setDefaultValue("", "GLOBAL.BLANKET_CODE");
			setDefaultValue("", "GLOBAL.TEXT_IND");
			setDefaultValue("", "GLOBAL.AMST_CODE");
			setDefaultValue("", "GLOBAL.FIELD_CODE");
			setDefaultValue("", "GLOBAL.OBUD_CODE");
			setDefaultValue("", "GLOBAL.OBPH_CODE");
			setDefaultValue("", "GLOBAL.BUDG_DUR_CODE");
			setDefaultValue("", "GLOBAL.ADJ_FIELD_CODE");
			setDefaultValue("", "GLOBAL.RSV_FIELD_CODE");
			setDefaultValue("", "GLOBAL.TRND_CODE");
			setDefaultValue("", "GLOBAL.AGCY_ID");
			setDefaultValue("", "GLOBAL.AGCY_PIDM");
			setDefaultValue("", "GLOBAL.AGCY_NAME");
			setDefaultValue("", "GLOBAL.AGCY_PRED_NAME");
			setDefaultValue("", "GLOBAL.AGCY_PRED_ID");
			setDefaultValue("", "GLOBAL.AGCY_PRED_PIDM");
			setDefaultValue("", "GLOBAL.JVCD_NUM");
			setDefaultValue("", "GLOBAL.ENCB_NUM");
			setDefaultValue("", "GLOBAL.DOC_ITEM");
			setDefaultValue("", "GLOBAL.CMT_TYPE");
			setDefaultValue("", "GLOBAL.PACK_SLIP");
			setDefaultValue("", "GLOBAL.CUSIP_NUMBER");
			setDefaultValue("", "GLOBAL.INDUSTRY_SYMBOL");
			setDefaultValue("", "GLOBAL.FTVATYP_CODE");
			setDefaultValue("", "GLOBAL.RCHD_CODE");
			setDefaultValue("", "GLOBAL.SHIP_CODE");
			setDefaultValue("", "GLOBAL.SUB_LOCN");
			setDefaultValue("", "GLOBAL.FORM_WAS_CALLED");
			setDefaultValue("", "GLOBAL.CTYP_CODE");
			setDefaultValue("", "GLOBAL.GRNT_CODE");
			setDefaultValue("", "GLOBAL.GRNT_YR");
			setDefaultValue("", "GLOBAL.JVCD_SUB_NUM");
			setDefaultValue("", "GLOBAL.ISSUE_CODE");
			setDefaultValue("", "GLOBAL.OBPH_CODE_1");
			setDefaultValue("", "GLOBAL.OBPH_CODE_2");
			setDefaultValue("", "GLOBAL.OBPH_CODE_3");
			setDefaultValue("", "GLOBAL.FTYP_CODE");
			setDefaultValue("", "GLOBAL.INDR_CODE");
			setDefaultValue("", "GLOBAL.INDA_CODE");
			setDefaultValue("", "GLOBAL.INDD_CODE");
			setDefaultValue("", "GLOBAL.CSTR_CODE");
			setDefaultValue("", "GLOBAL.CSTA_CODE");
			setDefaultValue("", "GLOBAL.CSTD_CODE");
			setDefaultValue("", "GLOBAL.BASI_CODE");
			setDefaultValue("", "GLOBAL.PROP_CODE");
			setDefaultValue("", "GLOBAL.EVNT_CODE");
			setDefaultValue("", "GLOBAL.EGRP_CODE");
			setDefaultValue("", "GLOBAL.BUDGET_CODE");
			setDefaultValue("", "GLOBAL.BASIS_TYPE");
			setDefaultValue("", "GLOBAL.ID_NO");
			setDefaultValue("", "GLOBAL.ADJF_CODE");
			setDefaultValue("", "GLOBAL.FA_NSF_ON_OFF_IND");
			setDefaultValue("", "GLOBAL.APPR_OVERRIDE_IND_FA");
			setDefaultValue("", "GLOBAL.PTAG_CODE");
			setDefaultValue("", "GLOBAL.OTAG_CODE");
			setDefaultValue("", "GLOBAL.DCSR_CODE");
			setDefaultValue("", "GLOBAL.TRAT_CODE");
			mySql = toStr("SELECT 'X'").append(" FROM FOBPROF").append(" WHERE FOBPROF_USER_ID = USER").append("   AND (FOBPROF_EXP_END_POST_AUTH_IND IS NULL").append("    OR  FOBPROF_EXP_END_POST_AUTH_IND = 'Y')");
			Ref<NString> p_return_value1_ref = new Ref<NString>(mySqlValue);
			Gokdbms.dynamicSql(mySql, p_return_value1_ref);
			mySqlValue = p_return_value1_ref.val;
			if ( mySqlValue.equals("X") )
			{
				setGlobal("EXP_END_POST_AUTH_IND", toStr("Y"));
			}
			else {
				setGlobal("EXP_END_POST_AUTH_IND", toStr("N"));
			}
		}

	
	/* Original PL/SQL code for Prog Unit NOQINIT
	
	PROCEDURE NOQINIT IS 
BEGIN
  DEFAULT_VALUE('', 'GLOBAL.KEY_IDNO');
  DEFAULT_VALUE('', 'GLOBAL.ADJS_SEQ_NO');
  DEFAULT_VALUE('', 'GLOBAL.BCAT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.LCAT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BDCA_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BENE_IDNO');
  DEFAULT_VALUE('', 'GLOBAL.CBEN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PGRP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.DISP');
  DEFAULT_VALUE('', 'GLOBAL.ECLS_CODE');
  DEFAULT_VALUE('', 'GLOBAL.EARN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.EARN');
  DEFAULT_VALUE('', 'GLOBAL.EMPR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FISC_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FORM_WAS_CALLED');
  DEFAULT_VALUE('', 'GLOBAL.FSTA_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FSYR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.GRADE');
  DEFAULT_VALUE('', 'GLOBAL.LEAV_CODE');
  DEFAULT_VALUE('', 'GLOBAL.ORGN_CODE_TS');
  DEFAULT_VALUE('', 'GLOBAL.PAYNO');
  DEFAULT_VALUE('', 'GLOBAL.PCLS_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PIDM');
  DEFAULT_VALUE('', 'GLOBAL.PLAN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PICT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.POSN');
  DEFAULT_VALUE('', 'GLOBAL.QUERY_DATE');
  DEFAULT_VALUE('', 'GLOBAL.REPT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SEQ_NO');
  DEFAULT_VALUE('', 'GLOBAL.SKIL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SKLV_CODE');
  DEFAULT_VALUE('', 'GLOBAL.STEP');
  DEFAULT_VALUE('00', 'GLOBAL.SUFF');
  DEFAULT_VALUE('', 'GLOBAL.TR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TXCD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TABLE');
  DEFAULT_VALUE('', 'GLOBAL.USER');
  DEFAULT_VALUE('', 'GLOBAL.user_id');
  DEFAULT_VALUE('', 'GLOBAL.YEAR');
  DEFAULT_VALUE('', 'GLOBAL.VALUE');
  DEFAULT_VALUE('', 'GLOBAL.SGRP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.QUERY_ECLS_CODE');
  DEFAULT_VALUE('', 'GLOBAL.LAST_NAME');
  DEFAULT_VALUE('', 'GLOBAL.FIRST_NAME');
  DEFAULT_VALUE('', 'GLOBAL.SGRP_CODE');
  DEFAULT_VALUE('', 'global.shift');
  DEFAULT_VALUE('', 'global.shft_code');
  DEFAULT_VALUE('', 'global.empr_code_hist');
  DEFAULT_VALUE('0', 'global.job_cnt');
  DEFAULT_VALUE('', 'global.location_ind');
  DEFAULT_VALUE('', 'GLOBAL.BUDGET_STATUS');
  DEFAULT_VALUE('', 'GLOBAL.MONTH');
  DEFAULT_VALUE('', 'GLOBAL.ORGN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.OBUD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.OBPH_CODE');
--
-- 215-6
--
  DEFAULT_VALUE('', 'GLOBAL.APPROVAL_VIEW_DATE');
  DEFAULT_VALUE('', 'GLOBAL.APPROVAL_MSG_IND');
  DEFAULT_VALUE('', 'GLOBAL.APPLY');
  DEFAULT_VALUE('', 'GLOBAL.TRANSACTION_NO');
  DEFAULT_VALUE('', 'GLOBAL.ALVL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.ACAT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.APTY_CODE');
  DEFAULT_VALUE('', 'GLOBAL.QUEUE_STATUS_IND');
  DEFAULT_VALUE('', 'GLOBAL.TRANS_STATUS_IND');
  DEFAULT_VALUE('', 'GLOBAL.TRANSACTION_FROM_DATE');
  DEFAULT_VALUE('', 'GLOBAL.TRANSACTION_TO_DATE');
  DEFAULT_VALUE('', 'GLOBAL.NHAEPAF_QUEUE');
  DEFAULT_VALUE('', 'GLOBAL.PROXY_FOR_USER_ID');
  DEFAULT_VALUE('', 'GLOBAL.TRANS_EFFECTIVE_DATE');
END;

	*/
	//ID:29
		public void noqinit()
		{
			setDefaultValue("", "GLOBAL.KEY_IDNO");
			setDefaultValue("", "GLOBAL.ADJS_SEQ_NO");
			setDefaultValue("", "GLOBAL.BCAT_CODE");
			setDefaultValue("", "GLOBAL.LCAT_CODE");
			setDefaultValue("", "GLOBAL.BDCA_CODE");
			setDefaultValue("", "GLOBAL.BENE_IDNO");
			setDefaultValue("", "GLOBAL.CBEN_CODE");
			setDefaultValue("", "GLOBAL.PGRP_CODE");
			setDefaultValue("", "GLOBAL.DISP");
			setDefaultValue("", "GLOBAL.ECLS_CODE");
			setDefaultValue("", "GLOBAL.EARN_CODE");
			setDefaultValue("", "GLOBAL.EARN");
			setDefaultValue("", "GLOBAL.EMPR_CODE");
			setDefaultValue("", "GLOBAL.FISC_CODE");
			setDefaultValue("", "GLOBAL.FORM_WAS_CALLED");
			setDefaultValue("", "GLOBAL.FSTA_CODE");
			setDefaultValue("", "GLOBAL.FSYR_CODE");
			setDefaultValue("", "GLOBAL.GRADE");
			setDefaultValue("", "GLOBAL.LEAV_CODE");
			setDefaultValue("", "GLOBAL.ORGN_CODE_TS");
			setDefaultValue("", "GLOBAL.PAYNO");
			setDefaultValue("", "GLOBAL.PCLS_CODE");
			setDefaultValue("", "GLOBAL.PIDM");
			setDefaultValue("", "GLOBAL.PLAN_CODE");
			setDefaultValue("", "GLOBAL.PICT_CODE");
			setDefaultValue("", "GLOBAL.POSN");
			setDefaultValue("", "GLOBAL.QUERY_DATE");
			setDefaultValue("", "GLOBAL.REPT_CODE");
			setDefaultValue("", "GLOBAL.SEQ_NO");
			setDefaultValue("", "GLOBAL.SKIL_CODE");
			setDefaultValue("", "GLOBAL.SKLV_CODE");
			setDefaultValue("", "GLOBAL.STEP");
			setDefaultValue("00", "GLOBAL.SUFF");
			setDefaultValue("", "GLOBAL.TR_CODE");
			setDefaultValue("", "GLOBAL.TXCD_CODE");
			setDefaultValue("", "GLOBAL.TABLE");
			setDefaultValue("", "GLOBAL.USER");
			setDefaultValue("", "GLOBAL.user_id");
			setDefaultValue("", "GLOBAL.YEAR");
			setDefaultValue("", "GLOBAL.VALUE");
			setDefaultValue("", "GLOBAL.SGRP_CODE");
			setDefaultValue("", "GLOBAL.QUERY_ECLS_CODE");
			setDefaultValue("", "GLOBAL.LAST_NAME");
			setDefaultValue("", "GLOBAL.FIRST_NAME");
			setDefaultValue("", "GLOBAL.SGRP_CODE");
			setDefaultValue("", "global.shift");
			setDefaultValue("", "global.shft_code");
			setDefaultValue("", "global.empr_code_hist");
			setDefaultValue("0", "global.job_cnt");
			setDefaultValue("", "global.location_ind");
			setDefaultValue("", "GLOBAL.BUDGET_STATUS");
			setDefaultValue("", "GLOBAL.MONTH");
			setDefaultValue("", "GLOBAL.ORGN_CODE");
			setDefaultValue("", "GLOBAL.OBUD_CODE");
			setDefaultValue("", "GLOBAL.OBPH_CODE");
			setDefaultValue("", "GLOBAL.APPROVAL_VIEW_DATE");
			setDefaultValue("", "GLOBAL.APPROVAL_MSG_IND");
			setDefaultValue("", "GLOBAL.APPLY");
			setDefaultValue("", "GLOBAL.TRANSACTION_NO");
			setDefaultValue("", "GLOBAL.ALVL_CODE");
			setDefaultValue("", "GLOBAL.ACAT_CODE");
			setDefaultValue("", "GLOBAL.APTY_CODE");
			setDefaultValue("", "GLOBAL.QUEUE_STATUS_IND");
			setDefaultValue("", "GLOBAL.TRANS_STATUS_IND");
			setDefaultValue("", "GLOBAL.TRANSACTION_FROM_DATE");
			setDefaultValue("", "GLOBAL.TRANSACTION_TO_DATE");
			setDefaultValue("", "GLOBAL.NHAEPAF_QUEUE");
			setDefaultValue("", "GLOBAL.PROXY_FOR_USER_ID");
			setDefaultValue("", "GLOBAL.TRANS_EFFECTIVE_DATE");
		}

	
	/* Original PL/SQL code for Prog Unit POQINIT
	
	PROCEDURE POQINIT IS 
BEGIN
  :GLOBAL.KEY_DATE := '';
--
  DEFAULT_VALUE('', 'GLOBAL.KEY_IDNO');
  DEFAULT_VALUE('', 'GLOBAL.ADJS_SEQ_NO');
  DEFAULT_VALUE('', 'GLOBAL.BCAT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.LCAT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BDCA_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BENE_IDNO');
  DEFAULT_VALUE('', 'GLOBAL.CBEN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PGRP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.DISP');
  DEFAULT_VALUE('', 'GLOBAL.ECLS_CODE');
  DEFAULT_VALUE('', 'GLOBAL.EARN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.EARN');
  DEFAULT_VALUE('', 'GLOBAL.EMPR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FISC_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FIRST_COMMIT');
  DEFAULT_VALUE('', 'GLOBAL.FORM_WAS_CALLED');
  DEFAULT_VALUE('', 'GLOBAL.FSTA_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FSYR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.GRADE');
  DEFAULT_VALUE('', 'GLOBAL.LEAV_CODE');
  DEFAULT_VALUE('', 'GLOBAL.ORGN_CODE_TS');
  DEFAULT_VALUE('', 'GLOBAL.ORGN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PAYNO');
  DEFAULT_VALUE('', 'GLOBAL.PCLS_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PIDM');
  DEFAULT_VALUE('', 'global.hrs_day');
  DEFAULT_VALUE('', 'GLOBAL.PLAN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PICT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.POSN');
  DEFAULT_VALUE('', 'GLOBAL.QUERY_DATE');
  DEFAULT_VALUE('', 'GLOBAL.REPT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.REQ_NO');
  DEFAULT_VALUE('', 'GLOBAL.SEQ_NO');
  DEFAULT_VALUE('', 'GLOBAL.SKIL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SKLV_CODE');
  DEFAULT_VALUE('', 'GLOBAL.STEP');
  DEFAULT_VALUE('00', 'GLOBAL.SUFF');
  DEFAULT_VALUE('', 'GLOBAL.TR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TXCD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TABLE');
  DEFAULT_VALUE('', 'GLOBAL.USER');
  DEFAULT_VALUE('', 'global.user_id');
  DEFAULT_VALUE('', 'GLOBAL.YEAR');
  DEFAULT_VALUE('', 'GLOBAL.VALUE');
  DEFAULT_VALUE('', 'GLOBAL.QUERY_ECLS_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SKILL');
  DEFAULT_VALUE('', 'GLOBAL.SGRP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SKLV');
  DEFAULT_VALUE('', 'GLOBAL.QUERY_SKLV');
  DEFAULT_VALUE('', 'global.last_name');
  DEFAULT_VALUE('', 'global.first_name');
  DEFAULT_VALUE('', 'global.shift');
  DEFAULT_VALUE('', 'global.shft_code');
  DEFAULT_VALUE('', 'global.empr_code_hist');
  DEFAULT_VALUE('0', 'global.job_cnt');
  DEFAULT_VALUE('', 'global.wkpr_code');
  DEFAULT_VALUE('', 'global.lgcd_code');
  DEFAULT_VALUE('', 'global.hsin_no');
  DEFAULT_VALUE('', 'global.hazd_code');
  DEFAULT_VALUE('', 'global.hstc_code');
  DEFAULT_VALUE('', 'global.location_ind');
  DEFAULT_VALUE('', 'global.locn_code');
  DEFAULT_VALUE('', 'global.barg_code');
  DEFAULT_VALUE('N', 'global.tax_updates');
  DEFAULT_VALUE('', 'global.grev_no');
  DEFAULT_VALUE('', 'global.dfpr_code');
  DEFAULT_VALUE('', 'global.barg_status');
  DEFAULT_VALUE('', 'GLOBAL.BEGIN_DATE');
  DEFAULT_VALUE('', 'GLOBAL.END_DATE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_YEAR_IND');
  DEFAULT_VALUE('', 'GLOBAL.BDPL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.PLAN_YEAR');
--
-- 215-2
--
  DEFAULT_VALUE('', 'GLOBAL.YEAR_2');
  DEFAULT_VALUE('', 'GLOBAL.PAYNO_2');
  DEFAULT_VALUE('', 'GLOBAL.JOBS_EFFECTIVE_DATE');
  DEFAULT_VALUE('', 'GLOBAL.CALIF_INFO');
--
-- 215-6
--
  DEFAULT_VALUE('', 'GLOBAL.APPROVAL_VIEW_DATE');
  DEFAULT_VALUE('', 'GLOBAL.APPROVAL_MSG_IND');
  DEFAULT_VALUE('', 'GLOBAL.APPLY');
  DEFAULT_VALUE('', 'GLOBAL.TRANSACTION_NO');
--
-- 217-2
--
  DEFAULT_VALUE('', 'GLOBAL.FMLA_YEAR');
  DEFAULT_VALUE('', 'GLOBAL.FMLA_YEAR_IND');
--
-- 2111-5
--
  DEFAULT_VALUE('', 'GLOBAL.GO_TO_BLOCK');
  DEFAULT_VALUE('', 'GLOBAL.GO_TO_ITEM');
  DEFAULT_VALUE('', 'GLOBAL.ACTION_DATE');
  DEFAULT_VALUE('', 'GLOBAL.ACTION_LIST');
  DEFAULT_VALUE('', 'GLOBAL.ACTION_ALL');
  DEFAULT_VALUE('', 'GLOBAL.NEW_HIRE_IND');
--
-- 2111-7
--
  DEFAULT_VALUE('', 'GLOBAL.APTY_CODE_EMSG');
END;

	*/
	//ID:30
		public void poqinit()
		{
			setGlobal("KEY_DATE", toStr(""));
			setDefaultValue("", "GLOBAL.KEY_IDNO");
			setDefaultValue("", "GLOBAL.ADJS_SEQ_NO");
			setDefaultValue("", "GLOBAL.BCAT_CODE");
			setDefaultValue("", "GLOBAL.LCAT_CODE");
			setDefaultValue("", "GLOBAL.BDCA_CODE");
			setDefaultValue("", "GLOBAL.BENE_IDNO");
			setDefaultValue("", "GLOBAL.CBEN_CODE");
			setDefaultValue("", "GLOBAL.PGRP_CODE");
			setDefaultValue("", "GLOBAL.DISP");
			setDefaultValue("", "GLOBAL.ECLS_CODE");
			setDefaultValue("", "GLOBAL.EARN_CODE");
			setDefaultValue("", "GLOBAL.EARN");
			setDefaultValue("", "GLOBAL.EMPR_CODE");
			setDefaultValue("", "GLOBAL.FISC_CODE");
			setDefaultValue("", "GLOBAL.FIRST_COMMIT");
			setDefaultValue("", "GLOBAL.FORM_WAS_CALLED");
			setDefaultValue("", "GLOBAL.FSTA_CODE");
			setDefaultValue("", "GLOBAL.FSYR_CODE");
			setDefaultValue("", "GLOBAL.GRADE");
			setDefaultValue("", "GLOBAL.LEAV_CODE");
			setDefaultValue("", "GLOBAL.ORGN_CODE_TS");
			setDefaultValue("", "GLOBAL.ORGN_CODE");
			setDefaultValue("", "GLOBAL.PAYNO");
			setDefaultValue("", "GLOBAL.PCLS_CODE");
			setDefaultValue("", "GLOBAL.PIDM");
			setDefaultValue("", "global.hrs_day");
			setDefaultValue("", "GLOBAL.PLAN_CODE");
			setDefaultValue("", "GLOBAL.PICT_CODE");
			setDefaultValue("", "GLOBAL.POSN");
			setDefaultValue("", "GLOBAL.QUERY_DATE");
			setDefaultValue("", "GLOBAL.REPT_CODE");
			setDefaultValue("", "GLOBAL.REQ_NO");
			setDefaultValue("", "GLOBAL.SEQ_NO");
			setDefaultValue("", "GLOBAL.SKIL_CODE");
			setDefaultValue("", "GLOBAL.SKLV_CODE");
			setDefaultValue("", "GLOBAL.STEP");
			setDefaultValue("00", "GLOBAL.SUFF");
			setDefaultValue("", "GLOBAL.TR_CODE");
			setDefaultValue("", "GLOBAL.TXCD_CODE");
			setDefaultValue("", "GLOBAL.TABLE");
			setDefaultValue("", "GLOBAL.USER");
			setDefaultValue("", "global.user_id");
			setDefaultValue("", "GLOBAL.YEAR");
			setDefaultValue("", "GLOBAL.VALUE");
			setDefaultValue("", "GLOBAL.QUERY_ECLS_CODE");
			setDefaultValue("", "GLOBAL.SKILL");
			setDefaultValue("", "GLOBAL.SGRP_CODE");
			setDefaultValue("", "GLOBAL.SKLV");
			setDefaultValue("", "GLOBAL.QUERY_SKLV");
			setDefaultValue("", "global.last_name");
			setDefaultValue("", "global.first_name");
			setDefaultValue("", "global.shift");
			setDefaultValue("", "global.shft_code");
			setDefaultValue("", "global.empr_code_hist");
			setDefaultValue("0", "global.job_cnt");
			setDefaultValue("", "global.wkpr_code");
			setDefaultValue("", "global.lgcd_code");
			setDefaultValue("", "global.hsin_no");
			setDefaultValue("", "global.hazd_code");
			setDefaultValue("", "global.hstc_code");
			setDefaultValue("", "global.location_ind");
			setDefaultValue("", "global.locn_code");
			setDefaultValue("", "global.barg_code");
			setDefaultValue("N", "global.tax_updates");
			setDefaultValue("", "global.grev_no");
			setDefaultValue("", "global.dfpr_code");
			setDefaultValue("", "global.barg_status");
			setDefaultValue("", "GLOBAL.BEGIN_DATE");
			setDefaultValue("", "GLOBAL.END_DATE");
			setDefaultValue("", "GLOBAL.KEY_YEAR_IND");
			setDefaultValue("", "GLOBAL.BDPL_CODE");
			setDefaultValue("", "GLOBAL.PLAN_YEAR");
			setDefaultValue("", "GLOBAL.YEAR_2");
			setDefaultValue("", "GLOBAL.PAYNO_2");
			setDefaultValue("", "GLOBAL.JOBS_EFFECTIVE_DATE");
			setDefaultValue("", "GLOBAL.CALIF_INFO");
			setDefaultValue("", "GLOBAL.APPROVAL_VIEW_DATE");
			setDefaultValue("", "GLOBAL.APPROVAL_MSG_IND");
			setDefaultValue("", "GLOBAL.APPLY");
			setDefaultValue("", "GLOBAL.TRANSACTION_NO");
			setDefaultValue("", "GLOBAL.FMLA_YEAR");
			setDefaultValue("", "GLOBAL.FMLA_YEAR_IND");
			setDefaultValue("", "GLOBAL.GO_TO_BLOCK");
			setDefaultValue("", "GLOBAL.GO_TO_ITEM");
			setDefaultValue("", "GLOBAL.ACTION_DATE");
			setDefaultValue("", "GLOBAL.ACTION_LIST");
			setDefaultValue("", "GLOBAL.ACTION_ALL");
			setDefaultValue("", "GLOBAL.NEW_HIRE_IND");
			setDefaultValue("", "GLOBAL.APTY_CODE_EMSG");
		}

	
	/* Original PL/SQL code for Prog Unit ROQINIT
	
	PROCEDURE ROQINIT IS
  USER_ID  VARCHAR2(30);
BEGIN
  :GLOBAL.TIME_STAMP := '';
  DEFAULT_VALUE('', 'GLOBAL.RORRULE_TYPE_IND');
  USER_ID := NAME_IN('GLOBAL.CURRENT_USER');
--
  DEFAULT_VALUE(USER_ID, 'GLOBAL.USER_ID');
  DEFAULT_VALUE('', 'GLOBAL.PIDM');
  DEFAULT_VALUE('', 'GLOBAL.AIDY_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TEST_AIDY_CODE');
  DEFAULT_VALUE('', 'GLOBAL.APPL_SEQ_NO');
  DEFAULT_VALUE('', 'GLOBAL.CURR_REC_IND');
  DEFAULT_VALUE('', 'GLOBAL.BGRP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TGRP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BTYP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.CAMP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.APRD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FUND_CODE');
  DEFAULT_VALUE('', 'GLOBAL.BUDG_AUDIT');
  DEFAULT_VALUE('', 'GLOBAL.NEED_AUDIT');
  DEFAULT_VALUE('', 'GLOBAL.PCKG_AUDIT');
  DEFAULT_VALUE('', 'GLOBAL.PELL_AUDIT');
  DEFAULT_VALUE('', 'GLOBAL.EXEMPTION_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TERM_CODE');
  DEFAULT_VALUE('', 'GLOBAL.CONTRACT_PIDM');
  DEFAULT_VALUE('', 'GLOBAL.VALUE');
  DEFAULT_VALUE('', 'GLOBAL.VARIABLE');
  DEFAULT_VALUE('', 'GLOBAL.CONTRACT_NUMBER');
  DEFAULT_VALUE('', 'GLOBAL.QUERY');
  DEFAULT_VALUE('', 'GLOBAL.INFC_CODE');
  DEFAULT_VALUE('', 'GLOBAL.OVRD_IND');
  DEFAULT_VALUE('', 'GLOBAL.INAS_FLD_NO');
  DEFAULT_VALUE('', 'GLOBAL.TREQ_CODE');
  DEFAULT_VALUE('', 'GLOBAL.LPRD_CODE');
  DEFAULT_VALUE('', 'GLOBAL.LEVL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.LENDER_ID');
  DEFAULT_VALUE('', 'GLOBAL.INAS_OPTION');
  DEFAULT_VALUE('', 'GLOBAL.PGRP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.AID_PERIOD');
  DEFAULT_VALUE('', 'GLOBAL.PLACEMENT_CODE');
  DEFAULT_VALUE('', 'GLOBAL.OTH_RES_AMT');
  DEFAULT_VALUE('', 'GLOBAL.CON_RES_AMT');
  DEFAULT_VALUE('', 'GLOBAL.EXE_RES_AMT');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CONTRACT_IDNO');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CONTRACT_NUMBER');
  DEFAULT_VALUE('', 'GLOBAL.ACCESS_MODE');
--
END;

	*/
	//ID:31
		public void roqinit()
		{
			NString userId= NString.getNull();
			setGlobal("TIME_STAMP", toStr(""));
			setDefaultValue("", "GLOBAL.RORRULE_TYPE_IND");
			userId = getNameIn("GLOBAL.CURRENT_USER");
			setDefaultValue(userId, "GLOBAL.USER_ID");
			setDefaultValue("", "GLOBAL.PIDM");
			setDefaultValue("", "GLOBAL.AIDY_CODE");
			setDefaultValue("", "GLOBAL.TEST_AIDY_CODE");
			setDefaultValue("", "GLOBAL.APPL_SEQ_NO");
			setDefaultValue("", "GLOBAL.CURR_REC_IND");
			setDefaultValue("", "GLOBAL.BGRP_CODE");
			setDefaultValue("", "GLOBAL.TGRP_CODE");
			setDefaultValue("", "GLOBAL.BTYP_CODE");
			setDefaultValue("", "GLOBAL.CAMP_CODE");
			setDefaultValue("", "GLOBAL.APRD_CODE");
			setDefaultValue("", "GLOBAL.FUND_CODE");
			setDefaultValue("", "GLOBAL.BUDG_AUDIT");
			setDefaultValue("", "GLOBAL.NEED_AUDIT");
			setDefaultValue("", "GLOBAL.PCKG_AUDIT");
			setDefaultValue("", "GLOBAL.PELL_AUDIT");
			setDefaultValue("", "GLOBAL.EXEMPTION_CODE");
			setDefaultValue("", "GLOBAL.TERM_CODE");
			setDefaultValue("", "GLOBAL.CONTRACT_PIDM");
			setDefaultValue("", "GLOBAL.VALUE");
			setDefaultValue("", "GLOBAL.VARIABLE");
			setDefaultValue("", "GLOBAL.CONTRACT_NUMBER");
			setDefaultValue("", "GLOBAL.QUERY");
			setDefaultValue("", "GLOBAL.INFC_CODE");
			setDefaultValue("", "GLOBAL.OVRD_IND");
			setDefaultValue("", "GLOBAL.INAS_FLD_NO");
			setDefaultValue("", "GLOBAL.TREQ_CODE");
			setDefaultValue("", "GLOBAL.LPRD_CODE");
			setDefaultValue("", "GLOBAL.LEVL_CODE");
			setDefaultValue("", "GLOBAL.LENDER_ID");
			setDefaultValue("", "GLOBAL.INAS_OPTION");
			setDefaultValue("", "GLOBAL.PGRP_CODE");
			setDefaultValue("", "GLOBAL.AID_PERIOD");
			setDefaultValue("", "GLOBAL.PLACEMENT_CODE");
			setDefaultValue("", "GLOBAL.OTH_RES_AMT");
			setDefaultValue("", "GLOBAL.CON_RES_AMT");
			setDefaultValue("", "GLOBAL.EXE_RES_AMT");
			setDefaultValue("", "GLOBAL.KEY_CONTRACT_IDNO");
			setDefaultValue("", "GLOBAL.KEY_CONTRACT_NUMBER");
			setDefaultValue("", "GLOBAL.ACCESS_MODE");
		}

	
	/* Original PL/SQL code for Prog Unit SOQINIT
	
	PROCEDURE SOQINIT IS
BEGIN
  :GLOBAL.KEY_SBGI := '';
  :GLOBAL.KEY_MATL_CODE := '';
  :GLOBAL.KEY_COLL_CODE := '';
  :GLOBAL.KEY_LEVL_CODE := '';
  :GLOBAL.KEY_DEGNO := '';
  :GLOBAL.KEY_ORIG_CODE := '';
  :GLOBAL.KEY_DEPT_CODE := '';
  :GLOBAL.KEY_AREA := '';
  :GLOBAL.KEY_ONEUP := '';
  :GLOBAL.KEY_STYP_CODE := '';
  :GLOBAL.KEY_GTYP := '';
  :GLOBAL.CAPACITY := '';
  :GLOBAL.DESC1 := '';
  :GLOBAL.DESC2 := '';
  :GLOBAL.DESC3 := '';
  :GLOBAL.DESC4 := '';
  :GLOBAL.DESC5 := '';
  :GLOBAL.DESC6 := '';
  :GLOBAL.KEY_BUILDING := '';
  :GLOBAL.KEY_ROOM := '';
  :GLOBAL.KEY_XLST := '';
  :GLOBAL.RDEF1 := '';
  :GLOBAL.RDEF2 := '';
  :GLOBAL.RDEF3 := '';
  :GLOBAL.RDEF4 := '';
  :GLOBAL.RDEF5 := '';
  :GLOBAL.RDEF6 := '';
  :GLOBAL.SITE_CODE := '';
  :GLOBAL.TRAN_PRNTR := '';
--
  DEFAULT_VALUE('', 'GLOBAL.KEY_DUPLICATE'); 
  DEFAULT_VALUE('', 'GLOBAL.KEY_TERM');
  DEFAULT_VALUE('', 'GLOBAL.KEY_PTRM');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SEQN');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SUBJECT');
  DEFAULT_VALUE('', 'GLOBAL.KEY_COURSE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CRN');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SBGI');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SHATATC_SUBJ');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SHATATC_CRSE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SHATATC_GROUP');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SHATATC_ETERM');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SHATATC_TLVL');
  DEFAULT_VALUE('', 'GLOBAL.KEY_RECR');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CTYP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_MATL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_INSTALLMENT_PLAN');
  DEFAULT_VALUE('', 'GLOBAL.KEY_COLC_AGENCY');
  DEFAULT_VALUE('', 'GLOBAL.KEY_DELI_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_RECEIPT_NUMBER');
  DEFAULT_VALUE('', 'GLOBAL.KEY_RECEIPT_TGARCPT');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SESSION_NUMBER');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SESSION_USER');
  DEFAULT_VALUE('', 'GLOBAL.KEY_EXEMPTION_CODE');
  DEFAULT_VALUE('', 'GLOBAL.FORM_WAS_CALLED');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CONTRACT_NUMBER');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CONTRACT_IDNO');
  DEFAULT_VALUE('', 'GLOBAL.KEY_DCSN_TERM');
  DEFAULT_VALUE('', 'GLOBAL.KEY_DCSN_SEQ');
  DEFAULT_VALUE('', 'GLOBAL.KEY_APPL_NO');
  DEFAULT_VALUE('', 'GLOBAL.KEY_PAPER_SEQ_NO');
  DEFAULT_VALUE('', 'GLOBAL.KEY_COLL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_LEVL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CAMP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_TRAM_SEQ_NO');
  DEFAULT_VALUE('', 'GLOBAL.KEY_TRIT_SEQ_NO');
  DEFAULT_VALUE('', 'GLOBAL.KEY_DEGNO');
  DEFAULT_VALUE('', 'GLOBAL.KEY_ORIG_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_DEPT_CODE');
  DEFAULT_VALUE('N', 'GLOBAL.ROLL');
  DEFAULT_VALUE('N', 'GLOBAL.KEY_CASHIER_EXISTS');
  DEFAULT_VALUE('', 'GLOBAL.KEY_DEGREE_PROGRAM');
  DEFAULT_VALUE('', 'GLOBAL.KEY_BULLETIN_YEAR');
  DEFAULT_VALUE('', 'GLOBAL.KEY_AREA');
  DEFAULT_VALUE('', 'GLOBAL.KEY_AH_SUBJECT');
  DEFAULT_VALUE('', 'GLOBAL.KEY_AH_COURSE');
  DEFAULT_VALUE('', 'GLOBAL.CBIL_PRNTR');
  DEFAULT_VALUE('', 'GLOBAL.SCHD_PRNTR');
  DEFAULT_VALUE('', 'GLOBAL.KEY_BUILDING');
  DEFAULT_VALUE('', 'GLOBAL.KEY_ROOM');
  DEFAULT_VALUE('', 'GLOBAL.KEY_EVENT');
  DEFAULT_VALUE('', 'GLOBAL.KEY_DATE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_ONEUP');
  DEFAULT_VALUE('', 'GLOBAL.KEY_STYP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_GTYP');
  DEFAULT_VALUE('', 'GLOBAL.SSADETL_LEVL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SSADETL_DETL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SSADETL_AMOUNT');
  DEFAULT_VALUE('', 'GLOBAL.SSADETL_FEE_IND');
  DEFAULT_VALUE('', 'GLOBAL.KEY_ID');
  DEFAULT_VALUE('', 'GLOBAL.KEY_XLST');
  DEFAULT_VALUE('', 'GLOBAL.KEY_YEAR');
  DEFAULT_VALUE('', 'GLOBAL.KEY_FCNT');
  DEFAULT_VALUE('', 'GLOBAL.SCHD_IND');
  DEFAULT_VALUE('', 'GLOBAL.ADVR_IND');
  DEFAULT_VALUE('', 'GLOBAL.INST_PIDM');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SSGP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_ACCL_CODE');
  DEFAULT_VALUE('', 'GLOBAL.INFC_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_GOAL');
  DEFAULT_VALUE('', 'GLOBAL.KEY_NEED');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SSER');
  DEFAULT_VALUE('', 'GLOBAL.BLCK_CODE');
  DEFAULT_VALUE('', 'GLOBAL.USER_RESTRICT_IND');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CERT');
  DEFAULT_VALUE('', 'GLOBAL.CATT_IND');
  DEFAULT_VALUE('', 'GLOBAL.KEY_DEGS_AWRD_IND');
  DEFAULT_VALUE('', 'GLOBAL.KEY_EPRT');
  DEFAULT_VALUE('', 'GLOBAL.TYPE_IND');
  DEFAULT_VALUE('', 'GLOBAL.SRCE_IND');
  DEFAULT_VALUE('', 'GLOBAL.START_DATE');
  DEFAULT_VALUE('', 'GLOBAL.CPLN_CODE');
  DEFAULT_VALUE('', 'GLOBAL.CGRP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.COMMITTEE');
  DEFAULT_VALUE('', 'GLOBAL.SUM_RECR_TERM');
  DEFAULT_VALUE('', 'GLOBAL.SUM_RECR_LEVL');
  DEFAULT_VALUE('', 'GLOBAL.SUM_RECR_ADMIN_SEQNO');
  DEFAULT_VALUE('', 'GLOBAL.END_DATE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CATEGORY');
  DEFAULT_VALUE('', 'GLOBAL.SUM_TERM');
  DEFAULT_VALUE('', 'GLOBAL.SUM_APPL_NO');
  DEFAULT_VALUE('', 'GLOBAL.KEY_DEGC_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_MAJR_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SCBCRKY_SUBJ_CODE');
  DEFAULT_VALUE('', 'GLOBAL.SCBCRKY_CRSE_NUMB');
--
-- 215-2
  DEFAULT_VALUE('', 'GLOBAL.PROGRAM_BLOCK_NAME');
  DEFAULT_VALUE('', 'GLOBAL.AREA_BLOCK_NAME');
  DEFAULT_VALUE('', 'GLOBAL.GROUP_BLOCK_NAME');
  DEFAULT_VALUE('', 'GLOBAL.KEY_PROGRAM');
  DEFAULT_VALUE('', 'GLOBAL.KEY_AREA');
  DEFAULT_VALUE('', 'GLOBAL.KEY_GROUP');
  DEFAULT_VALUE('', 'GLOBAL.GRDE_MODE_NEEDED');
--
-- 217-1
  DEFAULT_VALUE('', 'GLOBAL.KEY_RGRP_CODE');
  DEFAULT_VALUE('', 'GLOBAL.REQUEST_NO');
  DEFAULT_VALUE('', 'GLOBAL.CAA_SEQNO');
--
-- 2111-1
  DEFAULT_VALUE('', 'GLOBAL.ACYR_CODE');
END;

	*/
	//ID:32
		public void soqinit()
		{
			setGlobal("KEY_SBGI", toStr(""));
			setGlobal("KEY_MATL_CODE", toStr(""));
			setGlobal("KEY_COLL_CODE", toStr(""));
			setGlobal("KEY_LEVL_CODE", toStr(""));
			setGlobal("KEY_DEGNO", toStr(""));
			setGlobal("KEY_ORIG_CODE", toStr(""));
			setGlobal("KEY_DEPT_CODE", toStr(""));
			setGlobal("KEY_AREA", toStr(""));
			setGlobal("KEY_ONEUP", toStr(""));
			setGlobal("KEY_STYP_CODE", toStr(""));
			setGlobal("KEY_GTYP", toStr(""));
			setGlobal("CAPACITY", toStr(""));
			setGlobal("DESC1", toStr(""));
			setGlobal("DESC2", toStr(""));
			setGlobal("DESC3", toStr(""));
			setGlobal("DESC4", toStr(""));
			setGlobal("DESC5", toStr(""));
			setGlobal("DESC6", toStr(""));
			setGlobal("KEY_BUILDING", toStr(""));
			setGlobal("KEY_ROOM", toStr(""));
			setGlobal("KEY_XLST", toStr(""));
			setGlobal("RDEF1", toStr(""));
			setGlobal("RDEF2", toStr(""));
			setGlobal("RDEF3", toStr(""));
			setGlobal("RDEF4", toStr(""));
			setGlobal("RDEF5", toStr(""));
			setGlobal("RDEF6", toStr(""));
			setGlobal("SITE_CODE", toStr(""));
			setGlobal("TRAN_PRNTR", toStr(""));
			setDefaultValue("", "GLOBAL.KEY_DUPLICATE");
			setDefaultValue("", "GLOBAL.KEY_TERM");
			setDefaultValue("", "GLOBAL.KEY_PTRM");
			setDefaultValue("", "GLOBAL.KEY_SEQN");
			setDefaultValue("", "GLOBAL.KEY_SUBJECT");
			setDefaultValue("", "GLOBAL.KEY_COURSE");
			setDefaultValue("", "GLOBAL.KEY_CRN");
			setDefaultValue("", "GLOBAL.KEY_SBGI");
			setDefaultValue("", "GLOBAL.KEY_SHATATC_SUBJ");
			setDefaultValue("", "GLOBAL.KEY_SHATATC_CRSE");
			setDefaultValue("", "GLOBAL.KEY_SHATATC_GROUP");
			setDefaultValue("", "GLOBAL.KEY_SHATATC_ETERM");
			setDefaultValue("", "GLOBAL.KEY_SHATATC_TLVL");
			setDefaultValue("", "GLOBAL.KEY_RECR");
			setDefaultValue("", "GLOBAL.KEY_CTYP_CODE");
			setDefaultValue("", "GLOBAL.KEY_MATL_CODE");
			setDefaultValue("", "GLOBAL.KEY_INSTALLMENT_PLAN");
			setDefaultValue("", "GLOBAL.KEY_COLC_AGENCY");
			setDefaultValue("", "GLOBAL.KEY_DELI_CODE");
			setDefaultValue("", "GLOBAL.KEY_RECEIPT_NUMBER");
			setDefaultValue("", "GLOBAL.KEY_RECEIPT_TGARCPT");
			setDefaultValue("", "GLOBAL.KEY_SESSION_NUMBER");
			setDefaultValue("", "GLOBAL.KEY_SESSION_USER");
			setDefaultValue("", "GLOBAL.KEY_EXEMPTION_CODE");
			setDefaultValue("", "GLOBAL.FORM_WAS_CALLED");
			setDefaultValue("", "GLOBAL.KEY_CONTRACT_NUMBER");
			setDefaultValue("", "GLOBAL.KEY_CONTRACT_IDNO");
			setDefaultValue("", "GLOBAL.KEY_DCSN_TERM");
			setDefaultValue("", "GLOBAL.KEY_DCSN_SEQ");
			setDefaultValue("", "GLOBAL.KEY_APPL_NO");
			setDefaultValue("", "GLOBAL.KEY_PAPER_SEQ_NO");
			setDefaultValue("", "GLOBAL.KEY_COLL_CODE");
			setDefaultValue("", "GLOBAL.KEY_LEVL_CODE");
			setDefaultValue("", "GLOBAL.KEY_CAMP_CODE");
			setDefaultValue("", "GLOBAL.KEY_TRAM_SEQ_NO");
			setDefaultValue("", "GLOBAL.KEY_TRIT_SEQ_NO");
			setDefaultValue("", "GLOBAL.KEY_DEGNO");
			setDefaultValue("", "GLOBAL.KEY_ORIG_CODE");
			setDefaultValue("", "GLOBAL.KEY_DEPT_CODE");
			setDefaultValue("N", "GLOBAL.ROLL");
			setDefaultValue("N", "GLOBAL.KEY_CASHIER_EXISTS");
			setDefaultValue("", "GLOBAL.KEY_DEGREE_PROGRAM");
			setDefaultValue("", "GLOBAL.KEY_BULLETIN_YEAR");
			setDefaultValue("", "GLOBAL.KEY_AREA");
			setDefaultValue("", "GLOBAL.KEY_AH_SUBJECT");
			setDefaultValue("", "GLOBAL.KEY_AH_COURSE");
			setDefaultValue("", "GLOBAL.CBIL_PRNTR");
			setDefaultValue("", "GLOBAL.SCHD_PRNTR");
			setDefaultValue("", "GLOBAL.KEY_BUILDING");
			setDefaultValue("", "GLOBAL.KEY_ROOM");
			setDefaultValue("", "GLOBAL.KEY_EVENT");
			setDefaultValue("", "GLOBAL.KEY_DATE");
			setDefaultValue("", "GLOBAL.KEY_ONEUP");
			setDefaultValue("", "GLOBAL.KEY_STYP_CODE");
			setDefaultValue("", "GLOBAL.KEY_GTYP");
			setDefaultValue("", "GLOBAL.SSADETL_LEVL_CODE");
			setDefaultValue("", "GLOBAL.SSADETL_DETL_CODE");
			setDefaultValue("", "GLOBAL.SSADETL_AMOUNT");
			setDefaultValue("", "GLOBAL.SSADETL_FEE_IND");
			setDefaultValue("", "GLOBAL.KEY_ID");
			setDefaultValue("", "GLOBAL.KEY_XLST");
			setDefaultValue("", "GLOBAL.KEY_YEAR");
			setDefaultValue("", "GLOBAL.KEY_FCNT");
			setDefaultValue("", "GLOBAL.SCHD_IND");
			setDefaultValue("", "GLOBAL.ADVR_IND");
			setDefaultValue("", "GLOBAL.INST_PIDM");
			setDefaultValue("", "GLOBAL.KEY_SSGP_CODE");
			setDefaultValue("", "GLOBAL.KEY_ACCL_CODE");
			setDefaultValue("", "GLOBAL.INFC_CODE");
			setDefaultValue("", "GLOBAL.KEY_GOAL");
			setDefaultValue("", "GLOBAL.KEY_NEED");
			setDefaultValue("", "GLOBAL.KEY_SSER");
			setDefaultValue("", "GLOBAL.BLCK_CODE");
			setDefaultValue("", "GLOBAL.USER_RESTRICT_IND");
			setDefaultValue("", "GLOBAL.KEY_CERT");
			setDefaultValue("", "GLOBAL.CATT_IND");
			setDefaultValue("", "GLOBAL.KEY_DEGS_AWRD_IND");
			setDefaultValue("", "GLOBAL.KEY_EPRT");
			setDefaultValue("", "GLOBAL.TYPE_IND");
			setDefaultValue("", "GLOBAL.SRCE_IND");
			setDefaultValue("", "GLOBAL.START_DATE");
			setDefaultValue("", "GLOBAL.CPLN_CODE");
			setDefaultValue("", "GLOBAL.CGRP_CODE");
			setDefaultValue("", "GLOBAL.COMMITTEE");
			setDefaultValue("", "GLOBAL.SUM_RECR_TERM");
			setDefaultValue("", "GLOBAL.SUM_RECR_LEVL");
			setDefaultValue("", "GLOBAL.SUM_RECR_ADMIN_SEQNO");
			setDefaultValue("", "GLOBAL.END_DATE");
			setDefaultValue("", "GLOBAL.KEY_CATEGORY");
			setDefaultValue("", "GLOBAL.SUM_TERM");
			setDefaultValue("", "GLOBAL.SUM_APPL_NO");
			setDefaultValue("", "GLOBAL.KEY_DEGC_CODE");
			setDefaultValue("", "GLOBAL.KEY_MAJR_CODE");
			setDefaultValue("", "GLOBAL.SCBCRKY_SUBJ_CODE");
			setDefaultValue("", "GLOBAL.SCBCRKY_CRSE_NUMB");
			setDefaultValue("", "GLOBAL.PROGRAM_BLOCK_NAME");
			setDefaultValue("", "GLOBAL.AREA_BLOCK_NAME");
			setDefaultValue("", "GLOBAL.GROUP_BLOCK_NAME");
			setDefaultValue("", "GLOBAL.KEY_PROGRAM");
			setDefaultValue("", "GLOBAL.KEY_AREA");
			setDefaultValue("", "GLOBAL.KEY_GROUP");
			setDefaultValue("", "GLOBAL.GRDE_MODE_NEEDED");
			setDefaultValue("", "GLOBAL.KEY_RGRP_CODE");
			setDefaultValue("", "GLOBAL.REQUEST_NO");
			setDefaultValue("", "GLOBAL.CAA_SEQNO");
			setDefaultValue("", "GLOBAL.ACYR_CODE");
		}

	
	/* Original PL/SQL code for Prog Unit TOQINIT
	
	PROCEDURE TOQINIT IS
BEGIN
  DEFAULT_VALUE('', 'GLOBAL.AIDY_CODE');
  DEFAULT_VALUE('', 'GLOBAL.CALL_FORM');
  DEFAULT_VALUE('', 'GLOBAL.CBIL_PRNTR');
  DEFAULT_VALUE('', 'GLOBAL.CONTRACT_ID_VALUE');
  DEFAULT_VALUE('', 'GLOBAL.CONTRACT_NUMBER_VALUE');
  DEFAULT_VALUE('', 'GLOBAL.CONTRACT_TERM_VALUE');
  DEFAULT_VALUE('', 'GLOBAL.DEF_AMOUNT');
  DEFAULT_VALUE('', 'GLOBAL.DISB_RUN');
  DEFAULT_VALUE('', 'GLOBAL.EXEMPTION_CODE_VALUE');
  DEFAULT_VALUE('', 'GLOBAL.EXEMPTION_TERM_VALUE');
  DEFAULT_VALUE('', 'GLOBAL.FORM_WAS_CALLED');
  DEFAULT_VALUE('', 'GLOBAL.INSTITUTION');
  DEFAULT_VALUE('', 'GLOBAL.JOB_ID');
  DEFAULT_VALUE('', 'GLOBAL.KEY_ADJ_CASHIER');
  DEFAULT_VALUE('', 'GLOBAL.KEY_ADJ_SESSION');
  DEFAULT_VALUE('', 'GLOBAL.KEY_ADJ_SNUM');
  DEFAULT_VALUE('', 'GLOBAL.KEY_COLC_AGENCY');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CONTRACT_IDNO');
  DEFAULT_VALUE('', 'GLOBAL.KEY_CONTRACT_NUMBER');
  DEFAULT_VALUE('', 'GLOBAL.KEY_DELI_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_END_DATE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_END_TIME');
  DEFAULT_VALUE('', 'GLOBAL.KEY_EXEMPTION_CODE');
  DEFAULT_VALUE('', 'GLOBAL.KEY_HOLD_USER');
  DEFAULT_VALUE('', 'GLOBAL.KEY_ID');
  DEFAULT_VALUE('', 'GLOBAL.KEY_IDNO');
  DEFAULT_VALUE('', 'GLOBAL.KEY_INSTALLMENT_PLAN');
  DEFAULT_VALUE('', 'GLOBAL.KEY_RECEIPT_NUMBER');
  DEFAULT_VALUE('', 'GLOBAL.KEY_RECEIPT_TGARCPT');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SESSION_NUMBER');
  DEFAULT_VALUE('', 'GLOBAL.KEY_SESSION_USER');
  DEFAULT_VALUE('', 'GLOBAL.KEY_TERM');
  DEFAULT_VALUE('', 'GLOBAL.KEY_USER');
  DEFAULT_VALUE('', 'GLOBAL.NEW_FORM');
  DEFAULT_VALUE('', 'GLOBAL.RCPT_PRNTR');
  DEFAULT_VALUE('', 'GLOBAL.SAMSYS');
  DEFAULT_VALUE('', 'GLOBAL.SECRFRM');
  DEFAULT_VALUE('', 'GLOBAL.SESSION_ID');
  DEFAULT_VALUE('', 'GLOBAL.TERM_CODE');
  DEFAULT_VALUE('', 'GLOBAL.TIME_STAMP');
  DEFAULT_VALUE('', 'GLOBAL.USER_ID');
  DEFAULT_VALUE('', 'GLOBAL.VALUE');
  DEFAULT_VALUE('', 'GLOBAL.SYSTEM_IND');
  DEFAULT_VALUE('', 'GLOBAL.USER_RESTRICT_IND');
  DEFAULT_VALUE('', 'GLOBAL.UPRF_USERID');
  DEFAULT_VALUE('', 'global.casn_exists');
  DEFAULT_VALUE('', 'GLOBAL.SUPERV_IND');
--
END;
	*/
	//ID:33
		public void toqinit()
		{
			setDefaultValue("", "GLOBAL.AIDY_CODE");
			setDefaultValue("", "GLOBAL.CALL_FORM");
			setDefaultValue("", "GLOBAL.CBIL_PRNTR");
			setDefaultValue("", "GLOBAL.CONTRACT_ID_VALUE");
			setDefaultValue("", "GLOBAL.CONTRACT_NUMBER_VALUE");
			setDefaultValue("", "GLOBAL.CONTRACT_TERM_VALUE");
			setDefaultValue("", "GLOBAL.DEF_AMOUNT");
			setDefaultValue("", "GLOBAL.DISB_RUN");
			setDefaultValue("", "GLOBAL.EXEMPTION_CODE_VALUE");
			setDefaultValue("", "GLOBAL.EXEMPTION_TERM_VALUE");
			setDefaultValue("", "GLOBAL.FORM_WAS_CALLED");
			setDefaultValue("", "GLOBAL.INSTITUTION");
			setDefaultValue("", "GLOBAL.JOB_ID");
			setDefaultValue("", "GLOBAL.KEY_ADJ_CASHIER");
			setDefaultValue("", "GLOBAL.KEY_ADJ_SESSION");
			setDefaultValue("", "GLOBAL.KEY_ADJ_SNUM");
			setDefaultValue("", "GLOBAL.KEY_COLC_AGENCY");
			setDefaultValue("", "GLOBAL.KEY_CONTRACT_IDNO");
			setDefaultValue("", "GLOBAL.KEY_CONTRACT_NUMBER");
			setDefaultValue("", "GLOBAL.KEY_DELI_CODE");
			setDefaultValue("", "GLOBAL.KEY_END_DATE");
			setDefaultValue("", "GLOBAL.KEY_END_TIME");
			setDefaultValue("", "GLOBAL.KEY_EXEMPTION_CODE");
			setDefaultValue("", "GLOBAL.KEY_HOLD_USER");
			setDefaultValue("", "GLOBAL.KEY_ID");
			setDefaultValue("", "GLOBAL.KEY_IDNO");
			setDefaultValue("", "GLOBAL.KEY_INSTALLMENT_PLAN");
			setDefaultValue("", "GLOBAL.KEY_RECEIPT_NUMBER");
			setDefaultValue("", "GLOBAL.KEY_RECEIPT_TGARCPT");
			setDefaultValue("", "GLOBAL.KEY_SESSION_NUMBER");
			setDefaultValue("", "GLOBAL.KEY_SESSION_USER");
			setDefaultValue("", "GLOBAL.KEY_TERM");
			setDefaultValue("", "GLOBAL.KEY_USER");
			setDefaultValue("", "GLOBAL.NEW_FORM");
			setDefaultValue("", "GLOBAL.RCPT_PRNTR");
			setDefaultValue("", "GLOBAL.SAMSYS");
			setDefaultValue("", "GLOBAL.SECRFRM");
			setDefaultValue("", "GLOBAL.SESSION_ID");
			setDefaultValue("", "GLOBAL.TERM_CODE");
			setDefaultValue("", "GLOBAL.TIME_STAMP");
			setDefaultValue("", "GLOBAL.USER_ID");
			setDefaultValue("", "GLOBAL.VALUE");
			setDefaultValue("", "GLOBAL.SYSTEM_IND");
			setDefaultValue("", "GLOBAL.USER_RESTRICT_IND");
			setDefaultValue("", "GLOBAL.UPRF_USERID");
			setDefaultValue("", "global.casn_exists");
			setDefaultValue("", "GLOBAL.SUPERV_IND");
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_1_0
	
	PROCEDURE AUDIT_TRAIL_1_0 IS
<multilinecomment>
AUDIT TRAIL: 1.2                                            INIT      DATE
1. New MENU application.                                     JW     07/15/88

AUDIT TRAIL: 1.4
1. Handle new columns added to GUBINST table which are system  89-6053
   installed flags and bypass alternate password validation. JW     04/04/88

AUDIT TRAIL: 1.5
1. Move GLOBAL.KEY_IDNO initialization to this form and      JW     06/27/89
   removed from ?OQMENU application forms.
2. Removed references for support of defunct "JOB SUBMISSION"JW     08/30/89
3. Added read of security indicator from GUBINST, created
   globals for security ind, security user, paragraphs and
   letters.                                                  CD     09/21/89

AUDIT TRAIL: 1.7
1. Added call to GUALOGO.                                    BR     07/07/90
2. Added select, field and global for Banner Financial Aid   SQ     08/10/90
   system.

AUDIT TRAIL: 1.8
1. Added globals for external processing.                    SQ     10/05/90
2. Added global for use in determining access to alternate   SQ     12/04/90
   user-id and password form (GUAUIPW) if site is utilizing
   automatic logins (OPS$).
3. Added globals for geographic region and product indicator.  CD   12/13/90

AUDIT TRAIL: 1.9
1. Added global for calling process. (KEY_CALL_CODE).
2. Removed unused globals.                                     SQ   01/22/91
3. Added calls to ?OQINIT forms based on system installed
   indicator.                                                  RM   04/01/91
4. Added global for Alumni to reference back and forth
   from the Message form to Alumni form. This global can be used
   by other products. GLOBAL.MESSAGE_ID and GLOBAL.ITEM_REFNO  ND   04/18/91

AUDIT TRAIL: 1.10
1. Added GLOBAL.PROJ_CODE to KEY-STARTUP.                      ND   07/24/91
2. Added GLOBAL.USER_ID   to KEY-STARTUP.                      SQ   08/09/91
3. Removed TWO_CHAR from USERENV('SESSIONID') as it is not     JW   08/16/91
   necessary and conflicts with forms 3.x datatyping.
4. Added code for Courts initialization.                      FHL   08/19/91
5. Added global for address type and sequence no.              CD   11/11/91

AUDIT TRAIL: 1.11
1. Added code for Utilities initialization.                   JEF   09/03/92

AUDIT TRAIL END   
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:34
		public void auditTrail10()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_0
	
	PROCEDURE AUDIT_TRAIL_2_0 IS
<multilinecomment>
AUDIT TRAIL: 2.0
1. Added global.century_pivot and valued with "28"    FHL   04/23/93
   until its added to gubinst for user to value.
2. Added global.date_default_format and valued with   FHL   04/23/93
   "1" until its added to gubinst for user to value.
3. Added Global.new_id used in global procedure       FHL   04/30/93
   SEL$_SPRIDEN_PIDM_NAME which values this field if
   the ID sent to the procedure has been changed.
4. Modified for Pop-Up window                              BG  05-06-93
5. Added selection of century_pivot, date_default_format
   and loaded into corresponding globals.              TM 06/17/93
6. Added new global.event_func_code for event module.  TM 09/13/93
7. Removed BANNER as the default menu application. Changed
   CURRENT_DATE's X coordinate to be null, it was 254.   TM 11/18/93
8. Added new common globals.                             TM 02/04/94

AUDIT TRAIL END   
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:35
		public void auditTrail20()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_1
	
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment>
AUDIT TRAIL: 2.1 
1. Added new global variables for WHEN-NEW-ITEM-INSTANCE 
   trggger, and modified for 4.0 conversion.   BG 06/08/94
2. Added new globals for options menu.         TM 09/29/94

AUDIT TRAIL: 2.1.5
1. Added new ALUMNI specific globals to procedure AOQINIT. FHL 5/17/95
2. Added new Payroll and Student specific globals.           SQ 06/07/95
3. Added new role security logic.                            SQ 07/12/95
4. Added new Finance specific global.                        SQ 07/24/95
5. Added new globals to track the number and names           SQ 08/03/95
   of open forms.
6. Added additional Payroll and Position Control globals.    SQ 08/23/95
7. Changed call to utility's library to a procedure.         SQ 11/16/95
8. Conversion to forms 4.5.                                  SQ 03/21/96

AUDIT TRAIL: 2.1.11
1. Added new STUDENT specific global.                        SQ 12/21/95
2. Added new PAYROLL specific globals.                       SQ 01/16/96
3. Added new FINANCE specific globals.                       SQ 01/16/96
4. Modify logic to set global install variables to N         SQ 06/25/96
   if a product is not installed.  The previous value was
   set to null (4226).
5. Added new PAYROLL specific globals.                       SQ 09/18/96
6. Added new FINANCE specific globals for GST.               SQ 10/08/96
7. Added new PAYROLL specific global.                        SQ 10/10/96

AUDIT TRAIL END   
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:36
		public void auditTrail21()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL: 3.0
1. SQ  05/20/97
   Add new globals for B2K conversion.  Also added new logic
   to display and call different forms based on whether or
   not the form is running in a character mode or a gui mode.
2. TAM 05/26/97
   Changed when-new-form-instance. Added cursor to fetch the numeric
   user_id from all_users and store it in global_numeric_user_id. This
   will be used in jobsubmission.
3. TAM 06/13/97
   Changed when-new-form's pti-init cursor to get new gubinst_charmod_gurjobs_ind
   into global.charmode_use_gurjobs, global.os_ind = get_app_property(operating_system),
   global.user_interface = get_app_property(user_interface).
   This give clients running charmode the opportunity to do the host command
   instead of using gurjobs if the jobs are run on the same machine as charmode. 
4. BR 06/24/97
   Changed the coordinate system from character to real/point.  Modified the PRE-FORM
   trigger to resize the MDI window to 475,385 points.  This insures that all lines of
   the window will display.  Modified window/canvas sizes to reflect the correct point
   coordinates.
5. SJQ 07/01/97
   Add call to new database routine (GENUTIL.ADD_DEFAULTS) to populate any missing
   user default preferences.
6. SJQ 07/07/97
   Rewrite some of the logic to support web forms.
7. SJQ 07/22/97
   Modify to create a new higher ed/govt indicator and global.

AUDIT TRAIL: 3.0.1
1. SJQ 12/03/97
   Added logic to when-new-form-instance trigger to create a global to hold
   the value of the whether the 32 bit environment is a windows 95 or nt 
   machine.  This reads the registry to determine this and defaults to 95.
2. SJQ 02/07/98
   Modify startup logic to populate the global storing the current user id to
   default to USER since the get_application_property will return NULL for 
   OPS$ accounts which do not have passwords.
3. SJQ 03/17/98
   Add an exception handler to the WHEN-NEW-FORM-INSTANCE to help identify
   unexpected problems and force the user to exit the form.

AUDIT TRAIL: 3.1.0.1
1. SJQ 06/29/98
   Modify to use tif image types instead of gif.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:37
		public void auditTrail30()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0
1.  JC  03/13/98
    Modified the PRE-FORM trigger to resize the MDI window and set it from right upper
    corner of display. Created new canvas that contain new Desktop image. Removed logic
    for WEB(working the same way as Windows).Removed global SECRSYS.
2.  SJQ 05/01/98
    Add two new globals for the new extended search routines.
3.  SJQ 09/18/98
    Moved the following globals to the Student init routine:
    GLOBAL.KEY_SBGI,GLOBAL.KEY_MATL_CODE,GLOBAL.KEY_COLL_CODE,GLOBAL.KEY_LEVL_CODE,
    GLOBAL.KEY_DEGNO,GLOBAL.KEY_ORIG_CODE,GLOBAL.KEY_DEPT_CODE,GLOBAL.KEY_AREA,
    GLOBAL.KEY_ONEUP,GLOBAL.KEY_STYP_CODE,GLOBAL.KEY_GTYP,GLOBAL.CAPACITY,
    GLOBAL.DESC1,GLOBAL.DESC2,GLOBAL.DESC3,GLOBAL.DESC4,GLOBAL.DESC5,
    GLOBAL.DESC6,GLOBAL.KEY_BUILDING,GLOBAL.KEY_ROOM,GLOBAL.KEY_XLST,
    GLOBAL.RDEF1,GLOBAL.RDEF2,GLOBAL.RDEF3,GLOBAL.RDEF4,GLOBAL.RDEF5,
    GLOBAL.RDEF6,GLOBAL.SITE_CODE,GLOBAL.TRAN_PRNTR

    Moved the following globals to the FinAid init routine:
    GLOBAL.MENU_FORM,GLOBAL.TIME_STAMP

    Moved the following globals to the Payroll init routine:
    GLOBAL.KEY_DATE

    Removed the following globals:
    GLOBAL.MENU_NEWFRM_FORM,GLOBAL.HOST_CALL_FORM,GLOBAL.HOSTCMD,
    GLOBAL.HOST_SUBMIT_FORM,GLOBAL.CALL_TAX_VERIFY,GLOBAL.CURRENT_TIME,
    GLOBAL.KEY_SEQN,GLOBAL.KEY_CTYP_CODE,GLOBAL.OWNER_ID,
    GLOBAL.G_QUADRANT,GLOBAL.PREV_FORM,GLOBAL.START_DATEDD-MON-YYYY,
    GLOBAL.END_DATEDD-MON-YYYY   
4.  SJQ 12/01/98
    Changed images and removed extra canvases.  Shortened the amount of time
    that the screen is displayed.
5.  SJQ 12/04/98
    Added new global and dynamic sql for Finance to determine whether or not
    the user is an authorized expenditurer.
6.  SJQ 12/08/98
    Added new global for use with workflow.
7.  SJQ 01/25/99
    Added a routine to query the user's preferences for what should be displayed on
    the window title.
8.  SJQ 01/28/99
    Add a referenced alert and logic to the on-error trigger to trap errors and 
    display them using the alert.
9.  SJQ 02/15/99
    Added the new parameter list reference items.  Modified to use new logic to 
    populate the parameter lists from the database instead of from the registry.
10. Removed code referring to :global.charmode_use_gurjobs and to
    the column gubinst_charmode_gurjobs_ind from the when-new-form-instance
11. AC 05/25/99
    Attached Workflow library GOQWFLW.
12. MVS 06/03/1999
    Modified the WHEN-NEW-FORM-INSTANCE trigger to remove hard-coded
    Workflow-related globals and to instead invoke a generic packaged procedure
    within GOQWFLW to initialize whatever globals that are determined to be needed
    upon the delivery of SCT Workflow.  If Workflow is not installed or is not
    enabled at a client site, the trigger will not perform any Workflow function. 
13. SJQ 06/09/99
    Move the GLOBAL.MENU_FORM global from the financial aid routine back to the
    when-new-form-instance trigger.
14. SJQ 06/26/99
    Add logic to the when-new-form-instance trigger to append the instance name to
    the mdi title.

AUDIT TRAIL: 4.0.1
1.  Robert D. Rullo 07/23/99
    Added global variables for Desktop Tools enhancement. 
    (:GLOBAL.DSKT_ADDIN_CODE, :GLOBAL.DSKT_WIZARD_NAME, :GLOBAL.DSKT_PROPERTY_CODE, 
     :GLOBAL.DSKT_STEPTYPE_CODE, :GLOBAL.DSKT_RECIPIENT_USER_ID)

AUDIT TRAIL: 4.1
1.  AC  08/20/99
    In the WHEN-NEW-FORM-INSTANCE trigger, assigned default values
    to the following new global variables for Events: global.eqts_code,
    global.eqnm_code, global.eqpg_code.
2.  MVS 09/16/1999
    Added a new form parameter, WF_ACTIONQUEUE_IOR.  The value of
    this parameter will be used by the Banner2000 Workflow-Aware
    Library, GOQWFLW, to establish communication between SCT Workflow
    and a Banner2000 session that it launches.
3.  NMCKINNE 10/19/99 
    Added new global global.wfed_code.     
4.  Michael Hitrik 12/13/1999 
    Added new global global.wfed_code.   
5.  Nic Romanazzi 12/16/99
    Added new global wfed_oracle_user_id         
6.  SJQ 12/21/99
    Change the image to use a new version which has the new logo.
7.  MVS 12/31/1999
    Added statement to WHEN-NEW-FORM-INSTANCE trigger to initialize
    the new global variable GLOBAL.MSWINDOWS_VERSION (see trigger for details).

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:38
		public void auditTrail40()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  TGKinderman  06/05/2000
		Modified tail end of PRE-FORM trigger to change the height of the mdi window
		for MSWINDOWS from 398 to 401.  Anything less than 401 causes scroll bars.
		Imported splash image modified for release 5.0 per the following instructions:
			Go to canvas layout editor.
			Don't select anything.
			File/Import.  Highest quality.  Browse and bring in GIF file.
			Resize lower right edge to fit picture.
			Send to back.
			Click on the older image and hit the delete key.
2.  MVS 07/31/2000
    Moved a call to the G$_WF_DRIVER.WF_EXECUTE procedure of GOQWFLW from the
    WHEN-NEW-FORM-INSTANCE trigger to a new ON-LOGON trigger.  Added two more
    calls to the G$_WF_DRIVER.WF_EXECUTE procedure to ON-LOGON to enable
    the establishment of communication between Banner2000 and SCT Workflow
    such that a userid and password can be retrieved from Workflow for
    automatic logon into SCT Banner, should a userid and password not
    already be specified.			
3.  SJQ 08/31/2000
    Modified reference to G$_WIN_API routines to use the WIN_API routines.
4.  SJQ 09/07/2000
    Modify the WHEN-NEW-FORM-INSTANCE trigger to trap the exeception when attempting to
    utilize the functions within the WIN_API routines.  If an exception is raised, it
    will display an alert about the D2KWUT60.DLL.
5.  SJQ 10/11/2000
    Change the image to use a new version which has the new logo.  Also changed
    all refereneces on windows, alerts and messages from Banner2000 to 
    SCT Banner.
6.  GShalovka  09 November 2000
    Add GLOBAL.FORMNAME_DIPSLAY_IND and code to Program Unit PREFERENCES to select value 
    from GURTPRF table.  This new variable will be used in GOQRPLS.Navigation_Frame 
    to determine display options for form name in Menu Bar Options and Navigation Frame.
7.  SJQ 01/10/2001
    Modify and replace the splash screen so that it has a registered trade mark
    symbol.  Also change the default value for the FORMNAME_DISPLAY_IND global 
    so that it defaults to 'N'.
    
AUDIT TRAIL: 5.2
1. Defect....40524  HTran 01-FEB-2001
   Problem...Problem on GXIBANK (4.0) with GLOBAL.coas_code. This problem was replicated on
             Gen41.  If you have General installed on GUAINST and not Finance and Position
             Control and Payroll you will get error on GXIBANK when entering form
             FRM-40815: Variable GLOBAL.coas_code does not exist.
   Fix.......Form Level trigger When-New-Form-Instance trigger, Add
             DEFAULT_VALUE('', 'GLOBAL.COAS_CODE');
2. Defect....6119,12662  TGKinderman 16-MAY-2001
   Problem...GTVZIPC "exit with value" only passes out the ZIPCODE value.  ZIPCODE and CITY
             need to be passed out to identify proper GTVZIPC row.
   Fix.......In the form-level trigger WHEN-NEW-FORM-INSTANCE, create global.value_2.
   
AUDIT TRAIL: 5.3.0.1
1.  SJQ 03/08/2002
    Modify the ON-ERROR trigger to remove the EXIT_FORM command since this is a restricted 
    command and not supported in this trigger.  Added a POST-LOGON trigger to verify that the
    user was able to successfully connect.  If not, display a message to that affect and then
    raise an exception which causes the form to exit.
2.  SJQ 03/08/2002
    Modify the WHEN-NEW-FORM-INSTANCE trigger to replace all message commands with the use of
    alerts.  Messages don't work on this form since there is no console window.  Added a 
    WHEN-MOUSE-DOUBLECLICK trigger to override the inherited one.  Modify the POST-LOGIN trigger
    to handle cases of the user canceling the login process and when the user enters invalid 
    user ids or passwords.  

AUDIT TRAIL: 5.4
1.  SJQ 12/01/2001
    Modify the main logic in the form to read the display image from the file system instead
    of having it within the form.  Modified the ON-ERROR to handle not being able to find the
    image file, give error and then continue.  Modified the form to no longer use the OK button
    when running through the browser (removed WHEN-BUTTON-PRESSED trigger).  This was done by 
    modifying the WHEN-NEW-FORM-INSTANCE trigger to emulate a timer with a call to dbms_lock.sleep.
    This also means that the call to create a timer in client/server is not needed (removed the 
    MAKE_STARTUP_TIMER routine).  The WNFI trigger was modified to use the read_image_file to 
    search for banner.gif.  Also modified the desktop_canvas to have a white background and added
    a black and white SCT logo at the bottom.
2.  G Shalovka  14 Jan 2002  -  Startup Menu Enhancement
    Modify form trigger LEAVE_INIT to call new G$_GET_UPRF_STARTUP_MENU function
    to return user preferred menu.  If no user-specific value is found, function
    defaults to institution-specific setting.  Banner default is *MENU.
    This replaces hardcoded value of '*PROCESS' menu.
3.  SJQ 01/28/2002
    Modify the LEAVE_INIT routine to change the message command and logic to get the menu startup 
    setting to use an alert and to set a default value in that case.  Add an exception handler for 
    when it fails.
4.  SJQ 02/05/2002
    Modify the WHEN-NEW-FORM-INSTANCE trigger to remove multiple entries for the GLOBAL.QUERY_MODE.
    This is set in the PRE-FORM and was being reset several more times in the WNFI.
5.  SJQ 02/17/2002
    Comment out the logic in the WHEN-NEW-BLOCK-INSTANCE trigger which relates to the navigation 
    frame.  This is logic that is inherited by the property class but does not apply to this form.
    
AUDIT TRAIL: 5.5
1.  TGKinderman 06/19/2002
    Added parameter WF_ARGS in support of Workflow3.0.  To support communication when Banner
    is started by Workflow3.0.  Parameter WF_ACTIONQUEUE_IOR remains to support Workflow2.x
    startup communication.
2.  TGKinderman 07/03/2002
    DEFECT:.....78488
    PROBLEM:....This problem is only related to client/server.  Caused by running Banner
    with Ncle*Developer6i Patchset7 or higher (example patchset 9) and using General5.4
    banner.gif display functionality.  When using client/server Banner the banner.gif is
    displayed for about a millisecond. Then, you only see a white background for about 2
    seconds with the small black SCT logo in the bottom left corner. 
    SOLUTION:...Ncle has replicated this problem and suggested adding another synchronize
    statement immediately after the sychronize statement in the when-new-form-instance
    trigger.  Ncle also stated this problem goes away in Forms9i.
3.  JTropea 07/12/02
    Added two lines in the when new form instance trigger on the form. The first line sets 
    the set_inst global that is used to recognize that an institution was chosen.  When the 
    user comes into the form, it's set to N, if the user has the ability to choose an institution,
    GUQSETI is involked in the LEAVE INIT trigger. The user chooses an institution in GUQSETI and then gets brought back here with a global value
    of Y to ensure the form doesn't get called again. The second line sets the institution global 
    to be displayed in the title of the windows.
    Also added code to the Leave Init trigger to call the GUQSETI form for the user to choose
    an institution code if the user has access to more than one.
4.  SJQ 08/08/2002
    Modify the form level property to assign a console window so that error messages can be
    displayed like all other forms.  This required a modification to the PRE-FORM trigger which
    was setting the MDI window size and resizing the canvas size.  Adding the status line caused 
    scroll bars to be displayed.  Removed the GLOBAL.COAS_CODE from all other routines since it 
    was added to the WNFI.  Added GLOBAL.IMAGE_NAME since this was missing and causing errors.
5.  SJQ 08/14/2002
    Remove the ON-ERROR routine so that it does not fire.  This routine was not working 
    correctly with the password verification logic.  No error messages were being displayed.
6.  TGKinderman 09/24/2002
    Establish proper initialization of global.set_inst in the when-new-form-instance trigger.    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:41
		public void auditTrail50()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1.  HCheng 10/10/2002
    Applied 5.5 system test defect correction.
2.  A Kulkarni 01/13/2003
    PROBLEM:....Problem with splash screen(banner.gif) not displaying in INB related to password 
    error.
    SOLUTION:...Modified when-new-form-instance trigger and added synchronize statement just before 
    the read_image_file built-in for INB Forms.
3.  SJQ 01/21/2003
    Updated the WHEN-NEW-FORM-INSTANCE trigger to fetch a new column from the GUBINST table and
    populate a new global which identifies whether or not the sqltrace option on GUMAPPL is
    enabled or not.  GUMAPPL start up code reads the value of the global.  Also removed all 
    references to the government and utilities products.
4.  SJQ 01/23/2003
    Modify the WHEN-NEW-FORM-INSTANCE trigger to read the gif file from "URL" if not client/server
    so that it reads the file from a jar file.

AUDIT TRAIL: 6.1
1.  SJQ 08/07/2003
    Modify the LEAVE_INIT trigger to change the NEW_FORM commands to calls to the 
    G$_SECURED_FORM_CALL_PL.  
2.  SJQ 08/08/2003    
    Add a new parameter (LAUNCH_FORM) to hold the value of a form to automatically navigate to.  
    This is a command line parameter which will start the selected form up in stand alone mode.  
    Modify the start up logic to skip the display of the logo screen and the delay if the parameter
    is passed.  Add the GUMAPPL.mmb to the form to eliminate form start up errors.  Add another
    parameter (KEEP_ALIVE) to allow the menu form to be displayed after the LAUNCH_FORM is called.
    Modify the call to the GUQSETI form to pass the new parameters.
    
AUDIT TRAIL: 6.1.1
1.  SJQ 11/12/2003
    Add logic to the WHEN-NEW-FORM-INSTANCE trigger to determine if the user is authorized to
    perform the extended query functionality and populate a global with the value.  This is then
    used in the G$_GOQOLIB_KEY_TRIGGER.ON_SELECT routine which is executed when an execute query
    command is fired.

AUDIT TRAIL: 6.2
1.  SJQ 02/02/2004
    Remove all of the columns from the form_header which were used as part of the fetch in the 
    when-new-form-instance trigger and modify the fetch to use the globals instead of local items.
    Add calls to populate the global temporary menu tables for the product and personal menus.
    This is done to speed up the menu form and allows for the removal of the sleep command.
2.  TGKinderman 03/02/2004
    Added initialization of global.mod_id to when-new-form-instance.  This global is used with
    a form that has had the form_header.mod_id item added.  It is used to pass the value into the
    guaabot form for display.  The FORM_HEADER.MOD_ID is a "form branding mechanism".  It is not
    intended to work with versioning.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:42
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  SJQ 07/21/2003
    Upgrade to new version of toolset.
2.  SJQ 07/21/2003
    Changed PRE-FORM to resize mdi window to fit 1024 x 768 size screen.  Modify the PREFERENCES
    package to set the toolbar settings to 'N'.  Comment out logic which is platform specific and
    not 'web'.
3.  SJQ 07/28/2003
    Modify the PREFERENCES package to remove all references to the horizontal and vertical
    toolbar.  Delete the toolbar related parameters.
4.  SJQ 09/02/2003
    Added a new global, QF_STATUS, to be used with quick flows to show either the list of forms
    in the list or a status, on the window title.
5.  SJQ 09/25/2003
    Modify the WHEN-NEW-FORM-INSTANCE trigger to change the use of USERENV to use SYS_CONTEXT
    instead as recommended by Ncle documentation.  Added a call to the SYS_CONTEXT to obtain 
    the operating system user id and fetch that into a new global.
6.  SJQ 10/02/2003
    Added a new global, EXIT_TO_MENU, to be used with form nesting and wanting to return directly
    back to the menu.
7.  SJQ 10/28/2003
    Add new global (GLOBAL.DATA_ORIGIN) to hold the value for use by the new database APIs.  
8.  SJQ 12/29/2003
    Modify the PREFERENCES package to remove all horizontal and vertical variables.  Also removed
    redundant procedure declaration.
9.  SJQ 01/21/2004
    Modify the PREFERENCES package to add a new routine which will be used to populate globals
    containing various user preference settings which will affect the user interface.
10. SJQ 02/12/2004
    Add logic to test the current version of the application and if the correct one is not
    found, give user an error message, send message to TK and exit.
11. SJQ 02/27/2004
    Add logic to the PREFERENCES package to call new routines in the library to obtain user
    preferences for UI color settings.
12. SJQ 04/07/2004
    Add new global (GLOBAL.CM_SOURCE_CODE) for support of the common matching enhancements.
13. SJQ 04/13/2004
    Migrate the 6.2 release changes to this version.
14. SJQ 07/02/2004
    Change the company logo on the bottom of the screen.
15. SJQ 07/08/2004
    Added a new parameter, BAN_ARGS, for passing of context values from other systems.
16. SJQ 07/13/2004
    Added new routine, POPULATE_CONTEXT_GLOBALS, to parse the values of the recently added
    parameter (BAN_ARGS) and populate the appropriate globals.  This new routine is called
    by the WHEN-NEW-FORM-INSTANCE trigger just before exiting the form.
17. TGK 08/30/2004
    Removed g$_nls calls within the POST-LOGON trigger. May not be connect to database when
    this trigger is invoked and cannot make calls to database routines.
18. TGK 09/09/2004
    Implementation class com.sct.banner.forms.ui.BannerUIManager was removed from form.block.item
    GUAGMNU.KEY_BLOCK.NEXT_SELECTION and was added to GUAINIT.DISPLAY.DESKTOP.  This was done to
    faciliate proper loading when being called from Luminis. 
19. SJQ 09/22/2004
    Rewrite the query logic in the BAN_PREFERENCES routine to change the cursor to accept a
    parameter.  This allowed the other cursor to be removed and should allow the cursor logic
    be utilized once parsed by other processes.
20. SJQ 09/23/2004
    Establish a local form-level ON-ERROR to pass through valid errors.  Specifically done
    to override the referenced ON-ERROR.  The referenced on error was requiring a connection
    to the database.  If an invalid userid, password or database was input to the logon dialog
    a connection does not exist resulting in ORA-03114 error.
21. SJQ 09/28/2004
    Modify the LEAVE_INIT trigger to invoke the GUQSETI form in query mode.
22. TGK 10/25/2004
    Add new global (GLOBAL.JOB_FILENAME) for support of the channel data going to GJIREVO.
23. SJQ 10/27/2004
    Add new global (GLOBAL.KEEP_ALIVE) so that if the form is passed the parameter that the
    global will be populated and is used by the G$_MENU_BAR routine to determine whether or not
    select menu entries should be enabled.  Example is if being launched by a channel.  Update
    the logic used by the channels to support JOBS and QUICKFLOW types.  Add additional logic to
    handle an object of type DLL.
24. TGK 12/01/2004
    Add new global (GLOBAL.WF_SUBMIT_ENA_HOLD_FORMID) for support of enabling wfsubmit and wfrelease
    buttons and pulldown menu items, when returning from a form call (g$_secured_form_call_pl) to the
    calling "workflow activity form".

AUDIT TRAIL: 7.1
1.  SJQ 01/05/2005
    Add a new command line parameter START_TRACE so that an Ncle trace can be started from the
    very beginning of a session via the command line.  If set to 'YES', tracing is turned on for
    the entire session.  Modified the logic in the PRE-BLOCK, POST-BLOCK and WHEN-WINDOW-ACTIVATED
    triggers to comment out the referenced code and replace with a NULL command.  This 
    functionality is inherited via the form level property class and is not needed in this form.
    
AUDIT TRAIL: 7.2
1.  SJQ 04/15/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this is a recommendation from Ncle and causes 
    problems in some environments.
2.  SJQ 08/01/2005
    Update the ON-LOGON trigger to implement the I18N standards support.
3.  SJQ 09/06/2005
    Changed all places where the logic was doing an ADD_PARAMETER and then a SET_PARAMETER.  These
    could be done in one command, ADD_PARAMETER.  The ADD_PARAMETER was attempting to define the
    parameters size but was not actually doing this.  It was assigning the size as the value.  The
    SET_PARAMETER was then resetting it to the actual value.  The ADD_PARAMETER should be doing
    this.  Updated the ADD_PARAMETER commands and removed the SET_PARAMETER commands.
4.  SJQ 09/12/2005
    Create new package, CAPTURE_TIMINGS, to provide one location for the capturing of run time
    statistics and the saving of those values to a database table.  The package contains two 
    procedures (SET_TIME - copies the value from gokdbms.utility_get_time to the global that is
    passed as a parameter; SAVE_INFO - inserts the value of the parameter into the guraddl table).
    A new command line parameter, TIMING, has been added which will cause timing statistics to 
    be captured at various places in the form and saved to the GURADDL table for use in evaluating
    the current form performance.  This was implemented to determine the amount of time it takes
    to execute different parts of the form.  The form sets the starting time after the user has
    connected to the database in the PRE-FORM trigger and then sets the values several more times
    in the DO_FORM_CALL, prior to building the personal menu, prior to building the product menu,
    and just prior to invoking the menu form.
5.  SJQ 09/13/2005
    Increase the size of the WF_ACTIONQUEUE_IOR parameter to 2000 characters.  It was 255 and
    was not enough for some situations where work flow was invoking a form.
6.  SJQ 09/29/2005
    Update the WF_ARGS and BAN_ARGS parameters to make them have a maximum length of 2000.  They
    were defined to have a length of 4000 which is invalid.
7.  SJQ 10/03/2005
    Update the ON-LOGON trigger to remove one of the calls to the work flow library since that
    procedure was obsoleted.

AUDIT TRAIL: 7.3
1.  SJQ 11/01/2005
    Remove code from various triggers which was commented out.  Add in missing G$_NLS calls in
    the LAUNCH_FORM_LOGIC procedure.  Add logic to erase the globals created to capturing timing
    statistics prior to leaving form.
2.  SJQ 11/16/2005
    Replace globals used for capturing times to be local items in the form.  Rewrite the startup
    logic in the LEAVE_INIT trigger to correctly handle LAUNCH_FORM parameters which are not
    form objects.  If an object name passed was not a form and the KEEP_ALIVE setting was YES,
    it was not correctly launching the object.  Added logic to handle the case where GUAINIT 
    was the value passed as the LAUNCH_FORM and KEEP_ALIVE was set to YES.
3.  TGK 12/09/2005
    Per I18N date modifications, move the initilization logic form main begin-end of 
    goqrpls.G$_FORMS_NLS to proper location in guainit.when-new-form-instance.  Replaced 
    DD-MON-YYYY with G$_DATE.GET_NLS_DATE_FORMAT in gubinst select in WHEN-NEW-FORM-INSTANCE.    
4.  SJQ 01/12/2006
    Implement required changes to support VPD for all forms in Banner.  Added new form parameter
    PARAMETER.VPDI_CODE.  Modified WHEN-NEW-FORM-INSTANCE trigger to use new PARAMETER.VPDI_CODE
    if passed via the URL command.  Modified LEAVE_INIT trigger to skip invoking the GUQSETI 
    form if PARAMETER.VPDI_CODE is passed from Workflow or Channels.
5.  SJQ 01/25/2006
    Move the existing VPDI logic from the WHEN-NEW-FORM-INSTANCE trigger to the PRE-FORM trigger.
    Add additional logic to the PRE-FORM trigger to establish the process context once the user
    has connected but before security is called in case the security tables have had VPD
    applied.  Add logic to verify the VPD parameter is valid for the user and if so, set the
    user's home context value.
6.  TGK (MH) 02/03/2006
    Add initialization of :GLOBAL.DEFAULT_INSTITUTION_CODE to the PRE-FORM trigger.
7.  SJQ 03/08/2006
    Update the form and window titles to be consistent with description in the GUBOBJS table.
8.  SJQ 03/14/2006
    Add a new global to hold the GUBINST_WF_ENABLED_IND and populate as part of the select of
    GUBINST in the WHEN-NEW-FORM-INSTANCE trigger.  Modify the WHEN-NEW-BLOCK-INSTANCE trigger
    to test if workflow is enabled before calling the workflow trigger.
9.  SJQ 03/31/2006
    Add logic to the PRE-FORM to test if the parameter for timing is set and only then capture
    the timestamp information.  Modify the BAN_PREFERENCES.UI_PREFS logic to check if the 
    parameter for LAUNCH_FORM is set and if so populate all of the globals with the user's 
    preferred color settings.  Otherwise, pre-create empty globals and wait for the menu form
    to populate.
10. Lakshmi Radhakrishnan 4/18/2006
    Add global fsyr_code to the FOQINIT package.  There are a few forms in Finance that use this global
    but this global is being defined only in POQINIT and NOQINIT which means that if HR or Position Control
    is not installed this global is not being defined when a user logs into Banner. 
    
AUDIT TRAIL: 7.4
1.  Michael Hitrik 09/06/2006
    Added the logic for PRE-FORM Trigger to handle the condition when MIF code value is missing from the Paremeter 
    passed from the Workfloe call.
2.  Michael Hitrik 10/01/2006
    Added the logic for PRE-FORM Trigger to handle the condition when Workflow passes a VPD code to a Banner session
    that is not MIF enabled .    
AUDIT TRAIL END
</multilinecomment>
BEGIN
	NULL;
END;

	*/
	//ID:43
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit POPULATE_CONTEXT_GLOBALS
	
	PROCEDURE POPULATE_CONTEXT_GLOBALS IS
  lv_global_name  VARCHAR2(30);
  lv_global_value VARCHAR2(200);
  lv_parm_value   VARCHAR2(2000) := LTRIM(RTRIM(:PARAMETER.BAN_ARGS,'::'),'::');
BEGIN
	lv_global_name  := genutil.strtok(lv_parm_value,'::');
  LOOP
  	lv_global_value := genutil.strtok('','::');
    COPY(lv_global_value,('GLOBAL.' || lv_global_name));
--
  	lv_global_name  := genutil.strtok('','::');
  	EXIT WHEN lv_global_name IS NULL;
  END LOOP;
END;
	*/
	//ID:44
		public void populateContextGlobals()
		{
			NString lvGlobalName= NString.getNull();
			NString lvGlobalValue= NString.getNull();
			NString lvParmValue = ltrim(rtrim(this.getFormModel().getParam("BAN_ARGS", NString.class), "::"), "::");
			lvGlobalName = Genutil.Fstrtok(lvParmValue, toStr("::"));
			while (true) {
				lvGlobalValue = Genutil.Fstrtok(toStr(""), toStr("::"));
				copy(lvGlobalValue,((toStr("GLOBAL.").append(lvGlobalName))));
				// 
				lvGlobalName = Genutil.Fstrtok(toStr(""), toStr("::"));
				if ( lvGlobalName.isNull() ) 
					break;
			}
		}

	
	/* Original PL/SQL code for Prog Unit LAUNCH_FORM_LOGIC
	
	PROCEDURE LAUNCH_FORM_LOGIC (p_invoke_object VARCHAR2) IS
  lv_form_type     VARCHAR2(1);
  lv_leading_edge  VARCHAR2(1)  := SUBSTR(p_invoke_object,1,1);
  lv_nav_value     VARCHAR2(30) := p_invoke_object;
  pl_name          VARCHAR2(30) := 'PREFERENCES'; 
  pl_id            PARAMLIST    := GET_PARAMETER_LIST(pl_name);
  wrk_objt         VARCHAR2(30);
BEGIN
  COPY(lv_nav_value,'GLOBAL.NEW_FORM');
--
  SELECT GUBOBJS_OBJT_CODE
    INTO wrk_objt
    FROM GUBOBJS
   WHERE GUBOBJS_NAME = lv_nav_value;
--
  IF wrk_objt IS NULL THEN
  	MESSAGE(G$_NLS.GET('GUAINIT-0007','FORM','*ERROR* Invalid object name entered.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF lv_leading_edge <> '*' THEN
    IF (lv_leading_edge NOT BETWEEN 'A' AND 'Z') THEN
      MESSAGE(G$_NLS.GET('GUAINIT-0008','FORM','*ERROR* Objects must begin with a letter.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
--
  IF wrk_objt NOT IN ('MENU','MESSAGE') THEN
    IF NVL(LENGTH(lv_nav_value), 0) = 7 THEN
      lv_form_type := SUBSTR(lv_nav_value,3,1);
    ELSE
      lv_form_type := SUBSTR(lv_nav_value,4,1);
    END IF;
--
    IF lv_form_type = 'Q' AND wrk_objt = 'FORM' THEN
      MESSAGE(G$_NLS.Get('GUAINIT-0009','FORM','*ERROR* Invalid form name entered.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
--
  COPY(NAME_IN('SYSTEM.CURRENT_FORM'),'GLOBAL.CALLING_FORM');
--
-- Determine the type of object we are about to call.
--
  CASE wrk_objt
    WHEN 'JOBS' THEN 
      :GLOBAL.KEY_JOB_NAME := lv_nav_value;
      lv_nav_value := 'GJAPCTL';
--
    WHEN 'QUICKFLOW' THEN
      G$_LAST_TEN.SET_LAST_TEN;
      G$_QUICKFLOW(lv_nav_value);
      RETURN;
--
    WHEN 'DLL' THEN
      RETURN;
--
    WHEN 'MESSAGE' THEN
      RETURN;
--
    WHEN 'MENU' THEN
      MESSAGE(G$_NLS.Get('GUAINIT-0010','FORM','*ERROR* Menu objects cannot be called from here.'));
      RETURN;
--
    ELSE NULL;
  END CASE;
--
-- Form call logic.
--
  CAPTURE_TIMINGS.SET_TIME('TIME4');
  CAPTURE_TIMINGS.SAVE_INFO(
     'User connected: ' || :DATE_TIME || ' Start: ' || TO_CHAR(:TIME1)
       || '  Time from start of GUAINIT to before building product menu: ' || TO_CHAR(:TIME2 - :TIME1)
 	     || '  Time to build product menu: ' || TO_CHAR(:TIME3 - :TIME2)
       || '  Time to build personal menu: ' || TO_CHAR(:TIME4 - :TIME3)
       || '  Last time: ' || TO_CHAR(:TIME4)
       || '  Total GUAINIT Time: ' || TO_CHAR(:TIME4 - :TIME1));
--
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL_PL(:GLOBAL.CURRENT_USER,lv_nav_value,pl_id,'');
--
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    MESSAGE(G$_NLS.Get('GUAINIT-0011','FORM','*ERROR* Invalid object name.'));
END LAUNCH_FORM_LOGIC;
	*/
	//ID:45
		public void launchFormLogic(NString pInvokeObject)
		{
			int rowCount = 0;
			NString lvFormType= NString.getNull();
			NString lvLeadingEdge = substring(pInvokeObject, toInt(1), toInt(1));
			NString lvNavValue = pInvokeObject;
			NString plName = toStr("PREFERENCES");
			Hashtable plId = getParameterList(plName);
			NString wrkObjt= NString.getNull();
			try
			{
				copy(lvNavValue,"GLOBAL.NEW_FORM");
				// 
				String sql1 = "SELECT GUBOBJS_OBJT_CODE " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :P_LV_NAV_VALUE ";
				DataCommand command1 = new DataCommand(sql1);
				command1.addParameter("P_LV_NAV_VALUE", lvNavValue);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					wrkObjt = results1.getStr(0);
				}
				results1.close();
				if ( wrkObjt.isNull() )
				{
					errorMessage(GNls.Fget(toStr("GUAINIT-0007"), toStr("FORM"), toStr("*ERROR* Invalid object name entered.")));
					throw new ApplicationException();
				}
				if ( lvLeadingEdge.notEquals("*") )
				{
					if ((!between(lvLeadingEdge, "A", "Z")))
					{
						errorMessage(GNls.Fget(toStr("GUAINIT-0008"), toStr("FORM"), toStr("*ERROR* Objects must begin with a letter.")));
						throw new ApplicationException();
					}
				}
				if ( !in(wrkObjt, "MENU", "MESSAGE").getValue() )
				{
					if ( isNull(length(lvNavValue), 0).equals(7) )
					{
						lvFormType = substring(lvNavValue, toInt(3), toInt(1));
					}
					else {
						lvFormType = substring(lvNavValue, toInt(4), toInt(1));
					}
					if ( lvFormType.equals("Q") && wrkObjt.equals("FORM") )
					{
						errorMessage(GNls.Fget(toStr("GUAINIT-0009"), toStr("FORM"), toStr("*ERROR* Invalid form name entered.")));
						throw new ApplicationException();
					}
				}
				copy(getCurrentTaskName(),"GLOBAL.CALLING_FORM");
				if (wrkObjt.equals("JOBS"))
				{
					setGlobal("KEY_JOB_NAME", lvNavValue);
					lvNavValue = toStr("GJAPCTL");
				}
				else if (wrkObjt.equals("QUICKFLOW"))
				{
					getTask().getGoqrpls().getGLastTen().setLastTen();
					getTask().getGoqrpls().gQuickflow(lvNavValue);
					return ;
				}
				else if (wrkObjt.equals("DLL"))
				{
					return ;
				}
				else if (wrkObjt.equals("MESSAGE"))
				{
					return ;
				}
				else if (wrkObjt.equals("MENU"))
				{
					errorMessage(GNls.Fget(toStr("GUAINIT-0010"), toStr("FORM"), toStr("*ERROR* Menu objects cannot be called from here.")));
					return ;
				}
				else {
				}
				getTask().getCaptureTimings().setTime(toStr("TIME4"));
				getTask().getCaptureTimings().saveInfo(toStr("User connected: ").append(getFormModel().getDisplay().getDateTime()).append(" Start: ").append(toChar(getFormModel().getDisplay().getTime1())).append("  Time from start of GUAINIT to before building product menu: ").append(toChar(getFormModel().getDisplay().getTime2().subtract(getFormModel().getDisplay().getTime1()))).append("  Time to build product menu: ").append(toChar(getFormModel().getDisplay().getTime3().subtract(getFormModel().getDisplay().getTime2()))).append("  Time to build personal menu: ").append(toChar(getFormModel().getDisplay().getTime4().subtract(getFormModel().getDisplay().getTime3()))).append("  Last time: ").append(toChar(getFormModel().getDisplay().getTime4())).append("  Total GUAINIT Time: ").append(toChar(getFormModel().getDisplay().getTime4().subtract(getFormModel().getDisplay().getTime1()))));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCallPl(getGlobal("CURRENT_USER"), lvNavValue, plId, toStr(""));
			}
			catch(NoDataFoundException e)
			{
				errorMessage(GNls.Fget(toStr("GUAINIT-0011"), toStr("FORM"), toStr("*ERROR* Invalid object name.")));
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0
1. TGKinderman  10/17/2007
   Add :GLOBAL.WF_SUBMIT_EXIT_IND to WHEN-NEW-FORM-INSTANCE initializing to N.  This global is later referenced in
   GOQWFLW.G$_WF_CONTROL_FORM.WF_SUBMIT and GOQRPLS.G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM to present a Warning Alert
   when exiting a form and you are in a form that is part of a Workflow activity.
2. TGKinderman  10/17/2007
   Add :GLOBAL.SSN_SEARCH_ENABLED_IND to WHEN-NEW-FORM-INSTANCE, valued from GUBINST_SSN_SEARCH_ENABLED_IND.
   Add :GLOBAL.MORE_THAN_ONE_SSN to WHEN-NEW-FORM-INSTANCE, initialize to N.
3. TGKinderman  10/22/2007
   Add PARAMETER.IAMTICKET CHAR size 60. If this value is NOT NULL then SSO is performed within the ON-LOGON trigger.
4. TGKinderman  10/24/2007
   Add :GLOBAL.GUBINST_SSN_MAX_LENGTH to WHEN-NEW-FORM-INSTANCE, valued from GUBINST_SSN_MAX_LENGTH.
5. LvH 10/28/2007
   Updated the POST-LOGON trigger to verify login rules and capture last login time and person name
   associated with the Ncle Id.
6. George Shalovka  08 January 2008
	 Tracking: 1-32WUWY.
   Modify form-level trigger WHEN-NEW-FORM-INSTANCE to add 
   	three Global varaibles, GLOBAL.VALUE_3, GLOBAL.VALUE_4 and 
   	GLOBAL.VALUE_5.  GLOBAL.VALUE_3 will be used to support LOV/RG 
   	for ALL_TAB_COLUMNS to return values Data Length to compensate 
   	for column level Data Length Semantics.  
   	The other two Global variables were added for future use.
7. LVH 22-Feb-2008
   Defect 1-3DPL8A 
   Modified :DISPLAY.STARTUP_MENU from 10 to 30 characters to enable default menus longer than
   10 characters.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:48
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment> 
AUDIT TRAIL: 8.2
1. TGKinderman  04/03/2009
   Add creation of GLOBAL.FORMS_USERNAME_CASESENSI to WHEN-NEW-FORM-INSTANCE.  Check for environment
   variable FORMS_USERNAME_CASESENSITIVE.  If the environment variable exists and is not null then
   place '1' into GLOBAL.FORMS_USERNAME_CASESENSI else place '0'.  This global is used with forms
   GSASECR, GUAPSWD and GUAUIPW to aid password case inspection. Case sensitive passwords are optional
   with Ncle Database 11g. 

AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:49
		public void auditTrail82()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GUAINIT
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Feb 06 08:29:13 2014
-- MSGSIGN : #8991e9895b59d4f3
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:50
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3
	
	PROCEDURE AUDIT_TRAIL_8_3 IS
<multilinecomment> 
AUDIT TRAIL: 8.3
   Removed audit trail for defect 1-8QT1PM.           
           
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:51
		public void auditTrail83()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_2
	
	PROCEDURE AUDIT_TRAIL_8_3_0_2 IS
<multilinecomment> 
AUDIT TRAIL: 8.3.0.2
   PSM 24-FEB-2010
   Defect 1-4PU0C5
   Modified: Modified tigger POST-LOGON in order to remove hard coded last logon time and date.
             Modified WHEN-NEW-FORM-INSTNANCE inorder to foramt the last logon time and date value in
             long date(DL) according to NLS setting and this formatted value is assigned to Global 
             variable GLOBAL.LAST_LOGON_TIME.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:54
		public void auditTrail8302()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_5
	
	PROCEDURE AUDIT_TRAIL_8_3_0_5 IS
<multilinecomment> 
AUDIT TRAIL: 8.3.0.5
   LVH 07-MAY-2010
   Defect 1-4YE8KO
   Modified PKG_TIMESTAMP_FORMAT to set GLOBAL.LAST_LOGON_TIME properly
   during a RESTART.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:55
		public void auditTrail8305()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT IS
<multilinecomment>
  Copyright 1998-2013 Ellucian Company L.P. and its affiliates.
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:56
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6
	
	PROCEDURE AUDIT_TRAIL_8_6 IS
<multilinecomment> 
AUDIT TRAIL: 8.6
1. RPE 1-PZ851    
   LVH 11/02/2012
   Modified POST-FORM and LEAVE_INIT triggers to process Terms of Usage function.
2. RPE 1-1AKBU3N
   TGKinderman 01/21/2013
   Rebranding modifications. Remove smaller image (image72) on DESKTOP_CANVAS. Enlarge LOGO_IMAGE such
   that it takes up larger portion of splash display.
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:57
		public void auditTrail86()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_0_3
	
	PROCEDURE AUDIT_TRAIL_8_6_0_3 IS
<multilinecomment> 
AUDIT TRAIL: 8.6.0.3
1. Defect 1-1D1U7SL
   LVH 03/28/2013
   Moved the creation of GLOBAL.TOFU_OK to the PRE_FORM and WHEN-NEW-FORM-INSTANCE triggers
     -- Set the default value for Terms of Usage intially in case MEP exits prematurally  
     DEFAULT_VALUE('?', 'GLOBAL.TOFU_OK');  
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:58
		public void auditTrail8603()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_4
	
	PROCEDURE AUDIT_TRAIL_8_6_4 IS
<multilinecomment>
AUDIT TRAIL: 8.6.4
1. CR-000101888 Seamless Navigation
   TGKinderman 07/29/2013
   Michael Hitrik
   a. Add parameter BAN_MODE of data type CHAR
   b. Initialize GLOBAL.BANNER_XE and GLOBAL.BANNER_XE_MODE in PRE-FORM trigger.
   c. Add pl/sql unit POPULATE_CONTEXT_GLOBALS_XE
   d. Modify WHEN-NEW-FORM-INSTANCE trigger to set GLOBAL.BANNER_XE_MODE and call
      procedure POPULATE_CONTEXT_GLOBALS_XE.
   e. Modify in support of GUQSETI form being called (first time in as a mulit inst user):
      Add IF at top of WHEN-NEW-FORM-INSTANCE to only startMagellan if GLOBAL.SET_INST is 'N'.
      Add parameters BAN_MODE and BAN_ARGS before calling GUQSETI form in trigger LEAVE_INIT. 
      
2. CR-000101888 Seamless Navigation
   Establish GUAGMNU in the call stack.
   TGKinderman 12/19/2013
   a. Modify LEAVE_INIT trigger to call GUAGMNU launch logic is XE_MODE (follows similar flow to that of PARAMETR.KEEP_ALIVE)
   b. Modify LEAVE_INIT trigger to initialize LAST10 in the menu.

AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	//ID:59
		public void auditTrail864()
		{
		}

	
	/* Original PL/SQL code for Prog Unit POPULATE_CONTEXT_GLOBALS_XE
	
	PROCEDURE POPULATE_CONTEXT_GLOBALS_XE IS
  lv_global_name  VARCHAR2(30);
  lv_global_name_c  VARCHAR2(30);
  lv_global_value VARCHAR2(200);
  lv_parm_value   VARCHAR2(2000) := LTRIM(RTRIM(:PARAMETER.BAN_ARGS,'::'),'::');
BEGIN
	:GLOBAL.BANNER_XE_MODE := 'Y';
	--message(lv_parm_value);
	lv_global_name := genutil.strtok(lv_parm_value,'::');
	lv_global_name_c := gokgtrn.f_get_banner8_global_name( lv_global_name );
	--message('Global-Name: ' || lv_global_name_c);
  LOOP
  	lv_global_value := genutil.strtok('','::');
  	--message('Global-Value: ' || lv_global_value);
    COPY(lv_global_value,('GLOBAL.' || lv_global_name_c));  
--
    lv_global_name := genutil.strtok('','::');
  	lv_global_name_c  := gokgtrn.f_get_banner8_global_name( lv_global_name );
  	--message('Global-Name: ' || lv_global_name_c );
  	EXIT WHEN lv_global_name IS NULL;
  END LOOP;
END;
	*/
	//ID:60
		public void populateContextGlobalsXe()
		{
			NString lvGlobalName= NString.getNull();
			NString lvGlobalNameC= NString.getNull();
			NString lvGlobalValue= NString.getNull();
			NString lvParmValue = ltrim(rtrim(this.getFormModel().getParam("BAN_ARGS", NString.class), "::"), "::");
			setGlobal("BANNER_XE_MODE", toStr("Y"));
			lvGlobalName = Genutil.Fstrtok(lvParmValue, toStr("::"));
			lvGlobalNameC = Gokgtrn.fGetBanner8GlobalName(lvGlobalName);
			while (true) {
				lvGlobalValue = Genutil.Fstrtok(toStr(""), toStr("::"));
				copy(lvGlobalValue,((toStr("GLOBAL.").append(lvGlobalNameC))));
				lvGlobalName = Genutil.Fstrtok(toStr(""), toStr("::"));
				lvGlobalNameC = Gokgtrn.fGetBanner8GlobalName(lvGlobalName);
				if ( lvGlobalName.isNull() ) 
					break;
			}
		}

		
}
