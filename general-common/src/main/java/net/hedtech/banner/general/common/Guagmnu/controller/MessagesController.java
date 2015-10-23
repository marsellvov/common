package net.hedtech.banner.general.common.Guagmnu.controller;
 
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

import net.hedtech.banner.general.common.Guagmnu.model.*;
import net.hedtech.banner.general.common.Guagmnu.*;
import net.hedtech.banner.general.common.Guagmnu.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class MessagesController extends DefaultBlockController {


	
	public MessagesController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuagmnuTask getTask() {
		return (GuagmnuTask)super.getTask();
	}

	public GuagmnuModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER MESSAGES.PRE-BLOCK
		 --SET_BLOCK_PROPERTY('MESSAGES',CURRENT_RECORD_ATTRIBUTE,'G$_NVA_HIGHLITE_TEXT');
null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MESSAGES.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void messages_blockIn()
		{
			
				// SET_BLOCK_PROPERTY('MESSAGES',CURRENT_RECORD_ATTRIBUTE,'G$_NVA_HIGHLITE_TEXT');
				// SET_BLOCK_PROPERTY('MESSAGES',CURRENT_RECORD_ATTRIBUTE,'G$_NVA_HIGHLITE_TEXT');
			}

		
		/* Original PL/SQL code code for TRIGGER MESSAGES.POST-BLOCK
		 --SET_BLOCK_PROPERTY('MESSAGES',CURRENT_RECORD_ATTRIBUTE,'');
null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MESSAGES.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void messages_blockOut()
		{
			
				// SET_BLOCK_PROPERTY('MESSAGES',CURRENT_RECORD_ATTRIBUTE,'');
				// SET_BLOCK_PROPERTY('MESSAGES',CURRENT_RECORD_ATTRIBUTE,'');
			}

		
		/* Original PL/SQL code code for TRIGGER MESSAGES.KEY-NXTBLK
		 GO_BLOCK('KEY_BLOCK');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MESSAGES.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void messages_NextBlock()
		{
			
				goBlock(toStr("KEY_BLOCK"));
			}

		
		/* Original PL/SQL code code for TRIGGER MESSAGES.KEY-PRVBLK
		 IF GET_VIEW_PROPERTY('SITEMAP',VISIBLE) = 'TRUE' THEN
  GO_BLOCK('SITE_MAP4');
ELSE
  GO_BLOCK('TREE');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MESSAGES.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void messages_PreviousBlock()
		{
			
				if ( getViewVisible("SITEMAP").equals("TRUE") )
				{
					goBlock(toStr("SITE_MAP4"));
				}
				else {
					goBlock(toStr("TREE"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_COMMENT.WHEN-MOUSE-DOUBLECLICK
		 EDIT_TEXTITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_COMMENT.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GURTKLR_COMMENT")
		public void gurtklrComment_doubleClick()
		{
			
				// F2J_NOT_SUPPORTED : Call to built-in "EDIT_TEXTITEM" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
				//				SupportClasses.FORMS40.EditTextitem();
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'EDIT_TEXTITEM' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GUAGMNUF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
				
				
			}

		
	
	
}

