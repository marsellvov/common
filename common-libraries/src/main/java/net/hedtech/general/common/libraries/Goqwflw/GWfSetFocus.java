package net.hedtech.general.common.libraries.Goqwflw;

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
import net.hedtech.general.common.libraries.Goqrpls.*;

public class GWfSetFocus extends AbstractSupportCodeObject {
	

	public GWfSetFocus(ISupportCodeContainer container) {
		super(container);
		
		if ( getContainer().getGWfConditions().envSupportsWindowControl().getValue() )
		{
			//  The following library and function are invoked
			//  in all supported environments by this package.
			loadwinuser();
			rgSetforegroundwindow();
			if ( getContainer().getGoqrpls().gEnvIsWindows98().getValue() )
			{
				//  The following library and functions are only
				//  used in the Windows 98 environment by this package.
				loadwfsetfocus();
				rgGetactivewindow();
				rgGetforegroundwindow();
				rgGetnextwindow();
				rgForcetoforeground();
			}
		}

	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_SET_FOCUS
	/*
	PACKAGE G$_WF_SET_FOCUS IS

<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_SET_FOCUS provides the interfaces needed to
  control the behavior and appearance of the MDI (Multiple
  Document Interface) application window of Banner.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure MINIMIZE_WINDOW saves off the current display
  state of the Banner MDI application window in a variable
  and sets the current display state of this window to MINIMIZE.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE MINIMIZE_WINDOW;

<multilinecomment>--------------------------------------------------------------*\
  The procedure RESTORE_WINDOW interrogates the value of the
  variable that was stored off by any previous execution of
  the MINIMIZE_WINDOW procedure to set the current display
  state of the Banner MDI application window to whatever
  state it was before the last call to MINIMIZE_WINDOW.

  If MINIMIZE_WINDOW was not previously called, the display
  state is set to NORMAL by default.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE RESTORE_WINDOW;

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_FOCUS brings to the foreground and activates
  the Banner MDI application window.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE SET_FOCUS;

<multilinecomment>--------------------------------------------------------------*\
  The procedure SET_WIN_TITLE saves off the current title
  of the Banner MDI application window in a variable
  and appends to the current title the name of the workflow
  activity (if available) that is associated with a given
  task ID.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE SET_WIN_TITLE;

<multilinecomment>--------------------------------------------------------------*\
  The procedure RESET_WIN_TITLE interrogates the value of
  the variable that was stored off by any previous execution of
  SET_WIN_TITLE to set the current title of the Banner MDI
  application to whatever it was before the last call to
  SET_WIN_TITLE.

  If SET_WIN_TITLE was not previously called or if the saved off
  value of the title does not otherwise differ from the current
  window title, the title is not changed.
\*--------------------------------------------------------------</multilinecomment>

 PROCEDURE RESET_WIN_TITLE;

<multilinecomment>--------------------------------------------------------------*\
  The function ForceForegroundWindow utilizes the function
  ForceToForeground (described below) to force a window of a
  given handle to come to the foreground and be activated
  on Microsoft Windows platforms for which the invocation of
  the SetForegroundWindow function (described below) is not
  sufficient.

  This function contains conditional logic to ensure that the
  ForceToForeground function succeeds each time it is called. 

  It returns a nonzero value if it succeeds, and zero if it
  fails.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  ForceForegroundWindow   (hwnd_in                 PLS_INTEGER) RETURN PLS_INTEGER;

<multilinecomment>--------------------------------------------------------------*\
  The function SetForegroundWindow provides an interface to the
  SetForegroundWindow function as provided by the Microsoft
  Win32 application programming interface (API). 

  As documented by the MSDN Online Library (September 28, 1999),
  the SetForegroundWindow function puts the thread that created
  the window of a given handle into the foreground and activates
  the window.

  If the window was brought to the foreground, the return value
  is nonzero.

  If the window was not brought to the foreground, the return
  value is zero (in testing, however, it was found that even
  when the window has been brought to the foreground, the return
  value is sometimes zero). 
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  SetForegroundWindow     (hwnd_in                 PLS_INTEGER) RETURN PLS_INTEGER;

<multilinecomment>--------------------------------------------------------------*\
  The function GetActiveWindow provides an interface to the
  GetActiveWindow function as provided by the Microsoft
  Win32 application programming interface (API). 

  As documented by the MSDN Online Library (September 28, 1999),
  the GetActiveWindow function returns the handle to the active
  window attached to the calling thread's message queue.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  GetActiveWindow                                               RETURN PLS_INTEGER;

<multilinecomment>--------------------------------------------------------------*\
  The function GetForegroundWindow provides an interface to the
  GetForegroundWindow function as provided by the Microsoft
  Win32 application programming interface (API). 

  As documented by the MSDN Online Library (September 28, 1999),
  the GetForegroundWindow function returns the handle to the
  foreground window (the window with which the user is currently
  working).
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  GetForegroundWindow                                           RETURN PLS_INTEGER;

<multilinecomment>--------------------------------------------------------------*\
  The function GetNextWindow provides an interface to the
  GetNextWindow (or GetNextQueueWindow) function as provided by
  the Microsoft Win32 application programming interface (API). 

  As documented by the MSDN Online Library (September 28, 1999),
  the GetNextWindow function returns the handle to the next or
  previous window in the Z order relative to the window of a
  given handle. The next window is below the specified window;
  the previous window is above.

  Whether this function returns a handle to the window below
  or above the given window is dependent upon the direction
  specified when the function is invoked.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  GetNextWindow           (hwnd_in                 PLS_INTEGER,
                                    direction_in            PLS_INTEGER) RETURN PLS_INTEGER;

<multilinecomment>--------------------------------------------------------------*\
  The function ForceToForeground provides an interface to the
  ForceToForeground function contained within the Set Focus
  interface object that is distributed with the Workflow
  client installation package (see the value of
  G$_WF_HEADER.SETFOCUS_INTERFACE_OBJECT for the name of this
  object).

  This function forces a window of a given handle to come to the
  foreground and be activated on Microsoft Windows platforms for
  which the invocation of the SetForegroundWindow function
  (described above) is not sufficient.

  It returns a non-zero value if it succeeds, and zero if it
  fails.
\*--------------------------------------------------------------</multilinecomment>

 FUNCTION  ForceToForeground       (hwnd_in                 PLS_INTEGER) RETURN PLS_INTEGER;

END G$_WF_SET_FOCUS;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_SET_FOCUS
		/*
		PACKAGE BODY G$_WF_SET_FOCUS IS

--*
--* Declare private variables
--*

   vcCurrProgUnit            CONSTANT  VARCHAR2(30)           := 'G$_WF_SET_FOCUS';
   lh_WinUser                          ORA_FFI.LIBHANDLETYPE;
   lh_WfSetFocus                       ORA_FFI.LIBHANDLETYPE;
   fh_SetForegroundWindow              ORA_FFI.FUNCHANDLETYPE;
   fh_GetActiveWindow                  ORA_FFI.FUNCHANDLETYPE;
   fh_GetForegroundWindow              ORA_FFI.FUNCHANDLETYPE;
   fh_GetNextWindow                    ORA_FFI.FUNCHANDLETYPE;
   fh_ForceToForeground                ORA_FFI.FUNCHANDLETYPE;

--*
--* Declare private subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\
  The procedure LoadWinUser verifies that the dynamic link library
  which contains each of the Microsoft Win32 API functions to
  be invoked by this package has been loaded and can be located.
\*--------------------------------------------------------------</multilinecomment>

   PROCEDURE LoadWinUser;

<multilinecomment>--------------------------------------------------------------*\
  The procedure LoadWfSetFocus verifies that the dynamic link
  library which serves as the Set Focus interface object that is
  distributed with the Workflow client installation package
  has been loaded and can be located.
\*--------------------------------------------------------------</multilinecomment>

   PROCEDURE LoadWfSetFocus;

<multilinecomment>--------------------------------------------------------------*\
  The following functions will actually invoke the foreign
  functions of the Win32 API and Set Focus dynamic link libraries.

  Their similarly named procedures will initialize their
  corresponding foreign functions by registering the functions
  (obtaining a function handle), registering their parameter
  types, and registering their return types.
\*--------------------------------------------------------------</multilinecomment>

   FUNCTION  i_SetForegroundWindow(
			FunctionHandle_in		ORA_FFI.FUNCHANDLETYPE,
			hwnd_in				PLS_INTEGER
			) RETURN PLS_INTEGER;
   PROCEDURE rg_SetForegroundWindow;

   FUNCTION  i_GetActiveWindow(
			FunctionHandle_in		ORA_FFI.FUNCHANDLETYPE
			) RETURN PLS_INTEGER;
   PROCEDURE rg_GetActiveWindow;

   FUNCTION  i_GetForegroundWindow(
			FunctionHandle_in		ORA_FFI.FUNCHANDLETYPE
			) RETURN PLS_INTEGER;
   PROCEDURE rg_GetForegroundWindow;

   FUNCTION  i_GetNextWindow(
			FunctionHandle_in		ORA_FFI.FUNCHANDLETYPE,
			hwnd_in				PLS_INTEGER,
                        direction_in		        PLS_INTEGER
			) RETURN PLS_INTEGER;
   PROCEDURE rg_GetNextWindow;

   FUNCTION  i_ForceToForeground(
			FunctionHandle_in		ORA_FFI.FUNCHANDLETYPE,
			hwnd_in				PLS_INTEGER
			) RETURN PLS_INTEGER;
   PROCEDURE rg_ForceToForeground;

<multilinecomment>--------------------------------------------------------------*\
  The procedure DECLARE_FOCUS_AS_SET sets the value of a variable
  to indicate that the Banner MDI application window has
  been brought to the foreground and activated.
\*--------------------------------------------------------------</multilinecomment>

   PROCEDURE DECLARE_FOCUS_AS_SET;

<multilinecomment>--------------------------------------------------------------*\
  The following PRAGMA statements invoke their corresponding
  foreign functions by passing control to the memory location
  in Oracle Forms that can communicate with dynamic libraries.
\*--------------------------------------------------------------</multilinecomment>

   PRAGMA INTERFACE(C,i_SetForegroundWindow, 11265);
   PRAGMA INTERFACE(C,i_GetActiveWindow,     11265);
   PRAGMA INTERFACE(C,i_GetForegroundWindow, 11265);
   PRAGMA INTERFACE(C,i_GetNextWindow,       11265);
   PRAGMA INTERFACE(C,i_ForceToForeground,   11265);
  
--*
--* Define public subprogram bodies
--*

-- 5000-1 Update the public subprograms and body of this package to use the
--        new function G$_WF_CONDITIONS.ENV_SUPPORTS_WINDOW_CONTROL instead
--        of the function G$_WF_CONDITIONS.IS_WF_SUPPORTED_ENV.  This will
--        enable the Web to be recognized as a Workflow-supported environment
--        but to be excluded as an environment in which control over
--        the properties of windows is implemented.

PROCEDURE MINIMIZE_WINDOW IS
 vcCurrSubprog   CONSTANT  VARCHAR2(30) := 'MINIMIZE_WINDOW';
 vcOrigState               VARCHAR2(30);

BEGIN
 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0244','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

 IF G$_WF_CONDITIONS.ENV_SUPPORTS_WINDOW_CONTROL THEN

   vcOrigState := GET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,WINDOW_STATE);

   COPY(vcOrigState,'GLOBAL.WF_ORIG_WIN_STATE');

   SYNCHRONIZE;
   SET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,WINDOW_STATE,MINIMIZE);

 END IF;

 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0245','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

EXCEPTION
  WHEN OTHERS THEN
    G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

END MINIMIZE_WINDOW;

-------------------------
-------------------------

PROCEDURE RESTORE_WINDOW IS
 vcCurrSubprog   CONSTANT  VARCHAR2(30) := 'RESTORE_WINDOW';
 vcOrigState               VARCHAR2(30);

BEGIN
 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0246','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

 IF G$_WF_CONDITIONS.ENV_SUPPORTS_WINDOW_CONTROL THEN

    vcOrigState := NVL(NAME_IN('GLOBAL.WF_ORIG_WIN_STATE'),'NORMAL');

    IF vcOrigState = 'NORMAL' THEN
      SET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,WINDOW_STATE,NORMAL);
    ELSIF vcOrigState = 'MAXIMIZE' THEN
      SET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,WINDOW_STATE,MAXIMIZE);
    END IF;

 END IF;

 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0247','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

EXCEPTION
  WHEN OTHERS THEN
    G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

END RESTORE_WINDOW;

------------------------------
------------------------------

PROCEDURE SET_FOCUS IS
 vcCurrSubprog                  CONSTANT  VARCHAR2(30) := 'SET_FOCUS';
 iMDIWinHandle                            PLS_INTEGER;
 iSetForegroundWinResult                  PLS_INTEGER;
 iForceForegroundWinResult                PLS_INTEGER;
 vcErrMsg                                 VARCHAR2(160);
 excSetFocusFailure                       EXCEPTION;

BEGIN
 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0248','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

 IF NOT G$_WF_CONDITIONS.IS_FOCUS_SET THEN

   IF G$_WF_CONDITIONS.ENV_SUPPORTS_WINDOW_CONTROL THEN

     iMDIWinHandle        := GET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,WINDOW_HANDLE);

     G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0249','LIB','%01%.%02%: The MDI window handle is %03%.',vcCurrProgUnit,vcCurrSubprog,TO_CHAR(iMDIWinHandle)));

     IF G$_ENV_IS_WINDOWS98 THEN

       -- If the current environment is Windows 98, then the SetForegroundWindow
       -- function cannot be used, as Microsoft changed the design of the SetForegroundWindow
       -- Win32 API function for Windows 98.  In this environment, a call to SetForegroundWindow
       -- does not bring a given window into the foreground and activate it.  Rather, it simply
       -- activates the window of a given handle and notifies the user of the activation by
       -- flashing the icon for the current foreground window.
       --
       -- Use the ForceForegroundWindow function instead to achieve the desired effect.

       G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0250','LIB','%01%.%02%: About to force the MDI window to the foreground.',vcCurrProgUnit,vcCurrSubprog));

       iForceForegroundWinResult := ForceForegroundWindow(iMDIWinHandle);

       G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0251','LIB','%01%.%02%: The force foreground result is %03%.',vcCurrProgUnit,vcCurrSubprog,TO_CHAR(iForceForegroundWinResult)));

       IF iForceForegroundWinResult = 0 THEN

         -- If the return value of the ForceForegroundWindow call is 0, then present the user
         -- with the appropriate error message.

         vcErrMsg := G$_NLS.Get('GOQWFLW-0252','LIB','*ERROR* Failed to force to the foreground the window containing this Banner session.');

         RAISE excSetFocusFailure;

       END IF;

     ELSE

       -- If the current environment is not Windows 98, then the SetForegroundWindow
       -- function can be used.

       G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0253','LIB','%01%.%02%: About to bring the MDI window to the foreground.',vcCurrProgUnit,vcCurrSubprog));

       iSetForegroundWinResult := SetForegroundWindow(iMDIWinHandle);

       G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0254','LIB','%01%.%02%: The set foreground result is %03%.',vcCurrProgUnit,vcCurrSubprog,TO_CHAR(iSetForegroundWinResult)));

     END IF;

     G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0255','LIB','%01%.%02%: About to synchronize.',vcCurrProgUnit,vcCurrSubprog));

     SYNCHRONIZE;

     G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0256','LIB','%01%.%02%: About to redisplay.',vcCurrProgUnit,vcCurrSubprog));

     REDISPLAY;

     DECLARE_FOCUS_AS_SET;

   END IF;

 END IF;

 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0257','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

EXCEPTION
  WHEN excSetFocusFailure THEN

    IF vcErrMsg IS NOT NULL THEN

      G$_WF_ERROR.DISPLAY_ERROR(vcErrMsg,'MESSAGE',FALSE,FALSE);
      G$_WF_ERROR.DISPLAY_ERROR(vcErrMsg,'MESSAGE',FALSE,FALSE);

      CLEAR_MESSAGE;

      vcErrMsg := NULL;

    END IF;

  WHEN OTHERS THEN
    G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

END SET_FOCUS;

------------------------
------------------------

 PROCEDURE SET_WIN_TITLE IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'SET_WIN_TITLE';
  vcOrigTitle              VARCHAR2(200);
  vcActivName              VARCHAR2(200);
  vcNewTitle               VARCHAR2(200);

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0258','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF G$_WF_CONDITIONS.ENV_SUPPORTS_WINDOW_CONTROL THEN

    IF NVL(NAME_IN('GLOBAL.WF_ORIG_WIN_TITLE'),'NONE') = 'NONE' THEN

      vcOrigTitle := GET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,TITLE);

      COPY(vcOrigTitle,'GLOBAL.WF_ORIG_WIN_TITLE');

        vcActivName := G$_WF_BA.GET_ACTIVITY_NAME(G$_WF_BA.GET_WORK_ID);

        IF vcActivName IS NOT NULL THEN
          vcNewTitle := vcOrigTitle || '  <' || vcActivName || '>';
          SET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,TITLE,vcNewTitle);
        END IF;

    END IF;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0259','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

 END SET_WIN_TITLE;

------------------------
------------------------

 PROCEDURE RESET_WIN_TITLE IS
  vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'RESET_WIN_TITLE';
  vcCurrTitle              VARCHAR2(200);
  vcOrigTitle              VARCHAR2(200);

 BEGIN
  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0260','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

  IF G$_WF_CONDITIONS.ENV_SUPPORTS_WINDOW_CONTROL THEN

    vcOrigTitle := NVL(NAME_IN('GLOBAL.WF_ORIG_WIN_TITLE'),'NONE');
    vcCurrTitle := NVL(GET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,TITLE),'NONE');

    IF vcCurrTitle <> vcOrigTitle THEN
      SET_WINDOW_PROPERTY(FORMS_MDI_WINDOW,TITLE,vcOrigTitle);
    END IF;

  END IF;

  G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0261','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

 END RESET_WIN_TITLE;

-----------------------
-----------------------

FUNCTION ForceForegroundWindow(hwnd_in  PLS_INTEGER) RETURN PLS_INTEGER IS
 vcCurrSubprog                  CONSTANT  VARCHAR2(30) := 'FORCEFOREGROUNDWINDOW';
 iActiveWinHandle                         PLS_INTEGER;
 iForegroundWinHandle                     PLS_INTEGER;
 iGW_HWNDPREV                   CONSTANT  PLS_INTEGER := 3;
 iPrevWinHandle                           PLS_INTEGER;
 iSetForegroundResult                     PLS_INTEGER;
 iForceToForegroundResult                 PLS_INTEGER;
 iSuccessInd                              PLS_INTEGER := 1;
 excExitFunction                          EXCEPTION;

BEGIN
 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0262','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

 iActiveWinHandle := NVL(GetActiveWindow,0);

 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0263','LIB','%01%.%02%: The active window handle is %03%.',vcCurrProgUnit,vcCurrSubprog,TO_CHAR(iActiveWinHandle)));


 iForegroundWinHandle := NVL(GetForegroundWindow,0);

 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0264','LIB','%01%.%02%: The foreground window handle is %03%.',vcCurrProgUnit,vcCurrSubprog,TO_CHAR(iForegroundWinHandle)));


 IF (iActiveWinHandle <> 0) AND
    (iActiveWinHandle = iForegroundWinHandle) THEN

   -- If the currently active window is also considered
   -- the foreground window, temporarily bring to the
   -- foreground whatever is the previous window in the
   -- Z order before calling the ForceToForeground
   -- interface.
   --
   -- This increases the probability that the given window
   -- will be brought to the foreground and activated under
   -- all conditions.

   iPrevWinHandle := GetNextWindow(hwnd_in,iGW_HWNDPREV);

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0265','LIB','%01%.%02%: The previous handle to the given window handle is %03%.',vcCurrProgUnit,vcCurrSubprog,TO_CHAR(iPrevWinHandle)));


   IF iPrevWinHandle IS NULL THEN

     -- If a handle for the previous window cannot be identified, then
     -- notify the calling program of the failure of this function.

     iSuccessInd := 0;
     RAISE excExitFunction;
   END IF;


   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0266','LIB','%01%.%02%: About to bring the previous window to the foreground.',vcCurrProgUnit,vcCurrSubprog));

   iSetForegroundResult := SetForegroundWindow(iPrevWinHandle);

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0267','LIB','%01%.%02%: The set foreground result is %03%.',vcCurrProgUnit,vcCurrSubprog,TO_CHAR(iSetForegroundResult)));

   IF iSetForegroundResult = 0 THEN

     -- If bringing the previous window to the foreground fails, then
     -- notify the calling program of the failure of this function.

     iSuccessInd := 0;
     RAISE excExitFunction;
   END IF;


   iActiveWinHandle := NULL;

   iActiveWinHandle := GetActiveWindow;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0268','LIB','%01%.%02%: The active window handle is now %03%.',vcCurrProgUnit,vcCurrSubprog,TO_CHAR(iActiveWinHandle)));


   iForegroundWinHandle := NULL;

   iForegroundWinHandle := GetForegroundWindow;

   G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0269','LIB','%01%.%02%: The foreground window handle is now %03%.',vcCurrProgUnit,vcCurrSubprog,TO_CHAR(iForegroundWinHandle)));

 END IF;


 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0270','LIB','%01%.%02%: About to force the window of the given handle to the foreground.',vcCurrProgUnit,vcCurrSubprog));

 iForceToForegroundResult := ForceToForeground(hwnd_in);

 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0271','LIB','%01%.%02%: The force foreground result is %03%.',vcCurrProgUnit,vcCurrSubprog,TO_CHAR(iForceToForegroundResult)));


 IF iForceToForegroundResult = 0 THEN

     -- If forcing the given window to the foreground fails, then
     -- notify the calling program of the failure of this function.

   iSuccessInd := 0;
   RAISE excExitFunction;
 END IF;


 iActiveWinHandle := NULL;

 iActiveWinHandle := GetActiveWindow;

 G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ': The active window handle is now ' || TO_CHAR(iActiveWinHandle) || '.');


 iForegroundWinHandle := NULL;

 iForegroundWinHandle := GetForegroundWindow;

 G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog || ': The foreground window handle is now ' || TO_CHAR(iForegroundWinHandle) || '.');


 G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0272','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));


 RAISE excExitFunction;

RETURN NULL; EXCEPTION
  WHEN excExitFunction THEN
    RETURN iSuccessInd;

  WHEN OTHERS THEN
    G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
    RETURN 0;

END ForceForegroundWindow;

-----------------------
-----------------------

FUNCTION  SetForegroundWindow(hwnd_in PLS_INTEGER) RETURN PLS_INTEGER IS
	vcCurrSubprog	CONSTANT	VARCHAR2(30)	:= 'SETFOREGROUNDWINDOW';
	RC                   		PLS_INTEGER;
	l_hwnd                  PLS_INTEGER	:= hwnd_in;
BEGIN
	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0273','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

	rc := i_SetForegroundWindow(
			fh_SetForegroundWindow,
			l_hwnd);

	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0274','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  RETURN RC;

EXCEPTION
  WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

     RETURN NULL; 
END SetForegroundWindow;

-----------------------
-----------------------

 FUNCTION  GetActiveWindow RETURN PLS_INTEGER IS
	vcCurrSubprog	CONSTANT	VARCHAR2(30)	:= 'GETACTIVEWINDOW';
	RC                   		PLS_INTEGER;

 BEGIN
	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0275','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

	rc := i_GetActiveWindow(fh_GetActiveWindow);

	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0276','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  RETURN RC;

 EXCEPTION
     WHEN OTHERS THEN
       G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

       RETURN NULL; 
 END GetActiveWindow;

-----------------------
-----------------------

 FUNCTION  GetForegroundWindow RETURN PLS_INTEGER IS
	vcCurrSubprog	CONSTANT	VARCHAR2(30)	:= 'GETFOREGROUNDWINDOW';
	RC                   		PLS_INTEGER;

 BEGIN
	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0277','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

	rc := i_GetForegroundWindow(fh_GetForegroundWindow);

	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0278','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  RETURN RC;

 EXCEPTION
  WHEN OTHERS THEN
    G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

    RETURN NULL; 
 END GetForegroundWindow;

-----------------------
-----------------------

 FUNCTION  GetNextWindow(
			hwnd_in         PLS_INTEGER,
			direction_in		PLS_INTEGER) RETURN PLS_INTEGER IS
	vcCurrSubprog	CONSTANT	VARCHAR2(30)	:= 'GETNEXTWINDOW';
	RC                   		PLS_INTEGER;
 BEGIN
	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0279','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

	rc := i_GetNextWindow(fh_GetNextWindow,	hwnd_in, direction_in);

	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0280','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  RETURN RC;

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

     RETURN NULL; 
 END GetNextWindow;

-----------------------
-----------------------

 FUNCTION  ForceToForeground(hwnd_in PLS_INTEGER) RETURN PLS_INTEGER IS
	vcCurrSubprog	CONSTANT	VARCHAR2(30)	:= 'FORCETOFOREGROUND';
	RC                   		PLS_INTEGER;
	l_hwnd                  PLS_INTEGER	:= hwnd_in;
 BEGIN
	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0281','LIB','%01%.%02% BEGIN',vcCurrProgUnit,vcCurrSubprog));

	rc := i_ForceToForeground(fh_ForceToForeground,	l_hwnd);

	G$_WF_LOGGING.DEBUG_MSG(G$_NLS.Get('GOQWFLW-0282','LIB','%01%.%02% END',vcCurrProgUnit,vcCurrSubprog));

  RETURN RC;

 EXCEPTION
   WHEN OTHERS THEN
     G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

     RETURN NULL; 
 END ForceToForeground;

--*
--* Define private subprogram bodies
--*

 PROCEDURE LoadWinUser IS
    vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'LOADWINUSER';
 BEGIN
	BEGIN
		lh_WinUser := ORA_FFI.FIND_LIBRARY('user32.dll');
	EXCEPTION
		WHEN ORA_FFI.FFI_ERROR THEN 
			lh_WinUser := ORA_FFI.LOAD_LIBRARY(NULL,'user32.dll');
	END;
 EXCEPTION
	WHEN OTHERS THEN
		FOR iErrors IN 1..TOOL_ERR.NERRORS LOOP
      G$_WF_ERROR.SHOW_EXCEPTION(TO_CHAR(TOOL_ERR.CODE) || ': ' || TOOL_ERR.MESSAGE,vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
			TOOL_ERR.POP;
		END LOOP;

		TOOL_ERR.CLEAR;

 END LoadWinUser;

-----------------------
-----------------------

 PROCEDURE LoadWfSetFocus IS
    vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'LOADWFSETFOCUS';
 BEGIN
	BEGIN
		lh_WfSetFocus := ORA_FFI.FIND_LIBRARY(G$_WF_HEADER.SETFOCUS_OBJECT_NAME);
	EXCEPTION
		WHEN ORA_FFI.FFI_ERROR THEN 
			lh_WfSetFocus := ORA_FFI.LOAD_LIBRARY(NULL,G$_WF_HEADER.SETFOCUS_OBJECT_NAME);
	END;
 EXCEPTION
	WHEN OTHERS THEN
		FOR iErrors IN 1..TOOL_ERR.NERRORS LOOP
      G$_WF_ERROR.SHOW_EXCEPTION(TO_CHAR(TOOL_ERR.CODE) || ': ' || TOOL_ERR.MESSAGE,vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
			TOOL_ERR.POP;
		END LOOP;

		TOOL_ERR.CLEAR;

 END LoadWfSetFocus;

-----------------------
-----------------------

 PROCEDURE rg_SetForegroundWindow IS
    vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'RG_SETFOREGROUNDWINDOW';
 BEGIN
	fh_SetForegroundWindow := ORA_FFI.REGISTER_FUNCTION(lh_WinUser,'SetForegroundWindow',ORA_FFI.C_STD);
	ORA_FFI.REGISTER_PARAMETER(fh_SetForegroundWindow,ORA_FFI.C_INT);
	ORA_FFI.REGISTER_RETURN(fh_SetForegroundWindow,ORA_FFI.C_LONG);
 EXCEPTION
	WHEN OTHERS THEN
		FOR iErrors IN 1..TOOL_ERR.NERRORS LOOP
      G$_WF_ERROR.SHOW_EXCEPTION(TO_CHAR(TOOL_ERR.CODE) || ': ' || TOOL_ERR.MESSAGE,vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
			TOOL_ERR.POP;
		END LOOP;

		TOOL_ERR.CLEAR;

 END rg_SetForegroundWindow;

-----------------------
-----------------------

 PROCEDURE rg_GetActiveWindow IS
    vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'RG_GETACTIVEWINDOW';
 BEGIN
	fh_GetActiveWindow := ORA_FFI.REGISTER_FUNCTION(lh_WinUser,'GetActiveWindow',ORA_FFI.C_STD);
	ORA_FFI.REGISTER_RETURN(fh_GetActiveWindow,ORA_FFI.C_LONG);
 EXCEPTION
	WHEN OTHERS THEN
		FOR iErrors IN 1..TOOL_ERR.NERRORS LOOP
      G$_WF_ERROR.SHOW_EXCEPTION(TO_CHAR(TOOL_ERR.CODE) || ': ' || TOOL_ERR.MESSAGE,vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
			TOOL_ERR.POP;
		END LOOP;

		TOOL_ERR.CLEAR;

 END rg_GetActiveWindow;

-----------------------
-----------------------

 PROCEDURE rg_GetForegroundWindow IS
    vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'RG_GETFOREGROUNDWINDOW';
 BEGIN
	fh_GetForegroundWindow := ORA_FFI.REGISTER_FUNCTION(lh_WinUser,'GetForegroundWindow',ORA_FFI.C_STD);
	ORA_FFI.REGISTER_RETURN(fh_GetForegroundWindow,ORA_FFI.C_LONG);
 EXCEPTION
	WHEN OTHERS THEN
		FOR iErrors IN 1..TOOL_ERR.NERRORS LOOP
      G$_WF_ERROR.SHOW_EXCEPTION(TO_CHAR(TOOL_ERR.CODE) || ': ' || TOOL_ERR.MESSAGE,vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
			TOOL_ERR.POP;
		END LOOP;

		TOOL_ERR.CLEAR;

 END rg_GetForegroundWindow;

-----------------------
-----------------------

 PROCEDURE rg_GetNextWindow IS
    vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'RG_GETNEXTWINDOW';
 BEGIN
	fh_GetNextWindow := ORA_FFI.REGISTER_FUNCTION(lh_WinUser,'GetNextQueueWindow',ORA_FFI.C_STD);
	ORA_FFI.REGISTER_PARAMETER(fh_GetNextWindow,ORA_FFI.C_INT);
	ORA_FFI.REGISTER_PARAMETER(fh_GetNextWindow,ORA_FFI.C_INT);
	ORA_FFI.REGISTER_RETURN(fh_GetNextWindow,ORA_FFI.C_LONG);
 EXCEPTION
	WHEN OTHERS THEN
		FOR iErrors IN 1..TOOL_ERR.NERRORS LOOP
      G$_WF_ERROR.SHOW_EXCEPTION(TO_CHAR(TOOL_ERR.CODE) || ': ' || TOOL_ERR.MESSAGE,vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
			TOOL_ERR.POP;
		END LOOP;

		TOOL_ERR.CLEAR;

 END rg_GetNextWindow;

-----------------------
-----------------------

 PROCEDURE rg_ForceToForeground IS
    vcCurrSubprog  CONSTANT  VARCHAR2(30) := 'RG_FORCETOFOREGROUND';
 BEGIN
	fh_ForceToForeground := ORA_FFI.REGISTER_FUNCTION(lh_WfSetFocus,'ForceToForeground',ORA_FFI.C_STD);
	ORA_FFI.REGISTER_PARAMETER(fh_ForceToForeground,ORA_FFI.C_INT);
	ORA_FFI.REGISTER_RETURN(fh_ForceToForeground,ORA_FFI.C_LONG);
 EXCEPTION
	WHEN OTHERS THEN
		FOR iErrors IN 1..TOOL_ERR.NERRORS LOOP
      G$_WF_ERROR.SHOW_EXCEPTION(TO_CHAR(TOOL_ERR.CODE) || ': ' || TOOL_ERR.MESSAGE,vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
			TOOL_ERR.POP;
		END LOOP;

		TOOL_ERR.CLEAR;

 END rg_ForceToForeground;

-----------------------
-----------------------

 PROCEDURE DECLARE_FOCUS_AS_SET IS
 BEGIN
  COPY('Y', 'GLOBAL.WF_FOCUS_IS_SET');

 END DECLARE_FOCUS_AS_SET;

--*
--* Begin initialization part of package
--*

BEGIN
 IF G$_WF_CONDITIONS.ENV_SUPPORTS_WINDOW_CONTROL THEN

   -- The following library and function are invoked
   -- in all supported environments by this package.

   LoadWinUser;
   rg_SetForegroundWindow;

   IF G$_ENV_IS_WINDOWS98 THEN

     -- The following library and functions are only
     -- used in the Windows 98 environment by this package.

     LoadWfSetFocus;
     rg_GetActiveWindow;
     rg_GetForegroundWindow;
     rg_GetNextWindow;
     rg_ForceToForeground;
   END IF;

 END IF;

END G$_WF_SET_FOCUS;
		*/
				// *
		// * Declare private variables
		// *
		public final NString VCCURRPROGUNIT = toStr("G$_WF_SET_FOCUS");
		private UnknownTypes.OraFfiLibhandletype lhWinuser= null;
		private UnknownTypes.OraFfiLibhandletype lhWfsetfocus= null;
		private UnknownTypes.OraFfiFunchandletype fhSetforegroundwindow= null;
		private UnknownTypes.OraFfiFunchandletype fhGetactivewindow= null;
		private UnknownTypes.OraFfiFunchandletype fhGetforegroundwindow= null;
		private UnknownTypes.OraFfiFunchandletype fhGetnextwindow= null;
		private UnknownTypes.OraFfiFunchandletype fhForcetoforeground= null;
/* <p>
		* --------------------------------------------------------------*\
		* The following functions will actually invoke the foreign
		* functions of the Win32 API and Set Focus dynamic link libraries.
		* Their similarly named procedures will initialize their
		* corresponding foreign functions by registering the functions
		* (obtaining a function handle), registering their parameter
		* types, and registering their return types.
		* \*--------------------------------------------------------------
/* </p>
		* @param hwndIn
		*/
		public NInteger ISetforegroundwindow(NInteger hwndIn)
		{
			this.getLogger().trace(this, "F2J : ISetforegroundwindow function is a wrapper to an external function 'SetForegroundWindow' defined in the external dll 'user32.dll'. See documentation for details ");
			
			return NInteger.getNull();
		}
/* <p>
/* </p>
		*/
		public NInteger IGetactivewindow()
		{
			this.getLogger().trace(this, "F2J : IGetactivewindow function is a wrapper to an external function 'GetActiveWindow' defined in the external dll 'user32.dll'. See documentation for details ");
			
			return NInteger.getNull();
		}
/* <p>
/* </p>
		*/
		public NInteger IGetforegroundwindow()
		{
			this.getLogger().trace(this, "F2J : IGetforegroundwindow function is a wrapper to an external function 'GetForegroundWindow' defined in the external dll 'user32.dll'. See documentation for details ");
			
			return NInteger.getNull();
		}
/* <p>
/* </p>
		* @param hwndIn
		* @param directionIn
		*/
		public NInteger IGetnextwindow(NInteger hwndIn, NInteger directionIn)
		{
			this.getLogger().trace(this, "F2J : IGetnextwindow function is a wrapper to an external function 'GetNextQueueWindow' defined in the external dll 'user32.dll'. See documentation for details ");
			
			return NInteger.getNull();
		}
/* <p>
/* </p>
		* @param hwndIn
		*/
		public NInteger IForcetoforeground(NInteger hwndIn)
		{
			this.getLogger().trace(this, "F2J : IForcetoforeground function is a wrapper to an external function 'ForceToForeground' defined in the external dll unknown. See documentation for details ");
			
			return NInteger.getNull();
		}
/* <p>
		* *
		* * Define public subprogram bodies
		* *
		*  5000-1 Update the public subprograms and body of this package to use the
		*         new function G$_WF_CONDITIONS.ENV_SUPPORTS_WINDOW_CONTROL instead
		*         of the function G$_WF_CONDITIONS.IS_WF_SUPPORTED_ENV.  This will
		*         enable the Web to be recognized as a Workflow-supported environment
		*         but to be excluded as an environment in which control over
		*         the properties of windows is implemented.
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void minimizeWindow()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("MINIMIZE_WINDOW");
//			NString vcorigstate= NString.getNull();
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0244"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				if ( getContainer().getGWfConditions().envSupportsWindowControl().getValue() )
//				{
//					// F2J_NOT_SUPPORTED : The property "WINDOW's WINDOW_STATE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#PROPERTY.WINDOW.WINDOW_STATE".
//					//					vcorigstate = SupportClasses.FORMS4W.GetWindowProperty(formsMdiWindow, SupportClasses.Property.WINDOW_STATE);
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'WINDOW's WINDOW_STATE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#PROPERTY.WINDOW.WINDOW_STATE'.");
//					
//					copy(vcorigstate,"GLOBAL.WF_ORIG_WIN_STATE");
//					// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeSynchronize".
//					//					SupportClasses.SQLFORMS.Synchronize();
//					////
//					System.err.println("// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeSynchronize'.");
//					
//					// F2J_NOT_SUPPORTED : The property "WINDOW's WINDOW_STATE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#PROPERTY.WINDOW.WINDOW_STATE".
//					//					SupportClasses.FORMS4W.SetWindowProperty(formsMdiWindow, SupportClasses.Property.WINDOW_STATE, WindowState.Minimized);
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'WINDOW's WINDOW_STATE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#PROPERTY.WINDOW.WINDOW_STATE'.");
//					
//				}
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0245"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : minimizeWindow procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* -----------------------
		* -----------------------
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void restoreWindow()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("RESTORE_WINDOW");
//			NString vcorigstate= NString.getNull();
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0246"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				if ( getContainer().getGWfConditions().envSupportsWindowControl().getValue() )
//				{
//					vcorigstate = isNull(getNameIn("GLOBAL.WF_ORIG_WIN_STATE"), "NORMAL");
//					if ( vcorigstate.equals("NORMAL") )
//					{
//						// F2J_NOT_SUPPORTED : The property "WINDOW's WINDOW_STATE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#PROPERTY.WINDOW.WINDOW_STATE".
//						//						SupportClasses.FORMS4W.SetWindowProperty(formsMdiWindow, SupportClasses.Property.WINDOW_STATE, WindowState.Normal);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : The property 'WINDOW's WINDOW_STATE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#PROPERTY.WINDOW.WINDOW_STATE'.");
//						
//					}
//					else if ( vcorigstate.equals("MAXIMIZE") ) {
//						// F2J_NOT_SUPPORTED : The property "WINDOW's WINDOW_STATE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#PROPERTY.WINDOW.WINDOW_STATE".
//						//						SupportClasses.FORMS4W.SetWindowProperty(formsMdiWindow, SupportClasses.Property.WINDOW_STATE, WindowState.Maximized);
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : The property 'WINDOW's WINDOW_STATE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#PROPERTY.WINDOW.WINDOW_STATE'.");
//						
//					}
//				}
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0247"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : restoreWindow procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ----------------------------
		* ----------------------------
/* </p>
		*/
		public void setFocus()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("SET_FOCUS");
//			NInteger imdiwinhandle= NInteger.getNull();
//			NInteger isetforegroundwinresult= NInteger.getNull();
//			NInteger iforceforegroundwinresult= NInteger.getNull();
//			NString vcerrmsg= NString.getNull();
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0248"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				if ( getContainer().getGWfConditions().isFocusSet().not() )
//				{
//					if ( getContainer().getGWfConditions().envSupportsWindowControl().getValue() )
//					{
//						// F2J_NOT_SUPPORTED : The property "WINDOW's WINDOW_HANDLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin11".
//						//						imdiwinhandle = toInt(SupportClasses.FORMS4W.GetWindowProperty(formsMdiWindow, SupportClasses.Property.WINDOW_HANDLE));
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : The property 'WINDOW's WINDOW_HANDLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin11'.");
//						
//						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0249"), toStr("LIB"), toStr("%01%.%02%: The MDI window handle is %03%."), VCCURRPROGUNIT, VCCURRSUBPROG, toChar(imdiwinhandle)));
//						if ( getContainer().getGoqrpls().gEnvIsWindows98().getValue() )
//						{
//							//  If the current environment is Windows 98, then the SetForegroundWindow
//							//  function cannot be used, as Microsoft changed the design of the SetForegroundWindow
//							//  Win32 API function for Windows 98.  In this environment, a call to SetForegroundWindow
//							//  does not bring a given window into the foreground and activate it.  Rather, it simply
//							//  activates the window of a given handle and notifies the user of the activation by
//							//  flashing the icon for the current foreground window.
//							// 
//							//  Use the ForceForegroundWindow function instead to achieve the desired effect.
//							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0250"), toStr("LIB"), toStr("%01%.%02%: About to force the MDI window to the foreground."), VCCURRPROGUNIT, VCCURRSUBPROG));
//							iforceforegroundwinresult = forceforegroundwindow(imdiwinhandle);
//							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0251"), toStr("LIB"), toStr("%01%.%02%: The force foreground result is %03%."), VCCURRPROGUNIT, VCCURRSUBPROG, toChar(iforceforegroundwinresult)));
//							if ( iforceforegroundwinresult.equals(0) )
//							{
//								//  If the return value of the ForceForegroundWindow call is 0, then present the user
//								//  with the appropriate error message.
//								vcerrmsg = GNls.Fget(toStr("GOQWFLW-0252"), toStr("LIB"), toStr("*ERROR* Failed to force to the foreground the window containing this Banner session."));
//								throw new Excsetfocusfailure();
//							}
//						}
//						else {
//							//  If the current environment is not Windows 98, then the SetForegroundWindow
//							//  function can be used.
//							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0253"), toStr("LIB"), toStr("%01%.%02%: About to bring the MDI window to the foreground."), VCCURRPROGUNIT, VCCURRSUBPROG));
//							isetforegroundwinresult = setforegroundwindow(imdiwinhandle);
//							getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0254"), toStr("LIB"), toStr("%01%.%02%: The set foreground result is %03%."), VCCURRPROGUNIT, VCCURRSUBPROG, toChar(isetforegroundwinresult)));
//						}
//						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0255"), toStr("LIB"), toStr("%01%.%02%: About to synchronize."), VCCURRPROGUNIT, VCCURRSUBPROG));
//						// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeSynchronize".
//						//						SupportClasses.SQLFORMS.Synchronize();
//						////
//						System.err.println("// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeSynchronize'.");
//						
//						getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0256"), toStr("LIB"), toStr("%01%.%02%: About to redisplay."), VCCURRPROGUNIT, VCCURRSUBPROG));
//						// F2J_NOT_SUPPORTED : Call to built-in "REDISPLAY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin12".
//						//						SupportClasses.SQLFORMS.Redisplay();
//						////
//						System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REDISPLAY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin12'.");
//						
//						declareFocusAsSet();
//					}
//				}
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0257"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//			}
//			catch(Excsetfocusfailure e)
//			{
//				if ( !vcerrmsg.isNull() )
//				{
//					getContainer().getGWfError().displayError(vcerrmsg, toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
//					
//					getContainer().getGWfError().displayError(vcerrmsg, toStr("MESSAGE"), toBool(NBool.False), toBool(NBool.False));
//					
//					clearMessage();
//					vcerrmsg = toStr(null);
//				}
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : setFocus procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ----------------------
		* ----------------------
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void setWinTitle()
		{

			final NString VCCURRSUBPROG = toStr("SET_WIN_TITLE");
			NString vcorigtitle= NString.getNull();
			NString vcactivname= NString.getNull();
			NString vcnewtitle= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0258"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
				if ( true /*getContainer().getGWfConditions().envSupportsWindowControl().getValue() */ )
				{
					WindowDescriptor main = TaskServices.getWorkspaceTask().findWindow("WORKSPACE_WINDOW");

					if ( isNull(getNameIn("GLOBAL.WF_ORIG_WIN_TITLE"), "NONE").equals("NONE") )
					{
						vcorigtitle = toStr(getWindowTitle(main));
						copy(vcorigtitle,"GLOBAL.WF_ORIG_WIN_TITLE");
						vcactivname = getContainer().getGWfBa().getActivityName(getContainer().getGWfBa().getWorkId());
						if ( !vcactivname.isNull() )
						{
							vcnewtitle = vcorigtitle.append("  <").append(vcactivname).append(">");
							setWindowTitle(main, vcnewtitle);
						}
					}
				}
				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0259"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
			}			
		}
/* <p>
		* ----------------------
		* ----------------------
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void resetWinTitle()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("RESET_WIN_TITLE");
//			NString vccurrtitle= NString.getNull();
//			NString vcorigtitle= NString.getNull();
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0260"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				if ( getContainer().getGWfConditions().envSupportsWindowControl().getValue() )
//				{
//					vcorigtitle = isNull(getNameIn("GLOBAL.WF_ORIG_WIN_TITLE"), "NONE");
//					vccurrtitle = isNull(getWindowTitle(formsMdiWindow), "NONE");
//					if ( vccurrtitle.notEquals(vcorigtitle) )
//					{
//						setWindowTitle(formsMdiWindow, vcorigtitle);
//					}
//				}
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0261"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : resetWinTitle procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param hwndIn
		*/
		public NInteger forceforegroundwindow(NInteger hwndIn)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("FORCEFOREGROUNDWINDOW");
//			NInteger iactivewinhandle= NInteger.getNull();
//			NInteger iforegroundwinhandle= NInteger.getNull();
//			final NInteger IGW_HWNDPREV = toInt(3);
//			NInteger iprevwinhandle= NInteger.getNull();
//			NInteger isetforegroundresult= NInteger.getNull();
//			NInteger iforcetoforegroundresult= NInteger.getNull();
//			NInteger isuccessind = toInt(1);
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0262"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				iactivewinhandle = isNull(getactivewindow(), 0);
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0263"), toStr("LIB"), toStr("%01%.%02%: The active window handle is %03%."), VCCURRPROGUNIT, VCCURRSUBPROG, toChar(iactivewinhandle)));
//				iforegroundwinhandle = isNull(getforegroundwindow(), 0);
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0264"), toStr("LIB"), toStr("%01%.%02%: The foreground window handle is %03%."), VCCURRPROGUNIT, VCCURRSUBPROG, toChar(iforegroundwinhandle)));
//				if ( (iactivewinhandle.notEquals(0)) && (iactivewinhandle.equals(iforegroundwinhandle)) )
//				{
//					//  If the currently active window is also considered
//					//  the foreground window, temporarily bring to the
//					//  foreground whatever is the previous window in the
//					//  Z order before calling the ForceToForeground
//					//  interface.
//					// 
//					//  This increases the probability that the given window
//					//  will be brought to the foreground and activated under
//					//  all conditions.
//					iprevwinhandle = getnextwindow(hwndIn, IGW_HWNDPREV);
//					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0265"), toStr("LIB"), toStr("%01%.%02%: The previous handle to the given window handle is %03%."), VCCURRPROGUNIT, VCCURRSUBPROG, toChar(iprevwinhandle)));
//					if ( iprevwinhandle.isNull() )
//					{
//						//  If a handle for the previous window cannot be identified, then
//						//  notify the calling program of the failure of this function.
//						isuccessind = toInt(0);
//						throw new Excexitfunction();
//					}
//					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0266"), toStr("LIB"), toStr("%01%.%02%: About to bring the previous window to the foreground."), VCCURRPROGUNIT, VCCURRSUBPROG));
//					isetforegroundresult = setforegroundwindow(iprevwinhandle);
//					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0267"), toStr("LIB"), toStr("%01%.%02%: The set foreground result is %03%."), VCCURRPROGUNIT, VCCURRSUBPROG, toChar(isetforegroundresult)));
//					if ( isetforegroundresult.equals(0) )
//					{
//						//  If bringing the previous window to the foreground fails, then
//						//  notify the calling program of the failure of this function.
//						isuccessind = toInt(0);
//						throw new Excexitfunction();
//					}
//					iactivewinhandle = toInt(null);
//					iactivewinhandle = getactivewindow();
//					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0268"), toStr("LIB"), toStr("%01%.%02%: The active window handle is now %03%."), VCCURRPROGUNIT, VCCURRSUBPROG, toChar(iactivewinhandle)));
//					iforegroundwinhandle = toInt(null);
//					iforegroundwinhandle = getforegroundwindow();
//					getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0269"), toStr("LIB"), toStr("%01%.%02%: The foreground window handle is now %03%."), VCCURRPROGUNIT, VCCURRSUBPROG, toChar(iforegroundwinhandle)));
//				}
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0270"), toStr("LIB"), toStr("%01%.%02%: About to force the window of the given handle to the foreground."), VCCURRPROGUNIT, VCCURRSUBPROG));
//				iforcetoforegroundresult = forcetoforeground(hwndIn);
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0271"), toStr("LIB"), toStr("%01%.%02%: The force foreground result is %03%."), VCCURRPROGUNIT, VCCURRSUBPROG, toChar(iforcetoforegroundresult)));
//				if ( iforcetoforegroundresult.equals(0) )
//				{
//					//  If forcing the given window to the foreground fails, then
//					//  notify the calling program of the failure of this function.
//					isuccessind = toInt(0);
//					throw new Excexitfunction();
//				}
//				iactivewinhandle = toInt(null);
//				iactivewinhandle = getactivewindow();
//				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(": The active window handle is now ").append(toChar(iactivewinhandle)).append("."));
//				iforegroundwinhandle = toInt(null);
//				iforegroundwinhandle = getforegroundwindow();
//				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG).append(": The foreground window handle is now ").append(toChar(iforegroundwinhandle)).append("."));
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0272"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				throw new Excexitfunction();
//				return NInteger.getNull();
//			}
//			catch(Excexitfunction e)
//			{
//				return isuccessind;
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//				return  toInt(0);
//			}
//
			this.getLogger().trace(this, "F2J : forceforegroundwindow function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param hwndIn
		*/
		public NInteger setforegroundwindow(NInteger hwndIn)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("SETFOREGROUNDWINDOW");
//			NInteger rc= NInteger.getNull();
//			NInteger lHwnd = hwndIn;
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0273"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				rc = iSetforegroundwindow(lHwnd);
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0274"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				return rc;
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//				return NInteger.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : setforegroundwindow function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger getactivewindow()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("GETACTIVEWINDOW");
//			NInteger rc= NInteger.getNull();
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0275"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				rc = iGetactivewindow();
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0276"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				return rc;
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//				return NInteger.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : getactivewindow function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger getforegroundwindow()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("GETFOREGROUNDWINDOW");
//			NInteger rc= NInteger.getNull();
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0277"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				rc = iGetforegroundwindow();
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0278"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				return rc;
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//				return NInteger.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : getforegroundwindow function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param hwndIn
		* @param directionIn
		*/
		public NInteger getnextwindow(NInteger hwndIn, NInteger directionIn)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("GETNEXTWINDOW");
//			NInteger rc= NInteger.getNull();
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0279"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				rc = iGetnextwindow(hwndIn, directionIn);
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0280"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				return rc;
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//				return NInteger.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : getnextwindow function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param hwndIn
		*/
		public NInteger forcetoforeground(NInteger hwndIn)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("FORCETOFOREGROUND");
//			NInteger rc= NInteger.getNull();
//			NInteger lHwnd = hwndIn;
//			try
//			{
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0281"), toStr("LIB"), toStr("%01%.%02% BEGIN"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				rc = iForcetoforeground(lHwnd);
//				getContainer().getGWfLogging().debugMsg(GNls.Fget(toStr("GOQWFLW-0282"), toStr("LIB"), toStr("%01%.%02% END"), VCCURRPROGUNIT, VCCURRSUBPROG));
//				return rc;
//			}
//			catch(Exception  e)
//			{
//				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins".
//				//				getContainer().getGWfError().showException(isNull(SupportClasses.SQLFORMS.ErrorText(), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
//				
//				return NInteger.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : forcetoforeground function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* *
		* * Define private subprogram bodies
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void loadwinuser()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("LOADWINUSER");
//			try
//			{
//				try
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "FIND_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin13".
//					//					lhWinuser = SupportClasses.ORA_FFI.FindLibrary("user32.dll");
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin13'.");
//					
//				}
//				catch(Exception e)
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "LOAD_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
//					//					lhWinuser = SupportClasses.ORA_FFI.LoadLibrary(null, "user32.dll");
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'LOAD_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
//					
//				}
//			}
//			catch(Exception  e)
//			{
//				for ( int ierrors = 1; ierrors <= SupportClasses.TOOL_ERR.Nerrors(); ierrors++ )
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "CODE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
//					//					getContainer().getGWfError().showException(toChar(SupportClasses.TOOL_ERR.Code()).append(": ").append(message()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CODE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
//					
//					// F2J_NOT_SUPPORTED : Call to built-in "POP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
//					//					SupportClasses.TOOL_ERR.Pop();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'POP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
//					
//				}
//				// F2J_NOT_SUPPORTED : Call to built-in "CLEAR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
//				//				SupportClasses.TOOL_ERR.Clear();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLEAR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : loadwinuser procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void loadwfsetfocus()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("LOADWFSETFOCUS");
//			try
//			{
//				try
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "FIND_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin13".
//					//					lhWfsetfocus = SupportClasses.ORA_FFI.FindLibrary(GWfHeader.setfocusObjectName);
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'FIND_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin13'.");
//					
//				}
//				catch(Exception e)
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "LOAD_LIBRARY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin14".
//					//					lhWfsetfocus = SupportClasses.ORA_FFI.LoadLibrary(null, GWfHeader.setfocusObjectName);
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'LOAD_LIBRARY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin14'.");
//					
//				}
//			}
//			catch(Exception  e)
//			{
//				for ( int ierrors = 1; ierrors <= SupportClasses.TOOL_ERR.Nerrors(); ierrors++ )
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "CODE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
//					//					getContainer().getGWfError().showException(toChar(SupportClasses.TOOL_ERR.Code()).append(": ").append(message()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CODE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
//					
//					// F2J_NOT_SUPPORTED : Call to built-in "POP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
//					//					SupportClasses.TOOL_ERR.Pop();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'POP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
//					
//				}
//				// F2J_NOT_SUPPORTED : Call to built-in "CLEAR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
//				//				SupportClasses.TOOL_ERR.Clear();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLEAR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : loadwfsetfocus procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void rgSetforegroundwindow()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("RG_SETFOREGROUNDWINDOW");
//			try
//			{
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_FUNCTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin18".
//				//				fhSetforegroundwindow = SupportClasses.ORA_FFI.RegisterFunction(lhWinuser, "SetForegroundWindow", OraFfi.cStd);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_FUNCTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin18'.");
//				
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_PARAMETER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin19".
//				//				SupportClasses.ORA_FFI.RegisterParameter(fhSetforegroundwindow, OraFfi.cInt);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_PARAMETER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin19'.");
//				
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_RETURN" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//				//				SupportClasses.ORA_FFI.RegisterReturn(fhSetforegroundwindow, OraFfi.cLong);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_RETURN' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//				
//			}
//			catch(Exception  e)
//			{
//				for ( int ierrors = 1; ierrors <= SupportClasses.TOOL_ERR.Nerrors(); ierrors++ )
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "CODE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
//					//					getContainer().getGWfError().showException(toChar(SupportClasses.TOOL_ERR.Code()).append(": ").append(message()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CODE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
//					
//					// F2J_NOT_SUPPORTED : Call to built-in "POP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
//					//					SupportClasses.TOOL_ERR.Pop();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'POP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
//					
//				}
//				// F2J_NOT_SUPPORTED : Call to built-in "CLEAR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
//				//				SupportClasses.TOOL_ERR.Clear();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLEAR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : rgSetforegroundwindow procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void rgGetactivewindow()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("RG_GETACTIVEWINDOW");
//			try
//			{
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_FUNCTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin18".
//				//				fhGetactivewindow = SupportClasses.ORA_FFI.RegisterFunction(lhWinuser, "GetActiveWindow", OraFfi.cStd);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_FUNCTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin18'.");
//				
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_RETURN" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//				//				SupportClasses.ORA_FFI.RegisterReturn(fhGetactivewindow, OraFfi.cLong);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_RETURN' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//				
//			}
//			catch(Exception  e)
//			{
//				for ( int ierrors = 1; ierrors <= SupportClasses.TOOL_ERR.Nerrors(); ierrors++ )
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "CODE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
//					//					getContainer().getGWfError().showException(toChar(SupportClasses.TOOL_ERR.Code()).append(": ").append(message()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CODE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
//					
//					// F2J_NOT_SUPPORTED : Call to built-in "POP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
//					//					SupportClasses.TOOL_ERR.Pop();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'POP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
//					
//				}
//				// F2J_NOT_SUPPORTED : Call to built-in "CLEAR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
//				//				SupportClasses.TOOL_ERR.Clear();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLEAR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : rgGetactivewindow procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void rgGetforegroundwindow()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("RG_GETFOREGROUNDWINDOW");
//			try
//			{
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_FUNCTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin18".
//				//				fhGetforegroundwindow = SupportClasses.ORA_FFI.RegisterFunction(lhWinuser, "GetForegroundWindow", OraFfi.cStd);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_FUNCTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin18'.");
//				
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_RETURN" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//				//				SupportClasses.ORA_FFI.RegisterReturn(fhGetforegroundwindow, OraFfi.cLong);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_RETURN' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//				
//			}
//			catch(Exception  e)
//			{
//				for ( int ierrors = 1; ierrors <= SupportClasses.TOOL_ERR.Nerrors(); ierrors++ )
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "CODE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
//					//					getContainer().getGWfError().showException(toChar(SupportClasses.TOOL_ERR.Code()).append(": ").append(message()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CODE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
//					
//					// F2J_NOT_SUPPORTED : Call to built-in "POP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
//					//					SupportClasses.TOOL_ERR.Pop();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'POP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
//					
//				}
//				// F2J_NOT_SUPPORTED : Call to built-in "CLEAR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
//				//				SupportClasses.TOOL_ERR.Clear();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLEAR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : rgGetforegroundwindow procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void rgGetnextwindow()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("RG_GETNEXTWINDOW");
//			try
//			{
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_FUNCTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin18".
//				//				fhGetnextwindow = SupportClasses.ORA_FFI.RegisterFunction(lhWinuser, "GetNextQueueWindow", OraFfi.cStd);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_FUNCTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin18'.");
//				
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_PARAMETER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin19".
//				//				SupportClasses.ORA_FFI.RegisterParameter(fhGetnextwindow, OraFfi.cInt);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_PARAMETER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin19'.");
//				
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_PARAMETER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin19".
//				//				SupportClasses.ORA_FFI.RegisterParameter(fhGetnextwindow, OraFfi.cInt);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_PARAMETER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin19'.");
//				
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_RETURN" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//				//				SupportClasses.ORA_FFI.RegisterReturn(fhGetnextwindow, OraFfi.cLong);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_RETURN' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//				
//			}
//			catch(Exception  e)
//			{
//				for ( int ierrors = 1; ierrors <= SupportClasses.TOOL_ERR.Nerrors(); ierrors++ )
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "CODE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
//					//					getContainer().getGWfError().showException(toChar(SupportClasses.TOOL_ERR.Code()).append(": ").append(message()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CODE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
//					
//					// F2J_NOT_SUPPORTED : Call to built-in "POP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
//					//					SupportClasses.TOOL_ERR.Pop();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'POP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
//					
//				}
//				// F2J_NOT_SUPPORTED : Call to built-in "CLEAR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
//				//				SupportClasses.TOOL_ERR.Clear();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLEAR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : rgGetnextwindow procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void rgForcetoforeground()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			final NString VCCURRSUBPROG = toStr("RG_FORCETOFOREGROUND");
//			try
//			{
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_FUNCTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin18".
//				//				fhForcetoforeground = SupportClasses.ORA_FFI.RegisterFunction(lhWfsetfocus, "ForceToForeground", OraFfi.cStd);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_FUNCTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin18'.");
//				
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_PARAMETER" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin19".
//				//				SupportClasses.ORA_FFI.RegisterParameter(fhForcetoforeground, OraFfi.cInt);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_PARAMETER' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin19'.");
//				
//				// F2J_NOT_SUPPORTED : Call to built-in "REGISTER_RETURN" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin20".
//				//				SupportClasses.ORA_FFI.RegisterReturn(fhForcetoforeground, OraFfi.cLong);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REGISTER_RETURN' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin20'.");
//				
//			}
//			catch(Exception  e)
//			{
//				for ( int ierrors = 1; ierrors <= SupportClasses.TOOL_ERR.Nerrors(); ierrors++ )
//				{
//					// F2J_NOT_SUPPORTED : Call to built-in "CODE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15".
//					//					getContainer().getGWfError().showException(toChar(SupportClasses.TOOL_ERR.Code()).append(": ").append(message()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CODE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin15'.");
//					
//					// F2J_NOT_SUPPORTED : Call to built-in "POP" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
//					//					SupportClasses.TOOL_ERR.Pop();
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'POP' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
//					
//				}
//				// F2J_NOT_SUPPORTED : Call to built-in "CLEAR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
//				//				SupportClasses.TOOL_ERR.Clear();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLEAR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
//				
//			}
//
			this.getLogger().trace(this, "F2J : rgForcetoforeground procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* ---------------------
		* ---------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void declareFocusAsSet()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			copy("Y","GLOBAL.WF_FOCUS_IS_SET");
//
			this.getLogger().trace(this, "F2J : declareFocusAsSet procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
