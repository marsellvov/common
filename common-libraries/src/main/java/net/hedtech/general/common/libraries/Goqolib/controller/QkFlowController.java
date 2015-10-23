package net.hedtech.general.common.libraries.Goqolib.controller;
 
import morphis.foundations.core.appdatalayer.data.DataCommand;
import morphis.foundations.core.appdatalayer.data.DbManager;
import morphis.foundations.core.appdatalayer.data.ResultSet;
import morphis.foundations.core.appdatalayer.events.AfterQuery;
import morphis.foundations.core.appdatalayer.events.BeforeQuery;
import morphis.foundations.core.appdatalayer.events.QueryEvent;
import morphis.foundations.core.appdatalayer.events.RowAdapterEvent;
import morphis.foundations.core.appsupportlib.model.IDBBusinessObject;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.types.NString;
import static morphis.foundations.core.types.Types.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import net.hedtech.general.common.libraries.Goqolib.GoqolibTaskPart;
import net.hedtech.general.common.libraries.Goqolib.model.GoqolibModel;
import net.hedtech.general.common.libraries.Goqolib.model.QkFlowAdapter;

		
public class QkFlowController extends AbstractSupportCodeObject {

	public QkFlowController(ISupportCodeContainer container) {
		super(container);
	}		
		
	public GoqolibTaskPart getContainer() {
		return (GoqolibTaskPart)super.getContainer();
	}

	public GoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER QK_FLOW.POST-QUERY
		 DECLARE
 HOLD_DESC VARCHAR2(80);
BEGIN 
    SELECT GUBOBJS_DESC
      INTO HOLD_DESC
      FROM GUBOBJS
     WHERE GUBOBJS_NAME = :QK_FLOW.GURCALL_FORM
       AND ROWNUM = 1;
--
  IF NVL(LENGTH(HOLD_DESC), 0) > 45 THEN
     :QK_FLOW.QK_DESC := SUBSTR(HOLD_DESC,1,40)||'...';
  ELSE
     :QK_FLOW.QK_DESC := HOLD_DESC;
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_FLOW.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void qkFlow_AfterQuery(RowAdapterEvent args)
		{
			
				//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
				QkFlowAdapter qkFlowElement = (QkFlowAdapter)args.getRow();


				int rowCount = 0;
				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				{
					NString holdDesc= NString.getNull();
					String sql1 = "SELECT GUBOBJS_DESC " +
	" FROM GUBOBJS " +
	" WHERE GUBOBJS_NAME = :QK_FLOW_GURCALL_FORM AND ROWNUM = 1 ";
					DataCommand command1 = new DataCommand(sql1);
					//Setting query parameters
					command1.addParameter("QK_FLOW_GURCALL_FORM", qkFlowElement.getGurcallForm());
					ResultSet results1 = command1.executeQuery();
					rowCount = command1.getRowCount();
					if ( results1.hasData() ) {
						holdDesc = results1.getStr(0);
					}
					results1.close();
					// 
					if ( toInt(isNull(holdDesc.getValue().length(), 0)).greater(45) )
					{
						qkFlowElement.setQkDesc(substring(holdDesc, toInt(1), toInt(40)).append("..."));
					}
					else {
						qkFlowElement.setQkDesc(holdDesc);
					}
				}
//
				this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.QkFlowController.qkFlow_AfterQuery is not completely migrated yet. Please read the Migration Guide.");
				
				
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * QK_FLOW.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void qkFlow_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("GUBOBJS_NAME", this.getFormModel().getGubobjs().getGubobjsName()));             


           
        }

		public void qkFlow_OnError() {
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

		public void qkFlow_blockOut() {
			
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			hideView("MENU_ENTIRE");
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PostBlock is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkFlow_CreateRecord() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getTask().getGoqrpls().gInvalidFunctionMsg();
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_CreateRecord is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkFlow_DeleteRecord() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getTask().getGoqrpls().gInvalidFunctionMsg();
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_DeleteRecord is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkFlow_NextBlock() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			goBlock(toStr("GUBOBJS"));
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_NextBlock is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkFlow_NextRecord() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( !isInLastRecord() )
//			{
//				nextRecord();
//			}
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_NextRecord is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkFlow_PreviousBlock() {
			
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			goBlock(toStr("GUBOBJS"));
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PreviousBlock is not completely migrated yet. Please read the Migration Guide.");
			

			
		}

		public void qkFlow_PreviousRecord() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( getCursorRecord().notEquals("1") )
//			{
//				previousRecord();
//			}
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PreviousRecord is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkFlow_keyNexItem() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getTask().getGoqrpls().gInvalidFunctionMsg();
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_keyNexItem is not completely migrated yet. Please read the Migration Guide.");

			
		}

		public void qkFlow_PreviousItem() {
			//F2J_WRAPPED_CODE : The code of this Trigger was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getTask().getGoqrpls().gInvalidFunctionMsg();
//
			this.getLogger().trace(this, "F2J :  trigger net.hedtech.general.common.libraries.Goqolib.controller.GoqolibFormController.qkMenuType_PreviousItem is not completely migrated yet. Please read the Migration Guide.");

			
		}

		
	
	
}

