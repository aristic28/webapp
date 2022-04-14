package it.engineering.web.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.action.AbstractAction;
import it.engineering.web.constant.WebConstant;
import it.engineering.web.model.Korisnik;
import it.engineering.web.repository.KorisnikRepository;

public class LoginAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		KorisnikRepository korisnikRepository=new KorisnikRepository();
		Korisnik isExist=korisnikRepository.findByUsername(username);
		@SuppressWarnings("unchecked")
		List<Korisnik> ulogovani = (List<Korisnik>) request.getServletContext().getAttribute("login_users");
		
		
		if(isExist!=null) {	
		if(ulogovani.contains(isExist)) {
			return WebConstant.PAGE_ERROR;
		}
		ulogovani.add(isExist);
		return WebConstant.PAGE_LOGIN;
	}
		else {
			return WebConstant.PAGE_INDEX;
		}
	
	}

}
