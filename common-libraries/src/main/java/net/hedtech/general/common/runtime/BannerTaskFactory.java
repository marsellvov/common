package net.hedtech.general.common.runtime;


import morphis.foundations.core.appsupportlib.runtime.DefaultBehaviorModel;
import morphis.foundations.core.appsupportlib.runtime.DefaultTaskFactory;
import morphis.foundations.core.appsupportlib.runtime.IBehaviorModel;
import morphis.foundations.core.appsupportlib.runtime.IMessageServicesProvider;
import morphis.foundations.core.appsupportlib.runtime.INavigationModel;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.behaviors.FullPageBehavior;
import morphis.foundations.core.appsupportlib.runtime.process.ProcessNavigationModel;
import morphis.foundations.flavors.forms.appsupportlib.runtime.FormsNavigationModel;

public class BannerTaskFactory extends DefaultTaskFactory {
	
	private String[] exceptFlavorNamespaces = new String[] {
				"net.hedtech.banner.payroll.Ptvhscr",
				"net.hedtech.banner.payroll.Ptvshcd",
				"net.hedtech.banner.payroll.Ptvhspc",
				"net.hedtech.banner.payroll.Ptvpcat",
				"net.hedtech.banner.payroll.Ptvflcl",
				"net.hedtech.banner.payroll.Ptvlitg",
				"net.hedtech.banner.payroll.Ptvhstc",
				"net.hedtech.banner.payroll.Ptvhztc",
				"net.hedtech.banner.payroll.Ptvrank",
				"net.hedtech.banner.payroll.Ptv1099",
				"net.hedtech.banner.payroll.Ptvscpt",
				"net.hedtech.banner.payroll.Ptvfacc",
				"net.hedtech.banner.payroll.Ptvrevt",
				"net.hedtech.banner.payroll.Ptveeog",
				"net.hedtech.banner.payroll.Ptvcaty",
				"net.hedtech.banner.payroll.Ptvbdty",
				"net.hedtech.banner.payroll.Ptvends",
				"net.hedtech.banner.payroll.Ptvatrm",
				"net.hedtech.banner.payroll.Ptvassn",
				"net.hedtech.banner.payroll.Ptvfmst",
				"net.hedtech.banner.payroll.Ppaiden"
	};
	
	private String[] excludeFlavorNamespaces = new String[] {
			"net.hedtech.banner.payroll",
			"net.hedtech.banner.positioncontrol",
			"net.hedtech.banner.finance.common",
			"net.hedtech.banner.alumni.common",
			"net.hedtech.banner.document.management",
			"net.hedtech.tcc"
	};
	
	public BannerTaskFactory() {
		super();
	}
	
	@Override
	public INavigationModel getDefaultNavigationModel(ITask task) {
		if (task.getModel().getParams().getItemValue(Task.TASK_PARAMS, "TASK_PROC") != null)
			return new ProcessNavigationModel((Task)task);
		
		FormsNavigationModel model = new KeyBlockNavigationModel((Task)task);
		if ( isNonFlavorBehaviorForm(task) ) {
			model.setActive(false);
		}
		else
			model.setActive(true);
		return model;
	}
	
	@Override
	public IBehaviorModel getDefaultBehaviorModel(ITask task) {
		DefaultBehaviorModel model = new DefaultBehaviorModel((Task)task);
		//Regist used behaviours
		model.registBehavior(FullPageBehavior.class);
		return model;
	}

//	@Override
//	public IMessageServicesProvider getMessageServicesProvider() {
//		return new BannerMessageServicesProvider();
//	}
	
	private boolean isNonFlavorBehaviorForm(ITask task) {
		String fullName = task.getClass().getName();
		for(String excludeNamespace: excludeFlavorNamespaces)
			if(fullName.startsWith(excludeNamespace)){
				for(String exceptNamespace: exceptFlavorNamespaces)
					if(fullName.startsWith(exceptNamespace))
							return false;
				return true;
			}
		return false;
	}
}
