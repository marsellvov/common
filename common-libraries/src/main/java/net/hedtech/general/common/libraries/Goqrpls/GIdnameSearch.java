package net.hedtech.general.common.libraries.Goqrpls;

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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GIdnameSearch extends AbstractSupportCodeObject {
	

	public GIdnameSearch(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_IDNAME_SEARCH
	/*
	PACKAGE G$_IDNAME_SEARCH IS
--
  PROCEDURE ENTER_QUERY_STATUS;
  PROCEDURE FORM_INST_QUERY_STATUS;
--
  PROCEDURE START_ID_SEARCH;
  PROCEDURE DISABLE_NAME_ITEM;
  PROCEDURE COPY_SELECTED_ID;
  PROCEDURE WHEN_NEW_BLOCK;
  PROCEDURE WHEN_CLEAR_BUTTON_PRESSED;
--
  PROCEDURE NARROW_SEARCH_GROUP;
  PROCEDURE ID_SEARCH( ITEM_IND	    in VARCHAR2,
                       SHOW_PERSON  in VARCHAR2 := '',
                       SHOW_COMPANY in VARCHAR2 := '' );
--
  PROCEDURE DETAIL_BTN_PRESSED;
  PROCEDURE WHEN_BUTTON_PRESSED;
  PROCEDURE WHEN_NEW_ITEM;
-- -- --
  PROCEDURE ENABLE_EXT_SRCH_BLK_ON_ENTRY;
  PROCEDURE DISABLE_EXT_SRCH_BLK_ON_EXIT;
-- -- ----
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_IDNAME_SEARCH
		/*
		PACKAGE BODY G$_IDNAME_SEARCH IS
--
-- This procedure is used to perform an ID/Name search.
-- '%' and '_' can be used as wild card for the search.
-- If the search results return more than one name, the extended search window will
-- appear.
--
  lv_max_cnt        NUMBER := 999999;
  lv_max_cnt_str    gtvsdax.gtvsdax_external_code%TYPE;
  id_count          PLS_INTEGER;
  current_form      VARCHAR2(15)  := NAME_IN('SYSTEM.CURRENT_FORM');
  id_search_val     VARCHAR2(300);
  srch_list_name    VARCHAR2(100) := 'G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST';
  srch_cnt_name     VARCHAR2(100) := 'G$_EXTENDED_SEARCH_BLOCK.EXTSEARCH_COUNT';
--
  id_item           VARCHAR2(61);
  name_item         VARCHAR2(61);
  trigger_item      VARCHAR2(61);
  id_hint           VARCHAR2(255);
  ind_itm           VARCHAR2(10);
  entity_flg        VARCHAR2(1);
--
  rg_name           VARCHAR2(30) := 'IDNAME_RECGRP';
  rg_id             RECORDGROUP  := Find_Group(rg_name);
--
-- Birth date is not defined as SPBPERS_BIRTH_DATE%TYPE in order to support and allow
-- wildcard characters.
--
  lv_birth_date     VARCHAR2(20);
--
  lv_ntyp_code      spriden.spriden_ntyp_code%TYPE;
  lv_city           spraddr.spraddr_city%TYPE;
  lv_stat_code      spraddr.spraddr_stat_code%TYPE;
  lv_zip            spraddr.spraddr_zip%TYPE;
  lv_ssn            spbpers.spbpers_ssn%TYPE;
  lv_sex            spbpers.spbpers_sex%TYPE;
  search_lname      spriden.spriden_last_name%TYPE := '';
  search_fname      spriden.spriden_first_name%TYPE := '';
  search_mname      spriden.spriden_mi%TYPE := '';
--
-- For IDEN forms in WHEN-NEW-FORM-INSTANCE and KEY-ENTQRY
--
  item_name         CONSTANT VARCHAR2(60):= 'DISP_QUERY_STATUS';
  item_id           ITEM;
--
-- Private procedures and functions
--
  FUNCTION COMPRESS_NAME(name_field VARCHAR2) RETURN VARCHAR2 IS
  BEGIN
--    RETURN(TRANSLATE(UPPER(name_field),'ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 `-=\[];'',./~!@#$^&*()_+|}{":?><',
--                                       'ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890'));
    RETURN(gukcmpr.f_goqrpls_compress_name(name_field));
  END;
--
--
  FUNCTION ITEM_EXIST RETURN BOOLEAN IS
  BEGIN
    item_id := FIND_ITEM(item_name);
    IF NOT ID_NULL(item_id) THEN
      RETURN(TRUE);
    END IF;
    RETURN(FALSE);
  END; 
--
-- This procedure is used to perform a name search.  The name search string can be one
-- of the following formats:
--     last name, first name, middle name.
--     last name,
--     ,first name
--     ,,middle name
--     last name, first name
--     ,first name, middle name.
--
-- '%' and '_' can be used as wild cards.
-- If the search results return more than one name, the extended search window will
-- appears.
--
  PROCEDURE START_NAME_SEARCH IS
    lname           spriden.spriden_last_name%TYPE;
    fname           spriden.spriden_first_name%TYPE;
    mname           spriden.spriden_mi%TYPE;
    comma_pos       PLS_INTEGER := 0;
    name_str        VARCHAR2(300):= LTRIM(RTRIM(id_search_val));
  BEGIN
    IF name_str IS NOT NULL THEN
      comma_pos := INSTR(name_str,',');
      IF comma_pos = 0 THEN
        lname := SUBSTR(name_str,1,60);
      ELSE
        lname := SUBSTR(RTRIM(SUBSTR(name_str,1,comma_pos - 1)),1,60);
        name_str := LTRIM(SUBSTR(name_str, comma_pos + 1));
        IF name_str IS NOT NULL THEN
          comma_pos := INSTR(name_str,',');
          IF comma_pos > 0 THEN
            fname := SUBSTR(RTRIM(SUBSTR(name_str, 1, comma_pos - 1)),1,60);
            mname := SUBSTR(LTRIM(RTRIM(SUBSTR(name_str, comma_pos + 1))),1,60);
          ELSE
            fname := SUBSTR(RTRIM(name_str),1,60);
          END IF;
        END IF;
      END IF;
--
      search_lname := COMPRESS_NAME(lname);
      search_mname := COMPRESS_NAME(mname);
      search_fname := COMPRESS_NAME(fname);
    END IF;
  END;
--
--
  PROCEDURE DISABLE_BTN (flag_ind IN VARCHAR2 := '') IS
    item_name  VARCHAR2(60);
  BEGIN
    item_name := flag_ind || 'PERSON_DETAIL_BTN';
    IF GET_ITEM_PROPERTY(item_name,ENABLED) = 'TRUE' THEN
      SET_ITEM_PROPERTY(item_name,ENABLED,PROPERTY_FALSE);
    END IF; 
  END;
--
--
  PROCEDURE DISABLE_RBTN (rbtn_name IN VARCHAR2) IS
  BEGIN
    IF GET_RADIO_BUTTON_PROPERTY('SEARCH_GROUP', rbtn_name ,ENABLED) = 'TRUE' THEN
      SET_RADIO_BUTTON_PROPERTY('SEARCH_GROUP', rbtn_name , ENABLED, PROPERTY_FALSE);
     END IF; 
  END;
--
--
  PROCEDURE POPULATE_LIST_GROUP IS
    lv_entity_ind          spriden.spriden_entity_ind%TYPE;
--
    lv_query               VARCHAR2(2000);
    lv_query_status        VARCHAR2(1) := 'T';
    lv_num                 NUMBER;
--
    CURSOR max_count_c IS
      SELECT gtvsdax_external_code
        FROM gtvsdax
       WHERE gtvsdax_internal_code = 'SEARCH_MAX'
         AND gtvsdax_internal_code_group = 'GOQRPLS';
--
  BEGIN
    IF entity_flg <> 'B' THEN
      lv_entity_ind := entity_flg;
    END IF;
--
    DEFAULT_VALUE('N','GLOBAL.GOQRPLS_SEARCH_MAX');
    IF NAME_IN('GLOBAL.GOQRPLS_SEARCH_MAX') = 'N' THEN
    	OPEN max_count_c;
      FETCH max_count_c INTO lv_max_cnt_str;
      IF max_count_c%notfound THEN
    	  lv_max_cnt_str := '999999';
      END IF;
      CLOSE max_count_c;
-- Make sure they really entered a valid number
      BEGIN
        lv_max_cnt := to_number(lv_max_cnt_str);
      EXCEPTION
       WHEN OTHERS THEN
         lv_max_cnt := NULL;
      END;
--
      IF lv_max_cnt IS NULL THEN
-- have to make sure to force acknowledgement by displaying message twice
      	MESSAGE(G$_NLS.Get('GOQRPLS-0065','LIB',
          '*WARNING* The GTVSDAX entry for GOQRPLS / SEARCH_MAX is invalid (%01%). Limit set to 999999.',lv_max_cnt_str),acknowledge); 
      	MESSAGE(G$_NLS.Get('GOQRPLS-0066','LIB',
          '*WARNING* The GTVSDAX entry for GOQRPLS / SEARCH_MAX is invalid (%01%). Limit set to 999999.',lv_max_cnt_str),acknowledge); 
        lv_max_cnt := 999999;
      END IF;
      COPY(lv_max_cnt,'GLOBAL.GOQRPLS_SEARCH_MAX');
    ELSE
      lv_max_cnt := TO_NUMBER(NAME_IN('GLOBAL.GOQRPLS_SEARCH_MAX'));
    END IF;
-- --
    IF ind_itm = 'NAME' THEN
      START_NAME_SEARCH;
      id_search_val := '';
    END IF;
-- --
    IF NAME_IN('GLOBAL.MORE_THAN_ONE_SSN') = 'N' THEN
      SET_WINDOW_PROPERTY('G$_EXTENDED_SEARCH_WINDOW',TITLE,'ID and Name Extended Search');
      IF G$_CHK_AUTH.G$_CHECK_AUTHORIZATION_FNC('SSN_SEARCH',USER) = 'NO' THEN
        SET_ITEM_PROPERTY('SR_SPBPERS_SSN',VISIBLE,PROPERTY_OFF);  	 	      
      ELSE
        IF GET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN',VISIBLE) = 'FALSE' THEN
          SET_ITEM_PROPERTY('SR_SPBPERS_SSN',VISIBLE,PROPERTY_ON);
          SET_ITEM_PROPERTY('SR_SPBPERS_SSN',ENABLED,PROPERTY_ON);
          SET_ITEM_PROPERTY('SR_SPBPERS_SSN',NAVIGABLE,PROPERTY_ON);
        END IF;
        END IF;
--
-- This calls the id/name search routine to perform the query.  This select
-- is using the TABLE function on the returned object type so that it can be
-- used in a select statement.
--
      lv_query := 
        'SELECT r_name Name, r_id' || '||' || '''' || ',' || '''' || '||' 
          || 'TO_CHAR(r_pidm)' || '||' || '''' || ',' || '''' || '||'
          || 'r_internal_record_id ID, r_distinct_query_count Count' 
          || ' FROM TABLE (' 
          || ' gb_identification.f_idname_search ('
          || '''' || id_search_val || '''' || ','
          || '''' || search_lname || '''' || ','
          || '''' || search_fname || '''' || ','
          || '''' || search_mname || '''' || ','
          || '''' || UPPER(lv_ntyp_code) || '''' || ','
          || '''' || UPPER(lv_entity_ind) || '''' || ','
          || '''' || UPPER(lv_city) || '''' || ','
          || '''' || UPPER(lv_stat_code) || '''' || ','
          || '''' || lv_zip || '''' || ','
          || '''' || UPPER(lv_ssn) || '''' || ','
          || '''' || UPPER(lv_sex) || '''' || ','
          || '''' || lv_birth_date || '''' || '))'
          || ' where rownum <= ' || lv_max_cnt;
-- --
    ELSE
      SET_WINDOW_PROPERTY('G$_EXTENDED_SEARCH_WINDOW',TITLE,'SSN/SIN/TIN Extended Search');
      SET_ITEM_PROPERTY('SR_SPBPERS_SSN',VISIBLE,PROPERTY_OFF);
      lv_query := 
        'SELECT r_name Name, r_id' || '||' || '''' || ',' || '''' || '||' 
          || 'TO_CHAR(r_pidm)' || '||' || '''' || ',' || '''' || '||'
          || 'r_internal_record_id ID, r_distinct_query_count Count' 
          || ' FROM TABLE (' 
          || ' gb_identification.f_ssnname_search ('
          || '''' || id_search_val || '''' || ','
          || '''' || search_lname || '''' || ','
          || '''' || search_fname || '''' || ','
          || '''' || search_mname || '''' || ','
          || '''' || UPPER(lv_ntyp_code) || '''' || ','
          || '''' || UPPER(lv_entity_ind) || '''' || ','
          || '''' || UPPER(lv_city) || '''' || ','
          || '''' || UPPER(lv_stat_code) || '''' || ','
          || '''' || lv_zip || '''' || ','
          || '''' || UPPER(lv_ssn) || '''' || ','
          || '''' || UPPER(lv_sex) || '''' || ','
          || '''' || lv_birth_date || '''' || '))'
          || ' where rownum <= ' || lv_max_cnt;          
    END IF;
-- -- --
-- -- --
--
    IF ID_NULL(rg_id) THEN
      rg_id := CREATE_GROUP_FROM_QUERY(rg_name,lv_query);
      id_count := POPULATE_GROUP(rg_id);
--
    ELSE
      DELETE_GROUP_ROW(rg_id,ALL_ROWS);
      id_count := POPULATE_GROUP_WITH_QUERY(rg_id,lv_query);
    END IF;
--
    IF id_count = 0 THEN
      id_count := GET_GROUP_NUMBER_CELL(rg_name || '.Count',1);
    ELSE
    	id_count := 0;
    END IF;
  END;
--
--
  PROCEDURE POST_EXSEARCH_ITEM (itm_name IN VARCHAR2) IS
    sys_trg_itm  VARCHAR2(61);
    trg_item     VARCHAR2(61) := itm_name;
    start_pos    PLS_INTEGER  := INSTR(trg_item,'.')+ 4;
    item_name    VARCHAR2(60) := SUBSTR(trg_item,start_pos); 
    curr_value   VARCHAR2(60) := UPPER(NAME_IN(trg_item));
  BEGIN
    IF curr_value IS NOT NULL THEN
      IF INSTR(trg_item,'SR_') > 0 THEN
--
        IF GET_ITEM_PROPERTY(trg_item,DATATYPE) = 'DATE' THEN
          sys_trg_itm  := NAME_IN('SYSTEM.TRIGGER_ITEM');
          GO_ITEM(trg_item);
          G$_DATE_POST_ITEM;
          G$_CHECK_FAILURE;
          GO_ITEM(sys_trg_itm);
          curr_value := NAME_IN(trg_item);
        END IF;
--
        CASE item_name
          WHEN 'SPRADDR_CITY'       THEN lv_city := curr_value;
          WHEN 'SPRADDR_STAT_CODE'  THEN lv_stat_code := curr_value;
          WHEN 'SPRADDR_ZIP'        THEN lv_zip := curr_value;
          WHEN 'SPBPERS_SSN'        THEN lv_ssn := curr_value;
          WHEN 'SPBPERS_SEX'        THEN lv_sex := curr_value;
          WHEN 'SPBPERS_BIRTH_DATE' THEN lv_birth_date := curr_value;
          WHEN 'SPRIDEN_NTYP_CODE'  THEN lv_ntyp_code := curr_value;
          ELSE NULL;
        END CASE;
--
      END IF;
    END IF;
  END;
--
--
  PROCEDURE CLEAR_EXSEARCH IS
  BEGIN
    COPY('','SR_SPRADDR_CITY');
    COPY('','SR_SPRADDR_STAT_CODE');
    COPY('','SR_SPRADDR_ZIP');
    COPY('','SR_SPRIDEN_NTYP_CODE');
    COPY('','SR_SPBPERS_SSN');
    COPY('','SR_SPBPERS_BIRTH_DATE');
    COPY('','SR_SPBPERS_SEX');
  END;
--
--
  PROCEDURE CLEAR_COMMON_GLOBALS IS
  BEGIN
    COPY('','GLOBAL.CALLING_FORM');
    COPY('','GLOBAL.SEARCH_ID');
    COPY('','GLOBAL.LAST_NAME');
    COPY('','GLOBAL.FIRST_NAME');
    COPY('','GLOBAL.MID_NAME');
  END;
--
--
  PROCEDURE CLEAR_GLOBALS IS
  BEGIN
    COPY('','GLOBAL.FORM_WAS_CALLED');
    CLEAR_COMMON_GLOBALS;
  END;
--
--
  PROCEDURE SET_GLOBALS IS
  BEGIN
    CLEAR_GLOBALS;
    COPY('Y','GLOBAL.FORM_WAS_CALLED'); 
    COPY('IDNAME_SEARCH','GLOBAL.CALLING_FORM');
    IF search_lname IS NULL AND
       search_fname IS NULL AND
       search_mname IS NULL THEN
      COPY(id_search_val,'GLOBAL.SEARCH_ID');
    ELSE
      COPY(UPPER(search_lname),'GLOBAL.LAST_NAME');
      COPY(UPPER(search_fname),'GLOBAL.FIRST_NAME');
      COPY(UPPER(search_mname),'GLOBAL.MID_NAME');
    END IF;
  END;
--
--
  PROCEDURE CLEAR_LOCAL_VARIABLES IS
  BEGIN
    lv_ntyp_code  := '';
    lv_city       := '';
    lv_stat_code  := '';
    lv_zip        := '';
    lv_ssn        := '';
    lv_birth_date := '';
    lv_sex        := '';
  END;
--
-- Public procedures
--
  PROCEDURE ENTER_QUERY_STATUS IS
    al_id        ALERT;
    al_btn       PLS_INTEGER;
  BEGIN
    IF NAME_IN('GLOBAL.CALLING_FORM') = 'IDNAME_SEARCH' THEN
      al_id := FIND_ALERT('G$_ALERT_EXTQUERY');
      IF NOT ID_NULL(al_id) THEN
        al_btn := SHOW_ALERT('G$_ALERT_EXTQUERY');
        IF al_btn = ALERT_BUTTON2 THEN
          CLEAR_COMMON_GLOBALS;
          IF ITEM_EXIST THEN
            COPY('',item_name);
            SET_ITEM_PROPERTY(item_id,DISPLAYED,PROPERTY_FALSE);
          END IF;
        END IF;
      END IF;
    END IF;
  END;
--
--
  PROCEDURE FORM_INST_QUERY_STATUS IS
  BEGIN
    IF ITEM_EXIST THEN
      SET_ITEM_PROPERTY(item_id,DISPLAYED,PROPERTY_TRUE);
      COPY(G$_NLS.Get('GOQRPLS-0067','LIB','Performing Query On') ,item_name);
      IF NAME_IN('global.search_ID') IS NOT NULL THEN
        COPY(NAME_IN(item_name) || ' ID: ' || NAME_IN('global.search_ID'),item_name);
      ELSIF NAME_IN('global.first_name') IS NOT NULL OR
            NAME_IN('global.mid_name') IS NOT NULL OR
            NAME_IN('global.last_name') IS NOT NULL THEN
        COPY(NAME_IN(item_name) || ' Name: ' || NAME_IN('global.first_name') || ' '
             || NAME_IN('global.mid_name') || ' ' || NAME_IN('global.last_name'),item_name);
      ELSE 
        COPY('',item_name);
      END IF;
    END IF;
  END;
--
--
  PROCEDURE ID_SEARCH(item_ind	   IN VARCHAR2,
                      show_person  IN VARCHAR2 := '',
                      show_company IN VARCHAR2 := '') IS
  BEGIN
    IF NAME_IN('SYSTEM.MODE') <> 'ENTER-QUERY' THEN
      IF NAME_IN('GLOBAL.KEY_IDNO') IS NOT NULL AND 
         NAME_IN('GLOBAL.KEY_IDNO') = NAME_IN(NAME_IN('SYSTEM.TRIGGER_ITEM')) AND
         NAME_IN('GLOBAL.MORE_THAN_ONE_SSN') = 'N' THEN
        NULL;
      ELSE
--
        id_search_val := NAME_IN(NAME_IN('SYSTEM.CURSOR_ITEM'));
        search_lname := '';
        search_mname := '';
        search_fname := '';
--
        IF INSTR(id_search_val,'''') > 0 THEN
          id_search_val := REPLACE(id_search_val,'''','_');
        END IF;
--
        trigger_item := NAME_IN('SYSTEM.TRIGGER_ITEM');
        ind_itm := UPPER(item_ind);
--
        IF ind_itm = 'ID' THEN
          id_item := trigger_item;
          name_item := NAME_IN('SYSTEM.TRIGGER_BLOCK')||'.'|| GET_ITEM_PROPERTY(id_item,NEXTITEM);
          DISABLE_NAME_ITEM; 
        ELSE
          name_item := trigger_item;
          id_item := NAME_IN('SYSTEM.TRIGGER_BLOCK')||'.'||GET_ITEM_PROPERTY(name_item,PREVIOUSITEM);
        END IF;
--
        IF id_search_val IS NULL AND trigger_item = id_item THEN
          IF GET_ITEM_PROPERTY(name_item,ENABLED)= 'FALSE' THEN
            SET_ITEM_PROPERTY(name_item,ENABLED,PROPERTY_TRUE);
            SET_ITEM_PROPERTY(name_item,NAVIGABLE,PROPERTY_TRUE);
            SET_ITEM_PROPERTY(name_item,UPDATEABLE,PROPERTY_TRUE);
          END IF;
          COPY('',name_item);
        ELSE
          id_hint := GET_ITEM_PROPERTY(id_item,HINT_TEXT);
--
          IF show_person IS NULL AND
             show_company IS NULL THEN
            IF INSTR(id_hint,'LIST') > 0 AND
               INSTR(id_hint ,'COUNT HITS') > 0 THEN
              entity_flg := 'B';
            ELSIF INSTR(id_hint,'LIST') > 0 THEN
              entity_flg := 'P';   
            ELSIF INSTR(id_hint,'COUNT HITS') > 0 THEN
              entity_flg := 'C';
            END IF;
--
          ELSIF show_person IS NULL AND
                show_company IS NOT NULL THEN
            entity_flg := 'C';
--
          ELSIF show_person IS NOT NULL AND
                show_company IS NULL THEN
            entity_flg := 'P';
--
          ELSE
            entity_flg := 'B';
          END IF;          
--
          START_ID_SEARCH;
--
        END IF;
      END IF;
    END IF;
--
    NEXT_ITEM;
  END;
--
--
  PROCEDURE DISABLE_NAME_ITEM IS
  BEGIN
    IF current_form IN ('AAACMEM', 'ASASANG', 'GEAATID', 'GEAATTD',
                        'GEATASK', 'GLAEXTR', 'PAAAPOS', 'PAAAPPL',
                        'PCAPERS', 'PXAASCD', 'RCRSUSP', 'RPRCONT',
                        'RPRLNDA', 'SAAEAPS', 'SFARQST', 'SGAASST', 'SMARQCM', 
                        'SOAWLTC', 'SFARWLP', 'SFAWLPR', 'SFIWLNT',
                        'SRAPREL', 'SRIPREL', 'SSASECT', 'TSALBOX') THEN
      SYNCHRONIZE;
    END IF;
--
    IF name_item IS NOT NULL THEN
      SET_ITEM_PROPERTY(name_item,ENABLED,PROPERTY_FALSE);
    END IF;
  END;
--
--
  PROCEDURE NARROW_SEARCH_GROUP IS
    next_itm VARCHAR2(100) := 'SR_SPRADDR_CITY';
  BEGIN
    CLEAR_LOCAL_VARIABLES;
--
    FOR c1 IN 1..7 LOOP
      POST_EXSEARCH_ITEM('G$_EXTENDED_SEARCH_BLOCK.'||next_itm);
      next_itm := GET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.'||next_itm,NEXTITEM);
    END LOOP;
--
    entity_flg := NAME_IN('SEARCH_GROUP');
    POPULATE_LIST_GROUP;
    POPULATE_LIST(srch_list_name,rg_id);
    COPY(TO_CHAR(id_count),srch_cnt_name);
  END;
--
--
  PROCEDURE START_ID_SEARCH IS
    id_name        VARCHAR2(61) := NAME_IN('SYSTEM.CURSOR_ITEM');
    lv_cm_status   VARCHAR2(4)  := '';
    lv_id_count    PLS_INTEGER  := 0;
    lv_id_search_value VARCHAR2(300);
    CURSOR SSN_CURSOR IS        
      SELECT 'X'
        FROM SPBPERS
       WHERE SPBPERS_SSN = lv_id_search_value;       
--
    FUNCTION DO_START_ID_SEARCH RETURN INTEGER IS
      lv_first_id    VARCHAR2(100);
      lv_temp        VARCHAR2(1);
    BEGIN
      CLEAR_LOCAL_VARIABLES;
-- -- --      
-- -- --
      IF INSTR(id_search_val,'%') = 0 THEN
        IF NAME_IN('GLOBAL.SSN_SEARCH_ENABLED_IND') = 'Y' THEN
          IF G$_CHK_AUTH.G$_CHECK_AUTHORIZATION_FNC('SSN_SEARCH',USER) = 'YES' THEN
          	IF NOT G$_VERIFY_ID_EXISTS(id_search_val) THEN
              lv_id_search_value := id_search_val;
              lv_temp := '';
              OPEN SSN_CURSOR;
              FETCH SSN_CURSOR INTO lv_temp;
              CLOSE SSN_CURSOR;
              IF lv_temp IS NOT NULL THEN
                COPY('Y','GLOBAL.MORE_THAN_ONE_SSN');
              ELSE
                COPY('N','GLOBAL.MORE_THAN_ONE_SSN');          	              
              END IF;
            ELSE
              COPY('N','GLOBAL.MORE_THAN_ONE_SSN');  	
            END IF;  	
          END IF;
        END IF;
      ELSE
        COPY('N','GLOBAL.MORE_THAN_ONE_SSN');          	
      END IF;
-- -- --
-- -- --      
      POPULATE_LIST_GROUP;
--
      IF id_count > 1 THEN
        if id_count >= lv_max_cnt then
          MESSAGE(G$_NLS.Get('GOQRPLS-0068','LIB',
                  '*ERROR* Too many results returned. Search Limit=%01% Matches Found=%02%. Results are truncated. Please refine your search criteria.',lv_max_cnt,id_count),acknowledge); 
          SYNCHRONIZE;
        end if;
        POPULATE_LIST(srch_list_name,rg_id);
        COPY('',id_item);
        COPY('',name_item);
        COPY(TO_CHAR(id_count),srch_cnt_name);
        SET_FORM_PROPERTY(current_form,VALIDATION,PROPERTY_FALSE);
        CLEAR_EXSEARCH;
      ELSIF id_count = 1 THEN
        lv_first_id := GET_GROUP_CHAR_CELL(rg_name || '.ID',1);
        lv_first_id := SUBSTR(lv_first_id,1,INSTR(lv_first_id,',') -1);
        COPY(lv_first_id, id_item);
        GO_ITEM(id_item);
      END IF;
--
      RETURN id_count;
    END DO_START_ID_SEARCH;
--
  BEGIN
    IF id_search_val IS NULL THEN
      RETURN;
    END IF;
--
    lv_id_count := DO_START_ID_SEARCH;
--
-- If PII is active: turn fgac off and verify for the given ID.
--
    IF lv_id_count = 0 AND INSTR(id_search_val,'%') = 0  AND gokfgac.f_spriden_pii_active = 'Y' THEN 
--
-- If searching an ID, call the verify routine otherwise redo the search.
--
      IF ind_itm = 'NAME' THEN
        gokfgac.p_turn_fgac_off;
        lv_id_count := DO_START_ID_SEARCH;
        gokfgac.p_turn_fgac_on;
      ELSE
-- --
-- --
-- --      see if id_search_val value is an SSN with fgac turned off
        IF NAME_IN('GLOBAL.SSN_SEARCH_ENABLED_IND') = 'Y' THEN
        	IF gokfgac.f_is_user_exempt = 'N' THEN
            IF G$_VERIFY_SSN_EXISTS(id_search_val) THEN
              lv_id_count := 1;
            ELSE
            	lv_id_count := 0;
            END IF;
          END IF;
        END IF;
-- --
-- --
-- --      if the lv_id_count is still 0 (meaning not found as an ssn), then see if
-- --      the id_search_value is an ID with fgac turned off
        IF lv_id_count = 0 THEN
          IF G$_VERIFY_ID_EXISTS(id_search_val) THEN
            lv_id_count := 1;
          ELSE
         	  lv_id_count := 0;
          END IF;
        END IF;
      END IF;
--
-- If one or more records found, give access error message.
--
      IF lv_id_count >= 1 THEN
        IF ind_itm = 'NAME' THEN
          COPY('',id_item);
        ELSE  
          COPY('',name_item);  
        END IF;   
--
        MESSAGE(G$_NLS.Get('GOQRPLS-0069','LIB','*ERROR* You do not have permission to view this ID.'));
        SYNCHRONIZE;
        RAISE FORM_TRIGGER_FAILURE;
      END IF;
    END IF;        
--
-- ID is not found 
--
    IF lv_id_count = 0 THEN 
      IF name_item = id_name AND GET_ITEM_PROPERTY(name_item,WRAP_STYLE) = 'WORD' AND
        INSTR(id_search_val,'%') = 0 THEN
        RETURN;
      ELSE
        IF ind_itm = 'NAME' THEN
          MESSAGE(G$_NLS.Get('GOQRPLS-0070','LIB','*ERROR* Name is invalid.')); 
          SYNCHRONIZE;
          RAISE FORM_TRIGGER_FAILURE;
        ELSE
          lv_cm_status := G$_INVOKE_CM;
          IF lv_cm_status <> 'DONE' THEN
            COPY('',name_item);  
            MESSAGE(G$_NLS.Get('GOQRPLS-0071','LIB','*ERROR* ID is invalid.')); 
            SYNCHRONIZE;
            RAISE FORM_TRIGGER_FAILURE;
          END IF;
        END IF;
      END IF;
--
    ELSIF lv_id_count > 1 THEN
-- -- -- --
      ENABLE_EXT_SRCH_BLK_ON_ENTRY;
-- -- -- --      	
      GO_ITEM(srch_list_name);
    END IF;  
--
  END;
--
--
  PROCEDURE COPY_SELECTED_ID IS
    result   VARCHAR2(500) := NAME_IN('IDNAME_EXTSEARCH_LIST');
  BEGIN
    COPY((SUBSTR(result,1,INSTR(result,',') - 1)),id_item);
--
    CLEAR_LIST('IDNAME_EXTSEARCH_LIST');
    CLEAR_BLOCK(NO_VALIDATE);
--
    COPY('',name_item);
    GO_ITEM(id_item);
-- -- -- --
    DISABLE_EXT_SRCH_BLK_ON_EXIT;
-- -- -- --
    HIDE_WINDOW('G$_EXTENDED_SEARCH_WINDOW');
    SYNCHRONIZE;
    EXECUTE_TRIGGER('WHEN-VALIDATE-ITEM');
    EXECUTE_TRIGGER('POST-CHANGE');
    SET_ITEM_PROPERTY(name_item,ENABLED,PROPERTY_FALSE);
  END;
--
--
  PROCEDURE WHEN_NEW_BLOCK IS
  BEGIN
    SET_FORM_PROPERTY(current_form,VALIDATION,PROPERTY_TRUE);
--
    SET_ITEM_PROPERTY('PERSON_DETAIL_BTN' ,ENABLED,PROPERTY_TRUE);
    SET_ITEM_PROPERTY('NPERSON_DETAIL_BTN',ENABLED,PROPERTY_TRUE);
--
    SET_RADIO_BUTTON_PROPERTY('SEARCH_GROUP','NONPERSON',ENABLED,PROPERTY_TRUE);
    SET_RADIO_BUTTON_PROPERTY('SEARCH_GROUP','BOTH'     ,ENABLED,PROPERTY_TRUE);
    SET_RADIO_BUTTON_PROPERTY('SEARCH_GROUP','PERSON'   ,ENABLED,PROPERTY_TRUE);
--
    COPY(entity_flg,'SEARCH_GROUP');
    IF entity_flg = 'P' THEN
      DISABLE_BTN('N');
      DISABLE_RBTN('BOTH');
      DISABLE_RBTN('NONPERSON');
    ELSIF entity_flg = 'C' THEN
      DISABLE_BTN(''); 
      DISABLE_RBTN('BOTH');
      DISABLE_RBTN('PERSON'); 
    END IF;
--
    GO_ITEM('IDNAME_EXTSEARCH_LIST');
  END;
--
--
  PROCEDURE WHEN_CLEAR_BUTTON_PRESSED IS
  BEGIN
    CLEAR_EXSEARCH;
    NARROW_SEARCH_GROUP;
    GO_ITEM('IDNAME_EXTSEARCH_LIST');
  END;
--
--
  PROCEDURE DETAIL_BTN_PRESSED IS
    pos        PLS_INTEGER := INSTR(NAME_IN('SYSTEM.TRIGGER_ITEM'),'NPERSON');
    call_form  VARCHAR2(60);
  BEGIN
    IF pos > 0 THEN
      call_form := 'COUNT_QUERY';
    ELSE
      call_form := 'LIST_VALUES';
    END IF;
--
    SET_GLOBALS;
    HIDE_WINDOW('G$_EXTENDED_SEARCH_WINDOW');
    GO_ITEM(id_item);
-- -- -- --
    DISABLE_EXT_SRCH_BLK_ON_EXIT;
-- -- -- --
    CLEAR_MESSAGE;
    DO_KEY(call_form);
--
    CLEAR_GLOBALS;
  END;
--
--
  PROCEDURE WHEN_BUTTON_PRESSED IS
  BEGIN
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(USER,'GTVZIPC','');
    G$_CHECK_FAILURE;
    COPY(NAME_IN('global.value'),'G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_ZIP');
  END;
--
--
  PROCEDURE WHEN_NEW_ITEM IS 
    item_name VARCHAR2(61) := NAME_IN('SYSTEM.CURSOR_ITEM');
  BEGIN
    IF item_name = 'G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST' THEN
      MESSAGE(id_hint,NO_ACKNOWLEDGE);
    END IF;
  END;
--
--
-- -- -- --
-- -- -- --
  PROCEDURE ENABLE_EXT_SRCH_BLK_ON_ENTRY IS
  BEGIN
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST', ENABLED, PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST', NAVIGABLE, PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST', MOUSE_NAVIGATE, PROPERTY_TRUE);
-- --
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SEARCH_GROUP', ENABLED, PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SEARCH_GROUP', NAVIGABLE, PROPERTY_TRUE);
--
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_CITY', ENABLED, PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_CITY', NAVIGABLE, PROPERTY_TRUE);
--
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_STAT_CODE', ENABLED, PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_STAT_CODE', NAVIGABLE, PROPERTY_TRUE);
--
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_ZIP', ENABLED, PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_ZIP', NAVIGABLE, PROPERTY_TRUE);
--
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRIDEN_NTYP_CODE', ENABLED, PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRIDEN_NTYP_CODE', NAVIGABLE, PROPERTY_TRUE);
--
    IF GET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN',VISIBLE) = 'TRUE' THEN
      SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN', ENABLED, PROPERTY_TRUE);
      SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN', NAVIGABLE, PROPERTY_TRUE);
    END IF;
--
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_BIRTH_DATE', ENABLED, PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_BIRTH_DATE', NAVIGABLE, PROPERTY_TRUE);
--
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SEX', ENABLED, PROPERTY_TRUE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SEX', NAVIGABLE, PROPERTY_TRUE);
--
  END;
-- --
-- --
  PROCEDURE DISABLE_EXT_SRCH_BLK_ON_EXIT IS
  BEGIN
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST', ENABLED, PROPERTY_FALSE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SEARCH_GROUP', ENABLED, PROPERTY_FALSE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_CITY', ENABLED, PROPERTY_FALSE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_STAT_CODE', ENABLED, PROPERTY_FALSE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_ZIP', ENABLED, PROPERTY_FALSE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPRIDEN_NTYP_CODE', ENABLED, PROPERTY_FALSE);
    
    IF GET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN',VISIBLE) = 'TRUE' THEN
      SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN', ENABLED, PROPERTY_FALSE);
    END IF;

    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_BIRTH_DATE', ENABLED, PROPERTY_FALSE);
    SET_ITEM_PROPERTY('G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SEX', ENABLED, PROPERTY_FALSE);
--
  END;
-- -- -- --
-- -- -- --
END;
		*/
				// 
		//  This procedure is used to perform an ID/Name search.
		//  '%' and '_' can be used as wild card for the search.
		//  If the search results return more than one name, the extended search window will
		//  appear.
		// 
		private NNumber lvMaxCnt = toNumber(999999);
		private NString lvMaxCntStr= NString.getNull();
		private NInteger idCount= NInteger.getNull();
		private NString currentForm = getCurrentTaskName();
		private NString idSearchVal= NString.getNull();
		private NString srchListName = toStr("G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST");
		private NString lovListName = toStr("G$_EXT_SEARCH_LOV");
		private NString srchCntName = toStr("G$_EXTENDED_SEARCH_BLOCK.EXTSEARCH_COUNT");
		// 
		private NString idItem= NString.getNull();
		private NString nameItem= NString.getNull();
		private NString triggerItem= NString.getNull();
		private NString idHint= NString.getNull();
		private NString indItm= NString.getNull();
		private NString entityFlg= NString.getNull();
		// 
		private NString rgName = toStr("IDNAME_RECGRP");
		private ValueSet rgId = findGroup(rgName);
		// 
		//  Birth date is not defined as SPBPERS_BIRTH_DATE%TYPE in order to support and allow
		//  wildcard characters.
		// 
		private NString lvBirthDate= NString.getNull();
		// 
		private NString lvNtypCode= NString.getNull();
		private NString lvCity= NString.getNull();
		private NString lvStatCode= NString.getNull();
		private NString lvZip= NString.getNull();
		private NString lvSsn= NString.getNull();
		private NString lvSex= NString.getNull();
		private NString searchLname = toStr("");
		private NString searchFname = toStr("");
		private NString searchMname = toStr("");
		// 
		//  For IDEN forms in WHEN-NEW-FORM-INSTANCE and KEY-ENTQRY
		// 
		public final NString ITEM_NAME = toStr("DISP_QUERY_STATUS");
		private ItemDescriptor itemId= null;
/* <p>
		* 
		*  Private procedures and functions
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param nameField
		*/
		public NString compressName(NString nameField)
		{
			//     RETURN(TRANSLATE(UPPER(name_field),'ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 `-=\[];'',./~!@#$^&*()_+|}{":?><',
			//                                        'ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890'));
			return ((Gukcmpr.fGoqrplsCompressName(nameField)));
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool itemExist()
		{
			itemId = findItem(ITEM_NAME);
			if ( !(itemId == null) )
			{
				return  toBool(((NBool.True)));
			}
			return  toBool(((NBool.False)));
		}
/* <p>
		* 
		*  This procedure is used to perform a name search.  The name search string can be one
		*  of the following formats:
		*      last name, first name, middle name.
		*      last name,
		*      ,first name
		*      ,,middle name
		*      last name, first name
		*      ,first name, middle name.
		* 
		*  '%' and '_' can be used as wild cards.
		*  If the search results return more than one name, the extended search window will
		*  appears.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void startNameSearch()
		{
			NString lname= NString.getNull();
			NString fname= NString.getNull();
			NString mname= NString.getNull();
			NInteger commaPos = toInt(0);
			NString nameStr = ltrim(rtrim(idSearchVal));
			if ( !nameStr.isNull() )
			{
				commaPos = inStr(nameStr, toStr(","));
				if ( commaPos.equals(0) )
				{
					lname = substring(nameStr, toInt(1), toInt(60));
				}
				else {
					lname = substring(rtrim(substring(nameStr, toInt(1), commaPos.subtract(1))), toInt(1), toInt(60));
					nameStr = ltrim(substring(nameStr, commaPos.add(1)));
					if ( !nameStr.isNull() )
					{
						commaPos = inStr(nameStr, toStr(","));
						if ( commaPos.greater(0) )
						{
							fname = substring(rtrim(substring(nameStr, toInt(1), commaPos.subtract(1))), toInt(1), toInt(60));
							mname = substring(ltrim(rtrim(substring(nameStr, commaPos.add(1)))), toInt(1), toInt(60));
						}
						else {
							fname = substring(rtrim(nameStr), toInt(1), toInt(60));
						}
					}
				}
				// 
				searchLname = compressName(lname);
				searchMname = compressName(mname);
				searchFname = compressName(fname);
			}
		}
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void disableBtn() {
			disableBtn(NString.getNull());
		}

/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param flagInd
		*/
		public void disableBtn(NString flagInd)
		{
			NString itemName= NString.getNull();
			itemName = flagInd.append("PERSON_DETAIL_BTN");
			if ( getItemEnabled(itemName).equals("TRUE") )
			{
				setItemEnabled(itemName, false);
			}
		}
/* <p>
		* 
		* 
/* </p>
		* @param rbtnName
		*/
		public void disableRbtn(NString rbtnName)
		{
			if ( getRadioButtonEnabled("SEARCH_GROUP", rbtnName).equals("TRUE") )
			{
				setRadioButtonEnabled("SEARCH_GROUP", rbtnName, false);
			}
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void populateListGroup()
		{
			int rowCount = 0;
			NString lvEntityInd= NString.getNull();
			// 
			NString lvQuery= NString.getNull();
			NString lvQueryStatus = toStr("T");
			NNumber lvNum= NNumber.getNull();
			String sqlmaxCountC = "SELECT gtvsdax_external_code " +
	" FROM gtvsdax " +
	" WHERE gtvsdax_internal_code = 'SEARCH_MAX' AND gtvsdax_internal_code_group = 'GOQRPLS' ";
			DataCursor maxCountC = new DataCursor(sqlmaxCountC);
			try {
				if ( entityFlg.notEquals("B") )
				{
					lvEntityInd = entityFlg;
				}
				// 
				setDefaultValue("N", "GLOBAL.GOQRPLS_SEARCH_MAX");
				if ( getNameIn("GLOBAL.GOQRPLS_SEARCH_MAX").equals("N") )
				{
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable maxCountC.
					maxCountC.open();
					ResultSet maxCountCResults = maxCountC.fetchInto();
					if ( maxCountCResults != null ) {
						lvMaxCntStr = maxCountCResults.getStr(0);
					}
					if ( maxCountC.notFound() )
					{
						lvMaxCntStr = toStr("999999");
					}
					maxCountC.close();
					try
					{
						lvMaxCnt = toNumber(lvMaxCntStr);
					}
					catch(Exception  e)
					{
						lvMaxCnt = toNumber(null);
					}
					// 
					if ( lvMaxCnt.isNull() )
					{
						//  have to make sure to force acknowledgement by displaying message twice
						warningMessage(GNls.Fget(toStr("GOQRPLS-0065"), toStr("LIB"), toStr("*WARNING* The GTVSDAX entry for GOQRPLS / SEARCH_MAX is invalid (%01%). Limit set to 999999."), lvMaxCntStr), OutputMessageUserResponse.ACKNOWLEDGE);
						warningMessage(GNls.Fget(toStr("GOQRPLS-0066"), toStr("LIB"), toStr("*WARNING* The GTVSDAX entry for GOQRPLS / SEARCH_MAX is invalid (%01%). Limit set to 999999."), lvMaxCntStr), OutputMessageUserResponse.ACKNOWLEDGE);
						lvMaxCnt = toNumber(999999);
					}
					copy(lvMaxCnt,"GLOBAL.GOQRPLS_SEARCH_MAX");
				}
				else {
					lvMaxCnt = toNumber(getNameIn("GLOBAL.GOQRPLS_SEARCH_MAX"));
				}
				//  --
				if ( indItm.equals("NAME") )
				{
					startNameSearch();
					idSearchVal = toStr("");
				}
				//  --
				if ( getNameIn("GLOBAL.MORE_THAN_ONE_SSN").equals("N") )
				{
					setWindowTitle("G$_EXTENDED_SEARCH_WINDOW", "ID and Name Extended Search");
					if ( GChkAuth.gCheckAuthorizationFnc(toStr("SSN_SEARCH"), getUser()).equals("NO") )
					{
						setItemVisible("SR_SPBPERS_SSN", false);
					}
					else {
						if ( getItemVisible("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN").equals("FALSE") )
						{
							setItemVisible("SR_SPBPERS_SSN", true);
							setItemEnabled("SR_SPBPERS_SSN", true);
							setItemNavigable("SR_SPBPERS_SSN", true);
						}
					}
					// 
					//  This calls the id/name search routine to perform the query.  This select
					//  is using the TABLE function on the returned object type so that it can be
					//  used in a select statement.
					// 
					lvQuery = toStr("SELECT r_name Name, r_id").append("||").append("'").append(",").append("'").append("||").append("TO_CHAR(r_pidm)").append("||").append("'").append(",").append("'").append("||").append("r_internal_record_id ID, r_distinct_query_count Count").append(" FROM TABLE (").append(" gb_identification.f_idname_search (").append("'").append(idSearchVal).append("'").append(",").append("'").append(searchLname).append("'").append(",").append("'").append(searchFname).append("'").append(",").append("'").append(searchMname).append("'").append(",").append("'").append(upper(lvNtypCode)).append("'").append(",").append("'").append(upper(lvEntityInd)).append("'").append(",").append("'").append(upper(lvCity)).append("'").append(",").append("'").append(upper(lvStatCode)).append("'").append(",").append("'").append(lvZip).append("'").append(",").append("'").append(upper(lvSsn)).append("'").append(",").append("'").append(upper(lvSex)).append("'").append(",").append("'").append(lvBirthDate).append("'").append("))").append(" where rownum <= ").append(lvMaxCnt);
				}
				else {
					setWindowTitle("G$_EXTENDED_SEARCH_WINDOW", "SSN/SIN/TIN Extended Search");
					setItemVisible("SR_SPBPERS_SSN", false);
					lvQuery = toStr("SELECT r_name Name, r_id").append("||").append("'").append(",").append("'").append("||").append("TO_CHAR(r_pidm)").append("||").append("'").append(",").append("'").append("||").append("r_internal_record_id ID, r_distinct_query_count Count").append(" FROM TABLE (").append(" gb_identification.f_ssnname_search (").append("'").append(idSearchVal).append("'").append(",").append("'").append(searchLname).append("'").append(",").append("'").append(searchFname).append("'").append(",").append("'").append(searchMname).append("'").append(",").append("'").append(upper(lvNtypCode)).append("'").append(",").append("'").append(upper(lvEntityInd)).append("'").append(",").append("'").append(upper(lvCity)).append("'").append(",").append("'").append(upper(lvStatCode)).append("'").append(",").append("'").append(lvZip).append("'").append(",").append("'").append(upper(lvSsn)).append("'").append(",").append("'").append(upper(lvSex)).append("'").append(",").append("'").append(lvBirthDate).append("'").append("))").append(" where rownum <= ").append(lvMaxCnt);
				}
				//  -- --
				//  -- --
				// 
				if ( (rgId == null) )
				{
					rgId = createGroupFromQuery(rgName, lvQuery);					
					idCount = toInt(populateGroup(rgId.getName()));
				}
				else {
					deleteGroupRow(rgId, ValueSet.ALL_ROWS);
					idCount = toInt(populateGroupWithQuery(rgId, lvQuery));
				}
				//MORPHIS TODO Changed from equals to Greater to only check value if RGroup has count greater than 0 
				if ( idCount.equals(0) )
				//if ( idCount.greater(0) )
				{
					idCount = toInt(getGroupNumberCell(rgName.append(".Count"), 1));
				}
				else {
					idCount = toInt(0);
				}
				}finally{
					maxCountC.close();
				}
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itmName
		*/
		public void postExsearchItem(NString itmName)
		{
			NString sysTrgItm= NString.getNull();
			NString trgItem = itmName;
			NInteger startPos = inStr(trgItem, toStr(".")).add(4);
			NString itemName = substring(trgItem, startPos);
			NString currValue = upper(getNameIn(trgItem));
			if ( !currValue.isNull() )
			{
				if ( inStr(trgItem, toStr("SR_")).greater(0) )
				{
					// 
					if ( getItemDataType(trgItem).equals("DATE") )
					{
						sysTrgItm = getTriggerItem();
						goItem(trgItem);
						TaskServices.getCurrentTask().getNavigationModel().doNavigation();
						getContainer().gDatePostItem();
						getContainer().gCheckFailure();
						goItem(sysTrgItm);
						TaskServices.getCurrentTask().getNavigationModel().doNavigation();
						currValue = getNameIn(trgItem);
					}
					// 
					if (itemName.equals("SPRADDR_CITY"))
					{
						lvCity = currValue;
					}
					else if (itemName.equals("SPRADDR_STAT_CODE"))
					{
						lvStatCode = currValue;
					}
					else if (itemName.equals("SPRADDR_ZIP"))
					{
						lvZip = currValue;
					}
					else if (itemName.equals("SPBPERS_SSN"))
					{
						lvSsn = currValue;
					}
					else if (itemName.equals("SPBPERS_SEX"))
					{
						lvSex = currValue;
					}
					else if (itemName.equals("SPBPERS_BIRTH_DATE"))
					{
						lvBirthDate = currValue;
					}
					else if (itemName.equals( "SPRIDEN_NTYP_CODE"))
					{
						lvNtypCode = currValue;
					}
					else {
					}
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void clearExsearch()
		{
			copy("","SR_SPRADDR_CITY");
			copy("","SR_SPRADDR_STAT_CODE");
			copy("","SR_SPRADDR_ZIP");
			copy("","SR_SPRIDEN_NTYP_CODE");
			copy("","SR_SPBPERS_SSN");
			copy("","SR_SPBPERS_BIRTH_DATE");
			copy("","SR_SPBPERS_SEX");
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void clearCommonGlobals()
		{
			copy("","GLOBAL.CALLING_FORM");
			copy("","GLOBAL.SEARCH_ID");
			copy("","GLOBAL.LAST_NAME");
			copy("","GLOBAL.FIRST_NAME");
			copy("","GLOBAL.MID_NAME");
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void clearGlobals()
		{
			copy("","GLOBAL.FORM_WAS_CALLED");
			clearCommonGlobals();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setGlobals()
		{
			clearGlobals();
			copy("Y","GLOBAL.FORM_WAS_CALLED");
			copy("IDNAME_SEARCH","GLOBAL.CALLING_FORM");
			if ( searchLname.isNull() && searchFname.isNull() && searchMname.isNull() )
			{
				copy(idSearchVal,"GLOBAL.SEARCH_ID");
			}
			else {
				copy(upper(searchLname),"GLOBAL.LAST_NAME");
				copy(upper(searchFname),"GLOBAL.FIRST_NAME");
				copy(upper(searchMname),"GLOBAL.MID_NAME");
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void clearLocalVariables()
		{
			lvNtypCode = toStr("");
			lvCity = toStr("");
			lvStatCode = toStr("");
			lvZip = toStr("");
			lvSsn = toStr("");
			lvBirthDate = toStr("");
			lvSex = toStr("");
		}
/* <p>
		* 
		*  Public procedures
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void enterQueryStatus()
		{
			AlertDescriptor alId= null;
			NInteger alBtn= NInteger.getNull();
			if ( getNameIn("GLOBAL.CALLING_FORM").equals("IDNAME_SEARCH") )
			{
				alId = findAlert("G$_ALERT_EXTQUERY");
				if ( !(alId == null) )
				{
					alBtn = toInt(showAlert("G$_ALERT_EXTQUERY"));
					if ( alBtn.equals(MessageServices.BUTTON2) )
					{
						clearCommonGlobals();
						if ( itemExist().getValue() )
						{
							copy("",ITEM_NAME);
							setItemVisible(itemId, false);
						}
					}
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void formInstQueryStatus()
		{
			if ( itemExist().getValue() )
			{
				setItemVisible(itemId, true);
				copy(GNls.Fget(toStr("GOQRPLS-0067"), toStr("LIB"), toStr("Performing Query On")),ITEM_NAME);
				if ( !getNameIn("global.search_ID").isNull() )
				{
					copy(getNameIn(ITEM_NAME).append(" ID: ").append(getNameIn("global.search_ID")),ITEM_NAME);
				}
				else if ( !getNameIn("global.first_name").isNull() || !getNameIn("global.mid_name").isNull() || !getNameIn("global.last_name").isNull() ) {
					copy(getNameIn(ITEM_NAME).append(" Name: ").append(getNameIn("global.first_name")).append(" ").append(getNameIn("global.mid_name")).append(" ").append(getNameIn("global.last_name")),ITEM_NAME);
				}
				else {
					copy("",ITEM_NAME);
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemInd
		*/
		public void idSearch(NString itemInd) {
			idSearch(itemInd, NString.getNull(), NString.getNull());
		}

/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemInd
		* @param showPerson
		*/
		public void idSearch(NString itemInd, NString showPerson) {
			idSearch(itemInd, showPerson, NString.getNull());
		}

/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemInd
		* @param showPerson
		* @param showCompany
		*/
		public void idSearch(NString itemInd, NString showPerson, NString showCompany)
		{
			if ( getMode().notEquals("ENTER-QUERY") )
			{
				if ( !getNameIn("GLOBAL.KEY_IDNO").isNull() && getNameIn("GLOBAL.KEY_IDNO").equals(getNameIn(getKeyTriggerItem())) && getNameIn("GLOBAL.MORE_THAN_ONE_SSN").equals("N") )
				{
				}
				else {
					// 
					idSearchVal = getNameIn(getCursorItem());
					searchLname = toStr("");
					searchMname = toStr("");
					searchFname = toStr("");
					// 
					if ( inStr(idSearchVal, toStr("'")).greater(0) )
					{
						idSearchVal = replace(idSearchVal, "'", "_");
					}
					// 
					triggerItem = getKeyTriggerItem();
					if (!triggerItem.contains("."))
						triggerItem = getTriggerBlock().append(".").append(triggerItem);
					indItm = upper(itemInd);
					// 
					if ( indItm.equals("ID") )
					{
						idItem = triggerItem;
						NString item = getItemNextItem(idItem);
						if (item.contains("."))
							nameItem = item;
						else
							nameItem = getTriggerBlock().append(".").append(item);
						disableNameItem();
					}
					else {
						nameItem = triggerItem;
						NString item = getItemPreviousItem(nameItem);
						if (item.contains("."))
							idItem = item;
						else
							idItem = getTriggerBlock().append(".").append(item);
					}
					// 
					if ( idSearchVal.isNull() && triggerItem.equals(idItem) )
					{
						if ( getItemEnabled(nameItem).equals("FALSE") )
						{
							setItemEnabled(nameItem, true);
							setItemNavigable(nameItem, true);
							setItemUpdateAllowed(nameItem, true);
						}
						copy("",nameItem);
					}
					else {
						idHint = getItemHint(idItem);
						// 
						if ( showPerson.isNull() && showCompany.isNull() )
						{
							if ( inStr(idHint, toStr("LIST")).greater(0) && inStr(idHint, toStr("COUNT HITS")).greater(0) )
							{
								entityFlg = toStr("B");
							}
							else if ( inStr(idHint, toStr("LIST")).greater(0) ) {
								entityFlg = toStr("P");
							}
							else if ( inStr(idHint, toStr("COUNT HITS")).greater(0) ) {
								entityFlg = toStr("C");
							}
						}
						else if ( showPerson.isNull() && !showCompany.isNull() ) {
							entityFlg = toStr("C");
						}
						else if ( !showPerson.isNull() && showCompany.isNull() ) {
							entityFlg = toStr("P");
						}
						else {
							entityFlg = toStr("B");
						}
						// 
						startIdSearch();
					}
				}
			}
			//MORPHIS TODO: JM removed validateCurrentItem since nextItem now correctly fire validation triggers.
			//validateCurrentItem();
			// 
			
			
			nextItem();
			getCurrentTask().getNavigationModel().doNavigation();
			getCurrentTask().setValidationEnabled(true);
		}
		
/* <p>
		* 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void disableNameItem()
		{
			if ( in(currentForm, "AAACMEM", "ASASANG", "GEAATID", "GEAATTD", "GEATASK", "GLAEXTR", "PAAAPOS", "PAAAPPL", "PCAPERS", "PXAASCD", "RCRSUSP", "RPRCONT", "RPRLNDA", "SAAEAPS", "SFARQST", "SGAASST", "SMARQCM", "SOAWLTC", "SFARWLP", "SFAWLPR", "SFIWLNT", "SRAPREL", "SRIPREL", "SSASECT", "TSALBOX").getValue() )
			{
				// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize".
				//				SupportClasses.SQLFORMS.Synchronize();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize'.");
				
				
			}
			// 
			if ( !nameItem.isNull() )
			{
				setItemEnabled(nameItem, false);
			}
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void narrowSearchGroup()
		{
			NString nextItm = toStr("SR_SPRADDR_CITY");
			clearLocalVariables();
			// 
			for ( int c1 = 1; c1 <= 7; c1++ )
			{
				if(nextItm.isNotNull() && nextItm.contains(".")){
					postExsearchItem(nextItm);
					nextItm = getItemNextItem(nextItm);
				}
				else{
					postExsearchItem(toStr("G$_EXTENDED_SEARCH_BLOCK.").append(nextItm));
					nextItm = getItemNextItem(toStr("G$_EXTENDED_SEARCH_BLOCK.").append(nextItm));
				}
			}
			// 
			entityFlg = getNameIn("SEARCH_GROUP");
			populateListGroup();
			//populateList(srchListName, rgId);
			setLovGroupName(lovListName, toStr(rgId.getName()));
			copy(toChar(idCount),srchCntName);
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void startIdSearch()
		{
			StartIdSearch_Local innerClass = new StartIdSearch_Local();

			if ( idSearchVal.isNull()) {
				return ;
			}
			// 
			innerClass.lvIdCount = innerClass.doStartIdSearch_Local();
			// 
			//  If PII is active: turn fgac off and verify for the given ID.
			// 
			if ( innerClass.lvIdCount.equals(0) && inStr(idSearchVal, toStr("%")).equals(0) && Gokfgac.fSpridenPiiActive().equals("Y") )
			{
				// 
				//  If searching an ID, call the verify routine otherwise redo the search.
				// 
				if ( indItm.equals("NAME") )
				{
					Gokfgac.pTurnFgacOff();
					innerClass.lvIdCount = innerClass.doStartIdSearch_Local();
					Gokfgac.pTurnFgacOn();
				}
				else {
					//  --
					//  --
					//  --      see if id_search_val value is an SSN with fgac turned off
					if ( getNameIn("GLOBAL.SSN_SEARCH_ENABLED_IND").equals("Y") )
					{
						if ( Gokfgac.fIsUserExempt().equals("N") )
						{
							if ( getContainer().gVerifySsnExists(idSearchVal).getValue() )
							{
								innerClass.lvIdCount = toInt(1);
							}
							else {
								innerClass.lvIdCount = toInt(0);
							}
						}
					}
					//  --
					//  --
					//  --      if the lv_id_count is still 0 (meaning not found as an ssn), then see if
					//  --      the id_search_value is an ID with fgac turned off
					if (innerClass.lvIdCount.equals(0) )
					{
						if ( getContainer().gVerifyIdExists(idSearchVal).getValue() )
						{
							innerClass.lvIdCount = toInt(1);
						}
						else {
							innerClass.lvIdCount = toInt(0);
						}
					}
				}
				// 
				//  If one or more records found, give access error message.
				// 
				if ( innerClass.lvIdCount.greaterOrEquals(1) )
				{
					if ( indItm.equals("NAME") )
					{
						copy("",idItem);
					}
					else {
						copy("",nameItem);
					}
					// 
					errorMessage(GNls.Fget(toStr("GOQRPLS-0069"), toStr("LIB"), toStr("*ERROR* You do not have permission to view this ID.")));
					// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize".
					//					SupportClasses.SQLFORMS.Synchronize();
					this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize'.");
					
					
					throw new ApplicationException();
				}
			}
			// 
			//  ID is not found 
			// 
			
			
			
			
			if ( innerClass.lvIdCount.equals(0) )
			{
				//NSSG 25/03/2015 never enter in if (return), GET_ITEM_PROPERTY(name_item,WRAP_STYLE) = 'WORD' should always be false normally WRAP_STYPE = VARCHAR2
				if ( nameItem.equals(innerClass.idName) && false && /*findItem(nameItem).getWrapStyle().equals("WORD") && */inStr(idSearchVal, toStr("%")).equals(0) )
				{
					
					return ;
				}
				else {
					if ( indItm.equals("NAME") )
					{
						errorMessage(GNls.Fget(toStr("GOQRPLS-0070"), toStr("LIB"), toStr("*ERROR* Name is invalid.")));						
						throw new ApplicationException();
					}
					else {
						innerClass.lvCmStatus = getContainer().gInvokeCm();
						if ( innerClass.lvCmStatus.notEquals("DONE") )
						{
							copy("",nameItem);
							
							// MORPHIS TODO Autoskip not supported || 
							// If clause to verify that we put the max characters available in a field since INB assumes a new value (ID)
							ItemDescriptor item = findItem(idItem);
							if(idSearchVal.getLength() < item.getMaxLength())
							{
								errorMessage(GNls.Fget(toStr("GOQRPLS-0071"), toStr("LIB"), toStr("*ERROR* ID is invalid.")));
								//JOG: Since this checking may not be node at validation time, we mark the item has invalid immediately
								item.setValid(false);
								throw new ApplicationException();
							}
							// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize".
							//							SupportClasses.SQLFORMS.Synchronize();
							// System.err.println("// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize'.");	
						}
					}
				}
			}
			else if ( innerClass.lvIdCount.greater(1) ) {
				//  -- -- --
				enableExtSrchBlkOnEntry();
				//  -- -- --      	
				//MORPHIS TODO codigo adicionado para nao validar o current block e respectivos items
				getCurrentTask().setValidationEnabled(false);
				goItem(srchListName);
//				getCurrentTask().setValidationEnabled(true);
			}
			 
		}
/* <p>
		* 
/* </p>
		*/
		
		private class StartIdSearch_Local{
			int rowCount = 0;
			NString idName = getCursorItem();
			NString lvCmStatus = toStr("");
			NInteger lvIdCount = toInt(0);
			NString lvIdSearchValue= NString.getNull();
			String sqlssnCursor = "SELECT 'X' " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_SSN = :P_LV_ID_SEARCH_VALUE ";
			DataCursor ssnCursor = new DataCursor(sqlssnCursor);
			public NInteger doStartIdSearch_Local()
			{
				NString lvFirstId= NString.getNull();
				NString lvTemp= NString.getNull();
				try {
					clearLocalVariables();
					//  -- --      
					//  -- --
					if ( inStr(idSearchVal, toStr("%")).equals(0) )
					{
						if ( getNameIn("GLOBAL.SSN_SEARCH_ENABLED_IND").equals("Y") )
						{
							if ( GChkAuth.gCheckAuthorizationFnc(toStr("SSN_SEARCH"), getUser()).equals("YES") )
							{
								if ( getContainer().gVerifyIdExists(idSearchVal).not() )
								{
									lvIdSearchValue = idSearchVal;
									lvTemp = toStr("");
									ssnCursor.addParameter("P_LV_ID_SEARCH_VALUE", lvIdSearchValue);
									//F2J_WARNING : Make sure that the method "Close" is being called over the variable ssnCursor.
									ssnCursor.open();
									ResultSet ssnCursorResults = ssnCursor.fetchInto();
									if ( ssnCursorResults != null ) {
										lvTemp = ssnCursorResults.getStr(0);
									}
									ssnCursor.close();
									if ( !lvTemp.isNull() )
									{
										copy("Y","GLOBAL.MORE_THAN_ONE_SSN");
									}
									else {
										copy("N","GLOBAL.MORE_THAN_ONE_SSN");
									}
								}
								else {
									copy("N","GLOBAL.MORE_THAN_ONE_SSN");
								}
							}
						}
					}
					else {
						copy("N","GLOBAL.MORE_THAN_ONE_SSN");
					}
					//  -- --
					//  -- --      
					populateListGroup();
					// 
					if ( idCount.greater(1) )
					{
						if ( idCount.greaterOrEquals(lvMaxCnt) )
						{
							errorMessage(GNls.Fget(toStr("GOQRPLS-0068"), toStr("LIB"), toStr("*ERROR* Too many results returned. Search Limit=%01% Matches Found=%02%. Results are truncated. Please refine your search criteria."), toStr(lvMaxCnt), toStr(idCount)), OutputMessageUserResponse.ACKNOWLEDGE);
							// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize".
							//						SupportClasses.SQLFORMS.Synchronize();
							GIdnameSearch.this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize'.");
							
							
						}
						//populateList(srchListName, rgId);
						setLovGroupName(lovListName, toStr(rgId.getName()));
						copy("",idItem);
						copy("",nameItem);
						copy(toChar(idCount),srchCntName);
						// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
						//					SupportClasses.FORMS40.SetFormProperty(currentForm, SupportClasses.Property.VALIDATION, false);
						GIdnameSearch.this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
						
						
						clearExsearch();
					}
					else if ( idCount.equals(1) ) {
						lvFirstId = getGroupCharCell(rgName.append(".ID"), 1);
						lvFirstId = substring(lvFirstId, toInt(1), inStr(lvFirstId, toStr(",")).subtract(1));
						copy(lvFirstId,idItem);
						ItemDescriptor _item = findItem(idItem);
						if (_item != null)
							{
								_item.setToValidate(true);
							}
						goItem(idItem);
						getCurrentTask().getNavigationModel().doNavigation();
					}
					// 
					return idCount;
					}finally{
						ssnCursor.close();
					}
			}
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void copySelectedId()
		{
			NString result = getNameIn("IDNAME_EXTSEARCH_LIST");
			copy(((substring(result, toInt(1), inStr(result, toStr(",")).subtract(1)))),idItem);
			setItemIsValid(idItem, false);
			// 
			clearList("IDNAME_EXTSEARCH_LIST");
			clearBlock(TaskServices.NO_VALIDATE);
			// 
			copy("",nameItem);
			
			goItem(idItem);
			TaskServices.getCurrentTask().getNavigationModel().doNavigation();
			//  -- -- --
			disableExtSrchBlkOnExit();
			//  -- -- --
			hideWindow("G$_EXTENDED_SEARCH_WINDOW");
			// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize".
			//			SupportClasses.SQLFORMS.Synchronize();
			TaskServices.getCurrentTask().getNavigationModel().doFullNavigation();
			
			executeAction("WHEN-VALIDATE-ITEM");
			executeAction("POST-CHANGE");
			setItemEnabled(nameItem, false);
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void whenNewBlock()
		{
			// F2J_NOT_SUPPORTED : The property "FORM's VALIDATION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
			//			SupportClasses.FORMS40.SetFormProperty(currentForm, SupportClasses.Property.VALIDATION, true);
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'FORM's VALIDATION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
			
			
			// 
			setItemEnabled("PERSON_DETAIL_BTN", true);
			setItemEnabled("NPERSON_DETAIL_BTN", true);
			// 
			setRadioButtonEnabled("SEARCH_GROUP", "NONPERSON", true);
			setRadioButtonEnabled("SEARCH_GROUP", "BOTH", true);
			setRadioButtonEnabled("SEARCH_GROUP", "PERSON", true);
			// 
			copy(entityFlg,"SEARCH_GROUP");
			if ( entityFlg.equals("P") )
			{
				disableBtn(toStr("N"));
				disableRbtn(toStr("BOTH"));
				disableRbtn(toStr("NONPERSON"));
			}
			else if ( entityFlg.equals("C") ) {
				disableBtn(toStr(""));
				disableRbtn(toStr("BOTH"));
				disableRbtn(toStr("PERSON"));
			}
			// 
			goItem(toStr("IDNAME_EXTSEARCH_LIST"));
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void whenClearButtonPressed()
		{
			clearExsearch();
			narrowSearchGroup();
			goItem(toStr("IDNAME_EXTSEARCH_LIST"));
		}
/* <p>
		* 
		* 
/* </p>
		*/
		public void detailBtnPressed()
		{
			NInteger pos = inStr(getTriggerItem(), toStr("NPERSON"));
			NString callForm= NString.getNull();
			if ( pos.greater(0) )
			{
				callForm = toStr("COUNT_QUERY");
			}
			else {
				callForm = toStr("LIST_VALUES");
			}
			// 
			setGlobals();
			hideWindow("G$_EXTENDED_SEARCH_WINDOW");
			goItem(idItem);
			TaskServices.getCurrentTask().getNavigationModel().doNavigation();
			//  -- -- --
			disableExtSrchBlkOnExit();
			//  -- -- --
			clearMessage();
			// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13".
			//			SupportClasses.SQLFORMS.DoKey(callForm);
			//System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin13'.");
			executeAction(callForm);
			
			
			// 
			clearGlobals();
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void whenButtonPressed()
		{
			executeAction("G$_REVOKE_ACCESS");
			getContainer().gCheckFailure();
			getContainer().gSecuredFormCall(getUser(), toStr("GTVZIPC"), toStr(""));
			getContainer().gCheckFailure();
			copy(getNameIn("global.value"),"G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_ZIP");
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void whenNewItem()
		{
			NString itemName = getCursorItem();
			if ( itemName.equals("G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST") )
			{
				infoMessage(idHint, OutputMessageUserResponse.NO_ACKNOWLEDGE);
			}
		}
/* <p>
		* 
		* 
		*  -- -- --
		*  -- -- --
/* </p>
		*/
		public void enableExtSrchBlkOnEntry()
		{
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST", true);
			setItemNavigable("G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST", true);
			setItemNavigable("G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST", true);
			//  --
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SEARCH_GROUP", true);
			setItemNavigable("G$_EXTENDED_SEARCH_BLOCK.SEARCH_GROUP", true);
			// 
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_CITY", true);
			setItemNavigable("G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_CITY", true);
			// 
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_STAT_CODE", true);
			setItemNavigable("G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_STAT_CODE", true);
			// 
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_ZIP", true);
			setItemNavigable("G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_ZIP", true);
			// 
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPRIDEN_NTYP_CODE", true);
			setItemNavigable("G$_EXTENDED_SEARCH_BLOCK.SR_SPRIDEN_NTYP_CODE", true);
			// 
			if ( getItemVisible("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN").equals("TRUE") )
			{
				setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN", true);
				setItemNavigable("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN", true);
			}
			// 
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_BIRTH_DATE", true);
			setItemNavigable("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_BIRTH_DATE", true);
			// 
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SEX", true);
			setItemNavigable("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SEX", true);
		}
/* <p>
		*  --
		*  --
/* </p>
		*/
		public void disableExtSrchBlkOnExit()
		{
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.IDNAME_EXTSEARCH_LIST", false);
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SEARCH_GROUP", false);
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_CITY", false);
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_STAT_CODE", false);
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPRADDR_ZIP", false);
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPRIDEN_NTYP_CODE", false);
			if ( getItemVisible("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN").equals("TRUE") )
			{
				setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN", false);
			}
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_BIRTH_DATE", false);
			setItemEnabled("G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SEX", false);
		}
		
	
	
}
