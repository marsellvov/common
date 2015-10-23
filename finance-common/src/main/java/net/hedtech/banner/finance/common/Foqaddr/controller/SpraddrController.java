package net.hedtech.banner.finance.common.Foqaddr.controller;
 
import java.util.*;
import morphis.core.utils.behavior.annotations.After;
import morphis.core.utils.behavior.annotations.Before;
			

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
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Foqaddr.model.*;
import net.hedtech.banner.finance.common.Foqaddr.*;
import net.hedtech.banner.finance.common.Foqaddr.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpraddrController extends DefaultBlockController {

	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public SpraddrController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FoqaddrTask getTask() {
		return (FoqaddrTask)super.getTask();
	}

	public FoqaddrModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER SPRADDR.PRE-INSERT
		    MESSAGE (  G$_NLS.Get('FOQADDR-0006', 'FORM','*ERROR* Cannot create record, query-only form.')  )
      ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void spraddr_BeforeRowInsert(RowAdapterEvent args)
		{
			
				errorMessage(GNls.Fget(toStr("FOQADDR-0006"), toStr("FORM"), toStr("*ERROR* Cannot create record, query-only form.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.POST-QUERY
		 if nvl(:spraddr_status_ind,'A') = 'I' then
   raise form_trigger_failure ;
end if ;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void spraddr_AfterQuery(RowAdapterEvent args)
		{
			
				SpraddrAdapter spraddrElement = (SpraddrAdapter)args.getRow();
				
				try
				{
					spraddrElement.setLockDbValues(true);
								try { 
								this.spraddrNatnCode_PostChange();
								} catch(Exception ex) {
								}

				} finally { 
					spraddrElement.setLockDbValues(false);
				}
				if ( isNull(spraddrElement.getSpraddrStatusInd(), "A").equals("I") )
				{
					throw new ApplicationException();
				}
			}

		@BeforeQuery
		public void spraddr_BeforeQuery(QueryEvent args)
		{
			
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_PIDM", this.getFormModel().getKeyBlock().getPidm()));             

			}
		
		
		
		/* Original PL/SQL code code for TRIGGER SPRADDR.PRE-DELETE
		    MESSAGE (  G$_NLS.Get('FOQADDR-0007', 'FORM','*ERROR* Cannot delete record, query-only form.')  )
      ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void spraddr_BeforeRowDelete(RowAdapterEvent args)
		{
			
				errorMessage(GNls.Fget(toStr("FOQADDR-0007"), toStr("FORM"), toStr("*ERROR* Cannot delete record, query-only form.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-DELREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void spraddr_DeleteRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-NXTBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void spraddr_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-NXTREC
		    NEXT_RECORD ;
<multilinecomment> 
  G$_CHECK_FAILURE ;
   IF :SPRADDR_ATYP_CODE IS NULL  THEN
      PREVIOUS_RECORD ;
      G$_CHECK_FAILURE ;
      MESSAGE ( 'At last record.' ) ;
   END IF ;
</multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
//		public void spraddr_NextRecord()
//		{
//			
//				nextRecord();
//			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.WHEN-NEW-RECORD-INSTANCE
		    G$_CHECK_FAILURE ;
   IF :SPRADDR_ATYP_CODE IS NULL  THEN
      PREVIOUS_RECORD ;
      G$_CHECK_FAILURE ;
      MESSAGE (  G$_NLS.Get('FOQADDR-0008', 'FORM','At last record.')  ) ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void spraddr_recordChange()
		{
			

			
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
				if(spraddrElement==null)
					return;

				getTask().getGoqrpls().gCheckFailure();
				if ( spraddrElement.getSpraddrAtypCode().isNull() )
				{
					previousRecord();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.PRE-BLOCK
		 BEGIN
<multilinecomment>	IF GET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED)='FALSE' THEN
		SET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED,PROPERTY_ON);
	END IF;
	IF GET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED)='FALSE' THEN
		SET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED,PROPERTY_ON);
	END IF;</multilinecomment>
	NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void spraddr_blockIn()
		{
			
				// 	IF GET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED)='FALSE' THEN
				// SET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED,PROPERTY_ON);
				// END IF;
				// IF GET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED)='FALSE' THEN
				// SET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED,PROPERTY_ON);
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.POST-BLOCK
		 BEGIN
	SET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED,PROPERTY_OFF);
	SET_ITEM_PROPERTY('SPRADDR_ASRC_CODE_LBT',ENABLED,PROPERTY_OFF);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void spraddr_blockOut()
		{
			
				setItemEnabled("SPRADDR_ATYP_CODE_LBT", false);
				setItemEnabled("SPRADDR_ASRC_CODE_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-ENTQRY
		 IF GET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED)='FALSE' THEN
--		SET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',VISIBLE,PROPERTY_ON);
		SET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@Before
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void spraddr_Search()
		{
			
				if ( getItemEnabled("SPRADDR_ATYP_CODE_LBT").equals("FALSE") )
				{
					// 		SET_ITEM_PROPERTY('SPRADDR_ATYP_CODE_LBT',VISIBLE,PROPERTY_ON);
					setItemEnabled("SPRADDR_ATYP_CODE_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-EXEQRY
		 	SET_ITEM_PROPERTY('SPRADDR.SPRADDR_ATYP_CODE_LBT',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void spraddr_ExecuteQuery()
		{
			
				setItemEnabled("SPRADDR.SPRADDR_ATYP_CODE_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_ASRC_CODE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
	DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_doubleClick()
		{
			
				executeAction("LIST_VALUES");
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_NATN_CODE.POST-CHANGE
		 DECLARE CURSOR NATN_CURSOR IS
   SELECT STVNATN_NATION
   FROM   STVNATN
   WHERE  STVNATN_CODE = :SPRADDR_NATN_CODE;
BEGIN
   OPEN NATN_CURSOR;
   FETCH NATN_CURSOR INTO :NATN_DESC;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_PostChange()
		{
			

				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);

				if(spraddrElement!=null){
				int rowCount = 0;
				if(spraddrElement.getSpraddrNatnCode().isNull())
		return;
				{
					String sqlnatnCursor = "SELECT STVNATN_NATION " +
	" FROM STVNATN " +
	" WHERE STVNATN_CODE = :SPRADDR_NATN_CODE ";
					DataCursor natnCursor = new DataCursor(sqlnatnCursor);
					try {
						//Setting query parameters
						natnCursor.addParameter("SPRADDR_NATN_CODE", spraddrElement.getSpraddrNatnCode());
						natnCursor.open();
						ResultSet natnCursorResults = natnCursor.fetchInto();
						if ( natnCursorResults != null ) {
							spraddrElement.setNatnDesc(natnCursorResults.getStr(0));
						}
					}
					finally{
						natnCursor.close();
					}
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NATN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NATN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void natnDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_FROM_DATE", function=KeyFunction.NEXT_ITEM)
		public void spraddrFromDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_FROM_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrFromDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_FROM_DATE", function=KeyFunction.ITEM_OUT)
		public void spraddrFromDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_TO_DATE", function=KeyFunction.NEXT_ITEM)
		public void spraddrToDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_TO_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrToDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_TO_DATE", function=KeyFunction.ITEM_OUT)
		public void spraddrToDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ATYP_CODE_LBT")
		public void spraddrAtypCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ASRC_CODE_LBT")
		public void spraddrAsrcCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_validate()
		{
			
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
							this.spraddrNatnCode_PostChange();

			}

		
	
	
}

