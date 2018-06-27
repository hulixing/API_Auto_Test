Feature: testsuite
 
 
  Scenario Outline: 登录成功测试（有多个参数）
    Given 输入用户名: <用户名>
      And 输入密码: <密码>
     When 点击登录
     Then 登录成功
 
 
    Examples: 
      | 用户名   | 密码   |
      | name1 | pwd1 |
      | name2 | pwd2 |
