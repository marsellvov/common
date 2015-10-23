package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkldst {
		public static void csv(NString pCoas,NString pFund,NString pProgram,NString pGrnt,NString pOrg,NString pActivity,NString pLocn,NString pAtyp,NString pFtyp,NDate pAsofdate,NString pAsofmonth,NString pAsofyear,NString pAccount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKLDST.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_FUND", pFund);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_GRNT", pGrnt);
			cmd.addParameter("@P_ORG", pOrg);
			cmd.addParameter("@P_ACTIVITY", pActivity);
			cmd.addParameter("@P_LOCN", pLocn);
			cmd.addParameter("@P_ATYP", pAtyp);
			cmd.addParameter("@P_FTYP", pFtyp);
			cmd.addParameter("@P_ASOFDATE", pAsofdate);
			cmd.addParameter("@P_ASOFMONTH", pAsofmonth);
			cmd.addParameter("@P_ASOFYEAR", pAsofyear);
			cmd.addParameter("@P_ACCOUNT", pAccount);
				
			cmd.execute();


		}
		
		public static void pDisplabordetails(NString pAccessfrom,NString pProto,NString pShared,NString pCoas,NString pFund,NString pProgram,NString pGrnt,NString pOrg,NString pActivity,NString pLocn,NString pAtyp,NString pFtyp,NString pAsofmonth,NString pAsofyear,NString pAccount,NString pSkiprows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKLDST.P_DISPLABORDETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACCESSFROM", pAccessfrom);
			cmd.addParameter("@P_PROTO", pProto);
			cmd.addParameter("@P_SHARED", pShared);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_FUND", pFund);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_GRNT", pGrnt);
			cmd.addParameter("@P_ORG", pOrg);
			cmd.addParameter("@P_ACTIVITY", pActivity);
			cmd.addParameter("@P_LOCN", pLocn);
			cmd.addParameter("@P_ATYP", pAtyp);
			cmd.addParameter("@P_FTYP", pFtyp);
			cmd.addParameter("@P_ASOFMONTH", pAsofmonth);
			cmd.addParameter("@P_ASOFYEAR", pAsofyear);
			cmd.addParameter("@P_ACCOUNT", pAccount);
			cmd.addParameter("@P_SKIPROWS", pSkiprows);
				
			cmd.execute();


		}
		
	
	
	
}
