package net.hedtech.general.common.libraries.Goqclib.controller;
 
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
import net.hedtech.general.common.libraries.Goqclib.model.*;
import net.hedtech.general.common.libraries.Goqclib.*;
import net.hedtech.general.common.libraries.Goqclib.services.*;

		
public class GoradidController extends AbstractSupportCodeObject {
	
		
	
	public GoradidController(ISupportCodeContainer container) 
	{
		super(container);
	}
		
		
		
	@Override
	public GoqclibTaskPart getContainer() {
		return (GoqclibTaskPart)super.getContainer();
	}

	public GoqclibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GORADID.WHEN-NEW-BLOCK-INSTANCE
		 -- 81-1 uncomment variable for use in commit 
:cmt_result := 'success'; --set initial value
--
IF :ID IS NULL THEN
  MESSAGE(G$_NLS.Get('GOQCLIB-0172','FORM','*ERROR* Invalid code; press LIST for valid value.') );
  GO_BLOCK('key_block');
ELSE
  EXECUTE_TRIGGER('DISABLE_KEYS');
  EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
  CLEAR_RECORD;
--
  EXECUTE_QUERY(ALL_RECORDS);
  G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void goradid_blockChange()
		{
			
				//  81-1 uncomment variable for use in commit 
				//  81-1 uncomment variable for use in commit 
				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				getFormModel().getBusinessObject("FORM_HEADER").setValue("CMT_RESULT","success");
				// set initial value
				// 
				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				if ( toStr(getFormModel().getBusinessObject("KEY_BLOCK").getValue("ID")).isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOQCLIB-0172"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid value.")));
					goBlock(toStr("key_block"));
				}
				else {
					executeAction("DISABLE_KEYS");
					executeAction("ENABLE_TAB_PAGES");
					clearRecord();
					// 
					//MORPHIS: Query all records
					this.getContainer().getServices().executeQuery();
					getContainer().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.POST-QUERY
		 --
-- get the corresponding gtvadid_desc and display it on query
--
DECLARE
  CURSOR s1 IS
  SELECT gtvadid_desc
    FROM gtvadid
   WHERE gtvadid_code = :GORADID.goradid_adid_code;
BEGIN
  OPEN s1;
  FETCH s1 INTO :GORADID.adid_desc; 
  CLOSE s1;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void goradid_AfterQuery(RowAdapterEvent args)
		{
			
				// 
				//  get the corresponding gtvadid_desc and display it on query
				// 
				GoradidAdapter goradidElement = (GoradidAdapter)args.getRow();


				int rowCount = 0;
				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				{
					String sqls1 = "SELECT gtvadid_desc " +
	" FROM gtvadid " +
	" WHERE gtvadid_code = :GORADID_GORADID_ADID_CODE ";
					DataCursor s1 = new DataCursor(sqls1);
					try {
						//Setting query parameters
						s1.addParameter("GORADID_GORADID_ADID_CODE", goradidElement.getGoradidAdidCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable s1.
						s1.open();
						ResultSet s1Results = s1.fetchInto();
						if ( s1Results != null ) {
							goradidElement.setAdidDesc(s1Results.getStr(0));
						}
//						s1.close();
					}
					finally{
						s1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.POST-BLOCK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void goradid_blockOut()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.PRE-INSERT
		 EXECUTE_TRIGGER('PRE_COMMIT_VALIDATE');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void goradid_BeforeRowInsert(RowAdapterEvent args)
		{
			
				executeAction("PRE_COMMIT_VALIDATE");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.ON-INSERT
		 BEGIN
  GB_ADDITIONAL_IDENT.P_CREATE(p_PIDM          =>:GORADID.GORADID_PIDM,
                               p_additional_id =>:GORADID.GORADID_ADDITIONAL_ID,
                               p_adid_code     =>:GORADID.GORADID_ADID_CODE,
                               p_USER_ID       =>:GORADID.GORADID_USER_ID,
                               p_DATA_ORIGIN   =>:GLOBAL.DATA_ORIGIN,
                               p_ROWID_OUT     =>:GORADID.ROWID);
  :GORADID_ACTIVITY_DATE := SYSDATE;   
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void goradid_RowInsert(RowAdapterEvent args)
		{
			
				GoradidAdapter goradidElement = (GoradidAdapter)args.getRow();


				try
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Ref<byte[]> p_rowid_out_ref = new Ref<byte[]>();
					GbAdditionalIdent.pCreate(/*pPidm=>*/goradidElement.getGoradidPidm(), /*pAdditionalId=>*/goradidElement.getGoradidAdditionalId(), /*pAdidCode=>*/goradidElement.getGoradidAdidCode(), /*pUserId=>*/goradidElement.getGoradidUserId(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), p_rowid_out_ref);
					goradidElement.setROWID(p_rowid_out_ref.val);
					goradidElement.setGoradidActivityDate(NDate.getNow());
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.POST-INSERT
		 NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void goradid_AfterRowInsert(RowAdapterEvent args)
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.PRE-UPDATE
		 EXECUTE_TRIGGER('PRE_COMMIT_VALIDATE');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void goradid_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				executeAction("PRE_COMMIT_VALIDATE");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.ON-UPDATE
		 BEGIN
	GB_ADDITIONAL_IDENT.P_UPDATE(p_PIDM          =>:GORADID.GORADID_PIDM,
                               p_additional_id =>:GORADID.GORADID_ADDITIONAL_ID,
                               p_adid_code     =>:GORADID.GORADID_ADID_CODE,
                               p_USER_ID       =>:GORADID.GORADID_USER_ID,
                               p_DATA_ORIGIN   =>:GLOBAL.DATA_ORIGIN,
                               p_ROWID         =>:GORADID.ROWID);
  :GORADID_ACTIVITY_DATE := SYSDATE;
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void goradid_RowUpdate(RowAdapterEvent args)
		{
			
				GoradidAdapter goradidElement = (GoradidAdapter)args.getRow();


				try
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					GbAdditionalIdent.pUpdate(/*pPidm=>*/goradidElement.getGoradidPidm(), /*pAdditionalId=>*/goradidElement.getGoradidAdditionalId(), /*pAdidCode=>*/goradidElement.getGoradidAdidCode(), /*pUserId=>*/goradidElement.getGoradidUserId(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pRowid=>*/goradidElement.getROWID());
					goradidElement.setGoradidActivityDate(NDate.getNow());
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.POST-UPDATE
		 BEGIN
	SELECT ROWID 
	  INTO :GORADID.ROWID
	  FROM GORADID	  
	 WHERE goradid_pidm = :GORADID.GORADID_PIDM
     AND goradid_adid_code = :GORADID.GORADID_ADID_CODE
     AND goradid_additional_id = :GORADID.GORADID_ADDITIONAL_ID;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void goradid_AfterRowUpdate(RowAdapterEvent args)
		{
			
				GoradidAdapter goradidElement = (GoradidAdapter)args.getRow();


				int rowCount = 0;
				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				String sql1 = "SELECT ROWID " +
	" FROM GORADID " +
	" WHERE goradid_pidm = :GORADID_GORADID_PIDM AND goradid_adid_code = :GORADID_GORADID_ADID_CODE AND goradid_additional_id = :GORADID_GORADID_ADDITIONAL_ID ";
				DataCommand command1 = new DataCommand(sql1);
				//Setting query parameters
				command1.addParameter("GORADID_GORADID_PIDM", goradidElement.getGoradidPidm());
				command1.addParameter("GORADID_GORADID_ADID_CODE", goradidElement.getGoradidAdidCode());
				command1.addParameter("GORADID_GORADID_ADDITIONAL_ID", goradidElement.getGoradidAdditionalId());
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					goradidElement.getROWID();//Unknown Type, using string (scope = GORADID.POST-UPDATE)
				}
				results1.close();
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.ON-DELETE
		 -- 80-8  add parameter p_adid_code to call list to sync w/API
BEGIN
  GB_ADDITIONAL_IDENT.P_DELETE(p_PIDM          =>:GORADID.GORADID_PIDM,
                               p_additional_id =>:GORADID.GORADID_ADDITIONAL_ID,
                               p_adid_code     =>:GORADID.GORADID_ADID_CODE,
                               p_ROWID         =>:GORADID.ROWID);
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void goradid_RowDelete(RowAdapterEvent args)
		{
			
				//  80-8  add parameter p_adid_code to call list to sync w/API
				GoradidAdapter goradidElement = (GoradidAdapter)args.getRow();


				try
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					GbAdditionalIdent.pDelete(/*pPidm=>*/goradidElement.getGoradidPidm(), /*pAdditionalId=>*/goradidElement.getGoradidAdditionalId(), /*pAdidCode=>*/goradidElement.getGoradidAdidCode(), /*pRowid=>*/goradidElement.getROWID());
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.KEY-COMMIT
		 -- 81-1 add requery of block
COMMIT_FORM;
IF 	:cmt_result = 'success' THEN
  	EXECUTE_QUERY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void goradid_Save()
		{
			
				//  81-1 add requery of block
				//  81-1 add requery of block
				commitTask();
				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				if ( getFormModel().getBusinessObject("FORM_HEADER").getValue("CMT_RESULT").equals("success") )
				{
					this.getContainer().getServices().executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.KEY-NXTBLK
		 IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN 
  GO_ITEM(:SYSTEM.CURSOR_ITEM);
  MESSAGE(G$_NLS.Get('GOQCLIB-0173','FORM','Additional Identification information changed, press SAVE before leaving current window.'));
ELSE
  EXECUTE_TRIGGER('KEY_NXTBLOCK_TRG');
END IF;

	

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void goradid_NextBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					goItem(toStr(getCursorItem()));
					warningMessage(GNls.Fget(toStr("GOQCLIB-0173"), toStr("FORM"), toStr("Additional Identification information changed, press SAVE before leaving current window.")));
				}
				else {
					executeAction("KEY_NXTBLOCK_TRG");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.KEY-PRVBLK
		 IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN 
  GO_ITEM(:SYSTEM.CURSOR_ITEM);
  MESSAGE(G$_NLS.Get('GOQCLIB-0174','FORM','Additional Identification information changed, press SAVE before leaving current window.'));
ELSE
  EXECUTE_TRIGGER('KEY_PRVBLOCK_TRG');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void goradid_PreviousBlock()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					goItem(toStr(getCursorItem()));
					warningMessage(GNls.Fget(toStr("GOQCLIB-0174"), toStr("FORM"), toStr("Additional Identification information changed, press SAVE before leaving current window.")));
				}
				else {
					executeAction("KEY_PRVBLOCK_TRG");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.DISABLE_KEYS
		 SET_ITEM_PROPERTY('ID',     ENABLED, PROPERTY_FALSE);
SET_ITEM_PROPERTY('ID_LBT', ENABLED, PROPERTY_FALSE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DISABLE_KEYS")
		public void goradid_DisableKeys()
		{
			
				setItemEnabled("ID", false);
				setItemEnabled("ID_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.ENABLE_KEYS
		 SET_ITEM_PROPERTY('ID',     ENABLED,   PROPERTY_TRUE);
SET_ITEM_PROPERTY('ID',     NAVIGABLE, PROPERTY_TRUE);
SET_ITEM_PROPERTY('ID_LBT', ENABLED,   PROPERTY_TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ENABLE_KEYS")
		public void goradid_EnableKeys()
		{
			
				setItemEnabled("ID", true);
				setItemNavigable("ID", true);
				setItemEnabled("ID_LBT", true);
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID.PRE_COMMIT_VALIDATE
		 BEGIN
  IF :GORADID.GORADID_ADID_CODE IS NULL THEN
    MESSAGE(G$_NLS.GET('GOQCLIB-0175','FORM','*ERROR* ID Type is required.'));
    :cmt_result := 'failed'; 
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  :GORADID.goradid_pidm          := :KEY_BLOCK.pidm;
  :GORADID.goradid_user_id       := :GLOBAL.CURRENT_USER;
--
  IF :GORADID.goradid_additional_id IS NULL THEN
    G$_CHECK_VALUE(TRUE,G$_NLS.Get('GOQCLIB-0176','FORM','*ERROR* Additional Identification is required.'),TRUE);
  END IF;
--
  IF :GORADID.GORADID_USER_ID IS NULL THEN
    :GORADID.GORADID_USER_ID := USER;
  END IF;  		
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.PRE_COMMIT_VALIDATE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE_COMMIT_VALIDATE")
		public void goradid_PreCommitValidate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				GoradidAdapter goradidElement = (GoradidAdapter)this.getFormModel().getGoradid().getRowAdapter(true);


				if ( goradidElement.getGoradidAdidCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOQCLIB-0175"), toStr("FORM"), toStr("*ERROR* ID Type is required.")));
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				
					getFormModel().getBusinessObject("FORM_HEADER").setValue("CMT_RESULT","failed");
					throw new ApplicationException();
				}
				// 
				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				goradidElement.setGoradidPidm(toNumber(getFormModel().getBusinessObject("KEY_BLOCK").getValue("PIDM")));
				goradidElement.setGoradidUserId(getGlobal("CURRENT_USER"));
				// 
				if ( goradidElement.getGoradidAdditionalId().isNull() )
				{
					getContainer().getGoqrpls().gCheckValue(NBool.True, GNls.Fget(toStr("GOQCLIB-0176"), toStr("FORM"), toStr("*ERROR* Additional Identification is required.")), NBool.True);
				}
				// 
				if ( goradidElement.getGoradidUserId().isNull() )
				{
					goradidElement.setGoradidUserId(getUser());
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void goradid_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", toNumber(getFormModel().getBusinessObject("KEY_BLOCK").getValue("PIDM"))));             


           
               }

		
		/* Original PL/SQL code code for TRIGGER GORADID_ADID_CODE.WHEN-VALIDATE-ITEM
		 -- 81-1 replace cursor with API to return description
IF	:GORADID.GORADID_ADID_CODE IS NULL THEN
		:GORADID.ADID_DESC := '';
  	RETURN;
END IF;
--
:GORADID.ADID_DESC := GB_GTVADID.f_get_description(p_code => :GORADID.GORADID_ADID_CODE);
IF  :GORADID.ADID_DESC is NULL THEN
		MESSAGE(G$_NLS.Get('GOQCLIB-0177','FORM','*ERROR* Invalid ID Type code; press LIST for valid code.'));
  	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADID_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORADID_ADID_CODE")
		public void goradidAdidCode_validate()
		{
			
				//  81-1 replace cursor with API to return description

				//F2J_WARNING : Caution, the variable may be null.
				GoradidAdapter goradidElement = (GoradidAdapter)this.getFormModel().getGoradid().getRowAdapter(true);


				//  81-1 replace cursor with API to return description
				if ( goradidElement.getGoradidAdidCode().isNull() )
				{
					goradidElement.setAdidDesc(toStr(""));
					return ;
				}
				// 
				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				goradidElement.setAdidDesc(GbGtvadid.fGetDescription(/*pCode=>*/goradidElement.getGoradidAdidCode()));
				if ( goradidElement.getAdidDesc().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOQCLIB-0177"), toStr("FORM"), toStr("*ERROR* Invalid ID Type code; press LIST for valid code.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID_ADDITIONAL_ID.WHEN-VALIDATE-ITEM
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADDITIONAL_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORADID_ADDITIONAL_ID")
		public void goradidAdditionalId_validate()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID_ACTIVITY_DATE.KEY-NEXT-ITEM
		 BEGIN
  G$_DATE_NEXT_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORADID_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void goradidActivityDate_keyNexItem()
		{
			
			getContainer().getGoqrpls().gDateNextItem();
			getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_DATE_WHEN_NEW_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORADID_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void goradidActivityDate_itemChange()
		{
			
			getContainer().getGoqrpls().gDateWhenNewItem();
			getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GORADID_ACTIVITY_DATE.POST-TEXT-ITEM
		 BEGIN
  G$_DATE_POST_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORADID_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void goradidActivityDate_itemOut()
		{
			
			getContainer().getGoqrpls().gDatePostItem();
			getContainer().getGoqrpls().gCheckFailure();
		}


		public void goradidAdidCode_keyNexItem() {
			
            getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
            getContainer().getGoqrpls().gCheckFailure();
            nextItem();			
		}



		public void goradidAdidCode_doubleClick() {
			getContainer().getGoqrpls().getGSearch().whenMouseClick();
			getContainer().getGoqrpls().gCheckFailure();
			
		}



		public void goradidAdidCode_itemChange() {
			getContainer().getGoqrpls().getGSearch().codeWhenNewItemInst();
			getContainer().getGoqrpls().gCheckFailure();
		}



		public void goradidAdidCode_GSearchParameters() {
			getContainer().getGoqrpls().getGSearch().parameters(toStr(""), toStr(""), toStr(""));
			getContainer().getGoqrpls().gCheckFailure();
			
		}



		public void goradidAdidCode_GSearchOptions() {
			executeAction(KeyFunction.LIST_VALUES.toString());
			
		}



		public void goradidAdidCode_itemOut() {
			getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
			getContainer().getGoqrpls().gCheckFailure();
		}



		public void goradidAdidCodeLbt_click() {
			
		}



		public void adidDesc_itemChange() {
			previousItem();
			
		}

	
}

