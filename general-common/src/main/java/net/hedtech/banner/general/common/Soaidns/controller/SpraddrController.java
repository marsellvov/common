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
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpraddrController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public SpraddrController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER SPRADDR.POST-QUERY
		 <multilinecomment> MW 02/09/2001 Added the Primary Indicator to the WHERE clause below to fix defect 47240. </multilinecomment>
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT SPRTELE_PHONE_AREA, SPRTELE_PHONE_NUMBER
         FROM   SPRTELE
         WHERE  SPRTELE_PIDM = :SPRIDEN.SPRIDEN_PIDM
           AND  SPRTELE_ATYP_CODE = :SPRADDR_ATYP_CODE
           AND  SPRTELE_ADDR_SEQNO = :SPRADDR_SEQNO 
           AND  SPRTELE_PRIMARY_IND = 'Y' ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :PHONE_AREA, :PHONE_NUMBER ;
   END ;
		*/
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
			
				//  MW 02/09/2001 Added the Primary Indicator to the WHERE clause below to fix defect 47240. 
				SpridenAdapter spridenElement = (SpridenAdapter)this.getFormModel().getSpriden().getRowAdapter(true);
				SpraddrAdapter spraddrElement = (SpraddrAdapter)args.getRow();


				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT SPRTELE_PHONE_AREA, SPRTELE_PHONE_NUMBER " +
	" FROM SPRTELE " +
	" WHERE SPRTELE_PIDM = :SPRIDEN_SPRIDEN_PIDM AND SPRTELE_ATYP_CODE = :SPRADDR_ATYP_CODE AND SPRTELE_ADDR_SEQNO = :SPRADDR_SEQNO AND SPRTELE_PRIMARY_IND = 'Y' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("SPRIDEN_SPRIDEN_PIDM", spridenElement.getSpridenPidm());
						ptiCursor.addParameter("SPRADDR_ATYP_CODE", spraddrElement.getSpraddrAtypCode());
						ptiCursor.addParameter("SPRADDR_SEQNO", spraddrElement.getSpraddrSeqno());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							spraddrElement.setPhoneArea(ptiCursorResults.getStr(0));
							spraddrElement.setPhoneNumber(ptiCursorResults.getStr(1));
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-NXTBLK
		    GO_BLOCK( 'SGBSTDN' ) ;
		*/
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
			
				goBlock(toStr("SGBSTDN"));
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-NXTREC
		 IF :System.Last_Record <> 'TRUE' THEN 
		next_Record;
ELSE 
		message( G$_NLS.Get('SOAIDNS-0003', 'FORM','At last record.') );
END IF; 

		*/
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
			
				if ( !isInLastRecord() )
				{
					nextRecord();
				}
				else {
					infoMessage(GNls.Fget(toStr("SOAIDNS-0003"), toStr("FORM"), toStr("At last record.")));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.WHEN-NEW-RECORD-INSTANCE
		 IF :SPRADDR.ROWID IS NULL THEN
   IF GET_BLOCK_PROPERTY(:SYSTEM.CURSOR_BLOCK,CURRENT_RECORD) <> 1 THEN
      PREVIOUS_RECORD;
      MESSAGE( G$_NLS.Get('SOAIDNS-0004', 'FORM','At last record.') ,NO_ACKNOWLEDGE);
   END IF;
END IF;
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

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void spraddr_recordChange()
		{
			

				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);

				if(spraddrElement!=null){

				if ( spraddrElement.getRowState().equals(DataRowStatus.INSERTED) )
				{
					if ( getBlockCurrentRecord(getCursorBlock()).notEquals(1) )
					{
						previousRecord();
						infoMessage(GNls.Fget(toStr("SOAIDNS-0004"), toStr("FORM"), toStr("At last record.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
					}
				}
			}
		}

		
		/* Original PL/SQL code code for TRIGGER SPRADDR.KEY-PRVBLK
		 GO_BLOCK('SOUNDEX');
		*/
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
			
				goBlock(toStr("SOUNDEX"));
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
			
                
                SpridenAdapter spridenElement = (SpridenAdapter) this.getFormModel().getSpriden().getRowAdapter();                       
			
                if(spridenElement!=null){
                
                ((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SPRIDEN_SPRIDEN_PIDM", spridenElement.getSpridenPidm()));             


                }
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
			
				getGDateClass().nextItem();
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
			
				getGDateClass().itemChange();
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
			
				getGDateClass().itemOut();
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
			
				getGDateClass().nextItem();
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
			
				getGDateClass().itemChange();
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
			
				getGDateClass().itemOut();
			}

		
	
	
}

