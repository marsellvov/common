package net.hedtech.banner.general.common.Goamtch.controller;
 
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

import net.hedtech.banner.general.common.Goamtch.model.*;
import net.hedtech.banner.general.common.Goamtch.*;
import net.hedtech.banner.general.common.Goamtch.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GorcmdoController extends DefaultBlockController {


	
	public GorcmdoController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GoamtchTask getTask() {
		return (GoamtchTask)super.getTask();
	}

	public GoamtchModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GORCMDO.PRE-BLOCK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMDO.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gorcmdo_blockIn()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GORCMDO.WHEN-NEW-BLOCK-INSTANCE
		 DECLARE
  CURSOR OPTN_C IS
    SELECT GORCMDO_OBJS_NAME
      FROM GORCMDO
     WHERE GORCMDO_CMSC_CODE = :KEY_BLOCK.KEYBLOCK_SOURCE_CODE
       AND ROWNUM < 7
     ORDER BY GORCMDO_SEQ_NO;
--
	CURSOR OBJS_DESC_C (p_obj VARCHAR2) IS
	  SELECT GUBOBJS_DESC
	    FROM GUBOBJS
	   WHERE GUBOBJS_NAME = p_obj;
--
  lv_cnt           INTEGER := 0;
  lv_obj           VARCHAR2(30);
  lv_desc          GUBOBJS.GUBOBJS_DESC%TYPE;
  lv_desc_item     VARCHAR2(30);
BEGIN
	-- 74-2 clear existing values with first LOOP
	--      start loop at 2 so that there is a valid, visibile item in block
	--
	FOR lv_cnt IN 2..6 LOOP
--
    COPY('','GORCMDO.OBJS_NAME' || TO_CHAR(lv_cnt));
    lv_desc_item := 'GORCMDO.OBJS_DESC' || TO_CHAR(lv_cnt);
--
    SET_ITEM_PROPERTY(lv_desc_item,ENABLED,  PROPERTY_FALSE);
    SET_ITEM_PROPERTY(lv_desc_item,NAVIGABLE,PROPERTY_FALSE);
    SET_ITEM_PROPERTY(lv_desc_item,VISIBLE,  PROPERTY_FALSE);
    --
    SET_ITEM_PROPERTY(lv_desc_item,LABEL,'');
    SET_ITEM_PROPERTY(lv_desc_item,TOOLTIP_TEXT,'');
	END LOOP;
	lv_cnt := 0;
	--
  FOR optn_rec IN OPTN_C LOOP
    lv_cnt := lv_cnt + 1;
    lv_obj := optn_rec.GORCMDO_OBJS_NAME;
--
  	OPEN OBJS_DESC_C(lv_obj);
	  FETCH OBJS_DESC_C INTO lv_desc;
	  CLOSE OBJS_DESC_C;
--
    COPY(lv_obj,'GORCMDO.OBJS_NAME' || TO_CHAR(lv_cnt));
    lv_desc_item := 'GORCMDO.OBJS_DESC' || TO_CHAR(lv_cnt);
--
    IF lv_cnt > 1 THEN
      SET_ITEM_PROPERTY(lv_desc_item,VISIBLE,  PROPERTY_TRUE);
      SET_ITEM_PROPERTY(lv_desc_item,ENABLED,  PROPERTY_TRUE);
      SET_ITEM_PROPERTY(lv_desc_item,NAVIGABLE,PROPERTY_TRUE);
    END IF;
    SET_ITEM_PROPERTY(lv_desc_item,LABEL,lv_desc);
    SET_ITEM_PROPERTY(lv_desc_item,TOOLTIP_TEXT,lv_desc);
  END LOOP;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMDO.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gorcmdo_blockChange()
		{
			
				int rowCount = 0;
				{
					String sqloptnC = "SELECT GORCMDO_OBJS_NAME " +
	" FROM GORCMDO " +
	" WHERE GORCMDO_CMSC_CODE = :KEY_BLOCK_KEYBLOCK_SOURCE_CODE AND ROWNUM < 7 " +
	" ORDER BY GORCMDO_SEQ_NO";
					DataCursor optnC = new DataCursor(sqloptnC);
					String sqlobjsDescC = "SELECT GUBOBJS_DESC " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :P_P_OBJ ";
					DataCursor objsDescC = new DataCursor(sqlobjsDescC);
					NString pObj = NString.getNull();
					// 
					int lvCnt = 0;
					NString lvObj= NString.getNull();
					NString lvDesc= NString.getNull();
					NString lvDescItem= NString.getNull();
					try {
						//  74-2 clear existing values with first LOOP
						//       start loop at 2 so that there is a valid, visibile item in block
						// 
						for ( lvCnt = 2; lvCnt <= 6; lvCnt++)
						{
							// 
							copy("",toStr("GORCMDO.OBJS_NAME").append(toChar(lvCnt)));
							lvDescItem = toStr("GORCMDO.OBJS_DESC").append(toChar(lvCnt));
							// 
							setItemEnabled(lvDescItem, false);
							setItemNavigable(lvDescItem, false);
							setItemVisible(lvDescItem, false);
							// 
							setItemLabel(lvDescItem, "");
							setItemToolTip(lvDescItem, "");
						}
						lvCnt = 0;
						// 
						//Setting query parameters
						optnC.addParameter("KEY_BLOCK_KEYBLOCK_SOURCE_CODE", getFormModel().getKeyBlock().getKeyblockSourceCode());
						try
						{
							optnC.open();
							while (true)
							{
								TableRow optnRec = optnC.fetchRow();
								if ( optnC.notFound() ) break;
								lvCnt++; 
								lvObj = optnRec.getStr("GORCMDO_OBJS_NAME");
								// 
								pObj=lvObj;
								//Setting query parameters
								objsDescC.addParameter("P_P_OBJ", pObj);
								objsDescC.open();
								ResultSet objsDescCResults = objsDescC.fetchInto();
								if ( objsDescCResults != null ) {
									lvDesc = objsDescCResults.getStr(0);
								}
								objsDescC.close();
								// 
								copy(lvObj,toStr("GORCMDO.OBJS_NAME").append(toChar(lvCnt)));
								lvDescItem = toStr("GORCMDO.OBJS_DESC").append(toChar(lvCnt));
								// 
								if ( lvCnt > 1 )
								{
									setItemVisible(lvDescItem, true);
									setItemEnabled(lvDescItem, true);
									setItemNavigable(lvDescItem, true);
								}
								setItemLabel(lvDescItem, lvDesc);
								setItemToolTip(lvDescItem, lvDesc);
							}
						}finally{
							optnC.close();
						}
					}
					finally{
						objsDescC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORCMDO.PRE-QUERY
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMDO.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/
/* 
		@BeforeQuery
		public void gorcmdo_BeforeQuery(QueryEvent args)
		{
			
			}

		*/
		
		/* Original PL/SQL code code for TRIGGER GORCMDO.POST-QUERY
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMDO.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/
/*
		@AfterQuery
		public void gorcmdo_AfterQuery(RowAdapterEvent args)
		{
			
			}

		*/
		
		/* Original PL/SQL code code for TRIGGER GORCMDO.KEY-EXIT
		 GO_ITEM(:FORM_HEADER.HOLD_BLK_ITEM);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMDO.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void gorcmdo_Exit()
		{
			
				goItem(getFormModel().getFormHeader().getHoldBlkItem());
			}

		
		/* Original PL/SQL code code for TRIGGER GORCMDO.KEY-NXTREC
		 IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
  MESSAGE(G$_NLS.Get('GOAMTCH-0058','FORM','At last record.'));
ELSE
	NEXT_RECORD;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMDO.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gorcmdo_NextRecord()
		{
			
				if ( isInLastRecord() )
				{
					infoMessage(GNls.Fget(toStr("GOAMTCH-0058"), toStr("FORM"), toStr("At last record.")));
				}
				else {
					nextRecord();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORCMDO.CALL_DETAIL_OBJ
		 DECLARE
	lv_objs  VARCHAR2(30) := NAME_IN('GORCMDO.OBJS_NAME' || SUBSTR(:SYSTEM.TRIGGER_ITEM,-1,1));
BEGIN
--
-- Call the form which is related to this link
--
  :GLOBAL.KEY_IDNO := 
     NAME_IN(SUBSTR(:FORM_HEADER.HOLD_BLK_ITEM,1,INSTR(:FORM_HEADER.HOLD_BLK_ITEM,'.')) || 'MATCH_ID');
--
  GO_ITEM(:FORM_HEADER.HOLD_BLK_ITEM);
  HIDE_WINDOW('DETAILS_WINDOW');
--
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
--
  G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,lv_objs,'QUERY');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORCMDO.CALL_DETAIL_OBJ
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CALL_DETAIL_OBJ")
		public void gorcmdo_CallDetailObj()
		{
			
				{
					NString lvObjs = getNameIn(toStr("GORCMDO.OBJS_NAME").append(substring(toStr(getTriggerItem()), - (1), toInt(1))));
					// 
					//  Call the form which is related to this link
					// 
					setGlobal("KEY_IDNO", getNameIn(substring(getFormModel().getFormHeader().getHoldBlkItem(), toInt(1), inStr(getFormModel().getFormHeader().getHoldBlkItem(), toStr("."))).append("MATCH_ID")));
					// 
					goItem(getFormModel().getFormHeader().getHoldBlkItem());
					hideWindow("DETAILS_WINDOW");
					// 
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					// 
					getFormModel().getFormHeader().setSkipSave(toStr("Y"));
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), lvObjs, toStr("QUERY"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC1.WHEN-MOUSE-CLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC1.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="OBJS_DESC1")
		public void objsDesc1_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC1.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('CALL_DETAIL_OBJ');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC1.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OBJS_DESC1")
		public void objsDesc1_buttonClick()
		{
			
				executeAction("CALL_DETAIL_OBJ");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC2.WHEN-MOUSE-CLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC2.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="OBJS_DESC2")
		public void objsDesc2_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC2.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('CALL_DETAIL_OBJ');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC2.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OBJS_DESC2")
		public void objsDesc2_buttonClick()
		{
			
				executeAction("CALL_DETAIL_OBJ");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC3.WHEN-MOUSE-CLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC3.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="OBJS_DESC3")
		public void objsDesc3_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC3.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('CALL_DETAIL_OBJ');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC3.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OBJS_DESC3")
		public void objsDesc3_buttonClick()
		{
			
				executeAction("CALL_DETAIL_OBJ");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC4.WHEN-MOUSE-CLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC4.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="OBJS_DESC4")
		public void objsDesc4_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC4.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('CALL_DETAIL_OBJ');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC4.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OBJS_DESC4")
		public void objsDesc4_buttonClick()
		{
			
				executeAction("CALL_DETAIL_OBJ");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC5.WHEN-MOUSE-CLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC5.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="OBJS_DESC5")
		public void objsDesc5_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC5.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('CALL_DETAIL_OBJ');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC5.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OBJS_DESC5")
		public void objsDesc5_buttonClick()
		{
			
				executeAction("CALL_DETAIL_OBJ");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC6.WHEN-MOUSE-CLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC6.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="OBJS_DESC6")
		public void objsDesc6_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER OBJS_DESC6.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('CALL_DETAIL_OBJ');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * OBJS_DESC6.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="OBJS_DESC6")
		public void objsDesc6_buttonClick()
		{
			
				executeAction("CALL_DETAIL_OBJ");
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
	
}

