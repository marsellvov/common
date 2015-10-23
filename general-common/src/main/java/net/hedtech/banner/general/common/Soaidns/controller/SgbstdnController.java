package net.hedtech.banner.general.common.Soaidns.controller;
 
import java.util.*;

import morphis.core.utils.behavior.annotations.After;
import morphis.core.utils.behavior.annotations.Before;
			




import org.hamcrest.core.IsNull;
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
import net.hedtech.general.common.dbservices.SbCurriculum.CurriculumRecRow;
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

public class SgbstdnController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public SgbstdnController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER SGBSTDN.KEY-NXTREC
		 IF :System.Last_Record <> 'TRUE' THEN 
		next_Record;
ELSE 
		message( G$_NLS.Get('SOAIDNS-0005', 'FORM','At last record.') );
END IF; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGBSTDN.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sgbstdn_NextRecord()
		{
			
				if ( !isInLastRecord() )
				{
					nextRecord();
				}
				else {
					infoMessage(GNls.Fget(toStr("SOAIDNS-0005"), toStr("FORM"), toStr("At last record.")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SGBSTDN.KEY-NXTBLK
		    GO_BLOCK( 'SFBETRM' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGBSTDN.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sgbstdn_NextBlock()
		{
			
				goBlock(toStr("SFBETRM"));
			}

		
		/* Original PL/SQL code code for TRIGGER SGBSTDN.KEY-PRVBLK
		    GO_BLOCK( 'SPRADDR' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGBSTDN.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sgbstdn_PreviousBlock()
		{
			
				goBlock(toStr("SPRADDR"));
			}

		
		/* Original PL/SQL code code for TRIGGER SGBSTDN.WHEN-NEW-RECORD-INSTANCE
		 IF :SGBSTDN.ROWID IS NULL THEN
   IF GET_BLOCK_PROPERTY(:SYSTEM.CURSOR_BLOCK,CURRENT_RECORD) <> 1 THEN
      PREVIOUS_RECORD;
      MESSAGE( G$_NLS.Get('SOAIDNS-0006', 'FORM','At last record.') ,NO_ACKNOWLEDGE);
      
   ELSE -- no sgbstdn record exists 
   	 RETURN; 
   END IF; 
   
END IF;
-- set up variables for summary block 
:s$_curricula_summary.summary_pidm := :spriden.spriden_pidm;
:s$_curricula_summary.summary_code := sb_curriculum_str.f_learner;
:s$_curricula_summary.summary_key_seqno := 99;
:s$_curricula_summary.summary_term_code := :sgbstdn.sgbstdn_term_code_eff;
:s$_curricula_summary.summary_end_term := sb_learner.f_query_end(:spriden.spriden_pidm,
                                                                 :sgbstdn.sgbstdn_term_code_eff); 

--Create SOTVCUR since this is a learner curriculum 

soklcur.p_create_sotvcur(p_pidm => :s$_curricula_summary.summary_pidm,
       p_term_code => :s$_curricula_summary.summary_term_code,
       p_lmod_code => :s$_curricula_summary.summary_code);

--Now execute the query on summary blocks 

:system.message_level := '5';
GO_BLOCK('sovlcur');
EXECUTE_QUERY;
IF :sovlcur.summary_rowid IS NOT NULL THEN
GO_BLOCK('sovlfos');
EXECUTE_QUERY ; --Parent exists, so query child
ELSE
GO_BLOCK('sovlfos');  
CLEAR_BLOCK;    --No parent, so clear child
END IF;
:system.message_level := '0'; 
GO_BLOCK('sgbstdn');  -- go back to main block 


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGBSTDN.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sgbstdn_recordChange()
		{
			

				SgbstdnAdapter sgbstdnElement = (SgbstdnAdapter)this.getFormModel().getSgbstdn().getRowAdapter(true);
				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);
				SovlcurAdapter sovlcurElement = (SovlcurAdapter)this.getFormModel().getSovlcur().getRowAdapter(true);

				if(sgbstdnElement!=null && spridenElement!=null && sovlcurElement!=null){

				if ( sgbstdnElement.getRowState().equals(DataRowStatus.INSERTED) )
				{
					if ( getBlockCurrentRecord(getCursorBlock()).notEquals(1) )
					{
						previousRecord();
						infoMessage(GNls.Fget(toStr("SOAIDNS-0006"), toStr("FORM"), toStr("At last record.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
					}
					else {
						//  no sgbstdn record exists 
						return ;
					}
				}
				//  set up variables for summary block 
				getFormModel().getSCurriculaSummary().setSummaryPidm(spridenElement.getSpridenPidm());
				getFormModel().getSCurriculaSummary().setSummaryCode(SbCurriculumStr.fLearner());
				getFormModel().getSCurriculaSummary().setSummaryKeySeqno(toNumber(99));
				getFormModel().getSCurriculaSummary().setSummaryTermCode(sgbstdnElement.getSgbstdnTermCodeEff());
				getFormModel().getSCurriculaSummary().setSummaryEndTerm(SbLearner.fQueryEnd(spridenElement.getSpridenPidm(), sgbstdnElement.getSgbstdnTermCodeEff()));
				// Create SOTVCUR since this is a learner curriculum 
				Soklcur.pCreateSotvcur(/*pPidm=>*/getFormModel().getSCurriculaSummary().getSummaryPidm(), /*pTermCode=>*/getFormModel().getSCurriculaSummary().getSummaryTermCode(), /*pLmodCode=>*/getFormModel().getSCurriculaSummary().getSummaryCode());
				// Now execute the query on summary blocks 
				try { 
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
				goBlock(toStr("sovlcur"));
				executeQuery();
				if ( !sovlcurElement.getSummaryRowid().isNull() )
				{
					goBlock(toStr("sovlfos"));
					executeQuery();
				}
				else {
					goBlock(toStr("sovlfos"));
					clearBlock();
				}
				} finally {
							
					MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
				}
							
				goBlock(toStr("sgbstdn"));
			}
		}
		
		/* Original PL/SQL code code for TRIGGER SGBSTDN.WHEN-NEW-BLOCK-INSTANCE
		 --Create SOTVCUR since this is a learner curriculum 

IF :sgbstdn.sgbstdn_term_code_eff is not null then 
   :s$_curricula_summary.summary_pidm := :spriden.spriden_pidm;
   :s$_curricula_summary.summary_code := sb_curriculum_str.f_learner;
   :s$_curricula_summary.summary_key_seqno := 99;
   :s$_curricula_summary.summary_term_code := :SGBSTDN_TERM_CODE_EFF;
   :s$_curricula_summary.summary_end_term := sb_learner.f_query_end(:spriden.spriden_pidm,
                                                                    :sgbstdn_term_code_eff);
   soklcur.p_create_sotvcur(p_pidm => :s$_curricula_summary.summary_pidm,
                            p_term_code => :s$_curricula_summary.summary_term_code,
                            p_lmod_code => :s$_curricula_summary.summary_code);

--Now execute the query on summary blocks 

   :system.message_level := '5';
   GO_BLOCK('sovlcur');
   EXECUTE_QUERY;

   IF :sovlcur.summary_rowid IS NOT NULL THEN
      GO_BLOCK('sovlfos');
      EXECUTE_QUERY ; --Parent exists, so query child
   ELSE
     GO_BLOCK('sovlfos');  
     CLEAR_BLOCK;    --No parent, so clear child
   END IF;
     GO_BLOCK('sgbstdn');  -- go back to main block 
     :system.message_level := '0'; 

ELSE
   Go_block('sovlfos');
      Clear_block;
   Go_block('sovlcur');
      Clear_block;
   Go_block('sgbstdn');

END IF; 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGBSTDN.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void sgbstdn_blockChange()
		{
			
				// Create SOTVCUR since this is a learner curriculum 

				SgbstdnAdapter sgbstdnElement = (SgbstdnAdapter)this.getFormModel().getSgbstdn().getRowAdapter(true);
				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);
				SovlcurAdapter sovlcurElement = (SovlcurAdapter)this.getFormModel().getSovlcur().getRowAdapter(true);

				if(sgbstdnElement!=null && spridenElement!=null && sovlcurElement!=null){

				// Create SOTVCUR since this is a learner curriculum 
				if ( !sgbstdnElement.getSgbstdnTermCodeEff().isNull() )
				{
					getFormModel().getSCurriculaSummary().setSummaryPidm(spridenElement.getSpridenPidm());
					getFormModel().getSCurriculaSummary().setSummaryCode(SbCurriculumStr.fLearner());
					getFormModel().getSCurriculaSummary().setSummaryKeySeqno(toNumber(99));
					getFormModel().getSCurriculaSummary().setSummaryTermCode(sgbstdnElement.getSgbstdnTermCodeEff());
					getFormModel().getSCurriculaSummary().setSummaryEndTerm(SbLearner.fQueryEnd(spridenElement.getSpridenPidm(), sgbstdnElement.getSgbstdnTermCodeEff()));
					Soklcur.pCreateSotvcur(/*pPidm=>*/getFormModel().getSCurriculaSummary().getSummaryPidm(), /*pTermCode=>*/getFormModel().getSCurriculaSummary().getSummaryTermCode(), /*pLmodCode=>*/getFormModel().getSCurriculaSummary().getSummaryCode());
					// Now execute the query on summary blocks 
					try { 
						MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(5));
					goBlock(toStr("sovlcur"));
					executeQuery();
					if ( !sovlcurElement.getSummaryRowid().isNull() )
					{
						goBlock(toStr("sovlfos"));
						executeQuery();
					}
					else {
						goBlock(toStr("sovlfos"));
						clearBlock();
					}
					goBlock(toStr("sgbstdn"));
					//  go back to main block 
					} finally {
								
						MessageServices.setMessageLevel(OracleMessagesLevel.decodeMessageLevel(0));
					}
								
				}
				else {
					goBlock(toStr("sovlfos"));
					clearBlock();
					goBlock(toStr("sovlcur"));
					clearBlock();
					goBlock(toStr("sgbstdn"));
				}
			}
		}

		
		/* Original PL/SQL code code for TRIGGER SGBSTDN.POST-QUERY
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVSTST_DESC
         FROM   STVSTST
         WHERE  STVSTST_CODE = :SGBSTDN_STST_CODE;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :STATUS_DESC;
   END ;
   --
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVRESD_DESC
         FROM   STVRESD
         WHERE  STVRESD_CODE = :SGBSTDN_RESD_CODE;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :RESIDENCE_DESC;
   END ;
--   
   BEGIN
      IF    :SGBSTDN_FULL_PART_IND = 'F' THEN :FULL_PART_DESC := G$_NLS.Get('SOAIDNS-0007','FORM','Full Time');
      ELSIF :SGBSTDN_FULL_PART_IND = 'P' THEN :FULL_PART_DESC := G$_NLS.Get('SOAIDNS-0008','FORM','Part Time');
      ELSE  :FULL_PART_DESC := '';
      END IF;	
   END ; 
--  
   :SGBSTDN.TERM_EFF_END := sb_learner.f_query_end(:SPRIDEN.SPRIDEN_PIDM,
        	       :SGBSTDN.SGBSTDN_TERM_CODE_EFF);
--   
   :SGBSTDN.REQ_TERM := '';   
--
   IF (:SGBSTDN.REQ_TERM IS NULL) THEN
   	DECLARE
   		 CURSOR last_stvterm_c IS 
   		   SELECT MAX(STVTERM_CODE)
   		   FROM STVTERM
   		   WHERE STVTERM_CODE < :SGBSTDN.TERM_EFF_END;
   	BEGIN
   		  OPEN  last_stvterm_c;
   		  FETCH last_stvterm_c INTO :SGBSTDN.REQ_TERM;
   		  CLOSE last_stvterm_c;
   	END; 
   END IF ;

-- RETRIEVE CLASS CODE
--
  DECLARE
   lv_curr      sb_curriculum.curriculum_ref;
   lv_curr_rec  sb_curriculum.curriculum_rec;
  BEGIN
    lv_curr := sb_curriculum.f_query_current(p_pidm => :SPRIDEN.SPRIDEN_PIDM,
          p_term_code => :SGBSTDN.SGBSTDN_TERM_CODE_EFF,
          p_lmod_code => sb_curriculum_str.f_learner,
          p_active_ind => 'Y',
          p_keyseqno => 99, 
          p_eff_term => :SGBSTDN.SGBSTDN_TERM_CODE_EFF);
    FETCH lv_curr INTO lv_curr_rec;
    IF lv_curr%NOTFOUND THEN
    	 NULL;
    END IF; 
    CLOSE lv_curr;
    
   :SHRTTRM_CLAS_CODE := SGKCLAS.F_CLASS_CODE(:SPRIDEN.SPRIDEN_PIDM,
                                              lv_curr_rec.r_LEVL_CODE,
                                              :SGBSTDN.REQ_TERM);

   IF :SHRTTRM_CLAS_CODE IS NOT NULL THEN
      BEGIN
        SELECT STVCLAS_DESC
        INTO   :SGBSTDN.STVCLAS_DESC
        FROM   STVCLAS
        WHERE  STVCLAS_CODE = :SHRTTRM_CLAS_CODE;
      END;
   END IF;
                                              
  END; 
--
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGBSTDN.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sgbstdn_AfterQuery(RowAdapterEvent args)
		{
			
				SgbstdnAdapter sgbstdnElement = (SgbstdnAdapter)args.getRow();
				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT STVSTST_DESC " +
	" FROM STVSTST " +
	" WHERE STVSTST_CODE = :SGBSTDN_STST_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SGBSTDN_STST_CODE", sgbstdnElement.getSgbstdnStstCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							sgbstdnElement.setStatusDesc(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					String sqlptiCursor = "SELECT STVRESD_DESC " +
	" FROM STVRESD " +
	" WHERE STVRESD_CODE = :SGBSTDN_RESD_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SGBSTDN_RESD_CODE", sgbstdnElement.getSgbstdnResdCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							sgbstdnElement.setResidenceDesc(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				if ( sgbstdnElement.getSgbstdnFullPartInd().equals("F") )
				{
					sgbstdnElement.setFullPartDesc(GNls.Fget(toStr("SOAIDNS-0007"), toStr("FORM"), toStr("Full Time")));
				}
				else if ( sgbstdnElement.getSgbstdnFullPartInd().equals("P") ) {
					sgbstdnElement.setFullPartDesc(GNls.Fget(toStr("SOAIDNS-0008"), toStr("FORM"), toStr("Part Time")));
				}
				else {
					sgbstdnElement.setFullPartDesc(toStr(""));
				}
				//   
				sgbstdnElement.setTermEffEnd(SbLearner.fQueryEnd(spridenElement.getSpridenPidm(), sgbstdnElement.getSgbstdnTermCodeEff()));
				//    
				sgbstdnElement.setReqTerm(toStr(""));
				// 
				if ((sgbstdnElement.getReqTerm().isNull()))
				{
					{
						String sqllastStvtermC = "SELECT MAX(STVTERM_CODE) " +
	" FROM STVTERM " +
	" WHERE STVTERM_CODE < :SGBSTDN_TERM_EFF_END ";
						DataCursor lastStvtermC = new DataCursor(sqllastStvtermC);
						try {
							//Setting query parameters
							lastStvtermC.addParameter("SGBSTDN_TERM_EFF_END", sgbstdnElement.getTermEffEnd());
							lastStvtermC.open();
							ResultSet lastStvtermCResults = lastStvtermC.fetchInto();
							if ( lastStvtermCResults != null ) {
								sgbstdnElement.setReqTerm(lastStvtermCResults.getStr(0));
							}
						}
						finally{
							lastStvtermC.close();
						}
					}
				}
				{
				DataCursor lvCurr;
					lvCurr = SbCurriculum.fQueryCurrent(/*pPidm=>*/spridenElement.getSpridenPidm(), /*pLmodCode=>*/SbCurriculumStr.fLearner(), /*pTermCode=>*/sgbstdnElement.getSgbstdnTermCodeEff(),/*pKeyseqno=>*/toNumber(99), null,/*pActiveInd=>*/toStr("Y"), /*pEffTerm=>*/sgbstdnElement.getSgbstdnTermCodeEff());
					
					while (true) {
						SbCurriculum.CurriculumRecRow lvCurrRec= null;
						ResultSet lcurRefResults = lvCurr.fetchInto();
						if ( lcurRefResults != null ) {
					
							lvCurrRec = (SbCurriculum.CurriculumRecRow)lcurRefResults.getNObject(0);
						 
						}
						if ( lvCurr.notFound() ) 
							break;

					
	//					List<Row> lvCurrResults = lvCurr.getRows();
//						if ( lvCurrResults.size()>0 ) {
//	//						lvCurrRec = new SbCurriculum.CurriculumRecRow(lvCurrResults);
//							lvCurrRec =  new SbCurriculum.CurriculumRecRow(lvCurrResults.get(0));
//						}
						sgbstdnElement.setShrttrmClasCode(Sgkclas.fClassCode(spridenElement.getSpridenPidm(), lvCurrRec.RLevlCode, sgbstdnElement.getReqTerm()));
						if ( !sgbstdnElement.getShrttrmClasCode().isNull() )
						{
							String sql1 = "SELECT STVCLAS_DESC " +
		" FROM STVCLAS " +
		" WHERE STVCLAS_CODE = :SHRTTRM_CLAS_CODE ";
							DataCommand command1 = new DataCommand(sql1);
							//Setting query parameters
							command1.addParameter("SHRTTRM_CLAS_CODE", sgbstdnElement.getShrttrmClasCode());
							ResultSet results1 = command1.executeQuery();
							rowCount = command1.getRowCount();
							if ( results1.hasData() ) {
								sgbstdnElement.setStvclasDesc(results1.getStr(0));
							}
							results1.close();
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGBSTDN.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sgbstdn_BeforeQuery(QueryEvent args)
		{
                
                SpridenAdapter spridenElement = (SpridenAdapter) this.getFormModel().getSpriden().getRowAdapter();                       
				
                if(spridenElement!=null){
                
                ((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SPRIDEN_SPRIDEN_PIDM", spridenElement.getSpridenPidm()));             

                }
           
               }

		
		/* Original PL/SQL code code for TRIGGER STVCLAS_DESC.WHEN-NEW-ITEM-INSTANCE
		 PREVIOUS_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVCLAS_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVCLAS_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvclasDesc_itemChange()
		{
			
				previousItem();
			}

		
		/* Original PL/SQL code code for TRIGGER STVSTST_DESC.WHEN-NEW-ITEM-INSTANCE
		 PREVIOUS_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVSTST_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVSTST_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvststDesc_itemChange()
		{
			
				previousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGBSTDN_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SGBSTDN_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void sgbstdnActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGBSTDN_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SGBSTDN_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void sgbstdnActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SGBSTDN_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SGBSTDN_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void sgbstdnActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
	
	
}

