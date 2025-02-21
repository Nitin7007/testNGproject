package Test;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  



public class day3 {
	
	@Test
	public void login() {
		
		List<Integer> values = Arrays.asList(4,3,6,4,7,2,1,8,8);
		
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(0));
		
		
	
		
	}

}
