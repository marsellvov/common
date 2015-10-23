package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwaksrch {
		public static void pCheckrecords(NNumber pidm,NString nextUrl,NString classYrFrom,NString classYrTo,NString surnamePrefix,NString lastName,NString firstName,NString mi,NString collCode,NString soundexInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKSRCH.P_CHECKRECORDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@NEXT_URL", nextUrl);
			cmd.addParameter("@CLASS_YR_FROM", classYrFrom);
			cmd.addParameter("@CLASS_YR_TO", classYrTo);
			cmd.addParameter("@SURNAME_PREFIX", surnamePrefix);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@MI", mi);
			cmd.addParameter("@COLL_CODE", collCode);
			cmd.addParameter("@SOUNDEX_IND", soundexInd);
				
			cmd.execute();


		}
		
		public static void pClasssearch() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKSRCH.P_CLASSSEARCH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetitemrules(NNumber pidm,NString diroCode,NString dispProfileInd,NString updProfileInd,NString nonProfileDefInd,Ref<NString> description,Ref<NBool> displayed,Ref<NBool> _checked,Ref<NBool> changeable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKSRCH.P_GETITEMRULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DIRO_CODE", diroCode);
			cmd.addParameter("@DISP_PROFILE_IND", dispProfileInd);
			cmd.addParameter("@UPD_PROFILE_IND", updProfileInd);
			cmd.addParameter("@NON_PROFILE_DEF_IND", nonProfileDefInd);
			cmd.addParameter("@DESCRIPTION", NString.class);
			cmd.addParameter("@DISPLAYED", NBool.class);
			cmd.addParameter("@CHECKED", NBool.class);
			cmd.addParameter("@CHANGEABLE", NBool.class);
				
			cmd.execute();
			description.val = cmd.getParameterValue("@DESCRIPTION", NString.class);
			displayed.val = cmd.getParameterValue("@DISPLAYED", NBool.class);
			_checked.val = cmd.getParameterValue("@CHECKED", NBool.class);
			changeable.val = cmd.getParameterValue("@CHANGEABLE", NBool.class);


		}
		
		public static void pNextsearchresults(NString moreBtn,NString classYrFrom,NString classYrTo,NString surnamePrefix,NString lastName,NString firstName,NString mi,NString collCode,NString soundexInd,NNumber howMany,NString callingPage,NNumber nextSetStart,NNumber prevSetStart) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKSRCH.P_NEXTSEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MORE_BTN", moreBtn);
			cmd.addParameter("@CLASS_YR_FROM", classYrFrom);
			cmd.addParameter("@CLASS_YR_TO", classYrTo);
			cmd.addParameter("@SURNAME_PREFIX", surnamePrefix);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@MI", mi);
			cmd.addParameter("@COLL_CODE", collCode);
			cmd.addParameter("@SOUNDEX_IND", soundexInd);
			cmd.addParameter("@HOW_MANY", howMany);
			cmd.addParameter("@CALLING_PAGE", callingPage);
			cmd.addParameter("@NEXT_SET_START", nextSetStart);
			cmd.addParameter("@PREV_SET_START", prevSetStart);
				
			cmd.execute();


		}
		
		public static void pSearchresults(NString classYrFrom,NString classYrTo,NString surnamePrefix,NString lastName,NString firstName,NString mi,NString collCode,NString soundexInd,NNumber howMany,NString callingPage,NString moreBtn,NNumber nextSetStart,NNumber prevSetStart) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKSRCH.P_SEARCHRESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CLASS_YR_FROM", classYrFrom);
			cmd.addParameter("@CLASS_YR_TO", classYrTo);
			cmd.addParameter("@SURNAME_PREFIX", surnamePrefix);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@MI", mi);
			cmd.addParameter("@COLL_CODE", collCode);
			cmd.addParameter("@SOUNDEX_IND", soundexInd);
			cmd.addParameter("@HOW_MANY", howMany);
			cmd.addParameter("@CALLING_PAGE", callingPage);
			cmd.addParameter("@MORE_BTN", moreBtn);
			cmd.addParameter("@NEXT_SET_START", nextSetStart);
			cmd.addParameter("@PREV_SET_START", prevSetStart);
				
			cmd.execute();


		}
		
	
	
	
}
