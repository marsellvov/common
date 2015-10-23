package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gvksasg {
		public static NNumber fCheckfacultyrulesc(NNumber apidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKSASG.F_CHECKFACULTYRULESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@APIDM", apidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCheckifcanassign(NString agsrcparent,NString agsrcchild,NNumber asdefseqnum,NNumber apvacseqnum,NNumber asrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKSASG.F_CHECKIFCANASSIGN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AGSRCPARENT", agsrcparent);
			cmd.addParameter("@AGSRCCHILD", agsrcchild);
			cmd.addParameter("@ASDEFSEQNUM", asdefseqnum);
			cmd.addParameter("@APVACSEQNUM", apvacseqnum);
			cmd.addParameter("@ASRN", asrn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCheckifmustanswer(NNumber asrn,NNumber atemppidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKSASG.F_CHECKIFMUSTANSWER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@ASRN", asrn);
			cmd.addParameter("@ATEMPPIDM", atemppidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCheckstudentrulesc(NNumber apidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKSASG.F_CHECKSTUDENTRULESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@APIDM", apidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
