package net.hedtech.general.common.libraries.Goqorep;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;


public class GReportSecurity extends AbstractSupportCodeObject {
	

	public GReportSecurity(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqorepServices getContainer() {
		return (GoqorepServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_REPORT_SECURITY
	/*
	PACKAGE G$_REPORT_SECURITY IS
  PROCEDURE G$_REPORT_VERIFY_ACCESS( OBJECT VARCHAR2, VERSION VARCHAR2 );
  PROCEDURE G$_REPORT_REVOKE_ACCESS;
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_REPORT_SECURITY
		/*
		PACKAGE BODY G$_REPORT_SECURITY IS
  PROCEDURE G$_REPORT_VERIFY_ACCESS( OBJECT VARCHAR2, VERSION VARCHAR2 ) IS
  
  HOLD_CMD               VARCHAR2(240);
  OBJ                    ORA_JAVA.JOBJECT; 
  PASSWORD               VARCHAR2(30);
  PASSWORD1              VARCHAR2(30);
  ROLE_NAME              VARCHAR2(30);
--
-- Number variables.
--
  SEED1                  NUMBER ;
  SEED3                  NUMBER ;
  
 BEGIN
 		
	 OBJ := BannerID.new();	
	 SEED1 := BannerID.getSEED1( obj );
	 SEED3 := BannerID.getSEED3( obj );
	
-- Obtain encrypted password.
--
   G$_SECURITY.G$_VERIFY_PASSWORD1_PRD(OBJECT, VERSION, PASSWORD, ROLE_NAME); 
--
--
-- If security is turned off, quit.
--
  IF PASSWORD = 'INSECURED' THEN
     RETURN;
  END IF;
--
--
-- Call for second phase processing.
--
  PASSWORD1 := G$_SECURITY.G$_DECRYPT_FNC(PASSWORD, SEED3);
  PASSWORD := PASSWORD1;
--
-- Call for third phase processing.
--
  G$_SECURITY.G$_VERIFY_PASSWORD1_PRD(OBJECT, VERSION, PASSWORD, ROLE_NAME); 
--
-- Call for fourth phase processing.
--
  PASSWORD1 := G$_SECURITY.G$_DECRYPT_FNC(PASSWORD, SEED1);
  PASSWORD := '"' || PASSWORD1 || '"';
--
-- Invoke needed role.
--
  HOLD_CMD := ROLE_NAME || ' IDENTIFIED BY ' || PASSWORD; 
  DO_EXEC_SQL('SET ROLE ' || HOLD_CMD);


END G$_REPORT_VERIFY_ACCESS;
--
--
PROCEDURE G$_REPORT_REVOKE_ACCESS IS
 BEGIN
  IF G$_SECURITY.G$_CHECK_SECURITY_FNC THEN
        DO_EXEC_SQL('SET ROLE NONE');
  END IF;
 END G$_REPORT_REVOKE_ACCESS;
END;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param _object
		* @param version
		*/
		public void gReportVerifyAccess(NString _object, NString version)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString holdCmd= NString.getNull();
//			UnknownTypes.OraJavaJobject obj= null;
//			NString password= NString.getNull();
//			NString password1= NString.getNull();
//			NString roleName= NString.getNull();
//			// 
//			//  Number variables.
//			// 
//			NNumber seed1= NNumber.getNull();
//			NNumber seed3= NNumber.getNull();
//			obj = Bannerid._new;
//			seed1 = toNumber(getContainer().getBannerid().getseed1(obj));
//			seed3 = toNumber(getContainer().getBannerid().getseed3(obj));
//			//  Obtain encrypted password.
//			// 
//			GSecurity.gVerifyPassword1Prd(_object, version, password, roleName);
//			// 
//			// 
//			//  If security is turned off, quit.
//			// 
//			if ( password.equals("INSECURED") )
//			{
//				return ;
//			}
//			// 
//			// 
//			//  Call for second phase processing.
//			// 
//			password1 = GSecurity.gDecryptFnc(password, seed3);
//			password = password1;
//			// 
//			//  Call for third phase processing.
//			// 
//			GSecurity.gVerifyPassword1Prd(_object, version, password, roleName);
//			// 
//			//  Call for fourth phase processing.
//			// 
//			password1 = GSecurity.gDecryptFnc(password, seed1);
//			password = toStr("\"").append(password1).append("\"");
//			// 
//			//  Invoke needed role.
//			// 
//			holdCmd = roleName.append(" IDENTIFIED BY ").append(password);
//			getContainer().doExecSql(toStr("SET ROLE ").append(holdCmd));
//
			this.getLogger().trace(this, "F2J : gReportVerifyAccess procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gReportRevokeAccess()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( GSecurity.gCheckSecurityFnc() )
//			{
//				getContainer().doExecSql(toStr("SET ROLE NONE"));
//			}
//
			this.getLogger().trace(this, "F2J : gReportRevokeAccess procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
