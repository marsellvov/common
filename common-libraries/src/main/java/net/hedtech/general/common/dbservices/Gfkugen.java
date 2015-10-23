package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gfkugen {
		public static NString FgetNls(NString pMsgIdInC,NString pMsgTypeInC,NString pMsgTxtInC,NString var01C,NString var02C,NString var03C,NString var04C,NString var05C,NString var06C,NString var07C,NString var08C,NString var09C,NString var10C,NString var11C,NString var12C,NString var13C,NString var14C,NString var15C,NString var16C,NString var17C,NString var18C,NString var19C,NString var20C,NString var21C,NString var22C,NString var23C,NString var24C,NString var25C,NString var26C,NString var27C,NString var28C,NString var29C,NString var30C,NString var31C,NString var32C) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GFKUGEN.GET_NLS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MSG_ID_IN_C", pMsgIdInC);
			cmd.addParameter("@P_MSG_TYPE_IN_C", pMsgTypeInC);
			cmd.addParameter("@P_MSG_TXT_IN_C", pMsgTxtInC);
			cmd.addParameter("@VAR01_C", var01C);
			cmd.addParameter("@VAR02_C", var02C);
			cmd.addParameter("@VAR03_C", var03C);
			cmd.addParameter("@VAR04_C", var04C);
			cmd.addParameter("@VAR05_C", var05C);
			cmd.addParameter("@VAR06_C", var06C);
			cmd.addParameter("@VAR07_C", var07C);
			cmd.addParameter("@VAR08_C", var08C);
			cmd.addParameter("@VAR09_C", var09C);
			cmd.addParameter("@VAR10_C", var10C);
			cmd.addParameter("@VAR11_C", var11C);
			cmd.addParameter("@VAR12_C", var12C);
			cmd.addParameter("@VAR13_C", var13C);
			cmd.addParameter("@VAR14_C", var14C);
			cmd.addParameter("@VAR15_C", var15C);
			cmd.addParameter("@VAR16_C", var16C);
			cmd.addParameter("@VAR17_C", var17C);
			cmd.addParameter("@VAR18_C", var18C);
			cmd.addParameter("@VAR19_C", var19C);
			cmd.addParameter("@VAR20_C", var20C);
			cmd.addParameter("@VAR21_C", var21C);
			cmd.addParameter("@VAR22_C", var22C);
			cmd.addParameter("@VAR23_C", var23C);
			cmd.addParameter("@VAR24_C", var24C);
			cmd.addParameter("@VAR25_C", var25C);
			cmd.addParameter("@VAR26_C", var26C);
			cmd.addParameter("@VAR27_C", var27C);
			cmd.addParameter("@VAR28_C", var28C);
			cmd.addParameter("@VAR29_C", var29C);
			cmd.addParameter("@VAR30_C", var30C);
			cmd.addParameter("@VAR31_C", var31C);
			cmd.addParameter("@VAR32_C", var32C);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
