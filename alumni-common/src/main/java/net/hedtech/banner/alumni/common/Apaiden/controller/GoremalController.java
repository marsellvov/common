package net.hedtech.banner.alumni.common.Apaiden.controller;
 
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
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqclib.model.GoremalAdapter;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.alumni.common.Apaiden.model.*;
import net.hedtech.banner.alumni.common.Apaiden.*;
import net.hedtech.banner.alumni.common.Apaiden.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GoremalController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqclib.controller.GoremalController getGoqclibGoremalController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.GoremalController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("GOREMAL");
	}	
	
	public GoremalController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public ApaidenTask getTask() {
		return (ApaidenTask)super.getTask();
	}

	public ApaidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@After
		public void goremal_blockChange()
		{
			
			getGoqclibGoremalController().goremal_blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void goremal_AfterQuery(RowAdapterEvent args)
		{
			

						getGoqclibGoremalController().goremal_AfterQuery(args);
		}
		

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@After
		public void goremal_blockOut()
		{
			
			getGoqclibGoremalController().goremal_blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void goremal_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGoqclibGoremalController().goremal_BeforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void goremal_RowInsert(RowAdapterEvent args)
		{
			
			getGoqclibGoremalController().goremal_RowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void goremal_AfterRowInsert(RowAdapterEvent args)
		{
			
			getGoqclibGoremalController().goremal_AfterRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void goremal_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibGoremalController().goremal_BeforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void goremal_RowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibGoremalController().goremal_RowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void goremal_AfterRowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibGoremalController().goremal_AfterRowUpdate(args);
		}

		
		/* Original PL/SQL code code for TRIGGER GOREMAL.ON-DELETE
		 BEGIN
  GB_EMAIL.P_DELETE(p_PIDM          =>:GOREMAL.GOREMAL_PIDM,
                    p_EMAL_CODE     =>:GOREMAL.GOREMAL_EMAL_CODE,
                    p_EMAIL_ADDRESS =>:GOREMAL.GOREMAL_email_address,
                    p_ROWID         =>:GOREMAL.ROWID);
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
		 * GOREMAL.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void goremal_RowDelete(RowAdapterEvent args)
		{
			
				GoremalAdapter goremalElement = (GoremalAdapter)args.getRow();


				try
				{
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					GbEmail.pDelete(/*pPidm=>*/goremalElement.getGoremalPidm(), /*pEmalCode=>*/goremalElement.getGoremalEmalCode(), /*pEmailAddress=>*/goremalElement.getGoremalEmailAddress(), /*pRowid=>*/goremalElement.getROWID());
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void goremal_Save()
		{
			
			getGoqclibGoremalController().goremal_Save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void goremal_NextBlock()
		{
			
			getGoqclibGoremalController().goremal_NextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void goremal_PreviousBlock()
		{
			
			getGoqclibGoremalController().goremal_PreviousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DISABLE_KEYS")
		@Before
		public void goremal_DisableKeys()
		{
			
			getGoqclibGoremalController().goremal_DisableKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ENABLE_KEYS")
		@Before
		public void goremal_EnableKeys()
		{
			
			getGoqclibGoremalController().goremal_EnableKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.PRE_COMMIT_VALIDATE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE_COMMIT_VALIDATE")
		public void goremal_PreCommitValidate()
		{
			
			getGoqclibGoremalController().goremal_PreCommitValidate();
		}

		
		/* Original PL/SQL code code for TRIGGER GOREMAL.KEY-NXTKEY
		   --Adv Org enhancement
  IF :GLOBAL.ALUM_CALLED_FORM = 'Y' THEN
    IF :SYSTEM.block_status = 'QUERY' then
       :GLOBAL.EMAIL_TYPE := :GOREMAL_EMAL_CODE;
       :GLOBAL.EMAIL_ADDRESS := :GOREMAL_EMAIL_ADDRESS;
       G$_DETERMINE_ERASE_GLOBAL;
       G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
    END if;
  END IF;
  --
  GO_ITEM('GOREMAL_EMAL_COMMENT');
  --Adv Org enhancement
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void goremal_KeyNxtkey()
		{
			
				// Adv Org enhancement

				//F2J_WARNING : Caution, the variable may be null.
				GoremalAdapter goremalElement = (GoremalAdapter)this.getFormModel().getGoremal().getRowAdapter(true);


				// Adv Org enhancement
				if ( getGlobal("ALUM_CALLED_FORM").equals("Y") )
				{
					if ( getBlockStatus().equals("QUERY") )
					{
						setGlobal("EMAIL_TYPE", goremalElement.getGoremalEmalCode());
						setGlobal("EMAIL_ADDRESS", goremalElement.getGoremalEmailAddress());
						getTask().getGoqrpls().gDetermineEraseGlobal();
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
				}
				// 
				goItem(toStr("GOREMAL_EMAL_COMMENT"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void goremal_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", this.getFormModel().getKeyBlock().getPidm()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_EMAL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GOREMAL_EMAL_CODE")
		public void goremalEmalCode_doubleClick()
		{
			
			getGoqclibGoremalController().goremalEmalCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_EMAL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOREMAL_EMAL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void goremalEmalCode_itemChange()
		{
			
			getGoqclibGoremalController().goremalEmalCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_EMAL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GOREMAL_EMAL_CODE")
		public void goremalEmalCode_GSearchParameters()
		{
			
			getGoqclibGoremalController().goremalEmalCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_EMAL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GOREMAL_EMAL_CODE")
		public void goremalEmalCode_GSearchOptions()
		{
			
			getGoqclibGoremalController().goremalEmalCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_EMAL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOREMAL_EMAL_CODE", function=KeyFunction.NEXT_ITEM)
		public void goremalEmalCode_keyNexItem()
		{
			
			getGoqclibGoremalController().goremalEmalCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_EMAL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOREMAL_EMAL_CODE", function=KeyFunction.ITEM_OUT)
		public void goremalEmalCode_itemOut()
		{
			
			getGoqclibGoremalController().goremalEmalCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_EMAL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOREMAL_EMAL_CODE")
		public void goremalEmalCode_validate()
		{
			
			getGoqclibGoremalController().goremalEmalCode_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_EMAL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GOREMAL_EMAL_CODE_LBT")
		@Before
		public void goremalEmalCodeLbt_click()
		{
			
			getGoqclibGoremalController().goremalEmalCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EMAIL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="EMAIL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void emailDesc_itemChange()
		{
			
			getGoqclibGoremalController().emailDesc_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_EMAIL_ADDRESS.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOREMAL_EMAIL_ADDRESS")
		public void goremalEmailAddress_validate()
		{
			
			getGoqclibGoremalController().goremalEmailAddress_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_PREFERRED_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GOREMAL_PREFERRED_IND")
		public void goremalPreferredInd_checkBoxChange()
		{
			
			getGoqclibGoremalController().goremalPreferredInd_checkBoxChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_PREFERRED_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOREMAL_PREFERRED_IND")
		public void goremalPreferredInd_validate()
		{
			
			getGoqclibGoremalController().goremalPreferredInd_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_STATUS_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="GOREMAL_STATUS_IND")
		public void goremalStatusInd_checkBoxChange()
		{
			
			getGoqclibGoremalController().goremalStatusInd_checkBoxChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_STATUS_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GOREMAL_STATUS_IND")
		public void goremalStatusInd_validate()
		{
			
			getGoqclibGoremalController().goremalStatusInd_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GOREMAL_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void goremalActivityDate_keyNexItem()
		{
			
			getGoqclibGoremalController().goremalActivityDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GOREMAL_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void goremalActivityDate_itemChange()
		{
			
			getGoqclibGoremalController().goremalActivityDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GOREMAL_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GOREMAL_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void goremalActivityDate_itemOut()
		{
			
			getGoqclibGoremalController().goremalActivityDate_itemOut();
		}

		
	
	
}

