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
		
public class SgrstspController extends AbstractSupportCodeObject {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public SgrstspController(ISupportCodeContainer container) 
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
		/* Original PL/SQL code code for TRIGGER SGRSTSP.KEY-DUPREC
		 declare 
	
	old_term   stvterm.stvterm_code%type; 
begin 
 
   IF :SGRSTSP_TERM_CODE_EFF =  :global.studypath_term   THEN 
   		message(g$_nls.get('SOQOLIB-0451','FORM','*ERROR* Duplicate record not allowed for the same term.'));
     raise form_trigger_failure;
   END IF;  
--
   old_term := :sgrstsp_term_code_eff; 
   
   CREATE_RECORD ;
   DUPLICATE_RECORD ;
--
   :s$_studypath.reg_inprogress := '' ;
   :SGRSTSP_ASTD_CODE := '' ;
   :SGRSTSP_ASTD_DESC := '' ;
    set_item_property('SGRSTSP_TERM_CODE_EFF',UPDATE_ALLOWED,PROPERTY_TRUE); 
   :SGRSTSP_TERM_CODE_EFF := :GLOBAL.studypath_term ;
    set_item_property('SGRSTSP_TERM_CODE_EFF',UPDATE_ALLOWED,PROPERTY_FALSE); 
    set_item_property('SGRSTSP_TERM_CODE_EFF',INSERT_ALLOWED,PROPERTY_FALSE);    
    :SGRSTSP_PREV_CODE := '' ;
   :SGRSTSP_PREV_DESC := '' ;
   :SGRSTSP_CAST_CODE := '' ;
   :SGRSTSP_CAST_DESC := '' ;
   EXECUTE_TRIGGER('END_TERM');
   
  :SGRSTSP_NAME := sb_studypath_name.f_learner_study_path_name(:sgrstsp_pidm,
         :sgrstsp_term_code_eff, :sgrstsp_key_seqno); 
  if :sgrstsp_stsp_code is not null then 
     :sgrstsp_stsp_desc := sb_stvstsp.f_get_description(:sgrstsp_stsp_code);
  end if; 
   if :sgrstsp_astd_code is not null then 
    :sgrstsp_astd_desc := sb_stvastd.f_get_description(:sgrstsp_astd_code);
   end if; 
  if :sgrstsp_prev_code is not null then 
 	  :sgrstsp_prev_desc := sb_stvprev.f_get_description(:sgrstsp_prev_code); 
  end if; 
  if :sgrstsp_cast_code is not null then
    	:sgrstsp_cast_desc := sb_stvcast.f_get_description(:sgrstsp_cast_code);
  end if; 
	if :sgrstsp_resd_code is not null then
	  :sgrstsp_resd_desc := sb_stvresd.f_get_description(:sgrstsp_resd_code);
	end if; 
	if :sgrstsp_sess_code is not null then
  	:sgrstsp_sess_desc := sb_stvsess.f_get_description(:sgrstsp_sess_code);
	end if; 
		if :sgrstsp_blck_code is not null then
  	:sgrstsp_blck_desc := sb_stvblck.f_get_description(:sgrstsp_blck_code);  
		end if; 
	if :sgrstsp_bskl_code is not null then 	
		 :sgrstsp_bskl_desc := sb_stvbskl.f_get_description(:sgrstsp_bskl_code);
	end if; 
	if :sgrstsp_prac_code is not null then 	
		:sgrstsp_prac_desc := sb_stvprac.f_get_description(:sgrstsp_prac_code); 
	end if; 
	if :sgrstsp_orsn_code is not null then 	
		:sgrstsp_orsn_desc := sb_stvorsn.f_get_description(:sgrstsp_orsn_code); 
	end if; 
	if :sgrstsp_emex_code is not null then 
	  :sgrstsp_emex_desc := sb_stvemex.f_get_description(:sgrstsp_emex_code);
	end if;
	if :sgrstsp_edlv_code is not null then 
  	:sgrstsp_edlv_desc := sb_stvedlv.f_get_description(:sgrstsp_edlv_code);
	end if;
	if :sgrstsp_capl_code is not null then 
  	:sgrstsp_capl_desc := sb_stvcapl.f_get_description(:sgrstsp_capl_code);
	end if;
  if :sgrstsp_trcn_code is not null then 
  	:sgrstsp_trcn_desc := sb_stvtrcn.f_get_description(:sgrstsp_trcn_code);
	end if;
	if :sgrstsp_voed_code is not null then 
  	:sgrstsp_voed_desc := sb_stvvoed.f_get_description(:sgrstsp_voed_code);
	end if;
	if :sgrstsp_egol_code is not null then 
  	:sgrstsp_egol_desc := sb_stvegol.f_get_description(:sgrstsp_egol_code);
	end if;
	if :sgrstsp_aprn_code is not null then 
  	:sgrstsp_aprn_desc := sb_stvaprn.f_get_description(:sgrstsp_aprn_code);
	end if;
	if :sgrstsp_gain_code is not null then 
  	:sgrstsp_gain_desc := sb_stvgain.f_get_description(:sgrstsp_gain_code);
	end if;
	if :sgrstsp_incm_code is not null then 
  	:sgrstsp_incm_desc := sb_stvincm.f_get_description(:sgrstsp_incm_code);
	end if;

 --  COPY THE GENERAL STUDENT RECORD
  if sb_learner.f_exists(p_pidm=> :sgrstsp_pidm,
  	    p_term_code_eff => :sgrstsp_term_code_eff ) = 'N' then
		  sb_learner.p_copy_learner
		    (p_pidm =>  :sgrstsp_pidm,
		     p_term_code_old => old_term,
		     p_term_code_new => :sgrstsp_term_code_eff); 
  END IF; 
  
 -- copy the lcur for the study path to the new term 
  begin 
   soklcur.p_copy_studypath 
      (p_pidm =>  :sgrstsp_pidm,
		     p_term_code_old => old_term,
		     p_term_code_new => :sgrstsp_term_code_eff, 
		     p_keyseqno => :sgrstsp_key_seqno ) ; 
   EXCEPTION
   WHEN OTHERS THEN
     G$_DISPLAY_ERR_MSG(SQLERRM);
     RAISE FORM_TRIGGER_FAILURE;
  end; 
  
  
END;

   
   
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void sgrstsp_CopyRecord()
		{
			
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
					if(sgrstspElement==null)	return;
					if(sorlcurElement==null)	return;

				{
					 
					NString oldTerm= NString.getNull();
					if ( sgrstspElement.getSgrstspTermCodeEff().equals(getGlobal("STUDYPATH_TERM")) )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0451"), toStr("FORM"), toStr("*ERROR* Duplicate record not allowed for the same term.")));
						throw new ApplicationException();
					}
					// 
					oldTerm = sgrstspElement.getSgrstspTermCodeEff();
					createRecord();
					duplicateRecord();
					// 
					getFormModel().getSStudypath().setRegInprogress(toStr(""));
					sgrstspElement.setSgrstspAstdCode(toStr(""));
					sgrstspElement.setSgrstspAstdDesc(toStr(""));
					setItemUpdateAllowed("SGRSTSP_TERM_CODE_EFF", true);
					sgrstspElement.setSgrstspTermCodeEff(getGlobal("STUDYPATH_TERM"));
					setItemUpdateAllowed("SGRSTSP_TERM_CODE_EFF", false);
					setItemInsertAllowed("SGRSTSP_TERM_CODE_EFF", false);
					sgrstspElement.setSgrstspPrevCode(toStr(""));
					sgrstspElement.setSgrstspPrevDesc(toStr(""));
					sgrstspElement.setSgrstspCastCode(toStr(""));
					sgrstspElement.setSgrstspCastDesc(toStr(""));
					executeAction("END_TERM");
					sgrstspElement.setSgrstspName(SbStudypathName.fLearnerStudyPathName(sgrstspElement.getSgrstspPidm(), sgrstspElement.getSgrstspTermCodeEff(), sgrstspElement.getSgrstspKeySeqno(),sorlcurElement.getSorlcurSeqno()));
					if ( !sgrstspElement.getSgrstspStspCode().isNull() )
					{
						sgrstspElement.setSgrstspStspDesc(SbStvstsp.fGetDescription(sgrstspElement.getSgrstspStspCode()));
					}
					if ( !sgrstspElement.getSgrstspAstdCode().isNull() )
					{
						sgrstspElement.setSgrstspAstdDesc(SbStvastd.fGetDescription(sgrstspElement.getSgrstspAstdCode()));
					}
					if ( !sgrstspElement.getSgrstspPrevCode().isNull() )
					{
						sgrstspElement.setSgrstspPrevDesc(SbStvprev.fGetDescription(sgrstspElement.getSgrstspPrevCode()));
					}
					if ( !sgrstspElement.getSgrstspCastCode().isNull() )
					{
						sgrstspElement.setSgrstspCastDesc(SbStvcast.fGetDescription(sgrstspElement.getSgrstspCastCode()));
					}
					if ( !sgrstspElement.getSgrstspResdCode().isNull() )
					{
						sgrstspElement.setSgrstspResdDesc(SbStvresd.fGetDescription(sgrstspElement.getSgrstspResdCode()));
					}
					if ( !sgrstspElement.getSgrstspSessCode().isNull() )
					{
						sgrstspElement.setSgrstspSessDesc(SbStvsess.fGetDescription(sgrstspElement.getSgrstspSessCode()));
					}
					if ( !sgrstspElement.getSgrstspBlckCode().isNull() )
					{
						sgrstspElement.setSgrstspBlckDesc(SbStvblck.fGetDescription(sgrstspElement.getSgrstspBlckCode()));
					}
					if ( !sgrstspElement.getSgrstspBsklCode().isNull() )
					{
						sgrstspElement.setSgrstspBsklDesc(SbStvbskl.fGetDescription(sgrstspElement.getSgrstspBsklCode()));
					}
					if ( !sgrstspElement.getSgrstspPracCode().isNull() )
					{
						sgrstspElement.setSgrstspPracDesc(SbStvprac.fGetDescription(sgrstspElement.getSgrstspPracCode()));
					}
					if ( !sgrstspElement.getSgrstspOrsnCode().isNull() )
					{
						sgrstspElement.setSgrstspOrsnDesc(SbStvorsn.fGetDescription(sgrstspElement.getSgrstspOrsnCode()));
					}
					if ( !sgrstspElement.getSgrstspEmexCode().isNull() )
					{
						sgrstspElement.setSgrstspEmexDesc(SbStvemex.fGetDescription(sgrstspElement.getSgrstspEmexCode()));
					}
					if ( !sgrstspElement.getSgrstspEdlvCode().isNull() )
					{
						sgrstspElement.setSgrstspEdlvDesc(SbStvedlv.fGetDescription(sgrstspElement.getSgrstspEdlvCode()));
					}
					if ( !sgrstspElement.getSgrstspCaplCode().isNull() )
					{
						sgrstspElement.setSgrstspCaplDesc(SbStvcapl.fGetDescription(sgrstspElement.getSgrstspCaplCode()));
					}
					if ( !sgrstspElement.getSgrstspTrcnCode().isNull() )
					{
						sgrstspElement.setSgrstspTrcnDesc(SbStvtrcn.fGetDescription(sgrstspElement.getSgrstspTrcnCode()));
					}
					if ( !sgrstspElement.getSgrstspVoedCode().isNull() )
					{
						sgrstspElement.setSgrstspVoedDesc(SbStvvoed.fGetDescription(sgrstspElement.getSgrstspVoedCode()));
					}
					if ( !sgrstspElement.getSgrstspEgolCode().isNull() )
					{
						sgrstspElement.setSgrstspEgolDesc(SbStvegol.fGetDescription(sgrstspElement.getSgrstspEgolCode()));
					}
					if ( !sgrstspElement.getSgrstspAprnCode().isNull() )
					{
						sgrstspElement.setSgrstspAprnDesc(SbStvaprn.fGetDescription(sgrstspElement.getSgrstspAprnCode()));
					}
					if ( !sgrstspElement.getSgrstspGainCode().isNull() )
					{
						sgrstspElement.setSgrstspGainDesc(SbStvgain.fGetDescription(sgrstspElement.getSgrstspGainCode()));
					}
					if ( !sgrstspElement.getSgrstspIncmCode().isNull() )
					{
						sgrstspElement.setSgrstspIncmDesc(SbStvincm.fGetDescription(sgrstspElement.getSgrstspIncmCode()));
					}
					//   COPY THE GENERAL STUDENT RECORD
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					if ( SbLearner.fExists(/*pPidm=>*/sgrstspElement.getSgrstspPidm(), /*pTermCodeEff=>*/sgrstspElement.getSgrstspTermCodeEff(), /*pRowid=>*/toStr(DbManager.getDataBaseFactory().rowidToString(sgrstspElement.getROWID()))).equals("N") )
					{
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						SbLearner.pCopyLearner(/*pPidm=>*/sgrstspElement.getSgrstspPidm(), /*pTermCodeOld=>*/oldTerm, /*pTermCodeNew=>*/sgrstspElement.getSgrstspTermCodeEff());
					}
					try
					{
						// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
						Soklcur.pCopyStudypath(/*pPidm=>*/sgrstspElement.getSgrstspPidm(), /*pTermCodeOld=>*/oldTerm, /*pTermCodeNew=>*/sgrstspElement.getSgrstspTermCodeEff(), /*pKeyseqno=>*/sgrstspElement.getSgrstspKeySeqno());
					}
					catch(Exception  e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP.KEY-CREREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void sgrstsp_CreateRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP.KEY-DELREC
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;	
 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sgrstsp_DeleteRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP.KEY-NXTREC
		 	:SYSTEM.MESSAGE_LEVEL := '10';
	NEXT_RECORD;
	:SYSTEM.MESSAGE_LEVEL := '0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sgrstsp_NextRecord()
		{
			
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '10'
				MessageServices.setMessageLevel(MessageLevel.NONE);
				nextRecord();
				// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
				MessageServices.resetMessageLevel();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP.KEY-PRVBLK
		 :s$_curricula.sorlfos_next_block_nav := 'SORLFOS';
EXECUTE_TRIGGER('CALL_CURRICULUM');
G$_CHECK_FAILURE;
GO_BLOCK('SORLFOS'); 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sgrstsp_PreviousBlock()
		{
			
				getFormModel().getSCurricula().setSorlfosNextBlockNav(toStr("SORLFOS"));
				executeAction("CALL_CURRICULUM");
				getContainer().getGoqrpls().gCheckFailure();
				goBlock(toStr("SORLFOS"));
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP.ON-UPDATE
		 --
-- ON-UPDATE Trigger
--
 
BEGIN
    :S$_CURRICULA.EVALUATE_COURSES := 'Y';
--	
    SB_STUDYPATH.P_UPDATE(
     p_PIDM                   =>:SGRSTSP.SGRSTSP_PIDM,
     P_KEY_SEQNO              => :SGRSTSP.SGRSTSP_KEY_SEQNO,
     p_TERM_CODE_EFF          =>:SGRSTSP.SGRSTSP_TERM_CODE_EFF,
     p_STSp_CODE              =>:SGRSTSP.SGRSTSP_STSP_CODE,
     p_FULL_PART_IND          =>:SGRSTSP.SGRSTSP_FULL_PART_IND,
     p_SESS_CODE              =>:SGRSTSP.SGRSTSP_SESS_CODE,
     p_RESD_CODE              =>:SGRSTSP.SGRSTSP_RESD_CODE,
     p_ORSN_CODE              =>:SGRSTSP.SGRSTSP_ORSN_CODE,
     p_PRAC_CODE              =>:SGRSTSP.SGRSTSP_PRAC_CODE,
     p_CAPL_CODE              =>:SGRSTSP.SGRSTSP_CAPL_CODE,
     p_ASTD_CODE              =>:SGRSTSP.SGRSTSP_ASTD_CODE,
     p_EDLV_CODE              =>:SGRSTSP.SGRSTSP_EDLV_CODE,
     p_INCM_CODE              =>:SGRSTSP.SGRSTSP_INCM_CODE,
     p_EMEX_CODE              =>:SGRSTSP.SGRSTSP_EMEX_CODE,
     p_APRN_CODE              =>:SGRSTSP.SGRSTSP_APRN_CODE,
     p_TRCN_CODE              =>:SGRSTSP.SGRSTSP_TRCN_CODE,
     p_GAIN_CODE              =>:SGRSTSP.SGRSTSP_GAIN_CODE,
     p_VOED_CODE              =>:SGRSTSP.SGRSTSP_VOED_CODE,
     p_BLCK_CODE              =>:SGRSTSP.SGRSTSP_BLCK_CODE,
     p_EGOL_CODE              =>:SGRSTSP.SGRSTSP_EGOL_CODE,
     p_BSKL_CODE              =>:SGRSTSP.SGRSTSP_BSKL_CODE,
     p_PREV_CODE              =>:SGRSTSP.SGRSTSP_PREV_CODE,
     p_CAST_CODE              =>:SGRSTSP.SGRSTSP_CAST_CODE,
     p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN,
     p_USER_ID                => GB_COMMON.F_SCT_user,
     p_ROWID                  =>:SGRSTSP.ROWID); 
 
    
--
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void sgrstsp_RowUpdate(RowAdapterEvent args)
		{
			
				// 
				//  ON-UPDATE Trigger
				// 
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)args.getRow();


				try
				{
					getFormModel().getSCurricula().setEvaluateCourses(toStr("Y"));
					// 	
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
					SbStudypath.pUpdate(/*pPidm=>*/sgrstspElement.getSgrstspPidm(), toStr(/*pKeySeqno=>*/sgrstspElement.getSgrstspKeySeqno()), toNumber(/*pTermCodeEff=>*/sgrstspElement.getSgrstspTermCodeEff()), /*pStspCode=>*/sgrstspElement.getSgrstspStspCode(), /*pFullPartInd=>*/sgrstspElement.getSgrstspFullPartInd(), /*pSessCode=>*/sgrstspElement.getSgrstspSessCode(), /*pResdCode=>*/sgrstspElement.getSgrstspResdCode(), /*pOrsnCode=>*/sgrstspElement.getSgrstspOrsnCode(), /*pPracCode=>*/sgrstspElement.getSgrstspPracCode(), /*pCaplCode=>*/sgrstspElement.getSgrstspCaplCode(), /*pAstdCode=>*/sgrstspElement.getSgrstspAstdCode(), /*pEdlvCode=>*/sgrstspElement.getSgrstspEdlvCode(), /*pIncmCode=>*/sgrstspElement.getSgrstspIncmCode(), /*pEmexCode=>*/sgrstspElement.getSgrstspEmexCode(), /*pAprnCode=>*/sgrstspElement.getSgrstspAprnCode(), /*pTrcnCode=>*/sgrstspElement.getSgrstspTrcnCode(), /*pGainCode=>*/sgrstspElement.getSgrstspGainCode(), /*pVoedCode=>*/sgrstspElement.getSgrstspVoedCode(), /*pBlckCode=>*/sgrstspElement.getSgrstspBlckCode(), /*pEgolCode=>*/sgrstspElement.getSgrstspEgolCode(), /*pBsklCode=>*/sgrstspElement.getSgrstspBsklCode(), /*pPrevCode=>*/sgrstspElement.getSgrstspPrevCode(), /*pCastCode=>*/sgrstspElement.getSgrstspCastCode(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pUserId=>*/GbCommon.fSctUser(), /*pRowid=>*/toStr(DbManager.getDataBaseFactory().rowidToString(sgrstspElement.getROWID())));
				}
				catch(Exception  e)
				{
					getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP.ON-INSERT
		 --
-- ON-UPDATE Trigger
--
-- Check for the existence of the record before attempting to insert. It may have already been created via the KEY-DUPREC trigger.
--
declare 
	growid     VARCHAR2(18); 
	lv_found   VARCHAR2(1) := 'N';
	
	CURSOR sgrstsp_c IS
	   SELECT 'Y' FROM sgrstsp
	   WHERE sgrstsp_pidm = :SGRSTSP.SGRSTSP_PIDM
	   AND   sgrstsp_key_seqno = :SGRSTSP.SGRSTSP_KEY_SEQNO
	   AND   sgrstsp_term_code_eff = :SGRSTSP.SGRSTSP_TERM_CODE_EFF;
-- 
BEGIN
	:S$_CURRICULA.EVALUATE_COURSES := 'Y';
--
  OPEN  sgrstsp_c;
  FETCH sgrstsp_c INTO lv_found;
  CLOSE sgrstsp_c;
  IF lv_found = 'N' THEN	
	  SB_STUDYPATH.P_create(
     p_PIDM                   =>:SGRSTSP.SGRSTSP_PIDM,
     P_KEY_SEQNO              => :SGRSTSP.SGRSTSP_KEY_SEQNO,
     p_TERM_CODE_EFF          =>:SGRSTSP.SGRSTSP_TERM_CODE_EFF,
     p_STSp_CODE              =>:SGRSTSP.SGRSTSP_STSP_CODE,
     p_FULL_PART_IND          =>:SGRSTSP.SGRSTSP_FULL_PART_IND,
     p_SESS_CODE              =>:SGRSTSP.SGRSTSP_SESS_CODE,
     p_RESD_CODE              =>:SGRSTSP.SGRSTSP_RESD_CODE,
     p_ORSN_CODE              =>:SGRSTSP.SGRSTSP_ORSN_CODE,
     p_PRAC_CODE              =>:SGRSTSP.SGRSTSP_PRAC_CODE,
     p_CAPL_CODE              =>:SGRSTSP.SGRSTSP_CAPL_CODE,
     p_ASTD_CODE              =>:SGRSTSP.SGRSTSP_ASTD_CODE,
     p_EDLV_CODE              =>:SGRSTSP.SGRSTSP_EDLV_CODE,
     p_INCM_CODE              =>:SGRSTSP.SGRSTSP_INCM_CODE,
     p_EMEX_CODE              =>:SGRSTSP.SGRSTSP_EMEX_CODE,
     p_APRN_CODE              =>:SGRSTSP.SGRSTSP_APRN_CODE,
     p_TRCN_CODE              =>:SGRSTSP.SGRSTSP_TRCN_CODE,
     p_GAIN_CODE              =>:SGRSTSP.SGRSTSP_GAIN_CODE,
     p_VOED_CODE              =>:SGRSTSP.SGRSTSP_VOED_CODE,
     p_BLCK_CODE              =>:SGRSTSP.SGRSTSP_BLCK_CODE,
     p_EGOL_CODE              =>:SGRSTSP.SGRSTSP_EGOL_CODE,
     p_BSKL_CODE              =>:SGRSTSP.SGRSTSP_BSKL_CODE,
     p_PREV_CODE              =>:SGRSTSP.SGRSTSP_PREV_CODE,
     p_CAST_CODE              =>:SGRSTSP.SGRSTSP_CAST_CODE,
     p_DATA_ORIGIN            =>:GLOBAL.DATA_ORIGIN,
     p_USER_ID                => GB_COMMON.F_SCT_user,
     p_ROWID_OUT              => growid); 
  END IF;
--
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void sgrstsp_RowInsert(RowAdapterEvent args)
		{
			
				// 
				//  ON-UPDATE Trigger
				// 
				//  Check for the existence of the record before attempting to insert. It may have already been created via the KEY-DUPREC trigger.
				// 
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)args.getRow();


				int rowCount = 0;
				{
					NString growid= NString.getNull();
					NString lvFound = toStr("N");
					String sqlsgrstspC = "SELECT 'Y' " +
	" FROM sgrstsp " +
	" WHERE sgrstsp_pidm = :SGRSTSP_SGRSTSP_PIDM AND sgrstsp_key_seqno = :SGRSTSP_SGRSTSP_KEY_SEQNO AND sgrstsp_term_code_eff = :SGRSTSP_SGRSTSP_TERM_CODE_EFF ";
					DataCursor sgrstspC = new DataCursor(sqlsgrstspC);
					try
					{
						getFormModel().getSCurricula().setEvaluateCourses(toStr("Y"));
						// 
						//Setting query parameters
						sgrstspC.addParameter("SGRSTSP_SGRSTSP_PIDM", sgrstspElement.getSgrstspPidm());
						sgrstspC.addParameter("SGRSTSP_SGRSTSP_KEY_SEQNO", sgrstspElement.getSgrstspKeySeqno());
						sgrstspC.addParameter("SGRSTSP_SGRSTSP_TERM_CODE_EFF", sgrstspElement.getSgrstspTermCodeEff());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sgrstspC.
						sgrstspC.open();
						ResultSet sgrstspCResults = sgrstspC.fetchInto();
						if ( sgrstspCResults != null ) {
							lvFound = sgrstspCResults.getStr(0);
						}
						sgrstspC.close();
						if ( lvFound.equals("N") )
						{
							// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
							Ref<NNumber> p_key_seqno_ref = new Ref<NNumber>();
							Ref<NString> p_rowid_out_ref = new Ref<NString>(growid);
							SbStudypath.pCreate(/*pPidm=>*/sgrstspElement.getSgrstspPidm(), toStr(/*pKeySeqno=>*/sgrstspElement.getSgrstspKeySeqno()), p_key_seqno_ref, /*pStspCode=>*/sgrstspElement.getSgrstspStspCode(), /*pFullPartInd=>*/sgrstspElement.getSgrstspFullPartInd(), /*pSessCode=>*/sgrstspElement.getSgrstspSessCode(), /*pResdCode=>*/sgrstspElement.getSgrstspResdCode(), /*pOrsnCode=>*/sgrstspElement.getSgrstspOrsnCode(), /*pPracCode=>*/sgrstspElement.getSgrstspPracCode(), /*pCaplCode=>*/sgrstspElement.getSgrstspCaplCode(), /*pAstdCode=>*/sgrstspElement.getSgrstspAstdCode(), /*pEdlvCode=>*/sgrstspElement.getSgrstspEdlvCode(), /*pIncmCode=>*/sgrstspElement.getSgrstspIncmCode(), /*pEmexCode=>*/sgrstspElement.getSgrstspEmexCode(), /*pAprnCode=>*/sgrstspElement.getSgrstspAprnCode(), /*pTrcnCode=>*/sgrstspElement.getSgrstspTrcnCode(), /*pGainCode=>*/sgrstspElement.getSgrstspGainCode(), /*pVoedCode=>*/sgrstspElement.getSgrstspVoedCode(), /*pBlckCode=>*/sgrstspElement.getSgrstspBlckCode(), /*pEgolCode=>*/sgrstspElement.getSgrstspEgolCode(), /*pBsklCode=>*/sgrstspElement.getSgrstspBsklCode(), /*pPrevCode=>*/sgrstspElement.getSgrstspPrevCode(), /*pCastCode=>*/sgrstspElement.getSgrstspCastCode(), /*pDataOrigin=>*/getGlobal("DATA_ORIGIN"), /*pUserId=>*/GbCommon.fSctUser(), p_rowid_out_ref);
							sgrstspElement.setSgrstspTermCodeEff(toStr(p_key_seqno_ref.val));
							growid = p_rowid_out_ref.val;
						}
					}
					catch(Exception  e)
					{
						getContainer().getGoqrpls().gDisplayErrMsg(errorMessage());
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP.POST-QUERY
		 --- get the name of the study path

  declare 
  	
    	 
 
  begin 
   :end_stsp_term := null; 
    EXECUTE_TRIGGER('END_TERM');
  
  :SGRSTSP_NAME := sb_studypath_name.f_learner_study_path_name(:sgrstsp_pidm,
         :sgrstsp_term_code_eff, :sgrstsp_key_seqno); 
  
  if :sgrstsp_stsp_code is not null then 
     :sgrstsp_stsp_desc := sb_stvstsp.f_get_description(:sgrstsp_stsp_code);
  end if; 
   if :sgrstsp_astd_code is not null then 
    :sgrstsp_astd_desc := sb_stvastd.f_get_description(:sgrstsp_astd_code);
   end if; 
  if :sgrstsp_prev_code is not null then 
 	  :sgrstsp_prev_desc := sb_stvprev.f_get_description(:sgrstsp_prev_code); 
  end if; 
  if :sgrstsp_cast_code is not null then
    	:sgrstsp_cast_desc := sb_stvcast.f_get_description(:sgrstsp_cast_code);
  end if; 
	if :sgrstsp_resd_code is not null then
	  :sgrstsp_resd_desc := sb_stvresd.f_get_description(:sgrstsp_resd_code);
	end if; 
	if :sgrstsp_sess_code is not null then
  	:sgrstsp_sess_desc := sb_stvsess.f_get_description(:sgrstsp_sess_code);
	end if; 
 		if :sgrstsp_blck_code is not null then
  	:sgrstsp_blck_desc := sb_stvblck.f_get_description(:sgrstsp_blck_code);  
		end if; 
	if :sgrstsp_bskl_code is not null then 	
		 :sgrstsp_bskl_desc := sb_stvbskl.f_get_description(:sgrstsp_bskl_code);
	end if; 
	if :sgrstsp_prac_code is not null then 	
		:sgrstsp_prac_desc := sb_stvprac.f_get_description(:sgrstsp_prac_code); 
	end if; 
	if :sgrstsp_orsn_code is not null then 	
		:sgrstsp_orsn_desc := sb_stvorsn.f_get_description(:sgrstsp_orsn_code); 
	end if; 
	if :sgrstsp_emex_code is not null then 
	  :sgrstsp_emex_desc := sb_stvemex.f_get_description(:sgrstsp_emex_code);
	end if;
	if :sgrstsp_edlv_code is not null then 
  	:sgrstsp_edlv_desc := sb_stvedlv.f_get_description(:sgrstsp_edlv_code);
	end if;
	if :sgrstsp_capl_code is not null then 
  	:sgrstsp_capl_desc := sb_stvcapl.f_get_description(:sgrstsp_capl_code);
	end if;
  if :sgrstsp_trcn_code is not null then 
  	:sgrstsp_trcn_desc := sb_stvtrcn.f_get_description(:sgrstsp_trcn_code);
	end if;
	if :sgrstsp_voed_code is not null then 
  	:sgrstsp_voed_desc := sb_stvvoed.f_get_description(:sgrstsp_voed_code);
	end if;
	if :sgrstsp_egol_code is not null then 
  	:sgrstsp_egol_desc := sb_stvegol.f_get_description(:sgrstsp_egol_code);
	end if;
	if :sgrstsp_aprn_code is not null then 
  	:sgrstsp_aprn_desc := sb_stvaprn.f_get_description(:sgrstsp_aprn_code);
	end if;
	if :sgrstsp_gain_code is not null then 
  	:sgrstsp_gain_desc := sb_stvgain.f_get_description(:sgrstsp_gain_code);
	end if;
	if :sgrstsp_incm_code is not null then 
  	:sgrstsp_incm_desc := sb_stvincm.f_get_description(:sgrstsp_incm_code);
	end if;

	end; 
    

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sgrstsp_AfterQuery(RowAdapterEvent args)
		{
			
				// - get the name of the study path
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)args.getRow();
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);

				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.

				try
				{
					sgrstspElement.setLockDbValues(true);
								this.sgrstspBlckCode_PostChange();

				} finally { 
					sgrstspElement.setLockDbValues(false);
				}
				{
					sgrstspElement.setEndStspTerm(toStr(null));
					executeAction("END_TERM");
					sgrstspElement.setSgrstspName(SbStudypathName.fLearnerStudyPathName(sgrstspElement.getSgrstspPidm(), sgrstspElement.getSgrstspTermCodeEff(), sgrstspElement.getSgrstspKeySeqno(),sorlcurElement.getSorlcurSeqno()));
					if ( !sgrstspElement.getSgrstspStspCode().isNull() )
					{
						sgrstspElement.setSgrstspStspDesc(SbStvstsp.fGetDescription(sgrstspElement.getSgrstspStspCode()));
					}
					if ( !sgrstspElement.getSgrstspAstdCode().isNull() )
					{
						sgrstspElement.setSgrstspAstdDesc(SbStvastd.fGetDescription(sgrstspElement.getSgrstspAstdCode()));
					}
					if ( !sgrstspElement.getSgrstspPrevCode().isNull() )
					{
						sgrstspElement.setSgrstspPrevDesc(SbStvprev.fGetDescription(sgrstspElement.getSgrstspPrevCode()));
					}
					if ( !sgrstspElement.getSgrstspCastCode().isNull() )
					{
						sgrstspElement.setSgrstspCastDesc(SbStvcast.fGetDescription(sgrstspElement.getSgrstspCastCode()));
					}
					if ( !sgrstspElement.getSgrstspResdCode().isNull() )
					{
						sgrstspElement.setSgrstspResdDesc(SbStvresd.fGetDescription(sgrstspElement.getSgrstspResdCode()));
					}
					if ( !sgrstspElement.getSgrstspSessCode().isNull() )
					{
						sgrstspElement.setSgrstspSessDesc(SbStvsess.fGetDescription(sgrstspElement.getSgrstspSessCode()));
					}
					if ( !sgrstspElement.getSgrstspBlckCode().isNull() )
					{
						sgrstspElement.setSgrstspBlckDesc(SbStvblck.fGetDescription(sgrstspElement.getSgrstspBlckCode()));
					}
					if ( !sgrstspElement.getSgrstspBsklCode().isNull() )
					{
						sgrstspElement.setSgrstspBsklDesc(SbStvbskl.fGetDescription(sgrstspElement.getSgrstspBsklCode()));
					}
					if ( !sgrstspElement.getSgrstspPracCode().isNull() )
					{
						sgrstspElement.setSgrstspPracDesc(SbStvprac.fGetDescription(sgrstspElement.getSgrstspPracCode()));
					}
					if ( !sgrstspElement.getSgrstspOrsnCode().isNull() )
					{
						sgrstspElement.setSgrstspOrsnDesc(SbStvorsn.fGetDescription(sgrstspElement.getSgrstspOrsnCode()));
					}
					if ( !sgrstspElement.getSgrstspEmexCode().isNull() )
					{
						sgrstspElement.setSgrstspEmexDesc(SbStvemex.fGetDescription(sgrstspElement.getSgrstspEmexCode()));
					}
					if ( !sgrstspElement.getSgrstspEdlvCode().isNull() )
					{
						sgrstspElement.setSgrstspEdlvDesc(SbStvedlv.fGetDescription(sgrstspElement.getSgrstspEdlvCode()));
					}
					if ( !sgrstspElement.getSgrstspCaplCode().isNull() )
					{
						sgrstspElement.setSgrstspCaplDesc(SbStvcapl.fGetDescription(sgrstspElement.getSgrstspCaplCode()));
					}
					if ( !sgrstspElement.getSgrstspTrcnCode().isNull() )
					{
						sgrstspElement.setSgrstspTrcnDesc(SbStvtrcn.fGetDescription(sgrstspElement.getSgrstspTrcnCode()));
					}
					if ( !sgrstspElement.getSgrstspVoedCode().isNull() )
					{
						sgrstspElement.setSgrstspVoedDesc(SbStvvoed.fGetDescription(sgrstspElement.getSgrstspVoedCode()));
					}
					if ( !sgrstspElement.getSgrstspEgolCode().isNull() )
					{
						sgrstspElement.setSgrstspEgolDesc(SbStvegol.fGetDescription(sgrstspElement.getSgrstspEgolCode()));
					}
					if ( !sgrstspElement.getSgrstspAprnCode().isNull() )
					{
						sgrstspElement.setSgrstspAprnDesc(SbStvaprn.fGetDescription(sgrstspElement.getSgrstspAprnCode()));
					}
					if ( !sgrstspElement.getSgrstspGainCode().isNull() )
					{
						sgrstspElement.setSgrstspGainDesc(SbStvgain.fGetDescription(sgrstspElement.getSgrstspGainCode()));
					}
					if ( !sgrstspElement.getSgrstspIncmCode().isNull() )
					{
						sgrstspElement.setSgrstspIncmDesc(SbStvincm.fGetDescription(sgrstspElement.getSgrstspIncmCode()));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP.WHEN-NEW-BLOCK-INSTANCE
		 
 
EXECUTE_QUERY;

 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void sgrstsp_blockChange()
		{
			
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP.WHEN-NEW-RECORD-INSTANCE
		 IF :sgrstsp_key_seqno IS NULL THEN
	:SYSTEM.MESSAGE_LEVEL := '10';
	PREVIOUS_RECORD;
	MESSAGE( G$_NLS.Get('SOQOLIB-0452', 'FORM','Cannot create study path here, must be created from curriculum.') );
	RAISE FORM_TRIGGER_FAILURE;
	:SYSTEM.MESSAGE_LEVEL := '0';
END IF;

if :sgrstsp_term_code_eff <  :global.studypath_term   then 
	 

   set_curric_properties('SGRSTSP_STSP_CODE','UPDATABLE','property_false');  
   set_item_property( 'SGRSTSP_STSP_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0453', 'FORM','Study Path Status; Effective Term is not Current, update not allowed.'));                      
  
  set_curric_properties('SGRSTSP_BLCK_CODE','UPDATABLE','property_false'); 
   set_item_property( 'SGRSTSP_BLCK_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0454', 'FORM','Block Code; Effective Term is not Current, update not allowed.')); 


   set_curric_properties('SGRSTSP_FULL_PART_IND','UPDATABLE','property_false'); 
   set_item_property( 'SGRSTSP_FULL_PART_IND',HINT_TEXT,G$_NLS.Get('SOQOLIB-0455', 'FORM','Full Part Time Indicator; Effective Term is not Current, update not allowed.')); 
                                 
   set_curric_properties('SGRSTSP_SESS_CODE','UPDATABLE','property_false');                                     
   set_item_property( 'SGRSTSP_SESS_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0456', 'FORM','Session Code; Effective Term is not Current, update not allowed.')); 

   set_curric_properties('SGRSTSP_RESD_CODE','UPDATABLE','property_false');                                     
   set_item_property( 'SGRSTSP_RESD_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0457', 'FORM','Residence Code; Effective Term is not Current, update not allowed.')); 

   set_curric_properties('SGRSTSP_ASTD_CODE','UPDATABLE','property_false');                                     
   set_item_property( 'SGRSTSP_ASTD_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0458', 'FORM','Academic Standing; Effective Term is not Current, update not allowed.')); 


   set_curric_properties('SGRSTSP_PREV_CODE','UPDATABLE','property_false');                                     
   set_item_property( 'SGRSTSP_PREV_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0459', 'FORM','Progress Evaluation; Effective Term is not Current, update not allowed.')); 


   set_curric_properties('SGRSTSP_CAST_CODE','UPDATABLE','property_false');                                    
   set_item_property( 'SGRSTSP_CAST_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0460', 'FORM','Combined Standing Code; Effective Term is not Current, update not allowed.')); 



elsif nvl(:s$_studypath.reg_inprogress ,'N') = 'Y' then 
 
   set_curric_properties('SGRSTSP_STSP_CODE','UPDATABLE','property_false');  
   set_item_property( 'SGRSTSP_STSP_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0461', 'FORM','Study Path Status; Registration exists, update not allowed.'));                      


   set_curric_properties('SGRSTSP_FULL_PART_IND','UPDATABLE','property_false'); 
   set_item_property( 'SGRSTSP_FULL_PART_IND',HINT_TEXT,G$_NLS.Get('SOQOLIB-0462', 'FORM','Full Part Time Indicator; Registration exists, update not allowed.')); 
  
     set_curric_properties('SGRSTSP_BLCK_CODE','UPDATABLE','property_false'); 
   set_item_property( 'SGRSTSP_BLCK_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0463', 'FORM','Block Code; Registration exists, update not allowed.')); 
                               
   set_curric_properties('SGRSTSP_SESS_CODE','UPDATABLE','property_false');                                     
   set_item_property( 'SGRSTSP_SESS_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0464', 'FORM','Session Code; Registration exists, update not allowed.')); 

   set_curric_properties('SGRSTSP_RESD_CODE','UPDATABLE','property_false');                                     
   set_item_property( 'SGRSTSP_RESD_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0465', 'FORM','Residence Code; Registration exists, update not allowed.')); 

   set_curric_properties('SGRSTSP_ASTD_CODE','UPDATABLE','property_false');                                     
   set_item_property( 'SGRSTSP_ASTD_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0466', 'FORM','Academic Standing; Registration exists, update not allowed.')); 


   set_curric_properties('SGRSTSP_PREV_CODE','UPDATABLE','property_false');                                     
   set_item_property( 'SGRSTSP_PREV_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0467', 'FORM','Progress Evaluation; Registration exists, update not allowed.')); 


   set_curric_properties('SGRSTSP_CAST_CODE','UPDATABLE','property_false');                                    
   set_item_property( 'SGRSTSP_CAST_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0468', 'FORM','Combined Standing Code; Registration exists, update not allowed.')); 



else
   set_curric_properties('SGRSTSP_STSP_CODE','UPDATABLE','property_true');  
   set_item_property( 'SGRSTSP_STSP_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0469', 'FORM','Study Path Status; Press LIST for values.'));                      


   set_curric_properties('SGRSTSP_FULL_PART_IND','UPDATABLE','property_true');   
   set_item_property( 'SGRSTSP_FULL_PART_IND',HINT_TEXT,G$_NLS.Get('SOQOLIB-0470', 'FORM','Full Part Time Indicator; Press LIST for values.')); 
                                 
   set_curric_properties('SGRSTSP_SESS_CODE','UPDATABLE','property_true');                                     
   set_item_property( 'SGRSTSP_SESS_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0471', 'FORM','Session Code; Press LIST for values.')); 

   set_curric_properties('SGRSTSP_BLCK_CODE','UPDATABLE','property_true');                                     
   set_item_property( 'SGRSTSP_BLCK_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0472', 'FORM','Block Code; Press LIST for values.')); 

   set_curric_properties('SGRSTSP_RESD_CODE','UPDATABLE','property_true');                                     
   set_item_property( 'SGRSTSP_RESD_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0473', 'FORM','Residence Code; Press LIST for values.')); 

   set_curric_properties('SGRSTSP_ASTD_CODE','UPDATABLE','property_true');                                     
   set_item_property( 'SGRSTSP_ASTD_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0474', 'FORM','Academic Standing; Press LIST for values.')); 


   set_curric_properties('SGRSTSP_PREV_CODE','UPDATABLE','property_true');                                     
   set_item_property( 'SGRSTSP_PREV_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0475', 'FORM','Progress Evaluation; Press LIST for values.')); 


   set_curric_properties('SGRSTSP_CAST_CODE','UPDATABLE','property_true');                                    
   set_item_property( 'SGRSTSP_CAST_CODE',HINT_TEXT,G$_NLS.Get('SOQOLIB-0476', 'FORM','Combined Standing Code; Press LIST for values.')); 


end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sgrstsp_recordChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspKeySeqno().isNull() )
				{
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '10'
					try
					{
					MessageServices.setMessageLevel(MessageLevel.NONE);
					previousRecord();
					errorMessage(GNls.Fget(toStr("SOQOLIB-0452"), toStr("FORM"), toStr("Cannot create study path here, must be created from curriculum.")));
					throw new ApplicationException();
					}
					// MORPHIS TODO : Implementation SYSTEM.MESSAGE_LEVEL '0'
					finally {
					MessageServices.resetMessageLevel();
					}
				}
				if ( sgrstspElement.getSgrstspTermCodeEff().lesser(getGlobal("STUDYPATH_TERM")) )
				{
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_STSP_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_STSP_CODE", GNls.Fget(toStr("SOQOLIB-0453"), toStr("FORM"), toStr("Study Path Status; Effective Term is not Current, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_BLCK_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_BLCK_CODE", GNls.Fget(toStr("SOQOLIB-0454"), toStr("FORM"), toStr("Block Code; Effective Term is not Current, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_FULL_PART_IND"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_FULL_PART_IND", GNls.Fget(toStr("SOQOLIB-0455"), toStr("FORM"), toStr("Full Part Time Indicator; Effective Term is not Current, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_SESS_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_SESS_CODE", GNls.Fget(toStr("SOQOLIB-0456"), toStr("FORM"), toStr("Session Code; Effective Term is not Current, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_RESD_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_RESD_CODE", GNls.Fget(toStr("SOQOLIB-0457"), toStr("FORM"), toStr("Residence Code; Effective Term is not Current, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_ASTD_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_ASTD_CODE", GNls.Fget(toStr("SOQOLIB-0458"), toStr("FORM"), toStr("Academic Standing; Effective Term is not Current, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_PREV_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_PREV_CODE", GNls.Fget(toStr("SOQOLIB-0459"), toStr("FORM"), toStr("Progress Evaluation; Effective Term is not Current, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_CAST_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_CAST_CODE", GNls.Fget(toStr("SOQOLIB-0460"), toStr("FORM"), toStr("Combined Standing Code; Effective Term is not Current, update not allowed.")));
				}
				else if ( isNull(getFormModel().getSStudypath().getRegInprogress(), "N").equals("Y") ) {
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_STSP_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_STSP_CODE", GNls.Fget(toStr("SOQOLIB-0461"), toStr("FORM"), toStr("Study Path Status; Registration exists, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_FULL_PART_IND"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_FULL_PART_IND", GNls.Fget(toStr("SOQOLIB-0462"), toStr("FORM"), toStr("Full Part Time Indicator; Registration exists, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_BLCK_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_BLCK_CODE", GNls.Fget(toStr("SOQOLIB-0463"), toStr("FORM"), toStr("Block Code; Registration exists, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_SESS_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_SESS_CODE", GNls.Fget(toStr("SOQOLIB-0464"), toStr("FORM"), toStr("Session Code; Registration exists, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_RESD_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_RESD_CODE", GNls.Fget(toStr("SOQOLIB-0465"), toStr("FORM"), toStr("Residence Code; Registration exists, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_ASTD_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_ASTD_CODE", GNls.Fget(toStr("SOQOLIB-0466"), toStr("FORM"), toStr("Academic Standing; Registration exists, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_PREV_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_PREV_CODE", GNls.Fget(toStr("SOQOLIB-0467"), toStr("FORM"), toStr("Progress Evaluation; Registration exists, update not allowed.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_CAST_CODE"), toStr("UPDATABLE"), toStr("property_false"));
					setItemHint("SGRSTSP_CAST_CODE", GNls.Fget(toStr("SOQOLIB-0468"), toStr("FORM"), toStr("Combined Standing Code; Registration exists, update not allowed.")));
				}
				else {
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_STSP_CODE"), toStr("UPDATABLE"), toStr("property_true"));
					setItemHint("SGRSTSP_STSP_CODE", GNls.Fget(toStr("SOQOLIB-0469"), toStr("FORM"), toStr("Study Path Status; Press LIST for values.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_FULL_PART_IND"), toStr("UPDATABLE"), toStr("property_true"));
					setItemHint("SGRSTSP_FULL_PART_IND", GNls.Fget(toStr("SOQOLIB-0470"), toStr("FORM"), toStr("Full Part Time Indicator; Press LIST for values.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_SESS_CODE"), toStr("UPDATABLE"), toStr("property_true"));
					setItemHint("SGRSTSP_SESS_CODE", GNls.Fget(toStr("SOQOLIB-0471"), toStr("FORM"), toStr("Session Code; Press LIST for values.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_BLCK_CODE"), toStr("UPDATABLE"), toStr("property_true"));
					setItemHint("SGRSTSP_BLCK_CODE", GNls.Fget(toStr("SOQOLIB-0472"), toStr("FORM"), toStr("Block Code; Press LIST for values.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_RESD_CODE"), toStr("UPDATABLE"), toStr("property_true"));
					setItemHint("SGRSTSP_RESD_CODE", GNls.Fget(toStr("SOQOLIB-0473"), toStr("FORM"), toStr("Residence Code; Press LIST for values.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_ASTD_CODE"), toStr("UPDATABLE"), toStr("property_true"));
					setItemHint("SGRSTSP_ASTD_CODE", GNls.Fget(toStr("SOQOLIB-0474"), toStr("FORM"), toStr("Academic Standing; Press LIST for values.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_PREV_CODE"), toStr("UPDATABLE"), toStr("property_true"));
					setItemHint("SGRSTSP_PREV_CODE", GNls.Fget(toStr("SOQOLIB-0475"), toStr("FORM"), toStr("Progress Evaluation; Press LIST for values.")));
					this.getContainer().getServices().setCurricProperties(toStr("SGRSTSP_CAST_CODE"), toStr("UPDATABLE"), toStr("property_true"));
					setItemHint("SGRSTSP_CAST_CODE", GNls.Fget(toStr("SOQOLIB-0476"), toStr("FORM"), toStr("Combined Standing Code; Press LIST for values.")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP.END_TERM
		 
   
   :end_stsp_term := sb_studypath.f_end_term(p_pidm => :sgrstsp_pidm,
      p_term_code_eff => :sgrstsp_term_code_eff,
      p_key_seqno => :sgrstsp_key_seqno); 
      
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.END_TERM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="END_TERM")
		public void sgrstsp_EndTerm()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
				sgrstspElement.setEndStspTerm(SbStudypath.fEndTerm(/*pPidm=>*/sgrstspElement.getSgrstspPidm(), /*pTermCodeEff=>*/sgrstspElement.getSgrstspTermCodeEff(), /*pKeySeqno=>*/sgrstspElement.getSgrstspKeySeqno()));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sgrstsp_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized
			
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_PIDM", getFormModel().getBusinessObject("KEY_BLOCK")
						.getValue("PIDM")));            


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_STUDYPATH_TERM", getGlobal("studypath_term")));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TERM_CODE_EFF.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_TERM_CODE_EFF")
		public void sgrstspTermCodeEff_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TERM_CODE_EFF.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_TERM_CODE_EFF", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspTermCodeEff_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TERM_CODE_EFF.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspTermCodeEff_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TERM_CODE_EFF.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspTermCodeEff_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TERM_CODE_EFF.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_TERM_CODE_EFF", function=KeyFunction.NEXT_ITEM)
		public void sgrstspTermCodeEff_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_STSP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_STSP_CODE")
		public void sgrstspStspCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_STSP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_STSP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspStspCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_STSP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspStspCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_STSP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspStspCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_STSP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_STSP_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspStspCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_STSP_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;

if :sgrstsp_stsp_code is null then
	 :sgrstsp_stsp_desc := ''; 
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_STSP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_STSP_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspStspCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspStspCode().isNull() )
				{
					sgrstspElement.setSgrstspStspDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_STSP_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_stsp_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvstsp.f_code_exists(:sgrstsp_stsp_code);
	:sgrstsp_stsp_desc := sb_stvstsp.f_get_description(:sgrstsp_stsp_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0477', 'FORM','*ERROR* Invalid study path status code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_STSP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_STSP_CODE")
		public void sgrstspStspCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspStspCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvstsp.fCodeExists(sgrstspElement.getSgrstspStspCode());
					sgrstspElement.setSgrstspStspDesc(SbStvstsp.fGetDescription(sgrstspElement.getSgrstspStspCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0477"), toStr("FORM"), toStr("*ERROR* Invalid study path status code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_STSP_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_STSP_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspStspDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ASTD_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_ASTD_CODE")
		public void sgrstspAstdCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ASTD_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_ASTD_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspAstdCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ASTD_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspAstdCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ASTD_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspAstdCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ASTD_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_ASTD_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspAstdCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_ASTD_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;

if :sgrstsp_astd_code is null then
	 :sgrstsp_astd_desc := ''; 
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ASTD_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_ASTD_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspAstdCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspAstdCode().isNull() )
				{
					sgrstspElement.setSgrstspAstdDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_ASTD_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_astd_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvastd.f_code_exists(:sgrstsp_astd_code);
	:sgrstsp_astd_desc := sb_stvastd.f_get_description(:sgrstsp_astd_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0478', 'FORM','*ERROR* Invalid academic status code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ASTD_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_ASTD_CODE")
		public void sgrstspAstdCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspAstdCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvastd.fCodeExists(sgrstspElement.getSgrstspAstdCode());
					sgrstspElement.setSgrstspAstdDesc(SbStvastd.fGetDescription(sgrstspElement.getSgrstspAstdCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0478"), toStr("FORM"), toStr("*ERROR* Invalid academic status code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ASTD_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_ASTD_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspAstdDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PREV_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_PREV_CODE")
		public void sgrstspPrevCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PREV_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_PREV_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspPrevCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PREV_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspPrevCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PREV_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspPrevCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PREV_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_PREV_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspPrevCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_PREV_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;

if :sgrstsp_prev_code is null then
	 :sgrstsp_prev_desc := ''; 
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PREV_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_PREV_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspPrevCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspPrevCode().isNull() )
				{
					sgrstspElement.setSgrstspPrevDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_PREV_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_prev_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvprev.f_code_exists(:sgrstsp_prev_code);
	:sgrstsp_prev_desc := sb_stvprev.f_get_description(:sgrstsp_prev_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0479', 'FORM','*ERROR* Invalid progress evaluation code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PREV_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_PREV_CODE")
		public void sgrstspPrevCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspPrevCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvprev.fCodeExists(sgrstspElement.getSgrstspPrevCode());
					sgrstspElement.setSgrstspPrevDesc(SbStvprev.fGetDescription(sgrstspElement.getSgrstspPrevCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0479"), toStr("FORM"), toStr("*ERROR* Invalid progress evaluation code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PREV_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_PREV_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspPrevDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAST_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_CAST_CODE")
		public void sgrstspCastCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAST_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_CAST_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspCastCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAST_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspCastCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAST_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspCastCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAST_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_CAST_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspCastCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_CAST_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;

if :sgrstsp_cast_code is null then
	 :sgrstsp_cast_desc := ''; 
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAST_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_CAST_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspCastCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspCastCode().isNull() )
				{
					sgrstspElement.setSgrstspCastDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_CAST_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_cast_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvcast.f_code_exists(:sgrstsp_cast_code);
	:sgrstsp_cast_desc := sb_stvcast.f_get_description(:sgrstsp_cast_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0480', 'FORM','*ERROR* Invalid combined academic status code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAST_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_CAST_CODE")
		public void sgrstspCastCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspCastCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvcast.fCodeExists(sgrstspElement.getSgrstspCastCode());
					sgrstspElement.setSgrstspCastDesc(SbStvcast.fGetDescription(sgrstspElement.getSgrstspCastCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0480"), toStr("FORM"), toStr("*ERROR* Invalid combined academic status code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAST_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_CAST_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspCastDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_RESD_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_RESD_CODE")
		public void sgrstspResdCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_RESD_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_RESD_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspResdCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_RESD_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspResdCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_RESD_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspResdCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_RESD_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_RESD_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspResdCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_RESD_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;

if :sgrstsp_resd_code is null then
	 :sgrstsp_resd_desc := ''; 
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_RESD_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_RESD_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspResdCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspResdCode().isNull() )
				{
					sgrstspElement.setSgrstspResdDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_RESD_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_resd_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvresd.f_code_exists(:sgrstsp_resd_code);
	:sgrstsp_resd_desc := sb_stvresd.f_get_description(:sgrstsp_resd_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0481', 'FORM','*ERROR* Invalid residence code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_RESD_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_RESD_CODE")
		public void sgrstspResdCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspResdCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvresd.fCodeExists(sgrstspElement.getSgrstspResdCode());
					sgrstspElement.setSgrstspResdDesc(SbStvresd.fGetDescription(sgrstspElement.getSgrstspResdCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0481"), toStr("FORM"), toStr("*ERROR* Invalid residence code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_RESD_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_RESD_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspResdDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BLCK_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_BLCK_CODE")
		public void sgrstspBlckCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BLCK_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_BLCK_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspBlckCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BLCK_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspBlckCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BLCK_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_BLCK_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspBlckCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_BLCK_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_blck_code is null then 
	 :sgrstsp_blck_desc := '';
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BLCK_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_BLCK_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspBlckCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspBlckCode().isNull() )
				{
					sgrstspElement.setSgrstspBlckDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_BLCK_CODE.G$_SEARCH_OPTIONS
		 
GO_ITEM('SGRSTSP.SGRSTSP_BLCK_CODE');
BREAK;
:CHECK_KEYS := 'N';
:HOLD_BLOCK_FIELD := :SYSTEM.CURSOR_ITEM;
G$_KEY_OPT_MENU('SGRSTSP_BLCK_CODE', G$_NLS.Get('SOQOLIB-0482', 'FORM','List of Blocks') ,'LIST_VALUES',
                                     G$_NLS.Get('SOQOLIB-0483', 'FORM','Block Schedule Query') ,'COUNT_QUERY',
                                    '','','','');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BLCK_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspBlckCode_GSearchOptions()
		{
			
				goItem(toStr("SGRSTSP.SGRSTSP_BLCK_CODE"));
				// F2J_TO_REMOVE : Call to built-in "BREAK" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.Break();
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'BREAK' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SOQOLIBF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				getFormModel().getDummy().setCheckKeys(toStr("N"));
				// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//				this.getModel()setValue(F2N_UKNOWN_BUSINESS_OBJECT,HOLD_BLOCK_FIELD,getCursorItem());
				getFormModel().getBusinessObject("FORM_HEADER").setValue("HOLD_BLOCK_FIELD", getCursorItem());
				getContainer().getGoqrpls().gKeyOptMenu(toStr("SGRSTSP_BLCK_CODE"), GNls.Fget(toStr("SOQOLIB-0482"), toStr("FORM"), toStr("List of Blocks")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0483"), toStr("FORM"), toStr("Block Schedule Query")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_BLCK_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   if :SGRSTSP_blck_code is null then
   	 :blck_desc := null;
   end if;
   :blck_desc := null; 
   :blck_desc := sb_stvblck.f_get_description(:SGRSTSP_BLCK_CODE);
   if :blck_desc is null then 
   	 message( G$_NLS.Get('SOQOLIB-0484', 'FORM','*ERROR* Invalid code; press LIST for valid codes.') );
   	 raise form_trigger_failure;
   end if;


--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BLCK_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SGRSTSP_BLCK_CODE")
		public void sgrstspBlckCode_PostChange()
		{
			
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);
					if(sgrstspElement==null)
						return;

				if(sgrstspElement.getSgrstspBlckCode().isNull())
		return;
				try
				{
					getContainer().getGoqrpls().gCheckQueryMode();
					// 
					if ( sgrstspElement.getSgrstspBlckCode().isNull() )
					{
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//						this.getModel()setValue(F2N_UKNOWN_BUSINESS_OBJECT,BLCK_DESC,null);
						sgrstspElement.setSgrstspBlckDesc(toStr(""));
					}
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//					this.getModel()setValue(F2N_UKNOWN_BUSINESS_OBJECT,BLCK_DESC,null);
					getFormModel().getBusinessObject("FORM_HEADER").setValue("BLCK_DESC", null);
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//					this.getModel()setValue(F2N_UKNOWN_BUSINESS_OBJECT,BLCK_DESC,SbStvblck.fGetDescription(sgrstspElement.getSgrstspBlckCode()));
					getFormModel().getBusinessObject("FORM_HEADER").setValue("BLCK_DESC",SbStvblck.fGetDescription(sgrstspElement.getSgrstspBlckCode()));
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//					if ( this.getModel()getValue(F2N_UKNOWN_BUSINESS_OBJECT,BLCK_DESC).isNull() )
					if ( getFormModel().getBusinessObject("FORM_HEADER").getValue("BLCK_DESC")!= null )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0484"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes.")));
						throw new ApplicationException();
					}
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_BLCK_CODE.KEY-CQUERY
		    :GLOBAL.CRN := '' ;
   :GLOBAL.BLCK_CODE := '' ;
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
    --F2J_TODO: Change global current_user01 to current_user
   G$_SECURED_FORM_CALL(:global.current_user01, 'SSABLKQ','');
   IF NOT FORM_SUCCESS THEN
      RETURN ;
   END IF ;
   IF :GLOBAL.BLCK_CODE IS NOT NULL  THEN
      :SGRSTSP_BLCK_CODE := :GLOBAL.BLCK_CODE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BLCK_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SGRSTSP_BLCK_CODE", function=KeyFunction.COUNT_QUERY)
		public void sgrstspBlckCode_TotalResults()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				setGlobal("CRN", toStr(""));
				setGlobal("BLCK_CODE", toStr(""));
				executeAction("G$_REVOKE_ACCESS");
				getContainer().getGoqrpls().gCheckFailure();
				// F2J_TODO: Change global current_user01 to current_user
				try{
					getContainer().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER01"), toStr("SSABLKQ"), toStr(""));
				} catch (Exception e){
					return;
				}
				if ( !getGlobal("BLCK_CODE").isNull() )
				{
					sgrstspElement.setSgrstspBlckCode(getGlobal("BLCK_CODE"));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BLCK_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_BLCK_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspBlckDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_SESS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_SESS_CODE")
		public void sgrstspSessCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_SESS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_SESS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspSessCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_SESS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspSessCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_SESS_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspSessCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_SESS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_SESS_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspSessCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_SESS_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_sess_code is null then 
	 :sgrstsp_sess_desc := '';
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_SESS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_SESS_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspSessCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspSessCode().isNull() )
				{
					sgrstspElement.setSgrstspSessDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_SESS_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_sess_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvsess.f_code_exists(:sgrstsp_sess_code);
	:sgrstsp_sess_desc := sb_stvsess.f_get_description(:sgrstsp_sess_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0485', 'FORM','*ERROR* Invalid sess code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_SESS_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_SESS_CODE")
		public void sgrstspSessCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspSessCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvsess.fCodeExists(sgrstspElement.getSgrstspSessCode());
					sgrstspElement.setSgrstspSessDesc(SbStvsess.fGetDescription(sgrstspElement.getSgrstspSessCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0485"), toStr("FORM"), toStr("*ERROR* Invalid sess code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_SESS_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_SESS_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspSessDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BSKL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_BSKL_CODE")
		public void sgrstspBsklCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BSKL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_BSKL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspBsklCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BSKL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspBsklCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BSKL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspBsklCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BSKL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_BSKL_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspBsklCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_BSKL_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_bskl_code is null then
	:sgrstsp_bskl_desc := '';
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BSKL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_BSKL_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspBsklCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspBsklCode().isNull() )
				{
					sgrstspElement.setSgrstspBsklDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_BSKL_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_bskl_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvbskl.f_code_exists(:sgrstsp_bskl_code);
  :sgrstsp_bskl_desc := sb_stvbskl.f_get_description(:sgrstsp_bskl_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0486', 'FORM','*ERROR* Invalid basic skills code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BSKL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_BSKL_CODE")
		public void sgrstspBsklCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspBsklCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvbskl.fCodeExists(sgrstspElement.getSgrstspBsklCode());
					sgrstspElement.setSgrstspBsklDesc(SbStvbskl.fGetDescription(sgrstspElement.getSgrstspBsklCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0486"), toStr("FORM"), toStr("*ERROR* Invalid basic skills code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BSKL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_BSKL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspBsklDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PRAC_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_PRAC_CODE")
		public void sgrstspPracCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PRAC_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_PRAC_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspPracCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PRAC_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspPracCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PRAC_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspPracCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PRAC_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_PRAC_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspPracCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_PRAC_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_prac_code is null then
	 :sgrstsp_prac_desc := '';
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PRAC_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_PRAC_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspPracCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspPracCode().isNull() )
				{
					sgrstspElement.setSgrstspPracDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_PRAC_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_prac_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvprac.f_code_exists(:sgrstsp_prac_code);
	:sgrstsp_prac_desc := sb_stvprac.f_get_description(:sgrstsp_prac_code); 
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0487', 'FORM','*ERROR* Invalid practical training code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PRAC_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_PRAC_CODE")
		public void sgrstspPracCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspPracCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvprac.fCodeExists(sgrstspElement.getSgrstspPracCode());
					sgrstspElement.setSgrstspPracDesc(SbStvprac.fGetDescription(sgrstspElement.getSgrstspPracCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0487"), toStr("FORM"), toStr("*ERROR* Invalid practical training code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_PRAC_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_PRAC_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspPracDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ORSN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_ORSN_CODE")
		public void sgrstspOrsnCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ORSN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_ORSN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspOrsnCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ORSN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspOrsnCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ORSN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspOrsnCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ORSN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_ORSN_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspOrsnCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_ORSN_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_orsn_code is null then 
	 :sgrstsp_orsn_desc := '';
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ORSN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_ORSN_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspOrsnCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspOrsnCode().isNull() )
				{
					sgrstspElement.setSgrstspOrsnDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_ORSN_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_orsn_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvorsn.f_code_exists(:sgrstsp_orsn_code);
  :sgrstsp_orsn_desc  := sb_stvorsn.f_get_description(:sgrstsp_orsn_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0488', 'FORM','*ERROR* Invalid orientation code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ORSN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_ORSN_CODE")
		public void sgrstspOrsnCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspOrsnCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvorsn.fCodeExists(sgrstspElement.getSgrstspOrsnCode());
					sgrstspElement.setSgrstspOrsnDesc(SbStvorsn.fGetDescription(sgrstspElement.getSgrstspOrsnCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0488"), toStr("FORM"), toStr("*ERROR* Invalid orientation code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_ORSN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_ORSN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspOrsnDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAPL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_CAPL_CODE")
		public void sgrstspCaplCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAPL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_CAPL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspCaplCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAPL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspCaplCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAPL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspCaplCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAPL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_CAPL_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspCaplCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_CAPL_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_capl_code is null then 
	 :sgrstsp_capl_desc := '';
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAPL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_CAPL_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspCaplCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspCaplCode().isNull() )
				{
					sgrstspElement.setSgrstspCaplDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_CAPL_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_capl_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvcapl.f_code_exists(:sgrstsp_capl_code);
	:sgrstsp_capl_desc := sb_stvcapl.f_get_description(:sgrstsp_capl_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0489', 'FORM','*ERROR* Invalid career planning code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAPL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_CAPL_CODE")
		public void sgrstspCaplCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspCaplCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvcapl.fCodeExists(sgrstspElement.getSgrstspCaplCode());
					sgrstspElement.setSgrstspCaplDesc(SbStvcapl.fGetDescription(sgrstspElement.getSgrstspCaplCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0489"), toStr("FORM"), toStr("*ERROR* Invalid career planning code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_CAPL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_CAPL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspCaplDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EDLV_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_EDLV_CODE")
		public void sgrstspEdlvCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EDLV_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_EDLV_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspEdlvCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EDLV_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspEdlvCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EDLV_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspEdlvCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EDLV_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_EDLV_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspEdlvCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_EDLV_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_edlv_code is null then 
	 :sgrstsp_edlv_desc := '';
end if;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EDLV_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_EDLV_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspEdlvCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspEdlvCode().isNull() )
				{
					sgrstspElement.setSgrstspEdlvDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_EDLV_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_edlv_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvedlv.f_code_exists(:sgrstsp_edlv_code);
	:sgrstsp_edlv_desc := sb_stvedlv.f_get_description(:sgrstsp_edlv_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0490', 'FORM','*ERROR* Invalid education level code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EDLV_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_EDLV_CODE")
		public void sgrstspEdlvCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspEdlvCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvedlv.fCodeExists(sgrstspElement.getSgrstspEdlvCode());
					sgrstspElement.setSgrstspEdlvDesc(SbStvedlv.fGetDescription(sgrstspElement.getSgrstspEdlvCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0490"), toStr("FORM"), toStr("*ERROR* Invalid education level code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EDLV_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_EDLV_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspEdlvDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EMEX_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_EMEX_CODE")
		public void sgrstspEmexCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EMEX_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_EMEX_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspEmexCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EMEX_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspEmexCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EMEX_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspEmexCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EMEX_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_EMEX_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspEmexCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_EMEX_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_emex_code is null then 
	 :sgrstsp_emex_desc := '';
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EMEX_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_EMEX_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspEmexCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspEmexCode().isNull() )
				{
					sgrstspElement.setSgrstspEmexDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_EMEX_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_emex_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvemex.f_code_exists(:sgrstsp_emex_code);
	:sgrstsp_emex_desc := sb_stvemex.f_get_description(:sgrstsp_emex_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0491', 'FORM','*ERROR* Invalid expected education code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EMEX_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_EMEX_CODE")
		public void sgrstspEmexCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspEmexCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvemex.fCodeExists(sgrstspElement.getSgrstspEmexCode());
					sgrstspElement.setSgrstspEmexDesc(SbStvemex.fGetDescription(sgrstspElement.getSgrstspEmexCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0491"), toStr("FORM"), toStr("*ERROR* Invalid expected education code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EMEX_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_EMEX_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspEmexDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TRCN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_TRCN_CODE")
		public void sgrstspTrcnCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TRCN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_TRCN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspTrcnCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TRCN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspTrcnCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TRCN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspTrcnCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TRCN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_TRCN_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspTrcnCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_TRCN_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_trcn_code is null then 
	 :sgrstsp_trcn_desc := '';
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TRCN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_TRCN_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspTrcnCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspTrcnCode().isNull() )
				{
					sgrstspElement.setSgrstspTrcnDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_TRCN_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_trcn_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvtrcn.f_code_exists(:sgrstsp_trcn_code);
 :sgrstsp_trcn_desc := sb_stvtrcn.f_get_description(:sgrstsp_trcn_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0492', 'FORM','*ERROR* Invalid transfer code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TRCN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_TRCN_CODE")
		public void sgrstspTrcnCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspTrcnCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvtrcn.fCodeExists(sgrstspElement.getSgrstspTrcnCode());
					sgrstspElement.setSgrstspTrcnDesc(SbStvtrcn.fGetDescription(sgrstspElement.getSgrstspTrcnCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0492"), toStr("FORM"), toStr("*ERROR* Invalid transfer code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_TRCN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_TRCN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspTrcnDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_VOED_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_VOED_CODE")
		public void sgrstspVoedCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_VOED_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_VOED_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspVoedCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_VOED_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspVoedCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_VOED_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspVoedCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_VOED_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_VOED_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspVoedCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_VOED_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_voed_code is null then
	:sgrstsp_voed_desc := '';
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_VOED_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_VOED_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspVoedCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspVoedCode().isNull() )
				{
					sgrstspElement.setSgrstspVoedDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_VOED_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_voed_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvvoed.f_code_exists(:sgrstsp_voed_code);
	:sgrstsp_voed_desc := sb_stvvoed.f_get_description(:sgrstsp_voed_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0493', 'FORM','*ERROR* Invalid vocational goal code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_VOED_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_VOED_CODE")
		public void sgrstspVoedCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspVoedCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvvoed.fCodeExists(sgrstspElement.getSgrstspVoedCode());
					sgrstspElement.setSgrstspVoedDesc(SbStvvoed.fGetDescription(sgrstspElement.getSgrstspVoedCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0493"), toStr("FORM"), toStr("*ERROR* Invalid vocational goal code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_VOED_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_VOED_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspVoedDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EGOL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_EGOL_CODE")
		public void sgrstspEgolCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EGOL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_EGOL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspEgolCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EGOL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspEgolCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EGOL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspEgolCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EGOL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_EGOL_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspEgolCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_EGOL_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_egol_code is null then
	:sgrstsp_egol_desc := '';
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EGOL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_EGOL_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspEgolCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspEgolCode().isNull() )
				{
					sgrstspElement.setSgrstspEgolDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_EGOL_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_egol_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvegol.f_code_exists(:sgrstsp_egol_code);
	:sgrstsp_egol_desc :=   sb_stvegol.f_get_description(:sgrstsp_egol_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0494', 'FORM','*ERROR* Invalid educational goal code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EGOL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_EGOL_CODE")
		public void sgrstspEgolCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspEgolCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvegol.fCodeExists(sgrstspElement.getSgrstspEgolCode());
					sgrstspElement.setSgrstspEgolDesc(SbStvegol.fGetDescription(sgrstspElement.getSgrstspEgolCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0494"), toStr("FORM"), toStr("*ERROR* Invalid educational goal code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_EGOL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_EGOL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspEgolDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_APRN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_APRN_CODE")
		public void sgrstspAprnCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_APRN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_APRN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspAprnCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_APRN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspAprnCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_APRN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspAprnCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_APRN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_APRN_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspAprnCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_APRN_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_aprn_code is null then
	:sgrstsp_aprn_desc := '';
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_APRN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_APRN_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspAprnCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspAprnCode().isNull() )
				{
					sgrstspElement.setSgrstspAprnDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_APRN_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_aprn_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvaprn.f_code_exists(:sgrstsp_aprn_code);
	:sgrstsp_aprn_desc := sb_stvaprn.f_get_description(:sgrstsp_aprn_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0495', 'FORM','*ERROR* Invalid apprenticship code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_APRN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_APRN_CODE")
		public void sgrstspAprnCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspAprnCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvaprn.fCodeExists(sgrstspElement.getSgrstspAprnCode());
					sgrstspElement.setSgrstspAprnDesc(SbStvaprn.fGetDescription(sgrstspElement.getSgrstspAprnCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0495"), toStr("FORM"), toStr("*ERROR* Invalid apprenticship code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_APRN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_APRN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspAprnDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_GAIN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_GAIN_CODE")
		public void sgrstspGainCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_GAIN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_GAIN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspGainCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_GAIN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspGainCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_GAIN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspGainCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_GAIN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_GAIN_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspGainCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_GAIN_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_gain_code is null then
	:sgrstsp_gain_desc := '';
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_GAIN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_GAIN_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspGainCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspGainCode().isNull() )
				{
					sgrstspElement.setSgrstspGainDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_GAIN_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_gain_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvgain.f_code_exists(:sgrstsp_gain_code);
	:sgrstsp_gain_desc := sb_stvgain.f_get_description(:sgrstsp_gain_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0496', 'FORM','*ERROR* Invalid employee and training code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_GAIN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_GAIN_CODE")
		public void sgrstspGainCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspGainCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvgain.fCodeExists(sgrstspElement.getSgrstspGainCode());
					sgrstspElement.setSgrstspGainDesc(SbStvgain.fGetDescription(sgrstspElement.getSgrstspGainCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0496"), toStr("FORM"), toStr("*ERROR* Invalid employee and training code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_GAIN_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_GAIN_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspGainDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_INCM_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SGRSTSP_INCM_CODE")
		public void sgrstspIncmCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_INCM_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_INCM_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspIncmCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_INCM_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void sgrstspIncmCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_INCM_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void sgrstspIncmCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_INCM_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGRSTSP_INCM_CODE", function=KeyFunction.NEXT_ITEM)
		public void sgrstspIncmCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_INCM_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
if :sgrstsp_incm_code is null then
	:sgrstsp_incm_desc := '';
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_INCM_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGRSTSP_INCM_CODE", function=KeyFunction.ITEM_OUT)
		public void sgrstspIncmCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				getContainer().getGoqrpls().getGSearch().postTextCode();
				getContainer().getGoqrpls().gCheckFailure();
				if ( sgrstspElement.getSgrstspIncmCode().isNull() )
				{
					sgrstspElement.setSgrstspIncmDesc(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGRSTSP_INCM_CODE.WHEN-VALIDATE-ITEM
		 if :sgrstsp_incm_code is null then
	return;
end if;

declare 
	test_code varchar2(1) := '';
begin 
	test_code := sb_stvincm.f_code_exists(:sgrstsp_incm_code);
	:sgrstsp_incm_desc := sb_stvincm.f_get_description(:sgrstsp_incm_code);
	if test_code = 'N' then 
		message( G$_NLS.Get('SOQOLIB-0497', 'FORM','*ERROR* Invalid income level code, press LIST for values.') );
		raise form_trigger_failure;
	end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_INCM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_INCM_CODE")
		public void sgrstspIncmCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);


				if ( sgrstspElement.getSgrstspIncmCode().isNull() )
				{
					return ;
				}
				{
					NString testCode = toStr("");
					testCode = SbStvincm.fCodeExists(sgrstspElement.getSgrstspIncmCode());
					sgrstspElement.setSgrstspIncmDesc(SbStvincm.fGetDescription(sgrstspElement.getSgrstspIncmCode()));
					if ( testCode.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("SOQOLIB-0497"), toStr("FORM"), toStr("*ERROR* Invalid income level code, press LIST for values.")));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_INCM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGRSTSP_INCM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sgrstspIncmDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGRSTSP_BLCK_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SGRSTSP_BLCK_CODE")
		public void sgrstspBlckCode_validate()
		{
			
				SgrstspAdapter sgrstspElement = (SgrstspAdapter)this.getFormModel().getSgrstsp().getRowAdapter(true);
							this.sgrstspBlckCode_PostChange();

			}

		
	
	
}

