package net.hedtech.mesc.common.banner.payroll.Pyabene.controller;
 
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
import net.hedtech.general.common.libraries.Noqjpls.*;
import net.hedtech.general.common.libraries.Poqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.mesc.common.banner.payroll.Pyabene.model.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.*;
import net.hedtech.mesc.common.banner.payroll.Pyabene.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
		
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

	
	public KeyBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public PyabeneTask getTask() {
		return (PyabeneTask)super.getTask();
	}

	public PyabeneModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
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
		public void keyBlock_blockOut()
		{
			
			getGKeyBlockClass().blockOut();
		}

		
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
		    NEXT_BLOCK ;

		*/
		/*
		 *<p>
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

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.CHECK_KEYS
		    G$_CHECK_VALUE ((:KEY_BLOCK.PIDM IS NULL),
       G$_NLS.Get('PYABENE-0030', 'FORM','*ERROR* A valid ID must be entered for this function.') ,
         TRUE, TRUE);
   N$_CHECK_PIDM(:PIDM);
   G$_CHECK_FAILURE;
--
   P$_DO_SECURITY (:PIDM,'') ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.CHECK_KEYS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_KEYS")
		public void keyBlock_CheckKeys()
		{
			
				getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getPidm().isNull())), GNls.Fget(toStr("PYABENE-0030"), toStr("FORM"), toStr("*ERROR* A valid ID must be entered for this function.")), toBool(NBool.True), toBool(NBool.True));
				getTask().getNoqjpls().nCheckPidm(getFormModel().getKeyBlock().getPidm());
				getTask().getGoqrpls().gCheckFailure();
				// 
				getTask().getPoqrpls().pDoSecurity(getFormModel().getKeyBlock().getPidm(), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
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
		 * ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ID", function=KeyFunction.COUNT_QUERY)
		public void id_TotalResults()
		{
			
			getGIdClass().totalResults();
		}

		
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
			
			this.id_PostChange();

			getGIdClass().validate();
		}

		
		/* Original PL/SQL code code for TRIGGER ID.POST-CHANGE
		 -- 70-0159. Validate person ID
DECLARE
    lv_confid_ind VARCHAR2(30) := NULL;
    lv_dcsd_ind VARCHAR2(30) := NULL;
BEGIN  
    G$_VALID_ID(:KEY_BLOCK.ID, :KEY_BLOCK.PIDM, :KEY_BLOCK.NAME, lv_confid_ind, lv_dcsd_ind, 'NNNY');
    G$_CHECK_FAILURE;
END; 

DECLARE
   CURSOR PTI_CURSOR  IS
    SELECT DECODE(PEBEMPL_EMPL_STATUS, 'A', 'Active',
                                       'B', 'Leave w/o Pay, w/Ben',
                                       'L', 'Leave w/o Pay, w/o Ben',
                                       'F', 'Leave w/Pay, w/Ben',
                                       'P', 'Leave w/Part.Pay, w/Ben',
                                       'T', 'Terminated'),PEBEMPL_BCAT_CODE
    FROM PEBEMPL
    WHERE PEBEMPL_PIDM = :KEY_BLOCK.PIDM;
 BEGIN
    OPEN PTI_CURSOR;
    FETCH PTI_CURSOR INTO :EMST_RULE, :BCAT_CODE ;
 G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('PYABENE-0031', 'FORM','*ERROR* Person is not an employee, see PEAEMPL form') , TRUE);
   END ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT PTRBCAT_DESC
         FROM   PTRBCAT
         WHERE  PTRBCAT_CODE = :KEY_BLOCK.BCAT_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :BCAT_DESC ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('PYABENE-0032', 'FORM','*ERROR* Benefit Category code.') , TRUE);
   END ;
--
   IF :GLOBAL.FORM_WAS_CALLED = 'Y' THEN
      GOTO BYPASS_TERMINATED_WARNING ;
   END IF ;
--
<multilinecomment>
   IF :EMST_RULE = 'T' THEN
      MESSAGE('*WARNING* EMPLOYEE HAS BEEN TERMINATED, NO UPDATES WILL BE POSSIBLE.');
   END IF ;
</multilinecomment>
--
   << BYPASS_TERMINATED_WARNING >>
   NULL ;

		*/
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
			
			KeyBlock keyBlockElement = this.getFormModel().getKeyBlock();
			
				//  70-0159. Validate person ID
				int rowCount = 0;
				if(keyBlockElement.getId().isNull())
		return;
				{
					NString lvConfidInd = NString.getNull();
					NString lvDcsdInd = NString.getNull();
					Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
					Ref<NNumber> pPIdm_ref = new Ref<NNumber>(getFormModel().getKeyBlock().getPidm());
					Ref<NString> pFullName_ref = new Ref<NString>(toStr(getFormModel().getKeyBlock().getnName()));
							//getnName());
					Ref<NString> pConfidInd_ref = new Ref<NString>(lvConfidInd);
					Ref<NString> pDcsdInd_ref = new Ref<NString>(lvDcsdInd);
					getTask().getGoqrpls().gValidId(pId_ref, pPIdm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref, toStr("NNNY"));
					getFormModel().getKeyBlock().setId(pId_ref.val);
					getFormModel().getKeyBlock().setPidm(pPIdm_ref.val);
					getFormModel().getKeyBlock().setnName(pFullName_ref.val);
					
					//getFormModel().getKeyBlock().setnName(pFullName_ref.val);
					lvConfidInd = pConfidInd_ref.val;
					lvDcsdInd = pDcsdInd_ref.val;
					getTask().getGoqrpls().gCheckFailure();
				}
				{
					String sqlptiCursor = "SELECT DECODE(PEBEMPL_EMPL_STATUS, 'A', 'Active', 'B', 'Leave w/o Pay, w/Ben', 'L', 'Leave w/o Pay, w/o Ben', 'F', 'Leave w/Pay, w/Ben', 'P', 'Leave w/Part.Pay, w/Ben', 'T', 'Terminated'), PEBEMPL_BCAT_CODE " +
	" FROM PEBEMPL " +
	" WHERE PEBEMPL_PIDM = :KEY_BLOCK_PIDM ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_PIDM", getFormModel().getKeyBlock().getPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getKeyBlock().setEmstRule(ptiCursorResults.getStr(0));
							getFormModel().getKeyBlock().setBcatCode(ptiCursorResults.getStr(1));
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("PYABENE-0031"), toStr("FORM"), toStr("*ERROR* Person is not an employee, see PEAEMPL form")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					String sqlptiCursor = "SELECT PTRBCAT_DESC " +
	" FROM PTRBCAT " +
	" WHERE PTRBCAT_CODE = :KEY_BLOCK_BCAT_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("KEY_BLOCK_BCAT_CODE", getFormModel().getKeyBlock().getBcatCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getKeyBlock().setBcatDesc(ptiCursorResults.getStr(0));
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("PYABENE-0032"), toStr("FORM"), toStr("*ERROR* Benefit Category code.")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( getGlobal("FORM_WAS_CALLED").equals("Y") )
				{
//					 goto BYPASS_TERMINATED_WARNING;
				}
//				 BYPASS_TERMINATED_WARNING:;
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-LISTVAL
		    G$_COPY_FLD_ATTR;
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'POIIDEN', 'QUERY');
   G$_RESET_GLOBAL;
--
   IF :GLOBAL.VALUE IS NOT NULL THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD ;
   END IF ;
SYNCHRONIZE;
G$_SET_INST_PROPERTY;
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
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("POIIDEN"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
				// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\PYABENEF2NMigrationGuide.xml#ExcludeSynchronize".
				//				SupportClasses.SQLFORMS.Synchronize();
//				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\PYABENEF2NMigrationGuide.xml#ExcludeSynchronize'.");
				
				
				getTask().getGoqrpls().gSetInstProperty();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUP-ITEM
		 -- Added to call the new GUILATI form from Option List Window 
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(USER,'GUIALTI','QUERY');
--
IF :GLOBAL.VALUE IS NOT NULL THEN
  EXECUTE_TRIGGER('LIST_VALUES_COPY');
  G$_CHECK_FAILURE;
  NEXT_FIELD;
  G$_CHECK_FAILURE;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", item="ID", function=KeyFunction.DUPLICATE_ITEM)
		public void id_KeyDupItem()
		{
			
				//  Added to call the new GUILATI form from Option List Window 
				//  Added to call the new GUILATI form from Option List Window 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUIALTI"), toStr("QUERY"));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NAME", function=KeyFunction.NEXT_ITEM)
		public void name_keyNexItem()
		{
			
			getGNameClass().nextItem();
		}

		
	
	
}

