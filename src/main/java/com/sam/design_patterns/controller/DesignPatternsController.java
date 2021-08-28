package com.sam.design_patterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sam.design_patterns.abstractfactory.AbstractFactoryResturantApp;
import com.sam.design_patterns.builder.VaccationPlanner;
import com.sam.design_patterns.chainOfResp.AmazonApp;
import com.sam.design_patterns.chainOfResp.OrderRequest;
import com.sam.design_patterns.chainOfResp.SearchRequest;
import com.sam.design_patterns.chainOfResp2.GamingSystem;
import com.sam.design_patterns.chainOfResp2.Request;
import com.sam.design_patterns.command.RemoteControlClient;
import com.sam.design_patterns.composite.CompositePatternTestApp;
import com.sam.design_patterns.factoryMethod.ResturantApp;
import com.sam.design_patterns.flyweight.LandscapeSoftware;
import com.sam.design_patterns.flyweight.TreeCreationRequest;
import com.sam.design_patterns.interpreter.ExpressionRequest;
import com.sam.design_patterns.interpreter.InterpreterClient;
import com.sam.design_patterns.iterator.IteratorPatternTestApp;
import com.sam.design_patterns.mediator.SmartHouse;
import com.sam.design_patterns.memento.SuperMarioGame;
import com.sam.design_patterns.protectedproxy.ProtectedProxyClient;
import com.sam.design_patterns.prototype.PrototypeClient;
import com.sam.design_patterns.state.MobileApp;
import com.sam.design_patterns.templatemethod.TemplateMethodPatternClient;
import com.sam.design_patterns.virtualproxy.ApplicationClient;
import com.sam.design_patterns.virtualproxy.OnLoadObject;
import com.sam.design_patterns.virtualproxy.ReportDetails;
import com.sam.design_patterns.virtualproxy.ReportGenerator;
import com.sam.design_patterns.visitor.VisitorPatternClient;
import com.sam.design_patterns.proxypatterninspring.ProxyInSpringClient;

@RestController
public class DesignPatternsController {

	@Autowired
	private IteratorPatternTestApp iteratorPatternTestApp;

	@Autowired
	private CompositePatternTestApp compositePatternTestApp;

	@Autowired
	private VaccationPlanner vaccationPlanner;

	@Autowired
	private AmazonApp amazonApp;

	@Autowired
	private GamingSystem gamingSystem;

	@Autowired
	private LandscapeSoftware landscapeSoftware;

	@Autowired
	private SmartHouse smartHouse;

	@Autowired
	private SuperMarioGame superMarioGame;

	@Autowired
	private MobileApp mobileApp;

	@Autowired
	private RemoteControlClient remoteControlClient;

	@Autowired
	private PrototypeClient prototypeClient;

	@Autowired
	private InterpreterClient interpreterClient;
	
	@Autowired
	private ApplicationClient applicationClient;
	
	@Autowired
	private ProtectedProxyClient protectedProxyClient;
	
	@Autowired
	private ProxyInSpringClient proxyInSpringClient;
	
	@Autowired
	private VisitorPatternClient visitorPatternClient;
	
	@Autowired
	private TemplateMethodPatternClient templateMethodPatternClient;
	
	@Autowired
	private ResturantApp resturantApp;
	
	@Autowired
	private AbstractFactoryResturantApp abstractFactoryResturantApp;

	@GetMapping(value = "/test")
	public String test() {
		return "design pattern spring boot app works !";
	}
    //Iterator pattern
	@GetMapping(value = "/printMenu")
	public ResponseEntity<String> testIteratorPattern() {
		iteratorPatternTestApp.testIteratorPattern();
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	//Composite pattern
	@GetMapping(value = "/printAllMenus")
	public ResponseEntity<String> testCompositePattern() {
		compositePatternTestApp.testCompositePattern();
		return new ResponseEntity<String>(HttpStatus.OK);
	}
    
	//Builder pattern
	@GetMapping(value = "/planVacation")
	public ResponseEntity<String> planVacation() {
		vaccationPlanner.planVaccation();
		return new ResponseEntity<String>(HttpStatus.OK);
	}
    
	//Chain of Responsibility pattern
	@PostMapping(value = "/orderProduct")
	public ResponseEntity<String> orderProduct(@RequestBody OrderRequest request) {
		amazonApp.orderProduct(request);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	//Chain of Responsibility pattern
	@PostMapping(value = "/orderProductFromCart")
	public ResponseEntity<String> orderProductFromCart(@RequestBody OrderRequest request) {
		amazonApp.orderProductFromCart(request);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
    
	//Chain of Responsibility pattern
	@PostMapping(value = "/searchProduct")
	public ResponseEntity<String> searchOrder(@RequestBody SearchRequest request) {
		amazonApp.searchProduct(request);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
    
	//Chain of Responsibility pattern approach 2
	@PostMapping(value = "/gamingSystem/sendEmail")
	public ResponseEntity<String> sendEmail(@RequestBody Request request) {
		gamingSystem.handleEmail(request);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
    
	//Flyweight pattern
	@PostMapping(value = "/landscape/plantTrees")
	public ResponseEntity<String> plantTrees(@RequestBody TreeCreationRequest request) {
		landscapeSoftware.plantTree(request);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
    
	//Mediator pattern
	@GetMapping(value = "/smartHouse")
	public ResponseEntity<String> automateSmartHouse(@RequestParam("dayOfWeek") String dayOfWeek) {
		smartHouse.automate(dayOfWeek);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
    
	//Memento pattern
	@PostMapping(value = "/superMario")
	public ResponseEntity<String> superMario(@RequestParam("action") String action) {
		superMarioGame.playSuperMario(action);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
    
	//State pattern
	@PutMapping(value = "/changeMode")
	public ResponseEntity<String> changeMode() {
		mobileApp.changeTheStateOfMobile();
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	//Command pattern
	@PostMapping(value = "/remote/configure")
	public ResponseEntity<String> configure() {
		remoteControlClient.configureRemoteControl();
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
    
	//Command pattern
	@PutMapping(value = "/remote/on")
	public ResponseEntity<String> on(@RequestParam("slot") int slot) {
		remoteControlClient.on(slot);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

	//Command pattern
	@PutMapping(value = "/remote/off")
	public ResponseEntity<String> off(@RequestParam("slot") int slot) {
		remoteControlClient.off(slot);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
    
	//Command pattern
	@PutMapping(value = "/remote/undo")
	public ResponseEntity<String> undo() {
		remoteControlClient.undo();
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
    
	//Prototype pattern
	@PostMapping(value = "/geography")
	public ResponseEntity<String> processShapes() {
		try {
			prototypeClient.process();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
    
	//Interpreter pattern
	@PostMapping(value = "/interpreter/parseExpression")
	public Integer parseExpression(@RequestBody ExpressionRequest request) {
		return interpreterClient.parseExpression(request);
	}
	
	//Proxy pattern(Virtual Proxy)
	@PostMapping(value = "/virtualproxy/Onload")
	@ResponseBody
	public OnLoadObject onload() {
		return applicationClient.onLoad();
	}
	
	//Proxy pattern(Virtual Proxy)
	@PostMapping(value = "/virtualproxy/generateReport")
	@ResponseBody
	public ReportDetails generateReport(@RequestParam("format") String format) {
		return applicationClient.generateComplexReport(format);
	}
	
	//Proxy pattern(Protected Proxy)
	@GetMapping(value = "/protectedproxy/connectToWebsite")
	public ResponseEntity<String> connectToWebsite(@RequestParam("site") String site) {
		protectedProxyClient.connectTo(site);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	//Application of proxy pattern in spring
	@GetMapping(value = "/proxyinspring/sumOfNNumbers")
	public int sumOfNNumbers(@RequestParam("n") int n) {
		return proxyInSpringClient.sumOfNNumbers(n);
	}
	
	//Template method pattern
	@PostMapping(value = "/templatemethod/connectiontemplate/insertData")
	public ResponseEntity<String> insertData(@RequestParam("textFile") String textFile) {
		templateMethodPatternClient.insertData(textFile);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	//Visitor Pattern
	@GetMapping(value = "/visitor/generateHtml")
	public ResponseEntity<String> generateHtml() {
		visitorPatternClient.generateHtml();
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	//Factory method Pattern
	@PostMapping(value = "factorymethod/resturantApp/order")
	public ResponseEntity<String> orderFood(@RequestParam("placeOfOrder") String placeOfOrder,@RequestParam("type") String type,@RequestParam("name") String name) {
		resturantApp.placeOrder(placeOfOrder,type, name);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	//Abstract Factory Pattern
	@PostMapping(value = "abstractfactory/resturantApp/orderCombo")
	public ResponseEntity<String> orderCombo(@RequestParam("comboType") String comboType) {
		abstractFactoryResturantApp.placeOrder(comboType);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

}
