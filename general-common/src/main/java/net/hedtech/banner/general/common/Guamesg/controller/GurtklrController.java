package net.hedtech.banner.general.common.Guamesg.controller;
 
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
import net.hedtech.banner.general.common.Guamesg.model.*;
import net.hedtech.banner.general.common.Guamesg.*;
import net.hedtech.banner.general.common.Guamesg.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GurtklrController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	
	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ID_CLASS");
	}	
	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("goqolib").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GCalendarBtnClass getGCalendarBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}	

	
	public GurtklrController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuamesgTask getTask() {
		return (GuamesgTask)super.getTask();
	}

	public GuamesgModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER GURTKLR.ENABLE_DISABLE_IDNO
		 IF :GURTKLR_SOURCE IS NOT NULL THEN
  SET_ITEM_PROPERTY('GURTKLR.IDNO',ENABLED,PROPERTY_OFF);
  SET_ITEM_PROPERTY('GURTKLR.IDNO_LBT',ENABLED,PROPERTY_OFF);
ELSE
  SET_ITEM_PROPERTY('GURTKLR.IDNO',ENABLED,PROPERTY_ON);
  SET_ITEM_PROPERTY('GURTKLR.IDNO',NAVIGABLE,PROPERTY_ON);
  SET_ITEM_PROPERTY('GURTKLR.IDNO_LBT',ENABLED,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.ENABLE_DISABLE_IDNO
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ENABLE_DISABLE_IDNO")
		public void gurtklr_EnableDisableIdno()
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				
				if(gurtklrElement == null){
					return;
				}
				if ( !gurtklrElement.getGurtklrSource().isNull() )
				{
					setItemEnabled("GURTKLR.IDNO", false);
					setItemEnabled("GURTKLR.IDNO_LBT", false);
				}
				else {
					setItemEnabled("GURTKLR.IDNO", true);
					setItemNavigable("GURTKLR.IDNO", true);
					setItemEnabled("GURTKLR.IDNO_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.WHEN-NEW-RECORD-INSTANCE
		 IF :SYSTEM.CURRENT_ITEM = 'IDNO' THEN
   --go to user id field so ref id item is not enabled/disabled while 
   -- cursor is in ref id field
   GO_ITEM('GURTKLR.GURTKLR_USER_ID');

   --dynamically enable/disable ref id and button
   EXECUTE_TRIGGER('ENABLE_DISABLE_IDNO');

   IF GET_ITEM_PROPERTY('IDNO', ENABLED) = 'TRUE' THEN
     --Go back to ref id only if the item is dynamically enabled
     GO_ITEM('GURTKLR.IDNO');
   END IF;
ELSE
   EXECUTE_TRIGGER('ENABLE_DISABLE_IDNO');
END IF;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void gurtklr_recordChange()
		{
			
				if ( getCurrentItem().equals("IDNO") )
				{
					goItem(toStr("GURTKLR.GURTKLR_USER_ID"));
					executeAction("ENABLE_DISABLE_IDNO");
					if ( getItemEnabled("IDNO").equals("TRUE") )
					{
						goItem(toStr("GURTKLR.IDNO"));
					}
				}
				else {
					executeAction("ENABLE_DISABLE_IDNO");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.POST-QUERY
		 BEGIN
  :QUERY_FLAG := 'N';
--
  G$_CHECK_VALUE ((:GURTKLR_CONFID_IND = 'Y' AND
                   :GURTKLR_CREATOR <> :CURRENT_USER AND
                   :GURTKLR_USER_ID <> :CURRENT_USER), NULL, TRUE);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void gurtklr_AfterQuery(RowAdapterEvent args)
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)args.getRow();

				try
				{
					gurtklrElement.setLockDbValues(true);
					
                                                                 try {  
                        this.gurtklrUserId_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.gurtklrTodoTime_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.gurtklrComment_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.idno_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.gurtklrSystemInd_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                                                                this.gurtklrPidm_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 

			gurtklrElement.setQueryFlag(toStr("N"));
			gurtklrElement.setGurtklrTodoDate(gurtklrElement.getGurtklrTodoDate());

				} finally { 
					gurtklrElement.setLockDbValues(false);
				}
				getTask().getGoqrpls().gCheckValue((toBool(gurtklrElement.getGurtklrConfidInd().equals("Y") && gurtklrElement.getGurtklrCreator().notEquals(getFormModel().getFormHeader().getCurrentUser()) && gurtklrElement.getGurtklrUserId().notEquals(getFormModel().getFormHeader().getCurrentUser()))), toStr(null), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.PRE-BLOCK
		 BEGIN
  :QUERY_DATE := SYSDATE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gurtklr_blockIn()
		{
			
				getFormModel().getFormHeader().setQueryDate(NDate.getNow());
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.PRE-INSERT
		 BEGIN
  :GURTKLR_CREATOR := :CURRENT_USER;
--
  DECLARE
    CURSOR PTI_CURSOR IS
      SELECT NVL(MAX(GURTKLR_SEQNO), 0) + 1
        FROM GURTKLR
       WHERE GURTKLR_CREATOR = :GURTKLR_CREATOR
         AND GURTKLR_USER_ID = :GURTKLR_USER_ID;
  BEGIN
    OPEN PTI_CURSOR;
    FETCH PTI_CURSOR INTO :GURTKLR_SEQNO;
    G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, NULL, TRUE);
  END;
--
  EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' );
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void gurtklr_BeforeRowInsert(RowAdapterEvent args)
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)args.getRow();

				
				int rowCount = 0;
				gurtklrElement.setGurtklrCreator(getFormModel().getFormHeader().getCurrentUser());
				{
					String sqlptiCursor = "SELECT NVL(MAX(GURTKLR_SEQNO), 0) + 1 " +
	" FROM GURTKLR " +
	" WHERE GURTKLR_CREATOR = :GURTKLR_CREATOR AND GURTKLR_USER_ID = :GURTKLR_USER_ID ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						ptiCursor.addParameter("GURTKLR_CREATOR", gurtklrElement.getGurtklrCreator());
						ptiCursor.addParameter("GURTKLR_USER_ID", gurtklrElement.getGurtklrUserId());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							gurtklrElement.setGurtklrSeqno(ptiCursorResults.getNumber(0));
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), toStr(null), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.PRE-UPDATE
		 BEGIN
  IF :GURTKLR_CREATOR IN (:WORKUSER, :CURRENT_USER) OR 
     (:GURTKLR_CREATOR IS NULL AND :WORKUSER IS NULL) OR 
     (:GURTKLR_CREATOR IS NULL AND :CURRENT_USER IS NULL) THEN
    NULL;
  ELSE
    IF :GURTKLR_USER_ID IN (:WORKUSER, :CURRENT_USER) OR 
       (:GURTKLR_USER_ID IS NULL AND :WORKUSER IS NULL) OR 
       (:GURTKLR_USER_ID IS NULL AND :CURRENT_USER IS NULL) THEN
      NULL;
    ELSE
      MESSAGE( G$_NLS.Get('GUAMESG-0000', 'FORM','*ERROR* Only Sender or Recipient may update message.') );
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
--
  EXECUTE_TRIGGER( 'UPDATE_ACTIVITY_DATE' );
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void gurtklr_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)args.getRow();


				if ( in(gurtklrElement.getGurtklrCreator(), getFormModel().getFormHeader().getWorkuser(), getFormModel().getFormHeader().getCurrentUser()).getValue() || (gurtklrElement.getGurtklrCreator().isNull() && getFormModel().getFormHeader().getWorkuser().isNull()) || (gurtklrElement.getGurtklrCreator().isNull() && getFormModel().getFormHeader().getCurrentUser().isNull()) )
				{
				}
				else {
					if ( in(gurtklrElement.getGurtklrUserId(), getFormModel().getFormHeader().getWorkuser(), getFormModel().getFormHeader().getCurrentUser()).getValue() || (gurtklrElement.getGurtklrUserId().isNull() && getFormModel().getFormHeader().getWorkuser().isNull()) || (gurtklrElement.getGurtklrUserId().isNull() && getFormModel().getFormHeader().getCurrentUser().isNull()) )
					{
					}
					else {
						errorMessage(GNls.Fget(toStr("GUAMESG-0000"), toStr("FORM"), toStr("*ERROR* Only Sender or Recipient may update message.")));
						throw new ApplicationException();
					}
				}
		
			executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.KEY-COMMIT
		 BEGIN
  IF :DUPREC_IND = 'Y' THEN
    MESSAGE( G$_NLS.Get('GUAMESG-0001', 'FORM','*ERROR* Can not duplicate record that was created from another form.') 
            );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  COMMIT_FORM ;
  IF :STATUS_FLAG = 'Y' THEN
    NULL;
  ELSE
    RETURN;
  END IF;
--
  :STATUS_FLAG := '';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gurtklr_Save()
		{

				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				if ( gurtklrElement.getDuprecInd().equals("Y") )
				{
					errorMessage(GNls.Fget(toStr("GUAMESG-0001"), toStr("FORM"), toStr("*ERROR* Can not duplicate record that was created from another form.")));
					throw new ApplicationException();
				}
				try{
					commitTask();
				}
				catch(DataRowSaveException e){
					if(e.getCode() == -1){
						errorMessage(GNls.Fget(toStr("GUAMESG-0012"), toStr("FORM"), toStr("*ERROR* Can not duplicate record .")));
						throw new ApplicationException();
					}
					throw e;
				}
				if ( gurtklrElement.getStatusFlag().equals("Y") )
				{
				}
				else {
					return ;
				}
				gurtklrElement.setStatusFlag(toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.KEY-CQUERY
		 BEGIN
  :GURTKLR_SEQNO := TRUNC(:GURTKLR_SEQNO + 1, 0);
  :RESEQUENCE_IND := 'Y';
--
  << RESEQUENCE >>
  :HOLD_NUMBER1 := :GURTKLR_SEQNO;
--
  NEXT_RECORD;
--
  IF (:GURTKLR_SEQNO IS NOT NULL) THEN
    :GURTKLR_SEQNO := :HOLD_NUMBER1 + 1;
    GOTO RESEQUENCE;
  END IF;
--
  COMMIT_FORM;
--
  :RESEQUENCE_IND := '';
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void gurtklr_TotalResults()
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}

				gurtklrElement.setGurtklrSeqno(trunc(gurtklrElement.getGurtklrSeqno().add(1), 0));
				getFormModel().getFormHeader().setResequenceInd(toStr("Y"));
				getFormModel().getFormHeader().setHoldNumber1(gurtklrElement.getGurtklrSeqno());
				nextRecord();
				if ((!gurtklrElement.getGurtklrSeqno().isNull()))
				{
					gurtklrElement.setGurtklrSeqno(getFormModel().getFormHeader().getHoldNumber1().add(1));
						getFormModel().getFormHeader().setHoldNumber1(gurtklrElement.getGurtklrSeqno());
				}
				commitTask();
				getFormModel().getFormHeader().setResequenceInd(toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.KEY-DELREC
		 BEGIN
  IF :GURTKLR.ROWID IS NULL THEN
    DELETE_RECORD;
    RETURN;
  END IF;
--
  IF :GURTKLR_CREATOR IN (:WORKUSER, :CURRENT_USER) OR
     (:GURTKLR_CREATOR IS NULL AND :WORKUSER IS NULL) OR
     (:GURTKLR_CREATOR IS NULL AND :CURRENT_USER IS NULL) THEN
    DELETE_RECORD;
  ELSE
    IF :GURTKLR_USER_ID IN (:WORKUSER, :CURRENT_USER) OR
       (:GURTKLR_USER_ID IS NULL AND :WORKUSER IS NULL) OR
       (:GURTKLR_USER_ID IS NULL AND :CURRENT_USER IS NULL) THEN
      DELETE_RECORD;
    ELSE
       MESSAGE( G$_NLS.Get('GUAMESG-0002', 'FORM','*ERROR* Only Sender or Recipient may delete messages.') );
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gurtklr_DeleteRecord()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				if ( gurtklrElement.getRowState().equals(DataRowStatus.INSERTED) )
				{
					deleteRecord();
					return ;
				}
				if ( in(gurtklrElement.getGurtklrCreator(), getFormModel().getFormHeader().getWorkuser(), getFormModel().getFormHeader().getCurrentUser()).getValue() || (gurtklrElement.getGurtklrCreator().isNull() && getFormModel().getFormHeader().getWorkuser().isNull()) || (gurtklrElement.getGurtklrCreator().isNull() && getFormModel().getFormHeader().getCurrentUser().isNull()) )
				{
					deleteRecord();
				}
				else {
					if ( in(gurtklrElement.getGurtklrUserId(), getFormModel().getFormHeader().getWorkuser(), getFormModel().getFormHeader().getCurrentUser()).getValue() || (gurtklrElement.getGurtklrUserId().isNull() && getFormModel().getFormHeader().getWorkuser().isNull()) || (gurtklrElement.getGurtklrUserId().isNull() && getFormModel().getFormHeader().getCurrentUser().isNull()) )
					{
						deleteRecord();
					}
					else {
						errorMessage(GNls.Fget(toStr("GUAMESG-0002"), toStr("FORM"), toStr("*ERROR* Only Sender or Recipient may delete messages.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.KEY-DUPREC
		 BEGIN
  :DUPREC_IND := '';
  DUPLICATE_RECORD;
  :GURTKLR_SEQNO := '';
  :GURTKLR_ACTIVITY_DATE := '';
  :GURTKLR_ITEM_REFNO := '';
  :GURTKLR_CREATOR := :CURRENT_USER;
--
  IF :GURTKLR_SOURCE = 'AMACONT' THEN
    MESSAGE( G$_NLS.Get('GUAMESG-0003', 'FORM','*ERROR* Can not duplicate a record that was created from another form.')  
            );
    :DUPREC_IND := 'Y';
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void gurtklr_CopyRecord()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				gurtklrElement.setDuprecInd(toStr(""));
				duplicateRecord();
				gurtklrElement.setGurtklrSeqno(toNumber(""));
				gurtklrElement.setGurtklrActivityDate(toDate(""));
				gurtklrElement.setGurtklrItemRefno(toStr(""));
				gurtklrElement.setGurtklrCreator(getFormModel().getFormHeader().getCurrentUser());
				if ( gurtklrElement.getGurtklrSource().equals("AMACONT") )
				{
					errorMessage(GNls.Fget(toStr("GUAMESG-0003"), toStr("FORM"), toStr("*ERROR* Can not duplicate a record that was created from another form.")));
					gurtklrElement.setDuprecInd(toStr("Y"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.KEY-ENTQRY
		 BEGIN
  :QUERY_DATE := '';
  :WORKUSER := '';
  ENTER_QUERY;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void gurtklr_Search()
		{
			
				getFormModel().getFormHeader().setQueryDate(toDate(""));
				getFormModel().getFormHeader().setWorkuser(toStr(""));
				enterQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR.POST-UPDATE
		 IF :GLOBAL.ALUSYS = 'Y' THEN
	IF :GURTKLR_SOURCE = 'AMACONT' OR
	   :GURTKLR_SOURCE = 'BWDKPCNT' THEN
	   P_Update_Amrcont(:GURTKLR_PIDM, :GURTKLR_ITEM_REFNO);
	END IF;
END IF;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void gurtklr_AfterRowUpdate(RowAdapterEvent args)
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)args.getRow();


				if ( getGlobal("ALUSYS").equals("Y") )
				{
					if ( gurtklrElement.getGurtklrSource().equals("AMACONT") || gurtklrElement.getGurtklrSource().equals("BWDKPCNT") )
					{
						this.getTask().getServices().pUpdateAmrcont(gurtklrElement, gurtklrElement.getGurtklrPidm(), gurtklrElement.getGurtklrItemRefno());
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void gurtklr_BeforeQuery(QueryEvent args)
		{
			
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("WORKUSER", this.getFormModel().getFormHeader().getWorkuser()));             

                GurtklrAdapter gurtklrElement = (GurtklrAdapter) this.getFormModel().getGurtklr().getRowAdapter(true);    
                if(gurtklrElement == null){
					return;
				}
              if (gurtklrElement != null ) {
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GURTKLR_CREATOR", gurtklrElement.getGurtklrCreator()));
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GURTKLR_USER_ID", gurtklrElement.getGurtklrUserId()));
              }
           
        }

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_USER_ID.POST-CHANGE
		 DECLARE
  PTI_INTO_TEMP        VARCHAR2(1);
  CURSOR PTI_CURSOR IS
    SELECT 'X'
      FROM ALL_USERS
     WHERE ALL_USERS.USERNAME = :GURTKLR_USER_ID;
BEGIN
  G$_CHECK_QUERY_MODE;
--
  IF (:GLOBAL.QUERY_MODE <> '1') THEN
    OPEN PTI_CURSOR;
    FETCH PTI_CURSOR INTO PTI_INTO_TEMP;
    G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('GUAMESG-0004', 'FORM','*ERROR* Invalid User ID.') , TRUE);
--
    IF :GURTKLR_USER_ID = 'BASELINE' THEN
      IF NOT G$_CHECK_ACCESS('BROADCAST',:GLOBAL.CURRENT_USER) THEN
      	MESSAGE('*ERROR* You are not authorized to send messages to this user.');
      	RAISE FORM_TRIGGER_FAILURE;
      END IF;
    END IF;
  END IF;
--
  :GURTKLR.user_id_name := g$_security.g$_get_username_name(:gurtklr_user_id);
  :GLOBAL.QUERY_MODE := '0';
EXCEPTION
  WHEN FORM_TRIGGER_FAILURE THEN
    :GLOBAL.QUERY_MODE := '0';
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_USER_ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GURTKLR_USER_ID")
		public void gurtklrUserId_PostChange()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				int rowCount = 0;
				if(gurtklrElement.getGurtklrUserId().isNull())
		return;
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM ALL_USERS " +
	" WHERE ALL_USERS.USERNAME = :GURTKLR_USER_ID ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						try
						{
							getTask().getGoqrpls().gCheckQueryMode();
							if ((getGlobal("QUERY_MODE").notEquals("1")))
							{
								ptiCursor.addParameter("GURTKLR_USER_ID", gurtklrElement.getGurtklrUserId());
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									ptiIntoTemp = ptiCursorResults.getStr(0);
								}
								getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("GUAMESG-0004"), toStr("FORM"), toStr("*ERROR* Invalid User ID.")), toBool(NBool.True));
								if ( gurtklrElement.getGurtklrUserId().equals("BASELINE") )
								{
									if ( getTask().getGoqrpls().gCheckAccess(toStr("BROADCAST"), getGlobal("CURRENT_USER")).not() )
									{
										errorMessage("*ERROR* You are not authorized to send messages to this user.");
										throw new ApplicationException();
									}
								}
							}
							gurtklrElement.setUserIdName(GSecurity.FgGetUsernameName(gurtklrElement.getGurtklrUserId()));
							setGlobal("QUERY_MODE", toStr("0"));
						}
						catch(ApplicationException e)
						{
							setGlobal("QUERY_MODE", toStr("0"));
							throw new ApplicationException();
						}
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_USER_ID.KEY-LISTVAL
		 DECLARE
	ret_value BOOLEAN;
BEGIN
  ret_value := show_lov('USER_ID_LOV');
  G$_CHECK_FAILURE;
  :GURTKLR_USER_ID := :GLOBAL.VALUE;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_USER_ID.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GURTKLR_USER_ID", function=KeyFunction.LIST_VALUES)
		public void gurtklrUserId_ListValues()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				{
					NBool retValue= NBool.getNull();
					retValue = showLov("USER_ID_LOV");
					getTask().getGoqrpls().gCheckFailure();
					gurtklrElement.setGurtklrUserId(getGlobal("VALUE"));
//					nextItem();
					
				}
				this.gurtklrUserId_PostChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_USER_ID.KEY-PREV-ITEM
		    IF :GURTKLR_SOURCE IS NULL THEN
      PREVIOUS_FIELD;
   ELSE
      PREVIOUS_FIELD; PREVIOUS_FIELD;
   END IF ;
--
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_USER_ID.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="GURTKLR_USER_ID", function=KeyFunction.PREVIOUS_ITEM)
		public void gurtklrUserId_PreviousItem()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				if ( gurtklrElement.getGurtklrSource().isNull() )
				{
					previousItem();
				}
				else {
					previousItem();
					previousItem();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNO_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="IDNO_LBT")
		public void idnoLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER IDNO_LBT.WHEN-BUTTON-PRESSED
		 G$_KEY_OPT_MENU('GURTKLR.IDNO', G$_NLS.Get('GUAMESG-0005', 'FORM','Person Search (SOAIDEN)') ,'LIST_VALUES',
 G$_NLS.Get('GUAMESG-0006', 'FORM','Non-Person Search (SOACOMP)') ,'COUNT_QUERY','','','','');
G$_CHECK_FAILURE; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNO_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="IDNO_LBT")
		public void idnoLbt_buttonClick()
		{
				getTask().getGoqrpls().gKeyOptMenu(toStr("GURTKLR.IDNO"), GNls.Fget(toStr("GUAMESG-0005"), toStr("FORM"), toStr("Person Search (SOAIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("GUAMESG-0006"), toStr("FORM"), toStr("Non-Person Search (SOACOMP)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_COMMENT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GURTKLR_COMMENT_BTN")
		public void gurtklrCommentBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_COMMENT_BTN.WHEN-BUTTON-PRESSED
		 GO_ITEM('GURTKLR.GURTKLR_COMMENT');
DO_KEY('COUNT_QUERY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_COMMENT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GURTKLR_COMMENT_BTN")
		public void gurtklrCommentBtn_buttonClick()
		{
			
				goItem(toStr("GURTKLR.GURTKLR_COMMENT"));
				executeAction("COUNT_QUERY");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_USER_ID_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GURTKLR_USER_ID_LBT")
		public void gurtklrUserIdLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_TODO_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GURTKLR_TODO_DATE", function=KeyFunction.NEXT_ITEM)
		public void gurtklrTodoDate_keyNexItem()
		{
		
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_TODO_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GURTKLR_TODO_DATE", function=KeyFunction.ITEM_CHANGE)
		public void gurtklrTodoDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_TODO_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GURTKLR_TODO_DATE", function=KeyFunction.ITEM_OUT)
		public void gurtklrTodoDate_itemOut()
		{
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_TODO_DATE.WHEN-VALIDATE-ITEM
		 G$_DATE_REFORMAT('','');
G$_CHECK_FAILURE;
BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
   IF :GURTKLR_TODO_DATE IS NULL THEN
     MESSAGE(G$_NLS.Get('GUAMESG-0007', 'FORM','*ERROR* Date is required.'));
     RAISE FORM_TRIGGER_FAILURE;
   END IF;
--
   << PTI_END_TRIGGER >>
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
       G$_DATE_WHEN_NEW_ITEM;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_TODO_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GURTKLR_TODO_DATE")
		public void gurtklrTodoDate_validate()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
				
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
							setGlobal("QUERY_MODE", toStr("0"));
							getTask().getGoqrpls().gDateWhenNewItem();
							
							
					}
					if ( gurtklrElement.getGurtklrTodoDate().isNull() )
					{
						errorMessage(GNls.Fget(toStr("GUAMESG-0007"), toStr("FORM"), toStr("*ERROR* Date is required.")));
						throw new ApplicationException();
					}
					
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					getTask().getGoqrpls().gDateWhenNewItem();
					throw new ApplicationException();
				}				
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_TODO_TIME.WHEN-MOUSE-DOUBLECLICK
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_TODO_TIME.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GURTKLR_TODO_TIME")
		public void gurtklrTodoTime_doubleClick()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_TODO_TIME.POST-CHANGE
		 DECLARE
HLD_TIME VARCHAR2(4);
BEGIN
   G$_CHECK_QUERY_MODE ;
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
--
   HLD_TIME := LPAD(TO_CHAR(:GURTKLR_TODO_TIME),4,'0');
--
   IF SUBSTR(HLD_TIME,1, 2) > '23' THEN
      MESSAGE( G$_NLS.Get('GUAMESG-0008', 'FORM','*ERROR* Invalid Hours entered.') );
      RAISE FORM_TRIGGER_FAILURE ;
   END IF;
--
   IF SUBSTR(HLD_TIME,3, 2) > '59' THEN
      MESSAGE( G$_NLS.Get('GUAMESG-0009', 'FORM','*ERROR* Invalid Minutes entered.') );
      RAISE FORM_TRIGGER_FAILURE ;
   END IF;
--
   << PTI_END_TRIGGER >>
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_TODO_TIME.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GURTKLR_TODO_TIME")
		public void gurtklrTodoTime_PostChange()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				if(gurtklrElement.getGurtklrTodoTime().isNull())
		return;
				{
					NString hldTime= NString.getNull();
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						if ((getGlobal("QUERY_MODE").equals("1")))
						{
								setGlobal("QUERY_MODE", toStr("0"));
						}
						hldTime = lpad(toChar(gurtklrElement.getGurtklrTodoTime()), 4, "0");
						if ( substring(hldTime, toInt(1), toInt(2)).greater("23") )
						{
							errorMessage(GNls.Fget(toStr("GUAMESG-0008"), toStr("FORM"), toStr("*ERROR* Invalid Hours entered.")));
							throw new ApplicationException();
						}
						if ( substring(hldTime, toInt(3), toInt(2)).greater("59") )
						{
							errorMessage(GNls.Fget(toStr("GUAMESG-0009"), toStr("FORM"), toStr("*ERROR* Invalid Minutes entered.")));
							throw new ApplicationException();
						}
						
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_COMMENT.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   :QUERY_FLAG := 'Y' ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_COMMENT.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GURTKLR_COMMENT")
		public void gurtklrComment_PostChange()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				if(gurtklrElement.getGurtklrComment().isNull())
					return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					gurtklrElement.setQueryFlag(toStr("Y"));
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_COMMENT.KEY-CQUERY
		 EDIT_TEXTITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_COMMENT.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="GURTKLR_COMMENT", function=KeyFunction.COUNT_QUERY)
		public void gurtklrComment_TotalResults()
		{

				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement==null)
					return;
				{
					Ref<NBool> edOk= new Ref<NBool>();
					Ref<NString> returnedText= new Ref<NString>();
					
					editTextitem(returnedText, edOk);
					
					if ( edOk.val.getValue()  )
					{
						if ( length(returnedText.val).greater(180) ){
							gurtklrElement.setGurtklrComment(toStr(substring(replace(returnedText.val, chr(0), ""), toInt(1), toInt(180))));

						}else
							gurtklrElement.setGurtklrComment(toStr(returnedText.val));
					}
				}
					
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_SOURCE.KEY-LISTVAL
		    IF :GURTKLR_SOURCE IS NULL  THEN
      MESSAGE (  G$_NLS.Get('GUAMESG-0010', 'FORM','*ERROR* Must have a Source.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   ELSE
      :GLOBAL.KEY_IDNO := :IDNO ;
      :GLOBAL.ITEM_REFNO := :GURTKLR_ITEM_REFNO ;
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(USER,:GURTKLR_SOURCE,'QUERY');
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SOURCE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GURTKLR_SOURCE", function=KeyFunction.LIST_VALUES)
		public void gurtklrSource_ListValues()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				if ( gurtklrElement.getGurtklrSource().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GUAMESG-0010"), toStr("FORM"), toStr("*ERROR* Must have a Source.")));
					throw new ApplicationException();
				}
				else {
					setGlobal("KEY_IDNO", gurtklrElement.getIdno());
					setGlobal("ITEM_REFNO", gurtklrElement.getGurtklrItemRefno());
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls().gSecuredFormCall(getUser(), gurtklrElement.getGurtklrSource(), toStr("QUERY"));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNO.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="IDNO", function=KeyFunction.ITEM_IN)
		public void idno_itemIn()
		{
			
				getGIdClass().itemIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNO.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="IDNO", function=KeyFunction.NEXT_ITEM)
		public void idno_keyNexItem()
		{
//			idno_PostChange();
				getGIdClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="IDNO")
		public void idno_validate()
		{
			
				getGIdClass().validate();
				idno_PostChange();
			}

		
		/* Original PL/SQL code code for TRIGGER IDNO.POST-TEXT-ITEM
		 BEGIN
   IF :IDNO IS NULL THEN
      :NAME := '' ;
      :GURTKLR_PIDM := '' ;
   END IF;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNO.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="IDNO", function=KeyFunction.ITEM_OUT)
		public void idno_itemOut()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				if ( gurtklrElement.getIdno().isNull() )
				{
					gurtklrElement.setNname(toStr(""));
					gurtklrElement.setGurtklrPidm(toNumber(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER IDNO.POST-CHANGE
		 DECLARE
	confid_ind   VARCHAR2(30) := NULL;
	deceased_ind VARCHAR2(30) := NULL;
BEGIN
  G$_CHECK_QUERY_MODE;
  g$_valid_all_id(:IDNO, :GURTKLR_PIDM, :NAME, confid_ind, deceased_ind, 'NYY');
  :GLOBAL.QUERY_MODE := '0';
EXCEPTION
  WHEN FORM_TRIGGER_FAILURE THEN
    :GLOBAL.QUERY_MODE := '0';
    RAISE FORM_TRIGGER_FAILURE;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNO.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="IDNO")
		public void idno_PostChange()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);


				if(gurtklrElement==null || gurtklrElement.getIdno().isNull())
					return;
				{
					NString confidInd = NString.getNull();
					NString deceasedInd = NString.getNull();
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						Ref<NString> pId_ref = new Ref<NString>(gurtklrElement.getIdno());
						Ref<NNumber> pPidm_ref = new Ref<NNumber>(gurtklrElement.getGurtklrPidm());
						Ref<NString> pFullName_ref = new Ref<NString>(gurtklrElement.getNname());
						Ref<NString> pConfidInd_ref = new Ref<NString>(confidInd);
						Ref<NString> pDcsdInd_ref = new Ref<NString>(deceasedInd);
						getTask().getGoqrpls().gValidAllId(pId_ref, pPidm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref, toStr("NYY"));
						gurtklrElement.setIdno(pId_ref.val);
						gurtklrElement.setGurtklrPidm(pPidm_ref.val);
						gurtklrElement.setNname(pFullName_ref.val);
						confidInd = pConfidInd_ref.val;
						deceasedInd = pDcsdInd_ref.val;
						setGlobal("QUERY_MODE", toStr("0"));
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER IDNO.KEY-CQUERY
		    G$_COPY_FLD_ATTR;
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,'SOACOMP','');
   G$_RESET_GLOBAL;
   IF :GLOBAL.VALUE IS NOT NULL THEN
      :IDNO := :GLOBAL.VALUE ;
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNO.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="IDNO", function=KeyFunction.COUNT_QUERY)
		public void idno_TotalResults()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("SOACOMP"), toStr(""));
				getTask().getGoqrpls().gResetGlobal();
				if ( !getGlobal("VALUE").isNull() )
				{
					gurtklrElement.setIdno(getGlobal("VALUE"));
					nextItem();
					idno_PostChange();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER IDNO.KEY-LISTVAL
		    G$_COPY_FLD_ATTR;
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,'SOAIDEN','');
   G$_RESET_GLOBAL;
   IF :GLOBAL.VALUE IS NOT NULL THEN
      :IDNO := :GLOBAL.VALUE ;
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="IDNO", function=KeyFunction.LIST_VALUES)
		public void idno_ListValues()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("SOAIDEN"), toStr(""));
				getTask().getGoqrpls().gResetGlobal();
				if ( !getGlobal("VALUE").isNull() )
				{
					gurtklrElement.setIdno(getGlobal("VALUE"));
					nextItem();
					idno_PostChange();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NAME", function=KeyFunction.NEXT_ITEM)
		public void name_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SYSTEM_IND.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GURTKLR_SYSTEM_IND")
		public void gurtklrSystemInd_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SYSTEM_IND.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GURTKLR_SYSTEM_IND", function=KeyFunction.ITEM_CHANGE)
		public void gurtklrSystemInd_itemChange()
		{
			gurtklrSystemInd_validate();
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SYSTEM_IND.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GURTKLR_SYSTEM_IND")
		public void gurtklrSystemInd_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SYSTEM_IND.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GURTKLR_SYSTEM_IND")
		public void gurtklrSystemInd_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
				gurtklrSystemInd_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SYSTEM_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GURTKLR_SYSTEM_IND", function=KeyFunction.NEXT_ITEM)
		public void gurtklrSystemInd_keyNexItem()
		{
			gurtklrSystemInd_validate();
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SYSTEM_IND.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GURTKLR_SYSTEM_IND", function=KeyFunction.ITEM_OUT)
		public void gurtklrSystemInd_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_SYSTEM_IND.POST-CHANGE
		 declare

   cursor gtvsysi_c 
       is
    select gtvsysi_desc
      from gtvsysi
     where gtvsysi_code = :gurtklr_system_ind;


begin

    open gtvsysi_c;
    fetch gtvsysi_c into :gurtklr_system_desc;
    close gtvsysi_c;

end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SYSTEM_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GURTKLR_SYSTEM_IND")
		public void gurtklrSystemInd_PostChange()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				if(gurtklrElement.getGurtklrSystemInd().isNull())
		return;
				{
					String sqlgtvsysiC = "SELECT gtvsysi_desc " +
	" FROM gtvsysi " +
	" WHERE gtvsysi_code = :GURTKLR_SYSTEM_IND ";
					DataCursor gtvsysiC = new DataCursor(sqlgtvsysiC);
					try {
						gtvsysiC.addParameter("GURTKLR_SYSTEM_IND", gurtklrElement.getGurtklrSystemInd());
						gtvsysiC.open();
						ResultSet gtvsysiCResults = gtvsysiC.fetchInto();
						if ( gtvsysiCResults != null ) {
							gurtklrElement.setGurtklrSystemDesc(gtvsysiCResults.getStr(0));
						}
					}
					finally{
						gtvsysiC.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SYSTEM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GURTKLR_SYSTEM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void gurtklrSystemDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_STATUS.KEY-CQUERY
		    IF :GURTKLR_SOURCE IS NULL  THEN
      MESSAGE (  G$_NLS.Get('GUAMESG-0011', 'FORM','*ERROR* Must have a Source.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   ELSE
      :GLOBAL.KEY_IDNO := :IDNO ;
      :GLOBAL.ITEM_REFNO := :GURTKLR_ITEM_REFNO ;
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(USER,:GURTKLR_SOURCE,'QUERY');
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_STATUS.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="GURTKLR_STATUS", function=KeyFunction.COUNT_QUERY)
		public void gurtklrStatus_TotalResults()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				if ( gurtklrElement.getGurtklrSource().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GUAMESG-0011"), toStr("FORM"), toStr("*ERROR* Must have a Source.")));
					throw new ApplicationException();
				}
				else {
					setGlobal("KEY_IDNO", gurtklrElement.getIdno());
					setGlobal("ITEM_REFNO", gurtklrElement.getGurtklrItemRefno());
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls().gSecuredFormCall(getUser(), gurtklrElement.getGurtklrSource(), toStr("QUERY"));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SYSTEM_IND_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GURTKLR_SYSTEM_IND_LBT")
		public void gurtklrSystemIndLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_TODO_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GURTKLR_TODO_DATE_DBT")
		public void gurtklrTodoDateDbt_click()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_TODO_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GURTKLR_TODO_DATE_DBT")
		public void gurtklrTodoDateDbt_buttonClick()
		{
			
				getGCalendarBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER GURTKLR_PIDM.POST-CHANGE
		 DECLARE
	lv_pidm    GURTKLR.GURTKLR_PIDM%TYPE := NULL;
	confid_ind   VARCHAR2(30) := NULL;
	deceased_ind VARCHAR2(30) := NULL;
	lv_var     BOOLEAN := FALSE;
BEGIN
  G$_CHECK_QUERY_MODE;
  lv_var := g$_sel_spriden_id(:GURTKLR_PIDM, :IDNO);
  g$_valid_all_id(:IDNO, lv_pidm, :NAME, confid_ind, deceased_ind, 'NYY');
  :GLOBAL.QUERY_MODE := '0';
EXCEPTION
  WHEN FORM_TRIGGER_FAILURE THEN
    :GLOBAL.QUERY_MODE := '0';
    RAISE FORM_TRIGGER_FAILURE;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_PIDM.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="GURTKLR_PIDM")
		public void gurtklrPidm_PostChange()
		{
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
				if(gurtklrElement == null){
					return;
				}
				if(gurtklrElement.getGurtklrPidm().isNull())
		return;
				{
					NNumber lvPidm = NNumber.getNull();
					NString confidInd = NString.getNull();
					NString deceasedInd = NString.getNull();
					NBool lvVar = toBool(NBool.False);
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						Ref<NString> idOut_ref= new Ref<NString>(gurtklrElement.getGurtklrIdenCode());
						lvVar = getTask().getGoqrpls().gSelSpridenId(gurtklrElement.getGurtklrPidm(), idOut_ref);
						Ref<NString> pId_ref = new Ref<NString>(gurtklrElement.getIdno());
						Ref<NNumber> pPidm_ref = new Ref<NNumber>(lvPidm);
						Ref<NString> pFullName_ref = new Ref<NString>(gurtklrElement.getNname());
						Ref<NString> pConfidInd_ref = new Ref<NString>(confidInd);
						Ref<NString> pDcsdInd_ref = new Ref<NString>(deceasedInd);
						getTask().getGoqrpls().gValidAllId(idOut_ref, pPidm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref, toStr("NYY"));
						gurtklrElement.setIdno(idOut_ref.val);
						lvPidm = pPidm_ref.val;
						gurtklrElement.setNname(pFullName_ref.val);
						confidInd = pConfidInd_ref.val;
						deceasedInd = pDcsdInd_ref.val;
						setGlobal("QUERY_MODE", toStr("0"));
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_USER_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GURTKLR_USER_ID")
		public void gurtklrUserId_validate()
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
							this.gurtklrUserId_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_TODO_TIME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GURTKLR_TODO_TIME")
		public void gurtklrTodoTime_validate()
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
							this.gurtklrTodoTime_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_COMMENT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GURTKLR_COMMENT")
		public void gurtklrComment_validate()
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
							this.gurtklrComment_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_SYSTEM_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GURTKLR_SYSTEM_IND")
		public void gurtklrSystemInd_validate()
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
							this.gurtklrSystemInd_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GURTKLR_PIDM.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GURTKLR_PIDM")
		public void gurtklrPidm_validate()
		{
			
				GurtklrAdapter gurtklrElement = (GurtklrAdapter)this.getFormModel().getGurtklr().getRowAdapter(true);
							this.gurtklrPidm_PostChange();

			}

		
	
	
}

