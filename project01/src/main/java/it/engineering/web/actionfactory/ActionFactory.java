package it.engineering.web.actionfactory;

import it.engineering.web.action.AbstractAction;
import it.engineering.web.action.LoginAction;
import it.engineering.web.constant.WebConstant;

public class ActionFactory {

	public static AbstractAction createAction(String method, String path) {
		AbstractAction action = null;
		
		switch(path) {
		case WebConstant.PATH_LOGIN:
			action=new LoginAction();
			break;
		default:
			break;
		}
		
		return action;
	}
}
