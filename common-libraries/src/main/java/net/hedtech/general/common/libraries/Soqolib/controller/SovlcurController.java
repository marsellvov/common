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
import net.hedtech.general.common.dbservices.SbCurriculum.CurriculumRecRow;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Soqolib.model.*;
import net.hedtech.general.common.libraries.Soqolib.*;
import net.hedtech.general.common.libraries.Soqolib.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
public class SovlcurController extends AbstractSupportCodeObject {

	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public SovlcurController(ISupportCodeContainer container) 
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
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-ENTQRY
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0429', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void sovlcur_Search()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0429"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-CLRBLK
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0430', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void sovlcur_keyClearBlock()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0430"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-CLRREC
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0431', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void sovlcur_ClearRecord()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0431"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-DUP-ITEM
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0432', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void sovlcur_KeyDupItem()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0432"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-CREREC
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0433', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void sovlcur_CreateRecord()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0433"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-DELREC
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0434', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sovlcur_DeleteRecord()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0434"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-CQUERY
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0435', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void sovlcur_TotalResults()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0435"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-EXEQRY
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0436', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void sovlcur_ExecuteQuery()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0436"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEYEXEQRY
		   
  execute_query;
  go_block('sovlfos');
  execute_query;
  go_block('sovlcur');
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEYEXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEYEXEQRY")
		public void sovlcur_Keyexeqry()
		{
			
				executeQuery();
				goBlock(toStr("sovlfos"));
				executeQuery();
				goBlock(toStr("sovlcur"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-NXTBLK
		 go_block('sovlfos');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sovlcur_NextBlock()
		{
			
				goBlock(toStr("sovlfos"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-NXTREC
		 
  
	<multilinecomment> ** If we're not at the bottom, then go to the last record </multilinecomment> 
	IF :System.Last_Record <> 'TRUE' THEN 
		next_Record;
		if :sovlcur.summary_rowid is not null then  
			:system.message_level := '5';
	  	next_block;
		  clear_block;
		  execute_query;
		  previous_block;
		 	:system.message_level := '0';
		end if; 
 else 
			message( G$_NLS.Get('SOQOLIB-0437', 'FORM','At last record.') );
	 
  END IF; 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sovlcur_NextRecord()
		{
			
				//  ** If we're not at the bottom, then go to the last record 

				//F2J_WARNING : Caution, the variable may be null.
				SovlcurAdapter sovlcurElement = (SovlcurAdapter)this.getFormModel().getSovlcur().getRowAdapter(true);


				//  ** If we're not at the bottom, then go to the last record 
				if ( !isInLastRecord() )
				{
					nextRecord();
					if ( !sovlcurElement.getSummaryRowid().isNull() )
					{
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
						try { 
						MessageServices.setMessageLevel(MessageLevel.NONE);
						nextBlock();
						clearBlock();
						executeQuery();
						previousBlock();
						// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
						} finally {
									
						MessageServices.resetMessageLevel();
						}
									
					}
				}
				else {
					infoMessage(GNls.Fget(toStr("SOQOLIB-0437"), toStr("FORM"), toStr("At last record.")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-PRVREC
		 
 
	  previous_Record;
		if :sovlcur.summary_rowid is not null then  
	  	next_block;
		  clear_block;
		  execute_query;
		  previous_block;
		end if;  
 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void sovlcur_PreviousRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SovlcurAdapter sovlcurElement = (SovlcurAdapter)this.getFormModel().getSovlcur().getRowAdapter(true);


				previousRecord();
				if ( !sovlcurElement.getSummaryRowid().isNull() )
				{
					nextBlock();
					clearBlock();
					executeQuery();
					previousBlock();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-PRVBLK
		 go_item(name_in('return_from_sovlcur'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sovlcur_PreviousBlock()
		{
			
				goItem(getNameIn("return_from_sovlcur"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.KEY-DUPREC
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0438', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void sovlcur_CopyRecord()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0438"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.ON-POPULATE-DETAILS
		 --
-- Begin default relation declare section
--
DECLARE
  recstat     VARCHAR2(20) := :System.record_status;   
  startitm    VARCHAR2(61) := :System.cursor_item;   
  rel_id      Relation;
--
-- End default relation declare section
--
--
-- Begin default relation program section
--
BEGIN
  IF ( recstat = 'NEW' or recstat = 'INSERT' ) THEN   
    RETURN;
  END IF;
  --
  -- Begin SOVLFOS detail program section
  --
  IF ( (:SOVLCUR.SOVLCUR_PIDM is not null) or (:SOVLCUR.SOVLCUR_SEQNO is not null) ) THEN   
    rel_id := Find_Relation('SOVLCUR.SOVLCUR_SOVLFOS');   
    Query_Master_Details(rel_id, 'SOVLFOS');   
  END IF;
  --
  -- End SOVLFOS detail program section
  --

  IF ( :System.cursor_item <> startitm ) THEN     
     Go_Item(startitm);     
     Check_Package_Failure;     
  END IF;
END;
--
-- End default relation program section
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.ON-POPULATE-DETAILS
		 *
		 *
		 *</p>
		 * @param args
		*/

		//@PopulateDetails
		public void sovlcur_PopulateDetails(RowAdapterEvent args)
		{
			
				// 
				//  Begin default relation declare section
				// 
				SovlcurAdapter sovlcurElement = (SovlcurAdapter)args.getRow();


				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					NString recstat = toStr(getRecordStatus());
					NString startitm = getCursorItem();
					org.jdesktop.databuffer.DataRelation relId= null;
					if ((recstat.equals("NEW") || recstat.equals("INSERT")))
					{
						return ;
					}
					// 
					//  Begin SOVLFOS detail program section
					// 
					if (((!sovlcurElement.getSovlcurPidm().isNull()) || (!sovlcurElement.getSovlcurSeqno().isNull())))
					{
						// F2J_TO_REMOVE : Call to built-in "FIND_RELATION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#ExcludeRELATION_Builtins".
						//						relId = SupportClasses.FORMS40.FindRelation("SOVLCUR.SOVLCUR_SOVLFOS");
						this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'FIND_RELATION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#ExcludeRELATION_Builtins'.");
						
						
						this.getContainer().getServices().queryMasterDetails(relId, toStr("SOVLFOS"));
					}
					// 
					//  End SOVLFOS detail program section
					// 
					if ((getCursorItem().notEquals(startitm)))
					{
						goItem(startitm);
						this.getContainer().getServices().checkPackageFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.WHEN-NEW-RECORD-INSTANCE
		 	:system.message_level := '5';
	 next_block;
	 clear_block;
	 execute_query;
	 previous_block;
	:system.message_level := '0';
	
  

  execute_trigger('primary_curriculum_setup');
  g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sovlcur_recordChange()
		{
			
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '5'
				try { 
				MessageServices.setMessageLevel(MessageLevel.NONE);
				nextBlock();
				clearBlock();
				executeQuery();
				previousBlock();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				} finally {
							
				MessageServices.resetMessageLevel();
				}
							
				executeAction("primary_curriculum_setup");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.POST-QUERY
		 declare 
	lv_curr_ref sb_curriculum.curriculum_ref;
	lv_curr_rec sb_curriculum.curriculum_rec;
begin
	--- populate the degree seqno if it's visiable this is for the learner summary
  --- to show the outcome the learner was rolled too 
  -- Shagapp shows the outcome sequence if the curriculum is for outcome 
  if get_item_property('sovlcur_dgmr_seqno',visible) = 'TRUE' then 
   if :sovlcur_lmod_code = sb_curriculum_str.f_learner then 
     if :sovlcur_rolled_seqno is not null and :sovlcur_dgmr_seqno IS NULL then
  	  lv_curr_ref := sb_curriculum.f_query_one
  	     (p_pidm => :sovlcur_pidm, p_seqno => :sovlcur_rolled_seqno); 
  	   fetch lv_curr_ref into lv_curr_rec;
  	  if lv_curr_ref%notfound then
  	  	 :sovlcur_dgmr_seqno  := null;
  	  else 
  	  	 :sovlcur_dgmr_seqno := lv_curr_rec.r_key_seqno;
  	  end if; 
  	  close lv_curr_ref;
     end if;
   else 
     	:sovlcur_dgmr_seqno := :sovlcur_key_seqno;
   end if;
  end if;
 
	:sovlcur.stvdegc_desc := gb_stvdegc.f_get_description(:sovlcur_degc_code);
	:sovlcur.stvcamp_desc := gb_stvcamp.f_get_description(:sovlcur_camp_code);
  :sovlcur.stvcoll_desc := gb_stvcoll.f_get_description(:sovlcur_coll_code);
	:sovlcur.stvlevl_desc := gb_stvlevl.f_get_description(:sovlcur_levl_code);
	:sovlcur.sovlcur_stvrate_desc := sb_stvrate.f_get_description(:sovlcur_rate_code);
	:sovlcur.sovlcur_stvstyp_desc := sb_stvstyp.f_get_description(:sovlcur_styp_code);
	:sovlcur.sovlcur_stvadmt_desc := sb_stvadmt.f_get_description(:sovlcur_admt_code);
	:sovlcur.sovlcur_lmod_desc := sb_stvlmod.f_get_description(:sovlcur_lmod_code); 
  :sovlcur.sovlcur_program_desc := sb_smrprle.f_get_description(:sovlcur_program);

 
end;
  execute_trigger('primary_curriculum_display');
  g$_check_failure;
	execute_trigger('primary_curriculum_setup');
  g$_check_failure;

 	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sovlcur_AfterQuery(RowAdapterEvent args)
		{
			
				SovlcurAdapter sovlcurElement = (SovlcurAdapter)args.getRow();

				//MORPHIS TODO alterado para cursor

				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				{
					Cursor lvCurrRef= null;
					SbCurriculum.CurriculumRecRow lvCurrRec= null;
					// - populate the degree seqno if it's visiable this is for the learner summary
					// - to show the outcome the learner was rolled too 
					//  Shagapp shows the outcome sequence if the curriculum is for outcome 
					if ( getItemVisible("sovlcur_dgmr_seqno").equals("TRUE") )
					{
						if ( sovlcurElement.getSovlcurLmodCode().equals(SbCurriculumStr.fLearner()) )
						{
							if ( !sovlcurElement.getSovlcurRolledSeqno().isNull() && sovlcurElement.getSovlcurDgmrSeqno().isNull() )
							{
								// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
								lvCurrRef = SbCurriculum.fQueryOne(/*pPidm=>*/sovlcurElement.getSovlcurPidm(), /*pSeqno=>*/sovlcurElement.getSovlcurRolledSeqno());
								List<Row>  lvCurrRefResults = lvCurrRef.getRows();
								if ( lvCurrRefResults.size() >0 ) {
									lvCurrRec =  new SbCurriculum.CurriculumRecRow(lvCurrRefResults.get(0));
								}
								if ( lvCurrRefResults.size()==0 )
								{
									sovlcurElement.setSovlcurDgmrSeqno(toNumber(null));
								}
								else {
									sovlcurElement.setSovlcurDgmrSeqno(lvCurrRec.RKeySeqno);
								}
							}
						}
						else {
							sovlcurElement.setSovlcurDgmrSeqno(sovlcurElement.getSovlcurKeySeqno());
						}
					}
					sovlcurElement.setStvdegcDesc(GbStvdegc.fGetDescription(sovlcurElement.getSovlcurDegcCode()));
					sovlcurElement.setStvcampDesc(GbStvcamp.fGetDescription(sovlcurElement.getSovlcurCampCode()));
					sovlcurElement.setStvcollDesc(GbStvcoll.fGetDescription(sovlcurElement.getSovlcurCollCode()));
					sovlcurElement.setStvlevlDesc(GbStvlevl.fGetDescription(sovlcurElement.getSovlcurLevlCode()));
					sovlcurElement.setSovlcurStvrateDesc(SbStvrate.fGetDescription(sovlcurElement.getSovlcurRateCode()));
					sovlcurElement.setSovlcurStvstypDesc(SbStvstyp.fGetDescription(sovlcurElement.getSovlcurStypCode()));
					sovlcurElement.setSovlcurStvadmtDesc(SbStvadmt.fGetDescription(sovlcurElement.getSovlcurAdmtCode()));
					sovlcurElement.setSovlcurLmodDesc(SbStvlmod.fGetDescription(sovlcurElement.getSovlcurLmodCode()));
					sovlcurElement.setSovlcurProgramDesc(SbSmrprle.fGetDescription(sovlcurElement.getSovlcurProgram()));
				}
				executeAction("primary_curriculum_display");
				getContainer().getGoqrpls().gCheckFailure();
				executeAction("primary_curriculum_setup");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.WHEN-NEW-BLOCK-INSTANCE
		  if :system.block_status = 'NEW'  then 
	go_item(:return_from_sovlcur); 
	g$_check_failure;
 else
 	if :system.current_block = 'SOVLCUR' then 
     execute_trigger('primary_curriculum_display');
     g$_check_failure;
  end if; 

 end if;  
 
 

 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void sovlcur_blockChange()
		{
			
				if ( getBlockStatus().equals("NEW") )
				{
					goItem(getFormModel().getSCurriculaSummary().getReturnFromSovlcur());
					getContainer().getGoqrpls().gCheckFailure();
				}
				else {
					if ( getCurrentBlock().equals("SOVLCUR") )
					{
						executeAction("primary_curriculum_display");
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.PRIMARY_CURRICULUM_DISPLAY
		   
  --- find first and secondary curricula so we can populate the label next to the 
  --- curriculum summary
  declare 
  	lv_sorlcur_row  sb_curriculum.curriculum_rec;
  
  begin
       :s$_curricula_summary.primary_rowid := null;
       :s$_curricula_summary.secondary_rowid := null; 
  	   soklcur.p_lcur_priority(   
                            p_lmod   => :s$_curricula_summary.summary_code,
                            p_pidm        => :s$_curricula_summary.summary_pidm,
                            p_term_code   => :s$_curricula_summary.summary_term_code,
                            p_keyseqno    => :s$_curricula_summary.summary_key_seqno,
                            p_act_date    => null,
                            p_priority    => 1,
                            p_sorlcur_row => lv_sorlcur_row,
                            p_lcur_ROWID  => :s$_curricula_summary.primary_rowid) ;
                            
       soklcur.p_lcur_priority(   
                            p_lmod   => :s$_curricula_summary.summary_code,
                            p_pidm        => :s$_curricula_summary.summary_pidm,
                            p_term_code   => :s$_curricula_summary.summary_term_code,
                            p_keyseqno    => :s$_curricula_summary.summary_key_seqno,
                            p_act_date    => null,
                            p_priority    => 2,
                            p_sorlcur_row => lv_sorlcur_row,
                            p_lcur_ROWID  => :s$_curricula_summary.secondary_rowid) ;
  end; 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.PRIMARY_CURRICULUM_DISPLAY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRIMARY_CURRICULUM_DISPLAY")
		public void sovlcur_PrimaryCurriculumDisplay()
		{
			
				// - find first and secondary curricula so we can populate the label next to the 
				// - curriculum summary
				{
					CurriculumRecRow lvSorlcurRow = null;
					getFormModel().getSCurriculaSummary().setPrimaryRowid(NString.getNull());
					getFormModel().getSCurriculaSummary().setSecondaryRowid(NString.getNull());
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					Ref<CurriculumRecRow> p_sorlcur_row_ref = new Ref<CurriculumRecRow>(lvSorlcurRow);
					Ref<NString> p_lcur_rowid_ref = new Ref<NString>(getFormModel().getSCurriculaSummary().getPrimaryRowid());
					Soklcur.pLcurPriority(/*pLmod=>*/getFormModel().getSCurriculaSummary().getSummaryCode(), /*pPidm=>*/getFormModel().getSCurriculaSummary().getSummaryPidm(), /*pTermCode=>*/getFormModel().getSCurriculaSummary().getSummaryTermCode(), /*pKeyseqno=>*/getFormModel().getSCurriculaSummary().getSummaryKeySeqno(), toDate(/*pActDate=>*/null), toNumber(/*pPriority=>*/1), p_sorlcur_row_ref, p_lcur_rowid_ref);
					lvSorlcurRow = p_sorlcur_row_ref.val;
					getFormModel().getSCurriculaSummary().setPrimaryRowid(p_lcur_rowid_ref.val);
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					p_sorlcur_row_ref = new Ref<CurriculumRecRow>(lvSorlcurRow = null);
					p_lcur_rowid_ref = new Ref<NString>(getFormModel().getSCurriculaSummary().getSecondaryRowid());
					Soklcur.pLcurPriority(/*pLmod=>*/getFormModel().getSCurriculaSummary().getSummaryCode(), /*pPidm=>*/getFormModel().getSCurriculaSummary().getSummaryPidm(), /*pTermCode=>*/getFormModel().getSCurriculaSummary().getSummaryTermCode(), /*pKeyseqno=>*/getFormModel().getSCurriculaSummary().getSummaryKeySeqno(), toDate(/*pActDate=>*/null), toNumber(/*pPriority=>*/2), p_sorlcur_row_ref, p_lcur_rowid_ref);
					lvSorlcurRow = p_sorlcur_row_ref.val;
					getFormModel().getSCurriculaSummary().setSecondaryRowid(p_lcur_rowid_ref.val);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLCUR.PRIMARY_CURRICULUM_SETUP
		  
	
	if :sovlcur.summary_rowid = :s$_curricula_summary.primary_rowid then 
		 :primary_desc := G$_NLS.Get('SOQOLIB-0439', 'FORM','- Primary') ;
	elsif :sovlcur.summary_rowid = :s$_curricula_summary.secondary_rowid then
		 :primary_desc := G$_NLS.Get('SOQOLIB-0440', 'FORM','- Secondary');
  else
     :primary_desc := '';
  end if;
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.PRIMARY_CURRICULUM_SETUP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRIMARY_CURRICULUM_SETUP")
		public void sovlcur_PrimaryCurriculumSetup()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SovlcurAdapter sovlcurElement = (SovlcurAdapter)this.getFormModel().getSovlcur().getRowAdapter(true);


				if ( sovlcurElement.getSummaryRowid().equals(getFormModel().getSCurriculaSummary().getPrimaryRowid()) )
				{
					sovlcurElement.setPrimaryDesc(GNls.Fget(toStr("SOQOLIB-0439"), toStr("FORM"), toStr("- Primary")));
				}
				else if ( sovlcurElement.getSummaryRowid().equals(getFormModel().getSCurriculaSummary().getSecondaryRowid()) ) {
					sovlcurElement.setPrimaryDesc(GNls.Fget(toStr("SOQOLIB-0440"), toStr("FORM"), toStr("- Secondary")));
				}
				else {
					sovlcurElement.setPrimaryDesc(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sovlcur_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_SUMMARY_SUMMARY_CODE", this.getFormModel().getSCurriculaSummary().getSummaryCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_SUMMARY_SUMMARY_KEY_SEQNO", this.getFormModel().getSCurriculaSummary().getSummaryKeySeqno()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_SUMMARY_SUMMARY_TERM_CODE", this.getFormModel().getSCurriculaSummary().getSummaryTermCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_SUMMARY_SUMMARY_END_TERM", this.getFormModel().getSCurriculaSummary().getSummaryEndTerm()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR_PROGRAM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVLCUR_PROGRAM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sovlcurProgramDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVDEGC_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvdegcDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR_STVSTYP_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVLCUR_STVSTYP_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sovlcurStvstypDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR_STVRATE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVLCUR_STVRATE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sovlcurStvrateDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PRIMARY_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PRIMARY_DESC", function=KeyFunction.ITEM_CHANGE)
		public void primaryDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR_LMOD_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVLCUR_LMOD_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sovlcurLmodCode_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR_LMOD_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVLCUR_LMOD_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sovlcurLmodDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
	
	
}

