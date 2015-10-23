package net.hedtech.general.common.libraries.Noqjpls;



import morphis.foundations.core.appsupportlib.runtime.AbstractLibrary;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.configuration.LibraryConfiguration;
 

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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
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


public class NoqjplsServices extends AbstractLibrary{
		
	public NoqjplsServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
	/* package accessor */
	public Nokbdpl getNokbdpl() 
	{
		return (Nokbdpl)getSupportCodeManager().getPackage("NOKBDPL");
	}
	
	//Original PL/SQL code for Prog Unit NOQJPLS.N$_POINTER_TO_CURSOR
	/*
	PROCEDURE n$_pointer_to_cursor(p_field_name  VARCHAR2,
                               p_field_value VARCHAR2) is
  -- Local variables                               
  lv_y                         NUMBER(3);
  lv_top_rec                   NUMBER(3);
  lv_dif                       NUMBER(3);
  lv_curr_pos                  NUMBER(3);
  lv_item_pos                  NUMBER(3);
  lv_item_height               NUMBER(3);
begin
	-- Copy cursor value, i.e. >, to the given field name.
  COPY(p_field_value, p_field_name);
  lv_top_rec     := GET_BLOCK_PROPERTY(NAME_IN('SYSTEM.CURSOR_BLOCK'), TOP_RECORD);
  lv_dif         := lv_top_rec - 1;
  lv_curr_pos    := TO_NUMBER(NAME_IN('SYSTEM.CURSOR_RECORD')) - lv_dif;
  lv_item_pos    := GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'), Y_POS);
  lv_item_height := GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'), HEIGHT);
  SET_ITEM_PROPERTY(p_field_name, Y_POS, lv_item_pos + ((lv_curr_pos -1) * lv_item_height));
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pFieldName
		* @param pFieldValue
		*/
		public void nPointerToCursor(NString pFieldName, NString pFieldValue)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Local variables                               
//			NNumber lvY= NNumber.getNull();
//			NNumber lvTopRec= NNumber.getNull();
//			NNumber lvDif= NNumber.getNull();
//			NNumber lvCurrPos= NNumber.getNull();
//			NNumber lvItemPos= NNumber.getNull();
//			NNumber lvItemHeight= NNumber.getNull();
//			//  Copy cursor value, i.e. >, to the given field name.
			copy(pFieldValue,pFieldName);
//			// F2J_NOT_SUPPORTED : The property "BLOCK's TOP_RECORD" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//			//			lvTopRec = toNumber(SupportClasses.FORMS40.GetBlockProperty(getCursorBlock(), SupportClasses.Property.TOP_RECORD));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'BLOCK's TOP_RECORD' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//			
//			lvDif = lvTopRec.subtract(1);
//			lvCurrPos = toNumber(getCursorRecord()).subtract(lvDif);
//			lvItemPos = toNumber(getItemYPos(getCursorItem()));
//			lvItemHeight = toNumber(getItemHeight(getCursorItem()));
//			setItemYPos(pFieldName, lvItemPos.add(((lvCurrPos.subtract(1)).multiply(lvItemHeight))));
//
	//		System.err.println("F2J : nPointerToCursor procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.N$_CHECK_PIDM2
	/*
	PROCEDURE N$_CHECK_PIDM2 (PIDM_IN IN NUMBER) IS
   PTI_INTO_TEMP VARCHAR2(255);
   lv_sql_stmt   VARCHAR2(1000);
   
   CURSOR PTI_CURSOR IS
      SELECT SPBPERS_PIDM
      FROM   SPBPERS
      WHERE  SPBPERS_DEAD_IND IS NOT NULL
      AND    SPBPERS_PIDM = PIDM_IN ;
BEGIN
   OPEN PTI_CURSOR ;
   FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
   IF PTI_CURSOR%FOUND THEN
      MESSAGE( G$_NLS.Get('NOQJPLS-0010', 'LIB',
               '*ERROR* Person is deceased; all functions are invalid.'));
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		*/
		public void nCheckPidm2(NNumber pidmIn)
		{
			//int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			NString ptiIntoTemp= NString.getNull();
			NString lvSqlStmt= NString.getNull();
			String sqlptiCursor = "SELECT SPBPERS_PIDM " +
	" FROM SPBPERS " +
	" WHERE SPBPERS_DEAD_IND IS NOT NULL AND SPBPERS_PIDM = :P_PIDM_IN ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("P_PIDM_IN", pidmIn);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				if ( ptiCursor.found() )
				{
					errorMessage(GNls.Fget(toStr("NOQJPLS-0010"), toStr("LIB"), toStr("*ERROR* Person is deceased; all functions are invalid.")));
					throw new ApplicationException();
				}
				}finally{
					ptiCursor.close();
				}

			//System.err.println("F2J : nCheckPidm2 procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.N$_CHECK_PIDM
	/*
	PROCEDURE N$_CHECK_PIDM (PIDM_IN IN NUMBER) IS
   lv_sql_stmt   VARCHAR2(1000);
   PTI_INTO_TEMP VARCHAR2(255);

BEGIN
	 IF nokglob.f_global_string ('HR_INSTALLED_IND') = 'Y' THEN	
      lv_sql_stmt :=  ' SELECT SPBPERS_PIDM '||
                   ' FROM   SPBPERS, PEBEMPL, SPRIDEN  '||
                   ' WHERE  SPBPERS_DEAD_IND IS NOT NULL '||
                   ' AND    SPBPERS_PIDM = '|| PIDM_IN ||
                   ' AND    PEBEMPL_PIDM = SPRIDEN_PIDM '||
                   ' AND    PEBEMPL_EMPL_STATUS = ''T'''||
                   ' AND    SPRIDEN_PIDM = '|| PIDM_IN ||
                   ' AND    SPRIDEN_CHANGE_IND IS NULL'; 
      GOKDBMS.DYNAMIC_SQL(lv_sql_stmt, PTI_INTO_TEMP);    
      IF PTI_INTO_TEMP IS NOT NULL THEN
         MESSAGE( G$_NLS.Get('NOQJPLS-0000', 'LIB','*WARNING* This person is deceased.  '||
                  'This Person has a current status of terminated. To change the status to Active, '||
                  'go to the Employee Form.'));
         MESSAGE( G$_NLS.Get('NOQJPLS-0001', 'LIB','*WARNING* This person is deceased. '||
                  'This Person has a current status of terminated. To change the status to Active, '||
                  'go to the Employee Form.'), NO_ACKNOWLEDGE);
    
      ELSE
      	 lv_sql_stmt := '';
      	 PTI_INTO_TEMP := '';
         lv_sql_stmt :=  'SELECT SPBPERS_PIDM '||
                         ' FROM   SPBPERS '||
                         ' WHERE  SPBPERS_DEAD_IND IS NOT NULL '||
                         ' AND  SPBPERS_PIDM = '||PIDM_IN ;
       
         GOKDBMS.DYNAMIC_SQL(lv_sql_stmt, PTI_INTO_TEMP);      
         IF PTI_INTO_TEMP IS NOT NULL THEN
            MESSAGE( G$_NLS.Get('NOQJPLS-0002', 'LIB','*WARNING* This person is deceased.'));
            MESSAGE( G$_NLS.Get('NOQJPLS-0003', 'LIB','*WARNING* This person is deceased.'), NO_ACKNOWLEDGE);
         END IF;
       	 lv_sql_stmt := '';
      	 PTI_INTO_TEMP := ''; 
         lv_sql_stmt :=  'SELECT ''X'''||
                         ' FROM   PEBEMPL, SPRIDEN '||
                         ' WHERE  PEBEMPL_PIDM = SPRIDEN_PIDM '||
                         ' AND    PEBEMPL_EMPL_STATUS = ''T'''||
                         ' AND    SPRIDEN_PIDM = '||PIDM_IN||
                         ' AND    SPRIDEN_CHANGE_IND IS NULL';
         GOKDBMS.DYNAMIC_SQL(lv_sql_stmt, PTI_INTO_TEMP);      
         IF PTI_INTO_TEMP IS NOT NULL THEN
	          IF NAME_IN('SYSTEM.CURRENT_FORM') = 'PEAEMPL' THEN
          	   MESSAGE( G$_NLS.Get('NOQJPLS-0004', 'LIB',
          	           '*WARNING* This Person has a current status of terminated.'));
               MESSAGE( G$_NLS.Get('NOQJPLS-0005', 'LIB',
                     	 '*WARNING* This Person has a current status of terminated.')  
                	     , NO_ACKNOWLEDGE);
	          ELSE
	          	 MESSAGE( G$_NLS.Get('NOQJPLS-0006', 'LIB',
	          	          '*WARNING* This Person has a current status of terminated. '||
	          	          'To change the status to Active, go to the Employee Form.'));
		           MESSAGE( G$_NLS.Get('NOQJPLS-0007', 'LIB',
		                    '*WARNING* This Person has a current status of terminated. '||
		                    'To change the status to Active, go to the Employee Form.')
		                    , NO_ACKNOWLEDGE);
	          END IF;
         END IF;
      END IF;
   ELSE -- HR_INSTALLED_IND
      lv_sql_stmt :=  'SELECT SPBPERS_PIDM '||
                      ' FROM   SPBPERS '||
                      ' WHERE  SPBPERS_DEAD_IND IS NOT NULL '||
                      ' AND  SPBPERS_PIDM = '||PIDM_IN ;
       
      GOKDBMS.DYNAMIC_SQL(lv_sql_stmt, PTI_INTO_TEMP);      
      IF PTI_INTO_TEMP IS NOT NULL THEN
         MESSAGE( G$_NLS.Get('NOQJPLS-0008', 'LIB','*WARNING* This person is deceased.'));
         MESSAGE( G$_NLS.Get('NOQJPLS-0009', 'LIB','*WARNING* This person is deceased.'), NO_ACKNOWLEDGE);
      END IF;   	
   END IF;-- HR_INSTALLED_IND
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidmIn
		*/
		public void nCheckPidm(NNumber pidmIn)
		{

			NString lvSqlStmt= NString.getNull();
			NString ptiIntoTemp= NString.getNull();
			if ( Nokglob.fGlobalString(toStr("HR_INSTALLED_IND")).equals("Y") )
			{
				lvSqlStmt = toStr(" SELECT SPBPERS_PIDM ").append(" FROM   SPBPERS, PEBEMPL, SPRIDEN  ").append(" WHERE  SPBPERS_DEAD_IND IS NOT NULL ").append(" AND    SPBPERS_PIDM = ").append(isNull(toStr(pidmIn), "''")).append(" AND    PEBEMPL_PIDM = SPRIDEN_PIDM ").append(" AND    PEBEMPL_EMPL_STATUS = 'T'").append(" AND    SPRIDEN_PIDM = ").append(isNull(toStr(pidmIn), "''")).append(" AND    SPRIDEN_CHANGE_IND IS NULL");
				Ref<NString> p_return_value1_ref = new Ref<NString>(ptiIntoTemp);
				Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
				ptiIntoTemp = p_return_value1_ref.val;
				// MORPHIS TODO: Mensagens NO_ACKNOWLEDGE ainda não sao suportadas: http://jira.morphis-tech.com/browse/ELLBHR-12494
				if ( !ptiIntoTemp.isNull() )
				{
					warningMessage(GNls.Fget(toStr("NOQJPLS-0000"), toStr("LIB"), toStr("*WARNING* This person is deceased.  ").append("This Person has a current status of terminated. To change the status to Active, ").append("go to the Employee Form.")));
					//warningMessage(GNls.Fget(toStr("NOQJPLS-0001"), toStr("LIB"), toStr("*WARNING* This person is deceased. ").append("This Person has a current status of terminated. To change the status to Active, ").append("go to the Employee Form.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
				}
				else {
					lvSqlStmt = toStr("");
					ptiIntoTemp = toStr("");
					lvSqlStmt = toStr("SELECT SPBPERS_PIDM ").append(" FROM   SPBPERS ").append(" WHERE  SPBPERS_DEAD_IND IS NOT NULL ").append(" AND  SPBPERS_PIDM = ").append(isNull(toStr(pidmIn), "''"));
					p_return_value1_ref = new Ref<NString>(ptiIntoTemp);
					Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
					ptiIntoTemp = p_return_value1_ref.val;
					if ( !ptiIntoTemp.isNull() )
					{
						warningMessage(GNls.Fget(toStr("NOQJPLS-0002"), toStr("LIB"), toStr("*WARNING* This person is deceased.")));
						//warningMessage(GNls.Fget(toStr("NOQJPLS-0003"), toStr("LIB"), toStr("*WARNING* This person is deceased.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
					}
					lvSqlStmt = toStr("");
					ptiIntoTemp = toStr("");
					lvSqlStmt = toStr("SELECT 'X'").append(" FROM   PEBEMPL, SPRIDEN ").append(" WHERE  PEBEMPL_PIDM = SPRIDEN_PIDM ").append(" AND    PEBEMPL_EMPL_STATUS = 'T'").append(" AND    SPRIDEN_PIDM = ").append(isNull(toStr(pidmIn), "''")).append(" AND    SPRIDEN_CHANGE_IND IS NULL");
					p_return_value1_ref = new Ref<NString>(ptiIntoTemp);
					Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
					ptiIntoTemp = p_return_value1_ref.val;
					if ( !ptiIntoTemp.isNull() )
					{
						if ( getCurrentTaskName().equals("PEAEMPL") )
						{
							warningMessage(GNls.Fget(toStr("NOQJPLS-0004"), toStr("LIB"), toStr("*WARNING* This Person has a current status of terminated.")));
							//warningMessage(GNls.Fget(toStr("NOQJPLS-0005"), toStr("LIB"), toStr("*WARNING* This Person has a current status of terminated.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
						}
						else {
							warningMessage(GNls.Fget(toStr("NOQJPLS-0006"), toStr("LIB"), toStr("*WARNING* This Person has a current status of terminated. ").append("To change the status to Active, go to the Employee Form.")));
							//warningMessage(GNls.Fget(toStr("NOQJPLS-0007"), toStr("LIB"), toStr("*WARNING* This Person has a current status of terminated. ").append("To change the status to Active, go to the Employee Form.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
						}
					}
				}
			}
			else {
				//  HR_INSTALLED_IND
				lvSqlStmt = toStr("SELECT SPBPERS_PIDM ").append(" FROM   SPBPERS ").append(" WHERE  SPBPERS_DEAD_IND IS NOT NULL ").append(" AND  SPBPERS_PIDM = ").append(isNull(toStr(pidmIn), "''"));
				Ref<NString> p_return_value1_ref = new Ref<NString>(ptiIntoTemp);
				Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
				ptiIntoTemp = p_return_value1_ref.val;
				if ( !ptiIntoTemp.isNull() )
				{
					warningMessage(GNls.Fget(toStr("NOQJPLS-0008"), toStr("LIB"), toStr("*WARNING* This person is deceased.")));
					//warningMessage(GNls.Fget(toStr("NOQJPLS-0009"), toStr("LIB"), toStr("*WARNING* This person is deceased.")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
				}
			}


			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.N$_CHECK_MSG
	/*
	PROCEDURE N$_CHECK_MSG (msg_rec_in  nokmsgs.msg_rectype)
IS
BEGIN
   IF nokmsgs.f_msg_found (msg_rec_in) THEN
      MESSAGE(nokmsgs.f_format_msg (msg_rec_in));
      IF nokmsgs.f_error_found (msg_rec_in)THEN
         RAISE FORM_TRIGGER_FAILURE;
      END IF;
   END IF;
END;          
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param msgRecIn
		*/
		public void nCheckMsg(Nokmsgs.MsgRectypeRow msgRecIn)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//			// MORPHIS TODO JM uncommented this method, was necessary in PHATIME form
			if ( Nokmsgs.fMsgFound(msgRecIn).getValue() )
			{
				if(msgRecIn.MsgType.contains("WARNING"))
					warningMessage(Nokmsgs.fFormatMsg(msgRecIn));
				else
					message(Nokmsgs.fFormatMsg(msgRecIn));
				if ( Nokmsgs.fErrorFound(msgRecIn).getValue() )
				{
					throw new ApplicationException();
				}
			}
//
			//System.err.println("F2J : nCheckMsg procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.N$_CHECK_ERROR
	/*
	PROCEDURE N$_CHECK_ERROR(PAR_MSG IN VARCHAR2,PAR_MSG_TYPE IN VARCHAR2)IS
BEGIN
  IF PAR_MSG IS NOT NULL 
  AND PAR_MSG_TYPE IS NOT NULL THEN
     IF PAR_MSG_TYPE='E' THEN
        MESSAGE(PAR_MSG);
        RAISE FORM_TRIGGER_FAILURE;
     ELSIF PAR_MSG_TYPE ='W' THEN
        MESSAGE(PAR_MSG);
     END IF;
  END IF;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param parMsg
		* @param parMsgType
		*/
		public void nCheckError(NString parMsg, NString parMsgType)
		{

			if ( !parMsg.isNull() && !parMsgType.isNull() )
			{
				if ( parMsgType.equals("E") )
				{
					errorMessage(parMsg);
					throw new ApplicationException();
				}
				else if ( parMsgType.equals("W") ) {
					warningMessage(parMsg);
				}
			}
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.N$_CALCULATE_LOV_POS
	/*
	PROCEDURE N$_CALCULATE_LOV_POS(
  item_name IN      VARCHAR2,
  list_name IN      VARCHAR2,
  lov_x     IN OUT  NUMBER,
  lov_y     IN OUT  NUMBER) IS
  
  -- Local variables
  item_x      NUMBER := 0;
  item_y      NUMBER := 0;
  win_x       NUMBER := 0;
  win_y       NUMBER := 0;
  win_w       NUMBER := 0;  
  win_h       NUMBER := 0;  
  mid_win_w   NUMBER := 0;
  mid_win_h   NUMBER := 0;
  lov_w       NUMBER := 0;
  lov_h       NUMBER := 0;
  view_x      NUMBER := 0;
  view_y      NUMBER := 0;
  viewport_x  NUMBER := 0;
  viewport_y  NUMBER := 0; 

  main_win_id WINDOW;
  canvas_name VARCHAR2(50);
BEGIN
  -- Get main window id
  main_win_id := FIND_WINDOW('MAIN_WINDOW'); 
  win_x := TO_NUMBER(GET_WINDOW_PROPERTY(main_win_id, X_POS));
  win_y := TO_NUMBER(GET_WINDOW_PROPERTY(main_win_id, Y_POS));
  win_w := TO_NUMBER(GET_WINDOW_PROPERTY(main_win_id, WIDTH));
  win_h := TO_NUMBER(GET_WINDOW_PROPERTY(main_win_id, HEIGHT));
	mid_win_w := win_w / 2;
	mid_win_h := win_h / 2;

  -- Get item properties
  COPY('','GLOBAL.VALUE');
  item_x := GET_ITEM_PROPERTY(item_name, X_POS);     
  item_y := GET_ITEM_PROPERTY(item_name, Y_POS);           
  --
  canvas_name := GET_ITEM_PROPERTY(item_name, ITEM_CANVAS);
  viewport_x := TO_NUMBER(GET_VIEW_PROPERTY(canvas_name, VIEWPORT_X_POS));
  viewport_y := TO_NUMBER(GET_VIEW_PROPERTY(canvas_name, VIEWPORT_Y_POS));
  --
  view_x := TO_NUMBER(GET_WINDOW_PROPERTY(GET_VIEW_PROPERTY(canvas_name, WINDOW_NAME),X_POS));
  view_y := TO_NUMBER(GET_WINDOW_PROPERTY(GET_VIEW_PROPERTY(canvas_name, WINDOW_NAME),Y_POS));

  -- Set lov properies
  lov_w := GET_LOV_PROPERTY(list_name, WIDTH);
  lov_h := GET_LOV_PROPERTY(list_name, HEIGHT);
  IF lov_w < mid_win_w THEN
    lov_w := mid_win_w;  	
  END IF;	
  IF lov_h < mid_win_h THEN
    lov_h := mid_win_h;  	
  END IF;

  lov_x := 0;
  lov_y := 13;
  IF item_x + view_x + viewport_x < mid_win_w THEN
    lov_x := lov_x + win_w - lov_w;
  END IF;
  IF item_y + view_y + viewport_y < mid_win_h THEN
  	lov_y := lov_y + win_h - lov_h;
  END IF;	
  --
  SET_LOV_PROPERTY(list_name, LOV_SIZE, mid_win_w, mid_win_h); 	
END;
	*/
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemName
		* @param listName
		* @param lovX
		* @param lovY
		*/
		public void nCalculateLovPos(NString itemName, NString listName, Ref<NNumber> lovX, Ref<NNumber> lovY)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Local variables
//			NNumber itemX = toNumber(0);
//			NNumber itemY = toNumber(0);
//			NNumber winX = toNumber(0);
//			NNumber winY = toNumber(0);
//			NNumber winW = toNumber(0);
//			NNumber winH = toNumber(0);
//			NNumber midWinW = toNumber(0);
//			NNumber midWinH = toNumber(0);
//			NNumber lovW = toNumber(0);
//			NNumber lovH = toNumber(0);
//			NNumber viewX = toNumber(0);
//			NNumber viewY = toNumber(0);
//			NNumber viewportX = toNumber(0);
//			NNumber viewportY = toNumber(0);
//			WindowDescriptor mainWinId= null;
//			NString canvasName= NString.getNull();
//			//  Get main window id
//			mainWinId = findWindow("MAIN_WINDOW");
//			// F2J_TO_REMOVE : The property "WINDOW's X_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
//			//			winX = toNumber(SupportClasses.FORMS4W.GetWindowProperty(mainWinId, SupportClasses.Property.X_POS));
//			////
//			System.err.println("// F2J_TO_REMOVE : The property 'WINDOW's X_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
//			
//			// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
//			//			winY = toNumber(SupportClasses.FORMS4W.GetWindowProperty(mainWinId, SupportClasses.Property.Y_POS));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
//			
//			// F2J_NOT_SUPPORTED : The property "WINDOW's WIDTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
//			//			winW = toNumber(SupportClasses.FORMS4W.GetWindowProperty(mainWinId, SupportClasses.Property.WIDTH));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'WINDOW's WIDTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
//			
//			// F2J_NOT_SUPPORTED : The property "WINDOW's HEIGHT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
//			//			winH = toNumber(SupportClasses.FORMS4W.GetWindowProperty(mainWinId, SupportClasses.Property.HEIGHT));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'WINDOW's HEIGHT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
//			
//			midWinW = winW.divide(2);
//			midWinH = winH.divide(2);
//			//  Get item properties
//			copy("","GLOBAL.VALUE");
//			itemX = toNumber(getItemXPos(itemName));
//			itemY = toNumber(getItemYPos(itemName));
//			// 
//			canvasName = getItemCanvas(itemName);
//			// F2J_NOT_SUPPORTED : The property "VIEW's VIEWPORT_X_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//			//			viewportX = toNumber(SupportClasses.FORMS4W.GetViewProperty(canvasName, SupportClasses.Property.VIEWPORT_X_POS));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's VIEWPORT_X_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
//			
//			// F2J_NOT_SUPPORTED : The property "VIEW's VIEWPORT_Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//			//			viewportY = toNumber(SupportClasses.FORMS4W.GetViewProperty(canvasName, SupportClasses.Property.VIEWPORT_Y_POS));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'VIEW's VIEWPORT_Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
//			
//			// 
//			// F2J_TO_REMOVE : The property "WINDOW's X_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
//			//			viewX = toNumber(SupportClasses.FORMS4W.GetWindowProperty(getViewWindowName(canvasName), SupportClasses.Property.X_POS));
//			////
//			System.err.println("// F2J_TO_REMOVE : The property 'WINDOW's X_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
//			
//			// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
//			//			viewY = toNumber(SupportClasses.FORMS4W.GetWindowProperty(getViewWindowName(canvasName), SupportClasses.Property.Y_POS));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
//			
//			//  Set lov properies
//			// F2J_NOT_SUPPORTED : The property "LOV's WIDTH" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//			//			lovW = toNumber(SupportClasses.FORMS4W.GetLovProperty(listName, SupportClasses.Property.WIDTH));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'LOV's WIDTH' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//			
//			// F2J_NOT_SUPPORTED : The property "LOV's HEIGHT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//			//			lovH = toNumber(SupportClasses.FORMS4W.GetLovProperty(listName, SupportClasses.Property.HEIGHT));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'LOV's HEIGHT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//			
//			if ( lovW.lesser(midWinW) )
//			{
//				lovW = midWinW;
//			}
//			if ( lovH.lesser(midWinH) )
//			{
//				lovH = midWinH;
//			}
//			lovX.val = toNumber(0);
//			lovY.val = toNumber(13);
//			if ( itemX.add(viewX).add(viewportX).lesser(midWinW) )
//			{
//				lovX.val = lovX.val.add(winW).subtract(lovW);
//			}
//			if ( itemY.add(viewY).add(viewportY).lesser(midWinH) )
//			{
//				lovY.val = lovY.val.add(winH).subtract(lovH);
//			}
//			// 
//			// F2J_NOT_SUPPORTED : The property "LOV's LOV_SIZE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
//			//			SupportClasses.FORMS4W.SetLovProperty(listName, SupportClasses.Constants.LOV_SIZE, midWinW, midWinH);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'LOV's LOV_SIZE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\NOQJPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
//			
//
			this.getLogger().trace(this, "F2J : nCalculateLovPos procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_NLS_DATE_SUPPORT
	/*
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

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_MSGKEY_UPDATE
	/*
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : NOQJPLS
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Mon Jun 11 14:25:19 2012
-- MSGSIGN : #2c26ea569aca2a00
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;
	*/
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

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_8_8
	/*
	PROCEDURE AUDIT_TRAIL_8_8 IS
<multilinecomment>
AUDIT TRAIL: 8.8
1. Defect #1-12A6JVN        SL 02/08/2012
   Problem: Noqppls and noqupls are not synchronized with noqjpls.
   Functional Impact: None.
   Technical Fix: Noqjpls has been modified so that it compiles and functions 
     regardless HR installation. As part of this work, noqppls.pll and noqupls.pll
     have been obsolete. A new routine nokrecs.f_get_bdpl_recs routine is created 
     and referenced to process a group of ptrbdpl records given a deduction code 
     and effective date.
AUDIT TRAIL END.   
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail88()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail88 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_8_0
	/*
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>
AUDIT TRAIL: 8.0
1. Grants Management Enhancement Multiple Year Encumbering        LN 04/19/2007
   Added a new routine n$_pointer_to_cursor to visually indicate the current 
   master block record when the form cursor is in the detail block.
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
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

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_7_3
	/*
	PROCEDURE audit_trail_7_3 IS
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail73()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail73 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_7_0_NOQJPLS
	/*
	PROCEDURE AUDIT_TRAIL_7_0_NOQJPLS IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. TGKinderman 11/20/2003
   Conversion to Forms9i
2. Internal Defect 70-0001, LN 21-May-2004
   Problem:
     The library noqjpls has a local procedure NOKBDPL.DISPLAY_LOV.
   Functional Impact:
     The procedure NOKBDPL.DISPLAY_LOV will display LOV in quadrangles as 
     similar as the general G$_DISPLAY_LOV routine.
   Technical Fix:
     New routine N$_CALCULATE_LOV_POS is called by NOKBDPL.DISPLAY_LOV.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Noqjpls()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail70Noqjpls procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_7_0
	/*
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0

1. Changes Migrated to 7.0              MT  06/07/2004
   RPE #25848           Release# 6.1

AUDIT TRAIL END.


</multilinecomment>
BEGIN
  NULL;
END;
	*/
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

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_6_1
	/*
	PROCEDURE AUDIT_TRAIL_6_1 IS
<multilinecomment>
AUDIT TRAIL: 6.1                                    INIT     DATE
1. RPE #25848                                        SL    11/27/2003 
   Increase decimal places from two to four for all deduction codes.
   var_amt1 and var_amt2 variables definition in create_eff_date_rg 
   and create_dyn_rg2 routines of nokbdpl package body changed from 
   number(11,2) to (13,4). 
AUDIT TRAIL END                                                                                                            
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail61()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail61 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_6_0
	/*
	PROCEDURE AUDIT_TRAIL_6_0 IS
BEGIN
    <multilinecomment>
AUDIT TRAIL: 6.0   
1. RPE 195              LR 10/23/2002 
Added procedure N$_CHECK_MSG.	 						
AUDIT TRAIL END	 						
</multilinecomment>
null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// AUDIT TRAIL: 6.0
//			// 1. RPE 195              LR 10/23/2002
//			// Added procedure N$_CHECK_MSG.
//			// AUDIT TRAIL END
//
			this.getLogger().trace(this, "F2J : auditTrail60 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_5_3
	/*
	PROCEDURE AUDIT_TRAIL_5_3 IS
BEGIN
    <multilinecomment>
AUDIT TRAIL: 5.3   
1. Internal Defect # : 53-0003 																		MT 09/10/2001
	 	Problem: 	Owner name is prefixed with the object name.  
	 	Functional Impact:	This causes problems when clients use the synonym approach to multiple campuses.
	 	Technical Fix: Removed the Owner Name.
	 						
AUDIT TRAIL END	 						
</multilinecomment>
null;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail53()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// AUDIT TRAIL: 5.3
//			// 1. Internal Defect # : 53-0003 																		MT 09/10/2001
//			// Problem: 	Owner name is prefixed with the object name.
//			// Functional Impact:	This causes problems when clients use the synonym approach to multiple campuses.
//			// Technical Fix: Removed the Owner Name.
//			// AUDIT TRAIL END
//
			this.getLogger().trace(this, "F2J : auditTrail53 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_5_0_NOQJPLS
	/*
	PROCEDURE AUDIT_TRAIL_5_0_NOQJPLS IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. TGKinderman 06/14/2000
   Dev6.0 Upgrade.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Noqjpls()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail50Noqjpls procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_4_0_B2K
	/*
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. SL  09/02/98
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

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_3_1
	/*
	PROCEDURE AUDIT_TRAIL_3_1 IS
<multilinecomment>
AUDIT TRAIL: 3.1                            INIT     DATE
1. Year 2000 compliance                      SL    05/07/98
   Date format '||G$_DATE.GET_NLS_DATE_FORMAT||' added to display four digit 
   year for ptrbdpl_effective_date.
AUDIT TRAIL END                                                                                                            
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail31()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail31 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_3_0
	/*
	PROCEDURE AUDIT_TRAIL_3_0 IS
<multilinecomment>
 AUDIT TRAIL:3.0
 1.Enhancement          LR 5-MAY-1997
 Functional Impact - None.
 Technical Fix - Added procedure N$_CHECK_ERROR to display the message passed 
                 and RAISE FORM_TRIGGER_FAILURE.
 2. The N$_CHECK_PIDM procedure is now in synch with the verion in noqppls.pll.   MF   06-23-97
    Also corrected the spelling of deceased.
 AUDIT TRAIL: 3.1
 1. Defect No. 8404								AA  16-DEC-1997
     Problem - When querying terminated employee in form PEAEMPL, message is 
	       displayed to go to the employee form to change the status to active.
	       After pressing OK, same message is displayed in the auto help line.
     Functional Impact - Message will no longer say "To change status to active, go
	       to the Employee Form".
     Technical Fix - Modified N$_CHECK_PIDM trigger to check the current form name.
	       If current form is PEAEMPL then first part of message is displayed 
	       only.  User still has to acknowledge.  
 AUDIT TRAIL END
</multilinecomment>
BEGIN
  null;
END;
	*/
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

	//Original PL/SQL code for Prog Unit NOQJPLS.AUDIT_TRAIL_2_1
	/*
	PROCEDURE AUDIT_TRAIL_2_1 IS
<multilinecomment>
AUDIT TRAIL: 2.1.11
1. Enhancement                                                              CS   02-05-97
   Problem: Users need to be able to view data on deceased and/or
            terminated employees.
   Functional Impact: In a future release, if an employee is deceased
            or terminated, all data will be viewable but not updateable
            on any form.
   Technical Fix: Removed the edit for deceased from applicable forms
            and replaced with execution of N$_CHECK_PIDM. N$_CHECK_PIDM
            now will perform the edit for deceased. In a future release
            the edit will be removed and the code enabled which sets
            the item property for all fields as query only when an employee
            is deceased or terminated.
2. Added package NOKBDPL                                                    AS 03-10-97
3. Enhancement                                                              MF 03-12-97
   Problem: Some forms will not generate for non-payroll clients.            
   Functional Impact: Forms will be accessible for all clients.
   Technical Fix: Local form procedures that reference the PERHIRE
                  table were moved to this library.  This will
                  ensure that the forms will generate successfully.
AUDIT TRAIL END
</multilinecomment>   
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail21()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail21 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

}
