package adb.sample.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String helloWord() {
		return "Hello World";
	}
	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String helloWord(@PathVariable("name") String name) {
		return "Hello  " + name;
	}
}
