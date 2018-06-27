package commonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class TodoStep {
    @Given("^输入用户名: (\\w+)$")
    public void 输入用户名(String 用户名)  {
        System.out.println(用户名);
    }
    
    @Given("^输入密码: (\\w+)$")
    public void 输入密码(String 密码)  {
        System.out.println(密码);
    }
    
    @When("^点击登录$")
    public void 点击登陆()  {
        System.out.println("登陆中……");
    }
    
    @Then("^登录成功$")
    public void 登录成功()  {
        System.out.println("登录成功");
    }
    
    @Then("^登录失败$")
    public void 登录失败() throws Exception  {
        throw new Exception("登录失败");
    }
}
