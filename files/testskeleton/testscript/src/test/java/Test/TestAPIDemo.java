package Test;

import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.logging.LogEntry;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import java.util.logging.Level;

public class TestAPIDemo extends BaseTestClass {

	 @Test
	 public void test_01() {

		 //Main page 의 화면 구성요소들을 얻는다. 
	     List<MobileElement> list = mainPage.getScreenElements();
	     
	     //얻어온 화면 구성요소가 Main page의 구성요소가 맞는지 확인한다. 
	     Assert.assertTrue(mainPage.isMainScreen(list));
	     
	 }
	 
	 @Test
	 public void test_02() {

		 //Accessibility 구성요소를 얻는다. 
		 MobileElement accessibility = mainPage.getAccessibility();
		 
		 //Null 이 아닌지 확인한다.
		 Assert.assertNotNull(accessibility);
		 
		 //Accessibility 구성요소를 클릭한다.
		 mainPage.click(accessibility);
		 
		 // 화면 전환하는 속도를 고려해 딜레이를 준다. 
		 waitfor(NEEDS_SWITCH_SCREEN_DELAY);
		 
		 //Accessibility 화면 구성요소를 얻는다.
		 List<MobileElement> list = accessibilityPage.getScreenElements();
		 
		 //얻어온 화면 구성요소가 Accessibility page의 구성요소가 맞는지 확인한다. 
	     Assert.assertTrue(accessibilityPage.isAccessibilityScreen(list));
	     
	 }
	 
	 //@Test
	 public void test_03() { //scroll

		 //이전 페이지로 돌아간다.(Main)
		 
		 //Main Page에서 Graphics에 대한 레퍼런스를 얻어온다.  
		 
		 //Null 이 아닌지 확인한다.
		 
		 //Graphics 구성요소를 클릭한다.
		 
		 // 화면 전환하는 속도를 고려해 딜레이를 준다. 
	     
	     //scroll up
	     for(int i = 0; i < 5 ; ++ i){
	    	 //화면 사이즈를 얻어온다. 
	         	
	         //가로 화면 중앙 좌표 
	        	
	         //세로 화면 상단 80% 지점 좌표 
	        	
	         //세로 화면 상단 20% 지점 좌표 
	        	
	         //스크롤 

	         //화면 전환하는 속도를 고려해 딜레이를 준다
	     }
	     
	     // scroll down
	     for(int i = 0; i < 5 ; ++ i){
	    	//화면 사이즈를 얻어온다.
	    	
	    	//가로 화면 중앙 좌표 
	        
	        //세로 화면 하단 25% 지점 좌표 
	        
	        //세로 화면 상단 90% 지점 좌표 
	        
	        //스크롤 
	        
	        //화면 전환하는 속도를 고려해 딜레이를 준다

	     }
	     	     
	
	 }
	
}
