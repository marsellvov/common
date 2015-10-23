package net.hedtech.general.common.libraries.Soqolib.controller;
 
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;

import net.hedtech.general.common.libraries.Soqolib.model.*;
import net.hedtech.general.common.libraries.Soqolib.*;
import net.hedtech.general.common.libraries.Soqolib.services.*;
import net.hedtech.general.common.libraries.Soqrpls.SoqrplsServices;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;		
		
public class SCommPlanBlockController extends AbstractSupportCodeObject {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	
	public SCommPlanBlockController(ISupportCodeContainer container) 
	{
		super(container);
	}
		
		
		
	@Override
	public SoqolibTaskPart getContainer() {
		return (SoqolibTaskPart)super.getContainer();
	}

	public SoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-CLRBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void sCommPlanBlock_keyClearBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-CLRREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void sCommPlanBlock_ClearRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-CREREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void sCommPlanBlock_CreateRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-DELREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sCommPlanBlock_DeleteRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-DUP-ITEM
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void sCommPlanBlock_KeyDupItem()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-DUPREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void sCommPlanBlock_CopyRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-EDIT
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-EDIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EDIT")
		public void sCommPlanBlock_KeyEdit()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-ENTQRY
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void sCommPlanBlock_Search()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-EXEQRY
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void sCommPlanBlock_ExecuteQuery()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-MENU
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-MENU
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-MENU")
		public void sCommPlanBlock_KeyMenu()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-NXTBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sCommPlanBlock_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-NXTKEY
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void sCommPlanBlock_KeyNxtkey()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-NXTREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sCommPlanBlock_NextRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-NXTSET
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void sCommPlanBlock_KeyNxtset()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-PRVBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sCommPlanBlock_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-PRVREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void sCommPlanBlock_PreviousRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.CHECK_MAIL
		 DECLARE
  CURSOR FIND_PLAN_MAIL IS
   SELECT 'Y','Y'
   FROM   GURMAIL
   WHERE  GURMAIL_PIDM      = :CPLN_PIDM
     AND  GURMAIL_SYSTEM_IND = 'S'
     AND  GURMAIL_MODULE_CODE = :CPLN_TYPE_IND
     AND  GURMAIL_CPLN_CODE = :OLD_CPLN_CODE
     AND  GURMAIL_TERM_CODE = :CPLN_TERM_CODE
     AND  GURMAIL_ADMIN_IDENTIFIER = :CPLN_SEQNO
     AND  GURMAIL_DATE_PRINTED IS NULL
   UNION
   SELECT 'Y','Y'
   FROM   GURMAIL
   WHERE  GURMAIL_PIDM      = :CPLN_PIDM
     AND  GURMAIL_SYSTEM_IND = 'S'
     AND  GURMAIL_MODULE_CODE = :CPLN_TYPE_IND
     AND  :CPLN_TYPE_IND = 'S'
     AND  GURMAIL_CPLN_CODE = :OLD_CPLN_CODE
     AND  GURMAIL_TERM_CODE = '999999'
     AND  GURMAIL_ADMIN_IDENTIFIER IS NULL
     AND  GURMAIL_DATE_PRINTED IS NULL;
--
  CURSOR FIND_RECR_MAIL IS
   SELECT 'Y','Y'
   FROM   GURMAIL
   WHERE  GURMAIL_PIDM      = :CPLN_PIDM
     AND  GURMAIL_SYSTEM_IND = 'S'
     AND  GURMAIL_MODULE_CODE = 'R'
     AND  GURMAIL_DATE_PRINTED IS NULL;
--
  CURSOR FIND_RECR_ADMT_MAIL IS
   SELECT 'Y','Y'
   FROM   GURMAIL
   WHERE  GURMAIL_PIDM      = :CPLN_PIDM
     AND  GURMAIL_SYSTEM_IND = 'S'
     AND  GURMAIL_MODULE_CODE = 'R'
     AND  GURMAIL_DATE_PRINTED IS NULL
   UNION
   SELECT 'Y','Y'
   FROM   GURMAIL
   WHERE  GURMAIL_PIDM      = :CPLN_PIDM
     AND  GURMAIL_SYSTEM_IND = 'S'
     AND  GURMAIL_MODULE_CODE = 'A'
     AND  GURMAIL_DATE_PRINTED IS NULL;
--
BEGIN
IF :CPLN_ACTION = '3' THEN
   GOTO ACTION_3;
END IF;
--
OPEN FIND_PLAN_MAIL;
FETCH FIND_PLAN_MAIL INTO :PENDING_MAIL, :DELETE_MAIL;
IF FIND_PLAN_MAIL%NOTFOUND THEN
  :PENDING_MAIL := 'N';
  :DELETE_MAIL  := 'N';
END IF;
CLOSE FIND_PLAN_MAIL;
GOTO TRIGGER_EXIT;
--
<<ACTION_3>>
IF :CPLN_TYPE_IND = 'S' THEN
   GOTO CHECK_STUDENT;
END IF;
--  check for any recruiting mail
OPEN FIND_RECR_MAIL;
FETCH FIND_RECR_MAIL INTO :PENDING_MAIL, :DELETE_MAIL;
IF FIND_RECR_MAIL%NOTFOUND THEN
  :PENDING_MAIL := 'N';
  :DELETE_MAIL  := 'N';
END IF;
CLOSE FIND_RECR_MAIL;
GOTO TRIGGER_EXIT;
--
<<CHECK_STUDENT>>
--  check for any recruiting or admissions mail
OPEN FIND_RECR_ADMT_MAIL;
FETCH FIND_RECR_ADMT_MAIL INTO :PENDING_MAIL, :DELETE_MAIL;
IF FIND_RECR_ADMT_MAIL%NOTFOUND THEN
  :PENDING_MAIL := 'N';
  :DELETE_MAIL  := 'N';
END IF;
CLOSE FIND_RECR_ADMT_MAIL;
--
<<TRIGGER_EXIT>>
NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.CHECK_MAIL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_MAIL")
		public void sCommPlanBlock_CheckMail()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlfindPlanMail = "SELECT 'Y', 'Y' " +
	" FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :CPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = :CPLN_TYPE_IND AND GURMAIL_CPLN_CODE = :OLD_CPLN_CODE AND GURMAIL_TERM_CODE = :CPLN_TERM_CODE AND GURMAIL_ADMIN_IDENTIFIER = :CPLN_SEQNO AND GURMAIL_DATE_PRINTED IS NULL " +
	"UNION SELECT 'Y', 'Y' " +
	" FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :CPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = :CPLN_TYPE_IND AND :CPLN_TYPE_IND = 'S' AND GURMAIL_CPLN_CODE = :OLD_CPLN_CODE AND GURMAIL_TERM_CODE = '999999' AND GURMAIL_ADMIN_IDENTIFIER IS NULL AND GURMAIL_DATE_PRINTED IS NULL ";
					DataCursor findPlanMail = new DataCursor(sqlfindPlanMail);
					String sqlfindRecrMail = "SELECT 'Y', 'Y' " +
	" FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :CPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = 'R' AND GURMAIL_DATE_PRINTED IS NULL ";
					DataCursor findRecrMail = new DataCursor(sqlfindRecrMail);
					String sqlfindRecrAdmtMail = "SELECT 'Y', 'Y' " +
	" FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :CPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = 'R' AND GURMAIL_DATE_PRINTED IS NULL " +
	"UNION SELECT 'Y', 'Y' " +
	" FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :CPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = 'A' AND GURMAIL_DATE_PRINTED IS NULL ";
					DataCursor findRecrAdmtMail = new DataCursor(sqlfindRecrAdmtMail);
					if ( getFormModel().getSCommPlanBlock().getCplnAction().equals("3") )
					{
						//ACTION_3:;
						if ( getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("S") )
						{
							try {
								//CHECK_STUDENT:;
								//   check for any recruiting or admissions mail
								//Setting query parameters
								findRecrAdmtMail.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable findRecrAdmtMail.
								findRecrAdmtMail.open();
								ResultSet findRecrAdmtMailResults = findRecrAdmtMail.fetchInto();
								if ( findRecrAdmtMailResults != null ) {
									getFormModel().getSCommPlanBlock().setPendingMail(findRecrAdmtMailResults.getStr(0));
									sobcplnElement.setDeleteMail(findRecrAdmtMailResults.getStr(1));
								}
								if ( findRecrAdmtMail.notFound() )
								{
									getFormModel().getSCommPlanBlock().setPendingMail(toStr("N"));
									sobcplnElement.setDeleteMail(toStr("N"));
								}
								findRecrAdmtMail.close();
							}
							finally{
								findRecrAdmtMail.close();
							}
						}
						//   check for any recruiting mail
						//Setting query parameters
						try {
							findRecrMail.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable findRecrMail.
							findRecrMail.open();
							ResultSet findRecrMailResults = findRecrMail.fetchInto();
							if ( findRecrMailResults != null ) {
								getFormModel().getSCommPlanBlock().setPendingMail(findRecrMailResults.getStr(0));
								sobcplnElement.setDeleteMail(findRecrMailResults.getStr(1));
							}
							if ( findRecrMail.notFound() )
							{
								getFormModel().getSCommPlanBlock().setPendingMail(toStr("N"));
								sobcplnElement.setDeleteMail(toStr("N"));
							}
							findRecrMail.close();
						}
						finally{
							findRecrMail.close();
						}
					}
					// 
					//Setting query parameters
					try {
						findPlanMail.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
						findPlanMail.addParameter("CPLN_TYPE_IND", getFormModel().getSCommPlanBlock().getCplnTypeInd());
						findPlanMail.addParameter("OLD_CPLN_CODE", getFormModel().getSCommPlanBlock().getOldCplnCode());
						findPlanMail.addParameter("CPLN_TERM_CODE", getFormModel().getSCommPlanBlock().getCplnTermCode());
						findPlanMail.addParameter("CPLN_SEQNO", getFormModel().getSCommPlanBlock().getCplnSeqno());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable findPlanMail.
						findPlanMail.open();
						ResultSet findPlanMailResults = findPlanMail.fetchInto();
						if ( findPlanMailResults != null ) {
							getFormModel().getSCommPlanBlock().setPendingMail(findPlanMailResults.getStr(0));
							sobcplnElement.setDeleteMail(findPlanMailResults.getStr(1));
						}
						if ( findPlanMail.notFound() )
						{
							getFormModel().getSCommPlanBlock().setPendingMail(toStr("N"));
							sobcplnElement.setDeleteMail(toStr("N"));
						}
						findPlanMail.close();	
					}
					finally{
						findPlanMail.close();
					}
			}
		}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-COMMIT
		 SET_ALERT_PROPERTY('G$_INFO_ALERT',
         ALERT_MESSAGE_TEXT, 
          G$_NLS.Get('SOQOLIB-0138', 'FORM','Communication plan update in process...') );
:GLOBAL.VALUE := SHOW_ALERT('G$_INFO_ALERT');
:GLOBAL.VALUE := '';
--
IF :CPLN_ACTION = '1' THEN
   IF :DELETE_PLAN = 'N' AND
      :OLD_CPLN_CODE IS NOT NULL AND
      :ADD_PLAN    = 'Y' THEN
    MESSAGE( G$_NLS.Get('SOQOLIB-0139', 'FORM','*ERROR* Cannot add new plan if old plan is still active.') );
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
END IF;
--
IF :DELETE_MAIL  = 'N' THEN
   GOTO DELETE_PLAN;
END IF;
--
IF :OLD_CPLN_CODE IS NOT NULL THEN
   S$_DELETE_MATERIALS(:CPLN_PIDM,:OLD_CPLN_CODE,:CPLN_TYPE_IND,
      :CPLN_TERM_CODE,:CPLN_SEQNO);
   GOTO DELETE_PLAN;
END IF;
--
IF :CPLN_ACTION <> '3' OR
   :OLD_CPLN_DESC IS NULL THEN
   GOTO DELETE_PLAN;
END IF;
--  delete all unmailed recruiting materials that were created by
--  communication plans
BEGIN
  DELETE FROM GURMAIL
  WHERE  GURMAIL_PIDM        = :CPLN_PIDM
    AND  GURMAIL_SYSTEM_IND  = 'S'
    AND  GURMAIL_MODULE_CODE = 'R'
    AND  GURMAIL_ORIG_IND    = 'S'
    AND  GURMAIL_DATE_PRINTED IS NULL
    AND  GURMAIL_CPLN_CODE IS NOT NULL;
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
--
IF :CPLN_TYPE_IND = 'A' THEN
   GOTO DELETE_PLAN;
END IF;
--  delete all unmailed admissions materials that were created by
--  communication plans
BEGIN
  DELETE FROM GURMAIL
  WHERE  GURMAIL_PIDM        = :CPLN_PIDM
    AND  GURMAIL_SYSTEM_IND  = 'S'
    AND  GURMAIL_MODULE_CODE = 'A'
    AND  GURMAIL_ORIG_IND    = 'S'
    AND  GURMAIL_DATE_PRINTED IS NULL
    AND  GURMAIL_CPLN_CODE IS NOT NULL;
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
--
<<DELETE_PLAN>>
IF :DELETE_PLAN = 'N' THEN
   GOTO ADD_NEW_PLAN;
ELSIF :DELETE_PLAN = 'I' THEN
   GOTO INACTIVATE_PLAN;
END IF;
--  delete old plan
IF :OLD_CPLN_CODE IS NOT NULL AND
   :CPLN_TYPE_IND IN ('A','R') THEN
   BEGIN
     DELETE FROM SOBCPLN
     WHERE  SOBCPLN_PIDM      = :CPLN_PIDM
       AND  SOBCPLN_TYPE_IND  = :CPLN_TYPE_IND
       AND  SOBCPLN_TERM_CODE = :CPLN_TERM_CODE
       AND  SOBCPLN_SEQNO     = :CPLN_SEQNO
       AND  SOBCPLN_CPLN_CODE = :OLD_CPLN_CODE;
     EXCEPTION
       WHEN OTHERS THEN NULL;
     END;
     GOTO ADD_NEW_PLAN;
END IF;
--
IF :OLD_CPLN_CODE IS NOT NULL AND
   :CPLN_TYPE_IND = 'S' THEN
   BEGIN
     DELETE FROM SOBCPLN
     WHERE  SOBCPLN_PIDM      = :CPLN_PIDM
       AND  SOBCPLN_TYPE_IND  = :CPLN_TYPE_IND
       AND  SOBCPLN_TERM_CODE IS NULL
       AND  SOBCPLN_SEQNO     IS NULL
       AND  SOBCPLN_CPLN_CODE = :OLD_CPLN_CODE;
     EXCEPTION
       WHEN OTHERS THEN NULL;
     END;
     GOTO ADD_NEW_PLAN;
END IF;
--
IF :CPLN_ACTION <> '3' OR
   :OLD_CPLN_DESC IS NULL THEN
   GOTO ADD_NEW_PLAN;
END IF;
--  delete recruiting communication plans
BEGIN
  DELETE FROM SOBCPLN
  WHERE  SOBCPLN_PIDM = :CPLN_PIDM
    AND  SOBCPLN_TYPE_IND = 'R';
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
--
IF :CPLN_TYPE_IND = 'A' THEN
   GOTO ADD_NEW_PLAN;
END IF;
--  delete admissions communication plans
BEGIN
  DELETE FROM SOBCPLN
  WHERE  SOBCPLN_PIDM = :CPLN_PIDM
    AND  SOBCPLN_TYPE_IND = 'A';
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
--
<<INACTIVATE_PLAN>>
IF :OLD_CPLN_CODE IS NOT NULL AND
   :CPLN_TYPE_IND IN ('A','R') THEN
   BEGIN
     UPDATE SOBCPLN
     SET    SOBCPLN_ACTIVE_IND = 'N'
     WHERE  SOBCPLN_PIDM      = :CPLN_PIDM
       AND  SOBCPLN_TYPE_IND  = :CPLN_TYPE_IND
       AND  SOBCPLN_TERM_CODE = :CPLN_TERM_CODE
       AND  SOBCPLN_SEQNO     = :CPLN_SEQNO
       AND  SOBCPLN_CPLN_CODE = :OLD_CPLN_CODE;
     EXCEPTION
       WHEN OTHERS THEN NULL;
     END;
     GOTO ADD_NEW_PLAN;
END IF;
--
IF :OLD_CPLN_CODE IS NOT NULL AND
   :CPLN_TYPE_IND = 'S' THEN
   BEGIN
     UPDATE SOBCPLN
     SET    SOBCPLN_ACTIVE_IND = 'N'
     WHERE  SOBCPLN_PIDM      = :CPLN_PIDM
       AND  SOBCPLN_TYPE_IND  = :CPLN_TYPE_IND
       AND  SOBCPLN_TERM_CODE IS NULL
       AND  SOBCPLN_SEQNO     IS NULL
       AND  SOBCPLN_CPLN_CODE = :OLD_CPLN_CODE;
     EXCEPTION
       WHEN OTHERS THEN NULL;
     END;
     GOTO ADD_NEW_PLAN;
END IF;
--
IF :CPLN_ACTION <> '3' OR
   :OLD_CPLN_DESC IS NULL THEN
   GOTO ADD_NEW_PLAN;
END IF;
--  inactivate recruiting communication plans
BEGIN
  UPDATE SOBCPLN
  SET    SOBCPLN_ACTIVE_IND = 'N'
  WHERE  SOBCPLN_PIDM = :CPLN_PIDM
    AND  SOBCPLN_TYPE_IND = 'R';
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
--
IF :CPLN_TYPE_IND = 'A' THEN
   GOTO ADD_NEW_PLAN;
END IF;
--  inactivate admissions communication plans
BEGIN
  UPDATE SOBCPLN
  SET    SOBCPLN_ACTIVE_IND = 'N'
  WHERE  SOBCPLN_PIDM = :CPLN_PIDM
    AND  SOBCPLN_TYPE_IND = 'A';
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
--
<<ADD_NEW_PLAN>>
IF :NEW_CPLN_CODE IS NULL THEN
   IF :DELETE_PLAN = 'Y' THEN
      MESSAGE( G$_NLS.Get('SOQOLIB-0140', 'FORM','*NOTE* Old communication plan deleted.') );
   ELSIF :DELETE_PLAN = 'I' THEN
      MESSAGE( G$_NLS.Get('SOQOLIB-0141', 'FORM','*NOTE* Old communication plan inactivated.') );
   END IF;
   GOTO TRIGGER_EXIT;
END IF;
--  add new plan
IF :ADD_PLAN = 'Y' THEN
  BEGIN
    INSERT INTO SOBCPLN 
    		 (SOBCPLN_PIDM,
    		  SOBCPLN_TYPE_IND,
    		  SOBCPLN_TERM_CODE,
    		  SOBCPLN_SEQNO,
    		  SOBCPLN_CPLN_CODE,
    		  SOBCPLN_ACTIVE_IND,
    		  SOBCPLN_ACTIVITY_DATE)    
    VALUES
         (:CPLN_PIDM,
          :CPLN_TYPE_IND,
          :CPLN_TERM_CODE,
          :CPLN_SEQNO,
          :NEW_CPLN_CODE,
          'Y',
          SYSDATE);
    EXCEPTION
      WHEN OTHERS THEN NULL;
  END;
  SOKCPLN.P_CREATE_MATERIALS(:CPLN_PIDM);
  MESSAGE( G$_NLS.Get('SOQOLIB-0142', 'FORM','*NOTE* New communication plan added.') );
END IF;
<<TRIGGER_EXIT>>
:OLD_CPLN_CODE := '';
:OLD_CPLN_DESC := '';
:NEW_CPLN_CODE := '';
:NEW_CPLN_DESC := '';
:SYSTEM.MESSAGE_LEVEL := '5';
COMMIT;
:SYSTEM.MESSAGE_LEVEL := '0';
:COMMIT_IND := 'Y';
GO_FIELD(:SAVE_FIELD_NAME);
IF :KEY_FUNCTION = 'C' THEN
   :SYSTEM.MESSAGE_LEVEL := '5';  
   DO_KEY('COMMIT_FORM');
   :SYSTEM.MESSAGE_LEVEL := '0';
ELSIF :KEY_FUNCTION = 'D' THEN
   DO_KEY('DELETE_RECORD');
ELSIF :KEY_FUNCTION = 'E' THEN
   DO_KEY('EXIT_FORM');
ELSIF :KEY_FUNCTION = 'I' THEN
   DO_KEY('CREATE_RECORD');
ELSIF :KEY_FUNCTION = 'M' THEN
   DO_KEY('BLOCK_MENU');
ELSIF :KEY_FUNCTION = 'N' THEN
   DO_KEY('NEXT_RECORD');
ELSIF :KEY_FUNCTION = 'P' THEN
   DO_KEY('PREVIOUS_RECORD');
ELSIF :KEY_FUNCTION = 'R' THEN
   DO_KEY('CLEAR_FORM');
ELSIF :KEY_FUNCTION = 'U' THEN
   DO_KEY('DUPLICATE_RECORD');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void sCommPlanBlock_Save()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				int rowCount = 0;
				setAlertMessageText("G$_INFO_ALERT", GNls.Fget(toStr("SOQOLIB-0138"), toStr("FORM"), toStr("Communication plan update in process...")));
				setGlobal("VALUE", toStr(showAlert("G$_INFO_ALERT")));
				setGlobal("VALUE", toStr(""));
				// 
				if ( getFormModel().getSCommPlanBlock().getCplnAction().equals("1") )
				{
					if ( sobcplnElement.getDeletePlan().equals("N") && !getFormModel().getSCommPlanBlock().getOldCplnCode().isNull() && getFormModel().getSCommPlanBlock().getAddPlan().equals("Y") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0139"), toStr("FORM"), toStr("*ERROR* Cannot add new plan if old plan is still active.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( sobcplnElement.getDeleteMail().equals("N") )
				{
					 //goto DELETE_PLAN;
					deletePlan(sobcplnElement);
				}
				// 
				if ( !getFormModel().getSCommPlanBlock().getOldCplnCode().isNull() )
				{
				sDeleteMaterials(getFormModel().getSCommPlanBlock().getCplnPidm(), getFormModel().getSCommPlanBlock().getOldCplnCode(), getFormModel().getSCommPlanBlock().getCplnTypeInd(), getFormModel().getSCommPlanBlock().getCplnTermCode(), getFormModel().getSCommPlanBlock().getCplnSeqno());
					
					//goto DELETE_PLAN;
					deletePlan(sobcplnElement);
				}
				// 
				if ( getFormModel().getSCommPlanBlock().getCplnAction().notEquals("3") || getFormModel().getSCommPlanBlock().getOldCplnDesc().isNull() )
				{
					 //goto DELETE_PLAN;
					deletePlan(sobcplnElement);
				}
				try
				{
					String sql1 = "DELETE FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :CPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = 'R' AND GURMAIL_ORIG_IND = 'S' AND GURMAIL_DATE_PRINTED IS NULL AND GURMAIL_CPLN_CODE IS NOT NULL";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					rowCount = command1.execute();
				}
				catch(Exception  e)
				{
				}
				// 
				if ( getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("A") )
				{
					 //goto DELETE_PLAN;
					deletePlan(sobcplnElement);
				}
				try
				{
					String sql2 = "DELETE FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :CPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = 'A' AND GURMAIL_ORIG_IND = 'S' AND GURMAIL_DATE_PRINTED IS NULL AND GURMAIL_CPLN_CODE IS NOT NULL";
					DataCommand command2 = new DataCommand(sql2);
					//Setting query parameters
					command2.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					rowCount = command2.execute();
				}
				catch(Exception  e)
				{
				}			
			}
		
		void addNewPlan(SobcplnAdapter sobcplnElement){
			// ADD_NEW_PLAN:;
			int rowCount = 0;
			if ( getFormModel().getSCommPlanBlock().getNewCplnCode().isNull() )
			{
				if ( sobcplnElement.getDeletePlan().equals("Y") )
				{
					infoMessage(GNls.Fget(toStr("SOQOLIB-0140"), toStr("FORM"), toStr("*NOTE* Old communication plan deleted.")));
				}
				else if ( sobcplnElement.getDeletePlan().equals("I") ) {
					infoMessage(GNls.Fget(toStr("SOQOLIB-0141"), toStr("FORM"), toStr("*NOTE* Old communication plan inactivated.")));
				}
				 //goto TRIGGER_EXIT;
				triggerExit();
			}
			//   add new plan
			if ( getFormModel().getSCommPlanBlock().getAddPlan().equals("Y") )
			{
				try
				{
					String sql11 = "INSERT INTO SOBCPLN " +
"(SOBCPLN_PIDM, SOBCPLN_TYPE_IND, SOBCPLN_TERM_CODE, SOBCPLN_SEQNO, SOBCPLN_CPLN_CODE, SOBCPLN_ACTIVE_IND, SOBCPLN_ACTIVITY_DATE)" +
"VALUES (:CPLN_PIDM, :CPLN_TYPE_IND, :CPLN_TERM_CODE, :CPLN_SEQNO, :NEW_CPLN_CODE, 'Y', SYSDATE)";
					DataCommand command11 = new DataCommand(sql11);
					//Setting query parameters
					command11.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					command11.addParameter("CPLN_TYPE_IND", getFormModel().getSCommPlanBlock().getCplnTypeInd());
					command11.addParameter("CPLN_TERM_CODE", getFormModel().getSCommPlanBlock().getCplnTermCode());
					command11.addParameter("CPLN_SEQNO", getFormModel().getSCommPlanBlock().getCplnSeqno());
					command11.addParameter("NEW_CPLN_CODE", getFormModel().getSCommPlanBlock().getNewCplnCode());
					rowCount = command11.execute();
				}
				catch(Exception  e)
				{
				}
				Sokcpln.pCreateMaterials(getFormModel().getSCommPlanBlock().getCplnPidm());
				infoMessage(GNls.Fget(toStr("SOQOLIB-0142"), toStr("FORM"), toStr("*NOTE* New communication plan added.")));
			}
		}
		void deletePlan(SobcplnAdapter sobcplnElement){
			// DELETE_PLAN:;
			int rowCount = 0;
			if ( sobcplnElement.getDeletePlan().equals("N") )
			{
				 //goto ADD_NEW_PLAN;
				addNewPlan(sobcplnElement);
			}
			else if ( sobcplnElement.getDeletePlan().equals("I") ) {
				 //goto INACTIVATE_PLAN;
				inactivePlan(sobcplnElement);
			}
			//   delete old plan
			if ( !getFormModel().getSCommPlanBlock().getOldCplnCode().isNull() && in(getFormModel().getSCommPlanBlock().getCplnTypeInd(), "A", "R").getValue() )
			{
				try
				{
					String sql3 = "DELETE FROM SOBCPLN " +
" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = :CPLN_TYPE_IND AND SOBCPLN_TERM_CODE = :CPLN_TERM_CODE AND SOBCPLN_SEQNO = :CPLN_SEQNO AND SOBCPLN_CPLN_CODE = :OLD_CPLN_CODE";
					DataCommand command3 = new DataCommand(sql3);
					//Setting query parameters
					command3.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					command3.addParameter("CPLN_TYPE_IND", getFormModel().getSCommPlanBlock().getCplnTypeInd());
					command3.addParameter("CPLN_TERM_CODE", getFormModel().getSCommPlanBlock().getCplnTermCode());
					command3.addParameter("CPLN_SEQNO", getFormModel().getSCommPlanBlock().getCplnSeqno());
					command3.addParameter("OLD_CPLN_CODE", getFormModel().getSCommPlanBlock().getOldCplnCode());
					rowCount = command3.execute();
				}
				catch(Exception  e)
				{
				}
				 //goto ADD_NEW_PLAN;
				addNewPlan(sobcplnElement);
			}
			// 
			if ( !getFormModel().getSCommPlanBlock().getOldCplnCode().isNull() && getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("S") )
			{
				try
				{
					String sql4 = "DELETE FROM SOBCPLN " +
" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = :CPLN_TYPE_IND AND SOBCPLN_TERM_CODE IS NULL AND SOBCPLN_SEQNO IS NULL AND SOBCPLN_CPLN_CODE = :OLD_CPLN_CODE";
					DataCommand command4 = new DataCommand(sql4);
					//Setting query parameters
					command4.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					command4.addParameter("CPLN_TYPE_IND", getFormModel().getSCommPlanBlock().getCplnTypeInd());
					command4.addParameter("OLD_CPLN_CODE", getFormModel().getSCommPlanBlock().getOldCplnCode());
					rowCount = command4.execute();
				}
				catch(Exception  e)
				{
				}
				 //goto ADD_NEW_PLAN;
				addNewPlan(sobcplnElement);
			}
			// 
			if ( getFormModel().getSCommPlanBlock().getCplnAction().notEquals("3") || getFormModel().getSCommPlanBlock().getOldCplnDesc().isNull() )
			{
				 //goto ADD_NEW_PLAN;
				addNewPlan(sobcplnElement);
			}
			try
			{
				String sql5 = "DELETE FROM SOBCPLN " +
" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = 'R'";
				DataCommand command5 = new DataCommand(sql5);
				//Setting query parameters
				command5.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
				rowCount = command5.execute();
			}
			catch(Exception  e)
			{
			}
			// 
			if ( getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("A") )
			{
				 //goto ADD_NEW_PLAN;
				addNewPlan(sobcplnElement);
			}
			try
			{
				String sql6 = "DELETE FROM SOBCPLN " +
" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = 'A'";
				DataCommand command6 = new DataCommand(sql6);
				//Setting query parameters
				command6.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
				rowCount = command6.execute();
			}
			catch(Exception  e)
			{
			}
		}
		
		void inactivePlan(SobcplnAdapter sobcplnElement){
			// INACTIVATE_PLAN:;
			int rowCount = 0;
			if ( !getFormModel().getSCommPlanBlock().getOldCplnCode().isNull() && in(getFormModel().getSCommPlanBlock().getCplnTypeInd(), "A", "R").getValue() )
			{
				try
				{
					String sql7 = "UPDATE SOBCPLN " +
"SET SOBCPLN_ACTIVE_IND = 'N' " +
" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = :CPLN_TYPE_IND AND SOBCPLN_TERM_CODE = :CPLN_TERM_CODE AND SOBCPLN_SEQNO = :CPLN_SEQNO AND SOBCPLN_CPLN_CODE = :OLD_CPLN_CODE";
					DataCommand command7 = new DataCommand(sql7);
					//Setting query parameters
					command7.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					command7.addParameter("CPLN_TYPE_IND", getFormModel().getSCommPlanBlock().getCplnTypeInd());
					command7.addParameter("CPLN_TERM_CODE", getFormModel().getSCommPlanBlock().getCplnTermCode());
					command7.addParameter("CPLN_SEQNO", getFormModel().getSCommPlanBlock().getCplnSeqno());
					command7.addParameter("OLD_CPLN_CODE", getFormModel().getSCommPlanBlock().getOldCplnCode());
					rowCount = command7.execute();
				}
				catch(Exception  e)
				{
				}
				 //goto ADD_NEW_PLAN;
				addNewPlan(sobcplnElement);
			}
			// 
			if ( !getFormModel().getSCommPlanBlock().getOldCplnCode().isNull() && getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("S") )
			{
				try
				{
					String sql8 = "UPDATE SOBCPLN " +
"SET SOBCPLN_ACTIVE_IND = 'N' " +
" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = :CPLN_TYPE_IND AND SOBCPLN_TERM_CODE IS NULL AND SOBCPLN_SEQNO IS NULL AND SOBCPLN_CPLN_CODE = :OLD_CPLN_CODE";
					DataCommand command8 = new DataCommand(sql8);
					//Setting query parameters
					command8.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					command8.addParameter("CPLN_TYPE_IND", getFormModel().getSCommPlanBlock().getCplnTypeInd());
					command8.addParameter("OLD_CPLN_CODE", getFormModel().getSCommPlanBlock().getOldCplnCode());
					rowCount = command8.execute();
				}
				catch(Exception  e)
				{
				}
				 //goto ADD_NEW_PLAN;
				addNewPlan(sobcplnElement);
			}
			// 
			if ( getFormModel().getSCommPlanBlock().getCplnAction().notEquals("3") || getFormModel().getSCommPlanBlock().getOldCplnDesc().isNull() )
			{
				 //goto ADD_NEW_PLAN;
				addNewPlan(sobcplnElement);
			}
			try
			{
				String sql9 = "UPDATE SOBCPLN " +
"SET SOBCPLN_ACTIVE_IND = 'N' " +
" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = 'R'";
				DataCommand command9 = new DataCommand(sql9);
				//Setting query parameters
				command9.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
				rowCount = command9.execute();
			}
			catch(Exception  e)
			{
			}
			// 
			if ( getFormModel().getSCommPlanBlock().getCplnTypeInd().equals("A") )
			{
				 //goto ADD_NEW_PLAN;
				addNewPlan(sobcplnElement);
			}
			try
			{
				String sql10 = "UPDATE SOBCPLN " +
"SET SOBCPLN_ACTIVE_IND = 'N' " +
" WHERE SOBCPLN_PIDM = :CPLN_PIDM AND SOBCPLN_TYPE_IND = 'A'";
				DataCommand command10 = new DataCommand(sql10);
				//Setting query parameters
				command10.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
				rowCount = command10.execute();
			}
			catch(Exception  e)
			{
			}
		}
		
		void triggerExit(){
			// TRIGGER_EXIT:;
			getFormModel().getSCommPlanBlock().setOldCplnCode(toStr(""));
			getFormModel().getSCommPlanBlock().setOldCplnDesc(toStr(""));
			getFormModel().getSCommPlanBlock().setNewCplnCode(toStr(""));
			getFormModel().getSCommPlanBlock().setNewCplnDesc(toStr(""));
			// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
			try { 
			MessageServices.setMessageLevel(MessageLevel.NONE);
			commitTask();
			// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
			} finally {
						
			MessageServices.resetMessageLevel();
			}
						
			getFormModel().getSCommPlanBlock().setCommitInd(toStr("Y"));
			goItem(getFormModel().getSCommPlanBlock().getSaveFieldName());
			if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("C") )
			{
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				executeAction("SAVE");
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
			}
			else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("D") ) {
				executeAction("DELETE_RECORD");
			}
			else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("E") ) {
				executeAction("EXIT");
			}
			else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("I") ) {
				executeAction("CREATE_RECORD");
			}
			else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("M") ) {
				// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//					SupportClasses.SQLFORMS.DoKey("BLOCK_MENU");
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}
			else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("N") ) {
				executeAction("NEXT_RECORD");
			}
			else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("P") ) {
				executeAction("PREVIOUS_RECORD");
			}
			else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("R") ) {
				executeAction("CLEAR_FORM");
			}
			else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("U") ) {
				executeAction("DUPLICATE_RECORD");
			}
		}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-CQUERY
		 
-- -- CALL('SUAMAIL');
-- PL obsolete CALL statement with Forms9i
 --F2J_TODO: Change global current_user01 to current_user
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER01,'SUAMAIL','');
IF :OLD_CPLN_DESC IS NOT NULL THEN
   EXECUTE_TRIGGER('CHECK_MAIL');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void sCommPlanBlock_TotalResults()
		{
			
				//  -- CALL('SUAMAIL');
				//  PL obsolete CALL statement with Forms9i
				// F2J_TODO: Change global current_user01 to current_user
				//  -- CALL('SUAMAIL');
				//  PL obsolete CALL statement with Forms9i
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SUAMAIL"), toStr(""));
				if ( !getFormModel().getSCommPlanBlock().getOldCplnDesc().isNull() )
				{
					executeAction("CHECK_MAIL");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-EXIT
		 :OLD_CPLN_CODE := '';
:OLD_CPLN_DESC := '';
:NEW_CPLN_CODE := '';
:NEW_CPLN_DESC := '';
execute_trigger('check_dups');
G$_CHECK_FAILURE;

GO_FIELD(:COMM_SAVE_FIELD_NAME);
IF :KEY_FUNCTION = 'C' THEN   
   DO_KEY('COMMIT_FORM');
ELSIF :KEY_FUNCTION = 'D' THEN
   DO_KEY('DELETE_RECORD');
ELSIF :KEY_FUNCTION = 'E' THEN
   DO_KEY('EXIT_FORM');
ELSIF :KEY_FUNCTION = 'I' THEN
   DO_KEY('CREATE_RECORD');
ELSIF :KEY_FUNCTION = 'M' THEN
   DO_KEY('BLOCK_MENU');
ELSIF :KEY_FUNCTION = 'N' THEN
   DO_KEY('NEXT_RECORD');
ELSIF :KEY_FUNCTION = 'P' THEN
   DO_KEY('PREVIOUS_RECORD');
ELSIF :KEY_FUNCTION = 'R' THEN
   DO_KEY('CLEAR_FORM');
ELSIF :KEY_FUNCTION = 'U' THEN
   DO_KEY('DUPLICATE_RECORD');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void sCommPlanBlock_Exit()
		{
			
				getFormModel().getSCommPlanBlock().setOldCplnCode(toStr(""));
				getFormModel().getSCommPlanBlock().setOldCplnDesc(toStr(""));
				getFormModel().getSCommPlanBlock().setNewCplnCode(toStr(""));
				getFormModel().getSCommPlanBlock().setNewCplnDesc(toStr(""));
				executeAction("check_dups");
				getContainer().getGoqrpls().gCheckFailure();
				goItem(getFormModel().getSCommPlanBlock().getCommSaveFieldName());
				if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("C") )
				{
					executeAction("SAVE");
				}
				else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("D") ) {
					executeAction("DELETE_RECORD");
				}
				else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("E") ) {
					executeAction("EXIT");
				}
				else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("I") ) {
					executeAction("CREATE_RECORD");
				}
				else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("M") ) {
					// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
					//					SupportClasses.SQLFORMS.DoKey("BLOCK_MENU");
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
					
					
				}
				else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("N") ) {
					executeAction("NEXT_RECORD");
				}
				else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("P") ) {
					executeAction("PREVIOUS_RECORD");
				}
				else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("R") ) {
					executeAction("CLEAR_FORM");
				}
				else if ( getFormModel().getSCommPlanBlock().getKeyFunction().equals("U") ) {
					executeAction("DUPLICATE_RECORD");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.KEY-LISTVAL
		 -- -- CALL('SOAPLAN');
-- PL obsolete CALL statement with Forms9i
 --F2J_TODO: Change global current_user01 to current_user
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER01,'SOAPLAN','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void sCommPlanBlock_ListValues()
		{
			
				//  -- CALL('SOAPLAN');
				//  PL obsolete CALL statement with Forms9i
				// F2J_TODO: Change global current_user01 to current_user
				//  -- CALL('SOAPLAN');
				//  PL obsolete CALL statement with Forms9i
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SOAPLAN"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER S$_COMM_PLAN_BLOCK.PRE_BLOCK_TRG
		 IF :SYSTEM.CURSOR_BLOCK <> 'S$_COMM_PLAN_BLOCK' THEN
   :SAVE_FIELD_NAME := :SYSTEM.CURSOR_FIELD;
END IF;
:COMMIT_IND := '';
--
BEGIN
  SELECT STVCPLN_DESC, 'I'
  INTO   :OLD_CPLN_DESC, :DELETE_PLAN
  FROM   STVCPLN
  WHERE  STVCPLN_CODE = :OLD_CPLN_CODE;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    :DELETE_PLAN := 'N';
END;
<<NEW_PLAN>>
BEGIN
  SELECT STVCPLN_DESC, 'Y'
  INTO   :NEW_CPLN_DESC, :ADD_PLAN
  FROM   STVCPLN
  WHERE  STVCPLN_CODE = :NEW_CPLN_CODE;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    :ADD_PLAN := 'N';
END;
--
---- :PENDING_MAIL := 'N';
:DELETE_MAIL  := 'N';
IF :OLD_CPLN_DESC IS NOT NULL THEN
   :DELETE_PLAN := 'I';
   EXECUTE_TRIGGER('CHECK_MAIL');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * S$_COMM_PLAN_BLOCK.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void sCommPlanBlock_PreBlockTrg()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				int rowCount = 0;
				if ( getCursorBlock().notEquals("S$_COMM_PLAN_BLOCK") )
				{
					getFormModel().getSCommPlanBlock().setSaveFieldName(toStr(getCursorField()));
				}
				getFormModel().getSCommPlanBlock().setCommitInd(toStr(""));
				try
				{
					String sql1 = "SELECT STVCPLN_DESC, 'I' " +
	" FROM STVCPLN " +
	" WHERE STVCPLN_CODE = :OLD_CPLN_CODE ";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("OLD_CPLN_CODE", getFormModel().getSCommPlanBlock().getOldCplnCode());
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						getFormModel().getSCommPlanBlock().setOldCplnDesc(results1.getStr(0));
						sobcplnElement.setDeletePlan(results1.getStr(1));
					}
					results1.close();
				}
				catch(NoDataFoundException e)
				{
					sobcplnElement.setDeletePlan(toStr("N"));
				}
				 NEW_PLAN:;
				try
				{
					String sql2 = "SELECT STVCPLN_DESC, 'Y' " +
	" FROM STVCPLN " +
	" WHERE STVCPLN_CODE = :NEW_CPLN_CODE ";
					DataCommand command2 = new DataCommand(sql2);
					//Setting query parameters
					command2.addParameter("NEW_CPLN_CODE", getFormModel().getSCommPlanBlock().getNewCplnCode());
					ResultSet results2 = command2.executeQuery();
					rowCount = command2.getRowCount();
					if ( results2.hasData() ) {
						getFormModel().getSCommPlanBlock().setNewCplnDesc(results2.getStr(0));
						getFormModel().getSCommPlanBlock().setAddPlan(results2.getStr(1));
					}
					results2.close();
				}
				catch(NoDataFoundException e)
				{
					getFormModel().getSCommPlanBlock().setAddPlan(toStr("N"));
				}
				// 
				// -- :PENDING_MAIL := 'N';
				sobcplnElement.setDeleteMail(toStr("N"));
				if ( !getFormModel().getSCommPlanBlock().getOldCplnDesc().isNull() )
				{
					sobcplnElement.setDeletePlan(toStr("I"));
					executeAction("CHECK_MAIL");
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_TERM_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SOBCPLN_TERM_CODE_LBT")
		public void sobcplnTermCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN_TERM_CODE_LBT.WHEN-BUTTON-PRESSED
		 GO_ITEM('SOBCPLN.SOBCPLN_TERM_CODE');
DO_KEY('LIST_VALUES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_TERM_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SOBCPLN_TERM_CODE_LBT")
		public void sobcplnTermCodeLbt_buttonClick()
		{
			
				goItem(toStr("SOBCPLN.SOBCPLN_TERM_CODE"));
				executeAction("LIST_VALUES");
			}

		
		/* Original PL/SQL code code for TRIGGER COMM_PLAN_CANVAS_RETURN_BTN.WHEN-BUTTON-PRESSED
		 go_block('sobcpln');
execute_trigger('sobcpln_return');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COMM_PLAN_CANVAS_RETURN_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="COMM_PLAN_CANVAS_RETURN_BTN")
		public void commPlanCanvasReturnBtn_buttonClick()
		{
			
				goBlock(toStr("sobcpln"));
				executeAction("sobcpln_return");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_CPLN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SOBCPLN_CPLN_CODE_LBT")
		public void sobcplnCplnCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER COMM_PLAN_MAIL_BTN.WHEN-BUTTON-PRESSED
		   execute_trigger('SAVE_KEYS');

  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
   --F2J_TODO: Change global current_user01 to current_user
  G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER01, 'SUAMAIL','');
  G$_CHECK_FAILURE;

  execute_trigger('check_mail');



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COMM_PLAN_MAIL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="COMM_PLAN_MAIL_BTN")
		public void commPlanMailBtn_buttonClick()
		{
			
				executeAction("SAVE_KEYS");
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SUAMAIL"), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
				executeAction("check_mail");
			}

		
		/* Original PL/SQL code code for TRIGGER COMM_PLAN_CANVAS_SAVE_BTN.WHEN-BUTTON-PRESSED
		  do_key('COMMIT_FORM');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COMM_PLAN_CANVAS_SAVE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="COMM_PLAN_CANVAS_SAVE_BTN")
		public void commPlanCanvasSaveBtn_buttonClick()
		{
			
				executeAction("SAVE");
			}

		
		/* Original PL/SQL code code for TRIGGER COMM_PLAN_CANVAS_EXIT_BTN.WHEN-BUTTON-PRESSED
		 -- force commit before exiting block so that the validations
-- of multiple com plan, type, term, seq and active status
-- will be validated.
if :system.form_status = 'CHANGED' then 
  message( G$_NLS.Get('SOQOLIB-0143', 'FORM','*ERROR* Commit Your Communication Plan Changes Before Proceeding.') );
elsif :commit_ind = 'P' then 
  message( G$_NLS.Get('SOQOLIB-0144', 'FORM','*ERROR* Pending Errors; Correct Errors Before Proceeding.') );
else
  exit_form;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COMM_PLAN_CANVAS_EXIT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="COMM_PLAN_CANVAS_EXIT_BTN")
		public void commPlanCanvasExitBtn_buttonClick()
		{
			
				//  force commit before exiting block so that the validations
				//  of multiple com plan, type, term, seq and active status
				//  will be validated.
				//  force commit before exiting block so that the validations
				//  of multiple com plan, type, term, seq and active status
				//  will be validated.
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0143"), toStr("FORM"), toStr("*ERROR* Commit Your Communication Plan Changes Before Proceeding.")));
				}
				else if ( getFormModel().getSCommPlanBlock().getCommitInd().equals("P") ) {
					errorMessage(GNls.Fget(toStr("SOQOLIB-0144"), toStr("FORM"), toStr("*ERROR* Pending Errors; Correct Errors Before Proceeding.")));
				}
				else {
					exitTask();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER COMM_PLAN_PLAN_BTN.WHEN-BUTTON-PRESSED
		   execute_trigger('SAVE_KEYS');
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
   --F2J_TODO: Change global current_user01 to current_user
  g$_secured_form_call(:global.current_user01, 'SOAPLAN','');

   


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * COMM_PLAN_PLAN_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="COMM_PLAN_PLAN_BTN")
		public void commPlanPlanBtn_buttonClick()
		{
			
				executeAction("SAVE_KEYS");
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SOAPLAN"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER ADD_PLAN.WHEN-VALIDATE-ITEM
		 IF :ADD_PLAN NOT IN ('N','Y') THEN
   MESSAGE( G$_NLS.Get('SOQOLIB-0145', 'FORM','*ERROR* Add flag must be (Y)es or (N)o.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
IF :ADD_PLAN = 'Y' AND
   :NEW_CPLN_CODE IS NULL THEN
   :ADD_PLAN := 'N';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADD_PLAN.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ADD_PLAN")
		public void addPlan_validate()
		{
			
				if ( !in(getFormModel().getSCommPlanBlock().getAddPlan(), "N", "Y").getValue() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0145"), toStr("FORM"), toStr("*ERROR* Add flag must be (Y)es or (N)o.")));
					throw new ApplicationException();
				}
				// 
				if ( getFormModel().getSCommPlanBlock().getAddPlan().equals("Y") && getFormModel().getSCommPlanBlock().getNewCplnCode().isNull() )
				{
					getFormModel().getSCommPlanBlock().setAddPlan(toStr("N"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DELETE_PLAN_COMM.WHEN-VALIDATE-ITEM
		 IF :DELETE_PLAN NOT IN ('I','N','Y') THEN
   MESSAGE( G$_NLS.Get('SOQOLIB-0146', 'FORM','*ERROR* Delete flag must be Y/N or (I)nactivate.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
IF :DELETE_PLAN IN ('Y','I') AND
   :OLD_CPLN_DESC IS NULL THEN
   :DELETE_PLAN := 'N';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DELETE_PLAN_COMM.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="DELETE_PLAN_COMM")
		public void deletePlanComm_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				if ( !in(sobcplnElement.getDeletePlan(), "I", "N", "Y").getValue() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0146"), toStr("FORM"), toStr("*ERROR* Delete flag must be Y/N or (I)nactivate.")));
					throw new ApplicationException();
				}
				// 
				if ( in(sobcplnElement.getDeletePlan(), "Y", "I").getValue() && getFormModel().getSCommPlanBlock().getOldCplnDesc().isNull() )
				{
					sobcplnElement.setDeletePlan(toStr("N"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DELETE_MAIL_COMM.WHEN-VALIDATE-ITEM
		 IF :DELETE_MAIL NOT IN ('N','Y') THEN
   MESSAGE( G$_NLS.Get('SOQOLIB-0147', 'FORM','*ERROR* Delete flag must be (Y)es or (N)o.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
IF :DELETE_MAIL = 'Y' AND
   :PENDING_MAIL = 'N' THEN
   :DELETE_MAIL := 'N';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DELETE_MAIL_COMM.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="DELETE_MAIL_COMM")
		public void deleteMailComm_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				if ( !in(sobcplnElement.getDeleteMail(), "N", "Y").getValue() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0147"), toStr("FORM"), toStr("*ERROR* Delete flag must be (Y)es or (N)o.")));
					throw new ApplicationException();
				}
				// 
				if ( sobcplnElement.getDeleteMail().equals("Y") && getFormModel().getSCommPlanBlock().getPendingMail().equals("N") )
				{
					sobcplnElement.setDeleteMail(toStr("N"));
				}
			}

		
	
	
}

