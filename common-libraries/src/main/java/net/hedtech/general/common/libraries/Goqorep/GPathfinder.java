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


public class GPathfinder extends AbstractSupportCodeObject {
	

	public GPathfinder(ISupportCodeContainer container) {
		super(container);
		
		//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
		//
//					//  1. Create the RG.
//					//  ==================================================================
//					hpathlist = createGroup("FINDER_PATHLIST");
//					hpathvalue = addGroupColumn(hpathlist, "PATH", ValueSetColumn.CHAR_COL, 126);
//					//  2. Add in the Directory of the Current form (if not NULL);
//					//  ==================================================================
//					// F2J_NOT_SUPPORTED : The property "FORM's FILE_NAME" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin17".
//					//			vcpathbuffer = SupportClasses.FORMS40.GetFormProperty(getCurrentTaskName(), SupportClasses.Property.FILE_NAME);
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : The property 'FORM's FILE_NAME' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin17'.");
//					
//					if ( inStr(vcpathbuffer, toStr("\\")).notEquals(0) )
//					{
//						vcpathbuffer = substring(vcpathbuffer, toInt(1), inStr(vcpathbuffer, toStr("\\"), - (1)));
//						//WARNING: only adding rows at the end is supported
//						addGroupRow(hpathlist);
//						possiblepaths = possiblepaths.add(1);
//						setGroupCharCell(hpathvalue, possiblepaths, vcpathbuffer);
//					}
//					//  3. Add in the Forms Path
//					//     Replaced FORMS45_PATH with FORMS60_PATH
//					//  ==================================================================
//					vcpathbuffer = toStr(null);
//					getEnvVar("FORMS60_PATH", vcpathbuffer);
//					if ( !vcpathbuffer.isNull() )
//					{
//						splitpath(vcpathbuffer);
//					}
//					//  see if 5.0 installed
//					//  ==================================================================
//					//  vcpathbuffer := NULL;
//					//  TOOL_ENV.GETVAR('FORMS50_PATH',vcpathbuffer);
//					//  IF vcpathbuffer IS NULL THEN
//					//     TOOL_ENV.GETVAR('FORMS45_PATH',vcpathbuffer);
//					//     IF vcpathbuffer IS NOT NULL THEN
//					//        splitpath(vcpathbuffer);
//					//     END IF;
//					//  END IF;
//					//  4. Add in the ORACLE_PATH
//					//  ==================================================================
//					vcpathbuffer = toStr(null);
//					getEnvVar("ORACLE_PATH", vcpathbuffer);
//					if ( !vcpathbuffer.isNull() )
//					{
//						splitpath(vcpathbuffer);
//					}
//					//  5. Add in the Reports Path
//					//     Replaced REPORTS25_PATH with REPORTS60_PATH
//					//  ==================================================================
//					vcpathbuffer = toStr(null);
//					getEnvVar("REPORTS60_PATH", vcpathbuffer);
//					if ( !vcpathbuffer.isNull() )
//					{
//						splitpath(vcpathbuffer);
//					}
//					//  6. Set the counter and check that each entry has a trailing backslash
//					//  =====================================================================
//					possiblepaths = getGroupRowCount(hpathlist);
//					for ( icount = 1; icount <= possiblepaths; icount+= 1 )
//					{
//						vcpathbuffer = getGroupCharCell(hpathvalue, icount);
//						if ( substring(vcpathbuffer, - (1), toInt(1)).notEquals("\\") )
//						{
//							setGroupCharCell(hpathvalue, icount, vcpathbuffer.append("\\"));
//						}
//					}
		//
					this.getLogger().trace(this, "F2J : GPathfinder Constructor is not completely migrated yet. Please read the Migration Guide.");
					

	}
	
	@Override
	public GoqorepServices getContainer() {
		return (GoqorepServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_PATHFINDER
	/*
	PACKAGE G$_PATHFINDER IS
-- -----------------------------------------------------------
--  Finder is a package that we use to determine all
--  the possible locations of a particular file that
--  Forms will not find on it's own
--
--  E.T   12/07/97
-- -----------------------------------------------------------
-- Public Variables
  possiblepaths PLS_INTEGER := 0;

-- PU's
  FUNCTION getpathstring (pathindex IN PLS_INTEGER) RETURN VARCHAR2;

END;
	*/
	
			//  -----------------------------------------------------------
		//   Finder is a package that we use to determine all
		//   the possible locations of a particular file that
		//   Forms will not find on it's own
		// 
		//   E.T   12/07/97
		//  -----------------------------------------------------------
		//  Public Variables
		public NInteger possiblepaths = toInt(0);

			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_PATHFINDER
		/*
		PACKAGE BODY G$_PATHFINDER IS

-- Private Variables
-- ==================================================================
  hpathlist      RECORDGROUP;
  hpathvalue     GROUPCOLUMN;  
  vcpathbuffer   VARCHAR2(2000);
  icount         PLS_INTEGER;

-- Private PU's
-- ==================================================================
  PROCEDURE splitpath (fullstring IN VARCHAR2);
--
  FUNCTION getpathstring (pathindex IN PLS_INTEGER) RETURN VARCHAR2 IS 
     BEGIN 
       RETURN GET_GROUP_CHAR_CELL(hpathvalue,pathindex);
     END;

  PROCEDURE splitpath (fullstring IN VARCHAR2) IS
     vcfullstring   VARCHAR2(2000);
     ilen           PLS_INTEGER := NVL(LENGTH(fullstring), 0);
     iind           PLS_INTEGER;

  BEGIN 
     IF ilen > 0 THEN 
        vcfullstring := fullstring;
        IF SUBSTR(vcfullstring,-1,1) = ';' THEN 
           vcfullstring := SUBSTR(vcfullstring,1,(ilen - 1));
        END IF;
        LOOP
           iind := INSTR(vcfullstring,';');
           IF iind = 0 THEN  <multilinecomment> Last Entry </multilinecomment>
              IF vcfullstring IS NOT NULL THEN  
                 ADD_GROUP_ROW(hpathlist,END_OF_GROUP);
                 possiblepaths := possiblepaths + 1;
                 SET_GROUP_CHAR_CELL(hpathvalue, possiblepaths,vcfullstring);
              END IF;
              EXIT;
           ELSE
              ADD_GROUP_ROW(hpathlist,END_OF_GROUP);
              possiblepaths := possiblepaths + 1;
              SET_GROUP_CHAR_CELL(hpathvalue, possiblepaths,
                                  SUBSTR(vcfullstring,1,(iind-1)));
              vcfullstring := SUBSTR(vcfullstring,(iind+1));
           END IF; 
        END LOOP;        
     END IF;
  END splitpath;
         

BEGIN

-- 1. Create the RG.
-- ==================================================================
   hpathlist  := CREATE_GROUP('FINDER_PATHLIST');
   hpathvalue := ADD_GROUP_COLUMN(hpathlist,'PATH',CHAR_COLUMN,126);

-- 2. Add in the Directory of the Current form (if not NULL);
-- ==================================================================
   vcpathbuffer := GET_FORM_PROPERTY(NAME_IN('SYSTEM.CURRENT_FORM'),FILE_NAME);
   IF INSTR(vcpathbuffer,'\') <> 0 THEN 
      vcpathbuffer := SUBSTR(vcpathbuffer,1,INSTR(vcpathbuffer,'\',-1));
      ADD_GROUP_ROW(hpathlist,END_OF_GROUP);
      possiblepaths := possiblepaths + 1;
      SET_GROUP_CHAR_CELL(hpathvalue,possiblepaths,vcpathbuffer);
   END IF;

-- 3. Add in the Forms Path
--    Replaced FORMS45_PATH with FORMS60_PATH
-- ==================================================================
   vcpathbuffer := NULL;
   tool_env.getvar('FORMS60_PATH',vcpathbuffer);
   IF vcpathbuffer IS NOT NULL THEN
      splitpath(vcpathbuffer);
   END IF;

-- see if 5.0 installed
-- ==================================================================

-- vcpathbuffer := NULL;
-- TOOL_ENV.GETVAR('FORMS50_PATH',vcpathbuffer);
-- IF vcpathbuffer IS NULL THEN
--    TOOL_ENV.GETVAR('FORMS45_PATH',vcpathbuffer);
--    IF vcpathbuffer IS NOT NULL THEN
--       splitpath(vcpathbuffer);
--    END IF;
-- END IF;


-- 4. Add in the ORACLE_PATH
-- ==================================================================
   vcpathbuffer := NULL;
   tool_env.getvar('ORACLE_PATH',vcpathbuffer);
   IF vcpathbuffer IS NOT NULL THEN
      splitpath(vcpathbuffer);
   END IF;

-- 5. Add in the Reports Path
--    Replaced REPORTS25_PATH with REPORTS60_PATH
-- ==================================================================
   vcpathbuffer := NULL;
   tool_env.getvar('REPORTS60_PATH',vcpathbuffer);
   IF vcpathbuffer IS NOT NULL THEN
      splitpath(vcpathbuffer);
   END IF;

-- 6. Set the counter and check that each entry has a trailing backslash
-- =====================================================================
   possiblepaths := GET_GROUP_ROW_COUNT(hpathlist);
   FOR icount IN 1..possiblepaths LOOP
      vcpathbuffer := GET_GROUP_CHAR_CELL(hpathvalue,icount);
      IF SUBSTR(vcpathbuffer,-1,1) <> '\' THEN 
         SET_GROUP_CHAR_CELL(hpathvalue,icount,vcpathbuffer||'\');
      END IF;
   END LOOP;
END;
		*/
				//  Private Variables
		//  ==================================================================
		private ValueSet hpathlist= null;
		private ValueSetColumn hpathvalue= null;
		private NString vcpathbuffer= NString.getNull();
		private NInteger icount= NInteger.getNull();
/* <p>
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pathindex
		*/
		public NString getpathstring(NInteger pathindex)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getGroupCharCell(hpathvalue, pathindex);
//
			this.getLogger().trace(this, "F2J : getpathstring function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param fullstring
		*/
		public void splitpath(NString fullstring)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString vcfullstring= NString.getNull();
//			NInteger ilen = isNull(length(fullstring), 0);
//			NInteger iind= NInteger.getNull();
//			if ( ilen.greater(0) )
//			{
//				vcfullstring = fullstring;
//				if ( substring(vcfullstring, - (1), toInt(1)).equals(";") )
//				{
//					vcfullstring = substring(vcfullstring, toInt(1), ((ilen.subtract(1))));
//				}
//				while (true) {
//					iind = inStr(vcfullstring, toStr(";"));
//					if ( iind.equals(0) )
//					{
//						//  Last Entry 
//						if ( !vcfullstring.isNull() )
//						{
//							//WARNING: only adding rows at the end is supported
//							addGroupRow(hpathlist);
//							possiblepaths = possiblepaths.add(1);
//							setGroupCharCell(hpathvalue, possiblepaths, vcfullstring);
//						}
//							break;
//					}
//					else {
//						//WARNING: only adding rows at the end is supported
//						addGroupRow(hpathlist);
//						possiblepaths = possiblepaths.add(1);
//						setGroupCharCell(hpathvalue, possiblepaths, substring(vcfullstring, toInt(1), ((iind.subtract(1)))));
//						vcfullstring = substring(vcfullstring, ((iind.add(1))));
//					}
//				}
//			}
//
			this.getLogger().trace(this, "F2J : splitpath procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
	
	
}
