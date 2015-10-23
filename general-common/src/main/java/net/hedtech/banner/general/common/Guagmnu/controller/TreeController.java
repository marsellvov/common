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

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class TreeController extends DefaultBlockController {


	
	public TreeController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER TREE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TREE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void tree_doubleClick()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER TREE.KEY-LISTVAL
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TREE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void tree_ListValues()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER TREE.KEY-NXTBLK
		 GO_BLOCK('MESSAGES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TREE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void tree_NextBlock()
		{
			
				goBlock(toStr("MESSAGES"));
			}

		
		/* Original PL/SQL code code for TRIGGER TREE.KEY-PRVBLK
		 GO_BLOCK('KEY_BLOCK');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TREE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void tree_PreviousBlock()
		{
			
				goBlock(toStr("KEY_BLOCK"));
			}

		
		/* Original PL/SQL code code for TRIGGER TREE.KEY-NEXT-ITEM
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TREE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void tree_keyNexItem()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER TREE.KEY-PREV-ITEM
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TREE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void tree_PreviousItem()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_DESC.WHEN-TREE-NODE-ACTIVATED
		 DECLARE
  lv_node          FTREE.NODE := :SYSTEM.TRIGGER_NODE;
  lv_node_icon     VARCHAR2(100);
  lv_node_value    VARCHAR2(100) := '';
  lv_tree_item     ITEM := FIND_ITEM('tree.GURMENU_DESC');
BEGIN
  lv_node_icon  := Ftree.GET_TREE_NODE_PROPERTY(lv_tree_item,lv_node,Ftree.NODE_ICON);
--
-- This is where a menu gets expanded.
--
  IF lv_node_icon = 'folder' THEN
    Ftree.SET_TREE_NODE_PROPERTY(lv_tree_item, lv_node, Ftree.NODE_ICON, 'open_folder');
--
-- This is where a menu gets collasped.
--
 	ELSIF lv_node_icon = 'open_folder' THEN
    Ftree.SET_TREE_NODE_PROPERTY(lv_tree_item,lv_node,Ftree.NODE_ICON,'folder');
--
  ELSE
    lv_node_value := Ftree.GET_TREE_NODE_PROPERTY(lv_tree_item, lv_node, Ftree.NODE_VALUE);
    :KEY_BLOCK.NEXT_SELECTION := '';
    CLEAR_MESSAGE;
    :KEY_BLOCK.NEXT_SELECTION := lv_node_value;
    FTREE.SET_TREE_SELECTION(lv_tree_item, lv_node, FTREE.SELECT_OFF);
    GO_ITEM('KEY_BLOCK.NEXT_SELECTION');
    EXECUTE_TRIGGER('CHECK_TYPE');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_DESC.WHEN-TREE-NODE-ACTIVATED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-TREE-NODE-ACTIVATED", item="GURMENU_DESC")
		public void gurmenuDesc_itemActivated()
		{
			
				{
					TreeNode lvNode = getTriggerNode();
					NString lvNodeIcon= NString.getNull();
					NString lvNodeValue = toStr("");
					ItemDescriptor lvTreeItem = findItem(toStr("tree.GURMENU_DESC"));
					lvNodeIcon = toStr(getTreeNodeIcon(lvTreeItem, lvNode));
					// 
					//  This is where a menu gets expanded.
					// 
					if ( lvNodeIcon.equals("folder") )
					{
						setTreeNodeIcon(lvTreeItem, lvNode, "open_folder");
					}
					else if ( lvNodeIcon.equals("open_folder") ) {
						setTreeNodeIcon(lvTreeItem, lvNode, "folder");
					}
					else {
						lvNodeValue = toStr(getTreeNodeValue(lvTreeItem, lvNode));
						getFormModel().getKeyBlock().setNextSelection(toStr(""));
						clearMessage();
						getFormModel().getKeyBlock().setNextSelection(lvNodeValue);
						setTreeSelection(toStr(lvTreeItem), lvNode, false);
						goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
						executeAction("CHECK_TYPE");
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU_DESC.WHEN-TREE-NODE-EXPANDED
		 DECLARE
  lv_node          FTREE.NODE := :SYSTEM.TRIGGER_NODE;
  lv_group_count   PLS_INTEGER;
  lv_rg_item       RECORDGROUP := FIND_GROUP('RG_PRODUCT_LOAD_LABEL');
  lv_tree_item     ITEM := FIND_ITEM('tree.GURMENU_DESC');
BEGIN
RETURN;
  :FORM_HEADER.MENU_TO_EXPAND := 
       Ftree.GET_TREE_NODE_PROPERTY(lv_tree_item, lv_node, Ftree.NODE_VALUE);
  :FORM_HEADER.MENU_TO_EXPAND_LEVEL := 
       Ftree.GET_TREE_NODE_PROPERTY(lv_tree_item, lv_node, Ftree.NODE_DEPTH);
--
  IF :FORM_HEADER.MENU_TO_EXPAND IS NOT NULL THEN
    lv_group_count := POPULATE_GROUP(lv_rg_item);
    IF lv_group_count = 0 THEN
      lv_group_count := GET_GROUP_ROW_COUNT(lv_rg_item);
--
      Ftree.ADD_TREE_DATA(lv_tree_item,lv_node,Ftree.PARENT_OFFSET,Ftree.LAST_CHILD,
                          Ftree.RECORD_GROUP,lv_rg_item);
      Ftree.SET_TREE_NODE_PROPERTY(lv_tree_item, lv_node, Ftree.NODE_VALUE,'');

    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_DESC.WHEN-TREE-NODE-EXPANDED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-TREE-NODE-EXPANDED", item="GURMENU_DESC")
		public void gurmenuDesc_itemOpen()
		{
			
				{
					TreeNode lvNode = getTriggerNode();
					//NInteger lvGroupCount= NInteger.getNull();
					NNumber lvGroupCount= NNumber.getNull();
					ValueSet lvRgItem = findGroup("RG_PRODUCT_LOAD_LABEL");
					ItemDescriptor lvTreeItem = findItem(toStr("tree.GURMENU_DESC"));
					return ;
					//NSSG DEAD CODE
//					{
//						getFormModel().getFormHeader().setMenuToExpand(toStr(getTreeNodeValue(lvTreeItem, lvNode)));
//						getFormModel().getFormHeader().setMenuToExpandLevel(toNumber(getTreeNodeDepth(lvTreeItem, lvNode)));
//						// 
//						if ( !getFormModel().getFormHeader().getMenuToExpand().isNull() )
//						{
//							lvGroupCount = populateGroup(lvRgItem);
//							if ( lvGroupCount.equals(0) )
//							{
//								lvGroupCount = toNumber(getGroupRowCount(lvRgItem));
//								// 
//								addTreeData(lvTreeItem, lvNode, TreeServices.PARENT_OFFSET, TreeServices.LAST_CHILD, lvRgItem);
//								setTreeNodeValue(toStr(lvTreeItem), lvNode, "");
//							}
//						}
//					}
				}
			}

		
	
	
}

