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
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
public class SobcplnController extends AbstractSupportCodeObject {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public SobcplnController(ISupportCodeContainer container) 
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
		/* Original PL/SQL code code for TRIGGER SOBCPLN.KEY-COMMIT
		 
declare 
	cursor actc is 
	  select to_char(sobcpln_activity_date,G$_DATE.GET_NLS_DATE_FORMAT)
	  , G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY')
	  from sobcpln
	  where sobcpln_pidm = :cpln_pidm
	  order by sobcpln_activity_date;
	 
	 date1  date;
	 date2  date;
begin 
<multilinecomment>	open actc;
	loop
		 fetch actc into date1, date2;
		 exit when actc%notfound;
		 message('date 1 ' || date1  || ' date2 ' || date2);
	end loop;
	close actc; </multilinecomment>
	
  update sobcpln
  set sobcpln_activity_date = sysdate
  where sobcpln_pidm = :cpln_pidm
  and to_char(sobcpln_activity_date,G$_DATE.GET_NLS_DATE_FORMAT) = G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY');
end; 
   
execute_trigger('sobcpln_commit');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void sobcpln_Save()
		{
			
				int rowCount = 0;
				{
					String sqlactc = "SELECT to_char(sobcpln_activity_date, G$_DATE.GET_NLS_DATE_FORMAT), G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY') " +
	" FROM sobcpln " +
	" WHERE sobcpln_pidm = :CPLN_PIDM " +
	" ORDER BY sobcpln_activity_date";
					DataCursor actc = new DataCursor(sqlactc);
					try {
						NDate date1= NDate.getNull();
						NDate date2= NDate.getNull();
						// 	open actc;
						// loop
						// fetch actc into date1, date2;
						// exit when actc%notfound;
						// message('date 1 ' || date1  || ' date2 ' || date2);
						// end loop;
						// close actc; 
					}
					finally {
						actc.close();
					}
					String sql1 = "UPDATE sobcpln " +
	"SET sobcpln_activity_date = sysdate " +
	" WHERE sobcpln_pidm = :CPLN_PIDM AND to_char(sobcpln_activity_date, G$_DATE.GET_NLS_DATE_FORMAT) = G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY')";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
					rowCount = command1.execute();
				}
				executeAction("sobcpln_commit");
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.KEY-DELREC
		 execute_trigger('delete_materials');
DELETE_RECORD; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sobcpln_DeleteRecord()
		{
			
				executeAction("delete_materials");
				deleteRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.KEY-DUP-ITEM
		 execute_trigger('sobcpln_return');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void sobcpln_KeyDupItem()
		{
			
				executeAction("sobcpln_return");
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.KEY-EXIT
		 -- force commit before exiting block so that the validations
-- of multiple com plan, type, term, seq and active status
-- will be validated.
if :system.form_status = 'CHANGED' then 
  message( G$_NLS.Get('SOQOLIB-0104', 'FORM','*ERROR* Commit Your Communication Plan Changes Before Proceeding.') );
elsif :commit_ind = 'P' then 
  message( G$_NLS.Get('SOQOLIB-0105', 'FORM','*ERROR* Pending Errors; Correct Errors Before Proceeding.') );
else
  g$_goqolib_key_trigger.b2k_exit_form;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void sobcpln_Exit()
		{
			
				//  force commit before exiting block so that the validations
				//  of multiple com plan, type, term, seq and active status
				//  will be validated.
				//  force commit before exiting block so that the validations
				//  of multiple com plan, type, term, seq and active status
				//  will be validated.
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0104"), toStr("FORM"), toStr("*ERROR* Commit Your Communication Plan Changes Before Proceeding.")));
				}
				else if ( getFormModel().getSCommPlanBlock().getCommitInd().equals("P") ) {
					errorMessage(GNls.Fget(toStr("SOQOLIB-0105"), toStr("FORM"), toStr("*ERROR* Pending Errors; Correct Errors Before Proceeding.")));
				}
				else {
					getContainer().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.KEY-EDIT
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.KEY-EDIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EDIT")
		public void sobcpln_KeyEdit()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.KEY-NXTBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
RAISE FORM_TRIGGER_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sobcpln_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.KEY-NXTREC
		 
  IF :System.Last_Record <> 'TRUE' THEN 
    Next_Record; 
  ELSE 
   :system.message_level := '5';
    next_record; 
   :system.message_level := '0';
  END IF; 



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sobcpln_NextRecord()
		{
			
				if ( !isInLastRecord() )
				{
					nextRecord();
				}
				else {
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
					nextRecord();
					// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.KEY-PRVBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sobcpln_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.PRE-INSERT
		 if :sobcpln_cpln_code is null then 
   return;
end if;

-- execute_trigger('check_modules_old');
-- g$_check_failure; 

:sobcpln_pidm := :cpln_pidm;
:sobcpln_activity_date := sysdate;
:sobcpln_active_ind := 'Y';





		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void sobcpln_BeforeRowInsert(RowAdapterEvent args)
		{
			
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)args.getRow();


				if ( sobcplnElement.getSobcplnCplnCode().isNull() )
				{
					return ;
				}
				//  execute_trigger('check_modules_old');
				//  g$_check_failure; 
				sobcplnElement.setSobcplnPidm(getFormModel().getSCommPlanBlock().getCplnPidm());
				sobcplnElement.setSobcplnActivityDate(NDate.getNow());
				sobcplnElement.setSobcplnActiveInd(toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.PRE-UPDATE
		 -- execute_trigger('check_modules_old');
-- g$_check_failure; 

if :delete_mail = 'Y' then 
   execute_trigger('delete_materials');
end if;

:sobcpln_activity_date := sysdate;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void sobcpln_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				//  execute_trigger('check_modules_old');
				//  g$_check_failure; 
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)args.getRow();


				//  execute_trigger('check_modules_old');
				//  g$_check_failure; 
				if ( sobcplnElement.getDeleteMail().equals("Y") )
				{
					executeAction("delete_materials");
				}
				sobcplnElement.setSobcplnActivityDate(NDate.getNow());
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.WHEN_NEW_BLOCK_INSTANCE_TRG
		 --  this trigger executes the query on the block and then
--  puts the cursor on the record pertaining to the student
--  record on the main form block.

if :system.block_status = 'CHANGED' then 
  return;
end if;
if :sobcpln_return_object is not null then 
      g$_navigation_frame.disable_option(:sobcpln_return_object,
         :sobcpln_return_item);
end if;
:system.message_level := '5';
execute_query;
:system.message_level := '0';

declare
   record_place_cnt number := 0;
   applterm varchar2(30);
   applno number;
   plan   varchar2(30);
   record_found number := 0;
   type_ind varchar2(1);
   
 
   cursor record_place is 
     select sobcpln_cpln_code, sobcpln_term_code,
       sobcpln_seqno, sobcpln_type_ind
     from sobcpln 
     where sobcpln_pidm = :cpln_pidm 
       and sobcpln_active_ind = 'Y'
     order by sobcpln_type_ind, sobcpln_term_code desc,
        sobcpln_seqno desc, sobcpln_cpln_code;
BEGIN
     open record_place; 
     :comm_record_place := 1;
     loop 
         fetch record_place into plan, applterm, applno, type_ind ;
         exit when record_place%notfound;
         record_place_cnt := record_place_cnt + 1;
         if plan = nvl(:new_cpln_code,:old_cpln_code)
           and type_ind = :cpln_type_ind
           and nvl(applterm,'999999') = nvl(:cpln_term_code,'999999') 
           and nvl(applno,0) = nvl(:cpln_seqno,0) then 
             record_found := 1;
             exit;
         end if;
     end loop;
     close record_place;
     if not ( record_place_cnt = 0 or record_found = 0 ) then 
          :comm_record_place := record_place_cnt;
          go_record(record_place_cnt);
     end if;
  end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void sobcpln_WhenNewBlockInstanceTrg()
		{
			
				//   this trigger executes the query on the block and then
				//   puts the cursor on the record pertaining to the student
				//   record on the main form block.
				int rowCount = 0;
				//   this trigger executes the query on the block and then
				//   puts the cursor on the record pertaining to the student
				//   record on the main form block.
				if ( getBlockStatus().equals("CHANGED") )
				{
					return ;
				}
				if ( !getFormModel().getSCommPlanBlock().getSobcplnReturnObject().isNull() )
				{
					getContainer().getGoqrpls().getGNavigationFrame().disableOption(getFormModel().getSCommPlanBlock().getSobcplnReturnObject(), getFormModel().getSCommPlanBlock().getSobcplnReturnItem());
				}
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				executeQuery();
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				{
					NNumber recordPlaceCnt = toNumber(0);
					NString applterm= NString.getNull();
					NNumber applno= NNumber.getNull();
					NString plan= NString.getNull();
					NNumber recordFound = toNumber(0);
					NString typeInd= NString.getNull();
					String sqlrecordPlace = "SELECT sobcpln_cpln_code, sobcpln_term_code, sobcpln_seqno, sobcpln_type_ind " +
	" FROM sobcpln " +
	" WHERE sobcpln_pidm = :CPLN_PIDM AND sobcpln_active_ind = 'Y' " +
	" ORDER BY sobcpln_type_ind, sobcpln_term_code DESC, sobcpln_seqno DESC, sobcpln_cpln_code";
					DataCursor recordPlace = new DataCursor(sqlrecordPlace);
					try {
						//Setting query parameters
						recordPlace.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable recordPlace.
						recordPlace.open();
						getFormModel().getSCommPlanBlock().setCommRecordPlace(toNumber(1));
						while (true) {
							ResultSet recordPlaceResults = recordPlace.fetchInto();
							if ( recordPlaceResults != null ) {
								plan = recordPlaceResults.getStr(0);
								applterm = recordPlaceResults.getStr(1);
								applno = recordPlaceResults.getNumber(2);
								typeInd = recordPlaceResults.getStr(3);
							}
							if ( recordPlace.notFound() ) 
								break;
							recordPlaceCnt = recordPlaceCnt.add(1);
							if ( plan.equals(isNull(getFormModel().getSCommPlanBlock().getNewCplnCode(), getFormModel().getSCommPlanBlock().getOldCplnCode())) && typeInd.equals(getFormModel().getSCommPlanBlock().getCplnTypeInd()) && isNull(applterm, "999999").equals(isNull(getFormModel().getSCommPlanBlock().getCplnTermCode(), "999999")) && isNull(applno, 0).equals(isNull(getFormModel().getSCommPlanBlock().getCplnSeqno(), 0)) )
							{
								recordFound = toNumber(1);
									break;
							}
						}
					} 
					finally {
						recordPlace.close();
					}
					if ( !(recordPlaceCnt.equals(0) || recordFound.equals(0)) )
					{
						getFormModel().getSCommPlanBlock().setCommRecordPlace(recordPlaceCnt);
						setCurrentRecord(recordPlaceCnt);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.WHEN-NEW-RECORD-INSTANCE
		 <multilinecomment>  this logic will format a message on the comm plan
    and record status and display the message </multilinecomment>

declare
  modname varchar2(30) := '';

-- format auto hint to reflect record status 
-- automatic insert of new comm plans puts activity date
-- with value 01-jan-1900 so they can be distinquished 
-- from existing comm plans

begin
if :sobcpln_type_ind = 'A' then 
    modname :=  G$_NLS.Get('SOQOLIB-0106', 'FORM','Admissions') ;
elsif :sobcpln_type_ind = 'R' then 
    modname :=  G$_NLS.Get('SOQOLIB-0107', 'FORM','Recruit') ;
else 
    modname :=  G$_NLS.Get('SOQOLIB-0108', 'FORM','Student') ;  
end if;
if :insert_flag is null then 
   :insert_flag := 'N';
end if;
--  different format statements for student comm plans
--  which does not have term and seq no

if :sobcpln_type_ind = 'S'  then 
  if ( to_char(:sobcpln_activity_date,G$_DATE.GET_NLS_DATE_FORMAT) = G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY')
      or :insert_flag = 'Y')   and 
   :sobcpln_type_ind = :cpln_type_ind and
   :insert_complete = 'Y' and 
   nvl(:cpln_action,'1') <> '2' then 
   :cpln_message := 
      G$_NLS.Get('SOQOLIB-0109', 'FORM',
	'*New* %01% Communication Plan %02%'   
	,  modname ,  
     :sobcpln_CPLN_code  );
     :sobcpln_activity_date := sysdate;
     :insert_flag := 'Y';

  elsif to_char(:sobcpln_activity_date,G$_DATE.GET_NLS_DATE_FORMAT) <> G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY') and 
   :insert_flag = 'N' and 
   :sobcpln_type_ind = :cpln_type_ind and 
   :cpln_action = '2' then 
   :cpln_message := 
      G$_NLS.Get('SOQOLIB-0110', 'FORM',
	'*Inactivate or Delete* %01% Communication Plan %02%.'   
	,  modname ,  
     :sobcpln_CPLN_code );
  elsif :system.record_status = 'NEW' or 
   :sobcpln_cpln_code is null then
    :cpln_message :=  G$_NLS.Get('SOQOLIB-0111', 'FORM','Enter new communication plan.') ;
  else
    :cpln_message := 
       G$_NLS.Get('SOQOLIB-0112', 'FORM',
	'%01% Communication Plan %02%.'  
	, modname ,  
     :sobcpln_CPLN_code   );
  end if;
--  format statements for recruit and admissions with term & seq no 
else 
  if ( to_char(:sobcpln_activity_date,G$_DATE.GET_NLS_DATE_FORMAT) = G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY') 
     or :insert_flag = 'Y')  and 
   :sobcpln_term_code = :cpln_term_code and 
   :sobcpln_seqno = :cpln_seqno and 
   :sobcpln_type_ind = :cpln_type_ind and 
   :insert_complete = 'Y' and 
   nvl(:cpln_action,'1') <> '2' then 
   :cpln_message := 
      G$_NLS.Get('SOQOLIB-0113', 'FORM',
	'*New* %01% Communication Plan %02% Inserted for Term %03% and Sequence %04%.'     
	,  modname ,  
     :sobcpln_CPLN_code  ,  
     :sobcpln_term_code ,  
     to_char(:sobcpln_seqno) );
     :sobcpln_activity_date := sysdate;
     :insert_flag := 'Y';

  elsif to_char(:sobcpln_activity_date,G$_DATE.GET_NLS_DATE_FORMAT) <> G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY') and 
   :insert_flag = 'N' and 
   :sobcpln_term_code = :cpln_term_code and 
   :sobcpln_seqno = :cpln_seqno and 
   :sobcpln_type_ind = :cpln_type_ind and 
   :cpln_action = '2' then 
   :cpln_message := 
      G$_NLS.Get('SOQOLIB-0114', 'FORM',
	'*Inactivate or Delete* %01% Communication Plan %02% for Term %03% and Sequence %04%.'     
	,  modname ,  
     :sobcpln_CPLN_code  ,  
     :sobcpln_term_code ,  
     to_char(:sobcpln_seqno) );
  elsif :system.record_status = 'NEW' or 
   :sobcpln_cpln_code is null then
    :cpln_message :=  G$_NLS.Get('SOQOLIB-0115', 'FORM','Enter new communication plan.') ;
  else
    :cpln_message := 
       G$_NLS.Get('SOQOLIB-0116', 'FORM',
	'%01% Communication Plan %02% for Term %03% and Sequence %04%.'    
	, modname ,  
     :sobcpln_CPLN_code  ,  
     :sobcpln_term_code ,  
     to_char(:sobcpln_seqno) );
  end if;
end if;
end; 

-- display the formated message
if :s$_comm_plan_block.commit_form_message is not null then
  message(:s$_comm_plan_block.commit_form_message || ' ' ||  :cpln_message);
else
  message(:cpln_message);
end if;
:s$_comm_plan_block.commit_form_message := '';


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sobcpln_recordChange()
		{
			
				//   this logic will format a message on the comm plan
				// and record status and display the message 

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				{
					NString modname = toStr("");
					if ( sobcplnElement.getSobcplnTypeInd().equals("A") )
					{
						modname = GNls.Fget(toStr("SOQOLIB-0106"), toStr("FORM"), toStr("Admissions"));
					}
					else if ( sobcplnElement.getSobcplnTypeInd().equals("R") ) {
						modname = GNls.Fget(toStr("SOQOLIB-0107"), toStr("FORM"), toStr("Recruit"));
					}
					else {
						modname = GNls.Fget(toStr("SOQOLIB-0108"), toStr("FORM"), toStr("Student"));
					}
					if ( sobcplnElement.getInsertFlag().isNull() )
					{
						sobcplnElement.setInsertFlag(toStr("N"));
					}
					//   different format statements for student comm plans
					//   which does not have term and seq no
					if ( sobcplnElement.getSobcplnTypeInd().equals("S") )
					{
						// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
						if ( (toChar(sobcplnElement.getSobcplnActivityDate(), GDate.getNlsDateFormat()).equals(GDate.normaliseGregDate(toStr("01-01-1900"), toStr("DD-MM-YYYY"))) || sobcplnElement.getInsertFlag().equals("Y")) && sobcplnElement.getSobcplnTypeInd().equals(getFormModel().getSCommPlanBlock().getCplnTypeInd()) && getFormModel().getSCommPlanBlock().getInsertComplete().equals("Y") && isNull(getFormModel().getSCommPlanBlock().getCplnAction(), "1").notEquals("2") )
						{
							sobcplnElement.setCplnMessage(GNls.Fget(toStr("SOQOLIB-0109"), toStr("FORM"), toStr("*New* %01% Communication Plan %02%"), modname, sobcplnElement.getSobcplnCplnCode()));
							sobcplnElement.setSobcplnActivityDate(NDate.getNow());
							sobcplnElement.setInsertFlag(toStr("Y"));
						}
						else if ( toChar(sobcplnElement.getSobcplnActivityDate(), GDate.getNlsDateFormat()).notEquals(GDate.normaliseGregDate(toStr("01-01-1900"), toStr("DD-MM-YYYY"))) && sobcplnElement.getInsertFlag().equals("N") && sobcplnElement.getSobcplnTypeInd().equals(getFormModel().getSCommPlanBlock().getCplnTypeInd()) && getFormModel().getSCommPlanBlock().getCplnAction().equals("2") ) {
							sobcplnElement.setCplnMessage(GNls.Fget(toStr("SOQOLIB-0110"), toStr("FORM"), toStr("*Inactivate or Delete* %01% Communication Plan %02%."), modname, sobcplnElement.getSobcplnCplnCode()));
						}
						else if ( getRecordStatus().equals("NEW") || sobcplnElement.getSobcplnCplnCode().isNull() ) {
							sobcplnElement.setCplnMessage(GNls.Fget(toStr("SOQOLIB-0111"), toStr("FORM"), toStr("Enter new communication plan.")));
						}
						else {
							sobcplnElement.setCplnMessage(GNls.Fget(toStr("SOQOLIB-0112"), toStr("FORM"), toStr("%01% Communication Plan %02%."), modname, sobcplnElement.getSobcplnCplnCode()));
						}
					}
					else {
						// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
						if ( (toChar(sobcplnElement.getSobcplnActivityDate(), GDate.getNlsDateFormat()).equals(GDate.normaliseGregDate(toStr("01-01-1900"), toStr("DD-MM-YYYY"))) || sobcplnElement.getInsertFlag().equals("Y")) && sobcplnElement.getSobcplnTermCode().equals(getFormModel().getSCommPlanBlock().getCplnTermCode()) && sobcplnElement.getSobcplnSeqno().equals(getFormModel().getSCommPlanBlock().getCplnSeqno()) && sobcplnElement.getSobcplnTypeInd().equals(getFormModel().getSCommPlanBlock().getCplnTypeInd()) && getFormModel().getSCommPlanBlock().getInsertComplete().equals("Y") && isNull(getFormModel().getSCommPlanBlock().getCplnAction(), "1").notEquals("2") )
						{
							sobcplnElement.setCplnMessage(GNls.Fget(toStr("SOQOLIB-0113"), toStr("FORM"), toStr("*New* %01% Communication Plan %02% Inserted for Term %03% and Sequence %04%."), modname, sobcplnElement.getSobcplnCplnCode(), sobcplnElement.getSobcplnTermCode(), toChar(sobcplnElement.getSobcplnSeqno())));
							sobcplnElement.setSobcplnActivityDate(NDate.getNow());
							sobcplnElement.setInsertFlag(toStr("Y"));
						}
						else if ( toChar(sobcplnElement.getSobcplnActivityDate(), GDate.getNlsDateFormat()).notEquals(GDate.normaliseGregDate(toStr("01-01-1900"), toStr("DD-MM-YYYY"))) && sobcplnElement.getInsertFlag().equals("N") && sobcplnElement.getSobcplnTermCode().equals(getFormModel().getSCommPlanBlock().getCplnTermCode()) && sobcplnElement.getSobcplnSeqno().equals(getFormModel().getSCommPlanBlock().getCplnSeqno()) && sobcplnElement.getSobcplnTypeInd().equals(getFormModel().getSCommPlanBlock().getCplnTypeInd()) && getFormModel().getSCommPlanBlock().getCplnAction().equals("2") ) {
							sobcplnElement.setCplnMessage(GNls.Fget(toStr("SOQOLIB-0114"), toStr("FORM"), toStr("*Inactivate or Delete* %01% Communication Plan %02% for Term %03% and Sequence %04%."), modname, sobcplnElement.getSobcplnCplnCode(), sobcplnElement.getSobcplnTermCode(), toChar(sobcplnElement.getSobcplnSeqno())));
						}
						else if ( getRecordStatus().equals("NEW") || sobcplnElement.getSobcplnCplnCode().isNull() ) {
							sobcplnElement.setCplnMessage(GNls.Fget(toStr("SOQOLIB-0115"), toStr("FORM"), toStr("Enter new communication plan.")));
						}
						else {
							sobcplnElement.setCplnMessage(GNls.Fget(toStr("SOQOLIB-0116"), toStr("FORM"), toStr("%01% Communication Plan %02% for Term %03% and Sequence %04%."), modname, sobcplnElement.getSobcplnCplnCode(), sobcplnElement.getSobcplnTermCode(), toChar(sobcplnElement.getSobcplnSeqno())));
						}
					}
				}
				//  display the formated message
				if ( !getFormModel().getSCommPlanBlock().getCommitFormMessage().isNull() )
				{
					message(getFormModel().getSCommPlanBlock().getCommitFormMessage().append(" ").append(sobcplnElement.getCplnMessage()));
				}
				else {
					warningMessage(sobcplnElement.getCplnMessage());
				}
				getFormModel().getSCommPlanBlock().setCommitFormMessage(toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.DELETE_MATERIALS
		  IF :sobcpln_TYPE_IND = 'S' THEN
     BEGIN
       DELETE FROM GURMAIL
       WHERE  GURMAIL_PIDM        = :sobcpln_pidm
         AND  GURMAIL_SYSTEM_IND  = 'S'
         AND  GURMAIL_MODULE_CODE = :sobcpln_TYPE_IND
         AND  GURMAIL_ORIG_IND    = 'S'
         AND  GURMAIL_DATE_PRINTED IS NULL
         AND  GURMAIL_CPLN_CODE   = :sobcpln_cpln_CODE;
     EXCEPTION
       WHEN NO_DATA_FOUND THEN
         NULL;
     END;
  ELSE
     BEGIN
       DELETE  GURMAIL
       WHERE  GURMAIL_PIDM        = :sobcpln_PIDM
         AND  GURMAIL_SYSTEM_IND  = 'S'
         AND  GURMAIL_MODULE_CODE = :sobcpln_TYPE_IND
         AND  GURMAIL_TERM_CODE   = :sobcpln_TERM_CODE
         AND  GURMAIL_ADMIN_IDENTIFIER = :sobcpln_SEQNO
         AND  GURMAIL_ORIG_IND    = 'S'
         AND  GURMAIL_DATE_PRINTED IS NULL
         AND  GURMAIL_CPLN_CODE   = :sobcpln_cpln_CODE;
     EXCEPTION
     WHEN NO_DATA_FOUND THEN
        NULL;
     END; 
  END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.DELETE_MATERIALS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DELETE_MATERIALS")
		public void sobcpln_DeleteMaterials()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				int rowCount = 0;
				if ( sobcplnElement.getSobcplnTypeInd().equals("S") )
				{
					try
					{
						String sql1 = "DELETE FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :SOBCPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = :SOBCPLN_TYPE_IND AND GURMAIL_ORIG_IND = 'S' AND GURMAIL_DATE_PRINTED IS NULL AND GURMAIL_CPLN_CODE = :SOBCPLN_CPLN_CODE";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("SOBCPLN_PIDM", sobcplnElement.getSobcplnPidm());
						command1.addParameter("SOBCPLN_TYPE_IND", sobcplnElement.getSobcplnTypeInd());
						command1.addParameter("SOBCPLN_CPLN_CODE", sobcplnElement.getSobcplnCplnCode());
						rowCount = command1.execute();
					}
					catch(NoDataFoundException e)
					{
					}
				}
				else {
					try
					{
						String sql2 = "DELETE FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :SOBCPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = :SOBCPLN_TYPE_IND AND GURMAIL_TERM_CODE = :SOBCPLN_TERM_CODE AND GURMAIL_ADMIN_IDENTIFIER = :SOBCPLN_SEQNO AND GURMAIL_ORIG_IND = 'S' AND GURMAIL_DATE_PRINTED IS NULL AND GURMAIL_CPLN_CODE = :SOBCPLN_CPLN_CODE";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("SOBCPLN_PIDM", sobcplnElement.getSobcplnPidm());
						command2.addParameter("SOBCPLN_TYPE_IND", sobcplnElement.getSobcplnTypeInd());
						command2.addParameter("SOBCPLN_TERM_CODE", sobcplnElement.getSobcplnTermCode());
						command2.addParameter("SOBCPLN_SEQNO", sobcplnElement.getSobcplnSeqno());
						command2.addParameter("SOBCPLN_CPLN_CODE", sobcplnElement.getSobcplnCplnCode());
						rowCount = command2.execute();
					}
					catch(NoDataFoundException e)
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.CALL_SRASUMI
		 ----    :hold_field := :system.cursor_item;
   EXECUTE_TRIGGER ('SAVE_KEYS');
   :GLOBAL.SUM_RECR_TERM := '';
   :GLOBAL.SUM_RECR_ADMIN_SEQNO := '';
   IF :SOBCPLN_TERM_CODE IS NULL THEN
      :GLOBAL.KEY_TERM := '';
   ELSE
      :GLOBAL.KEY_TERM := :SOBCPLN_TERM_CODE;
   END IF;
   :GLOBAL.FORM_WAS_CALLED := 'Y';
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
   --F2J_TODO: Change global current_user01 to current_user
  G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER01,'SRASUMI','QUERY');
   IF :GLOBAL.SUM_RECR_TERM IS NULL THEN
         NULL;
   ELSE
         :SOBCPLN_TERM_CODE := :GLOBAL.SUM_RECR_TERM;
         NEXT_FIELD;
         :SOBCPLN_SEQNO := :GLOBAL.SUM_RECR_ADMIN_SEQNO;
         NEXT_FIELD;
   END IF;
   :GLOBAL.FORM_WAS_CALLED := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.CALL_SRASUMI
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CALL_SRASUMI")
		public void sobcpln_CallSrasumi()
		{
			
				// --    :hold_field := :system.cursor_item;

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				// --    :hold_field := :system.cursor_item;
				executeAction("SAVE_KEYS");
				setGlobal("SUM_RECR_TERM", toStr(""));
				setGlobal("SUM_RECR_ADMIN_SEQNO", toStr(""));
				if ( sobcplnElement.getSobcplnTermCode().isNull() )
				{
					setGlobal("KEY_TERM", toStr(""));
				}
				else {
					setGlobal("KEY_TERM", sobcplnElement.getSobcplnTermCode());
				}
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SRASUMI"), toStr("QUERY"));
				if ( getGlobal("SUM_RECR_TERM").isNull() )
				{
				}
				else {
					sobcplnElement.setSobcplnTermCode(getGlobal("SUM_RECR_TERM"));
					nextItem();
					sobcplnElement.setSobcplnSeqno(toNumber(getGlobal("SUM_RECR_ADMIN_SEQNO")));
					nextItem();
				}
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.CALL_SAASUMI
		 ----   :hold_field := :system.cursor_item;
   EXECUTE_TRIGGER ('SAVE_KEYS');
   IF :SOBCPLN_TERM_CODE IS NULL THEN
      :GLOBAL.TERM_CODE := '';
   ELSE
      :GLOBAL.TERM_CODE := :SOBCPLN_TERM_CODE;
      :GLOBAL.KEY_TERM := :SOBCPLN_TERM_CODE;
   END IF;
   IF :SOBCPLN_SEQNO IS NULL THEN
      :GLOBAL.SEQNO := '';
   ELSE
      :GLOBAL.SEQNO := :SOBCPLN_SEQNO;
   END IF;
   :GLOBAL.FORM_WAS_CALLED := 'Y';
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
    --F2J_TODO: Change global current_user01 to current_user
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER01,'SAASUMI','QUERY');
   IF :GLOBAL.TERM_CODE IS NULL THEN
         NULL;
   ELSE
         :SOBCPLN_TERM_CODE := :GLOBAL.TERM_CODE;
         NEXT_FIELD;
         :SOBCPLN_SEQNO := :GLOBAL.SEQNO;
         NEXT_FIELD;
   END IF;
   :GLOBAL.FORM_WAS_CALLED := '';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.CALL_SAASUMI
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CALL_SAASUMI")
		public void sobcpln_CallSaasumi()
		{
			
				// --   :hold_field := :system.cursor_item;

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				// --   :hold_field := :system.cursor_item;
				executeAction("SAVE_KEYS");
				if ( sobcplnElement.getSobcplnTermCode().isNull() )
				{
					setGlobal("TERM_CODE", toStr(""));
				}
				else {
					setGlobal("TERM_CODE", sobcplnElement.getSobcplnTermCode());
					setGlobal("KEY_TERM", sobcplnElement.getSobcplnTermCode());
				}
				if ( sobcplnElement.getSobcplnSeqno().isNull() )
				{
					setGlobal("SEQNO", toStr(""));
				}
				else {
					setGlobal("SEQNO", toStr(sobcplnElement.getSobcplnSeqno()));
				}
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SAASUMI"), toStr("QUERY"));
				if ( getGlobal("TERM_CODE").isNull() )
				{
				}
				else {
					sobcplnElement.setSobcplnTermCode(getGlobal("TERM_CODE"));
					nextItem();
					sobcplnElement.setSobcplnSeqno(toNumber(getGlobal("SEQNO")));
					nextItem();
				}
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.CHECK_DUPLICATE_MODULES
		 -- check_duplicate_modules
--  you can have one record per comm plan,module,term,seq and 
--  active status.  This means you can have multiple comm plans
--  active per module, term and seq.

DECLARE
  DUMMY VARCHAR2(1);
  reccnt number;
  term varchar2(6);
  seqno number;
  typeind varchar(1);
  cplncode varchar(4);


 CURSOR CHECK_DUPES IS
    SELECT nvl(count(*),0), sobcpln_type_ind,
     nvl(sobcpln_term_code,'999999'), nvl(sobcpln_seqno,0),
     sobcpln_cpln_code
    FROM   SOBCPLN
    where   SOBCPLN_pidm  = :CPLN_pidm
      and  sobcpln_active_ind = 'Y'
         group by sobcpln_type_ind, 
     nvl(sobcpln_term_code,'999999'), nvl(sobcpln_seqno,0), sobcpln_cpln_code
      order by sobcpln_type_ind, 
     nvl(sobcpln_term_code,'999999'), nvl(sobcpln_seqno,0), sobcpln_cpln_code; 
  

--
BEGIN
  
OPEN CHECK_DUPES;
loop 
   FETCH CHECK_DUPES INTO reccnt, typeind, term, seqno, cplncode;
   exit when check_dupes%notfound;
  
   if reccnt > 1 then 
    if typeind = 'S' then 
     MESSAGE( G$_NLS.Get('SOQOLIB-0117', 'FORM',
	'*ERROR* Only one active student communication plan allowed for plan %01%.'
       
	,  cplncode));
    else 
      if typeind = 'A' then 
        MESSAGE( G$_NLS.Get('SOQOLIB-0118', 'FORM',
	'*ERROR* Only one active admission communication plan %01% allowed for the term %02% and application number and %03%.' 
                
	, cplncode ,  term ,  to_char(seqno) ));
      else 
        MESSAGE( G$_NLS.Get('SOQOLIB-0119', 'FORM',
	'*ERROR* Only one active recruit communication plan %01% allowed for the term %02% and sequence %03%.' 
           
	,  cplncode ,  term ,  to_char(seqno) ));
      end if;
    end if;
    RAISE FORM_TRIGGER_FAILURE;
    exit;
   END IF;
end loop;
CLOSE CHECK_DUPES;
END;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.CHECK_DUPLICATE_MODULES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_DUPLICATE_MODULES")
		public void sobcpln_CheckDuplicateModules()
		{
			
				//  check_duplicate_modules
				//   you can have one record per comm plan,module,term,seq and 
				//   active status.  This means you can have multiple comm plans
				//   active per module, term and seq.
				int rowCount = 0;
				{
					NString dummy= NString.getNull();
					NNumber reccnt= NNumber.getNull();
					NString term= NString.getNull();
					NNumber seqno= NNumber.getNull();
					NString typeind= NString.getNull();
					NString cplncode= NString.getNull();
					String sqlcheckDupes = "SELECT nvl(count(*), 0), sobcpln_type_ind, nvl(sobcpln_term_code, '999999'), nvl(sobcpln_seqno, 0), sobcpln_cpln_code " +
	" FROM SOBCPLN " +
	" WHERE SOBCPLN_pidm = :CPLN_PIDM AND sobcpln_active_ind = 'Y' " +
	" GROUP BY sobcpln_type_ind, sobcpln_term_code, , sobcpln_seqno, , sobcpln_cpln_code " +
	" ORDER BY sobcpln_type_ind, nvl(sobcpln_term_code, '999999'), nvl(sobcpln_seqno, 0), sobcpln_cpln_code";
					
					DataCursor checkDupes = new DataCursor(sqlcheckDupes);
					//Setting query parameters
					try {
						checkDupes.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkDupes.
						checkDupes.open();
						while (true) {
							ResultSet checkDupesResults = checkDupes.fetchInto();
							if ( checkDupesResults != null ) {
								reccnt = checkDupesResults.getNumber(0);
								typeind = checkDupesResults.getStr(1);
								term = checkDupesResults.getStr(2);
								seqno = checkDupesResults.getNumber(3);
								cplncode = checkDupesResults.getStr(4);
							}
							if ( checkDupes.notFound() ) 
								break;
							if ( reccnt.greater(1) )
							{
								if ( typeind.equals("S") )
								{
									errorMessage(GNls.Fget(toStr("SOQOLIB-0117"), toStr("FORM"), toStr("*ERROR* Only one active student communication plan allowed for plan %01%."), cplncode));
								}
								else {
									if ( typeind.equals("A") )
									{
										errorMessage(GNls.Fget(toStr("SOQOLIB-0118"), toStr("FORM"), toStr("*ERROR* Only one active admission communication plan %01% allowed for the term %02% and application number and %03%."), cplncode, term, toChar(seqno)));
									}
									else {
										errorMessage(GNls.Fget(toStr("SOQOLIB-0119"), toStr("FORM"), toStr("*ERROR* Only one active recruit communication plan %01% allowed for the term %02% and sequence %03%."), cplncode, term, toChar(seqno)));
									}
								}
								throw new ApplicationException();
							}
						}
					} finally {
						checkDupes.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.CHECK_MAIL
		 DECLARE
  CURSOR FIND_PLAN_MAIL IS
   SELECT 'Y' 
   FROM   GURMAIL
   WHERE  GURMAIL_PIDM      = :SOBCPLN_PIDM
     AND  GURMAIL_SYSTEM_IND = 'S'
     AND  GURMAIL_MODULE_CODE = :SOBCPLN_TYPE_IND
     AND  GURMAIL_CPLN_CODE = :SOBCPLN_CPLN_CODE
     AND  GURMAIL_TERM_CODE = :SOBCPLN_TERM_CODE
     AND  GURMAIL_ADMIN_IDENTIFIER = :SOBCPLN_SEQNO
     AND  GURMAIL_DATE_PRINTED IS NULL
     AND  :SOBCPLN_TYPE_IND in ('R','A')
   UNION
   SELECT 'Y' 
   FROM   GURMAIL
   WHERE  GURMAIL_PIDM      = :SOBCPLN_PIDM
     AND  GURMAIL_SYSTEM_IND = 'S'
     AND  GURMAIL_MODULE_CODE = :SOBCPLN_TYPE_IND
     AND  :SOBCPLN_TYPE_IND = 'S'
     AND  GURMAIL_CPLN_CODE = :SOBCPLN_CPLN_CODE
     AND  GURMAIL_DATE_PRINTED IS NULL;
--
  CURSOR FIND_RECR_MAIL IS
   SELECT 'Y' 
   FROM   GURMAIL
   WHERE  GURMAIL_PIDM      = :SOBCPLN_PIDM
     AND  GURMAIL_SYSTEM_IND = 'S'
     AND  GURMAIL_MODULE_CODE = 'R'
     AND  GURMAIL_DATE_PRINTED IS NULL;
--
  CURSOR FIND_RECR_ADMT_MAIL IS
   SELECT 'Y' 
   FROM   GURMAIL
   WHERE  GURMAIL_PIDM      = :SOBCPLN_PIDM
     AND  GURMAIL_SYSTEM_IND = 'S'
     AND  GURMAIL_MODULE_CODE = 'R'
     AND  GURMAIL_DATE_PRINTED IS NULL
   UNION
   SELECT 'Y' 
   FROM   GURMAIL
   WHERE  GURMAIL_PIDM      = :SOBCPLN_PIDM
     AND  GURMAIL_SYSTEM_IND = 'S'
     AND  GURMAIL_MODULE_CODE = 'A'
     AND  GURMAIL_DATE_PRINTED IS NULL;
--
BEGIN

OPEN FIND_PLAN_MAIL;
FETCH FIND_PLAN_MAIL INTO :UNSENT_MAIL ;
IF FIND_PLAN_MAIL%NOTFOUND and 
  to_char(:sobcpln_activity_date,G$_DATE.GET_NLS_DATE_FORMAT) = G$_DATE.NORMALISE_GREG_DATE('01-01-1900', 'DD-MM-YYYY') THEN
  :unsent_mail := '';
elsif FIND_PLAN_MAIL%NOTFOUND then 
  :UNSENT_MAIL := 'N';
END IF;
CLOSE FIND_PLAN_MAIL;


:DELETE_MAIL  := 'N';
NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.CHECK_MAIL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_MAIL")
		public void sobcpln_CheckMail()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlfindPlanMail = "SELECT 'Y' " +
	" FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :SOBCPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = :SOBCPLN_TYPE_IND AND GURMAIL_CPLN_CODE = :SOBCPLN_CPLN_CODE AND GURMAIL_TERM_CODE = :SOBCPLN_TERM_CODE AND GURMAIL_ADMIN_IDENTIFIER = :SOBCPLN_SEQNO AND GURMAIL_DATE_PRINTED IS NULL AND (:SOBCPLN_TYPE_IND) IN ('R', 'A') " +
	"UNION SELECT 'Y' " +
	" FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :SOBCPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = :SOBCPLN_TYPE_IND AND :SOBCPLN_TYPE_IND = 'S' AND GURMAIL_CPLN_CODE = :SOBCPLN_CPLN_CODE AND GURMAIL_DATE_PRINTED IS NULL ";
					DataCursor findPlanMail = new DataCursor(sqlfindPlanMail);
					String sqlfindRecrMail = "SELECT 'Y' " +
	" FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :SOBCPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = 'R' AND GURMAIL_DATE_PRINTED IS NULL ";
					DataCursor findRecrMail = new DataCursor(sqlfindRecrMail);
					String sqlfindRecrAdmtMail = "SELECT 'Y' " +
	" FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :SOBCPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = 'R' AND GURMAIL_DATE_PRINTED IS NULL " +
	"UNION SELECT 'Y' " +
	" FROM GURMAIL " +
	" WHERE GURMAIL_PIDM = :SOBCPLN_PIDM AND GURMAIL_SYSTEM_IND = 'S' AND GURMAIL_MODULE_CODE = 'A' AND GURMAIL_DATE_PRINTED IS NULL ";
					DataCursor findRecrAdmtMail = new DataCursor(sqlfindRecrAdmtMail);
					try {
						//Setting query parameters
						findPlanMail.addParameter("SOBCPLN_PIDM", sobcplnElement.getSobcplnPidm());
						findPlanMail.addParameter("SOBCPLN_TYPE_IND", sobcplnElement.getSobcplnTypeInd());
						findPlanMail.addParameter("SOBCPLN_CPLN_CODE", sobcplnElement.getSobcplnCplnCode());
						findPlanMail.addParameter("SOBCPLN_TERM_CODE", sobcplnElement.getSobcplnTermCode());
						findPlanMail.addParameter("SOBCPLN_SEQNO", sobcplnElement.getSobcplnSeqno());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable findPlanMail.
						findPlanMail.open();
						ResultSet findPlanMailResults = findPlanMail.fetchInto();
						if ( findPlanMailResults != null ) {
							sobcplnElement.setUnsentMail(findPlanMailResults.getStr(0));
						}
						if ( findPlanMail.notFound() && toChar(sobcplnElement.getSobcplnActivityDate(), GDate.getNlsDateFormat()).equals(GDate.normaliseGregDate(toStr("01-01-1900"), toStr("DD-MM-YYYY"))) )
						{
							sobcplnElement.setUnsentMail(toStr(""));
						}
						else if ( findPlanMail.notFound() ) {
							sobcplnElement.setUnsentMail(toStr("N"));
						}
						findPlanMail.close();
						sobcplnElement.setDeleteMail(toStr("N"));
					} finally {
						findPlanMail.close();
						findRecrMail.close();
						findRecrAdmtMail.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.SOBCPLN_RETURN
		 -- force commit before exiting block so that the validations
-- of multiple com plan, type, term, seq and active status
-- will be validated.
if :system.form_status = 'CHANGED' then 
  message( G$_NLS.Get('SOQOLIB-0120', 'FORM','*ERROR* Commit Your Communication Plan Changes Before Proceeding.') );
elsif :commit_ind = 'P' then 
  message( G$_NLS.Get('SOQOLIB-0121', 'FORM','*ERROR* Pending Errors; Correct Errors Before Proceeding.') );
else 
  if :sobcpln_return_object is not null then 
      g$_navigation_frame.enable_option(:sobcpln_return_object,
         :sobcpln_return_item);
  end if;
  if :comm_key_flag = 'D' then 
    GO_field(name_in('COMM_SAVE_FIELD_NAME'));
    g$_check_failure;
    do_key('DELETE_RECORD');
    g$_check_failure;
  elsif :comm_key_flag = 'Q' then  
    GO_field(name_in('COMM_SAVE_FIELD_NAME'));
    g$_check_failure;

  else 
    GO_field(name_in('COMM_SAVE_FIELD_NAME'));
    g$_check_failure;
    do_key('COMMIT_FORM');
    g$_check_failure; 
  end if;
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.SOBCPLN_RETURN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SOBCPLN_RETURN")
		public void sobcpln_SobcplnReturn()
		{
			
				//  force commit before exiting block so that the validations
				//  of multiple com plan, type, term, seq and active status
				//  will be validated.
				//  force commit before exiting block so that the validations
				//  of multiple com plan, type, term, seq and active status
				//  will be validated.
				if ( getTaskStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0120"), toStr("FORM"), toStr("*ERROR* Commit Your Communication Plan Changes Before Proceeding.")));
				}
				else if ( getFormModel().getSCommPlanBlock().getCommitInd().equals("P") ) {
					errorMessage(GNls.Fget(toStr("SOQOLIB-0121"), toStr("FORM"), toStr("*ERROR* Pending Errors; Correct Errors Before Proceeding.")));
				}
				else {
					if ( !getFormModel().getSCommPlanBlock().getSobcplnReturnObject().isNull() )
					{
						getContainer().getGoqrpls().getGNavigationFrame().enableOption(getFormModel().getSCommPlanBlock().getSobcplnReturnObject(), getFormModel().getSCommPlanBlock().getSobcplnReturnItem());
					}
					if ( getFormModel().getSCommPlanBlock().getCommKeyFlag().equals("D") )
					{
						goItem(getNameIn("COMM_SAVE_FIELD_NAME"));
						getContainer().getGoqrpls().gCheckFailure();
						executeAction("DELETE_RECORD");
						getContainer().getGoqrpls().gCheckFailure();
					}
					else if ( getFormModel().getSCommPlanBlock().getCommKeyFlag().equals("Q") ) {
						goItem(getNameIn("COMM_SAVE_FIELD_NAME"));
						getContainer().getGoqrpls().gCheckFailure();
					}
					else {
						goItem(getNameIn("COMM_SAVE_FIELD_NAME"));
						getContainer().getGoqrpls().gCheckFailure();
						executeAction("SAVE");
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN.SOBCPLN_COMMIT
		 
-- need to post changes before able to validate for duplicate
-- comm plans
:system.message_level := '5';
post;
G$_CHECK_FAILURE; 
:COMMIT_IND := 'P';

execute_trigger('check_duplicate_modules');  
G$_CHECK_FAILURE; 
--execute_query;
--g$_check_failure;
:system.message_level := '0';
 
SOKCPLN.P_CREATE_MATERIALS(:CPLN_PIDM);

:system.message_level := '5';  
COMMIT_form;
g$_check_failure; 
:s$_comm_plan_block.commit_form_message := Message_text;
:COMMIT_IND := 'Y';
execute_query;
go_record(:comm_record_place);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.SOBCPLN_COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SOBCPLN_COMMIT")
		public void sobcpln_SobcplnCommit()
		{
			
				//  need to post changes before able to validate for duplicate
				//  comm plans
				//  need to post changes before able to validate for duplicate
				//  comm plans
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				post();
				getContainer().getGoqrpls().gCheckFailure();
				getFormModel().getSCommPlanBlock().setCommitInd(toStr("P"));
				executeAction("check_duplicate_modules");
				getContainer().getGoqrpls().gCheckFailure();
				// execute_query;
				// g$_check_failure;
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				Sokcpln.pCreateMaterials(getFormModel().getSCommPlanBlock().getCplnPidm());
				// F2J : Ignored assignment to :SYSTEM.MESSAGE_LEVEL.
				commitTask();
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TO_REMOVE : Call to built-in "MESSAGE_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#ExcludeMessageBuiltins".
				//				getFormModel().getSCommPlanBlock().setCommitFormMessage(SupportClasses.SQLFORMS.MessageText());
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'MESSAGE_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#ExcludeMessageBuiltins'.");
				
				
				getFormModel().getSCommPlanBlock().setCommitInd(toStr("Y"));
				executeQuery();
				setCurrentRecord(getFormModel().getSCommPlanBlock().getCommRecordPlace());
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sobcpln_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("CPLN_PIDM", this.getFormModel().getSCommPlanBlock().getCplnPidm()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_CPLN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SOBCPLN_CPLN_CODE")
		public void sobcplnCplnCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_CPLN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOBCPLN_CPLN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sobcplnCplnCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_CPLN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sobcplnCplnCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_CPLN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sobcplnCplnCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_CPLN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SOBCPLN_CPLN_CODE", function=KeyFunction.NEXT_ITEM)
		public void sobcplnCplnCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_CPLN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SOBCPLN_CPLN_CODE", function=KeyFunction.ITEM_OUT)
		public void sobcplnCplnCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN_CPLN_CODE.POST-CHANGE
		 BEGIN
SELECT STVCPLN_DESC
INTO   :STVCPLN_DESC
FROM   STVCPLN
WHERE  STVCPLN_CODE = :SOBCPLN_CPLN_CODE;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
  MESSAGE( G$_NLS.Get('SOQOLIB-0122', 'FORM','*ERROR* INVALID PLAN CODE; PRESS LIST FOR VALID CODES.') );
  RAISE FORM_TRIGGER_FAILURE;
END;

if :sobcpln_pidm is null then
   :sobcpln_pidm := :cpln_pidm;
end if;


execute_trigger('check_mail');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_CPLN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SOBCPLN_CPLN_CODE")
		public void sobcplnCplnCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				int rowCount = 0;
				if(sobcplnElement.getSobcplnCplnCode().isNull())
		return;
				try
				{
					String sql1 = "SELECT STVCPLN_DESC " +
	" FROM STVCPLN " +
	" WHERE STVCPLN_CODE = :SOBCPLN_CPLN_CODE ";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("SOBCPLN_CPLN_CODE", sobcplnElement.getSobcplnCplnCode());
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						sobcplnElement.setStvcplnDesc(results1.getStr(0));
					}
					results1.close();
				}
				catch(NoDataFoundException e)
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0122"), toStr("FORM"), toStr("*ERROR* INVALID PLAN CODE; PRESS LIST FOR VALID CODES.")));
					throw new ApplicationException();
				}
				if ( sobcplnElement.getSobcplnPidm().isNull() )
				{
					sobcplnElement.setSobcplnPidm(getFormModel().getSCommPlanBlock().getCplnPidm());
				}
				executeAction("check_mail");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVCPLN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVCPLN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvcplnDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN_TYPE_IND.WHEN-VALIDATE-ITEM
		 <multilinecomment> MW 03/14/2001 Added following conditional statement to fix defect 46413. </multilinecomment>
IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN
   IF :sobcpln_type_ind = 'S' THEN
      :sobcpln_term_code := '';
      :sobcpln_seqno := '';
    end if;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_TYPE_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SOBCPLN_TYPE_IND")
		public void sobcplnTypeInd_validate()
		{
			
				//  MW 03/14/2001 Added following conditional statement to fix defect 46413. 

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				//  MW 03/14/2001 Added following conditional statement to fix defect 46413. 
				if ( getBlockStatus().equals("CHANGED") )
				{
					if ( sobcplnElement.getSobcplnTypeInd().equals("S") )
					{
						sobcplnElement.setSobcplnTermCode(toStr(""));
						sobcplnElement.setSobcplnSeqno(toNumber(""));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN_TYPE_IND.KEY-NEXT-ITEM
		    if :sobcpln_type_ind = 'S' then
   	<multilinecomment> MW 03/14/2001 Added following conditional statement to fix defect 46413. </multilinecomment>
      IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN
         :sobcpln_term_code := '';
         :sobcpln_seqno := '';
      ELSE
         go_item('sobcpln_active_ind');
      END IF;
   else
      next_field;
   end if;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_TYPE_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SOBCPLN_TYPE_IND", function=KeyFunction.NEXT_ITEM)
		public void sobcplnTypeInd_keyNexItem()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				if ( sobcplnElement.getSobcplnTypeInd().equals("S") )
				{
					//  MW 03/14/2001 Added following conditional statement to fix defect 46413. 
					if ( getBlockStatus().equals("CHANGED") )
					{
						sobcplnElement.setSobcplnTermCode(toStr(""));
						sobcplnElement.setSobcplnSeqno(toNumber(""));
					}
					else {
						goItem(toStr("sobcpln_active_ind"));
					}
				}
				else {
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN_TERM_CODE.KEY-LISTVAL
		 IF :sobcpln_type_ind IS NULL THEN
   MESSAGE( G$_NLS.Get('SOQOLIB-0123', 'FORM','*ERROR* Cannot LIST VALUES Unless Module Indicator is entered.')  
   );
   RAISE FORM_TRIGGER_FAILURE;
ELSIF :sobcpln_type_ind = 'S' THEN
   MESSAGE( G$_NLS.Get('SOQOLIB-0124', 'FORM','*ERROR* Cannot enter Term or Sequence Number for Student Plans.') );
   RAISE FORM_TRIGGER_FAILURE;
ELSIF :sobcpln_type_ind = 'R' THEN
   execute_trigger ('call_srasumi');
ELSE
   execute_trigger('call_saasumi');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_TERM_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SOBCPLN_TERM_CODE", function=KeyFunction.LIST_VALUES)
		public void sobcplnTermCode_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				if ( sobcplnElement.getSobcplnTypeInd().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0123"), toStr("FORM"), toStr("*ERROR* Cannot LIST VALUES Unless Module Indicator is entered.")));
					throw new ApplicationException();
				}
				else if ( sobcplnElement.getSobcplnTypeInd().equals("S") ) {
					errorMessage(GNls.Fget(toStr("SOQOLIB-0124"), toStr("FORM"), toStr("*ERROR* Cannot enter Term or Sequence Number for Student Plans.")));
					throw new ApplicationException();
				}
				else if ( sobcplnElement.getSobcplnTypeInd().equals("R") ) {
					executeAction("call_srasumi");
				}
				else {
					executeAction("call_saasumi");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN_TERM_CODE.WHEN-VALIDATE-ITEM
		 if :sobcpln_cpln_code is null then 
  return;
end if;
IF :sobcpln_type_ind IS NULL THEN
   MESSAGE( G$_NLS.Get('SOQOLIB-0125', 'FORM','*ERROR* Module Indicator must be entered to validate Term.') );
   goto error_rtn;
END IF;
IF :sobcpln_type_ind = 'S' THEN
   IF :SOBCPLN_TERM_CODE IS NOT NULL THEN
      MESSAGE( G$_NLS.Get('SOQOLIB-0126', 'FORM','*ERROR* No Term or Sequence Number may be entered for Student Plans.') );
      goto error_rtn;
    ELSE
      GOTO TRIGGER_EXIT;
    END IF;
END IF;
--
IF :SOBCPLN_TYPE_IND = 'A' THEN
   GOTO CHECK_ADMISSIONS;
END IF;
DECLARE
  DUMMY VARCHAR2(1);
BEGIN
  SELECT 'X' INTO DUMMY
  FROM   SRBRECR
  WHERE  SRBRECR_PIDM = nvl(:SOBCPLN_PIDM, :cpln_pidm)
    AND  SRBRECR_TERM_CODE = :SOBCPLN_TERM_CODE;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    MESSAGE( G$_NLS.Get('SOQOLIB-0127', 'FORM','*ERROR* Invalid Recruting Term Code; Press LIST for Valid Codes.') );
     goto error_rtn;
  WHEN TOO_MANY_ROWS THEN
    NULL;
END;
GOTO TRIGGER_EXIT;
<<CHECK_ADMISSIONS>>
DECLARE
  DUMMY VARCHAR2(1);
BEGIN
  SELECT 'X' INTO DUMMY
  FROM   SARADAP
  WHERE  SARADAP_PIDM = nvl(:SOBCPLN_PIDM, :cpln_pidm)
    AND  SARADAP_TERM_CODE_ENTRY = :SOBCPLN_TERM_CODE;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    MESSAGE( G$_NLS.Get('SOQOLIB-0128', 'FORM','*ERROR* Invalid Admissions Term Code; Press LIST for Valid Codes.') );
    goto error_rtn;
  WHEN TOO_MANY_ROWS THEN
    null;
END;
GOTO TRIGGER_EXIT;

<<error_rtn>>

raise form_trigger_failure;


<<TRIGGER_EXIT>>
null;





		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_TERM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SOBCPLN_TERM_CODE")
		public void sobcplnTermCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				int rowCount = 0;
				if ( sobcplnElement.getSobcplnCplnCode().isNull() )
				{
					return ;
				}
				if ( sobcplnElement.getSobcplnTypeInd().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0125"), toStr("FORM"), toStr("*ERROR* Module Indicator must be entered to validate Term.")));
					throw new ApplicationException();
				}
				if ( sobcplnElement.getSobcplnTypeInd().equals("S") )
				{
					if ( !sobcplnElement.getSobcplnTermCode().isNull() )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0126"), toStr("FORM"), toStr("*ERROR* No Term or Sequence Number may be entered for Student Plans.")));
						throw new ApplicationException();
					}
					else {
					}
				}
				// 
				if ( sobcplnElement.getSobcplnTypeInd().equals("A") )
				{
					NString dummy= NString.getNull();
					try
					{
						String sql2 = "SELECT 'X' " +
	" FROM SARADAP " +
	" WHERE SARADAP_PIDM = nvl(:SOBCPLN_PIDM, :CPLN_PIDM) AND SARADAP_TERM_CODE_ENTRY = :SOBCPLN_TERM_CODE ";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("SOBCPLN_PIDM", sobcplnElement.getSobcplnPidm());
						command2.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
						command2.addParameter("SOBCPLN_TERM_CODE", sobcplnElement.getSobcplnTermCode());
						ResultSet results2 = command2.executeQuery();
						rowCount = command2.getRowCount();
						if ( results2.hasData() ) {
							dummy = results2.getStr(0);
						}
						results2.close();
					}
					catch(NoDataFoundException e)
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0128"), toStr("FORM"), toStr("*ERROR* Invalid Admissions Term Code; Press LIST for Valid Codes.")));
						throw new ApplicationException();
					}
					catch(TooManyRowsException e)
					{
					}
				}
				{
					NString dummy= NString.getNull();
					try
					{
						String sql1 = "SELECT 'X' " +
	" FROM SRBRECR " +
	" WHERE SRBRECR_PIDM = nvl(:SOBCPLN_PIDM, :CPLN_PIDM) AND SRBRECR_TERM_CODE = :SOBCPLN_TERM_CODE ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("SOBCPLN_PIDM", sobcplnElement.getSobcplnPidm());
						command1.addParameter("CPLN_PIDM", getFormModel().getSCommPlanBlock().getCplnPidm());
						command1.addParameter("SOBCPLN_TERM_CODE", sobcplnElement.getSobcplnTermCode());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							dummy = results1.getStr(0);
						}
						results1.close();
					}
					catch(NoDataFoundException e)
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0127"), toStr("FORM"), toStr("*ERROR* Invalid Recruting Term Code; Press LIST for Valid Codes.")));
						throw new ApplicationException();
					}
					catch(TooManyRowsException e)
					{
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN_SEQNO.KEY-LISTVAL
		 IF :sobcpln_type_ind IS NULL THEN
   MESSAGE( G$_NLS.Get('SOQOLIB-0129', 'FORM','*ERROR* Cannot LIST VALUES unless Module Indicator is entered.') );
   RAISE FORM_TRIGGER_FAILURE;
ELSIF :sobcpln_type_ind = 'S' THEN
   MESSAGE( G$_NLS.Get('SOQOLIB-0130', 'FORM','*ERROR* Cannot enter Term or Sequence Number for Student Plans.') );
   RAISE FORM_TRIGGER_FAILURE;
ELSIF :sobcpln_type_ind = 'R' THEN
   execute_trigger ('call_srasumi');
ELSE
   execute_trigger('call_saasumi');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_SEQNO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SOBCPLN_SEQNO", function=KeyFunction.LIST_VALUES)
		public void sobcplnSeqno_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				if ( sobcplnElement.getSobcplnTypeInd().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0129"), toStr("FORM"), toStr("*ERROR* Cannot LIST VALUES unless Module Indicator is entered.")));
					throw new ApplicationException();
				}
				else if ( sobcplnElement.getSobcplnTypeInd().equals("S") ) {
					errorMessage(GNls.Fget(toStr("SOQOLIB-0130"), toStr("FORM"), toStr("*ERROR* Cannot enter Term or Sequence Number for Student Plans.")));
					throw new ApplicationException();
				}
				else if ( sobcplnElement.getSobcplnTypeInd().equals("R") ) {
					executeAction("call_srasumi");
				}
				else {
					executeAction("call_saasumi");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOBCPLN_SEQNO.WHEN-VALIDATE-ITEM
		 
if :sobcpln_cpln_code is null then 
  return;
end if;
IF :sobcpln_type_ind IS NULL THEN
  MESSAGE( G$_NLS.Get('SOQOLIB-0131', 'FORM','*ERROR* Module Indicator must be entered to validate Sequence Number.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
IF :sobcpln_type_ind = 'S' THEN
   IF :SOBCPLN_SEQNO IS NULL THEN
       GOTO TRIGGER_EXIT;
   ELSE
       MESSAGE( G$_NLS.Get('SOQOLIB-0132', 'FORM','*ERROR* No Term or Sequence Number may be entered for Student Plans.') );
       goto error_rtn;
   END IF;
END IF;
--
IF :SOBCPLN_TERM_CODE IS NULL THEN
  MESSAGE( G$_NLS.Get('SOQOLIB-0133', 'FORM','*ERROR* Term Code must be entered to validate Sequence Number.') );
   goto error_rtn;
END IF;
IF :sobcpln_type_ind = 'A' THEN
   GOTO CHECK_ADMISSIONS;
END IF;
DECLARE
  DUMMY VARCHAR2(1);
BEGIN
  SELECT 'X' INTO DUMMY
  FROM   SRBRECR
  WHERE  SRBRECR_PIDM = :sobcpln_pidm
    AND  SRBRECR_TERM_CODE = :SOBCPLN_TERM_CODE
    AND  SRBRECR_ADMIN_SEQNO = :SOBCPLN_SEQNO;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    MESSAGE( G$_NLS.Get('SOQOLIB-0134', 'FORM','*ERROR* Invalid Recruiting Sequence Number.') );
    goto error_rtn;
  WHEN TOO_MANY_ROWS THEN
    GOTO TRIGGER_EXIT;
END;
GOTO TRIGGER_EXIT;
<<CHECK_ADMISSIONS>>
DECLARE
  DUMMY VARCHAR2(1);
BEGIN
  SELECT 'X' INTO DUMMY
  FROM   SARADAP
  WHERE  SARADAP_PIDM = :sobcpln_pidm
    AND  SARADAP_TERM_CODE_ENTRY = :SOBCPLN_TERM_CODE
    AND  SARADAP_APPL_NO = :SOBCPLN_SEQNO;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    MESSAGE( G$_NLS.Get('SOQOLIB-0135', 'FORM','*ERROR* *ERROR* Invalid Application Sequence Number.') );
    GOTO error_rtn;
end;
GOTO TRIGGER_EXIT;

<<error_rtn>>
raise form_trigger_failure;


<<TRIGGER_EXIT>>
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_SEQNO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SOBCPLN_SEQNO")
		public void sobcplnSeqno_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				int rowCount = 0;
				if ( sobcplnElement.getSobcplnCplnCode().isNull() )
				{
					return ;
				}
				if ( sobcplnElement.getSobcplnTypeInd().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0131"), toStr("FORM"), toStr("*ERROR* Module Indicator must be entered to validate Sequence Number.")));
					throw new ApplicationException();
				}
				if ( sobcplnElement.getSobcplnTypeInd().equals("S") )
				{
					if ( sobcplnElement.getSobcplnSeqno().isNull() )
					{
					}
					else {
						errorMessage(GNls.Fget(toStr("SOQOLIB-0132"), toStr("FORM"), toStr("*ERROR* No Term or Sequence Number may be entered for Student Plans.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( sobcplnElement.getSobcplnTermCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0133"), toStr("FORM"), toStr("*ERROR* Term Code must be entered to validate Sequence Number.")));
					throw new ApplicationException();
				}
				if ( sobcplnElement.getSobcplnTypeInd().equals("A") )
				{
					NString dummy= NString.getNull();
					try
					{
						String sql2 = "SELECT 'X' " +
	" FROM SARADAP " +
	" WHERE SARADAP_PIDM = :SOBCPLN_PIDM AND SARADAP_TERM_CODE_ENTRY = :SOBCPLN_TERM_CODE AND SARADAP_APPL_NO = :SOBCPLN_SEQNO ";
						DataCommand command2 = new DataCommand(sql2);
						//Setting query parameters
						command2.addParameter("SOBCPLN_PIDM", sobcplnElement.getSobcplnPidm());
						command2.addParameter("SOBCPLN_TERM_CODE", sobcplnElement.getSobcplnTermCode());
						command2.addParameter("SOBCPLN_SEQNO", sobcplnElement.getSobcplnSeqno());
						ResultSet results2 = command2.executeQuery();
						rowCount = command2.getRowCount();
						if ( results2.hasData() ) {
							dummy = results2.getStr(0);
						}
						results2.close();
					}
					catch(NoDataFoundException e)
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0135"), toStr("FORM"), toStr("*ERROR*  Invalid Application Sequence Number.")));
						throw new ApplicationException();
					}
				}
				{
					NString dummy= NString.getNull();
					try
					{
						String sql1 = "SELECT 'X' " +
	" FROM SRBRECR " +
	" WHERE SRBRECR_PIDM = :SOBCPLN_PIDM AND SRBRECR_TERM_CODE = :SOBCPLN_TERM_CODE AND SRBRECR_ADMIN_SEQNO = :SOBCPLN_SEQNO ";
						DataCommand command1 = new DataCommand(sql1);
						//Setting query parameters
						command1.addParameter("SOBCPLN_PIDM", sobcplnElement.getSobcplnPidm());
						command1.addParameter("SOBCPLN_TERM_CODE", sobcplnElement.getSobcplnTermCode());
						command1.addParameter("SOBCPLN_SEQNO", sobcplnElement.getSobcplnSeqno());
						ResultSet results1 = command1.executeQuery();
						rowCount = command1.getRowCount();
						if ( results1.hasData() ) {
							dummy = results1.getStr(0);
						}
						results1.close();
					}
					catch(NoDataFoundException e)
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0134"), toStr("FORM"), toStr("*ERROR* Invalid Recruiting Sequence Number.")));
						throw new ApplicationException();
					}
					catch(TooManyRowsException e)
					{

					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DELETE_MAIL.PRE-TEXT-ITEM
		 if get_item_property('delete_mail',visible) = 'TRUE' then 
if :unsent_mail = 'Y' and :sobcpln_active_ind = 'N' then 
  if get_item_property('delete_mail',updateable) = 'FALSE' then 
    set_item_property('delete_mail',updateable,property_true);
  end if;
else 
  set_item_property('delete_mail',updateable,property_false);
end if;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DELETE_MAIL.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="DELETE_MAIL", function=KeyFunction.ITEM_IN)
		public void deleteMail_itemIn()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				if ( getItemVisible("delete_mail").equals("TRUE") )
				{
					if ( sobcplnElement.getUnsentMail().equals("Y") && sobcplnElement.getSobcplnActiveInd().equals("N") )
					{
						if ( getItemUpdateAllowed("delete_mail").equals("FALSE") )
						{
							setItemUpdateAllowed("delete_mail", true);
						}
					}
					else {
						setItemUpdateAllowed("delete_mail", false);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DELETE_MAIL.WHEN-CHECKBOX-CHANGED
		 IF :DELETE_MAIL NOT IN ('N','Y') THEN
   MESSAGE( G$_NLS.Get('SOQOLIB-0136', 'FORM','*ERROR* Delete flag must be (Y)es or (N)o.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
if :unsent_mail <> 'Y' and :delete_mail <> 'N' then 
   :delete_mail := 'N';
end if;
if :unsent_mail = 'Y' and :sobcpln_active_ind = 'Y' and :delete_mail <> 'N' then 
   :delete_mail := 'N';
end if;
--

if :system.record_status <> 'NEW' and 
  :system.record_status <> 'INSERT' then 
 if :delete_mail = 'Y' then 
  :sobcpln_activity_date := sysdate;
 end if;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DELETE_MAIL.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="DELETE_MAIL")
		public void deleteMail_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				if ( !in(sobcplnElement.getDeleteMail(), "N", "Y").getValue() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0136"), toStr("FORM"), toStr("*ERROR* Delete flag must be (Y)es or (N)o.")));
					throw new ApplicationException();
				}
				if ( sobcplnElement.getUnsentMail().notEquals("Y") && sobcplnElement.getDeleteMail().notEquals("N") )
				{
					sobcplnElement.setDeleteMail(toStr("N"));
				}
				if ( sobcplnElement.getUnsentMail().equals("Y") && sobcplnElement.getSobcplnActiveInd().equals("Y") && sobcplnElement.getDeleteMail().notEquals("N") )
				{
					sobcplnElement.setDeleteMail(toStr("N"));
				}
				// 
				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( !getRecordStatus().equals("NEW") && !getRecordStatus().equals("INSERT") )
				{
					if ( sobcplnElement.getDeleteMail().equals("Y") )
					{
						sobcplnElement.setSobcplnActivityDate(NDate.getNow());
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER DELETE_PLAN.WHEN-VALIDATE-ITEM
		 IF :DELETE_PLAN NOT IN ('I','N','Y') THEN
   MESSAGE( G$_NLS.Get('SOQOLIB-0137', 'FORM','*ERROR* Delete flag must be Y/N or (I)nactivate.') );
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
		 * DELETE_PLAN.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="DELETE_PLAN")
		public void deletePlan_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);


				if ( !in(sobcplnElement.getDeletePlan(), "I", "N", "Y").getValue() )
				{
					errorMessage(GNls.Fget(toStr("SOQOLIB-0137"), toStr("FORM"), toStr("*ERROR* Delete flag must be Y/N or (I)nactivate.")));
					throw new ApplicationException();
				}
				// 
				if ( in(sobcplnElement.getDeletePlan(), "Y", "I").getValue() && getFormModel().getSCommPlanBlock().getOldCplnDesc().isNull() )
				{
					sobcplnElement.setDeletePlan(toStr("N"));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN_CPLN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SOBCPLN_CPLN_CODE")
		public void sobcplnCplnCode_validate()
		{
			
				SobcplnAdapter sobcplnElement = (SobcplnAdapter)this.getFormModel().getSobcpln().getRowAdapter(true);
							this.sobcplnCplnCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOBCPLN.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sobcpln_AfterQuery(RowAdapterEvent args)
		{
			
			SobcplnAdapter sobcplnElement = (SobcplnAdapter)args.getRow();			
			try {
				this.sobcplnCplnCode_PostChange();
			}
			catch(Exception ex){}

		}

		
	
	
}

