package net.hedtech.banner.general.common.Gtvzipc.controller;
 
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

import net.hedtech.banner.general.common.Gtvzipc.model.*;
import net.hedtech.banner.general.common.Gtvzipc.*;
import net.hedtech.banner.general.common.Gtvzipc.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GtvzipcBlockController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public GtvzipcBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GtvzipcTask getTask() {
		return (GtvzipcTask)super.getTask();
	}

	public GtvzipcModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_CNTY_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GTVZIPC_CNTY_CODE")
		public void gtvzipcCntyCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_CNTY_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GTVZIPC_CNTY_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gtvzipcCntyCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_CNTY_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GTVZIPC_CNTY_CODE")
		public void gtvzipcCntyCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_CNTY_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GTVZIPC_CNTY_CODE")
		public void gtvzipcCntyCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_CNTY_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GTVZIPC_CNTY_CODE", function=KeyFunction.NEXT_ITEM)
		public void gtvzipcCntyCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_CNTY_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GTVZIPC_CNTY_CODE", function=KeyFunction.ITEM_OUT)
		public void gtvzipcCntyCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVZIPC_CNTY_CODE.WHEN-VALIDATE-ITEM
		 IF :GTVZIPC_CNTY_CODE IS NULL THEN
    RETURN;
END IF;
BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT STVCNTY_DESC
         FROM   STVCNTY
         WHERE  STVCNTY_CODE = :GTVZIPC_CNTY_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('GTVZIPC-0003', 'FORM','*ERROR* Invalid County Code; press LIST for valid codes') ,
         TRUE);
   END ;
--
   << PTI_END_TRIGGER >>
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
		 * GTVZIPC_CNTY_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GTVZIPC_CNTY_CODE")
		public void gtvzipcCntyCode_validate()
		{
			


				GtvzipcBlockAdapter gtvzipcBlockElement = (GtvzipcBlockAdapter)this.getFormModel().getGtvzipcBlock().getRowAdapter(true);

				if(gtvzipcBlockElement!=null){

				int rowCount = 0;
				if ( gtvzipcBlockElement.getGtvzipcCntyCode().isNull() )
				{
					return ;
				}
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						//goto PTI_END_TRIGGER;
						//PTI_END_TRIGGER:;
						setGlobal("QUERY_MODE", toStr("0"));
					}
					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT STVCNTY_DESC " +
	" FROM STVCNTY " +
	" WHERE STVCNTY_CODE = :GTVZIPC_CNTY_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("GTVZIPC_CNTY_CODE", gtvzipcBlockElement.getGtvzipcCntyCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GTVZIPC-0003"), toStr("FORM"), toStr("*ERROR* Invalid County Code; press LIST for valid codes")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GTVZIPC_STAT_CODE")
		public void gtvzipcStatCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_STAT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GTVZIPC_STAT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gtvzipcStatCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_STAT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GTVZIPC_STAT_CODE")
		public void gtvzipcStatCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_STAT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GTVZIPC_STAT_CODE")
		public void gtvzipcStatCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_STAT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GTVZIPC_STAT_CODE", function=KeyFunction.NEXT_ITEM)
		public void gtvzipcStatCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_STAT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GTVZIPC_STAT_CODE", function=KeyFunction.ITEM_OUT)
		public void gtvzipcStatCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVZIPC_STAT_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT STVSTAT_DESC
         FROM   STVSTAT
         WHERE  STVSTAT_CODE = :GTVZIPC_STAT_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('GTVZIPC-0004', 'FORM','*ERROR* Invalid State Code; press LIST for valid codes') ,
         TRUE);
   END ;
--
   << PTI_END_TRIGGER >>
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
		 * GTVZIPC_STAT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GTVZIPC_STAT_CODE")
		public void gtvzipcStatCode_PostChange()
		{
			

				GtvzipcBlockAdapter gtvzipcBlockElement = (GtvzipcBlockAdapter)this.getFormModel().getGtvzipcBlock().getRowAdapter(true);

				if(gtvzipcBlockElement!=null){

				int rowCount = 0;
				if(gtvzipcBlockElement.getGtvzipcStatCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						//goto PTI_END_TRIGGER;
						//PTI_END_TRIGGER:;
						setGlobal("QUERY_MODE", toStr("0"));
					}
					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT STVSTAT_DESC " +
	" FROM STVSTAT " +
	" WHERE STVSTAT_CODE = :GTVZIPC_STAT_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("GTVZIPC_STAT_CODE", gtvzipcBlockElement.getGtvzipcStatCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GTVZIPC-0004"), toStr("FORM"), toStr("*ERROR* Invalid State Code; press LIST for valid codes")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_NATN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GTVZIPC_NATN_CODE")
		public void gtvzipcNatnCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_NATN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GTVZIPC_NATN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void gtvzipcNatnCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_NATN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GTVZIPC_NATN_CODE")
		public void gtvzipcNatnCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_NATN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GTVZIPC_NATN_CODE", function=KeyFunction.NEXT_ITEM)
		public void gtvzipcNatnCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_NATN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GTVZIPC_NATN_CODE", function=KeyFunction.ITEM_OUT)
		public void gtvzipcNatnCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVZIPC_NATN_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT STVNATN_CODE
         FROM   STVNATN
         WHERE  STVNATN_CODE = :GTVZIPC_NATN_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :GTVZIPC_NATN_CODE ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('GTVZIPC-0005', 'FORM','*ERROR* Invalid Nation Code; press LIST for valid codes') ,
         TRUE);
   END ;
--
   << PTI_END_TRIGGER >>
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
		 * GTVZIPC_NATN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GTVZIPC_NATN_CODE")
		public void gtvzipcNatnCode_PostChange()
		{
			


				GtvzipcBlockAdapter gtvzipcBlockElement = (GtvzipcBlockAdapter)this.getFormModel().getGtvzipcBlock().getRowAdapter(true);

				if(gtvzipcBlockElement!=null){
				int rowCount = 0;
				if(gtvzipcBlockElement.getGtvzipcNatnCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						//goto PTI_END_TRIGGER;
						//PTI_END_TRIGGER:;
						setGlobal("QUERY_MODE", toStr("0"));
					}
					{
						String sqlptiCursor = "SELECT STVNATN_CODE " +
	" FROM STVNATN " +
	" WHERE STVNATN_CODE = :GTVZIPC_NATN_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("GTVZIPC_NATN_CODE", gtvzipcBlockElement.getGtvzipcNatnCode());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								gtvzipcBlockElement.setGtvzipcNatnCode(ptiCursorResults.getStr(0));
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GTVZIPC-0005"), toStr("FORM"), toStr("*ERROR* Invalid Nation Code; press LIST for valid codes")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}
		}

		
		/* Original PL/SQL code code for TRIGGER GTVZIPC_NATN_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('STVNATN_CODE',
                     'STVNATN_NATION');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_NATN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GTVZIPC_NATN_CODE")
		public void gtvzipcNatnCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("STVNATN_CODE"), toStr("STVNATN_NATION"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GTVZIPC_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void gtvzipcActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GTVZIPC_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gtvzipcActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GTVZIPC_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void gtvzipcActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_STAT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GTVZIPC_STAT_CODE")
		public void gtvzipcStatCode_validate()
		{
			
				GtvzipcBlockAdapter gtvzipcBlockElement = (GtvzipcBlockAdapter)this.getFormModel().getGtvzipcBlock().getRowAdapter(true);
							this.gtvzipcStatCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_BLOCK.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gtvzipcBlock_AfterQuery(RowAdapterEvent args)
		{
			
			GtvzipcBlockAdapter gtvzipcBlockElement = (GtvzipcBlockAdapter)args.getRow();			
						
				try {
				gtvzipcBlockElement.setLockDbValues(true);
                                 try {  
                                this.gtvzipcStatCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.gtvzipcNatnCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 

//[DELETE] 
//[DELETE] 
				 
			
						} finally {
							gtvzipcBlockElement.setLockDbValues(false);
						}
						

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVZIPC_NATN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GTVZIPC_NATN_CODE")
		public void gtvzipcNatnCode_validate()
		{
			
				GtvzipcBlockAdapter gtvzipcBlockElement = (GtvzipcBlockAdapter)this.getFormModel().getGtvzipcBlock().getRowAdapter(true);
							this.gtvzipcNatnCode_PostChange();

			}

		
	
	
}

