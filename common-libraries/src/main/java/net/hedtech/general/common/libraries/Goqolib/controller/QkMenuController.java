package net.hedtech.general.common.libraries.Goqolib.controller;
 
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.events.BeforeQuery;
import morphis.foundations.core.appdatalayer.events.QueryEvent;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appsupportlib.model.IDBBusinessObject;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;

		
public class QkMenuController extends AbstractSupportCodeObject {

	public QkMenuController(ISupportCodeContainer container) {
		super(container);
	}
	
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart)super.getContainer();
	}

	public GoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_MENU.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void qkMenu_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GUBOBJS_NAME", this.getFormModel().getGubobjs().getGubobjsName()));             


           
               }

		public void qkMenu_AfterQuery(RowAdapterEvent args) {
			// TODO Auto-generated method stub
			
		}

		public void qkMenu_OnError() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			{
//				NNumber lvErrcod = SupportClasses.SQLFORMS.ErrorCode();
//				NString lvErrtyp = SupportClasses.SQLFORMS.ErrorType();
//				NString lvErrtxt = SupportClasses.SQLFORMS.ErrorText();
//				if ( errorCode().equals(- (1403)) )
//				{
//				}
//				else {
//					if ((lvErrcod.equals(40102)))
//					{
//					}
//					else {
//						message(lvErrtyp.append("-").append(toChar(lvErrcod)).append(": ").append(lvErrtxt));
//						throw new ApplicationException();
//					}
//				}
//			}
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_OnError is not completely migrated yet. Please read the Migration Guide.");
			

			
		}

		public void qkMenu_blockOut() {
			
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			hideView("MENU_ENTIRE");
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PostBlock is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkMenu_CreateRecord() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getTask().getGoqrpls().gInvalidFunctionMsg();
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_CreateRecord is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkMenu_DeleteRecord() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getTask().getGoqrpls().gInvalidFunctionMsg();
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkMenu_NextBlock() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			goBlock(toStr("GUBOBJS"));
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_NextBlock is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkMenu_NextRecord() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( !isInLastRecord() )
//			{
//				nextRecord();
//			}
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_NextRecord is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkMenu_PreviousBlock() {
			
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			goBlock(toStr("GUBOBJS"));
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
			

			
		}

		public void qkMenu_PreviousRecord() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( getCursorRecord().notEquals("1") )
//			{
//				previousRecord();
//			}
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkMenu_keyNexItem() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getTask().getGoqrpls().gInvalidFunctionMsg();
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_keyNexItem is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkMenu_PreviousItem() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getTask().getGoqrpls().gInvalidFunctionMsg();
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PreviousItem is not completely migrated yet. Please read the Migration Guide.");

			
		}

		
	
	
}

