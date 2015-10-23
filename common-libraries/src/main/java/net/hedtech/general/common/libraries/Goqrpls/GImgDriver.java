package net.hedtech.general.common.libraries.Goqrpls;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;
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
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;

import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

public class GImgDriver extends AbstractSupportCodeObject {
	

	public GImgDriver(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_IMG_DRIVER
	/*
	PACKAGE G$_IMG_DRIVER IS
-- 5000-25 new code
<multilinecomment>--------------------------------------------------------------*\
  The package G$_IMG_DRIVER provides the interface needed to
  serve as the gateway for all XtenderSolutions-related
  activity that is invoked from within Banner (by clicking on
  the XtenderSolutions toolbar icon or choosing its menu
  equivalent).  For Banner sites who have Banner ExtenderSolutions
  5.0 (or later) installed, the latter product may be invoked from within
  Banner and may also auto-query based on the Banner "context"
  or "touchpoint".  Any licensed ExtenderSolutions user may
  so invoke that product;  other Banner users will simply receive
  dialogue that indicates that they are not Extender Solution
  users (or the product is not installed at that site).
  
  ExtenderSolutions first appeared in Banner with General release 5.0,
  where it is simply a part of the toolbar UI (but with no
  real integrated functionality).  This was done to establish a
  baseline position for the product for the 5.x lifetime as well
  as to potentially reduce the amount of form regeneration that
  would be necessary if a Banner site installs Banner ExtenderSolutions
  into a 5.x Banner system.

    UPDATED NOTE:  Although it was the intention of the first
    delivery of the BXS (5.0) product to not require form
    recompilations beyond that done as part of the Banner
    5.0 installation, this has not been possible.  All Banner
    forms that, for a BXS 5.0 site, will be used as launch
    points for the Banner XtenderSolutions (BXS) product
    will need recompilation against the General 5.3 version of
    GOQOLIB.fmb.
    
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

--------------------------------------------------------------
-- 5000-25
--         Procedure p_img_execute is invoked by General
--         toolbar logic processing code when
--         the XtenderSolutions button is pressed within
--         a Banner form NOT compiled against a General 5.3
--         (or later) version of GOQOLIB.fmb.
--         It can also be invoked from a menu item.
--         This current code will, in turn, will invoke
--         the GOKIMAG.P_CHECK_IMAGING database
--         procedure (if it exists).
--
--         If XtenderSolutions is not installed or
--         is not enabled at a client site, or if the
--         current user is not a valid XtenderSolutions
--         user, the GOKIMAG.P_CHECK_IMAGING procedure
--         will provide text for relevant display(s) to
--         indicate this.  In such cases, no further
--         processing will take place other than the
--         informational UI.
--
--         NOTE:  Procedure P_IMG_EXECUTE will never find
--                a site where BXS is installed.  Beginning
--                with version 5.3 of GOQRPLS.pll, BXS may
--                or may not be installed at a Banner site.
--                For forms that are recompiled following
--                a delivery of General 5.3, the procedure
--                that is invoked from the form will be
--                P_IMG_EXECUTE_V53, not P_IMG_EXECUTE.  It
--                is only this former procedure that ever
--                has the potential of actually invoking AX/WX.
--
--         Dependencies:
--                      Needs the following objects:
--                         G$_EXTEND_SOLUT_ALERT   (alert)
--                         G$_EXTEND_SOLUT_2_ALERT (alert)
--                         GOKIMAG.P_CHECK_IMAGING
--                               (package procedure)
--
--         Inputs:      Local variable copies of the form's
--                      current values for
--                         :SYSTEM.CURRENT_FORM,
--                         :SYSTEM.CURRENT_BLOCK,
--                         :SYSTEM.CURRENT_ITEM, and
--                         the user name (as found in
--                         :GLOBAL.CURRENT_USER).
--
--         Processing:  This procedure is a high-level
--                      procedure called upon pressing
--                      the XtenderSolutions icon on the
--                      toolbar (or pressing its menu
--                      equivalent).
--
--         Output:      No direct output, other than
--                      a potential alert/message box;  nested
--                      code has potential action in
--                      terms of possible invocation of
--                      the external XtenderSolutions
--                      product, if such product exists,
--                      if the user authenticates okay,
--                      etc.
--------------------------------------------------------------
-- 5300-1
--         Procedure p_img_execute_V53 is invoked by General
--         toolbar logic processing code when
--         the XtenderSolutions button is pressed within
--         a Banner form compiled against a General 5.3
--         (or later) version of GOQOLIB.fmb.
--         It can also be invoked from a menu item.
--         This current code will, in turn, will invoke
--         the GOKIMAG.P_GET_AX_VERSION database
--         procedure (if it exists).
--
--         If XtenderSolutions is not installed or
--         is not enabled at a client site, or if the
--         current user is not a valid XtenderSolutions
--         user, the GOKIMAG.P_GET_AX_VERSION procedure
--         will provide text for relevant display(s) to
--         indicate this.  In such cases, no further
--         processing will take place other than the
--         informational UI.
--
--         NOTE:  Procedure P_IMG_EXECUTE_V53 may or may not
--                find a site where BXS is installed.  Beginning
--                with version 5.3 of GOQRPLS.pll, BXS may
--                or may not be installed at a Banner site.
--                For forms that are recompiled following
--                a delivery of General 5.3, the procedure
--                that is invoked from the form will be
--                P_IMG_EXECUTE_V53, not P_IMG_EXECUTE.  It
--                is only this 'V53' procedure that ever
--                has the potential of actually invoking AX/WX.
--
--         Dependencies:
--                      Needs the following objects:
--                         G$_EXTEND_SOLUT_ALERT   (alert)
--                         G$_EXTEND_SOLUT_2_ALERT (alert)
--                         GOKIMAG.P_GET_AX_VERSION (package procedure)
--                         EOQRPLS.e$_img_driver.p_call_extend_solut
--                            (package procedure)
--
--         Inputs:      Local variable copies of the form's
--                      current values for
--                         :SYSTEM.CURRENT_FORM,
--                         :SYSTEM.CURRENT_BLOCK,
--                         :SYSTEM.CURRENT_ITEM, and
--                         the user name (as found in
--                         :GLOBAL.CURRENT_USER),
--                         a flag indicating the source of the
--                            invocation,
--                         and three receptor variables to
--                         receive back the values of
--                         AX Application Name, Document Type,
--                         and the quantity of hits based on
--                         the context query.
--
--         Processing:  This procedure is a high-level
--                      procedure called upon pressing
--                      the XtenderSolutions icon on the
--                      toolbar (or pressing its menu
--                      equivalent).
--
--         Output:      No direct output, other than
--                      a potential alert/message box;  nested
--                      code has potential action in
--                      terms of possible invocation of
--                      the external XtenderSolutions
--                      product, if such product exists,
--                      if the user authenticates okay,
--                      etc.
--------------------------------------------------------------
-- 5300-1
--         Procedure P_Disp_BXS_Query_Info is invoked from two
--         possible locations:
--            1. From a non-dominant mouse click event in
--               a BXS-aware form (a form compiled against
--               version 5.3 of GOQOLIB or later).
--            2. From a menu choice (GUMAPPL.mmb) to get
--               "info" from the BXS system.
--
--         If XtenderSolutions is not installed or
--         is not enabled at a client site, or if the
--         current user is not a valid XtenderSolutions
--         user, then no message will be displayed.
--
--         NOTE:  Procedure P_IMG_EXECUTE_V53 may or may not
--                find a site where BXS is installed.  Beginning
--                with version 5.3 of GOQRPLS.pll, BXS may
--                or may not be installed at a Banner site.
--                For forms that are recompiled following
--                a delivery of General 5.3, the procedure
--                that is invoked from the form will be
--                P_IMG_EXECUTE_V53, not P_IMG_EXECUTE.  It
--                is only this 'V53' procedure that ever
--                has the potential of actually invoking AX/WX.
--
--         Dependencies:
--                      Needs the following objects:
--                         G$_EXTEND_SOLUT_ALERT   (alert)
--                         G$_EXTEND_SOLUT_2_ALERT (alert)
--                         GOKIMAG.P_GET_AX_VERSION (package procedure)
--                         P_IMG_EXECUTE_V53 (this package)
--                         EOQRPLS.e$_img_driver.p_call_extend_solut
--                            (package procedure)
--
--         Inputs:      (None)
--
--         Processing:  (see above)
--
--         Output:      Potential alert/message box.
--
--------------------------------------------------------------
-- 5300-1
--         Function f_form_is_BXS_aware is used to determine
--            whether or not a form has been made "BXS-enabled"
--            (or "BXS-aware").  All Banner forms fall into one
--            of two possible states:  Either it was compiled
--            in the presence of General 5.3 object GOQOLIB,
--            or not.  Those that have been newly recompiled
--            with a 5.3 (or later) version of GOQOLIB are
--            "BXS-enabled."
--
--         Dependencies:
--                      Needs the following objects:
--                         (None)
--
--         Inputs:      (None)
--
--         Processing:  (see above)
--
--         Output:      (None)
--
--------------------------------------------------------------
--
  PROCEDURE p_img_execute
     (
         Current_Form_In            IN     VARCHAR2,
         Current_Block_In           IN     VARCHAR2,
         Current_Item_In            IN     VARCHAR2,
         Username_In                IN     VARCHAR2
     );
--
  PROCEDURE p_img_execute_v53
     (
	       Current_Form_In            IN     VARCHAR2,
	       Current_Block_In           IN     VARCHAR2,
	       Current_Item_In            IN     VARCHAR2,
	       Username_In                IN     VARCHAR2,
         InquiryOnly_Ind            IN     INTEGER,
         Quant_Results_In_Out       IN OUT INTEGER,
         AX_Application_Name_In_Out IN OUT VARCHAR2,
         Doc_Type_In_Out            IN OUT VARCHAR2,
         Force_WX_Flag_In           IN     INTEGER DEFAULT 0
	   );
--
  FUNCTION f_form_is_BXS_aware RETURN BOOLEAN;
--
  PROCEDURE P_Disp_BXS_Query_Info;
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_IMG_DRIVER
		/*
		PACKAGE BODY G$_IMG_DRIVER IS
-- 5000-25 new code
--
-- 5300-3
-- IMPORTANT NOTE:  Search for the word "Note" below
--   for important information on where changes should
--   and should not be made within this source code.
--
-- 5300-3  additional procedure added
--*
--*
--* Declare private variables
--*
--*
--* Define public subprogram bodies
--*
--
-- NOTE:  The following procedure must be left unaltered.
--        Calls to this procedure were delivered as part
--        of the 5.0 version of GOQOLIB, and therefore
--        this code must be left intact to service those
--        invocations.  Such invocations would come from
--        forms that are not regenerated post-General 5.3.
--        As of the 5.3 version of GOQOLIB,
--        calls will only be made to the
--        similar-named  procedure p_img_execute_v53 (below).
--        It is that later (5.3) procedure that solely
--        should changed for defect corrections etc.
--
-- 5600-1 
-- GOQOLIB has been changed in general release 5.6, which requires all 
-- Banner forms be recompiled. All newly compiled Banner forms will not 
-- call this package. Instead, they will call EOQRPLS. But if a Banner form 
-- is not recompiled, it will call this package.
--
-- Add the code to intercept calls to this package and redirect it to e$_img_driver2.

   PROCEDURE p_img_execute
            (
                Current_Form_In               IN VARCHAR2,
                Current_Block_In              IN VARCHAR2,
                Current_Item_In               IN VARCHAR2,
                Username_In                   IN VARCHAR2
            ) IS
--
         Imaging_User_Ind_In_Out         VARCHAR2(1)    := 'N';
         Message1_In_Out                 VARCHAR2(1000) := '' ;
         Message2_In_Out                 VARCHAR2(1000) := '' ;
         Message3_In_Out                 VARCHAR2(1000) := '' ;
         Message4_In_Out                 VARCHAR2(1000) := '' ;
         Message5_In_Out                 VARCHAR2(1000) := '' ;
         Message6_In_Out                 VARCHAR2(1000) := '' ;
         Message7_In_Out                 VARCHAR2(1000) := '' ;
         Message8_In_Out                 VARCHAR2(1000) := '' ;
--
         Alert_Info_ID    ALERT := FIND_ALERT( 'G$_EXTEND_SOLUT_ALERT'  );
         Alert_Info_2_ID  ALERT := FIND_ALERT( 'G$_EXTEND_SOLUT_2_ALERT');
         Alert_Result     NUMBER;
--
      BEGIN
         gokimag.p_check_imaging
               (
                  Current_Form_In,
                  Current_Block_In,
                  Current_Item_In,
                  Username_In,
                  Imaging_User_Ind_In_Out,
                  Message1_In_Out,
                  Message2_In_Out,
                  Message3_In_Out,
                  Message4_In_Out,
                  Message5_In_Out,
                  Message6_In_Out,
                  Message7_In_Out,
                  Message8_In_Out
               );
--
         IF Message1_In_Out IS NOT NULL THEN
           IF Id_Null (Alert_Info_ID) THEN
             MESSAGE ( Message1_In_Out );
           ELSE
             SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT, Message1_In_Out );
             Alert_Result := SHOW_ALERT ( Alert_Info_ID );
           END IF;
         END IF;
--
         IF Message2_In_Out IS NOT NULL THEN
           IF Id_Null (Alert_Info_ID) THEN
             MESSAGE ( Message2_In_Out );
           ELSE
             SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT, Message2_In_Out );
             Alert_Result := SHOW_ALERT ( Alert_Info_ID );
           END IF;
         END IF;
--
         IF Message3_In_Out IS NOT NULL THEN
           IF Id_Null (Alert_Info_ID) THEN
             MESSAGE ( Message3_In_Out );
           ELSE
             SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT, Message3_In_Out );
             Alert_Result := SHOW_ALERT ( Alert_Info_ID );
           END IF;
         END IF;
--
         IF Message4_In_Out IS NOT NULL THEN
           IF Id_Null (Alert_Info_ID) THEN
             MESSAGE ( Message4_In_Out );
           ELSE
             SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT, Message4_In_Out );
             Alert_Result := SHOW_ALERT ( Alert_Info_ID );
           END IF;
         END IF;
--
         IF Message5_In_Out IS NOT NULL THEN
           IF Id_Null (Alert_Info_ID) THEN
             MESSAGE ( Message5_In_Out );
           ELSE
             SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT, Message5_In_Out );
             Alert_Result := SHOW_ALERT ( Alert_Info_ID );
           END IF;
         END IF;
--
         IF Message6_In_Out IS NOT NULL THEN
           IF Id_Null (Alert_Info_ID) THEN
             MESSAGE ( Message6_In_Out );
           ELSE
             SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT, Message6_In_Out );
             Alert_Result := SHOW_ALERT ( Alert_Info_ID );
           END IF;
         END IF;
--
         IF Message7_In_Out IS NOT NULL THEN
           IF Id_Null (Alert_Info_ID) THEN
             MESSAGE ( Message7_In_Out );
           ELSE
             SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT, Message7_In_Out );
             Alert_Result := SHOW_ALERT ( Alert_Info_ID );
           END IF;
         END IF;
--
         IF Message8_In_Out IS NOT NULL THEN
           IF Id_Null (Alert_Info_ID) THEN
             MESSAGE ( Message8_In_Out );
           ELSE
             SET_ALERT_PROPERTY ( Alert_Info_ID, ALERT_MESSAGE_TEXT, Message8_In_Out );
             Alert_Result := SHOW_ALERT ( Alert_Info_ID );
           END IF;
         END IF;
--
      END p_img_execute;
--
-- This procedure is where all invocations to BXS will
--   occur, with the delivery of Banner General 5.3
--   (and later).  Any defect corrections etc. should
--   modify the code in this procedure, not in
--   similarly named p_img_execute (above).
--
-- New procedure delivered at General 5.3:
   PROCEDURE p_img_execute_v53
            (
                Current_Form_In            IN     VARCHAR2,
                Current_Block_In           IN     VARCHAR2,
                Current_Item_In            IN     VARCHAR2,
                Username_In                IN     VARCHAR2,
                InquiryOnly_Ind            IN     INTEGER,
                Quant_Results_In_Out       IN OUT INTEGER,
                AX_Application_Name_In_Out IN OUT VARCHAR2,
                Doc_Type_In_Out            IN OUT VARCHAR2,
                Force_WX_Flag_In           IN     INTEGER DEFAULT 0
            ) IS
--
   BEGIN
--
--       6.1000-1 - Intercept left click
--
     e$_img_driver2.p_call_xs(1);
   END p_img_execute_v53;
--
-- New procedure delivered at General 5.3:
--
   FUNCTION f_form_is_BXS_aware RETURN BOOLEAN IS
--
      bk_id                      BLOCK;
      it_id                      ITEM ;
--
   BEGIN
      bk_id := FIND_BLOCK ( 'G$_HORIZONTAL_TOOLBAR' );
--
      IF ID_NULL ( bk_id ) THEN
        RETURN FALSE;
      ELSE
        it_id := FIND_ITEM ( 'G$_HORIZONTAL_TOOLBAR.BXS_AWARE_IND' );
--
        IF ID_NULL ( it_id ) THEN
          RETURN FALSE;
        ELSE
          RETURN TRUE;
        END IF;
      END IF;
--
   END f_form_is_BXS_aware;
--
-- New procedure delivered at General 5.3:
--
   PROCEDURE P_Disp_BXS_Query_Info IS
   BEGIN
--
--  6.1000-1 - Intercept right click
--
     e$_img_driver2.p_call_xs(2);
   END P_Disp_BXS_Query_Info;
END;
		*/
		/* <p>
		*  5000-25 new code
		* 
		*  5300-3
		*  IMPORTANT NOTE:  Search for the word "Note" below
		*    for important information on where changes should
		*    and should not be made within this source code.
		* 
		*  5300-3  additional procedure added
		* *
		* *
		* * Declare private variables
		* *
		* *
		* * Define public subprogram bodies
		* *
		* 
		*  NOTE:  The following procedure must be left unaltered.
		*         Calls to this procedure were delivered as part
		*         of the 5.0 version of GOQOLIB, and therefore
		*         this code must be left intact to service those
		*         invocations.  Such invocations would come from
		*         forms that are not regenerated post-General 5.3.
		*         As of the 5.3 version of GOQOLIB,
		*         calls will only be made to the
		*         similar-named  procedure p_img_execute_v53 (below).
		*         It is that later (5.3) procedure that solely
		*         should changed for defect corrections etc.
		* 
		*  5600-1 
		*  GOQOLIB has been changed in general release 5.6, which requires all 
		*  Banner forms be recompiled. All newly compiled Banner forms will not 
		*  call this package. Instead, they will call EOQRPLS. But if a Banner form 
		*  is not recompiled, it will call this package.
		* 
		*  Add the code to intercept calls to this package and redirect it to e$_img_driver2.
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param currentFormIn
		* @param currentBlockIn
		* @param currentItemIn
		* @param usernameIn
		*/
		public void pImgExecute(NString currentFormIn, NString currentBlockIn, NString currentItemIn, NString usernameIn)
		{
			// 
			NString imagingUserIndInOut = toStr("N");
			NString message1InOut = toStr("");
			NString message2InOut = toStr("");
			NString message3InOut = toStr("");
			NString message4InOut = toStr("");
			NString message5InOut = toStr("");
			NString message6InOut = toStr("");
			NString message7InOut = toStr("");
			NString message8InOut = toStr("");
			// 
			AlertDescriptor alertInfoId = findAlert("G$_EXTEND_SOLUT_ALERT");
			AlertDescriptor alertInfo2Id = findAlert("G$_EXTEND_SOLUT_2_ALERT");
			NNumber alertResult= NNumber.getNull();
			Ref<NString> imaging_user_ind_in_out_ref = new Ref<NString>(imagingUserIndInOut);
			Ref<NString> message1_in_out_ref = new Ref<NString>(message1InOut);
			Ref<NString> message2_in_out_ref = new Ref<NString>(message2InOut);
			Ref<NString> message3_in_out_ref = new Ref<NString>(message3InOut);
			Ref<NString> message4_in_out_ref = new Ref<NString>(message4InOut);
			Ref<NString> message5_in_out_ref = new Ref<NString>(message5InOut);
			Ref<NString> message6_in_out_ref = new Ref<NString>(message6InOut);
			Ref<NString> message7_in_out_ref = new Ref<NString>(message7InOut);
			Ref<NString> message8_in_out_ref = new Ref<NString>(message8InOut);
			Gokimag.pCheckImaging(currentFormIn, currentBlockIn, currentItemIn, usernameIn, imaging_user_ind_in_out_ref, message1_in_out_ref, message2_in_out_ref, message3_in_out_ref, message4_in_out_ref, message5_in_out_ref, message6_in_out_ref, message7_in_out_ref, message8_in_out_ref);
			imagingUserIndInOut = imaging_user_ind_in_out_ref.val;
			message1InOut = message1_in_out_ref.val;
			message2InOut = message2_in_out_ref.val;
			message3InOut = message3_in_out_ref.val;
			message4InOut = message4_in_out_ref.val;
			message5InOut = message5_in_out_ref.val;
			message6InOut = message6_in_out_ref.val;
			message7InOut = message7_in_out_ref.val;
			message8InOut = message8_in_out_ref.val;
			// 
			if ( !message1InOut.isNull() )
			{
				if ( (alertInfoId == null) )
				{
					message(message1InOut);
				}
				else {
					setAlertMessageText(alertInfoId, message1InOut);
					alertResult = toNumber(showAlert(alertInfoId));
				}
			}
			// 
			if ( !message2InOut.isNull() )
			{
				if ( (alertInfoId == null) )
				{
					message(message2InOut);
				}
				else {
					setAlertMessageText(alertInfoId, message2InOut);
					alertResult = toNumber(showAlert(alertInfoId));
				}
			}
			// 
			if ( !message3InOut.isNull() )
			{
				if ( (alertInfoId == null) )
				{
					message(message3InOut);
				}
				else {
					setAlertMessageText(alertInfoId, message3InOut);
					alertResult = toNumber(showAlert(alertInfoId));
				}
			}
			// 
			if ( !message4InOut.isNull() )
			{
				if ( (alertInfoId == null) )
				{
					message(message4InOut);
				}
				else {
					setAlertMessageText(alertInfoId, message4InOut);
					alertResult = toNumber(showAlert(alertInfoId));
				}
			}
			// 
			if ( !message5InOut.isNull() )
			{
				if ( (alertInfoId == null) )
				{
					message(message5InOut);
				}
				else {
					setAlertMessageText(alertInfoId, message5InOut);
					alertResult = toNumber(showAlert(alertInfoId));
				}
			}
			// 
			if ( !message6InOut.isNull() )
			{
				if ( (alertInfoId == null) )
				{
					message(message6InOut);
				}
				else {
					setAlertMessageText(alertInfoId, message6InOut);
					alertResult = toNumber(showAlert(alertInfoId));
				}
			}
			// 
			if ( !message7InOut.isNull() )
			{
				if ( (alertInfoId == null) )
				{
					message(message7InOut);
				}
				else {
					setAlertMessageText(alertInfoId, message7InOut);
					alertResult = toNumber(showAlert(alertInfoId));
				}
			}
			// 
			if ( !message8InOut.isNull() )
			{
				if ( (alertInfoId == null) )
				{
					message(message8InOut);
				}
				else {
					setAlertMessageText(alertInfoId, message8InOut);
					alertResult = toNumber(showAlert(alertInfoId));
				}
			}
		}
/* <p>
		* 
		*  This procedure is where all invocations to BXS will
		*    occur, with the delivery of Banner General 5.3
		*    (and later).  Any defect corrections etc. should
		*    modify the code in this procedure, not in
		*    similarly named p_img_execute (above).
		* 
		*  New procedure delivered at General 5.3:
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param currentFormIn
		* @param currentBlockIn
		* @param currentItemIn
		* @param usernameIn
		* @param inquiryonlyInd
		* @param quantResultsInOut
		* @param axApplicationNameInOut
		* @param docTypeInOut
		*/
		public void pImgExecuteV53(NString currentFormIn, NString currentBlockIn, NString currentItemIn, NString usernameIn, NInteger inquiryonlyInd, Ref<NInteger> quantResultsInOut, Ref<NString> axApplicationNameInOut, Ref<NString> docTypeInOut) {
			pImgExecuteV53(currentFormIn, currentBlockIn, currentItemIn, usernameIn, inquiryonlyInd, quantResultsInOut, axApplicationNameInOut, docTypeInOut, toInt(0));
		}

/* <p>
		* 
		*  This procedure is where all invocations to BXS will
		*    occur, with the delivery of Banner General 5.3
		*    (and later).  Any defect corrections etc. should
		*    modify the code in this procedure, not in
		*    similarly named p_img_execute (above).
		* 
		*  New procedure delivered at General 5.3:
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param currentFormIn
		* @param currentBlockIn
		* @param currentItemIn
		* @param usernameIn
		* @param inquiryonlyInd
		* @param quantResultsInOut
		* @param axApplicationNameInOut
		* @param docTypeInOut
		* @param forceWxFlagIn
		*/
		public void pImgExecuteV53(NString currentFormIn, NString currentBlockIn, NString currentItemIn, NString usernameIn, NInteger inquiryonlyInd, Ref<NInteger> quantResultsInOut, Ref<NString> axApplicationNameInOut, Ref<NString> docTypeInOut, NInteger forceWxFlagIn)
		{
			// 
			//        6.1000-1 - Intercept left click
			// 
			getContainer().getEoqrpls().getEImgDriver2().pCallXs(toInt(1));
		}
/* <p>
		* 
		*  New procedure delivered at General 5.3:
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this function was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool fFormIsBxsAware()
		{
			// 
			BlockDescriptor bkId= null;
			ItemDescriptor itId= null;
			bkId = findBlock("G$_HORIZONTAL_TOOLBAR");
			// 
			if ( (bkId == null) )
			{
				return  toBool(NBool.False);
			}
			else {
				itId = findItem(toStr("G$_HORIZONTAL_TOOLBAR.BXS_AWARE_IND"));
				// 
				if ( (itId == null) )
				{
					return  toBool(NBool.False);
				}
				else {
					return  toBool(NBool.True);
				}
			}
		}
/* <p>
		* 
		*  New procedure delivered at General 5.3:
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pDispBxsQueryInfo()
		{
			// 
			//   6.1000-1 - Intercept right click
			// 
			getContainer().getEoqrpls().getEImgDriver2().pCallXs(toInt(2));
		}
		
	
	
}
