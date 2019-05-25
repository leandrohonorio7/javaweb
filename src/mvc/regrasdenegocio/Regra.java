package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Regra {

	String execute(HttpServletRequest requeste, HttpServletResponse response) throws Exception;
}
