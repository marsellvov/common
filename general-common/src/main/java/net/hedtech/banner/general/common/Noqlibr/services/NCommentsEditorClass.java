package net.hedtech.banner.general.common.Noqlibr.services;

import static morphis.foundations.core.appsupportlib.runtime.ItemServices.goItem;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.editTextitem;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.executeAction;
import net.hedtech.banner.general.common.Noqlibr.NoqlibrTaskPart;
import net.hedtech.banner.general.common.Noqlibr.model.NoqlibrModel;
import morphis.foundations.core.appsupportlib.runtime.AbstractSupportCodeObject;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.types.NString;

public class NCommentsEditorClass extends AbstractSupportCodeObject {

	public NCommentsEditorClass(ISupportCodeContainer container){
		super(container);
	}
	
	@Override
	public NoqlibrTaskPart getContainer(){
		return (NoqlibrTaskPart)super.getContainer();
	}
	
	public NoqlibrModel getFormModel(){
		return this.getContainer().getModel();
	}
	
	/* Original PL/SQL code for Prog Unit N$_OPEN_COMMENTS_EDITOR
	
	PROCEDURE N$_OPEN_COMMENTS_EDITOR (comments_item IN VARCHAR2) IS
BEGIN
  GO_ITEM(comments_item);
  EXECUTE_TRIGGER('KEY-EDIT');
END;
	*/
	//ID:514
	/* <p>
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param commentsItem
		*/
		public void nOpenCommentsEditor(NString commentsItem)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.

			goItem(commentsItem);
			executeAction("KEY-EDIT");			
		}
		
		/* Original PL/SQL code code for TRIGGER N$_COMMENTS_EDITOR_CLASS.KEY-EDIT
		 DECLARE
 ed_ok           BOOLEAN;
 comment_out     VARCHAR2(2000);
 comment_in		  VARCHAR2(2000);
BEGIN
	 comment_in := NAME_IN(NAME_IN('SYSTEM.CURSOR_ITEM'));
  SHOW_EDITOR('N$_COMMENTS_EDITOR',comment_in,30,32,comment_out,ed_ok);
-- User accepts the change from the editor window by clicking on the OK button
  IF ed_ok THEN
 	  COPY(comment_out, NAME_IN('SYSTEM.CURSOR_ITEM'));
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * N$_COMMENTS_EDITOR_CLASS.KEY-EDIT
		 *
		 *
		 *</p>
		*/
		
		public void keyEdit()
		{
			editTextitem();							
		}	
}
