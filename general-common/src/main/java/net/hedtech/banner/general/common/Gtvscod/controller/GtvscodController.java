package net.hedtech.banner.general.common.Gtvscod.controller;
 
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Gtvscod.model.*;
import net.hedtech.banner.general.common.Gtvscod.*;
import net.hedtech.banner.general.common.Gtvscod.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GtvscodController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public GtvscodController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GtvscodTask getTask() {
		return (GtvscodTask)super.getTask();
	}

	public GtvscodModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GTVSCOD.PRE-QUERY
		 EXECUTE_TRIGGER('GLOBAL_COPY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void gtvscod_BeforeQuery(QueryEvent args)
		{
		
			
          
	

			GtvscodAdapter gtvscodElement = (GtvscodAdapter)this.getFormModel().getGtvscod().getRowAdapter(true);
			if(gtvscodElement!=null){
			((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_ELEMENT_ID", getGlobal("EDI_ELEMENT_ID")));             


			 ((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GTVSCOD_ELEMENT_ID", gtvscodElement.getGtvscodElementId()));          

			
		   
			 ((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GLOBAL_STANDARD_IND", getGlobal("EDI_STANDARD_IND")));  
			
			
			 ((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GTVSCOD_STANDARD_IND", gtvscodElement.getGtvscodStandardInd()));
			}
//    gtvscodElement.setGtvscodElementId(getGlobal("EDI_ELEMENT_ID"));
//    
// 
//     
// 	
//	gtvscodElement.setGtvscodStandardInd(getGlobal("EDI_STANDARD_IND"));
//	
	

           

		
		
//		NString holdValue= NString.getNull();
//		String sqlgetGtvscod = "SELECT * " +
//" FROM GTVSCOD " +
//" WHERE  gtvscod_element_id = nvl(:EDI_ELEMENT_ID, gtvscod_element_id) OR gtvscod_element_id=:GTVSCOD_ELEMENT_ID AND (gtvscod_standard_ind= nvl(:EDI_STANDARD_IND, gtvscod_standard_ind OR gtvscod_standard_ind ='I' OR GTVSCOD_STANDARD_IND='E'";
//		DataCursor getGtvsdax = new DataCursor(sqlgetGtvscod);
//		try {
//			//Setting query parameters
//			getGtvsdax.addParameter("GTVSCOD_STANDARD_IND", gtvscodElement.getGtvscodStandardInd());
//			getGtvsdax.open();
//			ResultSet getGtvsdaxResults = getGtvsdax.fetchInto();
//			if ( getGtvsdaxResults != null ) {
//				holdValue = getGtvsdaxResults.getStr(0);
//			}
//		}finally{
//				getGtvsdax.close();
//			}
//	
//    
		}
	

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_STANDARD_IND.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GTVSCOD_STANDARD_IND")
		public void gtvscodStandardInd_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_STANDARD_IND.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GTVSCOD_STANDARD_IND", function=KeyFunction.ITEM_CHANGE)
		public void gtvscodStandardInd_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_STANDARD_IND.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GTVSCOD_STANDARD_IND")
		public void gtvscodStandardInd_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_STANDARD_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GTVSCOD_STANDARD_IND", function=KeyFunction.NEXT_ITEM)
		public void gtvscodStandardInd_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_STANDARD_IND.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GTVSCOD_STANDARD_IND", function=KeyFunction.ITEM_OUT)
		public void gtvscodStandardInd_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD_STANDARD_IND.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('GTVSDAX_INTERNAL_CODE','GTVSDAX_DESC','where gtvsdax_internal_code_group=''EDI STANDARDS''');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_STANDARD_IND.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GTVSCOD_STANDARD_IND")
		public void gtvscodStandardInd_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("GTVSDAX_INTERNAL_CODE"), toStr("GTVSDAX_DESC"), toStr("where gtvsdax_internal_code_group='EDI STANDARDS'"));
			}

		
		/* Original PL/SQL code code for TRIGGER GTVSCOD_STANDARD_IND.POST-CHANGE
		 DECLARE
  HOLD_VALUE VARCHAR2(1);
  CURSOR GET_GTVSDAX IS
   SELECT 'Y' FROM GTVSDAX
   WHERE GTVSDAX_INTERNAL_CODE_GROUP='EDI STANDARDS'
   AND GTVSDAX_INTERNAL_CODE=:GTVSCOD_STANDARD_IND;
BEGIN
  OPEN GET_GTVSDAX;
  FETCH GET_GTVSDAX INTO HOLD_VALUE;
  

IF GET_GTVSDAX%NOTFOUND THEN
  MESSAGE( G$_NLS.Get('GTVSCOD-0009', 'FORM','EDI Standard Code is invalid. List of Values Available.') );
  RAISE FORM_TRIGGER_FAILURE;
END IF;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_STANDARD_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GTVSCOD_STANDARD_IND")
		public void gtvscodStandardInd_PostChange()
		{
			

				GtvscodAdapter gtvscodElement = (GtvscodAdapter)this.getFormModel().getGtvscod().getRowAdapter(true);

				if(gtvscodElement!=null){
				int rowCount = 0;
				if(gtvscodElement.getGtvscodStandardInd().isNull())
		return;
				{
					NString holdValue= NString.getNull();
					String sqlgetGtvsdax = "SELECT 'Y' " +
	" FROM GTVSDAX " +
	" WHERE GTVSDAX_INTERNAL_CODE_GROUP = 'EDI STANDARDS' AND GTVSDAX_INTERNAL_CODE = :GTVSCOD_STANDARD_IND ";
					DataCursor getGtvsdax = new DataCursor(sqlgetGtvsdax);
					try {
						//Setting query parameters
						getGtvsdax.addParameter("GTVSCOD_STANDARD_IND", gtvscodElement.getGtvscodStandardInd());
						getGtvsdax.open();
						ResultSet getGtvsdaxResults = getGtvsdax.fetchInto();
						if ( getGtvsdaxResults != null ) {
							holdValue = getGtvsdaxResults.getStr(0);
						}
						if ( getGtvsdax.notFound() )
						{
							errorMessage(GNls.Fget(toStr("GTVSCOD-0009"), toStr("FORM"), toStr("*ERROR* EDI Standard Code is invalid. List of Values Available.")));
							throw new ApplicationException();
						}
					}
					finally{
						getGtvsdax.close();
					}
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GTVSCOD_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void gtvscodActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GTVSCOD_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gtvscodActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GTVSCOD_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void gtvscodActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD_STANDARD_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GTVSCOD_STANDARD_IND")
		public void gtvscodStandardInd_validate()
		{
			
				GtvscodAdapter gtvscodElement = (GtvscodAdapter)this.getFormModel().getGtvscod().getRowAdapter(true);
							this.gtvscodStandardInd_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVSCOD.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gtvscod_AfterQuery(RowAdapterEvent args)
		{
			
			GtvscodAdapter gtvscodElement = (GtvscodAdapter)args.getRow();	
			
						
				try {
				gtvscodElement.setLockDbValues(true);
				try { 
				this.gtvscodStandardInd_PostChange();
				} catch(Exception ex) {
				}
			
						} finally {
							gtvscodElement.setLockDbValues(false);
						}
						

			}

		
	
	
}

