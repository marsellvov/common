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
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
public class SovlfosController extends AbstractSupportCodeObject {

	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getContainer().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public SovlfosController(ISupportCodeContainer container) 
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
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-CLRREC
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0441', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void sovlfos_ClearRecord()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0441"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-DUP-ITEM
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0442', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
 
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void sovlfos_KeyDupItem()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0442"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-CQUERY
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0443', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void sovlfos_TotalResults()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0443"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-DUPREC
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0444', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void sovlfos_CopyRecord()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0444"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-EXEQRY
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0445', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void sovlfos_ExecuteQuery()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0445"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-DELREC
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0446', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sovlfos_DeleteRecord()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0446"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-CREREC
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0447', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void sovlfos_CreateRecord()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0447"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-CLRBLK
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0448', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
  
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void sovlfos_keyClearBlock()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0448"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-NXTREC
		 
  
	<multilinecomment> ** If we're not at the bottom, then go to the last record </multilinecomment> 
	IF :System.Last_Record <> 'TRUE' THEN 
		next_Record;
	
 else 
			message( G$_NLS.Get('SOQOLIB-0449', 'FORM','At last record.') );
	 
  END IF; 
  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sovlfos_NextRecord()
		{
			
				//  ** If we're not at the bottom, then go to the last record 
				//  ** If we're not at the bottom, then go to the last record 
				if ( !isInLastRecord() )
				{
					nextRecord();
				}
				else {
					infoMessage(GNls.Fget(toStr("SOQOLIB-0449"), toStr("FORM"), toStr("At last record.")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-ENTQRY
		  MESSAGE(
 G$_NLS.Get('SOQOLIB-0450', 'FORM','*ERROR* Invalid function; press SHOW KEYS for valid functions') 
      ) ;
 return; 
<multilinecomment> 
:s$_curricula_summary.query_summary := 'Y'; 
clear_block; 
enter_query; </multilinecomment> 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void sovlfos_Search()
		{
			
				errorMessage(GNls.Fget(toStr("SOQOLIB-0450"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS for valid functions")));
				return ;
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.POST-QUERY
		 	:stvmajr_desc := gb_stvmajr.f_get_description(:sovlfos_majr_code);
	:stvdept_desc := gb_stvdept.f_get_description(:sovlfos_dept_code);
  :stvconc_desc := gb_stvmajr.f_get_description(:sovlfos_conc_attach_majr_code);
  :gtvlfst_desc := gb_gtvlfst.f_get_description(:sovlfos_lfst_code);
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sovlfos_AfterQuery(RowAdapterEvent args)
		{
			
				SovlfosAdapter sovlfosElement = (SovlfosAdapter)args.getRow();


				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				sovlfosElement.setStvmajrDesc(GbStvmajr.fGetDescription(sovlfosElement.getSovlfosMajrCode()));
				sovlfosElement.setStvdeptDesc(GbStvdept.fGetDescription(sovlfosElement.getSovlfosDeptCode()));
				sovlfosElement.setStvconcDesc(GbStvmajr.fGetDescription(sovlfosElement.getSovlfosConcAttachMajrCode()));
				sovlfosElement.setGtvlfstDesc(GbGtvlfst.fGetDescription(sovlfosElement.getSovlfosLfstCode()));
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-NXTBLK
		 execute_trigger('call_curriculum');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sovlfos_NextBlock()
		{
			
				executeAction("call_curriculum");
				getContainer().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.KEY-PRVBLK
		 go_block('sovlcur');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sovlfos_PreviousBlock()
		{
			
				goBlock(toStr("sovlcur"));
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.WHEN-NEW-BLOCK-INSTANCE
		  
 if :system.block_status = 'NEW'   then 
	go_item(:return_from_sovlcur); 
	g$_check_failure;
 else
    null;
 end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void sovlfos_blockChange()
		{
			
				if ( getBlockStatus().equals("NEW") )
				{
					goItem(getFormModel().getSCurriculaSummary().getReturnFromSovlcur());
					getContainer().getGoqrpls().gCheckFailure();
				}
				else {
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.WHEN-NEW-RECORD-INSTANCE
		 declare 
	majr_cnt NUMBER := 0; 
	CURSOR find_conc_c IS
	  select nvl(count(*) , 0)
	  from sovlfos attach
	  where attach.sovlfos_pidm = :sovlcur.sovlcur_pidm
	  and attach.sovlfos_lcur_seqno = :sovlcur.sovlcur_seqno
	  and ( ( attach.sovlfos_current_ind = 'Y'
	     and :sovlcur.sovlcur_rpt_current_ind = 'Y' ) OR 
	    ( :sovlcur.sovlcur_rpt_current_ind = 'N' ) )
	  and attach.sovlfos_active_ind = 'Y'
	  and attach.sovlfos_lfst_code = sb_fieldofstudy_str.f_concentration 
	  and attach.sovlfos_majr_code_attach = :sovlfos_majr_code; 
	  
begin
  IF :sovlfos_lfst_code = sb_fieldofstudy_str.f_major THEN
  	 OPEN find_conc_c;
  	 FETCH find_conc_c into  majr_cnt;
  	 IF find_conc_c%NOTFOUND THEN
  	 	 majr_cnt := 0; 
  	 END IF;
  	 CLOSE find_conc_c; 
  	 IF majr_cnt > 0 THEN 
  	  	IF GET_ITEM_PROPERTY('SOVLFOS_CONC_CODE_BTN',VISIBLE) = 'TRUE' THEN 
  	 		  SET_ITEM_PROPERTY('SOVLFOS_CONC_CODE_BTN',ENABLED,property_true);
  	  	END IF;
  		ELSE 
  	   	IF GET_ITEM_PROPERTY('SOVLFOS_CONC_CODE_BTN',VISIBLE) = 'TRUE' THEN 
  	 		  SET_ITEM_PROPERTY('SOVLFOS_CONC_CODE_BTN',ENABLED,property_false);
  	 	  END IF;

  	 END IF;
  ELSE
  	IF GET_ITEM_PROPERTY('SOVLFOS_CONC_CODE_BTN',VISIBLE) = 'TRUE' THEN 
	 		  SET_ITEM_PROPERTY('SOVLFOS_CONC_CODE_BTN',ENABLED,property_false);
 	 	END IF;
 END IF; 
 
end;
	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sovlfos_recordChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				SovlcurAdapter sovlcurElement = (SovlcurAdapter)this.getFormModel().getSovlcur().getRowAdapter(true);
				SovlfosAdapter sovlfosElement = (SovlfosAdapter)this.getFormModel().getSovlfos().getRowAdapter(true);


				int rowCount = 0;
				{
					NNumber majrCnt = toNumber(0);
					String sqlfindConcC = "SELECT nvl(count(*), 0) " +
	" FROM sovlfos attach " +
	" WHERE attach.sovlfos_pidm = :SOVLCUR_SOVLCUR_PIDM AND attach.sovlfos_lcur_seqno = :SOVLCUR_SOVLCUR_SEQNO AND ((attach.sovlfos_current_ind = 'Y' AND :SOVLCUR_SOVLCUR_RPT_CURRENT_IND = 'Y') OR (:SOVLCUR_SOVLCUR_RPT_CURRENT_IND = 'N')) AND attach.sovlfos_active_ind = 'Y' AND attach.sovlfos_lfst_code = sb_fieldofstudy_str.f_concentration AND attach.sovlfos_majr_code_attach = :SOVLFOS_MAJR_CODE ";
					DataCursor findConcC = new DataCursor(sqlfindConcC);
					try {
						if ( sovlfosElement.getSovlfosLfstCode().equals(SbFieldofstudyStr.fMajor()) )
						{
							//Setting query parameters
							findConcC.addParameter("SOVLCUR_SOVLCUR_PIDM", sovlcurElement.getSovlcurPidm());
							findConcC.addParameter("SOVLCUR_SOVLCUR_SEQNO", sovlcurElement.getSovlcurSeqno());
							findConcC.addParameter("SOVLCUR_SOVLCUR_RPT_CURRENT_IND", sovlcurElement.getSovlcurRptCurrentInd());
							findConcC.addParameter("SOVLFOS_MAJR_CODE", sovlfosElement.getSovlfosMajrCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable findConcC.
							findConcC.open();
							ResultSet findConcCResults = findConcC.fetchInto();
							if ( findConcCResults != null ) {
								majrCnt = findConcCResults.getNumber(0);
							}
							if ( findConcC.notFound() )
							{
								majrCnt = toNumber(0);
							}
							findConcC.close();
							if ( majrCnt.greater(0) )
							{
								if ( getItemVisible("SOVLFOS_CONC_CODE_BTN").equals("TRUE") )
								{
									setItemEnabled("SOVLFOS_CONC_CODE_BTN", true);
								}
							}
							else {
								if ( getItemVisible("SOVLFOS_CONC_CODE_BTN").equals("TRUE") )
								{
									setItemEnabled("SOVLFOS_CONC_CODE_BTN", false);
								}
							}
						}
						else {
							if ( getItemVisible("SOVLFOS_CONC_CODE_BTN").equals("TRUE") )
							{
								setItemEnabled("SOVLFOS_CONC_CODE_BTN", false);
							}
						}
					} finally {
						findConcC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SOVLFOS.POST-BLOCK
		 IF GET_ITEM_PROPERTY('SOVLFOS_CONC_CODE_BTN',VISIBLE) = 'TRUE' AND
  GET_ITEM_PROPERTY('SOVLFOS_CONC_CODE_BTN',ENABLED) = 'TRUE'	 THEN 
	 		  SET_ITEM_PROPERTY('SOVLFOS_CONC_CODE_BTN',ENABLED,property_false);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void sovlfos_blockOut()
		{
			
				if ( getItemVisible("SOVLFOS_CONC_CODE_BTN").equals("TRUE") && getItemEnabled("SOVLFOS_CONC_CODE_BTN").equals("TRUE") )
				{
					setItemEnabled("SOVLFOS_CONC_CODE_BTN", false);
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sovlfos_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

                // F2J_WARNING : Caution, the variable may be null.                  
                SovlcurAdapter sovlcurElement = (SovlcurAdapter) this.getFormModel().getSovlcur().getRowAdapter();                       
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SOVLCUR_PIDM", sovlcurElement.getSovlcurPidm()));             


                // F2J_WARNING : Caution, the variable may be null.                  
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SOVLCUR_SEQNO", sovlcurElement.getSovlcurSeqno()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVLFST_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GTVLFST_DESC", function=KeyFunction.ITEM_CHANGE)
		public void gtvlfstDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVMAJR_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvmajrDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
	
	
}

