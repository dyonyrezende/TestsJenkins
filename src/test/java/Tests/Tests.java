package Tests;

import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Tests extends Initializer{

	
	@Test
	public void searchingProduct() {
		
		ExtentTest test = extent.createTest("Pesquisar Produto");
		
		try {
			homepage.searchProduct("Notebook");
			test.log(Status.PASS, "Produto pesquisado com sucesso");
			
		} catch (Exception e) {
			
			test.log(Status.FAIL, "Erro ao pesquisar produto");
			
		}
		
		
	}
	
}
