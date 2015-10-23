package net.hedtech.banner.general.common.Goamtch.controller;
 
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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;

import net.hedtech.banner.general.common.Goamtch.model.*;
import net.hedtech.banner.general.common.Goamtch.*;
import net.hedtech.banner.general.common.Goamtch.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GtvcmscController extends DefaultBlockController {


	
	public GtvcmscController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GoamtchTask getTask() {
		return (GoamtchTask)super.getTask();
	}

	public GoamtchModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GTVCMSC.WHEN-NEW-BLOCK-INSTANCE
		 BEGIN
	EXECUTE_QUERY;
	IF :GTVCMSC.GTVCMSC_CODE IS NULL THEN 
	  RETURN;
	END IF;
--
	GO_BLOCK('GORCMSP');
	EXECUTE_QUERY;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVCMSC.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gtvcmsc_blockChange()
		{
			

			
				GtvcmscAdapter gtvcmscElement = (GtvcmscAdapter)this.getFormModel().getGtvcmsc().getRowAdapter(true);
				
                if(gtvcmscElement==null){
                	return;
                }


				executeQuery();
				if ( gtvcmscElement.getGtvcmscCode().isNull() )
				{
					return ;
				}
				// 
				goBlock(toStr("GORCMSP"));
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVCMSC.POST-QUERY
		 IF :GTVCMSC.GTVCMSC_LONG_DESC IS NULL THEN
	--:GTVCMSC.LONG_DESC := 'No Comment exists for this Matching Source.';               --Commented for Defect# 1-1ADJKV
	  :GTVCMSC.LONG_DESC := G$_NLS.Get('GOAMTCH-0059','FORM','No Comment exists for this Matching Source.');  --Added for Defect #1-1ADJKV
ELSE
	:GTVCMSC.LONG_DESC := :GTVCMSC.GTVCMSC_LONG_DESC;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVCMSC.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gtvcmsc_AfterQuery(RowAdapterEvent args)
		{
			
				GtvcmscAdapter gtvcmscElement = (GtvcmscAdapter)args.getRow();


				if ( gtvcmscElement.getGtvcmscLongDesc().isNull() )
				{
					// :GTVCMSC.LONG_DESC := 'No Comment exists for this Matching Source.';               --Commented for Defect# 1-1ADJKV
					gtvcmscElement.setLongDesc(GNls.Fget(toStr("GOAMTCH-0059"), toStr("FORM"), toStr("No Comment exists for this Matching Source.")));
				}
				else {
					gtvcmscElement.setLongDesc(gtvcmscElement.getGtvcmscLongDesc());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GTVCMSC.KEY-EXIT
		 GO_ITEM(:FORM_HEADER.HOLD_BLK_ITEM);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVCMSC.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void gtvcmsc_Exit()
		{
			
				goItem(getFormModel().getFormHeader().getHoldBlkItem());
			}

		
		/* Original PL/SQL code code for TRIGGER GTVCMSC.KEY-NXTBLK
		 NEXT_BLOCK;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVCMSC.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gtvcmsc_NextBlock()
		{
			
				nextBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER GTVCMSC.KEY-PRVBLK
		 PREVIOUS_BLOCK;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVCMSC.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gtvcmsc_PreviousBlock()
		{
			
				previousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVCMSC.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void gtvcmsc_BeforeQuery(QueryEvent args)
		{
			

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_KEYBLOCK_SOURCE_CODE", this.getFormModel().getKeyBlock().getKeyblockSourceCode()));             


           
               }

		
	
	
}

