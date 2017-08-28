package wiki.adapter.spring.boot.executor.classes.exeuter;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import wiki.adapter.spring.boot.executor.interfaces.CommandExecutorI;
import wiki.adapter.spring.boot.executor.interfaces.CommandI;
import wiki.adapter.spring.boot.executor.interfaces.CommandsFactoryI;

@Component
@Primary //Replace by order or priority
@SuppressWarnings("rawtypes")
public class CommandExecutorC implements CommandExecutorI {
	
	protected Logger m_logger = LoggerFactory.getLogger(CommandExecutorC.class.getSimpleName());
	@Autowired
	CommandsFactoryI m_commandsFactory;
	
	
	@Override
	public <T> T run (Class<T> resultType, Class entityType, String action, Map<String, Object> args) {
		CommandI<T> command = m_commandsFactory.get(resultType, entityType, action);
		return command.exe(args);
	}
}
