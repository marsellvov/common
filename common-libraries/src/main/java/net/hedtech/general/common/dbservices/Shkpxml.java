package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkpxml {
		public static NString fBannerToXmlValue(NString xlblCode,NString bannerValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXML.F_BANNER_TO_XML_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@XLBL_CODE", xlblCode);
			cmd.addParameter("@BANNER_VALUE", bannerValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDomesticAddr(NString natnCode,NString jobName,NString domAddrNatnCodeParmNbr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXML.F_DOMESTIC_ADDR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NATN_CODE", natnCode);
			cmd.addParameter("@JOB_NAME", jobName);
			cmd.addParameter("@DOM_ADDR_NATN_CODE_PARM_NBR", domAddrNatnCodeParmNbr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fXmlValueToBanner(NString xlblCode,NString ediValue,NString ediQlfr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPXML.F_XML_VALUE_TO_BANNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@XLBL_CODE", xlblCode);
			cmd.addParameter("@EDI_VALUE", ediValue);
			cmd.addParameter("@EDI_QLFR", ediQlfr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
