package test.java.cucumber.steps;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
public class StepDefinitionDocStringAndDataTable{
	BaseUtil base;
	
	public StepDefinitionDocStringAndDataTable(BaseUtil base){
		this.base = base;
	}
	
	@When("^User enter his credentials via login$")
	public void user_enter_his_credentials_via_login(DataTable arg1) throws Throwable {
		List<List<String>> a = arg1.raw();
		String total="";
		String temp;
		for (int i = 0; i < a.size();i++){
			temp = "";
			for (int j = 0; j < a.get(i).size();j++){
				if (temp=="")
					temp= a.get(i).get(j);
				else
					temp+= "," + a.get(i).get(j);
			}
			if (total=="")
				total= temp;
			else
				total+= "\n" + temp;
		}
		base.scenario.write(total);
	}

	@Then("^he will be welcomed with a greetings message$")
	public void he_will_be_welcomed_with_a_greetings_message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//base.scenario.write(arg1);
	}
}