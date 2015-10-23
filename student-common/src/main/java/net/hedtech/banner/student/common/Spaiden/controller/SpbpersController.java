package net.hedtech.banner.student.common.Spaiden.controller;
 
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
import net.hedtech.general.common.libraries.Goqclib.model.SpbpersAdapter;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.student.common.Spaiden.model.*;
import net.hedtech.banner.student.common.Spaiden.*;
import net.hedtech.banner.student.common.Spaiden.services.*;
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpbpersController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqclib.controller.SpbpersController getGoqclibSpbpersController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.SpbpersController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("SPBPERS");
	}	
	
	public SpbpersController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public SpaidenTask getTask() {
		return (SpaidenTask)super.getTask();
	}

	public SpaidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void spbpers_AfterQuery(RowAdapterEvent args)
		{
			

				SpbpersAdapter spbpersElement = (SpbpersAdapter)args.getRow();
				try
				{
					spbpersElement.setLockDbValues(true);
					try{
						this.spbpersBirthDate_PostChange();

					} catch (Exception ex) { }
					try{
						this.spbpersSsn_PostChange();

					} catch (Exception ex) { }
					try{
						this.spbpersCitzCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spbpersMrtlCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spbpersRelgCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spbpersLgcyCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spbpersEthnCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spbpersConfirmedReDate_PostChange();

					} catch (Exception ex) { }

				} finally { 
					spbpersElement.setLockDbValues(false);
				}
						getGoqclibSpbpersController().spbpers_AfterQuery(args);
		}
		
		@BeforeQuery
		public void spbpers_BeforeQuery(QueryEvent args) {
			getGoqclibSpbpersController().spbpers_BeforeQuery(args);
		}
		

		
		/*
		 *<p>
		 *This trigger makes sure that a null record is not inserted into the database
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void spbpers_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGoqclibSpbpersController().spbpers_BeforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void spbpers_RowInsert(RowAdapterEvent args)
		{
			
			getGoqclibSpbpersController().spbpers_RowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void spbpers_AfterRowInsert(RowAdapterEvent args)
		{
			
			getGoqclibSpbpersController().spbpers_AfterRowInsert(args);
		}

		
		/*
		 *<p>
		 *This trigger ensures that a null record is not added to the database.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void spbpers_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSpbpersController().spbpers_BeforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void spbpers_RowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSpbpersController().spbpers_RowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void spbpers_AfterRowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSpbpersController().spbpers_AfterRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void spbpers_BeforeRowDelete(RowAdapterEvent args)
		{
			
			getGoqclibSpbpersController().spbpers_BeforeRowDelete(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void spbpers_RowDelete(RowAdapterEvent args)
		{
			
			getGoqclibSpbpersController().spbpers_RowDelete(args);
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void spbpers_CreateRecord()
		{
			
			getGoqclibSpbpersController().spbpers_CreateRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void spbpers_Search()
		{
			
			getGoqclibSpbpersController().spbpers_Search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void spbpers_NextBlock()
		{
			
			getGoqclibSpbpersController().spbpers_NextBlock();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void spbpers_NextRecord()
		{
			
			getGoqclibSpbpersController().spbpers_NextRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void spbpers_KeyNxtset()
		{
			
			getGoqclibSpbpersController().spbpers_KeyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void spbpers_PreviousBlock()
		{
			
			getGoqclibSpbpersController().spbpers_PreviousBlock();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void spbpers_PreviousRecord()
		{
			
			getGoqclibSpbpersController().spbpers_PreviousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.CHECK_FOR_EMPLOYEE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_FOR_EMPLOYEE")
		public void spbpers_CheckForEmployee()
		{
			
			getGoqclibSpbpersController().spbpers_CheckForEmployee();
		}

		
		/* Original PL/SQL code code for TRIGGER SPBPERS.CHECK_DCSD_INFO
		 <multilinecomment> Forms that require edits between the deceased indicator and deceased dates can place their edits here </multilinecomment>
-- NULL;
IF :SPBPERS.SPBPERS_DEAD_IND IS NOT NULL AND
   :SPBPERS.SPBPERS_DEAD_DATE IS NULL THEN
  MESSAGE ( G$_NLS.Get('SPAIDEN-0021', 'FORM','*ERROR* Deceased Date must be entered when Deceased Indicator is checked.') );
  RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.CHECK_DCSD_INFO
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_DCSD_INFO")
		public void spbpers_CheckDcsdInfo()
		{
			
				//  Forms that require edits between the deceased indicator and deceased dates can place their edits here 
				//  NULL;

				SpbpersAdapter spbpersElement = (SpbpersAdapter)this.getFormModel().getSpbpers().getRowAdapter(true);

				if(spbpersElement!=null){

				//  Forms that require edits between the deceased indicator and deceased dates can place their edits here 
				//  NULL;
				if ( !spbpersElement.getSpbpersDeadInd().isNull() && spbpersElement.getSpbpersDeadDate().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SPAIDEN-0021"), toStr("FORM"), toStr("*ERROR* Deceased Date must be entered when Deceased Indicator is checked.")));
					throw new ApplicationException();
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.CHECK_ETHN_RACE_CONFIRMED_DATE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ETHN_RACE_CONFIRMED_DATE")
		public void spbpers_CheckEthnRaceConfirmedDate()
		{
			
			getGoqclibSpbpersController().spbpers_CheckEthnRaceConfirmedDate();
		}

		
		/* Original PL/SQL code code for TRIGGER SPBPERS.CHECK_MATERIALS
		 <multilinecomment> Placeholder for Student trigger </multilinecomment>
BEGIN
<multilinecomment>* 	NULL;       Override referenced trigger *</multilinecomment>
 IF (:SPBPERS.SPBPERS_SEX IS NOT NULL AND
      (:SPBPERS.SPBPERS_SEX <> :SPBPERS.HOLD_SEX OR
       :SPBPERS.HOLD_SEX IS NULL))
  OR (:SPBPERS.SPBPERS_ETHN_CODE IS NOT NULL AND
      (:SPBPERS.SPBPERS_ETHN_CODE <> :SPBPERS.HOLD_ETHN_CODE OR
       :SPBPERS.HOLD_ETHN_CODE IS NULL))
  OR (:SPBPERS.SPBPERS_LGCY_CODE IS NOT NULL AND
      (:SPBPERS.SPBPERS_LGCY_CODE <> :SPBPERS.HOLD_LGCY_CODE OR
       :SPBPERS.HOLD_LGCY_CODE IS NULL))
  OR (:SPBPERS.SPBPERS_CITZ_CODE IS NOT NULL AND
      (:SPBPERS.SPBPERS_CITZ_CODE <> :SPBPERS.HOLD_CITZ_CODE OR
       :SPBPERS.HOLD_CITZ_CODE IS NULL)) THEN
     SOKCPLN.P_CREATE_MATERIALS(:KEY_BLOCK.PIDM);
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.CHECK_MATERIALS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_MATERIALS")
		public void spbpers_CheckMaterials()
		{
			
				//  Placeholder for Student trigger 

				SpbpersAdapter spbpersElement = (SpbpersAdapter)this.getFormModel().getSpbpers().getRowAdapter(true);

				if(spbpersElement!=null){

				// * 	NULL;       Override referenced trigger *
				if ( (!spbpersElement.getSpbpersSex().isNull() && (spbpersElement.getSpbpersSex().notEquals(spbpersElement.getHoldSex()) || spbpersElement.getHoldSex().isNull())) || (!spbpersElement.getSpbpersEthnCode().isNull() && (spbpersElement.getSpbpersEthnCode().notEquals(spbpersElement.getHoldEthnCode()) || spbpersElement.getHoldEthnCode().isNull())) || (!spbpersElement.getSpbpersLgcyCode().isNull() && (spbpersElement.getSpbpersLgcyCode().notEquals(spbpersElement.getHoldLgcyCode()) || spbpersElement.getHoldLgcyCode().isNull())) || (!spbpersElement.getSpbpersCitzCode().isNull() && (spbpersElement.getSpbpersCitzCode().notEquals(spbpersElement.getHoldCitzCode()) || spbpersElement.getHoldCitzCode().isNull())) )
				{
					Sokcpln.pCreateMaterials(getFormModel().getKeyBlock().getPidm());
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.CHECK_SSN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_SSN")
		public void spbpers_CheckSsn()
		{
			
			getGoqclibSpbpersController().spbpers_CheckSsn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.CONVERT_ETHN_CODE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CONVERT_ETHN_CODE")
		public void spbpers_ConvertEthnCode()
		{
			
			getGoqclibSpbpersController().spbpers_ConvertEthnCode();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.EDIT_COBRA_ELIGIBILITY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="EDIT_COBRA_ELIGIBILITY")
		public void spbpers_EditCobraEligibility()
		{
			
			getGoqclibSpbpersController().spbpers_EditCobraEligibility();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.EDIT_BIRTH_DATE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="EDIT_BIRTH_DATE")
		public void spbpers_EditBirthDate()
		{
			
			getGoqclibSpbpersController().spbpers_EditBirthDate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.EDIT_PERS_AGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="EDIT_PERS_AGE")
		public void spbpers_EditPersAge()
		{
			
			getGoqclibSpbpersController().spbpers_EditPersAge();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS.EDIT_PERS_GENDER
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="EDIT_PERS_GENDER")
		public void spbpers_EditPersGender()
		{
			
			getGoqclibSpbpersController().spbpers_EditPersGender();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_SEX.WHEN-RADIO-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-RADIO-CHANGED", item="PERS_SEX")
		public void persSex_radioGroupChange()
		{
			
			getGoqclibSpbpersController().persSex_radioGroupChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_BIRTH_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPBPERS_BIRTH_DATE", function=KeyFunction.NEXT_ITEM)
		public void spbpersBirthDate_keyNexItem()
		{
			
			getGoqclibSpbpersController().spbpersBirthDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_BIRTH_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_BIRTH_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spbpersBirthDate_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersBirthDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_BIRTH_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPBPERS_BIRTH_DATE", function=KeyFunction.ITEM_OUT)
		public void spbpersBirthDate_itemOut()
		{
			
			getGoqclibSpbpersController().spbpersBirthDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_BIRTH_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPBPERS_BIRTH_DATE")
		public void spbpersBirthDate_PostChange()
		{
			
			getGoqclibSpbpersController().spbpersBirthDate_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_BIRTH_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPBPERS_BIRTH_DATE")
		public void spbpersBirthDate_validate()
		{
			
			this.spbpersBirthDate_PostChange();

			getGoqclibSpbpersController().spbpersBirthDate_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_BIRTH_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPBPERS_BIRTH_DATE_DBT")
		@Before
		public void spbpersBirthDateDbt_click()
		{
			
			getGoqclibSpbpersController().spbpersBirthDateDbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_BIRTH_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPBPERS_BIRTH_DATE_DBT")
		public void spbpersBirthDateDbt_buttonClick()
		{
			
			getGoqclibSpbpersController().spbpersBirthDateDbt_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_SSN.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPBPERS_SSN")
		public void spbpersSsn_PostChange()
		{
			
			getGoqclibSpbpersController().spbpersSsn_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_SSN.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_SSN", function=KeyFunction.ITEM_CHANGE)
		public void spbpersSsn_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersSsn_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_DEAD_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="SPBPERS_DEAD_IND")
		public void spbpersDeadInd_checkBoxChange()
		{
			
			getGoqclibSpbpersController().spbpersDeadInd_checkBoxChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_DEAD_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_DEAD_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spbpersDeadDate_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersDeadDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_DEAD_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPBPERS_DEAD_DATE", function=KeyFunction.ITEM_OUT)
		public void spbpersDeadDate_itemOut()
		{
			
			getGoqclibSpbpersController().spbpersDeadDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_DEAD_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPBPERS_DEAD_DATE")
		public void spbpersDeadDate_validate()
		{
			
			getGoqclibSpbpersController().spbpersDeadDate_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_DEAD_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPBPERS_DEAD_DATE", function=KeyFunction.NEXT_ITEM)
		public void spbpersDeadDate_keyNexItem()
		{
			
			getGoqclibSpbpersController().spbpersDeadDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_DEAD_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPBPERS_DEAD_DATE_DBT")
		@Before
		public void spbpersDeadDateDbt_click()
		{
			
			getGoqclibSpbpersController().spbpersDeadDateDbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_DEAD_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPBPERS_DEAD_DATE_DBT")
		public void spbpersDeadDateDbt_buttonClick()
		{
			
			getGoqclibSpbpersController().spbpersDeadDateDbt_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CITZ_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPBPERS_CITZ_CODE")
		public void spbpersCitzCode_doubleClick()
		{
			
			getGoqclibSpbpersController().spbpersCitzCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CITZ_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_CITZ_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spbpersCitzCode_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersCitzCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CITZ_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPBPERS_CITZ_CODE")
		public void spbpersCitzCode_GSearchParameters()
		{
			
			getGoqclibSpbpersController().spbpersCitzCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CITZ_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPBPERS_CITZ_CODE")
		public void spbpersCitzCode_GSearchOptions()
		{
			
			getGoqclibSpbpersController().spbpersCitzCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CITZ_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPBPERS_CITZ_CODE", function=KeyFunction.NEXT_ITEM)
		public void spbpersCitzCode_keyNexItem()
		{
			
			getGoqclibSpbpersController().spbpersCitzCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CITZ_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPBPERS_CITZ_CODE", function=KeyFunction.ITEM_OUT)
		public void spbpersCitzCode_itemOut()
		{
			
			getGoqclibSpbpersController().spbpersCitzCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CITZ_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPBPERS_CITZ_CODE")
		public void spbpersCitzCode_PostChange()
		{
			
			getGoqclibSpbpersController().spbpersCitzCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CITZ_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPBPERS_CITZ_CODE")
		public void spbpersCitzCode_validate()
		{
			
//			this.spbpersCitzCode_PostChange();

			getGoqclibSpbpersController().spbpersCitzCode_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CITZ_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPBPERS_CITZ_CODE_LBT")
		@Before
		public void spbpersCitzCodeLbt_click()
		{
			
			getGoqclibSpbpersController().spbpersCitzCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CITZ_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CITZ_DESC", function=KeyFunction.ITEM_CHANGE)
		public void citzDesc_itemChange()
		{
			
			getGoqclibSpbpersController().citzDesc_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_MRTL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPBPERS_MRTL_CODE")
		public void spbpersMrtlCode_doubleClick()
		{
			
			getGoqclibSpbpersController().spbpersMrtlCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_MRTL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_MRTL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spbpersMrtlCode_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersMrtlCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_MRTL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPBPERS_MRTL_CODE")
		public void spbpersMrtlCode_GSearchParameters()
		{
			
			getGoqclibSpbpersController().spbpersMrtlCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_MRTL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPBPERS_MRTL_CODE")
		public void spbpersMrtlCode_GSearchOptions()
		{
			
			getGoqclibSpbpersController().spbpersMrtlCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_MRTL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPBPERS_MRTL_CODE", function=KeyFunction.NEXT_ITEM)
		public void spbpersMrtlCode_keyNexItem()
		{
			
			getGoqclibSpbpersController().spbpersMrtlCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_MRTL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPBPERS_MRTL_CODE", function=KeyFunction.ITEM_OUT)
		public void spbpersMrtlCode_itemOut()
		{
			
			getGoqclibSpbpersController().spbpersMrtlCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_MRTL_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPBPERS_MRTL_CODE")
		public void spbpersMrtlCode_PostChange()
		{
			
			getGoqclibSpbpersController().spbpersMrtlCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_MRTL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPBPERS_MRTL_CODE")
		public void spbpersMrtlCode_validate()
		{
			
//			this.spbpersMrtlCode_PostChange();

			getGoqclibSpbpersController().spbpersMrtlCode_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_MRTL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPBPERS_MRTL_CODE_LBT")
		@Before
		public void spbpersMrtlCodeLbt_click()
		{
			
			getGoqclibSpbpersController().spbpersMrtlCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MRTL_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="MRTL_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void mrtlDescription_itemChange()
		{
			
			getGoqclibSpbpersController().mrtlDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_RELG_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPBPERS_RELG_CODE")
		public void spbpersRelgCode_doubleClick()
		{
			
			getGoqclibSpbpersController().spbpersRelgCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_RELG_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_RELG_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spbpersRelgCode_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersRelgCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_RELG_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPBPERS_RELG_CODE")
		public void spbpersRelgCode_GSearchParameters()
		{
			
			getGoqclibSpbpersController().spbpersRelgCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_RELG_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPBPERS_RELG_CODE")
		public void spbpersRelgCode_GSearchOptions()
		{
			
			getGoqclibSpbpersController().spbpersRelgCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_RELG_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPBPERS_RELG_CODE", function=KeyFunction.NEXT_ITEM)
		public void spbpersRelgCode_keyNexItem()
		{
			
			getGoqclibSpbpersController().spbpersRelgCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_RELG_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPBPERS_RELG_CODE", function=KeyFunction.ITEM_OUT)
		public void spbpersRelgCode_itemOut()
		{
			
			getGoqclibSpbpersController().spbpersRelgCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_RELG_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPBPERS_RELG_CODE")
		public void spbpersRelgCode_PostChange()
		{
			
			getGoqclibSpbpersController().spbpersRelgCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_RELG_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPBPERS_RELG_CODE")
		public void spbpersRelgCode_validate()
		{
			
			this.spbpersRelgCode_PostChange();

			getGoqclibSpbpersController().spbpersRelgCode_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_RELG_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPBPERS_RELG_CODE_LBT")
		@Before
		public void spbpersRelgCodeLbt_click()
		{
			
			getGoqclibSpbpersController().spbpersRelgCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RELG_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="RELG_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void relgDescription_itemChange()
		{
			
			getGoqclibSpbpersController().relgDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_LGCY_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPBPERS_LGCY_CODE")
		public void spbpersLgcyCode_doubleClick()
		{
			
			getGoqclibSpbpersController().spbpersLgcyCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_LGCY_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_LGCY_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spbpersLgcyCode_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersLgcyCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_LGCY_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPBPERS_LGCY_CODE")
		public void spbpersLgcyCode_GSearchParameters()
		{
			
			getGoqclibSpbpersController().spbpersLgcyCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_LGCY_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPBPERS_LGCY_CODE")
		public void spbpersLgcyCode_GSearchOptions()
		{
			
			getGoqclibSpbpersController().spbpersLgcyCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_LGCY_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPBPERS_LGCY_CODE", function=KeyFunction.NEXT_ITEM)
		public void spbpersLgcyCode_keyNexItem()
		{
			
			getGoqclibSpbpersController().spbpersLgcyCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_LGCY_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPBPERS_LGCY_CODE", function=KeyFunction.ITEM_OUT)
		public void spbpersLgcyCode_itemOut()
		{
			
			getGoqclibSpbpersController().spbpersLgcyCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_LGCY_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPBPERS_LGCY_CODE")
		public void spbpersLgcyCode_PostChange()
		{
			
			getGoqclibSpbpersController().spbpersLgcyCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_LGCY_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPBPERS_LGCY_CODE")
		public void spbpersLgcyCode_validate()
		{
			
			this.spbpersLgcyCode_PostChange();

			getGoqclibSpbpersController().spbpersLgcyCode_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_LGCY_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPBPERS_LGCY_CODE_LBT")
		@Before
		public void spbpersLgcyCodeLbt_click()
		{
			
			getGoqclibSpbpersController().spbpersLgcyCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LGCY_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="LGCY_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void lgcyDescription_itemChange()
		{
			
			getGoqclibSpbpersController().lgcyDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ETHN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPBPERS_ETHN_CODE")
		public void spbpersEthnCode_doubleClick()
		{
			
			getGoqclibSpbpersController().spbpersEthnCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ETHN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_ETHN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spbpersEthnCode_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersEthnCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ETHN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPBPERS_ETHN_CODE")
		public void spbpersEthnCode_GSearchParameters()
		{
			
			getGoqclibSpbpersController().spbpersEthnCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ETHN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPBPERS_ETHN_CODE")
		public void spbpersEthnCode_GSearchOptions()
		{
			
			getGoqclibSpbpersController().spbpersEthnCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ETHN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPBPERS_ETHN_CODE", function=KeyFunction.NEXT_ITEM)
		public void spbpersEthnCode_keyNexItem()
		{
			
			getGoqclibSpbpersController().spbpersEthnCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ETHN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPBPERS_ETHN_CODE", function=KeyFunction.ITEM_OUT)
		public void spbpersEthnCode_itemOut()
		{
			
			getGoqclibSpbpersController().spbpersEthnCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ETHN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPBPERS_ETHN_CODE")
		public void spbpersEthnCode_PostChange()
		{
			
			getGoqclibSpbpersController().spbpersEthnCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ETHN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPBPERS_ETHN_CODE")
		public void spbpersEthnCode_validate()
		{
			
			this.spbpersEthnCode_PostChange();

			getGoqclibSpbpersController().spbpersEthnCode_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ETHN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPBPERS_ETHN_CODE_LBT")
		@Before
		public void spbpersEthnCodeLbt_click()
		{
			
			getGoqclibSpbpersController().spbpersEthnCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ETHN_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ETHN_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void ethnDescription_itemChange()
		{
			
			getGoqclibSpbpersController().ethnDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CONFIRMED_RE_CDE.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="SPBPERS_CONFIRMED_RE_CDE")
		public void spbpersConfirmedReCde_checkBoxChange()
		{
			
			getGoqclibSpbpersController().spbpersConfirmedReCde_checkBoxChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CONFIRMED_RE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPBPERS_CONFIRMED_RE_DATE", function=KeyFunction.NEXT_ITEM)
		public void spbpersConfirmedReDate_keyNexItem()
		{
			
			getGoqclibSpbpersController().spbpersConfirmedReDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CONFIRMED_RE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_CONFIRMED_RE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spbpersConfirmedReDate_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersConfirmedReDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CONFIRMED_RE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPBPERS_CONFIRMED_RE_DATE", function=KeyFunction.ITEM_OUT)
		public void spbpersConfirmedReDate_itemOut()
		{
			
			getGoqclibSpbpersController().spbpersConfirmedReDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CONFIRMED_RE_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPBPERS_CONFIRMED_RE_DATE")
		public void spbpersConfirmedReDate_PostChange()
		{
			
			getGoqclibSpbpersController().spbpersConfirmedReDate_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CONFIRMED_RE_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPBPERS_CONFIRMED_RE_DATE_DBT")
		@Before
		public void spbpersConfirmedReDateDbt_click()
		{
			
			getGoqclibSpbpersController().spbpersConfirmedReDateDbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CONFIRMED_RE_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPBPERS_CONFIRMED_RE_DATE_DBT")
		public void spbpersConfirmedReDateDbt_buttonClick()
		{
			
			getGoqclibSpbpersController().spbpersConfirmedReDateDbt_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ACTIVE_DUTY_SEPR_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_ACTIVE_DUTY_SEPR_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spbpersActiveDutySeprDate_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersActiveDutySeprDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ACTIVE_DUTY_SEPR_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPBPERS_ACTIVE_DUTY_SEPR_DATE", function=KeyFunction.ITEM_OUT)
		public void spbpersActiveDutySeprDate_itemOut()
		{
			
			getGoqclibSpbpersController().spbpersActiveDutySeprDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ACTIVE_DUTY_SEPR_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPBPERS_ACTIVE_DUTY_SEPR_DATE")
		public void spbpersActiveDutySeprDate_validate()
		{
			
			getGoqclibSpbpersController().spbpersActiveDutySeprDate_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ACTIVE_DUTY_SEPR_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPBPERS_ACTIVE_DUTY_SEPR_DATE", function=KeyFunction.NEXT_ITEM)
		public void spbpersActiveDutySeprDate_keyNexItem()
		{
			
			getGoqclibSpbpersController().spbpersActiveDutySeprDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_ACTIVE_DUTY_SEPR_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PERS_ACTIVE_DUTY_SEPR_DATE_DBT")
		@Before
		public void persActiveDutySeprDateDbt_click()
		{
			
			getGoqclibSpbpersController().persActiveDutySeprDateDbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_ACTIVE_DUTY_SEPR_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PERS_ACTIVE_DUTY_SEPR_DATE_DBT")
		public void persActiveDutySeprDateDbt_buttonClick()
		{
			
			getGoqclibSpbpersController().persActiveDutySeprDateDbt_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPBPERS_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void spbpersActivityDate_keyNexItem()
		{
			
			getGoqclibSpbpersController().spbpersActivityDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPBPERS_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spbpersActivityDate_itemChange()
		{
			
			getGoqclibSpbpersController().spbpersActivityDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPBPERS_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void spbpersActivityDate_itemOut()
		{
			
			getGoqclibSpbpersController().spbpersActivityDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_SSN.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPBPERS_SSN")
		public void spbpersSsn_validate()
		{
			

			SpbpersAdapter spbpersElement = (SpbpersAdapter)this.getFormModel().getSpbpers().getRowAdapter(true);
			this.spbpersSsn_PostChange();

		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPBPERS_CONFIRMED_RE_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPBPERS_CONFIRMED_RE_DATE")
		public void spbpersConfirmedReDate_validate()
		{
			

			SpbpersAdapter spbpersElement = (SpbpersAdapter)this.getFormModel().getSpbpers().getRowAdapter(true);
			this.spbpersConfirmedReDate_PostChange();

		}

		
	
	
}

