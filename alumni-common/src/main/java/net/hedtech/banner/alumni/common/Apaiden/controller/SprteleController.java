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
import net.hedtech.general.common.libraries.Goqclib.model.SprteleAdapter;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.alumni.common.Apaiden.model.*;
import net.hedtech.banner.alumni.common.Apaiden.*;
import net.hedtech.banner.alumni.common.Apaiden.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SprteleController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqclib.controller.SprteleController getGoqclibSprteleController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.SprteleController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("SPRTELE");
	}	
	
	public SprteleController(IFormController parentController, String name) 
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
		 * SPRTELE.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void sprtele_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGoqclibSprteleController().sprtele_BeforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void sprtele_RowInsert(RowAdapterEvent args)
		{
			
			getGoqclibSprteleController().sprtele_RowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void sprtele_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSprteleController().sprtele_BeforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void sprtele_RowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSprteleController().sprtele_RowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void sprtele_RowDelete(RowAdapterEvent args)
		{
			
			getGoqclibSprteleController().sprtele_RowDelete(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void sprtele_TotalResults()
		{
			
			getGoqclibSprteleController().sprtele_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sprtele_NextBlock()
		{
			
			getGoqclibSprteleController().sprtele_NextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sprtele_PreviousBlock()
		{
			
			getGoqclibSprteleController().sprtele_PreviousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.DO_EDITS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DO_EDITS")
		public void sprtele_DoEdits()
		{
			
			getGoqclibSprteleController().sprtele_DoEdits();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRTELE.KEY-NXTKEY
		   --Adv Org enhancement
  IF :GLOBAL.ALUM_CALLED_FORM = 'Y' THEN
    IF :SYSTEM.block_status = 'QUERY' then
   :GLOBAL.TELE_TYPE  := :SPRTELE_TELE_CODE ;
   :GLOBAL.TELE_CTRY_CODE := :SPRTELE_CTRY_CODE_PHONE ;
   :GLOBAL.TELE_AREA  := :SPRTELE_PHONE_AREA ;
   :GLOBAL.TELE_PHONE := :SPRTELE_PHONE_NUMBER ;
   :GLOBAL.TELE_EXT   := :SPRTELE_PHONE_EXT ;
       G$_DETERMINE_ERASE_GLOBAL;
       G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
    END if;
  END IF;
  --
  GO_ITEM('SPRTELE_COMMENT');
  --Adv Org enhancement
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void sprtele_KeyNxtkey()
		{
			
				// Adv Org enhancement

				//F2J_WARNING : Caution, the variable may be null.
				SprteleAdapter sprteleElement = (SprteleAdapter)this.getFormModel().getSprtele().getRowAdapter(true);


				// Adv Org enhancement
				if ( getGlobal("ALUM_CALLED_FORM").equals("Y") )
				{
					if ( getBlockStatus().equals("QUERY") )
					{
						setGlobal("TELE_TYPE", sprteleElement.getSprteleTeleCode());
						setGlobal("TELE_CTRY_CODE", sprteleElement.getSprteleCtryCodePhone());
						setGlobal("TELE_AREA", sprteleElement.getSprtelePhoneArea());
						setGlobal("TELE_PHONE", sprteleElement.getSprtelePhoneNumber());
						setGlobal("TELE_EXT", sprteleElement.getSprtelePhoneExt());
						getTask().getGoqrpls().gDetermineEraseGlobal();
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
				}
				// 
				goItem(toStr("SPRTELE_COMMENT"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sprtele_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", this.getFormModel().getKeyBlock().getPidm()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_TELE_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRTELE_TELE_CODE")
		public void sprteleTeleCode_doubleClick()
		{
			
			getGoqclibSprteleController().sprteleTeleCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_TELE_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRTELE_TELE_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sprteleTeleCode_itemChange()
		{
			
			getGoqclibSprteleController().sprteleTeleCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_TELE_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRTELE_TELE_CODE")
		public void sprteleTeleCode_GSearchParameters()
		{
			
			getGoqclibSprteleController().sprteleTeleCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_TELE_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRTELE_TELE_CODE")
		public void sprteleTeleCode_GSearchOptions()
		{
			
			getGoqclibSprteleController().sprteleTeleCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_TELE_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRTELE_TELE_CODE", function=KeyFunction.NEXT_ITEM)
		public void sprteleTeleCode_keyNexItem()
		{
			
			getGoqclibSprteleController().sprteleTeleCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_TELE_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRTELE_TELE_CODE", function=KeyFunction.ITEM_OUT)
		public void sprteleTeleCode_itemOut()
		{
			
			getGoqclibSprteleController().sprteleTeleCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_TELE_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRTELE_TELE_CODE")
		public void sprteleTeleCode_PostChange()
		{
			
			getGoqclibSprteleController().sprteleTeleCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_TELE_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRTELE_TELE_CODE_LBT")
		@Before
		public void sprteleTeleCodeLbt_click()
		{
			
			getGoqclibSprteleController().sprteleTeleCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TELE_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void teleDescription_itemChange()
		{
			
			getGoqclibSprteleController().teleDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_PRIMARY_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="SPRTELE_PRIMARY_IND")
		public void sprtelePrimaryInd_checkBoxChange()
		{
			
			getGoqclibSprteleController().sprtelePrimaryInd_checkBoxChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_STATUS_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="SPRTELE_STATUS_IND")
		public void sprteleStatusInd_checkBoxChange()
		{
			
			getGoqclibSprteleController().sprteleStatusInd_checkBoxChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ATYP_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SPRTELE_ATYP_CODE", function=KeyFunction.COUNT_QUERY)
		public void sprteleAtypCode_TotalResults()
		{
			
			getGoqclibSprteleController().sprteleAtypCode_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ATYP_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SPRTELE_ATYP_CODE", function=KeyFunction.LIST_VALUES)
		public void sprteleAtypCode_ListValues()
		{
			
			getGoqclibSprteleController().sprteleAtypCode_ListValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ATYP_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRTELE_ATYP_CODE")
		public void sprteleAtypCode_PostChange()
		{
			
			getGoqclibSprteleController().sprteleAtypCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ATYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRTELE_ATYP_CODE", function=KeyFunction.ITEM_OUT)
		public void sprteleAtypCode_itemOut()
		{
			
			getGoqclibSprteleController().sprteleAtypCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ATYP_CODE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRTELE_ATYP_CODE_BTN")
		@Before
		public void sprteleAtypCodeBtn_click()
		{
			
			getGoqclibSprteleController().sprteleAtypCodeBtn_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ATYP_CODE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRTELE_ATYP_CODE_BTN")
		public void sprteleAtypCodeBtn_buttonClick()
		{
			
			getGoqclibSprteleController().sprteleAtypCodeBtn_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ATYP_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ATYP_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void atypDescription_itemChange()
		{
			
			getGoqclibSprteleController().atypDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ADDR_SEQNO.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRTELE_ADDR_SEQNO", function=KeyFunction.NEXT_ITEM)
		public void sprteleAddrSeqno_keyNexItem()
		{
			
			getGoqclibSprteleController().sprteleAddrSeqno_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ADDR_SEQNO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRTELE_ADDR_SEQNO")
		public void sprteleAddrSeqno_validate()
		{
			
			getGoqclibSprteleController().sprteleAddrSeqno_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ADDR_SEQNO.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SPRTELE_ADDR_SEQNO", function=KeyFunction.COUNT_QUERY)
		public void sprteleAddrSeqno_TotalResults()
		{
			
			getGoqclibSprteleController().sprteleAddrSeqno_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ADDR_SEQNO_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRTELE_ADDR_SEQNO_BTN")
		@Before
		public void sprteleAddrSeqnoBtn_click()
		{
			
			getGoqclibSprteleController().sprteleAddrSeqnoBtn_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ADDR_SEQNO_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRTELE_ADDR_SEQNO_BTN")
		public void sprteleAddrSeqnoBtn_buttonClick()
		{
			
			getGoqclibSprteleController().sprteleAddrSeqnoBtn_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRTELE_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void sprteleActivityDate_keyNexItem()
		{
			
			getGoqclibSprteleController().sprteleActivityDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRTELE_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void sprteleActivityDate_itemChange()
		{
			
			getGoqclibSprteleController().sprteleActivityDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRTELE_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void sprteleActivityDate_itemOut()
		{
			
			getGoqclibSprteleController().sprteleActivityDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_TELE_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRTELE_TELE_CODE")
		public void sprteleTeleCode_validate()
		{
			

			SprteleAdapter sprteleElement = (SprteleAdapter)this.getFormModel().getSprtele().getRowAdapter(true);
			this.sprteleTeleCode_PostChange();

		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sprtele_AfterQuery(RowAdapterEvent args)
		{
			

				SprteleAdapter sprteleElement = (SprteleAdapter)args.getRow();
				try
				{
					sprteleElement.setLockDbValues(true);
					try{
						this.sprteleTeleCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.sprteleAtypCode_PostChange();

					} catch (Exception ex) { }

				} finally { 
					sprteleElement.setLockDbValues(false);
				}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRTELE_ATYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRTELE_ATYP_CODE")
		public void sprteleAtypCode_validate()
		{
			

			SprteleAdapter sprteleElement = (SprteleAdapter)this.getFormModel().getSprtele().getRowAdapter(true);
			this.sprteleAtypCode_PostChange();

		}

		
	
	
}

