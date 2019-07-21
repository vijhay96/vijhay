package automationpractice1;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationpractice.MainPage;
import automationpractice.StoreObjects;

public class StoreScripts extends MainPage {
 
StoreObjects dresses;
  MainPage mp;
 
 public StoreScripts() {
 mp= new MainPage();
 dresses= new StoreObjects();
 }
 
 @Test 
public void verifydressestab() {
dresses.clickdresses();
Assert.assertTrue(mp.getTitlte().equals("Dresses - My Store"));

}
 @Test 
 public void verifycasualdressestab() {
 dresses.clickdresses();
 dresses.clickcasualdresses();
 Assert.assertTrue(mp.getTitlte().equals("Casual Dresses - My Store"));
 }
 @Test
 public void verifysize() {
	 Assert.assertTrue(mp.elementFound(dresses.getSmall()));
	 Assert.assertTrue(mp.elementFound(dresses.getMedium()));
	 Assert.assertTrue(mp.elementFound(dresses.getLarge()));
 }
 
 @Test
 public void verifyproductcount() {
	int totalnum= dresses.getHeadcount() ;
	int produccount= dresses.getproductcount();
	Assert.assertTrue(totalnum==produccount);
	
 }
}