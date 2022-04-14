package it.engineering.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.constant.WebConstant;
import it.engineering.web.model.Proizvodjac;
import it.engineering.web.repository.ProizvodjacRepository;

public class ListManufacturers extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ProizvodjacRepository proizvodjacRepository=new ProizvodjacRepository();
		
		List<Proizvodjac> manufacturers=proizvodjacRepository.getAll();
		
		request.setAttribute("manufacturers", manufacturers);
		
		return WebConstant.PAGE_ALLMANUFACTURERS;
	}

}
