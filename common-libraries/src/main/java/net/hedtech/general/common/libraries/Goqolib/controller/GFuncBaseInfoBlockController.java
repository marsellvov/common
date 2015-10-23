package net.hedtech.general.common.libraries.Goqolib.controller;
 
import morphis.foundations.core.appdatalayer.data.DataCursor;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.ValidationTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import morphis.foundations.core.appsupportlib.runtime.Task;


import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.types.Types.*;

import net.hedtech.general.common.libraries.Goqolib.model.GFuncBaseInfoBlock;


		

public class GFuncBaseInfoBlockController extends AbstractSupportCodeObject {

	public GFuncBaseInfoBlockController(ISupportCodeContainer container) {
		super(container);
	}			
		
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart)super.getContainer();
	}

	public GoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER G$_FUNC_BASE_INFO_BLOCK.KEY-PRINT
		 BEGIN
  G$_GOQOLIB_FUNC_INFO_BLOCK.KEY_PRINT;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FUNC_BASE_INFO_BLOCK.KEY-PRINT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRINT")
		public void gFuncBaseInfoBlock_KeyPrint()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibFuncInfoBlock().keyPrint();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GFuncBaseInfoBlockController.gFuncBaseInfoBlock_KeyPrint is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FUNC_BASE_INFO_BLOCK.PRE-BLOCK
		 BEGIN
  G$_GOQOLIB_FUNC_INFO_BLOCK.SELECT_GEBFUNC(:FUNC_SPNSR_ORGN_PIDM, :FUNC_PURP_CODE,
                                            :FUNC_ETYP_CODE, :FUNC_FSTA_CODE,
                                            :FUNC_EMPH_CODE, :FUNC_PURP_DESC);
--
  G$_GOQOLIB_FUNC_INFO_BLOCK.SELECT_STVETYP(:ETYP_DESC);
--
  G$_GOQOLIB_FUNC_INFO_BLOCK.SELECT_SPRIDEN(:SPONSOR_ID ,:SPONSOR_NAME ,:LOCATION_CONTACT_ID ,:LOCATION_CONTACT_NAME ,
                                            :PRIMARY_CONTACT_ID ,:PRIMARY_CONTACT_NAME);
--
  EXECUTE_TRIGGER('SELECT_SSRMEET');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FUNC_BASE_INFO_BLOCK.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gFuncBaseInfoBlock_blockIn()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				Ref<NNumber> funcSpnsrOrgnPidm_ref = new Ref<NNumber>(getFormModel().getGFuncBaseInfoBlock().getFuncSpnsrOrgnPidm());
				Ref<NString> funcPurpCode_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getFuncPurpCode());
				Ref<NString> funcEtypCode_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getFuncEtypCode());
				Ref<NString> funcFstaCode_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getFuncFstaCode());
				Ref<NString> funcEmphCode_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getFuncEmphCode());
				Ref<NString> funcPurpDesc_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getFuncPurpDesc());
				getContainer().getGoqrpls().getGGoqolibFuncInfoBlock().selectGebfunc(funcSpnsrOrgnPidm_ref, funcPurpCode_ref, funcEtypCode_ref, funcFstaCode_ref, funcEmphCode_ref, funcPurpDesc_ref);
				getFormModel().getGFuncBaseInfoBlock().setFuncSpnsrOrgnPidm(funcSpnsrOrgnPidm_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setFuncPurpCode(funcPurpCode_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setFuncEtypCode(funcEtypCode_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setFuncFstaCode(funcFstaCode_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setFuncEmphCode(funcEmphCode_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setFuncPurpDesc(funcPurpDesc_ref.val);
				// 
				Ref<NString> etypDesc_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getEtypDesc());
				getContainer().getGoqrpls().getGGoqolibFuncInfoBlock().selectStvetyp(etypDesc_ref);
				getFormModel().getGFuncBaseInfoBlock().setEtypDesc(etypDesc_ref.val);
				// 
				Ref<NString> sponsorId_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getSponsorId());
				Ref<NString> sponsorName_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getSponsorName());
				Ref<NString> locationContactId_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getLocationContactId());
				Ref<NString> locationContactName_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getLocationContactName());
				Ref<NString> primaryContactId_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getPrimaryContactId());
				Ref<NString> primaryContactName_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getPrimaryContactName());
				getContainer().getGoqrpls().getGGoqolibFuncInfoBlock().selectSpriden(sponsorId_ref, sponsorName_ref, locationContactId_ref, locationContactName_ref, primaryContactId_ref, primaryContactName_ref);
				getFormModel().getGFuncBaseInfoBlock().setSponsorId(sponsorId_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setSponsorName(sponsorName_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setLocationContactId(locationContactId_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setLocationContactName(locationContactName_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setPrimaryContactId(primaryContactId_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setPrimaryContactName(primaryContactName_ref.val);
				// 
				executeAction("SELECT_SSRMEET");
				getContainer().getGoqrpls().gCheckFailure();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GFuncBaseInfoBlockController.gFuncBaseInfoBlock_blockIn is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FUNC_BASE_INFO_BLOCK.SELECT_SSRMEET
		 BEGIN
  G$_GOQOLIB_FUNC_INFO_BLOCK.SELECT_SSRMEET(:START_DATE,:END_DATE,:MONDAY, :TUESDAY, :WEDNESDAY,
                                            :THURSDAY, :FRIDAY, :SATURDAY, :SUNDAY, :BEGIN_TIME,
                                            :END_TIME,:BUILDING, :ROOM );
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FUNC_BASE_INFO_BLOCK.SELECT_SSRMEET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SELECT_SSRMEET")
		public void gFuncBaseInfoBlock_SelectSsrmeet()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				Ref<NString> startDate_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getStartDate());
				Ref<NString> endDate_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getEndDate());
				Ref<NString> monday_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getMonday());
				Ref<NString> tuesday_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getTuesday());
				Ref<NString> wednesday_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getWednesday());
				Ref<NString> thursday_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getThursday());
				Ref<NString> friday_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getFriday());
				Ref<NString> saturday_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getSaturday());
				Ref<NString> sunday_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getSunday());
				Ref<NString> beginTime_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getBeginTime());
				Ref<NString> endTime_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getEndTime());
				Ref<NString> building_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getBuilding());
				Ref<NString> room_ref = new Ref<NString>(getFormModel().getGFuncBaseInfoBlock().getRoom());
				getContainer().getGoqrpls().getGGoqolibFuncInfoBlock().selectSsrmeet(startDate_ref, endDate_ref, monday_ref, tuesday_ref, wednesday_ref, thursday_ref, friday_ref, saturday_ref, sunday_ref, beginTime_ref, endTime_ref, building_ref, room_ref);
				getFormModel().getGFuncBaseInfoBlock().setStartDate(startDate_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setEndDate(endDate_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setMonday(monday_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setTuesday(tuesday_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setWednesday(wednesday_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setThursday(thursday_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setFriday(friday_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setSaturday(saturday_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setSunday(sunday_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setBeginTime(beginTime_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setEndTime(endTime_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setBuilding(building_ref.val);
				getFormModel().getGFuncBaseInfoBlock().setRoom(room_ref.val);
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GFuncBaseInfoBlockController.gFuncBaseInfoBlock_SelectSsrmeet is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FUNC_BASE_INFO_BLOCK.KEY-PRVBLK
		 BEGIN
  G$_GOQOLIB_FUNC_INFO_BLOCK.KEY_PRVBLK;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FUNC_BASE_INFO_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gFuncBaseInfoBlock_PreviousBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibFuncInfoBlock().keyPrvblk();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GFuncBaseInfoBlockController.gFuncBaseInfoBlock_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FUNC_BASE_INFO_BLOCK.KEY-NXTBLK
		 BEGIN
  G$_GOQOLIB_FUNC_INFO_BLOCK.KEY_NXTBLK;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FUNC_BASE_INFO_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gFuncBaseInfoBlock_NextBlock()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibFuncInfoBlock().keyNxtblk();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GFuncBaseInfoBlockController.gFuncBaseInfoBlock_NextBlock is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FUNC_BASE_INFO_BLOCK.KEY-EXIT
		 BEGIN
  G$_GOQOLIB_FUNC_INFO_BLOCK.KEY_EXIT;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FUNC_BASE_INFO_BLOCK.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void gFuncBaseInfoBlock_Exit()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibFuncInfoBlock().keyExit();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GFuncBaseInfoBlockController.gFuncBaseInfoBlock_Exit is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER G$_FUNC_BASE_INFO_BLOCK.KEY-OTHERS
		 BEGIN
  G$_GOQOLIB_FUNC_INFO_BLOCK.KEY_OTHERS;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_FUNC_BASE_INFO_BLOCK.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS")
		public void gFuncBaseInfoBlock_KeyOthers()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				getContainer().getGoqrpls().getGGoqolibFuncInfoBlock().keyOthers();
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GFuncBaseInfoBlockController.gFuncBaseInfoBlock_KeyOthers is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/* Original PL/SQL code code for TRIGGER FUNC_ETYP_CODE.POST-CHANGE
		 DECLARE
  CURSOR PTI_CURSOR IS
    SELECT STVETYP_DESC
      FROM STVETYP
     WHERE STVETYP_CODE = :FUNC_ETYP_CODE;
BEGIN
  OPEN PTI_CURSOR;
  FETCH PTI_CURSOR INTO :ETYP_DESC;
  IF PTI_CURSOR%NOTFOUND THEN
    MESSAGE ( G$_NLS.Get('GOQOLIB-0001', 'FORM','*ERROR* Invalid code; press LIST for valid codes.') );
  END IF;
  CLOSE PTI_CURSOR;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FUNC_ETYP_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FUNC_ETYP_CODE")
		public void funcEtypCode_PostChange()
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				int rowCount = 0;
				{
					String sqlptiCursor = "SELECT STVETYP_DESC " +
	" FROM STVETYP " +
	" WHERE STVETYP_CODE = :FUNC_ETYP_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FUNC_ETYP_CODE", getFormModel().getGFuncBaseInfoBlock().getFuncEtypCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							getFormModel().getGFuncBaseInfoBlock().setEtypDesc(ptiCursorResults.getStr(0));
						}
						if ( ptiCursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("GOQOLIB-0001"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes.")));
						}
						ptiCursor.close();
					}
					finally{
						ptiCursor.close();
					}
				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GFuncBaseInfoBlockController.funcEtypCode_PostChange is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FUNC_ETYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FUNC_ETYP_CODE")
		public void funcEtypCode_validate()
		{
			

							this.funcEtypCode_PostChange();

			}

		
	
	
}

