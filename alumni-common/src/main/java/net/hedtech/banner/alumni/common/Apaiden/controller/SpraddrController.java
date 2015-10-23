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

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpraddrController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqclib.controller.SpraddrController getGoqclibSpraddrController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.SpraddrController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("SPRADDR");
	}	
	
	public SpraddrController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER SPRADDR.WHEN-NEW-BLOCK-INSTANCE
		 G$_NAVIGATION_FRAME.POPULATE_GUROPTM;
G$_CHECK_FAILURE;
--
--:HOLD_BLOCK_FIELD := 'SPRADDR.SPRADDR_ATYP_CODE';
:SYSTEM.MESSAGE_LEVEL := '5';
EXECUTE_QUERY;
:SYSTEM.MESSAGE_LEVEL := '0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@After
		public void spraddr_blockChange()
		{
			
				getTask().getGoqrpls().getGNavigationFrame().populateGuroptm();
				getTask().getGoqrpls().gCheckFailure();
				// 
				// :HOLD_BLOCK_FIELD := 'SPRADDR.SPRADDR_ATYP_CODE';
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				executeQuery();
				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void spraddr_BeforeQuery(QueryEvent args)
		{
			
			getGoqclibSpraddrController().spraddr_BeforeQuery(args);
		}

		
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
					try{
						this.spraddrFromDate_PostChange();

					} catch (Exception ex) { }
					try{
						this.spraddrToDate_PostChange();

					} catch (Exception ex) { }
					try{
						this.spraddrAtypCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spraddrStatCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spraddrCntyCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spraddrNatnCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.teleCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spraddrAsrcCode_PostChange();

					} catch (Exception ex) { }

				} finally { 
					spraddrElement.setLockDbValues(false);
				}
						getGoqclibSpraddrController().spraddr_AfterQuery(args);
		}
		

		
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
			
			getGoqclibSpraddrController().spraddr_BeforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void spraddr_RowInsert(RowAdapterEvent args)
		{
			
			getGoqclibSpraddrController().spraddr_RowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void spraddr_AfterRowInsert(RowAdapterEvent args)
		{
			
			getGoqclibSpraddrController().spraddr_AfterRowInsert(args);
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.PRE-UPDATE
		 EXECUTE_TRIGGER('CHECK_ADDRESS');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('CHECK_DATES');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER( 'CHECK_PHONES' ) ;
G$_CHECK_FAILURE ; 
--
EXECUTE_TRIGGER('CHECK_FINAID');
G$_CHECK_FAILURE;
--
:SPRADDR.SPRADDR_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT);
:SPRADDR.SPRADDR_USER := :GLOBAL.CURRENT_USER;
--
IF :SPRADDR.SPRADDR_STATUS_IND = 'I' THEN
  IF G$_NCHK(G$_NCHK(:SPRADDR.HOLD_STATUS <> 'I')) THEN
    :SPRADDR.CHANGE_STATUS := 'Y';
  END IF;
ELSE
  IF :SPRADDR.HOLD_STATUS = 'I' THEN
    :SPRADDR.CHANGE_STATUS := 'Y';
  END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void spraddr_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				SpraddrAdapter spraddrElement = (SpraddrAdapter)args.getRow();


				executeAction("CHECK_ADDRESS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("CHECK_DATES");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("CHECK_PHONES");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("CHECK_FINAID");
				getTask().getGoqrpls().gCheckFailure();
				// 
				spraddrElement.setSpraddrActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				spraddrElement.setSpraddrUser(getGlobal("CURRENT_USER"));
				// 
				if ( spraddrElement.getSpraddrStatusInd().equals("I") )
				{
					if ( getTask().getGoqrpls().gNchk(getTask().getGoqrpls().gNchk(spraddrElement.getHoldStatus().notEquals("I"))).getValue() )
					{
						spraddrElement.setChangeStatus(toStr("Y"));
					}
				}
				else {
					if ( spraddrElement.getHoldStatus().equals("I") )
					{
						spraddrElement.setChangeStatus(toStr("Y"));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void spraddr_RowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSpraddrController().spraddr_RowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void spraddr_AfterRowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSpraddrController().spraddr_AfterRowUpdate(args);
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.PRE-DELETE
		 EXECUTE_TRIGGER('CHECK_FINAID');
G$_CHECK_FAILURE;

EXECUTE_TRIGGER( 'CHECK_PREF_ADDR' ) ;
G$_CHECK_FAILURE ;
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
			
				executeAction("CHECK_FINAID");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_PREF_ADDR");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void spraddr_RowDelete(RowAdapterEvent args)
		{
			
			getGoqclibSpraddrController().spraddr_RowDelete(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.POST-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowDelete
		public void spraddr_AfterRowDelete(RowAdapterEvent args)
		{
			
			getGoqclibSpraddrController().spraddr_AfterRowDelete(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void spraddr_ClearTask()
		{
			
			getGoqclibSpraddrController().spraddr_ClearTask();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void spraddr_Save()
		{
			
			getGoqclibSpraddrController().spraddr_Save();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-DELREC
		 DECLARE
--
  al_id  Alert;
  al_btn NUMBER;
--  
BEGIN	
EXECUTE_TRIGGER('FIELDS_ENTERED');
G$_CHECK_FAILURE;
--
   << CHECK_ORG_PREFERRED >>
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   AOBORGN
         WHERE  AOBORGN_PIDM = :SPRADDR_PIDM
           AND  AOBORGN_PREF_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE
           AND  AOBORGN_PREF_ATYP_SEQNO = :SPRADDR.SPRADDR_SEQNO ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%FOUND THEN
      	 al_id := FIND_ALERT('DEL_ORG_ADDR');
         al_btn := SHOW_ALERT(al_id);
         IF al_btn <> ALERT_BUTTON1 THEN
         	  RETURN;
         END IF;
      END IF ;
   END ;
--
DELETE_RECORD;
G$_CHECK_FAILURE;
END;

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
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				int rowCount = 0;
				{
					// 
					AlertDescriptor alId= null;
					NNumber alBtn= NNumber.getNull();
					executeAction("FIELDS_ENTERED");
					getTask().getGoqrpls().gCheckFailure();
					 CHECK_ORG_PREFERRED:;
					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
	" FROM AOBORGN " +
	" WHERE AOBORGN_PIDM = :SPRADDR_PIDM AND AOBORGN_PREF_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND AOBORGN_PREF_ATYP_SEQNO = :SPRADDR_SPRADDR_SEQNO ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
							ptiCursor.addParameter("SPRADDR_SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
							ptiCursor.addParameter("SPRADDR_SPRADDR_SEQNO", spraddrElement.getSpraddrSeqno());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							if ( ptiCursor.found() )
							{
								alId = findAlert("DEL_ORG_ADDR");
								alBtn = toNumber(showAlert(alId));
								if ( alBtn.notEquals(MessageServices.BUTTON1) )
								{
									return ;
								}
							}
						}
						finally{
							ptiCursor.close();
						}
					}
					// 
					deleteRecord();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void spraddr_CopyRecord()
		{
			
			getGoqclibSpraddrController().spraddr_CopyRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void spraddr_Search()
		{
			
			getGoqclibSpraddrController().spraddr_Search();
		}

		
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
			
			getGoqclibSpraddrController().spraddr_NextBlock();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-NXTKEY
		 IF :GLOBAL.ALUM_CALLED_FORM = 'Y' THEN
          if :system.block_status = 'QUERY' then
             :GLOBAL.ADDRESS_TYPE := :SPRADDR_ATYP_CODE ;
             G$_DETERMINE_ERASE_GLOBAL;
             G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM;
          end if ;
       END IF ;
GO_ITEM('SPRADDR.SPRADDR_ZIP');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void spraddr_KeyNxtkey()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				if ( getGlobal("ALUM_CALLED_FORM").equals("Y") )
				{
					if ( getBlockStatus().equals("QUERY") )
					{
						setGlobal("ADDRESS_TYPE", spraddrElement.getSpraddrAtypCode());
						getTask().getGoqrpls().gDetermineEraseGlobal();
						getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
					}
				}
				goItem(toStr("SPRADDR.SPRADDR_ZIP"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void spraddr_NextRecord()
		{
			
			getGoqclibSpraddrController().spraddr_NextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void spraddr_KeyNxtset()
		{
			
			getGoqclibSpraddrController().spraddr_KeyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void spraddr_PreviousBlock()
		{
			
			getGoqclibSpraddrController().spraddr_PreviousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void spraddr_PreviousRecord()
		{
			
			getGoqclibSpraddrController().spraddr_PreviousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_ADDRESS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ADDRESS")
		public void spraddr_CheckAddress()
		{
			
			getGoqclibSpraddrController().spraddr_CheckAddress();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_ADDRESS_EXISTS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ADDRESS_EXISTS")
		public void spraddr_CheckAddressExists()
		{
			
			getGoqclibSpraddrController().spraddr_CheckAddressExists();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_DATES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_DATES")
		public void spraddr_CheckDates()
		{
			
			getGoqclibSpraddrController().spraddr_CheckDates();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_IF_PHONE_EXISTS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_IF_PHONE_EXISTS")
		public void spraddr_CheckIfPhoneExists()
		{
			
			getGoqclibSpraddrController().spraddr_CheckIfPhoneExists();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_MULTIPLE_ZIPS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_MULTIPLE_ZIPS")
		public void spraddr_CheckMultipleZips()
		{
			
			getGoqclibSpraddrController().spraddr_CheckMultipleZips();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_PHONE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PHONE")
		public void spraddr_CheckPhone()
		{
			
			getGoqclibSpraddrController().spraddr_CheckPhone();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_PHONE_UPDATE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PHONE_UPDATE")
		public void spraddr_CheckPhoneUpdate()
		{
			
			getGoqclibSpraddrController().spraddr_CheckPhoneUpdate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_PHONES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PHONES")
		public void spraddr_CheckPhones()
		{
			
			getGoqclibSpraddrController().spraddr_CheckPhones();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.ENABLE_PHONE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ENABLE_PHONE")
		public void spraddr_EnablePhone()
		{
			
			getGoqclibSpraddrController().spraddr_EnablePhone();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.FIELDS_ENTERED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="FIELDS_ENTERED")
		public void spraddr_FieldsEntered()
		{
			
			getGoqclibSpraddrController().spraddr_FieldsEntered();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.GET_PHONE_COUNT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_PHONE_COUNT")
		public void spraddr_GetPhoneCount()
		{
			
			getGoqclibSpraddrController().spraddr_GetPhoneCount();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.GET_PHONE_INFO
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_PHONE_INFO")
		public void spraddr_GetPhoneInfo()
		{
			
			getGoqclibSpraddrController().spraddr_GetPhoneInfo();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.INSERT_SPRTELE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INSERT_SPRTELE")
		public void spraddr_InsertSprtele()
		{
			
			getGoqclibSpraddrController().spraddr_InsertSprtele();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PHONE_COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PHONE_COMMIT")
		public void spraddr_PhoneCommit()
		{
			
			getGoqclibSpraddrController().spraddr_PhoneCommit();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.RESET_FINANCE_RULES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="RESET_FINANCE_RULES")
		public void spraddr_ResetFinanceRules()
		{
			
			getGoqclibSpraddrController().spraddr_ResetFinanceRules();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.SET_CHECK_BOXES
		 DECLARE
   CURSOR APBCONS_ATYP_CURSOR IS
      SELECT APBCONS_ATYP_CODE_PREF, APBCONS_ATYP_CODE_CM, APBCONS_ATYP_CODE_GEOR
      FROM   APBCONS
      WHERE  APBCONS_PIDM = :PIDM;
   CURSOR EMP_DETAILS_CURSOR IS
      SELECT 'X'
      FROM   APREHIS
      WHERE  APREHIS_PIDM = :PIDM AND
             APREHIS_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE AND
             APREHIS_ATYP_SEQNO = :SPRADDR.SPRADDR_SEQNO; 
   CURSOR AOBORGN_ATYP_CURSOR IS
      SELECT AOBORGN_PREF_ATYP_CODE, AOBORGN_PREF_ATYP_SEQNO
      FROM   AOBORGN
      WHERE  AOBORGN_PIDM = :PIDM;                

  ATYP_CODE_PREF VARCHAR2(2);  
  ATYP_CODE_GEOR VARCHAR2(2);
  ATYP_CODE_CM   VARCHAR2(2);
  EMP_DET_EXISTS VARCHAR2(1); 
  ATYP_SEQNO_PREF NUMBER; 

BEGIN
	
  :SPRADDR.PREFERRED_ADDR   := 'N' ;
  :SPRADDR.PREFERRED_REGION := 'N' ;
  :SPRADDR.COMBINED_MAILING := 'N' ;
  :EMPLOYMENT_DETAILS       := 'N' ;
--
-- Get AOBORGN Record
--
   OPEN AOBORGN_ATYP_CURSOR ;
   FETCH AOBORGN_ATYP_CURSOR INTO ATYP_CODE_PREF, ATYP_SEQNO_PREF ;
   IF AOBORGN_ATYP_CURSOR%NOTFOUND THEN
      NULL ;
   ELSE
   	  IF ATYP_CODE_PREF = :SPRADDR.SPRADDR_ATYP_CODE 
   	 AND ATYP_SEQNO_PREF = :SPRADDR.SPRADDR_SEQNO 	THEN
         :SPRADDR.PREFERRED_ADDR := 'Y';
         :PREFERRED_RECORD_NUMBER := TO_NUMBER(:SYSTEM.TRIGGER_RECORD) ;
      END IF;
   END IF;
   CLOSE AOBORGN_ATYP_CURSOR ;
--
-- Get APREHIS Record and check for employment details
--
  OPEN EMP_DETAILS_CURSOR;
  FETCH EMP_DETAILS_CURSOR INTO EMP_DET_EXISTS;
  IF EMP_DETAILS_CURSOR%FOUND THEN  	
  	 :EMPLOYMENT_DETAILS := 'Y' ;
  END IF;
  CLOSE EMP_DETAILS_CURSOR;
--  
  IF :SPRADDR.SPRADDR_STATUS_IND = 'I' THEN
    RETURN;
  END IF;
--
-- If both are null.
--
  IF (:SPRADDR.SPRADDR_TO_DATE IS NULL AND
      :SPRADDR.SPRADDR_FROM_DATE IS NULL) THEN
    NULL;
  ELSE
--
-- If both are not null.
--
    IF G$_NCHK(:SPRADDR.SPRADDR_TO_DATE IS NOT NULL AND
               :SPRADDR.SPRADDR_FROM_DATE IS NOT NULL) THEN
      IF (TRUNC(SYSDATE) BETWEEN TRUNC(:SPRADDR.SPRADDR_FROM_DATE)
                             AND TRUNC(:SPRADDR.SPRADDR_TO_DATE)) THEN
        NULL;
      ELSE
        RETURN;
      END IF;
--    
    ELSE
      IF (:SPRADDR.SPRADDR_FROM_DATE IS NULL) THEN
        IF (:SPRADDR.SPRADDR_TO_DATE IS NULL) THEN
          RETURN;
        ELSE
          IF G$_NCHK((TRUNC(SYSDATE) > TRUNC(:SPRADDR.SPRADDR_TO_DATE))) THEN
            RETURN;
          END IF;
        END IF;
      ELSE
        IF (TRUNC(SYSDATE) >= TRUNC(:SPRADDR.SPRADDR_FROM_DATE)) THEN
          NULL;
        ELSE
          RETURN;
        END IF;
      END IF;
    END IF;
END IF; 
--
-- Get APBCONS Record
--
   OPEN APBCONS_ATYP_CURSOR ;
   FETCH APBCONS_ATYP_CURSOR INTO ATYP_CODE_PREF, ATYP_CODE_CM, ATYP_CODE_GEOR ;
   IF APBCONS_ATYP_CURSOR%NOTFOUND THEN
      CLOSE APBCONS_ATYP_CURSOR ;
      RETURN;
   END IF;
   CLOSE APBCONS_ATYP_CURSOR ;
--
-- Check for preferred address.
--
  IF ATYP_CODE_PREF = :SPRADDR.SPRADDR_ATYP_CODE THEN
    :SPRADDR.PREFERRED_ADDR := 'Y';
    :PREFERRED_RECORD_NUMBER := TO_NUMBER(:SYSTEM.TRIGGER_RECORD) ;
  END IF;
--
-- Check for preferred region.
--
  IF ATYP_CODE_GEOR = :SPRADDR.SPRADDR_ATYP_CODE THEN
    :SPRADDR.PREFERRED_REGION := 'Y';
  END IF;
--
-- Check for combined mailing.
--
  IF ATYP_CODE_CM = :SPRADDR.SPRADDR_ATYP_CODE THEN
    :SPRADDR.COMBINED_MAILING := 'Y' ;
  END IF;
--
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.SET_CHECK_BOXES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_CHECK_BOXES")
		public void spraddr_SetCheckBoxes()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlapbconsAtypCursor = "SELECT APBCONS_ATYP_CODE_PREF, APBCONS_ATYP_CODE_CM, APBCONS_ATYP_CODE_GEOR " +
	" FROM APBCONS " +
	" WHERE APBCONS_PIDM = :PIDM ";
					DataCursor apbconsAtypCursor = new DataCursor(sqlapbconsAtypCursor);
					String sqlempDetailsCursor = "SELECT 'X' " +
	" FROM APREHIS " +
	" WHERE APREHIS_PIDM = :PIDM AND APREHIS_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND APREHIS_ATYP_SEQNO = :SPRADDR_SPRADDR_SEQNO ";
					DataCursor empDetailsCursor = new DataCursor(sqlempDetailsCursor);
					String sqlaoborgnAtypCursor = "SELECT AOBORGN_PREF_ATYP_CODE, AOBORGN_PREF_ATYP_SEQNO " +
	" FROM AOBORGN " +
	" WHERE AOBORGN_PIDM = :PIDM ";
					DataCursor aoborgnAtypCursor = new DataCursor(sqlaoborgnAtypCursor);
					NString atypCodePref= NString.getNull();
					NString atypCodeGeor= NString.getNull();
					NString atypCodeCm= NString.getNull();
					NString empDetExists= NString.getNull();
					NNumber atypSeqnoPref= NNumber.getNull();
					try {
						spraddrElement.setPreferredAddr(toStr("N"));
						spraddrElement.setPreferredRegion(toStr("N"));
						spraddrElement.setCombinedMailing(toStr("N"));
						spraddrElement.setEmploymentDetails(toStr("N"));
						// 
						//  Get AOBORGN Record
						// 
						//Setting query parameters
						aoborgnAtypCursor.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable aoborgnAtypCursor.
						aoborgnAtypCursor.open();
						ResultSet aoborgnAtypCursorResults = aoborgnAtypCursor.fetchInto();
						if ( aoborgnAtypCursorResults != null ) {
							atypCodePref = aoborgnAtypCursorResults.getStr(0);
							atypSeqnoPref = aoborgnAtypCursorResults.getNumber(1);
						}
						if ( aoborgnAtypCursor.notFound() )
						{
						}
						else {
							if ( atypCodePref.equals(spraddrElement.getSpraddrAtypCode()) && atypSeqnoPref.equals(spraddrElement.getSpraddrSeqno()) )
							{
								spraddrElement.setPreferredAddr(toStr("Y"));
								getFormModel().getKeyBlock().setPreferredRecordNumber(toNumber(getTriggerRecord()));
							}
						}
						aoborgnAtypCursor.close();
						// 
						//  Get APREHIS Record and check for employment details
						// 
						//Setting query parameters
						empDetailsCursor.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
						empDetailsCursor.addParameter("SPRADDR_SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
						empDetailsCursor.addParameter("SPRADDR_SPRADDR_SEQNO", spraddrElement.getSpraddrSeqno());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable empDetailsCursor.
						empDetailsCursor.open();
						ResultSet empDetailsCursorResults = empDetailsCursor.fetchInto();
						if ( empDetailsCursorResults != null ) {
							empDetExists = empDetailsCursorResults.getStr(0);
						}
						if ( empDetailsCursor.found() )
						{
							spraddrElement.setEmploymentDetails(toStr("Y"));
						}
						empDetailsCursor.close();
						//   
						if ( spraddrElement.getSpraddrStatusInd().equals("I") )
						{
							return ;
						}
						// 
						//  If both are null.
						// 
						if ((spraddrElement.getSpraddrToDate().isNull() && spraddrElement.getSpraddrFromDate().isNull()))
						{
						}
						else {
							// 
							//  If both are not null.
							// 
							if ( getTask().getGoqrpls().gNchk(!spraddrElement.getSpraddrToDate().isNull() && !spraddrElement.getSpraddrFromDate().isNull()).getValue() )
							{
								if ((between(trunc(NDate.getNow()), trunc(spraddrElement.getSpraddrFromDate()), trunc(spraddrElement.getSpraddrToDate()))))
								{
								}
								else {
									return ;
								}
							}
							else {
								if ((spraddrElement.getSpraddrFromDate().isNull()))
								{
									if ((spraddrElement.getSpraddrToDate().isNull()))
									{
										return ;
									}
									else {
										if ( getTask().getGoqrpls().gNchk(((trunc(NDate.getNow()).greater(trunc(spraddrElement.getSpraddrToDate()))))).getValue() )
										{
											return ;
										}
									}
								}
								else {
									if ((trunc(NDate.getNow()).greaterOrEquals(trunc(spraddrElement.getSpraddrFromDate()))))
									{
									}
									else {
										return ;
									}
								}
							}
						}
						// 
						//  Get APBCONS Record
						// 
						//Setting query parameters
						apbconsAtypCursor.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable apbconsAtypCursor.
						apbconsAtypCursor.open();
						ResultSet apbconsAtypCursorResults = apbconsAtypCursor.fetchInto();
						if ( apbconsAtypCursorResults != null ) {
							atypCodePref = apbconsAtypCursorResults.getStr(0);
							atypCodeCm = apbconsAtypCursorResults.getStr(1);
							atypCodeGeor = apbconsAtypCursorResults.getStr(2);
						}
						if ( apbconsAtypCursor.notFound() )
						{
							apbconsAtypCursor.close();
							return ;
						}
						apbconsAtypCursor.close();
						// 
						//  Check for preferred address.
						// 
						if ( atypCodePref.equals(spraddrElement.getSpraddrAtypCode()) )
						{
							spraddrElement.setPreferredAddr(toStr("Y"));
							getFormModel().getKeyBlock().setPreferredRecordNumber(toNumber(getTriggerRecord()));
						}
						// 
						//  Check for preferred region.
						// 
						if ( atypCodeGeor.equals(spraddrElement.getSpraddrAtypCode()) )
						{
							spraddrElement.setPreferredRegion(toStr("Y"));
						}
						// 
						//  Check for combined mailing.
						// 
						if ( atypCodeCm.equals(spraddrElement.getSpraddrAtypCode()) )
						{
							spraddrElement.setCombinedMailing(toStr("Y"));
						}
					}
					finally{
						aoborgnAtypCursor.close();
						empDetailsCursor.close();
						apbconsAtypCursor.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.SET_FINANCE_DATES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_FINANCE_DATES")
		public void spraddr_SetFinanceDates()
		{
			
			getGoqclibSpraddrController().spraddr_SetFinanceDates();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.SET_FINANCE_RULES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_FINANCE_RULES")
		public void spraddr_SetFinanceRules()
		{
			
			getGoqclibSpraddrController().spraddr_SetFinanceRules();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.SHOW_PHONES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SHOW_PHONES")
		public void spraddr_ShowPhones()
		{
			
			getGoqclibSpraddrController().spraddr_ShowPhones();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.UPDATE_PHONE_STATUS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="UPDATE_PHONE_STATUS")
		public void spraddr_UpdatePhoneStatus()
		{
			
			getGoqclibSpraddrController().spraddr_UpdatePhoneStatus();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.UPDATE_SPRTELE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="UPDATE_SPRTELE")
		public void spraddr_UpdateSprtele()
		{
			
			getGoqclibSpraddrController().spraddr_UpdateSprtele();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.WHEN-NEW-RECORD-INSTANCE
		 IF :SPRADDR.ROWID is NULL THEN
	RETURN;
END IF;
EXECUTE_TRIGGER('SET_CHECK_BOXES');
IF :PREFERRED_RECORD_NUMBER IS NOT NULL THEN	  
    GO_RECORD( :PREFERRED_RECORD_NUMBER );
   :PREFERRED_RECORD_NUMBER := '';
END IF;
-- 
-- PLU-LWS Added to check household record count.
-- Formerly, this was attached to post_query, post_update, post_insert triggers...
   EXECUTE_TRIGGER( 'CHECK_HOUSEHOLD_INFO' );

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

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@After
		public void spraddr_recordChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
				if ( spraddrElement.getRowState().equals(DataRowStatus.INSERTED) )
				{
					return ;
				}
				executeAction("SET_CHECK_BOXES");
				if ( !getFormModel().getKeyBlock().getPreferredRecordNumber().isNull() )
				{
					setCurrentRecord(getFormModel().getKeyBlock().getPreferredRecordNumber());
					getFormModel().getKeyBlock().setPreferredRecordNumber(toNumber(""));
				}
				//  
				//  PLU-LWS Added to check household record count.
				//  Formerly, this was attached to post_query, post_update, post_insert triggers...
				executeAction("CHECK_HOUSEHOLD_INFO");
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.CHECK_PREF_ADDR
		    DECLARE
   	ATYP_COUNT  NUMBER(4);
      CURSOR PTI_CURSOR IS
         SELECT COUNT(SPRADDR_ATYP_CODE)
         FROM   SPRADDR
         WHERE  SPRADDR_PIDM = :SPRADDR_PIDM
           AND  SPRADDR_ATYP_CODE = :SPRADDR_ATYP_CODE ;

   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :ATYP_COUNT ;
   END ;
--
   << PREFERRED_COMBINED >>
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   APBCONS
         WHERE  APBCONS_PIDM = :SPRADDR_PIDM
           AND  APBCONS_ATYP_CODE_PREF IS NOT NULL
           AND  APBCONS_ATYP_CODE_PREF = :SPRADDR_ATYP_CODE
           AND  APBCONS_ATYP_CODE_CM IS NOT NULL
           AND  APBCONS_ATYP_CODE_CM = :SPRADDR_ATYP_CODE
           AND  APBCONS_ATYP_CODE_GEOR IS NOT NULL
           AND  APBCONS_ATYP_CODE_GEOR = :SPRADDR_ATYP_CODE
-- Begin CMS-DFCT103828
           AND  TRUNC(SYSDATE) BETWEEN TRUNC(NVL(:SPRADDR_FROM_DATE, SYSDATE)) 
                                   AND TRUNC(NVL(:SPRADDR_TO_DATE, SYSDATE)) 
-- End CMS-DFCT103828
-- Begin CMS-DFCT104233
           AND  :ATYP_COUNT = 1;
-- End CMS-DFCT104233
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO CHECK_PREFERRED ;
      ELSE
         GOTO PREF_COMB_ERROR ;
      END IF ;
   END ;
--
   << CHECK_PREFERRED >>
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   APBCONS
         WHERE  APBCONS_PIDM = :SPRADDR_PIDM
           AND  APBCONS_ATYP_CODE_PREF IS NOT NULL
           AND  APBCONS_ATYP_CODE_PREF = :SPRADDR_ATYP_CODE
           AND  TRUNC(SYSDATE) BETWEEN NVL(:SPRADDR_FROM_DATE,
              SYSDATE) AND NVL(:SPRADDR_TO_DATE, SYSDATE)
           AND  :SPRADDR_STATUS_IND IS NULL ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO CHECK_COMBINED ;
      ELSE
         GOTO PREFERRED_ERROR ;
      END IF ;
   END ;
--
   << CHECK_COMBINED >>
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   APBCONS
         WHERE  APBCONS_PIDM = :SPRADDR_PIDM
           AND  APBCONS_ATYP_CODE_CM IS NOT NULL
           AND  APBCONS_ATYP_CODE_CM = :SPRADDR_ATYP_CODE
           AND  TRUNC(SYSDATE) BETWEEN NVL(:SPRADDR_FROM_DATE,
              SYSDATE) AND NVL(:SPRADDR_TO_DATE, SYSDATE)
           AND  :SPRADDR_STATUS_IND IS NULL ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO CHECK_GEOR ;
      ELSE
         GOTO COMBINED_ERROR ;
      END IF ;
   END ;
--
   << CHECK_GEOR >>
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   APBCONS
         WHERE  APBCONS_PIDM = :SPRADDR_PIDM
           AND  APBCONS_ATYP_CODE_GEOR IS NOT NULL
           AND  APBCONS_ATYP_CODE_GEOR = :SPRADDR_ATYP_CODE
           AND  TRUNC(SYSDATE) BETWEEN NVL(:SPRADDR_FROM_DATE,
              SYSDATE) AND NVL(:SPRADDR_TO_DATE, SYSDATE)
           AND  :SPRADDR_STATUS_IND IS NULL ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      IF PTI_CURSOR%NOTFOUND THEN
         GOTO CHECK_COUNT ;
      ELSE
         GOTO GEOR_ERROR ;
      END IF ;
   END ;
--
   << CHECK_COUNT >>
   DECLARE
         PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR APBCONS_CURSOR IS
         SELECT 'X'
         FROM   APBCONS
         WHERE  APBCONS_PIDM = :SPRADDR_PIDM
           AND  (APBCONS_ATYP_CODE_PREF = :SPRADDR_ATYP_CODE
            OR  APBCONS_ATYP_CODE_CM = :SPRADDR_ATYP_CODE
            OR  APBCONS_ATYP_CODE_GEOR = :SPRADDR_ATYP_CODE)
           AND  :ATYP_COUNT = 1 ;
   BEGIN
      OPEN APBCONS_CURSOR ;
      FETCH APBCONS_CURSOR INTO PTI_INTO_TEMP ;
      IF APBCONS_CURSOR%NOTFOUND THEN
         RETURN ;
      ELSE
         GOTO COUNT_OF_1 ;
      END IF ;
   END ;

--
   << PREF_COMB_ERROR >>
   MESSAGE( g$_nls.get('APAIDEN-0044','FORM',
           '*ERROR* Preferred/Combined/Geor Address from Constituent Form, cannot delete.' )) ;
   RAISE FORM_TRIGGER_FAILURE ;
--
   << COMBINED_ERROR >>
   MESSAGE( g$_nls.get('APAIDEN-0045','FORM',
-- Error msg changed 11/29/94 log # 90 of system test. FHL
          '*ERROR* Combined address from Constituent Name Form (APANAME), cannot delete.')) ;
   RAISE FORM_TRIGGER_FAILURE ;
--
   << GEOR_ERROR >>
   MESSAGE( g$_nls.get('APAIDEN-0046','FORM',
           '*ERROR* Geographic region address from Constituent Info Form (APACONS), cannot delete.') ) ;
   RAISE FORM_TRIGGER_FAILURE ;
--
   << PREFERRED_ERROR >>
   MESSAGE( g$_nls.get('APAIDEN-0047','FORM',
            '*ERROR* Preferred address from Constituent Info Form (APACONS), cannot delete.' )) ;
   RAISE FORM_TRIGGER_FAILURE ;
--
   << COUNT_OF_1 >>
   MESSAGE(g$_nls.get('APAIDEN-0048','FORM',
          '*ERROR* Unable to delete address; no others exists for address type.') ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_PREF_ADDR
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PREF_ADDR")
		public void spraddr_CheckPrefAddr()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				int rowCount = 0;
				{
					NNumber atypCount= NNumber.getNull();
					String sqlptiCursor = "SELECT COUNT(SPRADDR_ATYP_CODE) " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :SPRADDR_PIDM AND SPRADDR_ATYP_CODE = :SPRADDR_ATYP_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
						ptiCursor.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getKeyBlock().setAtypCount(ptiCursorResults.getNumber(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				 //PREFERRED_COMBINED:;
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM APBCONS " +
	" WHERE APBCONS_PIDM = :SPRADDR_PIDM AND APBCONS_ATYP_CODE_PREF IS NOT NULL AND APBCONS_ATYP_CODE_PREF = :SPRADDR_ATYP_CODE AND APBCONS_ATYP_CODE_CM IS NOT NULL AND APBCONS_ATYP_CODE_CM = :SPRADDR_ATYP_CODE AND APBCONS_ATYP_CODE_GEOR IS NOT NULL AND APBCONS_ATYP_CODE_GEOR = :SPRADDR_ATYP_CODE AND TRUNC(TO_DATE(SYSDATE)) BETWEEN TRUNC(NVL(TO_DATE(:SPRADDR_FROM_DATE), TO_DATE(SYSDATE))) AND TRUNC(NVL(TO_DATE(:SPRADDR_TO_DATE), TO_DATE(SYSDATE))) AND :ATYP_COUNT = 1 ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
						ptiCursor.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
						ptiCursor.addParameter("SPRADDR_FROM_DATE", spraddrElement.getSpraddrFromDate());
						ptiCursor.addParameter("SPRADDR_TO_DATE", spraddrElement.getSpraddrToDate());
						ptiCursor.addParameter("ATYP_COUNT", getFormModel().getKeyBlock().getAtypCount());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						if ( ptiCursor.notFound() )
						{
//							 goto CHECK_PREFERRED;
//							 CHECK_PREFERRED:;
							{
								NString ptiIntoTemp1= NString.getNull();
								String sqlptiCursor1 = "SELECT 'X' " +
				" FROM APBCONS " +
				" WHERE APBCONS_PIDM = :SPRADDR_PIDM AND APBCONS_ATYP_CODE_PREF IS NOT NULL AND APBCONS_ATYP_CODE_PREF = :SPRADDR_ATYP_CODE AND TRUNC(TO_DATE(SYSDATE)) BETWEEN NVL(TO_DATE(:SPRADDR_FROM_DATE), TO_DATE(SYSDATE)) AND NVL(TO_DATE(:SPRADDR_TO_DATE), TO_DATE(SYSDATE)) AND :SPRADDR_STATUS_IND IS NULL ";
								DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
								try {
									//Setting query parameters
									ptiCursor1.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
									ptiCursor1.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
									ptiCursor1.addParameter("SPRADDR_FROM_DATE", spraddrElement.getSpraddrFromDate());
									ptiCursor1.addParameter("SPRADDR_TO_DATE", spraddrElement.getSpraddrToDate());
									ptiCursor1.addParameter("SPRADDR_STATUS_IND", spraddrElement.getSpraddrStatusInd());
									//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
									ptiCursor1.open();
									ResultSet ptiCursorResults1 = ptiCursor1.fetchInto();
									if ( ptiCursorResults1 != null ) {
										ptiIntoTemp1 = ptiCursorResults1.getStr(0);
									}
									if ( ptiCursor1.notFound() )
									{
//										 goto CHECK_COMBINED;
//										 CHECK_COMBINED:;
										{
											NString ptiIntoTemp2= NString.getNull();
											String sqlptiCursor2 = "SELECT 'X' " +
										" FROM APBCONS " +
										" WHERE APBCONS_PIDM = :SPRADDR_PIDM AND APBCONS_ATYP_CODE_CM IS NOT NULL AND APBCONS_ATYP_CODE_CM = :SPRADDR_ATYP_CODE AND TRUNC(TO_DATE(SYSDATE)) BETWEEN NVL(TO_DATE(:SPRADDR_FROM_DATE), TO_DATE(SYSDATE)) AND NVL(TO_DATE(:SPRADDR_TO_DATE), TO_DATE(SYSDATE)) AND :SPRADDR_STATUS_IND IS NULL ";
										DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
										try {
											//Setting query parameters
											ptiCursor2.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
											ptiCursor2.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
											ptiCursor2.addParameter("SPRADDR_FROM_DATE", spraddrElement.getSpraddrFromDate());
											ptiCursor2.addParameter("SPRADDR_TO_DATE", spraddrElement.getSpraddrToDate());
											ptiCursor2.addParameter("SPRADDR_STATUS_IND", spraddrElement.getSpraddrStatusInd());
											//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
											ptiCursor2.open();
											ResultSet ptiCursorResults2 = ptiCursor2.fetchInto();
											if ( ptiCursorResults2 != null ) {
												ptiIntoTemp2 = ptiCursorResults2.getStr(0);
											}
											if ( ptiCursor2.notFound() )
											{
//												 goto CHECK_GEOR;
//												 CHECK_GEOR:;
												{
													NString ptiIntoTemp3= NString.getNull();
													String sqlptiCursor3 = "SELECT 'X' " +
									" FROM APBCONS " +
									" WHERE APBCONS_PIDM = :SPRADDR_PIDM AND APBCONS_ATYP_CODE_GEOR IS NOT NULL AND APBCONS_ATYP_CODE_GEOR = :SPRADDR_ATYP_CODE AND TRUNC(TO_DATE(SYSDATE)) BETWEEN NVL(TO_DATE(:SPRADDR_FROM_DATE), TO_DATE(SYSDATE)) AND NVL(TO_DATE(:SPRADDR_TO_DATE), TO_DATE(SYSDATE)) AND :SPRADDR_STATUS_IND IS NULL ";
													DataCursor ptiCursor3 = new DataCursor(sqlptiCursor3);
													try {
														//Setting query parameters
														ptiCursor3.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
														ptiCursor3.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
														ptiCursor3.addParameter("SPRADDR_FROM_DATE", spraddrElement.getSpraddrFromDate());
														ptiCursor3.addParameter("SPRADDR_TO_DATE", spraddrElement.getSpraddrToDate());
														ptiCursor3.addParameter("SPRADDR_STATUS_IND", spraddrElement.getSpraddrStatusInd());
														//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
														ptiCursor3.open();
														ResultSet ptiCursorResults3 = ptiCursor3.fetchInto();
														if ( ptiCursorResults3 != null ) {
															ptiIntoTemp3 = ptiCursorResults3.getStr(0);
														}
														if ( ptiCursor3.notFound() )
														{
//															 goto CHECK_COUNT;
//															 CHECK_COUNT:;
															{
																NString ptiIntoTemp4= NString.getNull();
																String sqlapbconsCursor = "SELECT 'X' " +
												" FROM APBCONS " +
												" WHERE APBCONS_PIDM = :SPRADDR_PIDM AND (APBCONS_ATYP_CODE_PREF = :SPRADDR_ATYP_CODE OR APBCONS_ATYP_CODE_CM = :SPRADDR_ATYP_CODE OR APBCONS_ATYP_CODE_GEOR = :SPRADDR_ATYP_CODE) AND :ATYP_COUNT = 1 ";
																DataCursor apbconsCursor = new DataCursor(sqlapbconsCursor);
																try {
																	//Setting query parameters
																	apbconsCursor.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
																	apbconsCursor.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
																	apbconsCursor.addParameter("ATYP_COUNT", getFormModel().getKeyBlock().getAtypCount());
																	//F2J_WARNING : Make sure that the method "Close" is being called over the variable apbconsCursor.
																	apbconsCursor.open();
																	ResultSet apbconsCursorResults = apbconsCursor.fetchInto();
																	if ( apbconsCursorResults != null ) {
																		ptiIntoTemp4 = apbconsCursorResults.getStr(0);
																	}
																	if ( apbconsCursor.notFound() )
																	{
																		return ;
																	}
																	else {
																		//goto COUNT_OF_1;
																		//COUNT_OF_1:;
																		errorMessage(GNls.Fget(toStr("APAIDEN-0048"), toStr("FORM"), toStr("*ERROR* Unable to delete address; no others exists for address type.")));
																		throw new ApplicationException();
																	}
																}
																finally{
																	apbconsCursor.close();
																}
															}
														}
														else {
//																goto GEOR_ERROR;
//																GEOR_ERROR:;
															errorMessage(GNls.Fget(toStr("APAIDEN-0046"), toStr("FORM"), toStr("*ERROR* Geographic region address from Constituent Info Form (APACONS), cannot delete.")));
															throw new ApplicationException();
														}
													}
													finally{
														ptiCursor.close();
													}
												}
											}
											else {
												//goto COMBINED_ERROR;
												//COMBINED_ERROR:;
												errorMessage(GNls.Fget(toStr("APAIDEN-0045"), toStr("FORM"), toStr("*ERROR* Combined address from Constituent Name Form (APANAME), cannot delete.")));
													throw new ApplicationException();
												}
											}
											finally{
												ptiCursor.close();
											}
										}
									}
									else {
										//goto PREFERRED_ERROR;
										//PREFERRED_ERROR:;
										errorMessage(GNls.Fget(toStr("APAIDEN-0047"), toStr("FORM"), toStr("*ERROR* Preferred address from Constituent Info Form (APACONS), cannot delete.")));
										throw new ApplicationException();
									}
								}
								finally{
									ptiCursor.close();
								}
							}
						}
						else {
							//goto PREF_COMB_ERROR;
							//PREF_COMB_ERROR:;
							errorMessage(GNls.Fget(toStr("APAIDEN-0044"), toStr("FORM"), toStr("*ERROR* Preferred/Combined/Geor Address from Constituent Form, cannot delete.")));
							throw new ApplicationException();
						}
					}
					finally{
						ptiCursor.close();
					}
				}
//				 CHECK_PREFERRED:;
//				{
//					NString ptiIntoTemp= NString.getNull();
//					String sqlptiCursor = "SELECT 'X' " +
//	" FROM APBCONS " +
//	" WHERE APBCONS_PIDM = :SPRADDR_PIDM AND APBCONS_ATYP_CODE_PREF IS NOT NULL AND APBCONS_ATYP_CODE_PREF = :SPRADDR_ATYP_CODE AND TRUNC(SYSDATE) BETWEEN NVL(:SPRADDR_FROM_DATE, SYSDATE) AND NVL(:SPRADDR_TO_DATE, SYSDATE) AND :SPRADDR_STATUS_IND IS NULL ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					try {
//						//Setting query parameters
//						ptiCursor.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
//						ptiCursor.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
//						ptiCursor.addParameter("SPRADDR_FROM_DATE", spraddrElement.getSpraddrFromDate());
//						ptiCursor.addParameter("SPRADDR_TO_DATE", spraddrElement.getSpraddrToDate());
//						ptiCursor.addParameter("SPRADDR_STATUS_IND", spraddrElement.getSpraddrStatusInd());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//						ptiCursor.open();
//						ResultSet ptiCursorResults = ptiCursor.fetchInto();
//						if ( ptiCursorResults != null ) {
//							ptiIntoTemp = ptiCursorResults.getStr(0);
//						}
//						if ( ptiCursor.notFound() )
//						{
//							 goto CHECK_COMBINED;
//						}
//						else {
//							//goto PREFERRED_ERROR;
//							//PREFERRED_ERROR:;
//							errorMessage(GNls.Fget(toStr("APAIDEN-0047"), toStr("FORM"), toStr("*ERROR* Preferred address from Constituent Info Form (APACONS), cannot delete.")));
//							throw new ApplicationException();
//						}
//					}
//					finally{
//						ptiCursor.close();
//					}
//				}
//				 CHECK_COMBINED:;
//				{
//					NString ptiIntoTemp= NString.getNull();
//					String sqlptiCursor = "SELECT 'X' " +
//	" FROM APBCONS " +
//	" WHERE APBCONS_PIDM = :SPRADDR_PIDM AND APBCONS_ATYP_CODE_CM IS NOT NULL AND APBCONS_ATYP_CODE_CM = :SPRADDR_ATYP_CODE AND TRUNC(SYSDATE) BETWEEN NVL(:SPRADDR_FROM_DATE, SYSDATE) AND NVL(:SPRADDR_TO_DATE, SYSDATE) AND :SPRADDR_STATUS_IND IS NULL ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					try {
//						//Setting query parameters
//						ptiCursor.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
//						ptiCursor.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
//						ptiCursor.addParameter("SPRADDR_FROM_DATE", spraddrElement.getSpraddrFromDate());
//						ptiCursor.addParameter("SPRADDR_TO_DATE", spraddrElement.getSpraddrToDate());
//						ptiCursor.addParameter("SPRADDR_STATUS_IND", spraddrElement.getSpraddrStatusInd());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//						ptiCursor.open();
//						ResultSet ptiCursorResults = ptiCursor.fetchInto();
//						if ( ptiCursorResults != null ) {
//							ptiIntoTemp = ptiCursorResults.getStr(0);
//						}
//						if ( ptiCursor.notFound() )
//						{
//							 goto CHECK_GEOR;
//						}
//						else {
//							//goto COMBINED_ERROR;
//							//COMBINED_ERROR:;
//							errorMessage(GNls.Fget(toStr("APAIDEN-0045"), toStr("FORM"), toStr("*ERROR* Combined address from Constituent Name Form (APANAME), cannot delete.")));
//							throw new ApplicationException();
//						}
//					}
//					finally{
//						ptiCursor.close();
//					}
//				}
//				 CHECK_GEOR:;
//				{
//					NString ptiIntoTemp= NString.getNull();
//					String sqlptiCursor = "SELECT 'X' " +
//	" FROM APBCONS " +
//	" WHERE APBCONS_PIDM = :SPRADDR_PIDM AND APBCONS_ATYP_CODE_GEOR IS NOT NULL AND APBCONS_ATYP_CODE_GEOR = :SPRADDR_ATYP_CODE AND TRUNC(SYSDATE) BETWEEN NVL(:SPRADDR_FROM_DATE, SYSDATE) AND NVL(:SPRADDR_TO_DATE, SYSDATE) AND :SPRADDR_STATUS_IND IS NULL ";
//					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
//					try {
//						//Setting query parameters
//						ptiCursor.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
//						ptiCursor.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
//						ptiCursor.addParameter("SPRADDR_FROM_DATE", spraddrElement.getSpraddrFromDate());
//						ptiCursor.addParameter("SPRADDR_TO_DATE", spraddrElement.getSpraddrToDate());
//						ptiCursor.addParameter("SPRADDR_STATUS_IND", spraddrElement.getSpraddrStatusInd());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
//						ptiCursor.open();
//						ResultSet ptiCursorResults = ptiCursor.fetchInto();
//						if ( ptiCursorResults != null ) {
//							ptiIntoTemp = ptiCursorResults.getStr(0);
//						}
//						if ( ptiCursor.notFound() )
//						{
//							 goto CHECK_COUNT;
//						}
//						else {
////							goto GEOR_ERROR;
////							GEOR_ERROR:;
//							errorMessage(GNls.Fget(toStr("APAIDEN-0046"), toStr("FORM"), toStr("*ERROR* Geographic region address from Constituent Info Form (APACONS), cannot delete.")));
//							throw new ApplicationException();
//						}
//					}
//					finally{
//						ptiCursor.close();
//					}
//				}
//				 CHECK_COUNT:;
//				{
//					NString ptiIntoTemp= NString.getNull();
//					String sqlapbconsCursor = "SELECT 'X' " +
//	" FROM APBCONS " +
//	" WHERE APBCONS_PIDM = :SPRADDR_PIDM AND (APBCONS_ATYP_CODE_PREF = :SPRADDR_ATYP_CODE OR APBCONS_ATYP_CODE_CM = :SPRADDR_ATYP_CODE OR APBCONS_ATYP_CODE_GEOR = :SPRADDR_ATYP_CODE) AND :ATYP_COUNT = 1 ";
//					DataCursor apbconsCursor = new DataCursor(sqlapbconsCursor);
//					try {
//						//Setting query parameters
//						apbconsCursor.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
//						apbconsCursor.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
//						apbconsCursor.addParameter("ATYP_COUNT", getFormModel().getKeyBlock().getAtypCount());
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable apbconsCursor.
//						apbconsCursor.open();
//						ResultSet apbconsCursorResults = apbconsCursor.fetchInto();
//						if ( apbconsCursorResults != null ) {
//							ptiIntoTemp = apbconsCursorResults.getStr(0);
//						}
//						if ( apbconsCursor.notFound() )
//						{
//							return ;
//						}
//						else {
//							//goto COUNT_OF_1;
//							//COUNT_OF_1:;
//							errorMessage(GNls.Fget(toStr("APAIDEN-0048"), toStr("FORM"), toStr("*ERROR* Unable to delete address; no others exists for address type.")));
//							throw new ApplicationException();
//						}
//					}
//					finally{
//						apbconsCursor.close();
//					}
//				}
//				 PREF_COMB_ERROR:;
//				errorMessage(GNls.Fget(toStr("APAIDEN-0044"), toStr("FORM"), toStr("*ERROR* Preferred/Combined/Geor Address from Constituent Form, cannot delete.")));
//				throw new ApplicationException();
//				 COMBINED_ERROR:;
//				errorMessage(GNls.Fget(toStr("APAIDEN-0045"), toStr("FORM"), toStr("*ERROR* Combined address from Constituent Name Form (APANAME), cannot delete.")));
//				throw new ApplicationException();
//				 GEOR_ERROR:;
//				errorMessage(GNls.Fget(toStr("APAIDEN-0046"), toStr("FORM"), toStr("*ERROR* Geographic region address from Constituent Info Form (APACONS), cannot delete.")));
//				throw new ApplicationException();
//				 PREFERRED_ERROR:;
//				errorMessage(GNls.Fget(toStr("APAIDEN-0047"), toStr("FORM"), toStr("*ERROR* Preferred address from Constituent Info Form (APACONS), cannot delete.")));
//				throw new ApplicationException();
//				 COUNT_OF_1:;
//				errorMessage(GNls.Fget(toStr("APAIDEN-0048"), toStr("FORM"), toStr("*ERROR* Unable to delete address; no others exists for address type.")));
//				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.CHECK_HOUSEHOLD_INFO
		 DECLARE
	  tab_topmost VARCHAR2(30) := GET_CANVAS_PROPERTY('G$_IDEN_TAB_CANVAS',TOPMOST_TAB_PAGE);
BEGIN
   -- PLU-LWS Added update to house count field.   
   SYNCHRONIZE;
   :APTADDR_HEADER.HOUSEHOLD_COUNT := aokhhld.f_household_count(:KEY_BLOCK.PIDM);
   IF :APTADDR_HEADER.HOUSEHOLD_COUNT > 0 THEN
   	   SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, g$_nls.get('APAIDEN-0049','FORM','Household Members (%01%)',
   	                         :APTADDR_HEADER.HOUSEHOLD_COUNT ));
   	   IF tab_topmost = 'ADDRESS_TAB' OR 
-- Begin 1-3YZHFH   	   	
   	   	  tab_topmost = 'HOUSEHOLD_TAB' OR
   	   	  :system.current_block = 'SPRADDR' THEN
-- End 1-3YZHFH   	   	
   	      IF GET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB',ENABLED) = 'FALSE' THEN
   	   	       SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB',ENABLED,PROPERTY_ON) ;
   	      END IF;
   	   ELSE
   	      IF GET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB',ENABLED) = 'TRUE' THEN
   	   	       SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB',ENABLED,PROPERTY_OFF) ;
   	      END IF;
   	   END IF;
   ELSE
   	   SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB', LABEL, g$_nls.get('APAIDEN-0050','FORM','Household Members'));
   	   IF tab_topmost <> 'HOUSEHOLD_TAB' THEN
   	      IF GET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB',ENABLED) = 'TRUE' THEN
   	   	       SET_TAB_PAGE_PROPERTY('HOUSEHOLD_TAB',ENABLED,PROPERTY_OFF) ;
   	      END IF;
   	   END IF;
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_HOUSEHOLD_INFO
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_HOUSEHOLD_INFO")
		public void spraddr_CheckHouseholdInfo()
		{
			
				{
					NString tabTopmost = getCanvasTopMostTabPage("G$_IDEN_TAB_CANVAS");
					//  PLU-LWS Added update to house count field.   
					// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\APAIDENF2NMigrationGuide.xml#ExcludeSynchronize".
					//					SupportClasses.SQLFORMS.Synchronize();
					this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\APAIDENF2NMigrationGuide.xml#ExcludeSynchronize'.");
					
					
					getFormModel().getAptaddrHeader().setHouseholdCount(toStr(Aokhhld.fHouseholdCount(getFormModel().getKeyBlock().getPidm())));
					if ( toNumber(getFormModel().getAptaddrHeader().getHouseholdCount()).greater(0) )
					{
						setTabPageLabel("HOUSEHOLD_TAB", GNls.Fget(toStr("APAIDEN-0049"), toStr("FORM"), toStr("Household Members (%01%)"), getFormModel().getAptaddrHeader().getHouseholdCount()));
						if ( tabTopmost.equals("ADDRESS_TAB") || tabTopmost.equals("HOUSEHOLD_TAB") || getCurrentBlock().equals("SPRADDR") )
						{
							//  End 1-3YZHFH   	   	
							if ( toStr(getTabPageEnabled("HOUSEHOLD_TAB")).equals("FALSE") )
							{
								setTabPageEnabled("HOUSEHOLD_TAB", true);
							}
						}
						else {
							if ( toStr(getTabPageEnabled("HOUSEHOLD_TAB")).equals("TRUE") )
							{
								setTabPageEnabled("HOUSEHOLD_TAB", false);
							}
						}
					}
					else {
						setTabPageLabel("HOUSEHOLD_TAB", GNls.Fget(toStr("APAIDEN-0050"), toStr("FORM"), toStr("Household Members")));
						if ( tabTopmost.notEquals("HOUSEHOLD_TAB") )
						{
							if ( toStr(getTabPageEnabled("HOUSEHOLD_TAB")).equals("TRUE") )
							{
								setTabPageEnabled("HOUSEHOLD_TAB", false);
							}
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-CQUERY
		 -- PLU-LWS 02/02/2005
EXECUTE_TRIGGER('SHOW_HOUSEHOLD');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void spraddr_TotalResults()
		{
			
				//  PLU-LWS 02/02/2005
				//  PLU-LWS 02/02/2005
				executeAction("SHOW_HOUSEHOLD");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.SHOW_HOUSEHOLD
		 BEGIN
--		
	    EXECUTE_TRIGGER('MNU_OPT_SHOW_HOUSEHOLD');
      G$_CHECK_FAILURE;
      IF FORM_SUCCESS THEN
      	 GO_BLOCK('APTADDR');
  	  END IF;
--
      :SYSTEM.MESSAGE_LEVEL := '5';
      EXECUTE_QUERY;
      :SYSTEM.MESSAGE_LEVEL := '0';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.SHOW_HOUSEHOLD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SHOW_HOUSEHOLD")
		public void spraddr_ShowHousehold()
		{
			
				//
			try{
				executeAction("MNU_OPT_SHOW_HOUSEHOLD");
				getTask().getGoqrpls().gCheckFailure();
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				executeQuery();
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			}catch(Exception e){
				goBlock(toStr("APTADDR"));
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
				executeQuery();
				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
				
			}
//				executeAction("MNU_OPT_SHOW_HOUSEHOLD");
//				getTask().getGoqrpls().gCheckFailure();
//				if ( SupportClasses.SQLFORMS.FormSuccess().getValue() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					goBlock(toStr("APTADDR"));
//				}
//				// 
//				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
//				executeQuery();
//				// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
//				MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.POST-BLOCK
		 BEGIN
  EXECUTE_TRIGGER('DISABLE_HOUSEHOLD_TAB');
--  EXECUTE_TRIGGER( 'CHECK_HOUSEHOLD_INFO' );
  G$_CHECK_FAILURE;
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
			
				executeAction("DISABLE_HOUSEHOLD_TAB");
				//   EXECUTE_TRIGGER( 'CHECK_HOUSEHOLD_INFO' );
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY_NXTBLOCK_TRG
		       EXECUTE_TRIGGER('DISABLE_HOUSEHOLD_TAB');
      G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY_NXTBLOCK_TRG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY_NXTBLOCK_TRG")
		@After
		public void spraddr_KeyNxtblockTrg()
		{
			
				executeAction("DISABLE_HOUSEHOLD_TAB");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY_PRVBLOCK_TRG
		       EXECUTE_TRIGGER('DISABLE_HOUSEHOLD_TAB');
      G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY_PRVBLOCK_TRG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY_PRVBLOCK_TRG")
		@After
		public void spraddr_KeyPrvblockTrg()
		{
			
				executeAction("DISABLE_HOUSEHOLD_TAB");
				getTask().getGoqrpls().gCheckFailure();
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
			
			getGoqclibSpraddrController().spraddrFromDate_keyNexItem();
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
			
			getGoqclibSpraddrController().spraddrFromDate_itemChange();
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
			
			getGoqclibSpraddrController().spraddrFromDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_FROM_DATE")
		public void spraddrFromDate_PostChange()
		{
			
			getGoqclibSpraddrController().spraddrFromDate_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_FROM_DATE_DBT")
		@Before
		public void spraddrFromDateDbt_click()
		{
			
			getGoqclibSpraddrController().spraddrFromDateDbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_FROM_DATE_DBT")
		public void spraddrFromDateDbt_buttonClick()
		{
			
			getGoqclibSpraddrController().spraddrFromDateDbt_buttonClick();
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
			
			getGoqclibSpraddrController().spraddrToDate_keyNexItem();
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
			
			getGoqclibSpraddrController().spraddrToDate_itemChange();
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
			
			getGoqclibSpraddrController().spraddrToDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_TO_DATE")
		public void spraddrToDate_PostChange()
		{
			
			getGoqclibSpraddrController().spraddrToDate_PostChange();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_TO_DATE.WHEN-VALIDATE-ITEM
		 IF trunc(:SPRADDR.SPRADDR_TO_DATE) <= trunc(sysdate) then
 	 :SPRADDR.SPRADDR_STATUS_IND := 'I';
ELSE
	IF :SPRADDR.SPRADDR_TO_DATE is null or
		 trunc(:SPRADDR.SPRADDR_TO_DATE) > trunc(sysdate) then
	   :SPRADDR.SPRADDR_STATUS_IND := '';
  END IF;
END IF;
	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_TO_DATE")
		public void spraddrToDate_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


			this.spraddrToDate_PostChange();

				if ( trunc(spraddrElement.getSpraddrToDate()).lesserOrEquals(trunc(NDate.getNow())) )
				{
					spraddrElement.setSpraddrStatusInd(toStr("I"));
				}
				else {
					if ( spraddrElement.getSpraddrToDate().isNull() || trunc(spraddrElement.getSpraddrToDate()).greater(trunc(NDate.getNow())) )
					{
						spraddrElement.setSpraddrStatusInd(toStr(""));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_TO_DATE_DBT")
		@Before
		public void spraddrToDateDbt_click()
		{
			
			getGoqclibSpraddrController().spraddrToDateDbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_TO_DATE_DBT")
		public void spraddrToDateDbt_buttonClick()
		{
			
			getGoqclibSpraddrController().spraddrToDateDbt_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_doubleClick()
		{
			
			getGoqclibSpraddrController().spraddrAtypCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_ATYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrAtypCode_itemChange()
		{
			
			getGoqclibSpraddrController().spraddrAtypCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_GSearchParameters()
		{
			
			getGoqclibSpraddrController().spraddrAtypCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_ATYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void spraddrAtypCode_keyNexItem()
		{
			
			getGoqclibSpraddrController().spraddrAtypCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_ATYP_CODE", function=KeyFunction.ITEM_OUT)
		public void spraddrAtypCode_itemOut()
		{
			
			getGoqclibSpraddrController().spraddrAtypCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_GSearchOptions()
		{
			
			getGoqclibSpraddrController().spraddrAtypCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_PostChange()
		{
			
			getGoqclibSpraddrController().spraddrAtypCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SPRADDR_ATYP_CODE", function=KeyFunction.COUNT_QUERY)
		public void spraddrAtypCode_TotalResults()
		{
			
			getGoqclibSpraddrController().spraddrAtypCode_TotalResults();
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
		@Before
		public void spraddrAtypCodeLbt_click()
		{
			
			getGoqclibSpraddrController().spraddrAtypCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_ATYP_CODE_LBT")
		public void spraddrAtypCodeLbt_buttonClick()
		{
			
			getGoqclibSpraddrController().spraddrAtypCodeLbt_buttonClick();
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
			
			getGoqclibSpraddrController().atypDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_STAT_CODE")
		public void spraddrStatCode_doubleClick()
		{
			
			getGoqclibSpraddrController().spraddrStatCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_STAT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrStatCode_itemChange()
		{
			
			getGoqclibSpraddrController().spraddrStatCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRADDR_STAT_CODE")
		public void spraddrStatCode_GSearchParameters()
		{
			
			getGoqclibSpraddrController().spraddrStatCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRADDR_STAT_CODE")
		public void spraddrStatCode_GSearchOptions()
		{
			
			getGoqclibSpraddrController().spraddrStatCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_STAT_CODE", function=KeyFunction.NEXT_ITEM)
		public void spraddrStatCode_keyNexItem()
		{
			
			getGoqclibSpraddrController().spraddrStatCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SPRADDR_STAT_CODE", function=KeyFunction.ITEM_IN)
		public void spraddrStatCode_itemIn()
		{
			
			getGoqclibSpraddrController().spraddrStatCode_itemIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_STAT_CODE", function=KeyFunction.ITEM_OUT)
		public void spraddrStatCode_itemOut()
		{
			
			getGoqclibSpraddrController().spraddrStatCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_STAT_CODE")
		public void spraddrStatCode_PostChange()
		{
			
			getGoqclibSpraddrController().spraddrStatCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_STAT_CODE_LBT")
		@Before
		public void spraddrStatCodeLbt_click()
		{
			
			getGoqclibSpraddrController().spraddrStatCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STAT_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STAT_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void statDescription_itemChange()
		{
			
			getGoqclibSpraddrController().statDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SPRADDR_ZIP", function=KeyFunction.LIST_VALUES)
		public void spraddrZip_ListValues()
		{
			
			getGoqclibSpraddrController().spraddrZip_ListValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_ZIP", function=KeyFunction.NEXT_ITEM)
		public void spraddrZip_keyNexItem()
		{
			
			getGoqclibSpraddrController().spraddrZip_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="SPRADDR_ZIP", function=KeyFunction.PREVIOUS_ITEM)
		public void spraddrZip_PreviousItem()
		{
			
			getGoqclibSpraddrController().spraddrZip_PreviousItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP.ADDR_DEFAULT_NXTFLD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ADDR_DEFAULT_NXTFLD", item="SPRADDR_ZIP")
		public void spraddrZip_AddrDefaultNxtfld()
		{
			
			getGoqclibSpraddrController().spraddrZip_AddrDefaultNxtfld();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ZIP_LBT")
		@Before
		public void spraddrZipLbt_click()
		{
			
			getGoqclibSpraddrController().spraddrZipLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_CNTY_CODE")
		public void spraddrCntyCode_doubleClick()
		{
			
			getGoqclibSpraddrController().spraddrCntyCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_CNTY_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrCntyCode_itemChange()
		{
			
			getGoqclibSpraddrController().spraddrCntyCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRADDR_CNTY_CODE")
		public void spraddrCntyCode_GSearchParameters()
		{
			
			getGoqclibSpraddrController().spraddrCntyCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRADDR_CNTY_CODE")
		public void spraddrCntyCode_GSearchOptions()
		{
			
			getGoqclibSpraddrController().spraddrCntyCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_CNTY_CODE", function=KeyFunction.NEXT_ITEM)
		public void spraddrCntyCode_keyNexItem()
		{
			
			getGoqclibSpraddrController().spraddrCntyCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_CNTY_CODE", function=KeyFunction.ITEM_OUT)
		public void spraddrCntyCode_itemOut()
		{
			
			getGoqclibSpraddrController().spraddrCntyCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_CNTY_CODE")
		public void spraddrCntyCode_PostChange()
		{
			
			getGoqclibSpraddrController().spraddrCntyCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_CNTY_CODE_LBT")
		@Before
		public void spraddrCntyCodeLbt_click()
		{
			
			getGoqclibSpraddrController().spraddrCntyCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CNTY_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CNTY_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void cntyDescription_itemChange()
		{
			
			getGoqclibSpraddrController().cntyDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_doubleClick()
		{
			
			getGoqclibSpraddrController().spraddrNatnCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_NATN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrNatnCode_itemChange()
		{
			
			getGoqclibSpraddrController().spraddrNatnCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_GSearchOptions()
		{
			
			getGoqclibSpraddrController().spraddrNatnCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_NATN_CODE", function=KeyFunction.NEXT_ITEM)
		public void spraddrNatnCode_keyNexItem()
		{
			
			getGoqclibSpraddrController().spraddrNatnCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_GSearchParameters()
		{
			
			getGoqclibSpraddrController().spraddrNatnCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_NATN_CODE", function=KeyFunction.ITEM_OUT)
		public void spraddrNatnCode_itemOut()
		{
			
			getGoqclibSpraddrController().spraddrNatnCode_itemOut();
		}

		
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
			
			getGoqclibSpraddrController().spraddrNatnCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_NATN_CODE_LBT")
		@Before
		public void spraddrNatnCodeLbt_click()
		{
			
			getGoqclibSpraddrController().spraddrNatnCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NATN_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NATN_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void natnDescription_itemChange()
		{
			
			getGoqclibSpraddrController().natnDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="TELE_CODE")
		public void teleCode_doubleClick()
		{
			
			getGoqclibSpraddrController().teleCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TELE_CODE", function=KeyFunction.ITEM_CHANGE)
		public void teleCode_itemChange()
		{
			
			getGoqclibSpraddrController().teleCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="TELE_CODE")
		public void teleCode_GSearchParameters()
		{
			
			getGoqclibSpraddrController().teleCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="TELE_CODE")
		public void teleCode_GSearchOptions()
		{
			
			getGoqclibSpraddrController().teleCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TELE_CODE", function=KeyFunction.NEXT_ITEM)
		public void teleCode_keyNexItem()
		{
			
			getGoqclibSpraddrController().teleCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="TELE_CODE", function=KeyFunction.ITEM_OUT)
		public void teleCode_itemOut()
		{
			
			getGoqclibSpraddrController().teleCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="TELE_CODE")
		public void teleCode_PostChange()
		{
			
			getGoqclibSpraddrController().teleCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="TELE_CODE", function=KeyFunction.SAVE)
		public void teleCode_Save()
		{
			
			getGoqclibSpraddrController().teleCode_Save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TELE_CODE_LBT")
		@Before
		public void teleCodeLbt_click()
		{
			
			getGoqclibSpraddrController().teleCodeLbt_click();
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
			
			getGoqclibSpraddrController().teleDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_CTRY.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PHONE_CTRY", function=KeyFunction.ITEM_CHANGE)
		public void phoneCtry_itemChange()
		{
			
			getGoqclibSpraddrController().phoneCtry_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_CTRY.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PHONE_CTRY", function=KeyFunction.ITEM_OUT)
		public void phoneCtry_itemOut()
		{
			
			getGoqclibSpraddrController().phoneCtry_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_CTRY.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PHONE_CTRY", function=KeyFunction.SAVE)
		public void phoneCtry_Save()
		{
			
			getGoqclibSpraddrController().phoneCtry_Save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_CTRY.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="PHONE_CTRY", function=KeyFunction.COUNT_QUERY)
		public void phoneCtry_TotalResults()
		{
			
			getGoqclibSpraddrController().phoneCtry_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_AREA.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PHONE_AREA", function=KeyFunction.ITEM_CHANGE)
		public void phoneArea_itemChange()
		{
			
			getGoqclibSpraddrController().phoneArea_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_AREA.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PHONE_AREA", function=KeyFunction.ITEM_OUT)
		public void phoneArea_itemOut()
		{
			
			getGoqclibSpraddrController().phoneArea_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_AREA.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PHONE_AREA", function=KeyFunction.SAVE)
		public void phoneArea_Save()
		{
			
			getGoqclibSpraddrController().phoneArea_Save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_AREA.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="PHONE_AREA", function=KeyFunction.COUNT_QUERY)
		public void phoneArea_TotalResults()
		{
			
			getGoqclibSpraddrController().phoneArea_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_NUMBER.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PHONE_NUMBER", function=KeyFunction.ITEM_CHANGE)
		public void phoneNumber_itemChange()
		{
			
			getGoqclibSpraddrController().phoneNumber_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_NUMBER.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PHONE_NUMBER", function=KeyFunction.ITEM_OUT)
		public void phoneNumber_itemOut()
		{
			
			getGoqclibSpraddrController().phoneNumber_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_NUMBER.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PHONE_NUMBER", function=KeyFunction.SAVE)
		public void phoneNumber_Save()
		{
			
			getGoqclibSpraddrController().phoneNumber_Save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_NUMBER.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="PHONE_NUMBER", function=KeyFunction.COUNT_QUERY)
		public void phoneNumber_TotalResults()
		{
			
			getGoqclibSpraddrController().phoneNumber_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_EXT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PHONE_EXT", function=KeyFunction.ITEM_CHANGE)
		public void phoneExt_itemChange()
		{
			
			getGoqclibSpraddrController().phoneExt_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_EXT.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PHONE_EXT", function=KeyFunction.ITEM_OUT)
		public void phoneExt_itemOut()
		{
			
			getGoqclibSpraddrController().phoneExt_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_EXT.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PHONE_EXT", function=KeyFunction.SAVE)
		public void phoneExt_Save()
		{
			
			getGoqclibSpraddrController().phoneExt_Save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_EXT.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="PHONE_EXT", function=KeyFunction.COUNT_QUERY)
		public void phoneExt_TotalResults()
		{
			
			getGoqclibSpraddrController().phoneExt_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PHONE_BTN")
		@Before
		public void phoneBtn_click()
		{
			
			getGoqclibSpraddrController().phoneBtn_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PHONE_BTN")
		public void phoneBtn_buttonClick()
		{
			
			getGoqclibSpraddrController().phoneBtn_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FAX_CTRY.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FAX_CTRY", function=KeyFunction.ITEM_CHANGE)
		public void faxCtry_itemChange()
		{
			
			getGoqclibSpraddrController().faxCtry_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FAX_CTRY.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FAX_CTRY", function=KeyFunction.ITEM_OUT)
		public void faxCtry_itemOut()
		{
			
			getGoqclibSpraddrController().faxCtry_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FAX_CTRY.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="FAX_CTRY", function=KeyFunction.SAVE)
		public void faxCtry_Save()
		{
			
			getGoqclibSpraddrController().faxCtry_Save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FAX_CTRY.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="FAX_CTRY", function=KeyFunction.COUNT_QUERY)
		public void faxCtry_TotalResults()
		{
			
			getGoqclibSpraddrController().faxCtry_TotalResults();
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR_STATUS_IND.WHEN-VALIDATE-ITEM
		    DECLARE
    PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   DUAL
         WHERE  :SPRADDR_ATYP_CODE =  (
               SELECT APBCONS_ATYP_CODE_PREF
               FROM   APBCONS
               WHERE  APBCONS_PIDM = :PIDM )
           AND  :SPRADDR_STATUS_IND = 'I' ;
      CURSOR PTI_CURSOR2 IS
         SELECT 'X'
         FROM   AOBORGN
         WHERE  AOBORGN_PIDM = :SPRADDR_PIDM
           AND  AOBORGN_PREF_ATYP_CODE = :SPRADDR.SPRADDR_ATYP_CODE
           AND  AOBORGN_PREF_ATYP_SEQNO = :SPRADDR.SPRADDR_SEQNO ;     
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%FOUND,
         g$_nls.get('APAIDEN-0051','FORM','*WARNING* Preferred address is being inactivated.'),
         FALSE);     
      CLOSE PTI_CURSOR;
      OPEN PTI_CURSOR2 ;
      IF :SPRADDR_STATUS_IND = 'I' THEN
         FETCH PTI_CURSOR2 INTO PTI_INTO_TEMP ;
         G$_CHECK_VALUE (PTI_CURSOR2 %FOUND,
            g$_nls.get('APAIDEN-0052','FORM',' *WARNING* Preferred address is being inactivated. Consider whether a different address should be identified as the preferred address on AOAORGN.'),
            FALSE);
         CLOSE PTI_CURSOR2;  
      END IF;    
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STATUS_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_STATUS_IND")
		public void spraddrStatusInd_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);


				int rowCount = 0;
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM DUAL " +
	" WHERE :SPRADDR_ATYP_CODE = (SELECT APBCONS_ATYP_CODE_PREF " +
		" FROM APBCONS " +
		" WHERE APBCONS_PIDM = :PIDM ) AND :SPRADDR_STATUS_IND = 'I' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					String sqlptiCursor2 = "SELECT 'X' " +
	" FROM AOBORGN " +
	" WHERE AOBORGN_PIDM = :SPRADDR_PIDM AND AOBORGN_PREF_ATYP_CODE = :SPRADDR_SPRADDR_ATYP_CODE AND AOBORGN_PREF_ATYP_SEQNO = :SPRADDR_SPRADDR_SEQNO ";
					DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
						ptiCursor.addParameter("PIDM", getFormModel().getKeyBlock().getPidm());
						ptiCursor.addParameter("SPRADDR_STATUS_IND", spraddrElement.getSpraddrStatusInd());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.found(), GNls.Fget(toStr("APAIDEN-0051"), toStr("FORM"), toStr("*WARNING* Preferred address is being inactivated.")), toBool(NBool.False), toBool(NBool.True));
						ptiCursor.close();
						//Setting query parameters
						ptiCursor2.addParameter("SPRADDR_PIDM", spraddrElement.getSpraddrPidm());
						ptiCursor2.addParameter("SPRADDR_SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
						ptiCursor2.addParameter("SPRADDR_SPRADDR_SEQNO", spraddrElement.getSpraddrSeqno());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor2.
						ptiCursor2.open();
						if ( spraddrElement.getSpraddrStatusInd().equals("I") )
						{
							ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
							if ( ptiCursor2Results != null ) {
								ptiIntoTemp = ptiCursor2Results.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(ptiCursor2.found(), GNls.Fget(toStr("APAIDEN-0052"), toStr("FORM"), toStr(" *WARNING* Preferred address is being inactivated. Consider whether a different address should be identified as the preferred address on AOAORGN.")), toBool(NBool.False), toBool(NBool.True));
							ptiCursor2.close();
						}
					}
					finally{
						ptiCursor.close();
						ptiCursor2.close();
					}
				}
			}

		
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
			
			getGoqclibSpraddrController().spraddrAsrcCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_ASRC_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrAsrcCode_itemChange()
		{
			
			getGoqclibSpraddrController().spraddrAsrcCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_GSearchParameters()
		{
			
			getGoqclibSpraddrController().spraddrAsrcCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_GSearchOptions()
		{
			
			getGoqclibSpraddrController().spraddrAsrcCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_ASRC_CODE", function=KeyFunction.ITEM_OUT)
		public void spraddrAsrcCode_itemOut()
		{
			
			getGoqclibSpraddrController().spraddrAsrcCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_ASRC_CODE", function=KeyFunction.NEXT_ITEM)
		public void spraddrAsrcCode_keyNexItem()
		{
			
			getGoqclibSpraddrController().spraddrAsrcCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_PostChange()
		{
			
			getGoqclibSpraddrController().spraddrAsrcCode_PostChange();
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
		@Before
		public void spraddrAsrcCodeLbt_click()
		{
			
			getGoqclibSpraddrController().spraddrAsrcCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_DELIVERY_POINT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_DELIVERY_POINT", function=KeyFunction.ITEM_CHANGE)
		public void spraddrDeliveryPoint_itemChange()
		{
			
			getGoqclibSpraddrController().spraddrDeliveryPoint_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void spraddrActivityDate_keyNexItem()
		{
			
			getGoqclibSpraddrController().spraddrActivityDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrActivityDate_itemChange()
		{
			
			getGoqclibSpraddrController().spraddrActivityDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void spraddrActivityDate_itemOut()
		{
			
			getGoqclibSpraddrController().spraddrActivityDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_FROM_DATE")
		public void spraddrFromDate_validate()
		{
			

			SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
			this.spraddrFromDate_PostChange();

		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_validate()
		{
			

			SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
			this.spraddrAtypCode_PostChange();

		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_STAT_CODE")
		public void spraddrStatCode_validate()
		{
			

			SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
			this.spraddrStatCode_PostChange();

		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_CNTY_CODE")
		public void spraddrCntyCode_validate()
		{
			

			SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
			this.spraddrCntyCode_PostChange();

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

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="TELE_CODE")
		public void teleCode_validate()
		{
			

			SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
			this.teleCode_PostChange();

		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_validate()
		{
			

			SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
			this.spraddrAsrcCode_PostChange();

		}

		
	
	
}

