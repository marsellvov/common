package net.hedtech.general.common.libraries.Aoqclib.controller;
 
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
import net.hedtech.general.common.libraries.Aoqclib.model.*;
import net.hedtech.general.common.libraries.Aoqclib.*;
import net.hedtech.general.common.libraries.Aoqclib.services.*;

		
public class AmrattnController extends AbstractSupportCodeObject {


	
	public AmrattnController(ITask task) {
		super(task);
	}
	
	
	@Override
	public AoqclibTaskPart getContainer() {
		return (AoqclibTaskPart)super.getContainer();
	}
	
	
	public AoqclibModel getFormModel() {
		return this.getContainer().getModel();
	}	
		
			
	//action methods generated from triggers
	
		/* Original PL/SQL code code for TRIGGER AMRATTN.PRE-INSERT
		    EXECUTE_TRIGGER( 'CHECK_DUP_ATTN_CODE' );
   G$_CHECK_FAILURE ;
--   
   EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
   :AMRATTN_DATA_ORIGIN := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM_NAME));
   :AMRATTN_USER_ID := :GLOBAL.CURRENT_USER;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void amrattn_BeforeRowInsert(RowAdapterEvent args)
		{
			
				AmrattnAdapter amrattnElement = (AmrattnAdapter)args.getRow();


				executeAction("CHECK_DUP_ATTN_CODE");
				getContainer().getGoqrpls().gCheckFailure();
				//    
				executeAction("UPDATE_ACTIVITY_DATE");
				getContainer().getGoqrpls().gCheckFailure();
				amrattnElement.setAmrattnDataOrigin(upper(getCurrentTaskName()));
				amrattnElement.setAmrattnUserId(getGlobal("CURRENT_USER"));
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN.PRE-UPDATE
		    EXECUTE_TRIGGER( 'CHECK_DUP_ATTN_CODE' );
   G$_CHECK_FAILURE ;
--   
   EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' ) ;
   G$_CHECK_FAILURE ;
   :AMRATTN_DATA_ORIGIN := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM_NAME));
   :AMRATTN_USER_ID := :GLOBAL.CURRENT_USER;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void amrattn_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				AmrattnAdapter amrattnElement = (AmrattnAdapter)args.getRow();


				executeAction("CHECK_DUP_ATTN_CODE");
				getContainer().getGoqrpls().gCheckFailure();
				//    
				executeAction("UPDATE_ACTIVITY_DATE");
				getContainer().getGoqrpls().gCheckFailure();
				amrattnElement.setAmrattnDataOrigin(upper(getCurrentTaskName()));
				amrattnElement.setAmrattnUserId(getGlobal("CURRENT_USER"));
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN.KEY-COMMIT
		    COMMIT_FORM ;
--
   EXECUTE_TRIGGER('CHECK_ATTN_INFO');   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void amrattn_Save()
		{
			
				commitTask();
				// 
				executeAction("CHECK_ATTN_INFO");
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN.KEY-DELREC
		 IF :AMRATTN_ORIG_IND = '1' THEN
   MESSAGE(  G$_NLS.Get('AOQCLIB-0059', 'FORM','*ERROR* Contact Originator information can only be maintained on Contacts tab.') 
               ) ;
   RETURN ;
END IF ;
--
   DELETE_RECORD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void amrattn_DeleteRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				AmrattnAdapter amrattnElement = (AmrattnAdapter)this.getFormModel().getAmrattn().getRowAdapter(true);


				if ( amrattnElement.getAmrattnOrigInd().equals("1") )
				{
					errorMessage(GNls.Fget(toStr("AOQCLIB-0059"), toStr("FORM"), toStr("*ERROR* Contact Originator information can only be maintained on Contacts tab.")));
					return ;
				}
				// 
				deleteRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN.KEY-NXTBLK
		 NEXT_BLOCK ;

:SYSTEM.MESSAGE_LEVEL := '5';
EXECUTE_QUERY ( ALL_RECORDS );
:SYSTEM.MESSAGE_LEVEL := '0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void amrattn_NextBlock()
		{
			
				nextBlock();
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				executeQuery();
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN.KEY-PRVBLK
		 --   PREVIOUS_BLOCK ;
--   EXECUTE_QUERY;
    GO_ITEM('AMRCONT_CALL_REPORT');
--
-- Removed block AMRPCCM and added new LONG column AMRCONT_CALL_REPORT. 8/7/96 FHL
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void amrattn_PreviousBlock()
		{
			
				//    PREVIOUS_BLOCK ;
				//    EXECUTE_QUERY;
				//    PREVIOUS_BLOCK ;
				//    EXECUTE_QUERY;
				goItem(toStr("AMRCONT_CALL_REPORT"));
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN.KEY-ENTQRY
		 begin
  G$_GOQOLIB_KEY_TRIGGER.KEY_ENTQRY;
  G$_CHECK_FAILURE;
end;  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void amrattn_Search()
		{
			
			this.getContainer().getGoqrpls().getGGoqolibKeyTrigger().keyEntqry();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN.POST-QUERY
		 DECLARE
      CURSOR PTI_CURSOR IS
         SELECT GURIDEN_DESC
         FROM   GURIDEN
         WHERE  GURIDEN_IDEN_CODE = :AMRATTN_ATTN_IDEN_CODE
           AND  GURIDEN_USER_ID IS NOT NULL ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ATTN_IDEN_DESC ;
     G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, NULL, TRUE);
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void amrattn_AfterQuery(RowAdapterEvent args)
		{
			
				AmrattnAdapter amrattnElement = (AmrattnAdapter)args.getRow();


				int rowCount = 0;
				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				{
					String sqlptiCursor = "SELECT GURIDEN_DESC " +
	" FROM GURIDEN " +
	" WHERE GURIDEN_IDEN_CODE = :AMRATTN_ATTN_IDEN_CODE AND GURIDEN_USER_ID IS NOT NULL ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("AMRATTN_ATTN_IDEN_CODE", amrattnElement.getAmrattnAttnIdenCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							amrattnElement.setAttnIdenDesc(ptiCursorResults.getStr(0));
						}
						getContainer().getGoqrpls().gCheckValue(ptiCursor.notFound(), null, NBool.True);
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN.WHEN-NEW-RECORD-INSTANCE
		 EXECUTE_TRIGGER('CHECK_ATTN_INFO');
--
IF :AMRATTN_ORIG_IND = '1' THEN	
   IF GET_ITEM_PROPERTY('AMRATTN_ATTN_IDEN_CODE',UPDATEABLE) = 'TRUE' THEN
      SET_ITEM_PROPERTY('AMRATTN_ATTN_IDEN_CODE',UPDATEABLE,PROPERTY_OFF);
   END IF;
   IF GET_ITEM_PROPERTY('AMRATTN_ATTN_IDEN_CODE_LBT',ENABLED) = 'TRUE' THEN
      SET_ITEM_PROPERTY('AMRATTN_ATTN_IDEN_CODE_LBT',ENABLED,PROPERTY_OFF);
   END IF;
ELSE
   IF GET_ITEM_PROPERTY('AMRATTN_ATTN_IDEN_CODE',UPDATEABLE) = 'FALSE' THEN
      SET_ITEM_PROPERTY('AMRATTN_ATTN_IDEN_CODE',UPDATEABLE,PROPERTY_ON);
   END IF;
   IF GET_ITEM_PROPERTY('AMRATTN_ATTN_IDEN_CODE_LBT',ENABLED) = 'FALSE' THEN
      SET_ITEM_PROPERTY('AMRATTN_ATTN_IDEN_CODE_LBT',ENABLED,PROPERTY_ON);
   END IF;
END IF;
--
GO_ITEM('AMRATTN_ATTN_IDEN_CODE');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void amrattn_recordChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				AmrattnAdapter amrattnElement = (AmrattnAdapter)this.getFormModel().getAmrattn().getRowAdapter(true);


				executeAction("CHECK_ATTN_INFO");
				// 
				if ( amrattnElement.getAmrattnOrigInd().equals("1") )
				{
					if ( getItemUpdateAllowed("AMRATTN_ATTN_IDEN_CODE").equals("TRUE") )
					{
						setItemUpdateAllowed("AMRATTN_ATTN_IDEN_CODE", false);
					}
					if ( getItemEnabled("AMRATTN_ATTN_IDEN_CODE_LBT").equals("TRUE") )
					{
						setItemEnabled("AMRATTN_ATTN_IDEN_CODE_LBT", false);
					}
				}
				else {
					if ( getItemUpdateAllowed("AMRATTN_ATTN_IDEN_CODE").equals("FALSE") )
					{
						setItemUpdateAllowed("AMRATTN_ATTN_IDEN_CODE", true);
					}
					if ( getItemEnabled("AMRATTN_ATTN_IDEN_CODE_LBT").equals("FALSE") )
					{
						setItemEnabled("AMRATTN_ATTN_IDEN_CODE_LBT", true);
					}
				}
				// 
				goItem(toStr("AMRATTN_ATTN_IDEN_CODE"));
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN.CHECK_DUP_ATTN_CODE
		 DECLARE
	PTI_INTO_TEMP   VARCHAR2(255) ;
	CURSOR DUP_ATTN_CURSOR IS
         SELECT 'X'
         FROM   AMRATTN
         WHERE  AMRATTN_PIDM = :AMRCONT_PIDM 
         AND    AMRATTN_ITEM_REFNO = :AMRCONT_ITEM_REFNO
         AND    :AMRATTN_ATTN_IDEN_CODE = AMRATTN_ATTN_IDEN_CODE;
BEGIN
	 OPEN DUP_ATTN_CURSOR;
	 FETCH DUP_ATTN_CURSOR INTO PTI_INTO_TEMP;
	 CLOSE DUP_ATTN_CURSOR;
IF PTI_INTO_TEMP = 'X' THEN
<< ERROR_MESSAGE >>
MESSAGE( G$_NLS.Get('AOQCLIB-0060', 'FORM','*ERROR* Duplicate Additional Attendee Code not allowed on a single contact.') );
RAISE FORM_TRIGGER_FAILURE;
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN.CHECK_DUP_ATTN_CODE
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="CHECK_DUP_ATTN_CODE")
//		public void amrattn_CheckDupAttnCode()
//		{
//			
//
//				//F2J_WARNING : Caution, the variable may be null.
//				AmrattnAdapter amrattnElement = (AmrattnAdapter)this.getFormModel().getAmrattn().getRowAdapter(true);
//
//
//				int rowCount = 0;
//				{
//					NString ptiIntoTemp= NString.getNull();
//					String sqldupAttnCursor = "SELECT 'X' " +
//	" FROM AMRATTN " +
//	" WHERE AMRATTN_PIDM = :AMRCONT_PIDM AND AMRATTN_ITEM_REFNO = :AMRCONT_ITEM_REFNO AND :AMRATTN_ATTN_IDEN_CODE = AMRATTN_ATTN_IDEN_CODE ";
//					DataCursor dupAttnCursor = new DataCursor(sqldupAttnCursor);
//					try {
//						//Setting query parameters
//						dupAttnCursor.addParameter("AMRCONT_PIDM", this.getModel()getValue(F2N_UKNOWN_BUSINESS_OBJECT,AMRCONT_PIDM));
//						dupAttnCursor.addParameter("AMRCONT_ITEM_REFNO", this.getModel()getValue(F2N_UKNOWN_BUSINESS_OBJECT,AMRCONT_ITEM_REFNO));
//						dupAttnCursor.addParameter("AMRATTN_ATTN_IDEN_CODE", amrattnElement.getAmrattnAttnIdenCode());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable dupAttnCursor.
//						dupAttnCursor.open();
//						ResultSet dupAttnCursorResults = dupAttnCursor.fetchInto();
//						if ( dupAttnCursorResults != null ) {
//							ptiIntoTemp = dupAttnCursorResults.getStr(0);
//						}
//						dupAttnCursor.close();
//						if ( ptiIntoTemp.equals("X") )
//						{
//							 ERROR_MESSAGE:;
//							errorMessage(GNls.Fget(toStr("AOQCLIB-0060"), toStr("FORM"), toStr("*ERROR* Duplicate Additional Attendee Code not allowed on a single contact.")));
//							throw new ApplicationException();
//						}
//					}
//					finally{
//						dupAttnCursor.close();
//					}
//				}
//			}
//
//		
//		/*
//		 *<p>
//		 *<b>Migration Comments</b>
//		 * Generated from trigger:
//		 * AMRATTN.PRE-QUERY
//		 *
//		 *
//		 *</p>
//		 * @param args
//		*/
//
//		@BeforeQuery
//		public void amrattn_BeforeQuery(QueryEvent args)
//		{
//			
//               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized
//
//				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", ));             
//
//
//				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("AMRCONT_ITEM_REFNO", ));             
//
//
//           
//               }

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ATTN_IDEN_CODE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ATTN_IDEN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="AMRATTN_ATTN_IDEN_CODE")
		public void amrattnAttnIdenCode_doubleClick()
		{
			
			this.getContainer().getGoqrpls().getGSearch().whenMouseClick();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ATTN_IDEN_CODE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ATTN_IDEN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="AMRATTN_ATTN_IDEN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void amrattnAttnIdenCode_itemChange()
		{
			
			this.getContainer().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ATTN_IDEN_CODE.KEY-NEXT-ITEM
		 BEGIN
  G$_SEARCH.CODE_KEY_NEXT_ITEM;
  G$_CHECK_FAILURE;
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ATTN_IDEN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="AMRATTN_ATTN_IDEN_CODE", function=KeyFunction.NEXT_ITEM)
		public void amrattnAttnIdenCode_keyNexItem()
		{
			
			this.getContainer().getGoqrpls().getGSearch().codeKeyNextItem();
				getContainer().getGoqrpls().gCheckFailure();
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ATTN_IDEN_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ATTN_IDEN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="AMRATTN_ATTN_IDEN_CODE", function=KeyFunction.ITEM_OUT)
		public void amrattnAttnIdenCode_itemOut()
		{
			
			this.getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ATTN_IDEN_CODE.WHEN-VALIDATE-ITEM
		 DECLARE
      CURSOR PTI_CURSOR IS
         SELECT GURIDEN_DESC
         FROM   GURIDEN
         WHERE  GURIDEN_IDEN_CODE = :AMRATTN_ATTN_IDEN_CODE
           AND  GURIDEN_USER_ID IS NOT NULL ;
   BEGIN
      IF :amrattn_attn_iden_code is not null then
        OPEN  PTI_CURSOR ;
        FETCH PTI_CURSOR INTO :ATTN_IDEN_DESC ;
        IF PTI_CURSOR%NOTFOUND THEN
          MESSAGE( G$_NLS.Get('AOQCLIB-0061', 'FORM','*ERROR* Invalid Additional Attendee Code must have User ID; press LIST') );
          RAISE FORM_TRIGGER_FAILURE;
        END IF ;
      END IF;
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ATTN_IDEN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="AMRATTN_ATTN_IDEN_CODE")
		public void amrattnAttnIdenCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				AmrattnAdapter amrattnElement = (AmrattnAdapter)this.getFormModel().getAmrattn().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT GURIDEN_DESC " +
	" FROM GURIDEN " +
	" WHERE GURIDEN_IDEN_CODE = :AMRATTN_ATTN_IDEN_CODE AND GURIDEN_USER_ID IS NOT NULL ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						if ( !amrattnElement.getAmrattnAttnIdenCode().isNull() )
						{
							//Setting query parameters
							ptiCursor.addParameter("AMRATTN_ATTN_IDEN_CODE", amrattnElement.getAmrattnAttnIdenCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								amrattnElement.setAttnIdenDesc(ptiCursorResults.getStr(0));
							}
							if ( ptiCursor.notFound() )
							{
								errorMessage(GNls.Fget(toStr("AOQCLIB-0061"), toStr("FORM"), toStr("*ERROR* Invalid Additional Attendee Code must have User ID; press LIST")));
								throw new ApplicationException();
							}
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ATTN_IDEN_CODE.KEY-LISTVAL
		 EXECUTE_TRIGGER('CALL_GUAIDEN');
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ATTN_IDEN_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="AMRATTN_ATTN_IDEN_CODE", function=KeyFunction.LIST_VALUES)
		public void amrattnAttnIdenCode_ListValues()
		{
			
				executeAction("CALL_GUAIDEN");
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getContainer().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ATTN_IDEN_CODE.G$_SEARCH_OPTIONS
		 EXECUTE_TRIGGER('CALL_GUAIDEN');
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ATTN_IDEN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="AMRATTN_ATTN_IDEN_CODE")
		public void amrattnAttnIdenCode_GSearchOptions()
		{
			
				executeAction("CALL_GUAIDEN");
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getContainer().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ATTN_IDEN_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('GURIDEN_IDEN_CODE', 'GURIDEN_DESC');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ATTN_IDEN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="AMRATTN_ATTN_IDEN_CODE")
		public void amrattnAttnIdenCode_GSearchParameters()
		{
			
			this.getContainer().getGoqrpls().getGSearch().parameters(toStr("GURIDEN_IDEN_CODE"), toStr("GURIDEN_DESC"));
			}

		
		/* Original PL/SQL code code for TRIGGER ATTN_IDEN_DESC.WHEN-NEW-ITEM-INSTANCE
		 PREVIOUS_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ATTN_IDEN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ATTN_IDEN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void attnIdenDesc_itemChange()
		{
			
				previousItem();
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ACTIVITY_DATE.KEY-NEXT-ITEM
		 BEGIN
  G$_DATE_NEXT_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="AMRATTN_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void amrattnActivityDate_keyNexItem()
		{
			
			getContainer().getGoqrpls().gDateNextItem();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_DATE_WHEN_NEW_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="AMRATTN_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void amrattnActivityDate_itemChange()
		{
			
			getContainer().getGoqrpls().gDateWhenNewItem();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ACTIVITY_DATE.POST-TEXT-ITEM
		 BEGIN
  G$_DATE_POST_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="AMRATTN_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void amrattnActivityDate_itemOut()
		{
			
			getContainer().getGoqrpls().gDatePostItem();
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER AMRATTN_ATTN_IDEN_CODE_LBT.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AMRATTN_ATTN_IDEN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="AMRATTN_ATTN_IDEN_CODE_LBT")
		@Before
		public void amrattnAttnIdenCodeLbt_click()
		{
			
			}

		
	
	
}

