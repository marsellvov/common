package net.hedtech.banner.general.common.Soaidns.controller;
 
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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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
import net.hedtech.general.common.libraries.Soqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Soaidns.model.*;
import net.hedtech.banner.general.common.Soaidns.*;
import net.hedtech.banner.general.common.Soaidns.services.*;
import net.hedtech.general.common.libraries.Soqolib.model.SovlcurAdapter;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.general.common.services.OracleMessagesLevel;
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpridenController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public SpridenController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public SoaidnsTask getTask() {
		return (SoaidnsTask)super.getTask();
	}

	public SoaidnsModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-ENTQRY
		    EXECUTE_TRIGGER( 'QUERY' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void spriden_Search()
		{
			
				executeAction("QUERY");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-NXTREC
		 
IF :System.Last_Record <> 'TRUE' THEN 
		next_Record;
ELSE 
		message( G$_NLS.Get('SOAIDNS-0001', 'FORM','At last record.') );
END IF; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void spriden_NextRecord()
		{
			
				if ( !isInLastRecord(true) )
				{
					nextRecord();
				}
				else {
					infoMessage(GNls.Fget(toStr("SOAIDNS-0001"), toStr("FORM"), toStr("At last record.")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-NXTBLK
		 GO_BLOCK( 'SOUNDEX' ) ;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void spriden_NextBlock()
		{
			
				goBlock(toStr("SOUNDEX"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void spriden_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.KEY-PRVREC
		    PREVIOUS_RECORD ;
--
   :SYSTEM.MESSAGE_LEVEL := '5' ;
--
   NEXT_BLOCK ;
   NEXT_BLOCK ;
   EXECUTE_QUERY ;
   NEXT_BLOCK ;
   EXECUTE_QUERY ;
   NEXT_BLOCK ;
   EXECUTE_QUERY ;
   PREVIOUS_BLOCK ;
   PREVIOUS_BLOCK ;
   PREVIOUS_BLOCK ;
   PREVIOUS_BLOCK ;
--
   :SYSTEM.MESSAGE_LEVEL := '0' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void spriden_PreviousRecord()
		{
			
				previousRecord();
				// 
				
				try { 
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
				// 
				nextBlock();
				nextBlock();
				executeQuery();
				nextBlock();
				executeQuery();
				nextBlock();
				executeQuery();
				previousBlock();
				previousBlock();
				previousBlock();
				previousBlock();
				// 
				
				} finally {
							
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
				}
							
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.POST-QUERY
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT SPBPERS_BIRTH_DATE, SPBPERS_SEX
         FROM   SPBPERS
         WHERE  SPBPERS_PIDM = :SPRIDEN_PIDM ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :BIRTHDATE, :SEX ;
      CLOSE PTI_CURSOR;
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void spriden_AfterQuery(RowAdapterEvent args)
		{
			
				SpridenAdapter spridenElement = (SpridenAdapter)args.getRow();


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT SPBPERS_BIRTH_DATE, SPBPERS_SEX " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_PIDM = :SPRIDEN_PIDM ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SPRIDEN_PIDM", spridenElement.getSpridenPidm());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							spridenElement.setBirthdate(ptiCursorResults.getDate(0));
							spridenElement.setSex(ptiCursorResults.getStr(1));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.WHEN-NEW-RECORD-INSTANCE
		 IF :SPRIDEN.ROWID IS NULL THEN
   IF GET_BLOCK_PROPERTY(:SYSTEM.CURSOR_BLOCK,CURRENT_RECORD) <> 1 THEN
      PREVIOUS_RECORD;
      MESSAGE( G$_NLS.Get('SOAIDNS-0002', 'FORM','At last record.') ,NO_ACKNOWLEDGE);
   ELSE
      RETURN;
   END IF;
END IF;
--
 
EXECUTE_TRIGGER('QUERY_RECS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void spriden_recordChange()
		{
			

				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);

				if(spridenElement!=null){

				if ( spridenElement.getRowState().equals(DataRowStatus.INSERTED) )
				{
					if ( getBlockCurrentRecord(getCursorBlock()).notEquals(1) )
					{
						previousRecord();
						message(GNls.Fget(toStr("SOAIDNS-0002"), toStr("FORM"), toStr("At last record.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
					}
					else {
						return ;
					}
				}
				// 
				executeAction("QUERY_RECS");
			}
		}
		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.QUERY
		    NEXT_BLOCK ;
   G$_CHECK_FAILURE;
   NEXT_BLOCK ;
   G$_CHECK_FAILURE;
   CLEAR_BLOCK ;
   G$_CHECK_FAILURE;
   NEXT_BLOCK ;
   G$_CHECK_FAILURE;
   CLEAR_BLOCK ;
   G$_CHECK_FAILURE;
   NEXT_BLOCK ;
   G$_CHECK_FAILURE;
   CLEAR_BLOCK ;
   G$_CHECK_FAILURE;
   PREVIOUS_BLOCK ;
   G$_CHECK_FAILURE;
   PREVIOUS_BLOCK ;
   G$_CHECK_FAILURE;
   PREVIOUS_BLOCK ;
   G$_CHECK_FAILURE;
   PREVIOUS_BLOCK ;
   G$_CHECK_FAILURE;
   ENTER_QUERY ;
   IF NOT FORM_SUCCESS THEN
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
--
 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.QUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="QUERY")
		public void spriden_Query()
		{
			
				nextBlock();
				getTask().getGoqrpls().gCheckFailure();
				nextBlock();
				getTask().getGoqrpls().gCheckFailure();
				clearBlock();
				getTask().getGoqrpls().gCheckFailure();
				nextBlock();
				getTask().getGoqrpls().gCheckFailure();
				clearBlock();
				getTask().getGoqrpls().gCheckFailure();
				nextBlock();
				getTask().getGoqrpls().gCheckFailure();
				clearBlock();
				getTask().getGoqrpls().gCheckFailure();
				previousBlock();
				getTask().getGoqrpls().gCheckFailure();
				previousBlock();
				getTask().getGoqrpls().gCheckFailure();
				previousBlock();
				getTask().getGoqrpls().gCheckFailure();
				previousBlock();
				getTask().getGoqrpls().gCheckFailure();
				enterQuery();
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					
//					throw new ApplicationException();
//				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN.QUERY_RECS
		    :SYSTEM.MESSAGE_LEVEL := '5' ;
--
   NEXT_BLOCK ; -- soundex
   NEXT_BLOCK ; -- spraddr 
   EXECUTE_QUERY ;

   NEXT_BLOCK ; -- sgbstdn 
   EXECUTE_QUERY ;

   NEXT_BLOCK ; -- sfbetrm 
   EXECUTE_QUERY ;

   -- execute the query on sovlcur and sovlfos 
   
   :s$_curricula_summary.summary_pidm := :spriden.spriden_pidm;
   :s$_curricula_summary.summary_code := sb_curriculum_str.f_learner;
   :s$_curricula_summary.summary_key_seqno := 99;
   :s$_curricula_summary.summary_term_code := :sgbstdn.sgbstdn_term_code_eff;
   :s$_curricula_summary.summary_end_term := sb_learner.f_query_end(:spriden.spriden_pidm,
                                                                 :sgbstdn.sgbstdn_term_code_eff);  
   
                                                                 
   IF :sgbstdn.sgbstdn_term_code_eff IS NOT NULL THEN 
   --Create SOTVCUR since this is a learner curriculum 

     soklcur.p_create_sotvcur(p_pidm => :s$_curricula_summary.summary_pidm,
       p_term_code => :s$_curricula_summary.summary_term_code,
       p_lmod_code => :s$_curricula_summary.summary_code);

   --Now execute the query on summary blocks 

     GO_BLOCK('sovlcur');
     EXECUTE_QUERY;
     IF :sovlcur.summary_rowid IS NOT NULL THEN
      GO_BLOCK('sovlfos');
      EXECUTE_QUERY ; --Parent exists, so query child
     ELSE
      GO_BLOCK('sovlfos');  
      CLEAR_BLOCK;    --No parent, so clear child
     END IF;
     GO_BLOCK('sfbetrm'); 
     
   ELSE 
     	GO_BLOCK('SOVLFOS');
     	CLEAR_BLOCK;
     	GO_BLOCK('SOVLCUR');
     	CLEAR_BLOCK; 
    
   END IF; --- sgbstdn term is not null 
   GO_BLOCK('SFBETRM'); 
   PREVIOUS_BLOCK ; -- sgbstdn
   PREVIOUS_BLOCK ; -- spraddr
   PREVIOUS_BLOCK ; -- soundex 
   PREVIOUS_BLOCK ; -- spriden 
--
   :SYSTEM.MESSAGE_LEVEL := '0' ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.QUERY_RECS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="QUERY_RECS")
		public void spriden_QueryRecs()
		{
			

				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);
				SgbstdnAdapter sgbstdnElement = (SgbstdnAdapter)this.getFormModel().getSgbstdn().getRowAdapter(true);
				SovlcurAdapter sovlcurElement = (SovlcurAdapter)this.getFormModel().getSovlcur().getRowAdapter(true);

				if(spridenElement!=null && sgbstdnElement!=null && sovlcurElement!=null){

				try { 
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
				// 
				nextBlock();
				//  soundex
				nextBlock();
				//  spraddr 
				executeQuery();
				nextBlock();
				//  sgbstdn 
				executeQuery();
				nextBlock();
				//  sfbetrm 
				executeQuery();
				//  execute the query on sovlcur and sovlfos 
				getFormModel().getSCurriculaSummary().setSummaryPidm(spridenElement.getSpridenPidm());
				getFormModel().getSCurriculaSummary().setSummaryCode(SbCurriculumStr.fLearner());
				getFormModel().getSCurriculaSummary().setSummaryKeySeqno(toNumber(99));
				getFormModel().getSCurriculaSummary().setSummaryTermCode(sgbstdnElement.getSgbstdnTermCodeEff());
				getFormModel().getSCurriculaSummary().setSummaryEndTerm(SbLearner.fQueryEnd(spridenElement.getSpridenPidm(), sgbstdnElement.getSgbstdnTermCodeEff()));
				if ( !sgbstdnElement.getSgbstdnTermCodeEff().isNull() )
				{
					// Create SOTVCUR since this is a learner curriculum 
					Soklcur.pCreateSotvcur(/*pPidm=>*/getFormModel().getSCurriculaSummary().getSummaryPidm(), /*pTermCode=>*/getFormModel().getSCurriculaSummary().getSummaryTermCode(), /*pLmodCode=>*/getFormModel().getSCurriculaSummary().getSummaryCode());
					// Now execute the query on summary blocks 
					goBlock("SOVLCUR");
					executeQuery();
					if ( !sovlcurElement.getSummaryRowid().isNull() )
					{
						goBlock("SOVLFOS");
						executeQuery();
					}
					else {
						goBlock("SOVLFOS");
						clearBlock();
					}
					goBlock("SFBETRM");
				}
				else {
					goBlock("SOVLFOS");
					clearBlock();
					goBlock("SOVLCUR");
					clearBlock();
				}
				// - sgbstdn term is not null 
				goBlock("SFBETRM");
				previousBlock();
				//  sgbstdn
				previousBlock();
				//  spraddr
				previousBlock();
				//  soundex 
				previousBlock();
				//  spriden 
				// 
				
				} finally {
							
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
				}
							
			}
		}
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void spriden_BeforeQuery(QueryEvent args)
		{

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SOUNDEX_LAST_NAME", this.getFormModel().getSoundex().getSoundexLastName()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SOUNDEX_FIRST_NAME", this.getFormModel().getSoundex().getSoundexFirstName()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BIRTHDATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="BIRTHDATE", function=KeyFunction.NEXT_ITEM)
		public void birthdate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BIRTHDATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="BIRTHDATE", function=KeyFunction.ITEM_CHANGE)
		public void birthdate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BIRTHDATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="BIRTHDATE", function=KeyFunction.ITEM_OUT)
		public void birthdate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
	
	
}

