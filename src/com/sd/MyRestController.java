package com.sd;


/*@RestController
@RequestMapping("/myRest")
@Slf4j
public class MyRestController {

	
	@GetMapping(value = "/getDetail" , produces = "application/json",  consumes =  "application/json")
	public ResponseEntity<Employee> fetchEmployeeDetail(@RequestParam("id") Integer id) {
		try {
		return new ResponseEntity(HttpStatus.Ok, myRestService.fetchEmployeeDetail(id));
		} catch(Exception ex) {
			
			
			return new ResponseEntity(HttpStatus.InternalServerError, myRestService.fetchEmployeeDetail(id));
		}
		
	}
	
	*/

public class MyRestController {
	
	
	public static void main (String[] a) {
		System.out.println(" _________" + check("abc","*c"));
		
		
	}
	
	
	public static Boolean check(String source, String wildCards) {
		Boolean isSame = Boolean.FALSE;
		int j=0;
		for (int i = 0; i < source.length() ; i++) {
			if(wildCards.charAt(j) == '*') {
				while (i<source.length() && wildCards.length()>(j+1) &&  wildCards.charAt(j+1) != source.charAt(i) ) {
					i++;
					continue;
				}
				if(i > source.length()) {
					return Boolean.FALSE;
				} else {
					j = j+1;
				}
				
			} else {
				if((wildCards.charAt(j) == '?') || (wildCards.charAt(j) != '?' && wildCards.charAt(j) == source.charAt(i) )) {
					j++;
					continue;
				}else  {
					return Boolean.FALSE;
				}
			}
		}
		if(j == wildCards.length()) {
			isSame = Boolean.TRUE;
		}
		return isSame;
	}
	
}
