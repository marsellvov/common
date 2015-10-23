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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.student.common.Spaiden.model.*;
import net.hedtech.banner.student.common.Spaiden.*;
import net.hedtech.banner.student.common.Spaiden.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
		
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class KeyBlockController extends DefaultBlockController {

	private GKeyBlockClass getGKeyBlockClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_KEY_BLOCK_CLASS");
	}	
	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ID_CLASS");
	}	
	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	

	
	public KeyBlockController(IFormController parentController, String name) 
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
		 * KEY_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void keyBlock_Save()
		{
			
			getGKeyBlockClass().save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void keyBlock_MoveUp()
		{
			
			getGKeyBlockClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void keyBlock_MoveDown()
		{
			
			getGKeyBlockClass().moveDown();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void keyBlock_CreateRecord()
		{
			
			getGKeyBlockClass().createRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void keyBlock_DeleteRecord()
		{
			
			getGKeyBlockClass().deleteRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void keyBlock_Search()
		{
			
			getGKeyBlockClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void keyBlock_ExecuteQuery()
		{
			
			getGKeyBlockClass().executeQuery();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void keyBlock_NextRecord()
		{
			
			getGKeyBlockClass().nextRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void keyBlock_KeyNxtset()
		{
			
			getGKeyBlockClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *This trigger checks if a valid PIDM exists.  If it does, perform previous
		 *block and execute query.  If not, display error message.
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
			
			getGKeyBlockClass().previousBlock();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void keyBlock_PreviousRecord()
		{
			
			getGKeyBlockClass().previousRecord();
		}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK
		 NEXT_BLOCK;
		*/
		/*
		 *<p>
		 *This trigger will check if an id number or 'GENERATED' was entered.  If it
		 *was, then advance to next block. If not, display error message.
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
			
				nextBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.POST-BLOCK
		 :CHECK_KEYS := 'Y';
:GLOBAL.VALUE := '';
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
		@After
		public void keyBlock_blockOut()
		{
			
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("Y"));
				setGlobal("VALUE", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.SET_MRTL_ITEMS
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.SET_MRTL_ITEMS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_MRTL_ITEMS")
		public void keyBlock_SetMrtlItems()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="ID", function=KeyFunction.ITEM_IN)
		public void id_itemIn()
		{
			
			getGIdClass().itemIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ID", function=KeyFunction.NEXT_ITEM)
		public void id_keyNexItem()
		{
			
			getGIdClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="ID")
		public void id_PostChange()
		{
			
			getGIdClass().postChange();
		}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-CQUERY
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SOACOMP','QUERY');
--
IF :GLOBAL.VALUE IS NOT NULL  THEN
  EXECUTE_TRIGGER( 'LIST_VALUES_COPY' );
  G$_CHECK_FAILURE;
  NEXT_FIELD;
END IF;
--
:CHECK_KEYS:='N';
G$_CHECK_FAILURE; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ID", function=KeyFunction.COUNT_QUERY)
		public void id_TotalResults()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOACOMP"), toStr("QUERY"));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
				// 
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-LISTVAL
		 G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'SOAIDEN','QUERY');
G$_RESET_GLOBAL;
--
IF :GLOBAL.VALUE IS NOT NULL  THEN
  EXECUTE_TRIGGER( 'LIST_VALUES_COPY' );
  G$_CHECK_FAILURE;
--
<multilinecomment> MW 08/06/2001 Added the following line of code to fix defect 49622. </multilinecomment>
  :GLOBAL.KEY_IDNO := '';
--
  NEXT_FIELD;
END IF;
--
:CHECK_KEYS:='N';
G$_CHECK_FAILURE; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="ID", function=KeyFunction.LIST_VALUES)
		public void id_ListValues()
		{
			
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOAIDEN"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					// 
					//  MW 08/06/2001 Added the following line of code to fix defect 49622. 
					setGlobal("KEY_IDNO", toStr(""));
					// 
					nextItem();
				}
				// 
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.WHEN-VALIDATE-ITEM
		 EXECUTE_TRIGGER('VALIDATE_ID');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ID")
		public void id_validate()
		{
			
//			this.id_PostChange();

				executeAction("VALIDATE_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUPREC
		 -- 54-1 Created to call third new GUIALTI form
--      from Option List Window
:GLOBAL.VALUE := '';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'GUIALTI','QUERY');
--
IF :GLOBAL.VALUE IS NOT NULL THEN
  EXECUTE_TRIGGER('LIST_VALUES_COPY');
  G$_CHECK_FAILURE;
  <multilinecomment> EM 12/14/2001 Added the following line of code to fix defect  1-33V7FR. </multilinecomment>
  :GLOBAL.KEY_IDNO := '';
  NEXT_FIELD;
END IF;
--
:CHECK_KEYS:='N';
G$_CHECK_FAILURE; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", item="ID", function=KeyFunction.DUPLICATE_RECORD)
		public void id_CopyRecord()
		{
			
				//  54-1 Created to call third new GUIALTI form
				//       from Option List Window
				//  54-1 Created to call third new GUIALTI form
				//       from Option List Window
				setGlobal("VALUE", toStr(""));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GUIALTI"), toStr("QUERY"));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					//  EM 12/14/2001 Added the following line of code to fix defect  1-33V7FR. 
					setGlobal("KEY_IDNO", toStr(""));
					nextItem();
				}
				// 
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.VALIDATE_ID
		 DECLARE
  lv_cm_status   VARCHAR2(4) := NULL;
BEGIN
	-- Clear ID fields
  :FULL_NAME := '';
  :CONFID_IND := '';
  :DCSD_IND := '';
  :ENTITY_IND := '';
  --
  IF :ID IS NULL THEN
    RETURN;
  END IF;
  --
--  IF :ID = 'NEXT' THEN
--    MESSAGE( G$_NLS.Get('SPAIDEN-0009', 'FORM','*ERROR* NEXT is not valid for this form.'));
--    RAISE FORM_TRIGGER_FAILURE;
--  END IF;
  --
  IF (:ID = 'GENERATED') THEN
    lv_cm_status := G$_INVOKE_CM;
    if lv_cm_status = 'NULL' then
    	MESSAGE( G$_NLS.Get('SPAIDEN-0008', 'FORM', 
    	  '*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and user %01% is set up to run Common Matching',USER));
    	raise form_trigger_failure;
    elsif lv_cm_status = 'SKIP' then
    	RETURN;
    end if;
--  RETURN;
--  END IF;
--
  ELSIF (NAME_IN('GLOBAL.SSN_SEARCH_ENABLED_IND') = 'Y' AND 
  	  G$_CHK_AUTH.G$_CHECK_AUTHORIZATION_FNC('SSN_SEARCH',USER) = 'YES') AND
  	  G$_VERIFY_ID_AS_SSN(:ID) THEN
-- -- ID is found as an SSN and want to fall thru to ID exists and execute G$_VALID_ALL_ID
    NULL;
--
  ELSIF ((gokfgac.f_spriden_pii_active = 'N') AND (GB_COMMON.F_ID_EXISTS(:ID) = 'N'))
  OR (gokfgac.f_spriden_pii_active = 'Y' AND NOT G$_VERIFY_ID_EXISTS(:ID)) THEN
    IF NAME_IN('GLOBAL.SSN_SEARCH_ENABLED_IND') = 'Y' AND
    	 gokfgac.f_spriden_pii_active = 'Y'             AND
    	 gokfgac.f_is_user_exempt = 'N'                 AND
    	 G$_VERIFY_SSN_EXISTS(:ID)                      THEN
      MESSAGE(G$_NLS.Get('SPAIDEN-0009','FORM','*ERROR* You do not have permission to view this ID.'));
      RAISE FORM_TRIGGER_FAILURE;
    ELSE	
      lv_cm_status := G$_INVOKE_CM;
      IF lv_cm_status = 'NULL' then
        MESSAGE( G$_NLS.Get('SPAIDEN-0010', 'FORM', 
    	  '*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and user %01% is set up to run Common Matching',USER));
        RAISE form_trigger_failure;
      ELSIF lv_cm_status = 'SKIP' then
    	  RETURN;
      END IF;
    END IF;
  END IF;	
  
  -- ID exists.  
  G$_VALID_ALL_ID(:ID, :PIDM, :FULL_NAME, :CONFID_IND, :DCSD_IND);
  G$_CHECK_FAILURE; 
  :ENTITY_IND := gb_identification.f_get_entity(:pidm);
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.VALIDATE_ID
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="VALIDATE_ID", item="ID")
		public void id_ValidateId()
		{
			
				{
					NString lvCmStatus = NString.getNull();
					//  Clear ID fields
					getFormModel().getKeyBlock().setFullName(toStr(""));
					getFormModel().getKeyBlock().setConfidInd(toStr(""));
					getFormModel().getKeyBlock().setDcsdInd(toStr(""));
					getFormModel().getKeyBlock().setEntityInd(toStr(""));
					// 
					if ( getFormModel().getKeyBlock().getId().isNull() )
					{
						return ;
					}
					// 
					//   IF :ID = 'NEXT' THEN
					//     MESSAGE( G$_NLS.Get('SPAIDEN-0009', 'FORM','*ERROR* NEXT is not valid for this form.'));
					//     RAISE FORM_TRIGGER_FAILURE;
					//   END IF;
					// 
					if ((getFormModel().getKeyBlock().getId().equals("GENERATED")))
					{
						lvCmStatus = getTask().getGoqrpls().gInvokeCm();
						if ( lvCmStatus.equals("NULL") )
						{
							errorMessage(GNls.Fget(toStr("SPAIDEN-0008"), toStr("FORM"), toStr("*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and user %01% is set up to run Common Matching"), getUser()));
							throw new ApplicationException();
						}
						else if ( lvCmStatus.equals("SKIP") ) {
							return ;
						}
					}
					else if ( (getNameIn("GLOBAL.SSN_SEARCH_ENABLED_IND").equals("Y") && GChkAuth.gCheckAuthorizationFnc(toStr("SSN_SEARCH"), getUser()).equals("YES")) && getTask().getGoqrpls().gVerifyIdAsSsn(getFormModel().getKeyBlock().getId()).getValue() ) {
						//  -- ID is found as an SSN and want to fall thru to ID exists and execute G$_VALID_ALL_ID
					}
					else if ( ((Gokfgac.fSpridenPiiActive().equals("N")) && (GbCommon.fIdExists(getFormModel().getKeyBlock().getId()).equals("N"))) || (Gokfgac.fSpridenPiiActive().equals("Y") && getTask().getGoqrpls().gVerifyIdExists(getFormModel().getKeyBlock().getId()).not()) ) {
						if ( getNameIn("GLOBAL.SSN_SEARCH_ENABLED_IND").equals("Y") && Gokfgac.fSpridenPiiActive().equals("Y") && Gokfgac.fIsUserExempt().equals("N") && getTask().getGoqrpls().gVerifySsnExists(getFormModel().getKeyBlock().getId()).getValue() )
						{
							errorMessage(GNls.Fget(toStr("SPAIDEN-0009"), toStr("FORM"), toStr("*ERROR* You do not have permission to view this ID.")));
							throw new ApplicationException();
						}
						else {
							lvCmStatus = getTask().getGoqrpls().gInvokeCm();
							if ( lvCmStatus.equals("NULL") )
							{
								errorMessage(GNls.Fget(toStr("SPAIDEN-0010"), toStr("FORM"), toStr("*ERROR* New ID must be created on GOAMTCH since Common Matching is enabled and user %01% is set up to run Common Matching"), getUser()));
								throw new ApplicationException();
							}
							else if ( lvCmStatus.equals("SKIP") ) {
								return ;
							}
						}
					}
					//  ID exists.  
					Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
					Ref<NNumber> pPidm_ref = new Ref<NNumber>(getFormModel().getKeyBlock().getPidm());
					Ref<NString> pFullName_ref = new Ref<NString>(getFormModel().getKeyBlock().getFullName());
					Ref<NString> pConfidInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getConfidInd());
					Ref<NString> pDcsdInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getDcsdInd());
					getTask().getGoqrpls().gValidAllId(pId_ref, pPidm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref);
					getFormModel().getKeyBlock().setId(pId_ref.val);
					getFormModel().getKeyBlock().setPidm(pPidm_ref.val);
					getFormModel().getKeyBlock().setFullName(pFullName_ref.val);
					getFormModel().getKeyBlock().setConfidInd(pConfidInd_ref.val);
					getFormModel().getKeyBlock().setDcsdInd(pDcsdInd_ref.val);
					getTask().getGoqrpls().gCheckFailure();
					getFormModel().getKeyBlock().setEntityInd(GbIdentification.fGetEntity(getFormModel().getKeyBlock().getPidm()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FULL_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FULL_NAME", function=KeyFunction.NEXT_ITEM)
		public void fullName_keyNexItem()
		{
			
			getGNameClass().nextItem();
		}

		
		/* Original PL/SQL code code for TRIGGER FULL_NAME.KEY-DUP-ITEM
		 null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FULL_NAME.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", item="FULL_NAME", function=KeyFunction.DUPLICATE_ITEM)
		public void fullName_KeyDupItem()
		{
			
			}

		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GENERATE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GENERATE_BTN")
		@Before
		public void generateBtn_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER GENERATE_BTN.WHEN-BUTTON-PRESSED
		 go_item('KEY_BLOCK.ID');
DO_KEY ('DUPLICATE_ITEM');


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GENERATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GENERATE_BTN")
		public void generateBtn_buttonClick()
		{
			
				goItem(toStr("KEY_BLOCK.ID"));
				// MORPHIS TODO GEN
				//				SupportClasses.SQLFORMS.DoKey("DUPLICATE_ITEM");
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SPAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				executeAction("DUPLICATE_ITEM");
				
			}
	
	
}

