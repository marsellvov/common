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

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
public class SCurriculaTraditionalController extends AbstractSupportCodeObject{

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public SCurriculaTraditionalController(ISupportCodeContainer container) 
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
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORLCUR_KEY_SEQNO_LBT")
		public void sorlcurKeySeqnoLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLCUR_KEY_SEQNO_LBT.WHEN-BUTTON-PRESSED
		 GO_ITEM('sorlcur_key_seqno');
execute_trigger('do_lists');
g$_check_failure;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLCUR_KEY_SEQNO_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SORLCUR_KEY_SEQNO_LBT")
		public void sorlcurKeySeqnoLbt_buttonClick()
		{
			
				goItem(toStr("sorlcur_key_seqno"));
				executeAction("do_lists");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SORLFOS_CONC_CODE_BTN.WHEN-MOUSE-DOUBLECLICK
		 declare 
	conc_lov LOV;
	show_lov_btn  boolean;
	mcnt  number := 0; 
	
	cursor cnt_conc_c is 	
	select nvl(count(*),0) 
  from sovlfos attach
  where  attach.sovlfos_pidm = :sorlcur.sorlcur_pidm
  and attach.sovlfos_lcur_seqno = :sorlfos.sorlfos_lcur_seqno
 -- and attach.sovlfos_current_ind = 'Y'
 -- and attach.sovlfos_active_ind = 'Y'
  and attach.sovlfos_lfst_code = sb_fieldofstudy_str.f_concentration 
  and attach.sovlfos_majr_code_attach = :sorlfos_majr_code ;
  
begin 
	OPEN cnt_conc_c;
	FETCH cnt_conc_c into mcnt;
	IF cnt_conc_c%NOTFOUND THEN
		mcnt := 0;
	END IF;
	CLOSE cnt_conc_c;
	
	IF mcnt = 0 THEN 
		message(G$_NLS.Get('SOQOLIB-0172', 'FORM', 'There are no attached concentrations. ')); 
  ELSE 
	
  	conc_lov := FIND_LOV('sorlfos_attach_majr_lov');
	  show_lov_btn := show_lov(conc_lov);
	END IF; 
end; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORLFOS_CONC_CODE_BTN.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SORLFOS_CONC_CODE_BTN")
		public void sorlfosConcCodeBtn_doubleClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				int rowCount = 0;
				{
					LovDescriptor concLov= null;
					NBool showLovBtn= NBool.getNull();
					NNumber mcnt = toNumber(0);
					String sqlcntConcC = "SELECT nvl(count(*), 0) " +
	" FROM sovlfos attach " +
	" WHERE attach.sovlfos_pidm = :SORLCUR_SORLCUR_PIDM AND attach.sovlfos_lcur_seqno = :SORLFOS_SORLFOS_LCUR_SEQNO AND attach.sovlfos_lfst_code = sb_fieldofstudy_str.f_concentration AND attach.sovlfos_majr_code_attach = :SORLFOS_MAJR_CODE ";
					DataCursor cntConcC = new DataCursor(sqlcntConcC);
					try {
						//Setting query parameters
						cntConcC.addParameter("SORLCUR_SORLCUR_PIDM", sorlcurElement.getSorlcurPidm());
						cntConcC.addParameter("SORLFOS_SORLFOS_LCUR_SEQNO", sorlfosElement.getSorlfosLcurSeqno());
						cntConcC.addParameter("SORLFOS_MAJR_CODE", sorlfosElement.getSorlfosMajrCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable cntConcC.
						cntConcC.open();
						ResultSet cntConcCResults = cntConcC.fetchInto();
						if ( cntConcCResults != null ) {
							mcnt = cntConcCResults.getNumber(0);
						}
						if ( cntConcC.notFound() )
						{
							mcnt = toNumber(0);
						}
						cntConcC.close();
					}
					finally {
						cntConcC.close();
					}
					if ( mcnt.equals(0) )
					{
						infoMessage(GNls.Fget(toStr("SOQOLIB-0172"), toStr("FORM"), toStr("There are no attached concentrations. ")));
					}
					else {
						concLov = findLov("sorlfos_attach_majr_lov");
						showLovBtn = showLov(concLov);
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LCUR_LMOD_CODE_DISPLAY.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="LCUR_LMOD_CODE_DISPLAY", function=KeyFunction.ITEM_CHANGE)
		public void lcurLmodCodeDisplay_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RETURN_FROM_CURR.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="RETURN_FROM_CURR")
		public void returnFromCurr_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER RETURN_FROM_CURR.WHEN-BUTTON-PRESSED
		 go_item(name_in('return_from_sorlcur'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RETURN_FROM_CURR.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="RETURN_FROM_CURR")
		public void returnFromCurr_buttonClick()
		{
			
				goItem(getNameIn("return_from_sorlcur"));
			}

		
		/* Original PL/SQL code code for TRIGGER LCUR_PREV_RECORD_BTN.WHEN-BUTTON-PRESSED
		 if :s$_curricula_traditional.lcur_rec_num_lfos = 1 
	then 
     Message( G$_NLS.Get('SOQOLIB-0173', 'FORM','At first record.') );
else  
	go_block('SORLCUR');
	do_key('previous_record'); 
	:s$_curricula_traditional.lcur_priority_display := :sorlcur.sorlcur_priority_no; 
	:s$_curricula_traditional.lcur_program_display := :sorlcur.sorlcur_program;
	:s$_curricula_traditional.lcur_level_display := :sorlcur.sorlcur_levl_code;
	:s$_curricula_traditional.lcur_college_display := :sorlcur.sorlcur_coll_code;
	:s$_curricula_traditional.lcur_campus_display := :sorlcur.sorlcur_camp_code;
	:s$_curricula_traditional.lcur_degree_display := :sorlcur.sorlcur_degc_code;
	:s$_curricula_traditional.lcur_catlg_display := :sorlcur.sorlcur_term_code_ctlg;
	:s$_curricula_traditional.lcur_rec_num_lfos := :system.cursor_record;
	:s$_curricula_traditional.lcur_rec_cnt_lfos := :s$_curricula_traditional.lcur_rec_cnt;  
	:s$_curricula_traditional.lcur_key_seqno_display := :sorlcur.sorlcur_key_seqno;
	:s$_curricula_traditional.lcur_term_code_display := :sorlcur.sorlcur_term_code;
	:s$_curricula_traditional.lcur_term_code_end_display := :sorlcur.sorlcur_term_code_end;
	:s$_curricula_traditional.lcur_lmod_code_display := sb_stvlmod.f_get_description(:sorlcur.sorlcur_lmod_code);
	:s$_curricula_traditional.lcur_seqno_display := :sorlcur.sorlcur_seqno;
	:s$_curricula_traditional.lcur_catlg_display := :sorlcur.sorlcur_term_code_ctlg;
	:s$_curricula_traditional.lcur_cact_code_display := :sorlcur.sorlcur_cact_code;
	:s$_curricula_traditional.lcur_current_ind_display := :sorlcur.sovlcur_current_ind;
   set_item_property('LCUR_PROGRAM_DISPLAY', TOOLTIP_TEXT,:sorlcur_program_desc);   
   set_item_property('LCUR_LEVEL_DISPLAY', TOOLTIP_TEXT,:sorlcur_levl_desc);
   set_item_property('LCUR_COLLEGE_DISPLAY', TOOLTIP_TEXT,:sorlcur_program_desc);
   set_item_property('LCUR_CAMPUS_DISPLAY', TOOLTIP_TEXT,:sorlcur_camp_desc);
   set_item_property('LCUR_DEGREE_DISPLAY', TOOLTIP_TEXT,:sorlcur_degc_desc);
	
	g$_check_failure;
	go_block('SORLFOS');
end if; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LCUR_PREV_RECORD_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="LCUR_PREV_RECORD_BTN")
		public void lcurPrevRecordBtn_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getFormModel().getSCurriculaTraditional().getLcurRecNumLfos().equals(1) )
				{
					infoMessage(GNls.Fget(toStr("SOQOLIB-0173"), toStr("FORM"), toStr("At first record.")));
				}
				else {
					goBlock(toStr("SORLCUR"));
					executeAction("PREVIOUS_RECORD");
					getFormModel().getSCurriculaTraditional().setLcurPriorityDisplay(toStr(sorlcurElement.getSorlcurPriorityNo()));
					getFormModel().getSCurriculaTraditional().setLcurProgramDisplay(sorlcurElement.getSorlcurProgram());
					getFormModel().getSCurriculaTraditional().setLcurLevelDisplay(sorlcurElement.getSorlcurLevlCode());
					getFormModel().getSCurriculaTraditional().setLcurCollegeDisplay(sorlcurElement.getSorlcurCollCode());
					getFormModel().getSCurriculaTraditional().setLcurCampusDisplay(sorlcurElement.getSorlcurCampCode());
					getFormModel().getSCurriculaTraditional().setLcurDegreeDisplay(sorlcurElement.getSorlcurDegcCode());
					getFormModel().getSCurriculaTraditional().setLcurCatlgDisplay(sorlcurElement.getSorlcurTermCodeCtlg());
					getFormModel().getSCurriculaTraditional().setLcurRecNumLfos(toInt(getCursorRecord()));
					getFormModel().getSCurriculaTraditional().setLcurRecCntLfos(getFormModel().getSCurriculaTraditional().getLcurRecCnt());
					getFormModel().getSCurriculaTraditional().setLcurKeySeqnoDisplay(sorlcurElement.getSorlcurKeySeqno());
					getFormModel().getSCurriculaTraditional().setLcurTermCodeDisplay(sorlcurElement.getSorlcurTermCode());
					getFormModel().getSCurriculaTraditional().setLcurTermCodeEndDisplay(sorlcurElement.getSorlcurTermCodeEnd());
					getFormModel().getSCurriculaTraditional().setLcurLmodCodeDisplay(SbStvlmod.fGetDescription(sorlcurElement.getSorlcurLmodCode()));
					getFormModel().getSCurriculaTraditional().setLcurSeqnoDisplay(sorlcurElement.getSorlcurSeqno());
					getFormModel().getSCurriculaTraditional().setLcurCatlgDisplay(sorlcurElement.getSorlcurTermCodeCtlg());
					getFormModel().getSCurriculaTraditional().setLcurCactCodeDisplay(sorlcurElement.getSorlcurCactCode());
					getFormModel().getSCurriculaTraditional().setLcurCurrentIndDisplay(sorlcurElement.getSovlcurCurrentInd());
					setItemToolTip("LCUR_PROGRAM_DISPLAY", sorlcurElement.getSorlcurProgramDesc());
					setItemToolTip("LCUR_LEVEL_DISPLAY", sorlcurElement.getSorlcurLevlDesc());
					setItemToolTip("LCUR_COLLEGE_DISPLAY", sorlcurElement.getSorlcurProgramDesc());
					setItemToolTip("LCUR_CAMPUS_DISPLAY", sorlcurElement.getSorlcurCampDesc());
					setItemToolTip("LCUR_DEGREE_DISPLAY", sorlcurElement.getSorlcurDegcDesc());
					getContainer().getGoqrpls().gCheckFailure();
					goBlock(toStr("SORLFOS"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER LCUR_NEXT_REC_BTN.WHEN-BUTTON-PRESSED
		 if :s$_curricula_traditional.lcur_rec_num_lfos = :s$_curricula_traditional.lcur_rec_cnt_lfos 
	then 
     Message( G$_NLS.Get('SOQOLIB-0174', 'FORM','At last record.') );
else 
	go_block('SORLCUR');
	do_key('next_record'); 
	g$_check_failure;
	IF :sorlcur.rowid is not null then 
		:s$_curricula_traditional.lcur_priority_display := :sorlcur.sorlcur_priority_no;
	 :s$_curricula_traditional.lcur_program_display := :sorlcur.sorlcur_program;
	 :s$_curricula_traditional.lcur_level_display := :sorlcur.sorlcur_levl_code;
	 :s$_curricula_traditional.lcur_college_display := :sorlcur.sorlcur_coll_code;
	 :s$_curricula_traditional.lcur_campus_display := :sorlcur.sorlcur_camp_code;
	 :s$_curricula_traditional.lcur_degree_display := :sorlcur.sorlcur_degc_code;
	 :s$_curricula_traditional.lcur_catlg_display := :sorlcur.sorlcur_term_code_ctlg;
	 :s$_curricula_traditional.lcur_key_seqno_display := :sorlcur.sorlcur_key_seqno;
	 :s$_curricula_traditional.lcur_term_code_display := :sorlcur.sorlcur_term_code;
	  :s$_curricula_traditional.lcur_term_code_end_display := :sorlcur.sorlcur_term_code_end;
	 :s$_curricula_traditional.lcur_lmod_code_display := sb_stvlmod.f_get_description(:sorlcur.sorlcur_lmod_code);
	 :s$_curricula_traditional.lcur_seqno_display := :sorlcur.sorlcur_seqno;
	 :s$_curricula_traditional.lcur_catlg_display := :sorlcur.sorlcur_term_code_ctlg;
	 :s$_curricula_traditional.lcur_cact_code_display := :sorlcur.sorlcur_cact_code;
	 :s$_curricula_traditional.lcur_current_ind_display := :sorlcur.sovlcur_current_ind;
	 :s$_curricula_traditional.lcur_rec_num_lfos := :system.cursor_record;
	 :s$_curricula_traditional.lcur_rec_cnt_lfos := :s$_curricula_traditional.lcur_rec_cnt; 
	 	set_item_property('LCUR_PROGRAM_DISPLAY', TOOLTIP_TEXT,:sorlcur_program_desc);   
    set_item_property('LCUR_LEVEL_DISPLAY', TOOLTIP_TEXT,:sorlcur_levl_desc);
    set_item_property('LCUR_COLLEGE_DISPLAY', TOOLTIP_TEXT,:sorlcur_program_desc);
    set_item_property('LCUR_CAMPUS_DISPLAY', TOOLTIP_TEXT,:sorlcur_camp_desc);
    set_item_property('LCUR_DEGREE_DISPLAY', TOOLTIP_TEXT,:sorlcur_degc_desc);

	  go_block('SORLFOS');
	  g$_check_failure;
	END IF; 
end if; 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LCUR_NEXT_REC_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="LCUR_NEXT_REC_BTN")
		public void lcurNextRecBtn_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlcurAdapter sorlcurElement = (SorlcurAdapter)this.getFormModel().getSorlcur().getRowAdapter(true);


				if ( getFormModel().getSCurriculaTraditional().getLcurRecNumLfos().equals(getFormModel().getSCurriculaTraditional().getLcurRecCntLfos()) )
				{
					infoMessage(GNls.Fget(toStr("SOQOLIB-0174"), toStr("FORM"), toStr("At last record.")));
				}
				else {
					goBlock(toStr("SORLCUR"));
					executeAction("NEXT_RECORD");
					getContainer().getGoqrpls().gCheckFailure();
					// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
					if ( !sorlcurElement.getRowState().equals(DataRowStatus.INSERTED))
					{
						getFormModel().getSCurriculaTraditional().setLcurPriorityDisplay(toStr(sorlcurElement.getSorlcurPriorityNo()));
						getFormModel().getSCurriculaTraditional().setLcurProgramDisplay(sorlcurElement.getSorlcurProgram());
						getFormModel().getSCurriculaTraditional().setLcurLevelDisplay(sorlcurElement.getSorlcurLevlCode());
						getFormModel().getSCurriculaTraditional().setLcurCollegeDisplay(sorlcurElement.getSorlcurCollCode());
						getFormModel().getSCurriculaTraditional().setLcurCampusDisplay(sorlcurElement.getSorlcurCampCode());
						getFormModel().getSCurriculaTraditional().setLcurDegreeDisplay(sorlcurElement.getSorlcurDegcCode());
						getFormModel().getSCurriculaTraditional().setLcurCatlgDisplay(sorlcurElement.getSorlcurTermCodeCtlg());
						getFormModel().getSCurriculaTraditional().setLcurKeySeqnoDisplay(sorlcurElement.getSorlcurKeySeqno());
						getFormModel().getSCurriculaTraditional().setLcurTermCodeDisplay(sorlcurElement.getSorlcurTermCode());
						getFormModel().getSCurriculaTraditional().setLcurTermCodeEndDisplay(sorlcurElement.getSorlcurTermCodeEnd());
						getFormModel().getSCurriculaTraditional().setLcurLmodCodeDisplay(SbStvlmod.fGetDescription(sorlcurElement.getSorlcurLmodCode()));
						getFormModel().getSCurriculaTraditional().setLcurSeqnoDisplay(sorlcurElement.getSorlcurSeqno());
						getFormModel().getSCurriculaTraditional().setLcurCatlgDisplay(sorlcurElement.getSorlcurTermCodeCtlg());
						getFormModel().getSCurriculaTraditional().setLcurCactCodeDisplay(sorlcurElement.getSorlcurCactCode());
						getFormModel().getSCurriculaTraditional().setLcurCurrentIndDisplay(sorlcurElement.getSovlcurCurrentInd());
						getFormModel().getSCurriculaTraditional().setLcurRecNumLfos(toInt(getCursorRecord()));
						getFormModel().getSCurriculaTraditional().setLcurRecCntLfos(getFormModel().getSCurriculaTraditional().getLcurRecCnt());
						setItemToolTip("LCUR_PROGRAM_DISPLAY", sorlcurElement.getSorlcurProgramDesc());
						setItemToolTip("LCUR_LEVEL_DISPLAY", sorlcurElement.getSorlcurLevlDesc());
						setItemToolTip("LCUR_COLLEGE_DISPLAY", sorlcurElement.getSorlcurProgramDesc());
						setItemToolTip("LCUR_CAMPUS_DISPLAY", sorlcurElement.getSorlcurCampDesc());
						setItemToolTip("LCUR_DEGREE_DISPLAY", sorlcurElement.getSorlcurDegcDesc());
						goBlock(toStr("SORLFOS"));
						getContainer().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER LFOS_DEACTIVE_BTN.WHEN-BUTTON-PRESSED
		 execute_trigger('query_only');
g$_check_failure;

declare 
	save_rec  number := 0;
	
begin

--
IF :sorlfos_current_ind = 'Y' and 
		 sb_learnercurricstatus.f_is_active(:sorlfos_cact_code) = 'Y'	
     and  :system.cursor_block = 'SORLFOS'	then 
   execute_trigger('deactive_lfos_create_new'); 
   g$_check_failure;
else 
	message(G$_NLS.Get('SOQOLIB-0175', 'FORM' ,
	  'Field of study must be current and active to inactivate.'));
	
end if;  

end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LFOS_DEACTIVE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="LFOS_DEACTIVE_BTN")
		public void lfosDeactiveBtn_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SorlfosAdapter sorlfosElement = (SorlfosAdapter)this.getFormModel().getSorlfos().getRowAdapter(true);


				executeAction("query_only");
				getContainer().getGoqrpls().gCheckFailure();
				{
					NNumber saveRec = toNumber(0);
					// 
					if ( sorlfosElement.getSorlfosCurrentInd().equals("Y") && SbLearnercurricstatus.fIsActive(sorlfosElement.getSorlfosCactCode()).equals("Y") && getCursorBlock().equals("SORLFOS") )
					{
						executeAction("deactive_lfos_create_new");
						getContainer().getGoqrpls().gCheckFailure();
					}
					else {
						errorMessage(GNls.Fget(toStr("SOQOLIB-0175"), toStr("FORM"), toStr("Field of study must be current and active to inactivate.")));
					}
				}
			}

		
	
	
}

