package com.kook.spjpj.command;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.kook.spjpj.dao.Dao;
import com.kook.spjpj.util.Constant;

public class BDeleteCommand implements ICommand {

	@Override
	public void execute(Model model, HttpServletRequest request) {
		Dao dao = Constant.dao;
		
		String bid = request.getParameter("bId");
		
		dao.delete(bid);

	}

}
