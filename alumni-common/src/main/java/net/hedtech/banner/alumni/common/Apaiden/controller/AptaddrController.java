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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;

import net.hedtech.banner.alumni.common.Apaiden.model.*;
import net.hedtech.banner.alumni.common.Apaiden.*;
import net.hedtech.banner.alumni.common.Apaiden.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class AptaddrController extends DefaultBlockController {

	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	

	
	public AptaddrController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER APTADDR.KEY-NXTBLK
		 -- PLU-LWS
-- "Rollback" the changes (save and remove the records).
--
BEGIN
   -- Do clean-up
   REMOVE_HOUSEHOLD_TEMP_RECS;
   CLEAR_BLOCK(NO_VALIDATE);
   EXECUTE_TRIGGER('ENABLE_NON_HOUSEHOLD_TABS');
   G$_CHECK_FAILURE;
   GO_BLOCK('SPRADDR');
   HOUSEHOLD_ITEMS_DISABLE;   
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void aptaddr_NextBlock()
		{
			
				//  PLU-LWS
				//  "Rollback" the changes (save and remove the records).
				// 
				//  Do clean-up
				this.getTask().getServices().removeHouseholdTempRecs();
				clearBlock(TaskServices.NO_VALIDATE);
				executeAction("ENABLE_NON_HOUSEHOLD_TABS");
				getTask().getGoqrpls().gCheckFailure();
				goBlock(toStr("SPRADDR"));
				this.getTask().getServices().householdItemsDisable();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR.KEY-PRVBLK
		 GO_ITEM('APTADDR_GUASYST_BTN');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void aptaddr_PreviousBlock()
		{
			
				goItem(toStr("APTADDR_GUASYST_BTN"));
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR.KEY-COMMIT
		 DECLARE
	blk_id   Block;
BEGIN
   IF G$_QUERY_ONLY_ROLE THEN
      MESSAGE(G$_NLS.Get('APAIDEN-0056', 'FORM', '*ERROR* Form running in query-only mode. This option is not available.'));
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
	 blk_id := FIND_BLOCK('APTADDR');
	 
	 IF NOT ID_NULL(blk_id) THEN
	 	  -- Save any indicators that haven't been saved yet.
      IF GET_BLOCK_PROPERTY(blk_id, STATUS) = 'CHANGED'  THEN
          DO_SILENT_COMMIT;
      END IF;
      SET_BLOCK_PROPERTY(blk_id, DELETE_ALLOWED, PROPERTY_TRUE);
      SET_BLOCK_PROPERTY(blk_id, INSERT_ALLOWED, PROPERTY_TRUE);
   END IF;
   -- Process the household recs...inactivate old addresses, create new ones, based on address/telephone
   -- for current constituent.
   PROCESS_HOUSEHOLD_ADDR_RECS;
   
   -- Do clean up
   GO_BLOCK('APTADDR');
   REMOVE_HOUSEHOLD_TEMP_RECS;
   CLEAR_BLOCK(NO_VALIDATE);
   --
   EXECUTE_TRIGGER('ENABLE_NON_HOUSEHOLD_TABS');
   G$_CHECK_FAILURE;
   GO_BLOCK('SPRADDR');
   HOUSEHOLD_ITEMS_DISABLE;   
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void aptaddr_Save()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				{
					BlockDescriptor blkId= null;
					if ( getTask().getGoqrpls().gQueryOnlyRole().getValue() )
					{
						errorMessage(GNls.Fget(toStr("APAIDEN-0056"), toStr("FORM"), toStr("*ERROR* Form running in query-only mode. This option is not available.")));
						throw new ApplicationException();
					}
					blkId = findBlock("APTADDR");
					if ( !(blkId == null) )
					{
						//  Save any indicators that haven't been saved yet.
						//MORPHIS TODO MP CAUTION!
//						if ( getBlockStatus(blkId).equals("CHANGED") )
						if ( getBlockStatus().equals("CHANGED") )
						{
							this.getTask().getServices().doSilentCommit();
						}
						setBlockDeleteAllowed(blkId, true);
						setBlockInsertAllowed(blkId, true);
					}
					//  Process the household recs...inactivate old addresses, create new ones, based on address/telephone
					//  for current constituent.
					this.getTask().getServices().processHouseholdAddrRecs(spraddrElement);
					//  Do clean up
					goBlock(toStr("APTADDR"));
					this.getTask().getServices().removeHouseholdTempRecs();
					clearBlock(TaskServices.NO_VALIDATE);
					// 
					executeAction("ENABLE_NON_HOUSEHOLD_TABS");
					getTask().getGoqrpls().gCheckFailure();
					goBlock(toStr("SPRADDR"));
					this.getTask().getServices().householdItemsDisable();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR.KEY-CLRFRM
		 DECLARE
   tab_page_id TAB_PAGE;
BEGIN
   -- Do clean up
 	 GO_BLOCK('APTADDR');
   REMOVE_HOUSEHOLD_TEMP_RECS;
   --
   -- Re-enable CURRENT_ID_TAB before CLRFRM_TRIGGER
   --tab_page_id := FIND_TAB_PAGE('CURRENT_ID_TAB');
   --IF NOT ID_NULL(tab_page_id) THEN
   --   IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
   --      SET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED,PROPERTY_TRUE);
   --   END IF;
   --END IF;
   --
   EXECUTE_TRIGGER('CLRFRM_TRIGGER');
   G$_CHECK_FAILURE;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void aptaddr_ClearTask()
		{
			
				{
					TabPageDescriptor tabPageId= null;
					//  Do clean up
					goBlock(toStr("APTADDR"));
					this.getTask().getServices().removeHouseholdTempRecs();
					// 
					//  Re-enable CURRENT_ID_TAB before CLRFRM_TRIGGER
					// tab_page_id := FIND_TAB_PAGE('CURRENT_ID_TAB');
					// IF NOT ID_NULL(tab_page_id) THEN
					//    IF GET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED) = 'FALSE' THEN
					//       SET_TAB_PAGE_PROPERTY(tab_page_id,ENABLED,PROPERTY_TRUE);
					//    END IF;
					// END IF;
					// 
					executeAction("CLRFRM_TRIGGER");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR.POST-QUERY
		 IF :APTADDR_NATN_CODE IS NOT NULL THEN
   :TADDR_NATN_DESC := gb_stvnatn.f_get_description(:APTADDR_NATN_CODE);
END IF;
--
IF :APTADDR_CNTY_CODE IS NOT NULL THEN
   :TADDR_CNTY_DESC := gb_stvcnty.f_get_description(:APTADDR_CNTY_CODE);
END IF;
--
IF :APTADDR_HEADER.HOUSEHOLD_COUNT > 0 THEN
	   SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, g$_nls.get('APAIDEN-0057','FORM','Household Members (%01%)',
   	                         :APTADDR_HEADER.HOUSEHOLD_COUNT ));
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void aptaddr_AfterQuery(RowAdapterEvent args)
		{
			
				AptaddrAdapter aptaddrElement = (AptaddrAdapter)args.getRow();


				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				if ( !aptaddrElement.getAptaddrNatnCode().isNull() )
				{
					aptaddrElement.setTaddrNatnDesc(GbStvnatn.fGetDescription(aptaddrElement.getAptaddrNatnCode()));
				}
				// 
				if ( !aptaddrElement.getAptaddrCntyCode().isNull() )
				{
					aptaddrElement.setTaddrCntyDesc(GbStvcnty.fGetDescription(aptaddrElement.getAptaddrCntyCode()));
				}
				// 
				if ( getFormModel().getAptaddrHeader().getHouseholdCount().greater(toStr(0)) )
				{
					setTabPageLabel("HOUSEHOLD_TAB", GNls.Fget(toStr("APAIDEN-0057"), toStr("FORM"), toStr("Household Members (%01%)"), getFormModel().getAptaddrHeader().getHouseholdCount()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_SLCT_IND.KEY-CQUERY
		 --
-- PLU-LWS Cannot call trigger CALL_GUASYST because it overwrites 
-- the modified keys...so call SAVE_KEYS, then modify IDNO/BLOCK_FIELD.
--
EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
G$_CHECK_FAILURE ;
--
:GLOBAL.KEY_IDNO := :APTADDR.APTADDR_ID ;
:HOLD_BLOCK_FIELD := 'APTADDR.APTADDR_SLCT_IND';
--EXECUTE_TRIGGER('CALL_GUASYST');
--
   :GLOBAL.SECRFRM := 'GUASYST' ;
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GUASYST','');
--
   GO_FIELD( :HOLD_BLOCK_FIELD ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_SLCT_IND.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="APTADDR_SLCT_IND", function=KeyFunction.COUNT_QUERY)
		public void aptaddrSlctInd_TotalResults()
		{
			
				// 
				//  PLU-LWS Cannot call trigger CALL_GUASYST because it overwrites 
				//  the modified keys...so call SAVE_KEYS, then modify IDNO/BLOCK_FIELD.
				// 

				//F2J_WARNING : Caution, the variable may be null.
				AptaddrAdapter aptaddrElement = (AptaddrAdapter)this.getFormModel().getAptaddr().getRowAdapter(true);


				// 
				//  PLU-LWS Cannot call trigger CALL_GUASYST because it overwrites 
				//  the modified keys...so call SAVE_KEYS, then modify IDNO/BLOCK_FIELD.
				// 
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				setGlobal("KEY_IDNO", aptaddrElement.getAptaddrId());
				getFormModel().getFormHeader().setHoldBlockField(toStr("APTADDR.APTADDR_SLCT_IND"));
				// EXECUTE_TRIGGER('CALL_GUASYST');
				// 
				setGlobal("SECRFRM", toStr("GUASYST"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GUASYST"), toStr(""));
				// 
				goField(getFormModel().getFormHeader().getHoldBlockField());
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_SLCT_IND.KEY-ENTQRY
		 EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_SLCT_IND.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", item="APTADDR_SLCT_IND", function=KeyFunction.SEARCH)
		public void aptaddrSlctInd_Search()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_SLCT_IND.WHEN-NEW-ITEM-INSTANCE
		 IF :APTADDR.APTADDR_UPDATABLE_IND = 'Y' THEN
   set_item_property('APTADDR_SLCT_IND',updateable,property_on);
   IF TRUNC(NVL(:APTADDR.APTADDR_FROM_DATE,SYSDATE)) > TRUNC(SYSDATE) THEN
       MESSAGE(G$_NLS.Get('APAIDEN-0058', 'FORM', '*WARNING* Future "From" date will change to SYSDATE if updated.'));	   
       BELL;
   END IF;
ELSE
   set_item_property('APTADDR_SLCT_IND',updateable,property_off);
   IF NOT G$_QUERY_ONLY_ROLE THEN
      MESSAGE(G$_NLS.Get('APAIDEN-0059', 'FORM', '*WARNING* Multiple current/future addresses for this address type exist for this person. Update from household form is not allowed.'));
      BELL;
   END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_SLCT_IND.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="APTADDR_SLCT_IND", function=KeyFunction.ITEM_CHANGE)
		public void aptaddrSlctInd_itemChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				AptaddrAdapter aptaddrElement = (AptaddrAdapter)this.getFormModel().getAptaddr().getRowAdapter(true);


				if ( aptaddrElement.getAptaddrUpdatableInd().equals("Y") )
				{
					setItemUpdateAllowed("APTADDR_SLCT_IND", true);
					if ( trunc(isNull(aptaddrElement.getAptaddrFromDate(), NDate.getNow())).greater(trunc(NDate.getNow())) )
					{
						warningMessage(GNls.Fget(toStr("APAIDEN-0058"), toStr("FORM"), toStr("*WARNING* Future \"From\" date will change to SYSDATE if updated.")));
						// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
						//						SupportClasses.SQLFORMS.Bell();
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
						
						
					}
				}
				else {
					setItemUpdateAllowed("APTADDR_SLCT_IND", false);
					if ( getTask().getGoqrpls().gQueryOnlyRole().not() )
					{
						warningMessage(GNls.Fget(toStr("APAIDEN-0059"), toStr("FORM"), toStr("*WARNING* Multiple current/future addresses for this address type exist for this person. Update from household form is not allowed.")));
						// F2J_NOT_SUPPORTED : Call to built-in "BELL" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
						//						SupportClasses.SQLFORMS.Bell();
						this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'BELL' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
						
						
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER APTADDR_SLCT_IND.WHEN-CHECKBOX-CHANGED
		 IF :APTADDR.APTADDR_UPDATABLE_IND <> 'Y' THEN
	  IF :APTADDR_SLCT_IND = 'Y' AND NOT G$_QUERY_ONLY_ROLE THEN
	  	  -- Reset to N...change is not allowed for these records.
	  	  :APTADDR_SLCT_IND := 'N' ;
	  END IF;
END IF;	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_SLCT_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="APTADDR_SLCT_IND")
		public void aptaddrSlctInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				AptaddrAdapter aptaddrElement = (AptaddrAdapter)this.getFormModel().getAptaddr().getRowAdapter(true);


				if ( aptaddrElement.getAptaddrUpdatableInd().notEquals("Y") )
				{
					if ( aptaddrElement.getAptaddrSlctInd().equals("Y") && getTask().getGoqrpls().gQueryOnlyRole().not() )
					{
						//  Reset to N...change is not allowed for these records.
						aptaddrElement.setAptaddrSlctInd(toStr("N"));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * APTADDR_NAME_LF30.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="APTADDR_NAME_LF30", function=KeyFunction.NEXT_ITEM)
		public void aptaddrNameLf30_keyNexItem()
		{
			
			getGNameClass().nextItem();
		}

		
	
	
}

