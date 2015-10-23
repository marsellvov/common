package net.hedtech.banner.general.common.Gutpmnu.controller;
 
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
import net.hedtech.general.common.libraries.Goqgmnu.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gutpmnu.model.*;
import net.hedtech.banner.general.common.Gutpmnu.*;
import net.hedtech.banner.general.common.Gutpmnu.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GurmenuType;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GurmenuController extends DefaultBlockController {

	private GurmenuType getGurmenuType() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GurmenuType) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("GURMENU_TYPE");
	}	

	
	public GurmenuController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GutpmnuTask getTask() {
		return (GutpmnuTask)super.getTask();
	}

	public GutpmnuModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void gurmenu_doubleClick()
		{
			
				getGurmenuType().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gurmenu_CreateRecord()
		{
			
				getGurmenuType().createRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gurmenu_DeleteRecord()
		{
			
				getGurmenuType().deleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void gurmenu_keyNexItem()
		{
			
				getGurmenuType().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gurmenu_NextRecord()
		{
			
				getGurmenuType().nextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void gurmenu_PreviousItem()
		{
			
				getGurmenuType().previousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gurmenu_PreviousRecord()
		{
			
				getGurmenuType().previousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.CHK_DESC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHK_DESC")
		public void gurmenu_ChkDesc()
		{
			
				getGurmenuType().chkDesc();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.CLEAR_GROUP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CLEAR_GROUP")
		public void gurmenu_ClearGroup()
		{
			
				getGurmenuType().clearGroup();
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU.OBJ_DESC
		 DECLARE
  lv_block_name  VARCHAR2(30) := :SYSTEM.CURRENT_BLOCK;
  hold_desc      VARCHAR2(100);
  hold_menu_desc VARCHAR2(100);
  obj_type       VARCHAR2(30);
  menu_obj_name  VARCHAR2(61) := NAME_IN(lv_block_name||'.GURMENU_OBJ_NAME');
--
  CURSOR obj_desc_c (p_obj VARCHAR2) IS
    SELECT GUBOBJS_DESC,
           GUBOBJS_OBJT_CODE
      FROM GUBOBJS
     WHERE GUBOBJS_NAME = p_obj;
--
BEGIN
--
-- If adding objects to another user's personal menu, don't use this user's
-- object security to validate the object.
--
  IF :CUST_USER_ID <> :GLOBAL.current_user1 THEN
    gb_common.p_set_context(p_package_name  => 'GUKMENU',
                            p_context_name  => 'OBJ_SECURITY',
                            p_context_value => 'OFF',
                            p_stateless_ind => 'N');
  END IF;
--
  OPEN obj_desc_c(menu_obj_name);
  FETCH obj_desc_c INTO hold_desc, obj_type;
  CLOSE obj_desc_c;
--
  IF :CUST_USER_ID <> :GLOBAL.current_user1 THEN
    gb_common.p_set_context(p_package_name  => 'GUKMENU',
                            p_context_name  => 'OBJ_SECURITY',
                            p_context_value => 'ON',
                            p_stateless_ind => 'N');
  END IF;
--
  IF NAME_IN(lv_block_name||'.GURMENU_DESC') IS NOT NULL THEN
    COPY(NAME_IN(lv_block_name||'.GURMENU_DESC'),lv_block_name||'.DISPLAY_DESC');
    hold_menu_desc := NAME_IN(lv_block_name||'.GURMENU_DESC');
  END IF;
--
  IF hold_desc IS NOT NULL THEN
    COPY(hold_desc,lv_block_name||'.HOLD_DESC');
    COPY(obj_type ,lv_block_name||'.OBJ_TYPE');
    IF hold_menu_desc IS NULL THEN
      COPY(hold_desc,lv_block_name||'.DISPLAY_DESC');
      COPY(hold_desc,lv_block_name||'.GURMENU_DESC');
    END IF;
  ELSE
    COPY(G$_NLS.Get('GUTPMNU-0010','FORM','** Invalid object **'),lv_block_name||'.HOLD_DESC');
    COPY(G$_NLS.Get('GUTPMNU-0011','FORM','** Invalid object **'),lv_block_name||'.DISPLAY_DESC');
    COPY('',lv_block_name||'.OBJ_TYPE');
    COPY('',lv_block_name||'.GURMENU_DESC');
  END IF;
--
  IF NAME_IN(lv_block_name||'.GURMENU_DESC') IS NULL THEN
    COPY(NAME_IN(lv_block_name||'.HOLD_DESC'),lv_block_name||'.DISPLAY_DESC');
    IF :SYSTEM.MODE <> 'QUERY' THEN
      COPY('',lv_block_name||'.GURMENU_DESC');
    END IF;
  END IF;
--
  COPY(TO_CHAR(G$_MULTI_REC_SELECTION.Unique_Counter),lv_block_name||'.GURMENU_COUNT');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.OBJ_DESC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="OBJ_DESC")
		public void gurmenu_ObjDesc()
		{
			gurmenu_ObjDesc((GurmenuAdapter)this.getFormModel().getGurmenu().getRowAdapter(true));
		}

		
		public void gurmenu_ObjDesc(GurmenuAdapter gurmenuElement)
		{
			
				int rowCount = 0;
				{
//					NString lvBlockName = getCurrentBlock();
					NString holdDesc= NString.getNull();
					NString holdMenuDesc= NString.getNull();
					NString objType= NString.getNull();
					NString menuObjName =  gurmenuElement.getGurmenuObjName();// getNameIn(lvBlockName.append(".GURMENU_OBJ_NAME"));
					String sqlobjDescC = "SELECT GUBOBJS_DESC, GUBOBJS_OBJT_CODE " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :P_P_OBJ ";
					DataCursor objDescC = new DataCursor(sqlobjDescC);
					NString pObj = NString.getNull();
					try {
						// 
						//  If adding objects to another user's personal menu, don't use this user's
						//  object security to validate the object.
						// 
						if ( getFormModel().getFormHeader().getCustUserId().notEquals(getGlobal("CURRENT_USER1")) )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							GbCommon.pSetContext(/*pPackageName=>*/toStr("GUKMENU"), /*pContextName=>*/toStr("OBJ_SECURITY"), /*pContextValue=>*/toStr("OFF"), /*pStatelessInd=>*/toStr("N"));
						}
						// 
						pObj=menuObjName;
						//Setting query parameters
						objDescC.addParameter("P_P_OBJ", pObj);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable objDescC.
						objDescC.open();
						ResultSet objDescCResults = objDescC.fetchInto();
						if ( objDescCResults != null ) {
							holdDesc = objDescCResults.getStr(0);
							objType = objDescCResults.getStr(1);
						}
						// 
						if ( getFormModel().getFormHeader().getCustUserId().notEquals(getGlobal("CURRENT_USER1")) )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							GbCommon.pSetContext(/*pPackageName=>*/toStr("GUKMENU"), /*pContextName=>*/toStr("OBJ_SECURITY"), /*pContextValue=>*/toStr("ON"), /*pStatelessInd=>*/toStr("N"));
						}
						// 
						if ( gurmenuElement.getGurmenuDesc().isNotNull() )//)!getNameIn(lvBlockName.append(".GURMENU_DESC")).isNull() )
						{
							gurmenuElement.setDisplayDesc(gurmenuElement.getGurmenuDesc());
//							copy(getNameIn(lvBlockName.append(".GURMENU_DESC")),lvBlockName.append(".DISPLAY_DESC"));
							holdMenuDesc = gurmenuElement.getGurmenuDesc(); //getNameIn(lvBlockName.append(".GURMENU_DESC"));
						}
						// 
						if ( !holdDesc.isNull() )
						{
							gurmenuElement.setHoldDesc(holdDesc);
							gurmenuElement.setObjType(objType);
//							copy(holdDesc,lvBlockName.append(".HOLD_DESC"));
//							copy(objType,lvBlockName.append(".OBJ_TYPE"));
							if ( holdMenuDesc.isNull() )
							{
								gurmenuElement.setDisplayDesc(holdDesc);
								gurmenuElement.setGurmenuDesc(holdDesc);
//								copy(holdDesc,lvBlockName.append(".DISPLAY_DESC"));
//								copy(holdDesc,lvBlockName.append(".GURMENU_DESC"));
							}
						}
						else {
							gurmenuElement.setHoldDesc(GNls.Fget(toStr("GUTPMNU-0010"), toStr("FORM"), toStr("** Invalid object **")));
							gurmenuElement.setDisplayDesc(GNls.Fget(toStr("GUTPMNU-0011"), toStr("FORM"), toStr("** Invalid object **")));
//							copy(GNls.Fget(toStr("GUTPMNU-0010"), toStr("FORM"), toStr("** Invalid object **")),lvBlockName.append(".HOLD_DESC"));
//							copy(GNls.Fget(toStr("GUTPMNU-0011"), toStr("FORM"), toStr("** Invalid object **")),lvBlockName.append(".DISPLAY_DESC"));
							gurmenuElement.setObjType(NString.getNull());
							gurmenuElement.setGurmenuDesc(NString.getNull());
//							copy("",lvBlockName.append(".OBJ_TYPE"));
//							copy("",lvBlockName.append(".GURMENU_DESC"));
						}
						// 
						if ( gurmenuElement.getGurmenuDesc().isNull() )// getNameIn(lvBlockName.append(".GURMENU_DESC")).isNull() )
						{
							gurmenuElement.setDisplayDesc(gurmenuElement.getHoldDesc());
//							copy(getNameIn(lvBlockName.append(".HOLD_DESC")),lvBlockName.append(".DISPLAY_DESC"));
							if ( !getMode().equals("QUERY") )
							{
								gurmenuElement.setGurmenuDesc(NString.getNull());
//								copy("",lvBlockName.append(".GURMENU_DESC"));
							}
						}
						// 
						gurmenuElement.setGurmenuCount((getTask().getGoqgmnu().getGMultiRecSelection().uniqueCounter()));
//						copy(toChar(getTask().getGoqgmnu().getGMultiRecSelection().uniqueCounter()),lvBlockName.append(".GURMENU_COUNT"));
					}
					finally{
						objDescC.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.SET_DESC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_DESC")
		public void gurmenu_SetDesc()
		{
			
				getGurmenuType().setDesc();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.SORT_SEQ
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SORT_SEQ")
		public void gurmenu_SortSeq()
		{
			
				getGurmenuType().sortSeq();
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU.PRE-BLOCK
		 BEGIN
  EXECUTE_TRIGGER('CHECK_KEYS');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gurmenu_blockIn()
		{
			
				executeAction("CHECK_KEYS");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU.WHEN-NEW-BLOCK-INSTANCE
		 BEGIN
--
-- If navigating from the sub menu, check for pending changes.
--
  IF GET_BLOCK_PROPERTY('GURMENU2',STATUS) = 'CHANGED' THEN
    GO_BLOCK('GURMENU2');
	  MESSAGE(G$_NLS.Get('GUTPMNU-0012','FORM','*ERROR* You must commit changes before navigating.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF :SYSTEM.BLOCK_STATUS = 'NEW' OR :WORK_CR = 'Y' THEN
    :WORK_CR := 'N';
    EXECUTE_QUERY;
  END IF;
--
  :hold_record := :SYSTEM.CURSOR_RECORD;
--
  IF GET_VIEW_PROPERTY('GURMENU2_CANVAS',VISIBLE) = 'TRUE' THEN
    GO_BLOCK('GURMENU2');
    CLEAR_BLOCK;
    EXECUTE_TRIGGER('CLEAR_GROUP');
    GO_BLOCK('GURMENU');
    EXECUTE_QUERY;
    SET_VIEW_PROPERTY('GURMENU2_CANVAS',VISIBLE,PROPERTY_FALSE);
  END IF;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gurmenu_blockChange()
		{
			
				// 
				//  If navigating from the sub menu, check for pending changes.
				// 
			//Cabanas
				if ( getBlockStatus("GURMENU2").equals("CHANGED") )
				{
					goBlock(toStr("GURMENU2"));
					errorMessage(GNls.Fget(toStr("GUTPMNU-0012"), toStr("FORM"), toStr("*ERROR* You must commit changes before navigating.")));
					throw new ApplicationException();
				}
				// 
				if ( getBlockStatus().equals("NEW") || getFormModel().getFormHeader().getWorkCr().equals("Y") )
				{
					getFormModel().getFormHeader().setWorkCr(toStr("N"));
					executeQuery();
				}
				// 
				getFormModel().getFormHeader().setHoldRecord(toStr(getCursorRecord()));
				// 
				if ( getViewVisible("GURMENU2_CANVAS").equals("TRUE") )
				{
					goBlock(toStr("GURMENU2"));
					clearBlock();
					executeAction("CLEAR_GROUP");
					goBlock(toStr("GURMENU"));
					//VERIFICAR 
					//executeQuery();
					//VERIFICAR 
					
					//setViewVisible("GURMENU2_CANVAS", false);
					
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU.POST-QUERY
		 BEGIN
  EXECUTE_TRIGGER('OBJ_DESC');
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('USER_OBJ_DESC');
  G$_CHECK_FAILURE;
--
  SET_RECORD_PROPERTY(:SYSTEM.TRIGGER_RECORD,'GURMENU',STATUS,QUERY_STATUS);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gurmenu_AfterQuery(RowAdapterEvent args)
		{
			  	GurmenuAdapter x= (GurmenuAdapter)args.getRow();
				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				try{
			  	x.setLockDbValues(true);
			  	try{
			  	gurmenu_ObjDesc(x);
			  	getTask().getGoqrpls().gCheckFailure();
			  	}catch(Exception ex){
			  		
			  	}try{
			  		((GutpmnuFormController)this.getParentController()).Gutpmnu_UserObjDesc(x);
			  		getTask().getGoqrpls().gCheckFailure();
			  	}catch(Exception ex) {
			  		
			  	}
			  	//==>gurmenu_ObjDesc((GurmenuAdapter)args.getRow());
				
//				executeAction("OBJ_DESC");
				//getTask().getGoqrpls().gCheckFailure();
				
				// 
			//==>	((GutpmnuFormController)this.getParentController()).Gutpmnu_UserObjDesc((GurmenuAdapter)args.getRow());
//				executeAction("USER_OBJ_DESC");
			//	getTask().getGoqrpls().gCheckFailure();
				// 
				// F2J_NOT_SUPPORTED : The property "RECORD's STATUS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUTPMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.FORMS40.SetRecordProperty(getTriggerRecord(), "GURMENU", SupportClasses.Property.STATUS, SupportClasses.Constants.QUERY_STATUS);
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'RECORD's STATUS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUTPMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				} finally { 
					x.setLockDbValues(false);
				}
				
		
		
		}

		
		/* Original PL/SQL code code for TRIGGER GURMENU.PRE-DELETE
		 BEGIN
  EXECUTE_TRIGGER('COMMIT_STATUS');
  G$_CHECK_FAILURE;
--
  IF SUBSTR(:GURMENU.GURMENU_OBJ_NAME,1,1) = '*' THEN
    BEGIN
      DELETE FROM GURMENU
       WHERE GURMENU_NAME = :GURMENU.GURMENU_OBJ_NAME
         AND GURMENU_USER_ID = :CUST_USER_ID;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        NULL;
    END;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void gurmenu_BeforeRowDelete(RowAdapterEvent args)
		{
			
				GurmenuAdapter gurmenuElement = (GurmenuAdapter)args.getRow();


				int rowCount = 0;
				executeAction("COMMIT_STATUS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( substring(gurmenuElement.getGurmenuObjName(), toInt(1), toInt(1)).equals("*") )
				{
					try
					{
						String sql1 = "DELETE FROM GURMENU " +
	" WHERE GURMENU_NAME = :GURMENU_GURMENU_OBJ_NAME AND GURMENU_USER_ID = :CUST_USER_ID";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("GURMENU_GURMENU_OBJ_NAME", gurmenuElement.getGurmenuObjName());
						command1.addParameter("CUST_USER_ID", getFormModel().getFormHeader().getCustUserId());
						rowCount = command1.execute();
					}
					catch(NoDataFoundException e)
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU.PRE-INSERT
		 BEGIN
  EXECUTE_TRIGGER('COMMIT_STATUS');
  G$_CHECK_FAILURE;
--
  :GURMENU.GURMENU_NAME := '*PERSONAL';
  :GURMENU.GURMENU_SORT_SEQ := TO_NUMBER(:SYSTEM.TRIGGER_RECORD);
  :GURMENU.GURMENU_USER_ID := :CUST_USER_ID;
  :GURMENU.GURMENU_ACTIVITY_DATE := SYSDATE;
--
  EXECUTE_TRIGGER('CHK_DESC');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('SET_DESC');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void gurmenu_BeforeRowInsert(RowAdapterEvent args)
		{
			
				GurmenuAdapter gurmenuElement = (GurmenuAdapter)args.getRow();


				executeAction("COMMIT_STATUS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				gurmenuElement.setGurmenuName(toStr("*PERSONAL"));
				gurmenuElement.setGurmenuSortSeq(toNumber(getTriggerRecord()));
				gurmenuElement.setGurmenuUserId(getFormModel().getFormHeader().getCustUserId());
				gurmenuElement.setGurmenuActivityDate(NDate.getNow());
				// 
				executeAction("CHK_DESC");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("SET_DESC");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU.PRE-UPDATE
		 BEGIN
  EXECUTE_TRIGGER('COMMIT_STATUS');
  G$_CHECK_FAILURE;
--
  :GURMENU.GURMENU_SORT_SEQ := TO_NUMBER(:SYSTEM.TRIGGER_RECORD);
  :GURMENU.GURMENU_USER_ID := :CUST_USER_ID;
  :GURMENU.GURMENU_ACTIVITY_DATE := SYSDATE;
--
  EXECUTE_TRIGGER('CHK_DESC');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('SET_DESC');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void gurmenu_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				GurmenuAdapter gurmenuElement = (GurmenuAdapter)args.getRow();


				executeAction("COMMIT_STATUS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				gurmenuElement.setGurmenuSortSeq(toNumber(getTriggerRecord()));
				gurmenuElement.setGurmenuUserId(getFormModel().getFormHeader().getCustUserId());
				gurmenuElement.setGurmenuActivityDate(NDate.getNow());
				// 
				executeAction("CHK_DESC");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("SET_DESC");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU.KEY-NXTBLK
		 DECLARE
  lv_record  NUMBER(2)   := :SYSTEM.CURSOR_RECORD;
BEGIN
	IF GET_BLOCK_PROPERTY('GURMENU',STATUS) = 'CHANGED' THEN
		MESSAGE(G$_NLS.Get('GUTPMNU-0013','FORM','You must commit changes before navigating to next block.'));
    RETURN;
	END IF;
--
  IF SUBSTR(:GURMENU.GURMENU_OBJ_NAME,1,1) = '*' THEN
    EXECUTE_TRIGGER('CLEAR_GROUP');
    GO_RECORD(lv_record);
    GO_BLOCK('GURMENU2');
    SUBMENU_MAINTENANCE.Update_Query;
  ELSE
    MESSAGE(G$_NLS.Get('GUTPMNU-0014','FORM','Next Block is only valid for Menu type objects.'));
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gurmenu_NextBlock()
		{
			

			
				GurmenuAdapter gurmenuElement = (GurmenuAdapter)this.getFormModel().getGurmenu().getRowAdapter(true);

				if(gurmenuElement!=null){

				{
					NNumber lvRecord = getCursorRecord();
					if ( getBlockStatus("GURMENU").equals("CHANGED") )
					{
						errorMessage(GNls.Fget(toStr("GUTPMNU-0013"), toStr("FORM"), toStr("You must commit changes before navigating to next block.")));
						return ;
					}
					// 
					if ( substring(gurmenuElement.getGurmenuObjName(), toInt(1), toInt(1)).equals("*") )
					{
						executeAction("CLEAR_GROUP");
						setCurrentRecord(lvRecord);
						goBlock(toStr("GURMENU2"));
						getTask().getSubmenuMaintenance().updateQuery(gurmenuElement);
					}
					else {
						errorMessage(GNls.Fget(toStr("GUTPMNU-0014"), toStr("FORM"), toStr("Next Block is only valid for Menu type objects.")));
					}
				}
			}
		}

		
		/* Original PL/SQL code code for TRIGGER GURMENU.KEY-PRVBLK
		 PREVIOUS_BLOCK;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gurmenu_PreviousBlock()
		{
			
				previousBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GURMENU.ADD_TO_MRC
		 DECLARE
  rg_id   RECORDGROUP := Find_Group('DELETE');
  rg_row  NUMBER(5);
BEGIN
  ADD_GROUP_ROW(rg_id, END_OF_GROUP);
  rg_row := TO_NUMBER(GET_GROUP_ROW_COUNT(rg_id));
--
  SET_ITEM_INSTANCE_PROPERTY('GURMENU.DISPLAY_DESC',CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_HIGHLITE_TEXT');
  SET_ITEM_INSTANCE_PROPERTY('GURMENU.GURMENU_OBJ_NAME',CURRENT_RECORD,VISUAL_ATTRIBUTE,'LOCAL_HIGHLITE_TEXT');
--
  SET_GROUP_CHAR_CELL  ('DELETE.NAME'     ,rg_row ,'*PERSONAL');
  SET_GROUP_CHAR_CELL  ('DELETE.OBJ_NAME' ,rg_row ,:GURMENU.GURMENU_OBJ_NAME);
  SET_GROUP_CHAR_CELL  ('DELETE.OBJT_CODE',rg_row ,:GURMENU.OBJ_TYPE);
  SET_GROUP_CHAR_CELL  ('DELETE.INDICATOR',rg_row ,'Y');
  SET_GROUP_NUMBER_CELL('DELETE.TRIG_REC' ,rg_row ,:GURMENU.GURMENU_COUNT);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.ADD_TO_MRC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ADD_TO_MRC")
		public void gurmenu_AddToMrc()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				GurmenuAdapter gurmenuElement = (GurmenuAdapter)this.getFormModel().getGurmenu().getRowAdapter(true);

				if(gurmenuElement!=null){

				{
					ValueSet rgId = findGroup("DELETE");
					NNumber rgRow= NNumber.getNull();
					//WARNING: only adding rows at the end is supported
					addGroupRow(rgId);
					rgRow = toNumber(getGroupRowCount(rgId));
					// 
//					setItemStyleClass("GURMENU.DISPLAY_DESC", ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
//					setItemStyleClass("GURMENU.GURMENU_OBJ_NAME", ItemServices.CURRENT_RECORD, "LOCAL_HIGHLITE_TEXT");
					// 
					setGroupCharCell("DELETE.NAME", rgRow, toStr("*PERSONAL"));
					setGroupCharCell("DELETE.OBJ_NAME", rgRow, gurmenuElement.getGurmenuObjName());
					setGroupCharCell("DELETE.OBJT_CODE", rgRow, gurmenuElement.getObjType());
					setGroupCharCell("DELETE.INDICATOR", rgRow, toStr("Y"));
					setGroupNumberCell("DELETE.TRIG_REC", rgRow, gurmenuElement.getGurmenuCount());
				}
			}
		}
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void gurmenu_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("CUST_USER_ID", this.getFormModel().getFormHeader().getCustUserId()));             


           
               }

		
		/* Original PL/SQL code code for TRIGGER GURMENU_OBJ_NAME.WHEN-VALIDATE-ITEM
		 DECLARE
  hold_cnt INTEGER;
  hold_q    VARCHAR2(1);
  hold_val VARCHAR2(1);
--
  CURSOR MENU_C IS
    SELECT 'X'
      FROM GURHMNU
     WHERE GURHMNU_OBJT_CODE  = 'MENU'
       AND GURHMNU_VALUE = :GURMENU.GURMENU_OBJ_NAME
   CONNECT BY PRIOR GURHMNU_PRIOR_OBJ = GURHMNU_VALUE
     START WITH GURHMNU_VALUE = '*PERSONAL';
--
  CURSOR VALID_C IS
    SELECT 'X'
      FROM GURMENU, GUBOBJS
     WHERE GURMENU_USER_ID IN ('BASELINE','LOCAL')
       AND GURMENU_OBJ_NAME = GUBOBJS_NAME
       AND GUBOBJS_OBJT_CODE <> 'MENU'
       AND ROWNUM = 1
   CONNECT BY PRIOR GURMENU_OBJ_NAME = GURMENU_NAME
       AND GURMENU_USER_ID IN ('BASELINE','LOCAL')
     START WITH GURMENU_NAME = :GURMENU.GURMENU_OBJ_NAME;
--
  CURSOR VALID_C_EMPTY IS
    SELECT COUNT(*)
      FROM GURMENU
     WHERE GURMENU_USER_ID IN ('BASELINE','LOCAL')
       AND GURMENU_OBJ_NAME NOT LIKE '*%'
   CONNECT BY PRIOR GURMENU_OBJ_NAME = GURMENU_NAME
       AND GURMENU_USER_ID IN ('BASELINE','LOCAL')
     START WITH GURMENU_NAME = :GURMENU.GURMENU_OBJ_NAME;
--
BEGIN
  IF :SYSTEM.RECORD_STATUS = 'NEW' THEN
    RETURN;
  END IF;
--
  IF :GURMENU.GURMENU_OBJ_NAME IS NULL THEN
    :GURMENU.GURMENU_DESC := '';
    :GURMENU.DISPLAY_DESC := '';
    RETURN;
  END IF;
--
  EXECUTE_TRIGGER('OBJ_DESC');
  G$_CHECK_FAILURE;
--
-- Now verify that a valid object was entered.  The OBJ_DESC will set the description to a
-- special message and the object type will be null.  If data entry causes this to happen,
-- raise an error.
--
  IF :GURMENU.OBJ_TYPE IS NULL THEN
  	MESSAGE(G$_NLS.Get('GUTPMNU-0015','FORM','*ERROR* Invalid object entered.'));
  	RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF NVL(:GURMENU.OBJ_TYPE,'X') IN ('QUICKFLOW','MESSAGE','X') THEN
    NULL;
  ELSIF :GURMENU.OBJ_TYPE = 'MENU' THEN
  	IF :GURMENU.GURMENU_OBJ_NAME IN ('*PERSONAL','*PROCESS','*MAIN','*MENU') THEN
      :GURMENU.GURMENU_DESC := '';
      :GURMENU.DISPLAY_DESC := '';
      MESSAGE(G$_NLS.Get('GUTPMNU-0016','FORM','*ERROR* You cannot add this object to a personal menu.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  ELSE
    IF NOT G$_CHECK_ACCESS(:GURMENU.GURMENU_OBJ_NAME,:CUST_USER_ID) THEN
      :GURMENU.GURMENU_DESC := '';
      :GURMENU.DISPLAY_DESC := '';
      MESSAGE(G$_NLS.Get('GUTPMNU-0017','FORM','*ERROR* User is not authorized to access this object.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
--
-- Verify that objects exist which the user has authorization to access.
--
  IF :GURMENU.OBJ_TYPE = 'FORM' THEN
    IF NVL(LENGTH(:GURMENU.GURMENU_OBJ_NAME), 0) = 7 THEN
      hold_q := SUBSTR(:GURMENU.GURMENU_OBJ_NAME,3,1);
    ELSE
      hold_q := SUBSTR(:GURMENU.GURMENU_OBJ_NAME,4,1);
    END IF;
--
    IF hold_q = 'Q' THEN
      MESSAGE(G$_NLS.Get('GUTPMNU-0018','FORM','*ERROR* This form can not be called directly, you cannot add this to your menu.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
--
  ELSIF :GURMENU.OBJ_TYPE = 'MENU' THEN
--
-- If the personal menu is for the current user.
--
    IF :CUST_USER_ID = :GLOBAL.current_user1 THEN
      MESSAGE(G$_NLS.Get('GUTPMNU-0019','FORM','Verifying that you are authorized to access this menu...please wait.'));
      SYNCHRONIZE;
      SYNCHRONIZE;
--
-- Check if an empty menu is being added.
--
    	OPEN VALID_C_EMPTY;
    	FETCH VALID_C_EMPTY INTO HOLD_CNT;
  	  CLOSE VALID_C_EMPTY;
--
-- Validate access to objects on the menu.
--
      IF HOLD_CNT > 0 THEN
      	OPEN VALID_C;
      	FETCH VALID_C INTO HOLD_VAL;
--
    	  IF VALID_C%NOTFOUND THEN
    		  CLOSE VALID_C;
          :GURMENU.GURMENU_DESC := '';
          :GURMENU.DISPLAY_DESC := '';
    		  MESSAGE(G$_NLS.Get('GUTPMNU-0020','FORM','*ERROR* You are not authorized to access any objects on this menu.'));
      		RAISE FORM_TRIGGER_FAILURE;
    	  END IF;
		    CLOSE VALID_C;
      END IF;
--
      CLEAR_MESSAGE;
      MESSAGE(G$_NLS.Get('GUTPMNU-0021','FORM','Enter Form, Process, QuickFlow or SubMenu Name; LIST for description search'));
      SYNCHRONIZE;
    END IF;
--
-- Verify the menu being added doesn't already exist at a higher level.
--
  	OPEN MENU_C;
  	FETCH MENU_C INTO HOLD_VAL;
--
  	IF MENU_C%FOUND THEN
  		CLOSE MENU_C;
      :GURMENU.GURMENU_DESC := '';
      :GURMENU.DISPLAY_DESC := '';
      CLEAR_MESSAGE;
  		MESSAGE(G$_NLS.Get('GUTPMNU-0022','FORM','*ERROR* Menu exists at a higher level, it cannot be inserted here.'));
  		RAISE FORM_TRIGGER_FAILURE;
  	END IF;
 		CLOSE MENU_C;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_OBJ_NAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GURMENU_OBJ_NAME")
		public void gurmenuObjName_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				GurmenuAdapter gurmenuElement = (GurmenuAdapter)this.getFormModel().getGurmenu().getRowAdapter(true);

				if(gurmenuElement!=null){

				int rowCount = 0;
				{
					NInteger holdCnt= NInteger.getNull();
					NString holdQ= NString.getNull();
					NString holdVal= NString.getNull();
					String sqlmenuC = "SELECT 'X' " +
	" FROM GURHMNU " +
	" WHERE GURHMNU_OBJT_CODE = 'MENU' AND GURHMNU_VALUE = :GURMENU_GURMENU_OBJ_NAME ";
					DataCursor menuC = new DataCursor(sqlmenuC);
					String sqlvalidC = "SELECT 'X' " +
	" FROM GURMENU, GUBOBJS " +
	" WHERE (GURMENU_USER_ID) IN ('BASELINE', 'LOCAL') AND GURMENU_OBJ_NAME = GUBOBJS_NAME AND GUBOBJS_OBJT_CODE <> 'MENU' AND ROWNUM = 1 ";
					DataCursor validC = new DataCursor(sqlvalidC);
					String sqlvalidCEmpty = "SELECT COUNT(*) " +
	" FROM GURMENU " +
	" WHERE (GURMENU_USER_ID) IN ('BASELINE', 'LOCAL') AND GURMENU_OBJ_NAME NOT LIKE '*%' ";
					DataCursor validCEmpty = new DataCursor(sqlvalidCEmpty);
					try {
						// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
						if ( getRecordStatus().equals("NEW") )
						{
							return ;
						}
						// 
						if ( gurmenuElement.getGurmenuObjName().isNull() )
						{
							gurmenuElement.setGurmenuDesc(toStr(""));
							gurmenuElement.setDisplayDesc(toStr(""));
							return ;
						}
						// 
						executeAction("OBJ_DESC");
						getTask().getGoqrpls().gCheckFailure();
						// 
						//  Now verify that a valid object was entered.  The OBJ_DESC will set the description to a
						//  special message and the object type will be null.  If data entry causes this to happen,
						//  raise an error.
						// 
						if ( gurmenuElement.getObjType().isNull() )
						{
							errorMessage(GNls.Fget(toStr("GUTPMNU-0015"), toStr("FORM"), toStr("*ERROR* Invalid object entered.")));
							throw new ApplicationException();
						}
						// 
						if ( in(isNull(gurmenuElement.getObjType(), "X"), "QUICKFLOW", "MESSAGE", "X").getValue() )
						{
						}
						else if ( gurmenuElement.getObjType().equals("MENU") ) {
							if ( in(gurmenuElement.getGurmenuObjName(), "*PERSONAL", "*PROCESS", "*MAIN", "*MENU").getValue() )
							{
								gurmenuElement.setGurmenuDesc(toStr(""));
								gurmenuElement.setDisplayDesc(toStr(""));
								errorMessage(GNls.Fget(toStr("GUTPMNU-0016"), toStr("FORM"), toStr("*ERROR* You cannot add this object to a personal menu.")));
								throw new ApplicationException();
							}
						}
						else {
							if ( getTask().getGoqrpls().gCheckAccess(gurmenuElement.getGurmenuObjName(), getFormModel().getFormHeader().getCustUserId()).not() )
							{
								gurmenuElement.setGurmenuDesc(toStr(""));
								gurmenuElement.setDisplayDesc(toStr(""));
								errorMessage(GNls.Fget(toStr("GUTPMNU-0017"), toStr("FORM"), toStr("*ERROR* User is not authorized to access this object.")));
								throw new ApplicationException();
							}
						}
						// 
						//  Verify that objects exist which the user has authorization to access.
						// 
						if ( gurmenuElement.getObjType().equals("FORM") )
						{
							if ( isNull(length(gurmenuElement.getGurmenuObjName()), 0).equals(7) )
							{
								holdQ = substring(gurmenuElement.getGurmenuObjName(), toInt(3), toInt(1));
							}
							else {
								holdQ = substring(gurmenuElement.getGurmenuObjName(), toInt(4), toInt(1));
							}
							// 
							if ( holdQ.equals("Q") )
							{
								errorMessage(GNls.Fget(toStr("GUTPMNU-0018"), toStr("FORM"), toStr("*ERROR* This form can not be called directly, you cannot add this to your menu.")));
								throw new ApplicationException();
							}
						}
						else if ( gurmenuElement.getObjType().equals("MENU") ) {
							// 
							//  If the personal menu is for the current user.
							// 
							if ( getFormModel().getFormHeader().getCustUserId().equals(getGlobal("CURRENT_USER1")) )
							{
								message(GNls.Fget(toStr("GUTPMNU-0019"), toStr("FORM"), toStr("Verifying that you are authorized to access this menu...please wait.")));
								// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUTPMNUF2NMigrationGuide.xml#ExcludeSynchronize".
								//								SupportClasses.SQLFORMS.Synchronize();
//								System.err.println("// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUTPMNUF2NMigrationGuide.xml#ExcludeSynchronize'.");
								
								// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUTPMNUF2NMigrationGuide.xml#ExcludeSynchronize".
								//								SupportClasses.SQLFORMS.Synchronize();
//								System.err.println("// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUTPMNUF2NMigrationGuide.xml#ExcludeSynchronize'.");
								
								// 
								//  Check if an empty menu is being added.
								// 
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable validCEmpty.
								validCEmpty.open();
								ResultSet validCEmptyResults = validCEmpty.fetchInto();
								if ( validCEmptyResults != null ) {
									holdCnt = validCEmptyResults.getInteger(0);
								}
								
								// 
								//  Validate access to objects on the menu.
								// 
								if ( holdCnt.greater(0) )
								{
									//F2J_WARNING : Make sure that the method "Close" is being called over the variable validC.
									validC.open();
									ResultSet validCResults = validC.fetchInto();
									if ( validCResults != null ) {
										holdVal = validCResults.getStr(0);
									}
									// 
									if ( validC.notFound() )
									{
										
										gurmenuElement.setGurmenuDesc(toStr(""));
										gurmenuElement.setDisplayDesc(toStr(""));
										errorMessage(GNls.Fget(toStr("GUTPMNU-0020"), toStr("FORM"), toStr("*ERROR* You are not authorized to access any objects on this menu.")));
										throw new ApplicationException();
									}
									
								}
								// 
								clearMessage();
								message(GNls.Fget(toStr("GUTPMNU-0021"), toStr("FORM"), toStr("Enter Form, Process, QuickFlow or SubMenu Name; LIST for description search")));
								// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUTPMNUF2NMigrationGuide.xml#ExcludeSynchronize".
								//								SupportClasses.SQLFORMS.Synchronize();
//								System.err.println("// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUTPMNUF2NMigrationGuide.xml#ExcludeSynchronize'.");
								
							}
							// 
							//  Verify the menu being added doesn't already exist at a higher level.
							// 
							//Setting query parameters
							menuC.addParameter("GURMENU_GURMENU_OBJ_NAME", gurmenuElement.getGurmenuObjName());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable menuC.
							menuC.open();
							ResultSet menuCResults = menuC.fetchInto();
							if ( menuCResults != null ) {
								holdVal = menuCResults.getStr(0);
							}
							// 
							if ( menuC.found() )
							{
								
//								gurmenuElement.setGurmenuDesc(toStr(""));
//								gurmenuElement.setDisplayDesc(toStr(""));
//								clearMessage();
//								errorMessage(GNls.Fget(toStr("GUTPMNU-0022"), toStr("FORM"), toStr("*ERROR* Menu exists at a higher level, it cannot be inserted here.")));
//								throw new ApplicationException();
							}
							
						}
					}
					finally{
						validCEmpty.close();
						validC.close();
						menuC.close();
					}
				}
			}
		}
		
		/* Original PL/SQL code code for TRIGGER GURMENU_OBJ_NAME.KEY-LISTVAL
		 G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.current_user1'),'GUIOBJS','');
IF :GLOBAL.VALUE IS NOT NULL THEN
  :GURMENU.GURMENU_OBJ_NAME := :GLOBAL.VALUE;
  NEXT_FIELD;
  NEXT_FIELD;
  G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURMENU_OBJ_NAME.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GURMENU_OBJ_NAME", function=KeyFunction.LIST_VALUES)
		public void gurmenuObjName_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				GurmenuAdapter gurmenuElement = (GurmenuAdapter)this.getFormModel().getGurmenu().getRowAdapter(true);

				if(gurmenuElement!=null){

				getTask().getGoqrpls().gSecuredFormCall(getNameIn("GLOBAL.current_user1"), toStr("GUIOBJS"), toStr(""));
				if ( !getGlobal("VALUE").isNull() )
				{
					gurmenuElement.setGurmenuObjName(getGlobal("VALUE"));
					nextItem();
					nextItem();
					getTask().getGoqrpls().gCheckFailure();
				}
			}
		}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_DESC.WHEN-VALIDATE-ITEM
		 BEGIN
  IF :SYSTEM.RECORD_STATUS = 'NEW' THEN
    RETURN;
  END IF;
--
 IF :GURMENU.DISPLAY_DESC <> :GURMENU.GURMENU_DESC OR
    :GURMENU.DISPLAY_DESC <> :GURMENU.HOLD_DESC THEN
   IF :SYSTEM.RECORD_STATUS <> 'INSERT' THEN
     :GURMENU.GURMENU_DESC := :GURMENU.DISPLAY_DESC;
   END IF;
 END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_DESC.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="DISPLAY_DESC")
		public void displayDesc_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				GurmenuAdapter gurmenuElement = (GurmenuAdapter)this.getFormModel().getGurmenu().getRowAdapter(true);

				if(gurmenuElement!=null){

				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( getRecordStatus().equals("NEW") )
				{
					return ;
				}
				// 
				if ( gurmenuElement.getDisplayDesc().notEquals(gurmenuElement.getGurmenuDesc()) || gurmenuElement.getDisplayDesc().notEquals(gurmenuElement.getHoldDesc()) )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( !getRecordStatus().equals("INSERT") )
					{
						gurmenuElement.setGurmenuDesc(gurmenuElement.getDisplayDesc());
					}
				}
			}
		}
		
	
}

