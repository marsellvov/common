package net.hedtech.general.common.runtime;

import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.web.message.DefaultMessageBinder;
import morphis.foundations.core.appsupportlib.runtime.web.message.IMessageBinder;
import morphis.foundations.core.appsupportlib.runtime.web.message.IMessageBinderFactory;
import morphis.foundations.core.appsupportlib.runtime.web.message.MessageRequest;

public class MessageBinderFactory implements IMessageBinderFactory
{

	@Override
	public IMessageBinder getMessageBinder(ITask task, MessageRequest request) {
		return new MessageBinder(task, request);
	}

}