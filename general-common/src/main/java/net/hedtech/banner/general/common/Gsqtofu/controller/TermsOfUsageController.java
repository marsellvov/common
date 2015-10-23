package net.hedtech.banner.general.common.Gsqtofu.controller;
 
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
import net.hedtech.banner.general.common.Gsqtofu.model.*;
import net.hedtech.banner.general.common.Gsqtofu.*;
import net.hedtech.banner.general.common.Gsqtofu.services.*;
import net.hedtech.banner.general.common.Gsqtofu.services.UnknownTypes;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class TermsOfUsageController extends DefaultBlockController {


	
	public TermsOfUsageController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GsqtofuTask getTask() {
		return (GsqtofuTask)super.getTask();
	}

	public GsqtofuModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER TERMS_OF_USAGE.WHEN-NEW-BLOCK-INSTANCE
		 declare
  lv_default_tofu varchar2(1000) := G$_NLS.GET('GSQTOFU-0000', 'FORM', 'Each time you use or cause access to this web site, '||
  'you agree to be bound by these Terms of use, as amended from time to time with or without '||
  'notice to you. In addition, if you are using a particular service on this web site or accessed '||
  'via this web site, you will be subject to any rules or guidelines applicable to those services, '||
  'and they will be incorporated by reference within these Terms of use. Please read the site''s '||
  'Privacy policy.');

  --lv_text VARCHAR2(32000);
  lv_text long;
  lv_cloblen           PLS_INTEGER;
  lv_clob clob;
  lv_start             PLS_INTEGER := 1;
  lv_len               PLS_INTEGER;
  lv_output            PLS_INTEGER := 8000;
  lv_max               PLS_INTEGER := 32767;

-- For fixed-width n-byte CLOBs, if the input amount for SUBSTR is greater than (32767/n), 
-- then SUBSTR returns a character buffer of length (32767/n), or the length of the CLOB, 
-- whichever is lesser. For CLOBs in a varying-width character set, n is the maximum 
-- byte-width used for characters in the CLOB.
-- Since we use 4 bytes per character, the max returned in 8191 and therefore we must
-- loop thru multiple times to get the full text (up to 32,767)
	
begin
  lv_clob := g$_security.g$_f_get_tofu_text;
  lv_cloblen := DBMS_LOB.getlength (lv_clob);
  
  IF lv_cloblen > lv_max THEN
    lv_cloblen := lv_max;
  END IF;
  
  IF lv_cloblen < 1 THEN
    lv_text := lv_default_tofu;
  ELSE
    lv_text := NULL;
    LOOP
      EXIT WHEN (lv_start + 1) > lv_cloblen;
      lv_len := lv_output;
      IF lv_start + lv_output > lv_cloblen THEN
        lv_len := lv_cloblen - lv_start;
      END IF;
      IF lv_start + lv_len = lv_cloblen THEN
        lv_len := lv_len + 1;
      END IF;
      lv_text := lv_text || DBMS_LOB.SUBSTR (lv_clob, lv_len, lv_start);
      lv_start := lv_start + lv_len;
    END LOOP;
  END IF;
	:gubiprf_tofu_text := lv_text;

-- Reset all the menus - keys disabled in triggers and KEY-OTHERS 

  RESET_MENU('Main.Action'           );
  RESET_MENU('Main.Block'            );
  RESET_MENU('Main.Edit'             );
  RESET_MENU('Main.Field'            );
  RESET_MENU('Main.Help'             );
  RESET_MENU('Main.Icons'            );
  RESET_MENU('Main.Options'          );
  RESET_MENU('Main.Query'            );
  RESET_MENU('Main.Record'           );
  RESET_MENU('Main.Tools'            );
  RESET_MENU('Main.Window'           );
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TERMS_OF_USAGE.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void termsOfUsage_blockChange()
		{
			
				{
					NString lvDefaultTofu = GNls.Fget(toStr("GSQTOFU-0000"), toStr("FORM"), toStr("Each time you use or cause access to this web site, ").append("you agree to be bound by these Terms of use, as amended from time to time with or without ").append("notice to you. In addition, if you are using a particular service on this web site or accessed ").append("via this web site, you will be subject to any rules or guidelines applicable to those services, ").append("and they will be incorporated by reference within these Terms of use. Please read the site's ").append("Privacy policy."));
					// lv_text VARCHAR2(32000);
					NString lvText= NString.getNull();
					NInteger lvCloblen= NInteger.getNull();
					UnknownTypes.Clob lvClob= null;
					NInteger lvStart = toInt(1);
					NInteger lvLen= NInteger.getNull();
					NInteger lvOutput = toInt(8000);
					NInteger lvMax = toInt(32767);
					//TODO
//					lvClob = GSecurity.gFGetTofuText();
//					lvCloblen = DbmsLob.getlength(lvClob);
					if ( lvCloblen.greater(lvMax) )
					{
						lvCloblen = lvMax;
					}
					if ( lvCloblen.lesser(1) )
					{
						lvText = lvDefaultTofu;
					}
					else {
						lvText = toStr(null);
						while (true) {
							if ( (lvStart.add(1)).greater(lvCloblen) ) 
								break;
							lvLen = lvOutput;
							if ( lvStart.add(lvOutput).greater(lvCloblen) )
							{
								lvLen = lvCloblen.subtract(lvStart);
							}
							if ( lvStart.add(lvLen).equals(lvCloblen) )
							{
								lvLen = lvLen.add(1);
							}
							lvText = lvText.append(substring(toStr(lvClob.toString()), lvLen, lvStart));
							lvStart = lvStart.add(lvLen);
						}
					}
					getFormModel().getTermsOfUsage().setGubiprfTofuText(lvText);
					//  Reset all the menus - keys disabled in triggers and KEY-OTHERS 
					this.getTask().getServices().resetMenu(toStr("Main.Action"));
					this.getTask().getServices().resetMenu(toStr("Main.Block"));
					this.getTask().getServices().resetMenu(toStr("Main.Edit"));
					this.getTask().getServices().resetMenu(toStr("Main.Field"));
					this.getTask().getServices().resetMenu(toStr("Main.Help"));
					this.getTask().getServices().resetMenu(toStr("Main.Icons"));
					this.getTask().getServices().resetMenu(toStr("Main.Options"));
					this.getTask().getServices().resetMenu(toStr("Main.Query"));
					this.getTask().getServices().resetMenu(toStr("Main.Record"));
					this.getTask().getServices().resetMenu(toStr("Main.Tools"));
					this.getTask().getServices().resetMenu(toStr("Main.Window"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TERMS_OF_USAGE.KEY-OTHERS
		 raise form_trigger_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TERMS_OF_USAGE.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS")
		public void termsOfUsage_KeyOthers()
		{
			
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER TERMS_OF_USAGE.KEY-CLRFRM
		 raise form_trigger_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TERMS_OF_USAGE.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void termsOfUsage_ClearTask()
		{
			
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER TERMS_OF_USAGE.KEY-MENU
		 raise form_trigger_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TERMS_OF_USAGE.KEY-MENU
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-MENU")
		public void termsOfUsage_KeyMenu()
		{
			
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER TERMS_OF_USAGE.KEY-PRINT
		 raise form_trigger_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TERMS_OF_USAGE.KEY-PRINT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRINT")
		public void termsOfUsage_KeyPrint()
		{
			
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER TERMS_OF_USAGE.KEY-NXTKEY
		 raise form_trigger_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TERMS_OF_USAGE.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void termsOfUsage_KeyNxtkey()
		{
			
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER TERMS_OF_USAGE.KEY-EXIT
		 raise form_trigger_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TERMS_OF_USAGE.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void termsOfUsage_Exit()
		{
			
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER ACCEPT_BTN.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ACCEPT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ACCEPT_BTN")
		public void acceptBtn_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER ACCEPT_BTN.WHEN-BUTTON-PRESSED
		 begin
  :global.tofu_ok := 'Y';
  update gurlogn
     set gurlogn_last_tofu_date = sysdate
   where gurlogn_user = user;
  gb_common.p_commit;
  G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM ;
  G$_CHECK_FAILURE ;
  
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ACCEPT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ACCEPT_BTN")
		public void acceptBtn_buttonClick()
		{
			
				int rowCount = 0;
				setGlobal("TOFU_OK", toStr("Y"));
				String sql1 = "UPDATE gurlogn " +
	"SET gurlogn_last_tofu_date = sysdate " +
	" WHERE gurlogn_user = user";
				DataCommand command1 = new DataCommand(sql1);
				rowCount = command1.execute();
				//TODO
//				GbCommon.pCommit();
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER REJECT_BTN.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * REJECT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="REJECT_BTN")
		public void rejectBtn_click()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER REJECT_BTN.WHEN-BUTTON-PRESSED
		 begin
   :global.tofu_ok := 'N';
   g$_security.g$_audit_banner_logoff(G$_NLS.Get('GSQTOFU-0001', 'FORM','Logon denied due to Terms of Usage not accepted'));
   G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM ;
   G$_CHECK_FAILURE ;

end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * REJECT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="REJECT_BTN")
		public void rejectBtn_buttonClick()
		{
			
				setGlobal("TOFU_OK", toStr("N"));
				GSecurity.gAuditBannerLogoff(GNls.Fget(toStr("GSQTOFU-0001"), toStr("FORM"), toStr("Logon denied due to Terms of Usage not accepted")));
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}

		
	
	
}

