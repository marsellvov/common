package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescxmlAcadrecordExp {
		public static DataCursor fSelectLevels(NNumber pPidmIn,NString pLevlCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADRECORD_EXP.F_SELECT_LEVELS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fTransferCoursesExist(NNumber pPidmIn,NString pLevlCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESCXML_ACADRECORD_EXP.F_TRANSFER_COURSES_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_LEVL_CODE_IN", pLevlCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	@DbRecordType(id="AcademicLevelRow", dataSourceName="ACADEMIC_LEVEL")
	public static class AcademicLevelRow
	{
		@DbRecordField(dataSourceName="LEVL_CODE")
		public NString LevlCode;
	}

	
	
}
