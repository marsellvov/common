package net.hedtech.general.common.forms;

import java.util.Hashtable;

import net.hedtech.general.common.forms.controller.DefaultFormController;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.BlockDescriptor;

public class BaseTask extends Task {

	public static final String VALUE_MASK = "VALUE_MASK";
	
	public BaseTask (String taskName) {
		super(taskName);
	}

	public BaseTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}
	
	public net.hedtech.general.common.forms.services.MenuServices getMenuServices() {
		return (net.hedtech.general.common.forms.services.MenuServices)getSupportCodeManager().getPackage("MENU_SERVICES");
	}
	 
	@Override
	public DefaultFormController getFormController() {	
		return (DefaultFormController)super.getFormController();
	}
	
	@Override
	public void nextBlock()	{
		try{
			this.getFormController().beforeNextBlock();
			super.nextBlock();
		} finally {
			this.getFormController().afterNextBlock();
		}
	}
	
	@Override
	public void previousBlock()	{
		try{
			this.getFormController().beforeNextBlock();
		super.previousBlock();
		} finally {
			this.getFormController().afterNextBlock();
		}
	}
	
	@Override
	public boolean goBlock(BlockDescriptor block) {
		try{
			this.getFormController().beforeNextBlock();
			boolean retVal = super.goBlock(block);
			return retVal;
		} finally {
			this.getFormController().afterNextBlock();
		}
		
		
	}
}
