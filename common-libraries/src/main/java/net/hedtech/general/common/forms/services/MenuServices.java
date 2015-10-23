package net.hedtech.general.common.forms.services;

import static morphis.foundations.core.appsupportlib.Lib.in;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.getGroupCharCell;
import net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices;
import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.menus.MenuDefinition;
import morphis.foundations.core.appsupportlib.runtime.menus.MenuEntry;
import morphis.foundations.core.appsupportlib.runtime.menus.Parameter;
import morphis.foundations.core.types.NString;
import morphis.foundations.extensions.state.DataBlockStateController;
import morphis.foundations.extensions.state.IStateController;

public class MenuServices extends AbstractSupportCodeObject{

	IStateController stateController;
	static final String CONTROLLER_BLOCK = "MENU_CONTROL";

	public MenuServices(ISupportCodeContainer container) {	
		super (container);
		stateController = new DataBlockStateController(CONTROLLER_BLOCK, false); //use a factory or configuration	
	}
	
	public GoqrplsServices getGoqrpls()
	{
		return (GoqrplsServices)Task.getCurrent().getSupportCodeManager().getLibrary("GOQRPLS");
	}
	

	public void setMenuItemEnabled(String option, boolean enabled) {				
			stateController.enableAction(option, enabled);
	}
	
	public void setMenuItemChecked(String option, boolean checked) {
		stateController.checkAction(option, checked);
	}
	
	// 
	protected void setMenuItemVisible(String itemName, boolean visible)
	{
		stateController.showAction(itemName, visible);		
	}
	
	
	public MenuDefinition getOptionsMenuDefinition(String menuName, String formName, String blockName) throws Exception
	{			
		MenuDefinition menu = new MenuDefinition(menuName);
		
		String sql = "select  GUROPTM_FORM_NAME || GUROPTM_NAME1 || GUROPTM_TYPE_IND as ID, GUROPTM_FORM_NAME, GUROPTM_NAME1, GUROPTM_NAME2, GUROPTM_NAME1_DESC, GUROPTM_TYPE_IND, GUROPTM_TRG_NAME, GUROPTM_TRG_TYPE, GUROPTM_CAPACITY, GUROPTM_TAB_SEC_FORM, GUROPTM_TAB_SEC_TAB, GUROPTM_BLOCK_VALID, GUROPTM_FORM_TO_BE_CALLED  from GUROPTM"
				+ "		where GUROPTM_FORM_NAME = :FORM_NAME AND GUROPTM_TYPE_IND <> 'I'"
				+ "     order by GUROPTM_SORT_SEQ";
		
		
		
		DataCursor cur = new DataCursor(sql);
		
		try
		{
			cur.addParameter("FORM_NAME", formName);

			cur.open();
			
			while (true) {
				ResultSet curResults = cur.fetchInto();
				if ( curResults != null ) {
					
					MenuEntry entry = new MenuEntry();
					
					//entry.setId(curResults.getStr("ID").getValue());
					 
					String type = curResults.getStr("GUROPTM_TYPE_IND").getValue();
					String name1 = curResults.getStr("GUROPTM_NAME1").getValue();
					String formToBeCalled = curResults.getStr("GUROPTM_FORM_TO_BE_CALLED").getValue();
					String desc = "";
//					if (type != null){
//						if(in(type, "L", "F").getValue()){
							if(!NString.isNullOrEmpty(formToBeCalled))
								desc = formToBeCalled.toUpperCase();
//						}
//						else if(!NString.isNullOrEmpty(name1))
//							desc = name1.toUpperCase();
//					}
					if(!NString.isNullOrEmpty(desc))
						desc = " [" + desc + "]";
					entry.setLabel(curResults.getStr("GUROPTM_NAME1_DESC").getValue() + desc);
					entry.setId(name1 + "#" + type);
					entry.setAction(curResults.getStr("GUROPTM_TRG_NAME").getValue());
					entry.setTaskName(curResults.getStr("GUROPTM_FORM_TO_BE_CALLED").getValue());					
					
					entry.addParameter(new Parameter("GUROPTM_NAME1", name1));
					entry.addParameter(new Parameter("GUROPTM_NAME2", curResults.getStr("GUROPTM_NAME2").getValue()));
					
					entry.addParameter(new Parameter("GUROPTM_TYPE_IND", type));
					entry.addParameter(new Parameter("GUROPTM_TRG_NAME", curResults.getStr("GUROPTM_TRG_NAME").getValue()));
					entry.addParameter(new Parameter("GUROPTM_TRG_TYPE", curResults.getStr("GUROPTM_TRG_TYPE").getValue()));
					entry.addParameter(new Parameter("GUROPTM_CAPACITY", curResults.getStr("GUROPTM_CAPACITY").getValue()));
					entry.addParameter(new Parameter("GUROPTM_TAB_SEC_FORM", curResults.getStr("GUROPTM_TAB_SEC_FORM").getValue()));
					entry.addParameter(new Parameter("GUROPTM_TAB_SEC_TAB", curResults.getStr("GUROPTM_TAB_SEC_TAB").getValue()));
					entry.addParameter(new Parameter("GUROPTM_FORM_TO_BE_CALLED", curResults.getStr("GUROPTM_FORM_TO_BE_CALLED").getValue()));
					
					menu.addChild(entry);
				}
				if ( cur.notFound() ) 
					break;
				
			}
			
		}
		finally
		{
			cur.close();
		}
		
		return menu;
	}
	
	public MenuDefinition getBlockFilteredOptions(String menuName, String formName, String blockName) throws Exception
	{			
		MenuDefinition menu = new MenuDefinition(menuName);
		
		String sql = "select  GUROPTM_FORM_NAME || GUROPTM_NAME1 || GUROPTM_TYPE_IND as ID, GUROPTM_FORM_NAME, GUROPTM_NAME1, GUROPTM_NAME2, GUROPTM_NAME1_DESC, GUROPTM_TYPE_IND, GUROPTM_TRG_NAME, GUROPTM_TRG_TYPE, GUROPTM_CAPACITY, GUROPTM_TAB_SEC_FORM, GUROPTM_TAB_SEC_TAB, GUROPTM_BLOCK_VALID, GUROPTM_FORM_TO_BE_CALLED  from GUROPTM"
				+ "		where GUROPTM_FORM_NAME = :FORM_NAME AND GUROPTM_TYPE_IND <> 'I'";
		
		sql += "  AND (GUROPTM_BLOCK_VALID = :BLOCK_NAME OR GUROPTM_BLOCK_VALID IS NULL)";
		
		DataCursor cur = new DataCursor(sql);
		
		try
		{
			cur.addParameter("FORM_NAME", formName);
			cur.addParameter("BLOCK_NAME", blockName);
			cur.open();
			
			while (true) {
				ResultSet curResults = cur.fetchInto();
				if ( curResults != null ) {
					
					NString lvTabSecTab = curResults.getStr("GUROPTM_TAB_SEC_TAB");
					
					if ( lvTabSecTab.isNotNull() && getGoqrpls().getGTabSecurity().gAuthLevelTab(lvTabSecTab).equals("N") )
						continue;

					MenuEntry entry = new MenuEntry();
					
					//entry.setId(curResults.getStr("ID").getValue());
					 
					String type = curResults.getStr("GUROPTM_TYPE_IND").getValue();
					String name1 = curResults.getStr("GUROPTM_NAME1").getValue();
		
					entry.setId(name1 + "#" + type);
					
					menu.addChild(entry);
				}
				if ( cur.notFound() ) 
					break;
				
			}
			
		}
		finally
		{
			cur.close();
		}
		
		return menu;
	}
		
}









