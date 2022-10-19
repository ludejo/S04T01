package cat.itacademy.barcelonactiva.grieraartigas.oriol.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
	
	//@GetMapping("/HelloWorld")
	@RequestMapping(value = "/HelloWorld", method = RequestMethod.GET)
	public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
		return "Hola, " + nom + ". Est�s executant un projecte Gradle";
	}
	
	@GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
	public String saluda2(@PathVariable(required = false) String nom) {
		String ret;
		if (nom != null) {
			ret = "Hola, " + nom + ". Est�s executant un projecte Gradle";
		} else {
			ret = "Hola desconegut. Est�s executant un projecte Gradle";
		}
		return ret;
	}
}