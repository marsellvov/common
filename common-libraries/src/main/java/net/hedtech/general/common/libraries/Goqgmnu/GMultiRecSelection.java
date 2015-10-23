package net.hedtech.general.common.libraries.Goqgmnu;

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


public class GMultiRecSelection extends AbstractSupportCodeObject {
	

	public GMultiRecSelection(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqgmnuServices getContainer() {
		return (GoqgmnuServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_MULTI_REC_SELECTION
	/*
	PACKAGE G$_MULTI_REC_SELECTION IS
  FUNCTION UNIQUE_COUNTER RETURN NUMBER;
--
  PROCEDURE CREATE_RG(rg_name IN VARCHAR2);
  PROCEDURE CHECK_FOR_BLK (vat_name IN VARCHAR2);
  PROCEDURE MULTI_RECORD_CHOICE(group_name IN VARCHAR2,
                                un_value   IN VARCHAR2 := 'GUBOBJS.GUBOBJS_NAME',
                                un_count   IN VARCHAR2 := 'SYSTEM.TRIGGER_RECORD');
  PROCEDURE INSERT_INTO_GURMENU(p_item_name IN VARCHAR2);
  PROCEDURE DELETE_FROM_GURMENU(p_item_name IN VARCHAR2);
END G$_MULTI_REC_SELECTION;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_MULTI_REC_SELECTION
		/*
		PACKAGE BODY G$_MULTI_REC_SELECTION IS
 increment NUMBER := 0;
--
--
 FUNCTION UNIQUE_COUNTER RETURN NUMBER IS
 BEGIN
   increment := increment +1;
   RETURN INCREMENT;
 END;
--
--
 PROCEDURE MULTI_RECORD_CHOICE(group_name IN VARCHAR2,
                               un_value   IN VARCHAR2 := 'GUBOBJS.GUBOBJS_NAME',
                               un_count   IN VARCHAR2 := 'SYSTEM.TRIGGER_RECORD') IS
   rg_name VARCHAR2(30):= group_name;
   get_set VARCHAR2(1) := 'Y';
   rg_row  NUMBER(5);
 BEGIN
  create_rg(rg_name);
  rg_row := TO_NUMBER(GET_GROUP_ROW_COUNT(rg_name));
--
  IF rg_row > 0 THEN
    FOR rg_rec IN 1..rg_row LOOP
      IF GET_GROUP_CHAR_CELL  (rg_name||'.OBJ_NAME',rg_rec)  = NAME_IN(un_value) AND
         GET_GROUP_NUMBER_CELL(rg_name||'.TRIG_REC' ,rg_rec) = NAME_IN(un_count) THEN
        get_set := 'N';
--
        IF GET_GROUP_CHAR_CELL(rg_name||'.INDICATOR',rg_rec) = 'Y' THEN
          SET_GROUP_CHAR_CELL(rg_name||'.INDICATOR',rg_rec,'N');
        ELSE
          SET_GROUP_CHAR_CELL(rg_name||'.INDICATOR' ,rg_rec ,'Y');
        END IF;
        EXIT;
      END IF;
    END LOOP;
--
    IF get_set = 'Y' THEN
      EXECUTE_TRIGGER('Add_To_MRC');
    END IF;
  ELSE
    EXECUTE_TRIGGER('Add_To_MRC');
  END IF;
--
  IF GET_ITEM_INSTANCE_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),CURRENT_RECORD,VISUAL_ATTRIBUTE) = 'LOCAL_TEXT' THEN
    Check_For_Blk('LOCAL_HIGHLITE_TEXT');
  ELSE
    Check_For_Blk('LOCAL_TEXT');
  END IF;

 END;
--
--
 PROCEDURE CREATE_RG(rg_name IN VARCHAR2) IS
  rg_id   RECORDGROUP;
  rc_id   GROUPCOLUMN;  
 BEGIN
  rg_id := FIND_GROUP(rg_name);
  IF ID_NULL(rg_id) THEN
    rg_id := CREATE_GROUP(rg_name);
    rc_id := ADD_GROUP_COLUMN(rg_id,'NAME',CHAR_COLUMN,30);
    rc_id := ADD_GROUP_COLUMN(rg_id,'OBJ_NAME',CHAR_COLUMN,30);
    rc_id := ADD_GROUP_COLUMN(rg_id,'OBJT_CODE',CHAR_COLUMN,30);
    rc_id := ADD_GROUP_COLUMN(rg_id,'TRIG_REC',NUMBER_COLUMN,4);
    rc_id := ADD_GROUP_COLUMN(rg_id,'INDICATOR',CHAR_COLUMN,30);
  END IF;
 END;
--
--
 PROCEDURE CHECK_FOR_BLK (vat_name IN VARCHAR2) IS
  lv_block VARCHAR2(30):= NAME_IN('SYSTEM.CURSOR_BLOCK');
 BEGIN
  IF lv_block = 'GUBOBJS' THEN
    SET_ITEM_INSTANCE_PROPERTY('GUBOBJS.GUBOBJS_NAME',CURRENT_RECORD,VISUAL_ATTRIBUTE,vat_name);
    SET_ITEM_INSTANCE_PROPERTY('GUBOBJS.GUBOBJS_DESC',CURRENT_RECORD,VISUAL_ATTRIBUTE,vat_name);
  ELSIF INSTR(lv_block,'GURMENU') > 0 THEN
    SET_ITEM_INSTANCE_PROPERTY(lv_block||'.DISPLAY_DESC',CURRENT_RECORD,VISUAL_ATTRIBUTE,vat_name);
    SET_ITEM_INSTANCE_PROPERTY(lv_block||'.GURMENU_OBJ_NAME',CURRENT_RECORD,VISUAL_ATTRIBUTE,vat_name);
  END IF;
 END;
--
--
 PROCEDURE INSERT_INTO_GURMENU (p_item_name IN VARCHAR2) IS
  rg_name  VARCHAR2(30):= 'SELECTION'; 
  rg_id    RECORDGROUP := FIND_GROUP(rg_name);
  lv_block VARCHAR2(30):= SUBSTR(p_item_name,1,INSTR(p_item_name,'.') -1);
  lv_item  VARCHAR2(30):= p_item_name;
  rg_row   NUMBER(5);
 BEGIN
  IF NOT ID_NULL(rg_id) THEN
    rg_row := TO_NUMBER(GET_GROUP_ROW_COUNT(rg_id));
    IF rg_row > 0 THEN
      GO_BLOCK(lv_block);
--
      FOR rg_rec IN 1..rg_row LOOP
        IF GET_GROUP_CHAR_CELL('SELECTION.INDICATOR',rg_rec) = 'Y' THEN 
          IF NAME_IN(p_item_name) IS NOT NULL THEN
            CREATE_RECORD;
          END IF;
          COPY(GET_GROUP_CHAR_CELL('SELECTION.OBJ_NAME',rg_rec),lv_item);
        END IF;
      END LOOP;
--
      DELETE_GROUP_ROW(rg_id,ALL_ROWS);
      EXECUTE_TRIGGER('QUERY_DATA');
    END IF;
  END IF;
 END;
--
--
 PROCEDURE DELETE_FROM_GURMENU (p_item_name IN VARCHAR2) IS
  rg_name   VARCHAR2(30):= 'DELETE';
  rg_id     RECORDGROUP := FIND_GROUP(rg_name);
  lv_block  VARCHAR2(30):= SUBSTR(p_item_name,1,INSTR(p_item_name,'.') -1);
  obj_name  VARCHAR2(30);
  rg_row    NUMBER(5);
  rec_num   NUMBER(4); 
 BEGIN
   IF NOT ID_NULL(rg_id) THEN
     rg_row := TO_NUMBER(GET_GROUP_ROW_COUNT(rg_id));
     IF rg_row > 0 THEN
       GO_BLOCK(lv_block);
--
       FOR rg_rec IN 1..rg_row LOOP
         IF GET_GROUP_CHAR_CELL('DELETE.INDICATOR',rg_rec) = 'Y' THEN 
           obj_name := GET_GROUP_CHAR_CELL  ('DELETE.OBJ_NAME',rg_rec);
           rec_num  := GET_GROUP_NUMBER_CELL('DELETE.TRIG_REC',rg_rec);
           FIRST_RECORD;
--
           LOOP
             IF NAME_IN(p_item_name) = obj_name AND
               rec_num = TO_NUMBER(NAME_IN(lv_block||'.GURMENU_COUNT')) THEN
               DELETE_RECORD;
               EXIT;
             ELSE
               IF NAME_IN('SYSTEM.LAST_RECORD') = 'TRUE' THEN 
                 EXIT;
               END IF;
             END IF;
             NEXT_RECORD;
           END LOOP;
--
         END IF;
       END LOOP;
       DELETE_GROUP_ROW(rg_id,ALL_ROWS);
     END IF;
   END IF;
 END;
--
END G$_MULTI_REC_SELECTION;
		*/
				private NNumber increment = toNumber(0);
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NNumber uniqueCounter()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
			increment = increment.add(1);
			return increment;
//
			//this.getLogger().trace(this, "F2J : uniqueCounter function is not completely migrated yet. Please read the Migration Guide.");
			
			
			//return NNumber.getNull();
		}
/* <p>
		* 
		* 
/* </p>
		* @param groupName
		*/
		public void multiRecordChoice(NString groupName) {
			multiRecordChoice(groupName, toStr("GUBOBJS.GUBOBJS_NAME"), toStr("SYSTEM.TRIGGER_RECORD"));
			
		}

/* <p>
		* 
		* 
/* </p>
		* @param groupName
		* @param unValue
		*/
		public void multiRecordChoice(NString groupName, NString unValue) {
			multiRecordChoice(groupName, unValue, toStr("SYSTEM.TRIGGER_RECORD"));
		}

/* <p>
		* 
		* 
/* </p>
		* @param groupName
		* @param unValue
		* @param unCount
		*/
		public void multiRecordChoice(NString groupName, NString unValue, NString unCount)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgName = groupName;
			NString getSet = toStr("Y");
			NNumber rgRow= NNumber.getNull();
			createRg(rgName);
			rgRow = toNumber(getGroupRowCount(rgName));
			// 
			if ( rgRow.greater(0) )
			{
				for ( int rgRec = 1; rgRec <= rgRow.toInt32(); rgRec++ )
				{
					if ( getGroupCharCell(rgName.append(".OBJ_NAME"), rgRec).equals(getNameIn(unValue)) && getGroupNumberCell(rgName.append(".TRIG_REC"), rgRec).equals(getNameIn(unCount)) )
					{
						getSet = toStr("N");
						// 
						if ( getGroupCharCell(rgName.append(".INDICATOR"), rgRec).equals("Y") )
						{
							setGroupCharCell(rgName.append(".INDICATOR"), toInt(rgRec), toStr("N"));
						}
						else {
							setGroupCharCell(rgName.append(".INDICATOR"), toInt(rgRec), toStr("Y"));
						}
							break;
					}
				}
				// 
				if ( getSet.equals("Y") )
				{
					executeAction("Add_To_MRC");
				}
			}
			else {
				executeAction("Add_To_MRC");
			}
			// 
			if ( getItemStyleClass(getCursorItem(), ItemServices.CURRENT_RECORD).equals("LOCAL_TEXT") 
					|| getItemStyleClass(getCursorItem(), ItemServices.CURRENT_RECORD).isNull() )
			{
				checkForBlk(toStr("LOCAL_HIGHLITE_TEXT"));
			}
			else {
				checkForBlk(toStr("LOCAL_TEXT"));
			}

			this.getLogger().trace(this, "F2J : multiRecordChoice procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param rgName
		*/
		public void createRg(NString rgName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
			ValueSet rgId= null;
			ValueSetColumn rcId= null;
			rgId = findGroup(rgName);
			if ( (rgId == null) )
			{
				rgId = createGroup(rgName);
				rcId = addGroupColumn(rgId, "NAME", ValueSetColumn.CHAR_COL, 30);
				rcId = addGroupColumn(rgId, "OBJ_NAME", ValueSetColumn.CHAR_COL, 30);
				rcId = addGroupColumn(rgId, "OBJT_CODE", ValueSetColumn.CHAR_COL, 30);
				rcId = addGroupColumn(rgId, "TRIG_REC", ValueSetColumn.NUMBER_COL, 4);
				rcId = addGroupColumn(rgId, "INDICATOR", ValueSetColumn.CHAR_COL, 30);
			}
//
			this.getLogger().trace(this, "F2J : createRg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
/* </p>
		* @param vatName
		*/
		public void checkForBlk(NString vatName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
			NString lvBlock = getCursorBlock();
			if ( lvBlock.equals("GUBOBJS") )
			{
                

				setItemStyleClass("GUBOBJS.GUBOBJS_NAME", ItemServices.CURRENT_RECORD, vatName.toString());
				setItemStyleClass("GUBOBJS.GUBOBJS_DESC", ItemServices.CURRENT_RECORD, vatName.toString());
			}
			else if ( inStr(lvBlock, toStr("GURMENU")).greater(0) ) {
				
				setItemStyleClass(lvBlock.append(".DISPLAY_DESC"), ItemServices.CURRENT_RECORD, vatName.toString());
				setItemStyleClass(lvBlock.append(".GURMENU_OBJ_NAME"), ItemServices.CURRENT_RECORD, vatName.toString());
			}
//
			this.getLogger().trace(this, "F2J : checkForBlk procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pItemName
		*/
		public void insertIntoGurmenu(NString pItemName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgName = toStr("SELECTION");
			ValueSet rgId = findGroup(rgName);
			NString lvBlock = substring(pItemName, toInt(1), inStr(pItemName, toStr(".")).subtract(1));
			NString lvItem = pItemName;
			NNumber rgRow= NNumber.getNull();
			if ( !(rgId == null) )
			{
				rgRow = toNumber(getGroupRowCount(rgId));
				if ( rgRow.greater(0) )
				{
					goBlock(lvBlock);
					// 
					for ( int rgRec = 1; rgRec <= rgRow.toInt32(); rgRec++ )
					{
						if ( getGroupCharCell("SELECTION.INDICATOR", rgRec).equals("Y") )
						{
							if ( !getNameIn(pItemName).isNull() )
							{
								createRecord();
							}
							copy(getGroupCharCell("SELECTION.OBJ_NAME", rgRec),lvItem);
						}
					}
					// 
					deleteGroupRow(rgId, ValueSet.ALL_ROWS);
					executeAction("QUERY_DATA");
				}
			}

//			System.err.println("F2J : insertIntoGurmenu procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pItemName
		*/
		public void deleteFromGurmenu(NString pItemName)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString rgName = toStr("DELETE");
			ValueSet rgId = findGroup(rgName);
			NString lvBlock = substring(pItemName, toInt(1), inStr(pItemName, toStr(".")).subtract(1));
			NString objName= NString.getNull();
			NNumber rgRow= NNumber.getNull();
			NNumber recNum= NNumber.getNull();
			if ( !(rgId == null) )
			{
				rgRow = toNumber(getGroupRowCount(rgId));
				if ( rgRow.greater(0) )
				{
					goBlock(lvBlock);
					// 
					for ( int rgRec = 1; rgRec <= rgRow.toInt32(); rgRec++ )
					{
						if ( getGroupCharCell("DELETE.INDICATOR", rgRec).equals("Y") )
						{
							objName = getGroupCharCell("DELETE.OBJ_NAME", rgRec);
							recNum = getGroupNumberCell("DELETE.TRIG_REC", rgRec);
							firstRecord();
							// 
							while (true) {
								NNumber testRecNum = toNumber(getNameIn(lvBlock.append(".GURMENU_COUNT")));
								if ( getNameIn(pItemName).equals(objName) && ((recNum.isNull() && testRecNum.isNull()) || recNum.equals(testRecNum)) )
								{
									deleteRecord();
										break;
								}
								else {
									if ( isInLastRecord() )
									{
											break;
									}
								}
								nextRecord();
							}
						}
					}
					deleteGroupRow(rgId, ValueSet.ALL_ROWS);
				}
			}

//			System.err.println("F2J : deleteFromGurmenu procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}
		
	
	
}
