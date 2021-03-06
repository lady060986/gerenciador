package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;


public class Login implements Tarefa {

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) {
		String email=request.getParameter("email");
		String senha=request.getParameter("senha");
		Usuario usuario= new UsuarioDAO().buscaPorEmailESenha(email, senha);
		HttpSession session=request.getSession();
		session.setAttribute("usuarioLogado", usuario);
			
		return "/WEB-INF/paginas/login.jsp";
	}

}
