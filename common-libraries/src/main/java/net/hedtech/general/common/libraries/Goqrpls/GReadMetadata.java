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

public class GReadMetadata extends AbstractSupportCodeObject {
	

	public GReadMetadata(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_READ_METADATA
	/*
	PACKAGE G$_read_metadata IS
  procedure read_metadata;
  procedure delete_metadata(frm_name Varchar2);
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_READ_METADATA
		/*
		PACKAGE BODY g$_read_metadata IS
--
  procedure delete_metadata(frm_name Varchar2) is
  begin
    delete gobwfdd
     where gobwfdd_appl_name = frm_name;
  end delete_metadata;
--
  procedure read_metadata is
  
frm_name           varchar2(8);
blk_name           varchar2(80);
item_name          varchar2(80);
item_first         varchar2(80);
item_last          varchar2(80);
--
hint_text_x        varchar2(1000);
base_table_x       varchar2(1);
required_ind       varchar2(1);
item_type_x        varchar2(20);
item_dtype         varchar2(20);
max_length_x       number;
range_low_x        number;
range_high_x       number;
rec_displayed      number;
rec_single_ind     varchar2(1);
enterable_ind      varchar2(1);
case_x             varchar2(9);
format_mask_x      varchar2(30);
dtbs_name          varchar2(61);
--
obj_id              number;
curr_block  VARCHAR2(80) := GET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),FIRST_BLOCK);
block_found BOOLEAN  := FALSE;
--

--  LOCAL PROCEDURES

  procedure p_gen_new_appl_id (appl_name VARCHAR2,next_id IN OUT NUMBER) is

    cursor get_next_seq is 
     select nvl(max(gobwfdd_id),0)+1 from gobwfdd;

  begin

     open get_next_seq;
     fetch get_next_seq into next_id;
     close get_next_seq;

    insert into gobwfdd(gobwfdd_id,gobwfdd_product_type,gobwfdd_appl_name,
                        gobwfdd_user_id,gobwfdd_activity_date) values
                              (
                                next_id,
                                'ORACLE FORMS',
                                appl_name,
                                user,
                                sysdate                               
                               );

  end p_gen_new_appl_id;


--
begin
  frm_name  := get_application_property(CURRENT_FORM_NAME);
--
  delete_metadata(frm_name);
--
  p_gen_new_appl_id (frm_name,obj_id);
--
  WHILE (get_block_property(curr_block,NEXTBLOCK)) <> curr_block LOOP
    blk_name := curr_block;

    if instr(blk_name,'G$') >= 1 or blk_name in ('FORM_HEADER','BUTTON_CONTROL_BLOCK')
      then goto nxt_blk; 
    end if;
--
    rec_displayed := get_block_property(curr_block,RECORDS_DISPLAYED);
--
    if rec_displayed > 1 then
      rec_single_ind := 'N';
    else
      rec_single_ind := 'Y';
    end if;
--
    item_first := blk_name||'.'||get_block_property(blk_name, FIRST_ITEM);
    item_last :=  blk_name||'.'||get_block_property(blk_name, LAST_ITEM);
    item_name := item_first;
--
    while (get_item_property(item_name,NEXTITEM ) <> item_first) LOOP
      if get_item_property(item_name,ITEM_TYPE) in 
         ( 'TEXT ITEM', 'CHECKBOX', 'LIST' ) and 
         get_item_property(item_name,ENABLED) in ('TRUE') and
         get_item_property(item_name,NAVIGABLE) = 'TRUE'  then
        hint_text_x := get_item_property(item_name, HINT_TEXT);
--
     	if get_item_property(item_name, BASE_TABLE) = 'TRUE' then
        dtbs_name := substr(item_name,instr(item_name,'.')+1,7)||'.'||
                     substr(item_name,instr(item_name,'.')+1);
      else
        dtbs_name := '';
      end if;
--
     	if get_item_property(item_name, REQUIRED) = 'TRUE' then
        required_ind := 'Y';
     	else
        required_ind := 'N';
    	end if;
--
     	if get_item_property(item_name, NAVIGABLE) = 'TRUE' then
        enterable_ind := 'Y';
     	else
        enterable_ind := 'N';
    	end if;
--
    	item_type_x := get_item_property(item_name,ITEM_TYPE);
    	item_dtype := get_item_property(item_name,DATATYPE);
--
      if item_dtype in ('NUMBER','INTEGER','RNUMBER','RINT','MONEY','RMONEY') then
        item_dtype := 'NUMBER';
      elsif item_dtype in ('DATE','DATETIME') then
        item_dtype := 'DATE';
      end if;
--
    	max_length_x := get_item_property(item_name,MAX_LENGTH);
--
      if get_item_property(item_name,ITEM_TYPE) = 'TEXT ITEM' then
      	range_low_x :=  get_item_property(item_name,RANGE_LOW);
      	range_high_x :=  get_item_property(item_name,RANGE_HIGH);
      else
      	range_low_x :=  '';
      	range_high_x := '';
      end if;
--
      if get_item_property(item_name,ITEM_TYPE) = 'TEXT ITEM' then
        case_x := get_item_property(item_name,CASE_RESTRICTION);
        format_mask_x := get_item_property(item_name,FORMAT_MASK);
      else
        case_x := '';
        format_mask_x := '';
      end if;
--
      insert into gorwfdd (gorwfdd_id,gorwfdd_element_name,gorwfdd_element_type,
                           gorwfdd_element_dtype,gorwfdd_length,
                           gorwfdd_required_ind,gorwfdd_multi_line_ind,
                           gorwfdd_database_element,gorwfdd_element_hint,
                           gorwfdd_low_range, gorwfdd_high_range,
                           gorwfdd_format_mask,gorwfdd_case,gorwfdd_alignment,
                           gorwfdd_list_appl_name,gorwfdd_list_table_name,
                           gorwfdd_list_column_name,
                           gorwfdd_list_desc_column_name,gorwfdd_list_where_clause,
                           gorwfdd_user_id,gorwfdd_activity_date) 
                   values (obj_id,item_name,item_type_x,item_dtype,max_length_x,
                           required_ind,rec_single_ind,dtbs_name,hint_text_x,
                           range_low_x,range_high_x,format_mask_x,case_x,'',
                           '','','','','',user,sysdate);
--
    end if;
--
    item_name := blk_name||'.'||get_item_property(item_name, NEXTITEM);
--
    if item_name = item_last then
      if get_item_property(item_name,ITEM_TYPE) in 
         ( 'TEXT ITEM', 'CHECKBOX', 'LIST' ) and 
         get_item_property(item_name,ENABLED) in ('TRUE') and
         get_item_property(item_name,NAVIGABLE) = 'TRUE'  then
        hint_text_x := get_item_property(item_name, HINT_TEXT);
--
      	if get_item_property(item_name, BASE_TABLE) = 'TRUE' then
          dtbs_name := substr(item_name,instr(item_name,'.')+1,7)||'.'||
                       substr(item_name,instr(item_name,'.')+1);
        else
          dtbs_name := '';
      	end if;
--
      	if get_item_property(item_name, REQUIRED) = 'TRUE' then
          required_ind := 'Y';
       	else
          required_ind := 'N';
      	end if;
--
     	  if get_item_property(item_name, NAVIGABLE) = 'TRUE' then
          enterable_ind := 'Y';
      	else
          enterable_ind := 'N';
      	end if;
--
    	  item_type_x := get_item_property(item_name,ITEM_TYPE);
      	item_dtype := get_item_property(item_name,DATATYPE);
--
        if item_dtype in ('NUMBER','INTEGER','RNUMBER','RINTEGER','MONEY','RMONEY') then
          item_dtype := 'NUMBER';
        elsif item_dtype in ('DATE','DATETIME') then
          item_dtype := 'DATE';
        end if;
--
      	max_length_x := get_item_property(item_name,MAX_LENGTH);
--
        if get_item_property(item_name,ITEM_TYPE) = 'TEXT ITEM' then
    	    range_low_x :=  get_item_property(item_name,RANGE_LOW);
        	range_high_x :=  get_item_property(item_name,RANGE_HIGH);
        else
    	    range_low_x := '';
        	range_high_x := '';
        end if;
--
        if get_item_property(item_name,ITEM_TYPE) = 'TEXT ITEM' then
          case_x := get_item_property(item_name,CASE_RESTRICTION);
          format_mask_x := get_item_property(item_name,FORMAT_MASK);
        else
          case_x := '';
          format_mask_x := '';
        end if;
--
        insert into gorwfdd(gorwfdd_id,gorwfdd_element_name,gorwfdd_element_type,
                            gorwfdd_element_dtype,gorwfdd_length,
                            gorwfdd_required_ind,gorwfdd_multi_line_ind,
                            gorwfdd_database_element,gorwfdd_element_hint,
                            gorwfdd_low_range, gorwfdd_high_range,
                            gorwfdd_format_mask,gorwfdd_case,gorwfdd_alignment,
                            gorwfdd_list_appl_name,gorwfdd_list_table_name,
                            gorwfdd_list_column_name,
                            gorwfdd_list_desc_column_name,gorwfdd_list_where_clause,
                            gorwfdd_user_id,gorwfdd_activity_date) 
                    values (obj_id,item_name,item_type_x,item_dtype,max_length_x,
                            required_ind,rec_single_ind,'',hint_text_x,
                            range_low_x,range_high_x,format_mask_x,case_x,'',
                            '','','','','',user,sysdate);
        END if;
      END if;
    END LOOP;
-- 
    << nxt_blk>>
    curr_block := get_block_property(curr_block, NEXTBLOCK);
  END LOOP;
--                              
  FORMS_DDL('begin commit; end;');
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    MESSAGE( G$_NLS.Get('GOQRPLS-0122', 'LIB','Internal Error') ,ACKNOWLEDGE);
END read_metadata;
END;
		*/
		/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param frmName
		*/
		public void deleteMetadata(NString frmName)
		{
			int rowCount = 0;
			String sql1 = "DELETE FROM gobwfdd " +
	" WHERE gobwfdd_appl_name = :P_FRM_NAME";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("P_FRM_NAME", frmName);
			rowCount = command1.execute();
		}
/* <p>
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void readMetadata()
		{
			int rowCount = 0;
			NString frmName= NString.getNull();
			NString blkName= NString.getNull();
			NString itemName= NString.getNull();
			NString itemFirst= NString.getNull();
			NString itemLast= NString.getNull();
			// 
			NString hintTextX= NString.getNull();
			NString baseTableX= NString.getNull();
			NString requiredInd= NString.getNull();
			NString itemTypeX= NString.getNull();
			NString itemDtype= NString.getNull();
			NNumber maxLengthX= NNumber.getNull();
			NNumber rangeLowX= NNumber.getNull();
			NNumber rangeHighX= NNumber.getNull();
			NNumber recDisplayed= NNumber.getNull();
			NString recSingleInd= NString.getNull();
			NString enterableInd= NString.getNull();
			NString caseX= NString.getNull();
			NString formatMaskX= NString.getNull();
			NString dtbsName= NString.getNull();
			// 
			NNumber objId= NNumber.getNull();
			NString currBlock = getFormFirstBlock(getCurrentTaskName());
			NBool blockFound = toBool(NBool.False);
			try
			{
				frmName = toStr(getCurrentTaskName());
				// 
				deleteMetadata(frmName);
				// 
				Ref<NNumber> nextId_ref = new Ref<NNumber>(objId);
				ReadMetadata_pGenNewApplId_Local(frmName, nextId_ref);
				objId = nextId_ref.val;
				// 
				while ( (getBlockNextDeclaredBlock(currBlock)).notEquals(currBlock)) {
					blkName = currBlock;
					if ( inStr(blkName, toStr("G$")).greaterOrEquals(1) || in(blkName, "FORM_HEADER", "BUTTON_CONTROL_BLOCK").getValue() )
					{
						currBlock = getBlockNextDeclaredBlock(currBlock);
						continue;
					}
					// 
					// F2J_NOT_SUPPORTED : The property "BLOCK's RECORDS_DISPLAYED" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin31".
					//					recDisplayed = toNumber(SupportClasses.FORMS40.GetBlockProperty(currBlock, SupportClasses.Property.RECORDS_DISPLAYED));
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'BLOCK's RECORDS_DISPLAYED' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin31'.");
					
					
					// 
					if ( recDisplayed.greater(1) )
					{
						recSingleInd = toStr("N");
					}
					else {
						recSingleInd = toStr("Y");
					}
					// 
					itemFirst = blkName.append(".").append(getBlockFirstItem(blkName));
					itemLast = blkName.append(".").append(getBlockLastItem(blkName));
					itemName = itemFirst;
					// 
					while ((getItemNextItem(itemName).notEquals(itemFirst))) {
						// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
						if ( in(getItemType(itemName), "TEXT ITEM", "CHECKBOX", "LIST").getValue() && in(getItemEnabled(itemName).toString().toUpperCase(), "TRUE").getValue() && getItemNavigable(itemName).equals("TRUE") )
						{
							hintTextX = getItemHint(itemName);
							// 
							if ( SupportClasses.FORMS40.GetItemProperty(itemName, baseTable).equals("TRUE") )
							{
								// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
								dtbsName = substring(itemName, inStr(itemName, toStr(".")).add(1), toInt(7)).append(".").append(substring(itemName, inStr(itemName, toStr(".")).add(1)));
							}
							else {
								dtbsName = toStr("");
							}
							// 
							if ( getItemRequired(itemName).equals("TRUE") )
							{
								requiredInd = toStr("Y");
							}
							else {
								requiredInd = toStr("N");
							}
							// 
							if ( getItemNavigable(itemName).equals("TRUE") )
							{
								enterableInd = toStr("Y");
							}
							else {
								enterableInd = toStr("N");
							}
							// 
							itemTypeX = getItemType(itemName);
							itemDtype = getItemDataType(itemName);
							// 
							if ( in(itemDtype, "NUMBER", "INTEGER", "RNUMBER", "RINT", "MONEY", "RMONEY").getValue() )
							{
								itemDtype = toStr("NUMBER");
							}
							else if ( in(itemDtype, "DATE", "DATETIME").getValue() ) {
								itemDtype = toStr("DATE");
							}
							// 
							// F2J_NOT_SUPPORTED : The property "ITEM's MAX_LENGTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
							//							maxLengthX = toNumber(SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.MAX_LENGTH));
							this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's MAX_LENGTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
							
							
							// 
							if ( getItemType(itemName).equals("TEXT ITEM") )
							{
								// F2J_NOT_SUPPORTED : The property "ITEM's RANGE_LOW" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
								//								rangeLowX = toNumber(SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.RANGE_LOW));
								this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's RANGE_LOW' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
								
								
								// F2J_NOT_SUPPORTED : The property "ITEM's RANGE_HIGH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
								//								rangeHighX = toNumber(SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.RANGE_HIGH));
								this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's RANGE_HIGH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
								
								
							}
							else {
								rangeLowX = toNumber("");
								rangeHighX = toNumber("");
							}
							// 
							if ( getItemType(itemName).equals("TEXT ITEM") )
							{
								// F2J_NOT_SUPPORTED : The property "ITEM's CASE_RESTRICTION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
								//								caseX = SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.CASE_RESTRICTION);
								this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's CASE_RESTRICTION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
								
								
								formatMaskX = getItemFormatMask(itemName);
							}
							else {
								caseX = toStr("");
								formatMaskX = toStr("");
							}
							// 
							String sql2 = "INSERT INTO gorwfdd " +
	"(gorwfdd_id, gorwfdd_element_name, gorwfdd_element_type, gorwfdd_element_dtype, gorwfdd_length, gorwfdd_required_ind, gorwfdd_multi_line_ind, gorwfdd_database_element, gorwfdd_element_hint, gorwfdd_low_range, gorwfdd_high_range, gorwfdd_format_mask, gorwfdd_case, gorwfdd_alignment, gorwfdd_list_appl_name, gorwfdd_list_table_name, gorwfdd_list_column_name, gorwfdd_list_desc_column_name, gorwfdd_list_where_clause, gorwfdd_user_id, gorwfdd_activity_date)" +
	"VALUES (:P_OBJ_ID, :P_ITEM_NAME, :P_ITEM_TYPE_X, :P_ITEM_DTYPE, :P_MAX_LENGTH_X, :P_REQUIRED_IND, :P_REC_SINGLE_IND, :P_DTBS_NAME, :P_HINT_TEXT_X, :P_RANGE_LOW_X, :P_RANGE_HIGH_X, :P_FORMAT_MASK_X, :P_CASE_X, '', '', '', '', '', '', user, sysdate)";
							DataCommand command2 = new DataCommand(sql2);
							//Setting query parameters
							command2.addParameter("P_OBJ_ID", objId);
							command2.addParameter("P_ITEM_NAME", itemName);
							command2.addParameter("P_ITEM_TYPE_X", itemTypeX);
							command2.addParameter("P_ITEM_DTYPE", itemDtype);
							command2.addParameter("P_MAX_LENGTH_X", maxLengthX);
							command2.addParameter("P_REQUIRED_IND", requiredInd);
							command2.addParameter("P_REC_SINGLE_IND", recSingleInd);
							command2.addParameter("P_DTBS_NAME", dtbsName);
							command2.addParameter("P_HINT_TEXT_X", hintTextX);
							command2.addParameter("P_RANGE_LOW_X", rangeLowX);
							command2.addParameter("P_RANGE_HIGH_X", rangeHighX);
							command2.addParameter("P_FORMAT_MASK_X", formatMaskX);
							command2.addParameter("P_CASE_X", caseX);
							rowCount = command2.execute();
						}
						// 
						itemName = blkName.append(".").append(getItemNextItem(itemName));
						// 
						if ( itemName.equals(itemLast) )
						{
							// F2J_TODO : Check if the function used in the expression below may be called more than once. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#FunctionUsedInIn".
							if ( in(getItemType(itemName), "TEXT ITEM", "CHECKBOX", "LIST").getValue() && in(getItemEnabled(itemName).toString().toUpperCase(), "TRUE").getValue() && getItemNavigable(itemName).equals("TRUE") )
							{
								hintTextX = getItemHint(itemName);
								// 
								if ( SupportClasses.FORMS40.GetItemProperty(itemName, baseTable).equals("TRUE") )
								{
									// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
									dtbsName = substring(itemName, inStr(itemName, toStr(".")).add(1), toInt(7)).append(".").append(substring(itemName, inStr(itemName, toStr(".")).add(1)));
								}
								else {
									dtbsName = toStr("");
								}
								// 
								if ( getItemRequired(itemName).equals("TRUE") )
								{
									requiredInd = toStr("Y");
								}
								else {
									requiredInd = toStr("N");
								}
								// 
								if ( getItemNavigable(itemName).equals("TRUE") )
								{
									enterableInd = toStr("Y");
								}
								else {
									enterableInd = toStr("N");
								}
								// 
								itemTypeX = getItemType(itemName);
								itemDtype = getItemDataType(itemName);
								// 
								if ( in(itemDtype, "NUMBER", "INTEGER", "RNUMBER", "RINTEGER", "MONEY", "RMONEY").getValue() )
								{
									itemDtype = toStr("NUMBER");
								}
								else if ( in(itemDtype, "DATE", "DATETIME").getValue() ) {
									itemDtype = toStr("DATE");
								}
								// 
								// F2J_NOT_SUPPORTED : The property "ITEM's MAX_LENGTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
								//								maxLengthX = toNumber(SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.MAX_LENGTH));
								this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's MAX_LENGTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
								
								
								// 
								if ( getItemType(itemName).equals("TEXT ITEM") )
								{
									// F2J_NOT_SUPPORTED : The property "ITEM's RANGE_LOW" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
									//									rangeLowX = toNumber(SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.RANGE_LOW));
									this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's RANGE_LOW' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
									
									
									// F2J_NOT_SUPPORTED : The property "ITEM's RANGE_HIGH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
									//									rangeHighX = toNumber(SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.RANGE_HIGH));
									this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's RANGE_HIGH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
									
									
								}
								else {
									rangeLowX = toNumber("");
									rangeHighX = toNumber("");
								}
								// 
								if ( getItemType(itemName).equals("TEXT ITEM") )
								{
									// F2J_NOT_SUPPORTED : The property "ITEM's CASE_RESTRICTION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
									//									caseX = SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.CASE_RESTRICTION);
									this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'ITEM's CASE_RESTRICTION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQRPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
									
									
									formatMaskX = getItemFormatMask(itemName);
								}
								else {
									caseX = toStr("");
									formatMaskX = toStr("");
								}
								// 
								String sql3 = "INSERT INTO gorwfdd " +
	"(gorwfdd_id, gorwfdd_element_name, gorwfdd_element_type, gorwfdd_element_dtype, gorwfdd_length, gorwfdd_required_ind, gorwfdd_multi_line_ind, gorwfdd_database_element, gorwfdd_element_hint, gorwfdd_low_range, gorwfdd_high_range, gorwfdd_format_mask, gorwfdd_case, gorwfdd_alignment, gorwfdd_list_appl_name, gorwfdd_list_table_name, gorwfdd_list_column_name, gorwfdd_list_desc_column_name, gorwfdd_list_where_clause, gorwfdd_user_id, gorwfdd_activity_date)" +
	"VALUES (:P_OBJ_ID, :P_ITEM_NAME, :P_ITEM_TYPE_X, :P_ITEM_DTYPE, :P_MAX_LENGTH_X, :P_REQUIRED_IND, :P_REC_SINGLE_IND, '', :P_HINT_TEXT_X, :P_RANGE_LOW_X, :P_RANGE_HIGH_X, :P_FORMAT_MASK_X, :P_CASE_X, '', '', '', '', '', '', user, sysdate)";
								DataCommand command3 = new DataCommand(sql3);
								//Setting query parameters
								command3.addParameter("P_OBJ_ID", objId);
								command3.addParameter("P_ITEM_NAME", itemName);
								command3.addParameter("P_ITEM_TYPE_X", itemTypeX);
								command3.addParameter("P_ITEM_DTYPE", itemDtype);
								command3.addParameter("P_MAX_LENGTH_X", maxLengthX);
								command3.addParameter("P_REQUIRED_IND", requiredInd);
								command3.addParameter("P_REC_SINGLE_IND", recSingleInd);
								command3.addParameter("P_HINT_TEXT_X", hintTextX);
								command3.addParameter("P_RANGE_LOW_X", rangeLowX);
								command3.addParameter("P_RANGE_HIGH_X", rangeHighX);
								command3.addParameter("P_FORMAT_MASK_X", formatMaskX);
								command3.addParameter("P_CASE_X", caseX);
								rowCount = command3.execute();
							}
						}
					}
					
					currBlock = getBlockNextBlock(currBlock);
				}
				//                               
				formsDDL("begin commit; end;");
			}
			catch(Exception  e)
			{
				rollback();
				errorMessage(GNls.Fget(toStr("GOQRPLS-0122"), toStr("LIB"), toStr("Internal Error")), OutputMessageUserResponse.ACKNOWLEDGE);
			}
		}
/* <p>
		* 
		*   LOCAL PROCEDURES
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param applName
		* @param nextId
		*/
		public void ReadMetadata_pGenNewApplId_Local(NString applName, Ref<NNumber> nextId)
		{
			int rowCount = 0;
			String sqlgetNextSeq = "SELECT nvl(max(gobwfdd_id), 0) + 1 " +
	" FROM gobwfdd ";
			DataCursor getNextSeq = new DataCursor(sqlgetNextSeq);
			try {
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable getNextSeq.
				getNextSeq.open();
				ResultSet getNextSeqResults = getNextSeq.fetchInto();
				if ( getNextSeqResults != null ) {
					nextId.val = getNextSeqResults.getNumber(0);
				}
				getNextSeq.close();
				String sql4 = "INSERT INTO gobwfdd " +
	"(gobwfdd_id, gobwfdd_product_type, gobwfdd_appl_name, gobwfdd_user_id, gobwfdd_activity_date)" +
	"VALUES (:P_NEXT_ID, 'ORACLE FORMS', :P_APPL_NAME, user, sysdate)";
				DataCommand command4 = new DataCommand(sql4);
				//Setting query parameters
				command4.addParameter("P_NEXT_ID", nextId);
				command4.addParameter("P_APPL_NAME", applName);
				rowCount = command4.execute();
				}finally{
					getNextSeq.close();
				}
		}
		
	
	
}
