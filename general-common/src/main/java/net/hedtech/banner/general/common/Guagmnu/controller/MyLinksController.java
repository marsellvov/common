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

public class MyLinksController extends DefaultBlockController {


	
	public MyLinksController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER MY_LINKS.KEY-NXTBLK
		 GO_BLOCK('KEY_BLOCK');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MY_LINKS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void myLinks_NextBlock()
		{
			
				goBlock(toStr("KEY_BLOCK"));
			}

		
		/* Original PL/SQL code code for TRIGGER URL_SITEMAP.WHEN-BUTTON-PRESSED
		 BEGIN
--
-- If user is on Site Map, refresh Site Map, otherwise simply navigate to Site Map.
--
  IF GET_VIEW_PROPERTY('SITEMAP',VISIBLE) = 'TRUE' THEN
    EXECUTE_TRIGGER('REFRESH_SITEMAP');
  ELSE
  	HIDE_VIEW('TREE_CANVAS');
    EXECUTE_TRIGGER('REFRESH_SITEMAP');
    GO_BLOCK('SITE_MAP1');
  	SHOW_VIEW('SITEMAP');
  END IF;
--
  GO_ITEM('KEY_BLOCK.NEXT_SELECTION');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_SITEMAP.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_SITEMAP")
		public void urlSitemap_buttonClick()
		{
			
				// 
				//  If user is on Site Map, refresh Site Map, otherwise simply navigate to Site Map.
				// 
				if ( getViewVisible("SITEMAP").equals("TRUE") )
				{
					executeAction("REFRESH_SITEMAP");
				}
				else {
					hideView("TREE_CANVAS");
					executeAction("REFRESH_SITEMAP");
					goBlock(toStr("SITE_MAP1"));
					showView("SITEMAP");
				}
				// 
				goItem(toStr("KEY_BLOCK.NEXT_SELECTION"));
			}

		
		/* Original PL/SQL code code for TRIGGER URL_HELP.WHEN-BUTTON-PRESSED
		 DECLARE
  BXS_IND             VARCHAR2(1) := 'N';
	HELP_OH             VARCHAR2(10) := 'main';
	HELP_DIR            VARCHAR2(100) := G$_GET_UPRF_WEBHLP;
	HELP_LINK           VARCHAR2(200);
	PRODUCTS_INSTALLED  VARCHAR2(200);
BEGIN
  IF gokimag.f_is_bxs_installed THEN
  	BXS_IND := 'Y';
  END IF;
  PRODUCTS_INSTALLED := '&studentInd='||:GLOBAL.STUSYS||'&alumniInd='||:GLOBAL.ALUSYS||
  	                    '&arsysInd='||:GLOBAL.BILCSH||'&financeInd='||:GLOBAL.FINSYS||
  	                    '&finaidInd='||:GLOBAL.RESSYS||'&payrollInd='||:GLOBAL.HRESYS||
  	                    '&bxsInd='||BXS_IND||'&generalInd='||'Y';
--
  HELP_LINK := HELP_DIR || '?productName=' || HELP_OH || PRODUCTS_INSTALLED;
  WEB.SHOW_DOCUMENT(HELP_LINK,'SCTBANNER');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_HELP.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_HELP")
		public void urlHelp_buttonClick()
		{
			
				{
					NString bxsInd = toStr("N");
					NString helpOh = toStr("main");
					NString helpDir = getTask().getGoqrpls().gGetUprfWebhlp();
					NString helpLink= NString.getNull();
					NString productsInstalled= NString.getNull();
					if ( Gokimag.fIsBxsInstalled().getValue() )
					{
						bxsInd = toStr("Y");
					}
					productsInstalled = toStr("&studentInd=").append(getGlobal("STUSYS")).append("&alumniInd=").append(getGlobal("ALUSYS")).append("&arsysInd=").append(getGlobal("BILCSH")).append("&financeInd=").append(getGlobal("FINSYS")).append("&finaidInd=").append(getGlobal("RESSYS")).append("&payrollInd=").append(getGlobal("HRESYS")).append("&bxsInd=").append(bxsInd).append("&generalInd=").append("Y");
					// 
					helpLink = helpDir.append("?productName=").append(helpOh).append(productsInstalled);
					showDocument(helpLink, "SCTBANNER");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER URL_PASSWORD.WHEN-BUTTON-PRESSED
		 DO_FORM_CALL('GUAPSWD');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_PASSWORD.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_PASSWORD")
		public void urlPassword_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				MessagesAdapter messagesElement = (MessagesAdapter)this.getFormModel().getMessages().getRowAdapter(true);


				this.getTask().getServices().doFormCall(messagesElement, toStr("GUAPSWD"));
			}

		
		/* Original PL/SQL code code for TRIGGER URL_MESSAGES.WHEN-BUTTON-PRESSED
		 DO_FORM_CALL('GUAMESG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_MESSAGES.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_MESSAGES")
		public void urlMessages_buttonClick()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				MessagesAdapter messagesElement = (MessagesAdapter)this.getFormModel().getMessages().getRowAdapter(true);


				this.getTask().getServices().doFormCall(messagesElement, toStr("GUAMESG"));
			}

		
		/* Original PL/SQL code code for TRIGGER URL_PREF1.WHEN-BUTTON-PRESSED
		 INVOKE_LINK(G$_GET_UPRF_LINKS_PROG1);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_PREF1.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_PREF1")
		public void urlPref1_buttonClick()
		{
			
				this.getTask().getServices().invokeLink(this.getTask().getServices().gGetUprfLinksProg1());
			}

		
		/* Original PL/SQL code code for TRIGGER URL_PREF2.WHEN-BUTTON-PRESSED
		 INVOKE_LINK(G$_GET_UPRF_LINKS_PROG2);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_PREF2.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_PREF2")
		public void urlPref2_buttonClick()
		{
			
				this.getTask().getServices().invokeLink(getTask().getGoqrpls().gGetUprfLinksProg2());
			}

		
		/* Original PL/SQL code code for TRIGGER URL_PREF3.WHEN-BUTTON-PRESSED
		 INVOKE_LINK(G$_GET_UPRF_LINKS_PROG3);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_PREF3.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_PREF3")
		public void urlPref3_buttonClick()
		{
			
				this.getTask().getServices().invokeLink(getTask().getGoqrpls().gGetUprfLinksProg3());
			}

		
		/* Original PL/SQL code code for TRIGGER URL_PREF4.WHEN-BUTTON-PRESSED
		 INVOKE_LINK(G$_GET_UPRF_LINKS_PROG4);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_PREF4.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_PREF4")
		public void urlPref4_buttonClick()
		{
			
				this.getTask().getServices().invokeLink(getTask().getGoqrpls().gGetUprfLinksProg4());
			}

		
		/* Original PL/SQL code code for TRIGGER URL_PREF5.WHEN-BUTTON-PRESSED
		 INVOKE_LINK(G$_GET_UPRF_LINKS_PROG5);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_PREF5.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_PREF5")
		public void urlPref5_buttonClick()
		{
			
				this.getTask().getServices().invokeLink(getTask().getGoqrpls().gGetUprfLinksProg5());
			}

		
		/* Original PL/SQL code code for TRIGGER URL_PREF6.WHEN-BUTTON-PRESSED
		 INVOKE_LINK(G$_GET_UPRF_LINKS_PROG6);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_PREF6.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_PREF6")
		public void urlPref6_buttonClick()
		{
			
				this.getTask().getServices().invokeLink(getTask().getGoqrpls().gGetUprfLinksProg6());
			}

		
		/* Original PL/SQL code code for TRIGGER URL_MY_INST.WHEN-BUTTON-PRESSED
		 WEB.SHOW_DOCUMENT(G$_GET_UPRF_LINKS_MY_INST,'_blank');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_MY_INST.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_MY_INST")
		public void urlMyInst_buttonClick()
		{
			
				showDocument(getTask().getGoqrpls().gGetUprfLinksMyInst(), "_blank");
			}

		
	
	
}

