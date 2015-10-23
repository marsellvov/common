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
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Soaidns.model.*;
import net.hedtech.banner.general.common.Soaidns.*;
import net.hedtech.banner.general.common.Soaidns.services.*;
import net.hedtech.general.common.libraries.Soqolib.model.SovlcurAdapter;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SfbetrmController extends DefaultBlockController {


	
	public SfbetrmController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER SFBETRM.KEY-NXTREC
		 IF :System.Last_Record <> 'TRUE' THEN 
		next_Record;
ELSE 
		message( G$_NLS.Get('SOAIDNS-0009', 'FORM','At last record.') );
END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SFBETRM.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sfbetrm_NextRecord()
		{
			
				if ( !isInLastRecord() )
				{
					nextRecord();
				}
				else {
					infoMessage(GNls.Fget(toStr("SOAIDNS-0009"), toStr("FORM"), toStr("At last record.")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SFBETRM.KEY-PRVBLK
		    GO_BLOCK( 'SGBSTDN' ) ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SFBETRM.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sfbetrm_PreviousBlock()
		{
			
				goBlock(toStr("SGBSTDN"));
			}

		
		/* Original PL/SQL code code for TRIGGER SFBETRM.WHEN-NEW-RECORD-INSTANCE
		 IF :SFBETRM.ROWID IS NULL THEN
   IF GET_BLOCK_PROPERTY(:SYSTEM.CURSOR_BLOCK,CURRENT_RECORD) <> 1 THEN
      PREVIOUS_RECORD;
      MESSAGE( G$_NLS.Get('SOAIDNS-0010', 'FORM','At last record.') ,NO_ACKNOWLEDGE);
   END IF;
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SFBETRM.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sfbetrm_recordChange()
		{
			

				SfbetrmAdapter sfbetrmElement = (SfbetrmAdapter)this.getFormModel().getSfbetrm().getRowAdapter(true);

				if(sfbetrmElement!=null){

				if ( sfbetrmElement.getRowState().equals(DataRowStatus.INSERTED))
				{	
					if ( getBlockCurrentRecord(getCursorBlock()).notEquals(1) )
					{
						previousRecord();
						infoMessage(GNls.Fget(toStr("SOAIDNS-0010"), toStr("FORM"), toStr("At last record.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
					}
				}
			}
		}
		
		/* Original PL/SQL code code for TRIGGER SFBETRM.KEY-NEXT-ITEM
		 Go_block('sovlcur');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SFBETRM.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", function=KeyFunction.NEXT_ITEM)
		public void sfbetrm_keyNexItem()
		{
			
				goBlock(toStr("sovlcur"));
			}

		
		/* Original PL/SQL code code for TRIGGER SFBETRM.KEY-NXTBLK
		   IF :sovlcur_priority_no IS NULL THEN 
  	GO_BLOCK('SPRIDEN');
  ELSE 
    GO_BLOCK( 'SOVLCUR' ) ;
  END IF; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SFBETRM.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sfbetrm_NextBlock()
		{
			
				SovlcurAdapter sovlcurElement = (SovlcurAdapter)this.getFormModel().getSovlcur().getRowAdapter(true);

				if(sovlcurElement!=null){

				if ( sovlcurElement.getSovlcurPriorityNo().isNull() )
				{
					goBlock(toStr("SPRIDEN"));
				}
				else {
					goBlock(toStr("SOVLCUR"));
				}
			}
		}
		
		/* Original PL/SQL code code for TRIGGER SFBETRM.POST-QUERY
		    DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVTERM_DESC
         FROM   STVTERM
         WHERE  STVTERM_CODE = :SFBETRM_TERM_CODE;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :BETRM_DESC;
   END ;   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SFBETRM.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sfbetrm_AfterQuery(RowAdapterEvent args)
		{
			
				SfbetrmAdapter sfbetrmElement = (SfbetrmAdapter)args.getRow();


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT STVTERM_DESC " +
	" FROM STVTERM " +
	" WHERE STVTERM_CODE = :SFBETRM_TERM_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SFBETRM_TERM_CODE", sfbetrmElement.getSfbetrmTermCode());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							sfbetrmElement.setBetrmDesc(ptiCursorResults.getStr(0));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SFBETRM.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sfbetrm_BeforeQuery(QueryEvent args)
		{
			
                 
                SpridenAdapter spridenElement = (SpridenAdapter) this.getFormModel().getSpriden().getRowAdapter();                       
				
                if(spridenElement!=null){
                
                ((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SPRIDEN_SPRIDEN_PIDM", spridenElement.getSpridenPidm()));             


                }
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BETRM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="BETRM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void betrmDesc_itemChange()
		{
			
				previousItem();
			}

		
	
	
}

