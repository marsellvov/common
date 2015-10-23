package net.hedtech.general.common.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import morphis.foundations.core.appdatalayer.data.OracleDataBaseFactory;
import morphis.foundations.core.util.logging.ILogger;
import morphis.foundations.core.util.logging.LogTraceEvent;
import morphis.foundations.core.util.logging.LogTraceEvent.LEVEL;
import morphis.foundations.core.util.logging.LogTraceMessage;
import morphis.foundations.core.util.logging.LoggerFactory;

public class OracleDatabaseFactory extends OracleDataBaseFactory {
	private static ILogger logger = LoggerFactory.getInstance(OracleDataBaseFactory.class);
	
	@Override
	protected void configureDbConnection(Connection connection) throws SQLException {
		try {
			super.configureDbConnection(connection);

		 	String commandText = "ALTER SESSION SET NLS_SORT = BINARY";
   
   			PreparedStatement st = connection.prepareStatement(commandText);
   			st.execute();
   			st.close();
	 	} 
	 	catch (Exception e) {	
	  		logger.warn(new LogTraceEvent(this, new LogTraceMessage(null), e, LEVEL.WARN));
  		}
	}
	
}
