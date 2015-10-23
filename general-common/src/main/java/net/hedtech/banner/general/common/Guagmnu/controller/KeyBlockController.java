package net.hedtech.banner.general.common.Guagmnu.controller;
 
import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
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
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.general.common.Guagmnu.model.*;
import net.hedtech.banner.general.common.Guagmnu.*;
import net.hedtech.banner.general.common.Guagmnu.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class KeyBlockController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public KeyBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuagmnuTask getTask() {
		return (GuagmnuTask)super.getTask();
	}

	public GuagmnuModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.PRE-QUERY
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/
/* F2N_WARNING: this method is commented because it matches a model event in a business object without a data layer representation
		@BeforeQuery
		public void keyBlock_BeforeQuery(QueryEvent args)
		{
			
			}

		*/
		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.POST-BLOCK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void keyBlock_blockOut()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK
		 IF GET_VIEW_PROPERTY('TREE_CANVAS',VISIBLE) = 'TRUE' THEN
  GO_BLOCK('TREE');
ELSE
	GO_BLOCK('SITE_MAP1');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void keyBlock_NextBlock()
		{
			
				if ( getViewVisible("TREE_CANVAS").equals("TRUE") )
				{
					goBlock(toStr("TREE"));
				}
				else {
					goBlock(toStr("SITE_MAP1"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-PRVBLK
		 GO_BLOCK('MESSAGES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void keyBlock_PreviousBlock()
		{
			
				goBlock(toStr("MESSAGES"));
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.WHEN-MOUSE-CLICK
		 BEGIN
  G$_RECONNECT;
  G$_CHECK_FAILURE;
--
  GO_ITEM('KEY_BLOCK.NEXT_SELECTION');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK")
		public void keyBlock_click()
		{
			
				getTask().getGoqrpls().gReconnect();
				getTask().getGoqrpls().gCheckFailure();
				// 
				goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
			}

		
		/* Original PL/SQL code code for TRIGGER NEXT_SELECTION.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_RECONNECT;
  G$_CHECK_FAILURE;
--
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_SELECTION.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="NEXT_SELECTION")
		public void nextSelection_doubleClick()
		{
			
				getTask().getGoqrpls().gReconnect();
				getTask().getGoqrpls().gCheckFailure();
				// 
				getTask().getGoqrpls().getGSearch().whenMouseClick();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_SELECTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NEXT_SELECTION", function=KeyFunction.ITEM_CHANGE)
		public void nextSelection_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER NEXT_SELECTION.POST-TEXT-ITEM
		 BEGIN
  G$_RECONNECT;
  G$_CHECK_FAILURE;
--
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_SELECTION.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="NEXT_SELECTION", function=KeyFunction.ITEM_OUT)
		public void nextSelection_itemOut()
		{
			
				getTask().getGoqrpls().gReconnect();
				getTask().getGoqrpls().gCheckFailure();
				// 
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER NEXT_SELECTION.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('GUBOBJS_NAME','GUBOBJS_DESC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_SELECTION.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="NEXT_SELECTION")
		public void nextSelection_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("GUBOBJS_NAME"), toStr("GUBOBJS_DESC"));
			}

		
		/* Original PL/SQL code code for TRIGGER NEXT_SELECTION.G$_SEARCH_OPTIONS
		 BEGIN
  DO_FORM_CALL('GUIOBJS');
--
  IF :GLOBAL.MENU_NAME_PARM IS NOT NULL THEN
    COPY(:GLOBAL.MENU_NAME_PARM,'KEY_BLOCK.NEXT_SELECTION');
    :GLOBAL.MENU_NAME_PARM := '';
    GO_ITEM('KEY_BLOCK.NEXT_SELECTION');
    DO_KEY('ENTER');
    G$_CHECK_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_SELECTION.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="NEXT_SELECTION")
		public void nextSelection_GSearchOptions()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				MessagesAdapter messagesElement = (MessagesAdapter)this.getFormModel().getMessages().getRowAdapter(true);


				this.getTask().getServices().doFormCall(messagesElement, toStr("GUIOBJS"));
				// 
				if ( !getGlobal("MENU_NAME_PARM").isNull() )
				{
					copy(getGlobal("MENU_NAME_PARM"),"KEY_BLOCK.NEXT_SELECTION");
					setGlobal("MENU_NAME_PARM", toStr(""));
					goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
					// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.DoKey("ENTER");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER NEXT_SELECTION.KEY-NEXT-ITEM
		 DECLARE
  lv_selection  VARCHAR2(30) := :KEY_BLOCK.NEXT_SELECTION;
BEGIN
  IF lv_selection IS NULL THEN
    RETURN;
  END IF;
--
  G$_RECONNECT;
  G$_CHECK_FAILURE;
--
  :LAST_MENU_ITEM := 0;
--
-- Determine what was entered and what to do with it.
--
  CASE 
    WHEN lv_selection IN ('MENU','TREE') THEN
      EXECUTE_TRIGGER('SHOW_TREE');
      :KEY_BLOCK.NEXT_SELECTION := '';
      RETURN;
--
    WHEN lv_selection IN ('SITE','SITE MAP','SITEMAP') THEN
      EXECUTE_TRIGGER('SHOW_SITEMAP');
      :KEY_BLOCK.NEXT_SELECTION := '';
      RETURN;
--
    WHEN lv_selection = 'REFRESH' THEN
      IF GET_VIEW_PROPERTY('SITEMAP',VISIBLE) = 'TRUE' THEN
        EXECUTE_TRIGGER('SHOW_SITEMAP');
      ELSE
        EXECUTE_TRIGGER('SHOW_TREE');
      END IF;
      :NEXT_SELECTION := '';
      RETURN;
--
    WHEN lv_selection IN ('*PROCESS','*PROCESS1','*PROCESS2','*PROCESS3','*PROCESS4') THEN
      EXECUTE_TRIGGER('WAS_PROCESS_MENU_LOADED');
      IF lv_selection = '*PROCESS' THEN
        NAVIGATE_TREE('',lv_selection);
      ELSE
        NAVIGATE_TREE(lv_selection,'*PROCESS');
      END IF;
      :NEXT_SELECTION := '';
      GO_BLOCK('TREE');
      RETURN;
--
    WHEN lv_selection IN ('*PERSONAL','*MENU') THEN
      NAVIGATE_TREE('',lv_selection);
      :NEXT_SELECTION := '';
      GO_BLOCK('TREE');
      RETURN;
--
-- Show online help
--
    WHEN lv_selection = 'HELP' THEN
      :NEXT_SELECTION := '';
      G$_B2K_WIN_HELP.DISPLAY_HELP;
      G$_CHECK_FAILURE;
--
-- Error message
--
    WHEN lv_selection = 'DBMS_ERROR' THEN
     -- MESSAGE('SQLCODE: ' || SQLCODE || ' DBMS ERROR IS: '||DBMS_ERROR_TEXT, ACKNOWLEDGE);
      MESSAGE(G$_NLS.Get('GUAGMNU-0024','FORM','SQLCODE %01% DBMS ERROR IS %02%,%03%',SQLCODE,DBMS_ERROR_TEXT,ACKNOWLEDGE));
      :KEY_BLOCK.NEXT_SELECTION := '';
      RETURN;
--
-- Quick exit
--
    WHEN lv_selection IN ('EXIT','QUIT') THEN
      CONFIRM_B2K_EXIT;
--
-- Attempt to reload menu form
--
    WHEN lv_selection IN ('GUAGMNU','*MAIN') THEN
      MESSAGE(G$_NLS.Get('GUAGMNU-0025','FORM','*ERROR* Menu is already running; cannot start up another copy.'));
      RAISE FORM_TRIGGER_FAILURE;
--
-- Attempt to reload init form
--
    WHEN lv_selection = 'GUAINIT' THEN
      MESSAGE(G$_NLS.Get('GUAGMNU-0026','FORM','*ERROR* GUAINIT has already been run for this Banner session.'));
      RAISE FORM_TRIGGER_FAILURE;
--
-- Process object, perform code search to identify the object, displaying the lov if more than
-- one object is found, to support wild card searches.
--
    ELSE
      G$_SEARCH.CODE_KEY_NEXT_ITEM;
      G$_CHECK_FAILURE;
      lv_selection := :KEY_BLOCK.NEXT_SELECTION;
--
      IF INSTR(lv_selection,'%') >= 1 THEN
        :KEY_BLOCK.NEXT_SELECTION := '';
        RETURN;
      END IF;
--
      :GLOBAL.MENU_NAME_PARM := '';
      EXECUTE_TRIGGER('CHECK_TYPE');
      G$_CHECK_FAILURE;
    END CASE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_SELECTION.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NEXT_SELECTION", function=KeyFunction.NEXT_ITEM)
		public void nextSelection_keyNexItem()
		{
			
				{
					NString lvSelection = getFormModel().getKeyBlock().getNextSelection();
					if ( lvSelection.isNull() )
					{
						return ;
					}
					// 
					getTask().getGoqrpls().gReconnect();
					getTask().getGoqrpls().gCheckFailure();
					// 
					getFormModel().getKeyBlock().setLastMenuItem(toInt(0));
					// 
					//  Determine what was entered and what to do with it.
					// 
					if (in(lvSelection, "MENU", "TREE").getValue() ==(in(lvSelection, "SITE", "SITE MAP", "SITEMAP").getValue()))
					{
						executeAction("SHOW_SITEMAP");
						getFormModel().getKeyBlock().setNextSelection(toStr(""));
						return ;
					}
					else if (in(lvSelection, "MENU", "TREE").getValue() ==(lvSelection.equals("REFRESH")))
					{
						if ( getViewVisible("SITEMAP").equals("TRUE") )
						{
							executeAction("SHOW_SITEMAP");
						}
						else {
							executeAction("SHOW_TREE");
						}
						getFormModel().getKeyBlock().setNextSelection(toStr(""));
						return ;
					}
					else if (in(lvSelection, "MENU", "TREE").getValue() ==(in(lvSelection, "*PROCESS", "*PROCESS1", "*PROCESS2", "*PROCESS3", "*PROCESS4").getValue()))
					{
						executeAction("WAS_PROCESS_MENU_LOADED");
						if ( lvSelection.equals("*PROCESS") )
						{
							this.getTask().getServices().navigateTree(toStr(""), lvSelection);
						}
						else {
							this.getTask().getServices().navigateTree(lvSelection, toStr("*PROCESS"));
						}
						getFormModel().getKeyBlock().setNextSelection(toStr(""));
						goBlock(toStr("TREE"));
						return ;
					}
					else if (in(lvSelection, "MENU", "TREE").getValue() ==(in(lvSelection, "*PERSONAL", "*MENU").getValue()))
					{
						this.getTask().getServices().navigateTree(toStr(""), lvSelection);
						getFormModel().getKeyBlock().setNextSelection(toStr(""));
						goBlock(toStr("TREE"));
						return ;
					}
					else if (in(lvSelection, "MENU", "TREE").getValue() ==(lvSelection.equals("HELP")))
					{
						getFormModel().getKeyBlock().setNextSelection(toStr(""));
						getTask().getGoqrpls().getGB2kWinHelp().displayHelp();
						getTask().getGoqrpls().gCheckFailure();
					}
					else if (in(lvSelection, "MENU", "TREE").getValue()==(lvSelection.equals("DBMS_ERROR")))
					{
						//  MESSAGE('SQLCODE: ' || SQLCODE || ' DBMS ERROR IS: '||DBMS_ERROR_TEXT, ACKNOWLEDGE);
						errorMessage(GNls.Fget(toStr("GUAGMNU-0024"), toStr("FORM"), toStr("SQLCODE %01% DBMS ERROR IS %02%,%03%"), toStr(errorCode()), errorMessage(),toStr( OutputMessageUserResponse.ACKNOWLEDGE)));
						getFormModel().getKeyBlock().setNextSelection(toStr(""));
						return ;
					}
					else if (in(lvSelection, "MENU", "TREE").getValue() ==(in(lvSelection, "EXIT", "QUIT").getValue()))
					{
						this.getTask().getServices().confirmB2kExit();
					}
					else if (in(lvSelection, "MENU", "TREE").getValue() ==(in(lvSelection, "GUAGMNU", "*MAIN").getValue()))
					{
						errorMessage(GNls.Fget(toStr("GUAGMNU-0025"), toStr("FORM"), toStr("*ERROR* Menu is already running; cannot start up another copy.")));
						throw new ApplicationException();
					}
					else if (in(lvSelection, "MENU", "TREE").getValue()==(lvSelection.equals("GUAINIT")))
					{
						errorMessage(GNls.Fget(toStr("GUAGMNU-0026"), toStr("FORM"), toStr("*ERROR* GUAINIT has already been run for this Banner session.")));
						throw new ApplicationException();
					}
					else {
						getTask().getGoqrpls().getGSearch().codeKeyNextItem();
						getTask().getGoqrpls().gCheckFailure();
						lvSelection = getFormModel().getKeyBlock().getNextSelection();
						// 
						if ( inStr(lvSelection, toStr("%")).greaterOrEquals(1) )
						{
							getFormModel().getKeyBlock().setNextSelection(toStr(""));
							return ;
						}
						// 
						setGlobal("MENU_NAME_PARM", toStr(""));
						executeAction("CHECK_TYPE");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER NEXT_SELECTION.KEY-CQUERY
		 BEGIN
  DO_FORM_CALL('GUAMESG');
--
  :GLOBAL.WIN_TITLE := '';
  :GLOBAL.WIN_X_POS := '';
  :GLOBAL.WIN_Y_POX := '';
  G$_SET_WIN_PROPERTY;
  G$_SET_INST_PROPERTY;
--
  EXECUTE_TRIGGER('INIT_NEXT_SELECTION');
  G$_CHECK_FAILURE;
  GO_ITEM('NEXT_SELECTION');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_SELECTION.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="NEXT_SELECTION", function=KeyFunction.COUNT_QUERY)
		public void nextSelection_TotalResults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				MessagesAdapter messagesElement = (MessagesAdapter)this.getFormModel().getMessages().getRowAdapter(true);


				this.getTask().getServices().doFormCall(messagesElement, toStr("GUAMESG"));
				// 
				setGlobal("WIN_TITLE", toStr(""));
				setGlobal("WIN_X_POS", toStr(""));
				setGlobal("WIN_Y_POX", toStr(""));
				getTask().getGoqrpls().gSetWinProperty();
				getTask().getGoqrpls().gSetInstProperty();
				// 
				executeAction("INIT_NEXT_SELECTION");
				getTask().getGoqrpls().gCheckFailure();
				goItem(toStr("NEXT_SELECTION"));
			}

		
		/* Original PL/SQL code code for TRIGGER NEXT_SELECTION.KEY-NXTREC
		 DECLARE
  last_menu_no    INTEGER(2) := NVL(:KEY_BLOCK.LAST_MENU_ITEM,0);
	menu_item_name  VARCHAR2(30);
	menu_item_value VARCHAR2(30);
BEGIN
  IF last_menu_no < 1 THEN
  	last_menu_no := 10;
  ELSE
  	last_menu_no := last_menu_no - 1;
  END IF;
--
  IF last_menu_no = 0 THEN
    :KEY_BLOCK.LAST_MENU_ITEM := '';
    :KEY_BLOCK.NEXT_SELECTION := '';
    RETURN;
  END IF;
--  	
  FOR i IN REVERSE 1..last_menu_no LOOP
    menu_item_name := 'ACTION.LAST10_' || TO_CHAR(i);
    IF GET_MENU_ITEM_PROPERTY(menu_item_name,VISIBLE) = 'TRUE' THEN
      menu_item_value := NAME_IN('GLOBAL.LAST10_' || TO_CHAR(i));
--
      IF menu_item_value IS NOT NULL THEN
        :KEY_BLOCK.LAST_MENU_ITEM := i;
        :KEY_BLOCK.NEXT_SELECTION := menu_item_value;
        EXIT;
      END IF;
--
    END IF;
  END LOOP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_SELECTION.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD, item="NEXT_SELECTION")
		public void nextSelection_NextRecord()
		{
			
				{
					NInteger lastMenuNo = isNull(getFormModel().getKeyBlock().getLastMenuItem(), 0);
					NString menuItemName= NString.getNull();
					NString menuItemValue= NString.getNull();
					if ( lastMenuNo.lesser(1) )
					{
						lastMenuNo = toInt(10);
					}
					else {
						lastMenuNo = lastMenuNo.subtract(1);
					}
					// 
					if ( lastMenuNo.equals(0) )
					{
						getFormModel().getKeyBlock().setLastMenuItem(toInt(""));
						getFormModel().getKeyBlock().setNextSelection(toStr(""));
						return ;
					}
					//   	
					for ( int i = lastMenuNo.toInt32(); i <= 1; i-- )
					{
						menuItemName = toStr("ACTION.LAST10_").append(toChar(i));
						//if ( getMenuItemVisible(menuItemName).equals("TRUE") )
							if ( getMenuItemVisible(menuItemName.toString()) == true)
						{
							menuItemValue = getNameIn(toStr("GLOBAL.LAST10_").append(toChar(i)));
							// 
							if ( !menuItemValue.isNull() )
							{
								getFormModel().getKeyBlock().setLastMenuItem(toInt(i));
								getFormModel().getKeyBlock().setNextSelection(menuItemValue);
									break;
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER NEXT_SELECTION.KEY-PRVREC
		 DECLARE
  last_menu_no    INTEGER(2) := NVL(:KEY_BLOCK.LAST_MENU_ITEM,0);
	menu_item_name  VARCHAR2(30);
	menu_item_value VARCHAR2(30);
BEGIN
  IF last_menu_no >= 10 THEN
  	last_menu_no := 1;
  ELSE
  	last_menu_no := last_menu_no + 1;
  END IF;
--
  FOR i IN last_menu_no..10 LOOP
    menu_item_name := 'ACTION.LAST10_' || TO_CHAR(i);
    IF GET_MENU_ITEM_PROPERTY(menu_item_name,VISIBLE) = 'TRUE' THEN
      menu_item_value := NAME_IN('GLOBAL.LAST10_' || TO_CHAR(i));
--
      IF menu_item_value IS NOT NULL THEN
        :KEY_BLOCK.LAST_MENU_ITEM := i;
        :KEY_BLOCK.NEXT_SELECTION := menu_item_value;
        EXIT;
      END IF;
--
    ELSE
      :KEY_BLOCK.LAST_MENU_ITEM := 0;
      :KEY_BLOCK.NEXT_SELECTION := '';
    END IF;
  END LOOP;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NEXT_SELECTION.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD, item="NEXT_SELECTION")
		public void nextSelection_PreviousRecord()
		{
			
				{
					NInteger lastMenuNo = isNull(getFormModel().getKeyBlock().getLastMenuItem(), 0);
					NString menuItemName= NString.getNull();
					NString menuItemValue= NString.getNull();
					if ( lastMenuNo.greaterOrEquals(10) )
					{
						lastMenuNo = toInt(1);
					}
					else {
						lastMenuNo = lastMenuNo.add(1);
					}
					// 
					for ( int i = lastMenuNo.toInt32(); i <= 10; i++ )
					{
						menuItemName = toStr("ACTION.LAST10_").append(toChar(i));
						if ( getMenuItemVisible(menuItemName.toString()) ==true )
						{
							menuItemValue = getNameIn(toStr("GLOBAL.LAST10_").append(toChar(i)));
							// 
							if ( !menuItemValue.isNull() )
							{
								getFormModel().getKeyBlock().setLastMenuItem(toInt(i));
								getFormModel().getKeyBlock().setNextSelection(menuItemValue);
									break;
							}
						}
						else {
							getFormModel().getKeyBlock().setLastMenuItem(toInt(0));
							getFormModel().getKeyBlock().setNextSelection(toStr(""));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SELECTION_LIST.WHEN-LIST-CHANGED
		 BEGIN
  IF :SELECTION_LIST IS NOT NULL THEN
    GO_ITEM('NEXT_SELECTION');
    :NEXT_SELECTION := :SELECTION_LIST;
    :SELECTION_LIST := '';
--
    DO_KEY('ENTER');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SELECTION_LIST.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="SELECTION_LIST")
		public void selectionList_listChange()
		{
			
				if ( !getFormModel().getKeyBlock().getSelectionList().isNull() )
				{
					goItem(toStr("NEXT_SELECTION"));
					getFormModel().getKeyBlock().setNextSelection(getFormModel().getKeyBlock().getSelectionList());
					getFormModel().getKeyBlock().setSelectionList(toStr(""));
					// 
					// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					SupportClasses.SQLFORMS.DoKey("ENTER");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					
				}
			}

		
	
	
}

