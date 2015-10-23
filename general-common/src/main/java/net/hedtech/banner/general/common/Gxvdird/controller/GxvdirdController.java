package net.hedtech.banner.general.common.Gxvdird.controller;
 
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

import net.hedtech.banner.general.common.Gxvdird.model.*;
import net.hedtech.banner.general.common.Gxvdird.*;
import net.hedtech.banner.general.common.Gxvdird.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GxvdirdController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public GxvdirdController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GxvdirdTask getTask() {
		return (GxvdirdTask)super.getTask();
	}

	public GxvdirdModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GXVDIRD.KEY-LISTVAL
		    LIST_VALUES ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXVDIRD.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void gxvdird_ListValues()
		{
			
				listValues();
			}

		
		/* Original PL/SQL code code for TRIGGER GXVDIRD_CODE_BANK_ROUT_NUM.WHEN-VALIDATE-ITEM
		 DECLARE
	 lv_status VARCHAR2(01);
BEGIN
--
   G$_CHECK_QUERY_MODE ;
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RETURN ;
   END IF ;
   :GLOBAL.QUERY_MODE := '0' ;
<multilinecomment>   
   G$_CHECK_VALUE (INSTR(TRANSLATE(LTRIM(RTRIM(:GXVDIRD_CODE_BANK_ROUT_NUM,' '),' '),
                         '0123456789','@@@@@@@@@@'),'@',1,
                         NVL(LENGTH(LTRIM(RTRIM(:GXVDIRD_CODE_BANK_ROUT_NUM,' '),' ')), 0))
                  <> NVL(LENGTH(LTRIM(RTRIM(:GXVDIRD_CODE_BANK_ROUT_NUM,' '),' ')), 0),
       G$_NLS.Get('GXVDIRD-0017', 'FORM','*ERROR* Bank Code; valid values are 1 thru 999999999') , TRUE) ;
</multilinecomment>

   lv_status := goksels.f_validate_bank_rout_num(:GXVDIRD_CODE_BANK_ROUT_NUM);
   IF lv_status = 'N' THEN
   	 MESSAGE(G$_NLS.Get('GXVDIRD-0006', 'FORM','*ERROR* Bank Routing Number failed validation.')  ) ;
     RAISE FORM_TRIGGER_FAILURE ;
   ELSIF lv_status = 'W' THEN
   	 MESSAGE(G$_NLS.Get('GXVDIRD-0007', 'FORM','*WARNING* Bank Routing Number accepted but failed validation. Please verify.')  ) ;
   END IF;
   G$_CHECK_FAILURE ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXVDIRD_CODE_BANK_ROUT_NUM.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GXVDIRD_CODE_BANK_ROUT_NUM")
		public void gxvdirdCodeBankRoutNum_validate()
		{
				GxvdirdAdapter gxvdirdElement = (GxvdirdAdapter)this.getFormModel().getGxvdird().getRowAdapter(true);
				if(gxvdirdElement==null)
					return;
				
					NString lvStatus= NString.getNull();
					getTask().getGoqrpls().gCheckQueryMode();
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						setGlobal("QUERY_MODE", toStr("0"));
						return ;
					}
					setGlobal("QUERY_MODE", toStr("0"));
					lvStatus = Goksels.fValidateBankRoutNum(gxvdirdElement.getGxvdirdCodeBankRoutNum());
					if ( lvStatus.equals("N") )
					{
						errorMessage(GNls.Fget(toStr("GXVDIRD-0006"), toStr("FORM"), toStr("*ERROR* Bank Routing Number failed validation.")));
						throw new ApplicationException();
					}
					else if ( lvStatus.equals("W") ) {
						warningMessage(GNls.Fget(toStr("GXVDIRD-0007"), toStr("FORM"), toStr("*WARNING* Bank Routing Number accepted but failed validation. Please verify.")));
					}
					getTask().getGoqrpls().gCheckFailure();
			}


		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXVDIRD_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GXVDIRD_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void gxvdirdActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXVDIRD_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GXVDIRD_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gxvdirdActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GXVDIRD_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GXVDIRD_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void gxvdirdActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
	
	
}

