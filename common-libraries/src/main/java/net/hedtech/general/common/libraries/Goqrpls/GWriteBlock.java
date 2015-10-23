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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
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
import static net.hedtech.general.common.libraries.Goqrpls.Exceptions.*;

import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GWriteBlock extends AbstractSupportCodeObject {
	

	public GWriteBlock(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WRITE_BLOCK
	/*
	PACKAGE G$_WRITE_BLOCK IS 
-- 
--  Package     f60write
--  Version     6.0 Production
--  Written by  Mark Doran
--
--  Write_Block
--
--  Description:
--     Writes the records from a block to a flat file.
--
--  Arguments:
--     block_name      the name of the block to write.
--     output_file     the name of the output file.  The default file name is 'output.lis'.
--     output_mode     specified 'write' or 'append' mode.  The value values are 'w' 
--                     and 'a'.  The default value is 'w'.
--     column_align    a boolean indicating if the output should be column aligned.
--     sep_char        the character(s) to use as column seperators.
--                     The default value is a space.
--     rec_option      specifies the records to write from the block.
--                     Valid values are 'ALL', 'VIEWED' and 'VISIBLE'.
--     displayed_only  a boolean indicating whether to write only the displayed
--                     items or all the items, whether they are visible or not.
--                     The default value is FALSE, indicating that all items should be written.     
--
--   *ATTENTION*
--   The BANNER implementation of this functionality is for the 5.0 release.
--   Please see Menu Module GUMAPPL.mmb for the invocation of the write_block
--   function below. This was implemented via a Block.Extract menu UI.   
-- 
--
-- The following variables are used when extracting a Datetime item that has a format mask.
-- This is to allow the NAME_IN builtin to push the time portion along (and then reset the default
-- BUILTIN_DATE_FORMAT value).
  lv_builtin_date_format       VARCHAR2(100) := GET_APPLICATION_PROPERTY(BUILTIN_DATE_FORMAT);
  lv_builtin_date_format_wtime VARCHAR2(100) := G$_DATE.GET_NLS_DATE_FORMAT||'HH24MISS';
--
--
  FUNCTION write_block(block_name      IN VARCHAR2,
                       output_file     IN VARCHAR2 := 'output.lis',
                       output_mode     IN VARCHAR2 := 'W',
                       column_align    IN BOOLEAN  := TRUE,
                       sep_char        IN VARCHAR2 := ' ',
                       rec_option      IN VARCHAR2 := 'ALL',
                       displayed_only  IN BOOLEAN  := FALSE) RETURN NUMBER;
--
END;
	*/
	
			//  
		//   Package     f60write
		//   Version     6.0 Production
		//   Written by  Mark Doran
		// 
		//   Write_Block
		// 
		//   Description:
		//      Writes the records from a block to a flat file.
		// 
		//   Arguments:
		//      block_name      the name of the block to write.
		//      output_file     the name of the output file.  The default file name is 'output.lis'.
		//      output_mode     specified 'write' or 'append' mode.  The value values are 'w' 
		//                      and 'a'.  The default value is 'w'.
		//      column_align    a boolean indicating if the output should be column aligned.
		//      sep_char        the character(s) to use as column seperators.
		//                      The default value is a space.
		//      rec_option      specifies the records to write from the block.
		//                      Valid values are 'ALL', 'VIEWED' and 'VISIBLE'.
		//      displayed_only  a boolean indicating whether to write only the displayed
		//                      items or all the items, whether they are visible or not.
		//                      The default value is FALSE, indicating that all items should be written.     
		// 
		//    *ATTENTION*
		//    The BANNER implementation of this functionality is for the 5.0 release.
		//    Please see Menu Module GUMAPPL.mmb for the invocation of the write_block
		//    function below. This was implemented via a Block.Extract menu UI.   
		//  
		// 
		//  The following variables are used when extracting a Datetime item that has a format mask.
		//  This is to allow the NAME_IN builtin to push the time portion along (and then reset the default
		//  BUILTIN_DATE_FORMAT value).
		public NString lvBuiltinDateFormat = getDateFormat();
		public NString lvBuiltinDateFormatWtime = GDate.getNlsDateFormat().append("HH24MISS");

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WRITE_BLOCK
		/*
		PACKAGE BODY G$_WRITE_BLOCK IS
--
-- Package was originally written as f60write by Mark Doran.  Modified it to
-- handle additional item types and to send the output to database for users
-- who are running through a browser.  This is called by G$_DATA_EXTRACT.
--
  FUNCTION apply_partial_char_mask(p_value_in IN VARCHAR2,
                                   p_mask_direction_in IN VARCHAR2,
                                   p_mask_length_in IN NUMBER) RETURN VARCHAR2 IS
-- --                                   
    lv_mask_character VARCHAR2(1)    := '*';
    lv_work_string    VARCHAR2(4000) := '';
-- --
  BEGIN
    IF p_value_in = ' ' THEN
      RETURN(p_value_in);
    ELSE
      IF p_mask_direction_in = 'R' THEN
        FOR i IN 1..(LENGTH(p_value_in) - p_mask_length_in) LOOP
          lv_work_string := lv_work_string || lv_mask_character;
        END LOOP;
        lv_work_string := lv_work_string || substr(p_value_in, (LENGTH(p_value_in) - p_mask_length_in) + 1 );
        RETURN(lv_work_string);
      ELSE
        lv_work_string := substr(p_value_in,1,p_mask_length_in);
        FOR i IN 1..(LENGTH(p_value_in) - p_mask_length_in) LOOP
          lv_work_string := lv_work_string || lv_mask_character;
        END LOOP;
        RETURN(lv_work_string);	
      END IF;
    END IF;
  END;
--
--
--
  PROCEDURE find_partial_char_mask_values(p_rg_rec_cnt         IN     NUMBER,
                                          p_item_name_in       IN     VARCHAR2,
                                          p_mask_direction_out IN OUT VARCHAR2,
                                          p_mask_length_out    IN OUT NUMBER) IS
    rg_col_val          VARCHAR2(61);
    rg_col_val2         VARCHAR2(1);
    rg_col_val3         NUMBER(4);
  BEGIN
    p_mask_direction_out := '';
    p_mask_length_out    := 0;
    FOR i IN 1..p_rg_rec_cnt LOOP
      rg_col_val  := GET_GROUP_CHAR_CELL('MASKING_LIST.BLOCK_ITEM',i);
      rg_col_val2 := GET_GROUP_CHAR_CELL('MASKING_LIST.GORDMSK_MASK_DIRECTION',i);
      rg_col_val3 := GET_GROUP_NUMBER_CELL('MASKING_LIST.GORDMSK_MASK_LENGTH',i);     
      IF rg_col_val = UPPER(p_item_name_in) THEN
        p_mask_direction_out := rg_col_val2;
        p_mask_length_out    := rg_col_val3;
        EXIT;
      END IF;
    END LOOP;   
  END;
--
--
  FUNCTION add_quotes(p_data_in   IN VARCHAR2) RETURN VARCHAR2 IS
  BEGIN
    RETURN '"' || p_data_in || '"';
  END add_quotes;
--
--
  FUNCTION get_prompt(p_item_name IN VARCHAR2) RETURN VARCHAR2 IS
    lv_item_id    ITEM;
    lv_item_type  VARCHAR2(30);
    lv_prompt     VARCHAR2(200);
  BEGIN
    lv_item_id := FIND_ITEM(p_item_name);
    IF ID_NULL(lv_item_id) THEN
      RETURN NULL;
    END IF;
--
    lv_item_type := GET_ITEM_PROPERTY(lv_item_id, ITEM_TYPE);
--
    IF lv_item_type NOT IN ('RADIO GROUP') THEN
      lv_prompt := GET_ITEM_PROPERTY(lv_item_id, PROMPT_TEXT);
      lv_prompt := LTRIM(RTRIM(REPLACE(REPLACE(lv_prompt,CHR(10),' '),':',' ')));
      IF lv_prompt IS NOT NULL THEN 
        RETURN add_quotes(lv_prompt);
      END IF;
    END IF;
--
    IF lv_item_type = 'RADIO GROUP' THEN
      lv_prompt := GET_ITEM_PROPERTY(lv_item_id, HINT_TEXT);
      lv_prompt := LTRIM(RTRIM(REPLACE(REPLACE(lv_prompt,CHR(10),' '),':',' ')));
      IF lv_prompt IS NOT NULL THEN 
        RETURN add_quotes(lv_prompt);
      END IF;
    END IF;
--
    IF lv_item_type IN ('CHECKBOX','BUTTON') THEN
      lv_prompt := GET_ITEM_PROPERTY(lv_item_id, LABEL);
      lv_prompt := LTRIM(RTRIM(REPLACE(REPLACE(lv_prompt,'&',' '),':',' ')));
      IF lv_prompt IS NOT NULL THEN
        RETURN add_quotes(lv_prompt);
      END IF;
    END IF;
--
    lv_prompt := GET_ITEM_PROPERTY(lv_item_id, TOOLTIP_TEXT);
    lv_prompt := LTRIM(RTRIM(lv_prompt));
    IF lv_prompt IS NOT NULL THEN
      RETURN add_quotes(lv_prompt);
    END IF;
--
    lv_prompt := SUBSTR(p_item_name,INSTR(p_item_name,'.') + 1);
    IF INSTR(lv_prompt,'_') = 8 THEN
    	lv_prompt := SUBSTR(lv_prompt,9);
    END IF;
    lv_prompt := INITCAP(REPLACE(lv_prompt,'_',' '));
--
    RETURN add_quotes(lv_prompt);
  END get_prompt;
--
--
  FUNCTION write_block(block_name      IN VARCHAR2,
                       output_file     IN VARCHAR2 := 'output.lis',
                       output_mode     IN VARCHAR2 := 'W',
                       column_align    IN BOOLEAN  := TRUE,
                       sep_char        IN VARCHAR2 := ' ',
                       rec_option      IN VARCHAR2 := 'ALL',
                       displayed_only  IN BOOLEAN  := FALSE) RETURN NUMBER IS
--
    block_id        BLOCK;
    quotes_exist    BOOLEAN := FALSE;
    force_trunc     BOOLEAN := FALSE;
    item_id         ITEM;
    skip_this_item  EXCEPTION;
--
    cur_canvas      VARCHAR2(30);
    cur_data_type   VARCHAR2(40);
    cur_form        VARCHAR2(30) := NAME_IN('SYSTEM.CURRENT_FORM');
    cur_item        VARCHAR2(61);
    cur_item_canvas VARCHAR2(30);
    cur_item_type   VARCHAR2(40);
    cur_rec_prompt  VARCHAR2(2000) := '';
    cur_rec_value   VARCHAR2(2000) := '';
    cur_tab_canvas  VARCHAR2(30);
    cur_window      VARCHAR2(30);
    item_align      VARCHAR2(20);
    item_disp       VARCHAR2(20);
    item_name       VARCHAR2(61);
    item_prompt     VARCHAR2(200);
    item_value      VARCHAR2(32767);
    show_prompts    VARCHAR2(1) := 'N';
--
    cur_user_id     NUMBER;
    item_count      NUMBER := 0;
    num_records     NUMBER := 0;
    pad_length      NUMBER;
    session_no      NUMBER := TO_NUMBER(NAME_IN('GLOBAL.SESSION_ID'));
    start_rec       NUMBER;
    stop_rec        NUMBER;
-- -- --
-- -- --
    lv_mask_direction   VARCHAR2(1);
    lv_mask_length      NUMBER(4);
    rg_rec_cnt          INTEGER(3) := 0;  
-- -- --
-- -- --
--
  BEGIN 
    block_id := FIND_BLOCK(block_name);
    IF ID_NULL(block_id) THEN
      RETURN(-1);
    END IF;
-- -- -- --
-- -- -- --
   rg_rec_cnt := GET_GROUP_ROW_COUNT('MASKING_LIST');
-- -- -- --    
-- -- -- --    
--
-- Insert the GUBOUTP header record.
--
    SELECT user_id
      INTO cur_user_id
      FROM all_users
     WHERE username = USER;
--
    IF UPPER(output_mode) = 'W' THEN 
      INSERT INTO GUBOUTD
             (GUBOUTD_USER_ID,
              GUBOUTD_USER_NUM,
              GUBOUTD_ONE_UP_NO,
              GUBOUTD_JOB,
              GUBOUTD_FILE_NAME,
              GUBOUTD_FILE_NUMBER,
              GUBOUTD_NUMBER_OF_LINES,
              GUBOUTD_ACTIVITY_DATE,
              GUBOUTD_DATE_PRINTED,
              GUBOUTD_DATA_ORIGIN)
      VALUES (USER,
              cur_user_id,
              TO_NUMBER(output_file),
              cur_form || '_' || block_name,
              cur_form || '_' || block_name,
              session_no,
              -1,
              SYSDATE,
              SYSDATE,
              'BANNER');
--
    ELSE
      SELECT MAX(GUROUTD_SEQ_NO)
        INTO num_records
        FROM GUROUTD
       WHERE GUROUTD_USER_NUM = cur_user_id
         AND GUROUTD_ONE_UP_NO = TO_NUMBER(output_file)
         AND GUROUTD_FILE_NUMBER = session_no;
    END IF;
--
    GO_BLOCK(block_name);
    cur_item := NAME_IN('SYSTEM.CURSOR_ITEM');
    cur_canvas := GET_ITEM_PROPERTY(cur_item, ITEM_CANVAS);
    cur_window := GET_VIEW_PROPERTY(cur_canvas, WINDOW_NAME);
--
-- Determine how many records to print
--
    IF UPPER(rec_option) = 'ALL' THEN
      start_rec := 1;
      LAST_RECORD;
      stop_rec  := GET_BLOCK_PROPERTY(block_id, QUERY_HITS);
    ELSIF UPPER(rec_option) = 'VIEWED' THEN
      start_rec := 1;
      stop_rec  := GET_BLOCK_PROPERTY(block_id, QUERY_HITS);
    ELSIF UPPER(rec_option) = 'VISIBLE' THEN
      start_rec := GET_BLOCK_PROPERTY(block_id, TOP_RECORD);
      stop_rec  := start_rec + TO_NUMBER(GET_BLOCK_PROPERTY(block_id, RECORDS_DISPLAYED)) - 1;
    END IF;
--
    IF stop_rec = 0 THEN 
      stop_rec := 1; 
    END IF;
--
-- Determine the user's preference for display prompts
--
    show_prompts := G$_GET_UPRF_DE_PROMPTS;
--
-- Start processing the records
--
    GO_RECORD(start_rec);
    FOR rec_count IN start_rec..stop_rec LOOP
      item_count := 0;
      item_name  := block_name || '.' || GET_BLOCK_PROPERTY(block_id, FIRST_ITEM);
      item_id    := FIND_ITEM(item_name);
-- 
-- Only print certain types of items
-- 
      WHILE item_name IS NOT NULL LOOP
-- 
-- Eliminate items which don't meet the criteria
-- 
        BEGIN
          cur_item_type := GET_ITEM_PROPERTY(item_id, ITEM_TYPE);
          item_disp     := GET_ITEM_PROPERTY(item_id, VISIBLE);
--
          IF cur_item_type = 'BUTTON' THEN
            IF GET_ITEM_PROPERTY(item_id, ICONIC_BUTTON) = 'TRUE' THEN
              RAISE skip_this_item;
            END IF;
          ELSIF cur_item_type NOT IN
                 ('CHECKBOX','LIST','DISPLAY ITEM','TEXT ITEM','RADIO GROUP') THEN
            RAISE skip_this_item;
          END IF;
-- 
          cur_item_canvas := GET_ITEM_PROPERTY(item_id, ITEM_CANVAS);
          IF cur_item_canvas IS NULL THEN
            RAISE skip_this_item;
          END IF;
          IF GET_VIEW_PROPERTY(cur_item_canvas, VISIBLE) <> 'TRUE' THEN
            RAISE skip_this_item;
          END IF;
-- 
          cur_tab_canvas := GET_ITEM_PROPERTY(item_id, ITEM_TAB_PAGE);
          IF cur_tab_canvas IS NOT NULL THEN
            IF GET_CANVAS_PROPERTY(cur_item_canvas, TOPMOST_TAB_PAGE) 
            	  <> cur_tab_canvas THEN
              RAISE skip_this_item;
            END IF;
          END IF;
-- 
          IF cur_item_type = 'DISPLAY ITEM' THEN
            IF GET_ITEM_PROPERTY(item_id, VISUAL_ATTRIBUTE) 
            	  = 'G$_NVA_DATA_SEPARATOR_LINE' THEN
              RAISE skip_this_item;
            END IF;
          END IF;
--
          IF cur_item_type = 'TEXT ITEM' THEN
            IF GET_ITEM_PROPERTY(item_id, ECHO) <> 'TRUE' THEN
              RAISE skip_this_item;
            END IF;
          END IF;
--
          IF (displayed_only = TRUE AND item_disp = 'FALSE') THEN
            RAISE skip_this_item;
          END IF;
-- 
-- Get the prompt
-- 
          item_prompt := '';
          IF rec_count = 1 and show_prompts = 'Y' THEN
            item_prompt := get_prompt(item_name);
--
            IF item_count > 0 THEN
              IF LENGTH(cur_rec_prompt || item_prompt) > 2000 THEN
                cur_rec_prompt := SUBSTR(cur_rec_prompt || item_value,1,1998) || '"';
              ELSE
                cur_rec_prompt := cur_rec_prompt || sep_char || item_prompt;
              END IF;
--
            ELSE
              cur_rec_prompt := cur_rec_prompt || item_prompt;
            END IF;
--
          END IF;
-- 
-- Additional properties needed which aren't valid for the above types
--
          cur_data_type := GET_ITEM_PROPERTY(item_id, DATATYPE);
          pad_length    := GET_ITEM_PROPERTY(item_id, MAX_LENGTH);
          item_align    := GET_ITEM_PROPERTY(item_id, PROMPT_TEXT_ALIGNMENT);
--
-- Format the item
--
          IF column_align = TRUE THEN
-- -- If it is not a date or datetime just grab the value otherwise need to use the appropriate format
-- -- Appropriate format will assist extract of partially mask date values and time portion on datetime values 
            IF cur_data_type NOT IN ('DATE','DATETIME') THEN
            	IF rg_rec_cnt > 0 THEN
-- -- -- If this rg_rec_cnt is greater than zero that means that routine G$_MASKS has valued the
-- -- -- record_group MASKING_LIST with rows.  There is potential that these MASKING_LIST rows indicate a partial
-- -- -- character mask direction (GORDMSK_MASK_DIRECTION) and partial character mask length (GORDMSK_MASK_LENGTH).
-- -- -- If that is the case then apply those partial character mask rules to this piece of data and push it thru
-- -- -- Otherwise just push it thru.
                find_partial_char_mask_values(rg_rec_cnt,item_name,lv_mask_direction,lv_mask_length);
                IF lv_mask_direction IS NULL THEN
                  item_value := NVL(NAME_IN(item_name),' ');
                ELSE
                	item_value := apply_partial_char_mask(NVL(NAME_IN(item_name),' '),
                	                                      lv_mask_direction,
                	                                      lv_mask_length);
                END IF;                
            	ELSE
-- -- -- else there is no possible partial character mask, so just push back the item's value
                item_value := NVL(NAME_IN(item_name),' ');
              END IF;
            ELSIF cur_data_type = 'DATE' THEN
              item_value := NVL(NAME_IN(item_name),' ');
              IF item_value <> ' ' THEN
                item_value := NVL(TO_CHAR(TO_DATE(item_value,G$_DATE.GET_NLS_DATE_FORMAT),NVL(GET_ITEM_PROPERTY(item_id,FORMAT_MASK),G$_DATE.GET_NLS_DATE_FORMAT)),' ');
              END IF;
            ELSE
            	item_value := NVL(NAME_IN(item_name),' ');
            	IF item_value <> ' ' THEN
                SET_APPLICATION_PROPERTY(BUILTIN_DATE_FORMAT,lv_builtin_date_format_wtime);           		
                item_value := NVL(NAME_IN(item_name),' ');
          	    item_value := TO_CHAR(TO_DATE(item_value,lv_builtin_date_format_wtime),NVL(GET_ITEM_PROPERTY(item_id,FORMAT_MASK),lv_builtin_date_format_wtime));
                SET_APPLICATION_PROPERTY(BUILTIN_DATE_FORMAT,lv_builtin_date_format);            		
            	END IF;
            END IF;
-- --
            IF NAME_IN('GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS') = 'Y' THEN
              IF item_align IN ('START', 'LEFT', 'CENTER') THEN
                item_value := RPAD(item_value,pad_length,' ');
              ELSE
                item_value := LPAD(item_value,pad_length,' ');
              END IF;
            END IF;
          ELSE
            item_value := NAME_IN(item_name);
          END IF;
--
-- Enclose in quotes and check if double quotes exist within the data.
--
          IF INSTR(item_value,'"') > 0 THEN
            quotes_exist := TRUE;
            item_value := REPLACE(item_value,'"','""');
          END IF;
       	  item_value := add_quotes(item_value);
--
-- If more than one item has been written, add the seperator and write value
--
          IF LENGTH(cur_rec_value || item_value) > 2000 THEN
            force_trunc := TRUE;
            cur_rec_value := SUBSTR(cur_rec_value || item_value,1,1998) || '"';
          ELSE
            IF item_count > 0 THEN
              cur_rec_value  := cur_rec_value  || sep_char || item_value;
            ELSE
              cur_rec_value  := cur_rec_value  || item_value;
            END IF;
          END IF;
--
          item_count := item_count + 1;
--
        EXCEPTION
          WHEN OTHERS THEN NULL;
        END;
--
-- Find next item; if done with record, write end of line character
--
        item_name := GET_ITEM_PROPERTY(item_id, NEXTITEM);
--
        IF item_name IS NOT NULL THEN
          item_name := block_name || '.' || item_name;
          item_id := FIND_ITEM(item_name);
        ELSE
--
          IF rec_count = 1 AND show_prompts = 'Y' THEN
            INSERT INTO GUROUTD
                   (GUROUTD_USER_NUM,
                    GUROUTD_ONE_UP_NO,
                    GUROUTD_FILE_NUMBER,
                    GUROUTD_SEQ_NO,
                    GUROUTD_LINE)
            VALUES (cur_user_id,
                    TO_NUMBER(output_file),
                    session_no,
                    rec_count + num_records,
                    cur_rec_prompt || ',');
--
            num_records := num_records + 1;
          END IF;
--
          INSERT INTO GUROUTD
                 (GUROUTD_USER_NUM,
                  GUROUTD_ONE_UP_NO,
                  GUROUTD_FILE_NUMBER,
                  GUROUTD_SEQ_NO,
                  GUROUTD_LINE)
          VALUES (cur_user_id,
                  TO_NUMBER(output_file),
                  session_no,
                  rec_count + num_records,
                  cur_rec_value || ',');
--
          cur_rec_value := '';
        END IF;
--
      END LOOP;
      NEXT_RECORD;
--
    END LOOP;
--
-- All done, go back to first record, close the file, report any issues
--
    FIRST_RECORD;
    COPY('0','SYSTEM.MESSAGE_LEVEL');
    IF force_trunc THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0186','LIB','*NOTE* Data to be extracted exceeded 2000 characters and was truncated.')
              ,ACKNOWLEDGE);
    END IF;
--
    IF quotes_exist THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0187','LIB','*NOTE* Some of the data being extracted contains embedded double quotes.  This may cause the data to format incorrectly.') 
    	        ,ACKNOWLEDGE);
    END IF;
--
    IF force_trunc OR quotes_exist THEN
      MESSAGE(G$_NLS.Get('GOQRPLS-0188','LIB','Extract Complete'));
      SYNCHRONIZE;    
    END IF;
--
    RETURN(0);
--
  EXCEPTION
    WHEN OTHERS THEN
      RETURN(-1);
  END WRITE_BLOCK;
--
END;
		*/
		/* <p>
		* 
		*  Package was originally written as f60write by Mark Doran.  Modified it to
		*  handle additional item types and to send the output to database for users
		*  who are running through a browser.  This is called by G$_DATA_EXTRACT.
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pValueIn
		* @param pMaskDirectionIn
		* @param pMaskLengthIn
		*/
		public NString applyPartialCharMask(NString pValueIn, NString pMaskDirectionIn, NNumber pMaskLengthIn)
		{
			//  --                                   
			NString lvMaskCharacter = toStr("*");
			NString lvWorkString = toStr("");
			if ( pValueIn.equals(" ") )
			{
				return ((pValueIn));
			}
			else {
				if ( pMaskDirectionIn.equals("R") )
				{
					for ( int i = 1; i <= (length(pValueIn).subtract(pMaskLengthIn)).toInt32(); i++ )
					{
						lvWorkString = lvWorkString.append(lvMaskCharacter);
					}
					lvWorkString = lvWorkString.append(substring(pValueIn, toInt((length(pValueIn).subtract(pMaskLengthIn)).add(1))));
					return ((lvWorkString));
				}
				else {
					lvWorkString = substring(pValueIn, toInt(1), toInt(pMaskLengthIn));
					for ( int i = 1; i <= (length(pValueIn).subtract(pMaskLengthIn)).toInt32(); i++ )
					{
						lvWorkString = lvWorkString.append(lvMaskCharacter);
					}
					return ((lvWorkString));
				}
			}
		}
/* <p>
		* 
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pRgRecCnt
		* @param pItemNameIn
		* @param pMaskDirectionOut
		* @param pMaskLengthOut
		*/
		public void findPartialCharMaskValues(NNumber pRgRecCnt, NString pItemNameIn, Ref<NString> pMaskDirectionOut, Ref<NNumber> pMaskLengthOut)
		{
			NString rgColVal= NString.getNull();
			NString rgColVal2= NString.getNull();
			NNumber rgColVal3= NNumber.getNull();
			pMaskDirectionOut.val = toStr("");
			pMaskLengthOut.val = toNumber(0);
			for ( int i = 1; i <= pRgRecCnt.toInt32(); i++ )
			{
				rgColVal = getGroupCharCell("MASKING_LIST.BLOCK_ITEM", i);
				rgColVal2 = getGroupCharCell("MASKING_LIST.GORDMSK_MASK_DIRECTION", i);
				rgColVal3 = getGroupNumberCell("MASKING_LIST.GORDMSK_MASK_LENGTH", i);
				if ( rgColVal.equals(upper(pItemNameIn)) )
				{
					pMaskDirectionOut.val = rgColVal2;
					pMaskLengthOut.val = rgColVal3;
						break;
				}
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDataIn
		*/
		public NString addQuotes(NString pDataIn)
		{
			return toStr("\"").append(pDataIn).append("\"");
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pItemName
		*/
		public NString getPrompt(NString pItemName)
		{
			ItemDescriptor lvItemId= null;
			NString lvItemType= NString.getNull();
			NString lvPrompt= NString.getNull();
			lvItemId = findItem(pItemName);
			if ( (lvItemId == null) )
			{
				return NString.getNull();
			}
			// 
			lvItemType = toStr(getItemType(lvItemId));
			// 
			if ( !in(lvItemType, "RADIO GROUP").getValue() )
			{
				lvPrompt = toStr(getItemPromptText(lvItemId));
				lvPrompt = ltrim(rtrim(replace(replace(lvPrompt, chr(10), " "), ":", " ")));
				if ( !lvPrompt.isNull() )
				{
					return addQuotes(lvPrompt);
				}
			}
			// 
			if ( lvItemType.equals("RADIO GROUP") )
			{
				lvPrompt = toStr(getItemHint(lvItemId));
				lvPrompt = ltrim(rtrim(replace(replace(lvPrompt, chr(10), " "), ":", " ")));
				if ( !lvPrompt.isNull() )
				{
					return addQuotes(lvPrompt);
				}
			}
			// 
			if ( in(lvItemType, "CHECKBOX", "BUTTON").getValue() )
			{
				lvPrompt = toStr(getItemLabel(lvItemId));
				lvPrompt = ltrim(rtrim(replace(replace(lvPrompt, "&", " "), ":", " ")));
				if ( !lvPrompt.isNull() )
				{
					return addQuotes(lvPrompt);
				}
			}
			// 
			lvPrompt = toStr(getItemToolTip(lvItemId));
			lvPrompt = ltrim(rtrim(lvPrompt));
			if ( !lvPrompt.isNull() )
			{
				return addQuotes(lvPrompt);
			}
			// 
			lvPrompt = substring(pItemName, inStr(pItemName, toStr(".")).add(1));
			if ( inStr(lvPrompt, toStr("_")).equals(8) )
			{
				lvPrompt = substring(lvPrompt, toInt(9));
			}
			lvPrompt = initcap(replace(lvPrompt, "_", " "));
			// 
			return addQuotes(lvPrompt);
		}
/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blockName
		*/
		public NNumber writeBlock(NString blockName) {
			return writeBlock(blockName, toStr("output.lis"), toStr("W"), toBool(NBool.True), toStr(" "), toStr("ALL"), toBool(NBool.False));
		}

/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blockName
		* @param outputFile
		*/
		public NNumber writeBlock(NString blockName, NString outputFile) {
			return writeBlock(blockName, outputFile, toStr("W"), toBool(NBool.True), toStr(" "), toStr("ALL"), toBool(NBool.False));
		}

/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blockName
		* @param outputFile
		* @param outputMode
		*/
		public NNumber writeBlock(NString blockName, NString outputFile, NString outputMode) {
			return writeBlock(blockName, outputFile, outputMode, toBool(NBool.True), toStr(" "), toStr("ALL"), toBool(NBool.False));
		}

/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blockName
		* @param outputFile
		* @param outputMode
		* @param columnAlign
		*/
		public NNumber writeBlock(NString blockName, NString outputFile, NString outputMode, NBool columnAlign) {
			return writeBlock(blockName, outputFile, outputMode, columnAlign, toStr(" "), toStr("ALL"), toBool(NBool.False));
		}

/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blockName
		* @param outputFile
		* @param outputMode
		* @param columnAlign
		* @param sepChar
		*/
		public NNumber writeBlock(NString blockName, NString outputFile, NString outputMode, NBool columnAlign, NString sepChar) {
			return writeBlock(blockName, outputFile, outputMode, columnAlign, sepChar, toStr("ALL"), toBool(NBool.False));
		}

/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blockName
		* @param outputFile
		* @param outputMode
		* @param columnAlign
		* @param sepChar
		* @param recOption
		*/
		public NNumber writeBlock(NString blockName, NString outputFile, NString outputMode, NBool columnAlign, NString sepChar, NString recOption) {
			return writeBlock(blockName, outputFile, outputMode, columnAlign, sepChar, recOption, toBool(NBool.False));
		}

/* <p>
		* 
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param blockName
		* @param outputFile
		* @param outputMode
		* @param columnAlign
		* @param sepChar
		* @param recOption
		* @param displayedOnly
		*/
		public NNumber writeBlock(NString blockName, NString outputFile, NString outputMode, NBool columnAlign, NString sepChar, NString recOption, NBool displayedOnly)
		{
			int rowCount = 0;
			// 
			BlockDescriptor blockId= null;
			NBool quotesExist = toBool(NBool.False);
			NBool forceTrunc = toBool(NBool.False);
			ItemDescriptor itemId= null;
			// 
			NString curCanvas= NString.getNull();
			NString curDataType= NString.getNull();
			NString curForm = getCurrentTaskName();
			NString curItem= NString.getNull();
			NString curItemCanvas= NString.getNull();
			NString curItemType= NString.getNull();
			NString curRecPrompt = toStr("");
			NString curRecValue = toStr("");
			NString curTabCanvas= NString.getNull();
			NString curWindow= NString.getNull();
			NString itemAlign= NString.getNull();
			NString itemDisp= NString.getNull();
			NString itemName= NString.getNull();
			NString itemPrompt= NString.getNull();
			NString itemValue= NString.getNull();
			NString showPrompts = toStr("N");
			// 
			NNumber curUserId= NNumber.getNull();
			NNumber itemCount = toNumber(0);
			NNumber numRecords = toNumber(0);
			NNumber padLength= NNumber.getNull();
			NNumber sessionNo = toNumber(getNameIn("GLOBAL.SESSION_ID"));
			NNumber startRec= NNumber.getNull();
			NNumber stopRec= NNumber.getNull();
			//  -- --
			//  -- --
			NString lvMaskDirection= NString.getNull();
			NNumber lvMaskLength= NNumber.getNull();
			NInteger rgRecCnt = toInt(0);
			try
			{
				blockId = findBlock(blockName);
				if ( (blockId == null) )
				{
					return toNumber(- 1);
				}
				//  -- -- --
				//  -- -- --
				rgRecCnt = toInt(getGroupRowCount("MASKING_LIST"));
				//  -- -- --    
				//  -- -- --    
				// 
				//  Insert the GUBOUTP header record.
				// 
				String sql1 = "SELECT user_id " +
	" FROM all_users " +
	" WHERE username = USER ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					curUserId = results1.getNumber(0);
				}
				results1.close();
				// 
				if ( upper(outputMode).equals("W") )
				{
					String sql2 = "INSERT INTO GUBOUTD " +
	"(GUBOUTD_USER_ID, GUBOUTD_USER_NUM, GUBOUTD_ONE_UP_NO, GUBOUTD_JOB, GUBOUTD_FILE_NAME, GUBOUTD_FILE_NUMBER, GUBOUTD_NUMBER_OF_LINES, GUBOUTD_ACTIVITY_DATE, GUBOUTD_DATE_PRINTED, GUBOUTD_DATA_ORIGIN)" +
	"VALUES (USER, :P_CUR_USER_ID, TO_NUMBER(:P_OUTPUT_FILE), :P_CUR_FORM || '_' || :P_BLOCK_NAME, :P_CUR_FORM || '_' || :P_BLOCK_NAME, :P_SESSION_NO, - 1, SYSDATE, SYSDATE, 'BANNER')";
					DataCommand command2 = new DataCommand(sql2);
					//Setting query parameters
					command2.addParameter("P_CUR_USER_ID", curUserId);
					command2.addParameter("P_OUTPUT_FILE", outputFile);
					command2.addParameter("P_CUR_FORM", curForm);
					command2.addParameter("P_BLOCK_NAME", blockName);
					command2.addParameter("P_SESSION_NO", sessionNo);
					rowCount = command2.execute();
				}
				else {
					String sql3 = "SELECT MAX(GUROUTD_SEQ_NO) " +
	" FROM GUROUTD " +
	" WHERE GUROUTD_USER_NUM = :P_CUR_USER_ID AND GUROUTD_ONE_UP_NO = TO_NUMBER(:P_OUTPUT_FILE) AND GUROUTD_FILE_NUMBER = :P_SESSION_NO ";
					DataCommand command3 = new DataCommand(sql3);
					//Setting query parameters
					command3.addParameter("P_CUR_USER_ID", curUserId);
					command3.addParameter("P_OUTPUT_FILE", outputFile);
					command3.addParameter("P_SESSION_NO", sessionNo);
					ResultSet results3 = command3.executeQuery();
					rowCount = command3.getRowCount();
					if ( results3.hasData() ) {
						numRecords = results3.getNumber(0);
					}
					results3.close();
				}
				// 
				goBlock(blockName);
				curItem = getCursorItem();
				curCanvas = getItemCanvas(curItem);
				curWindow = getViewWindowName(curCanvas);
				// 
				//  Determine how many records to print
				// 
				if ( upper(recOption).equals("ALL") )
				{
					startRec = toNumber(1);
					lastRecord();
					stopRec = toNumber(getBlockQueryHits(blockId));
				}
				else if ( upper(recOption).equals("VIEWED") ) {
					startRec = toNumber(1);
					stopRec = toNumber(getBlockQueryHits(blockId));
				}
				else if ( upper(recOption).equals("VISIBLE") ) {
					// F2J_NOT_SUPPORTED : The property "BLOCK's TOP_RECORD" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin21".
					//					startRec = toNumber(SupportClasses.FORMS40.GetBlockProperty(blockId, SupportClasses.Property.TOP_RECORD));
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's TOP_RECORD' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin21'.");
					
					
					// F2J_NOT_SUPPORTED : The property "BLOCK's RECORDS_DISPLAYED" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin21".
					//					stopRec = startRec.add(toNumber(SupportClasses.FORMS40.GetBlockProperty(blockId, SupportClasses.Property.RECORDS_DISPLAYED))).subtract(1);
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's RECORDS_DISPLAYED' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin21'.");
					
					
				}
				// 
				if ( stopRec.equals(0) )
				{
					stopRec = toNumber(1);
				}
				// 
				//  Determine the user's preference for display prompts
				// 
				showPrompts = getContainer().gGetUprfDePrompts();
				// 
				//  Start processing the records
				// 
				setCurrentRecord(startRec);
				for ( int recCount = startRec.toInt32(); recCount <= stopRec.toInt32(); recCount++ )
				{
					itemCount = toNumber(0);
					itemName = blockName.append(".").append(getBlockFirstItem(blockId));
					itemId = findItem(itemName);
					//  
					//  Only print certain types of items
					//  
					while ( !itemName.isNull() ) {
						try
						{
							curItemType = toStr(getItemType(itemId));
							itemDisp = toStr(getItemVisible(itemId));
							// 
							if ( curItemType.equals("BUTTON") )
							{
								if ( SupportClasses.FORMS40.GetItemProperty(itemId, SupportClasses.Property.ICONIC_BUTTON).equals("TRUE") )
								{
									
									
									// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
									throw new SkipThisItem();
								}
							}
							else if ( !in(curItemType, "CHECKBOX", "LIST", "DISPLAY ITEM", "TEXT ITEM", "RADIO GROUP").getValue() ) {
								throw new SkipThisItem();
							}
							//  
							curItemCanvas = toStr(getItemCanvas(itemId));
							if ( curItemCanvas.isNull() )
							{
								throw new SkipThisItem();
							}
							if ( getViewVisible(curItemCanvas).notEquals("TRUE") )
							{
								throw new SkipThisItem();
							}
							//  
							// F2J_NOT_SUPPORTED : The property "ITEM's ITEM_TAB_PAGE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
							//							curTabCanvas = SupportClasses.FORMS40.GetItemProperty(itemId, SupportClasses.Property.ITEM_TAB_PAGE);
//							System.err.println("// F2J_NOT_SUPPORTED : The property 'ITEM's ITEM_TAB_PAGE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
							
							curTabCanvas = toStr(findItem(toStr(itemId)).getPage().getId());
							
							if ( !curTabCanvas.isNull() )
							{
								if ( getCanvasTopMostTabPage(curItemCanvas).notEquals(curTabCanvas) )
								{
									throw new SkipThisItem();
								}
							}
							//  
							if ( curItemType.equals("DISPLAY ITEM") )
							{
								if ( getItemStyleClass(itemId).equals("G$_NVA_DATA_SEPARATOR_LINE") )
								{
									throw new SkipThisItem();
								}
							}
							// 
							if ( curItemType.equals("TEXT ITEM") )
							{
								if ( SupportClasses.FORMS40.GetItemProperty(itemId, SupportClasses.Property.ECHO).notEquals("TRUE") )
								{
									// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
									throw new SkipThisItem();
								}
							}
							// 
							if ((displayedOnly.equals(NBool.True) && itemDisp.equals("FALSE")))
							{
								throw new SkipThisItem();
							}
							//  
							//  Get the prompt
							//  
							itemPrompt = toStr("");
							if ( recCount == 1 && showPrompts.equals("Y") )
							{
								itemPrompt = getPrompt(itemName);
								// 
								if ( itemCount.greater(0) )
								{
									if ( length(curRecPrompt.append(itemPrompt)).greater(2000) )
									{
										curRecPrompt = substring(curRecPrompt.append(itemValue), toInt(1), toInt(1998)).append("\"");
									}
									else {
										curRecPrompt = curRecPrompt.append(sepChar).append(itemPrompt);
									}
								}
								else {
									curRecPrompt = curRecPrompt.append(itemPrompt);
								}
							}
							//  
							//  Additional properties needed which aren't valid for the above types
							// 
							curDataType = toStr(getItemDataType(itemId));
							// F2J_NOT_SUPPORTED : The property "ITEM's MAX_LENGTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
							//							padLength = toNumber(SupportClasses.FORMS40.GetItemProperty(itemId, SupportClasses.Property.MAX_LENGTH));
							this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's MAX_LENGTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
							
							
							// F2J_NOT_SUPPORTED : The property "ITEM's PROMPT_TEXT_ALIGNMENT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
							//							itemAlign = SupportClasses.FORMS40.GetItemProperty(itemId, SupportClasses.Property.PROMPT_TEXT_ALIGNMENT);
							this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's PROMPT_TEXT_ALIGNMENT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
							
							
							// 
							//  Format the item
							// 
							if ( columnAlign.equals(NBool.True) )
							{
								//  -- If it is not a date or datetime just grab the value otherwise need to use the appropriate format
								//  -- Appropriate format will assist extract of partially mask date values and time portion on datetime values 
								if ( !in(curDataType, "DATE", "DATETIME").getValue() )
								{
									if ( rgRecCnt.greater(0) )
									{
										//  -- -- If this rg_rec_cnt is greater than zero that means that routine G$_MASKS has valued the
										//  -- -- record_group MASKING_LIST with rows.  There is potential that these MASKING_LIST rows indicate a partial
										//  -- -- character mask direction (GORDMSK_MASK_DIRECTION) and partial character mask length (GORDMSK_MASK_LENGTH).
										//  -- -- If that is the case then apply those partial character mask rules to this piece of data and push it thru
										//  -- -- Otherwise just push it thru.
										Ref<NString> pMaskDirectionOut_ref = new Ref<NString>(lvMaskDirection);
										Ref<NNumber> pMaskLengthOut_ref = new Ref<NNumber>(lvMaskLength);
										findPartialCharMaskValues(toNumber(rgRecCnt), itemName, pMaskDirectionOut_ref, pMaskLengthOut_ref);
										lvMaskDirection = pMaskDirectionOut_ref.val;
										lvMaskLength = pMaskLengthOut_ref.val;
										if ( lvMaskDirection.isNull() )
										{
											itemValue = isNull(getNameIn(itemName), " ");
										}
										else {
											itemValue = applyPartialCharMask(isNull(getNameIn(itemName), " "), lvMaskDirection, lvMaskLength);
										}
									}
									else {
										//  -- -- else there is no possible partial character mask, so just push back the item's value
										itemValue = isNull(getNameIn(itemName), " ");
									}
								}
								else if ( curDataType.equals("DATE") ) {
									itemValue = isNull(getNameIn(itemName), " ");
									if ( itemValue.notEquals(" ") )
									{
										itemValue = isNull(toChar(toDate(itemValue, GDate.getNlsDateFormat()), isNull(getItemFormatMask(itemId), GDate.getNlsDateFormat())), " ");
									}
								}
								else {
									itemValue = isNull(getNameIn(itemName), " ");
									if ( itemValue.notEquals(" ") )
									{
										setDateFormat(lvBuiltinDateFormatWtime);
										itemValue = isNull(getNameIn(itemName), " ");
										itemValue = toChar(toDate(itemValue, lvBuiltinDateFormatWtime), isNull(getItemFormatMask(itemId), lvBuiltinDateFormatWtime));
										setDateFormat(lvBuiltinDateFormat);
									}
								}
								//  --
								if ( getNameIn("GLOBAL.BAN_DATA_EXTRACT_PAD_COLUMNS").equals("Y") )
								{
									if ( in(itemAlign, "START", "LEFT", "CENTER").getValue() )
									{
										itemValue = rpad(itemValue, padLength, " ");
									}
									else {
										itemValue = lpad(itemValue, padLength, " ");
									}
								}
							}
							else {
								itemValue = getNameIn(itemName);
							}
							// 
							//  Enclose in quotes and check if double quotes exist within the data.
							// 
							if ( inStr(itemValue, toStr("\"")).greater(0) )
							{
								quotesExist = toBool(NBool.True);
								itemValue = replace(itemValue, "\"", "\"\"");
							}
							itemValue = addQuotes(itemValue);
							// 
							//  If more than one item has been written, add the seperator and write value
							// 
							if ( length(curRecValue.append(itemValue)).greater(2000) )
							{
								forceTrunc = toBool(NBool.True);
								curRecValue = substring(curRecValue.append(itemValue), toInt(1), toInt(1998)).append("\"");
							}
							else {
								if ( itemCount.greater(0) )
								{
									curRecValue = curRecValue.append(sepChar).append(itemValue);
								}
								else {
									curRecValue = curRecValue.append(itemValue);
								}
							}
							// 
							itemCount = itemCount.add(1);
						}
						catch(Exception  e)
						{
						}
						// 
						//  Find next item; if done with record, write end of line character
						// 
						itemName = toStr(getItemNextItem(itemId));
						// 
						if ( !itemName.isNull() )
						{
							itemName = blockName.append(".").append(itemName);
							itemId = findItem(itemName);
						}
						else {
							// 
							if ( recCount == 1 && showPrompts.equals("Y") )
							{
								String sql4 = "INSERT INTO GUROUTD " +
	"(GUROUTD_USER_NUM, GUROUTD_ONE_UP_NO, GUROUTD_FILE_NUMBER, GUROUTD_SEQ_NO, GUROUTD_LINE)" +
	"VALUES (:P_CUR_USER_ID, TO_NUMBER(:P_OUTPUT_FILE), :P_SESSION_NO, :P_REC_COUNT + :P_NUM_RECORDS, :P_CUR_REC_PROMPT || ',')";
								DataCommand command4 = new DataCommand(sql4);
								//Setting query parameters
								command4.addParameter("P_CUR_USER_ID", curUserId);
								command4.addParameter("P_OUTPUT_FILE", outputFile);
								command4.addParameter("P_SESSION_NO", sessionNo);
								command4.addParameter("P_REC_COUNT", recCount);
								command4.addParameter("P_NUM_RECORDS", numRecords);
								command4.addParameter("P_CUR_REC_PROMPT", curRecPrompt);
								rowCount = command4.execute();
								// 
								numRecords = numRecords.add(1);
							}
							// 
							String sql5 = "INSERT INTO GUROUTD " +
	"(GUROUTD_USER_NUM, GUROUTD_ONE_UP_NO, GUROUTD_FILE_NUMBER, GUROUTD_SEQ_NO, GUROUTD_LINE)" +
	"VALUES (:P_CUR_USER_ID, TO_NUMBER(:P_OUTPUT_FILE), :P_SESSION_NO, :P_REC_COUNT + :P_NUM_RECORDS, :P_CUR_REC_VALUE || ',')";
							DataCommand command5 = new DataCommand(sql5);
							//Setting query parameters
							command5.addParameter("P_CUR_USER_ID", curUserId);
							command5.addParameter("P_OUTPUT_FILE", outputFile);
							command5.addParameter("P_SESSION_NO", sessionNo);
							command5.addParameter("P_REC_COUNT", recCount);
							command5.addParameter("P_NUM_RECORDS", numRecords);
							command5.addParameter("P_CUR_REC_VALUE", curRecValue);
							rowCount = command5.execute();
							// 
							curRecValue = toStr("");
						}
					}
					nextRecord();
				}
				// 
				//  All done, go back to first record, close the file, report any issues
				// 
				firstRecord();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				MessageServices.resetMessageLevel();
				if ( forceTrunc.getValue() )
				{
					infoMessage(GNls.Fget(toStr("GOQRPLS-0186"), toStr("LIB"), toStr("*NOTE* Data to be extracted exceeded 2000 characters and was truncated.")), OutputMessageUserResponse.ACKNOWLEDGE);
				}
				// 
				if ( quotesExist.getValue() )
				{
					infoMessage(GNls.Fget(toStr("GOQRPLS-0187"), toStr("LIB"), toStr("*NOTE* Some of the data being extracted contains embedded double quotes.  This may cause the data to format incorrectly.")), OutputMessageUserResponse.ACKNOWLEDGE);
				}
				// 
				if ( forceTrunc.getValue() || quotesExist.getValue() )
				{
					message(GNls.Fget(toStr("GOQRPLS-0188"), toStr("LIB"), toStr("Extract Complete")));
					// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize".
					//					SupportClasses.SQLFORMS.Synchronize();
					this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#ExcludeSynchronize'.");
					
					
				}
				// 
				return  toNumber(((0)));
			}
			catch(Exception  e)
			{
				return toNumber(-1);
			}
		}
		
	
	
}
