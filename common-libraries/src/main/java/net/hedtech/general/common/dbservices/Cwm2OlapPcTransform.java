package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapPcTransform {
		public static void createScript(NString pDirectory,NString pSchema,NString pPcTable,NString pPcParent,NString pPcChild,NString pTTable,NString pTTablespace,NString pPcRoot,NNumber pLevels,NString pLevelsList,NString pShortDescription,NString pLongDescription,NString pAttributesList) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_PC_TRANSFORM.CREATE_SCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIRECTORY", pDirectory);
			cmd.addParameter("@P_SCHEMA", pSchema);
			cmd.addParameter("@P_PC_TABLE", pPcTable);
			cmd.addParameter("@P_PC_PARENT", pPcParent);
			cmd.addParameter("@P_PC_CHILD", pPcChild);
			cmd.addParameter("@P_T_TABLE", pTTable);
			cmd.addParameter("@P_T_TABLESPACE", pTTablespace);
			cmd.addParameter("@P_PC_ROOT", pPcRoot);
			cmd.addParameter("@P_LEVELS", pLevels);
			cmd.addParameter("@P_LEVELS_LIST", pLevelsList);
			cmd.addParameter("@P_SHORT_DESCRIPTION", pShortDescription);
			cmd.addParameter("@P_LONG_DESCRIPTION", pLongDescription);
			cmd.addParameter("@P_ATTRIBUTES_LIST", pAttributesList);
				
			cmd.execute();


		}
		
	
	
	
}
