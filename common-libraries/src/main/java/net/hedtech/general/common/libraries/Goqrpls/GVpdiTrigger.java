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

public class GVpdiTrigger extends AbstractSupportCodeObject {
	

	public GVpdiTrigger(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqrplsServices getContainer() {
		return (GoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_VPDI_TRIGGER
	/*
	PACKAGE G$_VPDI_TRIGGER IS
--
-- This package has been created for the baseline vpd procedures that are needed for 
-- implementation with adding the institution field to forms.
--
  PROCEDURE WHEN_NEW_FORM_INSTANCE (p_VPDIFLD VARCHAR2, p_VPDITBL VARCHAR2, p_RETPROC OUT VARCHAR2);
  PROCEDURE KEY_EXIT (p_VPDIFLD VARCHAR2, p_FORMH VARCHAR2);
  PROCEDURE KEY_CLRFRM (p_VPDIFLD VARCHAR2, p_SYSSTATS VARCHAR2);
  PROCEDURE DISABLE_KEYS (p_VPDIFLD VARCHAR2);
  PROCEDURE ENABLE_KEYS (p_VPDIFLD VARCHAR2);
  PROCEDURE WHEN_NEW_FORM_INSTANCE_NONKEY (p_VPDIFLD VARCHAR2, p_VPDITBL VARCHAR2, p_RETPROC OUT VARCHAR2);
  PROCEDURE WHEN_NEW_FORM_INSTANCE_VPDIREQ (p_VPDIFLD VARCHAR2);
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_VPDI_TRIGGER
		/*
		PACKAGE BODY G$_VPDI_TRIGGER IS
--
  PROCEDURE WHEN_NEW_FORM_INSTANCE(p_vpdifld VARCHAR2, p_vpditbl VARCHAR2, p_retproc OUT VARCHAR2) IS
     lv_vpdicode VARCHAR2(20);
     lv_vpdidesc VARCHAR2(20);
     lv_vpditbl VARCHAR2(10);
  BEGIN
     lv_vpdicode := p_vpdifld||'_VPDI_CODE';
     lv_vpdidesc := p_vpdifld||'_VPDI_DESC';
     lv_vpditbl  := p_vpditbl;

     Forms_DDL('BEGIN g$_vpdi_check_tbl_pol('''||lv_vpditbl||'''); END;');

     IF form_success Then       
				
 		  SET_ITEM_PROPERTY(lv_vpdicode,VISIBLE,PROPERTY_ON);
      SET_ITEM_PROPERTY(lv_vpdicode,ENABLED,PROPERTY_ON);
      SET_ITEM_PROPERTY(lv_vpdicode,NAVIGABLE,PROPERTY_ON);
      SET_ITEM_PROPERTY(lv_vpdidesc,VISIBLE,PROPERTY_ON);
      COPY('','GLOBAL.CANCEL_BTN_PRESSED');

        DECLARE
      	   MY_CURSOR INTEGER;
      	   NUMROWS   INTEGER;
	         SQLSTR    VARCHAR2(100);
           PROCFNC   VARCHAR2(10);
        BEGIN
	         SQLSTR := 'Select g$_vpdi_security.g$_vpdi_get_proc_context_fnc from dual';
           GOKDBMS.DYNAMIC_SQL(SQLSTR,PROCFNC);
           IF PROCFNC IS NOT NULL THEN
           	 p_retproc := PROCFNC;
           END IF;
	      END;

        Forms_DDL('BEGIN g$_vpdi_security.g$_vpdi_set_process_context(''OVERAL'',''NEW''); END;');
        
     END IF;
   END;
 
  PROCEDURE KEY_EXIT(p_vpdifld VARCHAR2, p_formh VARCHAR2) IS
      lv_vpdicode VARCHAR2(20);
   BEGIN
      lv_vpdicode := p_VPDIFLD||'_VPDI_CODE';

      IF GET_ITEM_PROPERTY(lv_vpdicode,VISIBLE) = 'TRUE' THEN
         Declare
            calling_form_name  VARCHAR2(10) := NULL ;
         BEGIN
            calling_form_name := GET_APPLICATION_PROPERTY(CALLING_FORM) ;
            Forms_DDL('BEGIN g$_vpdi_security.g$_vpdi_set_process_context(''OVERAL'','''||p_formh||'''); END;');
         END;      
      END IF;
   END;

PROCEDURE KEY_CLRFRM(p_vpdifld VARCHAR2, p_sysstats VARCHAR2) IS
      lv_vpdicode VARCHAR2(20);
   BEGIN
      lv_vpdicode := p_vpdifld||'_VPDI_CODE';

      IF GET_ITEM_PROPERTY(lv_vpdicode,VISIBLE) = 'TRUE' THEN 
         IF p_SYSSTATS <> 'CHANGED' THEN
	          Forms_DDL('BEGIN g$_vpdi_security.g$_vpdi_set_process_context(''OVERAL'',''ROLL'');END;'); 
     		 END IF;
   	   END IF;
   END;

PROCEDURE	DISABLE_KEYS(p_vpdifld VARCHAR2) IS
      lv_vpdicode VARCHAR2(20);
   BEGIN
      lv_vpdicode := p_vpdifld||'_VPDI_CODE';

      IF GET_ITEM_PROPERTY(lv_vpdicode,ENABLED) = 'TRUE' THEN 
         SET_ITEM_PROPERTY(lv_vpdicode,ENABLED,PROPERTY_OFF);
      END IF;
   END;
   
PROCEDURE ENABLE_KEYS(p_vpdifld VARCHAR2) IS
      lv_vpdicode VARCHAR2(20);
   BEGIN
      lv_vpdicode := p_vpdifld||'_VPDI_CODE';
      
      IF GET_ITEM_PROPERTY(lv_vpdicode,ENABLED) = 'FALSE' and
				 GET_ITEM_PROPERTY(lv_vpdicode,VISIBLE) = 'TRUE'   THEN
         SET_ITEM_PROPERTY(lv_vpdicode,ENABLED,PROPERTY_ON);
         SET_ITEM_PROPERTY(lv_vpdicode,NAVIGABLE,PROPERTY_ON);
         SET_ITEM_PROPERTY(lv_vpdicode,REQUIRED,PROPERTY_TRUE);
         SET_ITEM_PROPERTY(lv_vpdicode,ITEM_IS_VALID,PROPERTY_FALSE);
      END IF;
   END;

PROCEDURE WHEN_NEW_FORM_INSTANCE_NONKEY(p_vpdifld VARCHAR2, p_vpditbl VARCHAR2, p_retproc OUT VARCHAR2) IS
     lv_vpdicode VARCHAR2(30);
     lv_vpditbl  VARCHAR2(10);
   BEGIN
     lv_vpdicode := p_vpdifld||'_VPDI_CODE';
     lv_vpditbl :=  p_vpditbl;

     Forms_DDL('BEGIN g$_vpdi_check_tbl_pol('''||lv_vpditbl||'''); END;');

     IF form_success Then       
				
 		    SET_ITEM_PROPERTY(lv_vpdicode,VISIBLE,PROPERTY_ON);
        SET_ITEM_PROPERTY(lv_vpdicode,ENABLED,PROPERTY_ON);
        SET_ITEM_PROPERTY(lv_vpdicode,NAVIGABLE,PROPERTY_ON);

        DECLARE
      	   MY_CURSOR INTEGER;
      	   NUMROWS   INTEGER;
	         SQLSTR    VARCHAR2(100);
           PROCFNC   VARCHAR2(10);
        BEGIN
	         SQLSTR := 'Select g$_vpdi_security.g$_vpdi_get_proc_context_fnc from dual';
           GOKDBMS.DYNAMIC_SQL(SQLSTR,PROCFNC);
           IF PROCFNC IS NOT NULL THEN
           	 p_retproc := PROCFNC;
           END IF;
	      END;

        Forms_DDL('BEGIN g$_vpdi_security.g$_vpdi_set_process_context(''OVERAL'',''NEW''); END;');
     ELSE
 		    SET_ITEM_PROPERTY(lv_vpdicode,VISIBLE,PROPERTY_OFF);

     END IF;
   END;

PROCEDURE WHEN_NEW_FORM_INSTANCE_VPDIREQ(p_vpdifld VARCHAR2) IS
      lv_vpdicode VARCHAR2(20);
   BEGIN
      lv_vpdicode := p_vpdifld||'_VPDI_CODE';
      
      IF GET_ITEM_PROPERTY(lv_vpdicode,VISIBLE) = 'TRUE'   THEN
         SET_ITEM_PROPERTY(lv_vpdicode,REQUIRED,PROPERTY_TRUE);
         SET_ITEM_PROPERTY(lv_vpdicode,ITEM_IS_VALID,PROPERTY_FALSE);
      END IF;
   END;

END;
		*/
		/* <p>
		* 
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pVpdifld
		* @param pVpditbl
		* @param pRetproc
		*/
		public void whenNewFormInstance(NString pVpdifld, NString pVpditbl, Ref<NString> pRetproc)
		{
			NString lvVpdicode= NString.getNull();
			NString lvVpdidesc= NString.getNull();
			NString lvVpditbl= NString.getNull();
			lvVpdicode = pVpdifld.append("_VPDI_CODE");
			lvVpdidesc = pVpdifld.append("_VPDI_DESC");
			lvVpditbl = pVpditbl;
			try{
				formsDDL(toStr("BEGIN g$_vpdi_check_tbl_pol('").append(lvVpditbl).append("'); END;"));
//			if ( SupportClasses.SQLFORMS.FormSuccess().getValue() )
//			{
				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
				setItemVisible(lvVpdicode, true);
				setItemEnabled(lvVpdicode, true);
				setItemNavigable(lvVpdicode, true);
				setItemVisible(lvVpdidesc, true);
				copy("","GLOBAL.CANCEL_BTN_PRESSED");
				{
					NInteger myCursor= NInteger.getNull();
					NInteger numrows= NInteger.getNull();
					NString sqlstr= NString.getNull();
					NString procfnc= NString.getNull();
					sqlstr = toStr("Select g$_vpdi_security.g$_vpdi_get_proc_context_fnc from dual");
					Ref<NString> p_return_value1_ref = new Ref<NString>(procfnc);
					Gokdbms.dynamicSql(sqlstr, p_return_value1_ref);
					procfnc = p_return_value1_ref.val;
					if ( !procfnc.isNull() )
					{
						pRetproc.val = procfnc;
					}
				}
				formsDDL("BEGIN g$_vpdi_security.g$_vpdi_set_process_context('OVERAL','NEW'); END;");
			} catch (Exception e){
				throw new ApplicationException();
			}
		}
/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pVpdifld
		* @param pFormh
		*/
		public void keyExit(NString pVpdifld, NString pFormh)
		{
			NString lvVpdicode= NString.getNull();
			lvVpdicode = pVpdifld.append("_VPDI_CODE");
			if ( getItemVisible(lvVpdicode).equals("TRUE") )
			{
				{
					NString callingFormName = NString.getNull();
					callingFormName = toStr(getParentTaskName());
					formsDDL(toStr("BEGIN g$_vpdi_security.g$_vpdi_set_process_context('OVERAL','").append(pFormh).append("'); END;"));
				}
			}
		}
/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pVpdifld
		* @param pSysstats
		*/
		public void keyClrfrm(NString pVpdifld, NString pSysstats)
		{
			NString lvVpdicode= NString.getNull();
			lvVpdicode = pVpdifld.append("_VPDI_CODE");
			if ( getItemVisible(lvVpdicode).equals("TRUE") )
			{
				if ( pSysstats.notEquals("CHANGED") )
				{
					formsDDL("BEGIN g$_vpdi_security.g$_vpdi_set_process_context('OVERAL','ROLL');END;");
				}
			}
		}
/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pVpdifld
		*/
		public void disableKeys(NString pVpdifld)
		{
			NString lvVpdicode= NString.getNull();
			lvVpdicode = pVpdifld.append("_VPDI_CODE");
			if ( getItemEnabled(lvVpdicode).equals("TRUE") )
			{
				setItemEnabled(lvVpdicode, false);
			}
		}
/* <p>
/* </p>
		* @param pVpdifld
		*/
		public void enableKeys(NString pVpdifld)
		{
			NString lvVpdicode= NString.getNull();
			lvVpdicode = pVpdifld.append("_VPDI_CODE");
			if ( getItemEnabled(lvVpdicode).equals("FALSE") && getItemVisible(lvVpdicode).equals("TRUE") )
			{
				setItemEnabled(lvVpdicode, true);
				setItemNavigable(lvVpdicode, true);
				setItemRequired(lvVpdicode, true);
				setItemIsValid(lvVpdicode, false);
			}
		}
/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pVpdifld
		* @param pVpditbl
		* @param pRetproc
		*/
		public void whenNewFormInstanceNonkey(NString pVpdifld, NString pVpditbl, Ref<NString> pRetproc)
		{
			NString lvVpdicode= NString.getNull();
			NString lvVpditbl= NString.getNull();
			lvVpdicode = pVpdifld.append("_VPDI_CODE");
			lvVpditbl = pVpditbl;
			try{
				formsDDL(toStr("BEGIN g$_vpdi_check_tbl_pol('").append(lvVpditbl).append("'); END;"));
//				if ( SupportClasses.SQLFORMS.FormSuccess().getValue() )
//				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					setItemVisible(lvVpdicode, true);
					setItemEnabled(lvVpdicode, true);
					setItemNavigable(lvVpdicode, true);
					{
						NInteger myCursor= NInteger.getNull();
						NInteger numrows= NInteger.getNull();
						NString sqlstr= NString.getNull();
						NString procfnc= NString.getNull();
						sqlstr = toStr("Select g$_vpdi_security.g$_vpdi_get_proc_context_fnc from dual");
						Ref<NString> p_return_value1_ref = new Ref<NString>(procfnc);
						Gokdbms.dynamicSql(sqlstr, p_return_value1_ref);
						procfnc = p_return_value1_ref.val;
						if ( !procfnc.isNull() )
						{
							pRetproc.val = procfnc;
						}
					}
					formsDDL("BEGIN g$_vpdi_security.g$_vpdi_set_process_context('OVERAL','NEW'); END;");
			} catch(Exception e){
				setItemVisible(lvVpdicode, false);
			}
		}
/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pVpdifld
		*/
		public void whenNewFormInstanceVpdireq(NString pVpdifld)
		{
			NString lvVpdicode= NString.getNull();
			lvVpdicode = pVpdifld.append("_VPDI_CODE");
			if ( getItemVisible(lvVpdicode).equals("TRUE") )
			{
				setItemRequired(lvVpdicode, true);
				setItemIsValid(lvVpdicode, false);
			}
		}
		
	
	
}
