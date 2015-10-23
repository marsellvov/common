package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fokeprt {
		public static NNumber fUserhasfobprofrec(NString userVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKEPRT.F_USERHASFOBPROFREC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@USER_VAR", userVar);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pGetaccessiblefundorgn(Ref<DataCursor> fundlist,Ref<DataCursor> orgnlist,Ref<NString> userprofileind,Ref<NString> masterfundind,Ref<NString> masterorgnind,NString userVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKEPRT.P_GETACCESSIBLEFUNDORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FUNDLIST", DataCursor.class);
			cmd.addParameter("@ORGNLIST", DataCursor.class);
			cmd.addParameter("@USERPROFILEIND", NString.class);
			cmd.addParameter("@MASTERFUNDIND", NString.class);
			cmd.addParameter("@MASTERORGNIND", NString.class);
			cmd.addParameter("@USER_VAR", userVar);
				
			cmd.execute();
			fundlist.val = cmd.getParameterValue("@FUNDLIST", DataCursor.class);
			orgnlist.val = cmd.getParameterValue("@ORGNLIST", DataCursor.class);
			userprofileind.val = cmd.getParameterValue("@USERPROFILEIND", NString.class);
			masterfundind.val = cmd.getParameterValue("@MASTERFUNDIND", NString.class);
			masterorgnind.val = cmd.getParameterValue("@MASTERORGNIND", NString.class);


		}
		
	
	
	
}
