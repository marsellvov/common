package net.hedtech.general.common.libraries.Foqrpls;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
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
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;


public class PacCopyRec extends AbstractSupportCodeObject {
	

	public PacCopyRec(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public FoqrplsServices getContainer() {
		return (FoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) PAC_COPY_REC
	/*
	PACKAGE PAC_COPY_REC IS
  PROCEDURE COPY_REQ_REC
	(NEW_REQ_NUM VARCHAR2,OLD_REQ_NUM VARCHAR2,
	TRANS_DATE DATE,DEFER_IND VARCHAR2,NSF_ON_OFF_IND VARCHAR2) ;
  PROCEDURE COPY_POHD_REC
	    (NEW_POHD_CODE VARCHAR2,OLD_POHD_CODE VARCHAR2,TRANS_DATE DATE,
		DEFER_IND VARCHAR2,NSF_ON_OFF_IND VARCHAR2);
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) PAC_COPY_REC
		/*
		PACKAGE BODY PAC_COPY_REC IS
  PROCEDURE COPY_REQ_REC
   (NEW_REQ_NUM VARCHAR2,OLD_REQ_NUM VARCHAR2,
	TRANS_DATE DATE,DEFER_IND VARCHAR2,NSF_ON_OFF_IND VARCHAR2) IS   
	
	reqh_cursor  foksels.ref_cursortype;
	reqd_cursor  foksels.ref_cursortype;
	reqh_rec     fpbreqh%rowtype;
	reqd_rec     fprreqd%rowtype;
	lv_tax_amt   number;
	 
BEGIN
 BEGIN
 INSERT INTO FPBREQH (
FPBREQH_CODE,FPBREQH_ACTIVITY_DATE,FPBREQH_USER_ID,FPBREQH_REQH_DATE,
FPBREQH_TRANS_DATE,FPBREQH_NAME,FPBREQH_PHONE_AREA,                       
FPBREQH_PHONE_NUM,FPBREQH_PHONE_EXT,FPBREQH_VEND_PIDM,
FPBREQH_ATYP_CODE, FPBREQH_ATYP_SEQ_NUM,FPBREQH_COAS_CODE,                        
FPBREQH_ORGN_CODE,FPBREQH_REQD_DATE,FPBREQH_COMPLETE_IND,                     
FPBREQH_PRINT_IND,FPBREQH_ENCUMB_IND,FPBREQH_SUSP_IND,      
FPBREQH_CANCEL_IND,FPBREQH_CANCEL_DATE,FPBREQH_POST_DATE,                     
FPBREQH_APPR_IND,FPBREQH_TEXT_IND,FPBREQH_EDIT_DEFER_IND,              
FPBREQH_RECOMM_VEND_NAME,FPBREQH_CURR_CODE,FPBREQH_NSF_ON_OFF_IND,
FPBREQH_SINGLE_ACCTG_IND,FPBREQH_CLOSED_IND,FPBREQH_SHIP_CODE,                        
FPBREQH_RQST_TYPE_IND,FPBREQH_INVENTORY_REQ_IND,fpbreqh_delivery_comment,fpbreqh_email_addr,fpbreqh_fax_area,
fpbreqh_fax_number,fpbreqh_fax_ext,fpbreqh_attention_to,fpbreqh_vendor_contact,fpbreqh_disc_code,fpbreqh_vend_email_addr,
fpbreqh_copied_from, FPBREQH_TGRP_CODE,
fpbreqh_ctry_code_phone,fpbreqh_ctry_code_fax)  
  SELECT  NEW_REQ_NUM,SYSDATE,USER,SYSDATE,TRANS_DATE,FPBREQH_NAME,   
   FPBREQH_PHONE_AREA,FPBREQH_PHONE_NUM,FPBREQH_PHONE_EXT,
   FPBREQH_VEND_PIDM,FPBREQH_ATYP_CODE,FPBREQH_ATYP_SEQ_NUM,
  FPBREQH_COAS_CODE,FPBREQH_ORGN_CODE,NULL,'N',NULL,NULL,'Y',NULL,NULL,NULL,
   'N',FPBREQH_TEXT_IND,DEFER_IND,FPBREQH_RECOMM_VEND_NAME,
   FPBREQH_CURR_CODE,NSF_ON_OFF_IND,FPBREQH_SINGLE_ACCTG_IND,NULL,
   FPBREQH_SHIP_CODE,FPBREQH_RQST_TYPE_IND, FPBREQH_INVENTORY_REQ_IND,fpbreqh_delivery_comment,fpbreqh_email_addr,fpbreqh_fax_area,
fpbreqh_fax_number,fpbreqh_fax_ext,fpbreqh_attention_to,fpbreqh_vendor_contact,fpbreqh_disc_code,fpbreqh_vend_email_addr,
old_req_num, FPBREQH_TGRP_CODE,
fpbreqh_ctry_code_phone,fpbreqh_ctry_code_fax
  FROM FPBREQH
        WHERE FPBREQH_CODE= OLD_REQ_NUM;

  EXCEPTION
    WHEN OTHERS   THEN
        ROLLBACK;
        return;
  END;

 BEGIN
 INSERT INTO FPRREQD (
FPRREQD_REQH_CODE, FPRREQD_ITEM, FPRREQD_ACTIVITY_DATE,        
 FPRREQD_USER_ID, FPRREQD_COMM_CODE, FPRREQD_COMM_DESC,
 FPRREQD_COAS_CODE, FPRREQD_ORGN_CODE, FPRREQD_BUYR_CODE,
 FPRREQD_QTY, FPRREQD_UOMS_CODE, FPRREQD_UNIT_PRICE, FPRREQD_AGRE_CODE,
 FPRREQD_REQD_DATE, FPRREQD_SHIP_CODE, FPRREQD_VEND_PIDM,   
 FPRREQD_VEND_REF_NUM, FPRREQD_PROJ_CODE, FPRREQD_POHD_CODE,
 FPRREQD_POHD_ITEM, FPRREQD_BIDS_CODE, FPRREQD_COMPLETE_IND,
 FPRREQD_SUSP_IND, FPRREQD_CANCEL_IND, FPRREQD_CANCEL_DATE ,
 FPRREQD_CLOSED_IND, FPRREQD_POST_DATE, FPRREQD_TEXT_USAGE,
 FPRREQD_ATYP_CODE, FPRREQD_ATYP_SEQ_NUM, FPRREQD_RECOMM_VEND_NAME,
 FPRREQD_CURR_CODE, FPRREQD_CONVERTED_UNIT_PRICE,fprreqd_disc_amt,fprreqd_tax_amt,fprreqd_addl_chrg_amt,fprreqd_convert_disc_amt,
 fprreqd_convert_tax_amt,fprreqd_convert_addl_chrg_amt,fprreqd_tgrp_code,fprreqd_amt,fprreqd_desc_chge_ind)
  SELECT NEW_REQ_NUM,FPRREQD_ITEM,SYSDATE,USER,FPRREQD_COMM_CODE,FPRREQD_COMM_DESC,FPRREQD_COAS_CODE,FPRREQD_ORGN_CODE,NULL,
FPRREQD_QTY,FPRREQD_UOMS_CODE,FPRREQD_UNIT_PRICE,FPRREQD_AGRE_CODE,
FPRREQD_REQD_DATE,FPRREQD_SHIP_CODE,FPRREQD_VEND_PIDM, FPRREQD_VEND_REF_NUM,
FPRREQD_PROJ_CODE,NULL,NULL,NULL,'N','Y',NULL,NULL,NULL,NULL,
FPRREQD_TEXT_USAGE,FPRREQD_ATYP_CODE,FPRREQD_ATYP_SEQ_NUM,
FPRREQD_RECOMM_VEND_NAME,FPRREQD_CURR_CODE,
FPRREQD_CONVERTED_UNIT_PRICE,fprreqd_disc_amt,fprreqd_tax_amt,fprreqd_addl_chrg_amt,fprreqd_convert_disc_amt,
 fprreqd_convert_tax_amt,fprreqd_convert_addl_chrg_amt,fprreqd_tgrp_code,fprreqd_amt,fprreqd_desc_chge_ind
  FROM FPRREQD
  WHERE FPRREQD_REQH_CODE=OLD_REQ_NUM;  

 EXCEPTION
	       WHEN OTHERS  THEN
		  ROLLBACK;
                  return;
     END;

--
BEGIN 
 INSERT INTO FPRREQA(
FPRREQA_REQH_CODE,FPRREQA_ITEM,FPRREQA_SEQ_NUM,FPRREQA_ACTIVITY_DATE,
FPRREQA_USER_ID,FPRREQA_PCT,FPRREQA_AMT,FPRREQA_FSYR_CODE,
FPRREQA_PERIOD,FPRREQA_RUCL_CODE,FPRREQA_COAS_CODE,FPRREQA_ACCI_CODE,
FPRREQA_FUND_CODE,FPRREQA_ORGN_CODE,FPRREQA_ACCT_CODE,
FPRREQA_PROG_CODE,FPRREQA_ACTV_CODE,FPRREQA_LOCN_CODE,FPRREQA_SUSP_IND,FPRREQA_NSF_SUSP_IND,FPRREQA_CANCEL_IND,FPRREQA_CANCEL_DATE,                   
FPRREQA_PROJ_CODE,FPRREQA_APPR_IND,FPRREQA_NSF_OVERRIDE_IND,
FPRREQA_ABAL_IND,FPRREQA_CONVERTED_AMT,FPRREQA_CLOSED_IND,fprreqa_disc_amt,fprreqa_tax_amt,fprreqa_addl_chrg_amt,
fprreqa_convert_disc_amt,fprreqa_convert_tax_amt,fprreqa_convert_addl_chrg_amt,fprreqa_disc_amt_pct,fprreqa_addl_amt_pct,fprreqa_tax_amt_pct,
fprreqa_disc_rucl_code,fprreqa_tax_rucl_code,fprreqa_addl_rucl_code)
  SELECT NEW_REQ_NUM,FPRREQA_ITEM,FPRREQA_SEQ_NUM,SYSDATE,USER,FPRREQA_PCT, FPRREQA_AMT,NULL,NULL,FPRREQA_RUCL_CODE,FPRREQA_COAS_CODE,
FPRREQA_ACCI_CODE,FPRREQA_FUND_CODE,FPRREQA_ORGN_CODE,FPRREQA_ACCT_CODE,FPRREQA_PROG_CODE,FPRREQA_ACTV_CODE,FPRREQA_LOCN_CODE,'Y','Y',NULL,
NULL,FPRREQA_PROJ_CODE,'N','N',NULL,FPRREQA_CONVERTED_AMT,NULL ,fprreqa_disc_amt,fprreqa_tax_amt,fprreqa_addl_chrg_amt,
fprreqa_convert_disc_amt,fprreqa_convert_tax_amt,fprreqa_convert_addl_chrg_amt,fprreqa_disc_amt_pct,fprreqa_addl_amt_pct,fprreqa_tax_amt_pct,
fprreqa_disc_rucl_code,fprreqa_tax_rucl_code,fprreqa_addl_rucl_code               
  FROM FPRREQA
  WHERE FPRREQA_REQH_CODE=OLD_REQ_NUM;

 EXCEPTION
	       WHEN OTHERS  THEN
		  ROLLBACK;
                  return;
 END;


--
BEGIN
 INSERT INTO FOBTEXT(
 FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM,   
 FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE , 
 FOBTEXT_USER_ID,FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT)
  SELECT FOBTEXT_DTYP_SEQ_NUM,NEW_REQ_NUM,FOBTEXT_CHG_SEQ_NUM,FOBTEXT_ITEM,
   FOBTEXT_SEQ_NUM,FOBTEXT_PIDM,FOBTEXT_ACTIVITY_DATE,USER,                
   FOBTEXT_CLA_NUM,FOBTEXT_PRT_IND,FOBTEXT_TEXT                          
  FROM FOBTEXT
  WHERE FOBTEXT_CODE=OLD_REQ_NUM
   AND FOBTEXT_DTYP_SEQ_NUM = 1; 

    EXCEPTION
      WHEN OTHERS THEN
    ROLLBACK;
    RETURN;
 END;

--
BEGIN
	
	 reqh_cursor := fpkreqn.f_fpbreqh_ref(new_req_num);
	 fetch reqh_cursor into reqh_rec;
	 close reqh_cursor;
	 
	 reqd_cursor := fpkreqn.f_fprreqd_ref(new_req_num);
	 loop
	 	 fetch reqd_cursor into reqd_rec;
	 	 exit when reqd_cursor%notfound;
	 	 fb_req_tax.p_calc_and_create(p_reqh_code => new_req_num,
	 	                              p_item      => reqd_rec.fprreqd_item,
	 	                              p_tgrp_code => reqd_rec.fprreqd_tgrp_code,
	 	                              p_eff_date  => reqh_rec.fpbreqh_trans_date,
	 	                              p_vendor_pidm => reqh_rec.fpbreqh_vend_pidm,
	 	                              p_quantity  => reqd_Rec.fprreqd_qty,
	 	                              p_unit_Price => reqd_rec.fprreqd_unit_price,
	 	                              p_disc_amt  => reqd_rec.fprreqd_disc_amt,
	 	                              p_addl_amt => reqd_rec.fprreqd_addl_chrg_amt,
	 	                              p_user_id   => gb_common.f_sct_user,
	 	                              p_data_origin => 'Banner',
	 	                              p_tax_amt_out => lv_tax_amt );
	 	                              
	 	                              
	 end loop;

	 EXCEPTION
	 	
	 	WHEN OTHERS then

	 	   rollback;
	 	   return;
	
END;

COMMIT;

end;


PROCEDURE COPY_POHD_REC
	    (NEW_POHD_CODE VARCHAR2,OLD_POHD_CODE VARCHAR2,TRANS_DATE DATE,
		DEFER_IND VARCHAR2,NSF_ON_OFF_IND VARCHAR2) IS
		
	pohd_cursor  foksels.ref_cursortype;
	podt_cursor  foksels.ref_cursortype;
	pohd_rec     fpbpohd%rowtype;
  podt_rec     fprpodt%rowtype;
  lv_tax_amt   number;
  lv_origin    fpbpohd.fpbpohd_origin_code%type; --1-4JDQYP
  
BEGIN
	select fpbpohd_origin_code into lv_origin --1-4JDQYP
	from   fpbpohd
	where  fpbpohd_code = OLD_POHD_CODE
	and    fpbpohd_change_seq_num is null;   --1-58M375
 BEGIN
  INSERT INTO FPBPOHD(
FPBPOHD_CODE,FPBPOHD_CHANGE_SEQ_NUM,FPBPOHD_ACTIVITY_DATE,
FPBPOHD_USER_ID,FPBPOHD_PO_DATE,FPBPOHD_TRANS_DATE,
FPBPOHD_BLANKET_CODE,FPBPOHD_BLANKET_IND,FPBPOHD_BLANKET_TERM_DATE,
FPBPOHD_CLOSED_IND,FPBPOHD_COMPLETE_IND,FPBPOHD_PRINT_IND,
FPBPOHD_PO_PRINTED_DATE,FPBPOHD_VEND_PIDM,FPBPOHD_ATYP_CODE,
FPBPOHD_ATYP_SEQ_NUM,FPBPOHD_BUYR_CODE,FPBPOHD_REQD_DATE,
FPBPOHD_COAS_CODE,FPBPOHD_ORGN_CODE,FPBPOHD_SHIP_CODE,
FPBPOHD_TRAT_CODE,FPBPOHD_FOB_CODE,FPBPOHD_DISC_CODE,FPBPOHD_TEXT_IND,
FPBPOHD_CLAUSE_IND,FPBPOHD_CARRIER_PIDM,FPBPOHD_TRSK_CODE,
FPBPOHD_PMNT_CODE,FPBPOHD_PRT_ACK,FPBPOHD_ACK_DATE,FPBPOHD_APPR_IND,
FPBPOHD_RUSH_IND,FPBPOHD_REXP_DATE,FPBPOHD_ADDL_CHRG_AMT,
FPBPOHD_RUSH_AMT,FPBPOHD_SUSP_IND,FPBPOHD_SUSP_IND_ADDL,
FPBPOHD_CANCEL_IND,FPBPOHD_CANCEL_DATE,FPBPOHD_POST_DATE,
FPBPOHD_REQ_BID_IND,FPBPOHD_EDIT_DEFER_IND,FPBPOHD_PCLS_CODE,
FPBPOHD_TGRP_CODE,FPBPOHD_RECOMM_VEND_NAME,FPBPOHD_CURR_CODE,
FPBPOHD_DISB_AGENT_IND,FPBPOHD_NSF_ON_OFF_IND,FPBPOHD_INVENTORY_PO_IND,
FPBPOHD_SINGLE_ACCTG_IND,FPBPOHD_DOC_CNTRL_IND,FPBPOHD_TELE_CODE,fpbpohd_crsn_code,fpbpohd_email_addr,fpbpohd_fax_area,
fpbpohd_fax_number,fpbpohd_fax_ext,fpbpohd_attention_to,fpbpohd_vendor_Contact,fpbpohd_po_type_ind,fpbpohd_delivery_comment,
fpbpohd_vend_email_addr,fpbpohd_name,fpbpohd_phone_area,fpbpohd_phone_num,fpbpohd_phone_ext,fpbpohd_copied_from,
fpbpohd_ctry_code_phone,fpbpohd_ctry_code_fax)
   SELECT NEW_POHD_CODE,FPBPOHD_CHANGE_SEQ_NUM,SYSDATE,USER,SYSDATE,TRANS_DATE,   NULL,NULL,NULL,NULL,'N',NULL,NULL,FPBPOHD_VEND_PIDM,
FPBPOHD_ATYP_CODE,FPBPOHD_ATYP_SEQ_NUM,FPBPOHD_BUYR_CODE,NULL,
FPBPOHD_COAS_CODE,FPBPOHD_ORGN_CODE,FPBPOHD_SHIP_CODE,
FPBPOHD_TRAT_CODE,FPBPOHD_FOB_CODE,FPBPOHD_DISC_CODE,
DECODE(lv_origin, 'EPROCUREMENT', '', FPBPOHD_TEXT_IND), --1-4JDQYP
FPBPOHD_CLAUSE_IND,FPBPOHD_CARRIER_PIDM,FPBPOHD_TRSK_CODE,
FPBPOHD_PMNT_CODE,FPBPOHD_PRT_ACK,FPBPOHD_ACK_DATE,'N',FPBPOHD_RUSH_IND,
FPBPOHD_REXP_DATE,FPBPOHD_ADDL_CHRG_AMT,FPBPOHD_RUSH_AMT,'Y',
FPBPOHD_SUSP_IND_ADDL,NULL,NULL,NULL,NULL,DEFER_IND,
FPBPOHD_PCLS_CODE,FPBPOHD_TGRP_CODE,FPBPOHD_RECOMM_VEND_NAME,
FPBPOHD_CURR_CODE,FPBPOHD_DISB_AGENT_IND,NSF_ON_OFF_IND,
FPBPOHD_INVENTORY_PO_IND,FPBPOHD_SINGLE_ACCTG_IND,FPBPOHD_DOC_CNTRL_IND,FPBPOHD_TELE_CODE ,fpbpohd_crsn_code,fpbpohd_email_addr,fpbpohd_fax_area,
fpbpohd_fax_number,fpbpohd_fax_ext,fpbpohd_attention_to,fpbpohd_vendor_Contact,fpbpohd_po_type_ind,fpbpohd_delivery_comment,
fpbpohd_vend_email_addr,fpbpohd_name,fpbpohd_phone_area,fpbpohd_phone_num,fpbpohd_phone_ext,old_pohd_code,
fpbpohd_ctry_code_phone,fpbpohd_ctry_code_fax
   FROM FPBPOHD
   WHERE FPBPOHD_CODE= OLD_POHD_CODE
   AND FPBPOHD_CHANGE_SEQ_NUM IS NULL;
 	--:system.message_level := '5' ;
	COMMIT;
	--:system.message_level := '0';	
 EXCEPTION
	       WHEN OTHERS   THEN
		  ROLLBACK;
                   RETURN;
 END;

 BEGIN
  INSERT INTO FPRPODT(
 FPRPODT_POHD_CODE,FPRPODT_CHANGE_SEQ_NUM, FPRPODT_ACTIVITY_DATE,
FPRPODT_USER_ID, FPRPODT_ITEM,FPRPODT_COMM_CODE, FPRPODT_COMM_DESC,
 FPRPODT_UOMS_CODE,FPRPODT_UNIT_PRICE, FPRPODT_LIQ_AMT, FPRPODT_QTY, FPRPODT_DISC_AMT,FPRPODT_TAX_AMT,FPRPODT_VEND_REF_NUM,
FPRPODT_AGRE_CODE,FPRPODT_SUSP_IND,FPRPODT_CLOSED_IND,
FPRPODT_CANCEL_IND,FPRPODT_CANCEL_DATE,FPRPODT_TTAG_NUM,
 FPRPODT_TEXT_USAGE,FPRPODT_ADDL_CHRG_AMT,FPRPODT_CONVERT_UNIT_PRICE,
 FPRPODT_CONVERT_DISC_AMT,FPRPODT_CONVERT_TAX_AMT, FPRPODT_CONVERT_ADDL_CHRG_AMT,FPRPODT_TGRP_CODE,FPRPODT_EXT_AMT,
 FPRPODT_BO_REMAIN_BAL,fprpodt_desc_chge_ind,fprpodt_ship_code,fprpodt_reqd_date)
  SELECT NEW_POHD_CODE,FPRPODT_CHANGE_SEQ_NUM,SYSDATE,USER,FPRPODT_ITEM,   FPRPODT_COMM_CODE,FPRPODT_COMM_DESC,FPRPODT_UOMS_CODE,
FPRPODT_UNIT_PRICE,FPRPODT_LIQ_AMT,FPRPODT_QTY,FPRPODT_DISC_AMT,
FPRPODT_TAX_AMT,FPRPODT_VEND_REF_NUM,FPRPODT_AGRE_CODE,'Y',NULL,NULL,
NULL,FPRPODT_TTAG_NUM,FPRPODT_TEXT_USAGE,FPRPODT_ADDL_CHRG_AMT,
FPRPODT_CONVERT_UNIT_PRICE,FPRPODT_CONVERT_DISC_AMT,
FPRPODT_CONVERT_TAX_AMT,FPRPODT_CONVERT_ADDL_CHRG_AMT,
FPRPODT_TGRP_CODE, FPRPODT_EXT_AMT,FPRPODT_BO_REMAIN_BAL,fprpodt_desc_chge_ind,fprpodt_ship_code,fprpodt_reqd_date
  FROM FPRPODT
  WHERE FPRPODT_POHD_CODE=OLD_POHD_CODE
   AND FPRPODT_CHANGE_SEQ_NUM IS NULL;  
	--:system.message_level := '5' ;
	COMMIT;
	--:system.message_level := '0';
 EXCEPTION
	       WHEN OTHERS  THEN
		  ROLLBACK;
                  RETURN;
 END;

 BEGIN 
  INSERT INTO FPRPODA(
FPRPODA_POHD_CODE, FPRPODA_CHANGE_SEQ_NUM , FPRPODA_ITEM,                   
 FPRPODA_SEQ_NUM,FPRPODA_ACTIVITY_DATE,FPRPODA_USER_ID, FPRPODA_AMT,                    
 FPRPODA_DISC_AMT,FPRPODA_TAX_AMT,FPRPODA_ADDL_CHRG_AMT,          
 FPRPODA_FSYR_CODE,FPRPODA_PERIOD,FPRPODA_RUCL_CODE_PO,       
 FPRPODA_DISC_RUCL_CODE,FPRPODA_TAX_RUCL_CODE,FPRPODA_ADDL_RUCL_CODE,         
 FPRPODA_RUCL_CODE_LIQ,FPRPODA_COAS_CODE,FPRPODA_ACCI_CODE,              
 FPRPODA_FUND_CODE,FPRPODA_ORGN_CODE,FPRPODA_ACCT_CODE,   
 FPRPODA_PROG_CODE,FPRPODA_ACTV_CODE,FPRPODA_LOCN_CODE,   FPRPODA_PROJ_CODE,FPRPODA_SUSP_IND,FPRPODA_NSF_SUSP_IND,
FPRPODA_POST_DATE,FPRPODA_APPR_IND,FPRPODA_NSF_OVERRIDE_IND,
 FPRPODA_CLOSED_IND, FPRPODA_CONVERT_AMT, FPRPODA_CONVERT_DISC_AMT,       
 FPRPODA_CONVERT_TAX_AMT, FPRPODA_CONVERT_ADDL_CHRG_AMT,
 FPRPODA_APPR_AMT_PCT, FPRPODA_DISC_AMT_PCT, FPRPODA_ADDL_AMT_PCT,           
 FPRPODA_TAX_AMT_PCT)
   SELECT NEW_POHD_CODE,FPRPODA_CHANGE_SEQ_NUM,FPRPODA_ITEM,FPRPODA_SEQ_NUM,
SYSDATE,USER,FPRPODA_AMT,FPRPODA_DISC_AMT,FPRPODA_TAX_AMT,
FPRPODA_ADDL_CHRG_AMT,NULL,NULL,FPRPODA_RUCL_CODE_PO,
FPRPODA_DISC_RUCL_CODE,FPRPODA_TAX_RUCL_CODE,FPRPODA_ADDL_RUCL_CODE,
FPRPODA_RUCL_CODE_LIQ,FPRPODA_COAS_CODE,FPRPODA_ACCI_CODE,    FPRPODA_FUND_CODE,FPRPODA_ORGN_CODE,FPRPODA_ACCT_CODE,
FPRPODA_PROG_CODE,FPRPODA_ACTV_CODE,FPRPODA_LOCN_CODE,
FPRPODA_PROJ_CODE,'Y','Y',NULL,'N','N',NULL,FPRPODA_CONVERT_AMT,
FPRPODA_CONVERT_DISC_AMT,FPRPODA_CONVERT_TAX_AMT,
FPRPODA_CONVERT_ADDL_CHRG_AMT,FPRPODA_APPR_AMT_PCT,
FPRPODA_DISC_AMT_PCT,FPRPODA_ADDL_AMT_PCT,FPRPODA_TAX_AMT_PCT             
   FROM FPRPODA
   WHERE FPRPODA_POHD_CODE=OLD_POHD_CODE
    AND FPRPODA_CHANGE_SEQ_NUM IS NULL;
	--:system.message_level := '5' ;
	COMMIT;
	--:system.message_level := '0';
 EXCEPTION
	       WHEN OTHERS  THEN
		  ROLLBACK;
                  RETURN;
 END;

 BEGIN
  INSERT INTO FOBTEXT(
 FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM,   
 FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE , 
 FOBTEXT_USER_ID,FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT)
   SELECT FOBTEXT_DTYP_SEQ_NUM,NEW_POHD_CODE,FOBTEXT_CHG_SEQ_NUM,FOBTEXT_ITEM,
    FOBTEXT_SEQ_NUM,FOBTEXT_PIDM,FOBTEXT_ACTIVITY_DATE,USER,                
    FOBTEXT_CLA_NUM,FOBTEXT_PRT_IND,FOBTEXT_TEXT                          
   FROM FOBTEXT
   WHERE FOBTEXT_CODE=OLD_POHD_CODE
   AND FOBTEXT_CHG_SEQ_NUM IS NULL
   AND FOBTEXT_DTYP_SEQ_NUM = 2; 
 EXCEPTION
      WHEN OTHERS THEN
    ROLLBACK;
    RETURN;
 END;

--
BEGIN
	
	 pohd_cursor := fpkpurr.f_fpbpohd_ref(new_pohd_code,null);
	 fetch pohd_cursor into pohd_rec;
	 close pohd_cursor;
	 
	 podt_cursor := fpkpurr.f_fprpodt_ref(new_pohd_code,null);
	 loop
	 	 fetch podt_cursor into podt_rec;
	 	 exit when podt_cursor%notfound;
	 	 fb_po_tax.p_calc_and_create( p_pohd_code => new_pohd_code,
	 	                              p_item      => podt_rec.fprpodt_item,
	 	                              p_change_seq_num => pohd_rec.fpbpohd_change_seq_num,
	 	                              p_tgrp_code => podt_rec.fprpodt_tgrp_code,
	 	                              p_eff_date  => pohd_rec.fpbpohd_trans_date,
	 	                              p_vendor_pidm => pohd_rec.fpbpohd_vend_pidm,
	 	                              p_quantity  => podt_Rec.fprpodt_qty,
	 	                              p_unit_Price => podt_rec.fprpodt_unit_price,
	 	                              p_disc_amt  => podt_rec.fprpodt_disc_amt,
	 	                              p_addl_amt => podt_rec.fprpodt_addl_chrg_amt,
	 	                              p_user_id   => gb_common.f_sct_user,
	 	                              p_data_origin => 'Banner',
	 	                              p_tax_amt_out => lv_tax_amt );
	 end loop;
	 EXCEPTION
	 	
	 	WHEN OTHERS then

	 	   rollback;
	 	   return;
	
END;

COMMIT;


   EXCEPTION
      WHEN OTHERS THEN

    ROLLBACK;


END;
END;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param newReqNum
		* @param oldReqNum
		* @param transDate
		* @param deferInd
		* @param nsfOnOffInd
		*/
		public void copyReqRec(NString newReqNum, NString oldReqNum, NDate transDate, NString deferInd, NString nsfOnOffInd)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.FokselsRefCursortype reqhCursor= null;
//			UnknownTypes.FokselsRefCursortype reqdCursor= null;
//			FpbreqhRow reqhRec= null;
//			FprreqdRow reqdRec= null;
//			NNumber lvTaxAmt= NNumber.getNull();
//			try
//			{
//				String sql1 = "INSERT INTO FPBREQH " +
//	"(FPBREQH_CODE, FPBREQH_ACTIVITY_DATE, FPBREQH_USER_ID, FPBREQH_REQH_DATE, FPBREQH_TRANS_DATE, FPBREQH_NAME, FPBREQH_PHONE_AREA, FPBREQH_PHONE_NUM, FPBREQH_PHONE_EXT, FPBREQH_VEND_PIDM, FPBREQH_ATYP_CODE, FPBREQH_ATYP_SEQ_NUM, FPBREQH_COAS_CODE, FPBREQH_ORGN_CODE, FPBREQH_REQD_DATE, FPBREQH_COMPLETE_IND, FPBREQH_PRINT_IND, FPBREQH_ENCUMB_IND, FPBREQH_SUSP_IND, FPBREQH_CANCEL_IND, FPBREQH_CANCEL_DATE, FPBREQH_POST_DATE, FPBREQH_APPR_IND, FPBREQH_TEXT_IND, FPBREQH_EDIT_DEFER_IND, FPBREQH_RECOMM_VEND_NAME, FPBREQH_CURR_CODE, FPBREQH_NSF_ON_OFF_IND, FPBREQH_SINGLE_ACCTG_IND, FPBREQH_CLOSED_IND, FPBREQH_SHIP_CODE, FPBREQH_RQST_TYPE_IND, FPBREQH_INVENTORY_REQ_IND, fpbreqh_delivery_comment, fpbreqh_email_addr, fpbreqh_fax_area, fpbreqh_fax_number, fpbreqh_fax_ext, fpbreqh_attention_to, fpbreqh_vendor_contact, fpbreqh_disc_code, fpbreqh_vend_email_addr, fpbreqh_copied_from, FPBREQH_TGRP_CODE, fpbreqh_ctry_code_phone, fpbreqh_ctry_code_fax)" +
//	"SELECT :P_NEW_REQ_NUM, SYSDATE, USER, SYSDATE, :P_TRANS_DATE, FPBREQH_NAME, FPBREQH_PHONE_AREA, FPBREQH_PHONE_NUM, FPBREQH_PHONE_EXT, FPBREQH_VEND_PIDM, FPBREQH_ATYP_CODE, FPBREQH_ATYP_SEQ_NUM, FPBREQH_COAS_CODE, FPBREQH_ORGN_CODE, NULL, 'N', NULL, NULL, 'Y', NULL, NULL, NULL, 'N', FPBREQH_TEXT_IND, :P_DEFER_IND, FPBREQH_RECOMM_VEND_NAME, FPBREQH_CURR_CODE, :P_NSF_ON_OFF_IND, FPBREQH_SINGLE_ACCTG_IND, NULL, FPBREQH_SHIP_CODE, FPBREQH_RQST_TYPE_IND, FPBREQH_INVENTORY_REQ_IND, fpbreqh_delivery_comment, fpbreqh_email_addr, fpbreqh_fax_area, fpbreqh_fax_number, fpbreqh_fax_ext, fpbreqh_attention_to, fpbreqh_vendor_contact, fpbreqh_disc_code, fpbreqh_vend_email_addr, :P_OLD_REQ_NUM, FPBREQH_TGRP_CODE, fpbreqh_ctry_code_phone, fpbreqh_ctry_code_fax " +
//	" FROM FPBREQH " +
//	" WHERE FPBREQH_CODE = :P_OLD_REQ_NUM ";
//				DataCommand command1 = new DataCommand(sql1);
//				//Setting query parameters
//				command1.addParameter("P_NEW_REQ_NUM", newReqNum);
//				command1.addParameter("P_TRANS_DATE", transDate);
//				command1.addParameter("P_DEFER_IND", deferInd);
//				command1.addParameter("P_NSF_ON_OFF_IND", nsfOnOffInd);
//				command1.addParameter("P_OLD_REQ_NUM", oldReqNum);
//				rowCount = command1.execute();
//			}
//			catch(Exception  e)
//			{
//				rollback();
//				return ;
//			}
//			try
//			{
//				String sql2 = "INSERT INTO FPRREQD " +
//	"(FPRREQD_REQH_CODE, FPRREQD_ITEM, FPRREQD_ACTIVITY_DATE, FPRREQD_USER_ID, FPRREQD_COMM_CODE, FPRREQD_COMM_DESC, FPRREQD_COAS_CODE, FPRREQD_ORGN_CODE, FPRREQD_BUYR_CODE, FPRREQD_QTY, FPRREQD_UOMS_CODE, FPRREQD_UNIT_PRICE, FPRREQD_AGRE_CODE, FPRREQD_REQD_DATE, FPRREQD_SHIP_CODE, FPRREQD_VEND_PIDM, FPRREQD_VEND_REF_NUM, FPRREQD_PROJ_CODE, FPRREQD_POHD_CODE, FPRREQD_POHD_ITEM, FPRREQD_BIDS_CODE, FPRREQD_COMPLETE_IND, FPRREQD_SUSP_IND, FPRREQD_CANCEL_IND, FPRREQD_CANCEL_DATE, FPRREQD_CLOSED_IND, FPRREQD_POST_DATE, FPRREQD_TEXT_USAGE, FPRREQD_ATYP_CODE, FPRREQD_ATYP_SEQ_NUM, FPRREQD_RECOMM_VEND_NAME, FPRREQD_CURR_CODE, FPRREQD_CONVERTED_UNIT_PRICE, fprreqd_disc_amt, fprreqd_tax_amt, fprreqd_addl_chrg_amt, fprreqd_convert_disc_amt, fprreqd_convert_tax_amt, fprreqd_convert_addl_chrg_amt, fprreqd_tgrp_code, fprreqd_amt, fprreqd_desc_chge_ind)" +
//	"SELECT :P_NEW_REQ_NUM, FPRREQD_ITEM, SYSDATE, USER, FPRREQD_COMM_CODE, FPRREQD_COMM_DESC, FPRREQD_COAS_CODE, FPRREQD_ORGN_CODE, NULL, FPRREQD_QTY, FPRREQD_UOMS_CODE, FPRREQD_UNIT_PRICE, FPRREQD_AGRE_CODE, FPRREQD_REQD_DATE, FPRREQD_SHIP_CODE, FPRREQD_VEND_PIDM, FPRREQD_VEND_REF_NUM, FPRREQD_PROJ_CODE, NULL, NULL, NULL, 'N', 'Y', NULL, NULL, NULL, NULL, FPRREQD_TEXT_USAGE, FPRREQD_ATYP_CODE, FPRREQD_ATYP_SEQ_NUM, FPRREQD_RECOMM_VEND_NAME, FPRREQD_CURR_CODE, FPRREQD_CONVERTED_UNIT_PRICE, fprreqd_disc_amt, fprreqd_tax_amt, fprreqd_addl_chrg_amt, fprreqd_convert_disc_amt, fprreqd_convert_tax_amt, fprreqd_convert_addl_chrg_amt, fprreqd_tgrp_code, fprreqd_amt, fprreqd_desc_chge_ind " +
//	" FROM FPRREQD " +
//	" WHERE FPRREQD_REQH_CODE = :P_OLD_REQ_NUM ";
//				DataCommand command2 = new DataCommand(sql2);
//				//Setting query parameters
//				command2.addParameter("P_NEW_REQ_NUM", newReqNum);
//				command2.addParameter("P_OLD_REQ_NUM", oldReqNum);
//				rowCount = command2.execute();
//			}
//			catch(Exception  e)
//			{
//				rollback();
//				return ;
//			}
//			try
//			{
//				String sql3 = "INSERT INTO FPRREQA " +
//	"(FPRREQA_REQH_CODE, FPRREQA_ITEM, FPRREQA_SEQ_NUM, FPRREQA_ACTIVITY_DATE, FPRREQA_USER_ID, FPRREQA_PCT, FPRREQA_AMT, FPRREQA_FSYR_CODE, FPRREQA_PERIOD, FPRREQA_RUCL_CODE, FPRREQA_COAS_CODE, FPRREQA_ACCI_CODE, FPRREQA_FUND_CODE, FPRREQA_ORGN_CODE, FPRREQA_ACCT_CODE, FPRREQA_PROG_CODE, FPRREQA_ACTV_CODE, FPRREQA_LOCN_CODE, FPRREQA_SUSP_IND, FPRREQA_NSF_SUSP_IND, FPRREQA_CANCEL_IND, FPRREQA_CANCEL_DATE, FPRREQA_PROJ_CODE, FPRREQA_APPR_IND, FPRREQA_NSF_OVERRIDE_IND, FPRREQA_ABAL_IND, FPRREQA_CONVERTED_AMT, FPRREQA_CLOSED_IND, fprreqa_disc_amt, fprreqa_tax_amt, fprreqa_addl_chrg_amt, fprreqa_convert_disc_amt, fprreqa_convert_tax_amt, fprreqa_convert_addl_chrg_amt, fprreqa_disc_amt_pct, fprreqa_addl_amt_pct, fprreqa_tax_amt_pct, fprreqa_disc_rucl_code, fprreqa_tax_rucl_code, fprreqa_addl_rucl_code)" +
//	"SELECT :P_NEW_REQ_NUM, FPRREQA_ITEM, FPRREQA_SEQ_NUM, SYSDATE, USER, FPRREQA_PCT, FPRREQA_AMT, NULL, NULL, FPRREQA_RUCL_CODE, FPRREQA_COAS_CODE, FPRREQA_ACCI_CODE, FPRREQA_FUND_CODE, FPRREQA_ORGN_CODE, FPRREQA_ACCT_CODE, FPRREQA_PROG_CODE, FPRREQA_ACTV_CODE, FPRREQA_LOCN_CODE, 'Y', 'Y', NULL, NULL, FPRREQA_PROJ_CODE, 'N', 'N', NULL, FPRREQA_CONVERTED_AMT, NULL, fprreqa_disc_amt, fprreqa_tax_amt, fprreqa_addl_chrg_amt, fprreqa_convert_disc_amt, fprreqa_convert_tax_amt, fprreqa_convert_addl_chrg_amt, fprreqa_disc_amt_pct, fprreqa_addl_amt_pct, fprreqa_tax_amt_pct, fprreqa_disc_rucl_code, fprreqa_tax_rucl_code, fprreqa_addl_rucl_code " +
//	" FROM FPRREQA " +
//	" WHERE FPRREQA_REQH_CODE = :P_OLD_REQ_NUM ";
//				DataCommand command3 = new DataCommand(sql3);
//				//Setting query parameters
//				command3.addParameter("P_NEW_REQ_NUM", newReqNum);
//				command3.addParameter("P_OLD_REQ_NUM", oldReqNum);
//				rowCount = command3.execute();
//			}
//			catch(Exception  e)
//			{
//				rollback();
//				return ;
//			}
//			try
//			{
//				String sql4 = "INSERT INTO FOBTEXT " +
//	"(FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE, FOBTEXT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT)" +
//	"SELECT FOBTEXT_DTYP_SEQ_NUM, :P_NEW_REQ_NUM, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE, USER, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT " +
//	" FROM FOBTEXT " +
//	" WHERE FOBTEXT_CODE = :P_OLD_REQ_NUM AND FOBTEXT_DTYP_SEQ_NUM = 1 ";
//				DataCommand command4 = new DataCommand(sql4);
//				//Setting query parameters
//				command4.addParameter("P_NEW_REQ_NUM", newReqNum);
//				command4.addParameter("P_OLD_REQ_NUM", oldReqNum);
//				rowCount = command4.execute();
//			}
//			catch(Exception  e)
//			{
//				rollback();
//				return ;
//			}
//			try
//			{
//				reqhCursor = Fpkreqn.fFpbreqhRef(newReqNum);
//				reqhRec = reqhCursor.fetchRow();
//				reqhCursor.close();
//				reqdCursor = Fpkreqn.fFprreqdRef(newReqNum);
//				while (true) {
//					reqdRec = reqdCursor.fetchRow();
//					if ( reqdCursor.notFound() ) 
//						break;
//					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
//					Ref<NNumber> p_tax_amt_out_ref = new Ref<NNumber>(lvTaxAmt);
//					FbReqTax.pCalcAndCreate(/*pReqhCode=>*/newReqNum, /*pItem=>*/reqdRec.FprreqdItem, /*pTgrpCode=>*/reqdRec.FprreqdTgrpCode, /*pEffDate=>*/reqhRec.FpbreqhTransDate, /*pVendorPidm=>*/reqhRec.FpbreqhVendPidm, /*pQuantity=>*/reqdRec.FprreqdQty, /*pUnitPrice=>*/reqdRec.FprreqdUnitPrice, /*pDiscAmt=>*/reqdRec.FprreqdDiscAmt, /*pAddlAmt=>*/reqdRec.FprreqdAddlChrgAmt, /*pUserId=>*/GbCommon.fSctUser(), /*pDataOrigin=>*/"Banner", p_tax_amt_out_ref);
//					lvTaxAmt = p_tax_amt_out_ref.val;
//				}
//			}
//			catch(Exception  e)
//			{
//				rollback();
//				return ;
//			}
//			commitTask();
//
			this.getLogger().trace(this, "F2J : copyReqRec procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param newPohdCode
		* @param oldPohdCode
		* @param transDate
		* @param deferInd
		* @param nsfOnOffInd
		*/
		public void copyPohdRec(NString newPohdCode, NString oldPohdCode, NDate transDate, NString deferInd, NString nsfOnOffInd)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.FokselsRefCursortype pohdCursor= null;
//			UnknownTypes.FokselsRefCursortype podtCursor= null;
//			FpbpohdRow pohdRec= null;
//			FprpodtRow podtRec= null;
//			NNumber lvTaxAmt= NNumber.getNull();
//			NString lvOrigin= NString.getNull();
//			try
//			{
//				String sql5 = "SELECT fpbpohd_origin_code " +
//	" FROM fpbpohd " +
//	" WHERE fpbpohd_code = :P_OLD_POHD_CODE AND fpbpohd_change_seq_num IS NULL ";
//				DataCommand command5 = new DataCommand(sql5);
//				//Setting query parameters
//				command5.addParameter("P_OLD_POHD_CODE", oldPohdCode);
//				ResultSet results5 = command5.executeQuery();
//				rowCount = command5.getRowCount();
//				if ( results5.hasData() ) {
//					lvOrigin = results5.getStr(0);
//				}
//				results5.close();
//				try
//				{
//					String sql6 = "INSERT INTO FPBPOHD " +
//	"(FPBPOHD_CODE, FPBPOHD_CHANGE_SEQ_NUM, FPBPOHD_ACTIVITY_DATE, FPBPOHD_USER_ID, FPBPOHD_PO_DATE, FPBPOHD_TRANS_DATE, FPBPOHD_BLANKET_CODE, FPBPOHD_BLANKET_IND, FPBPOHD_BLANKET_TERM_DATE, FPBPOHD_CLOSED_IND, FPBPOHD_COMPLETE_IND, FPBPOHD_PRINT_IND, FPBPOHD_PO_PRINTED_DATE, FPBPOHD_VEND_PIDM, FPBPOHD_ATYP_CODE, FPBPOHD_ATYP_SEQ_NUM, FPBPOHD_BUYR_CODE, FPBPOHD_REQD_DATE, FPBPOHD_COAS_CODE, FPBPOHD_ORGN_CODE, FPBPOHD_SHIP_CODE, FPBPOHD_TRAT_CODE, FPBPOHD_FOB_CODE, FPBPOHD_DISC_CODE, FPBPOHD_TEXT_IND, FPBPOHD_CLAUSE_IND, FPBPOHD_CARRIER_PIDM, FPBPOHD_TRSK_CODE, FPBPOHD_PMNT_CODE, FPBPOHD_PRT_ACK, FPBPOHD_ACK_DATE, FPBPOHD_APPR_IND, FPBPOHD_RUSH_IND, FPBPOHD_REXP_DATE, FPBPOHD_ADDL_CHRG_AMT, FPBPOHD_RUSH_AMT, FPBPOHD_SUSP_IND, FPBPOHD_SUSP_IND_ADDL, FPBPOHD_CANCEL_IND, FPBPOHD_CANCEL_DATE, FPBPOHD_POST_DATE, FPBPOHD_REQ_BID_IND, FPBPOHD_EDIT_DEFER_IND, FPBPOHD_PCLS_CODE, FPBPOHD_TGRP_CODE, FPBPOHD_RECOMM_VEND_NAME, FPBPOHD_CURR_CODE, FPBPOHD_DISB_AGENT_IND, FPBPOHD_NSF_ON_OFF_IND, FPBPOHD_INVENTORY_PO_IND, FPBPOHD_SINGLE_ACCTG_IND, FPBPOHD_DOC_CNTRL_IND, FPBPOHD_TELE_CODE, fpbpohd_crsn_code, fpbpohd_email_addr, fpbpohd_fax_area, fpbpohd_fax_number, fpbpohd_fax_ext, fpbpohd_attention_to, fpbpohd_vendor_Contact, fpbpohd_po_type_ind, fpbpohd_delivery_comment, fpbpohd_vend_email_addr, fpbpohd_name, fpbpohd_phone_area, fpbpohd_phone_num, fpbpohd_phone_ext, fpbpohd_copied_from, fpbpohd_ctry_code_phone, fpbpohd_ctry_code_fax)" +
//	"SELECT :P_NEW_POHD_CODE, FPBPOHD_CHANGE_SEQ_NUM, SYSDATE, USER, SYSDATE, :P_TRANS_DATE, NULL, NULL, NULL, NULL, 'N', NULL, NULL, FPBPOHD_VEND_PIDM, FPBPOHD_ATYP_CODE, FPBPOHD_ATYP_SEQ_NUM, FPBPOHD_BUYR_CODE, NULL, FPBPOHD_COAS_CODE, FPBPOHD_ORGN_CODE, FPBPOHD_SHIP_CODE, FPBPOHD_TRAT_CODE, FPBPOHD_FOB_CODE, FPBPOHD_DISC_CODE, DECODE(:P_LV_ORIGIN, 'EPROCUREMENT', '', FPBPOHD_TEXT_IND), FPBPOHD_CLAUSE_IND, FPBPOHD_CARRIER_PIDM, FPBPOHD_TRSK_CODE, FPBPOHD_PMNT_CODE, FPBPOHD_PRT_ACK, FPBPOHD_ACK_DATE, 'N', FPBPOHD_RUSH_IND, FPBPOHD_REXP_DATE, FPBPOHD_ADDL_CHRG_AMT, FPBPOHD_RUSH_AMT, 'Y', FPBPOHD_SUSP_IND_ADDL, NULL, NULL, NULL, NULL, :P_DEFER_IND, FPBPOHD_PCLS_CODE, FPBPOHD_TGRP_CODE, FPBPOHD_RECOMM_VEND_NAME, FPBPOHD_CURR_CODE, FPBPOHD_DISB_AGENT_IND, :P_NSF_ON_OFF_IND, FPBPOHD_INVENTORY_PO_IND, FPBPOHD_SINGLE_ACCTG_IND, FPBPOHD_DOC_CNTRL_IND, FPBPOHD_TELE_CODE, fpbpohd_crsn_code, fpbpohd_email_addr, fpbpohd_fax_area, fpbpohd_fax_number, fpbpohd_fax_ext, fpbpohd_attention_to, fpbpohd_vendor_Contact, fpbpohd_po_type_ind, fpbpohd_delivery_comment, fpbpohd_vend_email_addr, fpbpohd_name, fpbpohd_phone_area, fpbpohd_phone_num, fpbpohd_phone_ext, :P_OLD_POHD_CODE, fpbpohd_ctry_code_phone, fpbpohd_ctry_code_fax " +
//	" FROM FPBPOHD " +
//	" WHERE FPBPOHD_CODE = :P_OLD_POHD_CODE AND FPBPOHD_CHANGE_SEQ_NUM IS NULL ";
//					DataCommand command6 = new DataCommand(sql6);
//					//Setting query parameters
//					command6.addParameter("P_NEW_POHD_CODE", newPohdCode);
//					command6.addParameter("P_TRANS_DATE", transDate);
//					command6.addParameter("P_LV_ORIGIN", lvOrigin);
//					command6.addParameter("P_DEFER_IND", deferInd);
//					command6.addParameter("P_NSF_ON_OFF_IND", nsfOnOffInd);
//					command6.addParameter("P_OLD_POHD_CODE", oldPohdCode);
//					rowCount = command6.execute();
//					// :system.message_level := '5' ;
//					commitTask();
//				}
//				catch(Exception  e)
//				{
//					rollback();
//					return ;
//				}
//				try
//				{
//					String sql7 = "INSERT INTO FPRPODT " +
//	"(FPRPODT_POHD_CODE, FPRPODT_CHANGE_SEQ_NUM, FPRPODT_ACTIVITY_DATE, FPRPODT_USER_ID, FPRPODT_ITEM, FPRPODT_COMM_CODE, FPRPODT_COMM_DESC, FPRPODT_UOMS_CODE, FPRPODT_UNIT_PRICE, FPRPODT_LIQ_AMT, FPRPODT_QTY, FPRPODT_DISC_AMT, FPRPODT_TAX_AMT, FPRPODT_VEND_REF_NUM, FPRPODT_AGRE_CODE, FPRPODT_SUSP_IND, FPRPODT_CLOSED_IND, FPRPODT_CANCEL_IND, FPRPODT_CANCEL_DATE, FPRPODT_TTAG_NUM, FPRPODT_TEXT_USAGE, FPRPODT_ADDL_CHRG_AMT, FPRPODT_CONVERT_UNIT_PRICE, FPRPODT_CONVERT_DISC_AMT, FPRPODT_CONVERT_TAX_AMT, FPRPODT_CONVERT_ADDL_CHRG_AMT, FPRPODT_TGRP_CODE, FPRPODT_EXT_AMT, FPRPODT_BO_REMAIN_BAL, fprpodt_desc_chge_ind, fprpodt_ship_code, fprpodt_reqd_date)" +
//	"SELECT :P_NEW_POHD_CODE, FPRPODT_CHANGE_SEQ_NUM, SYSDATE, USER, FPRPODT_ITEM, FPRPODT_COMM_CODE, FPRPODT_COMM_DESC, FPRPODT_UOMS_CODE, FPRPODT_UNIT_PRICE, FPRPODT_LIQ_AMT, FPRPODT_QTY, FPRPODT_DISC_AMT, FPRPODT_TAX_AMT, FPRPODT_VEND_REF_NUM, FPRPODT_AGRE_CODE, 'Y', NULL, NULL, NULL, FPRPODT_TTAG_NUM, FPRPODT_TEXT_USAGE, FPRPODT_ADDL_CHRG_AMT, FPRPODT_CONVERT_UNIT_PRICE, FPRPODT_CONVERT_DISC_AMT, FPRPODT_CONVERT_TAX_AMT, FPRPODT_CONVERT_ADDL_CHRG_AMT, FPRPODT_TGRP_CODE, FPRPODT_EXT_AMT, FPRPODT_BO_REMAIN_BAL, fprpodt_desc_chge_ind, fprpodt_ship_code, fprpodt_reqd_date " +
//	" FROM FPRPODT " +
//	" WHERE FPRPODT_POHD_CODE = :P_OLD_POHD_CODE AND FPRPODT_CHANGE_SEQ_NUM IS NULL ";
//					DataCommand command7 = new DataCommand(sql7);
//					//Setting query parameters
//					command7.addParameter("P_NEW_POHD_CODE", newPohdCode);
//					command7.addParameter("P_OLD_POHD_CODE", oldPohdCode);
//					rowCount = command7.execute();
//					// :system.message_level := '5' ;
//					commitTask();
//				}
//				catch(Exception  e)
//				{
//					rollback();
//					return ;
//				}
//				try
//				{
//					String sql8 = "INSERT INTO FPRPODA " +
//	"(FPRPODA_POHD_CODE, FPRPODA_CHANGE_SEQ_NUM, FPRPODA_ITEM, FPRPODA_SEQ_NUM, FPRPODA_ACTIVITY_DATE, FPRPODA_USER_ID, FPRPODA_AMT, FPRPODA_DISC_AMT, FPRPODA_TAX_AMT, FPRPODA_ADDL_CHRG_AMT, FPRPODA_FSYR_CODE, FPRPODA_PERIOD, FPRPODA_RUCL_CODE_PO, FPRPODA_DISC_RUCL_CODE, FPRPODA_TAX_RUCL_CODE, FPRPODA_ADDL_RUCL_CODE, FPRPODA_RUCL_CODE_LIQ, FPRPODA_COAS_CODE, FPRPODA_ACCI_CODE, FPRPODA_FUND_CODE, FPRPODA_ORGN_CODE, FPRPODA_ACCT_CODE, FPRPODA_PROG_CODE, FPRPODA_ACTV_CODE, FPRPODA_LOCN_CODE, FPRPODA_PROJ_CODE, FPRPODA_SUSP_IND, FPRPODA_NSF_SUSP_IND, FPRPODA_POST_DATE, FPRPODA_APPR_IND, FPRPODA_NSF_OVERRIDE_IND, FPRPODA_CLOSED_IND, FPRPODA_CONVERT_AMT, FPRPODA_CONVERT_DISC_AMT, FPRPODA_CONVERT_TAX_AMT, FPRPODA_CONVERT_ADDL_CHRG_AMT, FPRPODA_APPR_AMT_PCT, FPRPODA_DISC_AMT_PCT, FPRPODA_ADDL_AMT_PCT, FPRPODA_TAX_AMT_PCT)" +
//	"SELECT :P_NEW_POHD_CODE, FPRPODA_CHANGE_SEQ_NUM, FPRPODA_ITEM, FPRPODA_SEQ_NUM, SYSDATE, USER, FPRPODA_AMT, FPRPODA_DISC_AMT, FPRPODA_TAX_AMT, FPRPODA_ADDL_CHRG_AMT, NULL, NULL, FPRPODA_RUCL_CODE_PO, FPRPODA_DISC_RUCL_CODE, FPRPODA_TAX_RUCL_CODE, FPRPODA_ADDL_RUCL_CODE, FPRPODA_RUCL_CODE_LIQ, FPRPODA_COAS_CODE, FPRPODA_ACCI_CODE, FPRPODA_FUND_CODE, FPRPODA_ORGN_CODE, FPRPODA_ACCT_CODE, FPRPODA_PROG_CODE, FPRPODA_ACTV_CODE, FPRPODA_LOCN_CODE, FPRPODA_PROJ_CODE, 'Y', 'Y', NULL, 'N', 'N', NULL, FPRPODA_CONVERT_AMT, FPRPODA_CONVERT_DISC_AMT, FPRPODA_CONVERT_TAX_AMT, FPRPODA_CONVERT_ADDL_CHRG_AMT, FPRPODA_APPR_AMT_PCT, FPRPODA_DISC_AMT_PCT, FPRPODA_ADDL_AMT_PCT, FPRPODA_TAX_AMT_PCT " +
//	" FROM FPRPODA " +
//	" WHERE FPRPODA_POHD_CODE = :P_OLD_POHD_CODE AND FPRPODA_CHANGE_SEQ_NUM IS NULL ";
//					DataCommand command8 = new DataCommand(sql8);
//					//Setting query parameters
//					command8.addParameter("P_NEW_POHD_CODE", newPohdCode);
//					command8.addParameter("P_OLD_POHD_CODE", oldPohdCode);
//					rowCount = command8.execute();
//					// :system.message_level := '5' ;
//					commitTask();
//				}
//				catch(Exception  e)
//				{
//					rollback();
//					return ;
//				}
//				try
//				{
//					String sql9 = "INSERT INTO FOBTEXT " +
//	"(FOBTEXT_DTYP_SEQ_NUM, FOBTEXT_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE, FOBTEXT_USER_ID, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT)" +
//	"SELECT FOBTEXT_DTYP_SEQ_NUM, :P_NEW_POHD_CODE, FOBTEXT_CHG_SEQ_NUM, FOBTEXT_ITEM, FOBTEXT_SEQ_NUM, FOBTEXT_PIDM, FOBTEXT_ACTIVITY_DATE, USER, FOBTEXT_CLA_NUM, FOBTEXT_PRT_IND, FOBTEXT_TEXT " +
//	" FROM FOBTEXT " +
//	" WHERE FOBTEXT_CODE = :P_OLD_POHD_CODE AND FOBTEXT_CHG_SEQ_NUM IS NULL AND FOBTEXT_DTYP_SEQ_NUM = 2 ";
//					DataCommand command9 = new DataCommand(sql9);
//					//Setting query parameters
//					command9.addParameter("P_NEW_POHD_CODE", newPohdCode);
//					command9.addParameter("P_OLD_POHD_CODE", oldPohdCode);
//					rowCount = command9.execute();
//				}
//				catch(Exception  e)
//				{
//					rollback();
//					return ;
//				}
//				try
//				{
//					pohdCursor = Fpkpurr.fFpbpohdRef(newPohdCode, toNumber(null));
//					pohdRec = pohdCursor.fetchRow();
//					pohdCursor.close();
//					podtCursor = Fpkpurr.fFprpodtRef(newPohdCode, toNumber(null));
//					while (true) {
//						podtRec = podtCursor.fetchRow();
//						if ( podtCursor.notFound() ) 
//							break;
//						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
//						Ref<NNumber> p_tax_amt_out_ref = new Ref<NNumber>(lvTaxAmt);
//						FbPoTax.pCalcAndCreate(/*pPohdCode=>*/newPohdCode, /*pItem=>*/podtRec.FprpodtItem, /*pChangeSeqNum=>*/pohdRec.FpbpohdChangeSeqNum, /*pTgrpCode=>*/podtRec.FprpodtTgrpCode, /*pEffDate=>*/pohdRec.FpbpohdTransDate, /*pVendorPidm=>*/pohdRec.FpbpohdVendPidm, /*pQuantity=>*/podtRec.FprpodtQty, /*pUnitPrice=>*/podtRec.FprpodtUnitPrice, /*pDiscAmt=>*/podtRec.FprpodtDiscAmt, /*pAddlAmt=>*/podtRec.FprpodtAddlChrgAmt, /*pUserId=>*/GbCommon.fSctUser(), /*pDataOrigin=>*/"Banner", p_tax_amt_out_ref);
//						lvTaxAmt = p_tax_amt_out_ref.val;
//					}
//				}
//				catch(Exception  e)
//				{
//					rollback();
//					return ;
//				}
//				commitTask();
//			}
//			catch(Exception  e)
//			{
//				rollback();
//			}
//
			this.getLogger().trace(this, "F2J : copyPohdRec procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
