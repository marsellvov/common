package net.hedtech.general.common.forms.interactionStrategies;
import java.util.EventObject;

import net.hedtech.general.common.services.BannerServices;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.ItemServices;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.ui.IInteractionBlock;
import morphis.foundations.core.appsupportlib.ui.IInteractionModeListener;
import morphis.foundations.core.appsupportlib.ui.IInteractionRulesStrategy;
import morphis.foundations.core.appsupportlib.ui.InteractionBlockMode;
import morphis.foundations.core.util.event.EventHelper;


public class BannerInteractionStrategy implements IInteractionModeListener {

	public BannerInteractionStrategy(IInteractionBlock block) {
		block.getInteractionRulesStrategy().addInteractionModelListener(this);
		
		//Not needed for now as no model events have been used so far. Uncomment if needed
		EventHelper.registerEventListeners(block.getModel(), this);
	}
	
	
	@Override
	public void modeChanged(EventObject ev) {
		IInteractionRulesStrategy strategy = (IInteractionRulesStrategy)ev.getSource();
		InteractionBlockMode mode = strategy.getCurrentMode();
		ITask task = strategy.getContext().getDescriptor().getTask();
		Boolean queryOnlyTask = (Boolean)task.getModel().getParams().getItemValue(Task.TASK_PARAMS, "QUERY_ONLY");
		if ((queryOnlyTask != null && queryOnlyTask.booleanValue()) || BannerServices.isQueryOnlyTask(TaskServices.getCurrentTask())
				|| mode == InteractionBlockMode.Search || mode == InteractionBlockMode.None)
		{
			ItemServices.setItemVisible("MENU_CONTROL.SAVE_BT",true);
			ItemServices.setItemVisible("MENU_CONTROL.SAVE_BT",false);
		}
		else
		{
			ItemServices.setItemVisible("MENU_CONTROL.SAVE_BT",false);
			ItemServices.setItemVisible("MENU_CONTROL.SAVE_BT",true);
		}
		
	}

	@Override
	public void beforeExecuteQuery(EventObject ev) {
		
	}

	@Override
	public void afterExecuteQuery(EventObject ev) {

		
	}

	

}
