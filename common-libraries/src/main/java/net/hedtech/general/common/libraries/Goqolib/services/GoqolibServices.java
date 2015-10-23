package net.hedtech.general.common.libraries.Goqolib.services;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;

import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
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
import net.hedtech.general.common.libraries.Goqolib.*;
import net.hedtech.general.common.libraries.Goqolib.model.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqgmnu.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;



public class GoqolibServices extends AbstractSupportCodeObject{
	
	
	public GoqolibServices(ISupportCodeContainer container) {
		super(container);
	}
	
	
	@Override
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart)super.getContainer();
	}
	
	public net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel getFormModel() {
		return getContainer().getModel();
	}

	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0
	
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
AUDIT TRAIL: 3.0
1. TAM 05/14/97
   Increased the gtvprnt_code length from 10 to 30 in the LOV
   and Record Group.
2. RLH 05/23/97
   Copied stvhond lov and stvhond rg from soqolib.fmb. 
   Stvhond is now common.
3. SJQ 05/28/97
   Change color of highlight named visual attribute.
   Add a null mouse-doubleclick to the option block.
4. SJQ 06/10/97
   Modify all keys which are invalid to have the show on menu
   option set to false.  Also set highligt named visual attribute
   to have black foreground color.
5. SJQ 06/11/97
   Modify toolbar logic to hide the bubble help immediately when
   the button is pressed prior to any other logic.  Also modify
   graphing button to verify that the current form isn't the
   graphing form so that you can't have more than one copy open.
6. SJQ 06/17/97
   Modify KEY-CLRFRM to remove any block navigation logic as this
   was to be removed with the 2.1 conversion and appears to cause
   problems on the MAC.  Also removed a text item from the toolbar
   and modified some of the navigational attributes for a few of
   the buttons.
7. SJQ 06/24/97
   Modify post and pre-block triggers to fire in either before or
   after mode.  Modify internal sequence number of the G$_TOOLBAR
   block to fix MAC problems.
8. SJQ 06/25/97
   Clean up and correct logic in toolbar for the electronic 
   documentation.
9. SJQ 06/27/97
   Change color on the RADIO GROUP and CHECK BOX named visual 
   attribute back to white.

AUDIT TRAIL: 3.1
1. Added Record Groups and LOV's for use as referenced items for
   Value-Based Security forms.                        TJH 01/26/98
2. Added STVTESC_RG and STVTESC_LOV to form.          TJH 03/04/98
3. Modified the following Record Groups and LOV's to select
   individual items:                                  TJH 03/07/98

        STVACTC_RG               STVACTC_LOV
        STVATYP_RG               STVATYP_LOV
        STVCITZ_RG               STVCITZ_LOV
        STVMAJR_RG               STVMAJR_LOV
        STVMEDI_RG               STVMEDI_LOV
        STVSBGI_RG               STVSBGI_LOV
        STVVTYP_RG               STVVTYP_LOV
4. SJQ 03/13/98
   Modify LOV's to have the appropriate attributes.
5. RLH 04/23/98
   Modified RG's adding a date format mask to all 
   dates ('DD-MON-YYYY'). Modified LOV's where 
   necessary to show the entire date.
6. SJQ 04/24/98
   Modify security routines to fix form count problem.
7. RLH 05/03/98
   Add stvasty_lov and _rg.  Made common for payroll.
8. RLH 06/11/98
   Changed ftvrucl_regd,ftvprog_regd,ftvatyp_regd and
   ftvrucl_lovd to display a 4 postion year.

AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1722
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail30 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_2_0
	
	PROCEDURE AUDIT_TRAIL_2_0 IS
<multilinecomment>
AUDIT TRAIL: 2.1.5                                INIT  DATE
1. Add new security logic.                         SQ 09/29/95

AUDIT TRAIL: 2.1.11
1. Make compatible with 40 version.  Added         SQ 08/28/96
   new GTVNTYP lov and rg.
2. Modify various routines, rg's, and lov's        SQ 09/03/96
   to handle 7 or 8 character table and block names,
   along with making the sysi_code 2 characters.
3. Modify KEY-MENU back to null.  This was done    SQ 10/18/96
   since the options lov is no longer used.
4. Add mouse-double-click logic.                   SQ 10/18/96
5. Added STVCOMF_LOV, STVCOMF_RG, STVCOMT_LOV,     RH 11/14/96
   STVCOMT_RG, STVCOMS_LOV and STVCOMS_RG for HR
   Faculty Administration enhancement.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1723
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail20()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail20 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0
1.  SJQ 03/16/98
    Clean up code.
2.  JC  6/30/98
    Deleted blocks: 
      CP$_BLOCK,LAST_QUERY
    Blocks did not have any triggers and were used just in
    AOQOLIB,FOQOLIB,TOQLIB as copy.
      POP$_BLOCK,VALIDATION$_BLOCK
    All triggers that existed in POP$_BLOCK,VALIDATION$_BLOCK
    were moved to G$_INQ_FORM_CLASS,G$_VAL_FORM_CLASS
    property classes.
    Deleted canvases:
      PAGE1,PAGE2
3.  SJQ 07/15/98
    Redo the LOV's since they had the wrong coordinate sizing.
4.  JC 08/12/98
    Changes G$_FORM_CLASS property class. Added trigger KEY-PRINT.
5.  JC 10/08/98
    Added triggers When_Mouse_Enter, WHen_Mouse_Leave for bubble help
    to G$_ICON_BTN_CLASS.
6.  SJQ 12/01/98
    Add new DISPLAY_B2K_HELP_TRG to the G$_FORM_CLASS.  This will be called
    to display the new context sensitive win help.
7.  SJQ 12/10/98
    Add G$_CHECK_FAILURE to all of the triggers.
8.  SJQ 12/12/98
    Add new KEY-EXIT and KEY_EXIT_TRG to G$_FORM_CLASS.  Added new G$_KEY_EXIT_ALERT
    alert to be used with the modified KEY-EXIT.  Added new alert to the 
    G$_VALIDATION_FORM, G$_APPLICATION_FORM, G$_INQUIRY_FORM object groups.  This
    was done to address the failure of the POST-FORM firing if an error occurs during
    the exit logic.
9.  SJQ 12/14/98
    Modify the G$_DATE_CLASS to include the KEY-NEXT-ITEM trigger.
10. SJQ 12/15/98
    Modify all of the named visual attributes which where Arial Narrow 10 to a 
    smaller point size of 8.
11. SJQ 12/17/98
    Modify all of the named visual attributes which where Arial Narrow 8 to be
    MS Sans Serif 9.
12. SJQ 12/17/98
    Removed the G$_TBBBANK_LOVD and G$_TBBBANK_RGD.
13. SJQ 12/21/98
    Applied the G$_NVA_BUTTON_ITEM to all of the buttons on the toolbars.  Added a null 
    GLOBAL_COPY routine to the G$_FORM_CLASS.
14. SJQ 01/04/99
    Removed the call to G$_SET_WIN_PROPERTY from the WHEN-NEW-FORM-INSTANCE trigger
    in the G$_FORM_CLASS property class.  This routine is not needed (for character 
    mode).
15. SJQ 01/04/99
    Created a KEY-CLRFRM trigger in the G$_FORM_CLASS with logic to support 
    global copy, save keys, execute trigger, and disable/enable keys.  Removed 
    the KEY-CLRFRM from the other classes.  Added ENABLE_KEYS and DISABLE_KEYS to 
    the G$_FORM_CLASS property class.
16. SJQ 01/05/99
    New version of the FUNC_BASE_CANVAS canvas for defects correction.
17. SJQ 01/06/99
    Removed the KEY-NXTBLK and KEY-PRVBLK triggers from all form property classes
    and added them to the G$_FORM_CLASS so that all forms receive the new keys.
    Added a KEY-CLRFRM trigger with an invalid function message to the G$_INQ_FORM_CLASS.
    Modify the G$_EXTENDED_SEARCH_WINDOW to turn off the closeable and zoomable
    properties.  Modify the WHEN-NEW-ITEM-INSTANCE and POST-TEXT-ITEM triggers in 
   THEN G$_DATE_CLASS to not fire in ENTER QUERY mode.
18. SJQ 01/07/99
    Added conditional logic to all of the triggers in the toolbars so that the logic
    which is windows specific will only fire when running under windows.
19. SJQ 01/07/99
    Added MENU_TYPE_OG and CANVASES_OG object groups for use by the main menu form.
    These are used by the GUAGMNU, GUAUPRF, GUTGMNU, GUAPMNU and GUTPMNU.  Added a
    date format mask to the G$_DATE_CLASS property class.
20. SJQ 01/11/99
    Added trace routine calls to the G$_VERIFY_ACCESS and G$_REVOKE_ACCESS triggers.
21. SJQ 01/14/99
    Modify the message on the G$_EXIT_FORM_ALERT.
22. SJQ 01/20/99
    Add new when_window_activated_trg and the execution of this trigger from the
    when-window-activated.  Added the navigation test to the when-window-activated to
    attempt to address the window activiation problem.  Modify the buttons in the 
    toolbars to turn off mouse navigable.
23. SJQ 01/21/99
    Added new alert for close windows.  This will be displayed if there were changes
    pending and the user tries to exit.  If the save changes fails, this alert is 
    displayed asking whether to close form or not.  Added the new alert to the three
    different form type object groups.  Installed changes to the GXVBANK_LOV and 
    GXVBANK_RG.  Added updated query with where clause to the GTVCURR_RG.
24. SJQ 01/22/99
    Remove all windows from all object groups for web enabling problems.
25. SJQ 01/25/99
    Modified the GXVBANK_LOV to put back the missing record group.
26. SJQ 01/29/99
    Applied the G$_NVA_LOV to the STVTESC_LOV and STVASTY_LOV.
27. SJQ 02/01/99
    Applied the G$_NVA_TEXT_ITEM to the items in the G$_FUNC_BASE_INFO_BLOCK items.
28. SJQ 02/02/99
    Increased the size of the verticle navigation frame so that it doesn't end prior
    to the mdi window if the window is maximized on a higher resolution.
29. SJQ 02/09/99
    Remove all references to "<banicon.dll>" for all iconic buttons.  Added the 
    G$_PIPE_MESSAGE_ALERT to all three form object groups for use with the new message
    alert logic.  Added a conditional call to G$_DO_NEW_MESSAGES_EXIST to the 
    WHEN-NEW-BLOCK-INSTANCE trigger in the G$_FORM_CLASS routine.  This will be executed
    to determine whether a new message has been received upon entering a form and will
    alert the user if one does exist.
30. SJQ 02/15/99
    Created three parameters to be referenced into all forms for use with the toolbar.
    Modified the toolbar blocks to remove the unneeded buttons and icon names from all
    buttons.  Added the three parameters to the three different form object groups.
31. SJQ 05/24/99
    Modify the properties of the G$_OPT_WINDOW for webforms.  Don't want the modal
    window to have these properties: inherit menu, closeable, iconifiable, and 
    zoomable.
32. MVS 06/03/1999
    Attached the Workflow library GOQWFLW and, in the G$_FORM_CLASS property class, added
    the trigger G$_WF_BUTTON_PRESSED_TRG and modified the PRE-FORM, WHEN-NEW-BLOCK-INSTANCE,
    WHEN-TIMER-EXPIRED, KEY-CLRFRM and POST-FORM triggers to control the behavior
    of forms which have been invoked as part of a Workflow activity.  If Workflow
    is not installed or is not enabled at a client site, these triggers will not
    perform any Workflow function.
33. SJQ 06/04/99
    Modify the title on the GXVBANK_LOV to remove name of the table.
AUDIT TRAIL: 4.0.1
1. NMCKINNE 07/22/99 Added RG and LOV for oracle view all_users.
   Named ALL_USERS_RG and  ALL_USERS_LOV.   
AUDIT TRAIL: 4.1
1. NMCKINNE 07/22/99 Added the following RG's and LOV's:
   GTVEQTS, GTVEQNM, GTVEQPG, GTVEQPM - These are for the Event Queue forms.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1724
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail40 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. SJQ  04/01/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1725
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40B2k()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail40B2k procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0
	
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1.  FHL 05/18/2000
    Changed color in visual attribute G$_NVA_HIGHLITE_TEXT 
    from r55g70b85 (a shade of blue) 
    to r100g100b70 (a shade of yellow). 
2.  TGK 06/02/2000
    Modifed block G$_VERTICAL_TOOLBAR attributes: Database Data Block, change from YES
		to NO; Query Data Source Type, change from Table to None; Query Data Source Name,
		change from GUROPTM to null; Reinherit the property on Query Data Source Name.
		Changed the primary canvas attribute for G$_OPT_WINDOW from null to G$_OPT_CANVAS.
		Changed the primary canvas attribute for G$_EXTENDED_SEARCH_WINDOW from null to
		G$_EXTENDED_SEARCH_CANVAS.
		Changed the primary canvas attribute for FUNC_BASE_WINDOW from null to 
		FUNC_BASE_CANVAS.
		Modified the G$_HORIZONTAL_CANVAS, G$_VERTICAL_CANVAS, TEMP_CANVAS to set the
		primary window attribute to MAIN_WINDOW
3.  SJQ 06/20/2000
    Modify the G$_VERIFY_ROUTINE to add a test of the internal module name with
    the external file name.  If not the same, call the security routine to log
    this exception and then raise an error with message.
4.  SJQ 06/22/2000
    Modify all triggers which had references to the G$_TRACE_PKG to remove this 
    logic.  This trace is no long needed due to enhancements with the Oracle 
    Developer toolset and FRD.
5.  SJQ 08/25/2000
    Modify the G$_VERIFY_ROUTINE to test if the external module name includes an
    extension (fmx).  If so, remove the extension.
6.  SJQ 09/08/2000
    Removed all references to the G$_CURSORSET routine.  Not used.
7.  SJQ 10/11/2000
    Changed the titles on the alerts to changes Banner2000 to SCT Banner.
8.  SJQ 10/17/2000
    Changed the attributes on the KEY-MENU trigger in the G$_FORM_CLASS so that it
    doesn't display in the keyboard help.  This is entry which shows up as block-menu.
9.  DRM 11-10-2000
    Adding new trigger G$_IMG_BUTTON_PRESSED_TRG to Property Class
    G$_FORM_CLASS.  This trigger is invoked by pressing the Banner(r)
    XtenderSolutions(tm) toolbar icon (or choosing File/Banner XtenderSolutions
    from menu GUMAPPL), and uses data from database
    field GURTPRF_TLB_BTN, which contains the arguments for toolbar
    icons.  This new trigger will, in turn, invoke a new Banner
    XtenderSolutions-related database package GOKIMAG.
    --
    Also added new alert G$_EXTEND_SOLUT_ALERT to Object Group G$_TOOLBAR.
    This alert will be used for UI purposes when reporting back any
    messages from called code executed after the Banner XtenderSolutions
    button is pressed.
10. SJQ 12/08/2000
    Add a G$_GENERAL_EDITOR object.  Not added to any object group but is being
    created so it can be referenced into a few forms for a temporary fix.
11. DRM 12-12-2000
    Adding a second Alert (G$_EXTEND_SOLUT_2_ALERT) to Object Group G$_TOOLBAR.
    This alert is a three-button model for future usage with the Banner(r)
    XtenderSolutions(tm) product.
    --
    Also, modifying trigger G$_IMG_BUTTON_PRESSED_TRG to strictly call
    a new package in library GOQRPLS.  This makes the code more likely to
    need zero changes when Banner sites procure the Banner XtenderSolutions
    product at a post-5.0 version of the General product.
    --
    Also, modifying the name of the new product from "Extender Solutions"
    to "Banner(r) XtenderSolutions(tm)".
12. GShalovka  28 Dec 2000
    Add new Object Group:G$_HIGHLITE_FIXED_RECORD.
    Add two new Visual Attributes:G$_NVA_FIXED_TEXT_ITEM, G$_NVA_HIGHLITE_FIXED_TEXT.
    These items will be referenced in to forms where display text should be in 
    non-proporitonal font. Without this change text was skewed and did not appear properly.
13. TGKinderman 23-JAN-2001
    Corrected property classes G$_DATE_CLASS, G$_ID_CLASS, G$_NAME_CLASS and
    G$_PLDOWN_LIST_CLASS relative to the properties brought in from the indicated visual
    attribute (reapply the visual attribute within each of the classes being corrected).
    Net change to classes:
    G$_DATE_CLASS-Font Size of 8 corrected to be 9; G$_ID_CLASS-Font Name of "Courier New"
    corrected to be "MS Sans Serif"G$_NAME_CLASS-Font Name of "Courier New" corrected to
    be "MS Sans Serif"; G$_PLDOWN_LIST_CLASS-Font Weight of Medium corrected to be Demilight.
    
AUDIT TRAIL: 5.2
1. GShalovka	30-Mar-2001
   Defect 59452
   Problem: Property class G$_CODE_CLASS Maximum Length property of 30
            did not convert properly from the 4.x version of GOQOLIB.  
   Impact: Forms or items referencing 5.0 version of Property Class G$_CODE_CLASS 
           from GOQOLIB will not allow entry of partial description of a length greater than 
           max length when using description portion of the code/description functionality that 
           was originally baselined with 4.0.
   Solution: Correct Property Class G$_CODE_CLASS property Maximum Length
             to be inheritable.
2. WG  05/10/01
   Added G$_ATVGIFT_RGD and _LOVD.  Added G$_TBBDETC_RGD and _LOVD.
   Added GTVCCRD_RG and _LOV, GTVPROC_RG and _LOV.
   
AUDIT TRAIL: 5.3
1. DRM 08-06-2001
   In Property Class G$_FORM_CLASS, modified trigger G$_IMG_BUTTON_PRESSED_TRG to
   invoke g$_img_driver.p_img_execute_v53 (in GOQRPLS.pll).  Pre-5.3 version(s) of
   G$_IMG_BUTTON_PRESSED_TRG invoked g$_img_driver.p_img_execute, which still exists
   to provide backward compatability all the way back to General 5.0.
--
   In Object Group G$_TOOLBAR, the G$_HORIZONTAL_TOOLBAR and G$_VERTICAL_TOOLBAR blocks
   now have an additional built-in trigger WHEN-MOUSE-CLICK.  This trigger is where all
   BXS-related code begins relative to all BXS-related mouse events (trigger
   G$_IMG_BUTTON_PRESSED_TRG is retained for backward compatibility but is no longer
   functional in forms compiled with General 5.3 objects).

AUDIT TRAIL: 5.4
1.  SJQ 10/10/2001
    Modifications to remove any references to the G$_HINT and G$_HINT_TEXT_ITEM package.
    All triggers, object groups and property classes which had calls to this routine were
    modified to no longer call these routines.  If the trigger contained no other logic, 
    a NULL command was inserted.  Since these objects have been referenced into other
    forms, removing the triggers would not have been propagated into the forms simply by
    regenerating.  They would have needed to be dropped and referenced again.  Modified
    objects:  EXTENDED_SEARCH_BLOCK - WHEN-BUTTON-PRESSED;  G$_ICON_BTN_CLASS - 
    WHEN-MOUSE-CLICK, WHEN-MOUSE-ENTER, WHEN-MOUSE-LEAVE; G$_HORIZONTAL_TOOLBAR -
    WHEM-MOUSE-ENTER, WHEN-MOUSE-LEAVE; G$_VERTICAL_TOOLBAR - WHEN-MOUSE-ENTER,
    WHEN-MOUSE-LEAVE; CONTROL_BTN_CLASS - WHEN-MOUSE-LEAVE, WHEN-MOUSE-ENTER;
    GUBOBJS_TYPE - WHEN-MOUSE-CLICK, WHEN-MOUSE-ENTER, WHEN-MOUSE-LEAVE.
2.  WG 11/01/2001
    Enhancements for QuickStart Project. Added three new columns to STVHLDD_RG and 
    STVHLDD_LOV for web processing.
3.  SJQ 01/06/2001
    Modify the SCROLL_CANVAS and SCRL_SUB_CANVAS to adjust height and y position.  They were
    off by one and didn't display completely on the forms.  These are used only by the menu
    maintenance forms.
4.  SJQ 01/09/2002
    Modify the attributes of the QK_MENU block to set the base table name and change
    the where clause.  These settings were lost as part of the conversion.
5.  SJQ 01/12/2002
    Modify some of the settings of the GUBOBJS_BLOCK to reinherit attributes which seem
    to have been corrupted.
    
AUDIT TRAIL: 5.5
1.  SJQ 05/24/2002
    Added four new record groups/lovs GTVCELG_LOV/GTVCELG_RG, GTVDOCM_LOV/GTVDOCM_RG,
    GTVSRCE_LOV/GTVSRCE_RG and GTVVISS_LOV/GTVVISS_RG.  These were local in the GUAINTL
    form which was released earlier.
    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:1726
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail50 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>
AUDIT TRAIL: 6.0
1.  Added 3 new record groups and lovs to support Open        PJL 08/19/2002
    Learning Registrations Mods. GTVMTYP_RG, GTVMTYP_LOV,
    GTVDUNT_RG, GTVDUNT_LOV, GTVINSM_RG, GTVINSM_LOV.
2.  Added 10 new property classes to support Student Expanded TGKinderman 09/24/2002
    Credit Hours and GPA.
    G$_CREDITS_CRSE_CLASS, G$_CREDITS_TERM_CLASS,
    G$_CREDITS_SUM_CLASS, G$_POINTS_CRSE_CLASS, 
    G$_POINTS_TERM_CLASS, G$_POINTS_SUM_CLASS,
    G$_GPA_TERM_CLASS, G$_GPA_SUM_CLASS,
    G$_GRADE_CODE_CLASS, G$_GRADE_NUM_CLASS
3. HCheng  11/01/2002
   Defect# 70947
   Problem: SSN field not work properly in Extended Search block.
   Solution: Removed calling routine G$_DATE_WHEN_NEW_ITEM from  
             G$_EXTENDED_SEARCH_BLOCK.SR_SPBPERS_SSN.WHEN-NEW-ITEM-INSTANCE.
4. HCheng  11/14/2002
   Defect# 59082
   Problem: "duplicate field" function disabled in G$_VAL_FORM_CLASS.
   Solution: Deleted trigger KEY-DUP-ITEM in Property Class 'G$_VAL_FORM_CLASS'
             to enable duplicate field function.
5. HCheng  02/27/2003
   Added LOV G$_GXRDIRD_LOVD and Record Group G$_GXRDIRD_RGD for PAYROLL.
   
AUDIT TRAIL: 6.1
1.  XZ 08/05/2003
    Added the call to BXS in the PRE-FORM trigger of G$_FORM_CLASS. 
    Modified the WHEN-MOUSE-CLICK trigger of G$_HORIZONTAL_TOOLBAR block.

AUDIT TRAIL: 6.1.1
1.  SJQ 09/26/2003
    Add a ON-ROLLBACK and a POST-FORMS-COMMIT trigger to the G$_FORM_CLASS to make the
    forms which are regenerated "message" aware.  The ON-ROLLBACK issues the discard
    while the other issues the publish commands.  Added ON_ROLLBACK_TRG and POST_FORMS_COMMIT_TRG
    for local usage.
2.  SJQ 11/05/2003
    Fix KEY-NXTREC in the G$_FORM_CLASS.  The trigger was misspelled.
3.  SJQ 11/05/2003
    Add an ON-SELECT trigger to the G$_FORM_CLASS.  This trigger is executed during the execute
    query processing.  Here is where we will do the extended query checking.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1727
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail60 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1.  SJQ 07/25/2003
    Convert to new version of tool set.
2.  SJQ 07/25/2003
    Modify the G$_FORM_CLASS to remove the horizontal and vertical toolbar from the
    property sheet.
3.  SJQ 07/30/2003
    Moved the BXS alerts to each of the form type objects groups.  Deleted all of the objects
    in the G$_TOOLBAR object group and changed the comment for the object group to reflect
    this.  Deleted the G$_HORIZONTAL_TOOLBAR, G$_VERTICAL_TOOLBAR and 
    G$_NAVIGATION_BLOCK blocks.  Deleted the G$_HORIZONTAL_TOOLBAR and G$_VERTICAL_TOOLBAR 
    canvases.  Deleted the G$_TOOLBAR_BTN_CLASS property class.  Deleted the G$_HT_TOOLBAR 
    and G$_VT_TOOLBAR parameters.  Removed the WHEN-MOUSE-ENTER and -LEAVE triggers from the
    G$_ICON_BTN_CLASS, CONTROL_BTN_CLASS and GUBOBJS_TYPE property classes.
4.  SJQ 08/05/2003
    Modify the G$_PREFERENCES parameter to have a length of 6 since the two toolbar values
    have been removed.  Deleted the G$_WF_BUTTON_PRESSED trigger from the G$_FROM_CLASS.  Deleted
    the G$_IMG_BUTTON_PRESSED_TRG from the G$_FORM_CLASS.
5.  SJQ 09/05/2003
    Add the G$_DEFAULT_PM popup menu object.  Add to each of the form object groups.  Modify
    the WHEN-NEW-BLOCK-INSTANCE trigger in the G$_FORM property class to add a call to populate
    the popup menu.  Add new popup menu object to the G$_FS_CANVAS_CLASS.
6.  SJQ 09/26/2003
    Add new G$_NVA_PROMPT visual attribute for prompts.  Added this to each of the form type
    object groups.
7.  SJQ 10/01/2003
    Update the G$_NVA_PROMPT and added G$_NVA_PROMPT_ITALIC.  Added this to each of the form
    type object groups.  Update the G$_FS_CANVAS_CLASS and G$_FS_WINDOW_CANVAS to increase the
    window and canvas size to match the increase to support larger windows.  Add save, rollback,
    exit and print to the popup menu.  Created a G$_NVA_MENU_ITEM to have Verdana font.  Applied
    to the default popup menu.  Added to each of the form object groups.
8.  SJQ 10/13/2003
    Modify all of the NVA objects to have the Verdana font, except for the "fixed" width ones 
    which still have courrier.  Created a new G$_NVA_KEY_BLOCK visual attribute and added this
    to each of the form object groups.  This will make the NVA available to all forms.
    Modify the G$_ICON_BTN_CLASS to make the size of the buttons to be 15x15.
9.  SJQ 10/15/2003
    Modify the PRE-FORM trigger to call the new routines in the library which set the NVAs for 
    the user's session.      
10. SJQ 10/16/2003
    Add new NVA for the separator line.  Included in all form object groups.  Added new 
    G$_CALENDAR_BTN_CLASS with a WHEN-BUTTON-PRESSED trigger.
11. SJQ 10/20/2003
    Modify the KEY-MENU trigger in the G$_FORM_CLASS to call a the KEY_MENU procedure in the 
    G$_GOQOLIB_KEY_TRIGGER package.  Rename the KEY_NXTREC trigger to KEY-NXTREC in the G$_FORM_CLASS
    property class.  Changed a number of the "key" triggers to have the display in keyboard help
    to yes.
12. SJQ 10/21/2003
    Add a G$_SEPARATOR_LINE_CLASS property class to specify the characteristics of the data 
    separator graphical line.  Added this new property class to the form and menu object groups.
13. SJQ 10/29/2003
    Modify the G$_FS_WINDOW_CLASS to set the window closeable property to true.
14. SJQ 10/29/2003
    Added the G$_CALENDAR_CLASS to each of the form object groups.
15. SJQ 10/31/2003
    Add visual attribute and prompt visual attribute to the G$_CODE_CLASS.  Add visual attribute
    to G$_FS_WINDOW_CLASS.  Updated the visual attribute for radio buttons and check boxes.
16. SJQ 11/06/2003
    Create new visual attribute for scroll bars.  Added to each of the three form object groups.
17. SJQ 11/10/2003
    Add a width setting to the data_separator property class and reset the color.
18. SJQ 11/12/2003
    Add call to G$_NVA_SET_SCROLLBAR in the PRE-FORM trigger of the G$_FORM_CLASS.
19. SJQ 12/01/2003
    Start migrating the various basic person blocks and canvases from the individual forms to here
    so they can be standardized and then referenced into the other forms.  This includes moving the
    blocks from the forms, creating new tab canvases and object groups.
20. SJQ 12/17/2003
    Modify the G$_EXTENDED_SEARCH_WINDOW and G$_OPT_WINDOW to have the inherit menu property set
    to 'yes'.
21. SJQ 12/18/2003
    Modify the G$_NVA_HIGHLITE_TEXT item to remove the font settings.  This was causing the items
    to have their applied fonts change by the current record highlighting.
22. SJQ 12/20/2003
    Begin migrating the basic person data blocks into library (SPRIDEN, SPBPERS, SPRTELE, SPRADDR,
    GOREMAL).  Create new object groups for each.
23. SJQ 01/13/2004
    Change the width of the G$_DATA_SEPARATOR_LINE_CLASS.
24. SJQ 01/21/2004
    Change the text color of the G$_NVA_PROMPT_CODE from blue to black.
25. SJQ 02/09/2004
    Modify the navigation block to check if there are pending changes prior to calling another
    form.  If so, give error message and stop.
26. SJQ 02/11/2004
    Apply international format mask to the G$_CREDITS_CRSE_CLASS, G$_CREDITS_SUM_CLASS and 
    G$_CREDITS_TERM_CLASS.
27. SJQ 02/12/2004
    Modify the WHEN-NEW-BLOCK-INSTANCE trigger to add logic so that if the trigger is being
    fired because of returning from the navigation block.
28. SJQ 02/18/2004
    Add record groups and list of value objects for FGAC validation tables. 
    This includes GTVFDMN (FGAC Domains); GTVFDTP (FGAC Domain Types); GTVFBPR (FGAC Business 
    Profile); GTVFGAC (FGAC Groups); GORFDMN (Domain Codes and Types Rules); GORFPII (Person
    PII Domain Assignments). 
29. SJQ 02/18/2004
    Add record group and list of values for new Learner Field of Study Types (GTVLFST)
30. SJQ 03/01/2004
    Add call to new routines (G$_NVA_SET_BUTTON and G$_NVA_SET_RECORD) to the PRE-FORM trigger
    in FORM_CLASS to get and set non iconic button colors and record highlighting color.
31. SJQ 03/02/2004
    Add short cut keys to each tab canvas.
32. SJQ 03/05/2004
    Add block name to all of the item references in the SPBPERS and SPRTELE blocks.
33. SJQ 03/10/2004
    Modify the G$_ICON_BTN_CLASS and G$_CALANDER_BTN_CLASS to make the visual attribute "DEFAULT".
    This then changed the G$_FLASHLITE_BTN_CLASS as well (which is what was wanted).
34. SJQ 03/15/2004
    Add block names to all references to items in the SPREMRG block.
35. SJQ 04/07/2004
    Modify the POST-FORMS-COMMIT trigger to add logic so that it only attempts to execute the 
    commit logic if the form is not in query mode.  Added the GTVCMSC RG and LOV for use by
    common matching enhancement.
36. SJQ 04/14/2004
    Modify the G$_NAV_CANVAS to change the prompt.
37. SJQ 04/16/2004
    Modify the attributes of the check boxes on the address block to be navigable but not
    modifiable.  Added dynamic sql to the post-query for the block to perform specific Advancement
    logic to populate these check boxes.
38. SJQ 04/19/2004
    Add the Goods and Services Tax Registration number to the address block.  Add logic to the
    ON-INSERT and ON-UPDATE triggers of this block to pass a value for the p_finance_rules
    parameter.
39. SJQ 04/28/2004
    Add each of the tab canvases that are part of the separate tab canvases (email, telephone,
    bio and emergency contact) to the G$_IDEN_TAB_CANVAS.  Modify the object groups for the various
    same to remove the canvases.  The idea is that the object groups will contain the blocks and
    supporting objects, the developer creates a local G$_IDEN_TAB_CANVAS and subclasses in the
    tab canvases needed or subclass in the entire tab canvas and disable/hide the tabs not wanted.
40. SJQ 05/13/2004
    Created new property class, G$_NON_ICON_BTN_CLASS, which contains a java implementation class
    to change the look of the button.  Added this new property class to each of the form object
    groups.  Added four standard ALERTS to each of the three form object groups. 
41. TGK 05/21/2004
    Apply the I18N format mask to the G$_GPA_SUM_CLASS and G$_GPA_TERM_CLASS, increasing the size
    and width and query length to account for the formatting.
42. TGK 05/28/2004
    Applied manual mass change methods to the FUNC_BASE_CANVAS, G$_EXTENDED_SEARCH_CANVAS and
    G$_OPT_CANVAS and those blocks, items and related triggers associated with those canvases.
43. TGK 05/28/2004
		Placed the G$_NVA_RADIO_BUTTON visual attribute into each of the three form object groups.
45. SJQ 06/28/2004
    Added three new visual attributes for use on the main menu form.  G$_NVA_MENU_LINKS_CANVAS,
    G$_NVA_MENU_MSG_CANVAS and G$_NVA_MENU_TREE_CANVAS.
46. SJQ 06/29/2004
    Change the java address of the hyperlink java in the G$_NAV_BLOCK.
47. SJQ 06/30/2004
    Update the G$_NAV_BLOCK.URL_MY_INSTITUTION logic to call a new routine in the library to
    get the user preference setting and launch it via the web.show_document command.
48. SJQ 07/07/2004
    Change the title on the STVSPSR_LOV per defect #95755.  Removed object groups, blocks, 
    canvases and related items for all of the IDEN objects which were moved to the GOQCLIB.
49. SJQ 07/12/2004
    Modify the GTVCALL_LOV and GTVCALL_RG to increase the size of the quickflow code to 10.
50. SJQ 07/19/2004
    Change the title of the GTVCMSC_LOV.
51. TGK 07/29/2004
    Modification to the options window (G$_OPT_BLOCK) to display as hyperlinks.  Done by making
    the opt_block items navigable buttons with iplementation class 
    com.sct.banner.forms.ui.HyperlinkBTN found in the bannerui.jar.  Change tooltip on clear 
    button in extended_search canvas to Clear Search.
52. SJQ 08/03/2004
    Modify the hyperlink item in the G$_NAV_BLOCK to set the visual attribute to DEFAULT so
    the item picks up the back ground color of the canvas.  Add the NXTREC and PRVREC triggers
    to the GO_ITEM in the G$_NAV_BLOCK so that you can scroll through the last ten entries
    just like on the main menu.  Modify the WHEN-NEW-BLOCK-INSTANCE trigger in the G$_FORM_CLASS
    to hide the G$_NAV_CANVAS when navigating to another block.  Removed the tab canvas which
    was part of the IDEN objects.
53. SJQ 08/05/2004
    Added a report handle or stub, BANNERREPORT and an object group supporting changes to 
    forms that call Oracle*Reports per run_report_object initial implementation modifications.    
    Change the F5 logic to use the G$_INFO_ALERT.  Add the explicit definition of some of the
    function keys, making them invalid, in the navigation block.  The key-others did not seem
    to be taking affect.
54. SJQ 08/16/2004
    Add logic to the pre-block trigger of the G$_NAV_BLOCK so that the value of where the 
    cursor was located isn't copied into a local temporary item unless it is null.  This was
    an issue when the navigation window was visible and the user attempted to click out of
    the window and an error occurred, causing the cursor to return to the navigation block.
55. SJQ 08/17/2004
    Modify logic in the POST-FORMS-COMMIT trigger in the G$_FORM class.  The order of the 
    logic was changed since some products are doing other DML in their POST_FORMS_COMMIT_TRG.
    The call to gb_common.p_commit was moved after the execution of this trigger.
56. SJQ 08/20/2004
    Added a new form level ON-ERROR trigger to the G$_FORM_CLASS.  This trigger will intercept
    all errors and if it matches the check policy violation, it will display the appropriate
    error for that otherwise it will display what ever is the current error.  The logic calls
    a new routine, G$_ERROR_PKG, to compare error codes and get the error message for the 
    check policy.
57. SJQ 08/30/2004
    Add the G$_NLS function around messages in the G$_NAV_BLOCK.
58. SJQ 09/09/2004
    Modify the G$_NAV_BLOCK to remove the use of the java bean for the hyperlink.  Changed to
    make the item a button instead of a java bean and add the new java implementation class.  
    Remove references to the fbean function calls.  Change the trigger from a when-custom to
    a when-button-pressed.
59. TGK 09/15/2004
    Removed valuing of "where the cursor was located" from pre-block of G$_NAV_BLOCK.  This is
    being moved into the goqrpls.KEY_MENU routine's IF branch.
60. SJQ 09/22/2004
    Replace the powered by gif image on the navigation canvas.
61. TGK 10/07/2004
    Removed report handle or stub, BANNERREPORT and an object group supporting changes to 
    forms that call Oracle*Reports per run_report_object initial implementation modifications.
    This report handle and object group have been placed in object GOQRLIB.fmb for support of
    forms that call Oracle*Reports.
62. SJQ 10/12/2004
    Rewrite the triggers in the "F5" G$_NAV_BLOCK block to replace all local logic with calls to
    a new G$_F5_NAVIGATION package in GOQRPLS.
63. SJQ 10/19/2004
    Modify the WHEN-BUTTON-PRESSED in the G$_CALENDAR_BTN_CLASS to reverse the logic.  Make the
    logic test if the item is protected before calling the form.  If protected, don't do the
    call.
64. SJQ 11/01/2004
    THESE CHANGES ONLY AFFECT THE MENU FORMS.  Modify the GURMENU_TYPE property class to make the
    function keys visible via show keys.  Modify the KEY-CREREC and KEY-DELREC to cause a 
    re-sequencing of the menu records.  The sequencing was not happening.  Update the 
    WHEN-NEW-BLOCK-INSTANCE trigger in the MENU_TYPE property class to correctly populate the 
    options and the pop-up menu.
65. SJQ 11/03/2004
    THESE CHANGES ONLY AFFECT THE MENU FORMS.  Modify the GURMENU_TYPE property class to remove
    the changes made to the KEY-CREREC and KEY-DELREC from the previous audit trail.  This was
    not the appropriate solution.
66. SJQ 11/04/2004
    THESE CHANGES ONLY AFFECT THE MENU FORMS.  Modify the GURMENU_TYPE property class to change
    some of the triggers to use SYSTEM.CURRENT_BLOCK instead of SYSTEM.CURSOR_BLOCK.  The menu
    maintenance forms have several blocks which each have this property class and the cursor
    may actually be in a different block when the triggers fire.
67. SJQ 11/09/2004
    THESE CHANGES ONLY AFFECT THE MENU FORMS.  Modify the GURMENU_TYPE property class to add logic
    to the CHK_DESC trigger to also ensure that an object name was entered and not just the
    description.
68. SJQ 11/16/2004
    THESE CHANGES ONLY AFFECT THE MENU FORMS.  Modify the GURMENU_TYPE property class to add logic
    to the OBJ_DESC trigger to set the description to "** Invalid object **" if the object cannot
    be found on the object table.
69. SJQ 11/23/2004
    THESE CHANGES ONLY AFFECT THE MENU FORMS.  Modify the GURMENU_TYPE property class to remove
    references to the SET_APPLICATION_PROPERTY commands which were attempting to change the cursor.
    This had been causing the mouse to behave strangely.

AUDIT TRAIL: 7.1
1.  SJQ 02/08/2005
    Modify the list of values button on the F5 navigation window to remove the visual attribute
    on the tooltip.  This was making the tooltip have a different font and color from all other
    tooltips.  Update the list of values invoked from the F5 go item to exclude menu objects
    from the list.  Modify the extended search window to turn on the close window attribute.
    Modify the extended search block to remove the cancel button now that the close option is on.
    Required modification to the G$_WIN_CLOSE routine in GOQRPLS to have it perform the same
    function that the cancel button did.
2.  SJQ 02/22/2005
    Update the FUNC_BASE_WINDOW to set the "closeable" property to be TRUE.  Update the extended
    search block triggers KEY-NXTKEY, KEY-NXTREC, and KEY-PRVBLK to have the G$_INVALID_FUNCTION_MSG 
    command.  Added KEY-NXTBLK, KEY-NXTSEC, KEY-PRVREC, KEY-DOWN, KEY-UP, KEY-SCRDOWN and KEY-SCRUP 
    triggers to the same block with G$_INVALID_FUNCTION_MSG command.  Updated the boiler plate
    text on the block to change references to the "GO" button to be "reduce search".
3.  SJQ 02/23/2005
    Update the extended search window to update the boiler plate text wording related to the
    buttons.  Change the icon related to the "reduce search" function.
4.  SJQ 03/30/2005
    Update the F5 navigation block to add two new triggers (KEY-UP,KEY-DOWN).  The KEY-UP trigger,
    if defined locally in a form superceeds the PREVIOUS RECORD trigger and the KEY-DOWN trigger,
    if defined locally in a form superceeds the NEXT RECORD trigger.  The logic in the F5 block
    was based on the PREVIOUS and NEXT RECORD triggers to allow the user to scroll through the
    items list in the "last 10" forms.  The new triggers simply call the appropriate other trigger.
    KEY-UP executes the PREVIOUS_RECORD trigger.  KEY-DOWN executes the NEXT_RECORD trigger.
5.  SJQ 04/28/2005
    Change the tooltip help on the F5 navigation canvas for the list of values button.  Change the
    auto hint for the go item in the F5 navigation canvas and add a list of values to the GUIOBJS
    form similar to what the menu form has.

AUDIT TRAIL: 7.2
1.  SJQ 04/15/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this a recommendation from Oracle and causes 
    problems in some environments.  Modified the G$_VERIFY_ACCESS and G$_REVOKE_ACCESS to use
    the FORMS_DDL command instead.
2.  SJQ 06/08/2005
    Removed all record groups and lovs which were related to the old style VBS.  These are now
    obsolete:  gtvvobj_rg (and _lov), govvrac_vobj_rg (and _lov), gtvvapp_application_rg (and _lov),
    gorvtbl_rg (_lov), gobsegc_rg (_lov), gtvvbty_rg (_lov), gtvsegc_rg (_lov), gobvusr_rg (_lov),
    gobpcrl_vapp_rg (_lov).
3.  SJQ 06/10/2005
    Moved the following record groups and lovs from the GOASEVR form to here:  gtvsvca, gtvsvcc,
    gtvsvcp, gtvsvcr, gtvsvdt, gtvsvel, gtvsvep, gtvsvft, gtvsvgo, gtvsvio, gtvsvit, gtvsvpc,
    gtvsvrp, gtvsvtr and gtvsvst.  Moved the following record groups and lovs from the GORSVSQ
    form to here: gtvsqpr, gtvsqru, gtvsvap and gtvsvba.
4.  SJQ 06/23/2005
    Add two new triggers (PRE-COMMIT and PRE_COMMIT_TRG) to the G$_FORM_CLASS property class.
    The PRE-COMMIT trigger will execute a call to the G$_GOQOLIB_PP_TRIGGER.PRE_COMMIT routine.
    This routine has been added so that if the user is executing the form with a "query" role,
    the user will be given an error message that they are running with a query only role.  This 
    logic will fire as part of the "commit" logic but is executed prior to any calls to any 
    DML (insert, update or delete) or API calls (on-insert, on-update, or on-delete).  The change
    is designed to address the limitations of implementing the "call query" security setting.
5.  SJQ 06/30/2005
    Update the GTVSVEP_RG to increase the code column length from 2 to 4 characters.
6.  SJQ 07/08/2005
    Update the OBJ_DESC trigger in the GURMENU_TYPE property class which is used by the menu
    maintenance forms.  Increased the size of a local variable to handle the maximum size of
    block concatenated with item names.  Also removed the "rownum = 1" from a query against
    GUBOBJS since it was not needed and improves performance.
7.  SJQ 08/03/2005
    Update the OBJ_DESC trigger in the GURMENU_TYPE property class.  This property class is
    only used in the menu maintenance forms.  The logic was incorrectly clearing an item which
    is used to help determine if the description for the record has been changed or not.  The
    value was being cleared upon a commit and shouldn't have been.
8.  TGK 08/18/2005
    Update of the G$_NAV_CANVAS with modified powered_by image.
9.  TGK 08/23/2005
    Add GORRACE_LOV,GORRACE_RG,GTVRRAC_LOV and GTVRRAC_RG per Race Ethnicity enhancement.

AUDIT TRAIL: 7.3
1.  WG 11/15/2005 - Student defect 95945
    Re-wrote the STVHLDD_LOV and STVHLDD_RG so that the columns match the order in which 
    they appear in STVHLDD the form.
2.  SJQ 11/16/2005
    Removed obsolete record group and lov for GTVFMFD.  Update the STVDAYS_RG select statement
    to correctly apply the format mask to the activity date column and apply a column alias.
    This was a pre-existing issue which was found by the I18N modifications.
3.  SJQ 12/09/2005
    Add several objects (FORM_HEADER and GUBOBJS blocks) and a few other triggers to allow the
    fmx to be generated.  The form previously would not generate.  The fmx is not runable but
    the form needed to be modified so that an fmx could be created to allow CAST to process the
    form.
4.  TGK (MH) 02/03/2006
    a. Create the following form objects for vpd implementation:
       gtvvvpdi_rg, gtvvpdi_lov, g$_vpdi_all_rg, g$_vpdi_all_lov, g$_vpdi_window, g$_vpdi_canvas, 
       g$_vpdi_block
    b. Add above items to the G$_TOOLBAR object_group
    c. Define KEY_F0 in G$_FORM_CLASS class to call G$_VPDI.CALL_VPDI_COMPONENT
    d. Add logic to the following triggers in the G$_FORM_CLASS class in support of vpd 
       implementation: G$_VERIFY_ACCESS, G$_REVOKE_ACCESS, POST-FORM and KEY-EXIT.
5.  SJQ (MH) 02/08/2006
    Rename the gtvvpdi_rg to g$_gtvvpdi_rg and rename the gtvvpdi_lov to g$_gtvvpdi_lov.  Modify
    the position of the buttons on the g$_vpdi_canvas.  Changed the font size and button size of
    the hyperlink item on the g$_vpdi_canvas to match the size of the hyperlinks on the menu
    form.  Modify the g$_vpdi_canvas to allow it to be close-able.
6.  SJQ 02/17/2006
    Increase the length of the STVMEDI_CODE column in the stvmedi_lov and stvmedi_rg to
    support the increased size of the database column.  Originally it was two characters in
    length, now it is 10.
7.  SJQ (MH) 02/20/2006
    Rename the g$_gtvvpdi_rg back to gtvvpdi_rg and rename the g$_gtvvpdi_lov back to gtvvpdi_lov.
    The names with the 'g$' caused problems with the g$_search logic in the GOQRPLS.  Add two
    missing columns from the gtvvpdi table to the record group and lov.  Resize the lov to 
    properly display all of the columns and additional rows.
8.  SJQ 02/28/2006
    Removed the "SCT" from the LOV, Alert and Editor titles.
9.  SJQ 03/02/2006
    Update the GUBOBJS_TYPE property class to remove the logic in the POST-QUERY trigger which
    was calling the G$_CHECK_ACCESS routine.  This call was attempting to verify that each record
    which was displayed was authorized to the user.  This is not needed as the object security 
    policy on the GUBOBJS table will only query authorized rows for the user.  Update the ON-ERROR
    trigger in the QK_MENU_TYPE property class to ignore no data found errors during the query
    in the QK_MENU and QK_FLOW blocks.  Updated the property for some of the triggers in that
    property class to enable visibility in the "show keys".  Increased the maximum length value
    of the QK_MENU.GURMENU_OBJ_NAME to be 30 to allow the maximumn value from the database.  Made
    the display width of the item wider to show more of the column value.  Increased the size of
    the MENU_ENTIRE canvas to allow more of the item to display.  Increased the size of the
    QK_FLOW.GURCALL_FORM to match the size of the QK_MENU.GURMENU_OBJ_NAME.  Added the optimizer
    hint of RULE to the GUBOBJS_TYPE property class.
10. SJQ 03/06/2006
    Added PRE-BLOCK trigger to the GUBOBJS_TYPE property class.  This trigger will alter the 
    block property to set the optimizer to RULE.  Setting the block property as an attribute of 
    the block does not appear to be working correctly.
11. TGK 03/10/2006
    Added title "Existing Institution Values" to the G$_VPDI_ALL_LOV.
    Modified button label to read "View Existing Institution Values" on vpd_other_institutions button
12. SJQ 03/14/2006
    Modify the G$_FORM_CLASS.WHEN-WINDOW-ACTIVATED to remove the call to the G$_DO_WIN_ACTIVATED
    function.  The call to the function was causing a trigger to be created and the intent was
    use the timer to determine whether or not the window title bar should be updated.  The timer
    is not needed so the call is be removed.  Update all of the calls to the workflow library to
    verify that workflow is indeed installed.  A new global was added to the GUAINIT form to hold
    the value of the GUBINST_WF_ENABLED_IND.  If this value is not set to 'Y', the calls from the
    PRE-FORM, POST-FORM, WHEN-NEW-BLOCK-INSTANCE and KEY-CLRFRM triggers (in all of the form level
    property classes) won't be executed.
13. SJQ 04/12/2006
    Modify the G$_REVOKE_ACCESS trigger in the G$_FORM_CLASS to switch the order of the call
    to the G$_VPDI package to occur prior to turning off all roles.
14. SJQ 04/19/2006
    Modify the POST-FORM trigger in the G$_FORM_CLASS to remove the call to the G$_VPDI package as
    this is already being done by the G$_REVOKE_ACCESS routine.
15. SJQ 04/20/2006
    Modify Visual Attribute Group of G$_NAV_BLOCK.URL_MY_INSTITUTION from G$_NVA_FIXED_TEXT_ITEM
    to DEFAULT.  Most forms do not have the G$_NVA_FIXED_TEXT_ITEM visual attribute and results 
    in a DEFAULT display.  Only a few are using the visual attribute (GJIREVO, SCADETL, SSATEXT) 
    for unrelated reasons and result in the URL_MY_INSTITUTION displaying with unexpected results.

AUDIT TRAIL: 7.4
1.  SJQ 05/23/2006
    Update the G$_EXTENDED_SEARCH_BLOCK to disable and hide several function keys that are not
    appropriate for the block.  Added a KEY-EXIT trigger to close the extended search window.  
    Added a label to the count item.  Update the trigger logic on the birth date item to test if
    the user has entered any wildcard characters.  If they have, do not call the g$_date_reformat
    routine.  Change the date item datatype value from DATE to CHAR to support the use of
    wildcards.
2.  TGK 08/30/2006
    Increased maxsize (from 5 to 10) and width of ROOM item on the G$_FUNC_BASE_INFO_BLOCK. ROOMs with
    length greater than 5 were causing error.   (CMS-DFCT103244)
3.  TGK 09/11/2006
    In G$_NAV_BLOCK.CALL_ROUTINE, (1) set GLOBAL.FORM_WAS_CALLED to null and (2) GLOBAL.NAV_FRAME_CALL to Y.
    (1) When in a form that was called and auto-navigated into via the global.form_was_called; when selecting F5
    and calling another form (that has the potential to auto-navigate) that form should not auto-navigate when
    called from F5.   (2) When calling a form that can be used as an LOV form from the F5, the Select should not
    be enabled.  When the select is enabled the form will assume a double-click is issuing an exit-with-value.
    (1-GIR5Y)
4.  TGK 09/22/2006
    Brand name changes to Workflow product name found in class G$_FORM_CLASS on triggers PRE-FORM and
    WHEN-TIMER-EXPIRED.  Change was in comment lines.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;

	*/
	//ID:1728
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail70 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_NLS_DATE_SUPPORT
	
	PROCEDURE AUDIT_TRAIL_NLS_DATE_SUPPORT IS
-- AUDIT TRAIL: NLS_DATE_SUPPORT 
-- 1. TGKinderman   11/11/2005
--    This object was passed through a conversion process relative to preparing
--    the object to support internationalization needs.  Basically, hard coded
--    date format masks of DD-MON-YYYY are converted to a G$_DATE function that
--    returns nls_date_format.  The release number of this object was NOT
--    modified as part of this effort.  This object may or may not have had 
--    conversion process code modifications.  However, this audit trail entry
--    does indicate that the object has been passed through the conversion.
-- AUDIT TRAIL END
-- 
BEGIN
  NULL;
END AUDIT_TRAIL_NLS_DATE_SUPPORT;

	*/
	//ID:1729
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrailNlsDateSupport procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>

AUDIT TRAIL: 8.0
1. George Shalovka  12/19/2006
		Migrate International Solutions Centre SDE enhancements listed below into Baseline.
		--
		HvT 2006-06-30
   	Added Block: G$_SDKEY - containing internal fields, not visible
   	Added Block: G$_SDISP - supplemental data block based on view GOVSDAV
   	Added Canvas: G$_SDSP_CANVAS - canvas for SD
   	Added Window: G$_SDSP_WINDOW - dialog type window for SD
   	Added beforementioned objects to Object Groups G$_APPLICATION_FORM and G$_VALIDATION_FORM
   		to make them available in those form classes after a recompilation
   	--
   George Shalovka   12/28/2006
		HvT had also added form-level When-New-Record-Instance trig.
   	Added Object Groups G$_INQUIRY_FORM.
2. George Shalovka   01/29/2007
   Modify trigger G$_SDISP.Pre-BLock to disable update, insert and delete functions
 		on block G$_SDISP if form is an 'I'nquiry or 'Q'uery form.
   Modify trigger G$_SDISP.Key-DelRec error message to add G$_NLS.Get around string.
3. George Shalovka   02/09/2007
   Add LOV GOBSDTB_LOV and Record Group GOBSDTB_RG for use in form GOASDMD.
4. George Shalovka   04/18/2007
   Modify form-level trigger WHEN-NEW-RECORD-INSTANCE property
   	Functional.Execution Hierarchy from "OVERRIDE" to "BEFORE".
5. George Shalovka   05/18/2007
   Add triggers G$_SDISP.Key-Commit, G$_SDISP.Key-PrvBlk and G$_SDISP.Key-NxtBlk
   	to allow SDE block-level functionality.  
   	Code is referenced from library GOQRPLS.pll	program unit G$_SD.
6. TGKinderman       06/15/2007
   a.  Add property class G$_CHAR_FIELD_CLASS which carries only an Implementation Class for tooltip/partial char mask
   b.  Add property class G$_CHAR_MULTILINE_CLASS which carries only an Implementation Class for multiline tooltip
   c.  Add G$_CHAR_FIELD_CLASS as a subclass to G$_GRADE_CODE_CLASS, G$_CODE_CLASS, G$_ID_CLASS and G$_NAME_CLASS
   d.  Add G$_CHAR_FIELD_CLASS to each of the 3 Object Groups (G$_APP, G$_INQ and G$_VALIDATION)
   e.  Add G$_CHAR_MULTILINE_CLASS to each of the 3 Object Groups (G$_APP, G$_INQ and G$_VALIDATION)
   f.  Fixed the MaxLength broken inheritance on the G$_FF_NAME_CLASS
   g.  Change the MaxLength on the G$_NAME_CLASS from 99 to 230
7. George Shalovka   08/17/2007
		Re-apply changes 6.a,b,g,f,e,d,c in that order.
		Override trigger text in block G$_NAV_BLOCK.GO_ITEM triggers 
			WHEN-MOUSE-DOUBLECLICK, G$_SEARCH_PARAMETERS, G$-SEARCH_OPTIONS,
			KEY-NEXT-ITEM, POST-TEXT-ITEM to provide correct [F5] functionality.
8. George Shalovka   08/15/2007
   Defect 1-2FWX3B.
   Add block-level triggers G$_SDISP.KEY-ENTQRY and G$_SDISP.KEY-EXEQRY which contain warning messages
     that these functions are not available within the SDE window.
9. George Shalovka   08/20/2007
   Defect 1-2FQD8W.
   Add block-level trigger G$_SDISP.KEY-CLRREC to only null out the data value of the SDE row 
   	and not delete the entire row which includes the "prompt".
10. TGKinderman       10/17/2007
    Increase the size of the code column in record group GTVSVCR_RG from 2 to 4 and the lov width from 30 to 38.
    Increase the size of the code column in record group GTVSVTR_RG from 2 to 6 and the lov width from 30 to 54.
    (1-1QJI2F)
11. TGKinderman       10/29/2007
    TabSecurity modifications.
    Change blocks (G$_EXTENDED_SEARCH_BLOCK, G$_OPT_BLOCK) away from being statically navigable. Set items in these 
    blocks to Enabled No. Logic in goqrpls routines will; (1) set Enabled Yes (and other navigation related properties)
    before navigating to these blocks and (2) set Enabled No upon dismissing or navigating away from these blocks.
12. George Shalovka  01 November 2007
    Defect 1-2YFTIN.
    Problem:With data type of 'varchar' and length set as '300' able to enter >300 chars in SDE window.
		Solution:Modify trigger G$_SDISP.POST-CHANGE.GOVSDAV_VALUE_AS_CHAR 
							to add edit comparing attribute length and data entry length.
						Additionally, modify error messages.
13. George Shalovka  01 November 2007
		Defect 1-2XWC9J.   	
   	Problem:With data type of 'number' and length set as '2' able to enter >23 digits in SDE window.
   	Solution:Modify trigger G$_SDISP.POST-CHANGE.GOVSDAV_VALUE_AS_CHAR  
   						to add edit comparing attribute length and data entry length.
						Additionally, modify error messages.
14. George Shalovka  01 November 2007
   	Defect 1-2JIUN9.
   	Problem: Add an explanation of the * (asterisk character)in the SDE window - *=Required.
   	Solution:Modify form item G$_SDISP.GOVSDAV_ATTR_PROMPT_DISP to add prompt and associated attributes.   	
15. TGKinderman       11/05/2007
    Add GTVADID_RG and GTVADID_LOV to be used for LOV within Additioinal Identification Tab in GOQCLIB referenced
    into forms APAIDEN, FOAIDEN, PPAIDEN and SPAIDEN
16. George Shalovka  10 November 2007
   	Tracking: 1-2KT5NX.
   	Problem: shift F7 clears all data in sde window and traps you in a loop.
   	Solution:Modify form item G$_SDISP.Key-ClrFrm to close SDE window before invoking any clear form triggers.
17. George Shalovka  12 November 2007
   	Tracking: 1-2JAVPZ.
   	Problem: SDE window 'Close' button does not consistently close window.
   	Solution:Added 'Close' button to canvas and removed 'Close' icon from window title bar.
   	Add G$_SDKEY.SDE_CLOSE_BTN to canvas G$_SDSP_CANVAS.
18. George Shalovka  13 November 2007
   	Tracking: Product re-labeling.
   	Change references from "BXS" to "BDMS"
   		and "Banner Xtender Solutions" to "Banner Document Management Suite".
		Modify Alerts.G$_EXTEND_SOLUT_ALERT.Functional.Title.
		Modify Alerts.G$_EXTEND_SOLUT_2_ALERT.Functional.Title.
19. George Shalovka   15 November 2007
		Tracking: 1-30U1B6.
		Modification: Some forms referencing G$_INQ_FORM_CLASS are not querying SDE data.
   	Modify Object Groups G$_INQUIRY_FORM.
   	Re-reference trigger WHEN-NEW-RECORD-INSTANCE.
20. George Shalovka   07 December 2007
		Tracking: 1-33XRRG.
		Modification: LOV for table GOBSDTB has incorrect column heading.
   	Modify LOV GOBSDTB_LOV property palette Functional.Column Mapping Properties 
   	for column GOBSDTB_TABLE_NAME to have Column Title of "Table Name".
21. George Shalovka   10 December 2007
		Tracking: 1-32WUWY.
		Task: modify List of Values to display correct lengths by adjusting display
					for database column Data length Semantics.
		Modification: Add LOV ALL_TAB_COLUMNS_LOV for table ALL_TAB_COLUMNS 
										with SELECT statement containing DECODE clsuse to display 
										column DATA_LENGTH adjusted for Data Length Semantic attributes.
22. George Shalovka   13 December 2007
		Tracking: 1-337BVS.
		Task: Alert messages in INB still reference XtenderSolutions instead of Document Management Suite
		Modification: Modify Alerts.G$_EXTEND_SOLUT_ALERT and Alerts.G$_EXTEND_SOLUT_2_ALERT
										Property Palette Functional.Title to replace string "Xtender Solutions(tm)"
										with "Document Management Suite".
23. George Shalovka   10 January 2008
		Tracking: 1-32WUWY.
		Task: Add GLOBAL variables to ALL_TAB_COLUMNS_LOV to return
					database column values for DATA_TYPE and DATA_LENGTH.
					These can be referenced by forms referencing LOV.
		Modification: Modify LOV ALL_TAB_COLUMNS_LOV Property Palette 
					Functional.Column Mapping Properties to add 
					Return Item	GLOBAL.VALUE_2 for Column Names DATA_TYPE and 
					Return Item	GLOBAL.VALUE_3 for Column Names NEW_LENGTH.
AUDIT TRAIL END   	
   
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:1730
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail80 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS
<multilinecomment>
AUDIT TRAIL: 8.1
1.  Shriya Naidu  08 April 2008
		Tracking:	1-28VFM6
		Problem:	Error "FRM-40735: SORT_SEQ trigger raised unhandled exception ORA-06502" 
							received on GUAPMNU and GUTPMNU when adding more than 99 forms to personal menu.  
		Impact: 	Users could not add more than 99 objects to each level of their Personal Menu.
		Solution: Modify Property Classes GURMENU_TYPE trigger SORT_SEQ to increase local 
							variables from a length of INTEGER(2) to INTEGER(4).
AUDIT TRAIL END   	
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:1731
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail81 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_2
	
	PROCEDURE AUDIT_TRAIL_8_2 IS
<multilinecomment>
AUDIT TRAIL: 8.2
1.  LVH 21-JUL-2008
    Defect 1-HBN4V
    Added :FORM_HEADER.INITIAL_QUERY to enable the object display to remain unchanged
    after updating the menu.
    Also prevented a COMMIT in the the FORM_HEADER block.
    
2. LVH 12-12-2008
   1-4C9MJI
   Changed format of G$_POINTS_CRSE_CLASS property class from 9999999.999999 to 9999999D999999.    
   1-4C9MK4
   Changed format of G$_POINTS_SUM_CLASS property class from 99999999999.999999 to 99999999999D999999.    
   1-4C9MKP
   Changed format of  G$_POINTS_TERM_CLASS property class from 999999999.999999 to 999999999D999999.    

3. LVH 12-30-2008
   1-2JGIPB
   STVACTC_LOV column headers were changed to "Code, Description, Type, Category, Lead".

4. SN / LVH 12-30-2008
   1-1F2IDR
   The MDI title shows the 'bread crumb' trail of forms that are currently open in a session. 
   When the GUAINST max open forms field is populated, this causes the number of open forms 
   to appear in the MID title bar. It displays the open form name, open form name-#. 
   For example SPAIDEN, SPAIDEN-2. The form name should not appear a second time with 
   the open form count. Code was commented out in G$_VERIFY_ACCESS and G$_REVOKE_ACCESS of 
   G$_FORM_CLASS were to enable better 'bread crumb' maintenance.
     							
AUDIT TRAIL END   	
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:1732
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail82()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail82 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GOQOLIB
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Thu Feb 06 08:29:06 2014
-- MSGSIGN : #cd0bf98ec73c6a78
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1733
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrailMsgkeyUpdate procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_0_5
	
	PROCEDURE AUDIT_TRAIL_8_3_0_5 IS
<multilinecomment>
AUDIT TRAIL: 8.3.0.5
1.  PM 05-MAY-2010
    Defect 1-87OU5W 
    a. For Property Class G$_FORM_CLASS Uncomment the following line of code in 
    triggers G$_VERIFY_ACCESS which is commented out
      GLOBAL.CURR_NO_FORMS := TO_CHAR(TO_NUMBER(:GLOBAL.CURR_NO_FORMS) + 1);

    b. For Property Class G$_FORM_CLASS Uncomment the following line of code in 
    triggers G$_REVOKE_ACCESS which is commented out 
        TEMP_NO := TO_NUMBER(NAME_IN('GLOBAL.CURR_NO_FORMS')) - 1;
        COPY(TO_CHAR(TEMP_NO),'GLOBAL.CURR_NO_FORMS');
2.  LVH 06/03/2010
    Defect 1-BWWYM7
    a. Modified POST-CHANGE trigger for GOQOLIB.G$_SDISP.G$_SDISP.GOVSDAV_VALUE_AS_CHAR 
       to treat a scale of 0 as allowing only integer fields. If both the length and
       scale are 0 then standard Oracle numeric eddting will be performed. i.e. a
       max length of 38, max scale of 7 - in typical numeric format 123.456 or even
       scientific notation 123.4E26
            							
AUDIT TRAIL END   	
</multilinecomment>  
BEGIN
  NULL;
END;
	*/
	//ID:1734
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail8305()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail8305 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment>
AUDIT TRAIL: 8.4
1. RPE 1-2NOZR0, 1-3BMK95, 1-4U7LW2 
   LVH 08/01/2010
   Added logic to support SDE value validations.
   	- GOVSDAV_VALUE_AS_CHAR_LBT - New LOV for SDE 
    - Trigger G$_SDISP.WHEN-NEW-RECORD-INSTANCE to activate SDE LOV if needed
    - Trigger G$_SDISP.VALIDATE_THE_DATA to call the new gp_goksdif.f_validate_value 
      validation routines
    - Trigger G$_SDISP.GOVSDAV_VALUE_AS_CHAR.WHEN-VALIDATE-ITEM to call VALIDATE_THE_DATA 
      for data validation
    - Trigger G$_SDISP.GOVSDAV_VALUE_AS_CHAR.KEY-LISTVAL to call the LOV form
    - Trigger G$_SDISP.GOVSDAV_VALUE_AS_CHAR.POST-CHANGE logic replaced by 
      WHEN-VALIDATE-ITEM to call VALIDATE_THE_DATA for data validation
    - Added the following to the G$_SDISP block: GOVSDAV_SDDC_CODE, GOVSDAV_LOV_FORM, 
      GOVSDAV_LOV_TABLE_OVRD, GOVSDAV_LOV_ATTR_OVRD, GOVSDAV_LOV_CODE_TITLE, 
      GOVSDAV_LOV_DESC_TITLE
 
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1735
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail84()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail84 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5_2
	
	PROCEDURE AUDIT_TRAIL_8_5_2 IS
<multilinecomment>
AUDIT TRAIL: 8.5.2
1. Defect 1-166ABKG 
   LVH 06/18/2012
   Added logic to support the SDE_PK bind variable in SDE value validations for new inserts.
   Note: any form that requires this functionality must be recompiled using this version of goqolib.
2. RPE 1-30BLZJ
   LVH 07/17/2012
   Added "com.sct.banner.forms.ui.BannerMultiLineCharField" to GOVSDAV_ATTR_INFO to enable viewing additional characters
3. RPE 1-2JIUQ7
   LVH 07/17/2012
   Added "com.sct.banner.forms.ui.BannerCharField" to GOVSDAV_ATTR_PROMPT_DISP to enable viewing additional characters
 
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1736
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail852()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail852 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT_GOQOLIB
	
	PROCEDURE COPYRIGHT_GOQOLIB IS
<multilinecomment> 
  Copyright 1995-2013 Ellucian Company L.P. and its affiliates. 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:1737
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyrightGoqolib()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : copyrightGoqolib procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6
	
	PROCEDURE AUDIT_TRAIL_8_6 IS
<multilinecomment>
AUDIT TRAIL: 8.6
1. RPE 1-1AKBU3N
   TGKinderman 01/21/2013
   Rebranding modifications. Update of the G$_NAV_CANVAS with modified powered_by image.
   Product name for "BDMS" and "Banner Document Management Suite" has been changed to "BDM"
   and "Banner Document Management" respectively. Changed to reflect "Banner Document Management"
   under Alert Title for G$_EXTEND_SOLUT_ALERT and G$_EXTEND_SOLUT_2_ALERT.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1738
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail86()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail86 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_4
	
	PROCEDURE AUDIT_TRAIL_8_6_4 IS
<multilinecomment>
AUDIT TRAIL: 8.6.4
1. CR-000101888 Seamless Navigation
   TGKinderman 07/29/2013
   Michael Hitrik
   Modification in support of Seamless Navigation.
   a. Add 2 triggers WHEN-CUSTOM-JAVASCRIPT-EVENT and BANNER_XE_SEND_CONTEXT to property class G$_FORM_CLASS.
      These 2 triggers then become available to standard forms when generated against this version of goqolib.fmb.
      Trigger WHEN-CUSTOM_JAVASCRIPT-EVENT will allow any standard INB form to interact with JavaScript code.  
      Trigger BANNER_XE_SEND_CONTEXT is called from a standard INB forms 'SAVE_KEYS' trigger such that global
      values are shared with the XE application/applications. NOTE: the standard 'SAVE_KEYS' trigger is modified
      by a ban8-xe-conversion utility.
   b. Add KEY-F6 to property class G$_FORM_CLASS. If running INB from the unified menu KEY-F6 will invoke the
      unified menu Browse otherwise give invalid_fct_msg.
   c. Modify trigger G$_NAV_BLOCK.CHECK_TYPE to give message that GUAGMNU is not available if running from unified menu;
      otherwise continue to display message that GUAGMNU is already running.

AUDIT TRAIL END
</multilinecomment>
BEGIN
NULL;
END;
	*/
	//ID:1739
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail864()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail864 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	
	

}
