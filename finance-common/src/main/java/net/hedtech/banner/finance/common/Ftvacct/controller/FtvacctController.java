package net.hedtech.banner.finance.common.Ftvacct.controller;
 
import java.util.*;

import morphis.core.utils.behavior.annotations.After;
import morphis.core.utils.behavior.annotations.Before;
			


import morphis.core.utils.string.StringUtils;

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
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.finance.common.Ftvacct.model.*;
import net.hedtech.banner.finance.common.Ftvacct.*;
import net.hedtech.banner.finance.common.Ftvacct.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FtvacctController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	


	public FtvacctController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FtvacctTask getTask() {
		return (FtvacctTask)super.getTask();
	}

	public FtvacctModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FTVACCT.PRE-QUERY
		   :hold_coas_code := :global.coas_code ;
   :query_int_atyp := :internal_atyp;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void ftvacct_BeforeQuery(QueryEvent args)
		{
			
				FtvacctAdapter ftvacctElement = (FtvacctAdapter)this.getFormModel().getFtvacct().getRowAdapter(true);
				getFormModel().getFormHeader().setHoldCoasCode(getGlobal("COAS_CODE"));
				getFormModel().getFormHeader().setQueryIntAtyp(ftvacctElement.getInternalAtyp());


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("HOLD_COAS_CODE", this.getFormModel().getFormHeader().getHoldCoasCode()));             


 //               FtvacctAdapter ftvacctElement = (FtvacctAdapter) this.getFormModel().getFtvacct().getRowAdapter();                       
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FTVACCT_COAS_CODE", ftvacctElement.getFtvacctCoasCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FTVACCT_DATA_ENTRY_IND", ftvacctElement.getFtvacctDataEntryInd()));             

				//MORPHIS: Filter parameter added always
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("QUERY_INT_ATYP", this.getFormModel().getFormHeader().getQueryIntAtyp()));             
				
			}

		
		/* Original PL/SQL code code for TRIGGER FTVACCT.KEY-EXEQRY
		 SET_BLOCK_PROPERTY('FTVACCT',DEFAULT_WHERE,
	'where (ftvacct_coas_code = :hold_coas_code 
	 or ftvacct_coas_code = :ftvacct_coas_code)');
EXECUTE_QUERY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void ftvacct_ExecuteQuery()
		{
			
//				setBlockWhereClause("FTVACCT", "where (ftvacct_coas_code = :hold_coas_code \n	 or ftvacct_coas_code = :ftvacct_coas_code)");
				FtvacctAdapter ftvacctElement = (FtvacctAdapter) this.getFormModel().getFtvacct().getRowAdapter();
				
				String whereClause = null;
				if (ftvacctElement != null && ftvacctElement.getFtvacctCoasCode().isNotNull())
					whereClause = "";
				else 
					whereClause = "(ftvacct_coas_code = NVL(:HOLD_COAS_CODE, ftvacct_coas_code))";
				
				
				//MORPHIS: Add the filter based on virtual item to the query.
				//Note: the filter value is set in BeforeQuery
				
				NString filterValue = ftvacctElement.getInternalAtyp();
				
				if ( !filterValue.isNull() ) {
						
						String sqlgetIntAtyp = 	"(SELECT ftvatyp_internal_atyp_code FROM ftvatyp " +
												"WHERE ftvatyp_atyp_code = FTVACCT_ATYP_CODE AND ftvatyp_coas_code = FTVACCT_COAS_CODE AND ftvatyp_eff_date <= FTVACCT_EFF_DATE AND ftvatyp_nchg_date > FTVACCT_EFF_DATE)";
						
						
						SelectionCriteria criteria = new SelectionCriteria();					
						criteria.add(sqlgetIntAtyp,  filterValue.getValue(), String.class);

						List<IDbDataParameter> paramList = new ArrayList<IDbDataParameter>();
						String extraClasue = criteria.createWhereClause(this.getFormModel().getFtvacct(), paramList);
						
						this.getFormModel().getFtvacct().getSelectCommandParams().addAll(paramList);
												
						
						if ( StringUtils.isNullOrEmpty(whereClause) )
							whereClause = extraClasue;
						else
							whereClause = whereClause + " AND " + extraClasue;

				}
					
				setBlockWhereClause("FTVACCT", whereClause);
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVACCT.KEY-PRVBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void ftvacct_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVACCT.KEY-NXTREC
		 IF :SYSTEM.LAST_RECORD = 'TRUE' THEN
   MESSAGE( G$_NLS.Get('FTVACCT-0001', 'FORM','At last record.') );
ELSE
   NEXT_RECORD;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

//		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
//		public void ftvacct_NextRecord()
//		{
//			
//			if ( isInLastRecord() )
//				{
//				infoMessage(GNls.Fget(toStr("FTVACCT-0001"), toStr("FORM"), toStr("At last record.")));
//				}
//				else {
//					nextRecord();
//				}
//			}

		
		/* Original PL/SQL code code for TRIGGER FTVACCT.KEY-NXTBLK
		    EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void ftvacct_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVACCT.WHEN-NEW-RECORD-INSTANCE
		    IF :FTVACCT.ROWID IS NULL THEN
      IF GET_BLOCK_PROPERTY('FTVACCT',CURRENT_RECORD) <> 1 THEN
         PREVIOUS_RECORD;
         MESSAGE( G$_NLS.Get('FTVACCT-0002', 'FORM','At last record.') ,NO_ACKNOWLEDGE);
      END IF;
   END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

//		@After
//		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
//		public void ftvacct_recordChange()
//		{
//			
//
//				FtvacctAdapter ftvacctElement = (FtvacctAdapter)this.getFormModel().getFtvacct().getRowAdapter(true);
//
//				if(ftvacctElement!=null){
//				if ( ftvacctElement.getRowState().equals(DataRowStatus.INSERTED) )
//				{
//					if ( getBlockCurrentRecord("FTVACCT").notEquals(1) )
//					{
//						previousRecord();
//						infoMessage(GNls.Fget(toStr("FTVACCT-0002"), toStr("FORM"), toStr("At last record.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
//					}
//				}
//				}
//			}

		
		/* Original PL/SQL code code for TRIGGER FTVACCT.POST-QUERY
		 declare cursor get_int_atyp is
    select ftvatyp_internal_atyp_code
     from  ftvatyp
    where ftvatyp_atyp_code = :ftvacct_atyp_code
    and   ftvatyp_coas_code = :ftvacct_coas_code
    and    ftvatyp_eff_date <= :ftvacct_eff_date
    and ftvatyp_nchg_date > :ftvacct_eff_date;
begin
   open get_int_atyp;
  fetch get_int_atyp into :internal_atyp;
if :query_int_atyp is not null then
  if :internal_atyp like :query_int_atyp then null;
else raise form_trigger_failure;
  end if;
end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void ftvacct_AfterQuery(RowAdapterEvent args)
		{
			
				FtvacctAdapter ftvacctElement = (FtvacctAdapter)args.getRow();


				int rowCount = 0;
				{
					String sqlgetIntAtyp = "SELECT ftvatyp_internal_atyp_code " +
	" FROM ftvatyp " +
	" WHERE ftvatyp_atyp_code = :FTVACCT_ATYP_CODE AND ftvatyp_coas_code = :FTVACCT_COAS_CODE AND ftvatyp_eff_date <= :FTVACCT_EFF_DATE AND ftvatyp_nchg_date > :FTVACCT_EFF_DATE ";
					DataCursor getIntAtyp = new DataCursor(sqlgetIntAtyp);
					try {
						//Setting query parameters
						getIntAtyp.addParameter("FTVACCT_ATYP_CODE", ftvacctElement.getFtvacctAtypCode());
						getIntAtyp.addParameter("FTVACCT_COAS_CODE", ftvacctElement.getFtvacctCoasCode());
						getIntAtyp.addParameter("FTVACCT_EFF_DATE", ftvacctElement.getFtvacctEffDate());
						getIntAtyp.open();
						ResultSet getIntAtypResults = getIntAtyp.fetchInto();
						if ( getIntAtypResults != null ) {
							ftvacctElement.setInternalAtyp(getIntAtypResults.getStr(0));
						}
						/*
						if ( !getFormModel().getFormHeader().getQueryIntAtyp().isNull() )
						{
							if ( like(ftvacctElement.getInternalAtyp(), getFormModel().getFormHeader().getQueryIntAtyp()) )
							{
							}
							else {
								throw new ApplicationException();
							}
						}
						*/
					}
					finally{
						getIntAtyp.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT_EFF_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVACCT_EFF_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvacctEffDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT_EFF_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVACCT_EFF_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvacctEffDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT_EFF_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVACCT_EFF_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvacctEffDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT_TERM_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVACCT_TERM_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvacctTermDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT_TERM_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVACCT_TERM_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvacctTermDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT_TERM_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVACCT_TERM_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvacctTermDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVACCT_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvacctActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVACCT_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvacctActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVACCT_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVACCT_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvacctActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
	
	
}

