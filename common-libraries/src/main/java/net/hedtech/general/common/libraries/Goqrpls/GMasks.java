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
import net.hedtech.general.common.forms.BaseTask;
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GMasks extends AbstractSupportCodeObject {
	

	public GMasks(ISupportCodeContainer container) {
		super(container);
		wasMaskingApplied = toBool(NBool.False);
		// 
		//  Build the record group which will hold the list of items which have been modified by the
		//  masking routines for this form.
		// 
		rgId = findGroup(rgName);
		if ( (rgId == null) )
		{
			rgId = createGroup(rgName);
			rgColId = addGroupColumn(rgId, "BLOCK_ITEM", ValueSetColumn.CHAR_COL, 61);
			rgColId2 = addGroupColumn(rgId, "GORDMSK_MASK_DIRECTION", ValueSetColumn.CHAR_COL, 1);
			rgColId3 = addGroupColumn(rgId, "GORDMSK_MASK_LENGTH", ValueSetColumn.NUMBER_COL);
		}
		rgRecNum = toInt(0);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_MASKS
	/*
	PACKAGE G$_MASKS IS
--
-- Public variable which is populated by the G$_STARTUP_MASK routine to determine if any
-- rules exist for this form.  It is then checked by the G$_STRING_MASK routine called from
-- the POST-QUERY trigger to determine if it needs to continue or not.
--
  GLOBAL_DO_RULES_EXIST VARCHAR2(1) := 'N';
--
-- Procedures for applying masks from GORDMSK at start up of form apply item properties 
-- for data masks for dates and numbers, turn visibility off or turn conceal data on.
-- The G$_STARTUP_MASKS is executed in the G$_FORM_STARTUP
--
  PROCEDURE G$_STARTUP_MASK (p_form_name VARCHAR2);
--
  PROCEDURE G$_APPLY_STARTUP_MASK (p_display_ind    gordmsk.gordmsk_display_ind%TYPE,
                                   p_conceal_ind    gordmsk.gordmsk_conceal_ind%TYPE,
                                   p_mask           gordmsk.gordmsk_data_mask%TYPE,
                                   p_mask_direction gordmsk.gordmsk_mask_direction%TYPE,
                                   p_mask_length    gordmsk.gordmsk_mask_length%TYPE,
                                   p_item_name      VARCHAR2,
                                   p_block_name     gordmsk.gordmsk_block_name%TYPE);
--
-- Procedures for apply string masks. These happen after the data is queried.  The string 
-- data is physically altered to partially conceal data.
--
  PROCEDURE G$_STRING_MASKS (p_form_name      VARCHAR2,
                             p_block_name     gordmsk.gordmsk_block_name%TYPE,
                             p_column_name    gordmsk.gordmsk_column_name%TYPE DEFAULT NULL,
                             p_record_number  VARCHAR2 DEFAULT NULL);
--
  PROCEDURE G$_APPLY_STRING_MASKS (p_block_name  VARCHAR2,
                                   p_item_name   VARCHAR2 DEFAULT NULL,
                                   p_query_item  VARCHAR2 DEFAULT NULL,
                                   p_mask        gordmsk.gordmsk_data_mask%TYPE);
--
-- Function to determine whether any masking rules were applied to this item.
--
  FUNCTION G$_WAS_MASKING_APPLIED (p_form_name   gordmsk.gordmsk_objs_code%TYPE,
                                   p_block_name  gordmsk.gordmsk_block_name%TYPE,
                                   p_item_name   gordmsk.gordmsk_column_name%TYPE) RETURN BOOLEAN;
--
-- Function to determine whether the masks actually restricted access or not
--
  FUNCTION G$_DID_MASK_RESTRICT (p_form_name  gordmsk.gordmsk_objs_code%TYPE,
                                 p_block_name gordmsk.gordmsk_block_name%TYPE,
                                 p_item_name  gordmsk.gordmsk_column_name%TYPE,
                                 p_debug      VARCHAR2 DEFAULT 'N') 
         RETURN VARCHAR2;
                                   
END;
	*/
	
			// 
		//  Public variable which is populated by the G$_STARTUP_MASK routine to determine if any
		//  rules exist for this form.  It is then checked by the G$_STRING_MASK routine called from
		//  the POST-QUERY trigger to determine if it needs to continue or not.
		// 
		public NString globalDoRulesExist = toStr("N");

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_MASKS
		/*
		PACKAGE BODY G$_MASKS IS
--
  WAS_MASKING_APPLIED BOOLEAN;
--
  gv_curr_blk         VARCHAR2(30);
  gv_curr_item        VARCHAR2(61);
  gv_first_nav_item   VARCHAR2(61);
  gv_last_item        VARCHAR2(61);
  gv_which_item       VARCHAR2(61);
--
  rg_name             VARCHAR2(30) := 'MASKING_LIST';
  rg_id               RECORDGROUP;
  rg_col_id           GROUPCOLUMN;
  rg_col_id2          GROUPCOLUMN;
  rg_col_id3          GROUPCOLUMN;
  rg_col_val          VARCHAR2(61);
  rg_rec_cnt          INTEGER(3) := 0;
  rg_rec_num          INTEGER(3) := 0;
--
-- Private procedure to apply needed changes in order to conceal the value of an item.
--
  PROCEDURE G$_DO_CONCEAL (p_blk_name VARCHAR2, p_itm_name VARCHAR2) IS
  BEGIN
    IF GET_ITEM_PROPERTY(p_itm_name,CONCEAL_DATA) = 'FALSE' THEN
      SET_ITEM_PROPERTY(p_itm_name,CONCEAL_DATA, PROPERTY_TRUE);
--
      IF GET_ITEM_PROPERTY(p_itm_name,QUERYABLE) = 'TRUE' THEN
        SET_ITEM_PROPERTY(p_itm_name,QUERYABLE, PROPERTY_FALSE);
      END IF;
--
      IF GET_ITEM_PROPERTY(p_itm_name,ENABLED) = 'TRUE' THEN
        SET_ITEM_PROPERTY(p_itm_name,ENABLED, PROPERTY_FALSE);
      END IF;
--
    END IF;
  END;
--
-- Procedure called from g$_form_startup to change visibility, conceal data and/or apply
-- date/number format mask item properties.
--
  PROCEDURE G$_STARTUP_MASK (p_form_name VARCHAR2) IS
    lv_data_column   VARCHAR2(65) := '';
    lv_gordmsk_row   GORDMSK%ROWTYPE;
    lv_user          VARCHAR2(30) := NAME_IN('GLOBAL.CURRENT_USER');
--
    CURSOR do_rules_exist (cp_form VARCHAR2)IS
      SELECT 'Y' FROM DUAL
       WHERE EXISTS
           (SELECT 'Y' FROM gordmsk
             WHERE gordmsk_objs_code = cp_form);
--
    CURSOR gordmsk_all_users_c (cp_form VARCHAR2, cp_user VARCHAR2) IS
      SELECT *
        FROM GORDMSK X
       WHERE X.GORDMSK_ALL_USER_IND = 'Y'
         AND X.GORDMSK_OBJS_CODE = cp_form
         AND NOT EXISTS
             (SELECT 'X'
                FROM GORDMSK Y
               WHERE Y.GORDMSK_OBJS_CODE = X.GORDMSK_OBJS_CODE
                 AND Y.GORDMSK_BLOCK_NAME = X.GORDMSK_BLOCK_NAME
                 AND Y.GORDMSK_COLUMN_NAME = X.GORDMSK_COLUMN_NAME
                 AND Y.GORDMSK_ALL_USER_IND <> 'Y'
                 AND Y.GORDMSK_FBPR_CODE IS NULL
                 AND Y.GORDMSK_FGAC_USER_ID = cp_user)
         AND NOT EXISTS
             (SELECT 'X'
                FROM GORFBPR, GORDMSK Z
               WHERE Z.GORDMSK_OBJS_CODE = X.GORDMSK_OBJS_CODE
                 AND Z.GORDMSK_BLOCK_NAME = X.GORDMSK_BLOCK_NAME
                 AND Z.GORDMSK_COLUMN_NAME = X.GORDMSK_COLUMN_NAME
                 AND Z.GORDMSK_ALL_USER_IND <> 'Y'
                 AND GORFBPR_FBPR_CODE = Z.GORDMSK_FBPR_CODE
                 AND GORFBPR_FGAC_USER_ID = cp_user)
       ORDER BY X.GORDMSK_BLOCK_NAME;
--
    CURSOR gordmsk_fbpr_c (cp_form VARCHAR2, cp_user VARCHAR2) IS
      SELECT O.*
        FROM GORFBPR, GORDMSK O
       WHERE GORDMSK_OBJS_CODE = cp_form
         AND GORDMSK_FBPR_CODE IS NOT NULL
         and GORDMSK_FBPR_CODE = GORFBPR_FBPR_CODE
         and GORFBPR_FGAC_USER_ID = cp_user
         AND NOT EXISTS
            (SELECT 'X'
               FROM GORDMSK Y
              WHERE Y.GORDMSK_OBJS_CODE = O.GORDMSK_OBJS_CODE
                AND Y.GORDMSK_BLOCK_NAME = O.GORDMSK_BLOCK_NAME
                AND Y.GORDMSK_COLUMN_NAME = O.GORDMSK_COLUMN_NAME
                AND Y.GORDMSK_ALL_USER_IND <> 'Y'
                AND Y.GORDMSK_FBPR_CODE IS NULL
                AND Y.GORDMSK_FGAC_USER_ID = cp_user)
       ORDER BY O.GORDMSK_BLOCK_NAME;
--
    CURSOR gordmsk_fgac_users_c (cp_form VARCHAR2, cp_user VARCHAR2) IS
      SELECT * 
        FROM GORDMSK
       WHERE GORDMSK_OBJS_CODE = cp_form
         AND GORDMSK_FGAC_USER_ID = cp_user
       ORDER BY GORDMSK_BLOCK_NAME;
--  
  BEGIN
--
-- Verify that rules exist for this form
--
    OPEN do_rules_exist(p_form_name);
    FETCH do_rules_exist INTO GLOBAL_DO_RULES_EXIST;
    CLOSE do_rules_exist;
--
    IF NVL(GLOBAL_DO_RULES_EXIST,'N') = 'N' THEN
      GLOBAL_DO_RULES_EXIST := 'N';
      RETURN;
    END IF;
--
-- Set item properties for all users 
--
    OPEN gordmsk_all_users_c(p_form_name,lv_user);
    LOOP
      FETCH gordmsk_all_users_c INTO lv_gordmsk_row; 
      EXIT WHEN gordmsk_all_users_c%NOTFOUND;
--
      lv_data_column := lv_gordmsk_row.gordmsk_block_name || '.' ||
                                   lv_gordmsk_row.gordmsk_column_name; 
--
-- -- --
-- if the block_name is equal to the block_comp_name and the column_name is equal to the column_comp_name then this
-- is considered a masking rule for the Horizon application and not for INB 
      IF NOT (NVL(lv_gordmsk_row.gordmsk_block_name,'XOXOXO')  = NVL(lv_gordmsk_row.gordmsk_block_comp_name,'XOXOXO') AND
      	      NVL(lv_gordmsk_row.gordmsk_column_name,'XOXOXO') = NVL(lv_gordmsk_row.gordmsk_column_comp_name,'XOXOXO')) THEN
        G$_APPLY_STARTUP_MASK(lv_gordmsk_row.gordmsk_display_ind,
                              lv_gordmsk_row.gordmsk_conceal_ind,
                              lv_gordmsk_row.gordmsk_data_mask,
                              lv_gordmsk_row.gordmsk_mask_direction,
                              lv_gordmsk_row.gordmsk_mask_length,
                              lv_data_column,
                              lv_gordmsk_row.gordmsk_block_name);
      END IF;
--
    END LOOP;
    CLOSE gordmsk_all_users_c;  
--
-- Set item properties for the business profile
--
    lv_data_column := ''; 
    OPEN gordmsk_fbpr_c(p_form_name,lv_user);
    LOOP
      FETCH gordmsk_fbpr_c INTO lv_gordmsk_row; 
      EXIT WHEN gordmsk_fbpr_c%NOTFOUND;
--
      lv_data_column := lv_gordmsk_row.gordmsk_block_name || '.' ||
                                   lv_gordmsk_row.gordmsk_column_name;
--
-- -- --
-- if the block_name is equal to the block_comp_name and the column_name is equal to the column_comp_name then this
-- is considered a masking rule for the Horizon application and not for INB 
      IF NOT (NVL(lv_gordmsk_row.gordmsk_block_name,'XOXOXO')  = NVL(lv_gordmsk_row.gordmsk_block_comp_name,'XOXOXO') AND
      	      NVL(lv_gordmsk_row.gordmsk_column_name,'XOXOXO') = NVL(lv_gordmsk_row.gordmsk_column_comp_name,'XOXOXO')) THEN
        G$_APPLY_STARTUP_MASK(lv_gordmsk_row.gordmsk_display_ind,
                              lv_gordmsk_row.gordmsk_conceal_ind,
                              lv_gordmsk_row.gordmsk_data_mask,
                              lv_gordmsk_row.gordmsk_mask_direction,
                              lv_gordmsk_row.gordmsk_mask_length,
                              lv_data_column,
                              lv_gordmsk_row.gordmsk_block_name);
      END IF;
--
    END LOOP;
    CLOSE gordmsk_fbpr_c;
--
-- Set item properties for the user
--
    lv_data_column := '';
    OPEN gordmsk_fgac_users_c(p_form_name,lv_user);
    LOOP
      FETCH gordmsk_fgac_users_c INTO lv_gordmsk_row;
      EXIT WHEN gordmsk_fgac_users_c%NOTFOUND;
--
      lv_data_column := lv_gordmsk_row.gordmsk_block_name || '.' ||
          	                   lv_gordmsk_row.gordmsk_column_name;
--
-- -- --
-- if the block_name is equal to the block_comp_name and the column_name is equal to the column_comp_name then this
-- is considered a masking rule for the Horizon application and not for INB 
      IF NOT (NVL(lv_gordmsk_row.gordmsk_block_name,'XOXOXO')  = NVL(lv_gordmsk_row.gordmsk_block_comp_name,'XOXOXO') AND
      	      NVL(lv_gordmsk_row.gordmsk_column_name,'XOXOXO') = NVL(lv_gordmsk_row.gordmsk_column_comp_name,'XOXOXO')) THEN
        G$_APPLY_STARTUP_MASK(lv_gordmsk_row.gordmsk_display_ind,
                              lv_gordmsk_row.gordmsk_conceal_ind,
                              lv_gordmsk_row.gordmsk_data_mask,
                              lv_gordmsk_row.gordmsk_mask_direction,
                              lv_gordmsk_row.gordmsk_mask_length,
                              lv_data_column,
                              lv_gordmsk_row.gordmsk_block_name);
      END IF;
--
    END LOOP;
    CLOSE gordmsk_fgac_users_c; 
--
  END G$_STARTUP_MASK;
--
-- Set item properties during form startup
--
  PROCEDURE G$_APPLY_STARTUP_MASK (p_display_ind    gordmsk.gordmsk_display_ind%TYPE,
                                   p_conceal_ind    gordmsk.gordmsk_conceal_ind%TYPE,
                                   p_mask           gordmsk.gordmsk_data_mask%TYPE,
                                   p_mask_direction gordmsk.gordmsk_mask_direction%TYPE,
                                   p_mask_length    gordmsk.gordmsk_mask_length%TYPE,
                                   p_item_name      VARCHAR2,
                                   p_block_name     gordmsk.gordmsk_block_name%TYPE) IS
--
    lv_item_canvas VARCHAR2(30) := '';
    lv_item_type   VARCHAR2(30) := GET_ITEM_PROPERTY(p_item_name,ITEM_TYPE);
  BEGIN
    WAS_MASKING_APPLIED := TRUE;
  	ADD_GROUP_ROW(rg_id,END_OF_GROUP);
    rg_rec_num := rg_rec_num + 1;
  	SET_GROUP_CHAR_CELL(rg_col_id,rg_rec_num,p_item_name);
  	SET_GROUP_CHAR_CELL(rg_col_id2,rg_rec_num,p_mask_direction);
  	SET_GROUP_NUMBER_CELL(rg_col_id3,rg_rec_num,p_mask_length);
--
-- Turn visible off
--
    IF p_display_ind = 'N' THEN
      IF GET_ITEM_PROPERTY(p_item_name,VISIBLE) = 'TRUE' THEN
        SET_ITEM_PROPERTY(p_item_name,VISIBLE,PROPERTY_FALSE);
        RETURN;
      END IF;
--
-- Make the item visible and apply other settings.
--
    ELSE
      IF GET_ITEM_PROPERTY(p_item_name,VISIBLE) = 'FALSE' THEN
        lv_item_canvas := GET_ITEM_PROPERTY(p_item_name,ITEM_CANVAS);
--
        IF NVL(lv_item_canvas,'TEMP_CANVAS') NOT IN ('TEMP_CANVAS') THEN
          SET_ITEM_PROPERTY(p_item_name,VISIBLE,PROPERTY_TRUE);
--
          CASE lv_item_type
            WHEN 'CHART ITEM'   THEN NULL;
            WHEN 'DISPLAY ITEM' THEN NULL;
            WHEN 'IMAGE'        THEN NULL;
            WHEN 'USER AREA'    THEN NULL;
            WHEN 'BUTTON'       THEN
              SET_ITEM_PROPERTY(p_item_name,ENABLED,        PROPERTY_TRUE);
              SET_ITEM_PROPERTY(p_item_name,NAVIGABLE,      PROPERTY_TRUE);
            ELSE 
              SET_ITEM_PROPERTY(p_item_name,ENABLED,        PROPERTY_TRUE);
              SET_ITEM_PROPERTY(p_item_name,NAVIGABLE,      PROPERTY_TRUE);
              SET_ITEM_PROPERTY(p_item_name,INSERT_ALLOWED, PROPERTY_TRUE);
              SET_ITEM_PROPERTY(p_item_name,UPDATE_ALLOWED, PROPERTY_TRUE);
              SET_ITEM_PROPERTY(p_item_name,QUERYABLE,      PROPERTY_TRUE);     	
          END CASE;
--
        END IF;
      END IF;
    END IF;
--
-- If this is valid for the item type.
--
    IF lv_item_type = 'TEXT ITEM' THEN
-- 
-- Conceal data if visibility is turned on
--
      IF GET_ITEM_PROPERTY(p_item_name,VISIBLE) = 'TRUE' THEN
        IF p_conceal_ind = 'N' THEN
          IF GET_ITEM_PROPERTY(p_item_name,CONCEAL_DATA) = 'TRUE' THEN
            SET_ITEM_PROPERTY(p_item_name,CONCEAL_DATA,PROPERTY_FALSE);
          END IF;
        ELSE
          G$_DO_CONCEAL(p_block_name,p_item_name);
        END IF;
--
      END IF;
--
-- Set item format mask properties for numbers, dates set the item to non updateable 
-- if the format mask is applied, cannot unapply a format mask, if its overridden in 
-- an all user, or for a profile and you want to change it to the original, you need to 
-- reapply the original mask
--          
      IF GET_ITEM_PROPERTY(p_item_name,VISIBLE) = 'TRUE' AND
         GET_ITEM_PROPERTY(p_item_name,CONCEAL_DATA) = 'FALSE' AND
         p_mask IS NOT NULL THEN
--
-- For date and number types
--
        IF GET_ITEM_PROPERTY(p_item_name,DATATYPE) NOT IN ('CHAR','LONG') THEN
          SET_ITEM_PROPERTY(p_item_name,FORMAT_MASK,p_mask);
        END IF;
--
        SET_ITEM_PROPERTY(p_item_name,QUERYABLE,PROPERTY_FALSE);
        SET_ITEM_PROPERTY(p_item_name,QUERY_ONLY);
--
        IF GET_BLOCK_PROPERTY(p_block_name,INSERT_ALLOWED) = 'TRUE' OR
           GET_BLOCK_PROPERTY(p_block_name,UPDATE_ALLOWED) = 'TRUE' THEN
          SET_ITEM_PROPERTY(p_item_name,INSERT_ALLOWED, PROPERTY_FALSE);
          SET_ITEM_PROPERTY(p_item_name,UPDATE_ALLOWED, PROPERTY_FALSE);
        ELSE
          IF GET_ITEM_PROPERTY(p_item_name,INSERT_ALLOWED) = 'TRUE' OR
             GET_ITEM_PROPERTY(p_item_name,UPDATE_ALLOWED) = 'TRUE' THEN
            SET_ITEM_PROPERTY(p_item_name,INSERT_ALLOWED, PROPERTY_FALSE);
            SET_ITEM_PROPERTY(p_item_name,UPDATE_ALLOWED, PROPERTY_FALSE);
          END IF;
        END IF;
      END IF;
-- --
-- --      
      IF GET_ITEM_PROPERTY(p_item_name,VISIBLE) = 'TRUE' AND
         GET_ITEM_PROPERTY(p_item_name,CONCEAL_DATA) = 'FALSE' AND
         p_mask IS NULL AND
         p_mask_direction IS NOT NULL THEN
-- --
-- -- The following line will set the TOOLTIP_TEXT for an item to an R or L and a length
-- -- For example:  L=4   or R=11
-- -- There is an implementation class on items that will then use this TOOLTIP_TEXT value to
-- -- partially mask the chracter item display
        SET_ITEM_PROPERTY(p_item_name,TOOLTIP_TEXT,p_mask_direction||'='||TO_CHAR(p_mask_length));  

        IF GET_ITEM_PROPERTY(p_item_name,QUERYABLE) = 'TRUE' THEN
          SET_ITEM_PROPERTY(p_item_name,QUERYABLE, PROPERTY_FALSE);
        END IF;
        IF GET_ITEM_PROPERTY(p_item_name,ENABLED) = 'TRUE' THEN
          SET_ITEM_PROPERTY(p_item_name,ENABLED, PROPERTY_FALSE);
        END IF;  
      END IF;
-- -- 
-- --
    END IF;
--
  END G$_APPLY_STARTUP_MASK;
--
--  string masks: this procedure is called from a blocks post query
--
  PROCEDURE G$_STRING_MASKS (p_form_name      VARCHAR2,
                             p_block_name     gordmsk.gordmsk_block_name%TYPE,
                             p_column_name    gordmsk.gordmsk_column_name%TYPE DEFAULT NULL,
                             p_record_number  VARCHAR2 DEFAULT NULL) IS
--
    lv_dmsk_column        gordmsk.gordmsk_column_name%TYPE;
    lv_format_mask        gordmsk.gordmsk_data_mask%TYPE;           
    lv_dmcl_query         gordmcl.gordmcl_query_column%TYPE;
    lv_cnt_applied        NUMBER := 0;
    lv_data_column        VARCHAR2(65) := NULL; 
    lv_query_column       VARCHAR2(65) := NULL;
    lv_initial_rec_status VARCHAR2(30) := NULL; 
    lv_user               VARCHAR2(30) := NAME_IN('GLOBAL.CURRENT_USER');
--
    CURSOR gordmsk_all_users_c IS
      SELECT gordmsk_data_mask, gordmsk_column_name, gordmcl.gordmcl_query_column
        FROM gordmcl, gordmsk
       WHERE gordmcl_objs_code = gordmsk_objs_code
         AND gordmcl_block_name = gordmsk_block_name
         AND gordmcl_column_name = gordmsk_column_name
         AND gordmcl_data_type_cde = 'C'
         AND gordmsk_objs_code = p_form_name
         AND gordmsk_block_name = p_block_name
         AND gordmsk_column_name = NVL(p_column_name,gordmsk_column_name)
         AND gordmsk_all_user_ind = 'Y'
         AND gordmsk_data_mask IS NOT NULL;
--
    CURSOR gordmsk_fgac_users_c IS
      SELECT gordmsk_data_mask, gordmsk_column_name, gordmcl.gordmcl_query_column
        FROM gordmcl, gordmsk
       WHERE gordmcl_objs_code = gordmsk_objs_code
         AND gordmcl_block_name = gordmsk_block_name
         AND gordmcl_column_name = gordmsk_column_name
         AND gordmcl_data_type_cde = 'C'
         AND gordmsk_objs_code = p_form_name
         AND gordmsk_block_name = p_block_name
         AND gordmsk_column_name = NVL(p_column_name,gordmsk_column_name)
         AND gordmsk_fgac_user_id = lv_user
         AND gordmsk_data_mask IS NOT NULL;
--
    CURSOR gordmsk_fbpr_c IS
      SELECT gordmsk_data_mask, gordmsk_column_name, gordmcl.gordmcl_query_column 
        FROM gorfbpr, gordmcl, gordmsk
       WHERE gordmcl_objs_code = gordmsk_objs_code
         AND gordmcl_block_name = gordmsk_block_name
         AND gordmcl_column_name = gordmsk_column_name
         AND gordmcl_data_type_cde = 'C'
         AND gordmsk_objs_code = p_form_name
         AND gordmsk_block_name = p_block_name
         AND gordmsk_column_name = NVL(p_column_name,gordmsk_column_name)
         AND gordmsk_fbpr_code = gorfbpr_fbpr_code
         AND gorfbpr_fgac_user_id = lv_user
         AND gordmsk_data_mask IS NOT NULL;
--
  BEGIN
    IF NVL(GLOBAL_DO_RULES_EXIST,'N') = 'N' THEN
      RETURN;
    END IF;
--
    lv_initial_rec_status := GET_RECORD_PROPERTY(p_record_number, p_block_name, STATUS); 
--
-- Set item properties for all users 
--
    lv_data_column := '';
    OPEN gordmsk_all_users_c;
    LOOP
      FETCH gordmsk_all_users_c INTO lv_format_mask, lv_dmsk_column, lv_dmcl_query;
      EXIT WHEN gordmsk_all_users_c%NOTFOUND;
 --
      lv_data_column := p_block_name || '.' || lv_dmsk_column;
      lv_query_column := '';
--
      IF lv_dmcl_query IS NOT NULL THEN
        lv_query_column := p_block_name || '.' || lv_dmcl_query;
      END IF;
--
-- Masking on string data allowed only if the datatype is char or long, and update and 
-- insert are not allowed
--
      G$_APPLY_STRING_MASKS(p_block_name, lv_data_column, lv_query_column, lv_format_mask);
      lv_cnt_applied := lv_cnt_applied + 1;
--
    END LOOP;
    CLOSE gordmsk_all_users_c;
--
-- Set item properties for the business profile
--
    lv_data_column := '';
    OPEN gordmsk_fbpr_c;
    LOOP
      FETCH gordmsk_fbpr_c into lv_format_mask, lv_dmsk_column, lv_dmcl_query;
      EXIT WHEN gordmsk_fbpr_c%NOTFOUND;
--
      lv_data_column := p_block_name || '.' || lv_dmsk_column;
      lv_query_column := '';
--
      IF lv_dmcl_query IS NOT NULL THEN
        lv_query_column := p_block_name || '.' || lv_dmcl_query;
      END IF;
--
      G$_APPLY_STRING_MASKS(p_block_name, lv_data_column, lv_query_column, lv_format_mask);
      lv_cnt_applied := lv_cnt_applied + 1;
--
    END LOOP;
    CLOSE gordmsk_fbpr_c;
--
-- Set item properties for the user 
--
    lv_data_column := ''; 
    OPEN gordmsk_fgac_users_c;
    LOOP
      FETCH gordmsk_fgac_users_c into lv_format_mask, lv_dmsk_column, lv_dmcl_query;
      EXIT WHEN gordmsk_fgac_users_c%NOTFOUND;
--
      lv_data_column := p_block_name||'.'||lv_dmsk_column;
      lv_query_column := '';
--
      IF lv_dmcl_query IS NOT NULL THEN
        lv_query_column := p_block_name || '.' || lv_dmcl_query;
      END IF;
--
      G$_APPLY_STRING_MASKS(p_block_name, lv_data_column, lv_query_column, lv_format_mask);
      lv_cnt_applied := lv_cnt_applied + 1;
--
    END LOOP;
    CLOSE gordmsk_fgac_users_c;
-- 
    IF lv_cnt_applied > 0 AND lv_initial_rec_status = 'QUERY' THEN
      SET_RECORD_PROPERTY(p_record_number, p_block_name, STATUS, QUERY_STATUS);
    END IF;
--
  END G$_STRING_MASKS;
--
-- Call the gokfgac function to alter the data 
--
  PROCEDURE G$_APPLY_STRING_MASKS (p_block_name  VARCHAR2,
                                   p_item_name   VARCHAR2 DEFAULT NULL,
                                   p_query_item  VARCHAR2 DEFAULT NULL,
                                   p_mask        gordmsk.gordmsk_data_mask%TYPE) IS
--
   lv_temp_column        VARCHAR2(150) := '';
   lv_reformated_column  VARCHAR2(150) := '';
 BEGIN
--
-- The query column is the database column, and the item name is the non database
-- column.  If you write the formated data into the database column, the form will
-- think you are updating the database
--
    IF GET_ITEM_PROPERTY(p_item_name,DATATYPE) IN ('CHAR','LONG') AND
       GET_ITEM_PROPERTY(p_item_name,VISIBLE) = 'TRUE' AND
       GET_ITEM_PROPERTY(p_item_name,CONCEAL_DATA) = 'FALSE' THEN
--
      IF p_query_item IS NOT NULL THEN
        lv_temp_column := NAME_IN(p_query_item);
      ELSE
        lv_temp_column := NAME_IN(p_item_name);
      END IF;
--
      lv_reformated_column := gokfgac.f_format_data(p_mask,lv_temp_column);
      COPY(lv_reformated_column, p_item_name);
      SET_ITEM_PROPERTY(p_item_name, QUERYABLE, PROPERTY_FALSE);
--
      IF GET_BLOCK_PROPERTY(p_block_name, INSERT_ALLOWED) = 'TRUE' OR
         GET_BLOCK_PROPERTY(p_block_name, UPDATE_ALLOWED) = 'TRUE' THEN
        SET_ITEM_PROPERTY(p_item_name, INSERT_ALLOWED, PROPERTY_FALSE);
        SET_ITEM_PROPERTY(p_item_name, UPDATE_ALLOWED, PROPERTY_FALSE);
      ELSE
        IF GET_ITEM_PROPERTY(p_item_name, INSERT_ALLOWED) = 'TRUE' OR
           GET_ITEM_PROPERTY(p_item_name, UPDATE_ALLOWED) = 'TRUE' THEN
          SET_ITEM_PROPERTY(p_item_name, INSERT_ALLOWED, PROPERTY_FALSE);
          SET_ITEM_PROPERTY(p_item_name, UPDATE_ALLOWED, PROPERTY_FALSE);
        END IF;
      END IF;
--
    END IF;
  END G$_APPLY_STRING_MASKS;
--
-- Function to determine whether any masking rules were applied to this item.
--
  FUNCTION G$_WAS_MASKING_APPLIED (p_form_name  gordmsk.gordmsk_objs_code%TYPE,
                                   p_block_name gordmsk.gordmsk_block_name%TYPE,
                                   p_item_name  gordmsk.gordmsk_column_name%TYPE) RETURN BOOLEAN IS
  BEGIN
--
-- If the switch is not set, then return without searching any further.
--
    IF NOT WAS_MASKING_APPLIED THEN
      RETURN(FALSE);
    END IF;
--
-- Scan through the list looking for this item.
--
    rg_rec_cnt := GET_GROUP_ROW_COUNT(rg_id);
    FOR i IN 1..rg_rec_cnt LOOP
    	rg_col_val := GET_GROUP_CHAR_CELL(rg_col_id,i);
--
      IF rg_col_val = UPPER(p_block_name) || '.' || UPPER(p_item_name) THEN
        RETURN(TRUE);
      END IF;
    END LOOP;
--
	  RETURN(FALSE);
END G$_WAS_MASKING_APPLIED;
--
--
-- This function is similar to G$_WAS_MASKING_APPLIED, but will return the type of
-- masking that was applied. If a GORDMSK rule exists, but the only rule applied is
-- to have the 'Display' indicator checked, G$_WAS_MASKING_APPLIED will return a true.
-- This routine will indicate whether the value was really masked or not (i.e. if the 
-- 'Display' indicator is checked, then there really isn't any true masking so an 'N'
-- would be returned.
--
--   Return  Was Value   Type of
--   Value   Restricted  Restriction
--   ------  ----------  ---------------------------------------------------
--   YI      Yes         Invisible (i.e. display=N)
--   YC      Yes         CONCEAL
--   YLnnn   Yes         Masked from the left for nnn characters
--   YRnnn   Yes         Masked from the right for nnn characters
--   YFxxx   Yes         Masked with an override format equal to xxx
--   N       No          No concealing, formating, or partial character mask
--   ?       Unknown     Some other masking combination
--
FUNCTION G$_DID_MASK_RESTRICT (p_form_name  gordmsk.gordmsk_objs_code%TYPE,
                               p_block_name gordmsk.gordmsk_block_name%TYPE,
                               p_item_name  gordmsk.gordmsk_column_name%TYPE,
                               p_debug      VARCHAR2 DEFAULT 'N') 
         RETURN VARCHAR2 IS
    lv_user            VARCHAR2(30) := NAME_IN('GLOBAL.CURRENT_USER');
    lv_gordmsk         gordmsk%ROWTYPE;
    lv_return          VARCHAR2(200);
--
-- Since we are looking at one column at a time, we only need to worry about one rule. There may be multiple
-- rules but the order will return the one we need first - we can ignore all the others.
-- The order will return any user specific entries first, then any business groups the user is in (alphabetically),
-- and then followed by all users set to Y and then all users set to N. If no rule is found then the
-- field is assumed to be displayed with no masking.
--
    CURSOR get_rule_c (form_in VARCHAR2, block_in VARCHAR2, item_in VARCHAR2, user_in VARCHAR2) IS
      SELECT *
             -- gordmsk_display_ind,gordmsk_all_user_ind, gordmsk_fbpr_code, gordmsk_fgac_user_id,
             -- gordmcl_objs_code, gordmcl_block_name, gordmcl_column_name, gordmcl_query_column
        FROM gordmsk
       WHERE gordmsk_objs_code   = form_in
         AND gordmsk_block_name  = block_in
         AND gordmsk_column_name = item_in
         AND (gordmsk_fgac_user_id IS NULL OR gordmsk_fgac_user_id = user_in)
         AND (gordmsk_fbpr_code    IS NULL OR gordmsk_fbpr_code IN (SELECT gorfbpr_fbpr_code FROM gorfbpr
                                                                     WHERE gorfbpr_fgac_user_id = user_in))
        ORDER BY gordmsk_fgac_user_id, gordmsk_fbpr_code, gordmsk_all_user_ind DESC ;
--
BEGIN
--
-- If there were no masking rules, then just return 'N'
--
    IF NOT G$_MASKS.G$_WAS_MASKING_APPLIED (p_form_name, p_block_name, p_item_name) THEN
      IF p_debug = 'Y' THEN
        MESSAGE (G$_NLS.Get('GOQRPLS-0076','LIB', 'No masking rules have been applied'));
      END IF;
    	RETURN 'N';
    END IF;
--
-- If there were masking rules, we have to check and see if the rule actually masked, or
-- if it was only the DISPLAY indicator that was set.
--
    OPEN get_rule_c(p_form_name, p_block_name, p_item_name, lv_user);
    FETCH get_rule_c INTO lv_gordmsk;
    IF get_rule_c%NOTFOUND then
      IF p_debug = 'Y' THEN
        MESSAGE (G$_NLS.Get('GOQRPLS-0077','LIB', 'No GORDMSK rows found'));
      END IF;
      RETURN 'N';
    END IF;
    CLOSE get_rule_c;
--
    IF lv_gordmsk.gordmsk_conceal_ind = 'Y' THEN
    	lv_return := 'YC';
    ELSIF lv_gordmsk.gordmsk_data_mask IS NOT NULL THEN
    	lv_return := 'Y'||lv_gordmsk.gordmsk_data_mask;
    ELSIF lv_gordmsk.gordmsk_mask_direction in ('L','R') and lv_gordmsk.gordmsk_mask_length > 0 THEN
    	lv_return := 'Y'||lv_gordmsk.gordmsk_mask_direction||lv_gordmsk.gordmsk_mask_length;
    ELSIF lv_gordmsk.gordmsk_display_ind = 'N' THEN
    	lv_return := 'YI';
    ELSIF lv_gordmsk.gordmsk_display_ind = 'Y' THEN
    	lv_return := 'N';
    ELSE
    	lv_return := '?';
    END IF;
--
    IF p_debug = 'Y' THEN
      MESSAGE (SUBSTR(G$_NLS.Get('GOQRPLS-0078','LIB',
                            'Form:%01% Block:%02% Item:%03% User:%04% Returns:%05%',
                            p_form_name, p_block_name, p_item_name, lv_user, lv_return),
                      1,180));
      MESSAGE (SUBSTR(G$_NLS.Get('GOQRPLS-0079','LIB',
                            'All User:%01% BusProf:%02% User:%03% Mask:%04% PartialMask:%05% Display:%06% Conceal:%07%',
                            lv_gordmsk.gordmsk_all_user_ind, lv_gordmsk.gordmsk_fbpr_code,
                            lv_gordmsk.gordmsk_fgac_user_id, lv_gordmsk.gordmsk_data_mask,
                            lv_gordmsk.gordmsk_mask_direction||lv_gordmsk.gordmsk_mask_length,
                            lv_gordmsk.gordmsk_display_ind, lv_gordmsk.gordmsk_conceal_ind),
                      1,180));
    END IF;
--
    RETURN lv_return;
--
END G$_DID_MASK_RESTRICT;
--
--
BEGIN
  WAS_MASKING_APPLIED := FALSE;
--
-- Build the record group which will hold the list of items which have been modified by the
-- masking routines for this form.
--
  rg_id := FIND_GROUP(rg_name);
  IF ID_NULL(rg_id) THEN
    rg_id := CREATE_GROUP(rg_name);
  	rg_col_id  := ADD_GROUP_COLUMN(rg_id,'BLOCK_ITEM',CHAR_COLUMN,61);
  	rg_col_id2 := ADD_GROUP_COLUMN(rg_id,'GORDMSK_MASK_DIRECTION',CHAR_COLUMN,1);
  	rg_col_id3 := ADD_GROUP_COLUMN(rg_id,'GORDMSK_MASK_LENGTH',NUMBER_COLUMN);
  END IF;
  rg_rec_num := 0;
--
END;
		*/
				// 
		private NBool wasMaskingApplied= NBool.getNull();
		// 
		private NString gvCurrBlk= NString.getNull();
		private NString gvCurrItem= NString.getNull();
		private NString gvFirstNavItem= NString.getNull();
		private NString gvLastItem= NString.getNull();
		private NString gvWhichItem= NString.getNull();
		// 
		private NString rgName = toStr("MASKING_LIST");
		private ValueSet rgId= null;
		private ValueSetColumn rgColId= null;
		private ValueSetColumn rgColId2= null;
		private ValueSetColumn rgColId3= null;
		private NString rgColVal= NString.getNull();
		private NInteger rgRecCnt = toInt(0);
		private NInteger rgRecNum = toInt(0);
/* <p>
		* 
		*  Private procedure to apply needed changes in order to conceal the value of an item.
		* 
/* </p>
		* @param pBlkName
		* @param pItmName
		*/
		public void gDoConceal(NString pBlkName, NString pItmName)
		{
//			if ( SupportClasses.FORMS40.GetItemProperty(pItmName, SupportClasses.Property.CONCEAL_DATA).equals("FALSE") )
			if (getItemDisplayAsPassword(pItmName).equals(false) )
			{
				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
				// F2J_NOT_SUPPORTED : The property "ITEM's CONCEAL_DATA" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin37".
				//				SupportClasses.FORMS40.SetItemProperty(pItmName, SupportClasses.Property.CONCEAL_DATA, true);
				setItemDisplayAsPassword(pItmName, true);
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'ITEM's CONCEAL_DATA' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin37'.");
				
				// 
				if ( getItemQueryAllowed(pItmName).equals("TRUE") )
				{
					setItemQueryAllowed(pItmName, false);
				}
				// 
				if ( getItemEnabled(pItmName).equals("TRUE") )
				{
					setItemEnabled(pItmName, false);
				}
			}
		}
/* <p>
		* 
		*  Procedure called from g$_form_startup to change visibility, conceal data and/or apply
		*  date/number format mask item properties.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFormName
		*/
		public void gStartupMask(NString pFormName)
		{
			int rowCount = 0;
			NString lvDataColumn = toStr("");
			GordmskRow lvGordmskRow= null;
			NString lvUser = getNameIn("GLOBAL.CURRENT_USER");
			String sqldoRulesExist = "SELECT 'Y' " +
	" FROM DUAL " +
	" WHERE  EXISTS(SELECT 'Y' " +
		" FROM gordmsk " +
		" WHERE gordmsk_objs_code = :P_CP_FORM ) ";
			DataCursor doRulesExist = new DataCursor(sqldoRulesExist);
			String sqlgordmskAllUsersC = "SELECT * " +
	" FROM GORDMSK X " +
	" WHERE X.GORDMSK_ALL_USER_IND = 'Y' AND X.GORDMSK_OBJS_CODE = :P_CP_FORM AND  NOT EXISTS(SELECT 'X' " +
		" FROM GORDMSK Y " +
		" WHERE Y.GORDMSK_OBJS_CODE = X.GORDMSK_OBJS_CODE AND Y.GORDMSK_BLOCK_NAME = X.GORDMSK_BLOCK_NAME AND Y.GORDMSK_COLUMN_NAME = X.GORDMSK_COLUMN_NAME AND Y.GORDMSK_ALL_USER_IND <> 'Y' AND Y.GORDMSK_FBPR_CODE IS NULL AND Y.GORDMSK_FGAC_USER_ID = :P_CP_USER ) AND  NOT EXISTS(SELECT 'X' " +
		" FROM GORFBPR, GORDMSK Z " +
		" WHERE Z.GORDMSK_OBJS_CODE = X.GORDMSK_OBJS_CODE AND Z.GORDMSK_BLOCK_NAME = X.GORDMSK_BLOCK_NAME AND Z.GORDMSK_COLUMN_NAME = X.GORDMSK_COLUMN_NAME AND Z.GORDMSK_ALL_USER_IND <> 'Y' AND GORFBPR_FBPR_CODE = Z.GORDMSK_FBPR_CODE AND GORFBPR_FGAC_USER_ID = :P_CP_USER ) " +
	" ORDER BY X.GORDMSK_BLOCK_NAME";
			DataCursor gordmskAllUsersC = new DataCursor(sqlgordmskAllUsersC);
			String sqlgordmskFbprC = "SELECT O.* " +
	" FROM GORFBPR, GORDMSK O " +
	" WHERE GORDMSK_OBJS_CODE = :P_CP_FORM AND GORDMSK_FBPR_CODE IS NOT NULL AND GORDMSK_FBPR_CODE = GORFBPR_FBPR_CODE AND GORFBPR_FGAC_USER_ID = :P_CP_USER AND  NOT EXISTS(SELECT 'X' " +
		" FROM GORDMSK Y " +
		" WHERE Y.GORDMSK_OBJS_CODE = O.GORDMSK_OBJS_CODE AND Y.GORDMSK_BLOCK_NAME = O.GORDMSK_BLOCK_NAME AND Y.GORDMSK_COLUMN_NAME = O.GORDMSK_COLUMN_NAME AND Y.GORDMSK_ALL_USER_IND <> 'Y' AND Y.GORDMSK_FBPR_CODE IS NULL AND Y.GORDMSK_FGAC_USER_ID = :P_CP_USER ) " +
	" ORDER BY O.GORDMSK_BLOCK_NAME";
			DataCursor gordmskFbprC = new DataCursor(sqlgordmskFbprC);
			String sqlgordmskFgacUsersC = "SELECT * " +
	" FROM GORDMSK " +
	" WHERE GORDMSK_OBJS_CODE = :P_CP_FORM AND GORDMSK_FGAC_USER_ID = :P_CP_USER " +
	" ORDER BY GORDMSK_BLOCK_NAME";
			DataCursor gordmskFgacUsersC = new DataCursor(sqlgordmskFgacUsersC);
			NString cpForm = NString.getNull();
			NString cpUser = NString.getNull();
			try {
				// 
				//  Verify that rules exist for this form
				// 
				cpForm=pFormName;
				//Setting query parameters
				doRulesExist.addParameter("P_CP_FORM", cpForm);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable doRulesExist.
				doRulesExist.open();
				ResultSet doRulesExistResults = doRulesExist.fetchInto();
				if ( doRulesExistResults != null ) {
					globalDoRulesExist = doRulesExistResults.getStr(0);
				}
				doRulesExist.close();
				// 
				if ( isNull(globalDoRulesExist, "N").equals("N") )
				{
					globalDoRulesExist = toStr("N");
					return ;
				}
				// 
				//  Set item properties for all users 
				// 
				cpForm=pFormName;
				cpUser=lvUser;
				//Setting query parameters
				gordmskAllUsersC.addParameter("P_CP_FORM", cpForm);
				gordmskAllUsersC.addParameter("P_CP_USER", cpUser);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable gordmskAllUsersC.
				gordmskAllUsersC.open();
				while (true) {
					lvGordmskRow = gordmskAllUsersC.fetchRow(GordmskRow.class);
					if ( gordmskAllUsersC.notFound() ) 
						break;
					// 
					lvDataColumn = lvGordmskRow.GordmskBlockName.append(".").append(lvGordmskRow.GordmskColumnName);
					// 
					//  -- --
					//  if the block_name is equal to the block_comp_name and the column_name is equal to the column_comp_name then this
					//  is considered a masking rule for the Horizon application and not for INB 
					if ( !(isNull(lvGordmskRow.GordmskBlockName, "XOXOXO").equals(isNull(lvGordmskRow.GordmskBlockCompName, "XOXOXO")) && isNull(lvGordmskRow.GordmskColumnName, "XOXOXO").equals(isNull(lvGordmskRow.GordmskColumnCompName, "XOXOXO"))) )
					{
						gApplyStartupMask(lvGordmskRow.GordmskDisplayInd, lvGordmskRow.GordmskConcealInd, lvGordmskRow.GordmskDataMask, lvGordmskRow.GordmskMaskDirection, lvGordmskRow.GordmskMaskLength, lvDataColumn, lvGordmskRow.GordmskBlockName);
					}
				}
				gordmskAllUsersC.close();
				// 
				//  Set item properties for the business profile
				// 
				lvDataColumn = toStr("");
				cpForm=pFormName;
				cpUser=lvUser;
				//Setting query parameters
				gordmskFbprC.addParameter("P_CP_FORM", cpForm);
				gordmskFbprC.addParameter("P_CP_USER", cpUser);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable gordmskFbprC.
				gordmskFbprC.open();
				while (true) {
					lvGordmskRow = gordmskFbprC.fetchRow(GordmskRow.class);
					if ( gordmskFbprC.notFound() ) 
						break;
					// 
					lvDataColumn = lvGordmskRow.GordmskBlockName.append(".").append(lvGordmskRow.GordmskColumnName);
					// 
					//  -- --
					//  if the block_name is equal to the block_comp_name and the column_name is equal to the column_comp_name then this
					//  is considered a masking rule for the Horizon application and not for INB 
					if ( !(isNull(lvGordmskRow.GordmskBlockName, "XOXOXO").equals(isNull(lvGordmskRow.GordmskBlockCompName, "XOXOXO")) && isNull(lvGordmskRow.GordmskColumnName, "XOXOXO").equals(isNull(lvGordmskRow.GordmskColumnCompName, "XOXOXO"))) )
					{
						gApplyStartupMask(lvGordmskRow.GordmskDisplayInd, lvGordmskRow.GordmskConcealInd, lvGordmskRow.GordmskDataMask, lvGordmskRow.GordmskMaskDirection, lvGordmskRow.GordmskMaskLength, lvDataColumn, lvGordmskRow.GordmskBlockName);
					}
				}
				gordmskFbprC.close();
				// 
				//  Set item properties for the user
				// 
				lvDataColumn = toStr("");
				cpForm=pFormName;
				cpUser=lvUser;
				//Setting query parameters
				gordmskFgacUsersC.addParameter("P_CP_FORM", cpForm);
				gordmskFgacUsersC.addParameter("P_CP_USER", cpUser);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable gordmskFgacUsersC.
				gordmskFgacUsersC.open();
				while (true) {
					lvGordmskRow = gordmskFgacUsersC.fetchRow(GordmskRow.class);
					if ( gordmskFgacUsersC.notFound() ) 
						break;
					// 
					lvDataColumn = lvGordmskRow.GordmskBlockName.append(".").append(lvGordmskRow.GordmskColumnName);
					// 
					//  -- --
					//  if the block_name is equal to the block_comp_name and the column_name is equal to the column_comp_name then this
					//  is considered a masking rule for the Horizon application and not for INB 
					if ( !(isNull(lvGordmskRow.GordmskBlockName, "XOXOXO").equals(isNull(lvGordmskRow.GordmskBlockCompName, "XOXOXO")) && isNull(lvGordmskRow.GordmskColumnName, "XOXOXO").equals(isNull(lvGordmskRow.GordmskColumnCompName, "XOXOXO"))) )
					{
						gApplyStartupMask(lvGordmskRow.GordmskDisplayInd, lvGordmskRow.GordmskConcealInd, lvGordmskRow.GordmskDataMask, lvGordmskRow.GordmskMaskDirection, lvGordmskRow.GordmskMaskLength, lvDataColumn, lvGordmskRow.GordmskBlockName);
					}
				}
				gordmskFgacUsersC.close();
				}finally{
					doRulesExist.close();
					gordmskAllUsersC.close();
					gordmskFbprC.close();
					gordmskFgacUsersC.close();
				}
		}
/* <p>
		* 
		*  Set item properties during form startup
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDisplayInd
		* @param pConcealInd
		* @param pMask
		* @param pMaskDirection
		* @param pMaskLength
		* @param pItemName
		* @param pBlockName
		*/
		public void gApplyStartupMask(NString pDisplayInd, NString pConcealInd, NString pMask, NString pMaskDirection, NNumber pMaskLength, NString pItemName, NString pBlockName)
		{
			// MORPHIS TODO: Fix ELLBHR-18517
			// If item is invalid, don't try to apply mask, so form can open normally
			if (findItem(pItemName) == null)
			{
				return;
			}
			
			// 
			NString lvItemCanvas = toStr("");
			NString lvItemType = getItemType(pItemName);
			wasMaskingApplied = toBool(NBool.True);
			//WARNING: only adding rows at the end is supported
			addGroupRow(rgId);
			rgRecNum = rgRecNum.add(1);
			setGroupCharCell(rgColId, rgRecNum, pItemName);
			setGroupCharCell(rgColId2, rgRecNum, pMaskDirection);
			setGroupNumberCell(rgColId3, rgRecNum, pMaskLength);
			// 
			//  Turn visible off
			// 
			if ( pDisplayInd.equals("N") )
			{
				if ( getItemVisible(pItemName).equals("TRUE") )
				{
					setItemVisible(pItemName, false);
					return ;
				}
			}
			else {
				if ( getItemVisible(pItemName).equals("FALSE") )
				{
					lvItemCanvas = getItemCanvas(pItemName);
					// 
					if ( !in(isNull(lvItemCanvas, "TEMP_CANVAS"), "TEMP_CANVAS").getValue() )
					{
						setItemVisible(pItemName, true);
						// 
						if (lvItemType.equals("CHART ITEM"))
						{
						}
						else if (lvItemType.equals("DISPLAY ITEM"))
						{
						}
						else if (lvItemType.equals("IMAGE"))
						{
						}
						else if (lvItemType.equals("USER AREA"))
						{
						}
						else if (lvItemType.equals("BUTTON"))
						{
							setItemEnabled(pItemName, true);
							setItemNavigable(pItemName, true);
						}
						else {
							setItemEnabled(pItemName, true);
							setItemNavigable(pItemName, true);
							setItemInsertAllowed(pItemName, true);
							setItemUpdateAllowed(pItemName, true);
							setItemQueryAllowed(pItemName, true);
						}
					}
				}
			}
			// 
			//  If this is valid for the item type.
			// 
			if ( lvItemType.equalsIgnoreCase("TEXT ITEM") || lvItemType.equalsIgnoreCase("TEXTITEM"))
			{
				//  
				//  Conceal data if visibility is turned on
				// 
				if ( getItemVisible(pItemName).equals("TRUE") )
				{
					//MORPHIS : Support Conceal Data prop
					if ( pConcealInd.equals("N") )
					{
//						if ( SupportClasses.FORMS40.GetItemProperty(pItemName, SupportClasses.Property.CONCEAL_DATA).equals("TRUE") )
						if(getItemDisplayAsPassword(pItemName).toBoolean())
						{
							// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
							// F2J_NOT_SUPPORTED : The property "ITEM's CONCEAL_DATA" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin37".
							//							SupportClasses.FORMS40.SetItemProperty(pItemName, SupportClasses.Property.CONCEAL_DATA, false);
							setItemDisplayAsPassword(pItemName, false);
//							System.err.println("// F2J_NOT_SUPPORTED : The property 'ITEM's CONCEAL_DATA' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin37'.");
							
						}
					}
					else {
						gDoConceal(pBlockName, pItemName);
					}
				}
				// 
				//  Set item format mask properties for numbers, dates set the item to non updateable 
				//  if the format mask is applied, cannot unapply a format mask, if its overridden in 
				//  an all user, or for a profile and you want to change it to the original, you need to 
				//  reapply the original mask
				//   
				//MORPHIS : Support Conceal Data prop
				//	if ( getItemVisible(pItemName).equals("TRUE") && SupportClasses.FORMS40.GetItemProperty(pItemName, SupportClasses.Property.CONCEAL_DATA).equals("FALSE") && !pMask.isNull() )
				// // MORPHIS TODO JM: changed logic of if statement to allow format mask to be applied. 
				if ( getItemVisible(pItemName).equals("TRUE") && !(getItemDisplayAsPassword(pItemName).toBoolean()) && !pMask.isNull() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					// 
					//  For date and number types
					// 
					// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
					if ( !in(getItemDataType(pItemName), "CHAR", "LONG").getValue() )
					{
						setItemFormatMask(pItemName, pMask);
					}
					// 
					setItemQueryAllowed(pItemName, false);
					// F2J_NOT_SUPPORTED : Call to built-in "SET_ITEM_PROPERTY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin37".
					//					SupportClasses.FORMS40.SetItemProperty(pItemName, TaskServices.QUERY_ONLY);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'SET_ITEM_PROPERTY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin37'.");
					
					
					// 
					if ( getBlockInsertAllowed(pBlockName).equals("TRUE") || getBlockUpdateAllowed(pBlockName).equals("TRUE") )
					{
						setItemInsertAllowed(pItemName, false);
						setItemUpdateAllowed(pItemName, false);
					}
					else {
						if ( getItemInsertAllowed(pItemName).equals("TRUE") || getItemUpdateAllowed(pItemName).equals("TRUE") )
						{
							setItemInsertAllowed(pItemName, false);
							setItemUpdateAllowed(pItemName, false);
						}
					}
				}
				//  --
				//  --   
				if ( getItemVisible(pItemName).equals("TRUE") && !(getItemDisplayAsPassword(pItemName).toBoolean()) && pMask.isNull() && !pMaskDirection.isNull() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					//  --
					//  -- The following line will set the TOOLTIP_TEXT for an item to an R or L and a length
					//  -- For example:  L=4   or R=11
					//  -- There is an implementation class on items that will then use this TOOLTIP_TEXT value to
					//  -- partially mask the chracter item display
					//setItemToolTip(pItemName, pMaskDirection.append("=").append(toChar(pMaskLength)));
					//Morphis: This is now added as an item extension so that it doesn't use the tooltip that might have visual representation
					addItemExtension(pItemName, BaseTask.VALUE_MASK, pMaskDirection.append(":").append(toChar(pMaskLength)));
					if ( getItemQueryAllowed(pItemName).equals("TRUE") )
					{
						setItemQueryAllowed(pItemName, false);
					}
					if ( getItemEnabled(pItemName).equals("TRUE") )
					{
						setItemEnabled(pItemName, false);
					}
				}
			}
		}
/* <p>
		* 
		*   string masks: this procedure is called from a blocks post query
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFormName
		* @param pBlockName
		*/
		public void gStringMasks(NString pFormName, NString pBlockName) {
			gStringMasks(pFormName, pBlockName, NString.getNull(), NString.getNull());
		}

/* <p>
		* 
		*   string masks: this procedure is called from a blocks post query
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFormName
		* @param pBlockName
		* @param pColumnName
		*/
		public void gStringMasks(NString pFormName, NString pBlockName, NString pColumnName) {
			gStringMasks(pFormName, pBlockName, pColumnName, NString.getNull());
		}

/* <p>
		* 
		*   string masks: this procedure is called from a blocks post query
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFormName
		* @param pBlockName
		* @param pColumnName
		* @param pRecordNumber
		*/
		public void gStringMasks(NString pFormName, NString pBlockName, NString pColumnName, NString pRecordNumber)
		{
			int rowCount = 0;
			// 
			NString lvDmskColumn= NString.getNull();
			NString lvFormatMask= NString.getNull();
			NString lvDmclQuery= NString.getNull();
			NNumber lvCntApplied = toNumber(0);
			NString lvDataColumn = NString.getNull();
			NString lvQueryColumn = NString.getNull();
			NString lvInitialRecStatus = NString.getNull();
			NString lvUser = getNameIn("GLOBAL.CURRENT_USER");
			String sqlgordmskAllUsersC = "SELECT gordmsk_data_mask, gordmsk_column_name, gordmcl.gordmcl_query_column " +
	" FROM gordmcl, gordmsk " +
	" WHERE gordmcl_objs_code = gordmsk_objs_code AND gordmcl_block_name = gordmsk_block_name AND gordmcl_column_name = gordmsk_column_name AND gordmcl_data_type_cde = 'C' AND gordmsk_objs_code = :P_P_FORM_NAME AND gordmsk_block_name = :P_P_BLOCK_NAME AND gordmsk_column_name = NVL(:P_P_COLUMN_NAME, gordmsk_column_name) AND gordmsk_all_user_ind = 'Y' AND gordmsk_data_mask IS NOT NULL ";
			DataCursor gordmskAllUsersC = new DataCursor(sqlgordmskAllUsersC);
			String sqlgordmskFgacUsersC = "SELECT gordmsk_data_mask, gordmsk_column_name, gordmcl.gordmcl_query_column " +
	" FROM gordmcl, gordmsk " +
	" WHERE gordmcl_objs_code = gordmsk_objs_code AND gordmcl_block_name = gordmsk_block_name AND gordmcl_column_name = gordmsk_column_name AND gordmcl_data_type_cde = 'C' AND gordmsk_objs_code = :P_P_FORM_NAME AND gordmsk_block_name = :P_P_BLOCK_NAME AND gordmsk_column_name = NVL(:P_P_COLUMN_NAME, gordmsk_column_name) AND gordmsk_fgac_user_id = :P_LV_USER AND gordmsk_data_mask IS NOT NULL ";
			DataCursor gordmskFgacUsersC = new DataCursor(sqlgordmskFgacUsersC);
			String sqlgordmskFbprC = "SELECT gordmsk_data_mask, gordmsk_column_name, gordmcl.gordmcl_query_column " +
	" FROM gorfbpr, gordmcl, gordmsk " +
	" WHERE gordmcl_objs_code = gordmsk_objs_code AND gordmcl_block_name = gordmsk_block_name AND gordmcl_column_name = gordmsk_column_name AND gordmcl_data_type_cde = 'C' AND gordmsk_objs_code = :P_P_FORM_NAME AND gordmsk_block_name = :P_P_BLOCK_NAME AND gordmsk_column_name = NVL(:P_P_COLUMN_NAME, gordmsk_column_name) AND gordmsk_fbpr_code = gorfbpr_fbpr_code AND gorfbpr_fgac_user_id = :P_LV_USER AND gordmsk_data_mask IS NOT NULL ";
			DataCursor gordmskFbprC = new DataCursor(sqlgordmskFbprC);
			try {
				if ( isNull(globalDoRulesExist, "N").equals("N") )
				{
					return ;
				}
				// 
				// F2J_NOT_SUPPORTED : The property "RECORD's STATUS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin38".
				//				lvInitialRecStatus = SupportClasses.FORMS40.GetRecordProperty(pRecordNumber, pBlockName, SupportClasses.Property.STATUS);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RECORD's STATUS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin38'.");
				
				
				// 
				//  Set item properties for all users 
				// 
				lvDataColumn = toStr("");
				//Setting query parameters
				gordmskAllUsersC.addParameter("P_P_FORM_NAME", pFormName);
				gordmskAllUsersC.addParameter("P_P_BLOCK_NAME", pBlockName);
				gordmskAllUsersC.addParameter("P_P_COLUMN_NAME", pColumnName);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable gordmskAllUsersC.
				gordmskAllUsersC.open();
				while (true) {
					ResultSet gordmskAllUsersCResults = gordmskAllUsersC.fetchInto();
					if ( gordmskAllUsersCResults != null ) {
						lvFormatMask = gordmskAllUsersCResults.getStr(0);
						lvDmskColumn = gordmskAllUsersCResults.getStr(1);
						lvDmclQuery = gordmskAllUsersCResults.getStr(2);
					}
					if ( gordmskAllUsersC.notFound() ) 
						break;
					// 
					lvDataColumn = pBlockName.append(".").append(lvDmskColumn);
					lvQueryColumn = toStr("");
					// 
					if ( !lvDmclQuery.isNull() )
					{
						lvQueryColumn = pBlockName.append(".").append(lvDmclQuery);
					}
					// 
					//  Masking on string data allowed only if the datatype is char or long, and update and 
					//  insert are not allowed
					// 
					gApplyStringMasks(pBlockName, lvDataColumn, lvQueryColumn, lvFormatMask);
					lvCntApplied = lvCntApplied.add(1);
				}
				gordmskAllUsersC.close();
				// 
				//  Set item properties for the business profile
				// 
				lvDataColumn = toStr("");
				//Setting query parameters
				gordmskFbprC.addParameter("P_P_FORM_NAME", pFormName);
				gordmskFbprC.addParameter("P_P_BLOCK_NAME", pBlockName);
				gordmskFbprC.addParameter("P_P_COLUMN_NAME", pColumnName);
				gordmskFbprC.addParameter("P_LV_USER", lvUser);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable gordmskFbprC.
				gordmskFbprC.open();
				while (true) {
					ResultSet gordmskFbprCResults = gordmskFbprC.fetchInto();
					if ( gordmskFbprCResults != null ) {
						lvFormatMask = gordmskFbprCResults.getStr(0);
						lvDmskColumn = gordmskFbprCResults.getStr(1);
						lvDmclQuery = gordmskFbprCResults.getStr(2);
					}
					if ( gordmskFbprC.notFound() ) 
						break;
					// 
					lvDataColumn = pBlockName.append(".").append(lvDmskColumn);
					lvQueryColumn = toStr("");
					// 
					if ( !lvDmclQuery.isNull() )
					{
						lvQueryColumn = pBlockName.append(".").append(lvDmclQuery);
					}
					// 
					gApplyStringMasks(pBlockName, lvDataColumn, lvQueryColumn, lvFormatMask);
					lvCntApplied = lvCntApplied.add(1);
				}
				gordmskFbprC.close();
				// 
				//  Set item properties for the user 
				// 
				lvDataColumn = toStr("");
				//Setting query parameters
				gordmskFgacUsersC.addParameter("P_P_FORM_NAME", pFormName);
				gordmskFgacUsersC.addParameter("P_P_BLOCK_NAME", pBlockName);
				gordmskFgacUsersC.addParameter("P_P_COLUMN_NAME", pColumnName);
				gordmskFgacUsersC.addParameter("P_LV_USER", lvUser);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable gordmskFgacUsersC.
				gordmskFgacUsersC.open();
				while (true) {
					ResultSet gordmskFgacUsersCResults = gordmskFgacUsersC.fetchInto();
					if ( gordmskFgacUsersCResults != null ) {
						lvFormatMask = gordmskFgacUsersCResults.getStr(0);
						lvDmskColumn = gordmskFgacUsersCResults.getStr(1);
						lvDmclQuery = gordmskFgacUsersCResults.getStr(2);
					}
					if ( gordmskFgacUsersC.notFound() ) 
						break;
					// 
					lvDataColumn = pBlockName.append(".").append(lvDmskColumn);
					lvQueryColumn = toStr("");
					// 
					if ( !lvDmclQuery.isNull() )
					{
						lvQueryColumn = pBlockName.append(".").append(lvDmclQuery);
					}
					// 
					gApplyStringMasks(pBlockName, lvDataColumn, lvQueryColumn, lvFormatMask);
					lvCntApplied = lvCntApplied.add(1);
				}
				gordmskFgacUsersC.close();
				//  
				if ( lvCntApplied.greater(0) && lvInitialRecStatus.equals("QUERY") )
				{
					// F2J_NOT_SUPPORTED : The property "RECORD's STATUS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin39".
					//					SupportClasses.FORMS40.SetRecordProperty(pRecordNumber, pBlockName, SupportClasses.Property.STATUS, SupportClasses.Constants.QUERY_STATUS);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'RECORD's STATUS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin39'.");
					
					
				}
				}finally{
					gordmskAllUsersC.close();
					gordmskFbprC.close();
					gordmskFgacUsersC.close();
				}
		}
/* <p>
		* 
		*  Call the gokfgac function to alter the data 
		* 
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pBlockName
		* @param pItemName
		* @param pQueryItem
		* @param pMask
		*/
		public void gApplyStringMasks(NString pBlockName, NString pItemName, NString pQueryItem, NString pMask)
		{
			// 
			NString lvTempColumn = toStr("");
			NString lvReformatedColumn = toStr("");
			// 
			//  The query column is the database column, and the item name is the non database
			//  column.  If you write the formated data into the database column, the form will
			//  think you are updating the database
			// 
			// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
//			if ( in(getItemDataType(pItemName), "CHAR", "LONG").getValue() && getItemVisible(pItemName).equals("TRUE") && SupportClasses.FORMS40.GetItemProperty(pItemName, SupportClasses.Property.CONCEAL_DATA).equals("FALSE") )
			if ( in(getItemDataType(pItemName), "CHAR", "LONG").getValue() && getItemVisible(pItemName).equals("TRUE") && getItemDisplayAsPassword(pItemName).equals(false) )
			{
				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
				// 
				if ( !pQueryItem.isNull() )
				{
					lvTempColumn = getNameIn(pQueryItem);
				}
				else {
					lvTempColumn = getNameIn(pItemName);
				}
				// 
				lvReformatedColumn = Gokfgac.fFormatData(pMask, lvTempColumn);
				copy(lvReformatedColumn,pItemName);
				setItemQueryAllowed(pItemName, false);
				// 
				if ( getBlockInsertAllowed(pBlockName).equals("TRUE") || getBlockUpdateAllowed(pBlockName).equals("TRUE") )
				{
					setItemInsertAllowed(pItemName, false);
					setItemUpdateAllowed(pItemName, false);
				}
				else {
					if ( getItemInsertAllowed(pItemName).equals("TRUE") || getItemUpdateAllowed(pItemName).equals("TRUE") )
					{
						setItemInsertAllowed(pItemName, false);
						setItemUpdateAllowed(pItemName, false);
					}
				}
			}
		}
/* <p>
		* 
		*  Function to determine whether any masking rules were applied to this item.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFormName
		* @param pBlockName
		* @param pItemName
		*/
		public NBool gWasMaskingApplied(NString pFormName, NString pBlockName, NString pItemName)
		{
			// 
			//  If the switch is not set, then return without searching any further.
			// 
			if ( wasMaskingApplied.not() )
			{
				return  toBool(((NBool.False)));
			}
			// 
			//  Scan through the list looking for this item.
			// 
			rgRecCnt = toInt(getGroupRowCount(rgId));
			for ( int i = 1; i <= rgRecCnt.toInt32(); i++ )
			{
				rgColVal = getGroupCharCell(rgColId, i);
				// 
				if ( rgColVal.equals(upper(pBlockName).append(".").append(upper(pItemName))) )
				{
					return  toBool(((NBool.True)));
				}
			}
			// 
			return  toBool(((NBool.False)));
		}
/* <p>
		* 
		* 
		*  This function is similar to G$_WAS_MASKING_APPLIED, but will return the type of
		*  masking that was applied. If a GORDMSK rule exists, but the only rule applied is
		*  to have the 'Display' indicator checked, G$_WAS_MASKING_APPLIED will return a true.
		*  This routine will indicate whether the value was really masked or not (i.e. if the 
		*  'Display' indicator is checked, then there really isn't any true masking so an 'N'
		*  would be returned.
		* 
		*    Return  Was Value   Type of
		*    Value   Restricted  Restriction
		*    ------  ----------  ---------------------------------------------------
		*    YI      Yes         Invisible (i.e. display=N)
		*    YC      Yes         CONCEAL
		*    YLnnn   Yes         Masked from the left for nnn characters
		*    YRnnn   Yes         Masked from the right for nnn characters
		*    YFxxx   Yes         Masked with an override format equal to xxx
		*    N       No          No concealing, formating, or partial character mask
		*    ?       Unknown     Some other masking combination
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFormName
		* @param pBlockName
		* @param pItemName
		*/
		public NString gDidMaskRestrict(NString pFormName, NString pBlockName, NString pItemName) {
			return gDidMaskRestrict(pFormName, pBlockName, pItemName, toStr("N"));
		}

/* <p>
		* 
		* 
		*  This function is similar to G$_WAS_MASKING_APPLIED, but will return the type of
		*  masking that was applied. If a GORDMSK rule exists, but the only rule applied is
		*  to have the 'Display' indicator checked, G$_WAS_MASKING_APPLIED will return a true.
		*  This routine will indicate whether the value was really masked or not (i.e. if the 
		*  'Display' indicator is checked, then there really isn't any true masking so an 'N'
		*  would be returned.
		* 
		*    Return  Was Value   Type of
		*    Value   Restricted  Restriction
		*    ------  ----------  ---------------------------------------------------
		*    YI      Yes         Invisible (i.e. display=N)
		*    YC      Yes         CONCEAL
		*    YLnnn   Yes         Masked from the left for nnn characters
		*    YRnnn   Yes         Masked from the right for nnn characters
		*    YFxxx   Yes         Masked with an override format equal to xxx
		*    N       No          No concealing, formating, or partial character mask
		*    ?       Unknown     Some other masking combination
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFormName
		* @param pBlockName
		* @param pItemName
		* @param pDebug
		*/
		public NString gDidMaskRestrict(NString pFormName, NString pBlockName, NString pItemName, NString pDebug)
		{
			int rowCount = 0;
			NString lvUser = getNameIn("GLOBAL.CURRENT_USER");
			GordmskRow lvGordmsk= null;
			NString lvReturn= NString.getNull();
			String sqlgetRuleC = "SELECT * " +
	" FROM gordmsk " +
	" WHERE gordmsk_objs_code = :P_FORM_IN AND gordmsk_block_name = :P_BLOCK_IN AND gordmsk_column_name = :P_ITEM_IN AND (gordmsk_fgac_user_id IS NULL OR gordmsk_fgac_user_id = :P_USER_IN) AND (gordmsk_fbpr_code IS NULL OR (gordmsk_fbpr_code) IN ((SELECT gorfbpr_fbpr_code " +
		" FROM gorfbpr " +
		" WHERE gorfbpr_fgac_user_id = :P_USER_IN ))) " +
	" ORDER BY gordmsk_fgac_user_id, gordmsk_fbpr_code, gordmsk_all_user_ind DESC";
			DataCursor getRuleC = new DataCursor(sqlgetRuleC);
			NString formIn = NString.getNull();
			NString blockIn = NString.getNull();
			NString itemIn = NString.getNull();
			NString userIn = NString.getNull();
			try {
				// 
				//  If there were no masking rules, then just return 'N'
				// 
				if ( gWasMaskingApplied(pFormName, pBlockName, pItemName).not() )
				{
					if ( pDebug.equals("Y") )
					{
						warningMessage(GNls.Fget(toStr("GOQRPLS-0076"), toStr("LIB"), toStr("No masking rules have been applied")));
					}
					return  toStr("N");
				}
				// 
				//  If there were masking rules, we have to check and see if the rule actually masked, or
				//  if it was only the DISPLAY indicator that was set.
				// 
				formIn=pFormName;
				blockIn=pBlockName;
				itemIn=pItemName;
				userIn=lvUser;
				//Setting query parameters
				getRuleC.addParameter("P_FORM_IN", formIn);
				getRuleC.addParameter("P_BLOCK_IN", blockIn);
				getRuleC.addParameter("P_ITEM_IN", itemIn);
				getRuleC.addParameter("P_USER_IN", userIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable getRuleC.
				getRuleC.open();
				lvGordmsk = getRuleC.fetchRow(GordmskRow.class);
				if ( getRuleC.notFound() )
				{
					if ( pDebug.equals("Y") )
					{
						warningMessage(GNls.Fget(toStr("GOQRPLS-0077"), toStr("LIB"), toStr("No GORDMSK rows found")));
					}
					return  toStr("N");
				}
				getRuleC.close();
				// 
				if ( lvGordmsk.GordmskConcealInd.equals("Y") )
				{
					lvReturn = toStr("YC");
				}
				else if ( !lvGordmsk.GordmskDataMask.isNull() ) {
					lvReturn = toStr("Y").append(lvGordmsk.GordmskDataMask);
				}
				else if ( in(lvGordmsk.GordmskMaskDirection, "L", "R").getValue() && lvGordmsk.GordmskMaskLength.greater(0) ) {
					lvReturn = toStr("Y").append(lvGordmsk.GordmskMaskDirection).append(lvGordmsk.GordmskMaskLength);
				}
				else if ( lvGordmsk.GordmskDisplayInd.equals("N") ) {
					lvReturn = toStr("YI");
				}
				else if ( lvGordmsk.GordmskDisplayInd.equals("Y") ) {
					lvReturn = toStr("N");
				}
				else {
					lvReturn = toStr("?");
				}
				// 
				if ( pDebug.equals("Y") )
				{
					warningMessage(substring(GNls.Fget(toStr("GOQRPLS-0078"), toStr("LIB"), toStr("Form:%01% Block:%02% Item:%03% User:%04% Returns:%05%"), pFormName, pBlockName, pItemName, lvUser, lvReturn), toInt(1), toInt(180)));
					warningMessage(substring(GNls.Fget(toStr("GOQRPLS-0079"), toStr("LIB"), toStr("All User:%01% BusProf:%02% User:%03% Mask:%04% PartialMask:%05% Display:%06% Conceal:%07%"), lvGordmsk.GordmskAllUserInd, lvGordmsk.GordmskFbprCode, lvGordmsk.GordmskFgacUserId, lvGordmsk.GordmskDataMask, lvGordmsk.GordmskMaskDirection.append(lvGordmsk.GordmskMaskLength), lvGordmsk.GordmskDisplayInd, lvGordmsk.GordmskConcealInd), toInt(1), toInt(180)));
				}
				// 
				return lvReturn;
				}finally{
					getRuleC.close();
				}
		}
	
	
}
